import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!EZWZJZNN")
public final class Class14 {

	@OriginalMember(owner = "client!EZWZJZNN", name = "b", descriptor = "I")
	private static int anInt173;

	@OriginalMember(owner = "client!EZWZJZNN", name = "c", descriptor = "Z")
	private static boolean aBoolean49;

	@OriginalMember(owner = "client!EZWZJZNN", name = "e", descriptor = "I")
	private static int anInt174;

	@OriginalMember(owner = "client!EZWZJZNN", name = "g", descriptor = "Z")
	private static boolean aBoolean52;

	@OriginalMember(owner = "client!EZWZJZNN", name = "h", descriptor = "[I")
	private static int[] anIntArray24;

	@OriginalMember(owner = "client!EZWZJZNN", name = "i", descriptor = "[[C")
	private static char[][] aCharArrayArray1;

	@OriginalMember(owner = "client!EZWZJZNN", name = "j", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!EZWZJZNN", name = "k", descriptor = "[[C")
	private static char[][] aCharArrayArray2;

	@OriginalMember(owner = "client!EZWZJZNN", name = "l", descriptor = "[[C")
	private static char[][] aCharArrayArray3;

	@OriginalMember(owner = "client!EZWZJZNN", name = "m", descriptor = "[I")
	private static int[] anIntArray25;

	@OriginalMember(owner = "client!EZWZJZNN", name = "a", descriptor = "I")
	private static int anInt172 = 1;

	@OriginalMember(owner = "client!EZWZJZNN", name = "d", descriptor = "Z")
	private static boolean aBoolean50 = true;

	@OriginalMember(owner = "client!EZWZJZNN", name = "n", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray3;

	static {
		aBoolean51 = true;
		aStringArray3 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };
	}

	@OriginalMember(owner = "client!EZWZJZNN", name = "a", descriptor = "(Lclient!QKFGLETG;)V")
	public static void method116(@OriginalArg(0) Class36 arg0) {
		@Pc(10) Class1_Sub1_Sub3 local10 = new Class1_Sub1_Sub3((byte) 9, arg0.method337("fragmentsenc.txt", null));
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3((byte) 9, arg0.method337("badenc.txt", null));
		@Pc(28) Class1_Sub1_Sub3 local28 = new Class1_Sub1_Sub3((byte) 9, arg0.method337("domainenc.txt", null));
		@Pc(37) Class1_Sub1_Sub3 local37 = new Class1_Sub1_Sub3((byte) 9, arg0.method337("tldlist.txt", null));
		method117(local10, local19, local28, local37);
	}

	@OriginalMember(owner = "client!EZWZJZNN", name = "a", descriptor = "(Lclient!XJCNBMKS;Lclient!XJCNBMKS;Lclient!XJCNBMKS;Lclient!XJCNBMKS;)V")
	private static void method117(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) Class1_Sub1_Sub3 arg2, @OriginalArg(3) Class1_Sub1_Sub3 arg3) {
		method119(arg1);
		method120(arg2);
		method121(arg0);
		method118(arg3);
	}

	@OriginalMember(owner = "client!EZWZJZNN", name = "a", descriptor = "(ILclient!XJCNBMKS;)V")
	private static void method118(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(4) int local4 = arg0.method503();
			aCharArrayArray3 = new char[local4][];
			anIntArray25 = new int[local4];
			for (@Pc(16) int local16 = 0; local16 < local4; local16++) {
				anIntArray25[local16] = arg0.method498();
				@Pc(27) char[] local27 = new char[arg0.method498()];
				for (@Pc(29) int local29 = 0; local29 < local27.length; local29++) {
					local27[local29] = (char) arg0.method498();
				}
				aCharArrayArray3[local16] = local27;
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("32690, " + 3 + ", " + arg0 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EZWZJZNN", name = "a", descriptor = "(ZLclient!XJCNBMKS;)V")
	private static void method119(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(2) int local2 = arg0.method503();
			aCharArrayArray1 = new char[local2][];
			aByteArrayArrayArray1 = new byte[local2][][];
			method122(aCharArrayArray1, arg0, aByteArrayArrayArray1);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("29656, " + false + ", " + arg0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EZWZJZNN", name = "b", descriptor = "(ILclient!XJCNBMKS;)V")
	private static void method120(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(2) int local2 = arg0.method503();
			aCharArrayArray2 = new char[local2][];
			method123(aCharArrayArray2, arg0, 453);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("556, " + 26969 + ", " + arg0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EZWZJZNN", name = "b", descriptor = "(ZLclient!XJCNBMKS;)V")
	private static void method121(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			anIntArray24 = new int[arg0.method503()];
			for (@Pc(5) int local5 = 0; local5 < anIntArray24.length; local5++) {
				anIntArray24[local5] = arg0.method500();
			}
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("51715, " + true + ", " + arg0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EZWZJZNN", name = "a", descriptor = "([[CLclient!XJCNBMKS;[[[BB)V")
	private static void method122(@OriginalArg(0) char[][] arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) byte[][][] arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
				@Pc(9) char[] local9 = new char[arg1.method498()];
				for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
					local9[local11] = (char) arg1.method498();
				}
				arg0[local3] = local9;
				@Pc(33) byte[][] local33 = new byte[arg1.method498()][2];
				for (@Pc(35) int local35 = 0; local35 < local33.length; local35++) {
					local33[local35][0] = (byte) arg1.method498();
					local33[local35][1] = (byte) arg1.method498();
				}
				if (local33.length > 0) {
					arg2[local3] = local33;
				}
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("82923, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 33 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EZWZJZNN", name = "a", descriptor = "([[CLclient!XJCNBMKS;I)V")
	private static void method123(@OriginalArg(0) char[][] arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(5) boolean local5 = false;
			for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
				@Pc(13) char[] local13 = new char[arg1.method498()];
				for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
					local13[local15] = (char) arg1.method498();
				}
				arg0[local7] = local13;
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("98475, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EZWZJZNN", name = "a", descriptor = "([CZ)V")
	private static void method124(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) int local3 = 0;
			for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
				if (method125(arg0[local13])) {
					arg0[local3] = arg0[local13];
				} else {
					arg0[local3] = ' ';
				}
				if (local3 == 0 || arg0[local3] != ' ' || arg0[local3 - 1] != ' ') {
					local3++;
				}
			}
			for (@Pc(55) int local55 = local3; local55 < arg0.length; local55++) {
				arg0[local55] = ' ';
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("96969, " + arg0 + ", " + false + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EZWZJZNN", name = "a", descriptor = "(IC)Z")
	private static boolean method125(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= ' ' && arg0 <= '\u007f' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("35475, " + 896 + ", " + arg0 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EZWZJZNN", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method126(@OriginalArg(0) String arg0) {
		try {
			@Pc(3) long local3 = System.currentTimeMillis();
			@Pc(14) char[] local14 = arg0.toCharArray();
			method124(local14);
			@Pc(23) String local23 = (new String(local14)).trim();
			@Pc(27) char[] local27 = local23.toLowerCase().toCharArray();
			@Pc(30) String local30 = local23.toLowerCase();
			method134(local27);
			method129(local27);
			method130(local27);
			method143(local27);
			for (@Pc(44) int local44 = 0; local44 < aStringArray3.length; local44++) {
				@Pc(54) int local54 = -1;
				while ((local54 = local30.indexOf(aStringArray3[local44], local54 + 1)) != -1) {
					@Pc(61) char[] local61 = aStringArray3[local44].toCharArray();
					for (@Pc(63) int local63 = 0; local63 < local61.length; local63++) {
						local27[local63 + local54] = local61[local63];
					}
				}
			}
			method127(local27, anInt174, local23.toCharArray());
			method128(local27);
			@Pc(105) long local105 = System.currentTimeMillis();
			return (new String(local27)).trim();
		} catch (@Pc(112) RuntimeException local112) {
			signlink.reporterror("78829, " + arg0 + ", " + 0 + ", " + local112.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EZWZJZNN", name = "a", descriptor = "([CI[C)V")
	private static void method127(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) char[] arg2) {
		try {
			if (arg1 != 0) {
				anInt173 = -42;
			}
			for (@Pc(5) int local5 = 0; local5 < arg2.length; local5++) {
				if (arg0[local5] != '*' && method151(arg2[local5])) {
					arg0[local5] = arg2[local5];
				}
			}
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("66002, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EZWZJZNN", name = "a", descriptor = "([CI)V")
	private static void method128(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(8) int local8 = 0; local8 < arg0.length; local8++) {
				@Pc(14) char local14 = arg0[local8];
				if (!method148(953, local14)) {
					local3 = true;
				} else if (local3) {
					if (method150(937, local14)) {
						local3 = false;
					}
				} else if (method151(local14)) {
					arg0[local8] = (char) (local14 + 'a' - 65);
				}
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("26747, " + arg0 + ", " + 0 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EZWZJZNN", name = "b", descriptor = "([CI)V")
	private static void method129(@OriginalArg(0) char[] arg0) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 2; local3++) {
				for (@Pc(10) int local10 = aCharArrayArray1.length - 1; local10 >= 0; local10--) {
					method138(aByteArrayArrayArray1[local10], arg0, aCharArrayArray1[local10]);
				}
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("53126, " + arg0 + ", " + 204 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EZWZJZNN", name = "a", descriptor = "(I[C)V")
	private static void method130(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(5) char[] local5 = (char[]) arg0.clone();
			@Pc(20) char[] local20 = new char[] { '(', 'a', ')' };
			method138(null, local5, local20);
			@Pc(29) char[] local29 = (char[]) arg0.clone();
			@Pc(44) char[] local44 = new char[] { 'd', 'o', 't' };
			method138(null, local29, local44);
			for (@Pc(63) int local63 = aCharArrayArray2.length - 1; local63 >= 0; local63--) {
				method131(local5, arg0, local29, aCharArrayArray2[local63]);
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("47597, " + -957 + ", " + arg0 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EZWZJZNN", name = "a", descriptor = "([C[CZ[C[C)V")
	private static void method131(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(3) char[] arg2, @OriginalArg(4) char[] arg3) {
		try {
			if (arg3.length <= arg1.length) {
				@Pc(28) int local28;
				for (@Pc(20) int local20 = 0; local20 <= arg1.length - arg3.length; local20 += local28) {
					@Pc(24) int local24 = local20;
					@Pc(26) int local26 = 0;
					local28 = 1;
					label58: while (true) {
						while (true) {
							if (local24 >= arg1.length) {
								break label58;
							}
							@Pc(36) char local36 = arg1[local24];
							@Pc(38) char local38 = 0;
							if (local24 + 1 < arg1.length) {
								local38 = arg1[local24 + 1];
							}
							@Pc(63) int local63;
							if (local26 < arg3.length && (local63 = method140(local36, local38, arg3[local26])) > 0) {
								local24 += local63;
								local26++;
							} else {
								if (local26 == 0) {
									break label58;
								}
								@Pc(84) int local84;
								if ((local84 = method140(local36, local38, arg3[local26 - 1])) > 0) {
									local24 += local84;
									if (local26 == 1) {
										local28++;
									}
								} else {
									if (local26 >= arg3.length || !method146(local36)) {
										break label58;
									}
									local24++;
								}
							}
						}
					}
					if (local26 >= arg3.length) {
						@Pc(115) boolean local115 = false;
						@Pc(121) int local121 = method132(local20, arg0, arg1);
						@Pc(129) int local129 = method133(arg2, local24 - 1, arg1);
						if (local121 > 2 || local129 > 2) {
							local115 = true;
						}
						if (local115) {
							for (@Pc(141) int local141 = local20; local141 < local24; local141++) {
								arg1[local141] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(164) RuntimeException local164) {
			signlink.reporterror("94525, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + arg3 + ", " + local164.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EZWZJZNN", name = "a", descriptor = "(I[CI[C)I")
	private static int method132(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg0 == 0) {
				return 2;
			}
			for (@Pc(9) int local9 = arg0 - 1; local9 >= 0 && method146(arg2[local9]); local9--) {
				if (arg2[local9] == '@') {
					return 3;
				}
			}
			@Pc(29) int local29 = 0;
			for (@Pc(33) int local33 = arg0 - 1; local33 >= 0 && method146(arg1[local33]); local33--) {
				if (arg1[local33] == '*') {
					local29++;
				}
			}
			if (local29 >= 3) {
				return 4;
			} else if (method146(arg2[arg0 - 1])) {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("51507, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EZWZJZNN", name = "a", descriptor = "([CII[C)I")
	private static int method133(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg1 + 1 == arg2.length) {
				return 2;
			}
			@Pc(13) int local13 = arg1 + 1;
			while (true) {
				if (local13 < arg2.length && method146(arg2[local13])) {
					if (arg2[local13] != '.' && arg2[local13] != ',') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(48) int local48 = 0;
				for (@Pc(52) int local52 = arg1 + 1; local52 < arg2.length && method146(arg0[local52]); local52++) {
					if (arg0[local52] == '*') {
						local48++;
					}
				}
				if (local48 >= 3) {
					return 4;
				}
				if (method146(arg2[arg1 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("42430, " + arg0 + ", " + arg1 + ", " + 167 + ", " + arg2 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EZWZJZNN", name = "b", descriptor = "(I[C)V")
	private static void method134(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(18) char[] local18 = new char[] { 'd', 'o', 't' };
			method138(null, local3, local18);
			@Pc(27) char[] local27 = (char[]) arg0.clone();
			@Pc(50) char[] local50 = new char[] { 's', 'l', 'a', 's', 'h' };
			method138(null, local27, local50);
			for (@Pc(60) int local60 = 0; local60 < aCharArrayArray3.length; local60++) {
				method135(anIntArray25[local60], arg0, local3, aCharArrayArray3[local60], local27);
			}
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("12047, " + 0 + ", " + arg0 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EZWZJZNN", name = "a", descriptor = "(II[C[C[C[C)V")
	private static void method135(@OriginalArg(1) int arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2, @OriginalArg(4) char[] arg3, @OriginalArg(5) char[] arg4) {
		try {
			if (arg3.length <= arg1.length) {
				@Pc(32) int local32;
				for (@Pc(24) int local24 = 0; local24 <= arg1.length - arg3.length; local24 += local32) {
					@Pc(28) int local28 = local24;
					@Pc(30) int local30 = 0;
					local32 = 1;
					label120: while (true) {
						while (true) {
							if (local28 >= arg1.length) {
								break label120;
							}
							@Pc(40) char local40 = arg1[local28];
							@Pc(42) char local42 = 0;
							if (local28 + 1 < arg1.length) {
								local42 = arg1[local28 + 1];
							}
							@Pc(67) int local67;
							if (local30 < arg3.length && (local67 = method140(local40, local42, arg3[local30])) > 0) {
								local28 += local67;
								local30++;
							} else {
								if (local30 == 0) {
									break label120;
								}
								@Pc(88) int local88;
								if ((local88 = method140(local40, local42, arg3[local30 - 1])) > 0) {
									local28 += local88;
									if (local30 == 1) {
										local32++;
									}
								} else {
									if (local30 >= arg3.length || !method146(local40)) {
										break label120;
									}
									local28++;
								}
							}
						}
					}
					if (local30 >= arg3.length) {
						@Pc(119) boolean local119 = false;
						@Pc(125) int local125 = method136(arg1, local24, arg2);
						@Pc(133) int local133 = method137(local28 - 1, arg4, arg1);
						if (arg0 == 1 && local125 > 0 && local133 > 0) {
							local119 = true;
						}
						if (arg0 == 2 && (local125 > 2 && local133 > 0 || local125 > 0 && local133 > 2)) {
							local119 = true;
						}
						if (arg0 == 3 && local125 > 0 && local133 > 2) {
							local119 = true;
						}
						@Pc(176) boolean local176;
						if (arg0 == 3 && local125 > 2 && local133 > 0) {
							local176 = true;
						} else {
							local176 = false;
						}
						if (local119) {
							@Pc(183) int local183 = local24;
							@Pc(187) int local187 = local28 - 1;
							@Pc(195) boolean local195;
							@Pc(199) int local199;
							if (local125 > 2) {
								if (local125 == 4) {
									local195 = false;
									for (local199 = local24 - 1; local199 >= 0; local199--) {
										if (local195) {
											if (arg2[local199] != '*') {
												break;
											}
											local183 = local199;
										} else if (arg2[local199] == '*') {
											local183 = local199;
											local195 = true;
										}
									}
								}
								local195 = false;
								for (local199 = local183 - 1; local199 >= 0; local199--) {
									if (local195) {
										if (method146(arg1[local199])) {
											break;
										}
										local183 = local199;
									} else if (!method146(arg1[local199])) {
										local195 = true;
										local183 = local199;
									}
								}
							}
							if (local133 > 2) {
								if (local133 == 4) {
									local195 = false;
									for (local199 = local187 + 1; local199 < arg1.length; local199++) {
										if (local195) {
											if (arg4[local199] != '*') {
												break;
											}
											local187 = local199;
										} else if (arg4[local199] == '*') {
											local187 = local199;
											local195 = true;
										}
									}
								}
								local195 = false;
								for (local199 = local187 + 1; local199 < arg1.length; local199++) {
									if (local195) {
										if (method146(arg1[local199])) {
											break;
										}
										local187 = local199;
									} else if (!method146(arg1[local199])) {
										local195 = true;
										local187 = local199;
									}
								}
							}
							for (@Pc(333) int local333 = local183; local333 <= local187; local333++) {
								arg1[local333] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(356) RuntimeException local356) {
			signlink.reporterror("84417, " + 2 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local356.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EZWZJZNN", name = "b", descriptor = "([CII[C)I")
	private static int method136(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg1 == 0) {
				return 2;
			}
			@Pc(9) int local9 = arg1 - 1;
			while (true) {
				if (local9 >= 0 && method146(arg0[local9])) {
					if (arg0[local9] != ',' && arg0[local9] != '.') {
						local9--;
						continue;
					}
					return 3;
				}
				@Pc(34) int local34 = 0;
				for (@Pc(46) int local46 = arg1 - 1; local46 >= 0 && method146(arg2[local46]); local46--) {
					if (arg2[local46] == '*') {
						local34++;
					}
				}
				if (local34 >= 3) {
					return 4;
				}
				if (method146(arg0[arg1 - 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("35049, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EZWZJZNN", name = "a", descriptor = "(II[C[C)I")
	private static int method137(@OriginalArg(0) int arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg0 + 1 == arg2.length) {
				return 2;
			}
			@Pc(18) int local18 = arg0 + 1;
			while (true) {
				if (local18 < arg2.length && method146(arg2[local18])) {
					if (arg2[local18] != '\\' && arg2[local18] != '/') {
						local18++;
						continue;
					}
					return 3;
				}
				@Pc(45) int local45 = 0;
				for (@Pc(49) int local49 = arg0 + 1; local49 < arg2.length && method146(arg1[local49]); local49++) {
					if (arg1[local49] == '*') {
						local45++;
					}
				}
				if (local45 >= 5) {
					return 4;
				}
				if (method146(arg2[arg0 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("98710, " + arg0 + ", " + 32410 + ", " + arg1 + ", " + arg2 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EZWZJZNN", name = "a", descriptor = "([[B[C[CB)V")
	private static void method138(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2) {
		try {
			if (arg2.length <= arg1.length) {
				@Pc(21) int local21;
				for (@Pc(11) int local11 = 0; local11 <= arg1.length - arg2.length; local11 += local21) {
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
							if (local15 >= arg1.length || local25 && local27) {
								break label165;
							}
							var12 = arg1[local15];
							var13 = '\u0000';
							if (local15 + 1 < arg1.length) {
								var13 = arg1[local15 + 1];
							}
							@Pc(62) int local62;
							if (local17 < arg2.length && (local62 = method141(var13, arg2[local17], var12)) > 0) {
								if (local62 == 1 && method149(var12)) {
									local25 = true;
								}
								if (local62 == 2 && (method149(var12) || method149(var13))) {
									local25 = true;
								}
								local15 += local62;
								local17++;
							} else {
								if (local17 == 0) {
									break label165;
								}
								@Pc(105) int local105;
								if ((local105 = method141(var13, arg2[local17 - 1], var12)) > 0) {
									local15 += local105;
									if (local17 == 1) {
										local21++;
									}
								} else {
									if (local17 >= arg2.length || !method147(var12)) {
										break label165;
									}
									if (method146(var12) && var12 != '\'') {
										local23 = true;
									}
									if (method149(var12)) {
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
					if (local17 >= arg2.length && (!local25 || !local27)) {
						@Pc(170) boolean local170 = true;
						@Pc(266) int local266;
						if (local23) {
							@Pc(216) boolean local216 = false;
							@Pc(218) boolean local218 = false;
							if (local11 - 1 < 0 || method146(arg1[local11 - 1]) && arg1[local11 - 1] != '\'') {
								local216 = true;
							}
							if (local15 >= arg1.length || method146(arg1[local15]) && arg1[local15] != '\'') {
								local218 = true;
							}
							if (!local216 || !local218) {
								@Pc(262) boolean local262 = false;
								local266 = local11 - 2;
								if (local216) {
									local266 = local11;
								}
								while (!local262 && local266 < local15) {
									if (local266 >= 0 && (!method146(arg1[local266]) || arg1[local266] == '\'')) {
										@Pc(288) char[] local288 = new char[3];
										@Pc(290) int local290;
										for (local290 = 0; local290 < 3 && local266 + local290 < arg1.length && (!method146(arg1[local266 + local290]) || arg1[local266 + local290] == '\''); local290++) {
											local288[local290] = arg1[local266 + local290];
										}
										@Pc(328) boolean local328 = true;
										if (local290 == 0) {
											local328 = false;
										}
										if (local290 < 3 && local266 - 1 >= 0 && (!method146(arg1[local266 - 1]) || arg1[local266 - 1] == '\'')) {
											local328 = false;
										}
										if (local328 && !method152(local288)) {
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
								var12 = arg1[local11 - 1];
							}
							var13 = ' ';
							if (local15 < arg1.length) {
								var13 = arg1[local15];
							}
							@Pc(198) byte local198 = method142(var12);
							@Pc(202) byte local202 = method142(var13);
							if (arg0 != null && method139(local198, local202, arg0)) {
								local170 = false;
							}
						}
						if (local170) {
							@Pc(378) int local378 = 0;
							@Pc(380) int local380 = 0;
							@Pc(382) int local382 = -1;
							for (local266 = local11; local266 < local15; local266++) {
								if (method149(arg1[local266])) {
									local378++;
								} else if (method148(953, arg1[local266])) {
									local380++;
									local382 = local266;
								}
							}
							if (local382 > -1) {
								local378 -= local15 - local382 - 1;
							}
							if (local378 <= local380) {
								for (@Pc(424) int local424 = local11; local424 < local15; local424++) {
									arg1[local424] = '*';
								}
							} else {
								local21 = 1;
							}
						}
					}
				}
			}
		} catch (@Pc(460) RuntimeException local460) {
			signlink.reporterror("22685, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -1 + ", " + local460.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EZWZJZNN", name = "a", descriptor = "(BBB[[B)Z")
	private static boolean method139(@OriginalArg(0) byte arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) byte[][] arg2) {
		try {
			@Pc(1) int local1 = 0;
			if (arg2[0][0] == arg0 && arg2[0][1] == arg1) {
				return true;
			}
			@Pc(22) int local22 = arg2.length - 1;
			if (arg2[local22][0] == arg0 && arg2[local22][1] == arg1) {
				return true;
			}
			do {
				@Pc(53) int local53 = (local1 + local22) / 2;
				if (arg2[local53][0] == arg0 && arg2[local53][1] == arg1) {
					return true;
				}
				if (arg0 < arg2[local53][0] || arg0 == arg2[local53][0] && arg1 < arg2[local53][1]) {
					local22 = local53;
				} else {
					local1 = local53;
				}
			} while (local1 != local22 && local1 + 1 != local22);
			return false;
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("57414, " + arg0 + ", " + -124 + ", " + arg1 + ", " + arg2 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EZWZJZNN", name = "a", descriptor = "(CCIC)I")
	private static int method140(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(3) char arg2) {
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
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("92265, " + arg0 + ", " + arg1 + ", " + -941 + ", " + arg2 + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EZWZJZNN", name = "a", descriptor = "(ICCC)I")
	private static int method141(@OriginalArg(1) char arg0, @OriginalArg(2) char arg1, @OriginalArg(3) char arg2) {
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
			signlink.reporterror("60390, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local512.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EZWZJZNN", name = "b", descriptor = "(IC)B")
	private static byte method142(@OriginalArg(1) char arg0) {
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
			signlink.reporterror("32223, " + -361 + ", " + arg0 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EZWZJZNN", name = "a", descriptor = "([CB)V")
	private static void method143(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			@Pc(9) int local9 = 0;
			while (true) {
				do {
					@Pc(117) int local117;
					if ((local117 = method144(arg0, local5)) == -1) {
						return;
					}
					@Pc(22) boolean local22 = false;
					for (@Pc(24) int local24 = local5; local24 >= 0 && local24 < local117 && !local22; local24++) {
						if (!method146(arg0[local24]) && !method147(arg0[local24])) {
							local22 = true;
						}
					}
					if (local22) {
						local7 = 0;
					}
					if (local7 == 0) {
						local9 = local117;
					}
					local5 = method145(arg0, local117);
					@Pc(63) int local63 = 0;
					for (@Pc(65) int local65 = local117; local65 < local5; local65++) {
						local63 = local63 * 10 + arg0[local65] - 48;
					}
					if (local63 <= 255 && local5 - local117 <= 8) {
						local7++;
					} else {
						local7 = 0;
					}
				} while (local7 != 4);
				for (@Pc(99) int local99 = local9; local99 < local5; local99++) {
					arg0[local99] = '*';
				}
				local7 = 0;
			}
		} catch (@Pc(121) RuntimeException local121) {
			signlink.reporterror("79933, " + arg0 + ", " + 4 + ", " + local121.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EZWZJZNN", name = "a", descriptor = "([CII)I")
	private static int method144(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1) {
		try {
			for (@Pc(1) int local1 = arg1; local1 < arg0.length && local1 >= 0; local1++) {
				if (arg0[local1] >= '0' && arg0[local1] <= '9') {
					return local1;
				}
			}
			return -1;
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("99433, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EZWZJZNN", name = "a", descriptor = "([CIZ)I")
	private static int method145(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1) {
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
			signlink.reporterror("55943, " + arg0 + ", " + arg1 + ", " + true + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EZWZJZNN", name = "a", descriptor = "(CI)Z")
	private static boolean method146(@OriginalArg(0) char arg0) {
		try {
			return !method148(953, arg0) && !method149(arg0);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("18421, " + arg0 + ", " + 0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EZWZJZNN", name = "a", descriptor = "(ZC)Z")
	private static boolean method147(@OriginalArg(1) char arg0) {
		try {
			if (arg0 >= 'a' && arg0 <= 'z') {
				return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
			} else {
				return true;
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("44770, " + true + ", " + arg0 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EZWZJZNN", name = "c", descriptor = "(IC)Z")
	private static boolean method148(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		try {
			@Pc(3) boolean local3 = false;
			return arg1 >= 'a' && arg1 <= 'z' || arg1 >= 'A' && arg1 <= 'Z';
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("75782, " + arg0 + ", " + arg1 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EZWZJZNN", name = "b", descriptor = "(CI)Z")
	private static boolean method149(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= '0' && arg0 <= '9';
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("20669, " + arg0 + ", " + 707 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EZWZJZNN", name = "d", descriptor = "(IC)Z")
	private static boolean method150(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		try {
			@Pc(3) boolean local3 = false;
			return arg1 >= 'a' && arg1 <= 'z';
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("58995, " + arg0 + ", " + arg1 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EZWZJZNN", name = "e", descriptor = "(IC)Z")
	private static boolean method151(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("14985, " + -596 + ", " + arg0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EZWZJZNN", name = "c", descriptor = "(I[C)Z")
	private static boolean method152(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
				if (!method149(arg0[local13]) && arg0[local13] != '\u0000') {
					local3 = false;
				}
			}
			if (local3) {
				return true;
			}
			@Pc(40) int local40 = method153(arg0);
			@Pc(42) int local42 = 0;
			@Pc(47) int local47 = anIntArray24.length - 1;
			if (local40 == anIntArray24[0] || local40 == anIntArray24[local47]) {
				return true;
			}
			do {
				@Pc(65) int local65 = (local42 + local47) / 2;
				if (local40 == anIntArray24[local65]) {
					return true;
				}
				if (local40 < anIntArray24[local65]) {
					local47 = local65;
				} else {
					local42 = local65;
				}
			} while (local42 != local47 && local42 + 1 != local47);
			return false;
		} catch (@Pc(94) RuntimeException local94) {
			signlink.reporterror("15521, " + 718 + ", " + arg0 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EZWZJZNN", name = "b", descriptor = "([CZ)I")
	private static int method153(@OriginalArg(0) char[] arg0) {
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
			signlink.reporterror("82936, " + arg0 + ", " + false + ", " + local85.toString());
			throw new RuntimeException();
		}
	}
}
