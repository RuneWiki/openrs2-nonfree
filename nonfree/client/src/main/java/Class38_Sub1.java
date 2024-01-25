import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bk")
public final class Class38_Sub1 extends Class38 {

	@OriginalMember(owner = "client!bk", name = "i", descriptor = "Lclient!mha;")
	private final Class219 aClass219_1;

	@OriginalMember(owner = "client!bk", name = "j", descriptor = "Lclient!pba;")
	private final Class264 aClass264_1;

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Lclient!dia;Lclient!mha;)V")
	public Class38_Sub1(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) Class219 arg1) {
		super(arg0);
		this.aClass219_1 = arg1;
		this.aClass264_1 = new Class264(arg0, 2);
		this.aClass264_1.method6556(0);
		super.aClass13_Sub2_39.method2008(1);
		if (this.aClass219_1.aBoolean431) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass13_Sub2_39.method2008(0);
		this.aClass264_1.method6558();
		this.aClass264_1.method6556(1);
		super.aClass13_Sub2_39.method2008(1);
		if (this.aClass219_1.aBoolean431) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass13_Sub2_39.method2008(0);
		this.aClass264_1.method6558();
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7818() {
		return true;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILclient!il;I)V")
	@Override
	public void method7810(@OriginalArg(1) Class85 arg0, @OriginalArg(2) int arg1) {
		super.aClass13_Sub2_39.method2024(arg0);
		super.aClass13_Sub2_39.method1960(arg1);
	}

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "(I)V")
	@Override
	public void method7819() {
		this.aClass264_1.method6557('\u0001');
		super.aClass13_Sub2_39.method2008(1);
		super.aClass13_Sub2_39.method2024((Class85) null);
		super.aClass13_Sub2_39.method2008(0);
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7813(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(ZZ)V")
	@Override
	public void method7812(@OriginalArg(0) boolean arg0) {
		this.aClass264_1.method6557('\u0000');
		if (this.aClass219_1.aBoolean431) {
			super.aClass13_Sub2_39.method2008(1);
			super.aClass13_Sub2_39.method2024(this.aClass219_1.aClass85_Sub4_1);
			super.aClass13_Sub2_39.method2008(0);
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(III)V")
	@Override
	public void method7814(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) float local14 = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
		@Pc(25) float local25 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(33) float local33 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		super.aClass13_Sub2_39.method2008(1);
		@Pc(46) boolean local46 = (arg0 & 0x80) != 0;
		if (local46) {
			Static82.aFloatArray12[0] = local33;
			Static82.aFloatArray12[1] = 0.0F;
			Static82.aFloatArray12[2] = 0.0F;
			Static82.aFloatArray12[3] = 0.0F;
		} else {
			Static82.aFloatArray12[1] = 0.0F;
			Static82.aFloatArray12[0] = 0.0F;
			Static82.aFloatArray12[2] = local33;
			Static82.aFloatArray12[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, Static82.aFloatArray12, 0);
		Static82.aFloatArray12[2] = 0.0F;
		Static82.aFloatArray12[0] = 0.0F;
		Static82.aFloatArray12[1] = local33;
		Static82.aFloatArray12[3] = local14 * (float) super.aClass13_Sub2_39.anInt2155 % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, Static82.aFloatArray12, 0);
		if (this.aClass219_1.aBoolean431) {
			Static82.aFloatArray12[3] = local25 * (float) super.aClass13_Sub2_39.anInt2155 % 1.0F;
			Static82.aFloatArray12[0] = 0.0F;
			Static82.aFloatArray12[2] = 0.0F;
			Static82.aFloatArray12[1] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static82.aFloatArray12, 0);
		} else {
			@Pc(165) int local165 = (int) ((float) super.aClass13_Sub2_39.anInt2155 * 16.0F * local25);
			super.aClass13_Sub2_39.method2024(this.aClass219_1.aClass85_Sub3Array3[local165 % 16]);
		}
		super.aClass13_Sub2_39.method2008(0);
	}
}
