import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static397 {

	@OriginalMember(owner = "client!qda", name = "J", descriptor = "I")
	public static int anInt7483;

	@OriginalMember(owner = "client!qda", name = "C", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_112 = new Class45(84, -2);

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(III)V")
	public static void method6232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = Static445.aClass244_7.method6147(Static499.aClass88_266.method2391(Static345.anInt6495));
		@Pc(26) int local26;
		for (@Pc(18) Class12_Sub20 local18 = (Class12_Sub20) Static192.aClass73_33.method2005(); local18 != null; local18 = (Class12_Sub20) Static192.aClass73_33.method2009()) {
			local26 = Static55.method1412(local18);
			if (local26 > local13) {
				local13 = local26;
			}
		}
		local13 += 8;
		local26 = Static8.anInt118 * 16 + 21;
		@Pc(56) int local56 = arg1 - local13 / 2;
		if (Static169.anInt3893 < local13 + local56) {
			local56 = Static169.anInt3893 - local13;
		}
		if (local56 < 0) {
			local56 = 0;
		}
		@Pc(75) int local75 = arg0;
		if (local26 + arg0 > Static127.anInt2936) {
			local75 = Static127.anInt2936 - local26;
		}
		if (local75 < 0) {
			local75 = 0;
		}
		Static301.anInt5821 = local56;
		Static253.anInt5213 = local13;
		Static298.anInt3270 = (Static386.aBoolean562 ? 26 : 22) + Static8.anInt118 * 16;
		Static389.aBoolean533 = true;
		Static105.anInt2405 = local75;
	}

	@OriginalMember(owner = "client!qda", name = "b", descriptor = "(I)V")
	public static void method6233() {
		Static332.method5312(Static108.aClass77_22);
		Static383.aClass12_Sub8_Sub2_1.method5214(Static256.method4386());
		Static383.aClass12_Sub8_Sub2_1.method5190(Static169.anInt3893);
		Static383.aClass12_Sub8_Sub2_1.method5190(Static127.anInt2936);
		Static383.aClass12_Sub8_Sub2_1.method5214(Static208.aClass12_Sub10_Sub1_1.anInt2226);
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(Z)V")
	public static void method6234() {
		@Pc(10) Class125 local10 = Static156.aClass125_21;
		synchronized (Static156.aClass125_21) {
			Static156.aClass125_21.method3442();
		}
		local10 = Static268.aClass125_41;
		synchronized (Static268.aClass125_41) {
			Static268.aClass125_41.method3442();
		}
	}

	@OriginalMember(owner = "client!qda", name = "c", descriptor = "(I)V")
	public static void method6235() {
		for (@Pc(7) int local7 = 0; local7 < Static39.anInt790; local7++) {
			@Pc(13) Class195 local13 = Static308.aClass195Array1[local7];
			if (local13.aByte69 == 2) {
				if (local13.aClass12_Sub13_Sub4_4 == null) {
					local13.anInt5599 = Integer.MIN_VALUE;
				} else {
					Static328.aClass12_Sub13_Sub1_1.method2443(local13.aClass12_Sub13_Sub4_4);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(FFFI)I")
	public static int method6237(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(17) float local17 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(26) float local26 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(35) float local35 = arg0 < 0.0F ? -arg0 : arg0;
		if (local26 > local17 && local35 < local26) {
			return arg2 > 0.0F ? 0 : 1;
		} else if (local17 < local35 && local35 > local26) {
			return arg0 > 0.0F ? 2 : 3;
		} else if (arg1 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}
}
