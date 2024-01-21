import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!jb", name = "ab", descriptor = "I")
	public static int anInt1533;

	@OriginalMember(owner = "client!jb", name = "Ab", descriptor = "[Z")
	public static boolean[] aBooleanArray9;

	@OriginalMember(owner = "client!jb", name = "Nb", descriptor = "Lclient!sf;")
	public static Class5 aClass5_44;

	@OriginalMember(owner = "client!jb", name = "W", descriptor = "Lclient!sc;")
	public static Class66 aClass66_845 = Static106.method1849("null");

	@OriginalMember(owner = "client!jb", name = "Fb", descriptor = "Lclient!sc;")
	private static Class66 aClass66_848 = Static106.method1849(" ");

	@OriginalMember(owner = "client!jb", name = "db", descriptor = "Lclient!sc;")
	public static Class66 aClass66_846 = aClass66_848;

	@OriginalMember(owner = "client!jb", name = "fb", descriptor = "[I")
	public static int[] anIntArray234 = new int[25];

	@OriginalMember(owner = "client!jb", name = "nb", descriptor = "I")
	public static int anInt1542 = 0;

	@OriginalMember(owner = "client!jb", name = "Ib", descriptor = "[I")
	public static int[] anIntArray237 = new int[50];

	@OriginalMember(owner = "client!jb", name = "Ub", descriptor = "[S")
	public static short[] aShortArray45 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(II)Z")
	public static boolean method1075(@OriginalArg(1) int arg0) {
		return (arg0 >> 20 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(IZ)Z")
	public static boolean method1076(@OriginalArg(0) int arg0) {
		return (arg0 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)I")
	public static int method1077() {
		@Pc(5) int local5 = Static77.method1476(Static1.anInt70, Static22.anInt635, Static122.anInt2830);
		return local5 - Static51.anInt1580 >= 800 || (Static87.aByteArrayArrayArray15[Static22.anInt635][Static122.anInt2830 >> 7][Static1.anInt70 >> 7] & 0x4) == 0 ? 3 : Static22.anInt635;
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(Z)V")
	public static void method1083() {
		anIntArray234 = null;
		aShortArray45 = null;
		aClass66_848 = null;
		aClass66_845 = null;
		aBooleanArray9 = null;
		aClass66_846 = null;
		aClass5_44 = null;
		anIntArray237 = null;
	}
}
