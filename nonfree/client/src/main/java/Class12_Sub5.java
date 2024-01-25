import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!maa")
public final class Class12_Sub5 extends Class12 {

	@OriginalMember(owner = "client!maa", name = "u", descriptor = "Z")
	private boolean aBoolean459;

	@OriginalMember(owner = "client!maa", name = "H", descriptor = "Z")
	private boolean aBoolean461;

	@OriginalMember(owner = "client!maa", name = "w", descriptor = "[F")
	private final float[] aFloatArray43 = new float[4];

	@OriginalMember(owner = "client!maa", name = "E", descriptor = "Lclient!rga;")
	private Class286 aClass286_4;

	@OriginalMember(owner = "client!maa", name = "D", descriptor = "Lclient!rga;")
	private Class286 aClass286_3;

	@OriginalMember(owner = "client!maa", name = "r", descriptor = "Lclient!rga;")
	private Class286 aClass286_2;

	@OriginalMember(owner = "client!maa", name = "G", descriptor = "Lclient!rga;")
	private Class286 aClass286_5;

	@OriginalMember(owner = "client!maa", name = "A", descriptor = "Z")
	private final boolean aBoolean460;

	@OriginalMember(owner = "client!maa", name = "F", descriptor = "Lclient!hi;")
	private Interface10 anInterface10_2;

	@OriginalMember(owner = "client!maa", name = "<init>", descriptor = "(Lclient!jq;Lclient!om;)V")
	public Class12_Sub5(@OriginalArg(0) Class43_Sub1_Sub2 arg0, @OriginalArg(1) Class246 arg1) {
		super(arg0);
		if (arg1 != null && arg0.aBoolean385) {
			this.aClass286_4 = Static93.method2062(arg1.method5648("gl", "uw_ground_unlit"), arg0);
			this.aClass286_3 = Static93.method2062(arg1.method5648("gl", "uw_ground_lit"), arg0);
			this.aClass286_2 = Static93.method2062(arg1.method5648("gl", "uw_model_unlit"), arg0);
			this.aClass286_5 = Static93.method2062(arg1.method5648("gl", "uw_model_lit"), arg0);
			if (this.aClass286_5 != null & this.aClass286_4 != null & this.aClass286_3 != null & this.aClass286_2 != null) {
				this.anInterface10_2 = super.aClass43_Sub1_21.method4303(1, new int[] { 0, -1 }, false, 2);
				this.anInterface10_2.method6171(false, false);
				this.aBoolean460 = true;
			} else {
				this.aBoolean460 = false;
			}
		} else {
			this.aBoolean460 = false;
		}
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(BILclient!hw;)V")
	@Override
	public void method6840(@OriginalArg(1) int arg0, @OriginalArg(2) Interface11 arg1) {
		super.aClass43_Sub1_21.method4298(arg1);
		super.aClass43_Sub1_21.method4183(arg0);
	}

	@OriginalMember(owner = "client!maa", name = "b", descriptor = "(I)V")
	@Override
	public void method6842() {
		super.aClass43_Sub1_21.method4238(1);
		super.aClass43_Sub1_21.method4298(null);
		super.aClass43_Sub1_21.method4253(Static106.aClass37_2, Static106.aClass37_2);
		super.aClass43_Sub1_21.method4251(0, Static74.aClass252_1);
		super.aClass43_Sub1_21.method4251(2, Static88.aClass252_2);
		super.aClass43_Sub1_21.method4241(0, Static74.aClass252_1);
		super.aClass43_Sub1_21.method4238(0);
		if (this.aBoolean459) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean459 = false;
		}
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(I)V")
	@Override
	public void method6837() {
		@Pc(8) int local8 = super.aClass43_Sub1_21.method4206();
		@Pc(21) Class109_Sub3 local21 = super.aClass43_Sub1_21.method4195();
		if (this.aBoolean461) {
			OpenGL.glBindProgramARB(34336, ~local8 == Integer.MIN_VALUE ? this.aClass286_3.anInt7432 : this.aClass286_5.anInt7432);
		} else {
			OpenGL.glBindProgramARB(34336, ~local8 == Integer.MIN_VALUE ? this.aClass286_4.anInt7432 : this.aClass286_2.anInt7432);
		}
		OpenGL.glEnable(34336);
		this.aBoolean459 = true;
		local21.method7102(0.0F, this.aFloatArray43, 0.0F, -1.0F, (float) local8);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, this.aFloatArray43[0], this.aFloatArray43[1], this.aFloatArray43[2], this.aFloatArray43[3]);
		this.method6841();
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(III)V")
	@Override
	public void method6845(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!maa", name = "b", descriptor = "(ZB)V")
	@Override
	public void method6838(@OriginalArg(0) boolean arg0) {
		this.aBoolean461 = arg0;
		super.aClass43_Sub1_21.method4238(1);
		super.aClass43_Sub1_21.method4298(this.anInterface10_2);
		super.aClass43_Sub1_21.method4253(Static474.aClass37_3, Static587.aClass37_5);
		super.aClass43_Sub1_21.method4251(0, Static88.aClass252_2);
		super.aClass43_Sub1_21.method4268(Static74.aClass252_1, true, false, 2);
		super.aClass43_Sub1_21.method4241(0, Static165.aClass252_3);
		super.aClass43_Sub1_21.method4238(0);
		this.method6837();
	}

	@OriginalMember(owner = "client!maa", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method6846() {
		return this.aBoolean460;
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(ZB)V")
	@Override
	public void method6836(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!maa", name = "b", descriptor = "(B)V")
	@Override
	public void method6841() {
		if (!this.aBoolean459) {
			return;
		}
		@Pc(13) int local13 = super.aClass43_Sub1_21.U();
		@Pc(17) int local17 = super.aClass43_Sub1_21.BA();
		@Pc(29) float local29 = -((float) (local13 - local17) * 0.125F) + (float) local13;
		@Pc(39) float local39 = (float) local13 - (float) (local13 - local17) * 0.25F;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local39, local29, 1.0F / (float) super.aClass43_Sub1_21.method4244(), (float) super.aClass43_Sub1_21.method4257() / 255.0F);
		super.aClass43_Sub1_21.method4238(1);
		super.aClass43_Sub1_21.method4266(super.aClass43_Sub1_21.method4187());
		super.aClass43_Sub1_21.method4238(0);
	}
}
