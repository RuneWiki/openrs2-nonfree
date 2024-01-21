import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!te", name = "H", descriptor = "J")
	public static long aLong118;

	@OriginalMember(owner = "client!te", name = "p", descriptor = "Lclient!cd;")
	private static Class10 aClass10_1455 = Static51.method932("You can(Wt add yourself to your own friend list)3");

	@OriginalMember(owner = "client!te", name = "C", descriptor = "Z")
	public static boolean aBoolean149 = false;

	@OriginalMember(owner = "client!te", name = "D", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1456 = aClass10_1455;

	@OriginalMember(owner = "client!te", name = "F", descriptor = "Lclient!dh;")
	public static Class18 aClass18_10 = new Class18(4096);

	@OriginalMember(owner = "client!te", name = "K", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1457 = Static51.method932("<col=c0ff00>");

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Z)V")
	public static void method2390() {
		if (Static38.aClass82_1 != null) {
			Static38.aClass82_1.method2633();
		}
		if (Static71.aClass82_2 != null) {
			Static71.aClass82_2.method2633();
		}
	}

	@OriginalMember(owner = "client!te", name = "c", descriptor = "(I)V")
	public static void method2391() {
		aClass10_1456 = null;
		aClass10_1455 = null;
		aClass18_10 = null;
		aClass10_1457 = null;
	}

	@OriginalMember(owner = "client!te", name = "d", descriptor = "(I)V")
	public static void method2392() {
		@Pc(5) Class86 local5 = Static142.aClass86_1;
		synchronized (Static142.aClass86_1) {
			Static95.anInt2252 = Static130.anInt2897;
			Static72.anInt1723 = Static158.anInt3381;
			Static61.anInt3635 = Static121.anInt2746;
			Static40.anInt976 = Static139.anInt3077;
			Static62.anInt1534 = Static65.anInt1586;
			Static40.anInt977 = Static15.anInt409;
			Static130.aLong97 = Static60.aLong52;
			Static139.anInt3077 = 0;
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(I[B)V")
	public static void method2393(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class2_Sub11 local10 = new Class2_Sub11(arg0);
		local10.anInt2077 = arg0.length - 2;
		Static73.anInt1747 = local10.method1456();
		Static14.anIntArray26 = new int[Static73.anInt1747];
		Static96.anIntArray401 = new int[Static73.anInt1747];
		Static115.aByteArrayArray9 = new byte[Static73.anInt1747][];
		Static98.anIntArray240 = new int[Static73.anInt1747];
		Static68.anIntArray178 = new int[Static73.anInt1747];
		local10.anInt2077 = arg0.length - Static73.anInt1747 * 8 - 7;
		Static148.anInt3209 = local10.method1456();
		Static171.anInt3704 = local10.method1456();
		@Pc(62) int local62 = (local10.method1461() & 0xFF) + 1;
		for (@Pc(64) int local64 = 0; local64 < Static73.anInt1747; local64++) {
			Static96.anIntArray401[local64] = local10.method1456();
		}
		for (@Pc(82) int local82 = 0; local82 < Static73.anInt1747; local82++) {
			Static14.anIntArray26[local82] = local10.method1456();
		}
		for (@Pc(100) int local100 = 0; local100 < Static73.anInt1747; local100++) {
			Static68.anIntArray178[local100] = local10.method1456();
		}
		for (@Pc(118) int local118 = 0; local118 < Static73.anInt1747; local118++) {
			Static98.anIntArray240[local118] = local10.method1456();
		}
		local10.anInt2077 = arg0.length - (local62 - 1) * 3 - Static73.anInt1747 * 8 - 7;
		Static118.anIntArray284 = new int[local62];
		for (@Pc(156) int local156 = 1; local156 < local62; local156++) {
			Static118.anIntArray284[local156] = local10.method1436();
			if (Static118.anIntArray284[local156] == 0) {
				Static118.anIntArray284[local156] = 1;
			}
		}
		local10.anInt2077 = 0;
		for (@Pc(185) int local185 = 0; local185 < Static73.anInt1747; local185++) {
			@Pc(191) int local191 = Static68.anIntArray178[local185];
			@Pc(195) int local195 = Static98.anIntArray240[local185];
			@Pc(199) int local199 = local191 * local195;
			@Pc(202) byte[] local202 = new byte[local199];
			Static115.aByteArrayArray9[local185] = local202;
			@Pc(210) int local210 = local10.method1461();
			@Pc(217) int local217;
			if (local210 == 0) {
				for (local217 = 0; local217 < local199; local217++) {
					local202[local217] = local10.method1463();
				}
			} else if (local210 == 1) {
				for (local217 = 0; local217 < local191; local217++) {
					for (@Pc(244) int local244 = 0; local244 < local195; local244++) {
						local202[local191 * local244 + local217] = local10.method1463();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "e", descriptor = "(I)V")
	public static void method2394() {
		Static14.anIntArray26 = null;
		Static98.anIntArray240 = null;
		Static115.aByteArrayArray9 = null;
		Static118.anIntArray284 = null;
		Static68.anIntArray178 = null;
		Static96.anIntArray401 = null;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ILclient!kh;ZLclient!kh;I)Lclient!aa;")
	public static Class2_Sub1_Sub1 method2395(@OriginalArg(1) Class29 arg0, @OriginalArg(3) Class29 arg1, @OriginalArg(4) int arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(12) int[] local12 = arg1.method1022(arg2);
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(24) byte[] local24 = arg1.method1033(local12[local14], arg2);
			if (local24 == null) {
				local7 = false;
			} else {
				@Pc(44) int local44 = local24[1] & 0xFF | (local24[0] & 0xFF) << 8;
				@Pc(52) byte[] local52 = arg0.method1033(0, local44);
				if (local52 == null) {
					local7 = false;
				}
			}
		}
		if (!local7) {
			return null;
		}
		try {
			return new Class2_Sub1_Sub1(arg1, arg0, arg2, false);
		} catch (@Pc(82) Exception local82) {
			return null;
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IBI)I")
	public static int method2396(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class2_Sub24 local15 = (Class2_Sub24) Static179.aClass18_13.method683((long) arg1);
		if (local15 == null) {
			return 0;
		} else if (arg0 >= 0 && local15.anIntArray395.length > arg0) {
			return local15.anIntArray395[arg0];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!kh;IZIIIB)V")
	public static void method2397(@OriginalArg(0) Class29 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		Static111.aClass29_49 = arg0;
		Static92.aBoolean91 = false;
		Static83.anInt1906 = arg3;
		Static123.anInt2781 = 2;
		Static70.anInt1667 = arg2;
		Static55.anInt1427 = arg1;
		Static168.anInt3655 = 1;
	}
}
