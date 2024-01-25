import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class13_Sub8 extends Class13 {

	@OriginalMember(owner = "client!th", name = "k", descriptor = "Lclient!pr;")
	private final Class264 aClass264_6;

	@OriginalMember(owner = "client!th", name = "g", descriptor = "Lclient!qha;")
	private final Class273 aClass273_5;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lclient!nv;Lclient!pr;)V")
	public Class13_Sub8(@OriginalArg(0) Class16_Sub3 arg0, @OriginalArg(1) Class264 arg1) {
		super(arg0);
		this.aClass264_6 = arg1;
		this.aClass273_5 = new Class273(arg0, 2);
		this.aClass273_5.method6909(0);
		super.aClass16_Sub3_42.method5944(1);
		if (this.aClass264_6.aBoolean588) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass16_Sub3_42.method5944(0);
		this.aClass273_5.method6915();
		this.aClass273_5.method6909(1);
		super.aClass16_Sub3_42.method5944(1);
		if (this.aClass264_6.aBoolean588) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass16_Sub3_42.method5944(0);
		this.aClass273_5.method6915();
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IBI)V")
	@Override
	public void method8263(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) float local14 = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
		@Pc(25) float local25 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(33) float local33 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(44) boolean local44 = (arg0 & 0x80) != 0;
		super.aClass16_Sub3_42.method5944(1);
		if (local44) {
			Static590.aFloatArray76[3] = 0.0F;
			Static590.aFloatArray76[2] = 0.0F;
			Static590.aFloatArray76[0] = local33;
			Static590.aFloatArray76[1] = 0.0F;
		} else {
			Static590.aFloatArray76[1] = 0.0F;
			Static590.aFloatArray76[0] = 0.0F;
			Static590.aFloatArray76[3] = 0.0F;
			Static590.aFloatArray76[2] = local33;
		}
		OpenGL.glTexGenfv(8192, 9474, Static590.aFloatArray76, 0);
		Static590.aFloatArray76[1] = local33;
		Static590.aFloatArray76[0] = 0.0F;
		Static590.aFloatArray76[2] = 0.0F;
		Static590.aFloatArray76[3] = (float) super.aClass16_Sub3_42.anInt7338 * local14 % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, Static590.aFloatArray76, 0);
		if (this.aClass264_6.aBoolean588) {
			Static590.aFloatArray76[1] = 0.0F;
			Static590.aFloatArray76[2] = 0.0F;
			Static590.aFloatArray76[0] = 0.0F;
			Static590.aFloatArray76[3] = local25 * (float) super.aClass16_Sub3_42.anInt7338 % 1.0F;
			OpenGL.glTexGenfv(8194, 9473, Static590.aFloatArray76, 0);
		} else {
			@Pc(132) int local132 = (int) (local25 * 16.0F * (float) super.aClass16_Sub3_42.anInt7338);
			super.aClass16_Sub3_42.method6020(this.aClass264_6.aClass20_Sub4Array4[local132 % 16]);
		}
		super.aClass16_Sub3_42.method5944(0);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8266(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V")
	@Override
	public void method8260() {
		this.aClass273_5.method6916('\u0001');
		super.aClass16_Sub3_42.method5944(1);
		super.aClass16_Sub3_42.method6020(null);
		super.aClass16_Sub3_42.method5944(0);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8265() {
		return true;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!tha;II)V")
	@Override
	public void method8264(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1) {
		super.aClass16_Sub3_42.method6020(arg0);
		super.aClass16_Sub3_42.method5972(arg1);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8268(@OriginalArg(1) boolean arg0) {
		this.aClass273_5.method6916('\u0000');
		if (this.aClass264_6.aBoolean588) {
			super.aClass16_Sub3_42.method5944(1);
			super.aClass16_Sub3_42.method6020(this.aClass264_6.aClass20_Sub2_2);
			super.aClass16_Sub3_42.method5944(0);
		}
	}
}
