import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!ck", name = "f", descriptor = "I")
	public static int anInt3166 = 0;

	@OriginalMember(owner = "client!ck", name = "h", descriptor = "I")
	public static int anInt3168 = 0;

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V")
	public static void method2697() {
		for (@Pc(7) int local7 = 0; local7 < Static58.anInt1391; local7++) {
			@Pc(13) int local13 = Static353.anIntArray677[local7]--;
			if (Static353.anIntArray677[local7] >= -10) {
				@Pc(94) Class110 local94 = Static332.aClass110Array1[local7];
				if (local94 == null) {
					local94 = Static362.method2217(Static330.aClass134_144, Static128.anIntArray341[local7], 0);
					if (local94 == null) {
						continue;
					}
					Static353.anIntArray677[local7] += local94.method2219();
					Static332.aClass110Array1[local7] = local94;
				}
				if (Static353.anIntArray677[local7] < 0) {
					@Pc(137) int local137;
					if (Static293.anIntArray569[local7] == 0) {
						local137 = Static85.anIntArray126[local7] * Static119.anInt2298 >> 8;
					} else {
						@Pc(147) int local147 = (Static293.anIntArray569[local7] & 0xFF) * 128;
						@Pc(155) int local155 = Static293.anIntArray569[local7] >> 16 & 0xFF;
						@Pc(165) int local165 = local155 * 128 + 64 - Static127.aClass10_Sub1_Sub2_Sub2_1.anInt6728;
						if (local165 < 0) {
							local165 = -local165;
						}
						@Pc(181) int local181 = Static293.anIntArray569[local7] >> 8 & 0xFF;
						@Pc(191) int local191 = local181 * 128 + 64 - Static127.aClass10_Sub1_Sub2_Sub2_1.anInt6726;
						if (local191 < 0) {
							local191 = -local191;
						}
						@Pc(202) int local202 = local191 + local165 - 128;
						if (local147 < local202) {
							Static353.anIntArray677[local7] = -100;
							continue;
						}
						if (local202 < 0) {
							local202 = 0;
						}
						local137 = Static142.anInt2788 * (local147 - local202) * Static85.anIntArray126[local7] / local147 >> 8;
					}
					if (local137 > 0) {
						@Pc(244) Class1_Sub20_Sub1 local244 = local94.method2216().method2073(Static49.aClass194_3);
						@Pc(249) Class1_Sub31_Sub1 local249 = Static366.method3889(local244, local137);
						local249.method3919(Static190.anIntArray377[local7] - 1);
						Static142.aClass1_Sub31_Sub2_1.method4448(local249);
					}
					Static353.anIntArray677[local7] = -100;
				}
			} else {
				Static58.anInt1391--;
				for (@Pc(29) int local29 = local7; local29 < Static58.anInt1391; local29++) {
					Static128.anIntArray341[local29] = Static128.anIntArray341[local29 + 1];
					Static332.aClass110Array1[local29] = Static332.aClass110Array1[local29 + 1];
					Static190.anIntArray377[local29] = Static190.anIntArray377[local29 + 1];
					Static353.anIntArray677[local29] = Static353.anIntArray677[local29 + 1];
					Static293.anIntArray569[local29] = Static293.anIntArray569[local29 + 1];
					Static85.anIntArray126[local29] = Static85.anIntArray126[local29 + 1];
				}
				local7--;
			}
		}
		if (Static92.aBoolean123 && !Static351.method3407()) {
			if (Static4.anInt39 != 0 && Static248.anInt28 != -1) {
				Static193.method3426(Static248.anInt28, Static4.anInt39, Static88.aClass134_38);
			}
			Static92.aBoolean123 = false;
		} else if (Static4.anInt39 != 0 && Static248.anInt28 != -1 && !Static351.method3407()) {
			Static305.aClass1_Sub21_Sub2_3.method5757(31);
			Static305.aClass1_Sub21_Sub2_3.method5702(Static248.anInt28);
			Static248.anInt28 = -1;
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!nj;B)V")
	public static void method2705(@OriginalArg(0) Class1_Sub21 arg0) {
		@Pc(9) int local9 = arg0.method5699();
		Static163.aClass158Array1 = new Class158[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static163.aClass158Array1[local14] = new Class158();
			Static163.aClass158Array1[local14].anInt4833 = arg0.method5699();
			Static163.aClass158Array1[local14].aString184 = arg0.method5745();
		}
		Static287.anInt5763 = arg0.method5699();
		Static222.anInt4708 = arg0.method5699();
		Static78.anInt1577 = arg0.method5699();
		Static168.aClass127_Sub1Array2 = new Class127_Sub1[Static222.anInt4708 + 1 - Static287.anInt5763];
		for (@Pc(62) int local62 = 0; local62 < Static78.anInt1577; local62++) {
			@Pc(70) int local70 = arg0.method5699();
			@Pc(78) Class127_Sub1 local78 = Static168.aClass127_Sub1Array2[local70] = new Class127_Sub1();
			local78.anInt6384 = arg0.method5720();
			local78.anInt6376 = arg0.method5716();
			local78.anInt6390 = Static287.anInt5763 + local70;
			local78.aString251 = arg0.method5745();
			local78.aString250 = arg0.method5745();
		}
		Static310.anInt6183 = arg0.method5716();
		Static220.aBoolean372 = true;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method2707(@OriginalArg(1) String arg0) {
		return Static137.method4967(10, arg0);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIIII)V")
	public static void method2711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static236.method4204(arg5);
		@Pc(10) int local10 = 0;
		@Pc(14) int local14 = arg5 - arg3;
		if (local14 < 0) {
			local14 = 0;
		}
		@Pc(23) int local23 = arg5;
		@Pc(26) int local26 = -arg5;
		@Pc(28) int local28 = local14;
		@Pc(31) int local31 = -local14;
		@Pc(33) int local33 = -1;
		@Pc(35) int local35 = -1;
		@Pc(39) int[] local39 = Static319.anIntArrayArray31[arg1];
		@Pc(44) int local44 = arg2 - local14;
		@Pc(49) int local49 = arg2 + local14;
		Static244.method5351(arg2 - arg5, local44, local39, arg4);
		Static244.method5351(local44, local49, local39, arg0);
		Static244.method5351(local49, arg2 + arg5, local39, arg4);
		while (local23 > local10) {
			local35 += 2;
			local33 += 2;
			local26 += local33;
			local31 += local35;
			if (local31 >= 0 && local28 >= 1) {
				Static318.anIntArray641[local28] = local10;
				local28--;
				local31 -= local28 << 1;
			}
			local10++;
			@Pc(128) int[] local128;
			@Pc(134) int[] local134;
			@Pc(138) int local138;
			@Pc(143) int local143;
			@Pc(182) int local182;
			@Pc(187) int local187;
			@Pc(192) int local192;
			if (local26 >= 0) {
				local23--;
				local26 -= local23 << 1;
				if (local14 <= local23) {
					local128 = Static319.anIntArrayArray31[local23 + arg1];
					local134 = Static319.anIntArrayArray31[arg1 - local23];
					local138 = local10 + arg2;
					local143 = arg2 - local10;
					Static244.method5351(local143, local138, local128, arg4);
					Static244.method5351(local143, local138, local134, arg4);
				} else {
					local128 = Static319.anIntArrayArray31[local23 + arg1];
					local134 = Static319.anIntArrayArray31[arg1 - local23];
					local138 = Static318.anIntArray641[local23];
					local143 = arg2 + local10;
					local182 = arg2 - local10;
					local187 = arg2 + local138;
					local192 = arg2 - local138;
					Static244.method5351(local182, local192, local128, arg4);
					Static244.method5351(local192, local187, local128, arg0);
					Static244.method5351(local187, local143, local128, arg4);
					Static244.method5351(local182, local192, local134, arg4);
					Static244.method5351(local192, local187, local134, arg0);
					Static244.method5351(local187, local143, local134, arg4);
				}
			}
			local128 = Static319.anIntArrayArray31[local10 + arg1];
			local134 = Static319.anIntArrayArray31[arg1 - local10];
			local138 = local23 + arg2;
			local143 = arg2 - local23;
			if (local10 < local14) {
				local182 = local10 <= local28 ? local28 : Static318.anIntArray641[local10];
				local187 = arg2 + local182;
				local192 = arg2 - local182;
				Static244.method5351(local143, local192, local128, arg4);
				Static244.method5351(local192, local187, local128, arg0);
				Static244.method5351(local187, local138, local128, arg4);
				Static244.method5351(local143, local192, local134, arg4);
				Static244.method5351(local192, local187, local134, arg0);
				Static244.method5351(local187, local138, local134, arg4);
			} else {
				Static244.method5351(local143, local138, local128, arg4);
				Static244.method5351(local143, local138, local134, arg4);
			}
		}
	}
}
