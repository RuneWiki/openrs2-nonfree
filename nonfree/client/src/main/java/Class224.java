import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pda")
public final class Class224 {

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "Lclient!lh;")
	public Class164_Sub2 aClass164_Sub2_1 = null;

	@OriginalMember(owner = "client!pda", name = "h", descriptor = "Lclient!lh;")
	public Class164_Sub2 aClass164_Sub2_3 = null;

	@OriginalMember(owner = "client!pda", name = "i", descriptor = "[Lclient!rr;")
	public Class164_Sub3[] aClass164_Sub3Array3 = null;

	@OriginalMember(owner = "client!pda", name = "k", descriptor = "[Lclient!rr;")
	public Class164_Sub3[] aClass164_Sub3Array4 = null;

	@OriginalMember(owner = "client!pda", name = "d", descriptor = "Lclient!lh;")
	public Class164_Sub2 aClass164_Sub2_2 = null;

	@OriginalMember(owner = "client!pda", name = "f", descriptor = "Z")
	public final boolean aBoolean492;

	@OriginalMember(owner = "client!pda", name = "<init>", descriptor = "(Lclient!mh;)V")
	public Class224(@OriginalArg(0) Class4_Sub3 arg0) {
		this.aBoolean492 = arg0.aBoolean427;
		Static267.method4737(arg0);
		if (this.aBoolean492) {
			@Pc(110) byte[] local110 = Static542.method8243(false, Static318.anObject10);
			this.aClass164_Sub2_1 = new Class164_Sub2(arg0, 6410, 128, 128, 16, local110, 6410);
			@Pc(127) byte[] local127 = Static542.method8243(false, Static305.anObject9);
			this.aClass164_Sub2_3 = new Class164_Sub2(arg0, 6410, 128, 128, 16, local127, 6410);
			@Pc(142) Class16 local142 = arg0.aClass16_1;
			if (local142.method590()) {
				local110 = Static542.method8243(false, Static415.anObject12);
				this.aClass164_Sub2_2 = new Class164_Sub2(arg0, 6408, 128, 128, 16);
				@Pc(172) Class164_Sub2 local172 = new Class164_Sub2(arg0, 6409, 128, 128, 16, local110, 6409);
				if (local142.method591(2.0F, local172, this.aClass164_Sub2_2)) {
					this.aClass164_Sub2_2.method8145();
				} else {
					this.aClass164_Sub2_2.method8148();
					this.aClass164_Sub2_2 = null;
				}
				local172.method8148();
			}
		} else {
			this.aClass164_Sub3Array4 = new Class164_Sub3[16];
			for (@Pc(34) int local34 = 0; local34 < 16; local34++) {
				@Pc(44) byte[] local44 = Static503.method5017(Static318.anObject10, local34 * 32768);
				this.aClass164_Sub3Array4[local34] = new Class164_Sub3(arg0, 3553, 6410, 128, 128, true, local44, 6410, false);
			}
			this.aClass164_Sub3Array3 = new Class164_Sub3[16];
			for (@Pc(72) int local72 = 0; local72 < 16; local72++) {
				@Pc(84) byte[] local84 = Static503.method5017(Static305.anObject9, 2 * 16384 * local72);
				this.aClass164_Sub3Array3[local72] = new Class164_Sub3(arg0, 3553, 6410, 128, 128, true, local84, 6410, false);
			}
		}
	}
}
