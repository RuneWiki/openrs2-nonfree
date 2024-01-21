import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GSWNKABU")
public final class Class10 {

	@OriginalMember(owner = "client!GSWNKABU", name = "b", descriptor = "Z")
	private static boolean aBoolean54;

	@OriginalMember(owner = "client!GSWNKABU", name = "c", descriptor = "Z")
	private static boolean aBoolean55;

	@OriginalMember(owner = "client!GSWNKABU", name = "f", descriptor = "I")
	private static int anInt124;

	@OriginalMember(owner = "client!GSWNKABU", name = "g", descriptor = "I")
	private static int anInt125;

	@OriginalMember(owner = "client!GSWNKABU", name = "i", descriptor = "[I")
	private static int[] anIntArray20;

	@OriginalMember(owner = "client!GSWNKABU", name = "j", descriptor = "[[C")
	private static char[][] aCharArrayArray1;

	@OriginalMember(owner = "client!GSWNKABU", name = "k", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!GSWNKABU", name = "l", descriptor = "[[C")
	private static char[][] aCharArrayArray2;

	@OriginalMember(owner = "client!GSWNKABU", name = "m", descriptor = "[[C")
	private static char[][] aCharArrayArray3;

	@OriginalMember(owner = "client!GSWNKABU", name = "n", descriptor = "[I")
	private static int[] anIntArray21;

	@OriginalMember(owner = "client!GSWNKABU", name = "a", descriptor = "I")
	private static int anInt123 = 53;

	@OriginalMember(owner = "client!GSWNKABU", name = "d", descriptor = "B")
	private static byte aByte10 = 7;

	@OriginalMember(owner = "client!GSWNKABU", name = "e", descriptor = "B")
	private static byte aByte11 = -38;

	@OriginalMember(owner = "client!GSWNKABU", name = "h", descriptor = "I")
	private static int anInt126 = -4614;

	@OriginalMember(owner = "client!GSWNKABU", name = "o", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray1 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

	@OriginalMember(owner = "client!GSWNKABU", name = "a", descriptor = "(Lclient!AKPFVPPG;)V")
	public static void method147(@OriginalArg(0) Class2 arg0) {
		@Pc(10) Class4_Sub1_Sub3 local10 = new Class4_Sub1_Sub3(arg0.method7("fragmentsenc.txt", null), (byte) 3);
		@Pc(19) Class4_Sub1_Sub3 local19 = new Class4_Sub1_Sub3(arg0.method7("badenc.txt", null), (byte) 3);
		@Pc(28) Class4_Sub1_Sub3 local28 = new Class4_Sub1_Sub3(arg0.method7("domainenc.txt", null), (byte) 3);
		@Pc(37) Class4_Sub1_Sub3 local37 = new Class4_Sub1_Sub3(arg0.method7("tldlist.txt", null), (byte) 3);
		method148(local10, local19, local28, local37);
	}

	@OriginalMember(owner = "client!GSWNKABU", name = "a", descriptor = "(Lclient!FTMSICIZ;Lclient!FTMSICIZ;Lclient!FTMSICIZ;Lclient!FTMSICIZ;)V")
	private static void method148(@OriginalArg(0) Class4_Sub1_Sub3 arg0, @OriginalArg(1) Class4_Sub1_Sub3 arg1, @OriginalArg(2) Class4_Sub1_Sub3 arg2, @OriginalArg(3) Class4_Sub1_Sub3 arg3) {
		method150(arg1);
		method151(arg2);
		method152(arg0);
		method149(arg3);
	}

	@OriginalMember(owner = "client!GSWNKABU", name = "a", descriptor = "(Lclient!FTMSICIZ;I)V")
	private static void method149(@OriginalArg(0) Class4_Sub1_Sub3 arg0) {
		try {
			@Pc(9) int local9 = arg0.method107();
			aCharArrayArray3 = new char[local9][];
			anIntArray21 = new int[local9];
			for (@Pc(17) int local17 = 0; local17 < local9; local17++) {
				anIntArray21[local17] = arg0.method102();
				@Pc(28) char[] local28 = new char[arg0.method102()];
				for (@Pc(30) int local30 = 0; local30 < local28.length; local30++) {
					local28[local30] = (char) arg0.method102();
				}
				aCharArrayArray3[local17] = local28;
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("53758, " + arg0 + ", " + 48543 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GSWNKABU", name = "b", descriptor = "(Lclient!FTMSICIZ;I)V")
	private static void method150(@OriginalArg(0) Class4_Sub1_Sub3 arg0) {
		try {
			@Pc(2) int local2 = arg0.method107();
			aCharArrayArray1 = new char[local2][];
			aByteArrayArrayArray1 = new byte[local2][][];
			method153(aCharArrayArray1, arg0, aByte10, aByteArrayArrayArray1);
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("38317, " + arg0 + ", " + 71 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GSWNKABU", name = "a", descriptor = "(Lclient!FTMSICIZ;B)V")
	private static void method151(@OriginalArg(0) Class4_Sub1_Sub3 arg0) {
		try {
			@Pc(2) int local2 = arg0.method107();
			aCharArrayArray2 = new char[local2][];
			method154(arg0, aCharArrayArray2);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("21743, " + arg0 + ", " + 6 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GSWNKABU", name = "a", descriptor = "(ILclient!FTMSICIZ;)V")
	private static void method152(@OriginalArg(1) Class4_Sub1_Sub3 arg0) {
		try {
			anIntArray20 = new int[arg0.method107()];
			for (@Pc(5) int local5 = 0; local5 < anIntArray20.length; local5++) {
				anIntArray20[local5] = arg0.method104();
			}
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("80004, " + 0 + ", " + arg0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GSWNKABU", name = "a", descriptor = "([[CLclient!FTMSICIZ;B[[[B)V")
	private static void method153(@OriginalArg(0) char[][] arg0, @OriginalArg(1) Class4_Sub1_Sub3 arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) byte[][][] arg3) {
		try {
			if (arg2 != 7) {
				anInt123 = -242;
			}
			for (@Pc(8) int local8 = 0; local8 < arg0.length; local8++) {
				@Pc(14) char[] local14 = new char[arg1.method102()];
				for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
					local14[local16] = (char) arg1.method102();
				}
				arg0[local8] = local14;
				@Pc(38) byte[][] local38 = new byte[arg1.method102()][2];
				for (@Pc(40) int local40 = 0; local40 < local38.length; local40++) {
					local38[local40][0] = (byte) arg1.method102();
					local38[local40][1] = (byte) arg1.method102();
				}
				if (local38.length > 0) {
					arg3[local8] = local38;
				}
			}
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("84598, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GSWNKABU", name = "a", descriptor = "(BLclient!FTMSICIZ;[[C)V")
	private static void method154(@OriginalArg(1) Class4_Sub1_Sub3 arg0, @OriginalArg(2) char[][] arg1) {
		try {
			if (aByte11 != -38) {
				aBoolean55 = !aBoolean55;
			}
			for (@Pc(12) int local12 = 0; local12 < arg1.length; local12++) {
				@Pc(18) char[] local18 = new char[arg0.method102()];
				for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
					local18[local20] = (char) arg0.method102();
				}
				arg1[local12] = local18;
			}
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("710, " + -38 + ", " + arg0 + ", " + arg1 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GSWNKABU", name = "a", descriptor = "(I[C)V")
	private static void method155(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1) {
		try {
			if (arg0 != 0) {
				anInt123 = 414;
			}
			@Pc(7) int local7 = 0;
			for (@Pc(9) int local9 = 0; local9 < arg1.length; local9++) {
				if (method156(arg1[local9])) {
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
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("47872, " + arg0 + ", " + arg1 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GSWNKABU", name = "a", descriptor = "(CI)Z")
	private static boolean method156(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= ' ' && arg0 <= '\u007f' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("94726, " + arg0 + ", " + 0 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GSWNKABU", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
	public static String method157(@OriginalArg(0) String arg0) {
		try {
			@Pc(3) long local3 = System.currentTimeMillis();
			@Pc(6) char[] local6 = arg0.toCharArray();
			method155(anInt124, local6);
			@Pc(15) String local15 = (new String(local6)).trim();
			@Pc(19) char[] local19 = local15.toLowerCase().toCharArray();
			@Pc(37) String local37 = local15.toLowerCase();
			method165(local19);
			method160(local19);
			method161(local19);
			method174(local19);
			for (@Pc(51) int local51 = 0; local51 < aStringArray1.length; local51++) {
				@Pc(55) int local55 = -1;
				while ((local55 = local37.indexOf(aStringArray1[local51], local55 + 1)) != -1) {
					@Pc(62) char[] local62 = aStringArray1[local51].toCharArray();
					for (@Pc(64) int local64 = 0; local64 < local62.length; local64++) {
						local19[local64 + local55] = local62[local64];
					}
				}
			}
			method158(local15.toCharArray(), local19);
			method159(local19);
			@Pc(106) long local106 = System.currentTimeMillis();
			return (new String(local19)).trim();
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("33079, " + arg0 + ", " + true + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GSWNKABU", name = "a", descriptor = "([C[CI)V")
	private static void method158(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
				if (arg1[local3] != '*' && method182(arg0[local3])) {
					arg1[local3] = arg0[local3];
				}
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("37091, " + arg0 + ", " + arg1 + ", " + 611 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GSWNKABU", name = "a", descriptor = "([CB)V")
	private static void method159(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(13) boolean local13 = true;
			for (@Pc(15) int local15 = 0; local15 < arg0.length; local15++) {
				@Pc(21) char local21 = arg0[local15];
				if (!method179(local21)) {
					local13 = true;
				} else if (local13) {
					if (method181(local21)) {
						local13 = false;
					}
				} else if (method182(local21)) {
					arg0[local15] = (char) (local21 + 'a' - 65);
				}
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("57517, " + arg0 + ", " + -97 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GSWNKABU", name = "a", descriptor = "(Z[C)V")
	private static void method160(@OriginalArg(1) char[] arg0) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 2; local3++) {
				for (@Pc(10) int local10 = aCharArrayArray1.length - 1; local10 >= 0; local10--) {
					method169(arg0, aCharArrayArray1[local10], aByteArrayArrayArray1[local10]);
				}
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("4736, " + false + ", " + arg0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GSWNKABU", name = "b", descriptor = "(Z[C)V")
	private static void method161(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(18) char[] local18 = new char[] { '(', 'a', ')' };
			method169(local3, local18, null);
			@Pc(27) char[] local27 = (char[]) arg0.clone();
			@Pc(42) char[] local42 = new char[] { 'd', 'o', 't' };
			method169(local27, local42, null);
			for (@Pc(60) int local60 = aCharArrayArray2.length - 1; local60 >= 0; local60--) {
				method162(local27, aCharArrayArray2[local60], local3, arg0);
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("90966, " + false + ", " + arg0 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GSWNKABU", name = "a", descriptor = "([CB[C[C[C)V")
	private static void method162(@OriginalArg(0) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2, @OriginalArg(4) char[] arg3) {
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
							if (local21 < arg1.length && (local58 = method171(344, arg1[local21], local31, local33)) > 0) {
								local19 += local58;
								local21++;
							} else {
								if (local21 == 0) {
									break label58;
								}
								@Pc(79) int local79;
								if ((local79 = method171(344, arg1[local21 - 1], local31, local33)) > 0) {
									local19 += local79;
									if (local21 == 1) {
										local23++;
									}
								} else {
									if (local21 >= arg1.length || !method177(local31)) {
										break label58;
									}
									local19++;
								}
							}
						}
					}
					if (local21 >= arg1.length) {
						@Pc(110) boolean local110 = false;
						@Pc(116) int local116 = method163(local15, arg3, arg2);
						@Pc(124) int local124 = method164(arg0, local19 - 1, arg3);
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
			signlink.reporterror("39591, " + arg0 + ", " + -17 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GSWNKABU", name = "a", descriptor = "(I[CI[C)I")
	private static int method163(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg0 == 0) {
				return 2;
			}
			for (@Pc(9) int local9 = arg0 - 1; local9 >= 0 && method177(arg1[local9]); local9--) {
				if (arg1[local9] == '@') {
					return 3;
				}
			}
			@Pc(29) int local29 = 0;
			for (@Pc(33) int local33 = arg0 - 1; local33 >= 0 && method177(arg2[local33]); local33--) {
				if (arg2[local33] == '*') {
					local29++;
				}
			}
			if (anInt126 != -4614) {
				aBoolean54 = !aBoolean54;
			}
			if (local29 >= 3) {
				return 4;
			} else if (method177(arg1[arg0 - 1])) {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("52845, " + arg0 + ", " + arg1 + ", " + -4614 + ", " + arg2 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GSWNKABU", name = "a", descriptor = "(B[CI[C)I")
	private static int method164(@OriginalArg(1) char[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg1 + 1 == arg2.length) {
				return 2;
			}
			@Pc(23) int local23 = arg1 + 1;
			while (true) {
				if (local23 < arg2.length && method177(arg2[local23])) {
					if (arg2[local23] != '.' && arg2[local23] != ',') {
						local23++;
						continue;
					}
					return 3;
				}
				@Pc(50) int local50 = 0;
				for (@Pc(54) int local54 = arg1 + 1; local54 < arg2.length && method177(arg0[local54]); local54++) {
					if (arg0[local54] == '*') {
						local50++;
					}
				}
				if (local50 >= 3) {
					return 4;
				}
				if (method177(arg2[arg1 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("65007, " + -119 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GSWNKABU", name = "b", descriptor = "(I[C)V")
	private static void method165(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(18) char[] local18 = new char[] { 'd', 'o', 't' };
			method169(local3, local18, null);
			@Pc(27) char[] local27 = (char[]) arg0.clone();
			@Pc(50) char[] local50 = new char[] { 's', 'l', 'a', 's', 'h' };
			method169(local27, local50, null);
			for (@Pc(67) int local67 = 0; local67 < aCharArrayArray3.length; local67++) {
				method166(arg0, local3, local27, aCharArrayArray3[local67], anIntArray21[local67]);
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("93673, " + 0 + ", " + arg0 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GSWNKABU", name = "a", descriptor = "([C[C[C[CBI)V")
	private static void method166(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) char[] arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg3.length <= arg0.length) {
				@Pc(29) int local29;
				for (@Pc(21) int local21 = 0; local21 <= arg0.length - arg3.length; local21 += local29) {
					@Pc(25) int local25 = local21;
					@Pc(27) int local27 = 0;
					local29 = 1;
					label120: while (true) {
						while (true) {
							if (local25 >= arg0.length) {
								break label120;
							}
							@Pc(37) char local37 = arg0[local25];
							@Pc(39) char local39 = 0;
							if (local25 + 1 < arg0.length) {
								local39 = arg0[local25 + 1];
							}
							@Pc(64) int local64;
							if (local27 < arg3.length && (local64 = method171(344, arg3[local27], local37, local39)) > 0) {
								local25 += local64;
								local27++;
							} else {
								if (local27 == 0) {
									break label120;
								}
								@Pc(85) int local85;
								if ((local85 = method171(344, arg3[local27 - 1], local37, local39)) > 0) {
									local25 += local85;
									if (local27 == 1) {
										local29++;
									}
								} else {
									if (local27 >= arg3.length || !method177(local37)) {
										break label120;
									}
									local25++;
								}
							}
						}
					}
					if (local27 >= arg3.length) {
						@Pc(116) boolean local116 = false;
						@Pc(122) int local122 = method167(arg0, local21, arg1);
						@Pc(130) int local130 = method168(arg2, local25 - 1, arg0);
						if (arg4 == 1 && local122 > 0 && local130 > 0) {
							local116 = true;
						}
						if (arg4 == 2 && (local122 > 2 && local130 > 0 || local122 > 0 && local130 > 2)) {
							local116 = true;
						}
						if (arg4 == 3 && local122 > 0 && local130 > 2) {
							local116 = true;
						}
						@Pc(173) boolean local173;
						if (arg4 == 3 && local122 > 2 && local130 > 0) {
							local173 = true;
						} else {
							local173 = false;
						}
						if (local116) {
							@Pc(180) int local180 = local21;
							@Pc(184) int local184 = local25 - 1;
							@Pc(192) boolean local192;
							@Pc(196) int local196;
							if (local122 > 2) {
								if (local122 == 4) {
									local192 = false;
									for (local196 = local21 - 1; local196 >= 0; local196--) {
										if (local192) {
											if (arg1[local196] != '*') {
												break;
											}
											local180 = local196;
										} else if (arg1[local196] == '*') {
											local180 = local196;
											local192 = true;
										}
									}
								}
								local192 = false;
								for (local196 = local180 - 1; local196 >= 0; local196--) {
									if (local192) {
										if (method177(arg0[local196])) {
											break;
										}
										local180 = local196;
									} else if (!method177(arg0[local196])) {
										local192 = true;
										local180 = local196;
									}
								}
							}
							if (local130 > 2) {
								if (local130 == 4) {
									local192 = false;
									for (local196 = local184 + 1; local196 < arg0.length; local196++) {
										if (local192) {
											if (arg2[local196] != '*') {
												break;
											}
											local184 = local196;
										} else if (arg2[local196] == '*') {
											local184 = local196;
											local192 = true;
										}
									}
								}
								local192 = false;
								for (local196 = local184 + 1; local196 < arg0.length; local196++) {
									if (local192) {
										if (method177(arg0[local196])) {
											break;
										}
										local184 = local196;
									} else if (!method177(arg0[local196])) {
										local192 = true;
										local184 = local196;
									}
								}
							}
							for (@Pc(330) int local330 = local180; local330 <= local184; local330++) {
								arg0[local330] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(353) RuntimeException local353) {
			signlink.reporterror("21130, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 2 + ", " + arg4 + ", " + local353.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GSWNKABU", name = "a", descriptor = "([CII[C)I")
	private static int method167(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg1 == 0) {
				return 2;
			}
			@Pc(9) int local9 = arg1 - 1;
			while (true) {
				if (local9 >= 0 && method177(arg0[local9])) {
					if (arg0[local9] != ',' && arg0[local9] != '.') {
						local9--;
						continue;
					}
					return 3;
				}
				@Pc(38) int local38 = 0;
				for (@Pc(42) int local42 = arg1 - 1; local42 >= 0 && method177(arg2[local42]); local42--) {
					if (arg2[local42] == '*') {
						local38++;
					}
				}
				if (local38 >= 3) {
					return 4;
				}
				if (method177(arg0[arg1 - 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("88956, " + arg0 + ", " + arg1 + ", " + -654 + ", " + arg2 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GSWNKABU", name = "a", descriptor = "([CI[CZ)I")
	private static int method168(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) char[] arg2) {
		try {
			if (arg1 + 1 == arg2.length) {
				return 2;
			}
			@Pc(13) int local13 = arg1 + 1;
			while (true) {
				if (local13 < arg2.length && method177(arg2[local13])) {
					if (arg2[local13] != '\\' && arg2[local13] != '/') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(40) int local40 = 0;
				for (@Pc(52) int local52 = arg1 + 1; local52 < arg2.length && method177(arg0[local52]); local52++) {
					if (arg0[local52] == '*') {
						local40++;
					}
				}
				if (local40 >= 5) {
					return 4;
				}
				if (method177(arg2[arg1 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("39949, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GSWNKABU", name = "a", descriptor = "([C[CI[[B)V")
	private static void method169(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(3) byte[][] arg2) {
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
							if (local25 < arg1.length && (local70 = method172(var13, var12, arg1[local25])) > 0) {
								if (local70 == 1 && method180(var12)) {
									local33 = true;
								}
								if (local70 == 2 && (method180(var12) || method180(var13))) {
									local33 = true;
								}
								local23 += local70;
								local25++;
							} else {
								if (local25 == 0) {
									break label164;
								}
								@Pc(113) int local113;
								if ((local113 = method172(var13, var12, arg1[local25 - 1])) > 0) {
									local23 += local113;
									if (local25 == 1) {
										local29++;
									}
								} else {
									if (local25 >= arg1.length || !method178(var12)) {
										break label164;
									}
									if (method177(var12) && var12 != '\'') {
										local31 = true;
									}
									if (method180(var12)) {
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
							if (local19 - 1 < 0 || method177(arg0[local19 - 1]) && arg0[local19 - 1] != '\'') {
								local224 = true;
							}
							if (local23 >= arg0.length || method177(arg0[local23]) && arg0[local23] != '\'') {
								local226 = true;
							}
							if (!local224 || !local226) {
								@Pc(270) boolean local270 = false;
								local274 = local19 - 2;
								if (local224) {
									local274 = local19;
								}
								while (!local270 && local274 < local23) {
									if (local274 >= 0 && (!method177(arg0[local274]) || arg0[local274] == '\'')) {
										@Pc(296) char[] local296 = new char[3];
										@Pc(298) int local298;
										for (local298 = 0; local298 < 3 && local274 + local298 < arg0.length && (!method177(arg0[local274 + local298]) || arg0[local274 + local298] == '\''); local298++) {
											local296[local298] = arg0[local274 + local298];
										}
										@Pc(336) boolean local336 = true;
										if (local298 == 0) {
											local336 = false;
										}
										if (local298 < 3 && local274 - 1 >= 0 && (!method177(arg0[local274 - 1]) || arg0[local274 - 1] == '\'')) {
											local336 = false;
										}
										if (local336 && !method183(local296)) {
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
							@Pc(206) byte local206 = method173(var12);
							@Pc(210) byte local210 = method173(var13);
							if (arg2 != null && method170(local210, arg2, local206)) {
								local178 = false;
							}
						}
						if (local178) {
							@Pc(386) int local386 = 0;
							@Pc(388) int local388 = 0;
							@Pc(390) int local390 = -1;
							for (local274 = local19; local274 < local23; local274++) {
								if (method180(arg0[local274])) {
									local386++;
								} else if (method179(arg0[local274])) {
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
			signlink.reporterror("59545, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local459.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GSWNKABU", name = "a", descriptor = "(IB[[BB)Z")
	private static boolean method170(@OriginalArg(1) byte arg0, @OriginalArg(2) byte[][] arg1, @OriginalArg(3) byte arg2) {
		try {
			@Pc(1) int local1 = 0;
			if (arg1[0][0] == arg2 && arg1[0][1] == arg0) {
				return true;
			}
			@Pc(22) int local22 = arg1.length - 1;
			if (arg1[local22][0] == arg2 && arg1[local22][1] == arg0) {
				return true;
			}
			do {
				@Pc(53) int local53 = (local1 + local22) / 2;
				if (arg1[local53][0] == arg2 && arg1[local53][1] == arg0) {
					return true;
				}
				if (arg2 < arg1[local53][0] || arg2 == arg1[local53][0] && arg0 < arg1[local53][1]) {
					local22 = local53;
				} else {
					local1 = local53;
				}
			} while (local1 != local22 && local1 + 1 != local22);
			return false;
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("59488, " + -14002 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GSWNKABU", name = "a", descriptor = "(ICCC)I")
	private static int method171(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1, @OriginalArg(2) char arg2, @OriginalArg(3) char arg3) {
		try {
			@Pc(3) boolean local3 = false;
			if (arg1 == arg2) {
				return 1;
			} else if (arg1 == 'o' && arg2 == '0') {
				return 1;
			} else if (arg1 == 'o' && arg2 == '(' && arg3 == ')') {
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
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("52267, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GSWNKABU", name = "a", descriptor = "(CCIC)I")
	private static int method172(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(3) char arg2) {
		try {
			if (arg2 == arg1) {
				return 1;
			}
			if (arg2 >= 'a' && arg2 <= 'm') {
				if (arg2 == 'a') {
					if (arg1 != '4' && arg1 != '@' && arg1 != '^') {
						if (arg1 == '/' && arg0 == '\\') {
							return 2;
						}
						return 0;
					}
					return 1;
				}
				if (arg2 == 'b') {
					if (arg1 != '6' && arg1 != '8') {
						if ((arg1 != '1' || arg0 != '3') && (arg1 != 'i' || arg0 != '3')) {
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
					if ((arg1 != '[' || arg0 != ')') && (arg1 != 'i' || arg0 != ')')) {
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
					if (arg1 == 'p' && arg0 == 'h') {
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
						if ((arg1 != '(' || arg0 != ')') && (arg1 != '[' || arg0 != ']') && (arg1 != '{' || arg0 != '}') && (arg1 != '<' || arg0 != '>')) {
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
					if ((arg1 != '\\' || arg0 != '/') && (arg1 != '\\' || arg0 != '|') && (arg1 != '|' || arg0 != '/')) {
						return 0;
					}
					return 2;
				}
				if (arg2 == 'v') {
					if ((arg1 != '\\' || arg0 != '/') && (arg1 != '\\' || arg0 != '|') && (arg1 != '|' || arg0 != '/')) {
						return 0;
					}
					return 2;
				}
				if (arg2 == 'w') {
					if (arg1 == 'v' && arg0 == 'v') {
						return 2;
					}
					return 0;
				}
				if (arg2 == 'x') {
					if ((arg1 != ')' || arg0 != '(') && (arg1 != '}' || arg0 != '{') && (arg1 != ']' || arg0 != '[') && (arg1 != '>' || arg0 != '<')) {
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
					} else if ((arg1 != '(' || arg0 != ')') && (arg1 != '{' || arg0 != '}') && (arg1 != '[' || arg0 != ']')) {
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
		} catch (@Pc(512) RuntimeException local512) {
			signlink.reporterror("84603, " + arg0 + ", " + arg1 + ", " + 132 + ", " + arg2 + ", " + local512.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GSWNKABU", name = "a", descriptor = "(ZC)B")
	private static byte method173(@OriginalArg(1) char arg0) {
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
			signlink.reporterror("13327, " + true + ", " + arg0 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GSWNKABU", name = "c", descriptor = "(I[C)V")
	private static void method174(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			@Pc(9) int local9 = 0;
			while (true) {
				do {
					@Pc(113) int local113;
					if ((local113 = method175(local5, arg0)) == -1) {
						return;
					}
					@Pc(18) boolean local18 = false;
					for (@Pc(20) int local20 = local5; local20 >= 0 && local20 < local113 && !local18; local20++) {
						if (!method177(arg0[local20]) && !method178(arg0[local20])) {
							local18 = true;
						}
					}
					if (local18) {
						local7 = 0;
					}
					if (local7 == 0) {
						local9 = local113;
					}
					local5 = method176(arg0, local113);
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
			signlink.reporterror("79523, " + 20408 + ", " + arg0 + ", " + local117.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GSWNKABU", name = "a", descriptor = "(ZI[C)I")
	private static int method175(@OriginalArg(1) int arg0, @OriginalArg(2) char[] arg1) {
		try {
			for (@Pc(3) int local3 = arg0; local3 < arg1.length && local3 >= 0; local3++) {
				if (arg1[local3] >= '0' && arg1[local3] <= '9') {
					return local3;
				}
			}
			return -1;
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("32270, " + false + ", " + arg0 + ", " + arg1 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GSWNKABU", name = "a", descriptor = "(Z[CI)I")
	private static int method176(@OriginalArg(1) char[] arg0, @OriginalArg(2) int arg1) {
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
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("91486, " + true + ", " + arg0 + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GSWNKABU", name = "b", descriptor = "(CI)Z")
	private static boolean method177(@OriginalArg(0) char arg0) {
		try {
			return !method179(arg0) && !method180(arg0);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("19995, " + arg0 + ", " + -428 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GSWNKABU", name = "a", descriptor = "(IC)Z")
	private static boolean method178(@OriginalArg(1) char arg0) {
		try {
			if (arg0 >= 'a' && arg0 <= 'z') {
				return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
			} else {
				return true;
			}
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("21072, " + 6018 + ", " + arg0 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GSWNKABU", name = "a", descriptor = "(CZ)Z")
	private static boolean method179(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("34708, " + arg0 + ", " + true + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GSWNKABU", name = "b", descriptor = "(IC)Z")
	private static boolean method180(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= '0' && arg0 <= '9';
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("7585, " + 0 + ", " + arg0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GSWNKABU", name = "c", descriptor = "(CI)Z")
	private static boolean method181(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z';
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("53432, " + arg0 + ", " + 8717 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GSWNKABU", name = "a", descriptor = "(CB)Z")
	private static boolean method182(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("97570, " + arg0 + ", " + 9 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GSWNKABU", name = "a", descriptor = "([CZ)Z")
	private static boolean method183(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				if (!method180(arg0[local5]) && arg0[local5] != '\u0000') {
					local3 = false;
				}
			}
			if (local3) {
				return true;
			}
			@Pc(32) int local32 = method184(arg0);
			@Pc(34) int local34 = 0;
			@Pc(39) int local39 = anIntArray20.length - 1;
			if (local32 == anIntArray20[0] || local32 == anIntArray20[local39]) {
				return true;
			}
			do {
				@Pc(63) int local63 = (local34 + local39) / 2;
				if (local32 == anIntArray20[local63]) {
					return true;
				}
				if (local32 < anIntArray20[local63]) {
					local39 = local63;
				} else {
					local34 = local63;
				}
			} while (local34 != local39 && local34 + 1 != local39);
			return false;
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("69908, " + arg0 + ", " + false + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GSWNKABU", name = "b", descriptor = "([CB)I")
	private static int method184(@OriginalArg(0) char[] arg0) {
		try {
			if (arg0.length > 6) {
				return 0;
			}
			@Pc(9) int local9 = 0;
			for (@Pc(16) int local16 = 0; local16 < arg0.length; local16++) {
				@Pc(27) char local27 = arg0[arg0.length - local16 - 1];
				if (local27 >= 'a' && local27 <= 'z') {
					local9 = local9 * 38 + local27 + 1 - 'a';
				} else if (local27 == '\'') {
					local9 = local9 * 38 + 27;
				} else if (local27 >= '0' && local27 <= '9') {
					local9 = local9 * 38 + local27 + 28 - '0';
				} else if (local27 != '\u0000') {
					return 0;
				}
			}
			return local9;
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("78572, " + arg0 + ", " + 10 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}
}
