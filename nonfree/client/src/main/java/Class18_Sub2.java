import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class18_Sub2 extends Class18 {

	@OriginalMember(owner = "client!gg", name = "t", descriptor = "Z")
	private boolean aBoolean276;

	@OriginalMember(owner = "client!gg", name = "y", descriptor = "Z")
	private boolean aBoolean278;

	@OriginalMember(owner = "client!gg", name = "p", descriptor = "Z")
	private boolean aBoolean275 = false;

	@OriginalMember(owner = "client!gg", name = "o", descriptor = "[F")
	private final float[] aFloatArray23 = new float[4];

	@OriginalMember(owner = "client!gg", name = "B", descriptor = "Lclient!ap;")
	private Class21 aClass21_4;

	@OriginalMember(owner = "client!gg", name = "l", descriptor = "Lclient!ap;")
	private Class21 aClass21_1;

	@OriginalMember(owner = "client!gg", name = "w", descriptor = "Lclient!ap;")
	private Class21 aClass21_3;

	@OriginalMember(owner = "client!gg", name = "s", descriptor = "Lclient!ap;")
	private Class21 aClass21_2;

	@OriginalMember(owner = "client!gg", name = "v", descriptor = "Lclient!wk;")
	private Interface27 anInterface27_1;

	@OriginalMember(owner = "client!gg", name = "u", descriptor = "Z")
	private final boolean aBoolean277;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lclient!tk;Lclient!nd;)V")
	public Class18_Sub2(@OriginalArg(0) Class13_Sub3_Sub1 arg0, @OriginalArg(1) Class238 arg1) {
		super(arg0);
		if (arg1 != null && arg0.aBoolean658) {
			this.aClass21_4 = Static464.method6567(arg1.method5572("gl", "uw_ground_unlit"), arg0);
			this.aClass21_1 = Static464.method6567(arg1.method5572("gl", "uw_ground_lit"), arg0);
			this.aClass21_3 = Static464.method6567(arg1.method5572("gl", "uw_model_unlit"), arg0);
			this.aClass21_2 = Static464.method6567(arg1.method5572("gl", "uw_model_lit"), arg0);
			if (this.aClass21_3 != null & this.aClass21_1 != null & this.aClass21_4 != null & this.aClass21_2 != null) {
				this.anInterface27_1 = super.aClass13_Sub3_23.method8257(false, new int[] { 0, -1 }, 1, 2);
				this.anInterface27_1.method7134(false, false);
				this.aBoolean277 = true;
			} else {
				this.aBoolean277 = false;
			}
		} else {
			this.aBoolean277 = false;
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Z)V")
	@Override
	public void method8642() {
		super.aClass13_Sub3_23.method8230(1);
		super.aClass13_Sub3_23.method8234((Interface6) null);
		super.aClass13_Sub3_23.method8235(Static259.aClass269_4, Static259.aClass269_4);
		super.aClass13_Sub3_23.method8231(Static338.aClass43_3, 0);
		super.aClass13_Sub3_23.method8231(Static470.aClass43_5, 2);
		super.aClass13_Sub3_23.method8279(Static338.aClass43_3, 0);
		super.aClass13_Sub3_23.method8230(0);
		if (this.aBoolean275) {
			super.aClass13_Sub3_23.method8231(Static338.aClass43_3, 0);
			super.aClass13_Sub3_23.method8279(Static338.aClass43_3, 0);
			this.aBoolean275 = false;
		}
		if (this.aBoolean278) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean278 = false;
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method8641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)V")
	@Override
	public void method8635() {
		if (!this.aBoolean278) {
			return;
		}
		@Pc(16) int local16 = super.aClass13_Sub3_23.XA();
		@Pc(20) int local20 = super.aClass13_Sub3_23.i();
		@Pc(32) float local32 = -((float) (local16 - local20) * 0.125F) + (float) local16;
		@Pc(43) float local43 = (float) local16 - (float) (local16 - local20) * 0.25F;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local43, local32, 1.0F / (float) super.aClass13_Sub3_23.method8262(), (float) super.aClass13_Sub3_23.method8244() / 255.0F);
		super.aClass13_Sub3_23.method8230(1);
		super.aClass13_Sub3_23.method8212(super.aClass13_Sub3_23.method8283());
		super.aClass13_Sub3_23.method8230(0);
	}

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "(I)V")
	@Override
	public void method8638() {
		@Pc(10) int local10 = super.aClass13_Sub3_23.method8222();
		@Pc(15) Class51_Sub2 local15 = super.aClass13_Sub3_23.method8213();
		if (this.aBoolean276) {
			OpenGL.glBindProgramARB(34336, local10 == Integer.MAX_VALUE ? this.aClass21_1.anInt471 : this.aClass21_2.anInt471);
		} else {
			OpenGL.glBindProgramARB(34336, local10 == Integer.MAX_VALUE ? this.aClass21_4.anInt471 : this.aClass21_3.anInt471);
		}
		OpenGL.glEnable(34336);
		this.aBoolean278 = true;
		local15.method3251((float) local10, 0.0F, this.aFloatArray23, -1.0F, 0.0F);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, this.aFloatArray23[0], this.aFloatArray23[1], this.aFloatArray23[2], this.aFloatArray23[3]);
		this.method8635();
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8637(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!gg", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method8643() {
		return this.aBoolean277;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8632(@OriginalArg(1) boolean arg0) {
		this.aBoolean276 = arg0;
		super.aClass13_Sub3_23.method8230(1);
		super.aClass13_Sub3_23.method8234(this.anInterface27_1);
		super.aClass13_Sub3_23.method8235(Static398.aClass269_5, Static408.aClass269_3);
		super.aClass13_Sub3_23.method8231(Static470.aClass43_5, 0);
		super.aClass13_Sub3_23.method8277(false, true, Static338.aClass43_3, 2);
		super.aClass13_Sub3_23.method8279(Static287.aClass43_8, 0);
		super.aClass13_Sub3_23.method8230(0);
		this.method8638();
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IILclient!fe;)V")
	@Override
	public void method8645(@OriginalArg(0) int arg0, @OriginalArg(2) Interface6 arg1) {
		if (arg1 != null) {
			if (this.aBoolean275) {
				super.aClass13_Sub3_23.method8231(Static338.aClass43_3, 0);
				super.aClass13_Sub3_23.method8279(Static338.aClass43_3, 0);
				this.aBoolean275 = false;
			}
			super.aClass13_Sub3_23.method8234(arg1);
			super.aClass13_Sub3_23.method8204(arg0);
		} else if (!this.aBoolean275) {
			super.aClass13_Sub3_23.method8234(super.aClass13_Sub3_23.anInterface6_3);
			super.aClass13_Sub3_23.method8204(1);
			super.aClass13_Sub3_23.method8231(Static287.aClass43_8, 0);
			super.aClass13_Sub3_23.method8279(Static287.aClass43_8, 0);
			this.aBoolean275 = true;
		}
	}
}
