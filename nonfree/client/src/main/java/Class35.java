import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!RKAYAFDQ")
public final class Class35 {

	@OriginalMember(owner = "client!RKAYAFDQ", name = "b", descriptor = "Z")
	private static boolean aBoolean159;

	@OriginalMember(owner = "client!RKAYAFDQ", name = "f", descriptor = "I")
	private static int anInt647;

	@OriginalMember(owner = "client!RKAYAFDQ", name = "o", descriptor = "[I")
	private static int[] anIntArray119;

	@OriginalMember(owner = "client!RKAYAFDQ", name = "p", descriptor = "[[C")
	private static char[][] aCharArrayArray1;

	@OriginalMember(owner = "client!RKAYAFDQ", name = "q", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!RKAYAFDQ", name = "r", descriptor = "[[C")
	private static char[][] aCharArrayArray2;

	@OriginalMember(owner = "client!RKAYAFDQ", name = "s", descriptor = "[[C")
	private static char[][] aCharArrayArray3;

	@OriginalMember(owner = "client!RKAYAFDQ", name = "t", descriptor = "[I")
	private static int[] anIntArray120;

	@OriginalMember(owner = "client!RKAYAFDQ", name = "a", descriptor = "I")
	private static int anInt644 = 9;

	@OriginalMember(owner = "client!RKAYAFDQ", name = "c", descriptor = "I")
	private static int anInt645 = 748;

	@OriginalMember(owner = "client!RKAYAFDQ", name = "d", descriptor = "I")
	private static int anInt646 = 201;

	@OriginalMember(owner = "client!RKAYAFDQ", name = "e", descriptor = "Z")
	private static boolean aBoolean160 = true;

	@OriginalMember(owner = "client!RKAYAFDQ", name = "g", descriptor = "B")
	private static byte aByte19 = -117;

	@OriginalMember(owner = "client!RKAYAFDQ", name = "h", descriptor = "I")
	private static int anInt648 = -575;

	@OriginalMember(owner = "client!RKAYAFDQ", name = "i", descriptor = "Z")
	private static boolean aBoolean161 = true;

	@OriginalMember(owner = "client!RKAYAFDQ", name = "j", descriptor = "I")
	private static int anInt649 = -720;

	@OriginalMember(owner = "client!RKAYAFDQ", name = "k", descriptor = "I")
	private static int anInt650 = -511;

	@OriginalMember(owner = "client!RKAYAFDQ", name = "l", descriptor = "B")
	private static byte aByte20 = 4;

	@OriginalMember(owner = "client!RKAYAFDQ", name = "m", descriptor = "I")
	private static int anInt651 = 8801;

	@OriginalMember(owner = "client!RKAYAFDQ", name = "n", descriptor = "Z")
	private static boolean aBoolean162 = true;

	@OriginalMember(owner = "client!RKAYAFDQ", name = "u", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray5 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

	@OriginalMember(owner = "client!RKAYAFDQ", name = "a", descriptor = "(Lclient!XTGLDHGX;)V")
	public static void method411(@OriginalArg(0) Class44 arg0) {
		@Pc(10) Class1_Sub1_Sub3 local10 = new Class1_Sub1_Sub3(arg0.method484("fragmentsenc.txt", null), 891);
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(arg0.method484("badenc.txt", null), 891);
		@Pc(28) Class1_Sub1_Sub3 local28 = new Class1_Sub1_Sub3(arg0.method484("domainenc.txt", null), 891);
		@Pc(37) Class1_Sub1_Sub3 local37 = new Class1_Sub1_Sub3(arg0.method484("tldlist.txt", null), 891);
		method412(local10, local19, local28, local37);
	}

	@OriginalMember(owner = "client!RKAYAFDQ", name = "a", descriptor = "(Lclient!MBMGIXGO;Lclient!MBMGIXGO;Lclient!MBMGIXGO;Lclient!MBMGIXGO;)V")
	private static void method412(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) Class1_Sub1_Sub3 arg2, @OriginalArg(3) Class1_Sub1_Sub3 arg3) {
		method414(arg1);
		method415(arg2);
		method416(arg0);
		method413(arg3);
	}

	@OriginalMember(owner = "client!RKAYAFDQ", name = "a", descriptor = "(BLclient!MBMGIXGO;)V")
	private static void method413(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(4) int local4 = arg0.method273();
			aCharArrayArray3 = new char[local4][];
			anIntArray120 = new int[local4];
			for (@Pc(16) int local16 = 0; local16 < local4; local16++) {
				anIntArray120[local16] = arg0.method268();
				@Pc(27) char[] local27 = new char[arg0.method268()];
				for (@Pc(29) int local29 = 0; local29 < local27.length; local29++) {
					local27[local29] = (char) arg0.method268();
				}
				aCharArrayArray3[local16] = local27;
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("65552, " + 2 + ", " + arg0 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RKAYAFDQ", name = "a", descriptor = "(ILclient!MBMGIXGO;)V")
	private static void method414(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(11) int local11 = arg0.method273();
			aCharArrayArray1 = new char[local11][];
			aByteArrayArrayArray7 = new byte[local11][][];
			method417(arg0, aCharArrayArray1, aByteArrayArrayArray7);
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("10223, " + 9121 + ", " + arg0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RKAYAFDQ", name = "a", descriptor = "(Lclient!MBMGIXGO;B)V")
	private static void method415(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(2) int local2 = arg0.method273();
			aCharArrayArray2 = new char[local2][];
			method418(aCharArrayArray2, arg0);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("41706, " + arg0 + ", " + -28 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RKAYAFDQ", name = "a", descriptor = "(Lclient!MBMGIXGO;Z)V")
	private static void method416(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			anIntArray119 = new int[arg0.method273()];
			for (@Pc(5) int local5 = 0; local5 < anIntArray119.length; local5++) {
				anIntArray119[local5] = arg0.method270();
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("99878, " + arg0 + ", " + true + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RKAYAFDQ", name = "a", descriptor = "(Lclient!MBMGIXGO;[[CZ[[[B)V")
	private static void method417(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) char[][] arg1, @OriginalArg(3) byte[][][] arg2) {
		try {
			for (@Pc(12) int local12 = 0; local12 < arg1.length; local12++) {
				@Pc(18) char[] local18 = new char[arg0.method268()];
				for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
					local18[local20] = (char) arg0.method268();
				}
				arg1[local12] = local18;
				@Pc(42) byte[][] local42 = new byte[arg0.method268()][2];
				for (@Pc(44) int local44 = 0; local44 < local42.length; local44++) {
					local42[local44][0] = (byte) arg0.method268();
					local42[local44][1] = (byte) arg0.method268();
				}
				if (local42.length > 0) {
					arg2[local12] = local42;
				}
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("31244, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RKAYAFDQ", name = "a", descriptor = "([[CLclient!MBMGIXGO;I)V")
	private static void method418(@OriginalArg(0) char[][] arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			for (@Pc(6) int local6 = 0; local6 < arg0.length; local6++) {
				@Pc(12) char[] local12 = new char[arg1.method268()];
				for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
					local12[local14] = (char) arg1.method268();
				}
				arg0[local6] = local12;
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("79837, " + arg0 + ", " + arg1 + ", " + -490 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RKAYAFDQ", name = "a", descriptor = "(Z[C)V")
	private static void method419(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) int local3 = 0;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				if (method420(arg0[local5], anInt647)) {
					arg0[local3] = arg0[local5];
				} else {
					arg0[local3] = ' ';
				}
				if (local3 == 0 || arg0[local3] != ' ' || arg0[local3 - 1] != ' ') {
					local3++;
				}
			}
			for (@Pc(50) int local50 = local3; local50 < arg0.length; local50++) {
				arg0[local50] = ' ';
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("14393, " + false + ", " + arg0 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RKAYAFDQ", name = "a", descriptor = "(CI)Z")
	private static boolean method420(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 != 0) {
				throw new NullPointerException();
			}
			return arg0 >= ' ' && arg0 <= '\u007f' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("65557, " + arg0 + ", " + arg1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RKAYAFDQ", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method421(@OriginalArg(0) String arg0) {
		try {
			@Pc(3) long local3 = System.currentTimeMillis();
			@Pc(6) char[] local6 = arg0.toCharArray();
			method419(local6);
			@Pc(15) String local15 = (new String(local6)).trim();
			@Pc(19) char[] local19 = local15.toLowerCase().toCharArray();
			@Pc(22) String local22 = local15.toLowerCase();
			method429(local19);
			method424(local19);
			method425(local19);
			method438(local19);
			for (@Pc(42) int local42 = 0; local42 < aStringArray5.length; local42++) {
				@Pc(52) int local52 = -1;
				while ((local52 = local22.indexOf(aStringArray5[local42], local52 + 1)) != -1) {
					@Pc(59) char[] local59 = aStringArray5[local42].toCharArray();
					for (@Pc(61) int local61 = 0; local61 < local59.length; local61++) {
						local19[local61 + local52] = local59[local61];
					}
				}
			}
			method422(local15.toCharArray(), local19);
			method423(local19);
			@Pc(103) long local103 = System.currentTimeMillis();
			return (new String(local19)).trim();
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("44439, " + arg0 + ", " + 0 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RKAYAFDQ", name = "a", descriptor = "([CI[C)V")
	private static void method422(@OriginalArg(0) char[] arg0, @OriginalArg(2) char[] arg1) {
		try {
			for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
				if (arg1[local1] != '*' && method446(arg0[local1])) {
					arg1[local1] = arg0[local1];
				}
			}
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("66493, " + arg0 + ", " + 2 + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RKAYAFDQ", name = "a", descriptor = "(I[C)V")
	private static void method423(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				@Pc(11) char local11 = arg0[local5];
				if (!method443(local11)) {
					local3 = true;
				} else if (local3) {
					if (method445(local11)) {
						local3 = false;
					}
				} else if (method446(local11)) {
					arg0[local5] = (char) (local11 + 'a' - 65);
				}
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("29891, " + 0 + ", " + arg0 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RKAYAFDQ", name = "a", descriptor = "([CZ)V")
	private static void method424(@OriginalArg(0) char[] arg0) {
		try {
			for (@Pc(6) int local6 = 0; local6 < 2; local6++) {
				for (@Pc(13) int local13 = aCharArrayArray1.length - 1; local13 >= 0; local13--) {
					method433(aByteArrayArrayArray7[local13], arg0, anInt648, aCharArrayArray1[local13]);
				}
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("1109, " + arg0 + ", " + true + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RKAYAFDQ", name = "a", descriptor = "(B[C)V")
	private static void method425(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(18) char[] local18 = new char[] { '(', 'a', ')' };
			method433(null, local3, anInt648, local18);
			@Pc(27) char[] local27 = (char[]) arg0.clone();
			@Pc(42) char[] local42 = new char[] { 'd', 'o', 't' };
			method433(null, local27, anInt648, local42);
			for (@Pc(52) int local52 = aCharArrayArray2.length - 1; local52 >= 0; local52--) {
				method426(arg0, aCharArrayArray2[local52], local27, local3);
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("73832, " + 0 + ", " + arg0 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RKAYAFDQ", name = "a", descriptor = "(I[C[C[C[C)V")
	private static void method426(@OriginalArg(1) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2, @OriginalArg(4) char[] arg3) {
		try {
			if (arg1.length <= arg0.length) {
				@Pc(23) int local23;
				for (@Pc(15) int local15 = 0; local15 <= arg0.length - arg1.length; local15 += local23) {
					@Pc(19) int local19 = local15;
					@Pc(21) int local21 = 0;
					local23 = 1;
					label58: while (true) {
						while (true) {
							if (local19 >= arg0.length) {
								break label58;
							}
							@Pc(31) char local31 = arg0[local19];
							@Pc(33) char local33 = 0;
							if (local19 + 1 < arg0.length) {
								local33 = arg0[local19 + 1];
							}
							@Pc(58) int local58;
							if (local21 < arg1.length && (local58 = method435(local31, arg1[local21], local33)) > 0) {
								local19 += local58;
								local21++;
							} else {
								if (local21 == 0) {
									break label58;
								}
								@Pc(79) int local79;
								if ((local79 = method435(local31, arg1[local21 - 1], local33)) > 0) {
									local19 += local79;
									if (local21 == 1) {
										local23++;
									}
								} else {
									if (local21 >= arg1.length || !method441(local31)) {
										break label58;
									}
									local19++;
								}
							}
						}
					}
					if (local21 >= arg1.length) {
						@Pc(110) boolean local110 = false;
						@Pc(116) int local116 = method427(arg0, arg3, local15);
						@Pc(124) int local124 = method428(aByte19, arg2, local19 - 1, arg0);
						if (local116 > 2 || local124 > 2) {
							local110 = true;
						}
						if (local110) {
							for (@Pc(136) int local136 = local15; local136 < local19; local136++) {
								arg0[local136] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("48695, " + 29200 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RKAYAFDQ", name = "a", descriptor = "([CI[CI)I")
	private static int method427(@OriginalArg(0) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 == 0) {
				return 2;
			}
			for (@Pc(17) int local17 = arg2 - 1; local17 >= 0 && method441(arg0[local17]); local17--) {
				if (arg0[local17] == '@') {
					return 3;
				}
			}
			@Pc(37) int local37 = 0;
			for (@Pc(41) int local41 = arg2 - 1; local41 >= 0 && method441(arg1[local41]); local41--) {
				if (arg1[local41] == '*') {
					local37++;
				}
			}
			if (local37 >= 3) {
				return 4;
			} else if (method441(arg0[arg2 - 1])) {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("87152, " + arg0 + ", " + 4 + ", " + arg1 + ", " + arg2 + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RKAYAFDQ", name = "a", descriptor = "(B[CI[C)I")
	private static int method428(@OriginalArg(0) byte arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) char[] arg3) {
		try {
			if (arg2 + 1 == arg3.length) {
				return 2;
			}
			@Pc(13) int local13 = arg2 + 1;
			while (true) {
				if (local13 < arg3.length && method441(arg3[local13])) {
					if (arg3[local13] != '.' && arg3[local13] != ',') {
						local13++;
						continue;
					}
					return 3;
				}
				if (arg0 != -117) {
					return anInt648;
				}
				@Pc(45) int local45 = 0;
				for (@Pc(49) int local49 = arg2 + 1; local49 < arg3.length && method441(arg1[local49]); local49++) {
					if (arg1[local49] == '*') {
						local45++;
					}
				}
				if (local45 >= 3) {
					return 4;
				}
				if (method441(arg3[arg2 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("50081, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RKAYAFDQ", name = "b", descriptor = "(Z[C)V")
	private static void method429(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(18) char[] local18 = new char[] { 'd', 'o', 't' };
			method433(null, local3, anInt648, local18);
			@Pc(30) char[] local30 = (char[]) arg0.clone();
			@Pc(53) char[] local53 = new char[] { 's', 'l', 'a', 's', 'h' };
			method433(null, local30, anInt648, local53);
			for (@Pc(60) int local60 = 0; local60 < aCharArrayArray3.length; local60++) {
				method430(local30, aCharArrayArray3[local60], anIntArray120[local60], local3, arg0);
			}
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("41909, " + false + ", " + arg0 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RKAYAFDQ", name = "a", descriptor = "([C[CIB[C[C)V")
	private static void method430(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) char[] arg3, @OriginalArg(5) char[] arg4) {
		try {
			if (arg1.length <= arg4.length) {
				@Pc(19) int local19;
				for (@Pc(11) int local11 = 0; local11 <= arg4.length - arg1.length; local11 += local19) {
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
							if (local17 < arg1.length && (local54 = method435(local27, arg1[local17], local29)) > 0) {
								local15 += local54;
								local17++;
							} else {
								if (local17 == 0) {
									break label121;
								}
								@Pc(75) int local75;
								if ((local75 = method435(local27, arg1[local17 - 1], local29)) > 0) {
									local15 += local75;
									if (local17 == 1) {
										local19++;
									}
								} else {
									if (local17 >= arg1.length || !method441(local27)) {
										break label121;
									}
									local15++;
								}
							}
						}
					}
					if (local17 >= arg1.length) {
						@Pc(106) boolean local106 = false;
						@Pc(112) int local112 = method431(arg4, local11, arg3);
						@Pc(120) int local120 = method432(arg4, arg0, local15 - 1);
						if (arg2 == 1 && local112 > 0 && local120 > 0) {
							local106 = true;
						}
						if (arg2 == 2 && (local112 > 2 && local120 > 0 || local112 > 0 && local120 > 2)) {
							local106 = true;
						}
						if (arg2 == 3 && local112 > 0 && local120 > 2) {
							local106 = true;
						}
						@Pc(163) boolean local163;
						if (arg2 == 3 && local112 > 2 && local120 > 0) {
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
											if (arg3[local186] != '*') {
												break;
											}
											local170 = local186;
										} else if (arg3[local186] == '*') {
											local170 = local186;
											local182 = true;
										}
									}
								}
								local182 = false;
								for (local186 = local170 - 1; local186 >= 0; local186--) {
									if (local182) {
										if (method441(arg4[local186])) {
											break;
										}
										local170 = local186;
									} else if (!method441(arg4[local186])) {
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
											if (arg0[local186] != '*') {
												break;
											}
											local174 = local186;
										} else if (arg0[local186] == '*') {
											local174 = local186;
											local182 = true;
										}
									}
								}
								local182 = false;
								for (local186 = local174 + 1; local186 < arg4.length; local186++) {
									if (local182) {
										if (method441(arg4[local186])) {
											break;
										}
										local174 = local186;
									} else if (!method441(arg4[local186])) {
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
		} catch (@Pc(352) RuntimeException local352) {
			signlink.reporterror("17314, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 51 + ", " + arg3 + ", " + arg4 + ", " + local352.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RKAYAFDQ", name = "a", descriptor = "(I[CI[C)I")
	private static int method431(@OriginalArg(1) char[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg1 == 0) {
				return 2;
			}
			@Pc(9) int local9 = arg1 - 1;
			while (true) {
				if (local9 >= 0 && method441(arg0[local9])) {
					if (arg0[local9] != ',' && arg0[local9] != '.') {
						local9--;
						continue;
					}
					return 3;
				}
				@Pc(34) int local34 = 0;
				for (@Pc(38) int local38 = arg1 - 1; local38 >= 0 && method441(arg2[local38]); local38--) {
					if (arg2[local38] == '*') {
						local34++;
					}
				}
				if (local34 >= 3) {
					return 4;
				}
				if (method441(arg0[arg1 - 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("50325, " + 36209 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RKAYAFDQ", name = "a", descriptor = "(Z[C[CI)I")
	private static int method432(@OriginalArg(1) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 + 1 == arg0.length) {
				return 2;
			}
			@Pc(17) int local17 = arg2 + 1;
			while (true) {
				if (local17 < arg0.length && method441(arg0[local17])) {
					if (arg0[local17] != '\\' && arg0[local17] != '/') {
						local17++;
						continue;
					}
					return 3;
				}
				@Pc(44) int local44 = 0;
				for (@Pc(48) int local48 = arg2 + 1; local48 < arg0.length && method441(arg1[local48]); local48++) {
					if (arg1[local48] == '*') {
						local44++;
					}
				}
				if (local44 >= 5) {
					return 4;
				}
				if (method441(arg0[arg2 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("27208, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RKAYAFDQ", name = "a", descriptor = "([[B[CI[C)V")
	private static void method433(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) char[] arg3) {
		try {
			if (arg2 < 0 && arg3.length <= arg1.length) {
				@Pc(26) int local26;
				for (@Pc(16) int local16 = 0; local16 <= arg1.length - arg3.length; local16 += local26) {
					@Pc(20) int local20 = local16;
					@Pc(22) int local22 = 0;
					@Pc(24) int local24 = 0;
					local26 = 1;
					@Pc(28) boolean local28 = false;
					@Pc(30) boolean local30 = false;
					@Pc(32) boolean local32 = false;
					@Pc(40) char var13;
					@Pc(42) char var14;
					label169: while (true) {
						while (true) {
							if (local20 >= arg1.length || local30 && local32) {
								break label169;
							}
							var13 = arg1[local20];
							var14 = '\u0000';
							if (local20 + 1 < arg1.length) {
								var14 = arg1[local20 + 1];
							}
							@Pc(67) int local67;
							if (local22 < arg3.length && (local67 = method436(var14, var13, aBoolean161, arg3[local22])) > 0) {
								if (local67 == 1 && method444(var13)) {
									local30 = true;
								}
								if (local67 == 2 && (method444(var13) || method444(var14))) {
									local30 = true;
								}
								local20 += local67;
								local22++;
							} else {
								if (local22 == 0) {
									break label169;
								}
								@Pc(110) int local110;
								if ((local110 = method436(var14, var13, aBoolean161, arg3[local22 - 1])) > 0) {
									local20 += local110;
									if (local22 == 1) {
										local26++;
									}
								} else {
									if (local22 >= arg3.length || !method442(var13)) {
										break label169;
									}
									if (method441(var13) && var13 != '\'') {
										local28 = true;
									}
									if (method444(var13)) {
										local32 = true;
									}
									local20++;
									local24++;
									if (local24 * 100 / (local20 - local16) > 90) {
										break label169;
									}
								}
							}
						}
					}
					if (local22 >= arg3.length && (!local30 || !local32)) {
						@Pc(175) boolean local175 = true;
						@Pc(271) int local271;
						if (local28) {
							@Pc(221) boolean local221 = false;
							@Pc(223) boolean local223 = false;
							if (local16 - 1 < 0 || method441(arg1[local16 - 1]) && arg1[local16 - 1] != '\'') {
								local221 = true;
							}
							if (local20 >= arg1.length || method441(arg1[local20]) && arg1[local20] != '\'') {
								local223 = true;
							}
							if (!local221 || !local223) {
								@Pc(267) boolean local267 = false;
								local271 = local16 - 2;
								if (local221) {
									local271 = local16;
								}
								while (!local267 && local271 < local20) {
									if (local271 >= 0 && (!method441(arg1[local271]) || arg1[local271] == '\'')) {
										@Pc(293) char[] local293 = new char[3];
										@Pc(295) int local295;
										for (local295 = 0; local295 < 3 && local271 + local295 < arg1.length && (!method441(arg1[local271 + local295]) || arg1[local271 + local295] == '\''); local295++) {
											local293[local295] = arg1[local271 + local295];
										}
										@Pc(333) boolean local333 = true;
										if (local295 == 0) {
											local333 = false;
										}
										if (local295 < 3 && local271 - 1 >= 0 && (!method441(arg1[local271 - 1]) || arg1[local271 - 1] == '\'')) {
											local333 = false;
										}
										if (local333 && !method447(local293, (byte) 4)) {
											local267 = true;
										}
									}
									local271++;
								}
								if (!local267) {
									local175 = false;
								}
							}
						} else {
							var13 = ' ';
							if (local16 - 1 >= 0) {
								var13 = arg1[local16 - 1];
							}
							var14 = ' ';
							if (local20 < arg1.length) {
								var14 = arg1[local20];
							}
							@Pc(203) byte local203 = method437(var13, anInt649);
							@Pc(207) byte local207 = method437(var14, anInt649);
							if (arg0 != null && method434(local203, arg0, local207)) {
								local175 = false;
							}
						}
						if (local175) {
							@Pc(383) int local383 = 0;
							@Pc(385) int local385 = 0;
							@Pc(387) int local387 = -1;
							for (local271 = local16; local271 < local20; local271++) {
								if (method444(arg1[local271])) {
									local383++;
								} else if (method443(arg1[local271])) {
									local385++;
									local387 = local271;
								}
							}
							if (local387 > -1) {
								local383 -= local20 - local387 - 1;
							}
							if (local383 <= local385) {
								for (@Pc(429) int local429 = local16; local429 < local20; local429++) {
									arg1[local429] = '*';
								}
							} else {
								local26 = 1;
							}
						}
					}
				}
			}
		} catch (@Pc(456) RuntimeException local456) {
			signlink.reporterror("25459, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local456.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RKAYAFDQ", name = "a", descriptor = "(BB[[BB)Z")
	private static boolean method434(@OriginalArg(0) byte arg0, @OriginalArg(2) byte[][] arg1, @OriginalArg(3) byte arg2) {
		try {
			@Pc(1) int local1 = 0;
			if (arg1[0][0] == arg0 && arg1[0][1] == arg2) {
				return true;
			}
			@Pc(27) int local27 = arg1.length - 1;
			if (arg1[local27][0] == arg0 && arg1[local27][1] == arg2) {
				return true;
			}
			do {
				@Pc(49) int local49 = (local1 + local27) / 2;
				if (arg1[local49][0] == arg0 && arg1[local49][1] == arg2) {
					return true;
				}
				if (arg0 < arg1[local49][0] || arg0 == arg1[local49][0] && arg2 < arg1[local49][1]) {
					local27 = local49;
				} else {
					local1 = local49;
				}
			} while (local1 != local27 && local1 + 1 != local27);
			return false;
		} catch (@Pc(103) RuntimeException local103) {
			signlink.reporterror("67276, " + arg0 + ", " + 8 + ", " + arg1 + ", " + arg2 + ", " + local103.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RKAYAFDQ", name = "a", descriptor = "(ICCC)I")
	private static int method435(@OriginalArg(1) char arg0, @OriginalArg(2) char arg1, @OriginalArg(3) char arg2) {
		try {
			if (arg1 == arg0) {
				return 1;
			} else if (arg1 == 'o' && arg0 == '0') {
				return 1;
			} else if (arg1 == 'o' && arg0 == '(' && arg2 == ')') {
				return 2;
			} else if (arg1 == 'c' && (arg0 == '(' || arg0 == '<' || arg0 == '[')) {
				return 1;
			} else if (arg1 == 'e' && arg0 == '€') {
				return 1;
			} else if (arg1 == 's' && arg0 == '$') {
				return 1;
			} else if (arg1 == 'l' && arg0 == 'i') {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("60577, " + 43 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RKAYAFDQ", name = "a", descriptor = "(CCZC)I")
	private static int method436(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) char arg3) {
		try {
			if (!arg2) {
				anInt648 = -260;
			}
			if (arg3 == arg1) {
				return 1;
			}
			if (arg3 >= 'a' && arg3 <= 'm') {
				if (arg3 == 'a') {
					if (arg1 != '4' && arg1 != '@' && arg1 != '^') {
						if (arg1 == '/' && arg0 == '\\') {
							return 2;
						}
						return 0;
					}
					return 1;
				}
				if (arg3 == 'b') {
					if (arg1 != '6' && arg1 != '8') {
						if ((arg1 != '1' || arg0 != '3') && (arg1 != 'i' || arg0 != '3')) {
							return 0;
						}
						return 2;
					}
					return 1;
				}
				if (arg3 == 'c') {
					if (arg1 != '(' && arg1 != '<' && arg1 != '{' && arg1 != '[') {
						return 0;
					}
					return 1;
				}
				if (arg3 == 'd') {
					if ((arg1 != '[' || arg0 != ')') && (arg1 != 'i' || arg0 != ')')) {
						return 0;
					}
					return 2;
				}
				if (arg3 == 'e') {
					if (arg1 != '3' && arg1 != '€') {
						return 0;
					}
					return 1;
				}
				if (arg3 == 'f') {
					if (arg1 == 'p' && arg0 == 'h') {
						return 2;
					}
					if (arg1 == '£') {
						return 1;
					}
					return 0;
				}
				if (arg3 == 'g') {
					if (arg1 != '9' && arg1 != '6' && arg1 != 'q') {
						return 0;
					}
					return 1;
				}
				if (arg3 == 'h') {
					if (arg1 == '#') {
						return 1;
					}
					return 0;
				}
				if (arg3 == 'i') {
					if (arg1 != 'y' && arg1 != 'l' && arg1 != 'j' && arg1 != '1' && arg1 != '!' && arg1 != ':' && arg1 != ';' && arg1 != '|') {
						return 0;
					}
					return 1;
				}
				if (arg3 == 'j') {
					return 0;
				}
				if (arg3 == 'k') {
					return 0;
				}
				if (arg3 == 'l') {
					if (arg1 != '1' && arg1 != '|' && arg1 != 'i') {
						return 0;
					}
					return 1;
				}
				if (arg3 == 'm') {
					return 0;
				}
			}
			if (arg3 >= 'n' && arg3 <= 'z') {
				if (arg3 == 'n') {
					return 0;
				}
				if (arg3 == 'o') {
					if (arg1 != '0' && arg1 != '*') {
						if ((arg1 != '(' || arg0 != ')') && (arg1 != '[' || arg0 != ']') && (arg1 != '{' || arg0 != '}') && (arg1 != '<' || arg0 != '>')) {
							return 0;
						}
						return 2;
					}
					return 1;
				}
				if (arg3 == 'p') {
					return 0;
				}
				if (arg3 == 'q') {
					return 0;
				}
				if (arg3 == 'r') {
					return 0;
				}
				if (arg3 == 's') {
					if (arg1 != '5' && arg1 != 'z' && arg1 != '$' && arg1 != '2') {
						return 0;
					}
					return 1;
				}
				if (arg3 == 't') {
					if (arg1 != '7' && arg1 != '+') {
						return 0;
					}
					return 1;
				}
				if (arg3 == 'u') {
					if (arg1 == 'v') {
						return 1;
					}
					if ((arg1 != '\\' || arg0 != '/') && (arg1 != '\\' || arg0 != '|') && (arg1 != '|' || arg0 != '/')) {
						return 0;
					}
					return 2;
				}
				if (arg3 == 'v') {
					if ((arg1 != '\\' || arg0 != '/') && (arg1 != '\\' || arg0 != '|') && (arg1 != '|' || arg0 != '/')) {
						return 0;
					}
					return 2;
				}
				if (arg3 == 'w') {
					if (arg1 == 'v' && arg0 == 'v') {
						return 2;
					}
					return 0;
				}
				if (arg3 == 'x') {
					if ((arg1 != ')' || arg0 != '(') && (arg1 != '}' || arg0 != '{') && (arg1 != ']' || arg0 != '[') && (arg1 != '>' || arg0 != '<')) {
						return 0;
					}
					return 2;
				}
				if (arg3 == 'y') {
					return 0;
				}
				if (arg3 == 'z') {
					return 0;
				}
			}
			if (arg3 >= '0' && arg3 <= '9') {
				if (arg3 == '0') {
					if (arg1 == 'o' || arg1 == 'O') {
						return 1;
					} else if ((arg1 != '(' || arg0 != ')') && (arg1 != '{' || arg0 != '}') && (arg1 != '[' || arg0 != ']')) {
						return 0;
					} else {
						return 2;
					}
				} else if (arg3 == '1') {
					return arg1 == 'l' ? 1 : 0;
				} else {
					return 0;
				}
			} else if (arg3 == ',') {
				return arg1 == '.' ? 1 : 0;
			} else if (arg3 == '.') {
				return arg1 == ',' ? 1 : 0;
			} else if (arg3 == '!') {
				return arg1 == 'i' ? 1 : 0;
			} else {
				return 0;
			}
		} catch (@Pc(512) RuntimeException local512) {
			signlink.reporterror("9538, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local512.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RKAYAFDQ", name = "b", descriptor = "(CI)B")
	private static byte method437(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		try {
			while (arg1 >= 0) {
				anInt644 = -93;
			}
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
			signlink.reporterror("52349, " + arg0 + ", " + arg1 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RKAYAFDQ", name = "a", descriptor = "([CI)V")
	private static void method438(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			@Pc(9) int local9 = 0;
			while (true) {
				do {
					@Pc(116) int local116;
					if ((local116 = method439(arg0, local5, 319)) == -1) {
						return;
					}
					@Pc(21) boolean local21 = false;
					for (@Pc(23) int local23 = local5; local23 >= 0 && local23 < local116 && !local21; local23++) {
						if (!method441(arg0[local23]) && !method442(arg0[local23])) {
							local21 = true;
						}
					}
					if (local21) {
						local7 = 0;
					}
					if (local7 == 0) {
						local9 = local116;
					}
					local5 = method440(arg0, local116);
					@Pc(62) int local62 = 0;
					for (@Pc(64) int local64 = local116; local64 < local5; local64++) {
						local62 = local62 * 10 + arg0[local64] - 48;
					}
					if (local62 <= 255 && local5 - local116 <= 8) {
						local7++;
					} else {
						local7 = 0;
					}
				} while (local7 != 4);
				for (@Pc(98) int local98 = local9; local98 < local5; local98++) {
					arg0[local98] = '*';
				}
				local7 = 0;
			}
		} catch (@Pc(120) RuntimeException local120) {
			signlink.reporterror("38921, " + arg0 + ", " + -511 + ", " + local120.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RKAYAFDQ", name = "a", descriptor = "([CII)I")
	private static int method439(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(3) boolean local3 = false;
			for (@Pc(5) int local5 = arg1; local5 < arg0.length && local5 >= 0; local5++) {
				if (arg0[local5] >= '0' && arg0[local5] <= '9') {
					return local5;
				}
			}
			return -1;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("27983, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RKAYAFDQ", name = "b", descriptor = "([CII)I")
	private static int method440(@OriginalArg(0) char[] arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(1) int local1 = arg1;
			while (true) {
				if (local1 < arg0.length && local1 >= 0) {
					if (arg0[local1] >= '0' && arg0[local1] <= '9') {
						local1++;
						continue;
					}
					return local1;
				}
				return arg0.length;
			}
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("1466, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RKAYAFDQ", name = "a", descriptor = "(IC)Z")
	private static boolean method441(@OriginalArg(1) char arg0) {
		try {
			return !method443(arg0) && !method444(arg0);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("18641, " + -12789 + ", " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RKAYAFDQ", name = "a", descriptor = "(ZC)Z")
	private static boolean method442(@OriginalArg(1) char arg0) {
		try {
			if (arg0 >= 'a' && arg0 <= 'z') {
				return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
			} else {
				return true;
			}
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("32846, " + false + ", " + arg0 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RKAYAFDQ", name = "c", descriptor = "(CI)Z")
	private static boolean method443(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("61160, " + arg0 + ", " + -46837 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RKAYAFDQ", name = "d", descriptor = "(CI)Z")
	private static boolean method444(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= '0' && arg0 <= '9';
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("30488, " + arg0 + ", " + -976 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RKAYAFDQ", name = "e", descriptor = "(CI)Z")
	private static boolean method445(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z';
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("25533, " + arg0 + ", " + 1 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RKAYAFDQ", name = "b", descriptor = "(ZC)Z")
	private static boolean method446(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("1272, " + true + ", " + arg0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RKAYAFDQ", name = "a", descriptor = "([CB)Z")
	private static boolean method447(@OriginalArg(0) char[] arg0, @OriginalArg(1) byte arg1) {
		try {
			if (aByte20 != 4) {
				throw new NullPointerException();
			}
			@Pc(6) boolean local6 = false;
			@Pc(13) boolean local13 = true;
			for (@Pc(15) int local15 = 0; local15 < arg0.length; local15++) {
				if (!method444(arg0[local15]) && arg0[local15] != '\u0000') {
					local13 = false;
				}
			}
			if (local13) {
				return true;
			}
			@Pc(43) int local43 = method448(arg0);
			@Pc(45) int local45 = 0;
			@Pc(50) int local50 = anIntArray119.length - 1;
			if (local43 == anIntArray119[0] || local43 == anIntArray119[local50]) {
				return true;
			}
			do {
				@Pc(68) int local68 = (local45 + local50) / 2;
				if (local43 == anIntArray119[local68]) {
					return true;
				}
				if (local43 < anIntArray119[local68]) {
					local50 = local68;
				} else {
					local45 = local68;
				}
			} while (local45 != local50 && local45 + 1 != local50);
			return false;
		} catch (@Pc(97) RuntimeException local97) {
			signlink.reporterror("62482, " + arg0 + ", " + arg1 + ", " + local97.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RKAYAFDQ", name = "b", descriptor = "([CI)I")
	private static int method448(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(6) int local6;
			if (anInt651 != 8801) {
				for (local6 = 1; local6 > 0; local6++) {
				}
			}
			if (arg0.length > 6) {
				return 0;
			}
			local6 = 0;
			for (@Pc(21) int local21 = 0; local21 < arg0.length; local21++) {
				@Pc(32) char local32 = arg0[arg0.length - local21 - 1];
				if (local32 >= 'a' && local32 <= 'z') {
					local6 = local6 * 38 + local32 + 1 - 'a';
				} else if (local32 == '\'') {
					local6 = local6 * 38 + 27;
				} else if (local32 >= '0' && local32 <= '9') {
					local6 = local6 * 38 + local32 + 28 - '0';
				} else if (local32 != '\u0000') {
					return 0;
				}
			}
			return local6;
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("67682, " + arg0 + ", " + 8801 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}
}
