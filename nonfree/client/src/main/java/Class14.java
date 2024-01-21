import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!HBDSGKGH")
public final class Class14 {

	@OriginalMember(owner = "client!HBDSGKGH", name = "f", descriptor = "I")
	private static int anInt210;

	@OriginalMember(owner = "client!HBDSGKGH", name = "i", descriptor = "Z")
	private static boolean aBoolean62;

	@OriginalMember(owner = "client!HBDSGKGH", name = "j", descriptor = "I")
	private static int anInt212;

	@OriginalMember(owner = "client!HBDSGKGH", name = "k", descriptor = "[I")
	private static int[] anIntArray41;

	@OriginalMember(owner = "client!HBDSGKGH", name = "l", descriptor = "[[C")
	private static char[][] aCharArrayArray1;

	@OriginalMember(owner = "client!HBDSGKGH", name = "m", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!HBDSGKGH", name = "n", descriptor = "[[C")
	private static char[][] aCharArrayArray2;

	@OriginalMember(owner = "client!HBDSGKGH", name = "o", descriptor = "[[C")
	private static char[][] aCharArrayArray3;

	@OriginalMember(owner = "client!HBDSGKGH", name = "p", descriptor = "[I")
	private static int[] anIntArray42;

	@OriginalMember(owner = "client!HBDSGKGH", name = "a", descriptor = "Z")
	private static boolean aBoolean59 = true;

	@OriginalMember(owner = "client!HBDSGKGH", name = "b", descriptor = "Z")
	private static boolean aBoolean60 = true;

	@OriginalMember(owner = "client!HBDSGKGH", name = "c", descriptor = "B")
	private static byte aByte17 = -90;

	@OriginalMember(owner = "client!HBDSGKGH", name = "d", descriptor = "Z")
	private static boolean aBoolean61 = true;

	@OriginalMember(owner = "client!HBDSGKGH", name = "e", descriptor = "I")
	private static int anInt209 = 19080;

	@OriginalMember(owner = "client!HBDSGKGH", name = "g", descriptor = "B")
	private static byte aByte18 = 52;

	@OriginalMember(owner = "client!HBDSGKGH", name = "h", descriptor = "I")
	private static int anInt211 = -438;

	@OriginalMember(owner = "client!HBDSGKGH", name = "q", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray5 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

	@OriginalMember(owner = "client!HBDSGKGH", name = "a", descriptor = "(Lclient!RPFMUSNN;)V")
	public static void method160(@OriginalArg(0) Class35 arg0) {
		@Pc(10) Class3_Sub1_Sub4 local10 = new Class3_Sub1_Sub4((byte) -58, arg0.method341("fragmentsenc.txt", null));
		@Pc(19) Class3_Sub1_Sub4 local19 = new Class3_Sub1_Sub4((byte) -58, arg0.method341("badenc.txt", null));
		@Pc(28) Class3_Sub1_Sub4 local28 = new Class3_Sub1_Sub4((byte) -58, arg0.method341("domainenc.txt", null));
		@Pc(37) Class3_Sub1_Sub4 local37 = new Class3_Sub1_Sub4((byte) -58, arg0.method341("tldlist.txt", null));
		method161(local10, local19, local28, local37);
	}

	@OriginalMember(owner = "client!HBDSGKGH", name = "a", descriptor = "(Lclient!WNCFPLWV;Lclient!WNCFPLWV;Lclient!WNCFPLWV;Lclient!WNCFPLWV;)V")
	private static void method161(@OriginalArg(0) Class3_Sub1_Sub4 arg0, @OriginalArg(1) Class3_Sub1_Sub4 arg1, @OriginalArg(2) Class3_Sub1_Sub4 arg2, @OriginalArg(3) Class3_Sub1_Sub4 arg3) {
		method163(aByte17, arg1);
		method164(arg2);
		method165(arg0);
		method162(arg3);
	}

	@OriginalMember(owner = "client!HBDSGKGH", name = "a", descriptor = "(BLclient!WNCFPLWV;)V")
	private static void method162(@OriginalArg(1) Class3_Sub1_Sub4 arg0) {
		try {
			@Pc(4) int local4 = arg0.method463();
			aCharArrayArray3 = new char[local4][];
			anIntArray42 = new int[local4];
			for (@Pc(21) int local21 = 0; local21 < local4; local21++) {
				anIntArray42[local21] = arg0.method458();
				@Pc(32) char[] local32 = new char[arg0.method458()];
				for (@Pc(34) int local34 = 0; local34 < local32.length; local34++) {
					local32[local34] = (char) arg0.method458();
				}
				aCharArrayArray3[local21] = local32;
			}
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("82770, " + 7 + ", " + arg0 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HBDSGKGH", name = "b", descriptor = "(BLclient!WNCFPLWV;)V")
	private static void method163(@OriginalArg(0) byte arg0, @OriginalArg(1) Class3_Sub1_Sub4 arg1) {
		try {
			if (arg0 != -90) {
				aBoolean62 = !aBoolean62;
			}
			@Pc(11) int local11 = arg1.method463();
			aCharArrayArray1 = new char[local11][];
			aByteArrayArrayArray1 = new byte[local11][][];
			method166(aCharArrayArray1, aByteArrayArrayArray1, arg1);
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("54340, " + arg0 + ", " + arg1 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HBDSGKGH", name = "a", descriptor = "(Lclient!WNCFPLWV;I)V")
	private static void method164(@OriginalArg(0) Class3_Sub1_Sub4 arg0) {
		try {
			@Pc(2) int local2 = arg0.method463();
			aCharArrayArray2 = new char[local2][];
			method167(aCharArrayArray2, arg0);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("58581, " + arg0 + ", " + 612 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HBDSGKGH", name = "b", descriptor = "(Lclient!WNCFPLWV;I)V")
	private static void method165(@OriginalArg(0) Class3_Sub1_Sub4 arg0) {
		try {
			anIntArray41 = new int[arg0.method463()];
			for (@Pc(10) int local10 = 0; local10 < anIntArray41.length; local10++) {
				anIntArray41[local10] = arg0.method460();
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("22516, " + arg0 + ", " + 28938 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HBDSGKGH", name = "a", descriptor = "(I[[C[[[BLclient!WNCFPLWV;)V")
	private static void method166(@OriginalArg(1) char[][] arg0, @OriginalArg(2) byte[][][] arg1, @OriginalArg(3) Class3_Sub1_Sub4 arg2) {
		try {
			for (@Pc(6) int local6 = 0; local6 < arg0.length; local6++) {
				@Pc(12) char[] local12 = new char[arg2.method458()];
				for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
					local12[local14] = (char) arg2.method458();
				}
				arg0[local6] = local12;
				@Pc(36) byte[][] local36 = new byte[arg2.method458()][2];
				for (@Pc(38) int local38 = 0; local38 < local36.length; local38++) {
					local36[local38][0] = (byte) arg2.method458();
					local36[local38][1] = (byte) arg2.method458();
				}
				if (local36.length > 0) {
					arg1[local6] = local36;
				}
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("11698, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HBDSGKGH", name = "a", descriptor = "(Z[[CLclient!WNCFPLWV;)V")
	private static void method167(@OriginalArg(1) char[][] arg0, @OriginalArg(2) Class3_Sub1_Sub4 arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
				@Pc(9) char[] local9 = new char[arg1.method458()];
				for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
					local9[local11] = (char) arg1.method458();
				}
				arg0[local3] = local9;
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("53079, " + true + ", " + arg0 + ", " + arg1 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HBDSGKGH", name = "a", descriptor = "(B[C)V")
	private static void method168(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) int local3 = 0;
			for (@Pc(10) int local10 = 0; local10 < arg0.length; local10++) {
				if (method169(aBoolean61, arg0[local10])) {
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
			signlink.reporterror("76798, " + -80 + ", " + arg0 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HBDSGKGH", name = "a", descriptor = "(ZC)Z")
	private static boolean method169(@OriginalArg(0) boolean arg0, @OriginalArg(1) char arg1) {
		try {
			if (!arg0) {
				throw new NullPointerException();
			}
			return arg1 >= ' ' && arg1 <= '\u007f' || arg1 == ' ' || arg1 == '\n' || arg1 == '\t' || arg1 == '£' || arg1 == '€';
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("89037, " + arg0 + ", " + arg1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HBDSGKGH", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
	public static String method170(@OriginalArg(0) String arg0) {
		try {
			@Pc(3) long local3 = System.currentTimeMillis();
			@Pc(6) char[] local6 = arg0.toCharArray();
			method168(local6);
			@Pc(15) String local15 = (new String(local6)).trim();
			@Pc(19) char[] local19 = local15.toLowerCase().toCharArray();
			@Pc(22) String local22 = local15.toLowerCase();
			method178(local19);
			method173((byte) 6, local19);
			method174(local19);
			method187(local19, aByte18);
			for (@Pc(44) int local44 = 0; local44 < aStringArray5.length; local44++) {
				@Pc(54) int local54 = -1;
				while ((local54 = local22.indexOf(aStringArray5[local44], local54 + 1)) != -1) {
					@Pc(61) char[] local61 = aStringArray5[local44].toCharArray();
					for (@Pc(63) int local63 = 0; local63 < local61.length; local63++) {
						local19[local63 + local54] = local61[local63];
					}
				}
			}
			method171(local15.toCharArray(), local19);
			method172(local19);
			@Pc(105) long local105 = System.currentTimeMillis();
			return (new String(local19)).trim();
		} catch (@Pc(112) RuntimeException local112) {
			signlink.reporterror("65298, " + arg0 + ", " + true + ", " + local112.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HBDSGKGH", name = "a", descriptor = "([CI[C)V")
	private static void method171(@OriginalArg(0) char[] arg0, @OriginalArg(2) char[] arg1) {
		try {
			if (anInt209 == 19080) {
				for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
					if (arg1[local5] != '*' && method195(arg0[local5])) {
						arg1[local5] = arg0[local5];
					}
				}
			}
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("98835, " + arg0 + ", " + 19080 + ", " + arg1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HBDSGKGH", name = "a", descriptor = "(I[C)V")
	private static void method172(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				@Pc(11) char local11 = arg0[local5];
				if (!method192(local11)) {
					local3 = true;
				} else if (local3) {
					if (method194(local11)) {
						local3 = false;
					}
				} else if (method195(local11)) {
					arg0[local5] = (char) (local11 + 'a' - 65);
				}
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("36873, " + -525 + ", " + arg0 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HBDSGKGH", name = "b", descriptor = "(B[C)V")
	private static void method173(@OriginalArg(0) byte arg0, @OriginalArg(1) char[] arg1) {
		try {
			@Pc(6) boolean local6 = false;
			for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
				for (@Pc(19) int local19 = aCharArrayArray1.length - 1; local19 >= 0; local19--) {
					method182(aCharArrayArray1[local19], aByteArrayArrayArray1[local19], arg1);
				}
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("70356, " + arg0 + ", " + arg1 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HBDSGKGH", name = "b", descriptor = "(I[C)V")
	private static void method174(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(5) char[] local5 = (char[]) arg0.clone();
			@Pc(20) char[] local20 = new char[] { '(', 'a', ')' };
			method182(local20, null, local5);
			@Pc(29) char[] local29 = (char[]) arg0.clone();
			@Pc(44) char[] local44 = new char[] { 'd', 'o', 't' };
			method182(local44, null, local29);
			for (@Pc(63) int local63 = aCharArrayArray2.length - 1; local63 >= 0; local63--) {
				method175(local29, arg0, aCharArrayArray2[local63], local5);
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("59382, " + 0 + ", " + arg0 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HBDSGKGH", name = "a", descriptor = "([C[CB[C[C)V")
	private static void method175(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(3) char[] arg2, @OriginalArg(4) char[] arg3) {
		try {
			if (arg2.length <= arg1.length) {
				@Pc(27) int local27;
				for (@Pc(19) int local19 = 0; local19 <= arg1.length - arg2.length; local19 += local27) {
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
							if (local25 < arg2.length && (local62 = method184(arg2[local25], local37, anInt210, local35)) > 0) {
								local23 += local62;
								local25++;
							} else {
								if (local25 == 0) {
									break label58;
								}
								@Pc(83) int local83;
								if ((local83 = method184(arg2[local25 - 1], local37, anInt210, local35)) > 0) {
									local23 += local83;
									if (local25 == 1) {
										local27++;
									}
								} else {
									if (local25 >= arg2.length || !method190(local35)) {
										break label58;
									}
									local23++;
								}
							}
						}
					}
					if (local25 >= arg2.length) {
						@Pc(114) boolean local114 = false;
						@Pc(120) int local120 = method176(arg3, local19, arg1);
						@Pc(128) int local128 = method177(local23 - 1, arg1, arg0);
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
			signlink.reporterror("1512, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + local163.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HBDSGKGH", name = "a", descriptor = "([CBI[C)I")
	private static int method176(@OriginalArg(0) char[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg1 == 0) {
				return 2;
			}
			for (@Pc(9) int local9 = arg1 - 1; local9 >= 0 && method190(arg2[local9]); local9--) {
				if (arg2[local9] == '@') {
					return 3;
				}
			}
			@Pc(29) int local29 = 0;
			for (@Pc(33) int local33 = arg1 - 1; local33 >= 0 && method190(arg0[local33]); local33--) {
				if (arg0[local33] == '*') {
					local29++;
				}
			}
			if (local29 >= 3) {
				return 4;
			} else if (method190(arg2[arg1 - 1])) {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("9936, " + arg0 + ", " + 9 + ", " + arg1 + ", " + arg2 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HBDSGKGH", name = "a", descriptor = "(I[C[CI)I")
	private static int method177(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2) {
		try {
			if (arg0 + 1 == arg1.length) {
				return 2;
			}
			@Pc(13) int local13 = arg0 + 1;
			while (true) {
				if (local13 < arg1.length && method190(arg1[local13])) {
					if (arg1[local13] != '.' && arg1[local13] != ',') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(40) int local40 = 0;
				for (@Pc(44) int local44 = arg0 + 1; local44 < arg1.length && method190(arg2[local44]); local44++) {
					if (arg2[local44] == '*') {
						local40++;
					}
				}
				if (local40 >= 3) {
					return 4;
				}
				if (method190(arg1[arg0 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("27266, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 947 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HBDSGKGH", name = "a", descriptor = "([CI)V")
	private static void method178(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(18) char[] local18 = new char[] { 'd', 'o', 't' };
			method182(local18, null, local3);
			@Pc(27) char[] local27 = (char[]) arg0.clone();
			@Pc(50) char[] local50 = new char[] { 's', 'l', 'a', 's', 'h' };
			method182(local50, null, local27);
			for (@Pc(64) int local64 = 0; local64 < aCharArrayArray3.length; local64++) {
				method179(aCharArrayArray3[local64], local27, anIntArray42[local64], arg0, local3);
			}
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("64784, " + arg0 + ", " + 1 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HBDSGKGH", name = "a", descriptor = "([C[CBI[C[C)V")
	private static void method179(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) char[] arg3, @OriginalArg(5) char[] arg4) {
		try {
			if (arg0.length <= arg3.length) {
				@Pc(19) int local19;
				for (@Pc(11) int local11 = 0; local11 <= arg3.length - arg0.length; local11 += local19) {
					@Pc(15) int local15 = local11;
					@Pc(17) int local17 = 0;
					local19 = 1;
					label121: while (true) {
						while (true) {
							if (local15 >= arg3.length) {
								break label121;
							}
							@Pc(27) char local27 = arg3[local15];
							@Pc(29) char local29 = 0;
							if (local15 + 1 < arg3.length) {
								local29 = arg3[local15 + 1];
							}
							@Pc(54) int local54;
							if (local17 < arg0.length && (local54 = method184(arg0[local17], local29, anInt210, local27)) > 0) {
								local15 += local54;
								local17++;
							} else {
								if (local17 == 0) {
									break label121;
								}
								@Pc(75) int local75;
								if ((local75 = method184(arg0[local17 - 1], local29, anInt210, local27)) > 0) {
									local15 += local75;
									if (local17 == 1) {
										local19++;
									}
								} else {
									if (local17 >= arg0.length || !method190(local27)) {
										break label121;
									}
									local15++;
								}
							}
						}
					}
					if (local17 >= arg0.length) {
						@Pc(106) boolean local106 = false;
						@Pc(112) int local112 = method180(local11, arg3, arg4);
						@Pc(120) int local120 = method181(arg1, arg3, local15 - 1);
						if (arg2 == 1 && local112 > 0 && local120 > 0) {
							local106 = true;
						}
						if (arg2 == 2 && (local112 > 2 && local120 > 0 || local112 > 0 && local120 > 2)) {
							local106 = true;
						}
						if (arg2 == 3 && local112 > 0 && local120 > 2) {
							local106 = true;
						}
						@Pc(163) boolean local163;
						if (arg2 == 3 && local112 > 2 && local120 > 0) {
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
										if (method190(arg3[local186])) {
											break;
										}
										local170 = local186;
									} else if (!method190(arg3[local186])) {
										local182 = true;
										local170 = local186;
									}
								}
							}
							if (local120 > 2) {
								if (local120 == 4) {
									local182 = false;
									for (local186 = local174 + 1; local186 < arg3.length; local186++) {
										if (local182) {
											if (arg1[local186] != '*') {
												break;
											}
											local174 = local186;
										} else if (arg1[local186] == '*') {
											local174 = local186;
											local182 = true;
										}
									}
								}
								local182 = false;
								for (local186 = local174 + 1; local186 < arg3.length; local186++) {
									if (local182) {
										if (method190(arg3[local186])) {
											break;
										}
										local174 = local186;
									} else if (!method190(arg3[local186])) {
										local182 = true;
										local174 = local186;
									}
								}
							}
							for (@Pc(320) int local320 = local170; local320 <= local174; local320++) {
								arg3[local320] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(346) RuntimeException local346) {
			signlink.reporterror("73391, " + arg0 + ", " + arg1 + ", " + 64 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local346.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HBDSGKGH", name = "a", descriptor = "(IB[C[C)I")
	private static int method180(@OriginalArg(0) int arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg0 == 0) {
				return 2;
			}
			@Pc(9) int local9 = arg0 - 1;
			while (true) {
				if (local9 >= 0 && method190(arg1[local9])) {
					if (arg1[local9] != ',' && arg1[local9] != '.') {
						local9--;
						continue;
					}
					return 3;
				}
				@Pc(34) int local34 = 0;
				for (@Pc(38) int local38 = arg0 - 1; local38 >= 0 && method190(arg2[local38]); local38--) {
					if (arg2[local38] == '*') {
						local34++;
					}
				}
				if (local34 >= 3) {
					return 4;
				}
				if (method190(arg1[arg0 - 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("18869, " + arg0 + ", " + -75 + ", " + arg1 + ", " + arg2 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HBDSGKGH", name = "a", descriptor = "([CB[CI)I")
	private static int method181(@OriginalArg(0) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 + 1 == arg1.length) {
				return 2;
			}
			@Pc(13) int local13 = arg2 + 1;
			while (true) {
				if (local13 < arg1.length && method190(arg1[local13])) {
					if (arg1[local13] != '\\' && arg1[local13] != '/') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(50) int local50 = 0;
				for (@Pc(54) int local54 = arg2 + 1; local54 < arg1.length && method190(arg0[local54]); local54++) {
					if (arg0[local54] == '*') {
						local50++;
					}
				}
				if (local50 >= 5) {
					return 4;
				}
				if (method190(arg1[arg2 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("32483, " + arg0 + ", " + 83 + ", " + arg1 + ", " + arg2 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HBDSGKGH", name = "a", descriptor = "([C[[B[CI)V")
	private static void method182(@OriginalArg(0) char[] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) char[] arg2) {
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
							if (local17 < arg0.length && (local62 = method185(arg0[local17], var12, var13)) > 0) {
								if (local62 == 1 && method193(var12)) {
									local25 = true;
								}
								if (local62 == 2 && (method193(var12) || method193(var13))) {
									local25 = true;
								}
								local15 += local62;
								local17++;
							} else {
								if (local17 == 0) {
									break label165;
								}
								@Pc(105) int local105;
								if ((local105 = method185(arg0[local17 - 1], var12, var13)) > 0) {
									local15 += local105;
									if (local17 == 1) {
										local21++;
									}
								} else {
									if (local17 >= arg0.length || !method191(var12)) {
										break label165;
									}
									if (method190(var12) && var12 != '\'') {
										local23 = true;
									}
									if (method193(var12)) {
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
							if (local11 - 1 < 0 || method190(arg2[local11 - 1]) && arg2[local11 - 1] != '\'') {
								local216 = true;
							}
							if (local15 >= arg2.length || method190(arg2[local15]) && arg2[local15] != '\'') {
								local218 = true;
							}
							if (!local216 || !local218) {
								@Pc(262) boolean local262 = false;
								local266 = local11 - 2;
								if (local216) {
									local266 = local11;
								}
								while (!local262 && local266 < local15) {
									if (local266 >= 0 && (!method190(arg2[local266]) || arg2[local266] == '\'')) {
										@Pc(288) char[] local288 = new char[3];
										@Pc(290) int local290;
										for (local290 = 0; local290 < 3 && local266 + local290 < arg2.length && (!method190(arg2[local266 + local290]) || arg2[local266 + local290] == '\''); local290++) {
											local288[local290] = arg2[local266 + local290];
										}
										@Pc(328) boolean local328 = true;
										if (local290 == 0) {
											local328 = false;
										}
										if (local290 < 3 && local266 - 1 >= 0 && (!method190(arg2[local266 - 1]) || arg2[local266 - 1] == '\'')) {
											local328 = false;
										}
										if (local328 && !method196(local288)) {
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
							@Pc(198) byte local198 = method186(var12);
							@Pc(202) byte local202 = method186(var13);
							if (arg1 != null && method183(local202, (byte) 7, arg1, local198)) {
								local170 = false;
							}
						}
						if (local170) {
							@Pc(378) int local378 = 0;
							@Pc(380) int local380 = 0;
							@Pc(382) int local382 = -1;
							for (local266 = local11; local266 < local15; local266++) {
								if (method193(arg2[local266])) {
									local378++;
								} else if (method192(arg2[local266])) {
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
		} catch (@Pc(460) RuntimeException local460) {
			signlink.reporterror("10678, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -42 + ", " + local460.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HBDSGKGH", name = "a", descriptor = "(BB[[BB)Z")
	private static boolean method183(@OriginalArg(0) byte arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) byte arg3) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(14) int local14 = 0;
			if (arg2[0][0] == arg3 && arg2[0][1] == arg0) {
				return true;
			}
			@Pc(35) int local35 = arg2.length - 1;
			if (arg2[local35][0] == arg3 && arg2[local35][1] == arg0) {
				return true;
			}
			do {
				@Pc(57) int local57 = (local14 + local35) / 2;
				if (arg2[local57][0] == arg3 && arg2[local57][1] == arg0) {
					return true;
				}
				if (arg3 < arg2[local57][0] || arg3 == arg2[local57][0] && arg0 < arg2[local57][1]) {
					local35 = local57;
				} else {
					local14 = local57;
				}
			} while (local14 != local35 && local14 + 1 != local35);
			return false;
		} catch (@Pc(111) RuntimeException local111) {
			signlink.reporterror("47235, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local111.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HBDSGKGH", name = "a", descriptor = "(CCIC)I")
	private static int method184(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(2) int arg2, @OriginalArg(3) char arg3) {
		try {
			if (arg2 != 0) {
				return anInt211;
			} else if (arg0 == arg3) {
				return 1;
			} else if (arg0 == 'o' && arg3 == '0') {
				return 1;
			} else if (arg0 == 'o' && arg3 == '(' && arg1 == ')') {
				return 2;
			} else if (arg0 == 'c' && (arg3 == '(' || arg3 == '<' || arg3 == '[')) {
				return 1;
			} else if (arg0 == 'e' && arg3 == '€') {
				return 1;
			} else if (arg0 == 's' && arg3 == '$') {
				return 1;
			} else if (arg0 == 'l' && arg3 == 'i') {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("46416, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HBDSGKGH", name = "b", descriptor = "(CCIC)I")
	private static int method185(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(3) char arg2) {
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
						if ((arg1 != '1' || arg2 != '3') && (arg1 != 'i' || arg2 != '3')) {
							return 0;
						}
						return 2;
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
					if ((arg1 != '[' || arg2 != ')') && (arg1 != 'i' || arg2 != ')')) {
						return 0;
					}
					return 2;
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
					if (arg1 != '9' && arg1 != '6' && arg1 != 'q') {
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
		} catch (@Pc(512) RuntimeException local512) {
			signlink.reporterror("55446, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local512.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HBDSGKGH", name = "b", descriptor = "(ZC)B")
	private static byte method186(@OriginalArg(1) char arg0) {
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
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("67089, " + false + ", " + arg0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HBDSGKGH", name = "a", descriptor = "([CB)V")
	private static void method187(@OriginalArg(0) char[] arg0, @OriginalArg(1) byte arg1) {
		try {
			if (arg1 != 52) {
				anInt212 = 115;
			}
			@Pc(10) int local10 = 0;
			@Pc(12) int local12 = 0;
			@Pc(14) int local14 = 0;
			while (true) {
				do {
					@Pc(113) int local113;
					if ((local113 = method188(arg0, local10)) == -1) {
						return;
					}
					@Pc(18) boolean local18 = false;
					for (@Pc(20) int local20 = local10; local20 >= 0 && local20 < local113 && !local18; local20++) {
						if (!method190(arg0[local20]) && !method191(arg0[local20])) {
							local18 = true;
						}
					}
					if (local18) {
						local12 = 0;
					}
					if (local12 == 0) {
						local14 = local113;
					}
					local10 = method189(arg0, local113);
					@Pc(59) int local59 = 0;
					for (@Pc(61) int local61 = local113; local61 < local10; local61++) {
						local59 = local59 * 10 + arg0[local61] - 48;
					}
					if (local59 <= 255 && local10 - local113 <= 8) {
						local12++;
					} else {
						local12 = 0;
					}
				} while (local12 != 4);
				for (@Pc(95) int local95 = local14; local95 < local10; local95++) {
					arg0[local95] = '*';
				}
				local12 = 0;
			}
		} catch (@Pc(117) RuntimeException local117) {
			signlink.reporterror("828, " + arg0 + ", " + arg1 + ", " + local117.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HBDSGKGH", name = "a", descriptor = "(I[CI)I")
	private static int method188(@OriginalArg(1) char[] arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(1) int local1 = arg1; local1 < arg0.length && local1 >= 0; local1++) {
				if (arg0[local1] >= '0' && arg0[local1] <= '9') {
					return local1;
				}
			}
			return -1;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("88048, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HBDSGKGH", name = "a", descriptor = "([CIB)I")
	private static int method189(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(9) int local9 = arg1;
			while (true) {
				if (local9 < arg0.length && local9 >= 0) {
					if (arg0[local9] >= '0' && arg0[local9] <= '9') {
						local9++;
						continue;
					}
					return local9;
				}
				return arg0.length;
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("94743, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HBDSGKGH", name = "c", descriptor = "(ZC)Z")
	private static boolean method190(@OriginalArg(1) char arg0) {
		try {
			return !method192(arg0) && !method193(arg0);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("58116, " + false + ", " + arg0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HBDSGKGH", name = "a", descriptor = "(CZ)Z")
	private static boolean method191(@OriginalArg(0) char arg0) {
		try {
			if (arg0 >= 'a' && arg0 <= 'z') {
				return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
			} else {
				return true;
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("52408, " + arg0 + ", " + false + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HBDSGKGH", name = "a", descriptor = "(BC)Z")
	private static boolean method192(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("52418, " + 5 + ", " + arg0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HBDSGKGH", name = "b", descriptor = "(CZ)Z")
	private static boolean method193(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= '0' && arg0 <= '9';
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("77527, " + arg0 + ", " + true + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HBDSGKGH", name = "a", descriptor = "(CI)Z")
	private static boolean method194(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z';
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("11908, " + arg0 + ", " + -223 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HBDSGKGH", name = "a", descriptor = "(IC)Z")
	private static boolean method195(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("30555, " + -23995 + ", " + arg0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HBDSGKGH", name = "c", descriptor = "(I[C)Z")
	private static boolean method196(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				if (!method193(arg0[local5]) && arg0[local5] != '\u0000') {
					local3 = false;
				}
			}
			if (local3) {
				return true;
			}
			@Pc(32) int local32 = method197(arg0);
			@Pc(34) int local34 = 0;
			@Pc(39) int local39 = anIntArray41.length - 1;
			if (local32 == anIntArray41[0] || local32 == anIntArray41[local39]) {
				return true;
			}
			do {
				@Pc(61) int local61 = (local34 + local39) / 2;
				if (local32 == anIntArray41[local61]) {
					return true;
				}
				if (local32 < anIntArray41[local61]) {
					local39 = local61;
				} else {
					local34 = local61;
				}
			} while (local34 != local39 && local34 + 1 != local39);
			return false;
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("21200, " + -514 + ", " + arg0 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HBDSGKGH", name = "b", descriptor = "([CI)I")
	private static int method197(@OriginalArg(0) char[] arg0) {
		try {
			if (arg0.length > 6) {
				return 0;
			}
			@Pc(9) int local9 = 0;
			for (@Pc(21) int local21 = 0; local21 < arg0.length; local21++) {
				@Pc(32) char local32 = arg0[arg0.length - local21 - 1];
				if (local32 >= 'a' && local32 <= 'z') {
					local9 = local9 * 38 + local32 + 1 - 'a';
				} else if (local32 == '\'') {
					local9 = local9 * 38 + 27;
				} else if (local32 >= '0' && local32 <= '9') {
					local9 = local9 * 38 + local32 + 28 - '0';
				} else if (local32 != '\u0000') {
					return 0;
				}
			}
			return local9;
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("24630, " + arg0 + ", " + 11984 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}
}
