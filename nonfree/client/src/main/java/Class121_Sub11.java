import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wga")
public final class Class121_Sub11 extends Class121 {

	@OriginalMember(owner = "client!wga", name = "u", descriptor = "Z")
	private boolean aBoolean797;

	@OriginalMember(owner = "client!wga", name = "k", descriptor = "Lclient!dma;")
	private final Class76 aClass76_8;

	@OriginalMember(owner = "client!wga", name = "q", descriptor = "Lclient!fka;")
	private Class115 aClass115_1;

	@OriginalMember(owner = "client!wga", name = "p", descriptor = "Z")
	private final boolean aBoolean798;

	@OriginalMember(owner = "client!wga", name = "<init>", descriptor = "(Lclient!lt;Lclient!lb;Lclient!dma;)V")
	public Class121_Sub11(@OriginalArg(0) Class67_Sub1_Sub2 arg0, @OriginalArg(1) Class221 arg1, @OriginalArg(2) Class76 arg2) {
		super(arg0);
		this.aClass76_8 = arg2;
		if (arg1 != null && arg0.aBoolean534 && arg0.aBoolean532) {
			@Pc(29) Class378 local29 = Static512.method7314(arg0, 35633, arg1.method5076("environment_mapped_water_v", "gl"));
			@Pc(43) Class378 local43 = Static512.method7314(arg0, 35632, arg1.method5076("environment_mapped_water_f", "gl"));
			this.aClass115_1 = Static265.method4095(new Class378[] { local29, local43 }, (byte) -122, arg0);
			this.aBoolean798 = this.aClass115_1 != null && this.aClass76_8.method2073();
		} else {
			this.aBoolean798 = false;
		}
	}

	@OriginalMember(owner = "client!wga", name = "b", descriptor = "(IZ)V")
	@Override
	public void method9231(@OriginalArg(1) boolean arg0) {
		@Pc(13) Interface7 local13 = super.aClass67_Sub1_23.method5589();
		if (!this.aBoolean798 || local13 == null) {
			return;
		}
		super.aClass67_Sub1_23.method5687(1);
		super.aClass67_Sub1_23.method5612(local13);
		super.aClass67_Sub1_23.method5687(0);
		super.aClass67_Sub1_23.method5612(this.aClass76_8.anInterface1_2);
		@Pc(46) long local46 = this.aClass115_1.aLong115;
		OpenGL.glUseProgramObjectARB(local46);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local46, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local46, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local46, "sunDir"), -super.aClass67_Sub1_23.aFloatArray57[0], -super.aClass67_Sub1_23.aFloatArray57[1], -super.aClass67_Sub1_23.aFloatArray57[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local46, "sunColour"), super.aClass67_Sub1_23.aFloat125, super.aClass67_Sub1_23.aFloat117, super.aClass67_Sub1_23.aFloat119, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local46, "sunExponent"), Math.abs(super.aClass67_Sub1_23.aFloatArray57[1]) * 928.0F + 96.0F);
		this.aBoolean797 = true;
	}

	@OriginalMember(owner = "client!wga", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method9241() {
		return this.aBoolean798;
	}

	@OriginalMember(owner = "client!wga", name = "b", descriptor = "(B)V")
	@Override
	public void method9232() {
		if (!this.aBoolean797) {
			return;
		}
		super.aClass67_Sub1_23.method5687(1);
		super.aClass67_Sub1_23.method5612((Interface12) null);
		super.aClass67_Sub1_23.method5687(0);
		super.aClass67_Sub1_23.method5612((Interface12) null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean797 = false;
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(IZ)V")
	@Override
	public void method9239(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(Lclient!ip;II)V")
	@Override
	public void method9244(@OriginalArg(0) Interface12 arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean797) {
			super.aClass67_Sub1_23.method5612(arg0);
			super.aClass67_Sub1_23.method5655(arg1);
		}
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(III)V")
	@Override
	public void method9236(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean797) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg1 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg0 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(36) long local36 = this.aClass115_1.aLong115;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "time"), (float) (super.aClass67_Sub1_23.anInt6654 * local8 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "scale"), local19);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "breakWaterOffset"), local32);
	}
}
