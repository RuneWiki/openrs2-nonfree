import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!gd", name = "G", descriptor = "Lclient!uu;")
	public static Class250 aClass250_39;

	@OriginalMember(owner = "client!gd", name = "N", descriptor = "I")
	public static int anInt2305;

	@OriginalMember(owner = "client!gd", name = "r", descriptor = "[J")
	public static final long[] aLongArray6 = new long[32];

	@OriginalMember(owner = "client!gd", name = "w", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar1 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!l;ILclient!qa;IIII)V")
	public static void method1987(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class167 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (Static264.anInt4384 < 100) {
			Static31.method577(arg0, arg2);
		}
		arg2.w(arg5, arg3, arg1 + arg5, arg3 - -arg4);
		@Pc(36) int local36;
		@Pc(55) int local55;
		if (Static264.anInt4384 < 100) {
			local36 = arg1 / 2 + arg5;
			arg2.M(arg5, arg3, arg1, arg4, -16777216, 0);
			local55 = arg3 + arg4 / 2 - 18 - 20;
			arg2.method5996(local36 - 152, local55, 304, 34, Static218.aColorArray42[Static114.anInt2017].getRGB(), 0);
			arg2.M(local36 - 150, local55 + 2, Static264.anInt4384 * 3, 30, Static461.aColorArray43[Static114.anInt2017].getRGB(), 0);
			Static266.aClass18_2.method5169(Static212.aClass174_112.method4208(Static300.anInt5192), Static135.aColorArray15[Static114.anInt2017].getRGB(), local55 + 20, -1, local36);
			return;
		}
		@Pc(110) int local110 = Static34.anInt3343 - (int) ((float) arg1 / Static211.aFloat3);
		local36 = Static436.anInt7297 + (int) ((float) arg4 / Static211.aFloat3);
		local55 = (int) ((float) arg1 / Static211.aFloat3) + Static34.anInt3343;
		@Pc(135) int local135 = Static436.anInt7297 - (int) ((float) arg4 / Static211.aFloat3);
		Static172.anInt3106 = Static436.anInt7297 - (int) ((float) arg4 / Static211.aFloat3);
		Static414.anInt7475 = (int) ((float) (arg4 * 2) / Static211.aFloat3);
		Static204.anInt4638 = Static34.anInt3343 - (int) ((float) arg1 / Static211.aFloat3);
		Static181.anInt5110 = (int) ((float) (arg1 * 2) / Static211.aFloat3);
		Static211.method306(Static211.anInt278 + local110, Static211.anInt276 + local36, Static211.anInt278 + local55, Static211.anInt276 + local135, arg5, arg3, arg5 + arg1, arg4 + arg3 + 1);
		Static211.method298(arg2);
		@Pc(205) Class193 local205 = Static211.method300(arg2);
		Static335.method4631(local205, arg2);
		if (Static110.anInt1953 > 0) {
			Static285.anInt5015--;
			if (Static285.anInt5015 == 0) {
				Static285.anInt5015 = 20;
				Static110.anInt1953--;
			}
		}
		if (!Static38.aBoolean35) {
			return;
		}
		@Pc(239) int local239 = arg1 + arg5 - 5;
		@Pc(245) int local245 = arg3 + arg4 - 8;
		Static244.aClass18_1.method5168("Fps:" + Static128.anInt2338, local245, 16776960, local239);
		@Pc(260) int local260 = local245 - 15;
		@Pc(262) Runtime local262 = Runtime.getRuntime();
		@Pc(271) int local271 = (int) ((local262.totalMemory() - local262.freeMemory()) / 1024L);
		@Pc(273) int local273 = 16776960;
		if (local271 > 65536) {
			local273 = 16711680;
		}
		Static244.aClass18_1.method5168("Mem:" + local271 + "k", local260, local273, local239);
		local245 = local260 - 15;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(BIIII)V")
	public static void method1988(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 > arg2) {
			Static201.method3084(Static296.anIntArrayArray42[arg1], arg2, arg0, arg3);
		} else {
			Static201.method3084(Static296.anIntArrayArray42[arg1], arg0, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)V")
	public static void method1990(@OriginalArg(0) int arg0) {
		@Pc(13) Class3_Sub3_Sub4 local13 = Static281.method3883(4, arg0);
		local13.method1006();
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZI)V")
	public static void method1992(@OriginalArg(0) boolean arg0) {
		if (arg0 && Static211.aClass3_Sub3_Sub13_2 != null) {
			Static248.anInt4237 = Static211.aClass3_Sub3_Sub13_2.anInt3495;
		} else {
			Static248.anInt4237 = -1;
		}
		Static264.anInt4384 = 0;
		Static107.aClass193_23 = null;
		Static211.aClass3_Sub3_Sub13_2 = null;
		Static381.aClass82_24 = null;
		Static211.method292();
		Static211.aClass193_3.method4524();
		Static160.aClass93_5 = null;
		Static280.anInt4669 = -1;
		Static308.aClass93_6 = null;
		Static251.aClass93_10 = null;
		Static211.aClass118_2 = null;
		Static59.aClass93_2 = null;
		Static82.anInt1486 = -1;
		Static358.aClass93_7 = null;
		Static376.aClass93_9 = null;
		Static442.aClass2_20 = null;
		Static359.aClass93_8 = null;
		Static13.aClass93_1 = null;
		Static211.aClass45_2.method1251();
		Static211.aClass182_2.method4367(64, 64);
		Static211.aClass45_2.method1254(128, 64);
		Static211.aClass149_3.method3570(64);
		Static256.aClass112_1.method2858(64);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILclient!jt;)Z")
	public static boolean method1993(@OriginalArg(1) Interface5 arg0) {
		@Pc(18) Class31 local18 = Static9.aClass149_1.method3573(arg0.method6263());
		if (local18.anInt793 == -1) {
			return true;
		} else {
			@Pc(30) Class17 local30 = Static462.aClass182_4.method4369(local18.anInt793);
			return local30.anInt309 == -1 ? true : local30.method335();
		}
	}
}
