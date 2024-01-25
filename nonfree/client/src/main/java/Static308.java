import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!lca", name = "n", descriptor = "Lclient!nr;")
	public static Class228 aClass228_2;

	@OriginalMember(owner = "client!lca", name = "c", descriptor = "S")
	public static short aShort65 = 1;

	@OriginalMember(owner = "client!lca", name = "i", descriptor = "Lclient!he;")
	public static final Class128 aClass128_19 = new Class128(16);

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(I)V")
	public static void method5205() {
		Static348.aClass6_Sub22_19.method3534(1, Static348.aClass6_Sub22_19.aClass15_Sub28_1);
		Static348.aClass6_Sub22_19.method3534(1, Static348.aClass6_Sub22_19.aClass15_Sub28_2);
		Static348.aClass6_Sub22_19.method3534(2, Static348.aClass6_Sub22_19.aClass15_Sub10_1);
		Static348.aClass6_Sub22_19.method3534(2, Static348.aClass6_Sub22_19.aClass15_Sub10_2);
		Static348.aClass6_Sub22_19.method3534(1, Static348.aClass6_Sub22_19.aClass15_Sub2_1);
		Static348.aClass6_Sub22_19.method3534(1, Static348.aClass6_Sub22_19.aClass15_Sub14_1);
		Static348.aClass6_Sub22_19.method3534(1, Static348.aClass6_Sub22_19.aClass15_Sub21_1);
		Static348.aClass6_Sub22_19.method3534(1, Static348.aClass6_Sub22_19.aClass15_Sub5_1);
		Static348.aClass6_Sub22_19.method3534(1, Static348.aClass6_Sub22_19.aClass15_Sub8_1);
		Static348.aClass6_Sub22_19.method3534(1, Static348.aClass6_Sub22_19.aClass15_Sub27_1);
		Static348.aClass6_Sub22_19.method3534(2, Static348.aClass6_Sub22_19.aClass15_Sub26_1);
		Static348.aClass6_Sub22_19.method3534(1, Static348.aClass6_Sub22_19.aClass15_Sub1_1);
		Static348.aClass6_Sub22_19.method3534(2, Static348.aClass6_Sub22_19.aClass15_Sub6_1);
		Static348.aClass6_Sub22_19.method3534(1, Static348.aClass6_Sub22_19.aClass15_Sub23_1);
		Static348.aClass6_Sub22_19.method3534(0, Static348.aClass6_Sub22_19.aClass15_Sub11_2);
		Static348.aClass6_Sub22_19.method3534(0, Static348.aClass6_Sub22_19.aClass15_Sub11_1);
		Static348.aClass6_Sub22_19.method3534(2, Static348.aClass6_Sub22_19.aClass15_Sub19_1);
		Static348.aClass6_Sub22_19.method3534(0, Static348.aClass6_Sub22_19.aClass15_Sub24_1);
		Static348.aClass6_Sub22_19.method3534(0, Static348.aClass6_Sub22_19.aClass15_Sub25_1);
		Static34.method4607();
		Static348.aClass6_Sub22_19.method3534(0, Static348.aClass6_Sub22_19.aClass15_Sub16_1);
		Static348.aClass6_Sub22_19.method3534(4, Static348.aClass6_Sub22_19.aClass15_Sub13_1);
		Static499.method7443();
		Static245.method5548();
		Static585.aBoolean670 = true;
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(I[BI)[B")
	public static byte[] method5206(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(11) byte[] local11 = new byte[arg0];
		Static655.method5836(arg1, 0, local11, 0, arg0);
		return local11;
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(IB)[B")
	public static byte[] method5207(@OriginalArg(0) int arg0) {
		@Pc(12) Class6_Sub2_Sub21 local12 = (Class6_Sub2_Sub21) Static590.aClass195_5.method5381((long) arg0);
		if (local12 == null) {
			@Pc(17) byte[] local17 = new byte[512];
			@Pc(23) Random local23 = new Random((long) arg0);
			for (@Pc(25) int local25 = 0; local25 < 255; local25++) {
				local17[local25] = (byte) local25;
			}
			for (@Pc(38) int local38 = 0; local38 < 255; local38++) {
				@Pc(44) int local44 = 255 - local38;
				@Pc(49) int local49 = Static588.method8281(local23, local44);
				@Pc(53) byte local53 = local17[local49];
				local17[local49] = local17[local44];
				local17[local44] = local17[511 - local38] = local53;
			}
			local12 = new Class6_Sub2_Sub21(local17);
			Static590.aClass195_5.method5384((long) arg0, local12);
		}
		return local12.aByteArray120;
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(ILclient!vd;I)Lclient!hia;")
	public static Class133 method5208(@OriginalArg(0) int arg0, @OriginalArg(1) Class353 arg1) {
		@Pc(14) byte[] local14 = arg1.method8419(arg0);
		return local14 == null ? null : new Class133(local14);
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(Lclient!ns;IIII)V")
	public static void method5209(@OriginalArg(0) Class20_Sub2_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(13) Class201 local13 = arg0.method4911();
		@Pc(23) int local23 = arg0.anInt5541 - arg0.aClass278_7.anInt8287 & 0x3FFF;
		if (arg2 == -1) {
			if (local23 != 0 || arg0.anInt5526 > 25) {
				if (arg1 < 0 && local13.anInt6335 != -1) {
					arg0.anInt5571 = local13.anInt6335;
					arg0.aBoolean375 = false;
				} else if (arg1 <= 0 || local13.anInt6322 == -1) {
					arg0.anInt5571 = local13.anInt6352;
				} else {
					arg0.anInt5571 = local13.anInt6322;
				}
				arg0.aBoolean375 = false;
			} else if (!arg0.aBoolean375 || !local13.method5478(arg0.anInt5571)) {
				arg0.anInt5571 = local13.method5479();
				arg0.aBoolean375 = arg0.anInt5571 != -1;
			}
		} else if (arg0.anInt5572 != -1 && (local23 >= 10240 || local23 <= 2048)) {
			@Pc(210) int local210 = Static22.anIntArray16[arg3] - arg0.aClass278_7.anInt8287 & 0x3FFF;
			if (arg2 == 2 && local13.anInt6319 != -1) {
				if (local210 > 2048 && local210 <= 6144 && local13.anInt6334 != -1) {
					arg0.anInt5571 = local13.anInt6334;
				} else if (local210 >= 10240 && local210 < 14336 && local13.anInt6324 != -1) {
					arg0.anInt5571 = local13.anInt6324;
				} else if (local210 <= 6144 || local210 >= 10240 || local13.anInt6339 == -1) {
					arg0.anInt5571 = local13.anInt6319;
				} else {
					arg0.anInt5571 = local13.anInt6339;
				}
			} else if (arg2 == 0 && local13.anInt6338 != -1) {
				if (local210 > 2048 && local210 <= 6144 && local13.anInt6317 != -1) {
					arg0.anInt5571 = local13.anInt6317;
				} else if (local210 >= 10240 && local210 < 14336 && local13.anInt6337 != -1) {
					arg0.anInt5571 = local13.anInt6337;
				} else if (local210 <= 6144 || local210 >= 10240 || local13.anInt6350 == -1) {
					arg0.anInt5571 = local13.anInt6338;
				} else {
					arg0.anInt5571 = local13.anInt6350;
				}
			} else if (local210 > 2048 && local210 <= 6144 && local13.anInt6321 != -1) {
				arg0.anInt5571 = local13.anInt6321;
			} else if (local210 >= 10240 && local210 < 14336 && local13.anInt6320 != -1) {
				arg0.anInt5571 = local13.anInt6320;
			} else if (local210 <= 6144 || local210 >= 10240 || local13.anInt6311 == -1) {
				arg0.anInt5571 = local13.anInt6352;
			} else {
				arg0.anInt5571 = local13.anInt6311;
			}
			arg0.aBoolean375 = false;
		} else if (local23 == 0 && arg0.anInt5526 <= 25) {
			if (arg2 == 2 && local13.anInt6319 != -1) {
				arg0.anInt5571 = local13.anInt6319;
			} else if (arg2 == 0 && local13.anInt6338 != -1) {
				arg0.anInt5571 = local13.anInt6338;
			} else {
				arg0.anInt5571 = local13.anInt6352;
			}
			arg0.aBoolean375 = false;
		} else {
			if (arg2 == 2 && local13.anInt6319 != -1) {
				if (arg1 < 0 && local13.anInt6331 != -1) {
					arg0.anInt5571 = local13.anInt6331;
				} else if (arg1 <= 0 || local13.anInt6312 == -1) {
					arg0.anInt5571 = local13.anInt6319;
				} else {
					arg0.anInt5571 = local13.anInt6312;
				}
			} else if (arg2 == 0 && local13.anInt6338 != -1) {
				if (arg1 < 0 && local13.anInt6342 != -1) {
					arg0.anInt5571 = local13.anInt6342;
				} else if (arg1 <= 0 || local13.anInt6332 == -1) {
					arg0.anInt5571 = local13.anInt6338;
				} else {
					arg0.anInt5571 = local13.anInt6332;
				}
			} else if (arg1 < 0 && local13.anInt6314 != -1) {
				arg0.anInt5571 = local13.anInt6314;
			} else if (arg1 <= 0 || local13.anInt6330 == -1) {
				arg0.anInt5571 = local13.anInt6352;
			} else {
				arg0.anInt5571 = local13.anInt6330;
			}
			arg0.aBoolean375 = false;
		}
	}
}
