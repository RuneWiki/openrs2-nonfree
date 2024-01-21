import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!fb", name = "Bb", descriptor = "Lclient!sb;")
	public static Class25 aClass25_43;

	@OriginalMember(owner = "client!fb", name = "Ub", descriptor = "[I")
	public static int[] anIntArray83;

	@OriginalMember(owner = "client!fb", name = "Ob", descriptor = "Lclient!ad;")
	private static Class4 aClass4_440 = Static75.method1216("glow1:");

	@OriginalMember(owner = "client!fb", name = "tb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_435 = aClass4_440;

	@OriginalMember(owner = "client!fb", name = "Rb", descriptor = "Lclient!ad;")
	private static Class4 aClass4_443 = Static75.method1216("Loaded config");

	@OriginalMember(owner = "client!fb", name = "ub", descriptor = "Lclient!ad;")
	public static Class4 aClass4_436 = aClass4_443;

	@OriginalMember(owner = "client!fb", name = "vb", descriptor = "[[I")
	public static int[][] anIntArrayArray4 = new int[104][104];

	@OriginalMember(owner = "client!fb", name = "wb", descriptor = "I")
	public static int anInt905 = 0;

	@OriginalMember(owner = "client!fb", name = "Ab", descriptor = "I")
	public static int anInt908 = 0;

	@OriginalMember(owner = "client!fb", name = "Cb", descriptor = "I")
	public static int anInt909 = -1;

	@OriginalMember(owner = "client!fb", name = "Db", descriptor = "Lclient!ad;")
	private static Class4 aClass4_437 = Static75.method1216("Public chat");

	@OriginalMember(owner = "client!fb", name = "Eb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_438 = aClass4_437;

	@OriginalMember(owner = "client!fb", name = "Gb", descriptor = "I")
	public static int anInt911 = 0;

	@OriginalMember(owner = "client!fb", name = "Mb", descriptor = "Lclient!ad;")
	private static Class4 aClass4_439 = Static75.method1216(" has logged in)3");

	@OriginalMember(owner = "client!fb", name = "Pb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_441 = aClass4_439;

	@OriginalMember(owner = "client!fb", name = "Qb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_442 = Static75.method1216("Benutzen Sie bitte eine andere Welt)3");

	@OriginalMember(owner = "client!fb", name = "Xb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_444 = null;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(BI[BIZ)V")
	public static void method616(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (Static8.aClass30_1 == null) {
			return;
		}
		if (Static35.anInt640 >= 0) {
			Static87.anInt1449 = arg0;
			if (Static35.anInt640 == 0) {
				Static9.anInt310 = 1;
			} else {
				@Pc(21) int local21 = Static44.method808(Static35.anInt640);
				@Pc(25) int local25 = local21 - Static113.anInt2852;
				Static9.anInt310 = (local25 + 3600) / arg0;
				if (Static9.anInt310 < 1) {
					Static9.anInt310 = 1;
				}
			}
			Static56.aByteArray16 = arg1;
			Static87.anInt1450 = arg2;
			Static43.aBoolean81 = arg3;
		} else if (Static9.anInt310 == 0) {
			Static25.method494(arg3, arg1, arg2);
		} else {
			Static56.aByteArray16 = arg1;
			Static43.aBoolean81 = arg3;
			Static87.anInt1450 = arg2;
		}
	}

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "(Z)V")
	public static void method618() {
		aClass4_443 = null;
		aClass4_444 = null;
		aClass4_438 = null;
		aClass4_441 = null;
		aClass4_440 = null;
		aClass4_436 = null;
		aClass25_43 = null;
		aClass4_437 = null;
		anIntArrayArray4 = null;
		aClass4_435 = null;
		aClass4_439 = null;
		aClass4_442 = null;
		anIntArray83 = null;
	}
}
