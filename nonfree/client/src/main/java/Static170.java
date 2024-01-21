import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!sd", name = "o", descriptor = "I")
	public static int anInt3799;

	@OriginalMember(owner = "client!sd", name = "A", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_1095 = Static81.method1507("Your account is already logged in)3");

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "Lclient!dj;")
	public static Class24 aClass24_1087 = aClass24_1095;

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_1088 = Static81.method1507("Your profile will be transferred in:");

	@OriginalMember(owner = "client!sd", name = "k", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_1092 = Static81.method1507("Loading textures )2 ");

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "Lclient!dj;")
	public static Class24 aClass24_1089 = aClass24_1092;

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
	public static int anInt3792 = 0;

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1090 = Static81.method1507(" weitere Optionen");

	@OriginalMember(owner = "client!sd", name = "i", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1091 = Static81.method1507(" )2> ");

	@OriginalMember(owner = "client!sd", name = "q", descriptor = "Lclient!dj;")
	public static Class24 aClass24_1093 = aClass24_1088;

	@OriginalMember(owner = "client!sd", name = "r", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1094 = Static81.method1507("Verbindung abgebrochen)3");

	@OriginalMember(owner = "client!sd", name = "t", descriptor = "I")
	public static int anInt3802 = 1;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIBI)V")
	public static void method2919(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(16) int local16 = Static177.method3022(Static13.anInt308, arg3, Static52.anInt1338);
		@Pc(22) int local22 = Static177.method3022(Static13.anInt308, arg0, Static52.anInt1338);
		@Pc(28) int local28 = Static177.method3022(Static63.anInt1608, arg1, Static63.anInt1595);
		@Pc(34) int local34 = Static177.method3022(Static63.anInt1608, arg4, Static63.anInt1595);
		for (@Pc(36) int local36 = local16; local36 <= local22; local36++) {
			Static39.method731(Static98.anIntArrayArray16[local36], local28, local34, arg2);
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZZI)I")
	public static int method2923() {
		return Static143.anInt3203 + Static3.anInt116;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIII)V")
	public static void method2924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg3 - arg5 >= Static63.anInt1608 && Static63.anInt1595 >= arg3 + arg5 && arg0 - arg5 >= Static13.anInt308 && Static52.anInt1338 >= arg5 + arg0) {
			Static72.method1361(arg3, arg5, arg2, arg1, arg0, arg4);
		} else {
			Static64.method1308(arg0, arg2, arg1, arg5, arg4, arg3);
		}
	}
}
