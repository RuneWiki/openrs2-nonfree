import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static436 {

	@OriginalMember(owner = "client!on", name = "G", descriptor = "I")
	public static int anInt7944;

	@OriginalMember(owner = "client!on", name = "J", descriptor = "Z")
	public static boolean aBoolean589 = false;

	@OriginalMember(owner = "client!on", name = "c", descriptor = "(B)I")
	public static int method7109() {
		if (Static115.anInt2098 == 0) {
			Static333.aClass211_2.method5484(new Class112("jaclib"));
			if (Static333.aClass211_2.method5482().method9334() != 100) {
				return 1;
			}
			if (!((Class112) Static333.aClass211_2.method5482()).method3363()) {
				Static493.aClient1.method1460();
			}
			Static115.anInt2098 = 1;
		}
		@Pc(244) int local244;
		@Pc(267) int local267;
		@Pc(281) int local281;
		@Pc(289) int local289;
		if (Static115.anInt2098 == 1) {
			Static423.aClass211Array1 = Static333.method5483();
			Static333.aClass211_1.method5484(new Class33(Static389.aClass124_82));
			Static333.aClass211_3.method5484(new Class112("jaggl"));
			Static333.aClass211_4.method5484(new Class112("jagdx"));
			Static333.aClass211_5.method5484(new Class112("jagmisc"));
			Static333.aClass211_6.method5484(new Class112("sw3d"));
			Static333.aClass211_7.method5484(new Class112("hw3d"));
			Static333.aClass211_8.method5484(new Class112("jagtheora"));
			Static333.aClass211_9.method5484(new Class33(Static560.aClass124_118));
			Static333.aClass211_10.method5484(new Class33(Static11.aClass124_5));
			Static333.aClass211_11.method5484(new Class33(Static361.aClass124_78));
			Static333.aClass211_12.method5484(new Class33(Static287.aClass124_63));
			Static333.aClass211_13.method5484(new Class33(Static324.aClass124_69));
			Static333.aClass211_14.method5484(new Class33(Static345.aClass124_75));
			Static333.aClass211_15.method5484(new Class33(Static383.aClass124_79));
			Static333.aClass211_16.method5484(new Class33(Static114.aClass124_30));
			Static333.aClass211_17.method5484(new Class33(Static233.aClass124_52));
			Static333.aClass211_18.method5484(new Class33(Static12.aClass124_6));
			Static333.aClass211_19.method5484(new Class33(Static47.aClass124_12));
			Static333.aClass211_20.method5484(new Class33(Static83.aClass124_21));
			Static333.aClass211_21.method5484(new Class33(Static521.aClass124_77));
			Static333.aClass211_22.method5484(new Class33(Static68.aClass124_17));
			Static333.aClass211_23.method5484(new Class88(Static270.aClass124_58, "huffman"));
			Static333.aClass211_24.method5484(new Class33(Static362.aClass124_115));
			Static333.aClass211_25.method5484(new Class33(Static670.aClass124_86));
			Static333.aClass211_26.method5484(new Class33(Static227.aClass124_49));
			Static333.aClass211_27.method5484(new Class372(Static480.aClass124_102, "details"));
			for (local244 = 0; local244 < Static423.aClass211Array1.length; local244++) {
				if (Static423.aClass211Array1[local244].method5482() == null) {
					throw new RuntimeException();
				}
			}
			local267 = 0;
			@Pc(269) Class211[] local269 = Static423.aClass211Array1;
			for (@Pc(271) int local271 = 0; local271 < local269.length; local271++) {
				@Pc(277) Class211 local277 = local269[local271];
				local281 = local277.method5487();
				local289 = local277.method5482().method9334();
				local267 += local289 * local281 / 100;
			}
			Static115.anInt2098 = 2;
			Static3.anInt10077 = local267;
		}
		if (Static423.aClass211Array1 == null) {
			return 100;
		}
		local244 = 0;
		local267 = 0;
		@Pc(325) boolean local325 = true;
		@Pc(327) Class211[] local327 = Static423.aClass211Array1;
		for (@Pc(329) int local329 = 0; local329 < local327.length; local329++) {
			@Pc(335) Class211 local335 = local327[local329];
			local289 = local335.method5487();
			@Pc(345) int local345 = local335.method5482().method9334();
			if (local345 < 100) {
				local325 = false;
			}
			local244 += local289;
			local267 += local345 * local289 / 100;
		}
		if (local325) {
			if (!((Class112) Static333.aClass211_5.method5482()).method3363()) {
				Static493.aClient1.method1453();
			}
			if (!((Class112) Static333.aClass211_8.method5482()).method3363()) {
				Static592.aBoolean781 = Static493.aClient1.method1454();
			}
			Static423.aClass211Array1 = null;
		}
		local244 -= Static3.anInt10077;
		local267 -= Static3.anInt10077;
		local281 = local244 > 0 ? local267 * 100 / local244 : 100;
		if (!local325 && local281 > 99) {
			local281 = 99;
		}
		return local281;
	}
}
