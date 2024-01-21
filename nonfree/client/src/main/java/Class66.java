import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class66 {

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "[Lclient!ra;")
	private final Class62[] aClass62Array1 = new Class62[10];

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
	private int anInt2489;

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
	private int anInt2490;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Lclient!na;)V")
	public Class66(@OriginalArg(0) Class2_Sub9 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method640();
			if (local12 != 0) {
				arg0.anInt976--;
				this.aClass62Array1[local7] = new Class62();
				this.aClass62Array1[local7].method1772(arg0);
			}
		}
		this.anInt2489 = arg0.method632();
		this.anInt2490 = arg0.method632();
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "()[B")
	private byte[] method1804() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass62Array1[local3] != null && this.aClass62Array1[local3].anInt2448 + this.aClass62Array1[local3].anInt2445 > local1) {
				local1 = this.aClass62Array1[local3].anInt2448 + this.aClass62Array1[local3].anInt2445;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass62Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass62Array1[local54].anInt2448 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass62Array1[local54].anInt2445 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass62Array1[local54].method1774(local70, this.aClass62Array1[local54].anInt2448);
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

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "()I")
	public int method1805() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass62Array1[local3] != null && this.aClass62Array1[local3].anInt2445 / 20 < local1) {
				local1 = this.aClass62Array1[local3].anInt2445 / 20;
			}
		}
		if (this.anInt2489 < this.anInt2490 && this.anInt2489 / 20 < local1) {
			local1 = this.anInt2489 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass62Array1[local55] != null) {
				this.aClass62Array1[local55].anInt2445 -= local1 * 20;
			}
		}
		if (this.anInt2489 < this.anInt2490) {
			this.anInt2489 -= local1 * 20;
			this.anInt2490 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "()Lclient!s;")
	public Class2_Sub4_Sub1 method1807() {
		@Pc(2) byte[] local2 = this.method1804();
		return new Class2_Sub4_Sub1(22050, local2, this.anInt2489 * 22050 / 1000, this.anInt2490 * 22050 / 1000);
	}
}
