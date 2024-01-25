import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pr")
public final class Class56_Sub9 extends Class56 {

	@OriginalMember(owner = "client!pr", name = "A", descriptor = "Z")
	private boolean aBoolean556;

	@OriginalMember(owner = "client!pr", name = "G", descriptor = "Lclient!bd;")
	private final Class31 aClass31_7;

	@OriginalMember(owner = "client!pr", name = "E", descriptor = "Z")
	private final boolean aBoolean557;

	@OriginalMember(owner = "client!pr", name = "u", descriptor = "Lclient!dl;")
	private Class80 aClass80_1;

	@OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Lclient!lm;Lclient!pl;Lclient!bd;)V")
	public Class56_Sub9(@OriginalArg(0) Class100_Sub1_Sub2 arg0, @OriginalArg(1) Class259 arg1, @OriginalArg(2) Class31 arg2) {
		super(arg0);
		this.aClass31_7 = arg2;
		if (arg1 != null && arg0.aBoolean469 && arg0.aBoolean464) {
			@Pc(27) Class46 local27 = Static91.method1447(35633, arg1.method5965("gl", "environment_mapped_water_v"), arg0);
			@Pc(37) Class46 local37 = Static91.method1447(35632, arg1.method5965("gl", "environment_mapped_water_f"), arg0);
			this.aClass80_1 = Static350.method5217(new Class46[] { local27, local37 }, arg0);
			this.aBoolean557 = this.aClass80_1 != null && this.aClass31_7.method544();
		} else {
			this.aBoolean557 = false;
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(IIB)V")
	@Override
	public void method7182(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean556) {
			return;
		}
		@Pc(12) int local12 = 0x1 << (arg0 & 0x3);
		@Pc(23) float local23 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(27) int local27 = arg1 & 0xFFFF;
		@Pc(36) float local36 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(40) long local40 = this.aClass80_1.aLong58;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "time"), (float) (super.aClass100_Sub1_23.anInt5768 * local12 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "scale"), local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "breakWaterDepth"), (float) local27);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "breakWaterOffset"), local36);
	}

	@OriginalMember(owner = "client!pr", name = "d", descriptor = "(I)V")
	@Override
	public void method7183() {
		if (!this.aBoolean556) {
			return;
		}
		super.aClass100_Sub1_23.method4860(1);
		super.aClass100_Sub1_23.method4876(null);
		super.aClass100_Sub1_23.method4860(0);
		super.aClass100_Sub1_23.method4876(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean556 = false;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7171(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7174(@OriginalArg(1) boolean arg0) {
		@Pc(8) Interface20 local8 = super.aClass100_Sub1_23.method4845();
		if (!this.aBoolean557 || local8 == null) {
			return;
		}
		super.aClass100_Sub1_23.method4860(1);
		super.aClass100_Sub1_23.method4876(local8);
		super.aClass100_Sub1_23.method4860(0);
		super.aClass100_Sub1_23.method4876(this.aClass31_7.anInterface6_2);
		@Pc(39) long local39 = this.aClass80_1.aLong58;
		OpenGL.glUseProgramObjectARB(local39);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local39, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local39, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local39, "sunDir"), super.aClass100_Sub1_23.aFloatArray52[0], -super.aClass100_Sub1_23.aFloatArray52[1], -super.aClass100_Sub1_23.aFloatArray52[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local39, "sunColour"), super.aClass100_Sub1_23.aFloat152, super.aClass100_Sub1_23.aFloat161, super.aClass100_Sub1_23.aFloat156, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local39, "sunExponent"), Math.abs(super.aClass100_Sub1_23.aFloatArray52[1]) * 928.0F + 96.0F);
		this.aBoolean556 = true;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(IILclient!hfa;)V")
	@Override
	public void method7178(@OriginalArg(0) int arg0, @OriginalArg(2) Interface10 arg1) {
		if (!this.aBoolean556) {
			super.aClass100_Sub1_23.method4876(arg1);
			super.aClass100_Sub1_23.method4872(arg0);
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7172() {
		return this.aBoolean557;
	}
}
