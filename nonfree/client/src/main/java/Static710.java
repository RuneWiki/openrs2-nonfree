import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static710 {

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "Lclient!kia;")
	public static final Class206 aClass206_18 = new Class206(11, 2);

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)[Lclient!jia;")
	public static Class186[] method9253() {
		return new Class186[] { Static64.aClass186_18, Static197.aClass186_62, Static252.aClass186_84, Static4.aClass186_2, Static382.aClass186_121, Static411.aClass186_120, Static726.aClass186_201, Static607.aClass186_176, Static306.aClass186_98, Static548.aClass186_155, Static471.aClass186_187, Static127.aClass186_39, Static412.aClass186_129, Static16.aClass186_7, Static564.aClass186_160, Static397.aClass186_125, Static442.aClass186_178, Static386.aClass186_86, Static149.aClass186_47, Static4.aClass186_3, Static77.aClass186_22, Static688.aClass186_9, Static87.aClass186_24, Static672.aClass186_188, Static487.aClass186_147, Static143.aClass186_43, Static464.aClass186_142, Static552.aClass186_156, Static373.aClass186_117, Static618.aClass186_111, Static77.aClass186_21, Static105.aClass186_29, Static151.aClass186_48, Static576.aClass186_166, Static659.aClass186_186, Static629.aClass186_180, Static398.aClass186_126, Static273.aClass186_95, Static54.aClass186_170, Static181.aClass186_57, Static564.aClass186_159, Static6.aClass186_4, Static373.aClass186_118, Static244.aClass186_80, Static476.aClass186_143, Static204.aClass186_65, Static408.aClass186_127, Static333.aClass186_103, Static571.aClass186_164, Static283.aClass186_96, Static273.aClass186_94, Static662.aClass186_171, Static264.aClass186_77, Static681.aClass186_190, Static651.aClass186_184, Static172.aClass186_54, Static220.aClass186_69, Static650.aClass186_183, Static200.aClass186_63, Static486.aClass186_146, Static267.aClass186_89, Static395.aClass186_124, Static183.aClass186_58, Static701.aClass186_193, Static25.aClass186_10, Static604.aClass186_173, Static590.aClass186_167, Static345.aClass186_108, Static260.aClass186_88, Static109.aClass186_32, Static341.aClass186_106, Static343.aClass186_107, Static269.aClass186_93, Static141.aClass186_42, Static595.aClass186_169, Static675.aClass186_189, Static605.aClass186_174, Static241.aClass186_79, Static256.aClass186_181, Static101.aClass186_26, Static176.aClass186_56, Static268.aClass186_90, Static337.aClass186_105, Static441.aClass186_136, Static111.aClass186_33, Static629.aClass186_179, Static425.aClass186_133, Static193.aClass186_61, Static714.aClass186_199, Static604.aClass186_172, Static174.aClass186_185, Static690.aClass186_119, Static419.aClass186_132, Static365.aClass186_113, Static554.aClass186_157, Static147.aClass186_45, Static591.aClass186_168, Static571.aClass186_165, Static525.aClass186_152, Static97.aClass186_25, Static203.aClass186_64, Static52.aClass186_16, Static224.aClass186_70, Static366.aClass186_114, Static532.aClass186_154, Static268.aClass186_91, Static635.aClass186_182, Static517.aClass186_150, Static439.aClass186_135, Static10.aClass186_5, Static335.aClass186_104, Static245.aClass186_122, Static694.aClass186_191, Static264.aClass186_78, Static237.aClass186_198, Static78.aClass186_23, Static170.aClass186_53, Static530.aClass186_153, Static40.aClass186_12, Static49.aClass186_15, Static212.aClass186_68, Static426.aClass186_134, Static35.aClass186_11, Static480.aClass186_145, Static478.aClass186_144, Static158.aClass186_49, Static557.aClass186_158, Static316.aClass186_115, Static450.aClass186_138, Static102.aClass186_27, Static296.aClass186_67, Static248.aClass186_82, Static12.aClass186_6, Static565.aClass186_162, Static231.aClass186_75, Static115.aClass186_37, Static149.aClass186_46, Static2.aClass186_192, Static102.aClass186_28, Static392.aClass186_123, Static147.aClass186_44, Static118.aClass186_38, Static360.aClass186_112, Static415.aClass186_130, Static709.aClass186_200 };
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "([BIZ)Ljava/lang/Object;")
	public static Object method9254(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static240.aBoolean782) {
			try {
				@Pc(23) Class150 local23 = (Class150) Class.forName("vla").getDeclaredConstructor().newInstance();
				local23.method9042(arg0);
				return local23;
			} catch (@Pc(30) Throwable local30) {
				Static240.aBoolean782 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILclient!lv;B)V")
	public static void method9256(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub32 arg1) {
		Static713.aClass3_Sub55_31.aClass15_Sub8_5.method2888();
		if (arg1 == null) {
			Static525.method7465();
		}
		Static164.aClass33_1.method8228();
		Static115.method2036(arg1);
	}
}
