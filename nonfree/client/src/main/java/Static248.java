import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!pp", name = "j", descriptor = "[[B")
	public static byte[][] aByteArrayArray16;

	@OriginalMember(owner = "client!pp", name = "k", descriptor = "Lclient!ac;")
	public static Class4 aClass4_7;

	@OriginalMember(owner = "client!pp", name = "e", descriptor = "Lclient!ik;")
	public static final Class103 aClass103_47 = new Class103(256);

	@OriginalMember(owner = "client!pp", name = "h", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray43 = new String[100];

	@OriginalMember(owner = "client!pp", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString307 = "Allocating memory";

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIIILclient!pe;I[BZ[Lclient!oa;I)[I")
	public static int[] method4270(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class89 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) Class149[] arg7, @OriginalArg(9) int arg8) {
		@Pc(14) int local14;
		@Pc(17) int local17;
		@Pc(23) int local23;
		@Pc(27) int local27;
		if (!arg6) {
			for (@Pc(7) int local7 = 0; local7 < 4; local7++) {
				@Pc(12) Class149 local12 = arg7[local7];
				for (local14 = 0; local14 < 64; local14++) {
					for (local17 = 0; local17 < 64; local17++) {
						local23 = arg0 + local14;
						local27 = arg4 + local17;
						if (local23 >= 0 && local23 < Static15.anInt287 && local27 >= 0 && Static325.anInt6173 > local27) {
							local12.method3953(local27, local23);
						}
					}
				}
			}
		}
		@Pc(64) Class7_Sub3 local64 = new Class7_Sub3(arg5);
		@Pc(69) int local69 = arg8 + arg0;
		local14 = arg4 + arg2;
		for (local17 = 0; local17 < arg1; local17++) {
			for (local23 = 0; local23 < 64; local23++) {
				for (local27 = 0; local27 < 64; local27++) {
					Static93.method1896(local23 + arg0, 0, arg4 + local27, 0, local14 + local27, local64, 0, arg6, local69 + local23, false, local17);
				}
			}
		}
		@Pc(126) boolean local126 = false;
		@Pc(128) boolean local128 = false;
		@Pc(133) int local133;
		@Pc(155) int local155;
		@Pc(168) int local168;
		@Pc(172) int local172;
		@Pc(174) int local174;
		@Pc(188) int local188;
		while (local64.anInt3005 < local64.aByteArray33.length) {
			local133 = local64.method2772();
			if (local133 == 128) {
				Static210.anIntArray575[0] = local64.method2764();
				Static210.anIntArray575[1] = local64.method2744();
				Static210.anIntArray575[2] = local64.method2744();
				Static210.anIntArray575[3] = local64.method2744();
				local126 = true;
				Static210.anIntArray575[4] = local64.method2764();
			} else {
				if (local133 != 129) {
					local64.anInt3005--;
					break;
				}
				if (Static222.aByteArrayArrayArray10 == null) {
					Static222.aByteArrayArrayArray10 = new byte[4][][];
				}
				for (local155 = 0; local155 < 4; local155++) {
					@Pc(160) byte local160 = local64.method2779();
					if (local160 == 0 && Static222.aByteArrayArrayArray10[local155] != null) {
						local168 = arg0;
						local172 = arg0 + 64;
						local174 = arg4;
						if (arg4 < 0) {
							local174 = 0;
						} else if (arg4 >= Static325.anInt6173) {
							local174 = Static325.anInt6173;
						}
						local188 = arg4 + 64;
						if (local172 < 0) {
							local172 = 0;
						} else if (local172 >= Static15.anInt287) {
							local172 = Static15.anInt287;
						}
						if (arg0 < 0) {
							local168 = 0;
						} else if (arg0 >= Static15.anInt287) {
							local168 = Static15.anInt287;
						}
						if (local188 < 0) {
							local188 = 0;
						} else if (Static325.anInt6173 <= local188) {
							local188 = Static325.anInt6173;
						}
						while (local172 > local168) {
							while (local188 > local174) {
								Static222.aByteArrayArrayArray10[local155][local168][local174] = 0;
								local174++;
							}
							local168++;
						}
					} else if (local160 == 1) {
						if (Static222.aByteArrayArrayArray10[local155] == null) {
							Static222.aByteArrayArrayArray10[local155] = new byte[Static15.anInt287 + 1][Static325.anInt6173 + 1];
						}
						for (local168 = 0; local168 < 64; local168 += 4) {
							for (local172 = 0; local172 < 64; local172 += 4) {
								@Pc(278) byte local278 = local64.method2779();
								for (local188 = local168 + arg0; local188 < local168 + arg0 + 4; local188++) {
									for (@Pc(288) int local288 = local172 + arg4; local288 < local172 + arg4 + 4; local288++) {
										if (local188 >= 0 && Static15.anInt287 > local188 && local288 >= 0 && Static325.anInt6173 > local288) {
											Static222.aByteArrayArrayArray10[local155][local188][local288] = local278;
										}
									}
								}
							}
						}
					} else if (local160 == 2) {
						if (Static222.aByteArrayArrayArray10[local155] == null) {
							Static222.aByteArrayArrayArray10[local155] = new byte[Static15.anInt287 + 1][Static325.anInt6173 + 1];
						}
						if (local155 > 0) {
							local168 = arg0;
							local172 = arg0 + 64;
							local174 = arg4;
							local188 = arg4 + 64;
							if (arg0 < 0) {
								local168 = 0;
							} else if (arg0 >= Static15.anInt287) {
								local168 = Static15.anInt287;
							}
							if (local172 < 0) {
								local172 = 0;
							} else if (Static15.anInt287 <= local172) {
								local172 = Static15.anInt287;
							}
							if (arg4 < 0) {
								local174 = 0;
							} else if (arg4 >= Static325.anInt6173) {
								local174 = Static325.anInt6173;
							}
							if (local188 < 0) {
								local188 = 0;
							} else if (local188 >= Static325.anInt6173) {
								local188 = Static325.anInt6173;
							}
							while (local168 < local172) {
								while (local188 > local174) {
									Static222.aByteArrayArrayArray10[local155][local168][local174] = Static222.aByteArrayArrayArray10[local155 - 1][local168][local174];
									local174++;
								}
								local168++;
							}
						}
					}
				}
				local128 = true;
			}
		}
		@Pc(553) int local553;
		if (!arg6) {
			@Pc(513) Class14 local513 = null;
			while (true) {
				while (local64.anInt3005 < local64.aByteArray33.length) {
					local155 = local64.method2772();
					if (local155 == 0) {
						local513 = new Class14(local64);
					} else if (local155 == 1) {
						local553 = local64.method2772();
						if (local553 > 0) {
							for (local168 = 0; local168 < local553; local168++) {
								@Pc(563) Class7_Sub16_Sub1 local563 = new Class7_Sub16_Sub1(local64);
								if (local563.anInt4089 == 31) {
									@Pc(573) Class141 local573 = Static289.method1954(local64.method2764());
									local563.method3647(local573.anInt4235, local573.anInt4229, local573.anInt4238, local573.anInt4228);
								}
								local563.anInt4070 += arg0 << 7;
								local563.anInt4072 += arg4 << 7;
								local174 = local563.anInt4070 >> 7;
								local188 = local563.anInt4072 >> 7;
								if (local174 >= 0 && local188 >= 0 && local174 < Static15.anInt287 && local188 < Static325.anInt6173) {
									local563.anInt4074 = Static23.anIntArrayArrayArray15[local563.anInt4088][local174][local188] - local563.anInt4074;
									if (arg3.method5419() > 0) {
										Static229.method4024(local563);
									}
								}
							}
						}
					} else if (local155 == 2) {
						if (local513 == null) {
							local513 = new Class14();
						}
						local513.method211(local64);
					} else {
						throw new IllegalStateException();
					}
				}
				if (local513 != null) {
					for (local155 = 0; local155 < 8; local155++) {
						for (local553 = 0; local553 < 8; local553++) {
							local168 = local155 + (arg0 >> 3);
							local172 = local553 + (arg4 >> 3);
							if (local168 >= 0 && local168 < Static15.anInt287 >> 3 && local172 >= 0 && local172 < Static325.anInt6173 >> 3) {
								Static71.method1391(local513, local172, local168);
							}
						}
					}
				}
				break;
			}
		}
		if (!local128 && Static222.aByteArrayArrayArray10 != null) {
			for (local133 = 0; local133 < 4; local133++) {
				if (Static222.aByteArrayArrayArray10[local133] != null) {
					for (local155 = 0; local155 < 16; local155++) {
						for (local553 = 0; local553 < 16; local553++) {
							local168 = local155 + (arg0 >> 2);
							local172 = local553 + (arg4 >> 2);
							if (local168 >= 0 && local168 < 26 && local172 >= 0 && local172 < 26) {
								Static222.aByteArrayArrayArray10[local133][local168][local172] = 0;
							}
						}
					}
				}
			}
		}
		if (local126) {
			return Static210.anIntArray575;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(II)Lclient!bn;")
	public static Class7_Sub1_Sub5 method4272(@OriginalArg(0) int arg0) {
		@Pc(10) Class7_Sub1_Sub5 local10 = (Class7_Sub1_Sub5) aClass103_47.method2682((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(22) byte[] local22 = Static327.aClass180_92.method4560(arg0, 26);
		local10 = new Class7_Sub1_Sub5();
		if (local22 != null) {
			local10.method502(new Class7_Sub3(local22));
		}
		aClass103_47.method2687(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)V")
	public static void method4273() {
		if (Static80.anIntArray288 != null) {
			return;
		}
		Static80.anIntArray288 = new int[65536];
		@Pc(17) double local17 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(19) int local19 = 0; local19 < 65536; local19++) {
			@Pc(38) double local38 = (double) (local19 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(49) double local49 = (double) (local19 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(56) double local56 = (double) (local19 & 0x7F) / 128.0D;
			@Pc(58) double local58 = local56;
			@Pc(60) double local60 = local56;
			@Pc(62) double local62 = local56;
			if (local49 != 0.0D) {
				@Pc(79) double local79;
				if (local56 < 0.5D) {
					local79 = local56 * (local49 + 1.0D);
				} else {
					local79 = local56 + local49 - local56 * local49;
				}
				@Pc(93) double local93 = local56 * 2.0D - local79;
				@Pc(97) double local97 = local38 + 0.3333333333333333D;
				if (local97 > 1.0D) {
					local97--;
				}
				@Pc(111) double local111 = local38 - 0.3333333333333333D;
				if (local97 * 6.0D < 1.0D) {
					local58 = (local79 - local93) * 6.0D * local97 + local93;
				} else if (local97 * 2.0D < 1.0D) {
					local58 = local79;
				} else if (local97 * 3.0D < 2.0D) {
					local58 = local93 + (0.6666666666666666D - local97) * (-local93 + local79) * 6.0D;
				} else {
					local58 = local93;
				}
				if (local111 < 0.0D) {
					local111++;
				}
				if (local38 * 6.0D < 1.0D) {
					local60 = local93 + (local79 - local93) * 6.0D * local38;
				} else if (local38 * 2.0D < 1.0D) {
					local60 = local79;
				} else if (local38 * 3.0D < 2.0D) {
					local60 = (0.6666666666666666D - local38) * 6.0D * (local79 - local93) + local93;
				} else {
					local60 = local93;
				}
				if (local111 * 6.0D < 1.0D) {
					local62 = local111 * (local79 - local93) * 6.0D + local93;
				} else if (local111 * 2.0D < 1.0D) {
					local62 = local79;
				} else if (local111 * 3.0D < 2.0D) {
					local62 = local93 + (local79 - local93) * 6.0D * (0.6666666666666666D - local111);
				} else {
					local62 = local93;
				}
			}
			local58 = Math.pow(local58, local17);
			local60 = Math.pow(local60, local17);
			local62 = Math.pow(local62, local17);
			@Pc(284) int local284 = (int) (local58 * 256.0D);
			@Pc(289) int local289 = (int) (local60 * 256.0D);
			@Pc(294) int local294 = (int) (local62 * 256.0D);
			@Pc(305) int local305 = local294 + (local284 << 16) + (local289 << 8);
			Static80.anIntArray288[local19] = local305;
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(III)V")
	public static void method4274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = arg0; local1 >= 0; local1--) {
			if (Static229.aClass49ArrayArrayArray6[local1][arg1][arg2] == null) {
				Static229.aClass49ArrayArrayArray6[local1][arg1][arg2] = new Class49(local1, arg1, arg2);
			}
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIII)I")
	public static int method4275(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 > 243) {
			arg0 >>= 0x4;
		} else if (arg2 > 217) {
			arg0 >>= 0x3;
		} else if (arg2 > 192) {
			arg0 >>= 0x2;
		} else if (arg2 > 179) {
			arg0 >>= 0x1;
		}
		return (arg1 >> 2 << 10) - (-(arg0 >> 5 << 7) - (arg2 >> 1));
	}
}
