import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kea")
public final class Class52_Sub5 extends Class52 {

	@OriginalMember(owner = "client!kea", name = "m", descriptor = "Lclient!pba;")
	private final Class240 aClass240_3;

	@OriginalMember(owner = "client!kea", name = "q", descriptor = "Lclient!hea;")
	private final Class131 aClass131_4;

	@OriginalMember(owner = "client!kea", name = "<init>", descriptor = "(Lclient!pea;Lclient!pba;)V")
	public Class52_Sub5(@OriginalArg(0) Class121_Sub3 arg0, @OriginalArg(1) Class240 arg1) {
		super(arg0);
		this.aClass240_3 = arg1;
		this.aClass131_4 = new Class131(arg0, 2);
		this.aClass131_4.method2755(0);
		super.aClass121_Sub3_43.method5648(1);
		if (this.aClass240_3.aBoolean444) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass121_Sub3_43.method5648(0);
		this.aClass131_4.method2754();
		this.aClass131_4.method2755(1);
		super.aClass121_Sub3_43.method5648(1);
		if (this.aClass240_3.aBoolean444) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass121_Sub3_43.method5648(0);
		this.aClass131_4.method2754();
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method7601() {
		return true;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(BLclient!wq;I)V")
	@Override
	public void method7604(@OriginalArg(1) Class35 arg0, @OriginalArg(2) int arg1) {
		super.aClass121_Sub3_43.method5713(arg0);
		super.aClass121_Sub3_43.method5684(arg1);
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7603(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7605(@OriginalArg(0) boolean arg0) {
		this.aClass131_4.method2752('\u0000');
		if (this.aClass240_3.aBoolean444) {
			super.aClass121_Sub3_43.method5648(1);
			super.aClass121_Sub3_43.method5713(this.aClass240_3.aClass35_Sub1_1);
			super.aClass121_Sub3_43.method5648(0);
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(IZI)V")
	@Override
	public void method7599(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) float local14 = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
		@Pc(25) float local25 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(33) float local33 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(50) boolean local50 = (arg0 & 0x80) != 0;
		super.aClass121_Sub3_43.method5648(1);
		if (local50) {
			Static548.aFloatArray72[2] = 0.0F;
			Static548.aFloatArray72[3] = 0.0F;
			Static548.aFloatArray72[1] = 0.0F;
			Static548.aFloatArray72[0] = local33;
		} else {
			Static548.aFloatArray72[0] = 0.0F;
			Static548.aFloatArray72[1] = 0.0F;
			Static548.aFloatArray72[2] = local33;
			Static548.aFloatArray72[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, Static548.aFloatArray72, 0);
		Static548.aFloatArray72[1] = local33;
		Static548.aFloatArray72[2] = 0.0F;
		Static548.aFloatArray72[3] = (float) super.aClass121_Sub3_43.anInt6800 * local14 % 1.0F;
		Static548.aFloatArray72[0] = 0.0F;
		OpenGL.glTexGenfv(8193, 9474, Static548.aFloatArray72, 0);
		if (this.aClass240_3.aBoolean444) {
			Static548.aFloatArray72[2] = 0.0F;
			Static548.aFloatArray72[0] = 0.0F;
			Static548.aFloatArray72[3] = local25 * (float) super.aClass121_Sub3_43.anInt6800 % 1.0F;
			Static548.aFloatArray72[1] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static548.aFloatArray72, 0);
		} else {
			@Pc(168) int local168 = (int) (local25 * 16.0F * (float) super.aClass121_Sub3_43.anInt6800);
			super.aClass121_Sub3_43.method5713(this.aClass240_3.aClass35_Sub3Array2[local168 % 16]);
		}
		super.aClass121_Sub3_43.method5648(0);
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(I)V")
	@Override
	public void method7598() {
		this.aClass131_4.method2752('\u0001');
		super.aClass121_Sub3_43.method5648(1);
		super.aClass121_Sub3_43.method5713(null);
		super.aClass121_Sub3_43.method5648(0);
	}
}
