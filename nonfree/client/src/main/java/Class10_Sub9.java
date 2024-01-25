import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vm")
public final class Class10_Sub9 extends Class10 {

	@OriginalMember(owner = "client!vm", name = "k", descriptor = "Lclient!pl;")
	private final Class198 aClass198_6;

	@OriginalMember(owner = "client!vm", name = "f", descriptor = "Lclient!bu;")
	private final Class32 aClass32_6;

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(Lclient!ug;Lclient!pl;)V")
	public Class10_Sub9(@OriginalArg(0) Class135_Sub2 arg0, @OriginalArg(1) Class198 arg1) {
		super(arg0);
		this.aClass198_6 = arg1;
		this.aClass32_6 = new Class32(arg0, 2);
		this.aClass32_6.method550(0);
		super.aClass135_Sub2_41.method5457(1);
		if (this.aClass198_6.aBoolean363) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass135_Sub2_41.method5457(0);
		this.aClass32_6.method548();
		this.aClass32_6.method550(1);
		super.aClass135_Sub2_41.method5457(1);
		if (this.aClass198_6.aBoolean363) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass135_Sub2_41.method5457(0);
		this.aClass32_6.method548();
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(B)V")
	@Override
	public void method5729() {
		this.aClass32_6.method547('\u0001');
		super.aClass135_Sub2_41.method5457(1);
		super.aClass135_Sub2_41.method5458(null);
		super.aClass135_Sub2_41.method5457(0);
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lclient!sq;II)V")
	@Override
	public void method5730(@OriginalArg(0) Class65 arg0, @OriginalArg(1) int arg1) {
		super.aClass135_Sub2_41.method5458(arg0);
		super.aClass135_Sub2_41.method5441(arg1);
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method5734(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) float local14 = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
		@Pc(25) float local25 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(36) float local36 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		super.aClass135_Sub2_41.method5457(1);
		@Pc(52) boolean local52 = (arg0 & 0x80) != 0;
		if (local52) {
			Static85.aFloatArray6[1] = 0.0F;
			Static85.aFloatArray6[0] = local36;
			Static85.aFloatArray6[3] = 0.0F;
			Static85.aFloatArray6[2] = 0.0F;
		} else {
			Static85.aFloatArray6[2] = local36;
			Static85.aFloatArray6[3] = 0.0F;
			Static85.aFloatArray6[0] = 0.0F;
			Static85.aFloatArray6[1] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, Static85.aFloatArray6, 0);
		Static85.aFloatArray6[1] = local36;
		Static85.aFloatArray6[2] = 0.0F;
		Static85.aFloatArray6[0] = 0.0F;
		Static85.aFloatArray6[3] = (float) super.aClass135_Sub2_41.anInt6779 * local14 % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, Static85.aFloatArray6, 0);
		if (this.aClass198_6.aBoolean363) {
			Static85.aFloatArray6[0] = 0.0F;
			Static85.aFloatArray6[2] = 0.0F;
			Static85.aFloatArray6[1] = 0.0F;
			Static85.aFloatArray6[3] = (float) super.aClass135_Sub2_41.anInt6779 * local25 % 1.0F;
			OpenGL.glTexGenfv(8194, 9473, Static85.aFloatArray6, 0);
		} else {
			@Pc(142) int local142 = (int) (local25 * (float) super.aClass135_Sub2_41.anInt6779 * 16.0F);
			super.aClass135_Sub2_41.method5458(this.aClass198_6.aClass65_Sub2Array2[local142 % 16]);
		}
		super.aClass135_Sub2_41.method5457(0);
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5733() {
		return true;
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(ZZ)V")
	@Override
	public void method5736(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method5735(@OriginalArg(1) boolean arg0) {
		this.aClass32_6.method547('\u0000');
		if (this.aClass198_6.aBoolean363) {
			super.aClass135_Sub2_41.method5457(1);
			super.aClass135_Sub2_41.method5458(this.aClass198_6.aClass65_Sub1_1);
			super.aClass135_Sub2_41.method5457(0);
		}
	}
}
