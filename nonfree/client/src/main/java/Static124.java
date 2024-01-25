import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!ho", name = "d", descriptor = "I")
	public static int anInt2721 = 127;

	@OriginalMember(owner = "client!ho", name = "f", descriptor = "I")
	public static int anInt2723 = 0;

	@OriginalMember(owner = "client!ho", name = "g", descriptor = "[I")
	public static final int[] anIntArray199 = new int[14];

	@OriginalMember(owner = "client!ho", name = "h", descriptor = "J")
	public static long aLong99 = 0L;

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(Z)[Lclient!vq;")
	public static Class217[] method2601() {
		return new Class217[] { Static333.aClass217_194, Static149.aClass217_103, Static366.aClass217_218, Static67.aClass217_55, Static255.aClass217_169, Static290.aClass217_186, Static85.aClass217_67, Static11.aClass217_31, Static321.aClass217_192, Static142.aClass217_99, Static300.aClass217_187, Static232.aClass217_154, Static161.aClass217_114, Static234.aClass217_156, Static339.aClass217_190, Static361.aClass217_213, Static213.aClass217_143, Static85.aClass217_68, Static23.aClass217_19, Static277.aClass217_178, Static212.aClass217_140, Static78.aClass217_62, Static357.aClass217_211, Static163.aClass217_116, Static155.aClass217_108, Static108.aClass217_83, Static212.aClass217_139, Static297.aClass217_184, Static149.aClass217_104, Static71.aClass217_58, Static267.aClass217_172, Static156.aClass217_109, Static85.aClass217_66, Static1.aClass217_1, Static295.aClass217_183, Static354.aClass217_205, Static166.aClass217_119, Static344.aClass217_161, Static339.aClass217_191, Static182.aClass217_126, Static261.aClass217_171, Static43.aClass217_175, Static220.aClass217_149, Static334.aClass217_207, Static188.aClass217_133, Static116.aClass217_88, Static144.aClass217_101, Static177.aClass217_125, Static91.aClass217_220, Static298.aClass217_201, Static297.aClass217_185, Static87.aClass217_70, Static230.aClass217_74, Static21.aClass217_17, Static218.aClass217_147, Static40.aClass217_36, Static188.aClass217_132, Static165.aClass217_117, Static185.aClass217_72, Static364.aClass217_214, Static145.aClass217_102, Static140.aClass217_96, Static184.aClass217_130, Static49.aClass217_47, Static146.aClass217_209, Static112.aClass217_86, Static220.aClass217_148, Static270.aClass217_173, Static87.aClass217_69, Static46.aClass217_46, Static142.aClass217_100, Static253.aClass217_168, Static132.aClass217_94, Static59.aClass217_52, Static247.aClass217_166, Static365.aClass217_215, Static2.aClass217_2, Static165.aClass217_118, Static352.aClass217_65, Static6.aClass217_3, Static92.aClass217_75, Static12.aClass217_6, Static13.aClass217_11, Static356.aClass217_208, Static359.aClass217_212, Static26.aClass217_21, Static279.aClass217_181, Static42.aClass217_37, Static33.aClass217_30, Static257.aClass217_43, Static298.aClass217_200, Static329.aClass217_193, Static259.aClass217_170, Static112.aClass217_87, Static72.aClass217_59, Static97.aClass217_78, Static64.aClass217_210, Static232.aClass217_153, Static153.aClass217_107, Static129.aClass217_93, Static161.aClass217_115, Static184.aClass217_129, Static6.aClass217_4, Static176.aClass217_197, Static91.aClass217_219 };
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(B)V")
	public static void method2602() {
		if (Static31.aFrame1 != null) {
			return;
		}
		@Pc(13) Container local13;
		if (Static39.aFrame2 == null) {
			local13 = Static227.aClass75_5.anApplet1;
		} else {
			local13 = Static39.aFrame2;
		}
		Static210.anInt4185 = local13.getSize().width;
		Static281.anInt5472 = local13.getSize().height;
		@Pc(31) Insets local31;
		if (local13 == Static39.aFrame2) {
			local31 = Static39.aFrame2.getInsets();
			Static281.anInt5472 -= local31.bottom + local31.top;
			Static210.anInt4185 -= local31.left + local31.right;
		}
		if (Static300.method5230() == 1) {
			Static213.anInt4274 = Static82.anInt1847;
			Static87.anInt1924 = (Static210.anInt4185 - Static82.anInt1847) / 2;
			Static130.anInt2825 = Static142.anInt3063;
			Static100.anInt2305 = 0;
		} else if (Static268.anInt5269 < 96 && Static241.anInt4925 == 0) {
			@Pc(99) int local99 = Static210.anInt4185 > 1024 ? 1024 : Static210.anInt4185;
			Static213.anInt4274 = local99;
			Static87.anInt1924 = (Static210.anInt4185 - local99) / 2;
			@Pc(115) int local115 = Static281.anInt5472 > 768 ? 768 : Static281.anInt5472;
			Static100.anInt2305 = 0;
			Static130.anInt2825 = local115;
		} else {
			Static213.anInt4274 = Static210.anInt4185;
			Static87.anInt1924 = 0;
			Static130.anInt2825 = Static281.anInt5472;
			Static100.anInt2305 = 0;
		}
		if (Static195.anInt3950 != 0) {
			@Pc(133) boolean local133;
			if (Static213.anInt4274 < 1024 && Static130.anInt2825 < 768) {
				local133 = true;
			} else {
				local133 = false;
			}
		}
		Static174.aCanvas3.setSize(Static213.anInt4274, Static130.anInt2825);
		if (Static9.aClass63_1 != null) {
			Static9.aClass63_1.method4572();
		}
		if (Static39.aFrame2 == local13) {
			local31 = Static39.aFrame2.getInsets();
			Static174.aCanvas3.setLocation(Static87.anInt1924 + local31.left, Static100.anInt2305 + local31.top);
		} else {
			Static174.aCanvas3.setLocation(Static87.anInt1924, Static100.anInt2305);
		}
		if (Static336.anInt6389 != -1) {
			Static14.method4534(true);
		}
		Static136.method4750();
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(ZI)V")
	public static void method2604(@OriginalArg(1) int arg0) {
		@Pc(14) Class1_Sub4_Sub17 local14 = Static132.method2717(arg0, 5);
		local14.method3481();
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(Lclient!ct;B)V")
	public static void method2605(@OriginalArg(0) Class30 arg0) {
		Static336.aClass30_96 = arg0;
	}
}
