import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static353 {

	@OriginalMember(owner = "client!rn", name = "h", descriptor = "[I")
	public static int[] anIntArray575;

	@OriginalMember(owner = "client!rn", name = "j", descriptor = "I")
	public static int anInt6045;

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "Lclient!mf;")
	public static final Class163 aClass163_39 = new Class163();

	@OriginalMember(owner = "client!rn", name = "e", descriptor = "Lclient!os;")
	public static final Class182 aClass182_217 = new Class182("purple:", "lila:", "violet:", "roxo:");

	@OriginalMember(owner = "client!rn", name = "g", descriptor = "Z")
	public static boolean aBoolean391 = false;

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)V")
	public static void method4776() {
		@Pc(7) Class108 local7 = null;
		try {
			@Pc(17) Class270 local17 = Static171.aClass159_1.method3514("2", true);
			while (local17.anInt7548 == 0) {
				Static328.method5696(1L);
			}
			if (local17.anInt7548 == 1) {
				local7 = (Class108) local17.anObject9;
				@Pc(47) Class10_Sub8 local47 = new Class10_Sub8(Static233.anInt4303 * 6 + 3);
				local47.method2458(1);
				local47.method2509(Static233.anInt4303);
				for (@Pc(57) int local57 = 0; local57 < Static136.anIntArray282.length; local57++) {
					if (Static156.aBooleanArray7[local57]) {
						local47.method2509(local57);
						local47.method2506(Static136.anIntArray282[local57]);
					}
				}
				local7.method2648(local47.aByteArray44, 0, local47.anInt2989);
			}
		} catch (@Pc(92) Exception local92) {
		}
		try {
			if (local7 != null) {
				local7.method2643();
			}
		} catch (@Pc(99) Exception local99) {
		}
		Static155.aLong101 = Static220.method3314();
		Static5.aBoolean4 = false;
	}

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "(I)[Lclient!s;")
	public static Class217[] method4778() {
		return new Class217[] { Static311.aClass217_119, Static154.aClass217_69, Static255.aClass217_102, Static137.aClass217_62, Static84.aClass217_40, Static180.aClass217_82, Static125.aClass217_57, Static346.aClass217_132, Static331.aClass217_124, Static126.aClass217_58, Static72.aClass217_38, Static437.aClass217_157, Static92.aClass217_44, Static106.aClass217_46, Static98.aClass217_45, Static159.aClass217_71, Static300.aClass217_115, Static235.aClass217_97, Static409.aClass217_145, Static200.aClass217_88, Static382.aClass217_153, Static4.aClass217_128, Static70.aClass217_37, Static118.aClass217_53, Static390.aClass217_141, Static209.aClass217_91, Static110.aClass217_49, Static244.aClass217_106, Static354.aClass217_133, Static205.aClass217_89, Static113.aClass217_50, Static132.aClass217_59, Static324.aClass217_121, Static24.aClass217_12, Static135.aClass217_146, Static39.aClass217_21, Static284.aClass217_112, Static226.aClass217_95, Static114.aClass217_51, Static223.aClass217_94, Static328.aClass217_158, Static49.aClass217_32, Static342.aClass217_129, Static419.aClass217_149, Static288.aClass217_113, Static456.aClass217_162, Static39.aClass217_22, Static192.aClass217_86, Static418.aClass217_147, Static21.aClass217_11, Static392.aClass217_142, Static121.aClass217_54, Static89.aClass217_41, Static29.aClass217_19, Static375.aClass217_138, Static147.aClass217_66, Static377.aClass217_8, Static276.aClass217_63, Static456.aClass217_163, Static27.aClass217_13, Static190.aClass217_85, Static425.aClass217_156, Static250.aClass217_101, Static5.aClass217_3, Static40.aClass217_26, Static182.aClass217_83, Static422.aClass217_152, Static383.aClass217_140, Static51.aClass217_33, Static362.aClass217_134, Static189.aClass217_84, Static162.aClass217_72, Static260.aClass217_103, Static334.aClass217_125, Static243.aClass217_99, Static273.aClass217_107, Static134.aClass217_60, Static90.aClass217_42, Static456.aClass217_164, Static373.aClass217_137, Static148.aClass217_67, Static380.aClass217_139, Static264.aClass217_104, Static6.aClass217_4, Static35.aClass217_20, Static17.aClass217_10, Static279.aClass217_111, Static150.aClass217_68, Static438.aClass217_160, Static168.aClass217_77, Static40.aClass217_25, Static306.aClass217_118, Static180.aClass217_81, Static226.aClass217_96, Static277.aClass217_108, Static330.aClass217_48, Static362.aClass217_135, Static388.aClass217_56, Static199.aClass217_90, Static60.aClass217_155, Static91.aClass217_43, Static12.aClass217_9, Static211.aClass217_92, Static156.aClass217_70, Static335.aClass217_126, Static268.aClass217_110, Static432.aClass217_159, Static47.aClass217_31, Static406.aClass217_144, Static300.aClass217_116, Static290.aClass217_114, Static163.aClass217_74, Static5.aClass217_2 };
	}
}
