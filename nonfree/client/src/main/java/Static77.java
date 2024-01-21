import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!id", name = "h", descriptor = "Ljava/awt/Font;")
	public static Font aFont3;

	@OriginalMember(owner = "client!id", name = "k", descriptor = "Lclient!a;")
	public static Class1_Sub1 aClass1_Sub1_14;

	@OriginalMember(owner = "client!id", name = "b", descriptor = "I")
	public static int anInt1824 = 0;

	@OriginalMember(owner = "client!id", name = "d", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_713 = Static120.method1824("Lade Sprites )2 ");

	@OriginalMember(owner = "client!id", name = "e", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_714 = Static120.method1824("bevor Sie den Vorgang wiederholen)3");

	@OriginalMember(owner = "client!id", name = "j", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_715 = Static120.method1824("http:)4)4www)3runescape)3com");

	@OriginalMember(owner = "client!id", name = "m", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_716 = Static120.method1824("Starting game engine)3)3)3");

	@OriginalMember(owner = "client!id", name = "p", descriptor = "Lclient!rd;")
	public static Class80 aClass80_717 = aClass80_716;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
	public static void method1272() {
		Static151.method2421();
		Static15.method247();
		Static135.method2057();
		Static67.method998();
		Static58.method868();
		Static6.method147();
		Static181.method2905();
		Static34.method526();
		Static180.method2880();
		Static100.method1491();
		Static90.method1313();
		Static108.method2095();
		((Class86) Static65.anInterface1_2).method2654();
		Static170.aClass5_53.method146();
		Static156.aClass1_Sub1_24.method45();
		Static160.aClass1_Sub1_25.method45();
		Static142.aClass1_Sub1_23.method45();
		Static67.aClass1_Sub1_10.method45();
		Static100.aClass1_Sub1_16.method45();
		Static102.aClass1_Sub1_17.method45();
		Static128.aClass1_Sub1_20.method45();
		Static130.aClass1_Sub1_21.method45();
		Static166.aClass1_Sub1_28.method45();
		Static103.aClass1_Sub1_18.method45();
		Static48.aClass1_Sub1_6.method45();
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(II)Z")
	public static boolean method1276(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(21) int local21 = Static160.aShortArray46[arg0];
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		return local21 == 1001;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "([BZZ)Ljava/lang/Object;")
	public static Object method1277(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static67.aBoolean61) {
			try {
				@Pc(28) Class48 local28 = (Class48) Class.forName("Class48_Sub1").getDeclaredConstructor().newInstance();
				local28.method3019(arg0);
				return local28;
			} catch (@Pc(35) Throwable local35) {
				Static67.aBoolean61 = true;
			}
		}
		return arg0;
	}
}
