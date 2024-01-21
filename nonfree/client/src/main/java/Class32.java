import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!PSDABLUV")
public final class Class32 {

	@OriginalMember(owner = "client!PSDABLUV", name = "a", descriptor = "I")
	private static int anInt434;

	@OriginalMember(owner = "client!PSDABLUV", name = "b", descriptor = "Z")
	private static boolean aBoolean115;

	@OriginalMember(owner = "client!PSDABLUV", name = "f", descriptor = "Z")
	private static boolean aBoolean116;

	@OriginalMember(owner = "client!PSDABLUV", name = "l", descriptor = "[I")
	private static int[] anIntArray102;

	@OriginalMember(owner = "client!PSDABLUV", name = "m", descriptor = "[[C")
	private static char[][] aCharArrayArray1;

	@OriginalMember(owner = "client!PSDABLUV", name = "n", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!PSDABLUV", name = "o", descriptor = "[[C")
	private static char[][] aCharArrayArray2;

	@OriginalMember(owner = "client!PSDABLUV", name = "p", descriptor = "[[C")
	private static char[][] aCharArrayArray3;

	@OriginalMember(owner = "client!PSDABLUV", name = "q", descriptor = "[I")
	private static int[] anIntArray103;

	@OriginalMember(owner = "client!PSDABLUV", name = "c", descriptor = "I")
	private static int anInt435 = -29012;

	@OriginalMember(owner = "client!PSDABLUV", name = "d", descriptor = "I")
	private static int anInt436 = 5;

	@OriginalMember(owner = "client!PSDABLUV", name = "e", descriptor = "I")
	private static int anInt437 = 649;

	@OriginalMember(owner = "client!PSDABLUV", name = "g", descriptor = "I")
	private static int anInt438 = 9;

	@OriginalMember(owner = "client!PSDABLUV", name = "h", descriptor = "I")
	private static int anInt439 = 42987;

	@OriginalMember(owner = "client!PSDABLUV", name = "i", descriptor = "Z")
	private static boolean aBoolean117 = true;

	@OriginalMember(owner = "client!PSDABLUV", name = "j", descriptor = "I")
	private static int anInt440 = 9;

	@OriginalMember(owner = "client!PSDABLUV", name = "k", descriptor = "B")
	private static byte aByte12 = -104;

	@OriginalMember(owner = "client!PSDABLUV", name = "r", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray4 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

	@OriginalMember(owner = "client!PSDABLUV", name = "a", descriptor = "(Lclient!TXPLZUUI;)V")
	public static void method278(@OriginalArg(0) Class40 arg0) {
		@Pc(10) Class5_Sub1_Sub4 local10 = new Class5_Sub1_Sub4(arg0.method464("fragmentsenc.txt", null), 0);
		@Pc(19) Class5_Sub1_Sub4 local19 = new Class5_Sub1_Sub4(arg0.method464("badenc.txt", null), 0);
		@Pc(28) Class5_Sub1_Sub4 local28 = new Class5_Sub1_Sub4(arg0.method464("domainenc.txt", null), 0);
		@Pc(37) Class5_Sub1_Sub4 local37 = new Class5_Sub1_Sub4(arg0.method464("tldlist.txt", null), 0);
		method279(local10, local19, local28, local37);
	}

	@OriginalMember(owner = "client!PSDABLUV", name = "a", descriptor = "(Lclient!PKHWFJLM;Lclient!PKHWFJLM;Lclient!PKHWFJLM;Lclient!PKHWFJLM;)V")
	private static void method279(@OriginalArg(0) Class5_Sub1_Sub4 arg0, @OriginalArg(1) Class5_Sub1_Sub4 arg1, @OriginalArg(2) Class5_Sub1_Sub4 arg2, @OriginalArg(3) Class5_Sub1_Sub4 arg3) {
		method281(arg1);
		method282(arg2);
		method283(arg0);
		method280(arg3);
	}

	@OriginalMember(owner = "client!PSDABLUV", name = "a", descriptor = "(BLclient!PKHWFJLM;)V")
	private static void method280(@OriginalArg(1) Class5_Sub1_Sub4 arg0) {
		try {
			@Pc(4) int local4 = arg0.method245();
			aCharArrayArray3 = new char[local4][];
			anIntArray103 = new int[local4];
			for (@Pc(22) int local22 = 0; local22 < local4; local22++) {
				anIntArray103[local22] = arg0.method240();
				@Pc(33) char[] local33 = new char[arg0.method240()];
				for (@Pc(35) int local35 = 0; local35 < local33.length; local35++) {
					local33[local35] = (char) arg0.method240();
				}
				aCharArrayArray3[local22] = local33;
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("62984, " + -56 + ", " + arg0 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PSDABLUV", name = "a", descriptor = "(Lclient!PKHWFJLM;Z)V")
	private static void method281(@OriginalArg(0) Class5_Sub1_Sub4 arg0) {
		try {
			@Pc(2) int local2 = arg0.method245();
			aCharArrayArray1 = new char[local2][];
			aByteArrayArrayArray7 = new byte[local2][][];
			method284(aCharArrayArray1, aByteArrayArrayArray7, (byte) 9, arg0);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("80394, " + arg0 + ", " + false + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PSDABLUV", name = "a", descriptor = "(ILclient!PKHWFJLM;)V")
	private static void method282(@OriginalArg(1) Class5_Sub1_Sub4 arg0) {
		try {
			@Pc(2) int local2 = arg0.method245();
			aCharArrayArray2 = new char[local2][];
			method285(aCharArrayArray2, arg0);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("83739, " + -468 + ", " + arg0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PSDABLUV", name = "a", descriptor = "(Lclient!PKHWFJLM;B)V")
	private static void method283(@OriginalArg(0) Class5_Sub1_Sub4 arg0) {
		try {
			anIntArray102 = new int[arg0.method245()];
			for (@Pc(9) int local9 = 0; local9 < anIntArray102.length; local9++) {
				anIntArray102[local9] = arg0.method242();
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("62387, " + arg0 + ", " + 1 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PSDABLUV", name = "a", descriptor = "([[C[[[BBLclient!PKHWFJLM;)V")
	private static void method284(@OriginalArg(0) char[][] arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) Class5_Sub1_Sub4 arg3) {
		try {
			@Pc(6) boolean local6 = false;
			for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
				@Pc(17) char[] local17 = new char[arg3.method240()];
				for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
					local17[local19] = (char) arg3.method240();
				}
				arg0[local11] = local17;
				@Pc(41) byte[][] local41 = new byte[arg3.method240()][2];
				for (@Pc(43) int local43 = 0; local43 < local41.length; local43++) {
					local41[local43][0] = (byte) arg3.method240();
					local41[local43][1] = (byte) arg3.method240();
				}
				if (local41.length > 0) {
					arg1[local11] = local41;
				}
			}
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("29836, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PSDABLUV", name = "a", descriptor = "([[CZLclient!PKHWFJLM;)V")
	private static void method285(@OriginalArg(0) char[][] arg0, @OriginalArg(2) Class5_Sub1_Sub4 arg1) {
		try {
			for (@Pc(6) int local6 = 0; local6 < arg0.length; local6++) {
				@Pc(12) char[] local12 = new char[arg1.method240()];
				for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
					local12[local14] = (char) arg1.method240();
				}
				arg0[local6] = local12;
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("19686, " + arg0 + ", " + true + ", " + arg1 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PSDABLUV", name = "a", descriptor = "(I[C)V")
	private static void method286(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1) {
		try {
			if (arg0 == anInt436) {
				@Pc(7) int local7 = 0;
				for (@Pc(9) int local9 = 0; local9 < arg1.length; local9++) {
					if (method287(arg1[local9])) {
						arg1[local7] = arg1[local9];
					} else {
						arg1[local7] = ' ';
					}
					if (local7 == 0 || arg1[local7] != ' ' || arg1[local7 - 1] != ' ') {
						local7++;
					}
				}
				for (@Pc(51) int local51 = local7; local51 < arg1.length; local51++) {
					arg1[local51] = ' ';
				}
			}
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("29338, " + arg0 + ", " + arg1 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PSDABLUV", name = "a", descriptor = "(ZC)Z")
	private static boolean method287(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= ' ' && arg0 <= '\u007f' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("25914, " + false + ", " + arg0 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PSDABLUV", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method288(@OriginalArg(1) String arg0) {
		try {
			@Pc(3) long local3 = System.currentTimeMillis();
			@Pc(6) char[] local6 = arg0.toCharArray();
			method286(anInt436, local6);
			@Pc(15) String local15 = (new String(local6)).trim();
			@Pc(19) char[] local19 = local15.toLowerCase().toCharArray();
			@Pc(22) String local22 = local15.toLowerCase();
			method296(local19, aBoolean116);
			method291(local19);
			method292(local19);
			method305(local19);
			for (@Pc(41) int local41 = 0; local41 < aStringArray4.length; local41++) {
				@Pc(51) int local51 = -1;
				while ((local51 = local22.indexOf(aStringArray4[local41], local51 + 1)) != -1) {
					@Pc(58) char[] local58 = aStringArray4[local41].toCharArray();
					for (@Pc(60) int local60 = 0; local60 < local58.length; local60++) {
						local19[local60 + local51] = local58[local60];
					}
				}
			}
			method289(local19, local15.toCharArray());
			method290(local19);
			@Pc(102) long local102 = System.currentTimeMillis();
			return (new String(local19)).trim();
		} catch (@Pc(109) RuntimeException local109) {
			signlink.reporterror("80365, " + 24865 + ", " + arg0 + ", " + local109.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PSDABLUV", name = "a", descriptor = "([C[CI)V")
	private static void method289(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1) {
		try {
			for (@Pc(1) int local1 = 0; local1 < arg1.length; local1++) {
				if (arg0[local1] != '*' && method313(arg1[local1])) {
					arg0[local1] = arg1[local1];
				}
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("43290, " + arg0 + ", " + arg1 + ", " + 8 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PSDABLUV", name = "a", descriptor = "([CI)V")
	private static void method290(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
				@Pc(19) char local19 = arg0[local13];
				if (!method310(local19)) {
					local3 = true;
				} else if (local3) {
					if (method312(local19)) {
						local3 = false;
					}
				} else if (method313(local19)) {
					arg0[local13] = (char) (local19 + 'a' - 65);
				}
			}
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("97892, " + arg0 + ", " + 649 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PSDABLUV", name = "a", descriptor = "(Z[C)V")
	private static void method291(@OriginalArg(1) char[] arg0) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 2; local3++) {
				for (@Pc(10) int local10 = aCharArrayArray1.length - 1; local10 >= 0; local10--) {
					method300(arg0, aCharArrayArray1[local10], aByteArrayArrayArray7[local10]);
				}
			}
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("63205, " + true + ", " + arg0 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PSDABLUV", name = "b", descriptor = "(Z[C)V")
	private static void method292(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(18) char[] local18 = new char[] { '(', 'a', ')' };
			method300(local3, local18, null);
			@Pc(30) char[] local30 = (char[]) arg0.clone();
			@Pc(45) char[] local45 = new char[] { 'd', 'o', 't' };
			method300(local30, local45, null);
			for (@Pc(55) int local55 = aCharArrayArray2.length - 1; local55 >= 0; local55--) {
				method293(arg0, aCharArrayArray2[local55], local3, local30);
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("2977, " + false + ", " + arg0 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PSDABLUV", name = "a", descriptor = "([C[C[CZ[C)V")
	private static void method293(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2, @OriginalArg(4) char[] arg3) {
		try {
			if (arg1.length <= arg0.length) {
				@Pc(27) int local27;
				for (@Pc(19) int local19 = 0; local19 <= arg0.length - arg1.length; local19 += local27) {
					@Pc(23) int local23 = local19;
					@Pc(25) int local25 = 0;
					local27 = 1;
					label58: while (true) {
						while (true) {
							if (local23 >= arg0.length) {
								break label58;
							}
							@Pc(35) char local35 = arg0[local23];
							@Pc(37) char local37 = 0;
							if (local23 + 1 < arg0.length) {
								local37 = arg0[local23 + 1];
							}
							@Pc(62) int local62;
							if (local25 < arg1.length && (local62 = method302(local35, arg1[local25], local37)) > 0) {
								local23 += local62;
								local25++;
							} else {
								if (local25 == 0) {
									break label58;
								}
								@Pc(83) int local83;
								if ((local83 = method302(local35, arg1[local25 - 1], local37)) > 0) {
									local23 += local83;
									if (local25 == 1) {
										local27++;
									}
								} else {
									if (local25 >= arg1.length || !method308(local35, 922)) {
										break label58;
									}
									local23++;
								}
							}
						}
					}
					if (local25 >= arg1.length) {
						@Pc(114) boolean local114 = false;
						@Pc(120) int local120 = method294(local19, arg0, arg2);
						@Pc(128) int local128 = method295(local23 - 1, arg0, arg3);
						if (local120 > 2 || local128 > 2) {
							local114 = true;
						}
						if (local114) {
							for (@Pc(140) int local140 = local19; local140 < local23; local140++) {
								arg0[local140] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(163) RuntimeException local163) {
			signlink.reporterror("33707, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + arg3 + ", " + local163.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PSDABLUV", name = "a", descriptor = "(I[C[CI)I")
	private static int method294(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2) {
		try {
			if (arg0 == 0) {
				return 2;
			}
			for (@Pc(9) int local9 = arg0 - 1; local9 >= 0 && method308(arg1[local9], 922); local9--) {
				if (arg1[local9] == '@') {
					return 3;
				}
			}
			@Pc(29) int local29 = 0;
			for (@Pc(33) int local33 = arg0 - 1; local33 >= 0 && method308(arg2[local33], 922); local33--) {
				if (arg2[local33] == '*') {
					local29++;
				}
			}
			if (local29 >= 3) {
				return 4;
			} else if (method308(arg1[arg0 - 1], 922)) {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("32579, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 41336 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PSDABLUV", name = "a", descriptor = "(I[CZ[C)I")
	private static int method295(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg0 + 1 == arg1.length) {
				return 2;
			}
			@Pc(13) int local13 = arg0 + 1;
			while (true) {
				if (local13 < arg1.length && method308(arg1[local13], 922)) {
					if (arg1[local13] != '.' && arg1[local13] != ',') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(40) int local40 = 0;
				for (@Pc(48) int local48 = arg0 + 1; local48 < arg1.length && method308(arg2[local48], 922); local48++) {
					if (arg2[local48] == '*') {
						local40++;
					}
				}
				if (local40 >= 3) {
					return 4;
				}
				if (method308(arg1[arg0 + 1], 922)) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("90607, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PSDABLUV", name = "a", descriptor = "([CZ)V")
	private static void method296(@OriginalArg(0) char[] arg0, @OriginalArg(1) boolean arg1) {
		try {
			if (arg1) {
				for (@Pc(5) int local5 = 1; local5 > 0; local5++) {
				}
			}
			@Pc(14) char[] local14 = (char[]) arg0.clone();
			@Pc(29) char[] local29 = new char[] { 'd', 'o', 't' };
			method300(local14, local29, null);
			@Pc(38) char[] local38 = (char[]) arg0.clone();
			@Pc(61) char[] local61 = new char[] { 's', 'l', 'a', 's', 'h' };
			method300(local38, local61, null);
			for (@Pc(68) int local68 = 0; local68 < aCharArrayArray3.length; local68++) {
				method297(local38, local14, arg0, anIntArray103[local68], aCharArrayArray3[local68]);
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("733, " + arg0 + ", " + arg1 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PSDABLUV", name = "a", descriptor = "(I[C[C[CI[C)V")
	private static void method297(@OriginalArg(1) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) char[] arg4) {
		try {
			if (anInt438 != 9) {
				anInt437 = -174;
			}
			if (arg4.length <= arg2.length) {
				@Pc(24) int local24;
				for (@Pc(16) int local16 = 0; local16 <= arg2.length - arg4.length; local16 += local24) {
					@Pc(20) int local20 = local16;
					@Pc(22) int local22 = 0;
					local24 = 1;
					label124: while (true) {
						while (true) {
							if (local20 >= arg2.length) {
								break label124;
							}
							@Pc(32) char local32 = arg2[local20];
							@Pc(34) char local34 = 0;
							if (local20 + 1 < arg2.length) {
								local34 = arg2[local20 + 1];
							}
							@Pc(59) int local59;
							if (local22 < arg4.length && (local59 = method302(local32, arg4[local22], local34)) > 0) {
								local20 += local59;
								local22++;
							} else {
								if (local22 == 0) {
									break label124;
								}
								@Pc(80) int local80;
								if ((local80 = method302(local32, arg4[local22 - 1], local34)) > 0) {
									local20 += local80;
									if (local22 == 1) {
										local24++;
									}
								} else {
									if (local22 >= arg4.length || !method308(local32, 922)) {
										break label124;
									}
									local20++;
								}
							}
						}
					}
					if (local22 >= arg4.length) {
						@Pc(111) boolean local111 = false;
						@Pc(117) int local117 = method298(arg1, arg2, local16);
						@Pc(125) int local125 = method299(local20 - 1, arg0, arg2);
						if (arg3 == 1 && local117 > 0 && local125 > 0) {
							local111 = true;
						}
						if (arg3 == 2 && (local117 > 2 && local125 > 0 || local117 > 0 && local125 > 2)) {
							local111 = true;
						}
						if (arg3 == 3 && local117 > 0 && local125 > 2) {
							local111 = true;
						}
						@Pc(168) boolean local168;
						if (arg3 == 3 && local117 > 2 && local125 > 0) {
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
											if (arg1[local191] != '*') {
												break;
											}
											local175 = local191;
										} else if (arg1[local191] == '*') {
											local175 = local191;
											local187 = true;
										}
									}
								}
								local187 = false;
								for (local191 = local175 - 1; local191 >= 0; local191--) {
									if (local187) {
										if (method308(arg2[local191], 922)) {
											break;
										}
										local175 = local191;
									} else if (!method308(arg2[local191], 922)) {
										local187 = true;
										local175 = local191;
									}
								}
							}
							if (local125 > 2) {
								if (local125 == 4) {
									local187 = false;
									for (local191 = local179 + 1; local191 < arg2.length; local191++) {
										if (local187) {
											if (arg0[local191] != '*') {
												break;
											}
											local179 = local191;
										} else if (arg0[local191] == '*') {
											local179 = local191;
											local187 = true;
										}
									}
								}
								local187 = false;
								for (local191 = local179 + 1; local191 < arg2.length; local191++) {
									if (local187) {
										if (method308(arg2[local191], 922)) {
											break;
										}
										local179 = local191;
									} else if (!method308(arg2[local191], 922)) {
										local187 = true;
										local179 = local191;
									}
								}
							}
							for (@Pc(325) int local325 = local175; local325 <= local179; local325++) {
								arg2[local325] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(348) RuntimeException local348) {
			signlink.reporterror("28575, " + 9 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local348.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PSDABLUV", name = "a", descriptor = "([C[CII)I")
	private static int method298(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 == 0) {
				return 2;
			}
			@Pc(9) int local9 = arg2 - 1;
			while (true) {
				if (local9 >= 0 && method308(arg1[local9], 922)) {
					if (arg1[local9] != ',' && arg1[local9] != '.') {
						local9--;
						continue;
					}
					return 3;
				}
				@Pc(38) int local38 = 0;
				for (@Pc(42) int local42 = arg2 - 1; local42 >= 0 && method308(arg0[local42], 922); local42--) {
					if (arg0[local42] == '*') {
						local38++;
					}
				}
				if (local38 >= 3) {
					return 4;
				}
				if (method308(arg1[arg2 - 1], 922)) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("64223, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PSDABLUV", name = "b", descriptor = "(I[CZ[C)I")
	private static int method299(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg0 + 1 == arg2.length) {
				return 2;
			}
			@Pc(13) int local13 = arg0 + 1;
			while (true) {
				if (local13 < arg2.length && method308(arg2[local13], 922)) {
					if (arg2[local13] != '\\' && arg2[local13] != '/') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(40) int local40 = 0;
				for (@Pc(48) int local48 = arg0 + 1; local48 < arg2.length && method308(arg1[local48], 922); local48++) {
					if (arg1[local48] == '*') {
						local40++;
					}
				}
				if (local40 >= 5) {
					return 4;
				}
				if (method308(arg2[arg0 + 1], 922)) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("16068, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PSDABLUV", name = "a", descriptor = "(I[C[C[[B)V")
	private static void method300(@OriginalArg(1) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) byte[][] arg2) {
		try {
			if (arg1.length <= arg0.length) {
				@Pc(14) int local14;
				if (anInt439 != 42987) {
					for (local14 = 1; local14 > 0; local14++) {
					}
				}
				@Pc(31) int local31;
				for (local14 = 0; local14 <= arg0.length - arg1.length; local14 += local31) {
					@Pc(25) int local25 = local14;
					@Pc(27) int local27 = 0;
					@Pc(29) int local29 = 0;
					local31 = 1;
					@Pc(33) boolean local33 = false;
					@Pc(35) boolean local35 = false;
					@Pc(37) boolean local37 = false;
					@Pc(45) char var12;
					@Pc(47) char var13;
					label167: while (true) {
						while (true) {
							if (local25 >= arg0.length || local35 && local37) {
								break label167;
							}
							var12 = arg0[local25];
							var13 = '\u0000';
							if (local25 + 1 < arg0.length) {
								var13 = arg0[local25 + 1];
							}
							@Pc(72) int local72;
							if (local27 < arg1.length && (local72 = method303(var13, arg1[local27], var12)) > 0) {
								if (local72 == 1 && method311(var12)) {
									local35 = true;
								}
								if (local72 == 2 && (method311(var12) || method311(var13))) {
									local35 = true;
								}
								local25 += local72;
								local27++;
							} else {
								if (local27 == 0) {
									break label167;
								}
								@Pc(115) int local115;
								if ((local115 = method303(var13, arg1[local27 - 1], var12)) > 0) {
									local25 += local115;
									if (local27 == 1) {
										local31++;
									}
								} else {
									if (local27 >= arg1.length || !method309(var12, anInt440)) {
										break label167;
									}
									if (method308(var12, 922) && var12 != '\'') {
										local33 = true;
									}
									if (method311(var12)) {
										local37 = true;
									}
									local25++;
									local29++;
									if (local29 * 100 / (local25 - local14) > 90) {
										break label167;
									}
								}
							}
						}
					}
					if (local27 >= arg1.length && (!local35 || !local37)) {
						@Pc(180) boolean local180 = true;
						@Pc(276) int local276;
						if (local33) {
							@Pc(226) boolean local226 = false;
							@Pc(228) boolean local228 = false;
							if (local14 - 1 < 0 || method308(arg0[local14 - 1], 922) && arg0[local14 - 1] != '\'') {
								local226 = true;
							}
							if (local25 >= arg0.length || method308(arg0[local25], 922) && arg0[local25] != '\'') {
								local228 = true;
							}
							if (!local226 || !local228) {
								@Pc(272) boolean local272 = false;
								local276 = local14 - 2;
								if (local226) {
									local276 = local14;
								}
								while (!local272 && local276 < local25) {
									if (local276 >= 0 && (!method308(arg0[local276], 922) || arg0[local276] == '\'')) {
										@Pc(298) char[] local298 = new char[3];
										@Pc(300) int local300;
										for (local300 = 0; local300 < 3 && local276 + local300 < arg0.length && (!method308(arg0[local276 + local300], 922) || arg0[local276 + local300] == '\''); local300++) {
											local298[local300] = arg0[local276 + local300];
										}
										@Pc(338) boolean local338 = true;
										if (local300 == 0) {
											local338 = false;
										}
										if (local300 < 3 && local276 - 1 >= 0 && (!method308(arg0[local276 - 1], 922) || arg0[local276 - 1] == '\'')) {
											local338 = false;
										}
										if (local338 && !method314(local298)) {
											local272 = true;
										}
									}
									local276++;
								}
								if (!local272) {
									local180 = false;
								}
							}
						} else {
							var12 = ' ';
							if (local14 - 1 >= 0) {
								var12 = arg0[local14 - 1];
							}
							var13 = ' ';
							if (local25 < arg0.length) {
								var13 = arg0[local25];
							}
							@Pc(208) byte local208 = method304(var12);
							@Pc(212) byte local212 = method304(var13);
							if (arg2 != null && method301(local212, local208, arg2)) {
								local180 = false;
							}
						}
						if (local180) {
							@Pc(388) int local388 = 0;
							@Pc(390) int local390 = 0;
							@Pc(392) int local392 = -1;
							for (local276 = local14; local276 < local25; local276++) {
								if (method311(arg0[local276])) {
									local388++;
								} else if (method310(arg0[local276])) {
									local390++;
									local392 = local276;
								}
							}
							if (local392 > -1) {
								local388 -= local25 - local392 - 1;
							}
							if (local388 <= local390) {
								for (@Pc(434) int local434 = local14; local434 < local25; local434++) {
									arg0[local434] = '*';
								}
							} else {
								local31 = 1;
							}
						}
					}
				}
			}
		} catch (@Pc(461) RuntimeException local461) {
			signlink.reporterror("3625, " + 42987 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local461.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PSDABLUV", name = "a", descriptor = "(BB[[BI)Z")
	private static boolean method301(@OriginalArg(0) byte arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte[][] arg2) {
		try {
			@Pc(12) int local12 = 0;
			if (arg2[0][0] == arg1 && arg2[0][1] == arg0) {
				return true;
			}
			@Pc(33) int local33 = arg2.length - 1;
			if (arg2[local33][0] == arg1 && arg2[local33][1] == arg0) {
				return true;
			}
			do {
				@Pc(55) int local55 = (local12 + local33) / 2;
				if (arg2[local55][0] == arg1 && arg2[local55][1] == arg0) {
					return true;
				}
				if (arg1 < arg2[local55][0] || arg1 == arg2[local55][0] && arg0 < arg2[local55][1]) {
					local33 = local55;
				} else {
					local12 = local55;
				}
			} while (local12 != local33 && local12 + 1 != local33);
			return false;
		} catch (@Pc(109) RuntimeException local109) {
			signlink.reporterror("59519, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -659 + ", " + local109.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PSDABLUV", name = "a", descriptor = "(ZCCC)I")
	private static int method302(@OriginalArg(1) char arg0, @OriginalArg(2) char arg1, @OriginalArg(3) char arg2) {
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
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("4436, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PSDABLUV", name = "a", descriptor = "(CZCC)I")
	private static int method303(@OriginalArg(0) char arg0, @OriginalArg(2) char arg1, @OriginalArg(3) char arg2) {
		try {
			if (arg1 == arg2) {
				return 1;
			}
			if (arg1 >= 'a' && arg1 <= 'm') {
				if (arg1 == 'a') {
					if (arg2 != '4' && arg2 != '@' && arg2 != '^') {
						if (arg2 == '/' && arg0 == '\\') {
							return 2;
						}
						return 0;
					}
					return 1;
				}
				if (arg1 == 'b') {
					if (arg2 != '6' && arg2 != '8') {
						if ((arg2 != '1' || arg0 != '3') && (arg2 != 'i' || arg0 != '3')) {
							return 0;
						}
						return 2;
					}
					return 1;
				}
				if (arg1 == 'c') {
					if (arg2 != '(' && arg2 != '<' && arg2 != '{' && arg2 != '[') {
						return 0;
					}
					return 1;
				}
				if (arg1 == 'd') {
					if ((arg2 != '[' || arg0 != ')') && (arg2 != 'i' || arg0 != ')')) {
						return 0;
					}
					return 2;
				}
				if (arg1 == 'e') {
					if (arg2 != '3' && arg2 != '€') {
						return 0;
					}
					return 1;
				}
				if (arg1 == 'f') {
					if (arg2 == 'p' && arg0 == 'h') {
						return 2;
					}
					if (arg2 == '£') {
						return 1;
					}
					return 0;
				}
				if (arg1 == 'g') {
					if (arg2 != '9' && arg2 != '6' && arg2 != 'q') {
						return 0;
					}
					return 1;
				}
				if (arg1 == 'h') {
					if (arg2 == '#') {
						return 1;
					}
					return 0;
				}
				if (arg1 == 'i') {
					if (arg2 != 'y' && arg2 != 'l' && arg2 != 'j' && arg2 != '1' && arg2 != '!' && arg2 != ':' && arg2 != ';' && arg2 != '|') {
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
					if (arg2 != '1' && arg2 != '|' && arg2 != 'i') {
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
					if (arg2 != '0' && arg2 != '*') {
						if ((arg2 != '(' || arg0 != ')') && (arg2 != '[' || arg0 != ']') && (arg2 != '{' || arg0 != '}') && (arg2 != '<' || arg0 != '>')) {
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
					if (arg2 != '5' && arg2 != 'z' && arg2 != '$' && arg2 != '2') {
						return 0;
					}
					return 1;
				}
				if (arg1 == 't') {
					if (arg2 != '7' && arg2 != '+') {
						return 0;
					}
					return 1;
				}
				if (arg1 == 'u') {
					if (arg2 == 'v') {
						return 1;
					}
					if ((arg2 != '\\' || arg0 != '/') && (arg2 != '\\' || arg0 != '|') && (arg2 != '|' || arg0 != '/')) {
						return 0;
					}
					return 2;
				}
				if (arg1 == 'v') {
					if ((arg2 != '\\' || arg0 != '/') && (arg2 != '\\' || arg0 != '|') && (arg2 != '|' || arg0 != '/')) {
						return 0;
					}
					return 2;
				}
				if (arg1 == 'w') {
					if (arg2 == 'v' && arg0 == 'v') {
						return 2;
					}
					return 0;
				}
				if (arg1 == 'x') {
					if ((arg2 != ')' || arg0 != '(') && (arg2 != '}' || arg0 != '{') && (arg2 != ']' || arg0 != '[') && (arg2 != '>' || arg0 != '<')) {
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
					if (arg2 == 'o' || arg2 == 'O') {
						return 1;
					} else if ((arg2 != '(' || arg0 != ')') && (arg2 != '{' || arg0 != '}') && (arg2 != '[' || arg0 != ']')) {
						return 0;
					} else {
						return 2;
					}
				} else if (arg1 == '1') {
					return arg2 == 'l' ? 1 : 0;
				} else {
					return 0;
				}
			} else if (arg1 == ',') {
				return arg2 == '.' ? 1 : 0;
			} else if (arg1 == '.') {
				return arg2 == ',' ? 1 : 0;
			} else if (arg1 == '!') {
				return arg2 == 'i' ? 1 : 0;
			} else {
				return 0;
			}
		} catch (@Pc(512) RuntimeException local512) {
			signlink.reporterror("64547, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + local512.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PSDABLUV", name = "a", descriptor = "(IC)B")
	private static byte method304(@OriginalArg(1) char arg0) {
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
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("47292, " + -365 + ", " + arg0 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PSDABLUV", name = "c", descriptor = "(Z[C)V")
	private static void method305(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			@Pc(17) int local17 = 0;
			while (true) {
				do {
					@Pc(116) int local116;
					if ((local116 = method306(arg0, local5)) == -1) {
						return;
					}
					@Pc(21) boolean local21 = false;
					for (@Pc(23) int local23 = local5; local23 >= 0 && local23 < local116 && !local21; local23++) {
						if (!method308(arg0[local23], 922) && !method309(arg0[local23], anInt440)) {
							local21 = true;
						}
					}
					if (local21) {
						local7 = 0;
					}
					if (local7 == 0) {
						local17 = local116;
					}
					local5 = method307(arg0, local116, aBoolean117);
					@Pc(62) int local62 = 0;
					for (@Pc(64) int local64 = local116; local64 < local5; local64++) {
						local62 = local62 * 10 + arg0[local64] - 48;
					}
					if (local62 <= 255 && local5 - local116 <= 8) {
						local7++;
					} else {
						local7 = 0;
					}
				} while (local7 != 4);
				for (@Pc(98) int local98 = local17; local98 < local5; local98++) {
					arg0[local98] = '*';
				}
				local7 = 0;
			}
		} catch (@Pc(120) RuntimeException local120) {
			signlink.reporterror("44324, " + true + ", " + arg0 + ", " + local120.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PSDABLUV", name = "a", descriptor = "([CII)I")
	private static int method306(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1) {
		try {
			for (@Pc(6) int local6 = arg1; local6 < arg0.length && local6 >= 0; local6++) {
				if (arg0[local6] >= '0' && arg0[local6] <= '9') {
					return local6;
				}
			}
			return -1;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("98432, " + arg0 + ", " + arg1 + ", " + 1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PSDABLUV", name = "a", descriptor = "([CIZ)I")
	private static int method307(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		try {
			if (!arg2) {
				return anInt437;
			}
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
			signlink.reporterror("19586, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PSDABLUV", name = "a", descriptor = "(CI)Z")
	private static boolean method308(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			return !method310(arg0) && !method311(arg0);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("42186, " + arg0 + ", " + arg1 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PSDABLUV", name = "b", descriptor = "(CI)Z")
	private static boolean method309(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 != 9) {
				throw new NullPointerException();
			} else if (arg0 >= 'a' && arg0 <= 'z') {
				return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
			} else {
				return true;
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("62011, " + arg0 + ", " + arg1 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PSDABLUV", name = "b", descriptor = "(ZC)Z")
	private static boolean method310(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("65816, " + false + ", " + arg0 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PSDABLUV", name = "a", descriptor = "(CB)Z")
	private static boolean method311(@OriginalArg(0) char arg0) {
		try {
			if (aByte12 != -104) {
				for (@Pc(4) int local4 = 1; local4 > 0; local4++) {
				}
			}
			return arg0 >= '0' && arg0 <= '9';
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("73626, " + arg0 + ", " + -104 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PSDABLUV", name = "b", descriptor = "(IC)Z")
	private static boolean method312(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z';
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("51570, " + 0 + ", " + arg0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PSDABLUV", name = "a", descriptor = "(BC)Z")
	private static boolean method313(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("40794, " + -71 + ", " + arg0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PSDABLUV", name = "d", descriptor = "(Z[C)Z")
	private static boolean method314(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				if (!method311(arg0[local5]) && arg0[local5] != '\u0000') {
					local3 = false;
				}
			}
			if (local3) {
				return true;
			}
			@Pc(41) int local41 = method315(arg0);
			@Pc(43) int local43 = 0;
			@Pc(48) int local48 = anIntArray102.length - 1;
			if (local41 == anIntArray102[0] || local41 == anIntArray102[local48]) {
				return true;
			}
			do {
				@Pc(66) int local66 = (local43 + local48) / 2;
				if (local41 == anIntArray102[local66]) {
					return true;
				}
				if (local41 < anIntArray102[local66]) {
					local48 = local66;
				} else {
					local43 = local66;
				}
			} while (local43 != local48 && local43 + 1 != local48);
			return false;
		} catch (@Pc(95) RuntimeException local95) {
			signlink.reporterror("3098, " + false + ", " + arg0 + ", " + local95.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PSDABLUV", name = "a", descriptor = "([CB)I")
	private static int method315(@OriginalArg(0) char[] arg0) {
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
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("66056, " + arg0 + ", " + 60 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}
}
