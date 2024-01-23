import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!rg", name = "r", descriptor = "I")
	public static int anInt4143;

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "Lclient!jd;")
	public static Class61 aClass61_71 = new Class61(500);

	@OriginalMember(owner = "client!rg", name = "k", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1084 = Static231.method3737("Verbindung mit Update)2Server)3)3)3");

	@OriginalMember(owner = "client!rg", name = "p", descriptor = "Lclient!o;")
	public static Class86 aClass86_14 = null;

	@OriginalMember(owner = "client!rg", name = "q", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1085 = Static231.method3737("welle:");

	@OriginalMember(owner = "client!rg", name = "s", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1086 = Static231.method3737("Speicher wird zugewiesen)3");

	@OriginalMember(owner = "client!rg", name = "t", descriptor = "I")
	public static int anInt4144 = 0;

	@OriginalMember(owner = "client!rg", name = "u", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1087 = Static231.method3737("Ablegen");

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(I[[[Lclient!fa;ZIII)Z")
	public static boolean method3038(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub9[][][] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) byte local10 = arg2 ? 1 : (byte) (Static157.anInt3451 & 0xFF);
		if (local10 == Static186.aByteArrayArrayArray11[Static191.anInt4237][arg0][arg4]) {
			return false;
		} else if ((Static221.aByteArrayArrayArray14[Static191.anInt4237][arg0][arg4] & 0x4) == 0) {
			return false;
		} else {
			@Pc(42) int local42 = 0;
			@Pc(44) byte local44 = 0;
			Static157.anIntArray302[0] = arg0;
			@Pc(51) int local51 = local44 + 1;
			Static11.anIntArray34[0] = arg4;
			Static186.aByteArrayArrayArray11[Static191.anInt4237][arg0][arg4] = local10;
			while (local51 != local42) {
				@Pc(69) int local69 = Static157.anIntArray302[local42] & 0xFFFF;
				@Pc(77) int local77 = Static157.anIntArray302[local42] >> 24 & 0xFF;
				@Pc(83) int local83 = Static11.anIntArray34[local42] & 0xFFFF;
				@Pc(91) int local91 = Static157.anIntArray302[local42] >> 16 & 0xFF;
				@Pc(99) int local99 = Static11.anIntArray34[local42] >> 16 & 0xFF;
				@Pc(101) boolean local101 = false;
				local42 = local42 + 1 & 0xFFF;
				@Pc(109) boolean local109 = false;
				if ((Static221.aByteArrayArrayArray14[Static191.anInt4237][local69][local83] & 0x4) == 0) {
					local109 = true;
				}
				@Pc(166) int local166;
				@Pc(203) int local203;
				label223: for (@Pc(128) int local128 = Static191.anInt4237 + 1; local128 <= 3; local128++) {
					if ((Static221.aByteArrayArrayArray14[local128][local69][local83] & 0x8) == 0) {
						@Pc(324) int local324;
						if (local109 && arg1[local128][local69][local83] != null) {
							if (arg1[local128][local69][local83].aClass97_1 != null) {
								local166 = Static129.method2153(local91);
								if (arg1[local128][local69][local83].aClass97_1.anInt3712 == local166 || local166 == arg1[local128][local69][local83].aClass97_1.anInt3713) {
									continue;
								}
								if (local77 != 0) {
									local203 = Static129.method2153(local77);
									if (arg1[local128][local69][local83].aClass97_1.anInt3712 == local203 || arg1[local128][local69][local83].aClass97_1.anInt3713 == local203) {
										continue;
									}
								}
								if (local99 != 0) {
									local203 = Static129.method2153(local99);
									if (local203 == arg1[local128][local69][local83].aClass97_1.anInt3712 || arg1[local128][local69][local83].aClass97_1.anInt3713 == local203) {
										continue;
									}
								}
							}
							if (arg1[local128][local69][local83].aClass99Array2 != null) {
								for (local166 = 0; local166 < arg1[local128][local69][local83].anInt1416; local166++) {
									local203 = (int) (arg1[local128][local69][local83].aClass99Array2[local166].aLong140 >> 14 & 0x3FL);
									if (local203 == 21) {
										local203 = 19;
									}
									@Pc(318) int local318 = (int) (arg1[local128][local69][local83].aClass99Array2[local166].aLong140 >> 20 & 0x3L);
									local324 = local203 | local318 << 6;
									if (local91 == local324 || local77 != 0 && local77 == local324 || local99 != 0 && local99 == local324) {
										continue label223;
									}
								}
							}
						}
						local101 = true;
						@Pc(378) Class1_Sub9 local378 = arg1[local128][local69][local83];
						if (local378 != null && local378.anInt1416 > 0) {
							for (local203 = 0; local203 < local378.anInt1416; local203++) {
								@Pc(392) Class99 local392 = local378.aClass99Array2[local203];
								if (local392.anInt3807 != local392.anInt3819 || local392.anInt3808 != local392.anInt3811) {
									for (local324 = local392.anInt3819; local324 <= local392.anInt3807; local324++) {
										for (@Pc(414) int local414 = local392.anInt3808; local414 <= local392.anInt3811; local414++) {
											Static186.aByteArrayArrayArray11[local128][local324][local414] = local10;
										}
									}
								}
							}
						}
						Static186.aByteArrayArrayArray11[local128][local69][local83] = local10;
					}
				}
				if (local101) {
					if (Static165.anIntArray226[arg3] < Static166.anIntArrayArrayArray11[Static191.anInt4237 + 1][local69][local83]) {
						Static165.anIntArray226[arg3] = Static166.anIntArrayArrayArray11[Static191.anInt4237 + 1][local69][local83];
					}
					local166 = local69 << 7;
					if (Static158.anIntArray304[arg3] > local166) {
						Static158.anIntArray304[arg3] = local166;
					} else if (local166 > Static230.anIntArray381[arg3]) {
						Static230.anIntArray381[arg3] = local166;
					}
					local203 = local83 << 7;
					if (Static96.anIntArray211[arg3] > local203) {
						Static96.anIntArray211[arg3] = local203;
					} else if (Static191.anIntArray348[arg3] < local203) {
						Static191.anIntArray348[arg3] = local203;
					}
				}
				if (!local109) {
					if (local69 >= 1 && local10 != Static186.aByteArrayArrayArray11[Static191.anInt4237][local69 - 1][local83]) {
						Static157.anIntArray302[local51] = local69 - 1 | 0x120000 | 0xD3000000;
						Static11.anIntArray34[local51] = local83 | 0x130000;
						local51 = local51 + 1 & 0xFFF;
						Static186.aByteArrayArrayArray11[Static191.anInt4237][local69 - 1][local83] = local10;
					}
					local83++;
					if (local83 < 104) {
						if (local69 - 1 >= 0 && Static186.aByteArrayArrayArray11[Static191.anInt4237][local69 - 1][local83] != local10 && (Static221.aByteArrayArrayArray14[Static191.anInt4237][local69][local83] & 0x4) == 0 && (Static221.aByteArrayArrayArray14[Static191.anInt4237][local69 - 1][local83 - 1] & 0x4) == 0) {
							Static157.anIntArray302[local51] = local69 - 1 | 0x120000 | 0x52000000;
							Static11.anIntArray34[local51] = local83 | 0x130000;
							local51 = local51 + 1 & 0xFFF;
							Static186.aByteArrayArrayArray11[Static191.anInt4237][local69 - 1][local83] = local10;
						}
						if (local10 != Static186.aByteArrayArrayArray11[Static191.anInt4237][local69][local83]) {
							Static157.anIntArray302[local51] = local69 | 0x520000 | 0x13000000;
							Static11.anIntArray34[local51] = local83 | 0x530000;
							Static186.aByteArrayArrayArray11[Static191.anInt4237][local69][local83] = local10;
							local51 = local51 + 1 & 0xFFF;
						}
						if (local69 + 1 < 104 && Static186.aByteArrayArrayArray11[Static191.anInt4237][local69 + 1][local83] != local10 && (Static221.aByteArrayArrayArray14[Static191.anInt4237][local69][local83] & 0x4) == 0 && (Static221.aByteArrayArrayArray14[Static191.anInt4237][local69 + 1][local83 - 1] & 0x4) == 0) {
							Static157.anIntArray302[local51] = local69 + 1 | 0x520000 | 0x92000000;
							Static11.anIntArray34[local51] = local83 | 0x530000;
							Static186.aByteArrayArrayArray11[Static191.anInt4237][local69 + 1][local83] = local10;
							local51 = local51 + 1 & 0xFFF;
						}
					}
					local83--;
					if (local69 + 1 < 104 && local10 != Static186.aByteArrayArrayArray11[Static191.anInt4237][local69 + 1][local83]) {
						Static157.anIntArray302[local51] = local69 + 1 | 0x920000 | 0x53000000;
						Static11.anIntArray34[local51] = local83 | 0x930000;
						local51 = local51 + 1 & 0xFFF;
						Static186.aByteArrayArrayArray11[Static191.anInt4237][local69 + 1][local83] = local10;
					}
					local83--;
					if (local83 >= 0) {
						if (local69 - 1 >= 0 && local10 != Static186.aByteArrayArrayArray11[Static191.anInt4237][local69 - 1][local83] && (Static221.aByteArrayArrayArray14[Static191.anInt4237][local69][local83] & 0x4) == 0 && (Static221.aByteArrayArrayArray14[Static191.anInt4237][local69 - 1][local83 + 1] & 0x4) == 0) {
							Static157.anIntArray302[local51] = 0x12000000 | 0xD20000 | local69 - 1;
							Static11.anIntArray34[local51] = local83 | 0xD30000;
							Static186.aByteArrayArrayArray11[Static191.anInt4237][local69 - 1][local83] = local10;
							local51 = local51 + 1 & 0xFFF;
						}
						if (local10 != Static186.aByteArrayArrayArray11[Static191.anInt4237][local69][local83]) {
							Static157.anIntArray302[local51] = local69 | 0xD20000 | 0x93000000;
							Static11.anIntArray34[local51] = local83 | 0xD30000;
							local51 = local51 + 1 & 0xFFF;
							Static186.aByteArrayArrayArray11[Static191.anInt4237][local69][local83] = local10;
						}
						if (local69 + 1 < 104 && local10 != Static186.aByteArrayArrayArray11[Static191.anInt4237][local69 + 1][local83] && (Static221.aByteArrayArrayArray14[Static191.anInt4237][local69][local83] & 0x4) == 0 && (Static221.aByteArrayArrayArray14[Static191.anInt4237][local69 + 1][local83 + 1] & 0x4) == 0) {
							Static157.anIntArray302[local51] = local69 + 1 | 0x920000 | 0xD2000000;
							Static11.anIntArray34[local51] = local83 | 0x930000;
							Static186.aByteArrayArrayArray11[Static191.anInt4237][local69 + 1][local83] = local10;
							local51 = local51 + 1 & 0xFFF;
						}
					}
				}
			}
			if (Static165.anIntArray226[arg3] != -1000000) {
				Static165.anIntArray226[arg3] += 10;
				Static158.anIntArray304[arg3] -= 50;
				Static230.anIntArray381[arg3] += 50;
				Static191.anIntArray348[arg3] += 50;
				Static96.anIntArray211[arg3] -= 50;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIIII)V")
	public static void method3039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static73.anInt1679 = arg4;
		Static194.anInt4293 = arg3;
		Static40.anInt854 = arg2;
		Static31.anInt2865 = arg1;
		Static171.anInt3717 = arg0;
		if (Static194.anInt4293 >= 100) {
			@Pc(27) int local27 = Static73.anInt1679 * 128 + 64;
			@Pc(33) int local33 = Static31.anInt2865 * 128 + 64;
			@Pc(41) int local41 = Static130.method2174(Static191.anInt4237, local27, local33) - Static40.anInt854;
			@Pc(46) int local46 = local27 - Static29.anInt577;
			@Pc(51) int local51 = local41 - Static69.anInt1578;
			@Pc(56) int local56 = local33 - Static22.anInt435;
			@Pc(68) int local68 = (int) Math.sqrt((double) (local56 * local56 + local46 * local46));
			Static6.anInt2981 = (int) (Math.atan2((double) local51, (double) local68) * 325.949D) & 0x7FF;
			Static122.anInt2671 = (int) (Math.atan2((double) local56, (double) local46) * -325.949D) & 0x7FF;
			if (Static6.anInt2981 < 128) {
				Static6.anInt2981 = 128;
			}
			if (Static6.anInt2981 > 383) {
				Static6.anInt2981 = 383;
			}
		}
		Static61.anInt1480 = 2;
	}
}
