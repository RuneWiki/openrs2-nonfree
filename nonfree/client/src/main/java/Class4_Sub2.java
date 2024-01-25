import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dca")
public final class Class4_Sub2 extends Class4 {

	@OriginalMember(owner = "client!dca", name = "u", descriptor = "Z")
	private boolean aBoolean140;

	@OriginalMember(owner = "client!dca", name = "m", descriptor = "Lclient!lja;")
	private final Class202 aClass202_2;

	@OriginalMember(owner = "client!dca", name = "l", descriptor = "Lclient!os;")
	private Class261 aClass261_1;

	@OriginalMember(owner = "client!dca", name = "t", descriptor = "Z")
	private final boolean aBoolean139;

	@OriginalMember(owner = "client!dca", name = "<init>", descriptor = "(Lclient!pa;Lclient!aj;Lclient!lja;)V")
	public Class4_Sub2(@OriginalArg(0) Class13_Sub1_Sub1 arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(2) Class202 arg2) {
		super(arg0);
		this.aClass202_2 = arg2;
		if (arg1 != null && arg0.aBoolean545 && arg0.aBoolean547) {
			@Pc(23) Class281 local23 = Static138.method2537(35633, arg1.method533("gl", "environment_mapped_water_v"), arg0);
			@Pc(33) Class281 local33 = Static138.method2537(35632, arg1.method533("gl", "environment_mapped_water_f"), arg0);
			this.aClass261_1 = Static671.method9331(new Class281[] { local23, local33 }, arg0);
			this.aBoolean139 = this.aClass261_1 != null && this.aClass202_2.method5176();
		} else {
			this.aBoolean139 = false;
		}
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(IBLclient!bm;)V")
	@Override
	public void method7859(@OriginalArg(0) int arg0, @OriginalArg(2) Interface3 arg1) {
		if (!this.aBoolean140) {
			super.aClass13_Sub1_23.method7530(arg1);
			super.aClass13_Sub1_23.method7509(arg0);
		}
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7852(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7848() {
		return this.aBoolean139;
	}

	@OriginalMember(owner = "client!dca", name = "f", descriptor = "(B)V")
	@Override
	public void method7858() {
		if (!this.aBoolean140) {
			return;
		}
		super.aClass13_Sub1_23.method7461(1);
		super.aClass13_Sub1_23.method7530((Interface3) null);
		super.aClass13_Sub1_23.method7461(0);
		super.aClass13_Sub1_23.method7530((Interface3) null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean140 = false;
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7856(@OriginalArg(0) boolean arg0) {
		@Pc(14) Interface10 local14 = super.aClass13_Sub1_23.method7529();
		if (!this.aBoolean139 || local14 == null) {
			return;
		}
		super.aClass13_Sub1_23.method7461(1);
		super.aClass13_Sub1_23.method7530(local14);
		super.aClass13_Sub1_23.method7461(0);
		super.aClass13_Sub1_23.method7530(this.aClass202_2.anInterface21_1);
		@Pc(45) long local45 = this.aClass261_1.aLong221;
		OpenGL.glUseProgramObjectARB(local45);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local45, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local45, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local45, "sunDir"), -super.aClass13_Sub1_23.aFloatArray72[0], -super.aClass13_Sub1_23.aFloatArray72[1], -super.aClass13_Sub1_23.aFloatArray72[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local45, "sunColour"), super.aClass13_Sub1_23.aFloat176, super.aClass13_Sub1_23.aFloat187, super.aClass13_Sub1_23.aFloat181, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local45, "sunExponent"), Math.abs(super.aClass13_Sub1_23.aFloatArray72[1]) * 928.0F + 96.0F);
		this.aBoolean140 = true;
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method7849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean140) {
			return;
		}
		@Pc(16) int local16 = 0x1 << (arg0 & 0x3);
		@Pc(27) float local27 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(31) int local31 = arg1 & 0xFFFF;
		@Pc(40) float local40 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(44) long local44 = this.aClass261_1.aLong221;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local44, "time"), (float) (super.aClass13_Sub1_23.anInt8613 * local16 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local44, "scale"), local27);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local44, "breakWaterDepth"), (float) local31);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local44, "breakWaterOffset"), local40);
	}
}
