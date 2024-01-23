import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!de", name = "J", descriptor = "I")
	public static int anInt1262;

	@OriginalMember(owner = "client!de", name = "K", descriptor = "I")
	public static int anInt1263;

	@OriginalMember(owner = "client!de", name = "M", descriptor = "Lclient!bn;")
	public static Class2_Sub8_Sub1 aClass2_Sub8_Sub1_5;

	@OriginalMember(owner = "client!de", name = "U", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!de", name = "bb", descriptor = "Ljava/lang/String;")
	public static String aString48 = "glow2:";

	@OriginalMember(owner = "client!de", name = "cb", descriptor = "I")
	public static int anInt1278 = -1;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ZIIIIIIIIII)V")
	public static void method940(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8) {
		@Pc(3) int local3;
		@Pc(8) int local8;
		for (local3 = 0; local3 < 104; local3++) {
			for (local8 = 0; local8 < 104; local8++) {
				Static302.anIntArrayArray42[local3][local8] = 0;
				Static305.anIntArrayArray45[local3][local8] = 99999999;
			}
		}
		local3 = arg2;
		Static302.anIntArrayArray42[arg2][arg8] = 99;
		local8 = arg8;
		Static305.anIntArrayArray45[arg2][arg8] = 0;
		@Pc(57) int local57 = 0;
		@Pc(59) byte local59 = 0;
		Static260.anIntArray493[0] = arg2;
		@Pc(65) boolean local65 = false;
		@Pc(68) int local68 = local59 + 1;
		Static130.anIntArray293[0] = arg8;
		@Pc(75) int[][] local75 = Static89.aClass154Array1[Static32.anInt876].anIntArrayArray32;
		@Pc(203) int local203;
		while (local68 != local57) {
			local3 = Static260.anIntArray493[local57];
			local8 = Static130.anIntArray293[local57];
			local57 = local57 + 1 & 0xFFF;
			if (local3 == arg5 && local8 == arg1) {
				local65 = true;
				break;
			}
			if (arg0 != 0) {
				if ((arg0 < 5 || arg0 == 10) && Static89.aClass154Array1[Static32.anInt876].method3907(arg1, arg3, arg5, local8, local3, arg0 - 1, 2)) {
					local65 = true;
					break;
				}
				if (arg0 < 10 && Static89.aClass154Array1[Static32.anInt876].method3925(arg5, arg3, local8, arg0 - 1, arg1, local3, 2)) {
					local65 = true;
					break;
				}
			}
			if (arg6 != 0 && arg4 != 0 && Static89.aClass154Array1[Static32.anInt876].method3911(local3, arg6, local8, arg7, arg1, 2, arg4, arg5)) {
				local65 = true;
				break;
			}
			local203 = Static305.anIntArrayArray45[local3][local8] + 1;
			if (local3 > 0 && Static302.anIntArrayArray42[local3 - 1][local8] == 0 && (local75[local3 - 1][local8] & 0x2C010E) == 0 && (local75[local3 - 1][local8 + 1] & 0x2C0138) == 0) {
				Static260.anIntArray493[local68] = local3 - 1;
				Static130.anIntArray293[local68] = local8;
				Static302.anIntArrayArray42[local3 - 1][local8] = 2;
				local68 = local68 + 1 & 0xFFF;
				Static305.anIntArrayArray45[local3 - 1][local8] = local203;
			}
			if (local3 < 102 && Static302.anIntArrayArray42[local3 + 1][local8] == 0 && (local75[local3 + 2][local8] & 0x2C0183) == 0 && (local75[local3 + 2][local8 + 1] & 0x2C01E0) == 0) {
				Static260.anIntArray493[local68] = local3 + 1;
				Static130.anIntArray293[local68] = local8;
				Static302.anIntArrayArray42[local3 + 1][local8] = 8;
				local68 = local68 + 1 & 0xFFF;
				Static305.anIntArrayArray45[local3 + 1][local8] = local203;
			}
			if (local8 > 0 && Static302.anIntArrayArray42[local3][local8 - 1] == 0 && (local75[local3][local8 - 1] & 0x2C010E) == 0 && (local75[local3 + 1][local8 - 1] & 0x2C0183) == 0) {
				Static260.anIntArray493[local68] = local3;
				Static130.anIntArray293[local68] = local8 - 1;
				Static302.anIntArrayArray42[local3][local8 - 1] = 1;
				Static305.anIntArrayArray45[local3][local8 - 1] = local203;
				local68 = local68 + 1 & 0xFFF;
			}
			if (local8 < 102 && Static302.anIntArrayArray42[local3][local8 + 1] == 0 && (local75[local3][local8 + 2] & 0x2C0138) == 0 && (local75[local3 + 1][local8 + 2] & 0x2C01E0) == 0) {
				Static260.anIntArray493[local68] = local3;
				Static130.anIntArray293[local68] = local8 + 1;
				Static302.anIntArrayArray42[local3][local8 + 1] = 4;
				local68 = local68 + 1 & 0xFFF;
				Static305.anIntArrayArray45[local3][local8 + 1] = local203;
			}
			if (local3 > 0 && local8 > 0 && Static302.anIntArrayArray42[local3 - 1][local8 - 1] == 0 && (local75[local3 - 1][local8] & 0x2C013E) == 0 && (local75[local3 - 1][local8 - 1] & 0x2C010E) == 0 && (local75[local3][local8 - 1] & 0x2C018F) == 0) {
				Static260.anIntArray493[local68] = local3 - 1;
				Static130.anIntArray293[local68] = local8 - 1;
				local68 = local68 + 1 & 0xFFF;
				Static302.anIntArrayArray42[local3 - 1][local8 - 1] = 3;
				Static305.anIntArrayArray45[local3 - 1][local8 - 1] = local203;
			}
			if (local3 < 102 && local8 > 0 && Static302.anIntArrayArray42[local3 + 1][local8 - 1] == 0 && (local75[local3 + 1][local8 - 1] & 0x2C018F) == 0 && (local75[local3 + 2][local8 - 1] & 0x2C0183) == 0 && (local75[local3 + 2][local8] & 0x2C01E3) == 0) {
				Static260.anIntArray493[local68] = local3 + 1;
				Static130.anIntArray293[local68] = local8 - 1;
				local68 = local68 + 1 & 0xFFF;
				Static302.anIntArrayArray42[local3 + 1][local8 - 1] = 9;
				Static305.anIntArrayArray45[local3 + 1][local8 - 1] = local203;
			}
			if (local3 > 0 && local8 < 102 && Static302.anIntArrayArray42[local3 - 1][local8 + 1] == 0 && (local75[local3 - 1][local8 + 1] & 0x2C013E) == 0 && (local75[local3 - 1][local8 + 2] & 0x2C0138) == 0 && (local75[local3][local8 + 2] & 0x2C01F8) == 0) {
				Static260.anIntArray493[local68] = local3 - 1;
				Static130.anIntArray293[local68] = local8 + 1;
				local68 = local68 + 1 & 0xFFF;
				Static302.anIntArrayArray42[local3 - 1][local8 + 1] = 6;
				Static305.anIntArrayArray45[local3 - 1][local8 + 1] = local203;
			}
			if (local3 < 102 && local8 < 102 && Static302.anIntArrayArray42[local3 + 1][local8 + 1] == 0 && (local75[local3 + 1][local8 + 2] & 0x2C01F8) == 0 && (local75[local3 + 2][local8 + 2] & 0x2C01E0) == 0 && (local75[local3 + 2][local8 + 1] & 0x2C01E3) == 0) {
				Static260.anIntArray493[local68] = local3 + 1;
				Static130.anIntArray293[local68] = local8 + 1;
				Static302.anIntArrayArray42[local3 + 1][local8 + 1] = 12;
				Static305.anIntArrayArray45[local3 + 1][local8 + 1] = local203;
				local68 = local68 + 1 & 0xFFF;
			}
		}
		if (!local65) {
			local203 = 1000;
			@Pc(916) int local916 = 100;
			for (@Pc(923) int local923 = arg5 - 10; local923 <= arg5 + 10; local923++) {
				for (@Pc(938) int local938 = arg1 - 10; local938 <= arg1 + 10; local938++) {
					if (local923 >= 0 && local938 >= 0 && local923 < 104 && local938 < 104 && Static305.anIntArrayArray45[local923][local938] < 100) {
						@Pc(972) int local972 = 0;
						@Pc(974) int local974 = 0;
						if (local938 < arg1) {
							local974 = arg1 - local938;
						} else if (arg1 + arg4 - 1 < local938) {
							local974 = local938 + 1 - arg4 - arg1;
						}
						if (local923 < arg5) {
							local972 = arg5 - local923;
						} else if (local923 > arg6 + arg5 - 1) {
							local972 = local923 + 1 - arg5 - arg6;
						}
						@Pc(1043) int local1043 = local972 * local972 + local974 * local974;
						if (local1043 < local203 || local1043 == local203 && Static305.anIntArrayArray45[local923][local938] < local916) {
							local8 = local938;
							local3 = local923;
							local916 = Static305.anIntArrayArray45[local923][local938];
							local203 = local1043;
						}
					}
				}
			}
			if (local203 == 1000) {
				return;
			}
			if (arg2 == local3 && local8 == arg8) {
				return;
			}
		}
		Static269.anInt5272 = local8;
		Static34.aBoolean52 = false;
		Static302.anInt5847 = local3;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IZ)V")
	public static void method941() {
		Static203.aClass157_34.method4034(5);
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(IIIII)V")
	public static void method942(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) float local13 = (float) Static250.anInt3119 / (float) Static250.anInt3121;
		@Pc(15) int local15 = arg3;
		Static54.anInt1326 = -1;
		@Pc(19) int local19 = arg2;
		Static18.anInt388 = -1;
		if (local13 < 1.0F) {
			local19 = (int) (local13 * (float) arg3);
		} else {
			local15 = (int) ((float) arg2 / local13);
		}
		@Pc(52) int local52 = arg1 - (arg2 - local19) / 2;
		@Pc(61) int local61 = arg0 - (arg3 - local15) / 2;
		Static237.anInt4776 = local61 * Static250.anInt3121 / local15;
		Static67.anInt1659 = Static250.anInt3119 * local52 / local19;
		Static202.method2140();
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!g;I)Ljava/lang/String;")
	public static String method943(@OriginalArg(0) Class56 arg0) {
		if (Static42.method804(arg0).method340() == 0) {
			return null;
		} else if (arg0.aString76 == null || arg0.aString76.trim().length() == 0) {
			return Static199.aBoolean295 ? "Hidden-use" : null;
		} else {
			return arg0.aString76;
		}
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(B)V")
	public static void method944() {
		if (Static137.anInt3071 == 0) {
			return;
		}
		try {
			if (++Static21.anInt457 > 1500) {
				if (Static253.aClass34_3 != null) {
					Static253.aClass34_3.method1077();
					Static253.aClass34_3 = null;
				}
				if (Static293.anInt5704 >= 1) {
					Static137.anInt3071 = 0;
					Static93.anInt2262 = -5;
					return;
				}
				Static21.anInt457 = 0;
				if (Static276.anInt5458 == Static195.anInt6032) {
					Static276.anInt5458 = Static284.anInt5624;
				} else {
					Static276.anInt5458 = Static195.anInt6032;
				}
				Static137.anInt3071 = 1;
				Static293.anInt5704++;
			}
			if (Static137.anInt3071 == 1) {
				Static146.aClass111_3 = Static164.aClass102_2.method2881(Static276.anInt5458, Static204.aString146);
				Static137.anInt3071 = 2;
			}
			@Pc(124) int local124;
			if (Static137.anInt3071 == 2) {
				if (Static146.aClass111_3.anInt3788 == 2) {
					throw new IOException();
				}
				if (Static146.aClass111_3.anInt3788 != 1) {
					return;
				}
				Static253.aClass34_3 = new Class34((Socket) Static146.aClass111_3.anObject4, Static164.aClass102_2);
				Static146.aClass111_3 = null;
				Static253.aClass34_3.method1076(Static211.aClass2_Sub16_Sub1_2.aByteArray17, Static211.aClass2_Sub16_Sub1_2.anInt2789);
				if (Static48.aClass43_2 != null) {
					Static48.aClass43_2.method2443();
				}
				if (Static22.aClass43_1 != null) {
					Static22.aClass43_1.method2443();
				}
				local124 = Static253.aClass34_3.method1070();
				if (Static48.aClass43_2 != null) {
					Static48.aClass43_2.method2443();
				}
				if (Static22.aClass43_1 != null) {
					Static22.aClass43_1.method2443();
				}
				if (local124 != 101) {
					Static93.anInt2262 = local124;
					Static137.anInt3071 = 0;
					Static253.aClass34_3.method1077();
					Static253.aClass34_3 = null;
					return;
				}
				Static137.anInt3071 = 3;
			}
			if (Static137.anInt3071 == 3) {
				if (Static253.aClass34_3.method1073() >= 2) {
					local124 = Static253.aClass34_3.method1070() << 8 | Static253.aClass34_3.method1070();
					Static206.method3477(local124);
					if (Static74.anInt1836 != -1) {
						Static137.anInt3071 = 0;
						Static253.aClass34_3.method1077();
						Static253.aClass34_3 = null;
						Static199.method3564();
						return;
					}
					Static93.anInt2262 = 6;
					Static137.anInt3071 = 0;
					Static253.aClass34_3.method1077();
					Static253.aClass34_3 = null;
					return;
				}
				return;
			}
		} catch (@Pc(206) IOException local206) {
			if (Static253.aClass34_3 != null) {
				Static253.aClass34_3.method1077();
				Static253.aClass34_3 = null;
			}
			if (Static293.anInt5704 < 1) {
				if (Static195.anInt6032 == Static276.anInt5458) {
					Static276.anInt5458 = Static284.anInt5624;
				} else {
					Static276.anInt5458 = Static195.anInt6032;
				}
				Static21.anInt457 = 0;
				Static293.anInt5704++;
				Static137.anInt3071 = 1;
			} else {
				Static93.anInt2262 = -4;
				Static137.anInt3071 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "c", descriptor = "(II)I")
	public static int method945(@OriginalArg(0) int arg0) {
		@Pc(10) double local10 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(19) double local19 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(26) double local26 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(37) double local37 = local19;
		@Pc(39) double local39 = 0.0D;
		@Pc(41) double local41 = local19;
		if (local19 < local10) {
			local41 = local10;
		}
		@Pc(50) double local50 = 0.0D;
		if (local10 < local19) {
			local37 = local10;
		}
		if (local41 < local26) {
			local41 = local26;
		}
		if (local37 > local26) {
			local37 = local26;
		}
		@Pc(75) double local75 = (local37 + local41) / 2.0D;
		if (local37 != local41) {
			if (local41 == local19) {
				local50 = (local10 - local26) / (local41 - local37);
			} else if (local41 == local10) {
				local50 = (local26 - local19) / (local41 - local37) + 2.0D;
			} else if (local41 == local26) {
				local50 = (local19 - local10) / (local41 - local37) + 4.0D;
			}
			if (local75 < 0.5D) {
				local39 = (local41 - local37) / (local37 + local41);
			}
			if (local75 >= 0.5D) {
				local39 = (local41 - local37) / (2.0D - local41 - local37);
			}
		}
		@Pc(160) int local160 = (int) (local39 * 256.0D);
		if (local160 < 0) {
			local160 = 0;
		} else if (local160 > 255) {
			local160 = 255;
		}
		local50 /= 6.0D;
		@Pc(182) int local182 = (int) (local50 * 256.0D);
		@Pc(187) int local187 = (int) (local75 * 256.0D);
		if (local187 < 0) {
			local187 = 0;
		} else if (local187 > 255) {
			local187 = 255;
		}
		if (local187 > 243) {
			local160 >>= 0x4;
		} else if (local187 > 217) {
			local160 >>= 0x3;
		} else if (local187 > 192) {
			local160 >>= 0x2;
		} else if (local187 > 179) {
			local160 >>= 0x1;
		}
		return (local187 >> 1) + (local160 >> 5 << 7) + (local182 >> 2 << 10);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIIIII)V")
	public static void method946(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg3 - arg2;
		@Pc(15) int local15 = arg4 - arg2;
		@Pc(19) int local19 = arg3 * arg3;
		@Pc(21) int local21 = 0;
		@Pc(25) int local25 = arg4 * arg4;
		@Pc(27) int local27 = arg4;
		@Pc(31) int local31 = local15 * local15;
		@Pc(35) int local35 = local25 << 1;
		@Pc(39) int local39 = local11 * local11;
		@Pc(43) int local43 = local19 << 1;
		@Pc(47) int local47 = local31 << 1;
		@Pc(51) int local51 = local39 << 1;
		@Pc(55) int local55 = local15 << 1;
		@Pc(59) int local59 = arg4 << 1;
		@Pc(68) int local68 = local25 - (local59 - 1) * local43;
		@Pc(78) int local78 = local39 * (1 - local55) + local47;
		@Pc(82) int local82 = local19 << 2;
		@Pc(91) int local91 = local35 + local19 * (1 - local59);
		@Pc(99) int local99 = local31 - (local55 - 1) * local51;
		@Pc(103) int local103 = local25 << 2;
		@Pc(107) int local107 = local31 << 2;
		@Pc(111) int local111 = local39 << 2;
		@Pc(115) int local115 = local35 * 3;
		@Pc(121) int local121 = local43 * (local59 - 3);
		@Pc(127) int local127 = local51 * (local55 - 3);
		@Pc(131) int local131 = local47 * 3;
		@Pc(133) int local133 = local107;
		@Pc(135) int local135 = local103;
		@Pc(141) int local141 = (arg4 - 1) * local82;
		@Pc(147) int local147 = local111 * (local15 - 1);
		@Pc(151) int[] local151 = Static275.anIntArrayArray37[arg1];
		Static25.method486(local151, arg0 - arg3, -local11 + arg0, arg5);
		Static25.method486(local151, arg0 - local11, arg0 + local11, arg6);
		Static25.method486(local151, local11 + arg0, arg3 + arg0, arg5);
		while (local27 > 0) {
			if (local91 < 0) {
				while (local91 < 0) {
					local7++;
					local91 += local115;
					local115 += local103;
					local68 += local135;
					local135 += local103;
				}
			}
			if (local68 < 0) {
				local7++;
				local68 += local135;
				local135 += local103;
				local91 += local115;
				local115 += local103;
			}
			local68 += -local121;
			local121 -= local82;
			local91 += -local141;
			@Pc(254) boolean local254 = local27 <= local15;
			if (local254) {
				if (local78 < 0) {
					while (local78 < 0) {
						local99 += local133;
						local133 += local107;
						local21++;
						local78 += local131;
						local131 += local107;
					}
				}
				if (local99 < 0) {
					local99 += local133;
					local133 += local107;
					local21++;
					local78 += local131;
					local131 += local107;
				}
				local99 += -local127;
				local78 += -local147;
				local147 -= local111;
				local127 -= local111;
			}
			local27--;
			local141 -= local82;
			@Pc(330) int local330 = arg1 - local27;
			@Pc(334) int local334 = local7 + arg0;
			@Pc(339) int local339 = arg0 - local7;
			@Pc(344) int local344 = arg1 + local27;
			if (local254) {
				@Pc(368) int local368 = local21 + arg0;
				@Pc(373) int local373 = arg0 - local21;
				Static25.method486(Static275.anIntArrayArray37[local330], local339, local373, arg5);
				Static25.method486(Static275.anIntArrayArray37[local330], local373, local368, arg6);
				Static25.method486(Static275.anIntArrayArray37[local330], local368, local334, arg5);
				Static25.method486(Static275.anIntArrayArray37[local344], local339, local373, arg5);
				Static25.method486(Static275.anIntArrayArray37[local344], local373, local368, arg6);
				Static25.method486(Static275.anIntArrayArray37[local344], local368, local334, arg5);
			} else {
				Static25.method486(Static275.anIntArrayArray37[local330], local339, local334, arg5);
				Static25.method486(Static275.anIntArrayArray37[local344], local339, local334, arg5);
			}
		}
	}
}
