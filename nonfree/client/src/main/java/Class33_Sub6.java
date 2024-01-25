import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qm")
public final class Class33_Sub6 extends Class33 {

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "Lclient!gk;")
	private final Class78 aClass78_3;

	@OriginalMember(owner = "client!qm", name = "d", descriptor = "Lclient!hi;")
	private final Class86 aClass86_5;

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Lclient!mm;Lclient!gk;)V")
	public Class33_Sub6(@OriginalArg(0) Class55_Sub1 arg0, @OriginalArg(1) Class78 arg1) {
		super(arg0);
		this.aClass78_3 = arg1;
		@Pc(8) opengl local8 = arg0.anOpengl1;
		this.aClass86_5 = new Class86(arg0, 2);
		this.aClass86_5.method2104(0);
		this.aClass55_Sub1_42.method3693(1);
		if (this.aClass78_3.aBoolean145) {
			local8.glTexGeni(8194, 9472, 9217);
			local8.glEnable(3170);
		}
		local8.glTexGeni(8192, 9472, 9216);
		local8.glTexGeni(8193, 9472, 9216);
		local8.glEnable(3168);
		local8.glEnable(3169);
		this.aClass55_Sub1_42.method3693(0);
		this.aClass86_5.method2105();
		this.aClass86_5.method2104(1);
		this.aClass55_Sub1_42.method3693(1);
		if (this.aClass78_3.aBoolean145) {
			local8.glDisable(3170);
		}
		local8.glDisable(3168);
		local8.glDisable(3169);
		this.aClass55_Sub1_42.method3693(0);
		this.aClass86_5.method2105();
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "()Z")
	@Override
	public boolean method6041() {
		return true;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)V")
	@Override
	public void method6044(@OriginalArg(0) int arg0) {
		@Pc(8) float local8 = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
		@Pc(19) float local19 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(27) float local27 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(35) boolean local35 = (arg0 & 0x80) != 0;
		@Pc(39) opengl local39 = this.aClass55_Sub1_42.anOpengl1;
		this.aClass55_Sub1_42.method3693(1);
		if (local35) {
			Static265.aFloatArray18[0] = local27;
			Static265.aFloatArray18[1] = 0.0F;
			Static265.aFloatArray18[2] = 0.0F;
			Static265.aFloatArray18[3] = 0.0F;
		} else {
			Static265.aFloatArray18[0] = 0.0F;
			Static265.aFloatArray18[1] = 0.0F;
			Static265.aFloatArray18[2] = local27;
			Static265.aFloatArray18[3] = 0.0F;
		}
		local39.glTexGenfv(8192, 9474, Static265.aFloatArray18, 0);
		Static265.aFloatArray18[0] = 0.0F;
		Static265.aFloatArray18[1] = local27;
		Static265.aFloatArray18[2] = 0.0F;
		Static265.aFloatArray18[3] = (float) this.aClass55_Sub1_42.anInt3999 * local8 % 1.0F;
		local39.glTexGenfv(8193, 9474, Static265.aFloatArray18, 0);
		if (this.aClass78_3.aBoolean145) {
			Static265.aFloatArray18[0] = 0.0F;
			Static265.aFloatArray18[1] = 0.0F;
			Static265.aFloatArray18[2] = 0.0F;
			Static265.aFloatArray18[3] = (float) this.aClass55_Sub1_42.anInt3999 * local19 % 1.0F;
			local39.glTexGenfv(8194, 9473, Static265.aFloatArray18, 0);
		} else {
			@Pc(127) int local127 = (int) (local19 * (float) this.aClass55_Sub1_42.anInt3999 * 16.0F);
			this.aClass55_Sub1_42.method3677(this.aClass78_3.aClass60_Sub4Array3[local127 % 16]);
		}
		this.aClass55_Sub1_42.method3693(0);
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(Z)V")
	@Override
	public void method6046(@OriginalArg(0) boolean arg0) {
		this.aClass86_5.method2106('\u0000');
		if (this.aClass78_3.aBoolean145) {
			this.aClass55_Sub1_42.method3693(1);
			this.aClass55_Sub1_42.method3677(this.aClass78_3.aClass60_Sub3_2);
			this.aClass55_Sub1_42.method3693(0);
		}
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "()V")
	@Override
	public void method6043() {
		this.aClass86_5.method2106('\u0001');
		this.aClass55_Sub1_42.method3693(1);
		this.aClass55_Sub1_42.method3677(null);
		this.aClass55_Sub1_42.method3693(0);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Z)V")
	@Override
	public void method6042(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!t;)V")
	@Override
	public void method6045(@OriginalArg(0) Class60 arg0) {
		this.aClass55_Sub1_42.method3677(arg0);
	}
}
