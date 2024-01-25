import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uq")
public final class Class31_Sub11 extends Class31 {

	@OriginalMember(owner = "client!uq", name = "o", descriptor = "Z")
	private boolean aBoolean718;

	@OriginalMember(owner = "client!uq", name = "u", descriptor = "Lclient!ui;")
	private final Class353 aClass353_8;

	@OriginalMember(owner = "client!uq", name = "l", descriptor = "Z")
	private final boolean aBoolean717;

	@OriginalMember(owner = "client!uq", name = "q", descriptor = "Lclient!gl;")
	private Class128 aClass128_1;

	@OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(Lclient!ko;Lclient!wia;Lclient!ui;)V")
	public Class31_Sub11(@OriginalArg(0) Class137_Sub1_Sub1 arg0, @OriginalArg(1) Class386 arg1, @OriginalArg(2) Class353 arg2) {
		super(arg0);
		this.aClass353_8 = arg2;
		if (arg1 != null && arg0.aBoolean403 && arg0.aBoolean400) {
			@Pc(27) Class82 local27 = Static593.method8427(arg1.method9219("environment_mapped_water_v", "gl"), arg0, 35633);
			@Pc(37) Class82 local37 = Static593.method8427(arg1.method9219("environment_mapped_water_f", "gl"), arg0, 35632);
			this.aClass128_1 = Static33.method781(new Class82[] { local27, local37 }, arg0);
			this.aBoolean717 = this.aClass128_1 != null && this.aClass353_8.method8489();
		} else {
			this.aBoolean717 = false;
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)V")
	@Override
	public void method8591() {
		if (!this.aBoolean718) {
			return;
		}
		super.aClass137_Sub1_22.method8081(1);
		super.aClass137_Sub1_22.method8007((Interface15) null);
		super.aClass137_Sub1_22.method8081(0);
		super.aClass137_Sub1_22.method8007((Interface15) null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean718 = false;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8595(@OriginalArg(1) boolean arg0) {
		@Pc(12) Interface16 local12 = super.aClass137_Sub1_22.method8046();
		if (!this.aBoolean717 || local12 == null) {
			return;
		}
		super.aClass137_Sub1_22.method8081(1);
		super.aClass137_Sub1_22.method8007(local12);
		super.aClass137_Sub1_22.method8081(0);
		super.aClass137_Sub1_22.method8007(this.aClass353_8.anInterface9_2);
		@Pc(43) long local43 = this.aClass128_1.aLong107;
		OpenGL.glUseProgramObjectARB(local43);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local43, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local43, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local43, "sunDir"), -super.aClass137_Sub1_22.aFloatArray72[0], -super.aClass137_Sub1_22.aFloatArray72[1], -super.aClass137_Sub1_22.aFloatArray72[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local43, "sunColour"), super.aClass137_Sub1_22.aFloat250, super.aClass137_Sub1_22.aFloat245, super.aClass137_Sub1_22.aFloat246, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local43, "sunExponent"), Math.abs(super.aClass137_Sub1_22.aFloatArray72[1]) * 928.0F + 96.0F);
		this.aBoolean718 = true;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(BILclient!kja;)V")
	@Override
	public void method8588(@OriginalArg(1) int arg0, @OriginalArg(2) Interface15 arg1) {
		if (!this.aBoolean718) {
			super.aClass137_Sub1_22.method8007(arg1);
			super.aClass137_Sub1_22.method8078(arg0);
		}
	}

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8593() {
		return this.aBoolean717;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8592(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IBI)V")
	@Override
	public void method8587(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean718) {
			return;
		}
		@Pc(12) int local12 = 0x1 << (arg0 & 0x3);
		@Pc(23) float local23 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(27) int local27 = arg1 & 0xFFFF;
		@Pc(36) float local36 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(40) long local40 = this.aClass128_1.aLong107;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "time"), (float) (local12 * super.aClass137_Sub1_22.anInt9719 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "scale"), local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "breakWaterDepth"), (float) local27);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "breakWaterOffset"), local36);
	}
}
