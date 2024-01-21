import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "Lclient!lc;")
	public static Class47 aClass47_1;

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "Z")
	public static boolean aBoolean104 = false;

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "Lclient!r;")
	private static Class61 aClass61_896 = Static129.method2060("You are standing in a members)2only area)3");

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "Lclient!r;")
	public static Class61 aClass61_897 = Static129.method2060("scrollbar");

	@OriginalMember(owner = "client!tb", name = "i", descriptor = "Lclient!r;")
	public static Class61 aClass61_898 = aClass61_896;

	@OriginalMember(owner = "client!tb", name = "j", descriptor = "I")
	public static int anInt2962 = 0;

	@OriginalMember(owner = "client!tb", name = "k", descriptor = "[I")
	public static int[] anIntArray351 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!tb", name = "l", descriptor = "Lclient!r;")
	public static Class61 aClass61_899 = Static129.method2060("da dieser Computer gegen unsere ");

	@OriginalMember(owner = "client!tb", name = "m", descriptor = "Lclient!r;")
	public static Class61 aClass61_900 = Static129.method2060(":duelreq:");

	@OriginalMember(owner = "client!tb", name = "n", descriptor = "[Lclient!fc;")
	public static Class23[] aClass23Array1 = new Class23[50];

	@OriginalMember(owner = "client!tb", name = "p", descriptor = "Lclient!r;")
	public static Class61 aClass61_901 = Static129.method2060("Keine Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)V")
	public static void method1870() {
		aClass47_1.method1290();
		for (@Pc(14) int local14 = 0; local14 < 32; local14++) {
			Static50.aLongArray2[local14] = 0L;
		}
		for (@Pc(26) int local26 = 0; local26 < 32; local26++) {
			Static111.aLongArray6[local26] = 0L;
		}
		Static106.anInt2742 = 0;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(III)Z")
	public static boolean method1871(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
	public static void method1872() {
		aBigInteger2 = null;
		aClass61_900 = null;
		aClass61_899 = null;
		aClass61_896 = null;
		anIntArray351 = null;
		aClass61_901 = null;
		aClass47_1 = null;
		aClass61_898 = null;
		aClass61_897 = null;
		aClass23Array1 = null;
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)Lclient!sb;")
	public static Class6 method1873() {
		try {
			return (Class6) Class.forName("Class6_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(17) Throwable local17) {
			return null;
		}
	}
}
