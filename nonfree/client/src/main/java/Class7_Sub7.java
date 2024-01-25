import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class Class7_Sub7 extends Class7 {

	@OriginalMember(owner = "client!w", name = "b", descriptor = "Lclient!s;")
	private final Class213 aClass213_4;

	@OriginalMember(owner = "client!w", name = "d", descriptor = "Lclient!jb;")
	private final Class115 aClass115_6;

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lclient!fu;Lclient!s;)V")
	public Class7_Sub7(@OriginalArg(0) Class63_Sub2 arg0, @OriginalArg(1) Class213 arg1) {
		super(arg0);
		this.aClass213_4 = arg1;
		@Pc(8) opengl local8 = arg0.anOpengl2;
		this.aClass115_6 = new Class115(arg0, 2);
		this.aClass115_6.method2846(0);
		this.aClass63_Sub2_41.method2115(1);
		if (this.aClass213_4.aBoolean387) {
			local8.glTexGeni(8194, 9472, 9217);
			local8.glEnable(3170);
		}
		local8.glTexGeni(8192, 9472, 9216);
		local8.glTexGeni(8193, 9472, 9216);
		local8.glEnable(3168);
		local8.glEnable(3169);
		this.aClass63_Sub2_41.method2115(0);
		this.aClass115_6.method2848();
		this.aClass115_6.method2846(1);
		this.aClass63_Sub2_41.method2115(1);
		if (this.aClass213_4.aBoolean387) {
			local8.glDisable(3170);
		}
		local8.glDisable(3168);
		local8.glDisable(3169);
		this.aClass63_Sub2_41.method2115(0);
		this.aClass115_6.method2848();
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
	@Override
	public void method5474(@OriginalArg(0) int arg0) {
		@Pc(8) float local8 = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
		@Pc(19) float local19 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(27) float local27 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(35) boolean local35 = (arg0 & 0x80) != 0;
		@Pc(39) opengl local39 = this.aClass63_Sub2_41.anOpengl2;
		this.aClass63_Sub2_41.method2115(1);
		if (local35) {
			Static375.aFloatArray30[0] = local27;
			Static375.aFloatArray30[1] = 0.0F;
			Static375.aFloatArray30[2] = 0.0F;
			Static375.aFloatArray30[3] = 0.0F;
		} else {
			Static375.aFloatArray30[0] = 0.0F;
			Static375.aFloatArray30[1] = 0.0F;
			Static375.aFloatArray30[2] = local27;
			Static375.aFloatArray30[3] = 0.0F;
		}
		local39.glTexGenfv(8192, 9474, Static375.aFloatArray30, 0);
		Static375.aFloatArray30[0] = 0.0F;
		Static375.aFloatArray30[1] = local27;
		Static375.aFloatArray30[2] = 0.0F;
		Static375.aFloatArray30[3] = (float) this.aClass63_Sub2_41.anInt2088 * local8 % 1.0F;
		local39.glTexGenfv(8193, 9474, Static375.aFloatArray30, 0);
		if (this.aClass213_4.aBoolean387) {
			Static375.aFloatArray30[0] = 0.0F;
			Static375.aFloatArray30[1] = 0.0F;
			Static375.aFloatArray30[2] = 0.0F;
			Static375.aFloatArray30[3] = (float) this.aClass63_Sub2_41.anInt2088 * local19 % 1.0F;
			local39.glTexGenfv(8194, 9473, Static375.aFloatArray30, 0);
		} else {
			@Pc(127) int local127 = (int) (local19 * (float) this.aClass63_Sub2_41.anInt2088 * 16.0F);
			this.aClass63_Sub2_41.method2068(this.aClass213_4.aClass20_Sub4Array3[local127 % 16]);
		}
		this.aClass63_Sub2_41.method2115(0);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!tp;)V")
	@Override
	public void method5475(@OriginalArg(0) Class20 arg0) {
		this.aClass63_Sub2_41.method2068(arg0);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "()V")
	@Override
	public void method5472() {
		this.aClass115_6.method2847('\u0001');
		this.aClass63_Sub2_41.method2115(1);
		this.aClass63_Sub2_41.method2068(null);
		this.aClass63_Sub2_41.method2115(0);
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "()Z")
	@Override
	public boolean method5473() {
		return true;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)V")
	@Override
	public void method5471(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(Z)V")
	@Override
	public void method5476(@OriginalArg(0) boolean arg0) {
		this.aClass115_6.method2847('\u0000');
		if (this.aClass213_4.aBoolean387) {
			this.aClass63_Sub2_41.method2115(1);
			this.aClass63_Sub2_41.method2068(this.aClass213_4.aClass20_Sub3_2);
			this.aClass63_Sub2_41.method2115(0);
		}
	}
}
