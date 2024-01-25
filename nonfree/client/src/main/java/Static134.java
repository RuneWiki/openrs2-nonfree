import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "Lclient!cw;")
	public static Class68 aClass68_1;

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
	public static int anInt2161;

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "[I")
	public static final int[] anIntArray181 = new int[13];

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
	public static int anInt2158 = 0;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)Z")
	public static boolean method1812(@OriginalArg(1) int arg0) {
		return arg0 != 1 && arg0 != 7;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BII)V")
	public static void method1813(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static453.method5906(arg1)) {
			Static427.method5676(arg0, Static509.aClass273ArrayArray2[arg1]);
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/lang/String;ZLclient!mv;B)Lclient!lp;")
	public static Class214 method1814(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class229 arg2) {
		@Pc(10) int local10 = arg2.method4955(arg0);
		if (local10 == -1) {
			return new Class214(0);
		}
		@Pc(29) int[] local29 = arg2.method4982(local10);
		@Pc(35) Class214 local35 = new Class214(local29.length);
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		while (true) {
			while (local35.anInt5134 > local37) {
				@Pc(53) Class2_Sub7 local53 = new Class2_Sub7(arg2.method4980(local10, local29[local39++]));
				@Pc(57) int local57 = local53.method4509();
				@Pc(61) int local61 = local53.method4518();
				@Pc(65) int local65 = local53.method4464();
				if (!arg1 && local65 == 1) {
					local35.anInt5134--;
				} else {
					local35.anIntArray357[local37] = local57;
					local35.anIntArray356[local37] = local61;
					local37++;
				}
			}
			return local35;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(CB)Z")
	public static boolean method1815(@OriginalArg(0) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(29) char[] local29 = Static279.aCharArray4;
			for (@Pc(31) int local31 = 0; local31 < local29.length; local31++) {
				@Pc(37) char local37 = local29[local31];
				if (arg0 == local37) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)Lclient!oda;")
	public static Class2_Sub34 method1816() {
		return Static101.anInt1807 == 0 ? new Class2_Sub34() : Static386.aClass2_Sub34Array1[--Static101.anInt1807];
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)Lclient!wj;")
	public static Class12_Sub10 method1817() {
		@Pc(15) Class12_Sub10 local15 = (Class12_Sub10) Static61.aClass220_2.method4662();
		if (local15 == null) {
			return new Class12_Sub10();
		} else {
			Static254.anInt7144--;
			return local15;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIIIIIIILclient!wg;)Z")
	public static boolean method1818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class362 arg10) {
		@Pc(7) int local7 = arg7;
		@Pc(9) int local9 = arg9;
		@Pc(18) int local18 = arg7 - 64;
		Static473.anIntArrayArray51[64][64] = 99;
		@Pc(29) int local29 = arg9 - 64;
		Static481.anIntArrayArray53[64][64] = 0;
		@Pc(37) byte local37 = 0;
		Static252.anIntArray303[0] = arg7;
		@Pc(43) int local43 = 0;
		@Pc(46) int local46 = local37 + 1;
		Static233.anIntArray284[0] = arg9;
		@Pc(51) int[][] local51 = arg10.anIntArrayArray64;
		while (true) {
			label282: while (true) {
				@Pc(65) int local65;
				@Pc(76) int local76;
				@Pc(81) int local81;
				@Pc(86) int local86;
				@Pc(233) int local233;
				@Pc(276) int local276;
				do {
					do {
						do {
							label259: do {
								if (local46 == local43) {
									Static540.anInt8913 = local9;
									Static71.anInt4965 = local7;
									return false;
								}
								local9 = Static233.anIntArray284[local43];
								local7 = Static252.anIntArray303[local43];
								local65 = local7 - local18;
								local43 = local43 + 1 & 0xFFF;
								local76 = local9 - local29;
								local81 = local7 - arg10.anInt9517;
								local86 = local9 - arg10.anInt9521;
								if (arg1 == -4) {
									if (arg0 == local7 && local9 == arg4) {
										Static540.anInt8913 = local9;
										Static71.anInt4965 = local7;
										return true;
									}
								} else if (arg1 == -3) {
									if (Static570.method7437(local7, arg2, arg2, arg4, arg3, arg0, local9, arg6)) {
										Static71.anInt4965 = local7;
										Static540.anInt8913 = local9;
										return true;
									}
								} else if (arg1 == -2) {
									if (arg10.method7599(arg2, local7, arg0, local9, arg6, arg3, arg4, arg2, arg5)) {
										Static540.anInt8913 = local9;
										Static71.anInt4965 = local7;
										return true;
									}
								} else if (arg1 == -1) {
									if (arg10.method7600(arg5, local7, arg0, arg6, arg4, arg2, arg3, local9)) {
										Static540.anInt8913 = local9;
										Static71.anInt4965 = local7;
										return true;
									}
								} else if (arg1 == 0 || arg1 == 1 || arg1 == 2 || arg1 == 3 || arg1 == 9) {
									if (arg10.method7594(arg2, arg8, arg0, local9, arg1, arg4, local7)) {
										Static71.anInt4965 = local7;
										Static540.anInt8913 = local9;
										return true;
									}
								} else if (arg10.method7598(local9, local7, arg8, arg4, arg0, arg1, arg2)) {
									Static540.anInt8913 = local9;
									Static71.anInt4965 = local7;
									return true;
								}
								local233 = Static481.anIntArrayArray53[local65][local76] + 1;
								if (local65 > 0 && Static473.anIntArrayArray51[local65 - 1][local76] == 0 && (local51[local81 - 1][local86] & 0x43A40000) == 0 && (local51[local81 - 1][local86 + arg2 - 1] & 0x4E240000) == 0) {
									local276 = 1;
									while (true) {
										if (arg2 - 1 <= local276) {
											Static252.anIntArray303[local46] = local7 - 1;
											Static233.anIntArray284[local46] = local9;
											local46 = local46 + 1 & 0xFFF;
											Static473.anIntArrayArray51[local65 - 1][local76] = 2;
											Static481.anIntArrayArray53[local65 - 1][local76] = local233;
											break;
										}
										if ((local51[local81 - 1][local86 + local276] & 0x4FA40000) != 0) {
											break;
										}
										local276++;
									}
								}
								if (local65 < 128 - arg2 && Static473.anIntArrayArray51[local65 + 1][local76] == 0 && (local51[arg2 + local81][local86] & 0x60E40000) == 0 && (local51[local81 + arg2][arg2 + local86 - 1] & 0x78240000) == 0) {
									local276 = 1;
									while (true) {
										if (local276 >= arg2 - 1) {
											Static252.anIntArray303[local46] = local7 + 1;
											Static233.anIntArray284[local46] = local9;
											local46 = local46 + 1 & 0xFFF;
											Static473.anIntArrayArray51[local65 + 1][local76] = 8;
											Static481.anIntArrayArray53[local65 + 1][local76] = local233;
											break;
										}
										if ((local51[local81 + arg2][local86 + local276] & 0x78E40000) != 0) {
											break;
										}
										local276++;
									}
								}
								if (local76 > 0 && Static473.anIntArrayArray51[local65][local76 - 1] == 0 && (local51[local81][local86 - 1] & 0x43A40000) == 0 && (local51[local81 + arg2 - 1][local86 - 1] & 0x60E40000) == 0) {
									local276 = 1;
									while (true) {
										if (local276 >= arg2 - 1) {
											Static252.anIntArray303[local46] = local7;
											Static233.anIntArray284[local46] = local9 - 1;
											Static473.anIntArrayArray51[local65][local76 - 1] = 1;
											local46 = local46 + 1 & 0xFFF;
											Static481.anIntArrayArray53[local65][local76 - 1] = local233;
											break;
										}
										if ((local51[local276 + local81][local86 - 1] & 0x63E40000) != 0) {
											break;
										}
										local276++;
									}
								}
								if (128 - arg2 > local76 && Static473.anIntArrayArray51[local65][local76 + 1] == 0 && (local51[local81][local86 + arg2] & 0x4E240000) == 0 && (local51[local81 + arg2 - 1][arg2 + local86] & 0x78240000) == 0) {
									local276 = 1;
									while (true) {
										if (arg2 - 1 <= local276) {
											Static252.anIntArray303[local46] = local7;
											Static233.anIntArray284[local46] = local9 + 1;
											Static473.anIntArrayArray51[local65][local76 + 1] = 4;
											local46 = local46 + 1 & 0xFFF;
											Static481.anIntArrayArray53[local65][local76 + 1] = local233;
											break;
										}
										if ((local51[local276 + local81][local86 + arg2] & 0x7E240000) != 0) {
											break;
										}
										local276++;
									}
								}
								if (local65 > 0 && local76 > 0 && Static473.anIntArrayArray51[local65 - 1][local76 - 1] == 0 && (local51[local81 - 1][local86 - 1] & 0x43A40000) == 0) {
									local276 = 1;
									while (true) {
										if (local276 >= arg2) {
											Static252.anIntArray303[local46] = local7 - 1;
											Static233.anIntArray284[local46] = local9 - 1;
											local46 = local46 + 1 & 0xFFF;
											Static473.anIntArrayArray51[local65 - 1][local76 - 1] = 3;
											Static481.anIntArrayArray53[local65 - 1][local76 - 1] = local233;
											break;
										}
										if ((local51[local81 - 1][local276 + local86 - 1] & 0x4FA40000) != 0 || (local51[local276 + local81 - 1][local86 - 1] & 0x63E40000) != 0) {
											break;
										}
										local276++;
									}
								}
								if (128 - arg2 > local65 && local76 > 0 && Static473.anIntArrayArray51[local65 + 1][local76 - 1] == 0 && (local51[arg2 + local81][local86 - 1] & 0x60E40000) == 0) {
									local276 = 1;
									while (true) {
										if (arg2 <= local276) {
											Static252.anIntArray303[local46] = local7 + 1;
											Static233.anIntArray284[local46] = local9 - 1;
											Static473.anIntArrayArray51[local65 + 1][local76 - 1] = 9;
											local46 = local46 + 1 & 0xFFF;
											Static481.anIntArrayArray53[local65 + 1][local76 - 1] = local233;
											break;
										}
										if ((local51[local81 + arg2][local86 + local276 - 1] & 0x78E40000) != 0 || (local51[local276 + local81][local86 - 1] & 0x63E40000) != 0) {
											break;
										}
										local276++;
									}
								}
								if (local65 > 0 && local76 < 128 - arg2 && Static473.anIntArrayArray51[local65 - 1][local76 + 1] == 0 && (local51[local81 - 1][local86 + arg2] & 0x4E240000) == 0) {
									for (local276 = 1; local276 < arg2; local276++) {
										if ((local51[local81 - 1][local276 + local86] & 0x4FA40000) != 0 || (local51[local81 + local276 - 1][arg2 + local86] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static252.anIntArray303[local46] = local7 - 1;
									Static233.anIntArray284[local46] = local9 + 1;
									local46 = local46 + 1 & 0xFFF;
									Static473.anIntArrayArray51[local65 - 1][local76 + 1] = 6;
									Static481.anIntArrayArray53[local65 - 1][local76 + 1] = local233;
								}
							} while (local65 >= 128 - arg2);
						} while (local76 >= 128 - arg2);
					} while (Static473.anIntArrayArray51[local65 + 1][local76 + 1] != 0);
				} while ((local51[local81 + arg2][arg2 + local86] & 0x78240000) != 0);
				for (local276 = 1; local276 < arg2; local276++) {
					if ((local51[local81 + local276][arg2 + local86] & 0x7E240000) != 0 || (local51[arg2 + local81][local276 + local86] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static252.anIntArray303[local46] = local7 + 1;
				Static233.anIntArray284[local46] = local9 + 1;
				Static473.anIntArrayArray51[local65 + 1][local76 + 1] = 12;
				local46 = local46 + 1 & 0xFFF;
				Static481.anIntArrayArray53[local65 + 1][local76 + 1] = local233;
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!r;I)V")
	public static void method1820(@OriginalArg(0) Class162 arg0) {
		if (Static321.aBoolean428) {
			Static460.method5968(arg0);
		} else {
			Static430.method5685(arg0);
		}
	}
}
