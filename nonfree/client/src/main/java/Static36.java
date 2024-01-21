import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
	public static int anInt1110;

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "Lclient!mb;")
	public static Class42 aClass42_28;

	@OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
	public static int anInt1111;

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "[I")
	public static int[] anIntArray78;

	@OriginalMember(owner = "client!hc", name = "q", descriptor = "[Lclient!vb;")
	public static Class3_Sub1_Sub1_Sub4[] aClass3_Sub1_Sub1_Sub4Array23;

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "Lclient!fe;")
	public static Class3_Sub1_Sub6 aClass3_Sub1_Sub6_1 = new Class3_Sub1_Sub6();

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "Lclient!v;")
	public static Class62 aClass62_473 = Static45.method753("Spiel)2Fenster geladen)3");

	@OriginalMember(owner = "client!hc", name = "l", descriptor = "Lclient!v;")
	public static Class62 aClass62_474 = Static45.method753("_");

	@OriginalMember(owner = "client!hc", name = "m", descriptor = "Lclient!v;")
	public static Class62 aClass62_475 = Static45.method753("(U");

	@OriginalMember(owner = "client!hc", name = "n", descriptor = "Lclient!v;")
	public static Class62 aClass62_476 = Static45.method753("Passwort: ");

	@OriginalMember(owner = "client!hc", name = "o", descriptor = "Lclient!v;")
	public static Class62 aClass62_477 = Static45.method753("backvmid2");

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILclient!mb;)V")
	public static void method665(@OriginalArg(1) Class42 arg0) {
		Static58.aClass42_44 = arg0;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(BI)Z")
	public static boolean method666(@OriginalArg(1) int arg0) {
		if (Static92.aBooleanArray11[arg0]) {
			return true;
		} else if (Static64.aClass42_48.method1510(arg0)) {
			@Pc(23) int local23 = Static64.aClass42_48.method1494(arg0);
			if (local23 == 0) {
				Static92.aBooleanArray11[arg0] = true;
				return true;
			}
			if (Static65.aClass3_Sub1_Sub6ArrayArray1[arg0] == null) {
				Static65.aClass3_Sub1_Sub6ArrayArray1[arg0] = new Class3_Sub1_Sub6[local23];
			}
			for (@Pc(45) int local45 = 0; local45 < local23; local45++) {
				if (Static65.aClass3_Sub1_Sub6ArrayArray1[arg0][local45] == null) {
					@Pc(59) byte[] local59 = Static64.aClass42_48.method1504(arg0, local45);
					if (local59 != null) {
						Static65.aClass3_Sub1_Sub6ArrayArray1[arg0][local45] = new Class3_Sub1_Sub6();
						Static65.aClass3_Sub1_Sub6ArrayArray1[arg0][local45].method579(new Class3_Sub8(local59));
					}
				}
			}
			Static92.aBooleanArray11[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIII)I")
	public static int method667(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return arg1;
		} else if (local3 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg1;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
	public static void method668() {
		aClass62_475 = null;
		anIntArray78 = null;
		aClass3_Sub1_Sub6_1 = null;
		aClass62_476 = null;
		aClass3_Sub1_Sub1_Sub4Array23 = null;
		aClass62_477 = null;
		aClass62_473 = null;
		aClass62_474 = null;
		aClass42_28 = null;
	}
}
