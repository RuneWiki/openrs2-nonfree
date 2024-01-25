import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fj")
public final class Class105 {

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "Lclient!nh;")
	public Class50_Sub3 aClass50_Sub3_1 = null;

	@OriginalMember(owner = "client!fj", name = "e", descriptor = "[Lclient!wh;")
	public Class50_Sub1[] aClass50_Sub1Array2 = null;

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "[Lclient!wh;")
	public Class50_Sub1[] aClass50_Sub1Array1 = null;

	@OriginalMember(owner = "client!fj", name = "g", descriptor = "Lclient!nh;")
	public Class50_Sub3 aClass50_Sub3_2 = null;

	@OriginalMember(owner = "client!fj", name = "m", descriptor = "Lclient!nh;")
	public Class50_Sub3 aClass50_Sub3_3 = null;

	@OriginalMember(owner = "client!fj", name = "d", descriptor = "Z")
	public final boolean aBoolean246;

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lclient!er;)V")
	public Class105(@OriginalArg(0) Class31_Sub2 arg0) {
		this.aBoolean246 = arg0.aBoolean218;
		Static520.method7217(arg0);
		if (this.aBoolean246) {
			@Pc(110) byte[] local110 = Static193.method3393(false, Static59.anObject6);
			this.aClass50_Sub3_2 = new Class50_Sub3(arg0, 6410, 128, 128, 16, local110, 6410);
			@Pc(127) byte[] local127 = Static193.method3393(false, Static166.anObject10);
			this.aClass50_Sub3_1 = new Class50_Sub3(arg0, 6410, 128, 128, 16, local127, 6410);
			@Pc(142) Class247 local142 = arg0.aClass247_1;
			if (local142.method5595()) {
				local110 = Static193.method3393(false, Static582.anObject20);
				this.aClass50_Sub3_3 = new Class50_Sub3(arg0, 6408, 128, 128, 16);
				@Pc(172) Class50_Sub3 local172 = new Class50_Sub3(arg0, 6409, 128, 128, 16, local110, 6409);
				if (local142.method5593(local172, 2.0F, this.aClass50_Sub3_3)) {
					this.aClass50_Sub3_3.method6152();
				} else {
					this.aClass50_Sub3_3.method6157();
					this.aClass50_Sub3_3 = null;
				}
				local172.method6157();
			}
		} else {
			this.aClass50_Sub1Array1 = new Class50_Sub1[16];
			for (@Pc(34) int local34 = 0; local34 < 16; local34++) {
				@Pc(46) byte[] local46 = Static544.method7462(Static59.anObject6, local34 * 256 * 128);
				this.aClass50_Sub1Array1[local34] = new Class50_Sub1(arg0, 3553, 6410, 128, 128, true, local46, 6410, false);
			}
			this.aClass50_Sub1Array2 = new Class50_Sub1[16];
			for (@Pc(72) int local72 = 0; local72 < 16; local72++) {
				@Pc(84) byte[] local84 = Static544.method7462(Static166.anObject10, local72 * 256 * 128);
				this.aClass50_Sub1Array2[local72] = new Class50_Sub1(arg0, 3553, 6410, 128, 128, true, local84, 6410, false);
			}
		}
	}
}
