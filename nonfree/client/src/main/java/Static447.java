import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static447 {

	@OriginalMember(owner = "client!qba", name = "D", descriptor = "I")
	public static int anInt8316;

	@OriginalMember(owner = "client!qba", name = "F", descriptor = "I")
	public static int anInt8318;

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(I)Lclient!dh;")
	public static Class2_Sub13 method7044() {
		@Pc(7) Class320 local7 = null;
		@Pc(13) Class2_Sub13 local13 = new Class2_Sub13(Static423.aClass316_4, 0);
		try {
			@Pc(19) Class240 local19 = Static268.aClass370_3.method9068("");
			while (local19.anInt7566 == 0) {
				Static190.method3914(1L);
			}
			if (local19.anInt7566 == 1) {
				local7 = (Class320) local19.anObject13;
				@Pc(43) byte[] local43 = new byte[(int) local7.method7910()];
				@Pc(58) int local58;
				for (@Pc(45) int local45 = 0; local45 < local43.length; local45 += local58) {
					local58 = local7.method7904(local43, local45, local43.length - local45);
					if (local58 == -1) {
						throw new IOException("EOF");
					}
				}
				local13 = new Class2_Sub13(new Class2_Sub11(local43), Static423.aClass316_4, 0);
			}
		} catch (@Pc(87) Exception local87) {
		}
		try {
			if (local7 != null) {
				local7.method7905();
			}
		} catch (@Pc(99) Exception local99) {
		}
		return local13;
	}

	@OriginalMember(owner = "client!qba", name = "b", descriptor = "(I)[Lclient!mu;")
	public static Class215[] method7045() {
		return new Class215[] { Static424.aClass215_169, Static619.aClass215_247, Static442.aClass215_189, Static134.aClass215_56, Static208.aClass215_93, Static97.aClass215_33, Static560.aClass215_227, Static527.aClass215_249, Static357.aClass215_144, Static328.aClass215_129, Static133.aClass215_55, Static170.aClass215_233, Static482.aClass215_198, Static141.aClass215_58, Static598.aClass215_241, Static212.aClass215_97, Static407.aClass215_158, Static436.aClass215_180, Static133.aClass215_54, Static213.aClass215_99, Static381.aClass215_152, Static537.aClass215_214, Static147.aClass215_63, Static442.aClass215_188, Static356.aClass215_136, Static50.aClass215_21, Static592.aClass215_239, Static69.aClass215_25, Static420.aClass215_166, Static616.aClass215_246, Static327.aClass215_128, Static129.aClass215_53, Static145.aClass215_62, Static511.aClass215_206, Static282.aClass215_113, Static271.aClass215_252, Static55.aClass215_192, Static302.aClass215_125, Static379.aClass215_150, Static274.aClass215_106, Static18.aClass215_10, Static90.aClass215_32, Static197.aClass215_90, Static556.aClass215_226, Static624.aClass215_255, Static583.aClass215_235, Static613.aClass215_245, Static454.aClass215_193, Static561.aClass215_228, Static516.aClass215_208, Static362.aClass215_145, Static205.aClass215_92, Static376.aClass215_147, Static278.aClass215_108, Static301.aClass215_124, Static622.aClass215_254, Static568.aClass215_230, Static435.aClass215_176, Static410.aClass215_159, Static225.aClass215_101, Static433.aClass215_174, Static27.aClass215_14, Static634.aClass215_257, Static573.aClass215_232, Static416.aClass215_164, Static215.aClass215_100, Static247.aClass215_146, Static121.aClass215_213, Static402.aClass215_157, Static416.aClass215_163, Static212.aClass215_96, Static512.aClass215_207, Static461.aClass215_168, Static472.aClass215_196, Static46.aClass215_15, Static128.aClass215_52, Static298.aClass215_122, Static434.aClass215_175, Static278.aClass215_109, Static595.aClass215_240, Static439.aClass215_186, Static390.aClass215_153, Static464.aClass215_195, Static98.aClass215_34, Static381.aClass215_151, Static526.aClass215_210, Static562.aClass215_229, Static121.aClass215_212, Static156.aClass215_71, Static620.aClass215_251, Static8.aClass215_3, Static417.aClass215_165, Static444.aClass215_190, Static580.aClass215_234, Static485.aClass215_199, Static213.aClass215_98, Static47.aClass215_17, Static633.aClass215_256, Static462.aClass215_194, Static50.aClass215_22, Static621.aClass215_253, Static55.aClass215_191, Static472.aClass215_197, Static299.aClass215_123, Static520.aClass215_209, Static47.aClass215_16, Static501.aClass215_201, Static253.aClass215_222, Static527.aClass215_248, Static461.aClass215_167, Static185.aClass215_89, Static425.aClass215_170, Static573.aClass215_231, Static337.aClass215_131, Static637.aClass215_258, Static438.aClass215_184, Static81.aClass215_28, Static158.aClass215_72, Static490.aClass215_200, Static200.aClass215_91, Static439.aClass215_185 };
	}

	@OriginalMember(owner = "client!qba", name = "f", descriptor = "(I)V")
	public static void method7046() {
		Static19.aStringArray1 = new String[500];
		Static283.anInt5969 = Static161.aClass239_14.anInt7564 + Static161.aClass239_14.anInt7559 + 2;
		Static29.anInt624 = Static58.aClass239_18.anInt7559 + Static58.aClass239_18.anInt7564 + 2;
		for (@Pc(27) int local27 = 0; local27 < Static19.aStringArray1.length; local27++) {
			Static19.aStringArray1[local27] = "";
		}
		Static300.method2224(Static588.aClass351_3.method8691(Static476.anInt8915));
	}
}
