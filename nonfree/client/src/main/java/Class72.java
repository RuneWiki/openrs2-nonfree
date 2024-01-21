import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public final class Class72 {

	@OriginalMember(owner = "client!t", name = "c", descriptor = "[Lclient!qa;")
	private final Class63[] aClass63Array1 = new Class63[10];

	@OriginalMember(owner = "client!t", name = "b", descriptor = "I")
	private int anInt2438;

	@OriginalMember(owner = "client!t", name = "a", descriptor = "I")
	private int anInt2437;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lclient!ob;)V")
	public Class72(@OriginalArg(0) Class3_Sub7 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method647();
			if (local12 != 0) {
				arg0.anInt964--;
				this.aClass63Array1[local7] = new Class63();
				this.aClass63Array1[local7].method1530(arg0);
			}
		}
		this.anInt2438 = arg0.method602();
		this.anInt2437 = arg0.method602();
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "()Lclient!tc;")
	public Class3_Sub2_Sub1 method1703() {
		@Pc(2) byte[] local2 = this.method1704();
		return new Class3_Sub2_Sub1(22050, local2, this.anInt2438 * 22050 / 1000, this.anInt2437 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "()[B")
	private byte[] method1704() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass63Array1[local3] != null && this.aClass63Array1[local3].anInt2206 + this.aClass63Array1[local3].anInt2208 > local1) {
				local1 = this.aClass63Array1[local3].anInt2206 + this.aClass63Array1[local3].anInt2208;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass63Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass63Array1[local54].anInt2206 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass63Array1[local54].anInt2208 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass63Array1[local54].method1533(local70, this.aClass63Array1[local54].anInt2206);
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

	@OriginalMember(owner = "client!t", name = "c", descriptor = "()I")
	public int method1706() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass63Array1[local3] != null && this.aClass63Array1[local3].anInt2208 / 20 < local1) {
				local1 = this.aClass63Array1[local3].anInt2208 / 20;
			}
		}
		if (this.anInt2438 < this.anInt2437 && this.anInt2438 / 20 < local1) {
			local1 = this.anInt2438 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass63Array1[local55] != null) {
				this.aClass63Array1[local55].anInt2208 -= local1 * 20;
			}
		}
		if (this.anInt2438 < this.anInt2437) {
			this.anInt2438 -= local1 * 20;
			this.anInt2437 -= local1 * 20;
		}
		return local1;
	}
}
