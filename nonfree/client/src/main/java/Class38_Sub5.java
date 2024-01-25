import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kia")
public final class Class38_Sub5 extends Class38 {

	@OriginalMember(owner = "client!kia", name = "g", descriptor = "Lclient!sn;")
	private final Class336 aClass336_3;

	@OriginalMember(owner = "client!kia", name = "o", descriptor = "Lclient!vb;")
	private final Class371 aClass371_2;

	@OriginalMember(owner = "client!kia", name = "<init>", descriptor = "(Lclient!pi;Lclient!sn;)V")
	public Class38_Sub5(@OriginalArg(0) Class144_Sub3 arg0, @OriginalArg(1) Class336 arg1) {
		super(arg0);
		this.aClass336_3 = arg1;
		this.aClass371_2 = new Class371(arg0, 2);
		this.aClass371_2.method8902(0);
		super.aClass144_Sub3_43.method7028(1);
		if (this.aClass336_3.aBoolean650) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass144_Sub3_43.method7028(0);
		this.aClass371_2.method8904();
		this.aClass371_2.method8902(1);
		super.aClass144_Sub3_43.method7028(1);
		if (this.aClass336_3.aBoolean650) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass144_Sub3_43.method7028(0);
		this.aClass371_2.method8904();
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(IZ)V")
	@Override
	public void method9399(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!kia", name = "b", descriptor = "(B)V")
	@Override
	public void method9402() {
		this.aClass371_2.method8907('\u0001');
		super.aClass144_Sub3_43.method7028(1);
		super.aClass144_Sub3_43.method6982((Class161) null);
		super.aClass144_Sub3_43.method7028(0);
	}

	@OriginalMember(owner = "client!kia", name = "b", descriptor = "(IZ)V")
	@Override
	public void method9406(@OriginalArg(1) boolean arg0) {
		this.aClass371_2.method8907('\u0000');
		if (this.aClass336_3.aBoolean650) {
			super.aClass144_Sub3_43.method7028(1);
			super.aClass144_Sub3_43.method6982(this.aClass336_3.aClass161_Sub3_1);
			super.aClass144_Sub3_43.method7028(0);
		}
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(BII)V")
	@Override
	public void method9398(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) float local14 = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
		@Pc(25) float local25 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(34) float local34 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		super.aClass144_Sub3_43.method7028(1);
		@Pc(51) boolean local51 = (arg0 & 0x80) != 0;
		if (local51) {
			Static496.aFloatArray67[1] = 0.0F;
			Static496.aFloatArray67[3] = 0.0F;
			Static496.aFloatArray67[0] = local34;
			Static496.aFloatArray67[2] = 0.0F;
		} else {
			Static496.aFloatArray67[3] = 0.0F;
			Static496.aFloatArray67[1] = 0.0F;
			Static496.aFloatArray67[2] = local34;
			Static496.aFloatArray67[0] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, Static496.aFloatArray67, 0);
		Static496.aFloatArray67[1] = local34;
		Static496.aFloatArray67[2] = 0.0F;
		Static496.aFloatArray67[0] = 0.0F;
		Static496.aFloatArray67[3] = (float) super.aClass144_Sub3_43.anInt8054 * local14 % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, Static496.aFloatArray67, 0);
		if (this.aClass336_3.aBoolean650) {
			Static496.aFloatArray67[0] = 0.0F;
			Static496.aFloatArray67[1] = 0.0F;
			Static496.aFloatArray67[3] = local25 * (float) super.aClass144_Sub3_43.anInt8054 % 1.0F;
			Static496.aFloatArray67[2] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static496.aFloatArray67, 0);
		} else {
			@Pc(178) int local178 = (int) ((float) super.aClass144_Sub3_43.anInt8054 * local25 * 16.0F);
			super.aClass144_Sub3_43.method6982(this.aClass336_3.aClass161_Sub1Array4[local178 % 16]);
		}
		super.aClass144_Sub3_43.method7028(0);
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(ZLclient!pu;I)V")
	@Override
	public void method9401(@OriginalArg(1) Class161 arg0, @OriginalArg(2) int arg1) {
		super.aClass144_Sub3_43.method6982(arg0);
		super.aClass144_Sub3_43.method6988(arg1);
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9403() {
		return true;
	}
}
