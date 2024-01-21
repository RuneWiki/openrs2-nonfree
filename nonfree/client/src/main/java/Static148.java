import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!sd", name = "r", descriptor = "I")
	public static int anInt3335;

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "[I")
	public static int[] anIntArray363 = new int[] { 1, 1, 1, 1 };

	@OriginalMember(owner = "client!sd", name = "x", descriptor = "Lclient!sd;")
	private static Class73 aClass73_1813 = Static122.method531("Loading config )2 ");

	@OriginalMember(owner = "client!sd", name = "A", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1814 = aClass73_1813;

	@OriginalMember(owner = "client!sd", name = "D", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1815 = Static122.method531("AUS");

	@OriginalMember(owner = "client!sd", name = "T", descriptor = "[Lclient!kh;")
	public static Class47[] aClass47Array1 = new Class47[50];

	@OriginalMember(owner = "client!sd", name = "gb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1816 = Static122.method531("gr-Un:");

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)V")
	public static void method2412(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static150.method2586(arg1)) {
			Static71.method1254(Static57.aClass83ArrayArray1[arg1], arg0);
		}
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(I)V")
	public static void method2414() {
		Static151.aClass72_46 = new Class72();
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(BLclient!pb;)V")
	public static void method2418(@OriginalArg(1) Class3_Sub17 arg0) {
		Static54.method966(arg0, 200000);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZZI)Lclient!sd;")
	public static Class73 method2421(@OriginalArg(2) int arg0) {
		return Static169.method2645(true, arg0);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIIIIIZ)V")
	public static void method2426(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Class3_Sub10 local7 = null;
		for (@Pc(12) Class3_Sub10 local12 = (Class3_Sub10) Static29.aClass72_11.method2401(); local12 != null; local12 = (Class3_Sub10) Static29.aClass72_11.method2407()) {
			if (arg6 == local12.anInt995 && local12.anInt998 == arg5 && local12.anInt996 == arg0 && arg8 == local12.anInt1002) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class3_Sub10();
			local7.anInt998 = arg5;
			local7.anInt995 = arg6;
			local7.anInt1002 = arg8;
			local7.anInt996 = arg0;
			Static14.method233(local7);
			Static29.aClass72_11.method2404(local7);
		}
		local7.anInt1004 = arg7;
		local7.anInt997 = arg4;
		local7.anInt989 = arg1;
		local7.anInt994 = arg3;
		local7.anInt1001 = arg2;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILclient!oe;)V")
	public static void method2427(@OriginalArg(1) Class58 arg0) {
		Static115.aClass58_1 = arg0;
	}

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "(B)V")
	public static void method2448() {
		aClass73_1813 = null;
		anIntArray363 = null;
		aClass47Array1 = null;
		aClass73_1814 = null;
		aClass73_1816 = null;
		aClass73_1815 = null;
	}

	@OriginalMember(owner = "client!sd", name = "i", descriptor = "(I)V")
	public static void method2449() {
		Static51.anInt1228 = 0;
		@Pc(17) int local17 = Static134.anInt3066 + (Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anInt3159 >> 7);
		@Pc(24) int local24 = (Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anInt3169 >> 7) + Static151.anInt3389;
		if (local24 >= 3053 && local24 <= 3156 && local17 >= 3056 && local17 <= 3136) {
			Static51.anInt1228 = 1;
		}
		if (local24 >= 3072 && local24 <= 3118 && local17 >= 9492 && local17 <= 9535) {
			Static51.anInt1228 = 1;
		}
		if (Static51.anInt1228 == 1 && local24 >= 3139 && local24 <= 3199 && local17 >= 3008 && local17 <= 3062) {
			Static51.anInt1228 = 0;
		}
	}

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "(III)I")
	public static int method2450(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg1 >>> 31;
		return (local8 + arg1) / arg0 - local8;
	}
}
