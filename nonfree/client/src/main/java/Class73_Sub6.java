import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pca")
public final class Class73_Sub6 extends Class73 {

	@OriginalMember(owner = "client!pca", name = "x", descriptor = "Z")
	private boolean aBoolean490;

	@OriginalMember(owner = "client!pca", name = "E", descriptor = "Z")
	private boolean aBoolean491;

	@OriginalMember(owner = "client!pca", name = "y", descriptor = "[F")
	private final float[] aFloatArray56 = new float[4];

	@OriginalMember(owner = "client!pca", name = "n", descriptor = "Z")
	private final boolean aBoolean489;

	@OriginalMember(owner = "client!pca", name = "z", descriptor = "Lclient!oi;")
	private Class215 aClass215_5;

	@OriginalMember(owner = "client!pca", name = "s", descriptor = "Lclient!oi;")
	private Class215 aClass215_3;

	@OriginalMember(owner = "client!pca", name = "q", descriptor = "Lclient!oi;")
	private Class215 aClass215_2;

	@OriginalMember(owner = "client!pca", name = "v", descriptor = "Lclient!oi;")
	private Class215 aClass215_4;

	@OriginalMember(owner = "client!pca", name = "<init>", descriptor = "(Lclient!tm;Lclient!dn;)V")
	public Class73_Sub6(@OriginalArg(0) Class4_Sub2_Sub2 arg0, @OriginalArg(1) Class69 arg1) {
		super(arg0);
		if (arg0.aBoolean618) {
			this.aClass215_5 = Static437.method4248(arg0, arg1.method1900("uw_ground_unlit", "gl"));
			this.aClass215_3 = Static437.method4248(arg0, arg1.method1900("uw_ground_lit", "gl"));
			this.aClass215_2 = Static437.method4248(arg0, arg1.method1900("uw_model_unlit", "gl"));
			this.aClass215_4 = Static437.method4248(arg0, arg1.method1900("uw_model_lit", "gl"));
			this.aBoolean489 = this.aClass215_2 != null & this.aClass215_5 != null & this.aClass215_3 != null & this.aClass215_4 != null;
		} else {
			this.aBoolean489 = false;
		}
	}

	@OriginalMember(owner = "client!pca", name = "f", descriptor = "(I)V")
	@Override
	public void method7574() {
		@Pc(16) int local16 = super.aClass4_Sub2_19.method7344();
		@Pc(21) Class128_Sub3 local21 = super.aClass4_Sub2_19.method7296();
		local21.method6896(-1.0F, 0.0F, 0.0F, (float) local16, this.aFloatArray56);
		if (this.aBoolean490) {
			OpenGL.glBindProgramARB(34336, local16 == Integer.MAX_VALUE ? this.aClass215_3.anInt6345 : this.aClass215_4.anInt6345);
		} else {
			OpenGL.glBindProgramARB(34336, local16 == Integer.MAX_VALUE ? this.aClass215_5.anInt6345 : this.aClass215_2.anInt6345);
		}
		OpenGL.glEnable(34336);
		this.aBoolean491 = true;
		OpenGL.glProgramLocalParameter4fARB(34336, 1, this.aFloatArray56[0], this.aFloatArray56[1], this.aFloatArray56[2], this.aFloatArray56[3]);
		this.method7565();
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(III)V")
	@Override
	public void method7566(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(ILclient!hv;I)V")
	@Override
	public void method7568(@OriginalArg(0) int arg0, @OriginalArg(1) Interface8 arg1) {
		super.aClass4_Sub2_19.method7316(arg1);
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7567(@OriginalArg(1) boolean arg0) {
		this.aBoolean490 = arg0;
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7561(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(Z)V")
	@Override
	public void method7562() {
		if (this.aBoolean491) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean491 = false;
		}
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(I)V")
	@Override
	public void method7565() {
		if (this.aBoolean491) {
			OpenGL.glProgramLocalParameter4fARB(34336, 0, (float) (super.aClass4_Sub2_19.CA() - 1280), (float) (super.aClass4_Sub2_19.CA() - 768), 1.0F / (float) super.aClass4_Sub2_19.method7321(), (float) super.aClass4_Sub2_19.method7335() / 255.0F);
		}
	}

	@OriginalMember(owner = "client!pca", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7569() {
		return this.aBoolean489;
	}
}
