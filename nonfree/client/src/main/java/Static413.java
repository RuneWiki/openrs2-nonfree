import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static413 {

	@OriginalMember(owner = "client!nt", name = "r", descriptor = "I")
	public static int anInt6607;

	@OriginalMember(owner = "client!nt", name = "s", descriptor = "Lclient!u;")
	public static Class342 aClass342_2;

	@OriginalMember(owner = "client!nt", name = "c", descriptor = "Lclient!wt;")
	public static final Class393 aClass393_4 = new Class393();

	@OriginalMember(owner = "client!nt", name = "t", descriptor = "I")
	public static int anInt6608 = 0;

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIIIIIBII)V")
	public static void method5901(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		Static216.aClass60Array4[Static618.anInt9907++] = new Class60(4, arg5, arg6, arg2, arg2, arg6, arg1, arg0, arg0, arg1, arg4, arg4, arg3, arg3);
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(Lclient!tja;I)V")
	public static void method5904(@OriginalArg(0) Class336 arg0) {
		@Pc(12) int local12;
		@Pc(16) int local16;
		@Pc(20) int local20;
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(36) int local36;
		@Pc(42) int local42;
		if (Static561.aClass336_18 == arg0) {
			local12 = Static210.aClass3_Sub25_Sub1_3.method8632();
			local16 = local12 >> 2;
			local20 = local12 & 0x3;
			local24 = Static643.anIntArray893[local16];
			local28 = Static210.aClass3_Sub25_Sub1_3.method8615();
			local36 = Static373.anInt5978 + (local28 >> 4 & 0x7);
			local42 = (local28 & 0x7) + Static109.anInt2262;
			if (Static167.method3039(Static567.anInt5924) || local36 >= 0 && local42 >= 0 && local36 < Static158.anInt927 && Static515.anInt8292 > local42) {
				Static57.method1241(local16, Static659.anInt10542, local20, -1, local42, local36, local24);
			}
			return;
		}
		@Pc(120) int local120;
		@Pc(124) int local124;
		@Pc(128) int local128;
		@Pc(148) int local148;
		if (arg0 == Static427.aClass336_13) {
			local12 = Static210.aClass3_Sub25_Sub1_3.method8632();
			local16 = (local12 >> 4 & 0x7) + Static373.anInt5978;
			local20 = (local12 & 0x7) + Static109.anInt2262;
			local24 = Static210.aClass3_Sub25_Sub1_3.method8593();
			if (local24 == 65535) {
				local24 = -1;
			}
			local28 = Static210.aClass3_Sub25_Sub1_3.method8632();
			local36 = local28 >> 4 & 0xF;
			local42 = local28 & 0x7;
			local120 = Static210.aClass3_Sub25_Sub1_3.method8632();
			local124 = Static210.aClass3_Sub25_Sub1_3.method8632();
			local128 = Static210.aClass3_Sub25_Sub1_3.method8593();
			if (local16 >= 0 && local20 >= 0 && Static158.anInt927 > local16 && Static515.anInt8292 > local20) {
				local148 = local36 + 1;
				if (Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anIntArray956[0] >= local16 - local148 && local16 + local148 >= Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anIntArray956[0] && Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anIntArray955[0] >= local20 - local148 && Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anIntArray955[0] <= local20 + local148) {
					Static564.method7999(local124, local42, local120, local24, (local16 << 16) + (Static659.anInt10542 << 24) + (local20 << 8) + local36, local128);
				}
			}
		} else if (arg0 == Static176.aClass336_7) {
			local12 = Static210.aClass3_Sub25_Sub1_3.method8615();
			local16 = Static109.anInt2262 + (local12 & 0x7);
			local20 = Static72.anInt1361 + local16;
			local24 = (local12 >> 4 & 0x7) + Static373.anInt5978;
			local28 = Static287.anInt4910 + local24;
			local36 = Static210.aClass3_Sub25_Sub1_3.method8644();
			@Pc(261) Class3_Sub16 local261 = (Class3_Sub16) Static98.aClass83_6.method2368((long) (local28 | Static659.anInt10542 << 28 | local20 << 14));
			if (local261 != null) {
				for (@Pc(269) Class3_Sub27 local269 = (Class3_Sub27) local261.aClass338_44.method8177(); local269 != null; local269 = (Class3_Sub27) local261.aClass338_44.method8168()) {
					if (local269.anInt3843 == (local36 & 0x7FFF)) {
						local269.method9380();
						break;
					}
				}
				if (local261.aClass338_44.method8166()) {
					local261.method9380();
				}
				if (local24 >= 0 && local16 >= 0 && Static158.anInt927 > local24 && Static515.anInt8292 > local16) {
					Static154.method2813(local16, Static659.anInt10542, local24);
				}
			}
		} else if (Static506.aClass336_16 == arg0) {
			local12 = Static210.aClass3_Sub25_Sub1_3.method8632();
			local16 = (local12 & 0x7) + Static109.anInt2262;
			local20 = local16 + Static72.anInt1361;
			local24 = (local12 >> 4 & 0x7) + Static373.anInt5978;
			local28 = Static287.anInt4910 + local24;
			local36 = Static210.aClass3_Sub25_Sub1_3.method8593();
			local42 = Static210.aClass3_Sub25_Sub1_3.method8593();
			local120 = Static210.aClass3_Sub25_Sub1_3.method8593();
			if (Static98.aClass83_6 != null) {
				@Pc(387) Class3_Sub16 local387 = (Class3_Sub16) Static98.aClass83_6.method2368((long) (local28 | local20 << 14 | Static659.anInt10542 << 28));
				if (local387 != null) {
					for (@Pc(395) Class3_Sub27 local395 = (Class3_Sub27) local387.aClass338_44.method8177(); local395 != null; local395 = (Class3_Sub27) local387.aClass338_44.method8168()) {
						if (local395.anInt3843 == (local36 & 0x7FFF) && local42 == local395.anInt3845) {
							local395.method9380();
							local395.anInt3845 = local120;
							Static584.method8239(local20, Static659.anInt10542, local395, local28);
							break;
						}
					}
					if (local24 >= 0 && local16 >= 0 && local24 < Static158.anInt927 && local16 < Static515.anInt8292) {
						Static154.method2813(local16, Static659.anInt10542, local24);
					}
				}
			}
		} else if (arg0 == Static85.aClass336_4) {
			local12 = Static210.aClass3_Sub25_Sub1_3.method8644();
			local16 = Static210.aClass3_Sub25_Sub1_3.method8639();
			local20 = Static210.aClass3_Sub25_Sub1_3.method8615();
			local24 = Static109.anInt2262 + (local20 & 0x7);
			local28 = local24 + Static72.anInt1361;
			local36 = (local20 >> 4 & 0x7) + Static373.anInt5978;
			local42 = local36 + Static287.anInt4910;
			@Pc(517) boolean local517 = local36 >= 0 && local24 >= 0 && local36 < Static158.anInt927 && Static515.anInt8292 > local24;
			if (local517 || Static167.method3039(Static567.anInt5924)) {
				Static584.method8239(local28, Static659.anInt10542, new Class3_Sub27(local12, local16), local42);
				if (local517) {
					Static154.method2813(local24, Static659.anInt10542, local36);
				}
			}
		} else {
			@Pc(626) int local626;
			@Pc(647) int local647;
			@Pc(651) int local651;
			@Pc(655) int local655;
			@Pc(630) int local630;
			if (Static313.aClass336_11 == arg0) {
				local12 = Static210.aClass3_Sub25_Sub1_3.method8632();
				local16 = (local12 >> 4 & 0xF) + Static373.anInt5978 * 2;
				local20 = Static109.anInt2262 * 2 + (local12 & 0xF);
				local24 = Static210.aClass3_Sub25_Sub1_3.method8632();
				@Pc(583) boolean local583 = (local24 & 0x1) != 0;
				@Pc(594) boolean local594 = (local24 & 0x2) != 0;
				local42 = local594 ? local24 >> 2 : -1;
				local120 = local16 + Static210.aClass3_Sub25_Sub1_3.method8621();
				local124 = Static210.aClass3_Sub25_Sub1_3.method8621() + local20;
				local128 = Static210.aClass3_Sub25_Sub1_3.method8589();
				local148 = Static210.aClass3_Sub25_Sub1_3.method8589();
				local626 = Static210.aClass3_Sub25_Sub1_3.method8593();
				local630 = Static210.aClass3_Sub25_Sub1_3.method8632();
				if (local594) {
					local630 = (byte) local630;
				} else {
					local630 *= 4;
				}
				local647 = Static210.aClass3_Sub25_Sub1_3.method8632() * 4;
				local651 = Static210.aClass3_Sub25_Sub1_3.method8593();
				local655 = Static210.aClass3_Sub25_Sub1_3.method8593();
				@Pc(659) int local659 = Static210.aClass3_Sub25_Sub1_3.method8632();
				if (local659 == 255) {
					local659 = -1;
				}
				@Pc(670) int local670 = Static210.aClass3_Sub25_Sub1_3.method8593();
				if (local16 >= 0 && local20 >= 0 && Static158.anInt927 * 2 > local16 && local20 < Static158.anInt927 * 2 && local120 >= 0 && local124 >= 0 && local120 < Static515.anInt8292 * 2 && Static515.anInt8292 * 2 > local124 && local626 != 65535) {
					local20 *= 256;
					local16 *= 256;
					local647 <<= 0x2;
					local670 <<= 0x2;
					local120 *= 256;
					local124 *= 256;
					local630 <<= 0x2;
					if (local128 != 0 && local42 != -1) {
						@Pc(755) Class28_Sub1_Sub1_Sub1 local755 = null;
						@Pc(764) int local764;
						if (local128 >= 0) {
							local764 = local128 - 1;
							@Pc(771) Class3_Sub3 local771 = (Class3_Sub3) Static522.aClass83_34.method2368((long) local764);
							if (local771 != null) {
								local755 = local771.aClass28_Sub1_Sub1_Sub1_Sub2_1;
							}
						} else {
							local764 = -local128 - 1;
							if (Static106.anInt2205 == local764) {
								local755 = Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2;
							} else {
								local755 = Static611.aClass28_Sub1_Sub1_Sub1_Sub1Array1[local764];
							}
						}
						if (local755 != null) {
							@Pc(798) Class359 local798 = local755.method9315();
							if (local798.anIntArrayArray62 != null && local798.anIntArrayArray62[local42] != null) {
								local630 -= local798.anIntArrayArray62[local42][1];
							}
							if (local798.anIntArrayArray63 != null && local798.anIntArrayArray63[local42] != null) {
								local630 -= local798.anIntArrayArray63[local42][1];
							}
						}
					}
					@Pc(855) Class28_Sub1_Sub1_Sub3 local855 = new Class28_Sub1_Sub1_Sub3(local626, Static659.anInt10542, Static659.anInt10542, local16, local20, local630, local651 + Static588.anInt9467, local655 + Static588.anInt9467, local659, local670, local128, local148, local647, local583, local42);
					local855.method5958(local651 + Static588.anInt9467, local120, Static168.method3058(Static659.anInt10542, local120, local124) - local647, local124);
					Static171.aClass338_90.method8171(new Class3_Sub11_Sub20(local855));
				}
			} else if (arg0 == Static238.aClass336_10) {
				local12 = Static210.aClass3_Sub25_Sub1_3.method8632();
				local16 = (local12 >> 4 & 0x7) + Static373.anInt5978;
				local20 = Static109.anInt2262 + (local12 & 0x7);
				local24 = Static210.aClass3_Sub25_Sub1_3.method8609();
				local28 = local24 >> 2;
				local36 = local24 & 0x3;
				local42 = Static643.anIntArray893[local28];
				local120 = Static210.aClass3_Sub25_Sub1_3.method8593();
				if (local120 == 65535) {
					local120 = -1;
				}
				Static629.method8787(local20, local28, local42, local36, Static659.anInt10542, local16, local120);
			} else if (Static222.aClass336_9 == arg0) {
				local12 = Static210.aClass3_Sub25_Sub1_3.method8632();
				local16 = (local12 >> 4 & 0x7) + Static373.anInt5978;
				local20 = (local12 & 0x7) + Static109.anInt2262;
				local24 = Static210.aClass3_Sub25_Sub1_3.method8593();
				local28 = Static210.aClass3_Sub25_Sub1_3.method8632();
				local36 = Static210.aClass3_Sub25_Sub1_3.method8593();
				local42 = Static210.aClass3_Sub25_Sub1_3.method8632();
				if (local16 >= 0 && local20 >= 0 && Static158.anInt927 > local16 && local20 < Static515.anInt8292) {
					local120 = local16 * 512 + 256;
					local124 = local20 * 512 + 256;
					local128 = Static659.anInt10542;
					if (local128 < 3 && Static488.method7052(local16, local20)) {
						local128++;
					}
					@Pc(1039) Class28_Sub1_Sub1_Sub4 local1039 = new Class28_Sub1_Sub1_Sub4(local24, local36, Static588.anInt9467, Static659.anInt10542, local128, local120, Static168.method3058(Static659.anInt10542, local120, local124) - local28, local124, local16, local16, local20, local20, local42);
					Static540.aClass338_202.method8171(new Class3_Sub11_Sub13(local1039));
				}
			} else if (Static633.aClass336_19 == arg0) {
				local12 = Static210.aClass3_Sub25_Sub1_3.method8632();
				@Pc(1062) boolean local1062 = (local12 & 0x80) != 0;
				local20 = (local12 >> 3 & 0x7) + Static373.anInt5978;
				local24 = Static109.anInt2262 + (local12 & 0x7);
				local28 = Static210.aClass3_Sub25_Sub1_3.method8621() + local20;
				local36 = local24 + Static210.aClass3_Sub25_Sub1_3.method8621();
				local42 = Static210.aClass3_Sub25_Sub1_3.method8589();
				local120 = Static210.aClass3_Sub25_Sub1_3.method8593();
				local124 = Static210.aClass3_Sub25_Sub1_3.method8632() * 4;
				local128 = Static210.aClass3_Sub25_Sub1_3.method8632() * 4;
				local148 = Static210.aClass3_Sub25_Sub1_3.method8593();
				local626 = Static210.aClass3_Sub25_Sub1_3.method8593();
				local630 = Static210.aClass3_Sub25_Sub1_3.method8632();
				if (local630 == 255) {
					local630 = -1;
				}
				local647 = Static210.aClass3_Sub25_Sub1_3.method8593();
				if (local20 >= 0 && local24 >= 0 && local20 < Static158.anInt927 && local24 < Static515.anInt8292 && local28 >= 0 && local36 >= 0 && Static158.anInt927 > local28 && Static515.anInt8292 > local36 && local120 != 65535) {
					local36 = local36 * 512 + 256;
					local124 <<= 0x2;
					local28 = local28 * 512 + 256;
					local128 <<= 0x2;
					local24 = local24 * 512 + 256;
					local20 = local20 * 512 + 256;
					local647 <<= 0x2;
					@Pc(1226) Class28_Sub1_Sub1_Sub3 local1226 = new Class28_Sub1_Sub1_Sub3(local120, Static659.anInt10542, Static659.anInt10542, local20, local24, local124, Static588.anInt9467 + local148, Static588.anInt9467 + local626, local630, local647, 0, local42, local128, local1062, -1);
					local1226.method5958(Static588.anInt9467 + local148, local28, Static168.method3058(Static659.anInt10542, local28, local36) - local128, local36);
					Static171.aClass338_90.method8171(new Class3_Sub11_Sub20(local1226));
				}
			} else if (arg0 == Static507.aClass336_17) {
				local12 = Static210.aClass3_Sub25_Sub1_3.method8592();
				local16 = Static210.aClass3_Sub25_Sub1_3.method8592();
				local20 = Static210.aClass3_Sub25_Sub1_3.method8615();
				local24 = (local20 & 0x7) + Static109.anInt2262;
				local28 = local24 + Static72.anInt1361;
				local36 = Static373.anInt5978 + (local20 >> 4 & 0x7);
				local42 = Static287.anInt4910 + local36;
				local120 = Static210.aClass3_Sub25_Sub1_3.method8592();
				if (Static106.anInt2205 != local120) {
					@Pc(1311) boolean local1311 = local36 >= 0 && local24 >= 0 && Static158.anInt927 > local36 && local24 < Static515.anInt8292;
					if (local1311 || Static167.method3039(Static567.anInt5924)) {
						Static584.method8239(local28, Static659.anInt10542, new Class3_Sub27(local16, local12), local42);
						if (local1311) {
							Static154.method2813(local24, Static659.anInt10542, local36);
						}
					}
				}
			} else if (arg0 == Static110.aClass336_6) {
				local12 = Static210.aClass3_Sub25_Sub1_3.method8632();
				local16 = local12 >> 2;
				local20 = Static643.anIntArray893[local16];
				local24 = Static210.aClass3_Sub25_Sub1_3.method8593();
				@Pc(1359) Class277 local1359 = Static652.aClass267_4.method6682(local24);
				local36 = Static210.aClass3_Sub25_Sub1_3.method8609();
				local42 = Static210.aClass3_Sub25_Sub1_3.method8615();
				local120 = (local42 >> 4 & 0x7) + Static373.anInt5978;
				local124 = (local42 & 0x7) + Static109.anInt2262;
				if (local16 == 11) {
					local16 = 10;
				}
				local128 = 0;
				if (local1359.aByteArray81 != null) {
					local148 = -1;
					for (local626 = 0; local626 < local1359.aByteArray81.length; local626++) {
						if (local1359.aByteArray81[local626] == local16) {
							local148 = local626;
							break;
						}
					}
					local128 = local1359.anIntArrayArray46[local148].length;
				}
				local148 = 0;
				if (local1359.aShortArray114 != null) {
					local148 = local1359.aShortArray114.length;
				}
				local626 = 0;
				if (local1359.aShortArray112 != null) {
					local626 = local1359.aShortArray112.length;
				}
				if ((local36 & 0x1) == 1) {
					Static143.method2625(local124, local120, (Class138) null, local20, Static659.anInt10542);
				} else {
					@Pc(1456) int[] local1456 = null;
					if ((local36 & 0x2) == 2) {
						local1456 = new int[local128];
						for (local647 = 0; local647 < local128; local647++) {
							local1456[local647] = Static210.aClass3_Sub25_Sub1_3.method8593();
						}
					}
					@Pc(1482) short[] local1482 = null;
					if ((local36 & 0x4) == 4) {
						local1482 = new short[local148];
						for (local651 = 0; local651 < local148; local651++) {
							local1482[local651] = (short) Static210.aClass3_Sub25_Sub1_3.method8593();
						}
					}
					@Pc(1511) short[] local1511 = null;
					if ((local36 & 0x8) == 8) {
						local1511 = new short[local626];
						for (local655 = 0; local655 < local626; local655++) {
							local1511[local655] = (short) Static210.aClass3_Sub25_Sub1_3.method8593();
						}
					}
					Static143.method2625(local124, local120, new Class138((long) Static36.aLong24++, local1456, local1482, local1511), local20, Static659.anInt10542);
				}
			} else if (arg0 == Static385.aClass336_12) {
				Static210.aClass3_Sub25_Sub1_3.method8632();
				local12 = Static210.aClass3_Sub25_Sub1_3.method8632();
				local16 = (local12 >> 4 & 0x7) + Static373.anInt5978;
				local20 = (local12 & 0x7) + Static109.anInt2262;
				local24 = Static210.aClass3_Sub25_Sub1_3.method8593();
				local28 = Static210.aClass3_Sub25_Sub1_3.method8632();
				local36 = Static210.aClass3_Sub25_Sub1_3.method8607();
				@Pc(1601) String local1601 = Static210.aClass3_Sub25_Sub1_3.method8613();
				Static299.method4615(local24, Static659.anInt10542, local16, local20, local28, local36, local1601);
			} else if (Static640.aClass336_20 == arg0) {
				local12 = Static210.aClass3_Sub25_Sub1_3.method8632();
				local16 = (local12 >> 4 & 0x7) + Static373.anInt5978;
				local20 = (local12 & 0x7) + Static109.anInt2262;
				local24 = Static210.aClass3_Sub25_Sub1_3.method8593();
				if (local24 == 65535) {
					local24 = -1;
				}
				local28 = Static210.aClass3_Sub25_Sub1_3.method8632();
				local36 = local28 >> 4 & 0xF;
				local42 = local28 & 0x7;
				local120 = Static210.aClass3_Sub25_Sub1_3.method8632();
				local124 = Static210.aClass3_Sub25_Sub1_3.method8632();
				local128 = Static210.aClass3_Sub25_Sub1_3.method8593();
				if (local16 >= 0 && local20 >= 0 && Static158.anInt927 > local16 && Static515.anInt8292 > local20) {
					local148 = local36 + 1;
					if (Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anIntArray956[0] >= local16 - local148 && Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anIntArray956[0] <= local148 + local16 && Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anIntArray955[0] >= local20 - local148 && local148 + local20 >= Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anIntArray955[0]) {
						Static29.method690(local42, local124, local128, local120, local36 + (Static659.anInt10542 << 24) + (local16 << 16) + (local20 << 8), local24);
					}
				}
			} else if (arg0 == Static179.aClass336_8) {
				local12 = Static210.aClass3_Sub25_Sub1_3.method8646();
				local16 = (local12 >> 4 & 0x7) + Static373.anInt5978;
				local20 = (local12 & 0x7) + Static109.anInt2262;
				local24 = Static210.aClass3_Sub25_Sub1_3.method8639();
				local28 = Static210.aClass3_Sub25_Sub1_3.method8646();
				local36 = local28 >> 2;
				local42 = local28 & 0x3;
				local120 = Static643.anIntArray893[local36];
				if (Static167.method3039(Static567.anInt5924) || local16 >= 0 && local20 >= 0 && local16 < Static158.anInt927 && Static515.anInt8292 > local20) {
					Static57.method1241(local36, Static659.anInt10542, local42, local24, local20, local16, local120);
				}
			} else if (arg0 == Static41.aClass336_3) {
				local12 = Static210.aClass3_Sub25_Sub1_3.method8593();
				local16 = Static210.aClass3_Sub25_Sub1_3.method8632();
				Static652.aClass267_4.method6682(local12).method6817(local16);
			} else {
				Static503.method7153("T3 - " + arg0, (Throwable) null);
				Static67.method1352(false);
			}
		}
	}
}
