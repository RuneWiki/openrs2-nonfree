import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fj")
public final class Class8_Sub3 extends Class8 {

	@OriginalMember(owner = "client!fj", name = "d", descriptor = "Lclient!co;")
	private final Class37 aClass37_1;

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "Lclient!t;")
	private final Class217 aClass217_3;

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lclient!qi;Lclient!co;)V")
	public Class8_Sub3(@OriginalArg(0) Class82_Sub2 arg0, @OriginalArg(1) Class37 arg1) {
		super(arg0);
		this.aClass37_1 = arg1;
		@Pc(8) opengl local8 = arg0.anOpengl2;
		this.aClass217_3 = new Class217(arg0, 2);
		this.aClass217_3.method5088(0);
		this.aClass82_Sub2_34.method4582(1);
		if (this.aClass37_1.aBoolean82) {
			local8.glTexGeni(8194, 9472, 9217);
			local8.glEnable(3170);
		}
		local8.glTexGeni(8192, 9472, 9216);
		local8.glTexGeni(8193, 9472, 9216);
		local8.glEnable(3168);
		local8.glEnable(3169);
		this.aClass82_Sub2_34.method4582(0);
		this.aClass217_3.method5090();
		this.aClass217_3.method5088(1);
		this.aClass82_Sub2_34.method4582(1);
		if (this.aClass37_1.aBoolean82) {
			local8.glDisable(3170);
		}
		local8.glDisable(3168);
		local8.glDisable(3169);
		this.aClass82_Sub2_34.method4582(0);
		this.aClass217_3.method5090();
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Z)V")
	@Override
	public void method4891(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "()Z")
	@Override
	public boolean method4892() {
		return true;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V")
	@Override
	public void method4895(@OriginalArg(0) int arg0) {
		@Pc(8) float local8 = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
		@Pc(19) float local19 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(27) float local27 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(35) boolean local35 = (arg0 & 0x80) != 0;
		@Pc(39) opengl local39 = this.aClass82_Sub2_34.anOpengl2;
		this.aClass82_Sub2_34.method4582(1);
		if (local35) {
			Static96.aFloatArray5[0] = local27;
			Static96.aFloatArray5[1] = 0.0F;
			Static96.aFloatArray5[2] = 0.0F;
			Static96.aFloatArray5[3] = 0.0F;
		} else {
			Static96.aFloatArray5[0] = 0.0F;
			Static96.aFloatArray5[1] = 0.0F;
			Static96.aFloatArray5[2] = local27;
			Static96.aFloatArray5[3] = 0.0F;
		}
		local39.glTexGenfv(8192, 9474, Static96.aFloatArray5, 0);
		Static96.aFloatArray5[0] = 0.0F;
		Static96.aFloatArray5[1] = local27;
		Static96.aFloatArray5[2] = 0.0F;
		Static96.aFloatArray5[3] = (float) this.aClass82_Sub2_34.anInt5197 * local8 % 1.0F;
		local39.glTexGenfv(8193, 9474, Static96.aFloatArray5, 0);
		if (this.aClass37_1.aBoolean82) {
			Static96.aFloatArray5[0] = 0.0F;
			Static96.aFloatArray5[1] = 0.0F;
			Static96.aFloatArray5[2] = 0.0F;
			Static96.aFloatArray5[3] = (float) this.aClass82_Sub2_34.anInt5197 * local19 % 1.0F;
			local39.glTexGenfv(8194, 9473, Static96.aFloatArray5, 0);
		} else {
			@Pc(127) int local127 = (int) (local19 * (float) this.aClass82_Sub2_34.anInt5197 * 16.0F);
			this.aClass82_Sub2_34.method4614(this.aClass37_1.aClass7_Sub1Array1[local127 % 16]);
		}
		this.aClass82_Sub2_34.method4582(0);
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "()V")
	@Override
	public void method4893() {
		this.aClass217_3.method5089('\u0001');
		this.aClass82_Sub2_34.method4582(1);
		this.aClass82_Sub2_34.method4614(null);
		this.aClass82_Sub2_34.method4582(0);
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(Z)V")
	@Override
	public void method4896(@OriginalArg(0) boolean arg0) {
		this.aClass217_3.method5089('\u0000');
		if (this.aClass37_1.aBoolean82) {
			this.aClass82_Sub2_34.method4582(1);
			this.aClass82_Sub2_34.method4614(this.aClass37_1.aClass7_Sub3_2);
			this.aClass82_Sub2_34.method4582(0);
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lclient!et;)V")
	@Override
	public void method4894(@OriginalArg(0) Class7 arg0) {
		this.aClass82_Sub2_34.method4614(arg0);
	}
}
