import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nca")
public final class Class7_Sub5 extends Class7 {

	@OriginalMember(owner = "client!nca", name = "x", descriptor = "Z")
	private boolean aBoolean429;

	@OriginalMember(owner = "client!nca", name = "u", descriptor = "Lclient!jo;")
	private final Class174 aClass174_2;

	@OriginalMember(owner = "client!nca", name = "q", descriptor = "Lclient!wga;")
	private Class373 aClass373_1;

	@OriginalMember(owner = "client!nca", name = "v", descriptor = "Z")
	private final boolean aBoolean428;

	@OriginalMember(owner = "client!nca", name = "<init>", descriptor = "(Lclient!sb;Lclient!wu;Lclient!jo;)V")
	public Class7_Sub5(@OriginalArg(0) Class95_Sub3_Sub2 arg0, @OriginalArg(1) Class380 arg1, @OriginalArg(2) Class174 arg2) {
		super(arg0);
		this.aClass174_2 = arg2;
		if (arg1 != null && arg0.aBoolean641 && arg0.aBoolean645) {
			@Pc(23) Class176 local23 = Static72.method1001(arg1.method8628("environment_mapped_water_v", "gl"), arg0, 35633);
			@Pc(33) Class176 local33 = Static72.method1001(arg1.method8628("environment_mapped_water_f", "gl"), arg0, 35632);
			this.aClass373_1 = Static409.method5496(arg0, new Class176[] { local23, local33 });
			this.aBoolean428 = this.aClass373_1 != null && this.aClass174_2.method3799();
		} else {
			this.aBoolean428 = false;
		}
	}

	@OriginalMember(owner = "client!nca", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method8135() {
		return this.aBoolean428;
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8120(@OriginalArg(1) boolean arg0) {
		@Pc(14) Interface23 local14 = super.aClass95_Sub3_23.method7055();
		if (!this.aBoolean428 || local14 == null) {
			return;
		}
		super.aClass95_Sub3_23.method7145(1);
		super.aClass95_Sub3_23.method7112(local14);
		super.aClass95_Sub3_23.method7145(0);
		super.aClass95_Sub3_23.method7112(this.aClass174_2.anInterface5_1);
		@Pc(45) long local45 = this.aClass373_1.aLong276;
		OpenGL.glUseProgramObjectARB(local45);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local45, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local45, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local45, "sunDir"), -super.aClass95_Sub3_23.aFloatArray72[0], -super.aClass95_Sub3_23.aFloatArray72[1], -super.aClass95_Sub3_23.aFloatArray72[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local45, "sunColour"), super.aClass95_Sub3_23.aFloat183, super.aClass95_Sub3_23.aFloat172, super.aClass95_Sub3_23.aFloat181, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local45, "sunExponent"), Math.abs(super.aClass95_Sub3_23.aFloatArray72[1]) * 928.0F + 96.0F);
		this.aBoolean429 = true;
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method8128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean429) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg0 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg1 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(36) long local36 = this.aClass373_1.aLong276;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "time"), (float) (super.aClass95_Sub3_23.anInt8347 * local8 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "scale"), local19);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "breakWaterOffset"), local32);
	}

	@OriginalMember(owner = "client!nca", name = "b", descriptor = "(I)V")
	@Override
	public void method8127() {
		if (!this.aBoolean429) {
			return;
		}
		super.aClass95_Sub3_23.method7145(1);
		super.aClass95_Sub3_23.method7112(null);
		super.aClass95_Sub3_23.method7145(0);
		super.aClass95_Sub3_23.method7112(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean429 = false;
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(IILclient!lo;)V")
	@Override
	public void method8126(@OriginalArg(0) int arg0, @OriginalArg(2) Interface17 arg1) {
		if (!this.aBoolean429) {
			super.aClass95_Sub3_23.method7112(arg1);
			super.aClass95_Sub3_23.method7026(arg0);
		}
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8125(@OriginalArg(1) boolean arg0) {
	}
}
