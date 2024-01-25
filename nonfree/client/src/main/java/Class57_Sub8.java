import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!laa")
public final class Class57_Sub8 extends Class57 {

	@OriginalMember(owner = "client!laa", name = "u", descriptor = "Z")
	private boolean aBoolean480;

	@OriginalMember(owner = "client!laa", name = "C", descriptor = "Z")
	private boolean aBoolean483;

	@OriginalMember(owner = "client!laa", name = "F", descriptor = "[F")
	private final float[] aFloatArray58 = new float[4];

	@OriginalMember(owner = "client!laa", name = "t", descriptor = "Z")
	private boolean aBoolean479 = false;

	@OriginalMember(owner = "client!laa", name = "z", descriptor = "Z")
	private final boolean aBoolean482;

	@OriginalMember(owner = "client!laa", name = "K", descriptor = "Lclient!qv;")
	private Class286 aClass286_5;

	@OriginalMember(owner = "client!laa", name = "B", descriptor = "Lclient!qv;")
	private Class286 aClass286_3;

	@OriginalMember(owner = "client!laa", name = "A", descriptor = "Lclient!qv;")
	private Class286 aClass286_2;

	@OriginalMember(owner = "client!laa", name = "G", descriptor = "Lclient!qv;")
	private Class286 aClass286_4;

	@OriginalMember(owner = "client!laa", name = "I", descriptor = "Lclient!js;")
	private Interface15 anInterface15_4;

	@OriginalMember(owner = "client!laa", name = "<init>", descriptor = "(Lclient!hl;Lclient!ni;)V")
	public Class57_Sub8(@OriginalArg(0) Class5_Sub2_Sub2 arg0, @OriginalArg(1) Class223 arg1) {
		super(arg0);
		if (arg1 != null && arg0.aBoolean402) {
			this.aClass286_5 = Static424.method7421(arg1.method5948("gl", "uw_ground_unlit"), arg0);
			this.aClass286_3 = Static424.method7421(arg1.method5948("gl", "uw_ground_lit"), arg0);
			this.aClass286_2 = Static424.method7421(arg1.method5948("gl", "uw_model_unlit"), arg0);
			this.aClass286_4 = Static424.method7421(arg1.method5948("gl", "uw_model_lit"), arg0);
			if (this.aClass286_4 != null & this.aClass286_2 != null & this.aClass286_5 != null & this.aClass286_3 != null) {
				this.anInterface15_4 = super.aClass5_Sub2_23.method4015(2, 1, new int[] { 0, -1 }, false);
				this.anInterface15_4.method8452(false, false);
				this.aBoolean482 = true;
			} else {
				this.aBoolean482 = false;
			}
		} else {
			this.aBoolean482 = false;
		}
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(III)V")
	@Override
	public void method8710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8707(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!laa", name = "c", descriptor = "(I)V")
	@Override
	public void method8703() {
		super.aClass5_Sub2_23.method3954(1);
		super.aClass5_Sub2_23.method4008((Interface4) null);
		super.aClass5_Sub2_23.method4022(Static438.aClass144_3, Static438.aClass144_3);
		super.aClass5_Sub2_23.method4054(0, Static522.aClass80_4);
		super.aClass5_Sub2_23.method4054(2, Static347.aClass80_2);
		super.aClass5_Sub2_23.method3956(Static522.aClass80_4, 0);
		super.aClass5_Sub2_23.method3954(0);
		if (this.aBoolean479) {
			super.aClass5_Sub2_23.method4054(0, Static522.aClass80_4);
			super.aClass5_Sub2_23.method3956(Static522.aClass80_4, 0);
			this.aBoolean479 = false;
		}
		if (this.aBoolean480) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean480 = false;
		}
	}

	@OriginalMember(owner = "client!laa", name = "f", descriptor = "(I)V")
	@Override
	public void method8711() {
		@Pc(13) int local13 = super.aClass5_Sub2_23.method4020();
		@Pc(18) Class115_Sub3 local18 = super.aClass5_Sub2_23.method3959();
		if (this.aBoolean483) {
			OpenGL.glBindProgramARB(34336, local13 == Integer.MAX_VALUE ? this.aClass286_3.anInt8415 : this.aClass286_4.anInt8415);
		} else {
			OpenGL.glBindProgramARB(34336, ~local13 == Integer.MIN_VALUE ? this.aClass286_5.anInt8415 : this.aClass286_2.anInt8415);
		}
		OpenGL.glEnable(34336);
		this.aBoolean480 = true;
		local18.method6301(0.0F, -1.0F, (float) local13, this.aFloatArray58, 0.0F);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, this.aFloatArray58[0], this.aFloatArray58[1], this.aFloatArray58[2], this.aFloatArray58[3]);
		this.method8702();
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(IILclient!bl;)V")
	@Override
	public void method8706(@OriginalArg(1) int arg0, @OriginalArg(2) Interface4 arg1) {
		if (arg1 != null) {
			if (this.aBoolean479) {
				super.aClass5_Sub2_23.method4054(0, Static522.aClass80_4);
				super.aClass5_Sub2_23.method3956(Static522.aClass80_4, 0);
				this.aBoolean479 = false;
			}
			super.aClass5_Sub2_23.method4008(arg1);
			super.aClass5_Sub2_23.method4018(arg0);
		} else if (!this.aBoolean479) {
			super.aClass5_Sub2_23.method4008(super.aClass5_Sub2_23.anInterface4_3);
			super.aClass5_Sub2_23.method4018(1);
			super.aClass5_Sub2_23.method4054(0, Static115.aClass80_1);
			super.aClass5_Sub2_23.method3956(Static115.aClass80_1, 0);
			this.aBoolean479 = true;
		}
	}

	@OriginalMember(owner = "client!laa", name = "b", descriptor = "(I)V")
	@Override
	public void method8702() {
		if (!this.aBoolean480) {
			return;
		}
		@Pc(15) int local15 = super.aClass5_Sub2_23.XA();
		@Pc(19) int local19 = super.aClass5_Sub2_23.i();
		@Pc(31) float local31 = -((float) (local15 - local19) * 0.125F) + (float) local15;
		@Pc(42) float local42 = (float) local15 - (float) (local15 - local19) * 0.25F;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local42, local31, 1.0F / (float) super.aClass5_Sub2_23.method3951(), (float) super.aClass5_Sub2_23.method4021() / 255.0F);
		super.aClass5_Sub2_23.method3954(1);
		super.aClass5_Sub2_23.method3987(super.aClass5_Sub2_23.method4001());
		super.aClass5_Sub2_23.method3954(0);
	}

	@OriginalMember(owner = "client!laa", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8709() {
		return this.aBoolean482;
	}

	@OriginalMember(owner = "client!laa", name = "b", descriptor = "(IZ)V")
	@Override
	public void method8712(@OriginalArg(1) boolean arg0) {
		this.aBoolean483 = arg0;
		super.aClass5_Sub2_23.method3954(1);
		super.aClass5_Sub2_23.method4008(this.anInterface15_4);
		super.aClass5_Sub2_23.method4022(Static503.aClass144_4, Static558.aClass144_5);
		super.aClass5_Sub2_23.method4054(0, Static347.aClass80_2);
		super.aClass5_Sub2_23.method4029(2, true, Static522.aClass80_4, false);
		super.aClass5_Sub2_23.method3956(Static115.aClass80_1, 0);
		super.aClass5_Sub2_23.method3954(0);
		this.method8711();
	}
}
