import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!MOLFGQQL")
public final class Class25 {

	@OriginalMember(owner = "client!MOLFGQQL", name = "c", descriptor = "I")
	private static int anInt457;

	@OriginalMember(owner = "client!MOLFGQQL", name = "d", descriptor = "Z")
	private static boolean aBoolean95;

	@OriginalMember(owner = "client!MOLFGQQL", name = "h", descriptor = "I")
	private static int anInt460;

	@OriginalMember(owner = "client!MOLFGQQL", name = "i", descriptor = "I")
	private static int anInt461;

	@OriginalMember(owner = "client!MOLFGQQL", name = "k", descriptor = "Z")
	private static boolean aBoolean96;

	@OriginalMember(owner = "client!MOLFGQQL", name = "l", descriptor = "Z")
	private static boolean aBoolean97;

	@OriginalMember(owner = "client!MOLFGQQL", name = "m", descriptor = "[I")
	private static int[] anIntArray131;

	@OriginalMember(owner = "client!MOLFGQQL", name = "n", descriptor = "[[C")
	private static char[][] aCharArrayArray1;

	@OriginalMember(owner = "client!MOLFGQQL", name = "o", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!MOLFGQQL", name = "p", descriptor = "[[C")
	private static char[][] aCharArrayArray2;

	@OriginalMember(owner = "client!MOLFGQQL", name = "q", descriptor = "[[C")
	private static char[][] aCharArrayArray3;

	@OriginalMember(owner = "client!MOLFGQQL", name = "r", descriptor = "[I")
	private static int[] anIntArray132;

	@OriginalMember(owner = "client!MOLFGQQL", name = "a", descriptor = "Z")
	private static boolean aBoolean94 = true;

	@OriginalMember(owner = "client!MOLFGQQL", name = "b", descriptor = "I")
	private static int anInt456 = 536;

	@OriginalMember(owner = "client!MOLFGQQL", name = "e", descriptor = "I")
	private static int anInt458 = 8;

	@OriginalMember(owner = "client!MOLFGQQL", name = "f", descriptor = "B")
	private static byte aByte13 = 27;

	@OriginalMember(owner = "client!MOLFGQQL", name = "g", descriptor = "I")
	private static int anInt459 = 34134;

	@OriginalMember(owner = "client!MOLFGQQL", name = "j", descriptor = "I")
	private static int anInt462 = -800;

	@OriginalMember(owner = "client!MOLFGQQL", name = "s", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray4 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

	@OriginalMember(owner = "client!MOLFGQQL", name = "a", descriptor = "(Lclient!UUIGNTAD;)V")
	public static void method270(@OriginalArg(0) Class38 arg0) {
		@Pc(10) Class1_Sub1_Sub3 local10 = new Class1_Sub1_Sub3(arg0.method512("fragmentsenc.txt", null), anInt456);
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(arg0.method512("badenc.txt", null), anInt456);
		@Pc(28) Class1_Sub1_Sub3 local28 = new Class1_Sub1_Sub3(arg0.method512("domainenc.txt", null), anInt456);
		@Pc(37) Class1_Sub1_Sub3 local37 = new Class1_Sub1_Sub3(arg0.method512("tldlist.txt", null), anInt456);
		method271(local10, local19, local28, local37);
	}

	@OriginalMember(owner = "client!MOLFGQQL", name = "a", descriptor = "(Lclient!CMGGUSPR;Lclient!CMGGUSPR;Lclient!CMGGUSPR;Lclient!CMGGUSPR;)V")
	private static void method271(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) Class1_Sub1_Sub3 arg2, @OriginalArg(3) Class1_Sub1_Sub3 arg3) {
		method273(arg1);
		method274(arg2);
		method275(arg0);
		method272((byte) 2, arg3);
	}

	@OriginalMember(owner = "client!MOLFGQQL", name = "a", descriptor = "(BLclient!CMGGUSPR;)V")
	private static void method272(@OriginalArg(0) byte arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			@Pc(4) int local4 = arg1.method60();
			aCharArrayArray3 = new char[local4][];
			anIntArray132 = new int[local4];
			@Pc(15) boolean local15 = false;
			for (@Pc(21) int local21 = 0; local21 < local4; local21++) {
				anIntArray132[local21] = arg1.method55();
				@Pc(32) char[] local32 = new char[arg1.method55()];
				for (@Pc(34) int local34 = 0; local34 < local32.length; local34++) {
					local32[local34] = (char) arg1.method55();
				}
				aCharArrayArray3[local21] = local32;
			}
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("37686, " + arg0 + ", " + arg1 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MOLFGQQL", name = "a", descriptor = "(ZLclient!CMGGUSPR;)V")
	private static void method273(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(2) int local2 = arg0.method60();
			aCharArrayArray1 = new char[local2][];
			aByteArrayArrayArray7 = new byte[local2][][];
			method276(arg0, aByteArrayArrayArray7, aCharArrayArray1);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("41343, " + true + ", " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MOLFGQQL", name = "a", descriptor = "(Lclient!CMGGUSPR;I)V")
	private static void method274(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(14) int local14 = arg0.method60();
			aCharArrayArray2 = new char[local14][];
			method277(aCharArrayArray2, arg0, anInt458);
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("25016, " + arg0 + ", " + 2 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MOLFGQQL", name = "b", descriptor = "(Lclient!CMGGUSPR;I)V")
	private static void method275(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			anIntArray131 = new int[arg0.method60()];
			for (@Pc(5) int local5 = 0; local5 < anIntArray131.length; local5++) {
				anIntArray131[local5] = arg0.method57();
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("55201, " + arg0 + ", " + 0 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MOLFGQQL", name = "a", descriptor = "(Lclient!CMGGUSPR;[[[B[[CB)V")
	private static void method276(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) char[][] arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < arg2.length; local3++) {
				@Pc(9) char[] local9 = new char[arg0.method55()];
				for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
					local9[local11] = (char) arg0.method55();
				}
				arg2[local3] = local9;
				@Pc(33) byte[][] local33 = new byte[arg0.method55()][2];
				for (@Pc(35) int local35 = 0; local35 < local33.length; local35++) {
					local33[local35][0] = (byte) arg0.method55();
					local33[local35][1] = (byte) arg0.method55();
				}
				if (local33.length > 0) {
					arg1[local3] = local33;
				}
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("62929, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 91 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MOLFGQQL", name = "a", descriptor = "([[CLclient!CMGGUSPR;I)V")
	private static void method277(@OriginalArg(0) char[][] arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg2 != 8) {
				aBoolean96 = !aBoolean96;
			}
			for (@Pc(12) int local12 = 0; local12 < arg0.length; local12++) {
				@Pc(18) char[] local18 = new char[arg1.method55()];
				for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
					local18[local20] = (char) arg1.method55();
				}
				arg0[local12] = local18;
			}
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("69225, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MOLFGQQL", name = "a", descriptor = "(I[C)V")
	private static void method278(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) int local3 = 0;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				if (method279(arg0[local5])) {
					arg0[local3] = arg0[local5];
				} else {
					arg0[local3] = ' ';
				}
				if (local3 == 0 || arg0[local3] != ' ' || arg0[local3 - 1] != ' ') {
					local3++;
				}
			}
			for (@Pc(52) int local52 = local3; local52 < arg0.length; local52++) {
				arg0[local52] = ' ';
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("16155, " + 14237 + ", " + arg0 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MOLFGQQL", name = "a", descriptor = "(CZ)Z")
	private static boolean method279(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= ' ' && arg0 <= '\u007f' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("97766, " + arg0 + ", " + true + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MOLFGQQL", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method280(@OriginalArg(0) String arg0) {
		try {
			@Pc(3) long local3 = System.currentTimeMillis();
			@Pc(6) char[] local6 = arg0.toCharArray();
			method278(local6);
			@Pc(21) String local21 = (new String(local6)).trim();
			@Pc(25) char[] local25 = local21.toLowerCase().toCharArray();
			@Pc(28) String local28 = local21.toLowerCase();
			method288(local25);
			method283(local25);
			method284(local25);
			method297(local25);
			for (@Pc(42) int local42 = 0; local42 < aStringArray4.length; local42++) {
				@Pc(52) int local52 = -1;
				while ((local52 = local28.indexOf(aStringArray4[local42], local52 + 1)) != -1) {
					@Pc(59) char[] local59 = aStringArray4[local42].toCharArray();
					for (@Pc(61) int local61 = 0; local61 < local59.length; local61++) {
						local25[local61 + local52] = local59[local61];
					}
				}
			}
			method281(local25, local21.toCharArray());
			method282(anInt459, local25);
			@Pc(103) long local103 = System.currentTimeMillis();
			return (new String(local25)).trim();
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("33265, " + arg0 + ", " + -443 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MOLFGQQL", name = "a", descriptor = "([CI[C)V")
	private static void method281(@OriginalArg(0) char[] arg0, @OriginalArg(2) char[] arg1) {
		try {
			for (@Pc(13) int local13 = 0; local13 < arg1.length; local13++) {
				if (arg0[local13] != '*' && method305(arg1[local13])) {
					arg0[local13] = arg1[local13];
				}
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("70011, " + arg0 + ", " + -18593 + ", " + arg1 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MOLFGQQL", name = "b", descriptor = "(I[C)V")
	private static void method282(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1) {
		try {
			if (arg0 != 34134) {
				aBoolean95 = !aBoolean95;
			}
			@Pc(12) boolean local12 = true;
			for (@Pc(14) int local14 = 0; local14 < arg1.length; local14++) {
				@Pc(20) char local20 = arg1[local14];
				if (!method302(local20, anInt461)) {
					local12 = true;
				} else if (local12) {
					if (method304(local20, anInt462)) {
						local12 = false;
					}
				} else if (method305(local20)) {
					arg1[local14] = (char) (local20 + 'a' - 65);
				}
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("33466, " + arg0 + ", " + arg1 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MOLFGQQL", name = "a", descriptor = "([CI)V")
	private static void method283(@OriginalArg(0) char[] arg0) {
		try {
			for (@Pc(6) int local6 = 0; local6 < 2; local6++) {
				for (@Pc(13) int local13 = aCharArrayArray1.length - 1; local13 >= 0; local13--) {
					method292(aCharArrayArray1[local13], aByteArrayArrayArray7[local13], arg0);
				}
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("46603, " + arg0 + ", " + 891 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MOLFGQQL", name = "b", descriptor = "([CI)V")
	private static void method284(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(22) char[] local22 = new char[] { '(', 'a', ')' };
			method292(local22, null, local3);
			@Pc(31) char[] local31 = (char[]) arg0.clone();
			@Pc(46) char[] local46 = new char[] { 'd', 'o', 't' };
			method292(local46, null, local31);
			for (@Pc(56) int local56 = aCharArrayArray2.length - 1; local56 >= 0; local56--) {
				method285(local3, aCharArrayArray2[local56], local31, arg0);
			}
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("2726, " + arg0 + ", " + 0 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MOLFGQQL", name = "a", descriptor = "([CI[C[C[C)V")
	private static void method285(@OriginalArg(0) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2, @OriginalArg(4) char[] arg3) {
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
							if (local17 < arg1.length && (local54 = method294(local27, local29, arg1[local17])) > 0) {
								local15 += local54;
								local17++;
							} else {
								if (local17 == 0) {
									break label59;
								}
								@Pc(75) int local75;
								if ((local75 = method294(local27, local29, arg1[local17 - 1])) > 0) {
									local15 += local75;
									if (local17 == 1) {
										local19++;
									}
								} else {
									if (local17 >= arg1.length || !method300(local27, (byte) 8)) {
										break label59;
									}
									local15++;
								}
							}
						}
					}
					if (local17 >= arg1.length) {
						@Pc(106) boolean local106 = false;
						@Pc(112) int local112 = method286(local11, arg0, arg3);
						@Pc(120) int local120 = method287(arg2, local15 - 1, (byte) 6, arg3);
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
		} catch (@Pc(157) RuntimeException local157) {
			signlink.reporterror("85006, " + arg0 + ", " + -205 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local157.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MOLFGQQL", name = "a", descriptor = "(I[C[CI)I")
	private static int method286(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2) {
		try {
			if (arg0 == 0) {
				return 2;
			}
			for (@Pc(14) int local14 = arg0 - 1; local14 >= 0 && method300(arg2[local14], (byte) 8); local14--) {
				if (arg2[local14] == '@') {
					return 3;
				}
			}
			@Pc(34) int local34 = 0;
			for (@Pc(38) int local38 = arg0 - 1; local38 >= 0 && method300(arg1[local38], (byte) 8); local38--) {
				if (arg1[local38] == '*') {
					local34++;
				}
			}
			if (local34 >= 3) {
				return 4;
			} else if (method300(arg2[arg0 - 1], (byte) 8)) {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("27678, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -15266 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MOLFGQQL", name = "a", descriptor = "([CIB[C)I")
	private static int method287(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) char[] arg3) {
		try {
			if (arg1 + 1 == arg3.length) {
				return 2;
			}
			@Pc(13) int local13 = arg1 + 1;
			while (true) {
				if (local13 < arg3.length && method300(arg3[local13], (byte) 8)) {
					if (arg3[local13] != '.' && arg3[local13] != ',') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(43) boolean local43 = false;
				@Pc(49) int local49 = 0;
				for (@Pc(53) int local53 = arg1 + 1; local53 < arg3.length && method300(arg0[local53], (byte) 8); local53++) {
					if (arg0[local53] == '*') {
						local49++;
					}
				}
				if (local49 >= 3) {
					return 4;
				}
				if (method300(arg3[arg1 + 1], (byte) 8)) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("5176, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MOLFGQQL", name = "a", descriptor = "(Z[C)V")
	private static void method288(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(7) char[] local7 = (char[]) arg0.clone();
			@Pc(22) char[] local22 = new char[] { 'd', 'o', 't' };
			method292(local22, null, local7);
			@Pc(31) char[] local31 = (char[]) arg0.clone();
			@Pc(54) char[] local54 = new char[] { 's', 'l', 'a', 's', 'h' };
			method292(local54, null, local31);
			for (@Pc(61) int local61 = 0; local61 < aCharArrayArray3.length; local61++) {
				method289(local7, anIntArray132[local61], arg0, local31, aCharArrayArray3[local61]);
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("30363, " + false + ", " + arg0 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MOLFGQQL", name = "a", descriptor = "(I[CI[C[C[C)V")
	private static void method289(@OriginalArg(1) char[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) char[] arg2, @OriginalArg(4) char[] arg3, @OriginalArg(5) char[] arg4) {
		try {
			if (arg4.length <= arg2.length) {
				@Pc(19) int local19;
				for (@Pc(11) int local11 = 0; local11 <= arg2.length - arg4.length; local11 += local19) {
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
							if (local17 < arg4.length && (local54 = method294(local27, local29, arg4[local17])) > 0) {
								local15 += local54;
								local17++;
							} else {
								if (local17 == 0) {
									break label121;
								}
								@Pc(75) int local75;
								if ((local75 = method294(local27, local29, arg4[local17 - 1])) > 0) {
									local15 += local75;
									if (local17 == 1) {
										local19++;
									}
								} else {
									if (local17 >= arg4.length || !method300(local27, (byte) 8)) {
										break label121;
									}
									local15++;
								}
							}
						}
					}
					if (local17 >= arg4.length) {
						@Pc(106) boolean local106 = false;
						@Pc(112) int local112 = method290(arg0, arg2, local11);
						@Pc(120) int local120 = method291(arg2, anInt460, arg3, local15 - 1);
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
										if (method300(arg2[local186], (byte) 8)) {
											break;
										}
										local170 = local186;
									} else if (!method300(arg2[local186], (byte) 8)) {
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
								for (local186 = local174 + 1; local186 < arg2.length; local186++) {
									if (local182) {
										if (method300(arg2[local186], (byte) 8)) {
											break;
										}
										local174 = local186;
									} else if (!method300(arg2[local186], (byte) 8)) {
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
		} catch (@Pc(346) RuntimeException local346) {
			signlink.reporterror("52255, " + -31217 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local346.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MOLFGQQL", name = "a", descriptor = "([CZ[CI)I")
	private static int method290(@OriginalArg(0) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 == 0) {
				return 2;
			}
			@Pc(9) int local9 = arg2 - 1;
			while (true) {
				if (local9 >= 0 && method300(arg1[local9], (byte) 8)) {
					if (arg1[local9] != ',' && arg1[local9] != '.') {
						local9--;
						continue;
					}
					return 3;
				}
				@Pc(34) int local34 = 0;
				for (@Pc(38) int local38 = arg2 - 1; local38 >= 0 && method300(arg0[local38], (byte) 8); local38--) {
					if (arg0[local38] == '*') {
						local34++;
					}
				}
				if (local34 >= 3) {
					return 4;
				}
				if (method300(arg1[arg2 - 1], (byte) 8)) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("50672, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MOLFGQQL", name = "a", descriptor = "([CI[CI)I")
	private static int method291(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg3 + 1 == arg0.length) {
				return 2;
			}
			@Pc(13) int local13 = arg3 + 1;
			while (true) {
				if (local13 < arg0.length && method300(arg0[local13], (byte) 8)) {
					if (arg0[local13] != '\\' && arg0[local13] != '/') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(40) int local40 = 0;
				if (arg1 != 0) {
					return 0;
				}
				for (@Pc(48) int local48 = arg3 + 1; local48 < arg0.length && method300(arg2[local48], (byte) 8); local48++) {
					if (arg2[local48] == '*') {
						local40++;
					}
				}
				if (local40 >= 5) {
					return 4;
				}
				if (method300(arg0[arg3 + 1], (byte) 8)) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("71296, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MOLFGQQL", name = "a", descriptor = "(B[C[[B[C)V")
	private static void method292(@OriginalArg(1) char[] arg0, @OriginalArg(2) byte[][] arg1, @OriginalArg(3) char[] arg2) {
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
					label165: while (true) {
						while (true) {
							if (local15 >= arg2.length || local25 && local27) {
								break label165;
							}
							var12 = arg2[local15];
							var13 = '\u0000';
							if (local15 + 1 < arg2.length) {
								var13 = arg2[local15 + 1];
							}
							@Pc(62) int local62;
							if (local17 < arg0.length && (local62 = method295(arg0[local17], var13, var12)) > 0) {
								if (local62 == 1 && method303(743, var12)) {
									local25 = true;
								}
								if (local62 == 2 && (method303(743, var12) || method303(743, var13))) {
									local25 = true;
								}
								local15 += local62;
								local17++;
							} else {
								if (local17 == 0) {
									break label165;
								}
								@Pc(105) int local105;
								if ((local105 = method295(arg0[local17 - 1], var13, var12)) > 0) {
									local15 += local105;
									if (local17 == 1) {
										local21++;
									}
								} else {
									if (local17 >= arg0.length || !method301(var12)) {
										break label165;
									}
									if (method300(var12, (byte) 8) && var12 != '\'') {
										local23 = true;
									}
									if (method303(743, var12)) {
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
							if (local11 - 1 < 0 || method300(arg2[local11 - 1], (byte) 8) && arg2[local11 - 1] != '\'') {
								local216 = true;
							}
							if (local15 >= arg2.length || method300(arg2[local15], (byte) 8) && arg2[local15] != '\'') {
								local218 = true;
							}
							if (!local216 || !local218) {
								@Pc(262) boolean local262 = false;
								local266 = local11 - 2;
								if (local216) {
									local266 = local11;
								}
								while (!local262 && local266 < local15) {
									if (local266 >= 0 && (!method300(arg2[local266], (byte) 8) || arg2[local266] == '\'')) {
										@Pc(288) char[] local288 = new char[3];
										@Pc(290) int local290;
										for (local290 = 0; local290 < 3 && local266 + local290 < arg2.length && (!method300(arg2[local266 + local290], (byte) 8) || arg2[local266 + local290] == '\''); local290++) {
											local288[local290] = arg2[local266 + local290];
										}
										@Pc(328) boolean local328 = true;
										if (local290 == 0) {
											local328 = false;
										}
										if (local290 < 3 && local266 - 1 >= 0 && (!method300(arg2[local266 - 1], (byte) 8) || arg2[local266 - 1] == '\'')) {
											local328 = false;
										}
										if (local328 && !method306(local288)) {
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
							@Pc(198) byte local198 = method296(var12);
							@Pc(202) byte local202 = method296(var13);
							if (arg1 != null && method293(local202, local198, arg1)) {
								local170 = false;
							}
						}
						if (local170) {
							@Pc(378) int local378 = 0;
							@Pc(380) int local380 = 0;
							@Pc(382) int local382 = -1;
							for (local266 = local11; local266 < local15; local266++) {
								if (method303(743, arg2[local266])) {
									local378++;
								} else if (method302(arg2[local266], anInt461)) {
									local380++;
									local382 = local266;
								}
							}
							if (local382 > -1) {
								local378 -= local15 - local382 - 1;
							}
							if (local378 <= local380) {
								for (@Pc(424) int local424 = local11; local424 < local15; local424++) {
									arg2[local424] = '*';
								}
							} else {
								local21 = 1;
							}
						}
					}
				}
			}
		} catch (@Pc(456) RuntimeException local456) {
			signlink.reporterror("48815, " + 8 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local456.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MOLFGQQL", name = "a", descriptor = "(BB[[BI)Z")
	private static boolean method293(@OriginalArg(0) byte arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte[][] arg2) {
		try {
			@Pc(1) int local1 = 0;
			if (arg2[0][0] == arg1 && arg2[0][1] == arg0) {
				return true;
			}
			@Pc(30) int local30 = arg2.length - 1;
			if (arg2[local30][0] == arg1 && arg2[local30][1] == arg0) {
				return true;
			}
			do {
				@Pc(52) int local52 = (local1 + local30) / 2;
				if (arg2[local52][0] == arg1 && arg2[local52][1] == arg0) {
					return true;
				}
				if (arg1 < arg2[local52][0] || arg1 == arg2[local52][0] && arg0 < arg2[local52][1]) {
					local30 = local52;
				} else {
					local1 = local52;
				}
			} while (local1 != local30 && local1 + 1 != local30);
			return false;
		} catch (@Pc(106) RuntimeException local106) {
			signlink.reporterror("8933, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local106.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MOLFGQQL", name = "a", descriptor = "(ICCC)I")
	private static int method294(@OriginalArg(1) char arg0, @OriginalArg(2) char arg1, @OriginalArg(3) char arg2) {
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
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("87402, " + 3 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MOLFGQQL", name = "a", descriptor = "(CCIC)I")
	private static int method295(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(3) char arg2) {
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
		} catch (@Pc(517) RuntimeException local517) {
			signlink.reporterror("32454, " + arg0 + ", " + arg1 + ", " + 2 + ", " + arg2 + ", " + local517.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MOLFGQQL", name = "a", descriptor = "(IC)B")
	private static byte method296(@OriginalArg(1) char arg0) {
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
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("97968, " + -35667 + ", " + arg0 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MOLFGQQL", name = "a", descriptor = "([CB)V")
	private static void method297(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(10) int local10 = 0;
			@Pc(12) int local12 = 0;
			@Pc(14) int local14 = 0;
			while (true) {
				do {
					@Pc(113) int local113;
					if ((local113 = method298(local10, arg0)) == -1) {
						return;
					}
					@Pc(18) boolean local18 = false;
					for (@Pc(20) int local20 = local10; local20 >= 0 && local20 < local113 && !local18; local20++) {
						if (!method300(arg0[local20], (byte) 8) && !method301(arg0[local20])) {
							local18 = true;
						}
					}
					if (local18) {
						local12 = 0;
					}
					if (local12 == 0) {
						local14 = local113;
					}
					local10 = method299(local113, arg0);
					@Pc(59) int local59 = 0;
					for (@Pc(61) int local61 = local113; local61 < local10; local61++) {
						local59 = local59 * 10 + arg0[local61] - 48;
					}
					if (local59 <= 255 && local10 - local113 <= 8) {
						local12++;
					} else {
						local12 = 0;
					}
				} while (local12 != 4);
				for (@Pc(95) int local95 = local14; local95 < local10; local95++) {
					arg0[local95] = '*';
				}
				local12 = 0;
			}
		} catch (@Pc(117) RuntimeException local117) {
			signlink.reporterror("56918, " + arg0 + ", " + 68 + ", " + local117.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MOLFGQQL", name = "a", descriptor = "(I[CZ)I")
	private static int method298(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1) {
		try {
			for (@Pc(5) int local5 = arg0; local5 < arg1.length && local5 >= 0; local5++) {
				if (arg1[local5] >= '0' && arg1[local5] <= '9') {
					return local5;
				}
			}
			return -1;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("55101, " + arg0 + ", " + arg1 + ", " + false + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MOLFGQQL", name = "a", descriptor = "(II[C)I")
	private static int method299(@OriginalArg(0) int arg0, @OriginalArg(2) char[] arg1) {
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
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("70271, " + arg0 + ", " + 11510 + ", " + arg1 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MOLFGQQL", name = "a", descriptor = "(CB)Z")
	private static boolean method300(@OriginalArg(0) char arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(6) boolean local6 = false;
			return !method302(arg0, anInt461) && !method303(743, arg0);
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("79293, " + arg0 + ", " + arg1 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MOLFGQQL", name = "a", descriptor = "(BC)Z")
	private static boolean method301(@OriginalArg(1) char arg0) {
		try {
			if (arg0 >= 'a' && arg0 <= 'z') {
				return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
			} else {
				return true;
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("12301, " + -125 + ", " + arg0 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MOLFGQQL", name = "a", descriptor = "(CI)Z")
	private static boolean method302(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 != 0) {
				anInt462 = 456;
			}
			return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("81871, " + arg0 + ", " + arg1 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MOLFGQQL", name = "b", descriptor = "(IC)Z")
	private static boolean method303(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		try {
			@Pc(3) boolean local3 = false;
			return arg1 >= '0' && arg1 <= '9';
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("23418, " + arg0 + ", " + arg1 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MOLFGQQL", name = "b", descriptor = "(CI)Z")
	private static boolean method304(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		try {
			while (arg1 >= 0) {
				anInt461 = -290;
			}
			if (arg0 >= 'a' && arg0 <= 'z') {
				return true;
			} else {
				return false;
			}
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("29810, " + arg0 + ", " + arg1 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MOLFGQQL", name = "a", descriptor = "(ZC)Z")
	private static boolean method305(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("11652, " + true + ", " + arg0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MOLFGQQL", name = "b", descriptor = "([CB)Z")
	private static boolean method306(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				if (!method303(743, arg0[local5]) && arg0[local5] != '\u0000') {
					local3 = false;
				}
			}
			if (local3) {
				return true;
			}
			@Pc(41) int local41 = method307(arg0);
			@Pc(43) int local43 = 0;
			@Pc(48) int local48 = anIntArray131.length - 1;
			if (local41 == anIntArray131[0] || local41 == anIntArray131[local48]) {
				return true;
			}
			do {
				@Pc(66) int local66 = (local43 + local48) / 2;
				if (local41 == anIntArray131[local66]) {
					return true;
				}
				if (local41 < anIntArray131[local66]) {
					local48 = local66;
				} else {
					local43 = local66;
				}
			} while (local43 != local48 && local43 + 1 != local48);
			return false;
		} catch (@Pc(95) RuntimeException local95) {
			signlink.reporterror("91553, " + arg0 + ", " + 0 + ", " + local95.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MOLFGQQL", name = "b", descriptor = "(Z[C)I")
	private static int method307(@OriginalArg(1) char[] arg0) {
		try {
			if (arg0.length > 6) {
				return 0;
			}
			@Pc(9) int local9 = 0;
			for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
				@Pc(22) char local22 = arg0[arg0.length - local11 - 1];
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
			return local9;
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("2418, " + true + ", " + arg0 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}
}
