import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!jv", name = "v", descriptor = "Lclient!qm;")
	public static Class4_Sub39 aClass4_Sub39_1;

	@OriginalMember(owner = "client!jv", name = "S", descriptor = "[I")
	public static final int[] anIntArray258 = new int[25];

	@OriginalMember(owner = "client!jv", name = "Y", descriptor = "Z")
	public static volatile boolean aBoolean359 = true;

	@OriginalMember(owner = "client!jv", name = "vb", descriptor = "Lclient!uu;")
	public static Class247 aClass247_7 = null;

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method3113(@OriginalArg(0) String arg0) {
		return Static437.method4041(10, arg0);
	}

	@OriginalMember(owner = "client!jv", name = "c", descriptor = "(I)V")
	public static void method3117() {
		Static154.aClass124_2.method3152();
		Static234.aClass192_2.method4339();
		Static420.aClass109_2.method2759();
		Static267.aClass262_2.method5556();
		Static329.aClass240_1.method5232();
		Static444.aClass206_3.method4706();
		Static182.aClass55_1.method1394();
		Static352.aClass194_2.method4418();
		Static26.aClass26_1.method645();
		Static183.aClass223_1.method5005();
		Static222.aClass249_1.method5322();
		Static348.aClass182_4.method4128();
		Static76.aClass265_2.method5594();
		Static153.aClass180_1.method4120();
		Static426.aClass208_1.method4723();
		Static296.aClass217_1.method4933();
		Static238.aClass226_1.method5024();
		Static405.aClass204_1.method4676();
		Static118.aClass172_2.method3981();
		Static280.aClass72_1.method1985();
		Static304.method4119();
		Static222.method3351();
		Static1.method2();
		Static429.method5478();
		Static261.aClass68_27.method1788(5);
		Static200.aClass68_22.method1788(5);
		Static386.aClass68_23.method1788(5);
		Static105.aClass68_9.method1788(5);
		Static271.aClass68_29.method1788(5);
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "()V")
	public static void method3118() {
		for (@Pc(1) int local1 = 0; local1 < Static43.anInt7322; local1++) {
			if (!Static124.aBooleanArray12[local1]) {
				@Pc(10) Class191 local10 = Static106.aClass191Array1[local1];
				@Pc(13) Class4_Sub21 local13 = local10.aClass4_Sub21_2;
				@Pc(16) int local16 = local10.anInt5570;
				@Pc(22) int local22 = local13.method3165() - Static333.anInt5747;
				@Pc(30) int local30 = (local22 * 2 >> Static231.anInt4434) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method3160() - local22 >> Static231.anInt4434;
				@Pc(53) int local53 = local13.method3164() - local22 >> Static231.anInt4434;
				@Pc(61) int local61 = local13.method3164() + local22 >> Static231.anInt4434;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static171.anInt3361) {
					local61 = Static171.anInt3361 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray189[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static422.anInt6945) {
						local108 = Static422.anInt6945 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(141) Class16_Sub1 local141 = Static36.method648(local16, local125, local78, pe.class);
						if (local141 != null && local141.aByte83 != 0) {
							@Pc(159) boolean local159;
							@Pc(168) boolean local168;
							@Pc(182) short local182;
							@Pc(188) int local188;
							@Pc(194) int local194;
							if (local141.aByte83 == 1) {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 + 1 <= local61) {
									local182 = local10.aShortArray189[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 - 1 >= local53) {
									local182 = local10.aShortArray189[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local168 = local125 > local188 && local125 < local194;
								}
								if (local159 && !local168) {
									local128 = 4;
								} else if (local168 && !local159) {
									local128 = 2;
								}
							} else {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 - 1 >= local53) {
									local182 = local10.aShortArray189[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 + 1 <= local61) {
									local182 = local10.aShortArray189[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local168 = local125 > local188 && local125 < local194;
								}
								if (local159 && !local168) {
									local128 = 3;
								} else if (local168 && !local159) {
									local128 = 5;
								}
							}
						}
						local37[local94++] = local128;
					}
					local32++;
				}
				Static124.aBooleanArray12[local1] = true;
				Static417.aClass65Array4[local16].method4024(local13, local37);
			}
		}
	}
}
