import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static451 {

	@OriginalMember(owner = "client!wi", name = "f", descriptor = "Lclient!qu;")
	public static final Class208 aClass208_101 = new Class208(68, 3);

	@OriginalMember(owner = "client!wi", name = "g", descriptor = "I")
	public static int anInt7180 = 0;

	@OriginalMember(owner = "client!wi", name = "h", descriptor = "I")
	public static int anInt7181 = 0;

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(CB)C")
	public static char method5754(@OriginalArg(0) char arg0) {
		if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
			return '_';
		} else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
			return arg0;
		} else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
			return 'a';
		} else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
			return 'e';
		} else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
			return 'i';
		} else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
			return 'o';
		} else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
			return 'u';
		} else if (arg0 == 'ç' || arg0 == 'Ç') {
			return 'c';
		} else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
			return 'y';
		} else if (arg0 == 'ñ' || arg0 == 'Ñ') {
			return 'n';
		} else if (arg0 == 'ß') {
			return 'b';
		} else {
			return Character.toLowerCase(arg0);
		}
	}

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)[Lclient!bi;")
	public static Class25[] method5756() {
		return new Class25[] { Static389.aClass25_165, Static151.aClass25_67, Static45.aClass25_16, Static236.aClass25_92, Static108.aClass25_51, Static392.aClass25_166, Static410.aClass25_173, Static48.aClass25_18, Static159.aClass25_69, Static260.aClass25_108, Static261.aClass25_109, Static138.aClass25_62, Static14.aClass25_6, Static405.aClass25_172, Static240.aClass25_95, Static428.aClass25_177, Static222.aClass25_85, Static381.aClass25_161, Static322.aClass25_133, Static3.aClass25_1, Static34.aClass25_12, Static83.aClass25_33, Static224.aClass25_86, Static270.aClass25_112, Static151.aClass25_68, Static266.aClass25_110, Static376.aClass25_160, Static276.aClass25_116, Static207.aClass25_83, Static162.aClass25_70, Static177.aClass25_76, Static93.aClass25_40, Static65.aClass25_26, Static335.aClass25_142, Static441.aClass25_179, Static44.aClass25_15, Static181.aClass25_73, Static353.aClass25_151, Static370.aClass25_157, Static400.aClass25_171, Static365.aClass25_104, Static27.aClass25_10, Static383.aClass25_162, Static327.aClass25_137, Static347.aClass25_149, Static70.aClass25_28, Static106.aClass25_49, Static444.aClass25_181, Static77.aClass25_29, Static365.aClass25_105, Static345.aClass25_146, Static416.aClass25_122, Static239.aClass25_94, Static349.aClass25_150, Static179.aClass25_77, Static374.aClass25_158, Static301.aClass25_98, Static364.aClass25_156, Static67.aClass25_27, Static85.aClass25_36, Static128.aClass25_61, Static253.aClass25_106, Static291.aClass25_124, Static56.aClass25_22, Static227.aClass25_87, Static228.aClass25_148, Static274.aClass25_115, Static93.aClass25_39, Static169.aClass25_74, Static269.aClass25_58, Static274.aClass25_114, Static97.aClass25_42, Static331.aClass25_141, Static244.aClass25_99, Static330.aClass25_139, Static90.aClass25_38, Static38.aClass25_14, Static280.aClass25_118, Static192.aClass25_80, Static271.aClass25_113, Static368.aClass25_184, Static107.aClass25_50, Static208.aClass25_147, Static290.aClass25_123, Static117.aClass25_54, Static325.aClass25_135, Static254.aClass25_107, Static83.aClass25_32, Static217.aClass25_84, Static461.aClass25_183, Static200.aClass25_81, Static127.aClass25_60, Static63.aClass25_168, Static26.aClass25_9, Static190.aClass25_79, Static329.aClass25_138, Static392.aClass25_167, Static268.aClass25_111, Static119.aClass25_56, Static414.aClass25_175, Static344.aClass25_145, Static97.aClass25_41, Static149.aClass25_180, Static308.aClass25_132, Static175.aClass25_75, Static389.aClass25_164, Static404.aClass25_66, Static379.aClass25_89, Static291.aClass25_125, Static357.aClass25_152, Static292.aClass25_126, Static79.aClass25_30, Static141.aClass25_174, Static105.aClass25_48 };
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZIIZI)I")
	public static int method5762(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class2_Sub12 local10 = Static92.method1397(arg2, false);
		if (local10 == null) {
			return 0;
		}
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < local10.anIntArray212.length; local18++) {
			if (local10.anIntArray212[local18] >= 0 && local10.anIntArray212[local18] < Static413.aClass271_2.anInt7603) {
				@Pc(43) Class218 local43 = Static413.aClass271_2.method6193(local10.anIntArray212[local18]);
				@Pc(53) int local53 = local43.method5010(Static275.aClass235_1.method5382(arg1).anInt5653, arg1);
				if (arg0) {
					local16 += local10.anIntArray213[local18] * local53;
				} else {
					local16 += local53;
				}
			}
		}
		return local16;
	}
}
