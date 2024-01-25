import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nda")
public final class Class42_Sub4 extends Class42 {

	@OriginalMember(owner = "client!nda", name = "q", descriptor = "Z")
	private boolean aBoolean425;

	@OriginalMember(owner = "client!nda", name = "A", descriptor = "Z")
	private boolean aBoolean426;

	@OriginalMember(owner = "client!nda", name = "u", descriptor = "[F")
	private final float[] aFloatArray39 = new float[4];

	@OriginalMember(owner = "client!nda", name = "m", descriptor = "Lclient!ob;")
	private Class213 aClass213_1;

	@OriginalMember(owner = "client!nda", name = "B", descriptor = "Lclient!ob;")
	private Class213 aClass213_4;

	@OriginalMember(owner = "client!nda", name = "n", descriptor = "Lclient!ob;")
	private Class213 aClass213_2;

	@OriginalMember(owner = "client!nda", name = "o", descriptor = "Lclient!ob;")
	private Class213 aClass213_3;

	@OriginalMember(owner = "client!nda", name = "E", descriptor = "Z")
	private final boolean aBoolean427;

	@OriginalMember(owner = "client!nda", name = "<init>", descriptor = "(Lclient!ph;Lclient!kr;)V")
	public Class42_Sub4(@OriginalArg(0) Class122_Sub2_Sub2 arg0, @OriginalArg(1) Class171 arg1) {
		super(arg0);
		if (arg0.aBoolean494) {
			this.aClass213_1 = Static90.method1569(arg0, arg1.method4330("uw_ground_unlit", "gl"));
			this.aClass213_4 = Static90.method1569(arg0, arg1.method4330("uw_ground_lit", "gl"));
			this.aClass213_2 = Static90.method1569(arg0, arg1.method4330("uw_model_unlit", "gl"));
			this.aClass213_3 = Static90.method1569(arg0, arg1.method4330("uw_model_lit", "gl"));
			this.aBoolean427 = this.aClass213_3 != null & this.aClass213_2 != null & this.aClass213_4 != null & this.aClass213_1 != null;
		} else {
			this.aBoolean427 = false;
		}
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(I)V")
	@Override
	public void method6422() {
		if (this.aBoolean425) {
			OpenGL.glProgramLocalParameter4fARB(34336, 0, (float) (super.aClass122_Sub2_16.CA() - 1280), (float) (super.aClass122_Sub2_16.CA() - 768), 1.0F / (float) super.aClass122_Sub2_16.method5592(), (float) super.aClass122_Sub2_16.method5683() / 255.0F);
		}
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(IZI)V")
	@Override
	public void method6431(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!nda", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method6433() {
		return this.aBoolean427;
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6432(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!nda", name = "b", descriptor = "(I)V")
	@Override
	public void method6424() {
		if (this.aBoolean425) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean425 = false;
		}
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(ZILclient!sw;)V")
	@Override
	public void method6425(@OriginalArg(1) int arg0, @OriginalArg(2) Interface15 arg1) {
		super.aClass122_Sub2_16.method5651(arg1);
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(BZ)V")
	@Override
	public void method6429(@OriginalArg(1) boolean arg0) {
		this.aBoolean426 = arg0;
	}

	@OriginalMember(owner = "client!nda", name = "f", descriptor = "(I)V")
	@Override
	public void method6434() {
		@Pc(8) int local8 = super.aClass122_Sub2_16.method5565();
		@Pc(13) Class118_Sub3 local13 = super.aClass122_Sub2_16.method5679();
		local13.method6969(0.0F, -1.0F, (float) local8, 0.0F, this.aFloatArray39);
		if (this.aBoolean426) {
			OpenGL.glBindProgramARB(34336, ~local8 == Integer.MIN_VALUE ? this.aClass213_4.anInt6028 : this.aClass213_3.anInt6028);
		} else {
			OpenGL.glBindProgramARB(34336, ~local8 == Integer.MIN_VALUE ? this.aClass213_1.anInt6028 : this.aClass213_2.anInt6028);
		}
		OpenGL.glEnable(34336);
		this.aBoolean425 = true;
		OpenGL.glProgramLocalParameter4fARB(34336, 1, this.aFloatArray39[0], this.aFloatArray39[1], this.aFloatArray39[2], this.aFloatArray39[3]);
		this.method6422();
	}
}
