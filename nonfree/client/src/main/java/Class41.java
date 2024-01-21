import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!sc")
public final class Class41 {

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "Z")
	private static boolean aBoolean218;

	@OriginalMember(owner = "client!sc", name = "j", descriptor = "[I")
	private static int[] anIntArray250;

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "[[C")
	private static char[][] aCharArrayArray1;

	@OriginalMember(owner = "client!sc", name = "l", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!sc", name = "m", descriptor = "[[C")
	private static char[][] aCharArrayArray2;

	@OriginalMember(owner = "client!sc", name = "n", descriptor = "[[C")
	private static char[][] aCharArrayArray3;

	@OriginalMember(owner = "client!sc", name = "o", descriptor = "[I")
	private static int[] anIntArray251;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "B")
	private static byte aByte42 = -21;

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
	private static int anInt918 = 640;

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "Z")
	private static boolean aBoolean217 = true;

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
	private static int anInt919 = 5;

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "B")
	private static byte aByte43 = -61;

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
	private static int anInt920 = 7;

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
	private static int anInt921 = 7;

	@OriginalMember(owner = "client!sc", name = "i", descriptor = "B")
	private static byte aByte44 = -128;

	@OriginalMember(owner = "client!sc", name = "p", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray12 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops" };

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!yb;)V")
	public static void method603(@OriginalArg(0) Class48 arg0) {
		@Pc(10) Class1_Sub1_Sub3 local10 = new Class1_Sub1_Sub3(arg0.method678("fragmentsenc.txt", null), 337);
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(arg0.method678("badenc.txt", null), 337);
		@Pc(28) Class1_Sub1_Sub3 local28 = new Class1_Sub1_Sub3(arg0.method678("domainenc.txt", null), 337);
		@Pc(37) Class1_Sub1_Sub3 local37 = new Class1_Sub1_Sub3(arg0.method678("tldlist.txt", null), 337);
		method604(local10, local19, local28, local37);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!mb;Lclient!mb;Lclient!mb;Lclient!mb;)V")
	private static void method604(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) Class1_Sub1_Sub3 arg2, @OriginalArg(3) Class1_Sub1_Sub3 arg3) {
		method606(arg1);
		method607(arg2);
		method608(arg0);
		method605(640, arg3);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!mb;)V")
	private static void method605(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			@Pc(4) int local4 = arg1.method503();
			aCharArrayArray3 = new char[local4][];
			anIntArray251 = new int[local4];
			@Pc(14) boolean local14 = false;
			for (@Pc(16) int local16 = 0; local16 < local4; local16++) {
				anIntArray251[local16] = arg1.method498();
				@Pc(27) char[] local27 = new char[arg1.method498()];
				for (@Pc(29) int local29 = 0; local29 < local27.length; local29++) {
					local27[local29] = (char) arg1.method498();
				}
				aCharArrayArray3[local16] = local27;
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("85312, " + arg0 + ", " + arg1 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!mb;I)V")
	private static void method606(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(2) int local2 = arg0.method503();
			aCharArrayArray1 = new char[local2][];
			aByteArrayArrayArray8 = new byte[local2][][];
			method609(arg0, aByteArrayArrayArray8, aCharArrayArray1);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("84605, " + arg0 + ", " + 466 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!mb;B)V")
	private static void method607(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(2) int local2 = arg0.method503();
			aCharArrayArray2 = new char[local2][];
			method610(aCharArrayArray2, arg0);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("63217, " + arg0 + ", " + 126 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(ILclient!mb;)V")
	private static void method608(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			anIntArray250 = new int[arg0.method503()];
			for (@Pc(16) int local16 = 0; local16 < anIntArray250.length; local16++) {
				anIntArray250[local16] = arg0.method500();
			}
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("65881, " + 182 + ", " + arg0 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!mb;[[[B[[CI)V")
	private static void method609(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) char[][] arg2) {
		try {
			for (@Pc(6) int local6 = 0; local6 < arg2.length; local6++) {
				@Pc(12) char[] local12 = new char[arg0.method498()];
				for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
					local12[local14] = (char) arg0.method498();
				}
				arg2[local6] = local12;
				@Pc(36) byte[][] local36 = new byte[arg0.method498()][2];
				for (@Pc(38) int local38 = 0; local38 < local36.length; local38++) {
					local36[local38][0] = (byte) arg0.method498();
					local36[local38][1] = (byte) arg0.method498();
				}
				if (local36.length > 0) {
					arg1[local6] = local36;
				}
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("53224, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z[[CLclient!mb;)V")
	private static void method610(@OriginalArg(1) char[][] arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			for (@Pc(12) int local12 = 0; local12 < arg0.length; local12++) {
				@Pc(18) char[] local18 = new char[arg1.method498()];
				for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
					local18[local20] = (char) arg1.method498();
				}
				arg0[local12] = local18;
			}
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("63703, " + true + ", " + arg0 + ", " + arg1 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[C)V")
	private static void method611(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) int local3 = 0;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				if (method612(arg0[local5])) {
					arg0[local3] = arg0[local5];
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
			signlink.reporterror("4009, " + 7137 + ", " + arg0 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(CZ)Z")
	private static boolean method612(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= ' ' && arg0 <= '\u007f' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("67234, " + arg0 + ", " + true + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method613(@OriginalArg(1) String arg0) {
		try {
			@Pc(3) long local3 = System.currentTimeMillis();
			@Pc(6) char[] local6 = arg0.toCharArray();
			method611(local6);
			@Pc(15) String local15 = (new String(local6)).trim();
			@Pc(19) char[] local19 = local15.toLowerCase().toCharArray();
			@Pc(22) String local22 = local15.toLowerCase();
			method621(aByte43, local19);
			method616(local19);
			method617(local19, 236);
			method630(local19);
			for (@Pc(42) int local42 = 0; local42 < aStringArray12.length; local42++) {
				@Pc(52) int local52 = -1;
				while ((local52 = local22.indexOf(aStringArray12[local42], local52 + 1)) != -1) {
					@Pc(59) char[] local59 = aStringArray12[local42].toCharArray();
					for (@Pc(61) int local61 = 0; local61 < local59.length; local61++) {
						local19[local61 + local52] = local59[local61];
					}
				}
			}
			method614(local15.toCharArray(), 350, local19);
			method615(local19);
			@Pc(103) long local103 = System.currentTimeMillis();
			return (new String(local19)).trim();
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("79319, " + 103 + ", " + arg0 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CI[C)V")
	private static void method614(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) char[] arg2) {
		try {
			for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
				if (arg2[local1] != '*' && method638(arg0[local1])) {
					arg2[local1] = arg0[local1];
				}
			}
			@Pc(29) boolean local29 = false;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("34520, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(I[C)V")
	private static void method615(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(12) boolean local12 = true;
			for (@Pc(14) int local14 = 0; local14 < arg0.length; local14++) {
				@Pc(20) char local20 = arg0[local14];
				if (!method635(local20)) {
					local12 = true;
				} else if (local12) {
					if (method637(local20)) {
						local12 = false;
					}
				} else if (method638(local20)) {
					arg0[local14] = (char) (local20 + 'a' - 65);
				}
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("19312, " + -613 + ", " + arg0 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(I[C)V")
	private static void method616(@OriginalArg(1) char[] arg0) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 2; local3++) {
				for (@Pc(10) int local10 = aCharArrayArray1.length - 1; local10 >= 0; local10--) {
					method625(aCharArrayArray1[local10], aByteArrayArrayArray8[local10], arg0);
				}
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("46306, " + -11848 + ", " + arg0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CI)V")
	private static void method617(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(18) char[] local18 = new char[] { '(', 'a', ')' };
			@Pc(22) boolean local22 = false;
			method625(local18, null, local3);
			@Pc(31) char[] local31 = (char[]) arg0.clone();
			@Pc(46) char[] local46 = new char[] { 'd', 'o', 't' };
			method625(local46, null, local31);
			for (@Pc(56) int local56 = aCharArrayArray2.length - 1; local56 >= 0; local56--) {
				method618(arg0, local3, local31, aCharArrayArray2[local56]);
			}
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("41945, " + arg0 + ", " + arg1 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CB[C[C[C)V")
	private static void method618(@OriginalArg(0) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2, @OriginalArg(4) char[] arg3) {
		try {
			if (arg3.length <= arg0.length) {
				@Pc(29) int local29;
				for (@Pc(21) int local21 = 0; local21 <= arg0.length - arg3.length; local21 += local29) {
					@Pc(25) int local25 = local21;
					@Pc(27) int local27 = 0;
					local29 = 1;
					label58: while (true) {
						while (true) {
							if (local25 >= arg0.length) {
								break label58;
							}
							@Pc(37) char local37 = arg0[local25];
							@Pc(39) char local39 = 0;
							if (local25 + 1 < arg0.length) {
								local39 = arg0[local25 + 1];
							}
							@Pc(64) int local64;
							if (local27 < arg3.length && (local64 = method627(arg3[local27], local37, local39)) > 0) {
								local25 += local64;
								local27++;
							} else {
								if (local27 == 0) {
									break label58;
								}
								@Pc(85) int local85;
								if ((local85 = method627(arg3[local27 - 1], local37, local39)) > 0) {
									local25 += local85;
									if (local27 == 1) {
										local29++;
									}
								} else {
									if (local27 >= arg3.length || !method633(local37)) {
										break label58;
									}
									local25++;
								}
							}
						}
					}
					if (local27 >= arg3.length) {
						@Pc(116) boolean local116 = false;
						@Pc(122) int local122 = method619(arg1, local21, arg0);
						@Pc(130) int local130 = method620(local25 - 1, arg0, arg2);
						if (local122 > 2 || local130 > 2) {
							local116 = true;
						}
						if (local116) {
							for (@Pc(142) int local142 = local21; local142 < local25; local142++) {
								arg0[local142] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(165) RuntimeException local165) {
			signlink.reporterror("83161, " + arg0 + ", " + 7 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local165.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CI[CI)I")
	private static int method619(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) char[] arg2) {
		try {
			if (arg1 == 0) {
				return 2;
			}
			for (@Pc(18) int local18 = arg1 - 1; local18 >= 0 && method633(arg2[local18]); local18--) {
				if (arg2[local18] == '@') {
					return 3;
				}
			}
			@Pc(38) int local38 = 0;
			for (@Pc(42) int local42 = arg1 - 1; local42 >= 0 && method633(arg0[local42]); local42--) {
				if (arg0[local42] == '*') {
					local38++;
				}
			}
			if (local38 >= 3) {
				return 4;
			} else if (method633(arg2[arg1 - 1])) {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("30753, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[C[CI)I")
	private static int method620(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2) {
		try {
			if (arg0 + 1 == arg1.length) {
				return 2;
			}
			@Pc(13) int local13 = arg0 + 1;
			while (true) {
				if (local13 < arg1.length && method633(arg1[local13])) {
					if (arg1[local13] != '.' && arg1[local13] != ',') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(40) int local40 = 0;
				if (anInt919 <= 5 && anInt919 >= 5) {
					for (@Pc(52) int local52 = arg0 + 1; local52 < arg1.length && method633(arg2[local52]); local52++) {
						if (arg2[local52] == '*') {
							local40++;
						}
					}
					if (local40 >= 3) {
						return 4;
					}
					if (method633(arg1[arg0 + 1])) {
						return 1;
					}
					return 0;
				}
				return 4;
			}
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("77912, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 5 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(B[C)V")
	private static void method621(@OriginalArg(0) byte arg0, @OriginalArg(1) char[] arg1) {
		try {
			@Pc(3) char[] local3 = (char[]) arg1.clone();
			@Pc(18) char[] local18 = new char[] { 'd', 'o', 't' };
			method625(local18, null, local3);
			@Pc(27) char[] local27 = (char[]) arg1.clone();
			@Pc(50) char[] local50 = new char[] { 's', 'l', 'a', 's', 'h' };
			method625(local50, null, local27);
			for (@Pc(57) int local57 = 0; local57 < aCharArrayArray3.length; local57++) {
				method622(local27, aCharArrayArray3[local57], local3, anIntArray251[local57], arg1);
			}
			if (arg0 == -61) {
				;
			}
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("35909, " + arg0 + ", " + arg1 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CZ[C[CI[C)V")
	private static void method622(@OriginalArg(0) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) char[] arg4) {
		try {
			if (arg1.length <= arg4.length) {
				@Pc(22) int local22;
				for (@Pc(14) int local14 = 0; local14 <= arg4.length - arg1.length; local14 += local22) {
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
							if (local20 < arg1.length && (local57 = method627(arg1[local20], local30, local32)) > 0) {
								local18 += local57;
								local20++;
							} else {
								if (local20 == 0) {
									break label120;
								}
								@Pc(78) int local78;
								if ((local78 = method627(arg1[local20 - 1], local30, local32)) > 0) {
									local18 += local78;
									if (local20 == 1) {
										local22++;
									}
								} else {
									if (local20 >= arg1.length || !method633(local30)) {
										break label120;
									}
									local18++;
								}
							}
						}
					}
					if (local20 >= arg1.length) {
						@Pc(109) boolean local109 = false;
						@Pc(115) int local115 = method623(arg2, arg4, local14);
						@Pc(123) int local123 = method624(anInt920, local18 - 1, arg0, arg4);
						if (arg3 == 1 && local115 > 0 && local123 > 0) {
							local109 = true;
						}
						if (arg3 == 2 && (local115 > 2 && local123 > 0 || local115 > 0 && local123 > 2)) {
							local109 = true;
						}
						if (arg3 == 3 && local115 > 0 && local123 > 2) {
							local109 = true;
						}
						@Pc(166) boolean local166;
						if (arg3 == 3 && local115 > 2 && local123 > 0) {
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
											if (arg2[local189] != '*') {
												break;
											}
											local173 = local189;
										} else if (arg2[local189] == '*') {
											local173 = local189;
											local185 = true;
										}
									}
								}
								local185 = false;
								for (local189 = local173 - 1; local189 >= 0; local189--) {
									if (local185) {
										if (method633(arg4[local189])) {
											break;
										}
										local173 = local189;
									} else if (!method633(arg4[local189])) {
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
											if (arg0[local189] != '*') {
												break;
											}
											local177 = local189;
										} else if (arg0[local189] == '*') {
											local177 = local189;
											local185 = true;
										}
									}
								}
								local185 = false;
								for (local189 = local177 + 1; local189 < arg4.length; local189++) {
									if (local185) {
										if (method633(arg4[local189])) {
											break;
										}
										local177 = local189;
									} else if (!method633(arg4[local189])) {
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
			signlink.reporterror("25913, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local346.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([C[CIZ)I")
	private static int method623(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg2 == 0) {
				return 2;
			}
			@Pc(18) int local18 = arg2 - 1;
			while (true) {
				if (local18 >= 0 && method633(arg1[local18])) {
					if (arg1[local18] != ',' && arg1[local18] != '.') {
						local18--;
						continue;
					}
					return 3;
				}
				@Pc(43) int local43 = 0;
				for (@Pc(47) int local47 = arg2 - 1; local47 >= 0 && method633(arg0[local47]); local47--) {
					if (arg0[local47] == '*') {
						local43++;
					}
				}
				if (local43 >= 3) {
					return 4;
				}
				if (method633(arg1[arg2 - 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("87502, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(II[C[C)I")
	private static int method624(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) char[] arg3) {
		try {
			@Pc(9) int local9;
			if (arg0 < anInt921 || arg0 > anInt921) {
				for (local9 = 1; local9 > 0; local9++) {
				}
			}
			if (arg1 + 1 == arg3.length) {
				return 2;
			}
			local9 = arg1 + 1;
			while (true) {
				if (local9 < arg3.length && method633(arg3[local9])) {
					if (arg3[local9] != '\\' && arg3[local9] != '/') {
						local9++;
						continue;
					}
					return 3;
				}
				@Pc(53) int local53 = 0;
				for (@Pc(57) int local57 = arg1 + 1; local57 < arg3.length && method633(arg2[local57]); local57++) {
					if (arg2[local57] == '*') {
						local53++;
					}
				}
				if (local53 >= 5) {
					return 4;
				}
				if (method633(arg3[arg1 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(95) RuntimeException local95) {
			signlink.reporterror("63701, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local95.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[C[[B[C)V")
	private static void method625(@OriginalArg(1) char[] arg0, @OriginalArg(2) byte[][] arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg0.length <= arg2.length) {
				@Pc(24) int local24;
				for (@Pc(14) int local14 = 0; local14 <= arg2.length - arg0.length; local14 += local24) {
					@Pc(18) int local18 = local14;
					@Pc(20) int local20 = 0;
					@Pc(22) int local22 = 0;
					local24 = 1;
					@Pc(26) boolean local26 = false;
					@Pc(28) boolean local28 = false;
					@Pc(30) boolean local30 = false;
					@Pc(38) char var12;
					@Pc(40) char var13;
					label162: while (true) {
						while (true) {
							if (local18 >= arg2.length || local28 && local30) {
								break label162;
							}
							var12 = arg2[local18];
							var13 = '\u0000';
							if (local18 + 1 < arg2.length) {
								var13 = arg2[local18 + 1];
							}
							@Pc(65) int local65;
							if (local20 < arg0.length && (local65 = method628(var13, var12, arg0[local20])) > 0) {
								if (local65 == 1 && method636(var12)) {
									local28 = true;
								}
								if (local65 == 2 && (method636(var12) || method636(var13))) {
									local28 = true;
								}
								local18 += local65;
								local20++;
							} else {
								if (local20 == 0) {
									break label162;
								}
								@Pc(108) int local108;
								if ((local108 = method628(var13, var12, arg0[local20 - 1])) > 0) {
									local18 += local108;
									if (local20 == 1) {
										local24++;
									}
								} else {
									if (local20 >= arg0.length || !method634(var12, (byte) 7)) {
										break label162;
									}
									if (method633(var12) && var12 != '\'') {
										local26 = true;
									}
									if (method636(var12)) {
										local30 = true;
									}
									local18++;
									local22++;
									if (local22 * 100 / (local18 - local14) > 90) {
										break label162;
									}
								}
							}
						}
					}
					if (local20 >= arg0.length && (!local28 || !local30)) {
						@Pc(173) boolean local173 = true;
						@Pc(269) int local269;
						if (local26) {
							@Pc(219) boolean local219 = false;
							@Pc(221) boolean local221 = false;
							if (local14 - 1 < 0 || method633(arg2[local14 - 1]) && arg2[local14 - 1] != '\'') {
								local219 = true;
							}
							if (local18 >= arg2.length || method633(arg2[local18]) && arg2[local18] != '\'') {
								local221 = true;
							}
							if (!local219 || !local221) {
								@Pc(265) boolean local265 = false;
								local269 = local14 - 2;
								if (local219) {
									local269 = local14;
								}
								while (!local265 && local269 < local18) {
									if (local269 >= 0 && (!method633(arg2[local269]) || arg2[local269] == '\'')) {
										@Pc(291) char[] local291 = new char[3];
										@Pc(293) int local293;
										for (local293 = 0; local293 < 3 && local269 + local293 < arg2.length && (!method633(arg2[local269 + local293]) || arg2[local269 + local293] == '\''); local293++) {
											local291[local293] = arg2[local269 + local293];
										}
										@Pc(331) boolean local331 = true;
										if (local293 == 0) {
											local331 = false;
										}
										if (local293 < 3 && local269 - 1 >= 0 && (!method633(arg2[local269 - 1]) || arg2[local269 - 1] == '\'')) {
											local331 = false;
										}
										if (local331 && !method639(local291)) {
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
								var12 = arg2[local14 - 1];
							}
							var13 = ' ';
							if (local18 < arg2.length) {
								var13 = arg2[local18];
							}
							@Pc(201) byte local201 = method629(var12);
							@Pc(205) byte local205 = method629(var13);
							if (arg1 != null && method626(arg1, local201, local205)) {
								local173 = false;
							}
						}
						if (local173) {
							@Pc(381) int local381 = 0;
							@Pc(383) int local383 = 0;
							@Pc(385) int local385 = -1;
							for (local269 = local14; local269 < local18; local269++) {
								if (method636(arg2[local269])) {
									local381++;
								} else if (method635(arg2[local269])) {
									local383++;
									local385 = local269;
								}
							}
							if (local385 > -1) {
								local381 -= local18 + 1 - local385;
							}
							if (local381 <= local383) {
								for (@Pc(427) int local427 = local14; local427 < local18; local427++) {
									arg2[local427] = '*';
								}
							}
						}
					}
				}
			}
		} catch (@Pc(450) RuntimeException local450) {
			signlink.reporterror("31607, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local450.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([[BBZB)Z")
	private static boolean method626(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte arg1, @OriginalArg(3) byte arg2) {
		try {
			@Pc(1) int local1 = 0;
			if (arg0[0][0] == arg1 && arg0[0][1] == arg2) {
				return true;
			}
			@Pc(22) int local22 = arg0.length - 1;
			if (arg0[local22][0] == arg1 && arg0[local22][1] == arg2) {
				return true;
			}
			do {
				@Pc(48) int local48 = (local1 + local22) / 2;
				if (arg0[local48][0] == arg1 && arg0[local48][1] == arg2) {
					return true;
				}
				if (arg1 < arg0[local48][0] || arg1 == arg0[local48][0] && arg2 < arg0[local48][1]) {
					local22 = local48;
				} else {
					local1 = local48;
				}
			} while (local1 != local22 && local1 + 1 != local22);
			return false;
		} catch (@Pc(102) RuntimeException local102) {
			signlink.reporterror("66559, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + local102.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(CZCC)I")
	private static int method627(@OriginalArg(0) char arg0, @OriginalArg(2) char arg1, @OriginalArg(3) char arg2) {
		try {
			if (arg0 == arg1) {
				return 1;
			} else if (arg0 == 'o' && arg1 == '0') {
				return 1;
			} else if (arg0 == 'o' && arg1 == '(' && arg2 == ')') {
				return 2;
			} else if (arg0 == 'c' && (arg1 == '(' || arg1 == '<' || arg1 == '[')) {
				return 1;
			} else if (arg0 == 'e' && arg1 == '€') {
				return 1;
			} else if (arg0 == 's' && arg1 == '$') {
				return 1;
			} else if (arg0 == 'l' && arg1 == 'i') {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("14345, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(CCCZ)I")
	private static int method628(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(2) char arg2) {
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
		} catch (@Pc(517) RuntimeException local517) {
			signlink.reporterror("71603, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + local517.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(CB)B")
	private static byte method629(@OriginalArg(0) char arg0) {
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
			signlink.reporterror("38948, " + arg0 + ", " + 75 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "([CI)V")
	private static void method630(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(5) int local5 = 0;
			@Pc(10) int local10 = 0;
			@Pc(12) int local12 = 0;
			while (true) {
				do {
					@Pc(111) int local111;
					if ((local111 = method631(arg0, local5)) == -1) {
						return;
					}
					@Pc(16) boolean local16 = false;
					for (@Pc(18) int local18 = local5; local18 >= 0 && local18 < local111 && !local16; local18++) {
						if (!method633(arg0[local18]) && !method634(arg0[local18], (byte) 7)) {
							local16 = true;
						}
					}
					if (local16) {
						local10 = 0;
					}
					if (local10 == 0) {
						local12 = local111;
					}
					local5 = method632(arg0, local111, 699);
					@Pc(57) int local57 = 0;
					for (@Pc(59) int local59 = local111; local59 < local5; local59++) {
						local57 = local57 * 10 + arg0[local59] - 48;
					}
					if (local57 <= 255 && local5 - local111 <= 8) {
						local10++;
					} else {
						local10 = 0;
					}
				} while (local10 != 4);
				for (@Pc(93) int local93 = local12; local93 < local5; local93++) {
					arg0[local93] = '*';
				}
				local10 = 0;
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("2396, " + arg0 + ", " + 0 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CII)I")
	private static int method631(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1) {
		try {
			for (@Pc(5) int local5 = arg1; local5 < arg0.length && local5 >= 0; local5++) {
				if (arg0[local5] >= '0' && arg0[local5] <= '9') {
					return local5;
				}
			}
			return -1;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("62536, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "([CII)I")
	private static int method632(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(3) boolean local3 = false;
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
			signlink.reporterror("93597, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(CB)Z")
	private static boolean method633(@OriginalArg(0) char arg0) {
		try {
			return !method635(arg0) && !method636(arg0);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("3432, " + arg0 + ", " + 3 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(CB)Z")
	private static boolean method634(@OriginalArg(0) char arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(4) boolean local4 = false;
			if (arg0 >= 'a' && arg0 <= 'z') {
				return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
			} else {
				return true;
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("7949, " + arg0 + ", " + arg1 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZC)Z")
	private static boolean method635(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("49901, " + false + ", " + arg0 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IC)Z")
	private static boolean method636(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= '0' && arg0 <= '9';
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("78260, " + -454 + ", " + arg0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(IC)Z")
	private static boolean method637(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z';
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("72181, " + 599 + ", " + arg0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BC)Z")
	private static boolean method638(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("10903, " + 0 + ", " + arg0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CB)Z")
	private static boolean method639(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				if (!method636(arg0[local5]) && arg0[local5] != '\u0000') {
					local3 = false;
				}
			}
			if (local3) {
				return true;
			}
			@Pc(32) int local32 = method640(arg0);
			@Pc(37) int local37;
			if (aByte44 != -128) {
				for (local37 = 1; local37 > 0; local37++) {
				}
			}
			local37 = 0;
			@Pc(49) int local49 = anIntArray250.length - 1;
			if (local32 == anIntArray250[0] || local32 == anIntArray250[local49]) {
				return true;
			}
			do {
				@Pc(67) int local67 = (local37 + local49) / 2;
				if (local32 == anIntArray250[local67]) {
					return true;
				}
				if (local32 < anIntArray250[local67]) {
					local49 = local67;
				} else {
					local37 = local67;
				}
			} while (local37 != local49 && local37 + 1 != local49);
			return false;
		} catch (@Pc(96) RuntimeException local96) {
			signlink.reporterror("1538, " + arg0 + ", " + -128 + ", " + local96.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(B[C)I")
	private static int method640(@OriginalArg(1) char[] arg0) {
		try {
			if (arg0.length > 6) {
				return 0;
			}
			@Pc(9) int local9 = 0;
			for (@Pc(20) int local20 = 0; local20 < arg0.length; local20++) {
				@Pc(31) char local31 = arg0[arg0.length - local20 - 1];
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
			signlink.reporterror("23446, " + 0 + ", " + arg0 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}
}
