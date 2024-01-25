import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static457 {

	@OriginalMember(owner = "client!pp", name = "s", descriptor = "[[B")
	public static byte[][] aByteArrayArray25;

	@OriginalMember(owner = "client!pp", name = "i", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_71 = new Class305(20, 3);

	@OriginalMember(owner = "client!pp", name = "j", descriptor = "I")
	public static int anInt7750 = 0;

	@OriginalMember(owner = "client!pp", name = "B", descriptor = "I")
	public static final int anInt7759 = 50;

	@OriginalMember(owner = "client!pp", name = "C", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray45 = new String[anInt7759];

	@OriginalMember(owner = "client!pp", name = "D", descriptor = "[I")
	public static final int[] anIntArray435 = new int[anInt7759];

	@OriginalMember(owner = "client!pp", name = "E", descriptor = "[I")
	public static final int[] anIntArray436 = new int[anInt7759];

	@OriginalMember(owner = "client!pp", name = "F", descriptor = "[[I")
	public static final int[][] anIntArrayArray41 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!pp", name = "G", descriptor = "[I")
	public static final int[] anIntArray437 = new int[anInt7759];

	@OriginalMember(owner = "client!pp", name = "H", descriptor = "[I")
	public static final int[] anIntArray438 = new int[anInt7759];

	@OriginalMember(owner = "client!pp", name = "J", descriptor = "[I")
	public static final int[] anIntArray439 = new int[anInt7759];

	@OriginalMember(owner = "client!pp", name = "K", descriptor = "[I")
	public static final int[] anIntArray440 = new int[anInt7759];

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IBI)Z")
	public static boolean method6552(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static214.method3395(arg1, arg0)) {
			return Static532.method7471(arg1, arg0) | (arg0 & 0xB000) != 0 | Static86.method1835(arg0, arg1) ? true : (Static653.method8768(arg1, arg0) | Static651.method8725(arg1, arg0)) & (arg1 & 0x37) == 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IB)V")
	public static void method6554(@OriginalArg(1) byte arg0) {
		if (Static104.aByteArrayArrayArray5 == null) {
			Static104.aByteArrayArrayArray5 = new byte[4][Static201.anInt3834][Static626.anInt10238];
		}
		for (@Pc(20) int local20 = 0; local20 < 4; local20++) {
			for (@Pc(23) int local23 = 0; local23 < Static201.anInt3834; local23++) {
				for (@Pc(26) int local26 = 0; local26 < Static626.anInt10238; local26++) {
					Static104.aByteArrayArrayArray5[local20][local23][local26] = arg0;
				}
			}
		}
	}
}
