import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pr")
public final class Class264 {

	@OriginalMember(owner = "client!pr", name = "e", descriptor = "Lclient!dl;")
	public Class20_Sub2 aClass20_Sub2_1 = null;

	@OriginalMember(owner = "client!pr", name = "c", descriptor = "[Lclient!wn;")
	public Class20_Sub4[] aClass20_Sub4Array3 = null;

	@OriginalMember(owner = "client!pr", name = "d", descriptor = "[Lclient!wn;")
	public Class20_Sub4[] aClass20_Sub4Array4 = null;

	@OriginalMember(owner = "client!pr", name = "f", descriptor = "Lclient!dl;")
	public Class20_Sub2 aClass20_Sub2_2 = null;

	@OriginalMember(owner = "client!pr", name = "k", descriptor = "Lclient!dl;")
	public Class20_Sub2 aClass20_Sub2_3 = null;

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "Z")
	public final boolean aBoolean588;

	@OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Lclient!nv;)V")
	public Class264(@OriginalArg(0) Class16_Sub3 arg0) {
		this.aBoolean588 = arg0.aBoolean531;
		Static643.method8637(arg0);
		if (this.aBoolean588) {
			@Pc(118) byte[] local118 = Static565.method3489(Static429.anObject15, false);
			this.aClass20_Sub2_3 = new Class20_Sub2(arg0, 6410, 128, 128, 16, local118, 6410);
			@Pc(135) byte[] local135 = Static565.method3489(Static540.anObject20, false);
			this.aClass20_Sub2_2 = new Class20_Sub2(arg0, 6410, 128, 128, 16, local135, 6410);
			@Pc(150) Class221 local150 = arg0.aClass221_1;
			if (local150.method5676()) {
				local118 = Static565.method3489(Static479.anObject16, false);
				this.aClass20_Sub2_1 = new Class20_Sub2(arg0, 6408, 128, 128, 16);
				@Pc(180) Class20_Sub2 local180 = new Class20_Sub2(arg0, 6409, 128, 128, 16, local118, 6409);
				if (local150.method5675(this.aClass20_Sub2_1, local180, 2.0F)) {
					this.aClass20_Sub2_1.method7619();
				} else {
					this.aClass20_Sub2_1.method7614();
					this.aClass20_Sub2_1 = null;
				}
				local180.method7614();
			}
		} else {
			this.aClass20_Sub4Array3 = new Class20_Sub4[16];
			for (@Pc(34) int local34 = 0; local34 < 16; local34++) {
				@Pc(48) byte[] local48 = Static584.method8132(local34 * 128 * 128 * 2, Static429.anObject15);
				this.aClass20_Sub4Array3[local34] = new Class20_Sub4(arg0, 3553, 6410, 128, 128, true, local48, 6410, false);
			}
			this.aClass20_Sub4Array4 = new Class20_Sub4[16];
			for (@Pc(76) int local76 = 0; local76 < 16; local76++) {
				@Pc(90) byte[] local90 = Static584.method8132(2 * 128 * local76 * 128, Static540.anObject20);
				this.aClass20_Sub4Array4[local76] = new Class20_Sub4(arg0, 3553, 6410, 128, 128, true, local90, 6410, false);
			}
		}
	}
}
