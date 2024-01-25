import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tu")
public final class Class11_Sub8 extends Class11 {

	@OriginalMember(owner = "client!tu", name = "o", descriptor = "Lclient!up;")
	private Class358 aClass358_5;

	@OriginalMember(owner = "client!tu", name = "t", descriptor = "Lclient!sa;")
	private final Class314 aClass314_4;

	@OriginalMember(owner = "client!tu", name = "l", descriptor = "Lclient!cia;")
	private final Class53_Sub1 aClass53_Sub1_1;

	@OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(Lclient!pq;Lclient!sa;)V")
	public Class11_Sub8(@OriginalArg(0) Class132_Sub3 arg0, @OriginalArg(1) Class314 arg1) {
		super(arg0);
		this.aClass314_4 = arg1;
		this.method8096();
		this.aClass53_Sub1_1 = new Class53_Sub1(super.aClass132_Sub3_43, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass53_Sub1_1.method1343();
	}

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8991() {
		return true;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)V")
	@Override
	public void method8982() {
		this.aClass358_5.method8418('\u0001');
		if (super.aClass132_Sub3_43.anInt7891 > 0) {
			super.aClass132_Sub3_43.method6802(1);
			super.aClass132_Sub3_43.method6759((Class53) null);
			super.aClass132_Sub3_43.method6778(1.0F, 0.0F);
			super.aClass132_Sub3_43.method6802(0);
		}
		super.aClass132_Sub3_43.method6770(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8984(@OriginalArg(1) boolean arg0) {
		if (super.aClass132_Sub3_43.anInt7891 > 0) {
			@Pc(13) float local13 = -0.5F / (float) super.aClass132_Sub3_43.anInt7891;
			super.aClass132_Sub3_43.method6802(1);
			Static478.aFloatArray48[0] = 0.0F;
			Static478.aFloatArray48[3] = local13 * super.aClass132_Sub3_43.aFloat141 + 0.25F;
			Static478.aFloatArray48[1] = 0.0F;
			Static478.aFloatArray48[2] = local13;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static478.aFloatArray48, 0);
			OpenGL.glPopMatrix();
			super.aClass132_Sub3_43.method6778(0.5F, (float) super.aClass132_Sub3_43.anInt7891);
			super.aClass132_Sub3_43.method6759(this.aClass53_Sub1_1);
			super.aClass132_Sub3_43.method6802(0);
		}
		this.aClass358_5.method8418('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!tu", name = "d", descriptor = "(I)V")
	private void method8096() {
		this.aClass358_5 = new Class358(super.aClass132_Sub3_43, 2);
		this.aClass358_5.method8419(0);
		super.aClass132_Sub3_43.method6802(1);
		super.aClass132_Sub3_43.method6770(260, 7681);
		super.aClass132_Sub3_43.method6763(0, 768, 34168);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass132_Sub3_43.method6802(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass314_4.aBoolean614) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass358_5.method8417();
		this.aClass358_5.method8419(1);
		super.aClass132_Sub3_43.method6802(1);
		super.aClass132_Sub3_43.method6770(8448, 8448);
		super.aClass132_Sub3_43.method6763(0, 768, 5890);
		OpenGL.glDisable(3168);
		super.aClass132_Sub3_43.method6802(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass314_4.aBoolean614) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass358_5.method8417();
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8989(@OriginalArg(0) boolean arg0) {
		super.aClass132_Sub3_43.method6770(8448, 260);
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(IZLclient!wha;)V")
	@Override
	public void method8983(@OriginalArg(0) int arg0, @OriginalArg(2) Class53 arg1) {
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method8987(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg1 & 0x1) == 1) {
			if (this.aClass314_4.aBoolean614) {
				super.aClass132_Sub3_43.method6759(this.aClass314_4.aClass53_Sub4_2);
				Static478.aFloatArray48[3] = (float) (super.aClass132_Sub3_43.anInt7881 % 4000) / 4000.0F;
				Static478.aFloatArray48[1] = 0.0F;
				Static478.aFloatArray48[2] = 0.0F;
				Static478.aFloatArray48[0] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Static478.aFloatArray48, 0);
			} else {
				@Pc(72) int local72 = super.aClass132_Sub3_43.anInt7881 % 4000 * 16 / 4000;
				super.aClass132_Sub3_43.method6759(this.aClass314_4.aClass53_Sub2Array3[local72]);
			}
		} else if (this.aClass314_4.aBoolean614) {
			super.aClass132_Sub3_43.method6759(this.aClass314_4.aClass53_Sub4_2);
			Static478.aFloatArray48[0] = 0.0F;
			Static478.aFloatArray48[1] = 0.0F;
			Static478.aFloatArray48[3] = 0.0F;
			Static478.aFloatArray48[2] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static478.aFloatArray48, 0);
		} else {
			super.aClass132_Sub3_43.method6759(this.aClass314_4.aClass53_Sub2Array3[0]);
		}
	}
}
