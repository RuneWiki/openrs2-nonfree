import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!nd", name = "S", descriptor = "Lclient!d;")
	public static Class13 aClass13_2;

	@OriginalMember(owner = "client!nd", name = "gb", descriptor = "[I")
	public static int[] anIntArray201;

	@OriginalMember(owner = "client!nd", name = "Q", descriptor = "Lclient!v;")
	public static Class62 aClass62_836 = Static45.method753("Ihr Spielkonto wird bereits benutzt)3");

	@OriginalMember(owner = "client!nd", name = "fb", descriptor = "Lclient!v;")
	private static Class62 aClass62_843 = Static45.method753("No response from server)3");

	@OriginalMember(owner = "client!nd", name = "U", descriptor = "Lclient!v;")
	public static Class62 aClass62_837 = aClass62_843;

	@OriginalMember(owner = "client!nd", name = "W", descriptor = "Lclient!v;")
	private static Class62 aClass62_838 = Static45.method753(" million");

	@OriginalMember(owner = "client!nd", name = "X", descriptor = "I")
	public static int anInt1932 = -1;

	@OriginalMember(owner = "client!nd", name = "Y", descriptor = "Z")
	public static boolean aBoolean114 = false;

	@OriginalMember(owner = "client!nd", name = "bb", descriptor = "Lclient!v;")
	public static Class62 aClass62_839 = Static45.method753(" steht bereits auf Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!nd", name = "cb", descriptor = "Lclient!v;")
	public static Class62 aClass62_840 = aClass62_838;

	@OriginalMember(owner = "client!nd", name = "db", descriptor = "Lclient!v;")
	public static Class62 aClass62_841 = Static45.method753("Ihre Nachricht an: ");

	@OriginalMember(owner = "client!nd", name = "eb", descriptor = "Lclient!v;")
	public static Class62 aClass62_842 = Static45.method753("null");

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)Z")
	public static boolean method1175(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(16) int local16 = Static46.anIntArray108[arg0];
		if (local16 >= 2000) {
			local16 -= 2000;
		}
		return local16 == 8;
	}

	@OriginalMember(owner = "client!nd", name = "g", descriptor = "(I)V")
	public static void method1176() {
		aClass62_842 = null;
		aClass62_841 = null;
		anIntArray201 = null;
		aClass62_836 = null;
		aClass62_838 = null;
		aClass13_2 = null;
		aClass62_837 = null;
		aClass62_839 = null;
		aClass62_843 = null;
		aClass62_840 = null;
	}
}
