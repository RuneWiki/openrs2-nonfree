import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "Lclient!c;")
	public static Class10 aClass10_51;

	@OriginalMember(owner = "client!fh", name = "k", descriptor = "Lclient!c;")
	public static Class10 aClass10_52;

	@OriginalMember(owner = "client!fh", name = "l", descriptor = "I")
	public static int anInt1370;

	@OriginalMember(owner = "client!fh", name = "j", descriptor = "Lclient!ai;")
	private static Class6 aClass6_376 = Static38.method685("You have only just left another world)3");

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "Lclient!ai;")
	public static Class6 aClass6_373 = aClass6_376;

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "I")
	public static volatile int anInt1366 = 0;

	@OriginalMember(owner = "client!fh", name = "g", descriptor = "Lclient!ai;")
	public static Class6 aClass6_374 = Static38.method685("Bitte warten Sie eine Minute");

	@OriginalMember(owner = "client!fh", name = "i", descriptor = "Lclient!ai;")
	public static Class6 aClass6_375 = Static38.method685("W-=hlen Sie eine Option");

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(JB)Lclient!ai;")
	public static Class6 method884(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(29) int local29 = 0;
			for (@Pc(31) long local31 = arg0; local31 != 0L; local31 /= 37L) {
				local29++;
			}
			@Pc(47) byte[] local47 = new byte[local29];
			while (arg0 != 0L) {
				@Pc(51) long local51 = arg0;
				arg0 /= 37L;
				local29--;
				local47[local29] = Static75.aByteArray9[(int) (local51 - arg0 * 37L)];
			}
			@Pc(78) Class6 local78 = new Class6();
			local78.aByteArray2 = local47;
			local78.anInt165 = local47.length;
			return local78;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V")
	public static void method885() {
		aClass6_375 = null;
		aClass10_52 = null;
		aClass6_374 = null;
		aClass10_51 = null;
		aClass6_373 = null;
		aClass6_376 = null;
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)V")
	public static void method886() {
		Static14.anIntArray16 = null;
		Static76.anIntArray121 = null;
		Static127.anIntArray258 = null;
		Static167.aByteArrayArray10 = null;
		Static88.anIntArray153 = null;
		Static131.anIntArray278 = null;
	}

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "(I)V")
	public static void method887() {
		for (@Pc(7) int local7 = 0; local7 < Static28.anInt732; local7++) {
			@Pc(13) int local13 = Static144.anIntArray300[local7];
			@Pc(17) Class2_Sub3_Sub5_Sub1_Sub2 local17 = Static151.aClass2_Sub3_Sub5_Sub1_Sub2Array1[local13];
			@Pc(21) int local21 = Static64.aClass2_Sub13_Sub1_1.method1402();
			if ((local21 & 0x8) != 0) {
				local17.aClass2_Sub3_Sub17_1 = Static116.method1867(Static64.aClass2_Sub13_Sub1_1.method1410());
				local17.anInt2656 = local17.aClass2_Sub3_Sub17_1.anInt3897;
				local17.anInt2700 = local17.aClass2_Sub3_Sub17_1.anInt3909;
				local17.anInt2667 = local17.aClass2_Sub3_Sub17_1.anInt3913;
				local17.anInt2707 = local17.aClass2_Sub3_Sub17_1.anInt3914;
				local17.anInt2659 = local17.aClass2_Sub3_Sub17_1.anInt3919;
				local17.anInt2695 = local17.aClass2_Sub3_Sub17_1.anInt3906;
				local17.anInt2683 = local17.aClass2_Sub3_Sub17_1.anInt3920;
				local17.anInt2668 = local17.aClass2_Sub3_Sub17_1.anInt3898;
				local17.anInt2706 = local17.aClass2_Sub3_Sub17_1.anInt3900;
			}
			@Pc(90) int local90;
			if ((local21 & 0x1) != 0) {
				local17.anInt2708 = Static64.aClass2_Sub13_Sub1_1.method1415();
				local90 = Static64.aClass2_Sub13_Sub1_1.method1425();
				local17.anInt2673 = local90 >> 16;
				local17.anInt2663 = 0;
				local17.anInt2711 = (local90 & 0xFFFF) + Static107.anInt2559;
				if (local17.anInt2711 > Static107.anInt2559) {
					local17.anInt2663 = -1;
				}
				if (local17.anInt2708 == 65535) {
					local17.anInt2708 = -1;
				}
				local17.anInt2661 = 0;
			}
			@Pc(136) int local136;
			if ((local21 & 0x80) != 0) {
				local90 = Static64.aClass2_Sub13_Sub1_1.method1436();
				local136 = Static64.aClass2_Sub13_Sub1_1.method1436();
				local17.method1802(local136, Static107.anInt2559, local90);
				local17.anInt2686 = Static107.anInt2559 + 300;
				local17.anInt2704 = Static64.aClass2_Sub13_Sub1_1.method1402();
				local17.anInt2670 = Static64.aClass2_Sub13_Sub1_1.method1409();
			}
			if ((local21 & 0x4) != 0) {
				local90 = Static64.aClass2_Sub13_Sub1_1.method1397();
				if (local90 == 65535) {
					local90 = -1;
				}
				local136 = Static64.aClass2_Sub13_Sub1_1.method1402();
				if (local90 == local17.anInt2658 && local90 != -1) {
					@Pc(233) int local233 = Static129.method2790(local90).anInt1689;
					if (local233 == 1) {
						local17.anInt2682 = local136;
						local17.anInt2669 = 0;
						local17.anInt2660 = 0;
						local17.anInt2688 = 0;
					}
					if (local233 == 2) {
						local17.anInt2660 = 0;
					}
				} else if (local90 == -1 || local17.anInt2658 == -1 || Static129.method2790(local90).anInt1678 >= Static129.method2790(local17.anInt2658).anInt1678) {
					local17.anInt2688 = 0;
					local17.anInt2658 = local90;
					local17.anInt2669 = 0;
					local17.anInt2694 = local17.anInt2687;
					local17.anInt2682 = local136;
					local17.anInt2660 = 0;
				}
			}
			if ((local21 & 0x40) != 0) {
				local17.aClass6_776 = Static64.aClass2_Sub13_Sub1_1.method1399();
				local17.anInt2701 = 100;
			}
			if ((local21 & 0x2) != 0) {
				local17.anInt2699 = Static64.aClass2_Sub13_Sub1_1.method1397();
				if (local17.anInt2699 == 65535) {
					local17.anInt2699 = -1;
				}
			}
			if ((local21 & 0x10) != 0) {
				local17.anInt2702 = Static64.aClass2_Sub13_Sub1_1.method1410();
				local17.anInt2709 = Static64.aClass2_Sub13_Sub1_1.method1397();
			}
			if ((local21 & 0x20) != 0) {
				local90 = Static64.aClass2_Sub13_Sub1_1.method1436();
				local136 = Static64.aClass2_Sub13_Sub1_1.method1441();
				local17.method1802(local136, Static107.anInt2559, local90);
				local17.anInt2686 = Static107.anInt2559 + 300;
				local17.anInt2704 = Static64.aClass2_Sub13_Sub1_1.method1402();
				local17.anInt2670 = Static64.aClass2_Sub13_Sub1_1.method1436();
			}
		}
	}
}
