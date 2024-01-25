import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bq")
public final class Class34_Sub2 extends Class34 {

	@OriginalMember(owner = "client!bq", name = "r", descriptor = "Z")
	private boolean aBoolean63;

	@OriginalMember(owner = "client!bq", name = "A", descriptor = "Z")
	private boolean aBoolean65;

	@OriginalMember(owner = "client!bq", name = "G", descriptor = "[F")
	private final float[] aFloatArray1 = new float[4];

	@OriginalMember(owner = "client!bq", name = "s", descriptor = "Z")
	private final boolean aBoolean64;

	@OriginalMember(owner = "client!bq", name = "z", descriptor = "Lclient!wq;")
	private Class362 aClass362_3;

	@OriginalMember(owner = "client!bq", name = "x", descriptor = "Lclient!wq;")
	private Class362 aClass362_2;

	@OriginalMember(owner = "client!bq", name = "w", descriptor = "Lclient!wq;")
	private Class362 aClass362_1;

	@OriginalMember(owner = "client!bq", name = "B", descriptor = "Lclient!wq;")
	private Class362 aClass362_4;

	@OriginalMember(owner = "client!bq", name = "y", descriptor = "Lclient!oi;")
	private Interface14 anInterface14_2;

	@OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(Lclient!hp;Lclient!pu;)V")
	public Class34_Sub2(@OriginalArg(0) Class134_Sub1_Sub1 arg0, @OriginalArg(1) Class270 arg1) {
		super(arg0);
		if (arg1 != null && arg0.aBoolean302) {
			this.aClass362_3 = Static27.method315(arg1.method5706("uw_ground_unlit", "gl"), arg0);
			this.aClass362_2 = Static27.method315(arg1.method5706("uw_ground_lit", "gl"), arg0);
			this.aClass362_1 = Static27.method315(arg1.method5706("uw_model_unlit", "gl"), arg0);
			this.aClass362_4 = Static27.method315(arg1.method5706("uw_model_lit", "gl"), arg0);
			if (this.aClass362_4 != null & this.aClass362_1 != null & this.aClass362_3 != null & this.aClass362_2 != null) {
				this.anInterface14_2 = super.aClass134_Sub1_21.method6821(2, false, new int[] { 0, -1 }, 1);
				this.anInterface14_2.method2130(false, false);
				this.aBoolean64 = true;
			} else {
				this.aBoolean64 = false;
			}
		} else {
			this.aBoolean64 = false;
		}
	}

	@OriginalMember(owner = "client!bq", name = "b", descriptor = "(ZI)V")
	@Override
	public void method7016(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!bq", name = "g", descriptor = "(I)V")
	@Override
	public void method7019() {
		if (!this.aBoolean63) {
			return;
		}
		@Pc(6) int local6 = super.aClass134_Sub1_21.U();
		@Pc(10) int local10 = super.aClass134_Sub1_21.BA();
		@Pc(22) float local22 = -((float) (local6 - local10) * 0.125F) + (float) local6;
		@Pc(34) float local34 = -((float) (local6 - local10) * 0.25F) + (float) local6;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local34, local22, 1.0F / (float) super.aClass134_Sub1_21.method6837(), (float) super.aClass134_Sub1_21.method6761() / 255.0F);
		super.aClass134_Sub1_21.method6788(1);
		super.aClass134_Sub1_21.method6738(super.aClass134_Sub1_21.method6734());
		super.aClass134_Sub1_21.method6788(0);
	}

	@OriginalMember(owner = "client!bq", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method7017() {
		return this.aBoolean64;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)V")
	@Override
	public void method7010() {
		@Pc(8) int local8 = super.aClass134_Sub1_21.method6784();
		@Pc(13) Class113_Sub3 local13 = super.aClass134_Sub1_21.method6847();
		if (this.aBoolean65) {
			OpenGL.glBindProgramARB(34336, local8 == Integer.MAX_VALUE ? this.aClass362_2.anInt9603 : this.aClass362_4.anInt9603);
		} else {
			OpenGL.glBindProgramARB(34336, local8 == Integer.MAX_VALUE ? this.aClass362_3.anInt9603 : this.aClass362_1.anInt9603);
		}
		OpenGL.glEnable(34336);
		this.aBoolean63 = true;
		local13.method6071(0.0F, -1.0F, (float) local8, 0.0F, this.aFloatArray1);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, this.aFloatArray1[0], this.aFloatArray1[1], this.aFloatArray1[2], this.aFloatArray1[3]);
		this.method7019();
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Z)V")
	@Override
	public void method7006() {
		super.aClass134_Sub1_21.method6788(1);
		super.aClass134_Sub1_21.method6766(null);
		super.aClass134_Sub1_21.method6770(Static292.aClass82_4, Static292.aClass82_4);
		super.aClass134_Sub1_21.method6742(0, Static430.aClass192_2);
		super.aClass134_Sub1_21.method6742(2, Static308.aClass192_1);
		super.aClass134_Sub1_21.method6816(0, Static430.aClass192_2);
		super.aClass134_Sub1_21.method6788(0);
		if (this.aBoolean63) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean63 = false;
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(III)V")
	@Override
	public void method7020(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lclient!bb;II)V")
	@Override
	public void method7011(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) int arg1) {
		super.aClass134_Sub1_21.method6766(arg0);
		super.aClass134_Sub1_21.method6724(arg1);
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7009(@OriginalArg(0) boolean arg0) {
		this.aBoolean65 = arg0;
		super.aClass134_Sub1_21.method6788(1);
		super.aClass134_Sub1_21.method6766(this.anInterface14_2);
		super.aClass134_Sub1_21.method6770(Static116.aClass82_3, Static447.aClass82_5);
		super.aClass134_Sub1_21.method6742(0, Static308.aClass192_1);
		super.aClass134_Sub1_21.method6791(true, Static430.aClass192_2, 2, false);
		super.aClass134_Sub1_21.method6816(0, Static493.aClass192_4);
		super.aClass134_Sub1_21.method6788(0);
		this.method7010();
	}
}
