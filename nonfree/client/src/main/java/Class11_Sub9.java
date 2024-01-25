import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wga")
public final class Class11_Sub9 extends Class11 {

	@OriginalMember(owner = "client!wga", name = "p", descriptor = "Lclient!sa;")
	private final Class314 aClass314_6;

	@OriginalMember(owner = "client!wga", name = "k", descriptor = "Lclient!up;")
	private final Class358 aClass358_6;

	@OriginalMember(owner = "client!wga", name = "<init>", descriptor = "(Lclient!pq;Lclient!sa;)V")
	public Class11_Sub9(@OriginalArg(0) Class132_Sub3 arg0, @OriginalArg(1) Class314 arg1) {
		super(arg0);
		this.aClass314_6 = arg1;
		this.aClass358_6 = new Class358(arg0, 2);
		this.aClass358_6.method8419(0);
		super.aClass132_Sub3_43.method6802(1);
		if (this.aClass314_6.aBoolean614) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass132_Sub3_43.method6802(0);
		this.aClass358_6.method8417();
		this.aClass358_6.method8419(1);
		super.aClass132_Sub3_43.method6802(1);
		if (this.aClass314_6.aBoolean614) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass132_Sub3_43.method6802(0);
		this.aClass358_6.method8417();
	}

	@OriginalMember(owner = "client!wga", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8991() {
		return true;
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method8987(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) float local14 = (float) ((arg1 & 0x3) + 1) * -5.0E-4F;
		@Pc(25) float local25 = (float) ((arg1 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(33) float local33 = (arg1 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(41) boolean local41 = (arg1 & 0x80) != 0;
		super.aClass132_Sub3_43.method6802(1);
		if (local41) {
			Static643.aFloatArray77[1] = 0.0F;
			Static643.aFloatArray77[2] = 0.0F;
			Static643.aFloatArray77[0] = local33;
			Static643.aFloatArray77[3] = 0.0F;
		} else {
			Static643.aFloatArray77[3] = 0.0F;
			Static643.aFloatArray77[1] = 0.0F;
			Static643.aFloatArray77[0] = 0.0F;
			Static643.aFloatArray77[2] = local33;
		}
		OpenGL.glTexGenfv(8192, 9474, Static643.aFloatArray77, 0);
		Static643.aFloatArray77[0] = 0.0F;
		Static643.aFloatArray77[3] = local14 * (float) super.aClass132_Sub3_43.anInt7881 % 1.0F;
		Static643.aFloatArray77[2] = 0.0F;
		Static643.aFloatArray77[1] = local33;
		OpenGL.glTexGenfv(8193, 9474, Static643.aFloatArray77, 0);
		if (this.aClass314_6.aBoolean614) {
			Static643.aFloatArray77[1] = 0.0F;
			Static643.aFloatArray77[2] = 0.0F;
			Static643.aFloatArray77[3] = local25 * (float) super.aClass132_Sub3_43.anInt7881 % 1.0F;
			Static643.aFloatArray77[0] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static643.aFloatArray77, 0);
		} else {
			@Pc(134) int local134 = (int) (local25 * 16.0F * (float) super.aClass132_Sub3_43.anInt7881);
			super.aClass132_Sub3_43.method6759(this.aClass314_6.aClass53_Sub2Array4[local134 % 16]);
		}
		super.aClass132_Sub3_43.method6802(0);
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(I)V")
	@Override
	public void method8982() {
		this.aClass358_6.method8418('\u0001');
		super.aClass132_Sub3_43.method6802(1);
		super.aClass132_Sub3_43.method6759((Class53) null);
		super.aClass132_Sub3_43.method6802(0);
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8989(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8984(@OriginalArg(1) boolean arg0) {
		this.aClass358_6.method8418('\u0000');
		if (this.aClass314_6.aBoolean614) {
			super.aClass132_Sub3_43.method6802(1);
			super.aClass132_Sub3_43.method6759(this.aClass314_6.aClass53_Sub4_3);
			super.aClass132_Sub3_43.method6802(0);
		}
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(IZLclient!wha;)V")
	@Override
	public void method8983(@OriginalArg(0) int arg0, @OriginalArg(2) Class53 arg1) {
		super.aClass132_Sub3_43.method6759(arg1);
		super.aClass132_Sub3_43.method6803(arg0);
	}
}
