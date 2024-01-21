import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "Lclient!te;")
	public static Class6_Sub2_Sub14 aClass6_Sub2_Sub14_16;

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "[Lclient!eb;")
	public static Class6_Sub2_Sub2_Sub2[] aClass6_Sub2_Sub2_Sub2Array4;

	@OriginalMember(owner = "client!ec", name = "v", descriptor = "Lclient!fc;")
	public static Class21 aClass21_5;

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "Z")
	public static boolean aBoolean42 = false;

	@OriginalMember(owner = "client!ec", name = "h", descriptor = "Lclient!rc;")
	private static Class55 aClass55_360 = Static34.method846("scroll:");

	@OriginalMember(owner = "client!ec", name = "j", descriptor = "I")
	public static int anInt1000 = 0;

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "[[B")
	public static byte[][] aByteArrayArray2 = new byte[50][];

	@OriginalMember(owner = "client!ec", name = "l", descriptor = "B")
	public static byte aByte1 = 0;

	@OriginalMember(owner = "client!ec", name = "m", descriptor = "I")
	public static int anInt1001 = 0;

	@OriginalMember(owner = "client!ec", name = "n", descriptor = "Z")
	public static boolean aBoolean43 = false;

	@OriginalMember(owner = "client!ec", name = "o", descriptor = "Lclient!rc;")
	private static Class55 aClass55_361 = Static34.method846("Unable to connect)3");

	@OriginalMember(owner = "client!ec", name = "p", descriptor = "Lclient!rc;")
	public static Class55 aClass55_362 = Static34.method846("titlebox");

	@OriginalMember(owner = "client!ec", name = "s", descriptor = "Lclient!rc;")
	public static Class55 aClass55_363 = Static34.method846("mod_icons");

	@OriginalMember(owner = "client!ec", name = "w", descriptor = "I")
	public static int anInt1005 = 0;

	@OriginalMember(owner = "client!ec", name = "A", descriptor = "Lclient!rc;")
	public static Class55 aClass55_364 = aClass55_361;

	@OriginalMember(owner = "client!ec", name = "D", descriptor = "Lclient!rc;")
	public static Class55 aClass55_365 = aClass55_361;

	@OriginalMember(owner = "client!ec", name = "E", descriptor = "Lclient!rc;")
	public static Class55 aClass55_366 = Static34.method846("Lade Freunde)2Liste)3)3)3");

	@OriginalMember(owner = "client!ec", name = "F", descriptor = "Lclient!rc;")
	public static Class55 aClass55_367 = aClass55_360;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZIIIIIII)V")
	public static void method647(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 < 1 || arg2 < 1 || arg0 > 102 || arg2 > 102) {
			return;
		}
		if (Static90.aBoolean119 && arg3 != Static56.anInt1718) {
			return;
		}
		@Pc(27) int local27 = 0;
		if (arg6 == 0) {
			local27 = Static109.aClass34_1.method1027(arg3, arg0, arg2);
		}
		if (arg6 == 1) {
			local27 = Static109.aClass34_1.method1052(arg3, arg0, arg2);
		}
		if (arg6 == 2) {
			local27 = Static109.aClass34_1.method1060(arg3, arg0, arg2);
		}
		if (arg6 == 3) {
			local27 = Static109.aClass34_1.method1031(arg3, arg0, arg2);
		}
		@Pc(88) int local88;
		if (local27 != 0) {
			@Pc(81) int local81 = local27 >> 14 & 0x7FFF;
			local88 = Static109.aClass34_1.method1022(arg3, arg0, arg2, local27);
			@Pc(94) int local94 = local88 >> 6 & 0x3;
			@Pc(98) int local98 = local88 & 0x1F;
			@Pc(109) Class6_Sub2_Sub15 local109;
			if (arg6 == 0) {
				Static109.aClass34_1.method1059(arg3, arg0, arg2);
				local109 = Static8.method333(local81);
				if (local109.aBoolean150) {
					Static96.aClass57Array1[arg3].method1744(local94, local109.aBoolean151, arg2, local98, arg0);
				}
			}
			if (arg6 == 1) {
				Static109.aClass34_1.method1029(arg3, arg0, arg2);
			}
			if (arg6 == 2) {
				Static109.aClass34_1.method1021(arg3, arg0, arg2);
				local109 = Static8.method333(local81);
				if (local109.anInt2981 + arg0 > 103 || arg2 + local109.anInt2981 > 103 || arg0 + local109.anInt2984 > 103 || arg2 + local109.anInt2984 > 103) {
					return;
				}
				if (local109.aBoolean150) {
					Static96.aClass57Array1[arg3].method1740(local109.anInt2984, arg2, local94, local109.anInt2981, local109.aBoolean151, arg0);
				}
			}
			if (arg6 == 3) {
				Static109.aClass34_1.method1066(arg3, arg0, arg2);
				local109 = Static8.method333(local81);
				if (local109.aBoolean150 && local109.anInt3004 == 1) {
					Static96.aClass57Array1[arg3].method1734(arg2, arg0);
				}
			}
		}
		if (arg1 < 0) {
			return;
		}
		local88 = arg3;
		if (arg3 < 3 && (Static43.aByteArrayArrayArray8[1][arg0][arg2] & 0x2) == 2) {
			local88 = arg3 + 1;
		}
		Static11.method456(local88, Static96.aClass57Array1[arg3], arg4, arg2, arg3, arg5, Static109.aClass34_1, arg0, arg1);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
	public static void method648() {
		Static71.aClass36_24.method1155();
		Static1.aClass36_1.method1155();
		Static96.aClass36_32.method1155();
		Static106.aClass36_28.method1155();
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILclient!pb;Lclient!pb;)V")
	public static void method649(@OriginalArg(1) Class40 arg0, @OriginalArg(2) Class40 arg1) {
		Static43.aClass40_23 = arg1;
		Static12.aClass40_11 = arg0;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)I")
	public static int method650() {
		return Static94.anInt2641++;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!pb;III)Lclient!me;")
	public static Class6_Sub2_Sub2_Sub4 method651(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return Static44.method1829(arg2, arg1, arg0) ? Static83.method1593() : null;
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(B)V")
	public static void method652() {
		Static103.aClass3_9 = new Class3();
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(B)V")
	public static void method653() {
		aClass55_365 = null;
		aClass55_361 = null;
		aClass6_Sub2_Sub14_16 = null;
		aClass55_367 = null;
		aByteArrayArray2 = null;
		aClass55_364 = null;
		aClass55_363 = null;
		aClass55_366 = null;
		aClass6_Sub2_Sub2_Sub2Array4 = null;
		aClass55_360 = null;
		aClass55_362 = null;
		aClass21_5 = null;
	}
}
