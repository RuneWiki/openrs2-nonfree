import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
	public static int anInt2185;

	@OriginalMember(owner = "client!sd", name = "o", descriptor = "I")
	public static int anInt2186;

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "[[I")
	public static int[][] anIntArrayArray20 = new int[5][5000];

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "Lclient!rf;")
	public static Class70 aClass70_688 = Static49.method1293("auf einer freien Welt zu spielen)3");

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "Lclient!rf;")
	public static Class70 aClass70_689 = Static49.method1293("Anmelde)2Zeitlimit -Uberschritten)3");

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "Lclient!rf;")
	public static Class70 aClass70_690 = Static49.method1293(" <col=00ff80>");

	@OriginalMember(owner = "client!sd", name = "i", descriptor = "Lclient!rf;")
	private static Class70 aClass70_692 = Static49.method1293("Username: ");

	@OriginalMember(owner = "client!sd", name = "h", descriptor = "Lclient!rf;")
	public static Class70 aClass70_691 = aClass70_692;

	@OriginalMember(owner = "client!sd", name = "j", descriptor = "Lclient!rf;")
	public static Class70 aClass70_693 = Static49.method1293("null");

	@OriginalMember(owner = "client!sd", name = "m", descriptor = "Lclient!rf;")
	private static Class70 aClass70_694 = Static49.method1293("Select a world");

	@OriginalMember(owner = "client!sd", name = "n", descriptor = "[I")
	public static int[] anIntArray208 = new int[32768];

	@OriginalMember(owner = "client!sd", name = "p", descriptor = "Lclient!rf;")
	public static Class70 aClass70_695 = aClass70_694;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)Lclient!e;")
	public static Class1_Sub1_Sub6 method1613(@OriginalArg(0) int arg0) {
		@Pc(15) Class1_Sub1_Sub6 local15 = (Class1_Sub1_Sub6) Static125.aClass25_18.method1302((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static36.aClass76_32.method3316(arg0, 8);
		local15 = new Class1_Sub1_Sub6();
		if (local25 != null) {
			local15.method1027(new Class1_Sub9(local25));
		}
		Static125.aClass25_18.method1299(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(B)V")
	public static void method1614() {
		aClass70_693 = null;
		anIntArrayArray20 = null;
		aClass70_691 = null;
		aClass70_695 = null;
		anIntArray208 = null;
		aClass70_692 = null;
		aClass70_694 = null;
		aClass70_690 = null;
		aClass70_688 = null;
		aClass70_689 = null;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Z)Lclient!uf;")
	public static Class16 method1615() {
		try {
			return (Class16) Class.forName("Class16_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return new Class16_Sub2();
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZILjava/util/Random;)I")
	public static int method1616(@OriginalArg(1) int arg0, @OriginalArg(2) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static156.method3145(arg0)) {
			return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg0 >> 32);
		} else {
			@Pc(42) int local42 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(45) int local45;
			do {
				local45 = arg1.nextInt();
			} while (local45 >= local42);
			return Static120.method2461(local45, arg0);
		}
	}
}
