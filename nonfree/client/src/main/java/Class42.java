import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!sc")
public final class Class42 {

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
	private static int anInt922;

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
	private static int anInt923;

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "Z")
	private static boolean aBoolean233;

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
	private static int anInt926;

	@OriginalMember(owner = "client!sc", name = "l", descriptor = "[I")
	private static int[] anIntArray253;

	@OriginalMember(owner = "client!sc", name = "m", descriptor = "[[C")
	private static char[][] aCharArrayArray1;

	@OriginalMember(owner = "client!sc", name = "n", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!sc", name = "o", descriptor = "[[C")
	private static char[][] aCharArrayArray2;

	@OriginalMember(owner = "client!sc", name = "p", descriptor = "[[C")
	private static char[][] aCharArrayArray3;

	@OriginalMember(owner = "client!sc", name = "q", descriptor = "[I")
	private static int[] anIntArray254;

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "Z")
	private static boolean aBoolean234 = true;

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
	private static int anInt924 = 2;

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
	private static int anInt925 = 2;

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "B")
	private static byte aByte52 = 7;

	@OriginalMember(owner = "client!sc", name = "i", descriptor = "B")
	private static byte aByte53 = 121;

	@OriginalMember(owner = "client!sc", name = "j", descriptor = "B")
	private static byte aByte54 = 16;

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "Z")
	private static boolean aBoolean235 = true;

	@OriginalMember(owner = "client!sc", name = "r", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray13 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!xb;)V")
	public static void method590(@OriginalArg(0) Class47 arg0) {
		@Pc(10) Class1_Sub1_Sub3 local10 = new Class1_Sub1_Sub3(arg0.method662("fragmentsenc.txt", null), 15787);
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(arg0.method662("badenc.txt", null), 15787);
		@Pc(28) Class1_Sub1_Sub3 local28 = new Class1_Sub1_Sub3(arg0.method662("domainenc.txt", null), 15787);
		@Pc(37) Class1_Sub1_Sub3 local37 = new Class1_Sub1_Sub3(arg0.method662("tldlist.txt", null), 15787);
		method591(local10, local19, local28, local37);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!lb;Lclient!lb;Lclient!lb;Lclient!lb;)V")
	private static void method591(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) Class1_Sub1_Sub3 arg2, @OriginalArg(3) Class1_Sub1_Sub3 arg3) {
		method593(arg1);
		method594(arg2);
		method595(arg0);
		method592(anInt924, arg3);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!lb;)V")
	private static void method592(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			if (arg0 < anInt925 || arg0 > anInt925) {
				aBoolean234 = !aBoolean234;
			}
			@Pc(16) int local16 = arg1.method481();
			aCharArrayArray3 = new char[local16][];
			anIntArray254 = new int[local16];
			for (@Pc(24) int local24 = 0; local24 < local16; local24++) {
				anIntArray254[local24] = arg1.method476();
				@Pc(35) char[] local35 = new char[arg1.method476()];
				for (@Pc(37) int local37 = 0; local37 < local35.length; local37++) {
					local35[local37] = (char) arg1.method476();
				}
				aCharArrayArray3[local24] = local35;
			}
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("16414, " + arg0 + ", " + arg1 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!lb;I)V")
	private static void method593(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(2) int local2 = arg0.method481();
			aCharArrayArray1 = new char[local2][];
			aByteArrayArrayArray8 = new byte[local2][][];
			method596(aCharArrayArray1, aByteArrayArrayArray8, arg0);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("10589, " + arg0 + ", " + 5 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZLclient!lb;)V")
	private static void method594(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(2) int local2 = arg0.method481();
			aCharArrayArray2 = new char[local2][];
			method597(arg0, 961, aCharArrayArray2);
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("39796, " + true + ", " + arg0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!lb;B)V")
	private static void method595(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			anIntArray253 = new int[arg0.method481()];
			for (@Pc(7) int local7 = 0; local7 < anIntArray253.length; local7++) {
				anIntArray253[local7] = arg0.method478();
			}
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("97017, " + arg0 + ", " + -47 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([[C[[[BLclient!lb;I)V")
	private static void method596(@OriginalArg(0) char[][] arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) Class1_Sub1_Sub3 arg2) {
		try {
			for (@Pc(15) int local15 = 0; local15 < arg0.length; local15++) {
				@Pc(21) char[] local21 = new char[arg2.method476()];
				for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
					local21[local23] = (char) arg2.method476();
				}
				arg0[local15] = local21;
				@Pc(45) byte[][] local45 = new byte[arg2.method476()][2];
				for (@Pc(47) int local47 = 0; local47 < local45.length; local47++) {
					local45[local47][0] = (byte) arg2.method476();
					local45[local47][1] = (byte) arg2.method476();
				}
				if (local45.length > 0) {
					arg1[local15] = local45;
				}
			}
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("50706, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 4 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!lb;I[[C)V")
	private static void method597(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) char[][] arg2) {
		try {
			@Pc(5) boolean local5 = false;
			for (@Pc(7) int local7 = 0; local7 < arg2.length; local7++) {
				@Pc(13) char[] local13 = new char[arg0.method476()];
				for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
					local13[local15] = (char) arg0.method476();
				}
				arg2[local7] = local13;
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("12171, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CI)V")
	private static void method598(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) int local3 = 0;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				if (method599(arg0[local5], 898)) {
					arg0[local3] = arg0[local5];
				} else {
					arg0[local3] = ' ';
				}
				if (local3 == 0 || arg0[local3] != ' ' || arg0[local3 - 1] != ' ') {
					local3++;
				}
			}
			@Pc(49) boolean local49 = false;
			for (@Pc(51) int local51 = local3; local51 < arg0.length; local51++) {
				arg0[local51] = ' ';
			}
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("15486, " + arg0 + ", " + arg1 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(CI)Z")
	private static boolean method599(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			return arg0 >= ' ' && arg0 <= '\u007f' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("93407, " + arg0 + ", " + arg1 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method600(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) long local3 = System.currentTimeMillis();
			@Pc(6) char[] local6 = arg0.toCharArray();
			method598(local6, 448);
			@Pc(15) String local15 = (new String(local6)).trim();
			@Pc(19) char[] local19 = local15.toLowerCase().toCharArray();
			@Pc(22) String local22 = local15.toLowerCase();
			method608(local19);
			method603(local19);
			if (arg1 != 0) {
				throw new NullPointerException();
			}
			method604(anInt926, local19);
			method617(local19);
			for (@Pc(42) int local42 = 0; local42 < aStringArray13.length; local42++) {
				@Pc(52) int local52 = -1;
				while ((local52 = local22.indexOf(aStringArray13[local42], local52 + 1)) != -1) {
					@Pc(59) char[] local59 = aStringArray13[local42].toCharArray();
					for (@Pc(61) int local61 = 0; local61 < local59.length; local61++) {
						local19[local61 + local52] = local59[local61];
					}
				}
			}
			method601(local15.toCharArray(), local19);
			method602(local19);
			@Pc(103) long local103 = System.currentTimeMillis();
			return (new String(local19)).trim();
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("926, " + arg0 + ", " + arg1 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([C[CZ)V")
	private static void method601(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1) {
		try {
			for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
				if (arg1[local1] != '*' && method625(arg0[local1])) {
					arg1[local1] = arg0[local1];
				}
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("96470, " + arg0 + ", " + arg1 + ", " + true + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CB)V")
	private static void method602(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(8) boolean local8 = true;
			for (@Pc(10) int local10 = 0; local10 < arg0.length; local10++) {
				@Pc(16) char local16 = arg0[local10];
				if (!method622(local16)) {
					local8 = true;
				} else if (local8) {
					if (method624(local16)) {
						local8 = false;
					}
				} else if (method625(local16)) {
					arg0[local10] = (char) (local16 + 'a' - 65);
				}
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("60830, " + arg0 + ", " + -47 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(B[C)V")
	private static void method603(@OriginalArg(1) char[] arg0) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 2; local3++) {
				for (@Pc(10) int local10 = aCharArrayArray1.length - 1; local10 >= 0; local10--) {
					method612(arg0, aCharArrayArray1[local10], aByteArrayArrayArray8[local10]);
				}
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("661, " + 1 + ", " + arg0 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[C)V")
	private static void method604(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1) {
		try {
			@Pc(3) char[] local3 = (char[]) arg1.clone();
			if (arg0 == 0) {
				@Pc(21) char[] local21 = new char[] { '(', 'a', ')' };
				method612(local3, local21, null);
				@Pc(30) char[] local30 = (char[]) arg1.clone();
				@Pc(45) char[] local45 = new char[] { 'd', 'o', 't' };
				method612(local30, local45, null);
				for (@Pc(55) int local55 = aCharArrayArray2.length - 1; local55 >= 0; local55--) {
					method605(local3, arg1, local30, (byte) 3, aCharArrayArray2[local55]);
				}
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("89247, " + arg0 + ", " + arg1 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([C[C[CB[C)V")
	private static void method605(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) char[] arg4) {
		try {
			if (arg4.length <= arg1.length) {
				@Pc(14) boolean local14 = false;
				@Pc(27) int local27;
				for (@Pc(19) int local19 = 0; local19 <= arg1.length - arg4.length; local19 += local27) {
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
							if (local25 < arg4.length && (local62 = method614(local37, local35, arg4[local25])) > 0) {
								local23 += local62;
								local25++;
							} else {
								if (local25 == 0) {
									break label58;
								}
								@Pc(83) int local83;
								if ((local83 = method614(local37, local35, arg4[local25 - 1])) > 0) {
									local23 += local83;
									if (local25 == 1) {
										local27++;
									}
								} else {
									if (local25 >= arg4.length || !method620(local35)) {
										break label58;
									}
									local23++;
								}
							}
						}
					}
					if (local25 >= arg4.length) {
						@Pc(114) boolean local114 = false;
						@Pc(120) int local120 = method606(arg0, local19, arg1);
						@Pc(128) int local128 = method607(arg1, arg2, local23 - 1);
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
			signlink.reporterror("13466, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local163.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[CI[C)I")
	private static int method606(@OriginalArg(1) char[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg1 == 0) {
				return 2;
			}
			for (@Pc(9) int local9 = arg1 - 1; local9 >= 0 && method620(arg2[local9]); local9--) {
				if (arg2[local9] == '@') {
					return 3;
				}
			}
			@Pc(29) int local29 = 0;
			for (@Pc(41) int local41 = arg1 - 1; local41 >= 0 && method620(arg0[local41]); local41--) {
				if (arg0[local41] == '*') {
					local29++;
				}
			}
			if (local29 >= 3) {
				return 4;
			} else if (method620(arg2[arg1 - 1])) {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("36104, " + 4 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([C[CII)I")
	private static int method607(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 + 1 == arg0.length) {
				return 2;
			}
			@Pc(17) int local17 = arg2 + 1;
			while (true) {
				if (local17 < arg0.length && method620(arg0[local17])) {
					if (arg0[local17] != '.' && arg0[local17] != ',') {
						local17++;
						continue;
					}
					return 3;
				}
				@Pc(44) int local44 = 0;
				for (@Pc(48) int local48 = arg2 + 1; local48 < arg0.length && method620(arg1[local48]); local48++) {
					if (arg1[local48] == '*') {
						local44++;
					}
				}
				if (local44 >= 3) {
					return 4;
				}
				if (method620(arg0[arg2 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("83310, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "([CI)V")
	private static void method608(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(5) char[] local5 = (char[]) arg0.clone();
			@Pc(33) char[] local33 = new char[] { 'd', 'o', 't' };
			method612(local5, local33, null);
			@Pc(42) char[] local42 = (char[]) arg0.clone();
			@Pc(65) char[] local65 = new char[] { 's', 'l', 'a', 's', 'h' };
			method612(local42, local65, null);
			for (@Pc(72) int local72 = 0; local72 < aCharArrayArray3.length; local72++) {
				method609(anIntArray254[local72], 947, arg0, aCharArrayArray3[local72], local42, local5);
			}
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("75731, " + arg0 + ", " + 5 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(II[C[C[C[C)V")
	private static void method609(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) char[] arg3, @OriginalArg(4) char[] arg4, @OriginalArg(5) char[] arg5) {
		try {
			if (arg3.length <= arg2.length) {
				@Pc(19) int local19;
				for (@Pc(11) int local11 = 0; local11 <= arg2.length - arg3.length; local11 += local19) {
					@Pc(15) int local15 = local11;
					@Pc(17) int local17 = 0;
					local19 = 1;
					label121: while (true) {
						while (true) {
							if (local15 >= arg2.length) {
								break label121;
							}
							@Pc(27) char local27 = arg2[local15];
							@Pc(29) char local29 = 0;
							if (local15 + 1 < arg2.length) {
								local29 = arg2[local15 + 1];
							}
							@Pc(54) int local54;
							if (local17 < arg3.length && (local54 = method614(local29, local27, arg3[local17])) > 0) {
								local15 += local54;
								local17++;
							} else {
								if (local17 == 0) {
									break label121;
								}
								@Pc(75) int local75;
								if ((local75 = method614(local29, local27, arg3[local17 - 1])) > 0) {
									local15 += local75;
									if (local17 == 1) {
										local19++;
									}
								} else {
									if (local17 >= arg3.length || !method620(local27)) {
										break label121;
									}
									local15++;
								}
							}
						}
					}
					if (local17 >= arg3.length) {
						@Pc(106) boolean local106 = false;
						@Pc(112) int local112 = method610(local11, arg2, arg5);
						@Pc(120) int local120 = method611(arg4, arg2, local15 - 1);
						if (arg0 == 1 && local112 > 0 && local120 > 0) {
							local106 = true;
						}
						if (arg0 == 2 && (local112 > 2 && local120 > 0 || local112 > 0 && local120 > 2)) {
							local106 = true;
						}
						if (arg0 == 3 && local112 > 0 && local120 > 2) {
							local106 = true;
						}
						@Pc(163) boolean local163;
						if (arg0 == 3 && local112 > 2 && local120 > 0) {
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
											if (arg5[local186] != '*') {
												break;
											}
											local170 = local186;
										} else if (arg5[local186] == '*') {
											local170 = local186;
											local182 = true;
										}
									}
								}
								local182 = false;
								for (local186 = local170 - 1; local186 >= 0; local186--) {
									if (local182) {
										if (method620(arg2[local186])) {
											break;
										}
										local170 = local186;
									} else if (!method620(arg2[local186])) {
										local182 = true;
										local170 = local186;
									}
								}
							}
							if (local120 > 2) {
								if (local120 == 4) {
									local182 = false;
									for (local186 = local174 + 1; local186 < arg2.length; local186++) {
										if (local182) {
											if (arg4[local186] != '*') {
												break;
											}
											local174 = local186;
										} else if (arg4[local186] == '*') {
											local174 = local186;
											local182 = true;
										}
									}
								}
								local182 = false;
								for (local186 = local174 + 1; local186 < arg2.length; local186++) {
									if (local182) {
										if (method620(arg2[local186])) {
											break;
										}
										local174 = local186;
									} else if (!method620(arg2[local186])) {
										local182 = true;
										local174 = local186;
									}
								}
							}
							for (@Pc(320) int local320 = local170; local320 <= local174; local320++) {
								arg2[local320] = '*';
							}
						}
					}
				}
				@Pc(345) boolean local345 = false;
			}
		} catch (@Pc(347) RuntimeException local347) {
			signlink.reporterror("11090, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local347.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[CZ[C)I")
	private static int method610(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg0 == 0) {
				return 2;
			}
			@Pc(9) int local9 = arg0 - 1;
			while (true) {
				if (local9 >= 0 && method620(arg1[local9])) {
					if (arg1[local9] != ',' && arg1[local9] != '.') {
						local9--;
						continue;
					}
					return 3;
				}
				@Pc(34) int local34 = 0;
				for (@Pc(38) int local38 = arg0 - 1; local38 >= 0 && method620(arg2[local38]); local38--) {
					if (arg2[local38] == '*') {
						local34++;
					}
				}
				if (local34 >= 3) {
					return 4;
				}
				if (method620(arg1[arg0 - 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("59837, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + local78.toString());
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
				if (local13 < arg1.length && method620(arg1[local13])) {
					if (arg1[local13] != '\\' && arg1[local13] != '/') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(40) int local40 = 0;
				for (@Pc(44) int local44 = arg2 + 1; local44 < arg1.length && method620(arg0[local44]); local44++) {
					if (arg0[local44] == '*') {
						local40++;
					}
				}
				if (local40 >= 5) {
					return 4;
				}
				if (method620(arg1[arg2 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("32535, " + arg0 + ", " + arg1 + ", " + -34 + ", " + arg2 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([C[C[[BI)V")
	private static void method612(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) byte[][] arg2) {
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
					label164: while (true) {
						while (true) {
							if (local15 >= arg0.length || local25 && local27) {
								break label164;
							}
							var12 = arg0[local15];
							var13 = '\u0000';
							if (local15 + 1 < arg0.length) {
								var13 = arg0[local15 + 1];
							}
							@Pc(62) int local62;
							if (local17 < arg1.length && (local62 = method615((byte) 9, var12, var13, arg1[local17])) > 0) {
								if (local62 == 1 && method623(var12)) {
									local25 = true;
								}
								if (local62 == 2 && (method623(var12) || method623(var13))) {
									local25 = true;
								}
								local15 += local62;
								local17++;
							} else {
								if (local17 == 0) {
									break label164;
								}
								@Pc(105) int local105;
								if ((local105 = method615((byte) 9, var12, var13, arg1[local17 - 1])) > 0) {
									local15 += local105;
									if (local17 == 1) {
										local21++;
									}
								} else {
									if (local17 >= arg1.length || !method621(var12)) {
										break label164;
									}
									if (method620(var12) && var12 != '\'') {
										local23 = true;
									}
									if (method623(var12)) {
										local27 = true;
									}
									local15++;
									local19++;
									if (local19 * 100 / (local15 - local11) > 90) {
										break label164;
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
							if (local11 - 1 < 0 || method620(arg0[local11 - 1]) && arg0[local11 - 1] != '\'') {
								local216 = true;
							}
							if (local15 >= arg0.length || method620(arg0[local15]) && arg0[local15] != '\'') {
								local218 = true;
							}
							if (!local216 || !local218) {
								@Pc(262) boolean local262 = false;
								local266 = local11 - 2;
								if (local216) {
									local266 = local11;
								}
								while (!local262 && local266 < local15) {
									if (local266 >= 0 && (!method620(arg0[local266]) || arg0[local266] == '\'')) {
										@Pc(288) char[] local288 = new char[3];
										@Pc(290) int local290;
										for (local290 = 0; local290 < 3 && local266 + local290 < arg0.length && (!method620(arg0[local266 + local290]) || arg0[local266 + local290] == '\''); local290++) {
											local288[local290] = arg0[local266 + local290];
										}
										@Pc(328) boolean local328 = true;
										if (local290 == 0) {
											local328 = false;
										}
										if (local290 < 3 && local266 - 1 >= 0 && (!method620(arg0[local266 - 1]) || arg0[local266 - 1] == '\'')) {
											local328 = false;
										}
										if (local328 && !method626(local288)) {
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
							@Pc(198) byte local198 = method616(var12);
							@Pc(202) byte local202 = method616(var13);
							if (arg2 != null && method613(local202, aByte52, local198, arg2)) {
								local170 = false;
							}
						}
						if (local170) {
							@Pc(378) int local378 = 0;
							@Pc(380) int local380 = 0;
							@Pc(382) int local382 = -1;
							for (local266 = local11; local266 < local15; local266++) {
								if (method623(arg0[local266])) {
									local378++;
								} else if (method622(arg0[local266])) {
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
		} catch (@Pc(463) RuntimeException local463) {
			signlink.reporterror("88077, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 4 + ", " + local463.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BBB[[B)Z")
	private static boolean method613(@OriginalArg(0) byte arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) byte[][] arg3) {
		try {
			if (arg1 != 7) {
				throw new NullPointerException();
			}
			@Pc(8) int local8 = 0;
			if (arg3[0][0] == arg2 && arg3[0][1] == arg0) {
				return true;
			}
			@Pc(29) int local29 = arg3.length - 1;
			if (arg3[local29][0] == arg2 && arg3[local29][1] == arg0) {
				return true;
			}
			do {
				@Pc(51) int local51 = (local8 + local29) / 2;
				if (arg3[local51][0] == arg2 && arg3[local51][1] == arg0) {
					return true;
				}
				if (arg2 < arg3[local51][0] || arg2 == arg3[local51][0] && arg0 < arg3[local51][1]) {
					local29 = local51;
				} else {
					local8 = local51;
				}
			} while (local8 != local29 && local8 + 1 != local29);
			return false;
		} catch (@Pc(105) RuntimeException local105) {
			signlink.reporterror("46590, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local105.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(CCBC)I")
	private static int method614(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(3) char arg2) {
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
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("34450, " + arg0 + ", " + arg1 + ", " + -31 + ", " + arg2 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BCCC)I")
	private static int method615(@OriginalArg(0) byte arg0, @OriginalArg(1) char arg1, @OriginalArg(2) char arg2, @OriginalArg(3) char arg3) {
		try {
			@Pc(4) boolean local4 = false;
			if (arg3 == arg1) {
				return 1;
			}
			if (arg3 >= 'a' && arg3 <= 'm') {
				if (arg3 == 'a') {
					if (arg1 != '4' && arg1 != '@' && arg1 != '^') {
						if (arg1 == '/' && arg2 == '\\') {
							return 2;
						}
						return 0;
					}
					return 1;
				}
				if (arg3 == 'b') {
					if (arg1 != '6' && arg1 != '8') {
						if ((arg1 != '1' || arg2 != '3') && (arg1 != 'i' || arg2 != '3')) {
							return 0;
						}
						return 2;
					}
					return 1;
				}
				if (arg3 == 'c') {
					if (arg1 != '(' && arg1 != '<' && arg1 != '{' && arg1 != '[') {
						return 0;
					}
					return 1;
				}
				if (arg3 == 'd') {
					if ((arg1 != '[' || arg2 != ')') && (arg1 != 'i' || arg2 != ')')) {
						return 0;
					}
					return 2;
				}
				if (arg3 == 'e') {
					if (arg1 != '3' && arg1 != '€') {
						return 0;
					}
					return 1;
				}
				if (arg3 == 'f') {
					if (arg1 == 'p' && arg2 == 'h') {
						return 2;
					}
					if (arg1 == '£') {
						return 1;
					}
					return 0;
				}
				if (arg3 == 'g') {
					if (arg1 != '9' && arg1 != '6' && arg1 != 'q') {
						return 0;
					}
					return 1;
				}
				if (arg3 == 'h') {
					if (arg1 == '#') {
						return 1;
					}
					return 0;
				}
				if (arg3 == 'i') {
					if (arg1 != 'y' && arg1 != 'l' && arg1 != 'j' && arg1 != '1' && arg1 != '!' && arg1 != ':' && arg1 != ';' && arg1 != '|') {
						return 0;
					}
					return 1;
				}
				if (arg3 == 'j') {
					return 0;
				}
				if (arg3 == 'k') {
					return 0;
				}
				if (arg3 == 'l') {
					if (arg1 != '1' && arg1 != '|' && arg1 != 'i') {
						return 0;
					}
					return 1;
				}
				if (arg3 == 'm') {
					return 0;
				}
			}
			if (arg3 >= 'n' && arg3 <= 'z') {
				if (arg3 == 'n') {
					return 0;
				}
				if (arg3 == 'o') {
					if (arg1 != '0' && arg1 != '*') {
						if ((arg1 != '(' || arg2 != ')') && (arg1 != '[' || arg2 != ']') && (arg1 != '{' || arg2 != '}') && (arg1 != '<' || arg2 != '>')) {
							return 0;
						}
						return 2;
					}
					return 1;
				}
				if (arg3 == 'p') {
					return 0;
				}
				if (arg3 == 'q') {
					return 0;
				}
				if (arg3 == 'r') {
					return 0;
				}
				if (arg3 == 's') {
					if (arg1 != '5' && arg1 != 'z' && arg1 != '$' && arg1 != '2') {
						return 0;
					}
					return 1;
				}
				if (arg3 == 't') {
					if (arg1 != '7' && arg1 != '+') {
						return 0;
					}
					return 1;
				}
				if (arg3 == 'u') {
					if (arg1 == 'v') {
						return 1;
					}
					if ((arg1 != '\\' || arg2 != '/') && (arg1 != '\\' || arg2 != '|') && (arg1 != '|' || arg2 != '/')) {
						return 0;
					}
					return 2;
				}
				if (arg3 == 'v') {
					if ((arg1 != '\\' || arg2 != '/') && (arg1 != '\\' || arg2 != '|') && (arg1 != '|' || arg2 != '/')) {
						return 0;
					}
					return 2;
				}
				if (arg3 == 'w') {
					if (arg1 == 'v' && arg2 == 'v') {
						return 2;
					}
					return 0;
				}
				if (arg3 == 'x') {
					if ((arg1 != ')' || arg2 != '(') && (arg1 != '}' || arg2 != '{') && (arg1 != ']' || arg2 != '[') && (arg1 != '>' || arg2 != '<')) {
						return 0;
					}
					return 2;
				}
				if (arg3 == 'y') {
					return 0;
				}
				if (arg3 == 'z') {
					return 0;
				}
			}
			if (arg3 >= '0' && arg3 <= '9') {
				if (arg3 == '0') {
					if (arg1 == 'o' || arg1 == 'O') {
						return 1;
					} else if ((arg1 != '(' || arg2 != ')') && (arg1 != '{' || arg2 != '}') && (arg1 != '[' || arg2 != ']')) {
						return 0;
					} else {
						return 2;
					}
				} else if (arg3 == '1') {
					return arg1 == 'l' ? 1 : 0;
				} else {
					return 0;
				}
			} else if (arg3 == ',') {
				return arg1 == '.' ? 1 : 0;
			} else if (arg3 == '.') {
				return arg1 == ',' ? 1 : 0;
			} else if (arg3 == '!') {
				return arg1 == 'i' ? 1 : 0;
			} else {
				return 0;
			}
		} catch (@Pc(517) RuntimeException local517) {
			signlink.reporterror("9530, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local517.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IC)B")
	private static byte method616(@OriginalArg(1) char arg0) {
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
			signlink.reporterror("80234, " + -379 + ", " + arg0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "([CI)V")
	private static void method617(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(9) int local9 = 0;
			@Pc(11) int local11 = 0;
			@Pc(13) int local13 = 0;
			while (true) {
				do {
					@Pc(112) int local112;
					if ((local112 = method618(local9, arg0)) == -1) {
						return;
					}
					@Pc(17) boolean local17 = false;
					for (@Pc(19) int local19 = local9; local19 >= 0 && local19 < local112 && !local17; local19++) {
						if (!method620(arg0[local19]) && !method621(arg0[local19])) {
							local17 = true;
						}
					}
					if (local17) {
						local11 = 0;
					}
					if (local11 == 0) {
						local13 = local112;
					}
					local9 = method619(arg0, local112);
					@Pc(58) int local58 = 0;
					for (@Pc(60) int local60 = local112; local60 < local9; local60++) {
						local58 = local58 * 10 + arg0[local60] - 48;
					}
					if (local58 <= 255 && local9 - local112 <= 8) {
						local11++;
					} else {
						local11 = 0;
					}
				} while (local11 != 4);
				for (@Pc(94) int local94 = local13; local94 < local9; local94++) {
					arg0[local94] = '*';
				}
				local11 = 0;
			}
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("48666, " + arg0 + ", " + -17411 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(II[C)I")
	private static int method618(@OriginalArg(1) int arg0, @OriginalArg(2) char[] arg1) {
		try {
			for (@Pc(9) int local9 = arg0; local9 < arg1.length && local9 >= 0; local9++) {
				if (arg1[local9] >= '0' && arg1[local9] <= '9') {
					return local9;
				}
			}
			return -1;
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("33082, " + -365 + ", " + arg0 + ", " + arg1 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CIZ)I")
	private static int method619(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1) {
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
			signlink.reporterror("23776, " + arg0 + ", " + arg1 + ", " + false + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(CI)Z")
	private static boolean method620(@OriginalArg(0) char arg0) {
		try {
			return !method622(arg0) && !method623(arg0);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("61856, " + arg0 + ", " + 0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(CI)Z")
	private static boolean method621(@OriginalArg(0) char arg0) {
		try {
			if (arg0 >= 'a' && arg0 <= 'z') {
				return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
			} else {
				return true;
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("6880, " + arg0 + ", " + 40411 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "(CI)Z")
	private static boolean method622(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("27010, " + arg0 + ", " + 8 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(IC)Z")
	private static boolean method623(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= '0' && arg0 <= '9';
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("56986, " + 0 + ", " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(CZ)Z")
	private static boolean method624(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z';
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("7741, " + arg0 + ", " + false + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZC)Z")
	private static boolean method625(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("60575, " + false + ", " + arg0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "([CI)Z")
	private static boolean method626(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				if (!method623(arg0[local5]) && arg0[local5] != '\u0000') {
					local3 = false;
				}
			}
			if (local3) {
				return true;
			}
			@Pc(41) int local41 = method627(arg0);
			@Pc(43) int local43 = 0;
			@Pc(48) int local48 = anIntArray253.length - 1;
			if (local41 == anIntArray253[0] || local41 == anIntArray253[local48]) {
				return true;
			}
			do {
				@Pc(66) int local66 = (local43 + local48) / 2;
				if (local41 == anIntArray253[local66]) {
					return true;
				}
				if (local41 < anIntArray253[local66]) {
					local48 = local66;
				} else {
					local43 = local66;
				}
			} while (local43 != local48 && local43 + 1 != local48);
			return false;
		} catch (@Pc(95) RuntimeException local95) {
			signlink.reporterror("32549, " + arg0 + ", " + 0 + ", " + local95.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "([CB)I")
	private static int method627(@OriginalArg(0) char[] arg0) {
		try {
			if (arg0.length > 6) {
				return 0;
			}
			@Pc(18) int local18 = 0;
			for (@Pc(20) int local20 = 0; local20 < arg0.length; local20++) {
				@Pc(31) char local31 = arg0[arg0.length - local20 - 1];
				if (local31 >= 'a' && local31 <= 'z') {
					local18 = local18 * 38 + local31 + 1 - 'a';
				} else if (local31 == '\'') {
					local18 = local18 * 38 + 27;
				} else if (local31 >= '0' && local31 <= '9') {
					local18 = local18 * 38 + local31 + 28 - '0';
				} else if (local31 != '\u0000') {
					return 0;
				}
			}
			return local18;
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("24004, " + arg0 + ", " + 122 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}
}
