import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "Lclient!iq;")
	public static Class104 aClass104_127;

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "Lclient!os;")
	public static Class2_Sub9_Sub17 aClass2_Sub9_Sub17_2;

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "Lclient!tn;")
	public static Class194 aClass194_2;

	@OriginalMember(owner = "client!mj", name = "g", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!mj", name = "h", descriptor = "F")
	public static float aFloat49;

	@OriginalMember(owner = "client!mj", name = "j", descriptor = "I")
	public static int anInt4948;

	@OriginalMember(owner = "client!mj", name = "k", descriptor = "F")
	public static float aFloat50;

	@OriginalMember(owner = "client!mj", name = "n", descriptor = "I")
	public static int anInt4950;

	@OriginalMember(owner = "client!mj", name = "o", descriptor = "[B")
	private static byte[] aByteArray64;

	@OriginalMember(owner = "client!mj", name = "p", descriptor = "I")
	public static int anInt4951;

	@OriginalMember(owner = "client!mj", name = "q", descriptor = "I")
	public static int anInt4952;

	@OriginalMember(owner = "client!mj", name = "r", descriptor = "I")
	public static int anInt4953;

	@OriginalMember(owner = "client!mj", name = "s", descriptor = "[S")
	private static short[] aShortArray89;

	@OriginalMember(owner = "client!mj", name = "t", descriptor = "I")
	public static int anInt4954;

	@OriginalMember(owner = "client!mj", name = "u", descriptor = "I")
	public static int anInt4955;

	@OriginalMember(owner = "client!mj", name = "v", descriptor = "[S")
	private static short[] aShortArray90;

	@OriginalMember(owner = "client!mj", name = "w", descriptor = "[B")
	private static byte[] aByteArray65;

	@OriginalMember(owner = "client!mj", name = "x", descriptor = "Lclient!cm;")
	private static Class41 aClass41_30;

	@OriginalMember(owner = "client!mj", name = "y", descriptor = "I")
	public static int anInt4956;

	@OriginalMember(owner = "client!mj", name = "z", descriptor = "I")
	public static int anInt4957;

	@OriginalMember(owner = "client!mj", name = "A", descriptor = "[[[Lclient!tm;")
	private static Class193[][][] aClass193ArrayArrayArray2;

	@OriginalMember(owner = "client!mj", name = "B", descriptor = "I")
	public static int anInt4958;

	@OriginalMember(owner = "client!mj", name = "C", descriptor = "I")
	public static int anInt4959;

	@OriginalMember(owner = "client!mj", name = "D", descriptor = "[B")
	private static byte[] aByteArray66;

	@OriginalMember(owner = "client!mj", name = "E", descriptor = "[I")
	private static int[] anIntArray390;

	@OriginalMember(owner = "client!mj", name = "F", descriptor = "[B")
	private static byte[] aByteArray67;

	@OriginalMember(owner = "client!mj", name = "G", descriptor = "I")
	public static int anInt4960;

	@OriginalMember(owner = "client!mj", name = "H", descriptor = "[B")
	private static byte[] aByteArray68;

	@OriginalMember(owner = "client!mj", name = "I", descriptor = "I")
	public static int anInt4961;

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "Lclient!cm;")
	private static final Class41 aClass41_29 = new Class41(16);

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
	public static int anInt4947 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!mj", name = "f", descriptor = "[B")
	private static final byte[] aByteArray63 = new byte[1];

	@OriginalMember(owner = "client!mj", name = "i", descriptor = "Lclient!sf;")
	public static final Class180 aClass180_34 = new Class180();

	@OriginalMember(owner = "client!mj", name = "l", descriptor = "[S")
	private static final short[] aShortArray88 = new short[1];

	@OriginalMember(owner = "client!mj", name = "m", descriptor = "I")
	public static int anInt4949 = (int) (Math.random() * 11.0D) - 5;

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!dr;II)V")
	public static void method4214(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class2_Sub12 local9 = new Class2_Sub12(aClass104_127.method2760(aClass2_Sub9_Sub17_2.aString50, "area"));
		@Pc(13) int local13 = local9.method3124();
		@Pc(16) int[] local16 = new int[local13];
		for (@Pc(18) int local18 = 0; local18 < local13; local18++) {
			local16[local18] = local9.method3124();
		}
		@Pc(33) int local33 = local9.method3124();
		@Pc(36) int[] local36 = new int[local33];
		for (@Pc(38) int local38 = 0; local38 < local33; local38++) {
			local36[local38] = local9.method3124();
		}
		while (true) {
			@Pc(58) int local58;
			@Pc(64) int local64;
			@Pc(67) int local67;
			@Pc(76) int local76;
			@Pc(148) int local148;
			while (local9.anInt3606 < local9.aByteArray30.length) {
				@Pc(62) int local62;
				@Pc(84) int local84;
				if (local9.method3124() == 0) {
					local58 = local9.method3124();
					local62 = local9.method3124();
					for (local64 = 0; local64 < 64; local64++) {
						for (local67 = 0; local67 < 64; local67++) {
							local76 = local58 * 64 + local64 - anInt4952;
							local84 = local62 * 64 + local67 - anInt4958;
							method4217(arg0, local9, local58, local62, local76, local84, local16, local36);
						}
					}
				} else {
					local58 = local9.method3124();
					local62 = local9.method3124();
					local64 = local9.method3124();
					local67 = local9.method3124();
					for (local76 = 0; local76 < 8; local76++) {
						for (local84 = 0; local84 < 8; local84++) {
							@Pc(136) int local136 = local58 * 64 + local64 * 8 + local76 - anInt4952;
							local148 = local62 * 64 + local67 * 8 + local84 - anInt4958;
							method4217(arg0, local9, local58, local62, local136, local148, local16, local36);
						}
					}
				}
			}
			aByteArray68 = new byte[anInt4956 * anInt4957];
			aShortArray90 = new short[anInt4956 * anInt4957];
			for (local58 = 0; local58 < 3; local58++) {
				@Pc(191) byte[] local191 = new byte[anInt4956 * anInt4957];
				for (local64 = 0; local64 < aClass193ArrayArrayArray2[local58].length; local64++) {
					for (local67 = 0; local67 < aClass193ArrayArrayArray2[local58][0].length; local67++) {
						@Pc(205) Class193 local205 = aClass193ArrayArrayArray2[local58][local64][local67];
						if (local205 != null) {
							for (@Pc(212) Class57_Sub8 local212 = (Class57_Sub8) local205.method5224(); local212 != null; local212 = (Class57_Sub8) local205.method5223()) {
								local191[local64 * 64 + local212.aByte71 + (local67 * 64 + local212.aByte70) * anInt4956] = (byte) local212.anInt6493;
							}
						}
					}
				}
				method4222(local191, aByteArray68, aShortArray90, arg1, arg2);
				for (local67 = 0; local67 < aClass193ArrayArrayArray2[local58].length; local67++) {
					for (local76 = 0; local76 < aClass193ArrayArrayArray2[local58][0].length; local76++) {
						@Pc(276) Class193 local276 = aClass193ArrayArrayArray2[local58][local67][local76];
						if (local276 != null) {
							for (@Pc(283) Class57_Sub8 local283 = (Class57_Sub8) local276.method5224(); local283 != null; local283 = (Class57_Sub8) local276.method5223()) {
								local148 = local67 * 64 + local283.aByte71 + (local76 * 64 + local283.aByte70) * anInt4956;
								local283.anInt6493 = (aByteArray68[local148] & 0xFF) << 16 | aShortArray90[local148] & 0xFFFF;
								if (local283.anInt6493 != 0) {
									local283.anInt6493 |= 0xFF000000;
								}
							}
						}
					}
				}
			}
			method4222(aByteArray65, aByteArray68, aShortArray90, arg1, arg2);
			aByteArray65 = null;
			method4230();
			return;
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!dr;Lclient!dh;IIII)V")
	private static void method4215(@OriginalArg(0) Class37 arg0, @OriginalArg(1) Class2_Sub8 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		arg1.anInt1042 = anInt4960 + (arg2 * (arg1.anInt1043 - anInt4950) >> 16);
		arg1.anInt1040 = anInt4951 - (arg3 * (arg1.anInt1037 - anInt4959) >> 16);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!ec;III)I")
	private static int method4216(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class63 local3 = Static364.method5843(arg1);
		if (local3 == null) {
			return 0;
		}
		@Pc(10) int local10 = local3.anInt1559;
		if (local10 >= 0 && arg0.method166(local10).aBoolean250) {
			local10 = -1;
		}
		@Pc(67) int local67;
		@Pc(26) int local26;
		@Pc(32) int local32;
		@Pc(54) int local54;
		if (local3.anInt1569 >= 0) {
			local26 = local3.anInt1569;
			local32 = (local26 & 0x7F) + arg3;
			if (local32 < 0) {
				local32 = 0;
			} else if (local32 > 127) {
				local32 = 127;
			}
			local54 = (local26 + arg2 & 0xFC00) + (local26 & 0x380) + local32;
			local67 = Static233.anIntArray394[Static54.method1201(Static297.method4935(local54)) & 0xFFFF] | 0xFF000000;
		} else if (local10 >= 0) {
			local67 = Static233.anIntArray394[Static54.method1201(Static297.method4935(arg0.method166(local10).aShort40)) & 0xFFFF] | 0xFF000000;
		} else if (local3.anInt1560 == -1) {
			local67 = 0;
		} else {
			local26 = local3.anInt1560;
			local32 = (local26 & 0x7F) + arg3;
			if (local32 < 0) {
				local32 = 0;
			} else if (local32 > 127) {
				local32 = 127;
			}
			local54 = (local26 + arg2 & 0xFC00) + (local26 & 0x380) + local32;
			local67 = Static233.anIntArray394[Static54.method1201(Static297.method4935(local54)) & 0xFFFF] | 0xFF000000;
		}
		return local67;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!dr;Lclient!ef;IIII[I[I)V")
	private static void method4217(@OriginalArg(0) Class37 arg0, @OriginalArg(1) Class2_Sub12 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7) {
		@Pc(3) int local3 = arg1.method3124();
		if ((local3 & 0x1) == 0) {
			@Pc(15) boolean local15 = (local3 & 0x2) == 0;
			@Pc(21) int local21 = local3 >> 2 & 0x3F;
			if (local21 != 62) {
				if (local21 == 63) {
					local21 = arg1.method3124();
				} else if (local15) {
					local21 = arg6[local21];
				} else {
					local21 = arg7[local21];
				}
				if (local15) {
					aByteArray65[arg4 + arg5 * anInt4956] = (byte) local21;
					aByteArray67[arg4 + arg5 * anInt4956] = 0;
				} else {
					aByteArray67[arg4 + arg5 * anInt4956] = (byte) local21;
					aByteArray66[arg4 + arg5 * anInt4956] = 0;
					aByteArray65[arg4 + arg5 * anInt4956] = arg1.method3122();
				}
			}
			return;
		}
		@Pc(100) int local100 = (local3 >> 1 & 0x3) + 1;
		@Pc(108) boolean local108 = (local3 & 0x8) != 0;
		@Pc(116) boolean local116 = (local3 & 0x10) != 0;
		for (@Pc(118) int local118 = 0; local118 < local100; local118++) {
			@Pc(123) int local123 = arg1.method3124();
			@Pc(125) int local125 = 0;
			@Pc(127) int local127 = 0;
			if (local108) {
				local125 = arg1.method3124();
				local127 = arg1.method3124();
			}
			@Pc(139) int local139 = 0;
			if (local116) {
				local139 = arg1.method3124();
			}
			@Pc(215) short[] local215;
			@Pc(218) byte[] local218;
			@Pc(220) int local220;
			if (local118 == 0) {
				aByteArray65[arg4 + arg5 * anInt4956] = (byte) local123;
				aByteArray67[arg4 + arg5 * anInt4956] = (byte) local125;
				aByteArray66[arg4 + arg5 * anInt4956] = (byte) local127;
				if (local139 == 1) {
					aShortArray89[arg4 + arg5 * anInt4956] = (short) (arg1.method3104() + 1);
					aByteArray64[arg4 + arg5 * anInt4956] = arg1.method3122();
				} else if (local139 > 1) {
					aShortArray89[arg4 + arg5 * anInt4956] = -1;
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method3104();
						local218[local220] = arg1.method3122();
					}
					aClass41_30.method901(new Class2_Sub13(local215, local218), (long) (arg4 << 16 | arg5));
				}
			} else {
				local215 = null;
				local218 = null;
				if (local139 > 0) {
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method3104();
						local218[local220] = arg1.method3122();
					}
				}
				if (aClass193ArrayArrayArray2[local118 - 1][arg2 - (anInt4952 >> 6)][arg3 - (anInt4958 >> 6)] == null) {
					aClass193ArrayArrayArray2[local118 - 1][arg2 - (anInt4952 >> 6)][arg3 - (anInt4958 >> 6)] = new Class193();
				}
				@Pc(338) Class57_Sub8 local338 = new Class57_Sub8(arg4 & 0x3F, arg5 & 0x3F, local123, local125, local127, local215, local218);
				aClass193ArrayArrayArray2[local118 - 1][arg2 - (anInt4952 >> 6)][arg3 - (anInt4958 >> 6)].method5222(local338);
			}
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!iq;)V")
	public static void method4218(@OriginalArg(0) Class104 arg0) {
		aClass104_127 = arg0;
		aClass41_29.method907();
		@Pc(9) int local9 = aClass104_127.method2769("details");
		@Pc(14) int[] local14 = aClass104_127.method2763(local9);
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(25) Class2_Sub9_Sub17 local25 = Static201.method3812(local14[local16], aClass104_127, local9);
			aClass41_29.method901(local25, (long) local25.anInt5172);
		}
		Static204.method3873(false);
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "()V")
	public static void method4219() {
		@Pc(2) int[] local2 = new int[3];
		for (@Pc(4) int local4 = 0; local4 < aClass194_2.anInt6208; local4++) {
			@Pc(32) boolean local32 = aClass2_Sub9_Sub17_2.method4368(aClass194_2.anIntArray480[local4] >> 28 & 0x3, aClass194_2.anIntArray480[local4] & 0x3FFF, aClass194_2.anIntArray480[local4] >> 14 & 0x3FFF, local2);
			if (local32) {
				@Pc(42) Class2_Sub8 local42 = new Class2_Sub8(aClass194_2.anIntArray479[local4]);
				local42.anInt1043 = local2[1] - anInt4952;
				local42.anInt1037 = local2[2] - anInt4958;
				aClass180_34.method4909(local42);
			}
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!dr;)Lclient!sf;")
	public static Class180 method4220(@OriginalArg(0) Class37 arg0) {
		@Pc(3) int local3 = anInt4954 - anInt4950;
		@Pc(7) int local7 = anInt4953 - anInt4959;
		@Pc(15) int local15 = (anInt4961 - anInt4960 << 16) / local3;
		@Pc(23) int local23 = (anInt4951 - anInt4955 << 16) / local7;
		return method4229(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)Lclient!os;")
	public static Class2_Sub9_Sub17 method4221(@OriginalArg(0) int arg0) {
		return (Class2_Sub9_Sub17) aClass41_29.method902((long) arg0);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "([B[B[SII)V")
	private static void method4222(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int[] local2 = new int[anInt4957];
		@Pc(5) int[] local5 = new int[anInt4957];
		@Pc(8) int[] local8 = new int[anInt4957];
		@Pc(11) int[] local11 = new int[anInt4957];
		@Pc(14) int[] local14 = new int[anInt4957];
		for (@Pc(16) int local16 = -5; local16 < anInt4956; local16++) {
			@Pc(21) int local21 = local16 + 5;
			@Pc(25) int local25 = local16 - 5;
			@Pc(41) int local41;
			for (@Pc(27) int local27 = 0; local27 < anInt4957; local27++) {
				@Pc(49) Class121 local49;
				@Pc(85) int local85;
				if (local21 < anInt4956) {
					local41 = arg0[local21 + local27 * anInt4956] & 0xFF;
					if (local41 > 0) {
						local49 = Static229.method4237(local41 - 1);
						local2[local27] += local49.anInt3851;
						local5[local27] += local49.anInt3854;
						local8[local27] += local49.anInt3858;
						local11[local27] += local49.anInt3853;
						local85 = local14[local27]++;
					}
				}
				if (local25 >= 0) {
					local41 = arg0[local25 + local27 * anInt4956] & 0xFF;
					if (local41 > 0) {
						local49 = Static229.method4237(local41 - 1);
						local2[local27] -= local49.anInt3851;
						local5[local27] -= local49.anInt3854;
						local8[local27] -= local49.anInt3858;
						local11[local27] -= local49.anInt3853;
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
				for (@Pc(165) int local165 = -5; local165 < anInt4957; local165++) {
					@Pc(170) int local170 = local165 + 5;
					if (local170 < anInt4957) {
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
						if ((arg0[local16 + local165 * anInt4956] & 0xFF) == 0) {
							local259 = local16 + local165 * anInt4956;
							arg1[local259] = 0;
							arg2[local259] = 0;
						} else {
							local259 = local161 == 0 ? 0 : Static271.method4701(local159 / local163, local41 * 256 / local161, local157 / local163);
							@Pc(292) int local292 = (local259 & 0x7F) + arg4;
							if (local292 < 0) {
								local292 = 0;
							} else if (local292 > 127) {
								local292 = 127;
							}
							@Pc(314) int local314 = (local259 + arg3 & 0xFC00) + (local259 & 0x380) + local292;
							@Pc(320) int local320 = local16 + local165 * anInt4956;
							@Pc(331) int local331 = Static233.anIntArray394[Static54.method1201(Static46.method881(local314)) & 0xFFFF];
							arg1[local320] = (byte) (local331 >> 16 & 0xFF);
							arg2[local320] = (short) (local331 & 0xFFFF);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!dr;IIII)V")
	private static void method4223(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = anInt4954 - anInt4950;
		@Pc(7) int local7 = anInt4953 - anInt4959;
		if (anInt4954 < anInt4956) {
			local3++;
		}
		if (anInt4953 < anInt4957) {
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
			local28 = (arg1 * local17 >> 16) + anInt4960;
			local40 = (arg1 * (local17 + 1) >> 16) + anInt4960;
			local44 = local40 - local28;
			if (local44 > 0) {
				local50 = anInt4950 + local17;
				if (local50 >= 0 && local50 < anInt4956) {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt4951 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt4951 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (local84 > 0) {
							local93 = local57 + anInt4959;
							local172 = local50 + local93 * anInt4956;
							local174 = 0;
							local176 = 0;
							local178 = 0;
							if (local93 >= 0 && local93 < anInt4957) {
								local174 = (aByteArray68[local172] & 0xFF) << 16 | aShortArray90[local172] & 0xFFFF;
								if (local174 != 0) {
									local174 |= 0xFF000000;
								}
								local176 = aByteArray67[local172] & 0xFF;
								local178 = aShortArray89[local172] & 0xFFFF;
							}
							if (local174 == 0 && local176 == 0 && local178 == 0) {
								if (aClass2_Sub9_Sub17_2.anInt5173 != -1) {
									local174 = aClass2_Sub9_Sub17_2.anInt5173 | 0xFF000000;
								} else if ((local17 + anInt4950 & 0x4) == (local57 + anInt4953 & 0x4)) {
									local174 = anIntArray390[Static20.anInt319 + 1];
								} else {
									local174 = -11840664;
								}
								if (local174 == 0) {
									local174 = -16777216;
								}
								arg0.method3712(local28, local70, local44, local84, local174, 0);
							} else if (local178 <= 0) {
								method4227(arg0, local28, local70, local44, local84, local174, local176, aByteArray66[local172], null, null, true);
							} else if (local178 == 65535) {
								@Pc(280) Class2_Sub13 local280 = (Class2_Sub13) aClass41_30.method902((long) (local50 << 16 | local93));
								if (local280 != null) {
									method4227(arg0, local28, local70, local44, local84, local174, local176, aByteArray66[local172], local280.aShortArray19, local280.aByteArray14, true);
								}
							} else {
								aShortArray88[0] = (short) (local178 - 1);
								aByteArray63[0] = aByteArray64[local172];
								method4227(arg0, local28, local70, local44, local84, local174, local176, aByteArray66[local172], aShortArray88, aByteArray63, true);
							}
						}
					}
				} else {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt4951 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt4951 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (aClass2_Sub9_Sub17_2.anInt5173 != -1) {
							local93 = aClass2_Sub9_Sub17_2.anInt5173 | 0xFF000000;
						} else if ((local17 + anInt4950 & 0x4) == (local57 + anInt4953 & 0x4)) {
							local93 = anIntArray390[Static20.anInt319 + 1];
						} else {
							local93 = -11840664;
						}
						if (local93 == 0) {
							local93 = -16777216;
						}
						arg0.method3712(local28, local70, local44, local84, local93, 0);
					}
				}
			}
		}
		for (local28 = -16; local28 < local3 + 16; local28++) {
			local40 = (arg1 * local28 >> 16) + anInt4960;
			local44 = (arg1 * (local28 + 1) >> 16) + anInt4960;
			local50 = local44 - local40;
			if (local50 > 0) {
				local57 = local28 + anInt4950;
				if (local57 >= 0 && local57 < anInt4956) {
					for (local70 = -16; local70 < local7 + 16; local70++) {
						local80 = anInt4951 - (arg2 * (local70 + 1) >> 16);
						local84 = anInt4951 - (arg2 * local70 >> 16);
						local93 = local84 - local80;
						if (local93 > 0) {
							local172 = local70 + anInt4959;
							if (local172 >= 0 && local172 < anInt4957) {
								local174 = aShortArray89[local57 + local172 * anInt4956] & 0xFFFF;
								if (local174 <= 0) {
									method4231(arg0, local40, local80, local50, local93, null, null);
								} else if (local174 == 65535) {
									@Pc(457) Class2_Sub13 local457 = (Class2_Sub13) aClass41_30.method902((long) (local57 << 16 | local172));
									if (local457 != null) {
										method4231(arg0, local40, local80, local50, local93, local457.aShortArray19, local457.aByteArray14);
									}
								} else {
									aShortArray88[0] = (short) (local174 - 1);
									aByteArray63[0] = aByteArray64[local57 + local172 * anInt4956];
									method4231(arg0, local40, local80, local50, local93, aShortArray88, aByteArray63);
								}
							}
						}
					}
				}
			}
		}
		local40 = anInt4950 >> 6;
		local44 = anInt4959 >> 6;
		if (local40 < 0) {
			local40 = 0;
		}
		if (local44 < 0) {
			local44 = 0;
		}
		local50 = anInt4954 >> 6;
		local57 = anInt4953 >> 6;
		if (local50 >= aClass193ArrayArrayArray2[0].length) {
			local50 = aClass193ArrayArrayArray2[0].length - 1;
		}
		if (local57 >= aClass193ArrayArrayArray2[0][0].length) {
			local57 = aClass193ArrayArrayArray2[0][0].length - 1;
		}
		for (local70 = 0; local70 < 3; local70++) {
			@Pc(639) int local639;
			@Pc(651) int local651;
			@Pc(663) int local663;
			@Pc(673) int local673;
			@Pc(629) int local629;
			for (local80 = local40; local80 <= local50; local80++) {
				for (local84 = local44; local84 <= local57; local84++) {
					@Pc(587) Class193 local587 = aClass193ArrayArrayArray2[local70][local80][local84];
					if (local587 != null) {
						local172 = (local80 + (anInt4952 >> 6)) * 64;
						local174 = (local84 + (anInt4958 >> 6)) * 64;
						for (@Pc(610) Class57_Sub8 local610 = (Class57_Sub8) local587.method5224(); local610 != null; local610 = (Class57_Sub8) local587.method5223()) {
							local178 = local172 + local610.aByte71 - anInt4952 - anInt4950;
							local629 = local174 + local610.aByte70 - anInt4958 - anInt4959;
							local639 = (arg1 * local178 >> 16) + anInt4960;
							local651 = (arg1 * (local178 + 1) >> 16) + anInt4960;
							local663 = anInt4951 - (arg2 * (local629 + 1) >> 16);
							local673 = anInt4951 - (arg2 * local629 >> 16);
							method4227(arg0, local639, local663, local651 - local639, local673 - local663, local610.anInt6493, local610.aByte73 & 0xFF, local610.aByte72, local610.aShortArray102, local610.aByteArray88, false);
						}
					}
				}
			}
			for (local84 = local40; local84 <= local50; local84++) {
				for (local93 = local44; local93 <= local57; local93++) {
					@Pc(725) Class193 local725 = aClass193ArrayArrayArray2[local70][local84][local93];
					if (local725 != null) {
						local174 = (local84 + (anInt4952 >> 6)) * 64;
						local176 = (local93 + (anInt4958 >> 6)) * 64;
						for (@Pc(748) Class57_Sub8 local748 = (Class57_Sub8) local725.method5224(); local748 != null; local748 = (Class57_Sub8) local725.method5223()) {
							local629 = local174 + local748.aByte71 - anInt4952 - anInt4950;
							local639 = local176 + local748.aByte70 - anInt4958 - anInt4959;
							local651 = (arg1 * local629 >> 16) + anInt4960;
							local663 = (arg1 * (local629 + 1) >> 16) + anInt4960;
							local673 = anInt4951 - (arg2 * (local639 + 1) >> 16);
							@Pc(811) int local811 = anInt4951 - (arg2 * local639 >> 16);
							method4231(arg0, local651, local673, local663 - local651, local811 - local673, local748.aShortArray102, local748.aByteArray88);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!ec;II)V")
	public static void method4224(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static303.anInt6038; local1++) {
			anIntArray390[local1 + 1] = method4216(arg0, local1, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "()V")
	public static void method4225() {
		aByteArray65 = new byte[anInt4956 * anInt4957];
		aByteArray67 = new byte[anInt4956 * anInt4957];
		aByteArray66 = new byte[anInt4956 * anInt4957];
		aShortArray89 = new short[anInt4956 * anInt4957];
		aByteArray64 = new byte[anInt4956 * anInt4957];
		aClass41_30 = new Class41(1024);
		aClass193ArrayArrayArray2 = new Class193[3][anInt4956 >> 6][anInt4957 >> 6];
		anIntArray390 = new int[Static303.anInt6038 + 1];
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4226(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		anInt4950 = arg0 - anInt4952;
		anInt4953 = arg1 - anInt4958;
		anInt4954 = arg2 - anInt4952;
		anInt4959 = arg3 - anInt4958;
		anInt4960 = arg4;
		anInt4955 = arg5;
		anInt4961 = arg6;
		anInt4951 = arg7;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!dr;IIIIIII[S[BZ)V")
	private static void method4227(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) byte[] arg9, @OriginalArg(10) boolean arg10) {
		@Pc(20) int local20;
		@Pc(32) int local32;
		if (arg10 || arg5 != 0 || arg6 > 0) {
			if (arg6 == 0) {
				arg0.method3712(arg1, arg2, arg3, arg4, arg5, 0);
			} else {
				local20 = arg7 & 0x3F;
				if (local20 == 0 || arg3 <= 1 || arg4 <= 1) {
					local32 = anIntArray390[arg6];
					if (arg10 || local32 != 0) {
						arg0.method3712(arg1, arg2, arg3, arg4, local32, 0);
					}
				} else {
					local32 = arg10 ? 0 : 1;
					Static260.method4615(arg0, local20, anIntArray390[arg6], arg4, arg3, arg2, aByteArrayArrayArray9, anInt4948, arg5, local32, arg7 >> 6 & 0x3, arg1);
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
				@Pc(126) Class74 local126 = Static228.method4210(arg8[local100] & 0xFFFF);
				if (local126.anInt2070 == -1) {
					@Pc(132) int local132 = -3355444;
					if (local126.anInt2086 == 1) {
						local132 = -3407872;
					}
					@Pc(146) int local146 = arg9[local100] >> 6 & 0x3;
					if (local107 == 0) {
						if (local146 == 0) {
							arg0.method3693(arg1, arg2, arg4, local132, 0);
						} else if (local146 == 1) {
							arg0.method3669(arg1, arg2, arg3, local132, 0);
						} else if (local146 == 2) {
							arg0.method3693(local20, arg2, arg4, local132, 0);
						} else {
							arg0.method3669(arg1, local32, arg3, local132, 0);
						}
					} else if (local107 == 2) {
						if (local146 == 0) {
							arg0.method3693(arg1, arg2, arg4, -1, 0);
							arg0.method3669(arg1, arg2, arg3, local132, 0);
						} else if (local146 == 1) {
							arg0.method3693(local20, arg2, arg4, -1, 0);
							arg0.method3669(arg1, arg2, arg3, local132, 0);
						} else if (local146 == 2) {
							arg0.method3693(local20, arg2, arg4, -1, 0);
							arg0.method3669(arg1, local32, arg3, local132, 0);
						} else {
							arg0.method3693(arg1, arg2, arg4, -1, 0);
							arg0.method3669(arg1, local32, arg3, local132, 0);
						}
					} else if (local107 == 3) {
						if (local146 == 0) {
							arg0.method3669(arg1, arg2, 1, local132, 0);
						} else if (local146 == 1) {
							arg0.method3669(local20, arg2, 1, local132, 0);
						} else if (local146 == 2) {
							arg0.method3669(local20, local32, 1, local132, 0);
						} else {
							arg0.method3669(arg1, local32, 1, local132, 0);
						}
					} else if (local107 == 9) {
						@Pc(312) int local312;
						if (local146 == 0 || local146 == 2) {
							for (local312 = 0; local312 < arg4; local312++) {
								arg0.method3669(arg1 + local312, local32 - local312, 1, local132, 0);
							}
						} else {
							for (local312 = 0; local312 < arg4; local312++) {
								arg0.method3669(arg1 + local312, arg2 + local312, 1, local132, 0);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)Lclient!lq;")
	public static Class129 method4228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class129 local3 = new Class129();
		for (@Pc(8) Class2_Sub9_Sub17 local8 = (Class2_Sub9_Sub17) aClass41_29.method896(); local8 != null; local8 = (Class2_Sub9_Sub17) aClass41_29.method904()) {
			if (local8.aBoolean450 && local8.method4366(arg0, arg1)) {
				local3.method3575(local8);
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(Lclient!dr;IIII)Lclient!sf;")
	private static Class180 method4229(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(4) Class2_Sub8 local4 = (Class2_Sub8) aClass180_34.method4919(); local4 != null; local4 = (Class2_Sub8) aClass180_34.method4916()) {
			method4215(arg0, local4, arg1, arg2);
		}
		return aClass180_34;
	}

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "()V")
	private static void method4230() {
		@Pc(4) int local4;
		@Pc(15) int local15;
		@Pc(48) int local48;
		for (@Pc(1) int local1 = 0; local1 < anInt4956; local1++) {
			for (local4 = 0; local4 < anInt4957; local4++) {
				local15 = aShortArray89[local1 + local4 * anInt4956] & 0xFFFF;
				if (local15 != 0) {
					@Pc(35) int local35;
					if (local15 == 65535) {
						@Pc(31) Class2_Sub13 local31 = (Class2_Sub13) aClass41_30.method902((long) (local1 << 16 | local4));
						if (local31 != null) {
							for (local35 = 0; local35 < local31.aShortArray19.length; local35++) {
								@Pc(45) Class74 local45 = Static228.method4210(local31.aShortArray19[local35] & 0xFFFF);
								local48 = local45.anInt2055;
								if (local45.anIntArray161 != null) {
									local45 = local45.method1997();
									if (local45 != null) {
										local48 = local45.anInt2055;
									}
								}
								if (local48 != -1) {
									@Pc(68) Class2_Sub8 local68 = new Class2_Sub8(local48);
									local68.anInt1043 = local1;
									local68.anInt1037 = local4;
									aClass180_34.method4909(local68);
								}
							}
						}
					} else {
						@Pc(91) Class74 local91 = Static228.method4210(local15 - 1);
						local35 = local91.anInt2055;
						if (local91.anIntArray161 != null) {
							local91 = local91.method1997();
							if (local91 != null) {
								local35 = local91.anInt2055;
							}
						}
						if (local35 != -1) {
							@Pc(114) Class2_Sub8 local114 = new Class2_Sub8(local35);
							local114.anInt1043 = local1;
							local114.anInt1037 = local4;
							aClass180_34.method4909(local114);
						}
					}
				}
			}
		}
		for (local4 = 0; local4 < 3; local4++) {
			for (local15 = 0; local15 < aClass193ArrayArrayArray2[0].length; local15++) {
				for (@Pc(140) int local140 = 0; local140 < aClass193ArrayArrayArray2[0][0].length; local140++) {
					@Pc(149) Class193 local149 = aClass193ArrayArrayArray2[local4][local15][local140];
					if (local149 != null) {
						for (@Pc(156) Class57_Sub8 local156 = (Class57_Sub8) local149.method5224(); local156 != null; local156 = (Class57_Sub8) local149.method5223()) {
							if (local156.aShortArray102 != null) {
								for (local48 = 0; local48 < local156.aShortArray102.length; local48++) {
									@Pc(172) Class74 local172 = Static228.method4210(local156.aShortArray102[local48] & 0xFFFF);
									@Pc(175) int local175 = local172.anInt2055;
									if (local172.anIntArray161 != null) {
										local172 = local172.method1997();
										if (local172 != null) {
											local175 = local172.anInt2055;
										}
									}
									if (local175 != -1) {
										@Pc(195) Class2_Sub8 local195 = new Class2_Sub8(local175);
										local195.anInt1043 = (local15 + (anInt4952 >> 6)) * 64 + local156.aByte71 - anInt4952;
										local195.anInt1037 = (local140 + (anInt4958 >> 6)) * 64 + local156.aByte70 - anInt4958;
										aClass180_34.method4909(local195);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!dr;IIII[S[B)V")
	private static void method4231(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		if (arg5 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < arg5.length; local4++) {
			@Pc(13) Class74 local13 = Static228.method4210(arg5[local4] & 0xFFFF);
			@Pc(16) int local16 = local13.anInt2070;
			if (local16 != -1) {
				@Pc(23) Class150 local23 = Static12.method176(local16);
				@Pc(47) Class46 local47 = local23.method4293(local13.aBoolean202 ? arg6[local4] >> 6 & 0x3 : 0, arg0, local13.aBoolean198 ? local13.aBoolean189 : false);
				if (local47 != null) {
					@Pc(56) int local56 = arg3 * local47.method5031() >> 2;
					@Pc(63) int local63 = arg4 * local47.method5022() >> 2;
					if (local23.aBoolean439) {
						@Pc(69) int local69 = local13.anInt2094;
						@Pc(72) int local72 = local13.anInt2048;
						if ((arg6[local4] >> 6 & 0x1) == 1) {
							@Pc(83) int local83 = local69;
							local69 = local72;
							local72 = local83;
						}
						local56 = local69 * arg3;
						local63 = local72 * arg4;
					}
					if (local56 != 0 && local63 != 0) {
						if (local23.anInt5036 == 0) {
							local47.method5021(arg1, arg2 + arg4 - local63, local56, local63);
						} else {
							local47.method5026(arg1, arg2 + arg4 - local63, local56, local63, 1, local23.anInt5036 | 0xFF000000, 1);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "()V")
	public static void method4232() {
		aByteArray65 = null;
		aByteArray68 = null;
		aShortArray90 = null;
		aByteArray67 = null;
		aByteArray66 = null;
		aShortArray89 = null;
		aByteArray64 = null;
		aClass41_30 = null;
		aClass193ArrayArrayArray2 = null;
		anIntArray390 = null;
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(II)Lclient!os;")
	public static Class2_Sub9_Sub17 method4233(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(4) Class2_Sub9_Sub17 local4 = (Class2_Sub9_Sub17) aClass41_29.method896(); local4 != null; local4 = (Class2_Sub9_Sub17) aClass41_29.method904()) {
			if (local4.aBoolean450 && local4.method4366(arg0, arg1)) {
				return local4;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V")
	public static void method4234(@OriginalArg(0) int arg0) {
		aClass2_Sub9_Sub17_2 = (Class2_Sub9_Sub17) aClass41_29.method902((long) arg0);
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(Lclient!dr;)V")
	public static void method4235(@OriginalArg(0) Class37 arg0) {
		@Pc(3) int local3 = anInt4954 - anInt4950;
		@Pc(7) int local7 = anInt4953 - anInt4959;
		@Pc(15) int local15 = (anInt4961 - anInt4960 << 16) / local3;
		@Pc(23) int local23 = (anInt4951 - anInt4955 << 16) / local7;
		method4223(arg0, local15, local23);
	}
}
