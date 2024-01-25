import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!go", name = "r", descriptor = "I")
	public static int anInt3241;

	@OriginalMember(owner = "client!go", name = "p", descriptor = "I")
	public static int anInt3242;

	@OriginalMember(owner = "client!go", name = "s", descriptor = "I")
	public static int anInt3243;

	@OriginalMember(owner = "client!go", name = "h", descriptor = "Lclient!el;")
	public static final Class109 aClass109_71 = new Class109(111, 3);

	@OriginalMember(owner = "client!go", name = "c", descriptor = "[I")
	public static final int[] anIntArray191 = new int[3];

	@OriginalMember(owner = "client!go", name = "o", descriptor = "I")
	public static int anInt3240 = -1;

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IIIII)V")
	public static void method2866(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static456.anInt7815 <= arg3 && arg3 <= Static604.anInt10083) {
			@Pc(17) int local17 = Static83.method1286(Static642.anInt10429, Static456.anInt7806, arg1);
			@Pc(23) int local23 = Static83.method1286(Static642.anInt10429, Static456.anInt7806, arg2);
			Static624.method8764(local23, local17, arg0, arg3);
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(ILclient!d;Lclient!ha;)V")
	public static void method2868(@OriginalArg(1) Interface1 arg0, @OriginalArg(2) Class57 arg1) {
		if (Static629.aClass5_Sub5_Sub12_3 == null) {
			return;
		}
		if (Static270.anInt4694 < 10) {
			if (!Static629.aClass208_132.method5006(Static629.aClass5_Sub5_Sub12_3.aString64)) {
				Static270.anInt4694 = Static529.aClass208_117.method4987(Static629.aClass5_Sub5_Sub12_3.aString64) / 10;
				return;
			}
			Static47.method757(-4377);
			Static270.anInt4694 = 10;
		}
		if (Static270.anInt4694 == 10) {
			Static629.anInt9763 = Static629.aClass5_Sub5_Sub12_3.anInt4377 >> 6 << 6;
			Static629.anInt9765 = Static629.aClass5_Sub5_Sub12_3.anInt4375 >> 6 << 6;
			Static629.anInt9766 = (Static629.aClass5_Sub5_Sub12_3.anInt4372 >> 6 << 6) - (Static629.anInt9763 - 64);
			Static629.anInt9767 = (Static629.aClass5_Sub5_Sub12_3.anInt4369 >> 6 << 6) + 64 - Static629.anInt9765;
			@Pc(81) int[] local81 = new int[3];
			@Pc(83) int local83 = -1;
			@Pc(85) int local85 = -1;
			if (Static629.aClass5_Sub5_Sub12_3.method3739(Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aByte145, (Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anInt10355 >> 9) + Static622.anInt10188, local81, (Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anInt10363 >> 9) + Static668.anInt10683)) {
				local83 = local81[1] - Static629.anInt9765;
				local85 = local81[2] - Static629.anInt9763;
			}
			if (!Static675.aBoolean794 && local83 >= 0 && local83 < Static629.anInt9767 && local85 >= 0 && local85 < Static629.anInt9766) {
				local85 += (int) (Math.random() * 10.0D) - 5;
				local83 += (int) (Math.random() * 10.0D) - 5;
				Static622.anInt10186 = local83;
				Static448.anInt7716 = local85;
			} else if (Static11.anInt223 == -1 || Static528.anInt8867 == -1) {
				Static629.aClass5_Sub5_Sub12_3.method3741(Static629.aClass5_Sub5_Sub12_3.anInt4374 >> 14 & 0x3FFF, local81, Static629.aClass5_Sub5_Sub12_3.anInt4374 & 0x3FFF);
				Static622.anInt10186 = local81[1] - Static629.anInt9765;
				Static448.anInt7716 = local81[2] - Static629.anInt9763;
			} else {
				Static629.aClass5_Sub5_Sub12_3.method3741(Static11.anInt223, local81, Static528.anInt8867);
				Static528.anInt8867 = -1;
				Static11.anInt223 = -1;
				Static675.aBoolean794 = false;
				if (local81 != null) {
					Static622.anInt10186 = local81[1] - Static629.anInt9765;
					Static448.anInt7716 = local81[2] - Static629.anInt9763;
				}
			}
			if (Static629.aClass5_Sub5_Sub12_3.anInt4371 == 37) {
				Static629.aFloat203 = 3.0F;
				Static629.aFloat202 = 3.0F;
			} else if (Static629.aClass5_Sub5_Sub12_3.anInt4371 == 50) {
				Static629.aFloat203 = 4.0F;
				Static629.aFloat202 = 4.0F;
			} else if (Static629.aClass5_Sub5_Sub12_3.anInt4371 == 75) {
				Static629.aFloat203 = 6.0F;
				Static629.aFloat202 = 6.0F;
			} else if (Static629.aClass5_Sub5_Sub12_3.anInt4371 == 100) {
				Static629.aFloat203 = 8.0F;
				Static629.aFloat202 = 8.0F;
			} else if (Static629.aClass5_Sub5_Sub12_3.anInt4371 == 200) {
				Static629.aFloat203 = 16.0F;
				Static629.aFloat202 = 16.0F;
			} else {
				Static629.aFloat203 = 8.0F;
				Static629.aFloat202 = 8.0F;
			}
			Static629.anInt9759 = (int) Static629.aFloat203 >> 1;
			Static629.aByteArrayArrayArray18 = Static602.method8659(Static629.anInt9759);
			Static122.method1709();
			Static629.method8381();
			Static199.aClass102_64 = new Class102();
			Static629.anInt9760 += (int) (Math.random() * 5.0D) - 2;
			if (Static629.anInt9760 < -8) {
				Static629.anInt9760 = -8;
			}
			Static629.anInt9758 += (int) (Math.random() * 5.0D) - 2;
			if (Static629.anInt9760 > 8) {
				Static629.anInt9760 = 8;
			}
			if (Static629.anInt9758 < -16) {
				Static629.anInt9758 = -16;
			}
			if (Static629.anInt9758 > 16) {
				Static629.anInt9758 = 16;
			}
			Static629.method8391(arg0, Static629.anInt9760 >> 2 << 10, Static629.anInt9758 >> 1);
			Static629.aClass33_4.method656(256, 1024);
			Static629.aClass256_3.method5938(256, 256);
			Static629.aClass392_4.method9291(4096);
			Static519.aClass199_1.method4692(256);
			Static270.anInt4694 = 20;
		} else if (Static270.anInt4694 == 20) {
			Static535.method7896(true);
			Static629.method8382(arg1, Static629.anInt9760, Static629.anInt9758);
			Static270.anInt4694 = 60;
			Static535.method7896(true);
			Static442.method6547(118);
		} else if (Static270.anInt4694 == 60) {
			if (Static629.aClass208_132.method5000(Static629.aClass5_Sub5_Sub12_3.aString64 + "_staticelements")) {
				if (!Static629.aClass208_132.method5006(Static629.aClass5_Sub5_Sub12_3.aString64 + "_staticelements")) {
					return;
				}
				Static629.aClass197_3 = Static217.method3114(Static629.aClass208_132, Static475.aBoolean605, Static629.aClass5_Sub5_Sub12_3.aString64 + "_staticelements");
			} else {
				Static629.aClass197_3 = new Class197(0);
			}
			Static629.method8377();
			Static270.anInt4694 = 70;
			Static535.method7896(true);
			Static442.method6547(122);
		} else if (Static270.anInt4694 == 70) {
			Static85.aClass158_2 = new Class158(arg1, 11, true, Static24.aCanvas1);
			Static270.anInt4694 = 73;
			Static535.method7896(true);
			Static442.method6547(126);
		} else if (Static270.anInt4694 == 73) {
			Static120.aClass158_3 = new Class158(arg1, 12, true, Static24.aCanvas1);
			Static270.anInt4694 = 76;
			Static535.method7896(true);
			Static442.method6547(117);
		} else if (Static270.anInt4694 == 76) {
			Static305.aClass158_6 = new Class158(arg1, 14, true, Static24.aCanvas1);
			Static270.anInt4694 = 79;
			Static535.method7896(true);
			Static442.method6547(117);
		} else if (Static270.anInt4694 == 79) {
			Static181.aClass158_5 = new Class158(arg1, 17, true, Static24.aCanvas1);
			Static270.anInt4694 = 82;
			Static535.method7896(true);
			Static442.method6547(120);
		} else if (Static270.anInt4694 == 82) {
			Static417.aClass158_8 = new Class158(arg1, 19, true, Static24.aCanvas1);
			Static270.anInt4694 = 85;
			Static535.method7896(true);
			Static442.method6547(127);
		} else if (Static270.anInt4694 == 85) {
			Static364.aClass158_7 = new Class158(arg1, 22, true, Static24.aCanvas1);
			Static270.anInt4694 = 88;
			Static535.method7896(true);
			Static442.method6547(124);
		} else if (Static270.anInt4694 == 88) {
			Static120.aClass158_4 = new Class158(arg1, 26, true, Static24.aCanvas1);
			Static270.anInt4694 = 91;
			Static535.method7896(true);
			Static442.method6547(121);
		} else {
			Static2.aClass158_1 = new Class158(arg1, 30, true, Static24.aCanvas1);
			Static270.anInt4694 = 100;
			Static535.method7896(true);
			Static442.method6547(116);
			System.gc();
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "([[[Lclient!iia;IZIII)Z")
	public static boolean method2869(@OriginalArg(0) Class174[][][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(15) byte local15 = arg2 ? 1 : (byte) (Static287.anInt5060 & 0xFF);
		if (local15 == Static240.aByteArrayArrayArray15[Static240.anInt3974][arg4][arg1]) {
			return false;
		} else if ((Static220.aByteArrayArrayArray14[Static240.anInt3974][arg4][arg1] & 0x4) == 0) {
			return false;
		} else {
			@Pc(48) byte local48 = 0;
			Static579.anIntArray538[0] = arg4;
			@Pc(54) int local54 = 0;
			@Pc(57) int local57 = local48 + 1;
			Static372.anIntArray487[0] = arg1;
			Static240.aByteArrayArrayArray15[Static240.anInt3974][arg4][arg1] = local15;
			while (local57 != local54) {
				@Pc(75) int local75 = Static579.anIntArray538[local54] & 0xFFFF;
				@Pc(83) int local83 = Static579.anIntArray538[local54] >> 16 & 0xFF;
				@Pc(91) int local91 = Static579.anIntArray538[local54] >> 24 & 0xFF;
				@Pc(97) int local97 = Static372.anIntArray487[local54] & 0xFFFF;
				@Pc(105) int local105 = Static372.anIntArray487[local54] >> 16 & 0xFF;
				local54 = local54 + 1 & 0xFFF;
				@Pc(113) boolean local113 = false;
				if ((Static220.aByteArrayArrayArray14[Static240.anInt3974][local75][local97] & 0x4) == 0) {
					local113 = true;
				}
				@Pc(127) boolean local127 = false;
				@Pc(133) int local133;
				@Pc(183) int local183;
				@Pc(241) int local241;
				if (arg0 != null) {
					label237: for (local133 = Static240.anInt3974 + 1; local133 <= 3; local133++) {
						if (arg0[local133] != null && (Static220.aByteArrayArrayArray14[local133][local75][local97] & 0x8) == 0) {
							@Pc(354) Class8_Sub1_Sub3 local354;
							@Pc(364) int local364;
							@Pc(343) Class174 local343;
							@Pc(349) Class273 local349;
							if (local113 && arg0[local133][local75][local97] != null) {
								if (arg0[local133][local75][local97].aClass8_Sub1_Sub4_2 != null) {
									local183 = Static529.method7635(local83);
									if (arg0[local133][local75][local97].aClass8_Sub1_Sub4_2.aShort79 == local183 || arg0[local133][local75][local97].aClass8_Sub1_Sub4_1 != null && local183 == arg0[local133][local75][local97].aClass8_Sub1_Sub4_1.aShort79) {
										continue;
									}
									if (local91 != 0) {
										local241 = Static529.method7635(local91);
										if (arg0[local133][local75][local97].aClass8_Sub1_Sub4_2.aShort79 == local241 || arg0[local133][local75][local97].aClass8_Sub1_Sub4_1 != null && arg0[local133][local75][local97].aClass8_Sub1_Sub4_1.aShort79 == local241) {
											continue;
										}
									}
									if (local105 != 0) {
										local241 = Static529.method7635(local105);
										if (arg0[local133][local75][local97].aClass8_Sub1_Sub4_2.aShort79 == local241 || arg0[local133][local75][local97].aClass8_Sub1_Sub4_1 != null && arg0[local133][local75][local97].aClass8_Sub1_Sub4_1.aShort79 == local241) {
											continue;
										}
									}
								}
								local343 = arg0[local133][local75][local97];
								if (local343.aClass273_67 != null) {
									for (local349 = local343.aClass273_67; local349 != null; local349 = local349.aClass273_114) {
										local354 = local349.aClass8_Sub1_Sub3_1;
										if (local354 instanceof Interface16) {
											@Pc(360) Interface16 local360 = (Interface16) local354;
											local364 = local360.method8092(18636);
											@Pc(368) int local368 = local360.method8091(false);
											if (local364 == 21) {
												local364 = 19;
											}
											@Pc(379) int local379 = local364 | local368 << 6;
											if (local379 == local83 || local91 != 0 && local379 == local91 || local105 != 0 && local379 == local105) {
												continue label237;
											}
										}
									}
								}
							}
							local343 = arg0[local133][local75][local97];
							if (local343 != null && local343.aClass273_67 != null) {
								for (local349 = local343.aClass273_67; local349 != null; local349 = local349.aClass273_114) {
									local354 = local349.aClass8_Sub1_Sub3_1;
									if (local354.aShort109 != local354.aShort110 || local354.aShort107 != local354.aShort108) {
										for (@Pc(460) int local460 = local354.aShort109; local460 <= local354.aShort110; local460++) {
											for (local364 = local354.aShort108; local364 <= local354.aShort107; local364++) {
												Static240.aByteArrayArrayArray15[local133][local460][local364] = local15;
											}
										}
									}
								}
							}
							Static240.aByteArrayArrayArray15[local133][local75][local97] = local15;
							local127 = true;
						}
					}
				}
				if (local127) {
					local133 = Static242.aClass22Array3[Static240.anInt3974 + 1].method8038(local97, local75);
					if (Static163.anIntArray143[arg3] < local133) {
						Static163.anIntArray143[arg3] = local133;
					}
					local183 = local75 << 9;
					if (local183 < Static596.anIntArray553[arg3]) {
						Static596.anIntArray553[arg3] = local183;
					} else if (local183 > Static75.anIntArray55[arg3]) {
						Static75.anIntArray55[arg3] = local183;
					}
					local241 = local97 << 9;
					if (local241 < Static203.anIntArray193[arg3]) {
						Static203.anIntArray193[arg3] = local241;
					} else if (Static246.anIntArray241[arg3] < local241) {
						Static246.anIntArray241[arg3] = local241;
					}
				}
				if (!local113) {
					if (local75 >= 1 && Static240.aByteArrayArrayArray15[Static240.anInt3974][local75 - 1][local97] != local15) {
						Static579.anIntArray538[local57] = local75 - 1 | 0x120000 | 0xD3000000;
						Static372.anIntArray487[local57] = local97 | 0x130000;
						Static240.aByteArrayArrayArray15[Static240.anInt3974][local75 - 1][local97] = local15;
						local57 = local57 + 1 & 0xFFF;
					}
					@Pc(670) int local670 = ~Static282.anInt4887;
					local97++;
					if (local670 < ~local97) {
						if (local75 - 1 >= 0 && local15 != Static240.aByteArrayArrayArray15[Static240.anInt3974][local75 - 1][local97] && (Static220.aByteArrayArrayArray14[Static240.anInt3974][local75][local97] & 0x4) == 0 && (Static220.aByteArrayArrayArray14[Static240.anInt3974][local75 - 1][local97 - 1] & 0x4) == 0) {
							Static579.anIntArray538[local57] = local75 - 1 | 0x52000000 | 0x120000;
							Static372.anIntArray487[local57] = local97 | 0x130000;
							local57 = local57 + 1 & 0xFFF;
							Static240.aByteArrayArrayArray15[Static240.anInt3974][local75 - 1][local97] = local15;
						}
						if (Static240.aByteArrayArrayArray15[Static240.anInt3974][local75][local97] != local15) {
							Static579.anIntArray538[local57] = local75 | 0x520000 | 0x13000000;
							Static372.anIntArray487[local57] = local97 | 0x530000;
							Static240.aByteArrayArrayArray15[Static240.anInt3974][local75][local97] = local15;
							local57 = local57 + 1 & 0xFFF;
						}
						if (Static544.anInt9261 > local75 + 1 && local15 != Static240.aByteArrayArrayArray15[Static240.anInt3974][local75 + 1][local97] && (Static220.aByteArrayArrayArray14[Static240.anInt3974][local75][local97] & 0x4) == 0 && (Static220.aByteArrayArrayArray14[Static240.anInt3974][local75 + 1][local97 - 1] & 0x4) == 0) {
							Static579.anIntArray538[local57] = local75 + 1 | 0x520000 | 0x92000000;
							Static372.anIntArray487[local57] = local97 | 0x530000;
							local57 = local57 + 1 & 0xFFF;
							Static240.aByteArrayArrayArray15[Static240.anInt3974][local75 + 1][local97] = local15;
						}
					}
					local97--;
					if (Static544.anInt9261 > local75 + 1 && local15 != Static240.aByteArrayArrayArray15[Static240.anInt3974][local75 + 1][local97]) {
						Static579.anIntArray538[local57] = 0x53000000 | 0x920000 | local75 + 1;
						Static372.anIntArray487[local57] = local97 | 0x930000;
						Static240.aByteArrayArrayArray15[Static240.anInt3974][local75 + 1][local97] = local15;
						local57 = local57 + 1 & 0xFFF;
					}
					local97--;
					if (local97 >= 0) {
						if (local75 - 1 >= 0 && local15 != Static240.aByteArrayArrayArray15[Static240.anInt3974][local75 - 1][local97] && (Static220.aByteArrayArrayArray14[Static240.anInt3974][local75][local97] & 0x4) == 0 && (Static220.aByteArrayArrayArray14[Static240.anInt3974][local75 - 1][local97 + 1] & 0x4) == 0) {
							Static579.anIntArray538[local57] = 0x12000000 | 0xD20000 | local75 - 1;
							Static372.anIntArray487[local57] = local97 | 0xD30000;
							local57 = local57 + 1 & 0xFFF;
							Static240.aByteArrayArrayArray15[Static240.anInt3974][local75 - 1][local97] = local15;
						}
						if (local15 != Static240.aByteArrayArrayArray15[Static240.anInt3974][local75][local97]) {
							Static579.anIntArray538[local57] = local75 | 0xD20000 | 0x93000000;
							Static372.anIntArray487[local57] = local97 | 0xD30000;
							local57 = local57 + 1 & 0xFFF;
							Static240.aByteArrayArrayArray15[Static240.anInt3974][local75][local97] = local15;
						}
						if (Static544.anInt9261 > local75 + 1 && Static240.aByteArrayArrayArray15[Static240.anInt3974][local75 + 1][local97] != local15 && (Static220.aByteArrayArrayArray14[Static240.anInt3974][local75][local97] & 0x4) == 0 && (Static220.aByteArrayArrayArray14[Static240.anInt3974][local75 + 1][local97 + 1] & 0x4) == 0) {
							Static579.anIntArray538[local57] = local75 + 1 | 0x920000 | 0xD2000000;
							Static372.anIntArray487[local57] = local97 | 0x930000;
							Static240.aByteArrayArrayArray15[Static240.anInt3974][local75 + 1][local97] = local15;
							local57 = local57 + 1 & 0xFFF;
						}
					}
				}
			}
			if (Static163.anIntArray143[arg3] != -1000000) {
				Static163.anIntArray143[arg3] += 40;
				Static596.anIntArray553[arg3] -= 512;
				Static75.anIntArray55[arg3] += 512;
				Static246.anIntArray241[arg3] += 512;
				Static203.anIntArray193[arg3] -= 512;
			}
			return true;
		}
	}
}
