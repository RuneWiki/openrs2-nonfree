import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class84 {

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "[Lclient!jc;")
	private final Class44[] aClass44Array1 = new Class44[10];

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
	private int anInt3860;

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
	private int anInt3859;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Lclient!wa;)V")
	public Class84(@OriginalArg(0) Class1_Sub14 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method1738();
			if (local12 != 0) {
				arg0.anInt2306--;
				this.aClass44Array1[local7] = new Class44();
				this.aClass44Array1[local7].method1460(arg0);
			}
		}
		this.anInt3860 = arg0.method1753();
		this.anInt3859 = arg0.method1753();
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "()Lclient!mg;")
	public Class1_Sub19_Sub1 method2938() {
		@Pc(2) byte[] local2 = this.method2939();
		return new Class1_Sub19_Sub1(22050, local2, this.anInt3860 * 22050 / 1000, this.anInt3859 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "()[B")
	private byte[] method2939() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass44Array1[local3] != null && this.aClass44Array1[local3].anInt2054 + this.aClass44Array1[local3].anInt2053 > local1) {
				local1 = this.aClass44Array1[local3].anInt2054 + this.aClass44Array1[local3].anInt2053;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass44Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass44Array1[local54].anInt2054 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass44Array1[local54].anInt2053 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass44Array1[local54].method1462(local70, this.aClass44Array1[local54].anInt2054);
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

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "()I")
	public int method2940() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass44Array1[local3] != null && this.aClass44Array1[local3].anInt2053 / 20 < local1) {
				local1 = this.aClass44Array1[local3].anInt2053 / 20;
			}
		}
		if (this.anInt3860 < this.anInt3859 && this.anInt3860 / 20 < local1) {
			local1 = this.anInt3860 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass44Array1[local55] != null) {
				this.aClass44Array1[local55].anInt2053 -= local1 * 20;
			}
		}
		if (this.anInt3860 < this.anInt3859) {
			this.anInt3860 -= local1 * 20;
			this.anInt3859 -= local1 * 20;
		}
		return local1;
	}
}
