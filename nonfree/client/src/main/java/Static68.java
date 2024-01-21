import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "Z")
	public static boolean aBoolean70;

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "Z")
	public static boolean aBoolean71;

	@OriginalMember(owner = "client!lf", name = "g", descriptor = "J")
	public static long aLong77;

	@OriginalMember(owner = "client!lf", name = "h", descriptor = "I")
	public static int anInt2134;

	@OriginalMember(owner = "client!lf", name = "p", descriptor = "Lclient!ha;")
	public static Class25_Sub1 aClass25_Sub1_11;

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
	public static int anInt2131 = 0;

	@OriginalMember(owner = "client!lf", name = "i", descriptor = "[I")
	public static int[] anIntArray218 = new int[25];

	@OriginalMember(owner = "client!lf", name = "t", descriptor = "Lclient!qf;")
	private static Class60 aClass60_933 = Static59.method1195("purple:");

	@OriginalMember(owner = "client!lf", name = "j", descriptor = "Lclient!qf;")
	public static Class60 aClass60_931 = aClass60_933;

	@OriginalMember(owner = "client!lf", name = "m", descriptor = "[Lclient!qf;")
	public static Class60[] aClass60Array12 = new Class60[500];

	@OriginalMember(owner = "client!lf", name = "z", descriptor = "Lclient!qf;")
	private static Class60 aClass60_936 = Static59.method1195("Loading title screen )2 ");

	@OriginalMember(owner = "client!lf", name = "r", descriptor = "Lclient!qf;")
	public static Class60 aClass60_932 = aClass60_936;

	@OriginalMember(owner = "client!lf", name = "w", descriptor = "Lclient!qf;")
	public static Class60 aClass60_934 = aClass60_933;

	@OriginalMember(owner = "client!lf", name = "x", descriptor = "I")
	public static int anInt2142 = -1;

	@OriginalMember(owner = "client!lf", name = "y", descriptor = "Lclient!qf;")
	public static Class60 aClass60_935 = Static59.method1195("AUS");

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
	public static void method1387() {
		aClass60_932 = null;
		anIntArray218 = null;
		aClass60Array12 = null;
		aClass60_931 = null;
		aClass60_933 = null;
		aClass60_936 = null;
		aClass60_935 = null;
		aClass60_934 = null;
		aClass25_Sub1_11 = null;
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(B)Z")
	public static boolean method1388() {
		@Pc(5) Class81 local5 = Static97.aClass81_1;
		synchronized (Static97.aClass81_1) {
			if (Static53.anInt1739 == Static55.anInt1759) {
				return false;
			} else {
				Static86.anInt1611 = Static18.anIntArray78[Static55.anInt1759];
				Static70.anInt2197 = Static99.anIntArray308[Static55.anInt1759];
				Static55.anInt1759 = Static55.anInt1759 + 1 & 0x7F;
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IBI)Lclient!mf;")
	public static Class3_Sub15 method1390(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class3_Sub15 local7 = Static86.method1067(arg0);
		if (arg1 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass3_Sub15Array2 == null || arg1 >= local7.aClass3_Sub15Array2.length) {
			return null;
		} else {
			return local7.aClass3_Sub15Array2[arg1];
		}
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(B)V")
	public static void method1391() {
		Static130.aClass17_56.method646();
		Static41.aClass17_22.method646();
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(III)Z")
	public static boolean method1393(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0 && Static73.anInt2367 == arg0) {
			return true;
		} else if (arg1 == 1 && Static38.anInt1281 == arg0) {
			return true;
		} else {
			return (arg1 == 2 || arg1 == 3) && Static59.anInt1874 == arg0;
		}
	}
}
