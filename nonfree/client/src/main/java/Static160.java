import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "Lclient!io;")
	public static Class122 aClass122_5;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IILclient!tn;I)V")
	public static void method5104(@OriginalArg(1) int arg0, @OriginalArg(2) Class229 arg1, @OriginalArg(3) int arg2) {
		if (arg1.aByte92 == 0) {
			arg1.anInt6864 = arg1.anInt6887;
		} else if (arg1.aByte92 == 1) {
			arg1.anInt6864 = (arg0 - arg1.anInt6905) / 2 + arg1.anInt6887;
		} else if (arg1.aByte92 == 2) {
			arg1.anInt6864 = arg0 - arg1.anInt6887 - arg1.anInt6905;
		} else if (arg1.aByte92 == 3) {
			arg1.anInt6864 = arg0 * arg1.anInt6887 >> 14;
		} else if (arg1.aByte92 == 4) {
			arg1.anInt6864 = (arg0 - arg1.anInt6905) / 2 + (arg1.anInt6887 * arg0 >> 14);
		} else {
			arg1.anInt6864 = arg0 - arg1.anInt6905 - (arg0 * arg1.anInt6887 >> 14);
		}
		if (arg1.aByte93 == 0) {
			arg1.anInt6896 = arg1.anInt6865;
		} else if (arg1.aByte93 == 1) {
			arg1.anInt6896 = arg1.anInt6865 + (arg2 - arg1.anInt6895) / 2;
		} else if (arg1.aByte93 == 2) {
			arg1.anInt6896 = arg2 - arg1.anInt6865 - arg1.anInt6895;
		} else if (arg1.aByte93 == 3) {
			arg1.anInt6896 = arg2 * arg1.anInt6865 >> 14;
		} else if (arg1.aByte93 == 4) {
			arg1.anInt6896 = (arg2 - arg1.anInt6895) / 2 + (arg2 * arg1.anInt6865 >> 14);
		} else {
			arg1.anInt6896 = arg2 - arg1.anInt6895 - (arg2 * arg1.anInt6865 >> 14);
		}
		if (!Static424.aBoolean633) {
			return;
		}
		if (Static51.method751(arg1).anInt1143 == 0 && arg1.anInt6863 != 0) {
			return;
		}
		if (arg1.anInt6864 < 0) {
			arg1.anInt6864 = 0;
		} else if (arg0 < arg1.anInt6864 + arg1.anInt6905) {
			arg1.anInt6864 = arg0 - arg1.anInt6905;
		}
		if (arg1.anInt6896 < 0) {
			arg1.anInt6896 = 0;
			return;
		}
		if (arg2 < arg1.anInt6895 + arg1.anInt6896) {
			arg1.anInt6896 = arg2 - arg1.anInt6895;
			return;
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZLclient!db;ILclient!da;Lclient!qa;Lclient!vb;II)V")
	public static void method5105(@OriginalArg(1) Class52 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub8 arg2, @OriginalArg(4) Class121 arg3, @OriginalArg(5) Class251 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(20) int local20 = arg2.anInt1164 - arg1 / 2 - 5;
		@Pc(24) int local24 = arg6 + 2;
		if (arg0.anInt1207 != 0) {
			arg3.method4600(arg1 + 10, local20, arg0.anInt1207, arg6 + arg4.method5663() * arg5 + 1 - local24, local24);
		}
		if (arg0.anInt1185 != 0) {
			arg3.method4601(arg6 + arg4.method5663() * arg5 + 1 - local24, local20, arg1 + 10, arg0.anInt1185, local24);
		}
		@Pc(76) int local76 = arg0.anInt1182;
		if (arg2.aBoolean100 && arg0.anInt1189 != -1) {
			local76 = arg0.anInt1189;
		}
		for (@Pc(88) int local88 = 0; local88 < arg5; local88++) {
			@Pc(94) String local94 = Static69.aStringArray11[local88];
			if (arg5 - 1 > local88) {
				local94 = local94.substring(0, local94.length() - 4);
			}
			arg4.method5661(arg3, local94, arg2.anInt1164, arg6, local76);
			arg6 += arg4.method5663();
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILclient!hh;)V")
	public static void method5108(@OriginalArg(1) Class109 arg0) {
		Static327.aClass109_74 = arg0;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z[[[Lclient!kf;IIZI)Z")
	public static boolean method5109(@OriginalArg(1) Class137[][][] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(19) byte local19 = arg3 ? 1 : (byte) (Static177.anInt3327 & 0xFF);
		if (Static183.aByteArrayArrayArray7[Static1.anInt41][arg2][arg1] == local19) {
			return false;
		} else if ((Static228.aByteArrayArrayArray8[Static1.anInt41][arg2][arg1] & 0x4) == 0) {
			return false;
		} else {
			@Pc(47) byte local47 = 0;
			@Pc(49) int local49 = 0;
			Static447.anIntArray582[0] = arg2;
			@Pc(56) int local56 = local47 + 1;
			Static429.anIntArray190[0] = arg1;
			Static183.aByteArrayArrayArray7[Static1.anInt41][arg2][arg1] = local19;
			while (local49 != local56) {
				@Pc(74) int local74 = Static447.anIntArray582[local49] & 0xFFFF;
				@Pc(82) int local82 = Static447.anIntArray582[local49] >> 16 & 0xFF;
				@Pc(90) int local90 = Static447.anIntArray582[local49] >> 24 & 0xFF;
				@Pc(96) int local96 = Static429.anIntArray190[local49] & 0xFFFF;
				@Pc(104) int local104 = Static429.anIntArray190[local49] >> 16 & 0xFF;
				local49 = local49 + 1 & 0xFFF;
				@Pc(112) boolean local112 = false;
				if ((Static228.aByteArrayArrayArray8[Static1.anInt41][local74][local96] & 0x4) == 0) {
					local112 = true;
				}
				@Pc(126) boolean local126 = false;
				@Pc(165) int local165;
				@Pc(208) int local208;
				label231: for (@Pc(130) int local130 = Static1.anInt41 + 1; local130 <= 3; local130++) {
					if ((Static228.aByteArrayArrayArray8[local130][local74][local96] & 0x8) == 0) {
						@Pc(310) Class47_Sub1 local310;
						@Pc(320) int local320;
						@Pc(299) Class137 local299;
						@Pc(305) Class167 local305;
						if (local112 && arg0[local130][local74][local96] != null) {
							if (arg0[local130][local74][local96].aClass47_Sub2_1 != null) {
								local165 = Static272.method3780(local82);
								if (arg0[local130][local74][local96].aClass47_Sub2_1.anInt7426 == local165 || arg0[local130][local74][local96].aClass47_Sub2_2 != null && local165 == arg0[local130][local74][local96].aClass47_Sub2_2.anInt7426) {
									continue;
								}
								if (local90 != 0) {
									local208 = Static272.method3780(local90);
									if (arg0[local130][local74][local96].aClass47_Sub2_1.anInt7426 == local208 || arg0[local130][local74][local96].aClass47_Sub2_2 != null && arg0[local130][local74][local96].aClass47_Sub2_2.anInt7426 == local208) {
										continue;
									}
								}
								if (local104 != 0) {
									local208 = Static272.method3780(local104);
									if (arg0[local130][local74][local96].aClass47_Sub2_1.anInt7426 == local208 || arg0[local130][local74][local96].aClass47_Sub2_2 != null && local208 == arg0[local130][local74][local96].aClass47_Sub2_2.anInt7426) {
										continue;
									}
								}
							}
							local299 = arg0[local130][local74][local96];
							if (local299.aClass167_1 != null) {
								for (local305 = local299.aClass167_1; local305 != null; local305 = local305.aClass167_2) {
									local310 = local305.aClass47_Sub1_2;
									if (local310 instanceof Interface11) {
										@Pc(316) Interface11 local316 = (Interface11) local310;
										local320 = local316.method5747();
										if (local320 == 21) {
											local320 = 19;
										}
										@Pc(331) int local331 = local316.method5742();
										@Pc(337) int local337 = local320 | local331 << 6;
										if (local337 == local82 || local90 != 0 && local90 == local337 || local104 != 0 && local104 == local337) {
											continue label231;
										}
									}
								}
							}
						}
						local299 = arg0[local130][local74][local96];
						if (local299 != null && local299.aClass167_1 != null) {
							for (local305 = local299.aClass167_1; local305 != null; local305 = local305.aClass167_2) {
								local310 = local305.aClass47_Sub1_2;
								if (local310.aShort104 != local310.aShort107 || local310.aShort105 != local310.aShort106) {
									for (@Pc(402) int local402 = local310.aShort104; local402 <= local310.aShort107; local402++) {
										for (local320 = local310.aShort105; local320 <= local310.aShort106; local320++) {
											Static183.aByteArrayArrayArray7[local130][local402][local320] = local19;
										}
									}
								}
							}
						}
						Static183.aByteArrayArrayArray7[local130][local74][local96] = local19;
						local126 = true;
					}
				}
				if (local126) {
					local165 = Static256.aClass70Array2[Static1.anInt41 + 1].I(local74, local96);
					if (local165 > Static162.anIntArray219[arg4]) {
						Static162.anIntArray219[arg4] = local165;
					}
					local208 = local74 << 7;
					if (local208 < Static194.anIntArray571[arg4]) {
						Static194.anIntArray571[arg4] = local208;
					} else if (local208 > Static148.anIntArray547[arg4]) {
						Static148.anIntArray547[arg4] = local208;
					}
					@Pc(506) int local506 = local96 << 7;
					if (local506 < Static213.anIntArray299[arg4]) {
						Static213.anIntArray299[arg4] = local506;
					} else if (local506 > Static347.anIntArray461[arg4]) {
						Static347.anIntArray461[arg4] = local506;
					}
				}
				if (!local112) {
					if (local74 >= 1 && local19 != Static183.aByteArrayArrayArray7[Static1.anInt41][local74 - 1][local96]) {
						Static447.anIntArray582[local56] = 0xD3000000 | 0x120000 | local74 - 1;
						Static429.anIntArray190[local56] = local96 | 0x130000;
						local56 = local56 + 1 & 0xFFF;
						Static183.aByteArrayArrayArray7[Static1.anInt41][local74 - 1][local96] = local19;
					}
					local96++;
					if (Static104.anInt2048 > local96) {
						if (local74 - 1 >= 0 && local19 != Static183.aByteArrayArrayArray7[Static1.anInt41][local74 - 1][local96] && (Static228.aByteArrayArrayArray8[Static1.anInt41][local74][local96] & 0x4) == 0 && (Static228.aByteArrayArrayArray8[Static1.anInt41][local74 - 1][local96 - 1] & 0x4) == 0) {
							Static447.anIntArray582[local56] = local74 - 1 | 0x52000000 | 0x120000;
							Static429.anIntArray190[local56] = local96 | 0x130000;
							local56 = local56 + 1 & 0xFFF;
							Static183.aByteArrayArrayArray7[Static1.anInt41][local74 - 1][local96] = local19;
						}
						if (local19 != Static183.aByteArrayArrayArray7[Static1.anInt41][local74][local96]) {
							Static447.anIntArray582[local56] = local74 | 0x520000 | 0x13000000;
							Static429.anIntArray190[local56] = local96 | 0x530000;
							Static183.aByteArrayArrayArray7[Static1.anInt41][local74][local96] = local19;
							local56 = local56 + 1 & 0xFFF;
						}
						if (local74 + 1 < Static80.anInt6558 && local19 != Static183.aByteArrayArrayArray7[Static1.anInt41][local74 + 1][local96] && (Static228.aByteArrayArrayArray8[Static1.anInt41][local74][local96] & 0x4) == 0 && (Static228.aByteArrayArrayArray8[Static1.anInt41][local74 + 1][local96 - 1] & 0x4) == 0) {
							Static447.anIntArray582[local56] = 0x92000000 | 0x520000 | local74 + 1;
							Static429.anIntArray190[local56] = local96 | 0x530000;
							Static183.aByteArrayArrayArray7[Static1.anInt41][local74 + 1][local96] = local19;
							local56 = local56 + 1 & 0xFFF;
						}
					}
					local96--;
					if (local74 + 1 < Static80.anInt6558 && local19 != Static183.aByteArrayArrayArray7[Static1.anInt41][local74 + 1][local96]) {
						Static447.anIntArray582[local56] = 0x53000000 | 0x920000 | local74 + 1;
						Static429.anIntArray190[local56] = local96 | 0x930000;
						Static183.aByteArrayArrayArray7[Static1.anInt41][local74 + 1][local96] = local19;
						local56 = local56 + 1 & 0xFFF;
					}
					local96--;
					if (local96 >= 0) {
						if (local74 - 1 >= 0 && Static183.aByteArrayArrayArray7[Static1.anInt41][local74 - 1][local96] != local19 && (Static228.aByteArrayArrayArray8[Static1.anInt41][local74][local96] & 0x4) == 0 && (Static228.aByteArrayArrayArray8[Static1.anInt41][local74 - 1][local96 + 1] & 0x4) == 0) {
							Static447.anIntArray582[local56] = local74 - 1 | 0xD20000 | 0x12000000;
							Static429.anIntArray190[local56] = local96 | 0xD30000;
							local56 = local56 + 1 & 0xFFF;
							Static183.aByteArrayArrayArray7[Static1.anInt41][local74 - 1][local96] = local19;
						}
						if (Static183.aByteArrayArrayArray7[Static1.anInt41][local74][local96] != local19) {
							Static447.anIntArray582[local56] = 0x93000000 | 0xD20000 | local74;
							Static429.anIntArray190[local56] = local96 | 0xD30000;
							Static183.aByteArrayArrayArray7[Static1.anInt41][local74][local96] = local19;
							local56 = local56 + 1 & 0xFFF;
						}
						if (local74 + 1 < Static80.anInt6558 && local19 != Static183.aByteArrayArrayArray7[Static1.anInt41][local74 + 1][local96] && (Static228.aByteArrayArrayArray8[Static1.anInt41][local74][local96] & 0x4) == 0 && (Static228.aByteArrayArrayArray8[Static1.anInt41][local74 + 1][local96 + 1] & 0x4) == 0) {
							Static447.anIntArray582[local56] = local74 + 1 | 0xD2000000 | 0x920000;
							Static429.anIntArray190[local56] = local96 | 0x930000;
							local56 = local56 + 1 & 0xFFF;
							Static183.aByteArrayArrayArray7[Static1.anInt41][local74 + 1][local96] = local19;
						}
					}
				}
			}
			if (Static162.anIntArray219[arg4] != -1000000) {
				Static162.anIntArray219[arg4] += 10;
				Static194.anIntArray571[arg4] -= 50;
				Static148.anIntArray547[arg4] += 50;
				Static347.anIntArray461[arg4] += 50;
				Static213.anIntArray299[arg4] -= 50;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(BLclient!tn;)V")
	public static void method5111(@OriginalArg(1) Class229 arg0) {
		if (Static158.anInt2833 != arg0.anInt6893) {
			return;
		}
		if (Static255.aClass47_Sub1_Sub5_Sub2_2.aString66 == null) {
			arg0.anInt6929 = 0;
			arg0.anInt6894 = 0;
			return;
		}
		arg0.anInt6942 = 150;
		arg0.anInt6881 = (int) (Math.sin((double) Static123.anInt2333 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt6917 = 5;
		arg0.anInt6929 = Static179.anInt3373;
		arg0.anInt6894 = Static221.method5879(Static255.aClass47_Sub1_Sub5_Sub2_2.aString66);
		arg0.anInt6916 = 0;
		arg0.anInt6898 = Static255.aClass47_Sub1_Sub5_Sub2_2.anInt5391;
		arg0.anInt6879 = Static255.aClass47_Sub1_Sub5_Sub2_2.anInt5407;
		arg0.anInt6901 = Static255.aClass47_Sub1_Sub5_Sub2_2.anInt5393;
	}
}
