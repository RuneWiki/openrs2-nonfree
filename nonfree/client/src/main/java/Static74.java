import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "Lclient!hi;")
	public static Class66 aClass66_16;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!nk;I)V")
	public static void method1465(@OriginalArg(0) Class121 arg0) {
		Static83.aClass121_47 = arg0;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(III)J")
	public static long method1466(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub33 local7 = Static105.aClass1_Sub33ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null || local7.aClass52_1 == null ? 0L : local7.aClass52_1.aLong63;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)V")
	public static void method1467() {
		if (Static5.aClass97_1 != null) {
			Static5.aClass97_1.method2547();
			Static5.aClass97_1 = null;
		}
		Static259.method4090();
		Static286.method4394();
		@Pc(18) int local18;
		for (local18 = 0; local18 < 4; local18++) {
			Static240.aClass118Array1[local18].method3038();
		}
		Static36.method641(false);
		System.gc();
		Static252.method3971();
		Static273.anInt4944 = -1;
		Static152.aBoolean36 = false;
		Static21.method361(true);
		Static192.anInt3637 = 0;
		Static199.anInt3817 = 0;
		Static11.anInt171 = 0;
		Static129.anInt2589 = 0;
		Static284.aBoolean349 = false;
		for (local18 = 0; local18 < Static290.aClass134Array1.length; local18++) {
			Static290.aClass134Array1[local18] = null;
		}
		Static304.anInt5394 = 0;
		Static85.anInt1689 = 0;
		for (local18 = 0; local18 < 2048; local18++) {
			Static17.aClass15_Sub5_Sub2Array1[local18] = null;
			Static252.aClass1_Sub14Array1[local18] = null;
		}
		for (local18 = 0; local18 < 32768; local18++) {
			Static83.aClass15_Sub5_Sub1Array1[local18] = null;
		}
		for (local18 = 0; local18 < 4; local18++) {
			for (@Pc(111) int local111 = 0; local111 < 104; local111++) {
				for (@Pc(116) int local116 = 0; local116 < 104; local116++) {
					Static270.aClass59ArrayArrayArray1[local18][local111][local116] = null;
				}
			}
		}
		Static255.method4047();
		Static57.anInt1083 = 0;
		Static43.method807();
		Static302.method4562(true);
		try {
			Static321.method2506("loggedout", Static26.aClass154_1.anApplet1);
		} catch (@Pc(155) Throwable local155) {
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	public static String method1468(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(9) int local9 = arg2.indexOf(arg0); local9 != -1; local9 = arg2.indexOf(arg0, local9 + arg1.length())) {
			arg2 = arg2.substring(0, local9) + arg1 + arg2.substring(local9 + arg0.length());
		}
		return arg2;
	}
}
