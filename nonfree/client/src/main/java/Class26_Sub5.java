import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jfa")
public final class Class26_Sub5 extends Class26 {

	@OriginalMember(owner = "client!jfa", name = "k", descriptor = "Z")
	private boolean aBoolean396;

	@OriginalMember(owner = "client!jfa", name = "t", descriptor = "Lclient!oc;")
	private final Class270 aClass270_4;

	@OriginalMember(owner = "client!jfa", name = "x", descriptor = "Lclient!ma;")
	private Class235 aClass235_1;

	@OriginalMember(owner = "client!jfa", name = "l", descriptor = "Z")
	private final boolean aBoolean395;

	@OriginalMember(owner = "client!jfa", name = "<init>", descriptor = "(Lclient!mba;Lclient!nca;Lclient!oc;)V")
	public Class26_Sub5(@OriginalArg(0) Class145_Sub1_Sub1 arg0, @OriginalArg(1) Class254 arg1, @OriginalArg(2) Class270 arg2) {
		super(arg0);
		this.aClass270_4 = arg2;
		if (arg1 != null && arg0.aBoolean529 && arg0.aBoolean531) {
			@Pc(29) Class345 local29 = Static174.method2606(arg0, arg1.method6104("gl", "environment_mapped_water_v"), 35633);
			@Pc(43) Class345 local43 = Static174.method2606(arg0, arg1.method6104("gl", "environment_mapped_water_f"), 35632);
			this.aClass235_1 = Static232.method3320(arg0, new Class345[] { local29, local43 });
			this.aBoolean395 = this.aClass235_1 != null && this.aClass270_4.method6536();
		} else {
			this.aBoolean395 = false;
		}
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Lclient!iba;BI)V")
	@Override
	public void method8004(@OriginalArg(0) Interface9 arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean396) {
			super.aClass145_Sub1_21.method9754(arg0);
			super.aClass145_Sub1_21.method9797(arg1);
		}
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8006(@OriginalArg(1) boolean arg0) {
		@Pc(8) Interface18 local8 = super.aClass145_Sub1_21.method9785();
		if (!this.aBoolean395 || local8 == null) {
			return;
		}
		super.aClass145_Sub1_21.method9745(1);
		super.aClass145_Sub1_21.method9754(local8);
		super.aClass145_Sub1_21.method9745(0);
		super.aClass145_Sub1_21.method9754(this.aClass270_4.anInterface7_2);
		@Pc(41) long local41 = this.aClass235_1.aLong181;
		OpenGL.glUseProgramObjectARB(local41);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local41, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local41, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local41, "sunDir"), -super.aClass145_Sub1_21.aFloatArray74[0], -super.aClass145_Sub1_21.aFloatArray74[1], -super.aClass145_Sub1_21.aFloatArray74[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local41, "sunColour"), super.aClass145_Sub1_21.aFloat181, super.aClass145_Sub1_21.aFloat188, super.aClass145_Sub1_21.aFloat184, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local41, "sunExponent"), Math.abs(super.aClass145_Sub1_21.aFloatArray74[1]) * 928.0F + 96.0F);
		this.aBoolean396 = true;
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8001() {
		return this.aBoolean395;
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(III)V")
	@Override
	public void method8007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean396) {
			return;
		}
		@Pc(20) int local20 = 0x1 << (arg1 & 0x3);
		@Pc(31) float local31 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(35) int local35 = arg0 & 0xFFFF;
		@Pc(44) float local44 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(48) long local48 = this.aClass235_1.aLong181;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local48, "time"), (float) (local20 * super.aClass145_Sub1_21.anInt11263 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local48, "scale"), local31);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local48, "breakWaterDepth"), (float) local35);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local48, "breakWaterOffset"), local44);
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7998(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!jfa", name = "c", descriptor = "(Z)V")
	@Override
	public void method8009() {
		if (!this.aBoolean396) {
			return;
		}
		super.aClass145_Sub1_21.method9745(1);
		super.aClass145_Sub1_21.method9754((Interface9) null);
		super.aClass145_Sub1_21.method9745(0);
		super.aClass145_Sub1_21.method9754((Interface9) null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean396 = false;
	}
}
