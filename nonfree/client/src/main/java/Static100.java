import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!dj", name = "g", descriptor = "[I")
	public static int[] anIntArray123;

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "[I")
	public static final int[] anIntArray121 = new int[1000];

	@OriginalMember(owner = "client!dj", name = "h", descriptor = "I")
	public static int anInt1975 = 0;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V")
	public static void method1622() {
		@Pc(1) Class87 local1 = Static295.aClass87_129;
		synchronized (Static295.aClass87_129) {
			Static295.aClass87_129.method1796();
		}
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)V")
	public static void method1623() {
		for (@Pc(3) int local3 = 0; local3 < 100; local3++) {
			Static549.aClass20Array1[local3] = null;
		}
		Static577.anInt9742 = 0;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIZIIII)V")
	public static void method1625(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static361.method8001(Static554.anInt9362, Static62.anInt1300, arg3);
		@Pc(17) int local17 = Static361.method8001(Static554.anInt9362, Static62.anInt1300, arg5);
		@Pc(34) int local34 = Static361.method8001(Static275.anInt4919, Static529.anInt9089, arg4);
		@Pc(40) int local40 = Static361.method8001(Static275.anInt4919, Static529.anInt9089, arg2);
		@Pc(48) int local48 = Static361.method8001(Static554.anInt9362, Static62.anInt1300, arg0 + arg3);
		@Pc(57) int local57 = Static361.method8001(Static554.anInt9362, Static62.anInt1300, arg5 - arg0);
		for (@Pc(59) int local59 = local11; local59 < local48; local59++) {
			Static491.method7219(Static249.anIntArrayArray23[local59], local34, arg1, local40);
		}
		for (@Pc(79) int local79 = local17; local79 > local57; local79--) {
			Static491.method7219(Static249.anIntArrayArray23[local79], local34, arg1, local40);
		}
		@Pc(105) int local105 = Static361.method8001(Static275.anInt4919, Static529.anInt9089, arg4 + arg0);
		@Pc(113) int local113 = Static361.method8001(Static275.anInt4919, Static529.anInt9089, arg2 - arg0);
		for (@Pc(115) int local115 = local48; local115 <= local57; local115++) {
			@Pc(121) int[] local121 = Static249.anIntArrayArray23[local115];
			Static491.method7219(local121, local34, arg1, local105);
			Static491.method7219(local121, local113, arg1, local40);
		}
	}

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "(I)[Lclient!tm;")
	public static Class337[] method1626() {
		return new Class337[] { Static638.aClass337_170, Static87.aClass337_27, Static392.aClass337_122, Static200.aClass337_62, Static432.aClass337_127, Static417.aClass337_125, Static65.aClass337_21, Static263.aClass337_87, Static359.aClass337_112, Static354.aClass337_47, Static224.aClass337_69, Static348.aClass337_111, Static346.aClass337_79, Static260.aClass337_86, Static126.aClass337_42, Static13.aClass337_12, Static250.aClass337_75, Static8.aClass337_113, Static467.aClass337_136, Static151.aClass337_49, Static483.aClass337_138, Static69.aClass337_23, Static24.aClass337_13, Static615.aClass337_160, Static113.aClass337_38, Static42.aClass337_17, Static485.aClass337_140, Static51.aClass337_18, Static193.aClass337_142, Static522.aClass337_146, Static612.aClass337_159, Static329.aClass337_51, Static70.aClass337_24, Static343.aClass337_108, Static167.aClass337_54, Static325.aClass337_103, Static319.aClass337_100, Static438.aClass337_168, Static392.aClass337_121, Static178.aClass337_57, Static66.aClass337_22, Static586.aClass337_152, Static313.aClass337_97, Static258.aClass337_81, Static381.aClass337_116, Static229.aClass337_70, Static501.aClass337_143, Static204.aClass337_63, Static635.aClass337_169, Static622.aClass337_163, Static285.aClass337_92, Static99.aClass337_35, Static170.aClass337_55, Static556.aClass337_149, Static294.aClass337_93, Static313.aClass337_95, Static645.aClass337_172, Static277.aClass337_88, Static595.aClass337_153, Static450.aClass337_133, Static607.aClass337_150, Static246.aClass337_74, Static446.aClass337_131, Static10.aClass337_11, Static209.aClass337_66, Static638.aClass337_171, Static354.aClass337_48, Static596.aClass337_154, Static330.aClass337_104, Static605.aClass337_158, Static134.aClass337_43, Static446.aClass337_132, Static526.aClass337_147, Static439.aClass337_130, Static530.aClass337_151, Static237.aClass337_72, Static143.aClass337_44, Static216.aClass337_67, Static521.aClass337_145, Static93.aClass337_33, Static617.aClass337_161, Static108.aClass337_37, Static98.aClass337_114, Static457.aClass337_134, Static354.aClass337_46, Static235.aClass337_71, Static315.aClass337_123, Static492.aClass337_141, Static253.aClass337_120, Static619.aClass337_162, Static578.aClass337_77, Static337.aClass337_105, Static632.aClass337_166, Static177.aClass337_56, Static321.aClass337_101, Static79.aClass337_26, Static316.aClass337_99, Static634.aClass337_167, Static365.aClass337_85, Static208.aClass337_64, Static314.aClass337_98, Static62.aClass337_20, Static209.aClass337_65, Static346.aClass337_80, Static504.aClass337_144, Static642.aClass337_157, Static365.aClass337_84, Static251.aClass337_78, Static341.aClass337_107, Static466.aClass337_135, Static534.aClass337_148, Static93.aClass337_32, Static371.aClass337_115, Static115.aClass337_39, Static598.aClass337_155, Static181.aClass337_58, Static104.aClass337_36, Static338.aClass337_106, Static280.aClass337_91, Static71.aClass337_25, Static599.aClass337_156 };
	}
}
