import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!BTDNSPCH")
public final class Class6 {

	@OriginalMember(owner = "client!BTDNSPCH", name = "c", descriptor = "I")
	private static int anInt88;

	@OriginalMember(owner = "client!BTDNSPCH", name = "f", descriptor = "Z")
	private static boolean aBoolean51;

	@OriginalMember(owner = "client!BTDNSPCH", name = "g", descriptor = "I")
	private static int anInt89;

	@OriginalMember(owner = "client!BTDNSPCH", name = "i", descriptor = "Z")
	private static boolean aBoolean52;

	@OriginalMember(owner = "client!BTDNSPCH", name = "m", descriptor = "[I")
	private static int[] anIntArray13;

	@OriginalMember(owner = "client!BTDNSPCH", name = "n", descriptor = "[[C")
	private static char[][] aCharArrayArray1;

	@OriginalMember(owner = "client!BTDNSPCH", name = "o", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!BTDNSPCH", name = "p", descriptor = "[[C")
	private static char[][] aCharArrayArray2;

	@OriginalMember(owner = "client!BTDNSPCH", name = "q", descriptor = "[[C")
	private static char[][] aCharArrayArray3;

	@OriginalMember(owner = "client!BTDNSPCH", name = "r", descriptor = "[I")
	private static int[] anIntArray14;

	@OriginalMember(owner = "client!BTDNSPCH", name = "a", descriptor = "I")
	private static int anInt86 = 850;

	@OriginalMember(owner = "client!BTDNSPCH", name = "b", descriptor = "I")
	private static int anInt87 = 9;

	@OriginalMember(owner = "client!BTDNSPCH", name = "d", descriptor = "Z")
	private static boolean aBoolean50 = true;

	@OriginalMember(owner = "client!BTDNSPCH", name = "e", descriptor = "B")
	private static byte aByte15 = 38;

	@OriginalMember(owner = "client!BTDNSPCH", name = "h", descriptor = "I")
	private static int anInt90 = -964;

	@OriginalMember(owner = "client!BTDNSPCH", name = "j", descriptor = "B")
	private static byte aByte16 = 9;

	@OriginalMember(owner = "client!BTDNSPCH", name = "k", descriptor = "I")
	private static int anInt91 = 39931;

	@OriginalMember(owner = "client!BTDNSPCH", name = "l", descriptor = "Z")
	private static boolean aBoolean53 = true;

	@OriginalMember(owner = "client!BTDNSPCH", name = "s", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray1 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

	@OriginalMember(owner = "client!BTDNSPCH", name = "a", descriptor = "(Lclient!SMIVAFST;)V")
	public static void method133(@OriginalArg(0) Class35 arg0) {
		@Pc(10) Class2_Sub1_Sub2 local10 = new Class2_Sub1_Sub2(arg0.method485("fragmentsenc.txt", null), (byte) 3);
		@Pc(19) Class2_Sub1_Sub2 local19 = new Class2_Sub1_Sub2(arg0.method485("badenc.txt", null), (byte) 3);
		@Pc(28) Class2_Sub1_Sub2 local28 = new Class2_Sub1_Sub2(arg0.method485("domainenc.txt", null), (byte) 3);
		@Pc(37) Class2_Sub1_Sub2 local37 = new Class2_Sub1_Sub2(arg0.method485("tldlist.txt", null), (byte) 3);
		method134(local10, local19, local28, local37);
	}

	@OriginalMember(owner = "client!BTDNSPCH", name = "a", descriptor = "(Lclient!BSNPYLEV;Lclient!BSNPYLEV;Lclient!BSNPYLEV;Lclient!BSNPYLEV;)V")
	private static void method134(@OriginalArg(0) Class2_Sub1_Sub2 arg0, @OriginalArg(1) Class2_Sub1_Sub2 arg1, @OriginalArg(2) Class2_Sub1_Sub2 arg2, @OriginalArg(3) Class2_Sub1_Sub2 arg3) {
		method136(arg1);
		method137(arg2);
		method138(aBoolean50, arg0);
		method135(arg3);
	}

	@OriginalMember(owner = "client!BTDNSPCH", name = "a", descriptor = "(Lclient!BSNPYLEV;Z)V")
	private static void method135(@OriginalArg(0) Class2_Sub1_Sub2 arg0) {
		try {
			@Pc(4) int local4 = arg0.method99();
			aCharArrayArray3 = new char[local4][];
			anIntArray14 = new int[local4];
			for (@Pc(16) int local16 = 0; local16 < local4; local16++) {
				anIntArray14[local16] = arg0.method94();
				@Pc(27) char[] local27 = new char[arg0.method94()];
				for (@Pc(29) int local29 = 0; local29 < local27.length; local29++) {
					local27[local29] = (char) arg0.method94();
				}
				aCharArrayArray3[local16] = local27;
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("41327, " + arg0 + ", " + true + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BTDNSPCH", name = "a", descriptor = "(ILclient!BSNPYLEV;)V")
	private static void method136(@OriginalArg(1) Class2_Sub1_Sub2 arg0) {
		try {
			@Pc(2) int local2 = arg0.method99();
			aCharArrayArray1 = new char[local2][];
			aByteArrayArrayArray1 = new byte[local2][][];
			method139(aCharArrayArray1, arg0, aByteArrayArrayArray1);
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("95114, " + 26559 + ", " + arg0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BTDNSPCH", name = "a", descriptor = "(Lclient!BSNPYLEV;I)V")
	private static void method137(@OriginalArg(0) Class2_Sub1_Sub2 arg0) {
		try {
			@Pc(2) int local2 = arg0.method99();
			aCharArrayArray2 = new char[local2][];
			method140(aCharArrayArray2, arg0);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("20035, " + arg0 + ", " + 0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BTDNSPCH", name = "a", descriptor = "(ZLclient!BSNPYLEV;)V")
	private static void method138(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class2_Sub1_Sub2 arg1) {
		try {
			anIntArray13 = new int[arg1.method99()];
			for (@Pc(5) int local5 = 0; local5 < anIntArray13.length; local5++) {
				anIntArray13[local5] = arg1.method96();
			}
			if (arg0) {
				;
			}
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("99406, " + arg0 + ", " + arg1 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BTDNSPCH", name = "a", descriptor = "([[CLclient!BSNPYLEV;I[[[B)V")
	private static void method139(@OriginalArg(0) char[][] arg0, @OriginalArg(1) Class2_Sub1_Sub2 arg1, @OriginalArg(3) byte[][][] arg2) {
		try {
			for (@Pc(6) int local6 = 0; local6 < arg0.length; local6++) {
				@Pc(12) char[] local12 = new char[arg1.method94()];
				for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
					local12[local14] = (char) arg1.method94();
				}
				arg0[local6] = local12;
				@Pc(36) byte[][] local36 = new byte[arg1.method94()][2];
				for (@Pc(38) int local38 = 0; local38 < local36.length; local38++) {
					local36[local38][0] = (byte) arg1.method94();
					local36[local38][1] = (byte) arg1.method94();
				}
				if (local36.length > 0) {
					arg2[local6] = local36;
				}
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("69513, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BTDNSPCH", name = "a", descriptor = "([[CLclient!BSNPYLEV;I)V")
	private static void method140(@OriginalArg(0) char[][] arg0, @OriginalArg(1) Class2_Sub1_Sub2 arg1) {
		try {
			for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
				@Pc(13) char[] local13 = new char[arg1.method94()];
				for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
					local13[local15] = (char) arg1.method94();
				}
				arg0[local7] = local13;
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("53849, " + arg0 + ", " + arg1 + ", " + 7 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BTDNSPCH", name = "a", descriptor = "(B[C)V")
	private static void method141(@OriginalArg(0) byte arg0, @OriginalArg(1) char[] arg1) {
		try {
			if (arg0 != 38) {
				aBoolean53 = !aBoolean53;
			}
			@Pc(12) int local12 = 0;
			for (@Pc(14) int local14 = 0; local14 < arg1.length; local14++) {
				if (method142(arg1[local14])) {
					arg1[local12] = arg1[local14];
				} else {
					arg1[local12] = ' ';
				}
				if (local12 == 0 || arg1[local12] != ' ' || arg1[local12 - 1] != ' ') {
					local12++;
				}
			}
			for (@Pc(56) int local56 = local12; local56 < arg1.length; local56++) {
				arg1[local56] = ' ';
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("28074, " + arg0 + ", " + arg1 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BTDNSPCH", name = "a", descriptor = "(IC)Z")
	private static boolean method142(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= ' ' && arg0 <= '\u007f' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("86060, " + -685 + ", " + arg0 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BTDNSPCH", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method143(@OriginalArg(1) String arg0) {
		try {
			@Pc(3) long local3 = System.currentTimeMillis();
			@Pc(6) char[] local6 = arg0.toCharArray();
			method141(aByte15, local6);
			@Pc(15) String local15 = (new String(local6)).trim();
			@Pc(19) char[] local19 = local15.toLowerCase().toCharArray();
			@Pc(22) String local22 = local15.toLowerCase();
			method151(local19);
			method146(local19);
			method147(local19);
			method160(local19);
			for (@Pc(51) int local51 = 0; local51 < aStringArray1.length; local51++) {
				@Pc(55) int local55 = -1;
				while ((local55 = local22.indexOf(aStringArray1[local51], local55 + 1)) != -1) {
					@Pc(62) char[] local62 = aStringArray1[local51].toCharArray();
					for (@Pc(64) int local64 = 0; local64 < local62.length; local64++) {
						local19[local64 + local55] = local62[local64];
					}
				}
			}
			method144(local19, local15.toCharArray());
			method145(local19);
			@Pc(106) long local106 = System.currentTimeMillis();
			return (new String(local19)).trim();
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("6764, " + 0 + ", " + arg0 + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BTDNSPCH", name = "a", descriptor = "([C[CI)V")
	private static void method144(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1) {
		try {
			for (@Pc(9) int local9 = 0; local9 < arg1.length; local9++) {
				if (arg0[local9] != '*' && method168(arg1[local9])) {
					arg0[local9] = arg1[local9];
				}
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("93037, " + arg0 + ", " + arg1 + ", " + -681 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BTDNSPCH", name = "a", descriptor = "(Z[C)V")
	private static void method145(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(7) boolean local7 = true;
			for (@Pc(9) int local9 = 0; local9 < arg0.length; local9++) {
				@Pc(15) char local15 = arg0[local9];
				if (!method165((byte) 9, local15)) {
					local7 = true;
				} else if (local7) {
					if (method167(local15, 336)) {
						local7 = false;
					}
				} else if (method168(local15)) {
					arg0[local9] = (char) (local15 + 'a' - 65);
				}
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("79630, " + true + ", " + arg0 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BTDNSPCH", name = "b", descriptor = "(B[C)V")
	private static void method146(@OriginalArg(1) char[] arg0) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 2; local3++) {
				for (@Pc(10) int local10 = aCharArrayArray1.length - 1; local10 >= 0; local10--) {
					method155(aByteArrayArrayArray1[local10], aCharArrayArray1[local10], arg0);
				}
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("15762, " + -64 + ", " + arg0 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BTDNSPCH", name = "a", descriptor = "([CI)V")
	private static void method147(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(22) char[] local22 = new char[] { '(', 'a', ')' };
			method155(null, local22, local3);
			@Pc(31) char[] local31 = (char[]) arg0.clone();
			@Pc(46) char[] local46 = new char[] { 'd', 'o', 't' };
			method155(null, local46, local31);
			for (@Pc(56) int local56 = aCharArrayArray2.length - 1; local56 >= 0; local56--) {
				method148(arg0, aCharArrayArray2[local56], local3, local31);
			}
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("61930, " + arg0 + ", " + -8236 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BTDNSPCH", name = "a", descriptor = "([C[C[C[CI)V")
	private static void method148(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) char[] arg3) {
		try {
			if (arg1.length <= arg0.length) {
				@Pc(24) int local24;
				for (@Pc(16) int local16 = 0; local16 <= arg0.length - arg1.length; local16 += local24) {
					@Pc(20) int local20 = local16;
					@Pc(22) int local22 = 0;
					local24 = 1;
					label58: while (true) {
						while (true) {
							if (local20 >= arg0.length) {
								break label58;
							}
							@Pc(32) char local32 = arg0[local20];
							@Pc(34) char local34 = 0;
							if (local20 + 1 < arg0.length) {
								local34 = arg0[local20 + 1];
							}
							@Pc(59) int local59;
							if (local22 < arg1.length && (local59 = method157(local32, arg1[local22], local34)) > 0) {
								local20 += local59;
								local22++;
							} else {
								if (local22 == 0) {
									break label58;
								}
								@Pc(80) int local80;
								if ((local80 = method157(local32, arg1[local22 - 1], local34)) > 0) {
									local20 += local80;
									if (local22 == 1) {
										local24++;
									}
								} else {
									if (local22 >= arg1.length || !method163(local32)) {
										break label58;
									}
									local20++;
								}
							}
						}
					}
					if (local22 >= arg1.length) {
						@Pc(111) boolean local111 = false;
						@Pc(117) int local117 = method149(arg0, arg2, local16);
						@Pc(125) int local125 = method150(local20 - 1, arg3, arg0);
						if (local117 > 2 || local125 > 2) {
							local111 = true;
						}
						if (local111) {
							for (@Pc(137) int local137 = local16; local137 < local20; local137++) {
								arg0[local137] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("91932, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -34 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BTDNSPCH", name = "a", descriptor = "([C[CII)I")
	private static int method149(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 == 0) {
				return 2;
			}
			for (@Pc(9) int local9 = arg2 - 1; local9 >= 0 && method163(arg0[local9]); local9--) {
				if (arg0[local9] == '@') {
					return 3;
				}
			}
			@Pc(29) int local29 = 0;
			for (@Pc(33) int local33 = arg2 - 1; local33 >= 0 && method163(arg1[local33]); local33--) {
				if (arg1[local33] == '*') {
					local29++;
				}
			}
			if (local29 >= 3) {
				return 4;
			} else if (method163(arg0[arg2 - 1])) {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("71120, " + arg0 + ", " + arg1 + ", " + 5 + ", " + arg2 + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BTDNSPCH", name = "a", descriptor = "(II[C[C)I")
	private static int method150(@OriginalArg(0) int arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg0 + 1 == arg2.length) {
				return 2;
			}
			@Pc(21) int local21 = arg0 + 1;
			while (true) {
				if (local21 < arg2.length && method163(arg2[local21])) {
					if (arg2[local21] != '.' && arg2[local21] != ',') {
						local21++;
						continue;
					}
					return 3;
				}
				@Pc(48) int local48 = 0;
				for (@Pc(52) int local52 = arg0 + 1; local52 < arg2.length && method163(arg1[local52]); local52++) {
					if (arg1[local52] == '*') {
						local48++;
					}
				}
				if (local48 >= 3) {
					return 4;
				}
				if (method163(arg2[arg0 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("58369, " + arg0 + ", " + 8 + ", " + arg1 + ", " + arg2 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BTDNSPCH", name = "a", descriptor = "([CZ)V")
	private static void method151(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(18) char[] local18 = new char[] { 'd', 'o', 't' };
			method155(null, local18, local3);
			@Pc(31) char[] local31 = (char[]) arg0.clone();
			@Pc(54) char[] local54 = new char[] { 's', 'l', 'a', 's', 'h' };
			method155(null, local54, local31);
			for (@Pc(61) int local61 = 0; local61 < aCharArrayArray3.length; local61++) {
				method152(anIntArray14[local61], arg0, aCharArrayArray3[local61], local31, local3);
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("38209, " + arg0 + ", " + false + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BTDNSPCH", name = "a", descriptor = "(II[C[C[C[C)V")
	private static void method152(@OriginalArg(0) int arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2, @OriginalArg(4) char[] arg3, @OriginalArg(5) char[] arg4) {
		try {
			if (arg2.length <= arg1.length) {
				@Pc(28) int local28;
				for (@Pc(20) int local20 = 0; local20 <= arg1.length - arg2.length; local20 += local28) {
					@Pc(24) int local24 = local20;
					@Pc(26) int local26 = 0;
					local28 = 1;
					label120: while (true) {
						while (true) {
							if (local24 >= arg1.length) {
								break label120;
							}
							@Pc(36) char local36 = arg1[local24];
							@Pc(38) char local38 = 0;
							if (local24 + 1 < arg1.length) {
								local38 = arg1[local24 + 1];
							}
							@Pc(63) int local63;
							if (local26 < arg2.length && (local63 = method157(local36, arg2[local26], local38)) > 0) {
								local24 += local63;
								local26++;
							} else {
								if (local26 == 0) {
									break label120;
								}
								@Pc(84) int local84;
								if ((local84 = method157(local36, arg2[local26 - 1], local38)) > 0) {
									local24 += local84;
									if (local26 == 1) {
										local28++;
									}
								} else {
									if (local26 >= arg2.length || !method163(local36)) {
										break label120;
									}
									local24++;
								}
							}
						}
					}
					if (local26 >= arg2.length) {
						@Pc(115) boolean local115 = false;
						@Pc(121) int local121 = method153(arg1, local20, arg4, anInt89);
						@Pc(129) int local129 = method154(arg3, local24 - 1, arg1);
						if (arg0 == 1 && local121 > 0 && local129 > 0) {
							local115 = true;
						}
						if (arg0 == 2 && (local121 > 2 && local129 > 0 || local121 > 0 && local129 > 2)) {
							local115 = true;
						}
						if (arg0 == 3 && local121 > 0 && local129 > 2) {
							local115 = true;
						}
						@Pc(172) boolean local172;
						if (arg0 == 3 && local121 > 2 && local129 > 0) {
							local172 = true;
						} else {
							local172 = false;
						}
						if (local115) {
							@Pc(179) int local179 = local20;
							@Pc(183) int local183 = local24 - 1;
							@Pc(191) boolean local191;
							@Pc(195) int local195;
							if (local121 > 2) {
								if (local121 == 4) {
									local191 = false;
									for (local195 = local20 - 1; local195 >= 0; local195--) {
										if (local191) {
											if (arg4[local195] != '*') {
												break;
											}
											local179 = local195;
										} else if (arg4[local195] == '*') {
											local179 = local195;
											local191 = true;
										}
									}
								}
								local191 = false;
								for (local195 = local179 - 1; local195 >= 0; local195--) {
									if (local191) {
										if (method163(arg1[local195])) {
											break;
										}
										local179 = local195;
									} else if (!method163(arg1[local195])) {
										local191 = true;
										local179 = local195;
									}
								}
							}
							if (local129 > 2) {
								if (local129 == 4) {
									local191 = false;
									for (local195 = local183 + 1; local195 < arg1.length; local195++) {
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
								for (local195 = local183 + 1; local195 < arg1.length; local195++) {
									if (local191) {
										if (method163(arg1[local195])) {
											break;
										}
										local183 = local195;
									} else if (!method163(arg1[local195])) {
										local191 = true;
										local183 = local195;
									}
								}
							}
							for (@Pc(329) int local329 = local179; local329 <= local183; local329++) {
								arg1[local329] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(352) RuntimeException local352) {
			signlink.reporterror("48330, " + arg0 + ", " + -30314 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local352.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BTDNSPCH", name = "a", descriptor = "([CI[CI)I")
	private static int method153(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg3 != 0) {
				return 2;
			} else if (arg1 == 0) {
				return 2;
			} else {
				@Pc(13) int local13 = arg1 - 1;
				while (true) {
					if (local13 >= 0 && method163(arg0[local13])) {
						if (arg0[local13] != ',' && arg0[local13] != '.') {
							local13--;
							continue;
						}
						return 3;
					}
					@Pc(38) int local38 = 0;
					for (@Pc(42) int local42 = arg1 - 1; local42 >= 0 && method163(arg2[local42]); local42--) {
						if (arg2[local42] == '*') {
							local38++;
						}
					}
					if (local38 >= 3) {
						return 4;
					}
					if (method163(arg0[arg1 - 1])) {
						return 1;
					}
					return 0;
				}
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("25895, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BTDNSPCH", name = "b", descriptor = "([CI[CI)I")
	private static int method154(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) char[] arg2) {
		try {
			if (arg1 + 1 == arg2.length) {
				return 2;
			}
			@Pc(13) int local13 = arg1 + 1;
			while (true) {
				if (local13 < arg2.length && method163(arg2[local13])) {
					if (arg2[local13] != '\\' && arg2[local13] != '/') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(40) int local40 = 0;
				for (@Pc(53) int local53 = arg1 + 1; local53 < arg2.length && method163(arg0[local53]); local53++) {
					if (arg0[local53] == '*') {
						local40++;
					}
				}
				if (local40 >= 5) {
					return 4;
				}
				if (method163(arg2[arg1 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("46350, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 871 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BTDNSPCH", name = "a", descriptor = "(Z[[B[C[C)V")
	private static void method155(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg1.length <= arg2.length) {
				@Pc(21) int local21;
				for (@Pc(11) int local11 = 0; local11 <= arg2.length - arg1.length; local11 += local21) {
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
							if (local15 >= arg2.length || local25 && local27) {
								break label165;
							}
							var12 = arg2[local15];
							var13 = '\u0000';
							if (local15 + 1 < arg2.length) {
								var13 = arg2[local15 + 1];
							}
							@Pc(62) int local62;
							if (local17 < arg1.length && (local62 = method158(arg1[local17], var13, var12)) > 0) {
								if (local62 == 1 && method166(var12)) {
									local25 = true;
								}
								if (local62 == 2 && (method166(var12) || method166(var13))) {
									local25 = true;
								}
								local15 += local62;
								local17++;
							} else {
								if (local17 == 0) {
									break label165;
								}
								@Pc(105) int local105;
								if ((local105 = method158(arg1[local17 - 1], var13, var12)) > 0) {
									local15 += local105;
									if (local17 == 1) {
										local21++;
									}
								} else {
									if (local17 >= arg1.length || !method164(aBoolean52, var12)) {
										break label165;
									}
									if (method163(var12) && var12 != '\'') {
										local23 = true;
									}
									if (method166(var12)) {
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
					if (local17 >= arg1.length && (!local25 || !local27)) {
						@Pc(170) boolean local170 = true;
						@Pc(266) int local266;
						if (local23) {
							@Pc(216) boolean local216 = false;
							@Pc(218) boolean local218 = false;
							if (local11 - 1 < 0 || method163(arg2[local11 - 1]) && arg2[local11 - 1] != '\'') {
								local216 = true;
							}
							if (local15 >= arg2.length || method163(arg2[local15]) && arg2[local15] != '\'') {
								local218 = true;
							}
							if (!local216 || !local218) {
								@Pc(262) boolean local262 = false;
								local266 = local11 - 2;
								if (local216) {
									local266 = local11;
								}
								while (!local262 && local266 < local15) {
									if (local266 >= 0 && (!method163(arg2[local266]) || arg2[local266] == '\'')) {
										@Pc(288) char[] local288 = new char[3];
										@Pc(290) int local290;
										for (local290 = 0; local290 < 3 && local266 + local290 < arg2.length && (!method163(arg2[local266 + local290]) || arg2[local266 + local290] == '\''); local290++) {
											local288[local290] = arg2[local266 + local290];
										}
										@Pc(328) boolean local328 = true;
										if (local290 == 0) {
											local328 = false;
										}
										if (local290 < 3 && local266 - 1 >= 0 && (!method163(arg2[local266 - 1]) || arg2[local266 - 1] == '\'')) {
											local328 = false;
										}
										if (local328 && !method169(anInt91, local288)) {
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
								var12 = arg2[local11 - 1];
							}
							var13 = ' ';
							if (local15 < arg2.length) {
								var13 = arg2[local15];
							}
							@Pc(198) byte local198 = method159(var12);
							@Pc(202) byte local202 = method159(var13);
							if (arg0 != null && method156(arg0, local202, local198)) {
								local170 = false;
							}
						}
						if (local170) {
							@Pc(378) int local378 = 0;
							@Pc(380) int local380 = 0;
							@Pc(382) int local382 = -1;
							for (local266 = local11; local266 < local15; local266++) {
								if (method166(arg2[local266])) {
									local378++;
								} else if (method165((byte) 9, arg2[local266])) {
									local380++;
									local382 = local266;
								}
							}
							if (local382 > -1) {
								local378 -= local15 - local382 - 1;
							}
							if (local378 <= local380) {
								for (@Pc(424) int local424 = local11; local424 < local15; local424++) {
									arg2[local424] = '*';
								}
							} else {
								local21 = 1;
							}
						}
					}
				}
			}
		} catch (@Pc(460) RuntimeException local460) {
			signlink.reporterror("77020, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local460.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BTDNSPCH", name = "a", descriptor = "([[BBZB)Z")
	private static boolean method156(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte arg1, @OriginalArg(3) byte arg2) {
		try {
			@Pc(12) int local12 = 0;
			if (arg0[0][0] == arg2 && arg0[0][1] == arg1) {
				return true;
			}
			@Pc(33) int local33 = arg0.length - 1;
			if (arg0[local33][0] == arg2 && arg0[local33][1] == arg1) {
				return true;
			}
			do {
				@Pc(55) int local55 = (local12 + local33) / 2;
				if (arg0[local55][0] == arg2 && arg0[local55][1] == arg1) {
					return true;
				}
				if (arg2 < arg0[local55][0] || arg2 == arg0[local55][0] && arg1 < arg0[local55][1]) {
					local33 = local55;
				} else {
					local12 = local55;
				}
			} while (local12 != local33 && local12 + 1 != local33);
			return false;
		} catch (@Pc(109) RuntimeException local109) {
			signlink.reporterror("55611, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + local109.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BTDNSPCH", name = "a", descriptor = "(CCCI)I")
	private static int method157(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(2) char arg2) {
		try {
			if (arg1 == arg0) {
				return 1;
			} else if (arg1 == 'o' && arg0 == '0') {
				return 1;
			} else if (arg1 == 'o' && arg0 == '(' && arg2 == ')') {
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
			signlink.reporterror("6012, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -964 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BTDNSPCH", name = "a", descriptor = "(CICC)I")
	private static int method158(@OriginalArg(0) char arg0, @OriginalArg(2) char arg1, @OriginalArg(3) char arg2) {
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
			signlink.reporterror("9057, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + local512.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BTDNSPCH", name = "b", descriptor = "(IC)B")
	private static byte method159(@OriginalArg(1) char arg0) {
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
			signlink.reporterror("98103, " + 288 + ", " + arg0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BTDNSPCH", name = "a", descriptor = "([CB)V")
	private static void method160(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			@Pc(9) int local9 = 0;
			while (true) {
				do {
					@Pc(113) int local113;
					if ((local113 = method161(106, arg0, local5)) == -1) {
						return;
					}
					@Pc(18) boolean local18 = false;
					for (@Pc(20) int local20 = local5; local20 >= 0 && local20 < local113 && !local18; local20++) {
						if (!method163(arg0[local20]) && !method164(aBoolean52, arg0[local20])) {
							local18 = true;
						}
					}
					if (local18) {
						local7 = 0;
					}
					if (local7 == 0) {
						local9 = local113;
					}
					local5 = method162(local113, arg0);
					@Pc(59) int local59 = 0;
					for (@Pc(61) int local61 = local113; local61 < local5; local61++) {
						local59 = local59 * 10 + arg0[local61] - 48;
					}
					if (local59 <= 255 && local5 - local113 <= 8) {
						local7++;
					} else {
						local7 = 0;
					}
				} while (local7 != 4);
				for (@Pc(95) int local95 = local9; local95 < local5; local95++) {
					arg0[local95] = '*';
				}
				local7 = 0;
			}
		} catch (@Pc(117) RuntimeException local117) {
			signlink.reporterror("57705, " + arg0 + ", " + 0 + ", " + local117.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BTDNSPCH", name = "a", descriptor = "(I[CI)I")
	private static int method161(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) int arg2) {
		try {
			for (@Pc(1) int local1 = arg2; local1 < arg1.length && local1 >= 0; local1++) {
				if (arg1[local1] >= '0' && arg1[local1] <= '9') {
					return local1;
				}
			}
			@Pc(26) boolean local26 = false;
			return -1;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("12787, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BTDNSPCH", name = "a", descriptor = "(IZ[C)I")
	private static int method162(@OriginalArg(0) int arg0, @OriginalArg(2) char[] arg1) {
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
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("81313, " + arg0 + ", " + true + ", " + arg1 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BTDNSPCH", name = "a", descriptor = "(ZC)Z")
	private static boolean method163(@OriginalArg(1) char arg0) {
		try {
			return !method165((byte) 9, arg0) && !method166(arg0);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("61304, " + true + ", " + arg0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BTDNSPCH", name = "b", descriptor = "(ZC)Z")
	private static boolean method164(@OriginalArg(0) boolean arg0, @OriginalArg(1) char arg1) {
		try {
			if (arg0) {
				throw new NullPointerException();
			} else if (arg1 >= 'a' && arg1 <= 'z') {
				return arg1 == 'v' || arg1 == 'x' || arg1 == 'j' || arg1 == 'q' || arg1 == 'z';
			} else {
				return true;
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("19920, " + arg0 + ", " + arg1 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BTDNSPCH", name = "a", descriptor = "(BC)Z")
	private static boolean method165(@OriginalArg(0) byte arg0, @OriginalArg(1) char arg1) {
		try {
			if (aByte16 != 9) {
				throw new NullPointerException();
			}
			@Pc(4) boolean local4 = false;
			return arg1 >= 'a' && arg1 <= 'z' || arg1 >= 'A' && arg1 <= 'Z';
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("84283, " + arg0 + ", " + arg1 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BTDNSPCH", name = "c", descriptor = "(IC)Z")
	private static boolean method166(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= '0' && arg0 <= '9';
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("36852, " + 0 + ", " + arg0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BTDNSPCH", name = "a", descriptor = "(CI)Z")
	private static boolean method167(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			return arg0 >= 'a' && arg0 <= 'z';
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("77825, " + arg0 + ", " + arg1 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BTDNSPCH", name = "d", descriptor = "(IC)Z")
	private static boolean method168(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("88807, " + 195 + ", " + arg0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BTDNSPCH", name = "a", descriptor = "(I[C)Z")
	private static boolean method169(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1) {
		try {
			if (arg0 != anInt91) {
				anInt88 = -59;
			}
			@Pc(8) boolean local8 = true;
			for (@Pc(10) int local10 = 0; local10 < arg1.length; local10++) {
				if (!method166(arg1[local10]) && arg1[local10] != '\u0000') {
					local8 = false;
				}
			}
			if (local8) {
				return true;
			}
			@Pc(37) int local37 = method170((byte) 9, arg1);
			@Pc(39) int local39 = 0;
			@Pc(44) int local44 = anIntArray13.length - 1;
			if (local37 == anIntArray13[0] || local37 == anIntArray13[local44]) {
				return true;
			}
			do {
				@Pc(62) int local62 = (local39 + local44) / 2;
				if (local37 == anIntArray13[local62]) {
					return true;
				}
				if (local37 < anIntArray13[local62]) {
					local44 = local62;
				} else {
					local39 = local62;
				}
			} while (local39 != local44 && local39 + 1 != local44);
			return false;
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("12362, " + arg0 + ", " + arg1 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BTDNSPCH", name = "c", descriptor = "(B[C)I")
	private static int method170(@OriginalArg(0) byte arg0, @OriginalArg(1) char[] arg1) {
		try {
			if (arg1.length > 6) {
				return 0;
			}
			@Pc(9) int local9 = 0;
			@Pc(14) boolean local14 = false;
			for (@Pc(20) int local20 = 0; local20 < arg1.length; local20++) {
				@Pc(31) char local31 = arg1[arg1.length - local20 - 1];
				if (local31 >= 'a' && local31 <= 'z') {
					local9 = local9 * 38 + local31 + 1 - 'a';
				} else if (local31 == '\'') {
					local9 = local9 * 38 + 27;
				} else if (local31 >= '0' && local31 <= '9') {
					local9 = local9 * 38 + local31 + 28 - '0';
				} else if (local31 != '\u0000') {
					return 0;
				}
			}
			return local9;
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("86177, " + arg0 + ", " + arg1 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}
}
