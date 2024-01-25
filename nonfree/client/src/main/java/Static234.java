import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!iea", name = "b", descriptor = "[I")
	public static int[] anIntArray255;

	@OriginalMember(owner = "client!iea", name = "e", descriptor = "Lclient!st;")
	public static final Class314 aClass314_74 = new Class314(80, 16);

	@OriginalMember(owner = "client!iea", name = "h", descriptor = "[I")
	public static final int[] anIntArray256 = new int[256];

	@OriginalMember(owner = "client!iea", name = "l", descriptor = "Lclient!maa;")
	public static final Class215 aClass215_6 = new Class215(14, -1);

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(ILclient!maa;)V")
	public static void method3997(@OriginalArg(1) Class215 arg0) {
		@Pc(14) int local14;
		@Pc(23) int local23;
		@Pc(27) int local27;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(39) int local39;
		@Pc(48) int local48;
		@Pc(63) int local63;
		@Pc(68) int local68;
		@Pc(70) int local70;
		@Pc(139) int local139;
		@Pc(192) int local192;
		@Pc(54) int local54;
		@Pc(167) int local167;
		if (arg0 == Static56.aClass215_2) {
			local14 = Static47.aClass3_Sub9_Sub2_1.method5583();
			@Pc(19) Class330 local19 = Static370.aClass284_3.method6915(local14);
			local23 = Static47.aClass3_Sub9_Sub2_1.method5626();
			local27 = Static47.aClass3_Sub9_Sub2_1.method5594();
			local31 = local27 >> 2;
			local35 = Static408.anIntArray431[local31];
			local39 = Static47.aClass3_Sub9_Sub2_1.method5594();
			local48 = Static71.anInt1420 + (local39 >> 4 & 0x7);
			local54 = (local39 & 0x7) + Static489.anInt8328;
			if (local31 == 11) {
				local31 = 10;
			}
			local63 = 0;
			if (local19.aByteArray93 != null) {
				local68 = -1;
				for (local70 = 0; local70 < local19.aByteArray93.length; local70++) {
					if (local19.aByteArray93[local70] == local31) {
						local68 = local70;
						break;
					}
				}
				local63 = local19.anIntArrayArray55[local68].length;
			}
			local68 = 0;
			if (local19.aShortArray134 != null) {
				local68 = local19.aShortArray134.length;
			}
			local70 = 0;
			if (local19.aShortArray136 != null) {
				local70 = local19.aShortArray136.length;
			}
			if ((local23 & 0x1) == 1) {
				Static95.method1578(local48, local54, (Class187) null, Static46.anInt876, local35);
			} else {
				@Pc(127) int[] local127 = null;
				if ((local23 & 0x2) == 2) {
					local127 = new int[local63];
					for (local139 = 0; local139 < local63; local139++) {
						local127[local139] = Static47.aClass3_Sub9_Sub2_1.method5610();
					}
				}
				@Pc(157) short[] local157 = null;
				if ((local23 & 0x4) == 4) {
					local157 = new short[local68];
					for (local167 = 0; local167 < local68; local167++) {
						local157[local167] = (short) Static47.aClass3_Sub9_Sub2_1.method5610();
					}
				}
				@Pc(182) short[] local182 = null;
				if ((local23 & 0x8) == 8) {
					local182 = new short[local70];
					for (local192 = 0; local192 < local70; local192++) {
						local182[local192] = (short) Static47.aClass3_Sub9_Sub2_1.method5610();
					}
				}
				Static95.method1578(local48, local54, new Class187((long) Static34.aLong32++, local127, local157, local182), Static46.anInt876, local35);
			}
			return;
		}
		@Pc(240) int local240;
		@Pc(312) int local312;
		if (Static217.aClass215_4 == arg0) {
			local14 = Static47.aClass3_Sub9_Sub2_1.method5633();
			local240 = Static71.anInt1420 * 2 + (local14 >> 4 & 0xF);
			local23 = Static489.anInt8328 * 2 + (local14 & 0xF);
			local27 = Static47.aClass3_Sub9_Sub2_1.method5633();
			@Pc(264) boolean local264 = (local27 & 0x1) != 0;
			@Pc(275) boolean local275 = (local27 & 0x2) != 0;
			local39 = local275 ? local27 >> 2 : -1;
			local48 = Static47.aClass3_Sub9_Sub2_1.method5619() + local240;
			local54 = local23 + Static47.aClass3_Sub9_Sub2_1.method5619();
			local63 = Static47.aClass3_Sub9_Sub2_1.method5624();
			local68 = Static47.aClass3_Sub9_Sub2_1.method5624();
			local70 = Static47.aClass3_Sub9_Sub2_1.method5610();
			local312 = Static47.aClass3_Sub9_Sub2_1.method5633();
			if (local275) {
				local312 = (byte) local312;
			} else {
				local312 *= 4;
			}
			local139 = Static47.aClass3_Sub9_Sub2_1.method5633() * 4;
			local167 = Static47.aClass3_Sub9_Sub2_1.method5610();
			local192 = Static47.aClass3_Sub9_Sub2_1.method5610();
			@Pc(343) int local343 = Static47.aClass3_Sub9_Sub2_1.method5633();
			@Pc(349) int local349 = Static47.aClass3_Sub9_Sub2_1.method5610();
			if (local343 == 255) {
				local343 = -1;
			}
			if (local240 >= 0 && local23 >= 0 && Static399.anInt7121 * 2 > local240 && Static399.anInt7121 * 2 > local23 && local48 >= 0 && local54 >= 0 && local48 < Static24.anInt345 * 2 && local54 < Static24.anInt345 * 2 && local70 != 65535) {
				local23 = local23 * 256;
				local240 *= 256;
				local54 = local54 * 256;
				local48 *= 256;
				local312 <<= 0x2;
				local349 <<= 0x2;
				local139 <<= 0x2;
				if (local63 != 0 && local39 != -1) {
					@Pc(441) Class9_Sub2_Sub1_Sub2 local441 = null;
					@Pc(450) int local450;
					if (local63 >= 0) {
						local450 = local63 - 1;
						@Pc(457) Class3_Sub43 local457 = (Class3_Sub43) Static545.aClass25_40.method426((long) local450);
						if (local457 != null) {
							local441 = local457.aClass9_Sub2_Sub1_Sub2_Sub2_2;
						}
					} else {
						local450 = -local63 - 1;
						if (Static54.anInt1032 == local450) {
							local441 = Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1;
						} else {
							local441 = Static507.aClass9_Sub2_Sub1_Sub2_Sub1Array1[local450];
						}
					}
					if (local441 != null) {
						@Pc(488) Class176 local488 = local441.method8633();
						if (local488.anIntArrayArray22 != null && local488.anIntArrayArray22[local39] != null) {
							local312 -= local488.anIntArrayArray22[local39][1];
						}
						if (local488.anIntArrayArray23 != null && local488.anIntArrayArray23[local39] != null) {
							local312 -= local488.anIntArrayArray23[local39][1];
						}
					}
				}
				@Pc(547) Class9_Sub2_Sub1_Sub5 local547 = new Class9_Sub2_Sub1_Sub5(local70, Static46.anInt876, Static46.anInt876, local240, local23, local312, local167 + Static304.anInt8391, local192 - -Static304.anInt8391, local343, local349, local63, local68, local139, local264, local39);
				local547.method7559(Static594.method8211(local48, local54, Static46.anInt876) - local139, local48, Static304.anInt8391 + local167, local54);
				Static109.aClass216_11.method5449(new Class3_Sub7_Sub16(local547));
			}
		} else if (arg0 == Static233.aClass215_5) {
			local14 = Static47.aClass3_Sub9_Sub2_1.method5626();
			local240 = Static489.anInt8328 + (local14 & 0x7);
			local23 = local240 + Static22.anInt329;
			local27 = Static71.anInt1420 + (local14 >> 4 & 0x7);
			local31 = local27 + Static427.anInt7462;
			local35 = Static47.aClass3_Sub9_Sub2_1.method5634();
			@Pc(622) Class3_Sub25 local622 = (Class3_Sub25) Static39.aClass25_8.method426((long) (Static46.anInt876 << 28 | local23 << 14 | local31));
			if (local622 != null) {
				for (@Pc(630) Class3_Sub32 local630 = (Class3_Sub32) local622.aClass216_44.method5457(); local630 != null; local630 = (Class3_Sub32) local622.aClass216_44.method5458()) {
					if (local630.anInt5954 == (local35 & 0x7FFF)) {
						local630.method8682();
						break;
					}
				}
				if (local622.aClass216_44.method5455()) {
					local622.method8682();
				}
				if (local27 >= 0 && local240 >= 0 && Static399.anInt7121 > local27 && Static24.anInt345 > local240) {
					Static61.method1047(Static46.anInt876, local240, local27);
				}
			}
		} else if (Static590.aClass215_14 == arg0) {
			local14 = Static47.aClass3_Sub9_Sub2_1.method5633();
			local240 = Static489.anInt8328 + (local14 & 0x7);
			local23 = local240 + Static22.anInt329;
			local27 = (local14 >> 4 & 0x7) + Static71.anInt1420;
			local31 = local27 + Static427.anInt7462;
			local35 = Static47.aClass3_Sub9_Sub2_1.method5610();
			local39 = Static47.aClass3_Sub9_Sub2_1.method5610();
			local48 = Static47.aClass3_Sub9_Sub2_1.method5610();
			if (Static39.aClass25_8 != null) {
				@Pc(754) Class3_Sub25 local754 = (Class3_Sub25) Static39.aClass25_8.method426((long) (local31 | Static46.anInt876 << 28 | local23 << 14));
				if (local754 != null) {
					for (@Pc(762) Class3_Sub32 local762 = (Class3_Sub32) local754.aClass216_44.method5457(); local762 != null; local762 = (Class3_Sub32) local754.aClass216_44.method5458()) {
						if ((local35 & 0x7FFF) == local762.anInt5954 && local39 == local762.anInt5957) {
							local762.method8682();
							local762.anInt5957 = local48;
							Static499.method7250(local23, local31, local762, Static46.anInt876);
							break;
						}
					}
					if (local27 >= 0 && local240 >= 0 && local27 < Static399.anInt7121 && local240 < Static24.anInt345) {
						Static61.method1047(Static46.anInt876, local240, local27);
					}
				}
			}
		} else if (arg0 == aClass215_6) {
			Static47.aClass3_Sub9_Sub2_1.method5633();
			local14 = Static47.aClass3_Sub9_Sub2_1.method5633();
			local240 = (local14 >> 4 & 0x7) + Static71.anInt1420;
			local23 = Static489.anInt8328 + (local14 & 0x7);
			local27 = Static47.aClass3_Sub9_Sub2_1.method5610();
			local31 = Static47.aClass3_Sub9_Sub2_1.method5633();
			local35 = Static47.aClass3_Sub9_Sub2_1.method5604();
			@Pc(870) String local870 = Static47.aClass3_Sub9_Sub2_1.method5607();
			Static114.method2110(local240, local31, local23, local27, Static46.anInt876, local870, local35);
		} else if (Static412.aClass215_11 == arg0) {
			local14 = Static47.aClass3_Sub9_Sub2_1.method5626();
			local240 = local14 >> 2;
			local23 = local14 & 0x3;
			local27 = Static408.anIntArray431[local240];
			local31 = Static47.aClass3_Sub9_Sub2_1.method5602();
			local35 = (local31 >> 4 & 0x7) + Static71.anInt1420;
			local39 = (local31 & 0x7) + Static489.anInt8328;
			if (Static566.method8006(Static41.anInt768) || local35 >= 0 && local39 >= 0 && local35 < Static399.anInt7121 && Static24.anInt345 > local39) {
				Static160.method2783(-1, local39, local240, local23, local27, Static46.anInt876, local35);
			}
		} else if (arg0 == Static283.aClass215_9) {
			local14 = Static47.aClass3_Sub9_Sub2_1.method5633();
			local240 = local14 >> 2;
			local23 = local14 & 0x3;
			local27 = Static408.anIntArray431[local240];
			local31 = Static47.aClass3_Sub9_Sub2_1.method5583();
			local35 = Static47.aClass3_Sub9_Sub2_1.method5626();
			local39 = (local35 >> 4 & 0x7) + Static71.anInt1420;
			local48 = (local35 & 0x7) + Static489.anInt8328;
			if (Static566.method8006(Static41.anInt768) || local39 >= 0 && local48 >= 0 && local39 < Static399.anInt7121 && Static24.anInt345 > local48) {
				Static160.method2783(local31, local48, local240, local23, local27, Static46.anInt876, local39);
			}
		} else if (arg0 == Static602.aClass215_15) {
			local14 = Static47.aClass3_Sub9_Sub2_1.method5633();
			local240 = (local14 >> 4 & 0x7) + Static71.anInt1420;
			local23 = (local14 & 0x7) + Static489.anInt8328;
			local27 = Static47.aClass3_Sub9_Sub2_1.method5610();
			if (local27 == 65535) {
				local27 = -1;
			}
			local31 = Static47.aClass3_Sub9_Sub2_1.method5633();
			local35 = local31 >> 4 & 0xF;
			local39 = local31 & 0x7;
			local48 = Static47.aClass3_Sub9_Sub2_1.method5633();
			local54 = Static47.aClass3_Sub9_Sub2_1.method5633();
			local63 = Static47.aClass3_Sub9_Sub2_1.method5610();
			if (local240 >= 0 && local23 >= 0 && local240 < Static399.anInt7121 && local23 < Static24.anInt345) {
				local68 = local35 + 1;
				if (local240 - local68 <= Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anIntArray675[0] && local240 + local68 >= Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anIntArray675[0] && Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anIntArray676[0] >= local23 - local68 && Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anIntArray676[0] <= local68 + local23) {
					Static35.method498(local54, local27, local35 + (local23 << 8) + (local240 << 16) + (Static46.anInt876 << 24), local39, local48, local63);
				}
			}
		} else if (Static294.aClass215_10 == arg0) {
			local14 = Static47.aClass3_Sub9_Sub2_1.method5610();
			local240 = Static47.aClass3_Sub9_Sub2_1.method5633();
			Static370.aClass284_3.method6915(local14).method7893(local240);
		} else if (arg0 == Static170.aClass215_3) {
			local14 = Static47.aClass3_Sub9_Sub2_1.method5602();
			local240 = (local14 & 0x7) + Static489.anInt8328;
			local23 = local240 + Static22.anInt329;
			local27 = Static71.anInt1420 + (local14 >> 4 & 0x7);
			local31 = Static427.anInt7462 + local27;
			local35 = Static47.aClass3_Sub9_Sub2_1.method5583();
			local39 = Static47.aClass3_Sub9_Sub2_1.method5583();
			@Pc(1254) boolean local1254 = local27 >= 0 && local240 >= 0 && local27 < Static399.anInt7121 && Static24.anInt345 > local240;
			if (local1254 || Static566.method8006(Static41.anInt768)) {
				Static499.method7250(local23, local31, new Class3_Sub32(local35, local39), Static46.anInt876);
				if (local1254) {
					Static61.method1047(Static46.anInt876, local240, local27);
				}
			}
		} else if (arg0 == Static562.aClass215_13) {
			local14 = Static47.aClass3_Sub9_Sub2_1.method5633();
			local240 = Static71.anInt1420 + (local14 >> 4 & 0x7);
			local23 = Static489.anInt8328 + (local14 & 0x7);
			local27 = Static47.aClass3_Sub9_Sub2_1.method5610();
			if (local27 == 65535) {
				local27 = -1;
			}
			local31 = Static47.aClass3_Sub9_Sub2_1.method5633();
			local35 = local31 >> 4 & 0xF;
			local39 = local31 & 0x7;
			local48 = Static47.aClass3_Sub9_Sub2_1.method5633();
			local54 = Static47.aClass3_Sub9_Sub2_1.method5633();
			local63 = Static47.aClass3_Sub9_Sub2_1.method5610();
			if (local240 >= 0 && local23 >= 0 && Static399.anInt7121 > local240 && local23 < Static24.anInt345) {
				local68 = local35 + 1;
				if (local240 - local68 <= Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anIntArray675[0] && Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anIntArray675[0] <= local68 + local240 && Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anIntArray676[0] >= local23 - local68 && local23 + local68 >= Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anIntArray676[0]) {
					Static208.method3268(local39, local27, local63, (local240 << 16) + ((Static46.anInt876 << 24) + (local23 << 8) + local35), local48, local54);
				}
			}
		} else if (arg0 == Static278.aClass215_8) {
			local14 = Static47.aClass3_Sub9_Sub2_1.method5633();
			local240 = (local14 >> 4 & 0x7) + Static71.anInt1420;
			local23 = (local14 & 0x7) + Static489.anInt8328;
			local27 = Static47.aClass3_Sub9_Sub2_1.method5610();
			local31 = Static47.aClass3_Sub9_Sub2_1.method5633();
			local35 = Static47.aClass3_Sub9_Sub2_1.method5610();
			local39 = Static47.aClass3_Sub9_Sub2_1.method5633();
			if (local240 >= 0 && local23 >= 0 && Static399.anInt7121 > local240 && Static24.anInt345 > local23) {
				local48 = local240 * 512 + 256;
				local54 = local23 * 512 + 256;
				local63 = Static46.anInt876;
				if (local63 < 3 && Static97.method1657(local23, local240)) {
					local63++;
				}
				@Pc(1526) Class9_Sub2_Sub1_Sub4 local1526 = new Class9_Sub2_Sub1_Sub4(local27, local35, Static304.anInt8391, Static46.anInt876, local63, local48, Static594.method8211(local48, local54, Static46.anInt876) - local31, local54, local240, local240, local23, local23, local39);
				Static536.aClass216_64.method5449(new Class3_Sub7_Sub1(local1526));
			}
		} else if (arg0 == Static269.aClass215_7) {
			local14 = Static47.aClass3_Sub9_Sub2_1.method5633();
			@Pc(1554) boolean local1554 = (local14 & 0x80) != 0;
			local23 = Static71.anInt1420 + (local14 >> 3 & 0x7);
			local27 = (local14 & 0x7) + Static489.anInt8328;
			local31 = local23 + Static47.aClass3_Sub9_Sub2_1.method5619();
			local35 = local27 + Static47.aClass3_Sub9_Sub2_1.method5619();
			local39 = Static47.aClass3_Sub9_Sub2_1.method5624();
			local48 = Static47.aClass3_Sub9_Sub2_1.method5610();
			local54 = Static47.aClass3_Sub9_Sub2_1.method5633() * 4;
			local63 = Static47.aClass3_Sub9_Sub2_1.method5633() * 4;
			local68 = Static47.aClass3_Sub9_Sub2_1.method5610();
			local70 = Static47.aClass3_Sub9_Sub2_1.method5610();
			local312 = Static47.aClass3_Sub9_Sub2_1.method5633();
			local139 = Static47.aClass3_Sub9_Sub2_1.method5610();
			if (local312 == 255) {
				local312 = -1;
			}
			if (local23 >= 0 && local27 >= 0 && local23 < Static399.anInt7121 && Static24.anInt345 > local27 && local31 >= 0 && local35 >= 0 && local31 < Static399.anInt7121 && Static24.anInt345 > local35 && local48 != 65535) {
				local35 = local35 * 512 + 256;
				local31 = local31 * 512 + 256;
				local139 <<= 0x2;
				local54 <<= 0x2;
				local27 = local27 * 512 + 256;
				local23 = local23 * 512 + 256;
				local63 <<= 0x2;
				@Pc(1733) Class9_Sub2_Sub1_Sub5 local1733 = new Class9_Sub2_Sub1_Sub5(local48, Static46.anInt876, Static46.anInt876, local23, local27, local54, local68 + Static304.anInt8391, Static304.anInt8391 + local70, local312, local139, 0, local39, local63, local1554, -1);
				local1733.method7559(Static594.method8211(local31, local35, Static46.anInt876) - local63, local31, Static304.anInt8391 + local68, local35);
				Static109.aClass216_11.method5449(new Class3_Sub7_Sub16(local1733));
			}
		} else if (arg0 == Static469.aClass215_12) {
			local14 = Static47.aClass3_Sub9_Sub2_1.method5626();
			local240 = (local14 & 0x7) + Static489.anInt8328;
			local23 = Static22.anInt329 + local240;
			local27 = Static71.anInt1420 + (local14 >> 4 & 0x7);
			local31 = local27 + Static427.anInt7462;
			local35 = Static47.aClass3_Sub9_Sub2_1.method5628();
			local39 = Static47.aClass3_Sub9_Sub2_1.method5610();
			local48 = Static47.aClass3_Sub9_Sub2_1.method5628();
			if (Static54.anInt1032 != local35) {
				@Pc(1835) boolean local1835 = local27 >= 0 && local240 >= 0 && Static399.anInt7121 > local27 && local240 < Static24.anInt345;
				if (local1835 || Static566.method8006(Static41.anInt768)) {
					Static499.method7250(local23, local31, new Class3_Sub32(local48, local39), Static46.anInt876);
					if (local1835) {
						Static61.method1047(Static46.anInt876, local240, local27);
					}
				}
			}
		} else if (arg0 == Static8.aClass215_1) {
			local14 = Static47.aClass3_Sub9_Sub2_1.method5594();
			local240 = (local14 >> 4 & 0x7) + Static71.anInt1420;
			local23 = Static489.anInt8328 + (local14 & 0x7);
			local27 = Static47.aClass3_Sub9_Sub2_1.method5610();
			if (local27 == 65535) {
				local27 = -1;
			}
			local31 = Static47.aClass3_Sub9_Sub2_1.method5626();
			local35 = local31 >> 2;
			local39 = local31 & 0x3;
			local48 = Static408.anIntArray431[local35];
			Static26.method364(local35, Static46.anInt876, local23, local48, local39, local240, local27);
		} else {
			Static296.method5075((Throwable) null, "T3 - " + arg0);
			Static416.method6442(false);
		}
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(I)V")
	public static void method3998() {
		if (Static189.aClass89_3 != null) {
			Static189.aClass89_3.method4206();
		}
		if (Static320.aClass89_5 != null) {
			Static320.aClass89_5.method4206();
		}
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3999(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg6 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(32) int local32 = Static602.aShort120 + (Static584.aShort113 - Static602.aShort120) * local7 / 100;
		@Pc(38) int local38 = local32 * arg3 >> 8;
		Static562.anInt9327 = local32 * Static562.anInt9324 >> 8;
		@Pc(51) int local51 = 16384 - arg1 & 0x3FFF;
		@Pc(62) int local62 = 16384 - arg5 & 0x3FFF;
		@Pc(64) int local64 = 0;
		@Pc(66) int local66 = 0;
		@Pc(68) int local68 = local38;
		if (local51 != 0) {
			local66 = Class3_Sub13.anIntArray147[local51] * -local38 >> 14;
			local68 = local38 * Class3_Sub13.anIntArray146[local51] >> 14;
		}
		if (local62 != 0) {
			local64 = Class3_Sub13.anIntArray147[local62] * local68 >> 14;
			local68 = local68 * Class3_Sub13.anIntArray146[local62] >> 14;
		}
		Static13.anInt232 = arg2 - local66;
		Static330.anInt6250 = 0;
		Static522.anInt8849 = arg4 - local68;
		Static419.anInt7345 = arg0 - local64;
		Static253.anInt4961 = arg1;
		Static35.anInt545 = arg5;
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "([BI)[B")
	public static byte[] method4002(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(16) byte[] local16 = new byte[arg0.length];
			Static651.method749(arg0, 0, local16, 0, arg0.length);
			return local16;
		}
	}
}
