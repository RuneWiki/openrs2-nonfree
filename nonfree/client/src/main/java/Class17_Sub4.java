import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class17_Sub4 extends Class17 {

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "Lclient!bk;")
	private final Class23 aClass23_3;

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "Lclient!km;")
	private final Class119 aClass119_3;

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Lclient!sq;Lclient!bk;)V")
	public Class17_Sub4(@OriginalArg(0) Class46_Sub2 arg0, @OriginalArg(1) Class23 arg1) {
		super(arg0);
		this.aClass23_3 = arg1;
		@Pc(8) opengl local8 = arg0.anOpengl1;
		this.aClass119_3 = new Class119(arg0, 2);
		this.aClass119_3.method3303(0);
		this.aClass46_Sub2_37.method5225(1);
		if (this.aClass23_3.aBoolean28) {
			local8.glTexGeni(8194, 9472, 9217);
			local8.glEnable(3170);
		}
		local8.glTexGeni(8192, 9472, 9216);
		local8.glTexGeni(8193, 9472, 9216);
		local8.glEnable(3168);
		local8.glEnable(3169);
		this.aClass46_Sub2_37.method5225(0);
		this.aClass119_3.method3302();
		this.aClass119_3.method3303(1);
		this.aClass46_Sub2_37.method5225(1);
		if (this.aClass23_3.aBoolean28) {
			local8.glDisable(3170);
		}
		local8.glDisable(3168);
		local8.glDisable(3169);
		this.aClass46_Sub2_37.method5225(0);
		this.aClass119_3.method3302();
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)V")
	@Override
	public void method5297(@OriginalArg(0) boolean arg0) {
		this.aClass119_3.method3301('\u0000');
		if (this.aClass23_3.aBoolean28) {
			this.aClass46_Sub2_37.method5225(1);
			this.aClass46_Sub2_37.method5251(this.aClass23_3.aClass8_Sub2_1);
			this.aClass46_Sub2_37.method5225(0);
		}
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "()V")
	@Override
	public void method5299() {
		this.aClass119_3.method3301('\u0001');
		this.aClass46_Sub2_37.method5225(1);
		this.aClass46_Sub2_37.method5251(null);
		this.aClass46_Sub2_37.method5225(0);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "()Z")
	@Override
	public boolean method5298() {
		return true;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!od;)V")
	@Override
	public void method5302(@OriginalArg(0) Class8 arg0) {
		this.aClass46_Sub2_37.method5251(arg0);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
	@Override
	public void method5300(@OriginalArg(0) int arg0) {
		@Pc(8) float local8 = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
		@Pc(19) float local19 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(27) float local27 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(35) boolean local35 = (arg0 & 0x80) != 0;
		@Pc(39) opengl local39 = this.aClass46_Sub2_37.anOpengl1;
		this.aClass46_Sub2_37.method5225(1);
		if (local35) {
			Static226.aFloatArray12[0] = local27;
			Static226.aFloatArray12[1] = 0.0F;
			Static226.aFloatArray12[2] = 0.0F;
			Static226.aFloatArray12[3] = 0.0F;
		} else {
			Static226.aFloatArray12[0] = 0.0F;
			Static226.aFloatArray12[1] = 0.0F;
			Static226.aFloatArray12[2] = local27;
			Static226.aFloatArray12[3] = 0.0F;
		}
		local39.glTexGenfv(8192, 9474, Static226.aFloatArray12, 0);
		Static226.aFloatArray12[0] = 0.0F;
		Static226.aFloatArray12[1] = local27;
		Static226.aFloatArray12[2] = 0.0F;
		Static226.aFloatArray12[3] = (float) this.aClass46_Sub2_37.anInt5738 * local8 % 1.0F;
		local39.glTexGenfv(8193, 9474, Static226.aFloatArray12, 0);
		if (this.aClass23_3.aBoolean28) {
			Static226.aFloatArray12[0] = 0.0F;
			Static226.aFloatArray12[1] = 0.0F;
			Static226.aFloatArray12[2] = 0.0F;
			Static226.aFloatArray12[3] = (float) this.aClass46_Sub2_37.anInt5738 * local19 % 1.0F;
			local39.glTexGenfv(8194, 9473, Static226.aFloatArray12, 0);
		} else {
			@Pc(127) int local127 = (int) (local19 * (float) this.aClass46_Sub2_37.anInt5738 * 16.0F);
			this.aClass46_Sub2_37.method5251(this.aClass23_3.aClass8_Sub1Array2[local127 % 16]);
		}
		this.aClass46_Sub2_37.method5225(0);
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(Z)V")
	@Override
	public void method5301(@OriginalArg(0) boolean arg0) {
	}
}
