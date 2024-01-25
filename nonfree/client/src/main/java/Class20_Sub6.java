import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ik")
public final class Class20_Sub6 extends Class20 {

	@OriginalMember(owner = "client!ik", name = "u", descriptor = "Z")
	private boolean aBoolean310;

	@OriginalMember(owner = "client!ik", name = "z", descriptor = "Z")
	private boolean aBoolean311;

	@OriginalMember(owner = "client!ik", name = "q", descriptor = "[F")
	private final float[] aFloatArray21 = new float[4];

	@OriginalMember(owner = "client!ik", name = "t", descriptor = "Z")
	private boolean aBoolean309 = false;

	@OriginalMember(owner = "client!ik", name = "x", descriptor = "Lclient!aja;")
	private Class15 aClass15_3;

	@OriginalMember(owner = "client!ik", name = "B", descriptor = "Lclient!aja;")
	private Class15 aClass15_5;

	@OriginalMember(owner = "client!ik", name = "y", descriptor = "Lclient!aja;")
	private Class15 aClass15_4;

	@OriginalMember(owner = "client!ik", name = "s", descriptor = "Lclient!aja;")
	private Class15 aClass15_2;

	@OriginalMember(owner = "client!ik", name = "K", descriptor = "Z")
	private final boolean aBoolean312;

	@OriginalMember(owner = "client!ik", name = "m", descriptor = "Lclient!ada;")
	private Interface1 anInterface1_3;

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Lclient!nv;Lclient!bt;)V")
	public Class20_Sub6(@OriginalArg(0) Class33_Sub2_Sub1 arg0, @OriginalArg(1) Class34 arg1) {
		super(arg0);
		if (arg1 != null && arg0.aBoolean505) {
			this.aClass15_3 = Static47.method831(arg1.method1238("gl", "uw_ground_unlit"), arg0);
			this.aClass15_5 = Static47.method831(arg1.method1238("gl", "uw_ground_lit"), arg0);
			this.aClass15_4 = Static47.method831(arg1.method1238("gl", "uw_model_unlit"), arg0);
			this.aClass15_2 = Static47.method831(arg1.method1238("gl", "uw_model_lit"), arg0);
			if (this.aClass15_3 != null & this.aClass15_5 != null & this.aClass15_4 != null & this.aClass15_2 != null) {
				this.anInterface1_3 = super.aClass33_Sub2_21.method8273(false, 2, 1, new int[] { 0, -1 });
				this.anInterface1_3.method8629(false, false);
				this.aBoolean312 = true;
			} else {
				this.aBoolean312 = false;
			}
		} else {
			this.aBoolean312 = false;
		}
	}

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "(I)V")
	@Override
	public void method7966() {
		@Pc(13) int local13 = super.aClass33_Sub2_21.method8196();
		@Pc(18) Class92_Sub1 local18 = super.aClass33_Sub2_21.method8274();
		if (this.aBoolean311) {
			OpenGL.glBindProgramARB(34336, ~local13 == Integer.MIN_VALUE ? this.aClass15_5.anInt207 : this.aClass15_2.anInt207);
		} else {
			OpenGL.glBindProgramARB(34336, ~local13 == Integer.MIN_VALUE ? this.aClass15_3.anInt207 : this.aClass15_4.anInt207);
		}
		OpenGL.glEnable(34336);
		this.aBoolean310 = true;
		local18.method2294(-1.0F, (float) local13, 0.0F, 0.0F, this.aFloatArray21);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, this.aFloatArray21[0], this.aFloatArray21[1], this.aFloatArray21[2], this.aFloatArray21[3]);
		this.method7956();
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7967(@OriginalArg(0) boolean arg0) {
		this.aBoolean311 = arg0;
		super.aClass33_Sub2_21.method8235(1);
		super.aClass33_Sub2_21.method8159(this.anInterface1_3);
		super.aClass33_Sub2_21.method8280(Static489.aClass91_4, Static586.aClass91_5);
		super.aClass33_Sub2_21.method8239(0, Static228.aClass230_2);
		super.aClass33_Sub2_21.method8182(Static41.aClass230_1, true, false, 2);
		super.aClass33_Sub2_21.method8258(Static238.aClass230_3, 0);
		super.aClass33_Sub2_21.method8235(0);
		this.method7966();
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZILclient!gaa;)V")
	@Override
	public void method7965(@OriginalArg(1) int arg0, @OriginalArg(2) Interface14 arg1) {
		if (arg1 != null) {
			if (this.aBoolean309) {
				super.aClass33_Sub2_21.method8239(0, Static41.aClass230_1);
				super.aClass33_Sub2_21.method8258(Static41.aClass230_1, 0);
				this.aBoolean309 = false;
			}
			super.aClass33_Sub2_21.method8159(arg1);
			super.aClass33_Sub2_21.method8167(arg0);
		} else if (!this.aBoolean309) {
			super.aClass33_Sub2_21.method8159(super.aClass33_Sub2_21.anInterface14_3);
			super.aClass33_Sub2_21.method8167(1);
			super.aClass33_Sub2_21.method8239(0, Static238.aClass230_3);
			super.aClass33_Sub2_21.method8258(Static238.aClass230_3, 0);
			this.aBoolean309 = true;
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7969(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7961(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ik", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method7970() {
		return this.aBoolean312;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V")
	@Override
	public void method7956() {
		if (!this.aBoolean310) {
			return;
		}
		@Pc(14) int local14 = super.aClass33_Sub2_21.XA();
		@Pc(18) int local18 = super.aClass33_Sub2_21.i();
		@Pc(29) float local29 = -((float) (local14 - local18) * 0.125F) + (float) local14;
		@Pc(41) float local41 = -((float) (local14 - local18) * 0.25F) + (float) local14;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local41, local29, 1.0F / (float) super.aClass33_Sub2_21.method8177(), (float) super.aClass33_Sub2_21.method8186() / 255.0F);
		super.aClass33_Sub2_21.method8235(1);
		super.aClass33_Sub2_21.method8208(super.aClass33_Sub2_21.method8220());
		super.aClass33_Sub2_21.method8235(0);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Z)V")
	@Override
	public void method7960() {
		super.aClass33_Sub2_21.method8235(1);
		super.aClass33_Sub2_21.method8159((Interface14) null);
		super.aClass33_Sub2_21.method8280(Static435.aClass91_3, Static435.aClass91_3);
		super.aClass33_Sub2_21.method8239(0, Static41.aClass230_1);
		super.aClass33_Sub2_21.method8239(2, Static228.aClass230_2);
		super.aClass33_Sub2_21.method8258(Static41.aClass230_1, 0);
		super.aClass33_Sub2_21.method8235(0);
		if (this.aBoolean309) {
			super.aClass33_Sub2_21.method8239(0, Static41.aClass230_1);
			super.aClass33_Sub2_21.method8258(Static41.aClass230_1, 0);
			this.aBoolean309 = false;
		}
		if (this.aBoolean310) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean310 = false;
		}
	}
}
