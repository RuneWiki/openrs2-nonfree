import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eu")
public final class Class76_Sub1 extends Class76 {

	@OriginalMember(owner = "client!eu", name = "o", descriptor = "Lclient!cn;")
	private Class46 aClass46_2;

	@OriginalMember(owner = "client!eu", name = "v", descriptor = "Lclient!pe;")
	private final Class191 aClass191_1;

	@OriginalMember(owner = "client!eu", name = "l", descriptor = "Lclient!lp;")
	private final Class21_Sub3 aClass21_Sub3_1;

	@OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(Lclient!qg;Lclient!pe;)V")
	public Class76_Sub1(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) Class191 arg1) {
		super(arg0);
		this.aClass191_1 = arg1;
		this.method1546();
		this.aClass21_Sub3_1 = new Class21_Sub3(super.aClass121_Sub2_39, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass21_Sub3_1.method3423();
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(ILclient!go;B)V")
	@Override
	public void method5609(@OriginalArg(0) int arg0, @OriginalArg(1) Class21 arg1) {
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method5608(@OriginalArg(1) boolean arg0) {
		super.aClass121_Sub2_39.method4709(8448, 260);
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(IIB)V")
	@Override
	public void method5604(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg1 & 0x1) == 1) {
			if (this.aClass191_1.aBoolean403) {
				super.aClass121_Sub2_39.method4681(this.aClass191_1.aClass21_Sub1_1);
				Static256.aFloatArray21[3] = (float) (super.aClass121_Sub2_39.anInt5935 % 4000) / 4000.0F;
				Static256.aFloatArray21[1] = 0.0F;
				Static256.aFloatArray21[0] = 0.0F;
				Static256.aFloatArray21[2] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Static256.aFloatArray21, 0);
			} else {
				@Pc(26) int local26 = super.aClass121_Sub2_39.anInt5935 % 4000 * 16 / 4000;
				super.aClass121_Sub2_39.method4681(this.aClass191_1.aClass21_Sub2Array3[local26]);
			}
		} else if (this.aClass191_1.aBoolean403) {
			super.aClass121_Sub2_39.method4681(this.aClass191_1.aClass21_Sub1_1);
			Static256.aFloatArray21[3] = 0.0F;
			Static256.aFloatArray21[0] = 0.0F;
			Static256.aFloatArray21[1] = 0.0F;
			Static256.aFloatArray21[2] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static256.aFloatArray21, 0);
		} else {
			super.aClass121_Sub2_39.method4681(this.aClass191_1.aClass21_Sub2Array3[0]);
		}
	}

	@OriginalMember(owner = "client!eu", name = "c", descriptor = "(I)V")
	@Override
	public void method5613() {
		this.aClass46_2.method781('\u0001');
		if (super.aClass121_Sub2_39.anInt5945 > 0) {
			super.aClass121_Sub2_39.method4669(1);
			super.aClass121_Sub2_39.method4681(null);
			super.aClass121_Sub2_39.method4649(0.0F, 1.0F);
			super.aClass121_Sub2_39.method4669(0);
		}
		super.aClass121_Sub2_39.method4709(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5606() {
		return true;
	}

	@OriginalMember(owner = "client!eu", name = "c", descriptor = "(B)V")
	private void method1546() {
		this.aClass46_2 = new Class46(super.aClass121_Sub2_39, 2);
		this.aClass46_2.method778(0);
		super.aClass121_Sub2_39.method4669(1);
		super.aClass121_Sub2_39.method4709(260, 7681);
		super.aClass121_Sub2_39.method4692(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass121_Sub2_39.method4669(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass191_1.aBoolean403) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass46_2.method779();
		this.aClass46_2.method778(1);
		super.aClass121_Sub2_39.method4669(1);
		super.aClass121_Sub2_39.method4709(8448, 8448);
		super.aClass121_Sub2_39.method4692(0, 5890, 768);
		OpenGL.glDisable(3168);
		super.aClass121_Sub2_39.method4669(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass191_1.aBoolean403) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass46_2.method779();
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5611(@OriginalArg(0) boolean arg0) {
		if (super.aClass121_Sub2_39.anInt5945 > 0) {
			@Pc(13) float local13 = -0.5F / (float) super.aClass121_Sub2_39.anInt5945;
			super.aClass121_Sub2_39.method4669(1);
			Static256.aFloatArray21[2] = local13;
			Static256.aFloatArray21[3] = local13 * super.aClass121_Sub2_39.aFloat90 + 0.25F;
			Static256.aFloatArray21[0] = 0.0F;
			Static256.aFloatArray21[1] = 0.0F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static256.aFloatArray21, 0);
			OpenGL.glPopMatrix();
			super.aClass121_Sub2_39.method4649((float) super.aClass121_Sub2_39.anInt5945, 0.5F);
			super.aClass121_Sub2_39.method4681(this.aClass21_Sub3_1);
			super.aClass121_Sub2_39.method4669(0);
		}
		this.aClass46_2.method781('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}
}
