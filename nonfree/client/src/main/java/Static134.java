import java.security.MessageDigest;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!nd", name = "q", descriptor = "I")
	public static int anInt3026;

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1061 = Static64.method1101("<col=ff9040>");

	@OriginalMember(owner = "client!nd", name = "k", descriptor = "Lclient!w;")
	public static Class123 aClass123_8 = new Class123(128);

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)V")
	public static void method2401() {
		Static73.aByteArrayArray4 = null;
		Static152.anIntArray225 = null;
		Static65.anIntArray98 = null;
		Static52.anIntArray74 = null;
		Static51.anIntArray72 = null;
		Static89.anIntArray85 = null;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIIZIII)V")
	public static void method2402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg6 + arg0;
		@Pc(14) int local14 = arg1 - arg6;
		@Pc(18) int local18 = arg5 + arg6;
		for (@Pc(20) int local20 = arg0; local20 < local9; local20++) {
			Static71.method1261(Static113.anIntArrayArray10[local20], arg5, arg2, arg3);
		}
		@Pc(39) int local39 = arg3 - arg6;
		for (@Pc(41) int local41 = arg1; local41 > local14; local41--) {
			Static71.method1261(Static113.anIntArrayArray10[local41], arg5, arg2, arg3);
		}
		for (@Pc(66) int local66 = local9; local66 <= local14; local66++) {
			@Pc(72) int[] local72 = Static113.anIntArrayArray10[local66];
			Static71.method1261(local72, arg5, arg2, local18);
			Static71.method1261(local72, local18, arg4, local39);
			Static71.method1261(local72, local39, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!ia;I)Z")
	public static boolean method2404(@OriginalArg(0) Class51 arg0) {
		try {
			@Pc(10) int local10 = arg0.method1419();
			if (local10 == -1) {
				return false;
			}
			@Pc(22) Class51 local22 = arg0.method1433(0, local10);
			@Pc(31) Class51 local31 = arg0.method1394(local10 + 1);
			@Pc(34) MessageDigest local34 = MessageDigest.getInstance("SHA");
			local34.reset();
			local34.update(local22.method1387());
			@Pc(49) byte[] local49 = local34.digest();
			@Pc(53) byte[] local53 = local31.method1396();
			@Pc(58) Class1_Sub16 local58 = new Class1_Sub16(5000);
			local58.method3774(local53.length, local53);
			local58.anInt4860 = 0;
			local58.method3814(Static195.aBigInteger5, Static200.aBigInteger6);
			if (local58.aByteArray62[0] != 1) {
				return false;
			}
			for (@Pc(85) int local85 = 0; local85 < 20; local85++) {
				if (local49[local85] != local58.aByteArray62[local85 + 1]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(106) Exception local106) {
			return false;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIILclient!fc;IIZLclient!ei;IIIIII)Lclient!ei;")
	public static Class5_Sub2 method2406(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class40 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) Class5_Sub2 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		@Pc(24) long local24 = (long) ((arg2 << 24) + (arg1 << 16) + arg9) + ((long) arg0 << 32) + ((long) arg8 << 48);
		@Pc(30) Class5_Sub2 local30 = (Class5_Sub2) Static204.aClass53_26.method1501(local24);
		@Pc(105) int local105;
		@Pc(111) int local111;
		@Pc(117) int local117;
		@Pc(121) int local121;
		@Pc(152) int local152;
		if (local30 == null) {
			@Pc(42) byte local42;
			if (arg9 == 1) {
				local42 = 9;
			} else if (arg9 == 2) {
				local42 = 12;
			} else if (arg9 == 3) {
				local42 = 15;
			} else if (arg9 == 4) {
				local42 = 18;
			} else {
				local42 = 21;
			}
			@Pc(81) int[] local81 = new int[] { 64, 96, 128 };
			@Pc(99) Class5_Sub6 local99 = new Class5_Sub6(local42 * 3 + 1, -local42 + local42 * 6, 0);
			local105 = local99.method3579(0, 0);
			@Pc(109) int[][] local109 = new int[3][local42];
			@Pc(123) int local123;
			@Pc(142) int local142;
			for (local111 = 0; local111 < 3; local111++) {
				local117 = local81[local111];
				local121 = local81[local111];
				for (local123 = 0; local123 < local42; local123++) {
					@Pc(131) int local131 = (local123 << 11) / local42;
					local142 = arg12 + local121 * Class94.anIntArray277[local131] >> 16;
					local152 = Class94.anIntArray278[local131] * local117 + arg5 >> 16;
					local109[local111][local123] = local99.method3579(local152, local142);
				}
			}
			for (local117 = 0; local117 < 3; local117++) {
				local121 = (local117 * 256 + 128) / 3;
				local123 = 256 - local121;
				@Pc(235) short local235 = (short) (((arg0 & 0x7F) * local123 + local121 * (arg8 & 0x7F) & 0x7F00) + ((arg8 & 0x380) * local121 + local123 * (arg0 & 0x380) & 0x38000) + (local121 * (arg8 & 0xFC00) + local123 * (arg0 & 0xFC00) & 0xFC0000) >> 8);
				@Pc(246) byte local246 = (byte) (arg2 * local121 + arg1 * local123 >> 8);
				for (local142 = 0; local142 < local42; local142++) {
					if (local117 == 0) {
						local99.method3589(local105, local109[0][(local142 + 1) % local42], local109[0][local142], local235, local246);
					} else {
						local99.method3589(local109[local117 - 1][local142], local109[local117 - 1][(local142 + 1) % local42], local109[local117][(local142 + 1) % local42], local235, local246);
						local99.method3589(local109[local117 - 1][local142], local109[local117][(local142 + 1) % local42], local109[local117][local142], local235, local246);
					}
				}
			}
			local30 = local99.method3582(64, 768, -50, -10, -50);
			Static204.aClass53_26.method1497(local30, local24);
		}
		@Pc(373) int local373 = arg9 * 64 - 1;
		@Pc(376) int local376 = -local373;
		@Pc(379) int local379 = -local373;
		@Pc(381) int local381 = local373;
		@Pc(384) int local384 = arg7.method2918();
		local111 = arg7.method2914();
		local117 = arg7.method2915();
		local105 = local373;
		local121 = arg7.method2923();
		@Pc(397) Class1_Sub2_Sub14 local397 = null;
		if (arg3 != null) {
			@Pc(404) int local404 = arg3.anIntArray75[arg11];
			local397 = Static71.method1262(local404 >> 16);
			arg11 = local404 & 0xFFFF;
		}
		if (arg6) {
			if (arg10 > 128 && arg10 < 896) {
				local379 -= 128;
			}
			if (arg10 > 1152 && arg10 < 1920) {
				local381 = local373 + 128;
			}
			if (arg10 > 1664 || arg10 < 384) {
				local376 -= 128;
			}
			if (arg10 > 640 && arg10 < 1408) {
				local105 = local373 + 128;
			}
		}
		if (local111 > local381) {
			local111 = local381;
		}
		if (local379 > local384) {
			local384 = local379;
		}
		if (local376 > local117) {
			local117 = local376;
		}
		if (local121 > local105) {
			local121 = local105;
		}
		if (local397 == null) {
			local30 = local30.method2916(true, true);
			local30.method2922((local111 - local384) / 2, 128, (local121 - local117) / 2);
			local30.method2925((local111 + local384) / 2, 0, (local121 + local117) / 2);
		} else {
			local30 = local30.method2916(!local397.method2867(arg11), true);
			local30.method2922((local111 - local384) / 2, 128, (local121 - local117) / 2);
			local30.method2925((local111 + local384) / 2, 0, (local117 + local121) / 2);
			local30.method2932(local397, arg11);
		}
		if (arg10 != 0) {
			local30.method2930(arg10);
		}
		@Pc(577) Class5_Sub2_Sub1 local577 = (Class5_Sub2_Sub1) local30;
		if (Static26.method2454(Static197.anInt2422, arg12 + local117, arg5 + local384) != arg4 || arg4 != Static26.method2454(Static197.anInt2422, local121 + arg12, local111 + arg5)) {
			for (local152 = 0; local152 < local577.anInt3820; local152++) {
				local577.anIntArray257[local152] += Static26.method2454(Static197.anInt2422, local577.anIntArray256[local152] + arg12, arg5 + local577.anIntArray251[local152]) - arg4;
			}
			local577.aBoolean174 = false;
		}
		return local30;
	}
}
