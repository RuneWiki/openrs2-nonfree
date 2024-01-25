import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!og", name = "G", descriptor = "Lclient!kb;")
	public static Class44 aClass44_2;

	@OriginalMember(owner = "client!og", name = "I", descriptor = "I")
	public static int anInt1445;

	@OriginalMember(owner = "client!og", name = "M", descriptor = "Lclient!bu;")
	public static Class32 aClass32_23;

	@OriginalMember(owner = "client!og", name = "O", descriptor = "F")
	public static float aFloat7;

	@OriginalMember(owner = "client!og", name = "R", descriptor = "I")
	private static int anInt1451;

	@OriginalMember(owner = "client!og", name = "S", descriptor = "I")
	private static int anInt1452;

	@OriginalMember(owner = "client!og", name = "T", descriptor = "Z")
	private static boolean aBoolean115;

	@OriginalMember(owner = "client!og", name = "U", descriptor = "Z")
	private static boolean aBoolean116;

	@OriginalMember(owner = "client!og", name = "A", descriptor = "Lclient!an;")
	public static final Class11 aClass11_6 = new Class11(8);

	@OriginalMember(owner = "client!og", name = "H", descriptor = "I")
	public static int anInt1444 = 0;

	@OriginalMember(owner = "client!og", name = "J", descriptor = "Lclient!rn;")
	public static final Class217 aClass217_22 = new Class217(7, 15);

	@OriginalMember(owner = "client!og", name = "N", descriptor = "I")
	public static int anInt1448 = 64;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ILclient!m;IILclient!qa;II)V")
	public static void method1092(@OriginalArg(1) Interface5 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class172 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static66.anInt1702 < 100) {
			Static48.method865(arg3, arg0);
		}
		arg3.pa(arg2, arg5, arg2 + arg1, arg5 - -arg4);
		@Pc(33) int local33;
		@Pc(51) int local51;
		if (Static66.anInt1702 < 100) {
			local33 = arg2 + arg1 / 2;
			arg3.NA(arg2, arg5, arg1, arg4, -16777216, 0);
			local51 = arg4 / 2 + arg5 - 20 - 18;
			arg3.method5484(local33 - 152, local51, 304, 34, Static413.aColorArray1[Static114.anInt2480].getRGB(), 0);
			arg3.NA(local33 - 150, local51 + 2, Static66.anInt1702 * 3, 30, Static442.aColorArray3[Static114.anInt2480].getRGB(), 0);
			Static321.aClass59_4.method5774(Static166.aClass189_103.method4262(Static53.anInt1454), Static428.aColorArray2[Static114.anInt2480].getRGB(), -1, local51 + 20, local33);
			return;
		}
		@Pc(108) int local108 = Static411.anInt6760 - (int) ((float) arg1 / Static144.aFloat59);
		local33 = (int) ((float) arg4 / Static144.aFloat59) + Static76.anInt1937;
		local51 = Static411.anInt6760 + (int) ((float) arg1 / Static144.aFloat59);
		Static67.anInt1705 = Static76.anInt1937 - (int) ((float) arg4 / Static144.aFloat59);
		@Pc(143) int local143 = Static76.anInt1937 - (int) ((float) arg4 / Static144.aFloat59);
		Static175.anInt7347 = (int) ((float) (arg1 * 2) / Static144.aFloat59);
		Static437.anInt7373 = Static411.anInt6760 - (int) ((float) arg1 / Static144.aFloat59);
		Static240.anInt4579 = (int) ((float) (arg4 * 2) / Static144.aFloat59);
		Static144.method4245(local108 + Static144.anInt5410, local33 - -Static144.anInt5420, local51 + Static144.anInt5410, Static144.anInt5420 + local143, arg2, arg5, arg2 + arg1, arg4 + 1 + arg5);
		Static144.method4250(arg3);
		@Pc(205) Class243 local205 = Static144.method4249(arg3);
		Static156.method2535(arg3, local205);
		if (Static374.anInt6289 > 0) {
			Static238.anInt4569--;
			if (Static238.anInt4569 == 0) {
				Static374.anInt6289--;
				Static238.anInt4569 = 20;
			}
		}
		if (!Static188.aBoolean323) {
			return;
		}
		@Pc(236) int local236 = arg1 + arg2 - 5;
		@Pc(242) int local242 = arg5 + arg4 - 8;
		Static299.aClass59_3.method5781(local236, 16776960, local242, "Fps:" + Static320.anInt5587);
		@Pc(257) int local257 = local242 - 15;
		@Pc(259) Runtime local259 = Runtime.getRuntime();
		@Pc(268) int local268 = (int) ((local259.totalMemory() - local259.freeMemory()) / 1024L);
		@Pc(270) int local270 = 16776960;
		if (local268 > 65536) {
			local270 = 16711680;
		}
		Static299.aClass59_3.method5781(local236, local270, local257, "Mem:" + local268 + "k");
		local242 = local257 - 15;
	}

	@OriginalMember(owner = "client!og", name = "providesignlink", descriptor = "(Lclient!li;)V")
	private static void method1093(@OriginalArg(0) Class143 arg0) {
		Static66.aClass143_2 = arg0;
		Static217.aClass143_3 = arg0;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(III)Z")
	public static boolean method1099(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static435.method5712(arg1, arg0) & Static274.method3901(arg1, arg0);
	}
}
