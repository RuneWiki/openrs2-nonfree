import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!sc")
public final class Class42 {

	@OriginalMember(owner = "client!sc", name = "n", descriptor = "[I")
	private static int[] anIntArray251;

	@OriginalMember(owner = "client!sc", name = "o", descriptor = "[[C")
	private static char[][] aCharArrayArray1;

	@OriginalMember(owner = "client!sc", name = "p", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!sc", name = "q", descriptor = "[[C")
	private static char[][] aCharArrayArray2;

	@OriginalMember(owner = "client!sc", name = "r", descriptor = "[[C")
	private static char[][] aCharArrayArray3;

	@OriginalMember(owner = "client!sc", name = "s", descriptor = "[I")
	private static int[] anIntArray252;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
	private static int anInt929 = 986;

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "Z")
	private static boolean aBoolean227 = true;

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "Z")
	private static boolean aBoolean228 = true;

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
	private static int anInt930 = 9;

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
	private static int anInt931 = -747;

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "B")
	private static byte aByte26 = 7;

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "B")
	private static byte aByte27 = 21;

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
	private static int anInt932 = 7;

	@OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
	private static int anInt933 = 7;

	@OriginalMember(owner = "client!sc", name = "j", descriptor = "Z")
	private static boolean aBoolean229 = true;

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "Z")
	private static boolean aBoolean230 = true;

	@OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
	private static int anInt934 = 1;

	@OriginalMember(owner = "client!sc", name = "m", descriptor = "I")
	private static int anInt935 = 8;

	@OriginalMember(owner = "client!sc", name = "t", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray13 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!xb;)V")
	public static void method588(@OriginalArg(0) Class47 arg0) {
		@Pc(10) Class1_Sub1_Sub3 local10 = new Class1_Sub1_Sub3(arg0.method660("fragmentsenc.txt", null), 185);
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(arg0.method660("badenc.txt", null), 185);
		@Pc(28) Class1_Sub1_Sub3 local28 = new Class1_Sub1_Sub3(arg0.method660("domainenc.txt", null), 185);
		@Pc(37) Class1_Sub1_Sub3 local37 = new Class1_Sub1_Sub3(arg0.method660("tldlist.txt", null), 185);
		method589(local10, local19, local28, local37);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!lb;Lclient!lb;Lclient!lb;Lclient!lb;)V")
	private static void method589(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) Class1_Sub1_Sub3 arg2, @OriginalArg(3) Class1_Sub1_Sub3 arg3) {
		method591(arg1);
		method592(arg2, anInt931);
		method593(arg0);
		method590(arg3);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!lb;)V")
	private static void method590(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(9) int local9 = arg0.method479();
			aCharArrayArray3 = new char[local9][];
			anIntArray252 = new int[local9];
			for (@Pc(17) int local17 = 0; local17 < local9; local17++) {
				anIntArray252[local17] = arg0.method474();
				@Pc(28) char[] local28 = new char[arg0.method474()];
				for (@Pc(30) int local30 = 0; local30 < local28.length; local30++) {
					local28[local30] = (char) arg0.method474();
				}
				aCharArrayArray3[local17] = local28;
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("23740, " + 3 + ", " + arg0 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!lb;I)V")
	private static void method591(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(2) int local2 = arg0.method479();
			aCharArrayArray1 = new char[local2][];
			aByteArrayArrayArray8 = new byte[local2][][];
			method594(arg0, (byte) 7, aByteArrayArrayArray8, aCharArrayArray1);
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("61476, " + arg0 + ", " + 6 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(Lclient!lb;I)V")
	private static void method592(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(2) int local2 = arg0.method479();
			if (arg1 >= 0) {
				anInt929 = -118;
			}
			aCharArrayArray2 = new char[local2][];
			method595(aCharArrayArray2, arg0);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("55824, " + arg0 + ", " + arg1 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!lb;Z)V")
	private static void method593(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			anIntArray251 = new int[arg0.method479()];
			for (@Pc(8) int local8 = 0; local8 < anIntArray251.length; local8++) {
				anIntArray251[local8] = arg0.method476();
			}
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("75848, " + arg0 + ", " + true + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!lb;B[[[B[[C)V")
	private static void method594(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) char[][] arg3) {
		try {
			if (aByte26 == 7) {
				@Pc(6) boolean local6 = false;
			} else {
				anInt931 = 116;
			}
			for (@Pc(12) int local12 = 0; local12 < arg3.length; local12++) {
				@Pc(18) char[] local18 = new char[arg0.method474()];
				for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
					local18[local20] = (char) arg0.method474();
				}
				arg3[local12] = local18;
				@Pc(42) byte[][] local42 = new byte[arg0.method474()][2];
				for (@Pc(44) int local44 = 0; local44 < local42.length; local44++) {
					local42[local44][0] = (byte) arg0.method474();
					local42[local44][1] = (byte) arg0.method474();
				}
				if (local42.length > 0) {
					arg2[local12] = local42;
				}
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("3153, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([[CZLclient!lb;)V")
	private static void method595(@OriginalArg(0) char[][] arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
				@Pc(9) char[] local9 = new char[arg1.method474()];
				for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
					local9[local11] = (char) arg1.method474();
				}
				arg0[local3] = local9;
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("78950, " + arg0 + ", " + false + ", " + arg1 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CI)V")
	private static void method596(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) int local3 = 0;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				if (method597(arg0[local5])) {
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
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("38760, " + arg0 + ", " + 2 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(CB)Z")
	private static boolean method597(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= ' ' && arg0 <= '\u007f' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("85070, " + arg0 + ", " + 53 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method598(@OriginalArg(0) String arg0) {
		try {
			@Pc(3) long local3 = System.currentTimeMillis();
			@Pc(6) char[] local6 = arg0.toCharArray();
			method596(local6);
			@Pc(27) String local27 = (new String(local6)).trim();
			@Pc(31) char[] local31 = local27.toLowerCase().toCharArray();
			@Pc(34) String local34 = local27.toLowerCase();
			method606(anInt932, local31);
			method601(local31);
			method602(local31);
			method615(local31);
			for (@Pc(48) int local48 = 0; local48 < aStringArray13.length; local48++) {
				@Pc(58) int local58 = -1;
				while ((local58 = local34.indexOf(aStringArray13[local48], local58 + 1)) != -1) {
					@Pc(65) char[] local65 = aStringArray13[local48].toCharArray();
					for (@Pc(67) int local67 = 0; local67 < local65.length; local67++) {
						local31[local67 + local58] = local65[local67];
					}
				}
			}
			method599(local31, local27.toCharArray());
			method600(local31);
			@Pc(109) long local109 = System.currentTimeMillis();
			return (new String(local31)).trim();
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("13596, " + arg0 + ", " + 7 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(B[C[C)V")
	private static void method599(@OriginalArg(1) char[] arg0, @OriginalArg(2) char[] arg1) {
		try {
			if (aByte27 != 21) {
				anInt932 = 41;
			}
			for (@Pc(6) int local6 = 0; local6 < arg1.length; local6++) {
				if (arg0[local6] != '*' && method623(arg1[local6])) {
					arg0[local6] = arg1[local6];
				}
			}
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("90152, " + 21 + ", " + arg0 + ", " + arg1 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "([CI)V")
	private static void method600(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				@Pc(11) char local11 = arg0[local5];
				if (!method620((byte) 1, local11)) {
					local3 = true;
				} else if (local3) {
					if (method622(local11)) {
						local3 = false;
					}
				} else if (method623(local11)) {
					arg0[local5] = (char) (local11 + 'a' - 65);
				}
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("99073, " + arg0 + ", " + 4 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CB)V")
	private static void method601(@OriginalArg(0) char[] arg0) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 2; local3++) {
				for (@Pc(10) int local10 = aCharArrayArray1.length - 1; local10 >= 0; local10--) {
					method610(aByteArrayArrayArray8[local10], arg0, aCharArrayArray1[local10]);
				}
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("21012, " + arg0 + ", " + -37 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z[C)V")
	private static void method602(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(18) char[] local18 = new char[] { '(', 'a', ')' };
			method610(null, local3, local18);
			@Pc(31) char[] local31 = (char[]) arg0.clone();
			@Pc(46) char[] local46 = new char[] { 'd', 'o', 't' };
			method610(null, local31, local46);
			for (@Pc(56) int local56 = aCharArrayArray2.length - 1; local56 >= 0; local56--) {
				method603(aCharArrayArray2[local56], local3, local31, arg0);
			}
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("54026, " + true + ", " + arg0 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([C[C[CI[C)V")
	private static void method603(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2, @OriginalArg(4) char[] arg3) {
		try {
			if (arg0.length <= arg3.length) {
				@Pc(28) int local28;
				for (@Pc(20) int local20 = 0; local20 <= arg3.length - arg0.length; local20 += local28) {
					@Pc(24) int local24 = local20;
					@Pc(26) int local26 = 0;
					local28 = 1;
					label58: while (true) {
						while (true) {
							if (local24 >= arg3.length) {
								break label58;
							}
							@Pc(36) char local36 = arg3[local24];
							@Pc(38) char local38 = 0;
							if (local24 + 1 < arg3.length) {
								local38 = arg3[local24 + 1];
							}
							@Pc(63) int local63;
							if (local26 < arg0.length && (local63 = method612(local38, local36, arg0[local26])) > 0) {
								local24 += local63;
								local26++;
							} else {
								if (local26 == 0) {
									break label58;
								}
								@Pc(84) int local84;
								if ((local84 = method612(local38, local36, arg0[local26 - 1])) > 0) {
									local24 += local84;
									if (local26 == 1) {
										local28++;
									}
								} else {
									if (local26 >= arg0.length || !method618(local36)) {
										break label58;
									}
									local24++;
								}
							}
						}
					}
					if (local26 >= arg0.length) {
						@Pc(115) boolean local115 = false;
						@Pc(121) int local121 = method604(arg1, arg3, local20);
						@Pc(129) int local129 = method605(arg2, local24 - 1, arg3);
						if (local121 > 2 || local129 > 2) {
							local115 = true;
						}
						if (local115) {
							for (@Pc(141) int local141 = local20; local141 < local24; local141++) {
								arg3[local141] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(164) RuntimeException local164) {
			signlink.reporterror("99346, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 8079 + ", " + arg3 + ", " + local164.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[C[CI)I")
	private static int method604(@OriginalArg(1) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 == 0) {
				return 2;
			}
			for (@Pc(9) int local9 = arg2 - 1; local9 >= 0 && method618(arg1[local9]); local9--) {
				if (arg1[local9] == '@') {
					return 3;
				}
			}
			@Pc(38) int local38 = 0;
			for (@Pc(42) int local42 = arg2 - 1; local42 >= 0 && method618(arg0[local42]); local42--) {
				if (arg0[local42] == '*') {
					local38++;
				}
			}
			if (local38 >= 3) {
				return 4;
			} else if (method618(arg1[arg2 - 1])) {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("55554, " + -642 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[CI[C)I")
	private static int method605(@OriginalArg(1) char[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg1 + 1 == arg2.length) {
				return 2;
			}
			@Pc(13) int local13 = arg1 + 1;
			while (true) {
				if (local13 < arg2.length && method618(arg2[local13])) {
					if (arg2[local13] != '.' && arg2[local13] != ',') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(50) int local50 = 0;
				for (@Pc(54) int local54 = arg1 + 1; local54 < arg2.length && method618(arg0[local54]); local54++) {
					if (arg0[local54] == '*') {
						local50++;
					}
				}
				if (local50 >= 3) {
					return 4;
				}
				if (method618(arg2[arg1 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("57186, " + 8 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[C)V")
	private static void method606(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1) {
		try {
			@Pc(5) char[] local5 = (char[]) arg1.clone();
			@Pc(20) char[] local20 = new char[] { 'd', 'o', 't' };
			if (arg0 != anInt933) {
				for (@Pc(25) int local25 = 1; local25 > 0; local25++) {
				}
			}
			method610(null, local5, local20);
			@Pc(39) char[] local39 = (char[]) arg1.clone();
			@Pc(62) char[] local62 = new char[] { 's', 'l', 'a', 's', 'h' };
			method610(null, local39, local62);
			for (@Pc(69) int local69 = 0; local69 < aCharArrayArray3.length; local69++) {
				method607(aCharArrayArray3[local69], arg1, local39, anIntArray252[local69], aBoolean229, local5);
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("53096, " + arg0 + ", " + arg1 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([C[C[CIZ[C)V")
	private static void method607(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) char[] arg5) {
		try {
			if (arg0.length <= arg1.length) {
				@Pc(13) int local13;
				if (!arg4) {
					for (local13 = 1; local13 > 0; local13++) {
					}
				}
				@Pc(28) int local28;
				for (local13 = 0; local13 <= arg1.length - arg0.length; local13 += local28) {
					@Pc(24) int local24 = local13;
					@Pc(26) int local26 = 0;
					local28 = 1;
					label123: while (true) {
						while (true) {
							if (local24 >= arg1.length) {
								break label123;
							}
							@Pc(36) char local36 = arg1[local24];
							@Pc(38) char local38 = 0;
							if (local24 + 1 < arg1.length) {
								local38 = arg1[local24 + 1];
							}
							@Pc(63) int local63;
							if (local26 < arg0.length && (local63 = method612(local38, local36, arg0[local26])) > 0) {
								local24 += local63;
								local26++;
							} else {
								if (local26 == 0) {
									break label123;
								}
								@Pc(84) int local84;
								if ((local84 = method612(local38, local36, arg0[local26 - 1])) > 0) {
									local24 += local84;
									if (local26 == 1) {
										local28++;
									}
								} else {
									if (local26 >= arg0.length || !method618(local36)) {
										break label123;
									}
									local24++;
								}
							}
						}
					}
					if (local26 >= arg0.length) {
						@Pc(115) boolean local115 = false;
						@Pc(121) int local121 = method608(arg5, arg1, local13);
						@Pc(129) int local129 = method609(arg2, local24 - 1, arg1);
						if (arg3 == 1 && local121 > 0 && local129 > 0) {
							local115 = true;
						}
						if (arg3 == 2 && (local121 > 2 && local129 > 0 || local121 > 0 && local129 > 2)) {
							local115 = true;
						}
						if (arg3 == 3 && local121 > 0 && local129 > 2) {
							local115 = true;
						}
						@Pc(172) boolean local172;
						if (arg3 == 3 && local121 > 2 && local129 > 0) {
							local172 = true;
						} else {
							local172 = false;
						}
						if (local115) {
							@Pc(179) int local179 = local13;
							@Pc(183) int local183 = local24 - 1;
							@Pc(191) boolean local191;
							@Pc(195) int local195;
							if (local121 > 2) {
								if (local121 == 4) {
									local191 = false;
									for (local195 = local13 - 1; local195 >= 0; local195--) {
										if (local191) {
											if (arg5[local195] != '*') {
												break;
											}
											local179 = local195;
										} else if (arg5[local195] == '*') {
											local179 = local195;
											local191 = true;
										}
									}
								}
								local191 = false;
								for (local195 = local179 - 1; local195 >= 0; local195--) {
									if (local191) {
										if (method618(arg1[local195])) {
											break;
										}
										local179 = local195;
									} else if (!method618(arg1[local195])) {
										local191 = true;
										local179 = local195;
									}
								}
							}
							if (local129 > 2) {
								if (local129 == 4) {
									local191 = false;
									for (local195 = local183 + 1; local195 < arg1.length; local195++) {
										if (local191) {
											if (arg2[local195] != '*') {
												break;
											}
											local183 = local195;
										} else if (arg2[local195] == '*') {
											local183 = local195;
											local191 = true;
										}
									}
								}
								local191 = false;
								for (local195 = local183 + 1; local195 < arg1.length; local195++) {
									if (local191) {
										if (method618(arg1[local195])) {
											break;
										}
										local183 = local195;
									} else if (!method618(arg1[local195])) {
										local191 = true;
										local183 = local195;
									}
								}
							}
							for (@Pc(329) int local329 = local179; local329 <= local183; local329++) {
								arg1[local329] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(352) RuntimeException local352) {
			signlink.reporterror("55261, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local352.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(B[C[CI)I")
	private static int method608(@OriginalArg(1) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 == 0) {
				return 2;
			}
			@Pc(9) int local9 = arg2 - 1;
			while (true) {
				if (local9 >= 0 && method618(arg1[local9])) {
					if (arg1[local9] != ',' && arg1[local9] != '.') {
						local9--;
						continue;
					}
					return 3;
				}
				@Pc(34) int local34 = 0;
				for (@Pc(38) int local38 = arg2 - 1; local38 >= 0 && method618(arg0[local38]); local38--) {
					if (arg0[local38] == '*') {
						local34++;
					}
				}
				if (local34 >= 3) {
					return 4;
				}
				if (method618(arg1[arg2 - 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("65685, " + 101 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(I[CI[C)I")
	private static int method609(@OriginalArg(1) char[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg1 + 1 == arg2.length) {
				return 2;
			}
			@Pc(13) int local13 = arg1 + 1;
			while (true) {
				if (local13 < arg2.length && method618(arg2[local13])) {
					if (arg2[local13] != '\\' && arg2[local13] != '/') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(40) int local40 = 0;
				for (@Pc(44) int local44 = arg1 + 1; local44 < arg2.length && method618(arg0[local44]); local44++) {
					if (arg0[local44] == '*') {
						local40++;
					}
				}
				if (local40 >= 5) {
					return 4;
				}
				if (method618(arg2[arg1 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("23278, " + -827 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([[B[C[CI)V")
	private static void method610(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2) {
		try {
			if (arg2.length <= arg1.length) {
				@Pc(31) int local31;
				for (@Pc(21) int local21 = 0; local21 <= arg1.length - arg2.length; local21 += local31) {
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
							if (local25 >= arg1.length || local35 && local37) {
								break label164;
							}
							var12 = arg1[local25];
							var13 = '\u0000';
							if (local25 + 1 < arg1.length) {
								var13 = arg1[local25 + 1];
							}
							@Pc(72) int local72;
							if (local27 < arg2.length && (local72 = method613(aBoolean230, var12, var13, arg2[local27])) > 0) {
								if (local72 == 1 && method621(var12)) {
									local35 = true;
								}
								if (local72 == 2 && (method621(var12) || method621(var13))) {
									local35 = true;
								}
								local25 += local72;
								local27++;
							} else {
								if (local27 == 0) {
									break label164;
								}
								@Pc(115) int local115;
								if ((local115 = method613(aBoolean230, var12, var13, arg2[local27 - 1])) > 0) {
									local25 += local115;
									if (local27 == 1) {
										local31++;
									}
								} else {
									if (local27 >= arg2.length || !method619(var12)) {
										break label164;
									}
									if (method618(var12) && var12 != '\'') {
										local33 = true;
									}
									if (method621(var12)) {
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
					if (local27 >= arg2.length && (!local35 || !local37)) {
						@Pc(180) boolean local180 = true;
						@Pc(276) int local276;
						if (local33) {
							@Pc(226) boolean local226 = false;
							@Pc(228) boolean local228 = false;
							if (local21 - 1 < 0 || method618(arg1[local21 - 1]) && arg1[local21 - 1] != '\'') {
								local226 = true;
							}
							if (local25 >= arg1.length || method618(arg1[local25]) && arg1[local25] != '\'') {
								local228 = true;
							}
							if (!local226 || !local228) {
								@Pc(272) boolean local272 = false;
								local276 = local21 - 2;
								if (local226) {
									local276 = local21;
								}
								while (!local272 && local276 < local25) {
									if (local276 >= 0 && (!method618(arg1[local276]) || arg1[local276] == '\'')) {
										@Pc(298) char[] local298 = new char[3];
										@Pc(300) int local300;
										for (local300 = 0; local300 < 3 && local276 + local300 < arg1.length && (!method618(arg1[local276 + local300]) || arg1[local276 + local300] == '\''); local300++) {
											local298[local300] = arg1[local276 + local300];
										}
										@Pc(338) boolean local338 = true;
										if (local300 == 0) {
											local338 = false;
										}
										if (local300 < 3 && local276 - 1 >= 0 && (!method618(arg1[local276 - 1]) || arg1[local276 - 1] == '\'')) {
											local338 = false;
										}
										if (local338 && !method624(local298)) {
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
								var12 = arg1[local21 - 1];
							}
							var13 = ' ';
							if (local25 < arg1.length) {
								var13 = arg1[local25];
							}
							@Pc(208) byte local208 = method614(var12);
							@Pc(212) byte local212 = method614(var13);
							if (arg0 != null && method611(local212, arg0, local208)) {
								local180 = false;
							}
						}
						if (local180) {
							@Pc(388) int local388 = 0;
							@Pc(390) int local390 = 0;
							@Pc(392) int local392 = -1;
							for (local276 = local21; local276 < local25; local276++) {
								if (method621(arg1[local276])) {
									local388++;
								} else if (method620((byte) 1, arg1[local276])) {
									local390++;
									local392 = local276;
								}
							}
							if (local392 > -1) {
								local388 -= local25 - local392 - 1;
							}
							if (local388 <= local390) {
								for (@Pc(434) int local434 = local21; local434 < local25; local434++) {
									arg1[local434] = '*';
								}
							} else {
								local31 = 1;
							}
						}
					}
				}
			}
		} catch (@Pc(461) RuntimeException local461) {
			signlink.reporterror("55380, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 6 + ", " + local461.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(B[[BBZ)Z")
	private static boolean method611(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) byte arg2) {
		try {
			@Pc(1) int local1 = 0;
			if (arg1[0][0] == arg2 && arg1[0][1] == arg0) {
				return true;
			}
			@Pc(30) int local30 = arg1.length - 1;
			if (arg1[local30][0] == arg2 && arg1[local30][1] == arg0) {
				return true;
			}
			do {
				@Pc(52) int local52 = (local1 + local30) / 2;
				if (arg1[local52][0] == arg2 && arg1[local52][1] == arg0) {
					return true;
				}
				if (arg2 < arg1[local52][0] || arg2 == arg1[local52][0] && arg0 < arg1[local52][1]) {
					local30 = local52;
				} else {
					local1 = local52;
				}
			} while (local1 != local30 && local1 + 1 != local30);
			return false;
		} catch (@Pc(106) RuntimeException local106) {
			signlink.reporterror("98950, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + local106.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ICCC)I")
	private static int method612(@OriginalArg(1) char arg0, @OriginalArg(2) char arg1, @OriginalArg(3) char arg2) {
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
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("53367, " + 2 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZCCC)I")
	private static int method613(@OriginalArg(0) boolean arg0, @OriginalArg(1) char arg1, @OriginalArg(2) char arg2, @OriginalArg(3) char arg3) {
		try {
			if (!arg0) {
				anInt932 = 148;
			}
			if (arg3 == arg1) {
				return 1;
			}
			if (arg3 >= 'a' && arg3 <= 'm') {
				if (arg3 == 'a') {
					if (arg1 != '4' && arg1 != '@' && arg1 != '^') {
						if (arg1 == '/' && arg2 == '\\') {
							return 2;
						}
						return 0;
					}
					return 1;
				}
				if (arg3 == 'b') {
					if (arg1 != '6' && arg1 != '8') {
						if ((arg1 != '1' || arg2 != '3') && (arg1 != 'i' || arg2 != '3')) {
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
					if ((arg1 != '[' || arg2 != ')') && (arg1 != 'i' || arg2 != ')')) {
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
					if (arg1 == 'p' && arg2 == 'h') {
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
						if ((arg1 != '(' || arg2 != ')') && (arg1 != '[' || arg2 != ']') && (arg1 != '{' || arg2 != '}') && (arg1 != '<' || arg2 != '>')) {
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
					if ((arg1 != '\\' || arg2 != '/') && (arg1 != '\\' || arg2 != '|') && (arg1 != '|' || arg2 != '/')) {
						return 0;
					}
					return 2;
				}
				if (arg3 == 'v') {
					if ((arg1 != '\\' || arg2 != '/') && (arg1 != '\\' || arg2 != '|') && (arg1 != '|' || arg2 != '/')) {
						return 0;
					}
					return 2;
				}
				if (arg3 == 'w') {
					if (arg1 == 'v' && arg2 == 'v') {
						return 2;
					}
					return 0;
				}
				if (arg3 == 'x') {
					if ((arg1 != ')' || arg2 != '(') && (arg1 != '}' || arg2 != '{') && (arg1 != ']' || arg2 != '[') && (arg1 != '>' || arg2 != '<')) {
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
					} else if ((arg1 != '(' || arg2 != ')') && (arg1 != '{' || arg2 != '}') && (arg1 != '[' || arg2 != ']')) {
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
			signlink.reporterror("78133, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local512.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IC)B")
	private static byte method614(@OriginalArg(1) char arg0) {
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
			signlink.reporterror("94471, " + 11772 + ", " + arg0 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CZ)V")
	private static void method615(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(5) int local5 = 0;
			@Pc(11) int local11 = 0;
			@Pc(13) int local13 = 0;
			while (true) {
				do {
					@Pc(112) int local112;
					if ((local112 = method616(arg0, local5, anInt934)) == -1) {
						return;
					}
					@Pc(17) boolean local17 = false;
					for (@Pc(19) int local19 = local5; local19 >= 0 && local19 < local112 && !local17; local19++) {
						if (!method618(arg0[local19]) && !method619(arg0[local19])) {
							local17 = true;
						}
					}
					if (local17) {
						local11 = 0;
					}
					if (local11 == 0) {
						local13 = local112;
					}
					local5 = method617(local112, arg0);
					@Pc(58) int local58 = 0;
					for (@Pc(60) int local60 = local112; local60 < local5; local60++) {
						local58 = local58 * 10 + arg0[local60] - 48;
					}
					if (local58 <= 255 && local5 - local112 <= 8) {
						local11++;
					} else {
						local11 = 0;
					}
				} while (local11 != 4);
				for (@Pc(94) int local94 = local13; local94 < local5; local94++) {
					arg0[local94] = '*';
				}
				local11 = 0;
			}
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("31192, " + arg0 + ", " + false + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CII)I")
	private static int method616(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(9) int local9;
			if (arg2 < 1 || arg2 > 1) {
				for (local9 = 1; local9 > 0; local9++) {
				}
			}
			for (local9 = arg1; local9 < arg0.length && local9 >= 0; local9++) {
				if (arg0[local9] >= '0' && arg0[local9] <= '9') {
					return local9;
				}
			}
			return -1;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("30886, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(II[C)I")
	private static int method617(@OriginalArg(1) int arg0, @OriginalArg(2) char[] arg1) {
		try {
			@Pc(3) int local3 = arg0;
			while (true) {
				if (local3 < arg1.length && local3 >= 0) {
					if (arg1[local3] >= '0' && arg1[local3] <= '9') {
						local3++;
						continue;
					}
					return local3;
				}
				return arg1.length;
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("34174, " + 5 + ", " + arg0 + ", " + arg1 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(CB)Z")
	private static boolean method618(@OriginalArg(0) char arg0) {
		try {
			return !method620((byte) 1, arg0) && !method621(arg0);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("32087, " + arg0 + ", " + 6 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(IC)Z")
	private static boolean method619(@OriginalArg(1) char arg0) {
		try {
			if (arg0 >= 'a' && arg0 <= 'z') {
				return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
			} else {
				return true;
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("5021, " + -783 + ", " + arg0 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BC)Z")
	private static boolean method620(@OriginalArg(0) byte arg0, @OriginalArg(1) char arg1) {
		try {
			@Pc(4) boolean local4 = false;
			return arg1 >= 'a' && arg1 <= 'z' || arg1 >= 'A' && arg1 <= 'Z';
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("46216, " + arg0 + ", " + arg1 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(CI)Z")
	private static boolean method621(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= '0' && arg0 <= '9';
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("15802, " + arg0 + ", " + 0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(IC)Z")
	private static boolean method622(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z';
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("66173, " + -802 + ", " + arg0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(CI)Z")
	private static boolean method623(@OriginalArg(0) char arg0) {
		try {
			if (anInt935 > 8 || anInt935 < 8) {
				for (@Pc(7) int local7 = 1; local7 > 0; local7++) {
				}
			}
			return arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("41302, " + arg0 + ", " + 8 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(I[C)Z")
	private static boolean method624(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				if (!method621(arg0[local5]) && arg0[local5] != '\u0000') {
					local3 = false;
				}
			}
			if (local3) {
				return true;
			}
			@Pc(42) int local42 = method625(arg0);
			@Pc(44) int local44 = 0;
			@Pc(49) int local49 = anIntArray251.length - 1;
			if (local42 == anIntArray251[0] || local42 == anIntArray251[local49]) {
				return true;
			}
			do {
				@Pc(67) int local67 = (local44 + local49) / 2;
				if (local42 == anIntArray251[local67]) {
					return true;
				}
				if (local42 < anIntArray251[local67]) {
					local49 = local67;
				} else {
					local44 = local67;
				}
			} while (local44 != local49 && local44 + 1 != local49);
			return false;
		} catch (@Pc(96) RuntimeException local96) {
			signlink.reporterror("65833, " + 9 + ", " + arg0 + ", " + local96.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "([CI)I")
	private static int method625(@OriginalArg(0) char[] arg0) {
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
			signlink.reporterror("67320, " + arg0 + ", " + 0 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}
}
