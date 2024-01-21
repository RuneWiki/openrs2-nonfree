import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!hd", name = "F", descriptor = "J")
	public static long aLong56;

	@OriginalMember(owner = "client!hd", name = "K", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_517 = Static151.method2243("RuneScape is loading )2 please wait)3)3)3");

	@OriginalMember(owner = "client!hd", name = "z", descriptor = "Lclient!mb;")
	public static Class62 aClass62_514 = aClass62_517;

	@OriginalMember(owner = "client!hd", name = "A", descriptor = "[I")
	public static final int[] anIntArray126 = new int[128];

	@OriginalMember(owner = "client!hd", name = "D", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_515 = Static151.method2243("zur-Uck auf die RuneScape)2Webseite gehen");

	@OriginalMember(owner = "client!hd", name = "G", descriptor = "I")
	public static int anInt1498 = 0;

	@OriginalMember(owner = "client!hd", name = "H", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_516 = Static151.method2243(":clan:");

	@OriginalMember(owner = "client!hd", name = "L", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_518 = Static151.method2243("sich mit einer anderen Welt zu verbinden)3");

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)V")
	public static void method1015() {
		Static32.aClass79_2.method2351();
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IBIIII)V")
	public static void method1017(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(3) int local3 = arg3; local3 <= arg1; local3++) {
			Static19.method345(arg4, Static55.anIntArrayArray8[local3], arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IBIIIIII)V")
	public static void method1018(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 < 1 || arg0 < 1 || arg5 > 102 || arg0 > 102) {
			return;
		}
		if (Static60.aBoolean52 && Static126.anInt2806 != arg1) {
			return;
		}
		@Pc(33) int local33 = arg1;
		if (arg1 < 3 && (Static133.aByteArrayArrayArray11[1][arg5][arg0] & 0x2) == 2) {
			local33 = arg1 + 1;
		}
		Static80.method1132(arg5, arg1, arg0, Static164.aClass95Array1[arg1], local33, arg6);
		if (arg4 >= 0) {
			Static146.method2191(arg2, arg4, arg1, false, arg5, arg0, arg3, Static164.aClass95Array1[arg1], local33, false);
		}
	}
}
