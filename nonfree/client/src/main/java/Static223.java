import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!od", name = "q", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray29;

	@OriginalMember(owner = "client!od", name = "y", descriptor = "Lclient!dp;")
	public static Class53 aClass53_104;

	@OriginalMember(owner = "client!od", name = "o", descriptor = "Lclient!fg;")
	public static final Class70 aClass70_74 = new Class70(16);

	@OriginalMember(owner = "client!od", name = "v", descriptor = "[I")
	public static final int[] anIntArray475 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIBZ)V")
	public static void method3939(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		if (arg0 < 1) {
			arg0 = 1;
		}
		if (arg3 < 1) {
			arg3 = 1;
		}
		@Pc(21) int local21 = arg3 - 334;
		if (local21 < 0) {
			local21 = 0;
		} else if (local21 > 100) {
			local21 = 100;
		}
		@Pc(46) int local46 = Static133.aShort31 + local21 * (Static291.aShort83 - Static133.aShort31) / 100;
		if (Static141.aShort32 > local46) {
			local46 = Static141.aShort32;
		} else if (Static61.aShort10 < local46) {
			local46 = Static61.aShort10;
		}
		@Pc(72) int local72 = arg3 * local46 * 512 / (arg0 * 334);
		@Pc(109) int local109;
		@Pc(116) int local116;
		@Pc(84) short local84;
		if (local72 < Static6.aShort1) {
			local84 = Static6.aShort1;
			local46 = arg0 * 334 * local84 / (arg3 * 512);
			if (local46 > Static61.aShort10) {
				local46 = Static61.aShort10;
				local109 = local46 * arg3 * 512 / (local84 * 334);
				local116 = (arg0 - local109) / 2;
				if (arg4) {
					Static289.aClass81_7.method3032();
					Static289.aClass81_7.method3017(arg3, -16777216, local116, arg2, arg1);
					Static289.aClass81_7.method3017(arg3, -16777216, local116, arg2 + arg0 - local116, arg1);
				}
				arg0 -= local116 * 2;
				arg2 += local116;
			}
		} else if (local72 > Static169.aShort42) {
			local84 = Static169.aShort42;
			local46 = arg0 * 334 * local84 / (arg3 * 512);
			if (local46 < Static141.aShort32) {
				local46 = Static141.aShort32;
				local109 = local84 * 334 * arg0 / (local46 * 512);
				local116 = (arg3 - local109) / 2;
				if (arg4) {
					Static289.aClass81_7.method3032();
					Static289.aClass81_7.method3017(local116, -16777216, arg0, arg2, arg1);
					Static289.aClass81_7.method3017(local116, -16777216, arg0, arg2, arg3 + arg1 - local116);
				}
				arg1 += local116;
				arg3 -= local116 * 2;
			}
		}
		Static250.anInt490 = (short) arg0;
		Static313.anInt5841 = arg3 * local46 / 334;
		Static147.anInt2723 = (short) arg3;
		Static238.anInt5098 = arg2;
		Static220.anInt4055 = arg1;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IB)V")
	public static void method3940(@OriginalArg(0) int arg0) {
		@Pc(10) Class48 local10 = Static88.aClass48_1;
		synchronized (Static88.aClass48_1) {
			Static5.anInt94 = arg0;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ILclient!dp;)I")
	public static int method3941(@OriginalArg(1) Class53 arg0) {
		@Pc(10) int local10 = 0;
		if (arg0.method1026(Static137.anInt2494)) {
			local10++;
		}
		if (arg0.method1026(Static15.anInt278)) {
			local10++;
		}
		return local10;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(II)V")
	public static void method3943(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static69.aBooleanArray6[arg0]) {
			return;
		}
		Static99.aClass53_153.method1019(arg0);
		if (Static81.aClass132ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(25) boolean local25 = true;
		for (@Pc(35) int local35 = 0; local35 < Static81.aClass132ArrayArray1[arg0].length; local35++) {
			if (Static81.aClass132ArrayArray1[arg0][local35] != null) {
				if (Static81.aClass132ArrayArray1[arg0][local35].anInt3524 == 2) {
					local25 = false;
				} else {
					Static81.aClass132ArrayArray1[arg0][local35] = null;
				}
			}
		}
		if (local25) {
			Static81.aClass132ArrayArray1[arg0] = null;
		}
		Static69.aBooleanArray6[arg0] = false;
	}
}
