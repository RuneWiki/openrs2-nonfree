import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static593 {

	@OriginalMember(owner = "client!uaa", name = "g", descriptor = "Lclient!gda;")
	public static Class126 aClass126_269;

	@OriginalMember(owner = "client!uaa", name = "u", descriptor = "I")
	public static int anInt9563;

	@OriginalMember(owner = "client!uaa", name = "h", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_195 = new Class156(64, 6);

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(B)I")
	public static int method8161() {
		if (Static640.anInt10409 == 0) {
			Static547.aClass331_2.method7478(new Class110("jaclib"));
			if (Static547.aClass331_2.method7479().method4358() != 100) {
				return 1;
			}
			if (!((Class110) Static547.aClass331_2.method7479()).method2748()) {
				Static189.aClient1.method1197();
			}
			Static640.anInt10409 = 1;
		}
		@Pc(256) int local256;
		@Pc(282) int local282;
		@Pc(298) int local298;
		@Pc(304) int local304;
		if (Static640.anInt10409 == 1) {
			Static418.aClass331Array1 = Static547.method7481();
			Static547.aClass331_1.method7478(new Class186(Static583.aClass126_265));
			Static547.aClass331_3.method7478(new Class110("jaggl"));
			Static547.aClass331_4.method7478(new Class110("jagdx"));
			Static547.aClass331_5.method7478(new Class110("jagmisc"));
			Static547.aClass331_6.method7478(new Class110("sw3d"));
			Static547.aClass331_7.method7478(new Class110("hw3d"));
			Static547.aClass331_8.method7478(new Class110("jagtheora"));
			Static547.aClass331_9.method7478(new Class186(Static63.aClass126_44));
			Static547.aClass331_10.method7478(new Class186(Static305.aClass126_149));
			Static547.aClass331_11.method7478(new Class186(Static455.aClass126_208));
			Static547.aClass331_12.method7478(new Class186(Static92.aClass126_274));
			Static547.aClass331_13.method7478(new Class186(Static647.aClass126_291));
			Static547.aClass331_14.method7478(new Class186(Static623.aClass126_283));
			Static547.aClass331_15.method7478(new Class186(Static554.aClass126_253));
			Static547.aClass331_16.method7478(new Class186(Static279.aClass126_136));
			Static547.aClass331_17.method7478(new Class186(Static52.aClass126_40));
			Static547.aClass331_18.method7478(new Class186(Static176.aClass126_96));
			Static547.aClass331_19.method7478(new Class186(Static116.aClass126_248));
			Static547.aClass331_20.method7478(new Class186(Static481.aClass126_223));
			Static547.aClass331_21.method7478(new Class186(Static35.aClass126_20));
			Static547.aClass331_22.method7478(new Class186(Static618.aClass126_284));
			Static547.aClass331_23.method7478(new Class165(Static673.aClass126_298, "huffman"));
			Static547.aClass331_24.method7478(new Class186(Static264.aClass126_126));
			Static547.aClass331_25.method7478(new Class186(Static230.aClass126_115));
			Static547.aClass331_26.method7478(new Class186(Static600.aClass126_275));
			Static547.aClass331_27.method7478(new Class11(Static460.aClass126_211, "details"));
			for (local256 = 0; local256 < Static418.aClass331Array1.length; local256++) {
				if (Static418.aClass331Array1[local256].method7479() == null) {
					throw new RuntimeException();
				}
			}
			local282 = 0;
			@Pc(284) Class331[] local284 = Static418.aClass331Array1;
			for (@Pc(286) int local286 = 0; local286 < local284.length; local286++) {
				@Pc(294) Class331 local294 = local284[local286];
				local298 = local294.method7480();
				local304 = local294.method7479().method4358();
				local282 += local304 * local298 / 100;
			}
			Static288.anInt5097 = local282;
			Static640.anInt10409 = 2;
		}
		if (Static418.aClass331Array1 == null) {
			return 100;
		}
		local256 = 0;
		local282 = 0;
		@Pc(344) boolean local344 = true;
		@Pc(346) Class331[] local346 = Static418.aClass331Array1;
		for (@Pc(348) int local348 = 0; local348 < local346.length; local348++) {
			@Pc(354) Class331 local354 = local346[local348];
			local304 = local354.method7480();
			@Pc(364) int local364 = local354.method7479().method4358();
			local256 += local304;
			if (local364 < 100) {
				local344 = false;
			}
			local282 += local364 * local304 / 100;
		}
		if (local344) {
			if (!((Class110) Static547.aClass331_5.method7479()).method2748()) {
				Static189.aClient1.method1198();
			}
			if (!((Class110) Static547.aClass331_8.method7479()).method2748()) {
				Static379.aBoolean421 = Static189.aClient1.method1202();
			}
			Static418.aClass331Array1 = null;
		}
		local256 -= Static288.anInt5097;
		local282 -= Static288.anInt5097;
		local298 = local256 > 0 ? local282 * 100 / local256 : 100;
		if (!local344 && local298 > 99) {
			local298 = 99;
		}
		return local298;
	}
}
