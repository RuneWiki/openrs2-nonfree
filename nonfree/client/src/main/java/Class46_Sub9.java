import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uu")
public final class Class46_Sub9 extends Class46 {

	@OriginalMember(owner = "client!uu", name = "k", descriptor = "Lclient!ud;")
	private final Class335 aClass335_6;

	@OriginalMember(owner = "client!uu", name = "i", descriptor = "Lclient!eaa;")
	private final Class79 aClass79_6;

	@OriginalMember(owner = "client!uu", name = "<init>", descriptor = "(Lclient!vj;Lclient!ud;)V")
	public Class46_Sub9(@OriginalArg(0) Class45_Sub3 arg0, @OriginalArg(1) Class335 arg1) {
		super(arg0);
		this.aClass335_6 = arg1;
		this.aClass79_6 = new Class79(arg0, 2);
		this.aClass79_6.method1921(0);
		super.aClass45_Sub3_40.method7510(1);
		if (this.aClass335_6.aBoolean649) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass45_Sub3_40.method7510(0);
		this.aClass79_6.method1925();
		this.aClass79_6.method1921(1);
		super.aClass45_Sub3_40.method7510(1);
		if (this.aClass335_6.aBoolean649) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass45_Sub3_40.method7510(0);
		this.aClass79_6.method1925();
	}

	@OriginalMember(owner = "client!uu", name = "c", descriptor = "(I)V")
	@Override
	public void method7205() {
		this.aClass79_6.method1924('\u0001');
		super.aClass45_Sub3_40.method7510(1);
		super.aClass45_Sub3_40.method7475(null);
		super.aClass45_Sub3_40.method7510(0);
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7206(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(III)V")
	@Override
	public void method7202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) float local14 = -5.0E-4F * (float) ((arg1 & 0x3) + 1);
		@Pc(25) float local25 = (float) ((arg1 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(36) float local36 = (arg1 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		super.aClass45_Sub3_40.method7510(1);
		@Pc(49) boolean local49 = (arg1 & 0x80) != 0;
		if (local49) {
			Static62.aFloatArray10[1] = 0.0F;
			Static62.aFloatArray10[3] = 0.0F;
			Static62.aFloatArray10[2] = 0.0F;
			Static62.aFloatArray10[0] = local36;
		} else {
			Static62.aFloatArray10[3] = 0.0F;
			Static62.aFloatArray10[0] = 0.0F;
			Static62.aFloatArray10[1] = 0.0F;
			Static62.aFloatArray10[2] = local36;
		}
		OpenGL.glTexGenfv(8192, 9474, Static62.aFloatArray10, 0);
		Static62.aFloatArray10[3] = local14 * (float) super.aClass45_Sub3_40.anInt9042 % 1.0F;
		Static62.aFloatArray10[0] = 0.0F;
		Static62.aFloatArray10[1] = local36;
		Static62.aFloatArray10[2] = 0.0F;
		OpenGL.glTexGenfv(8193, 9474, Static62.aFloatArray10, 0);
		if (this.aClass335_6.aBoolean649) {
			Static62.aFloatArray10[3] = local25 * (float) super.aClass45_Sub3_40.anInt9042 % 1.0F;
			Static62.aFloatArray10[2] = 0.0F;
			Static62.aFloatArray10[0] = 0.0F;
			Static62.aFloatArray10[1] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static62.aFloatArray10, 0);
		} else {
			@Pc(170) int local170 = (int) (local25 * 16.0F * (float) super.aClass45_Sub3_40.anInt9042);
			super.aClass45_Sub3_40.method7475(this.aClass335_6.aClass24_Sub1Array4[local170 % 16]);
		}
		super.aClass45_Sub3_40.method7510(0);
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7200(@OriginalArg(1) boolean arg0) {
		this.aClass79_6.method1924('\u0000');
		if (this.aClass335_6.aBoolean649) {
			super.aClass45_Sub3_40.method7510(1);
			super.aClass45_Sub3_40.method7475(this.aClass335_6.aClass24_Sub2_3);
			super.aClass45_Sub3_40.method7510(0);
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(IILclient!av;)V")
	@Override
	public void method7208(@OriginalArg(1) int arg0, @OriginalArg(2) Class24 arg1) {
		super.aClass45_Sub3_40.method7475(arg1);
		super.aClass45_Sub3_40.method7500(arg0);
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7207() {
		return true;
	}
}
