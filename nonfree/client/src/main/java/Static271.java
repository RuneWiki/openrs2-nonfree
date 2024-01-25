import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "Lclient!nq;")
	public static Class144 aClass144_65;

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "Lclient!gi;")
	public static Class11_Sub4_Sub7 aClass11_Sub4_Sub7_2;

	@OriginalMember(owner = "client!rj", name = "f", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!rj", name = "h", descriptor = "F")
	public static float aFloat47;

	@OriginalMember(owner = "client!rj", name = "j", descriptor = "Lclient!uh;")
	public static Class199 aClass199_3;

	@OriginalMember(owner = "client!rj", name = "l", descriptor = "F")
	public static float aFloat48;

	@OriginalMember(owner = "client!rj", name = "m", descriptor = "I")
	public static int anInt4329;

	@OriginalMember(owner = "client!rj", name = "n", descriptor = "I")
	public static int anInt4330;

	@OriginalMember(owner = "client!rj", name = "o", descriptor = "I")
	public static int anInt4331;

	@OriginalMember(owner = "client!rj", name = "p", descriptor = "[B")
	private static byte[] aByteArray72;

	@OriginalMember(owner = "client!rj", name = "q", descriptor = "I")
	public static int anInt4332;

	@OriginalMember(owner = "client!rj", name = "r", descriptor = "I")
	public static int anInt4333;

	@OriginalMember(owner = "client!rj", name = "s", descriptor = "[B")
	private static byte[] aByteArray73;

	@OriginalMember(owner = "client!rj", name = "t", descriptor = "I")
	public static int anInt4334;

	@OriginalMember(owner = "client!rj", name = "u", descriptor = "I")
	public static int anInt4335;

	@OriginalMember(owner = "client!rj", name = "v", descriptor = "I")
	public static int anInt4336;

	@OriginalMember(owner = "client!rj", name = "w", descriptor = "[B")
	private static byte[] aByteArray74;

	@OriginalMember(owner = "client!rj", name = "x", descriptor = "[B")
	private static byte[] aByteArray75;

	@OriginalMember(owner = "client!rj", name = "y", descriptor = "Lclient!ec;")
	private static Class58 aClass58_25;

	@OriginalMember(owner = "client!rj", name = "z", descriptor = "[[[Lclient!wd;")
	private static Class210[][][] aClass210ArrayArrayArray2;

	@OriginalMember(owner = "client!rj", name = "A", descriptor = "[S")
	private static short[] aShortArray79;

	@OriginalMember(owner = "client!rj", name = "B", descriptor = "I")
	public static int anInt4337;

	@OriginalMember(owner = "client!rj", name = "C", descriptor = "[I")
	private static int[] anIntArray335;

	@OriginalMember(owner = "client!rj", name = "D", descriptor = "[B")
	private static byte[] aByteArray76;

	@OriginalMember(owner = "client!rj", name = "E", descriptor = "I")
	public static int anInt4338;

	@OriginalMember(owner = "client!rj", name = "F", descriptor = "I")
	public static int anInt4339;

	@OriginalMember(owner = "client!rj", name = "G", descriptor = "I")
	public static int anInt4340;

	@OriginalMember(owner = "client!rj", name = "H", descriptor = "[S")
	private static short[] aShortArray80;

	@OriginalMember(owner = "client!rj", name = "I", descriptor = "I")
	public static int anInt4341;

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "Lclient!ec;")
	private static final Class58 aClass58_24 = new Class58(16);

	@OriginalMember(owner = "client!rj", name = "d", descriptor = "[S")
	private static final short[] aShortArray78 = new short[1];

	@OriginalMember(owner = "client!rj", name = "e", descriptor = "[B")
	private static final byte[] aByteArray71 = new byte[1];

	@OriginalMember(owner = "client!rj", name = "g", descriptor = "Lclient!aq;")
	public static final Class16 aClass16_37 = new Class16();

	@OriginalMember(owner = "client!rj", name = "i", descriptor = "I")
	public static int anInt4327 = (int) (Math.random() * 11.0D) - 5;

	@OriginalMember(owner = "client!rj", name = "k", descriptor = "I")
	public static int anInt4328 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!uo;Lclient!kh;IIII[I[I)V")
	private static void method3803(@OriginalArg(0) Class129 arg0, @OriginalArg(1) Class11_Sub25 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7) {
		@Pc(3) int local3 = arg1.method5185();
		if ((local3 & 0x1) == 0) {
			@Pc(15) boolean local15 = (local3 & 0x2) == 0;
			@Pc(21) int local21 = local3 >> 2 & 0x3F;
			if (local21 != 62) {
				if (local21 == 63) {
					local21 = arg1.method5185();
				} else if (local15) {
					local21 = arg6[local21];
				} else {
					local21 = arg7[local21];
				}
				if (local15) {
					aByteArray76[arg4 + arg5 * anInt4331] = (byte) local21;
					aByteArray74[arg4 + arg5 * anInt4331] = 0;
				} else {
					aByteArray74[arg4 + arg5 * anInt4331] = (byte) local21;
					aByteArray73[arg4 + arg5 * anInt4331] = 0;
					aByteArray76[arg4 + arg5 * anInt4331] = arg1.method5175();
				}
			}
			return;
		}
		@Pc(100) int local100 = (local3 >> 1 & 0x3) + 1;
		@Pc(108) boolean local108 = (local3 & 0x8) != 0;
		@Pc(116) boolean local116 = (local3 & 0x10) != 0;
		for (@Pc(118) int local118 = 0; local118 < local100; local118++) {
			@Pc(123) int local123 = arg1.method5185();
			@Pc(125) int local125 = 0;
			@Pc(127) int local127 = 0;
			if (local108) {
				local125 = arg1.method5185();
				local127 = arg1.method5185();
			}
			@Pc(139) int local139 = 0;
			if (local116) {
				local139 = arg1.method5185();
			}
			@Pc(215) short[] local215;
			@Pc(218) byte[] local218;
			@Pc(220) int local220;
			if (local118 == 0) {
				aByteArray76[arg4 + arg5 * anInt4331] = (byte) local123;
				aByteArray74[arg4 + arg5 * anInt4331] = (byte) local125;
				aByteArray73[arg4 + arg5 * anInt4331] = (byte) local127;
				if (local139 == 1) {
					aShortArray79[arg4 + arg5 * anInt4331] = (short) (arg1.method5187() + 1);
					aByteArray75[arg4 + arg5 * anInt4331] = arg1.method5175();
				} else if (local139 > 1) {
					aShortArray79[arg4 + arg5 * anInt4331] = -1;
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method5187();
						local218[local220] = arg1.method5175();
					}
					aClass58_25.method1006((long) (arg4 << 16 | arg5), new Class11_Sub7(local215, local218));
				}
			} else {
				local215 = null;
				local218 = null;
				if (local139 > 0) {
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method5187();
						local218[local220] = arg1.method5175();
					}
				}
				if (aClass210ArrayArrayArray2[local118 - 1][arg2 - (anInt4332 >> 6)][arg3 - (anInt4339 >> 6)] == null) {
					aClass210ArrayArrayArray2[local118 - 1][arg2 - (anInt4332 >> 6)][arg3 - (anInt4339 >> 6)] = new Class210();
				}
				@Pc(338) Class10_Sub5 local338 = new Class10_Sub5(arg4 & 0x3F, arg5 & 0x3F, local123, local125, local127, local215, local218);
				aClass210ArrayArrayArray2[local118 - 1][arg2 - (anInt4332 >> 6)][arg3 - (anInt4339 >> 6)].method5612(local338);
			}
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(II)Lclient!fk;")
	public static Class74 method3804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class74 local3 = new Class74();
		for (@Pc(8) Class11_Sub4_Sub7 local8 = (Class11_Sub4_Sub7) aClass58_24.method1008(); local8 != null; local8 = (Class11_Sub4_Sub7) aClass58_24.method1004()) {
			if (local8.aBoolean121 && local8.method1586(arg0, arg1)) {
				local3.method1290(local8);
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		anInt4335 = arg0 - anInt4332;
		anInt4330 = arg1 - anInt4339;
		anInt4341 = arg2 - anInt4332;
		anInt4337 = arg3 - anInt4339;
		anInt4336 = arg4;
		anInt4340 = arg5;
		anInt4334 = arg6;
		anInt4333 = arg7;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "()V")
	public static void method3806() {
		@Pc(2) int[] local2 = new int[3];
		for (@Pc(4) int local4 = 0; local4 < aClass199_3.anInt6201; local4++) {
			@Pc(32) boolean local32 = aClass11_Sub4_Sub7_2.method1584(local2, aClass199_3.anIntArray513[local4] >> 14 & 0x3FFF, aClass199_3.anIntArray513[local4] >> 28 & 0x3, aClass199_3.anIntArray513[local4] & 0x3FFF);
			if (local32) {
				@Pc(42) Class11_Sub8 local42 = new Class11_Sub8(aClass199_3.anIntArray512[local4]);
				local42.anInt864 = local2[1] - anInt4332;
				local42.anInt868 = local2[2] - anInt4339;
				aClass16_37.method190(local42);
			}
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!ja;III)I")
	private static int method3807(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class34 local3 = Static59.method892(arg1);
		if (local3 == null) {
			return 0;
		}
		@Pc(10) int local10 = local3.anInt686;
		if (local10 >= 0 && arg0.method2244(local10).aBoolean256) {
			local10 = -1;
		}
		@Pc(67) int local67;
		@Pc(26) int local26;
		@Pc(32) int local32;
		@Pc(54) int local54;
		if (local3.anInt689 >= 0) {
			local26 = local3.anInt689;
			local32 = (local26 & 0x7F) + arg3;
			if (local32 < 0) {
				local32 = 0;
			} else if (local32 > 127) {
				local32 = 127;
			}
			local54 = (local26 + arg2 & 0xFC00) + (local26 & 0x380) + local32;
			local67 = Static315.anIntArray506[Static8.method81(Static73.method1123(local54)) & 0xFFFF] | 0xFF000000;
		} else if (local10 >= 0) {
			local67 = Static315.anIntArray506[Static8.method81(Static73.method1123(arg0.method2244(local10).aShort63)) & 0xFFFF] | 0xFF000000;
		} else if (local3.anInt684 == -1) {
			local67 = 0;
		} else {
			local26 = local3.anInt684;
			local32 = (local26 & 0x7F) + arg3;
			if (local32 < 0) {
				local32 = 0;
			} else if (local32 > 127) {
				local32 = 127;
			}
			local54 = (local26 + arg2 & 0xFC00) + (local26 & 0x380) + local32;
			local67 = Static315.anIntArray506[Static8.method81(Static73.method1123(local54)) & 0xFFFF] | 0xFF000000;
		}
		return local67;
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "()V")
	private static void method3808() {
		@Pc(4) int local4;
		@Pc(15) int local15;
		@Pc(48) int local48;
		for (@Pc(1) int local1 = 0; local1 < anInt4331; local1++) {
			for (local4 = 0; local4 < anInt4338; local4++) {
				local15 = aShortArray79[local1 + local4 * anInt4331] & 0xFFFF;
				if (local15 != 0) {
					@Pc(35) int local35;
					if (local15 == 65535) {
						@Pc(31) Class11_Sub7 local31 = (Class11_Sub7) aClass58_25.method1009((long) (local1 << 16 | local4));
						if (local31 != null) {
							for (local35 = 0; local35 < local31.aShortArray35.length; local35++) {
								@Pc(45) Class84 local45 = Static108.method1650(local31.aShortArray35[local35] & 0xFFFF);
								local48 = local45.anInt2002;
								if (local45.anIntArray142 != null) {
									local45 = local45.method1635();
									if (local45 != null) {
										local48 = local45.anInt2002;
									}
								}
								if (local48 != -1) {
									@Pc(68) Class11_Sub8 local68 = new Class11_Sub8(local48);
									local68.anInt864 = local1;
									local68.anInt868 = local4;
									aClass16_37.method190(local68);
								}
							}
						}
					} else {
						@Pc(91) Class84 local91 = Static108.method1650(local15 - 1);
						local35 = local91.anInt2002;
						if (local91.anIntArray142 != null) {
							local91 = local91.method1635();
							if (local91 != null) {
								local35 = local91.anInt2002;
							}
						}
						if (local35 != -1) {
							@Pc(114) Class11_Sub8 local114 = new Class11_Sub8(local35);
							local114.anInt864 = local1;
							local114.anInt868 = local4;
							aClass16_37.method190(local114);
						}
					}
				}
			}
		}
		for (local4 = 0; local4 < 3; local4++) {
			for (local15 = 0; local15 < aClass210ArrayArrayArray2[0].length; local15++) {
				for (@Pc(140) int local140 = 0; local140 < aClass210ArrayArrayArray2[0][0].length; local140++) {
					@Pc(149) Class210 local149 = aClass210ArrayArrayArray2[local4][local15][local140];
					if (local149 != null) {
						for (@Pc(156) Class10_Sub5 local156 = (Class10_Sub5) local149.method5608(); local156 != null; local156 = (Class10_Sub5) local149.method5615()) {
							if (local156.aShortArray89 != null) {
								for (local48 = 0; local48 < local156.aShortArray89.length; local48++) {
									@Pc(172) Class84 local172 = Static108.method1650(local156.aShortArray89[local48] & 0xFFFF);
									@Pc(175) int local175 = local172.anInt2002;
									if (local172.anIntArray142 != null) {
										local172 = local172.method1635();
										if (local172 != null) {
											local175 = local172.anInt2002;
										}
									}
									if (local175 != -1) {
										@Pc(195) Class11_Sub8 local195 = new Class11_Sub8(local175);
										local195.anInt864 = (local15 + (anInt4332 >> 6)) * 64 + local156.aByte56 - anInt4332;
										local195.anInt868 = (local140 + (anInt4339 >> 6)) * 64 + local156.aByte54 - anInt4339;
										aClass16_37.method190(local195);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V")
	public static void method3809(@OriginalArg(0) int arg0) {
		aClass11_Sub4_Sub7_2 = (Class11_Sub4_Sub7) aClass58_24.method1009((long) arg0);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!uo;)Lclient!aq;")
	public static Class16 method3810(@OriginalArg(0) Class129 arg0) {
		@Pc(3) int local3 = anInt4341 - anInt4335;
		@Pc(7) int local7 = anInt4330 - anInt4337;
		@Pc(15) int local15 = (anInt4334 - anInt4336 << 16) / local3;
		@Pc(23) int local23 = (anInt4333 - anInt4340 << 16) / local7;
		return method3819(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!uo;II)V")
	public static void method3811(@OriginalArg(0) Class129 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class11_Sub25 local9 = new Class11_Sub25(aClass144_65.method3888("area", aClass11_Sub4_Sub7_2.aString20));
		@Pc(13) int local13 = local9.method5185();
		@Pc(16) int[] local16 = new int[local13];
		for (@Pc(18) int local18 = 0; local18 < local13; local18++) {
			local16[local18] = local9.method5185();
		}
		@Pc(33) int local33 = local9.method5185();
		@Pc(36) int[] local36 = new int[local33];
		for (@Pc(38) int local38 = 0; local38 < local33; local38++) {
			local36[local38] = local9.method5185();
		}
		while (true) {
			@Pc(58) int local58;
			@Pc(64) int local64;
			@Pc(67) int local67;
			@Pc(76) int local76;
			@Pc(148) int local148;
			while (local9.anInt6076 < local9.aByteArray93.length) {
				@Pc(62) int local62;
				@Pc(84) int local84;
				if (local9.method5185() == 0) {
					local58 = local9.method5185();
					local62 = local9.method5185();
					for (local64 = 0; local64 < 64; local64++) {
						for (local67 = 0; local67 < 64; local67++) {
							local76 = local58 * 64 + local64 - anInt4332;
							local84 = local62 * 64 + local67 - anInt4339;
							method3803(arg0, local9, local58, local62, local76, local84, local16, local36);
						}
					}
				} else {
					local58 = local9.method5185();
					local62 = local9.method5185();
					local64 = local9.method5185();
					local67 = local9.method5185();
					for (local76 = 0; local76 < 8; local76++) {
						for (local84 = 0; local84 < 8; local84++) {
							@Pc(136) int local136 = local58 * 64 + local64 * 8 + local76 - anInt4332;
							local148 = local62 * 64 + local67 * 8 + local84 - anInt4339;
							method3803(arg0, local9, local58, local62, local136, local148, local16, local36);
						}
					}
				}
			}
			aByteArray72 = new byte[anInt4331 * anInt4338];
			aShortArray80 = new short[anInt4331 * anInt4338];
			for (local58 = 0; local58 < 3; local58++) {
				@Pc(191) byte[] local191 = new byte[anInt4331 * anInt4338];
				for (local64 = 0; local64 < aClass210ArrayArrayArray2[local58].length; local64++) {
					for (local67 = 0; local67 < aClass210ArrayArrayArray2[local58][0].length; local67++) {
						@Pc(205) Class210 local205 = aClass210ArrayArrayArray2[local58][local64][local67];
						if (local205 != null) {
							for (@Pc(212) Class10_Sub5 local212 = (Class10_Sub5) local205.method5608(); local212 != null; local212 = (Class10_Sub5) local205.method5615()) {
								local191[local64 * 64 + local212.aByte56 + (local67 * 64 + local212.aByte54) * anInt4331] = (byte) local212.anInt4707;
							}
						}
					}
				}
				method3814(local191, aByteArray72, aShortArray80, arg1, arg2);
				for (local67 = 0; local67 < aClass210ArrayArrayArray2[local58].length; local67++) {
					for (local76 = 0; local76 < aClass210ArrayArrayArray2[local58][0].length; local76++) {
						@Pc(276) Class210 local276 = aClass210ArrayArrayArray2[local58][local67][local76];
						if (local276 != null) {
							for (@Pc(283) Class10_Sub5 local283 = (Class10_Sub5) local276.method5608(); local283 != null; local283 = (Class10_Sub5) local276.method5615()) {
								local148 = local67 * 64 + local283.aByte56 + (local76 * 64 + local283.aByte54) * anInt4331;
								local283.anInt4707 = (aByteArray72[local148] & 0xFF) << 16 | aShortArray80[local148] & 0xFFFF;
								if (local283.anInt4707 != 0) {
									local283.anInt4707 |= 0xFF000000;
								}
							}
						}
					}
				}
			}
			method3814(aByteArray76, aByteArray72, aShortArray80, arg1, arg2);
			aByteArray76 = null;
			method3808();
			return;
		}
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(II)Lclient!gi;")
	public static Class11_Sub4_Sub7 method3813(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(4) Class11_Sub4_Sub7 local4 = (Class11_Sub4_Sub7) aClass58_24.method1008(); local4 != null; local4 = (Class11_Sub4_Sub7) aClass58_24.method1004()) {
			if (local4.aBoolean121 && local4.method1586(arg0, arg1)) {
				return local4;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "([B[B[SII)V")
	private static void method3814(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int[] local2 = new int[anInt4338];
		@Pc(5) int[] local5 = new int[anInt4338];
		@Pc(8) int[] local8 = new int[anInt4338];
		@Pc(11) int[] local11 = new int[anInt4338];
		@Pc(14) int[] local14 = new int[anInt4338];
		for (@Pc(16) int local16 = -5; local16 < anInt4331; local16++) {
			@Pc(21) int local21 = local16 + 5;
			@Pc(25) int local25 = local16 - 5;
			@Pc(41) int local41;
			for (@Pc(27) int local27 = 0; local27 < anInt4338; local27++) {
				@Pc(49) Class167 local49;
				@Pc(85) int local85;
				if (local21 < anInt4331) {
					local41 = arg0[local21 + local27 * anInt4331] & 0xFF;
					if (local41 > 0) {
						local49 = Static8.method76(local41 - 1);
						local2[local27] += local49.anInt5186;
						local5[local27] += local49.anInt5187;
						local8[local27] += local49.anInt5190;
						local11[local27] += local49.anInt5194;
						local85 = local14[local27]++;
					}
				}
				if (local25 >= 0) {
					local41 = arg0[local25 + local27 * anInt4331] & 0xFF;
					if (local41 > 0) {
						local49 = Static8.method76(local41 - 1);
						local2[local27] -= local49.anInt5186;
						local5[local27] -= local49.anInt5187;
						local8[local27] -= local49.anInt5190;
						local11[local27] -= local49.anInt5194;
						local85 = local14[local27]--;
					}
				}
			}
			if (local16 >= 0) {
				local41 = 0;
				@Pc(157) int local157 = 0;
				@Pc(159) int local159 = 0;
				@Pc(161) int local161 = 0;
				@Pc(163) int local163 = 0;
				for (@Pc(165) int local165 = -5; local165 < anInt4338; local165++) {
					@Pc(170) int local170 = local165 + 5;
					if (local170 < anInt4338) {
						local41 += local2[local170];
						local157 += local5[local170];
						local159 += local8[local170];
						local161 += local11[local170];
						local163 += local14[local170];
					}
					@Pc(207) int local207 = local165 - 5;
					if (local207 >= 0) {
						local41 -= local2[local207];
						local157 -= local5[local207];
						local159 -= local8[local207];
						local161 -= local11[local207];
						local163 -= local14[local207];
					}
					if (local165 >= 0 && local163 > 0) {
						@Pc(259) int local259;
						if ((arg0[local16 + local165 * anInt4331] & 0xFF) == 0) {
							local259 = local16 + local165 * anInt4331;
							arg1[local259] = 0;
							arg2[local259] = 0;
						} else {
							local259 = local161 == 0 ? 0 : Static352.method5664(local157 / local163, local41 * 256 / local161, local159 / local163);
							@Pc(292) int local292 = (local259 & 0x7F) + arg4;
							if (local292 < 0) {
								local292 = 0;
							} else if (local292 > 127) {
								local292 = 127;
							}
							@Pc(314) int local314 = (local259 + arg3 & 0xFC00) + (local259 & 0x380) + local292;
							@Pc(320) int local320 = local16 + local165 * anInt4331;
							@Pc(331) int local331 = Static315.anIntArray506[Static8.method81(Static159.method2560(local314)) & 0xFFFF];
							arg1[local320] = (byte) (local331 >> 16 & 0xFF);
							arg2[local320] = (short) (local331 & 0xFFFF);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!uo;IIII)V")
	private static void method3815(@OriginalArg(0) Class129 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = anInt4341 - anInt4335;
		@Pc(7) int local7 = anInt4330 - anInt4337;
		if (anInt4341 < anInt4331) {
			local3++;
		}
		if (anInt4330 < anInt4338) {
			local7++;
		}
		@Pc(28) int local28;
		@Pc(40) int local40;
		@Pc(44) int local44;
		@Pc(50) int local50;
		@Pc(57) int local57;
		@Pc(70) int local70;
		@Pc(80) int local80;
		@Pc(84) int local84;
		@Pc(93) int local93;
		@Pc(172) int local172;
		@Pc(174) int local174;
		@Pc(176) int local176;
		@Pc(178) int local178;
		for (@Pc(17) int local17 = 0; local17 < local3; local17++) {
			local28 = (arg1 * local17 >> 16) + anInt4336;
			local40 = (arg1 * (local17 + 1) >> 16) + anInt4336;
			local44 = local40 - local28;
			if (local44 > 0) {
				local50 = anInt4335 + local17;
				if (local50 >= 0 && local50 < anInt4331) {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt4333 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt4333 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (local84 > 0) {
							local93 = local57 + anInt4337;
							local172 = local50 + local93 * anInt4331;
							local174 = 0;
							local176 = 0;
							local178 = 0;
							if (local93 >= 0 && local93 < anInt4338) {
								local174 = (aByteArray72[local172] & 0xFF) << 16 | aShortArray80[local172] & 0xFFFF;
								if (local174 != 0) {
									local174 |= 0xFF000000;
								}
								local176 = aByteArray74[local172] & 0xFF;
								local178 = aShortArray79[local172] & 0xFFFF;
							}
							if (local174 == 0 && local176 == 0 && local178 == 0) {
								if (aClass11_Sub4_Sub7_2.anInt1922 != -1) {
									local174 = aClass11_Sub4_Sub7_2.anInt1922 | 0xFF000000;
								} else if ((local17 + anInt4335 & 0x4) == (local57 + anInt4330 & 0x4)) {
									local174 = anIntArray335[Static71.anInt1348 + 1];
								} else {
									local174 = -11840664;
								}
								if (local174 == 0) {
									local174 = -16777216;
								}
								arg0.method4945(local28, local70, local44, local84, local174, 0);
							} else if (local178 <= 0) {
								method3825(arg0, local28, local70, local44, local84, local174, local176, aByteArray73[local172], null, null, true);
							} else if (local178 == 65535) {
								@Pc(280) Class11_Sub7 local280 = (Class11_Sub7) aClass58_25.method1009((long) (local50 << 16 | local93));
								if (local280 != null) {
									method3825(arg0, local28, local70, local44, local84, local174, local176, aByteArray73[local172], local280.aShortArray35, local280.aByteArray18, true);
								}
							} else {
								aShortArray78[0] = (short) (local178 - 1);
								aByteArray71[0] = aByteArray75[local172];
								method3825(arg0, local28, local70, local44, local84, local174, local176, aByteArray73[local172], aShortArray78, aByteArray71, true);
							}
						}
					}
				} else {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt4333 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt4333 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (aClass11_Sub4_Sub7_2.anInt1922 != -1) {
							local93 = aClass11_Sub4_Sub7_2.anInt1922 | 0xFF000000;
						} else if ((local17 + anInt4335 & 0x4) == (local57 + anInt4330 & 0x4)) {
							local93 = anIntArray335[Static71.anInt1348 + 1];
						} else {
							local93 = -11840664;
						}
						if (local93 == 0) {
							local93 = -16777216;
						}
						arg0.method4945(local28, local70, local44, local84, local93, 0);
					}
				}
			}
		}
		for (local28 = -16; local28 < local3 + 16; local28++) {
			local40 = (arg1 * local28 >> 16) + anInt4336;
			local44 = (arg1 * (local28 + 1) >> 16) + anInt4336;
			local50 = local44 - local40;
			if (local50 > 0) {
				local57 = local28 + anInt4335;
				if (local57 >= 0 && local57 < anInt4331) {
					for (local70 = -16; local70 < local7 + 16; local70++) {
						local80 = anInt4333 - (arg2 * (local70 + 1) >> 16);
						local84 = anInt4333 - (arg2 * local70 >> 16);
						local93 = local84 - local80;
						if (local93 > 0) {
							local172 = local70 + anInt4337;
							if (local172 >= 0 && local172 < anInt4338) {
								local174 = aShortArray79[local57 + local172 * anInt4331] & 0xFFFF;
								if (local174 <= 0) {
									method3823(arg0, local40, local80, local50, local93, null, null);
								} else if (local174 == 65535) {
									@Pc(457) Class11_Sub7 local457 = (Class11_Sub7) aClass58_25.method1009((long) (local57 << 16 | local172));
									if (local457 != null) {
										method3823(arg0, local40, local80, local50, local93, local457.aShortArray35, local457.aByteArray18);
									}
								} else {
									aShortArray78[0] = (short) (local174 - 1);
									aByteArray71[0] = aByteArray75[local57 + local172 * anInt4331];
									method3823(arg0, local40, local80, local50, local93, aShortArray78, aByteArray71);
								}
							}
						}
					}
				}
			}
		}
		local40 = anInt4335 >> 6;
		local44 = anInt4337 >> 6;
		if (local40 < 0) {
			local40 = 0;
		}
		if (local44 < 0) {
			local44 = 0;
		}
		local50 = anInt4341 >> 6;
		local57 = anInt4330 >> 6;
		if (local50 >= aClass210ArrayArrayArray2[0].length) {
			local50 = aClass210ArrayArrayArray2[0].length - 1;
		}
		if (local57 >= aClass210ArrayArrayArray2[0][0].length) {
			local57 = aClass210ArrayArrayArray2[0][0].length - 1;
		}
		for (local70 = 0; local70 < 3; local70++) {
			@Pc(639) int local639;
			@Pc(651) int local651;
			@Pc(663) int local663;
			@Pc(673) int local673;
			@Pc(629) int local629;
			for (local80 = local40; local80 <= local50; local80++) {
				for (local84 = local44; local84 <= local57; local84++) {
					@Pc(587) Class210 local587 = aClass210ArrayArrayArray2[local70][local80][local84];
					if (local587 != null) {
						local172 = (local80 + (anInt4332 >> 6)) * 64;
						local174 = (local84 + (anInt4339 >> 6)) * 64;
						for (@Pc(610) Class10_Sub5 local610 = (Class10_Sub5) local587.method5608(); local610 != null; local610 = (Class10_Sub5) local587.method5615()) {
							local178 = local172 + local610.aByte56 - anInt4332 - anInt4335;
							local629 = local174 + local610.aByte54 - anInt4339 - anInt4337;
							local639 = (arg1 * local178 >> 16) + anInt4336;
							local651 = (arg1 * (local178 + 1) >> 16) + anInt4336;
							local663 = anInt4333 - (arg2 * (local629 + 1) >> 16);
							local673 = anInt4333 - (arg2 * local629 >> 16);
							method3825(arg0, local639, local663, local651 - local639, local673 - local663, local610.anInt4707, local610.aByte55 & 0xFF, local610.aByte53, local610.aShortArray89, local610.aByteArray81, false);
						}
					}
				}
			}
			for (local84 = local40; local84 <= local50; local84++) {
				for (local93 = local44; local93 <= local57; local93++) {
					@Pc(725) Class210 local725 = aClass210ArrayArrayArray2[local70][local84][local93];
					if (local725 != null) {
						local174 = (local84 + (anInt4332 >> 6)) * 64;
						local176 = (local93 + (anInt4339 >> 6)) * 64;
						for (@Pc(748) Class10_Sub5 local748 = (Class10_Sub5) local725.method5608(); local748 != null; local748 = (Class10_Sub5) local725.method5615()) {
							local629 = local174 + local748.aByte56 - anInt4332 - anInt4335;
							local639 = local176 + local748.aByte54 - anInt4339 - anInt4337;
							local651 = (arg1 * local629 >> 16) + anInt4336;
							local663 = (arg1 * (local629 + 1) >> 16) + anInt4336;
							local673 = anInt4333 - (arg2 * (local639 + 1) >> 16);
							@Pc(811) int local811 = anInt4333 - (arg2 * local639 >> 16);
							method3823(arg0, local651, local673, local663 - local651, local811 - local673, local748.aShortArray89, local748.aByteArray81);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!uo;Lclient!co;IIII)V")
	private static void method3816(@OriginalArg(0) Class129 arg0, @OriginalArg(1) Class11_Sub8 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		arg1.anInt861 = anInt4336 + (arg2 * (arg1.anInt864 - anInt4335) >> 16);
		arg1.anInt862 = anInt4333 - (arg3 * (arg1.anInt868 - anInt4337) >> 16);
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(I)Lclient!gi;")
	public static Class11_Sub4_Sub7 method3817(@OriginalArg(0) int arg0) {
		return (Class11_Sub4_Sub7) aClass58_24.method1009((long) arg0);
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(Lclient!uo;)V")
	public static void method3818(@OriginalArg(0) Class129 arg0) {
		@Pc(3) int local3 = anInt4341 - anInt4335;
		@Pc(7) int local7 = anInt4330 - anInt4337;
		@Pc(15) int local15 = (anInt4334 - anInt4336 << 16) / local3;
		@Pc(23) int local23 = (anInt4333 - anInt4340 << 16) / local7;
		method3815(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(Lclient!uo;IIII)Lclient!aq;")
	private static Class16 method3819(@OriginalArg(0) Class129 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(4) Class11_Sub8 local4 = (Class11_Sub8) aClass16_37.method193(); local4 != null; local4 = (Class11_Sub8) aClass16_37.method188()) {
			method3816(arg0, local4, arg1, arg2);
		}
		return aClass16_37;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!nq;)V")
	public static void method3820(@OriginalArg(0) Class144 arg0) {
		aClass144_65 = arg0;
		aClass58_24.method1011();
		@Pc(9) int local9 = aClass144_65.method3902("details");
		@Pc(14) int[] local14 = aClass144_65.method3901(local9);
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(25) Class11_Sub4_Sub7 local25 = Static80.method4779(local9, aClass144_65, local14[local16]);
			aClass58_24.method1006((long) local25.anInt1916, local25);
		}
		Static171.method2792(false);
	}

	@OriginalMember(owner = "client!rj", name = "d", descriptor = "()V")
	public static void method3821() {
		aByteArray76 = new byte[anInt4331 * anInt4338];
		aByteArray74 = new byte[anInt4331 * anInt4338];
		aByteArray73 = new byte[anInt4331 * anInt4338];
		aShortArray79 = new short[anInt4331 * anInt4338];
		aByteArray75 = new byte[anInt4331 * anInt4338];
		aClass58_25 = new Class58(1024);
		aClass210ArrayArrayArray2 = new Class210[3][anInt4331 >> 6][anInt4338 >> 6];
		anIntArray335 = new int[Static275.anInt5524 + 1];
	}

	@OriginalMember(owner = "client!rj", name = "e", descriptor = "()V")
	public static void method3822() {
		aByteArray76 = null;
		aByteArray72 = null;
		aShortArray80 = null;
		aByteArray74 = null;
		aByteArray73 = null;
		aShortArray79 = null;
		aByteArray75 = null;
		aClass58_25 = null;
		aClass210ArrayArrayArray2 = null;
		anIntArray335 = null;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!uo;IIII[S[B)V")
	private static void method3823(@OriginalArg(0) Class129 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		if (arg5 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < arg5.length; local4++) {
			@Pc(13) Class84 local13 = Static108.method1650(arg5[local4] & 0xFFFF);
			@Pc(16) int local16 = local13.anInt1987;
			if (local16 != -1) {
				@Pc(23) Class121 local23 = Static36.method533(local16);
				@Pc(47) Class97 local47 = local23.method2817(arg0, local13.aBoolean124 ? arg6[local4] >> 6 & 0x3 : 0, local13.aBoolean133 ? local13.aBoolean128 : false);
				if (local47 != null) {
					@Pc(56) int local56 = arg3 * local47.method5542() >> 2;
					@Pc(63) int local63 = arg4 * local47.method5557() >> 2;
					if (local23.aBoolean218) {
						@Pc(69) int local69 = local13.anInt1988;
						@Pc(72) int local72 = local13.anInt2035;
						if ((arg6[local4] >> 6 & 0x1) == 1) {
							@Pc(83) int local83 = local69;
							local69 = local72;
							local72 = local83;
						}
						local56 = local69 * arg3;
						local63 = local72 * arg4;
					}
					if (local56 != 0 && local63 != 0) {
						if (local23.anInt3434 == 0) {
							local47.method5548(arg1, arg2 + arg4 - local63, local56, local63);
						} else {
							local47.method5550(arg1, arg2 + arg4 - local63, local56, local63, 1, local23.anInt3434 | 0xFF000000, 1);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!ja;II)V")
	public static void method3824(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static275.anInt5524; local1++) {
			anIntArray335[local1 + 1] = method3807(arg0, local1, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!uo;IIIIIII[S[BZ)V")
	private static void method3825(@OriginalArg(0) Class129 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) byte[] arg9, @OriginalArg(10) boolean arg10) {
		@Pc(20) int local20;
		@Pc(32) int local32;
		if (arg10 || arg5 != 0 || arg6 > 0) {
			if (arg6 == 0) {
				arg0.method4945(arg1, arg2, arg3, arg4, arg5, 0);
			} else {
				local20 = arg7 & 0x3F;
				if (local20 == 0 || arg3 <= 1 || arg4 <= 1) {
					local32 = anIntArray335[arg6];
					if (arg10 || local32 != 0) {
						arg0.method4945(arg1, arg2, arg3, arg4, local32, 0);
					}
				} else {
					local32 = arg10 ? 0 : 1;
					Static356.method5719(aByteArrayArrayArray7, arg3, arg7 >> 6 & 0x3, arg5, arg2, anIntArray335[arg6], arg1, arg0, local32, arg4, local20, anInt4329);
				}
			}
		}
		if (arg8 == null) {
			return;
		}
		if (arg3 == 1) {
			local20 = arg1;
		} else {
			local20 = arg1 + arg3 - 1;
		}
		if (arg4 == 1) {
			local32 = arg2;
		} else {
			local32 = arg2 + arg4 - 1;
		}
		for (@Pc(100) int local100 = 0; local100 < arg8.length; local100++) {
			@Pc(107) int local107 = arg9[local100] & 0x3F;
			if (local107 == 0 || local107 == 2 || local107 == 3 || local107 == 9) {
				@Pc(126) Class84 local126 = Static108.method1650(arg8[local100] & 0xFFFF);
				if (local126.anInt1987 == -1) {
					@Pc(132) int local132 = -3355444;
					if (local126.anInt2016 == 1) {
						local132 = -3407872;
					}
					@Pc(146) int local146 = arg9[local100] >> 6 & 0x3;
					if (local107 == 0) {
						if (local146 == 0) {
							arg0.method4947(arg1, arg2, arg4, local132, 0);
						} else if (local146 == 1) {
							arg0.method4990(arg1, arg2, arg3, local132, 0);
						} else if (local146 == 2) {
							arg0.method4947(local20, arg2, arg4, local132, 0);
						} else {
							arg0.method4990(arg1, local32, arg3, local132, 0);
						}
					} else if (local107 == 2) {
						if (local146 == 0) {
							arg0.method4947(arg1, arg2, arg4, -1, 0);
							arg0.method4990(arg1, arg2, arg3, local132, 0);
						} else if (local146 == 1) {
							arg0.method4947(local20, arg2, arg4, -1, 0);
							arg0.method4990(arg1, arg2, arg3, local132, 0);
						} else if (local146 == 2) {
							arg0.method4947(local20, arg2, arg4, -1, 0);
							arg0.method4990(arg1, local32, arg3, local132, 0);
						} else {
							arg0.method4947(arg1, arg2, arg4, -1, 0);
							arg0.method4990(arg1, local32, arg3, local132, 0);
						}
					} else if (local107 == 3) {
						if (local146 == 0) {
							arg0.method4990(arg1, arg2, 1, local132, 0);
						} else if (local146 == 1) {
							arg0.method4990(local20, arg2, 1, local132, 0);
						} else if (local146 == 2) {
							arg0.method4990(local20, local32, 1, local132, 0);
						} else {
							arg0.method4990(arg1, local32, 1, local132, 0);
						}
					} else if (local107 == 9) {
						@Pc(312) int local312;
						if (local146 == 0 || local146 == 2) {
							for (local312 = 0; local312 < arg4; local312++) {
								arg0.method4990(arg1 + local312, local32 - local312, 1, local132, 0);
							}
						} else {
							for (local312 = 0; local312 < arg4; local312++) {
								arg0.method4990(arg1 + local312, arg2 + local312, 1, local132, 0);
							}
						}
					}
				}
			}
		}
	}
}
