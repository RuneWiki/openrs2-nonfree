import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!KACHDVNZ")
public final class Class4_Sub1_Sub1_Sub3 extends Class4_Sub1_Sub1 {

	@OriginalMember(owner = "client!KACHDVNZ", name = "m", descriptor = "I")
	private int anInt319;

	@OriginalMember(owner = "client!KACHDVNZ", name = "n", descriptor = "I")
	private int anInt320;

	@OriginalMember(owner = "client!KACHDVNZ", name = "v", descriptor = "Z")
	public boolean aBoolean92 = false;

	@OriginalMember(owner = "client!KACHDVNZ", name = "w", descriptor = "I")
	private int anInt326 = 40410;

	@OriginalMember(owner = "client!KACHDVNZ", name = "t", descriptor = "Lclient!BUIWQSXJ;")
	private Class6 aClass6_1;

	@OriginalMember(owner = "client!KACHDVNZ", name = "o", descriptor = "I")
	public int anInt321;

	@OriginalMember(owner = "client!KACHDVNZ", name = "p", descriptor = "I")
	public int anInt322;

	@OriginalMember(owner = "client!KACHDVNZ", name = "q", descriptor = "I")
	public int anInt323;

	@OriginalMember(owner = "client!KACHDVNZ", name = "r", descriptor = "I")
	public int anInt324;

	@OriginalMember(owner = "client!KACHDVNZ", name = "u", descriptor = "I")
	public int anInt325;

	@OriginalMember(owner = "client!KACHDVNZ", name = "<init>", descriptor = "(IIIBIIII)V")
	public Class4_Sub1_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			this.aClass6_1 = Class6.aClass6Array1[arg0];
			this.anInt321 = arg5;
			this.anInt322 = arg2;
			this.anInt323 = arg6;
			this.anInt324 = arg4;
			this.anInt325 = arg7 + arg1;
			this.aBoolean92 = false;
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("32332, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KACHDVNZ", name = "a", descriptor = "(II)V")
	public void method218(@OriginalArg(1) int arg0) {
		try {
			this.anInt320 += arg0;
			while (true) {
				do {
					do {
						if (this.anInt320 <= this.aClass6_1.aClass21_1.method275(this.anInt326, this.anInt319)) {
							return;
						}
						this.anInt320 -= this.aClass6_1.aClass21_1.method275(this.anInt326, this.anInt319) + 1;
						this.anInt319++;
					} while (this.anInt319 < this.aClass6_1.aClass21_1.anInt369);
				} while (this.anInt319 >= 0 && this.anInt319 < this.aClass6_1.aClass21_1.anInt369);
				this.anInt319 = 0;
				this.aBoolean92 = true;
			}
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("43929, " + 2 + ", " + arg0 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KACHDVNZ", name = "a", descriptor = "(Z)Lclient!POJFANDE;")
	@Override
	protected Class4_Sub1_Sub1_Sub4 method559() {
		try {
			@Pc(3) Class4_Sub1_Sub1_Sub4 local3 = this.aClass6_1.method72();
			if (local3 == null) {
				return null;
			}
			@Pc(15) int local15 = this.aClass6_1.aClass21_1.anIntArray69[this.anInt319];
			@Pc(32) Class4_Sub1_Sub1_Sub4 local32 = new Class4_Sub1_Sub1_Sub4(Class16.method193(local15), true, false, -785, local3);
			if (!this.aBoolean92) {
				local32.method406();
				local32.method407(local15);
				local32.anIntArrayArray12 = null;
				local32.anIntArrayArray11 = null;
			}
			if (this.aClass6_1.anInt34 != 128 || this.aClass6_1.anInt35 != 128) {
				local32.method415(this.aClass6_1.anInt35, this.aClass6_1.anInt34, this.aClass6_1.anInt34);
			}
			if (this.aClass6_1.anInt36 != 0) {
				if (this.aClass6_1.anInt36 == 90) {
					local32.method410();
				}
				if (this.aClass6_1.anInt36 == 180) {
					local32.method410();
					local32.method410();
				}
				if (this.aClass6_1.anInt36 == 270) {
					local32.method410();
					local32.method410();
					local32.method410();
				}
			}
			local32.method416(this.aClass6_1.anInt37 + 64, this.aClass6_1.anInt38 + 850, -30, -50, -30, true);
			return local32;
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("18869, " + true + ", " + local126.toString());
			throw new RuntimeException();
		}
	}
}
