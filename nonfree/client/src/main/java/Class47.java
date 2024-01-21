import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class47 {

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "[Lclient!se;")
	private final Class73[] aClass73Array1 = new Class73[10];

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
	private int anInt2931;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
	private int anInt2930;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(Lclient!fa;)V")
	public Class47(@OriginalArg(0) Class1_Sub9 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method1234();
			if (local12 != 0) {
				arg0.anInt1592--;
				this.aClass73Array1[local7] = new Class73();
				this.aClass73Array1[local7].method3078(arg0);
			}
		}
		this.anInt2931 = arg0.method1280();
		this.anInt2930 = arg0.method1280();
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "()[B")
	private byte[] method2175() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass73Array1[local3] != null && this.aClass73Array1[local3].anInt4034 + this.aClass73Array1[local3].anInt4033 > local1) {
				local1 = this.aClass73Array1[local3].anInt4034 + this.aClass73Array1[local3].anInt4033;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass73Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass73Array1[local54].anInt4034 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass73Array1[local54].anInt4033 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass73Array1[local54].method3080(local70, this.aClass73Array1[local54].anInt4034);
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

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "()Lclient!qe;")
	public Class1_Sub20_Sub1 method2176() {
		@Pc(2) byte[] local2 = this.method2175();
		return new Class1_Sub20_Sub1(22050, local2, this.anInt2931 * 22050 / 1000, this.anInt2930 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "()I")
	public int method2177() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass73Array1[local3] != null && this.aClass73Array1[local3].anInt4033 / 20 < local1) {
				local1 = this.aClass73Array1[local3].anInt4033 / 20;
			}
		}
		if (this.anInt2931 < this.anInt2930 && this.anInt2931 / 20 < local1) {
			local1 = this.anInt2931 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass73Array1[local55] != null) {
				this.aClass73Array1[local55].anInt4033 -= local1 * 20;
			}
		}
		if (this.anInt2931 < this.anInt2930) {
			this.anInt2931 -= local1 * 20;
			this.anInt2930 -= local1 * 20;
		}
		return local1;
	}
}
