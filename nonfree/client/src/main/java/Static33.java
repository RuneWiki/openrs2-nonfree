import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIIIBIIILclient!pd;II)Z")
	public static boolean method617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class188 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(5) int local5 = arg4;
		@Pc(7) int local7 = arg6;
		@Pc(16) int local16 = arg4 - 64;
		@Pc(21) int local21 = arg6 - 64;
		Static339.anIntArrayArray56[64][64] = 99;
		Static204.anIntArrayArray61[64][64] = 0;
		@Pc(43) byte local43 = 0;
		Static286.anIntArray437[0] = arg4;
		@Pc(49) int local49 = 0;
		@Pc(52) int local52 = local43 + 1;
		Static175.anIntArray289[0] = arg6;
		@Pc(57) int[][] local57 = arg8.anIntArrayArray51;
		while (true) {
			label282: while (true) {
				@Pc(70) int local70;
				@Pc(81) int local81;
				@Pc(86) int local86;
				@Pc(92) int local92;
				@Pc(248) int local248;
				@Pc(293) int local293;
				do {
					do {
						do {
							label259: do {
								if (local49 == local52) {
									Static82.anInt1809 = local7;
									Static130.anInt2613 = local5;
									return false;
								}
								local7 = Static175.anIntArray289[local49];
								local5 = Static286.anIntArray437[local49];
								local70 = local5 - local16;
								local49 = local49 + 1 & 0xFFF;
								local81 = local7 - local21;
								local86 = local5 - arg8.anInt5211;
								local92 = local7 - arg8.anInt5216;
								if (arg7 == -4) {
									if (arg2 == local5 && local7 == arg5) {
										Static130.anInt2613 = local5;
										Static82.anInt1809 = local7;
										return true;
									}
								} else if (arg7 == -3) {
									if (Static205.method3298(local7, arg10, arg9, local5, arg10, arg0, arg2, arg5)) {
										Static82.anInt1809 = local7;
										Static130.anInt2613 = local5;
										return true;
									}
								} else if (arg7 == -2) {
									if (arg8.method4321(local7, arg0, arg10, arg2, arg5, arg9, local5, arg3, arg10)) {
										Static130.anInt2613 = local5;
										Static82.anInt1809 = local7;
										return true;
									}
								} else if (arg7 == -1) {
									if (arg8.method4313(local5, arg3, arg0, arg10, arg2, arg5, local7, arg9)) {
										Static82.anInt1809 = local7;
										Static130.anInt2613 = local5;
										return true;
									}
								} else if (arg7 == 0 || arg7 == 1 || arg7 == 2 || arg7 == 3 || arg7 == 9) {
									if (arg8.method4315(arg1, local5, arg2, arg10, arg7, arg5, local7)) {
										Static82.anInt1809 = local7;
										Static130.anInt2613 = local5;
										return true;
									}
								} else if (arg8.method4319(arg10, local5, local7, arg1, arg2, arg5, arg7)) {
									Static130.anInt2613 = local5;
									Static82.anInt1809 = local7;
									return true;
								}
								local248 = Static204.anIntArrayArray61[local70][local81] + 1;
								if (local70 > 0 && Static339.anIntArrayArray56[local70 - 1][local81] == 0 && (local57[local86 - 1][local92] & 0x43A40000) == 0 && (local57[local86 - 1][arg10 + local92 - 1] & 0x4E240000) == 0) {
									local293 = 1;
									while (true) {
										if (arg10 - 1 <= local293) {
											Static286.anIntArray437[local52] = local5 - 1;
											Static175.anIntArray289[local52] = local7;
											Static339.anIntArrayArray56[local70 - 1][local81] = 2;
											local52 = local52 + 1 & 0xFFF;
											Static204.anIntArrayArray61[local70 - 1][local81] = local248;
											break;
										}
										if ((local57[local86 - 1][local92 + local293] & 0x4FA40000) != 0) {
											break;
										}
										local293++;
									}
								}
								if (local70 < 128 - arg10 && Static339.anIntArrayArray56[local70 + 1][local81] == 0 && (local57[arg10 + local86][local92] & 0x60E40000) == 0 && (local57[arg10 + local86][local92 + arg10 - 1] & 0x78240000) == 0) {
									local293 = 1;
									while (true) {
										if (local293 >= arg10 - 1) {
											Static286.anIntArray437[local52] = local5 + 1;
											Static175.anIntArray289[local52] = local7;
											local52 = local52 + 1 & 0xFFF;
											Static339.anIntArrayArray56[local70 + 1][local81] = 8;
											Static204.anIntArrayArray61[local70 + 1][local81] = local248;
											break;
										}
										if ((local57[local86 + arg10][local293 + local92] & 0x78E40000) != 0) {
											break;
										}
										local293++;
									}
								}
								if (local81 > 0 && Static339.anIntArrayArray56[local70][local81 - 1] == 0 && (local57[local86][local92 - 1] & 0x43A40000) == 0 && (local57[local86 + arg10 - 1][local92 - 1] & 0x60E40000) == 0) {
									local293 = 1;
									while (true) {
										if (arg10 - 1 <= local293) {
											Static286.anIntArray437[local52] = local5;
											Static175.anIntArray289[local52] = local7 - 1;
											Static339.anIntArrayArray56[local70][local81 - 1] = 1;
											local52 = local52 + 1 & 0xFFF;
											Static204.anIntArrayArray61[local70][local81 - 1] = local248;
											break;
										}
										if ((local57[local293 + local86][local92 - 1] & 0x63E40000) != 0) {
											break;
										}
										local293++;
									}
								}
								if (128 - arg10 > local81 && Static339.anIntArrayArray56[local70][local81 + 1] == 0 && (local57[local86][arg10 + local92] & 0x4E240000) == 0 && (local57[local86 + arg10 - 1][arg10 + local92] & 0x78240000) == 0) {
									local293 = 1;
									while (true) {
										if (arg10 - 1 <= local293) {
											Static286.anIntArray437[local52] = local5;
											Static175.anIntArray289[local52] = local7 + 1;
											Static339.anIntArrayArray56[local70][local81 + 1] = 4;
											local52 = local52 + 1 & 0xFFF;
											Static204.anIntArrayArray61[local70][local81 + 1] = local248;
											break;
										}
										if ((local57[local86 + local293][local92 + arg10] & 0x7E240000) != 0) {
											break;
										}
										local293++;
									}
								}
								if (local70 > 0 && local81 > 0 && Static339.anIntArrayArray56[local70 - 1][local81 - 1] == 0 && (local57[local86 - 1][local92 - 1] & 0x43A40000) == 0) {
									local293 = 1;
									while (true) {
										if (arg10 <= local293) {
											Static286.anIntArray437[local52] = local5 - 1;
											Static175.anIntArray289[local52] = local7 - 1;
											local52 = local52 + 1 & 0xFFF;
											Static339.anIntArrayArray56[local70 - 1][local81 - 1] = 3;
											Static204.anIntArrayArray61[local70 - 1][local81 - 1] = local248;
											break;
										}
										if ((local57[local86 - 1][local293 + local92 - 1] & 0x4FA40000) != 0 || (local57[local293 + local86 - 1][local92 - 1] & 0x63E40000) != 0) {
											break;
										}
										local293++;
									}
								}
								if (128 - arg10 > local70 && local81 > 0 && Static339.anIntArrayArray56[local70 + 1][local81 - 1] == 0 && (local57[local86 + arg10][local92 - 1] & 0x60E40000) == 0) {
									local293 = 1;
									while (true) {
										if (arg10 <= local293) {
											Static286.anIntArray437[local52] = local5 + 1;
											Static175.anIntArray289[local52] = local7 - 1;
											Static339.anIntArrayArray56[local70 + 1][local81 - 1] = 9;
											local52 = local52 + 1 & 0xFFF;
											Static204.anIntArrayArray61[local70 + 1][local81 - 1] = local248;
											break;
										}
										if ((local57[arg10 + local86][local293 + local92 - 1] & 0x78E40000) != 0 || (local57[local293 + local86][local92 - 1] & 0x63E40000) != 0) {
											break;
										}
										local293++;
									}
								}
								if (local70 > 0 && 128 - arg10 > local81 && Static339.anIntArrayArray56[local70 - 1][local81 + 1] == 0 && (local57[local86 - 1][arg10 + local92] & 0x4E240000) == 0) {
									for (local293 = 1; local293 < arg10; local293++) {
										if ((local57[local86 - 1][local92 + local293] & 0x4FA40000) != 0 || (local57[local86 + local293 - 1][local92 + arg10] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static286.anIntArray437[local52] = local5 - 1;
									Static175.anIntArray289[local52] = local7 + 1;
									local52 = local52 + 1 & 0xFFF;
									Static339.anIntArrayArray56[local70 - 1][local81 + 1] = 6;
									Static204.anIntArrayArray61[local70 - 1][local81 + 1] = local248;
								}
							} while (local70 >= 128 - arg10);
						} while (local81 >= 128 - arg10);
					} while (Static339.anIntArrayArray56[local70 + 1][local81 + 1] != 0);
				} while ((local57[arg10 + local86][arg10 + local92] & 0x78240000) != 0);
				for (local293 = 1; local293 < arg10; local293++) {
					if ((local57[local293 + local86][arg10 + local92] & 0x7E240000) != 0 || (local57[arg10 + local86][local92 + local293] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static286.anIntArray437[local52] = local5 + 1;
				Static175.anIntArray289[local52] = local7 + 1;
				local52 = local52 + 1 & 0xFFF;
				Static339.anIntArrayArray56[local70 + 1][local81 + 1] = 12;
				Static204.anIntArrayArray61[local70 + 1][local81 + 1] = local248;
			}
		}
	}
}
