import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "Lclient!hs;")
	private static Class112 aClass112_5;

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "Lclient!rv;")
	public static Class212 aClass212_4;

	@OriginalMember(owner = "client!gp", name = "c", descriptor = "Lclient!fd;")
	public static Class74 aClass74_10;

	@OriginalMember(owner = "client!gp", name = "d", descriptor = "Lclient!rt;")
	public static Class4_Sub1_Sub16 aClass4_Sub1_Sub16_2;

	@OriginalMember(owner = "client!gp", name = "e", descriptor = "Lclient!qq;")
	public static Class198 aClass198_4;

	@OriginalMember(owner = "client!gp", name = "f", descriptor = "Lclient!fb;")
	public static Interface4 anInterface4_2;

	@OriginalMember(owner = "client!gp", name = "g", descriptor = "Lclient!bl;")
	private static Class23 aClass23_3;

	@OriginalMember(owner = "client!gp", name = "i", descriptor = "Lclient!ns;")
	public static Class166 aClass166_219;

	@OriginalMember(owner = "client!gp", name = "j", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!gp", name = "m", descriptor = "F")
	public static float aFloat153;

	@OriginalMember(owner = "client!gp", name = "o", descriptor = "Lclient!vq;")
	public static Class257 aClass257_2;

	@OriginalMember(owner = "client!gp", name = "p", descriptor = "I")
	public static int anInt5578;

	@OriginalMember(owner = "client!gp", name = "r", descriptor = "F")
	public static float aFloat154;

	@OriginalMember(owner = "client!gp", name = "t", descriptor = "I")
	public static int anInt5580;

	@OriginalMember(owner = "client!gp", name = "u", descriptor = "I")
	public static int anInt5581;

	@OriginalMember(owner = "client!gp", name = "v", descriptor = "[B")
	private static byte[] aByteArray60;

	@OriginalMember(owner = "client!gp", name = "w", descriptor = "I")
	public static int anInt5582;

	@OriginalMember(owner = "client!gp", name = "x", descriptor = "I")
	public static int anInt5583;

	@OriginalMember(owner = "client!gp", name = "y", descriptor = "[B")
	private static byte[] aByteArray61;

	@OriginalMember(owner = "client!gp", name = "z", descriptor = "I")
	public static int anInt5584;

	@OriginalMember(owner = "client!gp", name = "A", descriptor = "I")
	public static int anInt5585;

	@OriginalMember(owner = "client!gp", name = "B", descriptor = "I")
	public static int anInt5586;

	@OriginalMember(owner = "client!gp", name = "C", descriptor = "[I")
	private static int[] anIntArray477;

	@OriginalMember(owner = "client!gp", name = "D", descriptor = "[S")
	private static short[] aShortArray72;

	@OriginalMember(owner = "client!gp", name = "E", descriptor = "[B")
	private static byte[] aByteArray62;

	@OriginalMember(owner = "client!gp", name = "F", descriptor = "[[[Lclient!br;")
	private static Class27[][][] aClass27ArrayArrayArray2;

	@OriginalMember(owner = "client!gp", name = "G", descriptor = "Lclient!qo;")
	private static Class196 aClass196_29;

	@OriginalMember(owner = "client!gp", name = "H", descriptor = "[B")
	private static byte[] aByteArray63;

	@OriginalMember(owner = "client!gp", name = "I", descriptor = "[S")
	private static short[] aShortArray73;

	@OriginalMember(owner = "client!gp", name = "J", descriptor = "[B")
	private static byte[] aByteArray64;

	@OriginalMember(owner = "client!gp", name = "K", descriptor = "I")
	public static int anInt5587;

	@OriginalMember(owner = "client!gp", name = "L", descriptor = "I")
	public static int anInt5588;

	@OriginalMember(owner = "client!gp", name = "M", descriptor = "I")
	public static int anInt5589;

	@OriginalMember(owner = "client!gp", name = "N", descriptor = "I")
	public static int anInt5590;

	@OriginalMember(owner = "client!gp", name = "O", descriptor = "I")
	public static int anInt5591;

	@OriginalMember(owner = "client!gp", name = "h", descriptor = "Lclient!qo;")
	private static final Class196 aClass196_28 = new Class196(16);

	@OriginalMember(owner = "client!gp", name = "k", descriptor = "[S")
	private static final short[] aShortArray71 = new short[1];

	@OriginalMember(owner = "client!gp", name = "l", descriptor = "I")
	public static int anInt5577 = (int) (Math.random() * 11.0D) - 5;

	@OriginalMember(owner = "client!gp", name = "n", descriptor = "[B")
	private static final byte[] aByteArray59 = new byte[1];

	@OriginalMember(owner = "client!gp", name = "q", descriptor = "I")
	public static int anInt5579 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!gp", name = "s", descriptor = "Lclient!vr;")
	public static final Class258 aClass258_37 = new Class258();

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(II)Lclient!rt;")
	public static Class4_Sub1_Sub16 method4282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(4) Class4_Sub1_Sub16 local4 = (Class4_Sub1_Sub16) aClass196_28.method4482(); local4 != null; local4 = (Class4_Sub1_Sub16) aClass196_28.method4472()) {
			if (local4.aBoolean432 && local4.method4917(arg0, arg1)) {
				return local4;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lclient!ns;Lclient!hs;Lclient!bl;Lclient!fd;Lclient!qq;Lclient!rv;Lclient!fb;)V")
	public static void method4283(@OriginalArg(0) Class166 arg0, @OriginalArg(1) Class112 arg1, @OriginalArg(2) Class23 arg2, @OriginalArg(3) Class74 arg3, @OriginalArg(4) Class198 arg4, @OriginalArg(5) Class212 arg5, @OriginalArg(6) Interface4 arg6) {
		aClass166_219 = arg0;
		aClass112_5 = arg1;
		aClass23_3 = arg2;
		aClass74_10 = arg3;
		aClass198_4 = arg4;
		aClass212_4 = arg5;
		anInterface4_2 = arg6;
		aClass196_28.method4471();
		@Pc(21) int local21 = aClass166_219.method3698("details");
		@Pc(26) int[] local26 = aClass166_219.method3687(local21);
		for (@Pc(28) int local28 = 0; local28 < local26.length; local28++) {
			@Pc(37) Class4_Sub1_Sub16 local37 = Static395.method5280(local26[local28], local21, aClass166_219);
			aClass196_28.method4474((long) local37.anInt6326, local37);
		}
		Static13.method323(false, true);
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "()V")
	public static void method4284() {
		aByteArray61 = new byte[anInt5588 * anInt5580];
		aByteArray62 = new byte[anInt5588 * anInt5580];
		aByteArray60 = new byte[anInt5588 * anInt5580];
		aShortArray73 = new short[anInt5588 * anInt5580];
		aByteArray64 = new byte[anInt5588 * anInt5580];
		aClass196_29 = new Class196(1024);
		aClass27ArrayArrayArray2 = new Class27[3][anInt5588 >> 6][anInt5580 >> 6];
		anIntArray477 = new int[aClass112_5.anInt2985 + 1];
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lclient!qa;)Lclient!vr;")
	public static Class258 method4285(@OriginalArg(0) Class30 arg0) {
		@Pc(3) int local3 = anInt5585 - anInt5590;
		@Pc(7) int local7 = anInt5583 - anInt5591;
		@Pc(15) int local15 = (anInt5582 - anInt5589 << 16) / local3;
		@Pc(23) int local23 = (anInt5586 - anInt5587 << 16) / local7;
		return method4286(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lclient!qa;IIII)Lclient!vr;")
	private static Class258 method4286(@OriginalArg(0) Class30 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(4) Class4_Sub32 local4 = (Class4_Sub32) aClass258_37.method5538(); local4 != null; local4 = (Class4_Sub32) aClass258_37.method5528()) {
			method4287(arg0, local4, arg1, arg2);
		}
		return aClass258_37;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lclient!qa;Lclient!ps;IIII)V")
	private static void method4287(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class4_Sub32 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		arg1.anInt5603 = anInt5589 + (arg2 * (arg1.anInt5605 - anInt5590) >> 16);
		arg1.anInt5607 = anInt5586 - (arg3 * (arg1.anInt5602 - anInt5591) >> 16);
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lclient!m;III)I")
	private static int method4288(@OriginalArg(0) Interface10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class42 local4 = aClass112_5.method2332(arg1);
		if (local4 == null) {
			return 0;
		}
		@Pc(11) int local11 = local4.anInt1631;
		if (local11 >= 0 && arg0.method4241(local11).aBoolean233) {
			local11 = -1;
		}
		@Pc(68) int local68;
		@Pc(27) int local27;
		@Pc(33) int local33;
		@Pc(55) int local55;
		if (local4.anInt1624 >= 0) {
			local27 = local4.anInt1624;
			local33 = (local27 & 0x7F) + arg3;
			if (local33 < 0) {
				local33 = 0;
			} else if (local33 > 127) {
				local33 = 127;
			}
			local55 = (local27 + arg2 & 0xFC00) + (local27 & 0x380) + local33;
			local68 = Static261.anIntArray393[Static222.method3111(Static447.method5736(local55)) & 0xFFFF] | 0xFF000000;
		} else if (local11 >= 0) {
			local68 = Static261.anIntArray393[Static222.method3111(Static447.method5736(arg0.method4241(local11).aShort57)) & 0xFFFF] | 0xFF000000;
		} else if (local4.anInt1625 == -1) {
			local68 = 0;
		} else {
			local27 = local4.anInt1625;
			local33 = (local27 & 0x7F) + arg3;
			if (local33 < 0) {
				local33 = 0;
			} else if (local33 > 127) {
				local33 = 127;
			}
			local55 = (local27 + arg2 & 0xFC00) + (local27 & 0x380) + local33;
			local68 = Static261.anIntArray393[Static222.method3111(Static447.method5736(local55)) & 0xFFFF] | 0xFF000000;
		}
		return local68;
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "(II)Lclient!kn;")
	public static Class140 method4289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class140 local3 = new Class140();
		for (@Pc(8) Class4_Sub1_Sub16 local8 = (Class4_Sub1_Sub16) aClass196_28.method4482(); local8 != null; local8 = (Class4_Sub1_Sub16) aClass196_28.method4472()) {
			if (local8.aBoolean432 && local8.method4917(arg0, arg1)) {
				local3.method3015(local8);
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lclient!qa;IIIIIII[S[BZ)V")
	private static void method4290(@OriginalArg(0) Class30 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) byte[] arg9, @OriginalArg(10) boolean arg10) {
		@Pc(20) int local20;
		@Pc(32) int local32;
		if (arg10 || arg5 != 0 || arg6 > 0) {
			if (arg6 == 0) {
				arg0.NA(arg1, arg2, arg3, arg4, arg5, 0);
			} else {
				local20 = arg7 & 0x3F;
				if (local20 == 0 || arg3 <= 1 || arg4 <= 1) {
					local32 = anIntArray477[arg6];
					if (arg10 || local32 != 0) {
						arg0.NA(arg1, arg2, arg3, arg4, local32, 0);
					}
				} else {
					local32 = arg10 ? 0 : 1;
					Static107.method1672(arg1, anInt5578, arg3, arg0, arg2, local20, arg4, arg5, local32, arg7 >> 6 & 0x3, anIntArray477[arg6], aByteArrayArrayArray9);
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
				@Pc(127) Class71 local127 = aClass74_10.method1683(arg8[local100] & 0xFFFF);
				if (local127.anInt2165 == -1) {
					@Pc(133) int local133 = -3355444;
					if (local127.anInt2194 == 1) {
						local133 = -3407872;
					}
					@Pc(147) int local147 = arg9[local100] >> 6 & 0x3;
					if (local107 == 0) {
						if (local147 == 0) {
							arg0.da(arg1, arg2, arg4, local133, 0);
						} else if (local147 == 1) {
							arg0.U(arg1, arg2, arg3, local133, 0);
						} else if (local147 == 2) {
							arg0.da(local20, arg2, arg4, local133, 0);
						} else {
							arg0.U(arg1, local32, arg3, local133, 0);
						}
					} else if (local107 == 2) {
						if (local147 == 0) {
							arg0.da(arg1, arg2, arg4, -1, 0);
							arg0.U(arg1, arg2, arg3, local133, 0);
						} else if (local147 == 1) {
							arg0.da(local20, arg2, arg4, -1, 0);
							arg0.U(arg1, arg2, arg3, local133, 0);
						} else if (local147 == 2) {
							arg0.da(local20, arg2, arg4, -1, 0);
							arg0.U(arg1, local32, arg3, local133, 0);
						} else {
							arg0.da(arg1, arg2, arg4, -1, 0);
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

	@OriginalMember(owner = "client!gp", name = "c", descriptor = "()V")
	private static void method4292() {
		@Pc(4) int local4;
		@Pc(15) int local15;
		@Pc(49) int local49;
		for (@Pc(1) int local1 = 0; local1 < anInt5588; local1++) {
			for (local4 = 0; local4 < anInt5580; local4++) {
				local15 = aShortArray73[local1 + local4 * anInt5588] & 0xFFFF;
				if (local15 != 0) {
					@Pc(35) int local35;
					if (local15 == 65535) {
						@Pc(31) Class4_Sub16 local31 = (Class4_Sub16) aClass196_29.method4477((long) (local1 << 16 | local4));
						if (local31 != null) {
							for (local35 = 0; local35 < local31.aShortArray29.length; local35++) {
								@Pc(46) Class71 local46 = aClass74_10.method1683(local31.aShortArray29[local35] & 0xFFFF);
								local49 = local46.anInt2201;
								if (local46.anIntArray138 != null) {
									local46 = local46.method1626(anInterface4_2);
									if (local46 != null) {
										local49 = local46.anInt2201;
									}
								}
								if (local49 != -1) {
									@Pc(70) Class4_Sub32 local70 = new Class4_Sub32(local49);
									local70.anInt5605 = local1;
									local70.anInt5602 = local4;
									aClass258_37.method5526(local70);
								}
							}
						}
					} else {
						@Pc(94) Class71 local94 = aClass74_10.method1683(local15 - 1);
						local35 = local94.anInt2201;
						if (local94.anIntArray138 != null) {
							local94 = local94.method1626(anInterface4_2);
							if (local94 != null) {
								local35 = local94.anInt2201;
							}
						}
						if (local35 != -1) {
							@Pc(118) Class4_Sub32 local118 = new Class4_Sub32(local35);
							local118.anInt5605 = local1;
							local118.anInt5602 = local4;
							aClass258_37.method5526(local118);
						}
					}
				}
			}
		}
		for (local4 = 0; local4 < 3; local4++) {
			for (local15 = 0; local15 < aClass27ArrayArrayArray2[0].length; local15++) {
				for (@Pc(144) int local144 = 0; local144 < aClass27ArrayArrayArray2[0][0].length; local144++) {
					@Pc(153) Class27 local153 = aClass27ArrayArrayArray2[local4][local15][local144];
					if (local153 != null) {
						for (@Pc(160) Class41_Sub8 local160 = (Class41_Sub8) local153.method730(); local160 != null; local160 = (Class41_Sub8) local153.method735()) {
							if (local160.aShortArray96 != null) {
								for (local49 = 0; local49 < local160.aShortArray96.length; local49++) {
									@Pc(177) Class71 local177 = aClass74_10.method1683(local160.aShortArray96[local49] & 0xFFFF);
									@Pc(180) int local180 = local177.anInt2201;
									if (local177.anIntArray138 != null) {
										local177 = local177.method1626(anInterface4_2);
										if (local177 != null) {
											local180 = local177.anInt2201;
										}
									}
									if (local180 != -1) {
										@Pc(201) Class4_Sub32 local201 = new Class4_Sub32(local180);
										local201.anInt5605 = (local15 + (anInt5581 >> 6)) * 64 + local160.aByte93 - anInt5581;
										local201.anInt5602 = (local144 + (anInt5584 >> 6)) * 64 + local160.aByte95 - anInt5584;
										aClass258_37.method5526(local201);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(I)Lclient!rt;")
	public static Class4_Sub1_Sub16 method4293(@OriginalArg(0) int arg0) {
		return (Class4_Sub1_Sub16) aClass196_28.method4477((long) arg0);
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "(I)V")
	public static void method4294(@OriginalArg(0) int arg0) {
		aClass4_Sub1_Sub16_2 = (Class4_Sub1_Sub16) aClass196_28.method4477((long) arg0);
	}

	@OriginalMember(owner = "client!gp", name = "d", descriptor = "()V")
	public static void method4295() {
		aByteArray61 = null;
		aByteArray63 = null;
		aShortArray72 = null;
		aByteArray62 = null;
		aByteArray60 = null;
		aShortArray73 = null;
		aByteArray64 = null;
		aClass196_29 = null;
		aClass27ArrayArrayArray2 = null;
		anIntArray477 = null;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		anInt5590 = arg0 - anInt5581;
		anInt5583 = arg1 - anInt5584;
		anInt5585 = arg2 - anInt5581;
		anInt5591 = arg3 - anInt5584;
		anInt5589 = arg4;
		anInt5587 = arg5;
		anInt5582 = arg6;
		anInt5586 = arg7;
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "(Lclient!qa;IIII)V")
	private static void method4297(@OriginalArg(0) Class30 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = anInt5585 - anInt5590;
		@Pc(7) int local7 = anInt5583 - anInt5591;
		if (anInt5585 < anInt5588) {
			local3++;
		}
		if (anInt5583 < anInt5580) {
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
			local28 = (arg1 * local17 >> 16) + anInt5589;
			local40 = (arg1 * (local17 + 1) >> 16) + anInt5589;
			local44 = local40 - local28;
			if (local44 > 0) {
				local50 = anInt5590 + local17;
				if (local50 >= 0 && local50 < anInt5588) {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt5586 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt5586 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (local84 > 0) {
							local93 = local57 + anInt5591;
							local173 = local50 + local93 * anInt5588;
							local175 = 0;
							local177 = 0;
							local179 = 0;
							if (local93 >= 0 && local93 < anInt5580) {
								local175 = (aByteArray63[local173] & 0xFF) << 16 | aShortArray72[local173] & 0xFFFF;
								if (local175 != 0) {
									local175 |= 0xFF000000;
								}
								local177 = aByteArray62[local173] & 0xFF;
								local179 = aShortArray73[local173] & 0xFFFF;
							}
							if (local175 == 0 && local177 == 0 && local179 == 0) {
								if (aClass4_Sub1_Sub16_2.anInt6319 != -1) {
									local175 = aClass4_Sub1_Sub16_2.anInt6319 | 0xFF000000;
								} else if ((local17 + anInt5590 & 0x4) == (local57 + anInt5583 & 0x4)) {
									local175 = anIntArray477[aClass112_5.anInt2988 + 1];
								} else {
									local175 = -11840664;
								}
								if (local175 == 0) {
									local175 = -16777216;
								}
								arg0.NA(local28, local70, local44, local84, local175, 0);
							} else if (local179 <= 0) {
								method4290(arg0, local28, local70, local44, local84, local175, local177, aByteArray60[local173], null, null, true);
							} else if (local179 == 65535) {
								@Pc(282) Class4_Sub16 local282 = (Class4_Sub16) aClass196_29.method4477((long) (local50 << 16 | local93));
								if (local282 != null) {
									method4290(arg0, local28, local70, local44, local84, local175, local177, aByteArray60[local173], local282.aShortArray29, local282.aByteArray21, true);
								}
							} else {
								aShortArray71[0] = (short) (local179 - 1);
								aByteArray59[0] = aByteArray64[local173];
								method4290(arg0, local28, local70, local44, local84, local175, local177, aByteArray60[local173], aShortArray71, aByteArray59, true);
							}
						}
					}
				} else {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt5586 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt5586 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (aClass4_Sub1_Sub16_2.anInt6319 != -1) {
							local93 = aClass4_Sub1_Sub16_2.anInt6319 | 0xFF000000;
						} else if ((local17 + anInt5590 & 0x4) == (local57 + anInt5583 & 0x4)) {
							local93 = anIntArray477[aClass112_5.anInt2988 + 1];
						} else {
							local93 = -11840664;
						}
						if (local93 == 0) {
							local93 = -16777216;
						}
						arg0.NA(local28, local70, local44, local84, local93, 0);
					}
				}
			}
		}
		for (local28 = -16; local28 < local3 + 16; local28++) {
			local40 = (arg1 * local28 >> 16) + anInt5589;
			local44 = (arg1 * (local28 + 1) >> 16) + anInt5589;
			local50 = local44 - local40;
			if (local50 > 0) {
				local57 = local28 + anInt5590;
				if (local57 >= 0 && local57 < anInt5588) {
					for (local70 = -16; local70 < local7 + 16; local70++) {
						local80 = anInt5586 - (arg2 * (local70 + 1) >> 16);
						local84 = anInt5586 - (arg2 * local70 >> 16);
						local93 = local84 - local80;
						if (local93 > 0) {
							local173 = local70 + anInt5591;
							if (local173 >= 0 && local173 < anInt5580) {
								local175 = aShortArray73[local57 + local173 * anInt5588] & 0xFFFF;
								if (local175 <= 0) {
									method4299(arg0, local40, local80, local50, local93, null, null);
								} else if (local175 == 65535) {
									@Pc(459) Class4_Sub16 local459 = (Class4_Sub16) aClass196_29.method4477((long) (local57 << 16 | local173));
									if (local459 != null) {
										method4299(arg0, local40, local80, local50, local93, local459.aShortArray29, local459.aByteArray21);
									}
								} else {
									aShortArray71[0] = (short) (local175 - 1);
									aByteArray59[0] = aByteArray64[local57 + local173 * anInt5588];
									method4299(arg0, local40, local80, local50, local93, aShortArray71, aByteArray59);
								}
							}
						}
					}
				}
			}
		}
		local40 = anInt5590 >> 6;
		local44 = anInt5591 >> 6;
		if (local40 < 0) {
			local40 = 0;
		}
		if (local44 < 0) {
			local44 = 0;
		}
		local50 = anInt5585 >> 6;
		local57 = anInt5583 >> 6;
		if (local50 >= aClass27ArrayArrayArray2[0].length) {
			local50 = aClass27ArrayArrayArray2[0].length - 1;
		}
		if (local57 >= aClass27ArrayArrayArray2[0][0].length) {
			local57 = aClass27ArrayArrayArray2[0][0].length - 1;
		}
		for (local70 = 0; local70 < 3; local70++) {
			@Pc(641) int local641;
			@Pc(653) int local653;
			@Pc(665) int local665;
			@Pc(675) int local675;
			@Pc(631) int local631;
			for (local80 = local40; local80 <= local50; local80++) {
				for (local84 = local44; local84 <= local57; local84++) {
					@Pc(589) Class27 local589 = aClass27ArrayArrayArray2[local70][local80][local84];
					if (local589 != null) {
						local173 = (local80 + (anInt5581 >> 6)) * 64;
						local175 = (local84 + (anInt5584 >> 6)) * 64;
						for (@Pc(612) Class41_Sub8 local612 = (Class41_Sub8) local589.method730(); local612 != null; local612 = (Class41_Sub8) local589.method735()) {
							local179 = local173 + local612.aByte93 - anInt5581 - anInt5590;
							local631 = local175 + local612.aByte95 - anInt5584 - anInt5591;
							local641 = (arg1 * local179 >> 16) + anInt5589;
							local653 = (arg1 * (local179 + 1) >> 16) + anInt5589;
							local665 = anInt5586 - (arg2 * (local631 + 1) >> 16);
							local675 = anInt5586 - (arg2 * local631 >> 16);
							method4290(arg0, local641, local665, local653 - local641, local675 - local665, local612.anInt6351, local612.aByte92 & 0xFF, local612.aByte94, local612.aShortArray96, local612.aByteArray82, false);
						}
					}
				}
			}
			for (local84 = local40; local84 <= local50; local84++) {
				for (local93 = local44; local93 <= local57; local93++) {
					@Pc(727) Class27 local727 = aClass27ArrayArrayArray2[local70][local84][local93];
					if (local727 != null) {
						local175 = (local84 + (anInt5581 >> 6)) * 64;
						local177 = (local93 + (anInt5584 >> 6)) * 64;
						for (@Pc(750) Class41_Sub8 local750 = (Class41_Sub8) local727.method730(); local750 != null; local750 = (Class41_Sub8) local727.method735()) {
							local631 = local175 + local750.aByte93 - anInt5581 - anInt5590;
							local641 = local177 + local750.aByte95 - anInt5584 - anInt5591;
							local653 = (arg1 * local631 >> 16) + anInt5589;
							local665 = (arg1 * (local631 + 1) >> 16) + anInt5589;
							local675 = anInt5586 - (arg2 * (local641 + 1) >> 16);
							@Pc(813) int local813 = anInt5586 - (arg2 * local641 >> 16);
							method4299(arg0, local653, local675, local665 - local653, local813 - local675, local750.aShortArray96, local750.aByteArray82);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gp", name = "e", descriptor = "()V")
	public static void method4298() {
		@Pc(2) int[] local2 = new int[3];
		for (@Pc(4) int local4 = 0; local4 < aClass257_2.anInt7167; local4++) {
			@Pc(32) boolean local32 = aClass4_Sub1_Sub16_2.method4923(aClass257_2.anIntArray631[local4] >> 14 & 0x3FFF, aClass257_2.anIntArray631[local4] >> 28 & 0x3, aClass257_2.anIntArray631[local4] & 0x3FFF, local2);
			if (local32) {
				@Pc(42) Class4_Sub32 local42 = new Class4_Sub32(aClass257_2.anIntArray632[local4]);
				local42.anInt5605 = local2[1] - anInt5581;
				local42.anInt5602 = local2[2] - anInt5584;
				aClass258_37.method5526(local42);
			}
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lclient!qa;IIII[S[B)V")
	private static void method4299(@OriginalArg(0) Class30 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		if (arg5 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < arg5.length; local4++) {
			@Pc(14) Class71 local14 = aClass74_10.method1683(arg5[local4] & 0xFFFF);
			@Pc(17) int local17 = local14.anInt2165;
			if (local17 != -1) {
				@Pc(25) Class70 local25 = aClass212_4.method4944(local17);
				@Pc(49) Class3 local49 = local25.method1611(arg0, local14.aBoolean162 ? local14.aBoolean159 : false, local14.aBoolean167 ? arg6[local4] >> 6 & 0x3 : 0);
				if (local49 != null) {
					@Pc(58) int local58 = arg3 * local49.ja() >> 2;
					@Pc(65) int local65 = arg4 * local49.JA() >> 2;
					if (local25.aBoolean158) {
						@Pc(71) int local71 = local14.anInt2169;
						@Pc(74) int local74 = local14.anInt2198;
						if ((arg6[local4] >> 6 & 0x1) == 1) {
							@Pc(85) int local85 = local71;
							local71 = local74;
							local74 = local85;
						}
						local58 = local71 * arg3;
						local65 = local74 * arg4;
					}
					if (local58 != 0 && local65 != 0) {
						if (local25.anInt2150 == 0) {
							local49.method5885(arg1, arg2 + arg4 - local65, local58, local65);
						} else {
							local49.M(arg1, arg2 + arg4 - local65, local58, local65, 0, local25.anInt2150 | 0xFF000000, 1);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lclient!qa;Lclient!tl;IIII[I[I)V")
	private static void method4300(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class4_Sub30 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7) {
		@Pc(3) int local3 = arg1.method4864();
		if ((local3 & 0x1) == 0) {
			@Pc(15) boolean local15 = (local3 & 0x2) == 0;
			@Pc(21) int local21 = local3 >> 2 & 0x3F;
			if (local21 != 62) {
				if (local21 == 63) {
					local21 = arg1.method4864();
				} else if (local15) {
					local21 = arg6[local21];
				} else {
					local21 = arg7[local21];
				}
				if (local15) {
					aByteArray61[arg4 + arg5 * anInt5588] = (byte) local21;
					aByteArray62[arg4 + arg5 * anInt5588] = 0;
				} else {
					aByteArray62[arg4 + arg5 * anInt5588] = (byte) local21;
					aByteArray60[arg4 + arg5 * anInt5588] = 0;
					aByteArray61[arg4 + arg5 * anInt5588] = arg1.method4865();
				}
			}
			return;
		}
		@Pc(100) int local100 = (local3 >> 1 & 0x3) + 1;
		@Pc(108) boolean local108 = (local3 & 0x8) != 0;
		@Pc(116) boolean local116 = (local3 & 0x10) != 0;
		for (@Pc(118) int local118 = 0; local118 < local100; local118++) {
			@Pc(123) int local123 = arg1.method4864();
			@Pc(125) int local125 = 0;
			@Pc(127) int local127 = 0;
			if (local108) {
				local125 = arg1.method4864();
				local127 = arg1.method4864();
			}
			@Pc(139) int local139 = 0;
			if (local116) {
				local139 = arg1.method4864();
			}
			@Pc(215) short[] local215;
			@Pc(218) byte[] local218;
			@Pc(220) int local220;
			if (local118 == 0) {
				aByteArray61[arg4 + arg5 * anInt5588] = (byte) local123;
				aByteArray62[arg4 + arg5 * anInt5588] = (byte) local125;
				aByteArray60[arg4 + arg5 * anInt5588] = (byte) local127;
				if (local139 == 1) {
					aShortArray73[arg4 + arg5 * anInt5588] = (short) (arg1.method4877() + 1);
					aByteArray64[arg4 + arg5 * anInt5588] = arg1.method4865();
				} else if (local139 > 1) {
					aShortArray73[arg4 + arg5 * anInt5588] = -1;
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method4877();
						local218[local220] = arg1.method4865();
					}
					aClass196_29.method4474((long) (arg4 << 16 | arg5), new Class4_Sub16(local215, local218));
				}
			} else {
				local215 = null;
				local218 = null;
				if (local139 > 0) {
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method4877();
						local218[local220] = arg1.method4865();
					}
				}
				if (aClass27ArrayArrayArray2[local118 - 1][arg2 - (anInt5581 >> 6)][arg3 - (anInt5584 >> 6)] == null) {
					aClass27ArrayArrayArray2[local118 - 1][arg2 - (anInt5581 >> 6)][arg3 - (anInt5584 >> 6)] = new Class27();
				}
				@Pc(338) Class41_Sub8 local338 = new Class41_Sub8(arg4 & 0x3F, arg5 & 0x3F, local123, local125, local127, local215, local218);
				aClass27ArrayArrayArray2[local118 - 1][arg2 - (anInt5581 >> 6)][arg3 - (anInt5584 >> 6)].method725(local338);
			}
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "([B[B[SII)V")
	private static void method4301(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int[] local2 = new int[anInt5580];
		@Pc(5) int[] local5 = new int[anInt5580];
		@Pc(8) int[] local8 = new int[anInt5580];
		@Pc(11) int[] local11 = new int[anInt5580];
		@Pc(14) int[] local14 = new int[anInt5580];
		for (@Pc(16) int local16 = -5; local16 < anInt5588; local16++) {
			@Pc(21) int local21 = local16 + 5;
			@Pc(25) int local25 = local16 - 5;
			@Pc(41) int local41;
			for (@Pc(27) int local27 = 0; local27 < anInt5580; local27++) {
				@Pc(50) Class13 local50;
				@Pc(86) int local86;
				if (local21 < anInt5588) {
					local41 = arg0[local21 + local27 * anInt5588] & 0xFF;
					if (local41 > 0) {
						local50 = aClass23_3.method633(local41 - 1);
						local2[local27] += local50.anInt415;
						local5[local27] += local50.anInt406;
						local8[local27] += local50.anInt413;
						local11[local27] += local50.anInt405;
						local86 = local14[local27]++;
					}
				}
				if (local25 >= 0) {
					local41 = arg0[local25 + local27 * anInt5588] & 0xFF;
					if (local41 > 0) {
						local50 = aClass23_3.method633(local41 - 1);
						local2[local27] -= local50.anInt415;
						local5[local27] -= local50.anInt406;
						local8[local27] -= local50.anInt413;
						local11[local27] -= local50.anInt405;
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
				for (@Pc(167) int local167 = -5; local167 < anInt5580; local167++) {
					@Pc(172) int local172 = local167 + 5;
					if (local172 < anInt5580) {
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
						if ((arg0[local16 + local167 * anInt5588] & 0xFF) == 0) {
							local261 = local16 + local167 * anInt5588;
							arg1[local261] = 0;
							arg2[local261] = 0;
						} else {
							local261 = local163 == 0 ? 0 : Static384.method4870(local159 / local165, local41 * 256 / local163, local161 / local165);
							@Pc(294) int local294 = (local261 & 0x7F) + arg4;
							if (local294 < 0) {
								local294 = 0;
							} else if (local294 > 127) {
								local294 = 127;
							}
							@Pc(316) int local316 = (local261 + arg3 & 0xFC00) + (local261 & 0x380) + local294;
							@Pc(322) int local322 = local16 + local167 * anInt5588;
							@Pc(333) int local333 = Static261.anIntArray393[Static222.method3111(Static56.method1135(local316)) & 0xFFFF];
							arg1[local322] = (byte) (local333 >> 16 & 0xFF);
							arg2[local322] = (short) (local333 & 0xFFFF);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lclient!m;II)V")
	public static void method4302(@OriginalArg(0) Interface10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < aClass112_5.anInt2985; local1++) {
			anIntArray477[local1 + 1] = method4288(arg0, local1, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lclient!qa;II)V")
	public static void method4303(@OriginalArg(0) Class30 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class4_Sub30 local9 = new Class4_Sub30(aClass166_219.method3673("area", aClass4_Sub1_Sub16_2.aString58));
		@Pc(13) int local13 = local9.method4864();
		@Pc(16) int[] local16 = new int[local13];
		for (@Pc(18) int local18 = 0; local18 < local13; local18++) {
			local16[local18] = local9.method4864();
		}
		@Pc(33) int local33 = local9.method4864();
		@Pc(36) int[] local36 = new int[local33];
		for (@Pc(38) int local38 = 0; local38 < local33; local38++) {
			local36[local38] = local9.method4864();
		}
		while (true) {
			@Pc(58) int local58;
			@Pc(64) int local64;
			@Pc(67) int local67;
			@Pc(76) int local76;
			@Pc(148) int local148;
			while (local9.anInt6244 < local9.aByteArray79.length) {
				@Pc(62) int local62;
				@Pc(84) int local84;
				if (local9.method4864() == 0) {
					local58 = local9.method4864();
					local62 = local9.method4864();
					for (local64 = 0; local64 < 64; local64++) {
						for (local67 = 0; local67 < 64; local67++) {
							local76 = local58 * 64 + local64 - anInt5581;
							local84 = local62 * 64 + local67 - anInt5584;
							method4300(arg0, local9, local58, local62, local76, local84, local16, local36);
						}
					}
				} else {
					local58 = local9.method4864();
					local62 = local9.method4864();
					local64 = local9.method4864();
					local67 = local9.method4864();
					for (local76 = 0; local76 < 8; local76++) {
						for (local84 = 0; local84 < 8; local84++) {
							@Pc(136) int local136 = local58 * 64 + local64 * 8 + local76 - anInt5581;
							local148 = local62 * 64 + local67 * 8 + local84 - anInt5584;
							method4300(arg0, local9, local58, local62, local136, local148, local16, local36);
						}
					}
				}
			}
			aByteArray63 = new byte[anInt5588 * anInt5580];
			aShortArray72 = new short[anInt5588 * anInt5580];
			for (local58 = 0; local58 < 3; local58++) {
				@Pc(191) byte[] local191 = new byte[anInt5588 * anInt5580];
				for (local64 = 0; local64 < aClass27ArrayArrayArray2[local58].length; local64++) {
					for (local67 = 0; local67 < aClass27ArrayArrayArray2[local58][0].length; local67++) {
						@Pc(205) Class27 local205 = aClass27ArrayArrayArray2[local58][local64][local67];
						if (local205 != null) {
							for (@Pc(212) Class41_Sub8 local212 = (Class41_Sub8) local205.method730(); local212 != null; local212 = (Class41_Sub8) local205.method735()) {
								local191[local64 * 64 + local212.aByte93 + (local67 * 64 + local212.aByte95) * anInt5588] = (byte) local212.anInt6351;
							}
						}
					}
				}
				method4301(local191, aByteArray63, aShortArray72, arg1, arg2);
				for (local67 = 0; local67 < aClass27ArrayArrayArray2[local58].length; local67++) {
					for (local76 = 0; local76 < aClass27ArrayArrayArray2[local58][0].length; local76++) {
						@Pc(276) Class27 local276 = aClass27ArrayArrayArray2[local58][local67][local76];
						if (local276 != null) {
							for (@Pc(283) Class41_Sub8 local283 = (Class41_Sub8) local276.method730(); local283 != null; local283 = (Class41_Sub8) local276.method735()) {
								local148 = local67 * 64 + local283.aByte93 + (local76 * 64 + local283.aByte95) * anInt5588;
								local283.anInt6351 = (aByteArray63[local148] & 0xFF) << 16 | aShortArray72[local148] & 0xFFFF;
								if (local283.anInt6351 != 0) {
									local283.anInt6351 |= 0xFF000000;
								}
							}
						}
					}
				}
			}
			method4301(aByteArray61, aByteArray63, aShortArray72, arg1, arg2);
			aByteArray61 = null;
			method4292();
			return;
		}
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "(Lclient!qa;)V")
	public static void method4304(@OriginalArg(0) Class30 arg0) {
		@Pc(3) int local3 = anInt5585 - anInt5590;
		@Pc(7) int local7 = anInt5583 - anInt5591;
		@Pc(15) int local15 = (anInt5582 - anInt5589 << 16) / local3;
		@Pc(23) int local23 = (anInt5586 - anInt5587 << 16) / local7;
		method4297(arg0, local15, local23);
	}
}
