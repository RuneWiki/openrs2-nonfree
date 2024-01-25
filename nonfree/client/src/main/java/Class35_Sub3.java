import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dq")
public final class Class35_Sub3 extends Class35 {

	@OriginalMember(owner = "client!dq", name = "d", descriptor = "Lclient!im;")
	private final Class91 aClass91_1;

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "Lclient!eq;")
	private final Class57 aClass57_2;

	@OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(Lclient!ao;Lclient!im;)V")
	public Class35_Sub3(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(1) Class91 arg1) {
		super(arg0);
		this.aClass91_1 = arg1;
		@Pc(8) opengl local8 = arg0.anOpengl1;
		this.aClass57_2 = new Class57(arg0, 2);
		this.aClass57_2.method1811(0);
		this.aClass4_Sub1_35.method600(1);
		if (this.aClass91_1.aBoolean249) {
			local8.glTexGeni(8194, 9472, 9217);
			local8.glEnable(3170);
		}
		local8.glTexGeni(8192, 9472, 9216);
		local8.glTexGeni(8193, 9472, 9216);
		local8.glEnable(3168);
		local8.glEnable(3169);
		this.aClass4_Sub1_35.method600(0);
		this.aClass57_2.method1810();
		this.aClass57_2.method1811(1);
		this.aClass4_Sub1_35.method600(1);
		if (this.aClass91_1.aBoolean249) {
			local8.glDisable(3170);
		}
		local8.glDisable(3168);
		local8.glDisable(3169);
		this.aClass4_Sub1_35.method600(0);
		this.aClass57_2.method1810();
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)V")
	@Override
	public void method5198(@OriginalArg(0) int arg0) {
		@Pc(8) float local8 = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
		@Pc(19) float local19 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(27) float local27 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(35) boolean local35 = (arg0 & 0x80) != 0;
		@Pc(39) opengl local39 = this.aClass4_Sub1_35.anOpengl1;
		this.aClass4_Sub1_35.method600(1);
		if (local35) {
			Static62.aFloatArray10[0] = local27;
			Static62.aFloatArray10[1] = 0.0F;
			Static62.aFloatArray10[2] = 0.0F;
			Static62.aFloatArray10[3] = 0.0F;
		} else {
			Static62.aFloatArray10[0] = 0.0F;
			Static62.aFloatArray10[1] = 0.0F;
			Static62.aFloatArray10[2] = local27;
			Static62.aFloatArray10[3] = 0.0F;
		}
		local39.glTexGenfv(8192, 9474, Static62.aFloatArray10, 0);
		Static62.aFloatArray10[0] = 0.0F;
		Static62.aFloatArray10[1] = local27;
		Static62.aFloatArray10[2] = 0.0F;
		Static62.aFloatArray10[3] = (float) this.aClass4_Sub1_35.anInt319 * local8 % 1.0F;
		local39.glTexGenfv(8193, 9474, Static62.aFloatArray10, 0);
		if (this.aClass91_1.aBoolean249) {
			Static62.aFloatArray10[0] = 0.0F;
			Static62.aFloatArray10[1] = 0.0F;
			Static62.aFloatArray10[2] = 0.0F;
			Static62.aFloatArray10[3] = (float) this.aClass4_Sub1_35.anInt319 * local19 % 1.0F;
			local39.glTexGenfv(8194, 9473, Static62.aFloatArray10, 0);
		} else {
			@Pc(127) int local127 = (int) (local19 * (float) this.aClass4_Sub1_35.anInt319 * 16.0F);
			this.aClass4_Sub1_35.method602(this.aClass91_1.aClass124_Sub2Array3[local127 % 16]);
		}
		this.aClass4_Sub1_35.method600(0);
	}

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "()Z")
	@Override
	public boolean method5199() {
		return true;
	}

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "(Z)V")
	@Override
	public void method5200(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Z)V")
	@Override
	public void method5195(@OriginalArg(0) boolean arg0) {
		this.aClass57_2.method1809('\u0000');
		if (this.aClass91_1.aBoolean249) {
			this.aClass4_Sub1_35.method600(1);
			this.aClass4_Sub1_35.method602(this.aClass91_1.aClass124_Sub1_1);
			this.aClass4_Sub1_35.method600(0);
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lclient!lp;)V")
	@Override
	public void method5196(@OriginalArg(0) Class124 arg0) {
		this.aClass4_Sub1_35.method602(arg0);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "()V")
	@Override
	public void method5197() {
		this.aClass57_2.method1809('\u0001');
		this.aClass4_Sub1_35.method600(1);
		this.aClass4_Sub1_35.method602(null);
		this.aClass4_Sub1_35.method600(0);
	}
}
