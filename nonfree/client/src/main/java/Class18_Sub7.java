import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kr")
public final class Class18_Sub7 extends Class18 {

	@OriginalMember(owner = "client!kr", name = "n", descriptor = "Lclient!fa;")
	private final Class101 aClass101_4;

	@OriginalMember(owner = "client!kr", name = "m", descriptor = "Lclient!rj;")
	private final Class303 aClass303_4;

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Lclient!ep;Lclient!fa;)V")
	public Class18_Sub7(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) Class101 arg1) {
		super(arg0);
		this.aClass101_4 = arg1;
		this.aClass303_4 = new Class303(arg0, 2);
		this.aClass303_4.method6859(0);
		super.aClass95_Sub1_39.method2098(1);
		if (this.aClass101_4.aBoolean204) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass95_Sub1_39.method2098(0);
		this.aClass303_4.method6857();
		this.aClass303_4.method6859(1);
		super.aClass95_Sub1_39.method2098(1);
		if (this.aClass101_4.aBoolean204) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass95_Sub1_39.method2098(0);
		this.aClass303_4.method6857();
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7552(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7545(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) float local14 = (float) ((arg0 & 0x3) + 1) * -5.0E-4F;
		@Pc(25) float local25 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(36) float local36 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(47) boolean local47 = (arg0 & 0x80) != 0;
		super.aClass95_Sub1_39.method2098(1);
		if (local47) {
			Static502.aFloatArray14[3] = 0.0F;
			Static502.aFloatArray14[1] = 0.0F;
			Static502.aFloatArray14[0] = local36;
			Static502.aFloatArray14[2] = 0.0F;
		} else {
			Static502.aFloatArray14[0] = 0.0F;
			Static502.aFloatArray14[1] = 0.0F;
			Static502.aFloatArray14[3] = 0.0F;
			Static502.aFloatArray14[2] = local36;
		}
		OpenGL.glTexGenfv(8192, 9474, Static502.aFloatArray14, 0);
		Static502.aFloatArray14[1] = local36;
		Static502.aFloatArray14[0] = 0.0F;
		Static502.aFloatArray14[3] = local14 * (float) super.aClass95_Sub1_39.anInt2513 % 1.0F;
		Static502.aFloatArray14[2] = 0.0F;
		OpenGL.glTexGenfv(8193, 9474, Static502.aFloatArray14, 0);
		if (this.aClass101_4.aBoolean204) {
			Static502.aFloatArray14[1] = 0.0F;
			Static502.aFloatArray14[0] = 0.0F;
			Static502.aFloatArray14[2] = 0.0F;
			Static502.aFloatArray14[3] = local25 * (float) super.aClass95_Sub1_39.anInt2513 % 1.0F;
			OpenGL.glTexGenfv(8194, 9473, Static502.aFloatArray14, 0);
		} else {
			@Pc(142) int local142 = (int) ((float) super.aClass95_Sub1_39.anInt2513 * 16.0F * local25);
			super.aClass95_Sub1_39.method2077(this.aClass101_4.aClass65_Sub1Array2[local142 % 16]);
		}
		super.aClass95_Sub1_39.method2098(0);
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7550(@OriginalArg(1) boolean arg0) {
		this.aClass303_4.method6856('\u0000');
		if (this.aClass101_4.aBoolean204) {
			super.aClass95_Sub1_39.method2098(1);
			super.aClass95_Sub1_39.method2077(this.aClass101_4.aClass65_Sub2_3);
			super.aClass95_Sub1_39.method2098(0);
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IZLclient!hl;)V")
	@Override
	public void method7546(@OriginalArg(0) int arg0, @OriginalArg(2) Class65 arg1) {
		super.aClass95_Sub1_39.method2077(arg1);
		super.aClass95_Sub1_39.method2106(arg0);
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7544() {
		return true;
	}

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(B)V")
	@Override
	public void method7551() {
		this.aClass303_4.method6856('\u0001');
		super.aClass95_Sub1_39.method2098(1);
		super.aClass95_Sub1_39.method2077(null);
		super.aClass95_Sub1_39.method2098(0);
	}
}
