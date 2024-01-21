import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "a", descriptor = "Lclient!sa;")
	public static Class4_Sub14 aClass4_Sub14_1;

	@OriginalMember(owner = "client!a", name = "j", descriptor = "Lclient!od;")
	private static Class60 aClass60_3 = Static41.method597("Too many incorrect logins from your address)3");

	@OriginalMember(owner = "client!a", name = "b", descriptor = "Lclient!od;")
	public static Class60 aClass60_1 = aClass60_3;

	@OriginalMember(owner = "client!a", name = "c", descriptor = "Lclient!od;")
	public static Class60 aClass60_2 = Static41.method597(" )2> <col=ffff00>");

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IZ)V")
	public static void method1(@OriginalArg(1) boolean arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static36.anInt1010; local3++) {
			@Pc(11) Class4_Sub3_Sub1_Sub2_Sub2 local11 = Static15.aClass4_Sub3_Sub1_Sub2_Sub2Array3[Static59.anIntArray173[local3]];
			@Pc(20) int local20 = (Static59.anIntArray173[local3] << 14) + 536870912;
			if (local11 != null && local11.method852() && arg0 == local11.aClass4_Sub3_Sub13_1.aBoolean79 && local11.aClass4_Sub3_Sub13_1.method1522()) {
				@Pc(49) int local49 = local11.anInt1440 >> 7;
				@Pc(54) int local54 = local11.anInt1407 >> 7;
				if (local49 >= 0 && local49 < 104 && local54 >= 0 && local54 < 104) {
					if (local11.anInt1434 == 1 && (local11.anInt1440 & 0x7F) == 64 && (local11.anInt1407 & 0x7F) == 64) {
						if (Static25.anIntArrayArray19[local49][local54] == Static125.anInt2831) {
							continue;
						}
						Static25.anIntArrayArray19[local49][local54] = Static125.anInt2831;
					}
					if (!local11.aClass4_Sub3_Sub13_1.aBoolean78) {
						local20 += Integer.MIN_VALUE;
					}
					Static30.aClass48_1.method1046(Static77.anInt1866, local11.anInt1440, local11.anInt1407, Static55.method882(local11.anInt1407 + (local11.anInt1434 - 1) * 64, local11.anInt1440 - (-(local11.anInt1434 * 64) + 64), Static77.anInt1866), local11.anInt1434 * 64 + 60 - 64, local11, local11.anInt1415, local20, local11.aBoolean44);
				}
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
	public static void method2() {
		aClass60_3 = null;
		aClass60_2 = null;
		aClass60_1 = null;
		aClass4_Sub14_1 = null;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ZLclient!jb;B)V")
	public static void method3(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class37 arg1) {
		if (Static11.aClass37_2 != null) {
			try {
				Static11.aClass37_2.method877();
			} catch (@Pc(8) Exception local8) {
			}
			Static11.aClass37_2 = null;
		}
		Static11.aClass37_2 = arg1;
		Static14.method285(arg0);
		Static36.aClass4_Sub3_Sub9_1 = null;
		Static117.aClass4_Sub9_5 = null;
		Static102.anInt2402 = 0;
		Static3.aClass4_Sub9_1.anInt1312 = 0;
		while (true) {
			@Pc(38) Class4_Sub3_Sub9 local38 = (Class4_Sub3_Sub9) Static132.aClass75_15.method1897();
			if (local38 == null) {
				while (true) {
					local38 = (Class4_Sub3_Sub9) Static26.aClass75_5.method1897();
					if (local38 == null) {
						if (Static7.aByte1 != 0) {
							try {
								@Pc(90) Class4_Sub9 local90 = new Class4_Sub9(4);
								local90.method819(4);
								local90.method819(Static7.aByte1);
								local90.method786(0);
								Static11.aClass37_2.method875(4, local90.aByteArray6);
							} catch (@Pc(111) IOException local111) {
								try {
									Static11.aClass37_2.method877();
								} catch (@Pc(116) Exception local116) {
								}
								Static5.anInt65++;
								Static11.aClass37_2 = null;
							}
						}
						Static76.anInt1844 = 0;
						Static56.aLong49 = Static8.method75();
						return;
					}
					Static56.aClass59_2.method1284(local38);
					Static97.aClass75_13.method1892(local38.aLong100, local38);
					Static32.anInt942++;
					Static99.anInt592--;
				}
			}
			Static41.aClass75_6.method1892(local38.aLong100, local38);
			Static70.anInt1739--;
			Static91.anInt2146++;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V")
	public static void method4() {
		Static64.aBoolean55 = false;
		Static8.aBoolean3 = false;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II)V")
	public static void method5(@OriginalArg(1) int arg0) {
		Static131.method1978();
		Static118.method1895();
		@Pc(14) int local14 = Static105.method1733(arg0).anInt936;
		if (local14 == 0) {
			return;
		}
		@Pc(22) int local22 = Static53.anIntArray141[arg0];
		if (local14 == 1) {
			if (local22 == 1) {
				Static100.method1675(0.9D);
				((Class68) Static100.anInterface3_1).method1565(0.9D);
			}
			if (local22 == 2) {
				Static100.method1675(0.8D);
				((Class68) Static100.anInterface3_1).method1565(0.8D);
			}
			if (local22 == 3) {
				Static100.method1675(0.7D);
				((Class68) Static100.anInterface3_1).method1565(0.7D);
			}
			if (local22 == 4) {
				Static100.method1675(0.6D);
				((Class68) Static100.anInterface3_1).method1565(0.6D);
			}
			Static35.method544();
		}
		if (local14 == 3) {
			@Pc(80) short local80 = 0;
			if (local22 == 0) {
				local80 = 255;
			}
			if (local22 == 1) {
				local80 = 192;
			}
			if (local22 == 2) {
				local80 = 128;
			}
			if (local22 == 3) {
				local80 = 64;
			}
			if (local22 == 4) {
				local80 = 0;
			}
			if (Static63.anInt1593 != local80) {
				if (Static63.anInt1593 == 0 && Static23.anInt808 != -1) {
					Static6.method57(Static23.anInt808, 0, Static10.aClass10_Sub1_3, local80);
					Static130.aBoolean126 = false;
				} else if (local80 == 0) {
					Static115.method1873();
					Static130.aBoolean126 = false;
				} else {
					Static69.method1102(local80);
				}
				Static63.anInt1593 = local80;
			}
		}
		if (local14 == 5) {
			Static18.anInt630 = local22;
		}
		if (local14 == 9) {
			Static85.anInt2017 = local22;
		}
		if (local14 == 10) {
			if (local22 == 0) {
				Static120.anInt2754 = 127;
			}
			if (local22 == 1) {
				Static120.anInt2754 = 96;
			}
			if (local22 == 2) {
				Static120.anInt2754 = 64;
			}
			if (local22 == 3) {
				Static120.anInt2754 = 32;
			}
			if (local22 == 4) {
				Static120.anInt2754 = 0;
			}
		}
		if (local14 == 6) {
			Static119.anInt2752 = local22;
		}
		if (local14 != 4) {
			return;
		}
		if (local22 == 0) {
			Static46.anInt1147 = 127;
		}
		if (local22 == 1) {
			Static46.anInt1147 = 96;
		}
		if (local22 == 2) {
			Static46.anInt1147 = 64;
		}
		if (local22 == 3) {
			Static46.anInt1147 = 32;
		}
		if (local22 == 4) {
			Static46.anInt1147 = 0;
			return;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ILclient!c;Lclient!c;Lclient!c;Lclient!c;)V")
	public static void method6(@OriginalArg(1) Class10 arg0, @OriginalArg(2) Class10 arg1, @OriginalArg(3) Class10 arg2, @OriginalArg(4) Class10 arg3) {
		Static32.aClass10_12 = arg1;
		Static40.aClass10_14 = arg0;
		Static123.aClass10_31 = arg3;
		Static65.aClass10_20 = arg2;
		Static82.aClass4_Sub14ArrayArray1 = new Class4_Sub14[Static32.aClass10_12.method1766()][];
		Static56.aBooleanArray9 = new boolean[Static32.aClass10_12.method1766()];
	}
}
