import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lo")
public final class Class40_Sub6 extends Class40 {

	@OriginalMember(owner = "client!lo", name = "r", descriptor = "Lclient!wc;")
	private final Class266 aClass266_6;

	@OriginalMember(owner = "client!lo", name = "l", descriptor = "Lclient!kp;")
	private final Class150 aClass150_3;

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(Lclient!na;Lclient!wc;)V")
	public Class40_Sub6(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) Class266 arg1) {
		super(arg0);
		this.aClass266_6 = arg1;
		this.aClass150_3 = new Class150(arg0, 2);
		this.aClass150_3.method3069(0);
		super.aClass75_Sub2_41.method3811(1);
		if (this.aClass266_6.aBoolean507) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass75_Sub2_41.method3811(0);
		this.aClass150_3.method3066();
		this.aClass150_3.method3069(1);
		super.aClass75_Sub2_41.method3811(1);
		if (this.aClass266_6.aBoolean507) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass75_Sub2_41.method3811(0);
		this.aClass150_3.method3066();
	}

	@OriginalMember(owner = "client!lo", name = "c", descriptor = "(I)V")
	@Override
	public void method5757() {
		this.aClass150_3.method3067('\u0001');
		super.aClass75_Sub2_41.method3811(1);
		super.aClass75_Sub2_41.method3844(null);
		super.aClass75_Sub2_41.method3811(0);
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5753() {
		return true;
	}

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "(ZB)V")
	@Override
	public void method5758(@OriginalArg(0) boolean arg0) {
		this.aClass150_3.method3067('\u0000');
		if (this.aClass266_6.aBoolean507) {
			super.aClass75_Sub2_41.method3811(1);
			super.aClass75_Sub2_41.method3844(this.aClass266_6.aClass64_Sub2_3);
			super.aClass75_Sub2_41.method3811(0);
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIB)V")
	@Override
	public void method5759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) float local14 = -5.0E-4F * (float) ((arg1 & 0x3) + 1);
		@Pc(25) float local25 = (float) ((arg1 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(36) float local36 = (arg1 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		super.aClass75_Sub2_41.method3811(1);
		@Pc(57) boolean local57 = (arg1 & 0x80) != 0;
		if (local57) {
			Static227.aFloatArray6[1] = 0.0F;
			Static227.aFloatArray6[2] = 0.0F;
			Static227.aFloatArray6[0] = local36;
			Static227.aFloatArray6[3] = 0.0F;
		} else {
			Static227.aFloatArray6[0] = 0.0F;
			Static227.aFloatArray6[2] = local36;
			Static227.aFloatArray6[3] = 0.0F;
			Static227.aFloatArray6[1] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, Static227.aFloatArray6, 0);
		Static227.aFloatArray6[3] = local14 * (float) super.aClass75_Sub2_41.anInt4860 % 1.0F;
		Static227.aFloatArray6[2] = 0.0F;
		Static227.aFloatArray6[0] = 0.0F;
		Static227.aFloatArray6[1] = local36;
		OpenGL.glTexGenfv(8193, 9474, Static227.aFloatArray6, 0);
		if (this.aClass266_6.aBoolean507) {
			Static227.aFloatArray6[1] = 0.0F;
			Static227.aFloatArray6[3] = (float) super.aClass75_Sub2_41.anInt4860 * local25 % 1.0F;
			Static227.aFloatArray6[2] = 0.0F;
			Static227.aFloatArray6[0] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static227.aFloatArray6, 0);
		} else {
			@Pc(170) int local170 = (int) ((float) super.aClass75_Sub2_41.anInt4860 * local25 * 16.0F);
			super.aClass75_Sub2_41.method3844(this.aClass266_6.aClass64_Sub4Array4[local170 % 16]);
		}
		super.aClass75_Sub2_41.method3811(0);
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IILclient!ed;)V")
	@Override
	public void method5760(@OriginalArg(0) int arg0, @OriginalArg(2) Class64 arg1) {
		super.aClass75_Sub2_41.method3844(arg1);
		super.aClass75_Sub2_41.method3798(arg0);
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5755(@OriginalArg(0) boolean arg0) {
	}
}
