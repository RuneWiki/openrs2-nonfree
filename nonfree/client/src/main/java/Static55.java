import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!ea", name = "D", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!ea", name = "O", descriptor = "I")
	public static int anInt1219;

	@OriginalMember(owner = "client!ea", name = "r", descriptor = "[I")
	public static int[] anIntArray126 = new int[] { 1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1, 7, 0, 0, 6, 7, 0, 1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5 };

	@OriginalMember(owner = "client!ea", name = "s", descriptor = "[I")
	public static int[] anIntArray127 = new int[100];

	@OriginalMember(owner = "client!ea", name = "x", descriptor = "Lclient!qc;")
	public static Class135 aClass135_3 = new Class135(100);

	@OriginalMember(owner = "client!ea", name = "E", descriptor = "I")
	public static int anInt1210 = 0;

	@OriginalMember(owner = "client!ea", name = "S", descriptor = "Z")
	public static boolean aBoolean85 = false;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIII)Z")
	public static boolean method1039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static220.method3471(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << 7;
			@Pc(14) int local14 = arg2 << 7;
			return Static255.method3903(local10 + 1, anIntArrayArrayArray3[arg0][arg1][arg2] + arg3, local14 + 1) && Static255.method3903(local10 + 128 - 1, anIntArrayArrayArray3[arg0][arg1 + 1][arg2] + arg3, local14 + 1) && Static255.method3903(local10 + 128 - 1, anIntArrayArrayArray3[arg0][arg1 + 1][arg2 + 1] + arg3, local14 + 128 - 1) && Static255.method3903(local10 + 1, anIntArrayArrayArray3[arg0][arg1][arg2 + 1] + arg3, local14 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!cg;II)Ljava/lang/String;")
	public static String method1041(@OriginalArg(0) Class1_Sub11 arg0) {
		try {
			@Pc(7) int local7 = arg0.method2664();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(19) byte[] local19 = new byte[local7];
			arg0.anInt3264 += Static54.aClass158_1.method3913(arg0.aByteArray47, 0, arg0.anInt3264, local19, local7);
			return Static100.method1873(local7, local19, 0);
		} catch (@Pc(49) Exception local49) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZI)V")
	public static void method1042(@OriginalArg(0) boolean arg0) {
		@Pc(11) byte local11;
		@Pc(13) byte[][] local13;
		if (Static277.aBoolean412 && arg0) {
			local11 = 1;
			local13 = Static143.aByteArrayArray8;
		} else {
			local13 = Static39.aByteArrayArray5;
			local11 = 4;
		}
		@Pc(25) int[] local25 = null;
		for (@Pc(27) int local27 = 0; local27 < local11; local27++) {
			Static105.method1947();
			for (@Pc(38) int local38 = 0; local38 < 13; local38++) {
				for (@Pc(43) int local43 = 0; local43 < 13; local43++) {
					@Pc(48) boolean local48 = false;
					@Pc(56) int local56 = Static33.anIntArrayArrayArray2[local27][local38][local43];
					if (local56 != -1) {
						@Pc(67) int local67 = local56 >> 24 & 0x3;
						if (!arg0 || local67 == 0) {
							@Pc(81) int local81 = local56 >> 14 & 0x3FF;
							@Pc(87) int local87 = local56 >> 3 & 0x7FF;
							@Pc(93) int local93 = local56 >> 1 & 0x3;
							@Pc(103) int local103 = local87 / 8 + (local81 / 8 << 8);
							for (@Pc(105) int local105 = 0; local105 < Static24.anIntArray414.length; local105++) {
								if (Static24.anIntArray414[local105] == local103 && local13[local105] != null) {
									@Pc(144) int[] local144 = Static130.method2222(local27, Static88.aClass92Array1, local93, local43 * 8, local13[local105], arg0, local67, local38 * 8, local87, local81);
									local48 = true;
									if (local25 == null && local144 != null) {
										local25 = local144;
									}
									break;
								}
							}
						}
					}
					if (!local48) {
						Static246.method3816(local27, 8, 8, local38 * 8, local43 * 8);
					}
				}
			}
		}
		if (local25 == null) {
			Static170.anInt3639 = -1;
			return;
		}
		Static143.anInt3072 = local25[2];
		Static170.anInt3639 = local25[0];
		Static203.anInt4126 = local25[3];
		Static128.anInt2844 = local25[1];
		Static103.anInt2428 = local25[4];
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IILclient!km;I)[Lclient!pn;")
	public static Class1_Sub2_Sub11[] method1043(@OriginalArg(1) int arg0, @OriginalArg(2) Class91 arg1) {
		return Static240.method3698(0, arg0, arg1) ? Static115.method2093() : null;
	}
}
