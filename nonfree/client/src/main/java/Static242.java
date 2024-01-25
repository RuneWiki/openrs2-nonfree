import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!mb", name = "Q", descriptor = "I")
	public static int anInt4338;

	@OriginalMember(owner = "client!mb", name = "S", descriptor = "[[[J")
	public static long[][][] aLongArrayArrayArray1;

	@OriginalMember(owner = "client!mb", name = "T", descriptor = "[[B")
	public static byte[][] aByteArrayArray83;

	@OriginalMember(owner = "client!mb", name = "N", descriptor = "Lclient!wo;")
	public static final Class266 aClass266_36 = new Class266();

	@OriginalMember(owner = "client!mb", name = "R", descriptor = "I")
	public static int anInt4339 = 0;

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "(I)V")
	public static void method3586() {
		if (Static389.aClass128_Sub1_1.method2984(Static285.anInt7839) || Static424.anInt7348 == Static152.anInt2600) {
			Static321.method4524(Static276.aClass109_10);
			if (Static152.anInt2600 != Static150.anInt2560) {
				Static109.method1679();
			}
		} else {
			Static149.method2261(false, false, Static13.anInt330, Static138.anInt2346);
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(CB)C")
	public static char method3587(@OriginalArg(0) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "(I)V")
	public static void method3588() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static193.aBooleanArray3[local3] = false;
		}
		Static310.anInt5542 = -1;
		Static132.anInt2279 = 0;
		Static198.anInt3609 = 0;
		Static66.anInt1365 = -1;
		Static310.anInt5540 = 1;
	}
}
