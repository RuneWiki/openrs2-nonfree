import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rv")
public final class Class22_Sub8 extends Class22 {

	@OriginalMember(owner = "client!rv", name = "z", descriptor = "Lclient!ik;")
	private Class164 aClass164_6;

	@OriginalMember(owner = "client!rv", name = "p", descriptor = "Lclient!tf;")
	private final Class336 aClass336_6;

	@OriginalMember(owner = "client!rv", name = "n", descriptor = "Lclient!pc;")
	private final Class10_Sub4 aClass10_Sub4_1;

	@OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(Lclient!lf;Lclient!tf;)V")
	public Class22_Sub8(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) Class336 arg1) {
		super(arg0);
		this.aClass336_6 = arg1;
		this.method6877();
		this.aClass10_Sub4_1 = new Class10_Sub4(super.aClass95_Sub3_37, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass10_Sub4_1.method6103();
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(I)V")
	private void method6877() {
		this.aClass164_6 = new Class164(super.aClass95_Sub3_37, 2);
		this.aClass164_6.method3846(0);
		super.aClass95_Sub3_37.method4900(1);
		super.aClass95_Sub3_37.method4899(7681, 260);
		super.aClass95_Sub3_37.method4869(34168, 0, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass95_Sub3_37.method4900(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass336_6.aBoolean645) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass164_6.method3848();
		this.aClass164_6.method3846(1);
		super.aClass95_Sub3_37.method4900(1);
		super.aClass95_Sub3_37.method4899(8448, 8448);
		super.aClass95_Sub3_37.method4869(5890, 0, 768);
		OpenGL.glDisable(3168);
		super.aClass95_Sub3_37.method4900(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass336_6.aBoolean645) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass164_6.method3848();
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(III)V")
	@Override
	public void method6985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg1 & 0x1) == 1) {
			if (this.aClass336_6.aBoolean645) {
				super.aClass95_Sub3_37.method4864(this.aClass336_6.aClass10_Sub1_3);
				Static187.aFloatArray23[3] = (float) (super.aClass95_Sub3_37.anInt5751 % 4000) / 4000.0F;
				Static187.aFloatArray23[2] = 0.0F;
				Static187.aFloatArray23[0] = 0.0F;
				Static187.aFloatArray23[1] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Static187.aFloatArray23, 0);
			} else {
				@Pc(62) int local62 = super.aClass95_Sub3_37.anInt5751 % 4000 * 16 / 4000;
				super.aClass95_Sub3_37.method4864(this.aClass336_6.aClass10_Sub2Array3[local62]);
			}
		} else if (this.aClass336_6.aBoolean645) {
			super.aClass95_Sub3_37.method4864(this.aClass336_6.aClass10_Sub1_3);
			Static187.aFloatArray23[2] = 0.0F;
			Static187.aFloatArray23[0] = 0.0F;
			Static187.aFloatArray23[3] = 0.0F;
			Static187.aFloatArray23[1] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static187.aFloatArray23, 0);
		} else {
			super.aClass95_Sub3_37.method4864(this.aClass336_6.aClass10_Sub2Array3[0]);
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method6978(@OriginalArg(0) boolean arg0) {
		if (super.aClass95_Sub3_37.anInt5780 > 0) {
			@Pc(13) float local13 = -0.5F / (float) super.aClass95_Sub3_37.anInt5780;
			super.aClass95_Sub3_37.method4900(1);
			Static187.aFloatArray23[0] = 0.0F;
			Static187.aFloatArray23[3] = super.aClass95_Sub3_37.aFloat88 * local13 + 0.25F;
			Static187.aFloatArray23[2] = local13;
			Static187.aFloatArray23[1] = 0.0F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static187.aFloatArray23, 0);
			OpenGL.glPopMatrix();
			super.aClass95_Sub3_37.method4886((float) super.aClass95_Sub3_37.anInt5780, 0.5F);
			super.aClass95_Sub3_37.method4864(this.aClass10_Sub4_1);
			super.aClass95_Sub3_37.method4900(0);
		}
		this.aClass164_6.method3843('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6982() {
		return true;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lclient!ru;II)V")
	@Override
	public void method6979(@OriginalArg(0) Class10 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)V")
	@Override
	public void method6980() {
		this.aClass164_6.method3843('\u0001');
		if (super.aClass95_Sub3_37.anInt5780 > 0) {
			super.aClass95_Sub3_37.method4900(1);
			super.aClass95_Sub3_37.method4864((Class10) null);
			super.aClass95_Sub3_37.method4886(0.0F, 1.0F);
			super.aClass95_Sub3_37.method4900(0);
		}
		super.aClass95_Sub3_37.method4899(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6984(@OriginalArg(0) boolean arg0) {
		super.aClass95_Sub3_37.method4899(260, 8448);
	}
}
