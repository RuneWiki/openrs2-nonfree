import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ml")
public final class Class7_Sub9 extends Class7 {

	@OriginalMember(owner = "client!ml", name = "p", descriptor = "Z")
	private boolean aBoolean434;

	@OriginalMember(owner = "client!ml", name = "G", descriptor = "Z")
	private boolean aBoolean436;

	@OriginalMember(owner = "client!ml", name = "q", descriptor = "Z")
	private boolean aBoolean435 = false;

	@OriginalMember(owner = "client!ml", name = "w", descriptor = "[F")
	private final float[] aFloatArray54 = new float[4];

	@OriginalMember(owner = "client!ml", name = "n", descriptor = "Z")
	private final boolean aBoolean433;

	@OriginalMember(owner = "client!ml", name = "C", descriptor = "Lclient!dw;")
	private Class70 aClass70_4;

	@OriginalMember(owner = "client!ml", name = "A", descriptor = "Lclient!dw;")
	private Class70 aClass70_3;

	@OriginalMember(owner = "client!ml", name = "l", descriptor = "Lclient!dw;")
	private Class70 aClass70_1;

	@OriginalMember(owner = "client!ml", name = "r", descriptor = "Lclient!dw;")
	private Class70 aClass70_2;

	@OriginalMember(owner = "client!ml", name = "J", descriptor = "Lclient!ch;")
	private Interface3 anInterface3_5;

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lclient!no;Lclient!vd;)V")
	public Class7_Sub9(@OriginalArg(0) Class100_Sub1_Sub2 arg0, @OriginalArg(1) Class353 arg1) {
		super(arg0);
		if (arg1 != null && arg0.aBoolean491) {
			this.aClass70_4 = Static105.method1740(arg1.method8426("gl", "uw_ground_unlit"), arg0);
			this.aClass70_3 = Static105.method1740(arg1.method8426("gl", "uw_ground_lit"), arg0);
			this.aClass70_1 = Static105.method1740(arg1.method8426("gl", "uw_model_unlit"), arg0);
			this.aClass70_2 = Static105.method1740(arg1.method8426("gl", "uw_model_lit"), arg0);
			if (this.aClass70_2 != null & this.aClass70_4 != null & this.aClass70_3 != null & this.aClass70_1 != null) {
				this.anInterface3_5 = super.aClass100_Sub1_22.method6097(false, 1, new int[] { 0, -1 }, 2);
				this.anInterface3_5.method7839(false, false);
				this.aBoolean433 = true;
			} else {
				this.aBoolean433 = false;
			}
		} else {
			this.aBoolean433 = false;
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!bca;II)V")
	@Override
	public void method7186(@OriginalArg(0) Interface1 arg0, @OriginalArg(2) int arg1) {
		if (arg0 != null) {
			if (this.aBoolean435) {
				super.aClass100_Sub1_22.method6068(0, Static622.aClass187_4);
				super.aClass100_Sub1_22.method6146(0, Static622.aClass187_4);
				this.aBoolean435 = false;
			}
			super.aClass100_Sub1_22.method6033(arg0);
			super.aClass100_Sub1_22.method6092(arg1);
		} else if (!this.aBoolean435) {
			super.aClass100_Sub1_22.method6033(super.aClass100_Sub1_22.anInterface1_3);
			super.aClass100_Sub1_22.method6092(1);
			super.aClass100_Sub1_22.method6068(0, Static506.aClass187_3);
			super.aClass100_Sub1_22.method6146(0, Static506.aClass187_3);
			this.aBoolean435 = true;
		}
	}

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "(I)V")
	@Override
	public void method7197() {
		super.aClass100_Sub1_22.method6114(1);
		super.aClass100_Sub1_22.method6033((Interface1) null);
		super.aClass100_Sub1_22.method6039(Static266.aClass256_3, Static266.aClass256_3);
		super.aClass100_Sub1_22.method6068(0, Static622.aClass187_4);
		super.aClass100_Sub1_22.method6068(2, Static456.aClass187_2);
		super.aClass100_Sub1_22.method6146(0, Static622.aClass187_4);
		super.aClass100_Sub1_22.method6114(0);
		if (this.aBoolean435) {
			super.aClass100_Sub1_22.method6068(0, Static622.aClass187_4);
			super.aClass100_Sub1_22.method6146(0, Static622.aClass187_4);
			this.aBoolean435 = false;
		}
		if (this.aBoolean434) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean434 = false;
		}
	}

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "(Z)V")
	@Override
	public void method7188() {
		@Pc(8) int local8 = super.aClass100_Sub1_22.method6132();
		@Pc(13) Class154_Sub2 local13 = super.aClass100_Sub1_22.method6086();
		if (this.aBoolean436) {
			OpenGL.glBindProgramARB(34336, local8 == Integer.MAX_VALUE ? this.aClass70_3.anInt2258 : this.aClass70_2.anInt2258);
		} else {
			OpenGL.glBindProgramARB(34336, ~local8 == Integer.MIN_VALUE ? this.aClass70_4.anInt2258 : this.aClass70_1.anInt2258);
		}
		OpenGL.glEnable(34336);
		this.aBoolean434 = true;
		local13.method4537(this.aFloatArray54, 0.0F, (float) local8, 0.0F, -1.0F);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, this.aFloatArray54[0], this.aFloatArray54[1], this.aFloatArray54[2], this.aFloatArray54[3]);
		this.method7190();
	}

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "(Z)V")
	@Override
	public void method7190() {
		if (!this.aBoolean434) {
			return;
		}
		@Pc(14) int local14 = super.aClass100_Sub1_22.XA();
		@Pc(18) int local18 = super.aClass100_Sub1_22.i();
		@Pc(30) float local30 = -((float) (local14 - local18) * 0.125F) + (float) local14;
		@Pc(41) float local41 = (float) local14 - (float) (local14 - local18) * 0.25F;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local41, local30, 1.0F / (float) super.aClass100_Sub1_22.method6100(), (float) super.aClass100_Sub1_22.method6155() / 255.0F);
		super.aClass100_Sub1_22.method6114(1);
		super.aClass100_Sub1_22.method6154(super.aClass100_Sub1_22.method6072());
		super.aClass100_Sub1_22.method6114(0);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7195(@OriginalArg(1) boolean arg0) {
		this.aBoolean436 = arg0;
		super.aClass100_Sub1_22.method6114(1);
		super.aClass100_Sub1_22.method6033(this.anInterface3_5);
		super.aClass100_Sub1_22.method6039(Static436.aClass256_4, Static190.aClass256_2);
		super.aClass100_Sub1_22.method6068(0, Static456.aClass187_2);
		super.aClass100_Sub1_22.method6079(Static622.aClass187_4, true, 2, false);
		super.aClass100_Sub1_22.method6146(0, Static506.aClass187_3);
		super.aClass100_Sub1_22.method6114(0);
		this.method7188();
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(BII)V")
	@Override
	public void method7192(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7194() {
		return this.aBoolean433;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7187(@OriginalArg(0) boolean arg0) {
	}
}
