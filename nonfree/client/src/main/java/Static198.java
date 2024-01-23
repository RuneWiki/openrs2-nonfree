import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!ol", name = "G", descriptor = "Lclient!cg;")
	public static Class22 aClass22_69;

	@OriginalMember(owner = "client!ol", name = "w", descriptor = "Lclient!nb;")
	public static Class111 aClass111_15 = new Class111(128);

	@OriginalMember(owner = "client!ol", name = "J", descriptor = "I")
	public static int anInt4005 = -1;

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(II)Lclient!mi;")
	public static Class109 method3233(@OriginalArg(0) int arg0) {
		@Pc(18) Class109 local18 = (Class109) Static176.aClass172_46.method4347((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(28) byte[] local28 = Static264.aClass22_93.method665(16, arg0);
		local18 = new Class109();
		if (local28 != null) {
			local18.method2669(new Class4_Sub24(local28));
		}
		Static176.aClass172_46.method4345(local18, (long) arg0);
		return local18;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(BI)Lclient!oa;")
	public static Class4_Sub1 method3234(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return new Class4_Sub1_Sub29();
		} else if (arg0 == 1) {
			return new Class4_Sub1_Sub7();
		} else if (arg0 == 2) {
			return new Class4_Sub1_Sub23();
		} else if (arg0 == 3) {
			return new Class4_Sub1_Sub26();
		} else if (arg0 == 4) {
			return new Class4_Sub1_Sub30();
		} else if (arg0 == 5) {
			return new Class4_Sub1_Sub17();
		} else if (arg0 == 6) {
			return new Class4_Sub1_Sub27();
		} else if (arg0 == 7) {
			return new Class4_Sub1_Sub24();
		} else if (arg0 == 8) {
			return new Class4_Sub1_Sub4();
		} else if (arg0 == 9) {
			return new Class4_Sub1_Sub25();
		} else if (arg0 == 10) {
			return new Class4_Sub1_Sub32();
		} else if (arg0 == 11) {
			return new Class4_Sub1_Sub1();
		} else if (arg0 == 12) {
			return new Class4_Sub1_Sub20();
		} else if (arg0 == 13) {
			return new Class4_Sub1_Sub39();
		} else if (arg0 == 14) {
			return new Class4_Sub1_Sub11();
		} else if (arg0 == 15) {
			return new Class4_Sub1_Sub8();
		} else if (arg0 == 16) {
			return new Class4_Sub1_Sub22();
		} else if (arg0 == 17) {
			return new Class4_Sub1_Sub2();
		} else if (arg0 == 18) {
			return new Class4_Sub1_Sub15_Sub1();
		} else if (arg0 == 19) {
			return new Class4_Sub1_Sub21();
		} else if (arg0 == 20) {
			return new Class4_Sub1_Sub13();
		} else if (arg0 == 21) {
			return new Class4_Sub1_Sub5();
		} else if (arg0 == 22) {
			return new Class4_Sub1_Sub12();
		} else if (arg0 == 23) {
			return new Class4_Sub1_Sub33();
		} else if (arg0 == 24) {
			return new Class4_Sub1_Sub10();
		} else if (arg0 == 25) {
			return new Class4_Sub1_Sub16();
		} else if (arg0 == 26) {
			return new Class4_Sub1_Sub14();
		} else if (arg0 == 27) {
			return new Class4_Sub1_Sub37();
		} else if (arg0 == 28) {
			return new Class4_Sub1_Sub19();
		} else if (arg0 == 29) {
			return new Class4_Sub1_Sub36();
		} else if (arg0 == 30) {
			return new Class4_Sub1_Sub3();
		} else if (arg0 == 31) {
			return new Class4_Sub1_Sub31();
		} else if (arg0 == 32) {
			return new Class4_Sub1_Sub35();
		} else if (arg0 == 33) {
			return new Class4_Sub1_Sub18();
		} else if (arg0 == 34) {
			return new Class4_Sub1_Sub9();
		} else if (arg0 == 35) {
			return new Class4_Sub1_Sub28();
		} else if (arg0 == 36) {
			return new Class4_Sub1_Sub6();
		} else if (arg0 == 37) {
			return new Class4_Sub1_Sub34();
		} else if (arg0 == 38) {
			return new Class4_Sub1_Sub38();
		} else if (arg0 == 39) {
			return new Class4_Sub1_Sub15();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method3235(@OriginalArg(1) String arg0) {
		@Pc(9) String local9 = Static94.method1558(Static193.method3171(arg0));
		if (local9 == null) {
			local9 = "";
		}
		return local9;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(ILjava/lang/String;B)V")
	public static void method3236(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(8) Class4_Sub2_Sub15 local8 = Static131.method1210(arg0, 3);
		local8.method2876();
		local8.aString123 = arg1;
	}
}
