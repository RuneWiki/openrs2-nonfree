import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "Lclient!ek;")
	public static Class42 aClass42_38;

	@OriginalMember(owner = "client!rn", name = "d", descriptor = "I")
	public static int anInt3118;

	@OriginalMember(owner = "client!rn", name = "e", descriptor = "I")
	public static int anInt3119;

	@OriginalMember(owner = "client!rn", name = "f", descriptor = "F")
	public static float aFloat31;

	@OriginalMember(owner = "client!rn", name = "h", descriptor = "I")
	public static int anInt3121;

	@OriginalMember(owner = "client!rn", name = "j", descriptor = "I")
	public static int anInt3122;

	@OriginalMember(owner = "client!rn", name = "k", descriptor = "Lclient!ga;")
	public static Class57 aClass57_3;

	@OriginalMember(owner = "client!rn", name = "l", descriptor = "F")
	public static float aFloat32;

	@OriginalMember(owner = "client!rn", name = "m", descriptor = "Lclient!pg;")
	public static Class2_Sub8_Sub16 aClass2_Sub8_Sub16_3;

	@OriginalMember(owner = "client!rn", name = "n", descriptor = "I")
	public static int anInt3123;

	@OriginalMember(owner = "client!rn", name = "o", descriptor = "I")
	public static int anInt3124;

	@OriginalMember(owner = "client!rn", name = "p", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!rn", name = "q", descriptor = "[I")
	public static int[] anIntArray314;

	@OriginalMember(owner = "client!rn", name = "r", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!rn", name = "s", descriptor = "I")
	public static int anInt3125;

	@OriginalMember(owner = "client!rn", name = "t", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!rn", name = "u", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!rn", name = "v", descriptor = "I")
	public static int anInt3126;

	@OriginalMember(owner = "client!rn", name = "w", descriptor = "I")
	public static int anInt3127;

	@OriginalMember(owner = "client!rn", name = "x", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!rn", name = "y", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray17;

	@OriginalMember(owner = "client!rn", name = "z", descriptor = "I")
	public static int anInt3128;

	@OriginalMember(owner = "client!rn", name = "A", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!rn", name = "B", descriptor = "I")
	public static int anInt3129;

	@OriginalMember(owner = "client!rn", name = "D", descriptor = "I")
	public static int anInt3130;

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "Lclient!l;")
	private static Class101 aClass101_10 = new Class101(16);

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "I")
	public static int anInt3117 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!rn", name = "g", descriptor = "I")
	public static int anInt3120 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!rn", name = "i", descriptor = "Lclient!ea;")
	public static Class37 aClass37_10 = new Class37();

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lclient!oe;)V")
	public static void method2522(@OriginalArg(0) Class2_Sub16 arg0) {
		label83: while (true) {
			if (arg0.anInt2789 < arg0.aByteArray17.length) {
				@Pc(7) boolean local7 = false;
				@Pc(9) int local9 = 0;
				@Pc(11) int local11 = 0;
				if (arg0.method2146() == 1) {
					local7 = true;
					local9 = arg0.method2146();
					local11 = arg0.method2146();
				}
				@Pc(30) int local30 = arg0.method2146();
				@Pc(34) int local34 = arg0.method2146();
				@Pc(40) int local40 = local30 * 64 - anInt3122;
				@Pc(50) int local50 = anInt3119 + anInt3118 - local34 * 64 - 1;
				@Pc(113) byte local113;
				@Pc(68) int local68;
				if (local40 >= 0 && local50 - 63 >= 0 && local40 + 63 < anInt3121 && local50 < anInt3119) {
					local68 = local40 >> 6;
					@Pc(72) int local72 = local50 >> 6;
					@Pc(74) int local74 = 0;
					while (true) {
						if (local74 >= 64) {
							continue label83;
						}
						for (@Pc(79) int local79 = 0; local79 < 64; local79++) {
							if (!local7 || local74 >= local9 * 8 && local74 < local9 * 8 + 8 && local79 >= local11 * 8 && local79 < local11 * 8 + 8) {
								local113 = arg0.method2170();
								if (local113 != 0) {
									if (aByteArrayArrayArray17[local68][local72] == null) {
										aByteArrayArrayArray17[local68][local72] = new byte[4096];
									}
									aByteArrayArrayArray17[local68][local72][(63 - local79 << 6) + local74] = local113;
									@Pc(146) byte local146 = arg0.method2170();
									if (aByteArrayArrayArray13[local68][local72] == null) {
										aByteArrayArrayArray13[local68][local72] = new byte[4096];
									}
									aByteArrayArrayArray13[local68][local72][(63 - local79 << 6) + local74] = local146;
								}
							}
						}
						local74++;
					}
				}
				local68 = 0;
				while (true) {
					if (local68 >= (local7 ? 64 : 4096)) {
						continue label83;
					}
					local113 = arg0.method2170();
					if (local113 != 0) {
						arg0.anInt2789++;
					}
					local68++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "()V")
	public static void method2523() {
		@Pc(3) int local3 = anInt3128 - anInt3129;
		@Pc(7) int local7 = anInt3125 - anInt3127;
		@Pc(15) int local15 = (anInt3130 - anInt3124 << 16) / local3;
		@Pc(23) int local23 = (anInt3123 - anInt3126 << 16) / local7;
		method2536(local15, local23);
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lclient!ek;)V")
	public static void method2524(@OriginalArg(0) Class42 arg0) {
		aClass42_38 = arg0;
		aClass101_10.method2869();
		@Pc(9) int local9 = aClass42_38.method1254("details");
		@Pc(14) int[] local14 = aClass42_38.method1265(local9);
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			aClass101_10.method2860(Static22.method442(new Class2_Sub16(aClass42_38.method1256(local9, local14[local16])), local14[local16]), (long) local14[local16]);
		}
	}

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "(Lclient!oe;)V")
	public static void method2525(@OriginalArg(0) Class2_Sub16 arg0) {
		label83: while (true) {
			if (arg0.anInt2789 < arg0.aByteArray17.length) {
				@Pc(7) boolean local7 = false;
				@Pc(9) int local9 = 0;
				@Pc(11) int local11 = 0;
				if (arg0.method2146() == 1) {
					local7 = true;
					local9 = arg0.method2146();
					local11 = arg0.method2146();
				}
				@Pc(30) int local30 = arg0.method2146();
				@Pc(34) int local34 = arg0.method2146();
				@Pc(40) int local40 = local30 * 64 - anInt3122;
				@Pc(50) int local50 = anInt3119 + anInt3118 - local34 * 64 - 1;
				@Pc(113) byte local113;
				@Pc(68) int local68;
				if (local40 >= 0 && local50 - 63 >= 0 && local40 + 63 < anInt3121 && local50 < anInt3119) {
					local68 = local40 >> 6;
					@Pc(72) int local72 = local50 >> 6;
					@Pc(74) int local74 = 0;
					while (true) {
						if (local74 >= 64) {
							continue label83;
						}
						for (@Pc(79) int local79 = 0; local79 < 64; local79++) {
							if (!local7 || local74 >= local9 * 8 && local74 < local9 * 8 + 8 && local79 >= local11 * 8 && local79 < local11 * 8 + 8) {
								local113 = arg0.method2170();
								if (local113 != 0) {
									if (aByteArrayArrayArray14[local68][local72] == null) {
										aByteArrayArrayArray14[local68][local72] = new byte[4096];
									}
									aByteArrayArrayArray14[local68][local72][(63 - local79 << 6) + local74] = local113;
									@Pc(146) byte local146 = arg0.method2170();
									if (aByteArrayArrayArray15[local68][local72] == null) {
										aByteArrayArrayArray15[local68][local72] = new byte[4096];
									}
									aByteArrayArrayArray15[local68][local72][(63 - local79 << 6) + local74] = local146;
								}
							}
						}
						local74++;
					}
				}
				local68 = 0;
				while (true) {
					if (local68 >= (local7 ? 64 : 4096)) {
						continue label83;
					}
					local113 = arg0.method2170();
					if (local113 != 0) {
						arg0.anInt2789++;
					}
					local68++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lclient!oe;Z)V")
	public static void method2526(@OriginalArg(0) Class2_Sub16 arg0, @OriginalArg(1) boolean arg1) {
		label125: while (true) {
			if (arg0.anInt2789 < arg0.aByteArray17.length) {
				@Pc(7) boolean local7 = false;
				@Pc(9) int local9 = 0;
				@Pc(11) int local11 = 0;
				if (arg0.method2146() == 1) {
					local7 = true;
					local9 = arg0.method2146();
					local11 = arg0.method2146();
				}
				@Pc(30) int local30 = arg0.method2146();
				@Pc(34) int local34 = arg0.method2146();
				@Pc(40) int local40 = local30 * 64 - anInt3122;
				@Pc(50) int local50 = anInt3119 + anInt3118 - local34 * 64 - 1;
				@Pc(68) int local68;
				@Pc(72) int local72;
				if (local40 >= 0 && local50 - 63 >= 0 && local40 + 63 < anInt3121 && local50 < anInt3119) {
					local68 = local40 >> 6;
					local72 = local50 >> 6;
					@Pc(74) int local74 = 0;
					while (true) {
						if (local74 >= 64) {
							continue label125;
						}
						for (@Pc(79) int local79 = 0; local79 < 64; local79++) {
							if (!local7 || local74 >= local9 * 8 && local74 < local9 * 8 + 8 && local79 >= local11 * 8 && local79 < local11 * 8 + 8) {
								@Pc(113) int local113 = arg0.method2146();
								if (local113 != 0) {
									@Pc(125) int local125;
									if ((local113 & 0x1) == 1) {
										local125 = arg0.method2146();
										if (aByteArrayArrayArray16[local68][local72] == null) {
											aByteArrayArrayArray16[local68][local72] = new byte[4096];
										}
										aByteArrayArrayArray16[local68][local72][(63 - local79 << 6) + local74] = (byte) local125;
									}
									if ((local113 & 0x2) == 2) {
										local125 = arg0.method2166();
										if (anIntArrayArrayArray10[local68][local72] == null) {
											anIntArrayArrayArray10[local68][local72] = new int[4096];
										}
										anIntArrayArrayArray10[local68][local72][(63 - local79 << 6) + local74] = local125;
									}
									if ((local113 & 0x4) == 4) {
										local125 = arg0.method2130();
										@Pc(202) int local202 = arg0.method2146();
										local125--;
										@Pc(207) Class146 local207 = Static10.method158(local125);
										if (local207.anIntArray467 != null) {
											local207 = local207.method3815();
											if (local207 == null || local207.anInt4723 == -1) {
												continue;
											}
										}
										if ((!local207.aBoolean312 || arg1) && local207.anInt4723 != -1) {
											@Pc(236) Class2_Sub8_Sub21 local236 = new Class2_Sub8_Sub21();
											local236.anInt4970 = local207.anInt4723;
											local236.anInt4965 = local202;
											local236.anInt4967 = local68 * 64 + local74;
											local236.anInt4968 = local72 * 64 + 64 - local79;
											aClass37_10.method1144(local236);
										}
									}
								}
							}
						}
						local74++;
					}
				}
				local68 = 0;
				while (true) {
					if (local68 >= (local7 ? 64 : 4096)) {
						continue label125;
					}
					local72 = arg0.method2146();
					if (local72 != 0) {
						if ((local72 & 0x1) == 1) {
							arg0.anInt2789++;
						}
						if ((local72 & 0x2) == 2) {
							arg0.anInt2789 += 2;
						}
						if ((local72 & 0x4) == 4) {
							arg0.anInt2789 += 3;
						}
					}
					local68++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)V")
	public static void method2527(@OriginalArg(0) int arg0) {
		aClass2_Sub8_Sub16_3 = (Class2_Sub8_Sub16) aClass101_10.method2867((long) arg0);
	}

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "()Lclient!en;")
	public static Class44 method2528() {
		@Pc(3) int local3 = anInt3128 - anInt3129;
		@Pc(7) int local7 = anInt3125 - anInt3127;
		@Pc(15) int local15 = (anInt3130 - anInt3124 << 16) / local3;
		@Pc(23) int local23 = (anInt3123 - anInt3126 << 16) / local7;
		return method2533(local15, local23);
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(II)Lclient!ea;")
	public static Class37 method2529(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class37 local3 = new Class37();
		for (@Pc(8) Class2_Sub8_Sub16 local8 = (Class2_Sub8_Sub16) aClass101_10.method2868(); local8 != null; local8 = (Class2_Sub8_Sub16) aClass101_10.method2859()) {
			if (local8.aBoolean297 && local8.method3591(arg1, arg0)) {
				local3.method1144(local8);
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "(II)Lclient!pg;")
	public static Class2_Sub8_Sub16 method2530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(4) Class2_Sub8_Sub16 local4 = (Class2_Sub8_Sub16) aClass101_10.method2868(); local4 != null; local4 = (Class2_Sub8_Sub16) aClass101_10.method2859()) {
			if (local4.aBoolean297 && local4.method3591(arg1, arg0)) {
				return local4;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "(II)V")
	public static void method2531(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < Static247.anInt1735; local1++) {
			@Pc(8) Class127 local8 = Static7.method121(local1);
			if (local8 != null) {
				@Pc(14) int local14 = local8.anInt4280;
				if (local14 >= 0 && !Static1.anInterface3_1.method4141(local14)) {
					local14 = -1;
				}
				@Pc(64) int local64;
				@Pc(29) int local29;
				@Pc(35) int local35;
				@Pc(57) int local57;
				if (local8.anInt4275 >= 0) {
					local29 = local8.anInt4275;
					local35 = (local29 & 0x7F) + arg1;
					if (local35 < 0) {
						local35 = 0;
					} else if (local35 > 127) {
						local35 = 127;
					}
					local57 = (local29 + arg0 & 0xFC00) + (local29 & 0x380) + local35;
					local64 = Static1.anIntArray2[Static43.method816(local57, 96)];
				} else if (local14 >= 0) {
					local64 = Static1.anIntArray2[Static43.method816(Static1.anInterface3_1.method4132(local14), 96)];
				} else if (local8.anInt4281 == -1) {
					local64 = -1;
				} else {
					local29 = local8.anInt4281;
					local35 = (local29 & 0x7F) + arg1;
					if (local35 < 0) {
						local35 = 0;
					} else if (local35 > 127) {
						local35 = 127;
					}
					local57 = (local29 + arg0 & 0xFC00) + (local29 & 0x380) + local35;
					local64 = Static1.anIntArray2[Static43.method816(local57, 96)];
				}
				anIntArray314[local1 + 1] = local64;
			}
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lclient!sb;IIII)V")
	private static void method2532(@OriginalArg(0) Class2_Sub8_Sub21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0.anInt4973 = anInt3124 + (arg1 * (arg0.anInt4967 - anInt3129) >> 16);
		arg0.anInt4976 = anInt3126 + (arg2 * (arg0.anInt4968 - anInt3127) >> 16);
		@Pc(32) Class10 local32 = Static48.method890(arg0.anInt4970);
		if (local32.anInt157 != -1) {
			@Pc(42) Class93 local42 = local32.method155(false, true);
			if (local42 != null) {
				if (arg0.anInt4973 - (local42.anInt4355 + 1 >> 1) <= anInt3130 && arg0.anInt4973 + (local42.anInt4355 + 1 >> 1) >= anInt3124 && arg0.anInt4976 - (local42.anInt4359 + 1 >> 1) <= anInt3123 && arg0.anInt4976 + (local42.anInt4359 + 1 >> 1) >= anInt3126) {
					arg0.aBoolean327 = false;
				} else {
					arg0.aBoolean327 = true;
				}
				return;
			}
		}
		if (arg0.anInt4967 >= anInt3129 && arg0.anInt4967 <= anInt3128 && arg0.anInt4968 >= anInt3127 && arg0.anInt4968 <= anInt3125) {
			arg0.aBoolean327 = false;
		} else {
			arg0.aBoolean327 = true;
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIII)Lclient!en;")
	private static Class44 method2533(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class44 local3 = new Class44();
		for (@Pc(8) Class2_Sub8_Sub21 local8 = (Class2_Sub8_Sub21) aClass37_10.method1139(); local8 != null; local8 = (Class2_Sub8_Sub21) aClass37_10.method1145()) {
			method2532(local8, arg0, arg1);
			local3.method1358(local8);
		}
		@Pc(29) int[] local29 = new int[3];
		for (@Pc(31) int local31 = 0; local31 < aClass57_3.anInt2126; local31++) {
			@Pc(40) Class2_Sub8_Sub21 local40 = aClass57_3.aClass2_Sub8_Sub21Array1[local31];
			@Pc(67) boolean local67 = aClass2_Sub8_Sub16_3.method3595(aClass57_3.anIntArray193[local31] >> 28 & 0x3, aClass57_3.anIntArray193[local31] & 0x3FFF, local29, aClass57_3.anIntArray193[local31] >> 14 & 0x3FFF);
			if (local67) {
				local40.anInt4967 = local29[1] - anInt3122;
				local40.anInt4968 = anInt3119 + anInt3118 - local29[2] - 1;
				method2532(local40, arg0, arg1);
				local3.method1358(local40);
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "([IIIIIIIIIZ)V")
	private static void method2535(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		@Pc(1) int local1 = arg1;
		if (arg1 >= Static77.anInt1896) {
			return;
		}
		if (arg1 < Static77.anInt1894) {
			local1 = Static77.anInt1894;
		}
		@Pc(14) int local14 = arg1 + arg5;
		if (local14 <= Static77.anInt1894) {
			return;
		}
		if (local14 > Static77.anInt1896) {
			local14 = Static77.anInt1896;
		}
		@Pc(25) int local25 = arg2;
		if (arg2 >= Static77.anInt1893) {
			return;
		}
		if (arg2 < Static77.anInt1898) {
			local25 = Static77.anInt1898;
		}
		@Pc(38) int local38 = arg2 + arg6;
		if (local38 <= Static77.anInt1898) {
			return;
		}
		if (local38 > Static77.anInt1893) {
			local38 = Static77.anInt1893;
		}
		@Pc(53) int local53 = local25 * Static77.anInt1897 + local1;
		@Pc(59) int local59 = Static77.anInt1897 + local1 - local14;
		local1 -= arg1;
		local14 -= arg1;
		local25 -= arg2;
		local38 -= arg2;
		@Pc(79) int local79 = arg5 - local14;
		@Pc(83) int local83 = arg5 - local1;
		@Pc(87) int local87 = arg6 - local38;
		@Pc(91) int local91 = arg6 - local25;
		if (arg7 == 9) {
			arg7 = 1;
			arg8 = arg8 + 1 & 0x3;
		}
		if (arg7 == 10) {
			arg7 = 1;
			arg8 = arg8 + 3 & 0x3;
		}
		if (arg7 == 11) {
			arg7 = 8;
			arg8 = arg8 + 3 & 0x3;
		}
		@Pc(131) int local131;
		@Pc(136) int local136;
		if (arg7 == 1) {
			if (arg8 == 0) {
				for (local131 = local25; local131 < local38; local131++) {
					for (local136 = local1; local136 < local14; local136++) {
						if (local136 <= local131) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 1) {
				for (local131 = local91 - 1; local131 >= local87; local131--) {
					for (local136 = local1; local136 < local14; local136++) {
						if (local136 <= local131) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 2) {
				for (local131 = local25; local131 < local38; local131++) {
					for (local136 = local1; local136 < local14; local136++) {
						if (local136 >= local131) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 3) {
				for (local131 = local91 - 1; local131 >= local87; local131--) {
					for (local136 = local1; local136 < local14; local136++) {
						if (local136 >= local131) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			}
		} else if (arg7 == 2) {
			if (arg8 == 0) {
				for (local131 = local91 - 1; local131 >= local87; local131--) {
					for (local136 = local1; local136 < local14; local136++) {
						if (local136 <= local131 >> 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 1) {
				for (local131 = local25; local131 < local38; local131++) {
					for (local136 = local1; local136 < local14; local136++) {
						if (local53 >= 0 && local53 < arg0.length) {
							if (local136 >= local131 << 1) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						} else {
							local53++;
						}
					}
					local53 += local59;
				}
			} else if (arg8 == 2) {
				for (local131 = local25; local131 < local38; local131++) {
					for (local136 = local83 - 1; local136 >= local79; local136--) {
						if (local136 <= local131 >> 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 3) {
				for (local131 = local91 - 1; local131 >= local87; local131--) {
					for (local136 = local83 - 1; local136 >= local79; local136--) {
						if (local136 >= local131 << 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			}
		} else if (arg7 == 3) {
			if (arg8 == 0) {
				for (local131 = local91 - 1; local131 >= local87; local131--) {
					for (local136 = local83 - 1; local136 >= local79; local136--) {
						if (local136 <= local131 >> 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 1) {
				for (local131 = local91 - 1; local131 >= local87; local131--) {
					for (local136 = local1; local136 < local14; local136++) {
						if (local136 >= local131 << 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 2) {
				for (local131 = local25; local131 < local38; local131++) {
					for (local136 = local1; local136 < local14; local136++) {
						if (local136 <= local131 >> 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 3) {
				for (local131 = local25; local131 < local38; local131++) {
					for (local136 = local83 - 1; local136 >= local79; local136--) {
						if (local136 >= local131 << 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			}
		} else if (arg7 == 4) {
			if (arg8 == 0) {
				for (local131 = local91 - 1; local131 >= local87; local131--) {
					for (local136 = local1; local136 < local14; local136++) {
						if (local136 >= local131 >> 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 1) {
				for (local131 = local25; local131 < local38; local131++) {
					for (local136 = local1; local136 < local14; local136++) {
						if (local136 <= local131 << 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 2) {
				for (local131 = local25; local131 < local38; local131++) {
					for (local136 = local83 - 1; local136 >= local79; local136--) {
						if (local136 >= local131 >> 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 3) {
				for (local131 = local91 - 1; local131 >= local87; local131--) {
					for (local136 = local83 - 1; local136 >= local79; local136--) {
						if (local136 <= local131 << 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			}
		} else if (arg7 != 5) {
			if (arg7 == 6) {
				if (arg8 == 0) {
					for (local131 = local25; local131 < local38; local131++) {
						for (local136 = local1; local136 < local14; local136++) {
							if (local136 <= arg5 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
				if (arg8 == 1) {
					for (local131 = local25; local131 < local38; local131++) {
						for (local136 = local1; local136 < local14; local136++) {
							if (local131 <= arg6 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
				if (arg8 == 2) {
					for (local131 = local25; local131 < local38; local131++) {
						for (local136 = local1; local136 < local14; local136++) {
							if (local136 >= arg5 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
				if (arg8 == 3) {
					for (local131 = local25; local131 < local38; local131++) {
						for (local136 = local1; local136 < local14; local136++) {
							if (local131 >= arg6 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
			}
			if (arg7 == 7) {
				if (arg8 == 0) {
					for (local131 = local25; local131 < local38; local131++) {
						for (local136 = local1; local136 < local14; local136++) {
							if (local136 <= local131 - arg6 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
				if (arg8 == 1) {
					for (local131 = local91 - 1; local131 >= local87; local131--) {
						for (local136 = local1; local136 < local14; local136++) {
							if (local136 <= local131 - arg6 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
				if (arg8 == 2) {
					for (local131 = local91 - 1; local131 >= local87; local131--) {
						for (local136 = local83 - 1; local136 >= local79; local136--) {
							if (local136 <= local131 - arg6 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
				if (arg8 == 3) {
					for (local131 = local25; local131 < local38; local131++) {
						for (local136 = local83 - 1; local136 >= local79; local136--) {
							if (local136 <= local131 - arg6 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
			}
			if (arg7 == 8) {
				if (arg8 == 0) {
					for (local131 = local25; local131 < local38; local131++) {
						for (local136 = local1; local136 < local14; local136++) {
							if (local136 >= local131 - arg6 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
				if (arg8 == 1) {
					for (local131 = local91 - 1; local131 >= local87; local131--) {
						for (local136 = local1; local136 < local14; local136++) {
							if (local136 >= local131 - arg6 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
				if (arg8 == 2) {
					for (local131 = local91 - 1; local131 >= local87; local131--) {
						for (local136 = local83 - 1; local136 >= local79; local136--) {
							if (local136 >= local131 - arg6 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
				if (arg8 == 3) {
					for (local131 = local25; local131 < local38; local131++) {
						for (local136 = local83 - 1; local136 >= local79; local136--) {
							if (local136 >= local131 - arg6 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
			}
		} else if (arg8 == 0) {
			for (local131 = local91 - 1; local131 >= local87; local131--) {
				for (local136 = local83 - 1; local136 >= local79; local136--) {
					if (local136 >= local131 >> 1) {
						arg0[local53] = arg4;
					} else if (arg9) {
						arg0[local53] = arg3;
					}
					local53++;
				}
				local53 += local59;
			}
		} else if (arg8 == 1) {
			for (local131 = local91 - 1; local131 >= local87; local131--) {
				for (local136 = local1; local136 < local14; local136++) {
					if (local136 <= local131 << 1) {
						arg0[local53] = arg4;
					} else if (arg9) {
						arg0[local53] = arg3;
					}
					local53++;
				}
				local53 += local59;
			}
		} else if (arg8 == 2) {
			for (local131 = local25; local131 < local38; local131++) {
				for (local136 = local1; local136 < local14; local136++) {
					if (local136 >= local131 >> 1) {
						arg0[local53] = arg4;
					} else if (arg9) {
						arg0[local53] = arg3;
					}
					local53++;
				}
				local53 += local59;
			}
		} else if (arg8 == 3) {
			for (local131 = local25; local131 < local38; local131++) {
				for (local136 = local83 - 1; local136 >= local79; local136--) {
					if (local136 <= local131 << 1) {
						arg0[local53] = arg4;
					} else if (arg9) {
						arg0[local53] = arg3;
					}
					local53++;
				}
				local53 += local59;
			}
		}
	}

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "(IIII)V")
	private static void method2536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = anInt3128 - anInt3129;
		@Pc(7) int local7 = anInt3125 - anInt3127;
		if (anInt3128 < anInt3121) {
			local3++;
		}
		if (anInt3125 < anInt3119) {
			local7++;
		}
		@Pc(17) int local17;
		@Pc(28) int local28;
		@Pc(38) int local38;
		@Pc(42) int local42;
		@Pc(50) int local50;
		@Pc(104) int local104;
		@Pc(81) int local81;
		@Pc(93) int local93;
		@Pc(97) int local97;
		@Pc(172) int local172;
		@Pc(183) int local183;
		@Pc(193) int local193;
		@Pc(213) int local213;
		@Pc(231) int local231;
		@Pc(250) int local250;
		@Pc(316) int local316;
		@Pc(332) int local332;
		@Pc(142) int[][] local142;
		for (local17 = 0; local17 < local3; local17++) {
			local28 = arg0 * local17 >> 16;
			local38 = arg0 * (local17 + 1) >> 16;
			local42 = local38 - local28;
			if (local42 > 0) {
				local50 = local17 + anInt3129 >> 6;
				if (local50 >= 0 && local50 <= anIntArrayArrayArray11.length - 1) {
					local142 = anIntArrayArrayArray11[local50];
					@Pc(146) byte[][] local146 = aByteArrayArrayArray17[local50];
					@Pc(150) byte[][] local150 = aByteArrayArrayArray13[local50];
					@Pc(154) byte[][] local154 = aByteArrayArrayArray14[local50];
					@Pc(158) byte[][] local158 = aByteArrayArrayArray15[local50];
					@Pc(162) byte[][] local162 = aByteArrayArrayArray16[local50];
					local28 += anInt3124;
					local38 += anInt3124;
					for (local172 = 0; local172 < local7; local172++) {
						local183 = arg1 * local172 >> 16;
						local193 = arg1 * (local172 + 1) >> 16;
						@Pc(197) int local197 = local193 - local183;
						if (local197 > 0) {
							local183 += anInt3126;
							local193 += anInt3126;
							local213 = local172 + anInt3127 >> 6;
							@Pc(219) int local219 = local172 + anInt3127 & 0x3F;
							@Pc(225) int local225 = local17 + anInt3129 & 0x3F;
							local231 = (local219 << 6) + local225;
							if (local213 < 0 || local213 > local142.length - 1 || local142[local213] == null) {
								if (aClass2_Sub8_Sub16_3.anInt4420 != -1) {
									local250 = aClass2_Sub8_Sub16_3.anInt4420;
								} else if ((local17 + anInt3129 & 0x4) == (local172 + anInt3127 & 0x4)) {
									local250 = anIntArray314[Static275.anInt5452 + 1];
								} else {
									local250 = 4936552;
								}
								if (local213 < 0 || local213 > local142.length - 1) {
									if (local250 == 0) {
										local250 = 1;
									}
									Static77.method1447(local28, local183, local42, local197, local250);
									continue;
								}
							} else {
								local250 = local142[local213][local231];
							}
							if (local250 == 0) {
								local250 = 1;
							}
							local316 = local146[local213] == null ? 0 : anIntArray314[local146[local213][local231] & 0xFF];
							local332 = local154[local213] == null ? 0 : anIntArray314[local154[local213][local231] & 0xFF];
							@Pc(366) int local366;
							if (local316 == 0 && local332 == 0) {
								Static77.method1447(local28, local183, local42, local197, local250);
							} else {
								@Pc(362) byte local362;
								if (local316 != 0) {
									if (local316 == -1) {
										local316 = 1;
									}
									local362 = local150[local213] == null ? 0 : local150[local213][local231];
									local366 = local362 & 0xFC;
									if (local366 == 0 || local42 <= 1 || local197 <= 1) {
										Static77.method1447(local28, local183, local42, local197, local316);
									} else {
										method2535(Static77.anIntArray163, local28, local183, local250, local316, local42, local197, local366 >> 2, local362 & 0x3, true);
									}
								}
								if (local332 != 0) {
									if (local332 == -1) {
										local332 = local250;
									}
									local362 = local158[local213][local231];
									local366 = local362 & 0xFC;
									if (local366 == 0 || local42 <= 1 || local197 <= 1) {
										Static77.method1447(local28, local183, local42, local197, local332);
									}
									method2535(Static77.anIntArray163, local28, local183, 0, local332, local42, local197, local366 >> 2, local362 & 0x3, local316 == 0);
								}
							}
							if (local162[local213] != null) {
								@Pc(459) int local459 = local162[local213][local231] & 0xFF;
								if (local459 != 0) {
									if (local42 == 1) {
										local366 = local28;
									} else {
										local366 = local38 - 1;
									}
									@Pc(477) int local477;
									if (local197 == 1) {
										local477 = local183;
									} else {
										local477 = local193 - 1;
									}
									@Pc(484) int local484 = 13421772;
									if (local459 >= 5 && local459 <= 8 || local459 >= 13 && local459 <= 16 || local459 >= 21 && local459 <= 24 || local459 == 27 || local459 == 28) {
										local484 = 13369344;
										local459 -= 4;
									}
									if (local459 == 1) {
										Static77.method1438(local28, local183, local197, local484);
									} else if (local459 == 2) {
										Static77.method1450(local28, local183, local42, local484);
									} else if (local459 == 3) {
										Static77.method1438(local366, local183, local197, local484);
									} else if (local459 == 4) {
										Static77.method1450(local28, local477, local42, local484);
									} else if (local459 == 9) {
										Static77.method1438(local28, local183, local197, 16777215);
										Static77.method1450(local28, local183, local42, local484);
									} else if (local459 == 10) {
										Static77.method1438(local366, local183, local197, 16777215);
										Static77.method1450(local28, local183, local42, local484);
									} else if (local459 == 11) {
										Static77.method1438(local366, local183, local197, 16777215);
										Static77.method1450(local28, local477, local42, local484);
									} else if (local459 == 12) {
										Static77.method1438(local28, local183, local197, 16777215);
										Static77.method1450(local28, local477, local42, local484);
									} else if (local459 == 17) {
										Static77.method1450(local28, local183, 1, local484);
									} else if (local459 == 18) {
										Static77.method1450(local366, local183, 1, local484);
									} else if (local459 == 19) {
										Static77.method1450(local366, local477, 1, local484);
									} else if (local459 == 20) {
										Static77.method1450(local28, local477, 1, local484);
									} else {
										@Pc(644) int local644;
										if (local459 == 25) {
											for (local644 = 0; local644 < local197; local644++) {
												Static77.method1450(local28 + local644, local477 - local644, 1, local484);
											}
										} else if (local459 == 26) {
											for (local644 = 0; local644 < local197; local644++) {
												Static77.method1450(local28 + local644, local183 + local644, 1, local484);
											}
										}
									}
								}
							}
						}
					}
				} else {
					local28 += anInt3124;
					for (@Pc(68) int local68 = 0; local68 < local7; local68++) {
						local81 = (arg1 * local68 >> 16) + anInt3126;
						local93 = (arg1 * (local68 + 1) >> 16) + anInt3126;
						local97 = local93 - local81;
						if (aClass2_Sub8_Sub16_3.anInt4420 != -1) {
							local104 = aClass2_Sub8_Sub16_3.anInt4420;
						} else if ((local17 + anInt3129 & 0x4) == (local68 + anInt3127 & 0x4)) {
							local104 = anIntArray314[Static275.anInt5452 + 1];
						} else {
							local104 = 4936552;
						}
						if (local104 == 0) {
							local104 = 1;
						}
						Static77.method1447(local28, local81, local42, local97, local104);
					}
				}
			}
		}
		for (local17 = -2; local17 < local3 + 2; local17++) {
			local28 = arg0 * local17 >> 16;
			local38 = arg0 * (local17 + 1) >> 16;
			local42 = local38 - local28;
			if (local42 > 0) {
				local28 += anInt3124;
				local50 = local17 + anInt3129 >> 6;
				if (local50 >= 0 && local50 <= anIntArrayArrayArray10.length - 1) {
					local142 = anIntArrayArrayArray10[local50];
					for (local104 = -2; local104 < local7 + 2; local104++) {
						local81 = arg1 * local104 >> 16;
						local93 = arg1 * (local104 + 1) >> 16;
						local97 = local93 - local81;
						if (local97 > 0) {
							local81 += anInt3126;
							@Pc(785) int local785 = local104 + anInt3127 >> 6;
							if (local785 >= 0 && local785 <= local142.length - 1) {
								local172 = ((local104 + anInt3127 & 0x3F) << 6) + (local17 + anInt3129 & 0x3F);
								if (local142[local785] != null) {
									local183 = local142[local785][local172];
									local193 = local183 & 0x1FFF;
									if (local193 != 0) {
										@Pc(832) Class140 local832 = Static46.method855(local193 - 1);
										local213 = local183 >> 13 & 0x3;
										@Pc(849) boolean local849 = (local183 >> 15 & 0x1) == 1;
										@Pc(855) Class93_Sub1 local855 = local832.method3671(local213, local849);
										if (local855 != null) {
											local231 = local42 * local855.anInt4355 / 4;
											local250 = local97 * local855.anInt4359 / 4;
											if (local832.aBoolean302) {
												local316 = local183 >> 16 & 0xF;
												local332 = local183 >> 20 & 0xF;
												if ((local213 & 0x1) == 1) {
													local213 = local316;
													local316 = local332;
													local332 = local213;
												}
												local231 = local316 * local42;
												local250 = local332 * local97;
											}
											if (local231 != 0 && local250 != 0) {
												if (local832.anInt4531 == 0) {
													local855.method2561(local28, local81 + local97 - local250, local231, local250);
												} else {
													local855.method2563(local28, local81 + local97 - local250, local231, local250, local832.anInt4531);
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "(I)Lclient!pg;")
	public static Class2_Sub8_Sub16 method2537(@OriginalArg(0) int arg0) {
		return (Class2_Sub8_Sub16) aClass101_10.method2867((long) arg0);
	}

	@OriginalMember(owner = "client!rn", name = "d", descriptor = "()V")
	public static void method2538() {
		for (@Pc(1) int local1 = 0; local1 < aClass57_3.anInt2126; local1++) {
			if (aClass57_3.aClass2_Sub8_Sub21Array1[local1] != null) {
				aClass37_10.method1144(aClass57_3.aClass2_Sub8_Sub21Array1[local1]);
			}
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2539(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		anInt3129 = arg0;
		anInt3127 = arg1;
		anInt3128 = arg2;
		anInt3125 = arg3;
		anInt3124 = arg4;
		anInt3126 = arg5;
		anInt3130 = arg6;
		anInt3123 = arg7;
	}
}
