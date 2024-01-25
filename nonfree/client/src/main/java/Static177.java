import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!gq", name = "l", descriptor = "I")
	public static int anInt3968;

	@OriginalMember(owner = "client!gq", name = "o", descriptor = "B")
	public static byte aByte40;

	@OriginalMember(owner = "client!gq", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString41;

	@OriginalMember(owner = "client!gq", name = "q", descriptor = "Lclient!js;")
	public static Class171 aClass171_1;

	@OriginalMember(owner = "client!gq", name = "e", descriptor = "Lclient!mfa;")
	public static final Class211 aClass211_26 = new Class211();

	@OriginalMember(owner = "client!gq", name = "k", descriptor = "[I")
	public static final int[] anIntArray263 = new int[4096];

	@OriginalMember(owner = "client!gq", name = "m", descriptor = "I")
	public static int anInt3969 = -1;

	@OriginalMember(owner = "client!gq", name = "n", descriptor = "Z")
	public static boolean aBoolean326 = false;

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method3519(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			@Pc(21) char local21 = arg0.charAt(local12);
			if (local21 == '<' || local21 == '>') {
				local10 += 3;
			}
		}
		@Pc(41) StringBuffer local41 = new StringBuffer(local10 + local8);
		for (@Pc(43) int local43 = 0; local43 < local8; local43++) {
			@Pc(49) char local49 = arg0.charAt(local43);
			if (local49 == '<') {
				local41.append("<lt>");
			} else if (local49 == '>') {
				local41.append("<gt>");
			} else {
				local41.append(local49);
			}
		}
		return local41.toString();
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(II)Lclient!nk;")
	public static Class6_Sub4_Sub10 method3520(@OriginalArg(0) int arg0) {
		@Pc(12) Class6_Sub4_Sub10 local12 = (Class6_Sub4_Sub10) Static146.aClass199_6.method4863((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static318.aClass168_76.method4435(0, arg0);
		if (local22 == null || local22.length <= 1) {
			return null;
		} else {
			local12 = Static512.method7257(local22);
			Static146.aClass199_6.method4858(local12, (long) arg0);
			return local12;
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIILclient!le;IIIIIIII)Z")
	public static boolean method3525(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class194 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7 = arg7;
		@Pc(9) int local9 = arg4;
		@Pc(18) int local18 = arg7 - 64;
		@Pc(22) int local22 = arg4 - 64;
		Static4.anIntArrayArray1[64][64] = 99;
		Static221.anIntArrayArray32[64][64] = 0;
		@Pc(36) byte local36 = 0;
		@Pc(43) int local43 = 0;
		Static506.anIntArray794[0] = arg7;
		@Pc(50) int local50 = local36 + 1;
		Static88.anIntArray159[0] = arg4;
		@Pc(55) int[][] local55 = arg3.anIntArrayArray40;
		while (true) {
			label282: while (true) {
				@Pc(70) int local70;
				@Pc(75) int local75;
				@Pc(86) int local86;
				@Pc(91) int local91;
				@Pc(240) int local240;
				@Pc(280) int local280;
				do {
					do {
						do {
							label259: do {
								if (local50 == local43) {
									Static132.anInt9039 = local9;
									Static524.anInt9093 = local7;
									return false;
								}
								local7 = Static506.anIntArray794[local43];
								local9 = Static88.anIntArray159[local43];
								local70 = local7 - local18;
								local75 = local9 - local22;
								local43 = local43 + 1 & 0xFFF;
								local86 = local7 - arg3.anInt5598;
								local91 = local9 - arg3.anInt5584;
								if (arg8 == -4) {
									if (local7 == arg9 && arg5 == local9) {
										Static132.anInt9039 = local9;
										Static524.anInt9093 = local7;
										return true;
									}
								} else if (arg8 == -3) {
									if (Static515.method7172(arg2, arg5, arg1, local7, arg9, arg2, local9, arg10)) {
										Static524.anInt9093 = local7;
										Static132.anInt9039 = local9;
										return true;
									}
								} else if (arg8 == -2) {
									if (arg3.method4799(arg2, arg6, arg9, arg10, local7, arg1, arg5, local9, arg2)) {
										Static524.anInt9093 = local7;
										Static132.anInt9039 = local9;
										return true;
									}
								} else if (arg8 == -1) {
									if (arg3.method4808(arg6, arg5, local9, arg2, arg10, local7, arg1, arg9)) {
										Static132.anInt9039 = local9;
										Static524.anInt9093 = local7;
										return true;
									}
								} else if (arg8 == 0 || arg8 == 1 || arg8 == 2 || arg8 == 3 || arg8 == 9) {
									if (arg3.method4807(arg9, arg5, local7, arg2, arg8, local9, arg0)) {
										Static132.anInt9039 = local9;
										Static524.anInt9093 = local7;
										return true;
									}
								} else if (arg3.method4800(arg5, arg2, arg8, local7, arg0, local9, arg9)) {
									Static524.anInt9093 = local7;
									Static132.anInt9039 = local9;
									return true;
								}
								local240 = Static221.anIntArrayArray32[local70][local75] + 1;
								if (local70 > 0 && Static4.anIntArrayArray1[local70 - 1][local75] == 0 && (local55[local86 - 1][local91] & 0x43A40000) == 0 && (local55[local86 - 1][local91 + arg2 - 1] & 0x4E240000) == 0) {
									local280 = 1;
									while (true) {
										if (arg2 - 1 <= local280) {
											Static506.anIntArray794[local50] = local7 - 1;
											Static88.anIntArray159[local50] = local9;
											Static4.anIntArrayArray1[local70 - 1][local75] = 2;
											local50 = local50 + 1 & 0xFFF;
											Static221.anIntArrayArray32[local70 - 1][local75] = local240;
											break;
										}
										if ((local55[local86 - 1][local91 + local280] & 0x4FA40000) != 0) {
											break;
										}
										local280++;
									}
								}
								if (local70 < 128 - arg2 && Static4.anIntArrayArray1[local70 + 1][local75] == 0 && (local55[local86 + arg2][local91] & 0x60E40000) == 0 && (local55[local86 + arg2][arg2 + local91 - 1] & 0x78240000) == 0) {
									local280 = 1;
									while (true) {
										if (arg2 - 1 <= local280) {
											Static506.anIntArray794[local50] = local7 + 1;
											Static88.anIntArray159[local50] = local9;
											Static4.anIntArrayArray1[local70 + 1][local75] = 8;
											local50 = local50 + 1 & 0xFFF;
											Static221.anIntArrayArray32[local70 + 1][local75] = local240;
											break;
										}
										if ((local55[local86 + arg2][local91 + local280] & 0x78E40000) != 0) {
											break;
										}
										local280++;
									}
								}
								if (local75 > 0 && Static4.anIntArrayArray1[local70][local75 - 1] == 0 && (local55[local86][local91 - 1] & 0x43A40000) == 0 && (local55[arg2 + local86 - 1][local91 - 1] & 0x60E40000) == 0) {
									local280 = 1;
									while (true) {
										if (arg2 - 1 <= local280) {
											Static506.anIntArray794[local50] = local7;
											Static88.anIntArray159[local50] = local9 - 1;
											Static4.anIntArrayArray1[local70][local75 - 1] = 1;
											local50 = local50 + 1 & 0xFFF;
											Static221.anIntArrayArray32[local70][local75 - 1] = local240;
											break;
										}
										if ((local55[local86 + local280][local91 - 1] & 0x63E40000) != 0) {
											break;
										}
										local280++;
									}
								}
								if (local75 < 128 - arg2 && Static4.anIntArrayArray1[local70][local75 + 1] == 0 && (local55[local86][arg2 + local91] & 0x4E240000) == 0 && (local55[arg2 + local86 - 1][local91 + arg2] & 0x78240000) == 0) {
									local280 = 1;
									while (true) {
										if (local280 >= arg2 - 1) {
											Static506.anIntArray794[local50] = local7;
											Static88.anIntArray159[local50] = local9 + 1;
											local50 = local50 + 1 & 0xFFF;
											Static4.anIntArrayArray1[local70][local75 + 1] = 4;
											Static221.anIntArrayArray32[local70][local75 + 1] = local240;
											break;
										}
										if ((local55[local86 + local280][local91 + arg2] & 0x7E240000) != 0) {
											break;
										}
										local280++;
									}
								}
								if (local70 > 0 && local75 > 0 && Static4.anIntArrayArray1[local70 - 1][local75 - 1] == 0 && (local55[local86 - 1][local91 - 1] & 0x43A40000) == 0) {
									local280 = 1;
									while (true) {
										if (arg2 <= local280) {
											Static506.anIntArray794[local50] = local7 - 1;
											Static88.anIntArray159[local50] = local9 - 1;
											Static4.anIntArrayArray1[local70 - 1][local75 - 1] = 3;
											local50 = local50 + 1 & 0xFFF;
											Static221.anIntArrayArray32[local70 - 1][local75 - 1] = local240;
											break;
										}
										if ((local55[local86 - 1][local91 + local280 - 1] & 0x4FA40000) != 0 || (local55[local280 + local86 - 1][local91 - 1] & 0x63E40000) != 0) {
											break;
										}
										local280++;
									}
								}
								if (local70 < 128 - arg2 && local75 > 0 && Static4.anIntArrayArray1[local70 + 1][local75 - 1] == 0 && (local55[local86 + arg2][local91 - 1] & 0x60E40000) == 0) {
									local280 = 1;
									while (true) {
										if (arg2 <= local280) {
											Static506.anIntArray794[local50] = local7 + 1;
											Static88.anIntArray159[local50] = local9 - 1;
											local50 = local50 + 1 & 0xFFF;
											Static4.anIntArrayArray1[local70 + 1][local75 - 1] = 9;
											Static221.anIntArrayArray32[local70 + 1][local75 - 1] = local240;
											break;
										}
										if ((local55[local86 + arg2][local91 + local280 - 1] & 0x78E40000) != 0 || (local55[local86 + local280][local91 - 1] & 0x63E40000) != 0) {
											break;
										}
										local280++;
									}
								}
								if (local70 > 0 && local75 < 128 - arg2 && Static4.anIntArrayArray1[local70 - 1][local75 + 1] == 0 && (local55[local86 - 1][local91 + arg2] & 0x4E240000) == 0) {
									for (local280 = 1; local280 < arg2; local280++) {
										if ((local55[local86 - 1][local280 + local91] & 0x4FA40000) != 0 || (local55[local280 + local86 - 1][local91 + arg2] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static506.anIntArray794[local50] = local7 - 1;
									Static88.anIntArray159[local50] = local9 + 1;
									Static4.anIntArrayArray1[local70 - 1][local75 + 1] = 6;
									local50 = local50 + 1 & 0xFFF;
									Static221.anIntArrayArray32[local70 - 1][local75 + 1] = local240;
								}
							} while (local70 >= 128 - arg2);
						} while (128 - arg2 <= local75);
					} while (Static4.anIntArrayArray1[local70 + 1][local75 + 1] != 0);
				} while ((local55[local86 + arg2][local91 + arg2] & 0x78240000) != 0);
				for (local280 = 1; local280 < arg2; local280++) {
					if ((local55[local86 + local280][arg2 + local91] & 0x7E240000) != 0 || (local55[arg2 + local86][local91 + local280] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static506.anIntArray794[local50] = local7 + 1;
				Static88.anIntArray159[local50] = local9 + 1;
				local50 = local50 + 1 & 0xFFF;
				Static4.anIntArrayArray1[local70 + 1][local75 + 1] = 12;
				Static221.anIntArrayArray32[local70 + 1][local75 + 1] = local240;
			}
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(III)V")
	public static void method3526(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static98.anInt2324 = arg1 - Static461.anInt57;
		Static427.anInt9633 = arg0 - Static461.anInt58;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(BI)I")
	public static int method3527(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
