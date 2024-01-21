import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!sc")
public final class Class42 {

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "Z")
	private static boolean aBoolean219;

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
	private static int anInt927;

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
	private static int anInt928;

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "Z")
	private static boolean aBoolean221;

	@OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
	private static int anInt931;

	@OriginalMember(owner = "client!sc", name = "l", descriptor = "Z")
	private static boolean aBoolean222;

	@OriginalMember(owner = "client!sc", name = "n", descriptor = "[I")
	private static int[] anIntArray251;

	@OriginalMember(owner = "client!sc", name = "o", descriptor = "[[C")
	private static char[][] aCharArrayArray1;

	@OriginalMember(owner = "client!sc", name = "p", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!sc", name = "q", descriptor = "[[C")
	private static char[][] aCharArrayArray2;

	@OriginalMember(owner = "client!sc", name = "r", descriptor = "[[C")
	private static char[][] aCharArrayArray3;

	@OriginalMember(owner = "client!sc", name = "s", descriptor = "[I")
	private static int[] anIntArray252;

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
	private static int anInt926 = -226;

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
	private static int anInt929;

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
	private static int anInt930;

	@OriginalMember(owner = "client!sc", name = "j", descriptor = "B")
	private static byte aByte43;

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
	private static int anInt932;

	@OriginalMember(owner = "client!sc", name = "m", descriptor = "I")
	private static int anInt933;

	@OriginalMember(owner = "client!sc", name = "t", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray13;

	static {
		aBoolean220 = true;
		anInt929 = -484;
		anInt930 = 9;
		aByte43 = -17;
		anInt932 = 5;
		anInt933 = 443;
		aStringArray13 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!xb;)V")
	public static void method587(@OriginalArg(0) Class47 arg0) {
		@Pc(10) Class1_Sub1_Sub3 local10 = new Class1_Sub1_Sub3(arg0.method659("fragmentsenc.txt", null), (byte) 1);
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(arg0.method659("badenc.txt", null), (byte) 1);
		@Pc(28) Class1_Sub1_Sub3 local28 = new Class1_Sub1_Sub3(arg0.method659("domainenc.txt", null), (byte) 1);
		@Pc(37) Class1_Sub1_Sub3 local37 = new Class1_Sub1_Sub3(arg0.method659("tldlist.txt", null), (byte) 1);
		method588(local10, local19, local28, local37);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!lb;Lclient!lb;Lclient!lb;Lclient!lb;)V")
	private static void method588(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) Class1_Sub1_Sub3 arg2, @OriginalArg(3) Class1_Sub1_Sub3 arg3) {
		method590(804, arg1);
		method591(arg2);
		method592(arg0);
		method589(arg3);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!lb;B)V")
	private static void method589(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(4) int local4 = arg0.method478();
			aCharArrayArray3 = new char[local4][];
			anIntArray252 = new int[local4];
			for (@Pc(17) int local17 = 0; local17 < local4; local17++) {
				anIntArray252[local17] = arg0.method473();
				@Pc(28) char[] local28 = new char[arg0.method473()];
				for (@Pc(30) int local30 = 0; local30 < local28.length; local30++) {
					local28[local30] = (char) arg0.method473();
				}
				aCharArrayArray3[local17] = local28;
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("31293, " + arg0 + ", " + 14 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!lb;)V")
	private static void method590(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			@Pc(2) int local2 = arg1.method478();
			aCharArrayArray1 = new char[local2][];
			aByteArrayArrayArray8 = new byte[local2][][];
			@Pc(12) boolean local12 = false;
			method593(arg1, aByteArrayArrayArray8, aCharArrayArray1);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("72972, " + arg0 + ", " + arg1 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!lb;Z)V")
	private static void method591(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(10) int local10 = arg0.method478();
			aCharArrayArray2 = new char[local10][];
			method594(aCharArrayArray2, arg0);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("74359, " + arg0 + ", " + false + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(ILclient!lb;)V")
	private static void method592(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			anIntArray251 = new int[arg0.method478()];
			for (@Pc(16) int local16 = 0; local16 < anIntArray251.length; local16++) {
				anIntArray251[local16] = arg0.method475();
			}
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("64416, " + -534 + ", " + arg0 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!lb;[[[B[[CZ)V")
	private static void method593(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) char[][] arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < arg2.length; local3++) {
				@Pc(9) char[] local9 = new char[arg0.method473()];
				for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
					local9[local11] = (char) arg0.method473();
				}
				arg2[local3] = local9;
				@Pc(33) byte[][] local33 = new byte[arg0.method473()][2];
				for (@Pc(35) int local35 = 0; local35 < local33.length; local35++) {
					local33[local35][0] = (byte) arg0.method473();
					local33[local35][1] = (byte) arg0.method473();
				}
				if (local33.length > 0) {
					arg1[local3] = local33;
				}
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("4963, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z[[CLclient!lb;)V")
	private static void method594(@OriginalArg(1) char[][] arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
				@Pc(9) char[] local9 = new char[arg1.method473()];
				for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
					local9[local11] = (char) arg1.method473();
				}
				arg0[local3] = local9;
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("33978, " + false + ", " + arg0 + ", " + arg1 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CI)V")
	private static void method595(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) int local3 = 0;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				if (method596(arg0[local5])) {
					arg0[local3] = arg0[local5];
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
			signlink.reporterror("49377, " + arg0 + ", " + -59 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(CI)Z")
	private static boolean method596(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= ' ' && arg0 <= '\u007f' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("93176, " + arg0 + ", " + 0 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method597(@OriginalArg(1) String arg0) {
		try {
			@Pc(3) long local3 = System.currentTimeMillis();
			@Pc(6) char[] local6 = arg0.toCharArray();
			method595(local6);
			@Pc(15) String local15 = (new String(local6)).trim();
			@Pc(19) char[] local19 = local15.toLowerCase().toCharArray();
			@Pc(22) String local22 = local15.toLowerCase();
			method605(local19);
			method600(local19, (byte) 6);
			method601(local19);
			method614(local19);
			for (@Pc(41) int local41 = 0; local41 < aStringArray13.length; local41++) {
				@Pc(51) int local51 = -1;
				while ((local51 = local22.indexOf(aStringArray13[local41], local51 + 1)) != -1) {
					@Pc(58) char[] local58 = aStringArray13[local41].toCharArray();
					for (@Pc(60) int local60 = 0; local60 < local58.length; local60++) {
						local19[local60 + local51] = local58[local60];
					}
				}
			}
			method598(local19, local15.toCharArray());
			method599((byte) 7, local19);
			@Pc(102) long local102 = System.currentTimeMillis();
			return (new String(local19)).trim();
		} catch (@Pc(109) RuntimeException local109) {
			signlink.reporterror("22990, " + 3 + ", " + arg0 + ", " + local109.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([C[CI)V")
	private static void method598(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1) {
		try {
			for (@Pc(4) int local4 = 0; local4 < arg1.length; local4++) {
				if (arg0[local4] != '*' && method622(anInt932, arg1[local4])) {
					arg0[local4] = arg1[local4];
				}
			}
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("46040, " + arg0 + ", " + arg1 + ", " + -51 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(B[C)V")
	private static void method599(@OriginalArg(0) byte arg0, @OriginalArg(1) char[] arg1) {
		try {
			@Pc(3) boolean local3 = true;
			@Pc(8) boolean local8 = false;
			for (@Pc(19) int local19 = 0; local19 < arg1.length; local19++) {
				@Pc(25) char local25 = arg1[local19];
				if (!method619(aByte43, local25)) {
					local3 = true;
				} else if (local3) {
					if (method621(local25)) {
						local3 = false;
					}
				} else if (method622(anInt932, local25)) {
					arg1[local19] = (char) (local25 + 'a' - 65);
				}
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("96533, " + arg0 + ", " + arg1 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CB)V")
	private static void method600(@OriginalArg(0) char[] arg0, @OriginalArg(1) byte arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 2; local3++) {
				for (@Pc(10) int local10 = aCharArrayArray1.length - 1; local10 >= 0; local10--) {
					method609(arg0, aCharArrayArray1[local10], aByteArrayArrayArray8[local10]);
				}
			}
			@Pc(33) boolean local33 = false;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("55825, " + arg0 + ", " + arg1 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "([CB)V")
	private static void method601(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(23) char[] local23 = new char[] { '(', 'a', ')' };
			method609(local3, local23, null);
			@Pc(32) char[] local32 = (char[]) arg0.clone();
			@Pc(47) char[] local47 = new char[] { 'd', 'o', 't' };
			method609(local32, local47, null);
			for (@Pc(57) int local57 = aCharArrayArray2.length - 1; local57 >= 0; local57--) {
				method602(local3, aCharArrayArray2[local57], arg0, local32);
			}
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("36730, " + arg0 + ", " + 5 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CB[C[C[C)V")
	private static void method602(@OriginalArg(0) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2, @OriginalArg(4) char[] arg3) {
		try {
			if (arg1.length <= arg2.length) {
				@Pc(19) int local19;
				for (@Pc(11) int local11 = 0; local11 <= arg2.length - arg1.length; local11 += local19) {
					@Pc(15) int local15 = local11;
					@Pc(17) int local17 = 0;
					local19 = 1;
					label59: while (true) {
						while (true) {
							if (local15 >= arg2.length) {
								break label59;
							}
							@Pc(27) char local27 = arg2[local15];
							@Pc(29) char local29 = 0;
							if (local15 + 1 < arg2.length) {
								local29 = arg2[local15 + 1];
							}
							@Pc(54) int local54;
							if (local17 < arg1.length && (local54 = method611(arg1[local17], local29, local27)) > 0) {
								local15 += local54;
								local17++;
							} else {
								if (local17 == 0) {
									break label59;
								}
								@Pc(75) int local75;
								if ((local75 = method611(arg1[local17 - 1], local29, local27)) > 0) {
									local15 += local75;
									if (local17 == 1) {
										local19++;
									}
								} else {
									if (local17 >= arg1.length || !method617(local27)) {
										break label59;
									}
									local15++;
								}
							}
						}
					}
					if (local17 >= arg1.length) {
						@Pc(106) boolean local106 = false;
						@Pc(112) int local112 = method603(arg2, local11, arg0);
						@Pc(120) int local120 = method604(local15 - 1, arg2, arg3);
						if (local112 > 2 || local120 > 2) {
							local106 = true;
						}
						if (local106) {
							for (@Pc(132) int local132 = local11; local132 < local15; local132++) {
								arg2[local132] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("79982, " + arg0 + ", " + 117 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CBI[C)I")
	private static int method603(@OriginalArg(0) char[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg1 == 0) {
				return 2;
			}
			for (@Pc(14) int local14 = arg1 - 1; local14 >= 0 && method617(arg0[local14]); local14--) {
				if (arg0[local14] == '@') {
					return 3;
				}
			}
			@Pc(34) int local34 = 0;
			for (@Pc(38) int local38 = arg1 - 1; local38 >= 0 && method617(arg2[local38]); local38--) {
				if (arg2[local38] == '*') {
					local34++;
				}
			}
			if (local34 >= 3) {
				return 4;
			} else if (method617(arg0[arg1 - 1])) {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("34158, " + arg0 + ", " + -8 + ", " + arg1 + ", " + arg2 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IB[C[C)I")
	private static int method604(@OriginalArg(0) int arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg0 + 1 == arg1.length) {
				return 2;
			}
			@Pc(13) int local13 = arg0 + 1;
			while (true) {
				if (local13 < arg1.length && method617(arg1[local13])) {
					if (arg1[local13] != '.' && arg1[local13] != ',') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(45) int local45 = 0;
				for (@Pc(49) int local49 = arg0 + 1; local49 < arg1.length && method617(arg2[local49]); local49++) {
					if (arg2[local49] == '*') {
						local45++;
					}
				}
				if (local45 >= 3) {
					return 4;
				}
				if (method617(arg1[arg0 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("11752, " + arg0 + ", " + 7 + ", " + arg1 + ", " + arg2 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z[C)V")
	private static void method605(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(5) char[] local5 = (char[]) arg0.clone();
			@Pc(20) char[] local20 = new char[] { 'd', 'o', 't' };
			method609(local5, local20, null);
			@Pc(38) char[] local38 = (char[]) arg0.clone();
			@Pc(61) char[] local61 = new char[] { 's', 'l', 'a', 's', 'h' };
			method609(local38, local61, null);
			for (@Pc(68) int local68 = 0; local68 < aCharArrayArray3.length; local68++) {
				method606(local5, anIntArray252[local68], arg0, local38, aCharArrayArray3[local68]);
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("85606, " + true + ", " + arg0 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CI[C[C[CI)V")
	private static void method606(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) char[] arg3, @OriginalArg(4) char[] arg4) {
		try {
			if (arg4.length <= arg2.length) {
				@Pc(28) int local28;
				for (@Pc(20) int local20 = 0; local20 <= arg2.length - arg4.length; local20 += local28) {
					@Pc(24) int local24 = local20;
					@Pc(26) int local26 = 0;
					local28 = 1;
					label120: while (true) {
						while (true) {
							if (local24 >= arg2.length) {
								break label120;
							}
							@Pc(36) char local36 = arg2[local24];
							@Pc(38) char local38 = 0;
							if (local24 + 1 < arg2.length) {
								local38 = arg2[local24 + 1];
							}
							@Pc(63) int local63;
							if (local26 < arg4.length && (local63 = method611(arg4[local26], local38, local36)) > 0) {
								local24 += local63;
								local26++;
							} else {
								if (local26 == 0) {
									break label120;
								}
								@Pc(84) int local84;
								if ((local84 = method611(arg4[local26 - 1], local38, local36)) > 0) {
									local24 += local84;
									if (local26 == 1) {
										local28++;
									}
								} else {
									if (local26 >= arg4.length || !method617(local36)) {
										break label120;
									}
									local24++;
								}
							}
						}
					}
					if (local26 >= arg4.length) {
						@Pc(115) boolean local115 = false;
						@Pc(121) int local121 = method607(arg0, arg2, local20);
						@Pc(129) int local129 = method608(arg3, local24 - 1, arg2);
						if (arg1 == 1 && local121 > 0 && local129 > 0) {
							local115 = true;
						}
						if (arg1 == 2 && (local121 > 2 && local129 > 0 || local121 > 0 && local129 > 2)) {
							local115 = true;
						}
						if (arg1 == 3 && local121 > 0 && local129 > 2) {
							local115 = true;
						}
						@Pc(172) boolean local172;
						if (arg1 == 3 && local121 > 2 && local129 > 0) {
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
											if (arg0[local195] != '*') {
												break;
											}
											local179 = local195;
										} else if (arg0[local195] == '*') {
											local179 = local195;
											local191 = true;
										}
									}
								}
								local191 = false;
								for (local195 = local179 - 1; local195 >= 0; local195--) {
									if (local191) {
										if (method617(arg2[local195])) {
											break;
										}
										local179 = local195;
									} else if (!method617(arg2[local195])) {
										local191 = true;
										local179 = local195;
									}
								}
							}
							if (local129 > 2) {
								if (local129 == 4) {
									local191 = false;
									for (local195 = local183 + 1; local195 < arg2.length; local195++) {
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
								for (local195 = local183 + 1; local195 < arg2.length; local195++) {
									if (local191) {
										if (method617(arg2[local195])) {
											break;
										}
										local183 = local195;
									} else if (!method617(arg2[local195])) {
										local191 = true;
										local183 = local195;
									}
								}
							}
							for (@Pc(329) int local329 = local179; local329 <= local183; local329++) {
								arg2[local329] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(352) RuntimeException local352) {
			signlink.reporterror("78532, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -35561 + ", " + local352.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CZ[CI)I")
	private static int method607(@OriginalArg(0) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 == 0) {
				return 2;
			}
			@Pc(9) int local9 = arg2 - 1;
			while (true) {
				if (local9 >= 0 && method617(arg1[local9])) {
					if (arg1[local9] != ',' && arg1[local9] != '.') {
						local9--;
						continue;
					}
					return 3;
				}
				@Pc(34) int local34 = 0;
				for (@Pc(38) int local38 = arg2 - 1; local38 >= 0 && method617(arg0[local38]); local38--) {
					if (arg0[local38] == '*') {
						local34++;
					}
				}
				if (local34 >= 3) {
					return 4;
				}
				if (method617(arg1[arg2 - 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("83800, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CII[C)I")
	private static int method608(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg1 + 1 == arg2.length) {
				return 2;
			}
			@Pc(13) int local13 = arg1 + 1;
			while (true) {
				if (local13 < arg2.length && method617(arg2[local13])) {
					if (arg2[local13] != '\\' && arg2[local13] != '/') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(40) int local40 = 0;
				for (@Pc(44) int local44 = arg1 + 1; local44 < arg2.length && method617(arg0[local44]); local44++) {
					if (arg0[local44] == '*') {
						local40++;
					}
				}
				if (local40 >= 5) {
					return 4;
				}
				if (method617(arg2[arg1 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("55009, " + arg0 + ", " + arg1 + ", " + 28750 + ", " + arg2 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([C[CI[[B)V")
	private static void method609(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(3) byte[][] arg2) {
		try {
			if (arg1.length <= arg0.length) {
				@Pc(28) int local28;
				for (@Pc(18) int local18 = 0; local18 <= arg0.length - arg1.length; local18 += local28) {
					@Pc(22) int local22 = local18;
					@Pc(24) int local24 = 0;
					@Pc(26) int local26 = 0;
					local28 = 1;
					@Pc(30) boolean local30 = false;
					@Pc(32) boolean local32 = false;
					@Pc(34) boolean local34 = false;
					@Pc(42) char var12;
					@Pc(44) char var13;
					label164: while (true) {
						while (true) {
							if (local22 >= arg0.length || local32 && local34) {
								break label164;
							}
							var12 = arg0[local22];
							var13 = '\u0000';
							if (local22 + 1 < arg0.length) {
								var13 = arg0[local22 + 1];
							}
							@Pc(69) int local69;
							if (local24 < arg1.length && (local69 = method612(var12, var13, arg1[local24])) > 0) {
								if (local69 == 1 && method620(636, var12)) {
									local32 = true;
								}
								if (local69 == 2 && (method620(636, var12) || method620(636, var13))) {
									local32 = true;
								}
								local22 += local69;
								local24++;
							} else {
								if (local24 == 0) {
									break label164;
								}
								@Pc(112) int local112;
								if ((local112 = method612(var12, var13, arg1[local24 - 1])) > 0) {
									local22 += local112;
									if (local24 == 1) {
										local28++;
									}
								} else {
									if (local24 >= arg1.length || !method618(var12)) {
										break label164;
									}
									if (method617(var12) && var12 != '\'') {
										local30 = true;
									}
									if (method620(636, var12)) {
										local34 = true;
									}
									local22++;
									local26++;
									if (local26 * 100 / (local22 - local18) > 90) {
										break label164;
									}
								}
							}
						}
					}
					if (local24 >= arg1.length && (!local32 || !local34)) {
						@Pc(177) boolean local177 = true;
						@Pc(273) int local273;
						if (local30) {
							@Pc(223) boolean local223 = false;
							@Pc(225) boolean local225 = false;
							if (local18 - 1 < 0 || method617(arg0[local18 - 1]) && arg0[local18 - 1] != '\'') {
								local223 = true;
							}
							if (local22 >= arg0.length || method617(arg0[local22]) && arg0[local22] != '\'') {
								local225 = true;
							}
							if (!local223 || !local225) {
								@Pc(269) boolean local269 = false;
								local273 = local18 - 2;
								if (local223) {
									local273 = local18;
								}
								while (!local269 && local273 < local22) {
									if (local273 >= 0 && (!method617(arg0[local273]) || arg0[local273] == '\'')) {
										@Pc(295) char[] local295 = new char[3];
										@Pc(297) int local297;
										for (local297 = 0; local297 < 3 && local273 + local297 < arg0.length && (!method617(arg0[local273 + local297]) || arg0[local273 + local297] == '\''); local297++) {
											local295[local297] = arg0[local273 + local297];
										}
										@Pc(335) boolean local335 = true;
										if (local297 == 0) {
											local335 = false;
										}
										if (local297 < 3 && local273 - 1 >= 0 && (!method617(arg0[local273 - 1]) || arg0[local273 - 1] == '\'')) {
											local335 = false;
										}
										if (local335 && !method623(local295)) {
											local269 = true;
										}
									}
									local273++;
								}
								if (!local269) {
									local177 = false;
								}
							}
						} else {
							var12 = ' ';
							if (local18 - 1 >= 0) {
								var12 = arg0[local18 - 1];
							}
							var13 = ' ';
							if (local22 < arg0.length) {
								var13 = arg0[local22];
							}
							@Pc(205) byte local205 = method613(var12);
							@Pc(209) byte local209 = method613(var13);
							if (arg2 != null && method610(arg2, local205, local209)) {
								local177 = false;
							}
						}
						if (local177) {
							@Pc(385) int local385 = 0;
							@Pc(387) int local387 = 0;
							@Pc(389) int local389 = -1;
							for (local273 = local18; local273 < local22; local273++) {
								if (method620(636, arg0[local273])) {
									local385++;
								} else if (method619(aByte43, arg0[local273])) {
									local387++;
									local389 = local273;
								}
							}
							if (local389 > -1) {
								local385 -= local22 - local389 - 1;
							}
							if (local385 <= local387) {
								for (@Pc(431) int local431 = local18; local431 < local22; local431++) {
									arg0[local431] = '*';
								}
							} else {
								local28 = 1;
							}
						}
					}
				}
			}
		} catch (@Pc(458) RuntimeException local458) {
			signlink.reporterror("95946, " + arg0 + ", " + arg1 + ", " + 3 + ", " + arg2 + ", " + local458.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[[BBB)Z")
	private static boolean method610(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) byte arg2) {
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
				@Pc(50) int local50 = (local1 + local22) / 2;
				if (arg0[local50][0] == arg1 && arg0[local50][1] == arg2) {
					return true;
				}
				if (arg1 < arg0[local50][0] || arg1 == arg0[local50][0] && arg2 < arg0[local50][1]) {
					local22 = local50;
				} else {
					local1 = local50;
				}
			} while (local1 != local22 && local1 + 1 != local22);
			return false;
		} catch (@Pc(104) RuntimeException local104) {
			signlink.reporterror("7858, " + -484 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local104.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(CZCC)I")
	private static int method611(@OriginalArg(0) char arg0, @OriginalArg(2) char arg1, @OriginalArg(3) char arg2) {
		try {
			if (arg0 == arg2) {
				return 1;
			} else if (arg0 == 'o' && arg2 == '0') {
				return 1;
			} else if (arg0 == 'o' && arg2 == '(' && arg1 == ')') {
				return 2;
			} else if (arg0 == 'c' && (arg2 == '(' || arg2 == '<' || arg2 == '[')) {
				return 1;
			} else if (arg0 == 'e' && arg2 == '€') {
				return 1;
			} else if (arg0 == 's' && arg2 == '$') {
				return 1;
			} else if (arg0 == 'l' && arg2 == 'i') {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("70062, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(CCCI)I")
	private static int method612(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(2) char arg2) {
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
			signlink.reporterror("22235, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -726 + ", " + local517.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(CI)B")
	private static byte method613(@OriginalArg(0) char arg0) {
		try {
			if (anInt930 > 9 || anInt930 < 9) {
				anInt927 = -479;
			}
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
			signlink.reporterror("44533, " + arg0 + ", " + 9 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "([CI)V")
	private static void method614(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			@Pc(21) int local21 = 0;
			while (true) {
				do {
					@Pc(120) int local120;
					if ((local120 = method615(arg0, anInt931, local5)) == -1) {
						return;
					}
					@Pc(25) boolean local25 = false;
					for (@Pc(27) int local27 = local5; local27 >= 0 && local27 < local120 && !local25; local27++) {
						if (!method617(arg0[local27]) && !method618(arg0[local27])) {
							local25 = true;
						}
					}
					if (local25) {
						local7 = 0;
					}
					if (local7 == 0) {
						local21 = local120;
					}
					local5 = method616(arg0, local120);
					@Pc(66) int local66 = 0;
					for (@Pc(68) int local68 = local120; local68 < local5; local68++) {
						local66 = local66 * 10 + arg0[local68] - 48;
					}
					if (local66 <= 255 && local5 - local120 <= 8) {
						local7++;
					} else {
						local7 = 0;
					}
				} while (local7 != 4);
				for (@Pc(102) int local102 = local21; local102 < local5; local102++) {
					arg0[local102] = '*';
				}
				local7 = 0;
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("38509, " + arg0 + ", " + 9 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CII)I")
	private static int method615(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg1 != 0) {
				anInt933 = 256;
			}
			for (@Pc(5) int local5 = arg2; local5 < arg0.length && local5 >= 0; local5++) {
				if (arg0[local5] >= '0' && arg0[local5] <= '9') {
					return local5;
				}
			}
			return -1;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("66824, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[CI)I")
	private static int method616(@OriginalArg(1) char[] arg0, @OriginalArg(2) int arg1) {
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
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("53907, " + 9 + ", " + arg0 + ", " + arg1 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IC)Z")
	private static boolean method617(@OriginalArg(1) char arg0) {
		try {
			return !method619(aByte43, arg0) && !method620(636, arg0);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("80500, " + 0 + ", " + arg0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(CI)Z")
	private static boolean method618(@OriginalArg(0) char arg0) {
		try {
			if (arg0 >= 'a' && arg0 <= 'z') {
				return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
			} else {
				return true;
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("73724, " + arg0 + ", " + -972 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BC)Z")
	private static boolean method619(@OriginalArg(0) byte arg0, @OriginalArg(1) char arg1) {
		try {
			if (arg0 != -17) {
				for (@Pc(4) int local4 = 1; local4 > 0; local4++) {
				}
			}
			return arg1 >= 'a' && arg1 <= 'z' || arg1 >= 'A' && arg1 <= 'Z';
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("60824, " + arg0 + ", " + arg1 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(IC)Z")
	private static boolean method620(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		try {
			@Pc(3) boolean local3 = false;
			return arg1 >= '0' && arg1 <= '9';
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("60738, " + arg0 + ", " + arg1 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(IC)Z")
	private static boolean method621(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z';
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("29891, " + 0 + ", " + arg0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "(IC)Z")
	private static boolean method622(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		try {
			if (arg0 != 5) {
				throw new NullPointerException();
			}
			return arg1 >= 'A' && arg1 <= 'Z';
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("63657, " + arg0 + ", " + arg1 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "([CI)Z")
	private static boolean method623(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				if (!method620(636, arg0[local5]) && arg0[local5] != '\u0000') {
					local3 = false;
				}
			}
			if (local3) {
				return true;
			}
			@Pc(44) int local44 = method624(arg0);
			@Pc(46) int local46 = 0;
			@Pc(51) int local51 = anIntArray251.length - 1;
			if (local44 == anIntArray251[0] || local44 == anIntArray251[local51]) {
				return true;
			}
			do {
				@Pc(69) int local69 = (local46 + local51) / 2;
				if (local44 == anIntArray251[local69]) {
					return true;
				}
				if (local44 < anIntArray251[local69]) {
					local51 = local69;
				} else {
					local46 = local69;
				}
			} while (local46 != local51 && local46 + 1 != local51);
			return false;
		} catch (@Pc(98) RuntimeException local98) {
			signlink.reporterror("82758, " + arg0 + ", " + 6 + ", " + local98.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(B[C)I")
	private static int method624(@OriginalArg(1) char[] arg0) {
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
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("88275, " + -119 + ", " + arg0 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}
}
