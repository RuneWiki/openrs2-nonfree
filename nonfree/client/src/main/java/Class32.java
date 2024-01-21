import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!pc")
public final class Class32 {

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
	private static int anInt850;

	@OriginalMember(owner = "client!pc", name = "l", descriptor = "Z")
	private static boolean aBoolean175;

	@OriginalMember(owner = "client!pc", name = "m", descriptor = "[I")
	private static int[] anIntArray222;

	@OriginalMember(owner = "client!pc", name = "n", descriptor = "[[C")
	private static char[][] aCharArrayArray1;

	@OriginalMember(owner = "client!pc", name = "o", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!pc", name = "p", descriptor = "[[C")
	private static char[][] aCharArrayArray2;

	@OriginalMember(owner = "client!pc", name = "q", descriptor = "[[C")
	private static char[][] aCharArrayArray3;

	@OriginalMember(owner = "client!pc", name = "r", descriptor = "[I")
	private static int[] anIntArray223;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
	private static int anInt846 = 353;

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
	private static int anInt847 = 353;

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "Z")
	private static boolean aBoolean173 = true;

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "B")
	private static byte aByte22 = 4;

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "B")
	private static byte aByte23 = 4;

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "B")
	private static byte aByte24 = 72;

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
	private static int anInt848 = -133;

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "I")
	private static int anInt849 = -150;

	@OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
	private static int anInt851 = 16953;

	@OriginalMember(owner = "client!pc", name = "s", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray11 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet" };

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!yb;)V")
	public static void method502(@OriginalArg(0) Class45 arg0) {
		@Pc(10) Class1_Sub1_Sub3 local10 = new Class1_Sub1_Sub3(699, arg0.method639("fragmentsenc.txt", null));
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(699, arg0.method639("badenc.txt", null));
		@Pc(28) Class1_Sub1_Sub3 local28 = new Class1_Sub1_Sub3(699, arg0.method639("domainenc.txt", null));
		@Pc(37) Class1_Sub1_Sub3 local37 = new Class1_Sub1_Sub3(699, arg0.method639("tldlist.txt", null));
		method503(local10, local19, local28, local37);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!mb;Lclient!mb;Lclient!mb;Lclient!mb;)V")
	private static void method503(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) Class1_Sub1_Sub3 arg2, @OriginalArg(3) Class1_Sub1_Sub3 arg3) {
		method505(arg1);
		method506(arg2);
		method507(arg0);
		method504((byte) 4, arg3);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLclient!mb;)V")
	private static void method504(@OriginalArg(0) byte arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			@Pc(4) int local4 = arg1.method472();
			@Pc(9) boolean local9 = false;
			aCharArrayArray3 = new char[local4][];
			anIntArray223 = new int[local4];
			for (@Pc(21) int local21 = 0; local21 < local4; local21++) {
				anIntArray223[local21] = arg1.method467();
				@Pc(32) char[] local32 = new char[arg1.method467()];
				for (@Pc(34) int local34 = 0; local34 < local32.length; local34++) {
					local32[local34] = (char) arg1.method467();
				}
				aCharArrayArray3[local21] = local32;
			}
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("74370, " + arg0 + ", " + arg1 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!mb;B)V")
	private static void method505(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(2) int local2 = arg0.method472();
			aCharArrayArray1 = new char[local2][];
			aByteArrayArrayArray8 = new byte[local2][][];
			method508(aCharArrayArray1, arg0, aByteArrayArrayArray8);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("44611, " + arg0 + ", " + 5 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!mb;I)V")
	private static void method506(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(2) int local2 = arg0.method472();
			aCharArrayArray2 = new char[local2][];
			method509(arg0, aCharArrayArray2);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("71231, " + arg0 + ", " + 0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILclient!mb;)V")
	private static void method507(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			anIntArray222 = new int[arg0.method472()];
			for (@Pc(5) int local5 = 0; local5 < anIntArray222.length; local5++) {
				anIntArray222[local5] = arg0.method469();
			}
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("60033, " + 5631 + ", " + arg0 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "([[CZLclient!mb;[[[B)V")
	private static void method508(@OriginalArg(0) char[][] arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1, @OriginalArg(3) byte[][][] arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
				@Pc(9) char[] local9 = new char[arg1.method467()];
				for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
					local9[local11] = (char) arg1.method467();
				}
				arg0[local3] = local9;
				@Pc(33) byte[][] local33 = new byte[arg1.method467()][2];
				for (@Pc(35) int local35 = 0; local35 < local33.length; local35++) {
					local33[local35][0] = (byte) arg1.method467();
					local33[local35][1] = (byte) arg1.method467();
				}
				if (local33.length > 0) {
					arg2[local3] = local33;
				}
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("90731, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!mb;Z[[C)V")
	private static void method509(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(2) char[][] arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
				@Pc(9) char[] local9 = new char[arg0.method467()];
				for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
					local9[local11] = (char) arg0.method467();
				}
				arg1[local3] = local9;
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("83934, " + arg0 + ", " + false + ", " + arg1 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "([CI)V")
	private static void method510(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) int local3 = 0;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				if (method511(arg0[local5])) {
					arg0[local3] = arg0[local5];
				} else {
					arg0[local3] = ' ';
				}
				if (local3 == 0 || arg0[local3] != ' ' || arg0[local3 - 1] != ' ') {
					local3++;
				}
			}
			if (arg1 > 0) {
				for (@Pc(50) int local50 = local3; local50 < arg0.length; local50++) {
					arg0[local50] = ' ';
				}
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("94804, " + arg0 + ", " + arg1 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(CZ)Z")
	private static boolean method511(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= ' ' && arg0 <= '\u007f' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("31795, " + arg0 + ", " + true + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method512(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) long local3 = System.currentTimeMillis();
			@Pc(6) char[] local6 = arg0.toCharArray();
			method510(local6, anInt846);
			@Pc(15) String local15 = (new String(local6)).trim();
			@Pc(19) char[] local19 = local15.toLowerCase().toCharArray();
			@Pc(22) String local22 = local15.toLowerCase();
			method520(local19);
			method515(local19);
			method516(local19);
			method529(local19);
			@Pc(38) boolean local38 = false;
			for (@Pc(40) int local40 = 0; local40 < aStringArray11.length; local40++) {
				@Pc(50) int local50 = -1;
				while ((local50 = local22.indexOf(aStringArray11[local40], local50 + 1)) != -1) {
					@Pc(57) char[] local57 = aStringArray11[local40].toCharArray();
					for (@Pc(59) int local59 = 0; local59 < local57.length; local59++) {
						local19[local59 + local50] = local57[local59];
					}
				}
			}
			method513(local19, local15.toCharArray());
			method514(local19);
			@Pc(101) long local101 = System.currentTimeMillis();
			return (new String(local19)).trim();
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("37987, " + arg0 + ", " + arg1 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "([C[CI)V")
	private static void method513(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1) {
		try {
			for (@Pc(4) int local4 = 0; local4 < arg1.length; local4++) {
				if (arg0[local4] != '*' && method537(arg1[local4])) {
					arg0[local4] = arg1[local4];
				}
			}
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("32680, " + arg0 + ", " + arg1 + ", " + -430 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "([CB)V")
	private static void method514(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				@Pc(11) char local11 = arg0[local5];
				if (!method534(local11)) {
					local3 = true;
				} else if (local3) {
					if (method536(local11)) {
						local3 = false;
					}
				} else if (method537(local11)) {
					arg0[local5] = (char) (local11 + 'a' - 65);
				}
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("67694, " + arg0 + ", " + -6 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "([CI)V")
	private static void method515(@OriginalArg(0) char[] arg0) {
		try {
			for (@Pc(13) int local13 = 0; local13 < 2; local13++) {
				for (@Pc(20) int local20 = aCharArrayArray1.length - 1; local20 >= 0; local20--) {
					method524(aCharArrayArray1[local20], aByteArrayArrayArray8[local20], arg0);
				}
			}
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("36971, " + arg0 + ", " + -35653 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "([CB)V")
	private static void method516(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(18) char[] local18 = new char[] { '(', 'a', ')' };
			method524(local18, null, local3);
			@Pc(27) char[] local27 = (char[]) arg0.clone();
			@Pc(42) char[] local42 = new char[] { 'd', 'o', 't' };
			method524(local42, null, local27);
			for (@Pc(56) int local56 = aCharArrayArray2.length - 1; local56 >= 0; local56--) {
				method517(local27, arg0, local3, aCharArrayArray2[local56], aByte22);
			}
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("91149, " + arg0 + ", " + 5 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "([C[C[C[CB)V")
	private static void method517(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) char[] arg3, @OriginalArg(4) byte arg4) {
		try {
			if (arg3.length <= arg1.length) {
				@Pc(19) int local19;
				for (@Pc(11) int local11 = 0; local11 <= arg1.length - arg3.length; local11 += local19) {
					@Pc(15) int local15 = local11;
					@Pc(17) int local17 = 0;
					local19 = 1;
					label62: while (true) {
						while (true) {
							if (local15 >= arg1.length) {
								break label62;
							}
							@Pc(27) char local27 = arg1[local15];
							@Pc(29) char local29 = 0;
							if (local15 + 1 < arg1.length) {
								local29 = arg1[local15 + 1];
							}
							@Pc(54) int local54;
							if (local17 < arg3.length && (local54 = method526(arg3[local17], local29, local27)) > 0) {
								local15 += local54;
								local17++;
							} else {
								if (local17 == 0) {
									break label62;
								}
								@Pc(75) int local75;
								if ((local75 = method526(arg3[local17 - 1], local29, local27)) > 0) {
									local15 += local75;
									if (local17 == 1) {
										local19++;
									}
								} else {
									if (local17 >= arg3.length || !method532(local27)) {
										break label62;
									}
									local15++;
								}
							}
						}
					}
					if (local17 >= arg3.length) {
						@Pc(106) boolean local106 = false;
						@Pc(112) int local112 = method518(local11, arg2, arg1, aByte24);
						@Pc(120) int local120 = method519(local15 - 1, arg0, arg1);
						if (local112 > 2 || local120 > 2) {
							local106 = true;
						}
						if (local106) {
							for (@Pc(132) int local132 = local11; local132 < local15; local132++) {
								arg1[local132] = '*';
							}
						}
					}
				}
				if (arg4 == aByte23) {
					@Pc(158) boolean local158 = false;
				}
			}
		} catch (@Pc(161) RuntimeException local161) {
			signlink.reporterror("19233, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local161.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I[C[CB)I")
	private static int method518(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) byte arg3) {
		try {
			if (arg0 == 0) {
				return 2;
			}
			for (@Pc(9) int local9 = arg0 - 1; local9 >= 0 && method532(arg2[local9]); local9--) {
				if (arg2[local9] == '@') {
					return 3;
				}
			}
			@Pc(29) int local29 = 0;
			if (arg3 != 72) {
				anInt850 = -347;
			}
			for (@Pc(38) int local38 = arg0 - 1; local38 >= 0 && method532(arg1[local38]); local38--) {
				if (arg1[local38] == '*') {
					local29++;
				}
			}
			if (local29 >= 3) {
				return 4;
			} else if (method532(arg2[arg0 - 1])) {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("7874, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I[C[CZ)I")
	private static int method519(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2) {
		try {
			if (arg0 + 1 == arg2.length) {
				return 2;
			}
			@Pc(13) int local13 = arg0 + 1;
			while (true) {
				if (local13 < arg2.length && method532(arg2[local13])) {
					if (arg2[local13] != '.' && arg2[local13] != ',') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(40) int local40 = 0;
				for (@Pc(44) int local44 = arg0 + 1; local44 < arg2.length && method532(arg1[local44]); local44++) {
					if (arg1[local44] == '*') {
						local40++;
					}
				}
				if (local40 >= 3) {
					return 4;
				}
				if (method532(arg2[arg0 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("80596, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I[C)V")
	private static void method520(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(18) char[] local18 = new char[] { 'd', 'o', 't' };
			method524(local18, null, local3);
			@Pc(27) char[] local27 = (char[]) arg0.clone();
			@Pc(58) char[] local58 = new char[] { 's', 'l', 'a', 's', 'h' };
			method524(local58, null, local27);
			for (@Pc(65) int local65 = 0; local65 < aCharArrayArray3.length; local65++) {
				method521(aCharArrayArray3[local65], local27, arg0, local3, anIntArray223[local65]);
			}
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("97375, " + -534 + ", " + arg0 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "([C[C[C[CZI)V")
	private static void method521(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) char[] arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0.length <= arg2.length) {
				@Pc(22) int local22;
				for (@Pc(14) int local14 = 0; local14 <= arg2.length - arg0.length; local14 += local22) {
					@Pc(18) int local18 = local14;
					@Pc(20) int local20 = 0;
					local22 = 1;
					label120: while (true) {
						while (true) {
							if (local18 >= arg2.length) {
								break label120;
							}
							@Pc(30) char local30 = arg2[local18];
							@Pc(32) char local32 = 0;
							if (local18 + 1 < arg2.length) {
								local32 = arg2[local18 + 1];
							}
							@Pc(57) int local57;
							if (local20 < arg0.length && (local57 = method526(arg0[local20], local32, local30)) > 0) {
								local18 += local57;
								local20++;
							} else {
								if (local20 == 0) {
									break label120;
								}
								@Pc(78) int local78;
								if ((local78 = method526(arg0[local20 - 1], local32, local30)) > 0) {
									local18 += local78;
									if (local20 == 1) {
										local22++;
									}
								} else {
									if (local20 >= arg0.length || !method532(local30)) {
										break label120;
									}
									local18++;
								}
							}
						}
					}
					if (local20 >= arg0.length) {
						@Pc(109) boolean local109 = false;
						@Pc(115) int local115 = method522(arg3, local14, arg2);
						@Pc(123) int local123 = method523(arg2, local18 - 1, arg1);
						if (arg4 == 1 && local115 > 0 && local123 > 0) {
							local109 = true;
						}
						if (arg4 == 2 && (local115 > 2 && local123 > 0 || local115 > 0 && local123 > 2)) {
							local109 = true;
						}
						if (arg4 == 3 && local115 > 0 && local123 > 2) {
							local109 = true;
						}
						@Pc(166) boolean local166;
						if (arg4 == 3 && local115 > 2 && local123 > 0) {
							local166 = true;
						} else {
							local166 = false;
						}
						if (local109) {
							@Pc(173) int local173 = local14;
							@Pc(177) int local177 = local18 - 1;
							@Pc(185) boolean local185;
							@Pc(189) int local189;
							if (local115 > 2) {
								if (local115 == 4) {
									local185 = false;
									for (local189 = local14 - 1; local189 >= 0; local189--) {
										if (local185) {
											if (arg3[local189] != '*') {
												break;
											}
											local173 = local189;
										} else if (arg3[local189] == '*') {
											local173 = local189;
											local185 = true;
										}
									}
								}
								local185 = false;
								for (local189 = local173 - 1; local189 >= 0; local189--) {
									if (local185) {
										if (method532(arg2[local189])) {
											break;
										}
										local173 = local189;
									} else if (!method532(arg2[local189])) {
										local185 = true;
										local173 = local189;
									}
								}
							}
							if (local123 > 2) {
								if (local123 == 4) {
									local185 = false;
									for (local189 = local177 + 1; local189 < arg2.length; local189++) {
										if (local185) {
											if (arg1[local189] != '*') {
												break;
											}
											local177 = local189;
										} else if (arg1[local189] == '*') {
											local177 = local189;
											local185 = true;
										}
									}
								}
								local185 = false;
								for (local189 = local177 + 1; local189 < arg2.length; local189++) {
									if (local185) {
										if (method532(arg2[local189])) {
											break;
										}
										local177 = local189;
									} else if (!method532(arg2[local189])) {
										local185 = true;
										local177 = local189;
									}
								}
							}
							for (@Pc(323) int local323 = local173; local323 <= local177; local323++) {
								arg2[local323] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(346) RuntimeException local346) {
			signlink.reporterror("71586, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + false + ", " + arg4 + ", " + local346.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "([CIZ[C)I")
	private static int method522(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg1 == 0) {
				return 2;
			}
			@Pc(9) int local9 = arg1 - 1;
			while (true) {
				if (local9 >= 0 && method532(arg2[local9])) {
					if (arg2[local9] != ',' && arg2[local9] != '.') {
						local9--;
						continue;
					}
					return 3;
				}
				@Pc(34) int local34 = 0;
				for (@Pc(46) int local46 = arg1 - 1; local46 >= 0 && method532(arg0[local46]); local46--) {
					if (arg0[local46] == '*') {
						local34++;
					}
				}
				if (local34 >= 3) {
					return 4;
				}
				if (method532(arg2[arg1 - 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("95504, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I[CI[C)I")
	private static int method523(@OriginalArg(1) char[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg1 + 1 == arg0.length) {
				return 2;
			}
			@Pc(22) int local22 = arg1 + 1;
			while (true) {
				if (local22 < arg0.length && method532(arg0[local22])) {
					if (arg0[local22] != '\\' && arg0[local22] != '/') {
						local22++;
						continue;
					}
					return 3;
				}
				@Pc(49) int local49 = 0;
				for (@Pc(53) int local53 = arg1 + 1; local53 < arg0.length && method532(arg2[local53]); local53++) {
					if (arg2[local53] == '*') {
						local49++;
					}
				}
				if (local49 >= 5) {
					return 4;
				}
				if (method532(arg0[arg1 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("92024, " + -133 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "([CI[[B[C)V")
	private static void method524(@OriginalArg(0) char[] arg0, @OriginalArg(2) byte[][] arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg0.length <= arg2.length) {
				@Pc(21) int local21;
				for (@Pc(11) int local11 = 0; local11 <= arg2.length - arg0.length; local11 += local21) {
					@Pc(15) int local15 = local11;
					@Pc(17) int local17 = 0;
					@Pc(19) int local19 = 0;
					local21 = 1;
					@Pc(23) boolean local23 = false;
					@Pc(25) boolean local25 = false;
					@Pc(27) boolean local27 = false;
					@Pc(35) char var12;
					@Pc(37) char var13;
					label159: while (true) {
						while (true) {
							if (local15 >= arg2.length || local25 && local27) {
								break label159;
							}
							var12 = arg2[local15];
							var13 = '\u0000';
							if (local15 + 1 < arg2.length) {
								var13 = arg2[local15 + 1];
							}
							@Pc(62) int local62;
							if (local17 < arg0.length && (local62 = method527(var12, var13, arg0[local17])) > 0) {
								if (local62 == 1 && method535(var12)) {
									local25 = true;
								}
								if (local62 == 2 && (method535(var12) || method535(var13))) {
									local25 = true;
								}
								local15 += local62;
								local17++;
							} else {
								if (local17 == 0) {
									break label159;
								}
								@Pc(105) int local105;
								if ((local105 = method527(var12, var13, arg0[local17 - 1])) > 0) {
									local15 += local105;
									if (local17 == 1) {
										local21++;
									}
								} else {
									if (local17 >= arg0.length || !method533(var12)) {
										break label159;
									}
									if (method532(var12) && var12 != '\'') {
										local23 = true;
									}
									if (method535(var12)) {
										local27 = true;
									}
									local15++;
									local19++;
									if (local19 * 100 / (local15 - local11) > 90) {
										break label159;
									}
								}
							}
						}
					}
					if (local17 >= arg0.length && (!local25 || !local27)) {
						@Pc(170) boolean local170 = true;
						@Pc(266) int local266;
						if (local23) {
							@Pc(216) boolean local216 = false;
							@Pc(218) boolean local218 = false;
							if (local11 - 1 < 0 || method532(arg2[local11 - 1]) && arg2[local11 - 1] != '\'') {
								local216 = true;
							}
							if (local15 >= arg2.length || method532(arg2[local15]) && arg2[local15] != '\'') {
								local218 = true;
							}
							if (!local216 || !local218) {
								@Pc(262) boolean local262 = false;
								local266 = local11 - 2;
								if (local216) {
									local266 = local11;
								}
								while (!local262 && local266 < local15) {
									if (local266 >= 0 && (!method532(arg2[local266]) || arg2[local266] == '\'')) {
										@Pc(288) char[] local288 = new char[3];
										@Pc(290) int local290;
										for (local290 = 0; local290 < 3 && local266 + local290 < arg2.length && (!method532(arg2[local266 + local290]) || arg2[local266 + local290] == '\''); local290++) {
											local288[local290] = arg2[local266 + local290];
										}
										@Pc(328) boolean local328 = true;
										if (local290 == 0) {
											local328 = false;
										}
										if (local290 < 3 && local266 - 1 >= 0 && (!method532(arg2[local266 - 1]) || arg2[local266 - 1] == '\'')) {
											local328 = false;
										}
										if (local328 && !method538(local288)) {
											local262 = true;
										}
									}
									local266++;
								}
								if (!local262) {
									local170 = false;
								}
							}
						} else {
							var12 = ' ';
							if (local11 - 1 >= 0) {
								var12 = arg2[local11 - 1];
							}
							var13 = ' ';
							if (local15 < arg2.length) {
								var13 = arg2[local15];
							}
							@Pc(198) byte local198 = method528(var12);
							@Pc(202) byte local202 = method528(var13);
							if (arg1 != null && method525(arg1, local202, local198)) {
								local170 = false;
							}
						}
						if (local170) {
							@Pc(378) int local378 = 0;
							@Pc(380) int local380 = 0;
							for (@Pc(382) int local382 = local11; local382 < local15; local382++) {
								if (method535(arg2[local382])) {
									local378++;
								} else if (method534(arg2[local382])) {
									local380++;
								}
							}
							if (local378 <= local380) {
								for (local266 = local11; local266 < local15; local266++) {
									arg2[local266] = '*';
								}
							}
						}
					}
				}
			}
		} catch (@Pc(442) RuntimeException local442) {
			signlink.reporterror("75296, " + arg0 + ", " + -150 + ", " + arg1 + ", " + arg2 + ", " + local442.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z[[BBB)Z")
	private static boolean method525(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) byte arg2) {
		try {
			@Pc(1) int local1 = 0;
			if (arg0[0][0] == arg2 && arg0[0][1] == arg1) {
				return true;
			}
			@Pc(22) int local22 = arg0.length - 1;
			if (arg0[local22][0] == arg2 && arg0[local22][1] == arg1) {
				return true;
			}
			do {
				@Pc(50) int local50 = (local1 + local22) / 2;
				if (arg0[local50][0] == arg2 && arg0[local50][1] == arg1) {
					return true;
				}
				if (arg2 < arg0[local50][0] || arg2 == arg0[local50][0] && arg1 < arg0[local50][1]) {
					local22 = local50;
				} else {
					local1 = local50;
				}
			} while (local1 != local22 && local1 + 1 != local22);
			return false;
		} catch (@Pc(104) RuntimeException local104) {
			signlink.reporterror("26335, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local104.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ICCC)I")
	private static int method526(@OriginalArg(1) char arg0, @OriginalArg(2) char arg1, @OriginalArg(3) char arg2) {
		try {
			if (arg0 == arg2) {
				return 1;
			} else if (arg0 == 'o' && arg2 == '0') {
				return 1;
			} else if (arg0 == 'o' && arg2 == '(' && arg1 == ')') {
				return 2;
			} else if (arg0 == 'c' && (arg2 == '(' || arg2 == '<' || arg2 == '[')) {
				return 1;
			} else if (arg0 == 'e' && arg2 == '€') {
				return 1;
			} else if (arg0 == 's' && arg2 == '$') {
				return 1;
			} else if (arg0 == 'l' && arg2 == 'i') {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("59229, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BCCC)I")
	private static int method527(@OriginalArg(1) char arg0, @OriginalArg(2) char arg1, @OriginalArg(3) char arg2) {
		try {
			if (arg2 == arg0) {
				return 1;
			}
			if (arg2 >= 'a' && arg2 <= 'm') {
				if (arg2 == 'a') {
					if (arg0 != '4' && arg0 != '@' && arg0 != '^') {
						if (arg0 == '/' && arg1 == '\\') {
							return 2;
						}
						return 0;
					}
					return 1;
				}
				if (arg2 == 'b') {
					if (arg0 != '6' && arg0 != '8') {
						if (arg0 == '1' && arg1 == '3') {
							return 2;
						}
						return 0;
					}
					return 1;
				}
				if (arg2 == 'c') {
					if (arg0 != '(' && arg0 != '<' && arg0 != '{' && arg0 != '[') {
						return 0;
					}
					return 1;
				}
				if (arg2 == 'd') {
					if (arg0 == '[' && arg1 == ')') {
						return 2;
					}
					return 0;
				}
				if (arg2 == 'e') {
					if (arg0 != '3' && arg0 != '€') {
						return 0;
					}
					return 1;
				}
				if (arg2 == 'f') {
					if (arg0 == 'p' && arg1 == 'h') {
						return 2;
					}
					if (arg0 == '£') {
						return 1;
					}
					return 0;
				}
				if (arg2 == 'g') {
					if (arg0 != '9' && arg0 != '6') {
						return 0;
					}
					return 1;
				}
				if (arg2 == 'h') {
					if (arg0 == '#') {
						return 1;
					}
					return 0;
				}
				if (arg2 == 'i') {
					if (arg0 != 'y' && arg0 != 'l' && arg0 != 'j' && arg0 != '1' && arg0 != '!' && arg0 != ':' && arg0 != ';' && arg0 != '|') {
						return 0;
					}
					return 1;
				}
				if (arg2 == 'j') {
					return 0;
				}
				if (arg2 == 'k') {
					return 0;
				}
				if (arg2 == 'l') {
					if (arg0 != '1' && arg0 != '|' && arg0 != 'i') {
						return 0;
					}
					return 1;
				}
				if (arg2 == 'm') {
					return 0;
				}
			}
			if (arg2 >= 'n' && arg2 <= 'z') {
				if (arg2 == 'n') {
					return 0;
				}
				if (arg2 == 'o') {
					if (arg0 != '0' && arg0 != '*') {
						if ((arg0 != '(' || arg1 != ')') && (arg0 != '[' || arg1 != ']') && (arg0 != '{' || arg1 != '}') && (arg0 != '<' || arg1 != '>')) {
							return 0;
						}
						return 2;
					}
					return 1;
				}
				if (arg2 == 'p') {
					return 0;
				}
				if (arg2 == 'q') {
					return 0;
				}
				if (arg2 == 'r') {
					return 0;
				}
				if (arg2 == 's') {
					if (arg0 != '5' && arg0 != 'z' && arg0 != '$' && arg0 != '2') {
						return 0;
					}
					return 1;
				}
				if (arg2 == 't') {
					if (arg0 != '7' && arg0 != '+') {
						return 0;
					}
					return 1;
				}
				if (arg2 == 'u') {
					if (arg0 == 'v') {
						return 1;
					}
					if ((arg0 != '\\' || arg1 != '/') && (arg0 != '\\' || arg1 != '|') && (arg0 != '|' || arg1 != '/')) {
						return 0;
					}
					return 2;
				}
				if (arg2 == 'v') {
					if ((arg0 != '\\' || arg1 != '/') && (arg0 != '\\' || arg1 != '|') && (arg0 != '|' || arg1 != '/')) {
						return 0;
					}
					return 2;
				}
				if (arg2 == 'w') {
					if (arg0 == 'v' && arg1 == 'v') {
						return 2;
					}
					return 0;
				}
				if (arg2 == 'x') {
					if ((arg0 != ')' || arg1 != '(') && (arg0 != '}' || arg1 != '{') && (arg0 != ']' || arg1 != '[') && (arg0 != '>' || arg1 != '<')) {
						return 0;
					}
					return 2;
				}
				if (arg2 == 'y') {
					return 0;
				}
				if (arg2 == 'z') {
					return 0;
				}
			}
			if (arg2 >= '0' && arg2 <= '9') {
				if (arg2 == '0') {
					if (arg0 == 'o' || arg0 == 'O') {
						return 1;
					} else if ((arg0 != '(' || arg1 != ')') && (arg0 != '{' || arg1 != '}') && (arg0 != '[' || arg1 != ']')) {
						return 0;
					} else {
						return 2;
					}
				} else if (arg2 == '1') {
					return arg0 == 'l' ? 1 : 0;
				} else {
					return 0;
				}
			} else if (arg2 == ',') {
				return arg0 == '.' ? 1 : 0;
			} else if (arg2 == '.') {
				return arg0 == ',' ? 1 : 0;
			} else if (arg2 == '!') {
				return arg0 == 'i' ? 1 : 0;
			} else {
				return 0;
			}
		} catch (@Pc(503) RuntimeException local503) {
			signlink.reporterror("669, " + 109 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local503.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(CZ)B")
	private static byte method528(@OriginalArg(0) char arg0) {
		try {
			if (arg0 >= 'a' && arg0 <= 'z') {
				return (byte) (arg0 + 1 - 'a');
			} else if (arg0 == '\'') {
				return 28;
			} else if (arg0 >= '0' && arg0 <= '9') {
				return (byte) (arg0 + 29 - '0');
			} else {
				return 27;
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("10823, " + arg0 + ", " + true + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "([CZ)V")
	private static void method529(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(14) int local14 = 0;
			@Pc(16) int local16 = 0;
			@Pc(18) int local18 = 0;
			while (true) {
				do {
					@Pc(117) int local117;
					if ((local117 = method530(local14, arg0, (byte) 9)) == -1) {
						return;
					}
					@Pc(22) boolean local22 = false;
					for (@Pc(24) int local24 = local14; local24 >= 0 && local24 < local117 && !local22; local24++) {
						if (!method532(arg0[local24]) && !method533(arg0[local24])) {
							local22 = true;
						}
					}
					if (local22) {
						local16 = 0;
					}
					if (local16 == 0) {
						local18 = local117;
					}
					local14 = method531(arg0, local117);
					@Pc(63) int local63 = 0;
					for (@Pc(65) int local65 = local117; local65 < local14; local65++) {
						local63 = local63 * 10 + arg0[local65] - 48;
					}
					if (local63 <= 255 && local14 - local117 <= 8) {
						local16++;
					} else {
						local16 = 0;
					}
				} while (local16 != 4);
				for (@Pc(99) int local99 = local18; local99 < local14; local99++) {
					arg0[local99] = '*';
				}
				local16 = 0;
			}
		} catch (@Pc(121) RuntimeException local121) {
			signlink.reporterror("72673, " + arg0 + ", " + true + ", " + local121.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I[CB)I")
	private static int method530(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) byte arg2) {
		try {
			for (@Pc(3) int local3 = arg0; local3 < arg1.length && local3 >= 0; local3++) {
				if (arg1[local3] >= '0' && arg1[local3] <= '9') {
					return local3;
				}
			}
			@Pc(29) boolean local29 = false;
			return -1;
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("37343, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "([CIZ)I")
	private static int method531(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(5) int local5 = arg1;
			while (true) {
				if (local5 < arg0.length && local5 >= 0) {
					if (arg0[local5] >= '0' && arg0[local5] <= '9') {
						local5++;
						continue;
					}
					return local5;
				}
				return arg0.length;
			}
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("69266, " + arg0 + ", " + arg1 + ", " + true + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZC)Z")
	private static boolean method532(@OriginalArg(1) char arg0) {
		try {
			return !method534(arg0) && !method535(arg0);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("57090, " + true + ", " + arg0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(CB)Z")
	private static boolean method533(@OriginalArg(0) char arg0) {
		try {
			if (arg0 >= 'a' && arg0 <= 'z') {
				return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
			} else {
				return true;
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("31550, " + arg0 + ", " + -30 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(ZC)Z")
	private static boolean method534(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("24611, " + false + ", " + arg0 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(CI)Z")
	private static boolean method535(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= '0' && arg0 <= '9';
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("92883, " + arg0 + ", " + 8071 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(CZ)Z")
	private static boolean method536(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z';
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("75121, " + arg0 + ", " + false + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(CB)Z")
	private static boolean method537(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("62541, " + arg0 + ", " + -9 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(I[C)Z")
	private static boolean method538(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				if (!method535(arg0[local5]) && arg0[local5] != '\u0000') {
					local3 = false;
				}
			}
			if (local3) {
				return true;
			}
			@Pc(32) int local32 = method539(anInt851, arg0);
			@Pc(40) int local40 = 0;
			@Pc(45) int local45 = anIntArray222.length - 1;
			if (local32 == anIntArray222[0] || local32 == anIntArray222[local45]) {
				return true;
			}
			do {
				@Pc(63) int local63 = (local40 + local45) / 2;
				if (local32 == anIntArray222[local63]) {
					return true;
				}
				if (local32 < anIntArray222[local63]) {
					local45 = local63;
				} else {
					local40 = local63;
				}
			} while (local40 != local45 && local40 + 1 != local45);
			return false;
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("59052, " + -397 + ", " + arg0 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(I[C)I")
	private static int method539(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1) {
		try {
			if (arg1.length > 6) {
				return 0;
			}
			@Pc(9) int local9 = 0;
			for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
				@Pc(22) char local22 = arg1[arg1.length - local11 - 1];
				if (local22 >= 'a' && local22 <= 'z') {
					local9 = local9 * 38 + local22 + 1 - 'a';
				} else if (local22 == '\'') {
					local9 = local9 * 38 + 27;
				} else if (local22 >= '0' && local22 <= '9') {
					local9 = local9 * 38 + local22 + 28 - '0';
				} else if (local22 != '\u0000') {
					return 0;
				}
			}
			if (arg0 != 16953) {
				anInt850 = -276;
			}
			return local9;
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("74259, " + arg0 + ", " + arg1 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}
}
