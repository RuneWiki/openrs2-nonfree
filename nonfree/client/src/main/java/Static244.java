import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!pq", name = "u", descriptor = "Z")
	public static boolean aBoolean397;

	@OriginalMember(owner = "client!pq", name = "s", descriptor = "Lclient!tc;")
	public static Class195 aClass195_42 = new Class195();

	@OriginalMember(owner = "client!pq", name = "t", descriptor = "I")
	public static int anInt4759 = 0;

	@OriginalMember(owner = "client!pq", name = "v", descriptor = "S")
	public static short aShort61 = 1;

	@OriginalMember(owner = "client!pq", name = "x", descriptor = "Z")
	public static boolean aBoolean398 = false;

	@OriginalMember(owner = "client!pq", name = "y", descriptor = "I")
	public static int anInt4761 = 0;

	@OriginalMember(owner = "client!pq", name = "z", descriptor = "I")
	public static int anInt4762 = 0;

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lclient!sr;IIIILclient!aa;I)V")
	public static void method4319(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class2 arg4, @OriginalArg(6) int arg5) {
		if (Static24.anInt671 < 100) {
			Static196.method3695(arg4, arg0);
		}
		arg4.method3250(arg5, arg3, arg2 + arg5, arg3 - -arg1);
		@Pc(39) int local39;
		@Pc(57) int local57;
		if (Static24.anInt671 < 100) {
			local39 = arg5 + arg2 / 2;
			arg4.method3300(arg5, arg3, arg2, arg1, -16777216, 0);
			local57 = arg1 / 2 + arg3 - 38;
			arg4.method3263(local39 - 152, local57, 304, 34, Static91.aColorArray5[Static327.anInt6272].getRGB(), 0);
			arg4.method3300(local39 - 150, local57 + 2, Static24.anInt671 * 3, 30, Static267.aColorArray12[Static327.anInt6272].getRGB(), 0);
			Static302.aClass13_7.method4455(local57 + 20, Static278.aString217, local39, -1, Static277.aColorArray13[Static327.anInt6272].getRGB());
			return;
		}
		@Pc(110) int local110 = Static90.anInt1760 - (int) ((float) arg2 / Static342.aFloat37);
		local39 = Static185.anInt1061 + (int) ((float) arg1 / Static342.aFloat37);
		local57 = (int) ((float) arg2 / Static342.aFloat37) + Static90.anInt1760;
		Static33.anInt800 = (int) ((float) (arg1 * 2) / Static342.aFloat37);
		Static120.anInt2343 = (int) ((float) (arg2 * 2) / Static342.aFloat37);
		Static169.anInt4509 = Static185.anInt1061 - (int) ((float) arg1 / Static342.aFloat37);
		@Pc(160) int local160 = Static185.anInt1061 - (int) ((float) arg1 / Static342.aFloat37);
		Static186.anInt3872 = Static90.anInt1760 - (int) ((float) arg2 / Static342.aFloat37);
		Static342.method1954(local110 + Static342.anInt2144, local39 - -Static342.anInt2150, Static342.anInt2144 + local57, local160 - -Static342.anInt2150, arg5, arg3, arg5 + arg2, arg1 + arg3 + 1);
		Static342.method1973(arg4);
		@Pc(200) Class195 local200 = Static342.method1974(arg4);
		Static101.method1909(arg4, local200);
		if (Static177.anInt3677 > 0) {
			Static23.anInt530--;
			if (Static23.anInt530 == 0) {
				Static177.anInt3677--;
				Static23.anInt530 = 20;
			}
		}
		if (!Static118.aBoolean403) {
			return;
		}
		@Pc(231) int local231 = arg2 + arg5 - 5;
		@Pc(238) int local238 = arg3 + arg1 - 8;
		Static9.aClass13_1.method4452("Fps:" + Static50.anInt1156, local231, 16776960, local238);
		@Pc(253) int local253 = local238 - 15;
		@Pc(255) Runtime local255 = Runtime.getRuntime();
		@Pc(265) int local265 = (int) ((local255.totalMemory() - local255.freeMemory()) / 1024L);
		@Pc(267) int local267 = 16776960;
		if (local265 > 65536) {
			local267 = 16711680;
		}
		Static9.aClass13_1.method4452("Mem:" + local265 + "k", local231, local267, local253);
		local238 = local253 - 15;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(BI)V")
	public static void method4320() {
		@Pc(5) Class140 local5 = Static99.aClass140_56;
		synchronized (Static99.aClass140_56) {
			Static99.aClass140_56.method3824(5);
		}
		local5 = Static259.aClass140_131;
		synchronized (Static259.aClass140_131) {
			Static259.aClass140_131.method3824(5);
		}
		@Pc(33) Class33 local33 = Static234.aClass33_1;
		synchronized (Static234.aClass33_1) {
			Static234.aClass33_1.method1157();
		}
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(II)I")
	public static int method4321(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 >>> 1;
		@Pc(13) int local13 = local7 | local7 >>> 1;
		@Pc(19) int local19 = local13 | local13 >>> 2;
		@Pc(30) int local30 = local19 | local19 >>> 4;
		@Pc(36) int local36 = local30 | local30 >>> 8;
		@Pc(42) int local42 = local36 | local36 >>> 16;
		return arg0 & ~local42;
	}

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "(I)V")
	public static void method4322() {
		Static76.aClass140_42.method3819();
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(III)Z")
	public static boolean method4323(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 11) {
			arg1 = 10;
		}
		@Pc(17) Class188 local17 = Static126.method2405(arg0);
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local17.method4912(arg1);
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(Z)V")
	public static void method4324() {
		if (Static119.anIntArray251 != null && Static238.anIntArray597 != null) {
			return;
		}
		Static119.anIntArray251 = new int[256];
		Static238.anIntArray597 = new int[256];
		for (@Pc(22) int local22 = 0; local22 < 256; local22++) {
			@Pc(31) double local31 = (double) local22 / 255.0D * 6.283185307179586D;
			Static119.anIntArray251[local22] = (int) (Math.sin(local31) * 4096.0D);
			Static238.anIntArray597[local22] = (int) (Math.cos(local31) * 4096.0D);
		}
	}
}
