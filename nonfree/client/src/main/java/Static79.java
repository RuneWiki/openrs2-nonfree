import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!ff", name = "V", descriptor = "I")
	public static int anInt1910;

	@OriginalMember(owner = "client!ff", name = "X", descriptor = "I")
	public static int anInt1912;

	@OriginalMember(owner = "client!ff", name = "ab", descriptor = "[I")
	public static int[] anIntArray191;

	@OriginalMember(owner = "client!ff", name = "bb", descriptor = "Lclient!qi;")
	public static Class81 aClass81_2;

	@OriginalMember(owner = "client!ff", name = "cb", descriptor = "Lclient!vn;")
	public static Class188 aClass188_2;

	@OriginalMember(owner = "client!ff", name = "U", descriptor = "Lclient!l;")
	public static Class98 aClass98_13 = new Class98(500);

	@OriginalMember(owner = "client!ff", name = "Y", descriptor = "I")
	public static int anInt1913 = -1;

	@OriginalMember(owner = "client!ff", name = "Z", descriptor = "I")
	public static int anInt1914 = 0;

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(B)V")
	public static void method1657() {
		Static22.anIntArray33 = null;
		Static5.aByteArrayArrayArray1 = null;
		Static220.aByteArrayArrayArray19 = null;
		Static310.aByteArrayArrayArray20 = null;
		Static104.anIntArrayArrayArray6 = null;
		Static131.anIntArray295 = null;
		Static144.anIntArray527 = null;
		Static83.anIntArray154 = null;
		Static86.aByteArrayArrayArray14 = null;
		Static188.aByteArrayArrayArray17 = null;
		Static152.anIntArray331 = null;
		Static12.anIntArray20 = null;
	}

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "(II)Ljava/lang/String;")
	public static String method1659(@OriginalArg(1) int arg0) {
		if (arg0 >= 100000) {
			return arg0 < 10000000 ? "<col=ffffff>" + arg0 / 1000 + Static280.aString148 + "</col>" : "<col=00ff80>" + arg0 / 1000000 + Static88.aString69 + "</col>";
		} else {
			return "<col=ffff00>" + arg0 + "</col>";
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public static int method1660(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < Static285.anInt5735; local12++) {
			if (arg0.equalsIgnoreCase(Static286.aStringArray37[local12])) {
				return local12;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ff", name = "i", descriptor = "(I)I")
	public static int method1662() {
		return Static176.aBoolean234 && Static95.aBooleanArray39[81] && Static152.anInt2876 > 2 ? Static153.anIntArray332[Static152.anInt2876 - 2] : Static153.anIntArray332[Static152.anInt2876 - 1];
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZIIIIIIIIIB)V")
	public static void method1663(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (Static136.aClass10_Sub5_Sub1_1.method4186() == 2) {
			Static145.method2483(arg8, arg4, arg7, arg0, arg3, arg1, arg5, arg6, arg2);
		} else if (Static136.aClass10_Sub5_Sub1_1.method4186() > 2) {
			Static110.method1778(arg8, arg7, arg4, arg6, arg2, Static136.aClass10_Sub5_Sub1_1.method4186(), arg5, arg1, arg0, arg3);
		} else {
			Static156.method2597(arg6, arg4, arg8, arg5, arg7, arg0, arg1, arg3, arg2);
		}
	}
}
