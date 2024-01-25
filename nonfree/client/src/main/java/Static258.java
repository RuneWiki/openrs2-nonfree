import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!qp", name = "D", descriptor = "[I")
	public static int[] anIntArray400;

	@OriginalMember(owner = "client!qp", name = "F", descriptor = "Ljava/lang/String;")
	public static String aString52;

	@OriginalMember(owner = "client!qp", name = "H", descriptor = "Lclient!nq;")
	public static Class144 aClass144_88;

	@OriginalMember(owner = "client!qp", name = "N", descriptor = "I")
	public static int anInt5231 = -1;

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "([IZ[ILclient!km;[I)V")
	public static void method4482(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class67_Sub3_Sub3_Sub1 arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(12) int local12 = 0; local12 < arg0.length; local12++) {
			@Pc(18) int local18 = arg0[local12];
			@Pc(22) int local22 = arg1[local12];
			@Pc(26) int local26 = arg3[local12];
			for (@Pc(28) int local28 = 0; local22 != 0 && arg2.aClass72Array3.length > local28; local28++) {
				if ((local22 & 0x1) != 0) {
					if (local18 == -1) {
						arg2.aClass72Array3[local28] = null;
					} else {
						@Pc(41) Class111 local41 = Static306.method5143(local18);
						@Pc(44) int local44 = local41.anInt2720;
						@Pc(49) Class72 local49 = arg2.aClass72Array3[local28];
						if (local49 != null) {
							if (local49.anInt1550 == local18) {
								if (local44 == 0) {
									local49 = arg2.aClass72Array3[local28] = null;
								} else if (local44 == 1) {
									local49.anInt1549 = 0;
									local49.anInt1552 = 0;
									local49.anInt1555 = local26;
									local49.anInt1545 = 1;
									local49.anInt1544 = 0;
									Static354.method5681(arg2.anInt6310, arg2.anInt6308, local41, false, 0);
								} else if (local44 == 2) {
									local49.anInt1549 = 0;
								}
							} else if (local41.anInt2716 >= Static306.method5143(local49.anInt1550).anInt2716) {
								local49 = arg2.aClass72Array3[local28] = null;
							}
						}
						if (local49 == null) {
							local49 = arg2.aClass72Array3[local28] = new Class72();
							local49.anInt1549 = 0;
							local49.anInt1544 = 0;
							local49.anInt1555 = local26;
							local49.anInt1552 = 0;
							local49.anInt1545 = 1;
							local49.anInt1550 = local18;
							Static354.method5681(arg2.anInt6310, arg2.anInt6308, local41, false, 0);
						}
					}
				}
				local22 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!qp", name = "e", descriptor = "(B)V")
	public static void method4483() {
		@Pc(10) int local10 = Static246.aClass11_Sub25_Sub1_3.method2462(8);
		@Pc(19) int local19;
		if (Static331.anInt6366 > local10) {
			for (local19 = local10; local19 < Static331.anInt6366; local19++) {
				Static223.anIntArray344[Static262.anInt5355++] = Static87.anIntArray104[local19];
			}
		}
		if (Static331.anInt6366 < local10) {
			throw new RuntimeException("gppov1");
		}
		Static331.anInt6366 = 0;
		for (local19 = 0; local19 < local10; local19++) {
			@Pc(57) int local57 = Static87.anIntArray104[local19];
			@Pc(61) Class67_Sub3_Sub3_Sub2 local61 = Static105.aClass67_Sub3_Sub3_Sub2Array1[local57];
			@Pc(66) int local66 = Static246.aClass11_Sub25_Sub1_3.method2462(1);
			if (local66 == 0) {
				Static87.anIntArray104[Static331.anInt6366++] = local57;
				local61.anInt5010 = Static293.anInt5807;
			} else {
				@Pc(86) int local86 = Static246.aClass11_Sub25_Sub1_3.method2462(2);
				if (local86 == 0) {
					Static87.anIntArray104[Static331.anInt6366++] = local57;
					local61.anInt5010 = Static293.anInt5807;
					Static309.anIntArray498[Static90.anInt4650++] = local57;
				} else {
					@Pc(128) int local128;
					@Pc(138) int local138;
					if (local86 == 1) {
						Static87.anIntArray104[Static331.anInt6366++] = local57;
						local61.anInt5010 = Static293.anInt5807;
						local128 = Static246.aClass11_Sub25_Sub1_3.method2462(3);
						local61.method4386(1, local128);
						local138 = Static246.aClass11_Sub25_Sub1_3.method2462(1);
						if (local138 == 1) {
							Static309.anIntArray498[Static90.anInt4650++] = local57;
						}
					} else if (local86 == 2) {
						Static87.anIntArray104[Static331.anInt6366++] = local57;
						local61.anInt5010 = Static293.anInt5807;
						if (Static246.aClass11_Sub25_Sub1_3.method2462(1) == 1) {
							local128 = Static246.aClass11_Sub25_Sub1_3.method2462(3);
							local61.method4386(2, local128);
							local138 = Static246.aClass11_Sub25_Sub1_3.method2462(3);
							local61.method4386(2, local138);
						} else {
							local128 = Static246.aClass11_Sub25_Sub1_3.method2462(3);
							local61.method4386(0, local128);
						}
						local128 = Static246.aClass11_Sub25_Sub1_3.method2462(1);
						if (local128 == 1) {
							Static309.anIntArray498[Static90.anInt4650++] = local57;
						}
					} else if (local86 == 3) {
						Static223.anIntArray344[Static262.anInt5355++] = local57;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qp", name = "f", descriptor = "(B)I")
	public static int method4484() {
		try {
			if (Static59.anInt1131 == 0) {
				if (Static287.aLong173 > Static268.method4627() - 5000L) {
					return 0;
				}
				Static289.aClass2_9 = Static77.aClass118_7.method2708(Static68.anInt1253, Static206.aString40);
				Static341.aLong206 = Static268.method4627();
				Static59.anInt1131 = 1;
			}
			if (Static341.aLong206 + 30000L < Static268.method4627()) {
				return Static33.method468(1000);
			}
			@Pc(93) int local93;
			@Pc(134) int local134;
			if (Static59.anInt1131 == 1) {
				if (Static289.aClass2_9.anInt6 == 2) {
					return Static33.method468(1001);
				}
				if (Static289.aClass2_9.anInt6 != 1) {
					return -1;
				}
				Static291.aClass156_103 = new Class156((Socket) Static289.aClass2_9.anObject1, Static77.aClass118_7);
				Static289.aClass2_9 = null;
				local93 = 0;
				Static313.aClass11_Sub25_Sub1_5.anInt6076 = 0;
				if (Static103.aBoolean113) {
					local93 = Static99.anInt823;
				}
				Static313.aClass11_Sub25_Sub1_5.method5186(23);
				Static313.aClass11_Sub25_Sub1_5.method5168(local93);
				Static291.aClass156_103.method4183(Static313.aClass11_Sub25_Sub1_5.aByteArray93, Static313.aClass11_Sub25_Sub1_5.anInt6076);
				if (Static126.aClass78_4 != null) {
					Static126.aClass78_4.method5519();
				}
				if (Static143.aClass78_3 != null) {
					Static143.aClass78_3.method5519();
				}
				local134 = Static291.aClass156_103.method4187();
				if (Static126.aClass78_4 != null) {
					Static126.aClass78_4.method5519();
				}
				if (Static143.aClass78_3 != null) {
					Static143.aClass78_3.method5519();
				}
				if (local134 != 0) {
					return Static33.method468(local134);
				}
				Static59.anInt1131 = 2;
			}
			if (Static59.anInt1131 == 2) {
				if (Static291.aClass156_103.method4193() < 2) {
					return -1;
				}
				Static191.anInt6246 = Static291.aClass156_103.method4187();
				Static191.anInt6246 <<= 0x8;
				Static191.anInt6246 += Static291.aClass156_103.method4187();
				Static71.anInt1343 = 0;
				Static59.anInt1131 = 3;
				Static195.aByteArray77 = new byte[Static191.anInt6246];
			}
			if (Static59.anInt1131 != 3) {
				return -1;
			}
			local93 = Static291.aClass156_103.method4193();
			if (local93 < 1) {
				return -1;
			}
			if (Static191.anInt6246 - Static71.anInt1343 < local93) {
				local93 = Static191.anInt6246 - Static71.anInt1343;
			}
			Static291.aClass156_103.method4189(local93, Static195.aByteArray77, Static71.anInt1343);
			Static71.anInt1343 += local93;
			if (Static191.anInt6246 > Static71.anInt1343) {
				return -1;
			} else if (Static280.method164(Static195.aByteArray77)) {
				Static165.aClass157_Sub1Array5 = new Class157_Sub1[Static27.anInt493];
				local134 = 0;
				for (@Pc(251) int local251 = Static232.anInt4702; local251 <= Static284.anInt5615; local251++) {
					@Pc(257) Class157_Sub1 local257 = Static61.method915(local251);
					if (local257 != null) {
						Static165.aClass157_Sub1Array5[local134++] = local257;
					}
				}
				Static246.anInt4940 = 0;
				Static170.aClass11_Sub34_1 = null;
				Static291.aClass156_103.method4190();
				Static59.anInt1131 = 0;
				Static291.aClass156_103 = null;
				Static217.anInt4438 = 0;
				Static195.aByteArray77 = null;
				Static287.aLong173 = Static268.method4627();
				return 0;
			} else {
				return Static33.method468(1002);
			}
		} catch (@Pc(289) IOException local289) {
			return Static33.method468(1003);
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(ILclient!mj;IILclient!uo;IIIZIILclient!jm;III)Lclient!mj;")
	public static Class126 method4485(@OriginalArg(0) int arg0, @OriginalArg(1) Class126 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class129 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class111 arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg1 == null) {
			return null;
		}
		@Pc(11) int local11 = 1031;
		if (arg10 != null) {
			local11 = arg10.method2268(false, arg8, -1) | 0x407;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(47) long local47 = ((long) arg6 << 48) + (long) ((arg5 << 16) + arg2 + (arg12 << 24)) + ((long) arg4 << 32);
		@Pc(49) Class26 local49 = Static114.aClass26_18;
		@Pc(57) Class126 local57;
		synchronized (Static114.aClass26_18) {
			local57 = (Class126) Static114.aClass26_18.method332(local47);
		}
		@Pc(147) int local147;
		@Pc(153) int local153;
		@Pc(159) int local159;
		@Pc(163) int local163;
		if (local57 == null || arg3.method4938(local57.method3142(), local11) != 0) {
			if (local57 != null) {
				local11 = arg3.method4989(local11, local57.method3142());
			}
			@Pc(93) byte local93;
			if (arg2 == 1) {
				local93 = 9;
			} else if (arg2 == 2) {
				local93 = 12;
			} else if (arg2 == 3) {
				local93 = 15;
			} else if (arg2 == 4) {
				local93 = 18;
			} else {
				local93 = 21;
			}
			@Pc(122) int[] local122 = new int[] { 64, 96, 128 };
			@Pc(140) Class31 local140 = new Class31(local93 * 3 + 1, -local93 + 2 * 3 * local93, 0);
			local147 = local140.method438(0, 0, 0);
			@Pc(151) int[][] local151 = new int[3][local93];
			@Pc(165) int local165;
			@Pc(189) int local189;
			for (local153 = 0; local153 < 3; local153++) {
				local159 = local122[local153];
				local163 = local122[local153];
				for (local165 = 0; local165 < local93; local165++) {
					@Pc(173) int local173 = (local165 << 14) / local93;
					@Pc(181) int local181 = Class140.anIntArray330[local173] * local159 >> 15;
					local189 = local163 * Class140.anIntArray329[local173] >> 15;
					local151[local153][local165] = local140.method438(local181, 0, local189);
				}
			}
			for (local159 = 0; local159 < 3; local159++) {
				local163 = (local159 * 256 + 128) / 3;
				local165 = 256 - local163;
				@Pc(240) byte local240 = (byte) (local165 * arg5 + arg12 * local163 >> 8);
				@Pc(285) short local285 = (short) (((arg6 & 0x7F) * local163 + local165 * (arg4 & 0x7F) & 0x7F00) + ((arg6 & 0x380) * local163 + local165 * (arg4 & 0x380) & 0x38000) + ((arg6 & 0xFC00) * local163 + local165 * (arg4 & 0xFC00) & 0xFC0000) >> 8);
				for (local189 = 0; local189 < local93; local189++) {
					if (local159 == 0) {
						local140.method445((short) -1, local147, (byte) 1, local151[0][local189], (byte) -1, local285, local240, local151[0][(local189 + 1) % local93]);
					} else {
						local140.method445((short) -1, local151[local159 - 1][local189], (byte) 1, local151[local159][(local189 + 1) % local93], (byte) -1, local285, local240, local151[local159 - 1][(local189 + 1) % local93]);
						local140.method445((short) -1, local151[local159 - 1][local189], (byte) 1, local151[local159][local189], (byte) -1, local285, local240, local151[local159][(local189 + 1) % local93]);
					}
				}
			}
			local57 = arg3.method4929(local140, local11, Static130.anInt4676, 64, 768);
			@Pc(412) Class26 local412 = Static114.aClass26_18;
			synchronized (Static114.aClass26_18) {
				Static114.aClass26_18.method330(local47, local57);
			}
		}
		@Pc(431) int local431 = arg2 * 64 - 1;
		@Pc(434) int local434 = -local431;
		@Pc(437) int local437 = -local431;
		@Pc(439) int local439 = local431;
		local147 = local431;
		if (arg7) {
			if (arg11 > 9216 && arg11 < 15360) {
				local439 = local431 + 128;
			}
			if (arg11 > 1024 && arg11 < 7168) {
				local434 -= 128;
			}
			if (arg11 > 5120 && arg11 < 11264) {
				local147 = local431 + 128;
			}
			if (arg11 > 13312 || arg11 < 3072) {
				local437 -= 128;
			}
		}
		@Pc(486) int local486 = arg1.method3117();
		local153 = arg1.method3118();
		local159 = arg1.method3120();
		if (local486 < local434) {
			local486 = local434;
		}
		local163 = arg1.method3138();
		if (local437 > local159) {
			local159 = local437;
		}
		if (local153 > local439) {
			local153 = local439;
		}
		if (local147 < local163) {
			local163 = local147;
		}
		@Pc(521) Class11_Sub4_Sub14 local521 = null;
		if (arg10 != null) {
			@Pc(528) int local528 = arg10.anIntArray191[arg8];
			local521 = Static36.method537(local528 >> 16);
			arg8 = local528 & 0xFFFF;
		}
		if (local521 == null) {
			local57 = local57.method3158((byte) 3, local11, true);
			local57.method3134((local153 - local486) / 2, 128, (local163 - local159) / 2);
			local57.method3128((local486 + local153) / 2, 0, (local163 + local159) / 2);
		} else {
			local57 = local57.method3158((byte) 3, local11, true);
			local57.method3134((local153 - local486) / 2, 128, (local163 - local159) / 2);
			local57.method3128((local153 + local486) / 2, 0, (local163 + local159) / 2);
			local57.method3115(local521, arg8);
		}
		if (arg13 != 0) {
			local57.method3145(arg13);
		}
		if (arg0 != 0) {
			local57.method3156(arg0);
		}
		if (arg9 != 0) {
			local57.method3128(0, arg9, 0);
		}
		return local57;
	}
}
