import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!db", name = "a", descriptor = "Lclient!tj;")
	public static Class193 aClass193_80;

	@OriginalMember(owner = "client!db", name = "c", descriptor = "Lclient!ne;")
	public static Class4_Sub4_Sub11 aClass4_Sub4_Sub11_3;

	@OriginalMember(owner = "client!db", name = "d", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!db", name = "e", descriptor = "Lclient!na;")
	public static Class137 aClass137_3;

	@OriginalMember(owner = "client!db", name = "f", descriptor = "I")
	public static int anInt4735;

	@OriginalMember(owner = "client!db", name = "h", descriptor = "F")
	public static float aFloat69;

	@OriginalMember(owner = "client!db", name = "k", descriptor = "F")
	public static float aFloat70;

	@OriginalMember(owner = "client!db", name = "n", descriptor = "I")
	public static int anInt4738;

	@OriginalMember(owner = "client!db", name = "o", descriptor = "I")
	public static int anInt4739;

	@OriginalMember(owner = "client!db", name = "p", descriptor = "[B")
	private static byte[] aByteArray61;

	@OriginalMember(owner = "client!db", name = "q", descriptor = "[B")
	private static byte[] aByteArray62;

	@OriginalMember(owner = "client!db", name = "r", descriptor = "[[[Lclient!cl;")
	private static Class32[][][] aClass32ArrayArrayArray2;

	@OriginalMember(owner = "client!db", name = "s", descriptor = "I")
	public static int anInt4740;

	@OriginalMember(owner = "client!db", name = "t", descriptor = "I")
	public static int anInt4741;

	@OriginalMember(owner = "client!db", name = "u", descriptor = "I")
	public static int anInt4742;

	@OriginalMember(owner = "client!db", name = "v", descriptor = "I")
	public static int anInt4743;

	@OriginalMember(owner = "client!db", name = "w", descriptor = "[S")
	private static short[] aShortArray67;

	@OriginalMember(owner = "client!db", name = "x", descriptor = "I")
	public static int anInt4744;

	@OriginalMember(owner = "client!db", name = "y", descriptor = "[I")
	private static int[] anIntArray394;

	@OriginalMember(owner = "client!db", name = "z", descriptor = "I")
	public static int anInt4745;

	@OriginalMember(owner = "client!db", name = "A", descriptor = "[B")
	private static byte[] aByteArray63;

	@OriginalMember(owner = "client!db", name = "B", descriptor = "Lclient!dj;")
	private static Class43 aClass43_28;

	@OriginalMember(owner = "client!db", name = "C", descriptor = "I")
	public static int anInt4746;

	@OriginalMember(owner = "client!db", name = "D", descriptor = "[B")
	private static byte[] aByteArray64;

	@OriginalMember(owner = "client!db", name = "E", descriptor = "[B")
	private static byte[] aByteArray65;

	@OriginalMember(owner = "client!db", name = "F", descriptor = "I")
	public static int anInt4747;

	@OriginalMember(owner = "client!db", name = "G", descriptor = "I")
	public static int anInt4748;

	@OriginalMember(owner = "client!db", name = "H", descriptor = "I")
	public static int anInt4749;

	@OriginalMember(owner = "client!db", name = "J", descriptor = "[S")
	private static short[] aShortArray68;

	@OriginalMember(owner = "client!db", name = "b", descriptor = "Lclient!dj;")
	private static final Class43 aClass43_27 = new Class43(16);

	@OriginalMember(owner = "client!db", name = "g", descriptor = "I")
	public static int anInt4736 = (int) (Math.random() * 11.0D) - 5;

	@OriginalMember(owner = "client!db", name = "i", descriptor = "[B")
	private static final byte[] aByteArray60 = new byte[1];

	@OriginalMember(owner = "client!db", name = "j", descriptor = "I")
	public static int anInt4737 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!db", name = "l", descriptor = "Lclient!kn;")
	public static final Class116 aClass116_40 = new Class116();

	@OriginalMember(owner = "client!db", name = "m", descriptor = "[S")
	private static final short[] aShortArray66 = new short[1];

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		anInt4744 = arg0 - anInt4745;
		anInt4741 = arg1 - anInt4748;
		anInt4746 = arg2 - anInt4745;
		anInt4739 = arg3 - anInt4748;
		anInt4743 = arg4;
		anInt4738 = arg5;
		anInt4740 = arg6;
		anInt4742 = arg7;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!vq;IIIIIII[S[BZ)V")
	private static void method4156(@OriginalArg(0) Class47 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) byte[] arg9, @OriginalArg(10) boolean arg10) {
		@Pc(20) int local20;
		@Pc(32) int local32;
		if (arg10 || arg5 != 0 || arg6 > 0) {
			if (arg6 == 0) {
				arg0.method2682(arg1, arg2, arg3, arg4, arg5, 0);
			} else {
				local20 = arg7 & 0x3F;
				if (local20 == 0 || arg3 <= 1 || arg4 <= 1) {
					local32 = anIntArray394[arg6];
					if (arg10 || local32 != 0) {
						arg0.method2682(arg1, arg2, arg3, arg4, local32, 0);
					}
				} else {
					local32 = arg10 ? 0 : 1;
					Static321.method4238(arg7 >> 6 & 0x3, local32, local20, arg1, aByteArrayArrayArray11, arg5, anInt4735, anIntArray394[arg6], arg4, arg2, arg0, arg3);
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
				@Pc(126) Class18 local126 = Static113.method2380(arg8[local100] & 0xFFFF);
				if (local126.anInt525 == -1) {
					@Pc(132) int local132 = -3355444;
					if (local126.anInt503 == 1) {
						local132 = -3407872;
					}
					@Pc(146) int local146 = arg9[local100] >> 6 & 0x3;
					if (local107 == 0) {
						if (local146 == 0) {
							arg0.method2724(arg1, arg2, arg4, local132, 0);
						} else if (local146 == 1) {
							arg0.method2707(arg1, arg2, arg3, local132, 0);
						} else if (local146 == 2) {
							arg0.method2724(local20, arg2, arg4, local132, 0);
						} else {
							arg0.method2707(arg1, local32, arg3, local132, 0);
						}
					} else if (local107 == 2) {
						if (local146 == 0) {
							arg0.method2724(arg1, arg2, arg4, -1, 0);
							arg0.method2707(arg1, arg2, arg3, local132, 0);
						} else if (local146 == 1) {
							arg0.method2724(local20, arg2, arg4, -1, 0);
							arg0.method2707(arg1, arg2, arg3, local132, 0);
						} else if (local146 == 2) {
							arg0.method2724(local20, arg2, arg4, -1, 0);
							arg0.method2707(arg1, local32, arg3, local132, 0);
						} else {
							arg0.method2724(arg1, arg2, arg4, -1, 0);
							arg0.method2707(arg1, local32, arg3, local132, 0);
						}
					} else if (local107 == 3) {
						if (local146 == 0) {
							arg0.method2707(arg1, arg2, 1, local132, 0);
						} else if (local146 == 1) {
							arg0.method2707(local20, arg2, 1, local132, 0);
						} else if (local146 == 2) {
							arg0.method2707(local20, local32, 1, local132, 0);
						} else {
							arg0.method2707(arg1, local32, 1, local132, 0);
						}
					} else if (local107 == 9) {
						@Pc(312) int local312;
						if (local146 == 0 || local146 == 2) {
							for (local312 = 0; local312 < arg4; local312++) {
								arg0.method2707(arg1 + local312, local32 - local312, 1, local132, 0);
							}
						} else {
							for (local312 = 0; local312 < arg4; local312++) {
								arg0.method2707(arg1 + local312, arg2 + local312, 1, local132, 0);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "()V")
	public static void method4157() {
		aByteArray62 = null;
		aByteArray65 = null;
		aShortArray68 = null;
		aByteArray64 = null;
		aByteArray61 = null;
		aShortArray67 = null;
		aByteArray63 = null;
		aClass43_28 = null;
		aClass32ArrayArrayArray2 = null;
		anIntArray394 = null;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!vq;Lclient!lf;IIII[I[I)V")
	private static void method4158(@OriginalArg(0) Class47 arg0, @OriginalArg(1) Class4_Sub11 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7) {
		@Pc(3) int local3 = arg1.method3440();
		if ((local3 & 0x1) == 0) {
			@Pc(15) boolean local15 = (local3 & 0x2) == 0;
			@Pc(21) int local21 = local3 >> 2 & 0x3F;
			if (local21 != 62) {
				if (local21 == 63) {
					local21 = arg1.method3440();
				} else if (local15) {
					local21 = arg6[local21];
				} else {
					local21 = arg7[local21];
				}
				if (local15) {
					aByteArray62[arg4 + arg5 * anInt4749] = (byte) local21;
					aByteArray64[arg4 + arg5 * anInt4749] = 0;
				} else {
					aByteArray64[arg4 + arg5 * anInt4749] = (byte) local21;
					aByteArray61[arg4 + arg5 * anInt4749] = 0;
					aByteArray62[arg4 + arg5 * anInt4749] = arg1.method3426();
				}
			}
			return;
		}
		@Pc(100) int local100 = (local3 >> 1 & 0x3) + 1;
		@Pc(108) boolean local108 = (local3 & 0x8) != 0;
		@Pc(116) boolean local116 = (local3 & 0x10) != 0;
		for (@Pc(118) int local118 = 0; local118 < local100; local118++) {
			@Pc(123) int local123 = arg1.method3440();
			@Pc(125) int local125 = 0;
			@Pc(127) int local127 = 0;
			if (local108) {
				local125 = arg1.method3440();
				local127 = arg1.method3440();
			}
			@Pc(139) int local139 = 0;
			if (local116) {
				local139 = arg1.method3440();
			}
			@Pc(215) short[] local215;
			@Pc(218) byte[] local218;
			@Pc(220) int local220;
			if (local118 == 0) {
				aByteArray62[arg4 + arg5 * anInt4749] = (byte) local123;
				aByteArray64[arg4 + arg5 * anInt4749] = (byte) local125;
				aByteArray61[arg4 + arg5 * anInt4749] = (byte) local127;
				if (local139 == 1) {
					aShortArray67[arg4 + arg5 * anInt4749] = (short) (arg1.method3401() + 1);
					aByteArray63[arg4 + arg5 * anInt4749] = arg1.method3426();
				} else if (local139 > 1) {
					aShortArray67[arg4 + arg5 * anInt4749] = -1;
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method3401();
						local218[local220] = arg1.method3426();
					}
					aClass43_28.method1276(new Class4_Sub10(local215, local218), (long) (arg4 << 16 | arg5));
				}
			} else {
				local215 = null;
				local218 = null;
				if (local139 > 0) {
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method3401();
						local218[local220] = arg1.method3426();
					}
				}
				if (aClass32ArrayArrayArray2[local118 - 1][arg2 - (anInt4745 >> 6)][arg3 - (anInt4748 >> 6)] == null) {
					aClass32ArrayArrayArray2[local118 - 1][arg2 - (anInt4745 >> 6)][arg3 - (anInt4748 >> 6)] = new Class32();
				}
				@Pc(338) Class2_Sub8 local338 = new Class2_Sub8(arg4 & 0x3F, arg5 & 0x3F, local123, local125, local127, local215, local218);
				aClass32ArrayArrayArray2[local118 - 1][arg2 - (anInt4745 >> 6)][arg3 - (anInt4748 >> 6)].method844(local338);
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!vq;IIII[S[B)V")
	private static void method4159(@OriginalArg(0) Class47 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		if (arg5 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < arg5.length; local4++) {
			@Pc(13) Class18 local13 = Static113.method2380(arg5[local4] & 0xFFFF);
			@Pc(16) int local16 = local13.anInt525;
			if (local16 != -1) {
				@Pc(23) Class3 local23 = Static266.method4597(local16);
				@Pc(47) Class58 local47 = local23.method45(local13.aBoolean53 ? arg6[local4] >> 6 & 0x3 : 0, arg0, local13.aBoolean49 ? local13.aBoolean40 : false);
				if (local47 != null) {
					@Pc(56) int local56 = arg3 * local47.method4282() >> 2;
					@Pc(63) int local63 = arg4 * local47.method4286() >> 2;
					if (local23.aBoolean6) {
						@Pc(69) int local69 = local13.anInt532;
						@Pc(72) int local72 = local13.anInt529;
						if ((arg6[local4] >> 6 & 0x1) == 1) {
							@Pc(83) int local83 = local69;
							local69 = local72;
							local72 = local83;
						}
						local56 = local69 * arg3;
						local63 = local72 * arg4;
					}
					if (local56 != 0 && local63 != 0) {
						if (local23.anInt49 == 0) {
							local47.method4278(arg1, arg2 + arg4 - local63, local56, local63);
						} else {
							local47.method4272(arg1, arg2 + arg4 - local63, local56, local63, 1, local23.anInt49 | 0xFF000000, 1);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!vq;IIII)Lclient!kn;")
	private static Class116 method4160(@OriginalArg(0) Class47 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(4) Class4_Sub3 local4 = (Class4_Sub3) aClass116_40.method3270(); local4 != null; local4 = (Class4_Sub3) aClass116_40.method3272()) {
			method4172(arg0, local4, arg1, arg2);
		}
		return aClass116_40;
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "()V")
	public static void method4161() {
		@Pc(2) int[] local2 = new int[3];
		for (@Pc(4) int local4 = 0; local4 < aClass137_3.anInt4323; local4++) {
			@Pc(32) boolean local32 = aClass4_Sub4_Sub11_3.method3892(local2, aClass137_3.anIntArray367[local4] >> 14 & 0x3FFF, aClass137_3.anIntArray367[local4] >> 28 & 0x3, aClass137_3.anIntArray367[local4] & 0x3FFF);
			if (local32) {
				@Pc(42) Class4_Sub3 local42 = new Class4_Sub3(aClass137_3.anIntArray368[local4]);
				local42.anInt209 = local2[1] - anInt4745;
				local42.anInt212 = local2[2] - anInt4748;
				aClass116_40.method3274(local42);
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(Lclient!vq;IIII)V")
	private static void method4162(@OriginalArg(0) Class47 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = anInt4746 - anInt4744;
		@Pc(7) int local7 = anInt4741 - anInt4739;
		if (anInt4746 < anInt4749) {
			local3++;
		}
		if (anInt4741 < anInt4747) {
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
			local28 = (arg1 * local17 >> 16) + anInt4743;
			local40 = (arg1 * (local17 + 1) >> 16) + anInt4743;
			local44 = local40 - local28;
			if (local44 > 0) {
				local50 = anInt4744 + local17;
				if (local50 >= 0 && local50 < anInt4749) {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt4742 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt4742 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (local84 > 0) {
							local93 = local57 + anInt4739;
							local172 = local50 + local93 * anInt4749;
							local174 = 0;
							local176 = 0;
							local178 = 0;
							if (local93 >= 0 && local93 < anInt4747) {
								local174 = (aByteArray65[local172] & 0xFF) << 16 | aShortArray68[local172] & 0xFFFF;
								if (local174 != 0) {
									local174 |= 0xFF000000;
								}
								local176 = aByteArray64[local172] & 0xFF;
								local178 = aShortArray67[local172] & 0xFFFF;
							}
							if (local174 == 0 && local176 == 0 && local178 == 0) {
								if (aClass4_Sub4_Sub11_3.anInt4352 != -1) {
									local174 = aClass4_Sub4_Sub11_3.anInt4352 | 0xFF000000;
								} else if ((local17 + anInt4744 & 0x4) == (local57 + anInt4741 & 0x4)) {
									local174 = anIntArray394[Static129.anInt3040 + 1];
								} else {
									local174 = -11840664;
								}
								if (local174 == 0) {
									local174 = -16777216;
								}
								arg0.method2682(local28, local70, local44, local84, local174, 0);
							} else if (local178 <= 0) {
								method4156(arg0, local28, local70, local44, local84, local174, local176, aByteArray61[local172], null, null, true);
							} else if (local178 == 65535) {
								@Pc(280) Class4_Sub10 local280 = (Class4_Sub10) aClass43_28.method1273((long) (local50 << 16 | local93));
								if (local280 != null) {
									method4156(arg0, local28, local70, local44, local84, local174, local176, aByteArray61[local172], local280.aShortArray12, local280.aByteArray7, true);
								}
							} else {
								aShortArray66[0] = (short) (local178 - 1);
								aByteArray60[0] = aByteArray63[local172];
								method4156(arg0, local28, local70, local44, local84, local174, local176, aByteArray61[local172], aShortArray66, aByteArray60, true);
							}
						}
					}
				} else {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt4742 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt4742 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (aClass4_Sub4_Sub11_3.anInt4352 != -1) {
							local93 = aClass4_Sub4_Sub11_3.anInt4352 | 0xFF000000;
						} else if ((local17 + anInt4744 & 0x4) == (local57 + anInt4741 & 0x4)) {
							local93 = anIntArray394[Static129.anInt3040 + 1];
						} else {
							local93 = -11840664;
						}
						if (local93 == 0) {
							local93 = -16777216;
						}
						arg0.method2682(local28, local70, local44, local84, local93, 0);
					}
				}
			}
		}
		for (local28 = -16; local28 < local3 + 16; local28++) {
			local40 = (arg1 * local28 >> 16) + anInt4743;
			local44 = (arg1 * (local28 + 1) >> 16) + anInt4743;
			local50 = local44 - local40;
			if (local50 > 0) {
				local57 = local28 + anInt4744;
				if (local57 >= 0 && local57 < anInt4749) {
					for (local70 = -16; local70 < local7 + 16; local70++) {
						local80 = anInt4742 - (arg2 * (local70 + 1) >> 16);
						local84 = anInt4742 - (arg2 * local70 >> 16);
						local93 = local84 - local80;
						if (local93 > 0) {
							local172 = local70 + anInt4739;
							if (local172 >= 0 && local172 < anInt4747) {
								local174 = aShortArray67[local57 + local172 * anInt4749] & 0xFFFF;
								if (local174 <= 0) {
									method4159(arg0, local40, local80, local50, local93, null, null);
								} else if (local174 == 65535) {
									@Pc(457) Class4_Sub10 local457 = (Class4_Sub10) aClass43_28.method1273((long) (local57 << 16 | local172));
									if (local457 != null) {
										method4159(arg0, local40, local80, local50, local93, local457.aShortArray12, local457.aByteArray7);
									}
								} else {
									aShortArray66[0] = (short) (local174 - 1);
									aByteArray60[0] = aByteArray63[local57 + local172 * anInt4749];
									method4159(arg0, local40, local80, local50, local93, aShortArray66, aByteArray60);
								}
							}
						}
					}
				}
			}
		}
		local40 = anInt4744 >> 6;
		local44 = anInt4739 >> 6;
		if (local40 < 0) {
			local40 = 0;
		}
		if (local44 < 0) {
			local44 = 0;
		}
		local50 = anInt4746 >> 6;
		local57 = anInt4741 >> 6;
		if (local50 >= aClass32ArrayArrayArray2[0].length) {
			local50 = aClass32ArrayArrayArray2[0].length - 1;
		}
		if (local57 >= aClass32ArrayArrayArray2[0][0].length) {
			local57 = aClass32ArrayArrayArray2[0][0].length - 1;
		}
		for (local70 = 0; local70 < 3; local70++) {
			@Pc(639) int local639;
			@Pc(651) int local651;
			@Pc(663) int local663;
			@Pc(673) int local673;
			@Pc(629) int local629;
			for (local80 = local40; local80 <= local50; local80++) {
				for (local84 = local44; local84 <= local57; local84++) {
					@Pc(587) Class32 local587 = aClass32ArrayArrayArray2[local70][local80][local84];
					if (local587 != null) {
						local172 = (local80 + (anInt4745 >> 6)) * 64;
						local174 = (local84 + (anInt4748 >> 6)) * 64;
						for (@Pc(610) Class2_Sub8 local610 = (Class2_Sub8) local587.method850(); local610 != null; local610 = (Class2_Sub8) local587.method846()) {
							local178 = local172 + local610.aByte71 - anInt4745 - anInt4744;
							local629 = local174 + local610.aByte69 - anInt4748 - anInt4739;
							local639 = (arg1 * local178 >> 16) + anInt4743;
							local651 = (arg1 * (local178 + 1) >> 16) + anInt4743;
							local663 = anInt4742 - (arg2 * (local629 + 1) >> 16);
							local673 = anInt4742 - (arg2 * local629 >> 16);
							method4156(arg0, local639, local663, local651 - local639, local673 - local663, local610.anInt6428, local610.aByte70 & 0xFF, local610.aByte72, local610.aShortArray107, local610.aByteArray90, false);
						}
					}
				}
			}
			for (local84 = local40; local84 <= local50; local84++) {
				for (local93 = local44; local93 <= local57; local93++) {
					@Pc(725) Class32 local725 = aClass32ArrayArrayArray2[local70][local84][local93];
					if (local725 != null) {
						local174 = (local84 + (anInt4745 >> 6)) * 64;
						local176 = (local93 + (anInt4748 >> 6)) * 64;
						for (@Pc(748) Class2_Sub8 local748 = (Class2_Sub8) local725.method850(); local748 != null; local748 = (Class2_Sub8) local725.method846()) {
							local629 = local174 + local748.aByte71 - anInt4745 - anInt4744;
							local639 = local176 + local748.aByte69 - anInt4748 - anInt4739;
							local651 = (arg1 * local629 >> 16) + anInt4743;
							local663 = (arg1 * (local629 + 1) >> 16) + anInt4743;
							local673 = anInt4742 - (arg2 * (local639 + 1) >> 16);
							@Pc(811) int local811 = anInt4742 - (arg2 * local639 >> 16);
							method4159(arg0, local651, local673, local663 - local651, local811 - local673, local748.aShortArray107, local748.aByteArray90);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!vq;)Lclient!kn;")
	public static Class116 method4163(@OriginalArg(0) Class47 arg0) {
		@Pc(3) int local3 = anInt4746 - anInt4744;
		@Pc(7) int local7 = anInt4741 - anInt4739;
		@Pc(15) int local15 = (anInt4740 - anInt4743 << 16) / local3;
		@Pc(23) int local23 = (anInt4742 - anInt4738 << 16) / local7;
		return method4160(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "()V")
	public static void method4164() {
		aByteArray62 = new byte[anInt4749 * anInt4747];
		aByteArray64 = new byte[anInt4749 * anInt4747];
		aByteArray61 = new byte[anInt4749 * anInt4747];
		aShortArray67 = new short[anInt4749 * anInt4747];
		aByteArray63 = new byte[anInt4749 * anInt4747];
		aClass43_28 = new Class43(1024);
		aClass32ArrayArrayArray2 = new Class32[3][anInt4749 >> 6][anInt4747 >> 6];
		anIntArray394 = new int[Static300.anInt5748 + 1];
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
	public static void method4165(@OriginalArg(0) int arg0) {
		aClass4_Sub4_Sub11_3 = (Class4_Sub4_Sub11) aClass43_27.method1273((long) arg0);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(II)Lclient!se;")
	public static Class180 method4166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class180 local3 = new Class180();
		for (@Pc(8) Class4_Sub4_Sub11 local8 = (Class4_Sub4_Sub11) aClass43_27.method1283(); local8 != null; local8 = (Class4_Sub4_Sub11) aClass43_27.method1278()) {
			if (local8.aBoolean335 && local8.method3894(arg1, arg0)) {
				local3.method4840(local8);
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!db", name = "e", descriptor = "()V")
	private static void method4168() {
		@Pc(4) int local4;
		@Pc(15) int local15;
		@Pc(48) int local48;
		for (@Pc(1) int local1 = 0; local1 < anInt4749; local1++) {
			for (local4 = 0; local4 < anInt4747; local4++) {
				local15 = aShortArray67[local1 + local4 * anInt4749] & 0xFFFF;
				if (local15 != 0) {
					@Pc(35) int local35;
					if (local15 == 65535) {
						@Pc(31) Class4_Sub10 local31 = (Class4_Sub10) aClass43_28.method1273((long) (local1 << 16 | local4));
						if (local31 != null) {
							for (local35 = 0; local35 < local31.aShortArray12.length; local35++) {
								@Pc(45) Class18 local45 = Static113.method2380(local31.aShortArray12[local35] & 0xFFFF);
								local48 = local45.anInt523;
								if (local45.anIntArray23 != null) {
									local45 = local45.method416();
									if (local45 != null) {
										local48 = local45.anInt523;
									}
								}
								if (local48 != -1) {
									@Pc(68) Class4_Sub3 local68 = new Class4_Sub3(local48);
									local68.anInt209 = local1;
									local68.anInt212 = local4;
									aClass116_40.method3274(local68);
								}
							}
						}
					} else {
						@Pc(91) Class18 local91 = Static113.method2380(local15 - 1);
						local35 = local91.anInt523;
						if (local91.anIntArray23 != null) {
							local91 = local91.method416();
							if (local91 != null) {
								local35 = local91.anInt523;
							}
						}
						if (local35 != -1) {
							@Pc(114) Class4_Sub3 local114 = new Class4_Sub3(local35);
							local114.anInt209 = local1;
							local114.anInt212 = local4;
							aClass116_40.method3274(local114);
						}
					}
				}
			}
		}
		for (local4 = 0; local4 < 3; local4++) {
			for (local15 = 0; local15 < aClass32ArrayArrayArray2[0].length; local15++) {
				for (@Pc(140) int local140 = 0; local140 < aClass32ArrayArrayArray2[0][0].length; local140++) {
					@Pc(149) Class32 local149 = aClass32ArrayArrayArray2[local4][local15][local140];
					if (local149 != null) {
						for (@Pc(156) Class2_Sub8 local156 = (Class2_Sub8) local149.method850(); local156 != null; local156 = (Class2_Sub8) local149.method846()) {
							if (local156.aShortArray107 != null) {
								for (local48 = 0; local48 < local156.aShortArray107.length; local48++) {
									@Pc(172) Class18 local172 = Static113.method2380(local156.aShortArray107[local48] & 0xFFFF);
									@Pc(175) int local175 = local172.anInt523;
									if (local172.anIntArray23 != null) {
										local172 = local172.method416();
										if (local172 != null) {
											local175 = local172.anInt523;
										}
									}
									if (local175 != -1) {
										@Pc(195) Class4_Sub3 local195 = new Class4_Sub3(local175);
										local195.anInt209 = (local15 + (anInt4745 >> 6)) * 64 + local156.aByte71 - anInt4745;
										local195.anInt212 = (local140 + (anInt4748 >> 6)) * 64 + local156.aByte69 - anInt4748;
										aClass116_40.method3274(local195);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(Lclient!vq;)V")
	public static void method4169(@OriginalArg(0) Class47 arg0) {
		@Pc(3) int local3 = anInt4746 - anInt4744;
		@Pc(7) int local7 = anInt4741 - anInt4739;
		@Pc(15) int local15 = (anInt4740 - anInt4743 << 16) / local3;
		@Pc(23) int local23 = (anInt4742 - anInt4738 << 16) / local7;
		method4162(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(I)Lclient!ne;")
	public static Class4_Sub4_Sub11 method4170(@OriginalArg(0) int arg0) {
		return (Class4_Sub4_Sub11) aClass43_27.method1273((long) arg0);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "([B[B[SII)V")
	private static void method4171(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int[] local2 = new int[anInt4747];
		@Pc(5) int[] local5 = new int[anInt4747];
		@Pc(8) int[] local8 = new int[anInt4747];
		@Pc(11) int[] local11 = new int[anInt4747];
		@Pc(14) int[] local14 = new int[anInt4747];
		for (@Pc(16) int local16 = -5; local16 < anInt4749; local16++) {
			@Pc(21) int local21 = local16 + 5;
			@Pc(25) int local25 = local16 - 5;
			@Pc(41) int local41;
			for (@Pc(27) int local27 = 0; local27 < anInt4747; local27++) {
				@Pc(49) Class156 local49;
				@Pc(85) int local85;
				if (local21 < anInt4749) {
					local41 = arg0[local21 + local27 * anInt4749] & 0xFF;
					if (local41 > 0) {
						local49 = Static183.method3514(local41 - 1);
						local2[local27] += local49.anInt4819;
						local5[local27] += local49.anInt4827;
						local8[local27] += local49.anInt4825;
						local11[local27] += local49.anInt4820;
						local85 = local14[local27]++;
					}
				}
				if (local25 >= 0) {
					local41 = arg0[local25 + local27 * anInt4749] & 0xFF;
					if (local41 > 0) {
						local49 = Static183.method3514(local41 - 1);
						local2[local27] -= local49.anInt4819;
						local5[local27] -= local49.anInt4827;
						local8[local27] -= local49.anInt4825;
						local11[local27] -= local49.anInt4820;
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
				for (@Pc(165) int local165 = -5; local165 < anInt4747; local165++) {
					@Pc(170) int local170 = local165 + 5;
					if (local170 < anInt4747) {
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
						if ((arg0[local16 + local165 * anInt4749] & 0xFF) == 0) {
							local259 = local16 + local165 * anInt4749;
							arg1[local259] = 0;
							arg2[local259] = 0;
						} else {
							local259 = local161 == 0 ? 0 : Static224.method4038(local41 * 256 / local161, local157 / local163, local159 / local163);
							@Pc(292) int local292 = (local259 & 0x7F) + arg4;
							if (local292 < 0) {
								local292 = 0;
							} else if (local292 > 127) {
								local292 = 127;
							}
							@Pc(314) int local314 = (local259 + arg3 & 0xFC00) + (local259 & 0x380) + local292;
							@Pc(320) int local320 = local16 + local165 * anInt4749;
							@Pc(331) int local331 = Static194.anIntArray340[Static162.method3167(Static147.method2996(local314)) & 0xFFFF];
							arg1[local320] = (byte) (local331 >> 16 & 0xFF);
							arg2[local320] = (short) (local331 & 0xFFFF);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!vq;Lclient!ak;IIII)V")
	private static void method4172(@OriginalArg(0) Class47 arg0, @OriginalArg(1) Class4_Sub3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		arg1.anInt207 = anInt4743 + (arg2 * (arg1.anInt209 - anInt4744) >> 16);
		arg1.anInt208 = anInt4742 - (arg3 * (arg1.anInt212 - anInt4739) >> 16);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!bk;II)V")
	public static void method4173(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static300.anInt5748; local1++) {
			anIntArray394[local1 + 1] = method4175(arg0, local1, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(II)Lclient!ne;")
	public static Class4_Sub4_Sub11 method4174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(4) Class4_Sub4_Sub11 local4 = (Class4_Sub4_Sub11) aClass43_27.method1283(); local4 != null; local4 = (Class4_Sub4_Sub11) aClass43_27.method1278()) {
			if (local4.aBoolean335 && local4.method3894(arg1, arg0)) {
				return local4;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!bk;III)I")
	private static int method4175(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class121 local3 = Static293.method3948(arg1);
		if (local3 == null) {
			return 0;
		}
		@Pc(10) int local10 = local3.anInt3837;
		if (local10 >= 0 && arg0.method5441(local10).aBoolean263) {
			local10 = -1;
		}
		@Pc(67) int local67;
		@Pc(26) int local26;
		@Pc(32) int local32;
		@Pc(54) int local54;
		if (local3.anInt3840 >= 0) {
			local26 = local3.anInt3840;
			local32 = (local26 & 0x7F) + arg3;
			if (local32 < 0) {
				local32 = 0;
			} else if (local32 > 127) {
				local32 = 127;
			}
			local54 = (local26 + arg2 & 0xFC00) + (local26 & 0x380) + local32;
			local67 = Static194.anIntArray340[Static162.method3167(Static291.method4880(local54)) & 0xFFFF] | 0xFF000000;
		} else if (local10 >= 0) {
			local67 = Static194.anIntArray340[Static162.method3167(Static291.method4880(arg0.method5441(local10).aShort52)) & 0xFFFF] | 0xFF000000;
		} else if (local3.anInt3843 == -1) {
			local67 = 0;
		} else {
			local26 = local3.anInt3843;
			local32 = (local26 & 0x7F) + arg3;
			if (local32 < 0) {
				local32 = 0;
			} else if (local32 > 127) {
				local32 = 127;
			}
			local54 = (local26 + arg2 & 0xFC00) + (local26 & 0x380) + local32;
			local67 = Static194.anIntArray340[Static162.method3167(Static291.method4880(local54)) & 0xFFFF] | 0xFF000000;
		}
		return local67;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!tj;)V")
	public static void method4176(@OriginalArg(0) Class193 arg0) {
		aClass193_80 = arg0;
		aClass43_27.method1282();
		@Pc(9) int local9 = aClass193_80.method5066("details");
		@Pc(14) int[] local14 = aClass193_80.method5038(local9);
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(25) Class4_Sub4_Sub11 local25 = Static190.method3608(aClass193_80, local14[local16], local9);
			aClass43_27.method1276(local25, (long) local25.anInt4353);
		}
		Static199.method3743(false);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!vq;II)V")
	public static void method4177(@OriginalArg(0) Class47 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class4_Sub11 local9 = new Class4_Sub11(aClass193_80.method5034(aClass4_Sub4_Sub11_3.aString49, "area"));
		@Pc(13) int local13 = local9.method3440();
		@Pc(16) int[] local16 = new int[local13];
		for (@Pc(18) int local18 = 0; local18 < local13; local18++) {
			local16[local18] = local9.method3440();
		}
		@Pc(33) int local33 = local9.method3440();
		@Pc(36) int[] local36 = new int[local33];
		for (@Pc(38) int local38 = 0; local38 < local33; local38++) {
			local36[local38] = local9.method3440();
		}
		while (true) {
			@Pc(58) int local58;
			@Pc(64) int local64;
			@Pc(67) int local67;
			@Pc(76) int local76;
			@Pc(148) int local148;
			while (local9.anInt3768 < local9.aByteArray55.length) {
				@Pc(62) int local62;
				@Pc(84) int local84;
				if (local9.method3440() == 0) {
					local58 = local9.method3440();
					local62 = local9.method3440();
					for (local64 = 0; local64 < 64; local64++) {
						for (local67 = 0; local67 < 64; local67++) {
							local76 = local58 * 64 + local64 - anInt4745;
							local84 = local62 * 64 + local67 - anInt4748;
							method4158(arg0, local9, local58, local62, local76, local84, local16, local36);
						}
					}
				} else {
					local58 = local9.method3440();
					local62 = local9.method3440();
					local64 = local9.method3440();
					local67 = local9.method3440();
					for (local76 = 0; local76 < 8; local76++) {
						for (local84 = 0; local84 < 8; local84++) {
							@Pc(136) int local136 = local58 * 64 + local64 * 8 + local76 - anInt4745;
							local148 = local62 * 64 + local67 * 8 + local84 - anInt4748;
							method4158(arg0, local9, local58, local62, local136, local148, local16, local36);
						}
					}
				}
			}
			aByteArray65 = new byte[anInt4749 * anInt4747];
			aShortArray68 = new short[anInt4749 * anInt4747];
			for (local58 = 0; local58 < 3; local58++) {
				@Pc(191) byte[] local191 = new byte[anInt4749 * anInt4747];
				for (local64 = 0; local64 < aClass32ArrayArrayArray2[local58].length; local64++) {
					for (local67 = 0; local67 < aClass32ArrayArrayArray2[local58][0].length; local67++) {
						@Pc(205) Class32 local205 = aClass32ArrayArrayArray2[local58][local64][local67];
						if (local205 != null) {
							for (@Pc(212) Class2_Sub8 local212 = (Class2_Sub8) local205.method850(); local212 != null; local212 = (Class2_Sub8) local205.method846()) {
								local191[local64 * 64 + local212.aByte71 + (local67 * 64 + local212.aByte69) * anInt4749] = (byte) local212.anInt6428;
							}
						}
					}
				}
				method4171(local191, aByteArray65, aShortArray68, arg1, arg2);
				for (local67 = 0; local67 < aClass32ArrayArrayArray2[local58].length; local67++) {
					for (local76 = 0; local76 < aClass32ArrayArrayArray2[local58][0].length; local76++) {
						@Pc(276) Class32 local276 = aClass32ArrayArrayArray2[local58][local67][local76];
						if (local276 != null) {
							for (@Pc(283) Class2_Sub8 local283 = (Class2_Sub8) local276.method850(); local283 != null; local283 = (Class2_Sub8) local276.method846()) {
								local148 = local67 * 64 + local283.aByte71 + (local76 * 64 + local283.aByte69) * anInt4749;
								local283.anInt6428 = (aByteArray65[local148] & 0xFF) << 16 | aShortArray68[local148] & 0xFFFF;
								if (local283.anInt6428 != 0) {
									local283.anInt6428 |= 0xFF000000;
								}
							}
						}
					}
				}
			}
			method4171(aByteArray62, aByteArray65, aShortArray68, arg1, arg2);
			aByteArray62 = null;
			method4168();
			return;
		}
	}
}
