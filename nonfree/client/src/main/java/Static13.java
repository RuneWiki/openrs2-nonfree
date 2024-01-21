import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!bb", name = "hb", descriptor = "I")
	public static int anInt587;

	@OriginalMember(owner = "client!bb", name = "qb", descriptor = "Lclient!ff;")
	public static Class24 aClass24_2;

	@OriginalMember(owner = "client!bb", name = "ub", descriptor = "I")
	public static int anInt594;

	@OriginalMember(owner = "client!bb", name = "zb", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray1;

	@OriginalMember(owner = "client!bb", name = "Ab", descriptor = "Lclient!fd;")
	public static Class22 aClass22_1;

	@OriginalMember(owner = "client!bb", name = "gb", descriptor = "[S")
	public static short[] aShortArray1 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!bb", name = "ib", descriptor = "I")
	public static int anInt588 = 0;

	@OriginalMember(owner = "client!bb", name = "kb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_403 = Static107.method1838("(U2");

	@OriginalMember(owner = "client!bb", name = "sb", descriptor = "Lclient!gg;")
	private static Class28 aClass28_407 = Static107.method1838("Existing User");

	@OriginalMember(owner = "client!bb", name = "mb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_404 = aClass28_407;

	@OriginalMember(owner = "client!bb", name = "pb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_405 = Static107.method1838("Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

	@OriginalMember(owner = "client!bb", name = "rb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_406 = Static107.method1838("hel");

	@OriginalMember(owner = "client!bb", name = "tb", descriptor = "I")
	public static final int anInt593 = 7759444;

	@OriginalMember(owner = "client!bb", name = "xb", descriptor = "I")
	public static volatile int anInt597 = -1;

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)V")
	public static void method384() {
		aClass28_406 = null;
		aClass24_2 = null;
		aShortArray1 = null;
		aClass22_1 = null;
		aClass28_407 = null;
		aClass28_404 = null;
		aClass28_405 = null;
		aClass28_403 = null;
		aBooleanArrayArray1 = null;
	}

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "(B)V")
	public static void method385() {
		if (Static75.anInt1953 > 0) {
			Static14.method395();
		} else {
			Static110.method1877(40);
			aClass22_1 = Static155.aClass22_4;
			Static155.aClass22_4 = null;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(II[S[Lclient!gg;B)V")
	public static void method386(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) Class28[] arg3) {
		if (arg0 <= arg1) {
			return;
		}
		@Pc(10) int local10 = (arg0 + arg1) / 2;
		@Pc(12) int local12 = arg1;
		@Pc(16) Class28 local16 = arg3[local10];
		arg3[local10] = arg3[arg0];
		arg3[arg0] = local16;
		@Pc(30) short local30 = arg2[local10];
		arg2[local10] = arg2[arg0];
		arg2[arg0] = local30;
		for (@Pc(42) int local42 = arg1; local42 < arg0; local42++) {
			if (local16 == null || arg3[local42] != null && (local42 & 0x1) > arg3[local42].method1144(local16)) {
				@Pc(68) Class28 local68 = arg3[local42];
				arg3[local42] = arg3[local12];
				arg3[local12] = local68;
				@Pc(82) short local82 = arg2[local42];
				arg2[local42] = arg2[local12];
				arg2[local12++] = local82;
			}
		}
		arg3[arg0] = arg3[local12];
		arg3[local12] = local16;
		arg2[arg0] = arg2[local12];
		arg2[local12] = local30;
		method386(local12 - 1, arg1, arg2, arg3);
		method386(arg0, local12 + 1, arg2, arg3);
	}
}
