import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class2_Sub4 extends Class2 {

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "Lclient!le;")
	private final Class120 aClass120_1;

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "Lclient!hd;")
	private final Class78 aClass78_3;

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Lclient!ks;Lclient!le;)V")
	public Class2_Sub4(@OriginalArg(0) Class63_Sub1 arg0, @OriginalArg(1) Class120 arg1) {
		super(arg0);
		this.aClass120_1 = arg1;
		@Pc(8) opengl local8 = arg0.anOpengl1;
		this.aClass78_3 = new Class78(arg0, 2);
		this.aClass78_3.method2431(0);
		this.aClass63_Sub1_30.method3345(1);
		if (this.aClass120_1.aBoolean276) {
			local8.glTexGeni(8194, 9472, 9217);
			local8.glEnable(3170);
		}
		local8.glTexGeni(8192, 9472, 9216);
		local8.glTexGeni(8193, 9472, 9216);
		local8.glEnable(3168);
		local8.glEnable(3169);
		this.aClass63_Sub1_30.method3345(0);
		this.aClass78_3.method2432();
		this.aClass78_3.method2431(1);
		this.aClass63_Sub1_30.method3345(1);
		if (this.aClass120_1.aBoolean276) {
			local8.glDisable(3170);
		}
		local8.glDisable(3168);
		local8.glDisable(3169);
		this.aClass63_Sub1_30.method3345(0);
		this.aClass78_3.method2432();
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
	@Override
	public void method3766(@OriginalArg(0) int arg0) {
		@Pc(8) float local8 = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
		@Pc(19) float local19 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(27) float local27 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(35) boolean local35 = (arg0 & 0x80) != 0;
		@Pc(39) opengl local39 = this.aClass63_Sub1_30.anOpengl1;
		this.aClass63_Sub1_30.method3345(1);
		if (local35) {
			Static114.aFloatArray12[0] = local27;
			Static114.aFloatArray12[1] = 0.0F;
			Static114.aFloatArray12[2] = 0.0F;
			Static114.aFloatArray12[3] = 0.0F;
		} else {
			Static114.aFloatArray12[0] = 0.0F;
			Static114.aFloatArray12[1] = 0.0F;
			Static114.aFloatArray12[2] = local27;
			Static114.aFloatArray12[3] = 0.0F;
		}
		local39.glTexGenfv(8192, 9474, Static114.aFloatArray12, 0);
		Static114.aFloatArray12[0] = 0.0F;
		Static114.aFloatArray12[1] = local27;
		Static114.aFloatArray12[2] = 0.0F;
		Static114.aFloatArray12[3] = (float) this.aClass63_Sub1_30.anInt3603 * local8 % 1.0F;
		local39.glTexGenfv(8193, 9474, Static114.aFloatArray12, 0);
		if (this.aClass120_1.aBoolean276) {
			Static114.aFloatArray12[0] = 0.0F;
			Static114.aFloatArray12[1] = 0.0F;
			Static114.aFloatArray12[2] = 0.0F;
			Static114.aFloatArray12[3] = (float) this.aClass63_Sub1_30.anInt3603 * local19 % 1.0F;
			local39.glTexGenfv(8194, 9473, Static114.aFloatArray12, 0);
		} else {
			@Pc(127) int local127 = (int) (local19 * (float) this.aClass63_Sub1_30.anInt3603 * 16.0F);
			this.aClass63_Sub1_30.method3355(this.aClass120_1.aClass19_Sub3Array2[local127 % 16]);
		}
		this.aClass63_Sub1_30.method3345(0);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!vo;)V")
	@Override
	public void method3769(@OriginalArg(0) Class19 arg0) {
		this.aClass63_Sub1_30.method3355(arg0);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z)V")
	@Override
	public void method3765(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "()Z")
	@Override
	public boolean method3768() {
		return true;
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(Z)V")
	@Override
	public void method3767(@OriginalArg(0) boolean arg0) {
		this.aClass78_3.method2433('\u0000');
		if (this.aClass120_1.aBoolean276) {
			this.aClass63_Sub1_30.method3345(1);
			this.aClass63_Sub1_30.method3355(this.aClass120_1.aClass19_Sub1_2);
			this.aClass63_Sub1_30.method3345(0);
		}
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "()V")
	@Override
	public void method3770() {
		this.aClass78_3.method2433('\u0001');
		this.aClass63_Sub1_30.method3345(1);
		this.aClass63_Sub1_30.method3355(null);
		this.aClass63_Sub1_30.method3345(0);
	}
}
