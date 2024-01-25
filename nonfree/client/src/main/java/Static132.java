import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!in", name = "O", descriptor = "I")
	public static int anInt2477;

	@OriginalMember(owner = "client!in", name = "G", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!in", name = "K", descriptor = "I")
	public static int anInt2474 = -1;

	@OriginalMember(owner = "client!in", name = "L", descriptor = "I")
	public static int anInt2475 = 0;

	@OriginalMember(owner = "client!in", name = "M", descriptor = "Lclient!bj;")
	public static final Class26 aClass26_21 = new Class26(50);

	@OriginalMember(owner = "client!in", name = "N", descriptor = "I")
	public static int anInt2476 = 2;

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IIIILclient!hh;IIIIIII)Z")
	public static boolean method2060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class92 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7 = arg6;
		@Pc(9) int local9 = arg9;
		@Pc(18) int local18 = arg6 - 64;
		Static135.anIntArrayArray26[64][64] = 99;
		@Pc(29) int local29 = arg9 - 64;
		Static329.anIntArrayArray75[64][64] = 0;
		@Pc(37) byte local37 = 0;
		Static182.anIntArray268[0] = arg6;
		@Pc(43) int local43 = 0;
		@Pc(46) int local46 = local37 + 1;
		Static185.anIntArray283[0] = arg9;
		@Pc(51) int[][] local51 = arg4.anIntArrayArray18;
		while (true) {
			label282: while (true) {
				@Pc(75) int local75;
				@Pc(65) int local65;
				@Pc(81) int local81;
				@Pc(87) int local87;
				@Pc(242) int local242;
				@Pc(287) int local287;
				do {
					do {
						do {
							label259: do {
								if (local43 == local46) {
									Static165.anInt3290 = local7;
									Static236.anInt4751 = local9;
									return false;
								}
								local7 = Static182.anIntArray268[local43];
								local9 = Static185.anIntArray283[local43];
								local65 = local9 - local29;
								local43 = local43 + 1 & 0xFFF;
								local75 = local7 - local18;
								local81 = local7 - arg4.anInt2163;
								local87 = local9 - arg4.anInt2177;
								if (arg3 == -4) {
									if (arg2 == local7 && arg1 == local9) {
										Static165.anInt3290 = local7;
										Static236.anInt4751 = local9;
										return true;
									}
								} else if (arg3 == -3) {
									if (Static180.method4117(arg5, arg8, local9, arg10, arg10, local7, arg2, arg1)) {
										Static236.anInt4751 = local9;
										Static165.anInt3290 = local7;
										return true;
									}
								} else if (arg3 == -2) {
									if (arg4.method1764(arg8, arg10, arg2, arg5, arg1, local9, local7, arg0, arg10)) {
										Static236.anInt4751 = local9;
										Static165.anInt3290 = local7;
										return true;
									}
								} else if (arg3 == -1) {
									if (arg4.method1768(arg5, arg8, arg0, local7, arg10, arg2, local9, arg1)) {
										Static165.anInt3290 = local7;
										Static236.anInt4751 = local9;
										return true;
									}
								} else if (arg3 == 0 || arg3 == 1 || arg3 == 2 || arg3 == 3 || arg3 == 9) {
									if (arg4.method1757(arg3, local9, arg7, arg1, arg2, local7, arg10)) {
										Static165.anInt3290 = local7;
										Static236.anInt4751 = local9;
										return true;
									}
								} else if (arg4.method1766(arg1, arg7, local9, arg3, arg10, arg2, local7)) {
									Static165.anInt3290 = local7;
									Static236.anInt4751 = local9;
									return true;
								}
								local242 = Static329.anIntArrayArray75[local75][local65] + 1;
								if (local75 > 0 && Static135.anIntArrayArray26[local75 - 1][local65] == 0 && (local51[local81 - 1][local87] & 0x43A40000) == 0 && (local51[local81 - 1][local87 + arg10 - 1] & 0x4E240000) == 0) {
									local287 = 1;
									while (true) {
										if (local287 >= arg10 - 1) {
											Static182.anIntArray268[local46] = local7 - 1;
											Static185.anIntArray283[local46] = local9;
											Static135.anIntArrayArray26[local75 - 1][local65] = 2;
											local46 = local46 + 1 & 0xFFF;
											Static329.anIntArrayArray75[local75 - 1][local65] = local242;
											break;
										}
										if ((local51[local81 - 1][local87 + local287] & 0x4FA40000) != 0) {
											break;
										}
										local287++;
									}
								}
								if (local75 < 128 - arg10 && Static135.anIntArrayArray26[local75 + 1][local65] == 0 && (local51[arg10 + local81][local87] & 0x60E40000) == 0 && (local51[local81 + arg10][arg10 + local87 - 1] & 0x78240000) == 0) {
									local287 = 1;
									while (true) {
										if (local287 >= arg10 - 1) {
											Static182.anIntArray268[local46] = local7 + 1;
											Static185.anIntArray283[local46] = local9;
											Static135.anIntArrayArray26[local75 + 1][local65] = 8;
											local46 = local46 + 1 & 0xFFF;
											Static329.anIntArrayArray75[local75 + 1][local65] = local242;
											break;
										}
										if ((local51[local81 + arg10][local87 + local287] & 0x78E40000) != 0) {
											break;
										}
										local287++;
									}
								}
								if (local65 > 0 && Static135.anIntArrayArray26[local75][local65 - 1] == 0 && (local51[local81][local87 - 1] & 0x43A40000) == 0 && (local51[arg10 + local81 - 1][local87 - 1] & 0x60E40000) == 0) {
									local287 = 1;
									while (true) {
										if (local287 >= arg10 - 1) {
											Static182.anIntArray268[local46] = local7;
											Static185.anIntArray283[local46] = local9 - 1;
											Static135.anIntArrayArray26[local75][local65 - 1] = 1;
											local46 = local46 + 1 & 0xFFF;
											Static329.anIntArrayArray75[local75][local65 - 1] = local242;
											break;
										}
										if ((local51[local287 + local81][local87 - 1] & 0x63E40000) != 0) {
											break;
										}
										local287++;
									}
								}
								if (local65 < 128 - arg10 && Static135.anIntArrayArray26[local75][local65 + 1] == 0 && (local51[local81][arg10 + local87] & 0x4E240000) == 0 && (local51[local81 + arg10 - 1][local87 + arg10] & 0x78240000) == 0) {
									local287 = 1;
									while (true) {
										if (local287 >= arg10 - 1) {
											Static182.anIntArray268[local46] = local7;
											Static185.anIntArray283[local46] = local9 + 1;
											local46 = local46 + 1 & 0xFFF;
											Static135.anIntArrayArray26[local75][local65 + 1] = 4;
											Static329.anIntArrayArray75[local75][local65 + 1] = local242;
											break;
										}
										if ((local51[local287 + local81][local87 + arg10] & 0x7E240000) != 0) {
											break;
										}
										local287++;
									}
								}
								if (local75 > 0 && local65 > 0 && Static135.anIntArrayArray26[local75 - 1][local65 - 1] == 0 && (local51[local81 - 1][local87 - 1] & 0x43A40000) == 0) {
									local287 = 1;
									while (true) {
										if (arg10 <= local287) {
											Static182.anIntArray268[local46] = local7 - 1;
											Static185.anIntArray283[local46] = local9 - 1;
											local46 = local46 + 1 & 0xFFF;
											Static135.anIntArrayArray26[local75 - 1][local65 - 1] = 3;
											Static329.anIntArrayArray75[local75 - 1][local65 - 1] = local242;
											break;
										}
										if ((local51[local81 - 1][local87 + local287 - 1] & 0x4FA40000) != 0 || (local51[local81 + local287 - 1][local87 - 1] & 0x63E40000) != 0) {
											break;
										}
										local287++;
									}
								}
								if (local75 < 128 - arg10 && local65 > 0 && Static135.anIntArrayArray26[local75 + 1][local65 - 1] == 0 && (local51[arg10 + local81][local87 - 1] & 0x60E40000) == 0) {
									local287 = 1;
									while (true) {
										if (local287 >= arg10) {
											Static182.anIntArray268[local46] = local7 + 1;
											Static185.anIntArray283[local46] = local9 - 1;
											Static135.anIntArrayArray26[local75 + 1][local65 - 1] = 9;
											local46 = local46 + 1 & 0xFFF;
											Static329.anIntArrayArray75[local75 + 1][local65 - 1] = local242;
											break;
										}
										if ((local51[arg10 + local81][local287 + local87 - 1] & 0x78E40000) != 0 || (local51[local287 + local81][local87 - 1] & 0x63E40000) != 0) {
											break;
										}
										local287++;
									}
								}
								if (local75 > 0 && local65 < 128 - arg10 && Static135.anIntArrayArray26[local75 - 1][local65 + 1] == 0 && (local51[local81 - 1][local87 + arg10] & 0x4E240000) == 0) {
									for (local287 = 1; local287 < arg10; local287++) {
										if ((local51[local81 - 1][local287 + local87] & 0x4FA40000) != 0 || (local51[local287 + local81 - 1][local87 + arg10] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static182.anIntArray268[local46] = local7 - 1;
									Static185.anIntArray283[local46] = local9 + 1;
									local46 = local46 + 1 & 0xFFF;
									Static135.anIntArrayArray26[local75 - 1][local65 + 1] = 6;
									Static329.anIntArrayArray75[local75 - 1][local65 + 1] = local242;
								}
							} while (128 - arg10 <= local75);
						} while (128 - arg10 <= local65);
					} while (Static135.anIntArrayArray26[local75 + 1][local65 + 1] != 0);
				} while ((local51[local81 + arg10][local87 + arg10] & 0x78240000) != 0);
				for (local287 = 1; local287 < arg10; local287++) {
					if ((local51[local81 + local287][local87 + arg10] & 0x7E240000) != 0 || (local51[arg10 + local81][local287 + local87] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static182.anIntArray268[local46] = local7 + 1;
				Static185.anIntArray283[local46] = local9 + 1;
				Static135.anIntArrayArray26[local75 + 1][local65 + 1] = 12;
				local46 = local46 + 1 & 0xFFF;
				Static329.anIntArrayArray75[local75 + 1][local65 + 1] = local242;
			}
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(BIII)V")
	public static void method2063(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class11_Sub4_Sub12 local16 = Static35.method512(11, arg2);
		local16.method3858();
		local16.anInt4388 = arg0;
		local16.anInt4390 = arg1;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(BIIILclient!uo;ZLclient!ai;)V")
	public static void method2064(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class129 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class9 arg5) {
		if (arg4) {
			Static244.aClass97_16.method5555((Static164.anInt3090 - Static244.aClass97_16.method5542()) / 2, (Static79.anInt5259 - Static244.aClass97_16.method5557()) / 2);
			Static21.aClass97_11.method5555((Static164.anInt3090 - Static21.aClass97_11.method5542()) / 2, 18);
		}
		arg5.method3570(Static164.anInt3090 / 2, Static79.anInt5259 / 2 - 26, -1, ~Static68.anInt1264 == -2 ? Static256.aClass117_87.method2684(Static230.anInt4634) : Static148.aClass117_49.method2684(Static230.anInt4634), arg2);
		@Pc(61) int local61 = Static79.anInt5259 / 2 - 18;
		arg3.method5015(Static164.anInt3090 / 2 - 152, local61, 304, 34, arg1, 0);
		arg3.method5015(Static164.anInt3090 / 2 - 151, local61 + 1, 302, 32, 0, 0);
		arg3.method4945(Static164.anInt3090 / 2 - 150, local61 + 2, Static122.anInt2279 * 3, 30, arg0, 0);
		arg3.method4945(Static122.anInt2279 * 3 + Static164.anInt3090 / 2 - 150, local61 + 2, 300 - Static122.anInt2279 * 3, 30, 0, 0);
		arg5.method3570(Static164.anInt3090 / 2, Static79.anInt5259 / 2 + 4, -1, Static329.aString62, arg2);
	}
}
