import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ts")
public final class Class21_Sub7 extends Class21 {

	@OriginalMember(owner = "client!ts", name = "u", descriptor = "Lclient!ol;")
	private final Class264 aClass264_5;

	@OriginalMember(owner = "client!ts", name = "q", descriptor = "Lclient!cga;")
	private final Class58 aClass58_4;

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(Lclient!hk;Lclient!ol;)V")
	public Class21_Sub7(@OriginalArg(0) Class16_Sub2 arg0, @OriginalArg(1) Class264 arg1) {
		super(arg0);
		this.aClass264_5 = arg1;
		this.aClass58_4 = new Class58(arg0, 2);
		this.aClass58_4.method1621(0);
		super.aClass16_Sub2_43.method3683(1);
		if (this.aClass264_5.aBoolean579) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass16_Sub2_43.method3683(0);
		this.aClass58_4.method1620();
		this.aClass58_4.method1621(1);
		super.aClass16_Sub2_43.method3683(1);
		if (this.aClass264_5.aBoolean579) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass16_Sub2_43.method3683(0);
		this.aClass58_4.method1620();
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8697(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IBLclient!qk;)V")
	@Override
	public void method8700(@OriginalArg(0) int arg0, @OriginalArg(2) Class39 arg1) {
		super.aClass16_Sub2_43.method3620(arg1);
		super.aClass16_Sub2_43.method3680(arg0);
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8692() {
		return true;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8698(@OriginalArg(0) boolean arg0) {
		this.aClass58_4.method1625('\u0000');
		if (this.aClass264_5.aBoolean579) {
			super.aClass16_Sub2_43.method3683(1);
			super.aClass16_Sub2_43.method3620(this.aClass264_5.aClass39_Sub3_3);
			super.aClass16_Sub2_43.method3683(0);
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IZI)V")
	@Override
	public void method8696(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) float local14 = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
		@Pc(25) float local25 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(33) float local33 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		super.aClass16_Sub2_43.method3683(1);
		@Pc(49) boolean local49 = (arg0 & 0x80) != 0;
		if (local49) {
			Static660.aFloatArray83[1] = 0.0F;
			Static660.aFloatArray83[3] = 0.0F;
			Static660.aFloatArray83[2] = 0.0F;
			Static660.aFloatArray83[0] = local33;
		} else {
			Static660.aFloatArray83[3] = 0.0F;
			Static660.aFloatArray83[0] = 0.0F;
			Static660.aFloatArray83[2] = local33;
			Static660.aFloatArray83[1] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, Static660.aFloatArray83, 0);
		Static660.aFloatArray83[2] = 0.0F;
		Static660.aFloatArray83[1] = local33;
		Static660.aFloatArray83[3] = (float) super.aClass16_Sub2_43.anInt4365 * local14 % 1.0F;
		Static660.aFloatArray83[0] = 0.0F;
		OpenGL.glTexGenfv(8193, 9474, Static660.aFloatArray83, 0);
		if (this.aClass264_5.aBoolean579) {
			Static660.aFloatArray83[2] = 0.0F;
			Static660.aFloatArray83[1] = 0.0F;
			Static660.aFloatArray83[0] = 0.0F;
			Static660.aFloatArray83[3] = (float) super.aClass16_Sub2_43.anInt4365 * local25 % 1.0F;
			OpenGL.glTexGenfv(8194, 9473, Static660.aFloatArray83, 0);
		} else {
			@Pc(138) int local138 = (int) ((float) super.aClass16_Sub2_43.anInt4365 * local25 * 16.0F);
			super.aClass16_Sub2_43.method3620(this.aClass264_5.aClass39_Sub4Array4[local138 % 16]);
		}
		super.aClass16_Sub2_43.method3683(0);
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(Z)V")
	@Override
	public void method8695() {
		this.aClass58_4.method1625('\u0001');
		super.aClass16_Sub2_43.method3683(1);
		super.aClass16_Sub2_43.method3620((Class39) null);
		super.aClass16_Sub2_43.method3683(0);
	}
}
