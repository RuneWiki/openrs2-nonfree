import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!cc", name = "ab", descriptor = "[I")
	public static int[] anIntArray75;

	@OriginalMember(owner = "client!cc", name = "B", descriptor = "I")
	public static int anInt451 = 0;

	@OriginalMember(owner = "client!cc", name = "F", descriptor = "I")
	public static int anInt454 = -1;

	@OriginalMember(owner = "client!cc", name = "H", descriptor = "Lclient!rb;")
	public static Class60 aClass60_25 = new Class60(20);

	@OriginalMember(owner = "client!cc", name = "M", descriptor = "Lclient!sc;")
	public static Class66 aClass66_284 = Static106.method1849("");

	@OriginalMember(owner = "client!cc", name = "I", descriptor = "Lclient!sc;")
	public static Class66 aClass66_283 = aClass66_284;

	@OriginalMember(owner = "client!cc", name = "S", descriptor = "Z")
	public static boolean aBoolean18 = false;

	@OriginalMember(owner = "client!cc", name = "V", descriptor = "I")
	public static int anInt462 = 0;

	@OriginalMember(owner = "client!cc", name = "X", descriptor = "I")
	public static int anInt463 = 0;

	@OriginalMember(owner = "client!cc", name = "Y", descriptor = "Lclient!sc;")
	public static Class66 aClass66_286 = Static106.method1849(" zuerst von Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!cc", name = "Z", descriptor = "Lclient!sc;")
	public static Class66 aClass66_287 = Static106.method1849("Lade Schrifts-=tze )2 ");

	@OriginalMember(owner = "client!cc", name = "bb", descriptor = "[I")
	public static int[] anIntArray76 = new int[100];

	@OriginalMember(owner = "client!cc", name = "cb", descriptor = "I")
	public static int anInt464 = 0;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "([Lclient!da;IIB[BII)V")
	public static void method395(@OriginalArg(0) Class13[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11;
		for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 64; local7++) {
				for (local11 = 0; local11 < 64; local11++) {
					if (local7 + arg5 > 0 && local7 + arg5 < 103 && local11 + arg1 > 0 && arg1 + local11 < 103) {
						arg0[local3].anIntArrayArray11[arg5 + local7][local11 + arg1] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(83) Class1_Sub12 local83 = new Class1_Sub12(arg3);
		for (local11 = 0; local11 < 4; local11++) {
			for (@Pc(102) int local102 = 0; local102 < 64; local102++) {
				for (@Pc(106) int local106 = 0; local106 < 64; local106++) {
					Static86.method1605(arg2, arg5 + local102, local106 + arg1, 0, arg4, local11, local83);
				}
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIII)V")
	public static void method396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static104.anInt2550 == 1) {
			Static134.aClass1_Sub1_Sub2_Sub1Array71[Static56.anInt1780 / 100].method250(Static131.anInt2694 - 8, Static14.anInt477 + -8);
		}
		if (Static104.anInt2550 == 2) {
			Static134.aClass1_Sub1_Sub2_Sub1Array71[Static56.anInt1780 / 100 + 4].method250(Static131.anInt2694 - 8, Static14.anInt477 - 8);
		}
		Static18.method472();
		if (!Static126.aBoolean119) {
			return;
		}
		@Pc(45) int local45 = arg2 + 20;
		@Pc(47) int local47 = 16776960;
		@Pc(53) int local53 = arg0 + 512 - 5;
		Static114.aClass1_Sub1_Sub2_Sub2_Sub1_4.method776(Static41.method897(new Class66[] { Static59.aClass66_958, Static88.method1632(Static54.anInt1752) }), local53, local45, 16776960, -1);
		@Pc(75) Runtime local75 = Runtime.getRuntime();
		@Pc(76) int local76 = local45 + 15;
		@Pc(86) int local86 = (int) ((local75.totalMemory() - local75.freeMemory()) / 1024L);
		if (local86 > 32768 && Static87.aBoolean96) {
			local47 = 16711680;
		}
		if (local86 > 65536 && !Static87.aBoolean96) {
			local47 = 16711680;
		}
		Static114.aClass1_Sub1_Sub2_Sub2_Sub1_4.method776(Static41.method897(new Class66[] { Static32.aClass66_491, Static88.method1632(local86), Static84.aClass66_1198 }), local53, local76, local47, -1);
		local45 = local76 + 15;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIIII)V")
	public static void method397(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(13) int local13 = 2048 - arg2 & 0x7FF;
		@Pc(15) int local15 = 0;
		@Pc(22) int local22 = 2048 - arg3 & 0x7FF;
		@Pc(24) int local24 = arg1;
		@Pc(26) int local26 = 0;
		@Pc(35) int local35;
		@Pc(39) int local39;
		@Pc(50) int local50;
		if (local22 != 0) {
			local35 = Class1_Sub1_Sub2_Sub4.anIntArray399[local22];
			local39 = Class1_Sub1_Sub2_Sub4.anIntArray397[local22];
			local50 = local39 * 0 - arg1 * local35 >> 16;
			local24 = arg1 * local39 + local35 * 0 >> 16;
			local26 = local50;
		}
		if (local13 != 0) {
			local39 = Class1_Sub1_Sub2_Sub4.anIntArray397[local13];
			local35 = Class1_Sub1_Sub2_Sub4.anIntArray399[local13];
			local50 = local35 * local24 + local39 * 0 >> 16;
			local24 = local39 * local24 - local35 * 0 >> 16;
			local15 = local50;
		}
		Static51.anInt1580 = arg0 - local26;
		Static1.anInt76 = arg2;
		Static131.anInt2696 = arg3;
		Static122.anInt2830 = arg4 - local15;
		Static1.anInt70 = arg5 - local24;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)Z")
	public static boolean method398(@OriginalArg(1) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZJ)V")
	public static void method399(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static87.method1626(arg0 - 1L);
			Static87.method1626(1L);
		} else {
			Static87.method1626(arg0);
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V")
	public static void method400() {
		anIntArray75 = null;
		aClass60_25 = null;
		aClass66_286 = null;
		aClass66_283 = null;
		aClass66_287 = null;
		anIntArray76 = null;
		aClass66_284 = null;
	}
}
