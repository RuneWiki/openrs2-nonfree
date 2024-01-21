import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!mc", name = "v", descriptor = "Lclient!v;")
	public static Class2_Sub1_Sub9_Sub4 aClass2_Sub1_Sub9_Sub4_23;

	@OriginalMember(owner = "client!mc", name = "t", descriptor = "Lclient!wd;")
	public static Class80 aClass80_744 = Static2.method59("Wordpack geladen)3");

	@OriginalMember(owner = "client!mc", name = "u", descriptor = "I")
	public static int anInt1929 = 0;

	@OriginalMember(owner = "client!mc", name = "E", descriptor = "Lclient!wd;")
	private static Class80 aClass80_747 = Static2.method59("Loading fonts )2 ");

	@OriginalMember(owner = "client!mc", name = "w", descriptor = "Lclient!wd;")
	public static Class80 aClass80_745 = aClass80_747;

	@OriginalMember(owner = "client!mc", name = "A", descriptor = "Lclient!wd;")
	public static Class80 aClass80_746 = Static2.method59("au");

	@OriginalMember(owner = "client!mc", name = "C", descriptor = "I")
	public static int anInt1933 = 0;

	@OriginalMember(owner = "client!mc", name = "D", descriptor = "I")
	public static volatile int anInt1934 = -1;

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(B)V")
	public static void method1163() {
		Static38.method657();
		Static10.method173();
		@Pc(33) int local33;
		@Pc(35) int local35;
		if (Static39.anInt699 == 2 || Static39.anInt699 == 5) {
			@Pc(28) byte[] local28 = Static89.aClass2_Sub1_Sub9_Sub3_55.aByteArray34;
			@Pc(30) int[] local30 = Static99.anIntArray388;
			local33 = local28.length;
			for (local35 = 0; local35 < local33; local35++) {
				if (local28[local35] == 0) {
					local30[local35] = 0;
				}
			}
			if (Static39.anInt699 < 3) {
				Static119.aClass2_Sub1_Sub9_Sub1_5.method836(0, 0, 33, 33, 25, 25, Static124.anInt3139, 256, Static35.anIntArray146, Static125.anIntArray358);
			}
			Static113.method1857();
			return;
		}
		@Pc(73) int local73 = Static124.anInt3139 + Static92.anInt2272 & 0x7FF;
		local33 = 464 - Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt2324 / 32;
		@Pc(88) int local88 = Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt2370 / 32 + 48;
		Static85.aClass2_Sub1_Sub9_Sub1_7.method836(25, 5, 146, 151, local88, local33, local73, Static108.anInt2879 + 256, Static80.anIntArray273, Static2.anIntArray9);
		for (local35 = 0; local35 < Static2.anInt120; local35++) {
			local33 = Static14.anIntArray64[local35] * 4 + 2 - Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt2324 / 32;
			local88 = Static16.anIntArray67[local35] * 4 + 2 - Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt2370 / 32;
			Static87.method1409(Static77.aClass2_Sub1_Sub9_Sub1Array9[local35], local33, local88);
		}
		@Pc(153) int local153;
		for (@Pc(149) int local149 = 0; local149 < 104; local149++) {
			for (local153 = 0; local153 < 104; local153++) {
				@Pc(163) Class58 local163 = Static45.aClass58ArrayArrayArray3[Static16.anInt444][local149][local153];
				if (local163 != null) {
					local88 = local149 * 4 + 2 - Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt2370 / 32;
					local33 = local153 * 4 + 2 - Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt2324 / 32;
					Static87.method1409(Static86.aClass2_Sub1_Sub9_Sub1Array10[0], local33, local88);
				}
			}
		}
		for (local153 = 0; local153 < Static110.anInt2908; local153++) {
			@Pc(213) Class2_Sub1_Sub1_Sub4_Sub1 local213 = Static35.aClass2_Sub1_Sub1_Sub4_Sub1Array1[Static85.anIntArray277[local153]];
			if (local213 != null && local213.method1431()) {
				@Pc(222) Class2_Sub1_Sub13 local222 = local213.aClass2_Sub1_Sub13_1;
				if (local222 != null && local222.anIntArray331 != null) {
					local222 = local222.method1582();
				}
				if (local222 != null && local222.aBoolean191 && local222.aBoolean189) {
					local33 = local213.anInt2324 / 32 - Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt2324 / 32;
					local88 = local213.anInt2370 / 32 - Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt2370 / 32;
					Static87.method1409(Static86.aClass2_Sub1_Sub9_Sub1Array10[1], local33, local88);
				}
			}
		}
		@Pc(324) int local324;
		@Pc(288) Class2_Sub1_Sub1_Sub4_Sub2 local288;
		for (@Pc(280) int local280 = 0; local280 < Static92.anInt2273; local280++) {
			local288 = Static114.aClass2_Sub1_Sub1_Sub4_Sub2Array1[Static53.anIntArray208[local280]];
			if (local288 != null && local288.method1431()) {
				local33 = local288.anInt2324 / 32 - Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt2324 / 32;
				local88 = local288.anInt2370 / 32 - Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt2370 / 32;
				@Pc(317) boolean local317 = false;
				@Pc(322) long local322 = local288.aClass80_924.method2023();
				for (local324 = 0; local324 < Static45.anInt2090; local324++) {
					if (local322 == Static3.aLongArray1[local324] && Static29.anIntArray125[local324] != 0) {
						local317 = true;
						break;
					}
				}
				@Pc(349) boolean local349 = false;
				if (Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt2397 != 0 && local288.anInt2397 != 0 && local288.anInt2397 == Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt2397) {
					local349 = true;
				}
				if (local317) {
					Static87.method1409(Static86.aClass2_Sub1_Sub9_Sub1Array10[3], local33, local88);
				} else if (local349) {
					Static87.method1409(Static86.aClass2_Sub1_Sub9_Sub1Array10[4], local33, local88);
				} else {
					Static87.method1409(Static86.aClass2_Sub1_Sub9_Sub1Array10[2], local33, local88);
				}
			}
		}
		if (Static85.anInt2063 != 0 && Static10.anInt300 % 20 < 10) {
			if (Static85.anInt2063 == 1 && Static28.anInt2314 >= 0 && Static35.aClass2_Sub1_Sub1_Sub4_Sub1Array1.length > Static28.anInt2314) {
				@Pc(435) Class2_Sub1_Sub1_Sub4_Sub1 local435 = Static35.aClass2_Sub1_Sub1_Sub4_Sub1Array1[Static28.anInt2314];
				if (local435 != null) {
					local88 = local435.anInt2370 / 32 - Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt2370 / 32;
					local33 = local435.anInt2324 / 32 - Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt2324 / 32;
					Static60.method1050(Static21.aClass2_Sub1_Sub9_Sub1Array5[1], local33, local88);
				}
			}
			if (Static85.anInt2063 == 2) {
				local33 = (-Static66.anInt1860 + Static108.anInt2878) * 4 + 2 - Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt2324 / 32;
				local88 = (Static94.anInt2418 - Static57.anInt1736) * 4 + 2 - Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt2370 / 32;
				Static60.method1050(Static21.aClass2_Sub1_Sub9_Sub1Array5[1], local33, local88);
			}
			if (Static85.anInt2063 == 10 && Static83.anInt2048 >= 0 && Static83.anInt2048 < Static114.aClass2_Sub1_Sub1_Sub4_Sub2Array1.length) {
				local288 = Static114.aClass2_Sub1_Sub1_Sub4_Sub2Array1[Static83.anInt2048];
				if (local288 != null) {
					local33 = local288.anInt2324 / 32 - Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt2324 / 32;
					local88 = local288.anInt2370 / 32 - Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt2370 / 32;
					Static60.method1050(Static21.aClass2_Sub1_Sub9_Sub1Array5[1], local33, local88);
				}
			}
		}
		if (Static119.anInt1678 != 0) {
			local88 = Static119.anInt1678 * 4 + 2 - Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt2370 / 32;
			local33 = Static2.anInt121 * 4 + 2 - Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt2324 / 32;
			Static87.method1409(Static21.aClass2_Sub1_Sub9_Sub1Array5[0], local33, local88);
		}
		Static99.method1894(97, 78, 3, 3, 16777215);
		if (Static39.anInt699 >= 3) {
			@Pc(599) byte[] local599 = Static89.aClass2_Sub1_Sub9_Sub3_55.aByteArray34;
			@Pc(601) int[] local601 = Static99.anIntArray388;
			for (@Pc(603) int local603 = 0; local603 <= 33; local603++) {
				@Pc(610) int local610 = Static89.aClass2_Sub1_Sub9_Sub3_55.anInt2487 * local603;
				for (local324 = 0; local324 <= 33; local324++) {
					if (local599[local324 + local610] == 0) {
						local601[local324 + local610] = 0;
					}
				}
			}
		} else {
			Static119.aClass2_Sub1_Sub9_Sub1_5.method836(0, 0, 33, 33, 25, 25, Static124.anInt3139, 256, Static35.anIntArray146, Static125.anIntArray358);
		}
		Static113.method1857();
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!wd;BLclient!ff;Lclient!wd;)Lclient!qd;")
	public static Class2_Sub1_Sub9_Sub3 method1164(@OriginalArg(0) Class80 arg0, @OriginalArg(2) Class11 arg1, @OriginalArg(3) Class80 arg2) {
		@Pc(8) int local8 = arg1.method378(arg0);
		@Pc(21) int local21 = arg1.method391(local8, arg2);
		return Static36.method630(local8, arg1, local21);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)I")
	public static int method1165(@OriginalArg(1) int arg0) {
		@Pc(7) Class2_Sub1_Sub3 local7 = Static8.method132(arg0);
		@Pc(10) int local10 = local7.anInt257;
		@Pc(13) int local13 = local7.anInt259;
		@Pc(21) int local21 = local7.anInt256;
		@Pc(27) int local27 = Class66.anIntArray350[local21 - local13];
		return local27 & Static15.anIntArray66[local10] >> local13;
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V")
	public static void method1166() {
		aClass80_747 = null;
		aClass80_745 = null;
		aClass80_746 = null;
		aClass2_Sub1_Sub9_Sub4_23 = null;
		aClass80_744 = null;
	}
}
