import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class22_Sub1 extends Class22 {

	@OriginalMember(owner = "client!bb", name = "r", descriptor = "Z")
	private boolean aBoolean49;

	@OriginalMember(owner = "client!bb", name = "x", descriptor = "Z")
	private boolean aBoolean50;

	@OriginalMember(owner = "client!bb", name = "m", descriptor = "[F")
	private final float[] aFloatArray4 = new float[4];

	@OriginalMember(owner = "client!bb", name = "B", descriptor = "Z")
	private final boolean aBoolean51;

	@OriginalMember(owner = "client!bb", name = "w", descriptor = "Lclient!nm;")
	private Class222 aClass222_4;

	@OriginalMember(owner = "client!bb", name = "j", descriptor = "Lclient!nm;")
	private Class222 aClass222_1;

	@OriginalMember(owner = "client!bb", name = "t", descriptor = "Lclient!nm;")
	private Class222 aClass222_3;

	@OriginalMember(owner = "client!bb", name = "o", descriptor = "Lclient!nm;")
	private Class222 aClass222_2;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lclient!el;Lclient!pfa;)V")
	public Class22_Sub1(@OriginalArg(0) Class14_Sub2_Sub1 arg0, @OriginalArg(1) Class251 arg1) {
		super(arg0);
		if (arg0.aBoolean200) {
			this.aClass222_4 = Static285.method4647(arg0, arg1.method5762("uw_ground_unlit", "gl"));
			this.aClass222_1 = Static285.method4647(arg0, arg1.method5762("uw_ground_lit", "gl"));
			this.aClass222_3 = Static285.method4647(arg0, arg1.method5762("uw_model_unlit", "gl"));
			this.aClass222_2 = Static285.method4647(arg0, arg1.method5762("uw_model_lit", "gl"));
			this.aBoolean51 = this.aClass222_4 != null & this.aClass222_1 != null & this.aClass222_3 != null & this.aClass222_2 != null;
		} else {
			this.aBoolean51 = false;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(III)V")
	@Override
	public void method7654(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(B)V")
	@Override
	public void method7651() {
		@Pc(8) int local8 = super.aClass14_Sub2_20.method6918();
		@Pc(13) Class54_Sub3 local13 = super.aClass14_Sub2_20.method6992();
		local13.method5452((float) local8, 0.0F, -1.0F, this.aFloatArray4, 0.0F);
		if (this.aBoolean50) {
			OpenGL.glBindProgramARB(34336, local8 == Integer.MAX_VALUE ? this.aClass222_1.anInt6207 : this.aClass222_2.anInt6207);
		} else {
			OpenGL.glBindProgramARB(34336, local8 == Integer.MAX_VALUE ? this.aClass222_4.anInt6207 : this.aClass222_3.anInt6207);
		}
		OpenGL.glEnable(34336);
		this.aBoolean49 = true;
		OpenGL.glProgramLocalParameter4fARB(34336, 1, this.aFloatArray4[0], this.aFloatArray4[1], this.aFloatArray4[2], this.aFloatArray4[3]);
		this.method7649();
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7647() {
		return this.aBoolean51;
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(Z)V")
	@Override
	public void method7649() {
		if (this.aBoolean49) {
			OpenGL.glProgramLocalParameter4fARB(34336, 0, (float) (super.aClass14_Sub2_20.IA() - 1280), (float) (super.aClass14_Sub2_20.IA() - 768), 1.0F / (float) super.aClass14_Sub2_20.method7035(), (float) super.aClass14_Sub2_20.method6973() / 255.0F);
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(BILclient!gl;)V")
	@Override
	public void method7645(@OriginalArg(1) int arg0, @OriginalArg(2) Interface10 arg1) {
		super.aClass14_Sub2_20.method7034(arg1);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7642(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
	@Override
	public void method7643() {
		if (this.aBoolean49) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean49 = false;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7646(@OriginalArg(0) boolean arg0) {
		this.aBoolean50 = arg0;
	}
}
