import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hq")
public final class Class109 {

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "[Lclient!ee;")
	private final Class63[] aClass63Array1 = new Class63[10];

	@OriginalMember(owner = "client!hq", name = "c", descriptor = "I")
	private int anInt2700;

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "I")
	private int anInt2699;

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lclient!ha;)V")
	public Class109(@OriginalArg(0) Class6_Sub15 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method3111();
			if (local12 != 0) {
				arg0.anInt3487--;
				this.aClass63Array1[local7] = new Class63();
				this.aClass63Array1[local7].method1527(arg0);
			}
		}
		this.anInt2700 = arg0.method3108();
		this.anInt2699 = arg0.method3108();
	}

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "()V")
	private Class109() {
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "()Lclient!gu;")
	public Class6_Sub4_Sub1 method2474() {
		@Pc(2) byte[] local2 = this.method2476();
		return new Class6_Sub4_Sub1(22050, local2, this.anInt2700 * 22050 / 1000, this.anInt2699 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "()I")
	public int method2475() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass63Array1[local3] != null && this.aClass63Array1[local3].anInt1640 / 20 < local1) {
				local1 = this.aClass63Array1[local3].anInt1640 / 20;
			}
		}
		if (this.anInt2700 < this.anInt2699 && this.anInt2700 / 20 < local1) {
			local1 = this.anInt2700 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass63Array1[local55] != null) {
				this.aClass63Array1[local55].anInt1640 -= local1 * 20;
			}
		}
		if (this.anInt2700 < this.anInt2699) {
			this.anInt2700 -= local1 * 20;
			this.anInt2699 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!hq", name = "c", descriptor = "()[B")
	private byte[] method2476() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass63Array1[local3] != null && this.aClass63Array1[local3].anInt1637 + this.aClass63Array1[local3].anInt1640 > local1) {
				local1 = this.aClass63Array1[local3].anInt1637 + this.aClass63Array1[local3].anInt1640;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass63Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass63Array1[local54].anInt1637 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass63Array1[local54].anInt1640 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass63Array1[local54].method1528(local70, this.aClass63Array1[local54].anInt1637);
				for (@Pc(94) int local94 = 0; local94 < local70; local94++) {
					@Pc(107) int local107 = local52[local94 + local80] + (local92[local94] >> 8);
					if ((local107 + 128 & 0xFFFFFF00) != 0) {
						local107 = local107 >> 31 ^ 0x7F;
					}
					local52[local94 + local80] = (byte) local107;
				}
			}
		}
		return local52;
	}
}
