import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!tc")
public final class Class44 {

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "Z")
	private static boolean aBoolean221;

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
	private static int anInt951;

	@OriginalMember(owner = "client!tc", name = "j", descriptor = "[I")
	private static int[] anIntArray266;

	@OriginalMember(owner = "client!tc", name = "k", descriptor = "[[C")
	private static char[][] aCharArrayArray1;

	@OriginalMember(owner = "client!tc", name = "l", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!tc", name = "m", descriptor = "[[C")
	private static char[][] aCharArrayArray2;

	@OriginalMember(owner = "client!tc", name = "n", descriptor = "[[C")
	private static char[][] aCharArrayArray3;

	@OriginalMember(owner = "client!tc", name = "o", descriptor = "[I")
	private static int[] anIntArray267;

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "Z")
	private static boolean aBoolean222 = true;

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "Z")
	private static boolean aBoolean223 = true;

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "B")
	private static byte aByte37 = 1;

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
	private static int anInt952 = 47689;

	@OriginalMember(owner = "client!tc", name = "g", descriptor = "B")
	private static byte aByte38 = 9;

	@OriginalMember(owner = "client!tc", name = "h", descriptor = "B")
	private static byte aByte39 = 9;

	@OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
	private static int anInt953 = -32251;

	@OriginalMember(owner = "client!tc", name = "p", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray13 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq" };

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!yb;)V")
	public static void method619(@OriginalArg(0) Class48 arg0) {
		@Pc(10) Class1_Sub1_Sub3 local10 = new Class1_Sub1_Sub3(arg0.method689("fragmentsenc.txt", null), true);
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(arg0.method689("badenc.txt", null), true);
		@Pc(28) Class1_Sub1_Sub3 local28 = new Class1_Sub1_Sub3(arg0.method689("domainenc.txt", null), true);
		@Pc(37) Class1_Sub1_Sub3 local37 = new Class1_Sub1_Sub3(arg0.method689("tldlist.txt", null), true);
		method620(local10, local19, local28, local37);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!mb;Lclient!mb;Lclient!mb;Lclient!mb;)V")
	private static void method620(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) Class1_Sub1_Sub3 arg2, @OriginalArg(3) Class1_Sub1_Sub3 arg3) {
		method622(arg1);
		method623(aByte37, arg2);
		method624(arg0);
		method621(arg3);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(BLclient!mb;)V")
	private static void method621(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(4) int local4 = arg0.method508();
			aCharArrayArray3 = new char[local4][];
			anIntArray267 = new int[local4];
			for (@Pc(12) int local12 = 0; local12 < local4; local12++) {
				anIntArray267[local12] = arg0.method503();
				@Pc(23) char[] local23 = new char[arg0.method503()];
				for (@Pc(25) int local25 = 0; local25 < local23.length; local25++) {
					local23[local25] = (char) arg0.method503();
				}
				aCharArrayArray3[local12] = local23;
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("35730, " + 97 + ", " + arg0 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!mb;Z)V")
	private static void method622(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(2) int local2 = arg0.method508();
			aCharArrayArray1 = new char[local2][];
			aByteArrayArrayArray8 = new byte[local2][][];
			method625(aByteArrayArrayArray8, arg0, aCharArrayArray1);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("41886, " + arg0 + ", " + false + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(BLclient!mb;)V")
	private static void method623(@OriginalArg(0) byte arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			@Pc(2) int local2 = arg1.method508();
			aCharArrayArray2 = new char[local2][];
			if (arg0 == 1) {
				method626(arg1, aCharArrayArray2, aByte38);
			}
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("33327, " + arg0 + ", " + arg1 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!mb;I)V")
	private static void method624(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			anIntArray266 = new int[arg0.method508()];
			for (@Pc(8) int local8 = 0; local8 < anIntArray266.length; local8++) {
				anIntArray266[local8] = arg0.method505();
			}
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("92341, " + arg0 + ", " + 0 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "([[[BLclient!mb;[[CI)V")
	private static void method625(@OriginalArg(0) byte[][][] arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) char[][] arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < arg2.length; local3++) {
				@Pc(9) char[] local9 = new char[arg1.method503()];
				for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
					local9[local11] = (char) arg1.method503();
				}
				arg2[local3] = local9;
				@Pc(33) byte[][] local33 = new byte[arg1.method503()][2];
				for (@Pc(35) int local35 = 0; local35 < local33.length; local35++) {
					local33[local35][0] = (byte) arg1.method503();
					local33[local35][1] = (byte) arg1.method503();
				}
				if (local33.length > 0) {
					arg0[local3] = local33;
				}
			}
			if (anInt952 != 47689) {
				for (@Pc(75) int local75 = 1; local75 > 0; local75++) {
				}
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("15585, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 47689 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!mb;[[CB)V")
	private static void method626(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) char[][] arg1, @OriginalArg(2) byte arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
				@Pc(9) char[] local9 = new char[arg0.method503()];
				for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
					local9[local11] = (char) arg0.method503();
				}
				arg1[local3] = local9;
			}
			if (arg2 == 9) {
				;
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("52890, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "([CB)V")
	private static void method627(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(6) int local6 = 0;
			for (@Pc(8) int local8 = 0; local8 < arg0.length; local8++) {
				if (method628(arg0[local8])) {
					arg0[local6] = arg0[local8];
				} else {
					arg0[local6] = ' ';
				}
				if (local6 == 0 || arg0[local6] != ' ' || arg0[local6 - 1] != ' ') {
					local6++;
				}
			}
			for (@Pc(50) int local50 = local6; local50 < arg0.length; local50++) {
				arg0[local50] = ' ';
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("13676, " + arg0 + ", " + 0 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(CI)Z")
	private static boolean method628(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= ' ' && arg0 <= '\u007f' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("1041, " + arg0 + ", " + 0 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method629(@OriginalArg(1) String arg0) {
		try {
			@Pc(3) long local3 = System.currentTimeMillis();
			@Pc(6) char[] local6 = arg0.toCharArray();
			method627(local6);
			@Pc(15) String local15 = (new String(local6)).trim();
			@Pc(19) char[] local19 = local15.toLowerCase().toCharArray();
			@Pc(38) String local38 = local15.toLowerCase();
			method637(local19);
			method632(local19);
			method633(local19);
			method646(112, local19);
			for (@Pc(52) int local52 = 0; local52 < aStringArray13.length; local52++) {
				@Pc(56) int local56 = -1;
				while ((local56 = local38.indexOf(aStringArray13[local52], local56 + 1)) != -1) {
					@Pc(63) char[] local63 = aStringArray13[local52].toCharArray();
					for (@Pc(65) int local65 = 0; local65 < local63.length; local65++) {
						local19[local65 + local56] = local63[local65];
					}
				}
			}
			method630(local19, local15.toCharArray());
			method631(local19);
			@Pc(107) long local107 = System.currentTimeMillis();
			return (new String(local19)).trim();
		} catch (@Pc(114) RuntimeException local114) {
			signlink.reporterror("29536, " + -1 + ", " + arg0 + ", " + local114.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "([CI[C)V")
	private static void method630(@OriginalArg(0) char[] arg0, @OriginalArg(2) char[] arg1) {
		try {
			for (@Pc(1) int local1 = 0; local1 < arg1.length; local1++) {
				if (arg0[local1] != '*' && method654(arg1[local1])) {
					arg0[local1] = arg1[local1];
				}
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("2561, " + arg0 + ", " + 5 + ", " + arg1 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I[C)V")
	private static void method631(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(16) int local16 = 0; local16 < arg0.length; local16++) {
				@Pc(22) char local22 = arg0[local16];
				if (!method651(681, local22)) {
					local3 = true;
				} else if (local3) {
					if (method653(local22)) {
						local3 = false;
					}
				} else if (method654(local22)) {
					arg0[local16] = (char) (local22 + 'a' - 65);
				}
			}
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("3997, " + -351 + ", " + arg0 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(B[C)V")
	private static void method632(@OriginalArg(1) char[] arg0) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 2; local3++) {
				for (@Pc(10) int local10 = aCharArrayArray1.length - 1; local10 >= 0; local10--) {
					method641(aByteArrayArrayArray8[local10], aCharArrayArray1[local10], arg0);
				}
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("12555, " + -116 + ", " + arg0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Z[C)V")
	private static void method633(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(18) char[] local18 = new char[] { '(', 'a', ')' };
			method641(null, local18, local3);
			@Pc(27) char[] local27 = (char[]) arg0.clone();
			@Pc(42) char[] local42 = new char[] { 'd', 'o', 't' };
			method641(null, local42, local27);
			for (@Pc(56) int local56 = aCharArrayArray2.length - 1; local56 >= 0; local56--) {
				method634(aCharArrayArray2[local56], arg0, local3, local27);
			}
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("85128, " + false + ", " + arg0 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "([C[C[C[CZ)V")
	private static void method634(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) char[] arg3) {
		try {
			if (arg0.length <= arg1.length) {
				@Pc(27) int local27;
				for (@Pc(19) int local19 = 0; local19 <= arg1.length - arg0.length; local19 += local27) {
					@Pc(23) int local23 = local19;
					@Pc(25) int local25 = 0;
					local27 = 1;
					label58: while (true) {
						while (true) {
							if (local23 >= arg1.length) {
								break label58;
							}
							@Pc(35) char local35 = arg1[local23];
							@Pc(37) char local37 = 0;
							if (local23 + 1 < arg1.length) {
								local37 = arg1[local23 + 1];
							}
							@Pc(62) int local62;
							if (local25 < arg0.length && (local62 = method643(local35, local37, arg0[local25])) > 0) {
								local23 += local62;
								local25++;
							} else {
								if (local25 == 0) {
									break label58;
								}
								@Pc(83) int local83;
								if ((local83 = method643(local35, local37, arg0[local25 - 1])) > 0) {
									local23 += local83;
									if (local25 == 1) {
										local27++;
									}
								} else {
									if (local25 >= arg0.length || !method649(local35)) {
										break label58;
									}
									local23++;
								}
							}
						}
					}
					if (local25 >= arg0.length) {
						@Pc(114) boolean local114 = false;
						@Pc(120) int local120 = method635(arg2, local19, arg1);
						@Pc(128) int local128 = method636(local23 - 1, arg1, arg3);
						if (local120 > 2 || local128 > 2) {
							local114 = true;
						}
						if (local114) {
							for (@Pc(140) int local140 = local19; local140 < local23; local140++) {
								arg1[local140] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(163) RuntimeException local163) {
			signlink.reporterror("52418, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + true + ", " + local163.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "([CZI[C)I")
	private static int method635(@OriginalArg(0) char[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg1 == 0) {
				return 2;
			}
			for (@Pc(13) int local13 = arg1 - 1; local13 >= 0 && method649(arg2[local13]); local13--) {
				if (arg2[local13] == '@') {
					return 3;
				}
			}
			@Pc(33) int local33 = 0;
			for (@Pc(37) int local37 = arg1 - 1; local37 >= 0 && method649(arg0[local37]); local37--) {
				if (arg0[local37] == '*') {
					local33++;
				}
			}
			if (local33 >= 3) {
				return 4;
			} else if (method649(arg2[arg1 - 1])) {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("18451, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I[C[CZ)I")
	private static int method636(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2) {
		try {
			if (arg0 + 1 == arg1.length) {
				return 2;
			}
			@Pc(13) int local13 = arg0 + 1;
			while (true) {
				if (local13 < arg1.length && method649(arg1[local13])) {
					if (arg1[local13] != '.' && arg1[local13] != ',') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(49) int local49 = 0;
				for (@Pc(53) int local53 = arg0 + 1; local53 < arg1.length && method649(arg2[local53]); local53++) {
					if (arg2[local53] == '*') {
						local49++;
					}
				}
				if (local49 >= 3) {
					return 4;
				}
				if (method649(arg1[arg0 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("3508, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(I[C)V")
	private static void method637(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(18) char[] local18 = new char[] { 'd', 'o', 't' };
			method641(null, local18, local3);
			@Pc(32) char[] local32 = (char[]) arg0.clone();
			@Pc(55) char[] local55 = new char[] { 's', 'l', 'a', 's', 'h' };
			method641(null, local55, local32);
			for (@Pc(62) int local62 = 0; local62 < aCharArrayArray3.length; local62++) {
				method638(local3, anIntArray267[local62], arg0, aByte39, aCharArrayArray3[local62], local32);
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("77419, " + 20382 + ", " + arg0 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "([CI[CB[C[C)V")
	private static void method638(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) char[] arg4, @OriginalArg(5) char[] arg5) {
		try {
			if (arg3 != aByte39) {
				anInt952 = 419;
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
							if (local22 < arg4.length && (local59 = method643(local32, local34, arg4[local22])) > 0) {
								local20 += local59;
								local22++;
							} else {
								if (local22 == 0) {
									break label124;
								}
								@Pc(80) int local80;
								if ((local80 = method643(local32, local34, arg4[local22 - 1])) > 0) {
									local20 += local80;
									if (local22 == 1) {
										local24++;
									}
								} else {
									if (local22 >= arg4.length || !method649(local32)) {
										break label124;
									}
									local20++;
								}
							}
						}
					}
					if (local22 >= arg4.length) {
						@Pc(111) boolean local111 = false;
						@Pc(117) int local117 = method639(arg0, local16, arg2);
						@Pc(125) int local125 = method640(arg5, arg2, local20 - 1);
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
										if (method649(arg2[local191])) {
											break;
										}
										local175 = local191;
									} else if (!method649(arg2[local191])) {
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
											if (arg5[local191] != '*') {
												break;
											}
											local179 = local191;
										} else if (arg5[local191] == '*') {
											local179 = local191;
											local187 = true;
										}
									}
								}
								local187 = false;
								for (local191 = local179 + 1; local191 < arg2.length; local191++) {
									if (local187) {
										if (method649(arg2[local191])) {
											break;
										}
										local179 = local191;
									} else if (!method649(arg2[local191])) {
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
			signlink.reporterror("22865, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local348.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "([CIB[C)I")
	private static int method639(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg1 == 0) {
				return 2;
			}
			@Pc(9) int local9 = arg1 - 1;
			while (true) {
				if (local9 >= 0 && method649(arg2[local9])) {
					if (arg2[local9] != ',' && arg2[local9] != '.') {
						local9--;
						continue;
					}
					return 3;
				}
				@Pc(39) int local39 = 0;
				for (@Pc(43) int local43 = arg1 - 1; local43 >= 0 && method649(arg0[local43]); local43--) {
					if (arg0[local43] == '*') {
						local39++;
					}
				}
				if (local39 >= 3) {
					return 4;
				}
				if (method649(arg2[arg1 - 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("57445, " + arg0 + ", " + arg1 + ", " + -39 + ", " + arg2 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Z[C[CI)I")
	private static int method640(@OriginalArg(1) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 + 1 == arg1.length) {
				return 2;
			}
			@Pc(13) int local13 = arg2 + 1;
			while (true) {
				if (local13 < arg1.length && method649(arg1[local13])) {
					if (arg1[local13] != '\\' && arg1[local13] != '/') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(40) int local40 = 0;
				for (@Pc(44) int local44 = arg2 + 1; local44 < arg1.length && method649(arg0[local44]); local44++) {
					if (arg0[local44] == '*') {
						local40++;
					}
				}
				if (local40 >= 5) {
					return 4;
				}
				if (method649(arg1[arg2 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("36497, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "([[B[CI[C)V")
	private static void method641(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(3) char[] arg2) {
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
							if (local17 < arg1.length && (local62 = method644(var13, var12, arg1[local17], (byte) 6)) > 0) {
								if (local62 == 1 && method652(var12)) {
									local25 = true;
								}
								if (local62 == 2 && (method652(var12) || method652(var13))) {
									local25 = true;
								}
								local15 += local62;
								local17++;
							} else {
								if (local17 == 0) {
									break label165;
								}
								@Pc(105) int local105;
								if ((local105 = method644(var13, var12, arg1[local17 - 1], (byte) 6)) > 0) {
									local15 += local105;
									if (local17 == 1) {
										local21++;
									}
								} else {
									if (local17 >= arg1.length || !method650(var12)) {
										break label165;
									}
									if (method649(var12) && var12 != '\'') {
										local23 = true;
									}
									if (method652(var12)) {
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
							if (local11 - 1 < 0 || method649(arg2[local11 - 1]) && arg2[local11 - 1] != '\'') {
								local216 = true;
							}
							if (local15 >= arg2.length || method649(arg2[local15]) && arg2[local15] != '\'') {
								local218 = true;
							}
							if (!local216 || !local218) {
								@Pc(262) boolean local262 = false;
								local266 = local11 - 2;
								if (local216) {
									local266 = local11;
								}
								while (!local262 && local266 < local15) {
									if (local266 >= 0 && (!method649(arg2[local266]) || arg2[local266] == '\'')) {
										@Pc(288) char[] local288 = new char[3];
										@Pc(290) int local290;
										for (local290 = 0; local290 < 3 && local266 + local290 < arg2.length && (!method649(arg2[local266 + local290]) || arg2[local266 + local290] == '\''); local290++) {
											local288[local290] = arg2[local266 + local290];
										}
										@Pc(328) boolean local328 = true;
										if (local290 == 0) {
											local328 = false;
										}
										if (local290 < 3 && local266 - 1 >= 0 && (!method649(arg2[local266 - 1]) || arg2[local266 - 1] == '\'')) {
											local328 = false;
										}
										if (local328 && !method655(local288)) {
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
							@Pc(198) byte local198 = method645(var12);
							@Pc(202) byte local202 = method645(var13);
							if (arg0 != null && method642(local198, arg0, local202)) {
								local170 = false;
							}
						}
						if (local170) {
							@Pc(378) int local378 = 0;
							@Pc(380) int local380 = 0;
							@Pc(382) int local382 = -1;
							for (local266 = local11; local266 < local15; local266++) {
								if (method652(arg2[local266])) {
									local378++;
								} else if (method651(681, arg2[local266])) {
									local380++;
									local382 = local266;
								}
							}
							if (local382 > -1) {
								local378 -= local15 + 1 - local382;
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
		} catch (@Pc(459) RuntimeException local459) {
			signlink.reporterror("79873, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local459.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(BZ[[BB)Z")
	private static boolean method642(@OriginalArg(0) byte arg0, @OriginalArg(2) byte[][] arg1, @OriginalArg(3) byte arg2) {
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
			signlink.reporterror("19124, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + local104.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(CCCI)I")
	private static int method643(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(2) char arg2) {
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
			signlink.reporterror("57101, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 216 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(CCCB)I")
	private static int method644(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(2) char arg2, @OriginalArg(3) byte arg3) {
		try {
			@Pc(4) boolean local4 = false;
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
		} catch (@Pc(517) RuntimeException local517) {
			signlink.reporterror("61452, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local517.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(CI)B")
	private static byte method645(@OriginalArg(0) char arg0) {
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
			signlink.reporterror("34100, " + arg0 + ", " + -232 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "(I[C)V")
	private static void method646(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1) {
		try {
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			@Pc(9) int local9 = 0;
			@Pc(13) boolean local13 = false;
			while (true) {
				do {
					@Pc(112) int local112;
					if ((local112 = method647(arg1, local5)) == -1) {
						return;
					}
					@Pc(17) boolean local17 = false;
					for (@Pc(19) int local19 = local5; local19 >= 0 && local19 < local112 && !local17; local19++) {
						if (!method649(arg1[local19]) && !method650(arg1[local19])) {
							local17 = true;
						}
					}
					if (local17) {
						local7 = 0;
					}
					if (local7 == 0) {
						local9 = local112;
					}
					local5 = method648(arg1, local112);
					@Pc(58) int local58 = 0;
					for (@Pc(60) int local60 = local112; local60 < local5; local60++) {
						local58 = local58 * 10 + arg1[local60] - 48;
					}
					if (local58 <= 255 && local5 - local112 <= 8) {
						local7++;
					} else {
						local7 = 0;
					}
				} while (local7 != 4);
				for (@Pc(94) int local94 = local9; local94 < local5; local94++) {
					arg1[local94] = '*';
				}
				local7 = 0;
			}
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("18272, " + arg0 + ", " + arg1 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Z[CI)I")
	private static int method647(@OriginalArg(1) char[] arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(1) int local1 = arg1; local1 < arg0.length && local1 >= 0; local1++) {
				if (arg0[local1] >= '0' && arg0[local1] <= '9') {
					return local1;
				}
			}
			return -1;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("61857, " + true + ", " + arg0 + ", " + arg1 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "([CIZ)I")
	private static int method648(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1) {
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
			signlink.reporterror("65713, " + arg0 + ", " + arg1 + ", " + false + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IC)Z")
	private static boolean method649(@OriginalArg(1) char arg0) {
		try {
			if (anInt953 != -32251) {
				throw new NullPointerException();
			}
			return !method651(681, arg0) && !method652(arg0);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("32522, " + -32251 + ", " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(IC)Z")
	private static boolean method650(@OriginalArg(1) char arg0) {
		try {
			if (arg0 >= 'a' && arg0 <= 'z') {
				return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
			} else {
				return true;
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("96257, " + 574 + ", " + arg0 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "(IC)Z")
	private static boolean method651(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		try {
			@Pc(3) boolean local3 = false;
			return arg1 >= 'a' && arg1 <= 'z' || arg1 >= 'A' && arg1 <= 'Z';
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("45640, " + arg0 + ", " + arg1 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(CB)Z")
	private static boolean method652(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= '0' && arg0 <= '9';
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("41408, " + arg0 + ", " + 75 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(BC)Z")
	private static boolean method653(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z';
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("65776, " + -10 + ", " + arg0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "(IC)Z")
	private static boolean method654(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("66958, " + -46646 + ", " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "([CI)Z")
	private static boolean method655(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(12) int local12 = 0; local12 < arg0.length; local12++) {
				if (!method652(arg0[local12]) && arg0[local12] != '\u0000') {
					local3 = false;
				}
			}
			if (local3) {
				return true;
			}
			@Pc(39) int local39 = method656(arg0);
			@Pc(41) int local41 = 0;
			@Pc(46) int local46 = anIntArray266.length - 1;
			if (local39 == anIntArray266[0] || local39 == anIntArray266[local46]) {
				return true;
			}
			do {
				@Pc(64) int local64 = (local41 + local46) / 2;
				if (local39 == anIntArray266[local64]) {
					return true;
				}
				if (local39 < anIntArray266[local64]) {
					local46 = local64;
				} else {
					local41 = local64;
				}
			} while (local41 != local46 && local41 + 1 != local46);
			return false;
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("93526, " + arg0 + ", " + 23892 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "(I[C)I")
	private static int method656(@OriginalArg(1) char[] arg0) {
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
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("38148, " + -21 + ", " + arg0 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}
}
