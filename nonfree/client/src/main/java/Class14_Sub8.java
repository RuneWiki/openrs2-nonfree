import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pea")
public final class Class14_Sub8 extends Class14 {

	@OriginalMember(owner = "client!pea", name = "t", descriptor = "Z")
	private boolean aBoolean572;

	@OriginalMember(owner = "client!pea", name = "j", descriptor = "Lclient!lo;")
	private final Class224 aClass224_6;

	@OriginalMember(owner = "client!pea", name = "r", descriptor = "Z")
	private final boolean aBoolean571;

	@OriginalMember(owner = "client!pea", name = "p", descriptor = "Lclient!fja;")
	private Class117 aClass117_1;

	@OriginalMember(owner = "client!pea", name = "<init>", descriptor = "(Lclient!og;Lclient!cb;Lclient!lo;)V")
	public Class14_Sub8(@OriginalArg(0) Class143_Sub1_Sub2 arg0, @OriginalArg(1) Class50 arg1, @OriginalArg(2) Class224 arg2) {
		super(arg0);
		this.aClass224_6 = arg2;
		if (arg1 != null && arg0.aBoolean545 && arg0.aBoolean543) {
			@Pc(27) Class362 local27 = Static263.method3709(arg1.method892("gl", "environment_mapped_water_v"), arg0, 35633);
			@Pc(37) Class362 local37 = Static263.method3709(arg1.method892("gl", "environment_mapped_water_f"), arg0, 35632);
			this.aClass117_1 = Static323.method5030(new Class362[] { local27, local37 }, arg0);
			this.aBoolean571 = this.aClass117_1 != null && this.aClass224_6.method5205();
		} else {
			this.aBoolean571 = false;
		}
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8617(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!pea", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method8624() {
		return this.aBoolean571;
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(ILclient!dr;I)V")
	@Override
	public void method8620(@OriginalArg(1) Interface4 arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean572) {
			super.aClass143_Sub1_22.method6338(arg0);
			super.aClass143_Sub1_22.method6322(arg1);
		}
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8625(@OriginalArg(0) boolean arg0) {
		@Pc(12) Interface1 local12 = super.aClass143_Sub1_22.method6280();
		if (!this.aBoolean571 || local12 == null) {
			return;
		}
		super.aClass143_Sub1_22.method6374(1);
		super.aClass143_Sub1_22.method6338(local12);
		super.aClass143_Sub1_22.method6374(0);
		super.aClass143_Sub1_22.method6338(this.aClass224_6.anInterface21_2);
		@Pc(43) long local43 = this.aClass117_1.aLong99;
		OpenGL.glUseProgramObjectARB(local43);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local43, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local43, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local43, "sunDir"), -super.aClass143_Sub1_22.aFloatArray55[0], -super.aClass143_Sub1_22.aFloatArray55[1], -super.aClass143_Sub1_22.aFloatArray55[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local43, "sunColour"), super.aClass143_Sub1_22.aFloat141, super.aClass143_Sub1_22.aFloat129, super.aClass143_Sub1_22.aFloat143, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local43, "sunExponent"), Math.abs(super.aClass143_Sub1_22.aFloatArray55[1]) * 928.0F + 96.0F);
		this.aBoolean572 = true;
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(III)V")
	@Override
	public void method8615(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean572) {
			return;
		}
		@Pc(16) int local16 = 0x1 << (arg1 & 0x3);
		@Pc(27) float local27 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(31) int local31 = arg0 & 0xFFFF;
		@Pc(40) float local40 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(44) long local44 = this.aClass117_1.aLong99;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local44, "time"), (float) (super.aClass143_Sub1_22.anInt7410 * local16 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local44, "scale"), local27);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local44, "breakWaterDepth"), (float) local31);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local44, "breakWaterOffset"), local40);
	}

	@OriginalMember(owner = "client!pea", name = "b", descriptor = "(B)V")
	@Override
	public void method8619() {
		if (!this.aBoolean572) {
			return;
		}
		super.aClass143_Sub1_22.method6374(1);
		super.aClass143_Sub1_22.method6338((Interface4) null);
		super.aClass143_Sub1_22.method6374(0);
		super.aClass143_Sub1_22.method6338((Interface4) null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean572 = false;
	}
}
