import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!le", name = "h", descriptor = "I")
	public static int anInt2541;

	@OriginalMember(owner = "client!le", name = "k", descriptor = "Lclient!te;")
	public static Class1_Sub2_Sub1 aClass1_Sub2_Sub1_4;

	@OriginalMember(owner = "client!le", name = "n", descriptor = "Lclient!me;")
	public static Class71 aClass71_23;

	@OriginalMember(owner = "client!le", name = "o", descriptor = "I")
	public static int anInt2544;

	@OriginalMember(owner = "client!le", name = "q", descriptor = "I")
	public static int anInt2545;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "Lclient!ia;")
	private static Class51 aClass51_853 = Static64.method1101(" ");

	@OriginalMember(owner = "client!le", name = "e", descriptor = "Lclient!ie;")
	public static Class53 aClass53_19 = new Class53(100);

	@OriginalMember(owner = "client!le", name = "i", descriptor = "Lclient!ia;")
	public static Class51 aClass51_854 = aClass51_853;

	@OriginalMember(owner = "client!le", name = "j", descriptor = "I")
	public static int anInt2542 = 0;

	@OriginalMember(owner = "client!le", name = "l", descriptor = "Z")
	public static boolean aBoolean104 = false;

	@OriginalMember(owner = "client!le", name = "m", descriptor = "I")
	public static int anInt2543 = -1;

	@OriginalMember(owner = "client!le", name = "p", descriptor = "Lclient!ia;")
	public static Class51 aClass51_855 = Static64.method1101("(U1");

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ILclient!mb;I)Z")
	public static boolean method1947(@OriginalArg(1) Class70 arg0, @OriginalArg(2) int arg1) {
		@Pc(13) byte[] local13 = arg0.method3524(arg1);
		if (local13 == null) {
			return false;
		} else {
			Static183.method3084(local13);
			return true;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!mb;IBI)[Lclient!lc;")
	public static Class41[] method1948(@OriginalArg(0) Class70 arg0, @OriginalArg(1) int arg1) {
		return Static36.method640(arg1, arg0) ? Static150.method2579() : null;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
	public static void method1949() {
		if (!Static82.aBoolean82) {
			return;
		}
		@Pc(11) Class71 local11 = Static29.method527(Static76.anInt1699, Static211.anInt4507);
		if (local11 != null && local11.anObjectArray28 != null) {
			@Pc(25) Class1_Sub21 local25 = new Class1_Sub21();
			local25.aClass71_25 = local11;
			local25.anObjectArray32 = local11.anObjectArray28;
			Static65.method1119(local25);
		}
		Static82.aBoolean82 = false;
		Static82.method1438(local11);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IZ)V")
	public static void method1951() {
		Static110.method1049(Static9.anInt179, Static185.anInt4016, false, Static90.anInt4701);
	}
}
