import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "I")
	public static int anInt2905;

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "Lclient!ei;")
	public static Class25 aClass25_1;

	@OriginalMember(owner = "client!kl", name = "f", descriptor = "[I")
	public static int[] anIntArray236 = new int[2];

	@OriginalMember(owner = "client!kl", name = "g", descriptor = "[I")
	public static int[] anIntArray237 = new int[2048];

	@OriginalMember(owner = "client!kl", name = "h", descriptor = "I")
	public static int anInt2908 = -1;

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(II)Lclient!lg;")
	public static Class97 method2340(@OriginalArg(1) int arg0) {
		@Pc(12) int local12 = arg0 & 0xFFFF;
		@Pc(16) int local16 = arg0 >> 16;
		if (Static217.aClass97ArrayArray1[local16] == null || Static217.aClass97ArrayArray1[local16][local12] == null) {
			@Pc(30) boolean local30 = Static48.method951(local16);
			if (!local30) {
				return null;
			}
		}
		return Static217.aClass97ArrayArray1[local16][local12];
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(II)I")
	public static int method2341(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(B)V")
	public static void method2342() {
		@Pc(3) int local3 = Static139.anInt2754;
		@Pc(5) int local5 = Static242.anInt4776;
		@Pc(11) int local11 = Static16.anInt356;
		@Pc(13) int local13 = Static43.anInt870;
		if (Static251.aBoolean330) {
			Static87.method1464(local5, local3, local11, local13, 6116423);
			Static87.method1464(local5 + 1, local3 - -1, local11 - 2, 16, 0);
			Static87.method1452(local5 + 1, local3 + 18, local11 - 2, local13 + -19, 0);
		} else {
			Static258.method4031(local5, local3, local11, local13, 6116423);
			Static258.method4031(local5 + 1, local3 + 1, local11 - 2, 16, 0);
			Static258.method4025(local5 + 1, local3 + 18, local11 - 2, local13 + -19, 0);
		}
		Static86.aClass4_Sub2_Sub9_3.method4105(Static187.aString131, local5 + 3, local3 + 14, 6116423, -1);
		@Pc(101) int local101 = Static79.anInt1661;
		@Pc(103) int local103 = Static178.anInt3603;
		for (@Pc(105) int local105 = 0; local105 < Static286.anInt5602; local105++) {
			@Pc(120) int local120 = local3 + (Static286.anInt5602 + -1 - local105) * 15 + 31;
			@Pc(122) int local122 = 16777215;
			if (local5 < local101 && local101 < local11 + local5 && local120 - 13 < local103 && local120 + 3 > local103) {
				local122 = 16776960;
			}
			Static86.aClass4_Sub2_Sub9_3.method4105(Static149.method2347(local105), local5 + 3, local120, local122, 0);
		}
		Static210.method3316(Static242.anInt4776, Static16.anInt356, Static43.anInt870, Static139.anInt2754);
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)V")
	public static void method2343() {
		if (Static165.aBoolean213) {
			return;
		}
		Static82.aBoolean100 = true;
		Static165.aBoolean213 = true;
		if (Static115.aBoolean148) {
			Static276.aFloat156 = (int) Static276.aFloat156 - 17 & 0xFFFFFFF0;
		} else {
			Static12.aFloat9 += (-12.0F - Static12.aFloat9) / 2.0F;
		}
	}
}
