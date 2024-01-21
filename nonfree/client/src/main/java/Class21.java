import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!JSEWQIYU")
public final class Class21 {

	@OriginalMember(owner = "client!JSEWQIYU", name = "a", descriptor = "Z")
	private static boolean aBoolean91;

	@OriginalMember(owner = "client!JSEWQIYU", name = "e", descriptor = "I")
	private static int anInt283;

	@OriginalMember(owner = "client!JSEWQIYU", name = "j", descriptor = "[I")
	private static int[] anIntArray59;

	@OriginalMember(owner = "client!JSEWQIYU", name = "k", descriptor = "[[C")
	private static char[][] aCharArrayArray1;

	@OriginalMember(owner = "client!JSEWQIYU", name = "l", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!JSEWQIYU", name = "m", descriptor = "[[C")
	private static char[][] aCharArrayArray2;

	@OriginalMember(owner = "client!JSEWQIYU", name = "n", descriptor = "[[C")
	private static char[][] aCharArrayArray3;

	@OriginalMember(owner = "client!JSEWQIYU", name = "o", descriptor = "[I")
	private static int[] anIntArray60;

	@OriginalMember(owner = "client!JSEWQIYU", name = "b", descriptor = "I")
	private static int anInt281 = 1;

	@OriginalMember(owner = "client!JSEWQIYU", name = "d", descriptor = "I")
	private static int anInt282 = 564;

	@OriginalMember(owner = "client!JSEWQIYU", name = "f", descriptor = "I")
	private static int anInt284 = 6;

	@OriginalMember(owner = "client!JSEWQIYU", name = "g", descriptor = "Z")
	private static boolean aBoolean93 = true;

	@OriginalMember(owner = "client!JSEWQIYU", name = "i", descriptor = "I")
	private static int anInt285;

	@OriginalMember(owner = "client!JSEWQIYU", name = "p", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray1;

	static {
		aBoolean94 = true;
		anInt285 = -738;
		aStringArray1 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };
	}

	@OriginalMember(owner = "client!JSEWQIYU", name = "a", descriptor = "(Lclient!BYZSQZUF;)V")
	public static void method188(@OriginalArg(0) Class5 arg0) {
		@Pc(10) Class3_Sub1_Sub3 local10 = new Class3_Sub1_Sub3(0, arg0.method66("fragmentsenc.txt", null));
		@Pc(19) Class3_Sub1_Sub3 local19 = new Class3_Sub1_Sub3(0, arg0.method66("badenc.txt", null));
		@Pc(28) Class3_Sub1_Sub3 local28 = new Class3_Sub1_Sub3(0, arg0.method66("domainenc.txt", null));
		@Pc(37) Class3_Sub1_Sub3 local37 = new Class3_Sub1_Sub3(0, arg0.method66("tldlist.txt", null));
		method189(local10, local19, local28, local37);
	}

	@OriginalMember(owner = "client!JSEWQIYU", name = "a", descriptor = "(Lclient!IMUIZRAF;Lclient!IMUIZRAF;Lclient!IMUIZRAF;Lclient!IMUIZRAF;)V")
	private static void method189(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) Class3_Sub1_Sub3 arg1, @OriginalArg(2) Class3_Sub1_Sub3 arg2, @OriginalArg(3) Class3_Sub1_Sub3 arg3) {
		method191(arg1);
		method192(arg2);
		method193(arg0);
		method190(arg3);
	}

	@OriginalMember(owner = "client!JSEWQIYU", name = "a", descriptor = "(Lclient!IMUIZRAF;I)V")
	private static void method190(@OriginalArg(0) Class3_Sub1_Sub3 arg0) {
		try {
			@Pc(4) int local4 = arg0.method151();
			aCharArrayArray3 = new char[local4][];
			anIntArray60 = new int[local4];
			for (@Pc(21) int local21 = 0; local21 < local4; local21++) {
				anIntArray60[local21] = arg0.method146();
				@Pc(32) char[] local32 = new char[arg0.method146()];
				for (@Pc(34) int local34 = 0; local34 < local32.length; local34++) {
					local32[local34] = (char) arg0.method146();
				}
				aCharArrayArray3[local21] = local32;
			}
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("94148, " + arg0 + ", " + 3 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JSEWQIYU", name = "a", descriptor = "(ILclient!IMUIZRAF;)V")
	private static void method191(@OriginalArg(1) Class3_Sub1_Sub3 arg0) {
		try {
			@Pc(12) int local12 = arg0.method151();
			aCharArrayArray1 = new char[local12][];
			aByteArrayArrayArray1 = new byte[local12][][];
			method194(aByteArrayArrayArray1, arg0, aCharArrayArray1);
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("86097, " + 2 + ", " + arg0 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JSEWQIYU", name = "b", descriptor = "(ILclient!IMUIZRAF;)V")
	private static void method192(@OriginalArg(1) Class3_Sub1_Sub3 arg0) {
		try {
			@Pc(2) int local2 = arg0.method151();
			aCharArrayArray2 = new char[local2][];
			method195(arg0, aCharArrayArray2);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("31591, " + 0 + ", " + arg0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JSEWQIYU", name = "a", descriptor = "(Lclient!IMUIZRAF;B)V")
	private static void method193(@OriginalArg(0) Class3_Sub1_Sub3 arg0) {
		try {
			anIntArray59 = new int[arg0.method151()];
			for (@Pc(9) int local9 = 0; local9 < anIntArray59.length; local9++) {
				anIntArray59[local9] = arg0.method148();
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("54936, " + arg0 + ", " + -80 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JSEWQIYU", name = "a", descriptor = "(I[[[BLclient!IMUIZRAF;[[C)V")
	private static void method194(@OriginalArg(1) byte[][][] arg0, @OriginalArg(2) Class3_Sub1_Sub3 arg1, @OriginalArg(3) char[][] arg2) {
		try {
			for (@Pc(12) int local12 = 0; local12 < arg2.length; local12++) {
				@Pc(18) char[] local18 = new char[arg1.method146()];
				for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
					local18[local20] = (char) arg1.method146();
				}
				arg2[local12] = local18;
				@Pc(42) byte[][] local42 = new byte[arg1.method146()][2];
				for (@Pc(44) int local44 = 0; local44 < local42.length; local44++) {
					local42[local44][0] = (byte) arg1.method146();
					local42[local44][1] = (byte) arg1.method146();
				}
				if (local42.length > 0) {
					arg0[local12] = local42;
				}
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("6691, " + -49103 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JSEWQIYU", name = "a", descriptor = "(Lclient!IMUIZRAF;[[CI)V")
	private static void method195(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) char[][] arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
				@Pc(9) char[] local9 = new char[arg0.method146()];
				for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
					local9[local11] = (char) arg0.method146();
				}
				arg1[local3] = local9;
			}
			if (anInt281 == 1) {
				;
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("54930, " + arg0 + ", " + arg1 + ", " + 1 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JSEWQIYU", name = "a", descriptor = "(I[C)V")
	private static void method196(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) int local3 = 0;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				if (method197(arg0[local5])) {
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
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("6454, " + -198 + ", " + arg0 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JSEWQIYU", name = "a", descriptor = "(CI)Z")
	private static boolean method197(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= ' ' && arg0 <= '\u007f' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("8957, " + arg0 + ", " + 4 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JSEWQIYU", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method198(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) long local3 = System.currentTimeMillis();
			@Pc(6) char[] local6 = arg0.toCharArray();
			method196(local6);
			@Pc(15) String local15 = (new String(local6)).trim();
			@Pc(19) char[] local19 = local15.toLowerCase().toCharArray();
			@Pc(22) String local22 = local15.toLowerCase();
			method206(local19);
			method201(local19);
			method202(aBoolean92, local19);
			@Pc(35) boolean local35 = false;
			method215(local19);
			for (@Pc(40) int local40 = 0; local40 < aStringArray1.length; local40++) {
				@Pc(50) int local50 = -1;
				while ((local50 = local22.indexOf(aStringArray1[local40], local50 + 1)) != -1) {
					@Pc(57) char[] local57 = aStringArray1[local40].toCharArray();
					for (@Pc(59) int local59 = 0; local59 < local57.length; local59++) {
						local19[local59 + local50] = local57[local59];
					}
				}
			}
			method199(local15.toCharArray(), local19);
			method200(local19);
			@Pc(101) long local101 = System.currentTimeMillis();
			return (new String(local19)).trim();
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("49821, " + arg0 + ", " + arg1 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JSEWQIYU", name = "a", descriptor = "([C[CZ)V")
	private static void method199(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1) {
		try {
			for (@Pc(12) int local12 = 0; local12 < arg0.length; local12++) {
				if (arg1[local12] != '*' && method223(anInt284, arg0[local12])) {
					arg1[local12] = arg0[local12];
				}
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("23873, " + arg0 + ", " + arg1 + ", " + false + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JSEWQIYU", name = "b", descriptor = "(I[C)V")
	private static void method200(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(15) int local15 = 0; local15 < arg0.length; local15++) {
				@Pc(21) char local21 = arg0[local15];
				if (!method220(local21)) {
					local3 = true;
				} else if (local3) {
					if (method222(local21)) {
						local3 = false;
					}
				} else if (method223(anInt284, local21)) {
					arg0[local15] = (char) (local21 + 'a' - 65);
				}
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("63613, " + -35122 + ", " + arg0 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JSEWQIYU", name = "a", descriptor = "(Z[C)V")
	private static void method201(@OriginalArg(1) char[] arg0) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 2; local3++) {
				for (@Pc(10) int local10 = aCharArrayArray1.length - 1; local10 >= 0; local10--) {
					method210(arg0, aCharArrayArray1[local10], aByteArrayArrayArray1[local10]);
				}
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("88059, " + false + ", " + arg0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JSEWQIYU", name = "b", descriptor = "(Z[C)V")
	private static void method202(@OriginalArg(0) boolean arg0, @OriginalArg(1) char[] arg1) {
		try {
			@Pc(3) char[] local3 = (char[]) arg1.clone();
			@Pc(18) char[] local18 = new char[] { '(', 'a', ')' };
			method210(local3, local18, null);
			@Pc(27) char[] local27 = (char[]) arg1.clone();
			@Pc(42) char[] local42 = new char[] { 'd', 'o', 't' };
			if (arg0) {
				aBoolean94 = true;
			}
			method210(local27, local42, null);
			for (@Pc(60) int local60 = aCharArrayArray2.length - 1; local60 >= 0; local60--) {
				method203(aCharArrayArray2[local60], local3, local27, arg1);
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("23700, " + arg0 + ", " + arg1 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JSEWQIYU", name = "a", descriptor = "([C[CI[C[C)V")
	private static void method203(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(3) char[] arg2, @OriginalArg(4) char[] arg3) {
		try {
			if (arg0.length <= arg3.length) {
				@Pc(19) int local19;
				for (@Pc(11) int local11 = 0; local11 <= arg3.length - arg0.length; local11 += local19) {
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
							if (local17 < arg0.length && (local54 = method212(local29, arg0[local17], local27)) > 0) {
								local15 += local54;
								local17++;
							} else {
								if (local17 == 0) {
									break label59;
								}
								@Pc(75) int local75;
								if ((local75 = method212(local29, arg0[local17 - 1], local27)) > 0) {
									local15 += local75;
									if (local17 == 1) {
										local19++;
									}
								} else {
									if (local17 >= arg0.length || !method218(local27)) {
										break label59;
									}
									local15++;
								}
							}
						}
					}
					if (local17 >= arg0.length) {
						@Pc(106) boolean local106 = false;
						@Pc(112) int local112 = method204(local11, arg1, arg3);
						@Pc(120) int local120 = method205(arg2, (byte) 8, arg3, local15 - 1);
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
		} catch (@Pc(163) RuntimeException local163) {
			signlink.reporterror("46762, " + arg0 + ", " + arg1 + ", " + -698 + ", " + arg2 + ", " + arg3 + ", " + local163.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JSEWQIYU", name = "a", descriptor = "(I[CI[C)I")
	private static int method204(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg0 == 0) {
				return 2;
			}
			for (@Pc(9) int local9 = arg0 - 1; local9 >= 0 && method218(arg2[local9]); local9--) {
				if (arg2[local9] == '@') {
					return 3;
				}
			}
			@Pc(29) int local29 = 0;
			for (@Pc(33) int local33 = arg0 - 1; local33 >= 0 && method218(arg1[local33]); local33--) {
				if (arg1[local33] == '*') {
					local29++;
				}
			}
			if (local29 >= 3) {
				return 4;
			} else if (method218(arg2[arg0 - 1])) {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("5418, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JSEWQIYU", name = "a", descriptor = "([CB[CI)I")
	private static int method205(@OriginalArg(0) char[] arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg3 + 1 == arg2.length) {
				return 2;
			}
			@Pc(13) int local13 = arg3 + 1;
			while (true) {
				if (local13 < arg2.length && method218(arg2[local13])) {
					if (arg2[local13] != '.' && arg2[local13] != ',') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(40) int local40 = 0;
				@Pc(45) boolean local45 = false;
				for (@Pc(58) int local58 = arg3 + 1; local58 < arg2.length && method218(arg0[local58]); local58++) {
					if (arg0[local58] == '*') {
						local40++;
					}
				}
				if (local40 >= 3) {
					return 4;
				}
				if (method218(arg2[arg3 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(96) RuntimeException local96) {
			signlink.reporterror("84963, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local96.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JSEWQIYU", name = "a", descriptor = "(B[C)V")
	private static void method206(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(5) char[] local5 = (char[]) arg0.clone();
			@Pc(20) char[] local20 = new char[] { 'd', 'o', 't' };
			method210(local5, local20, null);
			@Pc(29) char[] local29 = (char[]) arg0.clone();
			@Pc(62) char[] local62 = new char[] { 's', 'l', 'a', 's', 'h' };
			method210(local29, local62, null);
			for (@Pc(69) int local69 = 0; local69 < aCharArrayArray3.length; local69++) {
				method207(local5, 76, local29, arg0, anIntArray60[local69], aCharArrayArray3[local69]);
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("65803, " + -15 + ", " + arg0 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JSEWQIYU", name = "a", descriptor = "([CI[C[CI[C)V")
	private static void method207(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) char[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) char[] arg5) {
		try {
			if (arg5.length <= arg3.length) {
				@Pc(13) boolean local13 = false;
				@Pc(23) int local23;
				for (@Pc(15) int local15 = 0; local15 <= arg3.length - arg5.length; local15 += local23) {
					@Pc(19) int local19 = local15;
					@Pc(21) int local21 = 0;
					local23 = 1;
					label120: while (true) {
						while (true) {
							if (local19 >= arg3.length) {
								break label120;
							}
							@Pc(31) char local31 = arg3[local19];
							@Pc(33) char local33 = 0;
							if (local19 + 1 < arg3.length) {
								local33 = arg3[local19 + 1];
							}
							@Pc(58) int local58;
							if (local21 < arg5.length && (local58 = method212(local33, arg5[local21], local31)) > 0) {
								local19 += local58;
								local21++;
							} else {
								if (local21 == 0) {
									break label120;
								}
								@Pc(79) int local79;
								if ((local79 = method212(local33, arg5[local21 - 1], local31)) > 0) {
									local19 += local79;
									if (local21 == 1) {
										local23++;
									}
								} else {
									if (local21 >= arg5.length || !method218(local31)) {
										break label120;
									}
									local19++;
								}
							}
						}
					}
					if (local21 >= arg5.length) {
						@Pc(110) boolean local110 = false;
						@Pc(116) int local116 = method208(local15, arg3, arg0);
						@Pc(124) int local124 = method209(local19 - 1, arg3, arg2);
						if (arg4 == 1 && local116 > 0 && local124 > 0) {
							local110 = true;
						}
						if (arg4 == 2 && (local116 > 2 && local124 > 0 || local116 > 0 && local124 > 2)) {
							local110 = true;
						}
						if (arg4 == 3 && local116 > 0 && local124 > 2) {
							local110 = true;
						}
						@Pc(167) boolean local167;
						if (arg4 == 3 && local116 > 2 && local124 > 0) {
							local167 = true;
						} else {
							local167 = false;
						}
						if (local110) {
							@Pc(174) int local174 = local15;
							@Pc(178) int local178 = local19 - 1;
							@Pc(186) boolean local186;
							@Pc(190) int local190;
							if (local116 > 2) {
								if (local116 == 4) {
									local186 = false;
									for (local190 = local15 - 1; local190 >= 0; local190--) {
										if (local186) {
											if (arg0[local190] != '*') {
												break;
											}
											local174 = local190;
										} else if (arg0[local190] == '*') {
											local174 = local190;
											local186 = true;
										}
									}
								}
								local186 = false;
								for (local190 = local174 - 1; local190 >= 0; local190--) {
									if (local186) {
										if (method218(arg3[local190])) {
											break;
										}
										local174 = local190;
									} else if (!method218(arg3[local190])) {
										local186 = true;
										local174 = local190;
									}
								}
							}
							if (local124 > 2) {
								if (local124 == 4) {
									local186 = false;
									for (local190 = local178 + 1; local190 < arg3.length; local190++) {
										if (local186) {
											if (arg2[local190] != '*') {
												break;
											}
											local178 = local190;
										} else if (arg2[local190] == '*') {
											local178 = local190;
											local186 = true;
										}
									}
								}
								local186 = false;
								for (local190 = local178 + 1; local190 < arg3.length; local190++) {
									if (local186) {
										if (method218(arg3[local190])) {
											break;
										}
										local178 = local190;
									} else if (!method218(arg3[local190])) {
										local186 = true;
										local178 = local190;
									}
								}
							}
							for (@Pc(324) int local324 = local174; local324 <= local178; local324++) {
								arg3[local324] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(347) RuntimeException local347) {
			signlink.reporterror("50591, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local347.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JSEWQIYU", name = "b", descriptor = "(I[CI[C)I")
	private static int method208(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg0 == 0) {
				return 2;
			}
			@Pc(17) int local17 = arg0 - 1;
			while (true) {
				if (local17 >= 0 && method218(arg1[local17])) {
					if (arg1[local17] != ',' && arg1[local17] != '.') {
						local17--;
						continue;
					}
					return 3;
				}
				@Pc(42) int local42 = 0;
				for (@Pc(46) int local46 = arg0 - 1; local46 >= 0 && method218(arg2[local46]); local46--) {
					if (arg2[local46] == '*') {
						local42++;
					}
				}
				if (local42 >= 3) {
					return 4;
				}
				if (method218(arg1[arg0 - 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("80240, " + arg0 + ", " + arg1 + ", " + 7 + ", " + arg2 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JSEWQIYU", name = "a", descriptor = "(I[C[CB)I")
	private static int method209(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2) {
		try {
			if (arg0 + 1 == arg1.length) {
				return 2;
			}
			@Pc(13) int local13 = arg0 + 1;
			while (true) {
				if (local13 < arg1.length && method218(arg1[local13])) {
					if (arg1[local13] != '\\' && arg1[local13] != '/') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(52) int local52 = 0;
				for (@Pc(56) int local56 = arg0 + 1; local56 < arg1.length && method218(arg2[local56]); local56++) {
					if (arg2[local56] == '*') {
						local52++;
					}
				}
				if (local52 >= 5) {
					return 4;
				}
				if (method218(arg1[arg0 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(94) RuntimeException local94) {
			signlink.reporterror("53459, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JSEWQIYU", name = "a", descriptor = "([CZ[C[[B)V")
	private static void method210(@OriginalArg(0) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) byte[][] arg2) {
		try {
			if (arg1.length <= arg0.length) {
				@Pc(24) int local24;
				for (@Pc(14) int local14 = 0; local14 <= arg0.length - arg1.length; local14 += local24) {
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
							if (local18 >= arg0.length || local28 && local30) {
								break label164;
							}
							var12 = arg0[local18];
							var13 = '\u0000';
							if (local18 + 1 < arg0.length) {
								var13 = arg0[local18 + 1];
							}
							@Pc(65) int local65;
							if (local20 < arg1.length && (local65 = method213(arg1[local20], var12, var13)) > 0) {
								if (local65 == 1 && method221(var12, (byte) 4)) {
									local28 = true;
								}
								if (local65 == 2 && (method221(var12, (byte) 4) || method221(var13, (byte) 4))) {
									local28 = true;
								}
								local18 += local65;
								local20++;
							} else {
								if (local20 == 0) {
									break label164;
								}
								@Pc(108) int local108;
								if ((local108 = method213(arg1[local20 - 1], var12, var13)) > 0) {
									local18 += local108;
									if (local20 == 1) {
										local24++;
									}
								} else {
									if (local20 >= arg1.length || !method219(var12)) {
										break label164;
									}
									if (method218(var12) && var12 != '\'') {
										local26 = true;
									}
									if (method221(var12, (byte) 4)) {
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
					if (local20 >= arg1.length && (!local28 || !local30)) {
						@Pc(173) boolean local173 = true;
						@Pc(269) int local269;
						if (local26) {
							@Pc(219) boolean local219 = false;
							@Pc(221) boolean local221 = false;
							if (local14 - 1 < 0 || method218(arg0[local14 - 1]) && arg0[local14 - 1] != '\'') {
								local219 = true;
							}
							if (local18 >= arg0.length || method218(arg0[local18]) && arg0[local18] != '\'') {
								local221 = true;
							}
							if (!local219 || !local221) {
								@Pc(265) boolean local265 = false;
								local269 = local14 - 2;
								if (local219) {
									local269 = local14;
								}
								while (!local265 && local269 < local18) {
									if (local269 >= 0 && (!method218(arg0[local269]) || arg0[local269] == '\'')) {
										@Pc(291) char[] local291 = new char[3];
										@Pc(293) int local293;
										for (local293 = 0; local293 < 3 && local269 + local293 < arg0.length && (!method218(arg0[local269 + local293]) || arg0[local269 + local293] == '\''); local293++) {
											local291[local293] = arg0[local269 + local293];
										}
										@Pc(331) boolean local331 = true;
										if (local293 == 0) {
											local331 = false;
										}
										if (local293 < 3 && local269 - 1 >= 0 && (!method218(arg0[local269 - 1]) || arg0[local269 - 1] == '\'')) {
											local331 = false;
										}
										if (local331 && !method224(local291)) {
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
								var12 = arg0[local14 - 1];
							}
							var13 = ' ';
							if (local18 < arg0.length) {
								var13 = arg0[local18];
							}
							@Pc(201) byte local201 = method214(564, var12);
							@Pc(205) byte local205 = method214(564, var13);
							if (arg2 != null && method211(local205, arg2, local201)) {
								local173 = false;
							}
						}
						if (local173) {
							@Pc(381) int local381 = 0;
							@Pc(383) int local383 = 0;
							@Pc(385) int local385 = -1;
							for (local269 = local14; local269 < local18; local269++) {
								if (method221(arg0[local269], (byte) 4)) {
									local381++;
								} else if (method220(arg0[local269])) {
									local383++;
									local385 = local269;
								}
							}
							if (local385 > -1) {
								local381 -= local18 - local385 - 1;
							}
							if (local381 <= local383) {
								for (@Pc(427) int local427 = local14; local427 < local18; local427++) {
									arg0[local427] = '*';
								}
							} else {
								local24 = 1;
							}
						}
					}
				}
			}
		} catch (@Pc(454) RuntimeException local454) {
			signlink.reporterror("79527, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + local454.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JSEWQIYU", name = "a", descriptor = "(B[[BBZ)Z")
	private static boolean method211(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) byte arg2) {
		try {
			@Pc(9) int local9 = 0;
			if (arg1[0][0] == arg2 && arg1[0][1] == arg0) {
				return true;
			}
			@Pc(30) int local30 = arg1.length - 1;
			if (arg1[local30][0] == arg2 && arg1[local30][1] == arg0) {
				return true;
			}
			do {
				@Pc(52) int local52 = (local9 + local30) / 2;
				if (arg1[local52][0] == arg2 && arg1[local52][1] == arg0) {
					return true;
				}
				if (arg2 < arg1[local52][0] || arg2 == arg1[local52][0] && arg0 < arg1[local52][1]) {
					local30 = local52;
				} else {
					local9 = local52;
				}
			} while (local9 != local30 && local9 + 1 != local30);
			return false;
		} catch (@Pc(106) RuntimeException local106) {
			signlink.reporterror("85653, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + local106.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JSEWQIYU", name = "a", descriptor = "(CCZC)I")
	private static int method212(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(3) char arg2) {
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
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("47132, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JSEWQIYU", name = "b", descriptor = "(CCZC)I")
	private static int method213(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(3) char arg2) {
		try {
			if (arg0 == arg1) {
				return 1;
			}
			if (arg0 >= 'a' && arg0 <= 'm') {
				if (arg0 == 'a') {
					if (arg1 != '4' && arg1 != '@' && arg1 != '^') {
						if (arg1 == '/' && arg2 == '\\') {
							return 2;
						}
						return 0;
					}
					return 1;
				}
				if (arg0 == 'b') {
					if (arg1 != '6' && arg1 != '8') {
						if ((arg1 != '1' || arg2 != '3') && (arg1 != 'i' || arg2 != '3')) {
							return 0;
						}
						return 2;
					}
					return 1;
				}
				if (arg0 == 'c') {
					if (arg1 != '(' && arg1 != '<' && arg1 != '{' && arg1 != '[') {
						return 0;
					}
					return 1;
				}
				if (arg0 == 'd') {
					if ((arg1 != '[' || arg2 != ')') && (arg1 != 'i' || arg2 != ')')) {
						return 0;
					}
					return 2;
				}
				if (arg0 == 'e') {
					if (arg1 != '3' && arg1 != '€') {
						return 0;
					}
					return 1;
				}
				if (arg0 == 'f') {
					if (arg1 == 'p' && arg2 == 'h') {
						return 2;
					}
					if (arg1 == '£') {
						return 1;
					}
					return 0;
				}
				if (arg0 == 'g') {
					if (arg1 != '9' && arg1 != '6' && arg1 != 'q') {
						return 0;
					}
					return 1;
				}
				if (arg0 == 'h') {
					if (arg1 == '#') {
						return 1;
					}
					return 0;
				}
				if (arg0 == 'i') {
					if (arg1 != 'y' && arg1 != 'l' && arg1 != 'j' && arg1 != '1' && arg1 != '!' && arg1 != ':' && arg1 != ';' && arg1 != '|') {
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
					if (arg1 != '1' && arg1 != '|' && arg1 != 'i') {
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
					if (arg1 != '0' && arg1 != '*') {
						if ((arg1 != '(' || arg2 != ')') && (arg1 != '[' || arg2 != ']') && (arg1 != '{' || arg2 != '}') && (arg1 != '<' || arg2 != '>')) {
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
					if (arg1 != '5' && arg1 != 'z' && arg1 != '$' && arg1 != '2') {
						return 0;
					}
					return 1;
				}
				if (arg0 == 't') {
					if (arg1 != '7' && arg1 != '+') {
						return 0;
					}
					return 1;
				}
				if (arg0 == 'u') {
					if (arg1 == 'v') {
						return 1;
					}
					if ((arg1 != '\\' || arg2 != '/') && (arg1 != '\\' || arg2 != '|') && (arg1 != '|' || arg2 != '/')) {
						return 0;
					}
					return 2;
				}
				if (arg0 == 'v') {
					if ((arg1 != '\\' || arg2 != '/') && (arg1 != '\\' || arg2 != '|') && (arg1 != '|' || arg2 != '/')) {
						return 0;
					}
					return 2;
				}
				if (arg0 == 'w') {
					if (arg1 == 'v' && arg2 == 'v') {
						return 2;
					}
					return 0;
				}
				if (arg0 == 'x') {
					if ((arg1 != ')' || arg2 != '(') && (arg1 != '}' || arg2 != '{') && (arg1 != ']' || arg2 != '[') && (arg1 != '>' || arg2 != '<')) {
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
					if (arg1 == 'o' || arg1 == 'O') {
						return 1;
					} else if ((arg1 != '(' || arg2 != ')') && (arg1 != '{' || arg2 != '}') && (arg1 != '[' || arg2 != ']')) {
						return 0;
					} else {
						return 2;
					}
				} else if (arg0 == '1') {
					return arg1 == 'l' ? 1 : 0;
				} else {
					return 0;
				}
			} else if (arg0 == ',') {
				return arg1 == '.' ? 1 : 0;
			} else if (arg0 == '.') {
				return arg1 == ',' ? 1 : 0;
			} else if (arg0 == '!') {
				return arg1 == 'i' ? 1 : 0;
			} else {
				return 0;
			}
		} catch (@Pc(512) RuntimeException local512) {
			signlink.reporterror("2224, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + local512.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JSEWQIYU", name = "a", descriptor = "(IC)B")
	private static byte method214(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		try {
			@Pc(3) boolean local3 = false;
			if (arg1 >= 'a' && arg1 <= 'z') {
				return (byte) (arg1 + 1 - 'a');
			} else if (arg1 == '\'') {
				return 28;
			} else if (arg1 >= '0' && arg1 <= '9') {
				return (byte) (arg1 + 29 - '0');
			} else {
				return 27;
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("83890, " + arg0 + ", " + arg1 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JSEWQIYU", name = "c", descriptor = "(I[C)V")
	private static void method215(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(9) int local9 = 0;
			@Pc(11) int local11 = 0;
			@Pc(13) int local13 = 0;
			while (true) {
				do {
					@Pc(112) int local112;
					if ((local112 = method216(arg0, local9)) == -1) {
						return;
					}
					@Pc(17) boolean local17 = false;
					for (@Pc(19) int local19 = local9; local19 >= 0 && local19 < local112 && !local17; local19++) {
						if (!method218(arg0[local19]) && !method219(arg0[local19])) {
							local17 = true;
						}
					}
					if (local17) {
						local11 = 0;
					}
					if (local11 == 0) {
						local13 = local112;
					}
					local9 = method217(anInt283, arg0, local112);
					@Pc(58) int local58 = 0;
					for (@Pc(60) int local60 = local112; local60 < local9; local60++) {
						local58 = local58 * 10 + arg0[local60] - 48;
					}
					if (local58 <= 255 && local9 - local112 <= 8) {
						local11++;
					} else {
						local11 = 0;
					}
				} while (local11 != 4);
				for (@Pc(94) int local94 = local13; local94 < local9; local94++) {
					arg0[local94] = '*';
				}
				local11 = 0;
			}
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("19631, " + 142 + ", " + arg0 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JSEWQIYU", name = "a", descriptor = "([CBI)I")
	private static int method216(@OriginalArg(0) char[] arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(6) int local6 = arg1; local6 < arg0.length && local6 >= 0; local6++) {
				if (arg0[local6] >= '0' && arg0[local6] <= '9') {
					return local6;
				}
			}
			return -1;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("42833, " + arg0 + ", " + 6 + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JSEWQIYU", name = "a", descriptor = "(I[CI)I")
	private static int method217(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(1) int local1 = arg2;
			while (true) {
				if (local1 < arg1.length && local1 >= 0) {
					if (arg1[local1] >= '0' && arg1[local1] <= '9') {
						local1++;
						continue;
					}
					return local1;
				}
				if (arg0 != 0) {
					aBoolean92 = true;
				}
				return arg1.length;
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("66060, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JSEWQIYU", name = "b", descriptor = "(IC)Z")
	private static boolean method218(@OriginalArg(1) char arg0) {
		try {
			return !method220(arg0) && !method221(arg0, (byte) 4);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("99910, " + -304 + ", " + arg0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JSEWQIYU", name = "b", descriptor = "(CI)Z")
	private static boolean method219(@OriginalArg(0) char arg0) {
		try {
			if (arg0 >= 'a' && arg0 <= 'z') {
				return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
			} else {
				return true;
			}
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("67113, " + arg0 + ", " + 0 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JSEWQIYU", name = "a", descriptor = "(BC)Z")
	private static boolean method220(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("78085, " + 2 + ", " + arg0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JSEWQIYU", name = "a", descriptor = "(CB)Z")
	private static boolean method221(@OriginalArg(0) char arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(4) boolean local4 = false;
			return arg0 >= '0' && arg0 <= '9';
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("43603, " + arg0 + ", " + arg1 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JSEWQIYU", name = "c", descriptor = "(CI)Z")
	private static boolean method222(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z';
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("87094, " + arg0 + ", " + -862 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JSEWQIYU", name = "c", descriptor = "(IC)Z")
	private static boolean method223(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		try {
			if (arg0 < 6 || arg0 > 6) {
				for (@Pc(7) int local7 = 1; local7 > 0; local7++) {
				}
			}
			return arg1 >= 'A' && arg1 <= 'Z';
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("67707, " + arg0 + ", " + arg1 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JSEWQIYU", name = "a", descriptor = "([CI)Z")
	private static boolean method224(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				if (!method221(arg0[local5], (byte) 4) && arg0[local5] != '\u0000') {
					local3 = false;
				}
			}
			if (local3) {
				return true;
			}
			@Pc(32) int local32 = method225(arg0);
			@Pc(34) int local34 = 0;
			@Pc(39) int local39 = anIntArray59.length - 1;
			if (local32 == anIntArray59[0] || local32 == anIntArray59[local39]) {
				return true;
			}
			do {
				@Pc(63) int local63 = (local34 + local39) / 2;
				if (local32 == anIntArray59[local63]) {
					return true;
				}
				if (local32 < anIntArray59[local63]) {
					local39 = local63;
				} else {
					local34 = local63;
				}
			} while (local34 != local39 && local34 + 1 != local39);
			return false;
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("22355, " + arg0 + ", " + 0 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JSEWQIYU", name = "a", descriptor = "([CB)I")
	private static int method225(@OriginalArg(0) char[] arg0) {
		try {
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
			signlink.reporterror("76526, " + arg0 + ", " + 1 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}
}
