import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tt")
public final class Class20_Sub10 extends Class20 {

	@OriginalMember(owner = "client!tt", name = "r", descriptor = "Z")
	private boolean aBoolean717;

	@OriginalMember(owner = "client!tt", name = "u", descriptor = "Lclient!rfa;")
	private final Class312 aClass312_7;

	@OriginalMember(owner = "client!tt", name = "m", descriptor = "Z")
	private final boolean aBoolean716;

	@OriginalMember(owner = "client!tt", name = "p", descriptor = "Lclient!ct;")
	private Class52 aClass52_1;

	@OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(Lclient!nv;Lclient!bt;Lclient!rfa;)V")
	public Class20_Sub10(@OriginalArg(0) Class33_Sub2_Sub1 arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) Class312 arg2) {
		super(arg0);
		this.aClass312_7 = arg2;
		if (arg1 != null && arg0.aBoolean506 && arg0.aBoolean503) {
			@Pc(27) Class284 local27 = Static646.method8603(35633, arg1.method1238("gl", "environment_mapped_water_v"), arg0);
			@Pc(37) Class284 local37 = Static646.method8603(35632, arg1.method1238("gl", "environment_mapped_water_f"), arg0);
			this.aClass52_1 = Static244.method3603(new Class284[] { local27, local37 }, arg0);
			this.aBoolean716 = this.aClass52_1 != null && this.aClass312_7.method6976();
		} else {
			this.aBoolean716 = false;
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7967(@OriginalArg(0) boolean arg0) {
		@Pc(14) Interface17 local14 = super.aClass33_Sub2_21.method8215();
		if (!this.aBoolean716 || local14 == null) {
			return;
		}
		super.aClass33_Sub2_21.method8235(1);
		super.aClass33_Sub2_21.method8159(local14);
		super.aClass33_Sub2_21.method8235(0);
		super.aClass33_Sub2_21.method8159(this.aClass312_7.anInterface7_1);
		@Pc(47) long local47 = this.aClass52_1.aLong53;
		OpenGL.glUseProgramObjectARB(local47);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local47, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local47, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local47, "sunDir"), -super.aClass33_Sub2_21.aFloatArray71[0], -super.aClass33_Sub2_21.aFloatArray71[1], -super.aClass33_Sub2_21.aFloatArray71[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local47, "sunColour"), super.aClass33_Sub2_21.aFloat215, super.aClass33_Sub2_21.aFloat224, super.aClass33_Sub2_21.aFloat218, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local47, "sunExponent"), Math.abs(super.aClass33_Sub2_21.aFloatArray71[1]) * 928.0F + 96.0F);
		this.aBoolean717 = true;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7969(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean717) {
			return;
		}
		@Pc(18) int local18 = 0x1 << (arg0 & 0x3);
		@Pc(29) float local29 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(33) int local33 = arg1 & 0xFFFF;
		@Pc(42) float local42 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(46) long local46 = this.aClass52_1.aLong53;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local46, "time"), (float) (local18 * super.aClass33_Sub2_21.anInt9643 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local46, "scale"), local29);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local46, "breakWaterDepth"), (float) local33);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local46, "breakWaterOffset"), local42);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Z)V")
	@Override
	public void method7960() {
		if (!this.aBoolean717) {
			return;
		}
		super.aClass33_Sub2_21.method8235(1);
		super.aClass33_Sub2_21.method8159((Interface14) null);
		super.aClass33_Sub2_21.method8235(0);
		super.aClass33_Sub2_21.method8159((Interface14) null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean717 = false;
	}

	@OriginalMember(owner = "client!tt", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method7970() {
		return this.aBoolean716;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(ZILclient!gaa;)V")
	@Override
	public void method7965(@OriginalArg(1) int arg0, @OriginalArg(2) Interface14 arg1) {
		if (!this.aBoolean717) {
			super.aClass33_Sub2_21.method8159(arg1);
			super.aClass33_Sub2_21.method8167(arg0);
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7961(@OriginalArg(0) boolean arg0) {
	}
}
