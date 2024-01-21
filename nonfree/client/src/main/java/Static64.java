import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!md", name = "xb", descriptor = "[Lclient!jd;")
	public static Class2_Sub1_Sub2_Sub4[] aClass2_Sub1_Sub2_Sub4Array10;

	@OriginalMember(owner = "client!md", name = "Bb", descriptor = "Lclient!u;")
	public static Class8_Sub1 aClass8_Sub1_15;

	@OriginalMember(owner = "client!md", name = "Gb", descriptor = "I")
	public static int anInt1923;

	@OriginalMember(owner = "client!md", name = "Lb", descriptor = "I")
	public static int anInt1927;

	@OriginalMember(owner = "client!md", name = "Mb", descriptor = "Lclient!bd;")
	public static Class8 aClass8_21;

	@OriginalMember(owner = "client!md", name = "sb", descriptor = "I")
	public static int anInt1914 = -1;

	@OriginalMember(owner = "client!md", name = "ub", descriptor = "Lclient!a;")
	public static Class1 aClass1_1965 = Static94.method1596("Welt");

	@OriginalMember(owner = "client!md", name = "Ab", descriptor = "Lclient!a;")
	private static Class1 aClass1_1967 = Static94.method1596("flash2:");

	@OriginalMember(owner = "client!md", name = "wb", descriptor = "Lclient!a;")
	public static Class1 aClass1_1966 = aClass1_1967;

	@OriginalMember(owner = "client!md", name = "Nb", descriptor = "Lclient!a;")
	private static Class1 aClass1_1969 = Static94.method1596(" million");

	@OriginalMember(owner = "client!md", name = "Hb", descriptor = "Lclient!a;")
	public static Class1 aClass1_1968 = aClass1_1969;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(BIII)I")
	public static int method1326(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = 256 - arg2;
		return (arg2 * (arg1 & 0xFF00) + local16 * (arg0 & 0xFF00) & 0xFF0000) + ((arg0 & 0xFF00FF) * local16 + (arg2 * (arg1 & 0xFF00FF)) & 0xFF00FF00) >> 8;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!bd;B)V")
	public static void method1328(@OriginalArg(0) Class8 arg0) {
		Static67.aClass8_29 = arg0;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(JB)V")
	public static void method1329(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static51.anInt1703 >= 100 && Static73.anInt1990 != 1 || Static51.anInt1703 >= 200) {
			Static73.method1372(0, Static98.aClass1_2628, Static111.aClass1_2898);
			return;
		}
		@Pc(40) Class1 local40 = Static99.method1668(arg0).method36();
		for (@Pc(42) int local42 = 0; local42 < Static51.anInt1703; local42++) {
			if (arg0 == Static98.aLongArray6[local42]) {
				Static73.method1372(0, Static97.method1655(new Class1[] { local40, Static103.aClass1_2701 }), Static111.aClass1_2898);
				return;
			}
		}
		for (@Pc(77) int local77 = 0; local77 < Static71.anInt1968; local77++) {
			if (arg0 == Static88.aLongArray5[local77]) {
				Static73.method1372(0, Static97.method1655(new Class1[] { Static73.aClass1_2049, local40, Static68.aClass1_1986 }), Static111.aClass1_2898);
				return;
			}
		}
		if (local40.method5(Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.aClass1_264)) {
			return;
		}
		Static100.aClass1Array25[Static51.anInt1703] = local40;
		Static98.aLongArray6[Static51.anInt1703] = arg0;
		Static61.anIntArray197[Static51.anInt1703] = 0;
		Static51.anInt1703++;
		Static34.aBoolean60 = true;
		Static59.aClass2_Sub3_Sub1_2.method841(114);
		Static59.aClass2_Sub3_Sub1_2.method804(arg0);
	}

	@OriginalMember(owner = "client!md", name = "f", descriptor = "(I)V")
	public static void method1333() {
		aClass1_1969 = null;
		aClass1_1966 = null;
		aClass2_Sub1_Sub2_Sub4Array10 = null;
		aClass1_1965 = null;
		aClass8_21 = null;
		aClass1_1968 = null;
		aClass1_1967 = null;
		aClass8_Sub1_15 = null;
	}
}
