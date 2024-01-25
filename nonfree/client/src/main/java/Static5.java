import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ac", name = "D", descriptor = "Lclient!sda;")
	public static Class301 aClass301_1;

	@OriginalMember(owner = "client!ac", name = "B", descriptor = "Lclient!jn;")
	public static final Class167 aClass167_1 = new Class167(64);

	@OriginalMember(owner = "client!ac", name = "i", descriptor = "(I)V")
	public static void method114() {
		Static472.aClass22_58.method886();
		Static16.aClass22_42.method886();
		@Pc(23) int local23;
		for (@Pc(18) Class4_Sub36 local18 = (Class4_Sub36) Static593.aClass22_65.method895(); local18 != null; local18 = (Class4_Sub36) Static593.aClass22_65.method889()) {
			local23 = local18.anInt7137;
			if (local23 < 1000) {
				local18.method8193();
				if (local23 == 16 || local23 == 57 || local23 == 11 || local23 == 19 || local23 == 59 || local23 == 6 || local23 == 10) {
					Static16.aClass22_42.method894(local18);
				} else {
					Static472.aClass22_58.method894(local18);
				}
			}
		}
		Static472.aClass22_58.method881(Static593.aClass22_65);
		Static16.aClass22_42.method881(Static593.aClass22_65);
		if (Static384.anInt7556 <= 1) {
			Static367.aClass4_Sub36_4 = null;
		} else if (Static405.aBoolean565 && Static38.aClass174_1.method4090(81) && Static384.anInt7556 > 2) {
			Static367.aClass4_Sub36_4 = (Class4_Sub36) Static593.aClass22_65.aClass4_13.aClass4_285.aClass4_285;
		} else {
			Static367.aClass4_Sub36_4 = (Class4_Sub36) Static593.aClass22_65.aClass4_13.aClass4_285;
		}
		local23 = -1;
		@Pc(135) Class4_Sub24 local135 = (Class4_Sub24) Static36.aClass22_13.method895();
		if (local135 != null) {
			local23 = local135.method6389();
		}
		if (!Static117.aBoolean207) {
			if (local23 == 0 && (Static265.anInt5333 == 1 && Static384.anInt7556 > 2 || Static115.method2105())) {
				local23 = 2;
			}
			if (local23 == 2 && Static384.anInt7556 > 0 && local135 != null) {
				if (Static292.aClass155_7 == null && Static322.anInt6367 == 0) {
					Static355.method5359(local135.method6394(), local135.method6390());
				} else {
					Static214.anInt4500 = 2;
				}
			}
			if (local23 == 0 && Static384.anInt7556 > 0) {
				Static28.method915();
			}
			if (Static292.aClass155_7 == null && Static322.anInt6367 == 0) {
				Static214.anInt4500 = 0;
				Static474.aClass4_Sub36_3 = null;
				return;
			}
			return;
		}
		@Pc(211) int local211;
		@Pc(215) int local215;
		if (local23 == -1) {
			local211 = Static294.aClass83_1.method6895();
			local215 = Static294.aClass83_1.method6896();
			if (local211 < Static593.anInt10604 - 10 || local211 > Static593.anInt10604 + Static303.anInt6098 + 10 || Static469.anInt8895 - 10 > local215 || Static340.anInt6537 + Static469.anInt8895 + 10 < local215) {
				Static221.method954();
			}
		}
		if (local23 != 0) {
			return;
		}
		local211 = Static593.anInt10604;
		local215 = Static469.anInt8895;
		@Pc(253) int local253 = Static303.anInt6098;
		@Pc(259) int local259 = local135.method6394();
		@Pc(263) int local263 = local135.method6390();
		@Pc(265) int local265 = -1;
		@Pc(283) int local283;
		for (@Pc(267) int local267 = 0; local267 < Static384.anInt7556; local267++) {
			if (Static70.aBoolean150) {
				local283 = local215 + (Static384.anInt7556 - local267 + -1) * 16 + 33;
				if (local259 > local211 && local253 + local211 > local259 && local283 - 13 < local263 && local283 + 4 > local263) {
					local265 = local267;
				}
			} else {
				local283 = local215 + (Static384.anInt7556 + -1 - local267) * 16 + 31;
				if (local259 > local211 && local259 < local253 + local211 && local263 > local283 - 13 && local283 + 3 > local263) {
					local265 = local267;
				}
			}
		}
		if (local265 != -1) {
			local283 = 0;
			@Pc(364) Class92 local364 = new Class92(Static593.aClass22_65);
			for (@Pc(371) Class4_Sub36 local371 = (Class4_Sub36) local364.method2165(); local371 != null; local371 = (Class4_Sub36) local364.method2168()) {
				if (local265 == local283) {
					Static360.method5445(local259, local263, local371);
				}
				local283++;
			}
		}
		Static221.method954();
	}
}
