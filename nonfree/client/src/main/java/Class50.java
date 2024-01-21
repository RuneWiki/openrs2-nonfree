import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ZTOXLNJM")
public final class Class50 {

	@OriginalMember(owner = "client!ZTOXLNJM", name = "b", descriptor = "I")
	private static int anInt799;

	@OriginalMember(owner = "client!ZTOXLNJM", name = "k", descriptor = "[I")
	private static int[] anIntArray208;

	@OriginalMember(owner = "client!ZTOXLNJM", name = "l", descriptor = "[[C")
	private static char[][] aCharArrayArray1;

	@OriginalMember(owner = "client!ZTOXLNJM", name = "m", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!ZTOXLNJM", name = "n", descriptor = "[[C")
	private static char[][] aCharArrayArray2;

	@OriginalMember(owner = "client!ZTOXLNJM", name = "o", descriptor = "[[C")
	private static char[][] aCharArrayArray3;

	@OriginalMember(owner = "client!ZTOXLNJM", name = "p", descriptor = "[I")
	private static int[] anIntArray209;

	@OriginalMember(owner = "client!ZTOXLNJM", name = "a", descriptor = "Z")
	private static boolean aBoolean220 = true;

	@OriginalMember(owner = "client!ZTOXLNJM", name = "d", descriptor = "Z")
	private static boolean aBoolean222 = true;

	@OriginalMember(owner = "client!ZTOXLNJM", name = "e", descriptor = "I")
	private static int anInt800 = 3;

	@OriginalMember(owner = "client!ZTOXLNJM", name = "f", descriptor = "I")
	private static int anInt801 = -29;

	@OriginalMember(owner = "client!ZTOXLNJM", name = "g", descriptor = "I")
	private static int anInt802 = -37804;

	@OriginalMember(owner = "client!ZTOXLNJM", name = "h", descriptor = "I")
	private static int anInt803 = 5;

	@OriginalMember(owner = "client!ZTOXLNJM", name = "i", descriptor = "I")
	private static int anInt804 = -601;

	@OriginalMember(owner = "client!ZTOXLNJM", name = "j", descriptor = "I")
	private static int anInt805 = 1;

	@OriginalMember(owner = "client!ZTOXLNJM", name = "q", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray7 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

	@OriginalMember(owner = "client!ZTOXLNJM", name = "a", descriptor = "(Lclient!MJLXHQTQ;)V")
	public static void method533(@OriginalArg(0) Class31 arg0) {
		@Pc(10) Class5_Sub1_Sub4 local10 = new Class5_Sub1_Sub4(arg0.method227("fragmentsenc.txt", null), -82);
		@Pc(19) Class5_Sub1_Sub4 local19 = new Class5_Sub1_Sub4(arg0.method227("badenc.txt", null), -82);
		@Pc(28) Class5_Sub1_Sub4 local28 = new Class5_Sub1_Sub4(arg0.method227("domainenc.txt", null), -82);
		@Pc(37) Class5_Sub1_Sub4 local37 = new Class5_Sub1_Sub4(arg0.method227("tldlist.txt", null), -82);
		method534(local10, local19, local28, local37);
	}

	@OriginalMember(owner = "client!ZTOXLNJM", name = "a", descriptor = "(Lclient!XGRGMPUQ;Lclient!XGRGMPUQ;Lclient!XGRGMPUQ;Lclient!XGRGMPUQ;)V")
	private static void method534(@OriginalArg(0) Class5_Sub1_Sub4 arg0, @OriginalArg(1) Class5_Sub1_Sub4 arg1, @OriginalArg(2) Class5_Sub1_Sub4 arg2, @OriginalArg(3) Class5_Sub1_Sub4 arg3) {
		method536(arg1);
		method537(arg2);
		method538(arg0);
		method535(arg3);
	}

	@OriginalMember(owner = "client!ZTOXLNJM", name = "a", descriptor = "(ILclient!XGRGMPUQ;)V")
	private static void method535(@OriginalArg(1) Class5_Sub1_Sub4 arg0) {
		try {
			@Pc(12) int local12 = arg0.method442();
			aCharArrayArray3 = new char[local12][];
			anIntArray209 = new int[local12];
			for (@Pc(20) int local20 = 0; local20 < local12; local20++) {
				anIntArray209[local20] = arg0.method437();
				@Pc(31) char[] local31 = new char[arg0.method437()];
				for (@Pc(33) int local33 = 0; local33 < local31.length; local33++) {
					local31[local33] = (char) arg0.method437();
				}
				aCharArrayArray3[local20] = local31;
			}
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("68508, " + 2 + ", " + arg0 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZTOXLNJM", name = "a", descriptor = "(ZLclient!XGRGMPUQ;)V")
	private static void method536(@OriginalArg(1) Class5_Sub1_Sub4 arg0) {
		try {
			@Pc(2) int local2 = arg0.method442();
			aCharArrayArray1 = new char[local2][];
			aByteArrayArrayArray7 = new byte[local2][][];
			method539(aCharArrayArray1, aByteArrayArrayArray7, arg0);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("96141, " + false + ", " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZTOXLNJM", name = "b", descriptor = "(ILclient!XGRGMPUQ;)V")
	private static void method537(@OriginalArg(1) Class5_Sub1_Sub4 arg0) {
		try {
			@Pc(2) int local2 = arg0.method442();
			aCharArrayArray2 = new char[local2][];
			method540(arg0, aCharArrayArray2);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("49323, " + -2263 + ", " + arg0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZTOXLNJM", name = "c", descriptor = "(ILclient!XGRGMPUQ;)V")
	private static void method538(@OriginalArg(1) Class5_Sub1_Sub4 arg0) {
		try {
			anIntArray208 = new int[arg0.method442()];
			for (@Pc(13) int local13 = 0; local13 < anIntArray208.length; local13++) {
				anIntArray208[local13] = arg0.method439();
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("72523, " + -375 + ", " + arg0 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZTOXLNJM", name = "a", descriptor = "([[C[[[BLclient!XGRGMPUQ;I)V")
	private static void method539(@OriginalArg(0) char[][] arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) Class5_Sub1_Sub4 arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
				@Pc(9) char[] local9 = new char[arg2.method437()];
				for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
					local9[local11] = (char) arg2.method437();
				}
				arg0[local3] = local9;
				@Pc(33) byte[][] local33 = new byte[arg2.method437()][2];
				for (@Pc(35) int local35 = 0; local35 < local33.length; local35++) {
					local33[local35][0] = (byte) arg2.method437();
					local33[local35][1] = (byte) arg2.method437();
				}
				if (local33.length > 0) {
					arg1[local3] = local33;
				}
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("7071, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -996 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZTOXLNJM", name = "a", descriptor = "(Lclient!XGRGMPUQ;I[[C)V")
	private static void method540(@OriginalArg(0) Class5_Sub1_Sub4 arg0, @OriginalArg(2) char[][] arg1) {
		try {
			for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
				@Pc(13) char[] local13 = new char[arg0.method437()];
				for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
					local13[local15] = (char) arg0.method437();
				}
				arg1[local7] = local13;
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("66709, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZTOXLNJM", name = "a", descriptor = "([CI)V")
	private static void method541(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) int local3 = 0;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				if (method542(arg0[local5], (byte) 3)) {
					arg0[local3] = arg0[local5];
				} else {
					arg0[local3] = ' ';
				}
				if (local3 == 0 || arg0[local3] != ' ' || arg0[local3 - 1] != ' ') {
					local3++;
				}
			}
			for (@Pc(47) int local47 = local3; local47 < arg0.length; local47++) {
				arg0[local47] = ' ';
			}
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("6964, " + arg0 + ", " + 281 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZTOXLNJM", name = "a", descriptor = "(CB)Z")
	private static boolean method542(@OriginalArg(0) char arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(4) boolean local4 = false;
			return arg0 >= ' ' && arg0 <= '\u007f' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("82988, " + arg0 + ", " + arg1 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZTOXLNJM", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method543(@OriginalArg(1) String arg0) {
		try {
			@Pc(3) long local3 = System.currentTimeMillis();
			@Pc(21) char[] local21 = arg0.toCharArray();
			method541(local21);
			@Pc(30) String local30 = (new String(local21)).trim();
			@Pc(34) char[] local34 = local30.toLowerCase().toCharArray();
			@Pc(37) String local37 = local30.toLowerCase();
			method551(local34);
			method546(local34);
			method547(local34);
			method560(local34);
			for (@Pc(51) int local51 = 0; local51 < aStringArray7.length; local51++) {
				@Pc(55) int local55 = -1;
				while ((local55 = local37.indexOf(aStringArray7[local51], local55 + 1)) != -1) {
					@Pc(62) char[] local62 = aStringArray7[local51].toCharArray();
					for (@Pc(64) int local64 = 0; local64 < local62.length; local64++) {
						local34[local64 + local55] = local62[local64];
					}
				}
			}
			method544(local30.toCharArray(), local34);
			method545(local34);
			@Pc(106) long local106 = System.currentTimeMillis();
			return (new String(local34)).trim();
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("14113, " + true + ", " + arg0 + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZTOXLNJM", name = "a", descriptor = "([C[CI)V")
	private static void method544(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1) {
		try {
			for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
				if (arg1[local1] != '*' && method568(arg0[local1])) {
					arg1[local1] = arg0[local1];
				}
			}
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("9037, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZTOXLNJM", name = "a", descriptor = "(B[C)V")
	private static void method545(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(9) int local9 = 0; local9 < arg0.length; local9++) {
				@Pc(15) char local15 = arg0[local9];
				if (!method565(local15)) {
					local3 = true;
				} else if (local3) {
					if (method567(local15)) {
						local3 = false;
					}
				} else if (method568(local15)) {
					arg0[local9] = (char) (local15 + 'a' - 65);
				}
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("94510, " + 38 + ", " + arg0 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZTOXLNJM", name = "b", descriptor = "([CI)V")
	private static void method546(@OriginalArg(0) char[] arg0) {
		try {
			for (@Pc(6) int local6 = 0; local6 < 2; local6++) {
				for (@Pc(13) int local13 = aCharArrayArray1.length - 1; local13 >= 0; local13--) {
					method555(aByteArrayArrayArray7[local13], arg0, aCharArrayArray1[local13]);
				}
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("45402, " + arg0 + ", " + 317 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZTOXLNJM", name = "a", descriptor = "(Z[C)V")
	private static void method547(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(18) char[] local18 = new char[] { '(', 'a', ')' };
			method555(null, local3, local18);
			@Pc(27) char[] local27 = (char[]) arg0.clone();
			@Pc(50) char[] local50 = new char[] { 'd', 'o', 't' };
			method555(null, local27, local50);
			for (@Pc(60) int local60 = aCharArrayArray2.length - 1; local60 >= 0; local60--) {
				method548(local27, arg0, local3, aCharArrayArray2[local60]);
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("42328, " + false + ", " + arg0 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZTOXLNJM", name = "a", descriptor = "([C[C[CI[C)V")
	private static void method548(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2, @OriginalArg(4) char[] arg3) {
		try {
			if (arg3.length <= arg1.length) {
				@Pc(27) int local27;
				for (@Pc(19) int local19 = 0; local19 <= arg1.length - arg3.length; local19 += local27) {
					@Pc(23) int local23 = local19;
					@Pc(25) int local25 = 0;
					local27 = 1;
					label58: while (true) {
						while (true) {
							if (local23 >= arg1.length) {
								break label58;
							}
							@Pc(35) char local35 = arg1[local23];
							@Pc(37) char local37 = 0;
							if (local23 + 1 < arg1.length) {
								local37 = arg1[local23 + 1];
							}
							@Pc(62) int local62;
							if (local25 < arg3.length && (local62 = method557(local37, arg3[local25], local35)) > 0) {
								local23 += local62;
								local25++;
							} else {
								if (local25 == 0) {
									break label58;
								}
								@Pc(83) int local83;
								if ((local83 = method557(local37, arg3[local25 - 1], local35)) > 0) {
									local23 += local83;
									if (local25 == 1) {
										local27++;
									}
								} else {
									if (local25 >= arg3.length || !method563(local35)) {
										break label58;
									}
									local23++;
								}
							}
						}
					}
					if (local25 >= arg3.length) {
						@Pc(114) boolean local114 = false;
						@Pc(120) int local120 = method549(arg2, local19, arg1);
						@Pc(128) int local128 = method550(local23 - 1, arg1, arg0);
						if (local120 > 2 || local128 > 2) {
							local114 = true;
						}
						if (local114) {
							for (@Pc(140) int local140 = local19; local140 < local23; local140++) {
								arg1[local140] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(163) RuntimeException local163) {
			signlink.reporterror("84146, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 692 + ", " + arg3 + ", " + local163.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZTOXLNJM", name = "a", descriptor = "(I[CI[C)I")
	private static int method549(@OriginalArg(1) char[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg1 == 0) {
				return 2;
			}
			for (@Pc(9) int local9 = arg1 - 1; local9 >= 0 && method563(arg2[local9]); local9--) {
				if (arg2[local9] == '@') {
					return 3;
				}
			}
			@Pc(29) int local29 = 0;
			for (@Pc(33) int local33 = arg1 - 1; local33 >= 0 && method563(arg0[local33]); local33--) {
				if (arg0[local33] == '*') {
					local29++;
				}
			}
			if (local29 >= 3) {
				return 4;
			} else if (method563(arg2[arg1 - 1])) {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("79338, " + 2 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZTOXLNJM", name = "a", descriptor = "(II[C[C)I")
	private static int method550(@OriginalArg(1) int arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg0 + 1 == arg1.length) {
				return 2;
			}
			@Pc(19) int local19 = arg0 + 1;
			while (true) {
				if (local19 < arg1.length && method563(arg1[local19])) {
					if (arg1[local19] != '.' && arg1[local19] != ',') {
						local19++;
						continue;
					}
					return 3;
				}
				@Pc(46) int local46 = 0;
				for (@Pc(50) int local50 = arg0 + 1; local50 < arg1.length && method563(arg2[local50]); local50++) {
					if (arg2[local50] == '*') {
						local46++;
					}
				}
				if (local46 >= 3) {
					return 4;
				}
				if (method563(arg1[arg0 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("92586, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZTOXLNJM", name = "c", descriptor = "([CI)V")
	private static void method551(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(21) char[] local21 = new char[] { 'd', 'o', 't' };
			method555(null, local3, local21);
			@Pc(30) char[] local30 = (char[]) arg0.clone();
			@Pc(53) char[] local53 = new char[] { 's', 'l', 'a', 's', 'h' };
			method555(null, local30, local53);
			for (@Pc(60) int local60 = 0; local60 < aCharArrayArray3.length; local60++) {
				method552(aCharArrayArray3[local60], arg0, local3, local30, anIntArray209[local60]);
			}
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("33168, " + arg0 + ", " + 0 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZTOXLNJM", name = "a", descriptor = "([C[CI[C[CI)V")
	private static void method552(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(3) char[] arg2, @OriginalArg(4) char[] arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0.length <= arg1.length) {
				@Pc(19) int local19;
				@Pc(15) int local15;
				for (@Pc(11) int local11 = 0; local11 <= arg1.length - arg0.length; local11 += local19) {
					local15 = local11;
					@Pc(17) int local17 = 0;
					local19 = 1;
					label135: while (true) {
						while (true) {
							if (local15 >= arg1.length) {
								break label135;
							}
							@Pc(27) char local27 = arg1[local15];
							@Pc(29) char local29 = 0;
							if (local15 + 1 < arg1.length) {
								local29 = arg1[local15 + 1];
							}
							@Pc(54) int local54;
							if (local17 < arg0.length && (local54 = method557(local29, arg0[local17], local27)) > 0) {
								local15 += local54;
								local17++;
							} else {
								if (local17 == 0) {
									break label135;
								}
								@Pc(75) int local75;
								if ((local75 = method557(local29, arg0[local17 - 1], local27)) > 0) {
									local15 += local75;
									if (local17 == 1) {
										local19++;
									}
								} else {
									if (local17 >= arg0.length || !method563(local27)) {
										break label135;
									}
									local15++;
								}
							}
						}
					}
					if (local17 >= arg0.length) {
						@Pc(106) boolean local106 = false;
						@Pc(112) int local112 = method553(arg1, arg2, local11);
						@Pc(120) int local120 = method554(arg1, anInt801, arg3, local15 - 1);
						if (arg4 == 1 && local112 > 0 && local120 > 0) {
							local106 = true;
						}
						if (arg4 == 2 && (local112 > 2 && local120 > 0 || local112 > 0 && local120 > 2)) {
							local106 = true;
						}
						if (arg4 == 3 && local112 > 0 && local120 > 2) {
							local106 = true;
						}
						@Pc(163) boolean local163;
						if (arg4 == 3 && local112 > 2 && local120 > 0) {
							local163 = true;
						} else {
							local163 = false;
						}
						if (local106) {
							@Pc(170) int local170 = local11;
							@Pc(174) int local174 = local15 - 1;
							@Pc(182) boolean local182;
							@Pc(186) int local186;
							if (local112 > 2) {
								if (local112 == 4) {
									local182 = false;
									for (local186 = local11 - 1; local186 >= 0; local186--) {
										if (local182) {
											if (arg2[local186] != '*') {
												break;
											}
											local170 = local186;
										} else if (arg2[local186] == '*') {
											local170 = local186;
											local182 = true;
										}
									}
								}
								local182 = false;
								for (local186 = local170 - 1; local186 >= 0; local186--) {
									if (local182) {
										if (method563(arg1[local186])) {
											break;
										}
										local170 = local186;
									} else if (!method563(arg1[local186])) {
										local182 = true;
										local170 = local186;
									}
								}
							}
							if (local120 > 2) {
								if (local120 == 4) {
									local182 = false;
									for (local186 = local174 + 1; local186 < arg1.length; local186++) {
										if (local182) {
											if (arg3[local186] != '*') {
												break;
											}
											local174 = local186;
										} else if (arg3[local186] == '*') {
											local174 = local186;
											local182 = true;
										}
									}
								}
								local182 = false;
								for (local186 = local174 + 1; local186 < arg1.length; local186++) {
									if (local182) {
										if (method563(arg1[local186])) {
											break;
										}
										local174 = local186;
									} else if (!method563(arg1[local186])) {
										local182 = true;
										local174 = local186;
									}
								}
							}
							for (@Pc(320) int local320 = local170; local320 <= local174; local320++) {
								arg1[local320] = '*';
							}
						}
					}
				}
				if (anInt800 > 3 || anInt800 < 3) {
					for (local15 = 1; local15 > 0; local15++) {
					}
				}
			}
		} catch (@Pc(356) RuntimeException local356) {
			signlink.reporterror("44679, " + arg0 + ", " + arg1 + ", " + 3 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local356.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZTOXLNJM", name = "a", descriptor = "([C[CII)I")
	private static int method553(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 == 0) {
				return 2;
			}
			@Pc(9) int local9 = arg2 - 1;
			while (true) {
				if (local9 >= 0 && method563(arg0[local9])) {
					if (arg0[local9] != ',' && arg0[local9] != '.') {
						local9--;
						continue;
					}
					return 3;
				}
				@Pc(43) int local43 = 0;
				for (@Pc(47) int local47 = arg2 - 1; local47 >= 0 && method563(arg1[local47]); local47--) {
					if (arg1[local47] == '*') {
						local43++;
					}
				}
				if (local43 >= 3) {
					return 4;
				}
				if (method563(arg0[arg2 - 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("71841, " + arg0 + ", " + arg1 + ", " + 959 + ", " + arg2 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZTOXLNJM", name = "a", descriptor = "([CI[CI)I")
	private static int method554(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) int arg3) {
		try {
			while (arg1 >= 0) {
			}
			if (arg3 + 1 == arg0.length) {
				return 2;
			}
			@Pc(23) int local23 = arg3 + 1;
			while (true) {
				if (local23 < arg0.length && method563(arg0[local23])) {
					if (arg0[local23] != '\\' && arg0[local23] != '/') {
						local23++;
						continue;
					}
					return 3;
				}
				@Pc(50) int local50 = 0;
				for (@Pc(54) int local54 = arg3 + 1; local54 < arg0.length && method563(arg2[local54]); local54++) {
					if (arg2[local54] == '*') {
						local50++;
					}
				}
				if (local50 >= 5) {
					return 4;
				}
				if (method563(arg0[arg3 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("41306, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZTOXLNJM", name = "a", descriptor = "([[BI[C[C)V")
	private static void method555(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg2.length <= arg1.length) {
				@Pc(21) int local21;
				for (@Pc(11) int local11 = 0; local11 <= arg1.length - arg2.length; local11 += local21) {
					@Pc(15) int local15 = local11;
					@Pc(17) int local17 = 0;
					@Pc(19) int local19 = 0;
					local21 = 1;
					@Pc(23) boolean local23 = false;
					@Pc(25) boolean local25 = false;
					@Pc(27) boolean local27 = false;
					@Pc(35) char var12;
					@Pc(37) char var13;
					label165: while (true) {
						while (true) {
							if (local15 >= arg1.length || local25 && local27) {
								break label165;
							}
							var12 = arg1[local15];
							var13 = '\u0000';
							if (local15 + 1 < arg1.length) {
								var13 = arg1[local15 + 1];
							}
							@Pc(62) int local62;
							if (local17 < arg2.length && (local62 = method558(arg2[local17], var12, var13)) > 0) {
								if (local62 == 1 && method566(var12)) {
									local25 = true;
								}
								if (local62 == 2 && (method566(var12) || method566(var13))) {
									local25 = true;
								}
								local15 += local62;
								local17++;
							} else {
								if (local17 == 0) {
									break label165;
								}
								@Pc(105) int local105;
								if ((local105 = method558(arg2[local17 - 1], var12, var13)) > 0) {
									local15 += local105;
									if (local17 == 1) {
										local21++;
									}
								} else {
									if (local17 >= arg2.length || !method564(var12)) {
										break label165;
									}
									if (method563(var12) && var12 != '\'') {
										local23 = true;
									}
									if (method566(var12)) {
										local27 = true;
									}
									local15++;
									local19++;
									if (local19 * 100 / (local15 - local11) > 90) {
										break label165;
									}
								}
							}
						}
					}
					if (local17 >= arg2.length && (!local25 || !local27)) {
						@Pc(170) boolean local170 = true;
						@Pc(266) int local266;
						if (local23) {
							@Pc(216) boolean local216 = false;
							@Pc(218) boolean local218 = false;
							if (local11 - 1 < 0 || method563(arg1[local11 - 1]) && arg1[local11 - 1] != '\'') {
								local216 = true;
							}
							if (local15 >= arg1.length || method563(arg1[local15]) && arg1[local15] != '\'') {
								local218 = true;
							}
							if (!local216 || !local218) {
								@Pc(262) boolean local262 = false;
								local266 = local11 - 2;
								if (local216) {
									local266 = local11;
								}
								while (!local262 && local266 < local15) {
									if (local266 >= 0 && (!method563(arg1[local266]) || arg1[local266] == '\'')) {
										@Pc(288) char[] local288 = new char[3];
										@Pc(290) int local290;
										for (local290 = 0; local290 < 3 && local266 + local290 < arg1.length && (!method563(arg1[local266 + local290]) || arg1[local266 + local290] == '\''); local290++) {
											local288[local290] = arg1[local266 + local290];
										}
										@Pc(328) boolean local328 = true;
										if (local290 == 0) {
											local328 = false;
										}
										if (local290 < 3 && local266 - 1 >= 0 && (!method563(arg1[local266 - 1]) || arg1[local266 - 1] == '\'')) {
											local328 = false;
										}
										if (local328 && !method569(local288)) {
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
								var12 = arg1[local11 - 1];
							}
							var13 = ' ';
							if (local15 < arg1.length) {
								var13 = arg1[local15];
							}
							@Pc(198) byte local198 = method559(var12);
							@Pc(202) byte local202 = method559(var13);
							if (arg0 != null && method556(arg0, local202, local198)) {
								local170 = false;
							}
						}
						if (local170) {
							@Pc(378) int local378 = 0;
							@Pc(380) int local380 = 0;
							@Pc(382) int local382 = -1;
							for (local266 = local11; local266 < local15; local266++) {
								if (method566(arg1[local266])) {
									local378++;
								} else if (method565(arg1[local266])) {
									local380++;
									local382 = local266;
								}
							}
							if (local382 > -1) {
								local378 -= local15 - local382 - 1;
							}
							if (local378 <= local380) {
								for (@Pc(424) int local424 = local11; local424 < local15; local424++) {
									arg1[local424] = '*';
								}
							} else {
								local21 = 1;
							}
						}
					}
				}
			}
		} catch (@Pc(459) RuntimeException local459) {
			signlink.reporterror("63244, " + arg0 + ", " + 439 + ", " + arg1 + ", " + arg2 + ", " + local459.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZTOXLNJM", name = "a", descriptor = "([[BBZB)Z")
	private static boolean method556(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte arg1, @OriginalArg(3) byte arg2) {
		try {
			@Pc(7) int local7 = 0;
			if (arg0[0][0] == arg2 && arg0[0][1] == arg1) {
				return true;
			}
			@Pc(28) int local28 = arg0.length - 1;
			if (arg0[local28][0] == arg2 && arg0[local28][1] == arg1) {
				return true;
			}
			do {
				@Pc(50) int local50 = (local7 + local28) / 2;
				if (arg0[local50][0] == arg2 && arg0[local50][1] == arg1) {
					return true;
				}
				if (arg2 < arg0[local50][0] || arg2 == arg0[local50][0] && arg1 < arg0[local50][1]) {
					local28 = local50;
				} else {
					local7 = local50;
				}
			} while (local7 != local28 && local7 + 1 != local28);
			return false;
		} catch (@Pc(104) RuntimeException local104) {
			signlink.reporterror("12489, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + local104.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZTOXLNJM", name = "a", descriptor = "(CCBC)I")
	private static int method557(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(3) char arg2) {
		try {
			if (arg1 == arg2) {
				return 1;
			} else if (arg1 == 'o' && arg2 == '0') {
				return 1;
			} else if (arg1 == 'o' && arg2 == '(' && arg0 == ')') {
				return 2;
			} else if (arg1 == 'c' && (arg2 == '(' || arg2 == '<' || arg2 == '[')) {
				return 1;
			} else if (arg1 == 'e' && arg2 == '€') {
				return 1;
			} else if (arg1 == 's' && arg2 == '$') {
				return 1;
			} else if (arg1 == 'l' && arg2 == 'i') {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("88210, " + arg0 + ", " + arg1 + ", " + 83 + ", " + arg2 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZTOXLNJM", name = "a", descriptor = "(ICCC)I")
	private static int method558(@OriginalArg(1) char arg0, @OriginalArg(2) char arg1, @OriginalArg(3) char arg2) {
		try {
			if (arg0 == arg1) {
				return 1;
			}
			if (arg0 >= 'a' && arg0 <= 'm') {
				if (arg0 == 'a') {
					if (arg1 != '4' && arg1 != '@' && arg1 != '^') {
						if (arg1 == '/' && arg2 == '\\') {
							return 2;
						}
						return 0;
					}
					return 1;
				}
				if (arg0 == 'b') {
					if (arg1 != '6' && arg1 != '8') {
						if ((arg1 != '1' || arg2 != '3') && (arg1 != 'i' || arg2 != '3')) {
							return 0;
						}
						return 2;
					}
					return 1;
				}
				if (arg0 == 'c') {
					if (arg1 != '(' && arg1 != '<' && arg1 != '{' && arg1 != '[') {
						return 0;
					}
					return 1;
				}
				if (arg0 == 'd') {
					if ((arg1 != '[' || arg2 != ')') && (arg1 != 'i' || arg2 != ')')) {
						return 0;
					}
					return 2;
				}
				if (arg0 == 'e') {
					if (arg1 != '3' && arg1 != '€') {
						return 0;
					}
					return 1;
				}
				if (arg0 == 'f') {
					if (arg1 == 'p' && arg2 == 'h') {
						return 2;
					}
					if (arg1 == '£') {
						return 1;
					}
					return 0;
				}
				if (arg0 == 'g') {
					if (arg1 != '9' && arg1 != '6' && arg1 != 'q') {
						return 0;
					}
					return 1;
				}
				if (arg0 == 'h') {
					if (arg1 == '#') {
						return 1;
					}
					return 0;
				}
				if (arg0 == 'i') {
					if (arg1 != 'y' && arg1 != 'l' && arg1 != 'j' && arg1 != '1' && arg1 != '!' && arg1 != ':' && arg1 != ';' && arg1 != '|') {
						return 0;
					}
					return 1;
				}
				if (arg0 == 'j') {
					return 0;
				}
				if (arg0 == 'k') {
					return 0;
				}
				if (arg0 == 'l') {
					if (arg1 != '1' && arg1 != '|' && arg1 != 'i') {
						return 0;
					}
					return 1;
				}
				if (arg0 == 'm') {
					return 0;
				}
			}
			if (arg0 >= 'n' && arg0 <= 'z') {
				if (arg0 == 'n') {
					return 0;
				}
				if (arg0 == 'o') {
					if (arg1 != '0' && arg1 != '*') {
						if ((arg1 != '(' || arg2 != ')') && (arg1 != '[' || arg2 != ']') && (arg1 != '{' || arg2 != '}') && (arg1 != '<' || arg2 != '>')) {
							return 0;
						}
						return 2;
					}
					return 1;
				}
				if (arg0 == 'p') {
					return 0;
				}
				if (arg0 == 'q') {
					return 0;
				}
				if (arg0 == 'r') {
					return 0;
				}
				if (arg0 == 's') {
					if (arg1 != '5' && arg1 != 'z' && arg1 != '$' && arg1 != '2') {
						return 0;
					}
					return 1;
				}
				if (arg0 == 't') {
					if (arg1 != '7' && arg1 != '+') {
						return 0;
					}
					return 1;
				}
				if (arg0 == 'u') {
					if (arg1 == 'v') {
						return 1;
					}
					if ((arg1 != '\\' || arg2 != '/') && (arg1 != '\\' || arg2 != '|') && (arg1 != '|' || arg2 != '/')) {
						return 0;
					}
					return 2;
				}
				if (arg0 == 'v') {
					if ((arg1 != '\\' || arg2 != '/') && (arg1 != '\\' || arg2 != '|') && (arg1 != '|' || arg2 != '/')) {
						return 0;
					}
					return 2;
				}
				if (arg0 == 'w') {
					if (arg1 == 'v' && arg2 == 'v') {
						return 2;
					}
					return 0;
				}
				if (arg0 == 'x') {
					if ((arg1 != ')' || arg2 != '(') && (arg1 != '}' || arg2 != '{') && (arg1 != ']' || arg2 != '[') && (arg1 != '>' || arg2 != '<')) {
						return 0;
					}
					return 2;
				}
				if (arg0 == 'y') {
					return 0;
				}
				if (arg0 == 'z') {
					return 0;
				}
			}
			if (arg0 >= '0' && arg0 <= '9') {
				if (arg0 == '0') {
					if (arg1 == 'o' || arg1 == 'O') {
						return 1;
					} else if ((arg1 != '(' || arg2 != ')') && (arg1 != '{' || arg2 != '}') && (arg1 != '[' || arg2 != ']')) {
						return 0;
					} else {
						return 2;
					}
				} else if (arg0 == '1') {
					return arg1 == 'l' ? 1 : 0;
				} else {
					return 0;
				}
			} else if (arg0 == ',') {
				return arg1 == '.' ? 1 : 0;
			} else if (arg0 == '.') {
				return arg1 == ',' ? 1 : 0;
			} else if (arg0 == '!') {
				return arg1 == 'i' ? 1 : 0;
			} else {
				return 0;
			}
		} catch (@Pc(520) RuntimeException local520) {
			signlink.reporterror("24636, " + 5 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local520.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZTOXLNJM", name = "a", descriptor = "(BC)B")
	private static byte method559(@OriginalArg(1) char arg0) {
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
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("86277, " + -22 + ", " + arg0 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZTOXLNJM", name = "b", descriptor = "(Z[C)V")
	private static void method560(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(5) int local5 = 0;
			@Pc(10) int local10 = 0;
			@Pc(12) int local12 = 0;
			while (true) {
				do {
					@Pc(111) int local111;
					if ((local111 = method561(arg0, local5)) == -1) {
						return;
					}
					@Pc(16) boolean local16 = false;
					for (@Pc(18) int local18 = local5; local18 >= 0 && local18 < local111 && !local16; local18++) {
						if (!method563(arg0[local18]) && !method564(arg0[local18])) {
							local16 = true;
						}
					}
					if (local16) {
						local10 = 0;
					}
					if (local10 == 0) {
						local12 = local111;
					}
					local5 = method562(arg0, local111);
					@Pc(57) int local57 = 0;
					for (@Pc(59) int local59 = local111; local59 < local5; local59++) {
						local57 = local57 * 10 + arg0[local59] - 48;
					}
					if (local57 <= 255 && local5 - local111 <= 8) {
						local10++;
					} else {
						local10 = 0;
					}
				} while (local10 != 4);
				for (@Pc(93) int local93 = local12; local93 < local5; local93++) {
					arg0[local93] = '*';
				}
				local10 = 0;
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("91442, " + false + ", " + arg0 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZTOXLNJM", name = "a", descriptor = "([CZI)I")
	private static int method561(@OriginalArg(0) char[] arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(3) int local3 = arg1; local3 < arg0.length && local3 >= 0; local3++) {
				if (arg0[local3] >= '0' && arg0[local3] <= '9') {
					return local3;
				}
			}
			return -1;
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("35141, " + arg0 + ", " + false + ", " + arg1 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZTOXLNJM", name = "a", descriptor = "([CBI)I")
	private static int method562(@OriginalArg(0) char[] arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(13) int local13 = arg1;
			while (true) {
				if (local13 < arg0.length && local13 >= 0) {
					if (arg0[local13] >= '0' && arg0[local13] <= '9') {
						local13++;
						continue;
					}
					return local13;
				}
				return arg0.length;
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("36608, " + arg0 + ", " + 33 + ", " + arg1 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZTOXLNJM", name = "a", descriptor = "(IC)Z")
	private static boolean method563(@OriginalArg(1) char arg0) {
		try {
			if (anInt802 != -37804) {
				for (@Pc(4) int local4 = 1; local4 > 0; local4++) {
				}
			}
			return !method565(arg0) && !method566(arg0);
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("44863, " + -37804 + ", " + arg0 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZTOXLNJM", name = "a", descriptor = "(CI)Z")
	private static boolean method564(@OriginalArg(0) char arg0) {
		try {
			if (anInt803 != 5) {
				aBoolean220 = !aBoolean220;
			}
			if (arg0 >= 'a' && arg0 <= 'z') {
				return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
			} else {
				return true;
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("17437, " + arg0 + ", " + 5 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZTOXLNJM", name = "a", descriptor = "(ZC)Z")
	private static boolean method565(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("35462, " + false + ", " + arg0 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZTOXLNJM", name = "a", descriptor = "(CZ)Z")
	private static boolean method566(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= '0' && arg0 <= '9';
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("94886, " + arg0 + ", " + true + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZTOXLNJM", name = "b", descriptor = "(IC)Z")
	private static boolean method567(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z';
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("57948, " + 0 + ", " + arg0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZTOXLNJM", name = "b", descriptor = "(CB)Z")
	private static boolean method568(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("52392, " + arg0 + ", " + -94 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZTOXLNJM", name = "b", descriptor = "(B[C)Z")
	private static boolean method569(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				if (!method566(arg0[local5]) && arg0[local5] != '\u0000') {
					local3 = false;
				}
			}
			if (local3) {
				return true;
			}
			@Pc(32) int local32 = method570(arg0);
			@Pc(34) int local34 = 0;
			@Pc(48) int local48 = anIntArray208.length - 1;
			if (local32 == anIntArray208[0] || local32 == anIntArray208[local48]) {
				return true;
			}
			do {
				@Pc(66) int local66 = (local34 + local48) / 2;
				if (local32 == anIntArray208[local66]) {
					return true;
				}
				if (local32 < anIntArray208[local66]) {
					local48 = local66;
				} else {
					local34 = local66;
				}
			} while (local34 != local48 && local34 + 1 != local48);
			return false;
		} catch (@Pc(95) RuntimeException local95) {
			signlink.reporterror("98039, " + 2 + ", " + arg0 + ", " + local95.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZTOXLNJM", name = "d", descriptor = "([CI)I")
	private static int method570(@OriginalArg(0) char[] arg0) {
		try {
			if (arg0.length > 6) {
				return 0;
			}
			@Pc(9) int local9 = 0;
			for (@Pc(16) int local16 = 0; local16 < arg0.length; local16++) {
				@Pc(27) char local27 = arg0[arg0.length - local16 - 1];
				if (local27 >= 'a' && local27 <= 'z') {
					local9 = local9 * 38 + local27 + 1 - 'a';
				} else if (local27 == '\'') {
					local9 = local9 * 38 + 27;
				} else if (local27 >= '0' && local27 <= '9') {
					local9 = local9 * 38 + local27 + 28 - '0';
				} else if (local27 != '\u0000') {
					return 0;
				}
			}
			return local9;
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("50107, " + arg0 + ", " + -15611 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}
}
