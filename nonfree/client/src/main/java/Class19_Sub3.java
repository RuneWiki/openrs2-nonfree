import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iq")
public final class Class19_Sub3 extends Class19 {

	@OriginalMember(owner = "client!iq", name = "s", descriptor = "Lclient!ia;")
	private final Class15_Sub2_Sub1 aClass15_Sub2_Sub1_6;

	@OriginalMember(owner = "client!iq", name = "o", descriptor = "Lclient!bl;")
	private final Class31 aClass31_4;

	@OriginalMember(owner = "client!iq", name = "k", descriptor = "Lclient!ne;")
	private final Class226 aClass226_1;

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lclient!ia;Lclient!pe;Lclient!bl;)V")
	public Class19_Sub3(@OriginalArg(0) Class15_Sub2_Sub1 arg0, @OriginalArg(1) Class254 arg1, @OriginalArg(2) Class31 arg2) {
		super(arg0);
		this.aClass15_Sub2_Sub1_6 = arg0;
		this.aClass31_4 = arg2;
		if (this.aClass31_4.method1147() && this.aClass15_Sub2_Sub1_6.aBoolean331) {
			this.aClass226_1 = Static55.method1314(arg1.method6410("transparent_water", "gl"), this.aClass15_Sub2_Sub1_6);
		} else {
			this.aClass226_1 = null;
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7894(@OriginalArg(1) boolean arg0) {
		super.aClass15_Sub2_18.method5430(Static220.aClass120_4, Static490.aClass120_5);
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method7883() {
		return this.aClass226_1 != null;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7892(@OriginalArg(0) boolean arg0) {
		OpenGL.glBindProgramARB(34336, this.aClass226_1.anInt6994);
		OpenGL.glEnable(34336);
		super.aClass15_Sub2_18.method5444(0, Static457.aClass85_4);
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(I)V")
	@Override
	public void method7890() {
		super.aClass15_Sub2_18.method5444(0, Static159.aClass85_1);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34820);
		OpenGL.glDisable(34336);
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(III)V")
	@Override
	public void method7889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass31_4.aBoolean84) {
			@Pc(46) float local46 = (float) (super.aClass15_Sub2_18.anInt6528 % 4000) / 4000.0F;
			super.aClass15_Sub2_18.method5414(this.aClass31_4.anInterface1_1);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, local46, 0.0F, 0.0F, 1.0F);
		} else {
			@Pc(19) int local19 = super.aClass15_Sub2_18.anInt6528 % 4000 * 16 / 4000;
			super.aClass15_Sub2_18.method5414(this.aClass31_4.anInterface14Array2[local19]);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!nm;ZI)V")
	@Override
	public void method7886(@OriginalArg(0) Interface13 arg0, @OriginalArg(2) int arg1) {
	}
}
