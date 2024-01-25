import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fs")
public final class Class57_Sub2 extends Class57 {

	@OriginalMember(owner = "client!fs", name = "x", descriptor = "Lclient!mt;")
	private final Class211 aClass211_4;

	@OriginalMember(owner = "client!fs", name = "s", descriptor = "Lclient!hl;")
	private final Class5_Sub2_Sub2 aClass5_Sub2_Sub2_5;

	@OriginalMember(owner = "client!fs", name = "r", descriptor = "Lclient!qv;")
	private final Class286 aClass286_1;

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(Lclient!hl;Lclient!ni;Lclient!mt;)V")
	public Class57_Sub2(@OriginalArg(0) Class5_Sub2_Sub2 arg0, @OriginalArg(1) Class223 arg1, @OriginalArg(2) Class211 arg2) {
		super(arg0);
		this.aClass211_4 = arg2;
		this.aClass5_Sub2_Sub2_5 = arg0;
		if (arg1 != null && this.aClass211_4.method5816() && this.aClass5_Sub2_Sub2_5.aBoolean402) {
			this.aClass286_1 = Static424.method7421(arg1.method5948("gl", "transparent_water"), this.aClass5_Sub2_Sub2_5);
		} else {
			this.aClass286_1 = null;
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8707(@OriginalArg(1) boolean arg0) {
		super.aClass5_Sub2_23.method4022(Static3.aClass144_1, Static503.aClass144_4);
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(III)V")
	@Override
	public void method8710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass211_4.aBoolean554) {
			@Pc(12) float local12 = (float) (super.aClass5_Sub2_23.anInt4859 % 4000) / 4000.0F;
			super.aClass5_Sub2_23.method4008(this.aClass211_4.anInterface11_1);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, local12, 0.0F, 0.0F, 1.0F);
		} else {
			@Pc(38) int local38 = super.aClass5_Sub2_23.anInt4859 % 4000 * 16 / 4000;
			super.aClass5_Sub2_23.method4008(this.aClass211_4.anInterface15Array1[local38]);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IILclient!bl;)V")
	@Override
	public void method8706(@OriginalArg(1) int arg0, @OriginalArg(2) Interface4 arg1) {
	}

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "(IZ)V")
	@Override
	public void method8712(@OriginalArg(1) boolean arg0) {
		OpenGL.glBindProgramARB(34336, this.aClass286_1.anInt8415);
		OpenGL.glEnable(34336);
		super.aClass5_Sub2_23.method4054(0, Static115.aClass80_1);
	}

	@OriginalMember(owner = "client!fs", name = "c", descriptor = "(I)V")
	@Override
	public void method8703() {
		super.aClass5_Sub2_23.method4054(0, Static522.aClass80_4);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34820);
		OpenGL.glDisable(34336);
	}

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8709() {
		return this.aClass286_1 != null;
	}
}
