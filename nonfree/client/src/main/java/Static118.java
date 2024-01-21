import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!ub", name = "o", descriptor = "Lclient!jb;")
	public static Class25 aClass25_32;

	@OriginalMember(owner = "client!ub", name = "n", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1350 = Static59.method1195("Choose Option");

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1345 = aClass60_1350;

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1346 = Static59.method1195("flash1:");

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1347 = Static59.method1195(" )2> <col=00ffff>");

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "[I")
	public static int[] anIntArray343 = new int[2000];

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1348 = aClass60_1346;

	@OriginalMember(owner = "client!ub", name = "i", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1349 = aClass60_1346;

	@OriginalMember(owner = "client!ub", name = "m", descriptor = "I")
	public static int anInt3217 = 1;

	@OriginalMember(owner = "client!ub", name = "q", descriptor = "Z")
	public static boolean aBoolean115 = false;

	@OriginalMember(owner = "client!ub", name = "r", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1351 = Static59.method1195("Musik)2Engine vorbereitet)3");

	@OriginalMember(owner = "client!ub", name = "t", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1352 = Static59.method1195("p11_full");

	@OriginalMember(owner = "client!ub", name = "u", descriptor = "Z")
	public static boolean aBoolean116 = false;

	@OriginalMember(owner = "client!ub", name = "w", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1353 = Static59.method1195("mapscene");

	@OriginalMember(owner = "client!ub", name = "x", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1354 = Static59.method1195("Wen m-Ochten Sie von der Liste entfernen?");

	@OriginalMember(owner = "client!ub", name = "y", descriptor = "I")
	public static int anInt3220 = 0;

	@OriginalMember(owner = "client!ub", name = "z", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1355 = Static59.method1195("Versteckt");

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
	public static void method2136() {
		aClass25_32 = null;
		aClass60_1351 = null;
		aClass60_1346 = null;
		aClass60_1350 = null;
		aClass60_1348 = null;
		anIntArray343 = null;
		aClass60_1352 = null;
		aClass60_1349 = null;
		aClass60_1354 = null;
		aClass60_1353 = null;
		aClass60_1345 = null;
		aClass60_1347 = null;
		aClass60_1355 = null;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IILclient!qf;ILclient!qf;ZI)V")
	public static void method2137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class60 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class60 arg4, @OriginalArg(6) int arg5) {
		if (Static22.anInt872 >= 500) {
			return;
		}
		if (arg2.method1836() <= 0) {
			Static68.aClass60Array12[Static22.anInt872] = arg4;
		} else {
			Static68.aClass60Array12[Static22.anInt872] = Static60.method1211(new Class60[] { arg4, Static84.aClass60_1113, arg2 });
		}
		Static2.anIntArray22[Static22.anInt872] = arg1;
		Static49.anIntArray188[Static22.anInt872] = arg5;
		Static89.anIntArray279[Static22.anInt872] = arg0;
		Static115.anIntArray339[Static22.anInt872] = arg3;
		Static22.anInt872++;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!jb;Lclient!jb;Lclient!jb;ZLclient!ud;)Z")
	public static boolean method2138(@OriginalArg(0) Class25 arg0, @OriginalArg(1) Class25 arg1, @OriginalArg(2) Class25 arg2, @OriginalArg(4) Class3_Sub2_Sub4 arg3) {
		Static30.aClass3_Sub2_Sub4_1 = arg3;
		Static85.aClass25_26 = arg0;
		aClass25_32 = arg2;
		Static101.aClass25_30 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)V")
	public static void method2139() {
		Static6.aClass39_1.method2143();
		for (@Pc(15) int local15 = 0; local15 < 32; local15++) {
			Static70.aLongArray3[local15] = 0L;
		}
		for (@Pc(29) int local29 = 0; local29 < 32; local29++) {
			Static67.aLongArray2[local29] = 0L;
		}
		Static63.anInt2914 = 0;
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)I")
	public static int method2140() {
		@Pc(13) int local13 = 3;
		if (Static63.anInt2908 < 310) {
			@Pc(22) int local22 = Static71.anInt1493 >> 7;
			@Pc(27) int local27 = Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anInt1494 >> 7;
			@Pc(32) int local32 = Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anInt1524 >> 7;
			@Pc(36) int local36 = Static98.anInt2824 >> 7;
			@Pc(44) int local44;
			if (local36 < local27) {
				local44 = local27 - local36;
			} else {
				local44 = local36 - local27;
			}
			@Pc(59) int local59;
			if (local32 <= local22) {
				local59 = local22 - local32;
			} else {
				local59 = local32 - local22;
			}
			if ((Static60.aByteArrayArrayArray4[Static119.anInt3243][local22][local36] & 0x4) != 0) {
				local13 = Static119.anInt3243;
			}
			@Pc(86) int local86;
			@Pc(88) int local88;
			if (local59 > local44) {
				local86 = local44 * 65536 / local59;
				local88 = 32768;
				while (local22 != local32) {
					if (local22 < local32) {
						local22++;
					} else if (local32 < local22) {
						local22--;
					}
					if ((Static60.aByteArrayArrayArray4[Static119.anInt3243][local22][local36] & 0x4) != 0) {
						local13 = Static119.anInt3243;
					}
					local88 += local86;
					if (local88 >= 65536) {
						if (local27 > local36) {
							local36++;
						} else if (local27 < local36) {
							local36--;
						}
						local88 -= 65536;
						if ((Static60.aByteArrayArrayArray4[Static119.anInt3243][local22][local36] & 0x4) != 0) {
							local13 = Static119.anInt3243;
						}
					}
				}
			} else {
				local88 = 32768;
				local86 = local59 * 65536 / local44;
				while (local36 != local27) {
					local88 += local86;
					if (local36 < local27) {
						local36++;
					} else if (local27 < local36) {
						local36--;
					}
					if ((Static60.aByteArrayArrayArray4[Static119.anInt3243][local22][local36] & 0x4) != 0) {
						local13 = Static119.anInt3243;
					}
					if (local88 >= 65536) {
						if (local22 < local32) {
							local22++;
						} else if (local22 > local32) {
							local22--;
						}
						local88 -= 65536;
						if ((Static60.aByteArrayArrayArray4[Static119.anInt3243][local22][local36] & 0x4) != 0) {
							local13 = Static119.anInt3243;
						}
					}
				}
			}
		}
		if ((Static60.aByteArrayArrayArray4[Static119.anInt3243][Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anInt1524 >> 7][Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anInt1494 >> 7] & 0x4) != 0) {
			local13 = Static119.anInt3243;
		}
		return local13;
	}
}
