import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ifa")
public final class Class107_Sub1 extends Class107 {

	@OriginalMember(owner = "client!ifa", name = "o", descriptor = "Lclient!eha;")
	private Class91 aClass91_1;

	@OriginalMember(owner = "client!ifa", name = "l", descriptor = "Lclient!qr;")
	private final Class282 aClass282_1;

	@OriginalMember(owner = "client!ifa", name = "r", descriptor = "Lclient!rha;")
	private final Class88_Sub4 aClass88_Sub4_1;

	@OriginalMember(owner = "client!ifa", name = "<init>", descriptor = "(Lclient!oea;Lclient!qr;)V")
	public Class107_Sub1(@OriginalArg(0) Class87_Sub2 arg0, @OriginalArg(1) Class282 arg1) {
		super(arg0);
		this.aClass282_1 = arg1;
		this.method3900();
		this.aClass88_Sub4_1 = new Class88_Sub4(super.aClass87_Sub2_37, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass88_Sub4_1.method6990();
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7702(@OriginalArg(1) boolean arg0) {
		if (super.aClass87_Sub2_37.anInt7405 > 0) {
			@Pc(10) float local10 = -0.5F / (float) super.aClass87_Sub2_37.anInt7405;
			super.aClass87_Sub2_37.method6155(1);
			Static200.aFloatArray36[3] = local10 * super.aClass87_Sub2_37.aFloat166 + 0.25F;
			Static200.aFloatArray36[1] = 0.0F;
			Static200.aFloatArray36[0] = 0.0F;
			Static200.aFloatArray36[2] = local10;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static200.aFloatArray36, 0);
			OpenGL.glPopMatrix();
			super.aClass87_Sub2_37.method6170((float) super.aClass87_Sub2_37.anInt7405, 0.5F);
			super.aClass87_Sub2_37.method6167(this.aClass88_Sub4_1);
			super.aClass87_Sub2_37.method6155(0);
		}
		this.aClass91_1.method2497('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7697(@OriginalArg(0) boolean arg0) {
		super.aClass87_Sub2_37.method6227(260, 8448);
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7696() {
		return true;
	}

	@OriginalMember(owner = "client!ifa", name = "b", descriptor = "(I)V")
	private void method3900() {
		this.aClass91_1 = new Class91(super.aClass87_Sub2_37, 2);
		this.aClass91_1.method2499(0);
		super.aClass87_Sub2_37.method6155(1);
		super.aClass87_Sub2_37.method6227(7681, 260);
		super.aClass87_Sub2_37.method6206(0, 768, 34168);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass87_Sub2_37.method6155(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass282_1.aBoolean608) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass91_1.method2495();
		this.aClass91_1.method2499(1);
		super.aClass87_Sub2_37.method6155(1);
		super.aClass87_Sub2_37.method6227(8448, 8448);
		super.aClass87_Sub2_37.method6206(0, 768, 5890);
		OpenGL.glDisable(3168);
		super.aClass87_Sub2_37.method6155(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass282_1.aBoolean608) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass91_1.method2495();
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Lclient!iia;ZI)V")
	@Override
	public void method7695(@OriginalArg(0) Class88 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Z)V")
	@Override
	public void method7698() {
		this.aClass91_1.method2497('\u0001');
		if (super.aClass87_Sub2_37.anInt7405 > 0) {
			super.aClass87_Sub2_37.method6155(1);
			super.aClass87_Sub2_37.method6167(null);
			super.aClass87_Sub2_37.method6170(0.0F, 1.0F);
			super.aClass87_Sub2_37.method6155(0);
		}
		super.aClass87_Sub2_37.method6227(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method7700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg1 & 0x1) == 1) {
			if (this.aClass282_1.aBoolean608) {
				super.aClass87_Sub2_37.method6167(this.aClass282_1.aClass88_Sub1_3);
				Static200.aFloatArray36[1] = 0.0F;
				Static200.aFloatArray36[3] = (float) (super.aClass87_Sub2_37.anInt7366 % 4000) / 4000.0F;
				Static200.aFloatArray36[2] = 0.0F;
				Static200.aFloatArray36[0] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Static200.aFloatArray36, 0);
			} else {
				@Pc(69) int local69 = super.aClass87_Sub2_37.anInt7366 % 4000 * 16 / 4000;
				super.aClass87_Sub2_37.method6167(this.aClass282_1.aClass88_Sub2Array1[local69]);
			}
		} else if (this.aClass282_1.aBoolean608) {
			super.aClass87_Sub2_37.method6167(this.aClass282_1.aClass88_Sub1_3);
			Static200.aFloatArray36[1] = 0.0F;
			Static200.aFloatArray36[2] = 0.0F;
			Static200.aFloatArray36[0] = 0.0F;
			Static200.aFloatArray36[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static200.aFloatArray36, 0);
		} else {
			super.aClass87_Sub2_37.method6167(this.aClass282_1.aClass88_Sub2Array1[0]);
		}
	}
}
