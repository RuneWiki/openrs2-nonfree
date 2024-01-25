import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ah")
public final class Class13_Sub1 extends Class13 {

	@OriginalMember(owner = "client!ah", name = "v", descriptor = "Z")
	private boolean aBoolean10;

	@OriginalMember(owner = "client!ah", name = "w", descriptor = "Lclient!nc;")
	private final Class242 aClass242_1;

	@OriginalMember(owner = "client!ah", name = "n", descriptor = "Lclient!nw;")
	private Class255 aClass255_1;

	@OriginalMember(owner = "client!ah", name = "q", descriptor = "Z")
	private final boolean aBoolean9;

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lclient!fc;Lclient!gga;Lclient!nc;)V")
	public Class13_Sub1(@OriginalArg(0) Class101_Sub1_Sub1 arg0, @OriginalArg(1) Class124 arg1, @OriginalArg(2) Class242 arg2) {
		super(arg0);
		this.aClass242_1 = arg2;
		if (arg1 != null && arg0.aBoolean249 && arg0.aBoolean253) {
			@Pc(23) Class110 local23 = Static505.method8950(35633, arg0, arg1.method3639("environment_mapped_water_v", "gl"));
			@Pc(33) Class110 local33 = Static505.method8950(35632, arg0, arg1.method3639("environment_mapped_water_f", "gl"));
			this.aClass255_1 = Static132.method2342(arg0, new Class110[] { local23, local33 });
			this.aBoolean9 = this.aClass255_1 != null && this.aClass242_1.method6565();
		} else {
			this.aBoolean9 = false;
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8495(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8490(@OriginalArg(0) boolean arg0) {
		@Pc(12) Interface26 local12 = super.aClass101_Sub1_22.method5960();
		if (!this.aBoolean9 || local12 == null) {
			return;
		}
		super.aClass101_Sub1_22.method5862(1);
		super.aClass101_Sub1_22.method5909(local12);
		super.aClass101_Sub1_22.method5862(0);
		super.aClass101_Sub1_22.method5909(this.aClass242_1.anInterface13_1);
		@Pc(43) long local43 = this.aClass255_1.aLong209;
		OpenGL.glUseProgramObjectARB(local43);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local43, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local43, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local43, "sunDir"), -super.aClass101_Sub1_22.aFloatArray47[0], -super.aClass101_Sub1_22.aFloatArray47[1], -super.aClass101_Sub1_22.aFloatArray47[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local43, "sunColour"), super.aClass101_Sub1_22.aFloat157, super.aClass101_Sub1_22.aFloat153, super.aClass101_Sub1_22.aFloat152, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local43, "sunExponent"), Math.abs(super.aClass101_Sub1_22.aFloatArray47[1]) * 928.0F + 96.0F);
		this.aBoolean10 = true;
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(B)V")
	@Override
	public void method8498() {
		if (!this.aBoolean10) {
			return;
		}
		super.aClass101_Sub1_22.method5862(1);
		super.aClass101_Sub1_22.method5909((Interface5) null);
		super.aClass101_Sub1_22.method5862(0);
		super.aClass101_Sub1_22.method5909((Interface5) null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean10 = false;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lclient!en;ZI)V")
	@Override
	public void method8494(@OriginalArg(0) Interface5 arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean10) {
			super.aClass101_Sub1_22.method5909(arg0);
			super.aClass101_Sub1_22.method5840(arg1);
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8489() {
		return this.aBoolean9;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(III)V")
	@Override
	public void method8488(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean10) {
			return;
		}
		@Pc(12) int local12 = 0x1 << (arg1 & 0x3);
		@Pc(23) float local23 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(27) int local27 = arg0 & 0xFFFF;
		@Pc(36) float local36 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(40) long local40 = this.aClass255_1.aLong209;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "time"), (float) (local12 * super.aClass101_Sub1_22.anInt6645 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "scale"), local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "breakWaterDepth"), (float) local27);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "breakWaterOffset"), local36);
	}
}
