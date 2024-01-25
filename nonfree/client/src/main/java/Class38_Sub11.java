import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ti")
public final class Class38_Sub11 extends Class38 {

	@OriginalMember(owner = "client!ti", name = "p", descriptor = "Z")
	private boolean aBoolean635;

	@OriginalMember(owner = "client!ti", name = "z", descriptor = "Z")
	private boolean aBoolean636;

	@OriginalMember(owner = "client!ti", name = "D", descriptor = "[F")
	private final float[] aFloatArray58 = new float[4];

	@OriginalMember(owner = "client!ti", name = "v", descriptor = "Lclient!qd;")
	private Class270 aClass270_4;

	@OriginalMember(owner = "client!ti", name = "C", descriptor = "Lclient!qd;")
	private Class270 aClass270_5;

	@OriginalMember(owner = "client!ti", name = "r", descriptor = "Lclient!qd;")
	private Class270 aClass270_3;

	@OriginalMember(owner = "client!ti", name = "q", descriptor = "Lclient!qd;")
	private Class270 aClass270_2;

	@OriginalMember(owner = "client!ti", name = "E", descriptor = "Z")
	private final boolean aBoolean637;

	@OriginalMember(owner = "client!ti", name = "x", descriptor = "Lclient!co;")
	private Interface6 anInterface6_6;

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Lclient!dda;Lclient!jn;)V")
	public Class38_Sub11(@OriginalArg(0) Class44_Sub2_Sub1 arg0, @OriginalArg(1) Class176 arg1) {
		super(arg0);
		if (arg1 != null && arg0.aBoolean147) {
			this.aClass270_4 = Static490.method7271(arg1.method3972("gl", "uw_ground_unlit"), arg0);
			this.aClass270_5 = Static490.method7271(arg1.method3972("gl", "uw_ground_lit"), arg0);
			this.aClass270_3 = Static490.method7271(arg1.method3972("gl", "uw_model_unlit"), arg0);
			this.aClass270_2 = Static490.method7271(arg1.method3972("gl", "uw_model_lit"), arg0);
			if (this.aClass270_3 != null & this.aClass270_4 != null & this.aClass270_5 != null & this.aClass270_2 != null) {
				this.anInterface6_6 = super.aClass44_Sub2_21.method4250(1, false, new int[] { 0, -1 }, 2);
				this.anInterface6_6.method8281(false, false);
				this.aBoolean637 = true;
			} else {
				this.aBoolean637 = false;
			}
		} else {
			this.aBoolean637 = false;
		}
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(I)V")
	@Override
	public void method7429() {
		if (!this.aBoolean636) {
			return;
		}
		@Pc(10) int local10 = super.aClass44_Sub2_21.U();
		@Pc(14) int local14 = super.aClass44_Sub2_21.BA();
		@Pc(26) float local26 = -((float) (local10 - local14) * 0.125F) + (float) local10;
		@Pc(36) float local36 = (float) local10 - (float) (local10 - local14) * 0.25F;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local36, local26, 1.0F / (float) super.aClass44_Sub2_21.method4288(), (float) super.aClass44_Sub2_21.method4359() / 255.0F);
		super.aClass44_Sub2_21.method4267(1);
		super.aClass44_Sub2_21.method4285(super.aClass44_Sub2_21.method4368());
		super.aClass44_Sub2_21.method4267(0);
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILclient!oa;B)V")
	@Override
	public void method7440(@OriginalArg(0) int arg0, @OriginalArg(1) Interface16 arg1) {
		super.aClass44_Sub2_21.method4265(arg1);
		super.aClass44_Sub2_21.method4335(arg0);
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7439(@OriginalArg(1) boolean arg0) {
		this.aBoolean635 = arg0;
		super.aClass44_Sub2_21.method4267(1);
		super.aClass44_Sub2_21.method4265(this.anInterface6_6);
		super.aClass44_Sub2_21.method4243(Static379.aClass117_7, Static435.aClass117_8);
		super.aClass44_Sub2_21.method4241(0, Static447.aClass328_3);
		super.aClass44_Sub2_21.method4258(true, 2, Static519.aClass328_4, false);
		super.aClass44_Sub2_21.method4312(0, Static283.aClass328_5);
		super.aClass44_Sub2_21.method4267(0);
		this.method7437();
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7431(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "(I)V")
	@Override
	public void method7434() {
		super.aClass44_Sub2_21.method4267(1);
		super.aClass44_Sub2_21.method4265(null);
		super.aClass44_Sub2_21.method4243(Static573.aClass117_9, Static573.aClass117_9);
		super.aClass44_Sub2_21.method4241(0, Static519.aClass328_4);
		super.aClass44_Sub2_21.method4241(2, Static447.aClass328_3);
		super.aClass44_Sub2_21.method4312(0, Static519.aClass328_4);
		super.aClass44_Sub2_21.method4267(0);
		if (this.aBoolean636) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean636 = false;
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IZI)V")
	@Override
	public void method7433(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7427() {
		return this.aBoolean637;
	}

	@OriginalMember(owner = "client!ti", name = "e", descriptor = "(I)V")
	@Override
	public void method7437() {
		@Pc(8) int local8 = super.aClass44_Sub2_21.method4328();
		@Pc(19) Class8_Sub3 local19 = super.aClass44_Sub2_21.method4304();
		if (this.aBoolean635) {
			OpenGL.glBindProgramARB(34336, local8 == Integer.MAX_VALUE ? this.aClass270_5.anInt7873 : this.aClass270_2.anInt7873);
		} else {
			OpenGL.glBindProgramARB(34336, ~local8 == Integer.MIN_VALUE ? this.aClass270_4.anInt7873 : this.aClass270_3.anInt7873);
		}
		OpenGL.glEnable(34336);
		this.aBoolean636 = true;
		local19.method1568(0.0F, -1.0F, this.aFloatArray58, (float) local8, 0.0F);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, this.aFloatArray58[0], this.aFloatArray58[1], this.aFloatArray58[2], this.aFloatArray58[3]);
		this.method7429();
	}
}
