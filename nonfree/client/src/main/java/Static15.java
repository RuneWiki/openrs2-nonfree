import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "I")
	public static int anInt335;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "Lclient!qe;")
	public static Class78 aClass78_51 = Static199.method3560("logo");

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "I")
	public static int anInt334 = 0;

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "[Lclient!qe;")
	public static Class78[] aClass78Array1 = new Class78[100];

	@OriginalMember(owner = "client!bb", name = "g", descriptor = "[Z")
	public static boolean[] aBooleanArray11 = new boolean[8];

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)Lclient!uj;")
	public static Class79 method241() {
		@Pc(25) Class79_Sub1 local25 = new Class79_Sub1(Static142.anInt3236, Static100.anInt2184, Static186.anIntArray702[0], Static37.anIntArray108[0], Static113.anIntArray423[0], Static131.anIntArray489[0], Static31.aByteArrayArray3[0], Static198.anIntArray725);
		Static28.method365();
		return local25;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IZ)V")
	public static void method243(@OriginalArg(0) int arg0) {
		if (Static9.anInt274 == 0) {
			Static39.aClass2_Sub21_Sub2_1.method2797(arg0);
		} else {
			Static81.anInt1743 = arg0;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(BI)I")
	public static int method244(@OriginalArg(0) byte arg0) {
		if (arg0 >= 65 && arg0 <= 90) {
			return arg0 - 65;
		} else if (arg0 >= 97 && arg0 <= 122) {
			return arg0 + 26 - 97;
		} else if (arg0 >= 48 && arg0 <= 57) {
			return arg0 + 52 - 48;
		} else if (arg0 == 43) {
			return 62;
		} else if (arg0 == 42) {
			return 62;
		} else if (arg0 == 47) {
			return 63;
		} else if (arg0 == 45) {
			return 63;
		} else {
			return -1;
		}
	}
}
