import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class27_Sub10 extends Class27 {

	@OriginalMember(owner = "client!wd", name = "u", descriptor = "Z")
	private boolean aBoolean739;

	@OriginalMember(owner = "client!wd", name = "r", descriptor = "Lclient!no;")
	private final Class250 aClass250_7;

	@OriginalMember(owner = "client!wd", name = "B", descriptor = "Lclient!oo;")
	private Class259 aClass259_1;

	@OriginalMember(owner = "client!wd", name = "w", descriptor = "Z")
	private final boolean aBoolean740;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Lclient!om;Lclient!la;Lclient!no;)V")
	public Class27_Sub10(@OriginalArg(0) Class133_Sub1_Sub2 arg0, @OriginalArg(1) Class207 arg1, @OriginalArg(2) Class250 arg2) {
		super(arg0);
		this.aClass250_7 = arg2;
		if (arg1 != null && arg0.aBoolean504 && arg0.aBoolean505) {
			@Pc(23) Class193 local23 = Static612.method8704(arg0, 35633, arg1.method4695("environment_mapped_water_v", "gl"));
			@Pc(33) Class193 local33 = Static612.method8704(arg0, 35632, arg1.method4695("environment_mapped_water_f", "gl"));
			this.aClass259_1 = Static227.method3516(arg0, new Class193[] { local23, local33 });
			this.aBoolean740 = this.aClass259_1 != null && this.aClass250_7.method5557();
		} else {
			this.aBoolean740 = false;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IZLclient!iu;)V")
	@Override
	public void method8901(@OriginalArg(0) int arg0, @OriginalArg(2) Interface8 arg1) {
		if (!this.aBoolean739) {
			super.aClass133_Sub1_23.method6153(arg1);
			super.aClass133_Sub1_23.method6268(arg0);
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8898(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8894(@OriginalArg(0) boolean arg0) {
		@Pc(8) Interface18 local8 = super.aClass133_Sub1_23.method6256();
		if (!this.aBoolean740 || local8 == null) {
			return;
		}
		super.aClass133_Sub1_23.method6271(1);
		super.aClass133_Sub1_23.method6153(local8);
		super.aClass133_Sub1_23.method6271(0);
		super.aClass133_Sub1_23.method6153(this.aClass250_7.anInterface23_1);
		@Pc(43) long local43 = this.aClass259_1.aLong178;
		OpenGL.glUseProgramObjectARB(local43);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local43, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local43, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local43, "sunDir"), -super.aClass133_Sub1_23.aFloatArray57[0], -super.aClass133_Sub1_23.aFloatArray57[1], -super.aClass133_Sub1_23.aFloatArray57[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local43, "sunColour"), super.aClass133_Sub1_23.aFloat126, super.aClass133_Sub1_23.aFloat119, super.aClass133_Sub1_23.aFloat132, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local43, "sunExponent"), Math.abs(super.aClass133_Sub1_23.aFloatArray57[1]) * 928.0F + 96.0F);
		this.aBoolean739 = true;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8891() {
		return this.aBoolean740;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)V")
	@Override
	public void method8890(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean739) {
			return;
		}
		@Pc(13) int local13 = 0x1 << (arg0 & 0x3);
		@Pc(24) float local24 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(28) int local28 = arg1 & 0xFFFF;
		@Pc(37) float local37 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(41) long local41 = this.aClass259_1.aLong178;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local41, "time"), (float) (local13 * super.aClass133_Sub1_23.anInt7009 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local41, "scale"), local24);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local41, "breakWaterDepth"), (float) local28);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local41, "breakWaterOffset"), local37);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)V")
	@Override
	public void method8895() {
		if (!this.aBoolean739) {
			return;
		}
		super.aClass133_Sub1_23.method6271(1);
		super.aClass133_Sub1_23.method6153(null);
		super.aClass133_Sub1_23.method6271(0);
		super.aClass133_Sub1_23.method6153(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean739 = false;
	}
}
