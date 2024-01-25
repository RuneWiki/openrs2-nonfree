import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static484 {

	@OriginalMember(owner = "client!u", name = "o", descriptor = "I")
	public static int anInt8947;

	@OriginalMember(owner = "client!u", name = "s", descriptor = "I")
	public static int anInt8950;

	@OriginalMember(owner = "client!u", name = "q", descriptor = "I")
	public static int anInt8949 = 0;

	@OriginalMember(owner = "client!u", name = "r", descriptor = "Lclient!cb;")
	public static final Class42 aClass42_43 = new Class42(16);

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ZZI)V")
	public static void method7246(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class5_Sub24 local10 = Static459.method6391(arg1, arg0);
		if (local10 != null) {
			for (@Pc(23) int local23 = 0; local23 < local10.anIntArray261.length; local23++) {
				local10.anIntArray261[local23] = -1;
				local10.anIntArray260[local23] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(III)Z")
	public static boolean method7247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!nn;I)V")
	public static void method7248(@OriginalArg(0) Class212 arg0) {
		@Pc(12) int local12;
		@Pc(20) int local20;
		@Pc(26) int local26;
		@Pc(38) int local38;
		@Pc(42) int local42;
		@Pc(54) int local54;
		@Pc(62) int local62;
		@Pc(46) int local46;
		@Pc(50) int local50;
		@Pc(58) int local58;
		if (Static22.aClass212_1 == arg0) {
			local12 = Static131.aClass5_Sub3_Sub1_1.method4226();
			local20 = (local12 >> 4 & 0x7) + Static140.anInt2860;
			local26 = Static397.anInt7135 + (local12 & 0x7);
			@Pc(30) byte local30 = Static131.aClass5_Sub3_Sub1_1.method4189();
			@Pc(34) byte local34 = Static131.aClass5_Sub3_Sub1_1.method4196();
			local38 = Static131.aClass5_Sub3_Sub1_1.method4210();
			local42 = Static131.aClass5_Sub3_Sub1_1.method4220();
			local46 = local42 >> 2;
			local50 = local42 & 0x3;
			local54 = Static131.aClass5_Sub3_Sub1_1.method4227();
			local58 = Static131.aClass5_Sub3_Sub1_1.method4205();
			local62 = Static131.aClass5_Sub3_Sub1_1.method4205();
			@Pc(66) byte local66 = Static131.aClass5_Sub3_Sub1_1.method4189();
			@Pc(70) byte local70 = Static131.aClass5_Sub3_Sub1_1.method4215();
			if (!Static110.aClass62_15.method7062()) {
				Static148.method2764(local62, local54, local50, local70, local34, local38, local46, local66, local26, Static142.anInt2982, local58, local30, local20);
			}
			return;
		}
		@Pc(130) int local130;
		@Pc(168) int local168;
		@Pc(177) int local177;
		if (arg0 == Static325.aClass212_15) {
			local12 = Static131.aClass5_Sub3_Sub1_1.method4220();
			local20 = Static140.anInt2860 * 2 + (local12 >> 4 & 0xF);
			local26 = Static397.anInt7135 * 2 + (local12 & 0xF);
			@Pc(124) boolean local124 = Static131.aClass5_Sub3_Sub1_1.method4220() != 0;
			local130 = Static131.aClass5_Sub3_Sub1_1.method4196() + local20;
			local38 = Static131.aClass5_Sub3_Sub1_1.method4196() + local26;
			local42 = Static131.aClass5_Sub3_Sub1_1.method4212();
			local46 = Static131.aClass5_Sub3_Sub1_1.method4227();
			local50 = Static131.aClass5_Sub3_Sub1_1.method4220() * 4;
			local54 = Static131.aClass5_Sub3_Sub1_1.method4220() * 4;
			local58 = Static131.aClass5_Sub3_Sub1_1.method4227();
			local62 = Static131.aClass5_Sub3_Sub1_1.method4227();
			local168 = Static131.aClass5_Sub3_Sub1_1.method4220();
			if (local168 == 255) {
				local168 = -1;
			}
			local177 = Static131.aClass5_Sub3_Sub1_1.method4227();
			if (local20 >= 0 && local26 >= 0 && local20 < Static460.anInt7894 * 2 && Static460.anInt7894 * 2 > local26 && local130 >= 0 && local38 >= 0 && Static235.anInt4493 * 2 > local130 && Static235.anInt4493 * 2 > local38 && local46 != 65535) {
				local38 *= 64;
				local26 *= 64;
				local50 <<= 0x0;
				local130 = local130 * 64;
				local177 <<= 0x0;
				local54 <<= 0x0;
				local20 *= 64;
				@Pc(280) Class15_Sub2_Sub3 local280 = new Class15_Sub2_Sub3(local46, Static142.anInt2982, local20, local26, local50, local58 + Static481.anInt8318, local62 - -Static481.anInt8318, local168, local177, local42, local54, local124);
				local280.method3427(Static191.method5464(local130, local38, Static142.anInt2982) - local54, local38, local130, Static481.anInt8318 + local58);
				Static22.aClass99_3.method2513(new Class5_Sub2_Sub15(local280));
			}
			return;
		}
		@Pc(322) int local322;
		if (arg0 == Static276.aClass212_14) {
			local12 = Static131.aClass5_Sub3_Sub1_1.method4183();
			local20 = local12 >> 2;
			local26 = local12 & 0x3;
			local322 = Static114.anIntArray215[local20];
			local130 = Static131.aClass5_Sub3_Sub1_1.method4226();
			local38 = (local130 >> 4 & 0x7) + Static140.anInt2860;
			local42 = (local130 & 0x7) + Static397.anInt7135;
			local46 = Static131.aClass5_Sub3_Sub1_1.method4227();
			if (local46 == 65535) {
				local46 = -1;
			}
			Static164.method2919(local20, local46, Static142.anInt2982, local38, local26, local322, local42);
		} else if (arg0 == Static540.aClass212_19) {
			local12 = Static131.aClass5_Sub3_Sub1_1.method4171();
			local20 = (local12 & 0x7) + Static397.anInt7135;
			local26 = Static338.anInt6353 + local20;
			local322 = Static140.anInt2860 + (local12 >> 4 & 0x7);
			local130 = Static515.anInt3214 + local322;
			local38 = Static131.aClass5_Sub3_Sub1_1.method4202();
			local42 = Static131.aClass5_Sub3_Sub1_1.method4232();
			@Pc(428) boolean local428 = local322 >= 0 && local20 >= 0 && Static460.anInt7894 > local322 && local20 < Static235.anInt4493;
			if (local428 || Static171.method3014(Static56.anInt1176)) {
				Static354.method5488(new Class5_Sub4(local38, local42), local26, Static142.anInt2982, local130);
				if (local428) {
					Static172.method7331(local20, local322, Static142.anInt2982);
				}
			}
		} else if (Static155.aClass212_8 == arg0) {
			local20 = Static131.aClass5_Sub3_Sub1_1.method4220();
			local26 = (local20 & 0x7) + Static397.anInt7135;
			local322 = Static338.anInt6353 + local26;
			local130 = (local20 >> 4 & 0x7) + Static140.anInt2860;
			local38 = local130 + Static515.anInt3214;
			local42 = Static131.aClass5_Sub3_Sub1_1.method4227();
			local46 = Static131.aClass5_Sub3_Sub1_1.method4227();
			local50 = Static131.aClass5_Sub3_Sub1_1.method4227();
			if (Static181.aClass42_11 != null) {
				@Pc(519) Class5_Sub7 local519 = (Class5_Sub7) Static181.aClass42_11.method1109((long) (local322 << 14 | Static142.anInt2982 << 28 | local38));
				if (local519 != null) {
					for (@Pc(527) Class5_Sub4 local527 = (Class5_Sub4) local519.aClass99_12.method2526(); local527 != null; local527 = (Class5_Sub4) local519.aClass99_12.method2519()) {
						if ((local42 & 0x7FFF) == local527.anInt469 && local527.anInt468 == local46) {
							local527.method7425();
							local527.anInt468 = local50;
							Static354.method5488(local527, local322, Static142.anInt2982, local38);
							break;
						}
					}
					if (local130 >= 0 && local26 >= 0 && local130 < Static460.anInt7894 && Static235.anInt4493 > local26) {
						Static172.method7331(local26, local130, Static142.anInt2982);
					}
				}
			}
		} else if (arg0 == Static206.aClass212_12) {
			local20 = Static131.aClass5_Sub3_Sub1_1.method4220();
			local26 = Static140.anInt2860 + (local20 >> 4 & 0x7);
			local322 = (local20 & 0x7) + Static397.anInt7135;
			local130 = Static131.aClass5_Sub3_Sub1_1.method4227();
			local38 = Static131.aClass5_Sub3_Sub1_1.method4220();
			local42 = Static131.aClass5_Sub3_Sub1_1.method4227();
			local46 = Static131.aClass5_Sub3_Sub1_1.method4220();
			if (local26 >= 0 && local322 >= 0 && local26 < Static460.anInt7894 && Static235.anInt4493 > local322) {
				local50 = local26 * 128 + 64;
				local54 = local322 * 128 + 64;
				local58 = Static142.anInt2982;
				if (local58 < 3 && Static279.method4553(local322, local26)) {
					local58++;
				}
				@Pc(698) Class15_Sub2_Sub5 local698 = new Class15_Sub2_Sub5(local130, local42, Static481.anInt8318, Static142.anInt2982, local58, local50, Static191.method5464(local50, local54, Static142.anInt2982) - local38, local54, local26, local26, local322, local322, local46);
				Static98.aClass99_17.method2513(new Class5_Sub2_Sub8(local698));
			}
		} else if (Static94.aClass212_6 == arg0) {
			local20 = Static131.aClass5_Sub3_Sub1_1.method4202();
			local26 = Static131.aClass5_Sub3_Sub1_1.method4232();
			local322 = Static131.aClass5_Sub3_Sub1_1.method4183();
			local130 = (local322 & 0x7) + Static397.anInt7135;
			local38 = local130 + Static338.anInt6353;
			local42 = Static140.anInt2860 + (local322 >> 4 & 0x7);
			local46 = local42 + Static515.anInt3214;
			local50 = Static131.aClass5_Sub3_Sub1_1.method4227();
			if (local50 != Static510.anInt8653) {
				@Pc(769) boolean local769 = local42 >= 0 && local130 >= 0 && Static460.anInt7894 > local42 && local130 < Static235.anInt4493;
				if (local769 || Static171.method3014(Static56.anInt1176)) {
					Static354.method5488(new Class5_Sub4(local20, local26), local38, Static142.anInt2982, local46);
					if (local769) {
						Static172.method7331(local130, local42, Static142.anInt2982);
					}
				}
			}
		} else if (arg0 == Static517.aClass212_17) {
			local20 = Static131.aClass5_Sub3_Sub1_1.method4220();
			local26 = local20 >> 2;
			local322 = local20 & 0x3;
			local130 = Static114.anIntArray215[local26];
			local38 = Static131.aClass5_Sub3_Sub1_1.method4220();
			local42 = Static140.anInt2860 + (local38 >> 4 & 0x7);
			local46 = (local38 & 0x7) + Static397.anInt7135;
			if (Static171.method3014(Static56.anInt1176) || local42 >= 0 && local46 >= 0 && local42 < Static460.anInt7894 && local46 < Static235.anInt4493) {
				Static111.method2210(Static142.anInt2982, local322, -1, local130, local46, local26, local42);
			}
		} else if (arg0 == Static230.aClass212_10) {
			local20 = Static131.aClass5_Sub3_Sub1_1.method4205();
			local26 = Static131.aClass5_Sub3_Sub1_1.method4226();
			local322 = Static140.anInt2860 + (local26 >> 4 & 0x7);
			local130 = (local26 & 0x7) + Static397.anInt7135;
			local38 = Static131.aClass5_Sub3_Sub1_1.method4171();
			local42 = local38 >> 2;
			local46 = local38 & 0x3;
			local50 = Static114.anIntArray215[local42];
			if (Static171.method3014(Static56.anInt1176) || local322 >= 0 && local130 >= 0 && local322 < Static460.anInt7894 && Static235.anInt4493 > local130) {
				Static111.method2210(Static142.anInt2982, local46, local20, local50, local130, local42, local322);
			}
		} else if (Static214.aClass212_9 == arg0) {
			local20 = Static131.aClass5_Sub3_Sub1_1.method4227();
			local26 = Static131.aClass5_Sub3_Sub1_1.method4220();
			Static453.aClass88_3.method2294(local20).method6608(local26);
		} else {
			@Pc(1030) int local1030;
			if (arg0 == Static236.aClass212_11) {
				local20 = Static131.aClass5_Sub3_Sub1_1.method4220();
				@Pc(968) boolean local968 = (local20 & 0x80) != 0;
				local322 = (local20 >> 3 & 0x7) + Static140.anInt2860;
				local130 = Static397.anInt7135 + (local20 & 0x7);
				local38 = local322 + Static131.aClass5_Sub3_Sub1_1.method4196();
				local42 = Static131.aClass5_Sub3_Sub1_1.method4196() + local130;
				local46 = Static131.aClass5_Sub3_Sub1_1.method4212();
				local50 = Static131.aClass5_Sub3_Sub1_1.method4227();
				local54 = Static131.aClass5_Sub3_Sub1_1.method4220() * 4;
				local58 = Static131.aClass5_Sub3_Sub1_1.method4220() * 4;
				local62 = Static131.aClass5_Sub3_Sub1_1.method4227();
				local168 = Static131.aClass5_Sub3_Sub1_1.method4227();
				local177 = Static131.aClass5_Sub3_Sub1_1.method4220();
				local1030 = Static131.aClass5_Sub3_Sub1_1.method4227();
				if (local177 == 255) {
					local177 = -1;
				}
				if (local322 >= 0 && local130 >= 0 && Static460.anInt7894 > local322 && local130 < Static235.anInt4493 && local38 >= 0 && local42 >= 0 && local38 < Static460.anInt7894 && local42 < Static235.anInt4493 && local50 != 65535) {
					local322 = local322 * 128 + 64;
					local54 <<= 0x0;
					local1030 <<= 0x0;
					local38 = local38 * 128 + 64;
					local130 = local130 * 128 + 64;
					local42 = local42 * 128 + 64;
					local58 <<= 0x0;
					@Pc(1129) Class15_Sub2_Sub3 local1129 = new Class15_Sub2_Sub3(local50, Static142.anInt2982, local322, local130, local54, Static481.anInt8318 + local62, local168 + Static481.anInt8318, local177, local1030, local46, local58, local968);
					local1129.method3427(Static191.method5464(local38, local42, Static142.anInt2982) - local58, local42, local38, Static481.anInt8318 + local62);
					Static22.aClass99_3.method2513(new Class5_Sub2_Sub15(local1129));
				}
			} else if (Static494.aClass212_16 == arg0) {
				Static131.aClass5_Sub3_Sub1_1.method4220();
				local20 = Static131.aClass5_Sub3_Sub1_1.method4220();
				local26 = (local20 >> 4 & 0x7) + Static140.anInt2860;
				local322 = Static397.anInt7135 + (local20 & 0x7);
				local130 = Static131.aClass5_Sub3_Sub1_1.method4227();
				local38 = Static131.aClass5_Sub3_Sub1_1.method4220();
				local42 = Static131.aClass5_Sub3_Sub1_1.method4182();
				@Pc(1193) String local1193 = Static131.aClass5_Sub3_Sub1_1.method4234();
				Static100.method2088(local1193, local322, local38, Static142.anInt2982, local42, local26, local130);
			} else if (Static67.aClass212_18 == arg0) {
				local20 = Static131.aClass5_Sub3_Sub1_1.method4220();
				local26 = (local20 >> 4 & 0x7) + Static140.anInt2860;
				local322 = Static397.anInt7135 + (local20 & 0x7);
				local130 = Static131.aClass5_Sub3_Sub1_1.method4227();
				if (local130 == 65535) {
					local130 = -1;
				}
				local38 = Static131.aClass5_Sub3_Sub1_1.method4220();
				local42 = local38 >> 4 & 0xF;
				local46 = local38 & 0x7;
				local50 = Static131.aClass5_Sub3_Sub1_1.method4220();
				local54 = Static131.aClass5_Sub3_Sub1_1.method4220();
				if (local26 >= 0 && local322 >= 0 && Static460.anInt7894 > local26 && Static235.anInt4493 > local322) {
					local58 = local42 + 1;
					if (Static35.aClass15_Sub2_Sub1_Sub1_1.anIntArray306[0] >= local26 - local58 && local26 + local58 >= Static35.aClass15_Sub2_Sub1_Sub1_1.anIntArray306[0] && Static35.aClass15_Sub2_Sub1_Sub1_1.anIntArray307[0] >= local322 - local58 && Static35.aClass15_Sub2_Sub1_Sub1_1.anIntArray307[0] <= local58 + local322) {
						Static174.method3029(local54, local130, local42 + (Static142.anInt2982 << 24) + (local26 << 16) + (local322 << 8), local46, local50);
					}
				}
			} else if (arg0 == Static118.aClass212_7) {
				local20 = Static131.aClass5_Sub3_Sub1_1.method4227();
				local26 = Static131.aClass5_Sub3_Sub1_1.method4226();
				local322 = (local26 & 0x7) + Static397.anInt7135;
				local130 = Static338.anInt6353 + local322;
				local38 = (local26 >> 4 & 0x7) + Static140.anInt2860;
				local42 = Static515.anInt3214 + local38;
				@Pc(1392) Class5_Sub7 local1392 = (Class5_Sub7) Static181.aClass42_11.method1109((long) (local42 | Static142.anInt2982 << 28 | local130 << 14));
				if (local1392 != null) {
					for (@Pc(1400) Class5_Sub4 local1400 = (Class5_Sub4) local1392.aClass99_12.method2526(); local1400 != null; local1400 = (Class5_Sub4) local1392.aClass99_12.method2519()) {
						if (local1400.anInt469 == (local20 & 0x7FFF)) {
							local1400.method7425();
							break;
						}
					}
					if (local1392.aClass99_12.method2523()) {
						local1392.method7425();
					}
					if (local38 >= 0 && local322 >= 0 && local38 < Static460.anInt7894 && local322 < Static235.anInt4493) {
						Static172.method7331(local322, local38, Static142.anInt2982);
					}
				}
			} else if (arg0 == Static86.aClass212_5) {
				local20 = Static131.aClass5_Sub3_Sub1_1.method4220();
				local26 = Static140.anInt2860 * 2 + (local20 >> 4 & 0xF);
				local322 = Static397.anInt7135 * 2 + (local20 & 0xF);
				@Pc(1489) boolean local1489 = Static131.aClass5_Sub3_Sub1_1.method4220() != 0;
				local38 = local26 + Static131.aClass5_Sub3_Sub1_1.method4196();
				local42 = Static131.aClass5_Sub3_Sub1_1.method4196() + local322;
				local46 = Static131.aClass5_Sub3_Sub1_1.method4212();
				local50 = Static131.aClass5_Sub3_Sub1_1.method4212();
				local54 = Static131.aClass5_Sub3_Sub1_1.method4227();
				@Pc(1518) byte local1518 = Static131.aClass5_Sub3_Sub1_1.method4196();
				local62 = Static131.aClass5_Sub3_Sub1_1.method4220() * 4;
				local168 = Static131.aClass5_Sub3_Sub1_1.method4227();
				local177 = Static131.aClass5_Sub3_Sub1_1.method4227();
				local1030 = Static131.aClass5_Sub3_Sub1_1.method4220();
				if (local1030 == 255) {
					local1030 = -1;
				}
				@Pc(1545) int local1545 = Static131.aClass5_Sub3_Sub1_1.method4227();
				if (local26 >= 0 && local322 >= 0 && Static460.anInt7894 * 2 > local26 && Static460.anInt7894 * 2 > local322 && local38 >= 0 && local42 >= 0 && Static235.anInt4493 * 2 > local38 && local42 < Static235.anInt4493 * 2 && local54 != 65535) {
					local58 = local1518 << 0;
					local38 = local38 * 64;
					local1545 <<= 0x0;
					local42 = local42 * 64;
					local322 *= 64;
					local26 *= 64;
					local62 <<= 0x0;
					if (local46 != 0) {
						@Pc(1623) Class15_Sub2_Sub1 local1623 = null;
						@Pc(1640) int local1640;
						@Pc(1630) int local1630;
						@Pc(1634) int local1634;
						if (local46 < 0) {
							local1630 = -local46 - 1;
							local1634 = local1630 & 0x7FF;
							local1640 = local1630 >> 11 & 0xF;
							if (Static510.anInt8653 == local1634) {
								local1623 = Static35.aClass15_Sub2_Sub1_Sub1_1;
							} else {
								local1623 = Static10.aClass15_Sub2_Sub1_Sub1Array1[local1634];
							}
						} else {
							local1630 = local46 - 1;
							local1640 = local1630 >> 11 & 0xF;
							local1634 = local1630 & 0x7FF;
							@Pc(1672) Class5_Sub51 local1672 = (Class5_Sub51) Static521.aClass42_42.method1109((long) local1634);
							if (local1672 != null) {
								local1623 = local1672.aClass15_Sub2_Sub1_Sub2_2;
							}
						}
						if (local1623 != null) {
							@Pc(1683) Class281 local1683 = local1623.method4026();
							if (local1683.anIntArrayArray67 != null && local1683.anIntArrayArray67[local1640] != null) {
								local1634 = local1683.anIntArrayArray67[local1640][0];
								@Pc(1705) int local1705 = local1683.anIntArrayArray67[local1640][2];
								@Pc(1710) int local1710 = local1623.aClass257_7.method6126();
								@Pc(1714) int local1714 = Class5_Sub2_Sub16.anIntArray411[local1710];
								@Pc(1718) int local1718 = Class5_Sub2_Sub16.anIntArray410[local1710];
								@Pc(1728) int local1728 = local1634 * local1718 + local1705 * local1714 >> 15;
								@Pc(1739) int local1739 = local1705 * local1718 - local1634 * local1714 >> 15;
								local322 += local1739;
								local58 -= local1683.anIntArrayArray67[local1640][1];
								local26 += local1728;
							}
						}
					}
					@Pc(1779) Class15_Sub2_Sub3 local1779 = new Class15_Sub2_Sub3(local54, Static142.anInt2982, local26, local322, local58, local168 + Static481.anInt8318, local177 + Static481.anInt8318, local1030, local1545, local50, local62, local1489);
					local1779.method3427(Static191.method5464(local38, local42, Static142.anInt2982) - local62, local42, local38, Static481.anInt8318 + local168);
					Static22.aClass99_3.method2513(new Class5_Sub2_Sub15(local1779));
				}
			} else {
				Static370.method6434("T3 - " + arg0, null);
				Static286.method4827(false);
			}
		}
	}
}
