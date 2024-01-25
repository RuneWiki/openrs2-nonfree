import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static528 {

	@OriginalMember(owner = "client!rq", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString95;

	@OriginalMember(owner = "client!rq", name = "i", descriptor = "Lclient!mq;")
	public static Class243 aClass243_3;

	@OriginalMember(owner = "client!rq", name = "d", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_172 = new Class156(60, 6);

	@OriginalMember(owner = "client!rq", name = "g", descriptor = "I")
	public static int anInt8412 = 0;

	@OriginalMember(owner = "client!rq", name = "j", descriptor = "[Z")
	public static final boolean[] aBooleanArray23 = new boolean[100];

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(I)V")
	public static void method7227() {
		@Pc(8) Class5_Sub10 local8 = (Class5_Sub10) Static433.aClass20_37.method378();
		@Pc(26) boolean local26 = Static388.aClass238_11 != null || Static195.anInt3567 > 0;
		@Pc(30) int local30 = local8.method7039();
		@Pc(34) int local34 = local8.method7042();
		if (local26) {
			Static233.anInt4001 = 1;
		}
		if (local26) {
			Static660.aClass5_Sub1_Sub13_4 = Static396.aClass5_Sub1_Sub13_2;
		} else {
			Static346.method4441(local30, local34, Static396.aClass5_Sub1_Sub13_2);
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(B)V")
	public static void method7228() {
		if (Static413.anInt6991 > 1) {
			Static413.anInt6991--;
			Static476.anInt7745 = Static55.anInt959;
		}
		if (Static4.aClass389_17.aBoolean759) {
			Static4.aClass389_17.aBoolean759 = false;
			Static613.method8423();
			return;
		}
		if (!Static490.aBoolean536) {
			Static395.method5813();
		}
		for (@Pc(41) int local41 = 0; local41 < 100 && Static77.method1286(Static4.aClass389_17); local41++) {
		}
		if (Static652.anInt10664 != 11) {
			return;
		}
		@Pc(74) Class5_Sub41 local74;
		@Pc(83) int local83;
		while (Static368.method5499()) {
			local74 = Static647.method8905(Static350.aClass381_150, Static4.aClass389_17.aClass393_2);
			local74.aClass5_Sub36_Sub2_1.method7324(0);
			local83 = local74.aClass5_Sub36_Sub2_1.anInt8456;
			Static368.method5501(local74.aClass5_Sub36_Sub2_1);
			local74.aClass5_Sub36_Sub2_1.method7314(local74.aClass5_Sub36_Sub2_1.anInt8456 - local83);
			Static4.aClass389_17.method9079(local74);
		}
		if (Static437.aClass5_Sub16_2 == null) {
			if (Static484.aLong227 <= Static480.method6763()) {
				Static437.aClass5_Sub16_2 = Static184.aClass273_1.method6216(Static68.aClass258_6.aString78);
			}
		} else if (Static437.aClass5_Sub16_2.anInt1946 != -1) {
			local74 = Static647.method8905(Static329.aClass381_139, Static4.aClass389_17.aClass393_2);
			local74.aClass5_Sub36_Sub2_1.method7296(Static437.aClass5_Sub16_2.anInt1946);
			Static4.aClass389_17.method9079(local74);
			Static437.aClass5_Sub16_2 = null;
			Static484.aLong227 = Static480.method6763() + 30000L;
		}
		@Pc(163) Class5_Sub10 local163 = (Class5_Sub10) Static433.aClass20_37.method378();
		@Pc(182) int local182;
		@Pc(207) int local207;
		@Pc(227) int local227;
		@Pc(280) int local280;
		@Pc(287) int local287;
		@Pc(298) int local298;
		@Pc(180) Class5_Sub41 local180;
		if (local163 != null || Static285.aLong145 < Static480.method6763() - 2000L) {
			local180 = null;
			local182 = 0;
			for (@Pc(187) Class5_Sub10 local187 = (Class5_Sub10) Static322.aClass20_23.method378(); local187 != null && (local180 == null || local180.aClass5_Sub36_Sub2_1.anInt8456 - local182 < 240); local187 = (Class5_Sub10) Static322.aClass20_23.method366()) {
				local187.method9222();
				local207 = local187.method7042();
				if (local207 < -1) {
					local207 = -1;
				} else if (local207 > 65534) {
					local207 = 65534;
				}
				local227 = local187.method7039();
				if (local227 < -1) {
					local227 = -1;
				} else if (local227 > 65534) {
					local227 = 65534;
				}
				if (local227 != Static57.anInt1009 || Static448.anInt7326 != local207) {
					if (local180 == null) {
						local180 = Static647.method8905(Static388.aClass381_168, Static4.aClass389_17.aClass393_2);
						local180.aClass5_Sub36_Sub2_1.method7324(0);
						local182 = local180.aClass5_Sub36_Sub2_1.anInt8456;
					}
					local280 = local227 - Static57.anInt1009;
					Static57.anInt1009 = local227;
					local287 = local207 - Static448.anInt7326;
					Static448.anInt7326 = local207;
					local298 = (int) ((local187.method7041() - Static285.aLong145) / 20L);
					if (local298 < 8 && local280 >= -32 && local280 <= 31 && local287 >= -32 && local287 <= 31) {
						local287 += 32;
						local280 += 32;
						local180.aClass5_Sub36_Sub2_1.method7296(local287 + (local280 << 6) + (local298 << 12));
					} else if (local298 < 32 && local280 >= -128 && local280 <= 127 && local287 >= -128 && local287 <= 127) {
						local180.aClass5_Sub36_Sub2_1.method7324(local298 + 128);
						local280 += 128;
						local287 += 128;
						local180.aClass5_Sub36_Sub2_1.method7296(local287 + (local280 << 8));
					} else if (local298 >= 32) {
						local180.aClass5_Sub36_Sub2_1.method7296(local298 + 57344);
						if (local227 == 1 || local207 == -1) {
							local180.aClass5_Sub36_Sub2_1.method7287(Integer.MIN_VALUE);
						} else {
							local180.aClass5_Sub36_Sub2_1.method7287(local227 | local207 << 16);
						}
					} else {
						local180.aClass5_Sub36_Sub2_1.method7324(local298 + 192);
						if (local227 == 1 || local207 == -1) {
							local180.aClass5_Sub36_Sub2_1.method7287(Integer.MIN_VALUE);
						} else {
							local180.aClass5_Sub36_Sub2_1.method7287(local207 << 16 | local227);
						}
					}
					Static285.aLong145 = local187.method7041();
				}
			}
			if (local180 != null) {
				local180.aClass5_Sub36_Sub2_1.method7314(local180.aClass5_Sub36_Sub2_1.anInt8456 - local182);
				Static4.aClass389_17.method9079(local180);
			}
		}
		@Pc(542) int local542;
		if (local163 != null) {
			@Pc(526) long local526 = (local163.method7041() - Static168.aLong95) / 50L;
			if (local526 > 32767L) {
				local526 = 32767L;
			}
			Static168.aLong95 = local163.method7041();
			local542 = local163.method7042();
			if (local542 < 0) {
				local542 = 0;
			} else if (local542 > 65535) {
				local542 = 65535;
			}
			local207 = local163.method7039();
			if (local207 < 0) {
				local207 = 0;
			} else if (local207 > 65535) {
				local207 = 65535;
			}
			@Pc(579) byte local579 = 0;
			if (local163.method7046() == 2) {
				local579 = 1;
			}
			local280 = (int) local526;
			@Pc(601) Class5_Sub41 local601 = Static647.method8905(Static219.aClass381_94, Static4.aClass389_17.aClass393_2);
			local601.aClass5_Sub36_Sub2_1.method7307(local542 << 16 | local207);
			local601.aClass5_Sub36_Sub2_1.method7277(local280 | local579 << 15);
			Static4.aClass389_17.method9079(local601);
		}
		@Pc(659) long local659;
		if (Static322.anInt5498 > 0) {
			local180 = Static647.method8905(Static233.aClass381_104, Static4.aClass389_17.aClass393_2);
			local180.aClass5_Sub36_Sub2_1.method7324(Static322.anInt5498 * 3);
			for (local182 = 0; local182 < Static322.anInt5498; local182++) {
				@Pc(650) Interface23 local650 = Static370.anInterface23Array2[local182];
				local659 = (local650.method4636() - Static15.aLong7) / 50L;
				if (local659 > 65535L) {
					local659 = 65535L;
				}
				Static15.aLong7 = local650.method4636();
				local180.aClass5_Sub36_Sub2_1.method7324(local650.method4633());
				local180.aClass5_Sub36_Sub2_1.method7296((int) local659);
			}
			Static4.aClass389_17.method9079(local180);
		}
		if (Static236.anInt4074 > 0) {
			Static236.anInt4074--;
		}
		if (Static669.aBoolean763 && Static236.anInt4074 <= 0) {
			Static236.anInt4074 = 20;
			Static669.aBoolean763 = false;
			local180 = Static647.method8905(Static435.aClass381_189, Static4.aClass389_17.aClass393_2);
			local180.aClass5_Sub36_Sub2_1.method7286((int) Static243.aFloat117 >> 3);
			local180.aClass5_Sub36_Sub2_1.method7286((int) Static211.aFloat113 >> 3);
			Static4.aClass389_17.method9079(local180);
		}
		if (Static645.aBoolean756 != Static310.aBoolean344) {
			Static310.aBoolean344 = Static645.aBoolean756;
			local180 = Static647.method8905(Static447.aClass381_195, Static4.aClass389_17.aClass393_2);
			local180.aClass5_Sub36_Sub2_1.method7324(Static645.aBoolean756 ? 1 : 0);
			Static4.aClass389_17.method9079(local180);
		}
		if (!Static386.aBoolean427) {
			local180 = Static647.method8905(Static433.aClass381_186, Static4.aClass389_17.aClass393_2);
			local180.aClass5_Sub36_Sub2_1.method7324(0);
			local182 = local180.aClass5_Sub36_Sub2_1.anInt8456;
			@Pc(819) Class5_Sub36 local819 = Static577.aClass5_Sub19_25.method2547();
			local180.aClass5_Sub36_Sub2_1.method7313(0, local819.anInt8456, local819.aByteArray89);
			local180.aClass5_Sub36_Sub2_1.method7314(local180.aClass5_Sub36_Sub2_1.anInt8456 - local182);
			Static4.aClass389_17.method9079(local180);
			Static386.aBoolean427 = true;
		}
		if (Static283.aClass128ArrayArrayArray1 != null) {
			if (Static426.anInt7111 == 2) {
				Static476.method6741();
			} else if (Static426.anInt7111 == 3) {
				Static153.method2791();
			}
		}
		if (Static509.aBoolean545) {
			Static509.aBoolean545 = false;
		} else {
			Static317.aFloat130 /= 2.0F;
		}
		if (Static448.aBoolean496) {
			Static448.aBoolean496 = false;
		} else {
			Static449.aFloat140 /= 2.0F;
		}
		Static177.method3097();
		if (Static652.anInt10664 != 11) {
			return;
		}
		Static231.method3636();
		Static523.method7138();
		Static461.method6501();
		Static4.aClass389_17.anInt10758++;
		if (Static4.aClass389_17.anInt10758 > 750) {
			Static613.method8423();
			return;
		}
		Static302.method4716();
		Static132.method1952();
		Static542.method7430();
		for (local83 = Static23.aClass247_1.method5706(true); local83 != -1; local83 = Static23.aClass247_1.method5706(false)) {
			Static65.method1087(local83);
			Static591.anIntArray534[Static484.anInt7864++ & 0x1F] = local83;
		}
		for (@Pc(976) Class5_Sub1_Sub18 local976 = Static336.method5052(); local976 != null; local976 = Static336.method5052()) {
			local542 = local976.method7442();
			local659 = local976.method7443();
			if (local542 == 1) {
				Static123.anIntArray120[(int) local659] = local976.anInt8635;
				Static195.aBoolean256 |= Static624.aBooleanArray27[(int) local659];
				Static253.anIntArray251[Static425.anInt7106++ & 0x1F] = (int) local659;
			} else if (local542 == 2) {
				Static140.aStringArray9[(int) local659] = local976.aString99;
				Static632.anIntArray584[Static120.anInt1959++ & 0x1F] = (int) local659;
			} else {
				@Pc(1040) Class238 local1040;
				if (local542 == 3) {
					local1040 = Static305.method4761((int) local659);
					if (!local976.aString99.equals(local1040.aString71)) {
						local1040.aString71 = local976.aString99;
						Static333.method5032(local1040);
					}
				} else {
					@Pc(1076) int local1076;
					if (local542 == 4) {
						local1040 = Static305.method4761((int) local659);
						local287 = local976.anInt8635;
						local298 = local976.anInt8632;
						local1076 = local976.anInt8638;
						if (local287 != local1040.anInt5967 || local1040.anInt5964 != local298 || local1076 != local1040.anInt6016) {
							local1040.anInt6016 = local1076;
							local1040.anInt5967 = local287;
							local1040.anInt5964 = local298;
							Static333.method5032(local1040);
						}
					} else if (local542 == 5) {
						local1040 = Static305.method4761((int) local659);
						if (local976.anInt8635 != local1040.anInt5996 || local976.anInt8635 == -1) {
							local1040.anInt6023 = 0;
							local1040.anInt5968 = 0;
							local1040.anInt6022 = 1;
							local1040.anInt5996 = local976.anInt8635;
							@Pc(1683) Class264 local1683 = local1040.anInt5996 == -1 ? null : Static315.aClass14_1.method227(local1040.anInt5996);
							if (local1683 != null) {
								Static179.method3121(local1040.anInt5968, local1683);
							}
							Static333.method5032(local1040);
						}
					} else if (local542 == 6) {
						local280 = local976.anInt8635;
						local287 = local280 >> 10 & 0x1F;
						local298 = local280 >> 5 & 0x1F;
						local1076 = local280 & 0x1F;
						@Pc(1615) int local1615 = (local1076 << 3) + ((local287 << 19) + (local298 << 11));
						@Pc(1620) Class238 local1620 = Static305.method4761((int) local659);
						if (local1615 != local1620.anInt5981) {
							local1620.anInt5981 = local1615;
							Static333.method5032(local1620);
						}
					} else if (local542 == 7) {
						local1040 = Static305.method4761((int) local659);
						@Pc(1145) boolean local1145 = local976.anInt8635 == 1;
						if (local1145 != local1040.aBoolean404) {
							local1040.aBoolean404 = local1145;
							Static333.method5032(local1040);
						}
					} else if (local542 == 8) {
						local1040 = Static305.method4761((int) local659);
						if (local1040.anInt5946 != local976.anInt8635 || local1040.anInt6025 != local976.anInt8632 || local1040.anInt5982 != local976.anInt8638) {
							local1040.anInt5982 = local976.anInt8638;
							local1040.anInt6025 = local976.anInt8632;
							local1040.anInt5946 = local976.anInt8635;
							if (local1040.anInt5990 != -1) {
								if (local1040.anInt5991 > 0) {
									local1040.anInt5982 = local1040.anInt5982 * 32 / local1040.anInt5991;
								} else if (local1040.anInt5980 > 0) {
									local1040.anInt5982 = local1040.anInt5982 * 32 / local1040.anInt5980;
								}
							}
							Static333.method5032(local1040);
						}
					} else if (local542 == 9) {
						local1040 = Static305.method4761((int) local659);
						if (local976.anInt8635 != local1040.anInt5990 || local1040.anInt6017 != local976.anInt8632) {
							local1040.anInt6017 = local976.anInt8632;
							local1040.anInt5990 = local976.anInt8635;
							Static333.method5032(local1040);
						}
					} else if (local542 == 10) {
						local1040 = Static305.method4761((int) local659);
						if (local976.anInt8635 != local1040.anInt6011 || local976.anInt8632 != local1040.anInt6027 || local1040.anInt6002 != local976.anInt8638) {
							local1040.anInt6002 = local976.anInt8638;
							local1040.anInt6011 = local976.anInt8635;
							local1040.anInt6027 = local976.anInt8632;
							Static333.method5032(local1040);
						}
					} else if (local542 == 11) {
						local1040 = Static305.method4761((int) local659);
						local1040.anInt5989 = local1040.anInt5992 = local976.anInt8632;
						local1040.anInt6028 = local1040.anInt5984 = local976.anInt8635;
						local1040.aByte86 = 0;
						local1040.aByte84 = 0;
						Static333.method5032(local1040);
					} else if (local542 == 12) {
						local1040 = Static305.method4761((int) local659);
						local287 = local976.anInt8635;
						if (local1040 != null && local1040.anInt5976 == 0) {
							if (local287 > local1040.anInt5995 - local1040.anInt5973) {
								local287 = local1040.anInt5995 - local1040.anInt5973;
							}
							if (local287 < 0) {
								local287 = 0;
							}
							if (local1040.anInt5953 != local287) {
								local1040.anInt5953 = local287;
								Static333.method5032(local1040);
							}
						}
					} else if (local542 == 14) {
						local1040 = Static305.method4761((int) local659);
						local1040.anInt5950 = local976.anInt8635;
					} else if (local542 == 15) {
						Static19.anInt250 = local976.anInt8635;
						Static405.anInt10904 = local976.anInt8632;
						Static286.aBoolean749 = true;
					} else if (local542 == 16) {
						local1040 = Static305.method4761((int) local659);
						local1040.anInt5942 = local976.anInt8635;
					} else if (local542 == 17) {
						local1040 = Static305.method4761((int) local659);
						local1040.anInt5974 = local976.anInt8635;
					} else if (local542 == 18) {
						local1040 = Static305.method4761((int) local659);
						local287 = (int) (local659 >> 32);
						local1040.method5305((short) local976.anInt8635, (short) local976.anInt8632, local287);
					} else if (local542 == 19) {
						local1040 = Static305.method4761((int) local659);
						local287 = (int) (local659 >> 32);
						local1040.method5320((short) local976.anInt8632, (short) local976.anInt8635, local287);
					}
				}
			}
		}
		if (Static80.anInt1424 != 0) {
			Static362.anInt9813 += 20;
			if (Static362.anInt9813 >= 400) {
				Static80.anInt1424 = 0;
			}
		}
		Static675.anInt10854++;
		if (Static447.aClass238_13 != null) {
			Static438.anInt7238++;
			if (Static438.anInt7238 >= 15) {
				Static333.method5032(Static447.aClass238_13);
				Static447.aClass238_13 = null;
			}
		}
		Static605.aClass238_15 = null;
		Static129.aBoolean146 = false;
		Static397.aClass238_12 = null;
		Static56.aBoolean79 = false;
		Static472.method6676((Class238) null, -1, -1);
		Static391.method5779(-1, (Class238) null, -1);
		if (!Static421.aBoolean472) {
			Static586.anInt9462 = -1;
		}
		Static188.method9008();
		Static55.anInt959++;
		if (Static51.aBoolean73) {
			@Pc(1809) Class5_Sub41 local1809 = Static647.method8905(Static201.aClass381_88, Static4.aClass389_17.aClass393_2);
			local1809.aClass5_Sub36_Sub2_1.method7284(Static91.anInt6734 | Static34.anInt514 << 28 | Static302.anInt5230 << 14);
			Static4.aClass389_17.method9079(local1809);
			Static51.aBoolean73 = false;
		}
		while (true) {
			@Pc(1833) Class5_Sub24 local1833;
			@Pc(1850) Class238 local1850;
			@Pc(1838) Class238 local1838;
			do {
				local1833 = (Class5_Sub24) Static669.aClass20_74.method369();
				if (local1833 == null) {
					while (true) {
						do {
							local1833 = (Class5_Sub24) Static350.aClass20_27.method369();
							if (local1833 == null) {
								while (true) {
									do {
										local1833 = (Class5_Sub24) Static196.aClass20_11.method369();
										if (local1833 == null) {
											if (Static605.aClass238_15 == null) {
												Static195.anInt3567 = 0;
											}
											if (Static388.aClass238_11 != null) {
												Static598.method9151();
											}
											if (Static296.anInt5190 > 0 && Static53.aClass297_1.method6737(82) && Static53.aClass297_1.method6737(81) && Static381.anInt6412 != 0) {
												local542 = Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aByte139 - Static381.anInt6412;
												if (local542 < 0) {
													local542 = 0;
												} else if (local542 > 3) {
													local542 = 3;
												}
												Static543.method7446(local542, Static290.anInt5128 + Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anIntArray404[0], Static315.anInt5380 - -Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anIntArray405[0]);
											}
											Static423.method9003();
											for (local542 = 0; local542 < 5; local542++) {
												@Pc(2053) int local2053 = Static41.anIntArray50[local542]++;
											}
											if (Static195.aBoolean256 && Static274.aLong141 < Static480.method6763() - 60000L) {
												Static66.method1106();
											}
											for (@Pc(2090) Class4_Sub4_Sub2 local2090 = (Class4_Sub4_Sub2) Static601.aClass387_7.method9018(); local2090 != null; local2090 = (Class4_Sub4_Sub2) Static601.aClass387_7.method9016()) {
												if (Static480.method6763() / 1000L - 5L > (long) local2090.anInt10036) {
													if (local2090.aShort118 > 0) {
														Static464.method6554("", "", 5, "", local2090.aString115 + Static184.aClass131_20.method3168(Static375.anInt7800), 0);
													}
													if (local2090.aShort118 == 0) {
														Static464.method6554("", "", 5, "", local2090.aString115 + Static184.aClass131_21.method3168(Static375.anInt7800), 0);
													}
													local2090.method8570();
												}
											}
											Static171.anInt5362++;
											if (Static171.anInt5362 > 500) {
												Static171.anInt5362 = 0;
												local227 = (int) (Math.random() * 8.0D);
												if ((local227 & 0x1) == 1) {
													Static362.anInt9812 += Static614.anInt9937;
												}
												if ((local227 & 0x2) == 2) {
													Static630.anInt10209 += Static47.anInt815;
												}
												if ((local227 & 0x4) == 4) {
													Static285.anInt5040 += Static587.anInt9488;
												}
											}
											if (Static362.anInt9812 < -50) {
												Static614.anInt9937 = 2;
											}
											if (Static362.anInt9812 > 50) {
												Static614.anInt9937 = -2;
											}
											if (Static630.anInt10209 < -55) {
												Static47.anInt815 = 2;
											}
											if (Static285.anInt5040 < -40) {
												Static587.anInt9488 = 1;
											}
											if (Static630.anInt10209 > 55) {
												Static47.anInt815 = -2;
											}
											Static216.anInt1164++;
											if (Static285.anInt5040 > 40) {
												Static587.anInt9488 = -1;
											}
											if (Static216.anInt1164 > 500) {
												Static216.anInt1164 = 0;
												local227 = (int) (Math.random() * 8.0D);
												if ((local227 & 0x2) == 2) {
													Static283.anInt5029 += Static654.anInt10672;
												}
												if ((local227 & 0x1) == 1) {
													Static271.anInt4907 += Static616.anInt9951;
												}
											}
											if (Static271.anInt4907 < -60) {
												Static616.anInt9951 = 2;
											}
											if (Static283.anInt5029 < -20) {
												Static654.anInt10672 = 1;
											}
											if (Static271.anInt4907 > 60) {
												Static616.anInt9951 = -2;
											}
											if (Static283.anInt5029 > 10) {
												Static654.anInt10672 = -1;
											}
											Static4.aClass389_17.anInt10760++;
											if (Static4.aClass389_17.anInt10760 > 50) {
												@Pc(2367) Class5_Sub41 local2367 = Static647.method8905(Static510.aClass381_211, Static4.aClass389_17.aClass393_2);
												Static4.aClass389_17.method9079(local2367);
											}
											if (Static351.aBoolean386) {
												Static408.method5960();
												Static351.aBoolean386 = false;
											}
											try {
												Static4.aClass389_17.method9078(94);
												return;
											} catch (@Pc(2384) IOException local2384) {
												Static613.method8423();
												return;
											}
										}
										local1838 = local1833.aClass238_6;
										if (local1838.anInt5986 < 0) {
											break;
										}
										local1850 = Static305.method4761(local1838.anInt5963);
									} while (local1850 == null || local1850.aClass238Array1 == null || local1850.aClass238Array1.length <= local1838.anInt5986 || local1838 != local1850.aClass238Array1[local1838.anInt5986]);
									Static247.method3957(local1833);
								}
							}
							local1838 = local1833.aClass238_6;
							if (local1838.anInt5986 < 0) {
								break;
							}
							local1850 = Static305.method4761(local1838.anInt5963);
						} while (local1850 == null || local1850.aClass238Array1 == null || local1850.aClass238Array1.length <= local1838.anInt5986 || local1850.aClass238Array1[local1838.anInt5986] != local1838);
						Static247.method3957(local1833);
					}
				}
				local1838 = local1833.aClass238_6;
				if (local1838.anInt5986 < 0) {
					break;
				}
				local1850 = Static305.method4761(local1838.anInt5963);
			} while (local1850 == null || local1850.aClass238Array1 == null || local1850.aClass238Array1.length <= local1838.anInt5986 || local1850.aClass238Array1[local1838.anInt5986] != local1838);
			Static247.method3957(local1833);
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IBI)Z")
	public static boolean method7230(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method7231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg0 < 1 || arg4 < 1 || arg0 > Static271.anInt4910 - 2 || Static613.anInt9909 - 2 < arg4) {
			return;
		}
		@Pc(38) int local38 = arg1;
		if (arg1 < 3 && Static389.method1741(arg4, arg0)) {
			local38 = arg1 + 1;
		}
		if (Static577.aClass5_Sub19_25.aClass17_Sub27_1.method9058() == 0 && !Static62.method1063(local38, Static8.anInt112, arg4, arg0)) {
			return;
		}
		if (Static283.aClass128ArrayArrayArray1 == null) {
			return;
		}
		Static168.aClass137_Sub1_1.method6467(arg4, arg1, arg0, Static273.aClass100_6, Static553.aClass169Array1[arg1], arg3);
		if (arg5 < 0) {
			return;
		}
		@Pc(94) int local94 = Static577.aClass5_Sub19_25.aClass17_Sub16_1.method5290();
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub16_1, 1);
		Static168.aClass137_Sub1_1.method6468(Static273.aClass100_6, arg5, arg2, arg7, arg6, arg1, local38, arg4, arg0, Static553.aClass169Array1[arg1]);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub16_1, local94);
		return;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lclient!pea;II)V")
	public static void method7232(@OriginalArg(0) Class283 arg0, @OriginalArg(1) int arg1) {
		if (Static60.aBoolean80) {
			arg1 = 0;
			Static60.aBoolean80 = false;
		}
		if (Static167.aClass283_3 != null && Static167.aClass283_3.method6390(arg0)) {
			return;
		}
		Static167.aClass283_3 = arg0;
		Static248.aLong132 = Static480.method6763();
		Static382.anInt6450 = arg1;
		Static67.anInt1117 = arg1;
		if (Static67.anInt1117 != 0) {
			Static103.aClass185_1 = Static534.aClass185_4;
			Static172.aFloat185 = Static76.aFloat37;
			Static41.aFloat27 = Static467.aFloat149;
			Static127.aFloat60 = Static332.aFloat131;
			Static194.aFloat215 = Static475.aFloat213;
			Static298.aFloat128 = Static369.aFloat134;
			Static282.anInt5023 = Static602.anInt9697;
			Static649.anInt10615 = Static575.anInt9001;
			Static268.aFloat120 = Static456.aFloat148;
			Static423.anInt10674 = Static675.anInt10852;
			return;
		}
		Static321.method4908();
	}
}
