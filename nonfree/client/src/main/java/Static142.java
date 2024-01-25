import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static142 {

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "Lclient!tj;")
	public static Class193 aClass193_53;

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
	public static int anInt3231 = 1;

	@OriginalMember(owner = "client!jb", name = "p", descriptor = "Lclient!ub;")
	public static final Class198 aClass198_109 = new Class198(5);

	@OriginalMember(owner = "client!jb", name = "w", descriptor = "S")
	public static short aShort53 = 205;

	@OriginalMember(owner = "client!jb", name = "x", descriptor = "[I")
	public static final int[] anIntArray279 = new int[4096];

	@OriginalMember(owner = "client!jb", name = "y", descriptor = "I")
	public static int anInt3234 = 1;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!vq;IIB)V")
	public static void method2955(@OriginalArg(0) Class47 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static243.aClass47_10 = arg0;
		Static162.aClass50ArrayArray1 = new Class50[arg2][arg1];
		if (Static68.anIntArray99 != null) {
			Static6.aClass81_1 = Static272.method4651(Static68.anIntArray99[4], Static68.anIntArray99[5], Static68.anIntArray99[2], Static68.anIntArray99[1], Static68.anIntArray99[3], Static68.anIntArray99[0]);
		}
		Static65.aClass50_1 = new Class50();
		Static136.method2905();
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(BII)I")
	public static int method2957(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static178.anIntArray323[arg0 & 0x3] : Static75.anIntArray111[arg0 & 0x3];
	}
}
