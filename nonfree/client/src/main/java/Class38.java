import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!UIPOGFJQ")
public final class Class38 {

	@OriginalMember(owner = "client!UIPOGFJQ", name = "c", descriptor = "Z")
	private static boolean aBoolean158;

	@OriginalMember(owner = "client!UIPOGFJQ", name = "e", descriptor = "B")
	private static byte aByte20;

	@OriginalMember(owner = "client!UIPOGFJQ", name = "i", descriptor = "[I")
	private static int[] anIntArray183;

	@OriginalMember(owner = "client!UIPOGFJQ", name = "j", descriptor = "[[C")
	private static char[][] aCharArrayArray1;

	@OriginalMember(owner = "client!UIPOGFJQ", name = "k", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!UIPOGFJQ", name = "l", descriptor = "[[C")
	private static char[][] aCharArrayArray2;

	@OriginalMember(owner = "client!UIPOGFJQ", name = "m", descriptor = "[[C")
	private static char[][] aCharArrayArray3;

	@OriginalMember(owner = "client!UIPOGFJQ", name = "n", descriptor = "[I")
	private static int[] anIntArray184;

	@OriginalMember(owner = "client!UIPOGFJQ", name = "a", descriptor = "I")
	private static int anInt634 = 340;

	@OriginalMember(owner = "client!UIPOGFJQ", name = "d", descriptor = "I")
	private static int anInt635;

	@OriginalMember(owner = "client!UIPOGFJQ", name = "f", descriptor = "I")
	private static int anInt636;

	@OriginalMember(owner = "client!UIPOGFJQ", name = "g", descriptor = "I")
	private static int anInt637;

	@OriginalMember(owner = "client!UIPOGFJQ", name = "h", descriptor = "I")
	private static int anInt638;

	@OriginalMember(owner = "client!UIPOGFJQ", name = "o", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray4;

	static {
		aBoolean157 = true;
		anInt635 = 418;
		anInt636 = 3;
		anInt637 = 24;
		anInt638 = 78;
		aStringArray4 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };
	}

	@OriginalMember(owner = "client!UIPOGFJQ", name = "a", descriptor = "(Lclient!WEMOPWVJ;)V")
	public static void method446(@OriginalArg(0) Class43 arg0) {
		@Pc(10) Class1_Sub1_Sub4 local10 = new Class1_Sub1_Sub4(arg0.method515("fragmentsenc.txt", null), true);
		@Pc(19) Class1_Sub1_Sub4 local19 = new Class1_Sub1_Sub4(arg0.method515("badenc.txt", null), true);
		@Pc(28) Class1_Sub1_Sub4 local28 = new Class1_Sub1_Sub4(arg0.method515("domainenc.txt", null), true);
		@Pc(37) Class1_Sub1_Sub4 local37 = new Class1_Sub1_Sub4(arg0.method515("tldlist.txt", null), true);
		method447(local10, local19, local28, local37);
	}

	@OriginalMember(owner = "client!UIPOGFJQ", name = "a", descriptor = "(Lclient!SVWJKJVI;Lclient!SVWJKJVI;Lclient!SVWJKJVI;Lclient!SVWJKJVI;)V")
	private static void method447(@OriginalArg(0) Class1_Sub1_Sub4 arg0, @OriginalArg(1) Class1_Sub1_Sub4 arg1, @OriginalArg(2) Class1_Sub1_Sub4 arg2, @OriginalArg(3) Class1_Sub1_Sub4 arg3) {
		method449(arg1);
		method450(arg2);
		method451(arg0, aBoolean158);
		method448(227, arg3);
	}

	@OriginalMember(owner = "client!UIPOGFJQ", name = "a", descriptor = "(ILclient!SVWJKJVI;)V")
	private static void method448(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub4 arg1) {
		try {
			@Pc(4) int local4 = arg1.method410();
			aCharArrayArray3 = new char[local4][];
			@Pc(11) boolean local11 = false;
			anIntArray184 = new int[local4];
			for (@Pc(16) int local16 = 0; local16 < local4; local16++) {
				anIntArray184[local16] = arg1.method405();
				@Pc(27) char[] local27 = new char[arg1.method405()];
				for (@Pc(29) int local29 = 0; local29 < local27.length; local29++) {
					local27[local29] = (char) arg1.method405();
				}
				aCharArrayArray3[local16] = local27;
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("22565, " + arg0 + ", " + arg1 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UIPOGFJQ", name = "b", descriptor = "(ILclient!SVWJKJVI;)V")
	private static void method449(@OriginalArg(1) Class1_Sub1_Sub4 arg0) {
		try {
			@Pc(2) int local2 = arg0.method410();
			aCharArrayArray1 = new char[local2][];
			aByteArrayArrayArray1 = new byte[local2][][];
			method452(arg0, aCharArrayArray1, 418, aByteArrayArrayArray1);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("56833, " + -44719 + ", " + arg0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UIPOGFJQ", name = "a", descriptor = "(Lclient!SVWJKJVI;I)V")
	private static void method450(@OriginalArg(0) Class1_Sub1_Sub4 arg0) {
		try {
			@Pc(2) int local2 = arg0.method410();
			aCharArrayArray2 = new char[local2][];
			method453(arg0, aCharArrayArray2);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("87569, " + arg0 + ", " + -8470 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UIPOGFJQ", name = "a", descriptor = "(Lclient!SVWJKJVI;Z)V")
	private static void method451(@OriginalArg(0) Class1_Sub1_Sub4 arg0, @OriginalArg(1) boolean arg1) {
		try {
			anIntArray183 = new int[arg0.method410()];
			for (@Pc(5) int local5 = 0; local5 < anIntArray183.length; local5++) {
				anIntArray183[local5] = arg0.method407();
			}
			if (!arg1) {
				;
			}
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("10198, " + arg0 + ", " + arg1 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UIPOGFJQ", name = "a", descriptor = "(Lclient!SVWJKJVI;[[CI[[[B)V")
	private static void method452(@OriginalArg(0) Class1_Sub1_Sub4 arg0, @OriginalArg(1) char[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[][][] arg3) {
		try {
			@Pc(5) boolean local5 = false;
			for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
				@Pc(13) char[] local13 = new char[arg0.method405()];
				for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
					local13[local15] = (char) arg0.method405();
				}
				arg1[local7] = local13;
				@Pc(37) byte[][] local37 = new byte[arg0.method405()][2];
				for (@Pc(39) int local39 = 0; local39 < local37.length; local39++) {
					local37[local39][0] = (byte) arg0.method405();
					local37[local39][1] = (byte) arg0.method405();
				}
				if (local37.length > 0) {
					arg3[local7] = local37;
				}
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("7300, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UIPOGFJQ", name = "a", descriptor = "(Lclient!SVWJKJVI;Z[[C)V")
	private static void method453(@OriginalArg(0) Class1_Sub1_Sub4 arg0, @OriginalArg(2) char[][] arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
				@Pc(9) char[] local9 = new char[arg0.method405()];
				for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
					local9[local11] = (char) arg0.method405();
				}
				arg1[local3] = local9;
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("60548, " + arg0 + ", " + true + ", " + arg1 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UIPOGFJQ", name = "a", descriptor = "(B[C)V")
	private static void method454(@OriginalArg(0) byte arg0, @OriginalArg(1) char[] arg1) {
		try {
			@Pc(3) int local3 = 0;
			for (@Pc(5) int local5 = 0; local5 < arg1.length; local5++) {
				if (method455(arg1[local5])) {
					arg1[local3] = arg1[local5];
				} else {
					arg1[local3] = ' ';
				}
				if (local3 == 0 || arg1[local3] != ' ' || arg1[local3 - 1] != ' ') {
					local3++;
				}
			}
			@Pc(49) int local49;
			if (arg0 != 0) {
				for (local49 = 1; local49 > 0; local49++) {
				}
			}
			for (local49 = local3; local49 < arg1.length; local49++) {
				arg1[local49] = ' ';
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("20009, " + arg0 + ", " + arg1 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UIPOGFJQ", name = "a", descriptor = "(CI)Z")
	private static boolean method455(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= ' ' && arg0 <= '\u007f' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("81215, " + arg0 + ", " + 7 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UIPOGFJQ", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method456(@OriginalArg(1) String arg0) {
		try {
			@Pc(3) long local3 = System.currentTimeMillis();
			@Pc(10) char[] local10 = arg0.toCharArray();
			method454(aByte20, local10);
			@Pc(19) String local19 = (new String(local10)).trim();
			@Pc(23) char[] local23 = local19.toLowerCase().toCharArray();
			@Pc(26) String local26 = local19.toLowerCase();
			method464(local23);
			method459(local23);
			method460(local23);
			method473(local23);
			for (@Pc(40) int local40 = 0; local40 < aStringArray4.length; local40++) {
				@Pc(50) int local50 = -1;
				while ((local50 = local26.indexOf(aStringArray4[local40], local50 + 1)) != -1) {
					@Pc(57) char[] local57 = aStringArray4[local40].toCharArray();
					for (@Pc(59) int local59 = 0; local59 < local57.length; local59++) {
						local23[local59 + local50] = local57[local59];
					}
				}
			}
			method457(local19.toCharArray(), local23);
			method458(local23);
			@Pc(101) long local101 = System.currentTimeMillis();
			return (new String(local23)).trim();
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("24051, " + false + ", " + arg0 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UIPOGFJQ", name = "a", descriptor = "([C[CI)V")
	private static void method457(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1) {
		try {
			for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
				if (arg1[local1] != '*' && method481(arg0[local1])) {
					arg1[local1] = arg0[local1];
				}
			}
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("34140, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UIPOGFJQ", name = "a", descriptor = "([CZ)V")
	private static void method458(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(11) boolean local11 = true;
			for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
				@Pc(19) char local19 = arg0[local13];
				if (!method478(local19)) {
					local11 = true;
				} else if (local11) {
					if (method480(local19)) {
						local11 = false;
					}
				} else if (method481(local19)) {
					arg0[local13] = (char) (local19 + 'a' - 65);
				}
			}
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("36719, " + arg0 + ", " + false + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UIPOGFJQ", name = "a", descriptor = "([CI)V")
	private static void method459(@OriginalArg(0) char[] arg0) {
		try {
			for (@Pc(6) int local6 = 0; local6 < 2; local6++) {
				for (@Pc(13) int local13 = aCharArrayArray1.length - 1; local13 >= 0; local13--) {
					method468(aCharArrayArray1[local13], aByteArrayArrayArray1[local13], arg0);
				}
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("44486, " + arg0 + ", " + 833 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UIPOGFJQ", name = "b", descriptor = "([CZ)V")
	private static void method460(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(18) char[] local18 = new char[] { '(', 'a', ')' };
			method468(local18, null, local3);
			@Pc(27) char[] local27 = (char[]) arg0.clone();
			@Pc(42) char[] local42 = new char[] { 'd', 'o', 't' };
			method468(local42, null, local27);
			for (@Pc(56) int local56 = aCharArrayArray2.length - 1; local56 >= 0; local56--) {
				method461(arg0, local3, local27, aCharArrayArray2[local56]);
			}
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("81289, " + arg0 + ", " + true + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UIPOGFJQ", name = "a", descriptor = "(B[C[C[C[C)V")
	private static void method461(@OriginalArg(1) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2, @OriginalArg(4) char[] arg3) {
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
							if (local21 < arg3.length && (local58 = method470(local31, arg3[local21], local33)) > 0) {
								local19 += local58;
								local21++;
							} else {
								if (local21 == 0) {
									break label58;
								}
								@Pc(79) int local79;
								if ((local79 = method470(local31, arg3[local21 - 1], local33)) > 0) {
									local19 += local79;
									if (local21 == 1) {
										local23++;
									}
								} else {
									if (local21 >= arg3.length || !method476(anInt638, local31)) {
										break label58;
									}
									local19++;
								}
							}
						}
					}
					if (local21 >= arg3.length) {
						@Pc(110) boolean local110 = false;
						@Pc(116) int local116 = method462(arg0, arg1, local15);
						@Pc(124) int local124 = method463(local19 - 1, arg0, arg2);
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
			signlink.reporterror("10600, " + 4 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UIPOGFJQ", name = "a", descriptor = "([C[CII)I")
	private static int method462(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 == 0) {
				return 2;
			}
			for (@Pc(9) int local9 = arg2 - 1; local9 >= 0 && method476(anInt638, arg0[local9]); local9--) {
				if (arg0[local9] == '@') {
					return 3;
				}
			}
			@Pc(29) int local29 = 0;
			for (@Pc(38) int local38 = arg2 - 1; local38 >= 0 && method476(anInt638, arg1[local38]); local38--) {
				if (arg1[local38] == '*') {
					local29++;
				}
			}
			if (local29 >= 3) {
				return 4;
			} else if (method476(anInt638, arg0[arg2 - 1])) {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("10956, " + arg0 + ", " + arg1 + ", " + 8 + ", " + arg2 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UIPOGFJQ", name = "a", descriptor = "(I[CI[C)I")
	private static int method463(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg0 + 1 == arg1.length) {
				return 2;
			}
			@Pc(13) int local13 = arg0 + 1;
			while (true) {
				if (local13 < arg1.length && method476(anInt638, arg1[local13])) {
					if (arg1[local13] != '.' && arg1[local13] != ',') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(40) int local40 = 0;
				for (@Pc(44) int local44 = arg0 + 1; local44 < arg1.length && method476(anInt638, arg2[local44]); local44++) {
					if (arg2[local44] == '*') {
						local40++;
					}
				}
				if (local40 >= 3) {
					return 4;
				}
				if (method476(anInt638, arg1[arg0 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("16759, " + arg0 + ", " + arg1 + ", " + 47580 + ", " + arg2 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UIPOGFJQ", name = "a", descriptor = "(I[C)V")
	private static void method464(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(18) char[] local18 = new char[] { 'd', 'o', 't' };
			method468(local18, null, local3);
			@Pc(35) char[] local35 = (char[]) arg0.clone();
			@Pc(58) char[] local58 = new char[] { 's', 'l', 'a', 's', 'h' };
			method468(local58, null, local35);
			for (@Pc(65) int local65 = 0; local65 < aCharArrayArray3.length; local65++) {
				method465(aCharArrayArray3[local65], arg0, local35, anIntArray184[local65], local3, (byte) 6);
			}
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("58246, " + 2 + ", " + arg0 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UIPOGFJQ", name = "a", descriptor = "([C[C[CI[CB)V")
	private static void method465(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) char[] arg4, @OriginalArg(5) byte arg5) {
		try {
			if (arg0.length <= arg1.length) {
				@Pc(19) int local19;
				for (@Pc(11) int local11 = 0; local11 <= arg1.length - arg0.length; local11 += local19) {
					@Pc(15) int local15 = local11;
					@Pc(17) int local17 = 0;
					local19 = 1;
					label120: while (true) {
						while (true) {
							if (local15 >= arg1.length) {
								break label120;
							}
							@Pc(27) char local27 = arg1[local15];
							@Pc(29) char local29 = 0;
							if (local15 + 1 < arg1.length) {
								local29 = arg1[local15 + 1];
							}
							@Pc(54) int local54;
							if (local17 < arg0.length && (local54 = method470(local27, arg0[local17], local29)) > 0) {
								local15 += local54;
								local17++;
							} else {
								if (local17 == 0) {
									break label120;
								}
								@Pc(75) int local75;
								if ((local75 = method470(local27, arg0[local17 - 1], local29)) > 0) {
									local15 += local75;
									if (local17 == 1) {
										local19++;
									}
								} else {
									if (local17 >= arg0.length || !method476(anInt638, local27)) {
										break label120;
									}
									local15++;
								}
							}
						}
					}
					if (local17 >= arg0.length) {
						@Pc(106) boolean local106 = false;
						@Pc(112) int local112 = method466(local11, arg1, arg4, 453);
						@Pc(120) int local120 = method467(local15 - 1, arg2, arg1);
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
											if (arg4[local186] != '*') {
												break;
											}
											local170 = local186;
										} else if (arg4[local186] == '*') {
											local170 = local186;
											local182 = true;
										}
									}
								}
								local182 = false;
								for (local186 = local170 - 1; local186 >= 0; local186--) {
									if (local182) {
										if (method476(anInt638, arg1[local186])) {
											break;
										}
										local170 = local186;
									} else if (!method476(anInt638, arg1[local186])) {
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
								for (local186 = local174 + 1; local186 < arg1.length; local186++) {
									if (local182) {
										if (method476(anInt638, arg1[local186])) {
											break;
										}
										local174 = local186;
									} else if (!method476(anInt638, arg1[local186])) {
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
				@Pc(346) boolean local346 = false;
			}
		} catch (@Pc(356) RuntimeException local356) {
			signlink.reporterror("58951, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local356.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UIPOGFJQ", name = "a", descriptor = "(I[C[CI)I")
	private static int method466(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(5) boolean local5 = false;
			if (arg0 == 0) {
				return 2;
			}
			@Pc(13) int local13 = arg0 - 1;
			while (true) {
				if (local13 >= 0 && method476(anInt638, arg1[local13])) {
					if (arg1[local13] != ',' && arg1[local13] != '.') {
						local13--;
						continue;
					}
					return 3;
				}
				@Pc(38) int local38 = 0;
				for (@Pc(42) int local42 = arg0 - 1; local42 >= 0 && method476(anInt638, arg2[local42]); local42--) {
					if (arg2[local42] == '*') {
						local38++;
					}
				}
				if (local38 >= 3) {
					return 4;
				}
				if (method476(anInt638, arg1[arg0 - 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("53033, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UIPOGFJQ", name = "a", descriptor = "(II[C[C)I")
	private static int method467(@OriginalArg(1) int arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg0 + 1 == arg2.length) {
				return 2;
			}
			@Pc(13) int local13 = arg0 + 1;
			while (true) {
				if (local13 < arg2.length && method476(anInt638, arg2[local13])) {
					if (arg2[local13] != '\\' && arg2[local13] != '/') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(44) int local44 = 0;
				for (@Pc(48) int local48 = arg0 + 1; local48 < arg2.length && method476(anInt638, arg1[local48]); local48++) {
					if (arg1[local48] == '*') {
						local44++;
					}
				}
				if (local44 >= 5) {
					return 4;
				}
				if (method476(anInt638, arg2[arg0 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("815, " + 134 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UIPOGFJQ", name = "a", descriptor = "([C[[B[CI)V")
	private static void method468(@OriginalArg(0) char[] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) char[] arg2) {
		try {
			if (arg0.length <= arg2.length) {
				@Pc(31) int local31;
				for (@Pc(21) int local21 = 0; local21 <= arg2.length - arg0.length; local21 += local31) {
					@Pc(25) int local25 = local21;
					@Pc(27) int local27 = 0;
					@Pc(29) int local29 = 0;
					local31 = 1;
					@Pc(33) boolean local33 = false;
					@Pc(35) boolean local35 = false;
					@Pc(37) boolean local37 = false;
					@Pc(45) char var12;
					@Pc(47) char var13;
					label164: while (true) {
						while (true) {
							if (local25 >= arg2.length || local35 && local37) {
								break label164;
							}
							var12 = arg2[local25];
							var13 = '\u0000';
							if (local25 + 1 < arg2.length) {
								var13 = arg2[local25 + 1];
							}
							@Pc(72) int local72;
							if (local27 < arg0.length && (local72 = method471(arg0[local27], var13, var12)) > 0) {
								if (local72 == 1 && method479(var12)) {
									local35 = true;
								}
								if (local72 == 2 && (method479(var12) || method479(var13))) {
									local35 = true;
								}
								local25 += local72;
								local27++;
							} else {
								if (local27 == 0) {
									break label164;
								}
								@Pc(115) int local115;
								if ((local115 = method471(arg0[local27 - 1], var13, var12)) > 0) {
									local25 += local115;
									if (local27 == 1) {
										local31++;
									}
								} else {
									if (local27 >= arg0.length || !method477(var12)) {
										break label164;
									}
									if (method476(anInt638, var12) && var12 != '\'') {
										local33 = true;
									}
									if (method479(var12)) {
										local37 = true;
									}
									local25++;
									local29++;
									if (local29 * 100 / (local25 - local21) > 90) {
										break label164;
									}
								}
							}
						}
					}
					if (local27 >= arg0.length && (!local35 || !local37)) {
						@Pc(180) boolean local180 = true;
						@Pc(276) int local276;
						if (local33) {
							@Pc(226) boolean local226 = false;
							@Pc(228) boolean local228 = false;
							if (local21 - 1 < 0 || method476(anInt638, arg2[local21 - 1]) && arg2[local21 - 1] != '\'') {
								local226 = true;
							}
							if (local25 >= arg2.length || method476(anInt638, arg2[local25]) && arg2[local25] != '\'') {
								local228 = true;
							}
							if (!local226 || !local228) {
								@Pc(272) boolean local272 = false;
								local276 = local21 - 2;
								if (local226) {
									local276 = local21;
								}
								while (!local272 && local276 < local25) {
									if (local276 >= 0 && (!method476(anInt638, arg2[local276]) || arg2[local276] == '\'')) {
										@Pc(298) char[] local298 = new char[3];
										@Pc(300) int local300;
										for (local300 = 0; local300 < 3 && local276 + local300 < arg2.length && (!method476(anInt638, arg2[local276 + local300]) || arg2[local276 + local300] == '\''); local300++) {
											local298[local300] = arg2[local276 + local300];
										}
										@Pc(338) boolean local338 = true;
										if (local300 == 0) {
											local338 = false;
										}
										if (local300 < 3 && local276 - 1 >= 0 && (!method476(anInt638, arg2[local276 - 1]) || arg2[local276 - 1] == '\'')) {
											local338 = false;
										}
										if (local338 && !method482(local298)) {
											local272 = true;
										}
									}
									local276++;
								}
								if (!local272) {
									local180 = false;
								}
							}
						} else {
							var12 = ' ';
							if (local21 - 1 >= 0) {
								var12 = arg2[local21 - 1];
							}
							var13 = ' ';
							if (local25 < arg2.length) {
								var13 = arg2[local25];
							}
							@Pc(208) byte local208 = method472((byte) 3, var12);
							@Pc(212) byte local212 = method472((byte) 3, var13);
							if (arg1 != null && method469(local208, arg1, local212, anInt636)) {
								local180 = false;
							}
						}
						if (local180) {
							@Pc(388) int local388 = 0;
							@Pc(390) int local390 = 0;
							@Pc(392) int local392 = -1;
							for (local276 = local21; local276 < local25; local276++) {
								if (method479(arg2[local276])) {
									local388++;
								} else if (method478(arg2[local276])) {
									local390++;
									local392 = local276;
								}
							}
							if (local392 > -1) {
								local388 -= local25 - local392 - 1;
							}
							if (local388 <= local390) {
								for (@Pc(434) int local434 = local21; local434 < local25; local434++) {
									arg2[local434] = '*';
								}
							} else {
								local31 = 1;
							}
						}
					}
				}
			}
		} catch (@Pc(461) RuntimeException local461) {
			signlink.reporterror("43904, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 8 + ", " + local461.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UIPOGFJQ", name = "a", descriptor = "(B[[BBI)Z")
	private static boolean method469(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg3 != 3) {
				throw new NullPointerException();
			}
			@Pc(8) int local8 = 0;
			if (arg1[0][0] == arg0 && arg1[0][1] == arg2) {
				return true;
			}
			@Pc(29) int local29 = arg1.length - 1;
			if (arg1[local29][0] == arg0 && arg1[local29][1] == arg2) {
				return true;
			}
			do {
				@Pc(51) int local51 = (local8 + local29) / 2;
				if (arg1[local51][0] == arg0 && arg1[local51][1] == arg2) {
					return true;
				}
				if (arg0 < arg1[local51][0] || arg0 == arg1[local51][0] && arg2 < arg1[local51][1]) {
					local29 = local51;
				} else {
					local8 = local51;
				}
			} while (local8 != local29 && local8 + 1 != local29);
			return false;
		} catch (@Pc(105) RuntimeException local105) {
			signlink.reporterror("28921, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local105.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UIPOGFJQ", name = "a", descriptor = "(ZCCC)I")
	private static int method470(@OriginalArg(1) char arg0, @OriginalArg(2) char arg1, @OriginalArg(3) char arg2) {
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
			signlink.reporterror("77188, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UIPOGFJQ", name = "a", descriptor = "(CCBC)I")
	private static int method471(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(3) char arg2) {
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
		} catch (@Pc(518) RuntimeException local518) {
			signlink.reporterror("6813, " + arg0 + ", " + arg1 + ", " + 5 + ", " + arg2 + ", " + local518.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UIPOGFJQ", name = "a", descriptor = "(BC)B")
	private static byte method472(@OriginalArg(0) byte arg0, @OriginalArg(1) char arg1) {
		try {
			@Pc(4) boolean local4 = false;
			if (arg1 >= 'a' && arg1 <= 'z') {
				return (byte) (arg1 + 1 - 'a');
			} else if (arg1 == '\'') {
				return 28;
			} else if (arg1 >= '0' && arg1 <= '9') {
				return (byte) (arg1 + 29 - '0');
			} else {
				return 27;
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("81088, " + arg0 + ", " + arg1 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UIPOGFJQ", name = "a", descriptor = "([CB)V")
	private static void method473(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(15) int local15 = 0;
			@Pc(17) int local17 = 0;
			@Pc(19) int local19 = 0;
			while (true) {
				do {
					@Pc(118) int local118;
					if ((local118 = method474(arg0, local15)) == -1) {
						return;
					}
					@Pc(23) boolean local23 = false;
					for (@Pc(25) int local25 = local15; local25 >= 0 && local25 < local118 && !local23; local25++) {
						if (!method476(anInt638, arg0[local25]) && !method477(arg0[local25])) {
							local23 = true;
						}
					}
					if (local23) {
						local17 = 0;
					}
					if (local17 == 0) {
						local19 = local118;
					}
					local15 = method475(local118, arg0);
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
			signlink.reporterror("89890, " + arg0 + ", " + 6 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UIPOGFJQ", name = "a", descriptor = "([CBI)I")
	private static int method474(@OriginalArg(0) char[] arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(1) int local1 = arg1; local1 < arg0.length && local1 >= 0; local1++) {
				if (arg0[local1] >= '0' && arg0[local1] <= '9') {
					return local1;
				}
			}
			return -1;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("284, " + arg0 + ", " + -91 + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UIPOGFJQ", name = "a", descriptor = "(II[C)I")
	private static int method475(@OriginalArg(1) int arg0, @OriginalArg(2) char[] arg1) {
		try {
			@Pc(6) int local6 = arg0;
			while (true) {
				if (local6 < arg1.length && local6 >= 0) {
					if (arg1[local6] >= '0' && arg1[local6] <= '9') {
						local6++;
						continue;
					}
					return local6;
				}
				return arg1.length;
			}
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("72035, " + 2401 + ", " + arg0 + ", " + arg1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UIPOGFJQ", name = "a", descriptor = "(IC)Z")
	private static boolean method476(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		try {
			@Pc(3) int local3 = 32 / arg0;
			return !method478(arg1) && !method479(arg1);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("62814, " + arg0 + ", " + arg1 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UIPOGFJQ", name = "b", descriptor = "(IC)Z")
	private static boolean method477(@OriginalArg(1) char arg0) {
		try {
			if (arg0 >= 'a' && arg0 <= 'z') {
				return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
			} else {
				return true;
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("81608, " + 0 + ", " + arg0 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UIPOGFJQ", name = "c", descriptor = "(IC)Z")
	private static boolean method478(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("38395, " + 0 + ", " + arg0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UIPOGFJQ", name = "b", descriptor = "(BC)Z")
	private static boolean method479(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= '0' && arg0 <= '9';
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("71146, " + -12 + ", " + arg0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UIPOGFJQ", name = "b", descriptor = "(CI)Z")
	private static boolean method480(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z';
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("89185, " + arg0 + ", " + 3616 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UIPOGFJQ", name = "d", descriptor = "(IC)Z")
	private static boolean method481(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("25940, " + 726 + ", " + arg0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UIPOGFJQ", name = "c", descriptor = "([CZ)Z")
	private static boolean method482(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				if (!method479(arg0[local5]) && arg0[local5] != '\u0000') {
					local3 = false;
				}
			}
			if (local3) {
				return true;
			}
			@Pc(40) int local40 = method483(arg0);
			@Pc(42) int local42 = 0;
			@Pc(47) int local47 = anIntArray183.length - 1;
			if (local40 == anIntArray183[0] || local40 == anIntArray183[local47]) {
				return true;
			}
			do {
				@Pc(65) int local65 = (local42 + local47) / 2;
				if (local40 == anIntArray183[local65]) {
					return true;
				}
				if (local40 < anIntArray183[local65]) {
					local47 = local65;
				} else {
					local42 = local65;
				}
			} while (local42 != local47 && local42 + 1 != local47);
			return false;
		} catch (@Pc(94) RuntimeException local94) {
			signlink.reporterror("19027, " + arg0 + ", " + true + ", " + local94.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UIPOGFJQ", name = "b", descriptor = "(I[C)I")
	private static int method483(@OriginalArg(1) char[] arg0) {
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
			signlink.reporterror("53493, " + -346 + ", " + arg0 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}
}
