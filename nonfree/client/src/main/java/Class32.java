import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!pc")
public final class Class32 {

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "Z")
	private static boolean aBoolean177;

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
	private static int anInt855;

	@OriginalMember(owner = "client!pc", name = "k", descriptor = "[I")
	private static int[] anIntArray222;

	@OriginalMember(owner = "client!pc", name = "l", descriptor = "[[C")
	private static char[][] aCharArrayArray1;

	@OriginalMember(owner = "client!pc", name = "m", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!pc", name = "n", descriptor = "[[C")
	private static char[][] aCharArrayArray2;

	@OriginalMember(owner = "client!pc", name = "o", descriptor = "[[C")
	private static char[][] aCharArrayArray3;

	@OriginalMember(owner = "client!pc", name = "p", descriptor = "[I")
	private static int[] anIntArray223;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
	private static int anInt854 = 800;

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "Z")
	private static boolean aBoolean176 = true;

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "Z")
	private static boolean aBoolean178 = true;

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "Z")
	private static boolean aBoolean179 = true;

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
	private static int anInt856 = 20549;

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "I")
	private static int anInt857 = -40826;

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
	private static int anInt858 = 975;

	@OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
	private static int anInt859 = 3;

	@OriginalMember(owner = "client!pc", name = "q", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray11 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet" };

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!yb;)V")
	public static void method503(@OriginalArg(0) Class45 arg0) {
		@Pc(10) Class1_Sub1_Sub3 local10 = new Class1_Sub1_Sub3(arg0.method644("fragmentsenc.txt", null), true);
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(arg0.method644("badenc.txt", null), true);
		@Pc(28) Class1_Sub1_Sub3 local28 = new Class1_Sub1_Sub3(arg0.method644("domainenc.txt", null), true);
		@Pc(37) Class1_Sub1_Sub3 local37 = new Class1_Sub1_Sub3(arg0.method644("tldlist.txt", null), true);
		method504(local10, local19, local28, local37);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!mb;Lclient!mb;Lclient!mb;Lclient!mb;)V")
	private static void method504(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) Class1_Sub1_Sub3 arg2, @OriginalArg(3) Class1_Sub1_Sub3 arg3) {
		method506(arg1);
		method507(arg2);
		method508(arg0);
		method505(arg3, aBoolean176);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!mb;Z)V")
	private static void method505(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) boolean arg1) {
		try {
			@Pc(4) int local4 = arg0.method473();
			aCharArrayArray3 = new char[local4][];
			if (!arg1) {
				aBoolean176 = !aBoolean176;
			}
			anIntArray223 = new int[local4];
			for (@Pc(20) int local20 = 0; local20 < local4; local20++) {
				anIntArray223[local20] = arg0.method468();
				@Pc(31) char[] local31 = new char[arg0.method468()];
				for (@Pc(33) int local33 = 0; local33 < local31.length; local33++) {
					local31[local33] = (char) arg0.method468();
				}
				aCharArrayArray3[local20] = local31;
			}
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("6773, " + arg0 + ", " + arg1 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILclient!mb;)V")
	private static void method506(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(2) int local2 = arg0.method473();
			aCharArrayArray1 = new char[local2][];
			aByteArrayArrayArray8 = new byte[local2][][];
			method509(aByteArrayArrayArray8, arg0, aBoolean177, aCharArrayArray1);
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("73410, " + 0 + ", " + arg0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(Lclient!mb;Z)V")
	private static void method507(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(5) int local5 = arg0.method473();
			aCharArrayArray2 = new char[local5][];
			method510(aCharArrayArray2, arg0);
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("74383, " + arg0 + ", " + false + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(Lclient!mb;Z)V")
	private static void method508(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			anIntArray222 = new int[arg0.method473()];
			for (@Pc(9) int local9 = 0; local9 < anIntArray222.length; local9++) {
				anIntArray222[local9] = arg0.method470();
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("35279, " + arg0 + ", " + false + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "([[[BLclient!mb;Z[[C)V")
	private static void method509(@OriginalArg(0) byte[][][] arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) char[][] arg3) {
		try {
			if (!arg2) {
				for (@Pc(6) int local6 = 0; local6 < arg3.length; local6++) {
					@Pc(12) char[] local12 = new char[arg1.method468()];
					for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
						local12[local14] = (char) arg1.method468();
					}
					arg3[local6] = local12;
					@Pc(36) byte[][] local36 = new byte[arg1.method468()][2];
					for (@Pc(38) int local38 = 0; local38 < local36.length; local38++) {
						local36[local38][0] = (byte) arg1.method468();
						local36[local38][1] = (byte) arg1.method468();
					}
					if (local36.length > 0) {
						arg0[local6] = local36;
					}
				}
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("3761, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z[[CLclient!mb;)V")
	private static void method510(@OriginalArg(1) char[][] arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
				@Pc(9) char[] local9 = new char[arg1.method468()];
				for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
					local9[local11] = (char) arg1.method468();
				}
				arg0[local3] = local9;
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("44577, " + true + ", " + arg0 + ", " + arg1 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "([CZ)V")
	private static void method511(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) int local3 = 0;
			for (@Pc(8) int local8 = 0; local8 < arg0.length; local8++) {
				if (method512(arg0[local8])) {
					arg0[local3] = arg0[local8];
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
			signlink.reporterror("79477, " + arg0 + ", " + false + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(CZ)Z")
	private static boolean method512(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= ' ' && arg0 <= '\u007f' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("45095, " + arg0 + ", " + true + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method513(@OriginalArg(1) String arg0) {
		try {
			@Pc(3) long local3 = System.currentTimeMillis();
			@Pc(6) char[] local6 = arg0.toCharArray();
			method511(local6);
			@Pc(15) String local15 = (new String(local6)).trim();
			@Pc(19) char[] local19 = local15.toLowerCase().toCharArray();
			@Pc(22) String local22 = local15.toLowerCase();
			method521(local19);
			method516(aBoolean179, local19);
			method517(local19);
			method530(local19);
			for (@Pc(36) int local36 = 0; local36 < aStringArray11.length; local36++) {
				@Pc(46) int local46 = -1;
				while ((local46 = local22.indexOf(aStringArray11[local36], local46 + 1)) != -1) {
					@Pc(53) char[] local53 = aStringArray11[local36].toCharArray();
					for (@Pc(55) int local55 = 0; local55 < local53.length; local55++) {
						local19[local55 + local46] = local53[local55];
					}
				}
			}
			method514(local19, local15.toCharArray());
			method515(local19);
			@Pc(97) long local97 = System.currentTimeMillis();
			return (new String(local19)).trim();
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("9167, " + 22793 + ", " + arg0 + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "([C[CZ)V")
	private static void method514(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1) {
		try {
			for (@Pc(1) int local1 = 0; local1 < arg1.length; local1++) {
				if (arg0[local1] != '*' && method538(arg1[local1], anInt858)) {
					arg0[local1] = arg1[local1];
				}
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("32101, " + arg0 + ", " + arg1 + ", " + true + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "([CI)V")
	private static void method515(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(7) boolean local7 = true;
			for (@Pc(9) int local9 = 0; local9 < arg0.length; local9++) {
				@Pc(15) char local15 = arg0[local9];
				if (!method535(local15)) {
					local7 = true;
				} else if (local7) {
					if (method537(anInt857, local15)) {
						local7 = false;
					}
				} else if (method538(local15, anInt858)) {
					arg0[local9] = (char) (local15 + 'a' - 65);
				}
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("34624, " + arg0 + ", " + -22707 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z[C)V")
	private static void method516(@OriginalArg(0) boolean arg0, @OriginalArg(1) char[] arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 2; local3++) {
				for (@Pc(10) int local10 = aCharArrayArray1.length - 1; local10 >= 0; local10--) {
					method525(aByteArrayArrayArray8[local10], arg1, aCharArrayArray1[local10]);
				}
			}
			if (!arg0) {
				anInt858 = -237;
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("91476, " + arg0 + ", " + arg1 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "([CI)V")
	private static void method517(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(5) char[] local5 = (char[]) arg0.clone();
			@Pc(20) char[] local20 = new char[] { '(', 'a', ')' };
			method525(null, local5, local20);
			@Pc(29) char[] local29 = (char[]) arg0.clone();
			@Pc(44) char[] local44 = new char[] { 'd', 'o', 't' };
			method525(null, local29, local44);
			for (@Pc(65) int local65 = aCharArrayArray2.length - 1; local65 >= 0; local65--) {
				method518(aCharArrayArray2[local65], local29, local5, arg0);
			}
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("46534, " + arg0 + ", " + -604 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "([C[C[CI[C)V")
	private static void method518(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2, @OriginalArg(4) char[] arg3) {
		try {
			if (arg0.length <= arg3.length) {
				@Pc(22) int local22;
				for (@Pc(14) int local14 = 0; local14 <= arg3.length - arg0.length; local14 += local22) {
					@Pc(18) int local18 = local14;
					@Pc(20) int local20 = 0;
					local22 = 1;
					label58: while (true) {
						while (true) {
							if (local18 >= arg3.length) {
								break label58;
							}
							@Pc(30) char local30 = arg3[local18];
							@Pc(32) char local32 = 0;
							if (local18 + 1 < arg3.length) {
								local32 = arg3[local18 + 1];
							}
							@Pc(57) int local57;
							if (local20 < arg0.length && (local57 = method527(local32, local30, arg0[local20])) > 0) {
								local18 += local57;
								local20++;
							} else {
								if (local20 == 0) {
									break label58;
								}
								@Pc(78) int local78;
								if ((local78 = method527(local32, local30, arg0[local20 - 1])) > 0) {
									local18 += local78;
									if (local20 == 1) {
										local22++;
									}
								} else {
									if (local20 >= arg0.length || !method533(local30)) {
										break label58;
									}
									local18++;
								}
							}
						}
					}
					if (local20 >= arg0.length) {
						@Pc(109) boolean local109 = false;
						@Pc(115) int local115 = method519(arg3, arg2, local14);
						@Pc(123) int local123 = method520(arg1, arg3, local18 - 1);
						if (local115 > 2 || local123 > 2) {
							local109 = true;
						}
						if (local109) {
							for (@Pc(135) int local135 = local14; local135 < local18; local135++) {
								arg3[local135] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("19916, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 681 + ", " + arg3 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "([CB[CI)I")
	private static int method519(@OriginalArg(0) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 == 0) {
				return 2;
			}
			for (@Pc(9) int local9 = arg2 - 1; local9 >= 0 && method533(arg0[local9]); local9--) {
				if (arg0[local9] == '@') {
					return 3;
				}
			}
			@Pc(39) int local39 = 0;
			for (@Pc(43) int local43 = arg2 - 1; local43 >= 0 && method533(arg1[local43]); local43--) {
				if (arg1[local43] == '*') {
					local39++;
				}
			}
			if (local39 >= 3) {
				return 4;
			} else if (method533(arg0[arg2 - 1])) {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("78869, " + arg0 + ", " + 6 + ", " + arg1 + ", " + arg2 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "([CZ[CI)I")
	private static int method520(@OriginalArg(0) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 + 1 == arg1.length) {
				return 2;
			}
			@Pc(13) int local13 = arg2 + 1;
			while (true) {
				if (local13 < arg1.length && method533(arg1[local13])) {
					if (arg1[local13] != '.' && arg1[local13] != ',') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(40) int local40 = 0;
				for (@Pc(44) int local44 = arg2 + 1; local44 < arg1.length && method533(arg0[local44]); local44++) {
					if (arg0[local44] == '*') {
						local40++;
					}
				}
				if (local40 >= 3) {
					return 4;
				}
				if (method533(arg1[arg2 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("29589, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "([CI)V")
	private static void method521(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(22) char[] local22 = new char[] { 'd', 'o', 't' };
			method525(null, local3, local22);
			@Pc(31) char[] local31 = (char[]) arg0.clone();
			@Pc(54) char[] local54 = new char[] { 's', 'l', 'a', 's', 'h' };
			method525(null, local31, local54);
			for (@Pc(61) int local61 = 0; local61 < aCharArrayArray3.length; local61++) {
				method522(aCharArrayArray3[local61], anInt856, local31, anIntArray223[local61], local3, arg0);
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("80, " + arg0 + ", " + 0 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "([CI[CI[C[C)V")
	private static void method522(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) char[] arg4, @OriginalArg(5) char[] arg5) {
		try {
			if (arg0.length <= arg5.length) {
				@Pc(19) int local19;
				@Pc(15) int local15;
				for (@Pc(11) int local11 = 0; local11 <= arg5.length - arg0.length; local11 += local19) {
					local15 = local11;
					@Pc(17) int local17 = 0;
					local19 = 1;
					label133: while (true) {
						while (true) {
							if (local15 >= arg5.length) {
								break label133;
							}
							@Pc(27) char local27 = arg5[local15];
							@Pc(29) char local29 = 0;
							if (local15 + 1 < arg5.length) {
								local29 = arg5[local15 + 1];
							}
							@Pc(54) int local54;
							if (local17 < arg0.length && (local54 = method527(local29, local27, arg0[local17])) > 0) {
								local15 += local54;
								local17++;
							} else {
								if (local17 == 0) {
									break label133;
								}
								@Pc(75) int local75;
								if ((local75 = method527(local29, local27, arg0[local17 - 1])) > 0) {
									local15 += local75;
									if (local17 == 1) {
										local19++;
									}
								} else {
									if (local17 >= arg0.length || !method533(local27)) {
										break label133;
									}
									local15++;
								}
							}
						}
					}
					if (local17 >= arg0.length) {
						@Pc(106) boolean local106 = false;
						@Pc(112) int local112 = method523(arg5, arg4, local11);
						@Pc(120) int local120 = method524(arg2, local15 - 1, arg5);
						if (arg3 == 1 && local112 > 0 && local120 > 0) {
							local106 = true;
						}
						if (arg3 == 2 && (local112 > 2 && local120 > 0 || local112 > 0 && local120 > 2)) {
							local106 = true;
						}
						if (arg3 == 3 && local112 > 0 && local120 > 2) {
							local106 = true;
						}
						@Pc(163) boolean local163;
						if (arg3 == 3 && local112 > 2 && local120 > 0) {
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
											if (arg4[local186] != '*') {
												break;
											}
											local170 = local186;
										} else if (arg4[local186] == '*') {
											local170 = local186;
											local182 = true;
										}
									}
								}
								local182 = false;
								for (local186 = local170 - 1; local186 >= 0; local186--) {
									if (local182) {
										if (method533(arg5[local186])) {
											break;
										}
										local170 = local186;
									} else if (!method533(arg5[local186])) {
										local182 = true;
										local170 = local186;
									}
								}
							}
							if (local120 > 2) {
								if (local120 == 4) {
									local182 = false;
									for (local186 = local174 + 1; local186 < arg5.length; local186++) {
										if (local182) {
											if (arg2[local186] != '*') {
												break;
											}
											local174 = local186;
										} else if (arg2[local186] == '*') {
											local174 = local186;
											local182 = true;
										}
									}
								}
								local182 = false;
								for (local186 = local174 + 1; local186 < arg5.length; local186++) {
									if (local182) {
										if (method533(arg5[local186])) {
											break;
										}
										local174 = local186;
									} else if (!method533(arg5[local186])) {
										local182 = true;
										local174 = local186;
									}
								}
							}
							for (@Pc(320) int local320 = local170; local320 <= local174; local320++) {
								arg5[local320] = '*';
							}
						}
					}
				}
				if (arg1 != 20549) {
					for (local15 = 1; local15 > 0; local15++) {
					}
				}
			}
		} catch (@Pc(353) RuntimeException local353) {
			signlink.reporterror("82229, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local353.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I[C[CI)I")
	private static int method523(@OriginalArg(1) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 == 0) {
				return 2;
			}
			@Pc(9) int local9 = arg2 - 1;
			while (true) {
				if (local9 >= 0 && method533(arg0[local9])) {
					if (arg0[local9] != ',' && arg0[local9] != '.') {
						local9--;
						continue;
					}
					return 3;
				}
				@Pc(34) int local34 = 0;
				for (@Pc(46) int local46 = arg2 - 1; local46 >= 0 && method533(arg1[local46]); local46--) {
					if (arg1[local46] == '*') {
						local34++;
					}
				}
				if (local34 >= 3) {
					return 4;
				}
				if (method533(arg0[arg2 - 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("81913, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z[CI[C)I")
	private static int method524(@OriginalArg(1) char[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg1 + 1 == arg2.length) {
				return 2;
			}
			@Pc(13) int local13 = arg1 + 1;
			while (true) {
				if (local13 < arg2.length && method533(arg2[local13])) {
					if (arg2[local13] != '\\' && arg2[local13] != '/') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(44) int local44 = 0;
				for (@Pc(48) int local48 = arg1 + 1; local48 < arg2.length && method533(arg0[local48]); local48++) {
					if (arg0[local48] == '*') {
						local44++;
					}
				}
				if (local44 >= 5) {
					return 4;
				}
				if (method533(arg2[arg1 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("99275, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "([[B[C[CB)V")
	private static void method525(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2) {
		try {
			if (arg2.length <= arg1.length) {
				@Pc(30) int local30;
				for (@Pc(20) int local20 = 0; local20 <= arg1.length - arg2.length; local20 += local30) {
					@Pc(24) int local24 = local20;
					@Pc(26) int local26 = 0;
					@Pc(28) int local28 = 0;
					local30 = 1;
					@Pc(32) boolean local32 = false;
					@Pc(34) boolean local34 = false;
					@Pc(36) boolean local36 = false;
					@Pc(44) char var12;
					@Pc(46) char var13;
					label159: while (true) {
						while (true) {
							if (local24 >= arg1.length || local34 && local36) {
								break label159;
							}
							var12 = arg1[local24];
							var13 = '\u0000';
							if (local24 + 1 < arg1.length) {
								var13 = arg1[local24 + 1];
							}
							@Pc(71) int local71;
							if (local26 < arg2.length && (local71 = method528(arg2[local26], var12, var13)) > 0) {
								if (local71 == 1 && method536(var12)) {
									local34 = true;
								}
								if (local71 == 2 && (method536(var12) || method536(var13))) {
									local34 = true;
								}
								local24 += local71;
								local26++;
							} else {
								if (local26 == 0) {
									break label159;
								}
								@Pc(114) int local114;
								if ((local114 = method528(arg2[local26 - 1], var12, var13)) > 0) {
									local24 += local114;
									if (local26 == 1) {
										local30++;
									}
								} else {
									if (local26 >= arg2.length || !method534(var12)) {
										break label159;
									}
									if (method533(var12) && var12 != '\'') {
										local32 = true;
									}
									if (method536(var12)) {
										local36 = true;
									}
									local24++;
									local28++;
									if (local28 * 100 / (local24 - local20) > 90) {
										break label159;
									}
								}
							}
						}
					}
					if (local26 >= arg2.length && (!local34 || !local36)) {
						@Pc(179) boolean local179 = true;
						@Pc(275) int local275;
						if (local32) {
							@Pc(225) boolean local225 = false;
							@Pc(227) boolean local227 = false;
							if (local20 - 1 < 0 || method533(arg1[local20 - 1]) && arg1[local20 - 1] != '\'') {
								local225 = true;
							}
							if (local24 >= arg1.length || method533(arg1[local24]) && arg1[local24] != '\'') {
								local227 = true;
							}
							if (!local225 || !local227) {
								@Pc(271) boolean local271 = false;
								local275 = local20 - 2;
								if (local225) {
									local275 = local20;
								}
								while (!local271 && local275 < local24) {
									if (local275 >= 0 && (!method533(arg1[local275]) || arg1[local275] == '\'')) {
										@Pc(297) char[] local297 = new char[3];
										@Pc(299) int local299;
										for (local299 = 0; local299 < 3 && local275 + local299 < arg1.length && (!method533(arg1[local275 + local299]) || arg1[local275 + local299] == '\''); local299++) {
											local297[local299] = arg1[local275 + local299];
										}
										@Pc(337) boolean local337 = true;
										if (local299 == 0) {
											local337 = false;
										}
										if (local299 < 3 && local275 - 1 >= 0 && (!method533(arg1[local275 - 1]) || arg1[local275 - 1] == '\'')) {
											local337 = false;
										}
										if (local337 && !method539(local297)) {
											local271 = true;
										}
									}
									local275++;
								}
								if (!local271) {
									local179 = false;
								}
							}
						} else {
							var12 = ' ';
							if (local20 - 1 >= 0) {
								var12 = arg1[local20 - 1];
							}
							var13 = ' ';
							if (local24 < arg1.length) {
								var13 = arg1[local24];
							}
							@Pc(207) byte local207 = method529(var12);
							@Pc(211) byte local211 = method529(var13);
							if (arg0 != null && method526(local207, local211, arg0)) {
								local179 = false;
							}
						}
						if (local179) {
							@Pc(387) int local387 = 0;
							@Pc(389) int local389 = 0;
							for (@Pc(391) int local391 = local20; local391 < local24; local391++) {
								if (method536(arg1[local391])) {
									local387++;
								} else if (method535(arg1[local391])) {
									local389++;
								}
							}
							if (local387 <= local389) {
								for (local275 = local20; local275 < local24; local275++) {
									arg1[local275] = '*';
								}
							}
						}
					}
				}
			}
		} catch (@Pc(441) RuntimeException local441) {
			signlink.reporterror("71400, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -100 + ", " + local441.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BB[[BB)Z")
	private static boolean method526(@OriginalArg(0) byte arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte[][] arg2) {
		try {
			@Pc(6) int local6 = 0;
			if (arg2[0][0] == arg0 && arg2[0][1] == arg1) {
				return true;
			}
			@Pc(27) int local27 = arg2.length - 1;
			if (arg2[local27][0] == arg0 && arg2[local27][1] == arg1) {
				return true;
			}
			do {
				@Pc(49) int local49 = (local6 + local27) / 2;
				if (arg2[local49][0] == arg0 && arg2[local49][1] == arg1) {
					return true;
				}
				if (arg0 < arg2[local49][0] || arg0 == arg2[local49][0] && arg1 < arg2[local49][1]) {
					local27 = local49;
				} else {
					local6 = local49;
				}
			} while (local6 != local27 && local6 + 1 != local27);
			return false;
		} catch (@Pc(103) RuntimeException local103) {
			signlink.reporterror("65104, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -104 + ", " + local103.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(CICC)I")
	private static int method527(@OriginalArg(0) char arg0, @OriginalArg(2) char arg1, @OriginalArg(3) char arg2) {
		try {
			if (arg2 == arg1) {
				return 1;
			} else if (arg2 == 'o' && arg1 == '0') {
				return 1;
			} else if (arg2 == 'o' && arg1 == '(' && arg0 == ')') {
				return 2;
			} else if (arg2 == 'c' && (arg1 == '(' || arg1 == '<' || arg1 == '[')) {
				return 1;
			} else if (arg2 == 'e' && arg1 == '€') {
				return 1;
			} else if (arg2 == 's' && arg1 == '$') {
				return 1;
			} else if (arg2 == 'l' && arg1 == 'i') {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("31410, " + arg0 + ", " + 928 + ", " + arg1 + ", " + arg2 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(CICC)I")
	private static int method528(@OriginalArg(0) char arg0, @OriginalArg(2) char arg1, @OriginalArg(3) char arg2) {
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
						if (arg1 == '1' && arg2 == '3') {
							return 2;
						}
						return 0;
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
					if (arg1 == '[' && arg2 == ')') {
						return 2;
					}
					return 0;
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
					if (arg1 != '9' && arg1 != '6') {
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
		} catch (@Pc(503) RuntimeException local503) {
			signlink.reporterror("48670, " + arg0 + ", " + 48428 + ", " + arg1 + ", " + arg2 + ", " + local503.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IC)B")
	private static byte method529(@OriginalArg(1) char arg0) {
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
			signlink.reporterror("68442, " + -10356 + ", " + arg0 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "([CI)V")
	private static void method530(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			@Pc(9) int local9 = 0;
			while (true) {
				do {
					@Pc(109) int local109;
					if ((local109 = method531(arg0, local5)) == -1) {
						return;
					}
					@Pc(14) boolean local14 = false;
					for (@Pc(16) int local16 = local5; local16 >= 0 && local16 < local109 && !local14; local16++) {
						if (!method533(arg0[local16]) && !method534(arg0[local16])) {
							local14 = true;
						}
					}
					if (local14) {
						local7 = 0;
					}
					if (local7 == 0) {
						local9 = local109;
					}
					local5 = method532(local109, arg0);
					@Pc(55) int local55 = 0;
					for (@Pc(57) int local57 = local109; local57 < local5; local57++) {
						local55 = local55 * 10 + arg0[local57] - 48;
					}
					if (local55 <= 255 && local5 - local109 <= 8) {
						local7++;
					} else {
						local7 = 0;
					}
				} while (local7 != 4);
				for (@Pc(91) int local91 = local9; local91 < local5; local91++) {
					arg0[local91] = '*';
				}
				local7 = 0;
			}
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("46931, " + arg0 + ", " + 286 + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "([CZI)I")
	private static int method531(@OriginalArg(0) char[] arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(5) int local5 = arg1; local5 < arg0.length && local5 >= 0; local5++) {
				if (arg0[local5] >= '0' && arg0[local5] <= '9') {
					return local5;
				}
			}
			return -1;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("12090, " + arg0 + ", " + true + ", " + arg1 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(II[C)I")
	private static int method532(@OriginalArg(1) int arg0, @OriginalArg(2) char[] arg1) {
		try {
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
			signlink.reporterror("36168, " + -1000 + ", " + arg0 + ", " + arg1 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZC)Z")
	private static boolean method533(@OriginalArg(1) char arg0) {
		try {
			return !method535(arg0) && !method536(arg0);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("8248, " + false + ", " + arg0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(IC)Z")
	private static boolean method534(@OriginalArg(1) char arg0) {
		try {
			if (arg0 >= 'a' && arg0 <= 'z') {
				return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
			} else {
				return true;
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("50412, " + -639 + ", " + arg0 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(ZC)Z")
	private static boolean method535(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("50800, " + true + ", " + arg0 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(IC)Z")
	private static boolean method536(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= '0' && arg0 <= '9';
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("34869, " + 0 + ", " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "(IC)Z")
	private static boolean method537(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		try {
			if (arg0 != -40826) {
				throw new NullPointerException();
			}
			return arg1 >= 'a' && arg1 <= 'z';
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("63424, " + arg0 + ", " + arg1 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(CI)Z")
	private static boolean method538(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 <= 0) {
				anInt857 = -182;
			}
			return arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("41948, " + arg0 + ", " + arg1 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "([CI)Z")
	private static boolean method539(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				if (!method536(arg0[local5]) && arg0[local5] != '\u0000') {
					local3 = false;
				}
			}
			if (local3) {
				return true;
			}
			@Pc(44) int local44 = method540(arg0);
			@Pc(46) int local46 = 0;
			@Pc(51) int local51 = anIntArray222.length - 1;
			if (local44 == anIntArray222[0] || local44 == anIntArray222[local51]) {
				return true;
			}
			do {
				@Pc(69) int local69 = (local46 + local51) / 2;
				if (local44 == anIntArray222[local69]) {
					return true;
				}
				if (local44 < anIntArray222[local69]) {
					local51 = local69;
				} else {
					local46 = local69;
				}
			} while (local46 != local51 && local46 + 1 != local51);
			return false;
		} catch (@Pc(98) RuntimeException local98) {
			signlink.reporterror("54038, " + arg0 + ", " + 1 + ", " + local98.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "([CI)I")
	private static int method540(@OriginalArg(0) char[] arg0) {
		try {
			if (arg0.length > 6) {
				return 0;
			}
			@Pc(9) int local9 = 0;
			if (anInt859 > 3 || anInt859 < 3) {
				anInt859 = 108;
			}
			for (@Pc(19) int local19 = 0; local19 < arg0.length; local19++) {
				@Pc(30) char local30 = arg0[arg0.length - local19 - 1];
				if (local30 >= 'a' && local30 <= 'z') {
					local9 = local9 * 38 + local30 + 1 - 'a';
				} else if (local30 == '\'') {
					local9 = local9 * 38 + 27;
				} else if (local30 >= '0' && local30 <= '9') {
					local9 = local9 * 38 + local30 + 28 - '0';
				} else if (local30 != '\u0000') {
					return 0;
				}
			}
			return local9;
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("33017, " + arg0 + ", " + 3 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}
}
