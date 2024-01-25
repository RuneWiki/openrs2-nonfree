import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lr")
public final class Class16_Sub4 extends Class16 {

	@OriginalMember(owner = "client!lr", name = "C", descriptor = "Z")
	private boolean aBoolean558;

	@OriginalMember(owner = "client!lr", name = "s", descriptor = "Lclient!eb;")
	private final Class73 aClass73_5;

	@OriginalMember(owner = "client!lr", name = "E", descriptor = "Z")
	private final boolean aBoolean559;

	@OriginalMember(owner = "client!lr", name = "r", descriptor = "Lclient!wd;")
	private Class367 aClass367_1;

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lclient!ck;Lclient!kha;Lclient!eb;)V")
	public Class16_Sub4(@OriginalArg(0) Class33_Sub1_Sub1 arg0, @OriginalArg(1) Class181 arg1, @OriginalArg(2) Class73 arg2) {
		super(arg0);
		this.aClass73_5 = arg2;
		if (arg1 != null && arg0.aBoolean146 && arg0.aBoolean143) {
			@Pc(27) Class168 local27 = Static153.method3327(arg0, arg1.method5026("gl", "environment_mapped_water_v"), 35633);
			@Pc(37) Class168 local37 = Static153.method3327(arg0, arg1.method5026("gl", "environment_mapped_water_f"), 35632);
			this.aClass367_1 = Static228.method4362(arg0, new Class168[] { local27, local37 });
			this.aBoolean559 = this.aClass367_1 != null && this.aClass73_5.method2711();
		} else {
			this.aBoolean559 = false;
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lclient!bia;BI)V")
	@Override
	public void method8611(@OriginalArg(0) Interface3 arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean558) {
			super.aClass33_Sub1_23.method1987(arg0);
			super.aClass33_Sub1_23.method2105(arg1);
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8601(@OriginalArg(0) boolean arg0) {
		@Pc(14) Interface24 local14 = super.aClass33_Sub1_23.method1982();
		if (!this.aBoolean559 || local14 == null) {
			return;
		}
		super.aClass33_Sub1_23.method2010(1);
		super.aClass33_Sub1_23.method1987(local14);
		super.aClass33_Sub1_23.method2010(0);
		super.aClass33_Sub1_23.method1987(this.aClass73_5.anInterface17_1);
		@Pc(45) long local45 = this.aClass367_1.aLong272;
		OpenGL.glUseProgramObjectARB(local45);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local45, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local45, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local45, "sunDir"), -super.aClass33_Sub1_23.aFloatArray29[0], -super.aClass33_Sub1_23.aFloatArray29[1], -super.aClass33_Sub1_23.aFloatArray29[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local45, "sunColour"), super.aClass33_Sub1_23.aFloat69, super.aClass33_Sub1_23.aFloat71, super.aClass33_Sub1_23.aFloat77, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local45, "sunExponent"), Math.abs(super.aClass33_Sub1_23.aFloatArray29[1]) * 928.0F + 96.0F);
		this.aBoolean558 = true;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IBI)V")
	@Override
	public void method8605(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean558) {
			return;
		}
		@Pc(12) int local12 = 0x1 << (arg0 & 0x3);
		@Pc(23) float local23 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(27) int local27 = arg1 & 0xFFFF;
		@Pc(36) float local36 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(40) long local40 = this.aClass367_1.aLong272;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "time"), (float) (local12 * super.aClass33_Sub1_23.anInt2179 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "scale"), local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "breakWaterDepth"), (float) local27);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "breakWaterOffset"), local36);
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8596(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "(B)V")
	@Override
	public void method8604() {
		if (!this.aBoolean558) {
			return;
		}
		super.aClass33_Sub1_23.method2010(1);
		super.aClass33_Sub1_23.method1987(null);
		super.aClass33_Sub1_23.method2010(0);
		super.aClass33_Sub1_23.method1987(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean558 = false;
	}

	@OriginalMember(owner = "client!lr", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8608() {
		return this.aBoolean559;
	}
}
