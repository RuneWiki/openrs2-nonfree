import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!IXPHWLUO")
public final class Class17 {

	@OriginalMember(owner = "client!IXPHWLUO", name = "c", descriptor = "Z")
	private static boolean aBoolean77;

	@OriginalMember(owner = "client!IXPHWLUO", name = "d", descriptor = "I")
	private static int anInt314;

	@OriginalMember(owner = "client!IXPHWLUO", name = "g", descriptor = "Z")
	private static boolean aBoolean79;

	@OriginalMember(owner = "client!IXPHWLUO", name = "h", descriptor = "I")
	private static int anInt316;

	@OriginalMember(owner = "client!IXPHWLUO", name = "i", descriptor = "[I")
	private static int[] anIntArray77;

	@OriginalMember(owner = "client!IXPHWLUO", name = "j", descriptor = "[[C")
	private static char[][] aCharArrayArray1;

	@OriginalMember(owner = "client!IXPHWLUO", name = "k", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!IXPHWLUO", name = "l", descriptor = "[[C")
	private static char[][] aCharArrayArray2;

	@OriginalMember(owner = "client!IXPHWLUO", name = "m", descriptor = "[[C")
	private static char[][] aCharArrayArray3;

	@OriginalMember(owner = "client!IXPHWLUO", name = "n", descriptor = "[I")
	private static int[] anIntArray78;

	@OriginalMember(owner = "client!IXPHWLUO", name = "b", descriptor = "I")
	private static int anInt313;

	@OriginalMember(owner = "client!IXPHWLUO", name = "f", descriptor = "I")
	private static int anInt315;

	@OriginalMember(owner = "client!IXPHWLUO", name = "o", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray4;

	static {
		aBoolean76 = true;
		anInt313 = 9;
		anInt315 = 382;
		aStringArray4 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };
	}

	@OriginalMember(owner = "client!IXPHWLUO", name = "a", descriptor = "(Lclient!FXNTEMPE;)V")
	public static void method152(@OriginalArg(0) Class13 arg0) {
		@Pc(10) Class2_Sub1_Sub4 local10 = new Class2_Sub1_Sub4(arg0.method117("fragmentsenc.txt", null), -46859);
		@Pc(19) Class2_Sub1_Sub4 local19 = new Class2_Sub1_Sub4(arg0.method117("badenc.txt", null), -46859);
		@Pc(28) Class2_Sub1_Sub4 local28 = new Class2_Sub1_Sub4(arg0.method117("domainenc.txt", null), -46859);
		@Pc(37) Class2_Sub1_Sub4 local37 = new Class2_Sub1_Sub4(arg0.method117("tldlist.txt", null), -46859);
		method153(local10, local19, local28, local37);
	}

	@OriginalMember(owner = "client!IXPHWLUO", name = "a", descriptor = "(Lclient!RSWRPCHR;Lclient!RSWRPCHR;Lclient!RSWRPCHR;Lclient!RSWRPCHR;)V")
	private static void method153(@OriginalArg(0) Class2_Sub1_Sub4 arg0, @OriginalArg(1) Class2_Sub1_Sub4 arg1, @OriginalArg(2) Class2_Sub1_Sub4 arg2, @OriginalArg(3) Class2_Sub1_Sub4 arg3) {
		method155(arg1);
		method156(arg2);
		method157(arg0, 624);
		method154(arg3);
	}

	@OriginalMember(owner = "client!IXPHWLUO", name = "a", descriptor = "(ILclient!RSWRPCHR;)V")
	private static void method154(@OriginalArg(1) Class2_Sub1_Sub4 arg0) {
		try {
			@Pc(4) int local4 = arg0.method345();
			aCharArrayArray3 = new char[local4][];
			anIntArray78 = new int[local4];
			for (@Pc(17) int local17 = 0; local17 < local4; local17++) {
				anIntArray78[local17] = arg0.method340();
				@Pc(28) char[] local28 = new char[arg0.method340()];
				for (@Pc(30) int local30 = 0; local30 < local28.length; local30++) {
					local28[local30] = (char) arg0.method340();
				}
				aCharArrayArray3[local17] = local28;
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("28396, " + -358 + ", " + arg0 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IXPHWLUO", name = "b", descriptor = "(ILclient!RSWRPCHR;)V")
	private static void method155(@OriginalArg(1) Class2_Sub1_Sub4 arg0) {
		try {
			@Pc(2) int local2 = arg0.method345();
			aCharArrayArray1 = new char[local2][];
			aByteArrayArrayArray1 = new byte[local2][][];
			method158(arg0, aByteArrayArrayArray1, anInt314, aCharArrayArray1);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("46972, " + -876 + ", " + arg0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IXPHWLUO", name = "a", descriptor = "(Lclient!RSWRPCHR;I)V")
	private static void method156(@OriginalArg(0) Class2_Sub1_Sub4 arg0) {
		try {
			@Pc(2) int local2 = arg0.method345();
			aCharArrayArray2 = new char[local2][];
			method159(arg0, aCharArrayArray2);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("81138, " + arg0 + ", " + 0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IXPHWLUO", name = "b", descriptor = "(Lclient!RSWRPCHR;I)V")
	private static void method157(@OriginalArg(0) Class2_Sub1_Sub4 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			anIntArray77 = new int[arg0.method345()];
			for (@Pc(9) int local9 = 0; local9 < anIntArray77.length; local9++) {
				anIntArray77[local9] = arg0.method342();
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("59583, " + arg0 + ", " + arg1 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IXPHWLUO", name = "a", descriptor = "(Lclient!RSWRPCHR;[[[BI[[C)V")
	private static void method158(@OriginalArg(0) Class2_Sub1_Sub4 arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) char[][] arg3) {
		try {
			@Pc(5) int local5;
			if (arg2 != 0) {
				for (local5 = 1; local5 > 0; local5++) {
				}
			}
			for (local5 = 0; local5 < arg3.length; local5++) {
				@Pc(18) char[] local18 = new char[arg0.method340()];
				for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
					local18[local20] = (char) arg0.method340();
				}
				arg3[local5] = local18;
				@Pc(42) byte[][] local42 = new byte[arg0.method340()][2];
				for (@Pc(44) int local44 = 0; local44 < local42.length; local44++) {
					local42[local44][0] = (byte) arg0.method340();
					local42[local44][1] = (byte) arg0.method340();
				}
				if (local42.length > 0) {
					arg1[local5] = local42;
				}
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("46765, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IXPHWLUO", name = "a", descriptor = "(ZLclient!RSWRPCHR;[[C)V")
	private static void method159(@OriginalArg(1) Class2_Sub1_Sub4 arg0, @OriginalArg(2) char[][] arg1) {
		try {
			for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
				@Pc(13) char[] local13 = new char[arg0.method340()];
				for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
					local13[local15] = (char) arg0.method340();
				}
				arg1[local7] = local13;
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("37931, " + false + ", " + arg0 + ", " + arg1 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IXPHWLUO", name = "a", descriptor = "([CB)V")
	private static void method160(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(7) int local7 = 0;
			for (@Pc(9) int local9 = 0; local9 < arg0.length; local9++) {
				if (method161(arg0[local9])) {
					arg0[local7] = arg0[local9];
				} else {
					arg0[local7] = ' ';
				}
				if (local7 == 0 || arg0[local7] != ' ' || arg0[local7 - 1] != ' ') {
					local7++;
				}
			}
			for (@Pc(51) int local51 = local7; local51 < arg0.length; local51++) {
				arg0[local51] = ' ';
			}
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("47371, " + arg0 + ", " + 9 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IXPHWLUO", name = "a", descriptor = "(ZC)Z")
	private static boolean method161(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= ' ' && arg0 <= '\u007f' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("89087, " + false + ", " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IXPHWLUO", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method162(@OriginalArg(1) String arg0) {
		try {
			@Pc(3) long local3 = System.currentTimeMillis();
			@Pc(6) char[] local6 = arg0.toCharArray();
			method160(local6);
			@Pc(15) String local15 = (new String(local6)).trim();
			@Pc(19) char[] local19 = local15.toLowerCase().toCharArray();
			@Pc(22) String local22 = local15.toLowerCase();
			method170(local19);
			method165(local19);
			method166(local19);
			method179(local19);
			for (@Pc(42) int local42 = 0; local42 < aStringArray4.length; local42++) {
				@Pc(52) int local52 = -1;
				while ((local52 = local22.indexOf(aStringArray4[local42], local52 + 1)) != -1) {
					@Pc(59) char[] local59 = aStringArray4[local42].toCharArray();
					for (@Pc(61) int local61 = 0; local61 < local59.length; local61++) {
						local19[local61 + local52] = local59[local61];
					}
				}
			}
			method163(local15.toCharArray(), local19);
			method164(local19);
			@Pc(103) long local103 = System.currentTimeMillis();
			return (new String(local19)).trim();
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("30945, " + false + ", " + arg0 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IXPHWLUO", name = "a", descriptor = "([CI[C)V")
	private static void method163(@OriginalArg(0) char[] arg0, @OriginalArg(2) char[] arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
				if (arg1[local3] != '*' && method187(arg0[local3])) {
					arg1[local3] = arg0[local3];
				}
			}
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("86921, " + arg0 + ", " + -931 + ", " + arg1 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IXPHWLUO", name = "a", descriptor = "(I[C)V")
	private static void method164(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(15) int local15 = 0; local15 < arg0.length; local15++) {
				@Pc(21) char local21 = arg0[local15];
				if (!method184(local21)) {
					local3 = true;
				} else if (local3) {
					if (method186(local21, 867)) {
						local3 = false;
					}
				} else if (method187(local21)) {
					arg0[local15] = (char) (local21 + 'a' - 65);
				}
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("79711, " + -915 + ", " + arg0 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IXPHWLUO", name = "a", descriptor = "(Z[C)V")
	private static void method165(@OriginalArg(1) char[] arg0) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 2; local3++) {
				for (@Pc(10) int local10 = aCharArrayArray1.length - 1; local10 >= 0; local10--) {
					method174(aByteArrayArrayArray1[local10], aCharArrayArray1[local10], 51, arg0);
				}
			}
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("22612, " + false + ", " + arg0 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IXPHWLUO", name = "b", descriptor = "(I[C)V")
	private static void method166(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(18) char[] local18 = new char[] { '(', 'a', ')' };
			method174(null, local18, 51, local3);
			@Pc(35) char[] local35 = (char[]) arg0.clone();
			@Pc(50) char[] local50 = new char[] { 'd', 'o', 't' };
			method174(null, local50, 51, local35);
			for (@Pc(60) int local60 = aCharArrayArray2.length - 1; local60 >= 0; local60--) {
				method167(arg0, aCharArrayArray2[local60], local3, local35);
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("79672, " + 0 + ", " + arg0 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IXPHWLUO", name = "a", descriptor = "([C[C[C[CZ)V")
	private static void method167(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) char[] arg3) {
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
							if (local21 < arg1.length && (local58 = method176(local31, arg1[local21], local33)) > 0) {
								local19 += local58;
								local21++;
							} else {
								if (local21 == 0) {
									break label58;
								}
								@Pc(79) int local79;
								if ((local79 = method176(local31, arg1[local21 - 1], local33)) > 0) {
									local19 += local79;
									if (local21 == 1) {
										local23++;
									}
								} else {
									if (local21 >= arg1.length || !method182(local31)) {
										break label58;
									}
									local19++;
								}
							}
						}
					}
					if (local21 >= arg1.length) {
						@Pc(110) boolean local110 = false;
						@Pc(116) int local116 = method168(local15, arg2, arg0);
						@Pc(124) int local124 = method169(arg3, arg0, local19 - 1);
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
			signlink.reporterror("49010, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + true + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IXPHWLUO", name = "a", descriptor = "(I[C[CZ)I")
	private static int method168(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2) {
		try {
			if (arg0 == 0) {
				return 2;
			}
			for (@Pc(18) int local18 = arg0 - 1; local18 >= 0 && method182(arg2[local18]); local18--) {
				if (arg2[local18] == '@') {
					return 3;
				}
			}
			@Pc(38) int local38 = 0;
			for (@Pc(42) int local42 = arg0 - 1; local42 >= 0 && method182(arg1[local42]); local42--) {
				if (arg1[local42] == '*') {
					local38++;
				}
			}
			if (local38 >= 3) {
				return 4;
			} else if (method182(arg2[arg0 - 1])) {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("40732, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IXPHWLUO", name = "a", descriptor = "([C[CII)I")
	private static int method169(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg2 + 1 == arg1.length) {
				return 2;
			}
			@Pc(21) int local21 = arg2 + 1;
			while (true) {
				if (local21 < arg1.length && method182(arg1[local21])) {
					if (arg1[local21] != '.' && arg1[local21] != ',') {
						local21++;
						continue;
					}
					return 3;
				}
				@Pc(48) int local48 = 0;
				for (@Pc(52) int local52 = arg2 + 1; local52 < arg1.length && method182(arg0[local52]); local52++) {
					if (arg0[local52] == '*') {
						local48++;
					}
				}
				if (local48 >= 3) {
					return 4;
				}
				if (method182(arg1[arg2 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("5599, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 156 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IXPHWLUO", name = "b", descriptor = "(Z[C)V")
	private static void method170(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(18) char[] local18 = new char[] { 'd', 'o', 't' };
			method174(null, local18, 51, local3);
			@Pc(30) char[] local30 = (char[]) arg0.clone();
			@Pc(53) char[] local53 = new char[] { 's', 'l', 'a', 's', 'h' };
			method174(null, local53, 51, local30);
			for (@Pc(60) int local60 = 0; local60 < aCharArrayArray3.length; local60++) {
				method171(arg0, local30, aCharArrayArray3[local60], local3, anIntArray78[local60]);
			}
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("41565, " + true + ", " + arg0 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IXPHWLUO", name = "a", descriptor = "([C[CI[C[CI)V")
	private static void method171(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(3) char[] arg2, @OriginalArg(4) char[] arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg2.length <= arg0.length) {
				@Pc(19) int local19;
				for (@Pc(11) int local11 = 0; local11 <= arg0.length - arg2.length; local11 += local19) {
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
							if (local17 < arg2.length && (local54 = method176(local27, arg2[local17], local29)) > 0) {
								local15 += local54;
								local17++;
							} else {
								if (local17 == 0) {
									break label121;
								}
								@Pc(75) int local75;
								if ((local75 = method176(local27, arg2[local17 - 1], local29)) > 0) {
									local15 += local75;
									if (local17 == 1) {
										local19++;
									}
								} else {
									if (local17 >= arg2.length || !method182(local27)) {
										break label121;
									}
									local15++;
								}
							}
						}
					}
					if (local17 >= arg2.length) {
						@Pc(106) boolean local106 = false;
						@Pc(112) int local112 = method172(arg0, local11, arg3);
						@Pc(120) int local120 = method173(local15 - 1, arg0, arg1);
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
										if (method182(arg0[local186])) {
											break;
										}
										local170 = local186;
									} else if (!method182(arg0[local186])) {
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
								for (local186 = local174 + 1; local186 < arg0.length; local186++) {
									if (local182) {
										if (method182(arg0[local186])) {
											break;
										}
										local174 = local186;
									} else if (!method182(arg0[local186])) {
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
		} catch (@Pc(347) RuntimeException local347) {
			signlink.reporterror("40786, " + arg0 + ", " + arg1 + ", " + 397 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local347.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IXPHWLUO", name = "a", descriptor = "([CI[CI)I")
	private static int method172(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) char[] arg2) {
		try {
			if (arg1 == 0) {
				return 2;
			}
			@Pc(9) int local9 = arg1 - 1;
			while (true) {
				if (local9 >= 0 && method182(arg0[local9])) {
					if (arg0[local9] != ',' && arg0[local9] != '.') {
						local9--;
						continue;
					}
					return 3;
				}
				@Pc(43) int local43 = 0;
				for (@Pc(47) int local47 = arg1 - 1; local47 >= 0 && method182(arg2[local47]); local47--) {
					if (arg2[local47] == '*') {
						local43++;
					}
				}
				if (local43 >= 3) {
					return 4;
				}
				if (method182(arg0[arg1 - 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("26235, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -246 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IXPHWLUO", name = "a", descriptor = "(II[C[C)I")
	private static int method173(@OriginalArg(0) int arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg0 + 1 == arg1.length) {
				return 2;
			}
			@Pc(13) int local13 = arg0 + 1;
			while (true) {
				if (local13 < arg1.length && method182(arg1[local13])) {
					if (arg1[local13] != '\\' && arg1[local13] != '/') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(40) int local40 = 0;
				for (@Pc(53) int local53 = arg0 + 1; local53 < arg1.length && method182(arg2[local53]); local53++) {
					if (arg2[local53] == '*') {
						local40++;
					}
				}
				if (local40 >= 5) {
					return 4;
				}
				if (method182(arg1[arg0 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("18285, " + arg0 + ", " + -14568 + ", " + arg1 + ", " + arg2 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IXPHWLUO", name = "a", descriptor = "([[B[CI[C)V")
	private static void method174(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) char[] arg3) {
		try {
			@Pc(5) boolean local5 = false;
			if (arg1.length <= arg3.length) {
				@Pc(25) int local25;
				for (@Pc(15) int local15 = 0; local15 <= arg3.length - arg1.length; local15 += local25) {
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
							if (local19 >= arg3.length || local29 && local31) {
								break label164;
							}
							var13 = arg3[local19];
							var14 = '\u0000';
							if (local19 + 1 < arg3.length) {
								var14 = arg3[local19 + 1];
							}
							@Pc(66) int local66;
							if (local21 < arg1.length && (local66 = method177(var14, arg1[local21], var13)) > 0) {
								if (local66 == 1 && method185(var13)) {
									local29 = true;
								}
								if (local66 == 2 && (method185(var13) || method185(var14))) {
									local29 = true;
								}
								local19 += local66;
								local21++;
							} else {
								if (local21 == 0) {
									break label164;
								}
								@Pc(109) int local109;
								if ((local109 = method177(var14, arg1[local21 - 1], var13)) > 0) {
									local19 += local109;
									if (local21 == 1) {
										local25++;
									}
								} else {
									if (local21 >= arg1.length || !method183(var13)) {
										break label164;
									}
									if (method182(var13) && var13 != '\'') {
										local27 = true;
									}
									if (method185(var13)) {
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
							if (local15 - 1 < 0 || method182(arg3[local15 - 1]) && arg3[local15 - 1] != '\'') {
								local220 = true;
							}
							if (local19 >= arg3.length || method182(arg3[local19]) && arg3[local19] != '\'') {
								local222 = true;
							}
							if (!local220 || !local222) {
								@Pc(266) boolean local266 = false;
								local270 = local15 - 2;
								if (local220) {
									local270 = local15;
								}
								while (!local266 && local270 < local19) {
									if (local270 >= 0 && (!method182(arg3[local270]) || arg3[local270] == '\'')) {
										@Pc(292) char[] local292 = new char[3];
										@Pc(294) int local294;
										for (local294 = 0; local294 < 3 && local270 + local294 < arg3.length && (!method182(arg3[local270 + local294]) || arg3[local270 + local294] == '\''); local294++) {
											local292[local294] = arg3[local270 + local294];
										}
										@Pc(332) boolean local332 = true;
										if (local294 == 0) {
											local332 = false;
										}
										if (local294 < 3 && local270 - 1 >= 0 && (!method182(arg3[local270 - 1]) || arg3[local270 - 1] == '\'')) {
											local332 = false;
										}
										if (local332 && !method188(local292)) {
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
								var13 = arg3[local15 - 1];
							}
							var14 = ' ';
							if (local19 < arg3.length) {
								var14 = arg3[local19];
							}
							@Pc(202) byte local202 = method178(var13, anInt315);
							@Pc(206) byte local206 = method178(var14, anInt315);
							if (arg0 != null && method175(local206, arg0, local202)) {
								local174 = false;
							}
						}
						if (local174) {
							@Pc(382) int local382 = 0;
							@Pc(384) int local384 = 0;
							@Pc(386) int local386 = -1;
							for (local270 = local15; local270 < local19; local270++) {
								if (method185(arg3[local270])) {
									local382++;
								} else if (method184(arg3[local270])) {
									local384++;
									local386 = local270;
								}
							}
							if (local386 > -1) {
								local382 -= local19 - local386 - 1;
							}
							if (local382 <= local384) {
								for (@Pc(428) int local428 = local15; local428 < local19; local428++) {
									arg3[local428] = '*';
								}
							} else {
								local25 = 1;
							}
						}
					}
				}
			}
		} catch (@Pc(455) RuntimeException local455) {
			signlink.reporterror("33246, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local455.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IXPHWLUO", name = "a", descriptor = "(BI[[BB)Z")
	private static boolean method175(@OriginalArg(0) byte arg0, @OriginalArg(2) byte[][] arg1, @OriginalArg(3) byte arg2) {
		try {
			@Pc(3) int local3 = 0;
			if (arg1[0][0] == arg2 && arg1[0][1] == arg0) {
				return true;
			}
			@Pc(24) int local24 = arg1.length - 1;
			if (arg1[local24][0] == arg2 && arg1[local24][1] == arg0) {
				return true;
			}
			do {
				@Pc(55) int local55 = (local3 + local24) / 2;
				if (arg1[local55][0] == arg2 && arg1[local55][1] == arg0) {
					return true;
				}
				if (arg2 < arg1[local55][0] || arg2 == arg1[local55][0] && arg0 < arg1[local55][1]) {
					local24 = local55;
				} else {
					local3 = local55;
				}
			} while (local3 != local24 && local3 + 1 != local24);
			return false;
		} catch (@Pc(109) RuntimeException local109) {
			signlink.reporterror("67437, " + arg0 + ", " + 385 + ", " + arg1 + ", " + arg2 + ", " + local109.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IXPHWLUO", name = "a", descriptor = "(CICC)I")
	private static int method176(@OriginalArg(0) char arg0, @OriginalArg(2) char arg1, @OriginalArg(3) char arg2) {
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
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("69159, " + arg0 + ", " + -794 + ", " + arg1 + ", " + arg2 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IXPHWLUO", name = "a", descriptor = "(CCIC)I")
	private static int method177(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(3) char arg2) {
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
			signlink.reporterror("28452, " + arg0 + ", " + arg1 + ", " + 5 + ", " + arg2 + ", " + local513.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IXPHWLUO", name = "a", descriptor = "(CI)B")
	private static byte method178(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 <= 0) {
				throw new NullPointerException();
			} else if (arg0 >= 'a' && arg0 <= 'z') {
				return (byte) (arg0 + 1 - 'a');
			} else if (arg0 == '\'') {
				return 28;
			} else if (arg0 >= '0' && arg0 <= '9') {
				return (byte) (arg0 + 29 - '0');
			} else {
				return 27;
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("18813, " + arg0 + ", " + arg1 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IXPHWLUO", name = "c", descriptor = "(Z[C)V")
	private static void method179(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(5) int local5 = 0;
			@Pc(10) int local10 = 0;
			@Pc(12) int local12 = 0;
			while (true) {
				do {
					@Pc(111) int local111;
					if ((local111 = method180(local5, arg0)) == -1) {
						return;
					}
					@Pc(16) boolean local16 = false;
					for (@Pc(18) int local18 = local5; local18 >= 0 && local18 < local111 && !local16; local18++) {
						if (!method182(arg0[local18]) && !method183(arg0[local18])) {
							local16 = true;
						}
					}
					if (local16) {
						local10 = 0;
					}
					if (local10 == 0) {
						local12 = local111;
					}
					local5 = method181(local111, arg0);
					@Pc(57) int local57 = 0;
					for (@Pc(59) int local59 = local111; local59 < local5; local59++) {
						local57 = local57 * 10 + arg0[local59] - 48;
					}
					if (local57 <= 255 && local5 - local111 <= 8) {
						local10++;
					} else {
						local10 = 0;
					}
				} while (local10 != 4);
				for (@Pc(93) int local93 = local12; local93 < local5; local93++) {
					arg0[local93] = '*';
				}
				local10 = 0;
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("57409, " + false + ", " + arg0 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IXPHWLUO", name = "a", descriptor = "(I[CZ)I")
	private static int method180(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1) {
		try {
			for (@Pc(5) int local5 = arg0; local5 < arg1.length && local5 >= 0; local5++) {
				if (arg1[local5] >= '0' && arg1[local5] <= '9') {
					return local5;
				}
			}
			return -1;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("577, " + arg0 + ", " + arg1 + ", " + true + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IXPHWLUO", name = "a", descriptor = "(I[CI)I")
	private static int method181(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1) {
		try {
			@Pc(5) int local5 = arg0;
			while (true) {
				if (local5 < arg1.length && local5 >= 0) {
					if (arg1[local5] >= '0' && arg1[local5] <= '9') {
						local5++;
						continue;
					}
					return local5;
				}
				return arg1.length;
			}
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("52200, " + arg0 + ", " + arg1 + ", " + 445 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IXPHWLUO", name = "a", descriptor = "(CZ)Z")
	private static boolean method182(@OriginalArg(0) char arg0) {
		try {
			return !method184(arg0) && !method185(arg0);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("73157, " + arg0 + ", " + true + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IXPHWLUO", name = "b", descriptor = "(CI)Z")
	private static boolean method183(@OriginalArg(0) char arg0) {
		try {
			if (arg0 >= 'a' && arg0 <= 'z') {
				return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
			} else {
				return true;
			}
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("12943, " + arg0 + ", " + 20391 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IXPHWLUO", name = "c", descriptor = "(CI)Z")
	private static boolean method184(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("82929, " + arg0 + ", " + 0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IXPHWLUO", name = "a", descriptor = "(CB)Z")
	private static boolean method185(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= '0' && arg0 <= '9';
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("72153, " + arg0 + ", " + 115 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IXPHWLUO", name = "d", descriptor = "(CI)Z")
	private static boolean method186(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			return arg0 >= 'a' && arg0 <= 'z';
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("19827, " + arg0 + ", " + arg1 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IXPHWLUO", name = "b", descriptor = "(CZ)Z")
	private static boolean method187(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("34015, " + arg0 + ", " + false + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IXPHWLUO", name = "c", descriptor = "(I[C)Z")
	private static boolean method188(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				if (!method185(arg0[local5]) && arg0[local5] != '\u0000') {
					local3 = false;
				}
			}
			if (local3) {
				return true;
			}
			@Pc(32) int local32 = method189(arg0);
			@Pc(44) int local44 = 0;
			@Pc(49) int local49 = anIntArray77.length - 1;
			if (local32 == anIntArray77[0] || local32 == anIntArray77[local49]) {
				return true;
			}
			do {
				@Pc(67) int local67 = (local44 + local49) / 2;
				if (local32 == anIntArray77[local67]) {
					return true;
				}
				if (local32 < anIntArray77[local67]) {
					local49 = local67;
				} else {
					local44 = local67;
				}
			} while (local44 != local49 && local44 + 1 != local49);
			return false;
		} catch (@Pc(96) RuntimeException local96) {
			signlink.reporterror("82606, " + -146 + ", " + arg0 + ", " + local96.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IXPHWLUO", name = "d", descriptor = "(Z[C)I")
	private static int method189(@OriginalArg(1) char[] arg0) {
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
			signlink.reporterror("34940, " + false + ", " + arg0 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}
}
