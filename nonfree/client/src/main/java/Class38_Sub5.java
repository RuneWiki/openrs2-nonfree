import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class Class38_Sub5 extends Class38 {

	@OriginalMember(owner = "client!la", name = "m", descriptor = "Lclient!pba;")
	private Class264 aClass264_6;

	@OriginalMember(owner = "client!la", name = "g", descriptor = "Lclient!mha;")
	private final Class219 aClass219_4;

	@OriginalMember(owner = "client!la", name = "h", descriptor = "Lclient!lv;")
	private final Class85_Sub2 aClass85_Sub2_1;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lclient!dia;Lclient!mha;)V")
	public Class38_Sub5(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) Class219 arg1) {
		super(arg0);
		this.aClass219_4 = arg1;
		this.method4996();
		this.aClass85_Sub2_1 = new Class85_Sub2(super.aClass13_Sub2_39, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass85_Sub2_1.method5272();
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILclient!il;I)V")
	@Override
	public void method7810(@OriginalArg(1) Class85 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7813(@OriginalArg(1) boolean arg0) {
		super.aClass13_Sub2_39.method1993(8448, 260);
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(ZZ)V")
	@Override
	public void method7812(@OriginalArg(0) boolean arg0) {
		if (super.aClass13_Sub2_39.anInt2167 > 0) {
			@Pc(17) float local17 = -0.5F / (float) super.aClass13_Sub2_39.anInt2167;
			super.aClass13_Sub2_39.method2008(1);
			Static84.aFloatArray13[3] = local17 * super.aClass13_Sub2_39.aFloat62 + 0.25F;
			Static84.aFloatArray13[1] = 0.0F;
			Static84.aFloatArray13[2] = local17;
			Static84.aFloatArray13[0] = 0.0F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static84.aFloatArray13, 0);
			OpenGL.glPopMatrix();
			super.aClass13_Sub2_39.method1975((float) super.aClass13_Sub2_39.anInt2167, 0.5F);
			super.aClass13_Sub2_39.method2024(this.aClass85_Sub2_1);
			super.aClass13_Sub2_39.method2008(0);
		}
		this.aClass264_6.method6557('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(III)V")
	@Override
	public void method7814(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass219_4.aBoolean431) {
				super.aClass13_Sub2_39.method2024(this.aClass219_4.aClass85_Sub4_2);
				Static84.aFloatArray13[3] = (float) (super.aClass13_Sub2_39.anInt2155 % 4000) / 4000.0F;
				Static84.aFloatArray13[1] = 0.0F;
				Static84.aFloatArray13[2] = 0.0F;
				Static84.aFloatArray13[0] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Static84.aFloatArray13, 0);
			} else {
				@Pc(24) int local24 = super.aClass13_Sub2_39.anInt2155 % 4000 * 16 / 4000;
				super.aClass13_Sub2_39.method2024(this.aClass219_4.aClass85_Sub3Array4[local24]);
			}
		} else if (this.aClass219_4.aBoolean431) {
			super.aClass13_Sub2_39.method2024(this.aClass219_4.aClass85_Sub4_2);
			Static84.aFloatArray13[0] = 0.0F;
			Static84.aFloatArray13[2] = 0.0F;
			Static84.aFloatArray13[3] = 0.0F;
			Static84.aFloatArray13[1] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static84.aFloatArray13, 0);
		} else {
			super.aClass13_Sub2_39.method2024(this.aClass219_4.aClass85_Sub3Array4[0]);
		}
	}

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(I)V")
	@Override
	public void method7819() {
		this.aClass264_6.method6557('\u0001');
		if (super.aClass13_Sub2_39.anInt2167 > 0) {
			super.aClass13_Sub2_39.method2008(1);
			super.aClass13_Sub2_39.method2024((Class85) null);
			super.aClass13_Sub2_39.method1975(0.0F, 1.0F);
			super.aClass13_Sub2_39.method2008(0);
		}
		super.aClass13_Sub2_39.method1993(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7818() {
		return true;
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(B)V")
	private void method4996() {
		this.aClass264_6 = new Class264(super.aClass13_Sub2_39, 2);
		this.aClass264_6.method6556(0);
		super.aClass13_Sub2_39.method2008(1);
		super.aClass13_Sub2_39.method1993(260, 7681);
		super.aClass13_Sub2_39.method2012(34168, 768, 0);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass13_Sub2_39.method2008(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass219_4.aBoolean431) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass264_6.method6558();
		this.aClass264_6.method6556(1);
		super.aClass13_Sub2_39.method2008(1);
		super.aClass13_Sub2_39.method1993(8448, 8448);
		super.aClass13_Sub2_39.method2012(5890, 768, 0);
		OpenGL.glDisable(3168);
		super.aClass13_Sub2_39.method2008(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass219_4.aBoolean431) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass264_6.method6558();
	}
}
