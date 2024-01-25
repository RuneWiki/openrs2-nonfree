import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bfa")
public final class Class31_Sub1 extends Class31 {

	@OriginalMember(owner = "client!bfa", name = "p", descriptor = "Lclient!hu;")
	private Class44 aClass44_1;

	@OriginalMember(owner = "client!bfa", name = "<init>", descriptor = "(Lclient!wu;Lclient!wu;Lclient!uc;)V")
	public Class31_Sub1(@OriginalArg(0) Class384 arg0, @OriginalArg(1) Class384 arg1, @OriginalArg(2) Class96_Sub3 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(B)V")
	@Override
	public void method8777() {
		super.method8777();
		this.aClass44_1 = Static68.method1134(((Class96_Sub3) super.aClass96_5).anInt9363, super.aClass384_133);
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IIIZ)V")
	@Override
	protected void method8460(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = this.method8462() * super.aClass96_5.anInt9360 / 10000;
		@Pc(16) int[] local16 = new int[4];
		Static485.aClass126_17.K(local16);
		Static485.aClass126_17.KA(arg0, arg1 + 2, local13 + arg0, super.aClass96_5.anInt9362 + arg1);
		this.aClass44_1.method5326(arg0, arg1 + 2, super.aClass96_5.anInt9360, super.aClass96_5.anInt9362);
		Static485.aClass126_17.KA(local16[0], local16[1], local16[2], local16[3]);
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IIZI)V")
	@Override
	protected void method8463(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		Static485.aClass126_17.method7021(arg1 - 2, arg0, super.aClass96_5.anInt9360 + 4, super.aClass96_5.anInt9362 + 2, ((Class96_Sub3) super.aClass96_5).anInt9365, 0);
		Static485.aClass126_17.method7021(arg1 - 1, arg0 + 1, super.aClass96_5.anInt9360 + 2, super.aClass96_5.anInt9362, 0, 0);
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8776() {
		return super.method8776() ? super.aClass384_133.method8883(((Class96_Sub3) super.aClass96_5).anInt9363) : false;
	}
}
