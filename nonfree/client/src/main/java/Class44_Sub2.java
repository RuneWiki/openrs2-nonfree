import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dca")
public final class Class44_Sub2 extends Class44 {

	@OriginalMember(owner = "client!dca", name = "r", descriptor = "Lclient!lm;")
	private final Class188 aClass188_1;

	@OriginalMember(owner = "client!dca", name = "m", descriptor = "Lclient!ab;")
	private final Class3 aClass3_1;

	@OriginalMember(owner = "client!dca", name = "<init>", descriptor = "(Lclient!jj;Lclient!lm;)V")
	public Class44_Sub2(@OriginalArg(0) Class62_Sub3 arg0, @OriginalArg(1) Class188 arg1) {
		super(arg0);
		this.aClass188_1 = arg1;
		this.aClass3_1 = new Class3(arg0, 2);
		this.aClass3_1.method205(0);
		super.aClass62_Sub3_43.method4009(1);
		if (this.aClass188_1.aBoolean404) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass62_Sub3_43.method4009(0);
		this.aClass3_1.method210();
		this.aClass3_1.method205(1);
		super.aClass62_Sub3_43.method4009(1);
		if (this.aClass188_1.aBoolean404) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass62_Sub3_43.method4009(0);
		this.aClass3_1.method210();
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(ILclient!aba;I)V")
	@Override
	public void method7275(@OriginalArg(0) int arg0, @OriginalArg(1) Class4 arg1) {
		super.aClass62_Sub3_43.method4007(arg1);
		super.aClass62_Sub3_43.method3999(arg0);
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7274(@OriginalArg(0) boolean arg0) {
		this.aClass3_1.method207('\u0000');
		if (this.aClass188_1.aBoolean404) {
			super.aClass62_Sub3_43.method4009(1);
			super.aClass62_Sub3_43.method4007(this.aClass188_1.aClass4_Sub1_3);
			super.aClass62_Sub3_43.method4009(0);
		}
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(III)V")
	@Override
	public void method7278(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) float local14 = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
		@Pc(25) float local25 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(36) float local36 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(44) boolean local44 = (arg0 & 0x80) != 0;
		super.aClass62_Sub3_43.method4009(1);
		if (local44) {
			Static267.aFloatArray38[3] = 0.0F;
			Static267.aFloatArray38[0] = local36;
			Static267.aFloatArray38[2] = 0.0F;
			Static267.aFloatArray38[1] = 0.0F;
		} else {
			Static267.aFloatArray38[3] = 0.0F;
			Static267.aFloatArray38[1] = 0.0F;
			Static267.aFloatArray38[2] = local36;
			Static267.aFloatArray38[0] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, Static267.aFloatArray38, 0);
		Static267.aFloatArray38[2] = 0.0F;
		Static267.aFloatArray38[0] = 0.0F;
		Static267.aFloatArray38[3] = (float) super.aClass62_Sub3_43.anInt4623 * local14 % 1.0F;
		Static267.aFloatArray38[1] = local36;
		OpenGL.glTexGenfv(8193, 9474, Static267.aFloatArray38, 0);
		if (this.aClass188_1.aBoolean404) {
			Static267.aFloatArray38[3] = local25 * (float) super.aClass62_Sub3_43.anInt4623 % 1.0F;
			Static267.aFloatArray38[1] = 0.0F;
			Static267.aFloatArray38[0] = 0.0F;
			Static267.aFloatArray38[2] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static267.aFloatArray38, 0);
		} else {
			@Pc(162) int local162 = (int) ((float) super.aClass62_Sub3_43.anInt4623 * 16.0F * local25);
			super.aClass62_Sub3_43.method4007(this.aClass188_1.aClass4_Sub2Array1[local162 % 16]);
		}
		super.aClass62_Sub3_43.method4009(0);
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7277(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(B)V")
	@Override
	public void method7280() {
		this.aClass3_1.method207('\u0001');
		super.aClass62_Sub3_43.method4009(1);
		super.aClass62_Sub3_43.method4007(null);
		super.aClass62_Sub3_43.method4009(0);
	}

	@OriginalMember(owner = "client!dca", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7281() {
		return true;
	}
}
