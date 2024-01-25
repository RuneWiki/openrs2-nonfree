import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static498 {

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "Lclient!wia;")
	public static Class386 aClass386_108;

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "Lclient!aga;")
	public static Class13 aClass13_5;

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "Lclient!g;")
	public static Class116 aClass116_4;

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "Lclient!eca;")
	public static Class83 aClass83_5;

	@OriginalMember(owner = "client!ra", name = "f", descriptor = "Lclient!ob;")
	public static Interface20 anInterface20_2;

	@OriginalMember(owner = "client!ra", name = "g", descriptor = "Lclient!ufa;")
	private static Class350 aClass350_5;

	@OriginalMember(owner = "client!ra", name = "h", descriptor = "Lclient!sha;")
	public static Class14_Sub3_Sub16 aClass14_Sub3_Sub16_3;

	@OriginalMember(owner = "client!ra", name = "i", descriptor = "Lclient!gba;")
	private static Class119 aClass119_3;

	@OriginalMember(owner = "client!ra", name = "j", descriptor = "I")
	public static int anInt8791;

	@OriginalMember(owner = "client!ra", name = "l", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!ra", name = "m", descriptor = "F")
	public static float aFloat216;

	@OriginalMember(owner = "client!ra", name = "o", descriptor = "Lclient!raa;")
	public static Class294 aClass294_2;

	@OriginalMember(owner = "client!ra", name = "s", descriptor = "F")
	public static float aFloat217;

	@OriginalMember(owner = "client!ra", name = "t", descriptor = "I")
	public static int anInt8794;

	@OriginalMember(owner = "client!ra", name = "u", descriptor = "I")
	public static int anInt8795;

	@OriginalMember(owner = "client!ra", name = "v", descriptor = "Lclient!jo;")
	private static Class187 aClass187_65;

	@OriginalMember(owner = "client!ra", name = "w", descriptor = "I")
	public static int anInt8796;

	@OriginalMember(owner = "client!ra", name = "x", descriptor = "[B")
	private static byte[] aByteArray108;

	@OriginalMember(owner = "client!ra", name = "y", descriptor = "I")
	public static int anInt8797;

	@OriginalMember(owner = "client!ra", name = "z", descriptor = "[B")
	private static byte[] aByteArray109;

	@OriginalMember(owner = "client!ra", name = "A", descriptor = "[S")
	private static short[] aShortArray131;

	@OriginalMember(owner = "client!ra", name = "B", descriptor = "I")
	public static int anInt8798;

	@OriginalMember(owner = "client!ra", name = "C", descriptor = "[B")
	private static byte[] aByteArray110;

	@OriginalMember(owner = "client!ra", name = "D", descriptor = "I")
	public static int anInt8799;

	@OriginalMember(owner = "client!ra", name = "E", descriptor = "I")
	public static int anInt8800;

	@OriginalMember(owner = "client!ra", name = "F", descriptor = "[B")
	private static byte[] aByteArray111;

	@OriginalMember(owner = "client!ra", name = "G", descriptor = "I")
	public static int anInt8801;

	@OriginalMember(owner = "client!ra", name = "H", descriptor = "[S")
	private static short[] aShortArray132;

	@OriginalMember(owner = "client!ra", name = "I", descriptor = "[[[Lclient!vv;")
	private static Class376[][][] aClass376ArrayArrayArray2;

	@OriginalMember(owner = "client!ra", name = "J", descriptor = "I")
	public static int anInt8802;

	@OriginalMember(owner = "client!ra", name = "K", descriptor = "I")
	public static int anInt8803;

	@OriginalMember(owner = "client!ra", name = "L", descriptor = "[B")
	private static byte[] aByteArray112;

	@OriginalMember(owner = "client!ra", name = "M", descriptor = "I")
	public static int anInt8804;

	@OriginalMember(owner = "client!ra", name = "N", descriptor = "I")
	public static int anInt8805;

	@OriginalMember(owner = "client!ra", name = "O", descriptor = "[I")
	private static int[] anIntArray651;

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "Lclient!jo;")
	private static final Class187 aClass187_64 = new Class187(16);

	@OriginalMember(owner = "client!ra", name = "k", descriptor = "[S")
	private static final short[] aShortArray130 = new short[1];

	@OriginalMember(owner = "client!ra", name = "n", descriptor = "I")
	public static int anInt8792 = (int) (Math.random() * 11.0D) - 5;

	@OriginalMember(owner = "client!ra", name = "p", descriptor = "I")
	public static int anInt8793 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!ra", name = "q", descriptor = "[B")
	private static final byte[] aByteArray107 = new byte[1];

	@OriginalMember(owner = "client!ra", name = "r", descriptor = "Lclient!ok;")
	public static final Class262 aClass262_60 = new Class262();

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!ha;Lclient!so;IIII[I[I)V")
	private static void method7289(@OriginalArg(0) Class137 arg0, @OriginalArg(1) Class14_Sub29 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7) {
		@Pc(3) int local3 = arg1.method5866();
		if ((local3 & 0x1) == 0) {
			@Pc(15) boolean local15 = (local3 & 0x2) == 0;
			@Pc(21) int local21 = local3 >> 2 & 0x3F;
			if (local21 != 62) {
				if (local21 == 63) {
					local21 = arg1.method5866();
				} else if (local15) {
					local21 = arg6[local21];
				} else {
					local21 = arg7[local21];
				}
				if (local15) {
					aByteArray108[arg4 + arg5 * anInt8801] = (byte) local21;
					aByteArray111[arg4 + arg5 * anInt8801] = 0;
				} else {
					aByteArray111[arg4 + arg5 * anInt8801] = (byte) local21;
					aByteArray112[arg4 + arg5 * anInt8801] = 0;
					aByteArray108[arg4 + arg5 * anInt8801] = arg1.method5845();
				}
			}
			return;
		}
		@Pc(100) int local100 = (local3 >> 1 & 0x3) + 1;
		@Pc(108) boolean local108 = (local3 & 0x8) != 0;
		@Pc(116) boolean local116 = (local3 & 0x10) != 0;
		for (@Pc(118) int local118 = 0; local118 < local100; local118++) {
			@Pc(123) int local123 = arg1.method5866();
			@Pc(125) int local125 = 0;
			@Pc(127) int local127 = 0;
			if (local108) {
				local125 = arg1.method5866();
				local127 = arg1.method5866();
			}
			@Pc(139) int local139 = 0;
			if (local116) {
				local139 = arg1.method5866();
			}
			@Pc(215) short[] local215;
			@Pc(218) byte[] local218;
			@Pc(220) int local220;
			if (local118 == 0) {
				aByteArray108[arg4 + arg5 * anInt8801] = (byte) local123;
				aByteArray111[arg4 + arg5 * anInt8801] = (byte) local125;
				aByteArray112[arg4 + arg5 * anInt8801] = (byte) local127;
				if (local139 == 1) {
					aShortArray131[arg4 + arg5 * anInt8801] = (short) (arg1.method5900() + 1);
					aByteArray110[arg4 + arg5 * anInt8801] = arg1.method5845();
				} else if (local139 > 1) {
					aShortArray131[arg4 + arg5 * anInt8801] = -1;
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method5900();
						local218[local220] = arg1.method5845();
					}
					aClass187_65.method4077((long) (arg4 << 16 | arg5), new Class14_Sub43(local215, local218));
				}
			} else {
				local215 = null;
				local218 = null;
				if (local139 > 0) {
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method5900();
						local218[local220] = arg1.method5845();
					}
				}
				if (aClass376ArrayArrayArray2[local118 - 1][arg2 - (anInt8795 >> 6)][arg3 - (anInt8796 >> 6)] == null) {
					aClass376ArrayArrayArray2[local118 - 1][arg2 - (anInt8795 >> 6)][arg3 - (anInt8796 >> 6)] = new Class376();
				}
				@Pc(338) Class12_Sub3 local338 = new Class12_Sub3(arg4 & 0x3F, arg5 & 0x3F, local123, local125, local127, local215, local218);
				aClass376ArrayArrayArray2[local118 - 1][arg2 - (anInt8795 >> 6)][arg3 - (anInt8796 >> 6)].method9011(local338);
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!ha;IIII)V")
	private static void method7290(@OriginalArg(0) Class137 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = anInt8797 - anInt8800;
		@Pc(7) int local7 = anInt8798 - anInt8799;
		if (anInt8797 < anInt8801) {
			local3++;
		}
		if (anInt8798 < anInt8794) {
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
				local50 = anInt8800 + local17;
				if (local50 >= 0 && local50 < anInt8801) {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt8804 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt8804 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (local84 > 0) {
							local93 = local57 + anInt8799;
							local173 = local50 + local93 * anInt8801;
							local175 = 0;
							local177 = 0;
							local179 = 0;
							if (local93 >= 0 && local93 < anInt8794) {
								local175 = (aByteArray109[local173] & 0xFF) << 16 | aShortArray132[local173] & 0xFFFF;
								if (local175 != 0) {
									local175 |= 0xFF000000;
								}
								local177 = aByteArray111[local173] & 0xFF;
								local179 = aShortArray131[local173] & 0xFFFF;
							}
							if (local175 == 0 && local177 == 0 && local179 == 0) {
								if (aClass14_Sub3_Sub16_3.anInt9285 != -1) {
									local175 = aClass14_Sub3_Sub16_3.anInt9285 | 0xFF000000;
								} else if ((local17 + anInt8800 & 0x4) == (local57 + anInt8798 & 0x4)) {
									local175 = anIntArray651[aClass350_5.anInt10170 + 1];
								} else {
									local175 = -11840664;
								}
								if (local175 == 0) {
									local175 = -16777216;
								}
								arg0.aa(local28, local70, local44, local84, local175, 0);
							} else if (local179 <= 0) {
								method7301(arg0, local28, local70, local44, local84, local175, local177, aByteArray112[local173], (short[]) null, (byte[]) null, true);
							} else if (local179 == 65535) {
								@Pc(282) Class14_Sub43 local282 = (Class14_Sub43) aClass187_65.method4078((long) (local50 << 16 | local93));
								if (local282 != null) {
									method7301(arg0, local28, local70, local44, local84, local175, local177, aByteArray112[local173], local282.aShortArray119, local282.aByteArray93, true);
								}
							} else {
								aShortArray130[0] = (short) (local179 - 1);
								aByteArray107[0] = aByteArray110[local173];
								method7301(arg0, local28, local70, local44, local84, local175, local177, aByteArray112[local173], aShortArray130, aByteArray107, true);
							}
						}
					}
				} else {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt8804 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt8804 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (aClass14_Sub3_Sub16_3.anInt9285 != -1) {
							local93 = aClass14_Sub3_Sub16_3.anInt9285 | 0xFF000000;
						} else if ((local17 + anInt8800 & 0x4) == (local57 + anInt8798 & 0x4)) {
							local93 = anIntArray651[aClass350_5.anInt10170 + 1];
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
			local40 = (arg1 * local28 >> 16) + anInt8802;
			local44 = (arg1 * (local28 + 1) >> 16) + anInt8802;
			local50 = local44 - local40;
			if (local50 > 0) {
				local57 = local28 + anInt8800;
				if (local57 >= 0 && local57 < anInt8801) {
					for (local70 = -16; local70 < local7 + 16; local70++) {
						local80 = anInt8804 - (arg2 * (local70 + 1) >> 16);
						local84 = anInt8804 - (arg2 * local70 >> 16);
						local93 = local84 - local80;
						if (local93 > 0) {
							local173 = local70 + anInt8799;
							if (local173 >= 0 && local173 < anInt8794) {
								local175 = aShortArray131[local57 + local173 * anInt8801] & 0xFFFF;
								if (local175 <= 0) {
									method7296(arg0, local40, local80, local50, local93, (short[]) null, (byte[]) null);
								} else if (local175 == 65535) {
									@Pc(459) Class14_Sub43 local459 = (Class14_Sub43) aClass187_65.method4078((long) (local57 << 16 | local173));
									if (local459 != null) {
										method7296(arg0, local40, local80, local50, local93, local459.aShortArray119, local459.aByteArray93);
									}
								} else {
									aShortArray130[0] = (short) (local175 - 1);
									aByteArray107[0] = aByteArray110[local57 + local173 * anInt8801];
									method7296(arg0, local40, local80, local50, local93, aShortArray130, aByteArray107);
								}
							}
						}
					}
				}
			}
		}
		local40 = anInt8800 >> 6;
		local44 = anInt8799 >> 6;
		if (local40 < 0) {
			local40 = 0;
		}
		if (local44 < 0) {
			local44 = 0;
		}
		local50 = anInt8797 >> 6;
		local57 = anInt8798 >> 6;
		if (local50 >= aClass376ArrayArrayArray2[0].length) {
			local50 = aClass376ArrayArrayArray2[0].length - 1;
		}
		if (local57 >= aClass376ArrayArrayArray2[0][0].length) {
			local57 = aClass376ArrayArrayArray2[0][0].length - 1;
		}
		for (local70 = 0; local70 < 3; local70++) {
			@Pc(641) int local641;
			@Pc(653) int local653;
			@Pc(665) int local665;
			@Pc(675) int local675;
			@Pc(631) int local631;
			for (local80 = local40; local80 <= local50; local80++) {
				for (local84 = local44; local84 <= local57; local84++) {
					@Pc(589) Class376 local589 = aClass376ArrayArrayArray2[local70][local80][local84];
					if (local589 != null) {
						local173 = (local80 + (anInt8795 >> 6)) * 64;
						local175 = (local84 + (anInt8796 >> 6)) * 64;
						for (@Pc(612) Class12_Sub3 local612 = (Class12_Sub3) local589.method9008(); local612 != null; local612 = (Class12_Sub3) local589.method9014()) {
							local179 = local173 + local612.aByte41 - anInt8795 - anInt8800;
							local631 = local175 + local612.aByte40 - anInt8796 - anInt8799;
							local641 = (arg1 * local179 >> 16) + anInt8802;
							local653 = (arg1 * (local179 + 1) >> 16) + anInt8802;
							local665 = anInt8804 - (arg2 * (local631 + 1) >> 16);
							local675 = anInt8804 - (arg2 * local631 >> 16);
							method7301(arg0, local641, local665, local653 - local641, local675 - local665, local612.anInt1657, local612.aByte43 & 0xFF, local612.aByte42, local612.aShortArray14, local612.aByteArray22, false);
						}
					}
				}
			}
			for (local84 = local40; local84 <= local50; local84++) {
				for (local93 = local44; local93 <= local57; local93++) {
					@Pc(727) Class376 local727 = aClass376ArrayArrayArray2[local70][local84][local93];
					if (local727 != null) {
						local175 = (local84 + (anInt8795 >> 6)) * 64;
						local177 = (local93 + (anInt8796 >> 6)) * 64;
						for (@Pc(750) Class12_Sub3 local750 = (Class12_Sub3) local727.method9008(); local750 != null; local750 = (Class12_Sub3) local727.method9014()) {
							local631 = local175 + local750.aByte41 - anInt8795 - anInt8800;
							local641 = local177 + local750.aByte40 - anInt8796 - anInt8799;
							local653 = (arg1 * local631 >> 16) + anInt8802;
							local665 = (arg1 * (local631 + 1) >> 16) + anInt8802;
							local675 = anInt8804 - (arg2 * (local641 + 1) >> 16);
							@Pc(813) int local813 = anInt8804 - (arg2 * local641 >> 16);
							method7296(arg0, local653, local675, local665 - local653, local813 - local675, local750.aShortArray14, local750.aByteArray22);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!wia;Lclient!ufa;Lclient!gba;Lclient!aga;Lclient!g;Lclient!eca;Lclient!ob;)V")
	public static void method7291(@OriginalArg(0) Class386 arg0, @OriginalArg(1) Class350 arg1, @OriginalArg(2) Class119 arg2, @OriginalArg(3) Class13 arg3, @OriginalArg(4) Class116 arg4, @OriginalArg(5) Class83 arg5, @OriginalArg(6) Interface20 arg6) {
		aClass386_108 = arg0;
		aClass350_5 = arg1;
		aClass119_3 = arg2;
		aClass13_5 = arg3;
		aClass116_4 = arg4;
		aClass83_5 = arg5;
		anInterface20_2 = arg6;
		aClass187_64.method4076();
		@Pc(21) int local21 = aClass386_108.method9213("details");
		@Pc(26) int[] local26 = aClass386_108.method9205(local21);
		if (local26 != null) {
			for (@Pc(30) int local30 = 0; local30 < local26.length; local30++) {
				@Pc(39) Class14_Sub3_Sub16 local39 = Static417.method8853(local26[local30], local21, aClass386_108);
				aClass187_64.method4077((long) local39.anInt9283, local39);
			}
		}
		Static479.method7114(false, true);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!ha;II)V")
	public static void method7292(@OriginalArg(0) Class137 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class14_Sub29 local9 = new Class14_Sub29(aClass386_108.method9219("area", aClass14_Sub3_Sub16_3.aString92));
		@Pc(13) int local13 = local9.method5866();
		@Pc(16) int[] local16 = new int[local13];
		for (@Pc(18) int local18 = 0; local18 < local13; local18++) {
			local16[local18] = local9.method5866();
		}
		@Pc(33) int local33 = local9.method5866();
		@Pc(36) int[] local36 = new int[local33];
		for (@Pc(38) int local38 = 0; local38 < local33; local38++) {
			local36[local38] = local9.method5866();
		}
		while (true) {
			@Pc(58) int local58;
			@Pc(64) int local64;
			@Pc(67) int local67;
			@Pc(76) int local76;
			@Pc(148) int local148;
			while (local9.anInt7264 < local9.aByteArray84.length) {
				@Pc(62) int local62;
				@Pc(84) int local84;
				if (local9.method5866() == 0) {
					local58 = local9.method5866();
					local62 = local9.method5866();
					for (local64 = 0; local64 < 64; local64++) {
						for (local67 = 0; local67 < 64; local67++) {
							local76 = local58 * 64 + local64 - anInt8795;
							local84 = local62 * 64 + local67 - anInt8796;
							method7289(arg0, local9, local58, local62, local76, local84, local16, local36);
						}
					}
				} else {
					local58 = local9.method5866();
					local62 = local9.method5866();
					local64 = local9.method5866();
					local67 = local9.method5866();
					for (local76 = 0; local76 < 8; local76++) {
						for (local84 = 0; local84 < 8; local84++) {
							@Pc(136) int local136 = local58 * 64 + local64 * 8 + local76 - anInt8795;
							local148 = local62 * 64 + local67 * 8 + local84 - anInt8796;
							method7289(arg0, local9, local58, local62, local136, local148, local16, local36);
						}
					}
				}
			}
			aByteArray109 = new byte[anInt8801 * anInt8794];
			aShortArray132 = new short[anInt8801 * anInt8794];
			for (local58 = 0; local58 < 3; local58++) {
				@Pc(191) byte[] local191 = new byte[anInt8801 * anInt8794];
				for (local64 = 0; local64 < aClass376ArrayArrayArray2[local58].length; local64++) {
					for (local67 = 0; local67 < aClass376ArrayArrayArray2[local58][0].length; local67++) {
						@Pc(205) Class376 local205 = aClass376ArrayArrayArray2[local58][local64][local67];
						if (local205 != null) {
							for (@Pc(212) Class12_Sub3 local212 = (Class12_Sub3) local205.method9008(); local212 != null; local212 = (Class12_Sub3) local205.method9014()) {
								local191[local64 * 64 + local212.aByte41 + (local67 * 64 + local212.aByte40) * anInt8801] = (byte) local212.anInt1657;
							}
						}
					}
				}
				method7308(local191, aByteArray109, aShortArray132, arg1, arg2);
				for (local67 = 0; local67 < aClass376ArrayArrayArray2[local58].length; local67++) {
					for (local76 = 0; local76 < aClass376ArrayArrayArray2[local58][0].length; local76++) {
						@Pc(276) Class376 local276 = aClass376ArrayArrayArray2[local58][local67][local76];
						if (local276 != null) {
							for (@Pc(283) Class12_Sub3 local283 = (Class12_Sub3) local276.method9008(); local283 != null; local283 = (Class12_Sub3) local276.method9014()) {
								local148 = local67 * 64 + local283.aByte41 + (local76 * 64 + local283.aByte40) * anInt8801;
								local283.anInt1657 = (aByteArray109[local148] & 0xFF) << 16 | aShortArray132[local148] & 0xFFFF;
								if (local283.anInt1657 != 0) {
									local283.anInt1657 |= 0xFF000000;
								}
							}
						}
					}
				}
			}
			method7308(aByteArray108, aByteArray109, aShortArray132, arg1, arg2);
			aByteArray108 = null;
			method7310();
			return;
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIIIII)V")
	public static void method7293(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		anInt8800 = arg0 - anInt8795;
		anInt8798 = arg1 - anInt8796;
		anInt8797 = arg2 - anInt8795;
		anInt8799 = arg3 - anInt8796;
		anInt8802 = arg4;
		anInt8805 = arg5;
		anInt8803 = arg6;
		anInt8804 = arg7;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)Lclient!sha;")
	public static Class14_Sub3_Sub16 method7294(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(4) Class14_Sub3_Sub16 local4 = (Class14_Sub3_Sub16) aClass187_64.method4079(); local4 != null; local4 = (Class14_Sub3_Sub16) aClass187_64.method4084()) {
			if (local4.aBoolean653 && local4.method7673(arg1, arg0)) {
				return local4;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)Lclient!sha;")
	public static Class14_Sub3_Sub16 method7295(@OriginalArg(0) int arg0) {
		return (Class14_Sub3_Sub16) aClass187_64.method4078((long) arg0);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!ha;IIII[S[B)V")
	private static void method7296(@OriginalArg(0) Class137 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		if (arg5 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < arg5.length; local4++) {
			@Pc(14) Class203 local14 = aClass13_5.method86(arg5[local4] & 0xFFFF);
			@Pc(17) int local17 = local14.anInt6019;
			if (local17 != -1) {
				@Pc(25) Class221 local25 = aClass83_5.method2081(local17);
				@Pc(49) Class20 local49 = local25.method5293(local14.aBoolean411 ? local14.aBoolean421 : false, local14.aBoolean426 ? arg6[local4] >> 6 & 0x3 : 0, arg0);
				if (local49 != null) {
					@Pc(58) int local58 = arg3 * local49.method7394() >> 2;
					@Pc(65) int local65 = arg4 * local49.method7408() >> 2;
					if (local25.aBoolean437) {
						@Pc(71) int local71 = local14.anInt6065;
						@Pc(74) int local74 = local14.anInt6028;
						if ((arg6[local4] >> 6 & 0x1) == 1) {
							@Pc(85) int local85 = local71;
							local71 = local74;
							local74 = local85;
						}
						local58 = local71 * arg3;
						local65 = local74 * arg4;
					}
					if (local58 != 0 && local65 != 0) {
						if (local25.anInt6394 == 0) {
							local49.method7405(arg1, arg2 + arg4 - local65, local58, local65);
						} else {
							local49.method7398(arg1, arg2 + arg4 - local65, local58, local65, 0, local25.anInt6394 | 0xFF000000, 1);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "()V")
	public static void method7297() {
		@Pc(2) int[] local2 = new int[3];
		for (@Pc(4) int local4 = 0; local4 < aClass294_2.anInt8833; local4++) {
			@Pc(32) boolean local32 = aClass14_Sub3_Sub16_3.method7676(local2, aClass294_2.anIntArray654[local4] >> 14 & 0x3FFF, aClass294_2.anIntArray654[local4] >> 28 & 0x3, aClass294_2.anIntArray654[local4] & 0x3FFF);
			if (local32) {
				@Pc(42) Class14_Sub46 local42 = new Class14_Sub46(aClass294_2.anIntArray655[local4]);
				local42.anInt8308 = local2[1] - anInt8795;
				local42.anInt8307 = local2[2] - anInt8796;
				aClass262_60.method6314(local42);
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!ha;)Lclient!ok;")
	public static Class262 method7298(@OriginalArg(0) Class137 arg0) {
		@Pc(3) int local3 = anInt8797 - anInt8800;
		@Pc(7) int local7 = anInt8798 - anInt8799;
		@Pc(15) int local15 = (anInt8803 - anInt8802 << 16) / local3;
		@Pc(23) int local23 = (anInt8804 - anInt8805 << 16) / local7;
		return method7299(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(Lclient!ha;IIII)Lclient!ok;")
	private static Class262 method7299(@OriginalArg(0) Class137 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(4) Class14_Sub46 local4 = (Class14_Sub46) aClass262_60.method6318(); local4 != null; local4 = (Class14_Sub46) aClass262_60.method6311()) {
			method7303(arg0, local4, arg1, arg2);
		}
		return aClass262_60;
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(II)Lclient!dha;")
	public static Class73 method7300(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class73 local3 = new Class73();
		for (@Pc(8) Class14_Sub3_Sub16 local8 = (Class14_Sub3_Sub16) aClass187_64.method4079(); local8 != null; local8 = (Class14_Sub3_Sub16) aClass187_64.method4084()) {
			if (local8.aBoolean653 && local8.method7673(arg1, arg0)) {
				local3.method1816(local8);
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!ha;IIIIIII[S[BZ)V")
	private static void method7301(@OriginalArg(0) Class137 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) byte[] arg9, @OriginalArg(10) boolean arg10) {
		@Pc(20) int local20;
		@Pc(32) int local32;
		if (arg10 || arg5 != 0 || arg6 > 0) {
			if (arg6 == 0) {
				arg0.aa(arg1, arg2, arg3, arg4, arg5, 0);
			} else {
				local20 = arg7 & 0x3F;
				if (local20 == 0 || arg3 <= 1 || arg4 <= 1) {
					local32 = anIntArray651[arg6];
					if (arg10 || local32 != 0) {
						arg0.aa(arg1, arg2, arg3, arg4, local32, 0);
					}
				} else {
					local32 = arg10 ? 0 : 1;
					Static393.method5909(arg0, local20, arg7 >> 6 & 0x3, anIntArray651[arg6], arg4, aByteArrayArrayArray10, arg2, anInt8791, arg5, local32, arg3, arg1);
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
				@Pc(127) Class203 local127 = aClass13_5.method86(arg8[local100] & 0xFFFF);
				if (local127.anInt6019 == -1) {
					@Pc(133) int local133 = -3355444;
					if (local127.anInt6045 == 1) {
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

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V")
	public static void method7302(@OriginalArg(0) int arg0) {
		aClass14_Sub3_Sub16_3 = (Class14_Sub3_Sub16) aClass187_64.method4078((long) arg0);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!ha;Lclient!qe;IIII)V")
	private static void method7303(@OriginalArg(0) Class137 arg0, @OriginalArg(1) Class14_Sub46 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		arg1.anInt8310 = anInt8802 + (arg2 * (arg1.anInt8308 - anInt8800) >> 16);
		arg1.anInt8312 = anInt8804 - (arg3 * (arg1.anInt8307 - anInt8799) >> 16);
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "()V")
	public static void method7304() {
		aByteArray108 = null;
		aByteArray109 = null;
		aShortArray132 = null;
		aByteArray111 = null;
		aByteArray112 = null;
		aShortArray131 = null;
		aByteArray110 = null;
		aClass187_65 = null;
		aClass376ArrayArrayArray2 = null;
		anIntArray651 = null;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!d;II)V")
	public static void method7305(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < aClass350_5.anInt10167; local1++) {
			anIntArray651[local1 + 1] = method7307(arg0, local1, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!d;III)I")
	private static int method7307(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class188 local4 = aClass350_5.method8462(arg1);
		if (local4 == null) {
			return 0;
		}
		@Pc(11) int local11 = local4.anInt4906;
		if (local11 >= 0 && arg0.method6177(local11).aBoolean453) {
			local11 = -1;
		}
		@Pc(68) int local68;
		@Pc(27) int local27;
		@Pc(33) int local33;
		@Pc(55) int local55;
		if (local4.anInt4909 >= 0) {
			local27 = local4.anInt4909;
			local33 = (local27 & 0x7F) + arg3;
			if (local33 < 0) {
				local33 = 0;
			} else if (local33 > 127) {
				local33 = 127;
			}
			local55 = (local27 + arg2 & 0xFC00) + (local27 & 0x380) + local33;
			local68 = Static520.anIntArray666[Static592.method1600(Static316.method9266(local55)) & 0xFFFF] | 0xFF000000;
		} else if (local11 >= 0) {
			local68 = Static520.anIntArray666[Static592.method1600(Static316.method9266(arg0.method6177(local11).aShort74)) & 0xFFFF] | 0xFF000000;
		} else if (local4.anInt4901 == -1) {
			local68 = 0;
		} else {
			local27 = local4.anInt4901;
			local33 = (local27 & 0x7F) + arg3;
			if (local33 < 0) {
				local33 = 0;
			} else if (local33 > 127) {
				local33 = 127;
			}
			local55 = (local27 + arg2 & 0xFC00) + (local27 & 0x380) + local33;
			local68 = Static520.anIntArray666[Static592.method1600(Static316.method9266(local55)) & 0xFFFF] | 0xFF000000;
		}
		return local68;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "([B[B[SII)V")
	private static void method7308(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int[] local2 = new int[anInt8794];
		@Pc(5) int[] local5 = new int[anInt8794];
		@Pc(8) int[] local8 = new int[anInt8794];
		@Pc(11) int[] local11 = new int[anInt8794];
		@Pc(14) int[] local14 = new int[anInt8794];
		for (@Pc(16) int local16 = -5; local16 < anInt8801; local16++) {
			@Pc(21) int local21 = local16 + 5;
			@Pc(25) int local25 = local16 - 5;
			@Pc(41) int local41;
			for (@Pc(27) int local27 = 0; local27 < anInt8794; local27++) {
				@Pc(50) Class208 local50;
				@Pc(86) int local86;
				if (local21 < anInt8801) {
					local41 = arg0[local21 + local27 * anInt8801] & 0xFF;
					if (local41 > 0) {
						local50 = aClass119_3.method2838(local41 - 1);
						local2[local27] += local50.anInt6179;
						local5[local27] += local50.anInt6183;
						local8[local27] += local50.anInt6180;
						local11[local27] += local50.anInt6177;
						local86 = local14[local27]++;
					}
				}
				if (local25 >= 0) {
					local41 = arg0[local25 + local27 * anInt8801] & 0xFF;
					if (local41 > 0) {
						local50 = aClass119_3.method2838(local41 - 1);
						local2[local27] -= local50.anInt6179;
						local5[local27] -= local50.anInt6183;
						local8[local27] -= local50.anInt6180;
						local11[local27] -= local50.anInt6177;
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
				for (@Pc(167) int local167 = -5; local167 < anInt8794; local167++) {
					@Pc(172) int local172 = local167 + 5;
					if (local172 < anInt8794) {
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
						if ((arg0[local16 + local167 * anInt8801] & 0xFF) == 0) {
							local261 = local16 + local167 * anInt8801;
							arg1[local261] = 0;
							arg2[local261] = 0;
						} else {
							local261 = local163 == 0 ? 0 : Static409.method6043(local41 * 256 / local163, local161 / local165, local159 / local165);
							@Pc(294) int local294 = (local261 & 0x7F) + arg4;
							if (local294 < 0) {
								local294 = 0;
							} else if (local294 > 127) {
								local294 = 127;
							}
							@Pc(316) int local316 = (local261 + arg3 & 0xFC00) + (local261 & 0x380) + local294;
							@Pc(322) int local322 = local16 + local167 * anInt8801;
							@Pc(333) int local333 = Static520.anIntArray666[Static592.method1600(Static370.method8742(local316)) & 0xFFFF];
							arg1[local322] = (byte) (local333 >> 16 & 0xFF);
							arg2[local322] = (short) (local333 & 0xFFFF);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(Lclient!ha;)V")
	public static void method7309(@OriginalArg(0) Class137 arg0) {
		@Pc(3) int local3 = anInt8797 - anInt8800;
		@Pc(7) int local7 = anInt8798 - anInt8799;
		@Pc(15) int local15 = (anInt8803 - anInt8802 << 16) / local3;
		@Pc(23) int local23 = (anInt8804 - anInt8805 << 16) / local7;
		method7290(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "()V")
	private static void method7310() {
		@Pc(4) int local4;
		@Pc(15) int local15;
		@Pc(49) int local49;
		for (@Pc(1) int local1 = 0; local1 < anInt8801; local1++) {
			for (local4 = 0; local4 < anInt8794; local4++) {
				local15 = aShortArray131[local1 + local4 * anInt8801] & 0xFFFF;
				if (local15 != 0) {
					@Pc(35) int local35;
					if (local15 == 65535) {
						@Pc(31) Class14_Sub43 local31 = (Class14_Sub43) aClass187_65.method4078((long) (local1 << 16 | local4));
						if (local31 != null) {
							for (local35 = 0; local35 < local31.aShortArray119.length; local35++) {
								@Pc(46) Class203 local46 = aClass13_5.method86(local31.aShortArray119[local35] & 0xFFFF);
								local49 = local46.anInt6009;
								if (local46.anIntArray440 != null) {
									local46 = local46.method5007(anInterface20_2);
									if (local46 != null) {
										local49 = local46.anInt6009;
									}
								}
								if (local49 != -1) {
									@Pc(70) Class14_Sub46 local70 = new Class14_Sub46(local49);
									local70.anInt8308 = local1;
									local70.anInt8307 = local4;
									aClass262_60.method6314(local70);
								}
							}
						}
					} else {
						@Pc(94) Class203 local94 = aClass13_5.method86(local15 - 1);
						local35 = local94.anInt6009;
						if (local94.anIntArray440 != null) {
							local94 = local94.method5007(anInterface20_2);
							if (local94 != null) {
								local35 = local94.anInt6009;
							}
						}
						if (local35 != -1) {
							@Pc(118) Class14_Sub46 local118 = new Class14_Sub46(local35);
							local118.anInt8308 = local1;
							local118.anInt8307 = local4;
							aClass262_60.method6314(local118);
						}
					}
				}
			}
		}
		for (local4 = 0; local4 < 3; local4++) {
			for (local15 = 0; local15 < aClass376ArrayArrayArray2[0].length; local15++) {
				for (@Pc(144) int local144 = 0; local144 < aClass376ArrayArrayArray2[0][0].length; local144++) {
					@Pc(153) Class376 local153 = aClass376ArrayArrayArray2[local4][local15][local144];
					if (local153 != null) {
						for (@Pc(160) Class12_Sub3 local160 = (Class12_Sub3) local153.method9008(); local160 != null; local160 = (Class12_Sub3) local153.method9014()) {
							if (local160.aShortArray14 != null) {
								for (local49 = 0; local49 < local160.aShortArray14.length; local49++) {
									@Pc(177) Class203 local177 = aClass13_5.method86(local160.aShortArray14[local49] & 0xFFFF);
									@Pc(180) int local180 = local177.anInt6009;
									if (local177.anIntArray440 != null) {
										local177 = local177.method5007(anInterface20_2);
										if (local177 != null) {
											local180 = local177.anInt6009;
										}
									}
									if (local180 != -1) {
										@Pc(201) Class14_Sub46 local201 = new Class14_Sub46(local180);
										local201.anInt8308 = (local15 + (anInt8795 >> 6)) * 64 + local160.aByte41 - anInt8795;
										local201.anInt8307 = (local144 + (anInt8796 >> 6)) * 64 + local160.aByte40 - anInt8796;
										aClass262_60.method6314(local201);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!ha;Lclient!qe;Lclient!br;)V")
	public static void method7311(@OriginalArg(0) Class137 arg0, @OriginalArg(1) Class14_Sub46 arg1, @OriginalArg(2) Class42 arg2) {
		if (arg2.anIntArray91 == null) {
			return;
		}
		@Pc(7) int[] local7 = new int[arg2.anIntArray91.length];
		@Pc(20) int local20;
		@Pc(32) int local32;
		for (@Pc(9) int local9 = 0; local9 < local7.length / 2; local9++) {
			local20 = arg2.anIntArray91[local9 * 2] + arg1.anInt8308;
			local32 = arg2.anIntArray91[local9 * 2 + 1] + arg1.anInt8307;
			local7[local9 * 2] = anInt8802 + (anInt8803 - anInt8802) * (local20 - anInt8800) / (anInt8797 - anInt8800);
			local7[local9 * 2 + 1] = anInt8804 - (anInt8804 - anInt8805) * (local32 - anInt8799) / (anInt8798 - anInt8799);
		}
		Static57.method1198(arg0, local7, arg2.anInt1291);
		if (arg2.anInt1294 > 0) {
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
				arg0.method7932(local32, local102, local110, local120, arg2.anIntArray92[arg2.aByteArray19[local20] & 0xFF], arg2.anInt1294, arg2.anInt1276, arg2.anInt1287);
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
			arg0.method7932(local32, local102, local110, local120, arg2.anIntArray92[arg2.aByteArray19[arg2.aByteArray19.length - 1] & 0xFF], arg2.anInt1294, arg2.anInt1276, arg2.anInt1287);
			return;
		}
		for (local20 = 0; local20 < local7.length / 2 - 1; local20++) {
			arg0.method7877(arg2.anIntArray92[arg2.aByteArray19[local20] & 0xFF], local7[(local20 + 1) * 2 + 1], local7[local20 * 2 + 1], local7[(local20 + 1) * 2], local7[local20 * 2]);
		}
		arg0.method7877(arg2.anIntArray92[arg2.aByteArray19[arg2.aByteArray19.length - 1] & 0xFF], local7[1], local7[local7.length - 1], local7[0], local7[local7.length - 2]);
	}

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "()V")
	public static void method7312() {
		aByteArray108 = new byte[anInt8801 * anInt8794];
		aByteArray111 = new byte[anInt8801 * anInt8794];
		aByteArray112 = new byte[anInt8801 * anInt8794];
		aShortArray131 = new short[anInt8801 * anInt8794];
		aByteArray110 = new byte[anInt8801 * anInt8794];
		aClass187_65 = new Class187(1024);
		aClass376ArrayArrayArray2 = new Class376[3][anInt8801 >> 6][anInt8794 >> 6];
		anIntArray651 = new int[aClass350_5.anInt10167 + 1];
	}
}
