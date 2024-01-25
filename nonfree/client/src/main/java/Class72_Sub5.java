import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kr")
public final class Class72_Sub5 extends Class72 {

	@OriginalMember(owner = "client!kr", name = "D", descriptor = "Z")
	private boolean aBoolean355;

	@OriginalMember(owner = "client!kr", name = "F", descriptor = "Z")
	private boolean aBoolean356;

	@OriginalMember(owner = "client!kr", name = "H", descriptor = "[F")
	private final float[] aFloatArray54 = new float[4];

	@OriginalMember(owner = "client!kr", name = "G", descriptor = "Z")
	private final boolean aBoolean357;

	@OriginalMember(owner = "client!kr", name = "v", descriptor = "Lclient!iea;")
	private Class143 aClass143_3;

	@OriginalMember(owner = "client!kr", name = "t", descriptor = "Lclient!iea;")
	private Class143 aClass143_2;

	@OriginalMember(owner = "client!kr", name = "A", descriptor = "Lclient!iea;")
	private Class143 aClass143_4;

	@OriginalMember(owner = "client!kr", name = "J", descriptor = "Lclient!iea;")
	private Class143 aClass143_5;

	@OriginalMember(owner = "client!kr", name = "E", descriptor = "Lclient!pm;")
	private Interface17 anInterface17_2;

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Lclient!mr;Lclient!tf;)V")
	public Class72_Sub5(@OriginalArg(0) Class45_Sub2_Sub2 arg0, @OriginalArg(1) Class322 arg1) {
		super(arg0);
		if (arg1 != null && arg0.aBoolean438) {
			this.aClass143_3 = Static258.method6210(arg1.method6810("uw_ground_unlit", "gl"), arg0);
			this.aClass143_2 = Static258.method6210(arg1.method6810("uw_ground_lit", "gl"), arg0);
			this.aClass143_4 = Static258.method6210(arg1.method6810("uw_model_unlit", "gl"), arg0);
			this.aClass143_5 = Static258.method6210(arg1.method6810("uw_model_lit", "gl"), arg0);
			if (this.aClass143_4 != null & this.aClass143_3 != null & this.aClass143_2 != null & this.aClass143_5 != null) {
				this.anInterface17_2 = super.aClass45_Sub2_22.method4904(false, 1, 2, new int[] { 0, -1 });
				this.anInterface17_2.method6973(false, false);
				this.aBoolean357 = true;
			} else {
				this.aBoolean357 = false;
			}
		} else {
			this.aBoolean357 = false;
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)V")
	@Override
	public void method7183() {
		@Pc(8) int local8 = super.aClass45_Sub2_22.method4996();
		@Pc(13) Class11_Sub1 local13 = super.aClass45_Sub2_22.method4984();
		if (this.aBoolean356) {
			OpenGL.glBindProgramARB(34336, local8 == Integer.MAX_VALUE ? this.aClass143_2.anInt3934 : this.aClass143_5.anInt3934);
		} else {
			OpenGL.glBindProgramARB(34336, ~local8 == Integer.MIN_VALUE ? this.aClass143_3.anInt3934 : this.aClass143_4.anInt3934);
		}
		OpenGL.glEnable(34336);
		this.aBoolean355 = true;
		local13.method172(0.0F, -1.0F, 0.0F, this.aFloatArray54, (float) local8);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, this.aFloatArray54[0], this.aFloatArray54[1], this.aFloatArray54[2], this.aFloatArray54[3]);
		this.method7192();
	}

	@OriginalMember(owner = "client!kr", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7187() {
		return this.aBoolean357;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7182(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(BILclient!lc;)V")
	@Override
	public void method7194(@OriginalArg(1) int arg0, @OriginalArg(2) Interface11 arg1) {
		super.aClass45_Sub2_22.method4926(arg1);
		super.aClass45_Sub2_22.method4939(arg0);
	}

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(B)V")
	@Override
	public void method7184() {
		super.aClass45_Sub2_22.method4961(1);
		super.aClass45_Sub2_22.method4926(null);
		super.aClass45_Sub2_22.method4921(Static19.aClass307_1, Static19.aClass307_1);
		super.aClass45_Sub2_22.method4953(0, Static164.aClass108_3);
		super.aClass45_Sub2_22.method4953(2, Static62.aClass108_1);
		super.aClass45_Sub2_22.method4900(0, Static164.aClass108_3);
		super.aClass45_Sub2_22.method4961(0);
		if (this.aBoolean355) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean355 = false;
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7193(@OriginalArg(0) boolean arg0) {
		this.aBoolean356 = arg0;
		super.aClass45_Sub2_22.method4961(1);
		super.aClass45_Sub2_22.method4926(this.anInterface17_2);
		super.aClass45_Sub2_22.method4921(Static534.aClass307_7, Static479.aClass307_6);
		super.aClass45_Sub2_22.method4953(0, Static62.aClass108_1);
		super.aClass45_Sub2_22.method5010(2, false, true, Static164.aClass108_3);
		super.aClass45_Sub2_22.method4900(0, Static160.aClass108_2);
		super.aClass45_Sub2_22.method4961(0);
		this.method7183();
	}

	@OriginalMember(owner = "client!kr", name = "d", descriptor = "(I)V")
	@Override
	public void method7192() {
		if (!this.aBoolean355) {
			return;
		}
		@Pc(6) int local6 = super.aClass45_Sub2_22.U();
		@Pc(10) int local10 = super.aClass45_Sub2_22.BA();
		@Pc(21) float local21 = (float) local6 - (float) (local6 - local10) * 0.125F;
		@Pc(33) float local33 = -((float) (local6 - local10) * 0.25F) + (float) local6;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local33, local21, 1.0F / (float) super.aClass45_Sub2_22.method4973(), (float) super.aClass45_Sub2_22.method5023() / 255.0F);
		super.aClass45_Sub2_22.method4961(1);
		super.aClass45_Sub2_22.method4912(super.aClass45_Sub2_22.method4915());
		super.aClass45_Sub2_22.method4961(0);
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(III)V")
	@Override
	public void method7188(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
