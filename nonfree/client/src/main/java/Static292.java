import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!sn", name = "D", descriptor = "I")
	public static int anInt5791;

	@OriginalMember(owner = "client!sn", name = "E", descriptor = "I")
	public static int anInt5792;

	@OriginalMember(owner = "client!sn", name = "v", descriptor = "Z")
	public static boolean aBoolean370 = false;

	@OriginalMember(owner = "client!sn", name = "C", descriptor = "[Z")
	public static final boolean[] aBooleanArray22 = new boolean[100];

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "(I)V")
	public static void method4858() {
		Static246.aClass11_Sub25_Sub1_3.method2464();
		@Pc(13) int local13 = Static246.aClass11_Sub25_Sub1_3.method2462(8);
		@Pc(22) int local22;
		if (local13 < Static141.anInt2601) {
			for (local22 = local13; local22 < Static141.anInt2601; local22++) {
				Static223.anIntArray344[Static262.anInt5355++] = Static4.anIntArray4[local22];
			}
		}
		if (Static141.anInt2601 < local13) {
			throw new RuntimeException("gnpov1");
		}
		Static141.anInt2601 = 0;
		for (local22 = 0; local22 < local13; local22++) {
			@Pc(64) int local64 = Static4.anIntArray4[local22];
			@Pc(68) Class67_Sub3_Sub3_Sub1 local68 = Static356.aClass67_Sub3_Sub3_Sub1Array1[local64];
			@Pc(73) int local73 = Static246.aClass11_Sub25_Sub1_3.method2462(1);
			if (local73 == 0) {
				Static4.anIntArray4[Static141.anInt2601++] = local64;
				local68.anInt5010 = Static293.anInt5807;
			} else {
				@Pc(96) int local96 = Static246.aClass11_Sub25_Sub1_3.method2462(2);
				if (local96 == 0) {
					Static4.anIntArray4[Static141.anInt2601++] = local64;
					local68.anInt5010 = Static293.anInt5807;
					Static309.anIntArray498[Static90.anInt4650++] = local64;
				} else {
					@Pc(141) int local141;
					@Pc(153) int local153;
					if (local96 == 1) {
						Static4.anIntArray4[Static141.anInt2601++] = local64;
						local68.anInt5010 = Static293.anInt5807;
						local141 = Static246.aClass11_Sub25_Sub1_3.method2462(3);
						local68.method2681(1, local141);
						local153 = Static246.aClass11_Sub25_Sub1_3.method2462(1);
						if (local153 == 1) {
							Static309.anIntArray498[Static90.anInt4650++] = local64;
						}
					} else if (local96 == 2) {
						Static4.anIntArray4[Static141.anInt2601++] = local64;
						local68.anInt5010 = Static293.anInt5807;
						if (Static246.aClass11_Sub25_Sub1_3.method2462(1) == 1) {
							local141 = Static246.aClass11_Sub25_Sub1_3.method2462(3);
							local68.method2681(2, local141);
							local153 = Static246.aClass11_Sub25_Sub1_3.method2462(3);
							local68.method2681(2, local153);
						} else {
							local141 = Static246.aClass11_Sub25_Sub1_3.method2462(3);
							local68.method2681(0, local141);
						}
						local141 = Static246.aClass11_Sub25_Sub1_3.method2462(1);
						if (local141 == 1) {
							Static309.anIntArray498[Static90.anInt4650++] = local64;
						}
					} else if (local96 == 3) {
						Static223.anIntArray344[Static262.anInt5355++] = local64;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIZIII)V")
	public static void method4862(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static212.aClass106ArrayArrayArray2 == null) {
			Static107.aClass129_4.method4941(arg4, arg1, arg3, -16777216, arg0);
			return;
		}
		Static347.anInt6633++;
		if (Static156.aClass67_Sub3_Sub3_Sub2_2 != null && Static156.aClass67_Sub3_Sub3_Sub2_2.anInt6308 - (Static156.aClass67_Sub3_Sub3_Sub2_2.method4368() - 1) * 64 >> 7 == Static132.anInt2474 && Static156.aClass67_Sub3_Sub3_Sub2_2.anInt6310 + 64 - Static156.aClass67_Sub3_Sub3_Sub2_2.method4368() * 64 >> 7 == Static276.anInt5528) {
			Static276.anInt5528 = -1;
			Static132.anInt2474 = -1;
			Static259.method4512();
		}
		Static54.method823();
		if (!arg2) {
			Static313.method5269();
		}
		Static340.method4780();
		Static325.method1026(arg4, arg1, arg0, arg3, true);
		@Pc(79) int local79 = Static289.anInt5731;
		@Pc(81) int local81 = Static279.anInt5584;
		@Pc(83) int local83 = Static272.anInt5169;
		@Pc(85) int local85 = Static169.anInt6315;
		@Pc(94) int local94;
		@Pc(125) int local125;
		if (Static81.anInt1498 == 1) {
			local94 = (int) Static21.aFloat10;
			if (Static79.anInt5248 >> 8 > local94) {
				local94 = Static79.anInt5248 >> 8;
			}
			if (Static311.aBooleanArray4[4] && local94 < Static43.anIntArray62[4] + 128) {
				local94 = Static43.anIntArray62[4] + 128;
			}
			local125 = (int) Static246.aFloat51 + Static84.anInt1522 & 0x3FFF;
			Static215.method3868(Static114.anInt2169, Static168.method2721(Static156.aClass67_Sub3_Sub3_Sub2_2.anInt6308, Static322.anInt6250, Static156.aClass67_Sub3_Sub3_Sub2_2.anInt6310) - 50, local94, (local94 >> 3) * 3 + 600, local125, Static169.anInt6309, local79);
		} else if (Static81.anInt1498 == 4) {
			local94 = (int) Static21.aFloat10;
			if (local94 < Static79.anInt5248 >> 8) {
				local94 = Static79.anInt5248 >> 8;
			}
			if (Static311.aBooleanArray4[4] && local94 < Static43.anIntArray62[4] + 128) {
				local94 = Static43.anIntArray62[4] + 128;
			}
			local125 = (int) Static246.aFloat51 & 0x3FFF;
			Static215.method3868(Static114.anInt2169, Static168.method2721(Static283.anInt5592, Static322.anInt6250, Static352.anInt6703) - 50, local94, (local94 >> 3) * 3 + 600, local125, Static169.anInt6309, local79);
		} else if (Static81.anInt1498 == 5) {
			Static130.method4123(local79);
		}
		local94 = Static190.anInt3870;
		local125 = Static86.anInt1541;
		@Pc(229) int local229 = Static316.anInt6169;
		@Pc(231) int local231 = Static184.anInt3721;
		@Pc(233) int local233 = Static308.anInt6050;
		@Pc(277) int local277;
		for (@Pc(235) int local235 = 0; local235 < 5; local235++) {
			if (Static311.aBooleanArray4[local235]) {
				local277 = (int) ((double) -Static265.anIntArray410[local235] + (double) (Static265.anIntArray410[local235] * 2 + 1) * Math.random() + Math.sin((double) Static87.anIntArray105[local235] * ((double) Static9.anIntArray13[local235] / 100.0D)) * (double) Static43.anIntArray62[local235]);
				if (local235 == 0) {
					Static190.anInt3870 += local277;
				}
				if (local235 == 1) {
					Static86.anInt1541 += local277;
				}
				if (local235 == 4) {
					Static184.anInt3721 += local277;
					if (Static184.anInt3721 < 1024) {
						Static184.anInt3721 = 1024;
					} else if (Static184.anInt3721 > 3072) {
						Static184.anInt3721 = 3072;
					}
				}
				if (local235 == 2) {
					Static316.anInt6169 += local277;
				}
				if (local235 == 3) {
					Static308.anInt6050 = local277 + Static308.anInt6050 & 0x3FFF;
				}
			}
		}
		if (Static190.anInt3870 < 0) {
			Static190.anInt3870 = 0;
		}
		if ((Static232.anInt4703 << 7) - 1 < Static190.anInt3870) {
			Static190.anInt3870 = (Static232.anInt4703 << 7) - 1;
		}
		if (Static316.anInt6169 < 0) {
			Static316.anInt6169 = 0;
		}
		if ((Static300.anInt5931 << 7) - 1 < Static316.anInt6169) {
			Static316.anInt6169 = (Static300.anInt5931 << 7) - 1;
		}
		Static247.method4329();
		Static217.method3920();
		Static107.aClass129_4.method4952(local81, local83, local85 + local81, local79 + local83);
		Static107.aClass129_4.method4944();
		local277 = Static106.anInt1978;
		if (Static162.aClass39_1 == null) {
			Static107.aClass129_4.method4930(local277);
		} else {
			Static162.aClass39_1.method586(local79, local85, local277, Static184.anInt3721, Static82.anInt1503 << 3, local81, Static308.anInt6050, Static107.aClass129_4, local83);
		}
		Static168.method2723();
		Static319.aClass61_5.method3668(Static190.anInt3870, Static86.anInt1541, Static316.anInt6169, -Static184.anInt3721 & 0x3FFF, -Static308.anInt6050 & 0x3FFF, -Static157.anInt3004 & 0x3FFF);
		Static107.aClass129_4.method4971(Static319.aClass61_5);
		Static107.aClass129_4.method4996(local85 / 2 + local81, local83 + local79 / 2, Static135.anInt2530 << 1, Static135.anInt2530 << 1);
		Static31.method432(local81 + local85 / 2, Static135.anInt2530 << 1, local79 / 2 + local83, Static135.anInt2530 << 1);
		Static192.method3520(-Static308.anInt6050 & 0x3FFF, Static190.anInt3870, -Static157.anInt3004 & 0x3FFF, Static316.anInt6169, -Static184.anInt3721 & 0x3FFF, Static86.anInt1541);
		@Pc(517) byte local517 = Static33.method465() == 2 ? (byte) Static347.anInt6633 : 1;
		Static157.method2530(Static107.aClass129_4, Static293.anInt5807, Static201.anInt6770, Static319.aClass61_5, Static190.anInt3870, Static86.anInt1541, Static316.anInt6169, Static247.aByteArrayArrayArray9, Static78.anIntArray99, Static34.anIntArray49, Static189.anIntArray45, Static30.anIntArray34, Static341.anIntArray540, Static322.anInt6250 + 1, local517, Static156.aClass67_Sub3_Sub3_Sub2_2.anInt6308 >> 7, Static156.aClass67_Sub3_Sub3_Sub2_2.anInt6310 >> 7, !Static347.aBoolean422);
		Static168.method2723();
		if (Static245.anInt6561 == 30) {
			Static92.method1345(local79, local81, local85, local83);
			Static237.method4184(local83, local85, local81, local79);
			Static272.method4444(local83, local85, local79, local81);
			Static299.method5107(local79, local81, local83, local85);
		}
		Static354.method5676();
		Static308.anInt6050 = local233;
		Static184.anInt3721 = local231;
		Static86.anInt1541 = local125;
		Static316.anInt6169 = local229;
		Static190.anInt3870 = local94;
		if (Static301.aBoolean399 && Static285.aClass172_3.method4573() == 0) {
			Static301.aBoolean399 = false;
		}
		if (Static301.aBoolean399) {
			Static107.aClass129_4.method4941(local81, local83, local85, -16777216, local79);
			Static151.method2279(Static30.aClass9_1, false, Static349.aClass117_119.method2684(Static230.anInt4634));
		}
	}
}
