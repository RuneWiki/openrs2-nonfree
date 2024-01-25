import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!or")
public final class Class63_Sub5 extends Class63 {

	@OriginalMember(owner = "client!or", name = "p", descriptor = "Lclient!gca;")
	private Class131 aClass131_3;

	@OriginalMember(owner = "client!or", name = "b", descriptor = "Lclient!au;")
	private final Class26 aClass26_3;

	@OriginalMember(owner = "client!or", name = "o", descriptor = "Lclient!st;")
	private final Class125_Sub4 aClass125_Sub4_1;

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Lclient!aq;Lclient!au;)V")
	public Class63_Sub5(@OriginalArg(0) Class22_Sub1 arg0, @OriginalArg(1) Class26 arg1) {
		super(arg0);
		this.aClass26_3 = arg1;
		this.method6492();
		this.aClass125_Sub4_1 = new Class125_Sub4(super.aClass22_Sub1_43, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass125_Sub4_1.method7761();
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ZI)V")
	@Override
	public void method9540(@OriginalArg(0) boolean arg0) {
		super.aClass22_Sub1_43.method900(8448, 260);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(B)V")
	@Override
	public void method9536() {
		this.aClass131_3.method3047('\u0001');
		if (super.aClass22_Sub1_43.anInt1020 > 0) {
			super.aClass22_Sub1_43.method931(1);
			super.aClass22_Sub1_43.method955((Class125) null);
			super.aClass22_Sub1_43.method958(1.0F, 0.0F);
			super.aClass22_Sub1_43.method931(0);
		}
		super.aClass22_Sub1_43.method900(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!or", name = "c", descriptor = "(B)V")
	private void method6492() {
		this.aClass131_3 = new Class131(super.aClass22_Sub1_43, 2);
		this.aClass131_3.method3046(0);
		super.aClass22_Sub1_43.method931(1);
		super.aClass22_Sub1_43.method900(260, 7681);
		super.aClass22_Sub1_43.method935(768, 0, 34168);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass22_Sub1_43.method931(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass26_3.aBoolean83) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass131_3.method3048();
		this.aClass131_3.method3046(1);
		super.aClass22_Sub1_43.method931(1);
		super.aClass22_Sub1_43.method900(8448, 8448);
		super.aClass22_Sub1_43.method935(768, 0, 5890);
		OpenGL.glDisable(3168);
		super.aClass22_Sub1_43.method931(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass26_3.aBoolean83) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass131_3.method3048();
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Lclient!rha;II)V")
	@Override
	public void method9535(@OriginalArg(0) Class125 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(BII)V")
	@Override
	public void method9534(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if ((arg1 & 0x1) == 1) {
			if (this.aClass26_3.aBoolean83) {
				super.aClass22_Sub1_43.method955(this.aClass26_3.aClass125_Sub3_1);
				Static189.aFloatArray17[3] = (float) (super.aClass22_Sub1_43.anInt995 % 4000) / 4000.0F;
				Static189.aFloatArray17[2] = 0.0F;
				Static189.aFloatArray17[0] = 0.0F;
				Static189.aFloatArray17[1] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Static189.aFloatArray17, 0);
			} else {
				@Pc(69) int local69 = super.aClass22_Sub1_43.anInt995 % 4000 * 16 / 4000;
				super.aClass22_Sub1_43.method955(this.aClass26_3.aClass125_Sub1Array1[local69]);
			}
		} else if (this.aClass26_3.aBoolean83) {
			super.aClass22_Sub1_43.method955(this.aClass26_3.aClass125_Sub3_1);
			Static189.aFloatArray17[3] = 0.0F;
			Static189.aFloatArray17[1] = 0.0F;
			Static189.aFloatArray17[0] = 0.0F;
			Static189.aFloatArray17[2] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static189.aFloatArray17, 0);
		} else {
			super.aClass22_Sub1_43.method955(this.aClass26_3.aClass125_Sub1Array1[0]);
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method9539(@OriginalArg(0) boolean arg0) {
		if (super.aClass22_Sub1_43.anInt1020 > 0) {
			@Pc(17) float local17 = -0.5F / (float) super.aClass22_Sub1_43.anInt1020;
			super.aClass22_Sub1_43.method931(1);
			Static189.aFloatArray17[2] = local17;
			Static189.aFloatArray17[3] = local17 * super.aClass22_Sub1_43.aFloat23 + 0.25F;
			Static189.aFloatArray17[0] = 0.0F;
			Static189.aFloatArray17[1] = 0.0F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static189.aFloatArray17, 0);
			OpenGL.glPopMatrix();
			super.aClass22_Sub1_43.method958(0.5F, (float) super.aClass22_Sub1_43.anInt1020);
			super.aClass22_Sub1_43.method955(this.aClass125_Sub4_1);
			super.aClass22_Sub1_43.method931(0);
		}
		this.aClass131_3.method3047('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!or", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method9538() {
		return true;
	}
}
