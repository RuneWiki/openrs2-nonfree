import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!SQZXZVWD")
public final class Class34 {

	@OriginalMember(owner = "client!SQZXZVWD", name = "b", descriptor = "Z")
	private static boolean aBoolean119;

	@OriginalMember(owner = "client!SQZXZVWD", name = "g", descriptor = "Z")
	private static boolean aBoolean121;

	@OriginalMember(owner = "client!SQZXZVWD", name = "p", descriptor = "Z")
	private static boolean aBoolean123;

	@OriginalMember(owner = "client!SQZXZVWD", name = "t", descriptor = "[I")
	private static int[] anIntArray149;

	@OriginalMember(owner = "client!SQZXZVWD", name = "u", descriptor = "[[C")
	private static char[][] aCharArrayArray1;

	@OriginalMember(owner = "client!SQZXZVWD", name = "v", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!SQZXZVWD", name = "w", descriptor = "[[C")
	private static char[][] aCharArrayArray2;

	@OriginalMember(owner = "client!SQZXZVWD", name = "x", descriptor = "[[C")
	private static char[][] aCharArrayArray3;

	@OriginalMember(owner = "client!SQZXZVWD", name = "y", descriptor = "[I")
	private static int[] anIntArray150;

	@OriginalMember(owner = "client!SQZXZVWD", name = "a", descriptor = "I")
	private static int anInt424 = 7;

	@OriginalMember(owner = "client!SQZXZVWD", name = "d", descriptor = "I")
	private static int anInt425 = -234;

	@OriginalMember(owner = "client!SQZXZVWD", name = "e", descriptor = "I")
	private static int anInt426 = 504;

	@OriginalMember(owner = "client!SQZXZVWD", name = "f", descriptor = "I")
	private static int anInt427 = 504;

	@OriginalMember(owner = "client!SQZXZVWD", name = "h", descriptor = "B")
	private static byte aByte29 = 3;

	@OriginalMember(owner = "client!SQZXZVWD", name = "i", descriptor = "B")
	private static byte aByte30 = 3;

	@OriginalMember(owner = "client!SQZXZVWD", name = "j", descriptor = "I")
	private static int anInt428 = 2;

	@OriginalMember(owner = "client!SQZXZVWD", name = "k", descriptor = "Z")
	private static boolean aBoolean122 = true;

	@OriginalMember(owner = "client!SQZXZVWD", name = "l", descriptor = "B")
	private static byte aByte31 = -28;

	@OriginalMember(owner = "client!SQZXZVWD", name = "m", descriptor = "I")
	private static int anInt429 = 3;

	@OriginalMember(owner = "client!SQZXZVWD", name = "n", descriptor = "I")
	private static int anInt430 = -871;

	@OriginalMember(owner = "client!SQZXZVWD", name = "o", descriptor = "I")
	private static int anInt431 = 45944;

	@OriginalMember(owner = "client!SQZXZVWD", name = "q", descriptor = "B")
	private static byte aByte32 = 36;

	@OriginalMember(owner = "client!SQZXZVWD", name = "r", descriptor = "B")
	private static byte aByte33 = 9;

	@OriginalMember(owner = "client!SQZXZVWD", name = "s", descriptor = "I")
	private static int anInt432 = -578;

	@OriginalMember(owner = "client!SQZXZVWD", name = "z", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray5 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

	@OriginalMember(owner = "client!SQZXZVWD", name = "a", descriptor = "(Lclient!XOJZVVDK;)V")
	public static void method303(@OriginalArg(0) Class43 arg0) {
		@Pc(10) Class6_Sub1_Sub4 local10 = new Class6_Sub1_Sub4(888, arg0.method518("fragmentsenc.txt", (byte[]) null));
		@Pc(19) Class6_Sub1_Sub4 local19 = new Class6_Sub1_Sub4(888, arg0.method518("badenc.txt", (byte[]) null));
		@Pc(28) Class6_Sub1_Sub4 local28 = new Class6_Sub1_Sub4(888, arg0.method518("domainenc.txt", (byte[]) null));
		@Pc(37) Class6_Sub1_Sub4 local37 = new Class6_Sub1_Sub4(888, arg0.method518("tldlist.txt", (byte[]) null));
		method304(local10, local19, local28, local37);
	}

	@OriginalMember(owner = "client!SQZXZVWD", name = "a", descriptor = "(Lclient!PQBRPYKE;Lclient!PQBRPYKE;Lclient!PQBRPYKE;Lclient!PQBRPYKE;)V")
	private static void method304(@OriginalArg(0) Class6_Sub1_Sub4 arg0, @OriginalArg(1) Class6_Sub1_Sub4 arg1, @OriginalArg(2) Class6_Sub1_Sub4 arg2, @OriginalArg(3) Class6_Sub1_Sub4 arg3) {
		method306(anInt426, arg1);
		method307(arg2);
		method308(arg0);
		method305(arg3);
	}

	@OriginalMember(owner = "client!SQZXZVWD", name = "a", descriptor = "(Lclient!PQBRPYKE;I)V")
	private static void method305(@OriginalArg(0) Class6_Sub1_Sub4 arg0) {
		try {
			@Pc(4) int local4 = arg0.method244();
			aCharArrayArray3 = new char[local4][];
			anIntArray150 = new int[local4];
			for (@Pc(24) int local24 = 0; local24 < local4; local24++) {
				anIntArray150[local24] = arg0.method239();
				@Pc(35) char[] local35 = new char[arg0.method239()];
				for (@Pc(37) int local37 = 0; local37 < local35.length; local37++) {
					local35[local37] = (char) arg0.method239();
				}
				aCharArrayArray3[local24] = local35;
			}
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("32623, " + arg0 + ", " + 1 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SQZXZVWD", name = "a", descriptor = "(ILclient!PQBRPYKE;)V")
	private static void method306(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub1_Sub4 arg1) {
		try {
			@Pc(2) int local2 = arg1.method244();
			if (arg0 <= 0) {
				anInt425 = -18;
			}
			aCharArrayArray1 = new char[local2][];
			aByteArrayArrayArray7 = new byte[local2][][];
			method309(aCharArrayArray1, aByteArrayArrayArray7, arg1);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("17222, " + arg0 + ", " + arg1 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SQZXZVWD", name = "b", descriptor = "(ILclient!PQBRPYKE;)V")
	private static void method307(@OriginalArg(1) Class6_Sub1_Sub4 arg0) {
		try {
			@Pc(10) int local10 = arg0.method244();
			aCharArrayArray2 = new char[local10][];
			method310(aCharArrayArray2, arg0);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("47428, " + 0 + ", " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SQZXZVWD", name = "b", descriptor = "(Lclient!PQBRPYKE;I)V")
	private static void method308(@OriginalArg(0) Class6_Sub1_Sub4 arg0) {
		try {
			anIntArray149 = new int[arg0.method244()];
			for (@Pc(7) int local7 = 0; local7 < anIntArray149.length; local7++) {
				anIntArray149[local7] = arg0.method241();
			}
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("92982, " + arg0 + ", " + -572 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SQZXZVWD", name = "a", descriptor = "([[C[[[BLclient!PQBRPYKE;I)V")
	private static void method309(@OriginalArg(0) char[][] arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) Class6_Sub1_Sub4 arg2) {
		try {
			for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
				@Pc(19) char[] local19 = new char[arg2.method239()];
				for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
					local19[local21] = (char) arg2.method239();
				}
				arg0[local13] = local19;
				@Pc(43) byte[][] local43 = new byte[arg2.method239()][2];
				for (@Pc(45) int local45 = 0; local45 < local43.length; local45++) {
					local43[local45][0] = (byte) arg2.method239();
					local43[local45][1] = (byte) arg2.method239();
				}
				if (local43.length > 0) {
					arg1[local13] = local43;
				}
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("18724, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -897 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SQZXZVWD", name = "a", descriptor = "([[CILclient!PQBRPYKE;)V")
	private static void method310(@OriginalArg(0) char[][] arg0, @OriginalArg(2) Class6_Sub1_Sub4 arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
				@Pc(9) char[] local9 = new char[arg1.method239()];
				for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
					local9[local11] = (char) arg1.method239();
				}
				arg0[local3] = local9;
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("84810, " + arg0 + ", " + -129 + ", " + arg1 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SQZXZVWD", name = "a", descriptor = "([CI)V")
	private static void method311(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) int local3 = 0;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				if (method312(arg0[local5])) {
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
			signlink.reporterror("4030, " + arg0 + ", " + -870 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SQZXZVWD", name = "a", descriptor = "(CZ)Z")
	private static boolean method312(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= ' ' && arg0 <= '\u007f' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("34919, " + arg0 + ", " + false + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SQZXZVWD", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method313(@OriginalArg(1) String arg0) {
		try {
			@Pc(3) long local3 = System.currentTimeMillis();
			@Pc(14) char[] local14 = arg0.toCharArray();
			method311(local14);
			@Pc(23) String local23 = (new String(local14)).trim();
			@Pc(27) char[] local27 = local23.toLowerCase().toCharArray();
			@Pc(30) String local30 = local23.toLowerCase();
			method321(local27);
			method316(local27);
			method317(local27, anInt428);
			method330(local27);
			for (@Pc(44) int local44 = 0; local44 < aStringArray5.length; local44++) {
				@Pc(54) int local54 = -1;
				while ((local54 = local30.indexOf(aStringArray5[local44], local54 + 1)) != -1) {
					@Pc(61) char[] local61 = aStringArray5[local44].toCharArray();
					for (@Pc(63) int local63 = 0; local63 < local61.length; local63++) {
						local27[local63 + local54] = local61[local63];
					}
				}
			}
			method314(aByte29, local23.toCharArray(), local27);
			method315(local27);
			@Pc(105) long local105 = System.currentTimeMillis();
			return (new String(local27)).trim();
		} catch (@Pc(112) RuntimeException local112) {
			signlink.reporterror("98421, " + false + ", " + arg0 + ", " + local112.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SQZXZVWD", name = "a", descriptor = "(B[C[C)V")
	private static void method314(@OriginalArg(0) byte arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2) {
		try {
			@Pc(10) int local10;
			if (arg0 == aByte30) {
				@Pc(6) boolean local6 = false;
			} else {
				for (local10 = 1; local10 > 0; local10++) {
				}
			}
			for (local10 = 0; local10 < arg1.length; local10++) {
				if (arg2[local10] != '*' && method338(arg1[local10])) {
					arg2[local10] = arg1[local10];
				}
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("33441, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SQZXZVWD", name = "a", descriptor = "(I[C)V")
	private static void method315(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				@Pc(11) char local11 = arg0[local5];
				if (!method335(local11)) {
					local3 = true;
				} else if (local3) {
					if (method337(local11)) {
						local3 = false;
					}
				} else if (method338(local11)) {
					arg0[local5] = (char) (local11 + 'a' - 65);
				}
			}
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("75542, " + 2 + ", " + arg0 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SQZXZVWD", name = "a", descriptor = "(Z[C)V")
	private static void method316(@OriginalArg(1) char[] arg0) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 2; local3++) {
				for (@Pc(10) int local10 = aCharArrayArray1.length - 1; local10 >= 0; local10--) {
					method325(aCharArrayArray1[local10], arg0, aByteArrayArrayArray7[local10]);
				}
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("96594, " + true + ", " + arg0 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SQZXZVWD", name = "b", descriptor = "([CI)V")
	private static void method317(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(18) char[] local18 = new char[] { '(', 'a', ')' };
			if (arg1 < 2 || arg1 > 2) {
				aBoolean123 = !aBoolean123;
			}
			method325(local18, local3, (byte[][]) null);
			@Pc(39) char[] local39 = (char[]) arg0.clone();
			@Pc(54) char[] local54 = new char[] { 'd', 'o', 't' };
			method325(local54, local39, (byte[][]) null);
			for (@Pc(64) int local64 = aCharArrayArray2.length - 1; local64 >= 0; local64--) {
				method318(arg0, local39, local3, aCharArrayArray2[local64]);
			}
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("14807, " + arg0 + ", " + arg1 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SQZXZVWD", name = "a", descriptor = "(Z[C[C[C[C)V")
	private static void method318(@OriginalArg(1) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2, @OriginalArg(4) char[] arg3) {
		try {
			if (arg3.length <= arg0.length) {
				@Pc(23) int local23;
				for (@Pc(15) int local15 = 0; local15 <= arg0.length - arg3.length; local15 += local23) {
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
							if (local21 < arg3.length && (local58 = method327(local33, arg3[local21], local31)) > 0) {
								local19 += local58;
								local21++;
							} else {
								if (local21 == 0) {
									break label58;
								}
								@Pc(79) int local79;
								if ((local79 = method327(local33, arg3[local21 - 1], local31)) > 0) {
									local19 += local79;
									if (local21 == 1) {
										local23++;
									}
								} else {
									if (local21 >= arg3.length || !method333(local31)) {
										break label58;
									}
									local19++;
								}
							}
						}
					}
					if (local21 >= arg3.length) {
						@Pc(110) boolean local110 = false;
						@Pc(116) int local116 = method319(196, local15, arg0, arg2);
						@Pc(124) int local124 = method320(arg0, local19 - 1, arg1);
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
			signlink.reporterror("48323, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SQZXZVWD", name = "a", descriptor = "(II[C[C)I")
	private static int method319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) char[] arg3) {
		try {
			if (arg1 == 0) {
				return 2;
			}
			for (@Pc(9) int local9 = arg1 - 1; local9 >= 0 && method333(arg2[local9]); local9--) {
				if (arg2[local9] == '@') {
					return 3;
				}
			}
			@Pc(31) boolean local31 = false;
			@Pc(33) int local33 = 0;
			for (@Pc(37) int local37 = arg1 - 1; local37 >= 0 && method333(arg3[local37]); local37--) {
				if (arg3[local37] == '*') {
					local33++;
				}
			}
			if (local33 >= 3) {
				return 4;
			} else if (method333(arg2[arg1 - 1])) {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("92041, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SQZXZVWD", name = "a", descriptor = "([CI[CI)I")
	private static int method320(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) char[] arg2) {
		try {
			if (arg1 + 1 == arg0.length) {
				return 2;
			}
			@Pc(13) int local13 = arg1 + 1;
			while (true) {
				if (local13 < arg0.length && method333(arg0[local13])) {
					if (arg0[local13] != '.' && arg0[local13] != ',') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(40) int local40 = 0;
				for (@Pc(48) int local48 = arg1 + 1; local48 < arg0.length && method333(arg2[local48]); local48++) {
					if (arg2[local48] == '*') {
						local40++;
					}
				}
				if (local40 >= 3) {
					return 4;
				}
				if (method333(arg0[arg1 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("13464, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 589 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SQZXZVWD", name = "a", descriptor = "(B[C)V")
	private static void method321(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(23) char[] local23 = new char[] { 'd', 'o', 't' };
			method325(local23, local3, (byte[][]) null);
			@Pc(32) char[] local32 = (char[]) arg0.clone();
			@Pc(55) char[] local55 = new char[] { 's', 'l', 'a', 's', 'h' };
			method325(local55, local32, (byte[][]) null);
			for (@Pc(62) int local62 = 0; local62 < aCharArrayArray3.length; local62++) {
				method322(local3, anIntArray150[local62], arg0, aCharArrayArray3[local62], local32);
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("61561, " + 49 + ", " + arg0 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SQZXZVWD", name = "a", descriptor = "(I[CI[C[C[C)V")
	private static void method322(@OriginalArg(1) char[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) char[] arg2, @OriginalArg(4) char[] arg3, @OriginalArg(5) char[] arg4) {
		try {
			if (arg3.length <= arg2.length) {
				@Pc(19) int local19;
				for (@Pc(11) int local11 = 0; local11 <= arg2.length - arg3.length; local11 += local19) {
					@Pc(15) int local15 = local11;
					@Pc(17) int local17 = 0;
					local19 = 1;
					label121: while (true) {
						while (true) {
							if (local15 >= arg2.length) {
								break label121;
							}
							@Pc(27) char local27 = arg2[local15];
							@Pc(29) char local29 = 0;
							if (local15 + 1 < arg2.length) {
								local29 = arg2[local15 + 1];
							}
							@Pc(54) int local54;
							if (local17 < arg3.length && (local54 = method327(local29, arg3[local17], local27)) > 0) {
								local15 += local54;
								local17++;
							} else {
								if (local17 == 0) {
									break label121;
								}
								@Pc(75) int local75;
								if ((local75 = method327(local29, arg3[local17 - 1], local27)) > 0) {
									local15 += local75;
									if (local17 == 1) {
										local19++;
									}
								} else {
									if (local17 >= arg3.length || !method333(local27)) {
										break label121;
									}
									local15++;
								}
							}
						}
					}
					if (local17 >= arg3.length) {
						@Pc(106) boolean local106 = false;
						@Pc(112) int local112 = method323(arg2, arg0, local11);
						@Pc(120) int local120 = method324(arg4, arg2, local15 - 1);
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
										if (method333(arg2[local186])) {
											break;
										}
										local170 = local186;
									} else if (!method333(arg2[local186])) {
										local182 = true;
										local170 = local186;
									}
								}
							}
							if (local120 > 2) {
								if (local120 == 4) {
									local182 = false;
									for (local186 = local174 + 1; local186 < arg2.length; local186++) {
										if (local182) {
											if (arg4[local186] != '*') {
												break;
											}
											local174 = local186;
										} else if (arg4[local186] == '*') {
											local174 = local186;
											local182 = true;
										}
									}
								}
								local182 = false;
								for (local186 = local174 + 1; local186 < arg2.length; local186++) {
									if (local182) {
										if (method333(arg2[local186])) {
											break;
										}
										local174 = local186;
									} else if (!method333(arg2[local186])) {
										local182 = true;
										local174 = local186;
									}
								}
							}
							for (@Pc(320) int local320 = local170; local320 <= local174; local320++) {
								arg2[local320] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(349) RuntimeException local349) {
			signlink.reporterror("63345, " + 5 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local349.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SQZXZVWD", name = "a", descriptor = "([C[CIZ)I")
	private static int method323(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg2 == 0) {
				return 2;
			}
			@Pc(9) int local9 = arg2 - 1;
			while (true) {
				if (local9 >= 0 && method333(arg0[local9])) {
					if (arg0[local9] != ',' && arg0[local9] != '.') {
						local9--;
						continue;
					}
					return 3;
				}
				@Pc(34) int local34 = 0;
				for (@Pc(38) int local38 = arg2 - 1; local38 >= 0 && method333(arg1[local38]); local38--) {
					if (arg1[local38] == '*') {
						local34++;
					}
				}
				if (local34 >= 3) {
					return 4;
				}
				if (method333(arg0[arg2 - 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("98607, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SQZXZVWD", name = "b", descriptor = "([C[CIZ)I")
	private static int method324(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg2 + 1 == arg1.length) {
				return 2;
			}
			@Pc(13) int local13 = arg2 + 1;
			while (true) {
				if (local13 < arg1.length && method333(arg1[local13])) {
					if (arg1[local13] != '\\' && arg1[local13] != '/') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(44) int local44 = 0;
				for (@Pc(48) int local48 = arg2 + 1; local48 < arg1.length && method333(arg0[local48]); local48++) {
					if (arg0[local48] == '*') {
						local44++;
					}
				}
				if (local44 >= 5) {
					return 4;
				}
				if (method333(arg1[arg2 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("48221, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SQZXZVWD", name = "a", descriptor = "(I[C[C[[B)V")
	private static void method325(@OriginalArg(1) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) byte[][] arg2) {
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
					label164: while (true) {
						while (true) {
							if (local15 >= arg1.length || local25 && local27) {
								break label164;
							}
							var12 = arg1[local15];
							var13 = '\u0000';
							if (local15 + 1 < arg1.length) {
								var13 = arg1[local15 + 1];
							}
							@Pc(62) int local62;
							if (local17 < arg0.length && (local62 = method328(arg0[local17], var13, var12)) > 0) {
								if (local62 == 1 && method336(aBoolean123, var12)) {
									local25 = true;
								}
								if (local62 == 2 && (method336(aBoolean123, var12) || method336(aBoolean123, var13))) {
									local25 = true;
								}
								local15 += local62;
								local17++;
							} else {
								if (local17 == 0) {
									break label164;
								}
								@Pc(105) int local105;
								if ((local105 = method328(arg0[local17 - 1], var13, var12)) > 0) {
									local15 += local105;
									if (local17 == 1) {
										local21++;
									}
								} else {
									if (local17 >= arg0.length || !method334(var12)) {
										break label164;
									}
									if (method333(var12) && var12 != '\'') {
										local23 = true;
									}
									if (method336(aBoolean123, var12)) {
										local27 = true;
									}
									local15++;
									local19++;
									if (local19 * 100 / (local15 - local11) > 90) {
										break label164;
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
							if (local11 - 1 < 0 || method333(arg1[local11 - 1]) && arg1[local11 - 1] != '\'') {
								local216 = true;
							}
							if (local15 >= arg1.length || method333(arg1[local15]) && arg1[local15] != '\'') {
								local218 = true;
							}
							if (!local216 || !local218) {
								@Pc(262) boolean local262 = false;
								local266 = local11 - 2;
								if (local216) {
									local266 = local11;
								}
								while (!local262 && local266 < local15) {
									if (local266 >= 0 && (!method333(arg1[local266]) || arg1[local266] == '\'')) {
										@Pc(288) char[] local288 = new char[3];
										@Pc(290) int local290;
										for (local290 = 0; local290 < 3 && local266 + local290 < arg1.length && (!method333(arg1[local266 + local290]) || arg1[local266 + local290] == '\''); local290++) {
											local288[local290] = arg1[local266 + local290];
										}
										@Pc(328) boolean local328 = true;
										if (local290 == 0) {
											local328 = false;
										}
										if (local290 < 3 && local266 - 1 >= 0 && (!method333(arg1[local266 - 1]) || arg1[local266 - 1] == '\'')) {
											local328 = false;
										}
										if (local328 && !method339(local288)) {
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
							@Pc(198) byte local198 = method329(var12, anInt429);
							@Pc(202) byte local202 = method329(var13, anInt429);
							if (arg2 != null && method326(local202, local198, arg2)) {
								local170 = false;
							}
						}
						if (local170) {
							@Pc(378) int local378 = 0;
							@Pc(380) int local380 = 0;
							@Pc(382) int local382 = -1;
							for (local266 = local11; local266 < local15; local266++) {
								if (method336(aBoolean123, arg1[local266])) {
									local378++;
								} else if (method335(arg1[local266])) {
									local380++;
									local382 = local266;
								}
							}
							if (local382 > -1) {
								local378 -= local15 - 1 - local382;
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
		} catch (@Pc(463) RuntimeException local463) {
			signlink.reporterror("34908, " + 3 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local463.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SQZXZVWD", name = "a", descriptor = "(BBI[[B)Z")
	private static boolean method326(@OriginalArg(0) byte arg0, @OriginalArg(1) byte arg1, @OriginalArg(3) byte[][] arg2) {
		try {
			@Pc(1) int local1 = 0;
			if (arg2[0][0] == arg1 && arg2[0][1] == arg0) {
				return true;
			}
			@Pc(22) int local22 = arg2.length - 1;
			if (arg2[local22][0] == arg1 && arg2[local22][1] == arg0) {
				return true;
			}
			do {
				@Pc(52) int local52 = (local1 + local22) / 2;
				if (arg2[local52][0] == arg1 && arg2[local52][1] == arg0) {
					return true;
				}
				if (arg1 < arg2[local52][0] || arg1 == arg2[local52][0] && arg0 < arg2[local52][1]) {
					local22 = local52;
				} else {
					local1 = local52;
				}
			} while (local1 != local22 && local1 + 1 != local22);
			return false;
		} catch (@Pc(106) RuntimeException local106) {
			signlink.reporterror("26337, " + arg0 + ", " + arg1 + ", " + 838 + ", " + arg2 + ", " + local106.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SQZXZVWD", name = "a", descriptor = "(BCCC)I")
	private static int method327(@OriginalArg(1) char arg0, @OriginalArg(2) char arg1, @OriginalArg(3) char arg2) {
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
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("98418, " + -78 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SQZXZVWD", name = "a", descriptor = "(CCCZ)I")
	private static int method328(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(2) char arg2) {
		try {
			if (arg0 == arg2) {
				return 1;
			}
			if (arg0 >= 'a' && arg0 <= 'm') {
				if (arg0 == 'a') {
					if (arg2 != '4' && arg2 != '@' && arg2 != '^') {
						if (arg2 == '/' && arg1 == '\\') {
							return 2;
						}
						return 0;
					}
					return 1;
				}
				if (arg0 == 'b') {
					if (arg2 != '6' && arg2 != '8') {
						if ((arg2 != '1' || arg1 != '3') && (arg2 != 'i' || arg1 != '3')) {
							return 0;
						}
						return 2;
					}
					return 1;
				}
				if (arg0 == 'c') {
					if (arg2 != '(' && arg2 != '<' && arg2 != '{' && arg2 != '[') {
						return 0;
					}
					return 1;
				}
				if (arg0 == 'd') {
					if ((arg2 != '[' || arg1 != ')') && (arg2 != 'i' || arg1 != ')')) {
						return 0;
					}
					return 2;
				}
				if (arg0 == 'e') {
					if (arg2 != '3' && arg2 != '€') {
						return 0;
					}
					return 1;
				}
				if (arg0 == 'f') {
					if (arg2 == 'p' && arg1 == 'h') {
						return 2;
					}
					if (arg2 == '£') {
						return 1;
					}
					return 0;
				}
				if (arg0 == 'g') {
					if (arg2 != '9' && arg2 != '6' && arg2 != 'q') {
						return 0;
					}
					return 1;
				}
				if (arg0 == 'h') {
					if (arg2 == '#') {
						return 1;
					}
					return 0;
				}
				if (arg0 == 'i') {
					if (arg2 != 'y' && arg2 != 'l' && arg2 != 'j' && arg2 != '1' && arg2 != '!' && arg2 != ':' && arg2 != ';' && arg2 != '|') {
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
					if (arg2 != '1' && arg2 != '|' && arg2 != 'i') {
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
					if (arg2 != '0' && arg2 != '*') {
						if ((arg2 != '(' || arg1 != ')') && (arg2 != '[' || arg1 != ']') && (arg2 != '{' || arg1 != '}') && (arg2 != '<' || arg1 != '>')) {
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
					if (arg2 != '5' && arg2 != 'z' && arg2 != '$' && arg2 != '2') {
						return 0;
					}
					return 1;
				}
				if (arg0 == 't') {
					if (arg2 != '7' && arg2 != '+') {
						return 0;
					}
					return 1;
				}
				if (arg0 == 'u') {
					if (arg2 == 'v') {
						return 1;
					}
					if ((arg2 != '\\' || arg1 != '/') && (arg2 != '\\' || arg1 != '|') && (arg2 != '|' || arg1 != '/')) {
						return 0;
					}
					return 2;
				}
				if (arg0 == 'v') {
					if ((arg2 != '\\' || arg1 != '/') && (arg2 != '\\' || arg1 != '|') && (arg2 != '|' || arg1 != '/')) {
						return 0;
					}
					return 2;
				}
				if (arg0 == 'w') {
					if (arg2 == 'v' && arg1 == 'v') {
						return 2;
					}
					return 0;
				}
				if (arg0 == 'x') {
					if ((arg2 != ')' || arg1 != '(') && (arg2 != '}' || arg1 != '{') && (arg2 != ']' || arg1 != '[') && (arg2 != '>' || arg1 != '<')) {
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
					if (arg2 == 'o' || arg2 == 'O') {
						return 1;
					} else if ((arg2 != '(' || arg1 != ')') && (arg2 != '{' || arg1 != '}') && (arg2 != '[' || arg1 != ']')) {
						return 0;
					} else {
						return 2;
					}
				} else if (arg0 == '1') {
					return arg2 == 'l' ? 1 : 0;
				} else {
					return 0;
				}
			} else if (arg0 == ',') {
				return arg2 == '.' ? 1 : 0;
			} else if (arg0 == '.') {
				return arg2 == ',' ? 1 : 0;
			} else if (arg0 == '!') {
				return arg2 == 'i' ? 1 : 0;
			} else {
				return 0;
			}
		} catch (@Pc(516) RuntimeException local516) {
			signlink.reporterror("15640, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + local516.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SQZXZVWD", name = "a", descriptor = "(CI)B")
	private static byte method329(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 < anInt429 || arg1 > anInt429) {
				throw new NullPointerException();
			} else if (arg0 >= 'a' && arg0 <= 'z') {
				return (byte) (arg0 - 'a' + 1);
			} else if (arg0 == '\'') {
				return 28;
			} else if (arg0 >= '0' && arg0 <= '9') {
				return (byte) (arg0 - '0' + 29);
			} else {
				return 27;
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("51300, " + arg0 + ", " + arg1 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SQZXZVWD", name = "b", descriptor = "(I[C)V")
	private static void method330(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(9) int local9 = 0;
			@Pc(11) int local11 = 0;
			@Pc(13) int local13 = 0;
			while (true) {
				do {
					@Pc(112) int local112;
					if ((local112 = method331(local9, arg0)) == -1) {
						return;
					}
					@Pc(17) boolean local17 = false;
					for (@Pc(19) int local19 = local9; local19 >= 0 && local19 < local112 && !local17; local19++) {
						if (!method333(arg0[local19]) && !method334(arg0[local19])) {
							local17 = true;
						}
					}
					if (local17) {
						local11 = 0;
					}
					if (local11 == 0) {
						local13 = local112;
					}
					local9 = method332(arg0, local112);
					@Pc(58) int local58 = 0;
					for (@Pc(60) int local60 = local112; local60 < local9; local60++) {
						local58 = local58 * 10 + arg0[local60] - 48;
					}
					if (local58 <= 255 && local9 - local112 <= 8) {
						local11++;
					} else {
						local11 = 0;
					}
				} while (local11 != 4);
				for (@Pc(94) int local94 = local13; local94 < local9; local94++) {
					arg0[local94] = '*';
				}
				local11 = 0;
			}
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("67836, " + -871 + ", " + arg0 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SQZXZVWD", name = "a", descriptor = "(I[CI)I")
	private static int method331(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1) {
		try {
			for (@Pc(6) int local6 = arg0; local6 < arg1.length && local6 >= 0; local6++) {
				if (arg1[local6] >= '0' && arg1[local6] <= '9') {
					return local6;
				}
			}
			return -1;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("23883, " + arg0 + ", " + arg1 + ", " + 7 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SQZXZVWD", name = "b", descriptor = "(I[CI)I")
	private static int method332(@OriginalArg(1) char[] arg0, @OriginalArg(2) int arg1) {
		try {
			if (45944 != anInt431) {
				return 2;
			}
			@Pc(6) int local6 = arg1;
			while (true) {
				if (local6 < arg0.length && local6 >= 0) {
					if (arg0[local6] >= '0' && arg0[local6] <= '9') {
						local6++;
						continue;
					}
					return local6;
				}
				return arg0.length;
			}
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("44870, " + 45944 + ", " + arg0 + ", " + arg1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SQZXZVWD", name = "a", descriptor = "(CB)Z")
	private static boolean method333(@OriginalArg(0) char arg0) {
		try {
			return !method335(arg0) && !method336(aBoolean123, arg0);
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("49847, " + arg0 + ", " + 5 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SQZXZVWD", name = "a", descriptor = "(IC)Z")
	private static boolean method334(@OriginalArg(1) char arg0) {
		try {
			if (arg0 >= 'a' && arg0 <= 'z') {
				return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
			} else {
				return true;
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("34991, " + 0 + ", " + arg0 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SQZXZVWD", name = "b", descriptor = "(IC)Z")
	private static boolean method335(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("43098, " + 6 + ", " + arg0 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SQZXZVWD", name = "a", descriptor = "(ZC)Z")
	private static boolean method336(@OriginalArg(0) boolean arg0, @OriginalArg(1) char arg1) {
		try {
			if (arg0) {
				throw new NullPointerException();
			}
			return arg1 >= '0' && arg1 <= '9';
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("44547, " + arg0 + ", " + arg1 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SQZXZVWD", name = "c", descriptor = "(IC)Z")
	private static boolean method337(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z';
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("10552, " + -16078 + ", " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SQZXZVWD", name = "d", descriptor = "(IC)Z")
	private static boolean method338(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("71876, " + 7 + ", " + arg0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SQZXZVWD", name = "b", descriptor = "(B[C)Z")
	private static boolean method339(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				if (!method336(aBoolean123, arg0[local5]) && arg0[local5] != '\u0000') {
					local3 = false;
				}
			}
			if (local3) {
				return true;
			}
			@Pc(32) int local32 = method340((byte) 9, arg0);
			@Pc(34) int local34 = 0;
			if (36 != aByte32) {
				anInt430 = 130;
			}
			@Pc(44) int local44 = anIntArray149.length - 1;
			if (local32 == anIntArray149[0] || local32 == anIntArray149[local44]) {
				return true;
			}
			do {
				@Pc(62) int local62 = (local34 + local44) / 2;
				if (local32 == anIntArray149[local62]) {
					return true;
				}
				if (local32 < anIntArray149[local62]) {
					local44 = local62;
				} else {
					local34 = local62;
				}
			} while (local34 != local44 && local34 + 1 != local44);
			return false;
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("60756, " + 36 + ", " + arg0 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SQZXZVWD", name = "c", descriptor = "(B[C)I")
	private static int method340(@OriginalArg(0) byte arg0, @OriginalArg(1) char[] arg1) {
		try {
			if (arg1.length > 6) {
				return 0;
			}
			@Pc(9) int local9 = 0;
			if (9 != aByte33) {
				return anInt426;
			}
			@Pc(14) boolean local14 = false;
			for (@Pc(19) int local19 = 0; local19 < arg1.length; local19++) {
				@Pc(31) char local31 = arg1[arg1.length - local19 - 1];
				if (local31 >= 'a' && local31 <= 'z') {
					local9 = local9 * 38 + local31 - 'a' + 1;
				} else if (local31 == '\'') {
					local9 = local9 * 38 + 27;
				} else if (local31 >= '0' && local31 <= '9') {
					local9 = local9 * 38 + local31 - '0' + 28;
				} else if (local31 != '\u0000') {
					return 0;
				}
			}
			return local9;
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("5690, " + arg0 + ", " + arg1 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}
}
