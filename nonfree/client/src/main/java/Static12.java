import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!ak", name = "I", descriptor = "Ljava/lang/String;")
	public static String aString14 = "Started 3d Library";

	@OriginalMember(owner = "client!ak", name = "K", descriptor = "J")
	public static long aLong8 = 0L;

	@OriginalMember(owner = "client!ak", name = "P", descriptor = "Ljava/lang/String;")
	public static String aString15 = "Loading interfaces - ";

	@OriginalMember(owner = "client!ak", name = "T", descriptor = "Lclient!jn;")
	public static Class8_Sub15 aClass8_Sub15_1 = new Class8_Sub15(0, 0);

	@OriginalMember(owner = "client!ak", name = "U", descriptor = "I")
	public static int anInt286 = 0;

	@OriginalMember(owner = "client!ak", name = "g", descriptor = "(I)[Lclient!me;")
	public static Class43[] method211() {
		@Pc(8) Class43[] local8 = new Class43[Static288.anInt1353];
		for (@Pc(10) int local10 = 0; local10 < Static288.anInt1353; local10++) {
			if (Static116.aBoolean188) {
				local8[local10] = new Class43_Sub1(Static97.anInt1999, Static290.anInt5656, Static25.anIntArray45[local10], Static225.anIntArray345[local10], Static92.anIntArray130[local10], Static135.anIntArray225[local10], Static232.aByteArrayArray15[local10], Static147.anIntArray236);
			} else {
				local8[local10] = new Class43_Sub2(Static97.anInt1999, Static290.anInt5656, Static25.anIntArray45[local10], Static225.anIntArray345[local10], Static92.anIntArray130[local10], Static135.anIntArray225[local10], Static232.aByteArrayArray15[local10], Static147.anIntArray236);
			}
		}
		Static147.method2386();
		return local8;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIB)V")
	public static void method212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static286.anInt5464 < 100) {
			Static33.method530();
		}
		if (Static116.aBoolean188) {
			Static126.method1993(arg3, arg0, arg3 + arg1, arg2 + arg0);
		} else {
			Static103.method1680(arg3, arg0, arg3 + arg1, arg0 + arg2);
		}
		@Pc(51) int local51;
		@Pc(64) int local64;
		if (Static286.anInt5464 < 100) {
			local51 = arg1 / 2 + arg3;
			local64 = arg0 + arg2 / 2 - 38;
			if (Static116.aBoolean188) {
				Static126.method1994(arg3, arg0, arg1, arg2, 0);
				Static126.method2004(local51 - 152, local64, 304, 34, 9179409);
				Static126.method2004(local51 - 151, local64 + 1, 302, 32, 0);
				Static126.method1994(local51 - 150, local64 + 2, Static286.anInt5464 * 3, 30, 9179409);
				Static126.method1994(Static286.anInt5464 * 3 + local51 - 150, local64 + 2, 300 - Static286.anInt5464 * 3, 30, 0);
			} else {
				Static103.method1664(arg3, arg0, arg1, arg2, 0);
				Static103.method1669(local51 - 152, local64, 304, 34, 9179409);
				Static103.method1669(local51 - 151, local64 + 1, 302, 32, 0);
				Static103.method1664(local51 - 150, local64 + 2, Static286.anInt5464 * 3, 30, 9179409);
				Static103.method1664(local51 + Static286.anInt5464 * 3 - 150, local64 + 2, 300 - Static286.anInt5464 * 3, 30, 0);
			}
			Static229.aClass8_Sub1_Sub5_3.method2040(Static188.aString133, local51, local64 + 20, 16777215, -1);
			return;
		}
		Static169.anInt3408 = Static52.anInt1147 - (int) ((float) arg1 / Static224.aFloat47);
		Static285.anInt5596 = (int) ((float) (arg2 * 2) / Static224.aFloat47);
		Static73.anInt1576 = Static218.anInt4483 - (int) ((float) arg2 / Static224.aFloat47);
		Static162.anInt3357 = (int) ((float) (arg1 * 2) / Static224.aFloat47);
		@Pc(232) int local232 = Static52.anInt1147 - (int) ((float) arg1 / Static224.aFloat47);
		local51 = Static218.anInt4483 - (int) ((float) arg2 / Static224.aFloat47);
		local64 = (int) ((float) arg1 / Static224.aFloat47) + Static52.anInt1147;
		@Pc(257) int local257 = (int) ((float) arg2 / Static224.aFloat47) + Static218.anInt4483;
		if (Static116.aBoolean188) {
			if (Static160.aClass8_Sub1_Sub7_Sub1_4 == null || arg1 != Static160.aClass8_Sub1_Sub7_Sub1_4.anInt3602 || arg2 != Static160.aClass8_Sub1_Sub7_Sub1_4.anInt3603) {
				Static160.aClass8_Sub1_Sub7_Sub1_4 = null;
				Static160.aClass8_Sub1_Sub7_Sub1_4 = new Class8_Sub1_Sub7_Sub1(arg1, arg2);
			}
			Static103.method1675(Static160.aClass8_Sub1_Sub7_Sub1_4.anIntArray150, arg1, arg2);
			Static54.method866(arg1, 0, 0, local232, local64, arg2, local257, local51);
			Static147.method2397(Static65.aBoolean466, 0, local232, 0, local64, local51, local257, arg2, arg1);
			Static98.method1568(local232, local64, local257, 0, arg1, arg2, local51, 0);
			Static160.aClass8_Sub1_Sub7_Sub1_4.method1639();
			Static126.method1998(Static160.aClass8_Sub1_Sub7_Sub1_4.anIntArray150, arg3, arg0, arg1, arg2);
			Static103.anIntArray155 = null;
		} else {
			Static54.method866(arg1 + arg3, arg3, arg0, local232, local64, arg2 + arg0, local257, local51);
			Static147.method2397(Static65.aBoolean466, arg3, local232, arg0, local64, local51, local257, arg2 + arg0, arg3 - -arg1);
			Static98.method1568(local232, local64, local257, arg0, arg3 + arg1, arg0 - -arg2, local51, arg3);
		}
		if (Static189.anInt3789 > 0) {
			Static3.anInt4882--;
			if (Static3.anInt4882 == 0) {
				Static189.anInt3789--;
				Static3.anInt4882 = 20;
			}
		}
		if (!Static216.aBoolean360) {
			return;
		}
		@Pc(408) int local408 = arg1 + arg3 - 5;
		@Pc(414) int local414 = arg0 + arg2 - 8;
		Static247.aClass8_Sub1_Sub5_5.method2013("Fps:" + Static222.anInt4576, local408, local414, 16776960, -1);
		@Pc(430) int local430 = 16776960;
		@Pc(431) int local431 = local414 - 15;
		@Pc(433) Runtime local433 = Runtime.getRuntime();
		@Pc(443) int local443 = (int) ((local433.totalMemory() - local433.freeMemory()) / 1024L);
		if (local443 > 65536) {
			local430 = 16711680;
		}
		Static247.aClass8_Sub1_Sub5_5.method2013("Mem:" + local443 + "k", local408, local431, local430, -1);
		local414 = local431 - 15;
	}

	@OriginalMember(owner = "client!ak", name = "h", descriptor = "(I)V")
	public static void method213() {
		Static210.aClass159ArrayArray6 = new Class159[Static171.aClass132_60.method3193()][];
		Static10.aBooleanArray1 = new boolean[Static171.aClass132_60.method3193()];
	}
}
