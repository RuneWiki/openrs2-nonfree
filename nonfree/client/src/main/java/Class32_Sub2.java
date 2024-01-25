import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!br")
public final class Class32_Sub2 extends Class32 {

	@OriginalMember(owner = "client!br", name = "l", descriptor = "Z")
	private boolean aBoolean57;

	@OriginalMember(owner = "client!br", name = "k", descriptor = "Lclient!oca;")
	private final Class247 aClass247_1;

	@OriginalMember(owner = "client!br", name = "q", descriptor = "Lclient!pt;")
	private Class276 aClass276_1;

	@OriginalMember(owner = "client!br", name = "m", descriptor = "Z")
	private final boolean aBoolean58;

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lclient!oaa;Lclient!ae;Lclient!oca;)V")
	public Class32_Sub2(@OriginalArg(0) Class132_Sub1_Sub1 arg0, @OriginalArg(1) Class8 arg1, @OriginalArg(2) Class247 arg2) {
		super(arg0);
		this.aClass247_1 = arg2;
		if (arg1 != null && arg0.aBoolean474 && arg0.aBoolean475) {
			@Pc(23) Class327 local23 = Static326.method4631(35633, arg0, arg1.method274("gl", "environment_mapped_water_v"));
			@Pc(33) Class327 local33 = Static326.method4631(35632, arg0, arg1.method274("gl", "environment_mapped_water_f"));
			this.aClass276_1 = Static585.method8099(new Class327[] { local23, local33 }, arg0);
			this.aBoolean58 = this.aClass276_1 != null && this.aClass247_1.method6209();
		} else {
			this.aBoolean58 = false;
		}
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8324() {
		return this.aBoolean58;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IILclient!ml;)V")
	@Override
	public void method8318(@OriginalArg(1) int arg0, @OriginalArg(2) Interface17 arg1) {
		if (!this.aBoolean57) {
			super.aClass132_Sub1_21.method7635(arg1);
			super.aClass132_Sub1_21.method7652(arg0);
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8316(@OriginalArg(1) boolean arg0) {
		@Pc(8) Interface9 local8 = super.aClass132_Sub1_21.method7630();
		if (!this.aBoolean58 || local8 == null) {
			return;
		}
		super.aClass132_Sub1_21.method7616(1);
		super.aClass132_Sub1_21.method7635(local8);
		super.aClass132_Sub1_21.method7616(0);
		super.aClass132_Sub1_21.method7635(this.aClass247_1.anInterface1_2);
		@Pc(39) long local39 = this.aClass276_1.aLong236;
		OpenGL.glUseProgramObjectARB(local39);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local39, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local39, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local39, "sunDir"), -super.aClass132_Sub1_21.aFloatArray63[0], -super.aClass132_Sub1_21.aFloatArray63[1], -super.aClass132_Sub1_21.aFloatArray63[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local39, "sunColour"), super.aClass132_Sub1_21.aFloat168, super.aClass132_Sub1_21.aFloat171, super.aClass132_Sub1_21.aFloat179, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local39, "sunExponent"), Math.abs(super.aClass132_Sub1_21.aFloatArray63[1]) * 928.0F + 96.0F);
		this.aBoolean57 = true;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(III)V")
	@Override
	public void method8322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean57) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg0 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg1 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(36) long local36 = this.aClass276_1.aLong236;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "time"), (float) (local8 * super.aClass132_Sub1_21.anInt9000 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "scale"), local19);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "breakWaterOffset"), local32);
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8315(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!br", name = "d", descriptor = "(I)V")
	@Override
	public void method8328() {
		if (!this.aBoolean57) {
			return;
		}
		super.aClass132_Sub1_21.method7616(1);
		super.aClass132_Sub1_21.method7635((Interface17) null);
		super.aClass132_Sub1_21.method7616(0);
		super.aClass132_Sub1_21.method7635((Interface17) null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean57 = false;
	}
}
