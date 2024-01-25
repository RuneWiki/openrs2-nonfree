import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mi")
public final class Class12_Sub7 extends Class12 {

	@OriginalMember(owner = "client!mi", name = "z", descriptor = "Z")
	private boolean aBoolean477;

	@OriginalMember(owner = "client!mi", name = "C", descriptor = "Lclient!j;")
	private final Class157 aClass157_3;

	@OriginalMember(owner = "client!mi", name = "x", descriptor = "Z")
	private final boolean aBoolean476;

	@OriginalMember(owner = "client!mi", name = "A", descriptor = "Lclient!kg;")
	private Class185 aClass185_1;

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(Lclient!jq;Lclient!om;Lclient!j;)V")
	public Class12_Sub7(@OriginalArg(0) Class43_Sub1_Sub2 arg0, @OriginalArg(1) Class246 arg1, @OriginalArg(2) Class157 arg2) {
		super(arg0);
		this.aClass157_3 = arg2;
		if (arg1 != null && arg0.aBoolean380 && arg0.aBoolean383) {
			@Pc(27) Class263 local27 = Static370.method5497(arg0, 35633, arg1.method5648("gl", "environment_mapped_water_v"));
			@Pc(37) Class263 local37 = Static370.method5497(arg0, 35632, arg1.method5648("gl", "environment_mapped_water_f"));
			this.aClass185_1 = Static315.method4950(arg0, new Class263[] { local27, local37 });
			this.aBoolean476 = this.aClass185_1 != null && this.aClass157_3.method3972();
		} else {
			this.aBoolean476 = false;
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(ZB)V")
	@Override
	public void method6836(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)V")
	@Override
	public void method6842() {
		if (!this.aBoolean477) {
			return;
		}
		super.aClass43_Sub1_21.method4238(1);
		super.aClass43_Sub1_21.method4298(null);
		super.aClass43_Sub1_21.method4238(0);
		super.aClass43_Sub1_21.method4298(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean477 = false;
	}

	@OriginalMember(owner = "client!mi", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method6846() {
		return this.aBoolean476;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(III)V")
	@Override
	public void method6845(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean477) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg0 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg1 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(36) long local36 = this.aClass185_1.aLong140;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "time"), (float) (super.aClass43_Sub1_21.anInt4808 * local8 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "scale"), local19);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "breakWaterOffset"), local32);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(BILclient!hw;)V")
	@Override
	public void method6840(@OriginalArg(1) int arg0, @OriginalArg(2) Interface11 arg1) {
		if (!this.aBoolean477) {
			super.aClass43_Sub1_21.method4298(arg1);
			super.aClass43_Sub1_21.method4183(arg0);
		}
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(ZB)V")
	@Override
	public void method6838(@OriginalArg(0) boolean arg0) {
		@Pc(13) Interface20 local13 = super.aClass43_Sub1_21.method4302();
		if (!this.aBoolean476 || local13 == null) {
			return;
		}
		super.aClass43_Sub1_21.method4238(1);
		super.aClass43_Sub1_21.method4298(local13);
		super.aClass43_Sub1_21.method4238(0);
		super.aClass43_Sub1_21.method4298(this.aClass157_3.anInterface9_1);
		@Pc(46) long local46 = this.aClass185_1.aLong140;
		OpenGL.glUseProgramObjectARB(local46);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local46, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local46, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local46, "sunDir"), super.aClass43_Sub1_21.aFloatArray28[0], -super.aClass43_Sub1_21.aFloatArray28[1], -super.aClass43_Sub1_21.aFloatArray28[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local46, "sunColour"), super.aClass43_Sub1_21.aFloat100, super.aClass43_Sub1_21.aFloat98, super.aClass43_Sub1_21.aFloat93, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local46, "sunExponent"), Math.abs(super.aClass43_Sub1_21.aFloatArray28[1]) * 928.0F + 96.0F);
		this.aBoolean477 = true;
	}
}
