import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ht")
public final class Class56_Sub4 extends Class56 {

	@OriginalMember(owner = "client!ht", name = "v", descriptor = "Lclient!lm;")
	private final Class100_Sub1_Sub2 aClass100_Sub1_Sub2_9;

	@OriginalMember(owner = "client!ht", name = "u", descriptor = "Lclient!bd;")
	private final Class31 aClass31_4;

	@OriginalMember(owner = "client!ht", name = "x", descriptor = "Lclient!ml;")
	private final Class223 aClass223_1;

	@OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(Lclient!lm;Lclient!pl;Lclient!bd;)V")
	public Class56_Sub4(@OriginalArg(0) Class100_Sub1_Sub2 arg0, @OriginalArg(1) Class259 arg1, @OriginalArg(2) Class31 arg2) {
		super(arg0);
		this.aClass100_Sub1_Sub2_9 = arg0;
		this.aClass31_4 = arg2;
		if (arg1 != null && this.aClass31_4.method545() && this.aClass100_Sub1_Sub2_9.aBoolean467) {
			this.aClass223_1 = Static227.method3537(arg1.method5965("gl", "transparent_water"), this.aClass100_Sub1_Sub2_9);
		} else {
			this.aClass223_1 = null;
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7174(@OriginalArg(1) boolean arg0) {
		OpenGL.glBindProgramARB(34336, this.aClass223_1.anInt6205);
		OpenGL.glEnable(34336);
		super.aClass100_Sub1_23.method4883(0, Static48.aClass119_5);
	}

	@OriginalMember(owner = "client!ht", name = "d", descriptor = "(I)V")
	@Override
	public void method7183() {
		super.aClass100_Sub1_23.method4883(0, Static325.aClass119_44);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34820);
		OpenGL.glDisable(34336);
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7171(@OriginalArg(1) boolean arg0) {
		super.aClass100_Sub1_23.method4797(Static291.aClass236_2, Static202.aClass236_1);
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7172() {
		return this.aClass223_1 != null;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(IILclient!hfa;)V")
	@Override
	public void method7178(@OriginalArg(0) int arg0, @OriginalArg(2) Interface10 arg1) {
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(IIB)V")
	@Override
	public void method7182(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass31_4.aBoolean40) {
			@Pc(49) float local49 = (float) (super.aClass100_Sub1_23.anInt5768 % 4000) / 4000.0F;
			super.aClass100_Sub1_23.method4876(this.aClass31_4.anInterface6_1);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, local49, 0.0F, 0.0F, 1.0F);
		} else {
			@Pc(23) int local23 = super.aClass100_Sub1_23.anInt5768 % 4000 * 16 / 4000;
			super.aClass100_Sub1_23.method4876(this.aClass31_4.anInterface14Array2[local23]);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
		}
	}
}
