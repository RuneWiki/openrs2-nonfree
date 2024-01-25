import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fba")
public final class Class35_Sub3 extends Class35 {

	@OriginalMember(owner = "client!fba", name = "l", descriptor = "Lclient!wq;")
	private final Class319 aClass319_4;

	@OriginalMember(owner = "client!fba", name = "s", descriptor = "Lclient!wl;")
	private final Class318 aClass318_2;

	@OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(Lclient!te;Lclient!wq;)V")
	public Class35_Sub3(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) Class319 arg1) {
		super(arg0);
		this.aClass319_4 = arg1;
		this.aClass318_2 = new Class318(arg0, 2);
		this.aClass318_2.method7880(0);
		super.aClass9_Sub3_41.method6660(1);
		if (this.aClass319_4.aBoolean653) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass9_Sub3_41.method6660(0);
		this.aClass318_2.method7881();
		this.aClass318_2.method7880(1);
		super.aClass9_Sub3_41.method6660(1);
		if (this.aClass319_4.aBoolean653) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass9_Sub3_41.method6660(0);
		this.aClass318_2.method7881();
	}

	@OriginalMember(owner = "client!fba", name = "c", descriptor = "(I)V")
	@Override
	public void method7418() {
		this.aClass318_2.method7877('\u0001');
		super.aClass9_Sub3_41.method6660(1);
		super.aClass9_Sub3_41.method6701(null);
		super.aClass9_Sub3_41.method6660(0);
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(III)V")
	@Override
	public void method7419(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) float local14 = -5.0E-4F * (float) ((arg1 & 0x3) + 1);
		@Pc(25) float local25 = (float) ((arg1 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(33) float local33 = (arg1 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(44) boolean local44 = (arg1 & 0x80) != 0;
		super.aClass9_Sub3_41.method6660(1);
		if (local44) {
			Static78.aFloatArray26[2] = 0.0F;
			Static78.aFloatArray26[3] = 0.0F;
			Static78.aFloatArray26[0] = local33;
			Static78.aFloatArray26[1] = 0.0F;
		} else {
			Static78.aFloatArray26[1] = 0.0F;
			Static78.aFloatArray26[3] = 0.0F;
			Static78.aFloatArray26[2] = local33;
			Static78.aFloatArray26[0] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, Static78.aFloatArray26, 0);
		Static78.aFloatArray26[3] = local14 * (float) super.aClass9_Sub3_41.anInt7876 % 1.0F;
		Static78.aFloatArray26[2] = 0.0F;
		Static78.aFloatArray26[0] = 0.0F;
		Static78.aFloatArray26[1] = local33;
		OpenGL.glTexGenfv(8193, 9474, Static78.aFloatArray26, 0);
		if (this.aClass319_4.aBoolean653) {
			Static78.aFloatArray26[3] = local25 * (float) super.aClass9_Sub3_41.anInt7876 % 1.0F;
			Static78.aFloatArray26[2] = 0.0F;
			Static78.aFloatArray26[1] = 0.0F;
			Static78.aFloatArray26[0] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static78.aFloatArray26, 0);
		} else {
			@Pc(162) int local162 = (int) ((float) super.aClass9_Sub3_41.anInt7876 * local25 * 16.0F);
			super.aClass9_Sub3_41.method6701(this.aClass319_4.aClass20_Sub3Array3[local162 % 16]);
		}
		super.aClass9_Sub3_41.method6660(0);
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7417(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(IILclient!jl;)V")
	@Override
	public void method7420(@OriginalArg(1) int arg0, @OriginalArg(2) Class20 arg1) {
		super.aClass9_Sub3_41.method6701(arg1);
		super.aClass9_Sub3_41.method6670(arg0);
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7416(@OriginalArg(0) boolean arg0) {
		this.aClass318_2.method7877('\u0000');
		if (this.aClass319_4.aBoolean653) {
			super.aClass9_Sub3_41.method6660(1);
			super.aClass9_Sub3_41.method6701(this.aClass319_4.aClass20_Sub1_1);
			super.aClass9_Sub3_41.method6660(0);
		}
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7414() {
		return true;
	}
}
