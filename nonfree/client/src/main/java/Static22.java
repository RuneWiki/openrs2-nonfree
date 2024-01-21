import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "Lclient!ph;")
	public static Class66 aClass66_3;

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
	public static int anInt596;

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
	public static int anInt597;

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "[I")
	public static int[] anIntArray35 = new int[] { 1, 1, 1, 1 };

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
	public static void method470() {
		aClass66_3 = null;
		anIntArray35 = null;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!kg;ZI)V")
	public static void method471(@OriginalArg(0) Class43 arg0, @OriginalArg(1) boolean arg1) {
		if (Static176.aClass43_44 != null) {
			try {
				Static176.aClass43_44.method2042();
			} catch (@Pc(12) Exception local12) {
			}
			Static176.aClass43_44 = null;
		}
		Static176.aClass43_44 = arg0;
		Static89.method1932(arg1);
		Static173.aClass1_Sub9_3 = null;
		Static139.aClass1_Sub1_Sub5_1 = null;
		Static118.aClass1_Sub9_1.anInt1592 = 0;
		Static60.anInt1938 = 0;
		while (true) {
			@Pc(33) Class1_Sub1_Sub5 local33 = (Class1_Sub1_Sub5) Static173.aClass30_15.method1470();
			if (local33 == null) {
				while (true) {
					local33 = (Class1_Sub1_Sub5) Static121.aClass30_11.method1470();
					if (local33 == null) {
						if (Static148.aByte7 != 0) {
							try {
								@Pc(88) Class1_Sub9 local88 = new Class1_Sub9(4);
								local88.method1260(4);
								local88.method1260(Static148.aByte7);
								local88.method1236(0);
								Static176.aClass43_44.method2045(local88.aByteArray25, 4);
							} catch (@Pc(109) IOException local109) {
								try {
									Static176.aClass43_44.method2042();
								} catch (@Pc(114) Exception local114) {
								}
								Static102.anInt2886++;
								Static176.aClass43_44 = null;
							}
						}
						Static33.anInt1072 = 0;
						Static137.aLong118 = Static143.method2807();
						return;
					}
					Static130.aClass27_2.method1342(local33);
					Static139.aClass30_13.method1464(local33, local33.aLong147);
					Static147.anInt3874++;
					Static82.anInt2516--;
				}
			}
			Static94.aClass30_9.method1464(local33, local33.aLong147);
			Static98.anInt2846++;
			Static38.anInt1331--;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIII)V")
	public static void method472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = arg2; local7 <= arg2 + arg3; local7++) {
			for (@Pc(15) int local15 = arg1; local15 <= arg1 + arg0; local15++) {
				if (local15 >= 0 && local15 < 104 && local7 >= 0 && local7 < 104) {
					Static65.aByteArrayArrayArray5[0][local15][local7] = 127;
					if (arg1 == local15 && local15 > 0) {
						Static142.anIntArrayArrayArray8[0][local15][local7] = Static142.anIntArrayArrayArray8[0][local15 - 1][local7];
					}
					if (arg0 + arg1 == local15 && local15 < 103) {
						Static142.anIntArrayArrayArray8[0][local15][local7] = Static142.anIntArrayArrayArray8[0][local15 + 1][local7];
					}
					if (arg2 == local7 && local7 > 0) {
						Static142.anIntArrayArrayArray8[0][local15][local7] = Static142.anIntArrayArrayArray8[0][local15][local7 - 1];
					}
					if (arg3 + arg2 == local7 && local7 < 103) {
						Static142.anIntArrayArrayArray8[0][local15][local7] = Static142.anIntArrayArrayArray8[0][local15][local7 + 1];
					}
				}
			}
		}
	}
}
