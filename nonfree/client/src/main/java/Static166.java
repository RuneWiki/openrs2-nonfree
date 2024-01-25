import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!ke", name = "f", descriptor = "Lclient!tq;")
	public static Class191 aClass191_103;

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "Z")
	public static boolean aBoolean298 = false;

	@OriginalMember(owner = "client!ke", name = "g", descriptor = "Z")
	public static boolean aBoolean299 = false;

	@OriginalMember(owner = "client!ke", name = "h", descriptor = "[I")
	public static final int[] anIntArray283 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(Z)V")
	public static void method3083() {
		if (Static221.aClass94_3 != null) {
			Static221.aClass94_3.method5975();
		}
		if (Static124.aClass94_2 != null) {
			Static124.aClass94_2.method5975();
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "([Lclient!p;BILclient!ae;[BZIIIIII)V")
	public static void method3084(@OriginalArg(0) Class151[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class4 arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(10) Class2_Sub10 local10 = new Class2_Sub10(arg3);
		@Pc(17) int local17 = -1;
		while (true) {
			@Pc(21) int local21 = local10.method4448();
			if (local21 == 0) {
				return;
			}
			local17 += local21;
			@Pc(32) int local32 = 0;
			while (true) {
				@Pc(36) int local36 = local10.method4441();
				if (local36 == 0) {
					break;
				}
				local32 += local36 - 1;
				@Pc(48) int local48 = local32 & 0x3F;
				@Pc(54) int local54 = local32 >> 6 & 0x3F;
				@Pc(58) int local58 = local32 >> 12;
				@Pc(62) int local62 = local10.method4421();
				@Pc(66) int local66 = local62 >> 2;
				@Pc(70) int local70 = local62 & 0x3;
				if (arg1 == local58 && local54 >= arg8 && arg8 + 8 > local54 && local48 >= arg5 && arg5 + 8 > local48) {
					@Pc(101) Class96 local101 = Static234.method4051(local17);
					@Pc(118) int local118 = Static180.method3293(arg6, local101.anInt3135, local70, local54 & 0x7, local48 & 0x7, local101.anInt3120) + arg7;
					@Pc(135) int local135 = arg10 + Static271.method4897(local54 & 0x7, arg6, local101.anInt3120, local48 & 0x7, local70, local101.anInt3135);
					if (local118 > 0 && local135 > 0 && Static95.anInt6381 - 1 > local118 && Static237.anInt4532 - 1 > local135) {
						@Pc(151) Class151 local151 = null;
						if (!arg4) {
							@Pc(155) int local155 = arg9;
							if ((Static313.aByteArrayArrayArray12[1][local118][local135] & 0x2) == 2) {
								local155 = arg9 - 1;
							}
							if (local155 >= 0) {
								local151 = arg0[local155];
							}
						}
						Static122.method3994(local66, local118, true, arg4, local17, local151, arg9, -1, arg9, arg2, local70 + arg6 & 0x3, local135);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IB)I")
	public static int method3085(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(24) int local24 = (local13 & 0x33333333) + ((local13 & 0xCCCCCCCD) >>> 2);
		@Pc(32) int local32 = (local24 >>> 4) + local24 & 0xF0F0F0F;
		@Pc(38) int local38 = local32 + (local32 >>> 8);
		@Pc(52) int local52 = local38 + (local38 >>> 16);
		return local52 & 0xFF;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILclient!rd;ILclient!dg;)V")
	public static void method3086(@OriginalArg(1) Class168 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub10 arg2) {
		@Pc(9) Class2_Sub37 local9 = new Class2_Sub37();
		local9.anInt5454 = arg2.method4421();
		local9.anInt5455 = arg2.method4444();
		local9.aClass193Array2 = new Class193[local9.anInt5454];
		local9.anIntArray403 = new int[local9.anInt5454];
		local9.anIntArray401 = new int[local9.anInt5454];
		local9.aByteArrayArrayArray8 = new byte[local9.anInt5454][][];
		local9.aClass193Array1 = new Class193[local9.anInt5454];
		local9.anIntArray399 = new int[local9.anInt5454];
		for (@Pc(55) int local55 = 0; local55 < local9.anInt5454; local55++) {
			try {
				@Pc(61) int local61 = arg2.method4421();
				@Pc(78) String local78;
				@Pc(82) String local82;
				@Pc(84) int local84;
				if (local61 == 0 || local61 == 1 || local61 == 2) {
					local78 = arg2.method4409();
					local82 = arg2.method4409();
					local84 = 0;
					if (local61 == 1) {
						local84 = arg2.method4444();
					}
					local9.anIntArray403[local55] = local61;
					local9.anIntArray401[local55] = local84;
					local9.aClass193Array1[local55] = arg0.method4835(local82, Static235.method4057(local78));
				} else if (local61 == 3 || local61 == 4) {
					local78 = arg2.method4409();
					local82 = arg2.method4409();
					local84 = arg2.method4421();
					@Pc(141) String[] local141 = new String[local84];
					for (@Pc(143) int local143 = 0; local143 < local84; local143++) {
						local141[local143] = arg2.method4409();
					}
					@Pc(158) byte[][] local158 = new byte[local84][];
					@Pc(171) int local171;
					if (local61 == 3) {
						for (@Pc(165) int local165 = 0; local165 < local84; local165++) {
							local171 = arg2.method4444();
							local158[local165] = new byte[local171];
							arg2.method4417(local158[local165], local171);
						}
					}
					local9.anIntArray403[local55] = local61;
					@Pc(196) Class[] local196 = new Class[local84];
					for (local171 = 0; local171 < local84; local171++) {
						local196[local171] = Static235.method4057(local141[local171]);
					}
					local9.aClass193Array2[local55] = arg0.method4833(local82, local196, Static235.method4057(local78));
					local9.aByteArrayArrayArray8[local55] = local158;
				}
			} catch (@Pc(231) ClassNotFoundException local231) {
				local9.anIntArray399[local55] = -1;
			} catch (@Pc(238) SecurityException local238) {
				local9.anIntArray399[local55] = -2;
			} catch (@Pc(245) NullPointerException local245) {
				local9.anIntArray399[local55] = -3;
			} catch (@Pc(252) Exception local252) {
				local9.anIntArray399[local55] = -4;
			} catch (@Pc(259) Throwable local259) {
				local9.anIntArray399[local55] = -5;
			}
		}
		Static240.aClass216_38.method5995(local9);
	}
}
