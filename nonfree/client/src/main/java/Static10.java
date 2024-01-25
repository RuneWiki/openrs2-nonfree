import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!aj", name = "e", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_8 = new Class85("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

	@OriginalMember(owner = "client!aj", name = "l", descriptor = "Lclient!hl;")
	public static final Class88 aClass88_1 = new Class88();

	@OriginalMember(owner = "client!aj", name = "o", descriptor = "I")
	public static int anInt201 = -1;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIIIIIILclient!bm;III)Z")
	public static boolean method176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) Class24 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(5) int local5 = arg8;
		@Pc(7) int local7 = arg10;
		@Pc(16) int local16 = arg8 - 64;
		Static107.anIntArrayArray75[64][64] = 99;
		@Pc(27) int local27 = arg10 - 64;
		Static240.anIntArrayArray76[64][64] = 0;
		@Pc(35) byte local35 = 0;
		Static85.anIntArray131[0] = arg8;
		@Pc(41) int local41 = 0;
		@Pc(44) int local44 = local35 + 1;
		Static352.anIntArray637[0] = arg10;
		@Pc(49) int[][] local49 = arg7.anIntArrayArray15;
		while (true) {
			label282: while (true) {
				@Pc(62) int local62;
				@Pc(72) int local72;
				@Pc(78) int local78;
				@Pc(84) int local84;
				@Pc(243) int local243;
				@Pc(283) int local283;
				do {
					do {
						do {
							label259: do {
								if (local41 == local44) {
									Static42.anInt742 = local5;
									Static63.anInt5184 = local7;
									return false;
								}
								local5 = Static85.anIntArray131[local41];
								local7 = Static352.anIntArray637[local41];
								local62 = local5 - local16;
								local41 = local41 + 1 & 0xFFF;
								local72 = local7 - local27;
								local78 = local5 - arg7.anInt543;
								local84 = local7 - arg7.anInt542;
								if (arg3 == -4) {
									if (arg2 == local5 && arg6 == local7) {
										Static63.anInt5184 = local7;
										Static42.anInt742 = local5;
										return true;
									}
								} else if (arg3 == -3) {
									if (Static174.method3164(local7, arg0, arg1, arg2, arg5, local5, arg6, arg1)) {
										Static63.anInt5184 = local7;
										Static42.anInt742 = local5;
										return true;
									}
								} else if (arg3 == -2) {
									if (arg7.method495(local7, local5, arg1, arg5, arg6, arg2, arg1, arg0, arg9)) {
										Static63.anInt5184 = local7;
										Static42.anInt742 = local5;
										return true;
									}
								} else if (arg3 == -1) {
									if (arg7.method496(arg9, local5, arg6, arg5, arg2, local7, arg0, arg1)) {
										Static42.anInt742 = local5;
										Static63.anInt5184 = local7;
										return true;
									}
								} else if (arg3 == 0 || arg3 == 1 || arg3 == 2 || arg3 == 3 || arg3 == 9) {
									if (arg7.method481(arg6, arg3, arg1, arg4, arg2, local5, local7)) {
										Static63.anInt5184 = local7;
										Static42.anInt742 = local5;
										return true;
									}
								} else if (arg7.method497(arg2, arg1, arg6, arg4, local5, local7, arg3)) {
									Static63.anInt5184 = local7;
									Static42.anInt742 = local5;
									return true;
								}
								local243 = Static240.anIntArrayArray76[local62][local72] + 1;
								if (local62 > 0 && Static107.anIntArrayArray75[local62 - 1][local72] == 0 && (local49[local78 - 1][local84] & 0x43A40000) == 0 && (local49[local78 - 1][local84 + arg1 - 1] & 0x4E240000) == 0) {
									local283 = 1;
									while (true) {
										if (local283 >= arg1 - 1) {
											Static85.anIntArray131[local44] = local5 - 1;
											Static352.anIntArray637[local44] = local7;
											Static107.anIntArrayArray75[local62 - 1][local72] = 2;
											local44 = local44 + 1 & 0xFFF;
											Static240.anIntArrayArray76[local62 - 1][local72] = local243;
											break;
										}
										if ((local49[local78 - 1][local283 + local84] & 0x4FA40000) != 0) {
											break;
										}
										local283++;
									}
								}
								if (local62 < 128 - arg1 && Static107.anIntArrayArray75[local62 + 1][local72] == 0 && (local49[arg1 + local78][local84] & 0x60E40000) == 0 && (local49[arg1 + local78][local84 + arg1 - 1] & 0x78240000) == 0) {
									local283 = 1;
									while (true) {
										if (local283 >= arg1 - 1) {
											Static85.anIntArray131[local44] = local5 + 1;
											Static352.anIntArray637[local44] = local7;
											Static107.anIntArrayArray75[local62 + 1][local72] = 8;
											local44 = local44 + 1 & 0xFFF;
											Static240.anIntArrayArray76[local62 + 1][local72] = local243;
											break;
										}
										if ((local49[local78 + arg1][local283 + local84] & 0x78E40000) != 0) {
											break;
										}
										local283++;
									}
								}
								if (local72 > 0 && Static107.anIntArrayArray75[local62][local72 - 1] == 0 && (local49[local78][local84 - 1] & 0x43A40000) == 0 && (local49[arg1 + local78 - 1][local84 - 1] & 0x60E40000) == 0) {
									local283 = 1;
									while (true) {
										if (arg1 - 1 <= local283) {
											Static85.anIntArray131[local44] = local5;
											Static352.anIntArray637[local44] = local7 - 1;
											Static107.anIntArrayArray75[local62][local72 - 1] = 1;
											local44 = local44 + 1 & 0xFFF;
											Static240.anIntArrayArray76[local62][local72 - 1] = local243;
											break;
										}
										if ((local49[local78 + local283][local84 - 1] & 0x63E40000) != 0) {
											break;
										}
										local283++;
									}
								}
								if (128 - arg1 > local72 && Static107.anIntArrayArray75[local62][local72 + 1] == 0 && (local49[local78][arg1 + local84] & 0x4E240000) == 0 && (local49[arg1 + local78 - 1][arg1 + local84] & 0x78240000) == 0) {
									local283 = 1;
									while (true) {
										if (local283 >= arg1 - 1) {
											Static85.anIntArray131[local44] = local5;
											Static352.anIntArray637[local44] = local7 + 1;
											Static107.anIntArrayArray75[local62][local72 + 1] = 4;
											local44 = local44 + 1 & 0xFFF;
											Static240.anIntArrayArray76[local62][local72 + 1] = local243;
											break;
										}
										if ((local49[local78 + local283][local84 + arg1] & 0x7E240000) != 0) {
											break;
										}
										local283++;
									}
								}
								if (local62 > 0 && local72 > 0 && Static107.anIntArrayArray75[local62 - 1][local72 - 1] == 0 && (local49[local78 - 1][local84 - 1] & 0x43A40000) == 0) {
									local283 = 1;
									while (true) {
										if (arg1 <= local283) {
											Static85.anIntArray131[local44] = local5 - 1;
											Static352.anIntArray637[local44] = local7 - 1;
											local44 = local44 + 1 & 0xFFF;
											Static107.anIntArrayArray75[local62 - 1][local72 - 1] = 3;
											Static240.anIntArrayArray76[local62 - 1][local72 - 1] = local243;
											break;
										}
										if ((local49[local78 - 1][local283 + local84 - 1] & 0x4FA40000) != 0 || (local49[local78 + local283 - 1][local84 - 1] & 0x63E40000) != 0) {
											break;
										}
										local283++;
									}
								}
								if (128 - arg1 > local62 && local72 > 0 && Static107.anIntArrayArray75[local62 + 1][local72 - 1] == 0 && (local49[arg1 + local78][local84 - 1] & 0x60E40000) == 0) {
									local283 = 1;
									while (true) {
										if (arg1 <= local283) {
											Static85.anIntArray131[local44] = local5 + 1;
											Static352.anIntArray637[local44] = local7 - 1;
											Static107.anIntArrayArray75[local62 + 1][local72 - 1] = 9;
											local44 = local44 + 1 & 0xFFF;
											Static240.anIntArrayArray76[local62 + 1][local72 - 1] = local243;
											break;
										}
										if ((local49[arg1 + local78][local283 + local84 - 1] & 0x78E40000) != 0 || (local49[local283 + local78][local84 - 1] & 0x63E40000) != 0) {
											break;
										}
										local283++;
									}
								}
								if (local62 > 0 && local72 < 128 - arg1 && Static107.anIntArrayArray75[local62 - 1][local72 + 1] == 0 && (local49[local78 - 1][local84 + arg1] & 0x4E240000) == 0) {
									for (local283 = 1; local283 < arg1; local283++) {
										if ((local49[local78 - 1][local283 + local84] & 0x4FA40000) != 0 || (local49[local283 + local78 - 1][local84 + arg1] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static85.anIntArray131[local44] = local5 - 1;
									Static352.anIntArray637[local44] = local7 + 1;
									local44 = local44 + 1 & 0xFFF;
									Static107.anIntArrayArray75[local62 - 1][local72 + 1] = 6;
									Static240.anIntArrayArray76[local62 - 1][local72 + 1] = local243;
								}
							} while (local62 >= 128 - arg1);
						} while (128 - arg1 <= local72);
					} while (Static107.anIntArrayArray75[local62 + 1][local72 + 1] != 0);
				} while ((local49[local78 + arg1][local84 + arg1] & 0x78240000) != 0);
				for (local283 = 1; local283 < arg1; local283++) {
					if ((local49[local78 + local283][local84 + arg1] & 0x7E240000) != 0 || (local49[arg1 + local78][local84 + local283] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static85.anIntArray131[local44] = local5 + 1;
				Static352.anIntArray637[local44] = local7 + 1;
				Static107.anIntArrayArray75[local62 + 1][local72 + 1] = 12;
				local44 = local44 + 1 & 0xFFF;
				Static240.anIntArrayArray76[local62 + 1][local72 + 1] = local243;
			}
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(BI)Lclient!df;")
	public static Class5_Sub1_Sub3 method178(@OriginalArg(1) int arg0) {
		@Pc(27) Class5_Sub1_Sub3 local27 = (Class5_Sub1_Sub3) Static117.aClass122_4.method3177((long) arg0);
		if (local27 != null) {
			return local27;
		}
		@Pc(37) byte[] local37 = Static224.aClass93_83.method2410(arg0, 5);
		local27 = new Class5_Sub1_Sub3();
		if (local37 != null) {
			local27.method875(new Class5_Sub12(local37));
		}
		Static117.aClass122_4.method3181((long) arg0, local27);
		return local27;
	}
}
