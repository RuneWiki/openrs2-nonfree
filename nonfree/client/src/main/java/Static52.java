import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!ka", name = "Z", descriptor = "Lclient!ne;")
	public static Class3_Sub3_Sub2_Sub4 aClass3_Sub3_Sub2_Sub4_59;

	@OriginalMember(owner = "client!ka", name = "hb", descriptor = "Lclient!fb;")
	public static Class20 aClass20_26;

	@OriginalMember(owner = "client!ka", name = "y", descriptor = "Lclient!hb;")
	public static Class27 aClass27_672 = Static87.method1648("Mem:");

	@OriginalMember(owner = "client!ka", name = "z", descriptor = "Lclient!hb;")
	public static Class27 aClass27_673 = Static87.method1648("huffman");

	@OriginalMember(owner = "client!ka", name = "A", descriptor = "I")
	public static int anInt1407 = 0;

	@OriginalMember(owner = "client!ka", name = "F", descriptor = "Lclient!hb;")
	public static Class27 aClass27_674 = Static87.method1648("Regeln versto-8en hat)3");

	@OriginalMember(owner = "client!ka", name = "K", descriptor = "Lclient!hb;")
	private static Class27 aClass27_676 = Static87.method1648("Enter name of player to add to list");

	@OriginalMember(owner = "client!ka", name = "I", descriptor = "Lclient!hb;")
	public static Class27 aClass27_675 = aClass27_676;

	@OriginalMember(owner = "client!ka", name = "Q", descriptor = "Lclient!hb;")
	private static Class27 aClass27_677 = Static87.method1648("No matching objects found)1 please shorten search");

	@OriginalMember(owner = "client!ka", name = "R", descriptor = "[I")
	public static int[] anIntArray232 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

	@OriginalMember(owner = "client!ka", name = "S", descriptor = "I")
	public static int anInt1416 = 0;

	@OriginalMember(owner = "client!ka", name = "U", descriptor = "Lclient!hb;")
	public static Class27 aClass27_678 = Static87.method1648("(WSpielkonto wiederherstellen(W Option auf der Hauptseite)3");

	@OriginalMember(owner = "client!ka", name = "ab", descriptor = "Lclient!hb;")
	public static Class27 aClass27_679 = Static87.method1648("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

	@OriginalMember(owner = "client!ka", name = "bb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_680 = aClass27_677;

	@OriginalMember(owner = "client!ka", name = "cb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_681 = Static87.method1648("hitmarks");

	@OriginalMember(owner = "client!ka", name = "db", descriptor = "Lclient!hb;")
	public static Class27 aClass27_682 = Static87.method1648("Cabbage");

	@OriginalMember(owner = "client!ka", name = "eb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_683 = Static87.method1648("Titelbild geladen)3");

	@OriginalMember(owner = "client!ka", name = "gb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_684 = Static87.method1648("Verbindung mit Freunde)2Server)3)3)3");

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(Z)V")
	public static void method1055() {
		anIntArray232 = null;
		aClass27_684 = null;
		aClass27_672 = null;
		aClass27_678 = null;
		aClass27_683 = null;
		aClass20_26 = null;
		aClass27_676 = null;
		aClass27_679 = null;
		aClass27_675 = null;
		aClass27_673 = null;
		aClass27_681 = null;
		aClass27_677 = null;
		aClass3_Sub3_Sub2_Sub4_59 = null;
		aClass27_680 = null;
		aClass27_674 = null;
		aClass27_682 = null;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZZBIZ)Lclient!qd;")
	public static Class54_Sub1 method1056(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(10) Class55 local10 = null;
		if (Static107.aClass37_4 != null) {
			local10 = new Class55(arg2, Static107.aClass37_4, Static41.aClass37Array1[arg2], 1000000);
		}
		return new Class54_Sub1(local10, Static75.aClass55_1, arg2, arg0, arg1, arg3);
	}
}
