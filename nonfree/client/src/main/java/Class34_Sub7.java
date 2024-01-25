import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ns")
public final class Class34_Sub7 extends Class34 {

	@OriginalMember(owner = "client!ns", name = "A", descriptor = "Z")
	private boolean aBoolean484;

	@OriginalMember(owner = "client!ns", name = "v", descriptor = "Lclient!gb;")
	private final Class120 aClass120_7;

	@OriginalMember(owner = "client!ns", name = "y", descriptor = "Z")
	private final boolean aBoolean483;

	@OriginalMember(owner = "client!ns", name = "o", descriptor = "Lclient!ro;")
	private Class301 aClass301_1;

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lclient!kd;Lclient!mv;Lclient!gb;)V")
	public Class34_Sub7(@OriginalArg(0) Class162_Sub1_Sub2 arg0, @OriginalArg(1) Class229 arg1, @OriginalArg(2) Class120 arg2) {
		super(arg0);
		this.aClass120_7 = arg2;
		if (arg1 != null && arg0.aBoolean363 && arg0.aBoolean362) {
			@Pc(27) Class254 local27 = Static388.method5351(arg1.method4953("gl", "environment_mapped_water_v"), arg0, 35633);
			@Pc(37) Class254 local37 = Static388.method5351(arg1.method4953("gl", "environment_mapped_water_f"), arg0, 35632);
			this.aClass301_1 = Static261.method3665(arg0, new Class254[] { local27, local37 });
			this.aBoolean483 = this.aClass301_1 != null && this.aClass120_7.method2153();
		} else {
			this.aBoolean483 = false;
		}
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(IZ)V")
	@Override
	public void method7361(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!ns", name = "c", descriptor = "(I)V")
	@Override
	public void method7357() {
		if (!this.aBoolean484) {
			return;
		}
		super.aClass162_Sub1_23.method3926(1);
		super.aClass162_Sub1_23.method3865(null);
		super.aClass162_Sub1_23.method3926(0);
		super.aClass162_Sub1_23.method3865(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean484 = false;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7355(@OriginalArg(1) boolean arg0) {
		@Pc(8) Interface3 local8 = super.aClass162_Sub1_23.method3842();
		if (!this.aBoolean483 || local8 == null) {
			return;
		}
		super.aClass162_Sub1_23.method3926(1);
		super.aClass162_Sub1_23.method3865(local8);
		super.aClass162_Sub1_23.method3926(0);
		super.aClass162_Sub1_23.method3865(this.aClass120_7.anInterface15_2);
		@Pc(39) long local39 = this.aClass301_1.aLong209;
		OpenGL.glUseProgramObjectARB(local39);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local39, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local39, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local39, "sunDir"), super.aClass162_Sub1_23.aFloatArray39[0], -super.aClass162_Sub1_23.aFloatArray39[1], -super.aClass162_Sub1_23.aFloatArray39[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local39, "sunColour"), super.aClass162_Sub1_23.aFloat143, super.aClass162_Sub1_23.aFloat139, super.aClass162_Sub1_23.aFloat138, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local39, "sunExponent"), Math.abs(super.aClass162_Sub1_23.aFloatArray39[1]) * 928.0F + 96.0F);
		this.aBoolean484 = true;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(ILclient!qda;I)V")
	@Override
	public void method7363(@OriginalArg(1) Interface20 arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean484) {
			super.aClass162_Sub1_23.method3865(arg0);
			super.aClass162_Sub1_23.method3906(arg1);
		}
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7362() {
		return this.aBoolean483;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IZI)V")
	@Override
	public void method7366(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean484) {
			return;
		}
		@Pc(13) int local13 = 0x1 << (arg0 & 0x3);
		@Pc(24) float local24 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(28) int local28 = arg1 & 0xFFFF;
		@Pc(37) float local37 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(41) long local41 = this.aClass301_1.aLong209;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local41, "time"), (float) (local13 * super.aClass162_Sub1_23.anInt4612 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local41, "scale"), local24);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local41, "breakWaterDepth"), (float) local28);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local41, "breakWaterOffset"), local37);
	}
}
