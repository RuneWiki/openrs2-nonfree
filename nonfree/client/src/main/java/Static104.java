import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!du", name = "g", descriptor = "Lclient!fca;")
	public static final Class109 aClass109_3 = new Class109();

	@OriginalMember(owner = "client!du", name = "hb", descriptor = "Lclient!ec;")
	public static final Class88 aClass88_3 = new Class88(1);

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(III)V")
	public static void method1566(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class2_Sub42 local12 = Static249.method3910(Static123.aClass286_41, Static400.aClass145_2);
		local12.aClass2_Sub15_Sub2_2.method4290(arg0);
		local12.aClass2_Sub15_Sub2_2.method4316(arg1);
		Static531.method7296(local12);
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(Lclient!r;Lclient!kp;I)V")
	public static void method1573(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class196 arg1) {
		@Pc(36) boolean local36 = Static296.aClass218_1.method5060(arg1.anInt5157 | 0xFF000000, arg1.anInt5152, arg1.aBoolean405 ? Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.aClass194_1 : null, arg0, arg1.anInt5165, arg1.anInt5143, arg1.anInt5158) == null;
		if (local36) {
			Static221.aClass8_23.method212(new Class2_Sub51(arg1.anInt5152, arg1.anInt5165, arg1.anInt5143, arg1.anInt5157 | 0xFF000000, arg1.anInt5158, arg1.aBoolean405));
			Static515.method7134(arg1);
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(Z)V")
	public static void method1576() {
		Static125.aClass8_16.method220();
		Static198.aClass8_19.method220();
		@Pc(26) int local26;
		for (@Pc(16) Class2_Sub5 local16 = (Class2_Sub5) Static375.aClass8_38.method210(); local16 != null; local16 = (Class2_Sub5) Static375.aClass8_38.method218()) {
			local26 = local16.anInt902;
			if (local26 < 1000) {
				local16.method7966();
				if (local26 == 30 || local26 == 19 || local26 == 20 || local26 == 48 || local26 == 4 || local26 == 2 || local26 == 45) {
					Static198.aClass8_19.method212(local16);
				} else {
					Static125.aClass8_16.method212(local16);
				}
			}
		}
		Static125.aClass8_16.method222(Static375.aClass8_38);
		Static198.aClass8_19.method222(Static375.aClass8_38);
		if (Static347.anInt6255 <= 1) {
			Static542.aClass2_Sub5_3 = null;
		} else if (Static561.aBoolean709 && Static529.aClass177_10.method4001(81) && Static347.anInt6255 > 2) {
			Static542.aClass2_Sub5_3 = (Class2_Sub5) Static375.aClass8_38.aClass2_9.aClass2_285.aClass2_285;
		} else {
			Static542.aClass2_Sub5_3 = (Class2_Sub5) Static375.aClass8_38.aClass2_9.aClass2_285;
		}
		local26 = -1;
		@Pc(121) Class2_Sub16 local121 = (Class2_Sub16) Static445.aClass8_54.method210();
		if (local121 != null) {
			local26 = local121.method6008();
		}
		if (!Static167.aBoolean291) {
			if (local26 == 0 && (Static224.anInt4203 == 1 && Static347.anInt6255 > 2 || Static411.method5983())) {
				local26 = 2;
			}
			if (local26 == 2 && Static347.anInt6255 > 0 && local121 != null) {
				if (Static288.aClass196_3 == null && Static36.anInt909 == 0) {
					Static459.method6495(local121.method6004(), local121.method6005());
				} else {
					Static6.anInt294 = 2;
				}
			}
			if (local26 == 0 && Static347.anInt6255 > 0) {
				Static221.method3491();
			}
			if (Static288.aClass196_3 == null && Static36.anInt909 == 0) {
				Static6.anInt294 = 0;
				Static122.aClass2_Sub5_1 = null;
				return;
			}
			return;
		}
		@Pc(198) int local198;
		@Pc(202) int local202;
		if (local26 == -1) {
			local198 = Static326.aClass149_1.method5879();
			local202 = Static326.aClass149_1.method5875();
			if (local198 < Static344.anInt6231 - 10 || local198 > Static344.anInt6231 + Static23.anInt642 + 10 || local202 < Static202.anInt3966 - 10 || Static202.anInt3966 + Static306.anInt5446 + 10 < local202) {
				Static128.method2159();
			}
		}
		if (local26 != 0) {
			return;
		}
		local198 = Static344.anInt6231;
		local202 = Static202.anInt3966;
		@Pc(246) int local246 = Static23.anInt642;
		@Pc(250) int local250 = local121.method6004();
		@Pc(254) int local254 = local121.method6005();
		@Pc(256) int local256 = -1;
		@Pc(274) int local274;
		for (@Pc(258) int local258 = 0; local258 < Static347.anInt6255; local258++) {
			if (Static316.aBoolean475) {
				local274 = local202 + (Static347.anInt6255 - (local258 + 1)) * 16 + 33;
				if (local198 < local250 && local250 < local246 + local198 && local274 - 13 < local254 && local254 < local274 + 4) {
					local256 = local258;
				}
			} else {
				local274 = (Static347.anInt6255 - local258 - 1) * 16 + local202 + 31;
				if (local250 > local198 && local246 + local198 > local250 && local274 - 13 < local254 && local274 + 3 > local254) {
					local256 = local258;
				}
			}
		}
		if (local256 != -1) {
			local274 = 0;
			@Pc(350) Class308 local350 = new Class308(Static375.aClass8_38);
			for (@Pc(355) Class2_Sub5 local355 = (Class2_Sub5) local350.method6870(); local355 != null; local355 = (Class2_Sub5) local350.method6869()) {
				if (local274 == local256) {
					Static543.method7395(local254, local355, local250);
				}
				local274++;
			}
		}
		Static128.method2159();
	}
}
