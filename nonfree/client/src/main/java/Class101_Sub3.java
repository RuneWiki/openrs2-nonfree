import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jga")
public final class Class101_Sub3 extends Class101 {

	@OriginalMember(owner = "client!jga", name = "u", descriptor = "Lclient!pea;")
	private final Class252 aClass252_2;

	@OriginalMember(owner = "client!jga", name = "l", descriptor = "Lclient!fb;")
	private final Class106 aClass106_1;

	@OriginalMember(owner = "client!jga", name = "<init>", descriptor = "(Lclient!qj;Lclient!pea;)V")
	public Class101_Sub3(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) Class252 arg1) {
		super(arg0);
		this.aClass252_2 = arg1;
		this.aClass106_1 = new Class106(arg0, 2);
		this.aClass106_1.method2292(0);
		super.aClass100_Sub3_43.method6344(1);
		if (this.aClass252_2.aBoolean546) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass100_Sub3_43.method6344(0);
		this.aClass106_1.method2293();
		this.aClass106_1.method2292(1);
		super.aClass100_Sub3_43.method6344(1);
		if (this.aClass252_2.aBoolean546) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass100_Sub3_43.method6344(0);
		this.aClass106_1.method2293();
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7839(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(IILclient!rg;)V")
	@Override
	public void method7834(@OriginalArg(0) int arg0, @OriginalArg(2) Class23 arg1) {
		super.aClass100_Sub3_43.method6277(arg1);
		super.aClass100_Sub3_43.method6322(arg0);
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(III)V")
	@Override
	public void method7840(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) float local14 = (float) ((arg0 & 0x3) + 1) * -5.0E-4F;
		@Pc(25) float local25 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(36) float local36 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(47) boolean local47 = (arg0 & 0x80) != 0;
		super.aClass100_Sub3_43.method6344(1);
		if (local47) {
			Static436.aFloatArray58[2] = 0.0F;
			Static436.aFloatArray58[0] = local36;
			Static436.aFloatArray58[1] = 0.0F;
			Static436.aFloatArray58[3] = 0.0F;
		} else {
			Static436.aFloatArray58[1] = 0.0F;
			Static436.aFloatArray58[2] = local36;
			Static436.aFloatArray58[0] = 0.0F;
			Static436.aFloatArray58[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, Static436.aFloatArray58, 0);
		Static436.aFloatArray58[1] = local36;
		Static436.aFloatArray58[3] = local14 * (float) super.aClass100_Sub3_43.anInt7664 % 1.0F;
		Static436.aFloatArray58[2] = 0.0F;
		Static436.aFloatArray58[0] = 0.0F;
		OpenGL.glTexGenfv(8193, 9474, Static436.aFloatArray58, 0);
		if (this.aClass252_2.aBoolean546) {
			Static436.aFloatArray58[3] = (float) super.aClass100_Sub3_43.anInt7664 * local25 % 1.0F;
			Static436.aFloatArray58[0] = 0.0F;
			Static436.aFloatArray58[2] = 0.0F;
			Static436.aFloatArray58[1] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static436.aFloatArray58, 0);
		} else {
			@Pc(173) int local173 = (int) ((float) super.aClass100_Sub3_43.anInt7664 * local25 * 16.0F);
			super.aClass100_Sub3_43.method6277(this.aClass252_2.aClass23_Sub1Array3[local173 % 16]);
		}
		super.aClass100_Sub3_43.method6344(0);
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7836() {
		return true;
	}

	@OriginalMember(owner = "client!jga", name = "b", descriptor = "(IZ)V")
	@Override
	public void method7841(@OriginalArg(1) boolean arg0) {
		this.aClass106_1.method2294('\u0000');
		if (this.aClass252_2.aBoolean546) {
			super.aClass100_Sub3_43.method6344(1);
			super.aClass100_Sub3_43.method6277(this.aClass252_2.aClass23_Sub2_1);
			super.aClass100_Sub3_43.method6344(0);
		}
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(I)V")
	@Override
	public void method7835() {
		this.aClass106_1.method2294('\u0001');
		super.aClass100_Sub3_43.method6344(1);
		super.aClass100_Sub3_43.method6277(null);
		super.aClass100_Sub3_43.method6344(0);
	}
}
