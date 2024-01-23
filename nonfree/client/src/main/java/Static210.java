import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "Lclient!ui;")
	public static Class175 aClass175_33 = new Class175(64);

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
	public static int anInt4011 = 0;

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
	public static int anInt4012 = -1;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IB)[B")
	public static byte[] method3472(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub5_Sub20 local8 = (Class1_Sub5_Sub20) Static66.aClass112_3.method2951((long) arg0);
		if (local8 == null) {
			@Pc(26) Random local26 = new Random((long) arg0);
			@Pc(29) byte[] local29 = new byte[512];
			@Pc(31) int local31;
			for (local31 = 0; local31 < 255; local31++) {
				local29[local31] = (byte) local31;
			}
			for (local31 = 0; local31 < 255; local31++) {
				@Pc(54) int local54 = 255 - local31;
				@Pc(59) int local59 = Static118.method2140(local26, local54);
				@Pc(63) byte local63 = local29[local59];
				local29[local59] = local29[local54];
				local29[local54] = local29[511 - local31] = local63;
			}
			local8 = new Class1_Sub5_Sub20(local29);
			Static66.aClass112_3.method2950((long) arg0, local8);
		}
		return local8.aByteArray154;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)Lclient!rf;")
	public static Class144 method3473(@OriginalArg(0) int arg0) {
		@Pc(10) Class144 local10 = (Class144) Static183.aClass175_29.method4295((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28 = Static238.aClass119_66.method3235(arg0, 29);
		local10 = new Class144();
		if (local28 != null) {
			local10.method3824(new Class1_Sub13(local28), arg0);
		}
		Static183.aClass175_29.method4285(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!pb;IIIIIIZ)V")
	public static void method3474(@OriginalArg(0) Class131 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		@Pc(3) int local3 = arg0.anIntArray422.length;
		@Pc(5) int local5;
		@Pc(15) int local15;
		@Pc(22) int local22;
		@Pc(29) int local29;
		@Pc(39) int local39;
		for (local5 = 0; local5 < local3; local5++) {
			local15 = arg0.anIntArray422[local5] - Static156.anInt3124;
			local22 = arg0.anIntArray424[local5] - Static215.anInt4033;
			local29 = arg0.anIntArray426[local5] - Static292.anInt5278;
			local39 = local29 * arg3 + local15 * arg4 >> 16;
			@Pc(49) int local49 = local29 * arg4 - local15 * arg3 >> 16;
			@Pc(61) int local61 = local22 * arg2 - local49 * arg1 >> 16;
			@Pc(71) int local71 = local22 * arg1 + local49 * arg2 >> 16;
			if (local71 < 50) {
				return;
			}
			if (arg0.anIntArray430 != null) {
				Static208.anIntArray431[local5] = local39;
				Static208.anIntArray427[local5] = local61;
				Static208.anIntArray421[local5] = local71;
			}
			Static208.anIntArray425[local5] = Static119.anInt2423 + (local39 << 9) / local71;
			Static208.anIntArray434[local5] = Static119.anInt2427 + (local61 << 9) / local71;
		}
		Static119.anInt2426 = 0;
		local3 = arg0.anIntArray423.length;
		for (local5 = 0; local5 < local3; local5++) {
			local15 = arg0.anIntArray423[local5];
			local22 = arg0.anIntArray428[local5];
			local29 = arg0.anIntArray435[local5];
			local39 = Static208.anIntArray425[local15];
			@Pc(148) int local148 = Static208.anIntArray425[local22];
			@Pc(152) int local152 = Static208.anIntArray425[local29];
			@Pc(156) int local156 = Static208.anIntArray434[local15];
			@Pc(160) int local160 = Static208.anIntArray434[local22];
			@Pc(164) int local164 = Static208.anIntArray434[local29];
			if ((local39 - local148) * (local164 - local160) - (local156 - local160) * (local152 - local148) > 0) {
				if (Static47.aBoolean102 && Static124.method567(Static255.anInt4767 + Static119.anInt2423, Static4.anInt170 + Static119.anInt2427, local156, local160, local164, local39, local148, local152)) {
					Static289.anInt5260 = arg5;
					Static289.anInt5251 = arg6;
				}
				if (!Static71.aBoolean165 && !arg7) {
					Static119.aBoolean209 = false;
					if (local39 < 0 || local148 < 0 || local152 < 0 || local39 > Static119.anInt2425 || local148 > Static119.anInt2425 || local152 > Static119.anInt2425) {
						Static119.aBoolean209 = true;
					}
					if (arg0.anIntArray430 == null || arg0.anIntArray430[local5] == -1) {
						if (arg0.anIntArray432[local5] != 12345678) {
							Static119.method2161(local156, local160, local164, local39, local148, local152, arg0.anIntArray432[local5], arg0.anIntArray433[local5], arg0.anIntArray429[local5]);
						}
					} else if (!Static142.aBoolean243) {
						@Pc(373) int local373 = Static119.anInterface5_1.method1486(arg0.anIntArray430[local5]);
						Static119.method2161(local156, local160, local164, local39, local148, local152, Static17.method270(local373, arg0.anIntArray432[local5]), Static17.method270(local373, arg0.anIntArray433[local5]), Static17.method270(local373, arg0.anIntArray429[local5]));
					} else if (arg0.aBoolean352) {
						Static119.method2149(local156, local160, local164, local39, local148, local152, arg0.anIntArray432[local5], arg0.anIntArray433[local5], arg0.anIntArray429[local5], Static208.anIntArray431[0], Static208.anIntArray431[1], Static208.anIntArray431[3], Static208.anIntArray427[0], Static208.anIntArray427[1], Static208.anIntArray427[3], Static208.anIntArray421[0], Static208.anIntArray421[1], Static208.anIntArray421[3], arg0.anIntArray430[local5]);
					} else {
						Static119.method2149(local156, local160, local164, local39, local148, local152, arg0.anIntArray432[local5], arg0.anIntArray433[local5], arg0.anIntArray429[local5], Static208.anIntArray431[local15], Static208.anIntArray431[local22], Static208.anIntArray431[local29], Static208.anIntArray427[local15], Static208.anIntArray427[local22], Static208.anIntArray427[local29], Static208.anIntArray421[local15], Static208.anIntArray421[local22], Static208.anIntArray421[local29], arg0.anIntArray430[local5]);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIII)I")
	public static int method3476(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(14) int local14 = arg1 / arg0;
		@Pc(20) int local20 = arg1 & arg0 - 1;
		@Pc(26) int local26 = arg0 - 1 & arg2;
		@Pc(30) int local30 = arg2 / arg0;
		@Pc(35) int local35 = Static99.method1924(local30, local14);
		@Pc(42) int local42 = Static99.method1924(local30, local14 + 1);
		@Pc(49) int local49 = Static99.method1924(local30 + 1, local14);
		@Pc(58) int local58 = Static99.method1924(local30 + 1, local14 - -1);
		@Pc(65) int local65 = Static4.method72(local20, local42, local35, arg0);
		@Pc(72) int local72 = Static4.method72(local20, local58, local49, arg0);
		return Static4.method72(local26, local72, local65, arg0);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)V")
	public static void method3477(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static47.aBoolean102 = true;
		Static273.anInt5034 = arg0;
		Static255.anInt4767 = arg1;
		Static4.anInt170 = arg2;
		Static289.anInt5260 = -1;
		Static289.anInt5251 = -1;
	}
}
