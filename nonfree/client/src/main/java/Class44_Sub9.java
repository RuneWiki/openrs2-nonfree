import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tk")
public final class Class44_Sub9 extends Class44 {

	@OriginalMember(owner = "client!tk", name = "d", descriptor = "Lclient!od;")
	private final Class262 aClass262_6;

	@OriginalMember(owner = "client!tk", name = "e", descriptor = "Lclient!pia;")
	private final Class283 aClass283_5;

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Lclient!pc;Lclient!od;)V")
	public Class44_Sub9(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) Class262 arg1) {
		super(arg0);
		this.aClass262_6 = arg1;
		this.aClass283_5 = new Class283(arg0, 2);
		this.aClass283_5.method6455(0);
		super.aClass33_Sub3_34.method6329(1);
		if (this.aClass262_6.aBoolean519) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass33_Sub3_34.method6329(0);
		this.aClass283_5.method6454();
		this.aClass283_5.method6455(1);
		super.aClass33_Sub3_34.method6329(1);
		if (this.aClass262_6.aBoolean519) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass33_Sub3_34.method6329(0);
		this.aClass283_5.method6454();
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(III)V")
	@Override
	public void method7668(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) float local14 = (float) ((arg0 & 0x3) + 1) * -5.0E-4F;
		@Pc(25) float local25 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(33) float local33 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		super.aClass33_Sub3_34.method6329(1);
		@Pc(49) boolean local49 = (arg0 & 0x80) != 0;
		if (local49) {
			Static566.aFloatArray63[0] = local33;
			Static566.aFloatArray63[3] = 0.0F;
			Static566.aFloatArray63[1] = 0.0F;
			Static566.aFloatArray63[2] = 0.0F;
		} else {
			Static566.aFloatArray63[1] = 0.0F;
			Static566.aFloatArray63[3] = 0.0F;
			Static566.aFloatArray63[0] = 0.0F;
			Static566.aFloatArray63[2] = local33;
		}
		OpenGL.glTexGenfv(8192, 9474, Static566.aFloatArray63, 0);
		Static566.aFloatArray63[1] = local33;
		Static566.aFloatArray63[3] = (float) super.aClass33_Sub3_34.anInt7264 * local14 % 1.0F;
		Static566.aFloatArray63[0] = 0.0F;
		Static566.aFloatArray63[2] = 0.0F;
		OpenGL.glTexGenfv(8193, 9474, Static566.aFloatArray63, 0);
		if (this.aClass262_6.aBoolean519) {
			Static566.aFloatArray63[2] = 0.0F;
			Static566.aFloatArray63[1] = 0.0F;
			Static566.aFloatArray63[3] = local25 * (float) super.aClass33_Sub3_34.anInt7264 % 1.0F;
			Static566.aFloatArray63[0] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static566.aFloatArray63, 0);
		} else {
			@Pc(132) int local132 = (int) ((float) super.aClass33_Sub3_34.anInt7264 * local25 * 16.0F);
			super.aClass33_Sub3_34.method6340(this.aClass262_6.aClass116_Sub2Array3[local132 % 16]);
		}
		super.aClass33_Sub3_34.method6329(0);
	}

	@OriginalMember(owner = "client!tk", name = "c", descriptor = "(IZ)V")
	@Override
	public void method7671(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(IZ)V")
	@Override
	public void method7670(@OriginalArg(1) boolean arg0) {
		this.aClass283_5.method6453('\u0000');
		if (this.aClass262_6.aBoolean519) {
			super.aClass33_Sub3_34.method6329(1);
			super.aClass33_Sub3_34.method6340(this.aClass262_6.aClass116_Sub3_1);
			super.aClass33_Sub3_34.method6329(0);
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7666() {
		return true;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IBLclient!fha;)V")
	@Override
	public void method7667(@OriginalArg(0) int arg0, @OriginalArg(2) Class116 arg1) {
		super.aClass33_Sub3_34.method6340(arg1);
		super.aClass33_Sub3_34.method6336(arg0);
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V")
	@Override
	public void method7672() {
		this.aClass283_5.method6453('\u0001');
		super.aClass33_Sub3_34.method6329(1);
		super.aClass33_Sub3_34.method6340((Class116) null);
		super.aClass33_Sub3_34.method6329(0);
	}
}
