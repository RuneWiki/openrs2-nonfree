import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!qi", name = "g", descriptor = "F")
	public static float aFloat46 = 0.0F;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V")
	public static void method3758() {
		Static80.aClass157_13.method4027();
		Static81.aClass157_15.method4027();
		Static163.aClass157_31.method4027();
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Ljava/lang/String;CB)I")
	public static int method3760(@OriginalArg(0) String arg0, @OriginalArg(1) char arg1) {
		@Pc(12) int local12 = 0;
		@Pc(15) int local15 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			if (arg1 == arg0.charAt(local17)) {
				local12++;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIIIII)Z")
	public static boolean method3761(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
			return false;
		} else {
			@Pc(59) int local59 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
			@Pc(75) int local75 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
			@Pc(91) int local91 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
			return local59 * local91 > 0 && local91 * local75 > 0;
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)Lclient!hj;")
	public static Class2_Sub8_Sub8 method3762(@OriginalArg(1) int arg0) {
		@Pc(15) Class2_Sub8_Sub8 local15 = (Class2_Sub8_Sub8) Static277.aClass106_13.method2986((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(29) byte[] local29;
		if (arg0 < 32768) {
			local29 = Static229.aClass42_71.method1256(1, arg0);
		} else {
			local29 = Static4.aClass42_1.method1256(1, arg0 & 0x7FFF);
		}
		local15 = new Class2_Sub8_Sub8();
		if (local29 != null) {
			local15.method1875(new Class2_Sub16(local29));
		}
		if (arg0 >= 32768) {
			local15.method1864();
		}
		Static277.aClass106_13.method2990((long) arg0, local15);
		return local15;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
	public static void method3763() {
		@Pc(8) int local8 = Static189.aByteArrayArray10.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (Static189.aByteArrayArray10[local10] != null) {
				@Pc(23) int local23 = -1;
				for (@Pc(25) int local25 = 0; local25 < Static222.anInt4530; local25++) {
					if (Static206.anIntArray425[local25] == Static253.anIntArray485[local10]) {
						local23 = local25;
						break;
					}
				}
				if (local23 == -1) {
					Static206.anIntArray425[Static222.anInt4530] = Static253.anIntArray485[local10];
					local23 = Static222.anInt4530++;
				}
				@Pc(65) int local65 = 0;
				@Pc(72) Class2_Sub16 local72 = new Class2_Sub16(Static189.aByteArrayArray10[local10]);
				while (local72.anInt2789 < Static189.aByteArrayArray10[local10].length && local65 < 511 && Static57.anInt1448 < 1023) {
					@Pc(100) int local100 = local65++ << 6 | local23;
					@Pc(104) int local104 = local72.method2130();
					@Pc(110) int local110 = local104 >> 7 & 0x3F;
					@Pc(114) int local114 = local104 >> 14;
					@Pc(127) int local127 = local110 + (Static253.anIntArray485[local10] >> 8) * 64 - Static160.anInt5159;
					@Pc(131) int local131 = local104 & 0x3F;
					@Pc(143) int local143 = local131 + (Static253.anIntArray485[local10] & 0xFF) * 64 - Static234.anInt4705;
					@Pc(149) Class188 local149 = Static60.method1158(local72.method2130());
					if (Static35.aClass15_Sub2_Sub1Array2[local100] == null && (local149.aByte29 & 0x1) > 0 && Static194.anInt4082 == local114 && local127 >= 0 && local127 + local149.anInt5867 < 104 && local143 >= 0 && local149.anInt5867 + local143 < 104) {
						Static35.aClass15_Sub2_Sub1Array2[local100] = new Class15_Sub2_Sub1();
						@Pc(194) Class15_Sub2_Sub1 local194 = Static35.aClass15_Sub2_Sub1Array2[local100];
						Static89.anIntArray194[Static57.anInt1448++] = local100;
						local194.anInt5378 = Static268.anInt5236;
						local194.method633(local149);
						local194.method4285(local194.aClass188_1.anInt5867);
						local194.anInt5313 = local194.anInt5373 = Static75.anIntArray158[local194.aClass188_1.aByte26];
						local194.anInt5307 = local194.aClass188_1.anInt5856;
						local194.anInt5338 = local194.aClass188_1.anInt5849;
						if (local194.anInt5307 == 0) {
							local194.anInt5373 = 0;
						}
						local194.method4287(local127, local143, true, local194.method4286());
					}
				}
			}
		}
	}
}
