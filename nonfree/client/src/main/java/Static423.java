import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static423 {

	@OriginalMember(owner = "client!oha", name = "b", descriptor = "I")
	public static int anInt10674;

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(B)V")
	public static void method9003() {
		if (!Static490.aBoolean536) {
			Static83.aBoolean120 = Static52.anInt915 != -1 && Static52.anInt915 <= Static651.anInt10662 || (Static116.aBoolean570 ? 26 : 22) + Static651.anInt10662 * 16 > Static256.anInt4629;
		}
		Static497.aClass20_45.method374();
		Static373.aClass20_30.method374();
		@Pc(64) int local64;
		for (@Pc(57) Class5_Sub1_Sub13 local57 = (Class5_Sub1_Sub13) Static399.aClass20_33.method378(); local57 != null; local57 = (Class5_Sub1_Sub13) Static399.aClass20_33.method366()) {
			local64 = local57.anInt6068;
			if (local64 < 1000) {
				local57.method9222();
				if (local64 == 15 || local64 == 45 || local64 == 59 || local64 == 52 || local64 == 13 || local64 == 5 || local64 == 9) {
					Static373.aClass20_30.method370(local57);
				} else {
					Static497.aClass20_45.method370(local57);
				}
			}
		}
		Static497.aClass20_45.method368(Static399.aClass20_33);
		Static373.aClass20_30.method368(Static399.aClass20_33);
		if (Static651.anInt10662 > 1) {
			if (Static468.aBoolean513 && Static53.aClass297_1.method6737(81) && Static651.anInt10662 > 2) {
				Static396.aClass5_Sub1_Sub13_2 = (Class5_Sub1_Sub13) Static399.aClass20_33.aClass5_19.aClass5_337.aClass5_337;
			} else {
				Static396.aClass5_Sub1_Sub13_2 = (Class5_Sub1_Sub13) Static399.aClass20_33.aClass5_19.aClass5_337;
			}
			Static373.aClass5_Sub1_Sub13_1 = (Class5_Sub1_Sub13) Static399.aClass20_33.aClass5_19.aClass5_337;
		} else {
			Static373.aClass5_Sub1_Sub13_1 = null;
			Static396.aClass5_Sub1_Sub13_2 = null;
		}
		local64 = -1;
		@Pc(208) Class5_Sub10 local208 = (Class5_Sub10) Static433.aClass20_37.method378();
		if (local208 != null) {
			local64 = local208.method7046();
		}
		if (!Static490.aBoolean536) {
			if (local64 == 0 && (Static446.anInt7312 == 1 && Static651.anInt10662 > 2 || Static308.method4795())) {
				local64 = 2;
			}
			if (local64 == 2 && Static651.anInt10662 > 0 && local208 != null) {
				if (Static388.aClass238_11 == null && Static195.anInt3567 == 0) {
					Static325.method4957(local208.method7042(), local208.method7039());
				} else {
					Static233.anInt4001 = 2;
				}
			}
			if (local64 == 0) {
				if (Static396.aClass5_Sub1_Sub13_2 != null) {
					Static528.method7227();
				} else if (Static421.aBoolean472) {
					Static55.method973();
				}
			}
			if (Static388.aClass238_11 == null && Static195.anInt3567 == 0) {
				Static233.anInt4001 = 0;
				Static660.aClass5_Sub1_Sub13_4 = null;
			}
			return;
		}
		@Pc(327) int local327;
		@Pc(331) int local331;
		@Pc(438) int local438;
		@Pc(440) int local440;
		if (local64 == -1) {
			local327 = Static300.aClass164_1.method4999();
			local331 = Static300.aClass164_1.method5000();
			@Pc(333) boolean local333 = false;
			if (Static272.aClass5_Sub1_Sub20_1 != null) {
				if (local327 >= Static240.anInt4167 - 10 && local327 <= Static498.anInt8035 + Static240.anInt4167 + 10 && local331 >= Static145.anInt2900 - 10 && local331 <= Static389.anInt1887 + Static145.anInt2900 + 10) {
					local333 = true;
				} else {
					Static175.method1208();
				}
			}
			if (!local333) {
				if (Static32.anInt5104 - 10 > local327 || local327 > Static482.anInt7810 + Static32.anInt5104 + 10 || Static619.anInt9981 - 10 > local331 || local331 > Static619.anInt9981 + Static515.anInt8186 + 10) {
					Static438.method6290();
				} else if (Static83.aBoolean120) {
					local438 = -1;
					local440 = -1;
					@Pc(456) int local456;
					for (@Pc(442) int local442 = 0; local442 < Static530.anInt8424; local442++) {
						if (Static116.aBoolean570) {
							local456 = Static619.anInt9981 + local442 * 16 + 33;
							if (local456 - 13 < local331 && local331 < local456 + 4) {
								local440 = local456 - 13;
								local438 = local442;
								break;
							}
						} else {
							local456 = local442 * 16 + Static619.anInt9981 + 31;
							if (local331 > local456 - 13 && local456 + 3 > local331) {
								local440 = local456 - 13;
								local438 = local442;
								break;
							}
						}
					}
					if (local438 != -1) {
						local456 = 0;
						@Pc(541) Class153 local541 = new Class153(Static244.aClass388_5);
						for (@Pc(546) Class5_Sub1_Sub20 local546 = (Class5_Sub1_Sub20) local541.method3423(); local546 != null; local546 = (Class5_Sub1_Sub20) local541.method3425()) {
							if (local438 == local456) {
								if (local546.anInt9857 > 1) {
									Static199.method3309(local440, local331, local546);
								}
								break;
							}
							local456++;
						}
					}
				}
			}
		}
		if (local64 != 0) {
			return;
		}
		local327 = local208.method7039();
		local331 = local208.method7042();
		@Pc(626) int local626;
		@Pc(713) Class153 local713;
		@Pc(718) Class5_Sub1_Sub13 local718;
		if (Static272.aClass5_Sub1_Sub20_1 != null && Static240.anInt4167 <= local327 && local327 <= Static240.anInt4167 + Static498.anInt8035 && Static145.anInt2900 <= local331 && local331 <= Static389.anInt1887 + Static145.anInt2900) {
			local626 = -1;
			for (local438 = 0; local438 < Static272.aClass5_Sub1_Sub20_1.anInt9857; local438++) {
				if (Static116.aBoolean570) {
					local440 = local438 * 16 + Static145.anInt2900 + 33;
					if (local331 > local440 - 13 && local331 < local440 + 4) {
						local626 = local438;
					}
				} else {
					local440 = Static145.anInt2900 + local438 * 16 + 31;
					if (local440 - 13 < local331 && local331 < local440 + 3) {
						local626 = local438;
					}
				}
			}
			if (local626 != -1) {
				local440 = 0;
				local713 = new Class153(Static272.aClass5_Sub1_Sub20_1.aClass388_14);
				for (local718 = (Class5_Sub1_Sub13) local713.method3423(); local718 != null; local718 = (Class5_Sub1_Sub13) local713.method3425()) {
					if (local626 == local440) {
						Static346.method4441(local327, local331, local718);
						break;
					}
					local440++;
				}
			}
			Static438.method6290();
			return;
		}
		if (local327 < Static32.anInt5104 || Static482.anInt7810 + Static32.anInt5104 < local327 || local331 < Static619.anInt9981 || Static619.anInt9981 + Static515.anInt8186 < local331) {
			return;
		}
		if (!Static83.aBoolean120) {
			local626 = -1;
			for (local438 = 0; local438 < Static651.anInt10662; local438++) {
				if (Static116.aBoolean570) {
					local440 = Static619.anInt9981 + (Static651.anInt10662 - local438 - 1) * 16 + 33;
					if (local440 - 13 < local331 && local331 < local440 + 4) {
						local626 = local438;
					}
				} else {
					local440 = (Static651.anInt10662 - local438 - 1) * 16 + Static619.anInt9981 + 31;
					if (local331 > local440 - 13 && local440 + 3 > local331) {
						local626 = local438;
					}
				}
			}
			if (local626 != -1) {
				local440 = 0;
				@Pc(866) Class215 local866 = new Class215(Static399.aClass20_33);
				for (local718 = (Class5_Sub1_Sub13) local866.method4913(); local718 != null; local718 = (Class5_Sub1_Sub13) local866.method4911()) {
					if (local440 == local626) {
						Static346.method4441(local327, local331, local718);
						break;
					}
					local440++;
				}
			}
			Static438.method6290();
			return;
		}
		local626 = -1;
		for (local438 = 0; local438 < Static530.anInt8424; local438++) {
			if (Static116.aBoolean570) {
				local440 = Static619.anInt9981 + local438 * 16 + 33;
				if (local331 > local440 - 13 && local331 < local440 + 4) {
					local626 = local438;
					break;
				}
			} else {
				local440 = Static619.anInt9981 + local438 * 16 + 31;
				if (local331 > local440 - 13 && local331 < local440 + 3) {
					local626 = local438;
					break;
				}
			}
		}
		if (local626 == -1) {
			return;
		}
		local440 = 0;
		local713 = new Class153(Static244.aClass388_5);
		for (@Pc(1001) Class5_Sub1_Sub20 local1001 = (Class5_Sub1_Sub20) local713.method3423(); local1001 != null; local1001 = (Class5_Sub1_Sub20) local713.method3425()) {
			if (local440 == local626) {
				Static346.method4441(local327, local331, (Class5_Sub1_Sub13) local1001.aClass388_14.aClass5_Sub1_66.aClass5_Sub1_65);
				Static438.method6290();
				return;
			}
			local440++;
		}
		return;
	}
}
