import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sda")
public final class Class303 {

	@OriginalMember(owner = "client!sda", name = "i", descriptor = "Lclient!hj;")
	public Class40_Sub2 aClass40_Sub2_1 = null;

	@OriginalMember(owner = "client!sda", name = "g", descriptor = "[Lclient!wn;")
	public Class40_Sub3[] aClass40_Sub3Array3 = null;

	@OriginalMember(owner = "client!sda", name = "m", descriptor = "Lclient!hj;")
	public Class40_Sub2 aClass40_Sub2_2 = null;

	@OriginalMember(owner = "client!sda", name = "k", descriptor = "[Lclient!wn;")
	public Class40_Sub3[] aClass40_Sub3Array4 = null;

	@OriginalMember(owner = "client!sda", name = "n", descriptor = "Lclient!hj;")
	public Class40_Sub2 aClass40_Sub2_3 = null;

	@OriginalMember(owner = "client!sda", name = "c", descriptor = "Z")
	public final boolean aBoolean616;

	@OriginalMember(owner = "client!sda", name = "<init>", descriptor = "(Lclient!ok;)V")
	public Class303(@OriginalArg(0) Class134_Sub2 arg0) {
		this.aBoolean616 = arg0.aBoolean513;
		Static219.method5960(arg0);
		if (this.aBoolean616) {
			@Pc(112) byte[] local112 = Static437.method6088(false, Static483.anObject19);
			this.aClass40_Sub2_2 = new Class40_Sub2(arg0, 6410, 128, 128, 16, local112, 6410);
			@Pc(129) byte[] local129 = Static437.method6088(false, Static559.anObject22);
			this.aClass40_Sub2_3 = new Class40_Sub2(arg0, 6410, 128, 128, 16, local129, 6410);
			@Pc(144) Class37 local144 = arg0.aClass37_1;
			if (local144.method707()) {
				local112 = Static437.method6088(false, Static394.anObject14);
				this.aClass40_Sub2_1 = new Class40_Sub2(arg0, 6408, 128, 128, 16);
				@Pc(174) Class40_Sub2 local174 = new Class40_Sub2(arg0, 6409, 128, 128, 16, local112, 6409);
				if (local144.method706(local174, 2.0F, this.aClass40_Sub2_1)) {
					this.aClass40_Sub2_1.method5878();
				} else {
					this.aClass40_Sub2_1.method5873();
					this.aClass40_Sub2_1 = null;
				}
				local174.method5873();
			}
		} else {
			this.aClass40_Sub3Array3 = new Class40_Sub3[16];
			for (@Pc(34) int local34 = 0; local34 < 16; local34++) {
				@Pc(46) byte[] local46 = Static364.method4922(Static483.anObject19, 2 * 16384 * local34);
				this.aClass40_Sub3Array3[local34] = new Class40_Sub3(arg0, 3553, 6410, 128, 128, true, local46, 6410, false);
			}
			this.aClass40_Sub3Array4 = new Class40_Sub3[16];
			for (@Pc(72) int local72 = 0; local72 < 16; local72++) {
				@Pc(86) byte[] local86 = Static364.method4922(Static559.anObject22, 2 * 128 * local72 * 128);
				this.aClass40_Sub3Array4[local72] = new Class40_Sub3(arg0, 3553, 6410, 128, 128, true, local86, 6410, false);
			}
		}
	}
}
