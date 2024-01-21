import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!nd", name = "K", descriptor = "I")
	public static int anInt1984;

	@OriginalMember(owner = "client!nd", name = "s", descriptor = "[I")
	public static int[] anIntArray266 = new int[25];

	@OriginalMember(owner = "client!nd", name = "u", descriptor = "Lclient!v;")
	private static Class76 aClass76_850 = Static134.method2017("Feb");

	@OriginalMember(owner = "client!nd", name = "v", descriptor = "Lclient!v;")
	private static Class76 aClass76_851 = Static134.method2017("Oct");

	@OriginalMember(owner = "client!nd", name = "w", descriptor = "Lclient!v;")
	private static Class76 aClass76_852 = Static134.method2017("Aug");

	@OriginalMember(owner = "client!nd", name = "x", descriptor = "Lclient!v;")
	public static Class76 aClass76_853 = Static134.method2017("Welt");

	@OriginalMember(owner = "client!nd", name = "y", descriptor = "Lclient!v;")
	private static Class76 aClass76_854 = Static134.method2017("Sep");

	@OriginalMember(owner = "client!nd", name = "A", descriptor = "Lclient!v;")
	public static Class76 aClass76_855 = Static134.method2017("(U0a )2 non)2existant gosub script)2num: ");

	@OriginalMember(owner = "client!nd", name = "B", descriptor = "Lclient!v;")
	private static Class76 aClass76_856 = Static134.method2017("Apr");

	@OriginalMember(owner = "client!nd", name = "C", descriptor = "Lclient!v;")
	private static Class76 aClass76_857 = Static134.method2017("Jul");

	@OriginalMember(owner = "client!nd", name = "D", descriptor = "I")
	public static int anInt1981 = 0;

	@OriginalMember(owner = "client!nd", name = "E", descriptor = "I")
	public static int anInt1982 = 0;

	@OriginalMember(owner = "client!nd", name = "F", descriptor = "Lclient!v;")
	private static Class76 aClass76_858 = Static134.method2017("Dec");

	@OriginalMember(owner = "client!nd", name = "G", descriptor = "Lclient!v;")
	private static Class76 aClass76_859 = Static134.method2017("skill)2");

	@OriginalMember(owner = "client!nd", name = "I", descriptor = "Lclient!v;")
	private static Class76 aClass76_860 = Static134.method2017("Nov");

	@OriginalMember(owner = "client!nd", name = "J", descriptor = "Lclient!v;")
	private static Class76 aClass76_861 = Static134.method2017("Mar");

	@OriginalMember(owner = "client!nd", name = "L", descriptor = "Lclient!v;")
	private static Class76 aClass76_862 = Static134.method2017("Jun");

	@OriginalMember(owner = "client!nd", name = "M", descriptor = "[I")
	public static int[] anIntArray267 = new int[100];

	@OriginalMember(owner = "client!nd", name = "N", descriptor = "I")
	public static int anInt1985 = 1;

	@OriginalMember(owner = "client!nd", name = "O", descriptor = "Lclient!v;")
	public static Class76 aClass76_863 = aClass76_859;

	@OriginalMember(owner = "client!nd", name = "P", descriptor = "Lclient!v;")
	private static Class76 aClass76_864 = Static134.method2017("Jan");

	@OriginalMember(owner = "client!nd", name = "Q", descriptor = "I")
	public static int anInt1986 = 1;

	@OriginalMember(owner = "client!nd", name = "S", descriptor = "[S")
	public static short[] aShortArray18 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!nd", name = "T", descriptor = "Lclient!v;")
	private static Class76 aClass76_865 = Static134.method2017("May");

	@OriginalMember(owner = "client!nd", name = "W", descriptor = "[Lclient!v;")
	public static Class76[] aClass76Array21 = new Class76[] { aClass76_864, aClass76_850, aClass76_861, aClass76_856, aClass76_865, aClass76_862, aClass76_857, aClass76_852, aClass76_854, aClass76_851, aClass76_860, aClass76_858 };

	@OriginalMember(owner = "client!nd", name = "X", descriptor = "Lclient!v;")
	public static Class76 aClass76_866 = Static134.method2017("Anmelde)2Zeitlimit -Uberschritten)3");

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!dd;I)Z")
	public static boolean method1406(@OriginalArg(0) Class4_Sub8 arg0) {
		@Pc(2) int local2 = arg0.anInt458;
		if (local2 == 205) {
			Static39.anInt1120 = 250;
			return true;
		}
		@Pc(33) int local33;
		@Pc(27) int local27;
		if (local2 >= 300 && local2 <= 313) {
			local27 = local2 & 0x1;
			local33 = (local2 - 300) / 2;
			Static87.aClass26_4.method623(local27 == 1, local33);
		}
		if (local2 >= 314 && local2 <= 323) {
			local33 = (local2 - 314) / 2;
			local27 = local2 & 0x1;
			Static87.aClass26_4.method630(local33, local27 == 1);
		}
		if (local2 == 324) {
			Static87.aClass26_4.method631(false);
		}
		if (local2 == 325) {
			Static87.aClass26_4.method631(true);
		}
		if (local2 == 326) {
			Static69.aClass4_Sub10_Sub1_2.method611(244);
			Static87.aClass26_4.method625(Static69.aClass4_Sub10_Sub1_2);
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(III)I")
	public static int method1407(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class4_Sub21 local10 = (Class4_Sub21) Static104.aClass28_9.method770((long) arg0);
		if (local10 == null) {
			return -1;
		} else if (arg1 >= 0 && arg1 < local10.anIntArray325.length) {
			return local10.anIntArray325[arg1];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)V")
	public static void method1408() {
		aClass76_862 = null;
		aClass76_857 = null;
		aClass76_855 = null;
		aShortArray18 = null;
		aClass76_858 = null;
		aClass76_853 = null;
		aClass76_852 = null;
		aClass76_861 = null;
		aClass76_850 = null;
		aClass76_863 = null;
		anIntArray266 = null;
		aClass76Array21 = null;
		aClass76_854 = null;
		aClass76_865 = null;
		aClass76_851 = null;
		aClass76_856 = null;
		anIntArray267 = null;
		aClass76_864 = null;
		aClass76_866 = null;
		aClass76_859 = null;
		aClass76_860 = null;
	}
}
