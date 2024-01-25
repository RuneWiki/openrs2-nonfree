import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!bo", name = "s", descriptor = "[[S")
	public static short[][] aShortArrayArray1;

	@OriginalMember(owner = "client!bo", name = "f", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_49 = new Class296(37, 7);

	@OriginalMember(owner = "client!bo", name = "l", descriptor = "I")
	public static int anInt915 = 0;

	@OriginalMember(owner = "client!bo", name = "n", descriptor = "I")
	public static int anInt917 = -1;

	@OriginalMember(owner = "client!bo", name = "q", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_50 = new Class296(6, 4);

	@OriginalMember(owner = "client!bo", name = "r", descriptor = "I")
	public static int anInt918 = 999999;

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIIII)V")
	public static void method918(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static193.anIntArrayArray95 != null) {
			Static193.anIntArrayArray95[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static398.aShortArrayArray7 != null) {
			Static398.aShortArrayArray7[arg0][arg1] = (short) arg3;
		}
		if (Static347.aByteArrayArray18 != null) {
			Static347.aByteArrayArray18[arg0][arg1] = (byte) arg4;
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IC)Z")
	public static boolean method919(@OriginalArg(1) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILclient!qa;I)Z")
	public static boolean method920(@OriginalArg(1) Class122 arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = (Static459.anInt7799 - 104) / 2;
		@Pc(17) int local17 = (Static482.anInt7990 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg1; local29 <= 3; local29++) {
					if (Static371.method5719(local29, local25, local21, arg1)) {
						local40 = local29;
						if (Static505.method7002(local25, local21)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static93.method1639(local40, local25, local21);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(86) int[] local86 = new int[262144];
		for (local29 = 0; local29 < local86.length; local29++) {
			local86[local29] = -16777216;
		}
		Static177.aClass2_25 = arg0.method7268(local86, 512, 512, 512);
		Static477.method6612();
		local40 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + 238 - (10 - ((int) (Math.random() * 20.0D) + 238 - 10 << 8) - ((int) (Math.random() * 20.0D))) | 0xFF000000;
		@Pc(162) int local162 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00) << 16;
		@Pc(181) int local181 = (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D);
		@Pc(189) boolean[][] local189 = new boolean[Static251.anInt4912 + 1][Static251.anInt4912 + 1];
		@Pc(195) int local195;
		@Pc(199) int local199;
		@Pc(201) int local201;
		@Pc(203) int local203;
		@Pc(212) int local212;
		@Pc(222) int local222;
		@Pc(233) int local233;
		@Pc(258) int local258;
		@Pc(262) int local262;
		@Pc(320) int local320;
		@Pc(326) int local326;
		@Pc(331) int local331;
		@Pc(346) int local346;
		for (@Pc(191) int local191 = local11; local191 < local11 + 104; local191 += Static251.anInt4912) {
			for (local195 = local17; local195 < local17 + 104; local195 += Static251.anInt4912) {
				local199 = 0;
				local201 = 0;
				local203 = local191;
				if (local191 > 0) {
					local203 = local191 - 1;
					local199 += 4;
				}
				local212 = local195;
				if (local195 > 0) {
					local212 = local195 - 1;
				}
				local222 = local191 + Static251.anInt4912;
				if (local222 < 104) {
					local222++;
				}
				local233 = local195 + Static251.anInt4912;
				if (local233 < 104) {
					local201 += 4;
					local233++;
				}
				arg0.N(0, 0, Static251.anInt4912 * 4 + local199, local201 - -(Static251.anInt4912 * 4));
				arg0.Z(-16777216);
				@Pc(266) int local266;
				for (local258 = arg1; local258 <= 3; local258++) {
					for (local262 = 0; local262 <= Static251.anInt4912; local262++) {
						for (local266 = 0; local266 <= Static251.anInt4912; local266++) {
							local189[local262][local266] = Static371.method5719(local258, local212 + local266, local262 + local203, arg1);
						}
					}
					Static16.aClass205Array1[local258].method6751(local203, local212, local222, local233, local189);
					if (!Static361.aBoolean465) {
						for (local266 = -4; local266 < Static251.anInt4912; local266++) {
							for (local320 = -4; local320 < Static251.anInt4912; local320++) {
								local326 = local266 + local191;
								local331 = local195 + local320;
								if (local326 >= local11 && local17 <= local331 && Static371.method5719(local258, local331, local326, arg1)) {
									local346 = local258;
									if (Static505.method7002(local331, local326)) {
										local346 = local258 - 1;
									}
									if (local346 >= 0) {
										Static54.method1057(arg0, local162, local199 + local266 * 4, local331, local326, local201 + (Static251.anInt4912 - local320) * 4 - 4, local346, local40);
									}
								}
							}
						}
					}
				}
				if (Static361.aBoolean465) {
					@Pc(408) Class91 local408 = Static86.aClass91Array1[arg1];
					for (local266 = 0; local266 < Static251.anInt4912; local266++) {
						for (local320 = 0; local320 < Static251.anInt4912; local320++) {
							local326 = local266 + local191;
							local331 = local320 + local195;
							local346 = local408.anIntArrayArray30[local326 - local408.anInt2571][local331 - local408.anInt2587];
							if ((local346 & 0x40240000) != 0) {
								arg0.method7265(-1713569622, 4, local199 + local266 * 4, 4, (Static251.anInt4912 - local320) * 4 + local201 - 4);
							} else if ((local346 & 0x800000) != 0) {
								arg0.method7259(local201 + (Static251.anInt4912 - local320) * 4 - 4, -1713569622, local199 + local266 * 4, 4);
							} else if ((local346 & 0x2000000) != 0) {
								arg0.method7285(-1713569622, 4, local266 * 4 + local199 + 3, local201 - -((Static251.anInt4912 - local320) * 4) - 4);
							} else if ((local346 & 0x8000000) != 0) {
								arg0.method7259(local201 + (Static251.anInt4912 - local320) * 4 + 3 - 4, -1713569622, local199 + local266 * 4, 4);
							} else if ((local346 & 0x20000000) != 0) {
								arg0.method7285(-1713569622, 4, local266 * 4 + local199, local201 + -4 - -((Static251.anInt4912 + -local320) * 4));
							}
						}
					}
				}
				arg0.f(local199, local201, Static251.anInt4912 * 4, Static251.anInt4912 * 4, local181, 2);
				Static177.aClass2_25.P((local191 - local11) * 4 + 48, 464 - ((-local17 + local195) * 4 + Static251.anInt4912 * 4), Static251.anInt4912 * 4, Static251.anInt4912 * 4, local199, local201);
			}
		}
		arg0.n();
		arg0.Z(-16777215);
		Static299.method4748();
		Static382.anInt6967 = 0;
		Static521.aClass37_103.method967();
		if (!Static361.aBoolean465) {
			for (local195 = local11; local195 < local11 + 104; local195++) {
				for (local199 = local17; local199 < local17 + 104; local199++) {
					for (local201 = arg1; local201 <= arg1 + 1 && local201 <= 3; local201++) {
						if (Static371.method5719(local201, local199, local195, arg1)) {
							@Pc(696) Interface18 local696 = (Interface18) Static117.method1983(local201, local195, local199);
							if (local696 == null) {
								local696 = (Interface18) Static156.method2467(local201, local195, local199, vaa.class);
							}
							if (local696 == null) {
								local696 = (Interface18) Static453.method6441(local201, local195, local199);
							}
							if (local696 == null) {
								local696 = (Interface18) Static53.method1029(local201, local195, local199);
							}
							if (local696 != null) {
								@Pc(737) Class36 local737 = Static308.aClass96_4.method2274(local696.method7467());
								if (!local737.aBoolean62 || Static83.aBoolean102) {
									local222 = local737.anInt963;
									if (local737.anIntArray127 != null) {
										for (local233 = 0; local233 < local737.anIntArray127.length; local233++) {
											if (local737.anIntArray127[local233] != -1) {
												@Pc(767) Class36 local767 = Static308.aClass96_4.method2274(local737.anIntArray127[local233]);
												if (local767.anInt963 >= 0) {
													local222 = local767.anInt963;
												}
											}
										}
									}
									if (local222 >= 0) {
										@Pc(789) boolean local789 = false;
										if (local222 >= 0) {
											@Pc(799) Class30 local799 = Static244.aClass272_4.method6380(local222);
											if (local799 != null && local799.aBoolean48) {
												local789 = true;
											}
										}
										local258 = local195;
										local262 = local199;
										if (local789) {
											@Pc(817) int[][] local817 = Static86.aClass91Array1[local201].anIntArrayArray30;
											local320 = Static86.aClass91Array1[local201].anInt2571;
											local326 = Static86.aClass91Array1[local201].anInt2587;
											for (local331 = 0; local331 < 10; local331++) {
												local346 = (int) (Math.random() * 4.0D);
												if (local346 == 0 && local258 > local11 && local258 > local195 - 3 && (local817[local258 - local320 - 1][local262 - local326] & 0x2C0108) == 0) {
													local258--;
												}
												if (local346 == 1 && local258 < local11 + 104 - 1 && local195 + 3 > local258 && (local817[local258 + 1 - local320][local262 - local326] & 0x2C0180) == 0) {
													local258++;
												}
												if (local346 == 2 && local17 < local262 && local199 - 3 < local262 && (local817[local258 - local320][local262 - local326 - 1] & 0x2C0102) == 0) {
													local262--;
												}
												if (local346 == 3 && local262 < local17 + 103 && local199 + 3 > local262 && (local817[local258 - local320][local262 + 1 - local326] & 0x2C0120) == 0) {
													local262++;
												}
											}
										}
										Static242.anIntArray466[Static382.anInt6967] = local737.anInt952;
										Static7.anIntArray21[Static382.anInt6967] = local258;
										Static306.anIntArray565[Static382.anInt6967] = local262;
										Static382.anInt6967++;
									}
								}
							}
						}
					}
				}
			}
			if (Static111.aClass53_3 != null) {
				Static429.aClass171_146.anInt4998 = 1;
				Static244.aClass272_4.method6378(64, 1024);
				for (local199 = 0; local199 < Static111.aClass53_3.anInt1356; local199++) {
					local201 = Static111.aClass53_3.anIntArray154[local199];
					if (local201 >> 28 == Static63.aClass49_Sub2_Sub2_Sub1_1.aByte98) {
						local203 = (local201 >> 14 & 0x3FFF) - Static470.anInt7897;
						local212 = (local201 & 0x3FFF) - Static534.anInt9007;
						if (local203 >= 0 && local203 < Static459.anInt7799 && local212 >= 0 && Static482.anInt7990 > local212) {
							Static521.aClass37_103.method970(new Class1_Sub9(local199));
						} else {
							@Pc(1105) Class30 local1105 = Static244.aClass272_4.method6380(Static111.aClass53_3.anIntArray153[local199]);
							if (local1105.anIntArray120 != null && local203 + local1105.anInt879 >= 0 && local1105.anInt869 + local203 < Static459.anInt7799 && local212 + local1105.anInt894 >= 0 && local212 + local1105.anInt893 < Static482.anInt7990) {
								Static521.aClass37_103.method970(new Class1_Sub9(local199));
							}
						}
					}
				}
				Static244.aClass272_4.method6378(64, 128);
				Static429.aClass171_146.anInt4998 = 2;
				Static429.aClass171_146.method4347();
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method924(@OriginalArg(0) long arg0) {
		Static385.aCalendar2.setTime(new Date(arg0));
		@Pc(18) int local18 = Static385.aCalendar2.get(7);
		@Pc(22) int local22 = Static385.aCalendar2.get(5);
		@Pc(26) int local26 = Static385.aCalendar2.get(2);
		@Pc(30) int local30 = Static385.aCalendar2.get(1);
		@Pc(34) int local34 = Static385.aCalendar2.get(11);
		@Pc(38) int local38 = Static385.aCalendar2.get(12);
		@Pc(42) int local42 = Static385.aCalendar2.get(13);
		return Static332.aStringArray31[local18 - 1] + ", " + local22 / 10 + local22 % 10 + "-" + Static103.aStringArray10[local26] + "-" + local30 + " " + local34 / 10 + local34 % 10 + ":" + local38 / 10 + local38 % 10 + ":" + local42 / 10 + local42 % 10 + " GMT";
	}
}
