import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!go")
public final class Class8_Sub4 extends Class8 {

	@OriginalMember(owner = "client!go", name = "n", descriptor = "Lclient!h;")
	private final Class122 aClass122_2;

	@OriginalMember(owner = "client!go", name = "i", descriptor = "Lclient!ml;")
	private final Class204 aClass204_3;

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "(Lclient!en;Lclient!h;)V")
	public Class8_Sub4(@OriginalArg(0) Class90_Sub1 arg0, @OriginalArg(1) Class122 arg1) {
		super(arg0);
		this.aClass122_2 = arg1;
		this.aClass204_3 = new Class204(arg0, 2);
		this.aClass204_3.method4985(0);
		super.aClass90_Sub1_38.method2069(1);
		if (this.aClass122_2.aBoolean288) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass90_Sub1_38.method2069(0);
		this.aClass204_3.method4987();
		this.aClass204_3.method4985(1);
		super.aClass90_Sub1_38.method2069(1);
		if (this.aClass122_2.aBoolean288) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass90_Sub1_38.method2069(0);
		this.aClass204_3.method4987();
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6918(@OriginalArg(0) boolean arg0) {
		this.aClass204_3.method4982('\u0000');
		if (this.aClass122_2.aBoolean288) {
			super.aClass90_Sub1_38.method2069(1);
			super.aClass90_Sub1_38.method2126(this.aClass122_2.aClass16_Sub2_2);
			super.aClass90_Sub1_38.method2069(0);
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method6919() {
		return true;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IIB)V")
	@Override
	public void method6924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) float local14 = (float) ((arg1 & 0x3) + 1) * -5.0E-4F;
		@Pc(25) float local25 = (float) ((arg1 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(36) float local36 = (arg1 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(47) boolean local47 = (arg1 & 0x80) != 0;
		super.aClass90_Sub1_38.method2069(1);
		if (local47) {
			Static476.aFloatArray70[1] = 0.0F;
			Static476.aFloatArray70[2] = 0.0F;
			Static476.aFloatArray70[3] = 0.0F;
			Static476.aFloatArray70[0] = local36;
		} else {
			Static476.aFloatArray70[1] = 0.0F;
			Static476.aFloatArray70[3] = 0.0F;
			Static476.aFloatArray70[2] = local36;
			Static476.aFloatArray70[0] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, Static476.aFloatArray70, 0);
		Static476.aFloatArray70[0] = 0.0F;
		Static476.aFloatArray70[1] = local36;
		Static476.aFloatArray70[3] = local14 * (float) super.aClass90_Sub1_38.anInt2434 % 1.0F;
		Static476.aFloatArray70[2] = 0.0F;
		OpenGL.glTexGenfv(8193, 9474, Static476.aFloatArray70, 0);
		if (this.aClass122_2.aBoolean288) {
			Static476.aFloatArray70[2] = 0.0F;
			Static476.aFloatArray70[0] = 0.0F;
			Static476.aFloatArray70[1] = 0.0F;
			Static476.aFloatArray70[3] = (float) super.aClass90_Sub1_38.anInt2434 * local25 % 1.0F;
			OpenGL.glTexGenfv(8194, 9473, Static476.aFloatArray70, 0);
		} else {
			@Pc(139) int local139 = (int) ((float) super.aClass90_Sub1_38.anInt2434 * local25 * 16.0F);
			super.aClass90_Sub1_38.method2126(this.aClass122_2.aClass16_Sub1Array1[local139 % 16]);
		}
		super.aClass90_Sub1_38.method2069(0);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method6927(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!go", name = "b", descriptor = "(I)V")
	@Override
	public void method6922() {
		this.aClass204_3.method4982('\u0001');
		super.aClass90_Sub1_38.method2069(1);
		super.aClass90_Sub1_38.method2126(null);
		super.aClass90_Sub1_38.method2069(0);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IILclient!it;)V")
	@Override
	public void method6923(@OriginalArg(1) int arg0, @OriginalArg(2) Class16 arg1) {
		super.aClass90_Sub1_38.method2126(arg1);
		super.aClass90_Sub1_38.method2123(arg0);
	}
}
