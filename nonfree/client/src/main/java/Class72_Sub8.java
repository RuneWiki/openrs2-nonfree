import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class72_Sub8 extends Class72 {

	@OriginalMember(owner = "client!pb", name = "t", descriptor = "Z")
	private boolean aBoolean518;

	@OriginalMember(owner = "client!pb", name = "o", descriptor = "Lclient!tt;")
	private final Class331 aClass331_6;

	@OriginalMember(owner = "client!pb", name = "r", descriptor = "Z")
	private final boolean aBoolean517;

	@OriginalMember(owner = "client!pb", name = "w", descriptor = "Lclient!uj;")
	private Class339 aClass339_1;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Lclient!mr;Lclient!tf;Lclient!tt;)V")
	public Class72_Sub8(@OriginalArg(0) Class45_Sub2_Sub2 arg0, @OriginalArg(1) Class322 arg1, @OriginalArg(2) Class331 arg2) {
		super(arg0);
		this.aClass331_6 = arg2;
		if (arg1 != null && arg0.aBoolean436 && arg0.aBoolean439) {
			@Pc(27) Class311 local27 = Static110.method1923(arg0, 35633, arg1.method6810("environment_mapped_water_v", "gl"));
			@Pc(37) Class311 local37 = Static110.method1923(arg0, 35632, arg1.method6810("environment_mapped_water_f", "gl"));
			this.aClass339_1 = Static552.method7311(new Class311[] { local27, local37 }, arg0);
			this.aBoolean517 = this.aClass339_1 != null && this.aClass331_6.method6942();
		} else {
			this.aBoolean517 = false;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7193(@OriginalArg(0) boolean arg0) {
		@Pc(14) Interface6 local14 = super.aClass45_Sub2_22.method4985();
		if (!this.aBoolean517 || local14 == null) {
			return;
		}
		super.aClass45_Sub2_22.method4961(1);
		super.aClass45_Sub2_22.method4926(local14);
		super.aClass45_Sub2_22.method4961(0);
		super.aClass45_Sub2_22.method4926(this.aClass331_6.anInterface14_1);
		@Pc(49) long local49 = this.aClass339_1.aLong250;
		OpenGL.glUseProgramObjectARB(local49);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local49, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local49, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local49, "sunDir"), super.aClass45_Sub2_22.aFloatArray66[0], -super.aClass45_Sub2_22.aFloatArray66[1], -super.aClass45_Sub2_22.aFloatArray66[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local49, "sunColour"), super.aClass45_Sub2_22.aFloat131, super.aClass45_Sub2_22.aFloat123, super.aClass45_Sub2_22.bf, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local49, "sunExponent"), Math.abs(super.aClass45_Sub2_22.aFloatArray66[1]) * 928.0F + 96.0F);
		this.aBoolean518 = true;
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(B)V")
	@Override
	public void method7184() {
		if (!this.aBoolean518) {
			return;
		}
		super.aClass45_Sub2_22.method4961(1);
		super.aClass45_Sub2_22.method4926(null);
		super.aClass45_Sub2_22.method4961(0);
		super.aClass45_Sub2_22.method4926(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean518 = false;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(BILclient!lc;)V")
	@Override
	public void method7194(@OriginalArg(1) int arg0, @OriginalArg(2) Interface11 arg1) {
		if (!this.aBoolean518) {
			super.aClass45_Sub2_22.method4926(arg1);
			super.aClass45_Sub2_22.method4939(arg0);
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(III)V")
	@Override
	public void method7188(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean518) {
			return;
		}
		@Pc(20) int local20 = 0x1 << (arg0 & 0x3);
		@Pc(31) float local31 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(35) int local35 = arg1 & 0xFFFF;
		@Pc(44) float local44 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(48) long local48 = this.aClass339_1.aLong250;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local48, "time"), (float) (local20 * super.aClass45_Sub2_22.anInt5856 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local48, "scale"), local31);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local48, "breakWaterDepth"), (float) local35);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local48, "breakWaterOffset"), local44);
	}

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7187() {
		return this.aBoolean517;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7182(@OriginalArg(1) boolean arg0) {
	}
}
