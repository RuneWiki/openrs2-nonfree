import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!db", name = "a", descriptor = "[J")
	public static final long[] aLongArray4 = new long[32];

	@OriginalMember(owner = "client!db", name = "c", descriptor = "Z")
	public static boolean aBoolean82 = false;

	@OriginalMember(owner = "client!db", name = "d", descriptor = "Z")
	public static boolean aBoolean83 = true;

	@OriginalMember(owner = "client!db", name = "f", descriptor = "[I")
	public static final int[] anIntArray65 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(III)I")
	public static int method1219(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static292.anIntArray326[arg0 & 0x3] : Static22.anIntArray10[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(I)[Lclient!la;")
	public static Class136[] method1221() {
		return new Class136[] { Static448.aClass136_199, Static54.aClass136_21, Static221.aClass136_184, Static216.aClass136_103, Static225.aClass136_105, Static128.aClass136_61, Static368.aClass136_171, Static390.aClass136_178, Static421.aClass136_189, Static130.aClass136_62, Static118.aClass136_56, Static210.aClass136_101, Static237.aClass136_116, Static406.aClass136_185, Static258.aClass136_126, Static181.aClass136_135, Static348.aClass136_162, Static247.aClass136_182, Static360.aClass136_169, Static213.aClass136_102, Static60.aClass136_26, Static74.aClass136_38, Static302.aClass136_139, Static67.aClass136_35, Static303.aClass136_141, Static288.aClass136_134, Static193.aClass136_96, Static15.aClass136_8, Static277.aClass136_132, Static192.aClass136_95, Static319.aClass136_146, Static278.aClass136_131, Static256.aClass136_124, Static423.aClass136_191, Static324.aClass136_150, Static350.aClass136_164, Static154.aClass136_74, Static378.aClass136_174, Static84.aClass136_168, Static205.aClass136_165, Static68.aClass136_36, Static135.aClass136_66, Static356.aClass136_193, Static67.aClass136_33, Static406.aClass136_186, Static231.aClass136_112, Static178.aClass136_89, Static353.aClass136_198, Static310.aClass136_144, Static364.aClass136_170, Static262.aClass136_127, Static393.aClass136_180, Static307.aClass136_154, Static250.aClass136_123, Static57.aClass136_24, Static379.aClass136_175, Static171.aClass136_84, Static27.aClass136_11, Static94.aClass136_45, Static240.aClass136_173, Static149.aClass136_72, Static289.aClass136_130, Static54.aClass136_20, Static322.aClass136_147, Static229.aClass136_107, Static33.aClass136_15, Static392.aClass136_179, Static350.aClass136_163, Static171.aClass136_83, Static218.aClass136_200, Static233.aClass136_114, Static346.aClass136_160, Static423.aClass136_190, Static100.aClass136_50, Static309.aClass136_143, Static398.aClass136_181, Static243.aClass136_192, Static67.aClass136_34, Static134.aClass136_64, Static141.aClass136_68, Static432.aClass136_194, Static13.aClass136_7, Static57.aClass136_25, Static135.aClass136_65, Static327.aClass136_151, Static197.aClass136_97, Static399.aClass136_78, Static182.aClass136_90, Static162.aClass136_79, Static104.aClass136_51, Static200.aClass136_98, Static246.aClass136_121, Static244.aClass136_119, Static150.aClass136_73, Static165.aClass136_60, Static177.aClass136_88, Static315.aClass136_145, Static130.aClass136_63, Static353.aClass136_197, Static8.aClass136_1, Static119.aClass136_58, Static189.aClass136_92, Static96.aClass136_48, Static191.aClass136_94, Static66.aClass136_32, Static341.aClass136_158, Static337.aClass136_156, Static15.aClass136_9, Static146.aClass136_70, Static97.aClass136_49, Static207.aClass136_100, Static167.aClass136_80, Static120.aClass136_59, Static146.aClass136_71 };
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ILclient!wj;B)V")
	public static void method1222(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub2_Sub6 arg1) {
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		if (arg1.anInt7568 > Static172.anInt3107) {
			Static129.method2031(arg1);
		} else if (Static172.anInt3107 <= arg1.anInt7611) {
			Static375.method5235(arg1);
		} else {
			Static110.method1808(false, arg1);
			local7 = Static158.anInt2917;
			local9 = Static369.anInt6267;
		}
		if (arg1.anInt7560 < 128 || arg1.anInt7557 < 128 || arg1.anInt7560 >= (Static373.anInt6324 - 1) * 128 || arg1.anInt7557 >= Static291.anInt5062 * 128 - 128) {
			local7 = -1;
			arg1.anInt7611 = 0;
			arg1.anInt7596 = -1;
			arg1.anInt7612 = -1;
			arg1.anInt7605 = -1;
			arg1.anInt7568 = 0;
			local9 = 0;
			arg1.anInt7560 = arg1.anIntArray510[0] * 128 + arg1.method6204() * 64;
			arg1.anInt7557 = arg1.anIntArray509[0] * 128 + arg1.method6204() * 64;
			arg1.method6190();
		}
		if (Static203.aClass1_Sub2_Sub6_Sub2_1 == arg1 && (arg1.anInt7560 < 1536 || arg1.anInt7557 < 1536 || Static373.anInt6324 * 128 - 1536 <= arg1.anInt7560 || (Static291.anInt5062 - 12) * 128 <= arg1.anInt7557)) {
			arg1.anInt7596 = -1;
			arg1.anInt7605 = -1;
			arg1.anInt7568 = 0;
			arg1.anInt7611 = 0;
			arg1.anInt7612 = -1;
			local9 = 0;
			local7 = -1;
			arg1.anInt7560 = arg1.anIntArray510[0] * 128 + arg1.method6204() * 64;
			arg1.anInt7557 = arg1.anIntArray509[0] * 128 + arg1.method6204() * 64;
			arg1.method6190();
		}
		@Pc(210) int local210 = Static222.method4444(arg1);
		Static283.method4053(arg1, local9, local7, local210);
		Static128.method2022(arg1);
	}
}
