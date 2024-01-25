import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hia")
public final class Class14_Sub3 extends Class14 {

	@OriginalMember(owner = "client!hia", name = "i", descriptor = "Lclient!og;")
	private final Class143_Sub1_Sub2 aClass143_Sub1_Sub2_7;

	@OriginalMember(owner = "client!hia", name = "t", descriptor = "Lclient!lo;")
	private final Class224 aClass224_2;

	@OriginalMember(owner = "client!hia", name = "v", descriptor = "Lclient!hga;")
	private final Class152 aClass152_1;

	@OriginalMember(owner = "client!hia", name = "<init>", descriptor = "(Lclient!og;Lclient!cb;Lclient!lo;)V")
	public Class14_Sub3(@OriginalArg(0) Class143_Sub1_Sub2 arg0, @OriginalArg(1) Class50 arg1, @OriginalArg(2) Class224 arg2) {
		super(arg0);
		this.aClass143_Sub1_Sub2_7 = arg0;
		this.aClass224_2 = arg2;
		if (arg1 != null && this.aClass224_2.method5207() && this.aClass143_Sub1_Sub2_7.aBoolean542) {
			this.aClass152_1 = Static554.method3440(arg1.method892("gl", "transparent_water"), this.aClass143_Sub1_Sub2_7);
		} else {
			this.aClass152_1 = null;
		}
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8625(@OriginalArg(0) boolean arg0) {
		OpenGL.glBindProgramARB(34336, this.aClass152_1.anInt3503);
		OpenGL.glEnable(34336);
		super.aClass143_Sub1_22.method6290(Static85.aClass90_2, 0);
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(III)V")
	@Override
	public void method8615(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass224_2.aBoolean454) {
			@Pc(12) float local12 = (float) (super.aClass143_Sub1_22.anInt7410 % 4000) / 4000.0F;
			super.aClass143_Sub1_22.method6338(this.aClass224_2.anInterface21_1);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, local12, 0.0F, 0.0F, 1.0F);
		} else {
			@Pc(38) int local38 = super.aClass143_Sub1_22.anInt7410 % 4000 * 16 / 4000;
			super.aClass143_Sub1_22.method6338(this.aClass224_2.anInterface12Array1[local38]);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(ILclient!dr;I)V")
	@Override
	public void method8620(@OriginalArg(1) Interface4 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!hia", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method8624() {
		return this.aClass152_1 != null;
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8617(@OriginalArg(0) boolean arg0) {
		super.aClass143_Sub1_22.method6370(Static371.aClass6_2, Static346.aClass6_1);
	}

	@OriginalMember(owner = "client!hia", name = "b", descriptor = "(B)V")
	@Override
	public void method8619() {
		super.aClass143_Sub1_22.method6290(Static663.aClass90_4, 0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34820);
		OpenGL.glDisable(34336);
	}
}
