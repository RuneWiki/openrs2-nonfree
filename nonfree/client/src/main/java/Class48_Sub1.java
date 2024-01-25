import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class48_Sub1 extends Class48 {

	@OriginalMember(owner = "client!ca", name = "p", descriptor = "Z")
	private boolean aBoolean78;

	@OriginalMember(owner = "client!ca", name = "y", descriptor = "Lclient!b;")
	private final Class24 aClass24_1;

	@OriginalMember(owner = "client!ca", name = "m", descriptor = "Z")
	private final boolean aBoolean76;

	@OriginalMember(owner = "client!ca", name = "w", descriptor = "Lclient!qs;")
	private Class307 aClass307_1;

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lclient!tia;Lclient!gda;Lclient!b;)V")
	public Class48_Sub1(@OriginalArg(0) Class100_Sub1_Sub2 arg0, @OriginalArg(1) Class126 arg1, @OriginalArg(2) Class24 arg2) {
		super(arg0);
		this.aClass24_1 = arg2;
		if (arg1 != null && arg0.aBoolean637 && arg0.aBoolean633) {
			@Pc(34) Class342 local34 = Static425.method6180(arg1.method3073("environment_mapped_water_v", "gl"), 35633, arg0);
			@Pc(48) Class342 local48 = Static425.method6180(arg1.method3073("environment_mapped_water_f", "gl"), 35632, arg0);
			this.aClass307_1 = Static572.method7700(arg0, new Class342[] { local34, local48 });
			this.aBoolean76 = this.aClass307_1 != null && this.aClass24_1.method397();
		} else {
			this.aBoolean76 = false;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(III)V")
	@Override
	public void method8935(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean78) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg0 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg1 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(36) long local36 = this.aClass307_1.aLong233;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "time"), (float) (local8 * super.aClass100_Sub1_23.anInt9259 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "scale"), local19);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "breakWaterOffset"), local32);
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!ln;BI)V")
	@Override
	public void method8933(@OriginalArg(0) Interface19 arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean78) {
			super.aClass100_Sub1_23.method7923(arg0);
			super.aClass100_Sub1_23.method7962(arg1);
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8941(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Z)V")
	@Override
	public void method8934() {
		if (!this.aBoolean78) {
			return;
		}
		super.aClass100_Sub1_23.method7941(1);
		super.aClass100_Sub1_23.method7923((Interface19) null);
		super.aClass100_Sub1_23.method7941(0);
		super.aClass100_Sub1_23.method7923((Interface19) null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean78 = false;
	}

	@OriginalMember(owner = "client!ca", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method8940() {
		return this.aBoolean76;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8938(@OriginalArg(0) boolean arg0) {
		@Pc(17) Interface22 local17 = super.aClass100_Sub1_23.method7985();
		if (!this.aBoolean76 || local17 == null) {
			return;
		}
		super.aClass100_Sub1_23.method7941(1);
		super.aClass100_Sub1_23.method7923(local17);
		super.aClass100_Sub1_23.method7941(0);
		super.aClass100_Sub1_23.method7923(this.aClass24_1.anInterface14_1);
		@Pc(54) long local54 = this.aClass307_1.aLong233;
		OpenGL.glUseProgramObjectARB(local54);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local54, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local54, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local54, "sunDir"), -super.aClass100_Sub1_23.aFloatArray67[0], -super.aClass100_Sub1_23.aFloatArray67[1], -super.aClass100_Sub1_23.aFloatArray67[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local54, "sunColour"), super.aClass100_Sub1_23.aFloat175, super.aClass100_Sub1_23.aFloat179, super.aClass100_Sub1_23.aFloat177, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local54, "sunExponent"), Math.abs(super.aClass100_Sub1_23.aFloatArray67[1]) * 928.0F + 96.0F);
		this.aBoolean78 = true;
	}
}
