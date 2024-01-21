import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!sc")
public final class Class41 {

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
	private static int anInt949;

	@OriginalMember(owner = "client!sc", name = "l", descriptor = "Z")
	private static boolean aBoolean217;

	@OriginalMember(owner = "client!sc", name = "m", descriptor = "[I")
	private static int[] anIntArray250;

	@OriginalMember(owner = "client!sc", name = "n", descriptor = "[[C")
	private static char[][] aCharArrayArray1;

	@OriginalMember(owner = "client!sc", name = "o", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!sc", name = "p", descriptor = "[[C")
	private static char[][] aCharArrayArray2;

	@OriginalMember(owner = "client!sc", name = "q", descriptor = "[[C")
	private static char[][] aCharArrayArray3;

	@OriginalMember(owner = "client!sc", name = "r", descriptor = "[I")
	private static int[] anIntArray251;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "Z")
	private static boolean aBoolean214 = true;

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
	private static int anInt948 = 46;

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "B")
	private static byte aByte61 = -14;

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
	private static int anInt950 = 2;

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "B")
	private static byte aByte62 = 7;

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
	private static int anInt951 = -399;

	@OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
	private static int anInt952 = 6;

	@OriginalMember(owner = "client!sc", name = "j", descriptor = "B")
	private static byte aByte63 = 3;

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "Z")
	private static boolean aBoolean216 = true;

	@OriginalMember(owner = "client!sc", name = "s", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray12 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq" };

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!yb;)V")
	public static void method603(@OriginalArg(0) Class48 arg0) {
		@Pc(10) Class1_Sub1_Sub3 local10 = new Class1_Sub1_Sub3(45427, arg0.method678("fragmentsenc.txt", null));
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(45427, arg0.method678("badenc.txt", null));
		@Pc(28) Class1_Sub1_Sub3 local28 = new Class1_Sub1_Sub3(45427, arg0.method678("domainenc.txt", null));
		@Pc(37) Class1_Sub1_Sub3 local37 = new Class1_Sub1_Sub3(45427, arg0.method678("tldlist.txt", null));
		method604(local10, local19, local28, local37);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!mb;Lclient!mb;Lclient!mb;Lclient!mb;)V")
	private static void method604(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) Class1_Sub1_Sub3 arg2, @OriginalArg(3) Class1_Sub1_Sub3 arg3) {
		method606(arg1);
		method607(arg2);
		method608(anInt949, arg0);
		method605(arg3);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BLclient!mb;)V")
	private static void method605(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(4) int local4 = arg0.method503();
			aCharArrayArray3 = new char[local4][];
			anIntArray251 = new int[local4];
			for (@Pc(17) int local17 = 0; local17 < local4; local17++) {
				anIntArray251[local17] = arg0.method498();
				@Pc(28) char[] local28 = new char[arg0.method498()];
				for (@Pc(30) int local30 = 0; local30 < local28.length; local30++) {
					local28[local30] = (char) arg0.method498();
				}
				aCharArrayArray3[local17] = local28;
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("39781, " + 107 + ", " + arg0 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!mb;B)V")
	private static void method606(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			if (aByte61 != -14) {
				aBoolean217 = !aBoolean217;
			}
			@Pc(11) int local11 = arg0.method503();
			aCharArrayArray1 = new char[local11][];
			aByteArrayArrayArray8 = new byte[local11][][];
			method609(aByteArrayArrayArray8, arg0, aCharArrayArray1);
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("18587, " + arg0 + ", " + -14 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!mb;)V")
	private static void method607(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(2) int local2 = arg0.method503();
			aCharArrayArray2 = new char[local2][];
			method610(arg0, aCharArrayArray2);
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("81565, " + 0 + ", " + arg0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(ILclient!mb;)V")
	private static void method608(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			anIntArray250 = new int[arg1.method503()];
			@Pc(9) int local9;
			if (arg0 != 0) {
				for (local9 = 1; local9 > 0; local9++) {
				}
			}
			for (local9 = 0; local9 < anIntArray250.length; local9++) {
				anIntArray250[local9] = arg1.method500();
			}
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("58052, " + arg0 + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([[[BLclient!mb;[[CB)V")
	private static void method609(@OriginalArg(0) byte[][][] arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) char[][] arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < arg2.length; local3++) {
				@Pc(9) char[] local9 = new char[arg1.method498()];
				for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
					local9[local11] = (char) arg1.method498();
				}
				arg2[local3] = local9;
				@Pc(33) byte[][] local33 = new byte[arg1.method498()][2];
				for (@Pc(35) int local35 = 0; local35 < local33.length; local35++) {
					local33[local35][0] = (byte) arg1.method498();
					local33[local35][1] = (byte) arg1.method498();
				}
				if (local33.length > 0) {
					arg0[local3] = local33;
				}
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("65626, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 84 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!mb;[[CI)V")
	private static void method610(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) char[][] arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
				@Pc(9) char[] local9 = new char[arg0.method498()];
				for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
					local9[local11] = (char) arg0.method498();
				}
				arg1[local3] = local9;
			}
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("54038, " + arg0 + ", " + arg1 + ", " + -41095 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CZ)V")
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
			for (@Pc(47) int local47 = local3; local47 < arg0.length; local47++) {
				arg0[local47] = ' ';
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("23305, " + arg0 + ", " + true + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IC)Z")
	private static boolean method612(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= ' ' && arg0 <= '\u007f' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("30147, " + 658 + ", " + arg0 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method613(@OriginalArg(1) String arg0) {
		try {
			@Pc(3) long local3 = System.currentTimeMillis();
			@Pc(6) char[] local6 = arg0.toCharArray();
			method611(local6);
			@Pc(24) String local24 = (new String(local6)).trim();
			@Pc(28) char[] local28 = local24.toLowerCase().toCharArray();
			@Pc(31) String local31 = local24.toLowerCase();
			method621(local28);
			method616(local28, (byte) 1);
			method617(local28);
			method630(local28);
			for (@Pc(45) int local45 = 0; local45 < aStringArray12.length; local45++) {
				@Pc(55) int local55 = -1;
				while ((local55 = local31.indexOf(aStringArray12[local45], local55 + 1)) != -1) {
					@Pc(62) char[] local62 = aStringArray12[local45].toCharArray();
					for (@Pc(64) int local64 = 0; local64 < local62.length; local64++) {
						local28[local64 + local55] = local62[local64];
					}
				}
			}
			method614(local28, anInt950, local24.toCharArray());
			method615(local28);
			@Pc(106) long local106 = System.currentTimeMillis();
			return (new String(local28)).trim();
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("5862, " + -39648 + ", " + arg0 + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CI[C)V")
	private static void method614(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) char[] arg2) {
		try {
			@Pc(9) int local9;
			if (arg1 < anInt950 || arg1 > anInt950) {
				for (local9 = 1; local9 > 0; local9++) {
				}
			}
			for (local9 = 0; local9 < arg2.length; local9++) {
				if (arg0[local9] != '*' && method638(arg2[local9])) {
					arg0[local9] = arg2[local9];
				}
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("35443, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CI)V")
	private static void method615(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				@Pc(11) char local11 = arg0[local5];
				if (!method635(local11)) {
					local3 = true;
				} else if (local3) {
					if (method637(local11)) {
						local3 = false;
					}
				} else if (method638(local11)) {
					arg0[local5] = (char) (local11 + 'a' - 65);
				}
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("21093, " + arg0 + ", " + 22829 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CB)V")
	private static void method616(@OriginalArg(0) char[] arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(6) boolean local6 = false;
			for (@Pc(11) int local11 = 0; local11 < 2; local11++) {
				for (@Pc(18) int local18 = aCharArrayArray1.length - 1; local18 >= 0; local18--) {
					method625(aByteArrayArrayArray8[local18], aCharArrayArray1[local18], arg0);
				}
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("6115, " + arg0 + ", " + arg1 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "([CI)V")
	private static void method617(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(27) char[] local27 = new char[] { '(', 'a', ')' };
			method625(null, local27, local3);
			@Pc(36) char[] local36 = (char[]) arg0.clone();
			@Pc(51) char[] local51 = new char[] { 'd', 'o', 't' };
			method625(null, local51, local36);
			for (@Pc(61) int local61 = aCharArrayArray2.length - 1; local61 >= 0; local61--) {
				method618(local3, (byte) 7, arg0, local36, aCharArrayArray2[local61]);
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("22993, " + arg0 + ", " + 388 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CB[C[C[C)V")
	private static void method618(@OriginalArg(0) char[] arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) char[] arg3, @OriginalArg(4) char[] arg4) {
		try {
			if (arg4.length <= arg2.length) {
				if (aByte62 == 7) {
					@Pc(14) boolean local14 = false;
				}
				@Pc(32) int local32;
				for (@Pc(24) int local24 = 0; local24 <= arg2.length - arg4.length; local24 += local32) {
					@Pc(28) int local28 = local24;
					@Pc(30) int local30 = 0;
					local32 = 1;
					label62: while (true) {
						while (true) {
							if (local28 >= arg2.length) {
								break label62;
							}
							@Pc(40) char local40 = arg2[local28];
							@Pc(42) char local42 = 0;
							if (local28 + 1 < arg2.length) {
								local42 = arg2[local28 + 1];
							}
							@Pc(67) int local67;
							if (local30 < arg4.length && (local67 = method627(local42, arg4[local30], local40)) > 0) {
								local28 += local67;
								local30++;
							} else {
								if (local30 == 0) {
									break label62;
								}
								@Pc(88) int local88;
								if ((local88 = method627(local42, arg4[local30 - 1], local40)) > 0) {
									local28 += local88;
									if (local30 == 1) {
										local32++;
									}
								} else {
									if (local30 >= arg4.length || !method633(local40)) {
										break label62;
									}
									local28++;
								}
							}
						}
					}
					if (local30 >= arg4.length) {
						@Pc(119) boolean local119 = false;
						@Pc(125) int local125 = method619(arg2, local24, arg0);
						@Pc(133) int local133 = method620(arg3, arg2, local28 - 1);
						if (local125 > 2 || local133 > 2) {
							local119 = true;
						}
						if (local119) {
							for (@Pc(145) int local145 = local24; local145 < local28; local145++) {
								arg2[local145] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(168) RuntimeException local168) {
			signlink.reporterror("24717, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local168.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CII[C)I")
	private static int method619(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg1 == 0) {
				return 2;
			}
			for (@Pc(9) int local9 = arg1 - 1; local9 >= 0 && method633(arg0[local9]); local9--) {
				if (arg0[local9] == '@') {
					return 3;
				}
			}
			@Pc(29) int local29 = 0;
			for (@Pc(33) int local33 = arg1 - 1; local33 >= 0 && method633(arg2[local33]); local33--) {
				if (arg2[local33] == '*') {
					local29++;
				}
			}
			if (local29 >= 3) {
				return 4;
			} else if (method633(arg0[arg1 - 1])) {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("60203, " + arg0 + ", " + arg1 + ", " + 10090 + ", " + arg2 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CI[CI)I")
	private static int method620(@OriginalArg(0) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 + 1 == arg1.length) {
				return 2;
			}
			@Pc(21) int local21 = arg2 + 1;
			while (true) {
				if (local21 < arg1.length && method633(arg1[local21])) {
					if (arg1[local21] != '.' && arg1[local21] != ',') {
						local21++;
						continue;
					}
					return 3;
				}
				@Pc(48) int local48 = 0;
				for (@Pc(52) int local52 = arg2 + 1; local52 < arg1.length && method633(arg0[local52]); local52++) {
					if (arg0[local52] == '*') {
						local48++;
					}
				}
				if (local48 >= 3) {
					return 4;
				}
				if (method633(arg1[arg2 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("79849, " + arg0 + ", " + -399 + ", " + arg1 + ", " + arg2 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "([CI)V")
	private static void method621(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(18) char[] local18 = new char[] { 'd', 'o', 't' };
			method625(null, local18, local3);
			@Pc(27) char[] local27 = (char[]) arg0.clone();
			@Pc(57) char[] local57 = new char[] { 's', 'l', 'a', 's', 'h' };
			method625(null, local57, local27);
			for (@Pc(64) int local64 = 0; local64 < aCharArrayArray3.length; local64++) {
				method622(local3, arg0, anIntArray251[local64], local27, aCharArrayArray3[local64]);
			}
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("16706, " + arg0 + ", " + 9 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([C[CII[C[C)V")
	private static void method622(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) char[] arg3, @OriginalArg(5) char[] arg4) {
		try {
			if (arg4.length <= arg1.length) {
				@Pc(22) int local22;
				for (@Pc(14) int local14 = 0; local14 <= arg1.length - arg4.length; local14 += local22) {
					@Pc(18) int local18 = local14;
					@Pc(20) int local20 = 0;
					local22 = 1;
					label120: while (true) {
						while (true) {
							if (local18 >= arg1.length) {
								break label120;
							}
							@Pc(30) char local30 = arg1[local18];
							@Pc(32) char local32 = 0;
							if (local18 + 1 < arg1.length) {
								local32 = arg1[local18 + 1];
							}
							@Pc(57) int local57;
							if (local20 < arg4.length && (local57 = method627(local32, arg4[local20], local30)) > 0) {
								local18 += local57;
								local20++;
							} else {
								if (local20 == 0) {
									break label120;
								}
								@Pc(78) int local78;
								if ((local78 = method627(local32, arg4[local20 - 1], local30)) > 0) {
									local18 += local78;
									if (local20 == 1) {
										local22++;
									}
								} else {
									if (local20 >= arg4.length || !method633(local30)) {
										break label120;
									}
									local18++;
								}
							}
						}
					}
					if (local20 >= arg4.length) {
						@Pc(109) boolean local109 = false;
						@Pc(115) int local115 = method623(arg1, local14, arg0);
						@Pc(123) int local123 = method624(arg3, local18 - 1, 619, arg1);
						if (arg2 == 1 && local115 > 0 && local123 > 0) {
							local109 = true;
						}
						if (arg2 == 2 && (local115 > 2 && local123 > 0 || local115 > 0 && local123 > 2)) {
							local109 = true;
						}
						if (arg2 == 3 && local115 > 0 && local123 > 2) {
							local109 = true;
						}
						@Pc(166) boolean local166;
						if (arg2 == 3 && local115 > 2 && local123 > 0) {
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
											if (arg0[local189] != '*') {
												break;
											}
											local173 = local189;
										} else if (arg0[local189] == '*') {
											local173 = local189;
											local185 = true;
										}
									}
								}
								local185 = false;
								for (local189 = local173 - 1; local189 >= 0; local189--) {
									if (local185) {
										if (method633(arg1[local189])) {
											break;
										}
										local173 = local189;
									} else if (!method633(arg1[local189])) {
										local185 = true;
										local173 = local189;
									}
								}
							}
							if (local123 > 2) {
								if (local123 == 4) {
									local185 = false;
									for (local189 = local177 + 1; local189 < arg1.length; local189++) {
										if (local185) {
											if (arg3[local189] != '*') {
												break;
											}
											local177 = local189;
										} else if (arg3[local189] == '*') {
											local177 = local189;
											local185 = true;
										}
									}
								}
								local185 = false;
								for (local189 = local177 + 1; local189 < arg1.length; local189++) {
									if (local185) {
										if (method633(arg1[local189])) {
											break;
										}
										local177 = local189;
									} else if (!method633(arg1[local189])) {
										local185 = true;
										local177 = local189;
									}
								}
							}
							for (@Pc(323) int local323 = local173; local323 <= local177; local323++) {
								arg1[local323] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(346) RuntimeException local346) {
			signlink.reporterror("57239, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local346.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[CI[C)I")
	private static int method623(@OriginalArg(1) char[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg1 == 0) {
				return 2;
			}
			@Pc(9) int local9 = arg1 - 1;
			while (true) {
				if (local9 >= 0 && method633(arg0[local9])) {
					if (arg0[local9] != ',' && arg0[local9] != '.') {
						local9--;
						continue;
					}
					return 3;
				}
				@Pc(34) int local34 = 0;
				for (@Pc(38) int local38 = arg1 - 1; local38 >= 0 && method633(arg2[local38]); local38--) {
					if (arg2[local38] == '*') {
						local34++;
					}
				}
				if (local34 >= 3) {
					return 4;
				}
				if (method633(arg0[arg1 - 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("38562, " + 34700 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "([CII[C)I")
	private static int method624(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) char[] arg3) {
		try {
			if (arg1 + 1 == arg3.length) {
				return 2;
			}
			@Pc(13) int local13 = arg1 + 1;
			while (true) {
				if (local13 < arg3.length && method633(arg3[local13])) {
					if (arg3[local13] != '\\' && arg3[local13] != '/') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(42) boolean local42 = false;
				@Pc(44) int local44 = 0;
				for (@Pc(48) int local48 = arg1 + 1; local48 < arg3.length && method633(arg0[local48]); local48++) {
					if (arg0[local48] == '*') {
						local44++;
					}
				}
				if (local44 >= 5) {
					return 4;
				}
				if (method633(arg3[arg1 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("33025, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([[B[C[CI)V")
	private static void method625(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2) {
		try {
			if (arg1.length <= arg2.length) {
				@Pc(21) int local21;
				for (@Pc(11) int local11 = 0; local11 <= arg2.length - arg1.length; local11 += local21) {
					@Pc(15) int local15 = local11;
					@Pc(17) int local17 = 0;
					@Pc(19) int local19 = 0;
					local21 = 1;
					@Pc(23) boolean local23 = false;
					@Pc(25) boolean local25 = false;
					@Pc(27) boolean local27 = false;
					@Pc(35) char var12;
					@Pc(37) char var13;
					label170: while (true) {
						while (true) {
							if (local15 >= arg2.length || local25 && local27) {
								break label170;
							}
							var12 = arg2[local15];
							var13 = '\u0000';
							if (local15 + 1 < arg2.length) {
								var13 = arg2[local15 + 1];
							}
							@Pc(62) int local62;
							if (local17 < arg1.length && (local62 = method628(var12, var13, arg1[local17])) > 0) {
								if (local62 == 1 && method636(var12)) {
									local25 = true;
								}
								if (local62 == 2 && (method636(var12) || method636(var13))) {
									local25 = true;
								}
								local15 += local62;
								local17++;
							} else {
								if (local17 == 0) {
									break label170;
								}
								@Pc(105) int local105;
								if ((local105 = method628(var12, var13, arg1[local17 - 1])) > 0) {
									local15 += local105;
									if (local17 == 1) {
										local21++;
									}
								} else {
									if (local17 >= arg1.length || !method634(var12)) {
										break label170;
									}
									if (method633(var12) && var12 != '\'') {
										local23 = true;
									}
									if (method636(var12)) {
										local27 = true;
									}
									local15++;
									local19++;
									if (local19 * 100 / (local15 - local11) > 90) {
										break label170;
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
							if (local11 - 1 < 0 || method633(arg2[local11 - 1]) && arg2[local11 - 1] != '\'') {
								local216 = true;
							}
							if (local15 >= arg2.length || method633(arg2[local15]) && arg2[local15] != '\'') {
								local218 = true;
							}
							if (!local216 || !local218) {
								@Pc(262) boolean local262 = false;
								local266 = local11 - 2;
								if (local216) {
									local266 = local11;
								}
								while (!local262 && local266 < local15) {
									if (local266 >= 0 && (!method633(arg2[local266]) || arg2[local266] == '\'')) {
										@Pc(288) char[] local288 = new char[3];
										@Pc(290) int local290;
										for (local290 = 0; local290 < 3 && local266 + local290 < arg2.length && (!method633(arg2[local266 + local290]) || arg2[local266 + local290] == '\''); local290++) {
											local288[local290] = arg2[local266 + local290];
										}
										@Pc(328) boolean local328 = true;
										if (local290 == 0) {
											local328 = false;
										}
										if (local290 < 3 && local266 - 1 >= 0 && (!method633(arg2[local266 - 1]) || arg2[local266 - 1] == '\'')) {
											local328 = false;
										}
										if (local328 && !method639((byte) 6, local288)) {
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
							@Pc(198) byte local198 = method629(var12, aByte63);
							@Pc(202) byte local202 = method629(var13, aByte63);
							if (arg0 != null && method626(arg0, local202, local198)) {
								local170 = false;
							}
						}
						if (local170) {
							@Pc(378) int local378 = 0;
							@Pc(380) int local380 = 0;
							@Pc(382) int local382 = -1;
							for (local266 = local11; local266 < local15; local266++) {
								if (method636(arg2[local266])) {
									local378++;
								} else if (method635(arg2[local266])) {
									local380++;
									local382 = local266;
								}
							}
							if (local382 > -1) {
								local378 -= local15 + 1 - local382;
							}
							if (local378 <= local380) {
								for (@Pc(424) int local424 = local11; local424 < local15; local424++) {
									arg2[local424] = '*';
								}
							}
						}
					}
				}
				if (anInt952 > 6 || anInt952 < 6) {
					anInt950 = 101;
				}
			}
		} catch (@Pc(455) RuntimeException local455) {
			signlink.reporterror("49465, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 6 + ", " + local455.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([[BBBI)Z")
	private static boolean method626(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2) {
		try {
			@Pc(1) int local1 = 0;
			if (arg0[0][0] == arg2 && arg0[0][1] == arg1) {
				return true;
			}
			@Pc(30) int local30 = arg0.length - 1;
			if (arg0[local30][0] == arg2 && arg0[local30][1] == arg1) {
				return true;
			}
			do {
				@Pc(52) int local52 = (local1 + local30) / 2;
				if (arg0[local52][0] == arg2 && arg0[local52][1] == arg1) {
					return true;
				}
				if (arg2 < arg0[local52][0] || arg2 == arg0[local52][0] && arg1 < arg0[local52][1]) {
					local30 = local52;
				} else {
					local1 = local52;
				}
			} while (local1 != local30 && local1 + 1 != local30);
			return false;
		} catch (@Pc(106) RuntimeException local106) {
			signlink.reporterror("99429, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local106.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(CCCI)I")
	private static int method627(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(2) char arg2) {
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
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("20435, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -535 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(CZCC)I")
	private static int method628(@OriginalArg(0) char arg0, @OriginalArg(2) char arg1, @OriginalArg(3) char arg2) {
		try {
			if (arg2 == arg0) {
				return 1;
			}
			if (arg2 >= 'a' && arg2 <= 'm') {
				if (arg2 == 'a') {
					if (arg0 != '4' && arg0 != '@' && arg0 != '^') {
						if (arg0 == '/' && arg1 == '\\') {
							return 2;
						}
						return 0;
					}
					return 1;
				}
				if (arg2 == 'b') {
					if (arg0 != '6' && arg0 != '8') {
						if ((arg0 != '1' || arg1 != '3') && (arg0 != 'i' || arg1 != '3')) {
							return 0;
						}
						return 2;
					}
					return 1;
				}
				if (arg2 == 'c') {
					if (arg0 != '(' && arg0 != '<' && arg0 != '{' && arg0 != '[') {
						return 0;
					}
					return 1;
				}
				if (arg2 == 'd') {
					if ((arg0 != '[' || arg1 != ')') && (arg0 != 'i' || arg1 != ')')) {
						return 0;
					}
					return 2;
				}
				if (arg2 == 'e') {
					if (arg0 != '3' && arg0 != '€') {
						return 0;
					}
					return 1;
				}
				if (arg2 == 'f') {
					if (arg0 == 'p' && arg1 == 'h') {
						return 2;
					}
					if (arg0 == '£') {
						return 1;
					}
					return 0;
				}
				if (arg2 == 'g') {
					if (arg0 != '9' && arg0 != '6' && arg0 != 'q') {
						return 0;
					}
					return 1;
				}
				if (arg2 == 'h') {
					if (arg0 == '#') {
						return 1;
					}
					return 0;
				}
				if (arg2 == 'i') {
					if (arg0 != 'y' && arg0 != 'l' && arg0 != 'j' && arg0 != '1' && arg0 != '!' && arg0 != ':' && arg0 != ';' && arg0 != '|') {
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
					if (arg0 != '1' && arg0 != '|' && arg0 != 'i') {
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
					if (arg0 != '0' && arg0 != '*') {
						if ((arg0 != '(' || arg1 != ')') && (arg0 != '[' || arg1 != ']') && (arg0 != '{' || arg1 != '}') && (arg0 != '<' || arg1 != '>')) {
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
					if (arg0 != '5' && arg0 != 'z' && arg0 != '$' && arg0 != '2') {
						return 0;
					}
					return 1;
				}
				if (arg2 == 't') {
					if (arg0 != '7' && arg0 != '+') {
						return 0;
					}
					return 1;
				}
				if (arg2 == 'u') {
					if (arg0 == 'v') {
						return 1;
					}
					if ((arg0 != '\\' || arg1 != '/') && (arg0 != '\\' || arg1 != '|') && (arg0 != '|' || arg1 != '/')) {
						return 0;
					}
					return 2;
				}
				if (arg2 == 'v') {
					if ((arg0 != '\\' || arg1 != '/') && (arg0 != '\\' || arg1 != '|') && (arg0 != '|' || arg1 != '/')) {
						return 0;
					}
					return 2;
				}
				if (arg2 == 'w') {
					if (arg0 == 'v' && arg1 == 'v') {
						return 2;
					}
					return 0;
				}
				if (arg2 == 'x') {
					if ((arg0 != ')' || arg1 != '(') && (arg0 != '}' || arg1 != '{') && (arg0 != ']' || arg1 != '[') && (arg0 != '>' || arg1 != '<')) {
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
					if (arg0 == 'o' || arg0 == 'O') {
						return 1;
					} else if ((arg0 != '(' || arg1 != ')') && (arg0 != '{' || arg1 != '}') && (arg0 != '[' || arg1 != ']')) {
						return 0;
					} else {
						return 2;
					}
				} else if (arg2 == '1') {
					return arg0 == 'l' ? 1 : 0;
				} else {
					return 0;
				}
			} else if (arg2 == ',') {
				return arg0 == '.' ? 1 : 0;
			} else if (arg2 == '.') {
				return arg0 == ',' ? 1 : 0;
			} else if (arg2 == '!') {
				return arg0 == 'i' ? 1 : 0;
			} else {
				return 0;
			}
		} catch (@Pc(512) RuntimeException local512) {
			signlink.reporterror("43632, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + local512.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(CB)B")
	private static byte method629(@OriginalArg(0) char arg0, @OriginalArg(1) byte arg1) {
		try {
			if (arg1 != aByte63) {
				anInt950 = -80;
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
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("88165, " + arg0 + ", " + arg1 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "([CB)V")
	private static void method630(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			@Pc(9) int local9 = 0;
			while (true) {
				do {
					@Pc(113) int local113;
					if ((local113 = method631(local5, arg0)) == -1) {
						return;
					}
					@Pc(18) boolean local18 = false;
					for (@Pc(20) int local20 = local5; local20 >= 0 && local20 < local113 && !local18; local20++) {
						if (!method633(arg0[local20]) && !method634(arg0[local20])) {
							local18 = true;
						}
					}
					if (local18) {
						local7 = 0;
					}
					if (local7 == 0) {
						local9 = local113;
					}
					local5 = method632(local113, arg0);
					@Pc(59) int local59 = 0;
					for (@Pc(61) int local61 = local113; local61 < local5; local61++) {
						local59 = local59 * 10 + arg0[local61] - 48;
					}
					if (local59 <= 255 && local5 - local113 <= 8) {
						local7++;
					} else {
						local7 = 0;
					}
				} while (local7 != 4);
				for (@Pc(95) int local95 = local9; local95 < local5; local95++) {
					arg0[local95] = '*';
				}
				local7 = 0;
			}
		} catch (@Pc(117) RuntimeException local117) {
			signlink.reporterror("30740, " + arg0 + ", " + 125 + ", " + local117.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[CB)I")
	private static int method631(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1) {
		try {
			for (@Pc(6) int local6 = arg0; local6 < arg1.length && local6 >= 0; local6++) {
				if (arg1[local6] >= '0' && arg1[local6] <= '9') {
					return local6;
				}
			}
			return -1;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("20892, " + arg0 + ", " + arg1 + ", " + 104 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[CI)I")
	private static int method632(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1) {
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
			signlink.reporterror("73696, " + arg0 + ", " + arg1 + ", " + -34211 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(IC)Z")
	private static boolean method633(@OriginalArg(1) char arg0) {
		try {
			return !method635(arg0) && !method636(arg0);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("65862, " + -797 + ", " + arg0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(IC)Z")
	private static boolean method634(@OriginalArg(1) char arg0) {
		try {
			if (arg0 >= 'a' && arg0 <= 'z') {
				return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
			} else {
				return true;
			}
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("60817, " + 5 + ", " + arg0 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZC)Z")
	private static boolean method635(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("49170, " + false + ", " + arg0 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "(IC)Z")
	private static boolean method636(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= '0' && arg0 <= '9';
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("79384, " + 34895 + ", " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(CB)Z")
	private static boolean method637(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z';
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("12187, " + arg0 + ", " + 75 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "(IC)Z")
	private static boolean method638(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("74762, " + 0 + ", " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(B[C)Z")
	private static boolean method639(@OriginalArg(0) byte arg0, @OriginalArg(1) char[] arg1) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < arg1.length; local5++) {
				if (!method636(arg1[local5]) && arg1[local5] != '\u0000') {
					local3 = false;
				}
			}
			@Pc(29) boolean local29 = false;
			if (local3) {
				return true;
			}
			@Pc(43) int local43 = method640(arg1);
			@Pc(45) int local45 = 0;
			@Pc(50) int local50 = anIntArray250.length - 1;
			if (local43 == anIntArray250[0] || local43 == anIntArray250[local50]) {
				return true;
			}
			do {
				@Pc(68) int local68 = (local45 + local50) / 2;
				if (local43 == anIntArray250[local68]) {
					return true;
				}
				if (local43 < anIntArray250[local68]) {
					local50 = local68;
				} else {
					local45 = local68;
				}
			} while (local45 != local50 && local45 + 1 != local50);
			return false;
		} catch (@Pc(97) RuntimeException local97) {
			signlink.reporterror("54926, " + arg0 + ", " + arg1 + ", " + local97.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[C)I")
	private static int method640(@OriginalArg(1) char[] arg0) {
		try {
			if (arg0.length > 6) {
				return 0;
			}
			@Pc(9) int local9 = 0;
			for (@Pc(15) int local15 = 0; local15 < arg0.length; local15++) {
				@Pc(26) char local26 = arg0[arg0.length - local15 - 1];
				if (local26 >= 'a' && local26 <= 'z') {
					local9 = local9 * 38 + local26 + 1 - 'a';
				} else if (local26 == '\'') {
					local9 = local9 * 38 + 27;
				} else if (local26 >= '0' && local26 <= '9') {
					local9 = local9 * 38 + local26 + 28 - '0';
				} else if (local26 != '\u0000') {
					return 0;
				}
			}
			return local9;
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("55203, " + -287 + ", " + arg0 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}
}
