import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class31_Sub9 extends Class31 {

	@OriginalMember(owner = "client!we", name = "h", descriptor = "Lclient!bfa;")
	private Class30 aClass30_6;

	@OriginalMember(owner = "client!we", name = "m", descriptor = "Lclient!an;")
	private final Class19 aClass19_6;

	@OriginalMember(owner = "client!we", name = "g", descriptor = "Lclient!fv;")
	private final Class50_Sub2 aClass50_Sub2_1;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lclient!lea;Lclient!an;)V")
	public Class31_Sub9(@OriginalArg(0) Class101_Sub2 arg0, @OriginalArg(1) Class19 arg1) {
		super(arg0);
		this.aClass19_6 = arg1;
		this.method9607();
		this.aClass50_Sub2_1 = new Class50_Sub2(super.aClass101_Sub2_43, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass50_Sub2_1.method3490();
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V")
	@Override
	public void method9597() {
		this.aClass30_6.method940('\u0001');
		if (super.aClass101_Sub2_43.anInt6350 > 0) {
			super.aClass101_Sub2_43.method5627(1);
			super.aClass101_Sub2_43.method5690((Class50) null);
			super.aClass101_Sub2_43.method5661(0.0F, 1.0F);
			super.aClass101_Sub2_43.method5627(0);
		}
		super.aClass101_Sub2_43.method5665(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method9604() {
		return true;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IZI)V")
	@Override
	public void method9603(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass19_6.aBoolean25) {
				super.aClass101_Sub2_43.method5690(this.aClass19_6.aClass50_Sub1_2);
				Static200.aFloatArray22[0] = 0.0F;
				Static200.aFloatArray22[1] = 0.0F;
				Static200.aFloatArray22[3] = (float) (super.aClass101_Sub2_43.anInt6314 % 4000) / 4000.0F;
				Static200.aFloatArray22[2] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Static200.aFloatArray22, 0);
			} else {
				@Pc(24) int local24 = super.aClass101_Sub2_43.anInt6314 % 4000 * 16 / 4000;
				super.aClass101_Sub2_43.method5690(this.aClass19_6.aClass50_Sub4Array2[local24]);
			}
		} else if (this.aClass19_6.aBoolean25) {
			super.aClass101_Sub2_43.method5690(this.aClass19_6.aClass50_Sub1_2);
			Static200.aFloatArray22[3] = 0.0F;
			Static200.aFloatArray22[1] = 0.0F;
			Static200.aFloatArray22[2] = 0.0F;
			Static200.aFloatArray22[0] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static200.aFloatArray22, 0);
		} else {
			super.aClass101_Sub2_43.method5690(this.aClass19_6.aClass50_Sub4Array2[0]);
		}
	}

	@OriginalMember(owner = "client!we", name = "c", descriptor = "(B)V")
	private void method9607() {
		this.aClass30_6 = new Class30(super.aClass101_Sub2_43, 2);
		this.aClass30_6.method944(0);
		super.aClass101_Sub2_43.method5627(1);
		super.aClass101_Sub2_43.method5665(7681, 260);
		super.aClass101_Sub2_43.method5657(768, 0, 34168);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass101_Sub2_43.method5627(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass19_6.aBoolean25) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass30_6.method941();
		this.aClass30_6.method944(1);
		super.aClass101_Sub2_43.method5627(1);
		super.aClass101_Sub2_43.method5665(8448, 8448);
		super.aClass101_Sub2_43.method5657(768, 0, 5890);
		OpenGL.glDisable(3168);
		super.aClass101_Sub2_43.method5627(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass19_6.aBoolean25) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass30_6.method941();
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ZB)V")
	@Override
	public void method9602(@OriginalArg(0) boolean arg0) {
		super.aClass101_Sub2_43.method5665(260, 8448);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ZI)V")
	@Override
	public void method9600(@OriginalArg(0) boolean arg0) {
		if (super.aClass101_Sub2_43.anInt6350 > 0) {
			@Pc(10) float local10 = -0.5F / (float) super.aClass101_Sub2_43.anInt6350;
			super.aClass101_Sub2_43.method5627(1);
			Static200.aFloatArray22[2] = local10;
			Static200.aFloatArray22[3] = local10 * super.aClass101_Sub2_43.aFloat128 + 0.25F;
			Static200.aFloatArray22[0] = 0.0F;
			Static200.aFloatArray22[1] = 0.0F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static200.aFloatArray22, 0);
			OpenGL.glPopMatrix();
			super.aClass101_Sub2_43.method5661((float) super.aClass101_Sub2_43.anInt6350, 0.5F);
			super.aClass101_Sub2_43.method5690(this.aClass50_Sub2_1);
			super.aClass101_Sub2_43.method5627(0);
		}
		this.aClass30_6.method940('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ILclient!fga;I)V")
	@Override
	public void method9598(@OriginalArg(1) Class50 arg0, @OriginalArg(2) int arg1) {
	}
}
