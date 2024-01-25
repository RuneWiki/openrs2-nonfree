import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class4_Sub10 extends Class4 {

	@OriginalMember(owner = "client!ud", name = "o", descriptor = "Z")
	private boolean aBoolean680;

	@OriginalMember(owner = "client!ud", name = "y", descriptor = "Lclient!gaa;")
	private final Class123 aClass123_7;

	@OriginalMember(owner = "client!ud", name = "r", descriptor = "Z")
	private final boolean aBoolean681;

	@OriginalMember(owner = "client!ud", name = "v", descriptor = "Lclient!jd;")
	private Class174 aClass174_1;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lclient!sha;Lclient!uq;Lclient!gaa;)V")
	public Class4_Sub10(@OriginalArg(0) Class95_Sub1_Sub1 arg0, @OriginalArg(1) Class362 arg1, @OriginalArg(2) Class123 arg2) {
		super(arg0);
		this.aClass123_7 = arg2;
		if (arg1 != null && arg0.aBoolean625 && arg0.aBoolean622) {
			@Pc(27) Class224 local27 = Static134.method2251(arg1.method8369("environment_mapped_water_v", "gl"), arg0, 35633);
			@Pc(37) Class224 local37 = Static134.method2251(arg1.method8369("environment_mapped_water_f", "gl"), arg0, 35632);
			this.aClass174_1 = Static589.method7799(new Class224[] { local27, local37 }, arg0);
			this.aBoolean681 = this.aClass174_1 != null && this.aClass123_7.method2907();
		} else {
			this.aBoolean681 = false;
		}
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8493() {
		return this.aBoolean681;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)V")
	@Override
	public void method8483(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean680) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg1 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg0 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(36) long local36 = this.aClass174_1.aLong129;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "time"), (float) (local8 * super.aClass95_Sub1_23.anInt10064 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "scale"), local19);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "breakWaterOffset"), local32);
	}

	@OriginalMember(owner = "client!ud", name = "g", descriptor = "(I)V")
	@Override
	public void method8494() {
		if (!this.aBoolean680) {
			return;
		}
		super.aClass95_Sub1_23.method8153(1);
		super.aClass95_Sub1_23.method8147((Interface1) null);
		super.aClass95_Sub1_23.method8153(0);
		super.aClass95_Sub1_23.method8147((Interface1) null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean680 = false;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZLclient!b;I)V")
	@Override
	public void method8484(@OriginalArg(1) Interface1 arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean680) {
			super.aClass95_Sub1_23.method8147(arg0);
			super.aClass95_Sub1_23.method8129(arg1);
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8481(@OriginalArg(1) boolean arg0) {
		@Pc(14) Interface7 local14 = super.aClass95_Sub1_23.method8120();
		if (!this.aBoolean681 || local14 == null) {
			return;
		}
		super.aClass95_Sub1_23.method8153(1);
		super.aClass95_Sub1_23.method8147(local14);
		super.aClass95_Sub1_23.method8153(0);
		super.aClass95_Sub1_23.method8147(this.aClass123_7.anInterface20_2);
		@Pc(45) long local45 = this.aClass174_1.aLong129;
		OpenGL.glUseProgramObjectARB(local45);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local45, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local45, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local45, "sunDir"), -super.aClass95_Sub1_23.aFloatArray64[0], -super.aClass95_Sub1_23.aFloatArray64[1], -super.aClass95_Sub1_23.aFloatArray64[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local45, "sunColour"), super.aClass95_Sub1_23.aFloat193, super.aClass95_Sub1_23.aFloat200, super.aClass95_Sub1_23.aFloat192, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local45, "sunExponent"), Math.abs(super.aClass95_Sub1_23.aFloatArray64[1]) * 928.0F + 96.0F);
		this.aBoolean680 = true;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8482(@OriginalArg(1) boolean arg0) {
	}
}
