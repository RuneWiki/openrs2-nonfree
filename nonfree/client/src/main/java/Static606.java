import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static606 {

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method8257(@OriginalArg(0) String arg0) {
		if (Static603.aClass24Array1 != null) {
			@Pc(19) Class3_Sub37 local19 = Static90.method1509(Static568.aClass240_100, Static226.aClass144_2);
			local19.aClass3_Sub4_Sub1_2.method7948(Static345.method5022(arg0));
			local19.aClass3_Sub4_Sub1_2.method7901(arg0);
			Static301.method2678(local19);
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!mr;Lclient!mr;IIZIZ)I")
	public static int method8258(@OriginalArg(0) Class236_Sub1 arg0, @OriginalArg(1) Class236_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(10) int local10 = Static579.method7661(arg2, arg0, arg1, arg5);
		if (local10 != 0) {
			return arg5 ? -local10 : local10;
		} else if (arg4 == -1) {
			return 0;
		} else {
			@Pc(39) int local39 = Static579.method7661(arg4, arg0, arg1, arg3);
			return arg3 ? -local39 : local39;
		}
	}
}
