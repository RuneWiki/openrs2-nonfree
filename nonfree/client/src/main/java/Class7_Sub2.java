import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bba")
public final class Class7_Sub2 extends Class7 {

	@OriginalMember(owner = "client!bba", name = "v", descriptor = "Z")
	private boolean aBoolean54;

	@OriginalMember(owner = "client!bba", name = "E", descriptor = "Z")
	private boolean aBoolean55;

	@OriginalMember(owner = "client!bba", name = "t", descriptor = "Z")
	private boolean aBoolean53 = false;

	@OriginalMember(owner = "client!bba", name = "r", descriptor = "[F")
	private final float[] aFloatArray3 = new float[4];

	@OriginalMember(owner = "client!bba", name = "p", descriptor = "Lclient!oha;")
	private Class249 aClass249_1;

	@OriginalMember(owner = "client!bba", name = "I", descriptor = "Lclient!oha;")
	private Class249 aClass249_4;

	@OriginalMember(owner = "client!bba", name = "F", descriptor = "Lclient!oha;")
	private Class249 aClass249_3;

	@OriginalMember(owner = "client!bba", name = "D", descriptor = "Lclient!oha;")
	private Class249 aClass249_2;

	@OriginalMember(owner = "client!bba", name = "H", descriptor = "Z")
	private final boolean aBoolean56;

	@OriginalMember(owner = "client!bba", name = "z", descriptor = "Lclient!oia;")
	private Interface19 anInterface19_1;

	@OriginalMember(owner = "client!bba", name = "<init>", descriptor = "(Lclient!sb;Lclient!wu;)V")
	public Class7_Sub2(@OriginalArg(0) Class95_Sub3_Sub2 arg0, @OriginalArg(1) Class380 arg1) {
		super(arg0);
		if (arg1 != null && arg0.aBoolean643) {
			this.aClass249_1 = Static560.method7662(arg0, arg1.method8628("uw_ground_unlit", "gl"));
			this.aClass249_4 = Static560.method7662(arg0, arg1.method8628("uw_ground_lit", "gl"));
			this.aClass249_3 = Static560.method7662(arg0, arg1.method8628("uw_model_unlit", "gl"));
			this.aClass249_2 = Static560.method7662(arg0, arg1.method8628("uw_model_lit", "gl"));
			if (this.aClass249_2 != null & this.aClass249_4 != null & this.aClass249_1 != null & this.aClass249_3 != null) {
				this.anInterface19_1 = super.aClass95_Sub3_23.method7116(false, 2, 1, new int[] { 0, -1 });
				this.anInterface19_1.method3138(false, false);
				this.aBoolean56 = true;
			} else {
				this.aBoolean56 = false;
			}
		} else {
			this.aBoolean56 = false;
		}
	}

	@OriginalMember(owner = "client!bba", name = "f", descriptor = "(B)V")
	@Override
	public void method8136() {
		@Pc(8) int local8 = super.aClass95_Sub3_23.method7049();
		@Pc(19) Class177_Sub1 local19 = super.aClass95_Sub3_23.method7084();
		if (this.aBoolean55) {
			OpenGL.glBindProgramARB(34336, local8 == Integer.MAX_VALUE ? this.aClass249_4.anInt6326 : this.aClass249_2.anInt6326);
		} else {
			OpenGL.glBindProgramARB(34336, local8 == Integer.MAX_VALUE ? this.aClass249_1.anInt6326 : this.aClass249_3.anInt6326);
		}
		OpenGL.glEnable(34336);
		this.aBoolean54 = true;
		local19.method3845(this.aFloatArray3, -1.0F, 0.0F, 0.0F, (float) local8);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, this.aFloatArray3[0], this.aFloatArray3[1], this.aFloatArray3[2], this.aFloatArray3[3]);
		this.method8130();
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(IILclient!lo;)V")
	@Override
	public void method8126(@OriginalArg(0) int arg0, @OriginalArg(2) Interface17 arg1) {
		if (arg1 != null) {
			if (this.aBoolean53) {
				super.aClass95_Sub3_23.method7139(0, Static634.aClass291_4);
				super.aClass95_Sub3_23.method7095(0, Static634.aClass291_4);
				this.aBoolean53 = false;
			}
			super.aClass95_Sub3_23.method7112(arg1);
			super.aClass95_Sub3_23.method7026(arg0);
		} else if (!this.aBoolean53) {
			super.aClass95_Sub3_23.method7112(super.aClass95_Sub3_23.anInterface17_3);
			super.aClass95_Sub3_23.method7026(1);
			super.aClass95_Sub3_23.method7139(0, Static10.aClass291_1);
			super.aClass95_Sub3_23.method7095(0, Static10.aClass291_1);
			this.aBoolean53 = true;
		}
	}

	@OriginalMember(owner = "client!bba", name = "d", descriptor = "(B)V")
	@Override
	public void method8130() {
		if (!this.aBoolean54) {
			return;
		}
		@Pc(6) int local6 = super.aClass95_Sub3_23.XA();
		@Pc(10) int local10 = super.aClass95_Sub3_23.i();
		@Pc(22) float local22 = -((float) (local6 - local10) * 0.125F) + (float) local6;
		@Pc(33) float local33 = (float) local6 - (float) (local6 - local10) * 0.25F;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local33, local22, 1.0F / (float) super.aClass95_Sub3_23.method7115(), (float) super.aClass95_Sub3_23.method7108() / 255.0F);
		super.aClass95_Sub3_23.method7145(1);
		super.aClass95_Sub3_23.method7079(super.aClass95_Sub3_23.method7025());
		super.aClass95_Sub3_23.method7145(0);
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8125(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8120(@OriginalArg(1) boolean arg0) {
		this.aBoolean55 = arg0;
		super.aClass95_Sub3_23.method7145(1);
		super.aClass95_Sub3_23.method7112(this.anInterface19_1);
		super.aClass95_Sub3_23.method7023(Static225.aClass136_3, Static504.aClass136_8);
		super.aClass95_Sub3_23.method7139(0, Static185.aClass291_3);
		super.aClass95_Sub3_23.method7028(2, true, Static634.aClass291_4, false);
		super.aClass95_Sub3_23.method7095(0, Static10.aClass291_1);
		super.aClass95_Sub3_23.method7145(0);
		this.method8136();
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method8128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!bba", name = "b", descriptor = "(I)V")
	@Override
	public void method8127() {
		super.aClass95_Sub3_23.method7145(1);
		super.aClass95_Sub3_23.method7112(null);
		super.aClass95_Sub3_23.method7023(Static483.aClass136_6, Static483.aClass136_6);
		super.aClass95_Sub3_23.method7139(0, Static634.aClass291_4);
		super.aClass95_Sub3_23.method7139(2, Static185.aClass291_3);
		super.aClass95_Sub3_23.method7095(0, Static634.aClass291_4);
		super.aClass95_Sub3_23.method7145(0);
		if (this.aBoolean53) {
			super.aClass95_Sub3_23.method7139(0, Static634.aClass291_4);
			super.aClass95_Sub3_23.method7095(0, Static634.aClass291_4);
			this.aBoolean53 = false;
		}
		if (this.aBoolean54) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean54 = false;
		}
	}

	@OriginalMember(owner = "client!bba", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method8135() {
		return this.aBoolean56;
	}
}
