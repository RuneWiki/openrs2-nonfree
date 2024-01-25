import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ap")
public final class Class23_Sub1 extends Class23 {

	@OriginalMember(owner = "client!ap", name = "r", descriptor = "Z")
	private boolean aBoolean22;

	@OriginalMember(owner = "client!ap", name = "m", descriptor = "Lclient!jd;")
	private final Class184 aClass184_1;

	@OriginalMember(owner = "client!ap", name = "k", descriptor = "Lclient!haa;")
	private Class145 aClass145_1;

	@OriginalMember(owner = "client!ap", name = "j", descriptor = "Z")
	private final boolean aBoolean23;

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Lclient!dga;Lclient!lga;Lclient!jd;)V")
	public Class23_Sub1(@OriginalArg(0) Class75_Sub1_Sub1 arg0, @OriginalArg(1) Class223 arg1, @OriginalArg(2) Class184 arg2) {
		super(arg0);
		this.aClass184_1 = arg2;
		if (arg1 != null && arg0.aBoolean165 && arg0.aBoolean169) {
			@Pc(29) Class108 local29 = Static688.method9043(arg0, 35633, arg1.method5284("gl", "environment_mapped_water_v"));
			@Pc(43) Class108 local43 = Static688.method9043(arg0, 35632, arg1.method5284("gl", "environment_mapped_water_f"));
			this.aClass145_1 = Static337.method5201(arg0, new Class108[] { local29, local43 });
			this.aBoolean23 = this.aClass145_1 != null && this.aClass184_1.method4635();
		} else {
			this.aBoolean23 = false;
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8166(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8164() {
		return this.aBoolean23;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIB)V")
	@Override
	public void method8160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean22) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg0 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg1 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(36) long local36 = this.aClass145_1.aLong122;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "time"), (float) (local8 * super.aClass75_Sub1_22.anInt7673 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "scale"), local19);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "breakWaterOffset"), local32);
	}

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "(I)V")
	@Override
	public void method8167() {
		if (!this.aBoolean22) {
			return;
		}
		super.aClass75_Sub1_22.method6805(1);
		super.aClass75_Sub1_22.method6814((Interface1) null);
		super.aClass75_Sub1_22.method6805(0);
		super.aClass75_Sub1_22.method6814((Interface1) null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean22 = false;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IBLclient!ah;)V")
	@Override
	public void method8162(@OriginalArg(0) int arg0, @OriginalArg(2) Interface1 arg1) {
		if (!this.aBoolean22) {
			super.aClass75_Sub1_22.method6814(arg1);
			super.aClass75_Sub1_22.method6830(arg0);
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8161(@OriginalArg(1) boolean arg0) {
		@Pc(8) Interface19 local8 = super.aClass75_Sub1_22.method6826();
		if (!this.aBoolean23 || local8 == null) {
			return;
		}
		super.aClass75_Sub1_22.method6805(1);
		super.aClass75_Sub1_22.method6814(local8);
		super.aClass75_Sub1_22.method6805(0);
		super.aClass75_Sub1_22.method6814(this.aClass184_1.anInterface13_2);
		@Pc(49) long local49 = this.aClass145_1.aLong122;
		OpenGL.glUseProgramObjectARB(local49);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local49, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local49, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local49, "sunDir"), -super.aClass75_Sub1_22.aFloatArray62[0], -super.aClass75_Sub1_22.aFloatArray62[1], -super.aClass75_Sub1_22.aFloatArray62[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local49, "sunColour"), super.aClass75_Sub1_22.aFloat153, super.aClass75_Sub1_22.aFloat147, super.aClass75_Sub1_22.aFloat146, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local49, "sunExponent"), Math.abs(super.aClass75_Sub1_22.aFloatArray62[1]) * 928.0F + 96.0F);
		this.aBoolean22 = true;
	}
}
