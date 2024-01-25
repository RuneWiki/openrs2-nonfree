import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class Class2_Sub4 extends Class2 {

	@OriginalMember(owner = "client!kk", name = "x", descriptor = "Z")
	private boolean aBoolean379;

	@OriginalMember(owner = "client!kk", name = "u", descriptor = "Lclient!st;")
	private final Class315 aClass315_5;

	@OriginalMember(owner = "client!kk", name = "p", descriptor = "Z")
	private final boolean aBoolean378;

	@OriginalMember(owner = "client!kk", name = "l", descriptor = "Lclient!gda;")
	private Class112 aClass112_1;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lclient!tba;Lclient!sea;Lclient!st;)V")
	public Class2_Sub4(@OriginalArg(0) Class78_Sub1_Sub2 arg0, @OriginalArg(1) Class308 arg1, @OriginalArg(2) Class315 arg2) {
		super(arg0);
		this.aClass315_5 = arg2;
		if (arg1 != null && arg0.aBoolean654 && arg0.aBoolean651) {
			@Pc(27) Class327 local27 = Static44.method756(35633, arg1.method6557("environment_mapped_water_v", "gl"), arg0);
			@Pc(37) Class327 local37 = Static44.method756(35632, arg1.method6557("environment_mapped_water_f", "gl"), arg0);
			this.aClass112_1 = Static390.method7711(new Class327[] { local27, local37 }, arg0);
			this.aBoolean378 = this.aClass112_1 != null && this.aClass315_5.method6725();
		} else {
			this.aBoolean378 = false;
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIB)V")
	@Override
	public void method7897(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean379) {
			return;
		}
		@Pc(12) int local12 = 0x1 << (arg1 & 0x3);
		@Pc(23) float local23 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(27) int local27 = arg0 & 0xFFFF;
		@Pc(36) float local36 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(40) long local40 = this.aClass112_1.aLong81;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "time"), (float) (super.aClass78_Sub1_23.anInt8564 * local12 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "scale"), local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "breakWaterDepth"), (float) local27);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "breakWaterOffset"), local36);
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method7902() {
		return this.aBoolean378;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(ILclient!rga;I)V")
	@Override
	public void method7892(@OriginalArg(0) int arg0, @OriginalArg(1) Interface20 arg1) {
		if (!this.aBoolean379) {
			super.aClass78_Sub1_23.method6931(arg1);
			super.aClass78_Sub1_23.method6943(arg0);
		}
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(ZI)V")
	@Override
	public void method7901(@OriginalArg(0) boolean arg0) {
		@Pc(8) Interface11 local8 = super.aClass78_Sub1_23.method6861();
		if (!this.aBoolean378 || local8 == null) {
			return;
		}
		super.aClass78_Sub1_23.method6867(1);
		super.aClass78_Sub1_23.method6931(local8);
		super.aClass78_Sub1_23.method6867(0);
		super.aClass78_Sub1_23.method6931(this.aClass315_5.anInterface21_1);
		@Pc(39) long local39 = this.aClass112_1.aLong81;
		OpenGL.glUseProgramObjectARB(local39);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local39, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local39, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local39, "sunDir"), super.aClass78_Sub1_23.aFloatArray72[0], -super.aClass78_Sub1_23.aFloatArray72[1], -super.aClass78_Sub1_23.aFloatArray72[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local39, "sunColour"), super.aClass78_Sub1_23.aFloat215, super.aClass78_Sub1_23.aFloat220, super.aClass78_Sub1_23.aFloat214, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local39, "sunExponent"), Math.abs(super.aClass78_Sub1_23.aFloatArray72[1]) * 928.0F + 96.0F);
		this.aBoolean379 = true;
	}

	@OriginalMember(owner = "client!kk", name = "d", descriptor = "(I)V")
	@Override
	public void method7899() {
		if (!this.aBoolean379) {
			return;
		}
		super.aClass78_Sub1_23.method6867(1);
		super.aClass78_Sub1_23.method6931(null);
		super.aClass78_Sub1_23.method6867(0);
		super.aClass78_Sub1_23.method6931(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean379 = false;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7894(@OriginalArg(0) boolean arg0) {
	}
}
