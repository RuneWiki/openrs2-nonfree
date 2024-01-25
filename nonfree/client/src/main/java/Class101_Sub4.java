import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jr")
public final class Class101_Sub4 extends Class101 {

	@OriginalMember(owner = "client!jr", name = "o", descriptor = "Lclient!fb;")
	private Class106 aClass106_2;

	@OriginalMember(owner = "client!jr", name = "n", descriptor = "Lclient!pea;")
	private final Class252 aClass252_3;

	@OriginalMember(owner = "client!jr", name = "q", descriptor = "Lclient!gs;")
	private final Class23_Sub3 aClass23_Sub3_1;

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Lclient!qj;Lclient!pea;)V")
	public Class101_Sub4(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) Class252 arg1) {
		super(arg0);
		this.aClass252_3 = arg1;
		this.method4032();
		this.aClass23_Sub3_1 = new Class23_Sub3(super.aClass100_Sub3_43, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass23_Sub3_1.method3118();
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(IZ)V")
	@Override
	public void method7841(@OriginalArg(1) boolean arg0) {
		if (super.aClass100_Sub3_43.bf > 0) {
			@Pc(13) float local13 = -0.5F / (float) super.aClass100_Sub3_43.bf;
			super.aClass100_Sub3_43.method6344(1);
			Static252.aFloatArray41[3] = local13 * super.aClass100_Sub3_43.aFloat213 + 0.25F;
			Static252.aFloatArray41[2] = local13;
			Static252.aFloatArray41[0] = 0.0F;
			Static252.aFloatArray41[1] = 0.0F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static252.aFloatArray41, 0);
			OpenGL.glPopMatrix();
			super.aClass100_Sub3_43.method6286(0.5F, (float) super.aClass100_Sub3_43.bf);
			super.aClass100_Sub3_43.method6277(this.aClass23_Sub3_1);
			super.aClass100_Sub3_43.method6344(0);
		}
		this.aClass106_2.method2294('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(I)V")
	private void method4032() {
		this.aClass106_2 = new Class106(super.aClass100_Sub3_43, 2);
		this.aClass106_2.method2292(0);
		super.aClass100_Sub3_43.method6344(1);
		super.aClass100_Sub3_43.method6300(7681, 260);
		super.aClass100_Sub3_43.method6283(0, 768, 34168);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass100_Sub3_43.method6344(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass252_3.aBoolean546) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass106_2.method2293();
		this.aClass106_2.method2292(1);
		super.aClass100_Sub3_43.method6344(1);
		super.aClass100_Sub3_43.method6300(8448, 8448);
		super.aClass100_Sub3_43.method6283(0, 768, 5890);
		OpenGL.glDisable(3168);
		super.aClass100_Sub3_43.method6344(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass252_3.aBoolean546) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass106_2.method2293();
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IILclient!rg;)V")
	@Override
	public void method7834(@OriginalArg(0) int arg0, @OriginalArg(2) Class23 arg1) {
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)V")
	@Override
	public void method7835() {
		this.aClass106_2.method2294('\u0001');
		if (super.aClass100_Sub3_43.bf > 0) {
			super.aClass100_Sub3_43.method6344(1);
			super.aClass100_Sub3_43.method6277(null);
			super.aClass100_Sub3_43.method6286(1.0F, 0.0F);
			super.aClass100_Sub3_43.method6344(0);
		}
		super.aClass100_Sub3_43.method6300(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7836() {
		return true;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(III)V")
	@Override
	public void method7840(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass252_3.aBoolean546) {
				super.aClass100_Sub3_43.method6277(this.aClass252_3.aClass23_Sub2_3);
				Static252.aFloatArray41[2] = 0.0F;
				Static252.aFloatArray41[3] = (float) (super.aClass100_Sub3_43.anInt7664 % 4000) / 4000.0F;
				Static252.aFloatArray41[1] = 0.0F;
				Static252.aFloatArray41[0] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Static252.aFloatArray41, 0);
			} else {
				@Pc(30) int local30 = super.aClass100_Sub3_43.anInt7664 % 4000 * 16 / 4000;
				super.aClass100_Sub3_43.method6277(this.aClass252_3.aClass23_Sub1Array4[local30]);
			}
		} else if (this.aClass252_3.aBoolean546) {
			super.aClass100_Sub3_43.method6277(this.aClass252_3.aClass23_Sub2_3);
			Static252.aFloatArray41[3] = 0.0F;
			Static252.aFloatArray41[1] = 0.0F;
			Static252.aFloatArray41[2] = 0.0F;
			Static252.aFloatArray41[0] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static252.aFloatArray41, 0);
		} else {
			super.aClass100_Sub3_43.method6277(this.aClass252_3.aClass23_Sub1Array4[0]);
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7839(@OriginalArg(1) boolean arg0) {
		super.aClass100_Sub3_43.method6300(260, 8448);
	}
}
