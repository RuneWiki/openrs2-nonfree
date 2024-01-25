import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!qh", name = "y", descriptor = "[I")
	public static int[] anIntArray386;

	@OriginalMember(owner = "client!qh", name = "A", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray39;

	@OriginalMember(owner = "client!qh", name = "D", descriptor = "I")
	public static int anInt5013;

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!bo;I)V")
	public static void method4466(@OriginalArg(0) Class25_Sub1_Sub1 arg0) {
		@Pc(5) boolean local5 = false;
		if (Static180.anInt3606 == arg0.anInt5291 || arg0.anInt5312 == -1 || arg0.anInt5263 != 0) {
			local5 = true;
		} else {
			@Pc(22) Class17 local22 = Static261.method4492(arg0.anInt5312);
			if (local22.aBoolean34 || local22.anIntArray26[arg0.anInt5285] < arg0.anInt5322 + 1) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(54) int local54 = arg0.anInt5291 - arg0.anInt5329;
			@Pc(59) int local59 = Static180.anInt3606 - arg0.anInt5329;
			@Pc(70) int local70 = arg0.anInt5259 * 128 + arg0.method4646() * 64;
			@Pc(82) int local82 = arg0.anInt5304 * 128 + arg0.method4646() * 64;
			@Pc(94) int local94 = arg0.anInt5297 * 128 + arg0.method4646() * 64;
			@Pc(106) int local106 = arg0.anInt5278 * 128 + arg0.method4646() * 64;
			arg0.anInt5769 = ((local54 - local59) * local70 + local94 * local59) / local54;
			arg0.anInt5773 = ((local54 - local59) * local82 + local106 * local59) / local54;
		}
		arg0.anInt5334 = 0;
		if (arg0.anInt5311 == 0) {
			arg0.method4648(8192);
		}
		if (arg0.anInt5311 == 1) {
			arg0.method4648(12288);
		}
		if (arg0.anInt5311 == 2) {
			arg0.method4648(0);
		}
		if (arg0.anInt5311 == 3) {
			arg0.method4648(4096);
		}
	}

	@OriginalMember(owner = "client!qh", name = "d", descriptor = "(B)V")
	public static void method4468() {
		Static187.aClass66_106.method1933();
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!en;Lclient!fs;IIIII)V")
	public static void method4469(@OriginalArg(0) Class59 arg0, @OriginalArg(1) Class25 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg3;
		@Pc(7) int local7 = arg3 + arg5;
		@Pc(11) int local11 = arg4 - 1;
		@Pc(15) int local15 = arg4 + arg6;
		for (@Pc(17) int local17 = arg2; local17 <= arg2 + 1; local17++) {
			if (local17 != Static248.anInt4820) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static12.anInt378) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static248.anInt4822 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg4 && local23 != arg3)) {
								@Pc(62) Class51 local62 = Static138.aClass51ArrayArrayArray1[local17][local23][local32];
								if (local62 != null) {
									@Pc(140) int local140 = (Static130.aClass3Array2[local17].method5638(local23, local32) + Static130.aClass3Array2[local17].method5638(local23 + 1, local32) + Static130.aClass3Array2[local17].method5638(local23, local32 + 1) + Static130.aClass3Array2[local17].method5638(local23 + 1, local32 + 1)) / 4 - (Static130.aClass3Array2[arg2].method5638(arg3, arg4) + Static130.aClass3Array2[arg2].method5638(arg3 + 1, arg4) + Static130.aClass3Array2[arg2].method5638(arg3, arg4 + 1) + Static130.aClass3Array2[arg2].method5638(arg3 + 1, arg4 + 1)) / 4;
									@Pc(143) Class25_Sub2 local143 = local62.aClass25_Sub2_1;
									@Pc(146) Class25_Sub2 local146 = local62.aClass25_Sub2_2;
									if (local143 != null && local143.method5585()) {
										arg1.method5584(local140, arg0, (local23 - arg3) * 128 + (1 - arg5) * 64, local143, (local32 - arg4) * 128 + (1 - arg6) * 64, local1);
									}
									if (local146 != null && local146.method5585()) {
										arg1.method5584(local140, arg0, (local23 - arg3) * 128 + (1 - arg5) * 64, local146, (local32 - arg4) * 128 + (1 - arg6) * 64, local1);
									}
									for (@Pc(219) Class103 local219 = local62.aClass103_1; local219 != null; local219 = local219.aClass103_2) {
										@Pc(223) Class25_Sub1 local223 = local219.aClass25_Sub1_1;
										if (local223 != null && local223.method5585() && (local23 == local223.aShort76 || local23 == local3) && (local32 == local223.aShort75 || local32 == local11)) {
											@Pc(252) int local252 = local223.aShort73 + 1 - local223.aShort76;
											@Pc(260) int local260 = local223.aShort74 + 1 - local223.aShort75;
											arg1.method5584(local140, arg0, (local223.aShort76 - arg3) * 128 + (local252 - arg5) * 64, local223, (local223.aShort75 - arg4) * 128 + (local260 - arg6) * 64, local1);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!qh", name = "e", descriptor = "(B)V")
	public static void method4471() {
		Static253.method4430();
		Static152.method2888();
		Static299.method5082();
		Static31.method762();
		Static51.method1136();
		Static336.method4720();
		Static34.method847();
		Static25.method609();
		Static119.method1596();
		Static350.method5772();
		Static140.method2613();
		Static342.method5677();
		Static19.method552();
		Static264.method2884();
		Static233.method3991();
		Static132.method2685();
		Static116.method2286();
		Static126.method2446();
		Static38.method878();
		Static230.method3967();
		Static333.method4069();
		Static333.method4066();
		Static233.method3989();
		Static21.aClass66_102.method1942();
		Static259.aClass66_57.method1942();
		Static95.aClass66_105.method1942();
		Static156.aClass66_54.method1942();
		Static223.aClass66_77.method1942();
	}
}
