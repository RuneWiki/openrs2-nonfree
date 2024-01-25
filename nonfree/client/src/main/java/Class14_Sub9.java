import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class14_Sub9 extends Class14 {

	@OriginalMember(owner = "client!wh", name = "p", descriptor = "Lclient!faa;")
	private final Class91 aClass91_6;

	@OriginalMember(owner = "client!wh", name = "o", descriptor = "Lclient!bp;")
	private final Class36 aClass36_6;

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lclient!eq;Lclient!faa;)V")
	public Class14_Sub9(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) Class91 arg1) {
		super(arg0);
		this.aClass91_6 = arg1;
		this.aClass36_6 = new Class36(arg0, 2);
		this.aClass36_6.method1116(0);
		super.aClass33_Sub3_43.method3027(1);
		if (this.aClass91_6.aBoolean294) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass33_Sub3_43.method3027(0);
		this.aClass36_6.method1115();
		this.aClass36_6.method1116(1);
		super.aClass33_Sub3_43.method3027(1);
		if (this.aClass91_6.aBoolean294) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass33_Sub3_43.method3027(0);
		this.aClass36_6.method1115();
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8549() {
		return true;
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(IZ)V")
	@Override
	public void method8550(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V")
	@Override
	public void method8545() {
		this.aClass36_6.method1112('\u0001');
		super.aClass33_Sub3_43.method3027(1);
		super.aClass33_Sub3_43.method3012(null);
		super.aClass33_Sub3_43.method3027(0);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8543(@OriginalArg(1) boolean arg0) {
		this.aClass36_6.method1112('\u0000');
		if (this.aClass91_6.aBoolean294) {
			super.aClass33_Sub3_43.method3027(1);
			super.aClass33_Sub3_43.method3012(this.aClass91_6.aClass121_Sub4_1);
			super.aClass33_Sub3_43.method3027(0);
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(III)V")
	@Override
	public void method8544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) float local14 = (float) ((arg1 & 0x3) + 1) * -5.0E-4F;
		@Pc(25) float local25 = (float) ((arg1 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(33) float local33 = (arg1 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		super.aClass33_Sub3_43.method3027(1);
		@Pc(49) boolean local49 = (arg1 & 0x80) != 0;
		if (local49) {
			Static390.aFloatArray56[2] = 0.0F;
			Static390.aFloatArray56[1] = 0.0F;
			Static390.aFloatArray56[0] = local33;
			Static390.aFloatArray56[3] = 0.0F;
		} else {
			Static390.aFloatArray56[2] = local33;
			Static390.aFloatArray56[1] = 0.0F;
			Static390.aFloatArray56[3] = 0.0F;
			Static390.aFloatArray56[0] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, Static390.aFloatArray56, 0);
		Static390.aFloatArray56[1] = local33;
		Static390.aFloatArray56[2] = 0.0F;
		Static390.aFloatArray56[0] = 0.0F;
		Static390.aFloatArray56[3] = (float) super.aClass33_Sub3_43.anInt3418 * local14 % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, Static390.aFloatArray56, 0);
		if (this.aClass91_6.aBoolean294) {
			Static390.aFloatArray56[2] = 0.0F;
			Static390.aFloatArray56[1] = 0.0F;
			Static390.aFloatArray56[0] = 0.0F;
			Static390.aFloatArray56[3] = local25 * (float) super.aClass33_Sub3_43.anInt3418 % 1.0F;
			OpenGL.glTexGenfv(8194, 9473, Static390.aFloatArray56, 0);
		} else {
			@Pc(136) int local136 = (int) (local25 * (float) super.aClass33_Sub3_43.anInt3418 * 16.0F);
			super.aClass33_Sub3_43.method3012(this.aClass91_6.aClass121_Sub2Array2[local136 % 16]);
		}
		super.aClass33_Sub3_43.method3027(0);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(BLclient!kp;I)V")
	@Override
	public void method8542(@OriginalArg(1) Class121 arg0, @OriginalArg(2) int arg1) {
		super.aClass33_Sub3_43.method3012(arg0);
		super.aClass33_Sub3_43.method3045(arg1);
	}
}
