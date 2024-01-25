import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ap")
public final class Class20_Sub1 extends Class20 {

	@OriginalMember(owner = "client!ap", name = "m", descriptor = "Lclient!qt;")
	private Class279 aClass279_1;

	@OriginalMember(owner = "client!ap", name = "u", descriptor = "Lclient!wca;")
	private final Class353 aClass353_1;

	@OriginalMember(owner = "client!ap", name = "s", descriptor = "Lclient!qi;")
	private final Class77_Sub3 aClass77_Sub3_1;

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Lclient!kga;Lclient!wca;)V")
	public Class20_Sub1(@OriginalArg(0) Class44_Sub3 arg0, @OriginalArg(1) Class353 arg1) {
		super(arg0);
		this.aClass353_1 = arg1;
		this.method257();
		this.aClass77_Sub3_1 = new Class77_Sub3(super.aClass44_Sub3_42, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass77_Sub3_1.method6673();
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Z)V")
	@Override
	public void method7867() {
		this.aClass279_1.method6798('\u0001');
		if (super.aClass44_Sub3_42.anInt5503 > 0) {
			super.aClass44_Sub3_42.method4648(1);
			super.aClass44_Sub3_42.method4605(null);
			super.aClass44_Sub3_42.method4679(1.0F, 0.0F);
			super.aClass44_Sub3_42.method4648(0);
		}
		super.aClass44_Sub3_42.method4621(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7862(@OriginalArg(0) boolean arg0) {
		if (super.aClass44_Sub3_42.anInt5503 > 0) {
			@Pc(17) float local17 = -0.5F / (float) super.aClass44_Sub3_42.anInt5503;
			super.aClass44_Sub3_42.method4648(1);
			Static523.aFloatArray60[2] = local17;
			Static523.aFloatArray60[1] = 0.0F;
			Static523.aFloatArray60[3] = super.aClass44_Sub3_42.aFloat168 * local17 + 0.25F;
			Static523.aFloatArray60[0] = 0.0F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static523.aFloatArray60, 0);
			OpenGL.glPopMatrix();
			super.aClass44_Sub3_42.method4679(0.5F, (float) super.aClass44_Sub3_42.anInt5503);
			super.aClass44_Sub3_42.method4605(this.aClass77_Sub3_1);
			super.aClass44_Sub3_42.method4648(0);
		}
		this.aClass279_1.method6798('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(B)V")
	private void method257() {
		this.aClass279_1 = new Class279(super.aClass44_Sub3_42, 2);
		this.aClass279_1.method6794(0);
		super.aClass44_Sub3_42.method4648(1);
		super.aClass44_Sub3_42.method4621(7681, 260);
		super.aClass44_Sub3_42.method4641(768, 0, 34168);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass44_Sub3_42.method4648(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass353_1.aBoolean708) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass279_1.method6799();
		this.aClass279_1.method6794(1);
		super.aClass44_Sub3_42.method4648(1);
		super.aClass44_Sub3_42.method4621(8448, 8448);
		super.aClass44_Sub3_42.method4641(768, 0, 5890);
		OpenGL.glDisable(3168);
		super.aClass44_Sub3_42.method4648(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass353_1.aBoolean708) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass279_1.method6799();
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method7868() {
		return true;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7870(@OriginalArg(1) boolean arg0) {
		super.aClass44_Sub3_42.method4621(260, 8448);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(III)V")
	@Override
	public void method7864(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass353_1.aBoolean708) {
				super.aClass44_Sub3_42.method4605(this.aClass353_1.aClass77_Sub2_1);
				Static523.aFloatArray60[1] = 0.0F;
				Static523.aFloatArray60[0] = 0.0F;
				Static523.aFloatArray60[3] = (float) (super.aClass44_Sub3_42.anInt5471 % 4000) / 4000.0F;
				Static523.aFloatArray60[2] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Static523.aFloatArray60, 0);
			} else {
				@Pc(57) int local57 = super.aClass44_Sub3_42.anInt5471 % 4000 * 16 / 4000;
				super.aClass44_Sub3_42.method4605(this.aClass353_1.aClass77_Sub1Array4[local57]);
			}
		} else if (this.aClass353_1.aBoolean708) {
			super.aClass44_Sub3_42.method4605(this.aClass353_1.aClass77_Sub2_1);
			Static523.aFloatArray60[2] = 0.0F;
			Static523.aFloatArray60[3] = 0.0F;
			Static523.aFloatArray60[1] = 0.0F;
			Static523.aFloatArray60[0] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static523.aFloatArray60, 0);
		} else {
			super.aClass44_Sub3_42.method4605(this.aClass353_1.aClass77_Sub1Array4[0]);
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lclient!jf;II)V")
	@Override
	public void method7863(@OriginalArg(0) Class77 arg0, @OriginalArg(1) int arg1) {
	}
}
