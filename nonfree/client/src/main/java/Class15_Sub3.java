import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dfa")
public final class Class15_Sub3 extends Class15 {

	@OriginalMember(owner = "client!dfa", name = "m", descriptor = "Lclient!fj;")
	private final Class105 aClass105_2;

	@OriginalMember(owner = "client!dfa", name = "q", descriptor = "Lclient!sr;")
	private final Class307 aClass307_2;

	@OriginalMember(owner = "client!dfa", name = "<init>", descriptor = "(Lclient!er;Lclient!fj;)V")
	public Class15_Sub3(@OriginalArg(0) Class31_Sub2 arg0, @OriginalArg(1) Class105 arg1) {
		super(arg0);
		this.aClass105_2 = arg1;
		this.aClass307_2 = new Class307(arg0, 2);
		this.aClass307_2.method6701(0);
		super.aClass31_Sub2_40.method2513(1);
		if (this.aClass105_2.aBoolean246) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass31_Sub2_40.method2513(0);
		this.aClass307_2.method6702();
		this.aClass307_2.method6701(1);
		super.aClass31_Sub2_40.method2513(1);
		if (this.aClass105_2.aBoolean246) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass31_Sub2_40.method2513(0);
		this.aClass307_2.method6702();
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6942(@OriginalArg(0) boolean arg0) {
		this.aClass307_2.method6699('\u0000');
		if (this.aClass105_2.aBoolean246) {
			super.aClass31_Sub2_40.method2513(1);
			super.aClass31_Sub2_40.method2535(this.aClass105_2.aClass50_Sub3_1);
			super.aClass31_Sub2_40.method2513(0);
		}
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method6945(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(III)V")
	@Override
	public void method6948(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) float local14 = -5.0E-4F * (float) ((arg1 & 0x3) + 1);
		@Pc(25) float local25 = (float) ((arg1 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(36) float local36 = (arg1 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(44) boolean local44 = (arg1 & 0x80) != 0;
		super.aClass31_Sub2_40.method2513(1);
		if (local44) {
			Static8.aFloatArray3[2] = 0.0F;
			Static8.aFloatArray3[1] = 0.0F;
			Static8.aFloatArray3[0] = local36;
			Static8.aFloatArray3[3] = 0.0F;
		} else {
			Static8.aFloatArray3[1] = 0.0F;
			Static8.aFloatArray3[3] = 0.0F;
			Static8.aFloatArray3[2] = local36;
			Static8.aFloatArray3[0] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, Static8.aFloatArray3, 0);
		Static8.aFloatArray3[1] = local36;
		Static8.aFloatArray3[2] = 0.0F;
		Static8.aFloatArray3[3] = local14 * (float) super.aClass31_Sub2_40.anInt3134 % 1.0F;
		Static8.aFloatArray3[0] = 0.0F;
		OpenGL.glTexGenfv(8193, 9474, Static8.aFloatArray3, 0);
		if (this.aClass105_2.aBoolean246) {
			Static8.aFloatArray3[2] = 0.0F;
			Static8.aFloatArray3[1] = 0.0F;
			Static8.aFloatArray3[3] = local25 * (float) super.aClass31_Sub2_40.anInt3134 % 1.0F;
			Static8.aFloatArray3[0] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static8.aFloatArray3, 0);
		} else {
			@Pc(166) int local166 = (int) ((float) super.aClass31_Sub2_40.anInt3134 * 16.0F * local25);
			super.aClass31_Sub2_40.method2535(this.aClass105_2.aClass50_Sub1Array2[local166 % 16]);
		}
		super.aClass31_Sub2_40.method2513(0);
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(I)V")
	@Override
	public void method6944() {
		this.aClass307_2.method6699('\u0001');
		super.aClass31_Sub2_40.method2513(1);
		super.aClass31_Sub2_40.method2535(null);
		super.aClass31_Sub2_40.method2513(0);
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6946() {
		return true;
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(ILclient!ep;I)V")
	@Override
	public void method6947(@OriginalArg(1) Class50 arg0, @OriginalArg(2) int arg1) {
		super.aClass31_Sub2_40.method2535(arg0);
		super.aClass31_Sub2_40.method2495(arg1);
	}
}
