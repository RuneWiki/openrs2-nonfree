import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public final class Class67_Sub6 extends Class67 {

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "Lclient!c;")
	private final Class31 aClass31_3;

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "Lclient!cq;")
	private final Class45 aClass45_5;

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Lclient!cg;Lclient!c;)V")
	public Class67_Sub6(@OriginalArg(0) Class37_Sub1 arg0, @OriginalArg(1) Class31 arg1) {
		super(arg0);
		this.aClass31_3 = arg1;
		@Pc(8) opengl local8 = arg0.anOpengl1;
		this.aClass45_5 = new Class45(arg0, 2);
		this.aClass45_5.method947(0);
		this.aClass37_Sub1_27.method759(1);
		if (this.aClass31_3.aBoolean45) {
			local8.glTexGeni(8194, 9472, 9217);
			local8.glEnable(3170);
		}
		local8.glTexGeni(8192, 9472, 9216);
		local8.glTexGeni(8193, 9472, 9216);
		local8.glEnable(3168);
		local8.glEnable(3169);
		this.aClass37_Sub1_27.method759(0);
		this.aClass45_5.method949();
		this.aClass45_5.method947(1);
		this.aClass37_Sub1_27.method759(1);
		if (this.aClass31_3.aBoolean45) {
			local8.glDisable(3170);
		}
		local8.glDisable(3168);
		local8.glDisable(3169);
		this.aClass37_Sub1_27.method759(0);
		this.aClass45_5.method949();
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(Z)V")
	@Override
	public void method4164(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
	@Override
	public void method4167(@OriginalArg(0) int arg0) {
		@Pc(8) float local8 = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
		@Pc(19) float local19 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(27) float local27 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(35) boolean local35 = (arg0 & 0x80) != 0;
		@Pc(39) opengl local39 = this.aClass37_Sub1_27.anOpengl1;
		this.aClass37_Sub1_27.method759(1);
		if (local35) {
			Static199.aFloatArray18[0] = local27;
			Static199.aFloatArray18[1] = 0.0F;
			Static199.aFloatArray18[2] = 0.0F;
			Static199.aFloatArray18[3] = 0.0F;
		} else {
			Static199.aFloatArray18[0] = 0.0F;
			Static199.aFloatArray18[1] = 0.0F;
			Static199.aFloatArray18[2] = local27;
			Static199.aFloatArray18[3] = 0.0F;
		}
		local39.glTexGenfv(8192, 9474, Static199.aFloatArray18, 0);
		Static199.aFloatArray18[0] = 0.0F;
		Static199.aFloatArray18[1] = local27;
		Static199.aFloatArray18[2] = 0.0F;
		Static199.aFloatArray18[3] = (float) this.aClass37_Sub1_27.anInt638 * local8 % 1.0F;
		local39.glTexGenfv(8193, 9474, Static199.aFloatArray18, 0);
		if (this.aClass31_3.aBoolean45) {
			Static199.aFloatArray18[0] = 0.0F;
			Static199.aFloatArray18[1] = 0.0F;
			Static199.aFloatArray18[2] = 0.0F;
			Static199.aFloatArray18[3] = (float) this.aClass37_Sub1_27.anInt638 * local19 % 1.0F;
			local39.glTexGenfv(8194, 9473, Static199.aFloatArray18, 0);
		} else {
			@Pc(127) int local127 = (int) (local19 * (float) this.aClass37_Sub1_27.anInt638 * 16.0F);
			this.aClass37_Sub1_27.method767(this.aClass31_3.aClass81_Sub4Array1[local127 % 16]);
		}
		this.aClass37_Sub1_27.method759(0);
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method4165(@OriginalArg(0) Class81 arg0) {
		this.aClass37_Sub1_27.method767(arg0);
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "()V")
	@Override
	public void method4166() {
		this.aClass45_5.method948('\u0001');
		this.aClass37_Sub1_27.method759(1);
		this.aClass37_Sub1_27.method767(null);
		this.aClass37_Sub1_27.method759(0);
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Z)V")
	@Override
	public void method4163(@OriginalArg(0) boolean arg0) {
		this.aClass45_5.method948('\u0000');
		if (this.aClass31_3.aBoolean45) {
			this.aClass37_Sub1_27.method759(1);
			this.aClass37_Sub1_27.method767(this.aClass31_3.aClass81_Sub3_1);
			this.aClass37_Sub1_27.method759(0);
		}
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "()Z")
	@Override
	public boolean method4168() {
		return true;
	}
}
