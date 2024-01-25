import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!paa")
public final class Class231_Sub2 extends Class231 {

	@OriginalMember(owner = "client!paa", name = "n", descriptor = "Lclient!wo;")
	private final Class391 aClass391_2;

	@OriginalMember(owner = "client!paa", name = "f", descriptor = "Lclient!nc;")
	private final Class243 aClass243_3;

	@OriginalMember(owner = "client!paa", name = "<init>", descriptor = "(Lclient!ck;Lclient!wo;)V")
	public Class231_Sub2(@OriginalArg(0) Class65_Sub1 arg0, @OriginalArg(1) Class391 arg1) {
		super(arg0);
		this.aClass391_2 = arg1;
		this.aClass243_3 = new Class243(arg0, 2);
		this.aClass243_3.method5742(0);
		super.aClass65_Sub1_41.method1256(1);
		if (this.aClass391_2.aBoolean911) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass65_Sub1_41.method1256(0);
		this.aClass243_3.method5741();
		this.aClass243_3.method5742(1);
		super.aClass65_Sub1_41.method1256(1);
		if (this.aClass391_2.aBoolean911) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass65_Sub1_41.method1256(0);
		this.aClass243_3.method5741();
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(III)V")
	@Override
	public void method8715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) float local14 = (float) ((arg1 & 0x3) + 1) * -5.0E-4F;
		@Pc(25) float local25 = (float) ((arg1 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(33) float local33 = (arg1 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(41) boolean local41 = (arg1 & 0x80) != 0;
		super.aClass65_Sub1_41.method1256(1);
		if (local41) {
			Static534.aFloatArray88[1] = 0.0F;
			Static534.aFloatArray88[3] = 0.0F;
			Static534.aFloatArray88[2] = 0.0F;
			Static534.aFloatArray88[0] = local33;
		} else {
			Static534.aFloatArray88[3] = 0.0F;
			Static534.aFloatArray88[1] = 0.0F;
			Static534.aFloatArray88[2] = local33;
			Static534.aFloatArray88[0] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, Static534.aFloatArray88, 0);
		Static534.aFloatArray88[2] = 0.0F;
		Static534.aFloatArray88[3] = local14 * (float) super.aClass65_Sub1_41.anInt1383 % 1.0F;
		Static534.aFloatArray88[1] = local33;
		Static534.aFloatArray88[0] = 0.0F;
		OpenGL.glTexGenfv(8193, 9474, Static534.aFloatArray88, 0);
		if (this.aClass391_2.aBoolean911) {
			Static534.aFloatArray88[3] = local25 * (float) super.aClass65_Sub1_41.anInt1383 % 1.0F;
			Static534.aFloatArray88[0] = 0.0F;
			Static534.aFloatArray88[2] = 0.0F;
			Static534.aFloatArray88[1] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static534.aFloatArray88, 0);
		} else {
			@Pc(159) int local159 = (int) ((float) super.aClass65_Sub1_41.anInt1383 * 16.0F * local25);
			super.aClass65_Sub1_41.method1286(this.aClass391_2.aClass80_Sub2Array4[local159 % 16]);
		}
		super.aClass65_Sub1_41.method1256(0);
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8713(@OriginalArg(1) boolean arg0) {
		this.aClass243_3.method5740('\u0000');
		if (this.aClass391_2.aBoolean911) {
			super.aClass65_Sub1_41.method1256(1);
			super.aClass65_Sub1_41.method1286(this.aClass391_2.aClass80_Sub3_2);
			super.aClass65_Sub1_41.method1256(0);
		}
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(Lclient!wj;II)V")
	@Override
	public void method8712(@OriginalArg(0) Class80 arg0, @OriginalArg(2) int arg1) {
		super.aClass65_Sub1_41.method1286(arg0);
		super.aClass65_Sub1_41.method1290(arg1);
	}

	@OriginalMember(owner = "client!paa", name = "b", descriptor = "(B)V")
	@Override
	public void method8716() {
		this.aClass243_3.method5740('\u0001');
		super.aClass65_Sub1_41.method1256(1);
		super.aClass65_Sub1_41.method1286((Class80) null);
		super.aClass65_Sub1_41.method1256(0);
	}

	@OriginalMember(owner = "client!paa", name = "b", descriptor = "(IZ)V")
	@Override
	public void method8717(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8714() {
		return true;
	}
}
