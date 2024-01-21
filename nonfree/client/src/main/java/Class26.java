import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!NGLCBGTC")
public final class Class26 {

	@OriginalMember(owner = "client!NGLCBGTC", name = "a", descriptor = "Z")
	private static boolean aBoolean109;

	@OriginalMember(owner = "client!NGLCBGTC", name = "c", descriptor = "I")
	private static int anInt374;

	@OriginalMember(owner = "client!NGLCBGTC", name = "e", descriptor = "I")
	private static int anInt376;

	@OriginalMember(owner = "client!NGLCBGTC", name = "h", descriptor = "[I")
	private static int[] anIntArray114;

	@OriginalMember(owner = "client!NGLCBGTC", name = "i", descriptor = "[[C")
	private static char[][] aCharArrayArray1;

	@OriginalMember(owner = "client!NGLCBGTC", name = "j", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!NGLCBGTC", name = "k", descriptor = "[[C")
	private static char[][] aCharArrayArray2;

	@OriginalMember(owner = "client!NGLCBGTC", name = "l", descriptor = "[[C")
	private static char[][] aCharArrayArray3;

	@OriginalMember(owner = "client!NGLCBGTC", name = "m", descriptor = "[I")
	private static int[] anIntArray115;

	@OriginalMember(owner = "client!NGLCBGTC", name = "d", descriptor = "I")
	private static int anInt375;

	@OriginalMember(owner = "client!NGLCBGTC", name = "f", descriptor = "I")
	private static int anInt377;

	@OriginalMember(owner = "client!NGLCBGTC", name = "g", descriptor = "Z")
	private static boolean aBoolean111;

	@OriginalMember(owner = "client!NGLCBGTC", name = "n", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray4;

	static {
		aBoolean110 = true;
		anInt375 = -344;
		anInt377 = 96;
		aBoolean111 = true;
		aStringArray4 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };
	}

	@OriginalMember(owner = "client!NGLCBGTC", name = "a", descriptor = "(Lclient!RSPRYUFS;)V")
	public static void method188(@OriginalArg(0) Class37 arg0) {
		@Pc(10) Class6_Sub2_Sub3 local10 = new Class6_Sub2_Sub3(-587, arg0.method358("fragmentsenc.txt", null));
		@Pc(19) Class6_Sub2_Sub3 local19 = new Class6_Sub2_Sub3(-587, arg0.method358("badenc.txt", null));
		@Pc(28) Class6_Sub2_Sub3 local28 = new Class6_Sub2_Sub3(-587, arg0.method358("domainenc.txt", null));
		@Pc(37) Class6_Sub2_Sub3 local37 = new Class6_Sub2_Sub3(-587, arg0.method358("tldlist.txt", null));
		method189(local10, local19, local28, local37);
	}

	@OriginalMember(owner = "client!NGLCBGTC", name = "a", descriptor = "(Lclient!NQUAUMDT;Lclient!NQUAUMDT;Lclient!NQUAUMDT;Lclient!NQUAUMDT;)V")
	private static void method189(@OriginalArg(0) Class6_Sub2_Sub3 arg0, @OriginalArg(1) Class6_Sub2_Sub3 arg1, @OriginalArg(2) Class6_Sub2_Sub3 arg2, @OriginalArg(3) Class6_Sub2_Sub3 arg3) {
		method191(arg1);
		method192(arg2);
		method193(arg0);
		method190(arg3);
	}

	@OriginalMember(owner = "client!NGLCBGTC", name = "a", descriptor = "(ILclient!NQUAUMDT;)V")
	private static void method190(@OriginalArg(1) Class6_Sub2_Sub3 arg0) {
		try {
			@Pc(4) int local4 = arg0.method267();
			aCharArrayArray3 = new char[local4][];
			anIntArray115 = new int[local4];
			for (@Pc(17) int local17 = 0; local17 < local4; local17++) {
				anIntArray115[local17] = arg0.method262();
				@Pc(28) char[] local28 = new char[arg0.method262()];
				for (@Pc(30) int local30 = 0; local30 < local28.length; local30++) {
					local28[local30] = (char) arg0.method262();
				}
				aCharArrayArray3[local17] = local28;
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("49122, " + -344 + ", " + arg0 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NGLCBGTC", name = "a", descriptor = "(Lclient!NQUAUMDT;I)V")
	private static void method191(@OriginalArg(0) Class6_Sub2_Sub3 arg0) {
		try {
			@Pc(2) int local2 = arg0.method267();
			aCharArrayArray1 = new char[local2][];
			aByteArrayArrayArray1 = new byte[local2][][];
			method194(arg0, aByteArrayArrayArray1, aCharArrayArray1);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("73968, " + arg0 + ", " + 542 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NGLCBGTC", name = "b", descriptor = "(Lclient!NQUAUMDT;I)V")
	private static void method192(@OriginalArg(0) Class6_Sub2_Sub3 arg0) {
		try {
			@Pc(11) int local11 = arg0.method267();
			aCharArrayArray2 = new char[local11][];
			method195(arg0, aCharArrayArray2);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("415, " + arg0 + ", " + -190 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NGLCBGTC", name = "b", descriptor = "(ILclient!NQUAUMDT;)V")
	private static void method193(@OriginalArg(1) Class6_Sub2_Sub3 arg0) {
		try {
			anIntArray114 = new int[arg0.method267()];
			for (@Pc(5) int local5 = 0; local5 < anIntArray114.length; local5++) {
				anIntArray114[local5] = arg0.method264();
			}
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("81128, " + 4 + ", " + arg0 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NGLCBGTC", name = "a", descriptor = "(ILclient!NQUAUMDT;[[[B[[C)V")
	private static void method194(@OriginalArg(1) Class6_Sub2_Sub3 arg0, @OriginalArg(2) byte[][][] arg1, @OriginalArg(3) char[][] arg2) {
		try {
			for (@Pc(7) int local7 = 0; local7 < arg2.length; local7++) {
				@Pc(13) char[] local13 = new char[arg0.method262()];
				for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
					local13[local15] = (char) arg0.method262();
				}
				arg2[local7] = local13;
				@Pc(37) byte[][] local37 = new byte[arg0.method262()][2];
				for (@Pc(39) int local39 = 0; local39 < local37.length; local39++) {
					local37[local39][0] = (byte) arg0.method262();
					local37[local39][1] = (byte) arg0.method262();
				}
				if (local37.length > 0) {
					arg1[local7] = local37;
				}
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("93329, " + -9548 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NGLCBGTC", name = "a", descriptor = "(Lclient!NQUAUMDT;I[[C)V")
	private static void method195(@OriginalArg(0) Class6_Sub2_Sub3 arg0, @OriginalArg(2) char[][] arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
				@Pc(9) char[] local9 = new char[arg0.method262()];
				for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
					local9[local11] = (char) arg0.method262();
				}
				arg1[local3] = local9;
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("81197, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NGLCBGTC", name = "a", descriptor = "([CZ)V")
	private static void method196(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) int local3 = 0;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				if (method197(arg0[local5])) {
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
			signlink.reporterror("58298, " + arg0 + ", " + true + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NGLCBGTC", name = "a", descriptor = "(CZ)Z")
	private static boolean method197(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= ' ' && arg0 <= '\u007f' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("58518, " + arg0 + ", " + false + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NGLCBGTC", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method198(@OriginalArg(1) String arg0) {
		try {
			@Pc(3) long local3 = System.currentTimeMillis();
			@Pc(15) char[] local15 = arg0.toCharArray();
			method196(local15);
			@Pc(24) String local24 = (new String(local15)).trim();
			@Pc(28) char[] local28 = local24.toLowerCase().toCharArray();
			@Pc(31) String local31 = local24.toLowerCase();
			method206(local28);
			method201(local28);
			method202(local28);
			method215(local28);
			for (@Pc(45) int local45 = 0; local45 < aStringArray4.length; local45++) {
				@Pc(55) int local55 = -1;
				while ((local55 = local31.indexOf(aStringArray4[local45], local55 + 1)) != -1) {
					@Pc(62) char[] local62 = aStringArray4[local45].toCharArray();
					for (@Pc(64) int local64 = 0; local64 < local62.length; local64++) {
						local28[local64 + local55] = local62[local64];
					}
				}
			}
			method199(local24.toCharArray(), local28);
			method200(local28);
			@Pc(106) long local106 = System.currentTimeMillis();
			return (new String(local28)).trim();
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("907, " + 21 + ", " + arg0 + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NGLCBGTC", name = "a", descriptor = "([C[CZ)V")
	private static void method199(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1) {
		try {
			for (@Pc(9) int local9 = 0; local9 < arg0.length; local9++) {
				if (arg1[local9] != '*' && method223(arg0[local9])) {
					arg1[local9] = arg0[local9];
				}
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("95022, " + arg0 + ", " + arg1 + ", " + false + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NGLCBGTC", name = "a", descriptor = "(Z[C)V")
	private static void method200(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(6) boolean local6 = true;
			for (@Pc(8) int local8 = 0; local8 < arg0.length; local8++) {
				@Pc(14) char local14 = arg0[local8];
				if (!method220((byte) 8, local14)) {
					local6 = true;
				} else if (local6) {
					if (method222(local14)) {
						local6 = false;
					}
				} else if (method223(local14)) {
					arg0[local8] = (char) (local14 + 'a' - 65);
				}
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("718, " + false + ", " + arg0 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NGLCBGTC", name = "a", descriptor = "(I[C)V")
	private static void method201(@OriginalArg(1) char[] arg0) {
		try {
			for (@Pc(6) int local6 = 0; local6 < 2; local6++) {
				for (@Pc(13) int local13 = aCharArrayArray1.length - 1; local13 >= 0; local13--) {
					method210(aCharArrayArray1[local13], aByteArrayArrayArray1[local13], arg0);
				}
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("53388, " + -645 + ", " + arg0 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NGLCBGTC", name = "a", descriptor = "([CB)V")
	private static void method202(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(22) char[] local22 = new char[] { '(', 'a', ')' };
			method210(local22, null, local3);
			@Pc(31) char[] local31 = (char[]) arg0.clone();
			@Pc(46) char[] local46 = new char[] { 'd', 'o', 't' };
			method210(local46, null, local31);
			for (@Pc(56) int local56 = aCharArrayArray2.length - 1; local56 >= 0; local56--) {
				method203(378, aCharArrayArray2[local56], arg0, local31, local3);
			}
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("87640, " + arg0 + ", " + -36 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NGLCBGTC", name = "a", descriptor = "(I[C[C[C[C)V")
	private static void method203(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) char[] arg3, @OriginalArg(4) char[] arg4) {
		try {
			@Pc(5) boolean local5 = false;
			if (arg1.length <= arg2.length) {
				@Pc(23) int local23;
				for (@Pc(15) int local15 = 0; local15 <= arg2.length - arg1.length; local15 += local23) {
					@Pc(19) int local19 = local15;
					@Pc(21) int local21 = 0;
					local23 = 1;
					label58: while (true) {
						while (true) {
							if (local19 >= arg2.length) {
								break label58;
							}
							@Pc(31) char local31 = arg2[local19];
							@Pc(33) char local33 = 0;
							if (local19 + 1 < arg2.length) {
								local33 = arg2[local19 + 1];
							}
							@Pc(58) int local58;
							if (local21 < arg1.length && (local58 = method212(local31, local33, arg1[local21])) > 0) {
								local19 += local58;
								local21++;
							} else {
								if (local21 == 0) {
									break label58;
								}
								@Pc(79) int local79;
								if ((local79 = method212(local31, local33, arg1[local21 - 1])) > 0) {
									local19 += local79;
									if (local21 == 1) {
										local23++;
									}
								} else {
									if (local21 >= arg1.length || !method218(local31)) {
										break label58;
									}
									local19++;
								}
							}
						}
					}
					if (local21 >= arg1.length) {
						@Pc(110) boolean local110 = false;
						@Pc(116) int local116 = method204(arg4, arg2, local15);
						@Pc(124) int local124 = method205(local19 - 1, arg3, arg2);
						if (local116 > 2 || local124 > 2) {
							local110 = true;
						}
						if (local110) {
							for (@Pc(136) int local136 = local15; local136 < local19; local136++) {
								arg2[local136] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("59093, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NGLCBGTC", name = "a", descriptor = "(B[C[CI)I")
	private static int method204(@OriginalArg(1) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 == 0) {
				return 2;
			}
			for (@Pc(9) int local9 = arg2 - 1; local9 >= 0 && method218(arg1[local9]); local9--) {
				if (arg1[local9] == '@') {
					return 3;
				}
			}
			@Pc(39) int local39 = 0;
			for (@Pc(43) int local43 = arg2 - 1; local43 >= 0 && method218(arg0[local43]); local43--) {
				if (arg0[local43] == '*') {
					local39++;
				}
			}
			if (local39 >= 3) {
				return 4;
			} else if (method218(arg1[arg2 - 1])) {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("38218, " + 2 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NGLCBGTC", name = "a", descriptor = "(I[C[CB)I")
	private static int method205(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2) {
		try {
			if (arg0 + 1 == arg2.length) {
				return 2;
			}
			@Pc(13) int local13 = arg0 + 1;
			while (true) {
				if (local13 < arg2.length && method218(arg2[local13])) {
					if (arg2[local13] != '.' && arg2[local13] != ',') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(40) int local40 = 0;
				for (@Pc(49) int local49 = arg0 + 1; local49 < arg2.length && method218(arg1[local49]); local49++) {
					if (arg1[local49] == '*') {
						local40++;
					}
				}
				if (local40 >= 3) {
					return 4;
				}
				if (method218(arg2[arg0 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("6077, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 7 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NGLCBGTC", name = "b", descriptor = "([CZ)V")
	private static void method206(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(18) char[] local18 = new char[] { 'd', 'o', 't' };
			method210(local18, null, local3);
			@Pc(35) char[] local35 = (char[]) arg0.clone();
			@Pc(58) char[] local58 = new char[] { 's', 'l', 'a', 's', 'h' };
			method210(local58, null, local35);
			for (@Pc(65) int local65 = 0; local65 < aCharArrayArray3.length; local65++) {
				method207(anIntArray115[local65], local3, local35, aCharArrayArray3[local65], arg0);
			}
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("76439, " + arg0 + ", " + true + ", " + local85.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NGLCBGTC", name = "a", descriptor = "(II[C[C[C[C)V")
	private static void method207(@OriginalArg(0) int arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2, @OriginalArg(4) char[] arg3, @OriginalArg(5) char[] arg4) {
		try {
			if (arg3.length <= arg4.length) {
				@Pc(22) int local22;
				for (@Pc(14) int local14 = 0; local14 <= arg4.length - arg3.length; local14 += local22) {
					@Pc(18) int local18 = local14;
					@Pc(20) int local20 = 0;
					local22 = 1;
					label120: while (true) {
						while (true) {
							if (local18 >= arg4.length) {
								break label120;
							}
							@Pc(30) char local30 = arg4[local18];
							@Pc(32) char local32 = 0;
							if (local18 + 1 < arg4.length) {
								local32 = arg4[local18 + 1];
							}
							@Pc(57) int local57;
							if (local20 < arg3.length && (local57 = method212(local30, local32, arg3[local20])) > 0) {
								local18 += local57;
								local20++;
							} else {
								if (local20 == 0) {
									break label120;
								}
								@Pc(78) int local78;
								if ((local78 = method212(local30, local32, arg3[local20 - 1])) > 0) {
									local18 += local78;
									if (local20 == 1) {
										local22++;
									}
								} else {
									if (local20 >= arg3.length || !method218(local30)) {
										break label120;
									}
									local18++;
								}
							}
						}
					}
					if (local20 >= arg3.length) {
						@Pc(109) boolean local109 = false;
						@Pc(115) int local115 = method208(arg4, local14, arg1);
						@Pc(123) int local123 = method209(arg4, arg2, local18 - 1);
						if (arg0 == 1 && local115 > 0 && local123 > 0) {
							local109 = true;
						}
						if (arg0 == 2 && (local115 > 2 && local123 > 0 || local115 > 0 && local123 > 2)) {
							local109 = true;
						}
						if (arg0 == 3 && local115 > 0 && local123 > 2) {
							local109 = true;
						}
						@Pc(166) boolean local166;
						if (arg0 == 3 && local115 > 2 && local123 > 0) {
							local166 = true;
						} else {
							local166 = false;
						}
						if (local109) {
							@Pc(173) int local173 = local14;
							@Pc(177) int local177 = local18 - 1;
							@Pc(185) boolean local185;
							@Pc(189) int local189;
							if (local115 > 2) {
								if (local115 == 4) {
									local185 = false;
									for (local189 = local14 - 1; local189 >= 0; local189--) {
										if (local185) {
											if (arg1[local189] != '*') {
												break;
											}
											local173 = local189;
										} else if (arg1[local189] == '*') {
											local173 = local189;
											local185 = true;
										}
									}
								}
								local185 = false;
								for (local189 = local173 - 1; local189 >= 0; local189--) {
									if (local185) {
										if (method218(arg4[local189])) {
											break;
										}
										local173 = local189;
									} else if (!method218(arg4[local189])) {
										local185 = true;
										local173 = local189;
									}
								}
							}
							if (local123 > 2) {
								if (local123 == 4) {
									local185 = false;
									for (local189 = local177 + 1; local189 < arg4.length; local189++) {
										if (local185) {
											if (arg2[local189] != '*') {
												break;
											}
											local177 = local189;
										} else if (arg2[local189] == '*') {
											local177 = local189;
											local185 = true;
										}
									}
								}
								local185 = false;
								for (local189 = local177 + 1; local189 < arg4.length; local189++) {
									if (local185) {
										if (method218(arg4[local189])) {
											break;
										}
										local177 = local189;
									} else if (!method218(arg4[local189])) {
										local185 = true;
										local177 = local189;
									}
								}
							}
							for (@Pc(323) int local323 = local173; local323 <= local177; local323++) {
								arg4[local323] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(346) RuntimeException local346) {
			signlink.reporterror("3285, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local346.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NGLCBGTC", name = "a", descriptor = "([CII[C)I")
	private static int method208(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg1 == 0) {
				return 2;
			}
			@Pc(9) int local9 = arg1 - 1;
			while (true) {
				if (local9 >= 0 && method218(arg0[local9])) {
					if (arg0[local9] != ',' && arg0[local9] != '.') {
						local9--;
						continue;
					}
					return 3;
				}
				@Pc(34) int local34 = 0;
				for (@Pc(44) int local44 = arg1 - 1; local44 >= 0 && method218(arg2[local44]); local44--) {
					if (arg2[local44] == '*') {
						local34++;
					}
				}
				if (local34 >= 3) {
					return 4;
				}
				if (method218(arg0[arg1 - 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("29701, " + arg0 + ", " + arg1 + ", " + -870 + ", " + arg2 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NGLCBGTC", name = "a", descriptor = "([C[CII)I")
	private static int method209(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 + 1 == arg0.length) {
				return 2;
			}
			@Pc(13) int local13 = arg2 + 1;
			while (true) {
				if (local13 < arg0.length && method218(arg0[local13])) {
					if (arg0[local13] != '\\' && arg0[local13] != '/') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(40) int local40 = 0;
				for (@Pc(50) int local50 = arg2 + 1; local50 < arg0.length && method218(arg1[local50]); local50++) {
					if (arg1[local50] == '*') {
						local40++;
					}
				}
				if (local40 >= 5) {
					return 4;
				}
				if (method218(arg0[arg2 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("38957, " + arg0 + ", " + arg1 + ", " + -348 + ", " + arg2 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NGLCBGTC", name = "a", descriptor = "([CB[[B[C)V")
	private static void method210(@OriginalArg(0) char[] arg0, @OriginalArg(2) byte[][] arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg0.length <= arg2.length) {
				@Pc(25) int local25;
				for (@Pc(15) int local15 = 0; local15 <= arg2.length - arg0.length; local15 += local25) {
					@Pc(19) int local19 = local15;
					@Pc(21) int local21 = 0;
					@Pc(23) int local23 = 0;
					local25 = 1;
					@Pc(27) boolean local27 = false;
					@Pc(29) boolean local29 = false;
					@Pc(31) boolean local31 = false;
					@Pc(39) char var12;
					@Pc(41) char var13;
					label164: while (true) {
						while (true) {
							if (local19 >= arg2.length || local29 && local31) {
								break label164;
							}
							var12 = arg2[local19];
							var13 = '\u0000';
							if (local19 + 1 < arg2.length) {
								var13 = arg2[local19 + 1];
							}
							@Pc(66) int local66;
							if (local21 < arg0.length && (local66 = method213(var12, var13, arg0[local21])) > 0) {
								if (local66 == 1 && method221(var12)) {
									local29 = true;
								}
								if (local66 == 2 && (method221(var12) || method221(var13))) {
									local29 = true;
								}
								local19 += local66;
								local21++;
							} else {
								if (local21 == 0) {
									break label164;
								}
								@Pc(109) int local109;
								if ((local109 = method213(var12, var13, arg0[local21 - 1])) > 0) {
									local19 += local109;
									if (local21 == 1) {
										local25++;
									}
								} else {
									if (local21 >= arg0.length || !method219(var12)) {
										break label164;
									}
									if (method218(var12) && var12 != '\'') {
										local27 = true;
									}
									if (method221(var12)) {
										local31 = true;
									}
									local19++;
									local23++;
									if (local23 * 100 / (local19 - local15) > 90) {
										break label164;
									}
								}
							}
						}
					}
					if (local21 >= arg0.length && (!local29 || !local31)) {
						@Pc(174) boolean local174 = true;
						@Pc(270) int local270;
						if (local27) {
							@Pc(220) boolean local220 = false;
							@Pc(222) boolean local222 = false;
							if (local15 - 1 < 0 || method218(arg2[local15 - 1]) && arg2[local15 - 1] != '\'') {
								local220 = true;
							}
							if (local19 >= arg2.length || method218(arg2[local19]) && arg2[local19] != '\'') {
								local222 = true;
							}
							if (!local220 || !local222) {
								@Pc(266) boolean local266 = false;
								local270 = local15 - 2;
								if (local220) {
									local270 = local15;
								}
								while (!local266 && local270 < local19) {
									if (local270 >= 0 && (!method218(arg2[local270]) || arg2[local270] == '\'')) {
										@Pc(292) char[] local292 = new char[3];
										@Pc(294) int local294;
										for (local294 = 0; local294 < 3 && local270 + local294 < arg2.length && (!method218(arg2[local270 + local294]) || arg2[local270 + local294] == '\''); local294++) {
											local292[local294] = arg2[local270 + local294];
										}
										@Pc(332) boolean local332 = true;
										if (local294 == 0) {
											local332 = false;
										}
										if (local294 < 3 && local270 - 1 >= 0 && (!method218(arg2[local270 - 1]) || arg2[local270 - 1] == '\'')) {
											local332 = false;
										}
										if (local332 && !method224(local292)) {
											local266 = true;
										}
									}
									local270++;
								}
								if (!local266) {
									local174 = false;
								}
							}
						} else {
							var12 = ' ';
							if (local15 - 1 >= 0) {
								var12 = arg2[local15 - 1];
							}
							var13 = ' ';
							if (local19 < arg2.length) {
								var13 = arg2[local19];
							}
							@Pc(202) byte local202 = method214(var12);
							@Pc(206) byte local206 = method214(var13);
							if (arg1 != null && method211(local206, arg1, local202)) {
								local174 = false;
							}
						}
						if (local174) {
							@Pc(382) int local382 = 0;
							@Pc(384) int local384 = 0;
							@Pc(386) int local386 = -1;
							for (local270 = local15; local270 < local19; local270++) {
								if (method221(arg2[local270])) {
									local382++;
								} else if (method220((byte) 8, arg2[local270])) {
									local384++;
									local386 = local270;
								}
							}
							if (local386 > -1) {
								local382 -= local19 - local386 - 1;
							}
							if (local382 <= local384) {
								for (@Pc(428) int local428 = local15; local428 < local19; local428++) {
									arg2[local428] = '*';
								}
							} else {
								local25 = 1;
							}
						}
					}
				}
			}
		} catch (@Pc(455) RuntimeException local455) {
			signlink.reporterror("23925, " + arg0 + ", " + 9 + ", " + arg1 + ", " + arg2 + ", " + local455.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NGLCBGTC", name = "a", descriptor = "(B[[BBI)Z")
	private static boolean method211(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) byte arg2) {
		try {
			@Pc(1) int local1 = 0;
			if (arg1[0][0] == arg2 && arg1[0][1] == arg0) {
				return true;
			}
			@Pc(26) int local26 = arg1.length - 1;
			if (arg1[local26][0] == arg2 && arg1[local26][1] == arg0) {
				return true;
			}
			do {
				@Pc(48) int local48 = (local1 + local26) / 2;
				if (arg1[local48][0] == arg2 && arg1[local48][1] == arg0) {
					return true;
				}
				if (arg2 < arg1[local48][0] || arg2 == arg1[local48][0] && arg0 < arg1[local48][1]) {
					local26 = local48;
				} else {
					local1 = local48;
				}
			} while (local1 != local26 && local1 + 1 != local26);
			return false;
		} catch (@Pc(102) RuntimeException local102) {
			signlink.reporterror("80070, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local102.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NGLCBGTC", name = "a", descriptor = "(CCIC)I")
	private static int method212(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(3) char arg2) {
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
			signlink.reporterror("16503, " + arg0 + ", " + arg1 + ", " + 81 + ", " + arg2 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NGLCBGTC", name = "b", descriptor = "(CCIC)I")
	private static int method213(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(3) char arg2) {
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
		} catch (@Pc(517) RuntimeException local517) {
			signlink.reporterror("6167, " + arg0 + ", " + arg1 + ", " + 2 + ", " + arg2 + ", " + local517.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NGLCBGTC", name = "a", descriptor = "(CI)B")
	private static byte method214(@OriginalArg(0) char arg0) {
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
			signlink.reporterror("687, " + arg0 + ", " + 95 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NGLCBGTC", name = "b", descriptor = "(I[C)V")
	private static void method215(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(13) int local13 = 0;
			@Pc(15) int local15 = 0;
			@Pc(17) int local17 = 0;
			while (true) {
				do {
					@Pc(116) int local116;
					if ((local116 = method216(arg0, local13)) == -1) {
						return;
					}
					@Pc(21) boolean local21 = false;
					for (@Pc(23) int local23 = local13; local23 >= 0 && local23 < local116 && !local21; local23++) {
						if (!method218(arg0[local23]) && !method219(arg0[local23])) {
							local21 = true;
						}
					}
					if (local21) {
						local15 = 0;
					}
					if (local15 == 0) {
						local17 = local116;
					}
					local13 = method217(local116, arg0, 569);
					@Pc(62) int local62 = 0;
					for (@Pc(64) int local64 = local116; local64 < local13; local64++) {
						local62 = local62 * 10 + arg0[local64] - 48;
					}
					if (local62 <= 255 && local13 - local116 <= 8) {
						local15++;
					} else {
						local15 = 0;
					}
				} while (local15 != 4);
				for (@Pc(98) int local98 = local17; local98 < local13; local98++) {
					arg0[local98] = '*';
				}
				local15 = 0;
			}
		} catch (@Pc(120) RuntimeException local120) {
			signlink.reporterror("99954, " + -749 + ", " + arg0 + ", " + local120.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NGLCBGTC", name = "a", descriptor = "([CII)I")
	private static int method216(@OriginalArg(0) char[] arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(6) int local6 = arg1; local6 < arg0.length && local6 >= 0; local6++) {
				if (arg0[local6] >= '0' && arg0[local6] <= '9') {
					return local6;
				}
			}
			return -1;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("54816, " + arg0 + ", " + -38309 + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NGLCBGTC", name = "a", descriptor = "(I[CI)I")
	private static int method217(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(5) int local5 = arg0;
			while (true) {
				if (local5 < arg1.length && local5 >= 0) {
					if (arg1[local5] >= '0' && arg1[local5] <= '9') {
						local5++;
						continue;
					}
					return local5;
				}
				return arg1.length;
			}
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("46242, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NGLCBGTC", name = "a", descriptor = "(IC)Z")
	private static boolean method218(@OriginalArg(1) char arg0) {
		try {
			return !method220((byte) 8, arg0) && !method221(arg0);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("19719, " + 0 + ", " + arg0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NGLCBGTC", name = "b", descriptor = "(IC)Z")
	private static boolean method219(@OriginalArg(1) char arg0) {
		try {
			if (arg0 >= 'a' && arg0 <= 'z') {
				return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
			} else {
				return true;
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("47713, " + 96 + ", " + arg0 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NGLCBGTC", name = "a", descriptor = "(BC)Z")
	private static boolean method220(@OriginalArg(0) byte arg0, @OriginalArg(1) char arg1) {
		try {
			@Pc(4) boolean local4 = false;
			return arg1 >= 'a' && arg1 <= 'z' || arg1 >= 'A' && arg1 <= 'Z';
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("39282, " + arg0 + ", " + arg1 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NGLCBGTC", name = "b", descriptor = "(CI)Z")
	private static boolean method221(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= '0' && arg0 <= '9';
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("91487, " + arg0 + ", " + -813 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NGLCBGTC", name = "c", descriptor = "(IC)Z")
	private static boolean method222(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z';
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("91610, " + 0 + ", " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NGLCBGTC", name = "a", descriptor = "(ZC)Z")
	private static boolean method223(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("8129, " + true + ", " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NGLCBGTC", name = "a", descriptor = "([CI)Z")
	private static boolean method224(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(9) boolean local9 = true;
			for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
				if (!method221(arg0[local11]) && arg0[local11] != '\u0000') {
					local9 = false;
				}
			}
			if (local9) {
				return true;
			}
			@Pc(38) int local38 = method225(arg0);
			@Pc(40) int local40 = 0;
			@Pc(45) int local45 = anIntArray114.length - 1;
			if (local38 == anIntArray114[0] || local38 == anIntArray114[local45]) {
				return true;
			}
			do {
				@Pc(63) int local63 = (local40 + local45) / 2;
				if (local38 == anIntArray114[local63]) {
					return true;
				}
				if (local38 < anIntArray114[local63]) {
					local45 = local63;
				} else {
					local40 = local63;
				}
			} while (local40 != local45 && local40 + 1 != local45);
			return false;
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("12829, " + arg0 + ", " + 0 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NGLCBGTC", name = "b", descriptor = "([CI)I")
	private static int method225(@OriginalArg(0) char[] arg0) {
		try {
			if (arg0.length > 6) {
				return 0;
			}
			@Pc(17) int local17 = 0;
			for (@Pc(19) int local19 = 0; local19 < arg0.length; local19++) {
				@Pc(30) char local30 = arg0[arg0.length - local19 - 1];
				if (local30 >= 'a' && local30 <= 'z') {
					local17 = local17 * 38 + local30 + 1 - 'a';
				} else if (local30 == '\'') {
					local17 = local17 * 38 + 27;
				} else if (local30 >= '0' && local30 <= '9') {
					local17 = local17 * 38 + local30 + 28 - '0';
				} else if (local30 != '\u0000') {
					return 0;
				}
			}
			return local17;
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("65113, " + arg0 + ", " + -187 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}
}
