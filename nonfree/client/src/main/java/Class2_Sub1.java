import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public final class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!aa", name = "l", descriptor = "Lclient!tba;")
	private final Class78_Sub1_Sub2 aClass78_Sub1_Sub2_1;

	@OriginalMember(owner = "client!aa", name = "o", descriptor = "Lclient!st;")
	private final Class315 aClass315_1;

	@OriginalMember(owner = "client!aa", name = "w", descriptor = "Lclient!wda;")
	private final Class357 aClass357_1;

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lclient!tba;Lclient!sea;Lclient!st;)V")
	public Class2_Sub1(@OriginalArg(0) Class78_Sub1_Sub2 arg0, @OriginalArg(1) Class308 arg1, @OriginalArg(2) Class315 arg2) {
		super(arg0);
		this.aClass78_Sub1_Sub2_1 = arg0;
		this.aClass315_1 = arg2;
		if (arg1 != null && this.aClass315_1.method6724() && this.aClass78_Sub1_Sub2_1.aBoolean650) {
			this.aClass357_1 = Static337.method5013(this.aClass78_Sub1_Sub2_1, arg1.method6557("transparent_water", "gl"));
		} else {
			this.aClass357_1 = null;
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILclient!rga;I)V")
	@Override
	public void method7892(@OriginalArg(0) int arg0, @OriginalArg(1) Interface20 arg1) {
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method7902() {
		return this.aClass357_1 != null;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIB)V")
	@Override
	public void method7897(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass315_1.aBoolean619) {
			@Pc(24) float local24 = (float) (super.aClass78_Sub1_23.anInt8564 % 4000) / 4000.0F;
			super.aClass78_Sub1_23.method6931(this.aClass315_1.anInterface21_2);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, local24, 0.0F, 0.0F, 1.0F);
		} else {
			@Pc(49) int local49 = super.aClass78_Sub1_23.anInt8564 % 4000 * 16 / 4000;
			super.aClass78_Sub1_23.method6931(this.aClass315_1.anInterface5Array1[local49]);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7894(@OriginalArg(0) boolean arg0) {
		super.aClass78_Sub1_23.method6864(Static569.aClass118_4, Static327.aClass118_2);
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(ZI)V")
	@Override
	public void method7901(@OriginalArg(0) boolean arg0) {
		OpenGL.glBindProgramARB(34336, this.aClass357_1.anInt9525);
		OpenGL.glEnable(34336);
		super.aClass78_Sub1_23.method6975(Static226.aClass148_3, 0);
	}

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "(I)V")
	@Override
	public void method7899() {
		super.aClass78_Sub1_23.method6975(Static47.aClass148_1, 0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34820);
		OpenGL.glDisable(34336);
	}
}
