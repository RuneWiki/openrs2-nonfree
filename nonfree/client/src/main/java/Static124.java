import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!li", name = "V", descriptor = "I")
	public static int anInt2472;

	@OriginalMember(owner = "client!li", name = "db", descriptor = "Lclient!qh;")
	public static Class93 aClass93_73;

	@OriginalMember(owner = "client!li", name = "S", descriptor = "[Z")
	public static boolean[] aBooleanArray9 = new boolean[100];

	@OriginalMember(owner = "client!li", name = "U", descriptor = "I")
	public static int anInt2471 = 10;

	@OriginalMember(owner = "client!li", name = "Y", descriptor = "Lclient!mi;")
	public static Class75 aClass75_12 = new Class75();

	@OriginalMember(owner = "client!li", name = "eb", descriptor = "[S")
	public static short[] aShortArray39 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ZII[[[Lclient!eg;IZ)Z")
	public static boolean method1978(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub11[][][] arg3, @OriginalArg(4) int arg4) {
		@Pc(14) byte local14 = arg0 ? 1 : (byte) (Static1.anInt41 & 0xFF);
		if (Static217.aByteArrayArrayArray14[Static212.anInt4195][arg2][arg4] == local14) {
			return false;
		} else if ((Static159.aByteArrayArrayArray13[Static212.anInt4195][arg2][arg4] & 0x4) == 0) {
			return false;
		} else {
			@Pc(44) byte local44 = 0;
			Static86.anIntArray141[0] = arg2;
			@Pc(51) int local51 = local44 + 1;
			Static194.anIntArray446[0] = arg4;
			Static217.aByteArrayArrayArray14[Static212.anInt4195][arg2][arg4] = local14;
			@Pc(63) int local63 = 0;
			while (local51 != local63) {
				@Pc(73) int local73 = Static86.anIntArray141[local63] >> 16 & 0xFF;
				@Pc(79) int local79 = Static86.anIntArray141[local63] & 0xFFFF;
				@Pc(87) int local87 = Static86.anIntArray141[local63] >> 24 & 0xFF;
				@Pc(95) int local95 = Static194.anIntArray446[local63] >> 16 & 0xFF;
				@Pc(101) int local101 = Static194.anIntArray446[local63] & 0xFFFF;
				@Pc(103) boolean local103 = false;
				@Pc(105) boolean local105 = false;
				local63 = local63 + 1 & 0xFFF;
				if ((Static159.aByteArrayArrayArray13[Static212.anInt4195][local79][local101] & 0x4) == 0) {
					local103 = true;
				}
				@Pc(162) int local162;
				@Pc(195) int local195;
				label223: for (@Pc(127) int local127 = Static212.anInt4195 + 1; local127 <= 3; local127++) {
					if ((Static159.aByteArrayArrayArray13[local127][local79][local101] & 0x8) == 0) {
						@Pc(322) int local322;
						if (local103 && arg3[local127][local79][local101] != null) {
							if (arg3[local127][local79][local101].aClass29_1 != null) {
								local162 = Static210.method3286(local73);
								if (arg3[local127][local79][local101].aClass29_1.anInt1090 == local162 || arg3[local127][local79][local101].aClass29_1.anInt1086 == local162) {
									continue;
								}
								if (local87 != 0) {
									local195 = Static210.method3286(local87);
									if (arg3[local127][local79][local101].aClass29_1.anInt1090 == local195 || arg3[local127][local79][local101].aClass29_1.anInt1086 == local195) {
										continue;
									}
								}
								if (local95 != 0) {
									local195 = Static210.method3286(local95);
									if (arg3[local127][local79][local101].aClass29_1.anInt1090 == local195 || arg3[local127][local79][local101].aClass29_1.anInt1086 == local195) {
										continue;
									}
								}
							}
							if (arg3[local127][local79][local101].aClass94Array1 != null) {
								for (local162 = 0; local162 < arg3[local127][local79][local101].anInt1072; local162++) {
									local195 = (int) (arg3[local127][local79][local101].aClass94Array1[local162].aLong143 >> 14 & 0x3FL);
									if (local195 == 21) {
										local195 = 19;
									}
									@Pc(316) int local316 = (int) (arg3[local127][local79][local101].aClass94Array1[local162].aLong143 >> 20 & 0x3L);
									local322 = local195 | local316 << 6;
									if (local73 == local322 || local87 != 0 && local87 == local322 || local95 != 0 && local95 == local322) {
										continue label223;
									}
								}
							}
						}
						local105 = true;
						@Pc(369) Class1_Sub11 local369 = arg3[local127][local79][local101];
						if (local369 != null && local369.anInt1072 > 0) {
							for (local195 = 0; local195 < local369.anInt1072; local195++) {
								@Pc(383) Class94 local383 = local369.aClass94Array1[local195];
								if (local383.anInt3692 != local383.anInt3686 || local383.anInt3684 != local383.anInt3683) {
									for (local322 = local383.anInt3686; local322 <= local383.anInt3692; local322++) {
										for (@Pc(405) int local405 = local383.anInt3683; local405 <= local383.anInt3684; local405++) {
											Static217.aByteArrayArrayArray14[local127][local322][local405] = local14;
										}
									}
								}
							}
						}
						Static217.aByteArrayArrayArray14[local127][local79][local101] = local14;
					}
				}
				if (local105) {
					local195 = local101 << 7;
					if (Static172.anIntArray376[arg1] < Static119.anIntArrayArrayArray10[Static212.anInt4195 + 1][local79][local101]) {
						Static172.anIntArray376[arg1] = Static119.anIntArrayArrayArray10[Static212.anInt4195 + 1][local79][local101];
					}
					local162 = local79 << 7;
					if (Static232.anIntArray509[arg1] > local162) {
						Static232.anIntArray509[arg1] = local162;
					} else if (local162 > Static230.anIntArray331[arg1]) {
						Static230.anIntArray331[arg1] = local162;
					}
					if (Static85.anIntArray138[arg1] > local195) {
						Static85.anIntArray138[arg1] = local195;
					} else if (Static171.anIntArray375[arg1] < local195) {
						Static171.anIntArray375[arg1] = local195;
					}
				}
				if (!local103) {
					if (local79 >= 1 && local14 != Static217.aByteArrayArrayArray14[Static212.anInt4195][local79 - 1][local101]) {
						Static86.anIntArray141[local51] = local79 - 1 | 0x120000 | 0xD3000000;
						Static194.anIntArray446[local51] = local101 | 0x130000;
						Static217.aByteArrayArrayArray14[Static212.anInt4195][local79 - 1][local101] = local14;
						local51 = local51 + 1 & 0xFFF;
					}
					local101++;
					if (local101 < 104) {
						if (local79 - 1 >= 0 && Static217.aByteArrayArrayArray14[Static212.anInt4195][local79 - 1][local101] != local14 && (Static159.aByteArrayArrayArray13[Static212.anInt4195][local79][local101] & 0x4) == 0 && (Static159.aByteArrayArrayArray13[Static212.anInt4195][local79 - 1][local101 - 1] & 0x4) == 0) {
							Static86.anIntArray141[local51] = local79 - 1 | 0x52000000 | 0x120000;
							Static194.anIntArray446[local51] = local101 | 0x130000;
							local51 = local51 + 1 & 0xFFF;
							Static217.aByteArrayArrayArray14[Static212.anInt4195][local79 - 1][local101] = local14;
						}
						if (local14 != Static217.aByteArrayArrayArray14[Static212.anInt4195][local79][local101]) {
							Static86.anIntArray141[local51] = local79 | 0x520000 | 0x13000000;
							Static194.anIntArray446[local51] = local101 | 0x530000;
							Static217.aByteArrayArrayArray14[Static212.anInt4195][local79][local101] = local14;
							local51 = local51 + 1 & 0xFFF;
						}
						if (local79 + 1 < 104 && local14 != Static217.aByteArrayArrayArray14[Static212.anInt4195][local79 + 1][local101] && (Static159.aByteArrayArrayArray13[Static212.anInt4195][local79][local101] & 0x4) == 0 && (Static159.aByteArrayArrayArray13[Static212.anInt4195][local79 + 1][local101 - 1] & 0x4) == 0) {
							Static86.anIntArray141[local51] = local79 + 1 | 0x520000 | 0x92000000;
							Static194.anIntArray446[local51] = local101 | 0x530000;
							local51 = local51 + 1 & 0xFFF;
							Static217.aByteArrayArrayArray14[Static212.anInt4195][local79 + 1][local101] = local14;
						}
					}
					local101--;
					if (local79 + 1 < 104 && local14 != Static217.aByteArrayArrayArray14[Static212.anInt4195][local79 + 1][local101]) {
						Static86.anIntArray141[local51] = local79 + 1 | 0x920000 | 0x53000000;
						Static194.anIntArray446[local51] = local101 | 0x930000;
						Static217.aByteArrayArrayArray14[Static212.anInt4195][local79 + 1][local101] = local14;
						local51 = local51 + 1 & 0xFFF;
					}
					local101--;
					if (local101 >= 0) {
						if (local79 - 1 >= 0 && local14 != Static217.aByteArrayArrayArray14[Static212.anInt4195][local79 - 1][local101] && (Static159.aByteArrayArrayArray13[Static212.anInt4195][local79][local101] & 0x4) == 0 && (Static159.aByteArrayArrayArray13[Static212.anInt4195][local79 - 1][local101 + 1] & 0x4) == 0) {
							Static86.anIntArray141[local51] = local79 - 1 | 0xD20000 | 0x12000000;
							Static194.anIntArray446[local51] = local101 | 0xD30000;
							Static217.aByteArrayArrayArray14[Static212.anInt4195][local79 - 1][local101] = local14;
							local51 = local51 + 1 & 0xFFF;
						}
						if (local14 != Static217.aByteArrayArrayArray14[Static212.anInt4195][local79][local101]) {
							Static86.anIntArray141[local51] = 0x93000000 | 0xD20000 | local79;
							Static194.anIntArray446[local51] = local101 | 0xD30000;
							local51 = local51 + 1 & 0xFFF;
							Static217.aByteArrayArrayArray14[Static212.anInt4195][local79][local101] = local14;
						}
						if (local79 + 1 < 104 && local14 != Static217.aByteArrayArrayArray14[Static212.anInt4195][local79 + 1][local101] && (Static159.aByteArrayArrayArray13[Static212.anInt4195][local79][local101] & 0x4) == 0 && (Static159.aByteArrayArrayArray13[Static212.anInt4195][local79 + 1][local101 + 1] & 0x4) == 0) {
							Static86.anIntArray141[local51] = 0xD2000000 | 0x920000 | local79 + 1;
							Static194.anIntArray446[local51] = local101 | 0x930000;
							Static217.aByteArrayArrayArray14[Static212.anInt4195][local79 + 1][local101] = local14;
							local51 = local51 + 1 & 0xFFF;
						}
					}
				}
			}
			if (Static172.anIntArray376[arg1] != -1000000) {
				Static172.anIntArray376[arg1] += 10;
				Static232.anIntArray509[arg1] -= 50;
				Static230.anIntArray331[arg1] += 50;
				Static171.anIntArray375[arg1] += 50;
				Static85.anIntArray138[arg1] -= 50;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!hh;ZZ)V")
	public static void method1979(@OriginalArg(0) Class50 arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			try {
				Static84.anApplet_Sub1_1.getAppletContext().showDocument(arg0.method1211(Static84.anApplet_Sub1_1.getCodeBase()), "_blank");
			} catch (@Pc(29) Exception local29) {
			}
		} else {
			try {
				Static84.anApplet_Sub1_1.getAppletContext().showDocument(arg0.method1211(Static84.anApplet_Sub1_1.getCodeBase()), "_top");
			} catch (@Pc(16) Exception local16) {
			}
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIIIII)V")
	public static void method1980(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		Static232.method3498(arg3);
		@Pc(15) int local15 = arg3 - arg5;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(21) int local21 = arg3;
		@Pc(24) int local24 = -arg3;
		@Pc(31) int local31 = local15;
		@Pc(33) int local33 = -1;
		@Pc(35) int local35 = -1;
		@Pc(38) int local38 = -local15;
		@Pc(42) int[] local42 = Static139.anIntArrayArray21[arg2];
		@Pc(46) int local46 = local15 + arg1;
		@Pc(50) int local50 = arg1 - local15;
		Static107.method1641(arg1 - arg3, arg0, local42, local50);
		Static107.method1641(local50, arg4, local42, local46);
		Static107.method1641(local46, arg0, local42, arg3 + arg1);
		while (local21 > local7) {
			local35 += 2;
			local38 += local35;
			if (local38 >= 0 && local31 >= 1) {
				Static110.anIntArray235[local31] = local7;
				local31--;
				local38 -= local31 << 1;
			}
			local33 += 2;
			local7++;
			local24 += local33;
			@Pc(122) int[] local122;
			@Pc(116) int[] local116;
			@Pc(126) int local126;
			@Pc(130) int local130;
			@Pc(135) int local135;
			@Pc(139) int local139;
			@Pc(143) int local143;
			if (local24 >= 0) {
				local21--;
				if (local15 > local21) {
					local116 = Static139.anIntArrayArray21[arg2 - local21];
					local122 = Static139.anIntArrayArray21[local21 + arg2];
					local126 = Static110.anIntArray235[local21];
					local130 = arg1 + local7;
					local135 = arg1 - local7;
					local139 = local126 + arg1;
					local143 = arg1 - local126;
					Static107.method1641(local135, arg0, local122, local143);
					Static107.method1641(local143, arg4, local122, local139);
					Static107.method1641(local139, arg0, local122, local130);
					Static107.method1641(local135, arg0, local116, local143);
					Static107.method1641(local143, arg4, local116, local139);
					Static107.method1641(local139, arg0, local116, local130);
				} else {
					local122 = Static139.anIntArrayArray21[arg2 + local21];
					local126 = arg1 + local7;
					local130 = arg1 - local7;
					local116 = Static139.anIntArrayArray21[arg2 - local21];
					Static107.method1641(local130, arg0, local122, local126);
					Static107.method1641(local130, arg0, local116, local126);
				}
				local24 -= local21 << 1;
			}
			local122 = Static139.anIntArrayArray21[local7 + arg2];
			local116 = Static139.anIntArrayArray21[arg2 - local7];
			local126 = local21 + arg1;
			local130 = arg1 - local21;
			if (local15 > local7) {
				local135 = local31 >= local7 ? local31 : Static110.anIntArray235[local7];
				local139 = local135 + arg1;
				local143 = arg1 - local135;
				Static107.method1641(local130, arg0, local122, local143);
				Static107.method1641(local143, arg4, local122, local139);
				Static107.method1641(local139, arg0, local122, local126);
				Static107.method1641(local130, arg0, local116, local143);
				Static107.method1641(local143, arg4, local116, local139);
				Static107.method1641(local139, arg0, local116, local126);
			} else {
				Static107.method1641(local130, arg0, local122, local126);
				Static107.method1641(local130, arg0, local116, local126);
			}
		}
	}
}
