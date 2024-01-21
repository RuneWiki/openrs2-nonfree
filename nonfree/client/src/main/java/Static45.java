import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "[Lclient!ce;")
	public static Class8_Sub1_Sub3_Sub2[] aClass8_Sub1_Sub3_Sub2Array3;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
	public static int anInt1080 = 0;

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "Lclient!ic;")
	private static Class34 aClass34_569 = Static56.method816("flash1:");

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "Lclient!ic;")
	public static Class34 aClass34_570 = Static56.method816("sl_back");

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "Lclient!ic;")
	public static Class34 aClass34_571 = Static56.method816(")3runescape)3com");

	@OriginalMember(owner = "client!ge", name = "k", descriptor = "I")
	public static int anInt1086 = 0;

	@OriginalMember(owner = "client!ge", name = "l", descriptor = "Lclient!ic;")
	public static Class34 aClass34_572 = aClass34_569;

	@OriginalMember(owner = "client!ge", name = "p", descriptor = "Lclient!ic;")
	public static Class34 aClass34_573 = aClass34_569;

	@OriginalMember(owner = "client!ge", name = "r", descriptor = "Lclient!ic;")
	private static Class34 aClass34_575 = Static56.method816("Members only world");

	@OriginalMember(owner = "client!ge", name = "q", descriptor = "Lclient!ic;")
	public static Class34 aClass34_574 = aClass34_575;

	@OriginalMember(owner = "client!ge", name = "s", descriptor = "Lclient!ic;")
	public static Class34 aClass34_576 = Static56.method816("mapback");

	@OriginalMember(owner = "client!ge", name = "t", descriptor = "[Lclient!n;")
	public static Class8_Sub1_Sub1_Sub4_Sub2[] aClass8_Sub1_Sub1_Sub4_Sub2Array1 = new Class8_Sub1_Sub1_Sub4_Sub2[32768];

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method677(@OriginalArg(1) Component arg0) {
		@Pc(5) Method local5 = Static63.aMethod1;
		if (local5 != null) {
			try {
				local5.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(23) Throwable local23) {
			}
		}
		arg0.addKeyListener(Static16.aClass23_1);
		arg0.addFocusListener(Static16.aClass23_1);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)V")
	public static void method678() {
		Static95.anInt2240 = 0;
		Static56.anInt1443 = 0;
		Static3.method28();
		Static39.method599();
		Static5.method34();
		@Pc(23) int local23;
		for (@Pc(17) int local17 = 0; local17 < Static56.anInt1443; local17++) {
			local23 = Static2.anIntArray2[local17];
			if (Static21.anInt655 != aClass8_Sub1_Sub1_Sub4_Sub2Array1[local23].anInt2057) {
				aClass8_Sub1_Sub1_Sub4_Sub2Array1[local23].aClass8_Sub1_Sub16_1 = null;
				aClass8_Sub1_Sub1_Sub4_Sub2Array1[local23] = null;
			}
		}
		if (Static32.anInt872 != Static10.aClass8_Sub20_Sub1_1.anInt2853) {
			throw new RuntimeException("gnp1 pos:" + Static10.aClass8_Sub20_Sub1_1.anInt2853 + " psize:" + Static32.anInt872);
		}
		for (local23 = 0; local23 < Static94.anInt2223; local23++) {
			if (aClass8_Sub1_Sub1_Sub4_Sub2Array1[Static50.anIntArray164[local23]] == null) {
				throw new RuntimeException("gnp2 pos:" + local23 + " size:" + Static94.anInt2223);
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZI[B)Ljava/lang/Object;")
	public static Object method679(@OriginalArg(2) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static10.aBoolean8) {
			try {
				@Pc(18) Class54 local18 = (Class54) Class.forName("Class54_Sub1").getDeclaredConstructor().newInstance();
				local18.method1451(arg0);
				return local18;
			} catch (@Pc(27) Throwable local27) {
				Static10.aBoolean8 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZLclient!fe;I)V")
	public static void method680(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class8_Sub7 arg1) {
		@Pc(6) int local6 = arg1.anInt954;
		@Pc(10) int local10 = (int) arg1.aLong102;
		arg1.method2013();
		if (arg0) {
			Static21.method380(local6);
		}
		Static1.method3(local6);
		@Pc(27) Class8_Sub24 local27 = Static113.method1614(local10);
		if (local27 != null) {
			Static40.method608(local27);
		}
		Static96.anInt552 = 0;
		Static90.aBoolean14 = false;
		Static125.method1974(Static28.anInt802, Static117.anInt2629, Static109.anInt2499, Static134.anInt3164);
		if (Static107.anInt2463 != -1) {
			Static22.method1598(Static107.anInt2463, 1);
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)V")
	public static void method681() {
		aClass8_Sub1_Sub1_Sub4_Sub2Array1 = null;
		aClass34_569 = null;
		aClass34_576 = null;
		aClass34_574 = null;
		aClass34_571 = null;
		Class28.anIntArray145 = null;
		aClass34_572 = null;
		aClass34_570 = null;
		aClass34_573 = null;
		aClass34_575 = null;
		aClass8_Sub1_Sub3_Sub2Array3 = null;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IZ)V")
	public static void method682(@OriginalArg(0) int arg0) {
		Static128.anInt3022 = arg0;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILclient!ic;)I")
	public static int method683(@OriginalArg(1) Class34 arg0) {
		if (Static115.anInt2594 == 1) {
			return 7;
		} else if (arg0.method826(Static91.aClass34_1015)) {
			return 1;
		} else if (arg0.method826(Static40.aClass34_522)) {
			return 1;
		} else if (arg0.method826(Static62.aClass34_761)) {
			return 2;
		} else if (arg0.method826(Static69.aClass34_788)) {
			return 2;
		} else if (arg0.method826(Static119.aClass34_1302)) {
			return 3;
		} else if (arg0.method826(Static15.aClass34_208)) {
			return 4;
		} else if (arg0.method826(Static2.aClass34_7)) {
			return 4;
		} else if (arg0.method826(Static24.aClass34_861)) {
			return 5;
		} else if (arg0.method826(Static21.aClass34_325)) {
			return 6;
		} else {
			return 0;
		}
	}
}
