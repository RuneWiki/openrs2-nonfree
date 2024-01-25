import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!iq", name = "v", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_90 = new Class126(58, 0);

	@OriginalMember(owner = "client!iq", name = "x", descriptor = "Lclient!vl;")
	public static final Class376 aClass376_69 = new Class376(43, 2);

	@OriginalMember(owner = "client!iq", name = "y", descriptor = "Z")
	public static boolean aBoolean400 = true;

	@OriginalMember(owner = "client!iq", name = "z", descriptor = "Lclient!jda;")
	public static final Class188 aClass188_2 = new Class188();

	@OriginalMember(owner = "client!iq", name = "A", descriptor = "Z")
	public static boolean aBoolean401 = false;

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)I")
	public static int method4134() {
		if (Static328.anInt6073 == 0) {
			Static446.aClass273_2.method6457(new Class341("jaclib"));
			if (Static446.aClass273_2.method6452().method7865() != 100) {
				return 1;
			}
			if (!((Class341) Static446.aClass273_2.method6452()).method7870()) {
				Static487.aClient1.method1741();
			}
			Static328.anInt6073 = 1;
		}
		@Pc(240) int local240;
		@Pc(259) int local259;
		@Pc(273) int local273;
		@Pc(279) int local279;
		if (Static328.anInt6073 == 1) {
			Static658.aClass273Array1 = Static446.method6456();
			Static446.aClass273_1.method6457(new Class130(Static176.aClass143_45));
			Static446.aClass273_3.method6457(new Class341("jaggl"));
			Static446.aClass273_4.method6457(new Class341("jagdx"));
			Static446.aClass273_5.method6457(new Class341("jagmisc"));
			Static446.aClass273_6.method6457(new Class341("sw3d"));
			Static446.aClass273_7.method6457(new Class341("hw3d"));
			Static446.aClass273_8.method6457(new Class341("jagtheora"));
			Static446.aClass273_9.method6457(new Class130(Static10.aClass143_2));
			Static446.aClass273_10.method6457(new Class130(Static105.aClass143_25));
			Static446.aClass273_11.method6457(new Class130(Static346.aClass143_87));
			Static446.aClass273_12.method6457(new Class130(Static423.aClass143_103));
			Static446.aClass273_13.method6457(new Class130(Static126.aClass143_32));
			Static446.aClass273_14.method6457(new Class130(Static471.aClass143_144));
			Static446.aClass273_15.method6457(new Class130(Static160.aClass143_39));
			Static446.aClass273_16.method6457(new Class130(Static169.aClass143_42));
			Static446.aClass273_17.method6457(new Class130(Static272.aClass143_64));
			Static446.aClass273_18.method6457(new Class130(Static167.aClass143_40));
			Static446.aClass273_19.method6457(new Class130(Static168.aClass143_41));
			Static446.aClass273_20.method6457(new Class130(Static409.aClass143_96));
			Static446.aClass273_21.method6457(new Class130(Static535.aClass143_121));
			Static446.aClass273_22.method6457(new Class130(Static624.aClass143_133));
			Static446.aClass273_23.method6457(new Class110(Static264.aClass143_62, "huffman"));
			Static446.aClass273_24.method6457(new Class130(Static105.aClass143_24));
			Static446.aClass273_25.method6457(new Class130(Static560.aClass143_128));
			Static446.aClass273_26.method6457(new Class130(Static41.aClass143_11));
			Static446.aClass273_27.method6457(new Class71(Static390.aClass143_97, "details"));
			for (local240 = 0; local240 < Static658.aClass273Array1.length; local240++) {
				if (Static658.aClass273Array1[local240].method6452() == null) {
					throw new RuntimeException();
				}
			}
			local259 = 0;
			@Pc(261) Class273[] local261 = Static658.aClass273Array1;
			for (@Pc(263) int local263 = 0; local263 < local261.length; local263++) {
				@Pc(269) Class273 local269 = local261[local263];
				local273 = local269.method6454();
				local279 = local269.method6452().method7865();
				local259 += local273 * local279 / 100;
			}
			Static562.anInt9049 = local259;
			Static328.anInt6073 = 2;
		}
		if (Static658.aClass273Array1 == null) {
			return 100;
		}
		local240 = 0;
		local259 = 0;
		@Pc(311) boolean local311 = true;
		@Pc(313) Class273[] local313 = Static658.aClass273Array1;
		for (@Pc(315) int local315 = 0; local315 < local313.length; local315++) {
			@Pc(321) Class273 local321 = local313[local315];
			local279 = local321.method6454();
			@Pc(331) int local331 = local321.method6452().method7865();
			local259 += local279 * local331 / 100;
			if (local331 < 100) {
				local311 = false;
			}
			local240 += local279;
		}
		if (local311) {
			if (!((Class341) Static446.aClass273_5.method6452()).method7870()) {
				Static487.aClient1.method1743();
			}
			if (!((Class341) Static446.aClass273_8.method6452()).method7870()) {
				Static293.aBoolean420 = Static487.aClient1.method1740();
			}
			Static658.aClass273Array1 = null;
		}
		local240 -= Static562.anInt9049;
		local259 -= Static562.anInt9049;
		local273 = local240 > 0 ? local259 * 100 / local240 : 100;
		if (!local311 && local273 > 99) {
			local273 = 99;
		}
		return local273;
	}
}
