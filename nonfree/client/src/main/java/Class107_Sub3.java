import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mt")
public final class Class107_Sub3 extends Class107 {

	@OriginalMember(owner = "client!mt", name = "n", descriptor = "Lclient!qr;")
	private final Class282 aClass282_3;

	@OriginalMember(owner = "client!mt", name = "m", descriptor = "Lclient!eha;")
	private final Class91 aClass91_3;

	@OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Lclient!oea;Lclient!qr;)V")
	public Class107_Sub3(@OriginalArg(0) Class87_Sub2 arg0, @OriginalArg(1) Class282 arg1) {
		super(arg0);
		this.aClass282_3 = arg1;
		this.aClass91_3 = new Class91(arg0, 2);
		this.aClass91_3.method2499(0);
		super.aClass87_Sub2_37.method6155(1);
		if (this.aClass282_3.aBoolean608) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass87_Sub2_37.method6155(0);
		this.aClass91_3.method2495();
		this.aClass91_3.method2499(1);
		super.aClass87_Sub2_37.method6155(1);
		if (this.aClass282_3.aBoolean608) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass87_Sub2_37.method6155(0);
		this.aClass91_3.method2495();
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7697(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7696() {
		return true;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method7700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(20) float local20 = (float) ((arg1 & 0x3) + 1) * -5.0E-4F;
		@Pc(31) float local31 = (float) ((arg1 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(39) float local39 = (arg1 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(47) boolean local47 = (arg1 & 0x80) != 0;
		super.aClass87_Sub2_37.method6155(1);
		if (local47) {
			Static457.aFloatArray67[1] = 0.0F;
			Static457.aFloatArray67[2] = 0.0F;
			Static457.aFloatArray67[0] = local39;
			Static457.aFloatArray67[3] = 0.0F;
		} else {
			Static457.aFloatArray67[2] = local39;
			Static457.aFloatArray67[1] = 0.0F;
			Static457.aFloatArray67[0] = 0.0F;
			Static457.aFloatArray67[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, Static457.aFloatArray67, 0);
		Static457.aFloatArray67[0] = 0.0F;
		Static457.aFloatArray67[2] = 0.0F;
		Static457.aFloatArray67[1] = local39;
		Static457.aFloatArray67[3] = (float) super.aClass87_Sub2_37.anInt7366 * local20 % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, Static457.aFloatArray67, 0);
		if (this.aClass282_3.aBoolean608) {
			Static457.aFloatArray67[0] = 0.0F;
			Static457.aFloatArray67[1] = 0.0F;
			Static457.aFloatArray67[2] = 0.0F;
			Static457.aFloatArray67[3] = local31 * (float) super.aClass87_Sub2_37.anInt7366 % 1.0F;
			OpenGL.glTexGenfv(8194, 9473, Static457.aFloatArray67, 0);
		} else {
			@Pc(135) int local135 = (int) (local31 * 16.0F * (float) super.aClass87_Sub2_37.anInt7366);
			super.aClass87_Sub2_37.method6167(this.aClass282_3.aClass88_Sub2Array2[local135 % 16]);
		}
		super.aClass87_Sub2_37.method6155(0);
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7702(@OriginalArg(1) boolean arg0) {
		this.aClass91_3.method2497('\u0000');
		if (this.aClass282_3.aBoolean608) {
			super.aClass87_Sub2_37.method6155(1);
			super.aClass87_Sub2_37.method6167(this.aClass282_3.aClass88_Sub1_1);
			super.aClass87_Sub2_37.method6155(0);
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(Lclient!iia;ZI)V")
	@Override
	public void method7695(@OriginalArg(0) Class88 arg0, @OriginalArg(2) int arg1) {
		super.aClass87_Sub2_37.method6167(arg0);
		super.aClass87_Sub2_37.method6159(arg1);
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(Z)V")
	@Override
	public void method7698() {
		this.aClass91_3.method2497('\u0001');
		super.aClass87_Sub2_37.method6155(1);
		super.aClass87_Sub2_37.method6167(null);
		super.aClass87_Sub2_37.method6155(0);
	}
}
