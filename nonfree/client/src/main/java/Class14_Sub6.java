import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oj")
public final class Class14_Sub6 extends Class14 {

	@OriginalMember(owner = "client!oj", name = "r", descriptor = "Z")
	private boolean aBoolean551;

	@OriginalMember(owner = "client!oj", name = "A", descriptor = "Z")
	private boolean aBoolean554;

	@OriginalMember(owner = "client!oj", name = "s", descriptor = "Z")
	private boolean aBoolean552 = false;

	@OriginalMember(owner = "client!oj", name = "B", descriptor = "[F")
	private final float[] aFloatArray61 = new float[4];

	@OriginalMember(owner = "client!oj", name = "u", descriptor = "Z")
	private final boolean aBoolean553;

	@OriginalMember(owner = "client!oj", name = "y", descriptor = "Lclient!hga;")
	private Class152 aClass152_5;

	@OriginalMember(owner = "client!oj", name = "q", descriptor = "Lclient!hga;")
	private Class152 aClass152_3;

	@OriginalMember(owner = "client!oj", name = "m", descriptor = "Lclient!hga;")
	private Class152 aClass152_2;

	@OriginalMember(owner = "client!oj", name = "w", descriptor = "Lclient!hga;")
	private Class152 aClass152_4;

	@OriginalMember(owner = "client!oj", name = "z", descriptor = "Lclient!kt;")
	private Interface12 anInterface12_3;

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lclient!og;Lclient!cb;)V")
	public Class14_Sub6(@OriginalArg(0) Class143_Sub1_Sub2 arg0, @OriginalArg(1) Class50 arg1) {
		super(arg0);
		if (arg1 != null && arg0.aBoolean542) {
			this.aClass152_5 = Static554.method3440(arg1.method892("gl", "uw_ground_unlit"), arg0);
			this.aClass152_3 = Static554.method3440(arg1.method892("gl", "uw_ground_lit"), arg0);
			this.aClass152_2 = Static554.method3440(arg1.method892("gl", "uw_model_unlit"), arg0);
			this.aClass152_4 = Static554.method3440(arg1.method892("gl", "uw_model_lit"), arg0);
			if (this.aClass152_5 != null & this.aClass152_3 != null & this.aClass152_2 != null & this.aClass152_4 != null) {
				this.anInterface12_3 = super.aClass143_Sub1_22.method6292(false, new int[] { 0, -1 }, 1, 2);
				this.anInterface12_3.method7449(false, false);
				this.aBoolean553 = true;
			} else {
				this.aBoolean553 = false;
			}
		} else {
			this.aBoolean553 = false;
		}
	}

	@OriginalMember(owner = "client!oj", name = "d", descriptor = "(I)V")
	@Override
	public void method8623() {
		@Pc(14) int local14 = super.aClass143_Sub1_22.method6364();
		@Pc(19) Class56_Sub2 local19 = super.aClass143_Sub1_22.method6281();
		if (this.aBoolean554) {
			OpenGL.glBindProgramARB(34336, ~local14 == Integer.MIN_VALUE ? this.aClass152_3.anInt3503 : this.aClass152_4.anInt3503);
		} else {
			OpenGL.glBindProgramARB(34336, local14 == Integer.MAX_VALUE ? this.aClass152_5.anInt3503 : this.aClass152_2.anInt3503);
		}
		OpenGL.glEnable(34336);
		this.aBoolean551 = true;
		local19.method6815((float) local14, 0.0F, -1.0F, 0.0F, this.aFloatArray61);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, this.aFloatArray61[0], this.aFloatArray61[1], this.aFloatArray61[2], this.aFloatArray61[3]);
		this.method8618();
	}

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(B)V")
	@Override
	public void method8619() {
		super.aClass143_Sub1_22.method6374(1);
		super.aClass143_Sub1_22.method6338((Interface4) null);
		super.aClass143_Sub1_22.method6370(Static600.aClass6_4, Static600.aClass6_4);
		super.aClass143_Sub1_22.method6290(Static663.aClass90_4, 0);
		super.aClass143_Sub1_22.method6290(Static85.aClass90_1, 2);
		super.aClass143_Sub1_22.method6391(0, Static663.aClass90_4);
		super.aClass143_Sub1_22.method6374(0);
		if (this.aBoolean552) {
			super.aClass143_Sub1_22.method6290(Static663.aClass90_4, 0);
			super.aClass143_Sub1_22.method6391(0, Static663.aClass90_4);
			this.aBoolean552 = false;
		}
		if (this.aBoolean551) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean551 = false;
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8617(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8625(@OriginalArg(0) boolean arg0) {
		this.aBoolean554 = arg0;
		super.aClass143_Sub1_22.method6374(1);
		super.aClass143_Sub1_22.method6338(this.anInterface12_3);
		super.aClass143_Sub1_22.method6370(Static460.aClass6_3, Static371.aClass6_2);
		super.aClass143_Sub1_22.method6290(Static85.aClass90_1, 0);
		super.aClass143_Sub1_22.method6291(2, false, Static663.aClass90_4, true);
		super.aClass143_Sub1_22.method6391(0, Static85.aClass90_2);
		super.aClass143_Sub1_22.method6374(0);
		this.method8623();
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILclient!dr;I)V")
	@Override
	public void method8620(@OriginalArg(1) Interface4 arg0, @OriginalArg(2) int arg1) {
		if (arg0 != null) {
			if (this.aBoolean552) {
				super.aClass143_Sub1_22.method6290(Static663.aClass90_4, 0);
				super.aClass143_Sub1_22.method6391(0, Static663.aClass90_4);
				this.aBoolean552 = false;
			}
			super.aClass143_Sub1_22.method6338(arg0);
			super.aClass143_Sub1_22.method6322(arg1);
		} else if (!this.aBoolean552) {
			super.aClass143_Sub1_22.method6338(super.aClass143_Sub1_22.anInterface4_3);
			super.aClass143_Sub1_22.method6322(1);
			super.aClass143_Sub1_22.method6290(Static85.aClass90_2, 0);
			super.aClass143_Sub1_22.method6391(0, Static85.aClass90_2);
			this.aBoolean552 = true;
		}
	}

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)V")
	@Override
	public void method8618() {
		if (!this.aBoolean551) {
			return;
		}
		@Pc(11) int local11 = super.aClass143_Sub1_22.XA();
		@Pc(15) int local15 = super.aClass143_Sub1_22.i();
		@Pc(26) float local26 = (float) local11 - (float) (local11 - local15) * 0.125F;
		@Pc(37) float local37 = (float) local11 - (float) (local11 - local15) * 0.25F;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local37, local26, 1.0F / (float) super.aClass143_Sub1_22.method6369(), (float) super.aClass143_Sub1_22.method6340() / 255.0F);
		super.aClass143_Sub1_22.method6374(1);
		super.aClass143_Sub1_22.method6293(super.aClass143_Sub1_22.method6294());
		super.aClass143_Sub1_22.method6374(0);
	}

	@OriginalMember(owner = "client!oj", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method8624() {
		return this.aBoolean553;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(III)V")
	@Override
	public void method8615(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
