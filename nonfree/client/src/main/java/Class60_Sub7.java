import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class60_Sub7 extends Class60 {

	@OriginalMember(owner = "client!oe", name = "n", descriptor = "Z")
	private boolean aBoolean538;

	@OriginalMember(owner = "client!oe", name = "A", descriptor = "Z")
	private boolean aBoolean541;

	@OriginalMember(owner = "client!oe", name = "o", descriptor = "[F")
	private final float[] aFloatArray50 = new float[4];

	@OriginalMember(owner = "client!oe", name = "q", descriptor = "Z")
	private boolean aBoolean539 = false;

	@OriginalMember(owner = "client!oe", name = "m", descriptor = "Lclient!ll;")
	private Class228 aClass228_1;

	@OriginalMember(owner = "client!oe", name = "r", descriptor = "Lclient!ll;")
	private Class228 aClass228_2;

	@OriginalMember(owner = "client!oe", name = "s", descriptor = "Lclient!ll;")
	private Class228 aClass228_3;

	@OriginalMember(owner = "client!oe", name = "y", descriptor = "Lclient!ll;")
	private Class228 aClass228_4;

	@OriginalMember(owner = "client!oe", name = "C", descriptor = "Lclient!gl;")
	private Interface11 anInterface11_5;

	@OriginalMember(owner = "client!oe", name = "w", descriptor = "Z")
	private final boolean aBoolean540;

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Lclient!oia;Lclient!gj;)V")
	public Class60_Sub7(@OriginalArg(0) Class16_Sub1_Sub2 arg0, @OriginalArg(1) Class143 arg1) {
		super(arg0);
		if (arg1 != null && arg0.aBoolean578) {
			this.aClass228_1 = Static161.method2737(arg0, arg1.method3119("gl", "uw_ground_unlit"));
			this.aClass228_2 = Static161.method2737(arg0, arg1.method3119("gl", "uw_ground_lit"));
			this.aClass228_3 = Static161.method2737(arg0, arg1.method3119("gl", "uw_model_unlit"));
			this.aClass228_4 = Static161.method2737(arg0, arg1.method3119("gl", "uw_model_lit"));
			if (this.aClass228_2 != null & this.aClass228_1 != null & this.aClass228_3 != null & this.aClass228_4 != null) {
				this.anInterface11_5 = super.aClass16_Sub1_23.method6276(1, false, 2, new int[] { 0, -1 });
				this.anInterface11_5.method8761(false, false);
				this.aBoolean540 = true;
			} else {
				this.aBoolean540 = false;
			}
		} else {
			this.aBoolean540 = false;
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
	@Override
	public void method8294() {
		if (!this.aBoolean541) {
			return;
		}
		@Pc(6) int local6 = super.aClass16_Sub1_23.XA();
		@Pc(10) int local10 = super.aClass16_Sub1_23.i();
		@Pc(21) float local21 = (float) local6 - (float) (local6 - local10) * 0.125F;
		@Pc(32) float local32 = (float) local6 - (float) (local6 - local10) * 0.25F;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local32, local21, 1.0F / (float) super.aClass16_Sub1_23.method6224(), (float) super.aClass16_Sub1_23.method6254() / 255.0F);
		super.aClass16_Sub1_23.method6234(1);
		super.aClass16_Sub1_23.method6263(super.aClass16_Sub1_23.method6274());
		super.aClass16_Sub1_23.method6234(0);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!br;II)V")
	@Override
	public void method8295(@OriginalArg(0) Interface3 arg0, @OriginalArg(2) int arg1) {
		if (arg0 != null) {
			if (this.aBoolean539) {
				super.aClass16_Sub1_23.method6284(Static70.aClass188_1, 0);
				super.aClass16_Sub1_23.method6326(0, Static70.aClass188_1);
				this.aBoolean539 = false;
			}
			super.aClass16_Sub1_23.method6197(arg0);
			super.aClass16_Sub1_23.method6233(arg1);
		} else if (!this.aBoolean539) {
			super.aClass16_Sub1_23.method6197(super.aClass16_Sub1_23.anInterface3_3);
			super.aClass16_Sub1_23.method6233(1);
			super.aClass16_Sub1_23.method6284(Static622.aClass188_4, 0);
			super.aClass16_Sub1_23.method6326(0, Static622.aClass188_4);
			this.aBoolean539 = true;
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8302(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIB)V")
	@Override
	public void method8291(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8296() {
		return this.aBoolean540;
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(B)V")
	@Override
	public void method8299() {
		@Pc(8) int local8 = super.aClass16_Sub1_23.method6322();
		@Pc(13) Class25_Sub3 local13 = super.aClass16_Sub1_23.method6203();
		if (this.aBoolean538) {
			OpenGL.glBindProgramARB(34336, ~local8 == Integer.MIN_VALUE ? this.aClass228_2.anInt6206 : this.aClass228_4.anInt6206);
		} else {
			OpenGL.glBindProgramARB(34336, local8 == Integer.MAX_VALUE ? this.aClass228_1.anInt6206 : this.aClass228_3.anInt6206);
		}
		OpenGL.glEnable(34336);
		this.aBoolean541 = true;
		local13.method4317(0.0F, this.aFloatArray50, -1.0F, (float) local8, 0.0F);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, this.aFloatArray50[0], this.aFloatArray50[1], this.aFloatArray50[2], this.aFloatArray50[3]);
		this.method8294();
	}

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "(I)V")
	@Override
	public void method8300() {
		super.aClass16_Sub1_23.method6234(1);
		super.aClass16_Sub1_23.method6197((Interface3) null);
		super.aClass16_Sub1_23.method6241(Static458.aClass11_4, Static458.aClass11_4);
		super.aClass16_Sub1_23.method6284(Static70.aClass188_1, 0);
		super.aClass16_Sub1_23.method6284(Static262.aClass188_2, 2);
		super.aClass16_Sub1_23.method6326(0, Static70.aClass188_1);
		super.aClass16_Sub1_23.method6234(0);
		if (this.aBoolean539) {
			super.aClass16_Sub1_23.method6284(Static70.aClass188_1, 0);
			super.aClass16_Sub1_23.method6326(0, Static70.aClass188_1);
			this.aBoolean539 = false;
		}
		if (this.aBoolean541) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean541 = false;
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8293(@OriginalArg(1) boolean arg0) {
		this.aBoolean538 = arg0;
		super.aClass16_Sub1_23.method6234(1);
		super.aClass16_Sub1_23.method6197(this.anInterface11_5);
		super.aClass16_Sub1_23.method6241(Static19.aClass11_1, Static49.aClass11_2);
		super.aClass16_Sub1_23.method6284(Static262.aClass188_2, 0);
		super.aClass16_Sub1_23.method6277(Static70.aClass188_1, true, 2, false);
		super.aClass16_Sub1_23.method6326(0, Static622.aClass188_4);
		super.aClass16_Sub1_23.method6234(0);
		this.method8299();
	}
}
