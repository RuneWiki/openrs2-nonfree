import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "Lclient!jd;")
	public static Class36 aClass36_71;

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1261 = Static2.method66("@whi@");

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1262 = Static2.method66("Konfig geladen)3");

	@OriginalMember(owner = "client!pa", name = "h", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1263 = Static2.method66("headicons_pk");

	@OriginalMember(owner = "client!pa", name = "l", descriptor = "[I")
	public static int[] anIntArray335 = new int[50];

	@OriginalMember(owner = "client!pa", name = "n", descriptor = "I")
	public static int anInt2768 = 255;

	@OriginalMember(owner = "client!pa", name = "o", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1264 = Static2.method66("_");

	@OriginalMember(owner = "client!pa", name = "p", descriptor = "I")
	public static int anInt2769 = 0;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!jd;ILclient!jd;)V")
	public static void method1965(@OriginalArg(0) Class36 arg0, @OriginalArg(2) Class36 arg1) {
		Static53.aClass36_34 = arg0;
		Static100.aClass36_69 = arg1;
		Static87.anInt2325 = Static53.aClass36_34.method1763(3);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
	public static void method1968() {
		Static61.aClass54_17.method1635();
		Static64.aClass54_20.method1635();
		Static39.aClass54_10.method1635();
		Static58.aClass54_15.method1635();
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)V")
	public static void method1969() {
		aClass39_1263 = null;
		aClass39_1261 = null;
		aClass39_1262 = null;
		aClass39_1264 = null;
		anIntArray335 = null;
		aClass36_71 = null;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIII)I")
	public static int method1971(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(20) int local20 = 65536 - Class2_Sub1_Sub4_Sub4.anIntArray358[arg1 * 1024 / arg0] >> 1;
		return (local20 * arg3 >> 16) + (arg2 * (65536 - local20) >> 16);
	}
}
