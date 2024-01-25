import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!us")
public final class Class76_Sub9 extends Class76 {

	@OriginalMember(owner = "client!us", name = "s", descriptor = "Lclient!pe;")
	private final Class191 aClass191_6;

	@OriginalMember(owner = "client!us", name = "q", descriptor = "Lclient!cn;")
	private final Class46 aClass46_6;

	@OriginalMember(owner = "client!us", name = "<init>", descriptor = "(Lclient!qg;Lclient!pe;)V")
	public Class76_Sub9(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) Class191 arg1) {
		super(arg0);
		this.aClass191_6 = arg1;
		this.aClass46_6 = new Class46(arg0, 2);
		this.aClass46_6.method778(0);
		super.aClass121_Sub2_39.method4669(1);
		if (this.aClass191_6.aBoolean403) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass121_Sub2_39.method4669(0);
		this.aClass46_6.method779();
		this.aClass46_6.method778(1);
		super.aClass121_Sub2_39.method4669(1);
		if (this.aClass191_6.aBoolean403) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass121_Sub2_39.method4669(0);
		this.aClass46_6.method779();
	}

	@OriginalMember(owner = "client!us", name = "c", descriptor = "(I)V")
	@Override
	public void method5613() {
		this.aClass46_6.method781('\u0001');
		super.aClass121_Sub2_39.method4669(1);
		super.aClass121_Sub2_39.method4681(null);
		super.aClass121_Sub2_39.method4669(0);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5611(@OriginalArg(0) boolean arg0) {
		this.aClass46_6.method781('\u0000');
		if (this.aClass191_6.aBoolean403) {
			super.aClass121_Sub2_39.method4669(1);
			super.aClass121_Sub2_39.method4681(this.aClass191_6.aClass21_Sub1_2);
			super.aClass121_Sub2_39.method4669(0);
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(ILclient!go;B)V")
	@Override
	public void method5609(@OriginalArg(0) int arg0, @OriginalArg(1) Class21 arg1) {
		super.aClass121_Sub2_39.method4681(arg1);
		super.aClass121_Sub2_39.method4707(arg0);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method5608(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IIB)V")
	@Override
	public void method5604(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) float local14 = (float) ((arg1 & 0x3) + 1) * -5.0E-4F;
		@Pc(25) float local25 = (float) ((arg1 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(36) float local36 = (arg1 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(44) boolean local44 = (arg1 & 0x80) != 0;
		super.aClass121_Sub2_39.method4669(1);
		if (local44) {
			Static111.aFloatArray2[1] = 0.0F;
			Static111.aFloatArray2[2] = 0.0F;
			Static111.aFloatArray2[0] = local36;
			Static111.aFloatArray2[3] = 0.0F;
		} else {
			Static111.aFloatArray2[2] = local36;
			Static111.aFloatArray2[1] = 0.0F;
			Static111.aFloatArray2[0] = 0.0F;
			Static111.aFloatArray2[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, Static111.aFloatArray2, 0);
		Static111.aFloatArray2[0] = 0.0F;
		Static111.aFloatArray2[2] = 0.0F;
		Static111.aFloatArray2[1] = local36;
		Static111.aFloatArray2[3] = (float) super.aClass121_Sub2_39.anInt5935 * local14 % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, Static111.aFloatArray2, 0);
		if (this.aClass191_6.aBoolean403) {
			Static111.aFloatArray2[2] = 0.0F;
			Static111.aFloatArray2[0] = 0.0F;
			Static111.aFloatArray2[3] = (float) super.aClass121_Sub2_39.anInt5935 * local25 % 1.0F;
			Static111.aFloatArray2[1] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static111.aFloatArray2, 0);
		} else {
			@Pc(136) int local136 = (int) ((float) super.aClass121_Sub2_39.anInt5935 * local25 * 16.0F);
			super.aClass121_Sub2_39.method4681(this.aClass191_6.aClass21_Sub2Array2[local136 % 16]);
		}
		super.aClass121_Sub2_39.method4669(0);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5606() {
		return true;
	}
}
