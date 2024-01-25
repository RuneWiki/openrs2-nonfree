import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!id", name = "a", descriptor = "Lclient!fb;")
	public static Class75 aClass75_3;

	@OriginalMember(owner = "client!id", name = "b", descriptor = "Lclient!tv;")
	public static Class1_Sub5_Sub18 aClass1_Sub5_Sub18_2;

	@OriginalMember(owner = "client!id", name = "c", descriptor = "Lclient!ua;")
	private static Class241 aClass241_2;

	@OriginalMember(owner = "client!id", name = "d", descriptor = "Lclient!ro;")
	public static Interface9 anInterface9_2;

	@OriginalMember(owner = "client!id", name = "f", descriptor = "Lclient!ok;")
	public static Class178 aClass178_2;

	@OriginalMember(owner = "client!id", name = "g", descriptor = "Lclient!um;")
	private static Class245 aClass245_2;

	@OriginalMember(owner = "client!id", name = "h", descriptor = "Lclient!wf;")
	public static Class263 aClass263_2;

	@OriginalMember(owner = "client!id", name = "i", descriptor = "Lclient!fo;")
	public static Class82 aClass82_32;

	@OriginalMember(owner = "client!id", name = "n", descriptor = "Lclient!hl;")
	public static Class100 aClass100_3;

	@OriginalMember(owner = "client!id", name = "o", descriptor = "F")
	public static float aFloat23;

	@OriginalMember(owner = "client!id", name = "p", descriptor = "I")
	public static int anInt2086;

	@OriginalMember(owner = "client!id", name = "q", descriptor = "F")
	public static float aFloat24;

	@OriginalMember(owner = "client!id", name = "r", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!id", name = "t", descriptor = "[I")
	private static int[] anIntArray142;

	@OriginalMember(owner = "client!id", name = "u", descriptor = "[B")
	private static byte[] aByteArray27;

	@OriginalMember(owner = "client!id", name = "v", descriptor = "[[[Lclient!wc;")
	private static Class262[][][] aClass262ArrayArrayArray2;

	@OriginalMember(owner = "client!id", name = "w", descriptor = "[S")
	private static short[] aShortArray44;

	@OriginalMember(owner = "client!id", name = "x", descriptor = "[B")
	private static byte[] aByteArray28;

	@OriginalMember(owner = "client!id", name = "y", descriptor = "[S")
	private static short[] aShortArray45;

	@OriginalMember(owner = "client!id", name = "z", descriptor = "I")
	public static int anInt2088;

	@OriginalMember(owner = "client!id", name = "A", descriptor = "Lclient!qh;")
	private static Class199 aClass199_67;

	@OriginalMember(owner = "client!id", name = "B", descriptor = "I")
	public static int anInt2089;

	@OriginalMember(owner = "client!id", name = "C", descriptor = "I")
	public static int anInt2090;

	@OriginalMember(owner = "client!id", name = "D", descriptor = "[B")
	private static byte[] aByteArray29;

	@OriginalMember(owner = "client!id", name = "E", descriptor = "I")
	public static int anInt2091;

	@OriginalMember(owner = "client!id", name = "F", descriptor = "I")
	public static int anInt2092;

	@OriginalMember(owner = "client!id", name = "G", descriptor = "I")
	public static int anInt2093;

	@OriginalMember(owner = "client!id", name = "H", descriptor = "I")
	public static int anInt2094;

	@OriginalMember(owner = "client!id", name = "I", descriptor = "I")
	public static int anInt2095;

	@OriginalMember(owner = "client!id", name = "J", descriptor = "I")
	public static int anInt2096;

	@OriginalMember(owner = "client!id", name = "K", descriptor = "I")
	public static int anInt2097;

	@OriginalMember(owner = "client!id", name = "L", descriptor = "I")
	public static int anInt2098;

	@OriginalMember(owner = "client!id", name = "M", descriptor = "I")
	public static int anInt2099;

	@OriginalMember(owner = "client!id", name = "N", descriptor = "[B")
	private static byte[] aByteArray30;

	@OriginalMember(owner = "client!id", name = "O", descriptor = "[B")
	private static byte[] aByteArray31;

	@OriginalMember(owner = "client!id", name = "e", descriptor = "Lclient!qh;")
	private static final Class199 aClass199_66 = new Class199(16);

	@OriginalMember(owner = "client!id", name = "j", descriptor = "I")
	public static int anInt2085 = (int) (Math.random() * 11.0D) - 5;

	@OriginalMember(owner = "client!id", name = "k", descriptor = "[B")
	private static final byte[] aByteArray26 = new byte[1];

	@OriginalMember(owner = "client!id", name = "l", descriptor = "[S")
	private static final short[] aShortArray43 = new short[1];

	@OriginalMember(owner = "client!id", name = "m", descriptor = "Lclient!sr;")
	public static final Class227 aClass227_15 = new Class227();

	@OriginalMember(owner = "client!id", name = "s", descriptor = "I")
	public static int anInt2087 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!za;IIII[S[B)V")
	private static void method1754(@OriginalArg(0) Class34 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		if (arg5 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < arg5.length; local4++) {
			@Pc(14) Class68 local14 = aClass75_3.method1616(arg5[local4] & 0xFFFF);
			@Pc(17) int local17 = local14.anInt1800;
			if (local17 != -1) {
				@Pc(25) Class204 local25 = aClass263_2.method5835(local17);
				@Pc(49) Class6 local49 = local25.method4502(arg0, local14.aBoolean207 ? arg6[local4] >> 6 & 0x3 : 0, local14.aBoolean209 ? local14.aBoolean217 : false);
				if (local49 != null) {
					@Pc(58) int local58 = arg3 * local49.RA() >> 2;
					@Pc(65) int local65 = arg4 * local49.Q() >> 2;
					if (local25.aBoolean650) {
						@Pc(71) int local71 = local14.anInt1810;
						@Pc(74) int local74 = local14.anInt1803;
						if ((arg6[local4] >> 6 & 0x1) == 1) {
							@Pc(85) int local85 = local71;
							local71 = local74;
							local74 = local85;
						}
						local58 = local71 * arg3;
						local65 = local74 * arg4;
					}
					if (local58 != 0 && local65 != 0) {
						if (local25.anInt5704 == 0) {
							local49.method5891(arg1, arg2 + arg4 - local65, local58, local65);
						} else {
							local49.ya(arg1, arg2 + arg4 - local65, local58, local65, 0, local25.anInt5704 | 0xFF000000, 1);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "()V")
	public static void method1755() {
		aByteArray30 = null;
		aByteArray27 = null;
		aShortArray44 = null;
		aByteArray29 = null;
		aByteArray28 = null;
		aShortArray45 = null;
		aByteArray31 = null;
		aClass199_67 = null;
		aClass262ArrayArrayArray2 = null;
		anIntArray142 = null;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!za;IIII)V")
	private static void method1756(@OriginalArg(0) Class34 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = anInt2098 - anInt2097;
		@Pc(7) int local7 = anInt2092 - anInt2090;
		if (anInt2098 < anInt2093) {
			local3++;
		}
		if (anInt2092 < anInt2094) {
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
		@Pc(173) int local173;
		@Pc(175) int local175;
		@Pc(177) int local177;
		@Pc(179) int local179;
		for (@Pc(17) int local17 = 0; local17 < local3; local17++) {
			local28 = (arg1 * local17 >> 16) + anInt2095;
			local40 = (arg1 * (local17 + 1) >> 16) + anInt2095;
			local44 = local40 - local28;
			if (local44 > 0) {
				local50 = anInt2097 + local17;
				if (local50 >= 0 && local50 < anInt2093) {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt2088 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt2088 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (local84 > 0) {
							local93 = local57 + anInt2090;
							local173 = local50 + local93 * anInt2093;
							local175 = 0;
							local177 = 0;
							local179 = 0;
							if (local93 >= 0 && local93 < anInt2094) {
								local175 = (aByteArray27[local173] & 0xFF) << 16 | aShortArray44[local173] & 0xFFFF;
								if (local175 != 0) {
									local175 |= 0xFF000000;
								}
								local177 = aByteArray29[local173] & 0xFF;
								local179 = aShortArray45[local173] & 0xFFFF;
							}
							if (local175 == 0 && local177 == 0 && local179 == 0) {
								if (aClass1_Sub5_Sub18_2.anInt6640 != -1) {
									local175 = aClass1_Sub5_Sub18_2.anInt6640 | 0xFF000000;
								} else if ((local17 + anInt2097 & 0x4) == (local57 + anInt2092 & 0x4)) {
									local175 = anIntArray142[aClass241_2.anInt6676 + 1];
								} else {
									local175 = -11840664;
								}
								if (local175 == 0) {
									local175 = -16777216;
								}
								arg0.P(local28, local70, local44, local84, local175, 0);
							} else if (local179 <= 0) {
								method1769(arg0, local28, local70, local44, local84, local175, local177, aByteArray28[local173], null, null, true);
							} else if (local179 == 65535) {
								@Pc(282) Class1_Sub15 local282 = (Class1_Sub15) aClass199_67.method4387((long) (local50 << 16 | local93));
								if (local282 != null) {
									method1769(arg0, local28, local70, local44, local84, local175, local177, aByteArray28[local173], local282.aShortArray33, local282.aByteArray14, true);
								}
							} else {
								aShortArray43[0] = (short) (local179 - 1);
								aByteArray26[0] = aByteArray31[local173];
								method1769(arg0, local28, local70, local44, local84, local175, local177, aByteArray28[local173], aShortArray43, aByteArray26, true);
							}
						}
					}
				} else {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt2088 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt2088 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (aClass1_Sub5_Sub18_2.anInt6640 != -1) {
							local93 = aClass1_Sub5_Sub18_2.anInt6640 | 0xFF000000;
						} else if ((local17 + anInt2097 & 0x4) == (local57 + anInt2092 & 0x4)) {
							local93 = anIntArray142[aClass241_2.anInt6676 + 1];
						} else {
							local93 = -11840664;
						}
						if (local93 == 0) {
							local93 = -16777216;
						}
						arg0.P(local28, local70, local44, local84, local93, 0);
					}
				}
			}
		}
		for (local28 = -16; local28 < local3 + 16; local28++) {
			local40 = (arg1 * local28 >> 16) + anInt2095;
			local44 = (arg1 * (local28 + 1) >> 16) + anInt2095;
			local50 = local44 - local40;
			if (local50 > 0) {
				local57 = local28 + anInt2097;
				if (local57 >= 0 && local57 < anInt2093) {
					for (local70 = -16; local70 < local7 + 16; local70++) {
						local80 = anInt2088 - (arg2 * (local70 + 1) >> 16);
						local84 = anInt2088 - (arg2 * local70 >> 16);
						local93 = local84 - local80;
						if (local93 > 0) {
							local173 = local70 + anInt2090;
							if (local173 >= 0 && local173 < anInt2094) {
								local175 = aShortArray45[local57 + local173 * anInt2093] & 0xFFFF;
								if (local175 <= 0) {
									method1754(arg0, local40, local80, local50, local93, null, null);
								} else if (local175 == 65535) {
									@Pc(459) Class1_Sub15 local459 = (Class1_Sub15) aClass199_67.method4387((long) (local57 << 16 | local173));
									if (local459 != null) {
										method1754(arg0, local40, local80, local50, local93, local459.aShortArray33, local459.aByteArray14);
									}
								} else {
									aShortArray43[0] = (short) (local175 - 1);
									aByteArray26[0] = aByteArray31[local57 + local173 * anInt2093];
									method1754(arg0, local40, local80, local50, local93, aShortArray43, aByteArray26);
								}
							}
						}
					}
				}
			}
		}
		local40 = anInt2097 >> 6;
		local44 = anInt2090 >> 6;
		if (local40 < 0) {
			local40 = 0;
		}
		if (local44 < 0) {
			local44 = 0;
		}
		local50 = anInt2098 >> 6;
		local57 = anInt2092 >> 6;
		if (local50 >= aClass262ArrayArrayArray2[0].length) {
			local50 = aClass262ArrayArrayArray2[0].length - 1;
		}
		if (local57 >= aClass262ArrayArrayArray2[0][0].length) {
			local57 = aClass262ArrayArrayArray2[0][0].length - 1;
		}
		for (local70 = 0; local70 < 3; local70++) {
			@Pc(641) int local641;
			@Pc(653) int local653;
			@Pc(665) int local665;
			@Pc(675) int local675;
			@Pc(631) int local631;
			for (local80 = local40; local80 <= local50; local80++) {
				for (local84 = local44; local84 <= local57; local84++) {
					@Pc(589) Class262 local589 = aClass262ArrayArrayArray2[local70][local80][local84];
					if (local589 != null) {
						local173 = (local80 + (anInt2089 >> 6)) * 64;
						local175 = (local84 + (anInt2099 >> 6)) * 64;
						for (@Pc(612) Class4_Sub4 local612 = (Class4_Sub4) local589.method5819(); local612 != null; local612 = (Class4_Sub4) local589.method5813()) {
							local179 = local173 + local612.aByte75 - anInt2089 - anInt2097;
							local631 = local175 + local612.aByte77 - anInt2099 - anInt2090;
							local641 = (arg1 * local179 >> 16) + anInt2095;
							local653 = (arg1 * (local179 + 1) >> 16) + anInt2095;
							local665 = anInt2088 - (arg2 * (local631 + 1) >> 16);
							local675 = anInt2088 - (arg2 * local631 >> 16);
							method1769(arg0, local641, local665, local653 - local641, local675 - local665, local612.anInt4870, local612.aByte76 & 0xFF, local612.aByte78, local612.aShortArray74, local612.aByteArray57, false);
						}
					}
				}
			}
			for (local84 = local40; local84 <= local50; local84++) {
				for (local93 = local44; local93 <= local57; local93++) {
					@Pc(727) Class262 local727 = aClass262ArrayArrayArray2[local70][local84][local93];
					if (local727 != null) {
						local175 = (local84 + (anInt2089 >> 6)) * 64;
						local177 = (local93 + (anInt2099 >> 6)) * 64;
						for (@Pc(750) Class4_Sub4 local750 = (Class4_Sub4) local727.method5819(); local750 != null; local750 = (Class4_Sub4) local727.method5813()) {
							local631 = local175 + local750.aByte75 - anInt2089 - anInt2097;
							local641 = local177 + local750.aByte77 - anInt2099 - anInt2090;
							local653 = (arg1 * local631 >> 16) + anInt2095;
							local665 = (arg1 * (local631 + 1) >> 16) + anInt2095;
							local675 = anInt2088 - (arg2 * (local641 + 1) >> 16);
							@Pc(813) int local813 = anInt2088 - (arg2 * local641 >> 16);
							method1754(arg0, local653, local675, local665 - local653, local813 - local675, local750.aShortArray74, local750.aByteArray57);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!za;II)V")
	public static void method1757(@OriginalArg(0) Class34 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class1_Sub28 local9 = new Class1_Sub28(aClass82_32.method1819(aClass1_Sub5_Sub18_2.aString70, "area"));
		@Pc(13) int local13 = local9.method5337();
		@Pc(16) int[] local16 = new int[local13];
		for (@Pc(18) int local18 = 0; local18 < local13; local18++) {
			local16[local18] = local9.method5337();
		}
		@Pc(33) int local33 = local9.method5337();
		@Pc(36) int[] local36 = new int[local33];
		for (@Pc(38) int local38 = 0; local38 < local33; local38++) {
			local36[local38] = local9.method5337();
		}
		while (true) {
			@Pc(58) int local58;
			@Pc(64) int local64;
			@Pc(67) int local67;
			@Pc(76) int local76;
			@Pc(148) int local148;
			while (local9.anInt6812 < local9.aByteArray86.length) {
				@Pc(62) int local62;
				@Pc(84) int local84;
				if (local9.method5337() == 0) {
					local58 = local9.method5337();
					local62 = local9.method5337();
					for (local64 = 0; local64 < 64; local64++) {
						for (local67 = 0; local67 < 64; local67++) {
							local76 = local58 * 64 + local64 - anInt2089;
							local84 = local62 * 64 + local67 - anInt2099;
							method1772(arg0, local9, local58, local62, local76, local84, local16, local36);
						}
					}
				} else {
					local58 = local9.method5337();
					local62 = local9.method5337();
					local64 = local9.method5337();
					local67 = local9.method5337();
					for (local76 = 0; local76 < 8; local76++) {
						for (local84 = 0; local84 < 8; local84++) {
							@Pc(136) int local136 = local58 * 64 + local64 * 8 + local76 - anInt2089;
							local148 = local62 * 64 + local67 * 8 + local84 - anInt2099;
							method1772(arg0, local9, local58, local62, local136, local148, local16, local36);
						}
					}
				}
			}
			aByteArray27 = new byte[anInt2093 * anInt2094];
			aShortArray44 = new short[anInt2093 * anInt2094];
			for (local58 = 0; local58 < 3; local58++) {
				@Pc(191) byte[] local191 = new byte[anInt2093 * anInt2094];
				for (local64 = 0; local64 < aClass262ArrayArrayArray2[local58].length; local64++) {
					for (local67 = 0; local67 < aClass262ArrayArrayArray2[local58][0].length; local67++) {
						@Pc(205) Class262 local205 = aClass262ArrayArrayArray2[local58][local64][local67];
						if (local205 != null) {
							for (@Pc(212) Class4_Sub4 local212 = (Class4_Sub4) local205.method5819(); local212 != null; local212 = (Class4_Sub4) local205.method5813()) {
								local191[local64 * 64 + local212.aByte75 + (local67 * 64 + local212.aByte77) * anInt2093] = (byte) local212.anInt4870;
							}
						}
					}
				}
				method1773(local191, aByteArray27, aShortArray44, arg1, arg2);
				for (local67 = 0; local67 < aClass262ArrayArrayArray2[local58].length; local67++) {
					for (local76 = 0; local76 < aClass262ArrayArrayArray2[local58][0].length; local76++) {
						@Pc(276) Class262 local276 = aClass262ArrayArrayArray2[local58][local67][local76];
						if (local276 != null) {
							for (@Pc(283) Class4_Sub4 local283 = (Class4_Sub4) local276.method5819(); local283 != null; local283 = (Class4_Sub4) local276.method5813()) {
								local148 = local67 * 64 + local283.aByte75 + (local76 * 64 + local283.aByte77) * anInt2093;
								local283.anInt4870 = (aByteArray27[local148] & 0xFF) << 16 | aShortArray44[local148] & 0xFFFF;
								if (local283.anInt4870 != 0) {
									local283.anInt4870 |= 0xFF000000;
								}
							}
						}
					}
				}
			}
			method1773(aByteArray30, aByteArray27, aShortArray44, arg1, arg2);
			aByteArray30 = null;
			method1761();
			return;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
	public static void method1758(@OriginalArg(0) int arg0) {
		aClass1_Sub5_Sub18_2 = (Class1_Sub5_Sub18) aClass199_66.method4387((long) arg0);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!za;Lclient!ql;IIII)V")
	private static void method1759(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class1_Sub36 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		arg1.anInt5631 = anInt2095 + (arg2 * (arg1.anInt5636 - anInt2097) >> 16);
		arg1.anInt5635 = anInt2088 - (arg3 * (arg1.anInt5634 - anInt2090) >> 16);
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(I)Lclient!tv;")
	public static Class1_Sub5_Sub18 method1760(@OriginalArg(0) int arg0) {
		return (Class1_Sub5_Sub18) aClass199_66.method4387((long) arg0);
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "()V")
	private static void method1761() {
		@Pc(4) int local4;
		@Pc(15) int local15;
		@Pc(49) int local49;
		for (@Pc(1) int local1 = 0; local1 < anInt2093; local1++) {
			for (local4 = 0; local4 < anInt2094; local4++) {
				local15 = aShortArray45[local1 + local4 * anInt2093] & 0xFFFF;
				if (local15 != 0) {
					@Pc(35) int local35;
					if (local15 == 65535) {
						@Pc(31) Class1_Sub15 local31 = (Class1_Sub15) aClass199_67.method4387((long) (local1 << 16 | local4));
						if (local31 != null) {
							for (local35 = 0; local35 < local31.aShortArray33.length; local35++) {
								@Pc(46) Class68 local46 = aClass75_3.method1616(local31.aShortArray33[local35] & 0xFFFF);
								local49 = local46.anInt1808;
								if (local46.anIntArray125 != null) {
									local46 = local46.method1535(anInterface9_2);
									if (local46 != null) {
										local49 = local46.anInt1808;
									}
								}
								if (local49 != -1) {
									@Pc(70) Class1_Sub36 local70 = new Class1_Sub36(local49);
									local70.anInt5636 = local1;
									local70.anInt5634 = local4;
									aClass227_15.method4972(local70);
								}
							}
						}
					} else {
						@Pc(94) Class68 local94 = aClass75_3.method1616(local15 - 1);
						local35 = local94.anInt1808;
						if (local94.anIntArray125 != null) {
							local94 = local94.method1535(anInterface9_2);
							if (local94 != null) {
								local35 = local94.anInt1808;
							}
						}
						if (local35 != -1) {
							@Pc(118) Class1_Sub36 local118 = new Class1_Sub36(local35);
							local118.anInt5636 = local1;
							local118.anInt5634 = local4;
							aClass227_15.method4972(local118);
						}
					}
				}
			}
		}
		for (local4 = 0; local4 < 3; local4++) {
			for (local15 = 0; local15 < aClass262ArrayArrayArray2[0].length; local15++) {
				for (@Pc(144) int local144 = 0; local144 < aClass262ArrayArrayArray2[0][0].length; local144++) {
					@Pc(153) Class262 local153 = aClass262ArrayArrayArray2[local4][local15][local144];
					if (local153 != null) {
						for (@Pc(160) Class4_Sub4 local160 = (Class4_Sub4) local153.method5819(); local160 != null; local160 = (Class4_Sub4) local153.method5813()) {
							if (local160.aShortArray74 != null) {
								for (local49 = 0; local49 < local160.aShortArray74.length; local49++) {
									@Pc(177) Class68 local177 = aClass75_3.method1616(local160.aShortArray74[local49] & 0xFFFF);
									@Pc(180) int local180 = local177.anInt1808;
									if (local177.anIntArray125 != null) {
										local177 = local177.method1535(anInterface9_2);
										if (local177 != null) {
											local180 = local177.anInt1808;
										}
									}
									if (local180 != -1) {
										@Pc(201) Class1_Sub36 local201 = new Class1_Sub36(local180);
										local201.anInt5636 = (local15 + (anInt2089 >> 6)) * 64 + local160.aByte75 - anInt2089;
										local201.anInt5634 = (local144 + (anInt2099 >> 6)) * 64 + local160.aByte77 - anInt2099;
										aClass227_15.method4972(local201);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!fo;Lclient!ua;Lclient!um;Lclient!fb;Lclient!ok;Lclient!wf;Lclient!ro;)V")
	public static void method1762(@OriginalArg(0) Class82 arg0, @OriginalArg(1) Class241 arg1, @OriginalArg(2) Class245 arg2, @OriginalArg(3) Class75 arg3, @OriginalArg(4) Class178 arg4, @OriginalArg(5) Class263 arg5, @OriginalArg(6) Interface9 arg6) {
		aClass82_32 = arg0;
		aClass241_2 = arg1;
		aClass245_2 = arg2;
		aClass75_3 = arg3;
		aClass178_2 = arg4;
		aClass263_2 = arg5;
		anInterface9_2 = arg6;
		aClass199_66.method4385();
		@Pc(21) int local21 = aClass82_32.method1835("details");
		@Pc(26) int[] local26 = aClass82_32.method1839(local21);
		if (local26 != null) {
			for (@Pc(30) int local30 = 0; local30 < local26.length; local30++) {
				@Pc(39) Class1_Sub5_Sub18 local39 = Static61.method1290(local21, local26[local30], aClass82_32);
				aClass199_66.method4383((long) local39.anInt6637, local39);
			}
		}
		Static182.method2647(true, false);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!za;)V")
	public static void method1763(@OriginalArg(0) Class34 arg0) {
		@Pc(3) int local3 = anInt2098 - anInt2097;
		@Pc(7) int local7 = anInt2092 - anInt2090;
		@Pc(15) int local15 = (anInt2096 - anInt2095 << 16) / local3;
		@Pc(23) int local23 = (anInt2088 - anInt2091 << 16) / local7;
		method1756(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(Lclient!za;IIII)Lclient!sr;")
	private static Class227 method1764(@OriginalArg(0) Class34 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(4) Class1_Sub36 local4 = (Class1_Sub36) aClass227_15.method4967(); local4 != null; local4 = (Class1_Sub36) aClass227_15.method4973()) {
			method1759(arg0, local4, arg1, arg2);
		}
		return aClass227_15;
	}

	@OriginalMember(owner = "client!id", name = "c", descriptor = "()V")
	public static void method1765() {
		@Pc(2) int[] local2 = new int[3];
		for (@Pc(4) int local4 = 0; local4 < aClass100_3.anInt2592; local4++) {
			@Pc(32) boolean local32 = aClass1_Sub5_Sub18_2.method5197(aClass100_3.anIntArray177[local4] >> 28 & 0x3, aClass100_3.anIntArray177[local4] & 0x3FFF, local2, aClass100_3.anIntArray177[local4] >> 14 & 0x3FFF);
			if (local32) {
				@Pc(42) Class1_Sub36 local42 = new Class1_Sub36(aClass100_3.anIntArray176[local4]);
				local42.anInt5636 = local2[1] - anInt2089;
				local42.anInt5634 = local2[2] - anInt2099;
				aClass227_15.method4972(local42);
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!l;III)I")
	private static int method1767(@OriginalArg(0) Interface6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class258 local4 = aClass241_2.method5222(arg1);
		if (local4 == null) {
			return 0;
		}
		@Pc(11) int local11 = local4.anInt7322;
		if (local11 >= 0 && arg0.method3937(local11).aBoolean340) {
			local11 = -1;
		}
		@Pc(68) int local68;
		@Pc(27) int local27;
		@Pc(33) int local33;
		@Pc(55) int local55;
		if (local4.anInt7326 >= 0) {
			local27 = local4.anInt7326;
			local33 = (local27 & 0x7F) + arg3;
			if (local33 < 0) {
				local33 = 0;
			} else if (local33 > 127) {
				local33 = 127;
			}
			local55 = (local27 + arg2 & 0xFC00) + (local27 & 0x380) + local33;
			local68 = Static134.anIntArray161[Static140.method2138(Static82.method5960(local55)) & 0xFFFF] | 0xFF000000;
		} else if (local11 >= 0) {
			local68 = Static134.anIntArray161[Static140.method2138(Static82.method5960(arg0.method3937(local11).aShort37)) & 0xFFFF] | 0xFF000000;
		} else if (local4.anInt7321 == -1) {
			local68 = 0;
		} else {
			local27 = local4.anInt7321;
			local33 = (local27 & 0x7F) + arg3;
			if (local33 < 0) {
				local33 = 0;
			} else if (local33 > 127) {
				local33 = 127;
			}
			local55 = (local27 + arg2 & 0xFC00) + (local27 & 0x380) + local33;
			local68 = Static134.anIntArray161[Static140.method2138(Static82.method5960(local55)) & 0xFFFF] | 0xFF000000;
		}
		return local68;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!l;II)V")
	public static void method1768(@OriginalArg(0) Interface6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < aClass241_2.anInt6674; local1++) {
			anIntArray142[local1 + 1] = method1767(arg0, local1, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!za;IIIIIII[S[BZ)V")
	private static void method1769(@OriginalArg(0) Class34 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) byte[] arg9, @OriginalArg(10) boolean arg10) {
		@Pc(20) int local20;
		@Pc(32) int local32;
		if (arg10 || arg5 != 0 || arg6 > 0) {
			if (arg6 == 0) {
				arg0.P(arg1, arg2, arg3, arg4, arg5, 0);
			} else {
				local20 = arg7 & 0x3F;
				if (local20 == 0 || arg3 <= 1 || arg4 <= 1) {
					local32 = anIntArray142[arg6];
					if (arg10 || local32 != 0) {
						arg0.P(arg1, arg2, arg3, arg4, local32, 0);
					}
				} else {
					local32 = arg10 ? 0 : 1;
					Static327.method4388(aByteArrayArrayArray6, arg5, arg0, arg1, local20, local32, arg2, arg7 >> 6 & 0x3, anIntArray142[arg6], anInt2086, arg4, arg3);
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
				@Pc(127) Class68 local127 = aClass75_3.method1616(arg8[local100] & 0xFFFF);
				if (local127.anInt1800 == -1) {
					@Pc(133) int local133 = -3355444;
					if (local127.anInt1821 == 1) {
						local133 = -3407872;
					}
					@Pc(147) int local147 = arg9[local100] >> 6 & 0x3;
					if (local107 == 0) {
						if (local147 == 0) {
							arg0.IA(arg1, arg2, arg4, local133, 0);
						} else if (local147 == 1) {
							arg0.ma(arg1, arg2, arg3, local133, 0);
						} else if (local147 == 2) {
							arg0.IA(local20, arg2, arg4, local133, 0);
						} else {
							arg0.ma(arg1, local32, arg3, local133, 0);
						}
					} else if (local107 == 2) {
						if (local147 == 0) {
							arg0.IA(arg1, arg2, arg4, -1, 0);
							arg0.ma(arg1, arg2, arg3, local133, 0);
						} else if (local147 == 1) {
							arg0.IA(local20, arg2, arg4, -1, 0);
							arg0.ma(arg1, arg2, arg3, local133, 0);
						} else if (local147 == 2) {
							arg0.IA(local20, arg2, arg4, -1, 0);
							arg0.ma(arg1, local32, arg3, local133, 0);
						} else {
							arg0.IA(arg1, arg2, arg4, -1, 0);
							arg0.ma(arg1, local32, arg3, local133, 0);
						}
					} else if (local107 == 3) {
						if (local147 == 0) {
							arg0.ma(arg1, arg2, 1, local133, 0);
						} else if (local147 == 1) {
							arg0.ma(local20, arg2, 1, local133, 0);
						} else if (local147 == 2) {
							arg0.ma(local20, local32, 1, local133, 0);
						} else {
							arg0.ma(arg1, local32, 1, local133, 0);
						}
					} else if (local107 == 9) {
						@Pc(313) int local313;
						if (local147 == 0 || local147 == 2) {
							for (local313 = 0; local313 < arg4; local313++) {
								arg0.ma(arg1 + local313, local32 - local313, 1, local133, 0);
							}
						} else {
							for (local313 = 0; local313 < arg4; local313++) {
								arg0.ma(arg1 + local313, arg2 + local313, 1, local133, 0);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "e", descriptor = "()V")
	public static void method1770() {
		aByteArray30 = new byte[anInt2093 * anInt2094];
		aByteArray29 = new byte[anInt2093 * anInt2094];
		aByteArray28 = new byte[anInt2093 * anInt2094];
		aShortArray45 = new short[anInt2093 * anInt2094];
		aByteArray31 = new byte[anInt2093 * anInt2094];
		aClass199_67 = new Class199(1024);
		aClass262ArrayArrayArray2 = new Class262[3][anInt2093 >> 6][anInt2094 >> 6];
		anIntArray142 = new int[aClass241_2.anInt6674 + 1];
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(Lclient!za;)Lclient!sr;")
	public static Class227 method1771(@OriginalArg(0) Class34 arg0) {
		@Pc(3) int local3 = anInt2098 - anInt2097;
		@Pc(7) int local7 = anInt2092 - anInt2090;
		@Pc(15) int local15 = (anInt2096 - anInt2095 << 16) / local3;
		@Pc(23) int local23 = (anInt2088 - anInt2091 << 16) / local7;
		return method1764(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!za;Lclient!ug;IIII[I[I)V")
	private static void method1772(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class1_Sub28 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7) {
		@Pc(3) int local3 = arg1.method5337();
		if ((local3 & 0x1) == 0) {
			@Pc(15) boolean local15 = (local3 & 0x2) == 0;
			@Pc(21) int local21 = local3 >> 2 & 0x3F;
			if (local21 != 62) {
				if (local21 == 63) {
					local21 = arg1.method5337();
				} else if (local15) {
					local21 = arg6[local21];
				} else {
					local21 = arg7[local21];
				}
				if (local15) {
					aByteArray30[arg4 + arg5 * anInt2093] = (byte) local21;
					aByteArray29[arg4 + arg5 * anInt2093] = 0;
				} else {
					aByteArray29[arg4 + arg5 * anInt2093] = (byte) local21;
					aByteArray28[arg4 + arg5 * anInt2093] = 0;
					aByteArray30[arg4 + arg5 * anInt2093] = arg1.method5367();
				}
			}
			return;
		}
		@Pc(100) int local100 = (local3 >> 1 & 0x3) + 1;
		@Pc(108) boolean local108 = (local3 & 0x8) != 0;
		@Pc(116) boolean local116 = (local3 & 0x10) != 0;
		for (@Pc(118) int local118 = 0; local118 < local100; local118++) {
			@Pc(123) int local123 = arg1.method5337();
			@Pc(125) int local125 = 0;
			@Pc(127) int local127 = 0;
			if (local108) {
				local125 = arg1.method5337();
				local127 = arg1.method5337();
			}
			@Pc(139) int local139 = 0;
			if (local116) {
				local139 = arg1.method5337();
			}
			@Pc(215) short[] local215;
			@Pc(218) byte[] local218;
			@Pc(220) int local220;
			if (local118 == 0) {
				aByteArray30[arg4 + arg5 * anInt2093] = (byte) local123;
				aByteArray29[arg4 + arg5 * anInt2093] = (byte) local125;
				aByteArray28[arg4 + arg5 * anInt2093] = (byte) local127;
				if (local139 == 1) {
					aShortArray45[arg4 + arg5 * anInt2093] = (short) (arg1.method5335() + 1);
					aByteArray31[arg4 + arg5 * anInt2093] = arg1.method5367();
				} else if (local139 > 1) {
					aShortArray45[arg4 + arg5 * anInt2093] = -1;
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method5335();
						local218[local220] = arg1.method5367();
					}
					aClass199_67.method4383((long) (arg4 << 16 | arg5), new Class1_Sub15(local215, local218));
				}
			} else {
				local215 = null;
				local218 = null;
				if (local139 > 0) {
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method5335();
						local218[local220] = arg1.method5367();
					}
				}
				if (aClass262ArrayArrayArray2[local118 - 1][arg2 - (anInt2089 >> 6)][arg3 - (anInt2099 >> 6)] == null) {
					aClass262ArrayArrayArray2[local118 - 1][arg2 - (anInt2089 >> 6)][arg3 - (anInt2099 >> 6)] = new Class262();
				}
				@Pc(338) Class4_Sub4 local338 = new Class4_Sub4(arg4 & 0x3F, arg5 & 0x3F, local123, local125, local127, local215, local218);
				aClass262ArrayArrayArray2[local118 - 1][arg2 - (anInt2089 >> 6)][arg3 - (anInt2099 >> 6)].method5815(local338);
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "([B[B[SII)V")
	private static void method1773(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int[] local2 = new int[anInt2094];
		@Pc(5) int[] local5 = new int[anInt2094];
		@Pc(8) int[] local8 = new int[anInt2094];
		@Pc(11) int[] local11 = new int[anInt2094];
		@Pc(14) int[] local14 = new int[anInt2094];
		for (@Pc(16) int local16 = -5; local16 < anInt2093; local16++) {
			@Pc(21) int local21 = local16 + 5;
			@Pc(25) int local25 = local16 - 5;
			@Pc(41) int local41;
			for (@Pc(27) int local27 = 0; local27 < anInt2094; local27++) {
				@Pc(50) Class91 local50;
				@Pc(86) int local86;
				if (local21 < anInt2093) {
					local41 = arg0[local21 + local27 * anInt2093] & 0xFF;
					if (local41 > 0) {
						local50 = aClass245_2.method5325(local41 - 1);
						local2[local27] += local50.anInt2356;
						local5[local27] += local50.anInt2358;
						local8[local27] += local50.anInt2362;
						local11[local27] += local50.anInt2357;
						local86 = local14[local27]++;
					}
				}
				if (local25 >= 0) {
					local41 = arg0[local25 + local27 * anInt2093] & 0xFF;
					if (local41 > 0) {
						local50 = aClass245_2.method5325(local41 - 1);
						local2[local27] -= local50.anInt2356;
						local5[local27] -= local50.anInt2358;
						local8[local27] -= local50.anInt2362;
						local11[local27] -= local50.anInt2357;
						local86 = local14[local27]--;
					}
				}
			}
			if (local16 >= 0) {
				local41 = 0;
				@Pc(159) int local159 = 0;
				@Pc(161) int local161 = 0;
				@Pc(163) int local163 = 0;
				@Pc(165) int local165 = 0;
				for (@Pc(167) int local167 = -5; local167 < anInt2094; local167++) {
					@Pc(172) int local172 = local167 + 5;
					if (local172 < anInt2094) {
						local41 += local2[local172];
						local159 += local5[local172];
						local161 += local8[local172];
						local163 += local11[local172];
						local165 += local14[local172];
					}
					@Pc(209) int local209 = local167 - 5;
					if (local209 >= 0) {
						local41 -= local2[local209];
						local159 -= local5[local209];
						local161 -= local8[local209];
						local163 -= local11[local209];
						local165 -= local14[local209];
					}
					if (local167 >= 0 && local165 > 0) {
						@Pc(261) int local261;
						if ((arg0[local16 + local167 * anInt2093] & 0xFF) == 0) {
							local261 = local16 + local167 * anInt2093;
							arg1[local261] = 0;
							arg2[local261] = 0;
						} else {
							local261 = local163 == 0 ? 0 : Static417.method5541(local159 / local165, local161 / local165, local41 * 256 / local163);
							@Pc(294) int local294 = (local261 & 0x7F) + arg4;
							if (local294 < 0) {
								local294 = 0;
							} else if (local294 > 127) {
								local294 = 127;
							}
							@Pc(316) int local316 = (local261 + arg3 & 0xFC00) + (local261 & 0x380) + local294;
							@Pc(322) int local322 = local16 + local167 * anInt2093;
							@Pc(333) int local333 = Static134.anIntArray161[Static140.method2138(Static454.method5921(local316)) & 0xFFFF];
							arg1[local322] = (byte) (local333 >> 16 & 0xFF);
							arg2[local322] = (short) (local333 & 0xFFFF);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(II)Lclient!so;")
	public static Class225 method1774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class225 local3 = new Class225();
		for (@Pc(8) Class1_Sub5_Sub18 local8 = (Class1_Sub5_Sub18) aClass199_66.method4392(); local8 != null; local8 = (Class1_Sub5_Sub18) aClass199_66.method4393()) {
			if (local8.aBoolean730 && local8.method5205(arg0, arg1)) {
				local3.method4943(local8);
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1775(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		anInt2097 = arg0 - anInt2089;
		anInt2092 = arg1 - anInt2099;
		anInt2098 = arg2 - anInt2089;
		anInt2090 = arg3 - anInt2099;
		anInt2095 = arg4;
		anInt2091 = arg5;
		anInt2096 = arg6;
		anInt2088 = arg7;
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(II)Lclient!tv;")
	public static Class1_Sub5_Sub18 method1776(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(4) Class1_Sub5_Sub18 local4 = (Class1_Sub5_Sub18) aClass199_66.method4392(); local4 != null; local4 = (Class1_Sub5_Sub18) aClass199_66.method4393()) {
			if (local4.aBoolean730 && local4.method5205(arg0, arg1)) {
				return local4;
			}
		}
		return null;
	}
}
