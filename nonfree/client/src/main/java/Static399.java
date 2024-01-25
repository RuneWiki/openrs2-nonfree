import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static399 {

	@OriginalMember(owner = "client!nn", name = "C", descriptor = "I")
	public static int anInt6714;

	@OriginalMember(owner = "client!nn", name = "L", descriptor = "Lclient!kia;")
	public static Class194 aClass194_1;

	@OriginalMember(owner = "client!nn", name = "M", descriptor = "F")
	public static float aFloat80;

	@OriginalMember(owner = "client!nn", name = "D", descriptor = "Lclient!qk;")
	public static final Class289 aClass289_100 = new Class289(38, 7);

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(I)Ljava/lang/String;")
	public static String method5763() {
		@Pc(7) String local7 = "www";
		if (Static74.aClass104_2 == Static227.aClass104_4) {
			local7 = "www-wtrc";
		} else if (Static74.aClass104_2 == Static44.aClass104_1) {
			local7 = "www-wtqa";
		} else if (Static444.aClass104_8 == Static74.aClass104_2) {
			local7 = "www-wtwip";
		}
		@Pc(32) String local32 = "";
		if (Static245.aString52 != null) {
			local32 = "/p=" + Static245.aString52;
		}
		return "http://" + local7 + "." + Static457.aClass176_6.aString57 + ".com/l=" + Static616.anInt10077 + "/a=" + Static506.anInt8485 + local32 + "/";
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lclient!ws;)V")
	public static void method5765(@OriginalArg(0) Class394 arg0) {
		if (Static390.anInt6562 >= 65535) {
			return;
		}
		@Pc(6) Class6_Sub17 local6 = arg0.aClass6_Sub17_3;
		Static193.aClass394Array1[Static390.anInt6562] = arg0;
		Static223.aBooleanArray11[Static390.anInt6562] = false;
		Static390.anInt6562++;
		@Pc(21) int local21 = arg0.anInt10794;
		if (arg0.aBoolean743) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt10794;
		if (arg0.aBoolean742) {
			local29 = Static633.anInt10310 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method8521() + Static625.anInt10177 - local6.method8520() >> Static185.anInt3178;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method8521() + local6.method8520() - Static625.anInt10177 >> Static185.anInt3178;
			if (local73 >= Static245.anInt4308) {
				local73 = Static245.anInt4308 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray160[local41++];
				@Pc(105) int local105 = (local6.method8518() + Static625.anInt10177 - local6.method8520() >> Static185.anInt3178) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static209.anInt3602) {
					local113 = Static209.anInt3602 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static371.aLongArrayArrayArray1[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static371.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static390.anInt6562;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static371.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static390.anInt6562 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static371.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static390.anInt6562 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static371.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static390.anInt6562 << 48;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nn", name = "e", descriptor = "(B)I")
	public static int method5766() {
		@Pc(33) byte local33;
		if (Static549.anInt9246 >= 96) {
			@Pc(21) int local21 = Static256.method3695();
			if (local21 <= 100) {
				local33 = 4;
				Static216.method3141();
			} else if (local21 <= 500) {
				local33 = 3;
				Static478.method6996();
			} else if (local21 <= 1000) {
				Static551.method7237();
				local33 = 2;
			} else {
				Static489.method7094();
				local33 = 1;
			}
		} else {
			Static489.method7094();
			local33 = 1;
		}
		if (Static96.aClass6_Sub22_7.aClass29_Sub16_2.method5742() != 0) {
			Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub16_1, 0);
			Static646.method8805(0, false);
		}
		Static633.method8698();
		return local33;
	}

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "(I)[Lclient!jn;")
	public static Class179[] method5767() {
		return new Class179[] { Static362.aClass179_234, client.lb, Static514.aClass179_303, Static662.aClass179_369, Static67.aClass179_66, Static490.aClass179_290, Static233.aClass179_159, Static588.aClass179_343, Static27.aClass179_274, Static562.aClass179_323, Static379.aClass179_241, Static33.aClass179_38, Static23.aClass179_20, Static42.aClass179_47, Static277.aClass179_181, Static39.aClass179_43, Static582.aClass179_337, Static248.aClass179_164, Static231.aClass179_153, Static652.aClass179_247, Static389.aClass179_250, Static395.aClass179_253, Static29.aClass179_255, Static291.aClass179_191, Static225.aClass179_146, Static382.aClass179_242, Static289.aClass179_189, Static209.aClass179_138, Static327.aClass179_218, Static42.aClass179_48, Static342.aClass179_225, Static627.aClass179_357, Static188.aClass179_128, Static85.aClass179_75, Static628.aClass179_358, Static110.aClass179_86, Static381.aClass179_273, Static348.aClass179_227, Static374.aClass179_240, Static32.aClass179_36, Static484.aClass179_289, Static468.aClass179_280, Static173.aClass179_119, Static60.aClass179_62, Static176.aClass179_121, Static46.aClass179_53, Static283.aClass179_183, Static43.aClass179_50, Static196.aClass179_134, Static508.aClass179_352, Static622.aClass179_355, Static22.aClass179_19, Static566.aClass179_325, Static56.aClass179_59, Static581.aClass179_335, Static465.aClass179_277, Static545.aClass179_312, Static476.aClass179_283, Static520.aClass179_324, Static28.aClass179_24, Static582.aClass179_338, Static493.aClass179_291, Static496.aClass179_342, Static321.aClass179_212, Static344.aClass179_226, Static467.aClass179_279, Static238.aClass179_162, Static319.aClass179_210, Static571.aClass179_329, Static650.aClass179_366, Static82.aClass179_74, Static109.aClass179_84, Static294.aClass179_359, Static133.aClass179_100, Static602.aClass179_346, Static351.aClass179_230, Static452.aClass179_269, Static555.aClass179_317, Static480.aClass179_287, Static383.aClass179_244, Static603.aClass179_348, Static269.aClass179_178, Static9.aClass179_14, Static206.aClass179_136, Static193.aClass179_130, Static264.aClass179_170, Static309.aClass179_99, Static542.aClass179_310, Static608.aClass179_349, Static403.aClass179_260, Static102.aClass179_79, Static16.aClass179_18, Static109.aClass179_85, Static512.aClass179_302, Static646.aClass179_363, Static179.aClass179_124, Static534.aClass179_307, Static557.aClass179_320, Static242.aClass179_163, Static59.aClass179_61, Static581.aClass179_334, Static104.aClass179_82, Static364.aClass179_235, Static543.aClass179_376, Static150.aClass179_105, Static669.aClass179_374, Static541.aClass179_238, Static430.aClass179_353, Static220.aClass179_143, Static477.aClass179_284, Static315.aClass179_207, Static324.aClass179_213, Static325.aClass179_214, Static286.aClass179_187, Static229.aClass179_149, Static326.aClass179_216, Static539.aClass179_308, Static300.aClass179_196, Static53.aClass179_56, Static40.aClass179_299, Static332.aClass179_272, Static320.aClass179_211, Static285.aClass179_186, Static174.aClass179_120, Static631.aClass179_360, Static407.aClass179_262, Static40.aClass179_300, Static266.aClass179_176, Static219.aClass179_141, Static277.aClass179_182, Static12.aClass179_16, Static312.aClass179_294, Static603.aClass179_347 };
	}
}
