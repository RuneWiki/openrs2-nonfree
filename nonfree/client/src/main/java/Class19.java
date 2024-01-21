import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!HUPJRXOW")
public final class Class19 {

	@OriginalMember(owner = "client!HUPJRXOW", name = "d", descriptor = "I")
	private static int anInt280;

	@OriginalMember(owner = "client!HUPJRXOW", name = "f", descriptor = "Z")
	private static boolean aBoolean77;

	@OriginalMember(owner = "client!HUPJRXOW", name = "k", descriptor = "[I")
	private static int[] anIntArray46;

	@OriginalMember(owner = "client!HUPJRXOW", name = "l", descriptor = "[[C")
	private static char[][] aCharArrayArray1;

	@OriginalMember(owner = "client!HUPJRXOW", name = "m", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!HUPJRXOW", name = "n", descriptor = "[[C")
	private static char[][] aCharArrayArray2;

	@OriginalMember(owner = "client!HUPJRXOW", name = "o", descriptor = "[[C")
	private static char[][] aCharArrayArray3;

	@OriginalMember(owner = "client!HUPJRXOW", name = "p", descriptor = "[I")
	private static int[] anIntArray47;

	@OriginalMember(owner = "client!HUPJRXOW", name = "a", descriptor = "I")
	private static int anInt279 = -73;

	@OriginalMember(owner = "client!HUPJRXOW", name = "c", descriptor = "Z")
	private static boolean aBoolean76 = true;

	@OriginalMember(owner = "client!HUPJRXOW", name = "e", descriptor = "I")
	private static int anInt281 = -726;

	@OriginalMember(owner = "client!HUPJRXOW", name = "g", descriptor = "I")
	private static int anInt282 = 34839;

	@OriginalMember(owner = "client!HUPJRXOW", name = "h", descriptor = "I")
	private static int anInt283 = 512;

	@OriginalMember(owner = "client!HUPJRXOW", name = "i", descriptor = "I")
	private static int anInt284 = 6;

	@OriginalMember(owner = "client!HUPJRXOW", name = "j", descriptor = "I")
	private static int anInt285 = 4;

	@OriginalMember(owner = "client!HUPJRXOW", name = "q", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray3 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

	@OriginalMember(owner = "client!HUPJRXOW", name = "a", descriptor = "(Lclient!XRWUKRPO;)V")
	public static void method210(@OriginalArg(0) Class45 arg0) {
		@Pc(10) Class8_Sub1_Sub3 local10 = new Class8_Sub1_Sub3(arg0.method553("fragmentsenc.txt", null), -49015);
		@Pc(19) Class8_Sub1_Sub3 local19 = new Class8_Sub1_Sub3(arg0.method553("badenc.txt", null), -49015);
		@Pc(28) Class8_Sub1_Sub3 local28 = new Class8_Sub1_Sub3(arg0.method553("domainenc.txt", null), -49015);
		@Pc(37) Class8_Sub1_Sub3 local37 = new Class8_Sub1_Sub3(arg0.method553("tldlist.txt", null), -49015);
		method211(local10, local19, local28, local37);
	}

	@OriginalMember(owner = "client!HUPJRXOW", name = "a", descriptor = "(Lclient!GLMIQHJI;Lclient!GLMIQHJI;Lclient!GLMIQHJI;Lclient!GLMIQHJI;)V")
	private static void method211(@OriginalArg(0) Class8_Sub1_Sub3 arg0, @OriginalArg(1) Class8_Sub1_Sub3 arg1, @OriginalArg(2) Class8_Sub1_Sub3 arg2, @OriginalArg(3) Class8_Sub1_Sub3 arg3) {
		method213(anInt280, arg1);
		method214(arg2);
		method215(arg0);
		method212(arg3);
	}

	@OriginalMember(owner = "client!HUPJRXOW", name = "a", descriptor = "(Lclient!GLMIQHJI;Z)V")
	private static void method212(@OriginalArg(0) Class8_Sub1_Sub3 arg0) {
		try {
			@Pc(4) int local4 = arg0.method170();
			aCharArrayArray3 = new char[local4][];
			anIntArray47 = new int[local4];
			for (@Pc(15) int local15 = 0; local15 < local4; local15++) {
				anIntArray47[local15] = arg0.method165();
				@Pc(26) char[] local26 = new char[arg0.method165()];
				for (@Pc(28) int local28 = 0; local28 < local26.length; local28++) {
					local26[local28] = (char) arg0.method165();
				}
				aCharArrayArray3[local15] = local26;
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("20939, " + arg0 + ", " + true + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HUPJRXOW", name = "a", descriptor = "(ILclient!GLMIQHJI;)V")
	private static void method213(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub1_Sub3 arg1) {
		try {
			@Pc(2) int local2 = arg1.method170();
			aCharArrayArray1 = new char[local2][];
			aByteArrayArrayArray1 = new byte[local2][][];
			method216(aCharArrayArray1, aByteArrayArrayArray1, arg1);
			if (arg0 != 0) {
				aBoolean75 = true;
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("71257, " + arg0 + ", " + arg1 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HUPJRXOW", name = "b", descriptor = "(ILclient!GLMIQHJI;)V")
	private static void method214(@OriginalArg(1) Class8_Sub1_Sub3 arg0) {
		try {
			@Pc(2) int local2 = arg0.method170();
			aCharArrayArray2 = new char[local2][];
			method217(aCharArrayArray2, arg0);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("36028, " + 4232 + ", " + arg0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HUPJRXOW", name = "b", descriptor = "(Lclient!GLMIQHJI;Z)V")
	private static void method215(@OriginalArg(0) Class8_Sub1_Sub3 arg0) {
		try {
			anIntArray46 = new int[arg0.method170()];
			for (@Pc(13) int local13 = 0; local13 < anIntArray46.length; local13++) {
				anIntArray46[local13] = arg0.method167();
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("18712, " + arg0 + ", " + true + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HUPJRXOW", name = "a", descriptor = "([[CB[[[BLclient!GLMIQHJI;)V")
	private static void method216(@OriginalArg(0) char[][] arg0, @OriginalArg(2) byte[][][] arg1, @OriginalArg(3) Class8_Sub1_Sub3 arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
				@Pc(9) char[] local9 = new char[arg2.method165()];
				for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
					local9[local11] = (char) arg2.method165();
				}
				arg0[local3] = local9;
				@Pc(33) byte[][] local33 = new byte[arg2.method165()][2];
				for (@Pc(35) int local35 = 0; local35 < local33.length; local35++) {
					local33[local35][0] = (byte) arg2.method165();
					local33[local35][1] = (byte) arg2.method165();
				}
				if (local33.length > 0) {
					arg1[local3] = local33;
				}
			}
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("87261, " + arg0 + ", " + -97 + ", " + arg1 + ", " + arg2 + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HUPJRXOW", name = "a", descriptor = "([[CLclient!GLMIQHJI;I)V")
	private static void method217(@OriginalArg(0) char[][] arg0, @OriginalArg(1) Class8_Sub1_Sub3 arg1) {
		try {
			for (@Pc(8) int local8 = 0; local8 < arg0.length; local8++) {
				@Pc(14) char[] local14 = new char[arg1.method165()];
				for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
					local14[local16] = (char) arg1.method165();
				}
				arg0[local8] = local14;
			}
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("11168, " + arg0 + ", " + arg1 + ", " + -726 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HUPJRXOW", name = "a", descriptor = "(Z[C)V")
	private static void method218(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) int local3 = 0;
			for (@Pc(9) int local9 = 0; local9 < arg0.length; local9++) {
				if (method219(arg0[local9], aBoolean77)) {
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
			signlink.reporterror("81032, " + false + ", " + arg0 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HUPJRXOW", name = "a", descriptor = "(CZ)Z")
	private static boolean method219(@OriginalArg(0) char arg0, @OriginalArg(1) boolean arg1) {
		try {
			if (arg1) {
				throw new NullPointerException();
			}
			return arg0 >= ' ' && arg0 <= '\u007f' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("55080, " + arg0 + ", " + arg1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HUPJRXOW", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method220(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 >= 0) {
				throw new NullPointerException();
			}
			@Pc(9) long local9 = System.currentTimeMillis();
			@Pc(12) char[] local12 = arg0.toCharArray();
			method218(local12);
			@Pc(21) String local21 = (new String(local12)).trim();
			@Pc(25) char[] local25 = local21.toLowerCase().toCharArray();
			@Pc(28) String local28 = local21.toLowerCase();
			method228(local25, (byte) 8);
			method223(local25);
			method224(local25);
			method237(local25);
			for (@Pc(42) int local42 = 0; local42 < aStringArray3.length; local42++) {
				@Pc(52) int local52 = -1;
				while ((local52 = local28.indexOf(aStringArray3[local42], local52 + 1)) != -1) {
					@Pc(59) char[] local59 = aStringArray3[local42].toCharArray();
					for (@Pc(61) int local61 = 0; local61 < local59.length; local61++) {
						local25[local61 + local52] = local59[local61];
					}
				}
			}
			method221(local21.toCharArray(), local25);
			method222(local25);
			@Pc(103) long local103 = System.currentTimeMillis();
			return (new String(local25)).trim();
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("91672, " + arg0 + ", " + arg1 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HUPJRXOW", name = "a", descriptor = "(I[C[C)V")
	private static void method221(@OriginalArg(1) char[] arg0, @OriginalArg(2) char[] arg1) {
		try {
			for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
				if (arg1[local1] != '*' && method245(arg0[local1])) {
					arg1[local1] = arg0[local1];
				}
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("92595, " + -349 + ", " + arg0 + ", " + arg1 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HUPJRXOW", name = "a", descriptor = "([CB)V")
	private static void method222(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(9) int local9 = 0; local9 < arg0.length; local9++) {
				@Pc(15) char local15 = arg0[local9];
				if (!method242(local15)) {
					local3 = true;
				} else if (local3) {
					if (method244(local15)) {
						local3 = false;
					}
				} else if (method245(local15)) {
					arg0[local9] = (char) (local15 + 'a' - 65);
				}
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("84187, " + arg0 + ", " + 105 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HUPJRXOW", name = "a", descriptor = "(I[C)V")
	private static void method223(@OriginalArg(1) char[] arg0) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 2; local3++) {
				for (@Pc(10) int local10 = aCharArrayArray1.length - 1; local10 >= 0; local10--) {
					method232(aByteArrayArrayArray1[local10], arg0, aCharArrayArray1[local10], anInt283);
				}
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("52604, " + -277 + ", " + arg0 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HUPJRXOW", name = "b", descriptor = "(I[C)V")
	private static void method224(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(8) char[] local8 = (char[]) arg0.clone();
			@Pc(23) char[] local23 = new char[] { '(', 'a', ')' };
			method232(null, local8, local23, anInt283);
			@Pc(32) char[] local32 = (char[]) arg0.clone();
			@Pc(47) char[] local47 = new char[] { 'd', 'o', 't' };
			method232(null, local32, local47, anInt283);
			for (@Pc(57) int local57 = aCharArrayArray2.length - 1; local57 >= 0; local57--) {
				method225(local32, aCharArrayArray2[local57], local8, arg0);
			}
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("27290, " + 3 + ", " + arg0 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HUPJRXOW", name = "a", descriptor = "(Z[C[C[C[C)V")
	private static void method225(@OriginalArg(1) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2, @OriginalArg(4) char[] arg3) {
		try {
			if (arg1.length <= arg3.length) {
				@Pc(23) int local23;
				for (@Pc(15) int local15 = 0; local15 <= arg3.length - arg1.length; local15 += local23) {
					@Pc(19) int local19 = local15;
					@Pc(21) int local21 = 0;
					local23 = 1;
					label58: while (true) {
						while (true) {
							if (local19 >= arg3.length) {
								break label58;
							}
							@Pc(31) char local31 = arg3[local19];
							@Pc(33) char local33 = 0;
							if (local19 + 1 < arg3.length) {
								local33 = arg3[local19 + 1];
							}
							@Pc(58) int local58;
							if (local21 < arg1.length && (local58 = method234(local33, 175, local31, arg1[local21])) > 0) {
								local19 += local58;
								local21++;
							} else {
								if (local21 == 0) {
									break label58;
								}
								@Pc(79) int local79;
								if ((local79 = method234(local33, 175, local31, arg1[local21 - 1])) > 0) {
									local19 += local79;
									if (local21 == 1) {
										local23++;
									}
								} else {
									if (local21 >= arg1.length || !method240(local31)) {
										break label58;
									}
									local19++;
								}
							}
						}
					}
					if (local21 >= arg1.length) {
						@Pc(110) boolean local110 = false;
						@Pc(116) int local116 = method226(arg2, local15, (byte) 5, arg3);
						@Pc(124) int local124 = method227(local19 - 1, arg0, arg3);
						if (local116 > 2 || local124 > 2) {
							local110 = true;
						}
						if (local110) {
							for (@Pc(136) int local136 = local15; local136 < local19; local136++) {
								arg3[local136] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("61344, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HUPJRXOW", name = "a", descriptor = "([CIB[C)I")
	private static int method226(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) char[] arg3) {
		try {
			if (arg1 == 0) {
				return 2;
			}
			for (@Pc(9) int local9 = arg1 - 1; local9 >= 0 && method240(arg3[local9]); local9--) {
				if (arg3[local9] == '@') {
					return 3;
				}
			}
			@Pc(29) int local29 = 0;
			for (@Pc(33) int local33 = arg1 - 1; local33 >= 0 && method240(arg0[local33]); local33--) {
				if (arg0[local33] == '*') {
					local29++;
				}
			}
			@Pc(56) boolean local56 = false;
			if (local29 >= 3) {
				return 4;
			} else if (method240(arg3[arg1 - 1])) {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("89498, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HUPJRXOW", name = "a", descriptor = "(II[C[C)I")
	private static int method227(@OriginalArg(0) int arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg0 + 1 == arg2.length) {
				return 2;
			}
			@Pc(13) int local13 = arg0 + 1;
			while (true) {
				if (local13 < arg2.length && method240(arg2[local13])) {
					if (arg2[local13] != '.' && arg2[local13] != ',') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(48) int local48 = 0;
				for (@Pc(52) int local52 = arg0 + 1; local52 < arg2.length && method240(arg1[local52]); local52++) {
					if (arg1[local52] == '*') {
						local48++;
					}
				}
				if (local48 >= 3) {
					return 4;
				}
				if (method240(arg2[arg0 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("13117, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HUPJRXOW", name = "b", descriptor = "([CB)V")
	private static void method228(@OriginalArg(0) char[] arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(18) char[] local18 = new char[] { 'd', 'o', 't' };
			method232(null, local3, local18, anInt283);
			@Pc(27) char[] local27 = (char[]) arg0.clone();
			@Pc(50) char[] local50 = new char[] { 's', 'l', 'a', 's', 'h' };
			method232(null, local27, local50, anInt283);
			for (@Pc(57) int local57 = 0; local57 < aCharArrayArray3.length; local57++) {
				method229(aCharArrayArray3[local57], local27, anIntArray47[local57], local3, arg0);
			}
			@Pc(80) boolean local80 = false;
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("72109, " + arg0 + ", " + arg1 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HUPJRXOW", name = "a", descriptor = "([C[CI[C[CZ)V")
	private static void method229(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) char[] arg3, @OriginalArg(4) char[] arg4) {
		try {
			if (arg0.length <= arg4.length) {
				@Pc(27) int local27;
				for (@Pc(19) int local19 = 0; local19 <= arg4.length - arg0.length; local19 += local27) {
					@Pc(23) int local23 = local19;
					@Pc(25) int local25 = 0;
					local27 = 1;
					label120: while (true) {
						while (true) {
							if (local23 >= arg4.length) {
								break label120;
							}
							@Pc(35) char local35 = arg4[local23];
							@Pc(37) char local37 = 0;
							if (local23 + 1 < arg4.length) {
								local37 = arg4[local23 + 1];
							}
							@Pc(62) int local62;
							if (local25 < arg0.length && (local62 = method234(local37, 175, local35, arg0[local25])) > 0) {
								local23 += local62;
								local25++;
							} else {
								if (local25 == 0) {
									break label120;
								}
								@Pc(83) int local83;
								if ((local83 = method234(local37, 175, local35, arg0[local25 - 1])) > 0) {
									local23 += local83;
									if (local25 == 1) {
										local27++;
									}
								} else {
									if (local25 >= arg0.length || !method240(local35)) {
										break label120;
									}
									local23++;
								}
							}
						}
					}
					if (local25 >= arg0.length) {
						@Pc(114) boolean local114 = false;
						@Pc(120) int local120 = method230(arg4, arg3, local19);
						@Pc(128) int local128 = method231(arg1, arg4, local23 - 1);
						if (arg2 == 1 && local120 > 0 && local128 > 0) {
							local114 = true;
						}
						if (arg2 == 2 && (local120 > 2 && local128 > 0 || local120 > 0 && local128 > 2)) {
							local114 = true;
						}
						if (arg2 == 3 && local120 > 0 && local128 > 2) {
							local114 = true;
						}
						@Pc(171) boolean local171;
						if (arg2 == 3 && local120 > 2 && local128 > 0) {
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
											if (arg3[local194] != '*') {
												break;
											}
											local178 = local194;
										} else if (arg3[local194] == '*') {
											local178 = local194;
											local190 = true;
										}
									}
								}
								local190 = false;
								for (local194 = local178 - 1; local194 >= 0; local194--) {
									if (local190) {
										if (method240(arg4[local194])) {
											break;
										}
										local178 = local194;
									} else if (!method240(arg4[local194])) {
										local190 = true;
										local178 = local194;
									}
								}
							}
							if (local128 > 2) {
								if (local128 == 4) {
									local190 = false;
									for (local194 = local182 + 1; local194 < arg4.length; local194++) {
										if (local190) {
											if (arg1[local194] != '*') {
												break;
											}
											local182 = local194;
										} else if (arg1[local194] == '*') {
											local182 = local194;
											local190 = true;
										}
									}
								}
								local190 = false;
								for (local194 = local182 + 1; local194 < arg4.length; local194++) {
									if (local190) {
										if (method240(arg4[local194])) {
											break;
										}
										local182 = local194;
									} else if (!method240(arg4[local194])) {
										local190 = true;
										local182 = local194;
									}
								}
							}
							for (@Pc(328) int local328 = local178; local328 <= local182; local328++) {
								arg4[local328] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(351) RuntimeException local351) {
			signlink.reporterror("53268, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + true + ", " + local351.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HUPJRXOW", name = "a", descriptor = "(I[C[CI)I")
	private static int method230(@OriginalArg(1) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 == 0) {
				return 2;
			}
			@Pc(9) int local9 = arg2 - 1;
			while (true) {
				if (local9 >= 0 && method240(arg0[local9])) {
					if (arg0[local9] != ',' && arg0[local9] != '.') {
						local9--;
						continue;
					}
					return 3;
				}
				@Pc(34) int local34 = 0;
				for (@Pc(38) int local38 = arg2 - 1; local38 >= 0 && method240(arg1[local38]); local38--) {
					if (arg1[local38] == '*') {
						local34++;
					}
				}
				if (anInt282 != 34839) {
					aBoolean77 = !aBoolean77;
				}
				if (local34 >= 3) {
					return 4;
				}
				if (method240(arg0[arg2 - 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("36465, " + 34839 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HUPJRXOW", name = "a", descriptor = "([C[CZI)I")
	private static int method231(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 + 1 == arg1.length) {
				return 2;
			}
			@Pc(17) int local17 = arg2 + 1;
			while (true) {
				if (local17 < arg1.length && method240(arg1[local17])) {
					if (arg1[local17] != '\\' && arg1[local17] != '/') {
						local17++;
						continue;
					}
					return 3;
				}
				@Pc(44) int local44 = 0;
				for (@Pc(48) int local48 = arg2 + 1; local48 < arg1.length && method240(arg0[local48]); local48++) {
					if (arg0[local48] == '*') {
						local44++;
					}
				}
				if (local44 >= 5) {
					return 4;
				}
				if (method240(arg1[arg2 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("29788, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HUPJRXOW", name = "a", descriptor = "([[B[C[CI)V")
	private static void method232(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg2.length <= arg1.length) {
				@Pc(21) int local21;
				@Pc(15) int local15;
				for (@Pc(11) int local11 = 0; local11 <= arg1.length - arg2.length; local11 += local21) {
					local15 = local11;
					@Pc(17) int local17 = 0;
					@Pc(19) int local19 = 0;
					local21 = 1;
					@Pc(23) boolean local23 = false;
					@Pc(25) boolean local25 = false;
					@Pc(27) boolean local27 = false;
					@Pc(35) char var13;
					@Pc(37) char var14;
					label177: while (true) {
						while (true) {
							if (local15 >= arg1.length || local25 && local27) {
								break label177;
							}
							var13 = arg1[local15];
							var14 = '\u0000';
							if (local15 + 1 < arg1.length) {
								var14 = arg1[local15 + 1];
							}
							@Pc(62) int local62;
							if (local17 < arg2.length && (local62 = method235(var14, arg2[local17], anInt284, var13)) > 0) {
								if (local62 == 1 && method243(var13)) {
									local25 = true;
								}
								if (local62 == 2 && (method243(var13) || method243(var14))) {
									local25 = true;
								}
								local15 += local62;
								local17++;
							} else {
								if (local17 == 0) {
									break label177;
								}
								@Pc(105) int local105;
								if ((local105 = method235(var14, arg2[local17 - 1], anInt284, var13)) > 0) {
									local15 += local105;
									if (local17 == 1) {
										local21++;
									}
								} else {
									if (local17 >= arg2.length || !method241(var13)) {
										break label177;
									}
									if (method240(var13) && var13 != '\'') {
										local23 = true;
									}
									if (method243(var13)) {
										local27 = true;
									}
									local15++;
									local19++;
									if (local19 * 100 / (local15 - local11) > 90) {
										break label177;
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
							if (local11 - 1 < 0 || method240(arg1[local11 - 1]) && arg1[local11 - 1] != '\'') {
								local216 = true;
							}
							if (local15 >= arg1.length || method240(arg1[local15]) && arg1[local15] != '\'') {
								local218 = true;
							}
							if (!local216 || !local218) {
								@Pc(262) boolean local262 = false;
								local266 = local11 - 2;
								if (local216) {
									local266 = local11;
								}
								while (!local262 && local266 < local15) {
									if (local266 >= 0 && (!method240(arg1[local266]) || arg1[local266] == '\'')) {
										@Pc(288) char[] local288 = new char[3];
										@Pc(290) int local290;
										for (local290 = 0; local290 < 3 && local266 + local290 < arg1.length && (!method240(arg1[local266 + local290]) || arg1[local266 + local290] == '\''); local290++) {
											local288[local290] = arg1[local266 + local290];
										}
										@Pc(328) boolean local328 = true;
										if (local290 == 0) {
											local328 = false;
										}
										if (local290 < 3 && local266 - 1 >= 0 && (!method240(arg1[local266 - 1]) || arg1[local266 - 1] == '\'')) {
											local328 = false;
										}
										if (local328 && !method246((byte) 7, local288)) {
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
							@Pc(198) byte local198 = method236(var13);
							@Pc(202) byte local202 = method236(var14);
							if (arg0 != null && method233(arg0, local202, local198)) {
								local170 = false;
							}
						}
						if (local170) {
							@Pc(378) int local378 = 0;
							@Pc(380) int local380 = 0;
							@Pc(382) int local382 = -1;
							for (local266 = local11; local266 < local15; local266++) {
								if (method243(arg1[local266])) {
									local378++;
								} else if (method242(arg1[local266])) {
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
				if (arg3 <= 0) {
					for (local15 = 1; local15 > 0; local15++) {
					}
				}
			}
		} catch (@Pc(460) RuntimeException local460) {
			signlink.reporterror("34003, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local460.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HUPJRXOW", name = "a", descriptor = "([[BBZB)Z")
	private static boolean method233(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte arg1, @OriginalArg(3) byte arg2) {
		try {
			@Pc(1) int local1 = 0;
			if (arg0[0][0] == arg2 && arg0[0][1] == arg1) {
				return true;
			}
			@Pc(26) int local26 = arg0.length - 1;
			if (arg0[local26][0] == arg2 && arg0[local26][1] == arg1) {
				return true;
			}
			do {
				@Pc(48) int local48 = (local1 + local26) / 2;
				if (arg0[local48][0] == arg2 && arg0[local48][1] == arg1) {
					return true;
				}
				if (arg2 < arg0[local48][0] || arg2 == arg0[local48][0] && arg1 < arg0[local48][1]) {
					local26 = local48;
				} else {
					local1 = local48;
				}
			} while (local1 != local26 && local1 + 1 != local26);
			return false;
		} catch (@Pc(102) RuntimeException local102) {
			signlink.reporterror("82521, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + local102.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HUPJRXOW", name = "a", descriptor = "(CICC)I")
	private static int method234(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) char arg2, @OriginalArg(3) char arg3) {
		try {
			@Pc(3) boolean local3 = false;
			if (arg3 == arg2) {
				return 1;
			} else if (arg3 == 'o' && arg2 == '0') {
				return 1;
			} else if (arg3 == 'o' && arg2 == '(' && arg0 == ')') {
				return 2;
			} else if (arg3 == 'c' && (arg2 == '(' || arg2 == '<' || arg2 == '[')) {
				return 1;
			} else if (arg3 == 'e' && arg2 == '€') {
				return 1;
			} else if (arg3 == 's' && arg2 == '$') {
				return 1;
			} else if (arg3 == 'l' && arg2 == 'i') {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("28734, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HUPJRXOW", name = "a", descriptor = "(CCIC)I")
	private static int method235(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(2) int arg2, @OriginalArg(3) char arg3) {
		try {
			if (arg2 != anInt284) {
				for (@Pc(4) int local4 = 1; local4 > 0; local4++) {
				}
			}
			if (arg1 == arg3) {
				return 1;
			}
			if (arg1 >= 'a' && arg1 <= 'm') {
				if (arg1 == 'a') {
					if (arg3 != '4' && arg3 != '@' && arg3 != '^') {
						if (arg3 == '/' && arg0 == '\\') {
							return 2;
						}
						return 0;
					}
					return 1;
				}
				if (arg1 == 'b') {
					if (arg3 != '6' && arg3 != '8') {
						if ((arg3 != '1' || arg0 != '3') && (arg3 != 'i' || arg0 != '3')) {
							return 0;
						}
						return 2;
					}
					return 1;
				}
				if (arg1 == 'c') {
					if (arg3 != '(' && arg3 != '<' && arg3 != '{' && arg3 != '[') {
						return 0;
					}
					return 1;
				}
				if (arg1 == 'd') {
					if ((arg3 != '[' || arg0 != ')') && (arg3 != 'i' || arg0 != ')')) {
						return 0;
					}
					return 2;
				}
				if (arg1 == 'e') {
					if (arg3 != '3' && arg3 != '€') {
						return 0;
					}
					return 1;
				}
				if (arg1 == 'f') {
					if (arg3 == 'p' && arg0 == 'h') {
						return 2;
					}
					if (arg3 == '£') {
						return 1;
					}
					return 0;
				}
				if (arg1 == 'g') {
					if (arg3 != '9' && arg3 != '6' && arg3 != 'q') {
						return 0;
					}
					return 1;
				}
				if (arg1 == 'h') {
					if (arg3 == '#') {
						return 1;
					}
					return 0;
				}
				if (arg1 == 'i') {
					if (arg3 != 'y' && arg3 != 'l' && arg3 != 'j' && arg3 != '1' && arg3 != '!' && arg3 != ':' && arg3 != ';' && arg3 != '|') {
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
					if (arg3 != '1' && arg3 != '|' && arg3 != 'i') {
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
					if (arg3 != '0' && arg3 != '*') {
						if ((arg3 != '(' || arg0 != ')') && (arg3 != '[' || arg0 != ']') && (arg3 != '{' || arg0 != '}') && (arg3 != '<' || arg0 != '>')) {
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
					if (arg3 != '5' && arg3 != 'z' && arg3 != '$' && arg3 != '2') {
						return 0;
					}
					return 1;
				}
				if (arg1 == 't') {
					if (arg3 != '7' && arg3 != '+') {
						return 0;
					}
					return 1;
				}
				if (arg1 == 'u') {
					if (arg3 == 'v') {
						return 1;
					}
					if ((arg3 != '\\' || arg0 != '/') && (arg3 != '\\' || arg0 != '|') && (arg3 != '|' || arg0 != '/')) {
						return 0;
					}
					return 2;
				}
				if (arg1 == 'v') {
					if ((arg3 != '\\' || arg0 != '/') && (arg3 != '\\' || arg0 != '|') && (arg3 != '|' || arg0 != '/')) {
						return 0;
					}
					return 2;
				}
				if (arg1 == 'w') {
					if (arg3 == 'v' && arg0 == 'v') {
						return 2;
					}
					return 0;
				}
				if (arg1 == 'x') {
					if ((arg3 != ')' || arg0 != '(') && (arg3 != '}' || arg0 != '{') && (arg3 != ']' || arg0 != '[') && (arg3 != '>' || arg0 != '<')) {
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
					if (arg3 == 'o' || arg3 == 'O') {
						return 1;
					} else if (arg3 == '(' && arg0 == ')' || arg3 == '{' && arg0 == '}' || arg3 == '[' && arg0 == ']') {
						return 2;
					} else {
						return 0;
					}
				} else if (arg1 == '1') {
					return arg3 == 'l' ? 1 : 0;
				} else {
					return 0;
				}
			} else if (arg1 == ',') {
				return arg3 == '.' ? 1 : 0;
			} else if (arg1 == '.') {
				return arg3 == ',' ? 1 : 0;
			} else if (arg1 == '!') {
				return arg3 == 'i' ? 1 : 0;
			} else {
				return 0;
			}
		} catch (@Pc(518) RuntimeException local518) {
			signlink.reporterror("63787, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local518.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HUPJRXOW", name = "a", descriptor = "(IC)B")
	private static byte method236(@OriginalArg(1) char arg0) {
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
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("85915, " + -105 + ", " + arg0 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HUPJRXOW", name = "a", descriptor = "([CI)V")
	private static void method237(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(5) int local5 = 0;
			@Pc(16) int local16 = 0;
			@Pc(18) int local18 = 0;
			while (true) {
				do {
					@Pc(117) int local117;
					if ((local117 = method238(arg0, local5)) == -1) {
						return;
					}
					@Pc(22) boolean local22 = false;
					for (@Pc(24) int local24 = local5; local24 >= 0 && local24 < local117 && !local22; local24++) {
						if (!method240(arg0[local24]) && !method241(arg0[local24])) {
							local22 = true;
						}
					}
					if (local22) {
						local16 = 0;
					}
					if (local16 == 0) {
						local18 = local117;
					}
					local5 = method239(arg0, local117);
					@Pc(63) int local63 = 0;
					for (@Pc(65) int local65 = local117; local65 < local5; local65++) {
						local63 = local63 * 10 + arg0[local65] - 48;
					}
					if (local63 <= 255 && local5 - local117 <= 8) {
						local16++;
					} else {
						local16 = 0;
					}
				} while (local16 != 4);
				for (@Pc(99) int local99 = local18; local99 < local5; local99++) {
					arg0[local99] = '*';
				}
				local16 = 0;
			}
		} catch (@Pc(121) RuntimeException local121) {
			signlink.reporterror("83806, " + arg0 + ", " + 525 + ", " + local121.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HUPJRXOW", name = "a", descriptor = "([CII)I")
	private static int method238(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1) {
		try {
			for (@Pc(9) int local9 = arg1; local9 < arg0.length && local9 >= 0; local9++) {
				if (arg0[local9] >= '0' && arg0[local9] <= '9') {
					return local9;
				}
			}
			return -1;
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("2985, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HUPJRXOW", name = "b", descriptor = "([CII)I")
	private static int method239(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) int local3 = arg1;
			while (true) {
				if (local3 < arg0.length && local3 >= 0) {
					if (arg0[local3] >= '0' && arg0[local3] <= '9') {
						local3++;
						continue;
					}
					return local3;
				}
				if (anInt285 != 4) {
					for (@Pc(29) int local29 = 1; local29 > 0; local29++) {
					}
				}
				return arg0.length;
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("65691, " + arg0 + ", " + arg1 + ", " + 4 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HUPJRXOW", name = "b", descriptor = "(IC)Z")
	private static boolean method240(@OriginalArg(1) char arg0) {
		try {
			return !method242(arg0) && !method243(arg0);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("16382, " + 0 + ", " + arg0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HUPJRXOW", name = "c", descriptor = "(IC)Z")
	private static boolean method241(@OriginalArg(1) char arg0) {
		try {
			if (arg0 >= 'a' && arg0 <= 'z') {
				return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
			} else {
				return true;
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("77500, " + -22185 + ", " + arg0 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HUPJRXOW", name = "a", descriptor = "(CI)Z")
	private static boolean method242(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("31290, " + arg0 + ", " + -625 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HUPJRXOW", name = "a", descriptor = "(ZC)Z")
	private static boolean method243(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= '0' && arg0 <= '9';
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("4603, " + true + ", " + arg0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HUPJRXOW", name = "b", descriptor = "(CI)Z")
	private static boolean method244(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z';
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("37787, " + arg0 + ", " + -71 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HUPJRXOW", name = "c", descriptor = "(CI)Z")
	private static boolean method245(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("1227, " + arg0 + ", " + -122 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HUPJRXOW", name = "a", descriptor = "(B[C)Z")
	private static boolean method246(@OriginalArg(0) byte arg0, @OriginalArg(1) char[] arg1) {
		try {
			@Pc(3) boolean local3 = true;
			@Pc(8) boolean local8 = false;
			for (@Pc(19) int local19 = 0; local19 < arg1.length; local19++) {
				if (!method243(arg1[local19]) && arg1[local19] != '\u0000') {
					local3 = false;
				}
			}
			if (local3) {
				return true;
			}
			@Pc(46) int local46 = method247(arg1);
			@Pc(48) int local48 = 0;
			@Pc(53) int local53 = anIntArray46.length - 1;
			if (local46 == anIntArray46[0] || local46 == anIntArray46[local53]) {
				return true;
			}
			do {
				@Pc(71) int local71 = (local48 + local53) / 2;
				if (local46 == anIntArray46[local71]) {
					return true;
				}
				if (local46 < anIntArray46[local71]) {
					local53 = local71;
				} else {
					local48 = local71;
				}
			} while (local48 != local53 && local48 + 1 != local53);
			return false;
		} catch (@Pc(100) RuntimeException local100) {
			signlink.reporterror("93121, " + arg0 + ", " + arg1 + ", " + local100.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HUPJRXOW", name = "b", descriptor = "([CI)I")
	private static int method247(@OriginalArg(0) char[] arg0) {
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
			signlink.reporterror("4858, " + arg0 + ", " + 0 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}
}
