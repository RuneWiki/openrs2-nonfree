import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class23_Sub2 extends Class23 {

	@OriginalMember(owner = "client!cc", name = "r", descriptor = "Z")
	private boolean aBoolean52;

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "Z")
	private boolean aBoolean53;

	@OriginalMember(owner = "client!cc", name = "w", descriptor = "[F")
	private final float[] aFloatArray1 = new float[4];

	@OriginalMember(owner = "client!cc", name = "k", descriptor = "Z")
	private boolean aBoolean54 = false;

	@OriginalMember(owner = "client!cc", name = "n", descriptor = "Z")
	private final boolean aBoolean51;

	@OriginalMember(owner = "client!cc", name = "l", descriptor = "Lclient!nh;")
	private Class250 aClass250_1;

	@OriginalMember(owner = "client!cc", name = "t", descriptor = "Lclient!nh;")
	private Class250 aClass250_3;

	@OriginalMember(owner = "client!cc", name = "o", descriptor = "Lclient!nh;")
	private Class250 aClass250_2;

	@OriginalMember(owner = "client!cc", name = "v", descriptor = "Lclient!nh;")
	private Class250 aClass250_4;

	@OriginalMember(owner = "client!cc", name = "p", descriptor = "Lclient!cf;")
	private Interface7 anInterface7_2;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lclient!dga;Lclient!lga;)V")
	public Class23_Sub2(@OriginalArg(0) Class75_Sub1_Sub1 arg0, @OriginalArg(1) Class223 arg1) {
		super(arg0);
		if (arg1 != null && arg0.aBoolean170) {
			this.aClass250_1 = Static658.method8771(arg1.method5284("gl", "uw_ground_unlit"), arg0);
			this.aClass250_3 = Static658.method8771(arg1.method5284("gl", "uw_ground_lit"), arg0);
			this.aClass250_2 = Static658.method8771(arg1.method5284("gl", "uw_model_unlit"), arg0);
			this.aClass250_4 = Static658.method8771(arg1.method5284("gl", "uw_model_lit"), arg0);
			if (this.aClass250_2 != null & this.aClass250_3 != null & this.aClass250_1 != null & this.aClass250_4 != null) {
				this.anInterface7_2 = super.aClass75_Sub1_22.method6727(2, false, new int[] { 0, -1 }, 1);
				this.anInterface7_2.method8723(false, false);
				this.aBoolean51 = true;
			} else {
				this.aBoolean51 = false;
			}
		} else {
			this.aBoolean51 = false;
		}
	}

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "(I)V")
	@Override
	public void method8163() {
		@Pc(8) int local8 = super.aClass75_Sub1_22.method6839();
		@Pc(13) Class109_Sub3 local13 = super.aClass75_Sub1_22.method6722();
		if (this.aBoolean52) {
			OpenGL.glBindProgramARB(34336, local8 == Integer.MAX_VALUE ? this.aClass250_3.anInt6875 : this.aClass250_4.anInt6875);
		} else {
			OpenGL.glBindProgramARB(34336, ~local8 == Integer.MIN_VALUE ? this.aClass250_1.anInt6875 : this.aClass250_2.anInt6875);
		}
		OpenGL.glEnable(34336);
		this.aBoolean53 = true;
		local13.method4348(0.0F, this.aFloatArray1, (float) local8, -1.0F, 0.0F);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, this.aFloatArray1[0], this.aFloatArray1[1], this.aFloatArray1[2], this.aFloatArray1[3]);
		this.method8171();
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V")
	@Override
	public void method8171() {
		if (!this.aBoolean53) {
			return;
		}
		@Pc(10) int local10 = super.aClass75_Sub1_22.XA();
		@Pc(14) int local14 = super.aClass75_Sub1_22.i();
		@Pc(25) float local25 = (float) local10 - (float) (local10 - local14) * 0.125F;
		@Pc(37) float local37 = -((float) (local10 - local14) * 0.25F) + (float) local10;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local37, local25, 1.0F / (float) super.aClass75_Sub1_22.method6729(), (float) super.aClass75_Sub1_22.method6810() / 255.0F);
		super.aClass75_Sub1_22.method6805(1);
		super.aClass75_Sub1_22.method6801(super.aClass75_Sub1_22.method6792());
		super.aClass75_Sub1_22.method6805(0);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8164() {
		return this.aBoolean51;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8166(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8161(@OriginalArg(1) boolean arg0) {
		this.aBoolean52 = arg0;
		super.aClass75_Sub1_22.method6805(1);
		super.aClass75_Sub1_22.method6814(this.anInterface7_2);
		super.aClass75_Sub1_22.method6743(Static399.aClass344_3, Static571.aClass344_5);
		super.aClass75_Sub1_22.method6795(0, Static389.aClass261_8);
		super.aClass75_Sub1_22.method6831(true, false, Static24.aClass261_1, 2);
		super.aClass75_Sub1_22.method6816(0, Static110.aClass261_3);
		super.aClass75_Sub1_22.method6805(0);
		this.method8163();
	}

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "(I)V")
	@Override
	public void method8167() {
		super.aClass75_Sub1_22.method6805(1);
		super.aClass75_Sub1_22.method6814((Interface1) null);
		super.aClass75_Sub1_22.method6743(Static257.aClass344_2, Static257.aClass344_2);
		super.aClass75_Sub1_22.method6795(0, Static24.aClass261_1);
		super.aClass75_Sub1_22.method6795(2, Static389.aClass261_8);
		super.aClass75_Sub1_22.method6816(0, Static24.aClass261_1);
		super.aClass75_Sub1_22.method6805(0);
		if (this.aBoolean54) {
			super.aClass75_Sub1_22.method6795(0, Static24.aClass261_1);
			super.aClass75_Sub1_22.method6816(0, Static24.aClass261_1);
			this.aBoolean54 = false;
		}
		if (this.aBoolean53) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean53 = false;
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIB)V")
	@Override
	public void method8160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IBLclient!ah;)V")
	@Override
	public void method8162(@OriginalArg(0) int arg0, @OriginalArg(2) Interface1 arg1) {
		if (arg1 != null) {
			if (this.aBoolean54) {
				super.aClass75_Sub1_22.method6795(0, Static24.aClass261_1);
				super.aClass75_Sub1_22.method6816(0, Static24.aClass261_1);
				this.aBoolean54 = false;
			}
			super.aClass75_Sub1_22.method6814(arg1);
			super.aClass75_Sub1_22.method6830(arg0);
		} else if (!this.aBoolean54) {
			super.aClass75_Sub1_22.method6814(super.aClass75_Sub1_22.anInterface1_3);
			super.aClass75_Sub1_22.method6830(1);
			super.aClass75_Sub1_22.method6795(0, Static110.aClass261_3);
			super.aClass75_Sub1_22.method6816(0, Static110.aClass261_3);
			this.aBoolean54 = true;
		}
	}
}
