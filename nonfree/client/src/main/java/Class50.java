import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ZCOZUVWP")
public final class Class50 {

	@OriginalMember(owner = "client!ZCOZUVWP", name = "b", descriptor = "I")
	private static int anInt803;

	@OriginalMember(owner = "client!ZCOZUVWP", name = "c", descriptor = "I")
	private static int anInt804;

	@OriginalMember(owner = "client!ZCOZUVWP", name = "f", descriptor = "Z")
	private static boolean aBoolean210;

	@OriginalMember(owner = "client!ZCOZUVWP", name = "g", descriptor = "[I")
	private static int[] anIntArray208;

	@OriginalMember(owner = "client!ZCOZUVWP", name = "h", descriptor = "[[C")
	private static char[][] aCharArrayArray1;

	@OriginalMember(owner = "client!ZCOZUVWP", name = "i", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!ZCOZUVWP", name = "j", descriptor = "[[C")
	private static char[][] aCharArrayArray2;

	@OriginalMember(owner = "client!ZCOZUVWP", name = "k", descriptor = "[[C")
	private static char[][] aCharArrayArray3;

	@OriginalMember(owner = "client!ZCOZUVWP", name = "l", descriptor = "[I")
	private static int[] anIntArray209;

	@OriginalMember(owner = "client!ZCOZUVWP", name = "a", descriptor = "I")
	private static int anInt802 = 76;

	@OriginalMember(owner = "client!ZCOZUVWP", name = "d", descriptor = "Z")
	private static boolean aBoolean209 = true;

	@OriginalMember(owner = "client!ZCOZUVWP", name = "e", descriptor = "I")
	private static int anInt805 = 18;

	@OriginalMember(owner = "client!ZCOZUVWP", name = "m", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray7 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

	@OriginalMember(owner = "client!ZCOZUVWP", name = "a", descriptor = "(Lclient!RVLWVPJQ;)V")
	public static void method533(@OriginalArg(0) Class36 arg0) {
		@Pc(10) Class6_Sub2_Sub3 local10 = new Class6_Sub2_Sub3(741, arg0.method381("fragmentsenc.txt", null));
		@Pc(19) Class6_Sub2_Sub3 local19 = new Class6_Sub2_Sub3(741, arg0.method381("badenc.txt", null));
		@Pc(28) Class6_Sub2_Sub3 local28 = new Class6_Sub2_Sub3(741, arg0.method381("domainenc.txt", null));
		@Pc(37) Class6_Sub2_Sub3 local37 = new Class6_Sub2_Sub3(741, arg0.method381("tldlist.txt", null));
		method534(local10, local19, local28, local37);
	}

	@OriginalMember(owner = "client!ZCOZUVWP", name = "a", descriptor = "(Lclient!UAWAYCTK;Lclient!UAWAYCTK;Lclient!UAWAYCTK;Lclient!UAWAYCTK;)V")
	private static void method534(@OriginalArg(0) Class6_Sub2_Sub3 arg0, @OriginalArg(1) Class6_Sub2_Sub3 arg1, @OriginalArg(2) Class6_Sub2_Sub3 arg2, @OriginalArg(3) Class6_Sub2_Sub3 arg3) {
		method536(arg1);
		method537(arg2);
		method538(arg0);
		method535(arg3, 936);
	}

	@OriginalMember(owner = "client!ZCOZUVWP", name = "a", descriptor = "(Lclient!UAWAYCTK;I)V")
	private static void method535(@OriginalArg(0) Class6_Sub2_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) int local4 = arg0.method407();
			@Pc(8) boolean local8 = false;
			aCharArrayArray3 = new char[local4][];
			anIntArray209 = new int[local4];
			for (@Pc(16) int local16 = 0; local16 < local4; local16++) {
				anIntArray209[local16] = arg0.method402();
				@Pc(27) char[] local27 = new char[arg0.method402()];
				for (@Pc(29) int local29 = 0; local29 < local27.length; local29++) {
					local27[local29] = (char) arg0.method402();
				}
				aCharArrayArray3[local16] = local27;
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("38172, " + arg0 + ", " + arg1 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZCOZUVWP", name = "a", descriptor = "(BLclient!UAWAYCTK;)V")
	private static void method536(@OriginalArg(1) Class6_Sub2_Sub3 arg0) {
		try {
			@Pc(2) int local2 = arg0.method407();
			aCharArrayArray1 = new char[local2][];
			aByteArrayArrayArray7 = new byte[local2][][];
			method539(arg0, aCharArrayArray1, aByteArrayArrayArray7);
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("22598, " + 0 + ", " + arg0 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZCOZUVWP", name = "a", descriptor = "(ILclient!UAWAYCTK;)V")
	private static void method537(@OriginalArg(1) Class6_Sub2_Sub3 arg0) {
		try {
			@Pc(2) int local2 = arg0.method407();
			aCharArrayArray2 = new char[local2][];
			method540(arg0, aCharArrayArray2);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("6944, " + -822 + ", " + arg0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZCOZUVWP", name = "b", descriptor = "(ILclient!UAWAYCTK;)V")
	private static void method538(@OriginalArg(1) Class6_Sub2_Sub3 arg0) {
		try {
			anIntArray208 = new int[arg0.method407()];
			for (@Pc(5) int local5 = 0; local5 < anIntArray208.length; local5++) {
				anIntArray208[local5] = arg0.method404();
			}
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("93064, " + 0 + ", " + arg0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZCOZUVWP", name = "a", descriptor = "(Lclient!UAWAYCTK;[[CI[[[B)V")
	private static void method539(@OriginalArg(0) Class6_Sub2_Sub3 arg0, @OriginalArg(1) char[][] arg1, @OriginalArg(3) byte[][][] arg2) {
		try {
			for (@Pc(6) int local6 = 0; local6 < arg1.length; local6++) {
				@Pc(12) char[] local12 = new char[arg0.method402()];
				for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
					local12[local14] = (char) arg0.method402();
				}
				arg1[local6] = local12;
				@Pc(36) byte[][] local36 = new byte[arg0.method402()][2];
				for (@Pc(38) int local38 = 0; local38 < local36.length; local38++) {
					local36[local38][0] = (byte) arg0.method402();
					local36[local38][1] = (byte) arg0.method402();
				}
				if (local36.length > 0) {
					arg2[local6] = local36;
				}
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("15718, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZCOZUVWP", name = "a", descriptor = "(Lclient!UAWAYCTK;Z[[C)V")
	private static void method540(@OriginalArg(0) Class6_Sub2_Sub3 arg0, @OriginalArg(2) char[][] arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
				@Pc(9) char[] local9 = new char[arg0.method402()];
				for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
					local9[local11] = (char) arg0.method402();
				}
				arg1[local3] = local9;
			}
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("76446, " + arg0 + ", " + true + ", " + arg1 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZCOZUVWP", name = "a", descriptor = "([CI)V")
	private static void method541(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) int local3 = 0;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				if (method542(arg0[local5], aBoolean209)) {
					arg0[local3] = arg0[local5];
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
			signlink.reporterror("13371, " + arg0 + ", " + -437 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZCOZUVWP", name = "a", descriptor = "(CZ)Z")
	private static boolean method542(@OriginalArg(0) char arg0, @OriginalArg(1) boolean arg1) {
		try {
			if (!arg1) {
				anInt803 = -50;
			}
			return arg0 >= ' ' && arg0 <= '\u007f' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("59362, " + arg0 + ", " + arg1 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZCOZUVWP", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method543(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(3) long local3 = System.currentTimeMillis();
			@Pc(7) boolean local7 = true;
			@Pc(10) char[] local10 = arg1.toCharArray();
			method541(local10);
			@Pc(19) String local19 = (new String(local10)).trim();
			@Pc(23) char[] local23 = local19.toLowerCase().toCharArray();
			@Pc(26) String local26 = local19.toLowerCase();
			method551(local23);
			method546(local23);
			method547(local23);
			method560(local23, 609);
			for (@Pc(40) int local40 = 0; local40 < aStringArray7.length; local40++) {
				@Pc(50) int local50 = -1;
				while ((local50 = local26.indexOf(aStringArray7[local40], local50 + 1)) != -1) {
					@Pc(57) char[] local57 = aStringArray7[local40].toCharArray();
					for (@Pc(59) int local59 = 0; local59 < local57.length; local59++) {
						local23[local59 + local50] = local57[local59];
					}
				}
			}
			method544(local19.toCharArray(), local23);
			method545(local23);
			@Pc(101) long local101 = System.currentTimeMillis();
			return (new String(local23)).trim();
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("87298, " + arg0 + ", " + arg1 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZCOZUVWP", name = "a", descriptor = "([CI[C)V")
	private static void method544(@OriginalArg(0) char[] arg0, @OriginalArg(2) char[] arg1) {
		try {
			for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
				if (arg1[local1] != '*' && method568(anInt805, arg0[local1])) {
					arg1[local1] = arg0[local1];
				}
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("62326, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZCOZUVWP", name = "a", descriptor = "(B[C)V")
	private static void method545(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(13) boolean local13 = true;
			for (@Pc(15) int local15 = 0; local15 < arg0.length; local15++) {
				@Pc(21) char local21 = arg0[local15];
				if (!method565(203, local21)) {
					local13 = true;
				} else if (local13) {
					if (method567(local21)) {
						local13 = false;
					}
				} else if (method568(anInt805, local21)) {
					arg0[local15] = (char) (local21 + 'a' - 65);
				}
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("91357, " + -107 + ", " + arg0 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZCOZUVWP", name = "b", descriptor = "(B[C)V")
	private static void method546(@OriginalArg(1) char[] arg0) {
		try {
			for (@Pc(8) int local8 = 0; local8 < 2; local8++) {
				for (@Pc(15) int local15 = aCharArrayArray1.length - 1; local15 >= 0; local15--) {
					method555(aCharArrayArray1[local15], arg0, aByteArrayArrayArray7[local15]);
				}
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("25219, " + 70 + ", " + arg0 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZCOZUVWP", name = "b", descriptor = "([CI)V")
	private static void method547(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(18) char[] local18 = new char[] { '(', 'a', ')' };
			method555(local18, local3, null);
			@Pc(30) char[] local30 = (char[]) arg0.clone();
			@Pc(45) char[] local45 = new char[] { 'd', 'o', 't' };
			method555(local45, local30, null);
			for (@Pc(55) int local55 = aCharArrayArray2.length - 1; local55 >= 0; local55--) {
				method548(aCharArrayArray2[local55], arg0, local3, local30);
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("77625, " + arg0 + ", " + 0 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZCOZUVWP", name = "a", descriptor = "([CZ[C[C[C)V")
	private static void method548(@OriginalArg(0) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2, @OriginalArg(4) char[] arg3) {
		try {
			if (arg0.length <= arg1.length) {
				@Pc(28) int local28;
				for (@Pc(20) int local20 = 0; local20 <= arg1.length - arg0.length; local20 += local28) {
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
							if (local26 < arg0.length && (local63 = method557(arg0[local26], local36, local38)) > 0) {
								local24 += local63;
								local26++;
							} else {
								if (local26 == 0) {
									break label58;
								}
								@Pc(84) int local84;
								if ((local84 = method557(arg0[local26 - 1], local36, local38)) > 0) {
									local24 += local84;
									if (local26 == 1) {
										local28++;
									}
								} else {
									if (local26 >= arg0.length || !method563(local36)) {
										break label58;
									}
									local24++;
								}
							}
						}
					}
					if (local26 >= arg0.length) {
						@Pc(115) boolean local115 = false;
						@Pc(121) int local121 = method549((byte) 3, local20, arg2, arg1);
						@Pc(129) int local129 = method550(arg1, local24 - 1, arg3);
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
			signlink.reporterror("92851, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local164.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZCOZUVWP", name = "a", descriptor = "(BI[C[C)I")
	private static int method549(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) char[] arg3) {
		try {
			if (arg1 == 0) {
				return 2;
			}
			for (@Pc(9) int local9 = arg1 - 1; local9 >= 0 && method563(arg3[local9]); local9--) {
				if (arg3[local9] == '@') {
					return 3;
				}
			}
			@Pc(29) int local29 = 0;
			for (@Pc(33) int local33 = arg1 - 1; local33 >= 0 && method563(arg2[local33]); local33--) {
				if (arg2[local33] == '*') {
					local29++;
				}
			}
			@Pc(56) boolean local56 = false;
			if (local29 >= 3) {
				return 4;
			} else if (method563(arg3[arg1 - 1])) {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("59493, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZCOZUVWP", name = "a", descriptor = "([CI[CI)I")
	private static int method550(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) char[] arg2) {
		try {
			if (arg1 + 1 == arg0.length) {
				return 2;
			}
			@Pc(21) int local21 = arg1 + 1;
			while (true) {
				if (local21 < arg0.length && method563(arg0[local21])) {
					if (arg0[local21] != '.' && arg0[local21] != ',') {
						local21++;
						continue;
					}
					return 3;
				}
				@Pc(48) int local48 = 0;
				for (@Pc(52) int local52 = arg1 + 1; local52 < arg0.length && method563(arg2[local52]); local52++) {
					if (arg2[local52] == '*') {
						local48++;
					}
				}
				if (local48 >= 3) {
					return 4;
				}
				if (method563(arg0[arg1 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("82249, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 2 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZCOZUVWP", name = "a", descriptor = "(I[C)V")
	private static void method551(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(18) char[] local18 = new char[] { 'd', 'o', 't' };
			method555(local18, local3, null);
			@Pc(27) char[] local27 = (char[]) arg0.clone();
			@Pc(50) char[] local50 = new char[] { 's', 'l', 'a', 's', 'h' };
			method555(local50, local27, null);
			for (@Pc(57) int local57 = 0; local57 < aCharArrayArray3.length; local57++) {
				method552(local27, local3, aCharArrayArray3[local57], arg0, anIntArray209[local57]);
			}
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("77266, " + 0 + ", " + arg0 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZCOZUVWP", name = "a", descriptor = "([CI[C[C[CI)V")
	private static void method552(@OriginalArg(0) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2, @OriginalArg(4) char[] arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg2.length <= arg3.length) {
				@Pc(19) int local19;
				for (@Pc(11) int local11 = 0; local11 <= arg3.length - arg2.length; local11 += local19) {
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
							if (local17 < arg2.length && (local54 = method557(arg2[local17], local27, local29)) > 0) {
								local15 += local54;
								local17++;
							} else {
								if (local17 == 0) {
									break label121;
								}
								@Pc(75) int local75;
								if ((local75 = method557(arg2[local17 - 1], local27, local29)) > 0) {
									local15 += local75;
									if (local17 == 1) {
										local19++;
									}
								} else {
									if (local17 >= arg2.length || !method563(local27)) {
										break label121;
									}
									local15++;
								}
							}
						}
					}
					if (local17 >= arg2.length) {
						@Pc(106) boolean local106 = false;
						@Pc(112) int local112 = method553(local11, arg1, arg3);
						@Pc(120) int local120 = method554(local15 - 1, arg0, arg3);
						if (arg4 == 1 && local112 > 0 && local120 > 0) {
							local106 = true;
						}
						if (arg4 == 2 && (local112 > 2 && local120 > 0 || local112 > 0 && local120 > 2)) {
							local106 = true;
						}
						if (arg4 == 3 && local112 > 0 && local120 > 2) {
							local106 = true;
						}
						@Pc(163) boolean local163;
						if (arg4 == 3 && local112 > 2 && local120 > 0) {
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
											if (arg1[local186] != '*') {
												break;
											}
											local170 = local186;
										} else if (arg1[local186] == '*') {
											local170 = local186;
											local182 = true;
										}
									}
								}
								local182 = false;
								for (local186 = local170 - 1; local186 >= 0; local186--) {
									if (local182) {
										if (method563(arg3[local186])) {
											break;
										}
										local170 = local186;
									} else if (!method563(arg3[local186])) {
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
											if (arg0[local186] != '*') {
												break;
											}
											local174 = local186;
										} else if (arg0[local186] == '*') {
											local174 = local186;
											local182 = true;
										}
									}
								}
								local182 = false;
								for (local186 = local174 + 1; local186 < arg3.length; local186++) {
									if (local182) {
										if (method563(arg3[local186])) {
											break;
										}
										local174 = local186;
									} else if (!method563(arg3[local186])) {
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
		} catch (@Pc(348) RuntimeException local348) {
			signlink.reporterror("16512, " + arg0 + ", " + 42831 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local348.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZCOZUVWP", name = "a", descriptor = "(I[CI[C)I")
	private static int method553(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg0 == 0) {
				return 2;
			}
			@Pc(9) int local9 = arg0 - 1;
			while (true) {
				if (local9 >= 0 && method563(arg2[local9])) {
					if (arg2[local9] != ',' && arg2[local9] != '.') {
						local9--;
						continue;
					}
					return 3;
				}
				@Pc(45) int local45 = 0;
				for (@Pc(49) int local49 = arg0 - 1; local49 >= 0 && method563(arg1[local49]); local49--) {
					if (arg1[local49] == '*') {
						local45++;
					}
				}
				if (local45 >= 3) {
					return 4;
				}
				if (method563(arg2[arg0 - 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("42508, " + arg0 + ", " + arg1 + ", " + -546 + ", " + arg2 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZCOZUVWP", name = "a", descriptor = "(II[C[C)I")
	private static int method554(@OriginalArg(0) int arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg0 + 1 == arg2.length) {
				return 2;
			}
			@Pc(13) int local13 = arg0 + 1;
			while (true) {
				if (local13 < arg2.length && method563(arg2[local13])) {
					if (arg2[local13] != '\\' && arg2[local13] != '/') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(45) int local45 = 0;
				for (@Pc(49) int local49 = arg0 + 1; local49 < arg2.length && method563(arg1[local49]); local49++) {
					if (arg1[local49] == '*') {
						local45++;
					}
				}
				if (local45 >= 5) {
					return 4;
				}
				if (method563(arg2[arg0 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("55401, " + arg0 + ", " + -35291 + ", " + arg1 + ", " + arg2 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZCOZUVWP", name = "a", descriptor = "([C[C[[BZ)V")
	private static void method555(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) byte[][] arg2) {
		try {
			if (arg0.length <= arg1.length) {
				@Pc(21) int local21;
				for (@Pc(11) int local11 = 0; local11 <= arg1.length - arg0.length; local11 += local21) {
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
							if (local17 < arg0.length && (local62 = method558(arg0[local17], var12, var13)) > 0) {
								if (local62 == 1 && method566(var12)) {
									local25 = true;
								}
								if (local62 == 2 && (method566(var12) || method566(var13))) {
									local25 = true;
								}
								local15 += local62;
								local17++;
							} else {
								if (local17 == 0) {
									break label165;
								}
								@Pc(105) int local105;
								if ((local105 = method558(arg0[local17 - 1], var12, var13)) > 0) {
									local15 += local105;
									if (local17 == 1) {
										local21++;
									}
								} else {
									if (local17 >= arg0.length || !method564(var12)) {
										break label165;
									}
									if (method563(var12) && var12 != '\'') {
										local23 = true;
									}
									if (method566(var12)) {
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
							if (local11 - 1 < 0 || method563(arg1[local11 - 1]) && arg1[local11 - 1] != '\'') {
								local216 = true;
							}
							if (local15 >= arg1.length || method563(arg1[local15]) && arg1[local15] != '\'') {
								local218 = true;
							}
							if (!local216 || !local218) {
								@Pc(262) boolean local262 = false;
								local266 = local11 - 2;
								if (local216) {
									local266 = local11;
								}
								while (!local262 && local266 < local15) {
									if (local266 >= 0 && (!method563(arg1[local266]) || arg1[local266] == '\'')) {
										@Pc(288) char[] local288 = new char[3];
										@Pc(290) int local290;
										for (local290 = 0; local290 < 3 && local266 + local290 < arg1.length && (!method563(arg1[local266 + local290]) || arg1[local266 + local290] == '\''); local290++) {
											local288[local290] = arg1[local266 + local290];
										}
										@Pc(328) boolean local328 = true;
										if (local290 == 0) {
											local328 = false;
										}
										if (local290 < 3 && local266 - 1 >= 0 && (!method563(arg1[local266 - 1]) || arg1[local266 - 1] == '\'')) {
											local328 = false;
										}
										if (local328 && !method569((byte) 9, local288)) {
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
							@Pc(198) byte local198 = method559(var12);
							@Pc(202) byte local202 = method559(var13);
							if (arg2 != null && method556(local198, (byte) 8, arg2, local202)) {
								local170 = false;
							}
						}
						if (local170) {
							@Pc(378) int local378 = 0;
							@Pc(380) int local380 = 0;
							@Pc(382) int local382 = -1;
							for (local266 = local11; local266 < local15; local266++) {
								if (method566(arg1[local266])) {
									local378++;
								} else if (method565(203, arg1[local266])) {
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
			signlink.reporterror("51122, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + local460.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZCOZUVWP", name = "a", descriptor = "(BB[[BB)Z")
	private static boolean method556(@OriginalArg(0) byte arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) byte arg3) {
		try {
			@Pc(3) int local3 = 0;
			@Pc(8) boolean local8 = false;
			if (arg2[0][0] == arg0 && arg2[0][1] == arg3) {
				return true;
			}
			@Pc(35) int local35 = arg2.length - 1;
			if (arg2[local35][0] == arg0 && arg2[local35][1] == arg3) {
				return true;
			}
			do {
				@Pc(57) int local57 = (local3 + local35) / 2;
				if (arg2[local57][0] == arg0 && arg2[local57][1] == arg3) {
					return true;
				}
				if (arg0 < arg2[local57][0] || arg0 == arg2[local57][0] && arg3 < arg2[local57][1]) {
					local35 = local57;
				} else {
					local3 = local57;
				}
			} while (local3 != local35 && local3 + 1 != local35);
			return false;
		} catch (@Pc(111) RuntimeException local111) {
			signlink.reporterror("8307, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local111.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZCOZUVWP", name = "a", descriptor = "(CCZC)I")
	private static int method557(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(3) char arg2) {
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
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("23989, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZCOZUVWP", name = "a", descriptor = "(ICCC)I")
	private static int method558(@OriginalArg(1) char arg0, @OriginalArg(2) char arg1, @OriginalArg(3) char arg2) {
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
		} catch (@Pc(516) RuntimeException local516) {
			signlink.reporterror("3930, " + 9 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local516.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZCOZUVWP", name = "a", descriptor = "(IC)B")
	private static byte method559(@OriginalArg(1) char arg0) {
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
			signlink.reporterror("37802, " + 8 + ", " + arg0 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZCOZUVWP", name = "c", descriptor = "([CI)V")
	private static void method560(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			@Pc(9) int local9 = 0;
			@Pc(13) boolean local13 = false;
			while (true) {
				do {
					@Pc(112) int local112;
					if ((local112 = method561(arg0, local5)) == -1) {
						return;
					}
					@Pc(17) boolean local17 = false;
					for (@Pc(19) int local19 = local5; local19 >= 0 && local19 < local112 && !local17; local19++) {
						if (!method563(arg0[local19]) && !method564(arg0[local19])) {
							local17 = true;
						}
					}
					if (local17) {
						local7 = 0;
					}
					if (local7 == 0) {
						local9 = local112;
					}
					local5 = method562(local112, arg0);
					@Pc(58) int local58 = 0;
					for (@Pc(60) int local60 = local112; local60 < local5; local60++) {
						local58 = local58 * 10 + arg0[local60] - 48;
					}
					if (local58 <= 255 && local5 - local112 <= 8) {
						local7++;
					} else {
						local7 = 0;
					}
				} while (local7 != 4);
				for (@Pc(94) int local94 = local9; local94 < local5; local94++) {
					arg0[local94] = '*';
				}
				local7 = 0;
			}
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("12983, " + arg0 + ", " + arg1 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZCOZUVWP", name = "a", descriptor = "(B[CI)I")
	private static int method561(@OriginalArg(1) char[] arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(6) int local6 = arg1; local6 < arg0.length && local6 >= 0; local6++) {
				if (arg0[local6] >= '0' && arg0[local6] <= '9') {
					return local6;
				}
			}
			return -1;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("27028, " + 7 + ", " + arg0 + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZCOZUVWP", name = "a", descriptor = "(I[CI)I")
	private static int method562(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1) {
		try {
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
			signlink.reporterror("27501, " + arg0 + ", " + arg1 + ", " + 8 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZCOZUVWP", name = "a", descriptor = "(BC)Z")
	private static boolean method563(@OriginalArg(1) char arg0) {
		try {
			return !method565(203, arg0) && !method566(arg0);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("7315, " + -126 + ", " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZCOZUVWP", name = "b", descriptor = "(CZ)Z")
	private static boolean method564(@OriginalArg(0) char arg0) {
		try {
			if (arg0 >= 'a' && arg0 <= 'z') {
				return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
			} else {
				return true;
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("49013, " + arg0 + ", " + false + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZCOZUVWP", name = "b", descriptor = "(IC)Z")
	private static boolean method565(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		try {
			@Pc(3) boolean local3 = false;
			return arg1 >= 'a' && arg1 <= 'z' || arg1 >= 'A' && arg1 <= 'Z';
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("90349, " + arg0 + ", " + arg1 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZCOZUVWP", name = "c", descriptor = "(CZ)Z")
	private static boolean method566(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= '0' && arg0 <= '9';
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("17402, " + arg0 + ", " + false + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZCOZUVWP", name = "c", descriptor = "(IC)Z")
	private static boolean method567(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z';
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("13750, " + 5 + ", " + arg0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZCOZUVWP", name = "d", descriptor = "(IC)Z")
	private static boolean method568(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		try {
			if (arg0 != 18) {
				throw new NullPointerException();
			}
			return arg1 >= 'A' && arg1 <= 'Z';
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("60574, " + arg0 + ", " + arg1 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZCOZUVWP", name = "c", descriptor = "(B[C)Z")
	private static boolean method569(@OriginalArg(0) byte arg0, @OriginalArg(1) char[] arg1) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < arg1.length; local5++) {
				if (!method566(arg1[local5]) && arg1[local5] != '\u0000') {
					local3 = false;
				}
			}
			@Pc(29) boolean local29 = false;
			if (local3) {
				return true;
			}
			@Pc(43) int local43 = method570(arg1);
			@Pc(45) int local45 = 0;
			@Pc(50) int local50 = anIntArray208.length - 1;
			if (local43 == anIntArray208[0] || local43 == anIntArray208[local50]) {
				return true;
			}
			do {
				@Pc(68) int local68 = (local45 + local50) / 2;
				if (local43 == anIntArray208[local68]) {
					return true;
				}
				if (local43 < anIntArray208[local68]) {
					local50 = local68;
				} else {
					local45 = local68;
				}
			} while (local45 != local50 && local45 + 1 != local50);
			return false;
		} catch (@Pc(97) RuntimeException local97) {
			signlink.reporterror("88545, " + arg0 + ", " + arg1 + ", " + local97.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZCOZUVWP", name = "a", descriptor = "([CZ)I")
	private static int method570(@OriginalArg(0) char[] arg0) {
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
			signlink.reporterror("701, " + arg0 + ", " + true + ", " + local85.toString());
			throw new RuntimeException();
		}
	}
}
