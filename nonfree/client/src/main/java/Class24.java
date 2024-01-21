import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!PBBEXDRS")
public final class Class24 {

	@OriginalMember(owner = "client!PBBEXDRS", name = "c", descriptor = "I")
	private static int anInt496;

	@OriginalMember(owner = "client!PBBEXDRS", name = "d", descriptor = "Z")
	private static boolean aBoolean133;

	@OriginalMember(owner = "client!PBBEXDRS", name = "f", descriptor = "Z")
	private static boolean aBoolean134;

	@OriginalMember(owner = "client!PBBEXDRS", name = "n", descriptor = "I")
	private static int anInt504;

	@OriginalMember(owner = "client!PBBEXDRS", name = "o", descriptor = "[I")
	private static int[] anIntArray137;

	@OriginalMember(owner = "client!PBBEXDRS", name = "p", descriptor = "[[C")
	private static char[][] aCharArrayArray1;

	@OriginalMember(owner = "client!PBBEXDRS", name = "q", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!PBBEXDRS", name = "r", descriptor = "[[C")
	private static char[][] aCharArrayArray2;

	@OriginalMember(owner = "client!PBBEXDRS", name = "s", descriptor = "[[C")
	private static char[][] aCharArrayArray3;

	@OriginalMember(owner = "client!PBBEXDRS", name = "t", descriptor = "[I")
	private static int[] anIntArray138;

	@OriginalMember(owner = "client!PBBEXDRS", name = "a", descriptor = "Z")
	private static boolean aBoolean132 = true;

	@OriginalMember(owner = "client!PBBEXDRS", name = "b", descriptor = "I")
	private static int anInt495 = 778;

	@OriginalMember(owner = "client!PBBEXDRS", name = "e", descriptor = "I")
	private static int anInt497 = -686;

	@OriginalMember(owner = "client!PBBEXDRS", name = "g", descriptor = "I")
	private static int anInt498 = -29;

	@OriginalMember(owner = "client!PBBEXDRS", name = "h", descriptor = "I")
	private static int anInt499 = 36177;

	@OriginalMember(owner = "client!PBBEXDRS", name = "i", descriptor = "I")
	private static int anInt500 = 536;

	@OriginalMember(owner = "client!PBBEXDRS", name = "j", descriptor = "I")
	private static int anInt501 = -5190;

	@OriginalMember(owner = "client!PBBEXDRS", name = "k", descriptor = "I")
	private static int anInt502 = -725;

	@OriginalMember(owner = "client!PBBEXDRS", name = "l", descriptor = "I")
	private static int anInt503 = 47691;

	@OriginalMember(owner = "client!PBBEXDRS", name = "u", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray4;

	static {
		aBoolean135 = true;
		aStringArray4 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };
	}

	@OriginalMember(owner = "client!PBBEXDRS", name = "a", descriptor = "(Lclient!GWOEELWB;)V")
	public static void method297(@OriginalArg(0) Class13 arg0) {
		@Pc(10) Class3_Sub1_Sub2 local10 = new Class3_Sub1_Sub2(true, arg0.method140("fragmentsenc.txt", null));
		@Pc(19) Class3_Sub1_Sub2 local19 = new Class3_Sub1_Sub2(true, arg0.method140("badenc.txt", null));
		@Pc(28) Class3_Sub1_Sub2 local28 = new Class3_Sub1_Sub2(true, arg0.method140("domainenc.txt", null));
		@Pc(37) Class3_Sub1_Sub2 local37 = new Class3_Sub1_Sub2(true, arg0.method140("tldlist.txt", null));
		method298(local10, local19, local28, local37);
	}

	@OriginalMember(owner = "client!PBBEXDRS", name = "a", descriptor = "(Lclient!MLYYHULT;Lclient!MLYYHULT;Lclient!MLYYHULT;Lclient!MLYYHULT;)V")
	private static void method298(@OriginalArg(0) Class3_Sub1_Sub2 arg0, @OriginalArg(1) Class3_Sub1_Sub2 arg1, @OriginalArg(2) Class3_Sub1_Sub2 arg2, @OriginalArg(3) Class3_Sub1_Sub2 arg3) {
		method300(778, arg1);
		method301(arg2);
		method302(arg0, anInt496);
		method299(arg3);
	}

	@OriginalMember(owner = "client!PBBEXDRS", name = "a", descriptor = "(Lclient!MLYYHULT;I)V")
	private static void method299(@OriginalArg(0) Class3_Sub1_Sub2 arg0) {
		try {
			@Pc(4) int local4 = arg0.method205();
			aCharArrayArray3 = new char[local4][];
			anIntArray138 = new int[local4];
			for (@Pc(16) int local16 = 0; local16 < local4; local16++) {
				anIntArray138[local16] = arg0.method200();
				@Pc(27) char[] local27 = new char[arg0.method200()];
				for (@Pc(29) int local29 = 0; local29 < local27.length; local29++) {
					local27[local29] = (char) arg0.method200();
				}
				aCharArrayArray3[local16] = local27;
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("90056, " + arg0 + ", " + 0 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PBBEXDRS", name = "a", descriptor = "(ILclient!MLYYHULT;)V")
	private static void method300(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub2 arg1) {
		try {
			@Pc(2) int local2 = arg1.method205();
			aCharArrayArray1 = new char[local2][];
			aByteArrayArrayArray7 = new byte[local2][][];
			method303(aCharArrayArray1, aByteArrayArrayArray7, arg1);
			@Pc(17) boolean local17 = false;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("80803, " + arg0 + ", " + arg1 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PBBEXDRS", name = "b", descriptor = "(Lclient!MLYYHULT;I)V")
	private static void method301(@OriginalArg(0) Class3_Sub1_Sub2 arg0) {
		try {
			@Pc(2) int local2 = arg0.method205();
			aCharArrayArray2 = new char[local2][];
			method304(aCharArrayArray2, arg0);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("75536, " + arg0 + ", " + -135 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PBBEXDRS", name = "c", descriptor = "(Lclient!MLYYHULT;I)V")
	private static void method302(@OriginalArg(0) Class3_Sub1_Sub2 arg0, @OriginalArg(1) int arg1) {
		try {
			anIntArray137 = new int[arg0.method205()];
			if (arg1 != 0) {
				aBoolean132 = !aBoolean132;
			}
			for (@Pc(13) int local13 = 0; local13 < anIntArray137.length; local13++) {
				anIntArray137[local13] = arg0.method202();
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("11636, " + arg0 + ", " + arg1 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PBBEXDRS", name = "a", descriptor = "(B[[C[[[BLclient!MLYYHULT;)V")
	private static void method303(@OriginalArg(1) char[][] arg0, @OriginalArg(2) byte[][][] arg1, @OriginalArg(3) Class3_Sub1_Sub2 arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
				@Pc(9) char[] local9 = new char[arg2.method200()];
				for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
					local9[local11] = (char) arg2.method200();
				}
				arg0[local3] = local9;
				@Pc(33) byte[][] local33 = new byte[arg2.method200()][2];
				for (@Pc(35) int local35 = 0; local35 < local33.length; local35++) {
					local33[local35][0] = (byte) arg2.method200();
					local33[local35][1] = (byte) arg2.method200();
				}
				if (local33.length > 0) {
					arg1[local3] = local33;
				}
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("59203, " + -35 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PBBEXDRS", name = "a", descriptor = "([[CILclient!MLYYHULT;)V")
	private static void method304(@OriginalArg(0) char[][] arg0, @OriginalArg(2) Class3_Sub1_Sub2 arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
				@Pc(9) char[] local9 = new char[arg1.method200()];
				for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
					local9[local11] = (char) arg1.method200();
				}
				arg0[local3] = local9;
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("66165, " + arg0 + ", " + 980 + ", " + arg1 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PBBEXDRS", name = "a", descriptor = "([CI)V")
	private static void method305(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) int local3 = 0;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				if (method306(arg0[local5], (byte) 8)) {
					arg0[local3] = arg0[local5];
				} else {
					arg0[local3] = ' ';
				}
				if (local3 == 0 || arg0[local3] != ' ' || arg0[local3 - 1] != ' ') {
					local3++;
				}
			}
			for (@Pc(51) int local51 = local3; local51 < arg0.length; local51++) {
				arg0[local51] = ' ';
			}
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("76693, " + arg0 + ", " + 146 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PBBEXDRS", name = "a", descriptor = "(CB)Z")
	private static boolean method306(@OriginalArg(0) char arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(4) boolean local4 = false;
			return arg0 >= ' ' && arg0 <= '\u007f' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("67319, " + arg0 + ", " + arg1 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PBBEXDRS", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method307(@OriginalArg(1) String arg0) {
		try {
			@Pc(3) long local3 = System.currentTimeMillis();
			@Pc(6) char[] local6 = arg0.toCharArray();
			method305(local6);
			@Pc(15) String local15 = (new String(local6)).trim();
			@Pc(19) char[] local19 = local15.toLowerCase().toCharArray();
			@Pc(22) String local22 = local15.toLowerCase();
			method315((byte) 4, local19);
			method310(local19);
			method311(local19);
			method324(local19, anInt499);
			for (@Pc(42) int local42 = 0; local42 < aStringArray4.length; local42++) {
				@Pc(52) int local52 = -1;
				while ((local52 = local22.indexOf(aStringArray4[local42], local52 + 1)) != -1) {
					@Pc(59) char[] local59 = aStringArray4[local42].toCharArray();
					for (@Pc(61) int local61 = 0; local61 < local59.length; local61++) {
						local19[local61 + local52] = local59[local61];
					}
				}
			}
			method308(local15.toCharArray(), local19);
			method309(local19);
			@Pc(103) long local103 = System.currentTimeMillis();
			return (new String(local19)).trim();
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("32648, " + 0 + ", " + arg0 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PBBEXDRS", name = "a", descriptor = "([C[CI)V")
	private static void method308(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1) {
		try {
			for (@Pc(16) int local16 = 0; local16 < arg0.length; local16++) {
				if (arg1[local16] != '*' && method332(arg0[local16])) {
					arg1[local16] = arg0[local16];
				}
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("46399, " + arg0 + ", " + arg1 + ", " + 6 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PBBEXDRS", name = "a", descriptor = "(Z[C)V")
	private static void method309(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				@Pc(11) char local11 = arg0[local5];
				if (!method329(local11)) {
					local3 = true;
				} else if (local3) {
					if (method331(local11, anInt502)) {
						local3 = false;
					}
				} else if (method332(local11)) {
					arg0[local5] = (char) (local11 + 'a' - 65);
				}
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("80193, " + false + ", " + arg0 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PBBEXDRS", name = "b", descriptor = "([CI)V")
	private static void method310(@OriginalArg(0) char[] arg0) {
		try {
			for (@Pc(13) int local13 = 0; local13 < 2; local13++) {
				for (@Pc(20) int local20 = aCharArrayArray1.length - 1; local20 >= 0; local20--) {
					method319(arg0, aByteArrayArrayArray7[local20], aCharArrayArray1[local20]);
				}
			}
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("66602, " + arg0 + ", " + -686 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PBBEXDRS", name = "c", descriptor = "([CI)V")
	private static void method311(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(18) char[] local18 = new char[] { '(', 'a', ')' };
			method319(local3, null, local18);
			@Pc(36) char[] local36 = (char[]) arg0.clone();
			@Pc(51) char[] local51 = new char[] { 'd', 'o', 't' };
			method319(local36, null, local51);
			for (@Pc(61) int local61 = aCharArrayArray2.length - 1; local61 >= 0; local61--) {
				method312(arg0, local3, aCharArrayArray2[local61], local36);
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("72409, " + arg0 + ", " + -40436 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PBBEXDRS", name = "a", descriptor = "([C[C[C[CB)V")
	private static void method312(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) char[] arg3) {
		try {
			if (arg2.length <= arg0.length) {
				@Pc(19) int local19;
				for (@Pc(11) int local11 = 0; local11 <= arg0.length - arg2.length; local11 += local19) {
					@Pc(15) int local15 = local11;
					@Pc(17) int local17 = 0;
					local19 = 1;
					label59: while (true) {
						while (true) {
							if (local15 >= arg0.length) {
								break label59;
							}
							@Pc(27) char local27 = arg0[local15];
							@Pc(29) char local29 = 0;
							if (local15 + 1 < arg0.length) {
								local29 = arg0[local15 + 1];
							}
							@Pc(54) int local54;
							if (local17 < arg2.length && (local54 = method321(local29, arg2[local17], local27)) > 0) {
								local15 += local54;
								local17++;
							} else {
								if (local17 == 0) {
									break label59;
								}
								@Pc(75) int local75;
								if ((local75 = method321(local29, arg2[local17 - 1], local27)) > 0) {
									local15 += local75;
									if (local17 == 1) {
										local19++;
									}
								} else {
									if (local17 >= arg2.length || !method327(local27)) {
										break label59;
									}
									local15++;
								}
							}
						}
					}
					if (local17 >= arg2.length) {
						@Pc(106) boolean local106 = false;
						@Pc(112) int local112 = method313(arg1, local11, (byte) 4, arg0);
						@Pc(120) int local120 = method314(arg3, arg0, local15 - 1);
						if (local112 > 2 || local120 > 2) {
							local106 = true;
						}
						if (local106) {
							for (@Pc(132) int local132 = local11; local132 < local15; local132++) {
								arg0[local132] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("41354, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 116 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PBBEXDRS", name = "a", descriptor = "([CIB[C)I")
	private static int method313(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) char[] arg3) {
		try {
			if (arg1 == 0) {
				return 2;
			}
			for (@Pc(9) int local9 = arg1 - 1; local9 >= 0 && method327(arg3[local9]); local9--) {
				if (arg3[local9] == '@') {
					return 3;
				}
			}
			@Pc(32) boolean local32 = false;
			@Pc(38) int local38 = 0;
			for (@Pc(42) int local42 = arg1 - 1; local42 >= 0 && method327(arg0[local42]); local42--) {
				if (arg0[local42] == '*') {
					local38++;
				}
			}
			if (local38 >= 3) {
				return 4;
			} else if (method327(arg3[arg1 - 1])) {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("27811, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PBBEXDRS", name = "a", descriptor = "([C[CZI)I")
	private static int method314(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 + 1 == arg1.length) {
				return 2;
			}
			@Pc(21) int local21 = arg2 + 1;
			while (true) {
				if (local21 < arg1.length && method327(arg1[local21])) {
					if (arg1[local21] != '.' && arg1[local21] != ',') {
						local21++;
						continue;
					}
					return 3;
				}
				@Pc(48) int local48 = 0;
				for (@Pc(52) int local52 = arg2 + 1; local52 < arg1.length && method327(arg0[local52]); local52++) {
					if (arg0[local52] == '*') {
						local48++;
					}
				}
				if (local48 >= 3) {
					return 4;
				}
				if (method327(arg1[arg2 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("29558, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PBBEXDRS", name = "a", descriptor = "(B[C)V")
	private static void method315(@OriginalArg(0) byte arg0, @OriginalArg(1) char[] arg1) {
		try {
			@Pc(5) char[] local5 = (char[]) arg1.clone();
			@Pc(20) char[] local20 = new char[] { 'd', 'o', 't' };
			method319(local5, null, local20);
			@Pc(29) char[] local29 = (char[]) arg1.clone();
			@Pc(52) char[] local52 = new char[] { 's', 'l', 'a', 's', 'h' };
			method319(local29, null, local52);
			@Pc(62) boolean local62 = false;
			for (@Pc(73) int local73 = 0; local73 < aCharArrayArray3.length; local73++) {
				method316(aCharArrayArray3[local73], local29, local5, anIntArray138[local73], arg1);
			}
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("27627, " + arg0 + ", " + arg1 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PBBEXDRS", name = "a", descriptor = "([C[C[CI[CI)V")
	private static void method316(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) char[] arg4) {
		try {
			if (arg0.length <= arg4.length) {
				@Pc(22) int local22;
				for (@Pc(14) int local14 = 0; local14 <= arg4.length - arg0.length; local14 += local22) {
					@Pc(18) int local18 = local14;
					@Pc(20) int local20 = 0;
					local22 = 1;
					label120: while (true) {
						while (true) {
							if (local18 >= arg4.length) {
								break label120;
							}
							@Pc(30) char local30 = arg4[local18];
							@Pc(32) char local32 = 0;
							if (local18 + 1 < arg4.length) {
								local32 = arg4[local18 + 1];
							}
							@Pc(57) int local57;
							if (local20 < arg0.length && (local57 = method321(local32, arg0[local20], local30)) > 0) {
								local18 += local57;
								local20++;
							} else {
								if (local20 == 0) {
									break label120;
								}
								@Pc(78) int local78;
								if ((local78 = method321(local32, arg0[local20 - 1], local30)) > 0) {
									local18 += local78;
									if (local20 == 1) {
										local22++;
									}
								} else {
									if (local20 >= arg0.length || !method327(local30)) {
										break label120;
									}
									local18++;
								}
							}
						}
					}
					if (local20 >= arg0.length) {
						@Pc(109) boolean local109 = false;
						@Pc(115) int local115 = method317(arg4, arg2, local14);
						@Pc(123) int local123 = method318(local18 - 1, arg4, arg1);
						if (arg3 == 1 && local115 > 0 && local123 > 0) {
							local109 = true;
						}
						if (arg3 == 2 && (local115 > 2 && local123 > 0 || local115 > 0 && local123 > 2)) {
							local109 = true;
						}
						if (arg3 == 3 && local115 > 0 && local123 > 2) {
							local109 = true;
						}
						@Pc(166) boolean local166;
						if (arg3 == 3 && local115 > 2 && local123 > 0) {
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
											if (arg2[local189] != '*') {
												break;
											}
											local173 = local189;
										} else if (arg2[local189] == '*') {
											local173 = local189;
											local185 = true;
										}
									}
								}
								local185 = false;
								for (local189 = local173 - 1; local189 >= 0; local189--) {
									if (local185) {
										if (method327(arg4[local189])) {
											break;
										}
										local173 = local189;
									} else if (!method327(arg4[local189])) {
										local185 = true;
										local173 = local189;
									}
								}
							}
							if (local123 > 2) {
								if (local123 == 4) {
									local185 = false;
									for (local189 = local177 + 1; local189 < arg4.length; local189++) {
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
								for (local189 = local177 + 1; local189 < arg4.length; local189++) {
									if (local185) {
										if (method327(arg4[local189])) {
											break;
										}
										local177 = local189;
									} else if (!method327(arg4[local189])) {
										local185 = true;
										local177 = local189;
									}
								}
							}
							for (@Pc(323) int local323 = local173; local323 <= local177; local323++) {
								arg4[local323] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(346) RuntimeException local346) {
			signlink.reporterror("35251, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 0 + ", " + local346.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PBBEXDRS", name = "a", descriptor = "([CB[CI)I")
	private static int method317(@OriginalArg(0) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 == 0) {
				return 2;
			}
			@Pc(18) int local18 = arg2 - 1;
			while (true) {
				if (local18 >= 0 && method327(arg0[local18])) {
					if (arg0[local18] != ',' && arg0[local18] != '.') {
						local18--;
						continue;
					}
					return 3;
				}
				@Pc(43) int local43 = 0;
				for (@Pc(47) int local47 = arg2 - 1; local47 >= 0 && method327(arg1[local47]); local47--) {
					if (arg1[local47] == '*') {
						local43++;
					}
				}
				if (local43 >= 3) {
					return 4;
				}
				if (method327(arg0[arg2 - 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("22805, " + arg0 + ", " + 96 + ", " + arg1 + ", " + arg2 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PBBEXDRS", name = "a", descriptor = "(II[C[C)I")
	private static int method318(@OriginalArg(0) int arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg0 + 1 == arg1.length) {
				return 2;
			}
			@Pc(18) int local18 = arg0 + 1;
			while (true) {
				if (local18 < arg1.length && method327(arg1[local18])) {
					if (arg1[local18] != '\\' && arg1[local18] != '/') {
						local18++;
						continue;
					}
					return 3;
				}
				@Pc(45) int local45 = 0;
				for (@Pc(49) int local49 = arg0 + 1; local49 < arg1.length && method327(arg2[local49]); local49++) {
					if (arg2[local49] == '*') {
						local45++;
					}
				}
				if (local45 >= 5) {
					return 4;
				}
				if (method327(arg1[arg0 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("48553, " + arg0 + ", " + 36572 + ", " + arg1 + ", " + arg2 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PBBEXDRS", name = "a", descriptor = "([C[[BI[C)V")
	private static void method319(@OriginalArg(0) char[] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg2.length <= arg0.length) {
				@Pc(30) int local30;
				for (@Pc(20) int local20 = 0; local20 <= arg0.length - arg2.length; local20 += local30) {
					@Pc(24) int local24 = local20;
					@Pc(26) int local26 = 0;
					@Pc(28) int local28 = 0;
					local30 = 1;
					@Pc(32) boolean local32 = false;
					@Pc(34) boolean local34 = false;
					@Pc(36) boolean local36 = false;
					@Pc(44) char var12;
					@Pc(46) char var13;
					label164: while (true) {
						while (true) {
							if (local24 >= arg0.length || local34 && local36) {
								break label164;
							}
							var12 = arg0[local24];
							var13 = '\u0000';
							if (local24 + 1 < arg0.length) {
								var13 = arg0[local24 + 1];
							}
							@Pc(71) int local71;
							if (local26 < arg2.length && (local71 = method322(var13, var12, arg2[local26])) > 0) {
								if (local71 == 1 && method330(var12)) {
									local34 = true;
								}
								if (local71 == 2 && (method330(var12) || method330(var13))) {
									local34 = true;
								}
								local24 += local71;
								local26++;
							} else {
								if (local26 == 0) {
									break label164;
								}
								@Pc(114) int local114;
								if ((local114 = method322(var13, var12, arg2[local26 - 1])) > 0) {
									local24 += local114;
									if (local26 == 1) {
										local30++;
									}
								} else {
									if (local26 >= arg2.length || !method328(var12)) {
										break label164;
									}
									if (method327(var12) && var12 != '\'') {
										local32 = true;
									}
									if (method330(var12)) {
										local36 = true;
									}
									local24++;
									local28++;
									if (local28 * 100 / (local24 - local20) > 90) {
										break label164;
									}
								}
							}
						}
					}
					if (local26 >= arg2.length && (!local34 || !local36)) {
						@Pc(179) boolean local179 = true;
						@Pc(275) int local275;
						if (local32) {
							@Pc(225) boolean local225 = false;
							@Pc(227) boolean local227 = false;
							if (local20 - 1 < 0 || method327(arg0[local20 - 1]) && arg0[local20 - 1] != '\'') {
								local225 = true;
							}
							if (local24 >= arg0.length || method327(arg0[local24]) && arg0[local24] != '\'') {
								local227 = true;
							}
							if (!local225 || !local227) {
								@Pc(271) boolean local271 = false;
								local275 = local20 - 2;
								if (local225) {
									local275 = local20;
								}
								while (!local271 && local275 < local24) {
									if (local275 >= 0 && (!method327(arg0[local275]) || arg0[local275] == '\'')) {
										@Pc(297) char[] local297 = new char[3];
										@Pc(299) int local299;
										for (local299 = 0; local299 < 3 && local275 + local299 < arg0.length && (!method327(arg0[local275 + local299]) || arg0[local275 + local299] == '\''); local299++) {
											local297[local299] = arg0[local275 + local299];
										}
										@Pc(337) boolean local337 = true;
										if (local299 == 0) {
											local337 = false;
										}
										if (local299 < 3 && local275 - 1 >= 0 && (!method327(arg0[local275 - 1]) || arg0[local275 - 1] == '\'')) {
											local337 = false;
										}
										if (local337 && !method333(local297)) {
											local271 = true;
										}
									}
									local275++;
								}
								if (!local271) {
									local179 = false;
								}
							}
						} else {
							var12 = ' ';
							if (local20 - 1 >= 0) {
								var12 = arg0[local20 - 1];
							}
							var13 = ' ';
							if (local24 < arg0.length) {
								var13 = arg0[local24];
							}
							@Pc(207) byte local207 = method323(var12);
							@Pc(211) byte local211 = method323(var13);
							if (arg1 != null && method320(arg1, local211, local207)) {
								local179 = false;
							}
						}
						if (local179) {
							@Pc(387) int local387 = 0;
							@Pc(389) int local389 = 0;
							@Pc(391) int local391 = -1;
							for (local275 = local20; local275 < local24; local275++) {
								if (method330(arg0[local275])) {
									local387++;
								} else if (method329(arg0[local275])) {
									local389++;
									local391 = local275;
								}
							}
							if (local391 > -1) {
								local387 -= local24 - local391 - 1;
							}
							if (local387 <= local389) {
								for (@Pc(433) int local433 = local20; local433 < local24; local433++) {
									arg0[local433] = '*';
								}
							} else {
								local30 = 1;
							}
						}
					}
				}
			}
		} catch (@Pc(460) RuntimeException local460) {
			signlink.reporterror("65633, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local460.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PBBEXDRS", name = "a", descriptor = "([[BBIB)Z")
	private static boolean method320(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte arg1, @OriginalArg(3) byte arg2) {
		try {
			@Pc(1) int local1 = 0;
			if (arg0[0][0] == arg2 && arg0[0][1] == arg1) {
				return true;
			}
			@Pc(28) int local28 = arg0.length - 1;
			if (arg0[local28][0] == arg2 && arg0[local28][1] == arg1) {
				return true;
			}
			do {
				@Pc(50) int local50 = (local1 + local28) / 2;
				if (arg0[local50][0] == arg2 && arg0[local50][1] == arg1) {
					return true;
				}
				if (arg2 < arg0[local50][0] || arg2 == arg0[local50][0] && arg1 < arg0[local50][1]) {
					local28 = local50;
				} else {
					local1 = local50;
				}
			} while (local1 != local28 && local1 + 1 != local28);
			return false;
		} catch (@Pc(104) RuntimeException local104) {
			signlink.reporterror("51524, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local104.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PBBEXDRS", name = "a", descriptor = "(CICC)I")
	private static int method321(@OriginalArg(0) char arg0, @OriginalArg(2) char arg1, @OriginalArg(3) char arg2) {
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
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("89932, " + arg0 + ", " + -25025 + ", " + arg1 + ", " + arg2 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PBBEXDRS", name = "a", descriptor = "(CZCC)I")
	private static int method322(@OriginalArg(0) char arg0, @OriginalArg(2) char arg1, @OriginalArg(3) char arg2) {
		try {
			if (arg2 == arg1) {
				return 1;
			}
			if (arg2 >= 'a' && arg2 <= 'm') {
				if (arg2 == 'a') {
					if (arg1 != '4' && arg1 != '@' && arg1 != '^') {
						if (arg1 == '/' && arg0 == '\\') {
							return 2;
						}
						return 0;
					}
					return 1;
				}
				if (arg2 == 'b') {
					if (arg1 != '6' && arg1 != '8') {
						if ((arg1 != '1' || arg0 != '3') && (arg1 != 'i' || arg0 != '3')) {
							return 0;
						}
						return 2;
					}
					return 1;
				}
				if (arg2 == 'c') {
					if (arg1 != '(' && arg1 != '<' && arg1 != '{' && arg1 != '[') {
						return 0;
					}
					return 1;
				}
				if (arg2 == 'd') {
					if ((arg1 != '[' || arg0 != ')') && (arg1 != 'i' || arg0 != ')')) {
						return 0;
					}
					return 2;
				}
				if (arg2 == 'e') {
					if (arg1 != '3' && arg1 != '€') {
						return 0;
					}
					return 1;
				}
				if (arg2 == 'f') {
					if (arg1 == 'p' && arg0 == 'h') {
						return 2;
					}
					if (arg1 == '£') {
						return 1;
					}
					return 0;
				}
				if (arg2 == 'g') {
					if (arg1 != '9' && arg1 != '6' && arg1 != 'q') {
						return 0;
					}
					return 1;
				}
				if (arg2 == 'h') {
					if (arg1 == '#') {
						return 1;
					}
					return 0;
				}
				if (arg2 == 'i') {
					if (arg1 != 'y' && arg1 != 'l' && arg1 != 'j' && arg1 != '1' && arg1 != '!' && arg1 != ':' && arg1 != ';' && arg1 != '|') {
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
					if (arg1 != '1' && arg1 != '|' && arg1 != 'i') {
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
					if (arg1 != '0' && arg1 != '*') {
						if ((arg1 != '(' || arg0 != ')') && (arg1 != '[' || arg0 != ']') && (arg1 != '{' || arg0 != '}') && (arg1 != '<' || arg0 != '>')) {
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
					if (arg1 != '5' && arg1 != 'z' && arg1 != '$' && arg1 != '2') {
						return 0;
					}
					return 1;
				}
				if (arg2 == 't') {
					if (arg1 != '7' && arg1 != '+') {
						return 0;
					}
					return 1;
				}
				if (arg2 == 'u') {
					if (arg1 == 'v') {
						return 1;
					}
					if ((arg1 != '\\' || arg0 != '/') && (arg1 != '\\' || arg0 != '|') && (arg1 != '|' || arg0 != '/')) {
						return 0;
					}
					return 2;
				}
				if (arg2 == 'v') {
					if ((arg1 != '\\' || arg0 != '/') && (arg1 != '\\' || arg0 != '|') && (arg1 != '|' || arg0 != '/')) {
						return 0;
					}
					return 2;
				}
				if (arg2 == 'w') {
					if (arg1 == 'v' && arg0 == 'v') {
						return 2;
					}
					return 0;
				}
				if (arg2 == 'x') {
					if ((arg1 != ')' || arg0 != '(') && (arg1 != '}' || arg0 != '{') && (arg1 != ']' || arg0 != '[') && (arg1 != '>' || arg0 != '<')) {
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
					if (arg1 == 'o' || arg1 == 'O') {
						return 1;
					} else if ((arg1 != '(' || arg0 != ')') && (arg1 != '{' || arg0 != '}') && (arg1 != '[' || arg0 != ']')) {
						return 0;
					} else {
						return 2;
					}
				} else if (arg2 == '1') {
					return arg1 == 'l' ? 1 : 0;
				} else {
					return 0;
				}
			} else if (arg2 == ',') {
				return arg1 == '.' ? 1 : 0;
			} else if (arg2 == '.') {
				return arg1 == ',' ? 1 : 0;
			} else if (arg2 == '!') {
				return arg1 == 'i' ? 1 : 0;
			} else {
				return 0;
			}
		} catch (@Pc(516) RuntimeException local516) {
			signlink.reporterror("98633, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + local516.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PBBEXDRS", name = "a", descriptor = "(CZ)B")
	private static byte method323(@OriginalArg(0) char arg0) {
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
			signlink.reporterror("35700, " + arg0 + ", " + true + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PBBEXDRS", name = "d", descriptor = "([CI)V")
	private static void method324(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 != 36177) {
				anInt498 = 438;
			}
			@Pc(10) int local10 = 0;
			@Pc(12) int local12 = 0;
			@Pc(14) int local14 = 0;
			while (true) {
				do {
					@Pc(113) int local113;
					if ((local113 = method325(arg0, local10)) == -1) {
						return;
					}
					@Pc(18) boolean local18 = false;
					for (@Pc(20) int local20 = local10; local20 >= 0 && local20 < local113 && !local18; local20++) {
						if (!method327(arg0[local20]) && !method328(arg0[local20])) {
							local18 = true;
						}
					}
					if (local18) {
						local12 = 0;
					}
					if (local12 == 0) {
						local14 = local113;
					}
					local10 = method326(anInt500, local113, arg0);
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
			signlink.reporterror("27791, " + arg0 + ", " + arg1 + ", " + local117.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PBBEXDRS", name = "a", descriptor = "(I[CI)I")
	private static int method325(@OriginalArg(1) char[] arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(1) int local1 = arg1; local1 < arg0.length && local1 >= 0; local1++) {
				if (arg0[local1] >= '0' && arg0[local1] <= '9') {
					return local1;
				}
			}
			return -1;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("67037, " + 12466 + ", " + arg0 + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PBBEXDRS", name = "a", descriptor = "(II[C)I")
	private static int method326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) char[] arg2) {
		try {
			@Pc(5) int local5;
			if (arg0 <= 0) {
				for (local5 = 1; local5 > 0; local5++) {
				}
			}
			local5 = arg1;
			while (true) {
				if (local5 < arg2.length && local5 >= 0) {
					if (arg2[local5] >= '0' && arg2[local5] <= '9') {
						local5++;
						continue;
					}
					return local5;
				}
				return arg2.length;
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("72071, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PBBEXDRS", name = "a", descriptor = "(IC)Z")
	private static boolean method327(@OriginalArg(1) char arg0) {
		try {
			return !method329(arg0) && !method330(arg0);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("47547, " + 9 + ", " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PBBEXDRS", name = "b", descriptor = "(IC)Z")
	private static boolean method328(@OriginalArg(1) char arg0) {
		try {
			if (anInt501 != -5190) {
				aBoolean135 = true;
			}
			if (arg0 >= 'a' && arg0 <= 'z') {
				return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
			} else {
				return true;
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("104, " + -5190 + ", " + arg0 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PBBEXDRS", name = "a", descriptor = "(CI)Z")
	private static boolean method329(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("43387, " + arg0 + ", " + 0 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PBBEXDRS", name = "a", descriptor = "(BC)Z")
	private static boolean method330(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= '0' && arg0 <= '9';
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("91049, " + 67 + ", " + arg0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PBBEXDRS", name = "b", descriptor = "(CI)Z")
	private static boolean method331(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		try {
			while (arg1 >= 0) {
				for (@Pc(5) int local5 = 1; local5 > 0; local5++) {
				}
			}
			if (arg0 >= 'a' && arg0 <= 'z') {
				return true;
			} else {
				return false;
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("45642, " + arg0 + ", " + arg1 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PBBEXDRS", name = "c", descriptor = "(CI)Z")
	private static boolean method332(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("85422, " + arg0 + ", " + 722 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PBBEXDRS", name = "a", descriptor = "([CZ)Z")
	private static boolean method333(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				if (!method330(arg0[local5]) && arg0[local5] != '\u0000') {
					local3 = false;
				}
			}
			if (local3) {
				return true;
			}
			@Pc(32) int local32 = method334(arg0);
			@Pc(34) int local34 = 0;
			@Pc(39) int local39 = anIntArray137.length - 1;
			if (local32 == anIntArray137[0] || local32 == anIntArray137[local39]) {
				return true;
			}
			do {
				@Pc(61) int local61 = (local34 + local39) / 2;
				if (local32 == anIntArray137[local61]) {
					return true;
				}
				if (local32 < anIntArray137[local61]) {
					local39 = local61;
				} else {
					local34 = local61;
				}
			} while (local34 != local39 && local34 + 1 != local39);
			return false;
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("15468, " + arg0 + ", " + true + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PBBEXDRS", name = "a", descriptor = "([CB)I")
	private static int method334(@OriginalArg(0) char[] arg0) {
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
			signlink.reporterror("56592, " + arg0 + ", " + -15 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}
}
