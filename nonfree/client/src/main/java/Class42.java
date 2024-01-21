import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!sc")
public final class Class42 {

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "Z")
	private static boolean aBoolean239;

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
	private static int anInt903;

	@OriginalMember(owner = "client!sc", name = "p", descriptor = "[I")
	private static int[] anIntArray251;

	@OriginalMember(owner = "client!sc", name = "q", descriptor = "[[C")
	private static char[][] aCharArrayArray1;

	@OriginalMember(owner = "client!sc", name = "r", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!sc", name = "s", descriptor = "[[C")
	private static char[][] aCharArrayArray2;

	@OriginalMember(owner = "client!sc", name = "t", descriptor = "[[C")
	private static char[][] aCharArrayArray3;

	@OriginalMember(owner = "client!sc", name = "u", descriptor = "[I")
	private static int[] anIntArray252;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
	private static int anInt902 = 628;

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "B")
	private static byte aByte34 = 1;

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "B")
	private static byte aByte35 = -50;

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
	private static int anInt904 = 7;

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
	private static int anInt905 = 7;

	@OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
	private static int anInt906 = 5;

	@OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
	private static int anInt907 = 968;

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
	private static int anInt908 = -165;

	@OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
	private static int anInt909 = 1;

	@OriginalMember(owner = "client!sc", name = "m", descriptor = "Z")
	private static boolean aBoolean240 = true;

	@OriginalMember(owner = "client!sc", name = "n", descriptor = "Z")
	private static boolean aBoolean241 = true;

	@OriginalMember(owner = "client!sc", name = "o", descriptor = "I")
	private static int anInt910 = -9884;

	@OriginalMember(owner = "client!sc", name = "v", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray13 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq" };

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!xb;)V")
	public static void method586(@OriginalArg(0) Class47 arg0) {
		@Pc(10) Class1_Sub1_Sub3 local10 = new Class1_Sub1_Sub3((byte) 3, arg0.method658("fragmentsenc.txt", null));
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3((byte) 3, arg0.method658("badenc.txt", null));
		@Pc(28) Class1_Sub1_Sub3 local28 = new Class1_Sub1_Sub3((byte) 3, arg0.method658("domainenc.txt", null));
		@Pc(37) Class1_Sub1_Sub3 local37 = new Class1_Sub1_Sub3((byte) 3, arg0.method658("tldlist.txt", null));
		method587(local10, local19, local28, local37);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!lb;Lclient!lb;Lclient!lb;Lclient!lb;)V")
	private static void method587(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) Class1_Sub1_Sub3 arg2, @OriginalArg(3) Class1_Sub1_Sub3 arg3) {
		method589(arg1, aByte34);
		method590(arg2);
		method591(arg0);
		method588(arg3);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!lb;I)V")
	private static void method588(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(4) int local4 = arg0.method477();
			aCharArrayArray3 = new char[local4][];
			anIntArray252 = new int[local4];
			for (@Pc(12) int local12 = 0; local12 < local4; local12++) {
				anIntArray252[local12] = arg0.method472();
				@Pc(23) char[] local23 = new char[arg0.method472()];
				for (@Pc(25) int local25 = 0; local25 < local23.length; local25++) {
					local23[local25] = (char) arg0.method472();
				}
				aCharArrayArray3[local12] = local23;
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("75756, " + arg0 + ", " + 0 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!lb;B)V")
	private static void method589(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) byte arg1) {
		try {
			if (arg1 == 1) {
				@Pc(6) int local6 = arg0.method477();
				aCharArrayArray1 = new char[local6][];
				aByteArrayArrayArray8 = new byte[local6][][];
				method592(aByteArrayArrayArray8, arg0, aCharArrayArray1);
			}
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("21289, " + arg0 + ", " + arg1 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(Lclient!lb;B)V")
	private static void method590(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(2) int local2 = arg0.method477();
			aCharArrayArray2 = new char[local2][];
			method593(arg0, aCharArrayArray2);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("28683, " + arg0 + ", " + -120 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(Lclient!lb;I)V")
	private static void method591(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			anIntArray251 = new int[arg0.method477()];
			for (@Pc(17) int local17 = 0; local17 < anIntArray251.length; local17++) {
				anIntArray251[local17] = arg0.method474();
			}
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("63357, " + arg0 + ", " + 4952 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([[[BBLclient!lb;[[C)V")
	private static void method592(@OriginalArg(0) byte[][][] arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1, @OriginalArg(3) char[][] arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < arg2.length; local3++) {
				@Pc(9) char[] local9 = new char[arg1.method472()];
				for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
					local9[local11] = (char) arg1.method472();
				}
				arg2[local3] = local9;
				@Pc(33) byte[][] local33 = new byte[arg1.method472()][2];
				for (@Pc(35) int local35 = 0; local35 < local33.length; local35++) {
					local33[local35][0] = (byte) arg1.method472();
					local33[local35][1] = (byte) arg1.method472();
				}
				if (local33.length > 0) {
					arg0[local3] = local33;
				}
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("46622, " + arg0 + ", " + 60 + ", " + arg1 + ", " + arg2 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!lb;[[C)V")
	private static void method593(@OriginalArg(1) Class1_Sub1_Sub3 arg0, @OriginalArg(2) char[][] arg1) {
		try {
			for (@Pc(13) int local13 = 0; local13 < arg1.length; local13++) {
				@Pc(19) char[] local19 = new char[arg0.method472()];
				for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
					local19[local21] = (char) arg0.method472();
				}
				arg1[local13] = local19;
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("11769, " + -308 + ", " + arg0 + ", " + arg1 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CI)V")
	private static void method594(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) int local3 = 0;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				if (method595(arg0[local5], 730)) {
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
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("21286, " + arg0 + ", " + 6 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(CI)Z")
	private static boolean method595(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			return arg0 >= ' ' && arg0 <= '\u007f' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("40294, " + arg0 + ", " + arg1 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method596(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(3) long local3 = System.currentTimeMillis();
			@Pc(6) char[] local6 = arg0.toCharArray();
			method594(local6);
			@Pc(15) String local15 = (new String(local6)).trim();
			@Pc(19) char[] local19 = local15.toLowerCase().toCharArray();
			@Pc(22) String local22 = local15.toLowerCase();
			method604(local19);
			method599(local19);
			method600(local19);
			method613(local19);
			for (@Pc(36) int local36 = 0; local36 < aStringArray13.length; local36++) {
				@Pc(46) int local46 = -1;
				while ((local46 = local22.indexOf(aStringArray13[local36], local46 + 1)) != -1) {
					@Pc(53) char[] local53 = aStringArray13[local36].toCharArray();
					for (@Pc(55) int local55 = 0; local55 < local53.length; local55++) {
						local19[local55 + local46] = local53[local55];
					}
				}
			}
			if (arg1 != -50) {
				aBoolean239 = !aBoolean239;
			}
			method597(local15.toCharArray(), local19);
			method598(anInt904, local19);
			@Pc(106) long local106 = System.currentTimeMillis();
			return (new String(local19)).trim();
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("38422, " + arg0 + ", " + arg1 + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CZ[C)V")
	private static void method597(@OriginalArg(0) char[] arg0, @OriginalArg(2) char[] arg1) {
		try {
			for (@Pc(9) int local9 = 0; local9 < arg0.length; local9++) {
				if (arg1[local9] != '*' && method621(arg0[local9], aBoolean241)) {
					arg1[local9] = arg0[local9];
				}
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("83954, " + arg0 + ", " + false + ", " + arg1 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[C)V")
	private static void method598(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < arg1.length; local5++) {
				@Pc(11) char local11 = arg1[local5];
				if (!method618(local11)) {
					local3 = true;
				} else if (local3) {
					if (method620(local11)) {
						local3 = false;
					}
				} else if (method621(local11, aBoolean241)) {
					arg1[local5] = (char) (local11 + 'a' - 65);
				}
			}
			if (arg0 < anInt905 || arg0 > anInt905) {
				anInt905 = 95;
			}
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("30191, " + arg0 + ", " + arg1 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CB)V")
	private static void method599(@OriginalArg(0) char[] arg0) {
		try {
			for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
				for (@Pc(14) int local14 = aCharArrayArray1.length - 1; local14 >= 0; local14--) {
					method608(aByteArrayArrayArray8[local14], aCharArrayArray1[local14], arg0);
				}
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("70774, " + arg0 + ", " + -23 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(I[C)V")
	private static void method600(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(5) char[] local5 = (char[]) arg0.clone();
			@Pc(20) char[] local20 = new char[] { '(', 'a', ')' };
			method608(null, local20, local5);
			@Pc(38) char[] local38 = (char[]) arg0.clone();
			@Pc(53) char[] local53 = new char[] { 'd', 'o', 't' };
			method608(null, local53, local38);
			for (@Pc(63) int local63 = aCharArrayArray2.length - 1; local63 >= 0; local63--) {
				method601(local5, local38, aCharArrayArray2[local63], arg0);
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("33007, " + 0 + ", " + arg0 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([C[CI[C[C)V")
	private static void method601(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(3) char[] arg2, @OriginalArg(4) char[] arg3) {
		try {
			if (arg2.length <= arg3.length) {
				@Pc(19) int local19;
				@Pc(15) int local15;
				for (@Pc(11) int local11 = 0; local11 <= arg3.length - arg2.length; local11 += local19) {
					local15 = local11;
					@Pc(17) int local17 = 0;
					local19 = 1;
					label73: while (true) {
						while (true) {
							if (local15 >= arg3.length) {
								break label73;
							}
							@Pc(27) char local27 = arg3[local15];
							@Pc(29) char local29 = 0;
							if (local15 + 1 < arg3.length) {
								local29 = arg3[local15 + 1];
							}
							@Pc(54) int local54;
							if (local17 < arg2.length && (local54 = method610(local27, local29, arg2[local17])) > 0) {
								local15 += local54;
								local17++;
							} else {
								if (local17 == 0) {
									break label73;
								}
								@Pc(75) int local75;
								if ((local75 = method610(local27, local29, arg2[local17 - 1])) > 0) {
									local15 += local75;
									if (local17 == 1) {
										local19++;
									}
								} else {
									if (local17 >= arg2.length || !method616(local27)) {
										break label73;
									}
									local15++;
								}
							}
						}
					}
					if (local17 >= arg2.length) {
						@Pc(106) boolean local106 = false;
						@Pc(112) int local112 = method602(local11, arg0, arg3);
						@Pc(120) int local120 = method603(arg3, local15 - 1, anInt907, arg1);
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
				if (anInt906 > 5 || anInt906 < 5) {
					for (local15 = 1; local15 > 0; local15++) {
					}
				}
			}
		} catch (@Pc(168) RuntimeException local168) {
			signlink.reporterror("86956, " + arg0 + ", " + arg1 + ", " + 5 + ", " + arg2 + ", " + arg3 + ", " + local168.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[C[CI)I")
	private static int method602(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2) {
		try {
			if (arg0 == 0) {
				return 2;
			}
			for (@Pc(14) int local14 = arg0 - 1; local14 >= 0 && method616(arg2[local14]); local14--) {
				if (arg2[local14] == '@') {
					return 3;
				}
			}
			@Pc(34) int local34 = 0;
			for (@Pc(38) int local38 = arg0 - 1; local38 >= 0 && method616(arg1[local38]); local38--) {
				if (arg1[local38] == '*') {
					local34++;
				}
			}
			if (local34 >= 3) {
				return 4;
			} else if (method616(arg2[arg0 - 1])) {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("6866, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 46218 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CII[C)I")
	private static int method603(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) char[] arg3) {
		try {
			if (arg1 + 1 == arg0.length) {
				return 2;
			}
			@Pc(13) int local13 = arg1 + 1;
			while (true) {
				if (local13 < arg0.length && method616(arg0[local13])) {
					if (arg0[local13] != '.' && arg0[local13] != ',') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(40) int local40 = 0;
				if (arg2 <= 0) {
					return 0;
				}
				for (@Pc(48) int local48 = arg1 + 1; local48 < arg0.length && method616(arg3[local48]); local48++) {
					if (arg3[local48] == '*') {
						local40++;
					}
				}
				if (local40 >= 3) {
					return 4;
				}
				if (method616(arg0[arg1 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("76257, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(I[C)V")
	private static void method604(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(23) char[] local23 = new char[] { 'd', 'o', 't' };
			method608(null, local23, local3);
			@Pc(32) char[] local32 = (char[]) arg0.clone();
			@Pc(55) char[] local55 = new char[] { 's', 'l', 'a', 's', 'h' };
			method608(null, local55, local32);
			for (@Pc(62) int local62 = 0; local62 < aCharArrayArray3.length; local62++) {
				method605(aCharArrayArray3[local62], local32, local3, anIntArray252[local62], arg0);
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("89839, " + 23566 + ", " + arg0 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([C[C[CIB[C)V")
	private static void method605(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) char[] arg4) {
		try {
			if (arg0.length <= arg4.length) {
				@Pc(19) int local19;
				for (@Pc(11) int local11 = 0; local11 <= arg4.length - arg0.length; local11 += local19) {
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
							if (local17 < arg0.length && (local54 = method610(local27, local29, arg0[local17])) > 0) {
								local15 += local54;
								local17++;
							} else {
								if (local17 == 0) {
									break label121;
								}
								@Pc(75) int local75;
								if ((local75 = method610(local27, local29, arg0[local17 - 1])) > 0) {
									local15 += local75;
									if (local17 == 1) {
										local19++;
									}
								} else {
									if (local17 >= arg0.length || !method616(local27)) {
										break label121;
									}
									local15++;
								}
							}
						}
					}
					if (local17 >= arg0.length) {
						@Pc(106) boolean local106 = false;
						@Pc(112) int local112 = method606(arg4, local11, arg2);
						@Pc(120) int local120 = method607(local15 - 1, arg1, arg4);
						if (arg3 == 1 && local112 > 0 && local120 > 0) {
							local106 = true;
						}
						if (arg3 == 2 && (local112 > 2 && local120 > 0 || local112 > 0 && local120 > 2)) {
							local106 = true;
						}
						if (arg3 == 3 && local112 > 0 && local120 > 2) {
							local106 = true;
						}
						@Pc(163) boolean local163;
						if (arg3 == 3 && local112 > 2 && local120 > 0) {
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
										if (method616(arg4[local186])) {
											break;
										}
										local170 = local186;
									} else if (!method616(arg4[local186])) {
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
											if (arg1[local186] != '*') {
												break;
											}
											local174 = local186;
										} else if (arg1[local186] == '*') {
											local174 = local186;
											local182 = true;
										}
									}
								}
								local182 = false;
								for (local186 = local174 + 1; local186 < arg4.length; local186++) {
									if (local182) {
										if (method616(arg4[local186])) {
											break;
										}
										local174 = local186;
									} else if (!method616(arg4[local186])) {
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
		} catch (@Pc(346) RuntimeException local346) {
			signlink.reporterror("75034, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 63 + ", " + arg4 + ", " + local346.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "([CII[C)I")
	private static int method606(@OriginalArg(0) char[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg1 == 0) {
				return 2;
			}
			@Pc(9) int local9 = arg1 - 1;
			while (true) {
				if (local9 >= 0 && method616(arg0[local9])) {
					if (arg0[local9] != ',' && arg0[local9] != '.') {
						local9--;
						continue;
					}
					return 3;
				}
				@Pc(38) int local38 = 0;
				for (@Pc(42) int local42 = arg1 - 1; local42 >= 0 && method616(arg2[local42]); local42--) {
					if (arg2[local42] == '*') {
						local38++;
					}
				}
				if (local38 >= 3) {
					return 4;
				}
				if (method616(arg0[arg1 - 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("36361, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[C[CB)I")
	private static int method607(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2) {
		try {
			if (arg0 + 1 == arg2.length) {
				return 2;
			}
			@Pc(13) int local13 = arg0 + 1;
			while (true) {
				if (local13 < arg2.length && method616(arg2[local13])) {
					if (arg2[local13] != '\\' && arg2[local13] != '/') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(45) int local45 = 0;
				for (@Pc(49) int local49 = arg0 + 1; local49 < arg2.length && method616(arg1[local49]); local49++) {
					if (arg1[local49] == '*') {
						local45++;
					}
				}
				if (local45 >= 5) {
					return 4;
				}
				if (method616(arg2[arg0 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("89746, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -16 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[[B[C[C)V")
	private static void method608(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg1.length <= arg2.length) {
				@Pc(26) int local26;
				for (@Pc(16) int local16 = 0; local16 <= arg2.length - arg1.length; local16 += local26) {
					@Pc(20) int local20 = local16;
					@Pc(22) int local22 = 0;
					@Pc(24) int local24 = 0;
					local26 = 1;
					@Pc(28) boolean local28 = false;
					@Pc(30) boolean local30 = false;
					@Pc(32) boolean local32 = false;
					@Pc(40) char var12;
					@Pc(42) char var13;
					label164: while (true) {
						while (true) {
							if (local20 >= arg2.length || local30 && local32) {
								break label164;
							}
							var12 = arg2[local20];
							var13 = '\u0000';
							if (local20 + 1 < arg2.length) {
								var13 = arg2[local20 + 1];
							}
							@Pc(67) int local67;
							if (local22 < arg1.length && (local67 = method611(var13, arg1[local22], var12)) > 0) {
								if (local67 == 1 && method619(var12)) {
									local30 = true;
								}
								if (local67 == 2 && (method619(var12) || method619(var13))) {
									local30 = true;
								}
								local20 += local67;
								local22++;
							} else {
								if (local22 == 0) {
									break label164;
								}
								@Pc(110) int local110;
								if ((local110 = method611(var13, arg1[local22 - 1], var12)) > 0) {
									local20 += local110;
									if (local22 == 1) {
										local26++;
									}
								} else {
									if (local22 >= arg1.length || !method617(var12)) {
										break label164;
									}
									if (method616(var12) && var12 != '\'') {
										local28 = true;
									}
									if (method619(var12)) {
										local32 = true;
									}
									local20++;
									local24++;
									if (local24 * 100 / (local20 - local16) > 90) {
										break label164;
									}
								}
							}
						}
					}
					if (local22 >= arg1.length && (!local30 || !local32)) {
						@Pc(175) boolean local175 = true;
						@Pc(271) int local271;
						if (local28) {
							@Pc(221) boolean local221 = false;
							@Pc(223) boolean local223 = false;
							if (local16 - 1 < 0 || method616(arg2[local16 - 1]) && arg2[local16 - 1] != '\'') {
								local221 = true;
							}
							if (local20 >= arg2.length || method616(arg2[local20]) && arg2[local20] != '\'') {
								local223 = true;
							}
							if (!local221 || !local223) {
								@Pc(267) boolean local267 = false;
								local271 = local16 - 2;
								if (local221) {
									local271 = local16;
								}
								while (!local267 && local271 < local20) {
									if (local271 >= 0 && (!method616(arg2[local271]) || arg2[local271] == '\'')) {
										@Pc(293) char[] local293 = new char[3];
										@Pc(295) int local295;
										for (local295 = 0; local295 < 3 && local271 + local295 < arg2.length && (!method616(arg2[local271 + local295]) || arg2[local271 + local295] == '\''); local295++) {
											local293[local295] = arg2[local271 + local295];
										}
										@Pc(333) boolean local333 = true;
										if (local295 == 0) {
											local333 = false;
										}
										if (local295 < 3 && local271 - 1 >= 0 && (!method616(arg2[local271 - 1]) || arg2[local271 - 1] == '\'')) {
											local333 = false;
										}
										if (local333 && !method622(local293, anInt910)) {
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
							var12 = ' ';
							if (local16 - 1 >= 0) {
								var12 = arg2[local16 - 1];
							}
							var13 = ' ';
							if (local20 < arg2.length) {
								var13 = arg2[local20];
							}
							@Pc(203) byte local203 = method612(var12);
							@Pc(207) byte local207 = method612(var13);
							if (arg0 != null && method609(arg0, local203, local207)) {
								local175 = false;
							}
						}
						if (local175) {
							@Pc(383) int local383 = 0;
							@Pc(385) int local385 = 0;
							@Pc(387) int local387 = -1;
							for (local271 = local16; local271 < local20; local271++) {
								if (method619(arg2[local271])) {
									local383++;
								} else if (method618(arg2[local271])) {
									local385++;
									local387 = local271;
								}
							}
							if (local387 > -1) {
								local383 -= local20 - local387 - 1;
							}
							if (local383 <= local385) {
								for (@Pc(429) int local429 = local16; local429 < local20; local429++) {
									arg2[local429] = '*';
								}
							} else {
								local26 = 1;
							}
						}
					}
				}
			}
		} catch (@Pc(456) RuntimeException local456) {
			signlink.reporterror("22700, " + -165 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local456.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[[BBB)Z")
	private static boolean method609(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) byte arg2) {
		try {
			@Pc(8) int local8 = 0;
			if (arg0[0][0] == arg1 && arg0[0][1] == arg2) {
				return true;
			}
			@Pc(29) int local29 = arg0.length - 1;
			if (arg0[local29][0] == arg1 && arg0[local29][1] == arg2) {
				return true;
			}
			do {
				@Pc(51) int local51 = (local8 + local29) / 2;
				if (arg0[local51][0] == arg1 && arg0[local51][1] == arg2) {
					return true;
				}
				if (arg1 < arg0[local51][0] || arg1 == arg0[local51][0] && arg2 < arg0[local51][1]) {
					local29 = local51;
				} else {
					local8 = local51;
				}
			} while (local8 != local29 && local8 + 1 != local29);
			return false;
		} catch (@Pc(105) RuntimeException local105) {
			signlink.reporterror("38288, " + 33123 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local105.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(CICC)I")
	private static int method610(@OriginalArg(0) char arg0, @OriginalArg(2) char arg1, @OriginalArg(3) char arg2) {
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
			signlink.reporterror("20282, " + arg0 + ", " + 7 + ", " + arg1 + ", " + arg2 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(CCCI)I")
	private static int method611(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(2) char arg2) {
		try {
			if (arg1 == arg2) {
				return 1;
			}
			if (arg1 >= 'a' && arg1 <= 'm') {
				if (arg1 == 'a') {
					if (arg2 != '4' && arg2 != '@' && arg2 != '^') {
						if (arg2 == '/' && arg0 == '\\') {
							return 2;
						}
						return 0;
					}
					return 1;
				}
				if (arg1 == 'b') {
					if (arg2 != '6' && arg2 != '8') {
						if ((arg2 != '1' || arg0 != '3') && (arg2 != 'i' || arg0 != '3')) {
							return 0;
						}
						return 2;
					}
					return 1;
				}
				if (arg1 == 'c') {
					if (arg2 != '(' && arg2 != '<' && arg2 != '{' && arg2 != '[') {
						return 0;
					}
					return 1;
				}
				if (arg1 == 'd') {
					if ((arg2 != '[' || arg0 != ')') && (arg2 != 'i' || arg0 != ')')) {
						return 0;
					}
					return 2;
				}
				if (arg1 == 'e') {
					if (arg2 != '3' && arg2 != '€') {
						return 0;
					}
					return 1;
				}
				if (arg1 == 'f') {
					if (arg2 == 'p' && arg0 == 'h') {
						return 2;
					}
					if (arg2 == '£') {
						return 1;
					}
					return 0;
				}
				if (arg1 == 'g') {
					if (arg2 != '9' && arg2 != '6' && arg2 != 'q') {
						return 0;
					}
					return 1;
				}
				if (arg1 == 'h') {
					if (arg2 == '#') {
						return 1;
					}
					return 0;
				}
				if (arg1 == 'i') {
					if (arg2 != 'y' && arg2 != 'l' && arg2 != 'j' && arg2 != '1' && arg2 != '!' && arg2 != ':' && arg2 != ';' && arg2 != '|') {
						return 0;
					}
					return 1;
				}
				if (arg1 == 'j') {
					return 0;
				}
				if (arg1 == 'k') {
					return 0;
				}
				if (arg1 == 'l') {
					if (arg2 != '1' && arg2 != '|' && arg2 != 'i') {
						return 0;
					}
					return 1;
				}
				if (arg1 == 'm') {
					return 0;
				}
			}
			if (arg1 >= 'n' && arg1 <= 'z') {
				if (arg1 == 'n') {
					return 0;
				}
				if (arg1 == 'o') {
					if (arg2 != '0' && arg2 != '*') {
						if ((arg2 != '(' || arg0 != ')') && (arg2 != '[' || arg0 != ']') && (arg2 != '{' || arg0 != '}') && (arg2 != '<' || arg0 != '>')) {
							return 0;
						}
						return 2;
					}
					return 1;
				}
				if (arg1 == 'p') {
					return 0;
				}
				if (arg1 == 'q') {
					return 0;
				}
				if (arg1 == 'r') {
					return 0;
				}
				if (arg1 == 's') {
					if (arg2 != '5' && arg2 != 'z' && arg2 != '$' && arg2 != '2') {
						return 0;
					}
					return 1;
				}
				if (arg1 == 't') {
					if (arg2 != '7' && arg2 != '+') {
						return 0;
					}
					return 1;
				}
				if (arg1 == 'u') {
					if (arg2 == 'v') {
						return 1;
					}
					if ((arg2 != '\\' || arg0 != '/') && (arg2 != '\\' || arg0 != '|') && (arg2 != '|' || arg0 != '/')) {
						return 0;
					}
					return 2;
				}
				if (arg1 == 'v') {
					if ((arg2 != '\\' || arg0 != '/') && (arg2 != '\\' || arg0 != '|') && (arg2 != '|' || arg0 != '/')) {
						return 0;
					}
					return 2;
				}
				if (arg1 == 'w') {
					if (arg2 == 'v' && arg0 == 'v') {
						return 2;
					}
					return 0;
				}
				if (arg1 == 'x') {
					if ((arg2 != ')' || arg0 != '(') && (arg2 != '}' || arg0 != '{') && (arg2 != ']' || arg0 != '[') && (arg2 != '>' || arg0 != '<')) {
						return 0;
					}
					return 2;
				}
				if (arg1 == 'y') {
					return 0;
				}
				if (arg1 == 'z') {
					return 0;
				}
			}
			if (arg1 >= '0' && arg1 <= '9') {
				if (arg1 == '0') {
					if (arg2 == 'o' || arg2 == 'O') {
						return 1;
					} else if ((arg2 != '(' || arg0 != ')') && (arg2 != '{' || arg0 != '}') && (arg2 != '[' || arg0 != ']')) {
						return 0;
					} else {
						return 2;
					}
				} else if (arg1 == '1') {
					return arg2 == 'l' ? 1 : 0;
				} else {
					return 0;
				}
			} else if (arg1 == ',') {
				return arg2 == '.' ? 1 : 0;
			} else if (arg1 == '.') {
				return arg2 == ',' ? 1 : 0;
			} else if (arg1 == '!') {
				return arg2 == 'i' ? 1 : 0;
			} else {
				return 0;
			}
		} catch (@Pc(513) RuntimeException local513) {
			signlink.reporterror("73149, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -27578 + ", " + local513.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(CI)B")
	private static byte method612(@OriginalArg(0) char arg0) {
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
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("37986, " + arg0 + ", " + -47 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "([CI)V")
	private static void method613(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(15) int local15 = 0;
			@Pc(17) int local17 = 0;
			@Pc(19) int local19 = 0;
			while (true) {
				do {
					@Pc(118) int local118;
					if ((local118 = method614(arg0, local15)) == -1) {
						return;
					}
					@Pc(23) boolean local23 = false;
					for (@Pc(25) int local25 = local15; local25 >= 0 && local25 < local118 && !local23; local25++) {
						if (!method616(arg0[local25]) && !method617(arg0[local25])) {
							local23 = true;
						}
					}
					if (local23) {
						local17 = 0;
					}
					if (local17 == 0) {
						local19 = local118;
					}
					local15 = method615(arg0, local118);
					@Pc(64) int local64 = 0;
					for (@Pc(66) int local66 = local118; local66 < local15; local66++) {
						local64 = local64 * 10 + arg0[local66] - 48;
					}
					if (local64 <= 255 && local15 - local118 <= 8) {
						local17++;
					} else {
						local17 = 0;
					}
				} while (local17 != 4);
				for (@Pc(100) int local100 = local19; local100 < local15; local100++) {
					arg0[local100] = '*';
				}
				local17 = 0;
			}
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("85191, " + arg0 + ", " + -29292 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CZI)I")
	private static int method614(@OriginalArg(0) char[] arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(12) int local12 = arg1; local12 < arg0.length && local12 >= 0; local12++) {
				if (arg0[local12] >= '0' && arg0[local12] <= '9') {
					return local12;
				}
			}
			return -1;
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("94246, " + arg0 + ", " + false + ", " + arg1 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CII)I")
	private static int method615(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) int local3 = arg1;
			while (true) {
				if (local3 < arg0.length && local3 >= 0) {
					if (arg0[local3] >= '0' && arg0[local3] <= '9') {
						local3++;
						continue;
					}
					return local3;
				}
				if (anInt909 > 1 || anInt909 < 1) {
					for (@Pc(32) int local32 = 1; local32 > 0; local32++) {
					}
				}
				return arg0.length;
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("45791, " + arg0 + ", " + arg1 + ", " + 1 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(CZ)Z")
	private static boolean method616(@OriginalArg(0) char arg0) {
		try {
			return !method618(arg0) && !method619(arg0);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("1172, " + arg0 + ", " + true + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(CI)Z")
	private static boolean method617(@OriginalArg(0) char arg0) {
		try {
			if (arg0 >= 'a' && arg0 <= 'z') {
				return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
			} else {
				return true;
			}
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("11111, " + arg0 + ", " + -49764 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "(CI)Z")
	private static boolean method618(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("14697, " + arg0 + ", " + 5 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IC)Z")
	private static boolean method619(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= '0' && arg0 <= '9';
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("73937, " + -22882 + ", " + arg0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZC)Z")
	private static boolean method620(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z';
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("65300, " + true + ", " + arg0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(CZ)Z")
	private static boolean method621(@OriginalArg(0) char arg0, @OriginalArg(1) boolean arg1) {
		try {
			if (!arg1) {
				aBoolean239 = !aBoolean239;
			}
			return arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("64730, " + arg0 + ", " + arg1 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "([CI)Z")
	private static boolean method622(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				if (!method619(arg0[local5]) && arg0[local5] != '\u0000') {
					local3 = false;
				}
			}
			if (local3) {
				return true;
			}
			@Pc(32) int local32 = method623(arg0);
			if (arg1 != anInt910) {
				throw new NullPointerException();
			}
			@Pc(41) int local41 = 0;
			@Pc(46) int local46 = anIntArray251.length - 1;
			if (local32 == anIntArray251[0] || local32 == anIntArray251[local46]) {
				return true;
			}
			do {
				@Pc(64) int local64 = (local41 + local46) / 2;
				if (local32 == anIntArray251[local64]) {
					return true;
				}
				if (local32 < anIntArray251[local64]) {
					local46 = local64;
				} else {
					local41 = local64;
				}
			} while (local41 != local46 && local41 + 1 != local46);
			return false;
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("81470, " + arg0 + ", " + arg1 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "(I[C)I")
	private static int method623(@OriginalArg(1) char[] arg0) {
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
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("20127, " + 935 + ", " + arg0 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}
}
