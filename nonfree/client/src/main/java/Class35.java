import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!TONKJGVS")
public final class Class35 {

	@OriginalMember(owner = "client!TONKJGVS", name = "a", descriptor = "I")
	private static int anInt710;

	@OriginalMember(owner = "client!TONKJGVS", name = "k", descriptor = "Z")
	private static boolean aBoolean161;

	@OriginalMember(owner = "client!TONKJGVS", name = "o", descriptor = "[I")
	private static int[] anIntArray184;

	@OriginalMember(owner = "client!TONKJGVS", name = "p", descriptor = "[[C")
	private static char[][] aCharArrayArray1;

	@OriginalMember(owner = "client!TONKJGVS", name = "q", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!TONKJGVS", name = "r", descriptor = "[[C")
	private static char[][] aCharArrayArray2;

	@OriginalMember(owner = "client!TONKJGVS", name = "s", descriptor = "[[C")
	private static char[][] aCharArrayArray3;

	@OriginalMember(owner = "client!TONKJGVS", name = "t", descriptor = "[I")
	private static int[] anIntArray185;

	@OriginalMember(owner = "client!TONKJGVS", name = "b", descriptor = "I")
	private static int anInt711 = 7;

	@OriginalMember(owner = "client!TONKJGVS", name = "c", descriptor = "I")
	private static int anInt712 = 941;

	@OriginalMember(owner = "client!TONKJGVS", name = "d", descriptor = "B")
	private static byte aByte25 = 9;

	@OriginalMember(owner = "client!TONKJGVS", name = "e", descriptor = "I")
	private static int anInt713 = 6;

	@OriginalMember(owner = "client!TONKJGVS", name = "f", descriptor = "I")
	private static int anInt714 = 863;

	@OriginalMember(owner = "client!TONKJGVS", name = "g", descriptor = "I")
	private static int anInt715 = 9;

	@OriginalMember(owner = "client!TONKJGVS", name = "h", descriptor = "I")
	private static int anInt716 = 9;

	@OriginalMember(owner = "client!TONKJGVS", name = "i", descriptor = "Z")
	private static boolean aBoolean159 = true;

	@OriginalMember(owner = "client!TONKJGVS", name = "j", descriptor = "Z")
	private static boolean aBoolean160 = true;

	@OriginalMember(owner = "client!TONKJGVS", name = "l", descriptor = "I")
	private static int anInt717 = 23345;

	@OriginalMember(owner = "client!TONKJGVS", name = "m", descriptor = "B")
	private static byte aByte26 = -58;

	@OriginalMember(owner = "client!TONKJGVS", name = "n", descriptor = "I")
	private static int anInt718 = 7;

	@OriginalMember(owner = "client!TONKJGVS", name = "u", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray6 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

	@OriginalMember(owner = "client!TONKJGVS", name = "a", descriptor = "(Lclient!LKPVZAQN;)V")
	public static void method408(@OriginalArg(0) Class22 arg0) {
		@Pc(10) Class3_Sub3_Sub4 local10 = new Class3_Sub3_Sub4((byte) -115, arg0.method207("fragmentsenc.txt", null));
		@Pc(19) Class3_Sub3_Sub4 local19 = new Class3_Sub3_Sub4((byte) -115, arg0.method207("badenc.txt", null));
		@Pc(28) Class3_Sub3_Sub4 local28 = new Class3_Sub3_Sub4((byte) -115, arg0.method207("domainenc.txt", null));
		@Pc(37) Class3_Sub3_Sub4 local37 = new Class3_Sub3_Sub4((byte) -115, arg0.method207("tldlist.txt", null));
		method409(local10, local19, local28, local37);
	}

	@OriginalMember(owner = "client!TONKJGVS", name = "a", descriptor = "(Lclient!WBEWPIXO;Lclient!WBEWPIXO;Lclient!WBEWPIXO;Lclient!WBEWPIXO;)V")
	private static void method409(@OriginalArg(0) Class3_Sub3_Sub4 arg0, @OriginalArg(1) Class3_Sub3_Sub4 arg1, @OriginalArg(2) Class3_Sub3_Sub4 arg2, @OriginalArg(3) Class3_Sub3_Sub4 arg3) {
		method411(arg1);
		method412(arg2);
		method413(arg0);
		method410(arg3);
	}

	@OriginalMember(owner = "client!TONKJGVS", name = "a", descriptor = "(Lclient!WBEWPIXO;I)V")
	private static void method410(@OriginalArg(0) Class3_Sub3_Sub4 arg0) {
		try {
			@Pc(4) int local4 = arg0.method473();
			aCharArrayArray3 = new char[local4][];
			anIntArray185 = new int[local4];
			for (@Pc(22) int local22 = 0; local22 < local4; local22++) {
				anIntArray185[local22] = arg0.method468();
				@Pc(33) char[] local33 = new char[arg0.method468()];
				for (@Pc(35) int local35 = 0; local35 < local33.length; local35++) {
					local33[local35] = (char) arg0.method468();
				}
				aCharArrayArray3[local22] = local33;
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("68781, " + arg0 + ", " + 8476 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TONKJGVS", name = "a", descriptor = "(ILclient!WBEWPIXO;)V")
	private static void method411(@OriginalArg(1) Class3_Sub3_Sub4 arg0) {
		try {
			@Pc(2) int local2 = arg0.method473();
			aCharArrayArray1 = new char[local2][];
			aByteArrayArrayArray7 = new byte[local2][][];
			method414(arg0, aCharArrayArray1, aByteArrayArrayArray7);
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("92792, " + 941 + ", " + arg0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TONKJGVS", name = "b", descriptor = "(Lclient!WBEWPIXO;I)V")
	private static void method412(@OriginalArg(0) Class3_Sub3_Sub4 arg0) {
		try {
			@Pc(2) int local2 = arg0.method473();
			aCharArrayArray2 = new char[local2][];
			method415(arg0, aCharArrayArray2);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("43531, " + arg0 + ", " + 5 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TONKJGVS", name = "c", descriptor = "(Lclient!WBEWPIXO;I)V")
	private static void method413(@OriginalArg(0) Class3_Sub3_Sub4 arg0) {
		try {
			anIntArray184 = new int[arg0.method473()];
			for (@Pc(5) int local5 = 0; local5 < anIntArray184.length; local5++) {
				anIntArray184[local5] = arg0.method470();
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("27888, " + arg0 + ", " + 13217 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TONKJGVS", name = "a", descriptor = "(Lclient!WBEWPIXO;[[C[[[BZ)V")
	private static void method414(@OriginalArg(0) Class3_Sub3_Sub4 arg0, @OriginalArg(1) char[][] arg1, @OriginalArg(2) byte[][][] arg2) {
		try {
			for (@Pc(6) int local6 = 0; local6 < arg1.length; local6++) {
				@Pc(12) char[] local12 = new char[arg0.method468()];
				for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
					local12[local14] = (char) arg0.method468();
				}
				arg1[local6] = local12;
				@Pc(36) byte[][] local36 = new byte[arg0.method468()][2];
				for (@Pc(38) int local38 = 0; local38 < local36.length; local38++) {
					local36[local38][0] = (byte) arg0.method468();
					local36[local38][1] = (byte) arg0.method468();
				}
				if (local36.length > 0) {
					arg2[local6] = local36;
				}
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("23363, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TONKJGVS", name = "a", descriptor = "(Lclient!WBEWPIXO;[[CI)V")
	private static void method415(@OriginalArg(0) Class3_Sub3_Sub4 arg0, @OriginalArg(1) char[][] arg1) {
		try {
			for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
				@Pc(13) char[] local13 = new char[arg0.method468()];
				for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
					local13[local15] = (char) arg0.method468();
				}
				arg1[local7] = local13;
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("40954, " + arg0 + ", " + arg1 + ", " + -24155 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TONKJGVS", name = "a", descriptor = "(B[C)V")
	private static void method416(@OriginalArg(0) byte arg0, @OriginalArg(1) char[] arg1) {
		try {
			@Pc(3) int local3 = 0;
			if (aByte25 == 9) {
				@Pc(8) boolean local8 = false;
				for (@Pc(12) int local12 = 0; local12 < arg1.length; local12++) {
					if (method417(arg1[local12])) {
						arg1[local3] = arg1[local12];
					} else {
						arg1[local3] = ' ';
					}
					if (local3 == 0 || arg1[local3] != ' ' || arg1[local3 - 1] != ' ') {
						local3++;
					}
				}
				for (@Pc(55) int local55 = local3; local55 < arg1.length; local55++) {
					arg1[local55] = ' ';
				}
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("59262, " + arg0 + ", " + arg1 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TONKJGVS", name = "a", descriptor = "(ZC)Z")
	private static boolean method417(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= ' ' && arg0 <= '\u007f' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("7731, " + true + ", " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TONKJGVS", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method418(@OriginalArg(0) String arg0) {
		try {
			@Pc(3) long local3 = System.currentTimeMillis();
			@Pc(6) char[] local6 = arg0.toCharArray();
			method416((byte) 9, local6);
			@Pc(15) String local15 = (new String(local6)).trim();
			@Pc(19) char[] local19 = local15.toLowerCase().toCharArray();
			@Pc(22) String local22 = local15.toLowerCase();
			method426(anInt715, local19);
			method421(anInt714, local19);
			method422(local19);
			method435(local19);
			for (@Pc(36) int local36 = 0; local36 < aStringArray6.length; local36++) {
				@Pc(46) int local46 = -1;
				while ((local46 = local22.indexOf(aStringArray6[local36], local46 + 1)) != -1) {
					@Pc(53) char[] local53 = aStringArray6[local36].toCharArray();
					for (@Pc(55) int local55 = 0; local55 < local53.length; local55++) {
						local19[local55 + local46] = local53[local55];
					}
				}
			}
			if (anInt711 != 7) {
				throw new NullPointerException();
			}
			method419(local19, local15.toCharArray());
			method420(local19, anInt713);
			@Pc(104) long local104 = System.currentTimeMillis();
			return (new String(local19)).trim();
		} catch (@Pc(111) RuntimeException local111) {
			signlink.reporterror("54223, " + arg0 + ", " + 7 + ", " + local111.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TONKJGVS", name = "a", descriptor = "([CI[C)V")
	private static void method419(@OriginalArg(0) char[] arg0, @OriginalArg(2) char[] arg1) {
		try {
			for (@Pc(5) int local5 = 0; local5 < arg1.length; local5++) {
				if (arg0[local5] != '*' && method443(arg1[local5], aByte26)) {
					arg0[local5] = arg1[local5];
				}
			}
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("72357, " + arg0 + ", " + 8 + ", " + arg1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TONKJGVS", name = "a", descriptor = "([CI)V")
	private static void method420(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				@Pc(11) char local11 = arg0[local5];
				if (!method440(local11)) {
					local3 = true;
				} else if (local3) {
					if (method442(local11)) {
						local3 = false;
					}
				} else if (method443(local11, aByte26)) {
					arg0[local5] = (char) (local11 + 'a' - 65);
				}
			}
			if (arg1 < 6 || arg1 > 6) {
				for (@Pc(55) int local55 = 1; local55 > 0; local55++) {
				}
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("172, " + arg0 + ", " + arg1 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TONKJGVS", name = "a", descriptor = "(I[C)V")
	private static void method421(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1) {
		try {
			@Pc(5) int local5 = 0 / arg0;
			for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
				for (@Pc(14) int local14 = aCharArrayArray1.length - 1; local14 >= 0; local14--) {
					method430(aByteArrayArrayArray7[local14], arg1, aCharArrayArray1[local14]);
				}
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("94514, " + arg0 + ", " + arg1 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TONKJGVS", name = "b", descriptor = "([CI)V")
	private static void method422(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(5) char[] local5 = (char[]) arg0.clone();
			@Pc(20) char[] local20 = new char[] { '(', 'a', ')' };
			method430(null, local5, local20);
			@Pc(29) char[] local29 = (char[]) arg0.clone();
			@Pc(44) char[] local44 = new char[] { 'd', 'o', 't' };
			method430(null, local29, local44);
			for (@Pc(63) int local63 = aCharArrayArray2.length - 1; local63 >= 0; local63--) {
				method423(local5, arg0, local29, aCharArrayArray2[local63]);
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("65550, " + arg0 + ", " + 0 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TONKJGVS", name = "a", descriptor = "(B[C[C[C[C)V")
	private static void method423(@OriginalArg(1) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2, @OriginalArg(4) char[] arg3) {
		try {
			if (arg3.length <= arg1.length) {
				@Pc(29) int local29;
				for (@Pc(21) int local21 = 0; local21 <= arg1.length - arg3.length; local21 += local29) {
					@Pc(25) int local25 = local21;
					@Pc(27) int local27 = 0;
					local29 = 1;
					label58: while (true) {
						while (true) {
							if (local25 >= arg1.length) {
								break label58;
							}
							@Pc(37) char local37 = arg1[local25];
							@Pc(39) char local39 = 0;
							if (local25 + 1 < arg1.length) {
								local39 = arg1[local25 + 1];
							}
							@Pc(64) int local64;
							if (local27 < arg3.length && (local64 = method432(local37, local39, arg3[local27])) > 0) {
								local25 += local64;
								local27++;
							} else {
								if (local27 == 0) {
									break label58;
								}
								@Pc(85) int local85;
								if ((local85 = method432(local37, local39, arg3[local27 - 1])) > 0) {
									local25 += local85;
									if (local27 == 1) {
										local29++;
									}
								} else {
									if (local27 >= arg3.length || !method438(local37)) {
										break label58;
									}
									local25++;
								}
							}
						}
					}
					if (local27 >= arg3.length) {
						@Pc(116) boolean local116 = false;
						@Pc(122) int local122 = method424(arg1, arg0, 244, local21);
						@Pc(130) int local130 = method425(arg1, arg2, local25 - 1);
						if (local122 > 2 || local130 > 2) {
							local116 = true;
						}
						if (local116) {
							for (@Pc(142) int local142 = local21; local142 < local25; local142++) {
								arg1[local142] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(165) RuntimeException local165) {
			signlink.reporterror("79432, " + -67 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local165.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TONKJGVS", name = "a", descriptor = "([C[CII)I")
	private static int method424(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg3 == 0) {
				return 2;
			}
			for (@Pc(9) int local9 = arg3 - 1; local9 >= 0 && method438(arg0[local9]); local9--) {
				if (arg0[local9] == '@') {
					return 3;
				}
			}
			@Pc(29) int local29 = 0;
			@Pc(33) boolean local33 = false;
			for (@Pc(37) int local37 = arg3 - 1; local37 >= 0 && method438(arg1[local37]); local37--) {
				if (arg1[local37] == '*') {
					local29++;
				}
			}
			if (local29 >= 3) {
				return 4;
			} else if (method438(arg0[arg3 - 1])) {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("109, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TONKJGVS", name = "a", descriptor = "([CB[CI)I")
	private static int method425(@OriginalArg(0) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 + 1 == arg0.length) {
				return 2;
			}
			@Pc(13) int local13 = arg2 + 1;
			while (true) {
				if (local13 < arg0.length && method438(arg0[local13])) {
					if (arg0[local13] != '.' && arg0[local13] != ',') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(40) int local40 = 0;
				for (@Pc(49) int local49 = arg2 + 1; local49 < arg0.length && method438(arg1[local49]); local49++) {
					if (arg1[local49] == '*') {
						local40++;
					}
				}
				if (local40 >= 3) {
					return 4;
				}
				if (method438(arg0[arg2 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("18888, " + arg0 + ", " + 5 + ", " + arg1 + ", " + arg2 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TONKJGVS", name = "b", descriptor = "(I[C)V")
	private static void method426(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1) {
		try {
			@Pc(3) char[] local3 = (char[]) arg1.clone();
			@Pc(18) char[] local18 = new char[] { 'd', 'o', 't' };
			method430(null, local3, local18);
			@Pc(27) char[] local27 = (char[]) arg1.clone();
			@Pc(50) char[] local50 = new char[] { 's', 'l', 'a', 's', 'h' };
			method430(null, local27, local50);
			for (@Pc(57) int local57 = 0; local57 < aCharArrayArray3.length; local57++) {
				method427(local3, anIntArray185[local57], aCharArrayArray3[local57], local27, arg1);
			}
			if (arg0 != anInt716) {
				anInt715 = -289;
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("97896, " + arg0 + ", " + arg1 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TONKJGVS", name = "a", descriptor = "([CII[C[C[C)V")
	private static void method427(@OriginalArg(0) char[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) char[] arg2, @OriginalArg(4) char[] arg3, @OriginalArg(5) char[] arg4) {
		try {
			if (arg2.length <= arg4.length) {
				@Pc(24) int local24;
				for (@Pc(16) int local16 = 0; local16 <= arg4.length - arg2.length; local16 += local24) {
					@Pc(20) int local20 = local16;
					@Pc(22) int local22 = 0;
					local24 = 1;
					label120: while (true) {
						while (true) {
							if (local20 >= arg4.length) {
								break label120;
							}
							@Pc(32) char local32 = arg4[local20];
							@Pc(34) char local34 = 0;
							if (local20 + 1 < arg4.length) {
								local34 = arg4[local20 + 1];
							}
							@Pc(59) int local59;
							if (local22 < arg2.length && (local59 = method432(local32, local34, arg2[local22])) > 0) {
								local20 += local59;
								local22++;
							} else {
								if (local22 == 0) {
									break label120;
								}
								@Pc(80) int local80;
								if ((local80 = method432(local32, local34, arg2[local22 - 1])) > 0) {
									local20 += local80;
									if (local22 == 1) {
										local24++;
									}
								} else {
									if (local22 >= arg2.length || !method438(local32)) {
										break label120;
									}
									local20++;
								}
							}
						}
					}
					if (local22 >= arg2.length) {
						@Pc(111) boolean local111 = false;
						@Pc(117) int local117 = method428(arg4, arg0, local16);
						@Pc(125) int local125 = method429(local20 - 1, aBoolean159, arg4, arg3);
						if (arg1 == 1 && local117 > 0 && local125 > 0) {
							local111 = true;
						}
						if (arg1 == 2 && (local117 > 2 && local125 > 0 || local117 > 0 && local125 > 2)) {
							local111 = true;
						}
						if (arg1 == 3 && local117 > 0 && local125 > 2) {
							local111 = true;
						}
						@Pc(168) boolean local168;
						if (arg1 == 3 && local117 > 2 && local125 > 0) {
							local168 = true;
						} else {
							local168 = false;
						}
						if (local111) {
							@Pc(175) int local175 = local16;
							@Pc(179) int local179 = local20 - 1;
							@Pc(187) boolean local187;
							@Pc(191) int local191;
							if (local117 > 2) {
								if (local117 == 4) {
									local187 = false;
									for (local191 = local16 - 1; local191 >= 0; local191--) {
										if (local187) {
											if (arg0[local191] != '*') {
												break;
											}
											local175 = local191;
										} else if (arg0[local191] == '*') {
											local175 = local191;
											local187 = true;
										}
									}
								}
								local187 = false;
								for (local191 = local175 - 1; local191 >= 0; local191--) {
									if (local187) {
										if (method438(arg4[local191])) {
											break;
										}
										local175 = local191;
									} else if (!method438(arg4[local191])) {
										local187 = true;
										local175 = local191;
									}
								}
							}
							if (local125 > 2) {
								if (local125 == 4) {
									local187 = false;
									for (local191 = local179 + 1; local191 < arg4.length; local191++) {
										if (local187) {
											if (arg3[local191] != '*') {
												break;
											}
											local179 = local191;
										} else if (arg3[local191] == '*') {
											local179 = local191;
											local187 = true;
										}
									}
								}
								local187 = false;
								for (local191 = local179 + 1; local191 < arg4.length; local191++) {
									if (local187) {
										if (method438(arg4[local191])) {
											break;
										}
										local179 = local191;
									} else if (!method438(arg4[local191])) {
										local187 = true;
										local179 = local191;
									}
								}
							}
							for (@Pc(325) int local325 = local175; local325 <= local179; local325++) {
								arg4[local325] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(348) RuntimeException local348) {
			signlink.reporterror("14158, " + arg0 + ", " + -585 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local348.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TONKJGVS", name = "a", descriptor = "([CI[CI)I")
	private static int method428(@OriginalArg(0) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 == 0) {
				return 2;
			}
			@Pc(9) int local9 = arg2 - 1;
			while (true) {
				if (local9 >= 0 && method438(arg0[local9])) {
					if (arg0[local9] != ',' && arg0[local9] != '.') {
						local9--;
						continue;
					}
					return 3;
				}
				@Pc(34) int local34 = 0;
				for (@Pc(43) int local43 = arg2 - 1; local43 >= 0 && method438(arg1[local43]); local43--) {
					if (arg1[local43] == '*') {
						local34++;
					}
				}
				if (local34 >= 3) {
					return 4;
				}
				if (method438(arg0[arg2 - 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("31994, " + arg0 + ", " + 6 + ", " + arg1 + ", " + arg2 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TONKJGVS", name = "a", descriptor = "(IZ[C[C)I")
	private static int method429(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) char[] arg3) {
		try {
			if (!arg1) {
				aBoolean160 = !aBoolean160;
			}
			if (arg0 + 1 == arg2.length) {
				return 2;
			}
			@Pc(21) int local21 = arg0 + 1;
			while (true) {
				if (local21 < arg2.length && method438(arg2[local21])) {
					if (arg2[local21] != '\\' && arg2[local21] != '/') {
						local21++;
						continue;
					}
					return 3;
				}
				@Pc(48) int local48 = 0;
				for (@Pc(52) int local52 = arg0 + 1; local52 < arg2.length && method438(arg3[local52]); local52++) {
					if (arg3[local52] == '*') {
						local48++;
					}
				}
				if (local48 >= 5) {
					return 4;
				}
				if (method438(arg2[arg0 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("36182, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TONKJGVS", name = "a", descriptor = "(B[[B[C[C)V")
	private static void method430(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg2.length <= arg1.length) {
				@Pc(26) int local26;
				for (@Pc(16) int local16 = 0; local16 <= arg1.length - arg2.length; local16 += local26) {
					@Pc(20) int local20 = local16;
					@Pc(22) int local22 = 0;
					@Pc(24) int local24 = 0;
					local26 = 1;
					@Pc(28) boolean local28 = false;
					@Pc(30) boolean local30 = false;
					@Pc(32) boolean local32 = false;
					@Pc(40) char var12;
					@Pc(42) char var13;
					label164: while (true) {
						while (true) {
							if (local20 >= arg1.length || local30 && local32) {
								break label164;
							}
							var12 = arg1[local20];
							var13 = '\u0000';
							if (local20 + 1 < arg1.length) {
								var13 = arg1[local20 + 1];
							}
							@Pc(67) int local67;
							if (local22 < arg2.length && (local67 = method433(aBoolean161, var12, arg2[local22], var13)) > 0) {
								if (local67 == 1 && method441(var12)) {
									local30 = true;
								}
								if (local67 == 2 && (method441(var12) || method441(var13))) {
									local30 = true;
								}
								local20 += local67;
								local22++;
							} else {
								if (local22 == 0) {
									break label164;
								}
								@Pc(110) int local110;
								if ((local110 = method433(aBoolean161, var12, arg2[local22 - 1], var13)) > 0) {
									local20 += local110;
									if (local22 == 1) {
										local26++;
									}
								} else {
									if (local22 >= arg2.length || !method439(var12)) {
										break label164;
									}
									if (method438(var12) && var12 != '\'') {
										local28 = true;
									}
									if (method441(var12)) {
										local32 = true;
									}
									local20++;
									local24++;
									if (local24 * 100 / (local20 - local16) > 90) {
										break label164;
									}
								}
							}
						}
					}
					if (local22 >= arg2.length && (!local30 || !local32)) {
						@Pc(175) boolean local175 = true;
						@Pc(271) int local271;
						if (local28) {
							@Pc(221) boolean local221 = false;
							@Pc(223) boolean local223 = false;
							if (local16 - 1 < 0 || method438(arg1[local16 - 1]) && arg1[local16 - 1] != '\'') {
								local221 = true;
							}
							if (local20 >= arg1.length || method438(arg1[local20]) && arg1[local20] != '\'') {
								local223 = true;
							}
							if (!local221 || !local223) {
								@Pc(267) boolean local267 = false;
								local271 = local16 - 2;
								if (local221) {
									local271 = local16;
								}
								while (!local267 && local271 < local20) {
									if (local271 >= 0 && (!method438(arg1[local271]) || arg1[local271] == '\'')) {
										@Pc(293) char[] local293 = new char[3];
										@Pc(295) int local295;
										for (local295 = 0; local295 < 3 && local271 + local295 < arg1.length && (!method438(arg1[local271 + local295]) || arg1[local271 + local295] == '\''); local295++) {
											local293[local295] = arg1[local271 + local295];
										}
										@Pc(333) boolean local333 = true;
										if (local295 == 0) {
											local333 = false;
										}
										if (local295 < 3 && local271 - 1 >= 0 && (!method438(arg1[local271 - 1]) || arg1[local271 - 1] == '\'')) {
											local333 = false;
										}
										if (local333 && !method444(local293)) {
											local267 = true;
										}
									}
									local271++;
								}
								if (!local267) {
									local175 = false;
								}
							}
						} else {
							var12 = ' ';
							if (local16 - 1 >= 0) {
								var12 = arg1[local16 - 1];
							}
							var13 = ' ';
							if (local20 < arg1.length) {
								var13 = arg1[local20];
							}
							@Pc(203) byte local203 = method434(var12);
							@Pc(207) byte local207 = method434(var13);
							if (arg0 != null && method431(local207, arg0, local203)) {
								local175 = false;
							}
						}
						if (local175) {
							@Pc(383) int local383 = 0;
							@Pc(385) int local385 = 0;
							@Pc(387) int local387 = -1;
							for (local271 = local16; local271 < local20; local271++) {
								if (method441(arg1[local271])) {
									local383++;
								} else if (method440(arg1[local271])) {
									local385++;
									local387 = local271;
								}
							}
							if (local387 > -1) {
								local383 -= local20 - local387 - 1;
							}
							if (local383 <= local385) {
								for (@Pc(429) int local429 = local16; local429 < local20; local429++) {
									arg1[local429] = '*';
								}
							} else {
								local26 = 1;
							}
						}
					}
				}
			}
		} catch (@Pc(456) RuntimeException local456) {
			signlink.reporterror("3986, " + 7 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local456.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TONKJGVS", name = "a", descriptor = "(B[[BBB)Z")
	private static boolean method431(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(3) byte arg2) {
		try {
			@Pc(1) int local1 = 0;
			if (arg1[0][0] == arg2 && arg1[0][1] == arg0) {
				return true;
			}
			@Pc(29) int local29 = arg1.length - 1;
			if (arg1[local29][0] == arg2 && arg1[local29][1] == arg0) {
				return true;
			}
			do {
				@Pc(51) int local51 = (local1 + local29) / 2;
				if (arg1[local51][0] == arg2 && arg1[local51][1] == arg0) {
					return true;
				}
				if (arg2 < arg1[local51][0] || arg2 == arg1[local51][0] && arg0 < arg1[local51][1]) {
					local29 = local51;
				} else {
					local1 = local51;
				}
			} while (local1 != local29 && local1 + 1 != local29);
			return false;
		} catch (@Pc(105) RuntimeException local105) {
			signlink.reporterror("27688, " + arg0 + ", " + arg1 + ", " + 5 + ", " + arg2 + ", " + local105.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TONKJGVS", name = "a", descriptor = "(ICCC)I")
	private static int method432(@OriginalArg(1) char arg0, @OriginalArg(2) char arg1, @OriginalArg(3) char arg2) {
		try {
			if (arg2 == arg0) {
				return 1;
			} else if (arg2 == 'o' && arg0 == '0') {
				return 1;
			} else if (arg2 == 'o' && arg0 == '(' && arg1 == ')') {
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
			signlink.reporterror("97622, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TONKJGVS", name = "a", descriptor = "(ZCCC)I")
	private static int method433(@OriginalArg(0) boolean arg0, @OriginalArg(1) char arg1, @OriginalArg(2) char arg2, @OriginalArg(3) char arg3) {
		try {
			if (arg0) {
				aBoolean161 = !aBoolean161;
			}
			if (arg2 == arg1) {
				return 1;
			}
			if (arg2 >= 'a' && arg2 <= 'm') {
				if (arg2 == 'a') {
					if (arg1 != '4' && arg1 != '@' && arg1 != '^') {
						if (arg1 == '/' && arg3 == '\\') {
							return 2;
						}
						return 0;
					}
					return 1;
				}
				if (arg2 == 'b') {
					if (arg1 != '6' && arg1 != '8') {
						if ((arg1 != '1' || arg3 != '3') && (arg1 != 'i' || arg3 != '3')) {
							return 0;
						}
						return 2;
					}
					return 1;
				}
				if (arg2 == 'c') {
					if (arg1 != '(' && arg1 != '<' && arg1 != '{' && arg1 != '[') {
						return 0;
					}
					return 1;
				}
				if (arg2 == 'd') {
					if ((arg1 != '[' || arg3 != ')') && (arg1 != 'i' || arg3 != ')')) {
						return 0;
					}
					return 2;
				}
				if (arg2 == 'e') {
					if (arg1 != '3' && arg1 != '€') {
						return 0;
					}
					return 1;
				}
				if (arg2 == 'f') {
					if (arg1 == 'p' && arg3 == 'h') {
						return 2;
					}
					if (arg1 == '£') {
						return 1;
					}
					return 0;
				}
				if (arg2 == 'g') {
					if (arg1 != '9' && arg1 != '6' && arg1 != 'q') {
						return 0;
					}
					return 1;
				}
				if (arg2 == 'h') {
					if (arg1 == '#') {
						return 1;
					}
					return 0;
				}
				if (arg2 == 'i') {
					if (arg1 != 'y' && arg1 != 'l' && arg1 != 'j' && arg1 != '1' && arg1 != '!' && arg1 != ':' && arg1 != ';' && arg1 != '|') {
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
					if (arg1 != '1' && arg1 != '|' && arg1 != 'i') {
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
					if (arg1 != '0' && arg1 != '*') {
						if ((arg1 != '(' || arg3 != ')') && (arg1 != '[' || arg3 != ']') && (arg1 != '{' || arg3 != '}') && (arg1 != '<' || arg3 != '>')) {
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
					if (arg1 != '5' && arg1 != 'z' && arg1 != '$' && arg1 != '2') {
						return 0;
					}
					return 1;
				}
				if (arg2 == 't') {
					if (arg1 != '7' && arg1 != '+') {
						return 0;
					}
					return 1;
				}
				if (arg2 == 'u') {
					if (arg1 == 'v') {
						return 1;
					}
					if ((arg1 != '\\' || arg3 != '/') && (arg1 != '\\' || arg3 != '|') && (arg1 != '|' || arg3 != '/')) {
						return 0;
					}
					return 2;
				}
				if (arg2 == 'v') {
					if ((arg1 != '\\' || arg3 != '/') && (arg1 != '\\' || arg3 != '|') && (arg1 != '|' || arg3 != '/')) {
						return 0;
					}
					return 2;
				}
				if (arg2 == 'w') {
					if (arg1 == 'v' && arg3 == 'v') {
						return 2;
					}
					return 0;
				}
				if (arg2 == 'x') {
					if ((arg1 != ')' || arg3 != '(') && (arg1 != '}' || arg3 != '{') && (arg1 != ']' || arg3 != '[') && (arg1 != '>' || arg3 != '<')) {
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
					if (arg1 == 'o' || arg1 == 'O') {
						return 1;
					} else if ((arg1 != '(' || arg3 != ')') && (arg1 != '{' || arg3 != '}') && (arg1 != '[' || arg3 != ']')) {
						return 0;
					} else {
						return 2;
					}
				} else if (arg2 == '1') {
					return arg1 == 'l' ? 1 : 0;
				} else {
					return 0;
				}
			} else if (arg2 == ',') {
				return arg1 == '.' ? 1 : 0;
			} else if (arg2 == '.') {
				return arg1 == ',' ? 1 : 0;
			} else if (arg2 == '!') {
				return arg1 == 'i' ? 1 : 0;
			} else {
				return 0;
			}
		} catch (@Pc(516) RuntimeException local516) {
			signlink.reporterror("86838, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local516.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TONKJGVS", name = "a", descriptor = "(CZ)B")
	private static byte method434(@OriginalArg(0) char arg0) {
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
			signlink.reporterror("88663, " + arg0 + ", " + false + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TONKJGVS", name = "b", descriptor = "(B[C)V")
	private static void method435(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			@Pc(13) int local13 = 0;
			while (true) {
				do {
					@Pc(112) int local112;
					if ((local112 = method436(local5, arg0)) == -1) {
						return;
					}
					@Pc(17) boolean local17 = false;
					for (@Pc(19) int local19 = local5; local19 >= 0 && local19 < local112 && !local17; local19++) {
						if (!method438(arg0[local19]) && !method439(arg0[local19])) {
							local17 = true;
						}
					}
					if (local17) {
						local7 = 0;
					}
					if (local7 == 0) {
						local13 = local112;
					}
					local5 = method437(arg0, local112);
					@Pc(58) int local58 = 0;
					for (@Pc(60) int local60 = local112; local60 < local5; local60++) {
						local58 = local58 * 10 + arg0[local60] - 48;
					}
					if (local58 <= 255 && local5 - local112 <= 8) {
						local7++;
					} else {
						local7 = 0;
					}
				} while (local7 != 4);
				for (@Pc(94) int local94 = local13; local94 < local5; local94++) {
					arg0[local94] = '*';
				}
				local7 = 0;
			}
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("65010, " + 6 + ", " + arg0 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TONKJGVS", name = "a", descriptor = "(II[C)I")
	private static int method436(@OriginalArg(0) int arg0, @OriginalArg(2) char[] arg1) {
		try {
			for (@Pc(13) int local13 = arg0; local13 < arg1.length && local13 >= 0; local13++) {
				if (arg1[local13] >= '0' && arg1[local13] <= '9') {
					return local13;
				}
			}
			return -1;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("33107, " + arg0 + ", " + -16602 + ", " + arg1 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TONKJGVS", name = "a", descriptor = "(I[CI)I")
	private static int method437(@OriginalArg(1) char[] arg0, @OriginalArg(2) int arg1) {
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
			signlink.reporterror("8178, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TONKJGVS", name = "a", descriptor = "(IC)Z")
	private static boolean method438(@OriginalArg(1) char arg0) {
		try {
			return !method440(arg0) && !method441(arg0);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("26103, " + 0 + ", " + arg0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TONKJGVS", name = "a", descriptor = "(CI)Z")
	private static boolean method439(@OriginalArg(0) char arg0) {
		try {
			if (arg0 >= 'a' && arg0 <= 'z') {
				return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
			} else {
				return true;
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("97473, " + arg0 + ", " + 0 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TONKJGVS", name = "b", descriptor = "(IC)Z")
	private static boolean method440(@OriginalArg(1) char arg0) {
		try {
			if (anInt717 != 23345) {
				anInt714 = 64;
			}
			return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("74241, " + 23345 + ", " + arg0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TONKJGVS", name = "b", descriptor = "(CI)Z")
	private static boolean method441(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= '0' && arg0 <= '9';
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("65632, " + arg0 + ", " + 415 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TONKJGVS", name = "b", descriptor = "(CZ)Z")
	private static boolean method442(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z';
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("42423, " + arg0 + ", " + true + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TONKJGVS", name = "a", descriptor = "(CB)Z")
	private static boolean method443(@OriginalArg(0) char arg0, @OriginalArg(1) byte arg1) {
		try {
			if (arg1 != -58) {
				aBoolean159 = !aBoolean159;
			}
			return arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("68964, " + arg0 + ", " + arg1 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TONKJGVS", name = "c", descriptor = "([CI)Z")
	private static boolean method444(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				if (!method441(arg0[local5]) && arg0[local5] != '\u0000') {
					local3 = false;
				}
			}
			if (anInt718 != 7) {
				throw new NullPointerException();
			} else if (local3) {
				return true;
			} else {
				@Pc(39) int local39 = method445(arg0);
				@Pc(41) int local41 = 0;
				@Pc(46) int local46 = anIntArray184.length - 1;
				if (local39 == anIntArray184[0] || local39 == anIntArray184[local46]) {
					return true;
				}
				do {
					@Pc(64) int local64 = (local41 + local46) / 2;
					if (local39 == anIntArray184[local64]) {
						return true;
					}
					if (local39 < anIntArray184[local64]) {
						local46 = local64;
					} else {
						local41 = local64;
					}
				} while (local41 != local46 && local41 + 1 != local46);
				return false;
			}
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("80694, " + arg0 + ", " + 7 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TONKJGVS", name = "c", descriptor = "(B[C)I")
	private static int method445(@OriginalArg(1) char[] arg0) {
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
			signlink.reporterror("18083, " + 1 + ", " + arg0 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}
}
