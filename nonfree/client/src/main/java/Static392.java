import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static392 {

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "Lclient!rg;")
	private static Class291 aClass291_6;

	@OriginalMember(owner = "client!ou", name = "c", descriptor = "Lclient!kd;")
	public static Class190 aClass190_4;

	@OriginalMember(owner = "client!ou", name = "d", descriptor = "Lclient!o;")
	public static Class4_Sub7_Sub13 aClass4_Sub7_Sub13_2;

	@OriginalMember(owner = "client!ou", name = "e", descriptor = "Lclient!aba;")
	public static Interface1 anInterface1_2;

	@OriginalMember(owner = "client!ou", name = "f", descriptor = "Lclient!ik;")
	private static Class162 aClass162_10;

	@OriginalMember(owner = "client!ou", name = "g", descriptor = "Lclient!bi;")
	public static Class31 aClass31_107;

	@OriginalMember(owner = "client!ou", name = "h", descriptor = "Lclient!uk;")
	public static Class337 aClass337_4;

	@OriginalMember(owner = "client!ou", name = "i", descriptor = "Lclient!rea;")
	public static Class288 aClass288_3;

	@OriginalMember(owner = "client!ou", name = "j", descriptor = "Lclient!dca;")
	public static Class67 aClass67_3;

	@OriginalMember(owner = "client!ou", name = "k", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray20;

	@OriginalMember(owner = "client!ou", name = "l", descriptor = "F")
	public static float aFloat187;

	@OriginalMember(owner = "client!ou", name = "n", descriptor = "I")
	public static int anInt8790;

	@OriginalMember(owner = "client!ou", name = "p", descriptor = "F")
	public static float aFloat188;

	@OriginalMember(owner = "client!ou", name = "t", descriptor = "I")
	public static int anInt8793;

	@OriginalMember(owner = "client!ou", name = "u", descriptor = "I")
	public static int anInt8794;

	@OriginalMember(owner = "client!ou", name = "v", descriptor = "[B")
	private static byte[] aByteArray111;

	@OriginalMember(owner = "client!ou", name = "w", descriptor = "I")
	public static int anInt8795;

	@OriginalMember(owner = "client!ou", name = "x", descriptor = "I")
	public static int anInt8796;

	@OriginalMember(owner = "client!ou", name = "y", descriptor = "I")
	public static int anInt8797;

	@OriginalMember(owner = "client!ou", name = "z", descriptor = "[I")
	private static int[] anIntArray671;

	@OriginalMember(owner = "client!ou", name = "A", descriptor = "I")
	public static int anInt8798;

	@OriginalMember(owner = "client!ou", name = "B", descriptor = "I")
	public static int anInt8799;

	@OriginalMember(owner = "client!ou", name = "C", descriptor = "Lclient!jw;")
	private static Class183 aClass183_36;

	@OriginalMember(owner = "client!ou", name = "D", descriptor = "[B")
	private static byte[] aByteArray112;

	@OriginalMember(owner = "client!ou", name = "E", descriptor = "I")
	public static int anInt8800;

	@OriginalMember(owner = "client!ou", name = "F", descriptor = "[B")
	private static byte[] aByteArray113;

	@OriginalMember(owner = "client!ou", name = "G", descriptor = "[B")
	private static byte[] aByteArray114;

	@OriginalMember(owner = "client!ou", name = "H", descriptor = "[B")
	private static byte[] aByteArray115;

	@OriginalMember(owner = "client!ou", name = "I", descriptor = "I")
	public static int anInt8801;

	@OriginalMember(owner = "client!ou", name = "J", descriptor = "[[[Lclient!aea;")
	private static Class8[][][] aClass8ArrayArrayArray2;

	@OriginalMember(owner = "client!ou", name = "K", descriptor = "I")
	public static int anInt8802;

	@OriginalMember(owner = "client!ou", name = "L", descriptor = "I")
	public static int anInt8803;

	@OriginalMember(owner = "client!ou", name = "M", descriptor = "I")
	public static int anInt8804;

	@OriginalMember(owner = "client!ou", name = "N", descriptor = "[S")
	private static short[] aShortArray147;

	@OriginalMember(owner = "client!ou", name = "O", descriptor = "[S")
	private static short[] aShortArray148;

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "Lclient!jw;")
	private static final Class183 aClass183_35 = new Class183(16);

	@OriginalMember(owner = "client!ou", name = "m", descriptor = "[B")
	private static final byte[] aByteArray110 = new byte[1];

	@OriginalMember(owner = "client!ou", name = "o", descriptor = "[S")
	private static final short[] aShortArray146 = new short[1];

	@OriginalMember(owner = "client!ou", name = "q", descriptor = "I")
	public static int anInt8791 = (int) (Math.random() * 11.0D) - 5;

	@OriginalMember(owner = "client!ou", name = "r", descriptor = "Lclient!gj;")
	public static final Class124 aClass124_60 = new Class124();

	@OriginalMember(owner = "client!ou", name = "s", descriptor = "I")
	public static int anInt8792 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "()V")
	private static void method7223() {
		@Pc(4) int local4;
		@Pc(15) int local15;
		@Pc(49) int local49;
		for (@Pc(1) int local1 = 0; local1 < anInt8795; local1++) {
			for (local4 = 0; local4 < anInt8803; local4++) {
				local15 = aShortArray148[local1 + local4 * anInt8795] & 0xFFFF;
				if (local15 != 0) {
					@Pc(35) int local35;
					if (local15 == 65535) {
						@Pc(31) Class4_Sub23 local31 = (Class4_Sub23) aClass183_36.method4289((long) (local1 << 16 | local4));
						if (local31 != null) {
							for (local35 = 0; local35 < local31.aShortArray84.length; local35++) {
								@Pc(46) Class25 local46 = aClass288_3.method6419(local31.aShortArray84[local35] & 0xFFFF);
								local49 = local46.anInt617;
								if (local46.anIntArray115 != null) {
									local46 = local46.method578(anInterface1_2);
									if (local46 != null) {
										local49 = local46.anInt617;
									}
								}
								if (local49 != -1) {
									@Pc(70) Class4_Sub48 local70 = new Class4_Sub48(local49);
									local70.anInt8896 = local1;
									local70.anInt8900 = local4;
									aClass124_60.method3275(local70);
								}
							}
						}
					} else {
						@Pc(94) Class25 local94 = aClass288_3.method6419(local15 - 1);
						local35 = local94.anInt617;
						if (local94.anIntArray115 != null) {
							local94 = local94.method578(anInterface1_2);
							if (local94 != null) {
								local35 = local94.anInt617;
							}
						}
						if (local35 != -1) {
							@Pc(118) Class4_Sub48 local118 = new Class4_Sub48(local35);
							local118.anInt8896 = local1;
							local118.anInt8900 = local4;
							aClass124_60.method3275(local118);
						}
					}
				}
			}
		}
		for (local4 = 0; local4 < 3; local4++) {
			for (local15 = 0; local15 < aClass8ArrayArrayArray2[0].length; local15++) {
				for (@Pc(144) int local144 = 0; local144 < aClass8ArrayArrayArray2[0][0].length; local144++) {
					@Pc(153) Class8 local153 = aClass8ArrayArrayArray2[local4][local15][local144];
					if (local153 != null) {
						for (@Pc(160) Class26_Sub4 local160 = (Class26_Sub4) local153.method110(); local160 != null; local160 = (Class26_Sub4) local153.method113()) {
							if (local160.aShortArray104 != null) {
								for (local49 = 0; local49 < local160.aShortArray104.length; local49++) {
									@Pc(177) Class25 local177 = aClass288_3.method6419(local160.aShortArray104[local49] & 0xFFFF);
									@Pc(180) int local180 = local177.anInt617;
									if (local177.anIntArray115 != null) {
										local177 = local177.method578(anInterface1_2);
										if (local177 != null) {
											local180 = local177.anInt617;
										}
									}
									if (local180 != -1) {
										@Pc(201) Class4_Sub48 local201 = new Class4_Sub48(local180);
										local201.anInt8896 = (local15 + (anInt8797 >> 6)) * 64 + local160.aByte64 - anInt8797;
										local201.anInt8900 = (local144 + (anInt8804 >> 6)) * 64 + local160.aByte62 - anInt8804;
										aClass124_60.method3275(local201);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lclient!oa;Lclient!ub;IIII)V")
	private static void method7224(@OriginalArg(0) Class66 arg0, @OriginalArg(1) Class4_Sub48 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		arg1.anInt8898 = anInt8802 + (arg2 * (arg1.anInt8896 - anInt8798) >> 16);
		arg1.anInt8899 = anInt8796 - (arg3 * (arg1.anInt8900 - anInt8801) >> 16);
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lclient!oa;Lclient!eh;IIII[I[I)V")
	private static void method7225(@OriginalArg(0) Class66 arg0, @OriginalArg(1) Class4_Sub9 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7) {
		@Pc(3) int local3 = arg1.method6015();
		if ((local3 & 0x1) == 0) {
			@Pc(15) boolean local15 = (local3 & 0x2) == 0;
			@Pc(21) int local21 = local3 >> 2 & 0x3F;
			if (local21 != 62) {
				if (local21 == 63) {
					local21 = arg1.method6015();
				} else if (local15) {
					local21 = arg6[local21];
				} else {
					local21 = arg7[local21];
				}
				if (local15) {
					aByteArray115[arg4 + arg5 * anInt8795] = (byte) local21;
					aByteArray113[arg4 + arg5 * anInt8795] = 0;
				} else {
					aByteArray113[arg4 + arg5 * anInt8795] = (byte) local21;
					aByteArray112[arg4 + arg5 * anInt8795] = 0;
					aByteArray115[arg4 + arg5 * anInt8795] = arg1.method6021();
				}
			}
			return;
		}
		@Pc(100) int local100 = (local3 >> 1 & 0x3) + 1;
		@Pc(108) boolean local108 = (local3 & 0x8) != 0;
		@Pc(116) boolean local116 = (local3 & 0x10) != 0;
		for (@Pc(118) int local118 = 0; local118 < local100; local118++) {
			@Pc(123) int local123 = arg1.method6015();
			@Pc(125) int local125 = 0;
			@Pc(127) int local127 = 0;
			if (local108) {
				local125 = arg1.method6015();
				local127 = arg1.method6015();
			}
			@Pc(139) int local139 = 0;
			if (local116) {
				local139 = arg1.method6015();
			}
			@Pc(215) short[] local215;
			@Pc(218) byte[] local218;
			@Pc(220) int local220;
			if (local118 == 0) {
				aByteArray115[arg4 + arg5 * anInt8795] = (byte) local123;
				aByteArray113[arg4 + arg5 * anInt8795] = (byte) local125;
				aByteArray112[arg4 + arg5 * anInt8795] = (byte) local127;
				if (local139 == 1) {
					aShortArray148[arg4 + arg5 * anInt8795] = (short) (arg1.method5982() + 1);
					aByteArray111[arg4 + arg5 * anInt8795] = arg1.method6021();
				} else if (local139 > 1) {
					aShortArray148[arg4 + arg5 * anInt8795] = -1;
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method5982();
						local218[local220] = arg1.method6021();
					}
					aClass183_36.method4282((long) (arg4 << 16 | arg5), new Class4_Sub23(local215, local218));
				}
			} else {
				local215 = null;
				local218 = null;
				if (local139 > 0) {
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method5982();
						local218[local220] = arg1.method6021();
					}
				}
				if (aClass8ArrayArrayArray2[local118 - 1][arg2 - (anInt8797 >> 6)][arg3 - (anInt8804 >> 6)] == null) {
					aClass8ArrayArrayArray2[local118 - 1][arg2 - (anInt8797 >> 6)][arg3 - (anInt8804 >> 6)] = new Class8();
				}
				@Pc(338) Class26_Sub4 local338 = new Class26_Sub4(arg4 & 0x3F, arg5 & 0x3F, local123, local125, local127, local215, local218);
				aClass8ArrayArrayArray2[local118 - 1][arg2 - (anInt8797 >> 6)][arg3 - (anInt8804 >> 6)].method109(local338);
			}
		}
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lclient!oa;IIII)Lclient!gj;")
	private static Class124 method7226(@OriginalArg(0) Class66 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(4) Class4_Sub48 local4 = (Class4_Sub48) aClass124_60.method3267(); local4 != null; local4 = (Class4_Sub48) aClass124_60.method3273()) {
			method7224(arg0, local4, arg1, arg2);
		}
		return aClass124_60;
	}

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "(Lclient!oa;IIII)V")
	private static void method7227(@OriginalArg(0) Class66 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = anInt8794 - anInt8798;
		@Pc(7) int local7 = anInt8799 - anInt8801;
		if (anInt8794 < anInt8795) {
			local3++;
		}
		if (anInt8799 < anInt8803) {
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
			local28 = (arg1 * local17 >> 16) + anInt8802;
			local40 = (arg1 * (local17 + 1) >> 16) + anInt8802;
			local44 = local40 - local28;
			if (local44 > 0) {
				local50 = anInt8798 + local17;
				if (local50 >= 0 && local50 < anInt8795) {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt8796 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt8796 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (local84 > 0) {
							local93 = local57 + anInt8801;
							local173 = local50 + local93 * anInt8795;
							local175 = 0;
							local177 = 0;
							local179 = 0;
							if (local93 >= 0 && local93 < anInt8803) {
								local175 = (aByteArray114[local173] & 0xFF) << 16 | aShortArray147[local173] & 0xFFFF;
								if (local175 != 0) {
									local175 |= 0xFF000000;
								}
								local177 = aByteArray113[local173] & 0xFF;
								local179 = aShortArray148[local173] & 0xFFFF;
							}
							if (local175 == 0 && local177 == 0 && local179 == 0) {
								if (aClass4_Sub7_Sub13_2.anInt6628 != -1) {
									local175 = aClass4_Sub7_Sub13_2.anInt6628 | 0xFF000000;
								} else if ((local17 + anInt8798 & 0x4) == (local57 + anInt8799 & 0x4)) {
									local175 = anIntArray671[aClass291_6.anInt7780 + 1];
								} else {
									local175 = -11840664;
								}
								if (local175 == 0) {
									local175 = -16777216;
								}
								arg0.C(local28, local70, local44, local84, local175, 0);
							} else if (local179 <= 0) {
								method7242(arg0, local28, local70, local44, local84, local175, local177, aByteArray112[local173], null, null, true);
							} else if (local179 == 65535) {
								@Pc(282) Class4_Sub23 local282 = (Class4_Sub23) aClass183_36.method4289((long) (local50 << 16 | local93));
								if (local282 != null) {
									method7242(arg0, local28, local70, local44, local84, local175, local177, aByteArray112[local173], local282.aShortArray84, local282.aByteArray47, true);
								}
							} else {
								aShortArray146[0] = (short) (local179 - 1);
								aByteArray110[0] = aByteArray111[local173];
								method7242(arg0, local28, local70, local44, local84, local175, local177, aByteArray112[local173], aShortArray146, aByteArray110, true);
							}
						}
					}
				} else {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt8796 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt8796 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (aClass4_Sub7_Sub13_2.anInt6628 != -1) {
							local93 = aClass4_Sub7_Sub13_2.anInt6628 | 0xFF000000;
						} else if ((local17 + anInt8798 & 0x4) == (local57 + anInt8799 & 0x4)) {
							local93 = anIntArray671[aClass291_6.anInt7780 + 1];
						} else {
							local93 = -11840664;
						}
						if (local93 == 0) {
							local93 = -16777216;
						}
						arg0.C(local28, local70, local44, local84, local93, 0);
					}
				}
			}
		}
		for (local28 = -16; local28 < local3 + 16; local28++) {
			local40 = (arg1 * local28 >> 16) + anInt8802;
			local44 = (arg1 * (local28 + 1) >> 16) + anInt8802;
			local50 = local44 - local40;
			if (local50 > 0) {
				local57 = local28 + anInt8798;
				if (local57 >= 0 && local57 < anInt8795) {
					for (local70 = -16; local70 < local7 + 16; local70++) {
						local80 = anInt8796 - (arg2 * (local70 + 1) >> 16);
						local84 = anInt8796 - (arg2 * local70 >> 16);
						local93 = local84 - local80;
						if (local93 > 0) {
							local173 = local70 + anInt8801;
							if (local173 >= 0 && local173 < anInt8803) {
								local175 = aShortArray148[local57 + local173 * anInt8795] & 0xFFFF;
								if (local175 <= 0) {
									method7229(arg0, local40, local80, local50, local93, null, null);
								} else if (local175 == 65535) {
									@Pc(459) Class4_Sub23 local459 = (Class4_Sub23) aClass183_36.method4289((long) (local57 << 16 | local173));
									if (local459 != null) {
										method7229(arg0, local40, local80, local50, local93, local459.aShortArray84, local459.aByteArray47);
									}
								} else {
									aShortArray146[0] = (short) (local175 - 1);
									aByteArray110[0] = aByteArray111[local57 + local173 * anInt8795];
									method7229(arg0, local40, local80, local50, local93, aShortArray146, aByteArray110);
								}
							}
						}
					}
				}
			}
		}
		local40 = anInt8798 >> 6;
		local44 = anInt8801 >> 6;
		if (local40 < 0) {
			local40 = 0;
		}
		if (local44 < 0) {
			local44 = 0;
		}
		local50 = anInt8794 >> 6;
		local57 = anInt8799 >> 6;
		if (local50 >= aClass8ArrayArrayArray2[0].length) {
			local50 = aClass8ArrayArrayArray2[0].length - 1;
		}
		if (local57 >= aClass8ArrayArrayArray2[0][0].length) {
			local57 = aClass8ArrayArrayArray2[0][0].length - 1;
		}
		for (local70 = 0; local70 < 3; local70++) {
			@Pc(641) int local641;
			@Pc(653) int local653;
			@Pc(665) int local665;
			@Pc(675) int local675;
			@Pc(631) int local631;
			for (local80 = local40; local80 <= local50; local80++) {
				for (local84 = local44; local84 <= local57; local84++) {
					@Pc(589) Class8 local589 = aClass8ArrayArrayArray2[local70][local80][local84];
					if (local589 != null) {
						local173 = (local80 + (anInt8797 >> 6)) * 64;
						local175 = (local84 + (anInt8804 >> 6)) * 64;
						for (@Pc(612) Class26_Sub4 local612 = (Class26_Sub4) local589.method110(); local612 != null; local612 = (Class26_Sub4) local589.method113()) {
							local179 = local173 + local612.aByte64 - anInt8797 - anInt8798;
							local631 = local175 + local612.aByte62 - anInt8804 - anInt8801;
							local641 = (arg1 * local179 >> 16) + anInt8802;
							local653 = (arg1 * (local179 + 1) >> 16) + anInt8802;
							local665 = anInt8796 - (arg2 * (local631 + 1) >> 16);
							local675 = anInt8796 - (arg2 * local631 >> 16);
							method7242(arg0, local641, local665, local653 - local641, local675 - local665, local612.anInt5041, local612.aByte63 & 0xFF, local612.aByte61, local612.aShortArray104, local612.aByteArray57, false);
						}
					}
				}
			}
			for (local84 = local40; local84 <= local50; local84++) {
				for (local93 = local44; local93 <= local57; local93++) {
					@Pc(727) Class8 local727 = aClass8ArrayArrayArray2[local70][local84][local93];
					if (local727 != null) {
						local175 = (local84 + (anInt8797 >> 6)) * 64;
						local177 = (local93 + (anInt8804 >> 6)) * 64;
						for (@Pc(750) Class26_Sub4 local750 = (Class26_Sub4) local727.method110(); local750 != null; local750 = (Class26_Sub4) local727.method113()) {
							local631 = local175 + local750.aByte64 - anInt8797 - anInt8798;
							local641 = local177 + local750.aByte62 - anInt8804 - anInt8801;
							local653 = (arg1 * local631 >> 16) + anInt8802;
							local665 = (arg1 * (local631 + 1) >> 16) + anInt8802;
							local675 = anInt8796 - (arg2 * (local641 + 1) >> 16);
							@Pc(813) int local813 = anInt8796 - (arg2 * local641 >> 16);
							method7229(arg0, local653, local675, local665 - local653, local813 - local675, local750.aShortArray104, local750.aByteArray57);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "()V")
	public static void method7228() {
		@Pc(2) int[] local2 = new int[3];
		for (@Pc(4) int local4 = 0; local4 < aClass67_3.anInt2257; local4++) {
			@Pc(32) boolean local32 = aClass4_Sub7_Sub13_2.method5528(aClass67_3.anIntArray223[local4] >> 28 & 0x3, aClass67_3.anIntArray223[local4] >> 14 & 0x3FFF, local2, aClass67_3.anIntArray223[local4] & 0x3FFF);
			if (local32) {
				@Pc(42) Class4_Sub48 local42 = new Class4_Sub48(aClass67_3.anIntArray222[local4]);
				local42.anInt8896 = local2[1] - anInt8797;
				local42.anInt8900 = local2[2] - anInt8804;
				aClass124_60.method3275(local42);
			}
		}
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lclient!oa;IIII[S[B)V")
	private static void method7229(@OriginalArg(0) Class66 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		if (arg5 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < arg5.length; local4++) {
			@Pc(14) Class25 local14 = aClass288_3.method6419(arg5[local4] & 0xFFFF);
			@Pc(17) int local17 = local14.anInt594;
			if (local17 != -1) {
				@Pc(25) Class34 local25 = aClass190_4.method4353(local17);
				@Pc(49) Class13 local49 = local25.method730(local14.aBoolean58 ? arg6[local4] >> 6 & 0x3 : 0, local14.aBoolean47 ? local14.aBoolean52 : false, arg0);
				if (local49 != null) {
					@Pc(58) int local58 = arg3 * local49.AA() >> 2;
					@Pc(65) int local65 = arg4 * local49.a() >> 2;
					if (local25.aBoolean71) {
						@Pc(71) int local71 = local14.anInt612;
						@Pc(74) int local74 = local14.anInt638;
						if ((arg6[local4] >> 6 & 0x1) == 1) {
							@Pc(85) int local85 = local71;
							local71 = local74;
							local74 = local85;
						}
						local58 = local71 * arg3;
						local65 = local74 * arg4;
					}
					if (local58 != 0 && local65 != 0) {
						if (local25.anInt839 == 0) {
							local49.method8024(arg1, arg2 + arg4 - local65, local58, local65);
						} else {
							local49.KA(arg1, arg2 + arg4 - local65, local58, local65, 0, local25.anInt839 | 0xFF000000, 1);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(IIIIIIII)V")
	public static void method7230(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		anInt8798 = arg0 - anInt8797;
		anInt8799 = arg1 - anInt8804;
		anInt8794 = arg2 - anInt8797;
		anInt8801 = arg3 - anInt8804;
		anInt8802 = arg4;
		anInt8793 = arg5;
		anInt8800 = arg6;
		anInt8796 = arg7;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lclient!oa;)V")
	public static void method7232(@OriginalArg(0) Class66 arg0) {
		@Pc(3) int local3 = anInt8794 - anInt8798;
		@Pc(7) int local7 = anInt8799 - anInt8801;
		@Pc(15) int local15 = (anInt8800 - anInt8802 << 16) / local3;
		@Pc(23) int local23 = (anInt8796 - anInt8793 << 16) / local7;
		method7227(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lclient!e;III)I")
	private static int method7233(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class187 local4 = aClass291_6.method6442(arg1);
		if (local4 == null) {
			return 0;
		}
		@Pc(11) int local11 = local4.anInt5090;
		if (local11 >= 0 && arg0.method7249(local11).aBoolean514) {
			local11 = -1;
		}
		@Pc(68) int local68;
		@Pc(27) int local27;
		@Pc(33) int local33;
		@Pc(55) int local55;
		if (local4.anInt5079 >= 0) {
			local27 = local4.anInt5079;
			local33 = (local27 & 0x7F) + arg3;
			if (local33 < 0) {
				local33 = 0;
			} else if (local33 > 127) {
				local33 = 127;
			}
			local55 = (local27 + arg2 & 0xFC00) + (local27 & 0x380) + local33;
			local68 = Static18.anIntArray203[Static206.method3645(Static358.method5267(local55)) & 0xFFFF] | 0xFF000000;
		} else if (local11 >= 0) {
			local68 = Static18.anIntArray203[Static206.method3645(Static358.method5267(arg0.method7249(local11).aShort94)) & 0xFFFF] | 0xFF000000;
		} else if (local4.anInt5088 == -1) {
			local68 = 0;
		} else {
			local27 = local4.anInt5088;
			local33 = (local27 & 0x7F) + arg3;
			if (local33 < 0) {
				local33 = 0;
			} else if (local33 > 127) {
				local33 = 127;
			}
			local55 = (local27 + arg2 & 0xFC00) + (local27 & 0x380) + local33;
			local68 = Static18.anIntArray203[Static206.method3645(Static358.method5267(local55)) & 0xFFFF] | 0xFF000000;
		}
		return local68;
	}

	@OriginalMember(owner = "client!ou", name = "d", descriptor = "()V")
	public static void method7234() {
		aByteArray115 = new byte[anInt8795 * anInt8803];
		aByteArray113 = new byte[anInt8795 * anInt8803];
		aByteArray112 = new byte[anInt8795 * anInt8803];
		aShortArray148 = new short[anInt8795 * anInt8803];
		aByteArray111 = new byte[anInt8795 * anInt8803];
		aClass183_36 = new Class183(1024);
		aClass8ArrayArrayArray2 = new Class8[3][anInt8795 >> 6][anInt8803 >> 6];
		anIntArray671 = new int[aClass291_6.anInt7774 + 1];
	}

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "(Lclient!oa;)Lclient!gj;")
	public static Class124 method7235(@OriginalArg(0) Class66 arg0) {
		@Pc(3) int local3 = anInt8794 - anInt8798;
		@Pc(7) int local7 = anInt8799 - anInt8801;
		@Pc(15) int local15 = (anInt8800 - anInt8802 << 16) / local3;
		@Pc(23) int local23 = (anInt8796 - anInt8793 << 16) / local7;
		return method7226(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lclient!oa;II)V")
	public static void method7236(@OriginalArg(0) Class66 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class4_Sub9 local9 = new Class4_Sub9(aClass31_107.method662(aClass4_Sub7_Sub13_2.aString76, "area"));
		@Pc(13) int local13 = local9.method6015();
		@Pc(16) int[] local16 = new int[local13];
		for (@Pc(18) int local18 = 0; local18 < local13; local18++) {
			local16[local18] = local9.method6015();
		}
		@Pc(33) int local33 = local9.method6015();
		@Pc(36) int[] local36 = new int[local33];
		for (@Pc(38) int local38 = 0; local38 < local33; local38++) {
			local36[local38] = local9.method6015();
		}
		while (true) {
			@Pc(58) int local58;
			@Pc(64) int local64;
			@Pc(67) int local67;
			@Pc(76) int local76;
			@Pc(148) int local148;
			while (local9.anInt7219 < local9.aByteArray97.length) {
				@Pc(62) int local62;
				@Pc(84) int local84;
				if (local9.method6015() == 0) {
					local58 = local9.method6015();
					local62 = local9.method6015();
					for (local64 = 0; local64 < 64; local64++) {
						for (local67 = 0; local67 < 64; local67++) {
							local76 = local58 * 64 + local64 - anInt8797;
							local84 = local62 * 64 + local67 - anInt8804;
							method7225(arg0, local9, local58, local62, local76, local84, local16, local36);
						}
					}
				} else {
					local58 = local9.method6015();
					local62 = local9.method6015();
					local64 = local9.method6015();
					local67 = local9.method6015();
					for (local76 = 0; local76 < 8; local76++) {
						for (local84 = 0; local84 < 8; local84++) {
							@Pc(136) int local136 = local58 * 64 + local64 * 8 + local76 - anInt8797;
							local148 = local62 * 64 + local67 * 8 + local84 - anInt8804;
							method7225(arg0, local9, local58, local62, local136, local148, local16, local36);
						}
					}
				}
			}
			aByteArray114 = new byte[anInt8795 * anInt8803];
			aShortArray147 = new short[anInt8795 * anInt8803];
			for (local58 = 0; local58 < 3; local58++) {
				@Pc(191) byte[] local191 = new byte[anInt8795 * anInt8803];
				for (local64 = 0; local64 < aClass8ArrayArrayArray2[local58].length; local64++) {
					for (local67 = 0; local67 < aClass8ArrayArrayArray2[local58][0].length; local67++) {
						@Pc(205) Class8 local205 = aClass8ArrayArrayArray2[local58][local64][local67];
						if (local205 != null) {
							for (@Pc(212) Class26_Sub4 local212 = (Class26_Sub4) local205.method110(); local212 != null; local212 = (Class26_Sub4) local205.method113()) {
								local191[local64 * 64 + local212.aByte64 + (local67 * 64 + local212.aByte62) * anInt8795] = (byte) local212.anInt5041;
							}
						}
					}
				}
				method7239(local191, aByteArray114, aShortArray147, arg1, arg2);
				for (local67 = 0; local67 < aClass8ArrayArrayArray2[local58].length; local67++) {
					for (local76 = 0; local76 < aClass8ArrayArrayArray2[local58][0].length; local76++) {
						@Pc(276) Class8 local276 = aClass8ArrayArrayArray2[local58][local67][local76];
						if (local276 != null) {
							for (@Pc(283) Class26_Sub4 local283 = (Class26_Sub4) local276.method110(); local283 != null; local283 = (Class26_Sub4) local276.method113()) {
								local148 = local67 * 64 + local283.aByte64 + (local76 * 64 + local283.aByte62) * anInt8795;
								local283.anInt5041 = (aByteArray114[local148] & 0xFF) << 16 | aShortArray147[local148] & 0xFFFF;
								if (local283.anInt5041 != 0) {
									local283.anInt5041 |= 0xFF000000;
								}
							}
						}
					}
				}
			}
			method7239(aByteArray115, aByteArray114, aShortArray147, arg1, arg2);
			aByteArray115 = null;
			method7223();
			return;
		}
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lclient!bi;Lclient!rg;Lclient!ik;Lclient!rea;Lclient!uk;Lclient!kd;Lclient!aba;)V")
	public static void method7237(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class291 arg1, @OriginalArg(2) Class162 arg2, @OriginalArg(3) Class288 arg3, @OriginalArg(4) Class337 arg4, @OriginalArg(5) Class190 arg5, @OriginalArg(6) Interface1 arg6) {
		aClass31_107 = arg0;
		aClass291_6 = arg1;
		aClass162_10 = arg2;
		aClass288_3 = arg3;
		aClass337_4 = arg4;
		aClass190_4 = arg5;
		anInterface1_2 = arg6;
		aClass183_35.method4287();
		@Pc(21) int local21 = aClass31_107.method653("details");
		@Pc(26) int[] local26 = aClass31_107.method664(local21);
		if (local26 != null) {
			for (@Pc(30) int local30 = 0; local30 < local26.length; local30++) {
				@Pc(39) Class4_Sub7_Sub13 local39 = Static203.method3602(aClass31_107, local26[local30], local21);
				aClass183_35.method4282((long) local39.anInt6629, local39);
			}
		}
		Static452.method6402(true, false);
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)V")
	public static void method7238(@OriginalArg(0) int arg0) {
		aClass4_Sub7_Sub13_2 = (Class4_Sub7_Sub13) aClass183_35.method4289((long) arg0);
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "([B[B[SII)V")
	private static void method7239(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int[] local2 = new int[anInt8803];
		@Pc(5) int[] local5 = new int[anInt8803];
		@Pc(8) int[] local8 = new int[anInt8803];
		@Pc(11) int[] local11 = new int[anInt8803];
		@Pc(14) int[] local14 = new int[anInt8803];
		for (@Pc(16) int local16 = -5; local16 < anInt8795; local16++) {
			@Pc(21) int local21 = local16 + 5;
			@Pc(25) int local25 = local16 - 5;
			@Pc(41) int local41;
			for (@Pc(27) int local27 = 0; local27 < anInt8803; local27++) {
				@Pc(50) Class149 local50;
				@Pc(86) int local86;
				if (local21 < anInt8795) {
					local41 = arg0[local21 + local27 * anInt8795] & 0xFF;
					if (local41 > 0) {
						local50 = aClass162_10.method3849(local41 - 1);
						local2[local27] += local50.anInt4252;
						local5[local27] += local50.anInt4259;
						local8[local27] += local50.anInt4256;
						local11[local27] += local50.anInt4254;
						local86 = local14[local27]++;
					}
				}
				if (local25 >= 0) {
					local41 = arg0[local25 + local27 * anInt8795] & 0xFF;
					if (local41 > 0) {
						local50 = aClass162_10.method3849(local41 - 1);
						local2[local27] -= local50.anInt4252;
						local5[local27] -= local50.anInt4259;
						local8[local27] -= local50.anInt4256;
						local11[local27] -= local50.anInt4254;
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
				for (@Pc(167) int local167 = -5; local167 < anInt8803; local167++) {
					@Pc(172) int local172 = local167 + 5;
					if (local172 < anInt8803) {
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
						if ((arg0[local16 + local167 * anInt8795] & 0xFF) == 0) {
							local261 = local16 + local167 * anInt8795;
							arg1[local261] = 0;
							arg2[local261] = 0;
						} else {
							local261 = local163 == 0 ? 0 : Static66.method6765(local159 / local165, local41 * 256 / local163, local161 / local165);
							@Pc(294) int local294 = (local261 & 0x7F) + arg4;
							if (local294 < 0) {
								local294 = 0;
							} else if (local294 > 127) {
								local294 = 127;
							}
							@Pc(316) int local316 = (local261 + arg3 & 0xFC00) + (local261 & 0x380) + local294;
							@Pc(322) int local322 = local16 + local167 * anInt8795;
							@Pc(333) int local333 = Static18.anIntArray203[Static206.method3645(Static558.method7682(local316)) & 0xFFFF];
							arg1[local322] = (byte) (local333 >> 16 & 0xFF);
							arg2[local322] = (short) (local333 & 0xFFFF);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ou", name = "e", descriptor = "()V")
	public static void method7240() {
		aByteArray115 = null;
		aByteArray114 = null;
		aShortArray147 = null;
		aByteArray113 = null;
		aByteArray112 = null;
		aShortArray148 = null;
		aByteArray111 = null;
		aClass183_36 = null;
		aClass8ArrayArrayArray2 = null;
		anIntArray671 = null;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(II)Lclient!rda;")
	public static Class286 method7241(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class286 local3 = new Class286();
		for (@Pc(8) Class4_Sub7_Sub13 local8 = (Class4_Sub7_Sub13) aClass183_35.method4286(); local8 != null; local8 = (Class4_Sub7_Sub13) aClass183_35.method4283()) {
			if (local8.aBoolean495 && local8.method5522(arg0, arg1)) {
				local3.method6409(local8);
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lclient!oa;IIIIIII[S[BZ)V")
	private static void method7242(@OriginalArg(0) Class66 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) byte[] arg9, @OriginalArg(10) boolean arg10) {
		@Pc(20) int local20;
		@Pc(32) int local32;
		if (arg10 || arg5 != 0 || arg6 > 0) {
			if (arg6 == 0) {
				arg0.C(arg1, arg2, arg3, arg4, arg5, 0);
			} else {
				local20 = arg7 & 0x3F;
				if (local20 == 0 || arg3 <= 1 || arg4 <= 1) {
					local32 = anIntArray671[arg6];
					if (arg10 || local32 != 0) {
						arg0.C(arg1, arg2, arg3, arg4, local32, 0);
					}
				} else {
					local32 = arg10 ? 0 : 1;
					Static574.method5777(local32, arg2, arg5, anInt8790, arg0, arg7 >> 6 & 0x3, arg3, aByteArrayArrayArray20, arg4, arg1, anIntArray671[arg6], local20);
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
				@Pc(127) Class25 local127 = aClass288_3.method6419(arg8[local100] & 0xFFFF);
				if (local127.anInt594 == -1) {
					@Pc(133) int local133 = -3355444;
					if (local127.anInt599 == 1) {
						local133 = -3407872;
					}
					@Pc(147) int local147 = arg9[local100] >> 6 & 0x3;
					if (local107 == 0) {
						if (local147 == 0) {
							arg0.ya(arg1, arg2, arg4, local133, 0);
						} else if (local147 == 1) {
							arg0.e(arg1, arg2, arg3, local133, 0);
						} else if (local147 == 2) {
							arg0.ya(local20, arg2, arg4, local133, 0);
						} else {
							arg0.e(arg1, local32, arg3, local133, 0);
						}
					} else if (local107 == 2) {
						if (local147 == 0) {
							arg0.ya(arg1, arg2, arg4, -1, 0);
							arg0.e(arg1, arg2, arg3, local133, 0);
						} else if (local147 == 1) {
							arg0.ya(local20, arg2, arg4, -1, 0);
							arg0.e(arg1, arg2, arg3, local133, 0);
						} else if (local147 == 2) {
							arg0.ya(local20, arg2, arg4, -1, 0);
							arg0.e(arg1, local32, arg3, local133, 0);
						} else {
							arg0.ya(arg1, arg2, arg4, -1, 0);
							arg0.e(arg1, local32, arg3, local133, 0);
						}
					} else if (local107 == 3) {
						if (local147 == 0) {
							arg0.e(arg1, arg2, 1, local133, 0);
						} else if (local147 == 1) {
							arg0.e(local20, arg2, 1, local133, 0);
						} else if (local147 == 2) {
							arg0.e(local20, local32, 1, local133, 0);
						} else {
							arg0.e(arg1, local32, 1, local133, 0);
						}
					} else if (local107 == 9) {
						@Pc(313) int local313;
						if (local147 == 0 || local147 == 2) {
							for (local313 = 0; local313 < arg4; local313++) {
								arg0.e(arg1 + local313, local32 - local313, 1, local133, 0);
							}
						} else {
							for (local313 = 0; local313 < arg4; local313++) {
								arg0.e(arg1 + local313, arg2 + local313, 1, local133, 0);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lclient!e;II)V")
	public static void method7243(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < aClass291_6.anInt7774; local1++) {
			anIntArray671[local1 + 1] = method7233(arg0, local1, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "(I)Lclient!o;")
	public static Class4_Sub7_Sub13 method7244(@OriginalArg(0) int arg0) {
		return (Class4_Sub7_Sub13) aClass183_35.method4289((long) arg0);
	}

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "(II)Lclient!o;")
	public static Class4_Sub7_Sub13 method7245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(4) Class4_Sub7_Sub13 local4 = (Class4_Sub7_Sub13) aClass183_35.method4286(); local4 != null; local4 = (Class4_Sub7_Sub13) aClass183_35.method4283()) {
			if (local4.aBoolean495 && local4.method5522(arg0, arg1)) {
				return local4;
			}
		}
		return null;
	}
}
