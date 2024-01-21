import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1075 = Static32.method683("Suche nach Updates )2 ");

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
	public static int anInt2316 = 0;

	@OriginalMember(owner = "client!nf", name = "f", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1076 = Static32.method683("Login server offline)3");

	@OriginalMember(owner = "client!nf", name = "g", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1077 = aClass49_1076;

	@OriginalMember(owner = "client!nf", name = "p", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1079 = Static32.method683("Take");

	@OriginalMember(owner = "client!nf", name = "n", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1078 = aClass49_1079;

	@OriginalMember(owner = "client!nf", name = "q", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1080 = Static32.method683("Keine Antwort vom Server)3");

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(BIIII)V")
	public static void method1897(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static175.anInt3819 == 1) {
			Static29.aClass2_Sub2_Sub2_Sub3Array2[Static82.anInt1768 / 100].method1518(Static55.anInt1205 - 8, Static129.anInt2804 + -8);
		}
		if (Static175.anInt3819 == 2) {
			Static29.aClass2_Sub2_Sub2_Sub3Array2[Static82.anInt1768 / 100 + 4].method1518(Static55.anInt1205 - 8, Static129.anInt2804 + -8);
		}
		Static151.method2501();
		if (!Static116.aBoolean106) {
			return;
		}
		@Pc(53) int local53 = arg1 + 20;
		@Pc(59) int local59 = arg0 + 512 - 5;
		Static84.aClass2_Sub2_Sub2_Sub1_Sub1_4.method620(Static33.method692(new Class49[] { Static129.aClass49_1273, Static48.method882(Static131.anInt3731) }), local59, local53, 16776960, -1);
		@Pc(80) int local80 = local53 + 15;
		@Pc(82) Runtime local82 = Runtime.getRuntime();
		@Pc(84) int local84 = 16776960;
		@Pc(94) int local94 = (int) ((local82.totalMemory() - local82.freeMemory()) / 1024L);
		if (local94 > 32768 && Static159.aBoolean148) {
			local84 = 16711680;
		}
		if (local94 > 65536 && !Static159.aBoolean148) {
			local84 = 16711680;
		}
		Static84.aClass2_Sub2_Sub2_Sub1_Sub1_4.method620(Static33.method692(new Class49[] { Static5.aClass49_75, Static48.method882(local94), Static92.aClass49_947 }), local59, local80, local84, -1);
		local53 = local80 + 15;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Z)Lclient!df;")
	public static Class2_Sub2_Sub2_Sub2 method1898() {
		@Pc(7) Class2_Sub2_Sub2_Sub2 local7 = new Class2_Sub2_Sub2_Sub2();
		local7.aByteArray11 = Static9.aByteArrayArray1[0];
		local7.anInt881 = Static63.anIntArray165[0];
		local7.anInt883 = Static148.anInt3150;
		local7.anInt880 = Static103.anInt2179;
		local7.anInt882 = Static178.anIntArray364[0];
		local7.anInt878 = Static20.anIntArray41[0];
		local7.anInt879 = Static142.anIntArray282[0];
		local7.anIntArray79 = Static47.anIntArray105;
		Static63.method1094();
		return local7;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V")
	public static void method1899() {
		aClass49_1079 = null;
		aClass49_1075 = null;
		aClass49_1077 = null;
		aClass49_1080 = null;
		aClass49_1078 = null;
		aClass49_1076 = null;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIILclient!ka;Lclient!ka;IIJ)V")
	public static void method1900(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub2_Sub3 arg4, @OriginalArg(5) Class2_Sub2_Sub3 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class7 local8 = new Class7();
		local8.aLong13 = arg8;
		local8.anInt192 = arg1 * 128 + 64;
		local8.anInt190 = arg2 * 128 + 64;
		local8.anInt186 = arg3;
		local8.aClass2_Sub2_Sub3_1 = arg4;
		local8.aClass2_Sub2_Sub3_2 = arg5;
		local8.anInt187 = arg6;
		local8.anInt193 = arg7;
		for (@Pc(42) int local42 = arg0; local42 >= 0; local42--) {
			if (Static72.aClass2_Sub1ArrayArrayArray1[local42][arg1][arg2] == null) {
				Static72.aClass2_Sub1ArrayArrayArray1[local42][arg1][arg2] = new Class2_Sub1(local42, arg1, arg2);
			}
		}
		Static72.aClass2_Sub1ArrayArrayArray1[arg0][arg1][arg2].aClass7_1 = local8;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)V")
	public static void method1901(@OriginalArg(1) int arg0) {
		if (Static163.method531(arg0)) {
			Static157.method2662(-1, Static149.aClass85ArrayArray1[arg0]);
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V")
	public static void method1902() {
		@Pc(5) int local5 = Static42.aClass2_Sub2_Sub2_Sub1_Sub1_1.method614(Static162.aClass49_1610);
		@Pc(19) int local19;
		for (@Pc(11) int local11 = 0; local11 < Static133.anInt3713; local11++) {
			local19 = Static42.aClass2_Sub2_Sub2_Sub1_Sub1_1.method614(Static101.method1743(local11));
			if (local19 > local5) {
				local5 = local19;
			}
		}
		local5 += 8;
		local19 = Static133.anInt3713 * 15 + 21;
		Static98.anInt2077 = local5;
		Static47.aBoolean40 = true;
		@Pc(51) int local51 = Static114.anInt2394 - local5 / 2;
		if (local51 + local5 > 765) {
			local51 = 765 - local5;
		}
		if (local51 < 0) {
			local51 = 0;
		}
		Static113.anInt2340 = Static133.anInt3713 * 15 + 22;
		@Pc(76) int local76 = Static61.anInt1320;
		Static92.anInt1938 = local51;
		if (local19 + local76 > 503) {
			local76 = 503 - local19;
		}
		if (local76 < 0) {
			local76 = 0;
		}
		Static93.anInt1968 = local76;
	}
}
