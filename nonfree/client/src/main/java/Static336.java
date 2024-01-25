import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!m", name = "R", descriptor = "I")
	public static int anInt6225;

	@OriginalMember(owner = "client!m", name = "S", descriptor = "[I")
	public static int[] anIntArray411;

	@OriginalMember(owner = "client!m", name = "A", descriptor = "[[I")
	public static final int[][] anIntArrayArray54 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!m", name = "P", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_99 = new Class274(35, 6);

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(III)Z")
	public static boolean method5206(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static611.method8353(arg0, arg1)) {
			return Static228.method3854(arg1, arg0) | (arg0 & 0x9000) != 0 | Static270.method4343(arg0, arg1) ? true : (Static480.method6932(arg0, arg1) | (arg0 & 0x2000) != 0 | Static447.method6625(arg1, arg0)) & (arg1 & 0x37) == 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(Z)V")
	public static void method5208() {
		if (Static538.anInt8988 == 0) {
			return;
		}
		try {
			if (++Static310.anInt5674 > 2000) {
				if (Static439.aClass210_1 != null) {
					Static439.aClass210_1.method8030();
					Static439.aClass210_1 = null;
				}
				if (Static541.anInt9024 >= 2) {
					Static232.anInt7424 = -5;
					Static538.anInt8988 = 0;
					return;
				}
				Static139.aClass322_2.method7606();
				Static310.anInt5674 = 0;
				Static541.anInt9024++;
				Static538.anInt8988 = 1;
			}
			if (Static538.anInt8988 == 1) {
				Static84.aClass26_10 = Static139.aClass322_2.method7607(Static375.aClass359_4);
				Static538.anInt8988 = 2;
			}
			if (Static538.anInt8988 == 2) {
				if (Static84.aClass26_10.anInt762 == 2) {
					throw new IOException();
				}
				if (Static84.aClass26_10.anInt762 != 1) {
					return;
				}
				Static439.aClass210_1 = Static24.method593((Socket) Static84.aClass26_10.anObject3);
				Static84.aClass26_10 = null;
				Static73.method1380();
				Static538.anInt8988 = 4;
			}
			if (Static538.anInt8988 == 4 && Static439.aClass210_1.method8029(1)) {
				Static439.aClass210_1.method8031(0, 1, Static313.aClass2_Sub34_Sub2_1.aByteArray77);
				@Pc(110) int local110 = Static313.aClass2_Sub34_Sub2_1.aByteArray77[0] & 0xFF;
				Static538.anInt8988 = 0;
				Static232.anInt7424 = local110;
				Static439.aClass210_1.method8030();
				Static439.aClass210_1 = null;
			}
		} catch (@Pc(127) IOException local127) {
			if (Static439.aClass210_1 != null) {
				Static439.aClass210_1.method8030();
				Static439.aClass210_1 = null;
			}
			if (Static541.anInt9024 < 2) {
				Static139.aClass322_2.method7606();
				Static310.anInt5674 = 0;
				Static541.anInt9024++;
				Static538.anInt8988 = 1;
			} else {
				Static232.anInt7424 = -4;
				Static538.anInt8988 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "f", descriptor = "(I)[Lclient!qe;")
	public static Class274[] method5209() {
		return new Class274[] { Static280.aClass274_81, Static584.aClass274_165, Static620.aClass274_177, Static598.aClass274_36, Static246.aClass274_170, Static321.aClass274_183, Static9.aClass274_3, Static405.aClass274_116, Static249.aClass274_68, Static631.aClass274_182, Static625.aClass274_178, Static489.aClass274_135, Static596.aClass274_171, Static417.aClass274_118, Static462.aClass274_130, Static436.aClass274_123, Static172.aClass274_50, Static304.aClass274_90, Static509.aClass274_143, Static116.aClass274_30, Static61.aClass274_17, Static282.aClass274_82, Static3.aClass274_1, Static256.aClass274_73, Static476.aClass274_132, Static627.aClass274_179, Static218.aClass274_57, Static442.aClass274_124, Static7.aClass274_2, Static573.aClass274_161, Static328.aClass274_96, Static161.aClass274_48, Static394.aClass274_113, Static533.aClass274_148, Static631.aClass274_181, aClass274_99, Static32.aClass274_11, Static534.aClass274_150, Static560.aClass274_157, Static226.aClass274_62, Static243.aClass274_65, Static451.aClass274_128, Static461.aClass274_129, Static483.aClass274_134, Static498.aClass274_139, Static42.aClass274_12, Static640.aClass274_184, Static225.aClass274_60, Static365.aClass274_105, Static17.aClass274_6, Static171.aClass274_49, Static260.aClass274_75, Static443.aClass274_126, Static256.aClass274_74, Static95.aClass274_23, Static541.aClass274_154, Static537.aClass274_152, Static155.aClass274_42, Static490.aClass274_137, Static18.aClass274_7, Static244.aClass274_66, Static583.aClass274_164, Static532.aClass274_147, Static527.aClass274_145, Static504.aClass274_159, Static417.aClass274_119, Static298.aClass274_88, Static285.aClass274_85, Static638.aClass274_125, Static435.aClass274_122, Static254.aClass274_71, Static607.aClass274_173, Static585.aClass274_166, Static328.aClass274_95, Static263.aClass274_76, Static247.aClass274_83, Static277.aClass274_79, Static251.aClass274_69, Static505.aClass274_142, Static226.aClass274_61, Static45.aClass274_109, Static153.aClass274_41, Static577.aClass274_162, Static277.aClass274_80, Static326.aClass274_94, Static212.aClass274_56, Static191.aClass274_97, Static535.aClass274_151, Static333.aClass274_98, Static364.aClass274_104, Static580.aClass274_163, Static96.aClass274_25, Static21.aClass274_8, Static55.aClass274_15, Static423.aClass274_175, Static107.aClass274_27, Static285.aClass274_84, Static96.aClass274_24, Static363.aClass274_103, Static122.aClass274_33, Static474.aClass274_131, Static180.aClass274_51, Static343.aClass274_100, Static367.aClass274_106, Static161.aClass274_47, Static609.aClass274_174, Static395.aClass274_40, Static224.aClass274_59, Static233.aClass274_63, Static353.aClass274_102, Static628.aClass274_180, Static541.aClass274_155, Static431.aClass274_120, Static134.aClass274_34, Static118.aClass274_31, Static268.aClass274_77, Static369.aClass274_107, Static311.aClass274_91, Static619.aClass274_176, Static498.aClass274_140, Static101.aClass274_26 };
	}
}
