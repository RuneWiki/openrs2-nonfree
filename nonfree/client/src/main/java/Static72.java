import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!mb", name = "lb", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!mb", name = "eb", descriptor = "Lclient!he;")
	private static Class26 aClass26_1030 = Static6.method100("Loading)3)3)3");

	@OriginalMember(owner = "client!mb", name = "Y", descriptor = "Lclient!he;")
	public static Class26 aClass26_1028 = aClass26_1030;

	@OriginalMember(owner = "client!mb", name = "Z", descriptor = "Lclient!se;")
	public static Class65 aClass65_51 = new Class65();

	@OriginalMember(owner = "client!mb", name = "ab", descriptor = "[I")
	public static int[] anIntArray197 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!mb", name = "cb", descriptor = "Lclient!he;")
	public static Class26 aClass26_1029 = Static6.method100("Bitte starten Sie eine Mitgliedschaft");

	@OriginalMember(owner = "client!mb", name = "fb", descriptor = "Lclient!he;")
	public static Class26 aClass26_1031 = Static6.method100("<br>(X");

	@OriginalMember(owner = "client!mb", name = "hb", descriptor = "[Z")
	public static boolean[] aBooleanArray19 = new boolean[100];

	@OriginalMember(owner = "client!mb", name = "jb", descriptor = "Lclient!he;")
	private static Class26 aClass26_1032 = Static6.method100("Members object");

	@OriginalMember(owner = "client!mb", name = "kb", descriptor = "Lclient!he;")
	private static Class26 aClass26_1033 = Static6.method100("glow1:");

	@OriginalMember(owner = "client!mb", name = "mb", descriptor = "I")
	public static int anInt2055 = -1;

	@OriginalMember(owner = "client!mb", name = "pb", descriptor = "Lclient!he;")
	private static Class26 aClass26_1036 = Static6.method100("Unexpected loginserver response)3");

	@OriginalMember(owner = "client!mb", name = "nb", descriptor = "Lclient!he;")
	public static Class26 aClass26_1034 = aClass26_1036;

	@OriginalMember(owner = "client!mb", name = "ob", descriptor = "Lclient!he;")
	public static Class26 aClass26_1035 = Static6.method100("titlebutton");

	@OriginalMember(owner = "client!mb", name = "qb", descriptor = "I")
	public static int anInt2056 = 0;

	@OriginalMember(owner = "client!mb", name = "rb", descriptor = "I")
	public static int anInt2057 = 0;

	@OriginalMember(owner = "client!mb", name = "sb", descriptor = "Lclient!he;")
	public static Class26 aClass26_1037 = aClass26_1033;

	@OriginalMember(owner = "client!mb", name = "tb", descriptor = "Lclient!he;")
	public static Class26 aClass26_1038 = aClass26_1033;

	@OriginalMember(owner = "client!mb", name = "ub", descriptor = "Lclient!he;")
	public static Class26 aClass26_1039 = aClass26_1032;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLclient!he;III)V")
	public static void method1330(@OriginalArg(1) Class26 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class3_Sub14 local8 = Static89.method1642(arg2, arg3);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray6 != null) {
			@Pc(18) Class3_Sub15 local18 = new Class3_Sub15();
			local18.aClass3_Sub14_11 = local8;
			local18.anObjectArray28 = local8.anObjectArray6;
			local18.aClass26_1191 = arg0;
			local18.anInt2353 = arg1;
			Static28.method595(local18);
		}
		@Pc(36) boolean local36 = true;
		if (local8.anInt2186 > 0) {
			local36 = Static5.method2202(local8);
		}
		if (!local36 || !Static73.method1342(arg1 - 1, Static89.method1641(local8))) {
			return;
		}
		if (arg1 == 1) {
			Static107.aClass3_Sub11_Sub1_3.method1029(113);
			Static107.aClass3_Sub11_Sub1_3.method1001(arg2);
			Static107.aClass3_Sub11_Sub1_3.method972(arg3);
		}
		if (arg1 == 2) {
			Static107.aClass3_Sub11_Sub1_3.method1029(37);
			Static107.aClass3_Sub11_Sub1_3.method1001(arg2);
			Static107.aClass3_Sub11_Sub1_3.method972(arg3);
		}
		if (arg1 == 3) {
			Static107.aClass3_Sub11_Sub1_3.method1029(134);
			Static107.aClass3_Sub11_Sub1_3.method1001(arg2);
			Static107.aClass3_Sub11_Sub1_3.method972(arg3);
		}
		if (arg1 == 4) {
			Static107.aClass3_Sub11_Sub1_3.method1029(137);
			Static107.aClass3_Sub11_Sub1_3.method1001(arg2);
			Static107.aClass3_Sub11_Sub1_3.method972(arg3);
		}
		if (arg1 == 5) {
			Static107.aClass3_Sub11_Sub1_3.method1029(140);
			Static107.aClass3_Sub11_Sub1_3.method1001(arg2);
			Static107.aClass3_Sub11_Sub1_3.method972(arg3);
		}
		if (arg1 == 6) {
			Static107.aClass3_Sub11_Sub1_3.method1029(210);
			Static107.aClass3_Sub11_Sub1_3.method1001(arg2);
			Static107.aClass3_Sub11_Sub1_3.method972(arg3);
		}
		if (arg1 == 7) {
			Static107.aClass3_Sub11_Sub1_3.method1029(148);
			Static107.aClass3_Sub11_Sub1_3.method1001(arg2);
			Static107.aClass3_Sub11_Sub1_3.method972(arg3);
		}
		if (arg1 == 8) {
			Static107.aClass3_Sub11_Sub1_3.method1029(104);
			Static107.aClass3_Sub11_Sub1_3.method1001(arg2);
			Static107.aClass3_Sub11_Sub1_3.method972(arg3);
		}
		if (arg1 == 9) {
			Static107.aClass3_Sub11_Sub1_3.method1029(9);
			Static107.aClass3_Sub11_Sub1_3.method1001(arg2);
			Static107.aClass3_Sub11_Sub1_3.method972(arg3);
		}
		if (arg1 == 10) {
			Static107.aClass3_Sub11_Sub1_3.method1029(28);
			Static107.aClass3_Sub11_Sub1_3.method1001(arg2);
			Static107.aClass3_Sub11_Sub1_3.method972(arg3);
		}
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(Z)V")
	public static void method1333() {
		aClass26_1032 = null;
		aClass26_1028 = null;
		aClass26_1037 = null;
		aClass26_1036 = null;
		aClass26_1039 = null;
		aFont1 = null;
		aClass26_1035 = null;
		aClass26_1029 = null;
		aClass26_1031 = null;
		anIntArray197 = null;
		aBooleanArray19 = null;
		aClass26_1033 = null;
		aClass26_1034 = null;
		aClass26_1038 = null;
		aClass26_1030 = null;
		aClass65_51 = null;
	}
}
