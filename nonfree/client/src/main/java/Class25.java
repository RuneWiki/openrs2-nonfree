import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!NBTRSNNF")
public final class Class25 {

	@OriginalMember(owner = "client!NBTRSNNF", name = "a", descriptor = "I")
	private static int anInt497;

	@OriginalMember(owner = "client!NBTRSNNF", name = "d", descriptor = "Z")
	private static boolean aBoolean140;

	@OriginalMember(owner = "client!NBTRSNNF", name = "e", descriptor = "I")
	private static int anInt498;

	@OriginalMember(owner = "client!NBTRSNNF", name = "f", descriptor = "B")
	private static byte aByte25;

	@OriginalMember(owner = "client!NBTRSNNF", name = "i", descriptor = "I")
	private static int anInt500;

	@OriginalMember(owner = "client!NBTRSNNF", name = "j", descriptor = "[I")
	private static int[] anIntArray124;

	@OriginalMember(owner = "client!NBTRSNNF", name = "k", descriptor = "[[C")
	private static char[][] aCharArrayArray1;

	@OriginalMember(owner = "client!NBTRSNNF", name = "l", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!NBTRSNNF", name = "m", descriptor = "[[C")
	private static char[][] aCharArrayArray2;

	@OriginalMember(owner = "client!NBTRSNNF", name = "n", descriptor = "[[C")
	private static char[][] aCharArrayArray3;

	@OriginalMember(owner = "client!NBTRSNNF", name = "o", descriptor = "[I")
	private static int[] anIntArray125;

	@OriginalMember(owner = "client!NBTRSNNF", name = "c", descriptor = "Z")
	private static boolean aBoolean139 = true;

	@OriginalMember(owner = "client!NBTRSNNF", name = "g", descriptor = "B")
	private static byte aByte26 = 2;

	@OriginalMember(owner = "client!NBTRSNNF", name = "h", descriptor = "I")
	private static int anInt499 = 851;

	@OriginalMember(owner = "client!NBTRSNNF", name = "p", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray3 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

	@OriginalMember(owner = "client!NBTRSNNF", name = "a", descriptor = "(Lclient!SPZBTZXL;)V")
	public static void method435(@OriginalArg(0) Class35 arg0) {
		@Pc(10) Class1_Sub1_Sub3 local10 = new Class1_Sub1_Sub3(arg0.method491("fragmentsenc.txt", null), anInt497);
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(arg0.method491("badenc.txt", null), anInt497);
		@Pc(28) Class1_Sub1_Sub3 local28 = new Class1_Sub1_Sub3(arg0.method491("domainenc.txt", null), anInt497);
		@Pc(37) Class1_Sub1_Sub3 local37 = new Class1_Sub1_Sub3(arg0.method491("tldlist.txt", null), anInt497);
		method436(local10, local19, local28, local37);
	}

	@OriginalMember(owner = "client!NBTRSNNF", name = "a", descriptor = "(Lclient!LDILQFVA;Lclient!LDILQFVA;Lclient!LDILQFVA;Lclient!LDILQFVA;)V")
	private static void method436(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) Class1_Sub1_Sub3 arg2, @OriginalArg(3) Class1_Sub1_Sub3 arg3) {
		method438(arg1);
		method439((byte) 6, arg2);
		method440(arg0);
		method437((byte) 7, arg3);
	}

	@OriginalMember(owner = "client!NBTRSNNF", name = "a", descriptor = "(BLclient!LDILQFVA;)V")
	private static void method437(@OriginalArg(0) byte arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(12) int local12 = arg1.method364();
			aCharArrayArray3 = new char[local12][];
			anIntArray125 = new int[local12];
			for (@Pc(20) int local20 = 0; local20 < local12; local20++) {
				anIntArray125[local20] = arg1.method359();
				@Pc(31) char[] local31 = new char[arg1.method359()];
				for (@Pc(33) int local33 = 0; local33 < local31.length; local33++) {
					local31[local33] = (char) arg1.method359();
				}
				aCharArrayArray3[local20] = local31;
			}
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("83743, " + arg0 + ", " + arg1 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NBTRSNNF", name = "a", descriptor = "(Lclient!LDILQFVA;Z)V")
	private static void method438(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(2) int local2 = arg0.method364();
			aCharArrayArray1 = new char[local2][];
			aByteArrayArrayArray7 = new byte[local2][][];
			method441(arg0, aByteArrayArrayArray7, aCharArrayArray1);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("6834, " + arg0 + ", " + false + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NBTRSNNF", name = "b", descriptor = "(BLclient!LDILQFVA;)V")
	private static void method439(@OriginalArg(0) byte arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			@Pc(2) int local2 = arg1.method364();
			@Pc(7) boolean local7 = false;
			aCharArrayArray2 = new char[local2][];
			method442(arg1, aCharArrayArray2);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("32249, " + arg0 + ", " + arg1 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NBTRSNNF", name = "a", descriptor = "(Lclient!LDILQFVA;B)V")
	private static void method440(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			anIntArray124 = new int[arg0.method364()];
			for (@Pc(13) int local13 = 0; local13 < anIntArray124.length; local13++) {
				anIntArray124[local13] = arg0.method361();
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("73333, " + arg0 + ", " + 0 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NBTRSNNF", name = "a", descriptor = "(ILclient!LDILQFVA;[[[B[[C)V")
	private static void method441(@OriginalArg(1) Class1_Sub1_Sub3 arg0, @OriginalArg(2) byte[][][] arg1, @OriginalArg(3) char[][] arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < arg2.length; local3++) {
				@Pc(9) char[] local9 = new char[arg0.method359()];
				for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
					local9[local11] = (char) arg0.method359();
				}
				arg2[local3] = local9;
				@Pc(33) byte[][] local33 = new byte[arg0.method359()][2];
				for (@Pc(35) int local35 = 0; local35 < local33.length; local35++) {
					local33[local35][0] = (byte) arg0.method359();
					local33[local35][1] = (byte) arg0.method359();
				}
				if (local33.length > 0) {
					arg1[local3] = local33;
				}
			}
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("31457, " + -137 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NBTRSNNF", name = "a", descriptor = "(Lclient!LDILQFVA;I[[C)V")
	private static void method442(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(2) char[][] arg1) {
		try {
			for (@Pc(6) int local6 = 0; local6 < arg1.length; local6++) {
				@Pc(12) char[] local12 = new char[arg0.method359()];
				for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
					local12[local14] = (char) arg0.method359();
				}
				arg1[local6] = local12;
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("42344, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NBTRSNNF", name = "a", descriptor = "(I[C)V")
	private static void method443(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) int local3 = 0;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				if (method444(arg0[local5])) {
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
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("43629, " + -269 + ", " + arg0 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NBTRSNNF", name = "a", descriptor = "(CZ)Z")
	private static boolean method444(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= ' ' && arg0 <= '\u007f' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("51204, " + arg0 + ", " + true + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NBTRSNNF", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method445(@OriginalArg(0) String arg0) {
		try {
			@Pc(3) long local3 = System.currentTimeMillis();
			@Pc(6) char[] local6 = arg0.toCharArray();
			method443(local6);
			@Pc(15) String local15 = (new String(local6)).trim();
			@Pc(19) char[] local19 = local15.toLowerCase().toCharArray();
			@Pc(22) String local22 = local15.toLowerCase();
			method453(local19);
			method448(local19);
			method449((byte) 6, local19);
			method462(local19);
			for (@Pc(43) int local43 = 0; local43 < aStringArray3.length; local43++) {
				@Pc(53) int local53 = -1;
				while ((local53 = local22.indexOf(aStringArray3[local43], local53 + 1)) != -1) {
					@Pc(60) char[] local60 = aStringArray3[local43].toCharArray();
					for (@Pc(62) int local62 = 0; local62 < local60.length; local62++) {
						local19[local62 + local53] = local60[local62];
					}
				}
			}
			method446(local19, local15.toCharArray());
			method447(local19);
			@Pc(104) long local104 = System.currentTimeMillis();
			return (new String(local19)).trim();
		} catch (@Pc(111) RuntimeException local111) {
			signlink.reporterror("53621, " + arg0 + ", " + 73 + ", " + local111.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NBTRSNNF", name = "a", descriptor = "([CZ[C)V")
	private static void method446(@OriginalArg(0) char[] arg0, @OriginalArg(2) char[] arg1) {
		try {
			for (@Pc(9) int local9 = 0; local9 < arg1.length; local9++) {
				if (arg0[local9] != '*' && method470(arg1[local9])) {
					arg0[local9] = arg1[local9];
				}
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("4461, " + arg0 + ", " + false + ", " + arg1 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NBTRSNNF", name = "a", descriptor = "([CI)V")
	private static void method447(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(9) int local9 = 0; local9 < arg0.length; local9++) {
				@Pc(15) char local15 = arg0[local9];
				if (!method467(local15)) {
					local3 = true;
				} else if (local3) {
					if (method469(anInt499, local15)) {
						local3 = false;
					}
				} else if (method470(local15)) {
					arg0[local9] = (char) (local15 + 'a' - 65);
				}
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("26817, " + arg0 + ", " + -529 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NBTRSNNF", name = "a", descriptor = "(Z[C)V")
	private static void method448(@OriginalArg(1) char[] arg0) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 2; local3++) {
				for (@Pc(10) int local10 = aCharArrayArray1.length - 1; local10 >= 0; local10--) {
					method457(arg0, aCharArrayArray1[local10], aByteArrayArrayArray7[local10]);
				}
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("35646, " + false + ", " + arg0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NBTRSNNF", name = "a", descriptor = "(B[C)V")
	private static void method449(@OriginalArg(0) byte arg0, @OriginalArg(1) char[] arg1) {
		try {
			@Pc(5) char[] local5 = (char[]) arg1.clone();
			@Pc(20) char[] local20 = new char[] { '(', 'a', ')' };
			method457(local5, local20, null);
			@Pc(29) char[] local29 = (char[]) arg1.clone();
			@Pc(34) boolean local34 = false;
			@Pc(52) char[] local52 = new char[] { 'd', 'o', 't' };
			method457(local29, local52, null);
			for (@Pc(62) int local62 = aCharArrayArray2.length - 1; local62 >= 0; local62--) {
				method450(arg1, local5, local29, aCharArrayArray2[local62]);
			}
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("61233, " + arg0 + ", " + arg1 + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NBTRSNNF", name = "a", descriptor = "(Z[C[C[C[C)V")
	private static void method450(@OriginalArg(1) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2, @OriginalArg(4) char[] arg3) {
		try {
			if (arg3.length <= arg0.length) {
				@Pc(19) int local19;
				for (@Pc(11) int local11 = 0; local11 <= arg0.length - arg3.length; local11 += local19) {
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
							if (local17 < arg3.length && (local54 = method459(local29, local27, arg3[local17])) > 0) {
								local15 += local54;
								local17++;
							} else {
								if (local17 == 0) {
									break label59;
								}
								@Pc(75) int local75;
								if ((local75 = method459(local29, local27, arg3[local17 - 1])) > 0) {
									local15 += local75;
									if (local17 == 1) {
										local19++;
									}
								} else {
									if (local17 >= arg3.length || !method465(local27)) {
										break label59;
									}
									local15++;
								}
							}
						}
					}
					if (local17 >= arg3.length) {
						@Pc(106) boolean local106 = false;
						@Pc(112) int local112 = method451(arg0, arg1, local11);
						@Pc(120) int local120 = method452(arg0, arg2, local15 - 1, (byte) 8);
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
		} catch (@Pc(164) RuntimeException local164) {
			signlink.reporterror("99048, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local164.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NBTRSNNF", name = "a", descriptor = "([CB[CI)I")
	private static int method451(@OriginalArg(0) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 == 0) {
				return 2;
			}
			for (@Pc(18) int local18 = arg2 - 1; local18 >= 0 && method465(arg0[local18]); local18--) {
				if (arg0[local18] == '@') {
					return 3;
				}
			}
			@Pc(38) int local38 = 0;
			for (@Pc(42) int local42 = arg2 - 1; local42 >= 0 && method465(arg1[local42]); local42--) {
				if (arg1[local42] == '*') {
					local38++;
				}
			}
			if (local38 >= 3) {
				return 4;
			} else if (method465(arg0[arg2 - 1])) {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("29796, " + arg0 + ", " + 6 + ", " + arg1 + ", " + arg2 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NBTRSNNF", name = "a", descriptor = "([C[CIB)I")
	private static int method452(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		try {
			@Pc(6) boolean local6 = false;
			if (arg2 + 1 == arg0.length) {
				return 2;
			}
			@Pc(27) int local27 = arg2 + 1;
			while (true) {
				if (local27 < arg0.length && method465(arg0[local27])) {
					if (arg0[local27] != '.' && arg0[local27] != ',') {
						local27++;
						continue;
					}
					return 3;
				}
				@Pc(54) int local54 = 0;
				for (@Pc(58) int local58 = arg2 + 1; local58 < arg0.length && method465(arg1[local58]); local58++) {
					if (arg1[local58] == '*') {
						local54++;
					}
				}
				if (local54 >= 3) {
					return 4;
				}
				if (method465(arg0[arg2 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(96) RuntimeException local96) {
			signlink.reporterror("75289, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local96.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NBTRSNNF", name = "a", descriptor = "([CB)V")
	private static void method453(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(18) char[] local18 = new char[] { 'd', 'o', 't' };
			method457(local3, local18, null);
			@Pc(27) char[] local27 = (char[]) arg0.clone();
			@Pc(50) char[] local50 = new char[] { 's', 'l', 'a', 's', 'h' };
			method457(local27, local50, null);
			for (@Pc(57) int local57 = 0; local57 < aCharArrayArray3.length; local57++) {
				method454(anIntArray125[local57], aCharArrayArray3[local57], local27, local3, arg0);
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("21424, " + arg0 + ", " + 0 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NBTRSNNF", name = "a", descriptor = "(I[CI[C[C[C)V")
	private static void method454(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(3) char[] arg2, @OriginalArg(4) char[] arg3, @OriginalArg(5) char[] arg4) {
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
							if (local17 < arg1.length && (local54 = method459(local29, local27, arg1[local17])) > 0) {
								local15 += local54;
								local17++;
							} else {
								if (local17 == 0) {
									break label121;
								}
								@Pc(75) int local75;
								if ((local75 = method459(local29, local27, arg1[local17 - 1])) > 0) {
									local15 += local75;
									if (local17 == 1) {
										local19++;
									}
								} else {
									if (local17 >= arg1.length || !method465(local27)) {
										break label121;
									}
									local15++;
								}
							}
						}
					}
					if (local17 >= arg1.length) {
						@Pc(106) boolean local106 = false;
						@Pc(112) int local112 = method455(arg3, local11, arg4);
						@Pc(120) int local120 = method456(local15 - 1, arg2, arg4);
						if (arg0 == 1 && local112 > 0 && local120 > 0) {
							local106 = true;
						}
						if (arg0 == 2 && (local112 > 2 && local120 > 0 || local112 > 0 && local120 > 2)) {
							local106 = true;
						}
						if (arg0 == 3 && local112 > 0 && local120 > 2) {
							local106 = true;
						}
						@Pc(163) boolean local163;
						if (arg0 == 3 && local112 > 2 && local120 > 0) {
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
										if (method465(arg4[local186])) {
											break;
										}
										local170 = local186;
									} else if (!method465(arg4[local186])) {
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
										if (method465(arg4[local186])) {
											break;
										}
										local174 = local186;
									} else if (!method465(arg4[local186])) {
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
			signlink.reporterror("87392, " + arg0 + ", " + arg1 + ", " + 994 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local345.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NBTRSNNF", name = "a", descriptor = "(B[CI[C)I")
	private static int method455(@OriginalArg(1) char[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg1 == 0) {
				return 2;
			}
			@Pc(9) int local9 = arg1 - 1;
			while (true) {
				if (local9 >= 0 && method465(arg2[local9])) {
					if (arg2[local9] != ',' && arg2[local9] != '.') {
						local9--;
						continue;
					}
					return 3;
				}
				@Pc(34) int local34 = 0;
				if (aByte25 != 0) {
					return 2;
				}
				for (@Pc(43) int local43 = arg1 - 1; local43 >= 0 && method465(arg0[local43]); local43--) {
					if (arg0[local43] == '*') {
						local34++;
					}
				}
				if (local34 >= 3) {
					return 4;
				}
				if (method465(arg2[arg1 - 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("50885, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NBTRSNNF", name = "a", descriptor = "(IZ[C[C)I")
	private static int method456(@OriginalArg(0) int arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg0 + 1 == arg2.length) {
				return 2;
			}
			@Pc(13) int local13 = arg0 + 1;
			while (true) {
				if (local13 < arg2.length && method465(arg2[local13])) {
					if (arg2[local13] != '\\' && arg2[local13] != '/') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(40) int local40 = 0;
				for (@Pc(44) int local44 = arg0 + 1; local44 < arg2.length && method465(arg1[local44]); local44++) {
					if (arg1[local44] == '*') {
						local40++;
					}
				}
				if (local40 >= 5) {
					return 4;
				}
				if (method465(arg2[arg0 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("80767, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NBTRSNNF", name = "a", descriptor = "([C[CB[[B)V")
	private static void method457(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(3) byte[][] arg2) {
		try {
			if (arg1.length <= arg0.length) {
				@Pc(25) int local25;
				for (@Pc(15) int local15 = 0; local15 <= arg0.length - arg1.length; local15 += local25) {
					@Pc(19) int local19 = local15;
					@Pc(21) int local21 = 0;
					@Pc(23) int local23 = 0;
					local25 = 1;
					@Pc(27) boolean local27 = false;
					@Pc(29) boolean local29 = false;
					@Pc(31) boolean local31 = false;
					@Pc(39) char var12;
					@Pc(41) char var13;
					label164: while (true) {
						while (true) {
							if (local19 >= arg0.length || local29 && local31) {
								break label164;
							}
							var12 = arg0[local19];
							var13 = '\u0000';
							if (local19 + 1 < arg0.length) {
								var13 = arg0[local19 + 1];
							}
							@Pc(66) int local66;
							if (local21 < arg1.length && (local66 = method460(var13, var12, arg1[local21])) > 0) {
								if (local66 == 1 && method468(var12)) {
									local29 = true;
								}
								if (local66 == 2 && (method468(var12) || method468(var13))) {
									local29 = true;
								}
								local19 += local66;
								local21++;
							} else {
								if (local21 == 0) {
									break label164;
								}
								@Pc(109) int local109;
								if ((local109 = method460(var13, var12, arg1[local21 - 1])) > 0) {
									local19 += local109;
									if (local21 == 1) {
										local25++;
									}
								} else {
									if (local21 >= arg1.length || !method466(var12, (byte) 3)) {
										break label164;
									}
									if (method465(var12) && var12 != '\'') {
										local27 = true;
									}
									if (method468(var12)) {
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
					if (local21 >= arg1.length && (!local29 || !local31)) {
						@Pc(174) boolean local174 = true;
						@Pc(270) int local270;
						if (local27) {
							@Pc(220) boolean local220 = false;
							@Pc(222) boolean local222 = false;
							if (local15 - 1 < 0 || method465(arg0[local15 - 1]) && arg0[local15 - 1] != '\'') {
								local220 = true;
							}
							if (local19 >= arg0.length || method465(arg0[local19]) && arg0[local19] != '\'') {
								local222 = true;
							}
							if (!local220 || !local222) {
								@Pc(266) boolean local266 = false;
								local270 = local15 - 2;
								if (local220) {
									local270 = local15;
								}
								while (!local266 && local270 < local19) {
									if (local270 >= 0 && (!method465(arg0[local270]) || arg0[local270] == '\'')) {
										@Pc(292) char[] local292 = new char[3];
										@Pc(294) int local294;
										for (local294 = 0; local294 < 3 && local270 + local294 < arg0.length && (!method465(arg0[local270 + local294]) || arg0[local270 + local294] == '\''); local294++) {
											local292[local294] = arg0[local270 + local294];
										}
										@Pc(332) boolean local332 = true;
										if (local294 == 0) {
											local332 = false;
										}
										if (local294 < 3 && local270 - 1 >= 0 && (!method465(arg0[local270 - 1]) || arg0[local270 - 1] == '\'')) {
											local332 = false;
										}
										if (local332 && !method471(local292)) {
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
							var12 = ' ';
							if (local15 - 1 >= 0) {
								var12 = arg0[local15 - 1];
							}
							var13 = ' ';
							if (local19 < arg0.length) {
								var13 = arg0[local19];
							}
							@Pc(202) byte local202 = method461(var12);
							@Pc(206) byte local206 = method461(var13);
							if (arg2 != null && method458(local202, arg2, 447, local206)) {
								local174 = false;
							}
						}
						if (local174) {
							@Pc(382) int local382 = 0;
							@Pc(384) int local384 = 0;
							@Pc(386) int local386 = -1;
							for (local270 = local15; local270 < local19; local270++) {
								if (method468(arg0[local270])) {
									local382++;
								} else if (method467(arg0[local270])) {
									local384++;
									local386 = local270;
								}
							}
							if (local386 > -1) {
								local382 -= local19 - local386 - 1;
							}
							if (local382 <= local384) {
								for (@Pc(428) int local428 = local15; local428 < local19; local428++) {
									arg0[local428] = '*';
								}
							} else {
								local25 = 1;
							}
						}
					}
				}
			}
		} catch (@Pc(455) RuntimeException local455) {
			signlink.reporterror("12340, " + arg0 + ", " + arg1 + ", " + 2 + ", " + arg2 + ", " + local455.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NBTRSNNF", name = "a", descriptor = "(B[[BIB)Z")
	private static boolean method458(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		try {
			@Pc(1) int local1 = 0;
			if (arg1[0][0] == arg0 && arg1[0][1] == arg3) {
				return true;
			}
			@Pc(22) int local22 = arg1.length - 1;
			@Pc(26) boolean local26 = false;
			if (arg1[local22][0] == arg0 && arg1[local22][1] == arg3) {
				return true;
			}
			do {
				@Pc(48) int local48 = (local1 + local22) / 2;
				if (arg1[local48][0] == arg0 && arg1[local48][1] == arg3) {
					return true;
				}
				if (arg0 < arg1[local48][0] || arg0 == arg1[local48][0] && arg3 < arg1[local48][1]) {
					local22 = local48;
				} else {
					local1 = local48;
				}
			} while (local1 != local22 && local1 + 1 != local22);
			return false;
		} catch (@Pc(102) RuntimeException local102) {
			signlink.reporterror("80513, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local102.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NBTRSNNF", name = "a", descriptor = "(ZCCC)I")
	private static int method459(@OriginalArg(1) char arg0, @OriginalArg(2) char arg1, @OriginalArg(3) char arg2) {
		try {
			if (arg2 == arg1) {
				return 1;
			} else if (arg2 == 'o' && arg1 == '0') {
				return 1;
			} else if (arg2 == 'o' && arg1 == '(' && arg0 == ')') {
				return 2;
			} else if (arg2 == 'c' && (arg1 == '(' || arg1 == '<' || arg1 == '[')) {
				return 1;
			} else if (arg2 == 'e' && arg1 == '€') {
				return 1;
			} else if (arg2 == 's' && arg1 == '$') {
				return 1;
			} else if (arg2 == 'l' && arg1 == 'i') {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("36130, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NBTRSNNF", name = "a", descriptor = "(ICCC)I")
	private static int method460(@OriginalArg(1) char arg0, @OriginalArg(2) char arg1, @OriginalArg(3) char arg2) {
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
			signlink.reporterror("1761, " + 5 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local516.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NBTRSNNF", name = "a", descriptor = "(CI)B")
	private static byte method461(@OriginalArg(0) char arg0) {
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
			signlink.reporterror("90945, " + arg0 + ", " + 15994 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NBTRSNNF", name = "b", descriptor = "(I[C)V")
	private static void method462(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(9) int local9 = 0;
			@Pc(11) int local11 = 0;
			@Pc(13) int local13 = 0;
			while (true) {
				do {
					@Pc(112) int local112;
					if ((local112 = method463(local9, arg0)) == -1) {
						return;
					}
					@Pc(17) boolean local17 = false;
					for (@Pc(19) int local19 = local9; local19 >= 0 && local19 < local112 && !local17; local19++) {
						if (!method465(arg0[local19]) && !method466(arg0[local19], (byte) 3)) {
							local17 = true;
						}
					}
					if (local17) {
						local11 = 0;
					}
					if (local11 == 0) {
						local13 = local112;
					}
					local9 = method464(local112, arg0);
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
			signlink.reporterror("96744, " + 1 + ", " + arg0 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NBTRSNNF", name = "a", descriptor = "(BI[C)I")
	private static int method463(@OriginalArg(1) int arg0, @OriginalArg(2) char[] arg1) {
		try {
			if (aByte26 != 2) {
				aBoolean139 = !aBoolean139;
			}
			for (@Pc(10) int local10 = arg0; local10 < arg1.length && local10 >= 0; local10++) {
				if (arg1[local10] >= '0' && arg1[local10] <= '9') {
					return local10;
				}
			}
			return -1;
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("44515, " + 2 + ", " + arg0 + ", " + arg1 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NBTRSNNF", name = "b", descriptor = "(BI[C)I")
	private static int method464(@OriginalArg(1) int arg0, @OriginalArg(2) char[] arg1) {
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
			signlink.reporterror("7333, " + -100 + ", " + arg0 + ", " + arg1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NBTRSNNF", name = "a", descriptor = "(IC)Z")
	private static boolean method465(@OriginalArg(1) char arg0) {
		try {
			return !method467(arg0) && !method468(arg0);
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("14678, " + -18914 + ", " + arg0 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NBTRSNNF", name = "a", descriptor = "(CB)Z")
	private static boolean method466(@OriginalArg(0) char arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(4) boolean local4 = false;
			if (arg0 >= 'a' && arg0 <= 'z') {
				return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
			} else {
				return true;
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("36852, " + arg0 + ", " + arg1 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NBTRSNNF", name = "b", descriptor = "(IC)Z")
	private static boolean method467(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("58283, " + -613 + ", " + arg0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NBTRSNNF", name = "b", descriptor = "(CI)Z")
	private static boolean method468(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= '0' && arg0 <= '9';
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("61861, " + arg0 + ", " + 2 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NBTRSNNF", name = "c", descriptor = "(IC)Z")
	private static boolean method469(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		try {
			if (arg0 <= 0) {
				anInt499 = -25;
			}
			return arg1 >= 'a' && arg1 <= 'z';
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("5698, " + arg0 + ", " + arg1 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NBTRSNNF", name = "c", descriptor = "(CI)Z")
	private static boolean method470(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("72063, " + arg0 + ", " + -19889 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NBTRSNNF", name = "b", descriptor = "([CI)Z")
	private static boolean method471(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
				if (!method468(arg0[local11]) && arg0[local11] != '\u0000') {
					local3 = false;
				}
			}
			if (local3) {
				return true;
			}
			@Pc(38) int local38 = method472(arg0);
			@Pc(40) int local40 = 0;
			@Pc(45) int local45 = anIntArray124.length - 1;
			if (local38 == anIntArray124[0] || local38 == anIntArray124[local45]) {
				return true;
			}
			do {
				@Pc(63) int local63 = (local40 + local45) / 2;
				if (local38 == anIntArray124[local63]) {
					return true;
				}
				if (local38 < anIntArray124[local63]) {
					local45 = local63;
				} else {
					local40 = local63;
				}
			} while (local40 != local45 && local40 + 1 != local45);
			return false;
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("30386, " + arg0 + ", " + 751 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NBTRSNNF", name = "b", descriptor = "([CB)I")
	private static int method472(@OriginalArg(0) char[] arg0) {
		try {
			if (arg0.length > 6) {
				return 0;
			}
			@Pc(14) int local14 = 0;
			for (@Pc(16) int local16 = 0; local16 < arg0.length; local16++) {
				@Pc(27) char local27 = arg0[arg0.length - local16 - 1];
				if (local27 >= 'a' && local27 <= 'z') {
					local14 = local14 * 38 + local27 + 1 - 'a';
				} else if (local27 == '\'') {
					local14 = local14 * 38 + 27;
				} else if (local27 >= '0' && local27 <= '9') {
					local14 = local14 * 38 + local27 + 28 - '0';
				} else if (local27 != '\u0000') {
					return 0;
				}
			}
			return local14;
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("3587, " + arg0 + ", " + 6 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}
}
