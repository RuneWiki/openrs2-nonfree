import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!wb", name = "s", descriptor = "I")
	public static int anInt6672;

	@OriginalMember(owner = "client!wb", name = "v", descriptor = "Lclient!ij;")
	public static Class93 aClass93_129;

	@OriginalMember(owner = "client!wb", name = "H", descriptor = "Lclient!ij;")
	public static Class93 aClass93_130;

	@OriginalMember(owner = "client!wb", name = "I", descriptor = "[Z")
	public static boolean[] aBooleanArray25;

	@OriginalMember(owner = "client!wb", name = "J", descriptor = "Z")
	public static boolean aBoolean579;

	@OriginalMember(owner = "client!wb", name = "K", descriptor = "Lclient!ij;")
	public static Class93 aClass93_131;

	@OriginalMember(owner = "client!wb", name = "m", descriptor = "I")
	public static int anInt6667 = 0;

	@OriginalMember(owner = "client!wb", name = "n", descriptor = "Z")
	public static boolean aBoolean577 = false;

	@OriginalMember(owner = "client!wb", name = "o", descriptor = "I")
	public static int anInt6668 = 100;

	@OriginalMember(owner = "client!wb", name = "y", descriptor = "Z")
	public static boolean aBoolean578 = true;

	@OriginalMember(owner = "client!wb", name = "F", descriptor = "Lclient!ka;")
	public static final Class109 aClass109_62 = new Class109(64);

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(IB)Lclient!wi;")
	public static Class213 method5925(@OriginalArg(0) int arg0) {
		@Pc(10) Class213 local10 = (Class213) Static1.aClass109_1.method2857((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static5.aClass93_5.method2410(arg0, 34);
		local10 = new Class213();
		if (local20 != null) {
			local10.method5983(arg0, new Class5_Sub12(local20));
		}
		Static1.aClass109_1.method2855((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILclient!ae;Lclient!ae;ZI)I")
	public static int method5926(@OriginalArg(1) Class6_Sub1 arg0, @OriginalArg(2) Class6_Sub1 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(14) int local14;
		@Pc(17) int local17;
		if (arg3 == 1) {
			local14 = arg0.anInt82;
			local17 = arg1.anInt82;
			if (!arg2) {
				if (local14 == -1) {
					local14 = 2001;
				}
				if (local17 == -1) {
					local17 = 2001;
				}
			}
			return local14 - local17;
		} else if (arg3 == 2) {
			return Static109.method1936(arg0.method90().aString24, Static41.anInt726, arg1.method90().aString24);
		} else if (arg3 == 3) {
			if (arg0.aString2.equals("-")) {
				if (arg1.aString2.equals("-")) {
					return 0;
				} else if (arg2) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg1.aString2.equals("-")) {
				return arg2 ? 1 : -1;
			} else {
				return Static109.method1936(arg0.aString2, Static41.anInt726, arg1.aString2);
			}
		} else if (arg3 == 4) {
			if (arg0.method86()) {
				return arg1.method86() ? 0 : 1;
			} else if (arg1.method86()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 5) {
			if (arg0.method85()) {
				return arg1.method85() ? 0 : 1;
			} else if (arg1.method85()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 6) {
			if (arg0.method81()) {
				return arg1.method81() ? 0 : 1;
			} else if (arg1.method81()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 7) {
			if (arg0.method84()) {
				return arg1.method84() ? 0 : 1;
			} else if (arg1.method84()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 8) {
			local14 = arg0.anInt86;
			local17 = arg1.anInt86;
			if (arg2) {
				if (local14 == 1000) {
					local14 = -1;
				}
				if (local17 == 1000) {
					local17 = -1;
				}
			} else {
				if (local14 == -1) {
					local14 = 1000;
				}
				if (local17 == -1) {
					local17 = 1000;
				}
			}
			return local14 - local17;
		} else {
			return arg0.anInt85 - arg1.anInt85;
		}
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(ZII)V")
	public static void method5927(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = Static268.aClass36_8.method640(Static8.aClass85_6.method2020(Static41.anInt726));
		@Pc(24) int local24;
		for (@Pc(18) Class5_Sub20 local18 = (Class5_Sub20) Class4_Sub3_Sub2.aClass103_139.method2756(); local18 != null; local18 = (Class5_Sub20) Class4_Sub3_Sub2.aClass103_139.method2748()) {
			local24 = Static5.method92(local18);
			if (local24 > local13) {
				local13 = local24;
			}
		}
		local13 += 8;
		local24 = Static160.anInt3181 * 16 + 21;
		@Pc(54) int local54 = arg1 - local13 / 2;
		if (Static168.anInt3376 < local54 + local13) {
			local54 = Static168.anInt3376 - local13;
		}
		if (local54 < 0) {
			local54 = 0;
		}
		@Pc(78) int local78 = arg0;
		if (Static256.anInt5066 < local24 + arg0) {
			local78 = Static256.anInt5066 - local24;
		}
		Static187.anInt3710 = local54;
		if (local78 < 0) {
			local78 = 0;
		}
		Static93.aBoolean128 = true;
		Static127.anInt2450 = Static160.anInt3181 * 16 + (Static133.aBoolean203 ? 26 : 22);
		Static141.anInt2737 = local78;
		Static334.anInt6466 = local13;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIII)I")
	public static int method5928(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg1 & 0x3;
		if (local12 == 0) {
			return arg2;
		} else if (local12 == 1) {
			return 7 - arg0;
		} else if (local12 == 2) {
			return 7 - arg2;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!rg;I)Lclient!wb;")
	public static Class7_Sub3 method5929(@OriginalArg(0) Class5_Sub12 arg0) {
		return new Class7_Sub3(arg0.method5066(), arg0.method5066(), arg0.method5066(), arg0.method5066(), arg0.method5072(), arg0.method5115());
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method5931(@OriginalArg(0) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(13) int local13 = local8.length() - 3; local13 > 0; local13 -= 3) {
			local8 = local8.substring(0, local13) + "," + local8.substring(local13);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static322.aClass85_14.method2020(Static41.anInt726) + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static249.aClass85_133.method2020(Static41.anInt726) + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}
}
