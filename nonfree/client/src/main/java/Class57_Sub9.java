import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class57_Sub9 extends Class57 {

	@OriginalMember(owner = "client!q", name = "C", descriptor = "Z")
	private boolean aBoolean651;

	@OriginalMember(owner = "client!q", name = "D", descriptor = "Lclient!mt;")
	private final Class211 aClass211_8;

	@OriginalMember(owner = "client!q", name = "G", descriptor = "Lclient!fg;")
	private Class98 aClass98_1;

	@OriginalMember(owner = "client!q", name = "n", descriptor = "Z")
	private final boolean aBoolean649;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lclient!hl;Lclient!ni;Lclient!mt;)V")
	public Class57_Sub9(@OriginalArg(0) Class5_Sub2_Sub2 arg0, @OriginalArg(1) Class223 arg1, @OriginalArg(2) Class211 arg2) {
		super(arg0);
		this.aClass211_8 = arg2;
		if (arg1 != null && arg0.aBoolean401 && arg0.aBoolean403) {
			@Pc(23) Class246 local23 = Static552.method7750(arg1.method5948("gl", "environment_mapped_water_v"), arg0, 35633);
			@Pc(33) Class246 local33 = Static552.method7750(arg1.method5948("gl", "environment_mapped_water_f"), arg0, 35632);
			this.aClass98_1 = Static373.method5922(arg0, new Class246[] { local23, local33 });
			this.aBoolean649 = this.aClass98_1 != null && this.aClass211_8.method5821();
		} else {
			this.aBoolean649 = false;
		}
	}

	@OriginalMember(owner = "client!q", name = "c", descriptor = "(I)V")
	@Override
	public void method8703() {
		if (!this.aBoolean651) {
			return;
		}
		super.aClass5_Sub2_23.method3954(1);
		super.aClass5_Sub2_23.method4008((Interface4) null);
		super.aClass5_Sub2_23.method3954(0);
		super.aClass5_Sub2_23.method4008((Interface4) null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean651 = false;
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(IZ)V")
	@Override
	public void method8712(@OriginalArg(1) boolean arg0) {
		@Pc(14) Interface24 local14 = super.aClass5_Sub2_23.method3942();
		if (!this.aBoolean649 || local14 == null) {
			return;
		}
		super.aClass5_Sub2_23.method3954(1);
		super.aClass5_Sub2_23.method4008(local14);
		super.aClass5_Sub2_23.method3954(0);
		super.aClass5_Sub2_23.method4008(this.aClass211_8.anInterface11_2);
		@Pc(49) long local49 = this.aClass98_1.aLong93;
		OpenGL.glUseProgramObjectARB(local49);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local49, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local49, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local49, "sunDir"), -super.aClass5_Sub2_23.aFloatArray49[0], -super.aClass5_Sub2_23.aFloatArray49[1], -super.aClass5_Sub2_23.aFloatArray49[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local49, "sunColour"), super.aClass5_Sub2_23.aFloat98, super.aClass5_Sub2_23.aFloat89, super.aClass5_Sub2_23.bf, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local49, "sunExponent"), Math.abs(super.aClass5_Sub2_23.aFloatArray49[1]) * 928.0F + 96.0F);
		this.aBoolean651 = true;
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8709() {
		return this.aBoolean649;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8707(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(III)V")
	@Override
	public void method8710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean651) {
			return;
		}
		@Pc(12) int local12 = 0x1 << (arg0 & 0x3);
		@Pc(23) float local23 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(27) int local27 = arg1 & 0xFFFF;
		@Pc(36) float local36 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(40) long local40 = this.aClass98_1.aLong93;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "time"), (float) (local12 * super.aClass5_Sub2_23.anInt4859 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "scale"), local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "breakWaterDepth"), (float) local27);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "breakWaterOffset"), local36);
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IILclient!bl;)V")
	@Override
	public void method8706(@OriginalArg(1) int arg0, @OriginalArg(2) Interface4 arg1) {
		if (!this.aBoolean651) {
			super.aClass5_Sub2_23.method4008(arg1);
			super.aClass5_Sub2_23.method4018(arg0);
		}
	}
}
