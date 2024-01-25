import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gr")
public final class Class18_Sub3 extends Class18 {

	@OriginalMember(owner = "client!gr", name = "o", descriptor = "Z")
	private boolean aBoolean289;

	@OriginalMember(owner = "client!gr", name = "n", descriptor = "Lclient!tn;")
	private final Class334 aClass334_2;

	@OriginalMember(owner = "client!gr", name = "B", descriptor = "Z")
	private final boolean aBoolean291;

	@OriginalMember(owner = "client!gr", name = "p", descriptor = "Lclient!pt;")
	private Class278 aClass278_1;

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(Lclient!tk;Lclient!nd;Lclient!tn;)V")
	public Class18_Sub3(@OriginalArg(0) Class13_Sub3_Sub1 arg0, @OriginalArg(1) Class238 arg1, @OriginalArg(2) Class334 arg2) {
		super(arg0);
		this.aClass334_2 = arg2;
		if (arg1 != null && arg0.aBoolean654 && arg0.aBoolean653) {
			@Pc(27) Class66 local27 = Static110.method1999(arg0, arg1.method5572("gl", "environment_mapped_water_v"), 35633);
			@Pc(37) Class66 local37 = Static110.method1999(arg0, arg1.method5572("gl", "environment_mapped_water_f"), 35632);
			this.aClass278_1 = Static186.method3190(arg0, new Class66[] { local27, local37 });
			this.aBoolean291 = this.aClass278_1 != null && this.aClass334_2.method7836();
		} else {
			this.aBoolean291 = false;
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(Z)V")
	@Override
	public void method8642() {
		if (!this.aBoolean289) {
			return;
		}
		super.aClass13_Sub3_23.method8230(1);
		super.aClass13_Sub3_23.method8234((Interface6) null);
		super.aClass13_Sub3_23.method8230(0);
		super.aClass13_Sub3_23.method8234((Interface6) null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean289 = false;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method8641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean289) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg0 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg1 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(36) long local36 = this.aClass278_1.aLong199;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "time"), (float) (super.aClass13_Sub3_23.anInt9736 * local8 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "scale"), local19);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "breakWaterOffset"), local32);
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8637(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8632(@OriginalArg(1) boolean arg0) {
		@Pc(15) Interface19 local15 = super.aClass13_Sub3_23.method8190();
		if (!this.aBoolean291 || local15 == null) {
			return;
		}
		super.aClass13_Sub3_23.method8230(1);
		super.aClass13_Sub3_23.method8234(local15);
		super.aClass13_Sub3_23.method8230(0);
		super.aClass13_Sub3_23.method8234(this.aClass334_2.anInterface1_2);
		@Pc(46) long local46 = this.aClass278_1.aLong199;
		OpenGL.glUseProgramObjectARB(local46);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local46, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local46, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local46, "sunDir"), -super.aClass13_Sub3_23.aFloatArray91[0], -super.aClass13_Sub3_23.aFloatArray91[1], -super.aClass13_Sub3_23.aFloatArray91[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local46, "sunColour"), super.aClass13_Sub3_23.aFloat199, super.aClass13_Sub3_23.aFloat203, super.aClass13_Sub3_23.aFloat193, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local46, "sunExponent"), Math.abs(super.aClass13_Sub3_23.aFloatArray91[1]) * 928.0F + 96.0F);
		this.aBoolean289 = true;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IILclient!fe;)V")
	@Override
	public void method8645(@OriginalArg(0) int arg0, @OriginalArg(2) Interface6 arg1) {
		if (!this.aBoolean289) {
			super.aClass13_Sub3_23.method8234(arg1);
			super.aClass13_Sub3_23.method8204(arg0);
		}
	}

	@OriginalMember(owner = "client!gr", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method8643() {
		return this.aBoolean291;
	}
}
