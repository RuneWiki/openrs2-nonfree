import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fo")
public final class Class31_Sub2 extends Class31 {

	@OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Lclient!wu;Lclient!wu;Lclient!oh;)V")
	public Class31_Sub2(@OriginalArg(0) Class384 arg0, @OriginalArg(1) Class384 arg1, @OriginalArg(2) Class96_Sub2 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIZI)V")
	@Override
	protected void method8463(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		Static485.aClass126_17.method7021(arg1 - 2, arg0, super.aClass96_5.anInt9360 + 4, super.aClass96_5.anInt9362 - -2, ((Class96_Sub2) super.aClass96_5).anInt6965, 0);
		Static485.aClass126_17.method7021(arg1 - 1, arg0 - -1, super.aClass96_5.anInt9360 + 2, super.aClass96_5.anInt9362, 0, 0);
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIIZ)V")
	@Override
	protected void method8460(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = this.method8462() * super.aClass96_5.anInt9360 / 10000;
		Static485.aClass126_17.aa(arg0, arg1 + 2, local13, super.aClass96_5.anInt9362 - 2, ((Class96_Sub2) super.aClass96_5).anInt6966, 0);
		Static485.aClass126_17.aa(local13 + arg0, arg1 + 2, super.aClass96_5.anInt9360 - local13, super.aClass96_5.anInt9362 - 2, 0, 0);
	}
}
