import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "I")
	public static int anInt933;

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "I")
	public static int anInt934;

	@OriginalMember(owner = "client!ap", name = "f", descriptor = "Lclient!nha;")
	public static Class233 aClass233_1;

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILclient!fe;IIIIIIIII)Z")
	public static boolean method991(@OriginalArg(0) int arg0, @OriginalArg(1) Class105 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg9;
		@Pc(9) int local9 = arg5;
		@Pc(17) int local17 = arg9 - 64;
		Static426.anIntArrayArray52[64][64] = 99;
		@Pc(28) int local28 = arg5 - 64;
		Static331.anIntArrayArray43[64][64] = 0;
		@Pc(41) byte local41 = 0;
		@Pc(43) int local43 = 0;
		Static360.anIntArray409[0] = arg9;
		@Pc(50) int local50 = local41 + 1;
		Static143.anIntArray139[0] = arg5;
		@Pc(55) int[][] local55 = arg1.anIntArrayArray19;
		while (local50 != local43) {
			local7 = Static360.anIntArray409[local43];
			local9 = Static143.anIntArray139[local43];
			@Pc(70) int local70 = local7 - local17;
			@Pc(75) int local75 = local9 - local28;
			local43 = local43 + 1 & 0xFFF;
			@Pc(87) int local87 = local7 - arg1.anInt2957;
			@Pc(93) int local93 = local9 - arg1.anInt2972;
			if (arg3 == -4) {
				if (arg2 == local7 && arg7 == local9) {
					Static496.anInt2424 = local9;
					Static574.anInt9453 = local7;
					return true;
				}
			} else if (arg3 == -3) {
				if (Static352.method5824(arg2, 2, arg6, 2, arg7, arg0, local9, local7)) {
					Static574.anInt9453 = local7;
					Static496.anInt2424 = local9;
					return true;
				}
			} else if (arg3 == -2) {
				if (arg1.method2727(2, arg8, 2, arg7, arg6, local7, local9, arg0, arg2)) {
					Static496.anInt2424 = local9;
					Static574.anInt9453 = local7;
					return true;
				}
			} else if (arg3 == -1) {
				if (arg1.method2723(arg7, local7, arg2, local9, 2, arg6, arg8, arg0)) {
					Static496.anInt2424 = local9;
					Static574.anInt9453 = local7;
					return true;
				}
			} else if (arg3 == 0 || arg3 == 1 || arg3 == 2 || arg3 == 3 || arg3 == 9) {
				if (arg1.method2724(arg3, arg2, local7, arg7, local9, 2, arg4)) {
					Static496.anInt2424 = local9;
					Static574.anInt9453 = local7;
					return true;
				}
			} else if (arg1.method2734(arg7, arg4, arg2, arg3, local9, local7, 2)) {
				Static496.anInt2424 = local9;
				Static574.anInt9453 = local7;
				return true;
			}
			@Pc(241) int local241 = Static331.anIntArrayArray43[local70][local75] + 1;
			if (local70 > 0 && Static426.anIntArrayArray52[local70 - 1][local75] == 0 && (local55[local87 - 1][local93] & 0x43A40000) == 0 && (local55[local87 - 1][local93 + 1] & 0x4E240000) == 0) {
				Static360.anIntArray409[local50] = local7 - 1;
				Static143.anIntArray139[local50] = local9;
				Static426.anIntArrayArray52[local70 - 1][local75] = 2;
				local50 = local50 + 1 & 0xFFF;
				Static331.anIntArrayArray43[local70 - 1][local75] = local241;
			}
			if (local70 < 126 && Static426.anIntArrayArray52[local70 + 1][local75] == 0 && (local55[local87 + 2][local93] & 0x60E40000) == 0 && (local55[local87 + 2][local93 + 1] & 0x78240000) == 0) {
				Static360.anIntArray409[local50] = local7 + 1;
				Static143.anIntArray139[local50] = local9;
				Static426.anIntArrayArray52[local70 + 1][local75] = 8;
				local50 = local50 + 1 & 0xFFF;
				Static331.anIntArrayArray43[local70 + 1][local75] = local241;
			}
			if (local75 > 0 && Static426.anIntArrayArray52[local70][local75 - 1] == 0 && (local55[local87][local93 - 1] & 0x43A40000) == 0 && (local55[local87 + 1][local93 - 1] & 0x60E40000) == 0) {
				Static360.anIntArray409[local50] = local7;
				Static143.anIntArray139[local50] = local9 - 1;
				Static426.anIntArrayArray52[local70][local75 - 1] = 1;
				local50 = local50 + 1 & 0xFFF;
				Static331.anIntArrayArray43[local70][local75 - 1] = local241;
			}
			if (local75 < 126 && Static426.anIntArrayArray52[local70][local75 + 1] == 0 && (local55[local87][local93 + 2] & 0x4E240000) == 0 && (local55[local87 + 1][local93 + 2] & 0x78240000) == 0) {
				Static360.anIntArray409[local50] = local7;
				Static143.anIntArray139[local50] = local9 + 1;
				local50 = local50 + 1 & 0xFFF;
				Static426.anIntArrayArray52[local70][local75 + 1] = 4;
				Static331.anIntArrayArray43[local70][local75 + 1] = local241;
			}
			if (local70 > 0 && local75 > 0 && Static426.anIntArrayArray52[local70 - 1][local75 - 1] == 0 && (local55[local87 - 1][local93] & 0x4FA40000) == 0 && (local55[local87 - 1][local93 - 1] & 0x43A40000) == 0 && (local55[local87][local93 - 1] & 0x63E40000) == 0) {
				Static360.anIntArray409[local50] = local7 - 1;
				Static143.anIntArray139[local50] = local9 - 1;
				local50 = local50 + 1 & 0xFFF;
				Static426.anIntArrayArray52[local70 - 1][local75 - 1] = 3;
				Static331.anIntArrayArray43[local70 - 1][local75 - 1] = local241;
			}
			if (local70 < 126 && local75 > 0 && Static426.anIntArrayArray52[local70 + 1][local75 - 1] == 0 && (local55[local87 + 1][local93 - 1] & 0x63E40000) == 0 && (local55[local87 + 2][local93 - 1] & 0x60E40000) == 0 && (local55[local87 + 2][local93] & 0x78E40000) == 0) {
				Static360.anIntArray409[local50] = local7 + 1;
				Static143.anIntArray139[local50] = local9 - 1;
				local50 = local50 + 1 & 0xFFF;
				Static426.anIntArrayArray52[local70 + 1][local75 - 1] = 9;
				Static331.anIntArrayArray43[local70 + 1][local75 - 1] = local241;
			}
			if (local70 > 0 && local75 < 126 && Static426.anIntArrayArray52[local70 - 1][local75 + 1] == 0 && (local55[local87 - 1][local93 + 1] & 0x4FA40000) == 0 && (local55[local87 - 1][local93 + 2] & 0x4E240000) == 0 && (local55[local87][local93 + 2] & 0x7E240000) == 0) {
				Static360.anIntArray409[local50] = local7 - 1;
				Static143.anIntArray139[local50] = local9 + 1;
				local50 = local50 + 1 & 0xFFF;
				Static426.anIntArrayArray52[local70 - 1][local75 + 1] = 6;
				Static331.anIntArrayArray43[local70 - 1][local75 + 1] = local241;
			}
			if (local70 < 126 && local75 < 126 && Static426.anIntArrayArray52[local70 + 1][local75 + 1] == 0 && (local55[local87 + 1][local93 + 2] & 0x7E240000) == 0 && (local55[local87 + 2][local93 + 2] & 0x78240000) == 0 && (local55[local87 + 2][local93 + 1] & 0x78E40000) == 0) {
				Static360.anIntArray409[local50] = local7 + 1;
				Static143.anIntArray139[local50] = local9 + 1;
				local50 = local50 + 1 & 0xFFF;
				Static426.anIntArrayArray52[local70 + 1][local75 + 1] = 12;
				Static331.anIntArrayArray43[local70 + 1][local75 + 1] = local241;
			}
		}
		Static574.anInt9453 = local7;
		Static496.anInt2424 = local9;
		return false;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIIZFIIII)[[I")
	public static int[][] method992(@OriginalArg(4) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class3_Sub2_Sub19 local13 = new Class3_Sub2_Sub19();
		local13.anInt7080 = 4;
		local13.aBoolean512 = false;
		local13.anInt7081 = 4;
		local13.anInt7084 = 3;
		local13.anInt7076 = (int) (arg0 * 4096.0F);
		local13.method8598();
		Static55.method1569(64, 256);
		for (@Pc(48) int local48 = 0; local48 < 256; local48++) {
			local13.method6095(local9[local48], local48);
		}
		return local9;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Ljava/lang/String;IBLjava/lang/String;)I")
	public static int method993(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg2.length();
		@Pc(11) int local11 = arg0.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(22) char local22 = 0;
		@Pc(24) char local24 = 0;
		while (local8 > local13 - local22 || local15 - local24 < local11) {
			if (local8 <= local13 - local22) {
				return -1;
			}
			if (local11 <= local15 - local24) {
				return 1;
			}
			@Pc(65) char local65;
			if (local22 == '\u0000') {
				local65 = arg2.charAt(local13++);
			} else {
				local65 = local22;
			}
			@Pc(75) char local75;
			if (local24 == '\u0000') {
				local75 = arg0.charAt(local15++);
			} else {
				local75 = local24;
			}
			local22 = Static513.method7656(local65);
			local24 = Static513.method7656(local75);
			local65 = Static488.method7258(local65, arg1);
			local75 = Static488.method7258(local75, arg1);
			if (local75 != local65 && Character.toUpperCase(local65) != Character.toUpperCase(local75)) {
				local65 = Character.toLowerCase(local65);
				local75 = Character.toLowerCase(local75);
				if (local75 != local65) {
					return Static286.method4599(local65, arg1) - Static286.method4599(local75, arg1);
				}
			}
		}
		@Pc(146) int local146 = Math.min(local8, local11);
		for (@Pc(148) int local148 = 0; local148 < local146; local148++) {
			if (arg1 == 2) {
				local15 = local11 - local148 - 1;
				local13 = local8 - local148 - 1;
			} else {
				local15 = local148;
				local13 = local148;
			}
			@Pc(177) char local177 = arg2.charAt(local13);
			@Pc(181) char local181 = arg0.charAt(local15);
			if (local177 != local181 && Character.toUpperCase(local177) != Character.toUpperCase(local181)) {
				local177 = Character.toLowerCase(local177);
				local181 = Character.toLowerCase(local181);
				if (local181 != local177) {
					return Static286.method4599(local177, arg1) - Static286.method4599(local181, arg1);
				}
			}
		}
		@Pc(221) int local221 = local8 - local11;
		if (local221 != 0) {
			return local221;
		}
		for (@Pc(230) int local230 = 0; local230 < local146; local230++) {
			@Pc(236) char local236 = arg2.charAt(local230);
			@Pc(240) char local240 = arg0.charAt(local230);
			if (local240 != local236) {
				return Static286.method4599(local236, arg1) - Static286.method4599(local240, arg1);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(BIIII)Z")
	public static boolean method994(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if ((Static513.aByteArrayArrayArray18[0][arg3][arg2] & 0x2) != 0) {
			return true;
		} else if ((Static513.aByteArrayArrayArray18[arg1][arg3][arg2] & 0x10) == 0) {
			return arg0 == Static148.method2716(arg1, arg2, arg3);
		} else {
			return false;
		}
	}
}
