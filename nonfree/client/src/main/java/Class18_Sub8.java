import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class18_Sub8 extends Class18 {

	@OriginalMember(owner = "client!o", name = "y", descriptor = "Lclient!tk;")
	private final Class13_Sub3_Sub1 aClass13_Sub3_Sub1_6;

	@OriginalMember(owner = "client!o", name = "q", descriptor = "Lclient!tn;")
	private final Class334 aClass334_5;

	@OriginalMember(owner = "client!o", name = "l", descriptor = "Lclient!ap;")
	private final Class21 aClass21_5;

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "(Lclient!tk;Lclient!nd;Lclient!tn;)V")
	public Class18_Sub8(@OriginalArg(0) Class13_Sub3_Sub1 arg0, @OriginalArg(1) Class238 arg1, @OriginalArg(2) Class334 arg2) {
		super(arg0);
		this.aClass13_Sub3_Sub1_6 = arg0;
		this.aClass334_5 = arg2;
		if (arg1 != null && this.aClass334_5.method7835() && this.aClass13_Sub3_Sub1_6.aBoolean658) {
			this.aClass21_5 = Static464.method6567(arg1.method5572("gl", "transparent_water"), this.aClass13_Sub3_Sub1_6);
		} else {
			this.aClass21_5 = null;
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8632(@OriginalArg(1) boolean arg0) {
		OpenGL.glBindProgramARB(34336, this.aClass21_5.anInt471);
		OpenGL.glEnable(34336);
		super.aClass13_Sub3_23.method8231(Static287.aClass43_8, 0);
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8637(@OriginalArg(0) boolean arg0) {
		super.aClass13_Sub3_23.method8235(Static408.aClass269_3, Static26.aClass269_1);
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method8641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass334_5.aBoolean659) {
			@Pc(12) float local12 = (float) (super.aClass13_Sub3_23.anInt9736 % 4000) / 4000.0F;
			super.aClass13_Sub3_23.method8234(this.aClass334_5.anInterface1_1);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, local12, 0.0F, 0.0F, 1.0F);
		} else {
			@Pc(38) int local38 = super.aClass13_Sub3_23.anInt9736 % 4000 * 16 / 4000;
			super.aClass13_Sub3_23.method8234(this.aClass334_5.anInterface27Array2[local38]);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IILclient!fe;)V")
	@Override
	public void method8645(@OriginalArg(0) int arg0, @OriginalArg(2) Interface6 arg1) {
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)V")
	@Override
	public void method8642() {
		super.aClass13_Sub3_23.method8231(Static338.aClass43_3, 0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34820);
		OpenGL.glDisable(34336);
	}

	@OriginalMember(owner = "client!o", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method8643() {
		return this.aClass21_5 != null;
	}
}
