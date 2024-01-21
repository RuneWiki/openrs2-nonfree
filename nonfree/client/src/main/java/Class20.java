import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!KUSEVGYR")
public final class Class20 {

	@OriginalMember(owner = "client!KUSEVGYR", name = "b", descriptor = "I")
	private static int anInt402;

	@OriginalMember(owner = "client!KUSEVGYR", name = "c", descriptor = "I")
	private static int anInt403;

	@OriginalMember(owner = "client!KUSEVGYR", name = "h", descriptor = "[I")
	private static int[] anIntArray111;

	@OriginalMember(owner = "client!KUSEVGYR", name = "i", descriptor = "[[C")
	private static char[][] aCharArrayArray1;

	@OriginalMember(owner = "client!KUSEVGYR", name = "j", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!KUSEVGYR", name = "k", descriptor = "[[C")
	private static char[][] aCharArrayArray2;

	@OriginalMember(owner = "client!KUSEVGYR", name = "l", descriptor = "[[C")
	private static char[][] aCharArrayArray3;

	@OriginalMember(owner = "client!KUSEVGYR", name = "m", descriptor = "[I")
	private static int[] anIntArray112;

	@OriginalMember(owner = "client!KUSEVGYR", name = "d", descriptor = "I")
	private static int anInt404 = -35644;

	@OriginalMember(owner = "client!KUSEVGYR", name = "f", descriptor = "I")
	private static int anInt405;

	@OriginalMember(owner = "client!KUSEVGYR", name = "g", descriptor = "I")
	private static int anInt406;

	@OriginalMember(owner = "client!KUSEVGYR", name = "n", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray5;

	static {
		aBoolean97 = true;
		anInt405 = 8;
		anInt406 = 732;
		aStringArray5 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };
	}

	@OriginalMember(owner = "client!KUSEVGYR", name = "a", descriptor = "(Lclient!INOFEYKQ;)V")
	public static void method217(@OriginalArg(0) Class14 arg0) {
		@Pc(10) Class3_Sub1_Sub3 local10 = new Class3_Sub1_Sub3((byte) -103, arg0.method202("fragmentsenc.txt", (byte[]) null));
		@Pc(19) Class3_Sub1_Sub3 local19 = new Class3_Sub1_Sub3((byte) -103, arg0.method202("badenc.txt", (byte[]) null));
		@Pc(28) Class3_Sub1_Sub3 local28 = new Class3_Sub1_Sub3((byte) -103, arg0.method202("domainenc.txt", (byte[]) null));
		@Pc(37) Class3_Sub1_Sub3 local37 = new Class3_Sub1_Sub3((byte) -103, arg0.method202("tldlist.txt", (byte[]) null));
		method218(local10, local19, local28, local37);
	}

	@OriginalMember(owner = "client!KUSEVGYR", name = "a", descriptor = "(Lclient!NHEPCMLW;Lclient!NHEPCMLW;Lclient!NHEPCMLW;Lclient!NHEPCMLW;)V")
	private static void method218(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) Class3_Sub1_Sub3 arg1, @OriginalArg(2) Class3_Sub1_Sub3 arg2, @OriginalArg(3) Class3_Sub1_Sub3 arg3) {
		method220(arg1);
		method221(arg2);
		method222(arg0);
		method219(874, arg3);
	}

	@OriginalMember(owner = "client!KUSEVGYR", name = "a", descriptor = "(ILclient!NHEPCMLW;)V")
	private static void method219(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub3 arg1) {
		try {
			@Pc(5) boolean local5 = false;
			@Pc(8) int local8 = arg1.method279();
			aCharArrayArray3 = new char[local8][];
			anIntArray112 = new int[local8];
			for (@Pc(16) int local16 = 0; local16 < local8; local16++) {
				anIntArray112[local16] = arg1.method274();
				@Pc(27) char[] local27 = new char[arg1.method274()];
				for (@Pc(29) int local29 = 0; local29 < local27.length; local29++) {
					local27[local29] = (char) arg1.method274();
				}
				aCharArrayArray3[local16] = local27;
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("92618, " + arg0 + ", " + arg1 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KUSEVGYR", name = "a", descriptor = "(ZLclient!NHEPCMLW;)V")
	private static void method220(@OriginalArg(1) Class3_Sub1_Sub3 arg0) {
		try {
			@Pc(2) int local2 = arg0.method279();
			aCharArrayArray1 = new char[local2][];
			aByteArrayArrayArray7 = new byte[local2][][];
			method223(arg0, aByteArrayArrayArray7, aCharArrayArray1);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("51607, " + false + ", " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KUSEVGYR", name = "a", descriptor = "(Lclient!NHEPCMLW;B)V")
	private static void method221(@OriginalArg(0) Class3_Sub1_Sub3 arg0) {
		try {
			@Pc(2) int local2 = arg0.method279();
			aCharArrayArray2 = new char[local2][];
			method224(arg0, aCharArrayArray2);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("59853, " + arg0 + ", " + -105 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KUSEVGYR", name = "a", descriptor = "(Lclient!NHEPCMLW;I)V")
	private static void method222(@OriginalArg(0) Class3_Sub1_Sub3 arg0) {
		try {
			anIntArray111 = new int[arg0.method279()];
			for (@Pc(13) int local13 = 0; local13 < anIntArray111.length; local13++) {
				anIntArray111[local13] = arg0.method276();
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("79842, " + arg0 + ", " + -762 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KUSEVGYR", name = "a", descriptor = "(ILclient!NHEPCMLW;[[[B[[C)V")
	private static void method223(@OriginalArg(1) Class3_Sub1_Sub3 arg0, @OriginalArg(2) byte[][][] arg1, @OriginalArg(3) char[][] arg2) {
		try {
			for (@Pc(10) int local10 = 0; local10 < arg2.length; local10++) {
				@Pc(16) char[] local16 = new char[arg0.method274()];
				for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
					local16[local18] = (char) arg0.method274();
				}
				arg2[local10] = local16;
				@Pc(40) byte[][] local40 = new byte[arg0.method274()][2];
				for (@Pc(42) int local42 = 0; local42 < local40.length; local42++) {
					local40[local42][0] = (byte) arg0.method274();
					local40[local42][1] = (byte) arg0.method274();
				}
				if (local40.length > 0) {
					arg1[local10] = local40;
				}
			}
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("10989, " + 2 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KUSEVGYR", name = "a", descriptor = "(Lclient!NHEPCMLW;[[CI)V")
	private static void method224(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) char[][] arg1) {
		try {
			for (@Pc(6) int local6 = 0; local6 < arg1.length; local6++) {
				@Pc(12) char[] local12 = new char[arg0.method274()];
				for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
					local12[local14] = (char) arg0.method274();
				}
				arg1[local6] = local12;
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("60675, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KUSEVGYR", name = "a", descriptor = "(I[C)V")
	private static void method225(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) int local3 = 0;
			for (@Pc(15) int local15 = 0; local15 < arg0.length; local15++) {
				if (method226(arg0[local15])) {
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
			signlink.reporterror("25073, " + -27255 + ", " + arg0 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KUSEVGYR", name = "a", descriptor = "(IC)Z")
	private static boolean method226(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= ' ' && arg0 <= '\u007f' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("18048, " + 327 + ", " + arg0 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KUSEVGYR", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method227(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(3) long local3 = System.currentTimeMillis();
			@Pc(6) char[] local6 = arg1.toCharArray();
			if (arg0 != 0) {
				throw new NullPointerException();
			}
			method225(local6);
			@Pc(21) String local21 = (new String(local6)).trim();
			local6 = local21.toLowerCase().toCharArray();
			@Pc(28) String local28 = local21.toLowerCase();
			method235(anInt404, local6);
			method230(local6, 276);
			method231(local6);
			method244(local6);
			for (@Pc(42) int local42 = 0; local42 < aStringArray5.length; local42++) {
				@Pc(52) int local52 = -1;
				while ((local52 = local28.indexOf(aStringArray5[local42], local52 + 1)) != -1) {
					@Pc(59) char[] local59 = aStringArray5[local42].toCharArray();
					for (@Pc(61) int local61 = 0; local61 < local59.length; local61++) {
						local6[local61 + local52] = local59[local61];
					}
				}
			}
			method228(local6, local21.toCharArray());
			method229(local6);
			@Pc(103) long local103 = System.currentTimeMillis();
			return (new String(local6)).trim();
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("30399, " + arg0 + ", " + arg1 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KUSEVGYR", name = "a", descriptor = "([C[CI)V")
	private static void method228(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1) {
		try {
			for (@Pc(5) int local5 = 0; local5 < arg1.length; local5++) {
				if (arg0[local5] != '*' && method252(anInt406, arg1[local5])) {
					arg0[local5] = arg1[local5];
				}
			}
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("95612, " + arg0 + ", " + arg1 + ", " + -369 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KUSEVGYR", name = "a", descriptor = "([CB)V")
	private static void method229(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(15) int local15 = 0; local15 < arg0.length; local15++) {
				@Pc(21) char local21 = arg0[local15];
				if (!method249(local21)) {
					local3 = true;
				} else if (local3) {
					if (method251(anInt405, local21)) {
						local3 = false;
					}
				} else if (method252(anInt406, local21)) {
					arg0[local15] = (char) (local21 + 'a' - 65);
				}
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("62786, " + arg0 + ", " + 79 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KUSEVGYR", name = "a", descriptor = "([CI)V")
	private static void method230(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 2; local3++) {
				for (@Pc(10) int local10 = aCharArrayArray1.length - 1; local10 >= 0; local10--) {
					method239(aBoolean97, arg0, aByteArrayArrayArray7[local10], aCharArrayArray1[local10]);
				}
			}
			@Pc(32) boolean local32 = false;
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("39037, " + arg0 + ", " + arg1 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KUSEVGYR", name = "b", descriptor = "([CI)V")
	private static void method231(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(18) char[] local18 = new char[] { '(', 'a', ')' };
			method239(aBoolean97, local3, (byte[][]) null, local18);
			@Pc(33) char[] local33 = (char[]) arg0.clone();
			@Pc(48) char[] local48 = new char[] { 'd', 'o', 't' };
			method239(aBoolean97, local33, (byte[][]) null, local48);
			for (@Pc(58) int local58 = aCharArrayArray2.length - 1; local58 >= 0; local58--) {
				method232(arg0, local33, aCharArrayArray2[local58], local3);
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("11410, " + arg0 + ", " + 0 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KUSEVGYR", name = "a", descriptor = "([C[C[CI[C)V")
	private static void method232(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2, @OriginalArg(4) char[] arg3) {
		try {
			if (arg2.length <= arg0.length) {
				@Pc(19) int local19;
				for (@Pc(11) int local11 = 0; local11 <= arg0.length - arg2.length; local11 += local19) {
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
							if (local17 < arg2.length && (local54 = method241(local27, local29, arg2[local17], (byte) 8)) > 0) {
								local15 += local54;
								local17++;
							} else {
								if (local17 == 0) {
									break label59;
								}
								@Pc(75) int local75;
								if ((local75 = method241(local27, local29, arg2[local17 - 1], (byte) 8)) > 0) {
									local15 += local75;
									if (local17 == 1) {
										local19++;
									}
								} else {
									if (local17 >= arg2.length || !method247(local27)) {
										break label59;
									}
									local15++;
								}
							}
						}
					}
					if (local17 >= arg2.length) {
						@Pc(106) boolean local106 = false;
						@Pc(112) int local112 = method233(local11, (byte) 4, arg0, arg3);
						@Pc(120) int local120 = method234(arg0, arg1, local15 - 1);
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
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("34760, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + arg3 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KUSEVGYR", name = "a", descriptor = "(IB[C[C)I")
	private static int method233(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) char[] arg3) {
		try {
			if (arg0 == 0) {
				return 2;
			}
			for (@Pc(9) int local9 = arg0 - 1; local9 >= 0 && method247(arg2[local9]); local9--) {
				if (arg2[local9] == '@') {
					return 3;
				}
			}
			@Pc(29) int local29 = 0;
			for (@Pc(33) int local33 = arg0 - 1; local33 >= 0 && method247(arg3[local33]); local33--) {
				if (arg3[local33] == '*') {
					local29++;
				}
			}
			@Pc(56) boolean local56 = false;
			if (local29 >= 3) {
				return 4;
			} else if (method247(arg2[arg0 - 1])) {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("77277, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KUSEVGYR", name = "a", descriptor = "(I[C[CI)I")
	private static int method234(@OriginalArg(1) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 + 1 == arg0.length) {
				return 2;
			}
			@Pc(13) int local13 = arg2 + 1;
			while (true) {
				if (local13 < arg0.length && method247(arg0[local13])) {
					if (arg0[local13] != '.' && arg0[local13] != ',') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(48) int local48 = 0;
				for (@Pc(52) int local52 = arg2 + 1; local52 < arg0.length && method247(arg1[local52]); local52++) {
					if (arg1[local52] == '*') {
						local48++;
					}
				}
				if (local48 >= 3) {
					return 4;
				}
				if (method247(arg0[arg2 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("22542, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KUSEVGYR", name = "b", descriptor = "(I[C)V")
	private static void method235(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1) {
		try {
			if (arg0 == -35644) {
				@Pc(7) char[] local7 = (char[]) arg1.clone();
				@Pc(22) char[] local22 = new char[] { 'd', 'o', 't' };
				method239(aBoolean97, local7, (byte[][]) null, local22);
				@Pc(31) char[] local31 = (char[]) arg1.clone();
				@Pc(54) char[] local54 = new char[] { 's', 'l', 'a', 's', 'h' };
				method239(aBoolean97, local31, (byte[][]) null, local54);
				for (@Pc(61) int local61 = 0; local61 < aCharArrayArray3.length; local61++) {
					method236(local31, local7, aCharArrayArray3[local61], arg1, anIntArray112[local61]);
				}
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("96405, " + arg0 + ", " + arg1 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KUSEVGYR", name = "a", descriptor = "([C[C[C[CII)V")
	private static void method236(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) char[] arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg2.length <= arg3.length) {
				@Pc(19) int local19;
				for (@Pc(11) int local11 = 0; local11 <= arg3.length - arg2.length; local11 += local19) {
					@Pc(15) int local15 = local11;
					@Pc(17) int local17 = 0;
					local19 = 1;
					label121: while (true) {
						while (true) {
							if (local15 >= arg3.length) {
								break label121;
							}
							@Pc(27) char local27 = arg3[local15];
							@Pc(29) char local29 = 0;
							if (local15 + 1 < arg3.length) {
								local29 = arg3[local15 + 1];
							}
							@Pc(54) int local54;
							if (local17 < arg2.length && (local54 = method241(local27, local29, arg2[local17], (byte) 8)) > 0) {
								local15 += local54;
								local17++;
							} else {
								if (local17 == 0) {
									break label121;
								}
								@Pc(75) int local75;
								if ((local75 = method241(local27, local29, arg2[local17 - 1], (byte) 8)) > 0) {
									local15 += local75;
									if (local17 == 1) {
										local19++;
									}
								} else {
									if (local17 >= arg2.length || !method247(local27)) {
										break label121;
									}
									local15++;
								}
							}
						}
					}
					if (local17 >= arg2.length) {
						@Pc(106) boolean local106 = false;
						@Pc(112) int local112 = method237(arg1, arg3, local11);
						@Pc(120) int local120 = method238(local15 - 1, arg3, arg0, (byte) 5);
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
											if (arg1[local186] != '*') {
												break;
											}
											local170 = local186;
										} else if (arg1[local186] == '*') {
											local170 = local186;
											local182 = true;
										}
									}
								}
								local182 = false;
								for (local186 = local170 - 1; local186 >= 0; local186--) {
									if (local182) {
										if (method247(arg3[local186])) {
											break;
										}
										local170 = local186;
									} else if (!method247(arg3[local186])) {
										local182 = true;
										local170 = local186;
									}
								}
							}
							if (local120 > 2) {
								if (local120 == 4) {
									local182 = false;
									for (local186 = local174 + 1; local186 < arg3.length; local186++) {
										if (local182) {
											if (arg0[local186] != '*') {
												break;
											}
											local174 = local186;
										} else if (arg0[local186] == '*') {
											local174 = local186;
											local182 = true;
										}
									}
								}
								local182 = false;
								for (local186 = local174 + 1; local186 < arg3.length; local186++) {
									if (local182) {
										if (method247(arg3[local186])) {
											break;
										}
										local174 = local186;
									} else if (!method247(arg3[local186])) {
										local182 = true;
										local174 = local186;
									}
								}
							}
							for (@Pc(320) int local320 = local170; local320 <= local174; local320++) {
								arg3[local320] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(345) RuntimeException local345) {
			signlink.reporterror("24042, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + arg4 + ", " + local345.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KUSEVGYR", name = "a", descriptor = "(B[C[CI)I")
	private static int method237(@OriginalArg(1) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 == 0) {
				return 2;
			}
			@Pc(9) int local9 = arg2 - 1;
			while (true) {
				if (local9 >= 0 && method247(arg1[local9])) {
					if (arg1[local9] != ',' && arg1[local9] != '.') {
						local9--;
						continue;
					}
					return 3;
				}
				@Pc(42) int local42 = 0;
				for (@Pc(46) int local46 = arg2 - 1; local46 >= 0 && method247(arg0[local46]); local46--) {
					if (arg0[local46] == '*') {
						local42++;
					}
				}
				if (local42 >= 3) {
					return 4;
				}
				if (method247(arg1[arg2 - 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("65312, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KUSEVGYR", name = "a", descriptor = "(I[C[CB)I")
	private static int method238(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) byte arg3) {
		try {
			if (arg0 + 1 == arg1.length) {
				return 2;
			}
			@Pc(13) int local13 = arg0 + 1;
			while (true) {
				if (local13 < arg1.length && method247(arg1[local13])) {
					if (arg1[local13] != '\\' && arg1[local13] != '/') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(40) int local40 = 0;
				@Pc(45) boolean local45 = false;
				for (@Pc(57) int local57 = arg0 + 1; local57 < arg1.length && method247(arg2[local57]); local57++) {
					if (arg2[local57] == '*') {
						local40++;
					}
				}
				if (local40 >= 5) {
					return 4;
				}
				if (method247(arg1[arg0 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(95) RuntimeException local95) {
			signlink.reporterror("48594, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local95.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KUSEVGYR", name = "a", descriptor = "(Z[C[[B[C)V")
	private static void method239(@OriginalArg(0) boolean arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) char[] arg3) {
		try {
			if (arg0 && arg3.length <= arg1.length) {
				@Pc(24) int local24;
				for (@Pc(14) int local14 = 0; local14 <= arg1.length - arg3.length; local14 += local24) {
					@Pc(18) int local18 = local14;
					@Pc(20) int local20 = 0;
					@Pc(22) int local22 = 0;
					local24 = 1;
					@Pc(26) boolean local26 = false;
					@Pc(28) boolean local28 = false;
					@Pc(30) boolean local30 = false;
					@Pc(38) char var13;
					@Pc(40) char var14;
					label168: while (true) {
						while (true) {
							if (local18 >= arg1.length || local28 && local30) {
								break label168;
							}
							var13 = arg1[local18];
							var14 = '\u0000';
							if (local18 + 1 < arg1.length) {
								var14 = arg1[local18 + 1];
							}
							@Pc(65) int local65;
							if (local20 < arg3.length && (local65 = method242(arg3[local20], var13, var14)) > 0) {
								if (local65 == 1 && method250(var13)) {
									local28 = true;
								}
								if (local65 == 2 && (method250(var13) || method250(var14))) {
									local28 = true;
								}
								local18 += local65;
								local20++;
							} else {
								if (local20 == 0) {
									break label168;
								}
								@Pc(108) int local108;
								if ((local108 = method242(arg3[local20 - 1], var13, var14)) > 0) {
									local18 += local108;
									if (local20 == 1) {
										local24++;
									}
								} else {
									if (local20 >= arg3.length || !method248(var13)) {
										break label168;
									}
									if (method247(var13) && var13 != '\'') {
										local26 = true;
									}
									if (method250(var13)) {
										local30 = true;
									}
									local18++;
									local22++;
									if (local22 * 100 / (local18 - local14) > 90) {
										break label168;
									}
								}
							}
						}
					}
					if (local20 >= arg3.length && (!local28 || !local30)) {
						@Pc(173) boolean local173 = true;
						@Pc(269) int local269;
						if (local26) {
							@Pc(219) boolean local219 = false;
							@Pc(221) boolean local221 = false;
							if (local14 - 1 < 0 || method247(arg1[local14 - 1]) && arg1[local14 - 1] != '\'') {
								local219 = true;
							}
							if (local18 >= arg1.length || method247(arg1[local18]) && arg1[local18] != '\'') {
								local221 = true;
							}
							if (!local219 || !local221) {
								@Pc(265) boolean local265 = false;
								local269 = local14 - 2;
								if (local219) {
									local269 = local14;
								}
								while (!local265 && local269 < local18) {
									if (local269 >= 0 && (!method247(arg1[local269]) || arg1[local269] == '\'')) {
										@Pc(291) char[] local291 = new char[3];
										@Pc(293) int local293;
										for (local293 = 0; local293 < 3 && local269 + local293 < arg1.length && (!method247(arg1[local269 + local293]) || arg1[local269 + local293] == '\''); local293++) {
											local291[local293] = arg1[local269 + local293];
										}
										@Pc(331) boolean local331 = true;
										if (local293 == 0) {
											local331 = false;
										}
										if (local293 < 3 && local269 - 1 >= 0 && (!method247(arg1[local269 - 1]) || arg1[local269 - 1] == '\'')) {
											local331 = false;
										}
										if (local331 && !method253(local291)) {
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
							var13 = ' ';
							if (local14 - 1 >= 0) {
								var13 = arg1[local14 - 1];
							}
							var14 = ' ';
							if (local18 < arg1.length) {
								var14 = arg1[local18];
							}
							@Pc(201) byte local201 = method243(var13);
							@Pc(205) byte local205 = method243(var14);
							if (arg2 != null && method240(local201, arg2, local205)) {
								local173 = false;
							}
						}
						if (local173) {
							@Pc(381) int local381 = 0;
							@Pc(383) int local383 = 0;
							@Pc(385) int local385 = -1;
							for (local269 = local14; local269 < local18; local269++) {
								if (method250(arg1[local269])) {
									local381++;
								} else if (method249(arg1[local269])) {
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
			signlink.reporterror("96638, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local454.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KUSEVGYR", name = "a", descriptor = "(B[[BBI)Z")
	private static boolean method240(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) byte arg2) {
		try {
			@Pc(7) int local7 = 0;
			if (arg1[0][0] == arg0 && arg1[0][1] == arg2) {
				return true;
			}
			@Pc(28) int local28 = arg1.length - 1;
			if (arg1[local28][0] == arg0 && arg1[local28][1] == arg2) {
				return true;
			}
			do {
				@Pc(50) int local50 = (local7 + local28) / 2;
				if (arg1[local50][0] == arg0 && arg1[local50][1] == arg2) {
					return true;
				}
				if (arg0 < arg1[local50][0] || arg0 == arg1[local50][0] && arg2 < arg1[local50][1]) {
					local28 = local50;
				} else {
					local7 = local50;
				}
			} while (local7 != local28 && local7 + 1 != local28);
			return false;
		} catch (@Pc(104) RuntimeException local104) {
			signlink.reporterror("75468, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local104.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KUSEVGYR", name = "a", descriptor = "(CCCB)I")
	private static int method241(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(2) char arg2, @OriginalArg(3) byte arg3) {
		try {
			@Pc(4) boolean local4 = false;
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
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("67985, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KUSEVGYR", name = "a", descriptor = "(CICC)I")
	private static int method242(@OriginalArg(0) char arg0, @OriginalArg(2) char arg1, @OriginalArg(3) char arg2) {
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
		} catch (@Pc(517) RuntimeException local517) {
			signlink.reporterror("11064, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + local517.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KUSEVGYR", name = "a", descriptor = "(CI)B")
	private static byte method243(@OriginalArg(0) char arg0) {
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
			signlink.reporterror("28372, " + arg0 + ", " + -581 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KUSEVGYR", name = "c", descriptor = "(I[C)V")
	private static void method244(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(5) int local5 = 0;
			@Pc(13) int local13 = 0;
			@Pc(15) int local15 = 0;
			while (true) {
				do {
					@Pc(114) int local114;
					if ((local114 = method245((byte) 8, local5, arg0)) == -1) {
						return;
					}
					@Pc(19) boolean local19 = false;
					for (@Pc(21) int local21 = local5; local21 >= 0 && local21 < local114 && !local19; local21++) {
						if (!method247(arg0[local21]) && !method248(arg0[local21])) {
							local19 = true;
						}
					}
					if (local19) {
						local13 = 0;
					}
					if (local13 == 0) {
						local15 = local114;
					}
					local5 = method246(local114, arg0, (byte) 8);
					@Pc(60) int local60 = 0;
					for (@Pc(62) int local62 = local114; local62 < local5; local62++) {
						local60 = local60 * 10 + arg0[local62] - 48;
					}
					if (local60 <= 255 && local5 - local114 <= 8) {
						local13++;
					} else {
						local13 = 0;
					}
				} while (local13 != 4);
				for (@Pc(96) int local96 = local15; local96 < local5; local96++) {
					arg0[local96] = '*';
				}
				local13 = 0;
			}
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("99078, " + -128 + ", " + arg0 + ", " + local118.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KUSEVGYR", name = "a", descriptor = "(BI[C)I")
	private static int method245(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) char[] arg2) {
		try {
			for (@Pc(3) int local3 = arg1; local3 < arg2.length && local3 >= 0; local3++) {
				if (arg2[local3] >= '0' && arg2[local3] <= '9') {
					return local3;
				}
			}
			@Pc(29) boolean local29 = false;
			return -1;
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("94067, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KUSEVGYR", name = "a", descriptor = "(I[CB)I")
	private static int method246(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) byte arg2) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(12) int local12 = arg0;
			while (true) {
				if (local12 < arg1.length && local12 >= 0) {
					if (arg1[local12] >= '0' && arg1[local12] <= '9') {
						local12++;
						continue;
					}
					return local12;
				}
				return arg1.length;
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("77197, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KUSEVGYR", name = "b", descriptor = "(IC)Z")
	private static boolean method247(@OriginalArg(1) char arg0) {
		try {
			return !method249(arg0) && !method250(arg0);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("42630, " + 49389 + ", " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KUSEVGYR", name = "b", descriptor = "(CI)Z")
	private static boolean method248(@OriginalArg(0) char arg0) {
		try {
			if (arg0 >= 'a' && arg0 <= 'z') {
				return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
			} else {
				return true;
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("23248, " + arg0 + ", " + 0 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KUSEVGYR", name = "a", descriptor = "(ZC)Z")
	private static boolean method249(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("49531, " + true + ", " + arg0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KUSEVGYR", name = "c", descriptor = "(IC)Z")
	private static boolean method250(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= '0' && arg0 <= '9';
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("83130, " + -646 + ", " + arg0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KUSEVGYR", name = "d", descriptor = "(IC)Z")
	private static boolean method251(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		try {
			if (arg0 != 8) {
				throw new NullPointerException();
			}
			return arg1 >= 'a' && arg1 <= 'z';
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("35825, " + arg0 + ", " + arg1 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KUSEVGYR", name = "e", descriptor = "(IC)Z")
	private static boolean method252(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		try {
			@Pc(3) int local3 = 31 / arg0;
			return arg1 >= 'A' && arg1 <= 'Z';
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("30245, " + arg0 + ", " + arg1 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KUSEVGYR", name = "b", descriptor = "([CB)Z")
	private static boolean method253(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(10) boolean local10 = true;
			for (@Pc(12) int local12 = 0; local12 < arg0.length; local12++) {
				if (!method250(arg0[local12]) && arg0[local12] != '\u0000') {
					local10 = false;
				}
			}
			if (local10) {
				return true;
			}
			@Pc(39) int local39 = method254(arg0);
			@Pc(41) int local41 = 0;
			@Pc(46) int local46 = anIntArray111.length - 1;
			if (local39 == anIntArray111[0] || local39 == anIntArray111[local46]) {
				return true;
			}
			do {
				@Pc(64) int local64 = (local41 + local46) / 2;
				if (local39 == anIntArray111[local64]) {
					return true;
				}
				if (local39 < anIntArray111[local64]) {
					local46 = local64;
				} else {
					local41 = local64;
				}
			} while (local41 != local46 && local41 + 1 != local46);
			return false;
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("74635, " + arg0 + ", " + 32 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KUSEVGYR", name = "c", descriptor = "([CI)I")
	private static int method254(@OriginalArg(0) char[] arg0) {
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
			signlink.reporterror("14713, " + arg0 + ", " + 0 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}
}
