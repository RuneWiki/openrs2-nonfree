import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!ip", name = "g", descriptor = "I")
	public static int anInt4412;

	@OriginalMember(owner = "client!ip", name = "i", descriptor = "I")
	public static int anInt4414;

	@OriginalMember(owner = "client!ip", name = "l", descriptor = "I")
	public static int anInt4416;

	@OriginalMember(owner = "client!ip", name = "p", descriptor = "I")
	public static int anInt4420;

	@OriginalMember(owner = "client!ip", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString46;

	@OriginalMember(owner = "client!ip", name = "w", descriptor = "[I")
	public static int[] anIntArray219;

	@OriginalMember(owner = "client!ip", name = "f", descriptor = "Z")
	public static boolean aBoolean319 = false;

	@OriginalMember(owner = "client!ip", name = "k", descriptor = "I")
	public static final int anInt4415 = 0;

	@OriginalMember(owner = "client!ip", name = "e", descriptor = "(I)V")
	public static void method3985(@OriginalArg(0) int arg0) {
		Static37.anInt600 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static357.anInt5961; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static429.anInt7422; local6++) {
				if (Static421.aClass217ArrayArrayArray5[arg0][local3][local6] == null) {
					Static421.aClass217ArrayArrayArray5[arg0][local3][local6] = new Class217(arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(B)V")
	public static void method3987() {
		if (!Static142.aBoolean190) {
			Static266.aBoolean355 = Static256.anInt4667 != -1 && Static491.anInt8293 >= Static256.anInt4667 || (Static186.aBoolean231 ? 26 : 22) + Static491.anInt8293 * 16 > Static408.anInt7118;
		}
		Static458.aClass330_44.method7910();
		Static403.aClass330_34.method7910();
		@Pc(52) int local52;
		for (@Pc(47) Class5_Sub5_Sub15 local47 = (Class5_Sub5_Sub15) Static84.aClass330_6.method7908(); local47 != null; local47 = (Class5_Sub5_Sub15) Static84.aClass330_6.method7914()) {
			local52 = local47.anInt6765;
			if (local52 < 1000) {
				local47.method9047();
				if (local52 == 21 || local52 == 5 || local52 == 45 || local52 == 48 || local52 == 51 || local52 == 20 || local52 == 10) {
					Static403.aClass330_34.method7917(local47);
				} else {
					Static458.aClass330_44.method7917(local47);
				}
			}
		}
		Static458.aClass330_44.method7916(Static84.aClass330_6);
		Static403.aClass330_34.method7916(Static84.aClass330_6);
		if (Static491.anInt8293 > 1) {
			if (Static59.aBoolean66 && Static45.aClass115_1.method2490(81) && Static491.anInt8293 > 2) {
				Static12.aClass5_Sub5_Sub15_1 = (Class5_Sub5_Sub15) Static84.aClass330_6.aClass5_257.aClass5_299.aClass5_299;
			} else {
				Static12.aClass5_Sub5_Sub15_1 = (Class5_Sub5_Sub15) Static84.aClass330_6.aClass5_257.aClass5_299;
			}
			Static154.aClass5_Sub5_Sub15_3 = (Class5_Sub5_Sub15) Static84.aClass330_6.aClass5_257.aClass5_299;
		} else {
			Static12.aClass5_Sub5_Sub15_1 = null;
			Static154.aClass5_Sub5_Sub15_3 = null;
		}
		local52 = -1;
		@Pc(166) Class5_Sub13 local166 = (Class5_Sub13) Static75.aClass330_5.method7908();
		if (local166 != null) {
			local52 = local166.method5399();
		}
		if (!Static142.aBoolean190) {
			if (local52 == 0 && (Static197.anInt10376 == 1 && Static491.anInt8293 > 2 || Static535.method7886())) {
				local52 = 2;
			}
			if (local52 == 2 && Static491.anInt8293 > 0 && local166 != null) {
				if (Static443.aClass295_14 == null && Static349.anInt5874 == 0) {
					Static208.method3587(local166.method5401(), local166.method5403());
				} else {
					Static150.anInt2604 = 2;
				}
			}
			if (local52 == 0) {
				if (Static12.aClass5_Sub5_Sub15_1 != null) {
					Static142.method2050();
				} else if (Static285.aBoolean378) {
					Static420.method6387();
				}
			}
			if (Static443.aClass295_14 != null || Static349.anInt5874 != 0) {
				return;
			}
			Static35.aClass5_Sub5_Sub15_2 = null;
			Static150.anInt2604 = 0;
			return;
		}
		@Pc(186) int local186;
		@Pc(190) int local190;
		@Pc(270) int local270;
		@Pc(272) int local272;
		if (local52 == -1) {
			local186 = Static3.aClass3_3.method8875();
			local190 = Static3.aClass3_3.method8879();
			@Pc(192) boolean local192 = false;
			if (Static281.aClass5_Sub5_Sub4_1 != null) {
				if (local186 >= Static129.anInt2304 - 10 && local186 <= Static565.anInt9564 + Static129.anInt2304 + 10 && local190 >= Static14.anInt240 - 10 && local190 <= anInt4414 + Static14.anInt240 + 10) {
					local192 = true;
				} else {
					Static59.method980();
				}
			}
			if (!local192) {
				if (Static346.anInt4654 - 10 > local186 || Static346.anInt4654 + Static115.anInt2157 + 10 < local186 || Static612.anInt10212 - 10 > local190 || Static612.anInt10212 + Static644.anInt10625 + 10 < local190) {
					Static2.method29();
				} else if (Static266.aBoolean355) {
					local270 = -1;
					local272 = -1;
					@Pc(287) int local287;
					for (@Pc(274) int local274 = 0; local274 < Static140.anInt2437; local274++) {
						if (Static186.aBoolean231) {
							local287 = local274 * 16 + Static612.anInt10212 + 33;
							if (local190 > local287 - 13 && local287 + 4 > local190) {
								local272 = local287 - 13;
								local270 = local274;
								break;
							}
						} else {
							local287 = Static612.anInt10212 + local274 * 16 + 31;
							if (local287 - 13 < local190 && local287 + 3 > local190) {
								local272 = local287 - 13;
								local270 = local274;
								break;
							}
						}
					}
					if (local270 != -1) {
						local287 = 0;
						@Pc(358) Class165 local358 = new Class165(Static601.aClass368_13);
						for (@Pc(363) Class5_Sub5_Sub4 local363 = (Class5_Sub5_Sub4) local358.method3911(); local363 != null; local363 = (Class5_Sub5_Sub4) local358.method3912()) {
							if (local287 == local270) {
								if (local363.anInt2287 > 1) {
									Static357.method5305(local272, local190, local363);
								}
								break;
							}
							local287++;
						}
					}
				}
			}
		}
		if (local52 != 0) {
			return;
		}
		local186 = local166.method5403();
		local190 = local166.method5401();
		@Pc(438) int local438;
		@Pc(510) Class165 local510;
		@Pc(515) Class5_Sub5_Sub15 local515;
		if (Static281.aClass5_Sub5_Sub4_1 != null && local186 >= Static129.anInt2304 && local186 <= Static129.anInt2304 + Static565.anInt9564 && local190 >= Static14.anInt240 && local190 <= Static14.anInt240 + anInt4414) {
			local438 = -1;
			for (local270 = 0; local270 < Static281.aClass5_Sub5_Sub4_1.anInt2287; local270++) {
				if (Static186.aBoolean231) {
					local272 = Static14.anInt240 + local270 * 16 + 33;
					if (local190 > local272 - 13 && local190 < local272 + 4) {
						local438 = local270;
					}
				} else {
					local272 = local270 * 16 + Static14.anInt240 + 31;
					if (local190 > local272 - 13 && local272 + 3 > local190) {
						local438 = local270;
					}
				}
			}
			if (local438 != -1) {
				local272 = 0;
				local510 = new Class165(Static281.aClass5_Sub5_Sub4_1.aClass368_2);
				for (local515 = (Class5_Sub5_Sub15) local510.method3911(); local515 != null; local515 = (Class5_Sub5_Sub15) local510.method3912()) {
					if (local272 == local438) {
						Static557.method8108(local190, local186, local515);
						break;
					}
					local272++;
				}
			}
			Static2.method29();
			return;
		}
		if (local186 < Static346.anInt4654 || Static115.anInt2157 + Static346.anInt4654 < local186 || local190 < Static612.anInt10212 || Static644.anInt10625 + Static612.anInt10212 < local190) {
			return;
		}
		if (Static266.aBoolean355) {
			local438 = -1;
			for (local270 = 0; local270 < Static140.anInt2437; local270++) {
				if (Static186.aBoolean231) {
					local272 = Static612.anInt10212 + local270 * 16 + 33;
					if (local272 - 13 < local190 && local272 + 4 > local190) {
						local438 = local270;
						break;
					}
				} else {
					local272 = Static612.anInt10212 + local270 * 16 + 31;
					if (local190 > local272 - 13 && local272 + 3 > local190) {
						local438 = local270;
						break;
					}
				}
			}
			if (local438 != -1) {
				local272 = 0;
				local510 = new Class165(Static601.aClass368_13);
				for (@Pc(649) Class5_Sub5_Sub4 local649 = (Class5_Sub5_Sub4) local510.method3911(); local649 != null; local649 = (Class5_Sub5_Sub4) local510.method3912()) {
					if (local438 == local272) {
						Static557.method8108(local190, local186, (Class5_Sub5_Sub15) local649.aClass368_2.aClass5_Sub5_64.aClass5_Sub5_66);
						Static2.method29();
						return;
					}
					local272++;
				}
				return;
			}
		} else {
			local438 = -1;
			for (local270 = 0; local270 < Static491.anInt8293; local270++) {
				if (Static186.aBoolean231) {
					local272 = (Static491.anInt8293 - local270 - 1) * 16 + Static612.anInt10212 + 33;
					if (local272 - 13 < local190 && local190 < local272 + 4) {
						local438 = local270;
					}
				} else {
					local272 = Static612.anInt10212 + (Static491.anInt8293 + -1 - local270) * 16 + 31;
					if (local272 - 13 < local190 && local272 + 3 > local190) {
						local438 = local270;
					}
				}
			}
			if (local438 != -1) {
				local272 = 0;
				@Pc(760) Class199 local760 = new Class199(Static84.aClass330_6);
				for (local515 = (Class5_Sub5_Sub15) local760.method4552(); local515 != null; local515 = (Class5_Sub5_Sub15) local760.method4554()) {
					if (local272 == local438) {
						Static557.method8108(local190, local186, local515);
						break;
					}
					local272++;
				}
			}
			Static2.method29();
		}
		return;
	}
}
