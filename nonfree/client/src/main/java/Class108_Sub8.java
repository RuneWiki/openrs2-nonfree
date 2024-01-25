import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oq")
public final class Class108_Sub8 extends Class108 {

	@OriginalMember(owner = "client!oq", name = "B", descriptor = "Z")
	private boolean aBoolean590;

	@OriginalMember(owner = "client!oq", name = "v", descriptor = "Lclient!wda;")
	private final Class373 aClass373_6;

	@OriginalMember(owner = "client!oq", name = "E", descriptor = "Lclient!kga;")
	private Class187 aClass187_1;

	@OriginalMember(owner = "client!oq", name = "y", descriptor = "Z")
	private final boolean aBoolean589;

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(Lclient!laa;Lclient!wu;Lclient!wda;)V")
	public Class108_Sub8(@OriginalArg(0) Class126_Sub2_Sub1 arg0, @OriginalArg(1) Class384 arg1, @OriginalArg(2) Class373 arg2) {
		super(arg0);
		this.aClass373_6 = arg2;
		if (arg1 != null && arg0.aBoolean461 && arg0.aBoolean459) {
			@Pc(23) Class206 local23 = Static360.method5626(arg0, arg1.method8871("environment_mapped_water_v", "gl"), 35633);
			@Pc(33) Class206 local33 = Static360.method5626(arg0, arg1.method8871("environment_mapped_water_f", "gl"), 35632);
			this.aClass187_1 = Static96.method1447(arg0, new Class206[] { local23, local33 });
			this.aBoolean589 = this.aClass187_1 != null && this.aClass373_6.method8671();
		} else {
			this.aBoolean589 = false;
		}
	}

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "(Z)V")
	@Override
	public void method8708() {
		if (!this.aBoolean590) {
			return;
		}
		super.aClass126_Sub2_23.method5560(1);
		super.aClass126_Sub2_23.method5449((Interface27) null);
		super.aClass126_Sub2_23.method5560(0);
		super.aClass126_Sub2_23.method5449((Interface27) null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean590 = false;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8702(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(Lclient!wc;IB)V")
	@Override
	public void method8709(@OriginalArg(0) Interface27 arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean590) {
			super.aClass126_Sub2_23.method5449(arg0);
			super.aClass126_Sub2_23.method5513(arg1);
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8710(@OriginalArg(1) boolean arg0) {
		@Pc(8) Interface18 local8 = super.aClass126_Sub2_23.method5494();
		if (!this.aBoolean589 || local8 == null) {
			return;
		}
		super.aClass126_Sub2_23.method5560(1);
		super.aClass126_Sub2_23.method5449(local8);
		super.aClass126_Sub2_23.method5560(0);
		super.aClass126_Sub2_23.method5449(this.aClass373_6.anInterface19_1);
		@Pc(39) long local39 = this.aClass187_1.aLong145;
		OpenGL.glUseProgramObjectARB(local39);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local39, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local39, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local39, "sunDir"), -super.aClass126_Sub2_23.aFloatArray37[0], -super.aClass126_Sub2_23.aFloatArray37[1], -super.aClass126_Sub2_23.aFloatArray37[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local39, "sunColour"), super.aClass126_Sub2_23.aFloat122, super.aClass126_Sub2_23.aFloat129, super.aClass126_Sub2_23.aFloat126, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local39, "sunExponent"), Math.abs(super.aClass126_Sub2_23.aFloatArray37[1]) * 928.0F + 96.0F);
		this.aBoolean590 = true;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(III)V")
	@Override
	public void method8700(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean590) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg0 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg1 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(36) long local36 = this.aClass187_1.aLong145;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "time"), (float) (super.aClass126_Sub2_23.anInt6264 * local8 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "scale"), local19);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "breakWaterOffset"), local32);
	}

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8699() {
		return this.aBoolean589;
	}
}
