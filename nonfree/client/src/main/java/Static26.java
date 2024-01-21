import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!ce", name = "F", descriptor = "[I")
	public static int[] anIntArray63;

	@OriginalMember(owner = "client!ce", name = "o", descriptor = "I")
	public static int anInt809 = 0;

	@OriginalMember(owner = "client!ce", name = "r", descriptor = "I")
	public static int anInt812 = 0;

	@OriginalMember(owner = "client!ce", name = "x", descriptor = "I")
	public static int anInt817 = 0;

	@OriginalMember(owner = "client!ce", name = "y", descriptor = "Lclient!gg;")
	public static Class28 aClass28_519 = Static107.method1838("l");

	@OriginalMember(owner = "client!ce", name = "E", descriptor = "[I")
	public static int[] anIntArray62 = new int[128];

	@OriginalMember(owner = "client!ce", name = "H", descriptor = "Lclient!gg;")
	public static Class28 aClass28_520 = Static107.method1838("0(U");

	@OriginalMember(owner = "client!ce", name = "I", descriptor = "[[S")
	public static short[][] aShortArrayArray1 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)Lclient!cf;")
	public static Class13 method563() {
		try {
			return (Class13) Class.forName("Class13_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(17) Throwable local17) {
			return null;
		}
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(I)V")
	public static void method565() {
		@Pc(7) boolean local7 = false;
		while (!local7) {
			local7 = true;
			for (@Pc(13) int local13 = 0; local13 < Static150.anInt3365 - 1; local13++) {
				if (Static176.aShortArray41[local13] < 1000 && Static176.aShortArray41[local13 + 1] > 1000) {
					local7 = false;
					@Pc(35) Class28 local35 = Static80.aClass28Array29[local13];
					Static80.aClass28Array29[local13] = Static80.aClass28Array29[local13 + 1];
					Static80.aClass28Array29[local13 + 1] = local35;
					@Pc(53) Class28 local53 = Static98.aClass28Array34[local13];
					Static98.aClass28Array34[local13] = Static98.aClass28Array34[local13 + 1];
					Static98.aClass28Array34[local13 + 1] = local53;
					@Pc(71) int local71 = Static133.anIntArray281[local13];
					Static133.anIntArray281[local13] = Static133.anIntArray281[local13 + 1];
					Static133.anIntArray281[local13 + 1] = local71;
					@Pc(89) int local89 = Static148.anIntArray315[local13];
					Static148.anIntArray315[local13] = Static148.anIntArray315[local13 + 1];
					Static148.anIntArray315[local13 + 1] = local89;
					@Pc(107) short local107 = Static176.aShortArray41[local13];
					Static176.aShortArray41[local13] = Static176.aShortArray41[local13 + 1];
					Static176.aShortArray41[local13 + 1] = local107;
					@Pc(125) long local125 = Static10.aLongArray2[local13];
					Static10.aLongArray2[local13] = Static10.aLongArray2[local13 + 1];
					Static10.aLongArray2[local13 + 1] = local125;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "(I)V")
	public static void method567() {
		aClass28_519 = null;
		aShortArrayArray1 = null;
		anIntArray62 = null;
		anIntArray63 = null;
		aClass28_520 = null;
	}
}
