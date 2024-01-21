import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GQUAQVLD")
public final class Class14 {

	@OriginalMember(owner = "client!GQUAQVLD", name = "e", descriptor = "Z")
	private static boolean aBoolean60;

	@OriginalMember(owner = "client!GQUAQVLD", name = "g", descriptor = "I")
	private static int anInt272;

	@OriginalMember(owner = "client!GQUAQVLD", name = "k", descriptor = "[I")
	private static int[] anIntArray46;

	@OriginalMember(owner = "client!GQUAQVLD", name = "l", descriptor = "[[C")
	private static char[][] aCharArrayArray1;

	@OriginalMember(owner = "client!GQUAQVLD", name = "m", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!GQUAQVLD", name = "n", descriptor = "[[C")
	private static char[][] aCharArrayArray2;

	@OriginalMember(owner = "client!GQUAQVLD", name = "o", descriptor = "[[C")
	private static char[][] aCharArrayArray3;

	@OriginalMember(owner = "client!GQUAQVLD", name = "p", descriptor = "[I")
	private static int[] anIntArray47;

	@OriginalMember(owner = "client!GQUAQVLD", name = "a", descriptor = "I")
	private static int anInt268 = 788;

	@OriginalMember(owner = "client!GQUAQVLD", name = "b", descriptor = "Z")
	private static boolean aBoolean59 = true;

	@OriginalMember(owner = "client!GQUAQVLD", name = "c", descriptor = "I")
	private static int anInt269 = -10102;

	@OriginalMember(owner = "client!GQUAQVLD", name = "d", descriptor = "I")
	private static int anInt270 = -771;

	@OriginalMember(owner = "client!GQUAQVLD", name = "f", descriptor = "I")
	private static int anInt271 = -508;

	@OriginalMember(owner = "client!GQUAQVLD", name = "h", descriptor = "I")
	private static int anInt273 = -983;

	@OriginalMember(owner = "client!GQUAQVLD", name = "i", descriptor = "B")
	private static byte aByte15 = 6;

	@OriginalMember(owner = "client!GQUAQVLD", name = "j", descriptor = "Z")
	private static boolean aBoolean61 = true;

	@OriginalMember(owner = "client!GQUAQVLD", name = "q", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray2 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

	@OriginalMember(owner = "client!GQUAQVLD", name = "a", descriptor = "(Lclient!HRXSNEYZ;)V")
	public static void method169(@OriginalArg(0) Class15 arg0) {
		@Pc(10) Class1_Sub1_Sub3 local10 = new Class1_Sub1_Sub3(arg0.method220("fragmentsenc.txt", null), 8);
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(arg0.method220("badenc.txt", null), 8);
		@Pc(28) Class1_Sub1_Sub3 local28 = new Class1_Sub1_Sub3(arg0.method220("domainenc.txt", null), 8);
		@Pc(37) Class1_Sub1_Sub3 local37 = new Class1_Sub1_Sub3(arg0.method220("tldlist.txt", null), 8);
		method170(local10, local19, local28, local37);
	}

	@OriginalMember(owner = "client!GQUAQVLD", name = "a", descriptor = "(Lclient!JHKSAGUC;Lclient!JHKSAGUC;Lclient!JHKSAGUC;Lclient!JHKSAGUC;)V")
	private static void method170(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) Class1_Sub1_Sub3 arg2, @OriginalArg(3) Class1_Sub1_Sub3 arg3) {
		method172(arg1);
		method173(arg2);
		method174(arg0);
		method171(arg3);
	}

	@OriginalMember(owner = "client!GQUAQVLD", name = "a", descriptor = "(ILclient!JHKSAGUC;)V")
	private static void method171(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(4) int local4 = arg0.method243();
			aCharArrayArray3 = new char[local4][];
			anIntArray47 = new int[local4];
			for (@Pc(16) int local16 = 0; local16 < local4; local16++) {
				anIntArray47[local16] = arg0.method238();
				@Pc(27) char[] local27 = new char[arg0.method238()];
				for (@Pc(29) int local29 = 0; local29 < local27.length; local29++) {
					local27[local29] = (char) arg0.method238();
				}
				aCharArrayArray3[local16] = local27;
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("38403, " + 42043 + ", " + arg0 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQUAQVLD", name = "a", descriptor = "(Lclient!JHKSAGUC;I)V")
	private static void method172(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(10) int local10 = arg0.method243();
			aCharArrayArray1 = new char[local10][];
			aByteArrayArrayArray7 = new byte[local10][][];
			method175(aByteArrayArrayArray7, anInt269, arg0, aCharArrayArray1);
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("26188, " + arg0 + ", " + 0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQUAQVLD", name = "b", descriptor = "(Lclient!JHKSAGUC;I)V")
	private static void method173(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(2) int local2 = arg0.method243();
			aCharArrayArray2 = new char[local2][];
			method176(arg0, (byte) 3, aCharArrayArray2);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("26192, " + arg0 + ", " + 0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQUAQVLD", name = "a", descriptor = "(ZLclient!JHKSAGUC;)V")
	private static void method174(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			anIntArray46 = new int[arg0.method243()];
			for (@Pc(13) int local13 = 0; local13 < anIntArray46.length; local13++) {
				anIntArray46[local13] = arg0.method240();
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("6551, " + false + ", " + arg0 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQUAQVLD", name = "a", descriptor = "([[[BILclient!JHKSAGUC;[[C)V")
	private static void method175(@OriginalArg(0) byte[][][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub3 arg2, @OriginalArg(3) char[][] arg3) {
		try {
			for (@Pc(3) int local3 = 0; local3 < arg3.length; local3++) {
				@Pc(9) char[] local9 = new char[arg2.method238()];
				for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
					local9[local11] = (char) arg2.method238();
				}
				arg3[local3] = local9;
				@Pc(33) byte[][] local33 = new byte[arg2.method238()][2];
				for (@Pc(35) int local35 = 0; local35 < local33.length; local35++) {
					local33[local35][0] = (byte) arg2.method238();
					local33[local35][1] = (byte) arg2.method238();
				}
				if (local33.length > 0) {
					arg0[local3] = local33;
				}
			}
			if (arg1 == anInt269) {
				;
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("27965, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQUAQVLD", name = "a", descriptor = "(Lclient!JHKSAGUC;B[[C)V")
	private static void method176(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) char[][] arg2) {
		try {
			@Pc(6) boolean local6 = false;
			for (@Pc(12) int local12 = 0; local12 < arg2.length; local12++) {
				@Pc(18) char[] local18 = new char[arg0.method238()];
				for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
					local18[local20] = (char) arg0.method238();
				}
				arg2[local12] = local18;
			}
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("59094, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQUAQVLD", name = "a", descriptor = "(I[C)V")
	private static void method177(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1) {
		try {
			@Pc(3) int local3 = 0;
			for (@Pc(5) int local5 = 0; local5 < arg1.length; local5++) {
				if (method178(arg1[local5])) {
					arg1[local3] = arg1[local5];
				} else {
					arg1[local3] = ' ';
				}
				if (local3 == 0 || arg1[local3] != ' ' || arg1[local3 - 1] != ' ') {
					local3++;
				}
			}
			for (@Pc(47) int local47 = local3; local47 < arg1.length; local47++) {
				arg1[local47] = ' ';
			}
			@Pc(62) boolean local62 = false;
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("62972, " + arg0 + ", " + arg1 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQUAQVLD", name = "a", descriptor = "(ZC)Z")
	private static boolean method178(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= ' ' && arg0 <= '\u007f' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("18670, " + true + ", " + arg0 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQUAQVLD", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method179(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(5) boolean local5 = false;
			@Pc(7) long local7 = System.currentTimeMillis();
			@Pc(10) char[] local10 = arg1.toCharArray();
			method177(460, local10);
			@Pc(19) String local19 = (new String(local10)).trim();
			@Pc(23) char[] local23 = local19.toLowerCase().toCharArray();
			@Pc(26) String local26 = local19.toLowerCase();
			method187(local23);
			method182(local23);
			method183(local23);
			method196(local23);
			for (@Pc(40) int local40 = 0; local40 < aStringArray2.length; local40++) {
				@Pc(50) int local50 = -1;
				while ((local50 = local26.indexOf(aStringArray2[local40], local50 + 1)) != -1) {
					@Pc(57) char[] local57 = aStringArray2[local40].toCharArray();
					for (@Pc(59) int local59 = 0; local59 < local57.length; local59++) {
						local23[local59 + local50] = local57[local59];
					}
				}
			}
			method180(local23, local19.toCharArray());
			method181(local23);
			@Pc(101) long local101 = System.currentTimeMillis();
			return (new String(local23)).trim();
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("98721, " + arg0 + ", " + arg1 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQUAQVLD", name = "a", descriptor = "([C[CI)V")
	private static void method180(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
				if (arg0[local3] != '*' && method204(arg1[local3])) {
					arg0[local3] = arg1[local3];
				}
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("63314, " + arg0 + ", " + arg1 + ", " + -771 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQUAQVLD", name = "a", descriptor = "(Z[C)V")
	private static void method181(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(12) boolean local12 = true;
			for (@Pc(14) int local14 = 0; local14 < arg0.length; local14++) {
				@Pc(20) char local20 = arg0[local14];
				if (!method201(local20)) {
					local12 = true;
				} else if (local12) {
					if (method203(local20)) {
						local12 = false;
					}
				} else if (method204(local20)) {
					arg0[local14] = (char) (local20 + 'a' - 65);
				}
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("90270, " + false + ", " + arg0 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQUAQVLD", name = "a", descriptor = "([CI)V")
	private static void method182(@OriginalArg(0) char[] arg0) {
		try {
			for (@Pc(14) int local14 = 0; local14 < 2; local14++) {
				for (@Pc(21) int local21 = aCharArrayArray1.length - 1; local21 >= 0; local21--) {
					method191(arg0, aByteArrayArrayArray7[local21], aCharArrayArray1[local21]);
				}
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("1574, " + arg0 + ", " + -988 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQUAQVLD", name = "b", descriptor = "(Z[C)V")
	private static void method183(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(26) char[] local26 = new char[] { '(', 'a', ')' };
			method191(local3, null, local26);
			@Pc(35) char[] local35 = (char[]) arg0.clone();
			@Pc(50) char[] local50 = new char[] { 'd', 'o', 't' };
			method191(local35, null, local50);
			for (@Pc(60) int local60 = aCharArrayArray2.length - 1; local60 >= 0; local60--) {
				method184(local35, aCharArrayArray2[local60], arg0, local3, (byte) 3);
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("14949, " + false + ", " + arg0 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQUAQVLD", name = "a", descriptor = "([C[C[C[CB)V")
	private static void method184(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) char[] arg3, @OriginalArg(4) byte arg4) {
		try {
			if (arg1.length <= arg2.length) {
				@Pc(19) int local19;
				for (@Pc(11) int local11 = 0; local11 <= arg2.length - arg1.length; local11 += local19) {
					@Pc(15) int local15 = local11;
					@Pc(17) int local17 = 0;
					local19 = 1;
					label58: while (true) {
						while (true) {
							if (local15 >= arg2.length) {
								break label58;
							}
							@Pc(27) char local27 = arg2[local15];
							@Pc(29) char local29 = 0;
							if (local15 + 1 < arg2.length) {
								local29 = arg2[local15 + 1];
							}
							@Pc(54) int local54;
							if (local17 < arg1.length && (local54 = method193(arg1[local17], local29, local27)) > 0) {
								local15 += local54;
								local17++;
							} else {
								if (local17 == 0) {
									break label58;
								}
								@Pc(75) int local75;
								if ((local75 = method193(arg1[local17 - 1], local29, local27)) > 0) {
									local15 += local75;
									if (local17 == 1) {
										local19++;
									}
								} else {
									if (local17 >= arg1.length || !method199(local27)) {
										break label58;
									}
									local15++;
								}
							}
						}
					}
					if (local17 >= arg1.length) {
						@Pc(106) boolean local106 = false;
						@Pc(112) int local112 = method185(aBoolean60, local11, arg3, arg2);
						@Pc(120) int local120 = method186(arg0, local15 - 1, arg2);
						if (local112 > 2 || local120 > 2) {
							local106 = true;
						}
						if (local106) {
							for (@Pc(132) int local132 = local11; local132 < local15; local132++) {
								arg2[local132] = '*';
							}
						}
					}
				}
				@Pc(158) boolean local158 = false;
			}
		} catch (@Pc(161) RuntimeException local161) {
			signlink.reporterror("81488, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local161.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQUAQVLD", name = "a", descriptor = "(ZI[C[C)I")
	private static int method185(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) char[] arg3) {
		try {
			if (arg1 == 0) {
				return 2;
			}
			for (@Pc(9) int local9 = arg1 - 1; local9 >= 0 && method199(arg3[local9]); local9--) {
				if (arg3[local9] == '@') {
					return 3;
				}
			}
			@Pc(29) int local29 = 0;
			if (arg0) {
				return anInt269;
			}
			for (@Pc(37) int local37 = arg1 - 1; local37 >= 0 && method199(arg2[local37]); local37--) {
				if (arg2[local37] == '*') {
					local29++;
				}
			}
			if (local29 >= 3) {
				return 4;
			} else if (method199(arg3[arg1 - 1])) {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("5675, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQUAQVLD", name = "a", descriptor = "([CI[CI)I")
	private static int method186(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) char[] arg2) {
		try {
			if (arg1 + 1 == arg2.length) {
				return 2;
			}
			@Pc(13) int local13 = arg1 + 1;
			while (true) {
				if (local13 < arg2.length && method199(arg2[local13])) {
					if (arg2[local13] != '.' && arg2[local13] != ',') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(45) int local45 = 0;
				for (@Pc(49) int local49 = arg1 + 1; local49 < arg2.length && method199(arg0[local49]); local49++) {
					if (arg0[local49] == '*') {
						local45++;
					}
				}
				if (local45 >= 3) {
					return 4;
				}
				if (method199(arg2[arg1 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("84230, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -33928 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQUAQVLD", name = "b", descriptor = "(I[C)V")
	private static void method187(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(18) char[] local18 = new char[] { 'd', 'o', 't' };
			method191(local3, null, local18);
			@Pc(27) char[] local27 = (char[]) arg0.clone();
			@Pc(50) char[] local50 = new char[] { 's', 'l', 'a', 's', 'h' };
			method191(local27, null, local50);
			for (@Pc(60) int local60 = 0; local60 < aCharArrayArray3.length; local60++) {
				method188(arg0, local27, local3, aCharArrayArray3[local60], anIntArray47[local60], (byte) 4);
			}
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("65324, " + 0 + ", " + arg0 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQUAQVLD", name = "a", descriptor = "([C[C[C[CIB)V")
	private static void method188(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) char[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5) {
		try {
			if (arg3.length <= arg0.length) {
				@Pc(19) int local19;
				for (@Pc(11) int local11 = 0; local11 <= arg0.length - arg3.length; local11 += local19) {
					@Pc(15) int local15 = local11;
					@Pc(17) int local17 = 0;
					local19 = 1;
					label120: while (true) {
						while (true) {
							if (local15 >= arg0.length) {
								break label120;
							}
							@Pc(27) char local27 = arg0[local15];
							@Pc(29) char local29 = 0;
							if (local15 + 1 < arg0.length) {
								local29 = arg0[local15 + 1];
							}
							@Pc(54) int local54;
							if (local17 < arg3.length && (local54 = method193(arg3[local17], local29, local27)) > 0) {
								local15 += local54;
								local17++;
							} else {
								if (local17 == 0) {
									break label120;
								}
								@Pc(75) int local75;
								if ((local75 = method193(arg3[local17 - 1], local29, local27)) > 0) {
									local15 += local75;
									if (local17 == 1) {
										local19++;
									}
								} else {
									if (local17 >= arg3.length || !method199(local27)) {
										break label120;
									}
									local15++;
								}
							}
						}
					}
					if (local17 >= arg3.length) {
						@Pc(106) boolean local106 = false;
						@Pc(112) int local112 = method189(arg2, local11, arg0);
						@Pc(120) int local120 = method190(arg0, local15 - 1, arg1);
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
										if (method199(arg0[local186])) {
											break;
										}
										local170 = local186;
									} else if (!method199(arg0[local186])) {
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
										if (method199(arg0[local186])) {
											break;
										}
										local174 = local186;
									} else if (!method199(arg0[local186])) {
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
				@Pc(346) boolean local346 = false;
			}
		} catch (@Pc(349) RuntimeException local349) {
			signlink.reporterror("73649, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local349.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQUAQVLD", name = "a", descriptor = "([CZI[C)I")
	private static int method189(@OriginalArg(0) char[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg1 == 0) {
				return 2;
			}
			@Pc(18) int local18 = arg1 - 1;
			while (true) {
				if (local18 >= 0 && method199(arg2[local18])) {
					if (arg2[local18] != ',' && arg2[local18] != '.') {
						local18--;
						continue;
					}
					return 3;
				}
				@Pc(43) int local43 = 0;
				for (@Pc(47) int local47 = arg1 - 1; local47 >= 0 && method199(arg0[local47]); local47--) {
					if (arg0[local47] == '*') {
						local43++;
					}
				}
				if (local43 >= 3) {
					return 4;
				}
				if (method199(arg2[arg1 - 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("88165, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQUAQVLD", name = "a", descriptor = "([CI[CZ)I")
	private static int method190(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) char[] arg2) {
		try {
			if (arg1 + 1 == arg0.length) {
				return 2;
			}
			@Pc(13) int local13 = arg1 + 1;
			while (true) {
				if (local13 < arg0.length && method199(arg0[local13])) {
					if (arg0[local13] != '\\' && arg0[local13] != '/') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(40) int local40 = 0;
				for (@Pc(53) int local53 = arg1 + 1; local53 < arg0.length && method199(arg2[local53]); local53++) {
					if (arg2[local53] == '*') {
						local40++;
					}
				}
				if (local40 >= 5) {
					return 4;
				}
				if (method199(arg0[arg1 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("9482, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQUAQVLD", name = "a", descriptor = "([C[[BZ[C)V")
	private static void method191(@OriginalArg(0) char[] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg2.length <= arg0.length) {
				@Pc(29) int local29;
				for (@Pc(19) int local19 = 0; local19 <= arg0.length - arg2.length; local19 += local29) {
					@Pc(23) int local23 = local19;
					@Pc(25) int local25 = 0;
					@Pc(27) int local27 = 0;
					local29 = 1;
					@Pc(31) boolean local31 = false;
					@Pc(33) boolean local33 = false;
					@Pc(35) boolean local35 = false;
					@Pc(43) char var12;
					@Pc(45) char var13;
					label164: while (true) {
						while (true) {
							if (local23 >= arg0.length || local33 && local35) {
								break label164;
							}
							var12 = arg0[local23];
							var13 = '\u0000';
							if (local23 + 1 < arg0.length) {
								var13 = arg0[local23 + 1];
							}
							@Pc(70) int local70;
							if (local25 < arg2.length && (local70 = method194(var12, arg2[local25], var13)) > 0) {
								if (local70 == 1 && method202(var12)) {
									local33 = true;
								}
								if (local70 == 2 && (method202(var12) || method202(var13))) {
									local33 = true;
								}
								local23 += local70;
								local25++;
							} else {
								if (local25 == 0) {
									break label164;
								}
								@Pc(113) int local113;
								if ((local113 = method194(var12, arg2[local25 - 1], var13)) > 0) {
									local23 += local113;
									if (local25 == 1) {
										local29++;
									}
								} else {
									if (local25 >= arg2.length || !method200(var12)) {
										break label164;
									}
									if (method199(var12) && var12 != '\'') {
										local31 = true;
									}
									if (method202(var12)) {
										local35 = true;
									}
									local23++;
									local27++;
									if (local27 * 100 / (local23 - local19) > 90) {
										break label164;
									}
								}
							}
						}
					}
					if (local25 >= arg2.length && (!local33 || !local35)) {
						@Pc(178) boolean local178 = true;
						@Pc(274) int local274;
						if (local31) {
							@Pc(224) boolean local224 = false;
							@Pc(226) boolean local226 = false;
							if (local19 - 1 < 0 || method199(arg0[local19 - 1]) && arg0[local19 - 1] != '\'') {
								local224 = true;
							}
							if (local23 >= arg0.length || method199(arg0[local23]) && arg0[local23] != '\'') {
								local226 = true;
							}
							if (!local224 || !local226) {
								@Pc(270) boolean local270 = false;
								local274 = local19 - 2;
								if (local224) {
									local274 = local19;
								}
								while (!local270 && local274 < local23) {
									if (local274 >= 0 && (!method199(arg0[local274]) || arg0[local274] == '\'')) {
										@Pc(296) char[] local296 = new char[3];
										@Pc(298) int local298;
										for (local298 = 0; local298 < 3 && local274 + local298 < arg0.length && (!method199(arg0[local274 + local298]) || arg0[local274 + local298] == '\''); local298++) {
											local296[local298] = arg0[local274 + local298];
										}
										@Pc(336) boolean local336 = true;
										if (local298 == 0) {
											local336 = false;
										}
										if (local298 < 3 && local274 - 1 >= 0 && (!method199(arg0[local274 - 1]) || arg0[local274 - 1] == '\'')) {
											local336 = false;
										}
										if (local336 && !method205(local296)) {
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
							var12 = ' ';
							if (local19 - 1 >= 0) {
								var12 = arg0[local19 - 1];
							}
							var13 = ' ';
							if (local23 < arg0.length) {
								var13 = arg0[local23];
							}
							@Pc(206) byte local206 = method195(var12);
							@Pc(210) byte local210 = method195(var13);
							if (arg1 != null && method192(local206, local210, arg1)) {
								local178 = false;
							}
						}
						if (local178) {
							@Pc(386) int local386 = 0;
							@Pc(388) int local388 = 0;
							@Pc(390) int local390 = -1;
							for (local274 = local19; local274 < local23; local274++) {
								if (method202(arg0[local274])) {
									local386++;
								} else if (method201(arg0[local274])) {
									local388++;
									local390 = local274;
								}
							}
							if (local390 > -1) {
								local386 -= local23 - local390 - 1;
							}
							if (local386 <= local388) {
								for (@Pc(432) int local432 = local19; local432 < local23; local432++) {
									arg0[local432] = '*';
								}
							} else {
								local29 = 1;
							}
						}
					}
				}
			}
		} catch (@Pc(459) RuntimeException local459) {
			signlink.reporterror("6153, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + local459.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQUAQVLD", name = "a", descriptor = "(BB[[BI)Z")
	private static boolean method192(@OriginalArg(0) byte arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte[][] arg2) {
		try {
			@Pc(1) int local1 = 0;
			if (arg2[0][0] == arg0 && arg2[0][1] == arg1) {
				return true;
			}
			@Pc(26) int local26 = arg2.length - 1;
			if (arg2[local26][0] == arg0 && arg2[local26][1] == arg1) {
				return true;
			}
			do {
				@Pc(48) int local48 = (local1 + local26) / 2;
				if (arg2[local48][0] == arg0 && arg2[local48][1] == arg1) {
					return true;
				}
				if (arg0 < arg2[local48][0] || arg0 == arg2[local48][0] && arg1 < arg2[local48][1]) {
					local26 = local48;
				} else {
					local1 = local48;
				}
			} while (local1 != local26 && local1 + 1 != local26);
			return false;
		} catch (@Pc(102) RuntimeException local102) {
			signlink.reporterror("77774, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local102.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQUAQVLD", name = "a", descriptor = "(CBCC)I")
	private static int method193(@OriginalArg(0) char arg0, @OriginalArg(2) char arg1, @OriginalArg(3) char arg2) {
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
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("57808, " + arg0 + ", " + 2 + ", " + arg1 + ", " + arg2 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQUAQVLD", name = "a", descriptor = "(CICC)I")
	private static int method194(@OriginalArg(0) char arg0, @OriginalArg(2) char arg1, @OriginalArg(3) char arg2) {
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
		} catch (@Pc(516) RuntimeException local516) {
			signlink.reporterror("22110, " + arg0 + ", " + -508 + ", " + arg1 + ", " + arg2 + ", " + local516.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQUAQVLD", name = "a", descriptor = "(CI)B")
	private static byte method195(@OriginalArg(0) char arg0) {
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
			signlink.reporterror("77085, " + arg0 + ", " + -41 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQUAQVLD", name = "b", descriptor = "([CI)V")
	private static void method196(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			if (anInt272 > 0 || anInt272 < 0) {
				anInt272 = 141;
			}
			@Pc(17) int local17 = 0;
			while (true) {
				do {
					@Pc(116) int local116;
					if ((local116 = method197(local5, arg0)) == -1) {
						return;
					}
					@Pc(21) boolean local21 = false;
					for (@Pc(23) int local23 = local5; local23 >= 0 && local23 < local116 && !local21; local23++) {
						if (!method199(arg0[local23]) && !method200(arg0[local23])) {
							local21 = true;
						}
					}
					if (local21) {
						local7 = 0;
					}
					if (local7 == 0) {
						local17 = local116;
					}
					local5 = method198(arg0, local116);
					@Pc(62) int local62 = 0;
					for (@Pc(64) int local64 = local116; local64 < local5; local64++) {
						local62 = local62 * 10 + arg0[local64] - 48;
					}
					if (local62 <= 255 && local5 - local116 <= 8) {
						local7++;
					} else {
						local7 = 0;
					}
				} while (local7 != 4);
				for (@Pc(98) int local98 = local17; local98 < local5; local98++) {
					arg0[local98] = '*';
				}
				local7 = 0;
			}
		} catch (@Pc(120) RuntimeException local120) {
			signlink.reporterror("94824, " + arg0 + ", " + 0 + ", " + local120.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQUAQVLD", name = "a", descriptor = "(II[C)I")
	private static int method197(@OriginalArg(0) int arg0, @OriginalArg(2) char[] arg1) {
		try {
			for (@Pc(1) int local1 = arg0; local1 < arg1.length && local1 >= 0; local1++) {
				if (arg1[local1] >= '0' && arg1[local1] <= '9') {
					return local1;
				}
			}
			return -1;
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("11498, " + arg0 + ", " + -983 + ", " + arg1 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQUAQVLD", name = "a", descriptor = "([CII)I")
	private static int method198(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(1) int local1 = arg1;
			while (true) {
				if (local1 < arg0.length && local1 >= 0) {
					if (arg0[local1] >= '0' && arg0[local1] <= '9') {
						local1++;
						continue;
					}
					return local1;
				}
				return arg0.length;
			}
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("15822, " + arg0 + ", " + arg1 + ", " + -40997 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQUAQVLD", name = "a", descriptor = "(IC)Z")
	private static boolean method199(@OriginalArg(1) char arg0) {
		try {
			return !method201(arg0) && !method202(arg0);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("66731, " + 118 + ", " + arg0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQUAQVLD", name = "a", descriptor = "(BC)Z")
	private static boolean method200(@OriginalArg(1) char arg0) {
		try {
			if (aByte15 != 6) {
				anInt273 = 137;
			}
			if (arg0 >= 'a' && arg0 <= 'z') {
				return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
			} else {
				return true;
			}
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("63924, " + 6 + ", " + arg0 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQUAQVLD", name = "b", descriptor = "(IC)Z")
	private static boolean method201(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("81439, " + 0 + ", " + arg0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQUAQVLD", name = "c", descriptor = "(IC)Z")
	private static boolean method202(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= '0' && arg0 <= '9';
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("64876, " + 313 + ", " + arg0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQUAQVLD", name = "b", descriptor = "(ZC)Z")
	private static boolean method203(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z';
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("112, " + true + ", " + arg0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQUAQVLD", name = "b", descriptor = "(CI)Z")
	private static boolean method204(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("92910, " + arg0 + ", " + -212 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQUAQVLD", name = "a", descriptor = "(B[C)Z")
	private static boolean method205(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				if (!method202(arg0[local5]) && arg0[local5] != '\u0000') {
					local3 = false;
				}
			}
			if (local3) {
				return true;
			}
			@Pc(32) int local32 = method206(arg0);
			@Pc(34) int local34 = 0;
			@Pc(39) int local39 = anIntArray46.length - 1;
			if (local32 == anIntArray46[0] || local32 == anIntArray46[local39]) {
				return true;
			}
			do {
				@Pc(62) int local62 = (local34 + local39) / 2;
				if (local32 == anIntArray46[local62]) {
					return true;
				}
				if (local32 < anIntArray46[local62]) {
					local39 = local62;
				} else {
					local34 = local62;
				}
			} while (local34 != local39 && local34 + 1 != local39);
			return false;
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("62373, " + 69 + ", " + arg0 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQUAQVLD", name = "b", descriptor = "(B[C)I")
	private static int method206(@OriginalArg(1) char[] arg0) {
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
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("17951, " + -120 + ", " + arg0 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}
}
