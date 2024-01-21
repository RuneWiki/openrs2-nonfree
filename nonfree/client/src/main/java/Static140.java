import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!rc", name = "eb", descriptor = "Lclient!ig;")
	public static Class30_Sub1 aClass30_Sub1_14;

	@OriginalMember(owner = "client!rc", name = "jb", descriptor = "Lclient!dc;")
	public static Class16 aClass16_1;

	@OriginalMember(owner = "client!rc", name = "ob", descriptor = "Lclient!ig;")
	public static Class30_Sub1 aClass30_Sub1_15;

	@OriginalMember(owner = "client!rc", name = "qb", descriptor = "Lclient!bf;")
	public static Class10 aClass10_11;

	@OriginalMember(owner = "client!rc", name = "bb", descriptor = "Lclient!td;")
	public static Class79 aClass79_22 = new Class79(30);

	@OriginalMember(owner = "client!rc", name = "hb", descriptor = "[Lclient!ed;")
	public static Class23[] aClass23Array21 = new Class23[8];

	@OriginalMember(owner = "client!rc", name = "pb", descriptor = "I")
	public static int anInt3588 = 0;

	@OriginalMember(owner = "client!rc", name = "rb", descriptor = "Lclient!ed;")
	private static Class23 aClass23_1357 = Static169.method2903("Unexpected loginserver response)3");

	@OriginalMember(owner = "client!rc", name = "tb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1358 = Static169.method2903("");

	@OriginalMember(owner = "client!rc", name = "vb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1359 = aClass23_1357;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V")
	public static void method2465() {
		if (Static92.aBooleanArray11[98]) {
			Static122.anInt3942 += (12 - Static122.anInt3942) / 2;
		} else if (Static92.aBooleanArray11[99]) {
			Static122.anInt3942 += (-Static122.anInt3942 - 12) / 2;
		} else {
			Static122.anInt3942 /= 2;
		}
		if (Static92.aBooleanArray11[96]) {
			Static149.anInt3743 += (-Static149.anInt3743 - 24) / 2;
		} else if (Static92.aBooleanArray11[97]) {
			Static149.anInt3743 += (24 - Static149.anInt3743) / 2;
		} else {
			Static149.anInt3743 /= 2;
		}
		Static127.anInt3355 = Static127.anInt3355 + Static149.anInt3743 / 2 & 0x7FF;
		@Pc(82) int local82 = Static21.anInt683 + Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anInt1838;
		Static80.anInt2162 += Static122.anInt3942 / 2;
		@Pc(98) int local98 = Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anInt1825 + Static43.anInt1182;
		if (Static80.anInt2162 < 128) {
			Static80.anInt2162 = 128;
		}
		if (Static80.anInt2162 > 383) {
			Static80.anInt2162 = 383;
		}
		if (Static162.anInt4002 - local82 < -500 || Static162.anInt4002 - local82 > 500 || Static93.anInt2444 - local98 < -500 || Static93.anInt2444 - local98 > 500) {
			Static93.anInt2444 = local98;
			Static162.anInt4002 = local82;
		}
		if (Static93.anInt2444 != local98) {
			Static93.anInt2444 += (local98 - Static93.anInt2444) / 16;
		}
		if (Static162.anInt4002 != local82) {
			Static162.anInt4002 += (local82 - Static162.anInt4002) / 16;
		}
		@Pc(171) int local171 = Static162.anInt4002 >> 7;
		@Pc(175) int local175 = Static93.anInt2444 >> 7;
		@Pc(182) int local182 = 0;
		@Pc(188) int local188 = Static99.method1680(Static93.anInt2444, Static162.anInt4002, Static85.anInt2267);
		@Pc(208) int local208;
		if (local171 > 3 && local175 > 3 && local171 < 100 && local175 < 100) {
			for (local208 = local171 - 4; local208 <= local171 + 4; local208++) {
				for (@Pc(214) int local214 = local175 - 4; local214 <= local175 + 4; local214++) {
					@Pc(218) int local218 = Static85.anInt2267;
					if (local218 < 3 && (Static12.aByteArrayArrayArray11[1][local208][local214] & 0x2) == 2) {
						local218++;
					}
					@Pc(244) int local244 = local188 - Static141.anIntArrayArrayArray3[local218][local208][local214];
					if (local182 < local244) {
						local182 = local244;
					}
				}
			}
		}
		local208 = local182 * 192;
		if (local208 > 98048) {
			local208 = 98048;
		}
		if (local208 < 32768) {
			local208 = 32768;
		}
		if (Static65.anInt3662 < local208) {
			Static65.anInt3662 += (local208 - Static65.anInt3662) / 24;
		} else if (local208 < Static65.anInt3662) {
			Static65.anInt3662 += (local208 - Static65.anInt3662) / 80;
		}
	}

	@OriginalMember(owner = "client!rc", name = "i", descriptor = "(I)V")
	public static void method2466() {
		aClass30_Sub1_14 = null;
		aClass30_Sub1_15 = null;
		aClass10_11 = null;
		aClass23Array21 = null;
		aClass23_1357 = null;
		aClass23_1358 = null;
		aClass23_1359 = null;
		aClass16_1 = null;
		aClass79_22 = null;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZLclient!je;I)V")
	public static void method2467(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class44 arg1) {
		if (Static26.aClass44_3 != null) {
			try {
				Static26.aClass44_3.method1417();
			} catch (@Pc(12) Exception local12) {
			}
			Static26.aClass44_3 = null;
		}
		Static26.aClass44_3 = arg1;
		Static66.method1177(arg0);
		Static62.aClass1_Sub1_Sub14_1 = null;
		Static61.aClass1_Sub8_5 = null;
		Static132.aClass1_Sub8_7.anInt1357 = 0;
		Static115.anInt2962 = 0;
		while (true) {
			@Pc(40) Class1_Sub1_Sub14 local40 = (Class1_Sub1_Sub14) Static182.aClass10_13.method257();
			if (local40 == null) {
				while (true) {
					local40 = (Class1_Sub1_Sub14) Static123.aClass10_10.method257();
					if (local40 == null) {
						if (Static122.aByte9 != 0) {
							try {
								@Pc(95) Class1_Sub8 local95 = new Class1_Sub8(4);
								local95.method862(4);
								local95.method862(Static122.aByte9);
								local95.method869(0);
								Static26.aClass44_3.method1419(local95.aByteArray12, 4);
							} catch (@Pc(116) IOException local116) {
								try {
									Static26.aClass44_3.method1417();
								} catch (@Pc(121) Exception local121) {
								}
								Static26.aClass44_3 = null;
								Static46.anInt4321++;
							}
						}
						Static161.anInt3980 = 0;
						Static161.aLong125 = Static47.method763();
						return;
					}
					Static149.aClass53_1.method1715(local40);
					Static113.aClass10_9.method263(local40, local40.aLong140);
					Static36.anInt984++;
					Static68.anInt1776--;
				}
			}
			Static45.aClass10_2.method263(local40, local40.aLong140);
			Static181.anInt4353--;
			Static163.anInt4013++;
		}
	}

	@OriginalMember(owner = "client!rc", name = "j", descriptor = "(I)V")
	public static void method2468() {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
		System.exit(1);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIII)V")
	public static void method2469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
			Static176.anInt4187 = -1;
			Static16.anInt497 = -1;
			return;
		}
		@Pc(33) int local33 = Static99.method1680(arg1, arg0, Static85.anInt2267) - arg2;
		@Pc(37) int local37 = arg1 - Static166.anInt4090;
		@Pc(41) int local41 = Class1_Sub1_Sub12_Sub2.anIntArray417[Static46.anInt4326];
		@Pc(45) int local45 = local33 - Static163.anInt4011;
		@Pc(49) int local49 = Class1_Sub1_Sub12_Sub2.anIntArray416[Static46.anInt4326];
		@Pc(53) int local53 = arg0 - Static162.anInt3999;
		@Pc(57) int local57 = Class1_Sub1_Sub12_Sub2.anIntArray417[Static29.anInt886];
		@Pc(61) int local61 = Class1_Sub1_Sub12_Sub2.anIntArray416[Static29.anInt886];
		@Pc(71) int local71 = local53 * local57 + local61 * local37 >> 16;
		@Pc(87) int local87 = local37 * local57 - local53 * local61 >> 16;
		@Pc(89) int local89 = local71;
		@Pc(100) int local100 = local45 * local41 - local87 * local49 >> 16;
		@Pc(110) int local110 = local41 * local87 + local49 * local45 >> 16;
		if (local110 >= 50) {
			Static16.anInt497 = (local100 << 9) / local110 + 167;
			Static176.anInt4187 = (local89 << 9) / local110 + 256;
		} else {
			Static176.anInt4187 = -1;
			Static16.anInt497 = -1;
		}
	}
}
