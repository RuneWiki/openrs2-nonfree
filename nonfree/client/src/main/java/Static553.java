import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static553 {

	@OriginalMember(owner = "client!sea", name = "b", descriptor = "I")
	public static int anInt9261;

	@OriginalMember(owner = "client!sea", name = "k", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_229 = new Class160(1, 2);

	@OriginalMember(owner = "client!sea", name = "e", descriptor = "Lclient!rl;")
	public static final Class317 aClass317_60 = new Class317(8);

	@OriginalMember(owner = "client!sea", name = "c", descriptor = "I")
	public static int anInt9258 = 0;

	@OriginalMember(owner = "client!sea", name = "g", descriptor = "I")
	public static int anInt9259 = 0;

	@OriginalMember(owner = "client!sea", name = "i", descriptor = "I")
	public static int anInt9260 = -1;

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(I)V")
	public static void method7985() {
		if (!Static455.aBoolean533) {
			Static35.aBoolean45 = Static187.anInt3103 != -1 && Static638.anInt10454 >= Static187.anInt3103 || Static638.anInt10454 * 16 + (Static575.aBoolean661 ? 26 : 22) > Static506.anInt8791;
		}
		Static123.aClass32_11.method588();
		Static227.aClass32_21.method588();
		@Pc(64) int local64;
		for (@Pc(57) Class14_Sub2_Sub20 local57 = (Class14_Sub2_Sub20) Static111.aClass32_7.method584(); local57 != null; local57 = (Class14_Sub2_Sub20) Static111.aClass32_7.method577()) {
			local64 = local57.anInt10001;
			if (local64 < 1000) {
				local57.method9513();
				if (local64 == 23 || local64 == 12 || local64 == 60 || local64 == 4 || local64 == 13 || local64 == 50 || local64 == 47) {
					Static227.aClass32_21.method582(local57);
				} else {
					Static123.aClass32_11.method582(local57);
				}
			}
		}
		Static123.aClass32_11.method590(Static111.aClass32_7);
		Static227.aClass32_21.method590(Static111.aClass32_7);
		if (Static638.anInt10454 > 1) {
			if (Static477.aBoolean585 && Static89.aClass207_3.method5068(81) && Static638.anInt10454 > 2) {
				Static379.aClass14_Sub2_Sub20_3 = (Class14_Sub2_Sub20) Static111.aClass32_7.aClass14_27.aClass14_340.aClass14_340;
			} else {
				Static379.aClass14_Sub2_Sub20_3 = (Class14_Sub2_Sub20) Static111.aClass32_7.aClass14_27.aClass14_340;
			}
			Static359.aClass14_Sub2_Sub20_2 = (Class14_Sub2_Sub20) Static111.aClass32_7.aClass14_27.aClass14_340;
		} else {
			Static379.aClass14_Sub2_Sub20_3 = null;
			Static359.aClass14_Sub2_Sub20_2 = null;
		}
		local64 = -1;
		@Pc(208) Class14_Sub29 local208 = (Class14_Sub29) Static477.aClass32_54.method584();
		if (local208 != null) {
			local64 = local208.method7856();
		}
		if (!Static455.aBoolean533) {
			if (local64 == 0 && (Static237.anInt4576 == 1 && Static638.anInt10454 > 2 || Static407.method2877())) {
				local64 = 2;
			}
			if (local64 == 2 && Static638.anInt10454 > 0 && local208 != null) {
				if (Static649.aClass299_12 == null && Static563.anInt4937 == 0) {
					Static515.method7649(local208.method7858(), local208.method7859());
				} else {
					Static223.anInt4348 = 2;
				}
			}
			if (local64 == 0) {
				if (Static379.aClass14_Sub2_Sub20_3 != null) {
					Static175.method2584();
				} else if (Static546.aBoolean727) {
					Static214.method3269();
				}
			}
			if (Static649.aClass299_12 != null || Static563.anInt4937 != 0) {
				return;
			}
			Static223.anInt4348 = 0;
			Static594.aClass14_Sub2_Sub20_4 = null;
			return;
		}
		@Pc(225) int local225;
		@Pc(229) int local229;
		@Pc(335) int local335;
		@Pc(337) int local337;
		if (local64 == -1) {
			local225 = Static656.aClass118_1.method7586();
			local229 = Static656.aClass118_1.method7590();
			@Pc(231) boolean local231 = false;
			if (Static52.aClass14_Sub2_Sub17_1 != null) {
				if (local225 >= Static406.anInt7035 - 10 && Static406.anInt7035 + Static91.anInt1595 + 10 >= local225 && local229 >= Static381.anInt6705 - 10 && Static345.anInt5864 + Static381.anInt6705 + 10 >= local229) {
					local231 = true;
				} else {
					Static285.method4777();
				}
			}
			if (!local231) {
				if (local225 < Static189.anInt3199 - 10 || local225 > Static501.anInt8738 + Static189.anInt3199 + 10 || Static78.anInt1261 - 10 > local229 || Static78.anInt1261 + Static252.anInt4767 + 10 < local229) {
					Static465.method6860();
				} else if (Static35.aBoolean45) {
					local335 = -1;
					local337 = -1;
					@Pc(353) int local353;
					for (@Pc(339) int local339 = 0; local339 < Static164.anInt2537; local339++) {
						if (Static575.aBoolean661) {
							local353 = local339 * 16 + Static78.anInt1261 + 33;
							if (local353 - 13 < local229 && local229 < local353 + 4) {
								local335 = local339;
								local337 = local353 - 13;
								break;
							}
						} else {
							local353 = Static78.anInt1261 + local339 * 16 + 31;
							if (local229 > local353 - 13 && local353 + 3 > local229) {
								local335 = local339;
								local337 = local353 - 13;
								break;
							}
						}
					}
					if (local335 != -1) {
						local353 = 0;
						@Pc(438) Class44 local438 = new Class44(Static440.aClass269_60);
						for (@Pc(443) Class14_Sub2_Sub17 local443 = (Class14_Sub2_Sub17) local438.method805(); local443 != null; local443 = (Class14_Sub2_Sub17) local438.method808()) {
							if (local353 == local335) {
								if (local443.anInt9298 > 1) {
									Static428.method6434(local443, local229, local337);
								}
								break;
							}
							local353++;
						}
					}
				}
			}
		}
		if (local64 != 0) {
			return;
		}
		local225 = local208.method7858();
		local229 = local208.method7859();
		@Pc(571) int local571;
		@Pc(785) Class44 local785;
		@Pc(668) Class14_Sub2_Sub20 local668;
		if (Static52.aClass14_Sub2_Sub17_1 != null && Static406.anInt7035 <= local225 && Static91.anInt1595 + Static406.anInt7035 >= local225 && Static381.anInt6705 <= local229 && Static381.anInt6705 + Static345.anInt5864 >= local229) {
			local571 = -1;
			for (local335 = 0; local335 < Static52.aClass14_Sub2_Sub17_1.anInt9298; local335++) {
				if (Static575.aBoolean661) {
					local337 = Static381.anInt6705 + local335 * 16 + 33;
					if (local229 > local337 - 13 && local229 < local337 + 4) {
						local571 = local335;
					}
				} else {
					local337 = local335 * 16 + Static381.anInt6705 + 31;
					if (local337 - 13 < local229 && local229 < local337 + 3) {
						local571 = local335;
					}
				}
			}
			if (local571 != -1) {
				local337 = 0;
				local785 = new Class44(Static52.aClass14_Sub2_Sub17_1.aClass269_142);
				for (local668 = (Class14_Sub2_Sub20) local785.method805(); local668 != null; local668 = (Class14_Sub2_Sub20) local785.method808()) {
					if (local337 == local571) {
						Static131.method2013(local668, local225, local229);
						break;
					}
					local337++;
				}
			}
			Static465.method6860();
			return;
		}
		if (Static189.anInt3199 > local225 || local225 > Static189.anInt3199 + Static501.anInt8738 || local229 < Static78.anInt1261 || local229 > Static252.anInt4767 + Static78.anInt1261) {
			return;
		}
		if (!Static35.aBoolean45) {
			local571 = -1;
			for (local335 = 0; local335 < Static638.anInt10454; local335++) {
				if (Static575.aBoolean661) {
					local337 = Static78.anInt1261 + (Static638.anInt10454 + -1 + -local335) * 16 + 33;
					if (local229 > local337 - 13 && local337 + 4 > local229) {
						local571 = local335;
					}
				} else {
					local337 = Static78.anInt1261 + (Static638.anInt10454 - local335 - 1) * 16 + 31;
					if (local229 > local337 - 13 && local337 + 3 > local229) {
						local571 = local335;
					}
				}
			}
			if (local571 != -1) {
				local337 = 0;
				@Pc(663) Class140 local663 = new Class140(Static111.aClass32_7);
				for (local668 = (Class14_Sub2_Sub20) local663.method3019(); local668 != null; local668 = (Class14_Sub2_Sub20) local663.method3016()) {
					if (local571 == local337) {
						Static131.method2013(local668, local225, local229);
						break;
					}
					local337++;
				}
			}
			Static465.method6860();
			return;
		}
		local571 = -1;
		for (local335 = 0; local335 < Static164.anInt2537; local335++) {
			if (Static575.aBoolean661) {
				local337 = local335 * 16 + Static78.anInt1261 + 33;
				if (local229 > local337 - 13 && local229 < local337 + 4) {
					local571 = local335;
					break;
				}
			} else {
				local337 = Static78.anInt1261 + local335 * 16 + 31;
				if (local229 > local337 - 13 && local337 + 3 > local229) {
					local571 = local335;
					break;
				}
			}
		}
		if (local571 == -1) {
			return;
		}
		local337 = 0;
		local785 = new Class44(Static440.aClass269_60);
		for (@Pc(792) Class14_Sub2_Sub17 local792 = (Class14_Sub2_Sub17) local785.method805(); local792 != null; local792 = (Class14_Sub2_Sub17) local785.method808()) {
			if (local571 == local337) {
				Static131.method2013((Class14_Sub2_Sub20) local792.aClass269_142.aClass14_Sub2_42.aClass14_Sub2_67, local225, local229);
				Static465.method6860();
				return;
			}
			local337++;
		}
		return;
	}
}
