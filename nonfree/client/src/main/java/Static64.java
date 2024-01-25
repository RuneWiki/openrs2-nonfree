import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!dh", name = "Q", descriptor = "I")
	public static int anInt1451;

	@OriginalMember(owner = "client!dh", name = "V", descriptor = "I")
	public static int anInt1456;

	@OriginalMember(owner = "client!dh", name = "N", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_30 = new Class265(62, -1);

	@OriginalMember(owner = "client!dh", name = "R", descriptor = "I")
	public static final int anInt1452 = 1338;

	@OriginalMember(owner = "client!dh", name = "U", descriptor = "I")
	public static int anInt1455 = 1;

	@OriginalMember(owner = "client!dh", name = "W", descriptor = "[I")
	public static final int[] anIntArray125 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(BLjava/lang/String;Z)V")
	public static void method1244(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return;
		}
		if (Static393.anInt6567 >= 100) {
			Static321.method4516(Static70.aClass209_39.method4562(Static388.anInt6533));
			return;
		}
		@Pc(31) String local31 = Static259.method3902(arg0);
		if (local31 == null) {
			return;
		}
		@Pc(74) String local74;
		for (@Pc(36) int local36 = 0; local36 < Static393.anInt6567; local36++) {
			@Pc(44) String local44 = Static259.method3902(Static367.aStringArray45[local36]);
			if (local44 != null && local44.equals(local31)) {
				Static321.method4516(arg0 + Static306.aClass209_125.method4562(Static388.anInt6533));
				return;
			}
			if (Static160.aStringArray31[local36] != null) {
				local74 = Static259.method3902(Static160.aStringArray31[local36]);
				if (local74 != null && local74.equals(local31)) {
					Static321.method4516(arg0 + Static306.aClass209_125.method4562(Static388.anInt6533));
					return;
				}
			}
		}
		for (@Pc(100) int local100 = 0; local100 < Static46.anInt861; local100++) {
			local74 = Static259.method3902(Static284.aStringArray35[local100]);
			if (local74 != null && local74.equals(local31)) {
				Static321.method4516(Static273.aClass209_112.method4562(Static388.anInt6533) + arg0 + Static216.aClass209_139.method4562(Static388.anInt6533));
				return;
			}
			if (Static297.aStringArray36[local100] != null) {
				@Pc(143) String local143 = Static259.method3902(Static297.aStringArray36[local100]);
				if (local143 != null && local143.equals(local31)) {
					Static321.method4516(Static273.aClass209_112.method4562(Static388.anInt6533) + arg0 + Static216.aClass209_139.method4562(Static388.anInt6533));
					return;
				}
			}
		}
		if (Static259.method3902(Static375.aClass3_Sub2_Sub1_Sub2_7.aString56).equals(local31)) {
			Static321.method4516(Static241.aClass209_109.method4562(Static388.anInt6533));
		} else {
			Static159.method2586(Static429.aClass54_94);
			Static424.aClass2_Sub23_Sub2_1.method5449(Static287.method4138(arg0) + 1);
			Static424.aClass2_Sub23_Sub2_1.method5496(arg0);
			Static424.aClass2_Sub23_Sub2_1.method5449(arg1 ? 1 : 0);
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IZ)V")
	public static void method1245(@OriginalArg(1) boolean arg0) {
		Static383.method5092(Static410.anInt6841, Static86.anInt4394, Static395.anInt6582, arg0);
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(I[IBII)V")
	public static void method1247(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg0--;
		@Pc(11) int local11 = arg2 - 1;
		@Pc(15) int local15 = local11 - 7;
		while (arg0 < local15) {
			@Pc(19) int local19 = arg0 + 1;
			arg1[local19] = arg3;
			@Pc(24) int local24 = local19 + 1;
			arg1[local24] = arg3;
			@Pc(29) int local29 = local24 + 1;
			arg1[local29] = arg3;
			@Pc(34) int local34 = local29 + 1;
			arg1[local34] = arg3;
			@Pc(39) int local39 = local34 + 1;
			arg1[local39] = arg3;
			@Pc(44) int local44 = local39 + 1;
			arg1[local44] = arg3;
			@Pc(49) int local49 = local44 + 1;
			arg1[local49] = arg3;
			arg0 = local49 + 1;
			arg1[arg0] = arg3;
		}
		while (local11 > arg0) {
			arg0++;
			arg1[arg0] = arg3;
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIIIIIIIIIIIZ)V")
	public static void method1248(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		if (Static58.aClass64Array1 == null) {
			return;
		}
		@Pc(18) Class3_Sub2_Sub1 local18;
		@Pc(14) int local14;
		if (arg6 >= 0) {
			local14 = arg6 - 1;
			local18 = Static174.aClass3_Sub2_Sub1_Sub1Array1[local14];
		} else {
			local14 = -arg6 - 1;
			if (local14 == Static399.anInt6656) {
				local18 = Static375.aClass3_Sub2_Sub1_Sub2_7;
			} else {
				local18 = Static74.aClass3_Sub2_Sub1_Sub2Array1[local14];
			}
		}
		if (local18 == null) {
			return;
		}
		@Pc(44) Class134 local44 = Static118.aClass165_2.method3799(arg3);
		@Pc(53) int local53;
		@Pc(56) int local56;
		if (arg7 == 1 || arg7 == 3) {
			local53 = local44.anInt3652;
			local56 = local44.anInt3670;
		} else {
			local56 = local44.anInt3652;
			local53 = local44.anInt3670;
		}
		@Pc(70) int local70 = (local53 >> 1) + arg12;
		@Pc(78) int local78 = (local53 + 1 >> 1) + arg12;
		@Pc(84) int local84 = arg2 + (local56 >> 1);
		@Pc(93) int local93 = arg2 + (local56 + 1 >> 1);
		@Pc(97) Class64 local97 = Static58.aClass64Array1[arg11];
		@Pc(120) int local120 = local97.l(local70, local84) + local97.l(local78, local84) + local97.l(local70, local93) + local97.l(local78, local93) >> 2;
		@Pc(124) Class2_Sub13 local124 = new Class2_Sub13();
		@Pc(129) int local129;
		if (arg10 > arg8) {
			local129 = arg10;
			arg10 = arg8;
			arg8 = local129;
		}
		local124.anInt2349 = arg12;
		local124.anInt2350 = Static131.anInt2821 + arg9;
		local124.anInt2342 = arg7;
		local124.anInt2347 = Static131.anInt2821 + arg0;
		local124.anInt2352 = arg2;
		local124.anInt2356 = arg1;
		local124.anInt2358 = local18.aByte89;
		local124.anInt2351 = arg3;
		local124.anInt2355 = arg12 + arg10;
		if (arg4 > arg5) {
			local129 = arg4;
			arg4 = arg5;
			arg5 = local129;
		}
		local124.anInt2357 = arg12 + arg8;
		local124.anInt2344 = local120;
		local124.anInt2348 = (local53 << 6) + (local124.anInt2349 << 7);
		local124.anInt2346 = (local56 << 6) + (local124.anInt2352 << 7);
		local124.anInt2359 = arg4 + arg2;
		local124.anInt2345 = arg5 + arg2;
		Static131.aClass14_25.method300(local124);
		local18.aClass2_Sub13_3 = local124;
	}
}
