import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!b", name = "n", descriptor = "[I")
	public static int[] anIntArray32;

	@OriginalMember(owner = "client!b", name = "G", descriptor = "Lclient!km;")
	public static Class91 aClass91_14;

	@OriginalMember(owner = "client!b", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString23 = "Discard";

	@OriginalMember(owner = "client!b", name = "u", descriptor = "[I")
	public static int[] anIntArray33 = new int[2];

	@OriginalMember(owner = "client!b", name = "y", descriptor = "[I")
	public static int[] anIntArray35 = new int[5];

	@OriginalMember(owner = "client!b", name = "B", descriptor = "I")
	public static int anInt278 = 0;

	@OriginalMember(owner = "client!b", name = "D", descriptor = "Z")
	public static boolean aBoolean23 = false;

	@OriginalMember(owner = "client!b", name = "I", descriptor = "J")
	public static long aLong18 = 0L;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IB)Lclient!og;")
	public static Class119 method289(@OriginalArg(0) int arg0) {
		@Pc(10) Class119 local10 = (Class119) Static296.aClass135_41.method3316((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(30) byte[] local30 = Static181.aClass91_145.method2495(Static272.method4159(arg0), Static256.method3920(arg0));
		local10 = new Class119();
		if (local30 != null) {
			local10.method3135(new Class1_Sub11(local30));
		}
		Static296.aClass135_41.method3321((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(ILclient!ti;)V")
	public static void method290(@OriginalArg(1) Class158 arg0) {
		Static54.aClass158_1 = arg0;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
	public static void method292() {
		if (Static69.anInt1506 == 5) {
			Static69.anInt1506 = 6;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(II)V")
	public static void method293() {
		Static71.aClass135_4.method3320(5);
	}
}
