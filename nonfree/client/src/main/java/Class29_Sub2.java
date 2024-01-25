import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class29_Sub2 extends Class29 {

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "Lclient!sh;")
	private final Class189 aClass189_1;

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "Lclient!tp;")
	private final Class199 aClass199_2;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lclient!h;Lclient!sh;)V")
	public Class29_Sub2(@OriginalArg(0) Class32_Sub2 arg0, @OriginalArg(1) Class189 arg1) {
		super(arg0);
		this.aClass189_1 = arg1;
		@Pc(8) opengl local8 = arg0.anOpengl2;
		this.aClass199_2 = new Class199(arg0, 2);
		this.aClass199_2.method5169(0);
		this.aClass32_Sub2_39.method2314(1);
		if (this.aClass189_1.aBoolean553) {
			local8.glTexGeni(8194, 9472, 9217);
			local8.glEnable(3170);
		}
		local8.glTexGeni(8192, 9472, 9216);
		local8.glTexGeni(8193, 9472, 9216);
		local8.glEnable(3168);
		local8.glEnable(3169);
		this.aClass32_Sub2_39.method2314(0);
		this.aClass199_2.method5168();
		this.aClass199_2.method5169(1);
		this.aClass32_Sub2_39.method2314(1);
		if (this.aClass189_1.aBoolean553) {
			local8.glDisable(3170);
		}
		local8.glDisable(3168);
		local8.glDisable(3169);
		this.aClass32_Sub2_39.method2314(0);
		this.aClass199_2.method5168();
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(Z)V")
	@Override
	public void method5173(@OriginalArg(0) boolean arg0) {
		this.aClass199_2.method5170('\u0000');
		if (this.aClass189_1.aBoolean553) {
			this.aClass32_Sub2_39.method2314(1);
			this.aClass32_Sub2_39.method2287(this.aClass189_1.aClass20_Sub4_2);
			this.aClass32_Sub2_39.method2314(0);
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)V")
	@Override
	public void method5172(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!sd;)V")
	@Override
	public void method5174(@OriginalArg(0) Class20 arg0) {
		this.aClass32_Sub2_39.method2287(arg0);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
	@Override
	public void method5176(@OriginalArg(0) int arg0) {
		@Pc(8) float local8 = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
		@Pc(19) float local19 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(27) float local27 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(35) boolean local35 = (arg0 & 0x80) != 0;
		@Pc(39) opengl local39 = this.aClass32_Sub2_39.anOpengl2;
		this.aClass32_Sub2_39.method2314(1);
		if (local35) {
			Static65.aFloatArray4[0] = local27;
			Static65.aFloatArray4[1] = 0.0F;
			Static65.aFloatArray4[2] = 0.0F;
			Static65.aFloatArray4[3] = 0.0F;
		} else {
			Static65.aFloatArray4[0] = 0.0F;
			Static65.aFloatArray4[1] = 0.0F;
			Static65.aFloatArray4[2] = local27;
			Static65.aFloatArray4[3] = 0.0F;
		}
		local39.glTexGenfv(8192, 9474, Static65.aFloatArray4, 0);
		Static65.aFloatArray4[0] = 0.0F;
		Static65.aFloatArray4[1] = local27;
		Static65.aFloatArray4[2] = 0.0F;
		Static65.aFloatArray4[3] = (float) this.aClass32_Sub2_39.anInt2487 * local8 % 1.0F;
		local39.glTexGenfv(8193, 9474, Static65.aFloatArray4, 0);
		if (this.aClass189_1.aBoolean553) {
			Static65.aFloatArray4[0] = 0.0F;
			Static65.aFloatArray4[1] = 0.0F;
			Static65.aFloatArray4[2] = 0.0F;
			Static65.aFloatArray4[3] = (float) this.aClass32_Sub2_39.anInt2487 * local19 % 1.0F;
			local39.glTexGenfv(8194, 9473, Static65.aFloatArray4, 0);
		} else {
			@Pc(127) int local127 = (int) (local19 * (float) this.aClass32_Sub2_39.anInt2487 * 16.0F);
			this.aClass32_Sub2_39.method2287(this.aClass189_1.aClass20_Sub1Array3[local127 % 16]);
		}
		this.aClass32_Sub2_39.method2314(0);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "()Z")
	@Override
	public boolean method5171() {
		return true;
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "()V")
	@Override
	public void method5175() {
		this.aClass199_2.method5170('\u0001');
		this.aClass32_Sub2_39.method2314(1);
		this.aClass32_Sub2_39.method2287(null);
		this.aClass32_Sub2_39.method2314(0);
	}
}
