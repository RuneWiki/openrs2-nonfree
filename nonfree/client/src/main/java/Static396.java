import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static396 {

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "[Lclient!ya;")
	public static Class96[] aClass96Array5;

	@OriginalMember(owner = "client!tt", name = "d", descriptor = "[[S")
	public static final short[][] aShortArrayArray7 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IZ)Lclient!it;")
	public static Class122 method5457(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if ((double) Static377.aFloat69 == 3.0D) {
				return Static414.aClass122_16;
			}
			if ((double) Static377.aFloat69 == 4.0D) {
				return Static11.aClass122_1;
			}
			if ((double) Static377.aFloat69 == 6.0D) {
				return Static51.aClass122_4;
			}
			if ((double) Static377.aFloat69 >= 8.0D) {
				return Static448.aClass122_17;
			}
		} else if (arg0 == 1) {
			if ((double) Static377.aFloat69 == 3.0D) {
				return Static51.aClass122_4;
			}
			if ((double) Static377.aFloat69 == 4.0D) {
				return Static448.aClass122_17;
			}
			if ((double) Static377.aFloat69 == 6.0D) {
				return Static168.aClass122_5;
			}
			if ((double) Static377.aFloat69 >= 8.0D) {
				return Static141.aClass122_7;
			}
		} else if (arg0 == 2) {
			if ((double) Static377.aFloat69 == 3.0D) {
				return Static168.aClass122_5;
			}
			if ((double) Static377.aFloat69 == 4.0D) {
				return Static141.aClass122_7;
			}
			if ((double) Static377.aFloat69 == 6.0D) {
				return Static105.aClass122_6;
			}
			if ((double) Static377.aFloat69 >= 8.0D) {
				return Static433.aClass122_19;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIBII)V")
	public static void method5459(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		Static164.anInt6595 = arg0;
		Static362.anInt6654 = 0;
		Static105.anInt2417 = 0;
		Static70.anInt1843 = arg1;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIB)B")
	public static byte method5460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
