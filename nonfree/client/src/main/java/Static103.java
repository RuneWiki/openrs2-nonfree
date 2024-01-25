import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(IBI)Z")
	public static boolean method2358(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static33.method1193(arg0, arg1) || Static376.method5847(arg0, arg1);
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(Z)V")
	public static void method2359() {
		if (Static212.anInt4965 == -1) {
			return;
		}
		@Pc(11) int local11 = Static288.aClass35_6.method5764();
		@Pc(15) int local15 = Static288.aClass35_6.method5761();
		@Pc(20) Class8_Sub33 local20 = (Class8_Sub33) Static188.aClass43_24.method1422();
		if (local20 != null) {
			local11 = local20.method7202();
			local15 = local20.method7207();
		}
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		if (Static513.aBoolean642) {
			local36 = Static550.method8313();
			local38 = Static530.method7484();
		}
		Static289.method4831(Static212.anInt4965, Static313.anInt6355 + local38, local38, local38, local36, local36, local36 + local11, Static235.anInt5298 + local36, local15, local11, local38 + local15);
		if (Static261.aClass331_8 != null) {
			Static559.method7203(local11 + local36, local15 + local38);
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(ZI)Z")
	public static boolean method2361(@OriginalArg(1) int arg0) {
		return arg0 == 7 || arg0 == 9;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIII)V")
	public static void method2362(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg2 * Static155.aClass8_Sub25_6.aClass36_Sub6_2.method3331() >> 8;
		if (arg1 == -1 && !Static424.aBoolean575) {
			Static117.method2610();
		} else if (arg1 != -1 && (Static505.anInt8909 != arg1 || !Static495.method1941()) && local12 != 0 && !Static424.aBoolean575) {
			Static537.method7582(arg1, local12, Static628.aClass237_148, arg0);
			Static117.method2615();
		}
		if (Static505.anInt8909 != arg1) {
			Static454.aClass8_Sub16_Sub1_2 = null;
		}
		Static505.anInt8909 = arg1;
	}

	@OriginalMember(owner = "client!dm", name = "c", descriptor = "(B)I")
	public static int method2363() {
		if (Static224.anInt5112 == 0) {
			Static45.aClass38_2.method1363(new Class363("jaclib"));
			if (Static45.aClass38_2.method1359().method8361() != 100) {
				return 1;
			}
			if (!((Class363) Static45.aClass38_2.method1359()).method8366()) {
				Static227.aClient1.method1911();
			}
			Static224.anInt5112 = 1;
		}
		@Pc(243) int local243;
		@Pc(266) int local266;
		@Pc(280) int local280;
		@Pc(286) int local286;
		if (Static224.anInt5112 == 1) {
			Static38.aClass38Array1 = Static45.method1358();
			Static45.aClass38_1.method1363(new Class346(Static394.aClass237_103));
			Static45.aClass38_3.method1363(new Class363("jaggl"));
			Static45.aClass38_4.method1363(new Class363("jagdx"));
			Static45.aClass38_5.method1363(new Class363("jagmisc"));
			Static45.aClass38_6.method1363(new Class363("sw3d"));
			Static45.aClass38_7.method1363(new Class363("hw3d"));
			Static45.aClass38_8.method1363(new Class363("jagtheora"));
			Static45.aClass38_9.method1363(new Class346(Static636.aClass237_150));
			Static45.aClass38_10.method1363(new Class346(Static155.aClass237_48));
			Static45.aClass38_11.method1363(new Class346(Static205.aClass237_57));
			Static45.aClass38_12.method1363(new Class346(Static385.aClass237_139));
			Static45.aClass38_13.method1363(new Class346(Static154.aClass237_13));
			Static45.aClass38_14.method1363(new Class346(Static498.aClass237_122));
			Static45.aClass38_15.method1363(new Class346(Static31.aClass237_10));
			Static45.aClass38_16.method1363(new Class346(Static626.aClass237_147));
			Static45.aClass38_17.method1363(new Class346(Static484.aClass237_117));
			Static45.aClass38_18.method1363(new Class346(Static478.aClass237_116));
			Static45.aClass38_19.method1363(new Class346(Static13.aClass237_124));
			Static45.aClass38_20.method1363(new Class346(Static603.aClass237_144));
			Static45.aClass38_21.method1363(new Class346(Static127.aClass237_33));
			Static45.aClass38_22.method1363(new Class346(Static543.aClass237_131));
			Static45.aClass38_23.method1363(new Class177(Static51.aClass237_16, "huffman"));
			Static45.aClass38_24.method1363(new Class346(Static271.aClass237_72));
			Static45.aClass38_25.method1363(new Class346(Static112.aClass237_30));
			Static45.aClass38_26.method1363(new Class346(Static264.aClass237_69));
			Static45.aClass38_27.method1363(new Class28(Static50.aClass237_15, "details"));
			for (local243 = 0; local243 < Static38.aClass38Array1.length; local243++) {
				if (Static38.aClass38Array1[local243].method1359() == null) {
					throw new RuntimeException();
				}
			}
			local266 = 0;
			@Pc(268) Class38[] local268 = Static38.aClass38Array1;
			for (@Pc(270) int local270 = 0; local270 < local268.length; local270++) {
				@Pc(276) Class38 local276 = local268[local270];
				local280 = local276.method1362();
				local286 = local276.method1359().method8361();
				local266 += local286 * local280 / 100;
			}
			Static224.anInt5112 = 2;
			Static41.anInt1504 = local266;
		}
		if (Static38.aClass38Array1 == null) {
			return 100;
		}
		local243 = 0;
		local266 = 0;
		@Pc(313) boolean local313 = true;
		@Pc(315) Class38[] local315 = Static38.aClass38Array1;
		for (@Pc(317) int local317 = 0; local317 < local315.length; local317++) {
			@Pc(323) Class38 local323 = local315[local317];
			local286 = local323.method1362();
			@Pc(333) int local333 = local323.method1359().method8361();
			if (local333 < 100) {
				local313 = false;
			}
			local243 += local286;
			local266 += local333 * local286 / 100;
		}
		if (local313) {
			if (!((Class363) Static45.aClass38_5.method1359()).method8366()) {
				Static227.aClient1.method1917();
			}
			if (!((Class363) Static45.aClass38_8.method1359()).method8366()) {
				Static184.aBoolean309 = Static227.aClient1.method1901();
			}
			Static38.aClass38Array1 = null;
		}
		local243 -= Static41.anInt1504;
		local266 -= Static41.anInt1504;
		local280 = local243 <= 0 ? 100 : local266 * 100 / local243;
		if (!local313 && local280 > 99) {
			local280 = 99;
		}
		return local280;
	}
}
