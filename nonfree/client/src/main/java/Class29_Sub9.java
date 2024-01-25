import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mw")
public final class Class29_Sub9 extends Class29 {

	@OriginalMember(owner = "client!mw", name = "v", descriptor = "Lclient!mba;")
	private final Class5_Sub1_Sub2 aClass5_Sub1_Sub2_9;

	@OriginalMember(owner = "client!mw", name = "q", descriptor = "Lclient!ur;")
	private final Class345 aClass345_5;

	@OriginalMember(owner = "client!mw", name = "s", descriptor = "Lclient!ob;")
	private final Class242 aClass242_5;

	@OriginalMember(owner = "client!mw", name = "<init>", descriptor = "(Lclient!mba;Lclient!la;Lclient!ur;)V")
	public Class29_Sub9(@OriginalArg(0) Class5_Sub1_Sub2 arg0, @OriginalArg(1) Class196 arg1, @OriginalArg(2) Class345 arg2) {
		super(arg0);
		this.aClass5_Sub1_Sub2_9 = arg0;
		this.aClass345_5 = arg2;
		if (arg1 != null && this.aClass345_5.method8240() && this.aClass5_Sub1_Sub2_9.aBoolean483) {
			this.aClass242_5 = Static561.method8093(arg1.method5093("gl", "transparent_water"), this.aClass5_Sub1_Sub2_9);
		} else {
			this.aClass242_5 = null;
		}
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8080(@OriginalArg(1) boolean arg0) {
		OpenGL.glBindProgramARB(34336, this.aClass242_5.anInt7252);
		OpenGL.glEnable(34336);
		super.aClass5_Sub1_22.method5583(Static482.aClass9_4, 0);
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(IILclient!ec;)V")
	@Override
	public void method8072(@OriginalArg(1) int arg0, @OriginalArg(2) Interface10 arg1) {
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8067(@OriginalArg(0) boolean arg0) {
		super.aClass5_Sub1_22.method5682(Static377.aClass374_3, Static314.aClass374_2);
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(III)V")
	@Override
	public void method8083(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass345_5.aBoolean688) {
			@Pc(44) float local44 = (float) (super.aClass5_Sub1_22.anInt6524 % 4000) / 4000.0F;
			super.aClass5_Sub1_22.method5609(this.aClass345_5.anInterface12_2);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, local44, 0.0F, 0.0F, 1.0F);
		} else {
			@Pc(17) int local17 = super.aClass5_Sub1_22.anInt6524 % 4000 * 16 / 4000;
			super.aClass5_Sub1_22.method5609(this.aClass345_5.anInterface24Array1[local17]);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(I)V")
	@Override
	public void method8071() {
		super.aClass5_Sub1_22.method5583(Static333.aClass9_2, 0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34820);
		OpenGL.glDisable(34336);
	}

	@OriginalMember(owner = "client!mw", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8073() {
		return this.aClass242_5 != null;
	}
}
