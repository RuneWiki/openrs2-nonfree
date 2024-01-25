import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class2_Sub5 extends Class2 {

	@OriginalMember(owner = "client!mb", name = "v", descriptor = "Z")
	private boolean aBoolean446;

	@OriginalMember(owner = "client!mb", name = "G", descriptor = "Z")
	private boolean aBoolean447;

	@OriginalMember(owner = "client!mb", name = "p", descriptor = "[F")
	private final float[] aFloatArray53 = new float[4];

	@OriginalMember(owner = "client!mb", name = "t", descriptor = "Z")
	private final boolean aBoolean445;

	@OriginalMember(owner = "client!mb", name = "x", descriptor = "Lclient!wda;")
	private Class357 aClass357_5;

	@OriginalMember(owner = "client!mb", name = "q", descriptor = "Lclient!wda;")
	private Class357 aClass357_4;

	@OriginalMember(owner = "client!mb", name = "l", descriptor = "Lclient!wda;")
	private Class357 aClass357_2;

	@OriginalMember(owner = "client!mb", name = "o", descriptor = "Lclient!wda;")
	private Class357 aClass357_3;

	@OriginalMember(owner = "client!mb", name = "w", descriptor = "Lclient!cm;")
	private Interface5 anInterface5_3;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lclient!tba;Lclient!sea;)V")
	public Class2_Sub5(@OriginalArg(0) Class78_Sub1_Sub2 arg0, @OriginalArg(1) Class308 arg1) {
		super(arg0);
		if (arg1 != null && arg0.aBoolean650) {
			this.aClass357_5 = Static337.method5013(arg0, arg1.method6557("uw_ground_unlit", "gl"));
			this.aClass357_4 = Static337.method5013(arg0, arg1.method6557("uw_ground_lit", "gl"));
			this.aClass357_2 = Static337.method5013(arg0, arg1.method6557("uw_model_unlit", "gl"));
			this.aClass357_3 = Static337.method5013(arg0, arg1.method6557("uw_model_lit", "gl"));
			if (this.aClass357_3 != null & this.aClass357_4 != null & this.aClass357_5 != null & this.aClass357_2 != null) {
				this.anInterface5_3 = super.aClass78_Sub1_23.method6874(false, new int[] { 0, -1 }, 1, 2);
				this.anInterface5_3.method7314(false, false);
				this.aBoolean445 = true;
			} else {
				this.aBoolean445 = false;
			}
		} else {
			this.aBoolean445 = false;
		}
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)V")
	@Override
	public void method7899() {
		super.aClass78_Sub1_23.method6867(1);
		super.aClass78_Sub1_23.method6931(null);
		super.aClass78_Sub1_23.method6864(Static31.aClass118_1, Static31.aClass118_1);
		super.aClass78_Sub1_23.method6975(Static47.aClass148_1, 0);
		super.aClass78_Sub1_23.method6975(Static276.aClass148_4, 2);
		super.aClass78_Sub1_23.method6903(0, Static47.aClass148_1);
		super.aClass78_Sub1_23.method6867(0);
		if (this.aBoolean447) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean447 = false;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method7902() {
		return this.aBoolean445;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIB)V")
	@Override
	public void method7897(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
	@Override
	public void method7891() {
		if (!this.aBoolean447) {
			return;
		}
		@Pc(10) int local10 = super.aClass78_Sub1_23.U();
		@Pc(14) int local14 = super.aClass78_Sub1_23.BA();
		@Pc(25) float local25 = (float) local10 - (float) (local10 - local14) * 0.125F;
		@Pc(37) float local37 = -((float) (local10 - local14) * 0.25F) + (float) local10;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local37, local25, 1.0F / (float) super.aClass78_Sub1_23.method6905(), (float) super.aClass78_Sub1_23.method6924() / 255.0F);
		super.aClass78_Sub1_23.method6867(1);
		super.aClass78_Sub1_23.method6917(super.aClass78_Sub1_23.method6928());
		super.aClass78_Sub1_23.method6867(0);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7894(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(ZI)V")
	@Override
	public void method7901(@OriginalArg(0) boolean arg0) {
		this.aBoolean446 = arg0;
		super.aClass78_Sub1_23.method6867(1);
		super.aClass78_Sub1_23.method6931(this.anInterface5_3);
		super.aClass78_Sub1_23.method6864(Static585.aClass118_5, Static569.aClass118_4);
		super.aClass78_Sub1_23.method6975(Static276.aClass148_4, 0);
		super.aClass78_Sub1_23.method6959(false, 2, true, Static47.aClass148_1);
		super.aClass78_Sub1_23.method6903(0, Static226.aClass148_3);
		super.aClass78_Sub1_23.method6867(0);
		this.method7903();
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILclient!rga;I)V")
	@Override
	public void method7892(@OriginalArg(0) int arg0, @OriginalArg(1) Interface20 arg1) {
		super.aClass78_Sub1_23.method6931(arg1);
		super.aClass78_Sub1_23.method6943(arg0);
	}

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "(I)V")
	@Override
	public void method7903() {
		@Pc(8) int local8 = super.aClass78_Sub1_23.method6894();
		@Pc(13) Class34_Sub1 local13 = super.aClass78_Sub1_23.method6888();
		if (this.aBoolean446) {
			OpenGL.glBindProgramARB(34336, local8 == Integer.MAX_VALUE ? this.aClass357_4.anInt9525 : this.aClass357_3.anInt9525);
		} else {
			OpenGL.glBindProgramARB(34336, local8 == Integer.MAX_VALUE ? this.aClass357_5.anInt9525 : this.aClass357_2.anInt9525);
		}
		OpenGL.glEnable(34336);
		this.aBoolean447 = true;
		local13.method890(this.aFloatArray53, -1.0F, 0.0F, (float) local8, 0.0F);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, this.aFloatArray53[0], this.aFloatArray53[1], this.aFloatArray53[2], this.aFloatArray53[3]);
		this.method7891();
	}
}
