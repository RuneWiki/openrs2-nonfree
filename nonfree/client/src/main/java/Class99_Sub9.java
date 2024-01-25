import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!us")
public final class Class99_Sub9 extends Class99 {

	@OriginalMember(owner = "client!us", name = "n", descriptor = "Lclient!bb;")
	private final Class30 aClass30_6;

	@OriginalMember(owner = "client!us", name = "l", descriptor = "Lclient!bia;")
	private final Class42 aClass42_6;

	@OriginalMember(owner = "client!us", name = "<init>", descriptor = "(Lclient!ffa;Lclient!bb;)V")
	public Class99_Sub9(@OriginalArg(0) Class57_Sub2 arg0, @OriginalArg(1) Class30 arg1) {
		super(arg0);
		this.aClass30_6 = arg1;
		this.aClass42_6 = new Class42(arg0, 2);
		this.aClass42_6.method759(0);
		super.aClass57_Sub2_38.method2345(1);
		if (this.aClass30_6.aBoolean47) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass57_Sub2_38.method2345(0);
		this.aClass42_6.method760();
		this.aClass42_6.method759(1);
		super.aClass57_Sub2_38.method2345(1);
		if (this.aClass30_6.aBoolean47) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass57_Sub2_38.method2345(0);
		this.aClass42_6.method760();
	}

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(I)V")
	@Override
	public void method8726() {
		this.aClass42_6.method758('\u0001');
		super.aClass57_Sub2_38.method2345(1);
		super.aClass57_Sub2_38.method2362((Class32) null);
		super.aClass57_Sub2_38.method2345(0);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8720(@OriginalArg(0) boolean arg0) {
		this.aClass42_6.method758('\u0000');
		if (this.aClass30_6.aBoolean47) {
			super.aClass57_Sub2_38.method2345(1);
			super.aClass57_Sub2_38.method2362(this.aClass30_6.aClass32_Sub2_3);
			super.aClass57_Sub2_38.method2345(0);
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IBLclient!mw;)V")
	@Override
	public void method8722(@OriginalArg(0) int arg0, @OriginalArg(2) Class32 arg1) {
		super.aClass57_Sub2_38.method2362(arg1);
		super.aClass57_Sub2_38.method2382(arg0);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8723(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method8716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) float local14 = -5.0E-4F * (float) ((arg1 & 0x3) + 1);
		@Pc(25) float local25 = (float) ((arg1 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(34) float local34 = (arg1 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		super.aClass57_Sub2_38.method2345(1);
		@Pc(53) boolean local53 = (arg1 & 0x80) != 0;
		if (local53) {
			Static592.aFloatArray106[1] = 0.0F;
			Static592.aFloatArray106[0] = local34;
			Static592.aFloatArray106[2] = 0.0F;
			Static592.aFloatArray106[3] = 0.0F;
		} else {
			Static592.aFloatArray106[3] = 0.0F;
			Static592.aFloatArray106[1] = 0.0F;
			Static592.aFloatArray106[0] = 0.0F;
			Static592.aFloatArray106[2] = local34;
		}
		OpenGL.glTexGenfv(8192, 9474, Static592.aFloatArray106, 0);
		Static592.aFloatArray106[3] = local14 * (float) super.aClass57_Sub2_38.anInt2750 % 1.0F;
		Static592.aFloatArray106[1] = local34;
		Static592.aFloatArray106[2] = 0.0F;
		Static592.aFloatArray106[0] = 0.0F;
		OpenGL.glTexGenfv(8193, 9474, Static592.aFloatArray106, 0);
		if (this.aClass30_6.aBoolean47) {
			Static592.aFloatArray106[1] = 0.0F;
			Static592.aFloatArray106[3] = (float) super.aClass57_Sub2_38.anInt2750 * local25 % 1.0F;
			Static592.aFloatArray106[2] = 0.0F;
			Static592.aFloatArray106[0] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static592.aFloatArray106, 0);
		} else {
			@Pc(172) int local172 = (int) (local25 * (float) super.aClass57_Sub2_38.anInt2750 * 16.0F);
			super.aClass57_Sub2_38.method2362(this.aClass30_6.aClass32_Sub1Array1[local172 % 16]);
		}
		super.aClass57_Sub2_38.method2345(0);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8718() {
		return true;
	}
}
