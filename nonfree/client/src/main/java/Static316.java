import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static316 {

	@OriginalMember(owner = "client!mp", name = "q", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray22;

	@OriginalMember(owner = "client!mp", name = "r", descriptor = "Lclient!iba;")
	public static Class141 aClass141_1;

	@OriginalMember(owner = "client!mp", name = "c", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_132 = new Class40(3, 9);

	@OriginalMember(owner = "client!mp", name = "m", descriptor = "[I")
	public static final int[] anIntArray514 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!mp", name = "s", descriptor = "Lclient!nl;")
	public static final Class214 aClass214_10 = new Class214(2);

	@OriginalMember(owner = "client!mp", name = "t", descriptor = "I")
	public static int anInt5715 = 0;

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(BIIIII)V")
	public static void method4905(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 >= Static235.anInt3970 && Static151.anInt2683 >= arg0 && arg1 >= Static134.anInt2364 && arg2 <= Static60.anInt971) {
			Static85.method1346(arg3, arg4, arg1, arg0, arg2);
		} else {
			Static481.method6681(arg0, arg2, arg3, arg4, arg1);
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method4906(@OriginalArg(1) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(13) int local13 = local8.length() - 3; local13 > 0; local13 -= 3) {
			local8 = local8.substring(0, local13) + "," + local8.substring(local13);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static141.aClass104_78.method2145(Static470.anInt7957) + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static141.aClass104_80.method2145(Static470.anInt7957) + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(II)I")
	public static int method4907(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
