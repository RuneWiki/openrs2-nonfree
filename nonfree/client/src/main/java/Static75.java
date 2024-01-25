import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!cs", name = "z", descriptor = "Lclient!oh;")
	public static Class220 aClass220_4;

	@OriginalMember(owner = "client!cs", name = "A", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray13;

	@OriginalMember(owner = "client!cs", name = "D", descriptor = "F")
	public static float aFloat52;

	@OriginalMember(owner = "client!cs", name = "y", descriptor = "Lclient!ml;")
	public static final Class199 aClass199_2 = new Class199("WTQA", 2);

	@OriginalMember(owner = "client!cs", name = "C", descriptor = "Lclient!bg;")
	public static final Class28 aClass28_2 = new Class28();

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lclient!pb;BI)V")
	public static void method1353(@OriginalArg(0) Class227 arg0, @OriginalArg(2) int arg1) {
		if (Static286.aBoolean403) {
			arg1 = 0;
			Static286.aBoolean403 = false;
		}
		if (Static442.aClass227_2 != null && Static442.aClass227_2.method5609(arg0)) {
			return;
		}
		Static442.aClass227_2 = arg0;
		Static505.aLong225 = Static105.method2132();
		Static480.anInt8291 = arg1;
		Static231.anInt4353 = arg1;
		if (Static231.anInt4353 != 0) {
			Static256.aFloat219 = Static482.aFloat346;
			Static378.anInt6960 = Static426.anInt7527;
			Static84.anInt1593 = Static122.anInt2577;
			Static540.aFloat368 = Static291.aFloat253;
			Static230.anInt4326 = Static174.anInt3441;
			Static403.aFloat309 = Static59.aFloat39;
			Static261.aFloat221 = Static457.aFloat331;
			Static122.aClass92_1 = Static232.aClass92_2;
			Static413.aFloat369 = Static477.aFloat341;
			Static76.aFloat54 = Static497.aFloat370;
			return;
		}
		Static317.method5105();
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(BII)I")
	public static int method1354(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg0 >>> 24;
		@Pc(19) int local19 = 255 - local14;
		@Pc(37) int local37 = (local14 * (arg0 & 0xFF00FF) & 0xFF00FF00 | local14 * (arg0 & 0xFF00) & 0xFF0000) >>> 8;
		return local37 + (((arg1 & 0xFF00) * local19 & 0xFF0000 | (arg1 & 0xFF00FF) * local19 & 0xFF00FF00) >>> 8);
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method1355(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		if (arg4 < 128 || arg0 < 128 || arg4 > (Static460.anInt7894 - 2) * 128 || arg0 > Static235.anInt4493 * 128 - 256) {
			Static469.anIntArray626[0] = Static469.anIntArray626[1] = -1;
			return;
		}
		@Pc(53) int local53 = Static191.method5464(arg4, arg0, arg3) - arg5;
		Static267.aClass78_3.TA(arg2, 0, 0);
		Static110.aClass62_15.method7068(Static267.aClass78_3);
		Static110.aClass62_15.IA(arg4, local53, arg0, Static469.anIntArray626);
		Static267.aClass78_3.TA(-arg2, 0, 0);
		Static110.aClass62_15.method7068(Static267.aClass78_3);
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(II)V")
	public static void method1357(@OriginalArg(1) int arg0) {
		if (Static239.anInt4818 == 1) {
			Static415.anInt7356 = arg0;
		} else if (Static239.anInt4818 == 2 || Static239.anInt4818 == 3) {
			Static126.anInt8434 = arg0;
		}
	}
}
