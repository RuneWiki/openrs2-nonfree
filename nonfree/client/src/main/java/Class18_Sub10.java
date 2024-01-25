import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wl")
public final class Class18_Sub10 extends Class18 {

	@OriginalMember(owner = "client!wl", name = "t", descriptor = "Z")
	private boolean aBoolean906;

	@OriginalMember(owner = "client!wl", name = "C", descriptor = "Lclient!jga;")
	private final Class179 aClass179_8;

	@OriginalMember(owner = "client!wl", name = "D", descriptor = "Lclient!hia;")
	private Class149 aClass149_1;

	@OriginalMember(owner = "client!wl", name = "y", descriptor = "Z")
	private final boolean aBoolean907;

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Lclient!jc;Lclient!wm;Lclient!jga;)V")
	public Class18_Sub10(@OriginalArg(0) Class65_Sub2_Sub2 arg0, @OriginalArg(1) Class390 arg1, @OriginalArg(2) Class179 arg2) {
		super(arg0);
		this.aClass179_8 = arg2;
		if (arg1 != null && arg0.aBoolean458 && arg0.aBoolean457) {
			@Pc(23) Class195 local23 = Static132.method2372(35633, arg0, arg1.method8917("gl", "environment_mapped_water_v"));
			@Pc(33) Class195 local33 = Static132.method2372(35632, arg0, arg1.method8917("gl", "environment_mapped_water_f"));
			this.aClass149_1 = Static465.method6639(new Class195[] { local23, local33 }, arg0);
			this.aBoolean907 = this.aClass149_1 != null && this.aClass179_8.method4544();
		} else {
			this.aBoolean907 = false;
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(ILclient!sfa;I)V")
	@Override
	public void method9006(@OriginalArg(0) int arg0, @OriginalArg(1) Interface25 arg1) {
		if (!this.aBoolean906) {
			super.aClass65_Sub2_23.method4426(arg1);
			super.aClass65_Sub2_23.method4405(arg0);
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IZ)V")
	@Override
	public void method9011(@OriginalArg(1) boolean arg0) {
		@Pc(12) Interface14 local12 = super.aClass65_Sub2_23.method4390();
		if (!this.aBoolean907 || local12 == null) {
			return;
		}
		super.aClass65_Sub2_23.method4358(1);
		super.aClass65_Sub2_23.method4426(local12);
		super.aClass65_Sub2_23.method4358(0);
		super.aClass65_Sub2_23.method4426(this.aClass179_8.anInterface10_2);
		@Pc(43) long local43 = this.aClass149_1.aLong98;
		OpenGL.glUseProgramObjectARB(local43);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local43, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local43, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local43, "sunDir"), -super.aClass65_Sub2_23.aFloatArray50[0], -super.aClass65_Sub2_23.aFloatArray50[1], -super.aClass65_Sub2_23.aFloatArray50[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local43, "sunColour"), super.aClass65_Sub2_23.aFloat106, super.aClass65_Sub2_23.aFloat107, super.aClass65_Sub2_23.aFloat112, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local43, "sunExponent"), Math.abs(super.aClass65_Sub2_23.aFloatArray50[1]) * 928.0F + 96.0F);
		this.aBoolean906 = true;
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)V")
	@Override
	public void method9003() {
		if (!this.aBoolean906) {
			return;
		}
		super.aClass65_Sub2_23.method4358(1);
		super.aClass65_Sub2_23.method4426((Interface25) null);
		super.aClass65_Sub2_23.method4358(0);
		super.aClass65_Sub2_23.method4426((Interface25) null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean906 = false;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method9009(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method9000() {
		return this.aBoolean907;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(BII)V")
	@Override
	public void method9012(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean906) {
			return;
		}
		@Pc(16) int local16 = 0x1 << (arg1 & 0x3);
		@Pc(27) float local27 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(31) int local31 = arg0 & 0xFFFF;
		@Pc(40) float local40 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(44) long local44 = this.aClass149_1.aLong98;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local44, "time"), (float) (local16 * super.aClass65_Sub2_23.anInt5266 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local44, "scale"), local27);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local44, "breakWaterDepth"), (float) local31);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local44, "breakWaterOffset"), local40);
	}
}
