import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!eb", name = "N", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray7;

	@OriginalMember(owner = "client!eb", name = "I", descriptor = "Z")
	public static boolean aBoolean75 = true;

	@OriginalMember(owner = "client!eb", name = "O", descriptor = "[I")
	public static int[] anIntArray126 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BI)I")
	public static int method1116(@OriginalArg(1) int arg0) {
		if (Static261.aClass91_3 != null) {
			Static261.aClass91_3.method2302();
			Static261.aClass91_3 = null;
		}
		Static197.anInt3945++;
		if (Static197.anInt3945 > 4) {
			Static176.anInt5566 = 0;
			Static197.anInt3945 = 0;
			return arg0;
		}
		Static176.anInt5566 = 0;
		if (Static254.anInt4972 == Static109.anInt2179) {
			Static109.anInt2179 = Static43.anInt869;
		} else {
			Static109.anInt2179 = Static254.anInt4972;
		}
		return -1;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IILjava/util/Random;)I")
	public static int method1118(@OriginalArg(0) int arg0, @OriginalArg(2) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static40.method747(arg0)) {
			return (int) ((long) arg0 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(43) int local43 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(46) int local46;
			do {
				local46 = arg1.nextInt();
			} while (local46 >= local43);
			return Static211.method3061(local46, arg0);
		}
	}
}
