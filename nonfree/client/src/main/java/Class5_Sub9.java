import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ot")
public final class Class5_Sub9 extends Class5 {

	@OriginalMember(owner = "client!ot", name = "s", descriptor = "Z")
	private boolean aBoolean531;

	@OriginalMember(owner = "client!ot", name = "q", descriptor = "Lclient!lj;")
	private final Class223 aClass223_7;

	@OriginalMember(owner = "client!ot", name = "n", descriptor = "Z")
	private final boolean aBoolean530;

	@OriginalMember(owner = "client!ot", name = "t", descriptor = "Lclient!nu;")
	private Class257 aClass257_1;

	@OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Lclient!md;Lclient!rg;Lclient!lj;)V")
	public Class5_Sub9(@OriginalArg(0) Class144_Sub1_Sub2 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class223 arg2) {
		super(arg0);
		this.aClass223_7 = arg2;
		if (arg1 != null && arg0.aBoolean468 && arg0.aBoolean469) {
			@Pc(34) Class66 local34 = Static385.method5888(arg0, arg1.method7801("environment_mapped_water_v", "gl"), 35633);
			@Pc(48) Class66 local48 = Static385.method5888(arg0, arg1.method7801("environment_mapped_water_f", "gl"), 35632);
			this.aClass257_1 = Static121.method1912(new Class66[] { local34, local48 }, arg0);
			this.aBoolean530 = this.aClass257_1 != null && this.aClass223_7.method5332();
		} else {
			this.aBoolean530 = false;
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IZ)V")
	@Override
	public void method6873(@OriginalArg(1) boolean arg0) {
		@Pc(16) Interface20 local16 = super.aClass144_Sub1_20.method5727();
		if (!this.aBoolean530 || local16 == null) {
			return;
		}
		super.aClass144_Sub1_20.method5706(1);
		super.aClass144_Sub1_20.method5643(local16);
		super.aClass144_Sub1_20.method5706(0);
		super.aClass144_Sub1_20.method5643(this.aClass223_7.anInterface18_2);
		@Pc(49) long local49 = this.aClass257_1.aLong200;
		OpenGL.glUseProgramObjectARB(local49);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local49, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local49, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local49, "sunDir"), -super.aClass144_Sub1_20.aFloatArray51[0], -super.aClass144_Sub1_20.aFloatArray51[1], -super.aClass144_Sub1_20.aFloatArray51[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local49, "sunColour"), super.aClass144_Sub1_20.aFloat103, super.aClass144_Sub1_20.aFloat104, super.aClass144_Sub1_20.aFloat106, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local49, "sunExponent"), Math.abs(super.aClass144_Sub1_20.aFloatArray51[1]) * 928.0F + 96.0F);
		this.aBoolean531 = true;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IILclient!vi;)V")
	@Override
	public void method6877(@OriginalArg(0) int arg0, @OriginalArg(2) Interface25 arg1) {
		if (!this.aBoolean531) {
			super.aClass144_Sub1_20.method5643(arg1);
			super.aClass144_Sub1_20.method5723(arg0);
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(ZII)V")
	@Override
	public void method6864(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean531) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg0 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg1 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(36) long local36 = this.aClass257_1.aLong200;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "time"), (float) (local8 * super.aClass144_Sub1_20.anInt6502 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "scale"), local19);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "breakWaterOffset"), local32);
	}

	@OriginalMember(owner = "client!ot", name = "d", descriptor = "(I)V")
	@Override
	public void method6865() {
		if (!this.aBoolean531) {
			return;
		}
		super.aClass144_Sub1_20.method5706(1);
		super.aClass144_Sub1_20.method5643((Interface25) null);
		super.aClass144_Sub1_20.method5706(0);
		super.aClass144_Sub1_20.method5643((Interface25) null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean531 = false;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6878(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method6867() {
		return this.aBoolean530;
	}
}
