import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!tf", name = "u", descriptor = "Lclient!cc;")
	public static Class11 aClass11_2;

	@OriginalMember(owner = "client!tf", name = "R", descriptor = "[I")
	public static int[] anIntArray132;

	@OriginalMember(owner = "client!tf", name = "ab", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!tf", name = "pb", descriptor = "[I")
	public static int[] anIntArray133;

	@OriginalMember(owner = "client!tf", name = "Bb", descriptor = "[Lclient!rd;")
	public static Class4_Sub3_Sub6_Sub3[] aClass4_Sub3_Sub6_Sub3Array6;

	@OriginalMember(owner = "client!tf", name = "q", descriptor = "Lclient!od;")
	public static Class60 aClass60_482 = Static41.method597("Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

	@OriginalMember(owner = "client!tf", name = "nb", descriptor = "Lclient!od;")
	private static Class60 aClass60_486 = Static41.method597("Continue");

	@OriginalMember(owner = "client!tf", name = "t", descriptor = "Lclient!od;")
	public static Class60 aClass60_483 = aClass60_486;

	@OriginalMember(owner = "client!tf", name = "A", descriptor = "I")
	public static int anInt1295 = 0;

	@OriginalMember(owner = "client!tf", name = "M", descriptor = "Lclient!od;")
	public static Class60 aClass60_484 = Static41.method597("-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

	@OriginalMember(owner = "client!tf", name = "bb", descriptor = "Lclient!od;")
	public static Class60 aClass60_485 = Static41.method597("Titelbild geladen)3");

	@OriginalMember(owner = "client!tf", name = "qb", descriptor = "Lclient!od;")
	public static Class60 aClass60_487 = Static41.method597("Lade)3)3)3");

	@OriginalMember(owner = "client!tf", name = "rb", descriptor = "Lclient!od;")
	public static Class60 aClass60_488 = Static41.method597(" ");

	@OriginalMember(owner = "client!tf", name = "vb", descriptor = "[I")
	public static int[] anIntArray134 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!tf", name = "Ib", descriptor = "Lclient!od;")
	public static Class60 aClass60_489 = Static41.method597("Spiel)2Engine wird gestartet)3)3)3");

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(II)I")
	public static int method768(@OriginalArg(0) int arg0) {
		return arg0 >> 17 & 0x7;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!b;")
	public static RuntimeException_Sub1 method784(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString1 = local9.aString1 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!c;I)V")
	public static void method791(@OriginalArg(0) Class10 arg0) {
		Static108.aClass10_28 = arg0;
	}

	@OriginalMember(owner = "client!tf", name = "q", descriptor = "(I)V")
	public static void method810() {
		aClass60_487 = null;
		anIntArray132 = null;
		aClass60_483 = null;
		aClass60_489 = null;
		anIntArray133 = null;
		anIntArray134 = null;
		aClass60_482 = null;
		anIntArrayArrayArray3 = null;
		aClass60_485 = null;
		aClass11_2 = null;
		aClass4_Sub3_Sub6_Sub3Array6 = null;
		aClass60_484 = null;
		aClass60_488 = null;
		aClass60_486 = null;
	}

	@OriginalMember(owner = "client!tf", name = "s", descriptor = "(I)V")
	public static void method812() {
		Static96.aClass4_Sub9_Sub1_2.method832();
		@Pc(7) int local7 = Static96.aClass4_Sub9_Sub1_2.method833(1);
		if (local7 == 0) {
			return;
		}
		@Pc(19) int local19 = Static96.aClass4_Sub9_Sub1_2.method833(2);
		if (local19 == 0) {
			Static35.anIntArray97[Static9.anInt116++] = 2047;
			return;
		}
		@Pc(38) int local38;
		@Pc(48) int local48;
		if (local19 == 1) {
			local38 = Static96.aClass4_Sub9_Sub1_2.method833(3);
			Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.method851(local38, false);
			local48 = Static96.aClass4_Sub9_Sub1_2.method833(1);
			if (local48 == 1) {
				Static35.anIntArray97[Static9.anInt116++] = 2047;
			}
			return;
		}
		@Pc(90) int local90;
		if (local19 == 2) {
			local38 = Static96.aClass4_Sub9_Sub1_2.method833(3);
			Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.method851(local38, true);
			local48 = Static96.aClass4_Sub9_Sub1_2.method833(3);
			Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.method851(local48, true);
			local90 = Static96.aClass4_Sub9_Sub1_2.method833(1);
			if (local90 == 1) {
				Static35.anIntArray97[Static9.anInt116++] = 2047;
			}
		} else if (local19 == 3) {
			local38 = Static96.aClass4_Sub9_Sub1_2.method833(7);
			local48 = Static96.aClass4_Sub9_Sub1_2.method833(7);
			Static77.anInt1866 = Static96.aClass4_Sub9_Sub1_2.method833(2);
			local90 = Static96.aClass4_Sub9_Sub1_2.method833(1);
			@Pc(132) int local132 = Static96.aClass4_Sub9_Sub1_2.method833(1);
			if (local132 == 1) {
				Static35.anIntArray97[Static9.anInt116++] = 2047;
			}
			Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.method856(local90 == 1, local48, local38);
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!od;Lclient!od;IIIII)V")
	public static void method814(@OriginalArg(0) Class60 arg0, @OriginalArg(1) Class60 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static12.aBoolean107 || Static48.anInt1184 >= 500) {
			return;
		}
		Static80.aClass60Array14[Static48.anInt1184] = arg1;
		Static128.aClass60Array20[Static48.anInt1184] = arg0;
		Static82.anIntArray226[Static48.anInt1184] = arg3;
		Static130.anIntArray342[Static48.anInt1184] = arg5;
		Static25.anIntArray87[Static48.anInt1184] = arg2;
		Static61.anIntArray178[Static48.anInt1184] = arg4;
		Static48.anInt1184++;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IBI)V")
	public static void method818(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static118.method1894(arg1)) {
			Static28.method1358(Static82.aClass4_Sub14ArrayArray1[arg1], arg0);
		}
	}
}
