import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!sc")
public final class Class42 {

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "Z")
	private static boolean aBoolean236;

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
	private static int anInt918;

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "Z")
	private static boolean aBoolean238;

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "Z")
	private static boolean aBoolean239;

	@OriginalMember(owner = "client!sc", name = "l", descriptor = "Z")
	private static boolean aBoolean240;

	@OriginalMember(owner = "client!sc", name = "q", descriptor = "[I")
	private static int[] anIntArray254;

	@OriginalMember(owner = "client!sc", name = "r", descriptor = "[[C")
	private static char[][] aCharArrayArray1;

	@OriginalMember(owner = "client!sc", name = "s", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!sc", name = "t", descriptor = "[[C")
	private static char[][] aCharArrayArray2;

	@OriginalMember(owner = "client!sc", name = "u", descriptor = "[[C")
	private static char[][] aCharArrayArray3;

	@OriginalMember(owner = "client!sc", name = "v", descriptor = "[I")
	private static int[] anIntArray255;

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "Z")
	private static boolean aBoolean237 = true;

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "B")
	private static byte aByte32 = 9;

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "B")
	private static byte aByte33 = 6;

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
	private static int anInt919 = -38390;

	@OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
	private static int anInt920 = -1;

	@OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
	private static int anInt921 = 3;

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "B")
	private static byte aByte34 = 5;

	@OriginalMember(owner = "client!sc", name = "m", descriptor = "I")
	private static int anInt922 = -76;

	@OriginalMember(owner = "client!sc", name = "n", descriptor = "I")
	private static int anInt923 = 8;

	@OriginalMember(owner = "client!sc", name = "o", descriptor = "B")
	private static byte aByte35 = -47;

	@OriginalMember(owner = "client!sc", name = "p", descriptor = "I")
	private static int anInt924 = 38;

	@OriginalMember(owner = "client!sc", name = "w", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray13 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!xb;)V")
	public static void method594(@OriginalArg(0) Class47 arg0) {
		@Pc(10) Class1_Sub1_Sub3 local10 = new Class1_Sub1_Sub3(arg0.method666("fragmentsenc.txt", null), aBoolean236);
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(arg0.method666("badenc.txt", null), aBoolean236);
		@Pc(28) Class1_Sub1_Sub3 local28 = new Class1_Sub1_Sub3(arg0.method666("domainenc.txt", null), aBoolean236);
		@Pc(37) Class1_Sub1_Sub3 local37 = new Class1_Sub1_Sub3(arg0.method666("tldlist.txt", null), aBoolean236);
		method595(local10, local19, local28, local37);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!lb;Lclient!lb;Lclient!lb;Lclient!lb;)V")
	private static void method595(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) Class1_Sub1_Sub3 arg2, @OriginalArg(3) Class1_Sub1_Sub3 arg3) {
		method597(arg1);
		method598(arg2);
		method599(arg0, 390);
		method596((byte) 9, arg3);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BLclient!lb;)V")
	private static void method596(@OriginalArg(0) byte arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			@Pc(4) int local4 = arg1.method485();
			if (aByte32 == 9) {
				@Pc(9) boolean local9 = false;
				aCharArrayArray3 = new char[local4][];
				anIntArray255 = new int[local4];
				for (@Pc(19) int local19 = 0; local19 < local4; local19++) {
					anIntArray255[local19] = arg1.method480();
					@Pc(31) char[] local31 = new char[arg1.method480()];
					for (@Pc(33) int local33 = 0; local33 < local31.length; local33++) {
						local31[local33] = (char) arg1.method480();
					}
					aCharArrayArray3[local19] = local31;
				}
			}
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("25910, " + arg0 + ", " + arg1 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!lb;)V")
	private static void method597(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(2) int local2 = arg0.method485();
			aCharArrayArray1 = new char[local2][];
			aByteArrayArrayArray8 = new byte[local2][][];
			method600(aCharArrayArray1, anInt919, arg0, aByteArrayArrayArray8);
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("77983, " + 0 + ", " + arg0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(BLclient!lb;)V")
	private static void method598(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(2) int local2 = arg0.method485();
			if (aByte33 == 6) {
				aCharArrayArray2 = new char[local2][];
				method601(arg0, aCharArrayArray2);
			}
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("9134, " + 6 + ", " + arg0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!lb;I)V")
	private static void method599(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			anIntArray254 = new int[arg0.method485()];
			for (@Pc(5) int local5 = 0; local5 < anIntArray254.length; local5++) {
				anIntArray254[local5] = arg0.method482();
			}
			@Pc(21) boolean local21 = false;
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("78469, " + arg0 + ", " + arg1 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([[CILclient!lb;[[[B)V")
	private static void method600(@OriginalArg(0) char[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub3 arg2, @OriginalArg(3) byte[][][] arg3) {
		try {
			for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
				@Pc(9) char[] local9 = new char[arg2.method480()];
				for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
					local9[local11] = (char) arg2.method480();
				}
				arg0[local3] = local9;
				@Pc(33) byte[][] local33 = new byte[arg2.method480()][2];
				for (@Pc(35) int local35 = 0; local35 < local33.length; local35++) {
					local33[local35][0] = (byte) arg2.method480();
					local33[local35][1] = (byte) arg2.method480();
				}
				if (local33.length > 0) {
					arg3[local3] = local33;
				}
			}
			if (arg1 == -38390) {
				;
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("40035, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!lb;Z[[C)V")
	private static void method601(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(2) char[][] arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
				@Pc(9) char[] local9 = new char[arg0.method480()];
				for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
					local9[local11] = (char) arg0.method480();
				}
				arg1[local3] = local9;
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("2467, " + arg0 + ", " + true + ", " + arg1 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[C)V")
	private static void method602(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) int local3 = 0;
			for (@Pc(14) int local14 = 0; local14 < arg0.length; local14++) {
				if (method603(arg0[local14])) {
					arg0[local3] = arg0[local14];
				} else {
					arg0[local3] = ' ';
				}
				if (local3 == 0 || arg0[local3] != ' ' || arg0[local3 - 1] != ' ') {
					local3++;
				}
			}
			for (@Pc(56) int local56 = local3; local56 < arg0.length; local56++) {
				arg0[local56] = ' ';
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("88063, " + 433 + ", " + arg0 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(CI)Z")
	private static boolean method603(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= ' ' && arg0 <= '\u007f' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("51241, " + arg0 + ", " + -817 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method604(@OriginalArg(1) String arg0) {
		try {
			@Pc(3) long local3 = System.currentTimeMillis();
			@Pc(6) char[] local6 = arg0.toCharArray();
			method602(local6);
			@Pc(15) String local15 = (new String(local6)).trim();
			@Pc(19) char[] local19 = local15.toLowerCase().toCharArray();
			@Pc(22) String local22 = local15.toLowerCase();
			method612(local19, 526);
			method607(local19);
			method608(local19);
			method621(local19);
			for (@Pc(42) int local42 = 0; local42 < aStringArray13.length; local42++) {
				@Pc(52) int local52 = -1;
				while ((local52 = local22.indexOf(aStringArray13[local42], local52 + 1)) != -1) {
					@Pc(59) char[] local59 = aStringArray13[local42].toCharArray();
					for (@Pc(61) int local61 = 0; local61 < local59.length; local61++) {
						local19[local61 + local52] = local59[local61];
					}
				}
			}
			method605(local19, local15.toCharArray());
			method606(anInt920, local19);
			@Pc(103) long local103 = System.currentTimeMillis();
			return (new String(local19)).trim();
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("96345, " + 0 + ", " + arg0 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z[C[C)V")
	private static void method605(@OriginalArg(1) char[] arg0, @OriginalArg(2) char[] arg1) {
		try {
			for (@Pc(5) int local5 = 0; local5 < arg1.length; local5++) {
				if (arg0[local5] != '*' && method629(arg1[local5])) {
					arg0[local5] = arg1[local5];
				}
			}
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("36372, " + false + ", " + arg0 + ", " + arg1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(I[C)V")
	private static void method606(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1) {
		try {
			if (arg0 < 0) {
				@Pc(6) boolean local6 = true;
				for (@Pc(8) int local8 = 0; local8 < arg1.length; local8++) {
					@Pc(14) char local14 = arg1[local8];
					if (!method626(local14)) {
						local6 = true;
					} else if (local6) {
						if (method628(local14)) {
							local6 = false;
						}
					} else if (method629(local14)) {
						arg1[local8] = (char) (local14 + 'a' - 65);
					}
				}
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("59140, " + arg0 + ", " + arg1 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CI)V")
	private static void method607(@OriginalArg(0) char[] arg0) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 2; local3++) {
				for (@Pc(10) int local10 = aCharArrayArray1.length - 1; local10 >= 0; local10--) {
					method616(aCharArrayArray1[local10], aByteArrayArrayArray8[local10], arg0);
				}
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("44340, " + arg0 + ", " + 24465 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(B[C)V")
	private static void method608(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(27) char[] local27 = new char[] { '(', 'a', ')' };
			method616(local27, null, local3);
			@Pc(36) char[] local36 = (char[]) arg0.clone();
			@Pc(51) char[] local51 = new char[] { 'd', 'o', 't' };
			method616(local51, null, local36);
			for (@Pc(61) int local61 = aCharArrayArray2.length - 1; local61 >= 0; local61--) {
				method609(aCharArrayArray2[local61], arg0, local3, local36);
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("1484, " + 3 + ", " + arg0 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[C[C[C[C)V")
	private static void method609(@OriginalArg(1) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2, @OriginalArg(4) char[] arg3) {
		try {
			if (arg0.length <= arg1.length) {
				@Pc(26) int local26;
				for (@Pc(18) int local18 = 0; local18 <= arg1.length - arg0.length; local18 += local26) {
					@Pc(22) int local22 = local18;
					@Pc(24) int local24 = 0;
					local26 = 1;
					label58: while (true) {
						while (true) {
							if (local22 >= arg1.length) {
								break label58;
							}
							@Pc(34) char local34 = arg1[local22];
							@Pc(36) char local36 = 0;
							if (local22 + 1 < arg1.length) {
								local36 = arg1[local22 + 1];
							}
							@Pc(61) int local61;
							if (local24 < arg0.length && (local61 = method618(local34, 761, arg0[local24], local36)) > 0) {
								local22 += local61;
								local24++;
							} else {
								if (local24 == 0) {
									break label58;
								}
								@Pc(82) int local82;
								if ((local82 = method618(local34, 761, arg0[local24 - 1], local36)) > 0) {
									local22 += local82;
									if (local24 == 1) {
										local26++;
									}
								} else {
									if (local24 >= arg0.length || !method624(local34)) {
										break label58;
									}
									local22++;
								}
							}
						}
					}
					if (local24 >= arg0.length) {
						@Pc(113) boolean local113 = false;
						@Pc(119) int local119 = method610(local18, arg1, arg2);
						@Pc(127) int local127 = method611(local22 - 1, arg3, arg1);
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
			signlink.reporterror("35527, " + 6 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local162.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(II[C[C)I")
	private static int method610(@OriginalArg(0) int arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg0 == 0) {
				return 2;
			}
			for (@Pc(9) int local9 = arg0 - 1; local9 >= 0 && method624(arg1[local9]); local9--) {
				if (arg1[local9] == '@') {
					return 3;
				}
			}
			@Pc(29) int local29 = 0;
			for (@Pc(41) int local41 = arg0 - 1; local41 >= 0 && method624(arg2[local41]); local41--) {
				if (arg2[local41] == '*') {
					local29++;
				}
			}
			if (local29 >= 3) {
				return 4;
			} else if (method624(arg1[arg0 - 1])) {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("62021, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[C[CB)I")
	private static int method611(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2) {
		try {
			if (arg0 + 1 == arg2.length) {
				return 2;
			}
			@Pc(13) int local13 = arg0 + 1;
			while (true) {
				if (local13 < arg2.length && method624(arg2[local13])) {
					if (arg2[local13] != '.' && arg2[local13] != ',') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(40) int local40 = 0;
				for (@Pc(53) int local53 = arg0 + 1; local53 < arg2.length && method624(arg1[local53]); local53++) {
					if (arg1[local53] == '*') {
						local40++;
					}
				}
				if (local40 >= 3) {
					return 4;
				}
				if (method624(arg2[arg0 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("22604, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -60 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "([CI)V")
	private static void method612(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(18) char[] local18 = new char[] { 'd', 'o', 't' };
			method616(local18, null, local3);
			@Pc(27) boolean local27 = false;
			@Pc(31) char[] local31 = (char[]) arg0.clone();
			@Pc(54) char[] local54 = new char[] { 's', 'l', 'a', 's', 'h' };
			method616(local54, null, local31);
			for (@Pc(61) int local61 = 0; local61 < aCharArrayArray3.length; local61++) {
				method613(local31, local3, anIntArray255[local61], arg0, aCharArrayArray3[local61]);
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("26593, " + arg0 + ", " + arg1 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([C[CI[CI[C)V")
	private static void method613(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) char[] arg3, @OriginalArg(5) char[] arg4) {
		try {
			if (arg4.length <= arg3.length) {
				@Pc(19) int local19;
				for (@Pc(11) int local11 = 0; local11 <= arg3.length - arg4.length; local11 += local19) {
					@Pc(15) int local15 = local11;
					@Pc(17) int local17 = 0;
					local19 = 1;
					label121: while (true) {
						while (true) {
							if (local15 >= arg3.length) {
								break label121;
							}
							@Pc(27) char local27 = arg3[local15];
							@Pc(29) char local29 = 0;
							if (local15 + 1 < arg3.length) {
								local29 = arg3[local15 + 1];
							}
							@Pc(54) int local54;
							if (local17 < arg4.length && (local54 = method618(local27, 761, arg4[local17], local29)) > 0) {
								local15 += local54;
								local17++;
							} else {
								if (local17 == 0) {
									break label121;
								}
								@Pc(75) int local75;
								if ((local75 = method618(local27, 761, arg4[local17 - 1], local29)) > 0) {
									local15 += local75;
									if (local17 == 1) {
										local19++;
									}
								} else {
									if (local17 >= arg4.length || !method624(local27)) {
										break label121;
									}
									local15++;
								}
							}
						}
					}
					if (local17 >= arg4.length) {
						@Pc(106) boolean local106 = false;
						@Pc(112) int local112 = method614(arg3, arg1, anInt921, local11);
						@Pc(120) int local120 = method615(aByte34, local15 - 1, arg3, arg0);
						if (arg2 == 1 && local112 > 0 && local120 > 0) {
							local106 = true;
						}
						if (arg2 == 2 && (local112 > 2 && local120 > 0 || local112 > 0 && local120 > 2)) {
							local106 = true;
						}
						if (arg2 == 3 && local112 > 0 && local120 > 2) {
							local106 = true;
						}
						@Pc(163) boolean local163;
						if (arg2 == 3 && local112 > 2 && local120 > 0) {
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
										if (method624(arg3[local186])) {
											break;
										}
										local170 = local186;
									} else if (!method624(arg3[local186])) {
										local182 = true;
										local170 = local186;
									}
								}
							}
							if (local120 > 2) {
								if (local120 == 4) {
									local182 = false;
									for (local186 = local174 + 1; local186 < arg3.length; local186++) {
										if (local182) {
											if (arg0[local186] != '*') {
												break;
											}
											local174 = local186;
										} else if (arg0[local186] == '*') {
											local174 = local186;
											local182 = true;
										}
									}
								}
								local182 = false;
								for (local186 = local174 + 1; local186 < arg3.length; local186++) {
									if (local182) {
										if (method624(arg3[local186])) {
											break;
										}
										local174 = local186;
									} else if (!method624(arg3[local186])) {
										local182 = true;
										local174 = local186;
									}
								}
							}
							for (@Pc(320) int local320 = local170; local320 <= local174; local320++) {
								arg3[local320] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(352) RuntimeException local352) {
			signlink.reporterror("11525, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -6330 + ", " + arg4 + ", " + local352.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([C[CII)I")
	private static int method614(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg3 == 0) {
				return 2;
			}
			@Pc(9) int local9 = arg3 - 1;
			while (true) {
				if (local9 >= 0 && method624(arg0[local9])) {
					if (arg0[local9] != ',' && arg0[local9] != '.') {
						local9--;
						continue;
					}
					return 3;
				}
				@Pc(34) int local34 = 0;
				@Pc(42) int local42;
				if (arg2 < 3 || arg2 > 3) {
					for (local42 = 1; local42 > 0; local42++) {
					}
				}
				for (local42 = arg3 - 1; local42 >= 0 && method624(arg1[local42]); local42--) {
					if (arg1[local42] == '*') {
						local34++;
					}
				}
				if (local34 >= 3) {
					return 4;
				}
				if (method624(arg0[arg3 - 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("97804, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BI[C[C)I")
	private static int method615(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) char[] arg3) {
		try {
			if (arg1 + 1 == arg2.length) {
				return 2;
			}
			@Pc(13) int local13 = arg1 + 1;
			while (true) {
				if (local13 < arg2.length && method624(arg2[local13])) {
					if (arg2[local13] != '\\' && arg2[local13] != '/') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(40) int local40 = 0;
				if (arg0 != 5) {
					anInt918 = 286;
				}
				for (@Pc(49) int local49 = arg1 + 1; local49 < arg2.length && method624(arg3[local49]); local49++) {
					if (arg3[local49] == '*') {
						local40++;
					}
				}
				if (local40 >= 5) {
					return 4;
				}
				if (method624(arg2[arg1 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("32910, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([C[[BZ[C)V")
	private static void method616(@OriginalArg(0) char[] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg0.length <= arg2.length) {
				@Pc(24) int local24;
				for (@Pc(14) int local14 = 0; local14 <= arg2.length - arg0.length; local14 += local24) {
					@Pc(18) int local18 = local14;
					@Pc(20) int local20 = 0;
					@Pc(22) int local22 = 0;
					local24 = 1;
					@Pc(26) boolean local26 = false;
					@Pc(28) boolean local28 = false;
					@Pc(30) boolean local30 = false;
					@Pc(38) char var12;
					@Pc(40) char var13;
					label164: while (true) {
						while (true) {
							if (local18 >= arg2.length || local28 && local30) {
								break label164;
							}
							var12 = arg2[local18];
							var13 = '\u0000';
							if (local18 + 1 < arg2.length) {
								var13 = arg2[local18 + 1];
							}
							@Pc(65) int local65;
							if (local20 < arg0.length && (local65 = method619(var12, arg0[local20], var13)) > 0) {
								if (local65 == 1 && method627(var12)) {
									local28 = true;
								}
								if (local65 == 2 && (method627(var12) || method627(var13))) {
									local28 = true;
								}
								local18 += local65;
								local20++;
							} else {
								if (local20 == 0) {
									break label164;
								}
								@Pc(108) int local108;
								if ((local108 = method619(var12, arg0[local20 - 1], var13)) > 0) {
									local18 += local108;
									if (local20 == 1) {
										local24++;
									}
								} else {
									if (local20 >= arg0.length || !method625(var12)) {
										break label164;
									}
									if (method624(var12) && var12 != '\'') {
										local26 = true;
									}
									if (method627(var12)) {
										local30 = true;
									}
									local18++;
									local22++;
									if (local22 * 100 / (local18 - local14) > 90) {
										break label164;
									}
								}
							}
						}
					}
					if (local20 >= arg0.length && (!local28 || !local30)) {
						@Pc(173) boolean local173 = true;
						@Pc(269) int local269;
						if (local26) {
							@Pc(219) boolean local219 = false;
							@Pc(221) boolean local221 = false;
							if (local14 - 1 < 0 || method624(arg2[local14 - 1]) && arg2[local14 - 1] != '\'') {
								local219 = true;
							}
							if (local18 >= arg2.length || method624(arg2[local18]) && arg2[local18] != '\'') {
								local221 = true;
							}
							if (!local219 || !local221) {
								@Pc(265) boolean local265 = false;
								local269 = local14 - 2;
								if (local219) {
									local269 = local14;
								}
								while (!local265 && local269 < local18) {
									if (local269 >= 0 && (!method624(arg2[local269]) || arg2[local269] == '\'')) {
										@Pc(291) char[] local291 = new char[3];
										@Pc(293) int local293;
										for (local293 = 0; local293 < 3 && local269 + local293 < arg2.length && (!method624(arg2[local269 + local293]) || arg2[local269 + local293] == '\''); local293++) {
											local291[local293] = arg2[local269 + local293];
										}
										@Pc(331) boolean local331 = true;
										if (local293 == 0) {
											local331 = false;
										}
										if (local293 < 3 && local269 - 1 >= 0 && (!method624(arg2[local269 - 1]) || arg2[local269 - 1] == '\'')) {
											local331 = false;
										}
										if (local331 && !method630(anInt924, local291)) {
											local265 = true;
										}
									}
									local269++;
								}
								if (!local265) {
									local173 = false;
								}
							}
						} else {
							var12 = ' ';
							if (local14 - 1 >= 0) {
								var12 = arg2[local14 - 1];
							}
							var13 = ' ';
							if (local18 < arg2.length) {
								var13 = arg2[local18];
							}
							@Pc(201) byte local201 = method620(var12);
							@Pc(205) byte local205 = method620(var13);
							if (arg1 != null && method617(local201, arg1, local205)) {
								local173 = false;
							}
						}
						if (local173) {
							@Pc(381) int local381 = 0;
							@Pc(383) int local383 = 0;
							@Pc(385) int local385 = -1;
							for (local269 = local14; local269 < local18; local269++) {
								if (method627(arg2[local269])) {
									local381++;
								} else if (method626(arg2[local269])) {
									local383++;
									local385 = local269;
								}
							}
							if (local385 > -1) {
								local381 -= local18 - local385 - 1;
							}
							if (local381 <= local383) {
								for (@Pc(427) int local427 = local14; local427 < local18; local427++) {
									arg2[local427] = '*';
								}
							} else {
								local24 = 1;
							}
						}
					}
				}
			}
		} catch (@Pc(454) RuntimeException local454) {
			signlink.reporterror("6649, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + local454.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IB[[BB)Z")
	private static boolean method617(@OriginalArg(1) byte arg0, @OriginalArg(2) byte[][] arg1, @OriginalArg(3) byte arg2) {
		try {
			@Pc(7) int local7 = 0;
			if (arg1[0][0] == arg0 && arg1[0][1] == arg2) {
				return true;
			}
			@Pc(28) int local28 = arg1.length - 1;
			if (arg1[local28][0] == arg0 && arg1[local28][1] == arg2) {
				return true;
			}
			do {
				@Pc(50) int local50 = (local7 + local28) / 2;
				if (arg1[local50][0] == arg0 && arg1[local50][1] == arg2) {
					return true;
				}
				if (arg0 < arg1[local50][0] || arg0 == arg1[local50][0] && arg2 < arg1[local50][1]) {
					local28 = local50;
				} else {
					local7 = local50;
				}
			} while (local7 != local28 && local7 + 1 != local28);
			return false;
		} catch (@Pc(104) RuntimeException local104) {
			signlink.reporterror("57565, " + 714 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local104.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(CICC)I")
	private static int method618(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) char arg2, @OriginalArg(3) char arg3) {
		try {
			@Pc(3) boolean local3 = false;
			if (arg2 == arg0) {
				return 1;
			} else if (arg2 == 'o' && arg0 == '0') {
				return 1;
			} else if (arg2 == 'o' && arg0 == '(' && arg3 == ')') {
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
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("3626, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(CCCB)I")
	private static int method619(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(2) char arg2) {
		try {
			if (arg1 == arg0) {
				return 1;
			}
			if (arg1 >= 'a' && arg1 <= 'm') {
				if (arg1 == 'a') {
					if (arg0 != '4' && arg0 != '@' && arg0 != '^') {
						if (arg0 == '/' && arg2 == '\\') {
							return 2;
						}
						return 0;
					}
					return 1;
				}
				if (arg1 == 'b') {
					if (arg0 != '6' && arg0 != '8') {
						if ((arg0 != '1' || arg2 != '3') && (arg0 != 'i' || arg2 != '3')) {
							return 0;
						}
						return 2;
					}
					return 1;
				}
				if (arg1 == 'c') {
					if (arg0 != '(' && arg0 != '<' && arg0 != '{' && arg0 != '[') {
						return 0;
					}
					return 1;
				}
				if (arg1 == 'd') {
					if ((arg0 != '[' || arg2 != ')') && (arg0 != 'i' || arg2 != ')')) {
						return 0;
					}
					return 2;
				}
				if (arg1 == 'e') {
					if (arg0 != '3' && arg0 != '€') {
						return 0;
					}
					return 1;
				}
				if (arg1 == 'f') {
					if (arg0 == 'p' && arg2 == 'h') {
						return 2;
					}
					if (arg0 == '£') {
						return 1;
					}
					return 0;
				}
				if (arg1 == 'g') {
					if (arg0 != '9' && arg0 != '6' && arg0 != 'q') {
						return 0;
					}
					return 1;
				}
				if (arg1 == 'h') {
					if (arg0 == '#') {
						return 1;
					}
					return 0;
				}
				if (arg1 == 'i') {
					if (arg0 != 'y' && arg0 != 'l' && arg0 != 'j' && arg0 != '1' && arg0 != '!' && arg0 != ':' && arg0 != ';' && arg0 != '|') {
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
					if (arg0 != '1' && arg0 != '|' && arg0 != 'i') {
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
					if (arg0 != '0' && arg0 != '*') {
						if ((arg0 != '(' || arg2 != ')') && (arg0 != '[' || arg2 != ']') && (arg0 != '{' || arg2 != '}') && (arg0 != '<' || arg2 != '>')) {
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
					if (arg0 != '5' && arg0 != 'z' && arg0 != '$' && arg0 != '2') {
						return 0;
					}
					return 1;
				}
				if (arg1 == 't') {
					if (arg0 != '7' && arg0 != '+') {
						return 0;
					}
					return 1;
				}
				if (arg1 == 'u') {
					if (arg0 == 'v') {
						return 1;
					}
					if ((arg0 != '\\' || arg2 != '/') && (arg0 != '\\' || arg2 != '|') && (arg0 != '|' || arg2 != '/')) {
						return 0;
					}
					return 2;
				}
				if (arg1 == 'v') {
					if ((arg0 != '\\' || arg2 != '/') && (arg0 != '\\' || arg2 != '|') && (arg0 != '|' || arg2 != '/')) {
						return 0;
					}
					return 2;
				}
				if (arg1 == 'w') {
					if (arg0 == 'v' && arg2 == 'v') {
						return 2;
					}
					return 0;
				}
				if (arg1 == 'x') {
					if ((arg0 != ')' || arg2 != '(') && (arg0 != '}' || arg2 != '{') && (arg0 != ']' || arg2 != '[') && (arg0 != '>' || arg2 != '<')) {
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
					if (arg0 == 'o' || arg0 == 'O') {
						return 1;
					} else if ((arg0 != '(' || arg2 != ')') && (arg0 != '{' || arg2 != '}') && (arg0 != '[' || arg2 != ']')) {
						return 0;
					} else {
						return 2;
					}
				} else if (arg1 == '1') {
					return arg0 == 'l' ? 1 : 0;
				} else {
					return 0;
				}
			} else if (arg1 == ',') {
				return arg0 == '.' ? 1 : 0;
			} else if (arg1 == '.') {
				return arg0 == ',' ? 1 : 0;
			} else if (arg1 == '!') {
				return arg0 == 'i' ? 1 : 0;
			} else {
				return 0;
			}
		} catch (@Pc(513) RuntimeException local513) {
			signlink.reporterror("81420, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 30 + ", " + local513.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IC)B")
	private static byte method620(@OriginalArg(1) char arg0) {
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
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("55044, " + 6 + ", " + arg0 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z[C)V")
	private static void method621(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			@Pc(12) int local12 = 0;
			while (true) {
				do {
					@Pc(111) int local111;
					if ((local111 = method622(arg0, local5)) == -1) {
						return;
					}
					@Pc(16) boolean local16 = false;
					for (@Pc(18) int local18 = local5; local18 >= 0 && local18 < local111 && !local16; local18++) {
						if (!method624(arg0[local18]) && !method625(arg0[local18])) {
							local16 = true;
						}
					}
					if (local16) {
						local7 = 0;
					}
					if (local7 == 0) {
						local12 = local111;
					}
					local5 = method623(arg0, local111);
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
			signlink.reporterror("95409, " + false + ", " + arg0 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CBI)I")
	private static int method622(@OriginalArg(0) char[] arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(6) int local6 = arg1; local6 < arg0.length && local6 >= 0; local6++) {
				if (arg0[local6] >= '0' && arg0[local6] <= '9') {
					return local6;
				}
			}
			return -1;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("21327, " + arg0 + ", " + 38 + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CII)I")
	private static int method623(@OriginalArg(0) char[] arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(12) int local12 = arg1;
			while (true) {
				if (local12 < arg0.length && local12 >= 0) {
					if (arg0[local12] >= '0' && arg0[local12] <= '9') {
						local12++;
						continue;
					}
					return local12;
				}
				return arg0.length;
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("90780, " + arg0 + ", " + -76 + ", " + arg1 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(CI)Z")
	private static boolean method624(@OriginalArg(0) char arg0) {
		try {
			if (anInt923 != 8) {
				throw new NullPointerException();
			}
			return !method626(arg0) && !method627(arg0);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("99715, " + arg0 + ", " + 8 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BC)Z")
	private static boolean method625(@OriginalArg(1) char arg0) {
		try {
			if (arg0 >= 'a' && arg0 <= 'z') {
				return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
			} else {
				return true;
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("79475, " + -42 + ", " + arg0 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZC)Z")
	private static boolean method626(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("30984, " + true + ", " + arg0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(CB)Z")
	private static boolean method627(@OriginalArg(0) char arg0) {
		try {
			if (aByte35 != -47) {
				aBoolean237 = !aBoolean237;
			}
			return arg0 >= '0' && arg0 <= '9';
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("50268, " + arg0 + ", " + -47 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(CZ)Z")
	private static boolean method628(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z';
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("25194, " + arg0 + ", " + false + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(ZC)Z")
	private static boolean method629(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("36300, " + true + ", " + arg0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(I[C)Z")
	private static boolean method630(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < arg1.length; local5++) {
				if (!method627(arg1[local5]) && arg1[local5] != '\u0000') {
					local3 = false;
				}
			}
			if (local3) {
				return true;
			}
			@Pc(32) int local32 = method631(arg1);
			@Pc(34) int local34 = 0;
			@Pc(39) int local39 = anIntArray254.length - 1;
			@Pc(43) int local43 = 26 / arg0;
			if (local32 == anIntArray254[0] || local32 == anIntArray254[local39]) {
				return true;
			}
			do {
				@Pc(61) int local61 = (local34 + local39) / 2;
				if (local32 == anIntArray254[local61]) {
					return true;
				}
				if (local32 < anIntArray254[local61]) {
					local39 = local61;
				} else {
					local34 = local61;
				}
			} while (local34 != local39 && local34 + 1 != local39);
			return false;
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("71038, " + arg0 + ", " + arg1 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CB)I")
	private static int method631(@OriginalArg(0) char[] arg0) {
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
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("26129, " + arg0 + ", " + 2 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}
}
