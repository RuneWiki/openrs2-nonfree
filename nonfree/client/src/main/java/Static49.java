import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!hd", name = "yb", descriptor = "[I")
	public static int[] anIntArray186;

	@OriginalMember(owner = "client!hd", name = "Kb", descriptor = "I")
	public static int anInt1364;

	@OriginalMember(owner = "client!hd", name = "Jb", descriptor = "Lclient!kd;")
	private static Class39 aClass39_654 = Static108.method1915("FULL");

	@OriginalMember(owner = "client!hd", name = "ob", descriptor = "Lclient!kd;")
	public static Class39 aClass39_651 = aClass39_654;

	@OriginalMember(owner = "client!hd", name = "rb", descriptor = "Lclient!kd;")
	private static Class39 aClass39_652 = Static108.method1915("Login limit exceeded)3");

	@OriginalMember(owner = "client!hd", name = "vb", descriptor = "Ljava/lang/Object;")
	public static Object anObject1 = new Object();

	@OriginalMember(owner = "client!hd", name = "zb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_653 = aClass39_652;

	@OriginalMember(owner = "client!hd", name = "Ob", descriptor = "I")
	public static int anInt1368 = 0;

	@OriginalMember(owner = "client!hd", name = "Qb", descriptor = "I")
	public static int anInt1370 = -1;

	@OriginalMember(owner = "client!hd", name = "Rb", descriptor = "I")
	public static int anInt1371 = 0;

	@OriginalMember(owner = "client!hd", name = "Sb", descriptor = "I")
	public static int anInt1372 = 0;

	@OriginalMember(owner = "client!hd", name = "Tb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_655 = Static108.method1915(" )2> <col=ffffff>");

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "(I)V")
	public static void method854() {
		aClass39_653 = null;
		aClass39_654 = null;
		aClass39_655 = null;
		anIntArray186 = null;
		aClass39_651 = null;
		aClass39_652 = null;
		anObject1 = null;
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(IB)V")
	public static void method855(@OriginalArg(0) int arg0) {
		if (Static25.anInt837 == 0) {
			Static76.aClass1_Sub8_Sub4_2.method1768(arg0);
		} else {
			Static121.anInt2969 = arg0;
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IZ)V")
	public static void method856(@OriginalArg(0) int arg0) {
		Static36.anInt1076 += arg0 * 128;
		@Pc(29) int local29;
		if (Static101.anIntArray392.length < Static36.anInt1076) {
			Static36.anInt1076 -= Static101.anIntArray392.length;
			local29 = (int) (Math.random() * 12.0D);
			Static33.method633(Static52.aClass1_Sub1_Sub4_Sub1Array5[local29]);
		}
		local29 = 0;
		@Pc(42) int local42 = arg0 * 128;
		@Pc(49) int local49 = (256 - arg0) * 128;
		@Pc(80) int local80;
		for (@Pc(56) int local56 = 0; local56 < local49; local56++) {
			local80 = Static51.anIntArray195[local42 + local29] - Static101.anIntArray392[Static101.anIntArray392.length - 1 & Static36.anInt1076 + local29] * arg0 / 6;
			if (local80 < 0) {
				local80 = 0;
			}
			Static51.anIntArray195[local29++] = local80;
		}
		@Pc(107) int local107;
		@Pc(109) int local109;
		@Pc(116) int local116;
		for (local80 = 256 - arg0; local80 < 256; local80++) {
			local107 = local80 * 128;
			for (local109 = 0; local109 < 128; local109++) {
				local116 = (int) (Math.random() * 100.0D);
				if (local116 < 50 && local109 > 10 && local109 < 118) {
					Static51.anIntArray195[local109 + local107] = 255;
				} else {
					Static51.anIntArray195[local109 + local107] = 0;
				}
			}
		}
		if (Static98.anInt2381 > 0) {
			Static98.anInt2381 -= arg0 * 4;
		}
		if (Static13.anInt530 > 0) {
			Static13.anInt530 -= arg0 * 4;
		}
		if (Static98.anInt2381 == 0 && Static13.anInt530 == 0) {
			local107 = (int) (Math.random() * (double) (2000 / arg0));
			if (local107 == 1) {
				Static13.anInt530 = 1024;
			}
			if (local107 == 0) {
				Static98.anInt2381 = 1024;
			}
		}
		for (local107 = 0; local107 < 256 - arg0; local107++) {
			Static100.anIntArray391[local107] = Static100.anIntArray391[arg0 + local107];
		}
		for (local109 = 256 - arg0; local109 < 256; local109++) {
			Static100.anIntArray391[local109] = (int) (Math.sin((double) Static121.anInt2965 / 14.0D) * 16.0D + Math.sin((double) Static121.anInt2965 / 15.0D) * 14.0D + Math.sin((double) Static121.anInt2965 / 16.0D) * 12.0D);
			Static121.anInt2965++;
		}
		local116 = ((Static45.anInt1256 & 0x1) + arg0) / 2;
		Static59.anInt1590 += arg0;
		if (local116 <= 0) {
			return;
		}
		@Pc(295) int local295;
		@Pc(288) int local288;
		for (@Pc(279) int local279 = 0; local279 < Static59.anInt1590 * 100; local279++) {
			local288 = (int) (Math.random() * 128.0D) + 128;
			local295 = (int) (Math.random() * 124.0D) + 2;
			Static51.anIntArray195[local295 + (local288 << 7)] = 192;
		}
		Static59.anInt1590 = 0;
		@Pc(326) int local326;
		@Pc(329) int local329;
		for (local295 = 0; local295 < 256; local295++) {
			local288 = 0;
			local326 = local295 * 128;
			for (local329 = -local116; local329 < 128; local329++) {
				if (local329 + local116 < 128) {
					local288 += Static51.anIntArray195[local326 + local329 + local116];
				}
				if (local329 - local116 - 1 >= 0) {
					local288 -= Static51.anIntArray195[local329 + local326 - local116 - 1];
				}
				if (local329 >= 0) {
					Static101.anIntArray395[local326 + local329] = local288 / (local116 * 2 + 1);
				}
			}
		}
		for (local288 = 0; local288 < 128; local288++) {
			local326 = 0;
			for (local329 = -local116; local329 < 256; local329++) {
				@Pc(407) int local407 = local329 * 128;
				if (local116 + local329 < 256) {
					local326 += Static101.anIntArray395[local116 * 128 + local288 + local407];
				}
				if (local329 - local116 - 1 >= 0) {
					local326 -= Static101.anIntArray395[local288 + local407 - local116 * 128 - 128];
				}
				if (local329 >= 0) {
					Static51.anIntArray195[local288 + local407] = local326 / (local116 * 2 + 1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(IB)V")
	public static void method857(@OriginalArg(0) int arg0) {
		Static34.method640(arg0);
		Static107.method1886(arg0);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!mf;I)V")
	public static void method858(@OriginalArg(0) Class1_Sub1_Sub2_Sub1 arg0) {
		if (Static45.anInt1256 == arg0.anInt2502 || arg0.anInt2526 == -1 || arg0.anInt2492 != 0 || arg0.anInt2534 + 1 > Static82.method1398(arg0.anInt2526).anIntArray149[arg0.anInt2485]) {
			@Pc(41) int local41 = Static45.anInt1256 - arg0.anInt2490;
			@Pc(48) int local48 = arg0.anInt2502 - arg0.anInt2490;
			@Pc(58) int local58 = arg0.anInt2522 * 128 + arg0.anInt2486 * 64;
			@Pc(69) int local69 = arg0.anInt2532 * 128 + arg0.anInt2486 * 64;
			@Pc(79) int local79 = arg0.anInt2486 * 64 + arg0.anInt2528 * 128;
			arg0.anInt2508 = ((local48 - local41) * local69 + local41 * local79) / local48;
			@Pc(102) int local102 = arg0.anInt2486 * 64 + arg0.anInt2481 * 128;
			arg0.anInt2521 = (local41 * local102 + local58 * (local48 - local41)) / local48;
		}
		arg0.anInt2489 = 0;
		if (arg0.anInt2523 == 0) {
			arg0.anInt2533 = 1024;
		}
		if (arg0.anInt2523 == 1) {
			arg0.anInt2533 = 1536;
		}
		if (arg0.anInt2523 == 2) {
			arg0.anInt2533 = 0;
		}
		if (arg0.anInt2523 == 3) {
			arg0.anInt2533 = 512;
		}
		arg0.anInt2509 = arg0.anInt2533;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(III)V")
	public static void method859(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static90.anInt2125 != 0 && arg1 != -1) {
			Static37.method669(0, arg1, Static90.anInt2125, Static29.aClass62_Sub1_24);
			Static10.aBoolean46 = true;
		}
	}

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "(B)V")
	public static void method860() {
		for (@Pc(3) int local3 = -1; local3 < Static57.anInt1547; local3++) {
			@Pc(13) int local13;
			if (local3 == -1) {
				local13 = 2047;
			} else {
				local13 = Static12.anIntArray91[local3];
			}
			@Pc(23) Class1_Sub1_Sub2_Sub1_Sub2 local23 = Static38.aClass1_Sub1_Sub2_Sub1_Sub2Array1[local13];
			if (local23 != null) {
				Static2.method62(local23, 1);
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "(I)V")
	public static void method861() {
		Static107.anIntArray414 = new int[104];
		Static76.aByteArrayArrayArray6 = new byte[4][104][104];
		Static86.anIntArray318 = new int[104];
		Static99.aByteArrayArrayArray7 = new byte[4][104][104];
		Static9.anIntArrayArrayArray9 = new int[4][105][105];
		Static120.anIntArray479 = new int[104];
		Static1.aByteArrayArrayArray1 = new byte[4][104][104];
		Static55.aByteArrayArrayArray5 = new byte[4][105][105];
		Static43.anIntArray174 = new int[104];
		Static43.anIntArrayArray8 = new int[105][105];
		Static4.anInt161 = 99;
		Static110.anIntArray422 = new int[104];
		Static10.aByteArrayArrayArray2 = new byte[4][104][104];
	}
}
