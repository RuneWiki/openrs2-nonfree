import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class60_Sub3 extends Class60 {

	@OriginalMember(owner = "client!ed", name = "z", descriptor = "Z")
	private boolean aBoolean205;

	@OriginalMember(owner = "client!ed", name = "t", descriptor = "Lclient!uw;")
	private final Class367 aClass367_3;

	@OriginalMember(owner = "client!ed", name = "v", descriptor = "Lclient!oca;")
	private Class260 aClass260_1;

	@OriginalMember(owner = "client!ed", name = "s", descriptor = "Z")
	private final boolean aBoolean204;

	static {
		new Class239("", 73);
	}

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lclient!oia;Lclient!gj;Lclient!uw;)V")
	public Class60_Sub3(@OriginalArg(0) Class16_Sub1_Sub2 arg0, @OriginalArg(1) Class143 arg1, @OriginalArg(2) Class367 arg2) {
		super(arg0);
		this.aClass367_3 = arg2;
		if (arg1 != null && arg0.aBoolean574 && arg0.aBoolean575) {
			@Pc(23) Class391 local23 = Static509.method7192(arg1.method3119("gl", "environment_mapped_water_v"), arg0, 35633);
			@Pc(33) Class391 local33 = Static509.method7192(arg1.method3119("gl", "environment_mapped_water_f"), arg0, 35632);
			this.aClass260_1 = Static35.method1093(new Class391[] { local23, local33 }, arg0);
			this.aBoolean204 = this.aClass260_1 != null && this.aClass367_3.method8226();
		} else {
			this.aBoolean204 = false;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIB)V")
	@Override
	public void method8291(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean205) {
			return;
		}
		@Pc(18) int local18 = 0x1 << (arg0 & 0x3);
		@Pc(29) float local29 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(33) int local33 = arg1 & 0xFFFF;
		@Pc(42) float local42 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(46) long local46 = this.aClass260_1.aLong199;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local46, "time"), (float) (local18 * super.aClass16_Sub1_23.anInt7468 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local46, "scale"), local29);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local46, "breakWaterDepth"), (float) local33);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local46, "breakWaterOffset"), local42);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8293(@OriginalArg(1) boolean arg0) {
		@Pc(12) Interface20 local12 = super.aClass16_Sub1_23.method6208();
		if (!this.aBoolean204 || local12 == null) {
			return;
		}
		super.aClass16_Sub1_23.method6234(1);
		super.aClass16_Sub1_23.method6197(local12);
		super.aClass16_Sub1_23.method6234(0);
		super.aClass16_Sub1_23.method6197(this.aClass367_3.anInterface24_2);
		@Pc(43) long local43 = this.aClass260_1.aLong199;
		OpenGL.glUseProgramObjectARB(local43);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local43, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local43, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local43, "sunDir"), -super.aClass16_Sub1_23.aFloatArray57[0], -super.aClass16_Sub1_23.aFloatArray57[1], -super.aClass16_Sub1_23.aFloatArray57[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local43, "sunColour"), super.aClass16_Sub1_23.aFloat161, super.aClass16_Sub1_23.aFloat159, super.aClass16_Sub1_23.aFloat163, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local43, "sunExponent"), Math.abs(super.aClass16_Sub1_23.aFloatArray57[1]) * 928.0F + 96.0F);
		this.aBoolean205 = true;
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8296() {
		return this.aBoolean204;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8302(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!br;II)V")
	@Override
	public void method8295(@OriginalArg(0) Interface3 arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean205) {
			super.aClass16_Sub1_23.method6197(arg0);
			super.aClass16_Sub1_23.method6233(arg1);
		}
	}

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "(I)V")
	@Override
	public void method8300() {
		if (!this.aBoolean205) {
			return;
		}
		super.aClass16_Sub1_23.method6234(1);
		super.aClass16_Sub1_23.method6197((Interface3) null);
		super.aClass16_Sub1_23.method6234(0);
		super.aClass16_Sub1_23.method6197((Interface3) null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean205 = false;
	}
}
