import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class10_Sub1 extends Class10 {

	@OriginalMember(owner = "client!bh", name = "n", descriptor = "Z")
	private boolean aBoolean89;

	@OriginalMember(owner = "client!bh", name = "v", descriptor = "Lclient!ic;")
	private final Class172 aClass172_1;

	@OriginalMember(owner = "client!bh", name = "m", descriptor = "Lclient!mp;")
	private Class254 aClass254_1;

	@OriginalMember(owner = "client!bh", name = "w", descriptor = "Z")
	private final boolean aBoolean90;

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lclient!vaa;Lclient!ik;Lclient!ic;)V")
	public Class10_Sub1(@OriginalArg(0) Class22_Sub2_Sub2 arg0, @OriginalArg(1) Class182 arg1, @OriginalArg(2) Class172 arg2) {
		super(arg0);
		this.aClass172_1 = arg2;
		if (arg1 != null && arg0.aBoolean712 && arg0.aBoolean717) {
			@Pc(29) Class315 local29 = Static506.method6895(arg0, 35633, arg1.method3958("environment_mapped_water_v", "gl"));
			@Pc(43) Class315 local43 = Static506.method6895(arg0, 35632, arg1.method3958("environment_mapped_water_f", "gl"));
			this.aClass254_1 = Static340.method4860(arg0, new Class315[] { local29, local43 });
			this.aBoolean90 = this.aClass254_1 != null && this.aClass172_1.method3807();
		} else {
			this.aBoolean90 = false;
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9557() {
		return this.aBoolean90;
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(B)V")
	@Override
	public void method9549() {
		if (!this.aBoolean89) {
			return;
		}
		super.aClass22_Sub2_23.method8896(1);
		super.aClass22_Sub2_23.method8976((Interface21) null);
		super.aClass22_Sub2_23.method8896(0);
		super.aClass22_Sub2_23.method8976((Interface21) null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean89 = false;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!sc;II)V")
	@Override
	public void method9546(@OriginalArg(0) Interface21 arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean89) {
			super.aClass22_Sub2_23.method8976(arg0);
			super.aClass22_Sub2_23.method8853(arg1);
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZI)V")
	@Override
	public void method9558(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZB)V")
	@Override
	public void method9551(@OriginalArg(0) boolean arg0) {
		@Pc(17) Interface1 local17 = super.aClass22_Sub2_23.method8886();
		if (!this.aBoolean90 || local17 == null) {
			return;
		}
		super.aClass22_Sub2_23.method8896(1);
		super.aClass22_Sub2_23.method8976(local17);
		super.aClass22_Sub2_23.method8896(0);
		super.aClass22_Sub2_23.method8976(this.aClass172_1.anInterface19_2);
		@Pc(54) long local54 = this.aClass254_1.aLong220;
		OpenGL.glUseProgramObjectARB(local54);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local54, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local54, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local54, "sunDir"), -super.aClass22_Sub2_23.aFloatArray72[0], -super.aClass22_Sub2_23.aFloatArray72[1], -super.aClass22_Sub2_23.aFloatArray72[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local54, "sunColour"), super.aClass22_Sub2_23.aFloat186, super.aClass22_Sub2_23.aFloat178, super.aClass22_Sub2_23.aFloat185, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local54, "sunExponent"), Math.abs(super.aClass22_Sub2_23.aFloatArray72[1]) * 928.0F + 96.0F);
		this.aBoolean89 = true;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IBI)V")
	@Override
	public void method9552(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean89) {
			return;
		}
		@Pc(17) int local17 = 0x1 << (arg0 & 0x3);
		@Pc(28) float local28 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(32) int local32 = arg1 & 0xFFFF;
		@Pc(41) float local41 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(45) long local45 = this.aClass254_1.aLong220;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local45, "time"), (float) (super.aClass22_Sub2_23.anInt10466 * local17 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local45, "scale"), local28);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local45, "breakWaterDepth"), (float) local32);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local45, "breakWaterOffset"), local41);
	}
}
