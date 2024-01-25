import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class13_Sub4 extends Class13 {

	@OriginalMember(owner = "client!ge", name = "m", descriptor = "Lclient!qha;")
	private Class273 aClass273_3;

	@OriginalMember(owner = "client!ge", name = "s", descriptor = "Lclient!pr;")
	private final Class264 aClass264_3;

	@OriginalMember(owner = "client!ge", name = "r", descriptor = "Lclient!an;")
	private final Class20_Sub1 aClass20_Sub1_1;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lclient!nv;Lclient!pr;)V")
	public Class13_Sub4(@OriginalArg(0) Class16_Sub3 arg0, @OriginalArg(1) Class264 arg1) {
		super(arg0);
		this.aClass264_3 = arg1;
		this.method3362();
		this.aClass20_Sub1_1 = new Class20_Sub1(super.aClass16_Sub3_42, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass20_Sub1_1.method847();
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IBI)V")
	@Override
	public void method8263(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass264_3.aBoolean588) {
				super.aClass16_Sub3_42.method6020(this.aClass264_3.aClass20_Sub2_3);
				Static21.aFloatArray20[1] = 0.0F;
				Static21.aFloatArray20[2] = 0.0F;
				Static21.aFloatArray20[3] = (float) (super.aClass16_Sub3_42.anInt7338 % 4000) / 4000.0F;
				Static21.aFloatArray20[0] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Static21.aFloatArray20, 0);
			} else {
				@Pc(106) int local106 = super.aClass16_Sub3_42.anInt7338 % 4000 * 16 / 4000;
				super.aClass16_Sub3_42.method6020(this.aClass264_3.aClass20_Sub4Array3[local106]);
			}
		} else if (this.aClass264_3.aBoolean588) {
			super.aClass16_Sub3_42.method6020(this.aClass264_3.aClass20_Sub2_3);
			Static21.aFloatArray20[1] = 0.0F;
			Static21.aFloatArray20[0] = 0.0F;
			Static21.aFloatArray20[2] = 0.0F;
			Static21.aFloatArray20[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static21.aFloatArray20, 0);
		} else {
			super.aClass16_Sub3_42.method6020(this.aClass264_3.aClass20_Sub4Array3[0]);
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8265() {
		return true;
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)V")
	private void method3362() {
		this.aClass273_3 = new Class273(super.aClass16_Sub3_42, 2);
		this.aClass273_3.method6909(0);
		super.aClass16_Sub3_42.method5944(1);
		super.aClass16_Sub3_42.method5957(7681, 260);
		super.aClass16_Sub3_42.method6025(768, 0, 34168);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass16_Sub3_42.method5944(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass264_3.aBoolean588) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass273_3.method6915();
		this.aClass273_3.method6909(1);
		super.aClass16_Sub3_42.method5944(1);
		super.aClass16_Sub3_42.method5957(8448, 8448);
		super.aClass16_Sub3_42.method6025(768, 0, 5890);
		OpenGL.glDisable(3168);
		super.aClass16_Sub3_42.method5944(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass264_3.aBoolean588) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass273_3.method6915();
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8266(@OriginalArg(1) boolean arg0) {
		super.aClass16_Sub3_42.method5957(260, 8448);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8268(@OriginalArg(1) boolean arg0) {
		if (super.aClass16_Sub3_42.anInt7365 > 0) {
			@Pc(17) float local17 = -0.5F / (float) super.aClass16_Sub3_42.anInt7365;
			super.aClass16_Sub3_42.method5944(1);
			Static21.aFloatArray20[1] = 0.0F;
			Static21.aFloatArray20[2] = local17;
			Static21.aFloatArray20[0] = 0.0F;
			Static21.aFloatArray20[3] = local17 * super.aClass16_Sub3_42.aFloat159 + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static21.aFloatArray20, 0);
			OpenGL.glPopMatrix();
			super.aClass16_Sub3_42.method5952((float) super.aClass16_Sub3_42.anInt7365, 0.5F);
			super.aClass16_Sub3_42.method6020(this.aClass20_Sub1_1);
			super.aClass16_Sub3_42.method5944(0);
		}
		this.aClass273_3.method6916('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
	@Override
	public void method8260() {
		this.aClass273_3.method6916('\u0001');
		if (super.aClass16_Sub3_42.anInt7365 > 0) {
			super.aClass16_Sub3_42.method5944(1);
			super.aClass16_Sub3_42.method6020(null);
			super.aClass16_Sub3_42.method5952(0.0F, 1.0F);
			super.aClass16_Sub3_42.method5944(0);
		}
		super.aClass16_Sub3_42.method5957(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!tha;II)V")
	@Override
	public void method8264(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1) {
	}
}
