import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gaa")
public final class Class37_Sub3 extends Class37 {

	@OriginalMember(owner = "client!gaa", name = "u", descriptor = "Z")
	private boolean aBoolean275;

	@OriginalMember(owner = "client!gaa", name = "A", descriptor = "Z")
	private boolean aBoolean277;

	@OriginalMember(owner = "client!gaa", name = "B", descriptor = "[F")
	private final float[] aFloatArray20 = new float[4];

	@OriginalMember(owner = "client!gaa", name = "x", descriptor = "Z")
	private final boolean aBoolean276;

	@OriginalMember(owner = "client!gaa", name = "l", descriptor = "Lclient!uaa;")
	private Class311 aClass311_1;

	@OriginalMember(owner = "client!gaa", name = "v", descriptor = "Lclient!uaa;")
	private Class311 aClass311_4;

	@OriginalMember(owner = "client!gaa", name = "s", descriptor = "Lclient!uaa;")
	private Class311 aClass311_3;

	@OriginalMember(owner = "client!gaa", name = "q", descriptor = "Lclient!uaa;")
	private Class311 aClass311_2;

	@OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "(Lclient!nfa;Lclient!jo;)V")
	public Class37_Sub3(@OriginalArg(0) Class9_Sub3_Sub2 arg0, @OriginalArg(1) Class168 arg1) {
		super(arg0);
		if (arg0.aBoolean499) {
			this.aClass311_1 = Static356.method5768(arg0, arg1.method4450("uw_ground_unlit", "gl"));
			this.aClass311_4 = Static356.method5768(arg0, arg1.method4450("uw_ground_lit", "gl"));
			this.aClass311_3 = Static356.method5768(arg0, arg1.method4450("uw_model_unlit", "gl"));
			this.aClass311_2 = Static356.method5768(arg0, arg1.method4450("uw_model_lit", "gl"));
			this.aBoolean276 = this.aClass311_2 != null & this.aClass311_1 != null & this.aClass311_4 != null & this.aClass311_3 != null;
		} else {
			this.aBoolean276 = false;
		}
	}

	@OriginalMember(owner = "client!gaa", name = "b", descriptor = "(ZI)V")
	@Override
	public void method7565(@OriginalArg(0) boolean arg0) {
		this.aBoolean277 = arg0;
	}

	@OriginalMember(owner = "client!gaa", name = "b", descriptor = "(I)V")
	@Override
	public void method7556() {
		@Pc(12) int local12 = super.aClass9_Sub3_19.method5511();
		@Pc(17) Class8_Sub3 local17 = super.aClass9_Sub3_19.method5512();
		local17.method8183(0.0F, 0.0F, (float) local12, this.aFloatArray20, -1.0F);
		if (this.aBoolean277) {
			OpenGL.glBindProgramARB(34336, local12 == Integer.MAX_VALUE ? this.aClass311_4.anInt8967 : this.aClass311_2.anInt8967);
		} else {
			OpenGL.glBindProgramARB(34336, ~local12 == Integer.MIN_VALUE ? this.aClass311_1.anInt8967 : this.aClass311_3.anInt8967);
		}
		OpenGL.glEnable(34336);
		this.aBoolean275 = true;
		OpenGL.glProgramLocalParameter4fARB(34336, 1, this.aFloatArray20[0], this.aFloatArray20[1], this.aFloatArray20[2], this.aFloatArray20[3]);
		this.method7553();
	}

	@OriginalMember(owner = "client!gaa", name = "f", descriptor = "(I)V")
	@Override
	public void method7561() {
		if (this.aBoolean275) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean275 = false;
		}
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7559(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(III)V")
	@Override
	public void method7563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ILclient!ld;B)V")
	@Override
	public void method7552(@OriginalArg(0) int arg0, @OriginalArg(1) Interface10 arg1) {
		super.aClass9_Sub3_19.method5494(arg1);
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(B)V")
	@Override
	public void method7553() {
		if (this.aBoolean275) {
			OpenGL.glProgramLocalParameter4fARB(34336, 0, (float) (super.aClass9_Sub3_19.IA() - 1280), (float) (super.aClass9_Sub3_19.IA() - 768), 1.0F / (float) super.aClass9_Sub3_19.method5568(), (float) super.aClass9_Sub3_19.method5469() / 255.0F);
		}
	}

	@OriginalMember(owner = "client!gaa", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method7564() {
		return this.aBoolean276;
	}
}
