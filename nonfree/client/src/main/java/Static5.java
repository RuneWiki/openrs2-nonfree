import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!af", name = "k", descriptor = "Lclient!va;")
	public static Class3_Sub1_Sub2_Sub4 aClass3_Sub1_Sub2_Sub4_2;

	@OriginalMember(owner = "client!af", name = "s", descriptor = "Lclient!bf;")
	public static Class11 aClass11_8;

	@OriginalMember(owner = "client!af", name = "h", descriptor = "Lclient!ae;")
	private static Class5 aClass5_107 = Static56.method972("Try again in 60 secs)3)3)3");

	@OriginalMember(owner = "client!af", name = "a", descriptor = "Lclient!ae;")
	public static Class5 aClass5_105 = aClass5_107;

	@OriginalMember(owner = "client!af", name = "e", descriptor = "Ljava/lang/Object;")
	public static Object anObject1 = new Object();

	@OriginalMember(owner = "client!af", name = "f", descriptor = "I")
	public static int anInt346 = 0;

	@OriginalMember(owner = "client!af", name = "g", descriptor = "Lclient!ae;")
	private static Class5 aClass5_106 = Static56.method972("Press (Wchange your password(W on front page)3");

	@OriginalMember(owner = "client!af", name = "j", descriptor = "Lclient!ae;")
	public static Class5 aClass5_108 = Static56.method972("Lade Sprites )2 ");

	@OriginalMember(owner = "client!af", name = "m", descriptor = "Lclient!ae;")
	public static Class5 aClass5_109 = aClass5_106;

	@OriginalMember(owner = "client!af", name = "n", descriptor = "Lclient!ae;")
	public static Class5 aClass5_110 = Static56.method972("title)3jpg");

	@OriginalMember(owner = "client!af", name = "r", descriptor = "Lclient!bd;")
	public static Class9 aClass9_6 = new Class9(64);

	@OriginalMember(owner = "client!af", name = "t", descriptor = "Lclient!ae;")
	public static Class5 aClass5_111 = Static56.method972("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

	@OriginalMember(owner = "client!af", name = "u", descriptor = "Lclient!ae;")
	public static Class5 aClass5_112 = Static56.method972("@yel@*V");

	@OriginalMember(owner = "client!af", name = "v", descriptor = "Lclient!p;")
	public static Class51 aClass51_1 = new Class51();

	@OriginalMember(owner = "client!af", name = "w", descriptor = "[I")
	public static int[] anIntArray37 = new int[5];

	@OriginalMember(owner = "client!af", name = "x", descriptor = "Lclient!ae;")
	private static Class5 aClass5_113 = Static56.method972("go back to the main RuneScape webpage");

	@OriginalMember(owner = "client!af", name = "D", descriptor = "Lclient!ae;")
	private static Class5 aClass5_117 = Static56.method972("Message");

	@OriginalMember(owner = "client!af", name = "y", descriptor = "Lclient!ae;")
	public static Class5 aClass5_114 = aClass5_117;

	@OriginalMember(owner = "client!af", name = "z", descriptor = "Lclient!ae;")
	public static Class5 aClass5_115 = Static56.method972("(Udns");

	@OriginalMember(owner = "client!af", name = "A", descriptor = "Lclient!ae;")
	public static Class5 aClass5_116 = aClass5_113;

	@OriginalMember(owner = "client!af", name = "B", descriptor = "I")
	public static int anInt352 = 0;

	@OriginalMember(owner = "client!af", name = "C", descriptor = "I")
	public static int anInt353 = 0;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(BI)[B")
	public static synchronized byte[] method172(@OriginalArg(1) int arg0) {
		@Pc(23) byte[] local23;
		if (arg0 == 100 && Static92.anInt2361 > 0) {
			local23 = Static19.aByteArrayArray4[--Static92.anInt2361];
			Static19.aByteArrayArray4[Static92.anInt2361] = null;
			return local23;
		} else if (arg0 == 5000 && Static91.anInt2352 > 0) {
			local23 = Static32.aByteArrayArray5[--Static91.anInt2352];
			Static32.aByteArrayArray5[Static91.anInt2352] = null;
			return local23;
		} else if (arg0 == 30000 && Static84.anInt2058 > 0) {
			local23 = Static92.aByteArrayArray7[--Static84.anInt2058];
			Static92.aByteArrayArray7[Static84.anInt2058] = null;
			return local23;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(B)V")
	public static void method173() {
		aClass5_111 = null;
		aClass3_Sub1_Sub2_Sub4_2 = null;
		aClass5_112 = null;
		aClass5_108 = null;
		aClass51_1 = null;
		aClass5_115 = null;
		aClass5_109 = null;
		aClass11_8 = null;
		aClass5_107 = null;
		aClass9_6 = null;
		anObject1 = null;
		aClass5_116 = null;
		aClass5_113 = null;
		aClass5_110 = null;
		aClass5_114 = null;
		anIntArray37 = null;
		aClass5_117 = null;
		aClass5_105 = null;
		aClass5_106 = null;
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(B)V")
	public static void method174() {
		if (Static2.aClass39_1 != null) {
			@Pc(8) Class39 local8 = Static2.aClass39_1;
			synchronized (Static2.aClass39_1) {
				Static2.aClass39_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIII)V")
	public static void method175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		Static67.aClass3_Sub1_Sub2_Sub4Array3[0].method1857(arg0, arg3);
		@Pc(17) int local17 = arg4 * (arg4 - 32) / arg2;
		Static67.aClass3_Sub1_Sub2_Sub4Array3[1].method1857(arg0, arg3 + arg4 - 16);
		if (local17 < 8) {
			local17 = 8;
		}
		@Pc(47) int local47 = arg1 * (arg4 - local17 - 32) / (arg2 - arg4);
		Static66.method1839(arg0, arg3 + 16, 16, arg4 - 32, Static106.anInt2732);
		Static66.method1839(arg0, local47 + arg3 + 16, 16, local17, Static15.anInt525);
		Static66.method1837(arg0, arg3 + local47 + 16, local17, Static44.anInt1254);
		Static66.method1837(arg0 + 1, local47 + arg3 - -16, local17, Static44.anInt1254);
		Static66.method1844(arg0, arg3 + local47 + 16, 16, Static44.anInt1254);
		Static66.method1844(arg0, arg3 + local47 + 17, 16, Static44.anInt1254);
		Static66.method1837(arg0 + 15, arg3 + 16 - -local47, local17, Static43.anInt1219);
		Static66.method1837(arg0 + 14, arg3 + 17 + local47, local17 - 1, Static43.anInt1219);
		Static66.method1844(arg0, arg3 + local47 + local17 + 15, 16, Static43.anInt1219);
		Static66.method1844(arg0 + 1, local17 + local47 + 14 + arg3, 15, Static43.anInt1219);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
	public static Class method176(@OriginalArg(1) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIII)V")
	public static void method177(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 < 128 || arg1 < 128 || arg2 > 13056 || arg1 > 13056) {
			Static15.anInt519 = -1;
			Static91.anInt2350 = -1;
			return;
		}
		@Pc(31) int local31 = Static15.method358(arg1, Static12.anInt480, arg2) - arg0;
		@Pc(35) int local35 = arg2 - Static89.anInt2280;
		@Pc(39) int local39 = arg1 - Static60.anInt2989;
		@Pc(43) int local43 = Static107.anIntArray343[Static70.anInt1827];
		@Pc(55) int local55 = local31 - Static85.anInt2111;
		@Pc(59) int local59 = Static107.anIntArray357[Static70.anInt1827];
		@Pc(63) int local63 = Static107.anIntArray343[Static68.anInt1577];
		@Pc(67) int local67 = Static107.anIntArray357[Static68.anInt1577];
		@Pc(77) int local77 = local35 * local67 + local39 * local63 >> 16;
		@Pc(88) int local88 = local39 * local67 - local63 * local35 >> 16;
		@Pc(90) int local90 = local77;
		@Pc(101) int local101 = local59 * local55 - local88 * local43 >> 16;
		@Pc(111) int local111 = local55 * local43 + local59 * local88 >> 16;
		if (local111 >= 50) {
			Static15.anInt519 = (local90 << 9) / local111 + 256;
			Static91.anInt2350 = (local101 << 9) / local111 + 167;
		} else {
			Static15.anInt519 = -1;
			Static91.anInt2350 = -1;
		}
	}
}
