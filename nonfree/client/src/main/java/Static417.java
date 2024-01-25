import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static417 {

	@OriginalMember(owner = "client!q", name = "b", descriptor = "Lclient!ba;")
	public static Class23 aClass23_7;

	@OriginalMember(owner = "client!q", name = "d", descriptor = "I")
	public static int anInt7669;

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(I)I")
	public static int method6105() {
		if (Static247.anInt4536 == 0) {
			Static191.aClass138_2.method2938(new Class2("jaclib"));
			if (Static191.aClass138_2.method2934().method7690() != 100) {
				return 1;
			}
			if (!((Class2) Static191.aClass138_2.method2934()).method49()) {
				Static399.aClient1.method1123();
			}
			Static247.anInt4536 = 1;
		}
		@Pc(224) int local224;
		@Pc(243) int local243;
		@Pc(257) int local257;
		@Pc(265) int local265;
		if (Static247.anInt4536 == 1) {
			Static508.aClass138Array1 = Static191.method2933();
			Static191.aClass138_1.method2938(new Class6(Static416.aClass270_87));
			Static191.aClass138_3.method2938(new Class2("jaggl"));
			Static191.aClass138_4.method2938(new Class2("jagdx"));
			Static191.aClass138_5.method2938(new Class2("jagmisc"));
			Static191.aClass138_6.method2938(new Class2("sw3d"));
			Static191.aClass138_7.method2938(new Class2("hw3d"));
			Static191.aClass138_8.method2938(new Class6(Static398.aClass270_78));
			Static191.aClass138_9.method2938(new Class6(Static103.aClass270_23));
			Static191.aClass138_10.method2938(new Class6(Static462.aClass270_97));
			Static191.aClass138_11.method2938(new Class6(Static416.aClass270_86));
			Static191.aClass138_12.method2938(new Class6(Static530.aClass270_111));
			Static191.aClass138_13.method2938(new Class6(Static82.aClass270_15));
			Static191.aClass138_14.method2938(new Class6(Static535.aClass270_112));
			Static191.aClass138_15.method2938(new Class6(Static513.aClass270_106));
			Static191.aClass138_16.method2938(new Class6(Static498.aClass270_102));
			Static191.aClass138_17.method2938(new Class6(Static521.aClass270_108));
			Static191.aClass138_18.method2938(new Class6(Static171.aClass270_37));
			Static191.aClass138_19.method2938(new Class6(Static101.aClass270_22));
			Static191.aClass138_20.method2938(new Class6(Static344.aClass270_66));
			Static191.aClass138_21.method2938(new Class6(Static6.aClass270_1));
			Static191.aClass138_22.method2938(new Class354(Static172.aClass270_38, "huffman"));
			Static191.aClass138_23.method2938(new Class6(Static332.aClass270_88));
			Static191.aClass138_24.method2938(new Class6(Static410.aClass270_83));
			Static191.aClass138_25.method2938(new Class6(Static412.aClass270_85));
			Static191.aClass138_26.method2938(new Class27(Static129.aClass270_30, "details"));
			for (local224 = 0; local224 < Static508.aClass138Array1.length; local224++) {
				if (Static508.aClass138Array1[local224].method2934() == null) {
					throw new RuntimeException();
				}
			}
			local243 = 0;
			@Pc(245) Class138[] local245 = Static508.aClass138Array1;
			for (@Pc(247) int local247 = 0; local247 < local245.length; local247++) {
				@Pc(253) Class138 local253 = local245[local247];
				local257 = local253.method2931();
				local265 = local253.method2934().method7690();
				local243 += local265 * local257 / 100;
			}
			Static247.anInt4536 = 2;
			Static526.anInt8860 = local243;
		}
		if (Static508.aClass138Array1 == null) {
			return 100;
		}
		local224 = 0;
		local243 = 0;
		@Pc(296) boolean local296 = true;
		@Pc(298) Class138[] local298 = Static508.aClass138Array1;
		for (@Pc(300) int local300 = 0; local300 < local298.length; local300++) {
			@Pc(306) Class138 local306 = local298[local300];
			local265 = local306.method2931();
			@Pc(318) int local318 = local306.method2934().method7690();
			local243 += local265 * local318 / 100;
			local224 += local265;
			if (local318 < 100) {
				local296 = false;
			}
		}
		if (local296) {
			if (!((Class2) Static191.aClass138_5.method2934()).method49()) {
				Static399.aClient1.method1118();
			}
			Static508.aClass138Array1 = null;
		}
		local243 -= Static526.anInt8860;
		local224 -= Static526.anInt8860;
		local257 = local224 > 0 ? local243 * 100 / local224 : 100;
		if (!local296 && local257 > 99) {
			local257 = 99;
		}
		return local257;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(ILclient!vg;Z)V")
	public static void method6106(@OriginalArg(1) Class341 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(15) int local15 = arg0.anInt9326 == 0 ? arg0.anInt9300 : arg0.anInt9326;
		@Pc(25) int local25 = arg0.anInt9274 == 0 ? arg0.anInt9248 : arg0.anInt9274;
		Static163.method2381(local15, Static578.aClass341ArrayArray2[arg0.anInt9306 >> 16], arg1, arg0.anInt9306, local25);
		if (arg0.aClass341Array2 != null) {
			Static163.method2381(local15, arg0.aClass341Array2, arg1, arg0.anInt9306, local25);
		}
		@Pc(58) Class1_Sub44 local58 = (Class1_Sub44) Static78.aClass187_8.method3797((long) arg0.anInt9306);
		if (local58 != null) {
			Static166.method2392(arg1, local25, local58.anInt7685, local15);
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(ILclient!pu;)I")
	public static int method6108(@OriginalArg(1) Class270 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method5694(Static238.anInt4443)) {
			local5++;
		}
		if (arg0.method5694(Static182.anInt3237)) {
			local5++;
		}
		if (arg0.method5694(Static306.anInt4493)) {
			local5++;
		}
		if (arg0.method5694(Static334.anInt5671)) {
			local5++;
		}
		if (arg0.method5694(Static397.anInt9636)) {
			local5++;
		}
		if (arg0.method5694(Static394.anInt6880)) {
			local5++;
		}
		if (arg0.method5694(Static11.anInt148)) {
			local5++;
		}
		if (arg0.method5694(Static481.anInt8098)) {
			local5++;
		}
		if (arg0.method5694(Static65.anInt1322)) {
			local5++;
		}
		if (arg0.method5694(Static124.anInt6631)) {
			local5++;
		}
		if (arg0.method5694(Static382.anInt6461)) {
			local5++;
		}
		if (arg0.method5694(Static276.anInt4815)) {
			local5++;
		}
		if (arg0.method5694(Static96.anInt2010)) {
			local5++;
		}
		if (arg0.method5694(Static49.anInt847)) {
			local5++;
		}
		if (arg0.method5694(Static570.anInt9427)) {
			local5++;
		}
		if (arg0.method5694(Static471.anInt8014)) {
			local5++;
		}
		return local5;
	}
}
