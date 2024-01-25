import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sda")
public final class Class75_Sub6 extends Class75 {

	@OriginalMember(owner = "client!sda", name = "l", descriptor = "Lclient!uj;")
	private Class328 aClass328_4;

	@OriginalMember(owner = "client!sda", name = "r", descriptor = "Lclient!pm;")
	private final Class256 aClass256_5;

	@OriginalMember(owner = "client!sda", name = "n", descriptor = "Lclient!ak;")
	private final Class11_Sub1 aClass11_Sub1_1;

	@OriginalMember(owner = "client!sda", name = "<init>", descriptor = "(Lclient!ji;Lclient!pm;)V")
	public Class75_Sub6(@OriginalArg(0) Class15_Sub3 arg0, @OriginalArg(1) Class256 arg1) {
		super(arg0);
		this.aClass256_5 = arg1;
		this.method7274();
		this.aClass11_Sub1_1 = new Class11_Sub1(super.aClass15_Sub3_42, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass11_Sub1_1.method425();
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8293(@OriginalArg(1) boolean arg0) {
		if (super.aClass15_Sub3_42.anInt5352 > 0) {
			@Pc(13) float local13 = -0.5F / (float) super.aClass15_Sub3_42.anInt5352;
			super.aClass15_Sub3_42.method4458(1);
			Static372.aFloatArray63[2] = local13;
			Static372.aFloatArray63[0] = 0.0F;
			Static372.aFloatArray63[1] = 0.0F;
			Static372.aFloatArray63[3] = local13 * super.aClass15_Sub3_42.aFloat89 + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static372.aFloatArray63, 0);
			OpenGL.glPopMatrix();
			super.aClass15_Sub3_42.method4426((float) super.aClass15_Sub3_42.anInt5352, 0.5F);
			super.aClass15_Sub3_42.method4377(this.aClass11_Sub1_1);
			super.aClass15_Sub3_42.method4458(0);
		}
		this.aClass328_4.method7872('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(I)V")
	@Override
	public void method8290() {
		this.aClass328_4.method7872('\u0001');
		if (super.aClass15_Sub3_42.anInt5352 > 0) {
			super.aClass15_Sub3_42.method4458(1);
			super.aClass15_Sub3_42.method4377(null);
			super.aClass15_Sub3_42.method4426(0.0F, 1.0F);
			super.aClass15_Sub3_42.method4458(0);
		}
		super.aClass15_Sub3_42.method4451(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8294(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass256_5.aBoolean664) {
				super.aClass15_Sub3_42.method4377(this.aClass256_5.aClass11_Sub4_1);
				Static372.aFloatArray63[2] = 0.0F;
				Static372.aFloatArray63[1] = 0.0F;
				Static372.aFloatArray63[3] = (float) (super.aClass15_Sub3_42.anInt5325 % 4000) / 4000.0F;
				Static372.aFloatArray63[0] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Static372.aFloatArray63, 0);
			} else {
				@Pc(67) int local67 = super.aClass15_Sub3_42.anInt5325 % 4000 * 16 / 4000;
				super.aClass15_Sub3_42.method4377(this.aClass256_5.aClass11_Sub2Array3[local67]);
			}
		} else if (this.aClass256_5.aBoolean664) {
			super.aClass15_Sub3_42.method4377(this.aClass256_5.aClass11_Sub4_1);
			Static372.aFloatArray63[1] = 0.0F;
			Static372.aFloatArray63[3] = 0.0F;
			Static372.aFloatArray63[0] = 0.0F;
			Static372.aFloatArray63[2] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static372.aFloatArray63, 0);
		} else {
			super.aClass15_Sub3_42.method4377(this.aClass256_5.aClass11_Sub2Array3[0]);
		}
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8296(@OriginalArg(0) boolean arg0) {
		super.aClass15_Sub3_42.method4451(8448, 260);
	}

	@OriginalMember(owner = "client!sda", name = "b", descriptor = "(I)V")
	private void method7274() {
		this.aClass328_4 = new Class328(super.aClass15_Sub3_42, 2);
		this.aClass328_4.method7870(0);
		super.aClass15_Sub3_42.method4458(1);
		super.aClass15_Sub3_42.method4451(260, 7681);
		super.aClass15_Sub3_42.method4442(768, 34168, 0);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass15_Sub3_42.method4458(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass256_5.aBoolean664) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass328_4.method7868();
		this.aClass328_4.method7870(1);
		super.aClass15_Sub3_42.method4458(1);
		super.aClass15_Sub3_42.method4451(8448, 8448);
		super.aClass15_Sub3_42.method4442(768, 5890, 0);
		OpenGL.glDisable(3168);
		super.aClass15_Sub3_42.method4458(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass256_5.aBoolean664) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass328_4.method7868();
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(IILclient!gq;)V")
	@Override
	public void method8289(@OriginalArg(0) int arg0, @OriginalArg(2) Class11 arg1) {
	}

	@OriginalMember(owner = "client!sda", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8295() {
		return true;
	}
}
