import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!sc")
public final class Class41 {

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "Z")
	private static boolean aBoolean246;

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "B")
	private static byte aByte36;

	@OriginalMember(owner = "client!sc", name = "i", descriptor = "B")
	private static byte aByte37;

	@OriginalMember(owner = "client!sc", name = "l", descriptor = "[I")
	private static int[] anIntArray250;

	@OriginalMember(owner = "client!sc", name = "m", descriptor = "[[C")
	private static char[][] aCharArrayArray1;

	@OriginalMember(owner = "client!sc", name = "n", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!sc", name = "o", descriptor = "[[C")
	private static char[][] aCharArrayArray2;

	@OriginalMember(owner = "client!sc", name = "p", descriptor = "[[C")
	private static char[][] aCharArrayArray3;

	@OriginalMember(owner = "client!sc", name = "q", descriptor = "[I")
	private static int[] anIntArray251;

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "Z")
	private static boolean aBoolean245;

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
	private static int anInt917;

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
	private static int anInt918;

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "Z")
	private static boolean aBoolean247;

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "Z")
	private static boolean aBoolean248;

	@OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
	private static int anInt919;

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
	private static int anInt920;

	@OriginalMember(owner = "client!sc", name = "r", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray13;

	static {
		aBoolean244 = true;
		aBoolean245 = true;
		anInt917 = 940;
		anInt918 = 901;
		aBoolean247 = true;
		aBoolean248 = true;
		anInt919 = -475;
		anInt920 = 3;
		aStringArray13 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq" };
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!yb;)V")
	public static void method603(@OriginalArg(0) Class48 arg0) {
		@Pc(10) Class1_Sub1_Sub3 local10 = new Class1_Sub1_Sub3(16, arg0.method678("fragmentsenc.txt", null));
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(16, arg0.method678("badenc.txt", null));
		@Pc(28) Class1_Sub1_Sub3 local28 = new Class1_Sub1_Sub3(16, arg0.method678("domainenc.txt", null));
		@Pc(37) Class1_Sub1_Sub3 local37 = new Class1_Sub1_Sub3(16, arg0.method678("tldlist.txt", null));
		method604(local10, local19, local28, local37);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!mb;Lclient!mb;Lclient!mb;Lclient!mb;)V")
	private static void method604(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) Class1_Sub1_Sub3 arg2, @OriginalArg(3) Class1_Sub1_Sub3 arg3) {
		method606(arg1);
		method607((byte) 8, arg2);
		method608(anInt918, arg0);
		method605(arg3);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!mb;)V")
	private static void method605(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(4) int local4 = arg0.method503();
			aCharArrayArray3 = new char[local4][];
			anIntArray251 = new int[local4];
			for (@Pc(12) int local12 = 0; local12 < local4; local12++) {
				anIntArray251[local12] = arg0.method498();
				@Pc(23) char[] local23 = new char[arg0.method498()];
				for (@Pc(25) int local25 = 0; local25 < local23.length; local25++) {
					local23[local25] = (char) arg0.method498();
				}
				aCharArrayArray3[local12] = local23;
			}
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("30372, " + 0 + ", " + arg0 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!mb;I)V")
	private static void method606(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(6) int local6 = arg0.method503();
			aCharArrayArray1 = new char[local6][];
			aByteArrayArrayArray8 = new byte[local6][][];
			method609(aByteArrayArrayArray8, arg0, aCharArrayArray1);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("40165, " + arg0 + ", " + 29365 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BLclient!mb;)V")
	private static void method607(@OriginalArg(0) byte arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			@Pc(4) boolean local4 = false;
			@Pc(15) int local15 = arg1.method503();
			aCharArrayArray2 = new char[local15][];
			method610(aCharArrayArray2, arg1, aBoolean246);
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("4342, " + arg0 + ", " + arg1 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(ILclient!mb;)V")
	private static void method608(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			anIntArray250 = new int[arg1.method503()];
			for (@Pc(5) int local5 = 0; local5 < anIntArray250.length; local5++) {
				anIntArray250[local5] = arg1.method500();
			}
			@Pc(21) int local21 = 16 / arg0;
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("33651, " + arg0 + ", " + arg1 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([[[BLclient!mb;I[[C)V")
	private static void method609(@OriginalArg(0) byte[][][] arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(3) char[][] arg2) {
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
			signlink.reporterror("37479, " + arg0 + ", " + arg1 + ", " + 7 + ", " + arg2 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([[CLclient!mb;Z)V")
	private static void method610(@OriginalArg(0) char[][] arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) boolean arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
				@Pc(9) char[] local9 = new char[arg1.method498()];
				for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
					local9[local11] = (char) arg1.method498();
				}
				arg0[local3] = local9;
			}
			if (arg2) {
				aBoolean246 = !aBoolean246;
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("65230, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CI)V")
	private static void method611(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(5) boolean local5 = false;
			@Pc(7) int local7 = 0;
			for (@Pc(9) int local9 = 0; local9 < arg0.length; local9++) {
				if (method612(arg0[local9])) {
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
			signlink.reporterror("16941, " + arg0 + ", " + arg1 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(CZ)Z")
	private static boolean method612(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= ' ' && arg0 <= '\u007f' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("87033, " + arg0 + ", " + false + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
	public static String method613(@OriginalArg(0) String arg0) {
		try {
			@Pc(3) long local3 = System.currentTimeMillis();
			@Pc(6) char[] local6 = arg0.toCharArray();
			method611(local6, 106);
			@Pc(15) String local15 = (new String(local6)).trim();
			@Pc(19) char[] local19 = local15.toLowerCase().toCharArray();
			@Pc(22) String local22 = local15.toLowerCase();
			method621(local19);
			method616(local19);
			method617(local19);
			method630(local19, (byte) 7);
			for (@Pc(40) int local40 = 0; local40 < aStringArray13.length; local40++) {
				@Pc(50) int local50 = -1;
				while ((local50 = local22.indexOf(aStringArray13[local40], local50 + 1)) != -1) {
					@Pc(57) char[] local57 = aStringArray13[local40].toCharArray();
					for (@Pc(59) int local59 = 0; local59 < local57.length; local59++) {
						local19[local59 + local50] = local57[local59];
					}
				}
			}
			method614(local19, local15.toCharArray());
			method615(local19, 987);
			@Pc(101) long local101 = System.currentTimeMillis();
			return (new String(local19)).trim();
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("98939, " + arg0 + ", " + false + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[C[C)V")
	private static void method614(@OriginalArg(1) char[] arg0, @OriginalArg(2) char[] arg1) {
		try {
			for (@Pc(4) int local4 = 0; local4 < arg1.length; local4++) {
				if (arg0[local4] != '*' && method638(arg1[local4], anInt919)) {
					arg0[local4] = arg1[local4];
				}
			}
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("13132, " + -963 + ", " + arg0 + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "([CI)V")
	private static void method615(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = true;
			@Pc(7) boolean local7 = false;
			for (@Pc(9) int local9 = 0; local9 < arg0.length; local9++) {
				@Pc(15) char local15 = arg0[local9];
				if (!method635(local15)) {
					local3 = true;
				} else if (local3) {
					if (method637(local15)) {
						local3 = false;
					}
				} else if (method638(local15, anInt919)) {
					arg0[local9] = (char) (local15 + 'a' - 65);
				}
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("78872, " + arg0 + ", " + arg1 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[C)V")
	private static void method616(@OriginalArg(1) char[] arg0) {
		try {
			for (@Pc(10) int local10 = 0; local10 < 2; local10++) {
				for (@Pc(17) int local17 = aCharArrayArray1.length - 1; local17 >= 0; local17--) {
					method625(aBoolean247, aByteArrayArrayArray8[local17], arg0, aCharArrayArray1[local17]);
				}
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("43308, " + 2 + ", " + arg0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "([CI)V")
	private static void method617(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(18) char[] local18 = new char[] { '(', 'a', ')' };
			method625(aBoolean247, null, local3, local18);
			@Pc(27) char[] local27 = (char[]) arg0.clone();
			@Pc(42) char[] local42 = new char[] { 'd', 'o', 't' };
			method625(aBoolean247, null, local27, local42);
			for (@Pc(52) int local52 = aCharArrayArray2.length - 1; local52 >= 0; local52--) {
				method618(local3, local27, aCharArrayArray2[local52], arg0);
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("94994, " + arg0 + ", " + 0 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CI[C[C[C)V")
	private static void method618(@OriginalArg(0) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2, @OriginalArg(4) char[] arg3) {
		try {
			if (arg2.length <= arg3.length) {
				@Pc(19) int local19;
				for (@Pc(11) int local11 = 0; local11 <= arg3.length - arg2.length; local11 += local19) {
					@Pc(15) int local15 = local11;
					@Pc(17) int local17 = 0;
					local19 = 1;
					label59: while (true) {
						while (true) {
							if (local15 >= arg3.length) {
								break label59;
							}
							@Pc(27) char local27 = arg3[local15];
							@Pc(29) char local29 = 0;
							if (local15 + 1 < arg3.length) {
								local29 = arg3[local15 + 1];
							}
							@Pc(54) int local54;
							if (local17 < arg2.length && (local54 = method627(local29, local27, arg2[local17])) > 0) {
								local15 += local54;
								local17++;
							} else {
								if (local17 == 0) {
									break label59;
								}
								@Pc(75) int local75;
								if ((local75 = method627(local29, local27, arg2[local17 - 1])) > 0) {
									local15 += local75;
									if (local17 == 1) {
										local19++;
									}
								} else {
									if (local17 >= arg2.length || !method633(local27)) {
										break label59;
									}
									local15++;
								}
							}
						}
					}
					if (local17 >= arg2.length) {
						@Pc(106) boolean local106 = false;
						@Pc(112) int local112 = method619(arg3, local11, arg0);
						@Pc(120) int local120 = method620(arg1, arg3, local15 - 1);
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
			}
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("34162, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CZI[C)I")
	private static int method619(@OriginalArg(0) char[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) char[] arg2) {
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
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("263, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([C[CII)I")
	private static int method620(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg2 + 1 == arg1.length) {
				return 2;
			}
			@Pc(13) int local13 = arg2 + 1;
			while (true) {
				if (local13 < arg1.length && method633(arg1[local13])) {
					if (arg1[local13] != '.' && arg1[local13] != ',') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(40) int local40 = 0;
				for (@Pc(48) int local48 = arg2 + 1; local48 < arg1.length && method633(arg0[local48]); local48++) {
					if (arg0[local48] == '*') {
						local40++;
					}
				}
				if (local40 >= 3) {
					return 4;
				}
				if (method633(arg1[arg2 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("32090, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(I[C)V")
	private static void method621(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(18) char[] local18 = new char[] { 'd', 'o', 't' };
			method625(aBoolean247, null, local3, local18);
			@Pc(27) char[] local27 = (char[]) arg0.clone();
			@Pc(50) char[] local50 = new char[] { 's', 'l', 'a', 's', 'h' };
			method625(aBoolean247, null, local27, local50);
			for (@Pc(61) int local61 = 0; local61 < aCharArrayArray3.length; local61++) {
				method622(arg0, aCharArrayArray3[local61], local3, anIntArray251[local61], local27);
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("11394, " + 31155 + ", " + arg0 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([C[C[CIB[C)V")
	private static void method622(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) char[] arg4) {
		try {
			if (arg1.length <= arg0.length) {
				@Pc(19) int local19;
				for (@Pc(11) int local11 = 0; local11 <= arg0.length - arg1.length; local11 += local19) {
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
							if (local17 < arg1.length && (local54 = method627(local29, local27, arg1[local17])) > 0) {
								local15 += local54;
								local17++;
							} else {
								if (local17 == 0) {
									break label121;
								}
								@Pc(75) int local75;
								if ((local75 = method627(local29, local27, arg1[local17 - 1])) > 0) {
									local15 += local75;
									if (local17 == 1) {
										local19++;
									}
								} else {
									if (local17 >= arg1.length || !method633(local27)) {
										break label121;
									}
									local15++;
								}
							}
						}
					}
					if (local17 >= arg1.length) {
						@Pc(106) boolean local106 = false;
						@Pc(112) int local112 = method623(arg2, local11, arg0);
						@Pc(120) int local120 = method624(local15 - 1, arg0, arg4);
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
											if (arg4[local186] != '*') {
												break;
											}
											local174 = local186;
										} else if (arg4[local186] == '*') {
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
		} catch (@Pc(348) RuntimeException local348) {
			signlink.reporterror("51173, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 10 + ", " + arg4 + ", " + local348.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CI[CI)I")
	private static int method623(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) char[] arg2) {
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
				@Pc(39) int local39 = 0;
				for (@Pc(43) int local43 = arg1 - 1; local43 >= 0 && method633(arg0[local43]); local43--) {
					if (arg0[local43] == '*') {
						local39++;
					}
				}
				if (local39 >= 3) {
					return 4;
				}
				if (method633(arg2[arg1 - 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("31769, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 1 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[CI[C)I")
	private static int method624(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg0 + 1 == arg1.length) {
				return 2;
			}
			@Pc(17) int local17 = arg0 + 1;
			while (true) {
				if (local17 < arg1.length && method633(arg1[local17])) {
					if (arg1[local17] != '\\' && arg1[local17] != '/') {
						local17++;
						continue;
					}
					return 3;
				}
				@Pc(44) int local44 = 0;
				for (@Pc(48) int local48 = arg0 + 1; local48 < arg1.length && method633(arg2[local48]); local48++) {
					if (arg2[local48] == '*') {
						local44++;
					}
				}
				if (local44 >= 5) {
					return 4;
				}
				if (method633(arg1[arg0 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("86325, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z[[B[C[C)V")
	private static void method625(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) char[] arg3) {
		try {
			if (arg3.length <= arg2.length) {
				if (!arg0) {
					aBoolean244 = true;
				}
				@Pc(29) int local29;
				for (@Pc(19) int local19 = 0; local19 <= arg2.length - arg3.length; local19 += local29) {
					@Pc(23) int local23 = local19;
					@Pc(25) int local25 = 0;
					@Pc(27) int local27 = 0;
					local29 = 1;
					@Pc(31) boolean local31 = false;
					@Pc(33) boolean local33 = false;
					@Pc(35) boolean local35 = false;
					@Pc(43) char var13;
					@Pc(45) char var14;
					label166: while (true) {
						while (true) {
							if (local23 >= arg2.length || local33 && local35) {
								break label166;
							}
							var13 = arg2[local23];
							var14 = '\u0000';
							if (local23 + 1 < arg2.length) {
								var14 = arg2[local23 + 1];
							}
							@Pc(70) int local70;
							if (local25 < arg3.length && (local70 = method628(var14, arg3[local25], var13)) > 0) {
								if (local70 == 1 && method636(var13)) {
									local33 = true;
								}
								if (local70 == 2 && (method636(var13) || method636(var14))) {
									local33 = true;
								}
								local23 += local70;
								local25++;
							} else {
								if (local25 == 0) {
									break label166;
								}
								@Pc(113) int local113;
								if ((local113 = method628(var14, arg3[local25 - 1], var13)) > 0) {
									local23 += local113;
									if (local25 == 1) {
										local29++;
									}
								} else {
									if (local25 >= arg3.length || !method634(var13)) {
										break label166;
									}
									if (method633(var13) && var13 != '\'') {
										local31 = true;
									}
									if (method636(var13)) {
										local35 = true;
									}
									local23++;
									local27++;
									if (local27 * 100 / (local23 - local19) > 90) {
										break label166;
									}
								}
							}
						}
					}
					if (local25 >= arg3.length && (!local33 || !local35)) {
						@Pc(178) boolean local178 = true;
						@Pc(274) int local274;
						if (local31) {
							@Pc(224) boolean local224 = false;
							@Pc(226) boolean local226 = false;
							if (local19 - 1 < 0 || method633(arg2[local19 - 1]) && arg2[local19 - 1] != '\'') {
								local224 = true;
							}
							if (local23 >= arg2.length || method633(arg2[local23]) && arg2[local23] != '\'') {
								local226 = true;
							}
							if (!local224 || !local226) {
								@Pc(270) boolean local270 = false;
								local274 = local19 - 2;
								if (local224) {
									local274 = local19;
								}
								while (!local270 && local274 < local23) {
									if (local274 >= 0 && (!method633(arg2[local274]) || arg2[local274] == '\'')) {
										@Pc(296) char[] local296 = new char[3];
										@Pc(298) int local298;
										for (local298 = 0; local298 < 3 && local274 + local298 < arg2.length && (!method633(arg2[local274 + local298]) || arg2[local274 + local298] == '\''); local298++) {
											local296[local298] = arg2[local274 + local298];
										}
										@Pc(336) boolean local336 = true;
										if (local298 == 0) {
											local336 = false;
										}
										if (local298 < 3 && local274 - 1 >= 0 && (!method633(arg2[local274 - 1]) || arg2[local274 - 1] == '\'')) {
											local336 = false;
										}
										if (local336 && !method639(local296)) {
											local270 = true;
										}
									}
									local274++;
								}
								if (!local270) {
									local178 = false;
								}
							}
						} else {
							var13 = ' ';
							if (local19 - 1 >= 0) {
								var13 = arg2[local19 - 1];
							}
							var14 = ' ';
							if (local23 < arg2.length) {
								var14 = arg2[local23];
							}
							@Pc(206) byte local206 = method629(var13);
							@Pc(210) byte local210 = method629(var14);
							if (arg1 != null && method626(local206, aByte36, local210, arg1)) {
								local178 = false;
							}
						}
						if (local178) {
							@Pc(386) int local386 = 0;
							@Pc(388) int local388 = 0;
							@Pc(390) int local390 = -1;
							for (local274 = local19; local274 < local23; local274++) {
								if (method636(arg2[local274])) {
									local386++;
								} else if (method635(arg2[local274])) {
									local388++;
									local390 = local274;
								}
							}
							if (local390 > -1) {
								local386 -= local23 + 1 - local390;
							}
							if (local386 <= local388) {
								for (@Pc(432) int local432 = local19; local432 < local23; local432++) {
									arg2[local432] = '*';
								}
							}
						}
					}
				}
			}
		} catch (@Pc(455) RuntimeException local455) {
			signlink.reporterror("95457, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local455.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BBB[[B)Z")
	private static boolean method626(@OriginalArg(0) byte arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) byte[][] arg3) {
		try {
			@Pc(3) int local3 = 0;
			if (arg1 != aByte37) {
				throw new NullPointerException();
			}
			@Pc(8) boolean local8 = false;
			if (arg3[0][0] == arg0 && arg3[0][1] == arg2) {
				return true;
			}
			@Pc(35) int local35 = arg3.length - 1;
			if (arg3[local35][0] == arg0 && arg3[local35][1] == arg2) {
				return true;
			}
			do {
				@Pc(57) int local57 = (local3 + local35) / 2;
				if (arg3[local57][0] == arg0 && arg3[local57][1] == arg2) {
					return true;
				}
				if (arg0 < arg3[local57][0] || arg0 == arg3[local57][0] && arg2 < arg3[local57][1]) {
					local35 = local57;
				} else {
					local3 = local57;
				}
			} while (local3 != local35 && local3 + 1 != local35);
			return false;
		} catch (@Pc(111) RuntimeException local111) {
			signlink.reporterror("54137, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local111.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(CCIC)I")
	private static int method627(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(3) char arg2) {
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
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("83307, " + arg0 + ", " + arg1 + ", " + 20062 + ", " + arg2 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(CICC)I")
	private static int method628(@OriginalArg(0) char arg0, @OriginalArg(2) char arg1, @OriginalArg(3) char arg2) {
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
			signlink.reporterror("74018, " + arg0 + ", " + -48874 + ", " + arg1 + ", " + arg2 + ", " + local513.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(CI)B")
	private static byte method629(@OriginalArg(0) char arg0) {
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
			signlink.reporterror("26427, " + arg0 + ", " + 597 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CB)V")
	private static void method630(@OriginalArg(0) char[] arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(5) int local5 = 0;
			@Pc(10) boolean local10 = false;
			@Pc(21) int local21 = 0;
			@Pc(23) int local23 = 0;
			while (true) {
				do {
					@Pc(122) int local122;
					if ((local122 = method631(arg0, local5)) == -1) {
						return;
					}
					@Pc(27) boolean local27 = false;
					for (@Pc(29) int local29 = local5; local29 >= 0 && local29 < local122 && !local27; local29++) {
						if (!method633(arg0[local29]) && !method634(arg0[local29])) {
							local27 = true;
						}
					}
					if (local27) {
						local21 = 0;
					}
					if (local21 == 0) {
						local23 = local122;
					}
					local5 = method632(arg0, local122);
					@Pc(68) int local68 = 0;
					for (@Pc(70) int local70 = local122; local70 < local5; local70++) {
						local68 = local68 * 10 + arg0[local70] - 48;
					}
					if (local68 <= 255 && local5 - local122 <= 8) {
						local21++;
					} else {
						local21 = 0;
					}
				} while (local21 != 4);
				for (@Pc(104) int local104 = local23; local104 < local5; local104++) {
					arg0[local104] = '*';
				}
				local21 = 0;
			}
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("83613, " + arg0 + ", " + arg1 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CIZ)I")
	private static int method631(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1) {
		try {
			for (@Pc(5) int local5 = arg1; local5 < arg0.length && local5 >= 0; local5++) {
				if (arg0[local5] >= '0' && arg0[local5] <= '9') {
					return local5;
				}
			}
			return -1;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("91492, " + arg0 + ", " + arg1 + ", " + true + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CZI)I")
	private static int method632(@OriginalArg(0) char[] arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(5) int local5 = arg1;
			while (true) {
				if (local5 < arg0.length && local5 >= 0) {
					if (arg0[local5] >= '0' && arg0[local5] <= '9') {
						local5++;
						continue;
					}
					return local5;
				}
				return arg0.length;
			}
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("21221, " + arg0 + ", " + true + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IC)Z")
	private static boolean method633(@OriginalArg(1) char arg0) {
		try {
			return !method635(arg0) && !method636(arg0);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("73582, " + 0 + ", " + arg0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(IC)Z")
	private static boolean method634(@OriginalArg(1) char arg0) {
		try {
			if (arg0 >= 'a' && arg0 <= 'z') {
				return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
			} else {
				return true;
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("60397, " + -580 + ", " + arg0 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(IC)Z")
	private static boolean method635(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("49860, " + 4 + ", " + arg0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(CI)Z")
	private static boolean method636(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= '0' && arg0 <= '9';
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("84993, " + arg0 + ", " + -662 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "(IC)Z")
	private static boolean method637(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z';
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("76516, " + 3 + ", " + arg0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(CI)Z")
	private static boolean method638(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		try {
			while (arg1 >= 0) {
				anInt918 = -243;
			}
			if (arg0 >= 'A' && arg0 <= 'Z') {
				return true;
			} else {
				return false;
			}
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("98095, " + arg0 + ", " + arg1 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(I[C)Z")
	private static boolean method639(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				if (!method636(arg0[local5]) && arg0[local5] != '\u0000') {
					local3 = false;
				}
			}
			if (local3) {
				return true;
			}
			@Pc(32) int local32 = method640(arg0);
			@Pc(34) int local34 = 0;
			@Pc(47) int local47 = anIntArray250.length - 1;
			if (local32 == anIntArray250[0] || local32 == anIntArray250[local47]) {
				return true;
			}
			do {
				@Pc(65) int local65 = (local34 + local47) / 2;
				if (local32 == anIntArray250[local65]) {
					return true;
				}
				if (local32 < anIntArray250[local65]) {
					local47 = local65;
				} else {
					local34 = local65;
				}
			} while (local34 != local47 && local34 + 1 != local47);
			return false;
		} catch (@Pc(94) RuntimeException local94) {
			signlink.reporterror("56510, " + 376 + ", " + arg0 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "(I[C)I")
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
			signlink.reporterror("70605, " + 0 + ", " + arg0 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}
}
