import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cq")
public final class Class14_Sub2 extends Class14 {

	@OriginalMember(owner = "client!cq", name = "l", descriptor = "Lclient!bp;")
	private Class36 aClass36_2;

	@OriginalMember(owner = "client!cq", name = "s", descriptor = "Lclient!faa;")
	private final Class91 aClass91_1;

	@OriginalMember(owner = "client!cq", name = "q", descriptor = "Lclient!qj;")
	private final Class121_Sub3 aClass121_Sub3_1;

	@OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(Lclient!eq;Lclient!faa;)V")
	public Class14_Sub2(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) Class91 arg1) {
		super(arg0);
		this.aClass91_1 = arg1;
		this.method1870();
		this.aClass121_Sub3_1 = new Class121_Sub3(super.aClass33_Sub3_43, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass121_Sub3_1.method6932();
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(III)V")
	@Override
	public void method8544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg1 & 0x1) == 1) {
			if (this.aClass91_1.aBoolean294) {
				super.aClass33_Sub3_43.method3012(this.aClass91_1.aClass121_Sub4_3);
				Static625.aFloatArray77[3] = (float) (super.aClass33_Sub3_43.anInt3418 % 4000) / 4000.0F;
				Static625.aFloatArray77[1] = 0.0F;
				Static625.aFloatArray77[0] = 0.0F;
				Static625.aFloatArray77[2] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Static625.aFloatArray77, 0);
			} else {
				@Pc(57) int local57 = super.aClass33_Sub3_43.anInt3418 % 4000 * 16 / 4000;
				super.aClass33_Sub3_43.method3012(this.aClass91_1.aClass121_Sub2Array1[local57]);
			}
		} else if (this.aClass91_1.aBoolean294) {
			super.aClass33_Sub3_43.method3012(this.aClass91_1.aClass121_Sub4_3);
			Static625.aFloatArray77[2] = 0.0F;
			Static625.aFloatArray77[3] = 0.0F;
			Static625.aFloatArray77[1] = 0.0F;
			Static625.aFloatArray77[0] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static625.aFloatArray77, 0);
		} else {
			super.aClass33_Sub3_43.method3012(this.aClass91_1.aClass121_Sub2Array1[0]);
		}
	}

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "(IZ)V")
	@Override
	public void method8550(@OriginalArg(1) boolean arg0) {
		super.aClass33_Sub3_43.method3057(8448, 260);
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8543(@OriginalArg(1) boolean arg0) {
		if (super.aClass33_Sub3_43.anInt3447 > 0) {
			@Pc(13) float local13 = -0.5F / (float) super.aClass33_Sub3_43.anInt3447;
			super.aClass33_Sub3_43.method3027(1);
			Static625.aFloatArray77[0] = 0.0F;
			Static625.aFloatArray77[1] = 0.0F;
			Static625.aFloatArray77[3] = super.aClass33_Sub3_43.aFloat113 * local13 + 0.25F;
			Static625.aFloatArray77[2] = local13;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static625.aFloatArray77, 0);
			OpenGL.glPopMatrix();
			super.aClass33_Sub3_43.method3043((float) super.aClass33_Sub3_43.anInt3447, 0.5F);
			super.aClass33_Sub3_43.method3012(this.aClass121_Sub3_1);
			super.aClass33_Sub3_43.method3027(0);
		}
		this.aClass36_2.method1112('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(BLclient!kp;I)V")
	@Override
	public void method8542(@OriginalArg(1) Class121 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)V")
	@Override
	public void method8545() {
		this.aClass36_2.method1112('\u0001');
		if (super.aClass33_Sub3_43.anInt3447 > 0) {
			super.aClass33_Sub3_43.method3027(1);
			super.aClass33_Sub3_43.method3012(null);
			super.aClass33_Sub3_43.method3043(0.0F, 1.0F);
			super.aClass33_Sub3_43.method3027(0);
		}
		super.aClass33_Sub3_43.method3057(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!cq", name = "c", descriptor = "(I)V")
	private void method1870() {
		this.aClass36_2 = new Class36(super.aClass33_Sub3_43, 2);
		this.aClass36_2.method1116(0);
		super.aClass33_Sub3_43.method3027(1);
		super.aClass33_Sub3_43.method3057(260, 7681);
		super.aClass33_Sub3_43.method3024(768, 34168, 0);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass33_Sub3_43.method3027(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass91_1.aBoolean294) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass36_2.method1115();
		this.aClass36_2.method1116(1);
		super.aClass33_Sub3_43.method3027(1);
		super.aClass33_Sub3_43.method3057(8448, 8448);
		super.aClass33_Sub3_43.method3024(768, 5890, 0);
		OpenGL.glDisable(3168);
		super.aClass33_Sub3_43.method3027(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass91_1.aBoolean294) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass36_2.method1115();
	}

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8549() {
		return true;
	}
}
