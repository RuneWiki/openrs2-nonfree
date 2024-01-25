import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static373 {

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Z)V")
	public static void method5904() {
		Static123.aClass249_15.method6530();
		for (@Pc(13) Class2_Sub44 local13 = (Class2_Sub44) Static448.aClass249_63.method6527(); local13 != null; local13 = (Class2_Sub44) Static448.aClass249_63.method6525()) {
			if (local13.anInt8460 < 1000) {
				local13.method7802();
				Static123.aClass249_15.method6523(local13);
			}
		}
		Static123.aClass249_15.method6518(Static448.aClass249_63);
		if (Static323.anInt6016 <= 1) {
			Static431.aClass2_Sub44_3 = null;
		} else if (Static150.aBoolean224 && Static311.aClass189_1.method4710(81) && Static323.anInt6016 > 2) {
			Static431.aClass2_Sub44_3 = (Class2_Sub44) Static448.aClass249_63.aClass2_224.aClass2_283.aClass2_283;
		} else {
			Static431.aClass2_Sub44_3 = (Class2_Sub44) Static448.aClass249_63.aClass2_224.aClass2_283;
		}
		@Pc(75) int local75 = -1;
		@Pc(80) Class2_Sub26 local80 = (Class2_Sub26) Static431.aClass249_61.method6527();
		if (local80 != null) {
			local75 = local80.method6655();
		}
		if (!Static452.aBoolean600) {
			if (local75 == 0 && (Static539.anInt9337 == 1 && Static323.anInt6016 > 2 || Static388.method6241())) {
				local75 = 2;
			}
			if (local75 == 2 && Static323.anInt6016 > 0 && local80 != null) {
				if (Static72.aClass310_4 == null && Static358.anInt6807 == 0) {
					Static361.method5813(local80.method6660(), local80.method6659());
				} else {
					Static75.anInt1562 = 2;
				}
			}
			if (local75 == 0 && Static323.anInt6016 > 0) {
				Static125.method2365();
			}
			if (Static72.aClass310_4 == null && Static358.anInt6807 == 0) {
				Static355.aClass2_Sub44_1 = null;
				Static75.anInt1562 = 0;
				return;
			}
			return;
		}
		@Pc(161) int local161;
		@Pc(165) int local165;
		if (local75 == -1) {
			local161 = Static61.aClass214_1.method7241();
			local165 = Static61.aClass214_1.method7240();
			if (Static536.anInt9313 - 10 > local161 || Static536.anInt9313 + Static529.anInt9144 + 10 < local161 || local165 < Static178.anInt3307 - 10 || local165 > Static193.anInt3519 + Static178.anInt3307 + 10) {
				Static340.method5355();
			}
		}
		if (local75 != 0) {
			return;
		}
		local161 = Static536.anInt9313;
		local165 = Static178.anInt3307;
		@Pc(210) int local210 = Static529.anInt9144;
		@Pc(214) int local214 = local80.method6659();
		@Pc(218) int local218 = local80.method6660();
		@Pc(220) int local220 = -1;
		@Pc(238) int local238;
		for (@Pc(222) int local222 = 0; local222 < Static323.anInt6016; local222++) {
			if (Static254.aBoolean340) {
				local238 = local165 + (-local222 + Static323.anInt6016 - 1) * 16 + 33;
				if (local161 < local214 && local161 + local210 > local214 && local218 > local238 - 13 && local218 < local238 + 4) {
					local220 = local222;
				}
			} else {
				local238 = local165 + (Static323.anInt6016 - (local222 + 1)) * 16 + 31;
				if (local161 < local214 && local214 < local161 + local210 && local218 > local238 - 13 && local238 + 3 > local218) {
					local220 = local222;
				}
			}
		}
		if (local220 != -1) {
			local238 = 0;
			@Pc(324) Class291 local324 = new Class291(Static448.aClass249_63);
			for (@Pc(329) Class2_Sub44 local329 = (Class2_Sub44) local324.method7336(); local329 != null; local329 = (Class2_Sub44) local324.method7338()) {
				if (local220 == local238) {
					Static411.method6445(local214, local329, local218);
				}
				local238++;
			}
		}
		Static340.method5355();
	}
}
