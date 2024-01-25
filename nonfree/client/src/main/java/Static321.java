import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "Lclient!tf;")
	public static Class322 aClass322_98;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
	public static int anInt5440 = 0;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IBI)Z")
	public static boolean method4673(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (Static432.method6082(arg1, arg0) | Static9.method3872(arg1, arg0) | Static547.method7285(arg1, arg0)) & Static169.method3029(arg1, arg0);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)I")
	public static int method4674() {
		if (Static533.anInt8561 == 0) {
			Static418.aClass263_2.method5951(new Class295("jaclib"));
			if (Static418.aClass263_2.method5943().method6883() != 100) {
				return 1;
			}
			if (!((Class295) Static418.aClass263_2.method5943()).method6440()) {
				Static308.aClient1.method1512();
			}
			Static533.anInt8561 = 1;
		}
		@Pc(221) int local221;
		@Pc(244) int local244;
		@Pc(258) int local258;
		@Pc(264) int local264;
		if (Static533.anInt8561 == 1) {
			Static342.aClass263Array1 = Static418.method5950();
			Static418.aClass263_1.method5951(new Class25(Static39.aClass322_14));
			Static418.aClass263_3.method5951(new Class295("jaggl"));
			Static418.aClass263_4.method5951(new Class295("jagdx"));
			Static418.aClass263_5.method5951(new Class295("jagmisc"));
			Static418.aClass263_6.method5951(new Class295("sw3d"));
			Static418.aClass263_7.method5951(new Class295("hw3d"));
			Static418.aClass263_8.method5951(new Class25(Static128.aClass322_51));
			Static418.aClass263_9.method5951(new Class25(Static67.aClass322_26));
			Static418.aClass263_10.method5951(new Class25(Static235.aClass322_82));
			Static418.aClass263_11.method5951(new Class25(Static85.aClass322_29));
			Static418.aClass263_12.method5951(new Class25(Static429.aClass322_124));
			Static418.aClass263_13.method5951(new Class25(Static478.aClass322_132));
			Static418.aClass263_14.method5951(new Class25(Static259.aClass322_90));
			Static418.aClass263_15.method5951(new Class25(Static51.aClass322_20));
			Static418.aClass263_16.method5951(new Class25(Static345.aClass322_108));
			Static418.aClass263_17.method5951(new Class25(Static122.aClass322_46));
			Static418.aClass263_18.method5951(new Class25(Static29.aClass322_144));
			Static418.aClass263_19.method5951(new Class25(Static566.aClass322_153));
			Static418.aClass263_20.method5951(new Class25(Static250.aClass322_88));
			Static418.aClass263_21.method5951(new Class25(Static493.aClass322_156));
			Static418.aClass263_22.method5951(new Class57(Static131.aClass322_52, "huffman"));
			Static418.aClass263_23.method5951(new Class25(Static181.aClass322_69));
			Static418.aClass263_24.method5951(new Class25(Static241.aClass322_84));
			Static418.aClass263_25.method5951(new Class25(Static154.aClass322_61));
			Static418.aClass263_26.method5951(new Class328(Static69.aClass322_27, "details"));
			for (local221 = 0; local221 < Static342.aClass263Array1.length; local221++) {
				if (Static342.aClass263Array1[local221].method5943() == null) {
					throw new RuntimeException();
				}
			}
			local244 = 0;
			@Pc(246) Class263[] local246 = Static342.aClass263Array1;
			for (@Pc(248) int local248 = 0; local248 < local246.length; local248++) {
				@Pc(254) Class263 local254 = local246[local248];
				local258 = local254.method5949();
				local264 = local254.method5943().method6883();
				local244 += local264 * local258 / 100;
			}
			Static533.anInt8561 = 2;
			Static213.anInt7857 = local244;
		}
		if (Static342.aClass263Array1 == null) {
			return 100;
		}
		local221 = 0;
		local244 = 0;
		@Pc(291) boolean local291 = true;
		@Pc(293) Class263[] local293 = Static342.aClass263Array1;
		for (@Pc(295) int local295 = 0; local295 < local293.length; local295++) {
			@Pc(301) Class263 local301 = local293[local295];
			local264 = local301.method5949();
			@Pc(313) int local313 = local301.method5943().method6883();
			local221 += local264;
			if (local313 < 100) {
				local291 = false;
			}
			local244 += local313 * local264 / 100;
		}
		if (local291) {
			if (!((Class295) Static418.aClass263_5.method5943()).method6440()) {
				Static308.aClient1.method1508();
			}
			Static342.aClass263Array1 = null;
		}
		local244 -= Static213.anInt7857;
		local221 -= Static213.anInt7857;
		local258 = local221 <= 0 ? 100 : local244 * 100 / local221;
		if (!local291 && local258 > 99) {
			local258 = 99;
		}
		return local258;
	}
}
