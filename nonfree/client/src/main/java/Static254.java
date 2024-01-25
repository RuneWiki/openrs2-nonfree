import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
	public static int anInt5218;

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "Lclient!dv;")
	public static final Class77 aClass77_46 = new Class77(17, 2);

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IBII)I")
	public static int method4368(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = 255 - arg2;
		@Pc(30) int local30 = ((arg1 & 0xFF00FF) * arg2 & 0xFF00FF00 | arg2 * (arg1 & 0xFF00) & 0xFF0000) >>> 8;
		return (((arg0 & 0xFF00) * local12 & 0xFF0000 | (arg0 & 0xFF00FF) * local12 & 0xFF00FF00) >>> 8) + local30;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)[Lclient!cba;")
	public static Class45[] method4369() {
		return new Class45[] { Static177.aClass45_57, Static425.aClass45_125, Static233.aClass45_72, Static453.aClass45_131, Static323.aClass45_90, Static347.aClass45_97, Static106.aClass45_35, Static379.aClass45_108, Static479.aClass45_137, Static401.aClass45_115, Static250.aClass45_73, Static139.aClass45_44, Static522.aClass45_147, Static539.aClass45_153, Static295.aClass45_85, Static20.aClass45_5, Static63.aClass45_124, Static388.aClass45_111, Static175.aClass45_56, Static544.aClass45_155, Static53.aClass45_21, Static153.aClass45_46, Static25.aClass45_6, Static181.aClass45_59, Static149.aClass45_45, Static447.aClass45_130, Static160.aClass45_48, Static52.aClass45_20, Static74.aClass45_28, Static184.aClass45_61, Static305.aClass45_88, Static132.aClass45_43, Static119.aClass45_40, Static530.aClass45_151, Static68.aClass45_26, Static266.aClass45_79, Static492.aClass45_129, Static274.aClass45_82, Static75.aClass45_29, Static340.aClass45_96, Static168.aClass45_139, Static190.aClass45_65, Static538.aClass45_152, Static67.aClass45_25, Static523.aClass45_148, Static496.aClass45_103, Static353.aClass45_100, Static400.aClass45_114, Static410.aClass45_122, Static405.aClass45_119, Static283.aClass45_150, Static357.aClass45_102, Static86.aClass45_32, Static522.aClass45_146, Static499.aClass45_141, Static400.aClass45_113, Static39.aClass45_13, Static374.aClass45_105, Static78.aClass45_31, Static462.aClass45_132, Static515.aClass45_144, Static303.aClass45_87, Static44.aClass45_15, Static270.aClass45_126, Static451.aClass45_68, Static39.aClass45_12, Static435.aClass45_127, Static118.aClass45_39, Static498.aClass45_140, Static391.aClass45_107, Static438.aClass45_128, Static55.aClass45_22, Static519.aClass45_145, Static348.aClass45_98, Static372.aClass45_104, Static226.aClass45_71, Static473.aClass45_133, Static28.aClass45_75, Static526.aClass45_149, Static185.aClass45_62, Static125.aClass45_42, Static179.aClass45_58, Static175.aClass45_55, Static251.aClass45_74, Static397.aClass45_112, Static40.aClass45_14, Static339.aClass45_95, Static186.aClass45_63, Static170.aClass45_52, Static475.aClass45_135, Static186.aClass45_64, Static408.aClass45_120, Static484.aClass45_138, Static59.aClass45_23, Static31.aClass45_8, Static259.aClass45_77, Static171.aClass45_53, Static222.aClass45_70, Static357.aClass45_101, Static402.aClass45_116, Static197.aClass45_66, Static169.aClass45_51, Static91.aClass45_33, Static112.aClass45_36, Static335.aClass45_94, Static8.aClass45_3, Static500.aClass45_142, Static282.aClass45_83, Static409.aClass45_121, Static106.aClass45_34, Static353.aClass45_99, Static69.aClass45_143, Static252.aClass45_76, Static481.aClass45_134 };
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(III)Z")
	public static boolean method4370(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
