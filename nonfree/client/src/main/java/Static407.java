import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static407 {

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "Lclient!iba;")
	public static Class161 aClass161_3;

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "Lclient!ot;")
	public static Class5_Sub2_Sub18 aClass5_Sub2_Sub18_2;

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "Lclient!ab;")
	private static Class3 aClass3_5;

	@OriginalMember(owner = "client!nv", name = "d", descriptor = "Lclient!cb;")
	public static Class50 aClass50_108;

	@OriginalMember(owner = "client!nv", name = "e", descriptor = "Lclient!gs;")
	public static Class140 aClass140_3;

	@OriginalMember(owner = "client!nv", name = "g", descriptor = "Lclient!pca;")
	private static Class269 aClass269_5;

	@OriginalMember(owner = "client!nv", name = "h", descriptor = "Lclient!qi;")
	public static Interface23 anInterface23_2;

	@OriginalMember(owner = "client!nv", name = "i", descriptor = "Lclient!lha;")
	public static Class218 aClass218_3;

	@OriginalMember(owner = "client!nv", name = "k", descriptor = "Lclient!dia;")
	public static Class79 aClass79_2;

	@OriginalMember(owner = "client!nv", name = "l", descriptor = "F")
	public static float aFloat125;

	@OriginalMember(owner = "client!nv", name = "m", descriptor = "F")
	public static float aFloat126;

	@OriginalMember(owner = "client!nv", name = "n", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!nv", name = "r", descriptor = "I")
	public static int anInt6534;

	@OriginalMember(owner = "client!nv", name = "t", descriptor = "I")
	public static int anInt6535;

	@OriginalMember(owner = "client!nv", name = "u", descriptor = "I")
	public static int anInt6536;

	@OriginalMember(owner = "client!nv", name = "v", descriptor = "[[[Lclient!eo;")
	private static Class102[][][] aClass102ArrayArrayArray2;

	@OriginalMember(owner = "client!nv", name = "w", descriptor = "[S")
	private static short[] aShortArray84;

	@OriginalMember(owner = "client!nv", name = "x", descriptor = "[B")
	private static byte[] aByteArray70;

	@OriginalMember(owner = "client!nv", name = "y", descriptor = "[I")
	private static int[] anIntArray368;

	@OriginalMember(owner = "client!nv", name = "z", descriptor = "I")
	public static int anInt6537;

	@OriginalMember(owner = "client!nv", name = "A", descriptor = "[S")
	private static short[] aShortArray85;

	@OriginalMember(owner = "client!nv", name = "B", descriptor = "I")
	public static int anInt6538;

	@OriginalMember(owner = "client!nv", name = "C", descriptor = "I")
	public static int anInt6539;

	@OriginalMember(owner = "client!nv", name = "D", descriptor = "[B")
	private static byte[] aByteArray71;

	@OriginalMember(owner = "client!nv", name = "E", descriptor = "I")
	public static int anInt6540;

	@OriginalMember(owner = "client!nv", name = "F", descriptor = "I")
	public static int anInt6541;

	@OriginalMember(owner = "client!nv", name = "G", descriptor = "[B")
	private static byte[] aByteArray72;

	@OriginalMember(owner = "client!nv", name = "H", descriptor = "I")
	public static int anInt6542;

	@OriginalMember(owner = "client!nv", name = "I", descriptor = "I")
	public static int anInt6543;

	@OriginalMember(owner = "client!nv", name = "J", descriptor = "I")
	public static int anInt6544;

	@OriginalMember(owner = "client!nv", name = "K", descriptor = "Lclient!tga;")
	private static Class335 aClass335_33;

	@OriginalMember(owner = "client!nv", name = "L", descriptor = "I")
	public static int anInt6545;

	@OriginalMember(owner = "client!nv", name = "M", descriptor = "[B")
	private static byte[] aByteArray73;

	@OriginalMember(owner = "client!nv", name = "N", descriptor = "I")
	public static int anInt6546;

	@OriginalMember(owner = "client!nv", name = "O", descriptor = "[B")
	private static byte[] aByteArray74;

	@OriginalMember(owner = "client!nv", name = "f", descriptor = "Lclient!tga;")
	private static final Class335 aClass335_32 = new Class335(16);

	@OriginalMember(owner = "client!nv", name = "j", descriptor = "[B")
	private static final byte[] aByteArray69 = new byte[1];

	@OriginalMember(owner = "client!nv", name = "o", descriptor = "I")
	public static int anInt6532 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!nv", name = "p", descriptor = "I")
	public static int anInt6533 = (int) (Math.random() * 11.0D) - 5;

	@OriginalMember(owner = "client!nv", name = "q", descriptor = "[S")
	private static final short[] aShortArray83 = new short[1];

	@OriginalMember(owner = "client!nv", name = "s", descriptor = "Lclient!ga;")
	public static final Class124 aClass124_66 = new Class124();

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "()V")
	private static void method5494() {
		@Pc(4) int local4;
		@Pc(15) int local15;
		@Pc(49) int local49;
		for (@Pc(1) int local1 = 0; local1 < anInt6541; local1++) {
			for (local4 = 0; local4 < anInt6536; local4++) {
				local15 = aShortArray84[local1 + local4 * anInt6541] & 0xFFFF;
				if (local15 != 0) {
					@Pc(35) int local35;
					if (local15 == 65535) {
						@Pc(31) Class5_Sub23 local31 = (Class5_Sub23) aClass335_33.method7766((long) (local1 << 16 | local4));
						if (local31 != null) {
							for (local35 = 0; local35 < local31.aShortArray30.length; local35++) {
								@Pc(46) Class81 local46 = aClass140_3.method2839(local31.aShortArray30[local35] & 0xFFFF);
								local49 = local46.anInt1914;
								if (local46.anIntArray100 != null) {
									local46 = local46.method1760(anInterface23_2);
									if (local46 != null) {
										local49 = local46.anInt1914;
									}
								}
								if (local49 != -1) {
									@Pc(70) Class5_Sub40 local70 = new Class5_Sub40(local49);
									local70.anInt7521 = local1;
									local70.anInt7516 = local4;
									aClass124_66.method2574(local70);
								}
							}
						}
					} else {
						@Pc(94) Class81 local94 = aClass140_3.method2839(local15 - 1);
						local35 = local94.anInt1914;
						if (local94.anIntArray100 != null) {
							local94 = local94.method1760(anInterface23_2);
							if (local94 != null) {
								local35 = local94.anInt1914;
							}
						}
						if (local35 != -1) {
							@Pc(118) Class5_Sub40 local118 = new Class5_Sub40(local35);
							local118.anInt7521 = local1;
							local118.anInt7516 = local4;
							aClass124_66.method2574(local118);
						}
					}
				}
			}
		}
		for (local4 = 0; local4 < 3; local4++) {
			for (local15 = 0; local15 < aClass102ArrayArrayArray2[0].length; local15++) {
				for (@Pc(144) int local144 = 0; local144 < aClass102ArrayArrayArray2[0][0].length; local144++) {
					@Pc(153) Class102 local153 = aClass102ArrayArrayArray2[local4][local15][local144];
					if (local153 != null) {
						for (@Pc(160) Class41_Sub5 local160 = (Class41_Sub5) local153.method2062(); local160 != null; local160 = (Class41_Sub5) local153.method2054()) {
							if (local160.aShortArray74 != null) {
								for (local49 = 0; local49 < local160.aShortArray74.length; local49++) {
									@Pc(177) Class81 local177 = aClass140_3.method2839(local160.aShortArray74[local49] & 0xFFFF);
									@Pc(180) int local180 = local177.anInt1914;
									if (local177.anIntArray100 != null) {
										local177 = local177.method1760(anInterface23_2);
										if (local177 != null) {
											local180 = local177.anInt1914;
										}
									}
									if (local180 != -1) {
										@Pc(201) Class5_Sub40 local201 = new Class5_Sub40(local180);
										local201.anInt7521 = (local15 + (anInt6543 >> 6)) * 64 + local160.aByte79 - anInt6543;
										local201.anInt7516 = (local144 + (anInt6539 >> 6)) * 64 + local160.aByte76 - anInt6539;
										aClass124_66.method2574(local201);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!ha;IIII)Lclient!ga;")
	private static Class124 method5495(@OriginalArg(0) Class143 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(4) Class5_Sub40 local4 = (Class5_Sub40) aClass124_66.method2572(); local4 != null; local4 = (Class5_Sub40) aClass124_66.method2569()) {
			method5513(arg0, local4, arg1, arg2);
		}
		return aClass124_66;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!d;III)I")
	private static int method5496(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class123 local4 = aClass3_5.method40(arg1);
		if (local4 == null) {
			return 0;
		}
		@Pc(11) int local11 = local4.anInt2868;
		if (local11 >= 0 && arg0.method8501(local11).aBoolean660) {
			local11 = -1;
		}
		@Pc(68) int local68;
		@Pc(27) int local27;
		@Pc(33) int local33;
		@Pc(55) int local55;
		if (local4.anInt2862 >= 0) {
			local27 = local4.anInt2862;
			local33 = (local27 & 0x7F) + arg3;
			if (local33 < 0) {
				local33 = 0;
			} else if (local33 > 127) {
				local33 = 127;
			}
			local55 = (local27 + arg2 & 0xFC00) + (local27 & 0x380) + local33;
			local68 = Static254.anIntArray246[Static239.method3445(Static382.method5578(local55)) & 0xFFFF] | 0xFF000000;
		} else if (local11 >= 0) {
			local68 = Static254.anIntArray246[Static239.method3445(Static382.method5578(arg0.method8501(local11).aShort102)) & 0xFFFF] | 0xFF000000;
		} else if (local4.anInt2869 == -1) {
			local68 = 0;
		} else {
			local27 = local4.anInt2869;
			local33 = (local27 & 0x7F) + arg3;
			if (local33 < 0) {
				local33 = 0;
			} else if (local33 > 127) {
				local33 = 127;
			}
			local55 = (local27 + arg2 & 0xFC00) + (local27 & 0x380) + local33;
			local68 = Static254.anIntArray246[Static239.method3445(Static382.method5578(local55)) & 0xFFFF] | 0xFF000000;
		}
		return local68;
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(Lclient!ha;IIII)V")
	private static void method5497(@OriginalArg(0) Class143 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = anInt6540 - anInt6537;
		@Pc(7) int local7 = anInt6546 - anInt6542;
		if (anInt6540 < anInt6541) {
			local3++;
		}
		if (anInt6546 < anInt6536) {
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
			local28 = (arg1 * local17 >> 16) + anInt6535;
			local40 = (arg1 * (local17 + 1) >> 16) + anInt6535;
			local44 = local40 - local28;
			if (local44 > 0) {
				local50 = anInt6537 + local17;
				if (local50 >= 0 && local50 < anInt6541) {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt6544 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt6544 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (local84 > 0) {
							local93 = local57 + anInt6542;
							local173 = local50 + local93 * anInt6541;
							local175 = 0;
							local177 = 0;
							local179 = 0;
							if (local93 >= 0 && local93 < anInt6536) {
								local175 = (aByteArray71[local173] & 0xFF) << 16 | aShortArray85[local173] & 0xFFFF;
								if (local175 != 0) {
									local175 |= 0xFF000000;
								}
								local177 = aByteArray70[local173] & 0xFF;
								local179 = aShortArray84[local173] & 0xFFFF;
							}
							if (local175 == 0 && local177 == 0 && local179 == 0) {
								if (aClass5_Sub2_Sub18_2.anInt7667 != -1) {
									local175 = aClass5_Sub2_Sub18_2.anInt7667 | 0xFF000000;
								} else if ((local17 + anInt6537 & 0x4) == (local57 + anInt6546 & 0x4)) {
									local175 = anIntArray368[aClass3_5.anInt30 + 1];
								} else {
									local175 = -11840664;
								}
								if (local175 == 0) {
									local175 = -16777216;
								}
								arg0.aa(local28, local70, local44, local84, local175, 0);
							} else if (local179 <= 0) {
								method5511(arg0, local28, local70, local44, local84, local175, local177, aByteArray72[local173], (short[]) null, (byte[]) null, true);
							} else if (local179 == 65535) {
								@Pc(282) Class5_Sub23 local282 = (Class5_Sub23) aClass335_33.method7766((long) (local50 << 16 | local93));
								if (local282 != null) {
									method5511(arg0, local28, local70, local44, local84, local175, local177, aByteArray72[local173], local282.aShortArray30, local282.aByteArray20, true);
								}
							} else {
								aShortArray83[0] = (short) (local179 - 1);
								aByteArray69[0] = aByteArray74[local173];
								method5511(arg0, local28, local70, local44, local84, local175, local177, aByteArray72[local173], aShortArray83, aByteArray69, true);
							}
						}
					}
				} else {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt6544 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt6544 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (aClass5_Sub2_Sub18_2.anInt7667 != -1) {
							local93 = aClass5_Sub2_Sub18_2.anInt7667 | 0xFF000000;
						} else if ((local17 + anInt6537 & 0x4) == (local57 + anInt6546 & 0x4)) {
							local93 = anIntArray368[aClass3_5.anInt30 + 1];
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
			local40 = (arg1 * local28 >> 16) + anInt6535;
			local44 = (arg1 * (local28 + 1) >> 16) + anInt6535;
			local50 = local44 - local40;
			if (local50 > 0) {
				local57 = local28 + anInt6537;
				if (local57 >= 0 && local57 < anInt6541) {
					for (local70 = -16; local70 < local7 + 16; local70++) {
						local80 = anInt6544 - (arg2 * (local70 + 1) >> 16);
						local84 = anInt6544 - (arg2 * local70 >> 16);
						local93 = local84 - local80;
						if (local93 > 0) {
							local173 = local70 + anInt6542;
							if (local173 >= 0 && local173 < anInt6536) {
								local175 = aShortArray84[local57 + local173 * anInt6541] & 0xFFFF;
								if (local175 <= 0) {
									method5506(arg0, local40, local80, local50, local93, (short[]) null, (byte[]) null);
								} else if (local175 == 65535) {
									@Pc(459) Class5_Sub23 local459 = (Class5_Sub23) aClass335_33.method7766((long) (local57 << 16 | local173));
									if (local459 != null) {
										method5506(arg0, local40, local80, local50, local93, local459.aShortArray30, local459.aByteArray20);
									}
								} else {
									aShortArray83[0] = (short) (local175 - 1);
									aByteArray69[0] = aByteArray74[local57 + local173 * anInt6541];
									method5506(arg0, local40, local80, local50, local93, aShortArray83, aByteArray69);
								}
							}
						}
					}
				}
			}
		}
		local40 = anInt6537 >> 6;
		local44 = anInt6542 >> 6;
		if (local40 < 0) {
			local40 = 0;
		}
		if (local44 < 0) {
			local44 = 0;
		}
		local50 = anInt6540 >> 6;
		local57 = anInt6546 >> 6;
		if (local50 >= aClass102ArrayArrayArray2[0].length) {
			local50 = aClass102ArrayArrayArray2[0].length - 1;
		}
		if (local57 >= aClass102ArrayArrayArray2[0][0].length) {
			local57 = aClass102ArrayArrayArray2[0][0].length - 1;
		}
		for (local70 = 0; local70 < 3; local70++) {
			@Pc(641) int local641;
			@Pc(653) int local653;
			@Pc(665) int local665;
			@Pc(675) int local675;
			@Pc(631) int local631;
			for (local80 = local40; local80 <= local50; local80++) {
				for (local84 = local44; local84 <= local57; local84++) {
					@Pc(589) Class102 local589 = aClass102ArrayArrayArray2[local70][local80][local84];
					if (local589 != null) {
						local173 = (local80 + (anInt6543 >> 6)) * 64;
						local175 = (local84 + (anInt6539 >> 6)) * 64;
						for (@Pc(612) Class41_Sub5 local612 = (Class41_Sub5) local589.method2062(); local612 != null; local612 = (Class41_Sub5) local589.method2054()) {
							local179 = local173 + local612.aByte79 - anInt6543 - anInt6537;
							local631 = local175 + local612.aByte76 - anInt6539 - anInt6542;
							local641 = (arg1 * local179 >> 16) + anInt6535;
							local653 = (arg1 * (local179 + 1) >> 16) + anInt6535;
							local665 = anInt6544 - (arg2 * (local631 + 1) >> 16);
							local675 = anInt6544 - (arg2 * local631 >> 16);
							method5511(arg0, local641, local665, local653 - local641, local675 - local665, local612.anInt5893, local612.aByte78 & 0xFF, local612.aByte77, local612.aShortArray74, local612.aByteArray57, false);
						}
					}
				}
			}
			for (local84 = local40; local84 <= local50; local84++) {
				for (local93 = local44; local93 <= local57; local93++) {
					@Pc(727) Class102 local727 = aClass102ArrayArrayArray2[local70][local84][local93];
					if (local727 != null) {
						local175 = (local84 + (anInt6543 >> 6)) * 64;
						local177 = (local93 + (anInt6539 >> 6)) * 64;
						for (@Pc(750) Class41_Sub5 local750 = (Class41_Sub5) local727.method2062(); local750 != null; local750 = (Class41_Sub5) local727.method2054()) {
							local631 = local175 + local750.aByte79 - anInt6543 - anInt6537;
							local641 = local177 + local750.aByte76 - anInt6539 - anInt6542;
							local653 = (arg1 * local631 >> 16) + anInt6535;
							local665 = (arg1 * (local631 + 1) >> 16) + anInt6535;
							local675 = anInt6544 - (arg2 * (local641 + 1) >> 16);
							@Pc(813) int local813 = anInt6544 - (arg2 * local641 >> 16);
							method5506(arg0, local653, local675, local665 - local653, local813 - local675, local750.aShortArray74, local750.aByteArray57);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!ha;Lclient!rv;IIII[I[I)V")
	private static void method5498(@OriginalArg(0) Class143 arg0, @OriginalArg(1) Class5_Sub15 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7) {
		@Pc(3) int local3 = arg1.method3642();
		if ((local3 & 0x1) == 0) {
			@Pc(15) boolean local15 = (local3 & 0x2) == 0;
			@Pc(21) int local21 = local3 >> 2 & 0x3F;
			if (local21 != 62) {
				if (local21 == 63) {
					local21 = arg1.method3642();
				} else if (local15) {
					local21 = arg6[local21];
				} else {
					local21 = arg7[local21];
				}
				if (local15) {
					aByteArray73[arg4 + arg5 * anInt6541] = (byte) local21;
					aByteArray70[arg4 + arg5 * anInt6541] = 0;
				} else {
					aByteArray70[arg4 + arg5 * anInt6541] = (byte) local21;
					aByteArray72[arg4 + arg5 * anInt6541] = 0;
					aByteArray73[arg4 + arg5 * anInt6541] = arg1.method3677();
				}
			}
			return;
		}
		@Pc(100) int local100 = (local3 >> 1 & 0x3) + 1;
		@Pc(108) boolean local108 = (local3 & 0x8) != 0;
		@Pc(116) boolean local116 = (local3 & 0x10) != 0;
		for (@Pc(118) int local118 = 0; local118 < local100; local118++) {
			@Pc(123) int local123 = arg1.method3642();
			@Pc(125) int local125 = 0;
			@Pc(127) int local127 = 0;
			if (local108) {
				local125 = arg1.method3642();
				local127 = arg1.method3642();
			}
			@Pc(139) int local139 = 0;
			if (local116) {
				local139 = arg1.method3642();
			}
			@Pc(215) short[] local215;
			@Pc(218) byte[] local218;
			@Pc(220) int local220;
			if (local118 == 0) {
				aByteArray73[arg4 + arg5 * anInt6541] = (byte) local123;
				aByteArray70[arg4 + arg5 * anInt6541] = (byte) local125;
				aByteArray72[arg4 + arg5 * anInt6541] = (byte) local127;
				if (local139 == 1) {
					aShortArray84[arg4 + arg5 * anInt6541] = (short) (arg1.method3698() + 1);
					aByteArray74[arg4 + arg5 * anInt6541] = arg1.method3677();
				} else if (local139 > 1) {
					aShortArray84[arg4 + arg5 * anInt6541] = -1;
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method3698();
						local218[local220] = arg1.method3677();
					}
					aClass335_33.method7770((long) (arg4 << 16 | arg5), new Class5_Sub23(local215, local218));
				}
			} else {
				local215 = null;
				local218 = null;
				if (local139 > 0) {
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method3698();
						local218[local220] = arg1.method3677();
					}
				}
				if (aClass102ArrayArrayArray2[local118 - 1][arg2 - (anInt6543 >> 6)][arg3 - (anInt6539 >> 6)] == null) {
					aClass102ArrayArrayArray2[local118 - 1][arg2 - (anInt6543 >> 6)][arg3 - (anInt6539 >> 6)] = new Class102();
				}
				@Pc(338) Class41_Sub5 local338 = new Class41_Sub5(arg4 & 0x3F, arg5 & 0x3F, local123, local125, local127, local215, local218);
				aClass102ArrayArrayArray2[local118 - 1][arg2 - (anInt6543 >> 6)][arg3 - (anInt6539 >> 6)].method2055(local338);
			}
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!d;II)V")
	public static void method5499(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < aClass3_5.anInt24; local1++) {
			anIntArray368[local1 + 1] = method5496(arg0, local1, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "()V")
	public static void method5500() {
		aByteArray73 = null;
		aByteArray71 = null;
		aShortArray85 = null;
		aByteArray70 = null;
		aByteArray72 = null;
		aShortArray84 = null;
		aByteArray74 = null;
		aClass335_33 = null;
		aClass102ArrayArrayArray2 = null;
		anIntArray368 = null;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!cb;Lclient!ab;Lclient!pca;Lclient!gs;Lclient!lha;Lclient!iba;Lclient!qi;)V")
	public static void method5501(@OriginalArg(0) Class50 arg0, @OriginalArg(1) Class3 arg1, @OriginalArg(2) Class269 arg2, @OriginalArg(3) Class140 arg3, @OriginalArg(4) Class218 arg4, @OriginalArg(5) Class161 arg5, @OriginalArg(6) Interface23 arg6) {
		aClass50_108 = arg0;
		aClass3_5 = arg1;
		aClass269_5 = arg2;
		aClass140_3 = arg3;
		aClass218_3 = arg4;
		aClass161_3 = arg5;
		anInterface23_2 = arg6;
		aClass335_32.method7773();
		@Pc(21) int local21 = aClass50_108.method900("details");
		@Pc(26) int[] local26 = aClass50_108.method905(local21);
		if (local26 != null) {
			for (@Pc(30) int local30 = 0; local30 < local26.length; local30++) {
				@Pc(39) Class5_Sub2_Sub18 local39 = Static61.method7527(aClass50_108, local26[local30], local21);
				aClass335_32.method7770((long) local39.anInt7674, local39);
			}
		}
		Static168.method2468(true, false);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(I)V")
	public static void method5502(@OriginalArg(0) int arg0) {
		aClass5_Sub2_Sub18_2 = (Class5_Sub2_Sub18) aClass335_32.method7766((long) arg0);
	}

	@OriginalMember(owner = "client!nv", name = "d", descriptor = "()V")
	public static void method5503() {
		@Pc(2) int[] local2 = new int[3];
		for (@Pc(4) int local4 = 0; local4 < aClass79_2.anInt1866; local4++) {
			@Pc(32) boolean local32 = aClass5_Sub2_Sub18_2.method6514(aClass79_2.anIntArray94[local4] & 0x3FFF, aClass79_2.anIntArray94[local4] >> 28 & 0x3, local2, aClass79_2.anIntArray94[local4] >> 14 & 0x3FFF);
			if (local32) {
				@Pc(42) Class5_Sub40 local42 = new Class5_Sub40(aClass79_2.anIntArray95[local4]);
				local42.anInt7521 = local2[1] - anInt6543;
				local42.anInt7516 = local2[2] - anInt6539;
				aClass124_66.method2574(local42);
			}
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!ha;)V")
	public static void method5504(@OriginalArg(0) Class143 arg0) {
		@Pc(3) int local3 = anInt6540 - anInt6537;
		@Pc(7) int local7 = anInt6546 - anInt6542;
		@Pc(15) int local15 = (anInt6545 - anInt6535 << 16) / local3;
		@Pc(23) int local23 = (anInt6544 - anInt6538 << 16) / local7;
		method5497(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(Lclient!ha;)Lclient!ga;")
	public static Class124 method5505(@OriginalArg(0) Class143 arg0) {
		@Pc(3) int local3 = anInt6540 - anInt6537;
		@Pc(7) int local7 = anInt6546 - anInt6542;
		@Pc(15) int local15 = (anInt6545 - anInt6535 << 16) / local3;
		@Pc(23) int local23 = (anInt6544 - anInt6538 << 16) / local7;
		return method5495(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!ha;IIII[S[B)V")
	private static void method5506(@OriginalArg(0) Class143 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		if (arg5 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < arg5.length; local4++) {
			@Pc(14) Class81 local14 = aClass140_3.method2839(arg5[local4] & 0xFFFF);
			@Pc(17) int local17 = local14.anInt1888;
			if (local17 != -1) {
				@Pc(25) Class392 local25 = aClass161_3.method3448(local17);
				@Pc(49) Class59 local49 = local25.method8682(local14.aBoolean133 ? arg6[local4] >> 6 & 0x3 : 0, local14.aBoolean141 ? local14.aBoolean135 : false, arg0);
				if (local49 != null) {
					@Pc(58) int local58 = arg3 * local49.method8053() >> 2;
					@Pc(65) int local65 = arg4 * local49.method8064() >> 2;
					if (local25.aBoolean767) {
						@Pc(71) int local71 = local14.anInt1910;
						@Pc(74) int local74 = local14.anInt1897;
						if ((arg6[local4] >> 6 & 0x1) == 1) {
							@Pc(85) int local85 = local71;
							local71 = local74;
							local74 = local85;
						}
						local58 = local71 * arg3;
						local65 = local74 * arg4;
					}
					if (local58 != 0 && local65 != 0) {
						if (local25.anInt10401 == 0) {
							local49.method8055(arg1, arg2 + arg4 - local65, local58, local65);
						} else {
							local49.method8058(arg1, arg2 + arg4 - local65, local58, local65, 0, local25.anInt10401 | 0xFF000000, 1);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(II)Lclient!hf;")
	public static Class150 method5507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class150 local3 = new Class150();
		for (@Pc(8) Class5_Sub2_Sub18 local8 = (Class5_Sub2_Sub18) aClass335_32.method7768(); local8 != null; local8 = (Class5_Sub2_Sub18) aClass335_32.method7777()) {
			if (local8.aBoolean563 && local8.method6511(arg1, arg0)) {
				local3.method3095(local8);
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!nv", name = "e", descriptor = "()V")
	public static void method5508() {
		aByteArray73 = new byte[anInt6541 * anInt6536];
		aByteArray70 = new byte[anInt6541 * anInt6536];
		aByteArray72 = new byte[anInt6541 * anInt6536];
		aShortArray84 = new short[anInt6541 * anInt6536];
		aByteArray74 = new byte[anInt6541 * anInt6536];
		aClass335_33 = new Class335(1024);
		aClass102ArrayArrayArray2 = new Class102[3][anInt6541 >> 6][anInt6536 >> 6];
		anIntArray368 = new int[aClass3_5.anInt24 + 1];
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		anInt6537 = arg0 - anInt6543;
		anInt6546 = arg1 - anInt6539;
		anInt6540 = arg2 - anInt6543;
		anInt6542 = arg3 - anInt6539;
		anInt6535 = arg4;
		anInt6538 = arg5;
		anInt6545 = arg6;
		anInt6544 = arg7;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!ha;Lclient!oga;Lclient!or;)V")
	public static void method5510(@OriginalArg(0) Class143 arg0, @OriginalArg(1) Class5_Sub40 arg1, @OriginalArg(2) Class262 arg2) {
		if (arg2.anIntArray427 == null) {
			return;
		}
		@Pc(7) int[] local7 = new int[arg2.anIntArray427.length];
		@Pc(20) int local20;
		@Pc(32) int local32;
		for (@Pc(9) int local9 = 0; local9 < local7.length / 2; local9++) {
			local20 = arg2.anIntArray427[local9 * 2] + arg1.anInt7521;
			local32 = arg2.anIntArray427[local9 * 2 + 1] + arg1.anInt7516;
			local7[local9 * 2] = anInt6535 + (anInt6545 - anInt6535) * (local20 - anInt6537) / (anInt6540 - anInt6537);
			local7[local9 * 2 + 1] = anInt6544 - (anInt6544 - anInt6538) * (local32 - anInt6542) / (anInt6546 - anInt6542);
		}
		Static39.method497(arg0, local7, arg2.anInt7610);
		if (arg2.anInt7624 > 0) {
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
				arg0.method6209(local32, local102, local110, local120, arg2.anIntArray426[arg2.aByteArray76[local20] & 0xFF], arg2.anInt7624, arg2.anInt7642, arg2.anInt7643);
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
			arg0.method6209(local32, local102, local110, local120, arg2.anIntArray426[arg2.aByteArray76[arg2.aByteArray76.length - 1] & 0xFF], arg2.anInt7624, arg2.anInt7642, arg2.anInt7643);
			return;
		}
		for (local20 = 0; local20 < local7.length / 2 - 1; local20++) {
			arg0.method6202(local7[(local20 + 1) * 2], arg2.anIntArray426[arg2.aByteArray76[local20] & 0xFF], local7[local20 * 2], local7[(local20 + 1) * 2 + 1], local7[local20 * 2 + 1]);
		}
		arg0.method6202(local7[0], arg2.anIntArray426[arg2.aByteArray76[arg2.aByteArray76.length - 1] & 0xFF], local7[local7.length - 2], local7[1], local7[local7.length - 1]);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!ha;IIIIIII[S[BZ)V")
	private static void method5511(@OriginalArg(0) Class143 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) byte[] arg9, @OriginalArg(10) boolean arg10) {
		@Pc(20) int local20;
		@Pc(32) int local32;
		if (arg10 || arg5 != 0 || arg6 > 0) {
			if (arg6 == 0) {
				arg0.aa(arg1, arg2, arg3, arg4, arg5, 0);
			} else {
				local20 = arg7 & 0x3F;
				if (local20 == 0 || arg3 <= 1 || arg4 <= 1) {
					local32 = anIntArray368[arg6];
					if (arg10 || local32 != 0) {
						arg0.aa(arg1, arg2, arg3, arg4, local32, 0);
					}
				} else {
					local32 = arg10 ? 0 : 1;
					Static322.method5020(arg1, local32, arg4, arg2, anInt6534, arg5, aByteArrayArrayArray15, anIntArray368[arg6], arg3, local20, arg7 >> 6 & 0x3, arg0);
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
				@Pc(127) Class81 local127 = aClass140_3.method2839(arg8[local100] & 0xFFFF);
				if (local127.anInt1888 == -1) {
					@Pc(133) int local133 = -3355444;
					if (local127.anInt1885 == 1) {
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

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(II)Lclient!ot;")
	public static Class5_Sub2_Sub18 method5512(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(4) Class5_Sub2_Sub18 local4 = (Class5_Sub2_Sub18) aClass335_32.method7768(); local4 != null; local4 = (Class5_Sub2_Sub18) aClass335_32.method7777()) {
			if (local4.aBoolean563 && local4.method6511(arg1, arg0)) {
				return local4;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!ha;Lclient!oga;IIII)V")
	private static void method5513(@OriginalArg(0) Class143 arg0, @OriginalArg(1) Class5_Sub40 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		arg1.anInt7519 = anInt6535 + (arg2 * (arg1.anInt7521 - anInt6537) >> 16);
		arg1.anInt7517 = anInt6544 - (arg3 * (arg1.anInt7516 - anInt6542) >> 16);
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(I)Lclient!ot;")
	public static Class5_Sub2_Sub18 method5514(@OriginalArg(0) int arg0) {
		return (Class5_Sub2_Sub18) aClass335_32.method7766((long) arg0);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!ha;II)V")
	public static void method5515(@OriginalArg(0) Class143 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class5_Sub15 local9 = new Class5_Sub15(aClass50_108.method892(aClass5_Sub2_Sub18_2.aString75, "area"));
		@Pc(13) int local13 = local9.method3642();
		@Pc(16) int[] local16 = new int[local13];
		for (@Pc(18) int local18 = 0; local18 < local13; local18++) {
			local16[local18] = local9.method3642();
		}
		@Pc(33) int local33 = local9.method3642();
		@Pc(36) int[] local36 = new int[local33];
		for (@Pc(38) int local38 = 0; local38 < local33; local38++) {
			local36[local38] = local9.method3642();
		}
		while (true) {
			@Pc(58) int local58;
			@Pc(64) int local64;
			@Pc(67) int local67;
			@Pc(76) int local76;
			@Pc(148) int local148;
			while (local9.anInt4144 < local9.aByteArray45.length) {
				@Pc(62) int local62;
				@Pc(84) int local84;
				if (local9.method3642() == 0) {
					local58 = local9.method3642();
					local62 = local9.method3642();
					for (local64 = 0; local64 < 64; local64++) {
						for (local67 = 0; local67 < 64; local67++) {
							local76 = local58 * 64 + local64 - anInt6543;
							local84 = local62 * 64 + local67 - anInt6539;
							method5498(arg0, local9, local58, local62, local76, local84, local16, local36);
						}
					}
				} else {
					local58 = local9.method3642();
					local62 = local9.method3642();
					local64 = local9.method3642();
					local67 = local9.method3642();
					for (local76 = 0; local76 < 8; local76++) {
						for (local84 = 0; local84 < 8; local84++) {
							@Pc(136) int local136 = local58 * 64 + local64 * 8 + local76 - anInt6543;
							local148 = local62 * 64 + local67 * 8 + local84 - anInt6539;
							method5498(arg0, local9, local58, local62, local136, local148, local16, local36);
						}
					}
				}
			}
			aByteArray71 = new byte[anInt6541 * anInt6536];
			aShortArray85 = new short[anInt6541 * anInt6536];
			for (local58 = 0; local58 < 3; local58++) {
				@Pc(191) byte[] local191 = new byte[anInt6541 * anInt6536];
				for (local64 = 0; local64 < aClass102ArrayArrayArray2[local58].length; local64++) {
					for (local67 = 0; local67 < aClass102ArrayArrayArray2[local58][0].length; local67++) {
						@Pc(205) Class102 local205 = aClass102ArrayArrayArray2[local58][local64][local67];
						if (local205 != null) {
							for (@Pc(212) Class41_Sub5 local212 = (Class41_Sub5) local205.method2062(); local212 != null; local212 = (Class41_Sub5) local205.method2054()) {
								local191[local64 * 64 + local212.aByte79 + (local67 * 64 + local212.aByte76) * anInt6541] = (byte) local212.anInt5893;
							}
						}
					}
				}
				method5516(local191, aByteArray71, aShortArray85, arg1, arg2);
				for (local67 = 0; local67 < aClass102ArrayArrayArray2[local58].length; local67++) {
					for (local76 = 0; local76 < aClass102ArrayArrayArray2[local58][0].length; local76++) {
						@Pc(276) Class102 local276 = aClass102ArrayArrayArray2[local58][local67][local76];
						if (local276 != null) {
							for (@Pc(283) Class41_Sub5 local283 = (Class41_Sub5) local276.method2062(); local283 != null; local283 = (Class41_Sub5) local276.method2054()) {
								local148 = local67 * 64 + local283.aByte79 + (local76 * 64 + local283.aByte76) * anInt6541;
								local283.anInt5893 = (aByteArray71[local148] & 0xFF) << 16 | aShortArray85[local148] & 0xFFFF;
								if (local283.anInt5893 != 0) {
									local283.anInt5893 |= 0xFF000000;
								}
							}
						}
					}
				}
			}
			method5516(aByteArray73, aByteArray71, aShortArray85, arg1, arg2);
			aByteArray73 = null;
			method5494();
			return;
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "([B[B[SII)V")
	private static void method5516(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int[] local2 = new int[anInt6536];
		@Pc(5) int[] local5 = new int[anInt6536];
		@Pc(8) int[] local8 = new int[anInt6536];
		@Pc(11) int[] local11 = new int[anInt6536];
		@Pc(14) int[] local14 = new int[anInt6536];
		for (@Pc(16) int local16 = -5; local16 < anInt6541; local16++) {
			@Pc(21) int local21 = local16 + 5;
			@Pc(25) int local25 = local16 - 5;
			@Pc(41) int local41;
			for (@Pc(27) int local27 = 0; local27 < anInt6536; local27++) {
				@Pc(50) Class327 local50;
				@Pc(86) int local86;
				if (local21 < anInt6541) {
					local41 = arg0[local21 + local27 * anInt6541] & 0xFF;
					if (local41 > 0) {
						local50 = aClass269_5.method6615(local41 - 1);
						local2[local27] += local50.anInt8939;
						local5[local27] += local50.anInt8954;
						local8[local27] += local50.anInt8945;
						local11[local27] += local50.anInt8950;
						local86 = local14[local27]++;
					}
				}
				if (local25 >= 0) {
					local41 = arg0[local25 + local27 * anInt6541] & 0xFF;
					if (local41 > 0) {
						local50 = aClass269_5.method6615(local41 - 1);
						local2[local27] -= local50.anInt8939;
						local5[local27] -= local50.anInt8954;
						local8[local27] -= local50.anInt8945;
						local11[local27] -= local50.anInt8950;
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
				for (@Pc(167) int local167 = -5; local167 < anInt6536; local167++) {
					@Pc(172) int local172 = local167 + 5;
					if (local172 < anInt6536) {
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
						if ((arg0[local16 + local167 * anInt6541] & 0xFF) == 0) {
							local261 = local16 + local167 * anInt6541;
							arg1[local261] = 0;
							arg2[local261] = 0;
						} else {
							local261 = local163 == 0 ? 0 : Static244.method3490(local41 * 256 / local163, local161 / local165, local159 / local165);
							@Pc(294) int local294 = (local261 & 0x7F) + arg4;
							if (local294 < 0) {
								local294 = 0;
							} else if (local294 > 127) {
								local294 = 127;
							}
							@Pc(316) int local316 = (local261 + arg3 & 0xFC00) + (local261 & 0x380) + local294;
							@Pc(322) int local322 = local16 + local167 * anInt6541;
							@Pc(333) int local333 = Static254.anIntArray246[Static239.method3445(Static32.method424(local316)) & 0xFFFF];
							arg1[local322] = (byte) (local333 >> 16 & 0xFF);
							arg2[local322] = (short) (local333 & 0xFFFF);
						}
					}
				}
			}
		}
	}
}
