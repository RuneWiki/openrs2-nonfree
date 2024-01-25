import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qca")
public final class Class19_Sub8 extends Class19 {

	@OriginalMember(owner = "client!qca", name = "s", descriptor = "Z")
	private boolean aBoolean555;

	@OriginalMember(owner = "client!qca", name = "t", descriptor = "Z")
	private boolean aBoolean556;

	@OriginalMember(owner = "client!qca", name = "w", descriptor = "[F")
	private final float[] aFloatArray82 = new float[4];

	@OriginalMember(owner = "client!qca", name = "L", descriptor = "Z")
	private boolean aBoolean558 = false;

	@OriginalMember(owner = "client!qca", name = "O", descriptor = "Z")
	private final boolean aBoolean559;

	@OriginalMember(owner = "client!qca", name = "M", descriptor = "Lclient!jfa;")
	private Class173 aClass173_5;

	@OriginalMember(owner = "client!qca", name = "v", descriptor = "Lclient!jfa;")
	private Class173 aClass173_2;

	@OriginalMember(owner = "client!qca", name = "z", descriptor = "Lclient!jfa;")
	private Class173 aClass173_3;

	@OriginalMember(owner = "client!qca", name = "G", descriptor = "Lclient!jfa;")
	private Class173 aClass173_4;

	@OriginalMember(owner = "client!qca", name = "x", descriptor = "Lclient!dg;")
	private Interface6 anInterface6_4;

	@OriginalMember(owner = "client!qca", name = "<init>", descriptor = "(Lclient!hj;Lclient!uu;)V")
	public Class19_Sub8(@OriginalArg(0) Class82_Sub3_Sub1 arg0, @OriginalArg(1) Class343 arg1) {
		super(arg0);
		if (arg1 != null && arg0.aBoolean324) {
			this.aClass173_5 = Static248.method4177(arg0, arg1.method8142("uw_ground_unlit", "gl"));
			this.aClass173_2 = Static248.method4177(arg0, arg1.method8142("uw_ground_lit", "gl"));
			this.aClass173_3 = Static248.method4177(arg0, arg1.method8142("uw_model_unlit", "gl"));
			this.aClass173_4 = Static248.method4177(arg0, arg1.method8142("uw_model_lit", "gl"));
			if (this.aClass173_2 != null & this.aClass173_5 != null & this.aClass173_3 != null & this.aClass173_4 != null) {
				this.anInterface6_4 = super.aClass82_Sub3_23.method5022(new int[] { 0, -1 }, 1, false, 2);
				this.anInterface6_4.method8506(false, false);
				this.aBoolean559 = true;
			} else {
				this.aBoolean559 = false;
			}
		} else {
			this.aBoolean559 = false;
		}
	}

	@OriginalMember(owner = "client!qca", name = "b", descriptor = "(Z)V")
	@Override
	public void method8277() {
		super.aClass82_Sub3_23.method4946(1);
		super.aClass82_Sub3_23.method4972((Interface10) null);
		super.aClass82_Sub3_23.method4908(Static131.aClass88_1, Static131.aClass88_1);
		super.aClass82_Sub3_23.method4928(0, Static527.aClass165_4);
		super.aClass82_Sub3_23.method4928(2, Static302.aClass165_1);
		super.aClass82_Sub3_23.method5028(Static527.aClass165_4, 0);
		super.aClass82_Sub3_23.method4946(0);
		if (this.aBoolean558) {
			super.aClass82_Sub3_23.method4928(0, Static527.aClass165_4);
			super.aClass82_Sub3_23.method5028(Static527.aClass165_4, 0);
			this.aBoolean558 = false;
		}
		if (this.aBoolean555) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean555 = false;
		}
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(IILclient!hba;)V")
	@Override
	public void method8273(@OriginalArg(0) int arg0, @OriginalArg(2) Interface10 arg1) {
		if (arg1 != null) {
			if (this.aBoolean558) {
				super.aClass82_Sub3_23.method4928(0, Static527.aClass165_4);
				super.aClass82_Sub3_23.method5028(Static527.aClass165_4, 0);
				this.aBoolean558 = false;
			}
			super.aClass82_Sub3_23.method4972(arg1);
			super.aClass82_Sub3_23.method5010(arg0);
		} else if (!this.aBoolean558) {
			super.aClass82_Sub3_23.method4972(super.aClass82_Sub3_23.anInterface10_3);
			super.aClass82_Sub3_23.method5010(1);
			super.aClass82_Sub3_23.method4928(0, Static430.aClass165_3);
			super.aClass82_Sub3_23.method5028(Static430.aClass165_3, 0);
			this.aBoolean558 = true;
		}
	}

	@OriginalMember(owner = "client!qca", name = "b", descriptor = "(III)V")
	@Override
	public void method8281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8286(@OriginalArg(0) boolean arg0) {
		this.aBoolean556 = arg0;
		super.aClass82_Sub3_23.method4946(1);
		super.aClass82_Sub3_23.method4972(this.anInterface6_4);
		super.aClass82_Sub3_23.method4908(Static443.aClass88_3, Static603.aClass88_5);
		super.aClass82_Sub3_23.method4928(0, Static302.aClass165_1);
		super.aClass82_Sub3_23.method5034(2, true, Static527.aClass165_4, false);
		super.aClass82_Sub3_23.method5028(Static430.aClass165_3, 0);
		super.aClass82_Sub3_23.method4946(0);
		this.method8275();
	}

	@OriginalMember(owner = "client!qca", name = "d", descriptor = "(Z)Z")
	@Override
	public boolean method8282() {
		return this.aBoolean559;
	}

	@OriginalMember(owner = "client!qca", name = "e", descriptor = "(Z)V")
	@Override
	public void method8284() {
		if (!this.aBoolean555) {
			return;
		}
		@Pc(6) int local6 = super.aClass82_Sub3_23.XA();
		@Pc(10) int local10 = super.aClass82_Sub3_23.i();
		@Pc(22) float local22 = -((float) (local6 - local10) * 0.125F) + (float) local6;
		@Pc(33) float local33 = -((float) (local6 - local10) * 0.25F) + (float) local6;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local33, local22, 1.0F / (float) super.aClass82_Sub3_23.method5021(), (float) super.aClass82_Sub3_23.method4919() / 255.0F);
		super.aClass82_Sub3_23.method4946(1);
		super.aClass82_Sub3_23.method4933(super.aClass82_Sub3_23.method5025());
		super.aClass82_Sub3_23.method4946(0);
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8274(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(Z)V")
	@Override
	public void method8275() {
		@Pc(8) int local8 = super.aClass82_Sub3_23.method4983();
		@Pc(13) Class31_Sub2 local13 = super.aClass82_Sub3_23.method4971();
		if (this.aBoolean556) {
			OpenGL.glBindProgramARB(34336, local8 == Integer.MAX_VALUE ? this.aClass173_2.anInt5118 : this.aClass173_4.anInt5118);
		} else {
			OpenGL.glBindProgramARB(34336, local8 == Integer.MAX_VALUE ? this.aClass173_5.anInt5118 : this.aClass173_3.anInt5118);
		}
		OpenGL.glEnable(34336);
		this.aBoolean555 = true;
		local13.method7665(-1.0F, 0.0F, (float) local8, this.aFloatArray82, 0.0F);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, this.aFloatArray82[0], this.aFloatArray82[1], this.aFloatArray82[2], this.aFloatArray82[3]);
		this.method8284();
	}
}
