import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static505 {

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "I")
	public static int anInt8478 = -1;

	@OriginalMember(owner = "client!rga", name = "b", descriptor = "I")
	public static int anInt8479 = 0;

	@OriginalMember(owner = "client!rga", name = "c", descriptor = "[I")
	public static final int[] anIntArray555 = new int[2];

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method7217(@OriginalArg(1) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(13) int local13 = local8.length() - 3; local13 > 0; local13 -= 3) {
			local8 = local8.substring(0, local13) + "," + local8.substring(local13);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static52.aClass41_33.method1007(Static616.anInt10077) + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static52.aClass41_35.method1007(Static616.anInt10077) + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(BLclient!sha;II)V")
	public static void method7218(@OriginalArg(1) Class321 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.aByte132 == 0) {
			arg0.anInt9016 = arg0.anInt9029;
		} else if (arg0.aByte132 == 1) {
			arg0.anInt9016 = (arg2 - arg0.anInt9103) / 2 + arg0.anInt9029;
		} else if (arg0.aByte132 == 2) {
			arg0.anInt9016 = arg2 - arg0.anInt9103 - arg0.anInt9029;
		} else if (arg0.aByte132 == 3) {
			arg0.anInt9016 = arg0.anInt9029 * arg2 >> 14;
		} else if (arg0.aByte132 == 4) {
			arg0.anInt9016 = (arg2 * arg0.anInt9029 >> 14) + (arg2 - arg0.anInt9103) / 2;
		} else {
			arg0.anInt9016 = arg2 - arg0.anInt9103 - (arg0.anInt9029 * arg2 >> 14);
		}
		if (arg0.aByte133 == 0) {
			arg0.anInt9072 = arg0.anInt9065;
		} else if (arg0.aByte133 == 1) {
			arg0.anInt9072 = arg0.anInt9065 + (arg1 - arg0.anInt9077) / 2;
		} else if (arg0.aByte133 == 2) {
			arg0.anInt9072 = arg1 - arg0.anInt9077 - arg0.anInt9065;
		} else if (arg0.aByte133 == 3) {
			arg0.anInt9072 = arg1 * arg0.anInt9065 >> 14;
		} else if (arg0.aByte133 == 4) {
			arg0.anInt9072 = (arg0.anInt9065 * arg1 >> 14) + (arg1 - arg0.anInt9077) / 2;
		} else {
			arg0.anInt9072 = arg1 - (arg1 * arg0.anInt9065 >> 14) - arg0.anInt9077;
		}
		if (!Static383.aBoolean423 || Static83.method1453(arg0).anInt6747 == 0 && arg0.anInt9105 != 0) {
			return;
		}
		if (arg0.anInt9016 < 0) {
			arg0.anInt9016 = 0;
		} else if (arg2 < arg0.anInt9103 + arg0.anInt9016) {
			arg0.anInt9016 = arg2 - arg0.anInt9103;
		}
		if (arg0.anInt9072 < 0) {
			arg0.anInt9072 = 0;
		} else if (arg1 < arg0.anInt9077 + arg0.anInt9072) {
			arg0.anInt9072 = arg1 - arg0.anInt9077;
			return;
		}
	}
}
