import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!lj", name = "v", descriptor = "I")
	public static int anInt9030;

	@OriginalMember(owner = "client!lj", name = "l", descriptor = "Lclient!im;")
	public static final Class140 aClass140_147 = new Class140(17, 3);

	@OriginalMember(owner = "client!lj", name = "o", descriptor = "[[I")
	public static final int[][] anIntArrayArray115 = new int[6][];

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIIB)V")
	public static void method7421(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static358.anInt8908 <= arg3 - arg1 && Static216.anInt4203 >= arg3 + arg1 && Static99.anInt1988 <= arg2 - arg1 && arg2 + arg1 <= Static205.anInt4042) {
			Static323.method5014(arg2, arg1, arg0, arg3);
		} else {
			Static315.method4926(arg3, arg2, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "(I)V")
	public static void method7423() {
		for (@Pc(7) int local7 = 0; local7 < Static545.anInt9167; local7++) {
			@Pc(13) int local13 = Static344.anIntArray616[local7];
			@Pc(21) Class49_Sub2_Sub2_Sub2 local21 = ((Class1_Sub17) Static380.aClass17_29.method738((long) local13)).aClass49_Sub2_Sub2_Sub2_2;
			@Pc(27) int local27 = Static97.aClass1_Sub6_Sub2_1.method3922();
			if ((local27 & 0x4) != 0) {
				local27 += Static97.aClass1_Sub6_Sub2_1.method3922() << 8;
			}
			@Pc(55) int local55;
			if ((local27 & 0x100) != 0) {
				local55 = Static97.aClass1_Sub6_Sub2_1.method3914();
				local21.anInt4276 = Static97.aClass1_Sub6_Sub2_1.method3922();
				local21.anInt4299 = Static97.aClass1_Sub6_Sub2_1.method3918();
				local21.anInt4321 = local55 & 0x7FFF;
				local21.aBoolean305 = (local55 & 0x8000) != 0;
				local21.anInt4280 = local21.anInt4276 + local21.anInt4321 + Static436.anInt6850;
			}
			if ((local27 & 0x20) != 0) {
				local21.anInt4345 = Static97.aClass1_Sub6_Sub2_1.method3914();
				local21.anInt4341 = Static97.aClass1_Sub6_Sub2_1.method3943();
			}
			@Pc(117) int local117;
			if ((local27 & 0x2) != 0) {
				local55 = Static97.aClass1_Sub6_Sub2_1.method3936();
				local117 = Static97.aClass1_Sub6_Sub2_1.method3941();
				local21.method3795(Static436.anInt6850, local117, local55);
				local21.anInt4279 = Static436.anInt6850 + 300;
				local21.anInt4311 = Static97.aClass1_Sub6_Sub2_1.method3922();
			}
			if ((local27 & 0x800) != 0) {
				local55 = Static97.aClass1_Sub6_Sub2_1.method3936();
				local117 = Static97.aClass1_Sub6_Sub2_1.method3912();
				local21.method3795(Static436.anInt6850, local117, local55);
			}
			if ((local27 & 0x1) != 0) {
				local21.aString40 = Static97.aClass1_Sub6_Sub2_1.method3954();
				local21.anInt4332 = 100;
			}
			if ((local27 & 0x40) != 0) {
				if (local21.aClass196_1.method4863()) {
					Static523.method7179(local21);
				}
				local21.method3802(Static538.aClass242_2.method5833(Static97.aClass1_Sub6_Sub2_1.method3943()));
				local21.method3793(local21.aClass196_1.anInt5718);
				local21.anInt4270 = local21.aClass196_1.anInt5710 << 3;
				if (local21.aClass196_1.method4863()) {
					Static174.method2614(local21.aByte98, 0, local21, local21.anIntArray427[0], null, null, local21.anIntArray428[0]);
				}
			}
			if ((local27 & 0x1000) != 0) {
				local55 = Static97.aClass1_Sub6_Sub2_1.method3918();
				@Pc(243) int[] local243 = new int[local55];
				@Pc(246) int[] local246 = new int[local55];
				@Pc(249) int[] local249 = new int[local55];
				for (@Pc(251) int local251 = 0; local251 < local55; local251++) {
					@Pc(257) int local257 = Static97.aClass1_Sub6_Sub2_1.method3916();
					if (local257 == 65535) {
						local257 = -1;
					}
					local243[local251] = local257;
					local246[local251] = Static97.aClass1_Sub6_Sub2_1.method3941();
					local249[local251] = Static97.aClass1_Sub6_Sub2_1.method3943();
				}
				Static263.method4383(local243, local249, local21, local246);
			}
			if ((local27 & 0x8) != 0) {
				local21.anInt4323 = Static97.aClass1_Sub6_Sub2_1.method3943();
				if (local21.anInt4323 == 65535) {
					local21.anInt4323 = -1;
				}
			}
			@Pc(339) int local339;
			if ((local27 & 0x2000) != 0) {
				local55 = Static97.aClass1_Sub6_Sub2_1.method3967();
				if (local55 == 65535) {
					local55 = -1;
				}
				local117 = Static97.aClass1_Sub6_Sub2_1.method3925();
				local339 = Static97.aClass1_Sub6_Sub2_1.method3918();
				local21.method3796(local117, true, local55, local339);
			}
			if ((local27 & 0x80) != 0) {
				local55 = Static97.aClass1_Sub6_Sub2_1.method3914();
				if (local55 == 65535) {
					local55 = -1;
				}
				local117 = Static97.aClass1_Sub6_Sub2_1.method3925();
				local339 = Static97.aClass1_Sub6_Sub2_1.method3918();
				local21.method3796(local117, false, local55, local339);
			}
			if ((local27 & 0x200) != 0) {
				local21.anInt4267 = Static97.aClass1_Sub6_Sub2_1.method3928();
				local21.anInt4285 = Static97.aClass1_Sub6_Sub2_1.method3910();
				local21.anInt4309 = Static97.aClass1_Sub6_Sub2_1.method3944();
				local21.anInt4320 = Static97.aClass1_Sub6_Sub2_1.method3928();
				local21.anInt4322 = Static97.aClass1_Sub6_Sub2_1.method3967() + Static436.anInt6850;
				local21.anInt4278 = Static97.aClass1_Sub6_Sub2_1.method3916() + Static436.anInt6850;
				local21.anInt4271 = Static97.aClass1_Sub6_Sub2_1.method3912();
				local21.anInt4339 = 0;
				local21.anInt4267 += local21.anIntArray428[0];
				local21.anInt4338 = 1;
				local21.anInt4320 += local21.anIntArray427[0];
				local21.anInt4285 += local21.anIntArray427[0];
				local21.anInt4309 += local21.anIntArray428[0];
			}
			if ((local27 & 0x400) != 0) {
				local21.aByte55 = Static97.aClass1_Sub6_Sub2_1.method3911();
				local21.aByte58 = Static97.aClass1_Sub6_Sub2_1.method3911();
				local21.aByte57 = Static97.aClass1_Sub6_Sub2_1.method3944();
				local21.aByte56 = (byte) Static97.aClass1_Sub6_Sub2_1.method3918();
				local21.anInt4261 = Static436.anInt6850 + Static97.aClass1_Sub6_Sub2_1.method3943();
				local21.anInt4326 = Static436.anInt6850 + Static97.aClass1_Sub6_Sub2_1.method3914();
			}
			if ((local27 & 0x10) != 0) {
				local55 = Static97.aClass1_Sub6_Sub2_1.method3967();
				if (local55 == 65535) {
					local55 = -1;
				}
				local117 = Static97.aClass1_Sub6_Sub2_1.method3941();
				Static341.method5169(local117, local55, local21);
			}
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIIBIII)V")
	public static void method7424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(19) int local19 = Static400.method6041(arg4, Static205.anInt4042, Static99.anInt1988);
		@Pc(25) int local25 = Static400.method6041(arg6, Static205.anInt4042, Static99.anInt1988);
		@Pc(31) int local31 = Static400.method6041(arg1, Static216.anInt4203, Static358.anInt8908);
		@Pc(37) int local37 = Static400.method6041(arg5, Static216.anInt4203, Static358.anInt8908);
		@Pc(46) int local46 = Static400.method6041(arg4 + arg3, Static205.anInt4042, Static99.anInt1988);
		@Pc(55) int local55 = Static400.method6041(arg6 - arg3, Static205.anInt4042, Static99.anInt1988);
		for (@Pc(57) int local57 = local19; local57 < local46; local57++) {
			Static424.method6216(local37, arg2, local31, Static447.anIntArrayArray99[local57]);
		}
		for (@Pc(77) int local77 = local25; local77 > local55; local77--) {
			Static424.method6216(local37, arg2, local31, Static447.anIntArrayArray99[local77]);
		}
		@Pc(103) int local103 = Static400.method6041(arg1 + arg3, Static216.anInt4203, Static358.anInt8908);
		@Pc(112) int local112 = Static400.method6041(arg5 - arg3, Static216.anInt4203, Static358.anInt8908);
		for (@Pc(114) int local114 = local46; local114 <= local55; local114++) {
			@Pc(120) int[] local120 = Static447.anIntArrayArray99[local114];
			Static424.method6216(local103, arg2, local31, local120);
			Static424.method6216(local112, arg0, local103, local120);
			Static424.method6216(local37, arg2, local112, local120);
		}
	}
}
