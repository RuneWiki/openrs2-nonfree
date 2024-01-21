import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!fc", name = "W", descriptor = "Lclient!ja;")
	public static Class33 aClass33_9;

	@OriginalMember(owner = "client!fc", name = "tb", descriptor = "Lclient!dd;")
	public static Class16 aClass16_1;

	@OriginalMember(owner = "client!fc", name = "Kb", descriptor = "I")
	public static int anInt792;

	@OriginalMember(owner = "client!fc", name = "bb", descriptor = "Lclient!mc;")
	public static Class42 aClass42_415 = Static23.method501(" @whi@(X");

	@OriginalMember(owner = "client!fc", name = "fb", descriptor = "Z")
	public static boolean aBoolean37 = false;

	@OriginalMember(owner = "client!fc", name = "ib", descriptor = "I")
	public static int anInt768 = 0;

	@OriginalMember(owner = "client!fc", name = "kb", descriptor = "I")
	public static int anInt770 = 0;

	@OriginalMember(owner = "client!fc", name = "pb", descriptor = "I")
	public static int anInt775 = 0;

	@OriginalMember(owner = "client!fc", name = "ub", descriptor = "I")
	public static int anInt778 = 0;

	@OriginalMember(owner = "client!fc", name = "wb", descriptor = "Lclient!mc;")
	public static Class42 aClass42_416 = Static23.method501("blinken3:");

	@OriginalMember(owner = "client!fc", name = "Jb", descriptor = "Z")
	public static boolean aBoolean38 = false;

	@OriginalMember(owner = "client!fc", name = "Nb", descriptor = "[I")
	public static int[] anIntArray89 = new int[1000];

	@OriginalMember(owner = "client!fc", name = "Qb", descriptor = "Lclient!mc;")
	public static Class42 aClass42_417 = Static23.method501("titlebutton");

	@OriginalMember(owner = "client!fc", name = "Rb", descriptor = "Lclient!kc;")
	public static Class37 aClass37_11 = new Class37(100);

	@OriginalMember(owner = "client!fc", name = "Ub", descriptor = "Lclient!mc;")
	public static Class42 aClass42_418 = Static23.method501("Bitte warten Sie)3)3)3");

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!ja;Lclient!ja;I)I")
	public static int method543(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class33 arg1) {
		@Pc(5) int local5 = 0;
		if (arg0.method1313(Static57.aClass42_1419, Static39.aClass42_239)) {
			local5++;
		}
		if (arg1.method1313(Static92.aClass42_1310, Static39.aClass42_239)) {
			local5++;
		}
		if (arg1.method1313(Static83.aClass42_1185, Static39.aClass42_239)) {
			local5++;
		}
		if (arg1.method1313(aClass42_417, Static39.aClass42_239)) {
			local5++;
		}
		if (arg1.method1313(Static53.aClass42_1435, Static39.aClass42_239)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "(I)V")
	public static void method544() {
		Static90.method1655();
		@Pc(18) int local18;
		@Pc(20) int local20;
		if (Static79.anInt2016 == 2) {
			@Pc(13) byte[] local13 = Static75.aClass1_Sub1_Sub1_Sub4_14.aByteArray23;
			@Pc(15) int[] local15 = Static55.anIntArray237;
			local18 = local13.length;
			for (local20 = 0; local20 < local18; local20++) {
				if (local13[local20] == 0) {
					local15[local20] = 0;
				}
			}
			Static28.aClass1_Sub1_Sub1_Sub1_1.method77(0, 0, 33, 33, 25, 25, Static36.anInt897, 256, Static51.anIntArray205, Static58.anIntArray217);
			Static33.method583();
			return;
		}
		@Pc(58) int local58 = Static80.anInt2116 + Static36.anInt897 & 0x7FF;
		local18 = 464 - Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anInt2583 / 32;
		@Pc(73) int local73 = Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anInt2576 / 32 + 48;
		Static89.aClass1_Sub1_Sub1_Sub1_12.method77(25, 5, 146, 151, local73, local18, local58, Static74.anInt1894 + 256, Static45.anIntArray257, Static24.anIntArray70);
		for (local20 = 0; local20 < Static91.anInt2399; local20++) {
			local73 = Static57.anIntArray400[local20] * 4 + 2 - Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anInt2576 / 32;
			local18 = anIntArray89[local20] * 4 + 2 - Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anInt2583 / 32;
			Static7.method157(local18, Static15.aClass1_Sub1_Sub1_Sub1Array7[local20], local73);
		}
		@Pc(140) int local140;
		for (@Pc(136) int local136 = 0; local136 < 104; local136++) {
			for (local140 = 0; local140 < 104; local140++) {
				@Pc(150) Class22 local150 = Static93.aClass22ArrayArrayArray1[Static82.anInt2165][local136][local140];
				if (local150 != null) {
					local18 = local140 * 4 + 2 - Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anInt2583 / 32;
					local73 = local136 * 4 + 2 - Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anInt2576 / 32;
					Static7.method157(local18, Static29.aClass1_Sub1_Sub1_Sub1Array10[0], local73);
				}
			}
		}
		for (local140 = 0; local140 < Static91.anInt2403; local140++) {
			@Pc(204) Class1_Sub1_Sub8_Sub1_Sub1 local204 = Static8.aClass1_Sub1_Sub8_Sub1_Sub1Array1[Static98.anIntArray375[local140]];
			if (local204 != null && local204.method1763()) {
				@Pc(213) Class1_Sub1_Sub6 local213 = local204.aClass1_Sub1_Sub6_1;
				if (local213.anIntArray90 != null) {
					local213 = local213.method551();
				}
				if (local213 != null && local213.aBoolean39 && local213.aBoolean36) {
					local73 = local204.anInt2576 / 32 - Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anInt2576 / 32;
					local18 = local204.anInt2583 / 32 - Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anInt2583 / 32;
					Static7.method157(local18, Static29.aClass1_Sub1_Sub1_Sub1Array10[1], local73);
				}
			}
		}
		@Pc(273) Class1_Sub1_Sub8_Sub1_Sub2 local273;
		for (@Pc(265) int local265 = 0; local265 < anInt770; local265++) {
			local273 = Static33.aClass1_Sub1_Sub8_Sub1_Sub2Array1[Static68.anIntArray240[local265]];
			if (local273 != null && local273.method1763()) {
				local73 = local273.anInt2576 / 32 - Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anInt2576 / 32;
				local18 = local273.anInt2583 / 32 - Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anInt2583 / 32;
				@Pc(305) boolean local305 = false;
				@Pc(310) long local310 = local273.aClass42_1396.method1049();
				for (@Pc(312) int local312 = 0; local312 < Static8.anInt239; local312++) {
					if (local310 == Static87.aLongArray5[local312] && Static109.anIntArray408[local312] != 0) {
						local305 = true;
						break;
					}
				}
				@Pc(341) boolean local341 = false;
				if (Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anInt2618 != 0 && local273.anInt2618 != 0 && Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anInt2618 == local273.anInt2618) {
					local341 = true;
				}
				if (local305) {
					Static7.method157(local18, Static29.aClass1_Sub1_Sub1_Sub1Array10[3], local73);
				} else if (local341) {
					Static7.method157(local18, Static29.aClass1_Sub1_Sub1_Sub1Array10[4], local73);
				} else {
					Static7.method157(local18, Static29.aClass1_Sub1_Sub1_Sub1Array10[2], local73);
				}
			}
		}
		if (Static84.anInt2244 != 0 && anInt768 % 20 < 10) {
			if (Static84.anInt2244 == 1 && Static6.anInt156 >= 0 && Static8.aClass1_Sub1_Sub8_Sub1_Sub1Array1.length > Static6.anInt156) {
				@Pc(412) Class1_Sub1_Sub8_Sub1_Sub1 local412 = Static8.aClass1_Sub1_Sub8_Sub1_Sub1Array1[Static6.anInt156];
				if (local412 != null) {
					local73 = local412.anInt2576 / 32 - Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anInt2576 / 32;
					local18 = local412.anInt2583 / 32 - Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anInt2583 / 32;
					Static74.method1344(local73, local18, Static48.aClass1_Sub1_Sub1_Sub1Array19[1]);
				}
			}
			if (Static84.anInt2244 == 2) {
				local18 = (Static3.anInt120 - Static45.anInt1843) * 4 + 2 - Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anInt2583 / 32;
				local73 = (Static103.anInt2678 - Static51.anInt1373) * 4 + 2 - Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anInt2576 / 32;
				Static74.method1344(local73, local18, Static48.aClass1_Sub1_Sub1_Sub1Array19[1]);
			}
			if (Static84.anInt2244 == 10 && Static68.anInt1672 >= 0 && Static68.anInt1672 < Static33.aClass1_Sub1_Sub8_Sub1_Sub2Array1.length) {
				local273 = Static33.aClass1_Sub1_Sub8_Sub1_Sub2Array1[Static68.anInt1672];
				if (local273 != null) {
					local18 = local273.anInt2583 / 32 - Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anInt2583 / 32;
					local73 = local273.anInt2576 / 32 - Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anInt2576 / 32;
					Static74.method1344(local73, local18, Static48.aClass1_Sub1_Sub1_Sub1Array19[1]);
				}
			}
		}
		if (Static61.anInt1459 != 0) {
			local73 = Static61.anInt1459 * 4 + 2 - Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anInt2576 / 32;
			local18 = Static30.anInt833 * 4 + 2 - Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anInt2583 / 32;
			Static7.method157(local18, Static48.aClass1_Sub1_Sub1_Sub1Array19[0], local73);
		}
		Static55.method1129(97, 78, 3, 3, 16777215);
		Static28.aClass1_Sub1_Sub1_Sub1_1.method77(0, 0, 33, 33, 25, 25, Static36.anInt897, 256, Static51.anIntArray205, Static58.anIntArray217);
		Static33.method583();
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(JB)V")
	public static void method545(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(18) int local18 = 0; local18 < Static1.anInt1; local18++) {
			if (Static37.aLongArray2[local18] == arg0) {
				Static1.anInt1--;
				Static89.aBoolean132 = true;
				for (@Pc(38) int local38 = local18; local38 < Static1.anInt1; local38++) {
					Static37.aLongArray2[local38] = Static37.aLongArray2[local38 + 1];
				}
				Static98.aClass1_Sub8_Sub1_3.method1236(171);
				Static98.aClass1_Sub8_Sub1_3.method1193(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "i", descriptor = "(I)V")
	public static void method548() {
		aClass42_416 = null;
		aClass42_418 = null;
		aClass42_415 = null;
		aClass42_417 = null;
		aClass16_1 = null;
		aClass37_11 = null;
		aClass33_9 = null;
		anIntArray89 = null;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!ib;I)V")
	public static void method552(@OriginalArg(0) Class1_Sub1_Sub8_Sub1 arg0) {
		if (arg0.anInt2588 == anInt768 || arg0.anInt2601 == -1 || arg0.anInt2570 != 0 || arg0.anInt2604 + 1 > Static30.method574(arg0.anInt2601).anIntArray357[arg0.anInt2607]) {
			@Pc(38) int local38 = arg0.anInt2588 - arg0.anInt2549;
			@Pc(43) int local43 = anInt768 - arg0.anInt2549;
			@Pc(53) int local53 = arg0.anInt2599 * 64 + arg0.anInt2591 * 128;
			@Pc(63) int local63 = arg0.anInt2571 * 128 + arg0.anInt2599 * 64;
			@Pc(73) int local73 = arg0.anInt2599 * 64 + arg0.anInt2575 * 128;
			arg0.anInt2576 = (local63 * local43 + (local38 - local43) * local53) / local38;
			@Pc(97) int local97 = arg0.anInt2599 * 64 + arg0.anInt2602 * 128;
			arg0.anInt2583 = (local43 * local97 + (local38 - local43) * local73) / local38;
		}
		arg0.anInt2594 = 0;
		if (arg0.anInt2555 == 0) {
			arg0.anInt2606 = 1024;
		}
		if (arg0.anInt2555 == 1) {
			arg0.anInt2606 = 1536;
		}
		if (arg0.anInt2555 == 2) {
			arg0.anInt2606 = 0;
		}
		if (arg0.anInt2555 == 3) {
			arg0.anInt2606 = 512;
		}
		arg0.anInt2564 = arg0.anInt2606;
	}
}
