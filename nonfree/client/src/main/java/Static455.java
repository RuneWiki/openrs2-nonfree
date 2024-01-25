import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static455 {

	@OriginalMember(owner = "client!pj", name = "h", descriptor = "Lclient!dba;")
	public static final Class74 aClass74_15 = new Class74(9, 7);

	@OriginalMember(owner = "client!pj", name = "l", descriptor = "I")
	public static int anInt7921 = 0;

	@OriginalMember(owner = "client!pj", name = "m", descriptor = "Z")
	public static boolean aBoolean579 = false;

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IB)I")
	public static int method6716(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILclient!jo;Lclient!td;)Lclient!dd;")
	public static Class5_Sub16 method6717(@OriginalArg(1) Class187 arg0, @OriginalArg(2) Class332 arg1) {
		@Pc(6) Class5_Sub16 local6 = Static612.method8232();
		local6.anInt1727 = arg0.anInt4412;
		local6.aClass187_27 = arg0;
		if (local6.anInt1727 == -1) {
			local6.aClass5_Sub15_Sub2_1 = new Class5_Sub15_Sub2(260);
		} else if (local6.anInt1727 == -2) {
			local6.aClass5_Sub15_Sub2_1 = new Class5_Sub15_Sub2(10000);
		} else if (local6.anInt1727 <= 18) {
			local6.aClass5_Sub15_Sub2_1 = new Class5_Sub15_Sub2(20);
		} else if (local6.anInt1727 <= 98) {
			local6.aClass5_Sub15_Sub2_1 = new Class5_Sub15_Sub2(100);
		} else {
			local6.aClass5_Sub15_Sub2_1 = new Class5_Sub15_Sub2(260);
		}
		local6.aClass5_Sub15_Sub2_1.method3699(arg1);
		local6.aClass5_Sub15_Sub2_1.method3704(local6.aClass187_27.method3900());
		local6.anInt1726 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method6719(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static529.anInt8750 >= 200 && !Static513.aBoolean630 || Static529.anInt8750 >= 200) {
			Static566.method7772(Static49.aClass42_11.method730(Static259.anInt4113));
			return;
		}
		@Pc(28) String local28 = Static555.method7630(arg0);
		if (local28 == null) {
			return;
		}
		@Pc(73) String local73;
		for (@Pc(33) int local33 = 0; local33 < Static529.anInt8750; local33++) {
			@Pc(42) String local42 = Static555.method7630(Static562.aStringArray36[local33]);
			if (local42 != null && local42.equals(local28)) {
				Static566.method7772(arg0 + Static49.aClass42_38.method730(Static259.anInt4113));
				return;
			}
			if (Static128.aStringArray6[local33] != null) {
				local73 = Static555.method7630(Static128.aStringArray6[local33]);
				if (local73 != null && local73.equals(local28)) {
					Static566.method7772(arg0 + Static49.aClass42_38.method730(Static259.anInt4113));
					return;
				}
			}
		}
		for (@Pc(104) int local104 = 0; local104 < anInt7921; local104++) {
			local73 = Static555.method7630(Static587.aStringArray38[local104]);
			if (local73 != null && local73.equals(local28)) {
				Static566.method7772(Static49.aClass42_43.method730(Static259.anInt4113) + arg0 + Static49.aClass42_44.method730(Static259.anInt4113));
				return;
			}
			if (Static594.aStringArray39[local104] != null) {
				@Pc(147) String local147 = Static555.method7630(Static594.aStringArray39[local104]);
				if (local147 != null && local147.equals(local28)) {
					Static566.method7772(Static49.aClass42_43.method730(Static259.anInt4113) + arg0 + Static49.aClass42_44.method730(Static259.anInt4113));
					return;
				}
			}
		}
		if (Static555.method7630(Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aString100).equals(local28)) {
			Static566.method7772(Static49.aClass42_41.method730(Static259.anInt4113));
		} else {
			@Pc(207) Class5_Sub16 local207 = method6717(Static268.aClass187_57, Static16.aClass332_8);
			local207.aClass5_Sub15_Sub2_1.method3651(Static467.method6904(arg0));
			local207.aClass5_Sub15_Sub2_1.method3680(arg0);
			Static479.method7038(local207);
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)[Lclient!ke;")
	public static Class196[] method6720() {
		return new Class196[] { Static596.aClass196_302, Static14.aClass196_12, Static645.aClass196_326, Static95.aClass196_65, Static528.aClass196_264, Static194.aClass196_320, Static301.aClass196_165, Static599.aClass196_304, Static637.aClass196_323, Static589.aClass196_297, Static236.aClass196_139, Static590.aClass196_299, Static657.aClass196_331, Static162.aClass196_247, Static111.aClass196_342, Static24.aClass196_20, Static244.aClass196_143, Static108.aClass196_75, Static640.aClass196_325, Static671.aClass196_340, Static347.aClass196_184, Static604.aClass196_144, Static376.aClass196_198, Static382.aClass196_203, Static72.aClass196_277, Static649.aClass196_328, Static272.aClass196_154, Static663.aClass196_335, Static83.aClass196_58, Static269.aClass196_152, Static166.aClass196_106, Static436.aClass196_236, Static377.aClass196_200, Static158.aClass196_100, Static661.aClass196_332, Static433.aClass196_232, Static534.aClass196_334, Static222.aClass196_133, Static541.aClass196_268, Static233.aClass196_137, Static301.aClass196_164, Static140.aClass196_91, Static670.aClass196_338, Static570.aClass196_288, Static4.aClass196_1, Static460.aClass196_250, Static624.aClass196_318, Static451.aClass196_246, Static310.aClass196_174, Static327.aClass196_180, Static188.aClass196_121, Static603.aClass196_306, Static418.aClass196_227, Static301.aClass196_163, Static66.aClass196_49, Static557.aClass196_278, Static53.aClass196_149, Static404.aClass196_217, Static62.aClass196_45, Static527.aClass196_262, Static415.aClass196_224, Static377.aClass196_199, Static398.aClass196_214, Static65.aClass196_48, Static296.aClass196_162, Static113.aClass196_79, Static158.aClass196_99, Static20.aClass196_16, Static444.aClass196_241, Static199.aClass196_123, Static361.aClass196_190, Static546.aClass196_272, Static176.aClass196_112, Static125.aClass196_86, Static436.aClass196_235, Static402.aClass196_216, Static667.aClass196_337, Static605.aClass196_308, Static467.aClass196_252, Static620.aClass196_316, Static4.aClass196_2, Static212.aClass196_129, Static469.aClass196_253, Static64.aClass196_47, Static435.aClass196_234, Static338.aClass196_291, Static84.aClass196_59, Static215.aClass196_131, Static634.aClass196_322, Static598.aClass196_303, Static606.aClass196_310, Static583.aClass196_293, Static560.aClass196_280, Static180.aClass196_116, Static321.aClass196_176, Static112.aClass196_77, Static136.aClass196_90, Static252.aClass196_146, Static24.aClass196_19, Static424.aClass196_230, Static71.aClass196_51, Static58.aClass196_44, Static560.aClass196_281, Static532.aClass196_266, Static247.aClass196_145, Static270.aClass196_153, Static437.aClass196_237, Static408.aClass196_220, Static333.aClass196_183, Static399.aClass196_215, Static369.aClass196_196, Static523.aClass196_339, Static600.aClass196_305, Static226.aClass196_134, Static498.aClass196_258, Static317.aClass196_175, Static181.aClass196_117, Static176.aClass196_113, Static252.aClass196_147, Static584.aClass196_294, Static563.aClass196_283, Static662.aClass196_333, Static663.aClass196_336, Static324.aClass196_178, Static100.aClass196_68, Static440.aClass196_239, Static633.aClass196_321, Static398.aClass196_213, Static76.aClass196_54, Static34.aClass196_27, Static193.aClass196_122, Static117.aClass196_80, Static175.aClass196_109 };
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(ILjava/lang/String;)V")
	public static void method6723(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(18) String local18 = Static555.method7630(arg0);
		if (local18 == null) {
			return;
		}
		for (@Pc(23) int local23 = 0; local23 < anInt7921; local23++) {
			@Pc(36) String local36 = Static587.aStringArray38[local23];
			if (local36.startsWith("*")) {
				local36 = local36.substring(1);
			}
			local36 = Static555.method7630(local36);
			if (local36 != null && local36.equals(local18)) {
				anInt7921--;
				for (@Pc(60) int local60 = local23; local60 < anInt7921; local60++) {
					Static587.aStringArray38[local60] = Static587.aStringArray38[local60 + 1];
					Static275.aStringArray17[local60] = Static275.aStringArray17[local60 + 1];
					Static594.aStringArray39[local60] = Static594.aStringArray39[local60 + 1];
					Static221.aStringArray11[local60] = Static221.aStringArray11[local60 + 1];
					Static468.aBooleanArray19[local60] = Static468.aBooleanArray19[local60 + 1];
				}
				Static223.anInt3567 = Static293.anInt4549;
				@Pc(118) Class5_Sub16 local118 = method6717(Static277.aClass187_56, Static16.aClass332_8);
				local118.aClass5_Sub15_Sub2_1.method3651(Static467.method6904(arg0));
				local118.aClass5_Sub15_Sub2_1.method3680(arg0);
				Static479.method7038(local118);
				return;
			}
		}
	}
}
