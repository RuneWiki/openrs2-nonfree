import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ov")
public final class Class17_Sub10 extends Class17 {

	@OriginalMember(owner = "client!ov", name = "s", descriptor = "Lclient!bga;")
	private final Class20_Sub2_Sub2 aClass20_Sub2_Sub2_9;

	@OriginalMember(owner = "client!ov", name = "q", descriptor = "Lclient!ur;")
	private final Class347 aClass347_8;

	@OriginalMember(owner = "client!ov", name = "p", descriptor = "Lclient!qr;")
	private final Class283 aClass283_5;

	@OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(Lclient!bga;Lclient!in;Lclient!ur;)V")
	public Class17_Sub10(@OriginalArg(0) Class20_Sub2_Sub2 arg0, @OriginalArg(1) Class157 arg1, @OriginalArg(2) Class347 arg2) {
		super(arg0);
		this.aClass20_Sub2_Sub2_9 = arg0;
		this.aClass347_8 = arg2;
		if (arg1 != null && this.aClass347_8.method8640() && this.aClass20_Sub2_Sub2_9.aBoolean143) {
			this.aClass283_5 = Static84.method2411(arg1.method4545("gl", "transparent_water"), this.aClass20_Sub2_Sub2_9);
		} else {
			this.aClass283_5 = null;
		}
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(ILclient!du;I)V")
	@Override
	public void method8064(@OriginalArg(0) int arg0, @OriginalArg(1) Interface7 arg1) {
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8062(@OriginalArg(1) boolean arg0) {
		OpenGL.glBindProgramARB(34336, this.aClass283_5.anInt8826);
		OpenGL.glEnable(34336);
		super.aClass20_Sub2_22.method1483(0, Static154.aClass177_4);
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8058(@OriginalArg(0) boolean arg0) {
		super.aClass20_Sub2_22.method1508(Static361.aClass315_2, Static492.aClass315_4);
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(B)V")
	@Override
	public void method8057() {
		super.aClass20_Sub2_22.method1483(0, Static118.aClass177_1);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34820);
		OpenGL.glDisable(34336);
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(III)V")
	@Override
	public void method8063(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass347_8.aBoolean711) {
			@Pc(47) float local47 = (float) (super.aClass20_Sub2_22.anInt1564 % 4000) / 4000.0F;
			super.aClass20_Sub2_22.method1484(this.aClass347_8.anInterface13_1);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, local47, 0.0F, 0.0F, 1.0F);
		} else {
			@Pc(21) int local21 = super.aClass20_Sub2_22.anInt1564 % 4000 * 16 / 4000;
			super.aClass20_Sub2_22.method1484(this.aClass347_8.anInterface27Array2[local21]);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!ov", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method8067() {
		return this.aClass283_5 != null;
	}
}
