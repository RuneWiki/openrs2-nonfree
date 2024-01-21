import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!pd", name = "P", descriptor = "[I")
	public static int[] anIntArray321;

	@OriginalMember(owner = "client!pd", name = "M", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_1151 = Static161.method2452("Unexpected server response)3");

	@OriginalMember(owner = "client!pd", name = "F", descriptor = "Lclient!dc;")
	public static Class20 aClass20_1149 = aClass20_1151;

	@OriginalMember(owner = "client!pd", name = "H", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1150 = Static161.method2452("<)4col> x");

	@OriginalMember(owner = "client!pd", name = "J", descriptor = "Z")
	public static boolean aBoolean129 = false;

	@OriginalMember(owner = "client!pd", name = "N", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1152 = Static161.method2452("Das ist eine Mitglieder)2Welt(Q");

	@OriginalMember(owner = "client!pd", name = "O", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1153 = Static161.method2452("");

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILclient!wa;IIIZ)V")
	public static void method2257(@OriginalArg(0) int arg0, @OriginalArg(1) Class23 arg1, @OriginalArg(4) int arg2) {
		Static172.aClass23_68 = arg1;
		Static45.anInt1025 = arg2;
		Static113.anInt2383 = 0;
		Static38.aBoolean50 = false;
		Static92.anInt1963 = 1;
		Static15.anInt312 = 10000;
		Static183.anInt3678 = arg0;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZIJI)Z")
	public static boolean method2258(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = (int) arg1 >> 14 & 0x1F;
		@Pc(19) int local19 = (int) arg1 >> 20 & 0x3;
		@Pc(31) int local31 = (int) (arg1 >>> 32) & Integer.MAX_VALUE;
		if (local8 == 10 || local8 == 11 || local8 == 22) {
			@Pc(48) Class5_Sub2_Sub7 local48 = Static63.method1046(local31);
			@Pc(61) int local61;
			@Pc(64) int local64;
			if (local19 == 0 || local19 == 2) {
				local61 = local48.anInt517;
				local64 = local48.anInt519;
			} else {
				local61 = local48.anInt519;
				local64 = local48.anInt517;
			}
			@Pc(75) int local75 = local48.anInt541;
			if (local19 != 0) {
				local75 = (local75 << local19 & 0xF) + (local75 >> 4 - local19);
			}
			Static12.method231(0, arg2, 2, arg0, true, 0, local75, Static210.aClass1_Sub2_Sub2_2.anIntArray250[0], local64, Static210.aClass1_Sub2_Sub2_2.anIntArray253[0], local61);
		} else {
			Static12.method231(local8 + 1, arg2, 2, arg0, true, local19, 0, Static210.aClass1_Sub2_Sub2_2.anIntArray250[0], 0, Static210.aClass1_Sub2_Sub2_2.anIntArray253[0], 0);
		}
		Static141.anInt2945 = Static179.anInt3572;
		Static101.anInt2161 = 0;
		Static43.anInt990 = 2;
		Static114.anInt648 = Static175.anInt3521;
		return true;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIII)V")
	public static void method2259() {
		Static169.aClass5_Sub3ArrayArrayArray3 = new Class5_Sub3[4][104][104];
		Static68.anIntArrayArrayArray6 = new int[4][105][105];
		Static94.method1539();
		Static210.anInt919 = 104;
		Static31.anInt671 = 104;
		Static186.anIntArrayArrayArray10 = new int[4][105][105];
		Static4.method117();
		Static74.anInt1609 = 25;
		Static188.aBooleanArrayArray2 = new boolean[Static74.anInt1609 + Static74.anInt1609 + 1][Static74.anInt1609 + Static74.anInt1609 + 1];
		Static134.aBooleanArrayArray1 = new boolean[Static74.anInt1609 + Static74.anInt1609 + 2][Static74.anInt1609 + Static74.anInt1609 + 2];
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)I")
	public static int method2261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!wa;I)V")
	public static void method2263(@OriginalArg(0) Class23 arg0) {
		Static148.aClass23_55 = arg0;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(III[[[BIB)V")
	public static void method2264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[][][] arg3) {
		Static144.anInt2996++;
		Static24.anInt409 = 0;
		@Pc(14) int local14;
		@Pc(17) int local17;
		for (@Pc(7) int local7 = Static180.anInt3609; local7 < Static83.anInt1853; local7++) {
			@Pc(12) Class5_Sub3[][] local12 = Static157.aClass5_Sub3ArrayArrayArray2[local7];
			for (local14 = Static214.anInt4155; local14 < Static38.anInt818; local14++) {
				for (local17 = Static16.anInt321; local17 < Static157.anInt3190; local17++) {
					@Pc(24) Class5_Sub3 local24 = local12[local14][local17];
					if (local24 != null) {
						if (local24.anInt335 <= Static80.anInt1804 && Static188.aBooleanArrayArray2[local14 + Static74.anInt1609 - Static212.anInt4111][local17 + Static74.anInt1609 - Static174.anInt3487] && (arg3 == null || local7 < 0 || arg3[local7][local14][local17] != 0)) {
							local24.aBoolean15 = true;
							local24.aBoolean17 = true;
							if (local24.anInt333 > 0) {
								local24.aBoolean16 = true;
							} else {
								local24.aBoolean16 = false;
							}
							Static24.anInt409++;
						} else {
							local24.aBoolean15 = false;
							local24.aBoolean17 = false;
							local24.anInt327 = 0;
						}
					}
				}
			}
		}
		@Pc(119) int local119;
		@Pc(128) int local128;
		@Pc(133) int local133;
		@Pc(137) int local137;
		@Pc(115) int local115;
		for (@Pc(102) int local102 = Static180.anInt3609; local102 < Static83.anInt1853; local102++) {
			@Pc(107) Class5_Sub3[][] local107 = Static157.aClass5_Sub3ArrayArrayArray2[local102];
			for (local17 = -Static74.anInt1609; local17 <= 0; local17++) {
				local115 = Static212.anInt4111 + local17;
				local119 = Static212.anInt4111 - local17;
				if (local115 >= Static214.anInt4155 || local119 < Static38.anInt818) {
					for (local128 = -Static74.anInt1609; local128 <= 0; local128++) {
						local133 = Static174.anInt3487 + local128;
						local137 = Static174.anInt3487 - local128;
						@Pc(149) Class5_Sub3 local149;
						if (local115 >= Static214.anInt4155) {
							if (local133 >= Static16.anInt321) {
								local149 = local107[local115][local133];
								if (local149 != null && local149.aBoolean15) {
									Static18.method289(local149, true);
								}
							}
							if (local137 < Static157.anInt3190) {
								local149 = local107[local115][local137];
								if (local149 != null && local149.aBoolean15) {
									Static18.method289(local149, true);
								}
							}
						}
						if (local119 < Static38.anInt818) {
							if (local133 >= Static16.anInt321) {
								local149 = local107[local119][local133];
								if (local149 != null && local149.aBoolean15) {
									Static18.method289(local149, true);
								}
							}
							if (local137 < Static157.anInt3190) {
								local149 = local107[local119][local137];
								if (local149 != null && local149.aBoolean15) {
									Static18.method289(local149, true);
								}
							}
						}
						if (Static24.anInt409 == 0) {
							Static85.aBoolean86 = false;
							return;
						}
					}
				}
			}
		}
		for (local14 = Static180.anInt3609; local14 < Static83.anInt1853; local14++) {
			@Pc(233) Class5_Sub3[][] local233 = Static157.aClass5_Sub3ArrayArrayArray2[local14];
			for (local115 = -Static74.anInt1609; local115 <= 0; local115++) {
				local119 = Static212.anInt4111 + local115;
				local128 = Static212.anInt4111 - local115;
				if (local119 >= Static214.anInt4155 || local128 < Static38.anInt818) {
					for (local133 = -Static74.anInt1609; local133 <= 0; local133++) {
						local137 = Static174.anInt3487 + local133;
						@Pc(263) int local263 = Static174.anInt3487 - local133;
						@Pc(275) Class5_Sub3 local275;
						if (local119 >= Static214.anInt4155) {
							if (local137 >= Static16.anInt321) {
								local275 = local233[local119][local137];
								if (local275 != null && local275.aBoolean15) {
									Static18.method289(local275, false);
								}
							}
							if (local263 < Static157.anInt3190) {
								local275 = local233[local119][local263];
								if (local275 != null && local275.aBoolean15) {
									Static18.method289(local275, false);
								}
							}
						}
						if (local128 < Static38.anInt818) {
							if (local137 >= Static16.anInt321) {
								local275 = local233[local128][local137];
								if (local275 != null && local275.aBoolean15) {
									Static18.method289(local275, false);
								}
							}
							if (local263 < Static157.anInt3190) {
								local275 = local233[local128][local263];
								if (local275 != null && local275.aBoolean15) {
									Static18.method289(local275, false);
								}
							}
						}
						if (Static24.anInt409 == 0) {
							Static85.aBoolean86 = false;
							return;
						}
					}
				}
			}
		}
		Static85.aBoolean86 = false;
	}
}
