import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static386 {

	@OriginalMember(owner = "client!o", name = "m", descriptor = "Lclient!io;")
	public static Class158 aClass158_1;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ILclient!cea;)Lclient!ot;")
	public static Class252 method6314(@OriginalArg(1) Class2_Sub11 arg0) {
		@Pc(7) String local7 = arg0.method8373();
		@Pc(16) Class309 local16 = Static409.method6629()[arg0.method8383()];
		@Pc(30) Class86 local30 = Static277.method5088()[arg0.method8383()];
		@Pc(34) int local34 = arg0.method8368();
		@Pc(38) int local38 = arg0.method8368();
		@Pc(42) int local42 = arg0.method8383();
		@Pc(46) int local46 = arg0.method8383();
		@Pc(50) int local50 = arg0.method8383();
		@Pc(56) int local56 = arg0.method8326();
		@Pc(60) int local60 = arg0.method8326();
		@Pc(64) int local64 = arg0.method8381();
		@Pc(68) int local68 = arg0.method8381();
		@Pc(72) int local72 = arg0.method8381();
		return new Class252(local7, local16, local30, local34, local38, local42, local46, local50, local56, local60, local64, local68, local72);
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(BILclient!mf;IZZLclient!mf;)I")
	public static int method6315(@OriginalArg(1) int arg0, @OriginalArg(2) Class206_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class206_Sub1 arg5) {
		@Pc(10) int local10 = Static345.method5917(arg5, arg1, arg3, arg0);
		if (local10 != 0) {
			return arg3 ? -local10 : local10;
		} else if (arg2 == -1) {
			return 0;
		} else {
			@Pc(37) int local37 = Static345.method5917(arg5, arg1, arg4, arg2);
			return arg4 ? -local37 : local37;
		}
	}
}
