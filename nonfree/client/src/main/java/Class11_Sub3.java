import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public final class Class11_Sub3 extends Class11 {

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "Lclient!fg;")
	private final Class67 aClass67_3;

	@OriginalMember(owner = "client!jh", name = "d", descriptor = "Lclient!oc;")
	private final Class147 aClass147_4;

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Lclient!ig;Lclient!fg;)V")
	public Class11_Sub3(@OriginalArg(0) Class47_Sub2 arg0, @OriginalArg(1) Class67 arg1) {
		super(arg0);
		this.aClass67_3 = arg1;
		@Pc(8) opengl local8 = arg0.anOpengl2;
		this.aClass147_4 = new Class147(arg0, 2);
		this.aClass147_4.method4035(0);
		this.aClass47_Sub2_33.method2828(1);
		if (this.aClass67_3.aBoolean172) {
			local8.glTexGeni(8194, 9472, 9217);
			local8.glEnable(3170);
		}
		local8.glTexGeni(8192, 9472, 9216);
		local8.glTexGeni(8193, 9472, 9216);
		local8.glEnable(3168);
		local8.glEnable(3169);
		this.aClass47_Sub2_33.method2828(0);
		this.aClass147_4.method4036();
		this.aClass147_4.method4035(1);
		this.aClass47_Sub2_33.method2828(1);
		if (this.aClass67_3.aBoolean172) {
			local8.glDisable(3170);
		}
		local8.glDisable(3168);
		local8.glDisable(3169);
		this.aClass47_Sub2_33.method2828(0);
		this.aClass147_4.method4036();
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V")
	@Override
	public void method4750(@OriginalArg(0) int arg0) {
		@Pc(8) float local8 = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
		@Pc(19) float local19 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(27) float local27 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(35) boolean local35 = (arg0 & 0x80) != 0;
		@Pc(39) opengl local39 = this.aClass47_Sub2_33.anOpengl2;
		this.aClass47_Sub2_33.method2828(1);
		if (local35) {
			Static148.aFloatArray16[0] = local27;
			Static148.aFloatArray16[1] = 0.0F;
			Static148.aFloatArray16[2] = 0.0F;
			Static148.aFloatArray16[3] = 0.0F;
		} else {
			Static148.aFloatArray16[0] = 0.0F;
			Static148.aFloatArray16[1] = 0.0F;
			Static148.aFloatArray16[2] = local27;
			Static148.aFloatArray16[3] = 0.0F;
		}
		local39.glTexGenfv(8192, 9474, Static148.aFloatArray16, 0);
		Static148.aFloatArray16[0] = 0.0F;
		Static148.aFloatArray16[1] = local27;
		Static148.aFloatArray16[2] = 0.0F;
		Static148.aFloatArray16[3] = (float) this.aClass47_Sub2_33.anInt3057 * local8 % 1.0F;
		local39.glTexGenfv(8193, 9474, Static148.aFloatArray16, 0);
		if (this.aClass67_3.aBoolean172) {
			Static148.aFloatArray16[0] = 0.0F;
			Static148.aFloatArray16[1] = 0.0F;
			Static148.aFloatArray16[2] = 0.0F;
			Static148.aFloatArray16[3] = (float) this.aClass47_Sub2_33.anInt3057 * local19 % 1.0F;
			local39.glTexGenfv(8194, 9473, Static148.aFloatArray16, 0);
		} else {
			@Pc(127) int local127 = (int) (local19 * (float) this.aClass47_Sub2_33.anInt3057 * 16.0F);
			this.aClass47_Sub2_33.method2772(this.aClass67_3.aClass52_Sub1Array3[local127 % 16]);
		}
		this.aClass47_Sub2_33.method2828(0);
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(Z)V")
	@Override
	public void method4749(@OriginalArg(0) boolean arg0) {
		this.aClass147_4.method4034('\u0000');
		if (this.aClass67_3.aBoolean172) {
			this.aClass47_Sub2_33.method2828(1);
			this.aClass47_Sub2_33.method2772(this.aClass67_3.aClass52_Sub2_2);
			this.aClass47_Sub2_33.method2828(0);
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "()Z")
	@Override
	public boolean method4747() {
		return true;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!ee;)V")
	@Override
	public void method4746(@OriginalArg(0) Class52 arg0) {
		this.aClass47_Sub2_33.method2772(arg0);
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "()V")
	@Override
	public void method4751() {
		this.aClass147_4.method4034('\u0001');
		this.aClass47_Sub2_33.method2828(1);
		this.aClass47_Sub2_33.method2772(null);
		this.aClass47_Sub2_33.method2828(0);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Z)V")
	@Override
	public void method4748(@OriginalArg(0) boolean arg0) {
	}
}
