import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hia")
public final class Class74_Sub4 extends Class74 {

	@OriginalMember(owner = "client!hia", name = "q", descriptor = "Z")
	private boolean aBoolean365;

	@OriginalMember(owner = "client!hia", name = "u", descriptor = "Lclient!wv;")
	private final Class378 aClass378_4;

	@OriginalMember(owner = "client!hia", name = "t", descriptor = "Z")
	private final boolean aBoolean366;

	@OriginalMember(owner = "client!hia", name = "w", descriptor = "Lclient!pga;")
	private Class258 aClass258_1;

	@OriginalMember(owner = "client!hia", name = "<init>", descriptor = "(Lclient!eea;Lclient!eq;Lclient!wv;)V")
	public Class74_Sub4(@OriginalArg(0) Class87_Sub1_Sub1 arg0, @OriginalArg(1) Class97 arg1, @OriginalArg(2) Class378 arg2) {
		super(arg0);
		this.aClass378_4 = arg2;
		if (arg1 != null && arg0.aBoolean235 && arg0.aBoolean236) {
			@Pc(27) Class154 local27 = Static11.method283(arg0, arg1.method2567("environment_mapped_water_v", "gl"), 35633);
			@Pc(37) Class154 local37 = Static11.method283(arg0, arg1.method2567("environment_mapped_water_f", "gl"), 35632);
			this.aClass258_1 = Static249.method4060(new Class154[] { local27, local37 }, arg0);
			this.aBoolean366 = this.aClass258_1 != null && this.aClass378_4.method8582();
		} else {
			this.aBoolean366 = false;
		}
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8253(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(III)V")
	@Override
	public void method8243(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean365) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg0 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg1 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(36) long local36 = this.aClass258_1.aLong217;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "time"), (float) (super.aClass87_Sub1_22.anInt6123 * local8 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "scale"), local19);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "breakWaterOffset"), local32);
	}

	@OriginalMember(owner = "client!hia", name = "c", descriptor = "(I)V")
	@Override
	public void method8249() {
		if (!this.aBoolean365) {
			return;
		}
		super.aClass87_Sub1_22.method5116(1);
		super.aClass87_Sub1_22.method5079(null);
		super.aClass87_Sub1_22.method5116(0);
		super.aClass87_Sub1_22.method5079(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean365 = false;
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8245() {
		return this.aBoolean366;
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8251(@OriginalArg(0) boolean arg0) {
		@Pc(8) Interface22 local8 = super.aClass87_Sub1_22.method5123();
		if (!this.aBoolean366 || local8 == null) {
			return;
		}
		super.aClass87_Sub1_22.method5116(1);
		super.aClass87_Sub1_22.method5079(local8);
		super.aClass87_Sub1_22.method5116(0);
		super.aClass87_Sub1_22.method5079(this.aClass378_4.anInterface11_2);
		@Pc(47) long local47 = this.aClass258_1.aLong217;
		OpenGL.glUseProgramObjectARB(local47);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local47, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local47, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local47, "sunDir"), -super.aClass87_Sub1_22.aFloatArray52[0], -super.aClass87_Sub1_22.aFloatArray52[1], -super.aClass87_Sub1_22.aFloatArray52[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local47, "sunColour"), super.aClass87_Sub1_22.aFloat137, super.aClass87_Sub1_22.aFloat147, super.aClass87_Sub1_22.aFloat148, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local47, "sunExponent"), Math.abs(super.aClass87_Sub1_22.aFloatArray52[1]) * 928.0F + 96.0F);
		this.aBoolean365 = true;
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(ILclient!du;I)V")
	@Override
	public void method8250(@OriginalArg(1) Interface7 arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean365) {
			super.aClass87_Sub1_22.method5079(arg0);
			super.aClass87_Sub1_22.method5062(arg1);
		}
	}
}
