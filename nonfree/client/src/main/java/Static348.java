import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static348 {

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "[S")
	private static final short[] aShortArray25 = new short[] { -10304, 9104, 25485, 4620, 4540 };

	@OriginalMember(owner = "client!mia", name = "b", descriptor = "Lclient!us;")
	public static final Class344 aClass344_26 = new Class344(41, 3);

	@OriginalMember(owner = "client!mia", name = "d", descriptor = "[[I")
	public static final int[][] anIntArrayArray25 = new int[6][];

	@OriginalMember(owner = "client!mia", name = "e", descriptor = "[S")
	private static final short[] aShortArray26 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!mia", name = "g", descriptor = "[S")
	private static final short[] aShortArray27 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!mia", name = "f", descriptor = "[[S")
	public static final short[][] aShortArrayArray3 = new short[][] { aShortArray27, aShortArray25, aShortArray26 };

	@OriginalMember(owner = "client!mia", name = "h", descriptor = "Lclient!us;")
	public static final Class344 aClass344_27 = new Class344(46, 8);

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(IIIIIII)V")
	public static void method2697(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static647.method8666(arg2);
		@Pc(10) int local10 = 0;
		@Pc(14) int local14 = arg2 - arg0;
		if (local14 < 0) {
			local14 = 0;
		}
		@Pc(23) int local23 = arg2;
		@Pc(26) int local26 = -arg2;
		@Pc(28) int local28 = local14;
		@Pc(31) int local31 = -local14;
		@Pc(33) int local33 = -1;
		@Pc(35) int local35 = -1;
		@Pc(54) int local54;
		@Pc(62) int local62;
		@Pc(70) int local70;
		@Pc(81) int local81;
		if (arg4 >= Static246.anInt5506 && arg4 <= Static583.anInt9761) {
			@Pc(45) int[] local45 = Static104.anIntArrayArray24[arg4];
			local54 = Static429.method6586(arg5 - arg2, Static202.anInt4720, Static472.anInt6105);
			local62 = Static429.method6586(arg2 + arg5, Static202.anInt4720, Static472.anInt6105);
			local70 = Static429.method6586(arg5 - local14, Static202.anInt4720, Static472.anInt6105);
			local81 = Static429.method6586(arg5 + local14, Static202.anInt4720, Static472.anInt6105);
			Static580.method8027(local45, local70, local54, arg1);
			Static580.method8027(local45, local81, local70, arg3);
			Static580.method8027(local45, local62, local81, arg1);
		}
		while (local23 > local10) {
			local33 += 2;
			local35 += 2;
			local31 += local35;
			local26 += local33;
			if (local31 >= 0 && local28 >= 1) {
				local28--;
				local31 -= local28 << 1;
				Static506.anIntArray562[local28] = local10;
			}
			local10++;
			@Pc(194) int local194;
			@Pc(203) int local203;
			@Pc(210) int[] local210;
			@Pc(147) int local147;
			if (local26 >= 0) {
				local23--;
				local26 -= local23 << 1;
				local147 = arg4 - local23;
				local54 = local23 + arg4;
				if (local54 >= Static246.anInt5506 && local147 <= Static583.anInt9761) {
					if (local23 < local14) {
						local62 = Static506.anIntArray562[local23];
						local70 = Static429.method6586(local10 + arg5, Static202.anInt4720, Static472.anInt6105);
						local81 = Static429.method6586(arg5 - local10, Static202.anInt4720, Static472.anInt6105);
						local194 = Static429.method6586(arg5 + local62, Static202.anInt4720, Static472.anInt6105);
						local203 = Static429.method6586(arg5 - local62, Static202.anInt4720, Static472.anInt6105);
						if (Static583.anInt9761 >= local54) {
							local210 = Static104.anIntArrayArray24[local54];
							Static580.method8027(local210, local203, local81, arg1);
							Static580.method8027(local210, local194, local203, arg3);
							Static580.method8027(local210, local70, local194, arg1);
						}
						if (Static246.anInt5506 <= local147) {
							local210 = Static104.anIntArrayArray24[local147];
							Static580.method8027(local210, local203, local81, arg1);
							Static580.method8027(local210, local194, local203, arg3);
							Static580.method8027(local210, local70, local194, arg1);
						}
					} else {
						local62 = Static429.method6586(local10 + arg5, Static202.anInt4720, Static472.anInt6105);
						local70 = Static429.method6586(arg5 - local10, Static202.anInt4720, Static472.anInt6105);
						if (local54 <= Static583.anInt9761) {
							Static580.method8027(Static104.anIntArrayArray24[local54], local62, local70, arg1);
						}
						if (Static246.anInt5506 <= local147) {
							Static580.method8027(Static104.anIntArrayArray24[local147], local62, local70, arg1);
						}
					}
				}
			}
			local147 = arg4 - local10;
			local54 = local10 + arg4;
			if (local54 >= Static246.anInt5506 && Static583.anInt9761 >= local147) {
				local62 = arg5 + local23;
				local70 = arg5 - local23;
				if (local62 >= Static472.anInt6105 && local70 <= Static202.anInt4720) {
					local62 = Static429.method6586(local62, Static202.anInt4720, Static472.anInt6105);
					local70 = Static429.method6586(local70, Static202.anInt4720, Static472.anInt6105);
					if (local10 < local14) {
						local81 = local28 >= local10 ? local28 : Static506.anIntArray562[local10];
						local194 = Static429.method6586(arg5 + local81, Static202.anInt4720, Static472.anInt6105);
						local203 = Static429.method6586(arg5 - local81, Static202.anInt4720, Static472.anInt6105);
						if (Static583.anInt9761 >= local54) {
							local210 = Static104.anIntArrayArray24[local54];
							Static580.method8027(local210, local203, local70, arg1);
							Static580.method8027(local210, local194, local203, arg3);
							Static580.method8027(local210, local62, local194, arg1);
						}
						if (local147 >= Static246.anInt5506) {
							local210 = Static104.anIntArrayArray24[local147];
							Static580.method8027(local210, local203, local70, arg1);
							Static580.method8027(local210, local194, local203, arg3);
							Static580.method8027(local210, local62, local194, arg1);
						}
					} else {
						if (local54 <= Static583.anInt9761) {
							Static580.method8027(Static104.anIntArrayArray24[local54], local62, local70, arg1);
						}
						if (local147 >= Static246.anInt5506) {
							Static580.method8027(Static104.anIntArrayArray24[local147], local62, local70, arg1);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(I)V")
	public static void method2698() {
		@Pc(16) boolean local16 = Static281.aClass3_Sub15_Sub1_4.method8401() == 1;
		@Pc(20) int local20 = Static281.aClass3_Sub15_Sub1_4.method8424();
		Static631.anInt10399 = Static281.aClass3_Sub15_Sub1_4.method8401();
		@Pc(28) int local28 = Static281.aClass3_Sub15_Sub1_4.method8429();
		@Pc(32) int local32 = Static281.aClass3_Sub15_Sub1_4.method8414();
		Static588.method8071();
		Static13.method200(local20);
		Static281.aClass3_Sub15_Sub1_4.method2438();
		@Pc(46) int local46;
		@Pc(50) int local50;
		@Pc(57) int local57;
		for (@Pc(42) int local42 = 0; local42 < 4; local42++) {
			for (local46 = 0; local46 < Static394.anInt7540 >> 3; local46++) {
				for (local50 = 0; local50 < Static462.anInt8391 >> 3; local50++) {
					local57 = Static281.aClass3_Sub15_Sub1_4.method2432(1);
					if (local57 == 1) {
						Static27.anIntArrayArrayArray1[local42][local46][local50] = Static281.aClass3_Sub15_Sub1_4.method2432(26);
					} else {
						Static27.anIntArrayArrayArray1[local42][local46][local50] = -1;
					}
				}
			}
		}
		Static281.aClass3_Sub15_Sub1_4.method2440();
		local46 = (Static172.anInt4126 - Static281.aClass3_Sub15_Sub1_4.anInt10282) / 16;
		Static330.anIntArrayArray59 = new int[local46][4];
		for (local50 = 0; local50 < local46; local50++) {
			for (local57 = 0; local57 < 4; local57++) {
				Static330.anIntArrayArray59[local50][local57] = Static281.aClass3_Sub15_Sub1_4.method8402();
			}
		}
		Static330.anIntArray389 = new int[local46];
		Static63.aByteArrayArray3 = new byte[local46][];
		Static166.aByteArrayArray8 = new byte[local46][];
		Static492.anIntArray553 = new int[local46];
		Static231.anIntArray306 = null;
		Static507.anIntArray563 = new int[local46];
		Static89.aByteArrayArray4 = new byte[local46][];
		Static210.anIntArray279 = new int[local46];
		Static475.anIntArray531 = new int[local46];
		Static172.aByteArrayArray9 = null;
		Static378.aByteArrayArray14 = new byte[local46][];
		local46 = 0;
		for (local57 = 0; local57 < 4; local57++) {
			for (@Pc(185) int local185 = 0; local185 < Static394.anInt7540 >> 3; local185++) {
				for (@Pc(189) int local189 = 0; local189 < Static462.anInt8391 >> 3; local189++) {
					@Pc(199) int local199 = Static27.anIntArrayArrayArray1[local57][local185][local189];
					if (local199 != -1) {
						@Pc(209) int local209 = local199 >> 14 & 0x3FF;
						@Pc(215) int local215 = local199 >> 3 & 0x7FF;
						@Pc(225) int local225 = (local209 / 8 << 8) + local215 / 8;
						for (@Pc(227) int local227 = 0; local227 < local46; local227++) {
							if (local225 == Static475.anIntArray531[local227]) {
								local225 = -1;
								break;
							}
						}
						if (local225 != -1) {
							Static475.anIntArray531[local46] = local225;
							@Pc(264) int local264 = local225 >> 8 & 0xFF;
							@Pc(268) int local268 = local225 & 0xFF;
							Static210.anIntArray279[local46] = Static123.aClass181_28.method5033("m" + local264 + "_" + local268);
							Static330.anIntArray389[local46] = Static123.aClass181_28.method5033("l" + local264 + "_" + local268);
							Static507.anIntArray563[local46] = Static123.aClass181_28.method5033("um" + local264 + "_" + local268);
							Static492.anIntArray553[local46] = Static123.aClass181_28.method5033("ul" + local264 + "_" + local268);
							local46++;
						}
					}
				}
			}
		}
		Static610.method8290(local28, 11, local16, local32);
	}
}
