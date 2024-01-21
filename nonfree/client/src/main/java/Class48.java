import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ZWRCNFEU")
public final class Class48 {

	@OriginalMember(owner = "client!ZWRCNFEU", name = "b", descriptor = "Z")
	private static boolean aBoolean230;

	@OriginalMember(owner = "client!ZWRCNFEU", name = "e", descriptor = "I")
	private static int anInt787;

	@OriginalMember(owner = "client!ZWRCNFEU", name = "h", descriptor = "[I")
	private static int[] anIntArray208;

	@OriginalMember(owner = "client!ZWRCNFEU", name = "i", descriptor = "[[C")
	private static char[][] aCharArrayArray1;

	@OriginalMember(owner = "client!ZWRCNFEU", name = "j", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!ZWRCNFEU", name = "k", descriptor = "[[C")
	private static char[][] aCharArrayArray2;

	@OriginalMember(owner = "client!ZWRCNFEU", name = "l", descriptor = "[[C")
	private static char[][] aCharArrayArray3;

	@OriginalMember(owner = "client!ZWRCNFEU", name = "m", descriptor = "[I")
	private static int[] anIntArray209;

	@OriginalMember(owner = "client!ZWRCNFEU", name = "a", descriptor = "I")
	private static int anInt784 = 791;

	@OriginalMember(owner = "client!ZWRCNFEU", name = "c", descriptor = "I")
	private static int anInt785 = 26695;

	@OriginalMember(owner = "client!ZWRCNFEU", name = "d", descriptor = "I")
	private static int anInt786 = 557;

	@OriginalMember(owner = "client!ZWRCNFEU", name = "f", descriptor = "Z")
	private static boolean aBoolean231 = true;

	@OriginalMember(owner = "client!ZWRCNFEU", name = "g", descriptor = "Z")
	private static boolean aBoolean232 = true;

	@OriginalMember(owner = "client!ZWRCNFEU", name = "n", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray6 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

	@OriginalMember(owner = "client!ZWRCNFEU", name = "a", descriptor = "(Lclient!MAARFNGV;)V")
	public static void method538(@OriginalArg(0) Class22 arg0) {
		@Pc(10) Class2_Sub1_Sub3 local10 = new Class2_Sub1_Sub3(arg0.method218("fragmentsenc.txt", null), true);
		@Pc(19) Class2_Sub1_Sub3 local19 = new Class2_Sub1_Sub3(arg0.method218("badenc.txt", null), true);
		@Pc(28) Class2_Sub1_Sub3 local28 = new Class2_Sub1_Sub3(arg0.method218("domainenc.txt", null), true);
		@Pc(37) Class2_Sub1_Sub3 local37 = new Class2_Sub1_Sub3(arg0.method218("tldlist.txt", null), true);
		method539(local10, local19, local28, local37);
	}

	@OriginalMember(owner = "client!ZWRCNFEU", name = "a", descriptor = "(Lclient!EMWAMCXW;Lclient!EMWAMCXW;Lclient!EMWAMCXW;Lclient!EMWAMCXW;)V")
	private static void method539(@OriginalArg(0) Class2_Sub1_Sub3 arg0, @OriginalArg(1) Class2_Sub1_Sub3 arg1, @OriginalArg(2) Class2_Sub1_Sub3 arg2, @OriginalArg(3) Class2_Sub1_Sub3 arg3) {
		method541(arg1, 227);
		method542(arg2);
		method543(arg0);
		method540(arg3);
	}

	@OriginalMember(owner = "client!ZWRCNFEU", name = "a", descriptor = "(Lclient!EMWAMCXW;I)V")
	private static void method540(@OriginalArg(0) Class2_Sub1_Sub3 arg0) {
		try {
			@Pc(7) int local7 = arg0.method102();
			aCharArrayArray3 = new char[local7][];
			anIntArray209 = new int[local7];
			for (@Pc(15) int local15 = 0; local15 < local7; local15++) {
				anIntArray209[local15] = arg0.method97();
				@Pc(26) char[] local26 = new char[arg0.method97()];
				for (@Pc(28) int local28 = 0; local28 < local26.length; local28++) {
					local26[local28] = (char) arg0.method97();
				}
				aCharArrayArray3[local15] = local26;
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("43434, " + arg0 + ", " + 0 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZWRCNFEU", name = "b", descriptor = "(Lclient!EMWAMCXW;I)V")
	private static void method541(@OriginalArg(0) Class2_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(2) int local2 = arg0.method102();
			@Pc(6) boolean local6 = false;
			aCharArrayArray1 = new char[local2][];
			aByteArrayArrayArray7 = new byte[local2][][];
			method544(aByteArrayArrayArray7, aCharArrayArray1, arg0);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("76906, " + arg0 + ", " + arg1 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZWRCNFEU", name = "c", descriptor = "(Lclient!EMWAMCXW;I)V")
	private static void method542(@OriginalArg(0) Class2_Sub1_Sub3 arg0) {
		try {
			@Pc(2) int local2 = arg0.method102();
			aCharArrayArray2 = new char[local2][];
			method545(arg0, aCharArrayArray2);
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("85814, " + arg0 + ", " + -36 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZWRCNFEU", name = "d", descriptor = "(Lclient!EMWAMCXW;I)V")
	private static void method543(@OriginalArg(0) Class2_Sub1_Sub3 arg0) {
		try {
			@Pc(6) int local6;
			if (anInt785 != 26695) {
				for (local6 = 1; local6 > 0; local6++) {
				}
			}
			anIntArray208 = new int[arg0.method102()];
			for (local6 = 0; local6 < anIntArray208.length; local6++) {
				anIntArray208[local6] = arg0.method99();
			}
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("19931, " + arg0 + ", " + 26695 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZWRCNFEU", name = "a", descriptor = "([[[B[[CLclient!EMWAMCXW;I)V")
	private static void method544(@OriginalArg(0) byte[][][] arg0, @OriginalArg(1) char[][] arg1, @OriginalArg(2) Class2_Sub1_Sub3 arg2) {
		try {
			for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
				@Pc(13) char[] local13 = new char[arg2.method97()];
				for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
					local13[local15] = (char) arg2.method97();
				}
				arg1[local7] = local13;
				@Pc(37) byte[][] local37 = new byte[arg2.method97()][2];
				for (@Pc(39) int local39 = 0; local39 < local37.length; local39++) {
					local37[local39][0] = (byte) arg2.method97();
					local37[local39][1] = (byte) arg2.method97();
				}
				if (local37.length > 0) {
					arg0[local7] = local37;
				}
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("4642, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZWRCNFEU", name = "a", descriptor = "(ILclient!EMWAMCXW;[[C)V")
	private static void method545(@OriginalArg(1) Class2_Sub1_Sub3 arg0, @OriginalArg(2) char[][] arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
				@Pc(9) char[] local9 = new char[arg0.method97()];
				for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
					local9[local11] = (char) arg0.method97();
				}
				arg1[local3] = local9;
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("56576, " + 9 + ", " + arg0 + ", " + arg1 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZWRCNFEU", name = "a", descriptor = "([CB)V")
	private static void method546(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) int local3 = 0;
			for (@Pc(10) int local10 = 0; local10 < arg0.length; local10++) {
				if (method547(arg0[local10])) {
					arg0[local3] = arg0[local10];
				} else {
					arg0[local3] = ' ';
				}
				if (local3 == 0 || arg0[local3] != ' ' || arg0[local3 - 1] != ' ') {
					local3++;
				}
			}
			for (@Pc(52) int local52 = local3; local52 < arg0.length; local52++) {
				arg0[local52] = ' ';
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("31527, " + arg0 + ", " + -27 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZWRCNFEU", name = "a", descriptor = "(CZ)Z")
	private static boolean method547(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= ' ' && arg0 <= '\u007f' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("10592, " + arg0 + ", " + false + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZWRCNFEU", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method548(@OriginalArg(1) String arg0) {
		try {
			@Pc(3) long local3 = System.currentTimeMillis();
			@Pc(6) char[] local6 = arg0.toCharArray();
			method546(local6);
			@Pc(15) String local15 = (new String(local6)).trim();
			@Pc(27) char[] local27 = local15.toLowerCase().toCharArray();
			@Pc(30) String local30 = local15.toLowerCase();
			method556(local27);
			method551(234, local27);
			method552(local27);
			method565(local27, anInt787);
			for (@Pc(44) int local44 = 0; local44 < aStringArray6.length; local44++) {
				@Pc(54) int local54 = -1;
				while ((local54 = local30.indexOf(aStringArray6[local44], local54 + 1)) != -1) {
					@Pc(61) char[] local61 = aStringArray6[local44].toCharArray();
					for (@Pc(63) int local63 = 0; local63 < local61.length; local63++) {
						local27[local63 + local54] = local61[local63];
					}
				}
			}
			method549(local27, local15.toCharArray());
			method550(local27);
			@Pc(105) long local105 = System.currentTimeMillis();
			return (new String(local27)).trim();
		} catch (@Pc(112) RuntimeException local112) {
			signlink.reporterror("21632, " + false + ", " + arg0 + ", " + local112.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZWRCNFEU", name = "a", descriptor = "([C[CI)V")
	private static void method549(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1) {
		try {
			for (@Pc(1) int local1 = 0; local1 < arg1.length; local1++) {
				if (arg0[local1] != '*' && method573(arg1[local1])) {
					arg0[local1] = arg1[local1];
				}
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("31507, " + arg0 + ", " + arg1 + ", " + -814 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZWRCNFEU", name = "a", descriptor = "(I[C)V")
	private static void method550(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(12) int local12 = 0; local12 < arg0.length; local12++) {
				@Pc(18) char local18 = arg0[local12];
				if (!method570(local18)) {
					local3 = true;
				} else if (local3) {
					if (method572(local18)) {
						local3 = false;
					}
				} else if (method573(local18)) {
					arg0[local12] = (char) (local18 + 'a' - 65);
				}
			}
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("22798, " + 1 + ", " + arg0 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZWRCNFEU", name = "b", descriptor = "(I[C)V")
	private static void method551(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 2; local3++) {
				for (@Pc(10) int local10 = aCharArrayArray1.length - 1; local10 >= 0; local10--) {
					method560(aCharArrayArray1[local10], aByteArrayArrayArray7[local10], arg1);
				}
			}
			@Pc(32) boolean local32 = false;
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("38016, " + arg0 + ", " + arg1 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZWRCNFEU", name = "a", descriptor = "([CI)V")
	private static void method552(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(5) char[] local5 = (char[]) arg0.clone();
			@Pc(20) char[] local20 = new char[] { '(', 'a', ')' };
			method560(local20, null, local5);
			@Pc(39) char[] local39 = (char[]) arg0.clone();
			@Pc(54) char[] local54 = new char[] { 'd', 'o', 't' };
			method560(local54, null, local39);
			for (@Pc(64) int local64 = aCharArrayArray2.length - 1; local64 >= 0; local64--) {
				method553(aCharArrayArray2[local64], local5, arg0, local39);
			}
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("31790, " + arg0 + ", " + -42275 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZWRCNFEU", name = "a", descriptor = "([C[CZ[C[C)V")
	private static void method553(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(3) char[] arg2, @OriginalArg(4) char[] arg3) {
		try {
			if (arg0.length <= arg2.length) {
				@Pc(23) int local23;
				for (@Pc(15) int local15 = 0; local15 <= arg2.length - arg0.length; local15 += local23) {
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
							if (local21 < arg0.length && (local58 = method562(local31, local33, arg0[local21])) > 0) {
								local19 += local58;
								local21++;
							} else {
								if (local21 == 0) {
									break label58;
								}
								@Pc(79) int local79;
								if ((local79 = method562(local31, local33, arg0[local21 - 1])) > 0) {
									local19 += local79;
									if (local21 == 1) {
										local23++;
									}
								} else {
									if (local21 >= arg0.length || !method568(local31)) {
										break label58;
									}
									local19++;
								}
							}
						}
					}
					if (local21 >= arg0.length) {
						@Pc(110) boolean local110 = false;
						@Pc(116) int local116 = method554(local15, arg1, arg2);
						@Pc(124) int local124 = method555(arg2, local19 - 1, arg3);
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
			signlink.reporterror("36067, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + arg3 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZWRCNFEU", name = "a", descriptor = "(I[CB[C)I")
	private static int method554(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg0 == 0) {
				return 2;
			}
			for (@Pc(19) int local19 = arg0 - 1; local19 >= 0 && method568(arg2[local19]); local19--) {
				if (arg2[local19] == '@') {
					return 3;
				}
			}
			@Pc(39) int local39 = 0;
			for (@Pc(43) int local43 = arg0 - 1; local43 >= 0 && method568(arg1[local43]); local43--) {
				if (arg1[local43] == '*') {
					local39++;
				}
			}
			if (local39 >= 3) {
				return 4;
			} else if (method568(arg2[arg0 - 1])) {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("79323, " + arg0 + ", " + arg1 + ", " + 112 + ", " + arg2 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZWRCNFEU", name = "a", descriptor = "([CII[C)I")
	private static int method555(@OriginalArg(0) char[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg1 + 1 == arg0.length) {
				return 2;
			}
			@Pc(13) int local13 = arg1 + 1;
			while (true) {
				if (local13 < arg0.length && method568(arg0[local13])) {
					if (arg0[local13] != '.' && arg0[local13] != ',') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(40) int local40 = 0;
				for (@Pc(49) int local49 = arg1 + 1; local49 < arg0.length && method568(arg2[local49]); local49++) {
					if (arg2[local49] == '*') {
						local40++;
					}
				}
				if (local40 >= 3) {
					return 4;
				}
				if (method568(arg0[arg1 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("85265, " + arg0 + ", " + 4 + ", " + arg1 + ", " + arg2 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZWRCNFEU", name = "c", descriptor = "(I[C)V")
	private static void method556(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(18) char[] local18 = new char[] { 'd', 'o', 't' };
			method560(local18, null, local3);
			@Pc(27) char[] local27 = (char[]) arg0.clone();
			@Pc(50) char[] local50 = new char[] { 's', 'l', 'a', 's', 'h' };
			method560(local50, null, local27);
			for (@Pc(60) int local60 = 0; local60 < aCharArrayArray3.length; local60++) {
				method557(arg0, anIntArray209[local60], local3, aCharArrayArray3[local60], local27);
			}
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("43383, " + 749 + ", " + arg0 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZWRCNFEU", name = "a", descriptor = "([CI[C[CZ[C)V")
	private static void method557(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) char[] arg3, @OriginalArg(5) char[] arg4) {
		try {
			if (arg3.length <= arg0.length) {
				@Pc(27) int local27;
				for (@Pc(19) int local19 = 0; local19 <= arg0.length - arg3.length; local19 += local27) {
					@Pc(23) int local23 = local19;
					@Pc(25) int local25 = 0;
					local27 = 1;
					label120: while (true) {
						while (true) {
							if (local23 >= arg0.length) {
								break label120;
							}
							@Pc(35) char local35 = arg0[local23];
							@Pc(37) char local37 = 0;
							if (local23 + 1 < arg0.length) {
								local37 = arg0[local23 + 1];
							}
							@Pc(62) int local62;
							if (local25 < arg3.length && (local62 = method562(local35, local37, arg3[local25])) > 0) {
								local23 += local62;
								local25++;
							} else {
								if (local25 == 0) {
									break label120;
								}
								@Pc(83) int local83;
								if ((local83 = method562(local35, local37, arg3[local25 - 1])) > 0) {
									local23 += local83;
									if (local25 == 1) {
										local27++;
									}
								} else {
									if (local25 >= arg3.length || !method568(local35)) {
										break label120;
									}
									local23++;
								}
							}
						}
					}
					if (local25 >= arg3.length) {
						@Pc(114) boolean local114 = false;
						@Pc(120) int local120 = method558(local19, arg0, arg2);
						@Pc(128) int local128 = method559(local23 - 1, arg0, arg4);
						if (arg1 == 1 && local120 > 0 && local128 > 0) {
							local114 = true;
						}
						if (arg1 == 2 && (local120 > 2 && local128 > 0 || local120 > 0 && local128 > 2)) {
							local114 = true;
						}
						if (arg1 == 3 && local120 > 0 && local128 > 2) {
							local114 = true;
						}
						@Pc(171) boolean local171;
						if (arg1 == 3 && local120 > 2 && local128 > 0) {
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
											if (arg2[local194] != '*') {
												break;
											}
											local178 = local194;
										} else if (arg2[local194] == '*') {
											local178 = local194;
											local190 = true;
										}
									}
								}
								local190 = false;
								for (local194 = local178 - 1; local194 >= 0; local194--) {
									if (local190) {
										if (method568(arg0[local194])) {
											break;
										}
										local178 = local194;
									} else if (!method568(arg0[local194])) {
										local190 = true;
										local178 = local194;
									}
								}
							}
							if (local128 > 2) {
								if (local128 == 4) {
									local190 = false;
									for (local194 = local182 + 1; local194 < arg0.length; local194++) {
										if (local190) {
											if (arg4[local194] != '*') {
												break;
											}
											local182 = local194;
										} else if (arg4[local194] == '*') {
											local182 = local194;
											local190 = true;
										}
									}
								}
								local190 = false;
								for (local194 = local182 + 1; local194 < arg0.length; local194++) {
									if (local190) {
										if (method568(arg0[local194])) {
											break;
										}
										local182 = local194;
									} else if (!method568(arg0[local194])) {
										local190 = true;
										local182 = local194;
									}
								}
							}
							for (@Pc(328) int local328 = local178; local328 <= local182; local328++) {
								arg0[local328] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(351) RuntimeException local351) {
			signlink.reporterror("69636, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + false + ", " + arg4 + ", " + local351.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZWRCNFEU", name = "a", descriptor = "(II[C[C)I")
	private static int method558(@OriginalArg(1) int arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg0 == 0) {
				return 2;
			}
			@Pc(9) int local9 = arg0 - 1;
			while (true) {
				if (local9 >= 0 && method568(arg1[local9])) {
					if (arg1[local9] != ',' && arg1[local9] != '.') {
						local9--;
						continue;
					}
					return 3;
				}
				@Pc(43) int local43 = 0;
				for (@Pc(47) int local47 = arg0 - 1; local47 >= 0 && method568(arg2[local47]); local47--) {
					if (arg2[local47] == '*') {
						local43++;
					}
				}
				if (local43 >= 3) {
					return 4;
				}
				if (method568(arg1[arg0 - 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("67336, " + -541 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZWRCNFEU", name = "b", descriptor = "(II[C[C)I")
	private static int method559(@OriginalArg(1) int arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg0 + 1 == arg1.length) {
				return 2;
			}
			@Pc(13) int local13 = arg0 + 1;
			while (true) {
				if (local13 < arg1.length && method568(arg1[local13])) {
					if (arg1[local13] != '\\' && arg1[local13] != '/') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(49) int local49 = 0;
				for (@Pc(53) int local53 = arg0 + 1; local53 < arg1.length && method568(arg2[local53]); local53++) {
					if (arg2[local53] == '*') {
						local49++;
					}
				}
				if (local49 >= 5) {
					return 4;
				}
				if (method568(arg1[arg0 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("41208, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZWRCNFEU", name = "a", descriptor = "(B[C[[B[C)V")
	private static void method560(@OriginalArg(1) char[] arg0, @OriginalArg(2) byte[][] arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg0.length <= arg2.length) {
				@Pc(21) int local21;
				for (@Pc(11) int local11 = 0; local11 <= arg2.length - arg0.length; local11 += local21) {
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
							if (local17 < arg0.length && (local62 = method563(var12, var13, arg0[local17])) > 0) {
								if (local62 == 1 && method571(var12)) {
									local25 = true;
								}
								if (local62 == 2 && (method571(var12) || method571(var13))) {
									local25 = true;
								}
								local15 += local62;
								local17++;
							} else {
								if (local17 == 0) {
									break label165;
								}
								@Pc(105) int local105;
								if ((local105 = method563(var12, var13, arg0[local17 - 1])) > 0) {
									local15 += local105;
									if (local17 == 1) {
										local21++;
									}
								} else {
									if (local17 >= arg0.length || !method569(var12, aBoolean231)) {
										break label165;
									}
									if (method568(var12) && var12 != '\'') {
										local23 = true;
									}
									if (method571(var12)) {
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
					if (local17 >= arg0.length && (!local25 || !local27)) {
						@Pc(170) boolean local170 = true;
						@Pc(266) int local266;
						if (local23) {
							@Pc(216) boolean local216 = false;
							@Pc(218) boolean local218 = false;
							if (local11 - 1 < 0 || method568(arg2[local11 - 1]) && arg2[local11 - 1] != '\'') {
								local216 = true;
							}
							if (local15 >= arg2.length || method568(arg2[local15]) && arg2[local15] != '\'') {
								local218 = true;
							}
							if (!local216 || !local218) {
								@Pc(262) boolean local262 = false;
								local266 = local11 - 2;
								if (local216) {
									local266 = local11;
								}
								while (!local262 && local266 < local15) {
									if (local266 >= 0 && (!method568(arg2[local266]) || arg2[local266] == '\'')) {
										@Pc(288) char[] local288 = new char[3];
										@Pc(290) int local290;
										for (local290 = 0; local290 < 3 && local266 + local290 < arg2.length && (!method568(arg2[local266 + local290]) || arg2[local266 + local290] == '\''); local290++) {
											local288[local290] = arg2[local266 + local290];
										}
										@Pc(328) boolean local328 = true;
										if (local290 == 0) {
											local328 = false;
										}
										if (local290 < 3 && local266 - 1 >= 0 && (!method568(arg2[local266 - 1]) || arg2[local266 - 1] == '\'')) {
											local328 = false;
										}
										if (local328 && !method574(local288)) {
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
							@Pc(198) byte local198 = method564(var12);
							@Pc(202) byte local202 = method564(var13);
							if (arg1 != null && method561(local202, local198, arg1)) {
								local170 = false;
							}
						}
						if (local170) {
							@Pc(378) int local378 = 0;
							@Pc(380) int local380 = 0;
							@Pc(382) int local382 = -1;
							for (local266 = local11; local266 < local15; local266++) {
								if (method571(arg2[local266])) {
									local378++;
								} else if (method570(arg2[local266])) {
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
		} catch (@Pc(455) RuntimeException local455) {
			signlink.reporterror("63081, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local455.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZWRCNFEU", name = "a", descriptor = "(BB[[BI)Z")
	private static boolean method561(@OriginalArg(0) byte arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte[][] arg2) {
		try {
			@Pc(13) int local13 = 0;
			if (arg2[0][0] == arg1 && arg2[0][1] == arg0) {
				return true;
			}
			@Pc(34) int local34 = arg2.length - 1;
			if (arg2[local34][0] == arg1 && arg2[local34][1] == arg0) {
				return true;
			}
			do {
				@Pc(56) int local56 = (local13 + local34) / 2;
				if (arg2[local56][0] == arg1 && arg2[local56][1] == arg0) {
					return true;
				}
				if (arg1 < arg2[local56][0] || arg1 == arg2[local56][0] && arg0 < arg2[local56][1]) {
					local34 = local56;
				} else {
					local13 = local56;
				}
			} while (local13 != local34 && local13 + 1 != local34);
			return false;
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("98348, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 33183 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZWRCNFEU", name = "a", descriptor = "(BCCC)I")
	private static int method562(@OriginalArg(1) char arg0, @OriginalArg(2) char arg1, @OriginalArg(3) char arg2) {
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
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("22450, " + 42 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZWRCNFEU", name = "a", descriptor = "(ZCCC)I")
	private static int method563(@OriginalArg(1) char arg0, @OriginalArg(2) char arg1, @OriginalArg(3) char arg2) {
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
			signlink.reporterror("92039, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local517.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZWRCNFEU", name = "a", descriptor = "(CI)B")
	private static byte method564(@OriginalArg(0) char arg0) {
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
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("82684, " + arg0 + ", " + 7 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZWRCNFEU", name = "b", descriptor = "([CI)V")
	private static void method565(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(7) int local7;
			if (arg1 != 0) {
				for (local7 = 1; local7 > 0; local7++) {
				}
			}
			local7 = 0;
			@Pc(16) int local16 = 0;
			@Pc(18) int local18 = 0;
			while (true) {
				do {
					@Pc(117) int local117;
					if ((local117 = method566(local7, arg0)) == -1) {
						return;
					}
					@Pc(22) boolean local22 = false;
					for (@Pc(24) int local24 = local7; local24 >= 0 && local24 < local117 && !local22; local24++) {
						if (!method568(arg0[local24]) && !method569(arg0[local24], aBoolean231)) {
							local22 = true;
						}
					}
					if (local22) {
						local16 = 0;
					}
					if (local16 == 0) {
						local18 = local117;
					}
					local7 = method567(arg0, local117);
					@Pc(63) int local63 = 0;
					for (@Pc(65) int local65 = local117; local65 < local7; local65++) {
						local63 = local63 * 10 + arg0[local65] - 48;
					}
					if (local63 <= 255 && local7 - local117 <= 8) {
						local16++;
					} else {
						local16 = 0;
					}
				} while (local16 != 4);
				for (@Pc(99) int local99 = local18; local99 < local7; local99++) {
					arg0[local99] = '*';
				}
				local16 = 0;
			}
		} catch (@Pc(121) RuntimeException local121) {
			signlink.reporterror("52324, " + arg0 + ", " + arg1 + ", " + local121.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZWRCNFEU", name = "a", descriptor = "(II[C)I")
	private static int method566(@OriginalArg(0) int arg0, @OriginalArg(2) char[] arg1) {
		try {
			for (@Pc(1) int local1 = arg0; local1 < arg1.length && local1 >= 0; local1++) {
				if (arg1[local1] >= '0' && arg1[local1] <= '9') {
					return local1;
				}
			}
			return -1;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("65343, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZWRCNFEU", name = "a", descriptor = "(Z[CI)I")
	private static int method567(@OriginalArg(1) char[] arg0, @OriginalArg(2) int arg1) {
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
			signlink.reporterror("60542, " + false + ", " + arg0 + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZWRCNFEU", name = "a", descriptor = "(BC)Z")
	private static boolean method568(@OriginalArg(1) char arg0) {
		try {
			return !method570(arg0) && !method571(arg0);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("38606, " + -90 + ", " + arg0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZWRCNFEU", name = "b", descriptor = "(CZ)Z")
	private static boolean method569(@OriginalArg(0) char arg0, @OriginalArg(1) boolean arg1) {
		try {
			if (!arg1) {
				throw new NullPointerException();
			} else if (arg0 >= 'a' && arg0 <= 'z') {
				return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
			} else {
				return true;
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("283, " + arg0 + ", " + arg1 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZWRCNFEU", name = "a", descriptor = "(ZC)Z")
	private static boolean method570(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("35792, " + true + ", " + arg0 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZWRCNFEU", name = "a", descriptor = "(IC)Z")
	private static boolean method571(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= '0' && arg0 <= '9';
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("61655, " + 2232 + ", " + arg0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZWRCNFEU", name = "a", descriptor = "(CB)Z")
	private static boolean method572(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z';
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("47535, " + arg0 + ", " + 84 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZWRCNFEU", name = "b", descriptor = "(CI)Z")
	private static boolean method573(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("86420, " + arg0 + ", " + 5066 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZWRCNFEU", name = "a", descriptor = "([CZ)Z")
	private static boolean method574(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				if (!method571(arg0[local5]) && arg0[local5] != '\u0000') {
					local3 = false;
				}
			}
			if (local3) {
				return true;
			}
			@Pc(32) int local32 = method575(arg0);
			@Pc(34) int local34 = 0;
			@Pc(45) int local45 = anIntArray208.length - 1;
			if (local32 == anIntArray208[0] || local32 == anIntArray208[local45]) {
				return true;
			}
			do {
				@Pc(63) int local63 = (local34 + local45) / 2;
				if (local32 == anIntArray208[local63]) {
					return true;
				}
				if (local32 < anIntArray208[local63]) {
					local45 = local63;
				} else {
					local34 = local63;
				}
			} while (local34 != local45 && local34 + 1 != local45);
			return false;
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("56395, " + arg0 + ", " + false + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZWRCNFEU", name = "c", descriptor = "([CI)I")
	private static int method575(@OriginalArg(0) char[] arg0) {
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
			signlink.reporterror("16335, " + arg0 + ", " + 5 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}
}
