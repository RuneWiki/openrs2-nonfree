import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static465 {

	@OriginalMember(owner = "client!tda", name = "s", descriptor = "I")
	public static int anInt8015;

	@OriginalMember(owner = "client!tda", name = "t", descriptor = "[[Lclient!et;")
	public static Class91[][] aClass91ArrayArray1;

	@OriginalMember(owner = "client!tda", name = "f", descriptor = "Lclient!rg;")
	public static final Class252 aClass252_124 = new Class252(50, 3);

	@OriginalMember(owner = "client!tda", name = "o", descriptor = "Z")
	public static boolean aBoolean589 = false;

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(III)Lclient!wv;")
	public static Class20_Sub5 method7066(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class64 local7 = Static263.aClass64ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null || local7.aClass20_Sub5_1 == null ? null : local7.aClass20_Sub5_1;
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(IBLclient!av;II)V")
	public static void method7067(@OriginalArg(0) int arg0, @OriginalArg(2) Class20_Sub1_Sub1_Sub1 arg1, @OriginalArg(4) int arg2) {
		@Pc(10) int local10 = arg1.anIntArray780[0];
		@Pc(15) int local15 = arg1.anIntArray781[0];
		if (local10 < 0 || Static237.anInt4563 <= local10 || local15 < 0 || local15 >= Static373.anInt6694 || (arg2 < 0 || arg2 >= Static237.anInt4563 || arg0 < 0 || Static373.anInt6694 <= arg0)) {
			return;
		}
		@Pc(75) int local75 = Static231.method4172(arg1.method7808(), local10, Static23.anIntArray58, -4, 0, local15, Static362.aClass243Array5[arg1.aByte108], Static102.anIntArray160, arg0, 0, arg2, 0, 0, true);
		if (local75 >= 1 && local75 <= 3) {
			for (@Pc(85) int local85 = 0; local85 < local75 - 1; local85++) {
				arg1.method721(Static23.anIntArray58[local85], (byte) 2, Static102.anIntArray160[local85]);
			}
		}
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(II)Z")
	public static boolean method7068(@OriginalArg(0) int arg0) {
		Static418.anInt6721 = arg0 + 1 & 0xFFFF;
		Static523.aBoolean690 = true;
		return true;
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(IIB)Z")
	public static boolean method7069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public static void method7070(@OriginalArg(0) String arg0) {
		if (Static379.aStringArray32 == null) {
			Static406.method6469();
		}
		@Pc(14) String[] local14 = Static340.method5715(arg0, '\n');
		for (@Pc(20) int local20 = 0; local20 < local14.length; local20++) {
			for (@Pc(24) int local24 = Static151.anInt5204; local24 > 0; local24--) {
				Static379.aStringArray32[local24] = Static379.aStringArray32[local24 - 1];
			}
			Static379.aStringArray32[0] = local14[local20];
			if (Static379.aStringArray32.length - 1 > Static151.anInt5204) {
				Static151.anInt5204++;
				if (Static30.anInt788 > 0) {
					Static30.anInt788++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(B)V")
	public static void method7072() {
		for (@Pc(3) int local3 = 0; local3 < Static169.aClass126ArrayArray1.length; local3++) {
			for (@Pc(15) int local15 = 0; local15 < Static169.aClass126ArrayArray1[local3].length; local15++) {
				Static169.aClass126ArrayArray1[local3][local15] = Static440.aClass126_2;
			}
		}
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(I)V")
	public static void method7074() {
		@Pc(7) Class184[] local7 = Class20_Sub1_Sub1.aClass184Array3;
		synchronized (Class20_Sub1_Sub1.aClass184Array3) {
			for (@Pc(11) int local11 = 0; local11 < Class20_Sub1_Sub1.aClass184Array3.length; local11++) {
				Class20_Sub1_Sub1.aClass184Array3[local11] = new Class184();
				Static117.anIntArray191[local11] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(ILjava/lang/String;IIZ)V")
	public static void method7075(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class91 local8 = Static429.method6657(arg2, arg3);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray30 != null) {
			@Pc(18) Class1_Sub10 local18 = new Class1_Sub10();
			local18.anObjectArray4 = local8.anObjectArray30;
			local18.aClass91_2 = local8;
			local18.anInt2114 = arg0;
			local18.aString44 = arg1;
			Static173.method3207(local18);
		}
		if (Static186.anInt3863 != 9 || !Static63.method1580(local8).method1748(arg0 - 1)) {
			return;
		}
		if (arg0 == 1) {
			Static216.method3997(Static430.aClass252_139);
			Static313.method5428(arg3, arg2, local8.anInt2391);
		}
		if (arg0 == 2) {
			Static216.method3997(Static138.aClass252_136);
			Static313.method5428(arg3, arg2, local8.anInt2391);
		}
		if (arg0 == 3) {
			Static216.method3997(Static436.aClass252_142);
			Static313.method5428(arg3, arg2, local8.anInt2391);
		}
		if (arg0 == 4) {
			Static216.method3997(Static537.aClass252_138);
			Static313.method5428(arg3, arg2, local8.anInt2391);
		}
		if (arg0 == 5) {
			Static216.method3997(Static471.aClass252_125);
			Static313.method5428(arg3, arg2, local8.anInt2391);
		}
		if (arg0 == 6) {
			Static216.method3997(Static402.aClass252_103);
			Static313.method5428(arg3, arg2, local8.anInt2391);
		}
		if (arg0 == 7) {
			Static216.method3997(Static253.aClass252_72);
			Static313.method5428(arg3, arg2, local8.anInt2391);
		}
		if (arg0 == 8) {
			Static216.method3997(Static161.aClass252_50);
			Static313.method5428(arg3, arg2, local8.anInt2391);
		}
		if (arg0 == 9) {
			Static216.method3997(Static78.aClass252_37);
			Static313.method5428(arg3, arg2, local8.anInt2391);
		}
		if (arg0 == 10) {
			Static216.method3997(Static56.aClass252_24);
			Static313.method5428(arg3, arg2, local8.anInt2391);
		}
	}
}
