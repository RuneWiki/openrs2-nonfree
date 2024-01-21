import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!XWTMFQHB")
public final class Class47 {

	@OriginalMember(owner = "client!XWTMFQHB", name = "c", descriptor = "I")
	private static int anInt771;

	@OriginalMember(owner = "client!XWTMFQHB", name = "e", descriptor = "Z")
	private static boolean aBoolean168;

	@OriginalMember(owner = "client!XWTMFQHB", name = "f", descriptor = "[I")
	private static int[] anIntArray198;

	@OriginalMember(owner = "client!XWTMFQHB", name = "g", descriptor = "[[C")
	private static char[][] aCharArrayArray1;

	@OriginalMember(owner = "client!XWTMFQHB", name = "h", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!XWTMFQHB", name = "i", descriptor = "[[C")
	private static char[][] aCharArrayArray2;

	@OriginalMember(owner = "client!XWTMFQHB", name = "j", descriptor = "[[C")
	private static char[][] aCharArrayArray3;

	@OriginalMember(owner = "client!XWTMFQHB", name = "k", descriptor = "[I")
	private static int[] anIntArray199;

	@OriginalMember(owner = "client!XWTMFQHB", name = "b", descriptor = "I")
	private static int anInt770 = -296;

	@OriginalMember(owner = "client!XWTMFQHB", name = "d", descriptor = "I")
	private static int anInt772 = 293;

	@OriginalMember(owner = "client!XWTMFQHB", name = "l", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray7 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

	@OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "(Lclient!AWEEREDT;)V")
	public static void method488(@OriginalArg(0) Class2 arg0) {
		@Pc(10) Class8_Sub1_Sub3 local10 = new Class8_Sub1_Sub3(arg0.method14("fragmentsenc.txt", null), 713);
		@Pc(19) Class8_Sub1_Sub3 local19 = new Class8_Sub1_Sub3(arg0.method14("badenc.txt", null), 713);
		@Pc(28) Class8_Sub1_Sub3 local28 = new Class8_Sub1_Sub3(arg0.method14("domainenc.txt", null), 713);
		@Pc(37) Class8_Sub1_Sub3 local37 = new Class8_Sub1_Sub3(arg0.method14("tldlist.txt", null), 713);
		method489(local10, local19, local28, local37);
	}

	@OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "(Lclient!IUVBENCV;Lclient!IUVBENCV;Lclient!IUVBENCV;Lclient!IUVBENCV;)V")
	private static void method489(@OriginalArg(0) Class8_Sub1_Sub3 arg0, @OriginalArg(1) Class8_Sub1_Sub3 arg1, @OriginalArg(2) Class8_Sub1_Sub3 arg2, @OriginalArg(3) Class8_Sub1_Sub3 arg3) {
		method491(arg1);
		method492(arg2);
		method493(arg0, anInt771);
		method490((byte) 5, arg3);
	}

	@OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "(BLclient!IUVBENCV;)V")
	private static void method490(@OriginalArg(0) byte arg0, @OriginalArg(1) Class8_Sub1_Sub3 arg1) {
		try {
			@Pc(4) int local4 = arg1.method157();
			aCharArrayArray3 = new char[local4][];
			@Pc(12) boolean local12 = false;
			anIntArray199 = new int[local4];
			for (@Pc(20) int local20 = 0; local20 < local4; local20++) {
				anIntArray199[local20] = arg1.method152();
				@Pc(31) char[] local31 = new char[arg1.method152()];
				for (@Pc(33) int local33 = 0; local33 < local31.length; local33++) {
					local31[local33] = (char) arg1.method152();
				}
				aCharArrayArray3[local20] = local31;
			}
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("32945, " + arg0 + ", " + arg1 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "(ILclient!IUVBENCV;)V")
	private static void method491(@OriginalArg(1) Class8_Sub1_Sub3 arg0) {
		try {
			@Pc(6) int local6 = arg0.method157();
			aCharArrayArray1 = new char[local6][];
			aByteArrayArrayArray7 = new byte[local6][][];
			method494(aCharArrayArray1, arg0, aByteArrayArrayArray7);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("35940, " + -6334 + ", " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "(Lclient!IUVBENCV;Z)V")
	private static void method492(@OriginalArg(0) Class8_Sub1_Sub3 arg0) {
		try {
			@Pc(2) int local2 = arg0.method157();
			aCharArrayArray2 = new char[local2][];
			method495(arg0, aCharArrayArray2);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("52516, " + arg0 + ", " + false + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "(Lclient!IUVBENCV;I)V")
	private static void method493(@OriginalArg(0) Class8_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			anIntArray198 = new int[arg0.method157()];
			for (@Pc(5) int local5 = 0; local5 < anIntArray198.length; local5++) {
				anIntArray198[local5] = arg0.method154();
			}
			if (arg1 == 0) {
				;
			}
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("64553, " + arg0 + ", " + arg1 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "([[CBLclient!IUVBENCV;[[[B)V")
	private static void method494(@OriginalArg(0) char[][] arg0, @OriginalArg(2) Class8_Sub1_Sub3 arg1, @OriginalArg(3) byte[][][] arg2) {
		try {
			for (@Pc(8) int local8 = 0; local8 < arg0.length; local8++) {
				@Pc(14) char[] local14 = new char[arg1.method152()];
				for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
					local14[local16] = (char) arg1.method152();
				}
				arg0[local8] = local14;
				@Pc(38) byte[][] local38 = new byte[arg1.method152()][2];
				for (@Pc(40) int local40 = 0; local40 < local38.length; local40++) {
					local38[local40][0] = (byte) arg1.method152();
					local38[local40][1] = (byte) arg1.method152();
				}
				if (local38.length > 0) {
					arg2[local8] = local38;
				}
			}
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("68227, " + arg0 + ", " + -75 + ", " + arg1 + ", " + arg2 + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "(BLclient!IUVBENCV;[[C)V")
	private static void method495(@OriginalArg(1) Class8_Sub1_Sub3 arg0, @OriginalArg(2) char[][] arg1) {
		try {
			for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
				@Pc(13) char[] local13 = new char[arg0.method152()];
				for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
					local13[local15] = (char) arg0.method152();
				}
				arg1[local7] = local13;
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("38371, " + 8 + ", " + arg0 + ", " + arg1 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "([CI)V")
	private static void method496(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) int local3 = 0;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				if (method497((byte) 1, arg0[local5])) {
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
			@Pc(62) int local62 = 2 / arg1;
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("12537, " + arg0 + ", " + arg1 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "(BC)Z")
	private static boolean method497(@OriginalArg(0) byte arg0, @OriginalArg(1) char arg1) {
		try {
			@Pc(4) boolean local4 = false;
			return arg1 >= ' ' && arg1 <= '\u007f' || arg1 == ' ' || arg1 == '\n' || arg1 == '\t' || arg1 == '£' || arg1 == '€';
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("82936, " + arg0 + ", " + arg1 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method498(@OriginalArg(1) String arg0) {
		try {
			@Pc(3) long local3 = System.currentTimeMillis();
			@Pc(6) char[] local6 = arg0.toCharArray();
			method496(local6, anInt772);
			@Pc(24) String local24 = (new String(local6)).trim();
			@Pc(28) char[] local28 = local24.toLowerCase().toCharArray();
			@Pc(31) String local31 = local24.toLowerCase();
			method506(local28);
			method501(local28);
			method502(aBoolean168, local28);
			method515(local28);
			for (@Pc(45) int local45 = 0; local45 < aStringArray7.length; local45++) {
				@Pc(55) int local55 = -1;
				while ((local55 = local31.indexOf(aStringArray7[local45], local55 + 1)) != -1) {
					@Pc(62) char[] local62 = aStringArray7[local45].toCharArray();
					for (@Pc(64) int local64 = 0; local64 < local62.length; local64++) {
						local28[local64 + local55] = local62[local64];
					}
				}
			}
			method499(local24.toCharArray(), local28);
			method500(local28);
			@Pc(106) long local106 = System.currentTimeMillis();
			return (new String(local28)).trim();
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("88372, " + 9 + ", " + arg0 + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "([CZ[C)V")
	private static void method499(@OriginalArg(0) char[] arg0, @OriginalArg(2) char[] arg1) {
		try {
			for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
				if (arg1[local1] != '*' && method523(arg0[local1])) {
					arg1[local1] = arg0[local1];
				}
			}
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("74340, " + arg0 + ", " + false + ", " + arg1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XWTMFQHB", name = "b", descriptor = "([CI)V")
	private static void method500(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				@Pc(11) char local11 = arg0[local5];
				if (!method520(local11)) {
					local3 = true;
				} else if (local3) {
					if (method522(679, local11)) {
						local3 = false;
					}
				} else if (method523(local11)) {
					arg0[local5] = (char) (local11 + 'a' - 65);
				}
			}
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("84627, " + arg0 + ", " + 4 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "(Z[C)V")
	private static void method501(@OriginalArg(1) char[] arg0) {
		try {
			for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
				for (@Pc(19) int local19 = aCharArrayArray1.length - 1; local19 >= 0; local19--) {
					method510(aCharArrayArray1[local19], arg0, aByteArrayArrayArray7[local19]);
				}
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("17456, " + true + ", " + arg0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XWTMFQHB", name = "b", descriptor = "(Z[C)V")
	private static void method502(@OriginalArg(0) boolean arg0, @OriginalArg(1) char[] arg1) {
		try {
			@Pc(3) char[] local3 = (char[]) arg1.clone();
			@Pc(18) char[] local18 = new char[] { '(', 'a', ')' };
			method510(local18, local3, null);
			@Pc(27) char[] local27 = (char[]) arg1.clone();
			@Pc(42) char[] local42 = new char[] { 'd', 'o', 't' };
			method510(local42, local27, null);
			for (@Pc(52) int local52 = aCharArrayArray2.length - 1; local52 >= 0; local52--) {
				method503(local27, aCharArrayArray2[local52], local3, arg1);
			}
			if (!arg0) {
				;
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("92082, " + arg0 + ", " + arg1 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "([C[CZ[C[C)V")
	private static void method503(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(3) char[] arg2, @OriginalArg(4) char[] arg3) {
		try {
			if (arg1.length <= arg3.length) {
				@Pc(19) int local19;
				for (@Pc(11) int local11 = 0; local11 <= arg3.length - arg1.length; local11 += local19) {
					@Pc(15) int local15 = local11;
					@Pc(17) int local17 = 0;
					local19 = 1;
					label59: while (true) {
						while (true) {
							if (local15 >= arg3.length) {
								break label59;
							}
							@Pc(27) char local27 = arg3[local15];
							@Pc(29) char local29 = 0;
							if (local15 + 1 < arg3.length) {
								local29 = arg3[local15 + 1];
							}
							@Pc(54) int local54;
							if (local17 < arg1.length && (local54 = method512(local27, local29, arg1[local17])) > 0) {
								local15 += local54;
								local17++;
							} else {
								if (local17 == 0) {
									break label59;
								}
								@Pc(75) int local75;
								if ((local75 = method512(local27, local29, arg1[local17 - 1])) > 0) {
									local15 += local75;
									if (local17 == 1) {
										local19++;
									}
								} else {
									if (local17 >= arg1.length || !method518(local27)) {
										break label59;
									}
									local15++;
								}
							}
						}
					}
					if (local17 >= arg1.length) {
						@Pc(106) boolean local106 = false;
						@Pc(112) int local112 = method504(local11, arg3, arg2);
						@Pc(120) int local120 = method505(arg0, (byte) 8, local15 - 1, arg3);
						if (local112 > 2 || local120 > 2) {
							local106 = true;
						}
						if (local106) {
							for (@Pc(132) int local132 = local11; local132 < local15; local132++) {
								arg3[local132] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(164) RuntimeException local164) {
			signlink.reporterror("68986, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + arg3 + ", " + local164.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "(ZI[C[C)I")
	private static int method504(@OriginalArg(1) int arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg0 == 0) {
				return 2;
			}
			for (@Pc(9) int local9 = arg0 - 1; local9 >= 0 && method518(arg1[local9]); local9--) {
				if (arg1[local9] == '@') {
					return 3;
				}
			}
			@Pc(38) int local38 = 0;
			for (@Pc(42) int local42 = arg0 - 1; local42 >= 0 && method518(arg2[local42]); local42--) {
				if (arg2[local42] == '*') {
					local38++;
				}
			}
			if (local38 >= 3) {
				return 4;
			} else if (method518(arg1[arg0 - 1])) {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("57527, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "([CBI[C)I")
	private static int method505(@OriginalArg(0) char[] arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) char[] arg3) {
		try {
			if (arg2 + 1 == arg3.length) {
				return 2;
			}
			@Pc(13) int local13 = arg2 + 1;
			while (true) {
				if (local13 < arg3.length && method518(arg3[local13])) {
					if (arg3[local13] != '.' && arg3[local13] != ',') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(43) boolean local43 = false;
				@Pc(49) int local49 = 0;
				for (@Pc(53) int local53 = arg2 + 1; local53 < arg3.length && method518(arg0[local53]); local53++) {
					if (arg0[local53] == '*') {
						local49++;
					}
				}
				if (local49 >= 3) {
					return 4;
				}
				if (method518(arg3[arg2 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("70966, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XWTMFQHB", name = "c", descriptor = "([CI)V")
	private static void method506(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(18) char[] local18 = new char[] { 'd', 'o', 't' };
			method510(local18, local3, null);
			@Pc(31) char[] local31 = (char[]) arg0.clone();
			@Pc(54) char[] local54 = new char[] { 's', 'l', 'a', 's', 'h' };
			method510(local54, local31, null);
			for (@Pc(61) int local61 = 0; local61 < aCharArrayArray3.length; local61++) {
				method507(local3, anIntArray199[local61], local31, aCharArrayArray3[local61], arg0);
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("15747, " + arg0 + ", " + -20 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "([CI[C[CZ[C)V")
	private static void method507(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) char[] arg3, @OriginalArg(5) char[] arg4) {
		try {
			if (arg3.length <= arg4.length) {
				@Pc(19) int local19;
				for (@Pc(11) int local11 = 0; local11 <= arg4.length - arg3.length; local11 += local19) {
					@Pc(15) int local15 = local11;
					@Pc(17) int local17 = 0;
					local19 = 1;
					label121: while (true) {
						while (true) {
							if (local15 >= arg4.length) {
								break label121;
							}
							@Pc(27) char local27 = arg4[local15];
							@Pc(29) char local29 = 0;
							if (local15 + 1 < arg4.length) {
								local29 = arg4[local15 + 1];
							}
							@Pc(54) int local54;
							if (local17 < arg3.length && (local54 = method512(local27, local29, arg3[local17])) > 0) {
								local15 += local54;
								local17++;
							} else {
								if (local17 == 0) {
									break label121;
								}
								@Pc(75) int local75;
								if ((local75 = method512(local27, local29, arg3[local17 - 1])) > 0) {
									local15 += local75;
									if (local17 == 1) {
										local19++;
									}
								} else {
									if (local17 >= arg3.length || !method518(local27)) {
										break label121;
									}
									local15++;
								}
							}
						}
					}
					if (local17 >= arg3.length) {
						@Pc(106) boolean local106 = false;
						@Pc(112) int local112 = method508(arg4, local11, arg0);
						@Pc(120) int local120 = method509(arg4, arg2, local15 - 1);
						if (arg1 == 1 && local112 > 0 && local120 > 0) {
							local106 = true;
						}
						if (arg1 == 2 && (local112 > 2 && local120 > 0 || local112 > 0 && local120 > 2)) {
							local106 = true;
						}
						if (arg1 == 3 && local112 > 0 && local120 > 2) {
							local106 = true;
						}
						@Pc(163) boolean local163;
						if (arg1 == 3 && local112 > 2 && local120 > 0) {
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
											if (arg0[local186] != '*') {
												break;
											}
											local170 = local186;
										} else if (arg0[local186] == '*') {
											local170 = local186;
											local182 = true;
										}
									}
								}
								local182 = false;
								for (local186 = local170 - 1; local186 >= 0; local186--) {
									if (local182) {
										if (method518(arg4[local186])) {
											break;
										}
										local170 = local186;
									} else if (!method518(arg4[local186])) {
										local182 = true;
										local170 = local186;
									}
								}
							}
							if (local120 > 2) {
								if (local120 == 4) {
									local182 = false;
									for (local186 = local174 + 1; local186 < arg4.length; local186++) {
										if (local182) {
											if (arg2[local186] != '*') {
												break;
											}
											local174 = local186;
										} else if (arg2[local186] == '*') {
											local174 = local186;
											local182 = true;
										}
									}
								}
								local182 = false;
								for (local186 = local174 + 1; local186 < arg4.length; local186++) {
									if (local182) {
										if (method518(arg4[local186])) {
											break;
										}
										local174 = local186;
									} else if (!method518(arg4[local186])) {
										local182 = true;
										local174 = local186;
									}
								}
							}
							for (@Pc(320) int local320 = local170; local320 <= local174; local320++) {
								arg4[local320] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(345) RuntimeException local345) {
			signlink.reporterror("29832, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + false + ", " + arg4 + ", " + local345.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "([CIB[C)I")
	private static int method508(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg1 == 0) {
				return 2;
			}
			@Pc(22) int local22 = arg1 - 1;
			while (true) {
				if (local22 >= 0 && method518(arg0[local22])) {
					if (arg0[local22] != ',' && arg0[local22] != '.') {
						local22--;
						continue;
					}
					return 3;
				}
				@Pc(47) int local47 = 0;
				for (@Pc(51) int local51 = arg1 - 1; local51 >= 0 && method518(arg2[local51]); local51--) {
					if (arg2[local51] == '*') {
						local47++;
					}
				}
				if (local47 >= 3) {
					return 4;
				}
				if (method518(arg0[arg1 - 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("73151, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "([CB[CI)I")
	private static int method509(@OriginalArg(0) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 + 1 == arg0.length) {
				return 2;
			}
			@Pc(13) int local13 = arg2 + 1;
			while (true) {
				if (local13 < arg0.length && method518(arg0[local13])) {
					if (arg0[local13] != '\\' && arg0[local13] != '/') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(40) int local40 = 0;
				for (@Pc(44) int local44 = arg2 + 1; local44 < arg0.length && method518(arg1[local44]); local44++) {
					if (arg1[local44] == '*') {
						local40++;
					}
				}
				if (local40 >= 5) {
					return 4;
				}
				if (method518(arg0[arg2 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("31963, " + arg0 + ", " + 20 + ", " + arg1 + ", " + arg2 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "(B[C[C[[B)V")
	private static void method510(@OriginalArg(1) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) byte[][] arg2) {
		try {
			if (arg0.length <= arg1.length) {
				@Pc(21) int local21;
				for (@Pc(11) int local11 = 0; local11 <= arg1.length - arg0.length; local11 += local21) {
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
							if (local17 < arg0.length && (local62 = method513(var12, var13, arg0[local17])) > 0) {
								if (local62 == 1 && method521(var12)) {
									local25 = true;
								}
								if (local62 == 2 && (method521(var12) || method521(var13))) {
									local25 = true;
								}
								local15 += local62;
								local17++;
							} else {
								if (local17 == 0) {
									break label165;
								}
								@Pc(105) int local105;
								if ((local105 = method513(var12, var13, arg0[local17 - 1])) > 0) {
									local15 += local105;
									if (local17 == 1) {
										local21++;
									}
								} else {
									if (local17 >= arg0.length || !method519(var12)) {
										break label165;
									}
									if (method518(var12) && var12 != '\'') {
										local23 = true;
									}
									if (method521(var12)) {
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
					if (local17 >= arg0.length && (!local25 || !local27)) {
						@Pc(170) boolean local170 = true;
						@Pc(266) int local266;
						if (local23) {
							@Pc(216) boolean local216 = false;
							@Pc(218) boolean local218 = false;
							if (local11 - 1 < 0 || method518(arg1[local11 - 1]) && arg1[local11 - 1] != '\'') {
								local216 = true;
							}
							if (local15 >= arg1.length || method518(arg1[local15]) && arg1[local15] != '\'') {
								local218 = true;
							}
							if (!local216 || !local218) {
								@Pc(262) boolean local262 = false;
								local266 = local11 - 2;
								if (local216) {
									local266 = local11;
								}
								while (!local262 && local266 < local15) {
									if (local266 >= 0 && (!method518(arg1[local266]) || arg1[local266] == '\'')) {
										@Pc(288) char[] local288 = new char[3];
										@Pc(290) int local290;
										for (local290 = 0; local290 < 3 && local266 + local290 < arg1.length && (!method518(arg1[local266 + local290]) || arg1[local266 + local290] == '\''); local290++) {
											local288[local290] = arg1[local266 + local290];
										}
										@Pc(328) boolean local328 = true;
										if (local290 == 0) {
											local328 = false;
										}
										if (local290 < 3 && local266 - 1 >= 0 && (!method518(arg1[local266 - 1]) || arg1[local266 - 1] == '\'')) {
											local328 = false;
										}
										if (local328 && !method524(local288)) {
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
							@Pc(198) byte local198 = method514(var12);
							@Pc(202) byte local202 = method514(var13);
							if (arg2 != null && method511(arg2, (byte) 6, local202, local198)) {
								local170 = false;
							}
						}
						if (local170) {
							@Pc(378) int local378 = 0;
							@Pc(380) int local380 = 0;
							@Pc(382) int local382 = -1;
							for (local266 = local11; local266 < local15; local266++) {
								if (method521(arg1[local266])) {
									local378++;
								} else if (method520(arg1[local266])) {
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
		} catch (@Pc(454) RuntimeException local454) {
			signlink.reporterror("71954, " + -45 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local454.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "([[BBBB)Z")
	private static boolean method511(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) byte arg3) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(16) int local16 = 0;
			if (arg0[0][0] == arg3 && arg0[0][1] == arg2) {
				return true;
			}
			@Pc(37) int local37 = arg0.length - 1;
			if (arg0[local37][0] == arg3 && arg0[local37][1] == arg2) {
				return true;
			}
			do {
				@Pc(59) int local59 = (local16 + local37) / 2;
				if (arg0[local59][0] == arg3 && arg0[local59][1] == arg2) {
					return true;
				}
				if (arg3 < arg0[local59][0] || arg3 == arg0[local59][0] && arg2 < arg0[local59][1]) {
					local37 = local59;
				} else {
					local16 = local59;
				}
			} while (local16 != local37 && local16 + 1 != local37);
			return false;
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("63153, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "(CZCC)I")
	private static int method512(@OriginalArg(0) char arg0, @OriginalArg(2) char arg1, @OriginalArg(3) char arg2) {
		try {
			if (arg2 == arg0) {
				return 1;
			} else if (arg2 == 'o' && arg0 == '0') {
				return 1;
			} else if (arg2 == 'o' && arg0 == '(' && arg1 == ')') {
				return 2;
			} else if (arg2 == 'c' && (arg0 == '(' || arg0 == '<' || arg0 == '[')) {
				return 1;
			} else if (arg2 == 'e' && arg0 == '€') {
				return 1;
			} else if (arg2 == 's' && arg0 == '$') {
				return 1;
			} else if (arg2 == 'l' && arg0 == 'i') {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("37758, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "(CCIC)I")
	private static int method513(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(3) char arg2) {
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
						if ((arg0 != '1' || arg1 != '3') && (arg0 != 'i' || arg1 != '3')) {
							return 0;
						}
						return 2;
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
					if ((arg0 != '[' || arg1 != ')') && (arg0 != 'i' || arg1 != ')')) {
						return 0;
					}
					return 2;
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
					if (arg0 != '9' && arg0 != '6' && arg0 != 'q') {
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
		} catch (@Pc(513) RuntimeException local513) {
			signlink.reporterror("6444, " + arg0 + ", " + arg1 + ", " + -32194 + ", " + arg2 + ", " + local513.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "(ZC)B")
	private static byte method514(@OriginalArg(1) char arg0) {
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
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("65198, " + false + ", " + arg0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "(B[C)V")
	private static void method515(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			@Pc(9) int local9 = 0;
			while (true) {
				do {
					@Pc(110) int local110;
					if ((local110 = method516(local5, arg0)) == -1) {
						return;
					}
					@Pc(15) boolean local15 = false;
					for (@Pc(17) int local17 = local5; local17 >= 0 && local17 < local110 && !local15; local17++) {
						if (!method518(arg0[local17]) && !method519(arg0[local17])) {
							local15 = true;
						}
					}
					if (local15) {
						local7 = 0;
					}
					if (local7 == 0) {
						local9 = local110;
					}
					local5 = method517(local110, arg0);
					@Pc(56) int local56 = 0;
					for (@Pc(58) int local58 = local110; local58 < local5; local58++) {
						local56 = local56 * 10 + arg0[local58] - 48;
					}
					if (local56 <= 255 && local5 - local110 <= 8) {
						local7++;
					} else {
						local7 = 0;
					}
				} while (local7 != 4);
				for (@Pc(92) int local92 = local9; local92 < local5; local92++) {
					arg0[local92] = '*';
				}
				local7 = 0;
			}
		} catch (@Pc(114) RuntimeException local114) {
			signlink.reporterror("77270, " + 72 + ", " + arg0 + ", " + local114.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "(IZ[C)I")
	private static int method516(@OriginalArg(0) int arg0, @OriginalArg(2) char[] arg1) {
		try {
			for (@Pc(1) int local1 = arg0; local1 < arg1.length && local1 >= 0; local1++) {
				if (arg1[local1] >= '0' && arg1[local1] <= '9') {
					return local1;
				}
			}
			return -1;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("78468, " + arg0 + ", " + false + ", " + arg1 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "(II[C)I")
	private static int method517(@OriginalArg(0) int arg0, @OriginalArg(2) char[] arg1) {
		try {
			@Pc(1) int local1 = arg0;
			while (true) {
				if (local1 < arg1.length && local1 >= 0) {
					if (arg1[local1] >= '0' && arg1[local1] <= '9') {
						local1++;
						continue;
					}
					return local1;
				}
				return arg1.length;
			}
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("85584, " + arg0 + ", " + -890 + ", " + arg1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "(CI)Z")
	private static boolean method518(@OriginalArg(0) char arg0) {
		try {
			return !method520(arg0) && !method521(arg0);
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("44431, " + arg0 + ", " + 1 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "(CB)Z")
	private static boolean method519(@OriginalArg(0) char arg0) {
		try {
			if (arg0 >= 'a' && arg0 <= 'z') {
				return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
			} else {
				return true;
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("4278, " + arg0 + ", " + -14 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XWTMFQHB", name = "b", descriptor = "(CI)Z")
	private static boolean method520(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("89659, " + arg0 + ", " + -616 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XWTMFQHB", name = "c", descriptor = "(CI)Z")
	private static boolean method521(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= '0' && arg0 <= '9';
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("95418, " + arg0 + ", " + -918 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "(IC)Z")
	private static boolean method522(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		try {
			@Pc(3) boolean local3 = false;
			return arg1 >= 'a' && arg1 <= 'z';
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("78361, " + arg0 + ", " + arg1 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XWTMFQHB", name = "d", descriptor = "(CI)Z")
	private static boolean method523(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("40027, " + arg0 + ", " + -741 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "([CZ)Z")
	private static boolean method524(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
				if (!method521(arg0[local11]) && arg0[local11] != '\u0000') {
					local3 = false;
				}
			}
			if (local3) {
				return true;
			}
			@Pc(38) int local38 = method525(arg0);
			@Pc(40) int local40 = 0;
			@Pc(45) int local45 = anIntArray198.length - 1;
			if (local38 == anIntArray198[0] || local38 == anIntArray198[local45]) {
				return true;
			}
			do {
				@Pc(63) int local63 = (local40 + local45) / 2;
				if (local38 == anIntArray198[local63]) {
					return true;
				}
				if (local38 < anIntArray198[local63]) {
					local45 = local63;
				} else {
					local40 = local63;
				}
			} while (local40 != local45 && local40 + 1 != local45);
			return false;
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("25186, " + arg0 + ", " + false + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "(I[C)I")
	private static int method525(@OriginalArg(1) char[] arg0) {
		try {
			if (arg0.length > 6) {
				return 0;
			}
			@Pc(9) int local9 = 0;
			for (@Pc(20) int local20 = 0; local20 < arg0.length; local20++) {
				@Pc(31) char local31 = arg0[arg0.length - local20 - 1];
				if (local31 >= 'a' && local31 <= 'z') {
					local9 = local9 * 38 + local31 + 1 - 'a';
				} else if (local31 == '\'') {
					local9 = local9 * 38 + 27;
				} else if (local31 >= '0' && local31 <= '9') {
					local9 = local9 * 38 + local31 + 28 - '0';
				} else if (local31 != '\u0000') {
					return 0;
				}
			}
			return local9;
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("55544, " + -13705 + ", " + arg0 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}
}
