import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static521 {

	@OriginalMember(owner = "client!rh", name = "m", descriptor = "I")
	public static int anInt8227;

	@OriginalMember(owner = "client!rh", name = "n", descriptor = "I")
	public static int anInt8228;

	@OriginalMember(owner = "client!rh", name = "q", descriptor = "I")
	public static int anInt8230;

	@OriginalMember(owner = "client!rh", name = "w", descriptor = "I")
	public static int anInt8234;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIII)Lclient!pja;")
	public static Class3_Sub37 method6771(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) Class3_Sub37 local5 = null;
		if (arg2 == 0) {
			local5 = Static90.method1509(Static237.aClass240_39, Static226.aClass144_2);
		}
		if (arg2 == 1) {
			local5 = Static90.method1509(Static39.aClass240_14, Static226.aClass144_2);
		}
		local5.aClass3_Sub4_Sub1_2.method7920(arg0 + Static402.anInt6661);
		local5.aClass3_Sub4_Sub1_2.method7941(arg1 + Static534.anInt8358);
		local5.aClass3_Sub4_Sub1_2.method7948(Static413.aClass154_1.method5014(82) ? 1 : 0);
		Static643.anInt10566 = arg0;
		Static280.aBoolean314 = false;
		Static622.anInt10293 = arg1;
		Static113.method1728();
		return local5;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!dt;I)Lclient!vh;")
	public static Class89 method6772(@OriginalArg(0) Class3_Sub4 arg0) {
		@Pc(7) int local7 = arg0.method7951();
		@Pc(14) Class266 local14 = Static404.method5594()[arg0.method7954()];
		@Pc(21) Class131 local21 = Static296.method4347()[arg0.method7954()];
		@Pc(25) int local25 = arg0.method7918();
		@Pc(34) int local34 = arg0.method7918();
		return new Class89(local7, local14, local21, local25, local34);
	}
}
