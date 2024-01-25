import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
public final class Class4_Sub9 extends Class4 {

	@OriginalMember(owner = "client!qi", name = "s", descriptor = "Z")
	private boolean aBoolean610;

	@OriginalMember(owner = "client!qi", name = "w", descriptor = "Z")
	private boolean aBoolean612;

	@OriginalMember(owner = "client!qi", name = "p", descriptor = "Z")
	private boolean aBoolean609 = false;

	@OriginalMember(owner = "client!qi", name = "j", descriptor = "[F")
	private final float[] aFloatArray63 = new float[4];

	@OriginalMember(owner = "client!qi", name = "u", descriptor = "Z")
	private final boolean aBoolean611;

	@OriginalMember(owner = "client!qi", name = "o", descriptor = "Lclient!ru;")
	private Class310 aClass310_4;

	@OriginalMember(owner = "client!qi", name = "m", descriptor = "Lclient!ru;")
	private Class310 aClass310_3;

	@OriginalMember(owner = "client!qi", name = "i", descriptor = "Lclient!ru;")
	private Class310 aClass310_2;

	@OriginalMember(owner = "client!qi", name = "r", descriptor = "Lclient!ru;")
	private Class310 aClass310_5;

	@OriginalMember(owner = "client!qi", name = "l", descriptor = "Lclient!ec;")
	private Interface7 anInterface7_6;

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(Lclient!pa;Lclient!aj;)V")
	public Class4_Sub9(@OriginalArg(0) Class13_Sub1_Sub1 arg0, @OriginalArg(1) Class15 arg1) {
		super(arg0);
		if (arg1 != null && arg0.aBoolean546) {
			this.aClass310_4 = Static499.method7145(arg1.method533("gl", "uw_ground_unlit"), arg0);
			this.aClass310_3 = Static499.method7145(arg1.method533("gl", "uw_ground_lit"), arg0);
			this.aClass310_2 = Static499.method7145(arg1.method533("gl", "uw_model_unlit"), arg0);
			this.aClass310_5 = Static499.method7145(arg1.method533("gl", "uw_model_lit"), arg0);
			if (this.aClass310_2 != null & this.aClass310_3 != null & this.aClass310_4 != null & this.aClass310_5 != null) {
				this.anInterface7_6 = super.aClass13_Sub1_23.method7526(2, 1, false, new int[] { 0, -1 });
				this.anInterface7_6.method5805(false, false);
				this.aBoolean611 = true;
			} else {
				this.aBoolean611 = false;
			}
		} else {
			this.aBoolean611 = false;
		}
	}

	@OriginalMember(owner = "client!qi", name = "e", descriptor = "(B)V")
	@Override
	public void method7854() {
		@Pc(14) int local14 = super.aClass13_Sub1_23.method7532();
		@Pc(19) Class239_Sub3 local19 = super.aClass13_Sub1_23.method7412();
		if (this.aBoolean612) {
			OpenGL.glBindProgramARB(34336, ~local14 == Integer.MIN_VALUE ? this.aClass310_3.anInt8815 : this.aClass310_5.anInt8815);
		} else {
			OpenGL.glBindProgramARB(34336, local14 == Integer.MAX_VALUE ? this.aClass310_4.anInt8815 : this.aClass310_2.anInt8815);
		}
		OpenGL.glEnable(34336);
		this.aBoolean610 = true;
		local19.method9270(-1.0F, 0.0F, (float) local14, 0.0F, this.aFloatArray63);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, this.aFloatArray63[0], this.aFloatArray63[1], this.aFloatArray63[2], this.aFloatArray63[3]);
		this.method7853();
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7848() {
		return this.aBoolean611;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IBLclient!bm;)V")
	@Override
	public void method7859(@OriginalArg(0) int arg0, @OriginalArg(2) Interface3 arg1) {
		if (arg1 != null) {
			if (this.aBoolean609) {
				super.aClass13_Sub1_23.method7522(Static523.aClass326_5, 0);
				super.aClass13_Sub1_23.method7517(0, Static523.aClass326_5);
				this.aBoolean609 = false;
			}
			super.aClass13_Sub1_23.method7530(arg1);
			super.aClass13_Sub1_23.method7509(arg0);
		} else if (!this.aBoolean609) {
			super.aClass13_Sub1_23.method7530(super.aClass13_Sub1_23.anInterface3_3);
			super.aClass13_Sub1_23.method7509(1);
			super.aClass13_Sub1_23.method7522(Static348.aClass326_4, 0);
			super.aClass13_Sub1_23.method7517(0, Static348.aClass326_4);
			this.aBoolean609 = true;
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7852(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!qi", name = "f", descriptor = "(B)V")
	@Override
	public void method7858() {
		super.aClass13_Sub1_23.method7461(1);
		super.aClass13_Sub1_23.method7530((Interface3) null);
		super.aClass13_Sub1_23.method7521(Static580.aClass203_4, Static580.aClass203_4);
		super.aClass13_Sub1_23.method7522(Static523.aClass326_5, 0);
		super.aClass13_Sub1_23.method7522(Static125.aClass326_1, 2);
		super.aClass13_Sub1_23.method7517(0, Static523.aClass326_5);
		super.aClass13_Sub1_23.method7461(0);
		if (this.aBoolean609) {
			super.aClass13_Sub1_23.method7522(Static523.aClass326_5, 0);
			super.aClass13_Sub1_23.method7517(0, Static523.aClass326_5);
			this.aBoolean609 = false;
		}
		if (this.aBoolean610) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean610 = false;
		}
	}

	@OriginalMember(owner = "client!qi", name = "d", descriptor = "(B)V")
	@Override
	public void method7853() {
		if (!this.aBoolean610) {
			return;
		}
		@Pc(14) int local14 = super.aClass13_Sub1_23.XA();
		@Pc(18) int local18 = super.aClass13_Sub1_23.i();
		@Pc(29) float local29 = -((float) (local14 - local18) * 0.125F) + (float) local14;
		@Pc(41) float local41 = -((float) (local14 - local18) * 0.25F) + (float) local14;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local41, local29, 1.0F / (float) super.aClass13_Sub1_23.method7414(), (float) super.aClass13_Sub1_23.method7429() / 255.0F);
		super.aClass13_Sub1_23.method7461(1);
		super.aClass13_Sub1_23.method7539(super.aClass13_Sub1_23.method7467());
		super.aClass13_Sub1_23.method7461(0);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method7849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7856(@OriginalArg(0) boolean arg0) {
		this.aBoolean612 = arg0;
		super.aClass13_Sub1_23.method7461(1);
		super.aClass13_Sub1_23.method7530(this.anInterface7_6);
		super.aClass13_Sub1_23.method7521(Static265.aClass203_3, Static582.aClass203_5);
		super.aClass13_Sub1_23.method7522(Static125.aClass326_1, 0);
		super.aClass13_Sub1_23.method7498(true, false, 2, Static523.aClass326_5);
		super.aClass13_Sub1_23.method7517(0, Static348.aClass326_4);
		super.aClass13_Sub1_23.method7461(0);
		this.method7854();
	}
}
