import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class159 {

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "[Lclient!ml;")
	public Class55_Sub3[] aClass55_Sub3Array3 = null;

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "[Lclient!ml;")
	public Class55_Sub3[] aClass55_Sub3Array2 = null;

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "Lclient!md;")
	public Class55_Sub2 aClass55_Sub2_2 = null;

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "Lclient!md;")
	public Class55_Sub2 aClass55_Sub2_3 = null;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "Lclient!md;")
	public Class55_Sub2 aClass55_Sub2_1 = null;

	@OriginalMember(owner = "client!mc", name = "j", descriptor = "Z")
	public final boolean aBoolean328;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lclient!ef;)V")
	public Class159(@OriginalArg(0) Class49_Sub2 arg0) {
		this.aBoolean328 = arg0.aBoolean135;
		Static389.method5167(arg0);
		if (this.aBoolean328) {
			@Pc(112) byte[] local112 = Static248.method3789(Static288.anObject8, false);
			this.aClass55_Sub2_1 = new Class55_Sub2(arg0, 6410, 128, 128, 16, local112, 6410);
			@Pc(129) byte[] local129 = Static248.method3789(Static76.anObject1, false);
			this.aClass55_Sub2_2 = new Class55_Sub2(arg0, 6410, 128, 128, 16, local129, 6410);
			@Pc(144) Class208 local144 = arg0.aClass208_1;
			if (local144.method4555()) {
				local112 = Static248.method3789(Static120.anObject4, false);
				this.aClass55_Sub2_3 = new Class55_Sub2(arg0, 6408, 128, 128, 16);
				@Pc(174) Class55_Sub2 local174 = new Class55_Sub2(arg0, 6409, 128, 128, 16, local112, 6409);
				if (local144.method4557(local174, this.aClass55_Sub2_3, 2.0F)) {
					this.aClass55_Sub2_3.method5554();
				} else {
					this.aClass55_Sub2_3.method5559();
					this.aClass55_Sub2_3 = null;
				}
				local174.method5559();
			}
		} else {
			this.aClass55_Sub3Array2 = new Class55_Sub3[16];
			for (@Pc(34) int local34 = 0; local34 < 16; local34++) {
				@Pc(44) byte[] local44 = Static37.method614(Static288.anObject8, local34 * 32768);
				this.aClass55_Sub3Array2[local34] = new Class55_Sub3(arg0, 3553, 6410, 128, 128, true, local44, 6410, false);
			}
			this.aClass55_Sub3Array3 = new Class55_Sub3[16];
			for (@Pc(72) int local72 = 0; local72 < 16; local72++) {
				@Pc(84) byte[] local84 = Static37.method614(Static76.anObject1, 256 * 128 * local72);
				this.aClass55_Sub3Array3[local72] = new Class55_Sub3(arg0, 3553, 6410, 128, 128, true, local84, 6410, false);
			}
		}
	}
}
