import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mw")
public final class Class56_Sub7 extends Class56 {

	@OriginalMember(owner = "client!mw", name = "G", descriptor = "Z")
	private boolean aBoolean496;

	@OriginalMember(owner = "client!mw", name = "M", descriptor = "Z")
	private boolean aBoolean497;

	@OriginalMember(owner = "client!mw", name = "N", descriptor = "[F")
	private final float[] aFloatArray55 = new float[4];

	@OriginalMember(owner = "client!mw", name = "F", descriptor = "Lclient!ml;")
	private Class223 aClass223_5;

	@OriginalMember(owner = "client!mw", name = "z", descriptor = "Lclient!ml;")
	private Class223 aClass223_3;

	@OriginalMember(owner = "client!mw", name = "y", descriptor = "Lclient!ml;")
	private Class223 aClass223_2;

	@OriginalMember(owner = "client!mw", name = "A", descriptor = "Lclient!ml;")
	private Class223 aClass223_4;

	@OriginalMember(owner = "client!mw", name = "w", descriptor = "Z")
	private final boolean aBoolean495;

	@OriginalMember(owner = "client!mw", name = "L", descriptor = "Lclient!ls;")
	private Interface14 anInterface14_6;

	@OriginalMember(owner = "client!mw", name = "<init>", descriptor = "(Lclient!lm;Lclient!pl;)V")
	public Class56_Sub7(@OriginalArg(0) Class100_Sub1_Sub2 arg0, @OriginalArg(1) Class259 arg1) {
		super(arg0);
		if (arg1 != null && arg0.aBoolean467) {
			this.aClass223_5 = Static227.method3537(arg1.method5965("gl", "uw_ground_unlit"), arg0);
			this.aClass223_3 = Static227.method3537(arg1.method5965("gl", "uw_ground_lit"), arg0);
			this.aClass223_2 = Static227.method3537(arg1.method5965("gl", "uw_model_unlit"), arg0);
			this.aClass223_4 = Static227.method3537(arg1.method5965("gl", "uw_model_lit"), arg0);
			if (this.aClass223_2 != null & this.aClass223_5 != null & this.aClass223_3 != null & this.aClass223_4 != null) {
				this.anInterface14_6 = super.aClass100_Sub1_23.method4838(2, false, 1, new int[] { 0, -1 });
				this.anInterface14_6.method7067(false, false);
				this.aBoolean495 = true;
			} else {
				this.aBoolean495 = false;
			}
		} else {
			this.aBoolean495 = false;
		}
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7174(@OriginalArg(1) boolean arg0) {
		this.aBoolean496 = arg0;
		super.aClass100_Sub1_23.method4860(1);
		super.aClass100_Sub1_23.method4876(this.anInterface14_6);
		super.aClass100_Sub1_23.method4797(Static583.aClass236_5, Static291.aClass236_2);
		super.aClass100_Sub1_23.method4883(0, Static224.aClass119_18);
		super.aClass100_Sub1_23.method4875(false, Static325.aClass119_44, 2, true);
		super.aClass100_Sub1_23.method4816(0, Static48.aClass119_5);
		super.aClass100_Sub1_23.method4860(0);
		this.method7185();
	}

	@OriginalMember(owner = "client!mw", name = "e", descriptor = "(I)V")
	@Override
	public void method7185() {
		@Pc(8) int local8 = super.aClass100_Sub1_23.method4768();
		@Pc(13) Class68_Sub2 local13 = super.aClass100_Sub1_23.method4811();
		if (this.aBoolean496) {
			OpenGL.glBindProgramARB(34336, local8 == Integer.MAX_VALUE ? this.aClass223_3.anInt6205 : this.aClass223_4.anInt6205);
		} else {
			OpenGL.glBindProgramARB(34336, local8 == Integer.MAX_VALUE ? this.aClass223_5.anInt6205 : this.aClass223_2.anInt6205);
		}
		OpenGL.glEnable(34336);
		this.aBoolean497 = true;
		local13.method5121(0.0F, this.aFloatArray55, -1.0F, (float) local8, 0.0F);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, this.aFloatArray55[0], this.aFloatArray55[1], this.aFloatArray55[2], this.aFloatArray55[3]);
		this.method7177();
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(IILclient!hfa;)V")
	@Override
	public void method7178(@OriginalArg(0) int arg0, @OriginalArg(2) Interface10 arg1) {
		super.aClass100_Sub1_23.method4876(arg1);
		super.aClass100_Sub1_23.method4872(arg0);
	}

	@OriginalMember(owner = "client!mw", name = "d", descriptor = "(I)V")
	@Override
	public void method7183() {
		super.aClass100_Sub1_23.method4860(1);
		super.aClass100_Sub1_23.method4876(null);
		super.aClass100_Sub1_23.method4797(Static458.aClass236_4, Static458.aClass236_4);
		super.aClass100_Sub1_23.method4883(0, Static325.aClass119_44);
		super.aClass100_Sub1_23.method4883(2, Static224.aClass119_18);
		super.aClass100_Sub1_23.method4816(0, Static325.aClass119_44);
		super.aClass100_Sub1_23.method4860(0);
		if (this.aBoolean497) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean497 = false;
		}
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7172() {
		return this.aBoolean495;
	}

	@OriginalMember(owner = "client!mw", name = "b", descriptor = "(I)V")
	@Override
	public void method7177() {
		if (!this.aBoolean497) {
			return;
		}
		@Pc(6) int local6 = super.aClass100_Sub1_23.U();
		@Pc(10) int local10 = super.aClass100_Sub1_23.BA();
		@Pc(22) float local22 = -((float) (local6 - local10) * 0.125F) + (float) local6;
		@Pc(34) float local34 = -((float) (local6 - local10) * 0.25F) + (float) local6;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local34, local22, 1.0F / (float) super.aClass100_Sub1_23.method4864(), (float) super.aClass100_Sub1_23.method4847() / 255.0F);
		super.aClass100_Sub1_23.method4860(1);
		super.aClass100_Sub1_23.method4877(super.aClass100_Sub1_23.method4789());
		super.aClass100_Sub1_23.method4860(0);
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7171(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(IIB)V")
	@Override
	public void method7182(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
