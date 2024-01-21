import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!KMKDGUZT")
public final class Class20 {

	@OriginalMember(owner = "client!KMKDGUZT", name = "j", descriptor = "I")
	private static int anInt396;

	@OriginalMember(owner = "client!KMKDGUZT", name = "l", descriptor = "[I")
	private static int[] anIntArray113;

	@OriginalMember(owner = "client!KMKDGUZT", name = "m", descriptor = "[[C")
	private static char[][] aCharArrayArray1;

	@OriginalMember(owner = "client!KMKDGUZT", name = "n", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!KMKDGUZT", name = "o", descriptor = "[[C")
	private static char[][] aCharArrayArray2;

	@OriginalMember(owner = "client!KMKDGUZT", name = "p", descriptor = "[[C")
	private static char[][] aCharArrayArray3;

	@OriginalMember(owner = "client!KMKDGUZT", name = "q", descriptor = "[I")
	private static int[] anIntArray114;

	@OriginalMember(owner = "client!KMKDGUZT", name = "a", descriptor = "I")
	private static int anInt392 = 25914;

	@OriginalMember(owner = "client!KMKDGUZT", name = "b", descriptor = "Z")
	private static boolean aBoolean95 = true;

	@OriginalMember(owner = "client!KMKDGUZT", name = "c", descriptor = "B")
	private static byte aByte11 = 66;

	@OriginalMember(owner = "client!KMKDGUZT", name = "d", descriptor = "I")
	private static int anInt393 = 17009;

	@OriginalMember(owner = "client!KMKDGUZT", name = "e", descriptor = "I")
	private static int anInt394 = 604;

	@OriginalMember(owner = "client!KMKDGUZT", name = "f", descriptor = "I")
	private static int anInt395 = 8;

	@OriginalMember(owner = "client!KMKDGUZT", name = "g", descriptor = "Z")
	private static boolean aBoolean96 = true;

	@OriginalMember(owner = "client!KMKDGUZT", name = "h", descriptor = "B")
	private static byte aByte12 = -2;

	@OriginalMember(owner = "client!KMKDGUZT", name = "i", descriptor = "B")
	private static byte aByte13 = -2;

	@OriginalMember(owner = "client!KMKDGUZT", name = "r", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray2;

	static {
		aBoolean97 = true;
		aStringArray2 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };
	}

	@OriginalMember(owner = "client!KMKDGUZT", name = "a", descriptor = "(Lclient!MNPBQFWE;)V")
	public static void method270(@OriginalArg(0) Class27 arg0) {
		@Pc(10) Class1_Sub1_Sub2 local10 = new Class1_Sub1_Sub2(false, arg0.method340("fragmentsenc.txt", null));
		@Pc(19) Class1_Sub1_Sub2 local19 = new Class1_Sub1_Sub2(false, arg0.method340("badenc.txt", null));
		@Pc(28) Class1_Sub1_Sub2 local28 = new Class1_Sub1_Sub2(false, arg0.method340("domainenc.txt", null));
		@Pc(37) Class1_Sub1_Sub2 local37 = new Class1_Sub1_Sub2(false, arg0.method340("tldlist.txt", null));
		method271(local10, local19, local28, local37);
	}

	@OriginalMember(owner = "client!KMKDGUZT", name = "a", descriptor = "(Lclient!BJPWOXRJ;Lclient!BJPWOXRJ;Lclient!BJPWOXRJ;Lclient!BJPWOXRJ;)V")
	private static void method271(@OriginalArg(0) Class1_Sub1_Sub2 arg0, @OriginalArg(1) Class1_Sub1_Sub2 arg1, @OriginalArg(2) Class1_Sub1_Sub2 arg2, @OriginalArg(3) Class1_Sub1_Sub2 arg3) {
		method273(arg1);
		method274(arg2);
		method275(arg0);
		method272(aByte11, arg3);
	}

	@OriginalMember(owner = "client!KMKDGUZT", name = "a", descriptor = "(BLclient!BJPWOXRJ;)V")
	private static void method272(@OriginalArg(0) byte arg0, @OriginalArg(1) Class1_Sub1_Sub2 arg1) {
		try {
			@Pc(4) int local4 = arg1.method27();
			aCharArrayArray3 = new char[local4][];
			anIntArray114 = new int[local4];
			for (@Pc(12) int local12 = 0; local12 < local4; local12++) {
				anIntArray114[local12] = arg1.method22();
				@Pc(23) char[] local23 = new char[arg1.method22()];
				for (@Pc(25) int local25 = 0; local25 < local23.length; local25++) {
					local23[local25] = (char) arg1.method22();
				}
				aCharArrayArray3[local12] = local23;
			}
			if (arg0 == 66) {
				;
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("515, " + arg0 + ", " + arg1 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KMKDGUZT", name = "a", descriptor = "(ZLclient!BJPWOXRJ;)V")
	private static void method273(@OriginalArg(1) Class1_Sub1_Sub2 arg0) {
		try {
			@Pc(10) int local10 = arg0.method27();
			aCharArrayArray1 = new char[local10][];
			aByteArrayArrayArray1 = new byte[local10][][];
			method276(arg0, aByteArrayArrayArray1, aCharArrayArray1);
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("57166, " + false + ", " + arg0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KMKDGUZT", name = "a", descriptor = "(ILclient!BJPWOXRJ;)V")
	private static void method274(@OriginalArg(1) Class1_Sub1_Sub2 arg0) {
		try {
			@Pc(6) int local6 = arg0.method27();
			aCharArrayArray2 = new char[local6][];
			method277(arg0, aCharArrayArray2);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("82441, " + -38943 + ", " + arg0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KMKDGUZT", name = "a", descriptor = "(Lclient!BJPWOXRJ;B)V")
	private static void method275(@OriginalArg(0) Class1_Sub1_Sub2 arg0) {
		try {
			anIntArray113 = new int[arg0.method27()];
			for (@Pc(9) int local9 = 0; local9 < anIntArray113.length; local9++) {
				anIntArray113[local9] = arg0.method24();
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("56037, " + arg0 + ", " + -125 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KMKDGUZT", name = "a", descriptor = "(Lclient!BJPWOXRJ;[[[B[[CI)V")
	private static void method276(@OriginalArg(0) Class1_Sub1_Sub2 arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) char[][] arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < arg2.length; local3++) {
				@Pc(9) char[] local9 = new char[arg0.method22()];
				for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
					local9[local11] = (char) arg0.method22();
				}
				arg2[local3] = local9;
				@Pc(33) byte[][] local33 = new byte[arg0.method22()][2];
				for (@Pc(35) int local35 = 0; local35 < local33.length; local35++) {
					local33[local35][0] = (byte) arg0.method22();
					local33[local35][1] = (byte) arg0.method22();
				}
				if (local33.length > 0) {
					arg1[local3] = local33;
				}
			}
			if (anInt393 != 17009) {
				aBoolean97 = true;
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("89029, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 17009 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KMKDGUZT", name = "a", descriptor = "(ILclient!BJPWOXRJ;[[C)V")
	private static void method277(@OriginalArg(1) Class1_Sub1_Sub2 arg0, @OriginalArg(2) char[][] arg1) {
		try {
			for (@Pc(9) int local9 = 0; local9 < arg1.length; local9++) {
				@Pc(15) char[] local15 = new char[arg0.method22()];
				for (@Pc(17) int local17 = 0; local17 < local15.length; local17++) {
					local15[local17] = (char) arg0.method22();
				}
				arg1[local9] = local15;
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("70682, " + -304 + ", " + arg0 + ", " + arg1 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KMKDGUZT", name = "a", descriptor = "([CI)V")
	private static void method278(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) int local3 = 0;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				if (method279(arg0[local5])) {
					arg0[local3] = arg0[local5];
				} else {
					arg0[local3] = ' ';
				}
				if (local3 == 0 || arg0[local3] != ' ' || arg0[local3 - 1] != ' ') {
					local3++;
				}
			}
			for (@Pc(50) int local50 = local3; local50 < arg0.length; local50++) {
				arg0[local50] = ' ';
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("88099, " + arg0 + ", " + 0 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KMKDGUZT", name = "a", descriptor = "(CZ)Z")
	private static boolean method279(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= ' ' && arg0 <= '\u007f' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("45273, " + arg0 + ", " + false + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KMKDGUZT", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method280(@OriginalArg(1) String arg0) {
		try {
			@Pc(3) long local3 = System.currentTimeMillis();
			@Pc(6) char[] local6 = arg0.toCharArray();
			method278(local6);
			@Pc(15) String local15 = (new String(local6)).trim();
			@Pc(19) char[] local19 = local15.toLowerCase().toCharArray();
			@Pc(22) String local22 = local15.toLowerCase();
			method288(local19);
			method283(local19);
			method284(local19);
			method297(local19);
			for (@Pc(52) int local52 = 0; local52 < aStringArray2.length; local52++) {
				@Pc(56) int local56 = -1;
				while ((local56 = local22.indexOf(aStringArray2[local52], local56 + 1)) != -1) {
					@Pc(63) char[] local63 = aStringArray2[local52].toCharArray();
					for (@Pc(65) int local65 = 0; local65 < local63.length; local65++) {
						local19[local65 + local56] = local63[local65];
					}
				}
			}
			method281(local19, local15.toCharArray());
			method282(local19, anInt394);
			@Pc(107) long local107 = System.currentTimeMillis();
			return (new String(local19)).trim();
		} catch (@Pc(114) RuntimeException local114) {
			signlink.reporterror("59721, " + -42231 + ", " + arg0 + ", " + local114.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KMKDGUZT", name = "a", descriptor = "([C[CI)V")
	private static void method281(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1) {
		try {
			for (@Pc(12) int local12 = 0; local12 < arg1.length; local12++) {
				if (arg0[local12] != '*' && method305(arg1[local12])) {
					arg0[local12] = arg1[local12];
				}
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("68733, " + arg0 + ", " + arg1 + ", " + 131 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KMKDGUZT", name = "b", descriptor = "([CI)V")
	private static void method282(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(5) int local5 = 3 / arg1;
			@Pc(7) boolean local7 = true;
			for (@Pc(9) int local9 = 0; local9 < arg0.length; local9++) {
				@Pc(15) char local15 = arg0[local9];
				if (!method302(local15)) {
					local7 = true;
				} else if (local7) {
					if (method304(local15)) {
						local7 = false;
					}
				} else if (method305(local15)) {
					arg0[local9] = (char) (local15 + 'a' - 65);
				}
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("44759, " + arg0 + ", " + arg1 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KMKDGUZT", name = "a", descriptor = "([CZ)V")
	private static void method283(@OriginalArg(0) char[] arg0) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 2; local3++) {
				for (@Pc(10) int local10 = aCharArrayArray1.length - 1; local10 >= 0; local10--) {
					method292(arg0, aCharArrayArray1[local10], aByteArrayArrayArray1[local10]);
				}
			}
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("32317, " + arg0 + ", " + true + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KMKDGUZT", name = "a", descriptor = "(I[C)V")
	private static void method284(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(5) char[] local5 = (char[]) arg0.clone();
			@Pc(30) char[] local30 = new char[] { '(', 'a', ')' };
			method292(local5, local30, null);
			@Pc(39) char[] local39 = (char[]) arg0.clone();
			@Pc(54) char[] local54 = new char[] { 'd', 'o', 't' };
			method292(local39, local54, null);
			for (@Pc(64) int local64 = aCharArrayArray2.length - 1; local64 >= 0; local64--) {
				method285(arg0, aCharArrayArray2[local64], local39, local5);
			}
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("8976, " + -285 + ", " + arg0 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KMKDGUZT", name = "a", descriptor = "([C[CB[C[C)V")
	private static void method285(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(3) char[] arg2, @OriginalArg(4) char[] arg3) {
		try {
			if (arg1.length <= arg0.length) {
				@Pc(29) int local29;
				for (@Pc(21) int local21 = 0; local21 <= arg0.length - arg1.length; local21 += local29) {
					@Pc(25) int local25 = local21;
					@Pc(27) int local27 = 0;
					local29 = 1;
					label58: while (true) {
						while (true) {
							if (local25 >= arg0.length) {
								break label58;
							}
							@Pc(37) char local37 = arg0[local25];
							@Pc(39) char local39 = 0;
							if (local25 + 1 < arg0.length) {
								local39 = arg0[local25 + 1];
							}
							@Pc(64) int local64;
							if (local27 < arg1.length && (local64 = method294(arg1[local27], local39, local37)) > 0) {
								local25 += local64;
								local27++;
							} else {
								if (local27 == 0) {
									break label58;
								}
								@Pc(85) int local85;
								if ((local85 = method294(arg1[local27 - 1], local39, local37)) > 0) {
									local25 += local85;
									if (local27 == 1) {
										local29++;
									}
								} else {
									if (local27 >= arg1.length || !method300(local37)) {
										break label58;
									}
									local25++;
								}
							}
						}
					}
					if (local27 >= arg1.length) {
						@Pc(116) boolean local116 = false;
						@Pc(122) int local122 = method286(arg3, local21, arg0);
						@Pc(130) int local130 = method287(arg2, local25 - 1, arg0);
						if (local122 > 2 || local130 > 2) {
							local116 = true;
						}
						if (local116) {
							for (@Pc(142) int local142 = local21; local142 < local25; local142++) {
								arg0[local142] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(165) RuntimeException local165) {
			signlink.reporterror("25052, " + arg0 + ", " + arg1 + ", " + -120 + ", " + arg2 + ", " + arg3 + ", " + local165.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KMKDGUZT", name = "a", descriptor = "([CIB[C)I")
	private static int method286(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg1 == 0) {
				return 2;
			}
			for (@Pc(9) int local9 = arg1 - 1; local9 >= 0 && method300(arg2[local9]); local9--) {
				if (arg2[local9] == '@') {
					return 3;
				}
			}
			@Pc(29) int local29 = 0;
			for (@Pc(33) int local33 = arg1 - 1; local33 >= 0 && method300(arg0[local33]); local33--) {
				if (arg0[local33] == '*') {
					local29++;
				}
			}
			if (local29 >= 3) {
				return 4;
			} else if (method300(arg2[arg1 - 1])) {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("22816, " + arg0 + ", " + arg1 + ", " + 36 + ", " + arg2 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KMKDGUZT", name = "a", descriptor = "([CI[CI)I")
	private static int method287(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) char[] arg2) {
		try {
			if (arg1 + 1 == arg2.length) {
				return 2;
			}
			@Pc(13) int local13 = arg1 + 1;
			while (true) {
				if (local13 < arg2.length && method300(arg2[local13])) {
					if (arg2[local13] != '.' && arg2[local13] != ',') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(44) int local44 = 0;
				for (@Pc(48) int local48 = arg1 + 1; local48 < arg2.length && method300(arg0[local48]); local48++) {
					if (arg0[local48] == '*') {
						local44++;
					}
				}
				if (local44 >= 3) {
					return 4;
				}
				if (method300(arg2[arg1 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("12560, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 86 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KMKDGUZT", name = "b", descriptor = "(I[C)V")
	private static void method288(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(5) char[] local5 = (char[]) arg0.clone();
			@Pc(20) char[] local20 = new char[] { 'd', 'o', 't' };
			method292(local5, local20, null);
			@Pc(40) char[] local40 = (char[]) arg0.clone();
			@Pc(63) char[] local63 = new char[] { 's', 'l', 'a', 's', 'h' };
			method292(local40, local63, null);
			for (@Pc(70) int local70 = 0; local70 < aCharArrayArray3.length; local70++) {
				method289(local5, local40, aCharArrayArray3[local70], anIntArray114[local70], arg0);
			}
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("15770, " + -351 + ", " + arg0 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KMKDGUZT", name = "a", descriptor = "([CZ[C[CI[C)V")
	private static void method289(@OriginalArg(0) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) char[] arg4) {
		try {
			if (arg2.length <= arg4.length) {
				@Pc(23) int local23;
				for (@Pc(15) int local15 = 0; local15 <= arg4.length - arg2.length; local15 += local23) {
					@Pc(19) int local19 = local15;
					@Pc(21) int local21 = 0;
					local23 = 1;
					label120: while (true) {
						while (true) {
							if (local19 >= arg4.length) {
								break label120;
							}
							@Pc(31) char local31 = arg4[local19];
							@Pc(33) char local33 = 0;
							if (local19 + 1 < arg4.length) {
								local33 = arg4[local19 + 1];
							}
							@Pc(58) int local58;
							if (local21 < arg2.length && (local58 = method294(arg2[local21], local33, local31)) > 0) {
								local19 += local58;
								local21++;
							} else {
								if (local21 == 0) {
									break label120;
								}
								@Pc(79) int local79;
								if ((local79 = method294(arg2[local21 - 1], local33, local31)) > 0) {
									local19 += local79;
									if (local21 == 1) {
										local23++;
									}
								} else {
									if (local21 >= arg2.length || !method300(local31)) {
										break label120;
									}
									local19++;
								}
							}
						}
					}
					if (local21 >= arg2.length) {
						@Pc(110) boolean local110 = false;
						@Pc(116) int local116 = method290(arg4, local15, arg0);
						@Pc(124) int local124 = method291(arg1, local19 - 1, arg4);
						if (arg3 == 1 && local116 > 0 && local124 > 0) {
							local110 = true;
						}
						if (arg3 == 2 && (local116 > 2 && local124 > 0 || local116 > 0 && local124 > 2)) {
							local110 = true;
						}
						if (arg3 == 3 && local116 > 0 && local124 > 2) {
							local110 = true;
						}
						@Pc(167) boolean local167;
						if (arg3 == 3 && local116 > 2 && local124 > 0) {
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
										if (method300(arg4[local190])) {
											break;
										}
										local174 = local190;
									} else if (!method300(arg4[local190])) {
										local186 = true;
										local174 = local190;
									}
								}
							}
							if (local124 > 2) {
								if (local124 == 4) {
									local186 = false;
									for (local190 = local178 + 1; local190 < arg4.length; local190++) {
										if (local186) {
											if (arg1[local190] != '*') {
												break;
											}
											local178 = local190;
										} else if (arg1[local190] == '*') {
											local178 = local190;
											local186 = true;
										}
									}
								}
								local186 = false;
								for (local190 = local178 + 1; local190 < arg4.length; local190++) {
									if (local186) {
										if (method300(arg4[local190])) {
											break;
										}
										local178 = local190;
									} else if (!method300(arg4[local190])) {
										local186 = true;
										local178 = local190;
									}
								}
							}
							for (@Pc(324) int local324 = local174; local324 <= local178; local324++) {
								arg4[local324] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(347) RuntimeException local347) {
			signlink.reporterror("65150, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local347.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KMKDGUZT", name = "a", descriptor = "(B[CI[C)I")
	private static int method290(@OriginalArg(1) char[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg1 == 0) {
				return 2;
			}
			@Pc(14) int local14 = arg1 - 1;
			while (true) {
				if (local14 >= 0 && method300(arg0[local14])) {
					if (arg0[local14] != ',' && arg0[local14] != '.') {
						local14--;
						continue;
					}
					return 3;
				}
				@Pc(39) int local39 = 0;
				for (@Pc(43) int local43 = arg1 - 1; local43 >= 0 && method300(arg2[local43]); local43--) {
					if (arg2[local43] == '*') {
						local39++;
					}
				}
				if (local39 >= 3) {
					return 4;
				}
				if (method300(arg0[arg1 - 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("48344, " + 2 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KMKDGUZT", name = "b", descriptor = "([CIB[C)I")
	private static int method291(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg1 + 1 == arg2.length) {
				return 2;
			}
			@Pc(13) int local13 = arg1 + 1;
			while (true) {
				if (local13 < arg2.length && method300(arg2[local13])) {
					if (arg2[local13] != '\\' && arg2[local13] != '/') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(40) int local40 = 0;
				for (@Pc(49) int local49 = arg1 + 1; local49 < arg2.length && method300(arg0[local49]); local49++) {
					if (arg0[local49] == '*') {
						local40++;
					}
				}
				if (local40 >= 5) {
					return 4;
				}
				if (method300(arg2[arg1 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("27850, " + arg0 + ", " + arg1 + ", " + 55 + ", " + arg2 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KMKDGUZT", name = "a", descriptor = "([CZ[C[[B)V")
	private static void method292(@OriginalArg(0) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) byte[][] arg2) {
		try {
			if (arg1.length <= arg0.length) {
				@Pc(29) int local29;
				for (@Pc(19) int local19 = 0; local19 <= arg0.length - arg1.length; local19 += local29) {
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
							if (local25 < arg1.length && (local70 = method295(var12, var13, arg1[local25])) > 0) {
								if (local70 == 1 && method303(aBoolean96, var12)) {
									local33 = true;
								}
								if (local70 == 2 && (method303(aBoolean96, var12) || method303(aBoolean96, var13))) {
									local33 = true;
								}
								local23 += local70;
								local25++;
							} else {
								if (local25 == 0) {
									break label164;
								}
								@Pc(113) int local113;
								if ((local113 = method295(var12, var13, arg1[local25 - 1])) > 0) {
									local23 += local113;
									if (local25 == 1) {
										local29++;
									}
								} else {
									if (local25 >= arg1.length || !method301(var12)) {
										break label164;
									}
									if (method300(var12) && var12 != '\'') {
										local31 = true;
									}
									if (method303(aBoolean96, var12)) {
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
					if (local25 >= arg1.length && (!local33 || !local35)) {
						@Pc(178) boolean local178 = true;
						@Pc(274) int local274;
						if (local31) {
							@Pc(224) boolean local224 = false;
							@Pc(226) boolean local226 = false;
							if (local19 - 1 < 0 || method300(arg0[local19 - 1]) && arg0[local19 - 1] != '\'') {
								local224 = true;
							}
							if (local23 >= arg0.length || method300(arg0[local23]) && arg0[local23] != '\'') {
								local226 = true;
							}
							if (!local224 || !local226) {
								@Pc(270) boolean local270 = false;
								local274 = local19 - 2;
								if (local224) {
									local274 = local19;
								}
								while (!local270 && local274 < local23) {
									if (local274 >= 0 && (!method300(arg0[local274]) || arg0[local274] == '\'')) {
										@Pc(296) char[] local296 = new char[3];
										@Pc(298) int local298;
										for (local298 = 0; local298 < 3 && local274 + local298 < arg0.length && (!method300(arg0[local274 + local298]) || arg0[local274 + local298] == '\''); local298++) {
											local296[local298] = arg0[local274 + local298];
										}
										@Pc(336) boolean local336 = true;
										if (local298 == 0) {
											local336 = false;
										}
										if (local298 < 3 && local274 - 1 >= 0 && (!method300(arg0[local274 - 1]) || arg0[local274 - 1] == '\'')) {
											local336 = false;
										}
										if (local336 && !method306(local296, aByte12)) {
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
							@Pc(206) byte local206 = method296(var12);
							@Pc(210) byte local210 = method296(var13);
							if (arg2 != null && method293(local206, arg2, local210)) {
								local178 = false;
							}
						}
						if (local178) {
							@Pc(386) int local386 = 0;
							@Pc(388) int local388 = 0;
							@Pc(390) int local390 = -1;
							for (local274 = local19; local274 < local23; local274++) {
								if (method303(aBoolean96, arg0[local274])) {
									local386++;
								} else if (method302(arg0[local274])) {
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
			signlink.reporterror("42943, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + local459.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KMKDGUZT", name = "a", descriptor = "(B[[BZB)Z")
	private static boolean method293(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(3) byte arg2) {
		try {
			@Pc(3) int local3 = 0;
			if (arg1[0][0] == arg0 && arg1[0][1] == arg2) {
				return true;
			}
			@Pc(33) int local33 = arg1.length - 1;
			if (arg1[local33][0] == arg0 && arg1[local33][1] == arg2) {
				return true;
			}
			do {
				@Pc(55) int local55 = (local3 + local33) / 2;
				if (arg1[local55][0] == arg0 && arg1[local55][1] == arg2) {
					return true;
				}
				if (arg0 < arg1[local55][0] || arg0 == arg1[local55][0] && arg2 < arg1[local55][1]) {
					local33 = local55;
				} else {
					local3 = local55;
				}
			} while (local3 != local33 && local3 + 1 != local33);
			return false;
		} catch (@Pc(109) RuntimeException local109) {
			signlink.reporterror("76576, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + local109.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KMKDGUZT", name = "a", descriptor = "(CCIC)I")
	private static int method294(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(3) char arg2) {
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
			signlink.reporterror("37064, " + arg0 + ", " + arg1 + ", " + 2 + ", " + arg2 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KMKDGUZT", name = "a", descriptor = "(CICC)I")
	private static int method295(@OriginalArg(0) char arg0, @OriginalArg(2) char arg1, @OriginalArg(3) char arg2) {
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
			signlink.reporterror("73671, " + arg0 + ", " + -312 + ", " + arg1 + ", " + arg2 + ", " + local512.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KMKDGUZT", name = "a", descriptor = "(IC)B")
	private static byte method296(@OriginalArg(1) char arg0) {
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
			signlink.reporterror("49317, " + 5 + ", " + arg0 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KMKDGUZT", name = "a", descriptor = "(Z[C)V")
	private static void method297(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(9) int local9 = 0;
			@Pc(11) int local11 = 0;
			@Pc(13) int local13 = 0;
			while (true) {
				do {
					@Pc(112) int local112;
					if ((local112 = method298(local9, arg0)) == -1) {
						return;
					}
					@Pc(17) boolean local17 = false;
					for (@Pc(19) int local19 = local9; local19 >= 0 && local19 < local112 && !local17; local19++) {
						if (!method300(arg0[local19]) && !method301(arg0[local19])) {
							local17 = true;
						}
					}
					if (local17) {
						local11 = 0;
					}
					if (local11 == 0) {
						local13 = local112;
					}
					local9 = method299(local112, arg0);
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
			signlink.reporterror("3273, " + false + ", " + arg0 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KMKDGUZT", name = "a", descriptor = "(II[C)I")
	private static int method298(@OriginalArg(1) int arg0, @OriginalArg(2) char[] arg1) {
		try {
			if (anInt395 != 8) {
				return 4;
			}
			for (@Pc(6) int local6 = arg0; local6 < arg1.length && local6 >= 0; local6++) {
				if (arg1[local6] >= '0' && arg1[local6] <= '9') {
					return local6;
				}
			}
			return -1;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("28963, " + 8 + ", " + arg0 + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KMKDGUZT", name = "b", descriptor = "(II[C)I")
	private static int method299(@OriginalArg(1) int arg0, @OriginalArg(2) char[] arg1) {
		try {
			@Pc(9) int local9 = arg0;
			while (true) {
				if (local9 < arg1.length && local9 >= 0) {
					if (arg1[local9] >= '0' && arg1[local9] <= '9') {
						local9++;
						continue;
					}
					return local9;
				}
				return arg1.length;
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("61556, " + 726 + ", " + arg0 + ", " + arg1 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KMKDGUZT", name = "a", descriptor = "(CI)Z")
	private static boolean method300(@OriginalArg(0) char arg0) {
		try {
			return !method302(arg0) && !method303(aBoolean96, arg0);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("38930, " + arg0 + ", " + 160 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KMKDGUZT", name = "b", descriptor = "(CZ)Z")
	private static boolean method301(@OriginalArg(0) char arg0) {
		try {
			if (arg0 >= 'a' && arg0 <= 'z') {
				return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
			} else {
				return true;
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("62556, " + arg0 + ", " + true + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KMKDGUZT", name = "b", descriptor = "(CI)Z")
	private static boolean method302(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("11370, " + arg0 + ", " + -12923 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KMKDGUZT", name = "a", descriptor = "(ZC)Z")
	private static boolean method303(@OriginalArg(0) boolean arg0, @OriginalArg(1) char arg1) {
		try {
			if (!arg0) {
				anInt392 = -11;
			}
			return arg1 >= '0' && arg1 <= '9';
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("96148, " + arg0 + ", " + arg1 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KMKDGUZT", name = "c", descriptor = "(CI)Z")
	private static boolean method304(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z';
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("91780, " + arg0 + ", " + 0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KMKDGUZT", name = "a", descriptor = "(CB)Z")
	private static boolean method305(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("34945, " + arg0 + ", " + 6 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KMKDGUZT", name = "a", descriptor = "([CB)Z")
	private static boolean method306(@OriginalArg(0) char[] arg0, @OriginalArg(1) byte arg1) {
		try {
			if (arg1 != aByte13) {
				aBoolean97 = true;
			}
			@Pc(12) boolean local12 = true;
			for (@Pc(14) int local14 = 0; local14 < arg0.length; local14++) {
				if (!method303(aBoolean96, arg0[local14]) && arg0[local14] != '\u0000') {
					local12 = false;
				}
			}
			if (local12) {
				return true;
			}
			@Pc(41) int local41 = method307(arg0);
			@Pc(43) int local43 = 0;
			@Pc(48) int local48 = anIntArray113.length - 1;
			if (local41 == anIntArray113[0] || local41 == anIntArray113[local48]) {
				return true;
			}
			do {
				@Pc(66) int local66 = (local43 + local48) / 2;
				if (local41 == anIntArray113[local66]) {
					return true;
				}
				if (local41 < anIntArray113[local66]) {
					local48 = local66;
				} else {
					local43 = local66;
				}
			} while (local43 != local48 && local43 + 1 != local48);
			return false;
		} catch (@Pc(95) RuntimeException local95) {
			signlink.reporterror("4663, " + arg0 + ", " + arg1 + ", " + local95.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KMKDGUZT", name = "c", descriptor = "([CI)I")
	private static int method307(@OriginalArg(0) char[] arg0) {
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
			signlink.reporterror("66274, " + arg0 + ", " + 0 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}
}
