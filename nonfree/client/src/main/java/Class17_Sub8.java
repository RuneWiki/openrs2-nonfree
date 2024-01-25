import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rca")
public final class Class17_Sub8 extends Class17 {

	@OriginalMember(owner = "client!rca", name = "n", descriptor = "Z")
	private boolean aBoolean471;

	@OriginalMember(owner = "client!rca", name = "s", descriptor = "Z")
	private boolean aBoolean473;

	@OriginalMember(owner = "client!rca", name = "E", descriptor = "[F")
	private final float[] aFloatArray61 = new float[4];

	@OriginalMember(owner = "client!rca", name = "D", descriptor = "Lclient!oba;")
	private Class212 aClass212_5;

	@OriginalMember(owner = "client!rca", name = "m", descriptor = "Lclient!oba;")
	private Class212 aClass212_3;

	@OriginalMember(owner = "client!rca", name = "k", descriptor = "Lclient!oba;")
	private Class212 aClass212_2;

	@OriginalMember(owner = "client!rca", name = "A", descriptor = "Lclient!oba;")
	private Class212 aClass212_4;

	@OriginalMember(owner = "client!rca", name = "p", descriptor = "Z")
	private final boolean aBoolean472;

	@OriginalMember(owner = "client!rca", name = "<init>", descriptor = "(Lclient!ag;Lclient!kda;)V")
	public Class17_Sub8(@OriginalArg(0) Class9_Sub1_Sub1 arg0, @OriginalArg(1) Class160 arg1) {
		super(arg0);
		if (arg0.aBoolean50) {
			this.aClass212_5 = Static177.method3373(arg0, arg1.method4222("uw_ground_unlit", "gl"));
			this.aClass212_3 = Static177.method3373(arg0, arg1.method4222("uw_ground_lit", "gl"));
			this.aClass212_2 = Static177.method3373(arg0, arg1.method4222("uw_model_unlit", "gl"));
			this.aClass212_4 = Static177.method3373(arg0, arg1.method4222("uw_model_lit", "gl"));
			this.aBoolean472 = this.aClass212_4 != null & this.aClass212_5 != null & this.aClass212_3 != null & this.aClass212_2 != null;
		} else {
			this.aBoolean472 = false;
		}
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method6805(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(Z)V")
	@Override
	public void method6800() {
		if (this.aBoolean471) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean471 = false;
		}
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(Lclient!pb;II)V")
	@Override
	public void method6796(@OriginalArg(0) Interface14 arg0, @OriginalArg(1) int arg1) {
		super.aClass9_Sub1_19.method7712(arg0);
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(III)V")
	@Override
	public void method6794(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(BZ)V")
	@Override
	public void method6802(@OriginalArg(1) boolean arg0) {
		this.aBoolean473 = arg0;
	}

	@OriginalMember(owner = "client!rca", name = "d", descriptor = "(B)V")
	@Override
	public void method6806() {
		if (this.aBoolean471) {
			OpenGL.glProgramLocalParameter4fARB(34336, 0, (float) (super.aClass9_Sub1_19.CA() - 1280), (float) (super.aClass9_Sub1_19.CA() - 768), 1.0F / (float) super.aClass9_Sub1_19.method7754(), (float) super.aClass9_Sub1_19.method7657() / 255.0F);
		}
	}

	@OriginalMember(owner = "client!rca", name = "b", descriptor = "(B)V")
	@Override
	public void method6795() {
		@Pc(8) int local8 = super.aClass9_Sub1_19.method7752();
		@Pc(13) Class22_Sub3 local13 = super.aClass9_Sub1_19.method7679();
		local13.method5964(this.aFloatArray61, 0.0F, (float) local8, -1.0F, 0.0F);
		if (this.aBoolean473) {
			OpenGL.glBindProgramARB(34336, ~local8 == Integer.MIN_VALUE ? this.aClass212_3.anInt6305 : this.aClass212_4.anInt6305);
		} else {
			OpenGL.glBindProgramARB(34336, local8 == Integer.MAX_VALUE ? this.aClass212_5.anInt6305 : this.aClass212_2.anInt6305);
		}
		OpenGL.glEnable(34336);
		this.aBoolean471 = true;
		OpenGL.glProgramLocalParameter4fARB(34336, 1, this.aFloatArray61[0], this.aFloatArray61[1], this.aFloatArray61[2], this.aFloatArray61[3]);
		this.method6806();
	}

	@OriginalMember(owner = "client!rca", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method6799() {
		return this.aBoolean472;
	}
}
