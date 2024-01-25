import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!taa")
public final class Class112_Sub8 extends Class112 {

	@OriginalMember(owner = "client!taa", name = "r", descriptor = "Lclient!qf;")
	private final Class308 aClass308_5;

	@OriginalMember(owner = "client!taa", name = "i", descriptor = "Lclient!pha;")
	private final Class290 aClass290_6;

	@OriginalMember(owner = "client!taa", name = "<init>", descriptor = "(Lclient!uja;Lclient!qf;)V")
	public Class112_Sub8(@OriginalArg(0) Class145_Sub3 arg0, @OriginalArg(1) Class308 arg1) {
		super(arg0);
		this.aClass308_5 = arg1;
		this.aClass290_6 = new Class290(arg0, 2);
		this.aClass290_6.method6989(0);
		super.aClass145_Sub3_43.method8859(1);
		if (this.aClass308_5.aBoolean703) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass145_Sub3_43.method8859(0);
		this.aClass290_6.method6988();
		this.aClass290_6.method6989(1);
		super.aClass145_Sub3_43.method8859(1);
		if (this.aClass308_5.aBoolean703) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass145_Sub3_43.method8859(0);
		this.aClass290_6.method6988();
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8396(@OriginalArg(1) boolean arg0) {
		this.aClass290_6.method6987('\u0000');
		if (this.aClass308_5.aBoolean703) {
			super.aClass145_Sub3_43.method8859(1);
			super.aClass145_Sub3_43.method8872(this.aClass308_5.aClass64_Sub1_3);
			super.aClass145_Sub3_43.method8859(0);
		}
	}

	@OriginalMember(owner = "client!taa", name = "b", descriptor = "(III)V")
	@Override
	public void method8393(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) float local14 = -5.0E-4F * (float) ((arg1 & 0x3) + 1);
		@Pc(25) float local25 = (float) ((arg1 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(34) float local34 = (arg1 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(46) boolean local46 = (arg1 & 0x80) != 0;
		super.aClass145_Sub3_43.method8859(1);
		if (local46) {
			Static184.aFloatArray21[2] = 0.0F;
			Static184.aFloatArray21[3] = 0.0F;
			Static184.aFloatArray21[1] = 0.0F;
			Static184.aFloatArray21[0] = local34;
		} else {
			Static184.aFloatArray21[1] = 0.0F;
			Static184.aFloatArray21[3] = 0.0F;
			Static184.aFloatArray21[0] = 0.0F;
			Static184.aFloatArray21[2] = local34;
		}
		OpenGL.glTexGenfv(8192, 9474, Static184.aFloatArray21, 0);
		Static184.aFloatArray21[1] = local34;
		Static184.aFloatArray21[2] = 0.0F;
		Static184.aFloatArray21[0] = 0.0F;
		Static184.aFloatArray21[3] = local14 * (float) super.aClass145_Sub3_43.anInt10142 % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, Static184.aFloatArray21, 0);
		if (this.aClass308_5.aBoolean703) {
			Static184.aFloatArray21[1] = 0.0F;
			Static184.aFloatArray21[0] = 0.0F;
			Static184.aFloatArray21[3] = (float) super.aClass145_Sub3_43.anInt10142 * local25 % 1.0F;
			Static184.aFloatArray21[2] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static184.aFloatArray21, 0);
		} else {
			@Pc(177) int local177 = (int) ((float) super.aClass145_Sub3_43.anInt10142 * 16.0F * local25);
			super.aClass145_Sub3_43.method8872(this.aClass308_5.aClass64_Sub4Array4[local177 % 16]);
		}
		super.aClass145_Sub3_43.method8859(0);
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(I)V")
	@Override
	public void method8390() {
		this.aClass290_6.method6987('\u0001');
		super.aClass145_Sub3_43.method8859(1);
		super.aClass145_Sub3_43.method8872((Class64) null);
		super.aClass145_Sub3_43.method8859(0);
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8389() {
		return true;
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8388(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(Lclient!jca;II)V")
	@Override
	public void method8397(@OriginalArg(0) Class64 arg0, @OriginalArg(1) int arg1) {
		super.aClass145_Sub3_43.method8872(arg0);
		super.aClass145_Sub3_43.method8900(arg1);
	}
}
