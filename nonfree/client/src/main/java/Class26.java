import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!au")
public final class Class26 {

	@OriginalMember(owner = "client!au", name = "b", descriptor = "[Lclient!fu;")
	public Class125_Sub1[] aClass125_Sub1Array1 = null;

	@OriginalMember(owner = "client!au", name = "d", descriptor = "Lclient!nh;")
	public Class125_Sub3 aClass125_Sub3_1 = null;

	@OriginalMember(owner = "client!au", name = "g", descriptor = "Lclient!nh;")
	public Class125_Sub3 aClass125_Sub3_2 = null;

	@OriginalMember(owner = "client!au", name = "a", descriptor = "[Lclient!fu;")
	public Class125_Sub1[] aClass125_Sub1Array2 = null;

	@OriginalMember(owner = "client!au", name = "c", descriptor = "Lclient!nh;")
	public Class125_Sub3 aClass125_Sub3_3 = null;

	@OriginalMember(owner = "client!au", name = "f", descriptor = "Z")
	public final boolean aBoolean83;

	@OriginalMember(owner = "client!au", name = "<init>", descriptor = "(Lclient!aq;)V")
	public Class26(@OriginalArg(0) Class22_Sub1 arg0) {
		this.aBoolean83 = arg0.aBoolean78;
		Static482.method6514(arg0);
		if (this.aBoolean83) {
			@Pc(125) byte[] local125 = Static601.method7729(false, Static259.anObject8);
			this.aClass125_Sub3_1 = new Class125_Sub3(arg0, 6410, 128, 128, 16, local125, 6410);
			@Pc(142) byte[] local142 = Static601.method7729(false, Static685.anObject12);
			this.aClass125_Sub3_2 = new Class125_Sub3(arg0, 6410, 128, 128, 16, local142, 6410);
			@Pc(157) Class204 local157 = arg0.aClass204_1;
			if (local157.method4776()) {
				local125 = Static601.method7729(false, Static536.anObject15);
				this.aClass125_Sub3_3 = new Class125_Sub3(arg0, 6408, 128, 128, 16);
				@Pc(187) Class125_Sub3 local187 = new Class125_Sub3(arg0, 6409, 128, 128, 16, local125, 6409);
				if (local157.method4779(2.0F, this.aClass125_Sub3_3, local187)) {
					this.aClass125_Sub3_3.method9215();
				} else {
					this.aClass125_Sub3_3.method9209();
					this.aClass125_Sub3_3 = null;
				}
				local187.method9209();
			}
		} else {
			this.aClass125_Sub1Array1 = new Class125_Sub1[16];
			for (@Pc(34) int local34 = 0; local34 < 16; local34++) {
				@Pc(50) byte[] local50 = Static40.method1149(2 * 128 * local34 * 128, Static259.anObject8);
				this.aClass125_Sub1Array1[local34] = new Class125_Sub1(arg0, 3553, 6410, 128, 128, true, local50, 6410, false);
			}
			this.aClass125_Sub1Array2 = new Class125_Sub1[16];
			for (@Pc(82) int local82 = 0; local82 < 16; local82++) {
				@Pc(96) byte[] local96 = Static40.method1149(128 * 128 * local82 * 2, Static685.anObject12);
				this.aClass125_Sub1Array2[local82] = new Class125_Sub1(arg0, 3553, 6410, 128, 128, true, local96, 6410, false);
			}
		}
	}
}
