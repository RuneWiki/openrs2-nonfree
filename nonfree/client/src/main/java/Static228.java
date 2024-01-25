import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!nh", name = "h", descriptor = "I")
	public static final int anInt4043 = 1401;

	@OriginalMember(owner = "client!nh", name = "k", descriptor = "Z")
	public static boolean aBoolean306 = false;

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(CI)Z")
	public static boolean method3716(@OriginalArg(0) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)V")
	public static void method3717(@OriginalArg(0) int arg0) {
		@Pc(8) int local8 = Static253.anInt4469 - Static204.anInt3782;
		if (local8 >= 100) {
			Static79.anInt4624 = 1;
			return;
		}
		@Pc(19) int local19 = (int) Static1.aFloat80;
		if (Static50.anInt1038 >> 8 > local19) {
			local19 = Static50.anInt1038 >> 8;
		}
		if (Static88.aBooleanArray12[4] && local19 < Static365.anIntArray1304[4] + 128) {
			local19 = Static365.anIntArray1304[4] + 128;
		}
		@Pc(56) int local56 = (int) Static127.aFloat41 + Static189.anInt6619 & 0x3FFF;
		Static154.method2827((local19 >> 3) * 3 + 600, Static289.anInt5022, local19, local56, Static170.method3006(Static206.aClass1_Sub5_Sub1_Sub1_1.anInt6390, Static206.aClass1_Sub5_Sub1_Sub1_1.anInt6386, Static382.anInt6523) - 50, arg0, Static28.anInt601);
		@Pc(98) float local98 = 1.0F - (float) ((100 - local8) * (-local8 + 100) * (100 - local8)) / 1000000.0F;
		Static14.anInt360 = (int) ((float) Static344.anInt4790 + (float) (Static14.anInt360 - Static344.anInt4790) * local98);
		Static51.anInt1057 = (int) ((float) (Static51.anInt1057 - Static368.anInt5299) * local98 + (float) Static368.anInt5299);
		Static224.anInt4006 = (int) ((float) Static144.anInt2886 + local98 * (float) (Static224.anInt4006 - Static144.anInt2886));
		Static285.anInt4940 = (int) ((float) Static59.anInt1124 + (float) (Static285.anInt4940 - Static59.anInt1124) * local98);
		@Pc(158) int local158 = Static235.anInt4191 - Static41.anInt819;
		if (local158 > 8192) {
			local158 -= 16384;
		} else if (local158 < -8192) {
			local158 += 16384;
		}
		Static235.anInt4191 = (int) ((float) Static41.anInt819 + (float) local158 * local98);
		Static235.anInt4191 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)V")
	public static void method3719() {
		if (Static224.anInt4007 < 0) {
			return;
		}
		@Pc(11) long local11 = Static39.method699();
		Static224.anInt4007 = (int) ((long) Static224.anInt4007 + Static223.aLong135 - local11);
		if (Static224.anInt4007 > 0) {
			@Pc(31) int local31 = (Static224.anInt4007 << 8) / Static345.anInt6625;
			@Pc(36) int local36 = 255 - local31;
			@Pc(41) float local41 = (float) local31 / 255.0F;
			Static287.anInt4978 = ((Static132.anInt2710 & 0xFF00) * local31 + (Static218.aClass119_5.anInt3053 & 0xFF00) * local36 & 0xFF0000) + ((Static218.aClass119_5.anInt3053 & 0xFF00FF) * local36 + (Static132.anInt2710 & 0xFF00FF) * local31 & 0xFF00FF00) >>> 8;
			@Pc(77) float local77 = 1.0F - local41;
			Static266.anInt4632 = Static74.anInt1436 * local31 + local36 * Static218.aClass119_5.anInt3047 >> 8;
			Static300.aFloat7 = Static154.aFloat42 + (Static218.aClass119_5.aFloat46 - Static154.aFloat42) * local77;
			Static345.aFloat81 = Static308.aFloat72 + local77 * (Static218.aClass119_5.aFloat47 - Static308.aFloat72);
			Static116.aFloat40 = Static187.aFloat54 + local77 * (Static218.aClass119_5.aFloat48 - Static187.aFloat54);
			Static160.aFloat49 = Static234.aFloat69 + (Static218.aClass119_5.aFloat45 - Static234.aFloat69) * local77;
			Static131.anInt2691 = (local36 * (Static218.aClass119_5.anInt3049 & 0xFF00) + (Static93.anInt1912 & 0xFF00) * local31 & 0xFF0000) + ((Static93.anInt1912 & 0xFF00FF) * local31 + (local36 * (Static218.aClass119_5.anInt3049 & 0xFF00FF)) & 0xFF00FF00) >>> 8;
			Static290.aFloat71 = local77 * (Static218.aClass119_5.aFloat44 - Static24.aFloat2) + Static24.aFloat2;
			Static217.aFloat68 = (Static218.aClass119_5.aFloat43 - Static370.aFloat77) * local77 + Static370.aFloat77;
			if (Static218.aClass119_5.aClass21_2 != Static315.aClass21_4) {
				Static215.aClass21_3 = Static140.aClass63_4.method2016(Static315.aClass21_4, Static218.aClass119_5.aClass21_2, local77, Static215.aClass21_3);
			}
		} else {
			Static287.anInt4978 = Static218.aClass119_5.anInt3053;
			Static217.aFloat68 = Static218.aClass119_5.aFloat43;
			Static116.aFloat40 = Static218.aClass119_5.aFloat48;
			Static300.aFloat7 = Static218.aClass119_5.aFloat46;
			Static224.anInt4007 = -1;
			Static215.aClass21_3 = Static218.aClass119_5.aClass21_2;
			Static266.anInt4632 = Static218.aClass119_5.anInt3047;
			Static131.anInt2691 = Static218.aClass119_5.anInt3049;
			Static160.aFloat49 = Static218.aClass119_5.aFloat45;
			Static345.aFloat81 = Static218.aClass119_5.aFloat47;
			Static290.aFloat71 = Static218.aClass119_5.aFloat44;
		}
		Static223.aLong135 = local11;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(BC)C")
	public static char method3720(@OriginalArg(1) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)[Lclient!rc;")
	public static Class205[] method3721() {
		return new Class205[] { Static19.aClass205_8, Static27.aClass205_12, Static79.aClass205_102, Static55.aClass205_26, Static222.aClass205_91, Static323.aClass205_119, Static318.aClass205_118, Static71.aClass205_33, Static255.aClass205_99, Static92.aClass205_43, Static89.aClass205_42, Static297.aClass205_113, Static182.aClass205_86, Static30.aClass205_16, Static190.aClass205_78, Static210.aClass205_84, Static197.aClass205_82, Static49.aClass205_24, Static155.aClass205_67, Static17.aClass205_7, Static204.aClass205_83, Static213.aClass205_85, Static288.aClass205_110, Static273.aClass205_104, Static100.aClass205_47, Static260.aClass205_101, Static323.aClass205_120, Static339.aClass205_127, Static16.aClass205_6, Static4.aClass205_2, Static193.aClass205_80, Static141.aClass205_64, Static143.aClass205_65, Static81.aClass205_35, Static135.aClass205_76, Static62.aClass205_31, Static163.aClass205_58, Static66.aClass205_32, Static296.aClass205_112, Static106.aClass205_49, Static176.aClass205_73, Static239.aClass205_94, Static193.aClass205_81, Static156.aClass205_68, Static270.aClass205_71, Static119.aClass205_61, Static83.aClass205_36, Static285.aClass205_109, Static325.aClass205_121, Static186.aClass205_75, Static57.aClass205_79, Static361.aClass205_134, Static165.aClass205_69, Static386.aClass205_139, Static307.aClass205_115, Static273.aClass205_105, Static138.aClass205_23, Static267.aClass205_103, Static28.aClass205_13, Static335.aClass205_126, Static345.aClass205_140, Static2.aClass205_1, Static214.aClass205_87, Static360.aClass205_133, Static226.aClass205_136, Static300.aClass205_38, Static170.aClass205_72, Static190.aClass205_77, Static245.aClass205_98, Static31.aClass205_17, Static334.aClass205_124, Static32.aClass205_18, Static61.aClass205_30, Static84.aClass205_39, Static335.aClass205_125, Static301.aClass205_117, Static303.aClass205_114, Static131.aClass205_62, Static181.aClass205_135, Static50.aClass205_25, Static359.aClass205_132, Static347.aClass205_130, Static245.aClass205_97, Static344.aClass205_107, Static326.aClass205_122, Static113.aClass205_55, Static355.aClass205_131, Static344.aClass205_108, Static34.aClass205_19, Static117.aClass205_60, Static75.aClass205_34, Static244.aClass205_96, Static216.aClass205_88, Static144.aClass205_66, Static258.aClass205_100, Static379.aClass205_137, Static136.aClass205_63, Static43.aClass205_21, Static15.aClass205_5, Static311.aClass205_116, Static95.aClass205_138, Static12.aClass205_3, Static107.aClass205_59, Static247.aClass205_123, Static13.aClass205_4 };
	}
}
