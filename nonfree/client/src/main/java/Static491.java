import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static491 {

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "Lclient!ni;")
	public static Class223 aClass223_93;

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "Lclient!kf;")
	private static Class167 aClass167_5;

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "Lclient!gga;")
	public static Class6_Sub5_Sub13 aClass6_Sub5_Sub13_2;

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "Lclient!up;")
	public static Class345 aClass345_4;

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "Lclient!cfa;")
	private static Class46 aClass46_6;

	@OriginalMember(owner = "client!rg", name = "f", descriptor = "Lclient!ui;")
	public static Class341 aClass341_4;

	@OriginalMember(owner = "client!rg", name = "g", descriptor = "Lclient!cj;")
	public static Interface6 anInterface6_2;

	@OriginalMember(owner = "client!rg", name = "i", descriptor = "Lclient!sia;")
	public static Class310 aClass310_3;

	@OriginalMember(owner = "client!rg", name = "k", descriptor = "F")
	public static float aFloat158;

	@OriginalMember(owner = "client!rg", name = "m", descriptor = "Lclient!wf;")
	public static Class374 aClass374_2;

	@OriginalMember(owner = "client!rg", name = "o", descriptor = "F")
	public static float aFloat159;

	@OriginalMember(owner = "client!rg", name = "p", descriptor = "I")
	public static int anInt7780;

	@OriginalMember(owner = "client!rg", name = "s", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!rg", name = "t", descriptor = "[B")
	private static byte[] aByteArray73;

	@OriginalMember(owner = "client!rg", name = "u", descriptor = "I")
	public static int anInt7782;

	@OriginalMember(owner = "client!rg", name = "v", descriptor = "I")
	public static int anInt7783;

	@OriginalMember(owner = "client!rg", name = "w", descriptor = "[S")
	private static short[] aShortArray130;

	@OriginalMember(owner = "client!rg", name = "x", descriptor = "I")
	public static int anInt7784;

	@OriginalMember(owner = "client!rg", name = "y", descriptor = "I")
	public static int anInt7785;

	@OriginalMember(owner = "client!rg", name = "z", descriptor = "[I")
	private static int[] anIntArray407;

	@OriginalMember(owner = "client!rg", name = "A", descriptor = "[B")
	private static byte[] aByteArray74;

	@OriginalMember(owner = "client!rg", name = "B", descriptor = "[B")
	private static byte[] aByteArray75;

	@OriginalMember(owner = "client!rg", name = "C", descriptor = "[[[Lclient!o;")
	private static Class234[][][] aClass234ArrayArrayArray2;

	@OriginalMember(owner = "client!rg", name = "D", descriptor = "I")
	public static int anInt7786;

	@OriginalMember(owner = "client!rg", name = "E", descriptor = "I")
	public static int anInt7787;

	@OriginalMember(owner = "client!rg", name = "F", descriptor = "[S")
	private static short[] aShortArray131;

	@OriginalMember(owner = "client!rg", name = "G", descriptor = "I")
	public static int anInt7788;

	@OriginalMember(owner = "client!rg", name = "H", descriptor = "[B")
	private static byte[] aByteArray76;

	@OriginalMember(owner = "client!rg", name = "I", descriptor = "Lclient!wr;")
	private static Class380 aClass380_32;

	@OriginalMember(owner = "client!rg", name = "J", descriptor = "I")
	public static int anInt7789;

	@OriginalMember(owner = "client!rg", name = "K", descriptor = "I")
	public static int anInt7790;

	@OriginalMember(owner = "client!rg", name = "L", descriptor = "I")
	public static int anInt7791;

	@OriginalMember(owner = "client!rg", name = "M", descriptor = "[B")
	private static byte[] aByteArray77;

	@OriginalMember(owner = "client!rg", name = "N", descriptor = "I")
	public static int anInt7792;

	@OriginalMember(owner = "client!rg", name = "O", descriptor = "I")
	public static int anInt7793;

	@OriginalMember(owner = "client!rg", name = "h", descriptor = "Lclient!wr;")
	private static final Class380 aClass380_31 = new Class380(16);

	@OriginalMember(owner = "client!rg", name = "j", descriptor = "I")
	public static int anInt7779 = (int) (Math.random() * 11.0D) - 5;

	@OriginalMember(owner = "client!rg", name = "l", descriptor = "Lclient!kba;")
	public static final Class163 aClass163_49 = new Class163();

	@OriginalMember(owner = "client!rg", name = "n", descriptor = "[B")
	private static final byte[] aByteArray72 = new byte[1];

	@OriginalMember(owner = "client!rg", name = "q", descriptor = "[S")
	private static final short[] aShortArray129 = new short[1];

	@OriginalMember(owner = "client!rg", name = "r", descriptor = "I")
	public static int anInt7781 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "()V")
	private static void method6565() {
		@Pc(4) int local4;
		@Pc(15) int local15;
		@Pc(49) int local49;
		for (@Pc(1) int local1 = 0; local1 < anInt7789; local1++) {
			for (local4 = 0; local4 < anInt7787; local4++) {
				local15 = aShortArray130[local1 + local4 * anInt7789] & 0xFFFF;
				if (local15 != 0) {
					@Pc(35) int local35;
					if (local15 == 65535) {
						@Pc(31) Class6_Sub34 local31 = (Class6_Sub34) aClass380_32.method8747((long) (local1 << 16 | local4));
						if (local31 != null) {
							for (local35 = 0; local35 < local31.aShortArray85.length; local35++) {
								@Pc(46) Class356 local46 = aClass310_3.method7474(local31.aShortArray85[local35] & 0xFFFF);
								local49 = local46.anInt10226;
								if (local46.anIntArray545 != null) {
									local46 = local46.method8322(anInterface6_2);
									if (local46 != null) {
										local49 = local46.anInt10226;
									}
								}
								if (local49 != -1) {
									@Pc(70) Class6_Sub48 local70 = new Class6_Sub48(local49);
									local70.anInt9726 = local1;
									local70.anInt9721 = local4;
									aClass163_49.method4967(local70);
								}
							}
						}
					} else {
						@Pc(94) Class356 local94 = aClass310_3.method7474(local15 - 1);
						local35 = local94.anInt10226;
						if (local94.anIntArray545 != null) {
							local94 = local94.method8322(anInterface6_2);
							if (local94 != null) {
								local35 = local94.anInt10226;
							}
						}
						if (local35 != -1) {
							@Pc(118) Class6_Sub48 local118 = new Class6_Sub48(local35);
							local118.anInt9726 = local1;
							local118.anInt9721 = local4;
							aClass163_49.method4967(local118);
						}
					}
				}
			}
		}
		for (local4 = 0; local4 < 3; local4++) {
			for (local15 = 0; local15 < aClass234ArrayArrayArray2[0].length; local15++) {
				for (@Pc(144) int local144 = 0; local144 < aClass234ArrayArrayArray2[0][0].length; local144++) {
					@Pc(153) Class234 local153 = aClass234ArrayArrayArray2[local4][local15][local144];
					if (local153 != null) {
						for (@Pc(160) Class9_Sub8 local160 = (Class9_Sub8) local153.method6092(); local160 != null; local160 = (Class9_Sub8) local153.method6098()) {
							if (local160.aShortArray118 != null) {
								for (local49 = 0; local49 < local160.aShortArray118.length; local49++) {
									@Pc(177) Class356 local177 = aClass310_3.method7474(local160.aShortArray118[local49] & 0xFFFF);
									@Pc(180) int local180 = local177.anInt10226;
									if (local177.anIntArray545 != null) {
										local177 = local177.method8322(anInterface6_2);
										if (local177 != null) {
											local180 = local177.anInt10226;
										}
									}
									if (local180 != -1) {
										@Pc(201) Class6_Sub48 local201 = new Class6_Sub48(local180);
										local201.anInt9726 = (local15 + (anInt7783 >> 6)) * 64 + local160.aByte88 - anInt7783;
										local201.anInt9721 = (local144 + (anInt7785 >> 6)) * 64 + local160.aByte85 - anInt7785;
										aClass163_49.method4967(local201);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)Lclient!ns;")
	public static Class231 method6566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class231 local3 = new Class231();
		for (@Pc(8) Class6_Sub5_Sub13 local8 = (Class6_Sub5_Sub13) aClass380_31.method8755(); local8 != null; local8 = (Class6_Sub5_Sub13) aClass380_31.method8752()) {
			if (local8.aBoolean329 && local8.method3435(arg0, arg1)) {
				local3.method6048(local8);
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "()V")
	public static void method6567() {
		aByteArray75 = new byte[anInt7789 * anInt7787];
		aByteArray76 = new byte[anInt7789 * anInt7787];
		aByteArray73 = new byte[anInt7789 * anInt7787];
		aShortArray130 = new short[anInt7789 * anInt7787];
		aByteArray77 = new byte[anInt7789 * anInt7787];
		aClass380_32 = new Class380(1024);
		aClass234ArrayArrayArray2 = new Class234[3][anInt7789 >> 6][anInt7787 >> 6];
		anIntArray407 = new int[aClass46_6.anInt2307 + 1];
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!ni;Lclient!cfa;Lclient!kf;Lclient!sia;Lclient!up;Lclient!ui;Lclient!cj;)V")
	public static void method6568(@OriginalArg(0) Class223 arg0, @OriginalArg(1) Class46 arg1, @OriginalArg(2) Class167 arg2, @OriginalArg(3) Class310 arg3, @OriginalArg(4) Class345 arg4, @OriginalArg(5) Class341 arg5, @OriginalArg(6) Interface6 arg6) {
		aClass223_93 = arg0;
		aClass46_6 = arg1;
		aClass167_5 = arg2;
		aClass310_3 = arg3;
		aClass345_4 = arg4;
		aClass341_4 = arg5;
		anInterface6_2 = arg6;
		aClass380_31.method8751();
		@Pc(21) int local21 = aClass223_93.method5959("details");
		@Pc(26) int[] local26 = aClass223_93.method5952(local21);
		if (local26 != null) {
			for (@Pc(30) int local30 = 0; local30 < local26.length; local30++) {
				@Pc(39) Class6_Sub5_Sub13 local39 = Static193.method2213(local26[local30], local21, aClass223_93);
				aClass380_31.method8753(local39, (long) local39.anInt4042);
			}
		}
		Static181.method3397(true, false);
	}

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "()V")
	public static void method6569() {
		aByteArray75 = null;
		aByteArray74 = null;
		aShortArray131 = null;
		aByteArray76 = null;
		aByteArray73 = null;
		aShortArray130 = null;
		aByteArray77 = null;
		aClass380_32 = null;
		aClass234ArrayArrayArray2 = null;
		anIntArray407 = null;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!ha;Lclient!ji;IIII[I[I)V")
	private static void method6570(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class6_Sub8 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7) {
		@Pc(3) int local3 = arg1.method8246();
		if ((local3 & 0x1) == 0) {
			@Pc(15) boolean local15 = (local3 & 0x2) == 0;
			@Pc(21) int local21 = local3 >> 2 & 0x3F;
			if (local21 != 62) {
				if (local21 == 63) {
					local21 = arg1.method8246();
				} else if (local15) {
					local21 = arg6[local21];
				} else {
					local21 = arg7[local21];
				}
				if (local15) {
					aByteArray75[arg4 + arg5 * anInt7789] = (byte) local21;
					aByteArray76[arg4 + arg5 * anInt7789] = 0;
				} else {
					aByteArray76[arg4 + arg5 * anInt7789] = (byte) local21;
					aByteArray73[arg4 + arg5 * anInt7789] = 0;
					aByteArray75[arg4 + arg5 * anInt7789] = arg1.method8208();
				}
			}
			return;
		}
		@Pc(100) int local100 = (local3 >> 1 & 0x3) + 1;
		@Pc(108) boolean local108 = (local3 & 0x8) != 0;
		@Pc(116) boolean local116 = (local3 & 0x10) != 0;
		for (@Pc(118) int local118 = 0; local118 < local100; local118++) {
			@Pc(123) int local123 = arg1.method8246();
			@Pc(125) int local125 = 0;
			@Pc(127) int local127 = 0;
			if (local108) {
				local125 = arg1.method8246();
				local127 = arg1.method8246();
			}
			@Pc(139) int local139 = 0;
			if (local116) {
				local139 = arg1.method8246();
			}
			@Pc(215) short[] local215;
			@Pc(218) byte[] local218;
			@Pc(220) int local220;
			if (local118 == 0) {
				aByteArray75[arg4 + arg5 * anInt7789] = (byte) local123;
				aByteArray76[arg4 + arg5 * anInt7789] = (byte) local125;
				aByteArray73[arg4 + arg5 * anInt7789] = (byte) local127;
				if (local139 == 1) {
					aShortArray130[arg4 + arg5 * anInt7789] = (short) (arg1.method8220() + 1);
					aByteArray77[arg4 + arg5 * anInt7789] = arg1.method8208();
				} else if (local139 > 1) {
					aShortArray130[arg4 + arg5 * anInt7789] = -1;
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method8220();
						local218[local220] = arg1.method8208();
					}
					aClass380_32.method8753(new Class6_Sub34(local215, local218), (long) (arg4 << 16 | arg5));
				}
			} else {
				local215 = null;
				local218 = null;
				if (local139 > 0) {
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method8220();
						local218[local220] = arg1.method8208();
					}
				}
				if (aClass234ArrayArrayArray2[local118 - 1][arg2 - (anInt7783 >> 6)][arg3 - (anInt7785 >> 6)] == null) {
					aClass234ArrayArrayArray2[local118 - 1][arg2 - (anInt7783 >> 6)][arg3 - (anInt7785 >> 6)] = new Class234();
				}
				@Pc(338) Class9_Sub8 local338 = new Class9_Sub8(arg4 & 0x3F, arg5 & 0x3F, local123, local125, local127, local215, local218);
				aClass234ArrayArrayArray2[local118 - 1][arg2 - (anInt7783 >> 6)][arg3 - (anInt7785 >> 6)].method6097(local338);
			}
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!ha;IIII)V")
	private static void method6571(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = anInt7782 - anInt7791;
		@Pc(7) int local7 = anInt7786 - anInt7790;
		if (anInt7782 < anInt7789) {
			local3++;
		}
		if (anInt7786 < anInt7787) {
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
			local28 = (arg1 * local17 >> 16) + anInt7788;
			local40 = (arg1 * (local17 + 1) >> 16) + anInt7788;
			local44 = local40 - local28;
			if (local44 > 0) {
				local50 = anInt7791 + local17;
				if (local50 >= 0 && local50 < anInt7789) {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt7793 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt7793 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (local84 > 0) {
							local93 = local57 + anInt7790;
							local173 = local50 + local93 * anInt7789;
							local175 = 0;
							local177 = 0;
							local179 = 0;
							if (local93 >= 0 && local93 < anInt7787) {
								local175 = (aByteArray74[local173] & 0xFF) << 16 | aShortArray131[local173] & 0xFFFF;
								if (local175 != 0) {
									local175 |= 0xFF000000;
								}
								local177 = aByteArray76[local173] & 0xFF;
								local179 = aShortArray130[local173] & 0xFFFF;
							}
							if (local175 == 0 && local177 == 0 && local179 == 0) {
								if (aClass6_Sub5_Sub13_2.anInt4041 != -1) {
									local175 = aClass6_Sub5_Sub13_2.anInt4041 | 0xFF000000;
								} else if ((local17 + anInt7791 & 0x4) == (local57 + anInt7786 & 0x4)) {
									local175 = anIntArray407[aClass46_6.anInt2310 + 1];
								} else {
									local175 = -11840664;
								}
								if (local175 == 0) {
									local175 = -16777216;
								}
								arg0.aa(local28, local70, local44, local84, local175, 0);
							} else if (local179 <= 0) {
								method6588(arg0, local28, local70, local44, local84, local175, local177, aByteArray73[local173], (short[]) null, (byte[]) null, true);
							} else if (local179 == 65535) {
								@Pc(282) Class6_Sub34 local282 = (Class6_Sub34) aClass380_32.method8747((long) (local50 << 16 | local93));
								if (local282 != null) {
									method6588(arg0, local28, local70, local44, local84, local175, local177, aByteArray73[local173], local282.aShortArray85, local282.aByteArray43, true);
								}
							} else {
								aShortArray129[0] = (short) (local179 - 1);
								aByteArray72[0] = aByteArray77[local173];
								method6588(arg0, local28, local70, local44, local84, local175, local177, aByteArray73[local173], aShortArray129, aByteArray72, true);
							}
						}
					}
				} else {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt7793 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt7793 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (aClass6_Sub5_Sub13_2.anInt4041 != -1) {
							local93 = aClass6_Sub5_Sub13_2.anInt4041 | 0xFF000000;
						} else if ((local17 + anInt7791 & 0x4) == (local57 + anInt7786 & 0x4)) {
							local93 = anIntArray407[aClass46_6.anInt2310 + 1];
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
			local40 = (arg1 * local28 >> 16) + anInt7788;
			local44 = (arg1 * (local28 + 1) >> 16) + anInt7788;
			local50 = local44 - local40;
			if (local50 > 0) {
				local57 = local28 + anInt7791;
				if (local57 >= 0 && local57 < anInt7789) {
					for (local70 = -16; local70 < local7 + 16; local70++) {
						local80 = anInt7793 - (arg2 * (local70 + 1) >> 16);
						local84 = anInt7793 - (arg2 * local70 >> 16);
						local93 = local84 - local80;
						if (local93 > 0) {
							local173 = local70 + anInt7790;
							if (local173 >= 0 && local173 < anInt7787) {
								local175 = aShortArray130[local57 + local173 * anInt7789] & 0xFFFF;
								if (local175 <= 0) {
									method6587(arg0, local40, local80, local50, local93, (short[]) null, (byte[]) null);
								} else if (local175 == 65535) {
									@Pc(459) Class6_Sub34 local459 = (Class6_Sub34) aClass380_32.method8747((long) (local57 << 16 | local173));
									if (local459 != null) {
										method6587(arg0, local40, local80, local50, local93, local459.aShortArray85, local459.aByteArray43);
									}
								} else {
									aShortArray129[0] = (short) (local175 - 1);
									aByteArray72[0] = aByteArray77[local57 + local173 * anInt7789];
									method6587(arg0, local40, local80, local50, local93, aShortArray129, aByteArray72);
								}
							}
						}
					}
				}
			}
		}
		local40 = anInt7791 >> 6;
		local44 = anInt7790 >> 6;
		if (local40 < 0) {
			local40 = 0;
		}
		if (local44 < 0) {
			local44 = 0;
		}
		local50 = anInt7782 >> 6;
		local57 = anInt7786 >> 6;
		if (local50 >= aClass234ArrayArrayArray2[0].length) {
			local50 = aClass234ArrayArrayArray2[0].length - 1;
		}
		if (local57 >= aClass234ArrayArrayArray2[0][0].length) {
			local57 = aClass234ArrayArrayArray2[0][0].length - 1;
		}
		for (local70 = 0; local70 < 3; local70++) {
			@Pc(641) int local641;
			@Pc(653) int local653;
			@Pc(665) int local665;
			@Pc(675) int local675;
			@Pc(631) int local631;
			for (local80 = local40; local80 <= local50; local80++) {
				for (local84 = local44; local84 <= local57; local84++) {
					@Pc(589) Class234 local589 = aClass234ArrayArrayArray2[local70][local80][local84];
					if (local589 != null) {
						local173 = (local80 + (anInt7783 >> 6)) * 64;
						local175 = (local84 + (anInt7785 >> 6)) * 64;
						for (@Pc(612) Class9_Sub8 local612 = (Class9_Sub8) local589.method6092(); local612 != null; local612 = (Class9_Sub8) local589.method6098()) {
							local179 = local173 + local612.aByte88 - anInt7783 - anInt7791;
							local631 = local175 + local612.aByte85 - anInt7785 - anInt7790;
							local641 = (arg1 * local179 >> 16) + anInt7788;
							local653 = (arg1 * (local179 + 1) >> 16) + anInt7788;
							local665 = anInt7793 - (arg2 * (local631 + 1) >> 16);
							local675 = anInt7793 - (arg2 * local631 >> 16);
							method6588(arg0, local641, local665, local653 - local641, local675 - local665, local612.anInt6912, local612.aByte87 & 0xFF, local612.aByte86, local612.aShortArray118, local612.aByteArray59, false);
						}
					}
				}
			}
			for (local84 = local40; local84 <= local50; local84++) {
				for (local93 = local44; local93 <= local57; local93++) {
					@Pc(727) Class234 local727 = aClass234ArrayArrayArray2[local70][local84][local93];
					if (local727 != null) {
						local175 = (local84 + (anInt7783 >> 6)) * 64;
						local177 = (local93 + (anInt7785 >> 6)) * 64;
						for (@Pc(750) Class9_Sub8 local750 = (Class9_Sub8) local727.method6092(); local750 != null; local750 = (Class9_Sub8) local727.method6098()) {
							local631 = local175 + local750.aByte88 - anInt7783 - anInt7791;
							local641 = local177 + local750.aByte85 - anInt7785 - anInt7790;
							local653 = (arg1 * local631 >> 16) + anInt7788;
							local665 = (arg1 * (local631 + 1) >> 16) + anInt7788;
							local675 = anInt7793 - (arg2 * (local641 + 1) >> 16);
							@Pc(813) int local813 = anInt7793 - (arg2 * local641 >> 16);
							method6587(arg0, local653, local675, local665 - local653, local813 - local675, local750.aShortArray118, local750.aByteArray59);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "()V")
	public static void method6572() {
		@Pc(2) int[] local2 = new int[3];
		for (@Pc(4) int local4 = 0; local4 < aClass374_2.anInt10540; local4++) {
			@Pc(32) boolean local32 = aClass6_Sub5_Sub13_2.method3444(aClass374_2.anIntArray559[local4] >> 28 & 0x3, local2, aClass374_2.anIntArray559[local4] & 0x3FFF, aClass374_2.anIntArray559[local4] >> 14 & 0x3FFF);
			if (local32) {
				@Pc(42) Class6_Sub48 local42 = new Class6_Sub48(aClass374_2.anIntArray561[local4]);
				local42.anInt9726 = local2[1] - anInt7783;
				local42.anInt9721 = local2[2] - anInt7785;
				aClass163_49.method4967(local42);
			}
		}
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(II)Lclient!gga;")
	public static Class6_Sub5_Sub13 method6573(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(4) Class6_Sub5_Sub13 local4 = (Class6_Sub5_Sub13) aClass380_31.method8755(); local4 != null; local4 = (Class6_Sub5_Sub13) aClass380_31.method8752()) {
			if (local4.aBoolean329 && local4.method3435(arg0, arg1)) {
				return local4;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!d;II)V")
	public static void method6574(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < aClass46_6.anInt2307; local1++) {
			anIntArray407[local1 + 1] = method6581(arg0, local1, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!ha;II)V")
	public static void method6575(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class6_Sub8 local9 = new Class6_Sub8(aClass223_93.method5948(aClass6_Sub5_Sub13_2.aString41, "area"));
		@Pc(13) int local13 = local9.method8246();
		@Pc(16) int[] local16 = new int[local13];
		for (@Pc(18) int local18 = 0; local18 < local13; local18++) {
			local16[local18] = local9.method8246();
		}
		@Pc(33) int local33 = local9.method8246();
		@Pc(36) int[] local36 = new int[local33];
		for (@Pc(38) int local38 = 0; local38 < local33; local38++) {
			local36[local38] = local9.method8246();
		}
		while (true) {
			@Pc(58) int local58;
			@Pc(64) int local64;
			@Pc(67) int local67;
			@Pc(76) int local76;
			@Pc(148) int local148;
			while (local9.anInt10061 < local9.aByteArray102.length) {
				@Pc(62) int local62;
				@Pc(84) int local84;
				if (local9.method8246() == 0) {
					local58 = local9.method8246();
					local62 = local9.method8246();
					for (local64 = 0; local64 < 64; local64++) {
						for (local67 = 0; local67 < 64; local67++) {
							local76 = local58 * 64 + local64 - anInt7783;
							local84 = local62 * 64 + local67 - anInt7785;
							method6570(arg0, local9, local58, local62, local76, local84, local16, local36);
						}
					}
				} else {
					local58 = local9.method8246();
					local62 = local9.method8246();
					local64 = local9.method8246();
					local67 = local9.method8246();
					for (local76 = 0; local76 < 8; local76++) {
						for (local84 = 0; local84 < 8; local84++) {
							@Pc(136) int local136 = local58 * 64 + local64 * 8 + local76 - anInt7783;
							local148 = local62 * 64 + local67 * 8 + local84 - anInt7785;
							method6570(arg0, local9, local58, local62, local136, local148, local16, local36);
						}
					}
				}
			}
			aByteArray74 = new byte[anInt7789 * anInt7787];
			aShortArray131 = new short[anInt7789 * anInt7787];
			for (local58 = 0; local58 < 3; local58++) {
				@Pc(191) byte[] local191 = new byte[anInt7789 * anInt7787];
				for (local64 = 0; local64 < aClass234ArrayArrayArray2[local58].length; local64++) {
					for (local67 = 0; local67 < aClass234ArrayArrayArray2[local58][0].length; local67++) {
						@Pc(205) Class234 local205 = aClass234ArrayArrayArray2[local58][local64][local67];
						if (local205 != null) {
							for (@Pc(212) Class9_Sub8 local212 = (Class9_Sub8) local205.method6092(); local212 != null; local212 = (Class9_Sub8) local205.method6098()) {
								local191[local64 * 64 + local212.aByte88 + (local67 * 64 + local212.aByte85) * anInt7789] = (byte) local212.anInt6912;
							}
						}
					}
				}
				method6580(local191, aByteArray74, aShortArray131, arg1, arg2);
				for (local67 = 0; local67 < aClass234ArrayArrayArray2[local58].length; local67++) {
					for (local76 = 0; local76 < aClass234ArrayArrayArray2[local58][0].length; local76++) {
						@Pc(276) Class234 local276 = aClass234ArrayArrayArray2[local58][local67][local76];
						if (local276 != null) {
							for (@Pc(283) Class9_Sub8 local283 = (Class9_Sub8) local276.method6092(); local283 != null; local283 = (Class9_Sub8) local276.method6098()) {
								local148 = local67 * 64 + local283.aByte88 + (local76 * 64 + local283.aByte85) * anInt7789;
								local283.anInt6912 = (aByteArray74[local148] & 0xFF) << 16 | aShortArray131[local148] & 0xFFFF;
								if (local283.anInt6912 != 0) {
									local283.anInt6912 |= 0xFF000000;
								}
							}
						}
					}
				}
			}
			method6580(aByteArray75, aByteArray74, aShortArray131, arg1, arg2);
			aByteArray75 = null;
			method6565();
			return;
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)Lclient!gga;")
	public static Class6_Sub5_Sub13 method6576(@OriginalArg(0) int arg0) {
		return (Class6_Sub5_Sub13) aClass380_31.method8747((long) arg0);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!ha;Lclient!uca;IIII)V")
	private static void method6577(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class6_Sub48 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		arg1.anInt9720 = anInt7788 + (arg2 * (arg1.anInt9726 - anInt7791) >> 16);
		arg1.anInt9724 = anInt7793 - (arg3 * (arg1.anInt9721 - anInt7790) >> 16);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIIIIII)V")
	public static void method6578(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		anInt7791 = arg0 - anInt7783;
		anInt7786 = arg1 - anInt7785;
		anInt7782 = arg2 - anInt7783;
		anInt7790 = arg3 - anInt7785;
		anInt7788 = arg4;
		anInt7784 = arg5;
		anInt7792 = arg6;
		anInt7793 = arg7;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!ha;)V")
	public static void method6579(@OriginalArg(0) Class5 arg0) {
		@Pc(3) int local3 = anInt7782 - anInt7791;
		@Pc(7) int local7 = anInt7786 - anInt7790;
		@Pc(15) int local15 = (anInt7792 - anInt7788 << 16) / local3;
		@Pc(23) int local23 = (anInt7793 - anInt7784 << 16) / local7;
		method6571(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "([B[B[SII)V")
	private static void method6580(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int[] local2 = new int[anInt7787];
		@Pc(5) int[] local5 = new int[anInt7787];
		@Pc(8) int[] local8 = new int[anInt7787];
		@Pc(11) int[] local11 = new int[anInt7787];
		@Pc(14) int[] local14 = new int[anInt7787];
		for (@Pc(16) int local16 = -5; local16 < anInt7789; local16++) {
			@Pc(21) int local21 = local16 + 5;
			@Pc(25) int local25 = local16 - 5;
			@Pc(41) int local41;
			for (@Pc(27) int local27 = 0; local27 < anInt7787; local27++) {
				@Pc(50) Class87 local50;
				@Pc(86) int local86;
				if (local21 < anInt7789) {
					local41 = arg0[local21 + local27 * anInt7789] & 0xFF;
					if (local41 > 0) {
						local50 = aClass167_5.method5016(local41 - 1);
						local2[local27] += local50.anInt3218;
						local5[local27] += local50.anInt3223;
						local8[local27] += local50.anInt3224;
						local11[local27] += local50.anInt3221;
						local86 = local14[local27]++;
					}
				}
				if (local25 >= 0) {
					local41 = arg0[local25 + local27 * anInt7789] & 0xFF;
					if (local41 > 0) {
						local50 = aClass167_5.method5016(local41 - 1);
						local2[local27] -= local50.anInt3218;
						local5[local27] -= local50.anInt3223;
						local8[local27] -= local50.anInt3224;
						local11[local27] -= local50.anInt3221;
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
				for (@Pc(167) int local167 = -5; local167 < anInt7787; local167++) {
					@Pc(172) int local172 = local167 + 5;
					if (local172 < anInt7787) {
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
						if ((arg0[local16 + local167 * anInt7789] & 0xFF) == 0) {
							local261 = local16 + local167 * anInt7789;
							arg1[local261] = 0;
							arg2[local261] = 0;
						} else {
							local261 = local163 == 0 ? 0 : Static149.method2959(local159 / local165, local41 * 256 / local163, local161 / local165);
							@Pc(294) int local294 = (local261 & 0x7F) + arg4;
							if (local294 < 0) {
								local294 = 0;
							} else if (local294 > 127) {
								local294 = 127;
							}
							@Pc(316) int local316 = (local261 + arg3 & 0xFC00) + (local261 & 0x380) + local294;
							@Pc(322) int local322 = local16 + local167 * anInt7789;
							@Pc(333) int local333 = Static396.anIntArray370[Static222.method4107(Static132.method2688(local316)) & 0xFFFF];
							arg1[local322] = (byte) (local333 >> 16 & 0xFF);
							arg2[local322] = (short) (local333 & 0xFFFF);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!d;III)I")
	private static int method6581(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class215 local4 = aClass46_6.method2007(arg1);
		if (local4 == null) {
			return 0;
		}
		@Pc(11) int local11 = local4.anInt7046;
		if (local11 >= 0 && arg0.method6931(local11).aBoolean618) {
			local11 = -1;
		}
		@Pc(68) int local68;
		@Pc(27) int local27;
		@Pc(33) int local33;
		@Pc(55) int local55;
		if (local4.anInt7042 >= 0) {
			local27 = local4.anInt7042;
			local33 = (local27 & 0x7F) + arg3;
			if (local33 < 0) {
				local33 = 0;
			} else if (local33 > 127) {
				local33 = 127;
			}
			local55 = (local27 + arg2 & 0xFC00) + (local27 & 0x380) + local33;
			local68 = Static396.anIntArray370[Static222.method4107(Static587.method8092(local55)) & 0xFFFF] | 0xFF000000;
		} else if (local11 >= 0) {
			local68 = Static396.anIntArray370[Static222.method4107(Static587.method8092(arg0.method6931(local11).aShort91)) & 0xFFFF] | 0xFF000000;
		} else if (local4.anInt7040 == -1) {
			local68 = 0;
		} else {
			local27 = local4.anInt7040;
			local33 = (local27 & 0x7F) + arg3;
			if (local33 < 0) {
				local33 = 0;
			} else if (local33 > 127) {
				local33 = 127;
			}
			local55 = (local27 + arg2 & 0xFC00) + (local27 & 0x380) + local33;
			local68 = Static396.anIntArray370[Static222.method4107(Static587.method8092(local55)) & 0xFFFF] | 0xFF000000;
		}
		return local68;
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(Lclient!ha;IIII)Lclient!kba;")
	private static Class163 method6582(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(4) Class6_Sub48 local4 = (Class6_Sub48) aClass163_49.method4966(); local4 != null; local4 = (Class6_Sub48) aClass163_49.method4965()) {
			method6577(arg0, local4, arg1, arg2);
		}
		return aClass163_49;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!ha;Lclient!uca;Lclient!bq;)V")
	public static void method6584(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class6_Sub48 arg1, @OriginalArg(2) Class36 arg2) {
		if (arg2.anIntArray49 == null) {
			return;
		}
		@Pc(7) int[] local7 = new int[arg2.anIntArray49.length];
		@Pc(20) int local20;
		@Pc(32) int local32;
		for (@Pc(9) int local9 = 0; local9 < local7.length / 2; local9++) {
			local20 = arg2.anIntArray49[local9 * 2] + arg1.anInt9726;
			local32 = arg2.anIntArray49[local9 * 2 + 1] + arg1.anInt9721;
			local7[local9 * 2] = anInt7788 + (anInt7792 - anInt7788) * (local20 - anInt7791) / (anInt7782 - anInt7791);
			local7[local9 * 2 + 1] = anInt7793 - (anInt7793 - anInt7784) * (local32 - anInt7790) / (anInt7786 - anInt7790);
		}
		Static261.method4619(arg0, local7, arg2.anInt1758);
		if (arg2.anInt1759 > 0) {
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
				arg0.method6174(local32, local102, local110, local120, arg2.anIntArray48[arg2.aByteArray8[local20] & 0xFF], arg2.anInt1759, arg2.anInt1763, arg2.anInt1738);
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
			arg0.method6174(local32, local102, local110, local120, arg2.anIntArray48[arg2.aByteArray8[arg2.aByteArray8.length - 1] & 0xFF], arg2.anInt1759, arg2.anInt1763, arg2.anInt1738);
			return;
		}
		for (local20 = 0; local20 < local7.length / 2 - 1; local20++) {
			arg0.method6152(local7[local20 * 2 + 1], arg2.anIntArray48[arg2.aByteArray8[local20] & 0xFF], local7[(local20 + 1) * 2 + 1], local7[(local20 + 1) * 2], local7[local20 * 2]);
		}
		arg0.method6152(local7[local7.length - 1], arg2.anIntArray48[arg2.aByteArray8[arg2.aByteArray8.length - 1] & 0xFF], local7[1], local7[0], local7[local7.length - 2]);
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(Lclient!ha;)Lclient!kba;")
	public static Class163 method6585(@OriginalArg(0) Class5 arg0) {
		@Pc(3) int local3 = anInt7782 - anInt7791;
		@Pc(7) int local7 = anInt7786 - anInt7790;
		@Pc(15) int local15 = (anInt7792 - anInt7788 << 16) / local3;
		@Pc(23) int local23 = (anInt7793 - anInt7784 << 16) / local7;
		return method6582(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)V")
	public static void method6586(@OriginalArg(0) int arg0) {
		aClass6_Sub5_Sub13_2 = (Class6_Sub5_Sub13) aClass380_31.method8747((long) arg0);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!ha;IIII[S[B)V")
	private static void method6587(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		if (arg5 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < arg5.length; local4++) {
			@Pc(14) Class356 local14 = aClass310_3.method7474(arg5[local4] & 0xFFFF);
			@Pc(17) int local17 = local14.anInt10249;
			if (local17 != -1) {
				@Pc(25) Class17 local25 = aClass341_4.method7998(local17);
				@Pc(49) Class4 local49 = local25.method605(local14.lb ? local14.aBoolean798 : false, local14.aBoolean803 ? arg6[local4] >> 6 & 0x3 : 0, arg0);
				if (local49 != null) {
					@Pc(58) int local58 = arg3 * local49.method7700() >> 2;
					@Pc(65) int local65 = arg4 * local49.method7712() >> 2;
					if (local25.aBoolean66) {
						@Pc(71) int local71 = local14.anInt10250;
						@Pc(74) int local74 = local14.anInt10238;
						if ((arg6[local4] >> 6 & 0x1) == 1) {
							@Pc(85) int local85 = local71;
							local71 = local74;
							local74 = local85;
						}
						local58 = local71 * arg3;
						local65 = local74 * arg4;
					}
					if (local58 != 0 && local65 != 0) {
						if (local25.anInt644 == 0) {
							local49.method7689(arg1, arg2 + arg4 - local65, local58, local65);
						} else {
							local49.method7690(arg1, arg2 + arg4 - local65, local58, local65, 0, local25.anInt644 | 0xFF000000, 1);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!ha;IIIIIII[S[BZ)V")
	private static void method6588(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) byte[] arg9, @OriginalArg(10) boolean arg10) {
		@Pc(20) int local20;
		@Pc(32) int local32;
		if (arg10 || arg5 != 0 || arg6 > 0) {
			if (arg6 == 0) {
				arg0.aa(arg1, arg2, arg3, arg4, arg5, 0);
			} else {
				local20 = arg7 & 0x3F;
				if (local20 == 0 || arg3 <= 1 || arg4 <= 1) {
					local32 = anIntArray407[arg6];
					if (arg10 || local32 != 0) {
						arg0.aa(arg1, arg2, arg3, arg4, local32, 0);
					}
				} else {
					local32 = arg10 ? 0 : 1;
					Static487.method7139(arg7 >> 6 & 0x3, arg5, anInt7780, arg1, arg4, local20, anIntArray407[arg6], arg0, arg2, arg3, aByteArrayArrayArray16, local32);
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
				@Pc(127) Class356 local127 = aClass310_3.method7474(arg8[local100] & 0xFFFF);
				if (local127.anInt10249 == -1) {
					@Pc(133) int local133 = -3355444;
					if (local127.anInt10253 == 1) {
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
}
