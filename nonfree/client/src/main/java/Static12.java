import java.awt.FontMetrics;
import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!ca", name = "j", descriptor = "Lclient!bd;")
	public static Class8 aClass8_26;

	@OriginalMember(owner = "client!ca", name = "n", descriptor = "J")
	public static long aLong86;

	@OriginalMember(owner = "client!ca", name = "o", descriptor = "I")
	public static int anInt2642;

	@OriginalMember(owner = "client!ca", name = "u", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics5;

	@OriginalMember(owner = "client!ca", name = "v", descriptor = "[Lclient!jd;")
	public static Class2_Sub1_Sub2_Sub4[] aClass2_Sub1_Sub2_Sub4Array13;

	@OriginalMember(owner = "client!ca", name = "x", descriptor = "Lclient!wc;")
	public static Class4 aClass4_61;

	@OriginalMember(owner = "client!ca", name = "l", descriptor = "Lclient!a;")
	private static Class1 aClass1_2747 = Static94.method1596("Unexpected loginserver response)3");

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "Lclient!a;")
	public static Class1 aClass1_2745 = aClass1_2747;

	@OriginalMember(owner = "client!ca", name = "e", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar5 = Calendar.getInstance();

	@OriginalMember(owner = "client!ca", name = "g", descriptor = "Lclient!a;")
	public static Class1 aClass1_2746 = Static94.method1596("backright1");

	@OriginalMember(owner = "client!ca", name = "p", descriptor = "I")
	public static int anInt2643 = 0;

	@OriginalMember(owner = "client!ca", name = "q", descriptor = "Lclient!a;")
	private static Class1 aClass1_2748 = Static94.method1596("You have only just left another world)3");

	@OriginalMember(owner = "client!ca", name = "r", descriptor = "I")
	public static int anInt2644 = 0;

	@OriginalMember(owner = "client!ca", name = "s", descriptor = "Lclient!a;")
	public static Class1 aClass1_2749 = Static94.method1596("Duell akzeptieren");

	@OriginalMember(owner = "client!ca", name = "t", descriptor = "Lclient!a;")
	public static Class1 aClass1_2750 = aClass1_2748;

	@OriginalMember(owner = "client!ca", name = "w", descriptor = "[I")
	public static int[] anIntArray335 = new int[5];

	@OriginalMember(owner = "client!ca", name = "y", descriptor = "Lclient!a;")
	public static Class1 aClass1_2751 = Static94.method1596("runes");

	@OriginalMember(owner = "client!ca", name = "z", descriptor = "Lclient!a;")
	public static Class1 aClass1_2752 = Static94.method1596("welle2:");

	@OriginalMember(owner = "client!ca", name = "A", descriptor = "I")
	public static int anInt2645 = 0;

	@OriginalMember(owner = "client!ca", name = "B", descriptor = "B")
	public static byte aByte7 = 0;

	@OriginalMember(owner = "client!ca", name = "C", descriptor = "Lclient!a;")
	public static Class1 aClass1_2753 = Static94.method1596("_");

	@OriginalMember(owner = "client!ca", name = "D", descriptor = "Lclient!a;")
	public static Class1 aClass1_2754 = Static94.method1596("backhmid2");

	@OriginalMember(owner = "client!ca", name = "E", descriptor = "Lclient!a;")
	public static Class1 aClass1_2755 = Static94.method1596("");

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
	public static void method1736() {
		for (@Pc(3) int local3 = 0; local3 < Static44.anInt1516; local3++) {
			@Pc(9) int local9 = Static20.anIntArray89[local3];
			@Pc(13) Class2_Sub1_Sub1_Sub1_Sub2 local13 = Static101.aClass2_Sub1_Sub1_Sub1_Sub2Array1[local9];
			if (local13 != null) {
				Static22.method601(local13, local13.aClass2_Sub1_Sub7_1.anInt1335);
			}
		}
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)V")
	public static void method1737() {
		Static77.aBoolean113 = false;
		Static3.aBoolean9 = false;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V")
	public static void method1738() {
		Static34.aClass11_12.method435();
		Static103.aClass11_26.method435();
		Static7.aClass11_9.method435();
	}

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)V")
	public static void method1741() {
		aClass1_2747 = null;
		aClass1_2745 = null;
		anIntArray335 = null;
		aFontMetrics5 = null;
		aClass1_2755 = null;
		aClass8_26 = null;
		aClass1_2748 = null;
		aClass1_2753 = null;
		aCalendar5 = null;
		aClass1_2751 = null;
		aClass4_61 = null;
		aClass1_2754 = null;
		aClass2_Sub1_Sub2_Sub4Array13 = null;
		aClass1_2752 = null;
		aClass1_2749 = null;
		aClass1_2750 = null;
		aClass1_2746 = null;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "([II)V")
	public static synchronized void method1742(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(2) int local2 = arg1 - 7;
		while (local1 < local2) {
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
		}
		local2 += 7;
		while (local1 < local2) {
			arg0[local1++] = 0;
		}
		if (Static46.aClass2_Sub2_1 != null) {
			Static46.aClass2_Sub2_1.method1198(arg0, 0, local2);
		}
		Static96.method1634(local2);
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!ha;")
	public static RuntimeException_Sub1 method1743(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString1 = local9.aString1 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IB)V")
	public static synchronized void method1744() {
		if (Static46.aClass2_Sub2_1 != null) {
			Static46.aClass2_Sub2_1.method1197(256);
		}
		Static96.method1634(256);
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!oc;I)V")
	public static synchronized void method1745(@OriginalArg(0) Class2_Sub2 arg0) {
		Static46.aClass2_Sub2_1 = arg0;
	}
}
