import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!vh", name = "d", descriptor = "[I")
	public static int[] anIntArray424 = new int[128];

	@OriginalMember(owner = "client!vh", name = "e", descriptor = "Lclient!rf;")
	private static Class70 aClass70_1547 = Static49.method1293("Connecting to server)3)3)3");

	@OriginalMember(owner = "client!vh", name = "f", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1548 = aClass70_1547;

	@OriginalMember(owner = "client!vh", name = "g", descriptor = "Lclient!rf;")
	private static Class70 aClass70_1549 = Static49.method1293("Loading)3)3)3");

	@OriginalMember(owner = "client!vh", name = "h", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1550 = aClass70_1549;

	@OriginalMember(owner = "client!vh", name = "i", descriptor = "Lclient!fc;")
	public static Class25 aClass25_29 = new Class25(5);

	@OriginalMember(owner = "client!vh", name = "j", descriptor = "[I")
	public static int[] anIntArray425 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
	public static void method3439() {
		anIntArray424 = null;
		aClass70_1549 = null;
		aClass70_1550 = null;
		aClass70_1547 = null;
		aClass70_1548 = null;
		anIntArray425 = null;
		aClass25_29 = null;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)V")
	public static void method3440(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static126.aBooleanArray5[arg0]) {
			return;
		}
		Static144.aClass76_113.method3313(arg0);
		if (Static77.aClass39ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(25) boolean local25 = true;
		for (@Pc(27) int local27 = 0; local27 < Static77.aClass39ArrayArray1[arg0].length; local27++) {
			if (Static77.aClass39ArrayArray1[arg0][local27] != null) {
				if (Static77.aClass39ArrayArray1[arg0][local27].anInt2342 == 2) {
					local25 = false;
				} else {
					Static77.aClass39ArrayArray1[arg0][local27] = null;
				}
			}
		}
		if (local25) {
			Static77.aClass39ArrayArray1[arg0] = null;
		}
		Static126.aBooleanArray5[arg0] = false;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(III)V")
	public static void method3441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub17 local7 = Static90.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass7_1 = null;
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(BLclient!u;ZLclient!u;)V")
	public static void method3442(@OriginalArg(1) Class76 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class76 arg2) {
		Static162.aBoolean166 = arg1;
		Static85.aClass76_73 = arg2;
		Static74.aClass76_64 = arg0;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)I")
	public static int method3443() {
		@Pc(14) int local14 = Static156.method3142(Static79.anInt2448, Static56.anInt1784, Static83.anInt4536);
		return local14 - Static33.anInt1073 >= 800 || (Static20.aByteArrayArrayArray1[Static56.anInt1784][Static79.anInt2448 >> 7][Static83.anInt4536 >> 7] & 0x4) == 0 ? 3 : Static56.anInt1784;
	}
}
