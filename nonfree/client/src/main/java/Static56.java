import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!la", name = "bb", descriptor = "Lclient!vb;")
	public static Class3_Sub1_Sub1_Sub4 aClass3_Sub1_Sub1_Sub4_1;

	@OriginalMember(owner = "client!la", name = "P", descriptor = "Lclient!v;")
	private static Class62 aClass62_674 = Static45.method753("Enter your username (V password)3");

	@OriginalMember(owner = "client!la", name = "G", descriptor = "Lclient!v;")
	public static Class62 aClass62_668 = aClass62_674;

	@OriginalMember(owner = "client!la", name = "V", descriptor = "Lclient!v;")
	private static Class62 aClass62_678 = Static45.method753("Please try using a different world)3");

	@OriginalMember(owner = "client!la", name = "H", descriptor = "Lclient!v;")
	public static Class62 aClass62_669 = aClass62_678;

	@OriginalMember(owner = "client!la", name = "I", descriptor = "I")
	public static int anInt1563 = 0;

	@OriginalMember(owner = "client!la", name = "J", descriptor = "Lclient!v;")
	private static Class62 aClass62_670 = Static45.method753("wave2:");

	@OriginalMember(owner = "client!la", name = "L", descriptor = "Lclient!v;")
	private static Class62 aClass62_671 = Static45.method753("Please wait 1 minute and try again)3");

	@OriginalMember(owner = "client!la", name = "N", descriptor = "Lclient!v;")
	public static Class62 aClass62_672 = aClass62_671;

	@OriginalMember(owner = "client!la", name = "O", descriptor = "Lclient!v;")
	public static Class62 aClass62_673 = aClass62_678;

	@OriginalMember(owner = "client!la", name = "Q", descriptor = "Lclient!v;")
	public static Class62 aClass62_675 = aClass62_678;

	@OriginalMember(owner = "client!la", name = "R", descriptor = "Lclient!v;")
	public static Class62 aClass62_676 = aClass62_678;

	@OriginalMember(owner = "client!la", name = "S", descriptor = "Lclient!v;")
	public static Class62 aClass62_677 = aClass62_678;

	@OriginalMember(owner = "client!la", name = "T", descriptor = "[I")
	public static int[] anIntArray122 = new int[100];

	@OriginalMember(owner = "client!la", name = "X", descriptor = "Lclient!v;")
	public static Class62 aClass62_679 = Static45.method753("blinken1:");

	@OriginalMember(owner = "client!la", name = "Z", descriptor = "Lclient!v;")
	public static Class62 aClass62_680 = aClass62_678;

	@OriginalMember(owner = "client!la", name = "ab", descriptor = "Lclient!v;")
	public static Class62 aClass62_681 = aClass62_670;

	@OriginalMember(owner = "client!la", name = "db", descriptor = "Lclient!v;")
	public static Class62 aClass62_682 = Static45.method753(" ");

	@OriginalMember(owner = "client!la", name = "eb", descriptor = "[I")
	public static int[] anIntArray123 = new int[100];

	@OriginalMember(owner = "client!la", name = "fb", descriptor = "I")
	public static int anInt1568 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!la", name = "gb", descriptor = "I")
	public static int anInt1569 = 0;

	@OriginalMember(owner = "client!la", name = "hb", descriptor = "I")
	public static int anInt1570 = 0;

	@OriginalMember(owner = "client!la", name = "ib", descriptor = "Lclient!v;")
	public static Class62 aClass62_683 = aClass62_671;

	@OriginalMember(owner = "client!la", name = "jb", descriptor = "Lclient!v;")
	public static Class62 aClass62_684 = aClass62_671;

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(B)V")
	public static void method924() {
		for (@Pc(15) Class3_Sub6 local15 = (Class3_Sub6) Static77.aClass24_58.method534(); local15 != null; local15 = (Class3_Sub6) Static77.aClass24_58.method525()) {
			if (local15.aClass3_Sub1_Sub9_1 != null) {
				local15.method708();
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)V")
	public static void method925() {
		aClass62_678 = null;
		aClass62_676 = null;
		aClass62_669 = null;
		aClass62_680 = null;
		aClass62_677 = null;
		aClass62_682 = null;
		aClass3_Sub1_Sub1_Sub4_1 = null;
		aClass62_671 = null;
		aClass62_674 = null;
		aClass62_683 = null;
		aClass62_672 = null;
		aClass62_681 = null;
		aClass62_675 = null;
		anIntArray123 = null;
		aClass62_668 = null;
		anIntArray122 = null;
		aClass62_673 = null;
		aClass62_684 = null;
		aClass62_679 = null;
		aClass62_670 = null;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II)Lclient!p;")
	public static Class3_Sub1_Sub12 method926(@OriginalArg(1) int arg0) {
		@Pc(17) Class3_Sub1_Sub12 local17 = (Class3_Sub1_Sub12) Static16.aClass34_8.method764((long) arg0);
		if (local17 != null) {
			return local17;
		}
		@Pc(27) byte[] local27 = Static104.aClass42_73.method1504(14, arg0);
		local17 = new Class3_Sub1_Sub12();
		if (local27 != null) {
			local17.method1252(new Class3_Sub8(local27));
		}
		Static16.aClass34_8.method765((long) arg0, local17);
		return local17;
	}
}
