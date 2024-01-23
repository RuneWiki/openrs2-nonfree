import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!pa", name = "r", descriptor = "[Lclient!pn;")
	public static Class1_Sub2_Sub11[] aClass1_Sub2_Sub11Array6;

	@OriginalMember(owner = "client!pa", name = "g", descriptor = "Lclient!qc;")
	public static Class135 aClass135_20 = new Class135(64);

	@OriginalMember(owner = "client!pa", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString236 = "Loaded update list";

	@OriginalMember(owner = "client!pa", name = "k", descriptor = "[I")
	public static int[] anIntArray359 = new int[128];

	@OriginalMember(owner = "client!pa", name = "m", descriptor = "I")
	public static int anInt4017 = 0;

	@OriginalMember(owner = "client!pa", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString237 = null;

	@OriginalMember(owner = "client!pa", name = "o", descriptor = "Lclient!qc;")
	public static Class135 aClass135_21 = new Class135(64);

	@OriginalMember(owner = "client!pa", name = "p", descriptor = "Z")
	public static boolean aBoolean305 = false;

	@OriginalMember(owner = "client!pa", name = "q", descriptor = "[C")
	public static char[] aCharArray5 = new char[128];

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)V")
	public static void method3207() {
		for (@Pc(13) Class1_Sub20 local13 = (Class1_Sub20) Static80.aClass61_3.method1835(); local13 != null; local13 = (Class1_Sub20) Static80.aClass61_3.method1836()) {
			if (local13.anInt3346 == -1) {
				local13.anInt3347 = 0;
				Static178.method3182(local13);
			} else {
				local13.method4441();
			}
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZIIZLclient!fa;BLclient!fa;)I")
	public static int method3208(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class41_Sub1 arg4, @OriginalArg(6) Class41_Sub1 arg5) {
		@Pc(10) int local10 = Static76.method1316(arg4, arg5, arg2, arg0);
		if (local10 != 0) {
			return arg0 ? -local10 : local10;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(40) int local40 = Static76.method1316(arg4, arg5, arg1, arg3);
			return arg3 ? -local40 : local40;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)V")
	public static void method3209() {
		if (Static73.aClass62ArrayArray1 == null) {
			return;
		}
		@Pc(7) Class62 local7 = new Class62();
		for (@Pc(9) int local9 = 0; local9 < 13; local9++) {
			for (@Pc(14) int local14 = 0; local14 < 13; local14++) {
				Static73.aClass62ArrayArray1[local9][local14] = local7;
			}
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILclient!km;)V")
	public static void method3210(@OriginalArg(1) Class91 arg0) {
		Static121.aClass91_96 = arg0;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "([Ljava/lang/Object;Z[J)V")
	public static void method3211(@OriginalArg(0) Object[] arg0, @OriginalArg(2) long[] arg1) {
		Static66.method1196(0, arg1, arg1.length - 1, arg0);
	}
}
