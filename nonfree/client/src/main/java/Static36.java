import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!di", name = "W", descriptor = "[I")
	public static int[] anIntArray81;

	@OriginalMember(owner = "client!di", name = "gb", descriptor = "[[S")
	public static short[][] aShortArrayArray2;

	@OriginalMember(owner = "client!di", name = "Q", descriptor = "Lclient!lf;")
	public static Class49 aClass49_479 = Static32.method683("<col=00ff00>");

	@OriginalMember(owner = "client!di", name = "V", descriptor = "I")
	public static int anInt924 = 0;

	@OriginalMember(owner = "client!di", name = "Y", descriptor = "Lclient!lf;")
	public static Class49 aClass49_480 = Static32.method683("Ung-Ultiger Benutzername");

	@OriginalMember(owner = "client!di", name = "cb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_481 = Static32.method683("Ihr Charakter)2Profil wird in:");

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(BLclient!uc;I)V")
	public static void method753(@OriginalArg(1) Class2_Sub2_Sub3_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg0.anInt3526 > Static127.anInt2757) {
			Static98.method1699(arg0);
		} else if (Static127.anInt2757 <= arg0.anInt3533) {
			Static158.method2676(arg0);
		} else {
			Static2.method23(arg0);
		}
		if (arg0.anInt3529 < 128 || arg0.anInt3578 < 128 || arg0.anInt3529 >= 13184 || arg0.anInt3578 >= 13184) {
			arg0.anInt3533 = 0;
			arg0.anInt3557 = -1;
			arg0.anInt3578 = arg0.anIntArray318[0] * 128 + arg0.anInt3581 * 64;
			arg0.anInt3529 = arg0.anIntArray316[0] * 128 + arg0.anInt3581 * 64;
			arg0.anInt3526 = 0;
			arg0.anInt3568 = -1;
			arg0.method2731();
		}
		if (Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1 == arg0 && (arg0.anInt3529 < 1536 || arg0.anInt3578 < 1536 || arg0.anInt3529 >= 11776 || arg0.anInt3578 >= 11776)) {
			arg0.anInt3557 = -1;
			arg0.anInt3578 = arg0.anIntArray318[0] * 128 + arg0.anInt3581 * 64;
			arg0.anInt3526 = 0;
			arg0.anInt3568 = -1;
			arg0.anInt3533 = 0;
			arg0.anInt3529 = arg0.anInt3581 * 64 + arg0.anIntArray316[0] * 128;
			arg0.method2731();
		}
		Static19.method365(arg0);
		Static30.method573(arg0);
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIZIIII)V")
	public static void method754(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 < 1 || arg0 < 1 || arg2 > 102 || arg0 > 102) {
			return;
		}
		if (Static159.aBoolean148 && Static66.anInt1396 != arg1) {
			return;
		}
		@Pc(31) long local31 = 0L;
		if (arg4 == 0) {
			local31 = Static17.method2057(arg1, arg2, arg0);
		}
		if (arg4 == 1) {
			local31 = Static67.method1129(arg1, arg2, arg0);
		}
		if (arg4 == 2) {
			local31 = Static156.method2642(arg1, arg2, arg0);
		}
		if (arg4 == 3) {
			local31 = Static71.method1174(arg1, arg2, arg0);
		}
		if (local31 != 0L) {
			@Pc(79) int local79 = (int) local31 >> 20 & 0x3;
			@Pc(86) int local86 = Integer.MAX_VALUE & (int) (local31 >>> 32);
			@Pc(93) int local93 = (int) local31 >> 14 & 0x1F;
			@Pc(106) Class2_Sub2_Sub9 local106;
			if (arg4 == 0) {
				Static30.method574(arg1, arg2, arg0);
				local106 = Static124.method2146(local86);
				if (local106.anInt1490 != 0) {
					Static148.aClass48Array1[arg1].method1597(local106.aBoolean66, arg0, arg2, local79, local93);
				}
			}
			if (arg4 == 1) {
				Static114.method1940(arg1, arg2, arg0);
			}
			if (arg4 == 2) {
				Static156.method2641(arg1, arg2, arg0);
				local106 = Static124.method2146(local86);
				if (local106.anInt1482 + arg2 > 103 || local106.anInt1482 + arg0 > 103 || arg2 + local106.anInt1480 > 103 || local106.anInt1480 + arg0 > 103) {
					return;
				}
				if (local106.anInt1490 != 0) {
					Static148.aClass48Array1[arg1].method1587(local79, local106.anInt1482, arg0, local106.anInt1480, local106.aBoolean66, arg2);
				}
			}
			if (arg4 == 3) {
				Static79.method3015(arg1, arg2, arg0);
				local106 = Static124.method2146(local86);
				if (local106.anInt1490 == 1) {
					Static148.aClass48Array1[arg1].method1601(arg0, arg2);
				}
			}
		}
		if (arg6 < 0) {
			return;
		}
		@Pc(221) int local221 = arg1;
		if (arg1 < 3 && (Static81.aByteArrayArrayArray2[1][arg2][arg0] & 0x2) == 2) {
			local221 = arg1 + 1;
		}
		Static185.method3043(arg6, arg5, arg3, arg0, Static148.aClass48Array1[arg1], local221, arg2, arg1);
		return;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ILclient!bg;)V")
	public static void method755(@OriginalArg(1) Class11 arg0) {
		Static62.aClass11_56 = arg0;
	}

	@OriginalMember(owner = "client!di", name = "d", descriptor = "(B)V")
	public static void method756() {
		try {
			if (Static105.aClass40_1 == null) {
				Static105.aClass40_1 = new Class40(Static45.aClass45_1, Static33.method692(new Class49[] { Static59.aClass49_628, Static154.aClass49_1490, Static43.aClass49_521 }).method1656());
			} else {
				@Pc(7) byte[] local7 = Static105.aClass40_1.method1214();
				if (local7 != null) {
					@Pc(14) Class2_Sub13 local14 = new Class2_Sub13(local7);
					Static58.anInt1234 = local14.method2933();
					Static148.aClass28Array1 = new Class28[Static58.anInt1234];
					for (@Pc(23) int local23 = 0; local23 < Static58.anInt1234; local23++) {
						@Pc(33) Class28 local33 = Static148.aClass28Array1[local23] = new Class28();
						@Pc(37) int local37 = local14.method2933();
						local33.aBoolean43 = (local37 & 0x8000) != 0;
						local33.anInt1163 = local37 & 0x7FFF;
						local33.aClass49_585 = local14.method2926();
						local33.anInt1159 = local14.method2941();
						local33.anInt1158 = local23;
						local33.anInt1161 = Static127.method2159(local33.aClass49_585);
					}
					Static84.method1437(Static139.anIntArray280, 0, Static148.aClass28Array1.length - 1, Static148.aClass28Array1, Static111.anIntArray223);
					Static118.aBoolean110 = true;
					Static105.aClass40_1 = null;
				}
			}
		} catch (@Pc(119) Exception local119) {
			local119.printStackTrace();
			Static105.aClass40_1 = null;
		}
	}

	@OriginalMember(owner = "client!di", name = "e", descriptor = "(B)V")
	public static void method757() {
		anIntArray81 = null;
		aClass49_479 = null;
		aClass49_481 = null;
		aShortArrayArray2 = null;
		aClass49_480 = null;
	}
}
