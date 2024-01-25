import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lt")
public final class Class12_Sub4 extends Class12 {

	@OriginalMember(owner = "client!lt", name = "t", descriptor = "Lclient!jq;")
	private final Class43_Sub1_Sub2 aClass43_Sub1_Sub2_6;

	@OriginalMember(owner = "client!lt", name = "r", descriptor = "Lclient!j;")
	private final Class157 aClass157_2;

	@OriginalMember(owner = "client!lt", name = "A", descriptor = "Lclient!rga;")
	private final Class286 aClass286_1;

	@OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(Lclient!jq;Lclient!om;Lclient!j;)V")
	public Class12_Sub4(@OriginalArg(0) Class43_Sub1_Sub2 arg0, @OriginalArg(1) Class246 arg1, @OriginalArg(2) Class157 arg2) {
		super(arg0);
		this.aClass43_Sub1_Sub2_6 = arg0;
		this.aClass157_2 = arg2;
		if (arg1 != null && this.aClass157_2.method3970() && this.aClass43_Sub1_Sub2_6.aBoolean385) {
			this.aClass286_1 = Static93.method2062(arg1.method5648("gl", "transparent_water"), this.aClass43_Sub1_Sub2_6);
		} else {
			this.aClass286_1 = null;
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(III)V")
	@Override
	public void method6845(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass157_2.aBoolean343) {
			@Pc(51) float local51 = (float) (super.aClass43_Sub1_21.anInt4808 % 4000) / 4000.0F;
			super.aClass43_Sub1_21.method4298(this.aClass157_2.anInterface9_2);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, local51, 0.0F, 0.0F, 1.0F);
		} else {
			@Pc(25) int local25 = super.aClass43_Sub1_21.anInt4808 % 4000 * 16 / 4000;
			super.aClass43_Sub1_21.method4298(this.aClass157_2.anInterface10Array1[local25]);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(BILclient!hw;)V")
	@Override
	public void method6840(@OriginalArg(1) int arg0, @OriginalArg(2) Interface11 arg1) {
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(ZB)V")
	@Override
	public void method6836(@OriginalArg(0) boolean arg0) {
		super.aClass43_Sub1_21.method4253(Static587.aClass37_5, Static581.aClass37_4);
	}

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "(I)V")
	@Override
	public void method6842() {
		super.aClass43_Sub1_21.method4251(0, Static74.aClass252_1);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34820);
		OpenGL.glDisable(34336);
	}

	@OriginalMember(owner = "client!lt", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method6846() {
		return this.aClass286_1 != null;
	}

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "(ZB)V")
	@Override
	public void method6838(@OriginalArg(0) boolean arg0) {
		OpenGL.glBindProgramARB(34336, this.aClass286_1.anInt7432);
		OpenGL.glEnable(34336);
		super.aClass43_Sub1_21.method4251(0, Static165.aClass252_3);
	}
}
