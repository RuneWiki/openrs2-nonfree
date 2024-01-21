import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!AYSHFCKR")
public final class Class1 {

	@OriginalMember(owner = "client!AYSHFCKR", name = "a", descriptor = "I")
	private static int anInt1;

	@OriginalMember(owner = "client!AYSHFCKR", name = "h", descriptor = "I")
	private static int anInt4;

	@OriginalMember(owner = "client!AYSHFCKR", name = "j", descriptor = "I")
	private static int anInt5;

	@OriginalMember(owner = "client!AYSHFCKR", name = "o", descriptor = "[I")
	private static int[] anIntArray1;

	@OriginalMember(owner = "client!AYSHFCKR", name = "p", descriptor = "[[C")
	private static char[][] aCharArrayArray1;

	@OriginalMember(owner = "client!AYSHFCKR", name = "q", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!AYSHFCKR", name = "r", descriptor = "[[C")
	private static char[][] aCharArrayArray2;

	@OriginalMember(owner = "client!AYSHFCKR", name = "s", descriptor = "[[C")
	private static char[][] aCharArrayArray3;

	@OriginalMember(owner = "client!AYSHFCKR", name = "t", descriptor = "[I")
	private static int[] anIntArray2;

	@OriginalMember(owner = "client!AYSHFCKR", name = "c", descriptor = "I")
	private static int anInt2 = 2;

	@OriginalMember(owner = "client!AYSHFCKR", name = "e", descriptor = "Z")
	private static boolean aBoolean3;

	@OriginalMember(owner = "client!AYSHFCKR", name = "f", descriptor = "I")
	private static int anInt3;

	@OriginalMember(owner = "client!AYSHFCKR", name = "i", descriptor = "B")
	private static byte aByte1;

	@OriginalMember(owner = "client!AYSHFCKR", name = "k", descriptor = "I")
	private static int anInt6;

	@OriginalMember(owner = "client!AYSHFCKR", name = "l", descriptor = "B")
	private static byte aByte2;

	@OriginalMember(owner = "client!AYSHFCKR", name = "n", descriptor = "I")
	private static int anInt7;

	@OriginalMember(owner = "client!AYSHFCKR", name = "u", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray1;

	static {
		aBoolean2 = true;
		aBoolean3 = true;
		anInt3 = -620;
		aBoolean4 = true;
		aByte1 = 8;
		anInt6 = -98;
		aByte2 = -40;
		anInt7 = -163;
		aStringArray1 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };
	}

	@OriginalMember(owner = "client!AYSHFCKR", name = "a", descriptor = "(Lclient!VSQMPWOM;)V")
	public static void method1(@OriginalArg(0) Class39 arg0) {
		@Pc(10) Class2_Sub1_Sub2 local10 = new Class2_Sub1_Sub2(arg0.method489("fragmentsenc.txt", null), -990);
		@Pc(19) Class2_Sub1_Sub2 local19 = new Class2_Sub1_Sub2(arg0.method489("badenc.txt", null), -990);
		@Pc(28) Class2_Sub1_Sub2 local28 = new Class2_Sub1_Sub2(arg0.method489("domainenc.txt", null), -990);
		@Pc(37) Class2_Sub1_Sub2 local37 = new Class2_Sub1_Sub2(arg0.method489("tldlist.txt", null), -990);
		method2(local10, local19, local28, local37);
	}

	@OriginalMember(owner = "client!AYSHFCKR", name = "a", descriptor = "(Lclient!BFQIDHPO;Lclient!BFQIDHPO;Lclient!BFQIDHPO;Lclient!BFQIDHPO;)V")
	private static void method2(@OriginalArg(0) Class2_Sub1_Sub2 arg0, @OriginalArg(1) Class2_Sub1_Sub2 arg1, @OriginalArg(2) Class2_Sub1_Sub2 arg2, @OriginalArg(3) Class2_Sub1_Sub2 arg3) {
		method4(arg1);
		method5(arg2);
		method6(arg0);
		method3(arg3);
	}

	@OriginalMember(owner = "client!AYSHFCKR", name = "a", descriptor = "(Lclient!BFQIDHPO;I)V")
	private static void method3(@OriginalArg(0) Class2_Sub1_Sub2 arg0) {
		try {
			@Pc(4) int local4 = arg0.method84();
			aCharArrayArray3 = new char[local4][];
			anIntArray2 = new int[local4];
			for (@Pc(16) int local16 = 0; local16 < local4; local16++) {
				anIntArray2[local16] = arg0.method79();
				@Pc(27) char[] local27 = new char[arg0.method79()];
				for (@Pc(29) int local29 = 0; local29 < local27.length; local29++) {
					local27[local29] = (char) arg0.method79();
				}
				aCharArrayArray3[local16] = local27;
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("55777, " + arg0 + ", " + 36592 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AYSHFCKR", name = "a", descriptor = "(Lclient!BFQIDHPO;B)V")
	private static void method4(@OriginalArg(0) Class2_Sub1_Sub2 arg0) {
		try {
			@Pc(2) int local2 = arg0.method84();
			aCharArrayArray1 = new char[local2][];
			aByteArrayArrayArray1 = new byte[local2][][];
			method7(arg0, aByteArrayArrayArray1, aCharArrayArray1);
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("80086, " + arg0 + ", " + -115 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AYSHFCKR", name = "b", descriptor = "(Lclient!BFQIDHPO;I)V")
	private static void method5(@OriginalArg(0) Class2_Sub1_Sub2 arg0) {
		try {
			@Pc(2) int local2 = arg0.method84();
			aCharArrayArray2 = new char[local2][];
			method8(arg0, aCharArrayArray2);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("75262, " + arg0 + ", " + 0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AYSHFCKR", name = "b", descriptor = "(Lclient!BFQIDHPO;B)V")
	private static void method6(@OriginalArg(0) Class2_Sub1_Sub2 arg0) {
		try {
			anIntArray1 = new int[arg0.method84()];
			for (@Pc(5) int local5 = 0; local5 < anIntArray1.length; local5++) {
				anIntArray1[local5] = arg0.method81();
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("18627, " + arg0 + ", " + 91 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AYSHFCKR", name = "a", descriptor = "(Lclient!BFQIDHPO;I[[[B[[C)V")
	private static void method7(@OriginalArg(0) Class2_Sub1_Sub2 arg0, @OriginalArg(2) byte[][][] arg1, @OriginalArg(3) char[][] arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < arg2.length; local3++) {
				@Pc(9) char[] local9 = new char[arg0.method79()];
				for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
					local9[local11] = (char) arg0.method79();
				}
				arg2[local3] = local9;
				@Pc(33) byte[][] local33 = new byte[arg0.method79()][2];
				for (@Pc(35) int local35 = 0; local35 < local33.length; local35++) {
					local33[local35][0] = (byte) arg0.method79();
					local33[local35][1] = (byte) arg0.method79();
				}
				if (local33.length > 0) {
					arg1[local3] = local33;
				}
			}
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("40495, " + arg0 + ", " + -340 + ", " + arg1 + ", " + arg2 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AYSHFCKR", name = "a", descriptor = "(Lclient!BFQIDHPO;[[CI)V")
	private static void method8(@OriginalArg(0) Class2_Sub1_Sub2 arg0, @OriginalArg(1) char[][] arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
				@Pc(9) char[] local9 = new char[arg0.method79()];
				for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
					local9[local11] = (char) arg0.method79();
				}
				arg1[local3] = local9;
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("24956, " + arg0 + ", " + arg1 + ", " + 421 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AYSHFCKR", name = "a", descriptor = "(Z[C)V")
	private static void method9(@OriginalArg(0) boolean arg0, @OriginalArg(1) char[] arg1) {
		try {
			@Pc(3) int local3 = 0;
			if (arg0) {
				for (@Pc(8) int local8 = 0; local8 < arg1.length; local8++) {
					if (method10(arg1[local8])) {
						arg1[local3] = arg1[local8];
					} else {
						arg1[local3] = ' ';
					}
					if (local3 == 0 || arg1[local3] != ' ' || arg1[local3 - 1] != ' ') {
						local3++;
					}
				}
				for (@Pc(50) int local50 = local3; local50 < arg1.length; local50++) {
					arg1[local50] = ' ';
				}
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("35406, " + arg0 + ", " + arg1 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AYSHFCKR", name = "a", descriptor = "(IC)Z")
	private static boolean method10(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= ' ' && arg0 <= '\u007f' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("34502, " + 0 + ", " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AYSHFCKR", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method11(@OriginalArg(1) String arg0) {
		try {
			@Pc(3) long local3 = System.currentTimeMillis();
			@Pc(6) char[] local6 = arg0.toCharArray();
			method9(aBoolean2, local6);
			@Pc(15) String local15 = (new String(local6)).trim();
			@Pc(19) char[] local19 = local15.toLowerCase().toCharArray();
			@Pc(22) String local22 = local15.toLowerCase();
			method19(783, local19);
			method14(local19);
			method15(local19, anInt3);
			method28(local19);
			for (@Pc(36) int local36 = 0; local36 < aStringArray1.length; local36++) {
				@Pc(46) int local46 = -1;
				while ((local46 = local22.indexOf(aStringArray1[local36], local46 + 1)) != -1) {
					@Pc(53) char[] local53 = aStringArray1[local36].toCharArray();
					for (@Pc(55) int local55 = 0; local55 < local53.length; local55++) {
						local19[local55 + local46] = local53[local55];
					}
				}
			}
			method12(aBoolean3, local19, local15.toCharArray());
			method13((byte) 5, local19);
			@Pc(102) long local102 = System.currentTimeMillis();
			return (new String(local19)).trim();
		} catch (@Pc(109) RuntimeException local109) {
			signlink.reporterror("37435, " + -18263 + ", " + arg0 + ", " + local109.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AYSHFCKR", name = "a", descriptor = "(Z[C[C)V")
	private static void method12(@OriginalArg(0) boolean arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2) {
		try {
			@Pc(5) int local5;
			if (!arg0) {
				for (local5 = 1; local5 > 0; local5++) {
				}
			}
			for (local5 = 0; local5 < arg2.length; local5++) {
				if (arg1[local5] != '*' && method36(arg2[local5], aBoolean5)) {
					arg1[local5] = arg2[local5];
				}
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("92905, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AYSHFCKR", name = "a", descriptor = "(B[C)V")
	private static void method13(@OriginalArg(0) byte arg0, @OriginalArg(1) char[] arg1) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(16) boolean local16 = true;
			for (@Pc(18) int local18 = 0; local18 < arg1.length; local18++) {
				@Pc(24) char local24 = arg1[local18];
				if (!method33(local24)) {
					local16 = true;
				} else if (local16) {
					if (method35(aByte2, local24)) {
						local16 = false;
					}
				} else if (method36(local24, aBoolean5)) {
					arg1[local18] = (char) (local24 + 'a' - 65);
				}
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("83972, " + arg0 + ", " + arg1 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AYSHFCKR", name = "a", descriptor = "(I[C)V")
	private static void method14(@OriginalArg(1) char[] arg0) {
		try {
			for (@Pc(8) int local8 = 0; local8 < 2; local8++) {
				for (@Pc(15) int local15 = aCharArrayArray1.length - 1; local15 >= 0; local15--) {
					method23(arg0, aCharArrayArray1[local15], aByteArrayArrayArray1[local15]);
				}
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("15670, " + -244 + ", " + arg0 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AYSHFCKR", name = "a", descriptor = "([CI)V")
	private static void method15(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(5) char[] local5 = (char[]) arg0.clone();
			@Pc(20) char[] local20 = new char[] { '(', 'a', ')' };
			method23(local5, local20, null);
			@Pc(29) char[] local29 = (char[]) arg0.clone();
			@Pc(44) char[] local44 = new char[] { 'd', 'o', 't' };
			method23(local29, local44, null);
			while (arg1 >= 0) {
				anInt2 = 267;
			}
			for (@Pc(60) int local60 = aCharArrayArray2.length - 1; local60 >= 0; local60--) {
				method16(arg0, aBoolean4, local5, aCharArrayArray2[local60], local29);
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("11560, " + arg0 + ", " + arg1 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AYSHFCKR", name = "a", descriptor = "([CZ[C[C[C)V")
	private static void method16(@OriginalArg(0) char[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) char[] arg3, @OriginalArg(4) char[] arg4) {
		try {
			@Pc(5) int local5;
			if (!arg1) {
				for (local5 = 1; local5 > 0; local5++) {
				}
			}
			if (arg3.length <= arg0.length) {
				for (@Pc(20) int local20 = 0; local20 <= arg0.length - arg3.length; local20 += local5) {
					@Pc(24) int local24 = local20;
					@Pc(26) int local26 = 0;
					local5 = 1;
					label62: while (true) {
						while (true) {
							if (local24 >= arg0.length) {
								break label62;
							}
							@Pc(36) char local36 = arg0[local24];
							@Pc(38) char local38 = 0;
							if (local24 + 1 < arg0.length) {
								local38 = arg0[local24 + 1];
							}
							@Pc(63) int local63;
							if (local26 < arg3.length && (local63 = method25(arg3[local26], local38, local36)) > 0) {
								local24 += local63;
								local26++;
							} else {
								if (local26 == 0) {
									break label62;
								}
								@Pc(84) int local84;
								if ((local84 = method25(arg3[local26 - 1], local38, local36)) > 0) {
									local24 += local84;
									if (local26 == 1) {
										local5++;
									}
								} else {
									if (local26 >= arg3.length || !method31(local36)) {
										break label62;
									}
									local24++;
								}
							}
						}
					}
					if (local26 >= arg3.length) {
						@Pc(115) boolean local115 = false;
						@Pc(121) int local121 = method17(arg0, local20, arg2);
						@Pc(129) int local129 = method18(arg0, local24 - 1, arg4);
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
			signlink.reporterror("81819, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local164.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AYSHFCKR", name = "a", descriptor = "([CI[CZ)I")
	private static int method17(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) char[] arg2) {
		try {
			if (arg1 == 0) {
				return 2;
			}
			for (@Pc(9) int local9 = arg1 - 1; local9 >= 0 && method31(arg0[local9]); local9--) {
				if (arg0[local9] == '@') {
					return 3;
				}
			}
			@Pc(29) int local29 = 0;
			for (@Pc(33) int local33 = arg1 - 1; local33 >= 0 && method31(arg2[local33]); local33--) {
				if (arg2[local33] == '*') {
					local29++;
				}
			}
			if (local29 >= 3) {
				return 4;
			} else if (method31(arg0[arg1 - 1])) {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("6003, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AYSHFCKR", name = "a", descriptor = "([CII[C)I")
	private static int method18(@OriginalArg(0) char[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg1 + 1 == arg0.length) {
				return 2;
			}
			@Pc(13) int local13 = arg1 + 1;
			while (true) {
				if (local13 < arg0.length && method31(arg0[local13])) {
					if (arg0[local13] != '.' && arg0[local13] != ',') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(40) int local40 = 0;
				for (@Pc(53) int local53 = arg1 + 1; local53 < arg0.length && method31(arg2[local53]); local53++) {
					if (arg2[local53] == '*') {
						local40++;
					}
				}
				if (local40 >= 3) {
					return 4;
				}
				if (method31(arg0[arg1 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("59680, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AYSHFCKR", name = "b", descriptor = "(I[C)V")
	private static void method19(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1) {
		try {
			@Pc(3) char[] local3 = (char[]) arg1.clone();
			@Pc(18) char[] local18 = new char[] { 'd', 'o', 't' };
			method23(local3, local18, null);
			@Pc(27) char[] local27 = (char[]) arg1.clone();
			@Pc(50) char[] local50 = new char[] { 's', 'l', 'a', 's', 'h' };
			method23(local27, local50, null);
			@Pc(59) boolean local59 = false;
			for (@Pc(61) int local61 = 0; local61 < aCharArrayArray3.length; local61++) {
				method20(arg1, anIntArray2[local61], local27, local3, aCharArrayArray3[local61]);
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("47381, " + arg0 + ", " + arg1 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AYSHFCKR", name = "a", descriptor = "([CI[C[C[CI)V")
	private static void method20(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) char[] arg3, @OriginalArg(4) char[] arg4) {
		try {
			if (arg4.length <= arg0.length) {
				@Pc(19) int local19;
				for (@Pc(11) int local11 = 0; local11 <= arg0.length - arg4.length; local11 += local19) {
					@Pc(15) int local15 = local11;
					@Pc(17) int local17 = 0;
					local19 = 1;
					label121: while (true) {
						while (true) {
							if (local15 >= arg0.length) {
								break label121;
							}
							@Pc(27) char local27 = arg0[local15];
							@Pc(29) char local29 = 0;
							if (local15 + 1 < arg0.length) {
								local29 = arg0[local15 + 1];
							}
							@Pc(54) int local54;
							if (local17 < arg4.length && (local54 = method25(arg4[local17], local29, local27)) > 0) {
								local15 += local54;
								local17++;
							} else {
								if (local17 == 0) {
									break label121;
								}
								@Pc(75) int local75;
								if ((local75 = method25(arg4[local17 - 1], local29, local27)) > 0) {
									local15 += local75;
									if (local17 == 1) {
										local19++;
									}
								} else {
									if (local17 >= arg4.length || !method31(local27)) {
										break label121;
									}
									local15++;
								}
							}
						}
					}
					if (local17 >= arg4.length) {
						@Pc(106) boolean local106 = false;
						@Pc(112) int local112 = method21(arg0, local11, arg3);
						@Pc(120) int local120 = method22(local15 - 1, arg2, arg0);
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
										if (method31(arg0[local186])) {
											break;
										}
										local170 = local186;
									} else if (!method31(arg0[local186])) {
										local182 = true;
										local170 = local186;
									}
								}
							}
							if (local120 > 2) {
								if (local120 == 4) {
									local182 = false;
									for (local186 = local174 + 1; local186 < arg0.length; local186++) {
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
								for (local186 = local174 + 1; local186 < arg0.length; local186++) {
									if (local182) {
										if (method31(arg0[local186])) {
											break;
										}
										local174 = local186;
									} else if (!method31(arg0[local186])) {
										local182 = true;
										local174 = local186;
									}
								}
							}
							for (@Pc(320) int local320 = local170; local320 <= local174; local320++) {
								arg0[local320] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(352) RuntimeException local352) {
			signlink.reporterror("33130, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 9 + ", " + local352.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AYSHFCKR", name = "b", descriptor = "([CII[C)I")
	private static int method21(@OriginalArg(0) char[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg1 == 0) {
				return 2;
			}
			@Pc(9) int local9 = arg1 - 1;
			while (true) {
				if (local9 >= 0 && method31(arg0[local9])) {
					if (arg0[local9] != ',' && arg0[local9] != '.') {
						local9--;
						continue;
					}
					return 3;
				}
				@Pc(34) int local34 = 0;
				for (@Pc(47) int local47 = arg1 - 1; local47 >= 0 && method31(arg2[local47]); local47--) {
					if (arg2[local47] == '*') {
						local34++;
					}
				}
				if (local34 >= 3) {
					return 4;
				}
				if (method31(arg0[arg1 - 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("10555, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AYSHFCKR", name = "a", descriptor = "(II[C[C)I")
	private static int method22(@OriginalArg(1) int arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg0 + 1 == arg2.length) {
				return 2;
			}
			@Pc(13) int local13 = arg0 + 1;
			while (true) {
				if (local13 < arg2.length && method31(arg2[local13])) {
					if (arg2[local13] != '\\' && arg2[local13] != '/') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(40) int local40 = 0;
				for (@Pc(44) int local44 = arg0 + 1; local44 < arg2.length && method31(arg1[local44]); local44++) {
					if (arg1[local44] == '*') {
						local40++;
					}
				}
				if (local40 >= 5) {
					return 4;
				}
				if (method31(arg2[arg0 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("3805, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AYSHFCKR", name = "a", descriptor = "([C[CZ[[B)V")
	private static void method23(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(3) byte[][] arg2) {
		try {
			if (arg1.length <= arg0.length) {
				@Pc(21) int local21;
				for (@Pc(11) int local11 = 0; local11 <= arg0.length - arg1.length; local11 += local21) {
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
							if (local15 >= arg0.length || local25 && local27) {
								break label165;
							}
							var12 = arg0[local15];
							var13 = '\u0000';
							if (local15 + 1 < arg0.length) {
								var13 = arg0[local15 + 1];
							}
							@Pc(62) int local62;
							if (local17 < arg1.length && (local62 = method26(var13, arg1[local17], var12)) > 0) {
								if (local62 == 1 && method34(var12)) {
									local25 = true;
								}
								if (local62 == 2 && (method34(var12) || method34(var13))) {
									local25 = true;
								}
								local15 += local62;
								local17++;
							} else {
								if (local17 == 0) {
									break label165;
								}
								@Pc(105) int local105;
								if ((local105 = method26(var13, arg1[local17 - 1], var12)) > 0) {
									local15 += local105;
									if (local17 == 1) {
										local21++;
									}
								} else {
									if (local17 >= arg1.length || !method32(var12, anInt5)) {
										break label165;
									}
									if (method31(var12) && var12 != '\'') {
										local23 = true;
									}
									if (method34(var12)) {
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
					if (local17 >= arg1.length && (!local25 || !local27)) {
						@Pc(170) boolean local170 = true;
						@Pc(266) int local266;
						if (local23) {
							@Pc(216) boolean local216 = false;
							@Pc(218) boolean local218 = false;
							if (local11 - 1 < 0 || method31(arg0[local11 - 1]) && arg0[local11 - 1] != '\'') {
								local216 = true;
							}
							if (local15 >= arg0.length || method31(arg0[local15]) && arg0[local15] != '\'') {
								local218 = true;
							}
							if (!local216 || !local218) {
								@Pc(262) boolean local262 = false;
								local266 = local11 - 2;
								if (local216) {
									local266 = local11;
								}
								while (!local262 && local266 < local15) {
									if (local266 >= 0 && (!method31(arg0[local266]) || arg0[local266] == '\'')) {
										@Pc(288) char[] local288 = new char[3];
										@Pc(290) int local290;
										for (local290 = 0; local290 < 3 && local266 + local290 < arg0.length && (!method31(arg0[local266 + local290]) || arg0[local266 + local290] == '\''); local290++) {
											local288[local290] = arg0[local266 + local290];
										}
										@Pc(328) boolean local328 = true;
										if (local290 == 0) {
											local328 = false;
										}
										if (local290 < 3 && local266 - 1 >= 0 && (!method31(arg0[local266 - 1]) || arg0[local266 - 1] == '\'')) {
											local328 = false;
										}
										if (local328 && !method37(local288)) {
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
								var12 = arg0[local11 - 1];
							}
							var13 = ' ';
							if (local15 < arg0.length) {
								var13 = arg0[local15];
							}
							@Pc(198) byte local198 = method27(var12);
							@Pc(202) byte local202 = method27(var13);
							if (arg2 != null && method24(arg2, local198, local202)) {
								local170 = false;
							}
						}
						if (local170) {
							@Pc(378) int local378 = 0;
							@Pc(380) int local380 = 0;
							@Pc(382) int local382 = -1;
							for (local266 = local11; local266 < local15; local266++) {
								if (method34(arg0[local266])) {
									local378++;
								} else if (method33(arg0[local266])) {
									local380++;
									local382 = local266;
								}
							}
							if (local382 > -1) {
								local378 -= local15 - local382 - 1;
							}
							if (local378 <= local380) {
								for (@Pc(424) int local424 = local11; local424 < local15; local424++) {
									arg0[local424] = '*';
								}
							} else {
								local21 = 1;
							}
						}
					}
				}
			}
		} catch (@Pc(459) RuntimeException local459) {
			signlink.reporterror("53887, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + local459.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AYSHFCKR", name = "a", descriptor = "([[BZBB)Z")
	private static boolean method24(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) byte arg2) {
		try {
			@Pc(3) int local3 = 0;
			if (arg0[0][0] == arg1 && arg0[0][1] == arg2) {
				return true;
			}
			@Pc(33) int local33 = arg0.length - 1;
			if (arg0[local33][0] == arg1 && arg0[local33][1] == arg2) {
				return true;
			}
			do {
				@Pc(55) int local55 = (local3 + local33) / 2;
				if (arg0[local55][0] == arg1 && arg0[local55][1] == arg2) {
					return true;
				}
				if (arg1 < arg0[local55][0] || arg1 == arg0[local55][0] && arg2 < arg0[local55][1]) {
					local33 = local55;
				} else {
					local3 = local55;
				}
			} while (local3 != local33 && local3 + 1 != local33);
			return false;
		} catch (@Pc(109) RuntimeException local109) {
			signlink.reporterror("59835, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + local109.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AYSHFCKR", name = "a", descriptor = "(CCIC)I")
	private static int method25(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(3) char arg2) {
		try {
			if (arg0 == arg2) {
				return 1;
			} else if (arg0 == 'o' && arg2 == '0') {
				return 1;
			} else if (arg0 == 'o' && arg2 == '(' && arg1 == ')') {
				return 2;
			} else if (arg0 == 'c' && (arg2 == '(' || arg2 == '<' || arg2 == '[')) {
				return 1;
			} else if (arg0 == 'e' && arg2 == '€') {
				return 1;
			} else if (arg0 == 's' && arg2 == '$') {
				return 1;
			} else if (arg0 == 'l' && arg2 == 'i') {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("69518, " + arg0 + ", " + arg1 + ", " + -226 + ", " + arg2 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AYSHFCKR", name = "a", descriptor = "(ICCC)I")
	private static int method26(@OriginalArg(1) char arg0, @OriginalArg(2) char arg1, @OriginalArg(3) char arg2) {
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
		} catch (@Pc(516) RuntimeException local516) {
			signlink.reporterror("8523, " + -382 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local516.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AYSHFCKR", name = "a", descriptor = "(CI)B")
	private static byte method27(@OriginalArg(0) char arg0) {
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
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("2355, " + arg0 + ", " + 0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AYSHFCKR", name = "c", descriptor = "(I[C)V")
	private static void method28(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(13) int local13 = 0;
			@Pc(15) int local15 = 0;
			@Pc(17) int local17 = 0;
			while (true) {
				do {
					@Pc(116) int local116;
					if ((local116 = method29(local13, arg0, (byte) 8)) == -1) {
						return;
					}
					@Pc(21) boolean local21 = false;
					for (@Pc(23) int local23 = local13; local23 >= 0 && local23 < local116 && !local21; local23++) {
						if (!method31(arg0[local23]) && !method32(arg0[local23], anInt5)) {
							local21 = true;
						}
					}
					if (local21) {
						local15 = 0;
					}
					if (local15 == 0) {
						local17 = local116;
					}
					local13 = method30(43, local116, arg0);
					@Pc(62) int local62 = 0;
					for (@Pc(64) int local64 = local116; local64 < local13; local64++) {
						local62 = local62 * 10 + arg0[local64] - 48;
					}
					if (local62 <= 255 && local13 - local116 <= 8) {
						local15++;
					} else {
						local15 = 0;
					}
				} while (local15 != 4);
				for (@Pc(98) int local98 = local17; local98 < local13; local98++) {
					arg0[local98] = '*';
				}
				local15 = 0;
			}
		} catch (@Pc(120) RuntimeException local120) {
			signlink.reporterror("45787, " + 0 + ", " + arg0 + ", " + local120.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AYSHFCKR", name = "a", descriptor = "(I[CB)I")
	private static int method29(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) byte arg2) {
		try {
			for (@Pc(3) int local3 = arg0; local3 < arg1.length && local3 >= 0; local3++) {
				if (arg1[local3] >= '0' && arg1[local3] <= '9') {
					return local3;
				}
			}
			if (aByte1 == 8) {
				@Pc(29) boolean local29 = false;
				return -1;
			} else {
				return 3;
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("70009, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AYSHFCKR", name = "a", descriptor = "(II[C)I")
	private static int method30(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) char[] arg2) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(5) int local5 = arg1;
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
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("25063, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AYSHFCKR", name = "b", descriptor = "(CI)Z")
	private static boolean method31(@OriginalArg(0) char arg0) {
		try {
			return !method33(arg0) && !method34(arg0);
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("63427, " + arg0 + ", " + -828 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AYSHFCKR", name = "c", descriptor = "(CI)Z")
	private static boolean method32(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 != 0) {
				throw new NullPointerException();
			} else if (arg0 >= 'a' && arg0 <= 'z') {
				return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
			} else {
				return true;
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("78929, " + arg0 + ", " + arg1 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AYSHFCKR", name = "d", descriptor = "(CI)Z")
	private static boolean method33(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("83138, " + arg0 + ", " + -363 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AYSHFCKR", name = "e", descriptor = "(CI)Z")
	private static boolean method34(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= '0' && arg0 <= '9';
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("10238, " + arg0 + ", " + -98 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AYSHFCKR", name = "a", descriptor = "(BC)Z")
	private static boolean method35(@OriginalArg(0) byte arg0, @OriginalArg(1) char arg1) {
		try {
			if (arg0 != -40) {
				for (@Pc(4) int local4 = 1; local4 > 0; local4++) {
				}
			}
			return arg1 >= 'a' && arg1 <= 'z';
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("42274, " + arg0 + ", " + arg1 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AYSHFCKR", name = "a", descriptor = "(CZ)Z")
	private static boolean method36(@OriginalArg(0) char arg0, @OriginalArg(1) boolean arg1) {
		try {
			if (arg1) {
				throw new NullPointerException();
			}
			return arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("36061, " + arg0 + ", " + arg1 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AYSHFCKR", name = "b", descriptor = "([CI)Z")
	private static boolean method37(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				if (!method34(arg0[local5]) && arg0[local5] != '\u0000') {
					local3 = false;
				}
			}
			if (local3) {
				return true;
			}
			@Pc(32) int local32 = method38(arg0, anInt7);
			@Pc(34) int local34 = 0;
			@Pc(43) int local43 = anIntArray1.length - 1;
			if (local32 == anIntArray1[0] || local32 == anIntArray1[local43]) {
				return true;
			}
			do {
				@Pc(61) int local61 = (local34 + local43) / 2;
				if (local32 == anIntArray1[local61]) {
					return true;
				}
				if (local32 < anIntArray1[local61]) {
					local43 = local61;
				} else {
					local34 = local61;
				}
			} while (local34 != local43 && local34 + 1 != local43);
			return false;
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("66413, " + arg0 + ", " + -41 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AYSHFCKR", name = "c", descriptor = "([CI)I")
	private static int method38(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1) {
		try {
			while (arg1 >= 0) {
			}
			if (arg0.length > 6) {
				return 0;
			}
			@Pc(19) int local19 = 0;
			for (@Pc(21) int local21 = 0; local21 < arg0.length; local21++) {
				@Pc(32) char local32 = arg0[arg0.length - local21 - 1];
				if (local32 >= 'a' && local32 <= 'z') {
					local19 = local19 * 38 + local32 + 1 - 'a';
				} else if (local32 == '\'') {
					local19 = local19 * 38 + 27;
				} else if (local32 >= '0' && local32 <= '9') {
					local19 = local19 * 38 + local32 + 28 - '0';
				} else if (local32 != '\u0000') {
					return 0;
				}
			}
			return local19;
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("85900, " + arg0 + ", " + arg1 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}
}
