import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!bj", name = "xb", descriptor = "[I")
	public static int[] anIntArray45;

	@OriginalMember(owner = "client!bj", name = "eb", descriptor = "Lclient!i;")
	public static Class41 aClass41_128 = Static184.method2923("-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

	@OriginalMember(owner = "client!bj", name = "qb", descriptor = "Lclient!i;")
	public static Class41 aClass41_129 = Static184.method2923("::errortest");

	@OriginalMember(owner = "client!bj", name = "zb", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!bj", name = "Bb", descriptor = "Z")
	public static boolean aBoolean30 = true;

	@OriginalMember(owner = "client!bj", name = "Cb", descriptor = "Lclient!i;")
	public static Class41 aClass41_130 = Static184.method2923("(U0a )2 via: ");

	@OriginalMember(owner = "client!bj", name = "Db", descriptor = "Lclient!i;")
	public static Class41 aClass41_131 = Static184.method2923("Bitte geben Sie Ihren Benutzernamen ein)3");

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(BI)Lclient!qb;")
	public static Class2_Sub2_Sub17 method422(@OriginalArg(1) int arg0) {
		@Pc(6) Class2_Sub2_Sub17 local6 = (Class2_Sub2_Sub17) Static151.aClass43_16.method1464((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(25) byte[] local25 = Static32.aClass15_6.method387(arg0, 26);
		local6 = new Class2_Sub2_Sub17();
		if (local25 != null) {
			local6.method2571(new Class2_Sub3(local25));
		}
		Static151.aClass43_16.method1462((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!bj", name = "c", descriptor = "(Z)V")
	public static void method423() {
		try {
			if (Static108.anInt2618 == 1) {
				@Pc(17) int local17 = Static28.aClass2_Sub6_Sub3_1.method2456();
				if (local17 > 0 && Static28.aClass2_Sub6_Sub3_1.method2458()) {
					local17 -= Static154.anInt3617;
					if (local17 < 0) {
						local17 = 0;
					}
					Static28.aClass2_Sub6_Sub3_1.method2445(local17);
				} else {
					Static28.aClass2_Sub6_Sub3_1.method2467();
					Static28.aClass2_Sub6_Sub3_1.method2439();
					Static220.aClass69_1 = null;
					Static173.aClass2_Sub14_1 = null;
					if (Static143.aClass15_31 == null) {
						Static108.anInt2618 = 0;
					} else {
						Static108.anInt2618 = 2;
					}
				}
			}
		} catch (@Pc(55) Exception local55) {
			local55.printStackTrace();
			Static28.aClass2_Sub6_Sub3_1.method2467();
			Static220.aClass69_1 = null;
			Static143.aClass15_31 = null;
			Static173.aClass2_Sub14_1 = null;
			Static108.anInt2618 = 0;
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "([[IB)V")
	public static void method428(@OriginalArg(0) int[][] arg0) {
		Static3.anIntArrayArray1 = arg0;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IBIIZI)Lclient!rc;")
	public static Class2_Sub2_Sub16 method430(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(30) long local30 = ((long) arg4 << 40) + ((long) arg2 << 16) + (long) arg1 + (arg3 ? 137438953472L : 0L) + ((long) arg0 << 38);
		@Pc(36) Class2_Sub2_Sub16 local36 = (Class2_Sub2_Sub16) Static182.aClass43_19.method1464(local30);
		if (local36 != null) {
			return local36;
		}
		Static155.aBoolean211 = false;
		local36 = Static67.method1230(arg1, arg2, arg4, arg0, false, arg3);
		if (local36 != null && !Static155.aBoolean211) {
			Static182.aClass43_19.method1462(local30, local36);
		}
		return local36;
	}

	@OriginalMember(owner = "client!bj", name = "d", descriptor = "(I)V")
	public static void method431() {
		@Pc(7) boolean local7 = false;
		while (!local7) {
			local7 = true;
			for (@Pc(18) int local18 = 0; local18 < Static179.anInt4150 - 1; local18++) {
				if (Static48.aShortArray34[local18] < 1000 && Static48.aShortArray34[local18 + 1] > 1000) {
					local7 = false;
					@Pc(40) Class41 local40 = Static177.aClass41Array63[local18];
					Static177.aClass41Array63[local18] = Static177.aClass41Array63[local18 + 1];
					Static177.aClass41Array63[local18 + 1] = local40;
					@Pc(58) Class41 local58 = Static59.aClass41Array24[local18];
					Static59.aClass41Array24[local18] = Static59.aClass41Array24[local18 + 1];
					Static59.aClass41Array24[local18 + 1] = local58;
					@Pc(76) int local76 = Static148.anIntArray346[local18];
					Static148.anIntArray346[local18] = Static148.anIntArray346[local18 + 1];
					Static148.anIntArray346[local18 + 1] = local76;
					@Pc(94) int local94 = Static192.anIntArray451[local18];
					Static192.anIntArray451[local18] = Static192.anIntArray451[local18 + 1];
					Static192.anIntArray451[local18 + 1] = local94;
					@Pc(112) short local112 = Static48.aShortArray34[local18];
					Static48.aShortArray34[local18] = Static48.aShortArray34[local18 + 1];
					Static48.aShortArray34[local18 + 1] = local112;
					@Pc(130) long local130 = Static65.aLongArray4[local18];
					Static65.aLongArray4[local18] = Static65.aLongArray4[local18 + 1];
					Static65.aLongArray4[local18 + 1] = local130;
				}
			}
		}
	}
}
