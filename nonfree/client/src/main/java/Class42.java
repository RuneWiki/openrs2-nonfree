import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!sc")
public final class Class42 {

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "Z")
	private static boolean aBoolean228;

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "Z")
	private static boolean aBoolean229;

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "[I")
	private static int[] anIntArray254;

	@OriginalMember(owner = "client!sc", name = "l", descriptor = "[[C")
	private static char[][] aCharArrayArray1;

	@OriginalMember(owner = "client!sc", name = "m", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!sc", name = "n", descriptor = "[[C")
	private static char[][] aCharArrayArray2;

	@OriginalMember(owner = "client!sc", name = "o", descriptor = "[[C")
	private static char[][] aCharArrayArray3;

	@OriginalMember(owner = "client!sc", name = "p", descriptor = "[I")
	private static int[] anIntArray255;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
	private static int anInt946 = 1000;

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "B")
	private static byte aByte34 = 127;

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
	private static int anInt947 = -851;

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
	private static int anInt948 = -144;

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "B")
	private static byte aByte35 = 23;

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "B")
	private static byte aByte36 = 6;

	@OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
	private static int anInt949 = -173;

	@OriginalMember(owner = "client!sc", name = "q", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray13 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!xb;)V")
	public static void method594(@OriginalArg(0) Class47 arg0) {
		@Pc(10) Class1_Sub1_Sub3 local10 = new Class1_Sub1_Sub3(anInt946, arg0.method666("fragmentsenc.txt", null));
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(anInt946, arg0.method666("badenc.txt", null));
		@Pc(28) Class1_Sub1_Sub3 local28 = new Class1_Sub1_Sub3(anInt946, arg0.method666("domainenc.txt", null));
		@Pc(37) Class1_Sub1_Sub3 local37 = new Class1_Sub1_Sub3(anInt946, arg0.method666("tldlist.txt", null));
		method595(local10, local19, local28, local37);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!lb;Lclient!lb;Lclient!lb;Lclient!lb;)V")
	private static void method595(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) Class1_Sub1_Sub3 arg2, @OriginalArg(3) Class1_Sub1_Sub3 arg3) {
		method597(arg1, aByte34);
		method598(anInt947, arg2);
		method599(arg0);
		method596(arg3);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!lb;Z)V")
	private static void method596(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(4) int local4 = arg0.method485();
			aCharArrayArray3 = new char[local4][];
			anIntArray255 = new int[local4];
			for (@Pc(12) int local12 = 0; local12 < local4; local12++) {
				anIntArray255[local12] = arg0.method480();
				@Pc(23) char[] local23 = new char[arg0.method480()];
				for (@Pc(25) int local25 = 0; local25 < local23.length; local25++) {
					local23[local25] = (char) arg0.method480();
				}
				aCharArrayArray3[local12] = local23;
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("13490, " + arg0 + ", " + false + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!lb;B)V")
	private static void method597(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(2) int local2 = arg0.method485();
			aCharArrayArray1 = new char[local2][];
			aByteArrayArrayArray8 = new byte[local2][][];
			method600(aCharArrayArray1, aByteArrayArrayArray8, anInt948, arg0);
			if (arg1 == aByte34) {
				;
			}
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("5142, " + arg0 + ", " + arg1 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!lb;)V")
	private static void method598(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			while (arg0 >= 0) {
			}
			@Pc(12) int local12 = arg1.method485();
			aCharArrayArray2 = new char[local12][];
			method601(arg1, aCharArrayArray2);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("89564, " + arg0 + ", " + arg1 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!lb;I)V")
	private static void method599(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			anIntArray254 = new int[arg0.method485()];
			for (@Pc(8) int local8 = 0; local8 < anIntArray254.length; local8++) {
				anIntArray254[local8] = arg0.method482();
			}
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("52066, " + arg0 + ", " + 0 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([[C[[[BILclient!lb;)V")
	private static void method600(@OriginalArg(0) char[][] arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub1_Sub3 arg3) {
		try {
			while (arg2 >= 0) {
				anInt948 = -163;
			}
			for (@Pc(9) int local9 = 0; local9 < arg0.length; local9++) {
				@Pc(15) char[] local15 = new char[arg3.method480()];
				for (@Pc(17) int local17 = 0; local17 < local15.length; local17++) {
					local15[local17] = (char) arg3.method480();
				}
				arg0[local9] = local15;
				@Pc(39) byte[][] local39 = new byte[arg3.method480()][2];
				for (@Pc(41) int local41 = 0; local41 < local39.length; local41++) {
					local39[local41][0] = (byte) arg3.method480();
					local39[local41][1] = (byte) arg3.method480();
				}
				if (local39.length > 0) {
					arg1[local9] = local39;
				}
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("51459, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!lb;I[[C)V")
	private static void method601(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(2) char[][] arg1) {
		try {
			for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
				@Pc(13) char[] local13 = new char[arg0.method480()];
				for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
					local13[local15] = (char) arg0.method480();
				}
				arg1[local7] = local13;
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("64928, " + arg0 + ", " + -11348 + ", " + arg1 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z[C)V")
	private static void method602(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) int local3 = 0;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				if (method603(arg0[local5])) {
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
			signlink.reporterror("40337, " + true + ", " + arg0 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IC)Z")
	private static boolean method603(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= ' ' && arg0 <= '\u007f' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("91275, " + 0 + ", " + arg0 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method604(@OriginalArg(0) byte arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(3) long local3 = System.currentTimeMillis();
			@Pc(6) char[] local6 = arg1.toCharArray();
			@Pc(11) boolean local11 = false;
			method602(local6);
			@Pc(32) String local32 = (new String(local6)).trim();
			@Pc(36) char[] local36 = local32.toLowerCase().toCharArray();
			@Pc(39) String local39 = local32.toLowerCase();
			method612(local36);
			method607(local36);
			method608((byte) 4, local36);
			method621(aByte36, local36);
			for (@Pc(53) int local53 = 0; local53 < aStringArray13.length; local53++) {
				@Pc(57) int local57 = -1;
				while ((local57 = local39.indexOf(aStringArray13[local53], local57 + 1)) != -1) {
					@Pc(64) char[] local64 = aStringArray13[local53].toCharArray();
					for (@Pc(66) int local66 = 0; local66 < local64.length; local66++) {
						local36[local66 + local57] = local64[local66];
					}
				}
			}
			method605(local32.toCharArray(), local36);
			method606(local36);
			@Pc(108) long local108 = System.currentTimeMillis();
			return (new String(local36)).trim();
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("86656, " + arg0 + ", " + arg1 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([C[CB)V")
	private static void method605(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1) {
		try {
			for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
				if (arg1[local1] != '*' && method629(arg0[local1])) {
					arg1[local1] = arg0[local1];
				}
			}
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("19926, " + arg0 + ", " + arg1 + ", " + -12 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(Z[C)V")
	private static void method606(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(11) boolean local11 = true;
			for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
				@Pc(19) char local19 = arg0[local13];
				if (!method626(local19)) {
					local11 = true;
				} else if (local11) {
					if (method628(local19)) {
						local11 = false;
					}
				} else if (method629(local19)) {
					arg0[local13] = (char) (local19 + 'a' - 65);
				}
			}
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("42920, " + false + ", " + arg0 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CB)V")
	private static void method607(@OriginalArg(0) char[] arg0) {
		try {
			for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
				for (@Pc(14) int local14 = aCharArrayArray1.length - 1; local14 >= 0; local14--) {
					method616(arg0, aCharArrayArray1[local14], aByteArrayArrayArray8[local14]);
				}
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("35562, " + arg0 + ", " + 105 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(B[C)V")
	private static void method608(@OriginalArg(0) byte arg0, @OriginalArg(1) char[] arg1) {
		try {
			@Pc(5) char[] local5 = (char[]) arg1.clone();
			@Pc(20) char[] local20 = new char[] { '(', 'a', ')' };
			method616(local5, local20, null);
			@Pc(29) char[] local29 = (char[]) arg1.clone();
			@Pc(44) char[] local44 = new char[] { 'd', 'o', 't' };
			@Pc(49) boolean local49 = false;
			method616(local29, local44, null);
			for (@Pc(68) int local68 = aCharArrayArray2.length - 1; local68 >= 0; local68--) {
				method609(arg1, local5, local29, aCharArrayArray2[local68]);
			}
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("12829, " + arg0 + ", " + arg1 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([C[CI[C[C)V")
	private static void method609(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(3) char[] arg2, @OriginalArg(4) char[] arg3) {
		try {
			if (arg3.length <= arg0.length) {
				@Pc(32) int local32;
				for (@Pc(24) int local24 = 0; local24 <= arg0.length - arg3.length; local24 += local32) {
					@Pc(28) int local28 = local24;
					@Pc(30) int local30 = 0;
					local32 = 1;
					label58: while (true) {
						while (true) {
							if (local28 >= arg0.length) {
								break label58;
							}
							@Pc(40) char local40 = arg0[local28];
							@Pc(42) char local42 = 0;
							if (local28 + 1 < arg0.length) {
								local42 = arg0[local28 + 1];
							}
							@Pc(67) int local67;
							if (local30 < arg3.length && (local67 = method618(local42, arg3[local30], local40)) > 0) {
								local28 += local67;
								local30++;
							} else {
								if (local30 == 0) {
									break label58;
								}
								@Pc(88) int local88;
								if ((local88 = method618(local42, arg3[local30 - 1], local40)) > 0) {
									local28 += local88;
									if (local30 == 1) {
										local32++;
									}
								} else {
									if (local30 >= arg3.length || !method624(local40)) {
										break label58;
									}
									local28++;
								}
							}
						}
					}
					if (local30 >= arg3.length) {
						@Pc(119) boolean local119 = false;
						@Pc(125) int local125 = method610(local24, arg0, arg1);
						@Pc(133) int local133 = method611(arg2, arg0, local28 - 1);
						if (local125 > 2 || local133 > 2) {
							local119 = true;
						}
						if (local119) {
							for (@Pc(145) int local145 = local24; local145 < local28; local145++) {
								arg0[local145] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(168) RuntimeException local168) {
			signlink.reporterror("5131, " + arg0 + ", " + arg1 + ", " + 3 + ", " + arg2 + ", " + arg3 + ", " + local168.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(II[C[C)I")
	private static int method610(@OriginalArg(1) int arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg0 == 0) {
				return 2;
			}
			for (@Pc(9) int local9 = arg0 - 1; local9 >= 0 && method624(arg1[local9]); local9--) {
				if (arg1[local9] == '@') {
					return 3;
				}
			}
			@Pc(29) int local29 = 0;
			for (@Pc(33) int local33 = arg0 - 1; local33 >= 0 && method624(arg2[local33]); local33--) {
				if (arg2[local33] == '*') {
					local29++;
				}
			}
			if (local29 >= 3) {
				return 4;
			} else if (method624(arg1[arg0 - 1])) {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("34704, " + 146 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([C[CBI)I")
	private static int method611(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 + 1 == arg1.length) {
				return 2;
			}
			@Pc(13) int local13 = arg2 + 1;
			while (true) {
				if (local13 < arg1.length && method624(arg1[local13])) {
					if (arg1[local13] != '.' && arg1[local13] != ',') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(45) int local45 = 0;
				for (@Pc(49) int local49 = arg2 + 1; local49 < arg1.length && method624(arg0[local49]); local49++) {
					if (arg0[local49] == '*') {
						local45++;
					}
				}
				if (local45 >= 3) {
					return 4;
				}
				if (method624(arg1[arg2 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("90754, " + arg0 + ", " + arg1 + ", " + 64 + ", " + arg2 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(Z[C)V")
	private static void method612(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(18) char[] local18 = new char[] { 'd', 'o', 't' };
			method616(local3, local18, null);
			@Pc(30) char[] local30 = (char[]) arg0.clone();
			@Pc(53) char[] local53 = new char[] { 's', 'l', 'a', 's', 'h' };
			method616(local30, local53, null);
			for (@Pc(60) int local60 = 0; local60 < aCharArrayArray3.length; local60++) {
				method613(anIntArray255[local60], local30, aCharArrayArray3[local60], arg0, local3);
			}
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("40413, " + false + ", " + arg0 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[CI[C[C[C)V")
	private static void method613(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(3) char[] arg2, @OriginalArg(4) char[] arg3, @OriginalArg(5) char[] arg4) {
		try {
			if (arg2.length <= arg3.length) {
				@Pc(26) int local26;
				for (@Pc(18) int local18 = 0; local18 <= arg3.length - arg2.length; local18 += local26) {
					@Pc(22) int local22 = local18;
					@Pc(24) int local24 = 0;
					local26 = 1;
					label120: while (true) {
						while (true) {
							if (local22 >= arg3.length) {
								break label120;
							}
							@Pc(34) char local34 = arg3[local22];
							@Pc(36) char local36 = 0;
							if (local22 + 1 < arg3.length) {
								local36 = arg3[local22 + 1];
							}
							@Pc(61) int local61;
							if (local24 < arg2.length && (local61 = method618(local36, arg2[local24], local34)) > 0) {
								local22 += local61;
								local24++;
							} else {
								if (local24 == 0) {
									break label120;
								}
								@Pc(82) int local82;
								if ((local82 = method618(local36, arg2[local24 - 1], local34)) > 0) {
									local22 += local82;
									if (local24 == 1) {
										local26++;
									}
								} else {
									if (local24 >= arg2.length || !method624(local34)) {
										break label120;
									}
									local22++;
								}
							}
						}
					}
					if (local24 >= arg2.length) {
						@Pc(113) boolean local113 = false;
						@Pc(119) int local119 = method614(arg3, local18, (byte) 7, arg4);
						@Pc(127) int local127 = method615(arg1, local22 - 1, arg3);
						if (arg0 == 1 && local119 > 0 && local127 > 0) {
							local113 = true;
						}
						if (arg0 == 2 && (local119 > 2 && local127 > 0 || local119 > 0 && local127 > 2)) {
							local113 = true;
						}
						if (arg0 == 3 && local119 > 0 && local127 > 2) {
							local113 = true;
						}
						@Pc(170) boolean local170;
						if (arg0 == 3 && local119 > 2 && local127 > 0) {
							local170 = true;
						} else {
							local170 = false;
						}
						if (local113) {
							@Pc(177) int local177 = local18;
							@Pc(181) int local181 = local22 - 1;
							@Pc(189) boolean local189;
							@Pc(193) int local193;
							if (local119 > 2) {
								if (local119 == 4) {
									local189 = false;
									for (local193 = local18 - 1; local193 >= 0; local193--) {
										if (local189) {
											if (arg4[local193] != '*') {
												break;
											}
											local177 = local193;
										} else if (arg4[local193] == '*') {
											local177 = local193;
											local189 = true;
										}
									}
								}
								local189 = false;
								for (local193 = local177 - 1; local193 >= 0; local193--) {
									if (local189) {
										if (method624(arg3[local193])) {
											break;
										}
										local177 = local193;
									} else if (!method624(arg3[local193])) {
										local189 = true;
										local177 = local193;
									}
								}
							}
							if (local127 > 2) {
								if (local127 == 4) {
									local189 = false;
									for (local193 = local181 + 1; local193 < arg3.length; local193++) {
										if (local189) {
											if (arg1[local193] != '*') {
												break;
											}
											local181 = local193;
										} else if (arg1[local193] == '*') {
											local181 = local193;
											local189 = true;
										}
									}
								}
								local189 = false;
								for (local193 = local181 + 1; local193 < arg3.length; local193++) {
									if (local189) {
										if (method624(arg3[local193])) {
											break;
										}
										local181 = local193;
									} else if (!method624(arg3[local193])) {
										local189 = true;
										local181 = local193;
									}
								}
							}
							for (@Pc(327) int local327 = local177; local327 <= local181; local327++) {
								arg3[local327] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(350) RuntimeException local350) {
			signlink.reporterror("38630, " + arg0 + ", " + arg1 + ", " + 7 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local350.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CIB[C)I")
	private static int method614(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) char[] arg3) {
		try {
			if (arg1 == 0) {
				return 2;
			}
			@Pc(9) int local9 = arg1 - 1;
			while (true) {
				if (local9 >= 0 && method624(arg0[local9])) {
					if (arg0[local9] != ',' && arg0[local9] != '.') {
						local9--;
						continue;
					}
					return 3;
				}
				@Pc(34) int local34 = 0;
				@Pc(39) boolean local39 = false;
				for (@Pc(47) int local47 = arg1 - 1; local47 >= 0 && method624(arg3[local47]); local47--) {
					if (arg3[local47] == '*') {
						local34++;
					}
				}
				if (local34 >= 3) {
					return 4;
				}
				if (method624(arg0[arg1 - 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("72708, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CI[CB)I")
	private static int method615(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) char[] arg2) {
		try {
			if (arg1 + 1 == arg2.length) {
				return 2;
			}
			@Pc(13) int local13 = arg1 + 1;
			while (true) {
				if (local13 < arg2.length && method624(arg2[local13])) {
					if (arg2[local13] != '\\' && arg2[local13] != '/') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(45) int local45 = 0;
				for (@Pc(49) int local49 = arg1 + 1; local49 < arg2.length && method624(arg0[local49]); local49++) {
					if (arg0[local49] == '*') {
						local45++;
					}
				}
				if (local45 >= 5) {
					return 4;
				}
				if (method624(arg2[arg1 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("17224, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -19 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[C[C[[B)V")
	private static void method616(@OriginalArg(1) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) byte[][] arg2) {
		try {
			if (arg1.length <= arg0.length) {
				@Pc(21) int local21;
				for (@Pc(11) int local11 = 0; local11 <= arg0.length - arg1.length; local11 += local21) {
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
							if (local15 >= arg0.length || local25 && local27) {
								break label165;
							}
							var12 = arg0[local15];
							var13 = '\u0000';
							if (local15 + 1 < arg0.length) {
								var13 = arg0[local15 + 1];
							}
							@Pc(62) int local62;
							if (local17 < arg1.length && (local62 = method619(arg1[local17], var13, var12)) > 0) {
								if (local62 == 1 && method627(var12)) {
									local25 = true;
								}
								if (local62 == 2 && (method627(var12) || method627(var13))) {
									local25 = true;
								}
								local15 += local62;
								local17++;
							} else {
								if (local17 == 0) {
									break label165;
								}
								@Pc(105) int local105;
								if ((local105 = method619(arg1[local17 - 1], var13, var12)) > 0) {
									local15 += local105;
									if (local17 == 1) {
										local21++;
									}
								} else {
									if (local17 >= arg1.length || !method625(var12)) {
										break label165;
									}
									if (method624(var12) && var12 != '\'') {
										local23 = true;
									}
									if (method627(var12)) {
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
							if (local11 - 1 < 0 || method624(arg0[local11 - 1]) && arg0[local11 - 1] != '\'') {
								local216 = true;
							}
							if (local15 >= arg0.length || method624(arg0[local15]) && arg0[local15] != '\'') {
								local218 = true;
							}
							if (!local216 || !local218) {
								@Pc(262) boolean local262 = false;
								local266 = local11 - 2;
								if (local216) {
									local266 = local11;
								}
								while (!local262 && local266 < local15) {
									if (local266 >= 0 && (!method624(arg0[local266]) || arg0[local266] == '\'')) {
										@Pc(288) char[] local288 = new char[3];
										@Pc(290) int local290;
										for (local290 = 0; local290 < 3 && local266 + local290 < arg0.length && (!method624(arg0[local266 + local290]) || arg0[local266 + local290] == '\''); local290++) {
											local288[local290] = arg0[local266 + local290];
										}
										@Pc(328) boolean local328 = true;
										if (local290 == 0) {
											local328 = false;
										}
										if (local290 < 3 && local266 - 1 >= 0 && (!method624(arg0[local266 - 1]) || arg0[local266 - 1] == '\'')) {
											local328 = false;
										}
										if (local328 && !method630(local288)) {
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
								var12 = arg0[local11 - 1];
							}
							var13 = ' ';
							if (local15 < arg0.length) {
								var13 = arg0[local15];
							}
							@Pc(198) byte local198 = method620(var12);
							@Pc(202) byte local202 = method620(var13);
							if (arg2 != null && method617(local198, arg2, local202)) {
								local170 = false;
							}
						}
						if (local170) {
							@Pc(378) int local378 = 0;
							@Pc(380) int local380 = 0;
							@Pc(382) int local382 = -1;
							for (local266 = local11; local266 < local15; local266++) {
								if (method627(arg0[local266])) {
									local378++;
								} else if (method626(arg0[local266])) {
									local380++;
									local382 = local266;
								}
							}
							if (local382 > -1) {
								local378 -= local15 - local382 - 1;
							}
							if (local378 <= local380) {
								for (@Pc(424) int local424 = local11; local424 < local15; local424++) {
									arg0[local424] = '*';
								}
							} else {
								local21 = 1;
							}
						}
					}
				}
			}
		} catch (@Pc(453) RuntimeException local453) {
			signlink.reporterror("80356, " + -466 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local453.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(B[[BBB)Z")
	private static boolean method617(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(3) byte arg2) {
		try {
			@Pc(1) int local1 = 0;
			if (arg1[0][0] == arg0 && arg1[0][1] == arg2) {
				return true;
			}
			@Pc(22) int local22 = arg1.length - 1;
			if (aByte35 != 23) {
				anInt946 = -14;
			}
			if (arg1[local22][0] == arg0 && arg1[local22][1] == arg2) {
				return true;
			}
			do {
				@Pc(49) int local49 = (local1 + local22) / 2;
				if (arg1[local49][0] == arg0 && arg1[local49][1] == arg2) {
					return true;
				}
				if (arg0 < arg1[local49][0] || arg0 == arg1[local49][0] && arg2 < arg1[local49][1]) {
					local22 = local49;
				} else {
					local1 = local49;
				}
			} while (local1 != local22 && local1 + 1 != local22);
			return false;
		} catch (@Pc(103) RuntimeException local103) {
			signlink.reporterror("64531, " + arg0 + ", " + arg1 + ", " + 23 + ", " + arg2 + ", " + local103.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(CICC)I")
	private static int method618(@OriginalArg(0) char arg0, @OriginalArg(2) char arg1, @OriginalArg(3) char arg2) {
		try {
			if (arg1 == arg2) {
				return 1;
			} else if (arg1 == 'o' && arg2 == '0') {
				return 1;
			} else if (arg1 == 'o' && arg2 == '(' && arg0 == ')') {
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
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("76129, " + arg0 + ", " + -916 + ", " + arg1 + ", " + arg2 + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BCCC)I")
	private static int method619(@OriginalArg(1) char arg0, @OriginalArg(2) char arg1, @OriginalArg(3) char arg2) {
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
		} catch (@Pc(517) RuntimeException local517) {
			signlink.reporterror("16949, " + -23 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local517.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(CB)B")
	private static byte method620(@OriginalArg(0) char arg0) {
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
			signlink.reporterror("39057, " + arg0 + ", " + 7 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(B[C)V")
	private static void method621(@OriginalArg(0) byte arg0, @OriginalArg(1) char[] arg1) {
		try {
			if (arg0 == 6) {
				@Pc(8) boolean local8 = false;
				@Pc(12) int local12 = 0;
				@Pc(14) int local14 = 0;
				@Pc(16) int local16 = 0;
				while (true) {
					do {
						@Pc(116) int local116;
						if ((local116 = method622(arg1, local12)) == -1) {
							return;
						}
						@Pc(21) boolean local21 = false;
						for (@Pc(23) int local23 = local12; local23 >= 0 && local23 < local116 && !local21; local23++) {
							if (!method624(arg1[local23]) && !method625(arg1[local23])) {
								local21 = true;
							}
						}
						if (local21) {
							local14 = 0;
						}
						if (local14 == 0) {
							local16 = local116;
						}
						local12 = method623(local116, arg1, anInt949);
						@Pc(62) int local62 = 0;
						for (@Pc(64) int local64 = local116; local64 < local12; local64++) {
							local62 = local62 * 10 + arg1[local64] - 48;
						}
						if (local62 <= 255 && local12 - local116 <= 8) {
							local14++;
						} else {
							local14 = 0;
						}
					} while (local14 != 4);
					for (@Pc(98) int local98 = local16; local98 < local12; local98++) {
						arg1[local98] = '*';
					}
					local14 = 0;
				}
			}
		} catch (@Pc(120) RuntimeException local120) {
			signlink.reporterror("46801, " + arg0 + ", " + arg1 + ", " + local120.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CII)I")
	private static int method622(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1) {
		try {
			for (@Pc(3) int local3 = arg1; local3 < arg0.length && local3 >= 0; local3++) {
				if (arg0[local3] >= '0' && arg0[local3] <= '9') {
					return local3;
				}
			}
			return -1;
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("63370, " + arg0 + ", " + arg1 + ", " + -19 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[CI)I")
	private static int method623(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg2 >= 0) {
				return anInt947;
			}
			@Pc(9) int local9 = arg0;
			while (true) {
				if (local9 < arg1.length && local9 >= 0) {
					if (arg1[local9] >= '0' && arg1[local9] <= '9') {
						local9++;
						continue;
					}
					return local9;
				}
				return arg1.length;
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("90459, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(CZ)Z")
	private static boolean method624(@OriginalArg(0) char arg0) {
		try {
			return !method626(arg0) && !method627(arg0);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("23669, " + arg0 + ", " + false + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(CI)Z")
	private static boolean method625(@OriginalArg(0) char arg0) {
		try {
			if (arg0 >= 'a' && arg0 <= 'z') {
				return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
			} else {
				return true;
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("31347, " + arg0 + ", " + 9 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(IC)Z")
	private static boolean method626(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("92072, " + -612 + ", " + arg0 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(CZ)Z")
	private static boolean method627(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= '0' && arg0 <= '9';
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("52941, " + arg0 + ", " + false + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BC)Z")
	private static boolean method628(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z';
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("46042, " + 97 + ", " + arg0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(IC)Z")
	private static boolean method629(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("54683, " + 983 + ", " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "(Z[C)Z")
	private static boolean method630(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
				if (!method627(arg0[local13]) && arg0[local13] != '\u0000') {
					local3 = false;
				}
			}
			if (local3) {
				return true;
			}
			@Pc(40) int local40 = method631(arg0);
			@Pc(42) int local42 = 0;
			@Pc(47) int local47 = anIntArray254.length - 1;
			if (local40 == anIntArray254[0] || local40 == anIntArray254[local47]) {
				return true;
			}
			do {
				@Pc(65) int local65 = (local42 + local47) / 2;
				if (local40 == anIntArray254[local65]) {
					return true;
				}
				if (local40 < anIntArray254[local65]) {
					local47 = local65;
				} else {
					local42 = local65;
				}
			} while (local42 != local47 && local42 + 1 != local47);
			return false;
		} catch (@Pc(94) RuntimeException local94) {
			signlink.reporterror("74458, " + true + ", " + arg0 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[C)I")
	private static int method631(@OriginalArg(1) char[] arg0) {
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
			signlink.reporterror("33405, " + 255 + ", " + arg0 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}
}
