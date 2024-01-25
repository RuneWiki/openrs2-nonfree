import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!aba", name = "e", descriptor = "J")
	public static long aLong3;

	@OriginalMember(owner = "client!aba", name = "o", descriptor = "D")
	public static double aDouble1;

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(I)V")
	public static void method44() {
		Static369.aClass352_5.method7968();
		Static272.aClass32_3.method1171();
		Static605.aClass43_1.method1377();
		Static349.aClass374_2.method8355();
		Static481.aClass241_2.method5578();
		Static237.aClass371_2.method8307();
		Static483.aClass373_2.method8322();
		Static196.aClass315_2.method7418();
		Static442.aClass388_1.method8666();
		Static281.aClass389_1.method8676();
		Static422.aClass214_1.method5000();
		Static658.aClass88_2.method2136();
		Static453.aClass116_2.method2729();
		Static661.aClass321_4.method7487();
		Static30.aClass267_1.method6386();
		Static145.aClass165_1.method3813();
		Static377.aClass222_1.method5123();
		Static357.aClass322_4.method7488();
		Static47.aClass216_1.method5049();
		Static651.aClass149_2.method3265();
		Static415.aClass154_1.method3386();
		Static29.aClass51_1.method1544();
		Static173.method2916();
		Static290.method4540();
		Static236.method3809();
		Static605.method8019();
		Static643.method8443();
		Static309.aClass279_29.method6637();
		Static207.aClass279_20.method6637();
		Static596.aClass279_54.method6637();
		Static305.aClass279_28.method6637();
		Static543.aClass279_51.method6637();
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(Lclient!c;II)V")
	public static void method46(@OriginalArg(0) Class48 arg0, @OriginalArg(2) int arg1) {
		if (Static228.anInt2286 >= 50 || (arg0 == null || arg0.anIntArrayArray15 == null || arg1 >= arg0.anIntArrayArray15.length || arg0.anIntArrayArray15[arg1] == null)) {
			return;
		}
		@Pc(36) int local36 = arg0.anIntArrayArray15[arg1][0];
		@Pc(40) int local40 = local36 >> 8;
		@Pc(46) int local46 = local36 >> 5 & 0x7;
		@Pc(65) int local65;
		if (arg0.anIntArrayArray15[arg1].length > 1) {
			local65 = (int) (Math.random() * (double) arg0.anIntArrayArray15[arg1].length);
			if (local65 > 0) {
				local40 = arg0.anIntArrayArray15[arg1][local65];
			}
		}
		local65 = 256;
		if (arg0.anIntArray70 != null && arg0.anIntArray69 != null) {
			local65 = Static618.method8107(arg0.anIntArray69[arg1], arg0.anIntArray70[arg1]);
		}
		if (arg0.aBoolean137) {
			Static645.method8448(255, local46, local40, 0, local65, false);
		} else {
			Static117.method2135(local46, local40, 0, 255, local65);
		}
	}

	@OriginalMember(owner = "client!aba", name = "b", descriptor = "(I)[Lclient!fja;")
	public static Class126[] method48() {
		return new Class126[] { Static383.aClass126_134, Static466.aClass126_156, Static310.aClass126_103, Static2.aClass126_1, Static436.aClass126_146, Static295.aClass126_99, Static328.aClass126_111, Static537.aClass126_178, Static395.aClass126_137, Static54.aClass126_18, Static241.aClass126_85, Static425.aClass126_143, Static45.aClass126_17, Static315.aClass126_106, Static666.aClass126_208, Static409.aClass126_136, Static105.aClass126_36, Static111.aClass126_213, Static527.aClass126_174, Static74.aClass126_26, Static398.aClass126_139, Static478.aClass126_161, Static230.aClass126_80, Static644.aClass126_201, Static510.aClass126_169, Static376.aClass126_130, Static671.aClass126_210, Static299.aClass126_100, Static635.aClass126_196, Static196.aClass126_66, Static635.aClass126_195, Static369.aClass126_29, Static429.aClass126_145, Static107.aClass126_38, Static166.aClass126_54, Static544.aClass126_179, Static679.aClass126_215, Static456.aClass126_151, Static378.aClass126_132, Static94.aClass126_32, Static342.aClass126_113, Static627.aClass126_193, Static259.aClass126_88, Static527.aClass126_173, Static184.aClass126_59, Static457.aClass126_152, Static481.aClass126_162, Static28.aClass126_12, Static672.aClass126_212, Static660.aClass126_206, Static255.aClass126_87, Static263.aClass126_91, Static308.aClass126_101, Static395.aClass126_138, Static663.aClass126_207, Static80.aClass126_211, Static237.aClass126_82, Static111.aClass126_214, Static262.aClass126_90, Static195.aClass126_65, Static86.aClass126_27, Static232.aClass126_81, Static195.aClass126_64, Static269.aClass126_93, Static667.aClass126_209, Static93.aClass126_31, Static563.aClass126_186, Static89.aClass126_30, Static356.aClass126_120, Static378.aClass126_131, Static151.aClass126_49, Static562.aClass126_185, Static156.aClass126_105, Static563.aClass126_187, Static559.aClass126_183, Static36.aClass126_203, Static325.aClass126_109, Static366.aClass126_126, Static185.aClass126_60, Static286.aClass126_96, Static190.aClass126_61, Static361.aClass126_122, Static209.aClass126_205, Static513.aClass126_170, Static374.aClass126_129, Static97.aClass126_34, Static463.aClass126_155, Static106.aClass126_37, Static619.aClass126_192, Static64.aClass126_24, Static312.aClass126_104, Static59.aClass126_19, Static495.aClass126_165, Static240.aClass126_84, Static424.aClass126_142, Static486.aClass126_164, Static471.aClass126_202, Static528.aClass126_175, Static402.aClass126_140, Static359.aClass126_121, Static25.aClass126_8, Static341.aClass126_112, Static126.aClass126_43, Static117.aClass126_41, Static440.aClass126_147, Static409.aClass126_135, Static170.aClass126_55, Static214.aClass126_74, Static202.aClass126_67, Static372.aClass126_128, Static606.aClass126_191, Static565.aClass126_168, Static505.aClass126_166, Static136.aClass126_45, Static623.aClass126_172, Static628.aClass126_194, Static445.aClass126_149, Static226.aClass126_125, Static639.aClass126_199, Static120.aClass126_42, Static180.aClass126_58, Static408.aClass126_141, Static163.aClass126_53, Static533.aClass126_176, Static485.aClass126_163, Static229.aClass126_190, Static545.aClass126_180, Static317.aClass126_107, Static323.aClass126_108, Static427.aClass126_144, Static442.aClass126_148, Static534.aClass126_177, Static291.aClass126_97 };
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(Lclient!cn;ILclient!c;I)V")
	public static void method49(@OriginalArg(0) Class23_Sub2 arg0, @OriginalArg(2) Class48 arg1, @OriginalArg(3) int arg2) {
		if (Static228.anInt2286 >= 50 || (arg1 == null || arg1.anIntArrayArray15 == null || arg2 >= arg1.anIntArrayArray15.length || arg1.anIntArrayArray15[arg2] == null)) {
			return;
		}
		@Pc(34) int local34 = arg1.anIntArrayArray15[arg2][0];
		@Pc(38) int local38 = local34 >> 8;
		@Pc(44) int local44 = local34 >> 5 & 0x7;
		@Pc(48) int local48 = local34 & 0x1F;
		@Pc(65) int local65;
		if (arg1.anIntArrayArray15[arg2].length > 1) {
			local65 = (int) ((double) arg1.anIntArrayArray15[arg2].length * Math.random());
			if (local65 > 0) {
				local38 = arg1.anIntArrayArray15[arg2][local65];
			}
		}
		local65 = 256;
		if (arg1.anIntArray70 != null && arg1.anIntArray69 != null) {
			local65 = arg1.anIntArray70[arg2] + (int) ((double) (arg1.anIntArray69[arg2] - arg1.anIntArray70[arg2]) * Math.random());
		}
		@Pc(112) int local112 = arg1.anIntArray71 == null ? 255 : arg1.anIntArray71[arg2];
		if (local48 == 0) {
			if (arg0 == Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2) {
				if (!arg1.aBoolean137) {
					Static117.method2135(local44, local38, 0, local112, local65);
					return;
				}
				Static645.method8448(local112, local44, local38, 0, local65, false);
			}
		} else if (Static227.aClass3_Sub15_11.aClass17_Sub3_5.method741() != 0) {
			@Pc(153) int local153 = arg0.anInt10108 - 256 >> 9;
			@Pc(160) int local160 = arg0.anInt10109 - 256 >> 9;
			@Pc(180) int local180 = arg0 == Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2 ? 0 : local48 + (arg0.aByte142 << 24) + (local153 << 16) + (local160 << 8);
			Static631.aClass303Array2[Static228.anInt2286++] = new Class303((byte) (arg1.aBoolean137 ? 2 : 1), local38, local44, 0, local112, local180, local65, arg0);
		}
	}
}
