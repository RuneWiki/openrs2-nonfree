import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "Lclient!kb;")
	public static Class46 aClass46_90 = Static65.method1172("Stufe)2");

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "Lclient!kb;")
	public static Class46 aClass46_91 = Static65.method1172("AUS");

	@OriginalMember(owner = "client!bb", name = "j", descriptor = "Lclient!nb;")
	public static Class57 aClass57_2 = new Class57(30);

	@OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
	public static int anInt356 = 0;

	@OriginalMember(owner = "client!bb", name = "w", descriptor = "Lclient!kb;")
	private static Class46 aClass46_94 = Static65.method1172(" from your friend list first)3");

	@OriginalMember(owner = "client!bb", name = "m", descriptor = "Lclient!kb;")
	public static Class46 aClass46_92 = aClass46_94;

	@OriginalMember(owner = "client!bb", name = "x", descriptor = "Lclient!kb;")
	private static Class46 aClass46_95 = Static65.method1172("Your ignore list is full)3 Max of 100 users)3");

	@OriginalMember(owner = "client!bb", name = "o", descriptor = "Lclient!kb;")
	public static Class46 aClass46_93 = aClass46_95;

	@OriginalMember(owner = "client!bb", name = "F", descriptor = "Z")
	public static boolean aBoolean12 = false;

	@OriginalMember(owner = "client!bb", name = "G", descriptor = "Lclient!kb;")
	public static Class46 aClass46_96 = Static65.method1172("Sprites geladen)3");

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILclient!kb;III)V")
	public static void method288(@OriginalArg(0) int arg0, @OriginalArg(1) Class46 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class33 local8 = Static98.method1607(arg2, arg0);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray7 != null) {
			@Pc(18) Class3_Sub14 local18 = new Class3_Sub14();
			local18.anInt2222 = arg3;
			local18.anObjectArray28 = local8.anObjectArray7;
			local18.aClass46_756 = arg1;
			local18.aClass33_10 = local8;
			Static71.method1217(local18);
		}
		@Pc(36) boolean local36 = true;
		if (local8.anInt1432 > 0) {
			local36 = Static36.method649(local8);
		}
		if (!local36 || !Static156.method2539(arg3 - 1, Static157.method2541(local8))) {
			return;
		}
		if (arg3 == 1) {
			Static133.aClass3_Sub4_Sub1_3.method233(27);
			Static133.aClass3_Sub4_Sub1_3.method188(arg0);
			Static133.aClass3_Sub4_Sub1_3.method198(arg2);
		}
		if (arg3 == 2) {
			Static133.aClass3_Sub4_Sub1_3.method233(55);
			Static133.aClass3_Sub4_Sub1_3.method188(arg0);
			Static133.aClass3_Sub4_Sub1_3.method198(arg2);
		}
		if (arg3 == 3) {
			Static133.aClass3_Sub4_Sub1_3.method233(236);
			Static133.aClass3_Sub4_Sub1_3.method188(arg0);
			Static133.aClass3_Sub4_Sub1_3.method198(arg2);
		}
		if (arg3 == 4) {
			Static133.aClass3_Sub4_Sub1_3.method233(134);
			Static133.aClass3_Sub4_Sub1_3.method188(arg0);
			Static133.aClass3_Sub4_Sub1_3.method198(arg2);
		}
		if (arg3 == 5) {
			Static133.aClass3_Sub4_Sub1_3.method233(173);
			Static133.aClass3_Sub4_Sub1_3.method188(arg0);
			Static133.aClass3_Sub4_Sub1_3.method198(arg2);
		}
		if (arg3 == 6) {
			Static133.aClass3_Sub4_Sub1_3.method233(61);
			Static133.aClass3_Sub4_Sub1_3.method188(arg0);
			Static133.aClass3_Sub4_Sub1_3.method198(arg2);
		}
		if (arg3 == 7) {
			Static133.aClass3_Sub4_Sub1_3.method233(79);
			Static133.aClass3_Sub4_Sub1_3.method188(arg0);
			Static133.aClass3_Sub4_Sub1_3.method198(arg2);
		}
		if (arg3 == 8) {
			Static133.aClass3_Sub4_Sub1_3.method233(215);
			Static133.aClass3_Sub4_Sub1_3.method188(arg0);
			Static133.aClass3_Sub4_Sub1_3.method198(arg2);
		}
		if (arg3 == 9) {
			Static133.aClass3_Sub4_Sub1_3.method233(246);
			Static133.aClass3_Sub4_Sub1_3.method188(arg0);
			Static133.aClass3_Sub4_Sub1_3.method198(arg2);
		}
		if (arg3 == 10) {
			Static133.aClass3_Sub4_Sub1_3.method233(5);
			Static133.aClass3_Sub4_Sub1_3.method188(arg0);
			Static133.aClass3_Sub4_Sub1_3.method198(arg2);
		}
	}

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "(I)V")
	public static void method289() {
		while (true) {
			if (Static49.aClass3_Sub4_Sub1_2.method232(Static139.anInt3221) >= 27) {
				@Pc(12) int local12 = Static49.aClass3_Sub4_Sub1_2.method228(15);
				if (local12 != 32767) {
					@Pc(17) boolean local17 = false;
					if (Static126.aClass3_Sub2_Sub1_Sub1_Sub2Array1[local12] == null) {
						local17 = true;
						Static126.aClass3_Sub2_Sub1_Sub1_Sub2Array1[local12] = new Class3_Sub2_Sub1_Sub1_Sub2();
					}
					@Pc(33) Class3_Sub2_Sub1_Sub1_Sub2 local33 = Static126.aClass3_Sub2_Sub1_Sub1_Sub2Array1[local12];
					Static42.anIntArray106[Static174.anInt3804++] = local12;
					local33.anInt1734 = Static20.anInt512;
					@Pc(51) int local51 = Static49.aClass3_Sub4_Sub1_2.method228(1);
					@Pc(58) int local58 = Static49.aClass3_Sub4_Sub1_2.method228(5);
					@Pc(63) int local63 = Static49.aClass3_Sub4_Sub1_2.method228(5);
					@Pc(68) int local68 = Static49.aClass3_Sub4_Sub1_2.method228(1);
					if (local63 > 15) {
						local63 -= 32;
					}
					if (local58 > 15) {
						local58 -= 32;
					}
					if (local68 == 1) {
						Static14.anIntArray25[Static108.anInt2585++] = local12;
					}
					@Pc(96) int local96 = Static21.anIntArray339[Static49.aClass3_Sub4_Sub1_2.method228(3)];
					if (local17) {
						local33.anInt1732 = local33.anInt1736 = local96;
					}
					local33.aClass3_Sub2_Sub16_1 = Static176.method2828(Static49.aClass3_Sub4_Sub1_2.method228(14));
					local33.anInt1710 = local33.aClass3_Sub2_Sub16_1.anInt3798;
					local33.anInt1699 = local33.aClass3_Sub2_Sub16_1.anInt3810;
					local33.anInt1697 = local33.aClass3_Sub2_Sub16_1.anInt3815;
					local33.anInt1712 = local33.aClass3_Sub2_Sub16_1.anInt3814;
					local33.anInt1737 = local33.aClass3_Sub2_Sub16_1.anInt3812;
					local33.anInt1713 = local33.aClass3_Sub2_Sub16_1.anInt3803;
					local33.anInt1682 = local33.aClass3_Sub2_Sub16_1.anInt3808;
					if (local33.anInt1682 == 0) {
						local33.anInt1736 = 0;
					}
					local33.anInt1683 = local33.aClass3_Sub2_Sub16_1.anInt3820;
					local33.anInt1714 = local33.aClass3_Sub2_Sub16_1.anInt3805;
					local33.method1168(local51 == 1, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray163[0] + local58, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray160[0] - -local63);
					continue;
				}
			}
			Static49.aClass3_Sub4_Sub1_2.method231();
			return;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIII)V")
	public static void method292(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static59.anInt1602 == 0 || arg0 == 0 || Static88.anInt2165 >= 50) {
			return;
		}
		Static123.anIntArray332[Static88.anInt2165] = arg2;
		Static49.anIntArray126[Static88.anInt2165] = arg0;
		Static90.anIntArray225[Static88.anInt2165] = arg1;
		Static146.aClass24Array1[Static88.anInt2165] = null;
		Static63.anIntArray155[Static88.anInt2165] = 0;
		Static88.anInt2165++;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V")
	public static void method294() {
		aClass46_92 = null;
		aClass46_91 = null;
		aClass57_2 = null;
		aClass46_90 = null;
		aClass46_93 = null;
		aClass46_94 = null;
		aClass46_95 = null;
		aClass46_96 = null;
	}
}
