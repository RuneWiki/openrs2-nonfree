import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!gd", name = "i", descriptor = "Lclient!v;")
	private static Class62 aClass62_420 = Static45.method753("red:");

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "Lclient!v;")
	public static Class62 aClass62_417 = aClass62_420;

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
	public static int anInt983 = 0;

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "Lclient!v;")
	public static Class62 aClass62_418 = Static45.method753("chatback");

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
	public static int anInt984 = 0;

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "Lclient!v;")
	public static Class62 aClass62_419 = Static45.method753("Handel)4Duell");

	@OriginalMember(owner = "client!gd", name = "j", descriptor = "I")
	public static int anInt988 = 0;

	@OriginalMember(owner = "client!gd", name = "k", descriptor = "I")
	public static int anInt989 = 0;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V")
	public static void method608() {
		Static39.aClass34_14.method762();
		Static46.aClass34_18.method762();
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)V")
	public static void method609() {
		aClass62_417 = null;
		aClass62_420 = null;
		aClass62_419 = null;
		aClass62_418 = null;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILclient!v;Lclient!v;Lclient!mb;)Lclient!rc;")
	public static Class3_Sub1_Sub1_Sub3 method610(@OriginalArg(1) Class62 arg0, @OriginalArg(2) Class62 arg1, @OriginalArg(3) Class42 arg2) {
		@Pc(8) int local8 = arg2.method1521(arg0);
		@Pc(14) int local14 = arg2.method1498(arg1, local8);
		return Static22.method492(local8, local14, arg2);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Z)V")
	public static void method611() {
		Static16.aClass34_8.method762();
	}
}
