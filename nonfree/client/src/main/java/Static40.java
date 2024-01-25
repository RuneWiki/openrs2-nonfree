import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "Lclient!l;")
	public static Class57 aClass57_25;

	@OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
	public static int anInt6448;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
	public static final int anInt6446 = -11713997;

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString238 = "RuneScape is loading - please wait...";

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString239 = " from your friend list first.";

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "[I")
	public static final int[] anIntArray537 = new int[1000];

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)Lclient!qg;")
	public static Class3_Sub7_Sub18 method5455(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub7_Sub18 local10 = (Class3_Sub7_Sub18) Static58.aClass188_1.method5061((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static69.aClass100_25.method2319(arg0, 0);
		if (local20 == null || local20.length <= 1) {
			return null;
		} else {
			local10 = Static354.method5736(local20);
			Static58.aClass188_1.method5063(local10, (long) arg0);
			return local10;
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IB)Lclient!qs;")
	public static Class3_Sub3 method5456(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return new Class3_Sub3_Sub38();
		} else if (arg0 == 1) {
			return new Class3_Sub3_Sub21();
		} else if (arg0 == 2) {
			return new Class3_Sub3_Sub9();
		} else if (arg0 == 3) {
			return new Class3_Sub3_Sub36();
		} else if (arg0 == 4) {
			return new Class3_Sub3_Sub5();
		} else if (arg0 == 5) {
			return new Class3_Sub3_Sub25();
		} else if (arg0 == 6) {
			return new Class3_Sub3_Sub29();
		} else if (arg0 == 7) {
			return new Class3_Sub3_Sub19();
		} else if (arg0 == 8) {
			return new Class3_Sub3_Sub30();
		} else if (arg0 == 9) {
			return new Class3_Sub3_Sub33();
		} else if (arg0 == 10) {
			return new Class3_Sub3_Sub27();
		} else if (arg0 == 11) {
			return new Class3_Sub3_Sub28();
		} else if (arg0 == 12) {
			return new Class3_Sub3_Sub16();
		} else if (arg0 == 13) {
			return new Class3_Sub3_Sub37();
		} else if (arg0 == 14) {
			return new Class3_Sub3_Sub8();
		} else if (arg0 == 15) {
			return new Class3_Sub3_Sub24();
		} else if (arg0 == 16) {
			return new Class3_Sub3_Sub11();
		} else if (arg0 == 17) {
			return new Class3_Sub3_Sub26();
		} else if (arg0 == 18) {
			return new Class3_Sub3_Sub12_Sub1();
		} else if (arg0 == 19) {
			return new Class3_Sub3_Sub2();
		} else if (arg0 == 20) {
			return new Class3_Sub3_Sub18();
		} else if (arg0 == 21) {
			return new Class3_Sub3_Sub22();
		} else if (arg0 == 22) {
			return new Class3_Sub3_Sub10();
		} else if (arg0 == 23) {
			return new Class3_Sub3_Sub3();
		} else if (arg0 == 24) {
			return new Class3_Sub3_Sub34();
		} else if (arg0 == 25) {
			return new Class3_Sub3_Sub35();
		} else if (arg0 == 26) {
			return new Class3_Sub3_Sub17();
		} else if (arg0 == 27) {
			return new Class3_Sub3_Sub4();
		} else if (arg0 == 28) {
			return new Class3_Sub3_Sub7();
		} else if (arg0 == 29) {
			return new Class3_Sub3_Sub31();
		} else if (arg0 == 30) {
			return new Class3_Sub3_Sub13();
		} else if (arg0 == 31) {
			return new Class3_Sub3_Sub32();
		} else if (arg0 == 32) {
			return new Class3_Sub3_Sub20();
		} else if (arg0 == 33) {
			return new Class3_Sub3_Sub14();
		} else if (arg0 == 34) {
			return new Class3_Sub3_Sub6();
		} else if (arg0 == 35) {
			return new Class3_Sub3_Sub39();
		} else if (arg0 == 36) {
			return new Class3_Sub3_Sub23();
		} else if (arg0 == 37) {
			return new Class3_Sub3_Sub1();
		} else if (arg0 == 38) {
			return new Class3_Sub3_Sub15();
		} else if (arg0 == 39) {
			return new Class3_Sub3_Sub12();
		} else {
			return null;
		}
	}
}
