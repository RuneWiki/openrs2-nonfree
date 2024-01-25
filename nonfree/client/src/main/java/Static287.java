import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!qj", name = "i", descriptor = "I")
	public static int anInt4942;

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "I")
	public static final int anInt4935 = 1403;

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "([[[Lclient!ke;ZIIII)Z")
	public static boolean method4351(@OriginalArg(0) Class132[][][] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(19) byte local19 = arg1 ? 1 : (byte) (Static32.anInt649 & 0xFF);
		if (Static383.aByteArrayArrayArray17[Static122.anInt2188][arg2][arg3] == local19) {
			return false;
		} else if ((Static373.aByteArrayArrayArray16[Static122.anInt2188][arg2][arg3] & 0x4) == 0) {
			return false;
		} else {
			@Pc(51) byte local51 = 0;
			@Pc(53) int local53 = 0;
			Static370.anIntArray716[0] = arg2;
			@Pc(60) int local60 = local51 + 1;
			Static230.anIntArray725[0] = arg3;
			Static383.aByteArrayArrayArray17[Static122.anInt2188][arg2][arg3] = local19;
			while (local53 != local60) {
				@Pc(78) int local78 = Static370.anIntArray716[local53] & 0xFFFF;
				@Pc(86) int local86 = Static370.anIntArray716[local53] >> 16 & 0xFF;
				@Pc(94) int local94 = Static370.anIntArray716[local53] >> 24 & 0xFF;
				@Pc(100) int local100 = Static230.anIntArray725[local53] & 0xFFFF;
				@Pc(108) int local108 = Static230.anIntArray725[local53] >> 16 & 0xFF;
				local53 = local53 + 1 & 0xFFF;
				@Pc(116) boolean local116 = false;
				if ((Static373.aByteArrayArrayArray16[Static122.anInt2188][local78][local100] & 0x4) == 0) {
					local116 = true;
				}
				@Pc(130) boolean local130 = false;
				@Pc(172) int local172;
				@Pc(222) int local222;
				label231: for (@Pc(134) int local134 = Static122.anInt2188 + 1; local134 <= 3; local134++) {
					if ((Static373.aByteArrayArrayArray16[local134][local78][local100] & 0x8) == 0) {
						@Pc(330) Class25_Sub1 local330;
						@Pc(340) int local340;
						@Pc(319) Class132 local319;
						@Pc(325) Class116 local325;
						if (local116 && arg0[local134][local78][local100] != null) {
							if (arg0[local134][local78][local100].aClass25_Sub5_1 != null) {
								local172 = Static146.method2196(local86);
								if (arg0[local134][local78][local100].aClass25_Sub5_1.anInt4753 == local172 || arg0[local134][local78][local100].aClass25_Sub5_2 != null && local172 == arg0[local134][local78][local100].aClass25_Sub5_2.anInt4753) {
									continue;
								}
								if (local94 != 0) {
									local222 = Static146.method2196(local94);
									if (arg0[local134][local78][local100].aClass25_Sub5_1.anInt4753 == local222 || arg0[local134][local78][local100].aClass25_Sub5_2 != null && local222 == arg0[local134][local78][local100].aClass25_Sub5_2.anInt4753) {
										continue;
									}
								}
								if (local108 != 0) {
									local222 = Static146.method2196(local108);
									if (arg0[local134][local78][local100].aClass25_Sub5_1.anInt4753 == local222 || arg0[local134][local78][local100].aClass25_Sub5_2 != null && local222 == arg0[local134][local78][local100].aClass25_Sub5_2.anInt4753) {
										continue;
									}
								}
							}
							local319 = arg0[local134][local78][local100];
							if (local319.aClass116_3 != null) {
								for (local325 = local319.aClass116_3; local325 != null; local325 = local325.aClass116_2) {
									local330 = local325.aClass25_Sub1_1;
									if (local330 instanceof Interface6) {
										@Pc(336) Interface6 local336 = (Interface6) local330;
										local340 = local336.method5246();
										@Pc(344) int local344 = local336.method5251();
										if (local340 == 21) {
											local340 = 19;
										}
										@Pc(355) int local355 = local344 << 6 | local340;
										if (local86 == local355 || local94 != 0 && local94 == local355 || local108 != 0 && local355 == local108) {
											continue label231;
										}
									}
								}
							}
						}
						local319 = arg0[local134][local78][local100];
						if (local319 != null && local319.aClass116_3 != null) {
							for (local325 = local319.aClass116_3; local325 != null; local325 = local325.aClass116_2) {
								local330 = local325.aClass25_Sub1_1;
								if (local330.aShort87 != local330.aShort88 || local330.aShort90 != local330.aShort89) {
									for (@Pc(425) int local425 = local330.aShort88; local425 <= local330.aShort87; local425++) {
										for (local340 = local330.aShort89; local340 <= local330.aShort90; local340++) {
											Static383.aByteArrayArrayArray17[local134][local425][local340] = local19;
										}
									}
								}
							}
						}
						local130 = true;
						Static383.aByteArrayArrayArray17[local134][local78][local100] = local19;
					}
				}
				if (local130) {
					local172 = Static229.aClass42Array3[Static122.anInt2188 + 1].method3060(local78, local100);
					if (local172 > Static223.anIntArray479[arg4]) {
						Static223.anIntArray479[arg4] = local172;
					}
					local222 = local78 << 7;
					if (local222 < Static81.anIntArray196[arg4]) {
						Static81.anIntArray196[arg4] = local222;
					} else if (Static275.anIntArray581[arg4] < local222) {
						Static275.anIntArray581[arg4] = local222;
					}
					@Pc(531) int local531 = local100 << 7;
					if (Static277.anIntArray586[arg4] > local531) {
						Static277.anIntArray586[arg4] = local531;
					} else if (local531 > Static371.anIntArray329[arg4]) {
						Static371.anIntArray329[arg4] = local531;
					}
				}
				if (!local116) {
					if (local78 >= 1 && Static383.aByteArrayArrayArray17[Static122.anInt2188][local78 - 1][local100] != local19) {
						Static370.anIntArray716[local60] = 0xD3000000 | 0x120000 | local78 - 1;
						Static230.anIntArray725[local60] = local100 | 0x130000;
						Static383.aByteArrayArrayArray17[Static122.anInt2188][local78 - 1][local100] = local19;
						local60 = local60 + 1 & 0xFFF;
					}
					@Pc(612) int local612 = ~Static262.anInt6340;
					local100++;
					if (local612 < ~local100) {
						if (local78 - 1 >= 0 && local19 != Static383.aByteArrayArrayArray17[Static122.anInt2188][local78 - 1][local100] && (Static373.aByteArrayArrayArray16[Static122.anInt2188][local78][local100] & 0x4) == 0 && (Static373.aByteArrayArrayArray16[Static122.anInt2188][local78 - 1][local100 - 1] & 0x4) == 0) {
							Static370.anIntArray716[local60] = local78 - 1 | 0x120000 | 0x52000000;
							Static230.anIntArray725[local60] = local100 | 0x130000;
							Static383.aByteArrayArrayArray17[Static122.anInt2188][local78 - 1][local100] = local19;
							local60 = local60 + 1 & 0xFFF;
						}
						if (local19 != Static383.aByteArrayArrayArray17[Static122.anInt2188][local78][local100]) {
							Static370.anIntArray716[local60] = local78 | 0x520000 | 0x13000000;
							Static230.anIntArray725[local60] = local100 | 0x530000;
							Static383.aByteArrayArrayArray17[Static122.anInt2188][local78][local100] = local19;
							local60 = local60 + 1 & 0xFFF;
						}
						if (Static92.anInt1675 > local78 + 1 && local19 != Static383.aByteArrayArrayArray17[Static122.anInt2188][local78 + 1][local100] && (Static373.aByteArrayArrayArray16[Static122.anInt2188][local78][local100] & 0x4) == 0 && (Static373.aByteArrayArrayArray16[Static122.anInt2188][local78 + 1][local100 - 1] & 0x4) == 0) {
							Static370.anIntArray716[local60] = 0x92000000 | 0x520000 | local78 + 1;
							Static230.anIntArray725[local60] = local100 | 0x530000;
							Static383.aByteArrayArrayArray17[Static122.anInt2188][local78 + 1][local100] = local19;
							local60 = local60 + 1 & 0xFFF;
						}
					}
					local100--;
					if (Static92.anInt1675 > local78 + 1 && local19 != Static383.aByteArrayArrayArray17[Static122.anInt2188][local78 + 1][local100]) {
						Static370.anIntArray716[local60] = local78 + 1 | 0x53000000 | 0x920000;
						Static230.anIntArray725[local60] = local100 | 0x930000;
						local60 = local60 + 1 & 0xFFF;
						Static383.aByteArrayArrayArray17[Static122.anInt2188][local78 + 1][local100] = local19;
					}
					local100--;
					if (local100 >= 0) {
						if (local78 - 1 >= 0 && Static383.aByteArrayArrayArray17[Static122.anInt2188][local78 - 1][local100] != local19 && (Static373.aByteArrayArrayArray16[Static122.anInt2188][local78][local100] & 0x4) == 0 && (Static373.aByteArrayArrayArray16[Static122.anInt2188][local78 - 1][local100 + 1] & 0x4) == 0) {
							Static370.anIntArray716[local60] = local78 - 1 | 0x12000000 | 0xD20000;
							Static230.anIntArray725[local60] = local100 | 0xD30000;
							local60 = local60 + 1 & 0xFFF;
							Static383.aByteArrayArrayArray17[Static122.anInt2188][local78 - 1][local100] = local19;
						}
						if (local19 != Static383.aByteArrayArrayArray17[Static122.anInt2188][local78][local100]) {
							Static370.anIntArray716[local60] = local78 | 0xD20000 | 0x93000000;
							Static230.anIntArray725[local60] = local100 | 0xD30000;
							local60 = local60 + 1 & 0xFFF;
							Static383.aByteArrayArrayArray17[Static122.anInt2188][local78][local100] = local19;
						}
						if (Static92.anInt1675 > local78 + 1 && Static383.aByteArrayArrayArray17[Static122.anInt2188][local78 + 1][local100] != local19 && (Static373.aByteArrayArrayArray16[Static122.anInt2188][local78][local100] & 0x4) == 0 && (Static373.aByteArrayArrayArray16[Static122.anInt2188][local78 + 1][local100 + 1] & 0x4) == 0) {
							Static370.anIntArray716[local60] = local78 + 1 | 0xD2000000 | 0x920000;
							Static230.anIntArray725[local60] = local100 | 0x930000;
							Static383.aByteArrayArrayArray17[Static122.anInt2188][local78 + 1][local100] = local19;
							local60 = local60 + 1 & 0xFFF;
						}
					}
				}
			}
			if (Static223.anIntArray479[arg4] != -1000000) {
				Static223.anIntArray479[arg4] += 10;
				Static81.anIntArray196[arg4] -= 50;
				Static275.anIntArray581[arg4] += 50;
				Static371.anIntArray329[arg4] += 50;
				Static277.anIntArray586[arg4] -= 50;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IILclient!e;II)V")
	public static void method4353(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub11 arg2, @OriginalArg(3) int arg3) {
		@Pc(16) long local16 = (long) (arg3 << 28 | arg0 << 14 | arg1);
		@Pc(22) Class1_Sub12 local22 = (Class1_Sub12) Static338.aClass77_34.method1368(local16);
		if (local22 == null) {
			local22 = new Class1_Sub12();
			Static338.aClass77_34.method1370(local16, local22);
			local22.aClass17_12.method199(arg2);
			return;
		}
		@Pc(54) Class88 local54 = Static263.aClass102_2.method2172(arg2.anInt1462);
		@Pc(57) int local57 = local54.anInt2019;
		if (local54.anInt2018 == 1) {
			local57 *= arg2.anInt1460 + 1;
		}
		for (@Pc(74) Class1_Sub11 local74 = (Class1_Sub11) local22.aClass17_12.method202(); local74 != null; local74 = (Class1_Sub11) local22.aClass17_12.method207()) {
			local54 = Static263.aClass102_2.method2172(local74.anInt1462);
			@Pc(85) int local85 = local54.anInt2019;
			if (local54.anInt2018 == 1) {
				local85 *= local74.anInt1460 + 1;
			}
			if (local85 < local57) {
				Static298.method1645(arg2, local74);
				return;
			}
		}
		local22.aClass17_12.method199(arg2);
	}
}
