import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class22_Sub5 extends Class22 {

	@OriginalMember(owner = "client!nc", name = "o", descriptor = "Lclient!el;")
	private final Class14_Sub2_Sub1 aClass14_Sub2_Sub1_7;

	@OriginalMember(owner = "client!nc", name = "m", descriptor = "Lclient!tca;")
	private final Class315 aClass315_4;

	@OriginalMember(owner = "client!nc", name = "t", descriptor = "Lclient!nm;")
	private final Class222 aClass222_5;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lclient!el;Lclient!pfa;Lclient!tca;)V")
	public Class22_Sub5(@OriginalArg(0) Class14_Sub2_Sub1 arg0, @OriginalArg(1) Class251 arg1, @OriginalArg(2) Class315 arg2) {
		super(arg0);
		this.aClass14_Sub2_Sub1_7 = arg0;
		this.aClass315_4 = arg2;
		if (this.aClass315_4.method6759() && this.aClass14_Sub2_Sub1_7.aBoolean200) {
			this.aClass222_5 = Static285.method4647(this.aClass14_Sub2_Sub1_7, arg1.method5762("transparent_water", "gl"));
		} else {
			this.aClass222_5 = null;
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(III)V")
	@Override
	public void method7654(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass315_4.aBoolean597) {
			@Pc(40) float local40 = (float) (super.aClass14_Sub2_20.anInt8587 % 4000) / 4000.0F;
			super.aClass14_Sub2_20.method7034(this.aClass315_4.anInterface11_1);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, local40, 0.0F, 0.0F, 1.0F);
		} else {
			@Pc(13) int local13 = super.aClass14_Sub2_20.anInt8587 % 4000 * 16 / 4000;
			super.aClass14_Sub2_20.method7034(this.aClass315_4.anInterface6Array1[local13]);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
	@Override
	public void method7643() {
		super.aClass14_Sub2_20.method6912(Static185.aClass138_3, 0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34820);
		OpenGL.glDisable(34336);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(BILclient!gl;)V")
	@Override
	public void method7645(@OriginalArg(1) int arg0, @OriginalArg(2) Interface10 arg1) {
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7642(@OriginalArg(1) boolean arg0) {
		super.aClass14_Sub2_20.method6935(Static350.aClass228_12, Static568.aClass228_14);
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7647() {
		return this.aClass222_5 != null;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7646(@OriginalArg(0) boolean arg0) {
		OpenGL.glBindProgramARB(34336, this.aClass222_5.anInt6207);
		OpenGL.glEnable(34336);
		super.aClass14_Sub2_20.method6912(Static457.aClass138_4, 0);
	}
}
