import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kfa")
public final class Class38_Sub4 extends Class38 {

	@OriginalMember(owner = "client!kfa", name = "n", descriptor = "Lclient!vb;")
	private Class371 aClass371_1;

	@OriginalMember(owner = "client!kfa", name = "o", descriptor = "Lclient!sn;")
	private final Class336 aClass336_2;

	@OriginalMember(owner = "client!kfa", name = "i", descriptor = "Lclient!mca;")
	private final Class161_Sub2 aClass161_Sub2_1;

	@OriginalMember(owner = "client!kfa", name = "<init>", descriptor = "(Lclient!pi;Lclient!sn;)V")
	public Class38_Sub4(@OriginalArg(0) Class144_Sub3 arg0, @OriginalArg(1) Class336 arg1) {
		super(arg0);
		this.aClass336_2 = arg1;
		this.method4985();
		this.aClass161_Sub2_1 = new Class161_Sub2(super.aClass144_Sub3_43, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass161_Sub2_1.method5550();
	}

	@OriginalMember(owner = "client!kfa", name = "b", descriptor = "(B)V")
	@Override
	public void method9402() {
		this.aClass371_1.method8907('\u0001');
		if (super.aClass144_Sub3_43.anInt8081 > 0) {
			super.aClass144_Sub3_43.method7028(1);
			super.aClass144_Sub3_43.method6982((Class161) null);
			super.aClass144_Sub3_43.method7036(0.0F, 1.0F);
			super.aClass144_Sub3_43.method7028(0);
		}
		super.aClass144_Sub3_43.method7025(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ZLclient!pu;I)V")
	@Override
	public void method9401(@OriginalArg(1) Class161 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(BII)V")
	@Override
	public void method9398(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass336_2.aBoolean650) {
				super.aClass144_Sub3_43.method6982(this.aClass336_2.aClass161_Sub3_2);
				Static509.aFloatArray69[3] = (float) (super.aClass144_Sub3_43.anInt8054 % 4000) / 4000.0F;
				Static509.aFloatArray69[1] = 0.0F;
				Static509.aFloatArray69[0] = 0.0F;
				Static509.aFloatArray69[2] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Static509.aFloatArray69, 0);
			} else {
				@Pc(79) int local79 = super.aClass144_Sub3_43.anInt8054 % 4000 * 16 / 4000;
				super.aClass144_Sub3_43.method6982(this.aClass336_2.aClass161_Sub1Array3[local79]);
			}
		} else if (this.aClass336_2.aBoolean650) {
			super.aClass144_Sub3_43.method6982(this.aClass336_2.aClass161_Sub3_2);
			Static509.aFloatArray69[3] = 0.0F;
			Static509.aFloatArray69[0] = 0.0F;
			Static509.aFloatArray69[2] = 0.0F;
			Static509.aFloatArray69[1] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static509.aFloatArray69, 0);
		} else {
			super.aClass144_Sub3_43.method6982(this.aClass336_2.aClass161_Sub1Array3[0]);
		}
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IZ)V")
	@Override
	public void method9399(@OriginalArg(1) boolean arg0) {
		super.aClass144_Sub3_43.method7025(260, 8448);
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(I)V")
	private void method4985() {
		this.aClass371_1 = new Class371(super.aClass144_Sub3_43, 2);
		this.aClass371_1.method8902(0);
		super.aClass144_Sub3_43.method7028(1);
		super.aClass144_Sub3_43.method7025(7681, 260);
		super.aClass144_Sub3_43.method6979(0, 768, 34168);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass144_Sub3_43.method7028(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass336_2.aBoolean650) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass371_1.method8904();
		this.aClass371_1.method8902(1);
		super.aClass144_Sub3_43.method7028(1);
		super.aClass144_Sub3_43.method7025(8448, 8448);
		super.aClass144_Sub3_43.method6979(0, 768, 5890);
		OpenGL.glDisable(3168);
		super.aClass144_Sub3_43.method7028(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass336_2.aBoolean650) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass371_1.method8904();
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9403() {
		return true;
	}

	@OriginalMember(owner = "client!kfa", name = "b", descriptor = "(IZ)V")
	@Override
	public void method9406(@OriginalArg(1) boolean arg0) {
		if (super.aClass144_Sub3_43.anInt8081 > 0) {
			@Pc(13) float local13 = -0.5F / (float) super.aClass144_Sub3_43.anInt8081;
			super.aClass144_Sub3_43.method7028(1);
			Static509.aFloatArray69[2] = local13;
			Static509.aFloatArray69[1] = 0.0F;
			Static509.aFloatArray69[0] = 0.0F;
			Static509.aFloatArray69[3] = super.aClass144_Sub3_43.aFloat146 * local13 + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static509.aFloatArray69, 0);
			OpenGL.glPopMatrix();
			super.aClass144_Sub3_43.method7036((float) super.aClass144_Sub3_43.anInt8081, 0.5F);
			super.aClass144_Sub3_43.method6982(this.aClass161_Sub2_1);
			super.aClass144_Sub3_43.method7028(0);
		}
		this.aClass371_1.method8907('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}
}
