import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static491 {

	@OriginalMember(owner = "client!ql", name = "n", descriptor = "Lclient!hg;")
	private static Class152 aClass152_2;

	@OriginalMember(owner = "client!ql", name = "G", descriptor = "Lclient!ada;")
	public static Interface1 anInterface1_2;

	@OriginalMember(owner = "client!ql", name = "k", descriptor = "Lclient!gv;")
	private static Class141 aClass141_2;

	@OriginalMember(owner = "client!ql", name = "p", descriptor = "Lclient!eka;")
	public static Class97 aClass97_2;

	@OriginalMember(owner = "client!ql", name = "H", descriptor = "Lclient!mq;")
	public static Class243 aClass243_2;

	@OriginalMember(owner = "client!ql", name = "N", descriptor = "Lclient!gda;")
	public static Class126 aClass126_25;

	@OriginalMember(owner = "client!ql", name = "u", descriptor = "Lclient!sda;")
	public static Class327 aClass327_2;

	@OriginalMember(owner = "client!ql", name = "o", descriptor = "Lclient!pja;")
	public static Class5_Sub1_Sub16 aClass5_Sub1_Sub16_2;

	@OriginalMember(owner = "client!ql", name = "r", descriptor = "F")
	public static float aFloat23;

	@OriginalMember(owner = "client!ql", name = "m", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!ql", name = "L", descriptor = "F")
	public static float aFloat24;

	@OriginalMember(owner = "client!ql", name = "A", descriptor = "Lclient!wm;")
	public static Class396 aClass396_2;

	@OriginalMember(owner = "client!ql", name = "d", descriptor = "I")
	public static int anInt616;

	@OriginalMember(owner = "client!ql", name = "t", descriptor = "[B")
	private static byte[] aByteArray8;

	@OriginalMember(owner = "client!ql", name = "J", descriptor = "I")
	public static int anInt617;

	@OriginalMember(owner = "client!ql", name = "E", descriptor = "I")
	public static int anInt618;

	@OriginalMember(owner = "client!ql", name = "I", descriptor = "I")
	public static int anInt619;

	@OriginalMember(owner = "client!ql", name = "x", descriptor = "I")
	public static int anInt620;

	@OriginalMember(owner = "client!ql", name = "q", descriptor = "I")
	public static int anInt621;

	@OriginalMember(owner = "client!ql", name = "s", descriptor = "[B")
	private static byte[] aByteArray9;

	@OriginalMember(owner = "client!ql", name = "z", descriptor = "I")
	public static int anInt622;

	@OriginalMember(owner = "client!ql", name = "i", descriptor = "[S")
	private static short[] aShortArray6;

	@OriginalMember(owner = "client!ql", name = "l", descriptor = "Lclient!qr;")
	private static Class306 aClass306_7;

	@OriginalMember(owner = "client!ql", name = "K", descriptor = "[B")
	private static byte[] aByteArray10;

	@OriginalMember(owner = "client!ql", name = "e", descriptor = "[I")
	private static int[] anIntArray49;

	@OriginalMember(owner = "client!ql", name = "F", descriptor = "[S")
	private static short[] aShortArray7;

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "[B")
	private static byte[] aByteArray11;

	@OriginalMember(owner = "client!ql", name = "w", descriptor = "I")
	public static int anInt623;

	@OriginalMember(owner = "client!ql", name = "j", descriptor = "I")
	public static int anInt624;

	@OriginalMember(owner = "client!ql", name = "y", descriptor = "I")
	public static int anInt625;

	@OriginalMember(owner = "client!ql", name = "h", descriptor = "I")
	public static int anInt626;

	@OriginalMember(owner = "client!ql", name = "B", descriptor = "I")
	public static int anInt627;

	@OriginalMember(owner = "client!ql", name = "C", descriptor = "I")
	public static int anInt628;

	@OriginalMember(owner = "client!ql", name = "D", descriptor = "[B")
	private static byte[] aByteArray12;

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "[[[Lclient!wc;")
	private static Class387[][][] aClass387ArrayArrayArray2;

	@OriginalMember(owner = "client!ql", name = "P", descriptor = "Lclient!qr;")
	private static final Class306 aClass306_6 = new Class306(16);

	@OriginalMember(owner = "client!ql", name = "f", descriptor = "Lclient!at;")
	public static final Class20 aClass20_4 = new Class20();

	@OriginalMember(owner = "client!ql", name = "v", descriptor = "I")
	public static int anInt614 = (int) (Math.random() * 11.0D) - 5;

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "[B")
	private static final byte[] aByteArray7 = new byte[1];

	@OriginalMember(owner = "client!ql", name = "M", descriptor = "I")
	public static int anInt615 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!ql", name = "g", descriptor = "[S")
	private static final short[] aShortArray5 = new short[1];

	@OriginalMember(owner = "client!ql", name = "d", descriptor = "()V")
	public static void method654() {
		@Pc(2) int[] local2 = new int[3];
		for (@Pc(4) int local4 = 0; local4 < aClass396_2.anInt10843; local4++) {
			@Pc(32) boolean local32 = aClass5_Sub1_Sub16_2.method6483(aClass396_2.anIntArray622[local4] >> 14 & 0x3FFF, aClass396_2.anIntArray622[local4] >> 28 & 0x3, aClass396_2.anIntArray622[local4] & 0x3FFF, local2);
			if (local32) {
				@Pc(42) Class5_Sub49 local42 = new Class5_Sub49(aClass396_2.anIntArray621[local4]);
				local42.anInt8671 = local2[1] - anInt622;
				local42.anInt8670 = local2[2] - anInt617;
				aClass20_4.method370(local42);
			}
		}
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(Lclient!ha;IIII)Lclient!at;")
	private static Class20 method655(@OriginalArg(0) Class100 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(4) Class5_Sub49 local4 = (Class5_Sub49) aClass20_4.method378(); local4 != null; local4 = (Class5_Sub49) aClass20_4.method366()) {
			method674(arg0, local4, arg1, arg2);
		}
		return aClass20_4;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)Lclient!wca;")
	public static Class388 method656(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class388 local3 = new Class388();
		for (@Pc(8) Class5_Sub1_Sub16 local8 = (Class5_Sub1_Sub16) aClass306_6.method6941(); local8 != null; local8 = (Class5_Sub1_Sub16) aClass306_6.method6940()) {
			if (local8.aBoolean506 && local8.method6481(arg1, arg0)) {
				local3.method9022(local8);
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "([B[B[SII)V")
	private static void method657(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int[] local2 = new int[anInt619];
		@Pc(5) int[] local5 = new int[anInt619];
		@Pc(8) int[] local8 = new int[anInt619];
		@Pc(11) int[] local11 = new int[anInt619];
		@Pc(14) int[] local14 = new int[anInt619];
		for (@Pc(16) int local16 = -5; local16 < anInt624; local16++) {
			@Pc(21) int local21 = local16 + 5;
			@Pc(25) int local25 = local16 - 5;
			@Pc(41) int local41;
			for (@Pc(27) int local27 = 0; local27 < anInt619; local27++) {
				@Pc(50) Class367 local50;
				@Pc(86) int local86;
				if (local21 < anInt624) {
					local41 = arg0[local21 + local27 * anInt624] & 0xFF;
					if (local41 > 0) {
						local50 = aClass152_2.method3422(local41 - 1);
						local2[local27] += local50.anInt9843;
						local5[local27] += local50.anInt9838;
						local8[local27] += local50.anInt9845;
						local11[local27] += local50.anInt9835;
						local86 = local14[local27]++;
					}
				}
				if (local25 >= 0) {
					local41 = arg0[local25 + local27 * anInt624] & 0xFF;
					if (local41 > 0) {
						local50 = aClass152_2.method3422(local41 - 1);
						local2[local27] -= local50.anInt9843;
						local5[local27] -= local50.anInt9838;
						local8[local27] -= local50.anInt9845;
						local11[local27] -= local50.anInt9835;
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
				for (@Pc(167) int local167 = -5; local167 < anInt619; local167++) {
					@Pc(172) int local172 = local167 + 5;
					if (local172 < anInt619) {
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
						if ((arg0[local16 + local167 * anInt624] & 0xFF) == 0) {
							local261 = local16 + local167 * anInt624;
							arg1[local261] = 0;
							arg2[local261] = 0;
						} else {
							local261 = local163 == 0 ? 0 : Static91.method5830(local41 * 256 / local163, local159 / local165, local161 / local165);
							@Pc(294) int local294 = (local261 & 0x7F) + arg4;
							if (local294 < 0) {
								local294 = 0;
							} else if (local294 > 127) {
								local294 = 127;
							}
							@Pc(316) int local316 = (local261 + arg3 & 0xFC00) + (local261 & 0x380) + local294;
							@Pc(322) int local322 = local16 + local167 * anInt624;
							@Pc(333) int local333 = Static305.anIntArray314[Static161.method2975(Static420.method6162(local316)) & 0xFFFF];
							arg1[local322] = (byte) (local333 >> 16 & 0xFF);
							arg2[local322] = (short) (local333 & 0xFFFF);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!ha;)V")
	public static void method658(@OriginalArg(0) Class100 arg0) {
		@Pc(3) int local3 = anInt626 - anInt618;
		@Pc(7) int local7 = anInt625 - anInt623;
		@Pc(15) int local15 = (anInt621 - anInt620 << 16) / local3;
		@Pc(23) int local23 = (anInt628 - anInt627 << 16) / local7;
		method669(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(Lclient!ha;)Lclient!at;")
	public static Class20 method660(@OriginalArg(0) Class100 arg0) {
		@Pc(3) int local3 = anInt626 - anInt618;
		@Pc(7) int local7 = anInt625 - anInt623;
		@Pc(15) int local15 = (anInt621 - anInt620 << 16) / local3;
		@Pc(23) int local23 = (anInt628 - anInt627 << 16) / local7;
		return method655(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!d;II)V")
	public static void method661(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < aClass141_2.anInt3612; local1++) {
			anIntArray49[local1 + 1] = method663(arg0, local1, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "()V")
	public static void method662() {
		aByteArray9 = new byte[anInt624 * anInt619];
		aByteArray8 = new byte[anInt624 * anInt619];
		aByteArray12 = new byte[anInt624 * anInt619];
		aShortArray6 = new short[anInt624 * anInt619];
		aByteArray10 = new byte[anInt624 * anInt619];
		aClass306_7 = new Class306(1024);
		aClass387ArrayArrayArray2 = new Class387[3][anInt624 >> 6][anInt619 >> 6];
		anIntArray49 = new int[aClass141_2.anInt3612 + 1];
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!d;III)I")
	private static int method663(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class181 local4 = aClass141_2.method3314(arg1);
		if (local4 == null) {
			return 0;
		}
		@Pc(11) int local11 = local4.anInt4676;
		if (local11 >= 0 && arg0.method7423(local11).aBoolean56) {
			local11 = -1;
		}
		@Pc(68) int local68;
		@Pc(27) int local27;
		@Pc(33) int local33;
		@Pc(55) int local55;
		if (local4.anInt4677 >= 0) {
			local27 = local4.anInt4677;
			local33 = (local27 & 0x7F) + arg3;
			if (local33 < 0) {
				local33 = 0;
			} else if (local33 > 127) {
				local33 = 127;
			}
			local55 = (local27 + arg2 & 0xFC00) + (local27 & 0x380) + local33;
			local68 = Static305.anIntArray314[Static161.method2975(Static457.method6441(local55)) & 0xFFFF] | 0xFF000000;
		} else if (local11 >= 0) {
			local68 = Static305.anIntArray314[Static161.method2975(Static457.method6441(arg0.method7423(local11).aShort26)) & 0xFFFF] | 0xFF000000;
		} else if (local4.anInt4663 == -1) {
			local68 = 0;
		} else {
			local27 = local4.anInt4663;
			local33 = (local27 & 0x7F) + arg3;
			if (local33 < 0) {
				local33 = 0;
			} else if (local33 > 127) {
				local33 = 127;
			}
			local55 = (local27 + arg2 & 0xFC00) + (local27 & 0x380) + local33;
			local68 = Static305.anIntArray314[Static161.method2975(Static457.method6441(local55)) & 0xFFFF] | 0xFF000000;
		}
		return local68;
	}

	@OriginalMember(owner = "client!ql", name = "e", descriptor = "()V")
	private static void method664() {
		@Pc(4) int local4;
		@Pc(15) int local15;
		@Pc(49) int local49;
		for (@Pc(1) int local1 = 0; local1 < anInt624; local1++) {
			for (local4 = 0; local4 < anInt619; local4++) {
				local15 = aShortArray6[local1 + local4 * anInt624] & 0xFFFF;
				if (local15 != 0) {
					@Pc(35) int local35;
					if (local15 == 65535) {
						@Pc(31) Class5_Sub25 local31 = (Class5_Sub25) aClass306_7.method6943((long) (local1 << 16 | local4));
						if (local31 != null) {
							for (local35 = 0; local35 < local31.aShortArray50.length; local35++) {
								@Pc(46) Class354 local46 = aClass243_2.method5556(local31.aShortArray50[local35] & 0xFFFF);
								local49 = local46.anInt9396;
								if (local46.anIntArray526 != null) {
									local46 = local46.method8024(anInterface1_2);
									if (local46 != null) {
										local49 = local46.anInt9396;
									}
								}
								if (local49 != -1) {
									@Pc(70) Class5_Sub49 local70 = new Class5_Sub49(local49);
									local70.anInt8671 = local1;
									local70.anInt8670 = local4;
									aClass20_4.method370(local70);
								}
							}
						}
					} else {
						@Pc(94) Class354 local94 = aClass243_2.method5556(local15 - 1);
						local35 = local94.anInt9396;
						if (local94.anIntArray526 != null) {
							local94 = local94.method8024(anInterface1_2);
							if (local94 != null) {
								local35 = local94.anInt9396;
							}
						}
						if (local35 != -1) {
							@Pc(118) Class5_Sub49 local118 = new Class5_Sub49(local35);
							local118.anInt8671 = local1;
							local118.anInt8670 = local4;
							aClass20_4.method370(local118);
						}
					}
				}
			}
		}
		for (local4 = 0; local4 < 3; local4++) {
			for (local15 = 0; local15 < aClass387ArrayArrayArray2[0].length; local15++) {
				for (@Pc(144) int local144 = 0; local144 < aClass387ArrayArrayArray2[0][0].length; local144++) {
					@Pc(153) Class387 local153 = aClass387ArrayArrayArray2[local4][local15][local144];
					if (local153 != null) {
						for (@Pc(160) Class4_Sub10 local160 = (Class4_Sub10) local153.method9018(); local160 != null; local160 = (Class4_Sub10) local153.method9016()) {
							if (local160.aShortArray140 != null) {
								for (local49 = 0; local49 < local160.aShortArray140.length; local49++) {
									@Pc(177) Class354 local177 = aClass243_2.method5556(local160.aShortArray140[local49] & 0xFFFF);
									@Pc(180) int local180 = local177.anInt9396;
									if (local177.anIntArray526 != null) {
										local177 = local177.method8024(anInterface1_2);
										if (local177 != null) {
											local180 = local177.anInt9396;
										}
									}
									if (local180 != -1) {
										@Pc(201) Class5_Sub49 local201 = new Class5_Sub49(local180);
										local201.anInt8671 = (local15 + (anInt622 >> 6)) * 64 + local160.aByte133 - anInt622;
										local201.anInt8670 = (local144 + (anInt617 >> 6)) * 64 + local160.aByte134 - anInt617;
										aClass20_4.method370(local201);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(I)V")
	public static void method665(@OriginalArg(0) int arg0) {
		aClass5_Sub1_Sub16_2 = (Class5_Sub1_Sub16) aClass306_6.method6943((long) arg0);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!ha;Lclient!sg;Lclient!rfa;)V")
	public static void method666(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class5_Sub49 arg1, @OriginalArg(2) Class313 arg2) {
		if (arg2.anIntArray472 == null) {
			return;
		}
		@Pc(7) int[] local7 = new int[arg2.anIntArray472.length];
		@Pc(20) int local20;
		@Pc(32) int local32;
		for (@Pc(9) int local9 = 0; local9 < local7.length / 2; local9++) {
			local20 = arg2.anIntArray472[local9 * 2] + arg1.anInt8671;
			local32 = arg2.anIntArray472[local9 * 2 + 1] + arg1.anInt8670;
			local7[local9 * 2] = anInt620 + (anInt621 - anInt620) * (local20 - anInt618) / (anInt626 - anInt618);
			local7[local9 * 2 + 1] = anInt628 - (anInt628 - anInt627) * (local32 - anInt623) / (anInt625 - anInt623);
		}
		Static400.method5836(arg0, local7, arg2.anInt8193);
		if (arg2.anInt8187 > 0) {
			@Pc(102) int local102;
			@Pc(110) int local110;
			@Pc(120) int local120;
			@Pc(125) int local125;
			@Pc(127) int local127;
			for (local20 = 0; local20 < local7.length / 2 - 1; local20++) {
				local32 = local7[local20 * 2];
				local102 = local7[local20 * 2 + 1];
				local110 = local7[(local20 + 1) * 2];
				local120 = local7[(local20 + 1) * 2 + 1];
				if (local110 < local32) {
					local125 = local32;
					local127 = local102;
					local32 = local110;
					local102 = local120;
					local110 = local125;
					local120 = local127;
				} else if (local110 == local32 && local120 < local102) {
					local125 = local102;
					local102 = local120;
					local120 = local125;
				}
				arg0.method8593(local32, local102, local110, local120, arg2.anIntArray473[arg2.aByteArray88[local20] & 0xFF], arg2.anInt8187, arg2.anInt8184, arg2.anInt8180);
			}
			local32 = local7[local7.length - 2];
			local102 = local7[local7.length - 1];
			local110 = local7[0];
			local120 = local7[1];
			if (local110 < local32) {
				local125 = local32;
				local127 = local102;
				local32 = local110;
				local102 = local120;
				local110 = local125;
				local120 = local127;
			} else if (local110 == local32 && local120 < local102) {
				local125 = local102;
				local102 = local120;
				local120 = local125;
			}
			arg0.method8593(local32, local102, local110, local120, arg2.anIntArray473[arg2.aByteArray88[arg2.aByteArray88.length - 1] & 0xFF], arg2.anInt8187, arg2.anInt8184, arg2.anInt8180);
			return;
		}
		for (local20 = 0; local20 < local7.length / 2 - 1; local20++) {
			arg0.method8597(local7[local20 * 2], local7[(local20 + 1) * 2], local7[(local20 + 1) * 2 + 1], arg2.anIntArray473[arg2.aByteArray88[local20] & 0xFF], local7[local20 * 2 + 1]);
		}
		arg0.method8597(local7[local7.length - 2], local7[0], local7[1], arg2.anIntArray473[arg2.aByteArray88[arg2.aByteArray88.length - 1] & 0xFF], local7[local7.length - 1]);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!ha;IIII[S[B)V")
	private static void method667(@OriginalArg(0) Class100 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		if (arg5 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < arg5.length; local4++) {
			@Pc(14) Class354 local14 = aClass243_2.method5556(arg5[local4] & 0xFFFF);
			@Pc(17) int local17 = local14.anInt9418;
			if (local17 != -1) {
				@Pc(25) Class376 local25 = aClass97_2.method1927(local17);
				@Pc(49) Class155 local49 = local25.method8774(local14.aBoolean649 ? arg6[local4] >> 6 & 0x3 : 0, local14.aBoolean647 ? local14.aBoolean640 : false, arg0);
				if (local49 != null) {
					@Pc(58) int local58 = arg3 * local49.method7206() >> 2;
					@Pc(65) int local65 = arg4 * local49.method7209() >> 2;
					if (local25.aBoolean744) {
						@Pc(71) int local71 = local14.anInt9385;
						@Pc(74) int local74 = local14.anInt9410;
						if ((arg6[local4] >> 6 & 0x1) == 1) {
							@Pc(85) int local85 = local71;
							local71 = local74;
							local74 = local85;
						}
						local58 = local71 * arg3;
						local65 = local74 * arg4;
					}
					if (local58 != 0 && local65 != 0) {
						if (local25.anInt10340 == 0) {
							local49.method7192(arg1, arg2 + arg4 - local65, local58, local65);
						} else {
							local49.method7200(arg1, arg2 + arg4 - local65, local58, local65, 0, local25.anInt10340 | 0xFF000000, 1);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)Lclient!pja;")
	public static Class5_Sub1_Sub16 method668(@OriginalArg(0) int arg0) {
		return (Class5_Sub1_Sub16) aClass306_6.method6943((long) arg0);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!ha;IIII)V")
	private static void method669(@OriginalArg(0) Class100 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = anInt626 - anInt618;
		@Pc(7) int local7 = anInt625 - anInt623;
		if (anInt626 < anInt624) {
			local3++;
		}
		if (anInt625 < anInt619) {
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
			local28 = (arg1 * local17 >> 16) + anInt620;
			local40 = (arg1 * (local17 + 1) >> 16) + anInt620;
			local44 = local40 - local28;
			if (local44 > 0) {
				local50 = anInt618 + local17;
				if (local50 >= 0 && local50 < anInt624) {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt628 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt628 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (local84 > 0) {
							local93 = local57 + anInt623;
							local173 = local50 + local93 * anInt624;
							local175 = 0;
							local177 = 0;
							local179 = 0;
							if (local93 >= 0 && local93 < anInt619) {
								local175 = (aByteArray11[local173] & 0xFF) << 16 | aShortArray7[local173] & 0xFFFF;
								if (local175 != 0) {
									local175 |= 0xFF000000;
								}
								local177 = aByteArray8[local173] & 0xFF;
								local179 = aShortArray6[local173] & 0xFFFF;
							}
							if (local175 == 0 && local177 == 0 && local179 == 0) {
								if (aClass5_Sub1_Sub16_2.anInt7445 != -1) {
									local175 = aClass5_Sub1_Sub16_2.anInt7445 | 0xFF000000;
								} else if ((local17 + anInt618 & 0x4) == (local57 + anInt625 & 0x4)) {
									local175 = anIntArray49[aClass141_2.anInt3620 + 1];
								} else {
									local175 = -11840664;
								}
								if (local175 == 0) {
									local175 = -16777216;
								}
								arg0.aa(local28, local70, local44, local84, local175, 0);
							} else if (local179 <= 0) {
								method670(arg0, local28, local70, local44, local84, local175, local177, aByteArray12[local173], (short[]) null, (byte[]) null, true);
							} else if (local179 == 65535) {
								@Pc(282) Class5_Sub25 local282 = (Class5_Sub25) aClass306_7.method6943((long) (local50 << 16 | local93));
								if (local282 != null) {
									method670(arg0, local28, local70, local44, local84, local175, local177, aByteArray12[local173], local282.aShortArray50, local282.aByteArray41, true);
								}
							} else {
								aShortArray5[0] = (short) (local179 - 1);
								aByteArray7[0] = aByteArray10[local173];
								method670(arg0, local28, local70, local44, local84, local175, local177, aByteArray12[local173], aShortArray5, aByteArray7, true);
							}
						}
					}
				} else {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt628 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt628 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (aClass5_Sub1_Sub16_2.anInt7445 != -1) {
							local93 = aClass5_Sub1_Sub16_2.anInt7445 | 0xFF000000;
						} else if ((local17 + anInt618 & 0x4) == (local57 + anInt625 & 0x4)) {
							local93 = anIntArray49[aClass141_2.anInt3620 + 1];
						} else {
							local93 = -11840664;
						}
						if (local93 == 0) {
							local93 = -16777216;
						}
						arg0.aa(local28, local70, local44, local84, local93, 0);
					}
				}
			}
		}
		for (local28 = -16; local28 < local3 + 16; local28++) {
			local40 = (arg1 * local28 >> 16) + anInt620;
			local44 = (arg1 * (local28 + 1) >> 16) + anInt620;
			local50 = local44 - local40;
			if (local50 > 0) {
				local57 = local28 + anInt618;
				if (local57 >= 0 && local57 < anInt624) {
					for (local70 = -16; local70 < local7 + 16; local70++) {
						local80 = anInt628 - (arg2 * (local70 + 1) >> 16);
						local84 = anInt628 - (arg2 * local70 >> 16);
						local93 = local84 - local80;
						if (local93 > 0) {
							local173 = local70 + anInt623;
							if (local173 >= 0 && local173 < anInt619) {
								local175 = aShortArray6[local57 + local173 * anInt624] & 0xFFFF;
								if (local175 <= 0) {
									method667(arg0, local40, local80, local50, local93, (short[]) null, (byte[]) null);
								} else if (local175 == 65535) {
									@Pc(459) Class5_Sub25 local459 = (Class5_Sub25) aClass306_7.method6943((long) (local57 << 16 | local173));
									if (local459 != null) {
										method667(arg0, local40, local80, local50, local93, local459.aShortArray50, local459.aByteArray41);
									}
								} else {
									aShortArray5[0] = (short) (local175 - 1);
									aByteArray7[0] = aByteArray10[local57 + local173 * anInt624];
									method667(arg0, local40, local80, local50, local93, aShortArray5, aByteArray7);
								}
							}
						}
					}
				}
			}
		}
		local40 = anInt618 >> 6;
		local44 = anInt623 >> 6;
		if (local40 < 0) {
			local40 = 0;
		}
		if (local44 < 0) {
			local44 = 0;
		}
		local50 = anInt626 >> 6;
		local57 = anInt625 >> 6;
		if (local50 >= aClass387ArrayArrayArray2[0].length) {
			local50 = aClass387ArrayArrayArray2[0].length - 1;
		}
		if (local57 >= aClass387ArrayArrayArray2[0][0].length) {
			local57 = aClass387ArrayArrayArray2[0][0].length - 1;
		}
		for (local70 = 0; local70 < 3; local70++) {
			@Pc(641) int local641;
			@Pc(653) int local653;
			@Pc(665) int local665;
			@Pc(675) int local675;
			@Pc(631) int local631;
			for (local80 = local40; local80 <= local50; local80++) {
				for (local84 = local44; local84 <= local57; local84++) {
					@Pc(589) Class387 local589 = aClass387ArrayArrayArray2[local70][local80][local84];
					if (local589 != null) {
						local173 = (local80 + (anInt622 >> 6)) * 64;
						local175 = (local84 + (anInt617 >> 6)) * 64;
						for (@Pc(612) Class4_Sub10 local612 = (Class4_Sub10) local589.method9018(); local612 != null; local612 = (Class4_Sub10) local589.method9016()) {
							local179 = local173 + local612.aByte133 - anInt622 - anInt618;
							local631 = local175 + local612.aByte134 - anInt617 - anInt623;
							local641 = (arg1 * local179 >> 16) + anInt620;
							local653 = (arg1 * (local179 + 1) >> 16) + anInt620;
							local665 = anInt628 - (arg2 * (local631 + 1) >> 16);
							local675 = anInt628 - (arg2 * local631 >> 16);
							method670(arg0, local641, local665, local653 - local641, local675 - local665, local612.anInt9695, local612.aByte135 & 0xFF, local612.aByte136, local612.aShortArray140, local612.aByteArray97, false);
						}
					}
				}
			}
			for (local84 = local40; local84 <= local50; local84++) {
				for (local93 = local44; local93 <= local57; local93++) {
					@Pc(727) Class387 local727 = aClass387ArrayArrayArray2[local70][local84][local93];
					if (local727 != null) {
						local175 = (local84 + (anInt622 >> 6)) * 64;
						local177 = (local93 + (anInt617 >> 6)) * 64;
						for (@Pc(750) Class4_Sub10 local750 = (Class4_Sub10) local727.method9018(); local750 != null; local750 = (Class4_Sub10) local727.method9016()) {
							local631 = local175 + local750.aByte133 - anInt622 - anInt618;
							local641 = local177 + local750.aByte134 - anInt617 - anInt623;
							local653 = (arg1 * local631 >> 16) + anInt620;
							local665 = (arg1 * (local631 + 1) >> 16) + anInt620;
							local675 = anInt628 - (arg2 * (local641 + 1) >> 16);
							@Pc(813) int local813 = anInt628 - (arg2 * local641 >> 16);
							method667(arg0, local653, local675, local665 - local653, local813 - local675, local750.aShortArray140, local750.aByteArray97);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!ha;IIIIIII[S[BZ)V")
	private static void method670(@OriginalArg(0) Class100 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) byte[] arg9, @OriginalArg(10) boolean arg10) {
		@Pc(20) int local20;
		@Pc(32) int local32;
		if (arg10 || arg5 != 0 || arg6 > 0) {
			if (arg6 == 0) {
				arg0.aa(arg1, arg2, arg3, arg4, arg5, 0);
			} else {
				local20 = arg7 & 0x3F;
				if (local20 == 0 || arg3 <= 1 || arg4 <= 1) {
					local32 = anIntArray49[arg6];
					if (arg10 || local32 != 0) {
						arg0.aa(arg1, arg2, arg3, arg4, local32, 0);
					}
				} else {
					local32 = arg10 ? 0 : 1;
					Static389.method1740(arg3, arg4, anInt616, arg1, arg2, arg7 >> 6 & 0x3, aByteArrayArrayArray4, local32, arg0, local20, anIntArray49[arg6], arg5);
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
				@Pc(127) Class354 local127 = aClass243_2.method5556(arg8[local100] & 0xFFFF);
				if (local127.anInt9418 == -1) {
					@Pc(133) int local133 = -3355444;
					if (local127.anInt9386 == 1) {
						local133 = -3407872;
					}
					@Pc(147) int local147 = arg9[local100] >> 6 & 0x3;
					if (local107 == 0) {
						if (local147 == 0) {
							arg0.P(arg1, arg2, arg4, local133, 0);
						} else if (local147 == 1) {
							arg0.U(arg1, arg2, arg3, local133, 0);
						} else if (local147 == 2) {
							arg0.P(local20, arg2, arg4, local133, 0);
						} else {
							arg0.U(arg1, local32, arg3, local133, 0);
						}
					} else if (local107 == 2) {
						if (local147 == 0) {
							arg0.P(arg1, arg2, arg4, -1, 0);
							arg0.U(arg1, arg2, arg3, local133, 0);
						} else if (local147 == 1) {
							arg0.P(local20, arg2, arg4, -1, 0);
							arg0.U(arg1, arg2, arg3, local133, 0);
						} else if (local147 == 2) {
							arg0.P(local20, arg2, arg4, -1, 0);
							arg0.U(arg1, local32, arg3, local133, 0);
						} else {
							arg0.P(arg1, arg2, arg4, -1, 0);
							arg0.U(arg1, local32, arg3, local133, 0);
						}
					} else if (local107 == 3) {
						if (local147 == 0) {
							arg0.U(arg1, arg2, 1, local133, 0);
						} else if (local147 == 1) {
							arg0.U(local20, arg2, 1, local133, 0);
						} else if (local147 == 2) {
							arg0.U(local20, local32, 1, local133, 0);
						} else {
							arg0.U(arg1, local32, 1, local133, 0);
						}
					} else if (local107 == 9) {
						@Pc(313) int local313;
						if (local147 == 0 || local147 == 2) {
							for (local313 = 0; local313 < arg4; local313++) {
								arg0.U(arg1 + local313, local32 - local313, 1, local133, 0);
							}
						} else {
							for (local313 = 0; local313 < arg4; local313++) {
								arg0.U(arg1 + local313, arg2 + local313, 1, local133, 0);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!ha;II)V")
	public static void method671(@OriginalArg(0) Class100 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(11) Class5_Sub36 local11 = new Class5_Sub36(aClass126_25.method3073("area", aClass5_Sub1_Sub16_2.aString88));
		@Pc(15) int local15 = local11.method7291();
		@Pc(18) int[] local18 = new int[local15];
		for (@Pc(20) int local20 = 0; local20 < local15; local20++) {
			local18[local20] = local11.method7291();
		}
		@Pc(35) int local35 = local11.method7291();
		@Pc(38) int[] local38 = new int[local35];
		for (@Pc(40) int local40 = 0; local40 < local35; local40++) {
			local38[local40] = local11.method7291();
		}
		while (true) {
			@Pc(60) int local60;
			@Pc(66) int local66;
			@Pc(69) int local69;
			@Pc(78) int local78;
			@Pc(150) int local150;
			while (local11.anInt8456 < local11.aByteArray89.length) {
				@Pc(64) int local64;
				@Pc(86) int local86;
				if (local11.method7291() == 0) {
					local60 = local11.method7291();
					local64 = local11.method7291();
					for (local66 = 0; local66 < 64; local66++) {
						for (local69 = 0; local69 < 64; local69++) {
							local78 = local60 * 64 + local66 - anInt622;
							local86 = local64 * 64 + local69 - anInt617;
							method673(arg0, local11, local60, local64, local78, local86, local18, local38);
						}
					}
				} else {
					local60 = local11.method7291();
					local64 = local11.method7291();
					local66 = local11.method7291();
					local69 = local11.method7291();
					for (local78 = 0; local78 < 8; local78++) {
						for (local86 = 0; local86 < 8; local86++) {
							@Pc(138) int local138 = local60 * 64 + local66 * 8 + local78 - anInt622;
							local150 = local64 * 64 + local69 * 8 + local86 - anInt617;
							method673(arg0, local11, local60, local64, local138, local150, local18, local38);
						}
					}
				}
			}
			aByteArray11 = new byte[anInt624 * anInt619];
			aShortArray7 = new short[anInt624 * anInt619];
			for (local60 = 0; local60 < 3; local60++) {
				@Pc(193) byte[] local193 = new byte[anInt624 * anInt619];
				for (local66 = 0; local66 < aClass387ArrayArrayArray2[local60].length; local66++) {
					for (local69 = 0; local69 < aClass387ArrayArrayArray2[local60][0].length; local69++) {
						@Pc(207) Class387 local207 = aClass387ArrayArrayArray2[local60][local66][local69];
						if (local207 != null) {
							for (@Pc(214) Class4_Sub10 local214 = (Class4_Sub10) local207.method9018(); local214 != null; local214 = (Class4_Sub10) local207.method9016()) {
								local193[local66 * 64 + local214.aByte133 + (local69 * 64 + local214.aByte134) * anInt624] = (byte) local214.anInt9695;
							}
						}
					}
				}
				method657(local193, aByteArray11, aShortArray7, arg1, arg2);
				for (local69 = 0; local69 < aClass387ArrayArrayArray2[local60].length; local69++) {
					for (local78 = 0; local78 < aClass387ArrayArrayArray2[local60][0].length; local78++) {
						@Pc(278) Class387 local278 = aClass387ArrayArrayArray2[local60][local69][local78];
						if (local278 != null) {
							for (@Pc(285) Class4_Sub10 local285 = (Class4_Sub10) local278.method9018(); local285 != null; local285 = (Class4_Sub10) local278.method9016()) {
								local150 = local69 * 64 + local285.aByte133 + (local78 * 64 + local285.aByte134) * anInt624;
								local285.anInt9695 = (aByteArray11[local150] & 0xFF) << 16 | aShortArray7[local150] & 0xFFFF;
								if (local285.anInt9695 != 0) {
									local285.anInt9695 |= 0xFF000000;
								}
							}
						}
					}
				}
			}
			method657(aByteArray9, aByteArray11, aShortArray7, arg1, arg2);
			aByteArray9 = null;
			method664();
			return;
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!gda;Lclient!gv;Lclient!hg;Lclient!mq;Lclient!sda;Lclient!eka;Lclient!ada;)V")
	public static void method672(@OriginalArg(0) Class126 arg0, @OriginalArg(1) Class141 arg1, @OriginalArg(2) Class152 arg2, @OriginalArg(3) Class243 arg3, @OriginalArg(4) Class327 arg4, @OriginalArg(5) Class97 arg5, @OriginalArg(6) Interface1 arg6) {
		aClass126_25 = arg0;
		aClass141_2 = arg1;
		aClass152_2 = arg2;
		aClass243_2 = arg3;
		aClass327_2 = arg4;
		aClass97_2 = arg5;
		anInterface1_2 = arg6;
		aClass306_6.method6936();
		@Pc(23) int local23 = aClass126_25.method3067("details");
		@Pc(28) int[] local28 = aClass126_25.method3083(local23);
		if (local28 != null) {
			for (@Pc(32) int local32 = 0; local32 < local28.length; local32++) {
				@Pc(41) Class5_Sub1_Sub16 local41 = Static420.method6161(local28[local32], local23, aClass126_25);
				aClass306_6.method6944(local41, (long) local41.anInt7441, -12002);
			}
		}
		Static207.method3389(false, true);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!ha;Lclient!wq;IIII[I[I)V")
	private static void method673(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class5_Sub36 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7) {
		@Pc(3) int local3 = arg1.method7291();
		if ((local3 & 0x1) == 0) {
			@Pc(15) boolean local15 = (local3 & 0x2) == 0;
			@Pc(21) int local21 = local3 >> 2 & 0x3F;
			if (local21 != 62) {
				if (local21 == 63) {
					local21 = arg1.method7291();
				} else if (local15) {
					local21 = arg6[local21];
				} else {
					local21 = arg7[local21];
				}
				if (local15) {
					aByteArray9[arg4 + arg5 * anInt624] = (byte) local21;
					aByteArray8[arg4 + arg5 * anInt624] = 0;
				} else {
					aByteArray8[arg4 + arg5 * anInt624] = (byte) local21;
					aByteArray12[arg4 + arg5 * anInt624] = 0;
					aByteArray9[arg4 + arg5 * anInt624] = arg1.method7318();
				}
			}
			return;
		}
		@Pc(100) int local100 = (local3 >> 1 & 0x3) + 1;
		@Pc(108) boolean local108 = (local3 & 0x8) != 0;
		@Pc(116) boolean local116 = (local3 & 0x10) != 0;
		for (@Pc(118) int local118 = 0; local118 < local100; local118++) {
			@Pc(123) int local123 = arg1.method7291();
			@Pc(125) int local125 = 0;
			@Pc(127) int local127 = 0;
			if (local108) {
				local125 = arg1.method7291();
				local127 = arg1.method7291();
			}
			@Pc(139) int local139 = 0;
			if (local116) {
				local139 = arg1.method7291();
			}
			@Pc(215) short[] local215;
			@Pc(218) byte[] local218;
			@Pc(220) int local220;
			if (local118 == 0) {
				aByteArray9[arg4 + arg5 * anInt624] = (byte) local123;
				aByteArray8[arg4 + arg5 * anInt624] = (byte) local125;
				aByteArray12[arg4 + arg5 * anInt624] = (byte) local127;
				if (local139 == 1) {
					aShortArray6[arg4 + arg5 * anInt624] = (short) (arg1.method7333() + 1);
					aByteArray10[arg4 + arg5 * anInt624] = arg1.method7318();
				} else if (local139 > 1) {
					aShortArray6[arg4 + arg5 * anInt624] = -1;
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method7333();
						local218[local220] = arg1.method7318();
					}
					aClass306_7.method6944(new Class5_Sub25(local215, local218), (long) (arg4 << 16 | arg5), -12002);
				}
			} else {
				local215 = null;
				local218 = null;
				if (local139 > 0) {
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method7333();
						local218[local220] = arg1.method7318();
					}
				}
				if (aClass387ArrayArrayArray2[local118 - 1][arg2 - (anInt622 >> 6)][arg3 - (anInt617 >> 6)] == null) {
					aClass387ArrayArrayArray2[local118 - 1][arg2 - (anInt622 >> 6)][arg3 - (anInt617 >> 6)] = new Class387();
				}
				@Pc(338) Class4_Sub10 local338 = new Class4_Sub10(arg4 & 0x3F, arg5 & 0x3F, local123, local125, local127, local215, local218);
				aClass387ArrayArrayArray2[local118 - 1][arg2 - (anInt622 >> 6)][arg3 - (anInt617 >> 6)].method9017(local338);
			}
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!ha;Lclient!sg;IIII)V")
	private static void method674(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class5_Sub49 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		arg1.anInt8672 = anInt620 + (arg2 * (arg1.anInt8671 - anInt618) >> 16);
		arg1.anInt8673 = anInt628 - (arg3 * (arg1.anInt8670 - anInt623) >> 16);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIIIIII)V")
	public static void method675(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		anInt618 = arg0 - anInt622;
		anInt625 = arg1 - anInt617;
		anInt626 = arg2 - anInt622;
		anInt623 = arg3 - anInt617;
		anInt620 = arg4;
		anInt627 = arg5;
		anInt621 = arg6;
		anInt628 = arg7;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "()V")
	public static void method676() {
		aByteArray9 = null;
		aByteArray11 = null;
		aShortArray7 = null;
		aByteArray8 = null;
		aByteArray12 = null;
		aShortArray6 = null;
		aByteArray10 = null;
		aClass306_7 = null;
		aClass387ArrayArrayArray2 = null;
		anIntArray49 = null;
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(II)Lclient!pja;")
	public static Class5_Sub1_Sub16 method677(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(4) Class5_Sub1_Sub16 local4 = (Class5_Sub1_Sub16) aClass306_6.method6941(); local4 != null; local4 = (Class5_Sub1_Sub16) aClass306_6.method6940()) {
			if (local4.aBoolean506 && local4.method6481(arg1, arg0)) {
				return local4;
			}
		}
		return null;
	}
}
