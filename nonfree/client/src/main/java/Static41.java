import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!ic", name = "n", descriptor = "[I")
	public static int[] anIntArray242;

	@OriginalMember(owner = "client!ic", name = "F", descriptor = "I")
	public static int anInt1575;

	@OriginalMember(owner = "client!ic", name = "J", descriptor = "Lclient!qc;")
	public static Class50 aClass50_2;

	@OriginalMember(owner = "client!ic", name = "Q", descriptor = "I")
	public static int anInt1579;

	@OriginalMember(owner = "client!ic", name = "r", descriptor = "[B")
	public static byte[] aByteArray14 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

	@OriginalMember(owner = "client!ic", name = "s", descriptor = "[I")
	public static int[] anIntArray244 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!ic", name = "t", descriptor = "Lclient!lc;")
	public static Class31 aClass31_569 = Static56.method1206("@gr2@");

	@OriginalMember(owner = "client!ic", name = "w", descriptor = "[I")
	public static int[] anIntArray245 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!ic", name = "D", descriptor = "I")
	public static int anInt1573 = 0;

	@OriginalMember(owner = "client!ic", name = "I", descriptor = "[I")
	public static int[] anIntArray246 = new int[200];

	@OriginalMember(owner = "client!ic", name = "K", descriptor = "I")
	public static int anInt1577 = -1;

	@OriginalMember(owner = "client!ic", name = "N", descriptor = "I")
	public static int anInt1578 = -1;

	@OriginalMember(owner = "client!ic", name = "P", descriptor = "J")
	public static long aLong45 = 0L;

	@OriginalMember(owner = "client!ic", name = "R", descriptor = "I")
	public static int anInt1580 = -1;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IBLclient!qd;)V")
	public static void method1052(@OriginalArg(2) Class51 arg0) {
		Static56.method1229(arg0);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IJ)V")
	public static void method1053(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static88.anInt2367 >= 100) {
			Static74.method1397(Static10.aClass31_131, 0, Static39.aClass31_531);
			return;
		}
		@Pc(25) Class31 local25 = Static39.method1010(arg0).method1196();
		for (@Pc(27) int local27 = 0; local27 < Static88.anInt2367; local27++) {
			if (Static16.aLongArray2[local27] == arg0) {
				Static74.method1397(Static37.method974(new Class31[] { local25, Static13.aClass31_182 }), 0, Static39.aClass31_531);
				return;
			}
		}
		for (@Pc(64) int local64 = 0; local64 < Static34.anInt1312; local64++) {
			if (arg0 == Static45.aLongArray4[local64]) {
				Static74.method1397(Static37.method974(new Class31[] { Static53.aClass31_638, local25, Static63.aClass31_745 }), 0, Static39.aClass31_531);
				return;
			}
		}
		Static16.aLongArray2[Static88.anInt2367++] = arg0;
		Static92.aBoolean81 = true;
		Static20.aClass2_Sub6_Sub1_11.method684(186);
		Static20.aClass2_Sub6_Sub1_11.method626(arg0);
	}

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "(I)V")
	public static void method1054() {
		anIntArray245 = null;
		Class1_Sub2.anIntArray243 = null;
		aByteArray14 = null;
		aClass50_2 = null;
		aClass31_569 = null;
		anIntArray244 = null;
		anIntArray246 = null;
		anIntArray242 = null;
	}
}
