import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
	public static int anInt2064;

	@OriginalMember(owner = "client!pa", name = "j", descriptor = "Lclient!kd;")
	public static Class3_Sub8 aClass3_Sub8_4;

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "Lclient!v;")
	private static Class62 aClass62_907 = Static45.method753("Enter name of player to add to list");

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "Lclient!v;")
	public static Class62 aClass62_906 = aClass62_907;

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "I")
	public static int anInt2065 = 0;

	@OriginalMember(owner = "client!pa", name = "f", descriptor = "Lclient!v;")
	public static Class62 aClass62_908 = Static45.method753("Willkommen auf RuneScape");

	@OriginalMember(owner = "client!pa", name = "h", descriptor = "Lclient!fc;")
	public static Class24 aClass24_58 = new Class24();

	@OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
	public static int anInt2067 = 0;

	@OriginalMember(owner = "client!pa", name = "k", descriptor = "Lclient!v;")
	public static Class62 aClass62_909 = Static45.method753(" weitere Optionen");

	@OriginalMember(owner = "client!pa", name = "l", descriptor = "[Z")
	public static boolean[] aBooleanArray9 = new boolean[5];

	@OriginalMember(owner = "client!pa", name = "n", descriptor = "Lclient!v;")
	private static Class62 aClass62_911 = Static45.method753("Enter name of player to delete from list");

	@OriginalMember(owner = "client!pa", name = "m", descriptor = "Lclient!v;")
	public static Class62 aClass62_910 = aClass62_911;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Z)V")
	public static void method1253() {
		aClass62_910 = null;
		aClass24_58 = null;
		aClass62_908 = null;
		aClass62_906 = null;
		aBooleanArray9 = null;
		aClass62_909 = null;
		aClass3_Sub8_4 = null;
		aClass62_907 = null;
		aClass62_911 = null;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)Lclient!v;")
	public static Class62 method1254() {
		@Pc(14) Class62 local14 = new Class62();
		local14.aByteArray25 = new byte[100];
		local14.anInt2649 = 0;
		return local14;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IB[BI)Lclient!v;")
	public static Class62 method1255(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class62 local7 = new Class62();
		local7.anInt2649 = arg0;
		local7.aByteArray25 = new byte[arg0];
		Static112.method491(arg1, arg2, local7.aByteArray25, 0, arg0);
		return local7;
	}
}
