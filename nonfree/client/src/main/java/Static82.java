import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!dr", name = "N", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_38 = new Class129(74, -1);

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "(BI)V")
	public static void method1222(@OriginalArg(1) int arg0) {
		if (arg0 == Static50.anInt905) {
			return;
		}
		Static433.anInt7210 = Static418.anInt6969 = Static137.anIntArray135[arg0];
		Static81.method1209();
		Static403.anIntArrayArrayArray16 = new int[4][Static433.anInt7210 >> 3][Static418.anInt6969 >> 3];
		Static179.anIntArrayArray19 = new int[Static433.anInt7210][Static418.anInt6969];
		Static49.anIntArrayArray5 = new int[Static433.anInt7210][Static418.anInt6969];
		for (@Pc(40) int local40 = 0; local40 < 4; local40++) {
			Static163.aClass240Array1[local40] = Static121.method1715(Static433.anInt7210, Static418.anInt6969);
		}
		Static264.aByteArrayArrayArray15 = new byte[4][Static433.anInt7210][Static418.anInt6969];
		Static410.method5408(Static433.anInt7210, Static418.anInt6969);
		Static51.method807(Static433.anInt7210 >> 3, Static407.aClass200_9, Static418.anInt6969 >> 3);
		Static50.anInt905 = arg0;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(ZLclient!um;)V")
	public static void method1225(@OriginalArg(1) Class243 arg0) {
		Static15.aClass243_12 = arg0;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(II)I")
	public static int method1226(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(19) int local19 = arg0 * 6 - 61440;
		@Pc(33) int local33 = (local19 * arg0 >> 12) + 40960;
		return local33 * local13 >> 12;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(DB)V")
	public static void method1227(@OriginalArg(0) double arg0) {
		if (arg0 == Static256.aDouble8) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 256; local11++) {
			@Pc(23) int local23 = (int) (Math.pow((double) local11 / 255.0D, arg0) * 255.0D);
			Static268.anIntArray335[local11] = local23 > 255 ? 255 : local23;
		}
		Static256.aDouble8 = arg0;
	}
}
