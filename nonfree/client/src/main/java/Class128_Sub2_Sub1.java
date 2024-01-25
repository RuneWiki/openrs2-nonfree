import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gv")
public final class Class128_Sub2_Sub1 extends Class128_Sub2 {

	@OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Lclient!wm;Lclient!wm;Lclient!jl;)V")
	public Class128_Sub2_Sub1(@OriginalArg(0) Class390 arg0, @OriginalArg(1) Class390 arg1, @OriginalArg(2) Class10_Sub2_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(IIIIB)V")
	@Override
	protected void method3392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = super.aClass50_22.method6003();
		@Pc(19) int local19 = ((Class10_Sub2_Sub1) super.aClass10_5).anInt5663 * Static653.method8766() / 10 % local7;
		super.aClass50_22.method5989(local19 + arg1 - local7, arg0, local7 + arg2 - local19, arg3);
	}
}
