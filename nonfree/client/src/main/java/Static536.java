import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static536 {

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_143 = new Class349(40, 12);

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)I")
	public static int method7036() {
		if (Static244.anInt4046 == 0) {
			Static5.aClass4_2.method79(new Class52("jaclib"));
			if (Static5.aClass4_2.method83().method6247() != 100) {
				return 1;
			}
			if (!((Class52) Static5.aClass4_2.method83()).method1084()) {
				Static474.aClient1.method1142();
			}
			Static244.anInt4046 = 1;
		}
		@Pc(229) int local229;
		@Pc(252) int local252;
		@Pc(266) int local266;
		@Pc(272) int local272;
		if (Static244.anInt4046 == 1) {
			Static117.aClass4Array1 = Static5.method81();
			Static5.aClass4_1.method79(new Class255(Static466.aClass229_107));
			Static5.aClass4_3.method79(new Class52("jaggl"));
			Static5.aClass4_4.method79(new Class52("jagdx"));
			Static5.aClass4_5.method79(new Class52("jagmisc"));
			Static5.aClass4_6.method79(new Class52("sw3d"));
			Static5.aClass4_7.method79(new Class52("hw3d"));
			Static5.aClass4_8.method79(new Class255(Static49.aClass229_31));
			Static5.aClass4_9.method79(new Class255(Static572.aClass229_126));
			Static5.aClass4_10.method79(new Class255(Static248.aClass229_57));
			Static5.aClass4_11.method79(new Class255(Static72.aClass229_20));
			Static5.aClass4_12.method79(new Class255(Static378.aClass229_90));
			Static5.aClass4_13.method79(new Class255(Static187.aClass229_121));
			Static5.aClass4_14.method79(new Class255(Static255.aClass229_62));
			Static5.aClass4_15.method79(new Class255(Static309.aClass229_74));
			Static5.aClass4_16.method79(new Class255(Static427.aClass229_97));
			Static5.aClass4_17.method79(new Class255(Static402.aClass229_94));
			Static5.aClass4_18.method79(new Class255(Static579.aClass229_128));
			Static5.aClass4_19.method79(new Class255(Static418.aClass229_96));
			Static5.aClass4_20.method79(new Class255(Static367.aClass229_88));
			Static5.aClass4_21.method79(new Class255(Static340.aClass229_83));
			Static5.aClass4_22.method79(new Class223(Static16.aClass229_1, "huffman"));
			Static5.aClass4_23.method79(new Class255(Static331.aClass229_80));
			Static5.aClass4_24.method79(new Class255(Static399.aClass229_93));
			Static5.aClass4_25.method79(new Class255(Static191.aClass229_45));
			Static5.aClass4_26.method79(new Class310(Static237.aClass229_52, "details"));
			for (local229 = 0; local229 < Static117.aClass4Array1.length; local229++) {
				if (Static117.aClass4Array1[local229].method83() == null) {
					throw new RuntimeException();
				}
			}
			local252 = 0;
			@Pc(254) Class4[] local254 = Static117.aClass4Array1;
			for (@Pc(256) int local256 = 0; local256 < local254.length; local256++) {
				@Pc(262) Class4 local262 = local254[local256];
				local266 = local262.method77();
				local272 = local262.method83().method6247();
				local252 += local272 * local266 / 100;
			}
			Static387.anInt6385 = local252;
			Static244.anInt4046 = 2;
		}
		if (Static117.aClass4Array1 == null) {
			return 100;
		}
		local229 = 0;
		local252 = 0;
		@Pc(303) boolean local303 = true;
		@Pc(305) Class4[] local305 = Static117.aClass4Array1;
		for (@Pc(307) int local307 = 0; local307 < local305.length; local307++) {
			@Pc(313) Class4 local313 = local305[local307];
			local272 = local313.method77();
			@Pc(323) int local323 = local313.method83().method6247();
			local229 += local272;
			if (local323 < 100) {
				local303 = false;
			}
			local252 += local272 * local323 / 100;
		}
		if (local303) {
			if (!((Class52) Static5.aClass4_5.method83()).method1084()) {
				Static474.aClient1.method1153();
			}
			Static117.aClass4Array1 = null;
		}
		local252 -= Static387.anInt6385;
		local229 -= Static387.anInt6385;
		local266 = local229 <= 0 ? 100 : local252 * 100 / local229;
		if (!local303 && local266 > 99) {
			local266 = 99;
		}
		return local266;
	}
}
