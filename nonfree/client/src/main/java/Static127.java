import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "Lclient!tq;")
	public static Class191 aClass191_45;

	@OriginalMember(owner = "client!hr", name = "c", descriptor = "Lclient!gq;")
	public static Class2_Sub11_Sub6 aClass2_Sub11_Sub6_2;

	@OriginalMember(owner = "client!hr", name = "f", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!hr", name = "i", descriptor = "F")
	public static float aFloat33;

	@OriginalMember(owner = "client!hr", name = "k", descriptor = "Lclient!ns;")
	public static Class142 aClass142_2;

	@OriginalMember(owner = "client!hr", name = "l", descriptor = "I")
	public static int anInt1561;

	@OriginalMember(owner = "client!hr", name = "m", descriptor = "F")
	public static float aFloat34;

	@OriginalMember(owner = "client!hr", name = "n", descriptor = "Lclient!va;")
	private static Class199 aClass199_7;

	@OriginalMember(owner = "client!hr", name = "o", descriptor = "I")
	public static int anInt1562;

	@OriginalMember(owner = "client!hr", name = "p", descriptor = "I")
	public static int anInt1563;

	@OriginalMember(owner = "client!hr", name = "q", descriptor = "I")
	public static int anInt1564;

	@OriginalMember(owner = "client!hr", name = "r", descriptor = "[B")
	private static byte[] aByteArray30;

	@OriginalMember(owner = "client!hr", name = "s", descriptor = "[B")
	private static byte[] aByteArray31;

	@OriginalMember(owner = "client!hr", name = "t", descriptor = "[I")
	private static int[] anIntArray159;

	@OriginalMember(owner = "client!hr", name = "u", descriptor = "I")
	public static int anInt1565;

	@OriginalMember(owner = "client!hr", name = "v", descriptor = "I")
	public static int anInt1566;

	@OriginalMember(owner = "client!hr", name = "w", descriptor = "[B")
	private static byte[] aByteArray32;

	@OriginalMember(owner = "client!hr", name = "x", descriptor = "[B")
	private static byte[] aByteArray33;

	@OriginalMember(owner = "client!hr", name = "y", descriptor = "I")
	public static int anInt1567;

	@OriginalMember(owner = "client!hr", name = "z", descriptor = "I")
	public static int anInt1568;

	@OriginalMember(owner = "client!hr", name = "A", descriptor = "[[[Lclient!fk;")
	private static Class67[][][] aClass67ArrayArrayArray2;

	@OriginalMember(owner = "client!hr", name = "B", descriptor = "[S")
	private static short[] aShortArray48;

	@OriginalMember(owner = "client!hr", name = "C", descriptor = "I")
	public static int anInt1569;

	@OriginalMember(owner = "client!hr", name = "D", descriptor = "[S")
	private static short[] aShortArray49;

	@OriginalMember(owner = "client!hr", name = "E", descriptor = "I")
	public static int anInt1570;

	@OriginalMember(owner = "client!hr", name = "F", descriptor = "I")
	public static int anInt1571;

	@OriginalMember(owner = "client!hr", name = "G", descriptor = "I")
	public static int anInt1572;

	@OriginalMember(owner = "client!hr", name = "H", descriptor = "I")
	public static int anInt1573;

	@OriginalMember(owner = "client!hr", name = "I", descriptor = "[B")
	private static byte[] aByteArray34;

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "Lclient!va;")
	private static final Class199 aClass199_6 = new Class199(16);

	@OriginalMember(owner = "client!hr", name = "d", descriptor = "Lclient!wq;")
	public static final Class216 aClass216_21 = new Class216();

	@OriginalMember(owner = "client!hr", name = "e", descriptor = "I")
	public static int anInt1559 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!hr", name = "g", descriptor = "[B")
	private static final byte[] aByteArray29 = new byte[1];

	@OriginalMember(owner = "client!hr", name = "h", descriptor = "I")
	public static int anInt1560 = (int) (Math.random() * 11.0D) - 5;

	@OriginalMember(owner = "client!hr", name = "j", descriptor = "[S")
	private static final short[] aShortArray47 = new short[1];

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!ae;)V")
	public static void method1615(@OriginalArg(0) Class4 arg0) {
		@Pc(3) int local3 = anInt1562 - anInt1573;
		@Pc(7) int local7 = anInt1565 - anInt1569;
		@Pc(15) int local15 = (anInt1571 - anInt1563 << 16) / local3;
		@Pc(23) int local23 = (anInt1570 - anInt1572 << 16) / local7;
		method1629(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!tq;)V")
	public static void method1616(@OriginalArg(0) Class191 arg0) {
		aClass191_45 = arg0;
		aClass199_6.method5750();
		@Pc(9) int local9 = aClass191_45.method5446("details");
		@Pc(14) int[] local14 = aClass191_45.method5447(local9);
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(25) Class2_Sub11_Sub6 local25 = Static26.method742(local14[local16], local9, aClass191_45);
			aClass199_6.method5749(local25, (long) local25.anInt2448);
		}
		Static345.method841(false);
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!ae;II)V")
	public static void method1617(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class2_Sub10 local9 = new Class2_Sub10(aClass191_45.method5436(aClass2_Sub11_Sub6_2.aString23, "area"));
		@Pc(13) int local13 = local9.method4421();
		@Pc(16) int[] local16 = new int[local13];
		for (@Pc(18) int local18 = 0; local18 < local13; local18++) {
			local16[local18] = local9.method4421();
		}
		@Pc(33) int local33 = local9.method4421();
		@Pc(36) int[] local36 = new int[local33];
		for (@Pc(38) int local38 = 0; local38 < local33; local38++) {
			local36[local38] = local9.method4421();
		}
		while (true) {
			@Pc(58) int local58;
			@Pc(64) int local64;
			@Pc(67) int local67;
			@Pc(76) int local76;
			@Pc(148) int local148;
			while (local9.anInt4807 < local9.aByteArray57.length) {
				@Pc(62) int local62;
				@Pc(84) int local84;
				if (local9.method4421() == 0) {
					local58 = local9.method4421();
					local62 = local9.method4421();
					for (local64 = 0; local64 < 64; local64++) {
						for (local67 = 0; local67 < 64; local67++) {
							local76 = local58 * 64 + local64 - anInt1568;
							local84 = local62 * 64 + local67 - anInt1567;
							method1618(arg0, local9, local58, local62, local76, local84, local16, local36);
						}
					}
				} else {
					local58 = local9.method4421();
					local62 = local9.method4421();
					local64 = local9.method4421();
					local67 = local9.method4421();
					for (local76 = 0; local76 < 8; local76++) {
						for (local84 = 0; local84 < 8; local84++) {
							@Pc(136) int local136 = local58 * 64 + local64 * 8 + local76 - anInt1568;
							local148 = local62 * 64 + local67 * 8 + local84 - anInt1567;
							method1618(arg0, local9, local58, local62, local136, local148, local16, local36);
						}
					}
				}
			}
			aByteArray33 = new byte[anInt1564 * anInt1566];
			aShortArray48 = new short[anInt1564 * anInt1566];
			for (local58 = 0; local58 < 3; local58++) {
				@Pc(191) byte[] local191 = new byte[anInt1564 * anInt1566];
				for (local64 = 0; local64 < aClass67ArrayArrayArray2[local58].length; local64++) {
					for (local67 = 0; local67 < aClass67ArrayArrayArray2[local58][0].length; local67++) {
						@Pc(205) Class67 local205 = aClass67ArrayArrayArray2[local58][local64][local67];
						if (local205 != null) {
							for (@Pc(212) Class55_Sub1 local212 = (Class55_Sub1) local205.method2098(); local212 != null; local212 = (Class55_Sub1) local205.method2104()) {
								local191[local64 * 64 + local212.aByte16 + (local67 * 64 + local212.aByte14) * anInt1564] = (byte) local212.anInt1614;
							}
						}
					}
				}
				method1622(local191, aByteArray33, aShortArray48, arg1, arg2);
				for (local67 = 0; local67 < aClass67ArrayArrayArray2[local58].length; local67++) {
					for (local76 = 0; local76 < aClass67ArrayArrayArray2[local58][0].length; local76++) {
						@Pc(276) Class67 local276 = aClass67ArrayArrayArray2[local58][local67][local76];
						if (local276 != null) {
							for (@Pc(283) Class55_Sub1 local283 = (Class55_Sub1) local276.method2098(); local283 != null; local283 = (Class55_Sub1) local276.method2104()) {
								local148 = local67 * 64 + local283.aByte16 + (local76 * 64 + local283.aByte14) * anInt1564;
								local283.anInt1614 = (aByteArray33[local148] & 0xFF) << 16 | aShortArray48[local148] & 0xFFFF;
								if (local283.anInt1614 != 0) {
									local283.anInt1614 |= 0xFF000000;
								}
							}
						}
					}
				}
			}
			method1622(aByteArray30, aByteArray33, aShortArray48, arg1, arg2);
			aByteArray30 = null;
			method1623();
			return;
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!ae;Lclient!dg;IIII[I[I)V")
	private static void method1618(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class2_Sub10 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7) {
		@Pc(3) int local3 = arg1.method4421();
		if ((local3 & 0x1) == 0) {
			@Pc(15) boolean local15 = (local3 & 0x2) == 0;
			@Pc(21) int local21 = local3 >> 2 & 0x3F;
			if (local21 != 62) {
				if (local21 == 63) {
					local21 = arg1.method4421();
				} else if (local15) {
					local21 = arg6[local21];
				} else {
					local21 = arg7[local21];
				}
				if (local15) {
					aByteArray30[arg4 + arg5 * anInt1564] = (byte) local21;
					aByteArray32[arg4 + arg5 * anInt1564] = 0;
				} else {
					aByteArray32[arg4 + arg5 * anInt1564] = (byte) local21;
					aByteArray34[arg4 + arg5 * anInt1564] = 0;
					aByteArray30[arg4 + arg5 * anInt1564] = arg1.method4436();
				}
			}
			return;
		}
		@Pc(100) int local100 = (local3 >> 1 & 0x3) + 1;
		@Pc(108) boolean local108 = (local3 & 0x8) != 0;
		@Pc(116) boolean local116 = (local3 & 0x10) != 0;
		for (@Pc(118) int local118 = 0; local118 < local100; local118++) {
			@Pc(123) int local123 = arg1.method4421();
			@Pc(125) int local125 = 0;
			@Pc(127) int local127 = 0;
			if (local108) {
				local125 = arg1.method4421();
				local127 = arg1.method4421();
			}
			@Pc(139) int local139 = 0;
			if (local116) {
				local139 = arg1.method4421();
			}
			@Pc(215) short[] local215;
			@Pc(218) byte[] local218;
			@Pc(220) int local220;
			if (local118 == 0) {
				aByteArray30[arg4 + arg5 * anInt1564] = (byte) local123;
				aByteArray32[arg4 + arg5 * anInt1564] = (byte) local125;
				aByteArray34[arg4 + arg5 * anInt1564] = (byte) local127;
				if (local139 == 1) {
					aShortArray49[arg4 + arg5 * anInt1564] = (short) (arg1.method4464() + 1);
					aByteArray31[arg4 + arg5 * anInt1564] = arg1.method4436();
				} else if (local139 > 1) {
					aShortArray49[arg4 + arg5 * anInt1564] = -1;
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method4464();
						local218[local220] = arg1.method4436();
					}
					aClass199_7.method5749(new Class2_Sub25(local215, local218), (long) (arg4 << 16 | arg5));
				}
			} else {
				local215 = null;
				local218 = null;
				if (local139 > 0) {
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method4464();
						local218[local220] = arg1.method4436();
					}
				}
				if (aClass67ArrayArrayArray2[local118 - 1][arg2 - (anInt1568 >> 6)][arg3 - (anInt1567 >> 6)] == null) {
					aClass67ArrayArrayArray2[local118 - 1][arg2 - (anInt1568 >> 6)][arg3 - (anInt1567 >> 6)] = new Class67();
				}
				@Pc(338) Class55_Sub1 local338 = new Class55_Sub1(arg4 & 0x3F, arg5 & 0x3F, local123, local125, local127, local215, local218);
				aClass67ArrayArrayArray2[local118 - 1][arg2 - (anInt1568 >> 6)][arg3 - (anInt1567 >> 6)].method2100(local338);
			}
		}
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(Lclient!ae;)Lclient!wq;")
	public static Class216 method1619(@OriginalArg(0) Class4 arg0) {
		@Pc(3) int local3 = anInt1562 - anInt1573;
		@Pc(7) int local7 = anInt1565 - anInt1569;
		@Pc(15) int local15 = (anInt1571 - anInt1563 << 16) / local3;
		@Pc(23) int local23 = (anInt1570 - anInt1572 << 16) / local7;
		return method1626(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!ul;III)I")
	private static int method1621(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class150 local3 = Static19.method676(arg1);
		if (local3 == null) {
			return 0;
		}
		@Pc(10) int local10 = local3.anInt4545;
		if (local10 >= 0 && arg0.method5778(local10).aBoolean608) {
			local10 = -1;
		}
		@Pc(67) int local67;
		@Pc(26) int local26;
		@Pc(32) int local32;
		@Pc(54) int local54;
		if (local3.anInt4538 >= 0) {
			local26 = local3.anInt4538;
			local32 = (local26 & 0x7F) + arg3;
			if (local32 < 0) {
				local32 = 0;
			} else if (local32 > 127) {
				local32 = 127;
			}
			local54 = (local26 + arg2 & 0xFC00) + (local26 & 0x380) + local32;
			local67 = Static120.anIntArray232[Static39.method939(Static97.method5913(local54)) & 0xFFFF] | 0xFF000000;
		} else if (local10 >= 0) {
			local67 = Static120.anIntArray232[Static39.method939(Static97.method5913(arg0.method5778(local10).aShort92)) & 0xFFFF] | 0xFF000000;
		} else if (local3.anInt4535 == -1) {
			local67 = 0;
		} else {
			local26 = local3.anInt4535;
			local32 = (local26 & 0x7F) + arg3;
			if (local32 < 0) {
				local32 = 0;
			} else if (local32 > 127) {
				local32 = 127;
			}
			local54 = (local26 + arg2 & 0xFC00) + (local26 & 0x380) + local32;
			local67 = Static120.anIntArray232[Static39.method939(Static97.method5913(local54)) & 0xFFFF] | 0xFF000000;
		}
		return local67;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "([B[B[SII)V")
	private static void method1622(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int[] local2 = new int[anInt1566];
		@Pc(5) int[] local5 = new int[anInt1566];
		@Pc(8) int[] local8 = new int[anInt1566];
		@Pc(11) int[] local11 = new int[anInt1566];
		@Pc(14) int[] local14 = new int[anInt1566];
		for (@Pc(16) int local16 = -5; local16 < anInt1564; local16++) {
			@Pc(21) int local21 = local16 + 5;
			@Pc(25) int local25 = local16 - 5;
			@Pc(41) int local41;
			for (@Pc(27) int local27 = 0; local27 < anInt1566; local27++) {
				@Pc(49) Class39 local49;
				@Pc(85) int local85;
				if (local21 < anInt1564) {
					local41 = arg0[local21 + local27 * anInt1564] & 0xFF;
					if (local41 > 0) {
						local49 = Static247.method4480(local41 - 1);
						local2[local27] += local49.anInt1111;
						local5[local27] += local49.anInt1107;
						local8[local27] += local49.anInt1108;
						local11[local27] += local49.anInt1110;
						local85 = local14[local27]++;
					}
				}
				if (local25 >= 0) {
					local41 = arg0[local25 + local27 * anInt1564] & 0xFF;
					if (local41 > 0) {
						local49 = Static247.method4480(local41 - 1);
						local2[local27] -= local49.anInt1111;
						local5[local27] -= local49.anInt1107;
						local8[local27] -= local49.anInt1108;
						local11[local27] -= local49.anInt1110;
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
				for (@Pc(165) int local165 = -5; local165 < anInt1566; local165++) {
					@Pc(170) int local170 = local165 + 5;
					if (local170 < anInt1566) {
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
						if ((arg0[local16 + local165 * anInt1564] & 0xFF) == 0) {
							local259 = local16 + local165 * anInt1564;
							arg1[local259] = 0;
							arg2[local259] = 0;
						} else {
							local259 = local161 == 0 ? 0 : Static138.method2747(local41 * 256 / local161, local157 / local163, local159 / local163);
							@Pc(292) int local292 = (local259 & 0x7F) + arg4;
							if (local292 < 0) {
								local292 = 0;
							} else if (local292 > 127) {
								local292 = 127;
							}
							@Pc(314) int local314 = (local259 + arg3 & 0xFC00) + (local259 & 0x380) + local292;
							@Pc(320) int local320 = local16 + local165 * anInt1564;
							@Pc(331) int local331 = Static120.anIntArray232[Static39.method939(Static307.method5415(local314)) & 0xFFFF];
							arg1[local320] = (byte) (local331 >> 16 & 0xFF);
							arg2[local320] = (short) (local331 & 0xFFFF);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "()V")
	private static void method1623() {
		@Pc(4) int local4;
		@Pc(15) int local15;
		@Pc(48) int local48;
		for (@Pc(1) int local1 = 0; local1 < anInt1564; local1++) {
			for (local4 = 0; local4 < anInt1566; local4++) {
				local15 = aShortArray49[local1 + local4 * anInt1564] & 0xFFFF;
				if (local15 != 0) {
					@Pc(35) int local35;
					if (local15 == 65535) {
						@Pc(31) Class2_Sub25 local31 = (Class2_Sub25) aClass199_7.method5751((long) (local1 << 16 | local4));
						if (local31 != null) {
							for (local35 = 0; local35 < local31.aShortArray56.length; local35++) {
								@Pc(45) Class96 local45 = Static234.method4051(local31.aShortArray56[local35] & 0xFFFF);
								local48 = local45.anInt3127;
								if (local45.anIntArray259 != null) {
									local45 = local45.method2944();
									if (local45 != null) {
										local48 = local45.anInt3127;
									}
								}
								if (local48 != -1) {
									@Pc(68) Class2_Sub31 local68 = new Class2_Sub31(local48);
									local68.anInt4063 = local1;
									local68.anInt4059 = local4;
									aClass216_21.method5995(local68);
								}
							}
						}
					} else {
						@Pc(91) Class96 local91 = Static234.method4051(local15 - 1);
						local35 = local91.anInt3127;
						if (local91.anIntArray259 != null) {
							local91 = local91.method2944();
							if (local91 != null) {
								local35 = local91.anInt3127;
							}
						}
						if (local35 != -1) {
							@Pc(114) Class2_Sub31 local114 = new Class2_Sub31(local35);
							local114.anInt4063 = local1;
							local114.anInt4059 = local4;
							aClass216_21.method5995(local114);
						}
					}
				}
			}
		}
		for (local4 = 0; local4 < 3; local4++) {
			for (local15 = 0; local15 < aClass67ArrayArrayArray2[0].length; local15++) {
				for (@Pc(140) int local140 = 0; local140 < aClass67ArrayArrayArray2[0][0].length; local140++) {
					@Pc(149) Class67 local149 = aClass67ArrayArrayArray2[local4][local15][local140];
					if (local149 != null) {
						for (@Pc(156) Class55_Sub1 local156 = (Class55_Sub1) local149.method2098(); local156 != null; local156 = (Class55_Sub1) local149.method2104()) {
							if (local156.aShortArray51 != null) {
								for (local48 = 0; local48 < local156.aShortArray51.length; local48++) {
									@Pc(172) Class96 local172 = Static234.method4051(local156.aShortArray51[local48] & 0xFFFF);
									@Pc(175) int local175 = local172.anInt3127;
									if (local172.anIntArray259 != null) {
										local172 = local172.method2944();
										if (local172 != null) {
											local175 = local172.anInt3127;
										}
									}
									if (local175 != -1) {
										@Pc(195) Class2_Sub31 local195 = new Class2_Sub31(local175);
										local195.anInt4063 = (local15 + (anInt1568 >> 6)) * 64 + local156.aByte16 - anInt1568;
										local195.anInt4059 = (local140 + (anInt1567 >> 6)) * 64 + local156.aByte14 - anInt1567;
										aClass216_21.method5995(local195);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)V")
	public static void method1624(@OriginalArg(0) int arg0) {
		aClass2_Sub11_Sub6_2 = (Class2_Sub11_Sub6) aClass199_6.method5751((long) arg0);
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!ae;IIII[S[B)V")
	private static void method1625(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		if (arg5 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < arg5.length; local4++) {
			@Pc(13) Class96 local13 = Static234.method4051(arg5[local4] & 0xFFFF);
			@Pc(16) int local16 = local13.anInt3159;
			if (local16 != -1) {
				@Pc(23) Class182 local23 = Static77.method1775(local16);
				@Pc(47) Class31 local47 = local23.method5127(local13.aBoolean275 ? local13.aBoolean278 : false, arg0, local13.aBoolean273 ? arg6[local4] >> 6 & 0x3 : 0);
				if (local47 != null) {
					@Pc(56) int local56 = arg3 * local47.method4376() >> 2;
					@Pc(63) int local63 = arg4 * local47.method4378() >> 2;
					if (local23.aBoolean516) {
						@Pc(69) int local69 = local13.anInt3120;
						@Pc(72) int local72 = local13.anInt3135;
						if ((arg6[local4] >> 6 & 0x1) == 1) {
							@Pc(83) int local83 = local69;
							local69 = local72;
							local72 = local83;
						}
						local56 = local69 * arg3;
						local63 = local72 * arg4;
					}
					if (local56 != 0 && local63 != 0) {
						if (local23.anInt5811 == 0) {
							local47.method4390(arg1, arg2 + arg4 - local63, local56, local63);
						} else {
							local47.method4391(arg1, arg2 + arg4 - local63, local56, local63, 1, local23.anInt5811 | 0xFF000000, 1);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!ae;IIII)Lclient!wq;")
	private static Class216 method1626(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(4) Class2_Sub31 local4 = (Class2_Sub31) aClass216_21.method5992(); local4 != null; local4 = (Class2_Sub31) aClass216_21.method6000()) {
			method1627(arg0, local4, arg1, arg2);
		}
		return aClass216_21;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!ae;Lclient!nd;IIII)V")
	private static void method1627(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class2_Sub31 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		arg1.anInt4060 = anInt1563 + (arg2 * (arg1.anInt4063 - anInt1573) >> 16);
		arg1.anInt4064 = anInt1570 - (arg3 * (arg1.anInt4059 - anInt1569) >> 16);
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!ul;II)V")
	public static void method1628(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static282.anInt5704; local1++) {
			anIntArray159[local1 + 1] = method1621(arg0, local1, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(Lclient!ae;IIII)V")
	private static void method1629(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = anInt1562 - anInt1573;
		@Pc(7) int local7 = anInt1565 - anInt1569;
		if (anInt1562 < anInt1564) {
			local3++;
		}
		if (anInt1565 < anInt1566) {
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
			local28 = (arg1 * local17 >> 16) + anInt1563;
			local40 = (arg1 * (local17 + 1) >> 16) + anInt1563;
			local44 = local40 - local28;
			if (local44 > 0) {
				local50 = anInt1573 + local17;
				if (local50 >= 0 && local50 < anInt1564) {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt1570 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt1570 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (local84 > 0) {
							local93 = local57 + anInt1569;
							local172 = local50 + local93 * anInt1564;
							local174 = 0;
							local176 = 0;
							local178 = 0;
							if (local93 >= 0 && local93 < anInt1566) {
								local174 = (aByteArray33[local172] & 0xFF) << 16 | aShortArray48[local172] & 0xFFFF;
								if (local174 != 0) {
									local174 |= 0xFF000000;
								}
								local176 = aByteArray32[local172] & 0xFF;
								local178 = aShortArray49[local172] & 0xFFFF;
							}
							if (local174 == 0 && local176 == 0 && local178 == 0) {
								if (aClass2_Sub11_Sub6_2.anInt2435 != -1) {
									local174 = aClass2_Sub11_Sub6_2.anInt2435 | 0xFF000000;
								} else if ((local17 + anInt1573 & 0x4) == (local57 + anInt1565 & 0x4)) {
									local174 = anIntArray159[Static15.anInt381 + 1];
								} else {
									local174 = -11840664;
								}
								if (local174 == 0) {
									local174 = -16777216;
								}
								arg0.method4246(local28, local70, local44, local84, local174, 0);
							} else if (local178 <= 0) {
								method1636(arg0, local28, local70, local44, local84, local174, local176, aByteArray34[local172], null, null, true);
							} else if (local178 == 65535) {
								@Pc(280) Class2_Sub25 local280 = (Class2_Sub25) aClass199_7.method5751((long) (local50 << 16 | local93));
								if (local280 != null) {
									method1636(arg0, local28, local70, local44, local84, local174, local176, aByteArray34[local172], local280.aShortArray56, local280.aByteArray45, true);
								}
							} else {
								aShortArray47[0] = (short) (local178 - 1);
								aByteArray29[0] = aByteArray31[local172];
								method1636(arg0, local28, local70, local44, local84, local174, local176, aByteArray34[local172], aShortArray47, aByteArray29, true);
							}
						}
					}
				} else {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt1570 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt1570 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (aClass2_Sub11_Sub6_2.anInt2435 != -1) {
							local93 = aClass2_Sub11_Sub6_2.anInt2435 | 0xFF000000;
						} else if ((local17 + anInt1573 & 0x4) == (local57 + anInt1565 & 0x4)) {
							local93 = anIntArray159[Static15.anInt381 + 1];
						} else {
							local93 = -11840664;
						}
						if (local93 == 0) {
							local93 = -16777216;
						}
						arg0.method4246(local28, local70, local44, local84, local93, 0);
					}
				}
			}
		}
		for (local28 = -16; local28 < local3 + 16; local28++) {
			local40 = (arg1 * local28 >> 16) + anInt1563;
			local44 = (arg1 * (local28 + 1) >> 16) + anInt1563;
			local50 = local44 - local40;
			if (local50 > 0) {
				local57 = local28 + anInt1573;
				if (local57 >= 0 && local57 < anInt1564) {
					for (local70 = -16; local70 < local7 + 16; local70++) {
						local80 = anInt1570 - (arg2 * (local70 + 1) >> 16);
						local84 = anInt1570 - (arg2 * local70 >> 16);
						local93 = local84 - local80;
						if (local93 > 0) {
							local172 = local70 + anInt1569;
							if (local172 >= 0 && local172 < anInt1566) {
								local174 = aShortArray49[local57 + local172 * anInt1564] & 0xFFFF;
								if (local174 <= 0) {
									method1625(arg0, local40, local80, local50, local93, null, null);
								} else if (local174 == 65535) {
									@Pc(457) Class2_Sub25 local457 = (Class2_Sub25) aClass199_7.method5751((long) (local57 << 16 | local172));
									if (local457 != null) {
										method1625(arg0, local40, local80, local50, local93, local457.aShortArray56, local457.aByteArray45);
									}
								} else {
									aShortArray47[0] = (short) (local174 - 1);
									aByteArray29[0] = aByteArray31[local57 + local172 * anInt1564];
									method1625(arg0, local40, local80, local50, local93, aShortArray47, aByteArray29);
								}
							}
						}
					}
				}
			}
		}
		local40 = anInt1573 >> 6;
		local44 = anInt1569 >> 6;
		if (local40 < 0) {
			local40 = 0;
		}
		if (local44 < 0) {
			local44 = 0;
		}
		local50 = anInt1562 >> 6;
		local57 = anInt1565 >> 6;
		if (local50 >= aClass67ArrayArrayArray2[0].length) {
			local50 = aClass67ArrayArrayArray2[0].length - 1;
		}
		if (local57 >= aClass67ArrayArrayArray2[0][0].length) {
			local57 = aClass67ArrayArrayArray2[0][0].length - 1;
		}
		for (local70 = 0; local70 < 3; local70++) {
			@Pc(639) int local639;
			@Pc(651) int local651;
			@Pc(663) int local663;
			@Pc(673) int local673;
			@Pc(629) int local629;
			for (local80 = local40; local80 <= local50; local80++) {
				for (local84 = local44; local84 <= local57; local84++) {
					@Pc(587) Class67 local587 = aClass67ArrayArrayArray2[local70][local80][local84];
					if (local587 != null) {
						local172 = (local80 + (anInt1568 >> 6)) * 64;
						local174 = (local84 + (anInt1567 >> 6)) * 64;
						for (@Pc(610) Class55_Sub1 local610 = (Class55_Sub1) local587.method2098(); local610 != null; local610 = (Class55_Sub1) local587.method2104()) {
							local178 = local172 + local610.aByte16 - anInt1568 - anInt1573;
							local629 = local174 + local610.aByte14 - anInt1567 - anInt1569;
							local639 = (arg1 * local178 >> 16) + anInt1563;
							local651 = (arg1 * (local178 + 1) >> 16) + anInt1563;
							local663 = anInt1570 - (arg2 * (local629 + 1) >> 16);
							local673 = anInt1570 - (arg2 * local629 >> 16);
							method1636(arg0, local639, local663, local651 - local639, local673 - local663, local610.anInt1614, local610.aByte15 & 0xFF, local610.aByte13, local610.aShortArray51, local610.aByteArray35, false);
						}
					}
				}
			}
			for (local84 = local40; local84 <= local50; local84++) {
				for (local93 = local44; local93 <= local57; local93++) {
					@Pc(725) Class67 local725 = aClass67ArrayArrayArray2[local70][local84][local93];
					if (local725 != null) {
						local174 = (local84 + (anInt1568 >> 6)) * 64;
						local176 = (local93 + (anInt1567 >> 6)) * 64;
						for (@Pc(748) Class55_Sub1 local748 = (Class55_Sub1) local725.method2098(); local748 != null; local748 = (Class55_Sub1) local725.method2104()) {
							local629 = local174 + local748.aByte16 - anInt1568 - anInt1573;
							local639 = local176 + local748.aByte14 - anInt1567 - anInt1569;
							local651 = (arg1 * local629 >> 16) + anInt1563;
							local663 = (arg1 * (local629 + 1) >> 16) + anInt1563;
							local673 = anInt1570 - (arg2 * (local639 + 1) >> 16);
							@Pc(811) int local811 = anInt1570 - (arg2 * local639 >> 16);
							method1625(arg0, local651, local673, local663 - local651, local811 - local673, local748.aShortArray51, local748.aByteArray35);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1630(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		anInt1573 = arg0 - anInt1568;
		anInt1565 = arg1 - anInt1567;
		anInt1562 = arg2 - anInt1568;
		anInt1569 = arg3 - anInt1567;
		anInt1563 = arg4;
		anInt1572 = arg5;
		anInt1571 = arg6;
		anInt1570 = arg7;
	}

	@OriginalMember(owner = "client!hr", name = "c", descriptor = "()V")
	public static void method1631() {
		aByteArray30 = new byte[anInt1564 * anInt1566];
		aByteArray32 = new byte[anInt1564 * anInt1566];
		aByteArray34 = new byte[anInt1564 * anInt1566];
		aShortArray49 = new short[anInt1564 * anInt1566];
		aByteArray31 = new byte[anInt1564 * anInt1566];
		aClass199_7 = new Class199(1024);
		aClass67ArrayArrayArray2 = new Class67[3][anInt1564 >> 6][anInt1566 >> 6];
		anIntArray159 = new int[Static282.anInt5704 + 1];
	}

	@OriginalMember(owner = "client!hr", name = "d", descriptor = "()V")
	public static void method1632() {
		@Pc(2) int[] local2 = new int[3];
		for (@Pc(4) int local4 = 0; local4 < aClass142_2.anInt4249; local4++) {
			@Pc(32) boolean local32 = aClass2_Sub11_Sub6_2.method2389(aClass142_2.anIntArray334[local4] & 0x3FFF, aClass142_2.anIntArray334[local4] >> 14 & 0x3FFF, aClass142_2.anIntArray334[local4] >> 28 & 0x3, local2);
			if (local32) {
				@Pc(42) Class2_Sub31 local42 = new Class2_Sub31(aClass142_2.anIntArray335[local4]);
				local42.anInt4063 = local2[1] - anInt1568;
				local42.anInt4059 = local2[2] - anInt1567;
				aClass216_21.method5995(local42);
			}
		}
	}

	@OriginalMember(owner = "client!hr", name = "e", descriptor = "()V")
	public static void method1633() {
		aByteArray30 = null;
		aByteArray33 = null;
		aShortArray48 = null;
		aByteArray32 = null;
		aByteArray34 = null;
		aShortArray49 = null;
		aByteArray31 = null;
		aClass199_7 = null;
		aClass67ArrayArrayArray2 = null;
		anIntArray159 = null;
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(I)Lclient!gq;")
	public static Class2_Sub11_Sub6 method1634(@OriginalArg(0) int arg0) {
		return (Class2_Sub11_Sub6) aClass199_6.method5751((long) arg0);
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(II)Lclient!ek;")
	public static Class54 method1635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class54 local3 = new Class54();
		for (@Pc(8) Class2_Sub11_Sub6 local8 = (Class2_Sub11_Sub6) aClass199_6.method5747(); local8 != null; local8 = (Class2_Sub11_Sub6) aClass199_6.method5753()) {
			if (local8.aBoolean213 && local8.method2386(arg0, arg1)) {
				local3.method1662(local8);
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!ae;IIIIIII[S[BZ)V")
	private static void method1636(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) byte[] arg9, @OriginalArg(10) boolean arg10) {
		@Pc(20) int local20;
		@Pc(32) int local32;
		if (arg10 || arg5 != 0 || arg6 > 0) {
			if (arg6 == 0) {
				arg0.method4246(arg1, arg2, arg3, arg4, arg5, 0);
			} else {
				local20 = arg7 & 0x3F;
				if (local20 == 0 || arg3 <= 1 || arg4 <= 1) {
					local32 = anIntArray159[arg6];
					if (arg10 || local32 != 0) {
						arg0.method4246(arg1, arg2, arg3, arg4, local32, 0);
					}
				} else {
					local32 = arg10 ? 0 : 1;
					Static315.method5545(arg5, anInt1561, local32, arg1, arg4, anIntArray159[arg6], local20, arg0, aByteArrayArrayArray5, arg7 >> 6 & 0x3, arg2, arg3);
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
				@Pc(126) Class96 local126 = Static234.method4051(arg8[local100] & 0xFFFF);
				if (local126.anInt3159 == -1) {
					@Pc(132) int local132 = -3355444;
					if (local126.anInt3115 == 1) {
						local132 = -3407872;
					}
					@Pc(146) int local146 = arg9[local100] >> 6 & 0x3;
					if (local107 == 0) {
						if (local146 == 0) {
							arg0.method4251(arg1, arg2, arg4, local132, 0);
						} else if (local146 == 1) {
							arg0.method4289(arg1, arg2, arg3, local132, 0);
						} else if (local146 == 2) {
							arg0.method4251(local20, arg2, arg4, local132, 0);
						} else {
							arg0.method4289(arg1, local32, arg3, local132, 0);
						}
					} else if (local107 == 2) {
						if (local146 == 0) {
							arg0.method4251(arg1, arg2, arg4, -1, 0);
							arg0.method4289(arg1, arg2, arg3, local132, 0);
						} else if (local146 == 1) {
							arg0.method4251(local20, arg2, arg4, -1, 0);
							arg0.method4289(arg1, arg2, arg3, local132, 0);
						} else if (local146 == 2) {
							arg0.method4251(local20, arg2, arg4, -1, 0);
							arg0.method4289(arg1, local32, arg3, local132, 0);
						} else {
							arg0.method4251(arg1, arg2, arg4, -1, 0);
							arg0.method4289(arg1, local32, arg3, local132, 0);
						}
					} else if (local107 == 3) {
						if (local146 == 0) {
							arg0.method4289(arg1, arg2, 1, local132, 0);
						} else if (local146 == 1) {
							arg0.method4289(local20, arg2, 1, local132, 0);
						} else if (local146 == 2) {
							arg0.method4289(local20, local32, 1, local132, 0);
						} else {
							arg0.method4289(arg1, local32, 1, local132, 0);
						}
					} else if (local107 == 9) {
						@Pc(312) int local312;
						if (local146 == 0 || local146 == 2) {
							for (local312 = 0; local312 < arg4; local312++) {
								arg0.method4289(arg1 + local312, local32 - local312, 1, local132, 0);
							}
						} else {
							for (local312 = 0; local312 < arg4; local312++) {
								arg0.method4289(arg1 + local312, arg2 + local312, 1, local132, 0);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(II)Lclient!gq;")
	public static Class2_Sub11_Sub6 method1637(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(4) Class2_Sub11_Sub6 local4 = (Class2_Sub11_Sub6) aClass199_6.method5747(); local4 != null; local4 = (Class2_Sub11_Sub6) aClass199_6.method5753()) {
			if (local4.aBoolean213 && local4.method2386(arg0, arg1)) {
				return local4;
			}
		}
		return null;
	}
}
