import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class Class13_Sub5 extends Class13 {

	@OriginalMember(owner = "client!kk", name = "y", descriptor = "Z")
	private boolean aBoolean427;

	@OriginalMember(owner = "client!kk", name = "u", descriptor = "Z")
	private boolean aBoolean428;

	@OriginalMember(owner = "client!kk", name = "t", descriptor = "[F")
	private final float[] aFloatArray51 = new float[4];

	@OriginalMember(owner = "client!kk", name = "o", descriptor = "Z")
	private boolean aBoolean429 = false;

	@OriginalMember(owner = "client!kk", name = "z", descriptor = "Lclient!de;")
	private Class84 aClass84_3;

	@OriginalMember(owner = "client!kk", name = "v", descriptor = "Lclient!de;")
	private Class84 aClass84_4;

	@OriginalMember(owner = "client!kk", name = "p", descriptor = "Lclient!de;")
	private Class84 aClass84_1;

	@OriginalMember(owner = "client!kk", name = "r", descriptor = "Lclient!de;")
	private Class84 aClass84_2;

	@OriginalMember(owner = "client!kk", name = "F", descriptor = "Z")
	private final boolean aBoolean426;

	@OriginalMember(owner = "client!kk", name = "J", descriptor = "Lclient!wp;")
	private Interface26 anInterface26_4;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lclient!rda;Lclient!la;)V")
	public Class13_Sub5(@OriginalArg(0) Class57_Sub3_Sub1 arg0, @OriginalArg(1) Class208 arg1) {
		super(arg0);
		if (arg1 != null && arg0.aBoolean650) {
			this.aClass84_3 = Static283.method4153(arg1.method4999("uw_ground_unlit", "gl"), arg0);
			this.aClass84_4 = Static283.method4153(arg1.method4999("uw_ground_lit", "gl"), arg0);
			this.aClass84_1 = Static283.method4153(arg1.method4999("uw_model_unlit", "gl"), arg0);
			this.aClass84_2 = Static283.method4153(arg1.method4999("uw_model_lit", "gl"), arg0);
			if (this.aClass84_2 != null & this.aClass84_3 != null & this.aClass84_4 != null & this.aClass84_1 != null) {
				this.anInterface26_4 = super.aClass57_Sub3_21.method7787(new int[] { 0, -1 }, 2, 1, false);
				this.anInterface26_4.method4348(false, false);
				this.aBoolean426 = true;
			} else {
				this.aBoolean426 = false;
			}
		} else {
			this.aBoolean426 = false;
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8262(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)V")
	@Override
	public void method8261() {
		super.aClass57_Sub3_21.method7795(1);
		super.aClass57_Sub3_21.method7813((Interface22) null);
		super.aClass57_Sub3_21.method7733(Static313.aClass34_88, Static313.aClass34_88);
		super.aClass57_Sub3_21.method7866(0, Static57.aClass312_1);
		super.aClass57_Sub3_21.method7866(2, Static291.aClass312_3);
		super.aClass57_Sub3_21.method7781(0, Static57.aClass312_1);
		super.aClass57_Sub3_21.method7795(0);
		if (this.aBoolean429) {
			super.aClass57_Sub3_21.method7866(0, Static57.aClass312_1);
			super.aClass57_Sub3_21.method7781(0, Static57.aClass312_1);
			this.aBoolean429 = false;
		}
		if (this.aBoolean427) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean427 = false;
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IILclient!rca;)V")
	@Override
	public void method8274(@OriginalArg(0) int arg0, @OriginalArg(2) Interface22 arg1) {
		if (arg1 != null) {
			if (this.aBoolean429) {
				super.aClass57_Sub3_21.method7866(0, Static57.aClass312_1);
				super.aClass57_Sub3_21.method7781(0, Static57.aClass312_1);
				this.aBoolean429 = false;
			}
			super.aClass57_Sub3_21.method7813(arg1);
			super.aClass57_Sub3_21.method7764(arg0);
		} else if (!this.aBoolean429) {
			super.aClass57_Sub3_21.method7813(super.aClass57_Sub3_21.anInterface22_3);
			super.aClass57_Sub3_21.method7764(1);
			super.aClass57_Sub3_21.method7866(0, Static79.aClass312_2);
			super.aClass57_Sub3_21.method7781(0, Static79.aClass312_2);
			this.aBoolean429 = true;
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIB)V")
	@Override
	public void method8263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8273(@OriginalArg(0) boolean arg0) {
		this.aBoolean428 = arg0;
		super.aClass57_Sub3_21.method7795(1);
		super.aClass57_Sub3_21.method7813(this.anInterface26_4);
		super.aClass57_Sub3_21.method7733(Static362.aClass34_172, Static141.aClass34_77);
		super.aClass57_Sub3_21.method7866(0, Static291.aClass312_3);
		super.aClass57_Sub3_21.method7750(false, 2, true, Static57.aClass312_1);
		super.aClass57_Sub3_21.method7781(0, Static79.aClass312_2);
		super.aClass57_Sub3_21.method7795(0);
		this.method8269();
	}

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "(I)V")
	@Override
	public void method8272() {
		if (!this.aBoolean427) {
			return;
		}
		@Pc(6) int local6 = super.aClass57_Sub3_21.XA();
		@Pc(10) int local10 = super.aClass57_Sub3_21.i();
		@Pc(22) float local22 = -((float) (local6 - local10) * 0.125F) + (float) local6;
		@Pc(34) float local34 = -((float) (local6 - local10) * 0.25F) + (float) local6;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local34, local22, 1.0F / (float) super.aClass57_Sub3_21.method7794(), (float) super.aClass57_Sub3_21.method7758() / 255.0F);
		super.aClass57_Sub3_21.method7795(1);
		super.aClass57_Sub3_21.method7806(super.aClass57_Sub3_21.method7792());
		super.aClass57_Sub3_21.method7795(0);
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8270() {
		return this.aBoolean426;
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(B)V")
	@Override
	public void method8269() {
		@Pc(13) int local13 = super.aClass57_Sub3_21.method7756();
		@Pc(18) Class203_Sub1 local18 = super.aClass57_Sub3_21.method7867();
		if (this.aBoolean428) {
			OpenGL.glBindProgramARB(34336, ~local13 == Integer.MIN_VALUE ? this.aClass84_4.anInt1604 : this.aClass84_2.anInt1604);
		} else {
			OpenGL.glBindProgramARB(34336, ~local13 == Integer.MIN_VALUE ? this.aClass84_3.anInt1604 : this.aClass84_1.anInt1604);
		}
		OpenGL.glEnable(34336);
		this.aBoolean427 = true;
		local18.method4840(this.aFloatArray51, 0.0F, 0.0F, (float) local13, -1.0F);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, this.aFloatArray51[0], this.aFloatArray51[1], this.aFloatArray51[2], this.aFloatArray51[3]);
		this.method8272();
	}
}
