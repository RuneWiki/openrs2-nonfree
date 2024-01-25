import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!ik", name = "d", descriptor = "Lclient!bca;")
	public static Class30 aClass30_8;

	@OriginalMember(owner = "client!ik", name = "e", descriptor = "[C")
	public static final char[] aCharArray1 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(III)I")
	public static int method4516(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(41) int local41 = Static375.method3044(arg0 - 1, arg1 - 1) + Static375.method3044(arg0 + 1, arg1 + -1) + Static375.method3044(arg0 - 1, arg1 + 1) + Static375.method3044(arg0 - -1, arg1 - -1);
		@Pc(71) int local71 = Static375.method3044(arg0 - 1, arg1) + Static375.method3044(arg0 + 1, arg1) + Static375.method3044(arg0, arg1 - 1) + Static375.method3044(arg0, arg1 + 1);
		@Pc(76) int local76 = Static375.method3044(arg0, arg1);
		return local76 / 4 + local71 / 8 + local41 / 16;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZLclient!vaa;[[B)V")
	public static void method4517(@OriginalArg(1) Class322_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(20) int local20;
		@Pc(24) int local24;
		@Pc(34) int local34;
		@Pc(44) int local44;
		for (@Pc(14) int local14 = 0; local14 < arg0.anInt10425; local14++) {
			Static293.method5263();
			for (local20 = 0; local20 < Static47.anInt1794 >> 3; local20++) {
				for (local24 = 0; local24 < Static209.anInt4742 >> 3; local24++) {
					local34 = Static277.anIntArrayArrayArray11[local14][local20][local24];
					if (local34 != -1) {
						local44 = local34 >> 24 & 0x3;
						if (!arg0.aBoolean715 || local44 == 0) {
							@Pc(55) int local55 = local34 >> 1 & 0x3;
							@Pc(61) int local61 = local34 >> 14 & 0x3FF;
							@Pc(67) int local67 = local34 >> 3 & 0x7FF;
							@Pc(78) int local78 = (local61 / 8 << 8) + (local67 / 8);
							for (@Pc(80) int local80 = 0; local80 < Static431.anIntArray533.length; local80++) {
								if (Static431.anIntArray533[local80] == local78 && arg1[local80] != null) {
									@Pc(102) Class2_Sub11 local102 = new Class2_Sub11(arg1[local80]);
									arg0.method8701(local20 * 8, local14, local102, local67, local24 * 8, local61, Static55.aClass104Array3, local55, local44);
									arg0.method8713(local102, local67, local61, local20 * 8, local14, local55, local24 * 8, Static186.aClass20_4, local12[0] == -1 ? local12 : null, local44);
									break;
								}
							}
						}
					}
				}
			}
		}
		for (local20 = 0; local20 < arg0.anInt10425; local20++) {
			Static293.method5263();
			for (local24 = 0; local24 < Static47.anInt1794 >> 3; local24++) {
				for (local34 = 0; local34 < Static209.anInt4742 >> 3; local34++) {
					local44 = Static277.anIntArrayArrayArray11[local20][local24][local34];
					if (local44 == -1) {
						arg0.method8695(local24 * 8, 8, local34 * 8, 8, local20);
					}
				}
			}
		}
		if (local12[0] != -1) {
			Static566.aClass376_1 = Static227.aClass190_1.method5492(local12[2], local12[3], local12[1], Static371.aClass137_1, local12[0]);
			Static454.anInt8397 = local12[4];
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)V")
	public static void method4518() {
		Static205.aClass169_28.method5006();
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIILclient!un;Lclient!un;)V")
	public static void method4520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class3_Sub1_Sub2 arg3, @OriginalArg(4) Class3_Sub1_Sub2 arg4) {
		@Pc(4) Class100 local4 = Static633.method9184(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass3_Sub1_Sub2_1 = arg3;
		local4.aClass3_Sub1_Sub2_2 = arg4;
		@Pc(19) int local19 = Static9.aClass65Array1 == Static103.aClass65Array3 ? 1 : 0;
		if (!arg3.method8600()) {
			arg3.aClass3_Sub1_23 = Static359.aClass3_Sub1Array94[local19];
			Static359.aClass3_Sub1Array94[local19] = arg3;
		} else if (arg3.method8601()) {
			arg3.aClass3_Sub1_23 = Static548.aClass3_Sub1Array129[local19];
			Static548.aClass3_Sub1Array129[local19] = arg3;
		} else {
			arg3.aClass3_Sub1_23 = Static124.aClass3_Sub1Array151[local19];
			Static124.aClass3_Sub1Array151[local19] = arg3;
			Static240.aBoolean380 = true;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method8600()) {
			if (arg4.method8601()) {
				arg4.aClass3_Sub1_23 = Static548.aClass3_Sub1Array129[local19];
				Static548.aClass3_Sub1Array129[local19] = arg4;
				return;
			}
			arg4.aClass3_Sub1_23 = Static124.aClass3_Sub1Array151[local19];
			Static124.aClass3_Sub1Array151[local19] = arg4;
			Static240.aBoolean380 = true;
			return;
		}
		arg4.aClass3_Sub1_23 = Static359.aClass3_Sub1Array94[local19];
		Static359.aClass3_Sub1Array94[local19] = arg4;
	}
}
