import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!d", name = "Q", descriptor = "Lclient!dd;")
	public static Class14 aClass14_5;

	@OriginalMember(owner = "client!d", name = "x", descriptor = "Lclient!ic;")
	private static Class34 aClass34_301 = Static56.method816("We suspect someone knows your password)3");

	@OriginalMember(owner = "client!d", name = "u", descriptor = "Lclient!ic;")
	public static Class34 aClass34_300 = aClass34_301;

	@OriginalMember(owner = "client!d", name = "w", descriptor = "Lclient!af;")
	public static Class7 aClass7_1 = new Class7(32);

	@OriginalMember(owner = "client!d", name = "y", descriptor = "Lclient!ic;")
	public static Class34 aClass34_302 = Static56.method816("<br>");

	@OriginalMember(owner = "client!d", name = "A", descriptor = "Lclient!ic;")
	public static Class34 aClass34_303 = Static56.method816("Bitte warten Sie)3)3)3");

	@OriginalMember(owner = "client!d", name = "G", descriptor = "[I")
	public static int[] anIntArray67 = new int[50];

	@OriginalMember(owner = "client!d", name = "H", descriptor = "Z")
	public static boolean aBoolean31 = false;

	@OriginalMember(owner = "client!d", name = "I", descriptor = "Lclient!ic;")
	private static Class34 aClass34_304 = Static56.method816("Bad session id)3");

	@OriginalMember(owner = "client!d", name = "J", descriptor = "Lclient!m;")
	public static Class49 aClass49_2 = new Class49();

	@OriginalMember(owner = "client!d", name = "K", descriptor = "Lclient!ic;")
	private static Class34 aClass34_305 = Static56.method816(" is already on your ignore list)3");

	@OriginalMember(owner = "client!d", name = "L", descriptor = "Lclient!ic;")
	private static Class34 aClass34_306 = Static56.method816("Password: ");

	@OriginalMember(owner = "client!d", name = "M", descriptor = "Lclient!ic;")
	public static Class34 aClass34_307 = aClass34_306;

	@OriginalMember(owner = "client!d", name = "N", descriptor = "[Lclient!ic;")
	public static Class34[] aClass34Array8 = new Class34[8];

	@OriginalMember(owner = "client!d", name = "O", descriptor = "Lclient!ic;")
	public static Class34 aClass34_308 = aClass34_304;

	@OriginalMember(owner = "client!d", name = "P", descriptor = "Lclient!ic;")
	public static Class34 aClass34_309 = aClass34_305;

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V")
	public static void method367() {
		if (Static63.aString2.toLowerCase().indexOf("microsoft") != -1) {
			Static116.anIntArray361[222] = 59;
			Static116.anIntArray361[188] = 71;
			Static116.anIntArray361[189] = 26;
			Static116.anIntArray361[192] = 58;
			Static116.anIntArray361[223] = 28;
			Static116.anIntArray361[221] = 43;
			Static116.anIntArray361[220] = 74;
			Static116.anIntArray361[191] = 73;
			Static116.anIntArray361[186] = 57;
			Static116.anIntArray361[187] = 27;
			Static116.anIntArray361[190] = 72;
			Static116.anIntArray361[219] = 42;
			return;
		}
		Static116.anIntArray361[47] = 73;
		Static116.anIntArray361[45] = 26;
		Static116.anIntArray361[59] = 57;
		Static116.anIntArray361[91] = 42;
		Static116.anIntArray361[44] = 71;
		if (Static63.aMethod1 == null) {
			Static116.anIntArray361[192] = 58;
			Static116.anIntArray361[222] = 59;
		} else {
			Static116.anIntArray361[192] = 28;
			Static116.anIntArray361[520] = 59;
			Static116.anIntArray361[222] = 58;
		}
		Static116.anIntArray361[92] = 74;
		Static116.anIntArray361[93] = 43;
		Static116.anIntArray361[61] = 27;
		Static116.anIntArray361[46] = 72;
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(B)V")
	public static void method368() {
		aClass34_307 = null;
		aClass34_305 = null;
		aClass34_308 = null;
		aClass34_309 = null;
		aClass34_304 = null;
		aClass34_302 = null;
		aClass7_1 = null;
		aClass34Array8 = null;
		aClass34_303 = null;
		aClass34_306 = null;
		aClass34_300 = null;
		aClass34_301 = null;
		aClass14_5 = null;
		aClass49_2 = null;
		anIntArray67 = null;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "([BB)[B")
	public static byte[] method369(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class8_Sub20 local8 = new Class8_Sub20(arg0);
		@Pc(12) int local12 = local8.method1872();
		@Pc(21) int local21 = local8.method1853();
		if (local21 < 0 || Static53.anInt1362 != 0 && local21 > Static53.anInt1362) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(47) byte[] local47 = new byte[local21];
			local8.method1846(local21, local47);
			return local47;
		} else {
			@Pc(59) int local59 = local8.method1853();
			if (local59 < 0 || Static53.anInt1362 != 0 && Static53.anInt1362 < local59) {
				throw new RuntimeException();
			}
			@Pc(79) byte[] local79 = new byte[local59];
			if (local12 == 1) {
				Static89.method1318(local79, local59, arg0, local21);
			} else {
				Static125.aClass78_1.method1930(local79, local8);
			}
			return local79;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Z")
	public static boolean method370(@OriginalArg(1) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}
}
