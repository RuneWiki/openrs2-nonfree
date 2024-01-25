import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hea")
public final class Class43_Sub5 extends Class43 {

	@OriginalMember(owner = "client!hea", name = "t", descriptor = "Lclient!nda;")
	private Class251 aClass251_5;

	@OriginalMember(owner = "client!hea", name = "r", descriptor = "Lclient!taa;")
	private final Class349 aClass349_2;

	@OriginalMember(owner = "client!hea", name = "l", descriptor = "Lclient!uda;")
	private final Class245_Sub4 aClass245_Sub4_1;

	@OriginalMember(owner = "client!hea", name = "<init>", descriptor = "(Lclient!gia;Lclient!taa;)V")
	public Class43_Sub5(@OriginalArg(0) Class67_Sub2 arg0, @OriginalArg(1) Class349 arg1) {
		super(arg0);
		this.aClass349_2 = arg1;
		this.method3669();
		this.aClass245_Sub4_1 = new Class245_Sub4(super.aClass67_Sub2_41, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass245_Sub4_1.method8686();
	}

	@OriginalMember(owner = "client!hea", name = "b", descriptor = "(I)V")
	@Override
	public void method8866() {
		this.aClass251_5.method6186('\u0001');
		if (super.aClass67_Sub2_41.anInt3907 > 0) {
			super.aClass67_Sub2_41.method3268(1);
			super.aClass67_Sub2_41.method3234((Class245) null);
			super.aClass67_Sub2_41.method3244(0.0F, 1.0F);
			super.aClass67_Sub2_41.method3268(0);
		}
		super.aClass67_Sub2_41.method3271(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(III)V")
	@Override
	public void method8860(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if ((arg1 & 0x1) == 1) {
			if (this.aClass349_2.aBoolean709) {
				super.aClass67_Sub2_41.method3234(this.aClass349_2.aClass245_Sub3_2);
				Static198.aFloatArray36[1] = 0.0F;
				Static198.aFloatArray36[2] = 0.0F;
				Static198.aFloatArray36[3] = (float) (super.aClass67_Sub2_41.anInt3876 % 4000) / 4000.0F;
				Static198.aFloatArray36[0] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Static198.aFloatArray36, 0);
			} else {
				@Pc(112) int local112 = super.aClass67_Sub2_41.anInt3876 % 4000 * 16 / 4000;
				super.aClass67_Sub2_41.method3234(this.aClass349_2.aClass245_Sub2Array3[local112]);
			}
		} else if (this.aClass349_2.aBoolean709) {
			super.aClass67_Sub2_41.method3234(this.aClass349_2.aClass245_Sub3_2);
			Static198.aFloatArray36[0] = 0.0F;
			Static198.aFloatArray36[3] = 0.0F;
			Static198.aFloatArray36[2] = 0.0F;
			Static198.aFloatArray36[1] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static198.aFloatArray36, 0);
		} else {
			super.aClass67_Sub2_41.method3234(this.aClass349_2.aClass245_Sub2Array3[0]);
		}
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(ILclient!sga;I)V")
	@Override
	public void method8865(@OriginalArg(0) int arg0, @OriginalArg(1) Class245 arg1) {
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8859() {
		return true;
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8858(@OriginalArg(1) boolean arg0) {
		super.aClass67_Sub2_41.method3271(8448, 260);
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8863(@OriginalArg(0) boolean arg0) {
		if (super.aClass67_Sub2_41.anInt3907 > 0) {
			@Pc(14) float local14 = -0.5F / (float) super.aClass67_Sub2_41.anInt3907;
			super.aClass67_Sub2_41.method3268(1);
			Static198.aFloatArray36[2] = local14;
			Static198.aFloatArray36[3] = local14 * super.aClass67_Sub2_41.aFloat64 + 0.25F;
			Static198.aFloatArray36[0] = 0.0F;
			Static198.aFloatArray36[1] = 0.0F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static198.aFloatArray36, 0);
			OpenGL.glPopMatrix();
			super.aClass67_Sub2_41.method3244((float) super.aClass67_Sub2_41.anInt3907, 0.5F);
			super.aClass67_Sub2_41.method3234(this.aClass245_Sub4_1);
			super.aClass67_Sub2_41.method3268(0);
		}
		this.aClass251_5.method6186('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(Z)V")
	private void method3669() {
		this.aClass251_5 = new Class251(super.aClass67_Sub2_41, 2);
		this.aClass251_5.method6187(0);
		super.aClass67_Sub2_41.method3268(1);
		super.aClass67_Sub2_41.method3271(260, 7681);
		super.aClass67_Sub2_41.method3279(34168, 768, 0);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass67_Sub2_41.method3268(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass349_2.aBoolean709) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass251_5.method6183();
		this.aClass251_5.method6187(1);
		super.aClass67_Sub2_41.method3268(1);
		super.aClass67_Sub2_41.method3271(8448, 8448);
		super.aClass67_Sub2_41.method3279(5890, 768, 0);
		OpenGL.glDisable(3168);
		super.aClass67_Sub2_41.method3268(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass349_2.aBoolean709) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass251_5.method6183();
	}
}
