import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!ji", name = "l", descriptor = "Lclient!wp;")
	public static Class217 aClass217_5;

	@OriginalMember(owner = "client!ji", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString28;

	@OriginalMember(owner = "client!ji", name = "o", descriptor = "I")
	public static int anInt3089 = 0;

	@OriginalMember(owner = "client!ji", name = "p", descriptor = "[Lclient!pi;")
	public static final Class17_Sub1_Sub1_Sub2[] aClass17_Sub1_Sub1_Sub2Array1 = new Class17_Sub1_Sub1_Sub2[32768];

	@OriginalMember(owner = "client!ji", name = "r", descriptor = "Z")
	public static boolean aBoolean292 = false;

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)Ljava/lang/String;")
	public static String method2823() {
		@Pc(5) String local5 = "www";
		if (Static63.anInt5669 != 0) {
			local5 = "www-wtqa";
		}
		@Pc(19) String local19 = "";
		if (Static158.aString33 != null) {
			local19 = "/p=" + Static158.aString33;
		}
		return Static8.anInt5875 == 1 ? "http://" + local5 + ".stellardawn.com/l=" + Static259.anInt2907 + "/a=" + Static163.anInt3550 + local19 + "/" : "http://" + local5 + ".runescape.com/l=" + Static259.anInt2907 + "/a=" + Static163.anInt3550 + local19 + "/";
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Z)V")
	public static void method2824() {
		for (@Pc(10) Class8_Sub7 local10 = (Class8_Sub7) Static49.aClass217_1.method5689(); local10 != null; local10 = (Class8_Sub7) Static49.aClass217_1.method5689()) {
			Static209.method3978(local10);
		}
		Static44.method1028();
		Static44.method1012();
		Static44.method1019();
		Static44.method1022();
		Static44.method1026();
		Static44.method1029();
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!uo;IILclient!wr;III[[[B[I[I[I[I[IIBIIZ)V")
	public static void method2825(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class109 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) byte arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		Static20.aClass32_4 = arg0;
		Static40.anInt1288 = arg1;
		Static75.aClass109_13 = arg3;
		Static328.aBoolean612 = Static20.aClass32_4.method2240() > 0;
		Static318.anInt6137 = arg4 >> 7;
		Static204.anInt4305 = arg6 >> 7;
		Static171.anInt3695 = arg4;
		Static234.anInt4778 = arg6;
		Static167.anInt3601 = arg5;
		Static326.anInt2473 = Static318.anInt6137 - Static77.anInt2009;
		if (Static326.anInt2473 < 0) {
			Static70.anInt1845 = -Static326.anInt2473;
			Static326.anInt2473 = 0;
		} else {
			Static70.anInt1845 = 0;
		}
		Static327.anInt6282 = Static204.anInt4305 - Static77.anInt2009;
		if (Static327.anInt6282 < 0) {
			Static12.anInt432 = -Static327.anInt6282;
			Static327.anInt6282 = 0;
		} else {
			Static12.anInt432 = 0;
		}
		Static92.anInt3571 = Static318.anInt6137 + Static77.anInt2009;
		if (Static92.anInt3571 > Static242.anInt6744) {
			Static92.anInt3571 = Static242.anInt6744;
		}
		Static70.anInt1848 = Static204.anInt4305 + Static77.anInt2009;
		if (Static70.anInt1848 > Static315.anInt6124) {
			Static70.anInt1848 = Static315.anInt6124;
		}
		@Pc(77) int local77;
		@Pc(84) int local84;
		@Pc(90) int local90;
		for (@Pc(74) int local74 = 0; local74 < Static77.anInt2009 + Static77.anInt2009 + 2; local74++) {
			for (local77 = 0; local77 < Static77.anInt2009 + Static77.anInt2009 + 2; local77++) {
				local84 = Static318.anInt6137 + local74 - Static77.anInt2009;
				local90 = Static204.anInt4305 + local77 - Static77.anInt2009;
				if (local84 >= 0 && local90 >= 0 && local84 < Static242.anInt6744 && local90 < Static315.anInt6124) {
					@Pc(104) int local104 = local84 << 7;
					@Pc(108) int local108 = local90 << 7;
					@Pc(117) int local117 = Static190.aClass53Array1[3].method2785(local84, local90) - 1000;
					@Pc(137) int local137 = Static269.aClass53Array2 == null ? Static190.aClass53Array1[0].method2785(local84, local90) + 128 : Static269.aClass53Array2[0].method2785(local84, local90) + 128;
					Static203.aBooleanArrayArray4[local74][local77] = Static20.aClass32_4.method2243(local104, local117, local108, local104, local137, local108);
				} else {
					Static203.aBooleanArrayArray4[local74][local77] = false;
				}
			}
		}
		for (local77 = 0; local77 < Static77.anInt2009 + Static77.anInt2009 + 1; local77++) {
			for (local84 = 0; local84 < Static77.anInt2009 + Static77.anInt2009 + 1; local84++) {
				Static253.aBooleanArrayArray6[local77][local84] = Static203.aBooleanArrayArray4[local77][local84] || Static203.aBooleanArrayArray4[local77 + 1][local84] || Static203.aBooleanArrayArray4[local77][local84 + 1] || Static203.aBooleanArrayArray4[local77 + 1][local84 + 1];
			}
		}
		Static124.anIntArray253 = arg8;
		Static340.anIntArray518 = arg9;
		Static75.anIntArray197 = arg10;
		Static341.anIntArray522 = arg11;
		Static135.anIntArray264 = arg12;
		Static237.method4335();
		Static339.method5471();
		for (@Pc(253) Class8_Sub5 local253 = (Class8_Sub5) Static92.aClass217_8.method5683(); local253 != null; local253 = (Class8_Sub5) Static92.aClass217_8.method5679()) {
			local253.method4763();
			Static241.method4374(local253);
		}
		if (Static328.aBoolean612) {
			for (local90 = 0; local90 < Static305.anInt6023; local90++) {
				Static309.aClass1_Sub30_Sub1Array2[local90].method4618(arg1, arg17);
			}
		}
		if (arg2 > 1) {
			Static20.aClass32_4.method2195(0);
			if (Static231.aClass42_1 == null || Static231.aClass42_1 instanceof Class42_Sub1) {
				Static231.aClass42_1 = new Class42_Sub2();
			}
		} else if (Static231.aClass42_1 == null || Static231.aClass42_1 instanceof Class42_Sub2) {
			Static231.aClass42_1 = new Class42_Sub1();
		}
		Static231.aClass42_1.method2034(arg2);
		Static231.aClass42_1.method2031();
		if (Static91.aClass194ArrayArrayArray2 != null) {
			Static177.method3703(true);
			Static231.aClass42_1.method2035(22);
			Static110.method5409(arg2, null, 0, (byte) 0, arg15, arg16);
			Static231.aClass42_1.method2031();
			Static231.aClass42_1.method2035(23);
			Static177.method3703(false);
		}
		Static110.method5409(arg2, arg7, arg13, arg14, arg15, arg16);
		Static231.aClass42_1.method2031();
		Static231.aClass42_1.method2033();
		Static231.aClass42_1.method2031();
		if (arg2 > 1) {
			Static20.aClass32_4.method2211(0);
		}
		Static20.aClass32_4.method2236(0, null);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZZI)V")
	public static void method2826(@OriginalArg(1) boolean arg0) {
		Static103.anInt2460++;
		Static52.method1344();
		if (arg0) {
			Static213.anInt4559++;
			Static18.method432();
		}
	}
}
