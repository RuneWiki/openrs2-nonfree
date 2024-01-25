import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static425 {

	@OriginalMember(owner = "client!qh", name = "jd", descriptor = "Lclient!se;")
	public static Class1_Sub6_Sub3 aClass1_Sub6_Sub3_2;

	@OriginalMember(owner = "client!qh", name = "qd", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray26;

	@OriginalMember(owner = "client!qh", name = "ud", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray27;

	@OriginalMember(owner = "client!qh", name = "Bd", descriptor = "I")
	public static int anInt7628;

	@OriginalMember(owner = "client!qh", name = "xd", descriptor = "Lclient!lh;")
	public static final Class208 aClass208_92 = new Class208(18, 8);

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "(II)I")
	public static int method6078(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!qh", name = "m", descriptor = "(I)V")
	public static void method6083() {
		@Pc(1) Class207 local1 = Static236.aClass207_55;
		synchronized (Static236.aClass207_55) {
			Static236.aClass207_55.method4392();
		}
		local1 = Static275.aClass207_25;
		synchronized (Static275.aClass207_25) {
			Static275.aClass207_25.method4392();
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!r;Lclient!fa;IIIII)V")
	public static void method6084(@OriginalArg(0) Class78 arg0, @OriginalArg(1) Interface9 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static142.anInt2752 < 100) {
			Static54.method939(arg1, arg0);
		}
		arg0.da(arg5, arg4, arg5 + arg3, arg2 + arg4);
		@Pc(33) int local33;
		@Pc(51) int local51;
		if (Static142.anInt2752 < 100) {
			local33 = arg3 / 2 + arg5;
			arg0.J(arg5, arg4, arg3, arg2, -16777216, 0);
			local51 = arg4 + arg2 / 2 - 38;
			arg0.method6778(local33 - 152, local51, 304, 34, Static490.aColorArray2[Static150.anInt2840].getRGB(), 0);
			arg0.J(local33 - 150, local51 - -2, Static142.anInt2752 * 3, 30, Static416.aColorArray1[Static150.anInt2840].getRGB(), 0);
			Static62.aClass96_4.method7252(-1, Static375.aClass253_22.method5453(Static161.anInt3095), local51 + 20, Static560.aColorArray3[Static150.anInt2840].getRGB(), local33);
			return;
		}
		@Pc(108) int local108 = Static500.anInt8734 - (int) ((float) arg3 / Static287.aFloat105);
		local33 = Static249.anInt4547 + (int) ((float) arg2 / Static287.aFloat105);
		local51 = Static500.anInt8734 + (int) ((float) arg3 / Static287.aFloat105);
		Static401.anInt7185 = (int) ((float) (arg2 * 2) / Static287.aFloat105);
		@Pc(142) int local142 = Static249.anInt4547 - (int) ((float) arg2 / Static287.aFloat105);
		Static130.anInt2589 = Static249.anInt4547 - (int) ((float) arg2 / Static287.aFloat105);
		Static141.anInt2742 = (int) ((float) (arg3 * 2) / Static287.aFloat105);
		Static160.anInt3053 = Static500.anInt8734 - (int) ((float) arg3 / Static287.aFloat105);
		Static287.method3142(local108 + Static287.anInt3859, local33 + Static287.anInt3862, Static287.anInt3859 + local51, local142 - -Static287.anInt3862, arg5, arg4, arg5 + arg3, arg4 + arg2 + 1);
		Static287.method3149(arg0);
		@Pc(206) Class111 local206 = Static287.method3155(arg0);
		Static368.method5400(arg0, local206);
		if (Static413.anInt7319 > 0) {
			Static24.anInt582--;
			if (Static24.anInt582 == 0) {
				Static413.anInt7319--;
				Static24.anInt582 = 20;
			}
		}
		if (!Static541.aBoolean677) {
			return;
		}
		@Pc(234) int local234 = arg5 + arg3 - 5;
		@Pc(240) int local240 = arg2 + arg4 - 8;
		Static339.aClass96_9.method7244("Fps:" + Static403.anInt7222, local234, 16776960, local240, -1);
		@Pc(255) int local255 = local240 - 15;
		@Pc(257) Runtime local257 = Runtime.getRuntime();
		@Pc(267) int local267 = (int) ((local257.totalMemory() - local257.freeMemory()) / 1024L);
		@Pc(269) int local269 = 16776960;
		if (local267 > 65536) {
			local269 = 16711680;
		}
		Static339.aClass96_9.method7244("Mem:" + local267 + "k", local234, local269, local255, -1);
		local240 = local255 - 15;
	}

	@OriginalMember(owner = "client!qh", name = "i", descriptor = "(B)V")
	public static void method6086() {
		for (@Pc(10) Class11_Sub6 local10 = (Class11_Sub6) Static312.aClass196_4.method4027(); local10 != null; local10 = (Class11_Sub6) Static312.aClass196_4.method4027()) {
			Static286.method4304(local10);
		}
		@Pc(38) int local38;
		@Pc(37) int local37;
		if (Static86.aClass1_Sub30_Sub1_1.method5029(Static286.anInt5239)) {
			local37 = 3;
			local38 = 0;
		} else {
			local37 = Static398.anInt7155;
			local38 = Static398.anInt7155;
		}
		Static67.method1095();
		for (@Pc(47) int local47 = local38; local47 <= local37; local47++) {
			Static67.method1093();
			Static67.method1109(local47);
			Static67.method1096(local47);
		}
		Static67.method1108();
		Static67.method1100();
	}
}
