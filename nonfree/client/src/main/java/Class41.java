import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!sc")
public final class Class41 {

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "Z")
	private static boolean aBoolean226;

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
	private static int anInt919;

	@OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
	private static int anInt923;

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
	private static int anInt925;

	@OriginalMember(owner = "client!sc", name = "q", descriptor = "Z")
	private static boolean aBoolean229;

	@OriginalMember(owner = "client!sc", name = "r", descriptor = "[I")
	private static int[] anIntArray250;

	@OriginalMember(owner = "client!sc", name = "s", descriptor = "[[C")
	private static char[][] aCharArrayArray1;

	@OriginalMember(owner = "client!sc", name = "t", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!sc", name = "u", descriptor = "[[C")
	private static char[][] aCharArrayArray2;

	@OriginalMember(owner = "client!sc", name = "v", descriptor = "[[C")
	private static char[][] aCharArrayArray3;

	@OriginalMember(owner = "client!sc", name = "w", descriptor = "[I")
	private static int[] anIntArray251;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
	private static int anInt918 = 8;

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
	private static int anInt920 = -48;

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "B")
	private static byte aByte49 = 117;

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "B")
	private static byte aByte50 = -13;

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
	private static int anInt921 = 6;

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
	private static int anInt922 = -35226;

	@OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
	private static int anInt924 = 881;

	@OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
	private static int anInt926 = -864;

	@OriginalMember(owner = "client!sc", name = "m", descriptor = "Z")
	private static boolean aBoolean227 = true;

	@OriginalMember(owner = "client!sc", name = "o", descriptor = "B")
	private static byte aByte51;

	@OriginalMember(owner = "client!sc", name = "p", descriptor = "I")
	private static int anInt927;

	@OriginalMember(owner = "client!sc", name = "x", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray13;

	static {
		aBoolean228 = true;
		aByte51 = 7;
		anInt927 = -28760;
		aStringArray13 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq" };
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!yb;)V")
	public static void method603(@OriginalArg(0) Class48 arg0) {
		@Pc(10) Class1_Sub1_Sub3 local10 = new Class1_Sub1_Sub3(arg0.method678("fragmentsenc.txt", null), (byte) 3);
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(arg0.method678("badenc.txt", null), (byte) 3);
		@Pc(28) Class1_Sub1_Sub3 local28 = new Class1_Sub1_Sub3(arg0.method678("domainenc.txt", null), (byte) 3);
		@Pc(37) Class1_Sub1_Sub3 local37 = new Class1_Sub1_Sub3(arg0.method678("tldlist.txt", null), (byte) 3);
		method604(local10, local19, local28, local37);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!mb;Lclient!mb;Lclient!mb;Lclient!mb;)V")
	private static void method604(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) Class1_Sub1_Sub3 arg2, @OriginalArg(3) Class1_Sub1_Sub3 arg3) {
		method606(arg1);
		method607(arg2);
		method608(arg0);
		method605(arg3);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!mb;I)V")
	private static void method605(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(4) int local4 = arg0.method503();
			aCharArrayArray3 = new char[local4][];
			anIntArray251 = new int[local4];
			for (@Pc(16) int local16 = 0; local16 < local4; local16++) {
				anIntArray251[local16] = arg0.method498();
				@Pc(27) char[] local27 = new char[arg0.method498()];
				for (@Pc(29) int local29 = 0; local29 < local27.length; local29++) {
					local27[local29] = (char) arg0.method498();
				}
				aCharArrayArray3[local16] = local27;
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("35144, " + arg0 + ", " + 2 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!mb;)V")
	private static void method606(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(2) int local2 = arg0.method503();
			aCharArrayArray1 = new char[local2][];
			aByteArrayArrayArray8 = new byte[local2][][];
			method609(aCharArrayArray1, arg0, aByteArrayArrayArray8);
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("362, " + 0 + ", " + arg0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(Lclient!mb;I)V")
	private static void method607(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(11) int local11 = arg0.method503();
			aCharArrayArray2 = new char[local11][];
			method610(arg0, aCharArrayArray2);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("21967, " + arg0 + ", " + -48 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!mb;B)V")
	private static void method608(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			anIntArray250 = new int[arg0.method503()];
			for (@Pc(17) int local17 = 0; local17 < anIntArray250.length; local17++) {
				anIntArray250[local17] = arg0.method500();
			}
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("52284, " + arg0 + ", " + 3 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([[CLclient!mb;I[[[B)V")
	private static void method609(@OriginalArg(0) char[][] arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(3) byte[][][] arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
				@Pc(9) char[] local9 = new char[arg1.method498()];
				for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
					local9[local11] = (char) arg1.method498();
				}
				arg0[local3] = local9;
				@Pc(33) byte[][] local33 = new byte[arg1.method498()][2];
				for (@Pc(35) int local35 = 0; local35 < local33.length; local35++) {
					local33[local35][0] = (byte) arg1.method498();
					local33[local35][1] = (byte) arg1.method498();
				}
				if (local33.length > 0) {
					arg2[local3] = local33;
				}
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("52993, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!mb;[[CI)V")
	private static void method610(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) char[][] arg1) {
		try {
			for (@Pc(8) int local8 = 0; local8 < arg1.length; local8++) {
				@Pc(14) char[] local14 = new char[arg0.method498()];
				for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
					local14[local16] = (char) arg0.method498();
				}
				arg1[local8] = local14;
			}
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("23688, " + arg0 + ", " + arg1 + ", " + -67 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CB)V")
	private static void method611(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) int local3 = 0;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				if (method612(arg0[local5])) {
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
			signlink.reporterror("88093, " + arg0 + ", " + 53 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IC)Z")
	private static boolean method612(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= ' ' && arg0 <= '\u007f' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("6297, " + -37569 + ", " + arg0 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method613(@OriginalArg(1) String arg0) {
		try {
			@Pc(3) long local3 = System.currentTimeMillis();
			@Pc(6) char[] local6 = arg0.toCharArray();
			method611(local6);
			if (aByte50 != -13) {
				for (@Pc(14) int local14 = 1; local14 > 0; local14++) {
				}
			}
			@Pc(31) String local31 = (new String(local6)).trim();
			local6 = local31.toLowerCase().toCharArray();
			@Pc(38) String local38 = local31.toLowerCase();
			method621(local6);
			method616(local6);
			method617(local6);
			method630(local6);
			for (@Pc(52) int local52 = 0; local52 < aStringArray13.length; local52++) {
				@Pc(56) int local56 = -1;
				while ((local56 = local38.indexOf(aStringArray13[local52], local56 + 1)) != -1) {
					@Pc(63) char[] local63 = aStringArray13[local52].toCharArray();
					for (@Pc(65) int local65 = 0; local65 < local63.length; local65++) {
						local6[local65 + local56] = local63[local65];
					}
				}
			}
			method614(local31.toCharArray(), local6);
			method615(local6, (byte) 6);
			@Pc(107) long local107 = System.currentTimeMillis();
			return (new String(local6)).trim();
		} catch (@Pc(114) RuntimeException local114) {
			signlink.reporterror("73575, " + -13 + ", " + arg0 + ", " + local114.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(B[C[C)V")
	private static void method614(@OriginalArg(1) char[] arg0, @OriginalArg(2) char[] arg1) {
		try {
			for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
				if (arg1[local1] != '*' && method638(arg0[local1])) {
					arg1[local1] = arg0[local1];
				}
			}
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("69529, " + 7 + ", " + arg0 + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "([CB)V")
	private static void method615(@OriginalArg(0) char[] arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(12) boolean local12 = true;
			for (@Pc(14) int local14 = 0; local14 < arg0.length; local14++) {
				@Pc(20) char local20 = arg0[local14];
				if (!method635(local20)) {
					local12 = true;
				} else if (local12) {
					if (method637(local20, anInt927)) {
						local12 = false;
					}
				} else if (method638(local20)) {
					arg0[local14] = (char) (local20 + 'a' - 65);
				}
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("48571, " + arg0 + ", " + arg1 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CZ)V")
	private static void method616(@OriginalArg(0) char[] arg0) {
		try {
			for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
				for (@Pc(19) int local19 = aCharArrayArray1.length - 1; local19 >= 0; local19--) {
					method625(arg0, aByteArrayArrayArray8[local19], aCharArrayArray1[local19]);
				}
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("63055, " + arg0 + ", " + true + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[C)V")
	private static void method617(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(14) char[] local14 = (char[]) arg0.clone();
			@Pc(29) char[] local29 = new char[] { '(', 'a', ')' };
			method625(local14, null, local29);
			@Pc(38) char[] local38 = (char[]) arg0.clone();
			@Pc(53) char[] local53 = new char[] { 'd', 'o', 't' };
			method625(local38, null, local53);
			for (@Pc(63) int local63 = aCharArrayArray2.length - 1; local63 >= 0; local63--) {
				method618(local14, arg0, local38, aCharArrayArray2[local63]);
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("67841, " + 382 + ", " + arg0 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CI[C[C[C)V")
	private static void method618(@OriginalArg(0) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2, @OriginalArg(4) char[] arg3) {
		try {
			if (6 >= anInt921 && 6 <= anInt921 && arg3.length <= arg1.length) {
				@Pc(26) int local26;
				for (@Pc(18) int local18 = 0; local18 <= arg1.length - arg3.length; local18 += local26) {
					@Pc(22) int local22 = local18;
					@Pc(24) int local24 = 0;
					local26 = 1;
					label61: while (true) {
						while (true) {
							if (local22 >= arg1.length) {
								break label61;
							}
							@Pc(34) char local34 = arg1[local22];
							@Pc(36) char local36 = 0;
							if (local22 + 1 < arg1.length) {
								local36 = arg1[local22 + 1];
							}
							@Pc(61) int local61;
							if (local24 < arg3.length && (local61 = method627(arg3[local24], local34, local36, anInt925)) > 0) {
								local22 += local61;
								local24++;
							} else {
								if (local24 == 0) {
									break label61;
								}
								@Pc(82) int local82;
								if ((local82 = method627(arg3[local24 - 1], local34, local36, anInt925)) > 0) {
									local22 += local82;
									if (local24 == 1) {
										local26++;
									}
								} else {
									if (local24 >= arg3.length || !method633(local34)) {
										break label61;
									}
									local22++;
								}
							}
						}
					}
					if (local24 >= arg3.length) {
						@Pc(113) boolean local113 = false;
						@Pc(119) int local119 = method619(local18, arg0, arg1, anInt922);
						@Pc(127) int local127 = method620(arg1, anInt923, local22 - 1, arg2);
						if (local119 > 2 || local127 > 2) {
							local113 = true;
						}
						if (local113) {
							for (@Pc(139) int local139 = local18; local139 < local22; local139++) {
								arg1[local139] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(162) RuntimeException local162) {
			signlink.reporterror("8916, " + arg0 + ", " + 6 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local162.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[C[CI)I")
	private static int method619(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg3 != -35226) {
				aBoolean229 = !aBoolean229;
			}
			if (arg0 == 0) {
				return 2;
			}
			for (@Pc(18) int local18 = arg0 - 1; local18 >= 0 && method633(arg2[local18]); local18--) {
				if (arg2[local18] == '@') {
					return 3;
				}
			}
			@Pc(38) int local38 = 0;
			for (@Pc(42) int local42 = arg0 - 1; local42 >= 0 && method633(arg1[local42]); local42--) {
				if (arg1[local42] == '*') {
					local38++;
				}
			}
			if (local38 >= 3) {
				return 4;
			} else if (method633(arg2[arg0 - 1])) {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("39412, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CII[C)I")
	private static int method620(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) char[] arg3) {
		try {
			if (arg2 + 1 == arg0.length) {
				return 2;
			}
			@Pc(13) int local13 = arg2 + 1;
			while (true) {
				if (local13 < arg0.length && method633(arg0[local13])) {
					if (arg0[local13] != '.' && arg0[local13] != ',') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(40) int local40 = 0;
				@Pc(44) int local44;
				if (arg1 != 0) {
					for (local44 = 1; local44 > 0; local44++) {
					}
				}
				for (local44 = arg2 + 1; local44 < arg0.length && method633(arg3[local44]); local44++) {
					if (arg3[local44] == '*') {
						local40++;
					}
				}
				if (local40 >= 3) {
					return 4;
				}
				if (method633(arg0[arg2 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("12158, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CI)V")
	private static void method621(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(23) char[] local23 = new char[] { 'd', 'o', 't' };
			method625(local3, null, local23);
			@Pc(32) char[] local32 = (char[]) arg0.clone();
			@Pc(55) char[] local55 = new char[] { 's', 'l', 'a', 's', 'h' };
			method625(local32, null, local55);
			for (@Pc(62) int local62 = 0; local62 < aCharArrayArray3.length; local62++) {
				method622(arg0, anIntArray251[local62], local32, aCharArrayArray3[local62], local3);
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("16153, " + arg0 + ", " + -48528 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CI[C[C[CI)V")
	private static void method622(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) char[] arg3, @OriginalArg(4) char[] arg4) {
		try {
			if (arg3.length <= arg0.length) {
				@Pc(19) int local19;
				for (@Pc(11) int local11 = 0; local11 <= arg0.length - arg3.length; local11 += local19) {
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
							if (local17 < arg3.length && (local54 = method627(arg3[local17], local27, local29, anInt925)) > 0) {
								local15 += local54;
								local17++;
							} else {
								if (local17 == 0) {
									break label121;
								}
								@Pc(75) int local75;
								if ((local75 = method627(arg3[local17 - 1], local27, local29, anInt925)) > 0) {
									local15 += local75;
									if (local17 == 1) {
										local19++;
									}
								} else {
									if (local17 >= arg3.length || !method633(local27)) {
										break label121;
									}
									local15++;
								}
							}
						}
					}
					if (local17 >= arg3.length) {
						@Pc(106) boolean local106 = false;
						@Pc(112) int local112 = method623(arg4, local11, arg0);
						@Pc(120) int local120 = method624(local15 - 1, arg0, arg2);
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
										if (method633(arg0[local186])) {
											break;
										}
										local170 = local186;
									} else if (!method633(arg0[local186])) {
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
										if (method633(arg0[local186])) {
											break;
										}
										local174 = local186;
									} else if (!method633(arg0[local186])) {
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
		} catch (@Pc(353) RuntimeException local353) {
			signlink.reporterror("70359, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 38262 + ", " + local353.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z[CI[C)I")
	private static int method623(@OriginalArg(1) char[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg1 == 0) {
				return 2;
			}
			@Pc(9) int local9 = arg1 - 1;
			while (true) {
				if (local9 >= 0 && method633(arg2[local9])) {
					if (arg2[local9] != ',' && arg2[local9] != '.') {
						local9--;
						continue;
					}
					return 3;
				}
				@Pc(42) int local42 = 0;
				for (@Pc(46) int local46 = arg1 - 1; local46 >= 0 && method633(arg0[local46]); local46--) {
					if (arg0[local46] == '*') {
						local42++;
					}
				}
				if (local42 >= 3) {
					return 4;
				}
				if (method633(arg2[arg1 - 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("89627, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[C[CB)I")
	private static int method624(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2) {
		try {
			if (arg0 + 1 == arg1.length) {
				return 2;
			}
			@Pc(13) int local13 = arg0 + 1;
			while (true) {
				if (local13 < arg1.length && method633(arg1[local13])) {
					if (arg1[local13] != '\\' && arg1[local13] != '/') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(40) int local40 = 0;
				for (@Pc(44) int local44 = arg0 + 1; local44 < arg1.length && method633(arg2[local44]); local44++) {
					if (arg2[local44] == '*') {
						local40++;
					}
				}
				if (local40 >= 5) {
					return 4;
				}
				if (method633(arg1[arg0 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("3175, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CB[[B[C)V")
	private static void method625(@OriginalArg(0) char[] arg0, @OriginalArg(2) byte[][] arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg2.length <= arg0.length) {
				@Pc(31) int local31;
				for (@Pc(21) int local21 = 0; local21 <= arg0.length - arg2.length; local21 += local31) {
					@Pc(25) int local25 = local21;
					@Pc(27) int local27 = 0;
					@Pc(29) int local29 = 0;
					local31 = 1;
					@Pc(33) boolean local33 = false;
					@Pc(35) boolean local35 = false;
					@Pc(37) boolean local37 = false;
					@Pc(45) char var12;
					@Pc(47) char var13;
					label162: while (true) {
						while (true) {
							if (local25 >= arg0.length || local35 && local37) {
								break label162;
							}
							var12 = arg0[local25];
							var13 = '\u0000';
							if (local25 + 1 < arg0.length) {
								var13 = arg0[local25 + 1];
							}
							@Pc(72) int local72;
							if (local27 < arg2.length && (local72 = method628(arg2[local27], var13, anInt926, var12)) > 0) {
								if (local72 == 1 && method636(470, var12)) {
									local35 = true;
								}
								if (local72 == 2 && (method636(470, var12) || method636(470, var13))) {
									local35 = true;
								}
								local25 += local72;
								local27++;
							} else {
								if (local27 == 0) {
									break label162;
								}
								@Pc(115) int local115;
								if ((local115 = method628(arg2[local27 - 1], var13, anInt926, var12)) > 0) {
									local25 += local115;
									if (local27 == 1) {
										local31++;
									}
								} else {
									if (local27 >= arg2.length || !method634(var12)) {
										break label162;
									}
									if (method633(var12) && var12 != '\'') {
										local33 = true;
									}
									if (method636(470, var12)) {
										local37 = true;
									}
									local25++;
									local29++;
									if (local29 * 100 / (local25 - local21) > 90) {
										break label162;
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
							if (local21 - 1 < 0 || method633(arg0[local21 - 1]) && arg0[local21 - 1] != '\'') {
								local226 = true;
							}
							if (local25 >= arg0.length || method633(arg0[local25]) && arg0[local25] != '\'') {
								local228 = true;
							}
							if (!local226 || !local228) {
								@Pc(272) boolean local272 = false;
								local276 = local21 - 2;
								if (local226) {
									local276 = local21;
								}
								while (!local272 && local276 < local25) {
									if (local276 >= 0 && (!method633(arg0[local276]) || arg0[local276] == '\'')) {
										@Pc(298) char[] local298 = new char[3];
										@Pc(300) int local300;
										for (local300 = 0; local300 < 3 && local276 + local300 < arg0.length && (!method633(arg0[local276 + local300]) || arg0[local276 + local300] == '\''); local300++) {
											local298[local300] = arg0[local276 + local300];
										}
										@Pc(338) boolean local338 = true;
										if (local300 == 0) {
											local338 = false;
										}
										if (local300 < 3 && local276 - 1 >= 0 && (!method633(arg0[local276 - 1]) || arg0[local276 - 1] == '\'')) {
											local338 = false;
										}
										if (local338 && !method639(local298)) {
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
								var12 = arg0[local21 - 1];
							}
							var13 = ' ';
							if (local25 < arg0.length) {
								var13 = arg0[local25];
							}
							@Pc(208) byte local208 = method629(var12, aBoolean227);
							@Pc(212) byte local212 = method629(var13, aBoolean227);
							if (arg1 != null && method626(local208, arg1, local212)) {
								local180 = false;
							}
						}
						if (local180) {
							@Pc(388) int local388 = 0;
							@Pc(390) int local390 = 0;
							@Pc(392) int local392 = -1;
							for (local276 = local21; local276 < local25; local276++) {
								if (method636(470, arg0[local276])) {
									local388++;
								} else if (method635(arg0[local276])) {
									local390++;
									local392 = local276;
								}
							}
							if (local392 > -1) {
								local388 -= local25 + 1 - local392;
							}
							if (local388 <= local390) {
								for (@Pc(434) int local434 = local21; local434 < local25; local434++) {
									arg0[local434] = '*';
								}
							}
						}
					}
				}
			}
		} catch (@Pc(457) RuntimeException local457) {
			signlink.reporterror("42070, " + arg0 + ", " + 89 + ", " + arg1 + ", " + arg2 + ", " + local457.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BI[[BB)Z")
	private static boolean method626(@OriginalArg(0) byte arg0, @OriginalArg(2) byte[][] arg1, @OriginalArg(3) byte arg2) {
		try {
			@Pc(1) int local1 = 0;
			if (arg1[0][0] == arg0 && arg1[0][1] == arg2) {
				return true;
			}
			@Pc(26) int local26 = arg1.length - 1;
			if (arg1[local26][0] == arg0 && arg1[local26][1] == arg2) {
				return true;
			}
			do {
				@Pc(48) int local48 = (local1 + local26) / 2;
				if (arg1[local48][0] == arg0 && arg1[local48][1] == arg2) {
					return true;
				}
				if (arg0 < arg1[local48][0] || arg0 == arg1[local48][0] && arg2 < arg1[local48][1]) {
					local26 = local48;
				} else {
					local1 = local48;
				}
			} while (local1 != local26 && local1 + 1 != local26);
			return false;
		} catch (@Pc(102) RuntimeException local102) {
			signlink.reporterror("2749, " + arg0 + ", " + 881 + ", " + arg1 + ", " + arg2 + ", " + local102.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(CCCI)I")
	private static int method627(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(2) char arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg3 != 0) {
				return anInt920;
			} else if (arg0 == arg1) {
				return 1;
			} else if (arg0 == 'o' && arg1 == '0') {
				return 1;
			} else if (arg0 == 'o' && arg1 == '(' && arg2 == ')') {
				return 2;
			} else if (arg0 == 'c' && (arg1 == '(' || arg1 == '<' || arg1 == '[')) {
				return 1;
			} else if (arg0 == 'e' && arg1 == '€') {
				return 1;
			} else if (arg0 == 's' && arg1 == '$') {
				return 1;
			} else if (arg0 == 'l' && arg1 == 'i') {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("65591, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(CCIC)I")
	private static int method628(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(2) int arg2, @OriginalArg(3) char arg3) {
		try {
			if (arg2 >= 0) {
				aBoolean227 = !aBoolean227;
			}
			if (arg0 == arg3) {
				return 1;
			}
			if (arg0 >= 'a' && arg0 <= 'm') {
				if (arg0 == 'a') {
					if (arg3 != '4' && arg3 != '@' && arg3 != '^') {
						if (arg3 == '/' && arg1 == '\\') {
							return 2;
						}
						return 0;
					}
					return 1;
				}
				if (arg0 == 'b') {
					if (arg3 != '6' && arg3 != '8') {
						if ((arg3 != '1' || arg1 != '3') && (arg3 != 'i' || arg1 != '3')) {
							return 0;
						}
						return 2;
					}
					return 1;
				}
				if (arg0 == 'c') {
					if (arg3 != '(' && arg3 != '<' && arg3 != '{' && arg3 != '[') {
						return 0;
					}
					return 1;
				}
				if (arg0 == 'd') {
					if ((arg3 != '[' || arg1 != ')') && (arg3 != 'i' || arg1 != ')')) {
						return 0;
					}
					return 2;
				}
				if (arg0 == 'e') {
					if (arg3 != '3' && arg3 != '€') {
						return 0;
					}
					return 1;
				}
				if (arg0 == 'f') {
					if (arg3 == 'p' && arg1 == 'h') {
						return 2;
					}
					if (arg3 == '£') {
						return 1;
					}
					return 0;
				}
				if (arg0 == 'g') {
					if (arg3 != '9' && arg3 != '6' && arg3 != 'q') {
						return 0;
					}
					return 1;
				}
				if (arg0 == 'h') {
					if (arg3 == '#') {
						return 1;
					}
					return 0;
				}
				if (arg0 == 'i') {
					if (arg3 != 'y' && arg3 != 'l' && arg3 != 'j' && arg3 != '1' && arg3 != '!' && arg3 != ':' && arg3 != ';' && arg3 != '|') {
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
					if (arg3 != '1' && arg3 != '|' && arg3 != 'i') {
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
					if (arg3 != '0' && arg3 != '*') {
						if ((arg3 != '(' || arg1 != ')') && (arg3 != '[' || arg1 != ']') && (arg3 != '{' || arg1 != '}') && (arg3 != '<' || arg1 != '>')) {
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
					if (arg3 != '5' && arg3 != 'z' && arg3 != '$' && arg3 != '2') {
						return 0;
					}
					return 1;
				}
				if (arg0 == 't') {
					if (arg3 != '7' && arg3 != '+') {
						return 0;
					}
					return 1;
				}
				if (arg0 == 'u') {
					if (arg3 == 'v') {
						return 1;
					}
					if ((arg3 != '\\' || arg1 != '/') && (arg3 != '\\' || arg1 != '|') && (arg3 != '|' || arg1 != '/')) {
						return 0;
					}
					return 2;
				}
				if (arg0 == 'v') {
					if ((arg3 != '\\' || arg1 != '/') && (arg3 != '\\' || arg1 != '|') && (arg3 != '|' || arg1 != '/')) {
						return 0;
					}
					return 2;
				}
				if (arg0 == 'w') {
					if (arg3 == 'v' && arg1 == 'v') {
						return 2;
					}
					return 0;
				}
				if (arg0 == 'x') {
					if ((arg3 != ')' || arg1 != '(') && (arg3 != '}' || arg1 != '{') && (arg3 != ']' || arg1 != '[') && (arg3 != '>' || arg1 != '<')) {
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
					if (arg3 == 'o' || arg3 == 'O') {
						return 1;
					} else if ((arg3 != '(' || arg1 != ')') && (arg3 != '{' || arg1 != '}') && (arg3 != '[' || arg1 != ']')) {
						return 0;
					} else {
						return 2;
					}
				} else if (arg0 == '1') {
					return arg3 == 'l' ? 1 : 0;
				} else {
					return 0;
				}
			} else if (arg0 == ',') {
				return arg3 == '.' ? 1 : 0;
			} else if (arg0 == '.') {
				return arg3 == ',' ? 1 : 0;
			} else if (arg0 == '!') {
				return arg3 == 'i' ? 1 : 0;
			} else {
				return 0;
			}
		} catch (@Pc(516) RuntimeException local516) {
			signlink.reporterror("84278, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local516.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(CZ)B")
	private static byte method629(@OriginalArg(0) char arg0, @OriginalArg(1) boolean arg1) {
		try {
			if (!arg1) {
				anInt919 = -95;
			}
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
			signlink.reporterror("85054, " + arg0 + ", " + arg1 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "([CI)V")
	private static void method630(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			@Pc(16) int local16 = 0;
			while (true) {
				do {
					@Pc(115) int local115;
					if ((local115 = method631(aBoolean228, arg0, local5)) == -1) {
						return;
					}
					@Pc(20) boolean local20 = false;
					for (@Pc(22) int local22 = local5; local22 >= 0 && local22 < local115 && !local20; local22++) {
						if (!method633(arg0[local22]) && !method634(arg0[local22])) {
							local20 = true;
						}
					}
					if (local20) {
						local7 = 0;
					}
					if (local7 == 0) {
						local16 = local115;
					}
					local5 = method632(local115, arg0, (byte) 7);
					@Pc(61) int local61 = 0;
					for (@Pc(63) int local63 = local115; local63 < local5; local63++) {
						local61 = local61 * 10 + arg0[local63] - 48;
					}
					if (local61 <= 255 && local5 - local115 <= 8) {
						local7++;
					} else {
						local7 = 0;
					}
				} while (local7 != 4);
				for (@Pc(97) int local97 = local16; local97 < local5; local97++) {
					arg0[local97] = '*';
				}
				local7 = 0;
			}
		} catch (@Pc(119) RuntimeException local119) {
			signlink.reporterror("11725, " + arg0 + ", " + 9 + ", " + local119.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z[CI)I")
	private static int method631(@OriginalArg(0) boolean arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) int arg2) {
		try {
			if (!arg0) {
				return anInt926;
			}
			for (@Pc(5) int local5 = arg2; local5 < arg1.length && local5 >= 0; local5++) {
				if (arg1[local5] >= '0' && arg1[local5] <= '9') {
					return local5;
				}
			}
			return -1;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("77661, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[CB)I")
	private static int method632(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) byte arg2) {
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
				if (aByte51 == 7) {
					@Pc(29) boolean local29 = false;
				}
				return arg1.length;
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("29850, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(CZ)Z")
	private static boolean method633(@OriginalArg(0) char arg0) {
		try {
			return !method635(arg0) && !method636(470, arg0);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("9921, " + arg0 + ", " + true + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(CZ)Z")
	private static boolean method634(@OriginalArg(0) char arg0) {
		try {
			if (arg0 >= 'a' && arg0 <= 'z') {
				return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
			} else {
				return true;
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("49473, " + arg0 + ", " + true + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(IC)Z")
	private static boolean method635(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("75036, " + 8 + ", " + arg0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(IC)Z")
	private static boolean method636(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		try {
			@Pc(3) boolean local3 = false;
			return arg1 >= '0' && arg1 <= '9';
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("31441, " + arg0 + ", " + arg1 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(CI)Z")
	private static boolean method637(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 != anInt927) {
				anInt918 = 81;
			}
			return arg0 >= 'a' && arg0 <= 'z';
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("96843, " + arg0 + ", " + arg1 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(CI)Z")
	private static boolean method638(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("50920, " + arg0 + ", " + -724 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(I[C)Z")
	private static boolean method639(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(9) boolean local9 = true;
			for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
				if (!method636(470, arg0[local11]) && arg0[local11] != '\u0000') {
					local9 = false;
				}
			}
			if (local9) {
				return true;
			}
			@Pc(38) int local38 = method640(arg0);
			@Pc(40) int local40 = 0;
			@Pc(45) int local45 = anIntArray250.length - 1;
			if (local38 == anIntArray250[0] || local38 == anIntArray250[local45]) {
				return true;
			}
			do {
				@Pc(63) int local63 = (local40 + local45) / 2;
				if (local38 == anIntArray250[local63]) {
					return true;
				}
				if (local38 < anIntArray250[local63]) {
					local45 = local63;
				} else {
					local40 = local63;
				}
			} while (local40 != local45 && local40 + 1 != local45);
			return false;
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("9582, " + 0 + ", " + arg0 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "([CB)I")
	private static int method640(@OriginalArg(0) char[] arg0) {
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
			signlink.reporterror("94031, " + arg0 + ", " + 9 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}
}
