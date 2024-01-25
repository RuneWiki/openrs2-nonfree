import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oga")
public final class Class32_Sub5 extends Class32 {

	@OriginalMember(owner = "client!oga", name = "y", descriptor = "[I")
	public static final int[] anIntArray375 = new int[4096];

	@OriginalMember(owner = "client!oga", name = "x", descriptor = "Z")
	private boolean aBoolean470;

	@OriginalMember(owner = "client!oga", name = "n", descriptor = "Lclient!tj;")
	private final Class318 aClass318_4;

	@OriginalMember(owner = "client!oga", name = "z", descriptor = "Z")
	private final boolean aBoolean471;

	@OriginalMember(owner = "client!oga", name = "p", descriptor = "Lclient!md;")
	private Class200 aClass200_1;

	static {
		for (@Pc(6) int local6 = 0; local6 < 4096; local6++) {
			anIntArray375[local6] = Static81.method1890(local6);
		}
	}

	@OriginalMember(owner = "client!oga", name = "<init>", descriptor = "(Lclient!bea;Lclient!ri;Lclient!tj;)V")
	public Class32_Sub5(@OriginalArg(0) Class31_Sub1_Sub1 arg0, @OriginalArg(1) Class284 arg1, @OriginalArg(2) Class318 arg2) {
		super(arg0);
		this.aClass318_4 = arg2;
		if (arg1 != null && arg0.aBoolean88 && arg0.aBoolean90) {
			@Pc(27) Class67 local27 = Static117.method2297(arg1.method6328("gl", "environment_mapped_water_v"), 35633, arg0);
			@Pc(37) Class67 local37 = Static117.method2297(arg1.method6328("gl", "environment_mapped_water_f"), 35632, arg0);
			this.aClass200_1 = Static411.method5767(arg0, new Class67[] { local27, local37 });
			this.aBoolean471 = this.aClass200_1 != null && this.aClass318_4.method6941();
		} else {
			this.aBoolean471 = false;
		}
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7454() {
		return this.aBoolean471;
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7459(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!oga", name = "b", descriptor = "(III)V")
	@Override
	public void method7458(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean470) {
			return;
		}
		@Pc(12) int local12 = 0x1 << (arg0 & 0x3);
		@Pc(23) float local23 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(27) int local27 = arg1 & 0xFFFF;
		@Pc(36) float local36 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(40) long local40 = this.aClass200_1.aLong164;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "time"), (float) (local12 * super.aClass31_Sub1_22.anInt9105 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "scale"), local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "breakWaterDepth"), (float) local27);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "breakWaterOffset"), local36);
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7446(@OriginalArg(0) boolean arg0) {
		@Pc(13) Interface18 local13 = super.aClass31_Sub1_22.method7098();
		if (!this.aBoolean471 || local13 == null) {
			return;
		}
		super.aClass31_Sub1_22.method7092(1);
		super.aClass31_Sub1_22.method7129(local13);
		super.aClass31_Sub1_22.method7092(0);
		super.aClass31_Sub1_22.method7129(this.aClass318_4.anInterface19_1);
		@Pc(50) long local50 = this.aClass200_1.aLong164;
		OpenGL.glUseProgramObjectARB(local50);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local50, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local50, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local50, "sunDir"), super.aClass31_Sub1_22.aFloatArray67[0], -super.aClass31_Sub1_22.aFloatArray67[1], -super.aClass31_Sub1_22.aFloatArray67[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local50, "sunColour"), super.aClass31_Sub1_22.aFloat189, super.aClass31_Sub1_22.aFloat201, super.aClass31_Sub1_22.aFloat193, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local50, "sunExponent"), Math.abs(super.aClass31_Sub1_22.aFloatArray67[1]) * 928.0F + 96.0F);
		this.aBoolean470 = true;
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(IZLclient!wq;)V")
	@Override
	public void method7453(@OriginalArg(0) int arg0, @OriginalArg(2) Interface24 arg1) {
		if (!this.aBoolean470) {
			super.aClass31_Sub1_22.method7129(arg1);
			super.aClass31_Sub1_22.method7141(arg0);
		}
	}

	@OriginalMember(owner = "client!oga", name = "f", descriptor = "(I)V")
	@Override
	public void method7460() {
		if (!this.aBoolean470) {
			return;
		}
		super.aClass31_Sub1_22.method7092(1);
		super.aClass31_Sub1_22.method7129(null);
		super.aClass31_Sub1_22.method7092(0);
		super.aClass31_Sub1_22.method7129(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean470 = false;
	}
}
