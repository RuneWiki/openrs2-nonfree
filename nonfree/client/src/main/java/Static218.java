import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!le", name = "f", descriptor = "I")
	public static int anInt4198 = 1;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IB)Lclient!bb;")
	public static Class19 method3409(@OriginalArg(0) int arg0) {
		@Pc(15) Class19 local15 = (Class19) Static112.aClass171_16.method3941((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static317.aClass160_63.method3696(arg0, 0);
		local15 = new Class19();
		if (local25 != null) {
			local15.method450(new Class2_Sub23(local25), arg0);
		}
		Static112.aClass171_16.method3940((long) arg0, local15);
		return local15;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(BIZII[[[Lclient!hg;)Z")
	public static boolean method3410(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class106[][][] arg4) {
		@Pc(14) byte local14 = arg1 ? 1 : (byte) (Static356.anInt6044 & 0xFF);
		if (Static231.aByteArrayArrayArray9[Static383.anInt6436][arg3][arg2] == local14) {
			return false;
		} else if ((Static227.aByteArrayArrayArray8[Static383.anInt6436][arg3][arg2] & 0x4) == 0) {
			return false;
		} else {
			@Pc(39) byte local39 = 0;
			@Pc(41) int local41 = 0;
			Static79.anIntArray148[0] = arg3;
			@Pc(48) int local48 = local39 + 1;
			Static425.anIntArray600[0] = arg2;
			Static231.aByteArrayArrayArray9[Static383.anInt6436][arg3][arg2] = local14;
			while (local41 != local48) {
				@Pc(66) int local66 = Static79.anIntArray148[local41] & 0xFFFF;
				@Pc(74) int local74 = Static79.anIntArray148[local41] >> 16 & 0xFF;
				@Pc(82) int local82 = Static79.anIntArray148[local41] >> 24 & 0xFF;
				@Pc(88) int local88 = Static425.anIntArray600[local41] & 0xFFFF;
				@Pc(96) int local96 = Static425.anIntArray600[local41] >> 16 & 0xFF;
				local41 = local41 + 1 & 0xFFF;
				@Pc(104) boolean local104 = false;
				if ((Static227.aByteArrayArrayArray8[Static383.anInt6436][local66][local88] & 0x4) == 0) {
					local104 = true;
				}
				@Pc(118) boolean local118 = false;
				@Pc(160) int local160;
				@Pc(206) int local206;
				label231: for (@Pc(122) int local122 = Static383.anInt6436 + 1; local122 <= 3; local122++) {
					if ((Static227.aByteArrayArrayArray8[local122][local66][local88] & 0x8) == 0) {
						@Pc(312) Class3_Sub2 local312;
						@Pc(322) int local322;
						@Pc(301) Class106 local301;
						@Pc(307) Class4 local307;
						if (local104 && arg4[local122][local66][local88] != null) {
							if (arg4[local122][local66][local88].aClass3_Sub5_1 != null) {
								local160 = Static208.method3302(local74);
								if (local160 == arg4[local122][local66][local88].aClass3_Sub5_1.anInt6517 || arg4[local122][local66][local88].aClass3_Sub5_2 != null && arg4[local122][local66][local88].aClass3_Sub5_2.anInt6517 == local160) {
									continue;
								}
								if (local82 != 0) {
									local206 = Static208.method3302(local82);
									if (arg4[local122][local66][local88].aClass3_Sub5_1.anInt6517 == local206 || arg4[local122][local66][local88].aClass3_Sub5_2 != null && arg4[local122][local66][local88].aClass3_Sub5_2.anInt6517 == local206) {
										continue;
									}
								}
								if (local96 != 0) {
									local206 = Static208.method3302(local96);
									if (local206 == arg4[local122][local66][local88].aClass3_Sub5_1.anInt6517 || arg4[local122][local66][local88].aClass3_Sub5_2 != null && local206 == arg4[local122][local66][local88].aClass3_Sub5_2.anInt6517) {
										continue;
									}
								}
							}
							local301 = arg4[local122][local66][local88];
							if (local301.aClass4_3 != null) {
								for (local307 = local301.aClass4_3; local307 != null; local307 = local307.aClass4_1) {
									local312 = local307.aClass3_Sub2_1;
									if (local312 instanceof Interface6) {
										@Pc(318) Interface6 local318 = (Interface6) local312;
										local322 = local318.method5149();
										if (local322 == 21) {
											local322 = 19;
										}
										@Pc(331) int local331 = local318.method5155();
										@Pc(337) int local337 = local331 << 6 | local322;
										if (local74 == local337 || local82 != 0 && local337 == local82 || local96 != 0 && local337 == local96) {
											continue label231;
										}
									}
								}
							}
						}
						local301 = arg4[local122][local66][local88];
						if (local301 != null && local301.aClass4_3 != null) {
							for (local307 = local301.aClass4_3; local307 != null; local307 = local307.aClass4_1) {
								local312 = local307.aClass3_Sub2_1;
								if (local312.aShort87 != local312.aShort85 || local312.aShort86 != local312.aShort88) {
									for (@Pc(402) int local402 = local312.aShort85; local402 <= local312.aShort87; local402++) {
										for (local322 = local312.aShort86; local322 <= local312.aShort88; local322++) {
											Static231.aByteArrayArrayArray9[local122][local402][local322] = local14;
										}
									}
								}
							}
						}
						local118 = true;
						Static231.aByteArrayArrayArray9[local122][local66][local88] = local14;
					}
				}
				if (local118) {
					local160 = Static58.aClass64Array1[Static383.anInt6436 + 1].l(local66, local88);
					if (Static195.anIntArray333[arg0] < local160) {
						Static195.anIntArray333[arg0] = local160;
					}
					local206 = local66 << 7;
					@Pc(476) int local476 = local88 << 7;
					if (Static236.anIntArray382[arg0] > local206) {
						Static236.anIntArray382[arg0] = local206;
					} else if (Static245.anIntArray552[arg0] < local206) {
						Static245.anIntArray552[arg0] = local206;
					}
					if (local476 < Static434.anIntArray604[arg0]) {
						Static434.anIntArray604[arg0] = local476;
					} else if (local476 > Static217.anIntArray358[arg0]) {
						Static217.anIntArray358[arg0] = local476;
					}
				}
				if (!local104) {
					if (local66 >= 1 && Static231.aByteArrayArrayArray9[Static383.anInt6436][local66 - 1][local88] != local14) {
						Static79.anIntArray148[local48] = local66 - 1 | 0x120000 | 0xD3000000;
						Static425.anIntArray600[local48] = local88 | 0x130000;
						Static231.aByteArrayArrayArray9[Static383.anInt6436][local66 - 1][local88] = local14;
						local48 = local48 + 1 & 0xFFF;
					}
					local88++;
					if (Static379.anInt6422 > local88) {
						if (local66 - 1 >= 0 && local14 != Static231.aByteArrayArrayArray9[Static383.anInt6436][local66 - 1][local88] && (Static227.aByteArrayArrayArray8[Static383.anInt6436][local66][local88] & 0x4) == 0 && (Static227.aByteArrayArrayArray8[Static383.anInt6436][local66 - 1][local88 - 1] & 0x4) == 0) {
							Static79.anIntArray148[local48] = local66 - 1 | 0x120000 | 0x52000000;
							Static425.anIntArray600[local48] = local88 | 0x130000;
							Static231.aByteArrayArrayArray9[Static383.anInt6436][local66 - 1][local88] = local14;
							local48 = local48 + 1 & 0xFFF;
						}
						if (local14 != Static231.aByteArrayArrayArray9[Static383.anInt6436][local66][local88]) {
							Static79.anIntArray148[local48] = local66 | 0x520000 | 0x13000000;
							Static425.anIntArray600[local48] = local88 | 0x530000;
							Static231.aByteArrayArrayArray9[Static383.anInt6436][local66][local88] = local14;
							local48 = local48 + 1 & 0xFFF;
						}
						if (local66 + 1 < Static229.anInt4427 && local14 != Static231.aByteArrayArrayArray9[Static383.anInt6436][local66 + 1][local88] && (Static227.aByteArrayArrayArray8[Static383.anInt6436][local66][local88] & 0x4) == 0 && (Static227.aByteArrayArrayArray8[Static383.anInt6436][local66 + 1][local88 - 1] & 0x4) == 0) {
							Static79.anIntArray148[local48] = local66 + 1 | 0x92000000 | 0x520000;
							Static425.anIntArray600[local48] = local88 | 0x530000;
							Static231.aByteArrayArrayArray9[Static383.anInt6436][local66 + 1][local88] = local14;
							local48 = local48 + 1 & 0xFFF;
						}
					}
					local88--;
					if (local66 + 1 < Static229.anInt4427 && Static231.aByteArrayArrayArray9[Static383.anInt6436][local66 + 1][local88] != local14) {
						Static79.anIntArray148[local48] = 0x53000000 | 0x920000 | local66 + 1;
						Static425.anIntArray600[local48] = local88 | 0x930000;
						local48 = local48 + 1 & 0xFFF;
						Static231.aByteArrayArrayArray9[Static383.anInt6436][local66 + 1][local88] = local14;
					}
					local88--;
					if (local88 >= 0) {
						if (local66 - 1 >= 0 && Static231.aByteArrayArrayArray9[Static383.anInt6436][local66 - 1][local88] != local14 && (Static227.aByteArrayArrayArray8[Static383.anInt6436][local66][local88] & 0x4) == 0 && (Static227.aByteArrayArrayArray8[Static383.anInt6436][local66 - 1][local88 + 1] & 0x4) == 0) {
							Static79.anIntArray148[local48] = local66 - 1 | 0x12000000 | 0xD20000;
							Static425.anIntArray600[local48] = local88 | 0xD30000;
							Static231.aByteArrayArrayArray9[Static383.anInt6436][local66 - 1][local88] = local14;
							local48 = local48 + 1 & 0xFFF;
						}
						if (Static231.aByteArrayArrayArray9[Static383.anInt6436][local66][local88] != local14) {
							Static79.anIntArray148[local48] = local66 | 0xD20000 | 0x93000000;
							Static425.anIntArray600[local48] = local88 | 0xD30000;
							local48 = local48 + 1 & 0xFFF;
							Static231.aByteArrayArrayArray9[Static383.anInt6436][local66][local88] = local14;
						}
						if (Static229.anInt4427 > local66 + 1 && local14 != Static231.aByteArrayArrayArray9[Static383.anInt6436][local66 + 1][local88] && (Static227.aByteArrayArrayArray8[Static383.anInt6436][local66][local88] & 0x4) == 0 && (Static227.aByteArrayArrayArray8[Static383.anInt6436][local66 + 1][local88 + 1] & 0x4) == 0) {
							Static79.anIntArray148[local48] = 0xD2000000 | 0x920000 | local66 + 1;
							Static425.anIntArray600[local48] = local88 | 0x930000;
							Static231.aByteArrayArrayArray9[Static383.anInt6436][local66 + 1][local88] = local14;
							local48 = local48 + 1 & 0xFFF;
						}
					}
				}
			}
			if (Static195.anIntArray333[arg0] != -1000000) {
				Static195.anIntArray333[arg0] += 10;
				Static236.anIntArray382[arg0] -= 50;
				Static245.anIntArray552[arg0] += 50;
				Static217.anIntArray358[arg0] += 50;
				Static434.anIntArray604[arg0] -= 50;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V")
	public static void method3411() {
		if (Static96.aBoolean166) {
			return;
		}
		Static243.aBoolean333 = true;
		if (Static12.aClass79_Sub1_1.aBoolean363) {
			Static287.aFloat74 = (int) Static287.aFloat74 + 47 & 0xFFFFFFF0;
		} else {
			Static286.aFloat73 += (12.0F - Static286.aFloat73) / 2.0F;
		}
		Static96.aBoolean166 = true;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ZI)V")
	public static void method3412(@OriginalArg(0) boolean arg0) {
		while (true) {
			if (Static438.aClass2_Sub23_Sub2_2.method5516(Static379.anInt6425) >= 15) {
				@Pc(23) int local23 = Static438.aClass2_Sub23_Sub2_2.method5519(15);
				if (local23 != 32767) {
					@Pc(28) boolean local28 = false;
					if (Static174.aClass3_Sub2_Sub1_Sub1Array1[local23] == null) {
						Static174.aClass3_Sub2_Sub1_Sub1Array1[local23] = new Class3_Sub2_Sub1_Sub1();
						Static174.aClass3_Sub2_Sub1_Sub1Array1[local23].anInt6137 = local23;
						local28 = true;
					}
					@Pc(49) Class3_Sub2_Sub1_Sub1 local49 = Static174.aClass3_Sub2_Sub1_Sub1Array1[local23];
					Static173.anIntArray307[Static62.anInt1371++] = local23;
					local49.anInt6130 = Static131.anInt2821;
					if (local49.aClass65_1 != null && local49.aClass65_1.method1707()) {
						Static417.method5540(local49);
					}
					@Pc(78) int local78;
					if (arg0) {
						local78 = Static438.aClass2_Sub23_Sub2_2.method5519(8);
						if (local78 > 127) {
							local78 -= 256;
						}
					} else {
						local78 = Static438.aClass2_Sub23_Sub2_2.method5519(5);
						if (local78 > 15) {
							local78 -= 32;
						}
					}
					@Pc(102) int local102;
					if (arg0) {
						local102 = Static438.aClass2_Sub23_Sub2_2.method5519(8);
						if (local102 > 127) {
							local102 -= 256;
						}
					} else {
						local102 = Static438.aClass2_Sub23_Sub2_2.method5519(5);
						if (local102 > 15) {
							local102 -= 32;
						}
					}
					local49.method1426(Static219.aClass76_2.method1888(Static438.aClass2_Sub23_Sub2_2.method5519(14)));
					@Pc(132) int local132 = Static438.aClass2_Sub23_Sub2_2.method5519(1);
					if (local132 == 1) {
						Static1.anIntArray67[Static121.anInt2701++] = local23;
					}
					@Pc(154) int local154 = Static438.aClass2_Sub23_Sub2_2.method5519(3) + 4 << 11 & 0x3EEB;
					@Pc(159) int local159 = Static438.aClass2_Sub23_Sub2_2.method5519(2);
					@Pc(164) int local164 = Static438.aClass2_Sub23_Sub2_2.method5519(1);
					local49.method4929(local49.aClass65_1.anInt2128);
					local49.anInt6138 = local49.aClass65_1.anInt2139 << 3;
					if (local49.anInt6138 == 0) {
						local49.method4921(0);
					} else if (local28) {
						local49.method4921(local154);
					}
					local49.method1433(Static375.aClass3_Sub2_Sub1_Sub2_7.anIntArray525[0] + local78, local102 + Static375.aClass3_Sub2_Sub1_Sub2_7.anIntArray524[0], local164 == 1, local159, local49.method4935());
					if (local49.aClass65_1.method1707()) {
						Static54.method894(local49.anIntArray525[0], null, local49.anIntArray524[0], 0, null, local49.aByte89, local49);
					}
					continue;
				}
			}
			Static438.aClass2_Sub23_Sub2_2.method5513();
			return;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ILclient!vc;)I")
	public static int method3413(@OriginalArg(1) Class2_Sub23_Sub2 arg0) {
		@Pc(15) int local15 = arg0.method5519(2);
		@Pc(19) int local19;
		if (local15 == 0) {
			local19 = 0;
		} else if (local15 == 1) {
			local19 = arg0.method5519(5);
		} else if (local15 == 2) {
			local19 = arg0.method5519(8);
		} else {
			local19 = arg0.method5519(11);
		}
		return local19;
	}
}
