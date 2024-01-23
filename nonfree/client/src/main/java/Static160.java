import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "Lclient!ch;")
	public static Class1_Sub1_Sub6 aClass1_Sub1_Sub6_4;

	@OriginalMember(owner = "client!qe", name = "i", descriptor = "[I")
	public static int[] anIntArray459;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(BJ)V")
	public static void method2686(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static78.anInt1884 >= 100) {
			Static13.method239(Static149.aClass60_1155, Static13.aClass60_118, 0);
			return;
		}
		@Pc(25) Class60 local25 = Static144.method2484(arg0).method1812();
		for (@Pc(32) int local32 = 0; local32 < Static78.anInt1884; local32++) {
			if (Static140.aLongArray7[local32] == arg0) {
				Static13.method239(Static149.aClass60_1155, Static34.method611(new Class60[] { local25, Static86.aClass60_662 }), 0);
				return;
			}
		}
		for (@Pc(71) int local71 = 0; local71 < Static135.anInt2930; local71++) {
			if (Static29.aLongArray1[local71] == arg0) {
				Static13.method239(Static149.aClass60_1155, Static34.method611(new Class60[] { Static165.aClass60_1033, local25, Static16.aClass60_142 }), 0);
				return;
			}
		}
		if (local25.method1826(Static84.aClass9_Sub4_Sub1_2.aClass60_414)) {
			Static13.method239(Static149.aClass60_1155, Static194.aClass60_1398, 0);
			return;
		}
		Static140.aLongArray7[Static78.anInt1884] = arg0;
		Static8.aClass60Array2[Static78.anInt1884++] = Static144.method2484(arg0);
		Static181.anInt3848 = Static171.anInt3707;
		Static96.aClass1_Sub9_Sub1_3.method953(28);
		Static96.aClass1_Sub9_Sub1_3.method897(arg0);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/Class;")
	public static Class method2687(@OriginalArg(1) String arg0) throws ClassNotFoundException {
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

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(BLclient!ah;)Lclient!ah;")
	public static Class6 method2688(@OriginalArg(1) Class6 arg0) {
		@Pc(16) int local16 = Static161.method2693(Static166.method2717(arg0));
		if (local16 == 0) {
			return null;
		}
		for (@Pc(22) int local22 = 0; local22 < local16; local22++) {
			arg0 = Static107.method1857(arg0.anInt204);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIZI)V")
	public static void method2689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 == arg3) {
			Static177.method2836(arg2, arg0, arg1, arg4);
		} else if (Static214.anInt4572 <= arg1 - arg4 && Static130.anInt2847 >= arg1 + arg4 && Static141.anInt3163 <= arg0 - arg3 && arg0 + arg3 <= Static200.anInt4273) {
			Static107.method1862(arg1, arg0, arg3, arg4, arg2);
		} else {
			Static2.method45(arg4, arg3, arg2, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!ai;II)Lclient!r;")
	public static Class73 method2691(@OriginalArg(0) Class7 arg0, @OriginalArg(1) int arg1) {
		return Static64.method1157(arg0, arg1) ? Static89.method1534() : null;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIILclient!mc;Ljava/awt/Component;)Lclient!cb;")
	public static Class15 method2692(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class65 arg2, @OriginalArg(4) Component arg3) {
		if (Static191.anInt4086 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(36) Class15 local36 = (Class15) Class.forName("Class15_Sub1").getDeclaredConstructor().newInstance();
			local36.anIntArray335 = new int[(Static59.aBoolean76 ? 2 : 1) * 256];
			local36.anInt2660 = arg1;
			local36.method1994(arg3);
			local36.anInt2657 = (arg1 & 0xFFFFFC00) + 1024;
			if (local36.anInt2657 > 16384) {
				local36.anInt2657 = 16384;
			}
			local36.method1999(local36.anInt2657);
			if (Static209.anInt4485 > 0 && Static166.aClass98_1 == null) {
				Static166.aClass98_1 = new Class98();
				Static166.aClass98_1.aClass65_6 = arg2;
				arg2.method2005(Static209.anInt4485, Static166.aClass98_1);
			}
			if (Static166.aClass98_1 != null) {
				if (Static166.aClass98_1.aClass15Array1[arg0] != null) {
					throw new IllegalArgumentException();
				}
				Static166.aClass98_1.aClass15Array1[arg0] = local36;
			}
			return local36;
		} catch (@Pc(117) Throwable local117) {
			try {
				@Pc(123) Class15_Sub2 local123 = new Class15_Sub2(arg2, arg0);
				local123.anInt2660 = arg1;
				local123.anIntArray335 = new int[(Static59.aBoolean76 ? 2 : 1) * 256];
				local123.method1994(arg3);
				local123.anInt2657 = 16384;
				local123.method1999(local123.anInt2657);
				if (Static209.anInt4485 > 0 && Static166.aClass98_1 == null) {
					Static166.aClass98_1 = new Class98();
					Static166.aClass98_1.aClass65_6 = arg2;
					arg2.method2005(Static209.anInt4485, Static166.aClass98_1);
				}
				if (Static166.aClass98_1 != null) {
					if (Static166.aClass98_1.aClass15Array1[arg0] != null) {
						throw new IllegalArgumentException();
					}
					Static166.aClass98_1.aClass15Array1[arg0] = local123;
				}
				return local123;
			} catch (@Pc(185) Throwable local185) {
				return new Class15();
			}
		}
	}
}
