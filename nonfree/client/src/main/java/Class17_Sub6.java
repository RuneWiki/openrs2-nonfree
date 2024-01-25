import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ms")
public final class Class17_Sub6 extends Class17 {

	@OriginalMember(owner = "client!ms", name = "w", descriptor = "Lclient!rn;")
	private Class213 aClass213_5;

	@OriginalMember(owner = "client!ms", name = "v", descriptor = "Lclient!uo;")
	private final Class249 aClass249_4;

	@OriginalMember(owner = "client!ms", name = "o", descriptor = "Lclient!ac;")
	private final Class3_Sub1 aClass3_Sub1_1;

	@OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(Lclient!kd;Lclient!uo;)V")
	public Class17_Sub6(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) Class249 arg1) {
		super(arg0);
		this.aClass249_4 = arg1;
		this.method3809();
		this.aClass3_Sub1_1 = new Class3_Sub1(super.aClass39_Sub2_41, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass3_Sub1_1.method92();
	}

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5675() {
		return true;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IZ)V")
	@Override
	public void method5674(@OriginalArg(1) boolean arg0) {
		super.aClass39_Sub2_41.method3156(8448, 260);
	}

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "(B)V")
	@Override
	public void method5672() {
		this.aClass213_5.method4857('\u0001');
		if (super.aClass39_Sub2_41.anInt3797 > 0) {
			super.aClass39_Sub2_41.method3221(1);
			super.aClass39_Sub2_41.method3203(null);
			super.aClass39_Sub2_41.method3211(0.0F, 1.0F);
			super.aClass39_Sub2_41.method3221(0);
		}
		super.aClass39_Sub2_41.method3156(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(III)V")
	@Override
	public void method5671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg1 & 0x1) == 1) {
			if (this.aClass249_4.aBoolean456) {
				super.aClass39_Sub2_41.method3203(this.aClass249_4.aClass3_Sub4_3);
				Static16.aFloatArray2[3] = (float) (super.aClass39_Sub2_41.anInt3776 % 4000) / 4000.0F;
				Static16.aFloatArray2[2] = 0.0F;
				Static16.aFloatArray2[1] = 0.0F;
				Static16.aFloatArray2[0] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Static16.aFloatArray2, 0);
			} else {
				@Pc(108) int local108 = super.aClass39_Sub2_41.anInt3776 % 4000 * 16 / 4000;
				super.aClass39_Sub2_41.method3203(this.aClass249_4.aClass3_Sub2Array3[local108]);
			}
		} else if (this.aClass249_4.aBoolean456) {
			super.aClass39_Sub2_41.method3203(this.aClass249_4.aClass3_Sub4_3);
			Static16.aFloatArray2[0] = 0.0F;
			Static16.aFloatArray2[1] = 0.0F;
			Static16.aFloatArray2[3] = 0.0F;
			Static16.aFloatArray2[2] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static16.aFloatArray2, 0);
		} else {
			super.aClass39_Sub2_41.method3203(this.aClass249_4.aClass3_Sub2Array3[0]);
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method5673(@OriginalArg(0) boolean arg0) {
		if (super.aClass39_Sub2_41.anInt3797 > 0) {
			@Pc(15) float local15 = -0.5F / (float) super.aClass39_Sub2_41.anInt3797;
			super.aClass39_Sub2_41.method3221(1);
			Static16.aFloatArray2[0] = 0.0F;
			Static16.aFloatArray2[3] = super.aClass39_Sub2_41.aFloat51 * local15 + 0.25F;
			Static16.aFloatArray2[1] = 0.0F;
			Static16.aFloatArray2[2] = local15;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static16.aFloatArray2, 0);
			OpenGL.glPopMatrix();
			super.aClass39_Sub2_41.method3211((float) super.aClass39_Sub2_41.anInt3797, 0.5F);
			super.aClass39_Sub2_41.method3203(this.aClass3_Sub1_1);
			super.aClass39_Sub2_41.method3221(0);
		}
		this.aClass213_5.method4857('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lclient!av;IB)V")
	@Override
	public void method5668(@OriginalArg(0) Class3 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ms", name = "c", descriptor = "(B)V")
	private void method3809() {
		this.aClass213_5 = new Class213(super.aClass39_Sub2_41, 2);
		this.aClass213_5.method4858(0);
		super.aClass39_Sub2_41.method3221(1);
		super.aClass39_Sub2_41.method3156(260, 7681);
		super.aClass39_Sub2_41.method3180(768, 0, 34168);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass39_Sub2_41.method3221(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass249_4.aBoolean456) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass213_5.method4862();
		this.aClass213_5.method4858(1);
		super.aClass39_Sub2_41.method3221(1);
		super.aClass39_Sub2_41.method3156(8448, 8448);
		super.aClass39_Sub2_41.method3180(768, 0, 5890);
		OpenGL.glDisable(3168);
		super.aClass39_Sub2_41.method3221(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass249_4.aBoolean456) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass213_5.method4862();
	}
}
