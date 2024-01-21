import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!IHSJPYKH")
public final class Class18 {

	@OriginalMember(owner = "client!IHSJPYKH", name = "o", descriptor = "[I")
	private static int[] anIntArray61;

	@OriginalMember(owner = "client!IHSJPYKH", name = "p", descriptor = "[[C")
	private static char[][] aCharArrayArray1;

	@OriginalMember(owner = "client!IHSJPYKH", name = "q", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!IHSJPYKH", name = "r", descriptor = "[[C")
	private static char[][] aCharArrayArray2;

	@OriginalMember(owner = "client!IHSJPYKH", name = "s", descriptor = "[[C")
	private static char[][] aCharArrayArray3;

	@OriginalMember(owner = "client!IHSJPYKH", name = "t", descriptor = "[I")
	private static int[] anIntArray62;

	@OriginalMember(owner = "client!IHSJPYKH", name = "a", descriptor = "Z")
	private static boolean aBoolean63 = true;

	@OriginalMember(owner = "client!IHSJPYKH", name = "b", descriptor = "I")
	private static int anInt267 = 156;

	@OriginalMember(owner = "client!IHSJPYKH", name = "c", descriptor = "Z")
	private static boolean aBoolean64 = true;

	@OriginalMember(owner = "client!IHSJPYKH", name = "d", descriptor = "I")
	private static int anInt268 = 1008;

	@OriginalMember(owner = "client!IHSJPYKH", name = "e", descriptor = "I")
	private static int anInt269 = 3763;

	@OriginalMember(owner = "client!IHSJPYKH", name = "f", descriptor = "I")
	private static int anInt270 = 2;

	@OriginalMember(owner = "client!IHSJPYKH", name = "g", descriptor = "I")
	private static int anInt271 = -377;

	@OriginalMember(owner = "client!IHSJPYKH", name = "h", descriptor = "I")
	private static int anInt272 = 796;

	@OriginalMember(owner = "client!IHSJPYKH", name = "i", descriptor = "I")
	private static int anInt273 = 42302;

	@OriginalMember(owner = "client!IHSJPYKH", name = "j", descriptor = "B")
	private static byte aByte9 = -97;

	@OriginalMember(owner = "client!IHSJPYKH", name = "k", descriptor = "I")
	private static int anInt274 = 557;

	@OriginalMember(owner = "client!IHSJPYKH", name = "l", descriptor = "I")
	private static int anInt275 = 720;

	@OriginalMember(owner = "client!IHSJPYKH", name = "m", descriptor = "B")
	private static byte aByte10 = 43;

	@OriginalMember(owner = "client!IHSJPYKH", name = "u", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray1 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

	@OriginalMember(owner = "client!IHSJPYKH", name = "a", descriptor = "(Lclient!JUPFHAZZ;)V")
	public static void method173(@OriginalArg(0) Class21 arg0) {
		@Pc(10) Class2_Sub1_Sub4 local10 = new Class2_Sub1_Sub4(859, arg0.method275("fragmentsenc.txt", null));
		@Pc(19) Class2_Sub1_Sub4 local19 = new Class2_Sub1_Sub4(859, arg0.method275("badenc.txt", null));
		@Pc(28) Class2_Sub1_Sub4 local28 = new Class2_Sub1_Sub4(859, arg0.method275("domainenc.txt", null));
		@Pc(37) Class2_Sub1_Sub4 local37 = new Class2_Sub1_Sub4(859, arg0.method275("tldlist.txt", null));
		method174(local10, local19, local28, local37);
	}

	@OriginalMember(owner = "client!IHSJPYKH", name = "a", descriptor = "(Lclient!TKPFKOXP;Lclient!TKPFKOXP;Lclient!TKPFKOXP;Lclient!TKPFKOXP;)V")
	private static void method174(@OriginalArg(0) Class2_Sub1_Sub4 arg0, @OriginalArg(1) Class2_Sub1_Sub4 arg1, @OriginalArg(2) Class2_Sub1_Sub4 arg2, @OriginalArg(3) Class2_Sub1_Sub4 arg3) {
		method176(arg1);
		method177(arg2, anInt268);
		method178(arg0);
		method175(arg3);
	}

	@OriginalMember(owner = "client!IHSJPYKH", name = "a", descriptor = "(Lclient!TKPFKOXP;I)V")
	private static void method175(@OriginalArg(0) Class2_Sub1_Sub4 arg0) {
		try {
			@Pc(4) int local4 = arg0.method497();
			aCharArrayArray3 = new char[local4][];
			anIntArray62 = new int[local4];
			for (@Pc(17) int local17 = 0; local17 < local4; local17++) {
				anIntArray62[local17] = arg0.method492();
				@Pc(28) char[] local28 = new char[arg0.method492()];
				for (@Pc(30) int local30 = 0; local30 < local28.length; local30++) {
					local28[local30] = (char) arg0.method492();
				}
				aCharArrayArray3[local17] = local28;
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("93093, " + arg0 + ", " + 20530 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IHSJPYKH", name = "a", descriptor = "(ZLclient!TKPFKOXP;)V")
	private static void method176(@OriginalArg(1) Class2_Sub1_Sub4 arg0) {
		try {
			@Pc(2) int local2 = arg0.method497();
			aCharArrayArray1 = new char[local2][];
			aByteArrayArrayArray7 = new byte[local2][][];
			method179(aCharArrayArray1, arg0, aByteArrayArrayArray7);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("65678, " + true + ", " + arg0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IHSJPYKH", name = "b", descriptor = "(Lclient!TKPFKOXP;I)V")
	private static void method177(@OriginalArg(0) Class2_Sub1_Sub4 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(2) int local2 = arg0.method497();
			if (arg1 == 1008) {
				aCharArrayArray2 = new char[local2][];
				method180(arg0, aCharArrayArray2);
			}
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("53407, " + arg0 + ", " + arg1 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IHSJPYKH", name = "c", descriptor = "(Lclient!TKPFKOXP;I)V")
	private static void method178(@OriginalArg(0) Class2_Sub1_Sub4 arg0) {
		try {
			anIntArray61 = new int[arg0.method497()];
			for (@Pc(8) int local8 = 0; local8 < anIntArray61.length; local8++) {
				anIntArray61[local8] = arg0.method494();
			}
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("367, " + arg0 + ", " + 0 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IHSJPYKH", name = "a", descriptor = "([[CZLclient!TKPFKOXP;[[[B)V")
	private static void method179(@OriginalArg(0) char[][] arg0, @OriginalArg(2) Class2_Sub1_Sub4 arg1, @OriginalArg(3) byte[][][] arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
				@Pc(9) char[] local9 = new char[arg1.method492()];
				for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
					local9[local11] = (char) arg1.method492();
				}
				arg0[local3] = local9;
				@Pc(33) byte[][] local33 = new byte[arg1.method492()][2];
				for (@Pc(35) int local35 = 0; local35 < local33.length; local35++) {
					local33[local35][0] = (byte) arg1.method492();
					local33[local35][1] = (byte) arg1.method492();
				}
				if (local33.length > 0) {
					arg2[local3] = local33;
				}
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("36032, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IHSJPYKH", name = "a", descriptor = "(ILclient!TKPFKOXP;[[C)V")
	private static void method180(@OriginalArg(1) Class2_Sub1_Sub4 arg0, @OriginalArg(2) char[][] arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
				@Pc(9) char[] local9 = new char[arg0.method492()];
				for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
					local9[local11] = (char) arg0.method492();
				}
				arg1[local3] = local9;
			}
			if (anInt269 != 3763) {
				anInt268 = 427;
			}
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("76239, " + 3763 + ", " + arg0 + ", " + arg1 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IHSJPYKH", name = "a", descriptor = "([CZ)V")
	private static void method181(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(7) int local7 = 0;
			for (@Pc(9) int local9 = 0; local9 < arg0.length; local9++) {
				if (method182(arg0[local9])) {
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
			signlink.reporterror("55865, " + arg0 + ", " + false + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IHSJPYKH", name = "a", descriptor = "(CB)Z")
	private static boolean method182(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= ' ' && arg0 <= '\u007f' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("9540, " + arg0 + ", " + -113 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IHSJPYKH", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
	public static String method183(@OriginalArg(0) String arg0) {
		try {
			@Pc(3) long local3 = System.currentTimeMillis();
			@Pc(6) char[] local6 = arg0.toCharArray();
			method181(local6);
			@Pc(21) String local21 = (new String(local6)).trim();
			@Pc(25) char[] local25 = local21.toLowerCase().toCharArray();
			@Pc(28) String local28 = local21.toLowerCase();
			method191(local25);
			method186(local25, 934);
			method187(local25, anInt272);
			method200(local25);
			for (@Pc(42) int local42 = 0; local42 < aStringArray1.length; local42++) {
				@Pc(52) int local52 = -1;
				while ((local52 = local28.indexOf(aStringArray1[local42], local52 + 1)) != -1) {
					@Pc(59) char[] local59 = aStringArray1[local42].toCharArray();
					for (@Pc(61) int local61 = 0; local61 < local59.length; local61++) {
						local25[local61 + local52] = local59[local61];
					}
				}
			}
			method184(local25, local21.toCharArray(), anInt271);
			method185(268, local25);
			@Pc(103) long local103 = System.currentTimeMillis();
			return (new String(local25)).trim();
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("31999, " + arg0 + ", " + false + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IHSJPYKH", name = "a", descriptor = "([C[CI)V")
	private static void method184(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(6) int local6;
			if (arg2 != -377) {
				for (local6 = 1; local6 > 0; local6++) {
				}
			}
			for (local6 = 0; local6 < arg1.length; local6++) {
				if (arg0[local6] != '*' && method208(arg1[local6], aBoolean65)) {
					arg0[local6] = arg1[local6];
				}
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("1901, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IHSJPYKH", name = "a", descriptor = "(I[C)V")
	private static void method185(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1) {
		try {
			@Pc(3) boolean local3 = true;
			@Pc(7) boolean local7 = false;
			for (@Pc(9) int local9 = 0; local9 < arg1.length; local9++) {
				@Pc(15) char local15 = arg1[local9];
				if (!method205(local15)) {
					local3 = true;
				} else if (local3) {
					if (method207(local15)) {
						local3 = false;
					}
				} else if (method208(local15, aBoolean65)) {
					arg1[local9] = (char) (local15 + 'a' - 65);
				}
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("29632, " + arg0 + ", " + arg1 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IHSJPYKH", name = "a", descriptor = "([CI)V")
	private static void method186(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 2; local3++) {
				for (@Pc(10) int local10 = aCharArrayArray1.length - 1; local10 >= 0; local10--) {
					method195(arg0, aByteArrayArrayArray7[local10], aCharArrayArray1[local10]);
				}
			}
			@Pc(32) boolean local32 = false;
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("54020, " + arg0 + ", " + arg1 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IHSJPYKH", name = "b", descriptor = "([CI)V")
	private static void method187(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(5) char[] local5 = (char[]) arg0.clone();
			@Pc(20) char[] local20 = new char[] { '(', 'a', ')' };
			method195(local5, null, local20);
			@Pc(29) char[] local29 = (char[]) arg0.clone();
			@Pc(44) char[] local44 = new char[] { 'd', 'o', 't' };
			@Pc(48) int local48;
			if (arg1 <= 0) {
				for (local48 = 1; local48 > 0; local48++) {
				}
			}
			method195(local29, null, local44);
			for (local48 = aCharArrayArray2.length - 1; local48 >= 0; local48--) {
				method188(aCharArrayArray2[local48], local29, arg0, local5);
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("50084, " + arg0 + ", " + arg1 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IHSJPYKH", name = "a", descriptor = "(Z[C[C[C[C)V")
	private static void method188(@OriginalArg(1) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2, @OriginalArg(4) char[] arg3) {
		try {
			if (arg0.length <= arg2.length) {
				@Pc(22) int local22;
				for (@Pc(14) int local14 = 0; local14 <= arg2.length - arg0.length; local14 += local22) {
					@Pc(18) int local18 = local14;
					@Pc(20) int local20 = 0;
					local22 = 1;
					label58: while (true) {
						while (true) {
							if (local18 >= arg2.length) {
								break label58;
							}
							@Pc(30) char local30 = arg2[local18];
							@Pc(32) char local32 = 0;
							if (local18 + 1 < arg2.length) {
								local32 = arg2[local18 + 1];
							}
							@Pc(57) int local57;
							if (local20 < arg0.length && (local57 = method197(local32, local30, anInt274, arg0[local20])) > 0) {
								local18 += local57;
								local20++;
							} else {
								if (local20 == 0) {
									break label58;
								}
								@Pc(78) int local78;
								if ((local78 = method197(local32, local30, anInt274, arg0[local20 - 1])) > 0) {
									local18 += local78;
									if (local20 == 1) {
										local22++;
									}
								} else {
									if (local20 >= arg0.length || !method203(local30)) {
										break label58;
									}
									local18++;
								}
							}
						}
					}
					if (local20 >= arg0.length) {
						@Pc(109) boolean local109 = false;
						@Pc(115) int local115 = method189(local14, arg2, arg3);
						@Pc(123) int local123 = method190(arg1, arg2, local18 - 1, anInt273);
						if (local115 > 2 || local123 > 2) {
							local109 = true;
						}
						if (local109) {
							for (@Pc(135) int local135 = local14; local135 < local18; local135++) {
								arg2[local135] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("79318, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IHSJPYKH", name = "a", descriptor = "(IZ[C[C)I")
	private static int method189(@OriginalArg(0) int arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg0 == 0) {
				return 2;
			}
			for (@Pc(13) int local13 = arg0 - 1; local13 >= 0 && method203(arg1[local13]); local13--) {
				if (arg1[local13] == '@') {
					return 3;
				}
			}
			@Pc(33) int local33 = 0;
			for (@Pc(37) int local37 = arg0 - 1; local37 >= 0 && method203(arg2[local37]); local37--) {
				if (arg2[local37] == '*') {
					local33++;
				}
			}
			if (local33 >= 3) {
				return 4;
			} else if (method203(arg1[arg0 - 1])) {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("40845, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IHSJPYKH", name = "a", descriptor = "([C[CII)I")
	private static int method190(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg3 != 42302) {
				aBoolean65 = true;
			}
			if (arg2 + 1 == arg1.length) {
				return 2;
			}
			@Pc(22) int local22 = arg2 + 1;
			while (true) {
				if (local22 < arg1.length && method203(arg1[local22])) {
					if (arg1[local22] != '.' && arg1[local22] != ',') {
						local22++;
						continue;
					}
					return 3;
				}
				@Pc(49) int local49 = 0;
				for (@Pc(53) int local53 = arg2 + 1; local53 < arg1.length && method203(arg0[local53]); local53++) {
					if (arg0[local53] == '*') {
						local49++;
					}
				}
				if (local49 >= 3) {
					return 4;
				}
				if (method203(arg1[arg2 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("78836, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IHSJPYKH", name = "c", descriptor = "([CI)V")
	private static void method191(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(18) char[] local18 = new char[] { 'd', 'o', 't' };
			method195(local3, null, local18);
			@Pc(32) char[] local32 = (char[]) arg0.clone();
			@Pc(55) char[] local55 = new char[] { 's', 'l', 'a', 's', 'h' };
			method195(local32, null, local55);
			for (@Pc(62) int local62 = 0; local62 < aCharArrayArray3.length; local62++) {
				method192(local3, aCharArrayArray3[local62], local32, anIntArray62[local62], (byte) 4, arg0);
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("7451, " + arg0 + ", " + -4922 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IHSJPYKH", name = "a", descriptor = "([C[C[CIB[C)V")
	private static void method192(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) char[] arg5) {
		try {
			@Pc(6) boolean local6 = false;
			if (arg1.length <= arg5.length) {
				@Pc(27) int local27;
				for (@Pc(19) int local19 = 0; local19 <= arg5.length - arg1.length; local19 += local27) {
					@Pc(23) int local23 = local19;
					@Pc(25) int local25 = 0;
					local27 = 1;
					label120: while (true) {
						while (true) {
							if (local23 >= arg5.length) {
								break label120;
							}
							@Pc(35) char local35 = arg5[local23];
							@Pc(37) char local37 = 0;
							if (local23 + 1 < arg5.length) {
								local37 = arg5[local23 + 1];
							}
							@Pc(62) int local62;
							if (local25 < arg1.length && (local62 = method197(local37, local35, anInt274, arg1[local25])) > 0) {
								local23 += local62;
								local25++;
							} else {
								if (local25 == 0) {
									break label120;
								}
								@Pc(83) int local83;
								if ((local83 = method197(local37, local35, anInt274, arg1[local25 - 1])) > 0) {
									local23 += local83;
									if (local25 == 1) {
										local27++;
									}
								} else {
									if (local25 >= arg1.length || !method203(local35)) {
										break label120;
									}
									local23++;
								}
							}
						}
					}
					if (local25 >= arg1.length) {
						@Pc(114) boolean local114 = false;
						@Pc(120) int local120 = method193(local19, arg5, arg0);
						@Pc(128) int local128 = method194(local23 - 1, arg5, 478, arg2);
						if (arg3 == 1 && local120 > 0 && local128 > 0) {
							local114 = true;
						}
						if (arg3 == 2 && (local120 > 2 && local128 > 0 || local120 > 0 && local128 > 2)) {
							local114 = true;
						}
						if (arg3 == 3 && local120 > 0 && local128 > 2) {
							local114 = true;
						}
						@Pc(171) boolean local171;
						if (arg3 == 3 && local120 > 2 && local128 > 0) {
							local171 = true;
						} else {
							local171 = false;
						}
						if (local114) {
							@Pc(178) int local178 = local19;
							@Pc(182) int local182 = local23 - 1;
							@Pc(190) boolean local190;
							@Pc(194) int local194;
							if (local120 > 2) {
								if (local120 == 4) {
									local190 = false;
									for (local194 = local19 - 1; local194 >= 0; local194--) {
										if (local190) {
											if (arg0[local194] != '*') {
												break;
											}
											local178 = local194;
										} else if (arg0[local194] == '*') {
											local178 = local194;
											local190 = true;
										}
									}
								}
								local190 = false;
								for (local194 = local178 - 1; local194 >= 0; local194--) {
									if (local190) {
										if (method203(arg5[local194])) {
											break;
										}
										local178 = local194;
									} else if (!method203(arg5[local194])) {
										local190 = true;
										local178 = local194;
									}
								}
							}
							if (local128 > 2) {
								if (local128 == 4) {
									local190 = false;
									for (local194 = local182 + 1; local194 < arg5.length; local194++) {
										if (local190) {
											if (arg2[local194] != '*') {
												break;
											}
											local182 = local194;
										} else if (arg2[local194] == '*') {
											local182 = local194;
											local190 = true;
										}
									}
								}
								local190 = false;
								for (local194 = local182 + 1; local194 < arg5.length; local194++) {
									if (local190) {
										if (method203(arg5[local194])) {
											break;
										}
										local182 = local194;
									} else if (!method203(arg5[local194])) {
										local190 = true;
										local182 = local194;
									}
								}
							}
							for (@Pc(328) int local328 = local178; local328 <= local182; local328++) {
								arg5[local328] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(351) RuntimeException local351) {
			signlink.reporterror("83969, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local351.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IHSJPYKH", name = "a", descriptor = "(IB[C[C)I")
	private static int method193(@OriginalArg(0) int arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg0 == 0) {
				return 2;
			}
			@Pc(9) int local9 = arg0 - 1;
			while (true) {
				if (local9 >= 0 && method203(arg1[local9])) {
					if (arg1[local9] != ',' && arg1[local9] != '.') {
						local9--;
						continue;
					}
					return 3;
				}
				@Pc(34) int local34 = 0;
				if (aByte9 != -97) {
					aBoolean65 = true;
				}
				for (@Pc(47) int local47 = arg0 - 1; local47 >= 0 && method203(arg2[local47]); local47--) {
					if (arg2[local47] == '*') {
						local34++;
					}
				}
				if (local34 >= 3) {
					return 4;
				}
				if (method203(arg1[arg0 - 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("87355, " + arg0 + ", " + -97 + ", " + arg1 + ", " + arg2 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IHSJPYKH", name = "a", descriptor = "(I[CI[C)I")
	private static int method194(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) char[] arg3) {
		try {
			if (arg0 + 1 == arg1.length) {
				return 2;
			}
			@Pc(13) int local13 = arg0 + 1;
			while (true) {
				if (local13 < arg1.length && method203(arg1[local13])) {
					if (arg1[local13] != '\\' && arg1[local13] != '/') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(42) boolean local42 = false;
				@Pc(44) int local44 = 0;
				for (@Pc(48) int local48 = arg0 + 1; local48 < arg1.length && method203(arg3[local48]); local48++) {
					if (arg3[local48] == '*') {
						local44++;
					}
				}
				if (local44 >= 5) {
					return 4;
				}
				if (method203(arg1[arg0 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("34836, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IHSJPYKH", name = "a", descriptor = "([CB[[B[C)V")
	private static void method195(@OriginalArg(0) char[] arg0, @OriginalArg(2) byte[][] arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg2.length <= arg0.length) {
				@Pc(21) int local21;
				for (@Pc(11) int local11 = 0; local11 <= arg0.length - arg2.length; local11 += local21) {
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
							if (local17 < arg2.length && (local62 = method198(arg2[local17], var13, var12)) > 0) {
								if (local62 == 1 && method206(var12)) {
									local25 = true;
								}
								if (local62 == 2 && (method206(var12) || method206(var13))) {
									local25 = true;
								}
								local15 += local62;
								local17++;
							} else {
								if (local17 == 0) {
									break label165;
								}
								@Pc(105) int local105;
								if ((local105 = method198(arg2[local17 - 1], var13, var12)) > 0) {
									local15 += local105;
									if (local17 == 1) {
										local21++;
									}
								} else {
									if (local17 >= arg2.length || !method204(var12, aByte10)) {
										break label165;
									}
									if (method203(var12) && var12 != '\'') {
										local23 = true;
									}
									if (method206(var12)) {
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
					if (local17 >= arg2.length && (!local25 || !local27)) {
						@Pc(170) boolean local170 = true;
						@Pc(266) int local266;
						if (local23) {
							@Pc(216) boolean local216 = false;
							@Pc(218) boolean local218 = false;
							if (local11 - 1 < 0 || method203(arg0[local11 - 1]) && arg0[local11 - 1] != '\'') {
								local216 = true;
							}
							if (local15 >= arg0.length || method203(arg0[local15]) && arg0[local15] != '\'') {
								local218 = true;
							}
							if (!local216 || !local218) {
								@Pc(262) boolean local262 = false;
								local266 = local11 - 2;
								if (local216) {
									local266 = local11;
								}
								while (!local262 && local266 < local15) {
									if (local266 >= 0 && (!method203(arg0[local266]) || arg0[local266] == '\'')) {
										@Pc(288) char[] local288 = new char[3];
										@Pc(290) int local290;
										for (local290 = 0; local290 < 3 && local266 + local290 < arg0.length && (!method203(arg0[local266 + local290]) || arg0[local266 + local290] == '\''); local290++) {
											local288[local290] = arg0[local266 + local290];
										}
										@Pc(328) boolean local328 = true;
										if (local290 == 0) {
											local328 = false;
										}
										if (local290 < 3 && local266 - 1 >= 0 && (!method203(arg0[local266 - 1]) || arg0[local266 - 1] == '\'')) {
											local328 = false;
										}
										if (local328 && !method209(local288)) {
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
							@Pc(198) byte local198 = method199((byte) 2, var12);
							@Pc(202) byte local202 = method199((byte) 2, var13);
							if (arg1 != null && method196(local198, arg1, local202)) {
								local170 = false;
							}
						}
						if (local170) {
							@Pc(378) int local378 = 0;
							@Pc(380) int local380 = 0;
							@Pc(382) int local382 = -1;
							for (local266 = local11; local266 < local15; local266++) {
								if (method206(arg0[local266])) {
									local378++;
								} else if (method205(arg0[local266])) {
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
		} catch (@Pc(456) RuntimeException local456) {
			signlink.reporterror("81142, " + arg0 + ", " + 7 + ", " + arg1 + ", " + arg2 + ", " + local456.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IHSJPYKH", name = "a", descriptor = "(B[[BBI)Z")
	private static boolean method196(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) byte arg2) {
		try {
			@Pc(1) int local1 = 0;
			if (arg1[0][0] == arg0 && arg1[0][1] == arg2) {
				return true;
			}
			@Pc(22) int local22 = arg1.length - 1;
			if (arg1[local22][0] == arg0 && arg1[local22][1] == arg2) {
				return true;
			}
			do {
				@Pc(52) int local52 = (local1 + local22) / 2;
				if (arg1[local52][0] == arg0 && arg1[local52][1] == arg2) {
					return true;
				}
				if (arg0 < arg1[local52][0] || arg0 == arg1[local52][0] && arg2 < arg1[local52][1]) {
					local22 = local52;
				} else {
					local1 = local52;
				}
			} while (local1 != local22 && local1 + 1 != local22);
			return false;
		} catch (@Pc(106) RuntimeException local106) {
			signlink.reporterror("59641, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local106.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IHSJPYKH", name = "a", descriptor = "(CCIC)I")
	private static int method197(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(2) int arg2, @OriginalArg(3) char arg3) {
		try {
			if (arg2 <= 0) {
				for (@Pc(3) int local3 = 1; local3 > 0; local3++) {
				}
			}
			if (arg3 == arg1) {
				return 1;
			} else if (arg3 == 'o' && arg1 == '0') {
				return 1;
			} else if (arg3 == 'o' && arg1 == '(' && arg0 == ')') {
				return 2;
			} else if (arg3 == 'c' && (arg1 == '(' || arg1 == '<' || arg1 == '[')) {
				return 1;
			} else if (arg3 == 'e' && arg1 == '€') {
				return 1;
			} else if (arg3 == 's' && arg1 == '$') {
				return 1;
			} else if (arg3 == 'l' && arg1 == 'i') {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("80609, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IHSJPYKH", name = "a", descriptor = "(ICCC)I")
	private static int method198(@OriginalArg(1) char arg0, @OriginalArg(2) char arg1, @OriginalArg(3) char arg2) {
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
		} catch (@Pc(512) RuntimeException local512) {
			signlink.reporterror("31851, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local512.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IHSJPYKH", name = "a", descriptor = "(BC)B")
	private static byte method199(@OriginalArg(0) byte arg0, @OriginalArg(1) char arg1) {
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
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("21643, " + arg0 + ", " + arg1 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IHSJPYKH", name = "a", descriptor = "(Z[C)V")
	private static void method200(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(8) int local8 = 0;
			@Pc(10) int local10 = 0;
			@Pc(12) int local12 = 0;
			while (true) {
				do {
					@Pc(111) int local111;
					if ((local111 = method201(arg0, local8)) == -1) {
						return;
					}
					@Pc(16) boolean local16 = false;
					for (@Pc(18) int local18 = local8; local18 >= 0 && local18 < local111 && !local16; local18++) {
						if (!method203(arg0[local18]) && !method204(arg0[local18], aByte10)) {
							local16 = true;
						}
					}
					if (local16) {
						local10 = 0;
					}
					if (local10 == 0) {
						local12 = local111;
					}
					local8 = method202(local111, arg0);
					@Pc(57) int local57 = 0;
					for (@Pc(59) int local59 = local111; local59 < local8; local59++) {
						local57 = local57 * 10 + arg0[local59] - 48;
					}
					if (local57 <= 255 && local8 - local111 <= 8) {
						local10++;
					} else {
						local10 = 0;
					}
				} while (local10 != 4);
				for (@Pc(93) int local93 = local12; local93 < local8; local93++) {
					arg0[local93] = '*';
				}
				local10 = 0;
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("55649, " + true + ", " + arg0 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IHSJPYKH", name = "a", descriptor = "([CBI)I")
	private static int method201(@OriginalArg(0) char[] arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(6) int local6 = arg1; local6 < arg0.length && local6 >= 0; local6++) {
				if (arg0[local6] >= '0' && arg0[local6] <= '9') {
					return local6;
				}
			}
			return -1;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("38611, " + arg0 + ", " + -65 + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IHSJPYKH", name = "a", descriptor = "(II[C)I")
	private static int method202(@OriginalArg(0) int arg0, @OriginalArg(2) char[] arg1) {
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
			signlink.reporterror("84520, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IHSJPYKH", name = "a", descriptor = "(IC)Z")
	private static boolean method203(@OriginalArg(1) char arg0) {
		try {
			return !method205(arg0) && !method206(arg0);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("93519, " + 720 + ", " + arg0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IHSJPYKH", name = "b", descriptor = "(CB)Z")
	private static boolean method204(@OriginalArg(0) char arg0, @OriginalArg(1) byte arg1) {
		try {
			if (arg1 != 43) {
				throw new NullPointerException();
			} else if (arg0 >= 'a' && arg0 <= 'z') {
				return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
			} else {
				return true;
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("99945, " + arg0 + ", " + arg1 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IHSJPYKH", name = "a", descriptor = "(CI)Z")
	private static boolean method205(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("65605, " + arg0 + ", " + 0 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IHSJPYKH", name = "b", descriptor = "(IC)Z")
	private static boolean method206(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= '0' && arg0 <= '9';
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("78863, " + 6 + ", " + arg0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IHSJPYKH", name = "b", descriptor = "(CI)Z")
	private static boolean method207(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z';
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("60702, " + arg0 + ", " + -705 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IHSJPYKH", name = "a", descriptor = "(CZ)Z")
	private static boolean method208(@OriginalArg(0) char arg0, @OriginalArg(1) boolean arg1) {
		try {
			if (arg1) {
				anInt274 = -100;
			}
			return arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("29510, " + arg0 + ", " + arg1 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IHSJPYKH", name = "b", descriptor = "([CZ)Z")
	private static boolean method209(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				if (!method206(arg0[local5]) && arg0[local5] != '\u0000') {
					local3 = false;
				}
			}
			if (local3) {
				return true;
			}
			@Pc(32) int local32 = method210(arg0);
			@Pc(34) int local34 = 0;
			@Pc(48) int local48 = anIntArray61.length - 1;
			if (local32 == anIntArray61[0] || local32 == anIntArray61[local48]) {
				return true;
			}
			do {
				@Pc(66) int local66 = (local34 + local48) / 2;
				if (local32 == anIntArray61[local66]) {
					return true;
				}
				if (local32 < anIntArray61[local66]) {
					local48 = local66;
				} else {
					local34 = local66;
				}
			} while (local34 != local48 && local34 + 1 != local48);
			return false;
		} catch (@Pc(95) RuntimeException local95) {
			signlink.reporterror("37992, " + arg0 + ", " + true + ", " + local95.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IHSJPYKH", name = "d", descriptor = "([CI)I")
	private static int method210(@OriginalArg(0) char[] arg0) {
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
			signlink.reporterror("19123, " + arg0 + ", " + -484 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}
}
