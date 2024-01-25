import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static491 {

	@OriginalMember(owner = "client!pda", name = "w", descriptor = "Lclient!cl;")
	public static Class58 aClass58_8;

	@OriginalMember(owner = "client!pda", name = "i", descriptor = "(I)I")
	public static int method6649() {
		if (Static332.anInt5339 == 0) {
			Static56.aClass44_2.method1311(new Class159("jaclib"));
			if (Static56.aClass44_2.method1316().method9564() != 100) {
				return 1;
			}
			if (!((Class159) Static56.aClass44_2.method1316()).method3491()) {
				Static459.aClient1.method1846();
			}
			Static332.anInt5339 = 1;
		}
		@Pc(255) int local255;
		@Pc(281) int local281;
		@Pc(297) int local297;
		@Pc(303) int local303;
		if (Static332.anInt5339 == 1) {
			Static66.aClass44Array1 = Static56.method1317();
			Static56.aClass44_1.method1311(new Class408(Static86.aClass182_20));
			Static56.aClass44_3.method1311(new Class159("jaggl"));
			Static56.aClass44_4.method1311(new Class159("jagdx"));
			Static56.aClass44_5.method1311(new Class159("jagmisc"));
			Static56.aClass44_6.method1311(new Class159("sw3d"));
			Static56.aClass44_7.method1311(new Class159("hw3d"));
			Static56.aClass44_8.method1311(new Class159("jagtheora"));
			Static56.aClass44_9.method1311(new Class408(Static58.aClass182_12));
			Static56.aClass44_10.method1311(new Class408(Static433.aClass182_89));
			Static56.aClass44_11.method1311(new Class408(Static546.aClass182_105));
			Static56.aClass44_12.method1311(new Class408(Static153.aClass182_40));
			Static56.aClass44_13.method1311(new Class408(Static677.aClass182_125));
			Static56.aClass44_14.method1311(new Class408(Static120.aClass182_35));
			Static56.aClass44_15.method1311(new Class408(Static137.aClass182_36));
			Static56.aClass44_16.method1311(new Class408(Static236.aClass182_63));
			Static56.aClass44_17.method1311(new Class408(Static210.aClass182_56));
			Static56.aClass44_18.method1311(new Class408(Static555.aClass182_97));
			Static56.aClass44_19.method1311(new Class408(Static62.aClass182_13));
			Static56.aClass44_20.method1311(new Class408(Static425.aClass182_88));
			Static56.aClass44_21.method1311(new Class408(Static141.aClass182_37));
			Static56.aClass44_22.method1311(new Class408(Static259.aClass182_69));
			Static56.aClass44_23.method1311(new Class362(Static115.aClass182_34, "huffman"));
			Static56.aClass44_24.method1311(new Class408(Static253.aClass182_67));
			Static56.aClass44_25.method1311(new Class408(Static259.aClass182_68));
			Static56.aClass44_26.method1311(new Class408(Static652.aClass182_33));
			Static56.aClass44_27.method1311(new Class38(Static196.aClass182_65, "details"));
			for (local255 = 0; local255 < Static66.aClass44Array1.length; local255++) {
				if (Static66.aClass44Array1[local255].method1316() == null) {
					throw new RuntimeException();
				}
			}
			local281 = 0;
			@Pc(283) Class44[] local283 = Static66.aClass44Array1;
			for (@Pc(285) int local285 = 0; local285 < local283.length; local285++) {
				@Pc(293) Class44 local293 = local283[local285];
				local297 = local293.method1318();
				local303 = local293.method1316().method9564();
				local281 += local303 * local297 / 100;
			}
			Static83.anInt11170 = local281;
			Static332.anInt5339 = 2;
		}
		if (Static66.aClass44Array1 == null) {
			return 100;
		}
		local255 = 0;
		local281 = 0;
		@Pc(343) boolean local343 = true;
		@Pc(345) Class44[] local345 = Static66.aClass44Array1;
		for (@Pc(347) int local347 = 0; local347 < local345.length; local347++) {
			@Pc(353) Class44 local353 = local345[local347];
			local303 = local353.method1318();
			@Pc(363) int local363 = local353.method1316().method9564();
			local281 += local303 * local363 / 100;
			local255 += local303;
			if (local363 < 100) {
				local343 = false;
			}
		}
		if (local343) {
			if (!((Class159) Static56.aClass44_5.method1316()).method3491()) {
				Static459.aClient1.method1854();
			}
			if (!((Class159) Static56.aClass44_8.method1316()).method3491()) {
				Static127.aBoolean164 = Static459.aClient1.method1850();
			}
			Static66.aClass44Array1 = null;
		}
		local281 -= Static83.anInt11170;
		local255 -= Static83.anInt11170;
		local297 = local255 <= 0 ? 100 : local281 * 100 / local255;
		if (!local343 && local297 > 99) {
			local297 = 99;
		}
		return local297;
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(ILclient!ik;I)Lclient!ou;")
	public static Class3_Sub46 method6651(@OriginalArg(1) Class182 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) byte[] local8 = arg0.method3961(arg1);
		return local8 == null ? null : new Class3_Sub46(local8);
	}
}
