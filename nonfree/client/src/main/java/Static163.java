import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!u", name = "y", descriptor = "I")
	public static int anInt3736;

	@OriginalMember(owner = "client!u", name = "D", descriptor = "[Lclient!wa;")
	public static Class89[] aClass89Array1;

	@OriginalMember(owner = "client!u", name = "I", descriptor = "[Lclient!ef;")
	public static Class1_Sub13[] aClass1_Sub13Array1;

	@OriginalMember(owner = "client!u", name = "s", descriptor = "Ljava/lang/Object;")
	public static Object anObject4 = new Object();

	@OriginalMember(owner = "client!u", name = "v", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1320 = Static120.method2057("(U3");

	@OriginalMember(owner = "client!u", name = "z", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1321 = Static120.method2057("AUS");

	@OriginalMember(owner = "client!u", name = "E", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1322 = Static120.method2057("Fallen lassen");

	@OriginalMember(owner = "client!u", name = "F", descriptor = "I")
	public static int anInt3740 = 2;

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(B)V")
	public static void method2846() {
		aClass81_1322 = null;
		aClass81_1320 = null;
		aClass1_Sub13Array1 = null;
		anObject4 = null;
		aClass89Array1 = null;
		aClass81_1321 = null;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(BJII)Z")
	public static boolean method2847(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = (int) arg0 >> 14 & 0x1F;
		@Pc(19) int local19 = (int) arg0 >> 20 & 0x3;
		@Pc(26) int local26 = Integer.MAX_VALUE & (int) (arg0 >>> 32);
		if (local12 == 10 || local12 == 11 || local12 == 22) {
			@Pc(65) Class1_Sub2_Sub8 local65 = Static14.method220(local26);
			@Pc(75) int local75;
			@Pc(78) int local78;
			if (local19 == 0 || local19 == 2) {
				local75 = local65.anInt1237;
				local78 = local65.anInt1277;
			} else {
				local75 = local65.anInt1277;
				local78 = local65.anInt1237;
			}
			@Pc(89) int local89 = local65.anInt1264;
			if (local19 != 0) {
				local89 = (local89 << local19 & 0xF) + (local89 >> 4 - local19);
			}
			Static139.method2339(true, local75, 0, 2, local78, Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.anIntArray326[0], arg1, Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.anIntArray324[0], arg2, 0, local89);
		} else {
			Static139.method2339(true, 0, local19, 2, 0, Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.anIntArray326[0], arg1, Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.anIntArray324[0], arg2, local12 + 1, 0);
		}
		Static173.anInt4002 = 0;
		Static23.anInt583 = 2;
		Static21.anInt537 = Static119.anInt2628;
		Static114.anInt2144 = Static140.anInt3065;
		return true;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(BLclient!vb;)V")
	public static void method2848(@OriginalArg(1) Class82 arg0) {
		Static180.aClass82_70 = arg0;
		Static132.anInt2861 = Static180.aClass82_70.method2966(16);
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(III)I")
	public static int method2849(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class1_Sub12 local10 = (Class1_Sub12) Static157.aClass5_11.method134((long) arg0);
		if (local10 == null) {
			return 0;
		} else if (arg1 >= 0 && arg1 < local10.anIntArray72.length) {
			return local10.anIntArray72[arg1];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "([IIIIII)V")
	public static void method2850(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class1_Sub17 local7 = Static167.aClass1_Sub17ArrayArrayArray1[arg2][arg3][arg4];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class54 local13 = local7.aClass54_1;
		@Pc(23) int local23;
		if (local13 != null) {
			@Pc(18) int local18 = local13.anInt2174;
			if (local18 != 0) {
				for (local23 = 0; local23 < 4; local23++) {
					arg0[arg1] = local18;
					arg0[arg1 + 1] = local18;
					arg0[arg1 + 2] = local18;
					arg0[arg1 + 3] = local18;
					arg1 += 512;
				}
			}
			return;
		}
		@Pc(58) Class12 local58 = local7.aClass12_1;
		if (local58 == null) {
			return;
		}
		local23 = local58.anInt752;
		@Pc(67) int local67 = local58.anInt751;
		@Pc(70) int local70 = local58.anInt750;
		@Pc(73) int local73 = local58.anInt749;
		@Pc(77) int[] local77 = Static132.anIntArrayArray23[local23];
		@Pc(81) int[] local81 = Static74.anIntArrayArray11[local67];
		@Pc(83) int local83 = 0;
		@Pc(87) int local87;
		if (local70 != 0) {
			for (local87 = 0; local87 < 4; local87++) {
				arg0[arg1] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 1] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 2] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 3] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg1 += 512;
			}
			return;
		}
		for (local87 = 0; local87 < 4; local87++) {
			if (local77[local81[local83++]] != 0) {
				arg0[arg1] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 1] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 2] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 3] = local73;
			}
			arg1 += 512;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!tg;Lclient!tg;Lclient!tg;B)V")
	public static void method2851(@OriginalArg(0) Class81 arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(2) Class81 arg2) {
		Static165.aClass81_1337 = arg0;
		Static165.aClass81_1339 = arg1;
		Static165.aClass81_1342 = arg2;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "()V")
	public static void method2852() {
		@Pc(4) int local4;
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < Static77.anInt1828; local1++) {
			for (local4 = 0; local4 < Static8.anInt164; local4++) {
				for (local7 = 0; local7 < Static141.anInt709; local7++) {
					Static167.aClass1_Sub17ArrayArrayArray1[local1][local4][local7] = null;
				}
			}
		}
		for (local4 = 0; local4 < Static19.anInt496; local4++) {
			for (local7 = 0; local7 < Static19.anIntArray21[local4]; local7++) {
				Static19.aClass85ArrayArray1[local4][local7] = null;
			}
			Static19.anIntArray21[local4] = 0;
		}
		for (local7 = 0; local7 < Static10.anInt233; local7++) {
			Static180.aClass75Array3[local7] = null;
		}
		Static10.anInt233 = 0;
		for (@Pc(69) int local69 = 0; local69 < Static59.aClass75Array1.length; local69++) {
			Static59.aClass75Array1[local69] = null;
		}
	}
}
