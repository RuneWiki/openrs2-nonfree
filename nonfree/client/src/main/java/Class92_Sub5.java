import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tfa")
public final class Class92_Sub5 extends Class92 {

	@OriginalMember(owner = "client!tfa", name = "m", descriptor = "Z")
	private boolean aBoolean554;

	@OriginalMember(owner = "client!tfa", name = "p", descriptor = "Z")
	private boolean aBoolean555;

	@OriginalMember(owner = "client!tfa", name = "t", descriptor = "[F")
	private final float[] aFloatArray50 = new float[4];

	@OriginalMember(owner = "client!tfa", name = "B", descriptor = "Lclient!waa;")
	private Class339 aClass339_4;

	@OriginalMember(owner = "client!tfa", name = "z", descriptor = "Lclient!waa;")
	private Class339 aClass339_3;

	@OriginalMember(owner = "client!tfa", name = "y", descriptor = "Lclient!waa;")
	private Class339 aClass339_2;

	@OriginalMember(owner = "client!tfa", name = "v", descriptor = "Lclient!waa;")
	private Class339 aClass339_1;

	@OriginalMember(owner = "client!tfa", name = "A", descriptor = "Z")
	private final boolean aBoolean556;

	@OriginalMember(owner = "client!tfa", name = "<init>", descriptor = "(Lclient!mc;Lclient!pq;)V")
	public Class92_Sub5(@OriginalArg(0) Class121_Sub2_Sub1 arg0, @OriginalArg(1) Class251 arg1) {
		super(arg0);
		if (arg0.aBoolean341) {
			this.aClass339_4 = Static487.method6723(arg0, arg1.method5836("gl", "uw_ground_unlit"));
			this.aClass339_3 = Static487.method6723(arg0, arg1.method5836("gl", "uw_ground_lit"));
			this.aClass339_2 = Static487.method6723(arg0, arg1.method5836("gl", "uw_model_unlit"));
			this.aClass339_1 = Static487.method6723(arg0, arg1.method5836("gl", "uw_model_lit"));
			this.aBoolean556 = this.aClass339_1 != null & this.aClass339_2 != null & this.aClass339_3 != null & this.aClass339_4 != null;
		} else {
			this.aBoolean556 = false;
		}
	}

	@OriginalMember(owner = "client!tfa", name = "b", descriptor = "(B)V")
	@Override
	public void method7747() {
		@Pc(8) int local8 = super.aClass121_Sub2_20.method7215();
		@Pc(13) Class34_Sub3 local13 = super.aClass121_Sub2_20.method7242();
		local13.method3771(-1.0F, this.aFloatArray50, (float) local8, 0.0F, 0.0F);
		if (this.aBoolean555) {
			OpenGL.glBindProgramARB(34336, local8 == Integer.MAX_VALUE ? this.aClass339_3.anInt9307 : this.aClass339_1.anInt9307);
		} else {
			OpenGL.glBindProgramARB(34336, ~local8 == Integer.MIN_VALUE ? this.aClass339_4.anInt9307 : this.aClass339_2.anInt9307);
		}
		OpenGL.glEnable(34336);
		this.aBoolean554 = true;
		OpenGL.glProgramLocalParameter4fARB(34336, 1, this.aFloatArray50[0], this.aFloatArray50[1], this.aFloatArray50[2], this.aFloatArray50[3]);
		this.method7750();
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Z)V")
	@Override
	public void method7750() {
		if (this.aBoolean554) {
			OpenGL.glProgramLocalParameter4fARB(34336, 0, (float) (super.aClass121_Sub2_20.IA() - 1280), (float) (super.aClass121_Sub2_20.IA() - 768), 1.0F / (float) super.aClass121_Sub2_20.method7247(), (float) super.aClass121_Sub2_20.method7283() / 255.0F);
		}
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(I)V")
	@Override
	public void method7748() {
		if (this.aBoolean554) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean554 = false;
		}
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(III)V")
	@Override
	public void method7751(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IILclient!aw;)V")
	@Override
	public void method7754(@OriginalArg(0) int arg0, @OriginalArg(2) Interface3 arg1) {
		super.aClass121_Sub2_20.method7167(arg1);
	}

	@OriginalMember(owner = "client!tfa", name = "c", descriptor = "(ZI)V")
	@Override
	public void method7756(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!tfa", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method7758() {
		return this.aBoolean556;
	}

	@OriginalMember(owner = "client!tfa", name = "b", descriptor = "(ZI)V")
	@Override
	public void method7749(@OriginalArg(0) boolean arg0) {
		this.aBoolean555 = arg0;
	}
}
