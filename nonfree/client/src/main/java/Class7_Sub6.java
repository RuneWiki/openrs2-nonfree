import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ks")
public final class Class7_Sub6 extends Class7 {

	@OriginalMember(owner = "client!ks", name = "n", descriptor = "Z")
	private boolean aBoolean392;

	@OriginalMember(owner = "client!ks", name = "m", descriptor = "Lclient!pba;")
	private final Class249 aClass249_5;

	@OriginalMember(owner = "client!ks", name = "o", descriptor = "Lclient!tm;")
	private Class329 aClass329_1;

	@OriginalMember(owner = "client!ks", name = "x", descriptor = "Z")
	private final boolean aBoolean393;

	@OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(Lclient!no;Lclient!vd;Lclient!pba;)V")
	public Class7_Sub6(@OriginalArg(0) Class100_Sub1_Sub2 arg0, @OriginalArg(1) Class353 arg1, @OriginalArg(2) Class249 arg2) {
		super(arg0);
		this.aClass249_5 = arg2;
		if (arg1 != null && arg0.aBoolean494 && arg0.aBoolean489) {
			@Pc(23) Class102 local23 = Static598.method8398(arg1.method8426("gl", "environment_mapped_water_v"), 35633, arg0);
			@Pc(33) Class102 local33 = Static598.method8398(arg1.method8426("gl", "environment_mapped_water_f"), 35632, arg0);
			this.aClass329_1 = Static198.method3518(new Class102[] { local23, local33 }, arg0);
			this.aBoolean393 = this.aClass329_1 != null && this.aClass249_5.method6663();
		} else {
			this.aBoolean393 = false;
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!bca;II)V")
	@Override
	public void method7186(@OriginalArg(0) Interface1 arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean392) {
			super.aClass100_Sub1_22.method6033(arg0);
			super.aClass100_Sub1_22.method6092(arg1);
		}
	}

	@OriginalMember(owner = "client!ks", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7194() {
		return this.aBoolean393;
	}

	@OriginalMember(owner = "client!ks", name = "d", descriptor = "(I)V")
	@Override
	public void method7197() {
		if (!this.aBoolean392) {
			return;
		}
		super.aClass100_Sub1_22.method6114(1);
		super.aClass100_Sub1_22.method6033((Interface1) null);
		super.aClass100_Sub1_22.method6114(0);
		super.aClass100_Sub1_22.method6033((Interface1) null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean392 = false;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7195(@OriginalArg(1) boolean arg0) {
		@Pc(15) Interface19 local15 = super.aClass100_Sub1_22.method6042();
		if (!this.aBoolean393 || local15 == null) {
			return;
		}
		super.aClass100_Sub1_22.method6114(1);
		super.aClass100_Sub1_22.method6033(local15);
		super.aClass100_Sub1_22.method6114(0);
		super.aClass100_Sub1_22.method6033(this.aClass249_5.anInterface15_2);
		@Pc(46) long local46 = this.aClass329_1.aLong246;
		OpenGL.glUseProgramObjectARB(local46);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local46, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local46, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local46, "sunDir"), -super.aClass100_Sub1_22.aFloatArray60[0], -super.aClass100_Sub1_22.aFloatArray60[1], -super.aClass100_Sub1_22.aFloatArray60[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local46, "sunColour"), super.aClass100_Sub1_22.aFloat130, super.aClass100_Sub1_22.aFloat138, super.aClass100_Sub1_22.aFloat127, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local46, "sunExponent"), Math.abs(super.aClass100_Sub1_22.aFloatArray60[1]) * 928.0F + 96.0F);
		this.aBoolean392 = true;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(BII)V")
	@Override
	public void method7192(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean392) {
			return;
		}
		@Pc(12) int local12 = 0x1 << (arg0 & 0x3);
		@Pc(23) float local23 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(27) int local27 = arg1 & 0xFFFF;
		@Pc(36) float local36 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(40) long local40 = this.aClass329_1.aLong246;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "time"), (float) (local12 * super.aClass100_Sub1_22.anInt7125 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "scale"), local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "breakWaterDepth"), (float) local27);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "breakWaterOffset"), local36);
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7187(@OriginalArg(0) boolean arg0) {
	}
}
