import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rj")
public final class Class30_Sub6 extends Class30 {

	@OriginalMember(owner = "client!rj", name = "d", descriptor = "Lclient!vq;")
	private final Class239 aClass239_3;

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "Lclient!p;")
	private final Class178 aClass178_4;

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Lclient!nm;Lclient!vq;)V")
	public Class30_Sub6(@OriginalArg(0) Class164_Sub1 arg0, @OriginalArg(1) Class239 arg1) {
		super(arg0);
		this.aClass239_3 = arg1;
		@Pc(8) opengl local8 = arg0.anOpengl1;
		this.aClass178_4 = new Class178(arg0, 2);
		this.aClass178_4.method4028(0);
		this.aClass164_Sub1_39.method3584(1);
		if (this.aClass239_3.aBoolean563) {
			local8.glTexGeni(8194, 9472, 9217);
			local8.glEnable(3170);
		}
		local8.glTexGeni(8192, 9472, 9216);
		local8.glTexGeni(8193, 9472, 9216);
		local8.glEnable(3168);
		local8.glEnable(3169);
		this.aClass164_Sub1_39.method3584(0);
		this.aClass178_4.method4030();
		this.aClass178_4.method4028(1);
		this.aClass164_Sub1_39.method3584(1);
		if (this.aClass239_3.aBoolean563) {
			local8.glDisable(3170);
		}
		local8.glDisable(3168);
		local8.glDisable(3169);
		this.aClass164_Sub1_39.method3584(0);
		this.aClass178_4.method4030();
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!ap;)V")
	@Override
	public void method4847(@OriginalArg(0) Class15 arg0) {
		this.aClass164_Sub1_39.method3603(arg0);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V")
	@Override
	public void method4845(@OriginalArg(0) int arg0) {
		@Pc(8) float local8 = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
		@Pc(19) float local19 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(27) float local27 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(35) boolean local35 = (arg0 & 0x80) != 0;
		@Pc(39) opengl local39 = this.aClass164_Sub1_39.anOpengl1;
		this.aClass164_Sub1_39.method3584(1);
		if (local35) {
			Static304.aFloatArray28[0] = local27;
			Static304.aFloatArray28[1] = 0.0F;
			Static304.aFloatArray28[2] = 0.0F;
			Static304.aFloatArray28[3] = 0.0F;
		} else {
			Static304.aFloatArray28[0] = 0.0F;
			Static304.aFloatArray28[1] = 0.0F;
			Static304.aFloatArray28[2] = local27;
			Static304.aFloatArray28[3] = 0.0F;
		}
		local39.glTexGenfv(8192, 9474, Static304.aFloatArray28, 0);
		Static304.aFloatArray28[0] = 0.0F;
		Static304.aFloatArray28[1] = local27;
		Static304.aFloatArray28[2] = 0.0F;
		Static304.aFloatArray28[3] = (float) this.aClass164_Sub1_39.anInt4059 * local8 % 1.0F;
		local39.glTexGenfv(8193, 9474, Static304.aFloatArray28, 0);
		if (this.aClass239_3.aBoolean563) {
			Static304.aFloatArray28[0] = 0.0F;
			Static304.aFloatArray28[1] = 0.0F;
			Static304.aFloatArray28[2] = 0.0F;
			Static304.aFloatArray28[3] = (float) this.aClass164_Sub1_39.anInt4059 * local19 % 1.0F;
			local39.glTexGenfv(8194, 9473, Static304.aFloatArray28, 0);
		} else {
			@Pc(127) int local127 = (int) (local19 * (float) this.aClass164_Sub1_39.anInt4059 * 16.0F);
			this.aClass164_Sub1_39.method3603(this.aClass239_3.aClass15_Sub2Array3[local127 % 16]);
		}
		this.aClass164_Sub1_39.method3584(0);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Z)V")
	@Override
	public void method4844(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(Z)V")
	@Override
	public void method4846(@OriginalArg(0) boolean arg0) {
		this.aClass178_4.method4029('\u0000');
		if (this.aClass239_3.aBoolean563) {
			this.aClass164_Sub1_39.method3584(1);
			this.aClass164_Sub1_39.method3603(this.aClass239_3.aClass15_Sub3_1);
			this.aClass164_Sub1_39.method3584(0);
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "()V")
	@Override
	public void method4842() {
		this.aClass178_4.method4029('\u0001');
		this.aClass164_Sub1_39.method3584(1);
		this.aClass164_Sub1_39.method3603(null);
		this.aClass164_Sub1_39.method3584(0);
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "()Z")
	@Override
	public boolean method4843() {
		return true;
	}
}
