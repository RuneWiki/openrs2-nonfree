import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qp")
public final class Class59_Sub6 extends Class59 {

	@OriginalMember(owner = "client!qp", name = "r", descriptor = "Lclient!lha;")
	private final Class213 aClass213_5;

	@OriginalMember(owner = "client!qp", name = "g", descriptor = "Lclient!vh;")
	private final Class365 aClass365_5;

	@OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(Lclient!bi;Lclient!lha;)V")
	public Class59_Sub6(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) Class213 arg1) {
		super(arg0);
		this.aClass213_5 = arg1;
		this.aClass365_5 = new Class365(arg0, 2);
		this.aClass365_5.method8546(0);
		super.aClass13_Sub2_43.method1093(1);
		if (this.aClass213_5.aBoolean413) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass13_Sub2_43.method1093(0);
		this.aClass365_5.method8549();
		this.aClass365_5.method8546(1);
		super.aClass13_Sub2_43.method1093(1);
		if (this.aClass213_5.aBoolean413) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass13_Sub2_43.method1093(0);
		this.aClass365_5.method8549();
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8588() {
		return true;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8589(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) float local14 = -5.0E-4F * (float) ((arg1 & 0x3) + 1);
		@Pc(25) float local25 = (float) ((arg1 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(36) float local36 = (arg1 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(47) boolean local47 = (arg1 & 0x80) != 0;
		super.aClass13_Sub2_43.method1093(1);
		if (local47) {
			Static373.aFloatArray51[3] = 0.0F;
			Static373.aFloatArray51[2] = 0.0F;
			Static373.aFloatArray51[1] = 0.0F;
			Static373.aFloatArray51[0] = local36;
		} else {
			Static373.aFloatArray51[3] = 0.0F;
			Static373.aFloatArray51[1] = 0.0F;
			Static373.aFloatArray51[0] = 0.0F;
			Static373.aFloatArray51[2] = local36;
		}
		OpenGL.glTexGenfv(8192, 9474, Static373.aFloatArray51, 0);
		Static373.aFloatArray51[0] = 0.0F;
		Static373.aFloatArray51[3] = (float) super.aClass13_Sub2_43.anInt1076 * local14 % 1.0F;
		Static373.aFloatArray51[2] = 0.0F;
		Static373.aFloatArray51[1] = local36;
		OpenGL.glTexGenfv(8193, 9474, Static373.aFloatArray51, 0);
		if (this.aClass213_5.aBoolean413) {
			Static373.aFloatArray51[2] = 0.0F;
			Static373.aFloatArray51[0] = 0.0F;
			Static373.aFloatArray51[1] = 0.0F;
			Static373.aFloatArray51[3] = (float) super.aClass13_Sub2_43.anInt1076 * local25 % 1.0F;
			OpenGL.glTexGenfv(8194, 9473, Static373.aFloatArray51, 0);
		} else {
			@Pc(140) int local140 = (int) (local25 * (float) super.aClass13_Sub2_43.anInt1076 * 16.0F);
			super.aClass13_Sub2_43.method1096(this.aClass213_5.aClass10_Sub2Array2[local140 % 16]);
		}
		super.aClass13_Sub2_43.method1093(0);
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IILclient!cj;)V")
	@Override
	public void method8587(@OriginalArg(1) int arg0, @OriginalArg(2) Class10 arg1) {
		super.aClass13_Sub2_43.method1096(arg1);
		super.aClass13_Sub2_43.method1046(arg0);
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8591(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(B)V")
	@Override
	public void method8590() {
		this.aClass365_5.method8548('\u0001');
		super.aClass13_Sub2_43.method1093(1);
		super.aClass13_Sub2_43.method1096((Class10) null);
		super.aClass13_Sub2_43.method1093(0);
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8593(@OriginalArg(0) boolean arg0) {
		this.aClass365_5.method8548('\u0000');
		if (this.aClass213_5.aBoolean413) {
			super.aClass13_Sub2_43.method1093(1);
			super.aClass13_Sub2_43.method1096(this.aClass213_5.aClass10_Sub4_1);
			super.aClass13_Sub2_43.method1093(0);
		}
	}
}
