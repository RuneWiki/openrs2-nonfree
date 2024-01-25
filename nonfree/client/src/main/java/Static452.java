import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static452 {

	@OriginalMember(owner = "client!rca", name = "s", descriptor = "Lclient!wba;")
	public static Class353 aClass353_2;

	@OriginalMember(owner = "client!rca", name = "r", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_262 = new Class123(64, 6);

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(II)Lclient!j;")
	public static Class153 method6234(@OriginalArg(0) int arg0) {
		@Pc(15) Class153[] local15 = Static571.method7717();
		for (@Pc(17) int local17 = 0; local17 < local15.length; local17++) {
			@Pc(23) Class153 local23 = local15[local17];
			if (arg0 == local23.anInt4743) {
				return local23;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(Lclient!la;ILjava/lang/String;Lclient!r;Lclient!ufa;Z)V")
	public static void method6235(@OriginalArg(0) Class63 arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class31 arg2, @OriginalArg(4) Class328 arg3, @OriginalArg(5) boolean arg4) {
		@Pc(12) boolean local12 = !Static104.aBoolean182 || Static342.method4997();
		if (!local12) {
			return;
		}
		@Pc(26) int local26;
		@Pc(35) int local35;
		if (Static104.aBoolean182 && local12) {
			@Pc(136) Class328 local136 = Static584.aClass328_13;
			@Pc(142) Class63 local142 = arg2.method8027(local136, Static56.aClass365Array1);
			local26 = local136.method7368(null, arg1, 250);
			local35 = local136.method7369(arg1, null, local136.anInt9400, 250);
			@Pc(161) int local161 = Static203.aClass365_1.anInt10318;
			@Pc(165) int local165 = local161 + 4;
			local35 += local165 * 2;
			local26 += local165 * 2;
			if (local26 < Static97.anInt2406) {
				local26 = Static97.anInt2406;
			}
			if (Static577.anInt9990 > local35) {
				local35 = Static577.anInt9990;
			}
			@Pc(204) int local204 = Static481.aClass154_13.method3814(local26, Static333.anInt6024) + Static163.anInt1206;
			@Pc(212) int local212 = Static183.aClass201_8.method4868(local35, Static473.anInt8221) + Static465.anInt8090;
			arg2.method8086(Static520.aClass365_3, false).DA(Static475.aClass365_2.anInt10318 + local204, Static475.aClass365_2.anInt10320 + local212, local26 - Static475.aClass365_2.anInt10318 * 2, local35 + -(Static475.aClass365_2.anInt10320 * 2), 1, 0, 0);
			arg2.method8086(Static475.aClass365_2, true).method7957(local204, local212);
			Static475.aClass365_2.method8157();
			arg2.method8086(Static475.aClass365_2, true).method7957(local26 + local204 - local161, local212);
			Static475.aClass365_2.method8156();
			arg2.method8086(Static475.aClass365_2, true).method7957(local204 + local26 - local161, -local161 + local212 + local35);
			Static475.aClass365_2.method8157();
			arg2.method8086(Static475.aClass365_2, true).method7957(local204, local212 + local35 - local161);
			Static475.aClass365_2.method8156();
			arg2.method8086(Static203.aClass365_1, true).method7953(local204, Static475.aClass365_2.anInt10320 + local212, local161, local35 - Static475.aClass365_2.anInt10320 * 2);
			Static203.aClass365_1.method8162();
			arg2.method8086(Static203.aClass365_1, true).method7953(local204 + Static475.aClass365_2.anInt10318, local212, local26 - Static475.aClass365_2.anInt10318 * 2, local161);
			Static203.aClass365_1.method8162();
			arg2.method8086(Static203.aClass365_1, true).method7953(local204 + local26 - local161, local212 + Static475.aClass365_2.anInt10320, local161, local35 - Static475.aClass365_2.anInt10320 * 2);
			Static203.aClass365_1.method8162();
			arg2.method8086(Static203.aClass365_1, true).method7953(local204 + Static475.aClass365_2.anInt10318, local212 - (-local35 + local161), local26 - Static475.aClass365_2.anInt10318 * 2, local161);
			Static203.aClass365_1.method8162();
			local142.method6882(local26 - local165 * 2, Static198.anInt4278 | 0xFF000000, 1, 0, null, local212 + local165, arg1, 1, local165 + local204, 0, 0, -1, null, null, local35 - local165 * 2);
			Static587.method1502(local204, local26, local35, local212);
		} else {
			local26 = arg3.method7368(null, arg1, 250);
			local35 = arg3.method7373(250, arg1, null) * 13;
			arg2.J(6, 6, local26 + 4 + 4, local35 + 4 + 4, -16777216, 0);
			arg2.method8035(6, 6, local26 + 4 + 4, local35 - -4 - -4, -1, 0);
			arg0.method6882(local26, -1, 1, 0, null, 10, arg1, 1, 10, 0, 0, -1, null, null, local35);
			Static587.method1502(6, local26 + 4 + 4, local35 - -4 + 4, 6);
		}
		if (arg4) {
			try {
				arg2.method8082();
			} catch (@Pc(437) Exception_Sub1 local437) {
			}
		}
	}
}
