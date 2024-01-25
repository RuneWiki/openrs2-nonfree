import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!ih", name = "H", descriptor = "Ljava/lang/String;")
	public static String aString45 = "";

	@OriginalMember(owner = "client!ih", name = "ib", descriptor = "I")
	public static int anInt4543 = 0;

	@OriginalMember(owner = "client!ih", name = "ob", descriptor = "[Lclient!uh;")
	public static final Class334[] aClass334Array1 = new Class334[6];

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V")
	public static void method3809() {
		Static194.aClass124_20.method3265();
		Static559.aClass124_64.method3265();
		@Pc(26) int local26;
		for (@Pc(21) Class4_Sub18 local21 = (Class4_Sub18) Static354.aClass124_32.method3267(); local21 != null; local21 = (Class4_Sub18) Static354.aClass124_32.method3273()) {
			local26 = local21.anInt3158;
			if (local26 < 1000) {
				local21.method8013();
				if (local26 == 17 || local26 == 16 || local26 == 57 || local26 == 25 || local26 == 47 || local26 == 23 || local26 == 50) {
					Static559.aClass124_64.method3275(local21);
				} else {
					Static194.aClass124_20.method3275(local21);
				}
			}
		}
		Static194.aClass124_20.method3276(Static354.aClass124_32);
		Static559.aClass124_64.method3276(Static354.aClass124_32);
		if (Static300.anInt5730 <= 1) {
			Static268.aClass4_Sub18_2 = null;
		} else if (Static307.aBoolean423 && Static12.aClass173_1.method6259(81) && Static300.anInt5730 > 2) {
			Static268.aClass4_Sub18_2 = (Class4_Sub18) Static354.aClass124_32.aClass4_90.aClass4_288.aClass4_288;
		} else {
			Static268.aClass4_Sub18_2 = (Class4_Sub18) Static354.aClass124_32.aClass4_90.aClass4_288;
		}
		local26 = -1;
		@Pc(131) Class4_Sub22 local131 = (Class4_Sub22) Static324.aClass124_28.method3267();
		if (local131 != null) {
			local26 = local131.method7272();
		}
		if (!Static325.aBoolean431) {
			if (local26 == 0 && (Static7.anInt104 == 1 && Static300.anInt5730 > 2 || Static317.method4845())) {
				local26 = 2;
			}
			if (local26 == 2 && Static300.anInt5730 > 0 && local131 != null) {
				if (Static287.aClass115_12 == null && Static171.anInt3692 == 0) {
					Static73.method1302(local131.method7271(), local131.method7270());
				} else {
					Static526.anInt8940 = 2;
				}
			}
			if (local26 == 0 && Static300.anInt5730 > 0) {
				Static492.method7050();
			}
			if (Static287.aClass115_12 != null || Static171.anInt3692 != 0) {
				return;
			}
			Static22.aClass4_Sub18_1 = null;
			Static526.anInt8940 = 0;
			return;
		}
		@Pc(146) int local146;
		@Pc(150) int local150;
		if (local26 == -1) {
			local146 = Static86.aClass50_1.method7100();
			local150 = Static86.aClass50_1.method7102();
			if (Static473.anInt7981 - 10 > local146 || Static473.anInt7981 + Static100.anInt9640 + 10 < local146 || Static333.anInt5926 - 10 > local150 || Static333.anInt5926 + Static35.anInt711 + 10 < local150) {
				Static31.method556();
			}
		}
		if (local26 != 0) {
			return;
		}
		local146 = Static473.anInt7981;
		local150 = Static333.anInt5926;
		@Pc(199) int local199 = Static100.anInt9640;
		@Pc(203) int local203 = local131.method7271();
		@Pc(207) int local207 = local131.method7270();
		@Pc(209) int local209 = -1;
		@Pc(228) int local228;
		for (@Pc(211) int local211 = 0; local211 < Static300.anInt5730; local211++) {
			if (Static272.aBoolean390) {
				local228 = local150 + (-local211 + Static300.anInt5730 + -1) * 16 + 33;
				if (local203 > local146 && local146 + local199 > local203 && local228 - 13 < local207 && local207 < local228 + 4) {
					local209 = local211;
				}
			} else {
				local228 = (Static300.anInt5730 - local211 - 1) * 16 + local150 + 31;
				if (local146 < local203 && local146 + local199 > local203 && local207 > local228 - 13 && local228 + 3 > local207) {
					local209 = local211;
				}
			}
		}
		if (local209 != -1) {
			local228 = 0;
			@Pc(313) Class331 local313 = new Class331(Static354.aClass124_32);
			for (@Pc(318) Class4_Sub18 local318 = (Class4_Sub18) local313.method7399(); local318 != null; local318 = (Class4_Sub18) local313.method7401()) {
				if (local228 == local209) {
					Static145.method2994(local207, local203, local318);
				}
				local228++;
			}
		}
		Static31.method556();
		return;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!oa;)V")
	public static void method3812(@OriginalArg(0) Class66 arg0) {
		for (@Pc(1) int local1 = Static410.anInt7087; local1 < Static562.anInt9418; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static173.anInt3719; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static357.anInt6212; local7++) {
					@Pc(16) Class100 local16 = Static309.aClass100ArrayArrayArray2[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class10_Sub2 local21 = local16.aClass10_Sub2_3;
						@Pc(24) Class10_Sub2 local24 = local16.aClass10_Sub2_2;
						if (local21 != null && local21.method7730()) {
							Static296.method4633(arg0, local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method7730()) {
								Static296.method4633(arg0, local24, local1, local4, local7, 1, 1);
								local24.method7732(0, arg0, 0, local21, false, 0);
								local24.method7733();
							}
							local21.method7733();
						}
						for (@Pc(70) Class35 local70 = local16.aClass35_2; local70 != null; local70 = local70.aClass35_1) {
							@Pc(74) Class10_Sub1 local74 = local70.aClass10_Sub1_1;
							if (local74 != null && local74.method7730()) {
								Static296.method4633(arg0, local74, local1, local4, local7, local74.aShort118 + 1 - local74.aShort116, local74.aShort115 - local74.aShort117 + 1);
								local74.method7733();
							}
						}
						@Pc(111) Class10_Sub5 local111 = local16.aClass10_Sub5_1;
						if (local111 != null && local111.method7730()) {
							Static321.method4889(arg0, local111, local1, local4, local7);
							local111.method7733();
						}
					}
				}
			}
		}
	}
}
