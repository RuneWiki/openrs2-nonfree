import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hv")
public final class Class29_Sub6 extends Class29 {

	@OriginalMember(owner = "client!hv", name = "r", descriptor = "Z")
	private boolean aBoolean289;

	@OriginalMember(owner = "client!hv", name = "u", descriptor = "Lclient!ur;")
	private final Class345 aClass345_3;

	@OriginalMember(owner = "client!hv", name = "z", descriptor = "Lclient!eaa;")
	private Class82 aClass82_1;

	@OriginalMember(owner = "client!hv", name = "t", descriptor = "Z")
	private final boolean aBoolean290;

	@OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(Lclient!mba;Lclient!la;Lclient!ur;)V")
	public Class29_Sub6(@OriginalArg(0) Class5_Sub1_Sub2 arg0, @OriginalArg(1) Class196 arg1, @OriginalArg(2) Class345 arg2) {
		super(arg0);
		this.aClass345_3 = arg2;
		if (arg1 != null && arg0.aBoolean478 && arg0.aBoolean479) {
			@Pc(23) Class224 local23 = Static46.method1406(arg0, 35633, arg1.method5093("gl", "environment_mapped_water_v"));
			@Pc(33) Class224 local33 = Static46.method1406(arg0, 35632, arg1.method5093("gl", "environment_mapped_water_f"));
			this.aClass82_1 = Static216.method3634(new Class224[] { local23, local33 }, arg0);
			this.aBoolean290 = this.aClass82_1 != null && this.aClass345_3.method8242();
		} else {
			this.aBoolean290 = false;
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8080(@OriginalArg(1) boolean arg0) {
		@Pc(12) Interface3 local12 = super.aClass5_Sub1_22.method5681();
		if (!this.aBoolean290 || local12 == null) {
			return;
		}
		super.aClass5_Sub1_22.method5571(1);
		super.aClass5_Sub1_22.method5609(local12);
		super.aClass5_Sub1_22.method5571(0);
		super.aClass5_Sub1_22.method5609(this.aClass345_3.anInterface12_1);
		@Pc(43) long local43 = this.aClass82_1.aLong49;
		OpenGL.glUseProgramObjectARB(local43);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local43, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local43, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local43, "sunDir"), -super.aClass5_Sub1_22.aFloatArray50[0], -super.aClass5_Sub1_22.aFloatArray50[1], -super.aClass5_Sub1_22.aFloatArray50[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local43, "sunColour"), super.aClass5_Sub1_22.aFloat136, super.aClass5_Sub1_22.aFloat142, super.aClass5_Sub1_22.aFloat140, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local43, "sunExponent"), Math.abs(super.aClass5_Sub1_22.aFloatArray50[1]) * 928.0F + 96.0F);
		this.aBoolean289 = true;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(I)V")
	@Override
	public void method8071() {
		if (!this.aBoolean289) {
			return;
		}
		super.aClass5_Sub1_22.method5571(1);
		super.aClass5_Sub1_22.method5609(null);
		super.aClass5_Sub1_22.method5571(0);
		super.aClass5_Sub1_22.method5609(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean289 = false;
	}

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8073() {
		return this.aBoolean290;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(III)V")
	@Override
	public void method8083(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean289) {
			return;
		}
		@Pc(16) int local16 = 0x1 << (arg1 & 0x3);
		@Pc(27) float local27 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(31) int local31 = arg0 & 0xFFFF;
		@Pc(40) float local40 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(44) long local44 = this.aClass82_1.aLong49;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local44, "time"), (float) (super.aClass5_Sub1_22.anInt6524 * local16 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local44, "scale"), local27);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local44, "breakWaterDepth"), (float) local31);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local44, "breakWaterOffset"), local40);
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IILclient!ec;)V")
	@Override
	public void method8072(@OriginalArg(1) int arg0, @OriginalArg(2) Interface10 arg1) {
		if (!this.aBoolean289) {
			super.aClass5_Sub1_22.method5609(arg1);
			super.aClass5_Sub1_22.method5697(arg0);
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8067(@OriginalArg(0) boolean arg0) {
	}
}
