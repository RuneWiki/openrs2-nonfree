import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "Lclient!nn;")
	public static Class119 aClass119_1;

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "[Z")
	public static boolean[] aBooleanArray7;

	@OriginalMember(owner = "client!bf", name = "j", descriptor = "I")
	public static int anInt451;

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
	public static volatile int anInt449 = 0;

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "[S")
	public static short[] aShortArray10 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(III)I")
	public static int method432(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(41) int local41 = Static284.method4438(arg0 - 1, arg1 - 1) + Static284.method4438(arg0 + 1, arg1 - 1) + Static284.method4438(arg0 + -1, arg1 + 1) + Static284.method4438(arg0 + 1, arg1 - -1);
		@Pc(71) int local71 = Static284.method4438(arg0 - 1, arg1) + Static284.method4438(arg0 + 1, arg1) + Static284.method4438(arg0, arg1 - 1) + Static284.method4438(arg0, arg1 + 1);
		@Pc(78) int local78 = Static284.method4438(arg0, arg1);
		return local78 / 4 + local41 / 16 + local71 / 8;
	}
}
