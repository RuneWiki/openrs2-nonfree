import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!cd", name = "F", descriptor = "Lclient!gs;")
	public static final Class144 aClass144_13 = new Class144(86, 3);

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)V")
	public static void method1569() {
		@Pc(8) Class3_Sub7_Sub21 local8 = Static136.method2378(0L, 15);
		local8.method9260();
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IB)Z")
	public static boolean method1571(@OriginalArg(0) int arg0) {
		if (Static663.anInt10164 != arg0 || Static194.aClass65_4 == null) {
			Static194.aClass65_4 = Static93.aClass65_1;
			Static663.anInt10164 = arg0;
		}
		@Pc(55) int local55;
		if (Static93.aClass65_1 == Static194.aClass65_4) {
			@Pc(38) byte[] local38 = Static160.aClass182_41.method3961(arg0);
			if (local38 == null) {
				return false;
			}
			@Pc(48) Class3_Sub2 local48 = new Class3_Sub2(local38);
			Static132.method2344(local48);
			local55 = local48.method2048(255);
			for (@Pc(57) int local57 = 0; local57 < local55; local57++) {
				Static160.aClass342_24.method7654(new Class3_Sub35(local48));
			}
			@Pc(76) int local76 = local48.method2054();
			Static585.aClass11Array1 = new Class11[local76];
			for (@Pc(81) int local81 = 0; local81 < local76; local81++) {
				Static585.aClass11Array1[local81] = new Class11(local48);
			}
			@Pc(102) int local102 = local48.method2054();
			Static470.aClass7Array1 = new Class7[local102];
			for (@Pc(107) int local107 = 0; local107 < local102; local107++) {
				Static470.aClass7Array1[local107] = new Class7(local48, local107);
			}
			@Pc(129) int local129 = local48.method2054();
			Static134.aClass401Array1 = new Class401[local129];
			for (@Pc(134) int local134 = 0; local134 < local129; local134++) {
				Static134.aClass401Array1[local134] = new Class401(local48);
			}
			@Pc(159) int local159 = local48.method2054();
			Static393.aClass371Array1 = new Class371[local159];
			for (@Pc(164) int local164 = 0; local164 < local159; local164++) {
				Static393.aClass371Array1[local164] = new Class371(local48);
			}
			@Pc(185) int local185 = local48.method2054();
			Static340.aClass29Array1 = new Class29[local185];
			for (@Pc(190) int local190 = 0; local190 < local185; local190++) {
				Static340.aClass29Array1[local190] = Static49.method1246(local48);
			}
			Static194.aClass65_4 = Static93.aClass65_2;
		}
		if (Static93.aClass65_2 == Static194.aClass65_4) {
			@Pc(221) boolean local221 = true;
			@Pc(223) Class29[] local223 = Static340.aClass29Array1;
			for (local55 = 0; local55 < local223.length; local55++) {
				@Pc(231) Class29 local231 = local223[local55];
				if (!local231.method9494()) {
					local221 = false;
				}
			}
			if (!local221) {
				return false;
			}
			Static194.aClass65_4 = Static93.aClass65_3;
		}
		return true;
	}

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "(I)V")
	public static void method1572() {
		Static580.aClass3_Sub22_24.method2423(1, Static580.aClass3_Sub22_24.aClass21_Sub15_1);
		Static580.aClass3_Sub22_24.method2423(1, Static580.aClass3_Sub22_24.aClass21_Sub15_2);
		Static580.aClass3_Sub22_24.method2423(2, Static580.aClass3_Sub22_24.aClass21_Sub21_1);
		Static580.aClass3_Sub22_24.method2423(2, Static580.aClass3_Sub22_24.aClass21_Sub21_2);
		Static580.aClass3_Sub22_24.method2423(1, Static580.aClass3_Sub22_24.aClass21_Sub5_1);
		Static580.aClass3_Sub22_24.method2423(1, Static580.aClass3_Sub22_24.aClass21_Sub22_1);
		Static580.aClass3_Sub22_24.method2423(1, Static580.aClass3_Sub22_24.aClass21_Sub1_1);
		Static580.aClass3_Sub22_24.method2423(1, Static580.aClass3_Sub22_24.aClass21_Sub9_1);
		Static580.aClass3_Sub22_24.method2423(1, Static580.aClass3_Sub22_24.aClass21_Sub7_1);
		Static580.aClass3_Sub22_24.method2423(1, Static580.aClass3_Sub22_24.aClass21_Sub27_1);
		Static580.aClass3_Sub22_24.method2423(1, Static580.aClass3_Sub22_24.aClass21_Sub30_1);
		Static580.aClass3_Sub22_24.method2423(1, Static580.aClass3_Sub22_24.aClass21_Sub2_1);
		Static580.aClass3_Sub22_24.method2423(0, Static580.aClass3_Sub22_24.aClass21_Sub25_1);
		Static580.aClass3_Sub22_24.method2423(1, Static580.aClass3_Sub22_24.aClass21_Sub8_1);
		Static580.aClass3_Sub22_24.method2423(0, Static580.aClass3_Sub22_24.aClass21_Sub6_1);
		Static580.aClass3_Sub22_24.method2423(0, Static580.aClass3_Sub22_24.aClass21_Sub6_2);
		Static580.aClass3_Sub22_24.method2423(1, Static580.aClass3_Sub22_24.aClass21_Sub26_1);
		Static580.aClass3_Sub22_24.method2423(0, Static580.aClass3_Sub22_24.aClass21_Sub23_1);
		Static580.aClass3_Sub22_24.method2423(0, Static580.aClass3_Sub22_24.aClass21_Sub19_1);
		Static580.aClass3_Sub22_24.method2423(1, Static580.aClass3_Sub22_24.aClass21_Sub14_1);
		Static108.method2127();
		Static580.aClass3_Sub22_24.method2423(1, Static580.aClass3_Sub22_24.aClass21_Sub11_1);
		Static580.aClass3_Sub22_24.method2423(3, Static580.aClass3_Sub22_24.aClass21_Sub13_1);
		Static585.method7560();
		Static509.method6646();
		Static477.aBoolean507 = true;
	}
}
