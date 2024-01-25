import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public final class Class29_Sub3 extends Class29 {

	@OriginalMember(owner = "client!jg", name = "j", descriptor = "Lclient!ai;")
	private final Class9 aClass9_3;

	@OriginalMember(owner = "client!jg", name = "g", descriptor = "Lclient!tm;")
	private final Class239 aClass239_3;

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Lclient!da;Lclient!ai;)V")
	public Class29_Sub3(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) Class9 arg1) {
		super(arg0);
		this.aClass9_3 = arg1;
		this.aClass239_3 = new Class239(arg0, 2);
		this.aClass239_3.method5221(0);
		super.aClass50_Sub1_37.method1300(1);
		if (this.aClass9_3.aBoolean7) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass50_Sub1_37.method1300(0);
		this.aClass239_3.method5222();
		this.aClass239_3.method5221(1);
		super.aClass50_Sub1_37.method1300(1);
		if (this.aClass9_3.aBoolean7) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass50_Sub1_37.method1300(0);
		this.aClass239_3.method5222();
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V")
	@Override
	public void method5381() {
		this.aClass239_3.method5224('\u0001');
		super.aClass50_Sub1_37.method1300(1);
		super.aClass50_Sub1_37.method1295(null);
		super.aClass50_Sub1_37.method1300(0);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(III)V")
	@Override
	public void method5378(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) float local14 = (float) ((arg0 & 0x3) + 1) * -5.0E-4F;
		@Pc(25) float local25 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(33) float local33 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(41) boolean local41 = (arg0 & 0x80) != 0;
		super.aClass50_Sub1_37.method1300(1);
		if (local41) {
			Static34.aFloatArray4[2] = 0.0F;
			Static34.aFloatArray4[3] = 0.0F;
			Static34.aFloatArray4[1] = 0.0F;
			Static34.aFloatArray4[0] = local33;
		} else {
			Static34.aFloatArray4[1] = 0.0F;
			Static34.aFloatArray4[3] = 0.0F;
			Static34.aFloatArray4[0] = 0.0F;
			Static34.aFloatArray4[2] = local33;
		}
		OpenGL.glTexGenfv(8192, 9474, Static34.aFloatArray4, 0);
		Static34.aFloatArray4[3] = (float) super.aClass50_Sub1_37.anInt1403 * local14 % 1.0F;
		Static34.aFloatArray4[2] = 0.0F;
		Static34.aFloatArray4[1] = local33;
		Static34.aFloatArray4[0] = 0.0F;
		OpenGL.glTexGenfv(8193, 9474, Static34.aFloatArray4, 0);
		if (this.aClass9_3.aBoolean7) {
			Static34.aFloatArray4[1] = 0.0F;
			Static34.aFloatArray4[2] = 0.0F;
			Static34.aFloatArray4[0] = 0.0F;
			Static34.aFloatArray4[3] = local25 * (float) super.aClass50_Sub1_37.anInt1403 % 1.0F;
			OpenGL.glTexGenfv(8194, 9473, Static34.aFloatArray4, 0);
		} else {
			@Pc(134) int local134 = (int) (local25 * (float) super.aClass50_Sub1_37.anInt1403 * 16.0F);
			super.aClass50_Sub1_37.method1295(this.aClass9_3.aClass4_Sub1Array1[local134 % 16]);
		}
		super.aClass50_Sub1_37.method1300(0);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5375() {
		return true;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IILclient!ac;)V")
	@Override
	public void method5382(@OriginalArg(0) int arg0, @OriginalArg(2) Class4 arg1) {
		super.aClass50_Sub1_37.method1295(arg1);
		super.aClass50_Sub1_37.method1256(arg0);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5376(@OriginalArg(0) boolean arg0) {
		this.aClass239_3.method5224('\u0000');
		if (this.aClass9_3.aBoolean7) {
			super.aClass50_Sub1_37.method1300(1);
			super.aClass50_Sub1_37.method1295(this.aClass9_3.aClass4_Sub3_1);
			super.aClass50_Sub1_37.method1300(0);
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(BZ)V")
	@Override
	public void method5383(@OriginalArg(1) boolean arg0) {
	}
}
