import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lca")
public final class Class112_Sub4 extends Class112 {

	@OriginalMember(owner = "client!lca", name = "h", descriptor = "Lclient!de;")
	private final Class67 aClass67_3;

	@OriginalMember(owner = "client!lca", name = "f", descriptor = "Lclient!ud;")
	private final Class294 aClass294_2;

	@OriginalMember(owner = "client!lca", name = "<init>", descriptor = "(Lclient!gi;Lclient!de;)V")
	public Class112_Sub4(@OriginalArg(0) Class42_Sub3 arg0, @OriginalArg(1) Class67 arg1) {
		super(arg0);
		this.aClass67_3 = arg1;
		this.aClass294_2 = new Class294(arg0, 2);
		this.aClass294_2.method7287(0);
		super.aClass42_Sub3_39.method3259(1);
		if (this.aClass67_3.aBoolean145) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass42_Sub3_39.method3259(0);
		this.aClass294_2.method7288();
		this.aClass294_2.method7287(1);
		super.aClass42_Sub3_39.method3259(1);
		if (this.aClass67_3.aBoolean145) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass42_Sub3_39.method3259(0);
		this.aClass294_2.method7288();
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(BLclient!mw;I)V")
	@Override
	public void method7304(@OriginalArg(1) Class79 arg0, @OriginalArg(2) int arg1) {
		super.aClass42_Sub3_39.method3219(arg0);
		super.aClass42_Sub3_39.method3257(arg1);
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7309(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7305() {
		return true;
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7306(@OriginalArg(1) boolean arg0) {
		this.aClass294_2.method7284('\u0000');
		if (this.aClass67_3.aBoolean145) {
			super.aClass42_Sub3_39.method3259(1);
			super.aClass42_Sub3_39.method3219(this.aClass67_3.aClass79_Sub3_3);
			super.aClass42_Sub3_39.method3259(0);
		}
	}

	@OriginalMember(owner = "client!lca", name = "b", descriptor = "(I)V")
	@Override
	public void method7308() {
		this.aClass294_2.method7284('\u0001');
		super.aClass42_Sub3_39.method3259(1);
		super.aClass42_Sub3_39.method3219(null);
		super.aClass42_Sub3_39.method3259(0);
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(III)V")
	@Override
	public void method7311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) float local14 = (float) ((arg1 & 0x3) + 1) * -5.0E-4F;
		@Pc(25) float local25 = (float) ((arg1 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(36) float local36 = (arg1 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(47) boolean local47 = (arg1 & 0x80) != 0;
		super.aClass42_Sub3_39.method3259(1);
		if (local47) {
			Static371.aFloatArray56[1] = 0.0F;
			Static371.aFloatArray56[2] = 0.0F;
			Static371.aFloatArray56[3] = 0.0F;
			Static371.aFloatArray56[0] = local36;
		} else {
			Static371.aFloatArray56[0] = 0.0F;
			Static371.aFloatArray56[1] = 0.0F;
			Static371.aFloatArray56[2] = local36;
			Static371.aFloatArray56[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, Static371.aFloatArray56, 0);
		Static371.aFloatArray56[1] = local36;
		Static371.aFloatArray56[2] = 0.0F;
		Static371.aFloatArray56[3] = local14 * (float) super.aClass42_Sub3_39.anInt3674 % 1.0F;
		Static371.aFloatArray56[0] = 0.0F;
		OpenGL.glTexGenfv(8193, 9474, Static371.aFloatArray56, 0);
		if (this.aClass67_3.aBoolean145) {
			Static371.aFloatArray56[1] = 0.0F;
			Static371.aFloatArray56[0] = 0.0F;
			Static371.aFloatArray56[2] = 0.0F;
			Static371.aFloatArray56[3] = (float) super.aClass42_Sub3_39.anInt3674 * local25 % 1.0F;
			OpenGL.glTexGenfv(8194, 9473, Static371.aFloatArray56, 0);
		} else {
			@Pc(143) int local143 = (int) ((float) super.aClass42_Sub3_39.anInt3674 * local25 * 16.0F);
			super.aClass42_Sub3_39.method3219(this.aClass67_3.aClass79_Sub2Array2[local143 % 16]);
		}
		super.aClass42_Sub3_39.method3259(0);
	}
}
