import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pp")
public final class Class60_Sub5 extends Class60 {

	@OriginalMember(owner = "client!pp", name = "u", descriptor = "Lclient!qda;")
	private Class271 aClass271_4;

	@OriginalMember(owner = "client!pp", name = "j", descriptor = "Lclient!vb;")
	private final Class343 aClass343_4;

	@OriginalMember(owner = "client!pp", name = "r", descriptor = "Lclient!br;")
	private final Class34_Sub1 aClass34_Sub1_1;

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lclient!us;Lclient!vb;)V")
	public Class60_Sub5(@OriginalArg(0) Class43_Sub3 arg0, @OriginalArg(1) Class343 arg1) {
		super(arg0);
		this.aClass343_4 = arg1;
		this.method5933();
		this.aClass34_Sub1_1 = new Class34_Sub1(super.aClass43_Sub3_43, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass34_Sub1_1.method822();
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7735() {
		return true;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IBLclient!um;)V")
	@Override
	public void method7737(@OriginalArg(0) int arg0, @OriginalArg(2) Class34 arg1) {
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)V")
	@Override
	public void method7732() {
		this.aClass271_4.method6056('\u0001');
		if (super.aClass43_Sub3_43.anInt8746 > 0) {
			super.aClass43_Sub3_43.method7277(1);
			super.aClass43_Sub3_43.method7220(null);
			super.aClass43_Sub3_43.method7266(1.0F, 0.0F);
			super.aClass43_Sub3_43.method7277(0);
		}
		super.aClass43_Sub3_43.method7287(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "(I)V")
	private void method5933() {
		this.aClass271_4 = new Class271(super.aClass43_Sub3_43, 2);
		this.aClass271_4.method6059(0);
		super.aClass43_Sub3_43.method7277(1);
		super.aClass43_Sub3_43.method7287(260, 7681);
		super.aClass43_Sub3_43.method7225(0, 768, 34168);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass43_Sub3_43.method7277(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass343_4.aBoolean698) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass271_4.method6054();
		this.aClass271_4.method6059(1);
		super.aClass43_Sub3_43.method7277(1);
		super.aClass43_Sub3_43.method7287(8448, 8448);
		super.aClass43_Sub3_43.method7225(0, 768, 5890);
		OpenGL.glDisable(3168);
		super.aClass43_Sub3_43.method7277(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass343_4.aBoolean698) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass271_4.method6054();
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7733(@OriginalArg(0) boolean arg0) {
		super.aClass43_Sub3_43.method7287(8448, 260);
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIB)V")
	@Override
	public void method7729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg1 & 0x1) == 1) {
			if (this.aClass343_4.aBoolean698) {
				super.aClass43_Sub3_43.method7220(this.aClass343_4.aClass34_Sub3_2);
				Static381.aFloatArray60[3] = (float) (super.aClass43_Sub3_43.anInt8735 % 4000) / 4000.0F;
				Static381.aFloatArray60[1] = 0.0F;
				Static381.aFloatArray60[0] = 0.0F;
				Static381.aFloatArray60[2] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Static381.aFloatArray60, 0);
			} else {
				@Pc(59) int local59 = super.aClass43_Sub3_43.anInt8735 % 4000 * 16 / 4000;
				super.aClass43_Sub3_43.method7220(this.aClass343_4.aClass34_Sub2Array3[local59]);
			}
		} else if (this.aClass343_4.aBoolean698) {
			super.aClass43_Sub3_43.method7220(this.aClass343_4.aClass34_Sub3_2);
			Static381.aFloatArray60[3] = 0.0F;
			Static381.aFloatArray60[2] = 0.0F;
			Static381.aFloatArray60[1] = 0.0F;
			Static381.aFloatArray60[0] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static381.aFloatArray60, 0);
		} else {
			super.aClass43_Sub3_43.method7220(this.aClass343_4.aClass34_Sub2Array3[0]);
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7730(@OriginalArg(0) boolean arg0) {
		if (super.aClass43_Sub3_43.anInt8746 > 0) {
			@Pc(14) float local14 = -0.5F / (float) super.aClass43_Sub3_43.anInt8746;
			super.aClass43_Sub3_43.method7277(1);
			Static381.aFloatArray60[1] = 0.0F;
			Static381.aFloatArray60[2] = local14;
			Static381.aFloatArray60[0] = 0.0F;
			Static381.aFloatArray60[3] = super.aClass43_Sub3_43.aFloat211 * local14 + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static381.aFloatArray60, 0);
			OpenGL.glPopMatrix();
			super.aClass43_Sub3_43.method7266(0.5F, (float) super.aClass43_Sub3_43.anInt8746);
			super.aClass43_Sub3_43.method7220(this.aClass34_Sub1_1);
			super.aClass43_Sub3_43.method7277(0);
		}
		this.aClass271_4.method6056('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}
}
