import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lba")
public final class Class52_Sub6 extends Class52 {

	@OriginalMember(owner = "client!lba", name = "t", descriptor = "Lclient!hea;")
	private Class131 aClass131_5;

	@OriginalMember(owner = "client!lba", name = "w", descriptor = "Lclient!pba;")
	private final Class240 aClass240_4;

	@OriginalMember(owner = "client!lba", name = "k", descriptor = "Lclient!ofa;")
	private final Class35_Sub4 aClass35_Sub4_1;

	@OriginalMember(owner = "client!lba", name = "<init>", descriptor = "(Lclient!pea;Lclient!pba;)V")
	public Class52_Sub6(@OriginalArg(0) Class121_Sub3 arg0, @OriginalArg(1) Class240 arg1) {
		super(arg0);
		this.aClass240_4 = arg1;
		this.method3982();
		this.aClass35_Sub4_1 = new Class35_Sub4(super.aClass121_Sub3_43, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass35_Sub4_1.method5334();
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method7601() {
		return true;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(I)V")
	@Override
	public void method7598() {
		this.aClass131_5.method2752('\u0001');
		if (super.aClass121_Sub3_43.anInt6817 > 0) {
			super.aClass121_Sub3_43.method5648(1);
			super.aClass121_Sub3_43.method5713(null);
			super.aClass121_Sub3_43.method5725(0.0F, 1.0F);
			super.aClass121_Sub3_43.method5648(0);
		}
		super.aClass121_Sub3_43.method5659(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!lba", name = "d", descriptor = "(I)V")
	private void method3982() {
		this.aClass131_5 = new Class131(super.aClass121_Sub3_43, 2);
		this.aClass131_5.method2755(0);
		super.aClass121_Sub3_43.method5648(1);
		super.aClass121_Sub3_43.method5659(260, 7681);
		super.aClass121_Sub3_43.method5685(768, 34168, 0);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass121_Sub3_43.method5648(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass240_4.aBoolean444) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass131_5.method2754();
		this.aClass131_5.method2755(1);
		super.aClass121_Sub3_43.method5648(1);
		super.aClass121_Sub3_43.method5659(8448, 8448);
		super.aClass121_Sub3_43.method5685(768, 5890, 0);
		OpenGL.glDisable(3168);
		super.aClass121_Sub3_43.method5648(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass240_4.aBoolean444) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass131_5.method2754();
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7605(@OriginalArg(0) boolean arg0) {
		if (super.aClass121_Sub3_43.anInt6817 > 0) {
			@Pc(17) float local17 = -0.5F / (float) super.aClass121_Sub3_43.anInt6817;
			super.aClass121_Sub3_43.method5648(1);
			Static161.aFloatArray11[0] = 0.0F;
			Static161.aFloatArray11[2] = local17;
			Static161.aFloatArray11[1] = 0.0F;
			Static161.aFloatArray11[3] = local17 * super.aClass121_Sub3_43.aFloat162 + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static161.aFloatArray11, 0);
			OpenGL.glPopMatrix();
			super.aClass121_Sub3_43.method5725((float) super.aClass121_Sub3_43.anInt6817, 0.5F);
			super.aClass121_Sub3_43.method5713(this.aClass35_Sub4_1);
			super.aClass121_Sub3_43.method5648(0);
		}
		this.aClass131_5.method2752('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(BLclient!wq;I)V")
	@Override
	public void method7604(@OriginalArg(1) Class35 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(IZI)V")
	@Override
	public void method7599(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass240_4.aBoolean444) {
				super.aClass121_Sub3_43.method5713(this.aClass240_4.aClass35_Sub1_2);
				Static161.aFloatArray11[2] = 0.0F;
				Static161.aFloatArray11[0] = 0.0F;
				Static161.aFloatArray11[1] = 0.0F;
				Static161.aFloatArray11[3] = (float) (super.aClass121_Sub3_43.anInt6800 % 4000) / 4000.0F;
				OpenGL.glTexGenfv(8194, 9473, Static161.aFloatArray11, 0);
			} else {
				@Pc(75) int local75 = super.aClass121_Sub3_43.anInt6800 % 4000 * 16 / 4000;
				super.aClass121_Sub3_43.method5713(this.aClass240_4.aClass35_Sub3Array3[local75]);
			}
		} else if (this.aClass240_4.aBoolean444) {
			super.aClass121_Sub3_43.method5713(this.aClass240_4.aClass35_Sub1_2);
			Static161.aFloatArray11[1] = 0.0F;
			Static161.aFloatArray11[0] = 0.0F;
			Static161.aFloatArray11[3] = 0.0F;
			Static161.aFloatArray11[2] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static161.aFloatArray11, 0);
		} else {
			super.aClass121_Sub3_43.method5713(this.aClass240_4.aClass35_Sub3Array3[0]);
		}
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7603(@OriginalArg(0) boolean arg0) {
		super.aClass121_Sub3_43.method5659(8448, 260);
	}
}
