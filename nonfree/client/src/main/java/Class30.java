import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!MUWLFOWQ")
public final class Class30 {

	@OriginalMember(owner = "client!MUWLFOWQ", name = "g", descriptor = "I")
	private static int anInt542;

	@OriginalMember(owner = "client!MUWLFOWQ", name = "h", descriptor = "Z")
	private static boolean aBoolean130;

	@OriginalMember(owner = "client!MUWLFOWQ", name = "j", descriptor = "Z")
	private static boolean aBoolean132;

	@OriginalMember(owner = "client!MUWLFOWQ", name = "l", descriptor = "[I")
	private static int[] anIntArray125;

	@OriginalMember(owner = "client!MUWLFOWQ", name = "m", descriptor = "[[C")
	private static char[][] aCharArrayArray1;

	@OriginalMember(owner = "client!MUWLFOWQ", name = "n", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!MUWLFOWQ", name = "o", descriptor = "[[C")
	private static char[][] aCharArrayArray2;

	@OriginalMember(owner = "client!MUWLFOWQ", name = "p", descriptor = "[[C")
	private static char[][] aCharArrayArray3;

	@OriginalMember(owner = "client!MUWLFOWQ", name = "q", descriptor = "[I")
	private static int[] anIntArray126;

	@OriginalMember(owner = "client!MUWLFOWQ", name = "a", descriptor = "I")
	private static int anInt538 = 3;

	@OriginalMember(owner = "client!MUWLFOWQ", name = "b", descriptor = "Z")
	private static boolean aBoolean129 = true;

	@OriginalMember(owner = "client!MUWLFOWQ", name = "c", descriptor = "I")
	private static int anInt539 = -1921;

	@OriginalMember(owner = "client!MUWLFOWQ", name = "d", descriptor = "I")
	private static int anInt540 = -343;

	@OriginalMember(owner = "client!MUWLFOWQ", name = "e", descriptor = "I")
	private static int anInt541 = -34888;

	@OriginalMember(owner = "client!MUWLFOWQ", name = "f", descriptor = "B")
	private static byte aByte20 = 7;

	@OriginalMember(owner = "client!MUWLFOWQ", name = "k", descriptor = "I")
	private static int anInt543;

	@OriginalMember(owner = "client!MUWLFOWQ", name = "r", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray4;

	static {
		aBoolean131 = true;
		anInt543 = 232;
		aStringArray4 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };
	}

	@OriginalMember(owner = "client!MUWLFOWQ", name = "a", descriptor = "(Lclient!VSUYIIVA;)V")
	public static void method337(@OriginalArg(0) Class42 arg0) {
		@Pc(10) Class1_Sub1_Sub2 local10 = new Class1_Sub1_Sub2(arg0.method539("fragmentsenc.txt", null), 792);
		@Pc(19) Class1_Sub1_Sub2 local19 = new Class1_Sub1_Sub2(arg0.method539("badenc.txt", null), 792);
		@Pc(28) Class1_Sub1_Sub2 local28 = new Class1_Sub1_Sub2(arg0.method539("domainenc.txt", null), 792);
		@Pc(37) Class1_Sub1_Sub2 local37 = new Class1_Sub1_Sub2(arg0.method539("tldlist.txt", null), 792);
		method338(local10, local19, local28, local37);
	}

	@OriginalMember(owner = "client!MUWLFOWQ", name = "a", descriptor = "(Lclient!CFARFRSG;Lclient!CFARFRSG;Lclient!CFARFRSG;Lclient!CFARFRSG;)V")
	private static void method338(@OriginalArg(0) Class1_Sub1_Sub2 arg0, @OriginalArg(1) Class1_Sub1_Sub2 arg1, @OriginalArg(2) Class1_Sub1_Sub2 arg2, @OriginalArg(3) Class1_Sub1_Sub2 arg3) {
		method340(arg1);
		method341(arg2);
		method342(arg0);
		method339(arg3);
	}

	@OriginalMember(owner = "client!MUWLFOWQ", name = "a", descriptor = "(Lclient!CFARFRSG;I)V")
	private static void method339(@OriginalArg(0) Class1_Sub1_Sub2 arg0) {
		try {
			@Pc(4) int local4 = arg0.method64();
			aCharArrayArray3 = new char[local4][];
			anIntArray126 = new int[local4];
			for (@Pc(12) int local12 = 0; local12 < local4; local12++) {
				anIntArray126[local12] = arg0.method59();
				@Pc(23) char[] local23 = new char[arg0.method59()];
				for (@Pc(25) int local25 = 0; local25 < local23.length; local25++) {
					local23[local25] = (char) arg0.method59();
				}
				aCharArrayArray3[local12] = local23;
			}
			if (anInt539 == -1921) {
				;
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("25483, " + arg0 + ", " + -1921 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MUWLFOWQ", name = "b", descriptor = "(Lclient!CFARFRSG;I)V")
	private static void method340(@OriginalArg(0) Class1_Sub1_Sub2 arg0) {
		try {
			@Pc(2) int local2 = arg0.method64();
			aCharArrayArray1 = new char[local2][];
			aByteArrayArrayArray7 = new byte[local2][][];
			method343(aByteArrayArrayArray7, arg0, aCharArrayArray1);
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("57280, " + arg0 + ", " + 0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MUWLFOWQ", name = "c", descriptor = "(Lclient!CFARFRSG;I)V")
	private static void method341(@OriginalArg(0) Class1_Sub1_Sub2 arg0) {
		try {
			@Pc(5) int local5 = arg0.method64();
			aCharArrayArray2 = new char[local5][];
			method344(aCharArrayArray2, arg0);
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("89070, " + arg0 + ", " + 0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MUWLFOWQ", name = "d", descriptor = "(Lclient!CFARFRSG;I)V")
	private static void method342(@OriginalArg(0) Class1_Sub1_Sub2 arg0) {
		try {
			anIntArray125 = new int[arg0.method64()];
			for (@Pc(9) int local9 = 0; local9 < anIntArray125.length; local9++) {
				anIntArray125[local9] = arg0.method61();
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("65719, " + arg0 + ", " + 338 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MUWLFOWQ", name = "a", descriptor = "(Z[[[BLclient!CFARFRSG;[[C)V")
	private static void method343(@OriginalArg(1) byte[][][] arg0, @OriginalArg(2) Class1_Sub1_Sub2 arg1, @OriginalArg(3) char[][] arg2) {
		try {
			for (@Pc(7) int local7 = 0; local7 < arg2.length; local7++) {
				@Pc(13) char[] local13 = new char[arg1.method59()];
				for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
					local13[local15] = (char) arg1.method59();
				}
				arg2[local7] = local13;
				@Pc(37) byte[][] local37 = new byte[arg1.method59()][2];
				for (@Pc(39) int local39 = 0; local39 < local37.length; local39++) {
					local37[local39][0] = (byte) arg1.method59();
					local37[local39][1] = (byte) arg1.method59();
				}
				if (local37.length > 0) {
					arg0[local7] = local37;
				}
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("59362, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MUWLFOWQ", name = "a", descriptor = "(I[[CLclient!CFARFRSG;)V")
	private static void method344(@OriginalArg(1) char[][] arg0, @OriginalArg(2) Class1_Sub1_Sub2 arg1) {
		try {
			for (@Pc(12) int local12 = 0; local12 < arg0.length; local12++) {
				@Pc(18) char[] local18 = new char[arg1.method59()];
				for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
					local18[local20] = (char) arg1.method59();
				}
				arg0[local12] = local18;
			}
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("52325, " + 8 + ", " + arg0 + ", " + arg1 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MUWLFOWQ", name = "a", descriptor = "(I[C)V")
	private static void method345(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) int local3 = 0;
			for (@Pc(15) int local15 = 0; local15 < arg0.length; local15++) {
				if (method346(anInt540, arg0[local15])) {
					arg0[local3] = arg0[local15];
				} else {
					arg0[local3] = ' ';
				}
				if (local3 == 0 || arg0[local3] != ' ' || arg0[local3 - 1] != ' ') {
					local3++;
				}
			}
			for (@Pc(57) int local57 = local3; local57 < arg0.length; local57++) {
				arg0[local57] = ' ';
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("70255, " + -28168 + ", " + arg0 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MUWLFOWQ", name = "a", descriptor = "(IC)Z")
	private static boolean method346(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		try {
			if (arg0 >= 0) {
				throw new NullPointerException();
			}
			return arg1 >= ' ' && arg1 <= '\u007f' || arg1 == ' ' || arg1 == '\n' || arg1 == '\t' || arg1 == '£' || arg1 == '€';
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("80211, " + arg0 + ", " + arg1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MUWLFOWQ", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method347(@OriginalArg(1) String arg0) {
		try {
			@Pc(3) long local3 = System.currentTimeMillis();
			@Pc(6) char[] local6 = arg0.toCharArray();
			method345(local6);
			@Pc(31) String local31 = (new String(local6)).trim();
			@Pc(35) char[] local35 = local31.toLowerCase().toCharArray();
			@Pc(38) String local38 = local31.toLowerCase();
			method355(local35);
			method350(local35);
			method351(local35);
			method364(local35);
			for (@Pc(52) int local52 = 0; local52 < aStringArray4.length; local52++) {
				@Pc(56) int local56 = -1;
				while ((local56 = local38.indexOf(aStringArray4[local52], local56 + 1)) != -1) {
					@Pc(63) char[] local63 = aStringArray4[local52].toCharArray();
					for (@Pc(65) int local65 = 0; local65 < local63.length; local65++) {
						local35[local65 + local56] = local63[local65];
					}
				}
			}
			method348(anInt541, local31.toCharArray(), local35);
			method349(local35);
			@Pc(107) long local107 = System.currentTimeMillis();
			return (new String(local35)).trim();
		} catch (@Pc(114) RuntimeException local114) {
			signlink.reporterror("83897, " + -211 + ", " + arg0 + ", " + local114.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MUWLFOWQ", name = "a", descriptor = "(I[C[C)V")
	private static void method348(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2) {
		try {
			@Pc(6) int local6;
			if (arg0 != -34888) {
				for (local6 = 1; local6 > 0; local6++) {
				}
			}
			for (local6 = 0; local6 < arg1.length; local6++) {
				if (arg2[local6] != '*' && method372(arg1[local6])) {
					arg2[local6] = arg1[local6];
				}
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("10291, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MUWLFOWQ", name = "a", descriptor = "([CB)V")
	private static void method349(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				@Pc(11) char local11 = arg0[local5];
				if (!method369(local11)) {
					local3 = true;
				} else if (local3) {
					if (method371(local11)) {
						local3 = false;
					}
				} else if (method372(local11)) {
					arg0[local5] = (char) (local11 + 'a' - 65);
				}
			}
			if (aByte20 == 7) {
				;
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("40984, " + arg0 + ", " + 7 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MUWLFOWQ", name = "a", descriptor = "([CI)V")
	private static void method350(@OriginalArg(0) char[] arg0) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 2; local3++) {
				for (@Pc(10) int local10 = aCharArrayArray1.length - 1; local10 >= 0; local10--) {
					method359(aByteArrayArrayArray7[local10], arg0, (byte) 2, aCharArrayArray1[local10]);
				}
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("95032, " + arg0 + ", " + -544 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MUWLFOWQ", name = "b", descriptor = "([CB)V")
	private static void method351(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(18) char[] local18 = new char[] { '(', 'a', ')' };
			method359(null, local3, (byte) 2, local18);
			@Pc(27) char[] local27 = (char[]) arg0.clone();
			@Pc(42) char[] local42 = new char[] { 'd', 'o', 't' };
			method359(null, local27, (byte) 2, local42);
			for (@Pc(56) int local56 = aCharArrayArray2.length - 1; local56 >= 0; local56--) {
				method352(arg0, local3, local27, aCharArrayArray2[local56]);
			}
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("47365, " + arg0 + ", " + 24 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MUWLFOWQ", name = "a", descriptor = "([C[CB[C[C)V")
	private static void method352(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(3) char[] arg2, @OriginalArg(4) char[] arg3) {
		try {
			if (arg3.length <= arg0.length) {
				@Pc(19) int local19;
				for (@Pc(11) int local11 = 0; local11 <= arg0.length - arg3.length; local11 += local19) {
					@Pc(15) int local15 = local11;
					@Pc(17) int local17 = 0;
					local19 = 1;
					label59: while (true) {
						while (true) {
							if (local15 >= arg0.length) {
								break label59;
							}
							@Pc(27) char local27 = arg0[local15];
							@Pc(29) char local29 = 0;
							if (local15 + 1 < arg0.length) {
								local29 = arg0[local15 + 1];
							}
							@Pc(54) int local54;
							if (local17 < arg3.length && (local54 = method361(local29, arg3[local17], local27)) > 0) {
								local15 += local54;
								local17++;
							} else {
								if (local17 == 0) {
									break label59;
								}
								@Pc(75) int local75;
								if ((local75 = method361(local29, arg3[local17 - 1], local27)) > 0) {
									local15 += local75;
									if (local17 == 1) {
										local19++;
									}
								} else {
									if (local17 >= arg3.length || !method367(local27)) {
										break label59;
									}
									local15++;
								}
							}
						}
					}
					if (local17 >= arg3.length) {
						@Pc(106) boolean local106 = false;
						@Pc(112) int local112 = method353(local11, arg0, arg1);
						@Pc(120) int local120 = method354(anInt542, arg0, local15 - 1, arg2);
						if (local112 > 2 || local120 > 2) {
							local106 = true;
						}
						if (local106) {
							for (@Pc(132) int local132 = local11; local132 < local15; local132++) {
								arg0[local132] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(165) RuntimeException local165) {
			signlink.reporterror("19538, " + arg0 + ", " + arg1 + ", " + -51 + ", " + arg2 + ", " + arg3 + ", " + local165.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MUWLFOWQ", name = "a", descriptor = "(II[C[C)I")
	private static int method353(@OriginalArg(1) int arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg0 == 0) {
				return 2;
			}
			for (@Pc(9) int local9 = arg0 - 1; local9 >= 0 && method367(arg1[local9]); local9--) {
				if (arg1[local9] == '@') {
					return 3;
				}
			}
			@Pc(29) int local29 = 0;
			for (@Pc(33) int local33 = arg0 - 1; local33 >= 0 && method367(arg2[local33]); local33--) {
				if (arg2[local33] == '*') {
					local29++;
				}
			}
			if (local29 >= 3) {
				return 4;
			} else if (method367(arg1[arg0 - 1])) {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("45148, " + 23210 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MUWLFOWQ", name = "a", descriptor = "(I[CI[C)I")
	private static int method354(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) char[] arg3) {
		try {
			if (arg2 + 1 == arg1.length) {
				return 2;
			}
			@Pc(13) int local13 = arg2 + 1;
			while (true) {
				if (local13 < arg1.length && method367(arg1[local13])) {
					if (arg1[local13] != '.' && arg1[local13] != ',') {
						local13++;
						continue;
					}
					return 3;
				}
				if (arg0 != 0) {
					return 0;
				}
				@Pc(44) int local44 = 0;
				for (@Pc(48) int local48 = arg2 + 1; local48 < arg1.length && method367(arg3[local48]); local48++) {
					if (arg3[local48] == '*') {
						local44++;
					}
				}
				if (local44 >= 3) {
					return 4;
				}
				if (method367(arg1[arg2 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("75799, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MUWLFOWQ", name = "b", descriptor = "(I[C)V")
	private static void method355(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(5) char[] local5 = (char[]) arg0.clone();
			@Pc(20) char[] local20 = new char[] { 'd', 'o', 't' };
			method359(null, local5, (byte) 2, local20);
			@Pc(29) char[] local29 = (char[]) arg0.clone();
			@Pc(52) char[] local52 = new char[] { 's', 'l', 'a', 's', 'h' };
			method359(null, local29, (byte) 2, local52);
			for (@Pc(64) int local64 = 0; local64 < aCharArrayArray3.length; local64++) {
				method356(aBoolean130, anIntArray126[local64], local5, local29, aCharArrayArray3[local64], arg0);
			}
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("19331, " + -242 + ", " + arg0 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MUWLFOWQ", name = "a", descriptor = "(ZI[C[C[C[C)V")
	private static void method356(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) char[] arg3, @OriginalArg(4) char[] arg4, @OriginalArg(5) char[] arg5) {
		try {
			if (arg4.length <= arg5.length) {
				@Pc(13) int local13;
				if (arg0) {
					for (local13 = 1; local13 > 0; local13++) {
					}
				}
				@Pc(28) int local28;
				for (local13 = 0; local13 <= arg5.length - arg4.length; local13 += local28) {
					@Pc(24) int local24 = local13;
					@Pc(26) int local26 = 0;
					local28 = 1;
					label123: while (true) {
						while (true) {
							if (local24 >= arg5.length) {
								break label123;
							}
							@Pc(36) char local36 = arg5[local24];
							@Pc(38) char local38 = 0;
							if (local24 + 1 < arg5.length) {
								local38 = arg5[local24 + 1];
							}
							@Pc(63) int local63;
							if (local26 < arg4.length && (local63 = method361(local38, arg4[local26], local36)) > 0) {
								local24 += local63;
								local26++;
							} else {
								if (local26 == 0) {
									break label123;
								}
								@Pc(84) int local84;
								if ((local84 = method361(local38, arg4[local26 - 1], local36)) > 0) {
									local24 += local84;
									if (local26 == 1) {
										local28++;
									}
								} else {
									if (local26 >= arg4.length || !method367(local36)) {
										break label123;
									}
									local24++;
								}
							}
						}
					}
					if (local26 >= arg4.length) {
						@Pc(115) boolean local115 = false;
						@Pc(121) int local121 = method357(local13, arg5, arg2, 769);
						@Pc(129) int local129 = method358(local24 - 1, arg5, arg3, aBoolean131);
						if (arg1 == 1 && local121 > 0 && local129 > 0) {
							local115 = true;
						}
						if (arg1 == 2 && (local121 > 2 && local129 > 0 || local121 > 0 && local129 > 2)) {
							local115 = true;
						}
						if (arg1 == 3 && local121 > 0 && local129 > 2) {
							local115 = true;
						}
						@Pc(172) boolean local172;
						if (arg1 == 3 && local121 > 2 && local129 > 0) {
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
											if (arg2[local195] != '*') {
												break;
											}
											local179 = local195;
										} else if (arg2[local195] == '*') {
											local179 = local195;
											local191 = true;
										}
									}
								}
								local191 = false;
								for (local195 = local179 - 1; local195 >= 0; local195--) {
									if (local191) {
										if (method367(arg5[local195])) {
											break;
										}
										local179 = local195;
									} else if (!method367(arg5[local195])) {
										local191 = true;
										local179 = local195;
									}
								}
							}
							if (local129 > 2) {
								if (local129 == 4) {
									local191 = false;
									for (local195 = local183 + 1; local195 < arg5.length; local195++) {
										if (local191) {
											if (arg3[local195] != '*') {
												break;
											}
											local183 = local195;
										} else if (arg3[local195] == '*') {
											local183 = local195;
											local191 = true;
										}
									}
								}
								local191 = false;
								for (local195 = local183 + 1; local195 < arg5.length; local195++) {
									if (local191) {
										if (method367(arg5[local195])) {
											break;
										}
										local183 = local195;
									} else if (!method367(arg5[local195])) {
										local191 = true;
										local183 = local195;
									}
								}
							}
							for (@Pc(329) int local329 = local179; local329 <= local183; local329++) {
								arg5[local329] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(352) RuntimeException local352) {
			signlink.reporterror("18640, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local352.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MUWLFOWQ", name = "a", descriptor = "(I[C[CI)I")
	private static int method357(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg0 == 0) {
				return 2;
			}
			@Pc(9) int local9 = arg0 - 1;
			while (true) {
				if (local9 >= 0 && method367(arg1[local9])) {
					if (arg1[local9] != ',' && arg1[local9] != '.') {
						local9--;
						continue;
					}
					return 3;
				}
				@Pc(36) boolean local36 = false;
				@Pc(38) int local38 = 0;
				for (@Pc(42) int local42 = arg0 - 1; local42 >= 0 && method367(arg2[local42]); local42--) {
					if (arg2[local42] == '*') {
						local38++;
					}
				}
				if (local38 >= 3) {
					return 4;
				}
				if (method367(arg1[arg0 - 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("66581, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MUWLFOWQ", name = "a", descriptor = "(I[C[CZ)I")
	private static int method358(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) boolean arg3) {
		try {
			if (arg0 + 1 == arg1.length) {
				return 2;
			}
			@Pc(13) int local13 = arg0 + 1;
			while (true) {
				if (local13 < arg1.length && method367(arg1[local13])) {
					if (arg1[local13] != '\\' && arg1[local13] != '/') {
						local13++;
						continue;
					}
					return 3;
				}
				if (!arg3) {
					anInt541 = 22;
				}
				@Pc(44) int local44 = 0;
				for (@Pc(48) int local48 = arg0 + 1; local48 < arg1.length && method367(arg2[local48]); local48++) {
					if (arg2[local48] == '*') {
						local44++;
					}
				}
				if (local44 >= 5) {
					return 4;
				}
				if (method367(arg1[arg0 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("82858, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MUWLFOWQ", name = "a", descriptor = "([[B[CB[C)V")
	private static void method359(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) char[] arg3) {
		try {
			if (arg3.length <= arg1.length) {
				@Pc(21) int local21;
				for (@Pc(11) int local11 = 0; local11 <= arg1.length - arg3.length; local11 += local21) {
					@Pc(15) int local15 = local11;
					@Pc(17) int local17 = 0;
					@Pc(19) int local19 = 0;
					local21 = 1;
					@Pc(23) boolean local23 = false;
					@Pc(25) boolean local25 = false;
					@Pc(27) boolean local27 = false;
					@Pc(35) char var13;
					@Pc(37) char var14;
					label164: while (true) {
						while (true) {
							if (local15 >= arg1.length || local25 && local27) {
								break label164;
							}
							var13 = arg1[local15];
							var14 = '\u0000';
							if (local15 + 1 < arg1.length) {
								var14 = arg1[local15 + 1];
							}
							@Pc(62) int local62;
							if (local17 < arg3.length && (local62 = method362(arg3[local17], var13, var14)) > 0) {
								if (local62 == 1 && method370(var13)) {
									local25 = true;
								}
								if (local62 == 2 && (method370(var13) || method370(var14))) {
									local25 = true;
								}
								local15 += local62;
								local17++;
							} else {
								if (local17 == 0) {
									break label164;
								}
								@Pc(105) int local105;
								if ((local105 = method362(arg3[local17 - 1], var13, var14)) > 0) {
									local15 += local105;
									if (local17 == 1) {
										local21++;
									}
								} else {
									if (local17 >= arg3.length || !method368(var13)) {
										break label164;
									}
									if (method367(var13) && var13 != '\'') {
										local23 = true;
									}
									if (method370(var13)) {
										local27 = true;
									}
									local15++;
									local19++;
									if (local19 * 100 / (local15 - local11) > 90) {
										break label164;
									}
								}
							}
						}
					}
					if (local17 >= arg3.length && (!local25 || !local27)) {
						@Pc(170) boolean local170 = true;
						@Pc(266) int local266;
						if (local23) {
							@Pc(216) boolean local216 = false;
							@Pc(218) boolean local218 = false;
							if (local11 - 1 < 0 || method367(arg1[local11 - 1]) && arg1[local11 - 1] != '\'') {
								local216 = true;
							}
							if (local15 >= arg1.length || method367(arg1[local15]) && arg1[local15] != '\'') {
								local218 = true;
							}
							if (!local216 || !local218) {
								@Pc(262) boolean local262 = false;
								local266 = local11 - 2;
								if (local216) {
									local266 = local11;
								}
								while (!local262 && local266 < local15) {
									if (local266 >= 0 && (!method367(arg1[local266]) || arg1[local266] == '\'')) {
										@Pc(288) char[] local288 = new char[3];
										@Pc(290) int local290;
										for (local290 = 0; local290 < 3 && local266 + local290 < arg1.length && (!method367(arg1[local266 + local290]) || arg1[local266 + local290] == '\''); local290++) {
											local288[local290] = arg1[local266 + local290];
										}
										@Pc(328) boolean local328 = true;
										if (local290 == 0) {
											local328 = false;
										}
										if (local290 < 3 && local266 - 1 >= 0 && (!method367(arg1[local266 - 1]) || arg1[local266 - 1] == '\'')) {
											local328 = false;
										}
										if (local328 && !method373(local288)) {
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
								var13 = arg1[local11 - 1];
							}
							var14 = ' ';
							if (local15 < arg1.length) {
								var14 = arg1[local15];
							}
							@Pc(198) byte local198 = method363(var13);
							@Pc(202) byte local202 = method363(var14);
							if (arg0 != null && method360(local202, 323, arg0, local198)) {
								local170 = false;
							}
						}
						if (local170) {
							@Pc(378) int local378 = 0;
							@Pc(380) int local380 = 0;
							@Pc(382) int local382 = -1;
							for (local266 = local11; local266 < local15; local266++) {
								if (method370(arg1[local266])) {
									local378++;
								} else if (method369(arg1[local266])) {
									local380++;
									local382 = local266;
								}
							}
							if (local382 > -1) {
								local378 -= local15 - local382 - 1;
							}
							if (local378 <= local380) {
								for (@Pc(424) int local424 = local11; local424 < local15; local424++) {
									arg1[local424] = '*';
								}
							} else {
								local21 = 1;
							}
						}
					}
				}
				@Pc(454) boolean local454 = false;
			}
		} catch (@Pc(463) RuntimeException local463) {
			signlink.reporterror("94381, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local463.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MUWLFOWQ", name = "a", descriptor = "(BI[[BB)Z")
	private static boolean method360(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) byte arg3) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(5) int local5 = 0;
			if (arg2[0][0] == arg3 && arg2[0][1] == arg0) {
				return true;
			}
			@Pc(26) int local26 = arg2.length - 1;
			if (arg2[local26][0] == arg3 && arg2[local26][1] == arg0) {
				return true;
			}
			do {
				@Pc(48) int local48 = (local5 + local26) / 2;
				if (arg2[local48][0] == arg3 && arg2[local48][1] == arg0) {
					return true;
				}
				if (arg3 < arg2[local48][0] || arg3 == arg2[local48][0] && arg0 < arg2[local48][1]) {
					local26 = local48;
				} else {
					local5 = local48;
				}
			} while (local5 != local26 && local5 + 1 != local26);
			return false;
		} catch (@Pc(102) RuntimeException local102) {
			signlink.reporterror("39431, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local102.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MUWLFOWQ", name = "a", descriptor = "(ICCC)I")
	private static int method361(@OriginalArg(1) char arg0, @OriginalArg(2) char arg1, @OriginalArg(3) char arg2) {
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
			signlink.reporterror("11999, " + 5 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MUWLFOWQ", name = "a", descriptor = "(CCCI)I")
	private static int method362(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(2) char arg2) {
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
			signlink.reporterror("66108, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local512.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MUWLFOWQ", name = "a", descriptor = "(CZ)B")
	private static byte method363(@OriginalArg(0) char arg0) {
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
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("80106, " + arg0 + ", " + false + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MUWLFOWQ", name = "c", descriptor = "(I[C)V")
	private static void method364(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(5) int local5 = 0;
			@Pc(15) int local15 = 0;
			@Pc(17) int local17 = 0;
			while (true) {
				do {
					@Pc(116) int local116;
					if ((local116 = method365(arg0, local5)) == -1) {
						return;
					}
					@Pc(21) boolean local21 = false;
					for (@Pc(23) int local23 = local5; local23 >= 0 && local23 < local116 && !local21; local23++) {
						if (!method367(arg0[local23]) && !method368(arg0[local23])) {
							local21 = true;
						}
					}
					if (local21) {
						local15 = 0;
					}
					if (local15 == 0) {
						local17 = local116;
					}
					local5 = method366(arg0, local116);
					@Pc(62) int local62 = 0;
					for (@Pc(64) int local64 = local116; local64 < local5; local64++) {
						local62 = local62 * 10 + arg0[local64] - 48;
					}
					if (local62 <= 255 && local5 - local116 <= 8) {
						local15++;
					} else {
						local15 = 0;
					}
				} while (local15 != 4);
				for (@Pc(98) int local98 = local17; local98 < local5; local98++) {
					arg0[local98] = '*';
				}
				local15 = 0;
			}
		} catch (@Pc(120) RuntimeException local120) {
			signlink.reporterror("62051, " + 0 + ", " + arg0 + ", " + local120.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MUWLFOWQ", name = "a", descriptor = "(I[CI)I")
	private static int method365(@OriginalArg(1) char[] arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(13) int local13 = arg1; local13 < arg0.length && local13 >= 0; local13++) {
				if (arg0[local13] >= '0' && arg0[local13] <= '9') {
					return local13;
				}
			}
			return -1;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("42905, " + 40409 + ", " + arg0 + ", " + arg1 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MUWLFOWQ", name = "a", descriptor = "([CII)I")
	private static int method366(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1) {
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
			signlink.reporterror("64805, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MUWLFOWQ", name = "a", descriptor = "(CI)Z")
	private static boolean method367(@OriginalArg(0) char arg0) {
		try {
			return !method369(arg0) && !method370(arg0);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("63797, " + arg0 + ", " + 0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MUWLFOWQ", name = "a", descriptor = "(ZC)Z")
	private static boolean method368(@OriginalArg(1) char arg0) {
		try {
			if (arg0 >= 'a' && arg0 <= 'z') {
				return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
			} else {
				return true;
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("68852, " + false + ", " + arg0 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MUWLFOWQ", name = "a", descriptor = "(BC)Z")
	private static boolean method369(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("73967, " + -70 + ", " + arg0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MUWLFOWQ", name = "a", descriptor = "(CB)Z")
	private static boolean method370(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= '0' && arg0 <= '9';
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("53468, " + arg0 + ", " + 0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MUWLFOWQ", name = "b", descriptor = "(IC)Z")
	private static boolean method371(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z';
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("34133, " + -509 + ", " + arg0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MUWLFOWQ", name = "b", descriptor = "(CI)Z")
	private static boolean method372(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("91248, " + arg0 + ", " + -458 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MUWLFOWQ", name = "d", descriptor = "(I[C)Z")
	private static boolean method373(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				if (!method370(arg0[local5]) && arg0[local5] != '\u0000') {
					local3 = false;
				}
			}
			if (local3) {
				return true;
			}
			@Pc(32) int local32 = method374(arg0);
			@Pc(34) int local34 = 0;
			@Pc(47) int local47 = anIntArray125.length - 1;
			if (local32 == anIntArray125[0] || local32 == anIntArray125[local47]) {
				return true;
			}
			do {
				@Pc(65) int local65 = (local34 + local47) / 2;
				if (local32 == anIntArray125[local65]) {
					return true;
				}
				if (local32 < anIntArray125[local65]) {
					local47 = local65;
				} else {
					local34 = local65;
				}
			} while (local34 != local47 && local34 + 1 != local47);
			return false;
		} catch (@Pc(94) RuntimeException local94) {
			signlink.reporterror("98640, " + -899 + ", " + arg0 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MUWLFOWQ", name = "a", descriptor = "(Z[C)I")
	private static int method374(@OriginalArg(1) char[] arg0) {
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
			signlink.reporterror("35590, " + false + ", " + arg0 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}
}
