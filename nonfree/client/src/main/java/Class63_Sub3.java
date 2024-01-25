import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gr")
public final class Class63_Sub3 extends Class63 {

	@OriginalMember(owner = "client!gr", name = "d", descriptor = "Lclient!au;")
	private final Class26 aClass26_1;

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "Lclient!gca;")
	private final Class131 aClass131_1;

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(Lclient!aq;Lclient!au;)V")
	public Class63_Sub3(@OriginalArg(0) Class22_Sub1 arg0, @OriginalArg(1) Class26 arg1) {
		super(arg0);
		this.aClass26_1 = arg1;
		this.aClass131_1 = new Class131(arg0, 2);
		this.aClass131_1.method3046(0);
		super.aClass22_Sub1_43.method931(1);
		if (this.aClass26_1.aBoolean83) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass22_Sub1_43.method931(0);
		this.aClass131_1.method3048();
		this.aClass131_1.method3046(1);
		super.aClass22_Sub1_43.method931(1);
		if (this.aClass26_1.aBoolean83) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass22_Sub1_43.method931(0);
		this.aClass131_1.method3048();
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lclient!rha;II)V")
	@Override
	public void method9535(@OriginalArg(0) Class125 arg0, @OriginalArg(2) int arg1) {
		super.aClass22_Sub1_43.method955(arg0);
		super.aClass22_Sub1_43.method894(arg1);
	}

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method9538() {
		return true;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method9539(@OriginalArg(0) boolean arg0) {
		this.aClass131_1.method3047('\u0000');
		if (this.aClass26_1.aBoolean83) {
			super.aClass22_Sub1_43.method931(1);
			super.aClass22_Sub1_43.method955(this.aClass26_1.aClass125_Sub3_2);
			super.aClass22_Sub1_43.method931(0);
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(BII)V")
	@Override
	public void method9534(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(22) float local22 = (float) ((arg1 & 0x3) + 1) * -5.0E-4F;
		@Pc(33) float local33 = (float) ((arg1 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(42) float local42 = (arg1 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(51) boolean local51 = (arg1 & 0x80) != 0;
		super.aClass22_Sub1_43.method931(1);
		if (local51) {
			Static691.aFloatArray82[1] = 0.0F;
			Static691.aFloatArray82[0] = local42;
			Static691.aFloatArray82[3] = 0.0F;
			Static691.aFloatArray82[2] = 0.0F;
		} else {
			Static691.aFloatArray82[1] = 0.0F;
			Static691.aFloatArray82[3] = 0.0F;
			Static691.aFloatArray82[0] = 0.0F;
			Static691.aFloatArray82[2] = local42;
		}
		OpenGL.glTexGenfv(8192, 9474, Static691.aFloatArray82, 0);
		Static691.aFloatArray82[0] = 0.0F;
		Static691.aFloatArray82[3] = local22 * (float) super.aClass22_Sub1_43.anInt995 % 1.0F;
		Static691.aFloatArray82[1] = local42;
		Static691.aFloatArray82[2] = 0.0F;
		OpenGL.glTexGenfv(8193, 9474, Static691.aFloatArray82, 0);
		if (this.aClass26_1.aBoolean83) {
			Static691.aFloatArray82[2] = 0.0F;
			Static691.aFloatArray82[3] = local33 * (float) super.aClass22_Sub1_43.anInt995 % 1.0F;
			Static691.aFloatArray82[1] = 0.0F;
			Static691.aFloatArray82[0] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static691.aFloatArray82, 0);
		} else {
			@Pc(143) int local143 = (int) ((float) super.aClass22_Sub1_43.anInt995 * 16.0F * local33);
			super.aClass22_Sub1_43.method955(this.aClass26_1.aClass125_Sub1Array2[local143 % 16]);
		}
		super.aClass22_Sub1_43.method931(0);
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(B)V")
	@Override
	public void method9536() {
		this.aClass131_1.method3047('\u0001');
		super.aClass22_Sub1_43.method931(1);
		super.aClass22_Sub1_43.method955((Class125) null);
		super.aClass22_Sub1_43.method931(0);
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(ZI)V")
	@Override
	public void method9540(@OriginalArg(0) boolean arg0) {
	}
}
