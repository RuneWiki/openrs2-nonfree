import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "Lclient!vc;")
	public static Class71 aClass71_727 = Static38.method736("redstone1");

	@OriginalMember(owner = "client!ja", name = "e", descriptor = "Lclient!vc;")
	public static Class71 aClass71_728 = Static38.method736("Wordpack geladen)3");

	@OriginalMember(owner = "client!ja", name = "f", descriptor = "[Z")
	public static boolean[] aBooleanArray11 = new boolean[112];

	@OriginalMember(owner = "client!ja", name = "j", descriptor = "Lclient!vc;")
	public static Class71 aClass71_729 = Static38.method736("backright2");

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z)I")
	public static int method970() {
		@Pc(19) int local19 = Static26.method989(Static37.anInt572, Static23.anInt728, Static1.anInt1);
		return local19 - Static5.anInt202 >= 800 || (Static59.aByteArrayArrayArray2[Static23.anInt728][Static37.anInt572 >> 7][Static1.anInt1 >> 7] & 0x4) == 0 ? 3 : Static23.anInt728;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
	public static void method971() {
		if (Static5.anInt204 == 0) {
			return;
		}
		@Pc(13) Class5_Sub1_Sub10_Sub4 local13 = Static64.aClass5_Sub1_Sub10_Sub4_6;
		@Pc(19) int local19 = 0;
		if (Static42.anInt1083 != 0) {
			local19 = 1;
		}
		for (@Pc(28) int local28 = 0; local28 < 100; local28++) {
			if (Static31.aClass71Array9[local28] != null) {
				@Pc(38) int local38 = Static31.anIntArray104[local28];
				@Pc(40) byte local40 = 0;
				@Pc(44) Class71 local44 = Static9.aClass71Array3[local28];
				if (local44 != null && local44.method1801(Static49.aClass71_712)) {
					local44 = local44.method1822(5);
					local40 = 1;
				}
				if (local44 != null && local44.method1801(Static71.aClass71_861)) {
					local40 = 2;
					local44 = local44.method1822(5);
				}
				@Pc(103) int local103;
				if ((local38 == 3 || local38 == 7) && (local38 == 7 || Static60.anInt1551 == 0 || Static60.anInt1551 == 1 && Static14.method409(local44))) {
					local103 = 329 - local19 * 13;
					local19++;
					local13.method2033(Static87.aClass71_1027, 4, local103, 0);
					local13.method2033(Static87.aClass71_1027, 4, local103 - 1, 65535);
					@Pc(124) int local124 = local13.method2032(Static87.aClass71_1027) + 4;
					local124 += local13.method2038(32);
					if (local40 == 1) {
						Static73.aClass5_Sub1_Sub10_Sub1Array8[0].method921(local124, local103 - 12);
						local124 += 14;
					}
					if (local40 == 2) {
						Static73.aClass5_Sub1_Sub10_Sub1Array8[1].method921(local124, local103 - 12);
						local124 += 14;
					}
					local13.method2033(Static74.method677(new Class71[] { local44, Static66.aClass71_822, Static31.aClass71Array9[local28] }), local124, local103, 0);
					local13.method2033(Static74.method677(new Class71[] { local44, Static66.aClass71_822, Static31.aClass71Array9[local28] }), local124, local103 - 1, 65535);
					if (local19 >= 5) {
						return;
					}
				}
				if (local38 == 5 && Static60.anInt1551 < 2) {
					local103 = 329 - local19 * 13;
					local13.method2033(Static31.aClass71Array9[local28], 4, local103, 0);
					local19++;
					local13.method2033(Static31.aClass71Array9[local28], 4, local103 - 1, 65535);
					if (local19 >= 5) {
						return;
					}
				}
				if (local38 == 6 && Static60.anInt1551 < 2) {
					local103 = 329 - local19 * 13;
					local13.method2033(Static74.method677(new Class71[] { Static28.aClass71_449, Static59.aClass71_778, local44, Static66.aClass71_822, Static31.aClass71Array9[local28] }), 4, local103, 0);
					local19++;
					local13.method2033(Static74.method677(new Class71[] { Static28.aClass71_449, Static59.aClass71_778, local44, Static66.aClass71_822, Static31.aClass71Array9[local28] }), 4, local103 - 1, 65535);
					if (local19 >= 5) {
						return;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILclient!me;[Ljava/lang/Object;IBILclient!me;)V")
	public static void method972(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub1_Sub11 arg1, @OriginalArg(2) Object[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class5_Sub1_Sub11 arg5) {
		@Pc(11) int local11 = (Integer) arg2[0];
		@Pc(15) Class5_Sub1_Sub4 local15 = Static47.method857(local11);
		if (local15 == null) {
			return;
		}
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = -1;
		@Pc(24) int local24 = 0;
		@Pc(27) int[] local27 = local15.anIntArray82;
		@Pc(30) int[] local30 = local15.anIntArray81;
		@Pc(32) byte local32 = -1;
		try {
			Static69.anIntArray209 = new int[local15.anInt667];
			@Pc(38) int local38 = 0;
			Static6.aClass71Array2 = new Class71[local15.anInt666];
			@Pc(48) int local48 = 0;
			@Pc(78) int local78;
			for (@Pc(50) int local50 = 1; local50 < arg2.length; local50++) {
				if (arg2[local50] instanceof Integer) {
					local78 = (Integer) arg2[local50];
					if (local78 == -2147483647) {
						local78 = arg4;
					}
					if (local78 == -2147483646) {
						local78 = arg0;
					}
					if (local78 == -2147483645) {
						local78 = arg5 == null ? -1 : arg5.anInt1760;
					}
					if (local78 == -2147483644) {
						local78 = arg3;
					}
					if (local78 == -2147483643) {
						local78 = arg5 == null ? -1 : arg5.anInt1769;
					}
					if (local78 == -2147483642) {
						local78 = arg1 == null ? -1 : arg1.anInt1760;
					}
					if (local78 == -2147483641) {
						local78 = arg1 == null ? -1 : arg1.anInt1769;
					}
					Static69.anIntArray209[local48++] = local78;
				} else if (arg2[local50] instanceof Class71) {
					Static6.aClass71Array2[local38++] = (Class71) arg2[local50];
				}
			}
			local78 = 0;
			label1213: while (true) {
				local78++;
				if (local78 > 200000) {
					throw new RuntimeException("slow");
				}
				local22++;
				@Pc(165) int local165 = local27[local22];
				@Pc(722) int local722;
				@Pc(600) int local600;
				@Pc(580) int local580;
				@Pc(717) int local717;
				@Pc(538) Class71 local538;
				if (local165 < 100) {
					if (local165 == 0) {
						Static24.anIntArray89[local20++] = local30[local22];
						continue;
					}
					@Pc(193) int local193;
					if (local165 == 1) {
						local193 = local30[local22];
						Static24.anIntArray89[local20++] = Static23.anIntArray87[local193];
						continue;
					}
					if (local165 == 2) {
						local193 = local30[local22];
						local20--;
						Static23.anIntArray87[local193] = Static24.anIntArray89[local20];
						continue;
					}
					if (local165 == 3) {
						Static75.aClass71Array12[local24++] = local15.aClass71Array6[local22];
						continue;
					}
					if (local165 == 6) {
						local22 += local30[local22];
						continue;
					}
					if (local165 == 7) {
						local20 -= 2;
						if (Static24.anIntArray89[local20] != Static24.anIntArray89[local20 + 1]) {
							local22 += local30[local22];
						}
						continue;
					}
					if (local165 == 8) {
						local20 -= 2;
						if (Static24.anIntArray89[local20 + 1] == Static24.anIntArray89[local20]) {
							local22 += local30[local22];
						}
						continue;
					}
					if (local165 == 9) {
						local20 -= 2;
						if (Static24.anIntArray89[local20] < Static24.anIntArray89[local20 + 1]) {
							local22 += local30[local22];
						}
						continue;
					}
					if (local165 == 10) {
						local20 -= 2;
						if (Static24.anIntArray89[local20] > Static24.anIntArray89[local20 + 1]) {
							local22 += local30[local22];
						}
						continue;
					}
					if (local165 == 21) {
						if (Static48.anInt1375 == 0) {
							return;
						}
						@Pc(363) Class65 local363 = Static88.aClass65Array1[--Static48.anInt1375];
						local22 = local363.anInt2629;
						Static69.anIntArray209 = local363.anIntArray273;
						Static6.aClass71Array2 = local363.aClass71Array15;
						local15 = local363.aClass5_Sub1_Sub4_1;
						local27 = local15.anIntArray82;
						local30 = local15.anIntArray81;
						continue;
					}
					if (local165 == 25) {
						local193 = local30[local22];
						Static24.anIntArray89[local20++] = Static104.method2007(local193);
						continue;
					}
					if (local165 == 27) {
						local193 = local30[local22];
						local20--;
						Static61.method1044(local193, Static24.anIntArray89[local20]);
						continue;
					}
					if (local165 == 31) {
						local20 -= 2;
						if (Static24.anIntArray89[local20 + 1] >= Static24.anIntArray89[local20]) {
							local22 += local30[local22];
						}
						continue;
					}
					if (local165 == 32) {
						local20 -= 2;
						if (Static24.anIntArray89[local20] >= Static24.anIntArray89[local20 + 1]) {
							local22 += local30[local22];
						}
						continue;
					}
					if (local165 == 33) {
						Static24.anIntArray89[local20++] = Static69.anIntArray209[local30[local22]];
						continue;
					}
					@Pc(484) int local484;
					if (local165 == 34) {
						local484 = local30[local22];
						local20--;
						Static69.anIntArray209[local484] = Static24.anIntArray89[local20];
						continue;
					}
					if (local165 == 35) {
						Static75.aClass71Array12[local24++] = Static6.aClass71Array2[local30[local22]];
						continue;
					}
					if (local165 == 36) {
						local484 = local30[local22];
						local24--;
						Static6.aClass71Array2[local484] = Static75.aClass71Array12[local24];
						continue;
					}
					if (local165 == 37) {
						local193 = local30[local22];
						local24 -= local193;
						local538 = Static106.method1686(local193, Static75.aClass71Array12, local24);
						Static75.aClass71Array12[local24++] = local538;
						continue;
					}
					if (local165 == 38) {
						local20--;
						continue;
					}
					if (local165 == 39) {
						local24--;
						continue;
					}
					if (local165 == 40) {
						local193 = local30[local22];
						@Pc(570) Class5_Sub1_Sub4 local570 = Static47.method857(local193);
						@Pc(574) int[] local574 = new int[local570.anInt667];
						@Pc(578) Class71[] local578 = new Class71[local570.anInt666];
						for (local580 = 0; local580 < local570.anInt672; local580++) {
							local574[local580] = Static24.anIntArray89[local580 + local20 - local570.anInt672];
						}
						for (local600 = 0; local600 < local570.anInt673; local600++) {
							local578[local600] = Static75.aClass71Array12[local24 + local600 - local570.anInt673];
						}
						local24 -= local570.anInt673;
						local20 -= local570.anInt672;
						@Pc(634) Class65 local634 = new Class65();
						local634.anInt2629 = local22;
						local22 = -1;
						local634.aClass71Array15 = Static6.aClass71Array2;
						local634.anIntArray273 = Static69.anIntArray209;
						local634.aClass5_Sub1_Sub4_1 = local15;
						local15 = local570;
						Static88.aClass65Array1[Static48.anInt1375++] = local634;
						local30 = local570.anIntArray81;
						local27 = local570.anIntArray82;
						Static69.anIntArray209 = local574;
						Static6.aClass71Array2 = local578;
						continue;
					}
					if (local165 == 42) {
						Static24.anIntArray89[local20++] = Static77.anIntArray236[local30[local22]];
						continue;
					}
					if (local165 == 43) {
						local484 = local30[local22];
						local20--;
						Static77.anIntArray236[local484] = Static24.anIntArray89[local20];
						continue;
					}
					if (local165 == 44) {
						local193 = local30[local22] >> 16;
						local717 = local30[local22] & 0xFFFF;
						local20--;
						local722 = Static24.anIntArray89[local20];
						if (local722 >= 0 && local722 <= 5000) {
							@Pc(735) byte local735 = -1;
							if (local717 == 105) {
								local735 = 0;
							}
							Static38.anIntArray120[local193] = local722;
							local580 = 0;
							while (true) {
								if (local580 >= local722) {
									continue label1213;
								}
								Static106.anIntArrayArray27[local193][local580] = local735;
								local580++;
							}
						}
						throw new RuntimeException();
					}
					if (local165 == 45) {
						local193 = local30[local22];
						local20--;
						local717 = Static24.anIntArray89[local20];
						if (local717 >= 0 && local717 < Static38.anIntArray120[local193]) {
							Static24.anIntArray89[local20++] = Static106.anIntArrayArray27[local193][local717];
							continue;
						}
						throw new RuntimeException();
					}
					if (local165 == 46) {
						local20 -= 2;
						local193 = local30[local22];
						local717 = Static24.anIntArray89[local20];
						if (local717 >= 0 && local717 < Static38.anIntArray120[local193]) {
							Static106.anIntArrayArray27[local193][local717] = Static24.anIntArray89[local20 + 1];
							continue;
						}
						throw new RuntimeException();
					}
				}
				@Pc(847) boolean local847;
				if (local30[local22] == 1) {
					local847 = true;
				} else {
					local847 = false;
				}
				@Pc(1005) Class5_Sub1_Sub11 local1005;
				@Pc(866) int local866;
				@Pc(914) int local914;
				if (local165 < 1000) {
					if (local165 == 100) {
						local20 -= 3;
						local866 = Static24.anIntArray89[local20 + 2];
						local722 = Static24.anIntArray89[local20 + 1];
						local717 = Static24.anIntArray89[local20];
						if (local722 == 0) {
							throw new RuntimeException();
						}
						@Pc(889) Class5_Sub1_Sub11 local889 = Static118.method1937(local717);
						if (local889.aClass5_Sub1_Sub11Array2 == null) {
							local889.aClass5_Sub1_Sub11Array2 = new Class5_Sub1_Sub11[local866 + 1];
						}
						if (local866 >= local889.aClass5_Sub1_Sub11Array2.length) {
							@Pc(912) Class5_Sub1_Sub11[] local912 = new Class5_Sub1_Sub11[local866 + 1];
							for (local914 = 0; local914 < local889.aClass5_Sub1_Sub11Array2.length; local914++) {
								local912[local914] = local889.aClass5_Sub1_Sub11Array2[local914];
							}
							local889.aClass5_Sub1_Sub11Array2 = local912;
						}
						if (local866 > 0 && local889.aClass5_Sub1_Sub11Array2[local866 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local866 - 1));
						}
						@Pc(962) Class5_Sub1_Sub11 local962 = new Class5_Sub1_Sub11();
						local962.aBoolean75 = true;
						local962.anInt1785 = local962.anInt1760 = local889.anInt1760;
						local962.anInt1790 = local722;
						local962.anInt1769 = local866;
						local889.aClass5_Sub1_Sub11Array2[local866] = local962;
						if (local847) {
							Static5.aClass5_Sub1_Sub11_1 = local962;
						} else {
							Static94.aClass5_Sub1_Sub11_5 = local962;
						}
						Static14.method405(local889);
						continue;
					}
					if (local165 == 101) {
						local1005 = local847 ? Static5.aClass5_Sub1_Sub11_1 : Static94.aClass5_Sub1_Sub11_5;
						@Pc(1010) Class5_Sub1_Sub11 local1010 = Static118.method1937(local1005.anInt1760);
						local1010.aClass5_Sub1_Sub11Array2[local1005.anInt1769] = null;
						Static14.method405(local1010);
						continue;
					}
					if (local165 == 102) {
						local20--;
						local1005 = Static118.method1937(Static24.anIntArray89[local20]);
						local1005.aClass5_Sub1_Sub11Array2 = null;
						Static14.method405(local1005);
						continue;
					}
					if (local165 == 200) {
						local20 -= 2;
						local717 = Static24.anIntArray89[local20];
						local722 = Static24.anIntArray89[local20 + 1];
						@Pc(1062) Class5_Sub1_Sub11 local1062 = Static23.method550(local722, local717);
						if (local1062 != null && local722 != -1) {
							Static24.anIntArray89[local20++] = 1;
							if (local847) {
								Static5.aClass5_Sub1_Sub11_1 = local1062;
							} else {
								Static94.aClass5_Sub1_Sub11_5 = local1062;
							}
							continue;
						}
						Static24.anIntArray89[local20++] = 0;
						continue;
					}
				} else if (local165 >= 1000 && local165 < 1100 || !(local165 < 2000 || local165 >= 2100)) {
					if (local165 < 2000) {
						local1005 = local847 ? Static5.aClass5_Sub1_Sub11_1 : Static94.aClass5_Sub1_Sub11_5;
					} else {
						local20--;
						local1005 = Static118.method1937(Static24.anIntArray89[local20]);
						local165 -= 1000;
					}
					Static14.method405(local1005);
					if (local165 == 1000) {
						local20 -= 2;
						local1005.anInt1804 = Static24.anIntArray89[local20];
						local1005.anInt1817 = Static24.anIntArray89[local20 + 1];
						continue;
					}
					if (local165 == 1001) {
						local20 -= 2;
						local1005.anInt1776 = Static24.anIntArray89[local20];
						local1005.anInt1801 = Static24.anIntArray89[local20 + 1];
						continue;
					}
					if (local165 == 1003) {
						local20--;
						local1005.aBoolean78 = Static24.anIntArray89[local20] == 1;
						continue;
					}
				} else if (local165 >= 1100 && local165 < 1200 || local165 >= 2100 && local165 < 2200) {
					if (local165 >= 2000) {
						local20--;
						local1005 = Static118.method1937(Static24.anIntArray89[local20]);
						local165 -= 1000;
					} else {
						local1005 = local847 ? Static5.aClass5_Sub1_Sub11_1 : Static94.aClass5_Sub1_Sub11_5;
					}
					Static14.method405(local1005);
					if (local165 == 1100) {
						local20 -= 2;
						local1005.anInt1778 = Static24.anIntArray89[local20];
						if (local1005.anInt1778 > local1005.anInt1762 - local1005.anInt1776) {
							local1005.anInt1778 = local1005.anInt1762 - local1005.anInt1776;
						}
						if (local1005.anInt1778 < 0) {
							local1005.anInt1778 = 0;
						}
						local1005.anInt1774 = Static24.anIntArray89[local20 + 1];
						if (local1005.anInt1774 > local1005.anInt1809 - local1005.anInt1801) {
							local1005.anInt1774 = local1005.anInt1809 - local1005.anInt1801;
						}
						if (local1005.anInt1774 < 0) {
							local1005.anInt1774 = 0;
						}
						continue;
					}
					if (local165 == 1101) {
						local20--;
						local1005.anInt1777 = Static24.anIntArray89[local20];
						continue;
					}
					if (local165 == 1102) {
						local20--;
						local1005.aBoolean76 = Static24.anIntArray89[local20] == 1;
						continue;
					}
					if (local165 == 1103) {
						local20--;
						local1005.anInt1773 = Static24.anIntArray89[local20];
						continue;
					}
					if (local165 == 1104) {
						local20--;
						local1005.anInt1796 = Static24.anIntArray89[local20];
						continue;
					}
					if (local165 == 1105) {
						local20--;
						local1005.anInt1815 = Static24.anIntArray89[local20];
						continue;
					}
					if (local165 == 1106) {
						local20--;
						local1005.anInt1827 = Static24.anIntArray89[local20];
						continue;
					}
					if (local165 == 1107) {
						local20--;
						local1005.aBoolean82 = Static24.anIntArray89[local20] == 1;
						continue;
					}
					if (local165 == 1108) {
						local1005.anInt1766 = 1;
						local20--;
						local1005.anInt1819 = Static24.anIntArray89[local20];
						continue;
					}
					if (local165 == 1109) {
						local20 -= 6;
						local1005.anInt1783 = Static24.anIntArray89[local20];
						local1005.anInt1814 = Static24.anIntArray89[local20 + 1];
						local1005.anInt1829 = Static24.anIntArray89[local20 + 2];
						local1005.anInt1808 = Static24.anIntArray89[local20 + 3];
						local1005.anInt1802 = Static24.anIntArray89[local20 + 4];
						local1005.anInt1810 = Static24.anIntArray89[local20 + 5];
						continue;
					}
					if (local165 == 1110) {
						local20--;
						local1005.anInt1788 = Static24.anIntArray89[local20];
						continue;
					}
					if (local165 == 1111) {
						local20--;
						local1005.aBoolean83 = Static24.anIntArray89[local20] == 1;
						continue;
					}
					if (local165 == 1112) {
						local24--;
						local1005.aClass71_879 = Static75.aClass71Array12[local24];
						continue;
					}
					if (local165 == 1113) {
						local20--;
						local1005.anInt1797 = Static24.anIntArray89[local20];
						continue;
					}
					if (local165 == 1114) {
						local20 -= 3;
						local1005.anInt1807 = Static24.anIntArray89[local20];
						local1005.anInt1800 = Static24.anIntArray89[local20 + 1];
						local1005.anInt1761 = Static24.anIntArray89[local20 + 2];
						continue;
					}
					if (local165 == 1115) {
						local20--;
						local1005.aBoolean81 = Static24.anIntArray89[local20] == 1;
						continue;
					}
					if (local165 == 1116) {
						local20--;
						local1005.anInt1793 = Static24.anIntArray89[local20];
						continue;
					}
					if (local165 == 1117) {
						local20--;
						local1005.anInt1806 = Static24.anIntArray89[local20];
						continue;
					}
					if (local165 == 1118) {
						local20--;
						local1005.aBoolean86 = Static24.anIntArray89[local20] == 1;
						continue;
					}
					if (local165 == 1119) {
						local20--;
						local1005.aBoolean77 = Static24.anIntArray89[local20] == 1;
						continue;
					}
					if (local165 == 1120) {
						local20 -= 2;
						local1005.anInt1762 = Static24.anIntArray89[local20];
						local1005.anInt1809 = Static24.anIntArray89[local20 + 1];
						continue;
					}
				} else if (local165 >= 1200 && local165 < 1300 || !(local165 < 2200 || local165 >= 2300)) {
					if (local165 >= 2000) {
						local165 -= 1000;
						local20--;
						local1005 = Static118.method1937(Static24.anIntArray89[local20]);
					} else {
						local1005 = local847 ? Static5.aClass5_Sub1_Sub11_1 : Static94.aClass5_Sub1_Sub11_5;
					}
					Static14.method405(local1005);
					if (local165 == 1200) {
						local20 -= 2;
						local722 = Static24.anIntArray89[local20];
						local866 = Static24.anIntArray89[local20 + 1];
						local1005.anInt1794 = local866;
						local1005.anInt1803 = local722;
						@Pc(1259) Class5_Sub1_Sub17 local1259 = Static33.method691(local722);
						local1005.anInt1829 = local1259.anInt2871;
						local1005.anInt1810 = local1259.anInt2898;
						local1005.anInt1808 = local1259.anInt2909;
						local1005.anInt1783 = local1259.anInt2865;
						local1005.anInt1814 = local1259.anInt2881;
						if (local1005.anInt1776 > 0) {
							local1005.anInt1810 = local1005.anInt1810 * 32 / local1005.anInt1776;
						}
						local1005.anInt1802 = local1259.anInt2873;
						continue;
					}
					if (local165 == 1201) {
						local1005.anInt1766 = 2;
						local20--;
						local1005.anInt1819 = Static24.anIntArray89[local20];
						continue;
					}
					if (local165 == 1202) {
						local1005.anInt1766 = 3;
						local1005.anInt1819 = Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.aClass32_2.method931();
						continue;
					}
				} else if ((local165 < 1300 || local165 >= 1400) && (local165 < 2300 || local165 >= 2400)) {
					@Pc(2990) Class71 local2990;
					if (local165 >= 1400 && local165 < 1500 || local165 >= 2400 && local165 < 2500) {
						if (local165 < 2000) {
							local1005 = local847 ? Static5.aClass5_Sub1_Sub11_1 : Static94.aClass5_Sub1_Sub11_5;
						} else {
							local20--;
							local1005 = Static118.method1937(Static24.anIntArray89[local20]);
							local165 -= 1000;
						}
						local24--;
						local2990 = Static75.aClass71Array12[local24];
						@Pc(3522) Object[] local3522 = new Object[local2990.method1784() + 1];
						for (local580 = local3522.length - 1; local580 >= 1; local580--) {
							if (local2990.method1804(local580 - 1) == 115) {
								local24--;
								local3522[local580] = Static75.aClass71Array12[local24];
							} else {
								local20--;
								local3522[local580] = Integer.valueOf(Static24.anIntArray89[local20]);
							}
						}
						local20--;
						local3522[0] = Integer.valueOf(Static24.anIntArray89[local20]);
						if (local165 == 1411) {
							local1005.anObjectArray3 = local3522;
						}
						if (local165 == 1403) {
							local1005.anObjectArray15 = local3522;
						}
						if (local165 == 1413) {
							local1005.anObjectArray13 = local3522;
						}
						if (local165 == 1405) {
							local1005.anObjectArray8 = local3522;
						}
						if (local165 == 1407) {
							local1005.anObjectArray19 = local3522;
						}
						if (local165 == 1402) {
							local1005.anObjectArray17 = local3522;
						}
						if (local165 == 1417) {
							local1005.anObjectArray18 = local3522;
						}
						local1005.aBoolean85 = true;
						if (local165 == 1401) {
							local1005.anObjectArray21 = local3522;
						}
						if (local165 == 1409) {
							local1005.anObjectArray7 = local3522;
						}
						if (local165 == 1406) {
							local1005.anObjectArray9 = local3522;
						}
						if (local165 == 1416) {
							local1005.anObjectArray4 = local3522;
						}
						if (local165 == 1412) {
							local1005.anObjectArray6 = local3522;
						}
						if (local165 == 1415) {
							local1005.anObjectArray11 = local3522;
						}
						if (local165 == 1400) {
							local1005.anObjectArray14 = local3522;
						}
						if (local165 == 1404) {
							local1005.anObjectArray10 = local3522;
						}
						if (local165 == 1410) {
							local1005.anObjectArray12 = local3522;
						}
						if (local165 == 1414) {
							local1005.anObjectArray16 = local3522;
						}
						if (local165 == 1408) {
							local1005.anObjectArray5 = local3522;
						}
						continue;
					}
					if (local165 < 1600) {
						local1005 = local847 ? Static5.aClass5_Sub1_Sub11_1 : Static94.aClass5_Sub1_Sub11_5;
						if (local165 == 1500) {
							Static24.anIntArray89[local20++] = local1005.anInt1804;
							continue;
						}
						if (local165 == 1501) {
							Static24.anIntArray89[local20++] = local1005.anInt1817;
							continue;
						}
						if (local165 == 1502) {
							Static24.anIntArray89[local20++] = local1005.anInt1776;
							continue;
						}
						if (local165 == 1503) {
							Static24.anIntArray89[local20++] = local1005.anInt1801;
							continue;
						}
						if (local165 == 1504) {
							Static24.anIntArray89[local20++] = local1005.aBoolean78 ? 1 : 0;
							continue;
						}
						if (local165 == 1505) {
							Static24.anIntArray89[local20++] = local1005.anInt1785;
							continue;
						}
					} else if (local165 < 1700) {
						local1005 = local847 ? Static5.aClass5_Sub1_Sub11_1 : Static94.aClass5_Sub1_Sub11_5;
						if (local165 == 1600) {
							Static24.anIntArray89[local20++] = local1005.anInt1778;
							continue;
						}
						if (local165 == 1601) {
							Static24.anIntArray89[local20++] = local1005.anInt1774;
							continue;
						}
						if (local165 == 1602) {
							Static75.aClass71Array12[local24++] = local1005.aClass71_879;
							continue;
						}
						if (local165 == 1603) {
							Static24.anIntArray89[local20++] = local1005.anInt1762;
							continue;
						}
						if (local165 == 1604) {
							Static24.anIntArray89[local20++] = local1005.anInt1809;
							continue;
						}
						if (local165 == 1605) {
							Static24.anIntArray89[local20++] = local1005.anInt1810;
							continue;
						}
					} else if (local165 < 1800) {
						local1005 = local847 ? Static5.aClass5_Sub1_Sub11_1 : Static94.aClass5_Sub1_Sub11_5;
						if (local165 == 1700) {
							Static24.anIntArray89[local20++] = local1005.anInt1803;
							continue;
						}
						if (local165 == 1701) {
							if (local1005.anInt1803 == -1) {
								Static24.anIntArray89[local20++] = 0;
							} else {
								Static24.anIntArray89[local20++] = local1005.anInt1794;
							}
							continue;
						}
						if (local165 == 1702) {
							Static24.anIntArray89[local20++] = local1005.anInt1769;
							continue;
						}
					} else if (local165 < 1900) {
						local1005 = local847 ? Static5.aClass5_Sub1_Sub11_1 : Static94.aClass5_Sub1_Sub11_5;
						if (local165 == 1800) {
							Static24.anIntArray89[local20++] = Static69.method1162(Static23.method545(local1005));
							continue;
						}
					} else if (local165 < 2600) {
						local20--;
						local1005 = Static118.method1937(Static24.anIntArray89[local20]);
						if (local165 == 2500) {
							Static24.anIntArray89[local20++] = local1005.anInt1804;
							continue;
						}
						if (local165 == 2501) {
							Static24.anIntArray89[local20++] = local1005.anInt1817;
							continue;
						}
						if (local165 == 2502) {
							Static24.anIntArray89[local20++] = local1005.anInt1776;
							continue;
						}
						if (local165 == 2503) {
							Static24.anIntArray89[local20++] = local1005.anInt1801;
							continue;
						}
						if (local165 == 2504) {
							Static24.anIntArray89[local20++] = local1005.aBoolean78 ? 1 : 0;
							continue;
						}
						if (local165 == 2505) {
							Static24.anIntArray89[local20++] = local1005.anInt1785;
							continue;
						}
					} else if (local165 < 2700) {
						local20--;
						local1005 = Static118.method1937(Static24.anIntArray89[local20]);
						if (local165 == 2600) {
							Static24.anIntArray89[local20++] = local1005.anInt1778;
							continue;
						}
						if (local165 == 2601) {
							Static24.anIntArray89[local20++] = local1005.anInt1774;
							continue;
						}
						if (local165 == 2602) {
							Static75.aClass71Array12[local24++] = local1005.aClass71_879;
							continue;
						}
						if (local165 == 2603) {
							Static24.anIntArray89[local20++] = local1005.anInt1762;
							continue;
						}
						if (local165 == 2604) {
							Static24.anIntArray89[local20++] = local1005.anInt1809;
							continue;
						}
						if (local165 == 2605) {
							Static24.anIntArray89[local20++] = local1005.anInt1810;
							continue;
						}
					} else if (local165 < 2800) {
						local20--;
						local1005 = Static118.method1937(Static24.anIntArray89[local20]);
						if (local165 == 2700) {
							Static24.anIntArray89[local20++] = local1005.anInt1803;
							continue;
						}
						if (local165 == 2701) {
							if (local1005.anInt1803 == -1) {
								Static24.anIntArray89[local20++] = 0;
							} else {
								Static24.anIntArray89[local20++] = local1005.anInt1794;
							}
							continue;
						}
					} else if (local165 < 2900) {
						local20--;
						local1005 = Static118.method1937(Static24.anIntArray89[local20]);
						if (local165 == 2800) {
							Static24.anIntArray89[local20++] = Static69.method1162(Static23.method545(local1005));
							continue;
						}
					} else if (local165 < 3200) {
						if (local165 == 3100) {
							local24--;
							local538 = Static75.aClass71Array12[local24];
							Static92.method1500(0, local538, Static18.aClass71_345);
							continue;
						}
						if (local165 == 3101) {
							local20 -= 2;
							Static78.method696(Static24.anIntArray89[local20], Static24.anIntArray89[local20 + 1], Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1);
							continue;
						}
						if (local165 == 3102) {
							local20--;
							local717 = Static24.anIntArray89[local20];
							if (local717 >= 0 && Static26.anIntArray168.length > local717 && Static26.anIntArray168[local717] != -1) {
								Static16.aBoolean22 = true;
								Static28.aBoolean33 = true;
								Static64.anInt2489 = local717;
							}
							continue;
						}
						if (local165 == 3103) {
							Static2.method1237();
							continue;
						}
					} else if (local165 < 3300) {
						if (local165 == 3200) {
							local20 -= 3;
							Static38.method738(Static24.anIntArray89[local20], Static24.anIntArray89[local20 + 2], Static24.anIntArray89[local20 + 1]);
							continue;
						}
						if (local165 == 3201) {
							local20--;
							Static73.method1211(Static24.anIntArray89[local20]);
							continue;
						}
						if (local165 == 3202) {
							local20 -= 2;
							Static30.method582(Static24.anIntArray89[local20 + 1], Static24.anIntArray89[local20]);
							continue;
						}
					} else if (local165 < 3400) {
						if (local165 == 3300) {
							Static24.anIntArray89[local20++] = Static95.anInt2285;
							continue;
						}
						if (local165 == 3301) {
							local20 -= 2;
							local717 = Static24.anIntArray89[local20];
							local722 = Static24.anIntArray89[local20 + 1];
							Static24.anIntArray89[local20++] = Static74.method662(local717, local722);
							continue;
						}
						if (local165 == 3302) {
							local20 -= 2;
							local717 = Static24.anIntArray89[local20];
							local722 = Static24.anIntArray89[local20 + 1];
							Static24.anIntArray89[local20++] = Static29.method579(local717, local722);
							continue;
						}
						if (local165 == 3303) {
							local20 -= 2;
							local717 = Static24.anIntArray89[local20];
							local722 = Static24.anIntArray89[local20 + 1];
							Static24.anIntArray89[local20++] = Static79.method1283(local717, local722);
							continue;
						}
						if (local165 == 3304) {
							local20--;
							local717 = Static24.anIntArray89[local20];
							Static24.anIntArray89[local20++] = Static76.method1248(local717).anInt1020;
							continue;
						}
						if (local165 == 3305) {
							local20--;
							local717 = Static24.anIntArray89[local20];
							Static24.anIntArray89[local20++] = Static62.anIntArray178[local717];
							continue;
						}
						if (local165 == 3306) {
							local20--;
							local717 = Static24.anIntArray89[local20];
							Static24.anIntArray89[local20++] = Static26.anIntArray170[local717];
							continue;
						}
						if (local165 == 3307) {
							local20--;
							local717 = Static24.anIntArray89[local20];
							Static24.anIntArray89[local20++] = Static5.anIntArray7[local717];
							continue;
						}
						if (local165 == 3308) {
							local717 = Static23.anInt728;
							local866 = (Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt2452 >> 7) + Static76.anInt1884;
							local722 = Static48.anInt1367 + (Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt2474 >> 7);
							Static24.anIntArray89[local20++] = (local722 << 14) + ((local717 << 28) + local866);
							continue;
						}
						if (local165 == 3309) {
							local20--;
							local717 = Static24.anIntArray89[local20];
							Static24.anIntArray89[local20++] = local717 >> 14 & 0x3FFF;
							continue;
						}
						if (local165 == 3310) {
							local20--;
							local717 = Static24.anIntArray89[local20];
							Static24.anIntArray89[local20++] = local717 >> 28;
							continue;
						}
						if (local165 == 3311) {
							local20--;
							local717 = Static24.anIntArray89[local20];
							Static24.anIntArray89[local20++] = local717 & 0x3FFF;
							continue;
						}
					} else if (local165 < 3700) {
						if (local165 == 3600) {
							if (Static39.anInt1031 == 0) {
								Static24.anIntArray89[local20++] = -2;
							} else if (Static39.anInt1031 == 1) {
								Static24.anIntArray89[local20++] = -1;
							} else {
								Static24.anIntArray89[local20++] = Static68.anInt1685;
							}
							continue;
						}
						if (local165 == 3601) {
							local20--;
							local717 = Static24.anIntArray89[local20];
							if (Static39.anInt1031 == 2 && Static68.anInt1685 > local717) {
								Static75.aClass71Array12[local24++] = Static81.aClass71Array13[local717];
								continue;
							}
							Static75.aClass71Array12[local24++] = Static18.aClass71_345;
							continue;
						}
						if (local165 == 3602) {
							local20--;
							local717 = Static24.anIntArray89[local20];
							if (Static39.anInt1031 == 2 && Static68.anInt1685 > local717) {
								Static24.anIntArray89[local20++] = Static70.anIntArray216[local717];
								continue;
							}
							Static24.anIntArray89[local20++] = 0;
							continue;
						}
						if (local165 == 3603) {
							local20--;
							local717 = Static24.anIntArray89[local20];
							if (Static39.anInt1031 == 2 && Static68.anInt1685 > local717) {
								Static24.anIntArray89[local20++] = Static82.anIntArray247[local717];
								continue;
							}
							Static24.anIntArray89[local20++] = 0;
							continue;
						}
						if (local165 == 3604) {
							local24--;
							local538 = Static75.aClass71Array12[local24];
							local20--;
							local722 = Static24.anIntArray89[local20];
							Static78.method698(local538, local722);
							continue;
						}
					} else if (local165 < 4100) {
						if (local165 == 4000) {
							local20 -= 2;
							local717 = Static24.anIntArray89[local20];
							local722 = Static24.anIntArray89[local20 + 1];
							Static24.anIntArray89[local20++] = local722 + local717;
							continue;
						}
						if (local165 == 4001) {
							local20 -= 2;
							local717 = Static24.anIntArray89[local20];
							local722 = Static24.anIntArray89[local20 + 1];
							Static24.anIntArray89[local20++] = local717 - local722;
							continue;
						}
						if (local165 == 4002) {
							local20 -= 2;
							local717 = Static24.anIntArray89[local20];
							local722 = Static24.anIntArray89[local20 + 1];
							Static24.anIntArray89[local20++] = local722 * local717;
							continue;
						}
						if (local165 == 4003) {
							local20 -= 2;
							local717 = Static24.anIntArray89[local20];
							local722 = Static24.anIntArray89[local20 + 1];
							Static24.anIntArray89[local20++] = local717 / local722;
							continue;
						}
						if (local165 == 4004) {
							local20--;
							local717 = Static24.anIntArray89[local20];
							Static24.anIntArray89[local20++] = (int) (Math.random() * (double) local717);
							continue;
						}
						if (local165 == 4005) {
							local20--;
							local717 = Static24.anIntArray89[local20];
							Static24.anIntArray89[local20++] = (int) ((double) (local717 + 1) * Math.random());
							continue;
						}
						if (local165 == 4006) {
							local20 -= 5;
							local722 = Static24.anIntArray89[local20 + 1];
							local866 = Static24.anIntArray89[local20 + 2];
							local717 = Static24.anIntArray89[local20];
							local580 = Static24.anIntArray89[local20 + 3];
							local600 = Static24.anIntArray89[local20 + 4];
							Static24.anIntArray89[local20++] = local717 + (local600 - local866) * (local722 + -local717) / (local580 - local866);
							continue;
						}
						if (local165 == 4007) {
							local20 -= 2;
							local717 = Static24.anIntArray89[local20];
							local722 = Static24.anIntArray89[local20 + 1];
							Static24.anIntArray89[local20++] = local717 + local722 * local717 / 100;
							continue;
						}
						if (local165 == 4008) {
							local20 -= 2;
							local717 = Static24.anIntArray89[local20];
							local722 = Static24.anIntArray89[local20 + 1];
							Static24.anIntArray89[local20++] = local717 | 0x1 << local722;
							continue;
						}
						if (local165 == 4009) {
							local20 -= 2;
							local717 = Static24.anIntArray89[local20];
							local722 = Static24.anIntArray89[local20 + 1];
							Static24.anIntArray89[local20++] = local717 & -(0x1 << local722) - 1;
							continue;
						}
						if (local165 == 4010) {
							local20 -= 2;
							local717 = Static24.anIntArray89[local20];
							local722 = Static24.anIntArray89[local20 + 1];
							Static24.anIntArray89[local20++] = (0x1 << local722 & local717) == 0 ? 0 : 1;
							continue;
						}
						if (local165 == 4011) {
							local20 -= 2;
							local722 = Static24.anIntArray89[local20 + 1];
							local717 = Static24.anIntArray89[local20];
							Static24.anIntArray89[local20++] = local717 % local722;
							continue;
						}
						if (local165 == 4012) {
							local20 -= 2;
							local722 = Static24.anIntArray89[local20 + 1];
							local717 = Static24.anIntArray89[local20];
							if (local717 == 0) {
								Static24.anIntArray89[local20++] = 0;
							} else {
								Static24.anIntArray89[local20++] = (int) Math.pow((double) local717, (double) local722);
							}
							continue;
						}
						if (local165 == 4013) {
							local20 -= 2;
							local717 = Static24.anIntArray89[local20];
							local722 = Static24.anIntArray89[local20 + 1];
							if (local717 == 0) {
								Static24.anIntArray89[local20++] = 0;
							} else if (local722 == 0) {
								Static24.anIntArray89[local20++] = Integer.MAX_VALUE;
							} else {
								Static24.anIntArray89[local20++] = (int) Math.pow((double) local717, 1.0D / (double) local722);
							}
							continue;
						}
						if (local165 == 4014) {
							local20 -= 2;
							local717 = Static24.anIntArray89[local20];
							local722 = Static24.anIntArray89[local20 + 1];
							Static24.anIntArray89[local20++] = local722 & local717;
							continue;
						}
						if (local165 == 4015) {
							local20 -= 2;
							local717 = Static24.anIntArray89[local20];
							local722 = Static24.anIntArray89[local20 + 1];
							Static24.anIntArray89[local20++] = local722 | local717;
							continue;
						}
					} else if (local165 < 4200) {
						if (local165 == 4100) {
							local24--;
							local538 = Static75.aClass71Array12[local24];
							local20--;
							local722 = Static24.anIntArray89[local20];
							Static75.aClass71Array12[local24++] = Static74.method677(new Class71[] { local538, Static51.method962(local722) });
							continue;
						}
						if (local165 == 4101) {
							local24 -= 2;
							local538 = Static75.aClass71Array12[local24];
							local2990 = Static75.aClass71Array12[local24 + 1];
							Static75.aClass71Array12[local24++] = Static74.method677(new Class71[] { local538, local2990 });
							continue;
						}
						if (local165 == 4102) {
							local24--;
							local538 = Static75.aClass71Array12[local24];
							local20--;
							local722 = Static24.anIntArray89[local20];
							Static75.aClass71Array12[local24++] = Static74.method677(new Class71[] { local538, Static112.method1752(local722) });
							continue;
						}
						if (local165 == 4103) {
							local24--;
							local538 = Static75.aClass71Array12[local24];
							Static75.aClass71Array12[local24++] = local538.method1792();
							continue;
						}
						if (local165 == 4104) {
							local20--;
							local717 = Static24.anIntArray89[local20];
							@Pc(3076) long local3076 = (long) local717 * 86400000L + 1014768000000L;
							Static20.aCalendar1.setTime(new Date(local3076));
							local580 = Static20.aCalendar1.get(5);
							local600 = Static20.aCalendar1.get(2);
							local914 = Static20.aCalendar1.get(1);
							Static75.aClass71Array12[local24++] = Static74.method677(new Class71[] { Static51.method962(local580), Static19.aClass71_363, Static16.aClass71Array4[local600], Static19.aClass71_363, Static51.method962(local914) });
							continue;
						}
						if (local165 == 4105) {
							local24 -= 2;
							local538 = Static75.aClass71Array12[local24];
							local2990 = Static75.aClass71Array12[local24 + 1];
							if (Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.aClass32_2 != null && Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.aClass32_2.aBoolean51) {
								Static75.aClass71Array12[local24++] = local2990;
								continue;
							}
							Static75.aClass71Array12[local24++] = local538;
							continue;
						}
						if (local165 == 4106) {
							local20--;
							local717 = Static24.anIntArray89[local20];
							Static75.aClass71Array12[local24++] = Static51.method962(local717);
							continue;
						}
						if (local165 == 4107) {
							local24 -= 2;
							Static24.anIntArray89[local20++] = Static75.aClass71Array12[local24].method1819(Static75.aClass71Array12[local24 + 1]);
							continue;
						}
						@Pc(3233) byte[] local3233;
						@Pc(3238) Class5_Sub1_Sub10_Sub4 local3238;
						if (local165 == 4108) {
							local20 -= 2;
							local866 = Static24.anIntArray89[local20 + 1];
							local722 = Static24.anIntArray89[local20];
							local24--;
							local538 = Static75.aClass71Array12[local24];
							local3233 = Static32.aClass24_Sub1_9.method679(local866, 0);
							local3238 = new Class5_Sub1_Sub10_Sub4(local3233);
							Static24.anIntArray89[local20++] = local3238.method2052(local538, local722);
							continue;
						}
						if (local165 == 4109) {
							local20 -= 2;
							local24--;
							local538 = Static75.aClass71Array12[local24];
							local722 = Static24.anIntArray89[local20];
							local866 = Static24.anIntArray89[local20 + 1];
							local3233 = Static32.aClass24_Sub1_9.method679(local866, 0);
							local3238 = new Class5_Sub1_Sub10_Sub4(local3233);
							Static24.anIntArray89[local20++] = local3238.method2046(local538, local722);
							continue;
						}
					} else if (local165 < 4300) {
						if (local165 == 4200) {
							local20--;
							local717 = Static24.anIntArray89[local20];
							Static75.aClass71Array12[local24++] = Static33.method691(local717).aClass71_1359;
							continue;
						}
						@Pc(2713) Class5_Sub1_Sub17 local2713;
						if (local165 == 4201) {
							local20 -= 2;
							local717 = Static24.anIntArray89[local20];
							local722 = Static24.anIntArray89[local20 + 1];
							local2713 = Static33.method691(local717);
							if (local722 >= 1 && local722 <= 5 && local2713.aClass71Array17[local722 - 1] != null) {
								Static75.aClass71Array12[local24++] = local2713.aClass71Array17[local722 - 1];
								continue;
							}
							Static75.aClass71Array12[local24++] = Static18.aClass71_345;
							continue;
						}
						if (local165 == 4202) {
							local20 -= 2;
							local717 = Static24.anIntArray89[local20];
							local722 = Static24.anIntArray89[local20 + 1];
							local2713 = Static33.method691(local717);
							if (local722 >= 1 && local722 <= 5 && local2713.aClass71Array18[local722 - 1] != null) {
								Static75.aClass71Array12[local24++] = local2713.aClass71Array18[local722 - 1];
								continue;
							}
							Static75.aClass71Array12[local24++] = Static18.aClass71_345;
							continue;
						}
						if (local165 == 4203) {
							local20--;
							local717 = Static24.anIntArray89[local20];
							Static24.anIntArray89[local20++] = Static33.method691(local717).anInt2880;
							continue;
						}
						if (local165 == 4204) {
							local20--;
							local717 = Static24.anIntArray89[local20];
							Static24.anIntArray89[local20++] = Static33.method691(local717).anInt2870 == 1 ? 1 : 0;
							continue;
						}
						@Pc(2854) Class5_Sub1_Sub17 local2854;
						if (local165 == 4205) {
							local20--;
							local717 = Static24.anIntArray89[local20];
							local2854 = Static33.method691(local717);
							if (local2854.anInt2905 == -1 && local2854.anInt2895 >= 0) {
								Static24.anIntArray89[local20++] = local2854.anInt2895;
								continue;
							}
							Static24.anIntArray89[local20++] = local717;
							continue;
						}
						if (local165 == 4206) {
							local20--;
							local717 = Static24.anIntArray89[local20];
							local2854 = Static33.method691(local717);
							if (local2854.anInt2905 >= 0 && local2854.anInt2895 >= 0) {
								Static24.anIntArray89[local20++] = local2854.anInt2895;
								continue;
							}
							Static24.anIntArray89[local20++] = local717;
							continue;
						}
						if (local165 == 4207) {
							local20--;
							local717 = Static24.anIntArray89[local20];
							Static24.anIntArray89[local20++] = Static33.method691(local717).aBoolean127 ? 1 : 0;
							continue;
						}
					}
				} else {
					if (local165 < 2000) {
						local1005 = local847 ? Static5.aClass5_Sub1_Sub11_1 : Static94.aClass5_Sub1_Sub11_5;
					} else {
						local165 -= 1000;
						local20--;
						local1005 = Static118.method1937(Static24.anIntArray89[local20]);
					}
					if (local165 == 1300) {
						local20--;
						local722 = Static24.anIntArray89[local20] - 1;
						if (local722 >= 0 && local722 <= 9) {
							local24--;
							local1005.method1196(local722, Static75.aClass71Array12[local24]);
							continue;
						}
						local24--;
						continue;
					}
					if (local165 == 1301) {
						local20 -= 2;
						local722 = Static24.anIntArray89[local20];
						local866 = Static24.anIntArray89[local20 + 1];
						local1005.aClass5_Sub1_Sub11_3 = Static23.method550(local866, local722);
						continue;
					}
					if (local165 == 1302) {
						local20--;
						local1005.aBoolean79 = Static24.anIntArray89[local20] == 1;
						continue;
					}
					if (local165 == 1303) {
						local20--;
						local1005.anInt1780 = Static24.anIntArray89[local20];
						continue;
					}
					if (local165 == 1304) {
						local20--;
						local1005.anInt1782 = Static24.anIntArray89[local20];
						continue;
					}
					if (local165 == 1305) {
						local24--;
						local1005.aClass71_876 = Static75.aClass71Array12[local24];
						continue;
					}
					if (local165 == 1306) {
						local24--;
						local1005.aClass71_881 = Static75.aClass71Array12[local24];
						continue;
					}
				}
				return;
			}
		} catch (@Pc(4277) Exception local4277) {
			Static93.method1558("CS2 - scr:" + local15.aLong118 + " op:" + local32, local4277);
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(BLclient!la;)V")
	public static void method973(@OriginalArg(1) Class5_Sub1_Sub1_Sub3 arg0) {
		if (arg0.anInt2460 == Static95.anInt2285 || arg0.anInt2458 == -1 || arg0.anInt2471 != 0 || arg0.anInt2438 + 1 > Static57.method1017(arg0.anInt2458).anIntArray290[arg0.anInt2482]) {
			@Pc(44) int local44 = arg0.anInt2460 - arg0.anInt2447;
			@Pc(49) int local49 = Static95.anInt2285 - arg0.anInt2447;
			@Pc(59) int local59 = arg0.anInt2475 * 64 + arg0.anInt2437 * 128;
			@Pc(70) int local70 = arg0.anInt2472 * 128 + arg0.anInt2475 * 64;
			@Pc(80) int local80 = arg0.anInt2475 * 64 + arg0.anInt2483 * 128;
			arg0.anInt2452 = ((local44 - local49) * local70 + local49 * local80) / local44;
			@Pc(105) int local105 = arg0.anInt2475 * 64 + arg0.anInt2444 * 128;
			arg0.anInt2474 = ((local44 - local49) * local59 + local49 * local105) / local44;
		}
		arg0.anInt2454 = 0;
		if (arg0.anInt2442 == 0) {
			arg0.anInt2441 = 1024;
		}
		if (arg0.anInt2442 == 1) {
			arg0.anInt2441 = 1536;
		}
		if (arg0.anInt2442 == 2) {
			arg0.anInt2441 = 0;
		}
		if (arg0.anInt2442 == 3) {
			arg0.anInt2441 = 512;
		}
		arg0.anInt2456 = arg0.anInt2441;
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V")
	public static void method974() {
		aBooleanArray11 = null;
		aClass71_727 = null;
		Class36.anIntArray159 = null;
		aClass71_729 = null;
		aClass71_728 = null;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "([B[Lclient!ic;IILclient!l;I)V")
	public static void method975(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class33[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class43 arg4) {
		@Pc(10) Class5_Sub11 local10 = new Class5_Sub11(arg0);
		@Pc(16) int local16 = -1;
		while (true) {
			@Pc(20) int local20 = local10.method1535();
			if (local20 == 0) {
				return;
			}
			local16 += local20;
			@Pc(28) int local28 = 0;
			while (true) {
				@Pc(32) int local32 = local10.method1535();
				if (local32 == 0) {
					break;
				}
				local28 += local32 - 1;
				@Pc(44) int local44 = local28 & 0x3F;
				@Pc(50) int local50 = local28 >> 6 & 0x3F;
				@Pc(54) int local54 = local28 >> 12;
				@Pc(58) int local58 = local10.method1546();
				@Pc(62) int local62 = local58 >> 2;
				@Pc(66) int local66 = local58 & 0x3;
				@Pc(71) int local71 = local50 + arg2;
				@Pc(75) int local75 = arg3 + local44;
				if (local71 > 0 && local75 > 0 && local71 < 103 && local75 < 103) {
					@Pc(95) int local95 = local54;
					@Pc(97) Class33 local97 = null;
					if ((Static59.aByteArrayArrayArray2[1][local71][local75] & 0x2) == 2) {
						local95 = local54 - 1;
					}
					if (local95 >= 0) {
						local97 = arg1[local95];
					}
					Static66.method1132(local66, local62, local71, local97, local54, local16, local75, arg4);
				}
			}
		}
	}
}
