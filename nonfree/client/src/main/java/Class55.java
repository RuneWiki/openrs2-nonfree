import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dw")
public final class Class55 {

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "[Lclient!bb;")
	private final Class17[] aClass17Array1 = new Class17[10];

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "I")
	private int anInt1926;

	@OriginalMember(owner = "client!dw", name = "c", descriptor = "I")
	private int anInt1927;

	@OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(Lclient!tl;)V")
	public Class55(@OriginalArg(0) Class4_Sub30 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method4864();
			if (local12 != 0) {
				arg0.anInt6244--;
				this.aClass17Array1[local7] = new Class17();
				this.aClass17Array1[local7].method521(arg0);
			}
		}
		this.anInt1926 = arg0.method4877();
		this.anInt1927 = arg0.method4877();
	}

	@OriginalMember(owner = "client!dw", name = "<init>", descriptor = "()V")
	private Class55() {
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "()[B")
	private byte[] method1451() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass17Array1[local3] != null && this.aClass17Array1[local3].anInt661 + this.aClass17Array1[local3].anInt658 > local1) {
				local1 = this.aClass17Array1[local3].anInt661 + this.aClass17Array1[local3].anInt658;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass17Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass17Array1[local54].anInt661 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass17Array1[local54].anInt658 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass17Array1[local54].method520(local70, this.aClass17Array1[local54].anInt661);
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

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "()Lclient!uq;")
	public Class4_Sub35_Sub1 method1452() {
		@Pc(2) byte[] local2 = this.method1451();
		return new Class4_Sub35_Sub1(22050, local2, this.anInt1926 * 22050 / 1000, this.anInt1927 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!dw", name = "c", descriptor = "()I")
	public int method1454() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass17Array1[local3] != null && this.aClass17Array1[local3].anInt658 / 20 < local1) {
				local1 = this.aClass17Array1[local3].anInt658 / 20;
			}
		}
		if (this.anInt1926 < this.anInt1927 && this.anInt1926 / 20 < local1) {
			local1 = this.anInt1926 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass17Array1[local55] != null) {
				this.aClass17Array1[local55].anInt658 -= local1 * 20;
			}
		}
		if (this.anInt1926 < this.anInt1927) {
			this.anInt1926 -= local1 * 20;
			this.anInt1927 -= local1 * 20;
		}
		return local1;
	}
}
