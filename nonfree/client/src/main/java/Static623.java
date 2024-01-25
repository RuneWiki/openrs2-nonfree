import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static623 {

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "[I")
	public static int[] anIntArray575 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V")
	public static void method8439() {
		if (!Static555.aBoolean678) {
			Static367.aBoolean490 = Static52.anInt867 != -1 && Static52.anInt867 <= Static285.anInt5168 || Static272.anInt5005 < Static285.anInt5168 * 16 + (Static470.aBoolean628 ? 26 : 22);
		}
		Static41.aClass357_2.method8403();
		Static345.aClass357_29.method8403();
		@Pc(60) int local60;
		for (@Pc(53) Class3_Sub4_Sub5 local53 = (Class3_Sub4_Sub5) Static562.aClass357_54.method8391(); local53 != null; local53 = (Class3_Sub4_Sub5) Static562.aClass357_54.method8392()) {
			local60 = local53.anInt2775;
			if (local60 < 1000) {
				local53.method9446();
				if (local60 == 57 || local60 == 2 || local60 == 30 || local60 == 16 || local60 == 47 || local60 == 17 || local60 == 50) {
					Static345.aClass357_29.method8401(local53);
				} else {
					Static41.aClass357_2.method8401(local53);
				}
			}
		}
		Static41.aClass357_2.method8393(Static562.aClass357_54);
		Static345.aClass357_29.method8393(Static562.aClass357_54);
		if (-28235 != -28235) {
			anIntArray575 = null;
		}
		if (Static285.anInt5168 > 1) {
			if (Static27.aBoolean15 && Static419.aClass133_1.method3450(81) && Static285.anInt5168 > 2) {
				Static693.aClass3_Sub4_Sub5_4 = (Class3_Sub4_Sub5) Static562.aClass357_54.aClass3_303.aClass3_342.aClass3_342;
			} else {
				Static693.aClass3_Sub4_Sub5_4 = (Class3_Sub4_Sub5) Static562.aClass357_54.aClass3_303.aClass3_342;
			}
			Static424.aClass3_Sub4_Sub5_3 = (Class3_Sub4_Sub5) Static562.aClass357_54.aClass3_303.aClass3_342;
		} else {
			Static424.aClass3_Sub4_Sub5_3 = null;
			Static693.aClass3_Sub4_Sub5_4 = null;
		}
		local60 = -1;
		@Pc(207) Class3_Sub14 local207 = (Class3_Sub14) Static641.aClass357_61.method8391();
		if (local207 != null) {
			local60 = local207.method4295();
		}
		if (!Static555.aBoolean678) {
			if (local60 == 0 && (Static78.anInt1229 == 1 && Static285.anInt5168 > 2 || Static79.method1033())) {
				local60 = 2;
			}
			if (local60 == 2 && Static285.anInt5168 > 0 && local207 != null) {
				if (Static509.aClass20_16 == null && Static618.anInt6009 == 0) {
					Static165.method2652(local207.method4294(), local207.method4292());
				} else {
					Static470.anInt8264 = 2;
				}
			}
			if (local60 == 0) {
				if (Static693.aClass3_Sub4_Sub5_4 != null) {
					Static366.method5242();
				} else if (Static212.aBoolean297) {
					Static427.method6535();
				}
			}
			if (Static509.aClass20_16 == null && Static618.anInt6009 == 0) {
				Static470.anInt8264 = 0;
				Static356.aClass3_Sub4_Sub5_1 = null;
			}
			return;
		}
		@Pc(324) int local324;
		@Pc(328) int local328;
		@Pc(429) int local429;
		@Pc(431) int local431;
		if (local60 == -1) {
			local324 = Static714.aClass161_1.method8581();
			local328 = Static714.aClass161_1.method8573();
			@Pc(330) boolean local330 = false;
			if (Static239.aClass3_Sub4_Sub17_1 != null) {
				if (Static614.anInt9938 - 10 <= local324 && local324 <= Static614.anInt9938 + Static618.anInt6014 + 10 && local328 >= Static725.anInt11302 - 10 && Static725.anInt11302 + Static382.anInt6839 + 10 >= local328) {
					local330 = true;
				} else {
					Static59.method729();
				}
			}
			if (!local330) {
				if (local324 < Static121.anInt2335 - 10 || Static121.anInt2335 + Static655.anInt10491 + 10 < local324 || Static65.anInt1025 - 10 > local328 || Static65.anInt1025 + Static188.anInt3322 + 10 < local328) {
					Static49.method652();
				} else if (Static367.aBoolean490) {
					local429 = -1;
					local431 = -1;
					@Pc(447) int local447;
					for (@Pc(433) int local433 = 0; local433 < Static332.anInt5826; local433++) {
						if (Static470.aBoolean628) {
							local447 = Static65.anInt1025 + local433 * 16 + 33;
							if (local328 > local447 - 13 && local447 + 4 > local328) {
								local431 = local447 - 13;
								local429 = local433;
								break;
							}
						} else {
							local447 = local433 * 16 + Static65.anInt1025 + 31;
							if (local328 > local447 - 13 && local447 + 3 > local328) {
								local431 = local447 - 13;
								local429 = local433;
								break;
							}
						}
					}
					if (local429 != -1) {
						local447 = 0;
						@Pc(528) Class54 local528 = new Class54(Static555.aClass283_12);
						for (@Pc(533) Class3_Sub4_Sub17 local533 = (Class3_Sub4_Sub17) local528.method1077(); local533 != null; local533 = (Class3_Sub4_Sub17) local528.method1074()) {
							if (local429 == local447) {
								if (local533.anInt8611 > 1) {
									Static370.method5349(local431, local533, local328);
								}
								break;
							}
							local447++;
						}
					}
				}
			}
		}
		if (local60 != 0) {
			return;
		}
		local324 = local207.method4292();
		local328 = local207.method4294();
		@Pc(661) int local661;
		@Pc(743) Class54 local743;
		@Pc(882) Class3_Sub4_Sub5 local882;
		if (Static239.aClass3_Sub4_Sub17_1 != null && Static614.anInt9938 <= local324 && Static618.anInt6014 + Static614.anInt9938 >= local324 && Static725.anInt11302 <= local328 && Static382.anInt6839 + Static725.anInt11302 >= local328) {
			local661 = -1;
			for (local429 = 0; local429 < Static239.aClass3_Sub4_Sub17_1.anInt8611; local429++) {
				if (Static470.aBoolean628) {
					local431 = Static725.anInt11302 + local429 * 16 + 33;
					if (local328 > local431 - 13 && local431 + 4 > local328) {
						local661 = local429;
					}
				} else {
					local431 = Static725.anInt11302 + local429 * 16 + 31;
					if (local431 - 13 < local328 && local431 + 3 > local328) {
						local661 = local429;
					}
				}
			}
			if (local661 != -1) {
				local431 = 0;
				local743 = new Class54(Static239.aClass3_Sub4_Sub17_1.aClass283_10);
				for (local882 = (Class3_Sub4_Sub5) local743.method1077(); local882 != null; local882 = (Class3_Sub4_Sub5) local743.method1074()) {
					if (local431 == local661) {
						Static2.method9131(local882, local324, local328);
						break;
					}
					local431++;
				}
			}
			Static49.method652();
			return;
		}
		if (Static121.anInt2335 > local324 || Static121.anInt2335 + Static655.anInt10491 < local324 || Static65.anInt1025 > local328 || Static65.anInt1025 + Static188.anInt3322 < local328) {
			return;
		}
		if (Static367.aBoolean490) {
			local661 = -1;
			for (local429 = 0; local429 < Static332.anInt5826; local429++) {
				if (Static470.aBoolean628) {
					local431 = Static65.anInt1025 + local429 * 16 + 33;
					if (local328 > local431 - 13 && local328 < local431 + 4) {
						local661 = local429;
						break;
					}
				} else {
					local431 = Static65.anInt1025 + local429 * 16 + 31;
					if (local431 - 13 < local328 && local431 + 3 > local328) {
						local661 = local429;
						break;
					}
				}
			}
			if (local661 != -1) {
				local431 = 0;
				local743 = new Class54(Static555.aClass283_12);
				for (@Pc(748) Class3_Sub4_Sub17 local748 = (Class3_Sub4_Sub17) local743.method1077(); local748 != null; local748 = (Class3_Sub4_Sub17) local743.method1074()) {
					if (local661 == local431) {
						Static2.method9131((Class3_Sub4_Sub5) local748.aClass283_10.aClass3_Sub4_51.aClass3_Sub4_66, local324, local328);
						Static49.method652();
						return;
					}
					local431++;
				}
				return;
			}
		} else {
			local661 = -1;
			for (local429 = 0; local429 < Static285.anInt5168; local429++) {
				if (Static470.aBoolean628) {
					local431 = (Static285.anInt5168 - local429 - 1) * 16 + Static65.anInt1025 + 33;
					if (local431 - 13 < local328 && local431 + 4 > local328) {
						local661 = local429;
					}
				} else {
					local431 = Static65.anInt1025 + (Static285.anInt5168 - local429 - 1) * 16 + 31;
					if (local328 > local431 - 13 && local431 + 3 > local328) {
						local661 = local429;
					}
				}
			}
			if (local661 != -1) {
				local431 = 0;
				@Pc(877) Class60 local877 = new Class60(Static562.aClass357_54);
				for (local882 = (Class3_Sub4_Sub5) local877.method1304(); local882 != null; local882 = (Class3_Sub4_Sub5) local877.method1305()) {
					if (local431 == local661) {
						Static2.method9131(local882, local324, local328);
						break;
					}
					local431++;
				}
			}
			Static49.method652();
		}
		return;
	}
}
