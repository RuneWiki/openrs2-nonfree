import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!qc")
public final class Class35 {

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
	private static int anInt875;

	@OriginalMember(owner = "client!qc", name = "m", descriptor = "[I")
	private static int[] anIntArray233;

	@OriginalMember(owner = "client!qc", name = "n", descriptor = "[[C")
	private static char[][] aCharArrayArray1;

	@OriginalMember(owner = "client!qc", name = "o", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!qc", name = "p", descriptor = "[[C")
	private static char[][] aCharArrayArray2;

	@OriginalMember(owner = "client!qc", name = "q", descriptor = "[[C")
	private static char[][] aCharArrayArray3;

	@OriginalMember(owner = "client!qc", name = "r", descriptor = "[I")
	private static int[] anIntArray234;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "Z")
	private static boolean aBoolean195 = true;

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
	private static int anInt874 = -5797;

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "Z")
	private static boolean aBoolean197 = true;

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
	private static int anInt876 = -556;

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
	private static int anInt877 = -556;

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "B")
	private static byte aByte35 = 15;

	@OriginalMember(owner = "client!qc", name = "i", descriptor = "B")
	private static byte aByte36 = 2;

	@OriginalMember(owner = "client!qc", name = "j", descriptor = "Z")
	private static boolean aBoolean198 = true;

	@OriginalMember(owner = "client!qc", name = "k", descriptor = "I")
	private static int anInt878 = 27016;

	@OriginalMember(owner = "client!qc", name = "l", descriptor = "I")
	private static int anInt879 = 9;

	@OriginalMember(owner = "client!qc", name = "s", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray11 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops" };

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!yb;)V")
	public static void method536(@OriginalArg(0) Class46 arg0) {
		@Pc(10) Class1_Sub1_Sub3 local10 = new Class1_Sub1_Sub3(arg0.method674("fragmentsenc.txt", null), false);
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(arg0.method674("badenc.txt", null), false);
		@Pc(28) Class1_Sub1_Sub3 local28 = new Class1_Sub1_Sub3(arg0.method674("domainenc.txt", null), false);
		@Pc(37) Class1_Sub1_Sub3 local37 = new Class1_Sub1_Sub3(arg0.method674("tldlist.txt", null), false);
		method537(local10, local19, local28, local37);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!mb;Lclient!mb;Lclient!mb;Lclient!mb;)V")
	private static void method537(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) Class1_Sub1_Sub3 arg2, @OriginalArg(3) Class1_Sub1_Sub3 arg3) {
		method539(arg1);
		method540(arg2);
		method541(arg0);
		method538(arg3);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!mb;B)V")
	private static void method538(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(4) int local4 = arg0.method501();
			aCharArrayArray3 = new char[local4][];
			anIntArray234 = new int[local4];
			for (@Pc(16) int local16 = 0; local16 < local4; local16++) {
				anIntArray234[local16] = arg0.method496();
				@Pc(27) char[] local27 = new char[arg0.method496()];
				for (@Pc(29) int local29 = 0; local29 < local27.length; local29++) {
					local27[local29] = (char) arg0.method496();
				}
				aCharArrayArray3[local16] = local27;
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("17007, " + arg0 + ", " + 66 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!mb;I)V")
	private static void method539(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(2) int local2 = arg0.method501();
			aCharArrayArray1 = new char[local2][];
			aByteArrayArrayArray8 = new byte[local2][][];
			method542(arg0, aByteArrayArrayArray8, aCharArrayArray1);
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("73851, " + arg0 + ", " + 6 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(Lclient!mb;I)V")
	private static void method540(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(2) int local2 = arg0.method501();
			aCharArrayArray2 = new char[local2][];
			method543(aCharArrayArray2, arg0);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("93741, " + arg0 + ", " + -826 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZLclient!mb;)V")
	private static void method541(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			anIntArray233 = new int[arg0.method501()];
			for (@Pc(9) int local9 = 0; local9 < anIntArray233.length; local9++) {
				anIntArray233[local9] = arg0.method498();
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("43574, " + false + ", " + arg0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!mb;[[[B[[CI)V")
	private static void method542(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) char[][] arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < arg2.length; local3++) {
				@Pc(9) char[] local9 = new char[arg0.method496()];
				for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
					local9[local11] = (char) arg0.method496();
				}
				arg2[local3] = local9;
				@Pc(33) byte[][] local33 = new byte[arg0.method496()][2];
				for (@Pc(35) int local35 = 0; local35 < local33.length; local35++) {
					local33[local35][0] = (byte) arg0.method496();
					local33[local35][1] = (byte) arg0.method496();
				}
				if (local33.length > 0) {
					arg1[local3] = local33;
				}
			}
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("52959, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 1 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "([[CLclient!mb;I)V")
	private static void method543(@OriginalArg(0) char[][] arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			for (@Pc(6) int local6 = 0; local6 < arg0.length; local6++) {
				@Pc(12) char[] local12 = new char[arg1.method496()];
				for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
					local12[local14] = (char) arg1.method496();
				}
				arg0[local6] = local12;
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("7464, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z[C)V")
	private static void method544(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) int local3 = 0;
			for (@Pc(14) int local14 = 0; local14 < arg0.length; local14++) {
				if (method545(arg0[local14])) {
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
			signlink.reporterror("55363, " + false + ", " + arg0 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IC)Z")
	private static boolean method545(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= ' ' && arg0 <= '\u007f' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("41698, " + 0 + ", " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method546(@OriginalArg(0) String arg0) {
		try {
			@Pc(3) long local3 = System.currentTimeMillis();
			@Pc(6) char[] local6 = arg0.toCharArray();
			method544(local6);
			@Pc(29) String local29 = (new String(local6)).trim();
			@Pc(33) char[] local33 = local29.toLowerCase().toCharArray();
			@Pc(36) String local36 = local29.toLowerCase();
			method554(local33);
			method549(local33, aByte35);
			method550(local33, (byte) 1);
			method563(local33);
			for (@Pc(50) int local50 = 0; local50 < aStringArray11.length; local50++) {
				@Pc(54) int local54 = -1;
				while ((local54 = local36.indexOf(aStringArray11[local50], local54 + 1)) != -1) {
					@Pc(61) char[] local61 = aStringArray11[local50].toCharArray();
					for (@Pc(63) int local63 = 0; local63 < local61.length; local63++) {
						local33[local63 + local54] = local61[local63];
					}
				}
			}
			method547(local29.toCharArray(), local33, anInt876);
			method548(local33);
			@Pc(105) long local105 = System.currentTimeMillis();
			return (new String(local33)).trim();
		} catch (@Pc(112) RuntimeException local112) {
			signlink.reporterror("68738, " + arg0 + ", " + 0 + ", " + local112.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "([C[CI)V")
	private static void method547(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg2 < 0) {
				for (@Pc(8) int local8 = 0; local8 < arg0.length; local8++) {
					if (arg1[local8] != '*' && method571(arg0[local8])) {
						arg1[local8] = arg0[local8];
					}
				}
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("2695, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "([CZ)V")
	private static void method548(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				@Pc(11) char local11 = arg0[local5];
				if (!method568(local11)) {
					local3 = true;
				} else if (local3) {
					if (method570(local11, anInt879)) {
						local3 = false;
					}
				} else if (method571(local11)) {
					arg0[local5] = (char) (local11 + 'a' - 65);
				}
			}
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("44016, " + arg0 + ", " + false + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "([CB)V")
	private static void method549(@OriginalArg(0) char[] arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(10) int local10;
			for (@Pc(3) int local3 = 0; local3 < 2; local3++) {
				for (local10 = aCharArrayArray1.length - 1; local10 >= 0; local10--) {
					method558(aCharArrayArray1[local10], 404, aByteArrayArrayArray8[local10], arg0);
				}
			}
			if (arg1 != 15) {
				for (local10 = 1; local10 > 0; local10++) {
				}
			}
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("53417, " + arg0 + ", " + arg1 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "([CB)V")
	private static void method550(@OriginalArg(0) char[] arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(5) char[] local5 = (char[]) arg0.clone();
			@Pc(20) char[] local20 = new char[] { '(', 'a', ')' };
			method558(local20, 404, null, local5);
			@Pc(29) char[] local29 = (char[]) arg0.clone();
			@Pc(44) char[] local44 = new char[] { 'd', 'o', 't' };
			@Pc(49) boolean local49 = false;
			method558(local44, 404, null, local29);
			for (@Pc(62) int local62 = aCharArrayArray2.length - 1; local62 >= 0; local62--) {
				method551(aCharArrayArray2[local62], arg0, local29, local5);
			}
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("92665, " + arg0 + ", " + arg1 + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "([C[CB[C[C)V")
	private static void method551(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(3) char[] arg2, @OriginalArg(4) char[] arg3) {
		try {
			if (arg0.length <= arg1.length) {
				@Pc(19) int local19;
				for (@Pc(11) int local11 = 0; local11 <= arg1.length - arg0.length; local11 += local19) {
					@Pc(15) int local15 = local11;
					@Pc(17) int local17 = 0;
					local19 = 1;
					label59: while (true) {
						while (true) {
							if (local15 >= arg1.length) {
								break label59;
							}
							@Pc(27) char local27 = arg1[local15];
							@Pc(29) char local29 = 0;
							if (local15 + 1 < arg1.length) {
								local29 = arg1[local15 + 1];
							}
							@Pc(54) int local54;
							if (local17 < arg0.length && (local54 = method560(arg0[local17], local29, local27)) > 0) {
								local15 += local54;
								local17++;
							} else {
								if (local17 == 0) {
									break label59;
								}
								@Pc(75) int local75;
								if ((local75 = method560(arg0[local17 - 1], local29, local27)) > 0) {
									local15 += local75;
									if (local17 == 1) {
										local19++;
									}
								} else {
									if (local17 >= arg0.length || !method566(local27)) {
										break label59;
									}
									local15++;
								}
							}
						}
					}
					if (local17 >= arg0.length) {
						@Pc(106) boolean local106 = false;
						@Pc(112) int local112 = method552(local11, arg1, arg3);
						@Pc(120) int local120 = method553(arg2, local15 - 1, arg1);
						if (local112 > 2 || local120 > 2) {
							local106 = true;
						}
						if (local106) {
							for (@Pc(132) int local132 = local11; local132 < local15; local132++) {
								arg1[local132] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("2439, " + arg0 + ", " + arg1 + ", " + 57 + ", " + arg2 + ", " + arg3 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IZ[C[C)I")
	private static int method552(@OriginalArg(0) int arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg0 == 0) {
				return 2;
			}
			for (@Pc(9) int local9 = arg0 - 1; local9 >= 0 && method566(arg1[local9]); local9--) {
				if (arg1[local9] == '@') {
					return 3;
				}
			}
			@Pc(29) int local29 = 0;
			for (@Pc(33) int local33 = arg0 - 1; local33 >= 0 && method566(arg2[local33]); local33--) {
				if (arg2[local33] == '*') {
					local29++;
				}
			}
			if (local29 >= 3) {
				return 4;
			} else if (method566(arg1[arg0 - 1])) {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("11350, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "([CII[C)I")
	private static int method553(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg1 + 1 == arg2.length) {
				return 2;
			}
			@Pc(22) int local22 = arg1 + 1;
			while (true) {
				if (local22 < arg2.length && method566(arg2[local22])) {
					if (arg2[local22] != '.' && arg2[local22] != ',') {
						local22++;
						continue;
					}
					return 3;
				}
				@Pc(49) int local49 = 0;
				for (@Pc(53) int local53 = arg1 + 1; local53 < arg2.length && method566(arg0[local53]); local53++) {
					if (arg0[local53] == '*') {
						local49++;
					}
				}
				if (local49 >= 3) {
					return 4;
				}
				if (method566(arg2[arg1 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("94894, " + arg0 + ", " + arg1 + ", " + -412 + ", " + arg2 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "([CI)V")
	private static void method554(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(16) char[] local16 = (char[]) arg0.clone();
			@Pc(31) char[] local31 = new char[] { 'd', 'o', 't' };
			method558(local31, 404, null, local16);
			@Pc(40) char[] local40 = (char[]) arg0.clone();
			@Pc(63) char[] local63 = new char[] { 's', 'l', 'a', 's', 'h' };
			method558(local63, 404, null, local40);
			for (@Pc(70) int local70 = 0; local70 < aCharArrayArray3.length; local70++) {
				method555(arg0, local16, local40, anIntArray234[local70], (byte) 2, aCharArrayArray3[local70]);
			}
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("77781, " + arg0 + ", " + -303 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "([C[C[CIB[C)V")
	private static void method555(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) char[] arg5) {
		try {
			if (arg5.length <= arg0.length) {
				if (aByte36 == 2) {
					@Pc(14) boolean local14 = false;
				}
				@Pc(32) int local32;
				for (@Pc(24) int local24 = 0; local24 <= arg0.length - arg5.length; local24 += local32) {
					@Pc(28) int local28 = local24;
					@Pc(30) int local30 = 0;
					local32 = 1;
					label124: while (true) {
						while (true) {
							if (local28 >= arg0.length) {
								break label124;
							}
							@Pc(40) char local40 = arg0[local28];
							@Pc(42) char local42 = 0;
							if (local28 + 1 < arg0.length) {
								local42 = arg0[local28 + 1];
							}
							@Pc(67) int local67;
							if (local30 < arg5.length && (local67 = method560(arg5[local30], local42, local40)) > 0) {
								local28 += local67;
								local30++;
							} else {
								if (local30 == 0) {
									break label124;
								}
								@Pc(88) int local88;
								if ((local88 = method560(arg5[local30 - 1], local42, local40)) > 0) {
									local28 += local88;
									if (local30 == 1) {
										local32++;
									}
								} else {
									if (local30 >= arg5.length || !method566(local40)) {
										break label124;
									}
									local28++;
								}
							}
						}
					}
					if (local30 >= arg5.length) {
						@Pc(119) boolean local119 = false;
						@Pc(125) int local125 = method556(arg1, arg0, local24);
						@Pc(133) int local133 = method557(arg0, arg2, local28 - 1);
						if (arg3 == 1 && local125 > 0 && local133 > 0) {
							local119 = true;
						}
						if (arg3 == 2 && (local125 > 2 && local133 > 0 || local125 > 0 && local133 > 2)) {
							local119 = true;
						}
						if (arg3 == 3 && local125 > 0 && local133 > 2) {
							local119 = true;
						}
						@Pc(176) boolean local176;
						if (arg3 == 3 && local125 > 2 && local133 > 0) {
							local176 = true;
						} else {
							local176 = false;
						}
						if (local119) {
							@Pc(183) int local183 = local24;
							@Pc(187) int local187 = local28 - 1;
							@Pc(195) boolean local195;
							@Pc(199) int local199;
							if (local125 > 2) {
								if (local125 == 4) {
									local195 = false;
									for (local199 = local24 - 1; local199 >= 0; local199--) {
										if (local195) {
											if (arg1[local199] != '*') {
												break;
											}
											local183 = local199;
										} else if (arg1[local199] == '*') {
											local183 = local199;
											local195 = true;
										}
									}
								}
								local195 = false;
								for (local199 = local183 - 1; local199 >= 0; local199--) {
									if (local195) {
										if (method566(arg0[local199])) {
											break;
										}
										local183 = local199;
									} else if (!method566(arg0[local199])) {
										local195 = true;
										local183 = local199;
									}
								}
							}
							if (local133 > 2) {
								if (local133 == 4) {
									local195 = false;
									for (local199 = local187 + 1; local199 < arg0.length; local199++) {
										if (local195) {
											if (arg2[local199] != '*') {
												break;
											}
											local187 = local199;
										} else if (arg2[local199] == '*') {
											local187 = local199;
											local195 = true;
										}
									}
								}
								local195 = false;
								for (local199 = local187 + 1; local199 < arg0.length; local199++) {
									if (local195) {
										if (method566(arg0[local199])) {
											break;
										}
										local187 = local199;
									} else if (!method566(arg0[local199])) {
										local195 = true;
										local187 = local199;
									}
								}
							}
							for (@Pc(333) int local333 = local183; local333 <= local187; local333++) {
								arg0[local333] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(356) RuntimeException local356) {
			signlink.reporterror("3957, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local356.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z[C[CI)I")
	private static int method556(@OriginalArg(1) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 == 0) {
				return 2;
			}
			@Pc(9) int local9 = arg2 - 1;
			while (true) {
				if (local9 >= 0 && method566(arg1[local9])) {
					if (arg1[local9] != ',' && arg1[local9] != '.') {
						local9--;
						continue;
					}
					return 3;
				}
				@Pc(42) int local42 = 0;
				for (@Pc(46) int local46 = arg2 - 1; local46 >= 0 && method566(arg0[local46]); local46--) {
					if (arg0[local46] == '*') {
						local42++;
					}
				}
				if (local42 >= 3) {
					return 4;
				}
				if (method566(arg1[arg2 - 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("9881, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "([CB[CI)I")
	private static int method557(@OriginalArg(0) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 + 1 == arg0.length) {
				return 2;
			}
			@Pc(18) int local18 = arg2 + 1;
			while (true) {
				if (local18 < arg0.length && method566(arg0[local18])) {
					if (arg0[local18] != '\\' && arg0[local18] != '/') {
						local18++;
						continue;
					}
					return 3;
				}
				@Pc(45) int local45 = 0;
				for (@Pc(49) int local49 = arg2 + 1; local49 < arg0.length && method566(arg1[local49]); local49++) {
					if (arg1[local49] == '*') {
						local45++;
					}
				}
				if (local45 >= 5) {
					return 4;
				}
				if (method566(arg0[arg2 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("69408, " + arg0 + ", " + -54 + ", " + arg1 + ", " + arg2 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "([CI[[B[C)V")
	private static void method558(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) char[] arg3) {
		try {
			if (arg0.length <= arg3.length) {
				@Pc(21) int local21;
				for (@Pc(11) int local11 = 0; local11 <= arg3.length - arg0.length; local11 += local21) {
					@Pc(15) int local15 = local11;
					@Pc(17) int local17 = 0;
					@Pc(19) int local19 = 0;
					local21 = 1;
					@Pc(23) boolean local23 = false;
					@Pc(25) boolean local25 = false;
					@Pc(27) boolean local27 = false;
					@Pc(35) char var13;
					@Pc(37) char var14;
					label163: while (true) {
						while (true) {
							if (local15 >= arg3.length || local25 && local27) {
								break label163;
							}
							var13 = arg3[local15];
							var14 = '\u0000';
							if (local15 + 1 < arg3.length) {
								var14 = arg3[local15 + 1];
							}
							@Pc(62) int local62;
							if (local17 < arg0.length && (local62 = method561(arg0[local17], var14, var13)) > 0) {
								if (local62 == 1 && method569(var13)) {
									local25 = true;
								}
								if (local62 == 2 && (method569(var13) || method569(var14))) {
									local25 = true;
								}
								local15 += local62;
								local17++;
							} else {
								if (local17 == 0) {
									break label163;
								}
								@Pc(105) int local105;
								if ((local105 = method561(arg0[local17 - 1], var14, var13)) > 0) {
									local15 += local105;
									if (local17 == 1) {
										local21++;
									}
								} else {
									if (local17 >= arg0.length || !method567(414, var13)) {
										break label163;
									}
									if (method566(var13) && var13 != '\'') {
										local23 = true;
									}
									if (method569(var13)) {
										local27 = true;
									}
									local15++;
									local19++;
									if (local19 * 100 / (local15 - local11) > 90) {
										break label163;
									}
								}
							}
						}
					}
					if (local17 >= arg0.length && (!local25 || !local27)) {
						@Pc(170) boolean local170 = true;
						@Pc(266) int local266;
						if (local23) {
							@Pc(216) boolean local216 = false;
							@Pc(218) boolean local218 = false;
							if (local11 - 1 < 0 || method566(arg3[local11 - 1]) && arg3[local11 - 1] != '\'') {
								local216 = true;
							}
							if (local15 >= arg3.length || method566(arg3[local15]) && arg3[local15] != '\'') {
								local218 = true;
							}
							if (!local216 || !local218) {
								@Pc(262) boolean local262 = false;
								local266 = local11 - 2;
								if (local216) {
									local266 = local11;
								}
								while (!local262 && local266 < local15) {
									if (local266 >= 0 && (!method566(arg3[local266]) || arg3[local266] == '\'')) {
										@Pc(288) char[] local288 = new char[3];
										@Pc(290) int local290;
										for (local290 = 0; local290 < 3 && local266 + local290 < arg3.length && (!method566(arg3[local266 + local290]) || arg3[local266 + local290] == '\''); local290++) {
											local288[local290] = arg3[local266 + local290];
										}
										@Pc(328) boolean local328 = true;
										if (local290 == 0) {
											local328 = false;
										}
										if (local290 < 3 && local266 - 1 >= 0 && (!method566(arg3[local266 - 1]) || arg3[local266 - 1] == '\'')) {
											local328 = false;
										}
										if (local328 && !method572(local288)) {
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
							var13 = ' ';
							if (local11 - 1 >= 0) {
								var13 = arg3[local11 - 1];
							}
							var14 = ' ';
							if (local15 < arg3.length) {
								var14 = arg3[local15];
							}
							@Pc(198) byte local198 = method562(var13);
							@Pc(202) byte local202 = method562(var14);
							if (arg2 != null && method559(local198, arg2, local202)) {
								local170 = false;
							}
						}
						if (local170) {
							@Pc(378) int local378 = 0;
							@Pc(380) int local380 = 0;
							@Pc(382) int local382 = -1;
							for (local266 = local11; local266 < local15; local266++) {
								if (method569(arg3[local266])) {
									local378++;
								} else if (method568(arg3[local266])) {
									local380++;
									local382 = local266;
								}
							}
							if (local382 > -1) {
								local378 -= local15 + 1 - local382;
							}
							if (local378 <= local380) {
								for (@Pc(424) int local424 = local11; local424 < local15; local424++) {
									arg3[local424] = '*';
								}
							}
						}
					}
				}
				@Pc(449) boolean local449 = false;
			}
		} catch (@Pc(451) RuntimeException local451) {
			signlink.reporterror("79556, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local451.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(BZ[[BB)Z")
	private static boolean method559(@OriginalArg(0) byte arg0, @OriginalArg(2) byte[][] arg1, @OriginalArg(3) byte arg2) {
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
				@Pc(50) int local50 = (local1 + local22) / 2;
				if (arg1[local50][0] == arg0 && arg1[local50][1] == arg2) {
					return true;
				}
				if (arg0 < arg1[local50][0] || arg0 == arg1[local50][0] && arg2 < arg1[local50][1]) {
					local22 = local50;
				} else {
					local1 = local50;
				}
			} while (local1 != local22 && local1 + 1 != local22);
			return false;
		} catch (@Pc(104) RuntimeException local104) {
			signlink.reporterror("80938, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + local104.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(CCCZ)I")
	private static int method560(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(2) char arg2) {
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
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("10850, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(CCCI)I")
	private static int method561(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(2) char arg2) {
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
		} catch (@Pc(518) RuntimeException local518) {
			signlink.reporterror("29743, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -18724 + ", " + local518.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(CI)B")
	private static byte method562(@OriginalArg(0) char arg0) {
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
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("6805, " + arg0 + ", " + -855 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "([CI)V")
	private static void method563(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			@Pc(9) int local9 = 0;
			while (true) {
				do {
					@Pc(109) int local109;
					if ((local109 = method564(arg0, local5)) == -1) {
						return;
					}
					@Pc(14) boolean local14 = false;
					for (@Pc(16) int local16 = local5; local16 >= 0 && local16 < local109 && !local14; local16++) {
						if (!method566(arg0[local16]) && !method567(414, arg0[local16])) {
							local14 = true;
						}
					}
					if (local14) {
						local7 = 0;
					}
					if (local7 == 0) {
						local9 = local109;
					}
					local5 = method565(local109, arg0);
					@Pc(55) int local55 = 0;
					for (@Pc(57) int local57 = local109; local57 < local5; local57++) {
						local55 = local55 * 10 + arg0[local57] - 48;
					}
					if (local55 <= 255 && local5 - local109 <= 8) {
						local7++;
					} else {
						local7 = 0;
					}
				} while (local7 != 4);
				for (@Pc(91) int local91 = local9; local91 < local5; local91++) {
					arg0[local91] = '*';
				}
				local7 = 0;
			}
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("2217, " + arg0 + ", " + 264 + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I[CI)I")
	private static int method564(@OriginalArg(1) char[] arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(1) int local1 = arg1; local1 < arg0.length && local1 >= 0; local1++) {
				if (arg0[local1] >= '0' && arg0[local1] <= '9') {
					return local1;
				}
			}
			return -1;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("42379, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(I[CI)I")
	private static int method565(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1) {
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
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("10273, " + arg0 + ", " + arg1 + ", " + 530 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(IC)Z")
	private static boolean method566(@OriginalArg(1) char arg0) {
		try {
			return !method568(arg0) && !method569(arg0);
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("36325, " + 31802 + ", " + arg0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "(IC)Z")
	private static boolean method567(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		try {
			@Pc(3) boolean local3 = false;
			if (arg1 >= 'a' && arg1 <= 'z') {
				return arg1 == 'v' || arg1 == 'x' || arg1 == 'j' || arg1 == 'q' || arg1 == 'z';
			} else {
				return true;
			}
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("58610, " + arg0 + ", " + arg1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "(IC)Z")
	private static boolean method568(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("45718, " + -209 + ", " + arg0 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(CI)Z")
	private static boolean method569(@OriginalArg(0) char arg0) {
		try {
			if (anInt878 != 27016) {
				throw new NullPointerException();
			}
			return arg0 >= '0' && arg0 <= '9';
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("8003, " + arg0 + ", " + 27016 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "(CI)Z")
	private static boolean method570(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 != 9) {
				throw new NullPointerException();
			}
			return arg0 >= 'a' && arg0 <= 'z';
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("31175, " + arg0 + ", " + arg1 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "(IC)Z")
	private static boolean method571(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("89799, " + -663 + ", " + arg0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(Z[C)Z")
	private static boolean method572(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				if (!method569(arg0[local5]) && arg0[local5] != '\u0000') {
					local3 = false;
				}
			}
			if (local3) {
				return true;
			}
			@Pc(32) int local32 = method573(arg0);
			@Pc(34) int local34 = 0;
			@Pc(45) int local45 = anIntArray233.length - 1;
			if (local32 == anIntArray233[0] || local32 == anIntArray233[local45]) {
				return true;
			}
			do {
				@Pc(63) int local63 = (local34 + local45) / 2;
				if (local32 == anIntArray233[local63]) {
					return true;
				}
				if (local32 < anIntArray233[local63]) {
					local45 = local63;
				} else {
					local34 = local63;
				}
			} while (local34 != local45 && local34 + 1 != local45);
			return false;
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("8988, " + true + ", " + arg0 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "([CZ)I")
	private static int method573(@OriginalArg(0) char[] arg0) {
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
			signlink.reporterror("9487, " + arg0 + ", " + true + ", " + local85.toString());
			throw new RuntimeException();
		}
	}
}
