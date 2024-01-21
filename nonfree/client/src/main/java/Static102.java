import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!sb", name = "r", descriptor = "[Lclient!l;")
	public static Class6_Sub3_Sub3_Sub2[] aClass6_Sub3_Sub3_Sub2Array10;

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
	public static int anInt2822 = 0;

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
	public static int anInt2823 = 0;

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1534 = Static80.method1463("null");

	@OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
	public static int anInt2827 = 0;

	@OriginalMember(owner = "client!sb", name = "j", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1535 = Static80.method1463("@whi@");

	@OriginalMember(owner = "client!sb", name = "l", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1536 = Static80.method1463("Unerwartete Antwort vom Anmelde)2Server");

	@OriginalMember(owner = "client!sb", name = "m", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1537 = Static80.method1463("Privater Chat");

	@OriginalMember(owner = "client!sb", name = "o", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1538 = Static80.method1463("Sie haben gerade eine andere Welt verlassen)3");

	@OriginalMember(owner = "client!sb", name = "q", descriptor = "I")
	public static int anInt2832 = 1;

	@OriginalMember(owner = "client!sb", name = "s", descriptor = "I")
	public static int anInt2833 = -1;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIBII)V")
	public static void method1853(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class6_Sub7 local12 = (Class6_Sub7) Static72.aClass2_8.method20((long) arg2);
		if (local12 == null) {
			local12 = new Class6_Sub7();
			Static72.aClass2_8.method18(local12, (long) arg2);
		}
		if (arg1 >= local12.anIntArray147.length) {
			@Pc(42) int[] local42 = new int[arg1 + 1];
			@Pc(47) int[] local47 = new int[arg1 + 1];
			for (@Pc(49) int local49 = 0; local49 < local12.anIntArray147.length; local49++) {
				local42[local49] = local12.anIntArray147[local49];
				local47[local49] = local12.anIntArray146[local49];
			}
			for (@Pc(79) int local79 = local12.anIntArray147.length; local79 < arg1; local79++) {
				local42[local79] = -1;
				local47[local79] = 0;
			}
			local12.anIntArray146 = local47;
			local12.anIntArray147 = local42;
		}
		local12.anIntArray147[arg1] = arg0;
		local12.anIntArray146[arg1] = arg3;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
	public static void method1854() {
		aClass63_1535 = null;
		aClass6_Sub3_Sub3_Sub2Array10 = null;
		aClass63_1538 = null;
		aClass63_1536 = null;
		aClass63_1534 = null;
		aClass63_1537 = null;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(III)V")
	public static void method1855(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) long local10 = (long) ((arg1 << -453991120) + arg0);
		@Pc(16) Class6_Sub3_Sub16 local16 = (Class6_Sub3_Sub16) Static2.aClass2_1.method20(local10);
		if (local16 != null) {
			Static113.aClass61_2.method1676(local16);
		}
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V")
	public static void method1856() {
		Static44.method959();
		Static64.method1206();
		@Pc(23) int local23;
		@Pc(27) int local27;
		if (Static47.anInt1496 == 2 || Static47.anInt1496 == 5) {
			@Pc(20) byte[] local20 = Static100.aClass6_Sub3_Sub3_Sub3_24.aByteArray31;
			local23 = local20.length;
			@Pc(25) int[] local25 = Static121.anIntArray338;
			for (local27 = 0; local27 < local23; local27++) {
				if (local20[local27] == 0) {
					local25[local27] = 0;
				}
			}
			if (Static47.anInt1496 < 3) {
				Static97.aClass6_Sub3_Sub3_Sub2_4.method1269(0, 0, 33, 33, 25, 25, Static109.anInt3032, 256, Static123.anIntArray371, Static2.anIntArray1);
			}
			Static43.method95();
			return;
		}
		@Pc(69) int local69 = Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anInt2319 / 32 + 48;
		local23 = 464 - Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anInt2347 / 32;
		@Pc(84) int local84 = Static109.anInt3032 + Static84.anInt2420 & 0x7FF;
		Static123.aClass6_Sub3_Sub3_Sub2_6.method1269(25, 5, 146, 151, local69, local23, local84, Static11.anInt1914 + 256, Static65.anIntArray217, Static85.anIntArray307);
		for (local27 = 0; local27 < Static116.anInt3159; local27++) {
			local23 = Static30.anIntArray124[local27] * 4 + 2 - Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anInt2347 / 32;
			local69 = Static72.anIntArray232[local27] * 4 + 2 - Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anInt2319 / 32;
			Static112.method2066(Static94.aClass6_Sub3_Sub3_Sub2Array8[local27], local69, local23);
		}
		@Pc(151) int local151;
		for (@Pc(147) int local147 = 0; local147 < 104; local147++) {
			for (local151 = 0; local151 < 104; local151++) {
				@Pc(161) Class1 local161 = Static89.aClass1ArrayArrayArray1[Static101.anInt2810][local147][local151];
				if (local161 != null) {
					local23 = local151 * 4 + 2 - Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anInt2347 / 32;
					local69 = local147 * 4 + 2 - Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anInt2319 / 32;
					Static112.method2066(aClass6_Sub3_Sub3_Sub2Array10[0], local69, local23);
				}
			}
		}
		for (local151 = 0; local151 < Static22.anInt689; local151++) {
			@Pc(216) Class6_Sub3_Sub1_Sub2_Sub1 local216 = Static78.aClass6_Sub3_Sub1_Sub2_Sub1Array1[Static80.anIntArray247[local151]];
			if (local216 != null && local216.method1545()) {
				@Pc(225) Class6_Sub3_Sub2 local225 = local216.aClass6_Sub3_Sub2_1;
				if (local225 != null && local225.anIntArray54 != null) {
					local225 = local225.method369();
				}
				if (local225 != null && local225.aBoolean25 && local225.aBoolean28) {
					local23 = local216.anInt2347 / 32 - Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anInt2347 / 32;
					local69 = local216.anInt2319 / 32 - Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anInt2319 / 32;
					Static112.method2066(aClass6_Sub3_Sub3_Sub2Array10[1], local69, local23);
				}
			}
		}
		@Pc(324) int local324;
		@Pc(288) Class6_Sub3_Sub1_Sub2_Sub2 local288;
		for (@Pc(275) int local275 = 0; local275 < Static81.anInt2219; local275++) {
			local288 = Static78.aClass6_Sub3_Sub1_Sub2_Sub2Array1[Static114.anIntArray356[local275]];
			if (local288 != null && local288.method1545()) {
				local23 = local288.anInt2347 / 32 - Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anInt2347 / 32;
				local69 = local288.anInt2319 / 32 - Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anInt2319 / 32;
				@Pc(320) long local320 = local288.aClass63_1237.method1823();
				@Pc(322) boolean local322 = false;
				for (local324 = 0; local324 < Static5.anInt52; local324++) {
					if (local320 == Static49.aLongArray2[local324] && Static31.anIntArray127[local324] != 0) {
						local322 = true;
						break;
					}
				}
				@Pc(353) boolean local353 = false;
				if (Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anInt2369 != 0 && local288.anInt2369 != 0 && Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anInt2369 == local288.anInt2369) {
					local353 = true;
				}
				if (local322) {
					Static112.method2066(aClass6_Sub3_Sub3_Sub2Array10[3], local69, local23);
				} else if (local353) {
					Static112.method2066(aClass6_Sub3_Sub3_Sub2Array10[4], local69, local23);
				} else {
					Static112.method2066(aClass6_Sub3_Sub3_Sub2Array10[2], local69, local23);
				}
			}
		}
		if (Static117.anInt3000 != 0 && Static73.anInt2064 % 20 < 10) {
			if (Static117.anInt3000 == 1 && Static40.anInt2114 >= 0 && Static40.anInt2114 < Static78.aClass6_Sub3_Sub1_Sub2_Sub1Array1.length) {
				@Pc(435) Class6_Sub3_Sub1_Sub2_Sub1 local435 = Static78.aClass6_Sub3_Sub1_Sub2_Sub1Array1[Static40.anInt2114];
				if (local435 != null) {
					local23 = local435.anInt2347 / 32 - Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anInt2347 / 32;
					local69 = local435.anInt2319 / 32 - Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anInt2319 / 32;
					Static100.method1839(local23, Static85.aClass6_Sub3_Sub3_Sub2Array11[1], local69);
				}
			}
			if (Static117.anInt3000 == 2) {
				local69 = (Static97.anInt2727 - Static80.anInt2169) * 4 + 2 - Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anInt2319 / 32;
				local23 = (Static46.anInt1428 - Static91.anInt2560) * 4 + 2 - Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anInt2347 / 32;
				Static100.method1839(local23, Static85.aClass6_Sub3_Sub3_Sub2Array11[1], local69);
			}
			if (Static117.anInt3000 == 10 && Static2.anInt32 >= 0 && Static78.aClass6_Sub3_Sub1_Sub2_Sub2Array1.length > Static2.anInt32) {
				local288 = Static78.aClass6_Sub3_Sub1_Sub2_Sub2Array1[Static2.anInt32];
				if (local288 != null) {
					local23 = local288.anInt2347 / 32 - Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anInt2347 / 32;
					local69 = local288.anInt2319 / 32 - Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anInt2319 / 32;
					Static100.method1839(local23, Static85.aClass6_Sub3_Sub3_Sub2Array11[1], local69);
				}
			}
		}
		if (Static36.anInt1217 != 0) {
			local23 = Static52.anInt1599 * 4 + 2 - Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anInt2347 / 32;
			local69 = Static36.anInt1217 * 4 + 2 - Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anInt2319 / 32;
			Static112.method2066(Static85.aClass6_Sub3_Sub3_Sub2Array11[0], local69, local23);
		}
		Static121.method1976(97, 78, 3, 3, 16777215);
		if (Static47.anInt1496 >= 3) {
			@Pc(602) byte[] local602 = Static100.aClass6_Sub3_Sub3_Sub3_24.aByteArray31;
			@Pc(604) int[] local604 = Static121.anIntArray338;
			for (@Pc(606) int local606 = 0; local606 <= 33; local606++) {
				@Pc(613) int local613 = Static100.aClass6_Sub3_Sub3_Sub3_24.anInt2689 * local606;
				for (local324 = 0; local324 <= 33; local324++) {
					if (local602[local324 + local613] == 0) {
						local604[local324 + local613] = 0;
					}
				}
			}
		} else {
			Static97.aClass6_Sub3_Sub3_Sub2_4.method1269(0, 0, 33, 33, 25, 25, Static109.anInt3032, 256, Static123.anIntArray371, Static2.anIntArray1);
		}
		Static43.method95();
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!dc;Z)V")
	public static void method1857(@OriginalArg(0) Class6_Sub3_Sub1_Sub2 arg0) {
		if (Static73.anInt2064 == arg0.anInt2332 || arg0.anInt2307 == -1 || arg0.anInt2314 != 0 || arg0.anInt2292 + 1 > Static30.method721(arg0.anInt2307).anIntArray149[arg0.anInt2329]) {
			@Pc(34) int local34 = arg0.anInt2332 - arg0.anInt2331;
			@Pc(40) int local40 = Static73.anInt2064 - arg0.anInt2331;
			@Pc(50) int local50 = arg0.anInt2294 * 128 + arg0.anInt2296 * 64;
			@Pc(60) int local60 = arg0.anInt2326 * 128 + arg0.anInt2296 * 64;
			@Pc(70) int local70 = arg0.anInt2296 * 64 + arg0.anInt2340 * 128;
			@Pc(80) int local80 = arg0.anInt2296 * 64 + arg0.anInt2313 * 128;
			arg0.anInt2347 = ((local34 - local40) * local50 + local40 * local80) / local34;
			arg0.anInt2319 = ((local34 - local40) * local70 + local40 * local60) / local34;
		}
		arg0.anInt2302 = 0;
		if (arg0.anInt2316 == 0) {
			arg0.anInt2309 = 1024;
		}
		if (arg0.anInt2316 == 1) {
			arg0.anInt2309 = 1536;
		}
		if (arg0.anInt2316 == 2) {
			arg0.anInt2309 = 0;
		}
		if (arg0.anInt2316 == 3) {
			arg0.anInt2309 = 512;
		}
		arg0.anInt2301 = arg0.anInt2309;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IB)[B")
	public static synchronized byte[] method1858(@OriginalArg(0) int arg0) {
		@Pc(19) byte[] local19;
		if (arg0 == 100 && Static10.anInt335 > 0) {
			local19 = Static47.aByteArrayArray3[--Static10.anInt335];
			Static47.aByteArrayArray3[Static10.anInt335] = null;
			return local19;
		} else if (arg0 == 5000 && Static13.anInt431 > 0) {
			local19 = Static85.aByteArrayArray9[--Static13.anInt431];
			Static85.aByteArrayArray9[Static13.anInt431] = null;
			return local19;
		} else if (arg0 == 30000 && Static82.anInt2240 > 0) {
			@Pc(75) byte[] local75 = Static29.aByteArrayArray2[--Static82.anInt2240];
			Static29.aByteArrayArray2[Static82.anInt2240] = null;
			return local75;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!rd;Lclient!rd;Lclient!ge;Z)Lclient!cd;")
	public static Class6_Sub3_Sub3_Sub1 method1859(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class63 arg1, @OriginalArg(2) Class7 arg2) {
		@Pc(13) int local13 = arg2.method91(arg0);
		@Pc(19) int local19 = arg2.method107(local13, arg1);
		return Static70.method1362(local19, local13, arg2);
	}
}
