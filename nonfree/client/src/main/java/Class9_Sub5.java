import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class9_Sub5 extends Class9 {

	@OriginalMember(owner = "client!cc", name = "t", descriptor = "Z")
	private boolean aBoolean122;

	@OriginalMember(owner = "client!cc", name = "y", descriptor = "Lclient!ob;")
	private final Class242 aClass242_5;

	@OriginalMember(owner = "client!cc", name = "s", descriptor = "Z")
	private final boolean aBoolean121;

	@OriginalMember(owner = "client!cc", name = "m", descriptor = "Lclient!ig;")
	private Class148 aClass148_1;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lclient!ad;Lclient!vo;Lclient!ob;)V")
	public Class9_Sub5(@OriginalArg(0) Class7_Sub1_Sub1 arg0, @OriginalArg(1) Class348 arg1, @OriginalArg(2) Class242 arg2) {
		super(arg0);
		this.aClass242_5 = arg2;
		if (arg1 != null && arg0.aBoolean72 && arg0.aBoolean76) {
			@Pc(27) Class304 local27 = Static441.method6507(arg1.method7956("environment_mapped_water_v", "gl"), 35633, arg0);
			@Pc(37) Class304 local37 = Static441.method6507(arg1.method7956("environment_mapped_water_f", "gl"), 35632, arg0);
			this.aClass148_1 = Static385.method5954(new Class304[] { local27, local37 }, arg0);
			this.aBoolean121 = this.aClass148_1 != null && this.aClass242_5.method5532();
		} else {
			this.aBoolean121 = false;
		}
	}

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8028() {
		return this.aBoolean121;
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V")
	@Override
	public void method8021() {
		if (!this.aBoolean122) {
			return;
		}
		super.aClass7_Sub1_23.method5746(1);
		super.aClass7_Sub1_23.method5694(null);
		super.aClass7_Sub1_23.method5746(0);
		super.aClass7_Sub1_23.method5694(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean122 = false;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)V")
	@Override
	public void method8033(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean122) {
			return;
		}
		@Pc(15) int local15 = 0x1 << (arg1 & 0x3);
		@Pc(26) float local26 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(30) int local30 = arg0 & 0xFFFF;
		@Pc(39) float local39 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(43) long local43 = this.aClass148_1.aLong117;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local43, "time"), (float) (super.aClass7_Sub1_23.anInt7377 * local15 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local43, "scale"), local26);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local43, "breakWaterDepth"), (float) local30);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local43, "breakWaterOffset"), local39);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!aj;II)V")
	@Override
	public void method8029(@OriginalArg(0) Interface1 arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean122) {
			super.aClass7_Sub1_23.method5694(arg0);
			super.aClass7_Sub1_23.method5757(arg1);
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8022(@OriginalArg(0) boolean arg0) {
		@Pc(16) Interface11 local16 = super.aClass7_Sub1_23.method5693();
		if (!this.aBoolean121 || local16 == null) {
			return;
		}
		super.aClass7_Sub1_23.method5746(1);
		super.aClass7_Sub1_23.method5694(local16);
		super.aClass7_Sub1_23.method5746(0);
		super.aClass7_Sub1_23.method5694(this.aClass242_5.anInterface23_1);
		@Pc(51) long local51 = this.aClass148_1.aLong117;
		OpenGL.glUseProgramObjectARB(local51);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local51, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local51, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local51, "sunDir"), super.aClass7_Sub1_23.aFloatArray54[0], -super.aClass7_Sub1_23.aFloatArray54[1], -super.aClass7_Sub1_23.aFloatArray54[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local51, "sunColour"), super.aClass7_Sub1_23.aFloat173, super.aClass7_Sub1_23.aFloat178, super.aClass7_Sub1_23.aFloat176, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local51, "sunExponent"), Math.abs(super.aClass7_Sub1_23.aFloatArray54[1]) * 928.0F + 96.0F);
		this.aBoolean122 = true;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8030(@OriginalArg(1) boolean arg0) {
	}
}
