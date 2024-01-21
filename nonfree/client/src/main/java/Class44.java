import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ULPSDNZC")
public final class Class44 {

	@OriginalMember(owner = "client!ULPSDNZC", name = "m", descriptor = "[I")
	private static int[] anIntArray180;

	@OriginalMember(owner = "client!ULPSDNZC", name = "n", descriptor = "[[C")
	private static char[][] aCharArrayArray1;

	@OriginalMember(owner = "client!ULPSDNZC", name = "o", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!ULPSDNZC", name = "p", descriptor = "[[C")
	private static char[][] aCharArrayArray2;

	@OriginalMember(owner = "client!ULPSDNZC", name = "q", descriptor = "[[C")
	private static char[][] aCharArrayArray3;

	@OriginalMember(owner = "client!ULPSDNZC", name = "r", descriptor = "[I")
	private static int[] anIntArray181;

	@OriginalMember(owner = "client!ULPSDNZC", name = "b", descriptor = "I")
	private static int anInt633;

	@OriginalMember(owner = "client!ULPSDNZC", name = "d", descriptor = "I")
	private static int anInt634;

	@OriginalMember(owner = "client!ULPSDNZC", name = "e", descriptor = "I")
	private static int anInt635;

	@OriginalMember(owner = "client!ULPSDNZC", name = "f", descriptor = "I")
	private static int anInt636;

	@OriginalMember(owner = "client!ULPSDNZC", name = "h", descriptor = "I")
	private static int anInt637;

	@OriginalMember(owner = "client!ULPSDNZC", name = "i", descriptor = "B")
	private static byte aByte33;

	@OriginalMember(owner = "client!ULPSDNZC", name = "j", descriptor = "Z")
	private static boolean aBoolean186;

	@OriginalMember(owner = "client!ULPSDNZC", name = "k", descriptor = "I")
	private static int anInt638;

	@OriginalMember(owner = "client!ULPSDNZC", name = "l", descriptor = "Z")
	private static boolean aBoolean187;

	@OriginalMember(owner = "client!ULPSDNZC", name = "s", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray7;

	static {
		aBoolean183 = true;
		anInt633 = -1681;
		anInt634 = -471;
		anInt635 = 9;
		anInt636 = 19413;
		aBoolean185 = true;
		anInt637 = -44;
		aByte33 = 8;
		aBoolean186 = true;
		anInt638 = 5;
		aBoolean187 = true;
		aStringArray7 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };
	}

	@OriginalMember(owner = "client!ULPSDNZC", name = "a", descriptor = "(Lclient!FNOQZAYQ;)V")
	public static void method427(@OriginalArg(0) Class8 arg0) {
		@Pc(10) Class2_Sub1_Sub4 local10 = new Class2_Sub1_Sub4(arg0.method165("fragmentsenc.txt", null), aBoolean183);
		@Pc(19) Class2_Sub1_Sub4 local19 = new Class2_Sub1_Sub4(arg0.method165("badenc.txt", null), aBoolean183);
		@Pc(28) Class2_Sub1_Sub4 local28 = new Class2_Sub1_Sub4(arg0.method165("domainenc.txt", null), aBoolean183);
		@Pc(37) Class2_Sub1_Sub4 local37 = new Class2_Sub1_Sub4(arg0.method165("tldlist.txt", null), aBoolean183);
		method428(local10, local19, local28, local37);
	}

	@OriginalMember(owner = "client!ULPSDNZC", name = "a", descriptor = "(Lclient!DNRIFKTO;Lclient!DNRIFKTO;Lclient!DNRIFKTO;Lclient!DNRIFKTO;)V")
	private static void method428(@OriginalArg(0) Class2_Sub1_Sub4 arg0, @OriginalArg(1) Class2_Sub1_Sub4 arg1, @OriginalArg(2) Class2_Sub1_Sub4 arg2, @OriginalArg(3) Class2_Sub1_Sub4 arg3) {
		method430(arg1);
		method431(anInt634, arg2);
		method432(arg0);
		method429(arg3);
	}

	@OriginalMember(owner = "client!ULPSDNZC", name = "a", descriptor = "(Lclient!DNRIFKTO;Z)V")
	private static void method429(@OriginalArg(0) Class2_Sub1_Sub4 arg0) {
		try {
			@Pc(4) int local4 = arg0.method99();
			aCharArrayArray3 = new char[local4][];
			anIntArray181 = new int[local4];
			for (@Pc(15) int local15 = 0; local15 < local4; local15++) {
				anIntArray181[local15] = arg0.method94();
				@Pc(26) char[] local26 = new char[arg0.method94()];
				for (@Pc(28) int local28 = 0; local28 < local26.length; local28++) {
					local26[local28] = (char) arg0.method94();
				}
				aCharArrayArray3[local15] = local26;
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("63176, " + arg0 + ", " + true + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ULPSDNZC", name = "a", descriptor = "(Lclient!DNRIFKTO;I)V")
	private static void method430(@OriginalArg(0) Class2_Sub1_Sub4 arg0) {
		try {
			@Pc(2) int local2 = arg0.method99();
			aCharArrayArray1 = new char[local2][];
			aByteArrayArrayArray7 = new byte[local2][][];
			method433(aCharArrayArray1, aByteArrayArrayArray7, arg0);
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("76460, " + arg0 + ", " + -19172 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ULPSDNZC", name = "a", descriptor = "(ILclient!DNRIFKTO;)V")
	private static void method431(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1_Sub4 arg1) {
		try {
			@Pc(2) int local2 = arg1.method99();
			aCharArrayArray2 = new char[local2][];
			if (arg0 >= 0) {
				aBoolean187 = !aBoolean187;
			}
			method434(aCharArrayArray2, arg1);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("70319, " + arg0 + ", " + arg1 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ULPSDNZC", name = "b", descriptor = "(Lclient!DNRIFKTO;Z)V")
	private static void method432(@OriginalArg(0) Class2_Sub1_Sub4 arg0) {
		try {
			anIntArray180 = new int[arg0.method99()];
			for (@Pc(13) int local13 = 0; local13 < anIntArray180.length; local13++) {
				anIntArray180[local13] = arg0.method96();
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("11406, " + arg0 + ", " + true + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ULPSDNZC", name = "a", descriptor = "([[CZ[[[BLclient!DNRIFKTO;)V")
	private static void method433(@OriginalArg(0) char[][] arg0, @OriginalArg(2) byte[][][] arg1, @OriginalArg(3) Class2_Sub1_Sub4 arg2) {
		try {
			for (@Pc(6) int local6 = 0; local6 < arg0.length; local6++) {
				@Pc(12) char[] local12 = new char[arg2.method94()];
				for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
					local12[local14] = (char) arg2.method94();
				}
				arg0[local6] = local12;
				@Pc(36) byte[][] local36 = new byte[arg2.method94()][2];
				for (@Pc(38) int local38 = 0; local38 < local36.length; local38++) {
					local36[local38][0] = (byte) arg2.method94();
					local36[local38][1] = (byte) arg2.method94();
				}
				if (local36.length > 0) {
					arg1[local6] = local36;
				}
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("49751, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ULPSDNZC", name = "a", descriptor = "([[CZLclient!DNRIFKTO;)V")
	private static void method434(@OriginalArg(0) char[][] arg0, @OriginalArg(2) Class2_Sub1_Sub4 arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
				@Pc(9) char[] local9 = new char[arg1.method94()];
				for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
					local9[local11] = (char) arg1.method94();
				}
				arg0[local3] = local9;
			}
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("77156, " + arg0 + ", " + false + ", " + arg1 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ULPSDNZC", name = "a", descriptor = "([CI)V")
	private static void method435(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(12) int local12 = 0;
			for (@Pc(14) int local14 = 0; local14 < arg0.length; local14++) {
				if (method436(arg0[local14])) {
					arg0[local12] = arg0[local14];
				} else {
					arg0[local12] = ' ';
				}
				if (local12 == 0 || arg0[local12] != ' ' || arg0[local12 - 1] != ' ') {
					local12++;
				}
			}
			for (@Pc(56) int local56 = local12; local56 < arg0.length; local56++) {
				arg0[local56] = ' ';
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("74152, " + arg0 + ", " + 480 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ULPSDNZC", name = "a", descriptor = "(CI)Z")
	private static boolean method436(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= ' ' && arg0 <= '\u007f' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("29258, " + arg0 + ", " + 89 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ULPSDNZC", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method437(@OriginalArg(1) String arg0) {
		try {
			@Pc(3) long local3 = System.currentTimeMillis();
			@Pc(6) char[] local6 = arg0.toCharArray();
			method435(local6);
			@Pc(15) String local15 = (new String(local6)).trim();
			@Pc(19) char[] local19 = local15.toLowerCase().toCharArray();
			@Pc(22) String local22 = local15.toLowerCase();
			method445(local19);
			method440(local19);
			method441(local19);
			method454(local19);
			for (@Pc(40) int local40 = 0; local40 < aStringArray7.length; local40++) {
				@Pc(50) int local50 = -1;
				while ((local50 = local22.indexOf(aStringArray7[local40], local50 + 1)) != -1) {
					@Pc(57) char[] local57 = aStringArray7[local40].toCharArray();
					for (@Pc(59) int local59 = 0; local59 < local57.length; local59++) {
						local19[local59 + local50] = local57[local59];
					}
				}
			}
			method438(local19, local15.toCharArray());
			method439(local19);
			@Pc(101) long local101 = System.currentTimeMillis();
			return (new String(local19)).trim();
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("11981, " + false + ", " + arg0 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ULPSDNZC", name = "a", descriptor = "([C[CI)V")
	private static void method438(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1) {
		try {
			for (@Pc(4) int local4 = 0; local4 < arg1.length; local4++) {
				if (arg0[local4] != '*' && method462(arg1[local4])) {
					arg0[local4] = arg1[local4];
				}
			}
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("33098, " + arg0 + ", " + arg1 + ", " + -989 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ULPSDNZC", name = "a", descriptor = "([CZ)V")
	private static void method439(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				@Pc(11) char local11 = arg0[local5];
				if (!method459(local11)) {
					local3 = true;
				} else if (local3) {
					if (method461(local11)) {
						local3 = false;
					}
				} else if (method462(local11)) {
					arg0[local5] = (char) (local11 + 'a' - 65);
				}
			}
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("29155, " + arg0 + ", " + true + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ULPSDNZC", name = "a", descriptor = "(Z[C)V")
	private static void method440(@OriginalArg(1) char[] arg0) {
		try {
			for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
				for (@Pc(19) int local19 = aCharArrayArray1.length - 1; local19 >= 0; local19--) {
					method449(aByteArrayArrayArray7[local19], arg0, aCharArrayArray1[local19], 911);
				}
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("99208, " + true + ", " + arg0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ULPSDNZC", name = "b", descriptor = "([CZ)V")
	private static void method441(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(18) char[] local18 = new char[] { '(', 'a', ')' };
			method449(null, local3, local18, 911);
			@Pc(31) char[] local31 = (char[]) arg0.clone();
			@Pc(46) char[] local46 = new char[] { 'd', 'o', 't' };
			method449(null, local31, local46, 911);
			for (@Pc(56) int local56 = aCharArrayArray2.length - 1; local56 >= 0; local56--) {
				method442(arg0, local31, aCharArrayArray2[local56], local3);
			}
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("14952, " + arg0 + ", " + true + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ULPSDNZC", name = "a", descriptor = "([C[CI[C[C)V")
	private static void method442(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(3) char[] arg2, @OriginalArg(4) char[] arg3) {
		try {
			if (arg2.length <= arg0.length) {
				@Pc(28) int local28;
				for (@Pc(20) int local20 = 0; local20 <= arg0.length - arg2.length; local20 += local28) {
					@Pc(24) int local24 = local20;
					@Pc(26) int local26 = 0;
					local28 = 1;
					label58: while (true) {
						while (true) {
							if (local24 >= arg0.length) {
								break label58;
							}
							@Pc(36) char local36 = arg0[local24];
							@Pc(38) char local38 = 0;
							if (local24 + 1 < arg0.length) {
								local38 = arg0[local24 + 1];
							}
							@Pc(63) int local63;
							if (local26 < arg2.length && (local63 = method451(local38, arg2[local26], 694, local36)) > 0) {
								local24 += local63;
								local26++;
							} else {
								if (local26 == 0) {
									break label58;
								}
								@Pc(84) int local84;
								if ((local84 = method451(local38, arg2[local26 - 1], 694, local36)) > 0) {
									local24 += local84;
									if (local26 == 1) {
										local28++;
									}
								} else {
									if (local26 >= arg2.length || !method457(local36, aByte33)) {
										break label58;
									}
									local24++;
								}
							}
						}
					}
					if (local26 >= arg2.length) {
						@Pc(115) boolean local115 = false;
						@Pc(121) int local121 = method443(arg0, arg3, local20);
						@Pc(129) int local129 = method444(arg1, 788, local24 - 1, arg0);
						if (local121 > 2 || local129 > 2) {
							local115 = true;
						}
						if (local115) {
							for (@Pc(141) int local141 = local20; local141 < local24; local141++) {
								arg0[local141] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(164) RuntimeException local164) {
			signlink.reporterror("53507, " + arg0 + ", " + arg1 + ", " + 3 + ", " + arg2 + ", " + arg3 + ", " + local164.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ULPSDNZC", name = "a", descriptor = "([CZ[CI)I")
	private static int method443(@OriginalArg(0) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 == 0) {
				return 2;
			}
			for (@Pc(9) int local9 = arg2 - 1; local9 >= 0 && method457(arg0[local9], aByte33); local9--) {
				if (arg0[local9] == '@') {
					return 3;
				}
			}
			@Pc(29) int local29 = 0;
			for (@Pc(33) int local33 = arg2 - 1; local33 >= 0 && method457(arg1[local33], aByte33); local33--) {
				if (arg1[local33] == '*') {
					local29++;
				}
			}
			if (local29 >= 3) {
				return 4;
			} else if (method457(arg0[arg2 - 1], aByte33)) {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("73348, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ULPSDNZC", name = "a", descriptor = "([CII[C)I")
	private static int method444(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) char[] arg3) {
		try {
			if (arg2 + 1 == arg3.length) {
				return 2;
			}
			@Pc(13) int local13 = arg2 + 1;
			while (true) {
				if (local13 < arg3.length && method457(arg3[local13], aByte33)) {
					if (arg3[local13] != '.' && arg3[local13] != ',') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(42) boolean local42 = false;
				@Pc(44) int local44 = 0;
				for (@Pc(48) int local48 = arg2 + 1; local48 < arg3.length && method457(arg0[local48], aByte33); local48++) {
					if (arg0[local48] == '*') {
						local44++;
					}
				}
				if (local44 >= 3) {
					return 4;
				}
				if (method457(arg3[arg2 + 1], aByte33)) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("81336, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ULPSDNZC", name = "a", descriptor = "(I[C)V")
	private static void method445(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(18) char[] local18 = new char[] { 'd', 'o', 't' };
			method449(null, local3, local18, 911);
			@Pc(36) char[] local36 = (char[]) arg0.clone();
			@Pc(59) char[] local59 = new char[] { 's', 'l', 'a', 's', 'h' };
			method449(null, local36, local59, 911);
			for (@Pc(66) int local66 = 0; local66 < aCharArrayArray3.length; local66++) {
				method446(aCharArrayArray3[local66], local3, arg0, local36, anIntArray181[local66]);
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("74757, " + 17327 + ", " + arg0 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ULPSDNZC", name = "a", descriptor = "([C[C[CI[CI)V")
	private static void method446(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2, @OriginalArg(4) char[] arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0.length <= arg2.length) {
				@Pc(19) int local19;
				@Pc(15) int local15;
				for (@Pc(11) int local11 = 0; local11 <= arg2.length - arg0.length; local11 += local19) {
					local15 = local11;
					@Pc(17) int local17 = 0;
					local19 = 1;
					label135: while (true) {
						while (true) {
							if (local15 >= arg2.length) {
								break label135;
							}
							@Pc(27) char local27 = arg2[local15];
							@Pc(29) char local29 = 0;
							if (local15 + 1 < arg2.length) {
								local29 = arg2[local15 + 1];
							}
							@Pc(54) int local54;
							if (local17 < arg0.length && (local54 = method451(local29, arg0[local17], 694, local27)) > 0) {
								local15 += local54;
								local17++;
							} else {
								if (local17 == 0) {
									break label135;
								}
								@Pc(75) int local75;
								if ((local75 = method451(local29, arg0[local17 - 1], 694, local27)) > 0) {
									local15 += local75;
									if (local17 == 1) {
										local19++;
									}
								} else {
									if (local17 >= arg0.length || !method457(local27, aByte33)) {
										break label135;
									}
									local15++;
								}
							}
						}
					}
					if (local17 >= arg0.length) {
						@Pc(106) boolean local106 = false;
						@Pc(112) int local112 = method447(local11, arg1, arg2);
						@Pc(120) int local120 = method448(arg3, local15 - 1, arg2);
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
											if (arg1[local186] != '*') {
												break;
											}
											local170 = local186;
										} else if (arg1[local186] == '*') {
											local170 = local186;
											local182 = true;
										}
									}
								}
								local182 = false;
								for (local186 = local170 - 1; local186 >= 0; local186--) {
									if (local182) {
										if (method457(arg2[local186], aByte33)) {
											break;
										}
										local170 = local186;
									} else if (!method457(arg2[local186], aByte33)) {
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
										if (method457(arg2[local186], aByte33)) {
											break;
										}
										local174 = local186;
									} else if (!method457(arg2[local186], aByte33)) {
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
				if (anInt635 > 9 || anInt635 < 9) {
					for (local15 = 1; local15 > 0; local15++) {
					}
				}
			}
		} catch (@Pc(356) RuntimeException local356) {
			signlink.reporterror("25014, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 9 + ", " + arg3 + ", " + arg4 + ", " + local356.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ULPSDNZC", name = "a", descriptor = "(IZ[C[C)I")
	private static int method447(@OriginalArg(0) int arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg0 == 0) {
				return 2;
			}
			@Pc(9) int local9 = arg0 - 1;
			while (true) {
				if (local9 >= 0 && method457(arg2[local9], aByte33)) {
					if (arg2[local9] != ',' && arg2[local9] != '.') {
						local9--;
						continue;
					}
					return 3;
				}
				@Pc(34) int local34 = 0;
				for (@Pc(42) int local42 = arg0 - 1; local42 >= 0 && method457(arg1[local42], aByte33); local42--) {
					if (arg1[local42] == '*') {
						local34++;
					}
				}
				if (local34 >= 3) {
					return 4;
				}
				if (method457(arg2[arg0 - 1], aByte33)) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("10857, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ULPSDNZC", name = "a", descriptor = "(I[CI[C)I")
	private static int method448(@OriginalArg(1) char[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) char[] arg2) {
		try {
			@Pc(6) int local6;
			if (anInt636 != 19413) {
				for (local6 = 1; local6 > 0; local6++) {
				}
			}
			if (arg1 + 1 == arg2.length) {
				return 2;
			}
			local6 = arg1 + 1;
			while (true) {
				if (local6 < arg2.length && method457(arg2[local6], aByte33)) {
					if (arg2[local6] != '\\' && arg2[local6] != '/') {
						local6++;
						continue;
					}
					return 3;
				}
				@Pc(50) int local50 = 0;
				for (@Pc(54) int local54 = arg1 + 1; local54 < arg2.length && method457(arg0[local54], aByte33); local54++) {
					if (arg0[local54] == '*') {
						local50++;
					}
				}
				if (local50 >= 5) {
					return 4;
				}
				if (method457(arg2[arg1 + 1], aByte33)) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("52385, " + 19413 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ULPSDNZC", name = "a", descriptor = "([[B[C[CI)V")
	private static void method449(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(5) boolean local5 = false;
			if (arg2.length <= arg1.length) {
				@Pc(25) int local25;
				for (@Pc(15) int local15 = 0; local15 <= arg1.length - arg2.length; local15 += local25) {
					@Pc(19) int local19 = local15;
					@Pc(21) int local21 = 0;
					@Pc(23) int local23 = 0;
					local25 = 1;
					@Pc(27) boolean local27 = false;
					@Pc(29) boolean local29 = false;
					@Pc(31) boolean local31 = false;
					@Pc(39) char var13;
					@Pc(41) char var14;
					label164: while (true) {
						while (true) {
							if (local19 >= arg1.length || local29 && local31) {
								break label164;
							}
							var13 = arg1[local19];
							var14 = '\u0000';
							if (local19 + 1 < arg1.length) {
								var14 = arg1[local19 + 1];
							}
							@Pc(66) int local66;
							if (local21 < arg2.length && (local66 = method452(var14, var13, arg2[local21])) > 0) {
								if (local66 == 1 && method460(var13)) {
									local29 = true;
								}
								if (local66 == 2 && (method460(var13) || method460(var14))) {
									local29 = true;
								}
								local19 += local66;
								local21++;
							} else {
								if (local21 == 0) {
									break label164;
								}
								@Pc(109) int local109;
								if ((local109 = method452(var14, var13, arg2[local21 - 1])) > 0) {
									local19 += local109;
									if (local21 == 1) {
										local25++;
									}
								} else {
									if (local21 >= arg2.length || !method458(var13)) {
										break label164;
									}
									if (method457(var13, aByte33) && var13 != '\'') {
										local27 = true;
									}
									if (method460(var13)) {
										local31 = true;
									}
									local19++;
									local23++;
									if (local23 * 100 / (local19 - local15) > 90) {
										break label164;
									}
								}
							}
						}
					}
					if (local21 >= arg2.length && (!local29 || !local31)) {
						@Pc(174) boolean local174 = true;
						@Pc(270) int local270;
						if (local27) {
							@Pc(220) boolean local220 = false;
							@Pc(222) boolean local222 = false;
							if (local15 - 1 < 0 || method457(arg1[local15 - 1], aByte33) && arg1[local15 - 1] != '\'') {
								local220 = true;
							}
							if (local19 >= arg1.length || method457(arg1[local19], aByte33) && arg1[local19] != '\'') {
								local222 = true;
							}
							if (!local220 || !local222) {
								@Pc(266) boolean local266 = false;
								local270 = local15 - 2;
								if (local220) {
									local270 = local15;
								}
								while (!local266 && local270 < local19) {
									if (local270 >= 0 && (!method457(arg1[local270], aByte33) || arg1[local270] == '\'')) {
										@Pc(292) char[] local292 = new char[3];
										@Pc(294) int local294;
										for (local294 = 0; local294 < 3 && local270 + local294 < arg1.length && (!method457(arg1[local270 + local294], aByte33) || arg1[local270 + local294] == '\''); local294++) {
											local292[local294] = arg1[local270 + local294];
										}
										@Pc(332) boolean local332 = true;
										if (local294 == 0) {
											local332 = false;
										}
										if (local294 < 3 && local270 - 1 >= 0 && (!method457(arg1[local270 - 1], aByte33) || arg1[local270 - 1] == '\'')) {
											local332 = false;
										}
										if (local332 && !method463(local292)) {
											local266 = true;
										}
									}
									local270++;
								}
								if (!local266) {
									local174 = false;
								}
							}
						} else {
							var13 = ' ';
							if (local15 - 1 >= 0) {
								var13 = arg1[local15 - 1];
							}
							var14 = ' ';
							if (local19 < arg1.length) {
								var14 = arg1[local19];
							}
							@Pc(202) byte local202 = method453(var13, 393);
							@Pc(206) byte local206 = method453(var14, 393);
							if (arg0 != null && method450(local202, local206, 248, arg0)) {
								local174 = false;
							}
						}
						if (local174) {
							@Pc(382) int local382 = 0;
							@Pc(384) int local384 = 0;
							@Pc(386) int local386 = -1;
							for (local270 = local15; local270 < local19; local270++) {
								if (method460(arg1[local270])) {
									local382++;
								} else if (method459(arg1[local270])) {
									local384++;
									local386 = local270;
								}
							}
							if (local386 > -1) {
								local382 -= local19 - local386 - 1;
							}
							if (local382 <= local384) {
								for (@Pc(428) int local428 = local15; local428 < local19; local428++) {
									arg1[local428] = '*';
								}
							} else {
								local25 = 1;
							}
						}
					}
				}
			}
		} catch (@Pc(455) RuntimeException local455) {
			signlink.reporterror("50408, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local455.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ULPSDNZC", name = "a", descriptor = "(BBI[[B)Z")
	private static boolean method450(@OriginalArg(0) byte arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[][] arg3) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(5) int local5 = 0;
			if (arg3[0][0] == arg0 && arg3[0][1] == arg1) {
				return true;
			}
			@Pc(26) int local26 = arg3.length - 1;
			if (arg3[local26][0] == arg0 && arg3[local26][1] == arg1) {
				return true;
			}
			do {
				@Pc(48) int local48 = (local5 + local26) / 2;
				if (arg3[local48][0] == arg0 && arg3[local48][1] == arg1) {
					return true;
				}
				if (arg0 < arg3[local48][0] || arg0 == arg3[local48][0] && arg1 < arg3[local48][1]) {
					local26 = local48;
				} else {
					local5 = local48;
				}
			} while (local5 != local26 && local5 + 1 != local26);
			return false;
		} catch (@Pc(102) RuntimeException local102) {
			signlink.reporterror("83675, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local102.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ULPSDNZC", name = "a", descriptor = "(CCIC)I")
	private static int method451(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(2) int arg2, @OriginalArg(3) char arg3) {
		try {
			@Pc(3) boolean local3 = false;
			if (arg1 == arg3) {
				return 1;
			} else if (arg1 == 'o' && arg3 == '0') {
				return 1;
			} else if (arg1 == 'o' && arg3 == '(' && arg0 == ')') {
				return 2;
			} else if (arg1 == 'c' && (arg3 == '(' || arg3 == '<' || arg3 == '[')) {
				return 1;
			} else if (arg1 == 'e' && arg3 == '€') {
				return 1;
			} else if (arg1 == 's' && arg3 == '$') {
				return 1;
			} else if (arg1 == 'l' && arg3 == 'i') {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("59424, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ULPSDNZC", name = "a", descriptor = "(ZCCC)I")
	private static int method452(@OriginalArg(1) char arg0, @OriginalArg(2) char arg1, @OriginalArg(3) char arg2) {
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
		} catch (@Pc(512) RuntimeException local512) {
			signlink.reporterror("1766, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local512.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ULPSDNZC", name = "b", descriptor = "(CI)B")
	private static byte method453(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			if (arg0 >= 'a' && arg0 <= 'z') {
				return (byte) (arg0 + 1 - 'a');
			} else if (arg0 == '\'') {
				return 28;
			} else if (arg0 >= '0' && arg0 <= '9') {
				return (byte) (arg0 + 29 - '0');
			} else {
				return 27;
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("89860, " + arg0 + ", " + arg1 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ULPSDNZC", name = "c", descriptor = "([CZ)V")
	private static void method454(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			@Pc(12) int local12 = 0;
			while (true) {
				do {
					@Pc(111) int local111;
					if ((local111 = method455(local5, anInt637, arg0)) == -1) {
						return;
					}
					@Pc(16) boolean local16 = false;
					for (@Pc(18) int local18 = local5; local18 >= 0 && local18 < local111 && !local16; local18++) {
						if (!method457(arg0[local18], aByte33) && !method458(arg0[local18])) {
							local16 = true;
						}
					}
					if (local16) {
						local7 = 0;
					}
					if (local7 == 0) {
						local12 = local111;
					}
					local5 = method456(arg0, local111, (byte) 4);
					@Pc(57) int local57 = 0;
					for (@Pc(59) int local59 = local111; local59 < local5; local59++) {
						local57 = local57 * 10 + arg0[local59] - 48;
					}
					if (local57 <= 255 && local5 - local111 <= 8) {
						local7++;
					} else {
						local7 = 0;
					}
				} while (local7 != 4);
				for (@Pc(93) int local93 = local12; local93 < local5; local93++) {
					arg0[local93] = '*';
				}
				local7 = 0;
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("71560, " + arg0 + ", " + true + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ULPSDNZC", name = "a", descriptor = "(II[C)I")
	private static int method455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) char[] arg2) {
		try {
			for (@Pc(1) int local1 = arg0; local1 < arg2.length && local1 >= 0; local1++) {
				if (arg2[local1] >= '0' && arg2[local1] <= '9') {
					return local1;
				}
			}
			return arg1 >= 0 ? anInt637 : -1;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("33650, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ULPSDNZC", name = "a", descriptor = "([CIB)I")
	private static int method456(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(16) int local16 = arg1;
			while (true) {
				if (local16 < arg0.length && local16 >= 0) {
					if (arg0[local16] >= '0' && arg0[local16] <= '9') {
						local16++;
						continue;
					}
					return local16;
				}
				return arg0.length;
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("55030, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ULPSDNZC", name = "a", descriptor = "(CB)Z")
	private static boolean method457(@OriginalArg(0) char arg0, @OriginalArg(1) byte arg1) {
		try {
			if (arg1 == 8) {
				@Pc(4) boolean local4 = false;
			}
			return !method459(arg0) && !method460(arg0);
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("40787, " + arg0 + ", " + arg1 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ULPSDNZC", name = "c", descriptor = "(CI)Z")
	private static boolean method458(@OriginalArg(0) char arg0) {
		try {
			if (arg0 >= 'a' && arg0 <= 'z') {
				return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
			} else {
				return true;
			}
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("15632, " + arg0 + ", " + 35772 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ULPSDNZC", name = "d", descriptor = "(CI)Z")
	private static boolean method459(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("79130, " + arg0 + ", " + 0 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ULPSDNZC", name = "a", descriptor = "(BC)Z")
	private static boolean method460(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= '0' && arg0 <= '9';
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("73804, " + 0 + ", " + arg0 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ULPSDNZC", name = "a", descriptor = "(CZ)Z")
	private static boolean method461(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z';
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("99100, " + arg0 + ", " + true + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ULPSDNZC", name = "a", descriptor = "(ZC)Z")
	private static boolean method462(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("76250, " + true + ", " + arg0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ULPSDNZC", name = "b", descriptor = "([CI)Z")
	private static boolean method463(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				if (!method460(arg0[local5]) && arg0[local5] != '\u0000') {
					local3 = false;
				}
			}
			if (local3) {
				return true;
			}
			@Pc(32) int local32 = method464(arg0);
			@Pc(40) int local40 = 0;
			@Pc(45) int local45 = anIntArray180.length - 1;
			if (local32 == anIntArray180[0] || local32 == anIntArray180[local45]) {
				return true;
			}
			do {
				@Pc(63) int local63 = (local40 + local45) / 2;
				if (local32 == anIntArray180[local63]) {
					return true;
				}
				if (local32 < anIntArray180[local63]) {
					local45 = local63;
				} else {
					local40 = local63;
				}
			} while (local40 != local45 && local40 + 1 != local45);
			return false;
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("48374, " + arg0 + ", " + 0 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ULPSDNZC", name = "a", descriptor = "(B[C)I")
	private static int method464(@OriginalArg(1) char[] arg0) {
		try {
			if (arg0.length > 6) {
				return 0;
			}
			@Pc(13) int local13 = 0;
			for (@Pc(15) int local15 = 0; local15 < arg0.length; local15++) {
				@Pc(26) char local26 = arg0[arg0.length - local15 - 1];
				if (local26 >= 'a' && local26 <= 'z') {
					local13 = local13 * 38 + local26 + 1 - 'a';
				} else if (local26 == '\'') {
					local13 = local13 * 38 + 27;
				} else if (local26 >= '0' && local26 <= '9') {
					local13 = local13 * 38 + local26 + 28 - '0';
				} else if (local26 != '\u0000') {
					return 0;
				}
			}
			return local13;
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("99380, " + 0 + ", " + arg0 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}
}
