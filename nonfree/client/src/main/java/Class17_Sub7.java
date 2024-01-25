import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ko")
public final class Class17_Sub7 extends Class17 {

	@OriginalMember(owner = "client!ko", name = "p", descriptor = "Z")
	private boolean aBoolean469;

	@OriginalMember(owner = "client!ko", name = "r", descriptor = "Lclient!ur;")
	private final Class347 aClass347_7;

	@OriginalMember(owner = "client!ko", name = "l", descriptor = "Lclient!lha;")
	private Class195 aClass195_1;

	@OriginalMember(owner = "client!ko", name = "s", descriptor = "Z")
	private final boolean aBoolean470;

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Lclient!bga;Lclient!in;Lclient!ur;)V")
	public Class17_Sub7(@OriginalArg(0) Class20_Sub2_Sub2 arg0, @OriginalArg(1) Class157 arg1, @OriginalArg(2) Class347 arg2) {
		super(arg0);
		this.aClass347_7 = arg2;
		if (arg1 != null && arg0.aBoolean141 && arg0.aBoolean142) {
			@Pc(23) Class150 local23 = Static94.method7631(arg0, arg1.method4545("gl", "environment_mapped_water_v"), 35633);
			@Pc(33) Class150 local33 = Static94.method7631(arg0, arg1.method4545("gl", "environment_mapped_water_f"), 35632);
			this.aClass195_1 = Static87.method8113(arg0, new Class150[] { local23, local33 });
			this.aBoolean470 = this.aClass195_1 != null && this.aClass347_7.method8642();
		} else {
			this.aBoolean470 = false;
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(III)V")
	@Override
	public void method8063(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean469) {
			return;
		}
		@Pc(12) int local12 = 0x1 << (arg0 & 0x3);
		@Pc(23) float local23 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(27) int local27 = arg1 & 0xFFFF;
		@Pc(36) float local36 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(40) long local40 = this.aClass195_1.aLong151;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "time"), (float) (super.aClass20_Sub2_22.anInt1564 * local12 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "scale"), local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "breakWaterDepth"), (float) local27);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "breakWaterOffset"), local36);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)V")
	@Override
	public void method8057() {
		if (!this.aBoolean469) {
			return;
		}
		super.aClass20_Sub2_22.method1531(1);
		super.aClass20_Sub2_22.method1484(null);
		super.aClass20_Sub2_22.method1531(0);
		super.aClass20_Sub2_22.method1484(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean469 = false;
	}

	@OriginalMember(owner = "client!ko", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method8067() {
		return this.aBoolean470;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILclient!du;I)V")
	@Override
	public void method8064(@OriginalArg(0) int arg0, @OriginalArg(1) Interface7 arg1) {
		if (!this.aBoolean469) {
			super.aClass20_Sub2_22.method1484(arg1);
			super.aClass20_Sub2_22.method1557(arg0);
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8058(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8062(@OriginalArg(1) boolean arg0) {
		@Pc(17) Interface19 local17 = super.aClass20_Sub2_22.method1468();
		if (!this.aBoolean470 || local17 == null) {
			return;
		}
		super.aClass20_Sub2_22.method1531(1);
		super.aClass20_Sub2_22.method1484(local17);
		super.aClass20_Sub2_22.method1531(0);
		super.aClass20_Sub2_22.method1484(this.aClass347_7.anInterface13_2);
		@Pc(50) long local50 = this.aClass195_1.aLong151;
		OpenGL.glUseProgramObjectARB(local50);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local50, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local50, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local50, "sunDir"), -super.aClass20_Sub2_22.aFloatArray33[0], -super.aClass20_Sub2_22.aFloatArray33[1], -super.aClass20_Sub2_22.aFloatArray33[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local50, "sunColour"), super.aClass20_Sub2_22.aFloat63, super.aClass20_Sub2_22.aFloat49, super.aClass20_Sub2_22.aFloat59, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local50, "sunExponent"), Math.abs(super.aClass20_Sub2_22.aFloatArray33[1]) * 928.0F + 96.0F);
		this.aBoolean469 = true;
	}
}
