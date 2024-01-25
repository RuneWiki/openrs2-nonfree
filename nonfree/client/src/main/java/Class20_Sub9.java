import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ur")
public final class Class20_Sub9 extends Class20 {

	@OriginalMember(owner = "client!ur", name = "i", descriptor = "Lclient!wca;")
	private final Class353 aClass353_6;

	@OriginalMember(owner = "client!ur", name = "j", descriptor = "Lclient!qt;")
	private final Class279 aClass279_5;

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(Lclient!kga;Lclient!wca;)V")
	public Class20_Sub9(@OriginalArg(0) Class44_Sub3 arg0, @OriginalArg(1) Class353 arg1) {
		super(arg0);
		this.aClass353_6 = arg1;
		this.aClass279_5 = new Class279(arg0, 2);
		this.aClass279_5.method6794(0);
		super.aClass44_Sub3_42.method4648(1);
		if (this.aClass353_6.aBoolean708) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass44_Sub3_42.method4648(0);
		this.aClass279_5.method6799();
		this.aClass279_5.method6794(1);
		super.aClass44_Sub3_42.method4648(1);
		if (this.aClass353_6.aBoolean708) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass44_Sub3_42.method4648(0);
		this.aClass279_5.method6799();
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Z)V")
	@Override
	public void method7867() {
		this.aClass279_5.method6798('\u0001');
		super.aClass44_Sub3_42.method4648(1);
		super.aClass44_Sub3_42.method4605(null);
		super.aClass44_Sub3_42.method4648(0);
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method7868() {
		return true;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(III)V")
	@Override
	public void method7864(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) float local14 = (float) ((arg0 & 0x3) + 1) * -5.0E-4F;
		@Pc(25) float local25 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(33) float local33 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		super.aClass44_Sub3_42.method4648(1);
		@Pc(46) boolean local46 = (arg0 & 0x80) != 0;
		if (local46) {
			Static279.aFloatArray45[0] = local33;
			Static279.aFloatArray45[3] = 0.0F;
			Static279.aFloatArray45[1] = 0.0F;
			Static279.aFloatArray45[2] = 0.0F;
		} else {
			Static279.aFloatArray45[0] = 0.0F;
			Static279.aFloatArray45[1] = 0.0F;
			Static279.aFloatArray45[3] = 0.0F;
			Static279.aFloatArray45[2] = local33;
		}
		OpenGL.glTexGenfv(8192, 9474, Static279.aFloatArray45, 0);
		Static279.aFloatArray45[3] = (float) super.aClass44_Sub3_42.anInt5471 * local14 % 1.0F;
		Static279.aFloatArray45[1] = local33;
		Static279.aFloatArray45[0] = 0.0F;
		Static279.aFloatArray45[2] = 0.0F;
		OpenGL.glTexGenfv(8193, 9474, Static279.aFloatArray45, 0);
		if (this.aClass353_6.aBoolean708) {
			Static279.aFloatArray45[2] = 0.0F;
			Static279.aFloatArray45[3] = (float) super.aClass44_Sub3_42.anInt5471 * local25 % 1.0F;
			Static279.aFloatArray45[1] = 0.0F;
			Static279.aFloatArray45[0] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static279.aFloatArray45, 0);
		} else {
			@Pc(159) int local159 = (int) (local25 * 16.0F * (float) super.aClass44_Sub3_42.anInt5471);
			super.aClass44_Sub3_42.method4605(this.aClass353_6.aClass77_Sub1Array3[local159 % 16]);
		}
		super.aClass44_Sub3_42.method4648(0);
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7862(@OriginalArg(0) boolean arg0) {
		this.aClass279_5.method6798('\u0000');
		if (this.aClass353_6.aBoolean708) {
			super.aClass44_Sub3_42.method4648(1);
			super.aClass44_Sub3_42.method4605(this.aClass353_6.aClass77_Sub2_2);
			super.aClass44_Sub3_42.method4648(0);
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lclient!jf;II)V")
	@Override
	public void method7863(@OriginalArg(0) Class77 arg0, @OriginalArg(1) int arg1) {
		super.aClass44_Sub3_42.method4605(arg0);
		super.aClass44_Sub3_42.method4658(arg1);
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7870(@OriginalArg(1) boolean arg0) {
	}
}
