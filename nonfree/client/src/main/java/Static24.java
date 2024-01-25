import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!aw", name = "F", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_10 = new Class349(20, 4);

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(BIII)I")
	public static int method347(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static114.aClass151Array1 == null) {
			return 0;
		}
		@Pc(16) int local16 = arg1 >> 9;
		@Pc(20) int local20 = arg0 >> 9;
		if (local16 < 0 || local20 < 0 || local16 > Static281.anInt4822 - 1 || Static29.anInt491 - 1 < local20) {
			return 0;
		}
		@Pc(41) int local41 = arg2;
		if (arg2 < 3 && (Static433.aByteArrayArrayArray15[1][local16][local20] & 0x2) != 0) {
			local41 = arg2 + 1;
		}
		return Static114.aClass151Array1[local41].method7680(arg1, arg0);
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(IIIIIIBII)V")
	public static void method348(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static453.method5906(arg4)) {
			if (Static183.aClass273ArrayArray1[arg4] == null) {
				Static48.method857(arg6, arg0, arg1, arg7, arg5, arg2, -1, Static509.aClass273ArrayArray2[arg4], arg3);
			} else {
				Static48.method857(arg6, arg0, arg1, arg7, arg5, arg2, -1, Static183.aClass273ArrayArray1[arg4], arg3);
			}
		} else if (arg1 == -1) {
			for (@Pc(15) int local15 = 0; local15 < 100; local15++) {
				Static255.aBooleanArray17[local15] = true;
			}
		} else {
			Static255.aBooleanArray17[arg1] = true;
		}
	}

	@OriginalMember(owner = "client!aw", name = "c", descriptor = "(II)V")
	public static void method349(@OriginalArg(0) int arg0) {
		Static340.anInt5890 = arg0;
		Static150.anInt2432 = 3;
		Static63.anInt1135 = -1;
		Static82.anInt1424 = 100;
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;B)V")
	public static void method350(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		Static61.aBoolean62 = arg0;
		Static6.aString4 = arg1;
		Static64.aString14 = arg2;
		if (!Static61.aBoolean62 && Static377.anInt6297 != 3 && (Static64.aString14.equals("") || Static6.aString4.equals(""))) {
			Static29.method389(3);
			return;
		}
		Static559.aBoolean766 = false;
		if (Static377.anInt6297 != 1) {
			Static487.anInt7731 = -1;
			Static111.anInt1961 = 0;
		}
		Static29.method389(-3);
		Static364.anInt6128 = 0;
		Static376.anInt6288 = 0;
		Static135.anInt8199 = 1;
	}
}
