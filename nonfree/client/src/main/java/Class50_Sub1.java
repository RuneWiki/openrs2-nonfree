import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cga")
public final class Class50_Sub1 extends Class50 {

	@OriginalMember(owner = "client!cga", name = "<init>", descriptor = "(Lclient!tf;Lclient!tf;Lclient!iq;)V")
	public Class50_Sub1(@OriginalArg(0) Class322 arg0, @OriginalArg(1) Class322 arg1, @OriginalArg(2) Class65_Sub2 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(IIIZ)V")
	@Override
	protected void method6782(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = this.method6783() * super.aClass65_5.anInt5462 / 10000;
		Static505.aClass45_11.J(arg1, arg0 + 2, local13, super.aClass65_5.anInt5461 - 2, ((Class65_Sub2) super.aClass65_5).anInt4127, 0);
		Static505.aClass45_11.J(local13 + arg1, arg0 - -2, super.aClass65_5.anInt5462 - local13, super.aClass65_5.anInt5461 + -2, 0, 0);
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(IZIZ)V")
	@Override
	protected void method6781(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static505.aClass45_11.method7402(arg1 - 2, arg0, super.aClass65_5.anInt5462 + 4, super.aClass65_5.anInt5461 + 2, ((Class65_Sub2) super.aClass65_5).anInt4126, 0);
		Static505.aClass45_11.method7402(arg1 - 1, arg0 + 1, super.aClass65_5.anInt5462 + 2, super.aClass65_5.anInt5461, 0, 0);
	}
}
