import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public final class Class19_Sub7 extends Class19 {

	@OriginalMember(owner = "client!lg", name = "e", descriptor = "Lclient!b;")
	private final Class25 aClass25_4;

	@OriginalMember(owner = "client!lg", name = "i", descriptor = "Lclient!ee;")
	private final Class93 aClass93_4;

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Lclient!kv;Lclient!b;)V")
	public Class19_Sub7(@OriginalArg(0) Class143_Sub2 arg0, @OriginalArg(1) Class25 arg1) {
		super(arg0);
		this.aClass25_4 = arg1;
		this.aClass93_4 = new Class93(arg0, 2);
		this.aClass93_4.method1950(0);
		super.aClass143_Sub2_39.method4930(1);
		if (this.aClass25_4.aBoolean17) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass143_Sub2_39.method4930(0);
		this.aClass93_4.method1948();
		this.aClass93_4.method1950(1);
		super.aClass143_Sub2_39.method4930(1);
		if (this.aClass25_4.aBoolean17) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass143_Sub2_39.method4930(0);
		this.aClass93_4.method1948();
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7872(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(III)V")
	@Override
	public void method7876(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) float local14 = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
		@Pc(25) float local25 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(36) float local36 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		super.aClass143_Sub2_39.method4930(1);
		@Pc(49) boolean local49 = (arg0 & 0x80) != 0;
		if (local49) {
			Static211.aFloatArray11[2] = 0.0F;
			Static211.aFloatArray11[1] = 0.0F;
			Static211.aFloatArray11[3] = 0.0F;
			Static211.aFloatArray11[0] = local36;
		} else {
			Static211.aFloatArray11[2] = local36;
			Static211.aFloatArray11[3] = 0.0F;
			Static211.aFloatArray11[1] = 0.0F;
			Static211.aFloatArray11[0] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, Static211.aFloatArray11, 0);
		Static211.aFloatArray11[3] = (float) super.aClass143_Sub2_39.anInt5822 * local14 % 1.0F;
		Static211.aFloatArray11[2] = 0.0F;
		Static211.aFloatArray11[0] = 0.0F;
		Static211.aFloatArray11[1] = local36;
		OpenGL.glTexGenfv(8193, 9474, Static211.aFloatArray11, 0);
		if (this.aClass25_4.aBoolean17) {
			Static211.aFloatArray11[2] = 0.0F;
			Static211.aFloatArray11[3] = local25 * (float) super.aClass143_Sub2_39.anInt5822 % 1.0F;
			Static211.aFloatArray11[1] = 0.0F;
			Static211.aFloatArray11[0] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static211.aFloatArray11, 0);
		} else {
			@Pc(136) int local136 = (int) (local25 * (float) super.aClass143_Sub2_39.anInt5822 * 16.0F);
			super.aClass143_Sub2_39.method4945(this.aClass25_4.aClass44_Sub1Array1[local136 % 16]);
		}
		super.aClass143_Sub2_39.method4930(0);
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)V")
	@Override
	public void method7871() {
		this.aClass93_4.method1952('\u0001');
		super.aClass143_Sub2_39.method4930(1);
		super.aClass143_Sub2_39.method4945((Class44) null);
		super.aClass143_Sub2_39.method4930(0);
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7875(@OriginalArg(0) boolean arg0) {
		this.aClass93_4.method1952('\u0000');
		if (this.aClass25_4.aBoolean17) {
			super.aClass143_Sub2_39.method4930(1);
			super.aClass143_Sub2_39.method4945(this.aClass25_4.aClass44_Sub2_2);
			super.aClass143_Sub2_39.method4930(0);
		}
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7874() {
		return true;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!fia;IZ)V")
	@Override
	public void method7873(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1) {
		super.aClass143_Sub2_39.method4945(arg0);
		super.aClass143_Sub2_39.method4994(arg1);
	}
}
