import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static341 {

	@OriginalMember(owner = "client!qo", name = "Hb", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray39;

	@OriginalMember(owner = "client!qo", name = "oc", descriptor = "I")
	public static int anInt5585 = -1;

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(I)V")
	public static void method4427() {
		if (Static80.aClass191_1 != null) {
			Static80.aClass191_1.method5004();
		}
		if (Static152.aClass191_2 != null) {
			Static152.aClass191_2.method5004();
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILclient!fi;II)V")
	public static void method4440(@OriginalArg(1) Class76 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.aByte20 == 0) {
			arg0.anInt2079 = arg0.anInt2102;
		} else if (arg0.aByte20 == 1) {
			arg0.anInt2079 = (arg1 - arg0.anInt2106) / 2 + arg0.anInt2102;
		} else if (arg0.aByte20 == 2) {
			arg0.anInt2079 = arg1 - arg0.anInt2102 - arg0.anInt2106;
		} else if (arg0.aByte20 == 3) {
			arg0.anInt2079 = arg0.anInt2102 * arg1 >> 14;
		} else if (arg0.aByte20 == 4) {
			arg0.anInt2079 = (arg1 * arg0.anInt2102 >> 14) + (arg1 - arg0.anInt2106) / 2;
		} else {
			arg0.anInt2079 = arg1 - arg0.anInt2106 - (arg0.anInt2102 * arg1 >> 14);
		}
		if (arg0.aByte18 == 0) {
			arg0.anInt2126 = arg0.anInt2071;
		} else if (arg0.aByte18 == 1) {
			arg0.anInt2126 = arg0.anInt2071 + (arg2 - arg0.anInt2127) / 2;
		} else if (arg0.aByte18 == 2) {
			arg0.anInt2126 = arg2 - arg0.anInt2127 - arg0.anInt2071;
		} else if (arg0.aByte18 == 3) {
			arg0.anInt2126 = arg0.anInt2071 * arg2 >> 14;
		} else if (arg0.aByte18 == 4) {
			arg0.anInt2126 = (arg2 - arg0.anInt2127) / 2 + (arg2 * arg0.anInt2071 >> 14);
		} else {
			arg0.anInt2126 = arg2 - arg0.anInt2127 - (arg0.anInt2071 * arg2 >> 14);
		}
		if (!Static97.aBoolean113 || Static55.method885(arg0).anInt6805 == 0 && arg0.anInt2060 != 0) {
			return;
		}
		if (arg0.anInt2126 < 0) {
			arg0.anInt2126 = 0;
		} else if (arg0.anInt2126 + arg0.anInt2127 > arg2) {
			arg0.anInt2126 = arg2 - arg0.anInt2127;
		}
		if (arg0.anInt2079 < 0) {
			arg0.anInt2079 = 0;
		} else if (arg1 < arg0.anInt2106 + arg0.anInt2079) {
			arg0.anInt2079 = arg1 - arg0.anInt2106;
			return;
		}
	}
}
