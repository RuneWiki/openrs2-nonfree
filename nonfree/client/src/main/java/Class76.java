import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class76 {

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "[Lclient!ia;")
	private final Class36[] aClass36Array1 = new Class36[10];

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
	private int anInt3538;

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
	private int anInt3539;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Lclient!oa;)V")
	public Class76(@OriginalArg(0) Class2_Sub18 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method2387();
			if (local12 != 0) {
				arg0.anInt3423--;
				this.aClass36Array1[local7] = new Class36();
				this.aClass36Array1[local7].method1311(arg0);
			}
		}
		this.anInt3538 = arg0.method2353();
		this.anInt3539 = arg0.method2353();
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "()[B")
	private byte[] method2446() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass36Array1[local3] != null && this.aClass36Array1[local3].anInt1814 + this.aClass36Array1[local3].anInt1815 > local1) {
				local1 = this.aClass36Array1[local3].anInt1814 + this.aClass36Array1[local3].anInt1815;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass36Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass36Array1[local54].anInt1814 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass36Array1[local54].anInt1815 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass36Array1[local54].method1310(local70, this.aClass36Array1[local54].anInt1814);
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

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "()Lclient!jb;")
	public Class2_Sub5_Sub1 method2447() {
		@Pc(2) byte[] local2 = this.method2446();
		return new Class2_Sub5_Sub1(22050, local2, this.anInt3538 * 22050 / 1000, this.anInt3539 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "()I")
	public int method2448() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass36Array1[local3] != null && this.aClass36Array1[local3].anInt1815 / 20 < local1) {
				local1 = this.aClass36Array1[local3].anInt1815 / 20;
			}
		}
		if (this.anInt3538 < this.anInt3539 && this.anInt3538 / 20 < local1) {
			local1 = this.anInt3538 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass36Array1[local55] != null) {
				this.aClass36Array1[local55].anInt1815 -= local1 * 20;
			}
		}
		if (this.anInt3538 < this.anInt3539) {
			this.anInt3538 -= local1 * 20;
			this.anInt3539 -= local1 * 20;
		}
		return local1;
	}
}
