import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static586 {

	@OriginalMember(owner = "client!uv", name = "i", descriptor = "I")
	public static int anInt9600;

	@OriginalMember(owner = "client!uv", name = "c", descriptor = "[I")
	public static final int[] anIntArray619 = new int[2048];

	@OriginalMember(owner = "client!uv", name = "j", descriptor = "[I")
	public static final int[] anIntArray620 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(B)V")
	public static void method8270() {
		Static557.aClass62_12 = null;
		Static524.aClass24Array17 = null;
		Static350.aClass24Array13 = null;
		Static636.aClass24Array21 = null;
		Static621.aClass24Array19 = null;
		Static255.aClass24Array11 = null;
		Static445.aClass24Array15 = null;
		Static101.aClass24Array6 = null;
		Static135.aClass24Array7 = null;
		Static2.aClass24Array1 = null;
		Static448.aClass24Array16 = null;
		Static480.aClass24_27 = null;
		Static287.aClass24_15 = null;
		Static544.aClass24Array18 = null;
		Static203.aClass24Array9 = null;
		Static622.aClass24Array20 = null;
		Static460.aClass62_9 = null;
		Static187.aClass62_4 = null;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIII)V")
	public static void method8271(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class77 local7 = Static330.aClass77ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class4_Sub1_Sub4 local13 = local7.aClass4_Sub1_Sub4_2;
		@Pc(16) Class4_Sub1_Sub4 local16 = local7.aClass4_Sub1_Sub4_1;
		if (local13 != null) {
			local13.aShort62 = (short) (local13.aShort62 * arg3 / (0x10 << Static308.anInt5834 - 7));
			local13.aShort63 = (short) (local13.aShort63 * arg3 / (0x10 << Static308.anInt5834 - 7));
		}
		if (local16 != null) {
			local16.aShort62 = (short) (local16.aShort62 * arg3 / (0x10 << Static308.anInt5834 - 7));
			local16.aShort63 = (short) (local16.aShort63 * arg3 / (0x10 << Static308.anInt5834 - 7));
		}
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IZI)Z")
	public static boolean method8273(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (Static485.method7224(arg1, arg0) | (arg0 & 0x2000) != 0 | Static405.method7056(arg0, arg1)) & Static43.method1368(arg1, arg0);
	}

	@OriginalMember(owner = "client!uv", name = "c", descriptor = "(B)V")
	public static void method8274() {
		if (!Static447.aBoolean555) {
			Static392.aBoolean518 = Static260.anInt8919 != -1 && Static160.anInt3142 >= Static260.anInt8919 || (Static519.aBoolean557 ? 26 : 22) + Static160.anInt3142 * 16 > Static330.anInt6165;
		}
		Static8.aClass223_3.method5862();
		Static551.aClass223_59.method5862();
		@Pc(53) int local53;
		for (@Pc(48) Class3_Sub4_Sub13 local48 = (Class3_Sub4_Sub13) Static464.aClass223_49.method5874(); local48 != null; local48 = (Class3_Sub4_Sub13) Static464.aClass223_49.method5870()) {
			local53 = local48.anInt4577;
			if (local53 < 1000) {
				local48.method8769();
				if (local53 == 47 || local53 == 8 || local53 == 13 || local53 == 57 || local53 == 22 || local53 == 23 || local53 == 25) {
					Static551.aClass223_59.method5868(local48);
				} else {
					Static8.aClass223_3.method5868(local48);
				}
			}
		}
		Static8.aClass223_3.method5875(Static464.aClass223_49);
		Static551.aClass223_59.method5875(Static464.aClass223_49);
		if (Static160.anInt3142 > 1) {
			if (Static585.aBoolean689 && Static339.aClass163_1.method4104(81) && Static160.anInt3142 > 2) {
				Static203.aClass3_Sub4_Sub13_1 = (Class3_Sub4_Sub13) Static464.aClass223_49.aClass3_188.aClass3_299.aClass3_299;
			} else {
				Static203.aClass3_Sub4_Sub13_1 = (Class3_Sub4_Sub13) Static464.aClass223_49.aClass3_188.aClass3_299;
			}
			Static508.aClass3_Sub4_Sub13_3 = (Class3_Sub4_Sub13) Static464.aClass223_49.aClass3_188.aClass3_299;
		} else {
			Static508.aClass3_Sub4_Sub13_3 = null;
			Static203.aClass3_Sub4_Sub13_1 = null;
		}
		local53 = -1;
		@Pc(157) Class3_Sub31 local157 = (Class3_Sub31) Static537.aClass223_58.method5874();
		if (local157 != null) {
			local53 = local157.method6923();
		}
		if (!Static447.aBoolean555) {
			if (local53 == 0 && (Static583.anInt9564 == 1 && Static160.anInt3142 > 2 || Static509.method7603())) {
				local53 = 2;
			}
			if (local53 == 2 && Static160.anInt3142 > 0 && local157 != null) {
				if (Static608.aClass279_18 == null && Static242.anInt4494 == 0) {
					Static611.method8468(local157.method6924(), local157.method6921());
				} else {
					Static564.anInt9411 = 2;
				}
			}
			if (local53 == 0) {
				if (Static203.aClass3_Sub4_Sub13_1 != null) {
					Static482.method7194();
				} else if (Static190.aBoolean232) {
					Static282.method4549();
				}
			}
			if (Static608.aClass279_18 == null && Static242.anInt4494 == 0) {
				Static564.anInt9411 = 0;
				Static639.aClass3_Sub4_Sub13_4 = null;
			}
			return;
		}
		@Pc(240) int local240;
		@Pc(244) int local244;
		@Pc(329) int local329;
		@Pc(331) int local331;
		@Pc(333) int local333;
		if (local53 == -1) {
			local240 = Static483.aClass191_1.method6989();
			local244 = Static483.aClass191_1.method6982();
			@Pc(246) boolean local246 = false;
			if (Static528.aClass3_Sub4_Sub1_1 != null) {
				if (Static107.anInt2316 - 10 <= local240 && Static107.anInt2316 + Static416.anInt7575 + 10 >= local240 && local244 >= Static312.anInt5897 - 10 && local244 <= Static312.anInt5897 + Static261.anInt4795 + 10) {
					local246 = true;
				} else {
					Static541.method7917();
				}
			}
			if (!local246) {
				if (local240 < Static276.anInt4979 - 10 || Static452.anInt3209 + Static276.anInt4979 + 10 < local240 || local244 < Static625.anInt10194 - 10 || Static625.anInt10194 + Static354.anInt6787 + 10 < local244) {
					Static204.method3516();
				} else if (Static392.aBoolean518) {
					local329 = -1;
					local331 = -1;
					@Pc(346) int local346;
					for (local333 = 0; local333 < Static157.anInt3113; local333++) {
						if (Static519.aBoolean557) {
							local346 = Static625.anInt10194 + local333 * 16 + 33;
							if (local346 - 13 < local244 && local346 + 4 > local244) {
								local329 = local333;
								local331 = local346 - 13;
								break;
							}
						} else {
							local346 = local333 * 16 + Static625.anInt10194 + 31;
							if (local346 - 13 < local244 && local346 + 3 > local244) {
								local329 = local333;
								local331 = local346 - 13;
								break;
							}
						}
					}
					if (local329 != -1) {
						local346 = 0;
						@Pc(416) Class94 local416 = new Class94(Static226.aClass15_3);
						for (@Pc(421) Class3_Sub4_Sub1 local421 = (Class3_Sub4_Sub1) local416.method2558(); local421 != null; local421 = (Class3_Sub4_Sub1) local416.method2557()) {
							if (local346 == local329) {
								if (local421.anInt805 > 1) {
									Static245.method4001(local331, local421, local244);
								}
								break;
							}
							local346++;
						}
					}
				}
			}
		}
		if (local53 != 0) {
			return;
		}
		local240 = local157.method6921();
		local244 = local157.method6924();
		@Pc(523) int local523;
		@Pc(740) Class3_Sub4_Sub13 local740;
		if (Static528.aClass3_Sub4_Sub1_1 != null && local240 >= Static107.anInt2316 && Static416.anInt7575 + Static107.anInt2316 >= local240 && Static312.anInt5897 <= local244 && Static261.anInt4795 + Static312.anInt5897 >= local244) {
			local523 = -1;
			for (local329 = 0; local329 < Static528.aClass3_Sub4_Sub1_1.anInt805; local329++) {
				if (Static519.aBoolean557) {
					local331 = local329 * 16 + Static312.anInt5897 + 33;
					if (local331 - 13 < local244 && local331 + 4 > local244) {
						local523 = local329;
					}
				} else {
					local331 = local329 * 16 + Static312.anInt5897 + 31;
					if (local244 > local331 - 13 && local244 < local331 + 3) {
						local523 = local329;
					}
				}
			}
			if (local523 != -1) {
				local331 = 0;
				@Pc(846) Class94 local846 = new Class94(Static528.aClass3_Sub4_Sub1_1.aClass15_1);
				for (local740 = (Class3_Sub4_Sub13) local846.method2558(); local740 != null; local740 = (Class3_Sub4_Sub13) local846.method2557()) {
					if (local523 == local331) {
						Static517.method7721(local244, local240, local740);
						break;
					}
					local331++;
				}
			}
			Static204.method3516();
			return;
		}
		if (Static276.anInt4979 > local240 || local240 > Static276.anInt4979 + Static452.anInt3209 || Static625.anInt10194 > local244 || local244 > Static625.anInt10194 + Static354.anInt6787) {
			return;
		}
		if (Static392.aBoolean518) {
			local523 = -1;
			local329 = -1;
			for (local331 = 0; local331 < Static157.anInt3113; local331++) {
				if (Static519.aBoolean557) {
					local333 = Static625.anInt10194 + local331 * 16 + 33;
					if (local333 - 13 < local244 && local333 + 4 > local244) {
						local329 = local333 - 13;
						local523 = local331;
						break;
					}
				} else {
					local333 = Static625.anInt10194 + local331 * 16 + 31;
					if (local244 > local333 - 13 && local333 + 3 > local244) {
						local329 = local333 - 13;
						local523 = local331;
						break;
					}
				}
			}
			if (local523 != -1) {
				local333 = 0;
				@Pc(607) Class94 local607 = new Class94(Static226.aClass15_3);
				for (@Pc(612) Class3_Sub4_Sub1 local612 = (Class3_Sub4_Sub1) local607.method2558(); local612 != null; local612 = (Class3_Sub4_Sub1) local607.method2557()) {
					if (local333 == local523) {
						if (local612.anInt805 == 1) {
							Static517.method7721(local244, local240, (Class3_Sub4_Sub13) local612.aClass15_1.aClass3_Sub4_5.aClass3_Sub4_66);
							Static204.method3516();
							return;
						}
						Static245.method4001(local329, local612, local244);
						return;
					}
					local333++;
				}
				return;
			}
		} else {
			local523 = -1;
			for (local329 = 0; local329 < Static160.anInt3142; local329++) {
				if (Static519.aBoolean557) {
					local331 = Static625.anInt10194 + (Static160.anInt3142 - local329 - 1) * 16 + 33;
					if (local244 > local331 - 13 && local331 + 4 > local244) {
						local523 = local329;
					}
				} else {
					local331 = (Static160.anInt3142 - local329 - 1) * 16 + Static625.anInt10194 + 31;
					if (local244 > local331 - 13 && local244 < local331 + 3) {
						local523 = local329;
					}
				}
			}
			if (local523 != -1) {
				local331 = 0;
				@Pc(735) Class294 local735 = new Class294(Static464.aClass223_49);
				for (local740 = (Class3_Sub4_Sub13) local735.method7321(); local740 != null; local740 = (Class3_Sub4_Sub13) local735.method7319()) {
					if (local523 == local331) {
						Static517.method7721(local244, local240, local740);
						break;
					}
					local331++;
				}
			}
			Static204.method3516();
		}
		return;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(Lclient!af;I)I")
	public static int method8275(@OriginalArg(0) Class9 arg0) {
		if (Static333.aClass9_2 == arg0) {
			return 5890;
		} else if (arg0 == Static578.aClass9_5) {
			return 34167;
		} else if (Static482.aClass9_4 == arg0) {
			return 34168;
		} else if (Static161.aClass9_3 == arg0) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
