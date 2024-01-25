import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mv")
public final class Class72_Sub5 extends Class72 {

	@OriginalMember(owner = "client!mv", name = "p", descriptor = "Lclient!sc;")
	private Class223 aClass223_4;

	@OriginalMember(owner = "client!mv", name = "r", descriptor = "Lclient!po;")
	private final Class194 aClass194_5;

	@OriginalMember(owner = "client!mv", name = "m", descriptor = "Lclient!ni;")
	private final Class112_Sub3 aClass112_Sub3_1;

	@OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(Lclient!vj;Lclient!po;)V")
	public Class72_Sub5(@OriginalArg(0) Class172_Sub2 arg0, @OriginalArg(1) Class194 arg1) {
		super(arg0);
		this.aClass194_5 = arg1;
		this.method3799();
		this.aClass112_Sub3_1 = new Class112_Sub3(super.aClass172_Sub2_43, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass112_Sub3_1.method3861();
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5965(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass194_5.aBoolean474) {
				super.aClass172_Sub2_43.method5630(this.aClass194_5.aClass112_Sub1_2);
				Static166.aFloatArray10[3] = (float) (super.aClass172_Sub2_43.anInt7161 % 4000) / 4000.0F;
				Static166.aFloatArray10[0] = 0.0F;
				Static166.aFloatArray10[2] = 0.0F;
				Static166.aFloatArray10[1] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Static166.aFloatArray10, 0);
			} else {
				@Pc(69) int local69 = super.aClass172_Sub2_43.anInt7161 % 4000 * 16 / 4000;
				super.aClass172_Sub2_43.method5630(this.aClass194_5.aClass112_Sub2Array1[local69]);
			}
		} else if (this.aClass194_5.aBoolean474) {
			super.aClass172_Sub2_43.method5630(this.aClass194_5.aClass112_Sub1_2);
			Static166.aFloatArray10[0] = 0.0F;
			Static166.aFloatArray10[1] = 0.0F;
			Static166.aFloatArray10[2] = 0.0F;
			Static166.aFloatArray10[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static166.aFloatArray10, 0);
		} else {
			super.aClass172_Sub2_43.method5630(this.aClass194_5.aClass112_Sub2Array1[0]);
		}
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5970(@OriginalArg(0) boolean arg0) {
		super.aClass172_Sub2_43.method5591(260, 8448);
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(IILclient!ih;)V")
	@Override
	public void method5963(@OriginalArg(1) int arg0, @OriginalArg(2) Class112 arg1) {
	}

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "(Z)V")
	private void method3799() {
		this.aClass223_4 = new Class223(super.aClass172_Sub2_43, 2);
		this.aClass223_4.method4786(0);
		super.aClass172_Sub2_43.method5569(1);
		super.aClass172_Sub2_43.method5591(7681, 260);
		super.aClass172_Sub2_43.method5561(768, 34168, 0);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass172_Sub2_43.method5569(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass194_5.aBoolean474) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass223_4.method4784();
		this.aClass223_4.method4786(1);
		super.aClass172_Sub2_43.method5569(1);
		super.aClass172_Sub2_43.method5591(8448, 8448);
		super.aClass172_Sub2_43.method5561(768, 5890, 0);
		OpenGL.glDisable(3168);
		super.aClass172_Sub2_43.method5569(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass194_5.aBoolean474) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass223_4.method4784();
	}

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5961() {
		return true;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5966(@OriginalArg(0) boolean arg0) {
		if (super.aClass172_Sub2_43.anInt7173 > 0) {
			@Pc(10) float local10 = -0.5F / (float) super.aClass172_Sub2_43.anInt7173;
			super.aClass172_Sub2_43.method5569(1);
			Static166.aFloatArray10[2] = local10;
			Static166.aFloatArray10[3] = super.aClass172_Sub2_43.aFloat89 * local10 + 0.25F;
			Static166.aFloatArray10[0] = 0.0F;
			Static166.aFloatArray10[1] = 0.0F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static166.aFloatArray10, 0);
			OpenGL.glPopMatrix();
			super.aClass172_Sub2_43.method5620(0.5F, (float) super.aClass172_Sub2_43.anInt7173);
			super.aClass172_Sub2_43.method5630(this.aClass112_Sub3_1);
			super.aClass172_Sub2_43.method5569(0);
		}
		this.aClass223_4.method4785('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, (float) 1);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(I)V")
	@Override
	public void method5960() {
		this.aClass223_4.method4785('\u0001');
		if (super.aClass172_Sub2_43.anInt7173 > 0) {
			super.aClass172_Sub2_43.method5569(1);
			super.aClass172_Sub2_43.method5630(null);
			super.aClass172_Sub2_43.method5620(1.0F, 0.0F);
			super.aClass172_Sub2_43.method5569(0);
		}
		super.aClass172_Sub2_43.method5591(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}
}
