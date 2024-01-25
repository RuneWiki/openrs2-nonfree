import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class22_Sub2 extends Class22 {

	@OriginalMember(owner = "client!df", name = "c", descriptor = "Lclient!qf;")
	private final Class163 aClass163_1;

	@OriginalMember(owner = "client!df", name = "b", descriptor = "Lclient!wm;")
	private final Class218 aClass218_2;

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lclient!hj;Lclient!qf;)V")
	public Class22_Sub2(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) Class163 arg1) {
		super(arg0);
		this.aClass163_1 = arg1;
		@Pc(8) opengl local8 = arg0.anOpengl1;
		this.aClass218_2 = new Class218(arg0, 2);
		this.aClass218_2.method5674(0);
		this.aClass2_Sub1_41.method2373(1);
		if (this.aClass163_1.aBoolean408) {
			local8.glTexGeni(8194, 9472, 9217);
			local8.glEnable(3170);
		}
		local8.glTexGeni(8192, 9472, 9216);
		local8.glTexGeni(8193, 9472, 9216);
		local8.glEnable(3168);
		local8.glEnable(3169);
		this.aClass2_Sub1_41.method2373(0);
		this.aClass218_2.method5675();
		this.aClass218_2.method5674(1);
		this.aClass2_Sub1_41.method2373(1);
		if (this.aClass163_1.aBoolean408) {
			local8.glDisable(3170);
		}
		local8.glDisable(3168);
		local8.glDisable(3169);
		this.aClass2_Sub1_41.method2373(0);
		this.aClass218_2.method5675();
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(Z)V")
	@Override
	public void method5716(@OriginalArg(0) boolean arg0) {
		this.aClass218_2.method5676('\u0000');
		if (this.aClass163_1.aBoolean408) {
			this.aClass2_Sub1_41.method2373(1);
			this.aClass2_Sub1_41.method2376(this.aClass163_1.aClass18_Sub4_1);
			this.aClass2_Sub1_41.method2373(0);
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
	@Override
	public void method5714(@OriginalArg(0) int arg0) {
		@Pc(8) float local8 = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
		@Pc(19) float local19 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(27) float local27 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(35) boolean local35 = (arg0 & 0x80) != 0;
		@Pc(39) opengl local39 = this.aClass2_Sub1_41.anOpengl1;
		this.aClass2_Sub1_41.method2373(1);
		if (local35) {
			Static60.aFloatArray14[0] = local27;
			Static60.aFloatArray14[1] = 0.0F;
			Static60.aFloatArray14[2] = 0.0F;
			Static60.aFloatArray14[3] = 0.0F;
		} else {
			Static60.aFloatArray14[0] = 0.0F;
			Static60.aFloatArray14[1] = 0.0F;
			Static60.aFloatArray14[2] = local27;
			Static60.aFloatArray14[3] = 0.0F;
		}
		local39.glTexGenfv(8192, 9474, Static60.aFloatArray14, 0);
		Static60.aFloatArray14[0] = 0.0F;
		Static60.aFloatArray14[1] = local27;
		Static60.aFloatArray14[2] = 0.0F;
		Static60.aFloatArray14[3] = (float) this.aClass2_Sub1_41.anInt2408 * local8 % 1.0F;
		local39.glTexGenfv(8193, 9474, Static60.aFloatArray14, 0);
		if (this.aClass163_1.aBoolean408) {
			Static60.aFloatArray14[0] = 0.0F;
			Static60.aFloatArray14[1] = 0.0F;
			Static60.aFloatArray14[2] = 0.0F;
			Static60.aFloatArray14[3] = (float) this.aClass2_Sub1_41.anInt2408 * local19 % 1.0F;
			local39.glTexGenfv(8194, 9473, Static60.aFloatArray14, 0);
		} else {
			@Pc(127) int local127 = (int) (local19 * (float) this.aClass2_Sub1_41.anInt2408 * 16.0F);
			this.aClass2_Sub1_41.method2376(this.aClass163_1.aClass18_Sub1Array1[local127 % 16]);
		}
		this.aClass2_Sub1_41.method2373(0);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "()V")
	@Override
	public void method5717() {
		this.aClass218_2.method5676('\u0001');
		this.aClass2_Sub1_41.method2373(1);
		this.aClass2_Sub1_41.method2376(null);
		this.aClass2_Sub1_41.method2373(0);
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "()Z")
	@Override
	public boolean method5719() {
		return true;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Z)V")
	@Override
	public void method5715(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!nj;)V")
	@Override
	public void method5718(@OriginalArg(0) Class18 arg0) {
		this.aClass2_Sub1_41.method2376(arg0);
	}
}
