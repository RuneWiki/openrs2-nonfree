import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!JVGHFIOO")
public final class Class18 {

	@OriginalMember(owner = "client!JVGHFIOO", name = "a", descriptor = "Z")
	private static boolean aBoolean73;

	@OriginalMember(owner = "client!JVGHFIOO", name = "c", descriptor = "I")
	private static int anInt254;

	@OriginalMember(owner = "client!JVGHFIOO", name = "k", descriptor = "Z")
	private static boolean aBoolean74;

	@OriginalMember(owner = "client!JVGHFIOO", name = "m", descriptor = "[I")
	private static int[] anIntArray88;

	@OriginalMember(owner = "client!JVGHFIOO", name = "n", descriptor = "[[C")
	private static char[][] aCharArrayArray1;

	@OriginalMember(owner = "client!JVGHFIOO", name = "o", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!JVGHFIOO", name = "p", descriptor = "[[C")
	private static char[][] aCharArrayArray2;

	@OriginalMember(owner = "client!JVGHFIOO", name = "q", descriptor = "[[C")
	private static char[][] aCharArrayArray3;

	@OriginalMember(owner = "client!JVGHFIOO", name = "r", descriptor = "[I")
	private static int[] anIntArray89;

	@OriginalMember(owner = "client!JVGHFIOO", name = "b", descriptor = "I")
	private static int anInt253 = 61;

	@OriginalMember(owner = "client!JVGHFIOO", name = "d", descriptor = "I")
	private static int anInt255 = 148;

	@OriginalMember(owner = "client!JVGHFIOO", name = "e", descriptor = "I")
	private static int anInt256 = -312;

	@OriginalMember(owner = "client!JVGHFIOO", name = "f", descriptor = "I")
	private static int anInt257 = 13881;

	@OriginalMember(owner = "client!JVGHFIOO", name = "g", descriptor = "I")
	private static int anInt258 = -949;

	@OriginalMember(owner = "client!JVGHFIOO", name = "h", descriptor = "I")
	private static int anInt259 = 3;

	@OriginalMember(owner = "client!JVGHFIOO", name = "i", descriptor = "I")
	private static int anInt260 = 662;

	@OriginalMember(owner = "client!JVGHFIOO", name = "j", descriptor = "I")
	private static int anInt261 = 9;

	@OriginalMember(owner = "client!JVGHFIOO", name = "l", descriptor = "I")
	private static int anInt262 = 105;

	@OriginalMember(owner = "client!JVGHFIOO", name = "s", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray1 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

	@OriginalMember(owner = "client!JVGHFIOO", name = "a", descriptor = "(Lclient!FUZJMGZB;)V")
	public static void method198(@OriginalArg(0) Class13 arg0) {
		@Pc(10) Class2_Sub1_Sub3 local10 = new Class2_Sub1_Sub3((byte) 114, arg0.method186("fragmentsenc.txt", null));
		@Pc(19) Class2_Sub1_Sub3 local19 = new Class2_Sub1_Sub3((byte) 114, arg0.method186("badenc.txt", null));
		@Pc(28) Class2_Sub1_Sub3 local28 = new Class2_Sub1_Sub3((byte) 114, arg0.method186("domainenc.txt", null));
		@Pc(37) Class2_Sub1_Sub3 local37 = new Class2_Sub1_Sub3((byte) 114, arg0.method186("tldlist.txt", null));
		method199(local10, local19, local28, local37);
	}

	@OriginalMember(owner = "client!JVGHFIOO", name = "a", descriptor = "(Lclient!LBBVYYXO;Lclient!LBBVYYXO;Lclient!LBBVYYXO;Lclient!LBBVYYXO;)V")
	private static void method199(@OriginalArg(0) Class2_Sub1_Sub3 arg0, @OriginalArg(1) Class2_Sub1_Sub3 arg1, @OriginalArg(2) Class2_Sub1_Sub3 arg2, @OriginalArg(3) Class2_Sub1_Sub3 arg3) {
		method201(arg1);
		method202(arg2);
		method203(arg0);
		method200(arg3);
	}

	@OriginalMember(owner = "client!JVGHFIOO", name = "a", descriptor = "(ILclient!LBBVYYXO;)V")
	private static void method200(@OriginalArg(1) Class2_Sub1_Sub3 arg0) {
		try {
			@Pc(7) int local7 = arg0.method272();
			aCharArrayArray3 = new char[local7][];
			anIntArray89 = new int[local7];
			for (@Pc(15) int local15 = 0; local15 < local7; local15++) {
				anIntArray89[local15] = arg0.method267();
				@Pc(26) char[] local26 = new char[arg0.method267()];
				for (@Pc(28) int local28 = 0; local28 < local26.length; local28++) {
					local26[local28] = (char) arg0.method267();
				}
				aCharArrayArray3[local15] = local26;
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("27252, " + -927 + ", " + arg0 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JVGHFIOO", name = "a", descriptor = "(Lclient!LBBVYYXO;I)V")
	private static void method201(@OriginalArg(0) Class2_Sub1_Sub3 arg0) {
		try {
			@Pc(2) int local2 = arg0.method272();
			aCharArrayArray1 = new char[local2][];
			aByteArrayArrayArray7 = new byte[local2][][];
			method204(aByteArrayArrayArray7, 136, aCharArrayArray1, arg0);
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("82451, " + arg0 + ", " + -17 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JVGHFIOO", name = "a", descriptor = "(Lclient!LBBVYYXO;Z)V")
	private static void method202(@OriginalArg(0) Class2_Sub1_Sub3 arg0) {
		try {
			@Pc(2) int local2 = arg0.method272();
			aCharArrayArray2 = new char[local2][];
			method205(arg0, aCharArrayArray2);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("61149, " + arg0 + ", " + true + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JVGHFIOO", name = "b", descriptor = "(ILclient!LBBVYYXO;)V")
	private static void method203(@OriginalArg(1) Class2_Sub1_Sub3 arg0) {
		try {
			anIntArray88 = new int[arg0.method272()];
			for (@Pc(7) int local7 = 0; local7 < anIntArray88.length; local7++) {
				anIntArray88[local7] = arg0.method269();
			}
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("3160, " + 94 + ", " + arg0 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JVGHFIOO", name = "a", descriptor = "([[[BI[[CLclient!LBBVYYXO;)V")
	private static void method204(@OriginalArg(0) byte[][][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) char[][] arg2, @OriginalArg(3) Class2_Sub1_Sub3 arg3) {
		try {
			for (@Pc(3) int local3 = 0; local3 < arg2.length; local3++) {
				@Pc(9) char[] local9 = new char[arg3.method267()];
				for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
					local9[local11] = (char) arg3.method267();
				}
				arg2[local3] = local9;
				@Pc(33) byte[][] local33 = new byte[arg3.method267()][2];
				for (@Pc(35) int local35 = 0; local35 < local33.length; local35++) {
					local33[local35][0] = (byte) arg3.method267();
					local33[local35][1] = (byte) arg3.method267();
				}
				if (local33.length > 0) {
					arg0[local3] = local33;
				}
			}
			@Pc(74) boolean local74 = false;
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("24309, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JVGHFIOO", name = "a", descriptor = "(Lclient!LBBVYYXO;I[[C)V")
	private static void method205(@OriginalArg(0) Class2_Sub1_Sub3 arg0, @OriginalArg(2) char[][] arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
				@Pc(9) char[] local9 = new char[arg0.method267()];
				for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
					local9[local11] = (char) arg0.method267();
				}
				arg1[local3] = local9;
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("66137, " + arg0 + ", " + -115 + ", " + arg1 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JVGHFIOO", name = "a", descriptor = "([CI)V")
	private static void method206(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) int local3 = 0;
			@Pc(7) boolean local7 = false;
			for (@Pc(9) int local9 = 0; local9 < arg0.length; local9++) {
				if (method207(arg0[local9])) {
					arg0[local3] = arg0[local9];
				} else {
					arg0[local3] = ' ';
				}
				if (local3 == 0 || arg0[local3] != ' ' || arg0[local3 - 1] != ' ') {
					local3++;
				}
			}
			for (@Pc(51) int local51 = local3; local51 < arg0.length; local51++) {
				arg0[local51] = ' ';
			}
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("88223, " + arg0 + ", " + arg1 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JVGHFIOO", name = "a", descriptor = "(IC)Z")
	private static boolean method207(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= ' ' && arg0 <= '\u007f' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("92686, " + 3 + ", " + arg0 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JVGHFIOO", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method208(@OriginalArg(0) String arg0) {
		try {
			@Pc(3) long local3 = System.currentTimeMillis();
			@Pc(6) char[] local6 = arg0.toCharArray();
			method206(local6, 824);
			@Pc(15) String local15 = (new String(local6)).trim();
			@Pc(19) char[] local19 = local15.toLowerCase().toCharArray();
			@Pc(22) String local22 = local15.toLowerCase();
			method216(local19);
			method211(local19);
			method212(local19);
			method225(local19);
			for (@Pc(36) int local36 = 0; local36 < aStringArray1.length; local36++) {
				@Pc(46) int local46 = -1;
				while ((local46 = local22.indexOf(aStringArray1[local36], local46 + 1)) != -1) {
					@Pc(53) char[] local53 = aStringArray1[local36].toCharArray();
					for (@Pc(55) int local55 = 0; local55 < local53.length; local55++) {
						local19[local55 + local46] = local53[local55];
					}
				}
			}
			method209(local19, local15.toCharArray());
			method210(local19);
			@Pc(101) long local101 = System.currentTimeMillis();
			return (new String(local19)).trim();
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("82531, " + arg0 + ", " + 0 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JVGHFIOO", name = "a", descriptor = "([C[CI)V")
	private static void method209(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
				if (arg0[local3] != '*' && method233(arg1[local3])) {
					arg0[local3] = arg1[local3];
				}
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("85540, " + arg0 + ", " + arg1 + ", " + -15 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JVGHFIOO", name = "a", descriptor = "(I[C)V")
	private static void method210(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(12) boolean local12 = true;
			for (@Pc(14) int local14 = 0; local14 < arg0.length; local14++) {
				@Pc(20) char local20 = arg0[local14];
				if (!method230(local20)) {
					local12 = true;
				} else if (local12) {
					if (method232(local20)) {
						local12 = false;
					}
				} else if (method233(local20)) {
					arg0[local14] = (char) (local20 + 'a' - 65);
				}
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("49803, " + -28516 + ", " + arg0 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JVGHFIOO", name = "b", descriptor = "(I[C)V")
	private static void method211(@OriginalArg(1) char[] arg0) {
		try {
			for (@Pc(6) int local6 = 0; local6 < 2; local6++) {
				for (@Pc(13) int local13 = aCharArrayArray1.length - 1; local13 >= 0; local13--) {
					method220(aByteArrayArrayArray7[local13], arg0, aCharArrayArray1[local13]);
				}
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("96925, " + 0 + ", " + arg0 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JVGHFIOO", name = "c", descriptor = "(I[C)V")
	private static void method212(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(18) char[] local18 = new char[] { '(', 'a', ')' };
			method220(null, local3, local18);
			@Pc(27) char[] local27 = (char[]) arg0.clone();
			@Pc(42) char[] local42 = new char[] { 'd', 'o', 't' };
			method220(null, local27, local42);
			for (@Pc(60) int local60 = aCharArrayArray2.length - 1; local60 >= 0; local60--) {
				method213(local3, arg0, local27, aCharArrayArray2[local60]);
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("64185, " + 0 + ", " + arg0 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JVGHFIOO", name = "a", descriptor = "([CI[C[C[C)V")
	private static void method213(@OriginalArg(0) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2, @OriginalArg(4) char[] arg3) {
		try {
			if (arg3.length <= arg1.length) {
				@Pc(22) int local22;
				for (@Pc(14) int local14 = 0; local14 <= arg1.length - arg3.length; local14 += local22) {
					@Pc(18) int local18 = local14;
					@Pc(20) int local20 = 0;
					local22 = 1;
					label58: while (true) {
						while (true) {
							if (local18 >= arg1.length) {
								break label58;
							}
							@Pc(30) char local30 = arg1[local18];
							@Pc(32) char local32 = 0;
							if (local18 + 1 < arg1.length) {
								local32 = arg1[local18 + 1];
							}
							@Pc(57) int local57;
							if (local20 < arg3.length && (local57 = method222(local30, arg3[local20], anInt256, local32)) > 0) {
								local18 += local57;
								local20++;
							} else {
								if (local20 == 0) {
									break label58;
								}
								@Pc(78) int local78;
								if ((local78 = method222(local30, arg3[local20 - 1], anInt256, local32)) > 0) {
									local18 += local78;
									if (local20 == 1) {
										local22++;
									}
								} else {
									if (local20 >= arg3.length || !method228(694, local30)) {
										break label58;
									}
									local18++;
								}
							}
						}
					}
					if (local20 >= arg3.length) {
						@Pc(109) boolean local109 = false;
						@Pc(115) int local115 = method214(arg0, arg1, local14);
						@Pc(123) int local123 = method215(local18 - 1, arg1, arg2);
						if (local115 > 2 || local123 > 2) {
							local109 = true;
						}
						if (local109) {
							for (@Pc(135) int local135 = local14; local135 < local18; local135++) {
								arg1[local135] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("23893, " + arg0 + ", " + 81 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JVGHFIOO", name = "a", descriptor = "(I[C[CI)I")
	private static int method214(@OriginalArg(1) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 == 0) {
				return 2;
			}
			for (@Pc(13) int local13 = arg2 - 1; local13 >= 0 && method228(694, arg1[local13]); local13--) {
				if (arg1[local13] == '@') {
					return 3;
				}
			}
			@Pc(33) int local33 = 0;
			for (@Pc(37) int local37 = arg2 - 1; local37 >= 0 && method228(694, arg0[local37]); local37--) {
				if (arg0[local37] == '*') {
					local33++;
				}
			}
			if (local33 >= 3) {
				return 4;
			} else if (method228(694, arg1[arg2 - 1])) {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("40364, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JVGHFIOO", name = "a", descriptor = "(I[CZ[C)I")
	private static int method215(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg0 + 1 == arg1.length) {
				return 2;
			}
			@Pc(13) int local13 = arg0 + 1;
			while (true) {
				if (local13 < arg1.length && method228(694, arg1[local13])) {
					if (arg1[local13] != '.' && arg1[local13] != ',') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(40) int local40 = 0;
				for (@Pc(44) int local44 = arg0 + 1; local44 < arg1.length && method228(694, arg2[local44]); local44++) {
					if (arg2[local44] == '*') {
						local40++;
					}
				}
				if (local40 >= 3) {
					return 4;
				}
				if (method228(694, arg1[arg0 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("96701, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JVGHFIOO", name = "a", descriptor = "(Z[C)V")
	private static void method216(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(5) char[] local5 = (char[]) arg0.clone();
			@Pc(20) char[] local20 = new char[] { 'd', 'o', 't' };
			method220(null, local5, local20);
			@Pc(29) char[] local29 = (char[]) arg0.clone();
			@Pc(52) char[] local52 = new char[] { 's', 'l', 'a', 's', 'h' };
			method220(null, local29, local52);
			for (@Pc(59) int local59 = 0; local59 < aCharArrayArray3.length; local59++) {
				method217(anIntArray89[local59], local5, arg0, local29, aCharArrayArray3[local59]);
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("76716, " + false + ", " + arg0 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JVGHFIOO", name = "a", descriptor = "(I[C[C[CZ[C)V")
	private static void method217(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) char[] arg3, @OriginalArg(5) char[] arg4) {
		try {
			if (arg4.length <= arg2.length) {
				@Pc(27) int local27;
				for (@Pc(19) int local19 = 0; local19 <= arg2.length - arg4.length; local19 += local27) {
					@Pc(23) int local23 = local19;
					@Pc(25) int local25 = 0;
					local27 = 1;
					label120: while (true) {
						while (true) {
							if (local23 >= arg2.length) {
								break label120;
							}
							@Pc(35) char local35 = arg2[local23];
							@Pc(37) char local37 = 0;
							if (local23 + 1 < arg2.length) {
								local37 = arg2[local23 + 1];
							}
							@Pc(62) int local62;
							if (local25 < arg4.length && (local62 = method222(local35, arg4[local25], anInt256, local37)) > 0) {
								local23 += local62;
								local25++;
							} else {
								if (local25 == 0) {
									break label120;
								}
								@Pc(83) int local83;
								if ((local83 = method222(local35, arg4[local25 - 1], anInt256, local37)) > 0) {
									local23 += local83;
									if (local25 == 1) {
										local27++;
									}
								} else {
									if (local25 >= arg4.length || !method228(694, local35)) {
										break label120;
									}
									local23++;
								}
							}
						}
					}
					if (local25 >= arg4.length) {
						@Pc(114) boolean local114 = false;
						@Pc(120) int local120 = method218(arg2, local19, arg1);
						@Pc(128) int local128 = method219(arg2, local23 - 1, arg3);
						if (arg0 == 1 && local120 > 0 && local128 > 0) {
							local114 = true;
						}
						if (arg0 == 2 && (local120 > 2 && local128 > 0 || local120 > 0 && local128 > 2)) {
							local114 = true;
						}
						if (arg0 == 3 && local120 > 0 && local128 > 2) {
							local114 = true;
						}
						@Pc(171) boolean local171;
						if (arg0 == 3 && local120 > 2 && local128 > 0) {
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
											if (arg1[local194] != '*') {
												break;
											}
											local178 = local194;
										} else if (arg1[local194] == '*') {
											local178 = local194;
											local190 = true;
										}
									}
								}
								local190 = false;
								for (local194 = local178 - 1; local194 >= 0; local194--) {
									if (local190) {
										if (method228(694, arg2[local194])) {
											break;
										}
										local178 = local194;
									} else if (!method228(694, arg2[local194])) {
										local190 = true;
										local178 = local194;
									}
								}
							}
							if (local128 > 2) {
								if (local128 == 4) {
									local190 = false;
									for (local194 = local182 + 1; local194 < arg2.length; local194++) {
										if (local190) {
											if (arg3[local194] != '*') {
												break;
											}
											local182 = local194;
										} else if (arg3[local194] == '*') {
											local182 = local194;
											local190 = true;
										}
									}
								}
								local190 = false;
								for (local194 = local182 + 1; local194 < arg2.length; local194++) {
									if (local190) {
										if (method228(694, arg2[local194])) {
											break;
										}
										local182 = local194;
									} else if (!method228(694, arg2[local194])) {
										local190 = true;
										local182 = local194;
									}
								}
							}
							for (@Pc(328) int local328 = local178; local328 <= local182; local328++) {
								arg2[local328] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(351) RuntimeException local351) {
			signlink.reporterror("62823, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + true + ", " + arg4 + ", " + local351.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JVGHFIOO", name = "a", descriptor = "(I[CI[C)I")
	private static int method218(@OriginalArg(1) char[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg1 == 0) {
				return 2;
			}
			@Pc(9) int local9 = arg1 - 1;
			while (true) {
				if (local9 >= 0 && method228(694, arg0[local9])) {
					if (arg0[local9] != ',' && arg0[local9] != '.') {
						local9--;
						continue;
					}
					return 3;
				}
				@Pc(43) int local43 = 0;
				for (@Pc(47) int local47 = arg1 - 1; local47 >= 0 && method228(694, arg2[local47]); local47--) {
					if (arg2[local47] == '*') {
						local43++;
					}
				}
				if (local43 >= 3) {
					return 4;
				}
				if (method228(694, arg0[arg1 - 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("75680, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JVGHFIOO", name = "a", descriptor = "([CIZ[C)I")
	private static int method219(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg1 + 1 == arg0.length) {
				return 2;
			}
			@Pc(17) int local17 = arg1 + 1;
			while (true) {
				if (local17 < arg0.length && method228(694, arg0[local17])) {
					if (arg0[local17] != '\\' && arg0[local17] != '/') {
						local17++;
						continue;
					}
					return 3;
				}
				@Pc(44) int local44 = 0;
				for (@Pc(48) int local48 = arg1 + 1; local48 < arg0.length && method228(694, arg2[local48]); local48++) {
					if (arg2[local48] == '*') {
						local44++;
					}
				}
				if (local44 >= 5) {
					return 4;
				}
				if (method228(694, arg0[arg1 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("99381, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JVGHFIOO", name = "a", descriptor = "([[B[C[CI)V")
	private static void method220(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2) {
		try {
			if (arg2.length <= arg1.length) {
				@Pc(24) int local24;
				for (@Pc(14) int local14 = 0; local14 <= arg1.length - arg2.length; local14 += local24) {
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
							if (local18 >= arg1.length || local28 && local30) {
								break label164;
							}
							var12 = arg1[local18];
							var13 = '\u0000';
							if (local18 + 1 < arg1.length) {
								var13 = arg1[local18 + 1];
							}
							@Pc(65) int local65;
							if (local20 < arg2.length && (local65 = method223(var13, var12, anInt257, arg2[local20])) > 0) {
								if (local65 == 1 && method231(var12)) {
									local28 = true;
								}
								if (local65 == 2 && (method231(var12) || method231(var13))) {
									local28 = true;
								}
								local18 += local65;
								local20++;
							} else {
								if (local20 == 0) {
									break label164;
								}
								@Pc(108) int local108;
								if ((local108 = method223(var13, var12, anInt257, arg2[local20 - 1])) > 0) {
									local18 += local108;
									if (local20 == 1) {
										local24++;
									}
								} else {
									if (local20 >= arg2.length || !method229(var12)) {
										break label164;
									}
									if (method228(694, var12) && var12 != '\'') {
										local26 = true;
									}
									if (method231(var12)) {
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
					if (local20 >= arg2.length && (!local28 || !local30)) {
						@Pc(173) boolean local173 = true;
						@Pc(269) int local269;
						if (local26) {
							@Pc(219) boolean local219 = false;
							@Pc(221) boolean local221 = false;
							if (local14 - 1 < 0 || method228(694, arg1[local14 - 1]) && arg1[local14 - 1] != '\'') {
								local219 = true;
							}
							if (local18 >= arg1.length || method228(694, arg1[local18]) && arg1[local18] != '\'') {
								local221 = true;
							}
							if (!local219 || !local221) {
								@Pc(265) boolean local265 = false;
								local269 = local14 - 2;
								if (local219) {
									local269 = local14;
								}
								while (!local265 && local269 < local18) {
									if (local269 >= 0 && (!method228(694, arg1[local269]) || arg1[local269] == '\'')) {
										@Pc(291) char[] local291 = new char[3];
										@Pc(293) int local293;
										for (local293 = 0; local293 < 3 && local269 + local293 < arg1.length && (!method228(694, arg1[local269 + local293]) || arg1[local269 + local293] == '\''); local293++) {
											local291[local293] = arg1[local269 + local293];
										}
										@Pc(331) boolean local331 = true;
										if (local293 == 0) {
											local331 = false;
										}
										if (local293 < 3 && local269 - 1 >= 0 && (!method228(694, arg1[local269 - 1]) || arg1[local269 - 1] == '\'')) {
											local331 = false;
										}
										if (local331 && !method234(local291)) {
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
								var12 = arg1[local14 - 1];
							}
							var13 = ' ';
							if (local18 < arg1.length) {
								var13 = arg1[local18];
							}
							@Pc(201) byte local201 = method224(var12);
							@Pc(205) byte local205 = method224(var13);
							if (arg0 != null && method221(local205, arg0, local201)) {
								local173 = false;
							}
						}
						if (local173) {
							@Pc(381) int local381 = 0;
							@Pc(383) int local383 = 0;
							@Pc(385) int local385 = -1;
							for (local269 = local14; local269 < local18; local269++) {
								if (method231(arg1[local269])) {
									local381++;
								} else if (method230(arg1[local269])) {
									local383++;
									local385 = local269;
								}
							}
							if (local385 > -1) {
								local381 -= local18 - local385 - 1;
							}
							if (local381 <= local383) {
								for (@Pc(427) int local427 = local14; local427 < local18; local427++) {
									arg1[local427] = '*';
								}
							} else {
								local24 = 1;
							}
						}
					}
				}
			}
		} catch (@Pc(454) RuntimeException local454) {
			signlink.reporterror("47746, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local454.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JVGHFIOO", name = "a", descriptor = "(IB[[BB)Z")
	private static boolean method221(@OriginalArg(1) byte arg0, @OriginalArg(2) byte[][] arg1, @OriginalArg(3) byte arg2) {
		try {
			@Pc(5) int local5 = 0;
			if (arg1[0][0] == arg2 && arg1[0][1] == arg0) {
				return true;
			}
			@Pc(26) int local26 = arg1.length - 1;
			if (arg1[local26][0] == arg2 && arg1[local26][1] == arg0) {
				return true;
			}
			do {
				@Pc(48) int local48 = (local5 + local26) / 2;
				if (arg1[local48][0] == arg2 && arg1[local48][1] == arg0) {
					return true;
				}
				if (arg2 < arg1[local48][0] || arg2 == arg1[local48][0] && arg0 < arg1[local48][1]) {
					local26 = local48;
				} else {
					local5 = local48;
				}
			} while (local5 != local26 && local5 + 1 != local26);
			return false;
		} catch (@Pc(102) RuntimeException local102) {
			signlink.reporterror("64233, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local102.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JVGHFIOO", name = "a", descriptor = "(CCIC)I")
	private static int method222(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(2) int arg2, @OriginalArg(3) char arg3) {
		try {
			if (arg2 >= 0) {
				anInt255 = -192;
			}
			if (arg1 == arg0) {
				return 1;
			} else if (arg1 == 'o' && arg0 == '0') {
				return 1;
			} else if (arg1 == 'o' && arg0 == '(' && arg3 == ')') {
				return 2;
			} else if (arg1 == 'c' && (arg0 == '(' || arg0 == '<' || arg0 == '[')) {
				return 1;
			} else if (arg1 == 'e' && arg0 == '€') {
				return 1;
			} else if (arg1 == 's' && arg0 == '$') {
				return 1;
			} else if (arg1 == 'l' && arg0 == 'i') {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("65738, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JVGHFIOO", name = "b", descriptor = "(CCIC)I")
	private static int method223(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(2) int arg2, @OriginalArg(3) char arg3) {
		try {
			if (arg2 != 13881) {
				return anInt253;
			} else if (arg3 == arg1) {
				return 1;
			} else {
				if (arg3 >= 'a' && arg3 <= 'm') {
					if (arg3 == 'a') {
						if (arg1 != '4' && arg1 != '@' && arg1 != '^') {
							if (arg1 == '/' && arg0 == '\\') {
								return 2;
							}
							return 0;
						}
						return 1;
					}
					if (arg3 == 'b') {
						if (arg1 != '6' && arg1 != '8') {
							if ((arg1 != '1' || arg0 != '3') && (arg1 != 'i' || arg0 != '3')) {
								return 0;
							}
							return 2;
						}
						return 1;
					}
					if (arg3 == 'c') {
						if (arg1 != '(' && arg1 != '<' && arg1 != '{' && arg1 != '[') {
							return 0;
						}
						return 1;
					}
					if (arg3 == 'd') {
						if ((arg1 != '[' || arg0 != ')') && (arg1 != 'i' || arg0 != ')')) {
							return 0;
						}
						return 2;
					}
					if (arg3 == 'e') {
						if (arg1 != '3' && arg1 != '€') {
							return 0;
						}
						return 1;
					}
					if (arg3 == 'f') {
						if (arg1 == 'p' && arg0 == 'h') {
							return 2;
						}
						if (arg1 == '£') {
							return 1;
						}
						return 0;
					}
					if (arg3 == 'g') {
						if (arg1 != '9' && arg1 != '6' && arg1 != 'q') {
							return 0;
						}
						return 1;
					}
					if (arg3 == 'h') {
						if (arg1 == '#') {
							return 1;
						}
						return 0;
					}
					if (arg3 == 'i') {
						if (arg1 != 'y' && arg1 != 'l' && arg1 != 'j' && arg1 != '1' && arg1 != '!' && arg1 != ':' && arg1 != ';' && arg1 != '|') {
							return 0;
						}
						return 1;
					}
					if (arg3 == 'j') {
						return 0;
					}
					if (arg3 == 'k') {
						return 0;
					}
					if (arg3 == 'l') {
						if (arg1 != '1' && arg1 != '|' && arg1 != 'i') {
							return 0;
						}
						return 1;
					}
					if (arg3 == 'm') {
						return 0;
					}
				}
				if (arg3 >= 'n' && arg3 <= 'z') {
					if (arg3 == 'n') {
						return 0;
					}
					if (arg3 == 'o') {
						if (arg1 != '0' && arg1 != '*') {
							if ((arg1 != '(' || arg0 != ')') && (arg1 != '[' || arg0 != ']') && (arg1 != '{' || arg0 != '}') && (arg1 != '<' || arg0 != '>')) {
								return 0;
							}
							return 2;
						}
						return 1;
					}
					if (arg3 == 'p') {
						return 0;
					}
					if (arg3 == 'q') {
						return 0;
					}
					if (arg3 == 'r') {
						return 0;
					}
					if (arg3 == 's') {
						if (arg1 != '5' && arg1 != 'z' && arg1 != '$' && arg1 != '2') {
							return 0;
						}
						return 1;
					}
					if (arg3 == 't') {
						if (arg1 != '7' && arg1 != '+') {
							return 0;
						}
						return 1;
					}
					if (arg3 == 'u') {
						if (arg1 == 'v') {
							return 1;
						}
						if ((arg1 != '\\' || arg0 != '/') && (arg1 != '\\' || arg0 != '|') && (arg1 != '|' || arg0 != '/')) {
							return 0;
						}
						return 2;
					}
					if (arg3 == 'v') {
						if ((arg1 != '\\' || arg0 != '/') && (arg1 != '\\' || arg0 != '|') && (arg1 != '|' || arg0 != '/')) {
							return 0;
						}
						return 2;
					}
					if (arg3 == 'w') {
						if (arg1 == 'v' && arg0 == 'v') {
							return 2;
						}
						return 0;
					}
					if (arg3 == 'x') {
						if ((arg1 != ')' || arg0 != '(') && (arg1 != '}' || arg0 != '{') && (arg1 != ']' || arg0 != '[') && (arg1 != '>' || arg0 != '<')) {
							return 0;
						}
						return 2;
					}
					if (arg3 == 'y') {
						return 0;
					}
					if (arg3 == 'z') {
						return 0;
					}
				}
				if (arg3 >= '0' && arg3 <= '9') {
					if (arg3 == '0') {
						if (arg1 == 'o' || arg1 == 'O') {
							return 1;
						} else if ((arg1 != '(' || arg0 != ')') && (arg1 != '{' || arg0 != '}') && (arg1 != '[' || arg0 != ']')) {
							return 0;
						} else {
							return 2;
						}
					} else if (arg3 == '1') {
						return arg1 == 'l' ? 1 : 0;
					} else {
						return 0;
					}
				} else if (arg3 == ',') {
					return arg1 == '.' ? 1 : 0;
				} else if (arg3 == '.') {
					return arg1 == ',' ? 1 : 0;
				} else if (arg3 == '!') {
					return arg1 == 'i' ? 1 : 0;
				} else {
					return 0;
				}
			}
		} catch (@Pc(513) RuntimeException local513) {
			signlink.reporterror("21155, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local513.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JVGHFIOO", name = "b", descriptor = "(IC)B")
	private static byte method224(@OriginalArg(1) char arg0) {
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
			signlink.reporterror("64022, " + -949 + ", " + arg0 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JVGHFIOO", name = "a", descriptor = "([CB)V")
	private static void method225(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(10) int local10 = 0;
			@Pc(12) int local12 = 0;
			@Pc(14) int local14 = 0;
			while (true) {
				do {
					@Pc(113) int local113;
					if ((local113 = method226(arg0, local10)) == -1) {
						return;
					}
					@Pc(18) boolean local18 = false;
					for (@Pc(20) int local20 = local10; local20 >= 0 && local20 < local113 && !local18; local20++) {
						if (!method228(694, arg0[local20]) && !method229(arg0[local20])) {
							local18 = true;
						}
					}
					if (local18) {
						local12 = 0;
					}
					if (local12 == 0) {
						local14 = local113;
					}
					local10 = method227(arg0, local113);
					@Pc(59) int local59 = 0;
					for (@Pc(61) int local61 = local113; local61 < local10; local61++) {
						local59 = local59 * 10 + arg0[local61] - 48;
					}
					if (local59 <= 255 && local10 - local113 <= 8) {
						local12++;
					} else {
						local12 = 0;
					}
				} while (local12 != 4);
				for (@Pc(95) int local95 = local14; local95 < local10; local95++) {
					arg0[local95] = '*';
				}
				local12 = 0;
			}
		} catch (@Pc(117) RuntimeException local117) {
			signlink.reporterror("95630, " + arg0 + ", " + 5 + ", " + local117.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JVGHFIOO", name = "a", descriptor = "([CII)I")
	private static int method226(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1) {
		try {
			for (@Pc(13) int local13 = arg1; local13 < arg0.length && local13 >= 0; local13++) {
				if (arg0[local13] >= '0' && arg0[local13] <= '9') {
					return local13;
				}
			}
			return -1;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("85559, " + arg0 + ", " + arg1 + ", " + -29646 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JVGHFIOO", name = "a", descriptor = "(I[CI)I")
	private static int method227(@OriginalArg(1) char[] arg0, @OriginalArg(2) int arg1) {
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
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("13979, " + 9 + ", " + arg0 + ", " + arg1 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JVGHFIOO", name = "c", descriptor = "(IC)Z")
	private static boolean method228(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		try {
			@Pc(3) boolean local3 = false;
			return !method230(arg1) && !method231(arg1);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("84690, " + arg0 + ", " + arg1 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JVGHFIOO", name = "a", descriptor = "(CI)Z")
	private static boolean method229(@OriginalArg(0) char arg0) {
		try {
			if (anInt259 > 3 || anInt259 < 3) {
				anInt253 = 396;
			}
			if (arg0 >= 'a' && arg0 <= 'z') {
				return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
			} else {
				return true;
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("74265, " + arg0 + ", " + 3 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JVGHFIOO", name = "d", descriptor = "(IC)Z")
	private static boolean method230(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("86243, " + 0 + ", " + arg0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JVGHFIOO", name = "e", descriptor = "(IC)Z")
	private static boolean method231(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= '0' && arg0 <= '9';
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("7750, " + 662 + ", " + arg0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JVGHFIOO", name = "b", descriptor = "(CI)Z")
	private static boolean method232(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z';
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("91650, " + arg0 + ", " + 0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JVGHFIOO", name = "a", descriptor = "(CZ)Z")
	private static boolean method233(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("23657, " + arg0 + ", " + true + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JVGHFIOO", name = "d", descriptor = "(I[C)Z")
	private static boolean method234(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				if (!method231(arg0[local5]) && arg0[local5] != '\u0000') {
					local3 = false;
				}
			}
			if (local3) {
				return true;
			}
			@Pc(32) int local32 = method235(arg0);
			@Pc(34) int local34 = 0;
			@Pc(49) int local49 = anIntArray88.length - 1;
			if (local32 == anIntArray88[0] || local32 == anIntArray88[local49]) {
				return true;
			}
			do {
				@Pc(67) int local67 = (local34 + local49) / 2;
				if (local32 == anIntArray88[local67]) {
					return true;
				}
				if (local32 < anIntArray88[local67]) {
					local49 = local67;
				} else {
					local34 = local67;
				}
			} while (local34 != local49 && local34 + 1 != local49);
			return false;
		} catch (@Pc(96) RuntimeException local96) {
			signlink.reporterror("2202, " + 7 + ", " + arg0 + ", " + local96.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JVGHFIOO", name = "b", descriptor = "([CI)I")
	private static int method235(@OriginalArg(0) char[] arg0) {
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
			if (anInt261 != 9) {
				anInt253 = 392;
			}
			return local9;
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("43847, " + arg0 + ", " + 9 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}
}
