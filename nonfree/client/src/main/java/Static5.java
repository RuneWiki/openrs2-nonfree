import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
	public static int anInt155;

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
	public static int anInt156;

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
	public static int anInt159;

	@OriginalMember(owner = "client!ae", name = "h", descriptor = "Lclient!fe;")
	public static Class17 aClass17_9 = new Class17(500);

	@OriginalMember(owner = "client!ae", name = "l", descriptor = "Lclient!lc;")
	public static Class31 aClass31_71 = Static56.method1206("Your friendlist is full)3 Max of 100 for free users)1 and 200 for members");

	@OriginalMember(owner = "client!ae", name = "m", descriptor = "Lclient!lc;")
	public static Class31 aClass31_72 = null;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
	public static void method112() {
		aClass31_72 = null;
		aClass17_9 = null;
		aClass31_71 = null;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IBII)V")
	public static void method113(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
			for (local11 = 0; local11 < 8; local11++) {
				Static16.anIntArrayArrayArray1[arg0][arg2 + local7][local11 + arg1] = 0;
			}
		}
		if (arg2 > 0) {
			for (local11 = 1; local11 < 8; local11++) {
				Static16.anIntArrayArrayArray1[arg0][arg2][local11 + arg1] = Static16.anIntArrayArrayArray1[arg0][arg2 - 1][arg1 + local11];
			}
		}
		if (arg1 > 0) {
			for (local11 = 1; local11 < 8; local11++) {
				Static16.anIntArrayArrayArray1[arg0][local11 + arg2][arg1] = Static16.anIntArrayArrayArray1[arg0][arg2 + local11][arg1 - 1];
			}
		}
		if (arg2 > 0 && Static16.anIntArrayArrayArray1[arg0][arg2 - 1][arg1] != 0) {
			Static16.anIntArrayArrayArray1[arg0][arg2][arg1] = Static16.anIntArrayArrayArray1[arg0][arg2 - 1][arg1];
		} else if (arg1 > 0 && Static16.anIntArrayArrayArray1[arg0][arg2][arg1 - 1] != 0) {
			Static16.anIntArrayArrayArray1[arg0][arg2][arg1] = Static16.anIntArrayArrayArray1[arg0][arg2][arg1 - 1];
		} else if (arg2 > 0 && arg1 > 0 && Static16.anIntArrayArrayArray1[arg0][arg2 - 1][arg1 - 1] != 0) {
			Static16.anIntArrayArrayArray1[arg0][arg2][arg1] = Static16.anIntArrayArrayArray1[arg0][arg2 - 1][arg1 - 1];
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(B[B)V")
	public static void method114(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class2_Sub6 local10 = new Class2_Sub6(arg0);
		local10.anInt952 = arg0.length - 2;
		Static41.anInt1575 = local10.method627();
		Static77.aByteArrayArray10 = new byte[Static41.anInt1575][];
		Static76.anIntArray316 = new int[Static41.anInt1575];
		Static50.anIntArray74 = new int[Static41.anInt1575];
		Static91.anIntArray346 = new int[Static41.anInt1575];
		Static95.anIntArray366 = new int[Static41.anInt1575];
		local10.anInt952 = arg0.length - Static41.anInt1575 * 8 - 7;
		Static15.anInt655 = local10.method627();
		Static58.anInt1946 = local10.method627();
		@Pc(63) int local63 = (local10.method665() & 0xFF) + 1;
		for (@Pc(65) int local65 = 0; local65 < Static41.anInt1575; local65++) {
			Static95.anIntArray366[local65] = local10.method627();
		}
		for (@Pc(83) int local83 = 0; local83 < Static41.anInt1575; local83++) {
			Static76.anIntArray316[local83] = local10.method627();
		}
		for (@Pc(97) int local97 = 0; local97 < Static41.anInt1575; local97++) {
			Static50.anIntArray74[local97] = local10.method627();
		}
		for (@Pc(113) int local113 = 0; local113 < Static41.anInt1575; local113++) {
			Static91.anIntArray346[local113] = local10.method627();
		}
		local10.anInt952 = arg0.length + 3 - Static41.anInt1575 * 8 - local63 * 3 - 7;
		Static67.anIntArray301 = new int[local63];
		for (@Pc(147) int local147 = 1; local147 < local63; local147++) {
			Static67.anIntArray301[local147] = local10.method639();
			if (Static67.anIntArray301[local147] == 0) {
				Static67.anIntArray301[local147] = 1;
			}
		}
		local10.anInt952 = 0;
		for (@Pc(177) int local177 = 0; local177 < Static41.anInt1575; local177++) {
			@Pc(183) int local183 = Static50.anIntArray74[local177];
			@Pc(187) int local187 = Static91.anIntArray346[local177];
			@Pc(191) int local191 = local187 * local183;
			@Pc(194) byte[] local194 = new byte[local191];
			Static77.aByteArrayArray10[local177] = local194;
			@Pc(202) int local202 = local10.method665();
			@Pc(214) int local214;
			if (local202 == 0) {
				for (local214 = 0; local214 < local191; local214++) {
					local194[local214] = local10.method673();
				}
			} else if (local202 == 1) {
				for (local214 = 0; local214 < local183; local214++) {
					for (@Pc(218) int local218 = 0; local218 < local187; local218++) {
						local194[local214 + local218 * local183] = local10.method673();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V")
	public static void method115() {
		Static30.aClass17_50.method782();
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)Z")
	public static boolean method116(@OriginalArg(1) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}
}
