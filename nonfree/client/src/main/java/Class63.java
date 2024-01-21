import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class63 {

	@OriginalMember(owner = "client!re", name = "b", descriptor = "[Lclient!sb;")
	private final Class66[] aClass66Array1 = new Class66[10];

	@OriginalMember(owner = "client!re", name = "a", descriptor = "I")
	private int anInt2971;

	@OriginalMember(owner = "client!re", name = "c", descriptor = "I")
	private int anInt2972;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lclient!la;)V")
	public Class63(@OriginalArg(0) Class3_Sub12 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method1936();
			if (local12 != 0) {
				arg0.anInt2886--;
				this.aClass66Array1[local7] = new Class66();
				this.aClass66Array1[local7].method2028(arg0);
			}
		}
		this.anInt2971 = arg0.method1963();
		this.anInt2972 = arg0.method1963();
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "()[B")
	private byte[] method1997() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass66Array1[local3] != null && this.aClass66Array1[local3].anInt3031 + this.aClass66Array1[local3].anInt3029 > local1) {
				local1 = this.aClass66Array1[local3].anInt3031 + this.aClass66Array1[local3].anInt3029;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass66Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass66Array1[local54].anInt3031 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass66Array1[local54].anInt3029 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass66Array1[local54].method2027(local70, this.aClass66Array1[local54].anInt3031);
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

	@OriginalMember(owner = "client!re", name = "b", descriptor = "()Lclient!fc;")
	public Class3_Sub9_Sub1 method1998() {
		@Pc(2) byte[] local2 = this.method1997();
		return new Class3_Sub9_Sub1(22050, local2, this.anInt2971 * 22050 / 1000, this.anInt2972 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "()I")
	public int method1999() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass66Array1[local3] != null && this.aClass66Array1[local3].anInt3029 / 20 < local1) {
				local1 = this.aClass66Array1[local3].anInt3029 / 20;
			}
		}
		if (this.anInt2971 < this.anInt2972 && this.anInt2971 / 20 < local1) {
			local1 = this.anInt2971 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass66Array1[local55] != null) {
				this.aClass66Array1[local55].anInt3029 -= local1 * 20;
			}
		}
		if (this.anInt2971 < this.anInt2972) {
			this.anInt2971 -= local1 * 20;
			this.anInt2972 -= local1 * 20;
		}
		return local1;
	}
}
