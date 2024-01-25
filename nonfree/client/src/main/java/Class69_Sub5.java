import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gp")
public final class Class69_Sub5 extends Class69 {

	@OriginalMember(owner = "client!gp", name = "m", descriptor = "Lclient!kca;")
	private Class203 aClass203_2;

	@OriginalMember(owner = "client!gp", name = "n", descriptor = "Lclient!au;")
	private final Class27 aClass27_2;

	@OriginalMember(owner = "client!gp", name = "g", descriptor = "Lclient!ws;")
	private final Class44_Sub4 aClass44_Sub4_1;

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Lclient!ml;Lclient!au;)V")
	public Class69_Sub5(@OriginalArg(0) Class75_Sub3 arg0, @OriginalArg(1) Class27 arg1) {
		super(arg0);
		this.aClass27_2 = arg1;
		this.method3769();
		this.aClass44_Sub4_1 = new Class44_Sub4(super.aClass75_Sub3_41, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass44_Sub4_1.method9014();
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8637() {
		return true;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IZLclient!ica;)V")
	@Override
	public void method8631(@OriginalArg(0) int arg0, @OriginalArg(2) Class44 arg1) {
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(I)V")
	@Override
	public void method8638() {
		this.aClass203_2.method4855('\u0001');
		if (super.aClass75_Sub3_41.anInt6554 > 0) {
			super.aClass75_Sub3_41.method5775(1);
			super.aClass75_Sub3_41.method5774((Class44) null);
			super.aClass75_Sub3_41.method5830(0.0F, 1.0F);
			super.aClass75_Sub3_41.method5775(0);
		}
		super.aClass75_Sub3_41.method5784(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8635(@OriginalArg(0) boolean arg0) {
		if (super.aClass75_Sub3_41.anInt6554 > 0) {
			@Pc(10) float local10 = -0.5F / (float) super.aClass75_Sub3_41.anInt6554;
			super.aClass75_Sub3_41.method5775(1);
			Static186.aFloatArray41[0] = 0.0F;
			Static186.aFloatArray41[3] = super.aClass75_Sub3_41.aFloat129 * local10 + 0.25F;
			Static186.aFloatArray41[1] = 0.0F;
			Static186.aFloatArray41[2] = local10;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static186.aFloatArray41, 0);
			OpenGL.glPopMatrix();
			super.aClass75_Sub3_41.method5830((float) super.aClass75_Sub3_41.anInt6554, 0.5F);
			super.aClass75_Sub3_41.method5774(this.aClass44_Sub4_1);
			super.aClass75_Sub3_41.method5775(0);
		}
		this.aClass203_2.method4855('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8632(@OriginalArg(0) boolean arg0) {
		super.aClass75_Sub3_41.method5784(8448, 260);
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8634(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass27_2.aBoolean31) {
				super.aClass75_Sub3_41.method5774(this.aClass27_2.aClass44_Sub3_1);
				Static186.aFloatArray41[1] = 0.0F;
				Static186.aFloatArray41[2] = 0.0F;
				Static186.aFloatArray41[0] = 0.0F;
				Static186.aFloatArray41[3] = (float) (super.aClass75_Sub3_41.anInt6532 % 4000) / 4000.0F;
				OpenGL.glTexGenfv(8194, 9473, Static186.aFloatArray41, 0);
			} else {
				@Pc(22) int local22 = super.aClass75_Sub3_41.anInt6532 % 4000 * 16 / 4000;
				super.aClass75_Sub3_41.method5774(this.aClass27_2.aClass44_Sub1Array1[local22]);
			}
		} else if (this.aClass27_2.aBoolean31) {
			super.aClass75_Sub3_41.method5774(this.aClass27_2.aClass44_Sub3_1);
			Static186.aFloatArray41[0] = 0.0F;
			Static186.aFloatArray41[1] = 0.0F;
			Static186.aFloatArray41[2] = 0.0F;
			Static186.aFloatArray41[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static186.aFloatArray41, 0);
		} else {
			super.aClass75_Sub3_41.method5774(this.aClass27_2.aClass44_Sub1Array1[0]);
		}
	}

	@OriginalMember(owner = "client!gp", name = "c", descriptor = "(I)V")
	private void method3769() {
		this.aClass203_2 = new Class203(super.aClass75_Sub3_41, 2);
		this.aClass203_2.method4857(0);
		super.aClass75_Sub3_41.method5775(1);
		super.aClass75_Sub3_41.method5784(260, 7681);
		super.aClass75_Sub3_41.method5825(768, 0, 34168);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass75_Sub3_41.method5775(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass27_2.aBoolean31) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass203_2.method4854();
		this.aClass203_2.method4857(1);
		super.aClass75_Sub3_41.method5775(1);
		super.aClass75_Sub3_41.method5784(8448, 8448);
		super.aClass75_Sub3_41.method5825(768, 0, 5890);
		OpenGL.glDisable(3168);
		super.aClass75_Sub3_41.method5775(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass27_2.aBoolean31) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass203_2.method4854();
	}
}
