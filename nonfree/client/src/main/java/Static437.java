import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static437 {

	@OriginalMember(owner = "client!pl", name = "q", descriptor = "[[[Z")
	public static boolean[][][] aBooleanArrayArrayArray2;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "()V")
	public static void method6644() {
		while (true) {
			@Pc(1) boolean local1 = true;
			@Pc(3) int local3;
			for (local3 = 0; local3 < Static443.aClass249Array1.length; local3++) {
				if (Static443.aClass249Array1[local3].method6423()) {
					Static223.aLongArray5[local3] = Static443.aClass249Array1[local3].method6424();
				} else {
					synchronized (Static443.aClass249Array1[local3]) {
						Static443.aClass249Array1[local3].notify();
					}
					local1 = false;
				}
			}
			if (local1) {
				Static443.aClass249Array1[Static443.aClass249Array1.length - 1].method6425();
				Static632.method8552(1);
				while (true) {
					local1 = true;
					for (local3 = 0; local3 < Static443.aClass249Array1.length - 1; local3++) {
						if (!Static443.aClass249Array1[local3].method6423()) {
							synchronized (Static443.aClass249Array1[local3]) {
								Static443.aClass249Array1[local3].notify();
							}
							local1 = false;
						}
					}
					if (local1) {
						for (@Pc(102) int local102 = 1; local102 < Static443.aClass249Array1.length - 2; local102++) {
							Static443.aClass249Array1[local102].method6425();
						}
						Static632.method8552(2);
						while (!Static443.aClass249Array1[0].method6423()) {
							synchronized (Static443.aClass249Array1[0]) {
								Static443.aClass249Array1[0].notify();
							}
							try {
								Static500.method7308(1L);
							} catch (@Pc(142) Exception local142) {
							}
						}
						Static443.aClass249Array1[0].method6425();
						return;
					}
					try {
						Static500.method7308(1L);
					} catch (@Pc(99) Exception local99) {
					}
				}
			}
			try {
				Static500.method7308(1L);
			} catch (@Pc(47) Exception local47) {
			}
		}
	}

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "(I)[Lclient!mq;")
	public static Class218[] method6647() {
		return new Class218[] { Static227.aClass218_63, Static498.aClass218_117, Static59.aClass218_136, Static459.aClass218_107, Static422.aClass218_138, Static480.aClass218_114, Static207.aClass218_58, Static6.aClass218_1, Static83.aClass218_84, Static112.aClass218_29, Static48.aClass218_13, Static32.aClass218_8, Static644.aClass218_154, Static201.aClass218_56, Static40.aClass218_11, Static581.aClass218_135, Static609.aClass218_144, Static131.aClass218_36, Static181.aClass218_48, Static59.aClass218_137, Static223.aClass218_61, Static609.aClass218_143, Static275.aClass218_70, Static620.aClass218_150, Static135.aClass218_37, Static499.aClass218_118, Static286.aClass218_72, Static124.aClass218_34, Static440.aClass218_99, Static545.aClass218_129, Static271.aClass218_69, Static414.aClass218_95, Static597.aClass218_140, Static524.aClass218_121, Static380.aClass218_87, Static498.aClass218_116, Static229.aClass218_65, Static384.aClass218_88, Static119.aClass218_31, Static427.aClass218_98, Static601.aClass218_142, Static271.aClass218_68, Static298.aClass218_83, Static324.aClass218_78, Static571.aClass218_134, Static211.aClass218_59, Static190.aClass218_49, Static554.aClass218_131, Static360.aClass218_85, Static613.aClass218_146, Class2_Sub3_Sub2_Sub2.lb, Static307.aClass218_76, Static473.aClass218_111, Static215.aClass218_60, Static525.aClass218_123, Static627.aClass218_151, Static471.aClass218_110, Static453.aClass218_106, Static568.aClass218_132, Static31.aClass218_7, Static251.aClass218_66, Static387.aClass218_89, Static92.aClass218_24, Static451.aClass218_103, Static610.aClass218_145, Static569.aClass218_133, Static95.aClass218_25, Static551.aClass218_149, Static629.aClass218_152, Static223.aClass218_62, Static228.aClass218_64, Static171.aClass218_44, Static410.aClass218_92, Static539.aClass218_126, Static110.aClass218_28, Static529.aClass218_124, Static479.aClass218_113, Static539.aClass218_127, Static24.aClass218_4, Static414.aClass218_96, Static442.aClass218_101, Static516.aClass218_120, Static77.aClass218_43, Static412.aClass218_93, Static154.aClass218_42, Static474.aClass218_112, Static486.aClass218_115, Static332.aClass218_79, Static599.aClass218_141, Static53.aClass218_14, Static102.aClass218_139, Static118.aClass218_30, Static128.aClass218_35, Static96.aClass218_26, Static153.aClass218_41, Static58.aClass218_17, Static440.aClass218_100, Static539.aClass218_128, Static314.aClass218_77, Static171.aClass218_45, Static299.aClass218_119, Static525.aClass218_122, Static46.aClass218_12, Static548.aClass218_130, Static399.aClass218_91, Static56.aClass218_147, Static175.aClass218_46, Static460.aClass218_108, Static394.aClass218_90, Static419.aClass218_97, Static192.aClass218_52, Static267.aClass218_67, Static301.aClass218_75, Static402.aClass218_105, Static369.aClass218_86, Static634.aClass218_153, Static452.aClass218_104, Static150.aClass218_40, Static138.aClass218_38, Static532.aClass218_125, Static21.aClass218_3 };
	}
}
