import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jda")
public final class Class19_Sub5 extends Class19 {

	@OriginalMember(owner = "client!jda", name = "y", descriptor = "Z")
	private boolean aBoolean369;

	@OriginalMember(owner = "client!jda", name = "x", descriptor = "Lclient!ep;")
	private final Class96 aClass96_2;

	@OriginalMember(owner = "client!jda", name = "z", descriptor = "Lclient!jp;")
	private Class180 aClass180_1;

	@OriginalMember(owner = "client!jda", name = "u", descriptor = "Z")
	private final boolean aBoolean368;

	@OriginalMember(owner = "client!jda", name = "<init>", descriptor = "(Lclient!hj;Lclient!uu;Lclient!ep;)V")
	public Class19_Sub5(@OriginalArg(0) Class82_Sub3_Sub1 arg0, @OriginalArg(1) Class343 arg1, @OriginalArg(2) Class96 arg2) {
		super(arg0);
		this.aClass96_2 = arg2;
		if (arg1 != null && arg0.aBoolean327 && arg0.aBoolean322) {
			@Pc(23) Class382 local23 = Static185.method3035(35633, arg1.method8142("environment_mapped_water_v", "gl"), arg0);
			@Pc(33) Class382 local33 = Static185.method3035(35632, arg1.method8142("environment_mapped_water_f", "gl"), arg0);
			this.aClass180_1 = Static119.method2187(arg0, new Class382[] { local23, local33 });
			this.aBoolean368 = this.aClass180_1 != null && this.aClass96_2.method2364();
		} else {
			this.aBoolean368 = false;
		}
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8286(@OriginalArg(0) boolean arg0) {
		@Pc(8) Interface18 local8 = super.aClass82_Sub3_23.method4952();
		if (!this.aBoolean368 || local8 == null) {
			return;
		}
		super.aClass82_Sub3_23.method4946(1);
		super.aClass82_Sub3_23.method4972(local8);
		super.aClass82_Sub3_23.method4946(0);
		super.aClass82_Sub3_23.method4972(this.aClass96_2.anInterface20_2);
		@Pc(46) long local46 = this.aClass180_1.aLong143;
		OpenGL.glUseProgramObjectARB(local46);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local46, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local46, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local46, "sunDir"), -super.aClass82_Sub3_23.aFloatArray54[0], -super.aClass82_Sub3_23.aFloatArray54[1], -super.aClass82_Sub3_23.aFloatArray54[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local46, "sunColour"), super.aClass82_Sub3_23.aFloat137, super.aClass82_Sub3_23.aFloat135, super.aClass82_Sub3_23.aFloat124, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local46, "sunExponent"), Math.abs(super.aClass82_Sub3_23.aFloatArray54[1]) * 928.0F + 96.0F);
		this.aBoolean369 = true;
	}

	@OriginalMember(owner = "client!jda", name = "b", descriptor = "(Z)V")
	@Override
	public void method8277() {
		if (!this.aBoolean369) {
			return;
		}
		super.aClass82_Sub3_23.method4946(1);
		super.aClass82_Sub3_23.method4972((Interface10) null);
		super.aClass82_Sub3_23.method4946(0);
		super.aClass82_Sub3_23.method4972((Interface10) null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean369 = false;
	}

	@OriginalMember(owner = "client!jda", name = "b", descriptor = "(III)V")
	@Override
	public void method8281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean369) {
			return;
		}
		@Pc(16) int local16 = 0x1 << (arg1 & 0x3);
		@Pc(27) float local27 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(31) int local31 = arg0 & 0xFFFF;
		@Pc(40) float local40 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(44) long local44 = this.aClass180_1.aLong143;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local44, "time"), (float) (super.aClass82_Sub3_23.anInt5838 * local16 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local44, "scale"), local27);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local44, "breakWaterDepth"), (float) local31);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local44, "breakWaterOffset"), local40);
	}

	@OriginalMember(owner = "client!jda", name = "d", descriptor = "(Z)Z")
	@Override
	public boolean method8282() {
		return this.aBoolean368;
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(IILclient!hba;)V")
	@Override
	public void method8273(@OriginalArg(0) int arg0, @OriginalArg(2) Interface10 arg1) {
		if (!this.aBoolean369) {
			super.aClass82_Sub3_23.method4972(arg1);
			super.aClass82_Sub3_23.method5010(arg0);
		}
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8274(@OriginalArg(1) boolean arg0) {
	}
}
