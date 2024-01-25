import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class36_Sub3 extends Class36 {

	@OriginalMember(owner = "client!ng", name = "j", descriptor = "Lclient!ri;")
	private final Class212 aClass212_3;

	@OriginalMember(owner = "client!ng", name = "q", descriptor = "Lclient!iq;")
	private final Class120 aClass120_3;

	static {
		new Class256("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
	}

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lclient!bo;Lclient!ri;)V")
	public Class36_Sub3(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(1) Class212 arg1) {
		super(arg0);
		this.aClass212_3 = arg1;
		this.aClass120_3 = new Class120(arg0, 2);
		this.aClass120_3.method2784(0);
		super.aClass26_Sub1_43.method696(1);
		if (this.aClass212_3.aBoolean527) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass26_Sub1_43.method696(0);
		this.aClass120_3.method2781();
		this.aClass120_3.method2784(1);
		super.aClass26_Sub1_43.method696(1);
		if (this.aClass212_3.aBoolean527) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass26_Sub1_43.method696(0);
		this.aClass120_3.method2781();
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!nk;II)V")
	@Override
	public void method6008(@OriginalArg(0) Class65 arg0, @OriginalArg(2) int arg1) {
		super.aClass26_Sub1_43.method673(arg0);
		super.aClass26_Sub1_43.method669(arg1);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IZ)V")
	@Override
	public void method6011(@OriginalArg(1) boolean arg0) {
		this.aClass120_3.method2782('\u0000');
		if (this.aClass212_3.aBoolean527) {
			super.aClass26_Sub1_43.method696(1);
			super.aClass26_Sub1_43.method673(this.aClass212_3.aClass65_Sub2_2);
			super.aClass26_Sub1_43.method696(0);
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V")
	@Override
	public void method6012() {
		this.aClass120_3.method2782('\u0001');
		super.aClass26_Sub1_43.method696(1);
		super.aClass26_Sub1_43.method673(null);
		super.aClass26_Sub1_43.method696(0);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6010() {
		return true;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6015(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZII)V")
	@Override
	public void method6007(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) float local14 = -5.0E-4F * (float) ((arg1 & 0x3) + 1);
		@Pc(25) float local25 = (float) ((arg1 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(36) float local36 = (arg1 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(47) boolean local47 = (arg1 & 0x80) != 0;
		super.aClass26_Sub1_43.method696(1);
		if (local47) {
			Static230.aFloatArray25[3] = 0.0F;
			Static230.aFloatArray25[0] = local36;
			Static230.aFloatArray25[1] = 0.0F;
			Static230.aFloatArray25[2] = 0.0F;
		} else {
			Static230.aFloatArray25[3] = 0.0F;
			Static230.aFloatArray25[2] = local36;
			Static230.aFloatArray25[0] = 0.0F;
			Static230.aFloatArray25[1] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, Static230.aFloatArray25, 0);
		Static230.aFloatArray25[1] = local36;
		Static230.aFloatArray25[3] = (float) super.aClass26_Sub1_43.anInt925 * local14 % 1.0F;
		Static230.aFloatArray25[0] = 0.0F;
		Static230.aFloatArray25[2] = 0.0F;
		OpenGL.glTexGenfv(8193, 9474, Static230.aFloatArray25, 0);
		if (this.aClass212_3.aBoolean527) {
			Static230.aFloatArray25[3] = (float) super.aClass26_Sub1_43.anInt925 * local25 % 1.0F;
			Static230.aFloatArray25[0] = 0.0F;
			Static230.aFloatArray25[1] = 0.0F;
			Static230.aFloatArray25[2] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static230.aFloatArray25, 0);
		} else {
			@Pc(169) int local169 = (int) (local25 * 16.0F * (float) super.aClass26_Sub1_43.anInt925);
			super.aClass26_Sub1_43.method673(this.aClass212_3.aClass65_Sub3Array3[local169 % 16]);
		}
		super.aClass26_Sub1_43.method696(0);
	}
}
