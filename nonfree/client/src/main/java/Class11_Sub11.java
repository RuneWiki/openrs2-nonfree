import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sea")
public final class Class11_Sub11 extends Class11 {

	@OriginalMember(owner = "client!sea", name = "p", descriptor = "Z")
	private boolean aBoolean641;

	@OriginalMember(owner = "client!sea", name = "q", descriptor = "Lclient!wt;")
	private final Class376 aClass376_8;

	@OriginalMember(owner = "client!sea", name = "s", descriptor = "Lclient!jfa;")
	private Class155 aClass155_1;

	@OriginalMember(owner = "client!sea", name = "l", descriptor = "Z")
	private final boolean aBoolean640;

	@OriginalMember(owner = "client!sea", name = "<init>", descriptor = "(Lclient!ai;Lclient!oh;Lclient!wt;)V")
	public Class11_Sub11(@OriginalArg(0) Class16_Sub1_Sub1 arg0, @OriginalArg(1) Class237 arg1, @OriginalArg(2) Class376 arg2) {
		super(arg0);
		this.aClass376_8 = arg2;
		if (arg1 != null && arg0.aBoolean67 && arg0.aBoolean69) {
			@Pc(23) Class91 local23 = Static181.method3455(35633, arg0, arg1.method6304("gl", "environment_mapped_water_v"));
			@Pc(33) Class91 local33 = Static181.method3455(35632, arg0, arg1.method6304("gl", "environment_mapped_water_f"));
			this.aClass155_1 = Static277.method4714(arg0, new Class91[] { local23, local33 });
			this.aBoolean640 = this.aClass155_1 != null && this.aClass376_8.method8614();
		} else {
			this.aBoolean640 = false;
		}
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(Lclient!ke;BI)V")
	@Override
	public void method7354(@OriginalArg(0) Interface12 arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean641) {
			super.aClass16_Sub1_21.method3889(arg0);
			super.aClass16_Sub1_21.method3937(arg1);
		}
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method7359(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean641) {
			return;
		}
		@Pc(16) int local16 = 0x1 << (arg0 & 0x3);
		@Pc(27) float local27 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(31) int local31 = arg1 & 0xFFFF;
		@Pc(40) float local40 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(44) long local44 = this.aClass155_1.aLong140;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local44, "time"), (float) (local16 * super.aClass16_Sub1_21.anInt4932 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local44, "scale"), local27);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local44, "breakWaterDepth"), (float) local31);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local44, "breakWaterOffset"), local40);
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(B)V")
	@Override
	public void method7356() {
		if (!this.aBoolean641) {
			return;
		}
		super.aClass16_Sub1_21.method3899(1);
		super.aClass16_Sub1_21.method3889(null);
		super.aClass16_Sub1_21.method3899(0);
		super.aClass16_Sub1_21.method3889(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean641 = false;
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7355(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7357(@OriginalArg(0) boolean arg0) {
		@Pc(8) Interface25 local8 = super.aClass16_Sub1_21.method3920();
		if (!this.aBoolean640 || local8 == null) {
			return;
		}
		super.aClass16_Sub1_21.method3899(1);
		super.aClass16_Sub1_21.method3889(local8);
		super.aClass16_Sub1_21.method3899(0);
		super.aClass16_Sub1_21.method3889(this.aClass376_8.anInterface1_1);
		@Pc(39) long local39 = this.aClass155_1.aLong140;
		OpenGL.glUseProgramObjectARB(local39);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local39, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local39, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local39, "sunDir"), -super.aClass16_Sub1_21.aFloatArray45[0], -super.aClass16_Sub1_21.aFloatArray45[1], -super.aClass16_Sub1_21.aFloatArray45[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local39, "sunColour"), super.aClass16_Sub1_21.aFloat85, super.aClass16_Sub1_21.aFloat82, super.aClass16_Sub1_21.aFloat86, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local39, "sunExponent"), Math.abs(super.aClass16_Sub1_21.aFloatArray45[1]) * 928.0F + 96.0F);
		this.aBoolean641 = true;
	}

	@OriginalMember(owner = "client!sea", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7360() {
		return this.aBoolean640;
	}
}
