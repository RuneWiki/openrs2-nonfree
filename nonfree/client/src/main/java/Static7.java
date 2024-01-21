import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!b", name = "w", descriptor = "Z")
	public static boolean aBoolean10;

	@OriginalMember(owner = "client!b", name = "v", descriptor = "I")
	public static int anInt207 = 0;

	@OriginalMember(owner = "client!b", name = "F", descriptor = "Lclient!pe;")
	public static Class65 aClass65_91 = Static119.method1462("Geben Sie Ihren Benutzernamen");

	@OriginalMember(owner = "client!b", name = "H", descriptor = "Lclient!jb;")
	public static Class40 aClass40_3 = new Class40(4096);

	@OriginalMember(owner = "client!b", name = "N", descriptor = "J")
	public static volatile long aLong10 = 0L;

	@OriginalMember(owner = "client!b", name = "O", descriptor = "Lclient!pe;")
	public static Class65 aClass65_92 = Static119.method1462("da dieser Computer gegen unsere ");

	@OriginalMember(owner = "client!b", name = "P", descriptor = "I")
	public static int anInt221 = 127;

	@OriginalMember(owner = "client!b", name = "T", descriptor = "I")
	public static int anInt224 = 0;

	@OriginalMember(owner = "client!b", name = "U", descriptor = "Lclient!pe;")
	public static Class65 aClass65_93 = Static119.method1462("<col=ffff00>");

	@OriginalMember(owner = "client!b", name = "X", descriptor = "Lclient!pe;")
	private static Class65 aClass65_96 = Static119.method1462("white:");

	@OriginalMember(owner = "client!b", name = "V", descriptor = "Lclient!pe;")
	public static Class65 aClass65_94 = aClass65_96;

	@OriginalMember(owner = "client!b", name = "W", descriptor = "Lclient!pe;")
	public static Class65 aClass65_95 = Static119.method1462("Suche nach Updates )2 ");

	@OriginalMember(owner = "client!b", name = "Y", descriptor = "Lclient!pe;")
	public static Class65 aClass65_97 = aClass65_96;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(BLclient!ub;)V")
	private static void method149(@OriginalArg(1) Class2_Sub1_Sub1_Sub4 arg0) {
		arg0.anInt1946 = 0;
		if (arg0.anInt1957 == 0) {
			arg0.anInt1962 = 1024;
		}
		@Pc(21) int local21 = arg0.anInt1929 * 64 + arg0.anInt1947 * 128;
		if (arg0.anInt1957 == 1) {
			arg0.anInt1962 = 1536;
		}
		@Pc(41) int local41 = arg0.anInt1939 * 128 + arg0.anInt1929 * 64;
		@Pc(50) int local50 = arg0.anInt1963 - Static10.anInt2951;
		if (arg0.anInt1957 == 2) {
			arg0.anInt1962 = 0;
		}
		arg0.anInt1958 += (local41 - arg0.anInt1958) / local50;
		if (arg0.anInt1957 == 3) {
			arg0.anInt1962 = 512;
		}
		arg0.anInt1948 += (local21 - arg0.anInt1948) / local50;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIBII)V")
	public static void method151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static17.anInt392; local3++) {
			if (Static41.anIntArray117[local3] + Static47.anIntArray143[local3] > arg2 && arg2 + arg1 > Static41.anIntArray117[local3] && Static115.anIntArray335[local3] + Static95.anIntArray284[local3] > arg3 && arg3 + arg0 > Static95.anIntArray284[local3]) {
				Static100.aBooleanArray16[local3] = true;
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(Z)V")
	public static void method152() {
		aClass65_92 = null;
		aClass65_95 = null;
		aClass65_93 = null;
		aClass40_3 = null;
		aClass65_91 = null;
		aClass65_97 = null;
		aClass65_94 = null;
		aClass65_96 = null;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IILclient!ub;)V")
	public static void method153(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub1_Sub1_Sub4 arg1) {
		if (Static10.anInt2951 < arg1.anInt1963) {
			method149(arg1);
		} else if (Static10.anInt2951 <= arg1.anInt1928) {
			Static77.method1293(arg1);
		} else {
			Static104.method2058(arg1);
		}
		if (arg1.anInt1948 < 128 || arg1.anInt1958 < 128 || arg1.anInt1948 >= 13184 || arg1.anInt1958 >= 13184) {
			arg1.anInt1928 = 0;
			arg1.anInt1958 = arg1.anIntArray264[0] * 128 + arg1.anInt1929 * 64;
			arg1.anInt1963 = 0;
			arg1.anInt1975 = -1;
			arg1.anInt1948 = arg1.anInt1929 * 64 + arg1.anIntArray263[0] * 128;
			arg1.anInt1972 = -1;
			arg1.method1471();
		}
		if (Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1 == arg1 && (arg1.anInt1948 < 1536 || arg1.anInt1958 < 1536 || arg1.anInt1948 >= 11776 || arg1.anInt1958 >= 11776)) {
			arg1.anInt1948 = arg1.anIntArray263[0] * 128 + arg1.anInt1929 * 64;
			arg1.anInt1963 = 0;
			arg1.anInt1958 = arg1.anIntArray264[0] * 128 + arg1.anInt1929 * 64;
			arg1.anInt1928 = 0;
			arg1.anInt1972 = -1;
			arg1.anInt1975 = -1;
			arg1.method1471();
		}
		Static130.method1971(arg1);
		Static111.method1812(arg1);
	}
}
