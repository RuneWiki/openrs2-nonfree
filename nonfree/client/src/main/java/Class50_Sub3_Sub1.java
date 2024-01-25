import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tda")
public final class Class50_Sub3_Sub1 extends Class50_Sub3 {

	@OriginalMember(owner = "client!tda", name = "<init>", descriptor = "(Lclient!tf;Lclient!tf;Lclient!dt;)V")
	public Class50_Sub3_Sub1(@OriginalArg(0) Class322 arg0, @OriginalArg(1) Class322 arg1, @OriginalArg(2) Class65_Sub1_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(IIIII)V")
	@Override
	protected void method6786(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = super.aClass14_28.A();
		@Pc(19) int local19 = ((Class65_Sub1_Sub1) super.aClass65_5).anInt2138 * Static505.method6820() / 10 % local7;
		super.aClass14_28.method7682(local19 + arg2 - local7, arg3, arg0 + local7 - local19, arg1);
	}
}
