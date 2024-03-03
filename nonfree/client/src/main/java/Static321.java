import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "Lclient!vj;")
	public static Class2_Sub2_Sub17 aClass2_Sub2_Sub17_3;

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "Lclient!wl;")
	public static Interface11 anInterface11_2;

	@OriginalMember(owner = "client!tt", name = "c", descriptor = "Lclient!rh;")
	public static Class202 aClass202_3;

	@OriginalMember(owner = "client!tt", name = "d", descriptor = "Lclient!ii;")
	public static Class104 aClass104_4;

	@OriginalMember(owner = "client!tt", name = "e", descriptor = "Lclient!fl;")
	private static Class72 aClass72_6;

	@OriginalMember(owner = "client!tt", name = "g", descriptor = "Lclient!r;")
	public static Class197 aClass197_85;

	@OriginalMember(owner = "client!tt", name = "h", descriptor = "Lclient!vq;")
	private static Class241 aClass241_4;

	@OriginalMember(owner = "client!tt", name = "i", descriptor = "Lclient!ki;")
	public static Class125 aClass125_4;

	@OriginalMember(owner = "client!tt", name = "k", descriptor = "I")
	public static int anInt6035;

	@OriginalMember(owner = "client!tt", name = "m", descriptor = "F")
	public static float aFloat71;

	@OriginalMember(owner = "client!tt", name = "o", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!tt", name = "q", descriptor = "Lclient!ih;")
	public static Class103 aClass103_5;

	@OriginalMember(owner = "client!tt", name = "r", descriptor = "F")
	public static float aFloat72;

	@OriginalMember(owner = "client!tt", name = "t", descriptor = "I")
	public static int anInt6038;

	@OriginalMember(owner = "client!tt", name = "u", descriptor = "I")
	public static int anInt6039;

	@OriginalMember(owner = "client!tt", name = "v", descriptor = "[S")
	private static short[] aShortArray120;

	@OriginalMember(owner = "client!tt", name = "w", descriptor = "[S")
	private static short[] aShortArray121;

	@OriginalMember(owner = "client!tt", name = "x", descriptor = "I")
	public static int anInt6040;

	@OriginalMember(owner = "client!tt", name = "y", descriptor = "I")
	public static int anInt6041;

	@OriginalMember(owner = "client!tt", name = "z", descriptor = "I")
	public static int anInt6042;

	@OriginalMember(owner = "client!tt", name = "A", descriptor = "[B")
	private static byte[] aByteArray86;

	@OriginalMember(owner = "client!tt", name = "B", descriptor = "I")
	public static int anInt6043;

	@OriginalMember(owner = "client!tt", name = "C", descriptor = "[I")
	private static int[] anIntArray406;

	@OriginalMember(owner = "client!tt", name = "D", descriptor = "I")
	public static int anInt6044;

	@OriginalMember(owner = "client!tt", name = "E", descriptor = "I")
	public static int anInt6045;

	@OriginalMember(owner = "client!tt", name = "F", descriptor = "Lclient!ad;")
	private static Class4 aClass4_125;

	@OriginalMember(owner = "client!tt", name = "G", descriptor = "I")
	public static int anInt6046;

	@OriginalMember(owner = "client!tt", name = "H", descriptor = "I")
	public static int anInt6047;

	@OriginalMember(owner = "client!tt", name = "I", descriptor = "[[[Lclient!cm;")
	private static Class36[][][] aClass36ArrayArrayArray2;

	@OriginalMember(owner = "client!tt", name = "J", descriptor = "[B")
	private static byte[] aByteArray87;

	@OriginalMember(owner = "client!tt", name = "K", descriptor = "[B")
	private static byte[] aByteArray88;

	@OriginalMember(owner = "client!tt", name = "L", descriptor = "I")
	public static int anInt6048;

	@OriginalMember(owner = "client!tt", name = "M", descriptor = "[B")
	private static byte[] aByteArray89;

	@OriginalMember(owner = "client!tt", name = "N", descriptor = "I")
	public static int anInt6049;

	@OriginalMember(owner = "client!tt", name = "O", descriptor = "[B")
	private static byte[] aByteArray90;

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!wm;IIIIIII[S[BZ)V", line = 3)
	private static void method5510(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) byte[] arg9, @OriginalArg(10) boolean arg10) {
		@Pc(20) int local20;
		@Pc(32) int local32;
		if (arg10 || arg5 != 0 || arg6 > 0) {
			if (arg6 == 0) {
				arg0.method2903(arg1, arg2, arg3, arg4, arg5, 0);
			} else {
				local20 = arg7 & 0x3F;
				if (local20 == 0 || arg3 <= 1 || arg4 <= 1) {
					local32 = anIntArray406[arg6];
					if (arg10 || local32 != 0) {
						arg0.method2903(arg1, arg2, arg3, arg4, local32, 0);
					}
				} else {
					local32 = arg10 ? 0 : 1;
					Static3.method58(local32, arg1, arg2, arg0, aByteArrayArrayArray15, local20, arg5, anInt6035, arg3, arg7 >> 6 & 0x3, anIntArray406[arg6], arg4);
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
				@Pc(127) Class41 local127 = aClass202_3.method5164(arg8[local100] & 0xFFFF);
				if (local127.anInt1315 == -1) {
					@Pc(133) int local133 = -3355444;
					if (local127.anInt1334 == 1) {
						local133 = -3407872;
					}
					@Pc(147) int local147 = arg9[local100] >> 6 & 0x3;
					if (local107 == 0) {
						if (local147 == 0) {
							arg0.method2891(arg1, arg2, arg4, local133, 0);
						} else if (local147 == 1) {
							arg0.method2858(arg1, arg2, arg3, local133, 0);
						} else if (local147 == 2) {
							arg0.method2891(local20, arg2, arg4, local133, 0);
						} else {
							arg0.method2858(arg1, local32, arg3, local133, 0);
						}
					} else if (local107 == 2) {
						if (local147 == 0) {
							arg0.method2891(arg1, arg2, arg4, -1, 0);
							arg0.method2858(arg1, arg2, arg3, local133, 0);
						} else if (local147 == 1) {
							arg0.method2891(local20, arg2, arg4, -1, 0);
							arg0.method2858(arg1, arg2, arg3, local133, 0);
						} else if (local147 == 2) {
							arg0.method2891(local20, arg2, arg4, -1, 0);
							arg0.method2858(arg1, local32, arg3, local133, 0);
						} else {
							arg0.method2891(arg1, arg2, arg4, -1, 0);
							arg0.method2858(arg1, local32, arg3, local133, 0);
						}
					} else if (local107 == 3) {
						if (local147 == 0) {
							arg0.method2858(arg1, arg2, 1, local133, 0);
						} else if (local147 == 1) {
							arg0.method2858(local20, arg2, 1, local133, 0);
						} else if (local147 == 2) {
							arg0.method2858(local20, local32, 1, local133, 0);
						} else {
							arg0.method2858(arg1, local32, 1, local133, 0);
						}
					} else if (local107 == 9) {
						@Pc(313) int local313;
						if (local147 == 0 || local147 == 2) {
							for (local313 = 0; local313 < arg4; local313++) {
								arg0.method2858(arg1 + local313, local32 - local313, 1, local133, 0);
							}
						} else {
							for (local313 = 0; local313 < arg4; local313++) {
								arg0.method2858(arg1 + local313, arg2 + local313, 1, local133, 0);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!wm;Lclient!bt;IIII[I[I)V", line = 167)
	private static void method5511(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class2_Sub4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7) {
		@Pc(3) int local3 = arg1.method4816();
		if ((local3 & 0x1) == 0) {
			@Pc(15) boolean local15 = (local3 & 0x2) == 0;
			@Pc(21) int local21 = local3 >> 2 & 0x3F;
			if (local21 != 62) {
				if (local21 == 63) {
					local21 = arg1.method4816();
				} else if (local15) {
					local21 = arg6[local21];
				} else {
					local21 = arg7[local21];
				}
				if (local15) {
					aByteArray88[arg4 + arg5 * anInt6044] = (byte) local21;
					aByteArray90[arg4 + arg5 * anInt6044] = 0;
				} else {
					aByteArray90[arg4 + arg5 * anInt6044] = (byte) local21;
					aByteArray89[arg4 + arg5 * anInt6044] = 0;
					aByteArray88[arg4 + arg5 * anInt6044] = arg1.method4826();
				}
			}
			return;
		}
		@Pc(100) int local100 = (local3 >> 1 & 0x3) + 1;
		@Pc(108) boolean local108 = (local3 & 0x8) != 0;
		@Pc(116) boolean local116 = (local3 & 0x10) != 0;
		for (@Pc(118) int local118 = 0; local118 < local100; local118++) {
			@Pc(123) int local123 = arg1.method4816();
			@Pc(125) int local125 = 0;
			@Pc(127) int local127 = 0;
			if (local108) {
				local125 = arg1.method4816();
				local127 = arg1.method4816();
			}
			@Pc(139) int local139 = 0;
			if (local116) {
				local139 = arg1.method4816();
			}
			@Pc(215) short[] local215;
			@Pc(218) byte[] local218;
			@Pc(220) int local220;
			if (local118 == 0) {
				aByteArray88[arg4 + arg5 * anInt6044] = (byte) local123;
				aByteArray90[arg4 + arg5 * anInt6044] = (byte) local125;
				aByteArray89[arg4 + arg5 * anInt6044] = (byte) local127;
				if (local139 == 1) {
					aShortArray121[arg4 + arg5 * anInt6044] = (short) (arg1.method4830() + 1);
					aByteArray87[arg4 + arg5 * anInt6044] = arg1.method4826();
				} else if (local139 > 1) {
					aShortArray121[arg4 + arg5 * anInt6044] = -1;
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method4830();
						local218[local220] = arg1.method4826();
					}
					aClass4_125.method87(new Class2_Sub29(local215, local218), (long) (arg4 << 16 | arg5));
				}
			} else {
				local215 = null;
				local218 = null;
				if (local139 > 0) {
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method4830();
						local218[local220] = arg1.method4826();
					}
				}
				if (aClass36ArrayArrayArray2[local118 - 1][arg2 - (anInt6045 >> 6)][arg3 - (anInt6043 >> 6)] == null) {
					aClass36ArrayArrayArray2[local118 - 1][arg2 - (anInt6045 >> 6)][arg3 - (anInt6043 >> 6)] = new Class36();
				}
				@Pc(338) Class12_Sub7 local338 = new Class12_Sub7(arg4 & 0x3F, arg5 & 0x3F, local123, local125, local127, local215, local218);
				aClass36ArrayArrayArray2[local118 - 1][arg2 - (anInt6045 >> 6)][arg3 - (anInt6043 >> 6)].method1420(local338);
			}
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "()V", line = 305)
	public static void method5512() {
		@Pc(2) int[] local2 = new int[3];
		for (@Pc(4) int local4 = 0; local4 < aClass103_5.anInt2699; local4++) {
			@Pc(32) boolean local32 = aClass2_Sub2_Sub17_3.method6146(aClass103_5.anIntArray170[local4] >> 28 & 0x3, local2, aClass103_5.anIntArray170[local4] >> 14 & 0x3FFF, aClass103_5.anIntArray170[local4] & 0x3FFF);
			if (local32) {
				@Pc(42) Class2_Sub20 local42 = new Class2_Sub20(aClass103_5.anIntArray171[local4]);
				local42.anInt2946 = local2[1] - anInt6045;
				local42.anInt2949 = local2[2] - anInt6043;
				Class216.aClass135_36.method3541(local42);
			}
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!r;Lclient!fl;Lclient!vq;Lclient!rh;Lclient!ki;Lclient!ii;Lclient!wl;)V", line = 327)
	public static void method5513(@OriginalArg(0) Class197 arg0, @OriginalArg(1) Class72 arg1, @OriginalArg(2) Class241 arg2, @OriginalArg(3) Class202 arg3, @OriginalArg(4) Class125 arg4, @OriginalArg(5) Class104 arg5, @OriginalArg(6) Interface11 arg6) {
		aClass197_85 = arg0;
		aClass72_6 = arg1;
		aClass241_4 = arg2;
		aClass202_3 = arg3;
		aClass125_4 = arg4;
		aClass104_4 = arg5;
		anInterface11_2 = arg6;
		Class216.aClass4_124.method81();
		@Pc(21) int local21 = aClass197_85.method5076("details");
		@Pc(26) int[] local26 = aClass197_85.method5078(local21);
		for (@Pc(28) int local28 = 0; local28 < local26.length; local28++) {
			@Pc(37) Class2_Sub2_Sub17 local37 = Static57.method1674(local26[local28], local21, aClass197_85);
			Class216.aClass4_124.method87(local37, (long) local37.anInt6856);
		}
		Static257.method4767(false);
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "()V", line = 354)
	public static void method5514() {
		aByteArray88 = null;
		aByteArray86 = null;
		aShortArray120 = null;
		aByteArray90 = null;
		aByteArray89 = null;
		aShortArray121 = null;
		aByteArray87 = null;
		aClass4_125 = null;
		aClass36ArrayArrayArray2 = null;
		anIntArray406 = null;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(I)Lclient!vj;", line = 366)
	public static Class2_Sub2_Sub17 method5515(@OriginalArg(0) int arg0) {
		return (Class2_Sub2_Sub17) Class216.aClass4_124.method90((long) arg0);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!ci;III)I", line = 370)
	private static int method5516(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class148 local4 = aClass72_6.method2107(arg1);
		if (local4 == null) {
			return 0;
		}
		@Pc(11) int local11 = local4.anInt3758;
		if (local11 >= 0 && arg0.method2660(local11).aBoolean438) {
			local11 = -1;
		}
		@Pc(68) int local68;
		@Pc(27) int local27;
		@Pc(33) int local33;
		@Pc(55) int local55;
		if (local4.anInt3753 >= 0) {
			local27 = local4.anInt3753;
			local33 = (local27 & 0x7F) + arg3;
			if (local33 < 0) {
				local33 = 0;
			} else if (local33 > 127) {
				local33 = 127;
			}
			local55 = (local27 + arg2 & 0xFC00) + (local27 & 0x380) + local33;
			local68 = Static169.anIntArray204[Static25.method863(Static26.method870(local55)) & 0xFFFF] | 0xFF000000;
		} else if (local11 >= 0) {
			local68 = Static169.anIntArray204[Static25.method863(Static26.method870(arg0.method2660(local11).aShort87)) & 0xFFFF] | 0xFF000000;
		} else if (local4.anInt3765 == -1) {
			local68 = 0;
		} else {
			local27 = local4.anInt3765;
			local33 = (local27 & 0x7F) + arg3;
			if (local33 < 0) {
				local33 = 0;
			} else if (local33 > 127) {
				local33 = 127;
			}
			local55 = (local27 + arg2 & 0xFC00) + (local27 & 0x380) + local33;
			local68 = Static169.anIntArray204[Static25.method863(Static26.method870(local55)) & 0xFFFF] | 0xFF000000;
		}
		return local68;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(II)Lclient!wc;", line = 427)
	public static Class246 method5517(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class246 local3 = new Class246();
		for (@Pc(8) Class2_Sub2_Sub17 local8 = (Class2_Sub2_Sub17) Class216.aClass4_124.method80(); local8 != null; local8 = (Class2_Sub2_Sub17) Class216.aClass4_124.method79()) {
			if (local8.aBoolean466 && local8.method6148(arg1, arg0)) {
				local3.method6342(local8);
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!wm;IIII)Lclient!ld;", line = 444)
	private static Class135 method5518(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(4) Class2_Sub20 local4 = (Class2_Sub20) Class216.aClass135_36.method3552(); local4 != null; local4 = (Class2_Sub20) Class216.aClass135_36.method3553()) {
			method5530(arg0, local4, arg1, arg2);
		}
		return Class216.aClass135_36;
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(I)V", line = 454)
	public static void method5519(@OriginalArg(0) int arg0) {
		aClass2_Sub2_Sub17_3 = (Class2_Sub2_Sub17) Class216.aClass4_124.method90((long) arg0);
	}

	@OriginalMember(owner = "client!tt", name = "c", descriptor = "()V", line = 457)
	public static void method5520() {
		aByteArray88 = new byte[anInt6044 * anInt6040];
		aByteArray90 = new byte[anInt6044 * anInt6040];
		aByteArray89 = new byte[anInt6044 * anInt6040];
		aShortArray121 = new short[anInt6044 * anInt6040];
		aByteArray87 = new byte[anInt6044 * anInt6040];
		aClass4_125 = new Class4(1024);
		aClass36ArrayArrayArray2 = new Class36[3][anInt6044 >> 6][anInt6040 >> 6];
		anIntArray406 = new int[aClass72_6.anInt2056 + 1];
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "([B[B[SII)V", line = 468)
	private static void method5521(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int[] local2 = new int[anInt6040];
		@Pc(5) int[] local5 = new int[anInt6040];
		@Pc(8) int[] local8 = new int[anInt6040];
		@Pc(11) int[] local11 = new int[anInt6040];
		@Pc(14) int[] local14 = new int[anInt6040];
		for (@Pc(16) int local16 = -5; local16 < anInt6044; local16++) {
			@Pc(21) int local21 = local16 + 5;
			@Pc(25) int local25 = local16 - 5;
			@Pc(41) int local41;
			for (@Pc(27) int local27 = 0; local27 < anInt6040; local27++) {
				@Pc(50) Class225 local50;
				@Pc(86) int local86;
				if (local21 < anInt6044) {
					local41 = arg0[local21 + local27 * anInt6044] & 0xFF;
					if (local41 > 0) {
						local50 = aClass241_4.method6272(local41 - 1);
						local2[local27] += local50.anInt6366;
						local5[local27] += local50.anInt6367;
						local8[local27] += local50.anInt6369;
						local11[local27] += local50.anInt6360;
						local86 = local14[local27]++;
					}
				}
				if (local25 >= 0) {
					local41 = arg0[local25 + local27 * anInt6044] & 0xFF;
					if (local41 > 0) {
						local50 = aClass241_4.method6272(local41 - 1);
						local2[local27] -= local50.anInt6366;
						local5[local27] -= local50.anInt6367;
						local8[local27] -= local50.anInt6369;
						local11[local27] -= local50.anInt6360;
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
				for (@Pc(167) int local167 = -5; local167 < anInt6040; local167++) {
					@Pc(172) int local172 = local167 + 5;
					if (local172 < anInt6040) {
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
						if ((arg0[local16 + local167 * anInt6044] & 0xFF) == 0) {
							local261 = local16 + local167 * anInt6044;
							arg1[local261] = 0;
							arg2[local261] = 0;
						} else {
							local261 = local163 == 0 ? 0 : Static169.method3382(local41 * 256 / local163, local161 / local165, local159 / local165);
							@Pc(294) int local294 = (local261 & 0x7F) + arg4;
							if (local294 < 0) {
								local294 = 0;
							} else if (local294 > 127) {
								local294 = 127;
							}
							@Pc(316) int local316 = (local261 + arg3 & 0xFC00) + (local261 & 0x380) + local294;
							@Pc(322) int local322 = local16 + local167 * anInt6044;
							@Pc(333) int local333 = Static169.anIntArray204[Static25.method863(Static280.method5210(local316)) & 0xFFFF];
							arg1[local322] = (byte) (local333 >> 16 & 0xFF);
							arg2[local322] = (short) (local333 & 0xFFFF);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!wm;II)V", line = 612)
	public static void method5522(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class2_Sub4 local9 = new Class2_Sub4(aClass197_85.method5085(aClass2_Sub2_Sub17_3.aString67, "area"));
		@Pc(13) int local13 = local9.method4816();
		@Pc(16) int[] local16 = new int[local13];
		for (@Pc(18) int local18 = 0; local18 < local13; local18++) {
			local16[local18] = local9.method4816();
		}
		@Pc(33) int local33 = local9.method4816();
		@Pc(36) int[] local36 = new int[local33];
		for (@Pc(38) int local38 = 0; local38 < local33; local38++) {
			local36[local38] = local9.method4816();
		}
		while (true) {
			@Pc(58) int local58;
			@Pc(64) int local64;
			@Pc(67) int local67;
			@Pc(76) int local76;
			@Pc(148) int local148;
			while (local9.anInt5289 < local9.aByteArray73.length) {
				@Pc(62) int local62;
				@Pc(84) int local84;
				if (local9.method4816() == 0) {
					local58 = local9.method4816();
					local62 = local9.method4816();
					for (local64 = 0; local64 < 64; local64++) {
						for (local67 = 0; local67 < 64; local67++) {
							local76 = local58 * 64 + local64 - anInt6045;
							local84 = local62 * 64 + local67 - anInt6043;
							method5511(arg0, local9, local58, local62, local76, local84, local16, local36);
						}
					}
				} else {
					local58 = local9.method4816();
					local62 = local9.method4816();
					local64 = local9.method4816();
					local67 = local9.method4816();
					for (local76 = 0; local76 < 8; local76++) {
						for (local84 = 0; local84 < 8; local84++) {
							@Pc(136) int local136 = local58 * 64 + local64 * 8 + local76 - anInt6045;
							local148 = local62 * 64 + local67 * 8 + local84 - anInt6043;
							method5511(arg0, local9, local58, local62, local136, local148, local16, local36);
						}
					}
				}
			}
			aByteArray86 = new byte[anInt6044 * anInt6040];
			aShortArray120 = new short[anInt6044 * anInt6040];
			for (local58 = 0; local58 < 3; local58++) {
				@Pc(191) byte[] local191 = new byte[anInt6044 * anInt6040];
				for (local64 = 0; local64 < aClass36ArrayArrayArray2[local58].length; local64++) {
					for (local67 = 0; local67 < aClass36ArrayArrayArray2[local58][0].length; local67++) {
						@Pc(205) Class36 local205 = aClass36ArrayArrayArray2[local58][local64][local67];
						if (local205 != null) {
							for (@Pc(212) Class12_Sub7 local212 = (Class12_Sub7) local205.method1417(); local212 != null; local212 = (Class12_Sub7) local205.method1422()) {
								local191[local64 * 64 + local212.aByte62 + (local67 * 64 + local212.aByte61) * anInt6044] = (byte) local212.anInt5871;
							}
						}
					}
				}
				method5521(local191, aByteArray86, aShortArray120, arg1, arg2);
				for (local67 = 0; local67 < aClass36ArrayArrayArray2[local58].length; local67++) {
					for (local76 = 0; local76 < aClass36ArrayArrayArray2[local58][0].length; local76++) {
						@Pc(276) Class36 local276 = aClass36ArrayArrayArray2[local58][local67][local76];
						if (local276 != null) {
							for (@Pc(283) Class12_Sub7 local283 = (Class12_Sub7) local276.method1417(); local283 != null; local283 = (Class12_Sub7) local276.method1422()) {
								local148 = local67 * 64 + local283.aByte62 + (local76 * 64 + local283.aByte61) * anInt6044;
								local283.anInt5871 = (aByteArray86[local148] & 0xFF) << 16 | aShortArray120[local148] & 0xFFFF;
								if (local283.anInt5871 != 0) {
									local283.anInt5871 |= 0xFF000000;
								}
							}
						}
					}
				}
			}
			method5521(aByteArray88, aByteArray86, aShortArray120, arg1, arg2);
			aByteArray88 = null;
			method5532();
			return;
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!wm;)V", line = 791)
	public static void method5523(@OriginalArg(0) Class19 arg0) {
		@Pc(3) int local3 = anInt6042 - anInt6046;
		@Pc(7) int local7 = anInt6048 - anInt6047;
		@Pc(15) int local15 = (anInt6039 - anInt6038 << 16) / local3;
		@Pc(23) int local23 = (anInt6049 - anInt6041 << 16) / local7;
		method5526(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(Lclient!wm;)Lclient!ld;", line = 828)
	public static Class135 method5525(@OriginalArg(0) Class19 arg0) {
		@Pc(3) int local3 = anInt6042 - anInt6046;
		@Pc(7) int local7 = anInt6048 - anInt6047;
		@Pc(15) int local15 = (anInt6039 - anInt6038 << 16) / local3;
		@Pc(23) int local23 = (anInt6049 - anInt6041 << 16) / local7;
		return method5518(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(Lclient!wm;IIII)V", line = 842)
	private static void method5526(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = anInt6042 - anInt6046;
		@Pc(7) int local7 = anInt6048 - anInt6047;
		if (anInt6042 < anInt6044) {
			local3++;
		}
		if (anInt6048 < anInt6040) {
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
			local28 = (arg1 * local17 >> 16) + anInt6038;
			local40 = (arg1 * (local17 + 1) >> 16) + anInt6038;
			local44 = local40 - local28;
			if (local44 > 0) {
				local50 = anInt6046 + local17;
				if (local50 >= 0 && local50 < anInt6044) {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt6049 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt6049 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (local84 > 0) {
							local93 = local57 + anInt6047;
							local173 = local50 + local93 * anInt6044;
							local175 = 0;
							local177 = 0;
							local179 = 0;
							if (local93 >= 0 && local93 < anInt6040) {
								local175 = (aByteArray86[local173] & 0xFF) << 16 | aShortArray120[local173] & 0xFFFF;
								if (local175 != 0) {
									local175 |= 0xFF000000;
								}
								local177 = aByteArray90[local173] & 0xFF;
								local179 = aShortArray121[local173] & 0xFFFF;
							}
							if (local175 == 0 && local177 == 0 && local179 == 0) {
								if (aClass2_Sub2_Sub17_3.anInt6851 != -1) {
									local175 = aClass2_Sub2_Sub17_3.anInt6851 | 0xFF000000;
								} else if ((local17 + anInt6046 & 0x4) == (local57 + anInt6048 & 0x4)) {
									local175 = anIntArray406[aClass72_6.anInt2057 + 1];
								} else {
									local175 = -11840664;
								}
								if (local175 == 0) {
									local175 = -16777216;
								}
								arg0.method2903(local28, local70, local44, local84, local175, 0);
							} else if (local179 <= 0) {
								method5510(arg0, local28, local70, local44, local84, local175, local177, aByteArray89[local173], null, null, true);
							} else if (local179 == 65535) {
								@Pc(282) Class2_Sub29 local282 = (Class2_Sub29) aClass4_125.method90((long) (local50 << 16 | local93));
								if (local282 != null) {
									method5510(arg0, local28, local70, local44, local84, local175, local177, aByteArray89[local173], local282.aShortArray108, local282.aByteArray71, true);
								}
							} else {
								Class216.aShortArray119[0] = (short) (local179 - 1);
								Class216.aByteArray85[0] = aByteArray87[local173];
								method5510(arg0, local28, local70, local44, local84, local175, local177, aByteArray89[local173], Class216.aShortArray119, Class216.aByteArray85, true);
							}
						}
					}
				} else {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt6049 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt6049 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (aClass2_Sub2_Sub17_3.anInt6851 != -1) {
							local93 = aClass2_Sub2_Sub17_3.anInt6851 | 0xFF000000;
						} else if ((local17 + anInt6046 & 0x4) == (local57 + anInt6048 & 0x4)) {
							local93 = anIntArray406[aClass72_6.anInt2057 + 1];
						} else {
							local93 = -11840664;
						}
						if (local93 == 0) {
							local93 = -16777216;
						}
						arg0.method2903(local28, local70, local44, local84, local93, 0);
					}
				}
			}
		}
		for (local28 = -16; local28 < local3 + 16; local28++) {
			local40 = (arg1 * local28 >> 16) + anInt6038;
			local44 = (arg1 * (local28 + 1) >> 16) + anInt6038;
			local50 = local44 - local40;
			if (local50 > 0) {
				local57 = local28 + anInt6046;
				if (local57 >= 0 && local57 < anInt6044) {
					for (local70 = -16; local70 < local7 + 16; local70++) {
						local80 = anInt6049 - (arg2 * (local70 + 1) >> 16);
						local84 = anInt6049 - (arg2 * local70 >> 16);
						local93 = local84 - local80;
						if (local93 > 0) {
							local173 = local70 + anInt6047;
							if (local173 >= 0 && local173 < anInt6040) {
								local175 = aShortArray121[local57 + local173 * anInt6044] & 0xFFFF;
								if (local175 <= 0) {
									method5527(arg0, local40, local80, local50, local93, null, null);
								} else if (local175 == 65535) {
									@Pc(459) Class2_Sub29 local459 = (Class2_Sub29) aClass4_125.method90((long) (local57 << 16 | local173));
									if (local459 != null) {
										method5527(arg0, local40, local80, local50, local93, local459.aShortArray108, local459.aByteArray71);
									}
								} else {
									Class216.aShortArray119[0] = (short) (local175 - 1);
									Class216.aByteArray85[0] = aByteArray87[local57 + local173 * anInt6044];
									method5527(arg0, local40, local80, local50, local93, Class216.aShortArray119, Class216.aByteArray85);
								}
							}
						}
					}
				}
			}
		}
		local40 = anInt6046 >> 6;
		local44 = anInt6047 >> 6;
		if (local40 < 0) {
			local40 = 0;
		}
		if (local44 < 0) {
			local44 = 0;
		}
		local50 = anInt6042 >> 6;
		local57 = anInt6048 >> 6;
		if (local50 >= aClass36ArrayArrayArray2[0].length) {
			local50 = aClass36ArrayArrayArray2[0].length - 1;
		}
		if (local57 >= aClass36ArrayArrayArray2[0][0].length) {
			local57 = aClass36ArrayArrayArray2[0][0].length - 1;
		}
		for (local70 = 0; local70 < 3; local70++) {
			@Pc(641) int local641;
			@Pc(653) int local653;
			@Pc(665) int local665;
			@Pc(675) int local675;
			@Pc(631) int local631;
			for (local80 = local40; local80 <= local50; local80++) {
				for (local84 = local44; local84 <= local57; local84++) {
					@Pc(589) Class36 local589 = aClass36ArrayArrayArray2[local70][local80][local84];
					if (local589 != null) {
						local173 = (local80 + (anInt6045 >> 6)) * 64;
						local175 = (local84 + (anInt6043 >> 6)) * 64;
						for (@Pc(612) Class12_Sub7 local612 = (Class12_Sub7) local589.method1417(); local612 != null; local612 = (Class12_Sub7) local589.method1422()) {
							local179 = local173 + local612.aByte62 - anInt6045 - anInt6046;
							local631 = local175 + local612.aByte61 - anInt6043 - anInt6047;
							local641 = (arg1 * local179 >> 16) + anInt6038;
							local653 = (arg1 * (local179 + 1) >> 16) + anInt6038;
							local665 = anInt6049 - (arg2 * (local631 + 1) >> 16);
							local675 = anInt6049 - (arg2 * local631 >> 16);
							method5510(arg0, local641, local665, local653 - local641, local675 - local665, local612.anInt5871, local612.aByte63 & 0xFF, local612.aByte64, local612.aShortArray115, local612.aByteArray76, false);
						}
					}
				}
			}
			for (local84 = local40; local84 <= local50; local84++) {
				for (local93 = local44; local93 <= local57; local93++) {
					@Pc(727) Class36 local727 = aClass36ArrayArrayArray2[local70][local84][local93];
					if (local727 != null) {
						local175 = (local84 + (anInt6045 >> 6)) * 64;
						local177 = (local93 + (anInt6043 >> 6)) * 64;
						for (@Pc(750) Class12_Sub7 local750 = (Class12_Sub7) local727.method1417(); local750 != null; local750 = (Class12_Sub7) local727.method1422()) {
							local631 = local175 + local750.aByte62 - anInt6045 - anInt6046;
							local641 = local177 + local750.aByte61 - anInt6043 - anInt6047;
							local653 = (arg1 * local631 >> 16) + anInt6038;
							local665 = (arg1 * (local631 + 1) >> 16) + anInt6038;
							local675 = anInt6049 - (arg2 * (local641 + 1) >> 16);
							@Pc(813) int local813 = anInt6049 - (arg2 * local641 >> 16);
							method5527(arg0, local653, local675, local665 - local653, local813 - local675, local750.aShortArray115, local750.aByteArray76);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!wm;IIII[S[B)V", line = 1184)
	private static void method5527(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		if (arg5 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < arg5.length; local4++) {
			@Pc(14) Class41 local14 = aClass202_3.method5164(arg5[local4] & 0xFFFF);
			@Pc(17) int local17 = local14.anInt1315;
			if (local17 != -1) {
				@Pc(25) Class146 local25 = aClass104_4.method2710(local17);
				@Pc(49) Class13 local49 = local25.method3712(local14.aBoolean118 ? local14.aBoolean113 : false, local14.aBoolean115 ? arg6[local4] >> 6 & 0x3 : 0, arg0);
				if (local49 != null) {
					@Pc(58) int local58 = arg3 * local49.method6400() >> 2;
					@Pc(65) int local65 = arg4 * local49.method6385() >> 2;
					if (local25.aBoolean243) {
						@Pc(71) int local71 = local14.anInt1354;
						@Pc(74) int local74 = local14.anInt1326;
						if ((arg6[local4] >> 6 & 0x1) == 1) {
							@Pc(85) int local85 = local71;
							local71 = local74;
							local74 = local85;
						}
						local58 = local71 * arg3;
						local65 = local74 * arg4;
					}
					if (local58 != 0 && local65 != 0) {
						if (local25.anInt3748 == 0) {
							local49.method6389(arg1, arg2 + arg4 - local65, local58, local65);
						} else {
							local49.method6396(arg1, arg2 + arg4 - local65, local58, local65, 1, local25.anInt3748 | 0xFF000000, 1);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(II)Lclient!vj;", line = 1244)
	public static Class2_Sub2_Sub17 method5528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(4) Class2_Sub2_Sub17 local4 = (Class2_Sub2_Sub17) Class216.aClass4_124.method80(); local4 != null; local4 = (Class2_Sub2_Sub17) Class216.aClass4_124.method79()) {
			if (local4.aBoolean466 && local4.method6148(arg1, arg0)) {
				return local4;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!ci;II)V", line = 1258)
	public static void method5529(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < aClass72_6.anInt2056; local1++) {
			anIntArray406[local1 + 1] = method5516(arg0, local1, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!wm;Lclient!jg;IIII)V", line = 1272)
	private static void method5530(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class2_Sub20 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		arg1.anInt2945 = anInt6038 + (arg2 * (arg1.anInt2946 - anInt6046) >> 16);
		arg1.anInt2941 = anInt6049 - (arg3 * (arg1.anInt2949 - anInt6047) >> 16);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIIIIIII)V", line = 1276)
	public static void method5531(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		anInt6046 = arg0 - anInt6045;
		anInt6048 = arg1 - anInt6043;
		anInt6042 = arg2 - anInt6045;
		anInt6047 = arg3 - anInt6043;
		anInt6038 = arg4;
		anInt6041 = arg5;
		anInt6039 = arg6;
		anInt6049 = arg7;
	}

	@OriginalMember(owner = "client!tt", name = "e", descriptor = "()V", line = 1288)
	private static void method5532() {
		@Pc(4) int local4;
		@Pc(15) int local15;
		@Pc(49) int local49;
		for (@Pc(1) int local1 = 0; local1 < anInt6044; local1++) {
			for (local4 = 0; local4 < anInt6040; local4++) {
				local15 = aShortArray121[local1 + local4 * anInt6044] & 0xFFFF;
				if (local15 != 0) {
					@Pc(35) int local35;
					if (local15 == 65535) {
						@Pc(31) Class2_Sub29 local31 = (Class2_Sub29) aClass4_125.method90((long) (local1 << 16 | local4));
						if (local31 != null) {
							for (local35 = 0; local35 < local31.aShortArray108.length; local35++) {
								@Pc(46) Class41 local46 = aClass202_3.method5164(local31.aShortArray108[local35] & 0xFFFF);
								local49 = local46.anInt1305;
								if (local46.anIntArray94 != null) {
									local46 = local46.method1535(anInterface11_2);
									if (local46 != null) {
										local49 = local46.anInt1305;
									}
								}
								if (local49 != -1) {
									@Pc(70) Class2_Sub20 local70 = new Class2_Sub20(local49);
									local70.anInt2946 = local1;
									local70.anInt2949 = local4;
									Class216.aClass135_36.method3541(local70);
								}
							}
						}
					} else {
						@Pc(94) Class41 local94 = aClass202_3.method5164(local15 - 1);
						local35 = local94.anInt1305;
						if (local94.anIntArray94 != null) {
							local94 = local94.method1535(anInterface11_2);
							if (local94 != null) {
								local35 = local94.anInt1305;
							}
						}
						if (local35 != -1) {
							@Pc(118) Class2_Sub20 local118 = new Class2_Sub20(local35);
							local118.anInt2946 = local1;
							local118.anInt2949 = local4;
							Class216.aClass135_36.method3541(local118);
						}
					}
				}
			}
		}
		for (local4 = 0; local4 < 3; local4++) {
			for (local15 = 0; local15 < aClass36ArrayArrayArray2[0].length; local15++) {
				for (@Pc(144) int local144 = 0; local144 < aClass36ArrayArrayArray2[0][0].length; local144++) {
					@Pc(153) Class36 local153 = aClass36ArrayArrayArray2[local4][local15][local144];
					if (local153 != null) {
						for (@Pc(160) Class12_Sub7 local160 = (Class12_Sub7) local153.method1417(); local160 != null; local160 = (Class12_Sub7) local153.method1422()) {
							if (local160.aShortArray115 != null) {
								for (local49 = 0; local49 < local160.aShortArray115.length; local49++) {
									@Pc(177) Class41 local177 = aClass202_3.method5164(local160.aShortArray115[local49] & 0xFFFF);
									@Pc(180) int local180 = local177.anInt1305;
									if (local177.anIntArray94 != null) {
										local177 = local177.method1535(anInterface11_2);
										if (local177 != null) {
											local180 = local177.anInt1305;
										}
									}
									if (local180 != -1) {
										@Pc(201) Class2_Sub20 local201 = new Class2_Sub20(local180);
										local201.anInt2946 = (local15 + (anInt6045 >> 6)) * 64 + local160.aByte62 - anInt6045;
										local201.anInt2949 = (local144 + (anInt6043 >> 6)) * 64 + local160.aByte61 - anInt6043;
										Class216.aClass135_36.method3541(local201);
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
