import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!bs", name = "n", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray1;

	@OriginalMember(owner = "client!bs", name = "p", descriptor = "Lclient!nga;")
	public static Class228 aClass228_1;

	@OriginalMember(owner = "client!bs", name = "d", descriptor = "(B)V")
	public static void method1147() {
		if (!Static433.aBoolean672) {
			Static506.aBoolean755 = Static494.anInt8778 != -1 && Static494.anInt8778 <= Static443.anInt8026 || Static256.anInt5669 < (Static599.aBoolean832 ? 26 : 22) + Static443.anInt8026 * 16;
		}
		Static297.aClass276_40.method6910();
		Static305.aClass276_41.method6910();
		@Pc(45) int local45;
		for (@Pc(40) Class3_Sub1_Sub4 local40 = (Class3_Sub1_Sub4) Static187.aClass276_28.method6907(); local40 != null; local40 = (Class3_Sub1_Sub4) Static187.aClass276_28.method6912()) {
			local45 = local40.anInt3485;
			if (local45 < 1000) {
				local40.method8671();
				if (local45 == 10 || local45 == 5 || local45 == 58 || local45 == 25 || local45 == 46 || local45 == 47 || local45 == 11) {
					Static305.aClass276_41.method6906(local40);
				} else {
					Static297.aClass276_40.method6906(local40);
				}
			}
		}
		Static297.aClass276_40.method6904(Static187.aClass276_28);
		Static305.aClass276_41.method6904(Static187.aClass276_28);
		if (Static443.anInt8026 <= 1) {
			Static300.aClass3_Sub1_Sub4_3 = null;
			Static17.aClass3_Sub1_Sub4_1 = null;
		} else {
			if (Static109.aBoolean233 && Static326.aClass238_1.method6948(81) && Static443.anInt8026 > 2) {
				Static300.aClass3_Sub1_Sub4_3 = (Class3_Sub1_Sub4) Static187.aClass276_28.aClass3_231.aClass3_299.aClass3_299;
			} else {
				Static300.aClass3_Sub1_Sub4_3 = (Class3_Sub1_Sub4) Static187.aClass276_28.aClass3_231.aClass3_299;
			}
			Static17.aClass3_Sub1_Sub4_1 = (Class3_Sub1_Sub4) Static187.aClass276_28.aClass3_231.aClass3_299;
		}
		local45 = -1;
		@Pc(162) Class3_Sub30 local162 = (Class3_Sub30) Static264.aClass276_37.method6907();
		if (local162 != null) {
			local45 = local162.method6362();
		}
		if (!Static433.aBoolean672) {
			if (local45 == 0 && (Static639.anInt10496 == 1 && Static443.anInt8026 > 2 || Static76.method1868())) {
				local45 = 2;
			}
			if (local45 == 2 && Static443.anInt8026 > 0 && local162 != null) {
				if (Static233.aClass108_7 == null && Static604.anInt10035 == 0) {
					Static73.method1846(local162.method6367(), local162.method6363());
				} else {
					Static269.anInt5798 = 2;
				}
			}
			if (local45 == 0) {
				if (Static300.aClass3_Sub1_Sub4_3 != null) {
					Static498.method7285();
				} else if (Static82.aBoolean192) {
					Static32.method596();
				}
			}
			if (Static233.aClass108_7 == null && Static604.anInt10035 == 0) {
				Static269.anInt5798 = 0;
				Static156.aClass3_Sub1_Sub4_2 = null;
			}
			return;
		}
		@Pc(243) int local243;
		@Pc(247) int local247;
		@Pc(338) int local338;
		@Pc(340) int local340;
		if (local45 == -1) {
			local243 = Static501.aClass59_5.method4107();
			local247 = Static501.aClass59_5.method4106();
			@Pc(249) boolean local249 = false;
			if (Static198.aClass3_Sub1_Sub10_1 != null) {
				if (Static285.anInt5876 - 10 <= local243 && Static285.anInt5876 + Static468.anInt8459 + 10 >= local243 && local247 >= Static280.anInt5854 - 10 && Static609.anInt10063 + Static280.anInt5854 + 10 >= local247) {
					local249 = true;
				} else {
					Static582.method8047();
				}
			}
			if (!local249) {
				if (Static326.anInt6543 - 10 > local243 || Static326.anInt6543 + Static582.anInt9731 + 10 < local243 || Static434.anInt7939 - 10 > local247 || Static434.anInt7939 + Static554.anInt9455 + 10 < local247) {
					Static251.method4763();
				} else if (Static506.aBoolean755) {
					local338 = -1;
					local340 = -1;
					@Pc(354) int local354;
					for (@Pc(342) int local342 = 0; local342 < Static462.anInt8390; local342++) {
						if (Static599.aBoolean832) {
							local354 = Static434.anInt7939 + local342 * 16 + 33;
							if (local247 > local354 - 13 && local247 < local354 + 4) {
								local340 = local354 - 13;
								local338 = local342;
								break;
							}
						} else {
							local354 = Static434.anInt7939 + local342 * 16 + 31;
							if (local354 - 13 < local247 && local354 + 3 > local247) {
								local338 = local342;
								local340 = local354 - 13;
								break;
							}
						}
					}
					if (local338 != -1) {
						local354 = 0;
						@Pc(421) Class211 local421 = new Class211(Static379.aClass30_9);
						for (@Pc(426) Class3_Sub1_Sub10 local426 = (Class3_Sub1_Sub10) local421.method5583(); local426 != null; local426 = (Class3_Sub1_Sub10) local421.method5584()) {
							if (local354 == local338) {
								if (local426.anInt5812 > 1) {
									Static25.method428(local247, local340, local426);
								}
								break;
							}
							local354++;
						}
					}
				}
			}
		}
		if (local45 != 0) {
			return;
		}
		local243 = local162.method6363();
		local247 = local162.method6367();
		@Pc(534) int local534;
		@Pc(737) Class211 local737;
		@Pc(627) Class3_Sub1_Sub4 local627;
		if (Static198.aClass3_Sub1_Sub10_1 != null && Static285.anInt5876 <= local243 && Static285.anInt5876 + Static468.anInt8459 >= local243 && Static280.anInt5854 <= local247 && Static609.anInt10063 + Static280.anInt5854 >= local247) {
			local534 = -1;
			for (local338 = 0; local338 < Static198.aClass3_Sub1_Sub10_1.anInt5812; local338++) {
				if (Static599.aBoolean832) {
					local340 = Static280.anInt5854 + local338 * 16 + 33;
					if (local247 > local340 - 13 && local247 < local340 + 4) {
						local534 = local338;
					}
				} else {
					local340 = Static280.anInt5854 + local338 * 16 + 31;
					if (local247 > local340 - 13 && local340 + 3 > local247) {
						local534 = local338;
					}
				}
			}
			if (local534 != -1) {
				local340 = 0;
				local737 = new Class211(Static198.aClass3_Sub1_Sub10_1.aClass30_7);
				for (local627 = (Class3_Sub1_Sub4) local737.method5583(); local627 != null; local627 = (Class3_Sub1_Sub4) local737.method5584()) {
					if (local534 == local340) {
						Static422.method8088(local243, local627, local247);
						break;
					}
					local340++;
				}
			}
			Static251.method4763();
			return;
		}
		if (local243 < Static326.anInt6543 || local243 > Static326.anInt6543 + Static582.anInt9731 || Static434.anInt7939 > local247 || local247 > Static434.anInt7939 + Static554.anInt9455) {
			return;
		}
		if (!Static506.aBoolean755) {
			local534 = -1;
			for (local338 = 0; local338 < Static443.anInt8026; local338++) {
				if (Static599.aBoolean832) {
					local340 = (Static443.anInt8026 - local338 - 1) * 16 + Static434.anInt7939 + 33;
					if (local247 > local340 - 13 && local340 + 4 > local247) {
						local534 = local338;
					}
				} else {
					local340 = Static434.anInt7939 + (-local338 + Static443.anInt8026 + -1) * 16 + 31;
					if (local247 > local340 - 13 && local340 + 3 > local247) {
						local534 = local338;
					}
				}
			}
			if (local534 != -1) {
				local340 = 0;
				@Pc(622) Class271 local622 = new Class271(Static187.aClass276_28);
				for (local627 = (Class3_Sub1_Sub4) local622.method6848(); local627 != null; local627 = (Class3_Sub1_Sub4) local622.method6849()) {
					if (local534 == local340) {
						Static422.method8088(local243, local627, local247);
						break;
					}
					local340++;
				}
			}
			Static251.method4763();
			return;
		}
		local534 = -1;
		for (local338 = 0; local338 < Static462.anInt8390; local338++) {
			if (Static599.aBoolean832) {
				local340 = Static434.anInt7939 + local338 * 16 + 33;
				if (local340 - 13 < local247 && local340 + 4 > local247) {
					local534 = local338;
					break;
				}
			} else {
				local340 = local338 * 16 + Static434.anInt7939 + 31;
				if (local247 > local340 - 13 && local247 < local340 + 3) {
					local534 = local338;
					break;
				}
			}
		}
		if (local534 == -1) {
			return;
		}
		local340 = 0;
		local737 = new Class211(Static379.aClass30_9);
		for (@Pc(744) Class3_Sub1_Sub10 local744 = (Class3_Sub1_Sub10) local737.method5583(); local744 != null; local744 = (Class3_Sub1_Sub10) local737.method5584()) {
			if (local340 == local534) {
				Static422.method8088(local243, (Class3_Sub1_Sub4) local744.aClass30_7.aClass3_Sub1_7.aClass3_Sub1_66, local247);
				Static251.method4763();
				return;
			}
			local340++;
		}
		return;
	}

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(I)V")
	public static void method1148() {
		if (Static408.method6434(Static581.anInt9720) || Static135.method3115(Static581.anInt9720)) {
			Static273.method4938(5000, Static289.anInt5908 >> 12, Static465.anInt8425 >> 12);
		} else {
			@Pc(18) int local18 = Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anIntArray378[0] >> 3;
			@Pc(25) int local25 = Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anIntArray377[0] >> 3;
			if (local18 >= 0 && local18 < Static394.anInt7540 >> 3 && local25 >= 0 && Static462.anInt8391 >> 3 > local25) {
				Static273.method4938(5000, local25, local18);
			} else {
				Static273.method4938(0, Static462.anInt8391 >> 4, Static394.anInt7540 >> 4);
			}
		}
		Static110.method2709();
		Static572.method8000();
		Static580.method8025();
		Static468.method6982();
	}

	@OriginalMember(owner = "client!bs", name = "c", descriptor = "(I)[Lclient!an;")
	public static Class20[] method1149() {
		return new Class20[] { Static353.aClass20_13, Static467.aClass20_19, Static431.aClass20_17, Static14.aClass20_25, Static491.aClass20_21, Static7.aClass20_1, Static35.aClass20_4, Static373.aClass20_14, Static273.aClass20_8, Static290.aClass20_9, Static160.aClass20_7, Static533.aClass20_22, Static21.aClass20_3, Static443.aClass20_18 };
	}
}
