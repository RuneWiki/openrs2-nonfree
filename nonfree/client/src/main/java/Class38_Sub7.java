import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qfa")
public final class Class38_Sub7 extends Class38 {

	@OriginalMember(owner = "client!qfa", name = "v", descriptor = "Z")
	private boolean aBoolean543;

	@OriginalMember(owner = "client!qfa", name = "n", descriptor = "Lclient!vt;")
	private final Class348 aClass348_7;

	@OriginalMember(owner = "client!qfa", name = "p", descriptor = "Lclient!ka;")
	private Class182 aClass182_1;

	@OriginalMember(owner = "client!qfa", name = "y", descriptor = "Z")
	private final boolean aBoolean544;

	@OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "(Lclient!dda;Lclient!jn;Lclient!vt;)V")
	public Class38_Sub7(@OriginalArg(0) Class44_Sub2_Sub1 arg0, @OriginalArg(1) Class176 arg1, @OriginalArg(2) Class348 arg2) {
		super(arg0);
		this.aClass348_7 = arg2;
		if (arg1 != null && arg0.aBoolean143 && arg0.aBoolean146) {
			@Pc(23) Class23 local23 = Static272.method4729(arg0, 35633, arg1.method3972("gl", "environment_mapped_water_v"));
			@Pc(33) Class23 local33 = Static272.method4729(arg0, 35632, arg1.method3972("gl", "environment_mapped_water_f"));
			this.aClass182_1 = Static548.method7958(arg0, new Class23[] { local23, local33 });
			this.aBoolean544 = this.aClass182_1 != null && this.aClass348_7.method8146();
		} else {
			this.aBoolean544 = false;
		}
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7431(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IZI)V")
	@Override
	public void method7433(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean543) {
			return;
		}
		@Pc(12) int local12 = 0x1 << (arg0 & 0x3);
		@Pc(23) float local23 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(27) int local27 = arg1 & 0xFFFF;
		@Pc(36) float local36 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(40) long local40 = this.aClass182_1.aLong137;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "time"), (float) (local12 * super.aClass44_Sub2_21.anInt4957 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "scale"), local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "breakWaterDepth"), (float) local27);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "breakWaterOffset"), local36);
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(ILclient!oa;B)V")
	@Override
	public void method7440(@OriginalArg(0) int arg0, @OriginalArg(1) Interface16 arg1) {
		if (!this.aBoolean543) {
			super.aClass44_Sub2_21.method4265(arg1);
			super.aClass44_Sub2_21.method4335(arg0);
		}
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7427() {
		return this.aBoolean544;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7439(@OriginalArg(1) boolean arg0) {
		@Pc(12) Interface13 local12 = super.aClass44_Sub2_21.method4352();
		if (!this.aBoolean544 || local12 == null) {
			return;
		}
		super.aClass44_Sub2_21.method4267(1);
		super.aClass44_Sub2_21.method4265(local12);
		super.aClass44_Sub2_21.method4267(0);
		super.aClass44_Sub2_21.method4265(this.aClass348_7.anInterface4_1);
		@Pc(43) long local43 = this.aClass182_1.aLong137;
		OpenGL.glUseProgramObjectARB(local43);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local43, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local43, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local43, "sunDir"), super.aClass44_Sub2_21.aFloatArray35[0], -super.aClass44_Sub2_21.aFloatArray35[1], -super.aClass44_Sub2_21.aFloatArray35[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local43, "sunColour"), super.aClass44_Sub2_21.aFloat142, super.aClass44_Sub2_21.aFloat156, super.aClass44_Sub2_21.aFloat150, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local43, "sunExponent"), Math.abs(super.aClass44_Sub2_21.aFloatArray35[1]) * 928.0F + 96.0F);
		this.aBoolean543 = true;
	}

	@OriginalMember(owner = "client!qfa", name = "c", descriptor = "(I)V")
	@Override
	public void method7434() {
		if (!this.aBoolean543) {
			return;
		}
		super.aClass44_Sub2_21.method4267(1);
		super.aClass44_Sub2_21.method4265(null);
		super.aClass44_Sub2_21.method4267(0);
		super.aClass44_Sub2_21.method4265(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean543 = false;
	}
}
