import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mea")
public final class Class13_Sub6 extends Class13 {

	@OriginalMember(owner = "client!mea", name = "u", descriptor = "Z")
	private boolean aBoolean477;

	@OriginalMember(owner = "client!mea", name = "s", descriptor = "Lclient!cda;")
	private final Class61 aClass61_2;

	@OriginalMember(owner = "client!mea", name = "v", descriptor = "Lclient!bga;")
	private Class39 aClass39_1;

	@OriginalMember(owner = "client!mea", name = "o", descriptor = "Z")
	private final boolean aBoolean476;

	@OriginalMember(owner = "client!mea", name = "<init>", descriptor = "(Lclient!rda;Lclient!la;Lclient!cda;)V")
	public Class13_Sub6(@OriginalArg(0) Class57_Sub3_Sub1 arg0, @OriginalArg(1) Class208 arg1, @OriginalArg(2) Class61 arg2) {
		super(arg0);
		this.aClass61_2 = arg2;
		if (arg1 != null && arg0.aBoolean651 && arg0.aBoolean653) {
			@Pc(29) Class166 local29 = Static560.method8119(arg1.method4999("environment_mapped_water_v", "gl"), arg0, 35633);
			@Pc(43) Class166 local43 = Static560.method8119(arg1.method4999("environment_mapped_water_f", "gl"), arg0, 35632);
			this.aClass39_1 = Static147.method2068(new Class166[] { local29, local43 }, arg0);
			this.aBoolean476 = this.aClass39_1 != null && this.aClass61_2.method1091();
		} else {
			this.aBoolean476 = false;
		}
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(I)V")
	@Override
	public void method8261() {
		if (!this.aBoolean477) {
			return;
		}
		super.aClass57_Sub3_21.method7795(1);
		super.aClass57_Sub3_21.method7813((Interface22) null);
		super.aClass57_Sub3_21.method7795(0);
		super.aClass57_Sub3_21.method7813((Interface22) null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean477 = false;
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(IIB)V")
	@Override
	public void method8263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean477) {
			return;
		}
		@Pc(16) int local16 = 0x1 << (arg1 & 0x3);
		@Pc(27) float local27 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(31) int local31 = arg0 & 0xFFFF;
		@Pc(40) float local40 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(44) long local44 = this.aClass39_1.aLong20;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local44, "time"), (float) (super.aClass57_Sub3_21.anInt9168 * local16 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local44, "scale"), local27);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local44, "breakWaterDepth"), (float) local31);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local44, "breakWaterOffset"), local40);
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(IILclient!rca;)V")
	@Override
	public void method8274(@OriginalArg(0) int arg0, @OriginalArg(2) Interface22 arg1) {
		if (!this.aBoolean477) {
			super.aClass57_Sub3_21.method7813(arg1);
			super.aClass57_Sub3_21.method7764(arg0);
		}
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8262(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8270() {
		return this.aBoolean476;
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8273(@OriginalArg(0) boolean arg0) {
		@Pc(13) Interface24 local13 = super.aClass57_Sub3_21.method7811();
		if (!this.aBoolean476 || local13 == null) {
			return;
		}
		super.aClass57_Sub3_21.method7795(1);
		super.aClass57_Sub3_21.method7813(local13);
		super.aClass57_Sub3_21.method7795(0);
		super.aClass57_Sub3_21.method7813(this.aClass61_2.anInterface19_2);
		@Pc(46) long local46 = this.aClass39_1.aLong20;
		OpenGL.glUseProgramObjectARB(local46);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local46, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local46, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local46, "sunDir"), -super.aClass57_Sub3_21.aFloatArray92[0], -super.aClass57_Sub3_21.aFloatArray92[1], -super.aClass57_Sub3_21.aFloatArray92[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local46, "sunColour"), super.aClass57_Sub3_21.aFloat165, super.aClass57_Sub3_21.aFloat177, super.aClass57_Sub3_21.aFloat179, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local46, "sunExponent"), Math.abs(super.aClass57_Sub3_21.aFloatArray92[1]) * 928.0F + 96.0F);
		this.aBoolean477 = true;
	}
}
