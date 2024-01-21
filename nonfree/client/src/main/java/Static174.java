import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!wa", name = "g", descriptor = "Lclient!cf;")
	public static Class12 aClass12_1;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "Lclient!sg;")
	private static Class77 aClass77_1514 = Static146.method2172("Loaded update list");

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "Lclient!cb;")
	public static Class10 aClass10_114 = new Class10();

	@OriginalMember(owner = "client!wa", name = "i", descriptor = "I")
	public static int anInt4449 = 0;

	@OriginalMember(owner = "client!wa", name = "j", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1515 = aClass77_1514;

	@OriginalMember(owner = "client!wa", name = "k", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1516 = Static146.method2172("::fpson");

	@OriginalMember(owner = "client!wa", name = "l", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1517 = Static146.method2172("<img=0>");

	@OriginalMember(owner = "client!wa", name = "m", descriptor = "I")
	public static int anInt4450 = 0;

	@OriginalMember(owner = "client!wa", name = "n", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1518 = Static146.method2172("<col=ffffff> )4 ");

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
	public static void method2939() {
		@Pc(4) int local4 = Static74.aClass2_Sub18_Sub1_1.method2405(8);
		@Pc(13) int local13;
		if (Static124.anInt3042 > local4) {
			for (local13 = local4; local13 < Static124.anInt3042; local13++) {
				Static33.anIntArray149[Static72.anInt1932++] = Static177.anIntArray632[local13];
			}
		}
		if (Static124.anInt3042 < local4) {
			throw new RuntimeException("gppov1");
		}
		Static124.anInt3042 = 0;
		for (local13 = 0; local13 < local4; local13++) {
			@Pc(54) int local54 = Static177.anIntArray632[local13];
			@Pc(58) Class2_Sub2_Sub1_Sub6_Sub1 local58 = Static58.aClass2_Sub2_Sub1_Sub6_Sub1Array1[local54];
			@Pc(63) int local63 = Static74.aClass2_Sub18_Sub1_1.method2405(1);
			if (local63 == 0) {
				Static177.anIntArray632[Static124.anInt3042++] = local54;
				local58.anInt4401 = Static143.anInt3513;
			} else {
				@Pc(82) int local82 = Static74.aClass2_Sub18_Sub1_1.method2405(2);
				if (local82 == 0) {
					Static177.anIntArray632[Static124.anInt3042++] = local54;
					local58.anInt4401 = Static143.anInt3513;
					Static6.anIntArray25[anInt4449++] = local54;
				} else {
					@Pc(128) int local128;
					@Pc(138) int local138;
					if (local82 == 1) {
						Static177.anIntArray632[Static124.anInt3042++] = local54;
						local58.anInt4401 = Static143.anInt3513;
						local128 = Static74.aClass2_Sub18_Sub1_1.method2405(3);
						local58.method2911(local128, false);
						local138 = Static74.aClass2_Sub18_Sub1_1.method2405(1);
						if (local138 == 1) {
							Static6.anIntArray25[anInt4449++] = local54;
						}
					} else if (local82 == 2) {
						Static177.anIntArray632[Static124.anInt3042++] = local54;
						local58.anInt4401 = Static143.anInt3513;
						local128 = Static74.aClass2_Sub18_Sub1_1.method2405(3);
						local58.method2911(local128, true);
						local138 = Static74.aClass2_Sub18_Sub1_1.method2405(3);
						local58.method2911(local138, true);
						@Pc(193) int local193 = Static74.aClass2_Sub18_Sub1_1.method2405(1);
						if (local193 == 1) {
							Static6.anIntArray25[anInt4449++] = local54;
						}
					} else if (local82 == 3) {
						Static33.anIntArray149[Static72.anInt1932++] = local54;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIII)Z")
	public static boolean method2940(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 >> 14 & 0x7FFF;
		@Pc(18) int local18 = Static172.aClass60_1.method2059(Static54.anInt1472, arg1, arg0, arg2);
		if (local18 == -1) {
			return false;
		}
		@Pc(27) int local27 = local18 & 0x1F;
		@Pc(33) int local33 = local18 >> 6 & 0x3;
		if (local27 == 10 || local27 == 11 || local27 == 22) {
			@Pc(76) Class2_Sub2_Sub5 local76 = Static121.method2129(local7);
			@Pc(92) int local92;
			@Pc(89) int local89;
			if (local33 == 0 || local33 == 2) {
				local89 = local76.anInt538;
				local92 = local76.anInt520;
			} else {
				local89 = local76.anInt520;
				local92 = local76.anInt538;
			}
			@Pc(103) int local103 = local76.anInt517;
			if (local33 != 0) {
				local103 = (local103 << local33 & 0xF) + (local103 >> 4 - local33);
			}
			Static142.method2411(true, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray622[0], arg1, 2, local89, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray620[0], 0, local103, 0, arg0, local92);
		} else {
			Static142.method2411(true, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray622[0], arg1, 2, 0, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray620[0], local27 + 1, 0, local33, arg0, 0);
		}
		Static58.anInt1518 = Static156.anInt3884;
		Static2.anInt97 = 2;
		Static94.anInt2407 = 0;
		Static105.anInt2571 = Static38.anInt1113;
		return true;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(III)Z")
	public static boolean method2941(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 >> arg1 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)V")
	public static void method2942() {
		aClass10_114 = null;
		aClass77_1514 = null;
		aClass77_1518 = null;
		aClass77_1517 = null;
		aClass12_1 = null;
		aClass77_1516 = null;
		aClass77_1515 = null;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(BLclient!sg;Lclient!sg;I)V")
	public static void method2943(@OriginalArg(1) Class77 arg0, @OriginalArg(2) Class77 arg1, @OriginalArg(3) int arg2) {
		Static98.method1783(arg0, arg2, null, arg1);
	}
}
