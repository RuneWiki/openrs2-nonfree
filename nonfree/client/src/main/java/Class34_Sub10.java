import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ss")
public final class Class34_Sub10 extends Class34 {

	@OriginalMember(owner = "client!ss", name = "u", descriptor = "Z")
	private boolean aBoolean626;

	@OriginalMember(owner = "client!ss", name = "w", descriptor = "Lclient!uk;")
	private final Class331 aClass331_7;

	@OriginalMember(owner = "client!ss", name = "r", descriptor = "Z")
	private final boolean aBoolean625;

	@OriginalMember(owner = "client!ss", name = "v", descriptor = "Lclient!aw;")
	private Class21 aClass21_1;

	@OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(Lclient!hp;Lclient!pu;Lclient!uk;)V")
	public Class34_Sub10(@OriginalArg(0) Class134_Sub1_Sub1 arg0, @OriginalArg(1) Class270 arg1, @OriginalArg(2) Class331 arg2) {
		super(arg0);
		this.aClass331_7 = arg2;
		if (arg1 != null && arg0.aBoolean304 && arg0.aBoolean301) {
			@Pc(27) Class234 local27 = Static61.method1093(35633, arg1.method5706("environment_mapped_water_v", "gl"), arg0);
			@Pc(37) Class234 local37 = Static61.method1093(35632, arg1.method5706("environment_mapped_water_f", "gl"), arg0);
			this.aClass21_1 = Static35.method480(arg0, new Class234[] { local27, local37 });
			this.aBoolean625 = this.aClass21_1 != null && this.aClass331_7.method7301();
		} else {
			this.aBoolean625 = false;
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Z)V")
	@Override
	public void method7006() {
		if (!this.aBoolean626) {
			return;
		}
		super.aClass134_Sub1_21.method6788(1);
		super.aClass134_Sub1_21.method6766(null);
		super.aClass134_Sub1_21.method6788(0);
		super.aClass134_Sub1_21.method6766(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean626 = false;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(III)V")
	@Override
	public void method7020(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean626) {
			return;
		}
		@Pc(17) int local17 = 0x1 << (arg1 & 0x3);
		@Pc(28) float local28 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(32) int local32 = arg0 & 0xFFFF;
		@Pc(41) float local41 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(45) long local45 = this.aClass21_1.aLong20;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local45, "time"), (float) (local17 * super.aClass134_Sub1_21.anInt8444 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local45, "scale"), local28);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local45, "breakWaterDepth"), (float) local32);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local45, "breakWaterOffset"), local41);
	}

	@OriginalMember(owner = "client!ss", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method7017() {
		return this.aBoolean625;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7009(@OriginalArg(0) boolean arg0) {
		@Pc(15) Interface8 local15 = super.aClass134_Sub1_21.method6802();
		if (!this.aBoolean625 || local15 == null) {
			return;
		}
		super.aClass134_Sub1_21.method6788(1);
		super.aClass134_Sub1_21.method6766(local15);
		super.aClass134_Sub1_21.method6788(0);
		super.aClass134_Sub1_21.method6766(this.aClass331_7.anInterface11_1);
		@Pc(48) long local48 = this.aClass21_1.aLong20;
		OpenGL.glUseProgramObjectARB(local48);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local48, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local48, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local48, "sunDir"), super.aClass134_Sub1_21.aFloatArray47[0], -super.aClass134_Sub1_21.aFloatArray47[1], -super.aClass134_Sub1_21.aFloatArray47[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local48, "sunColour"), super.aClass134_Sub1_21.aFloat189, super.aClass134_Sub1_21.bf, super.aClass134_Sub1_21.aFloat195, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local48, "sunExponent"), Math.abs(super.aClass134_Sub1_21.aFloatArray47[1]) * 928.0F + 96.0F);
		this.aBoolean626 = true;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lclient!bb;II)V")
	@Override
	public void method7011(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean626) {
			super.aClass134_Sub1_21.method6766(arg0);
			super.aClass134_Sub1_21.method6724(arg1);
		}
	}

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "(ZI)V")
	@Override
	public void method7016(@OriginalArg(0) boolean arg0) {
	}
}
