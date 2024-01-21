import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!sc")
public final class Class42 {

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

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "Z")
	private static boolean aBoolean237 = true;

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
	private static int anInt906 = 9384;

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
	private static int anInt907 = 8;

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
	private static int anInt908 = -11003;

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
	private static int anInt909 = 20416;

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "Z")
	private static boolean aBoolean238 = true;

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "B")
	private static byte aByte35 = 47;

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "B")
	private static byte aByte36 = 24;

	@OriginalMember(owner = "client!sc", name = "i", descriptor = "B")
	private static byte aByte37 = 9;

	@OriginalMember(owner = "client!sc", name = "q", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray13 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!xb;)V")
	public static void method594(@OriginalArg(0) Class47 arg0) {
		@Pc(10) Class1_Sub1_Sub3 local10 = new Class1_Sub1_Sub3(arg0.method666("fragmentsenc.txt", null), (byte) -93);
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(arg0.method666("badenc.txt", null), (byte) -93);
		@Pc(28) Class1_Sub1_Sub3 local28 = new Class1_Sub1_Sub3(arg0.method666("domainenc.txt", null), (byte) -93);
		@Pc(37) Class1_Sub1_Sub3 local37 = new Class1_Sub1_Sub3(arg0.method666("tldlist.txt", null), (byte) -93);
		method595(local10, local19, local28, local37);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!lb;Lclient!lb;Lclient!lb;Lclient!lb;)V")
	private static void method595(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) Class1_Sub1_Sub3 arg2, @OriginalArg(3) Class1_Sub1_Sub3 arg3) {
		method597(arg1);
		method598(arg2, (byte) 3);
		method599(arg0);
		method596(arg3);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!lb;I)V")
	private static void method596(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(4) int local4 = arg0.method485();
			aCharArrayArray3 = new char[local4][];
			anIntArray255 = new int[local4];
			for (@Pc(21) int local21 = 0; local21 < local4; local21++) {
				anIntArray255[local21] = arg0.method480();
				@Pc(32) char[] local32 = new char[arg0.method480()];
				for (@Pc(34) int local34 = 0; local34 < local32.length; local34++) {
					local32[local34] = (char) arg0.method480();
				}
				aCharArrayArray3[local21] = local32;
			}
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("9797, " + arg0 + ", " + -661 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!lb;)V")
	private static void method597(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(2) int local2 = arg0.method485();
			aCharArrayArray1 = new char[local2][];
			aByteArrayArrayArray8 = new byte[local2][][];
			method600(arg0, aByteArrayArrayArray8, aCharArrayArray1);
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("67244, " + 310 + ", " + arg0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!lb;B)V")
	private static void method598(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(2) int local2 = arg0.method485();
			aCharArrayArray2 = new char[local2][];
			@Pc(10) boolean local10 = false;
			method601(aCharArrayArray2, arg0);
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("54841, " + arg0 + ", " + arg1 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!lb;Z)V")
	private static void method599(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			anIntArray254 = new int[arg0.method485()];
			for (@Pc(8) int local8 = 0; local8 < anIntArray254.length; local8++) {
				anIntArray254[local8] = arg0.method482();
			}
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("32382, " + arg0 + ", " + true + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!lb;[[[B[[CI)V")
	private static void method600(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) char[][] arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < arg2.length; local3++) {
				@Pc(9) char[] local9 = new char[arg0.method480()];
				for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
					local9[local11] = (char) arg0.method480();
				}
				arg2[local3] = local9;
				@Pc(33) byte[][] local33 = new byte[arg0.method480()][2];
				for (@Pc(35) int local35 = 0; local35 < local33.length; local35++) {
					local33[local35][0] = (byte) arg0.method480();
					local33[local35][1] = (byte) arg0.method480();
				}
				if (local33.length > 0) {
					arg1[local3] = local33;
				}
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("43397, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -563 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([[CLclient!lb;B)V")
	private static void method601(@OriginalArg(0) char[][] arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
				@Pc(9) char[] local9 = new char[arg1.method480()];
				for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
					local9[local11] = (char) arg1.method480();
				}
				arg0[local3] = local9;
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("23018, " + arg0 + ", " + arg1 + ", " + -31 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[C)V")
	private static void method602(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) int local3 = 0;
			for (@Pc(9) int local9 = 0; local9 < arg0.length; local9++) {
				if (method603(arg0[local9])) {
					arg0[local3] = arg0[local9];
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
			signlink.reporterror("50288, " + 152 + ", " + arg0 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(CB)Z")
	private static boolean method603(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= ' ' && arg0 <= '\u007f' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("93779, " + arg0 + ", " + 117 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method604(@OriginalArg(1) String arg0) {
		try {
			@Pc(3) long local3 = System.currentTimeMillis();
			if (anInt906 != 9384) {
				throw new NullPointerException();
			}
			@Pc(13) char[] local13 = arg0.toCharArray();
			method602(local13);
			@Pc(22) String local22 = (new String(local13)).trim();
			@Pc(26) char[] local26 = local22.toLowerCase().toCharArray();
			@Pc(29) String local29 = local22.toLowerCase();
			method612(local26);
			method607(local26);
			method608(local26);
			method621((byte) 2, local26);
			for (@Pc(43) int local43 = 0; local43 < aStringArray13.length; local43++) {
				@Pc(53) int local53 = -1;
				while ((local53 = local29.indexOf(aStringArray13[local43], local53 + 1)) != -1) {
					@Pc(60) char[] local60 = aStringArray13[local43].toCharArray();
					for (@Pc(62) int local62 = 0; local62 < local60.length; local62++) {
						local26[local62 + local53] = local60[local62];
					}
				}
			}
			method605(local22.toCharArray(), local26);
			method606(local26);
			@Pc(104) long local104 = System.currentTimeMillis();
			return (new String(local26)).trim();
		} catch (@Pc(111) RuntimeException local111) {
			signlink.reporterror("63621, " + 9384 + ", " + arg0 + ", " + local111.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CI[C)V")
	private static void method605(@OriginalArg(0) char[] arg0, @OriginalArg(2) char[] arg1) {
		try {
			if (anInt908 != -11003) {
				anInt907 = 32;
			}
			for (@Pc(6) int local6 = 0; local6 < arg0.length; local6++) {
				if (arg1[local6] != '*' && method629(474, arg0[local6])) {
					arg1[local6] = arg0[local6];
				}
			}
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("24451, " + arg0 + ", " + -11003 + ", " + arg1 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CB)V")
	private static void method606(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(9) int local9 = 0; local9 < arg0.length; local9++) {
				@Pc(15) char local15 = arg0[local9];
				if (!method626(local15)) {
					local3 = true;
				} else if (local3) {
					if (method628(local15)) {
						local3 = false;
					}
				} else if (method629(474, local15)) {
					arg0[local9] = (char) (local15 + 'a' - 65);
				}
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("92074, " + arg0 + ", " + 2 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CI)V")
	private static void method607(@OriginalArg(0) char[] arg0) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 2; local3++) {
				for (@Pc(10) int local10 = aCharArrayArray1.length - 1; local10 >= 0; local10--) {
					method616(aCharArrayArray1[local10], arg0, aByteArrayArrayArray8[local10]);
				}
			}
			if (anInt909 != 20416) {
				aBoolean237 = !aBoolean237;
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("78102, " + arg0 + ", " + 20416 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "([CI)V")
	private static void method608(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(21) char[] local21 = new char[] { '(', 'a', ')' };
			method616(local21, local3, null);
			@Pc(30) char[] local30 = (char[]) arg0.clone();
			@Pc(45) char[] local45 = new char[] { 'd', 'o', 't' };
			method616(local45, local30, null);
			for (@Pc(55) int local55 = aCharArrayArray2.length - 1; local55 >= 0; local55--) {
				method609(local30, local3, aCharArrayArray2[local55], arg0);
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("86263, " + arg0 + ", " + 0 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(B[C[C[C[C)V")
	private static void method609(@OriginalArg(1) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2, @OriginalArg(4) char[] arg3) {
		try {
			if (arg2.length <= arg3.length) {
				@Pc(24) int local24;
				for (@Pc(16) int local16 = 0; local16 <= arg3.length - arg2.length; local16 += local24) {
					@Pc(20) int local20 = local16;
					@Pc(22) int local22 = 0;
					local24 = 1;
					label58: while (true) {
						while (true) {
							if (local20 >= arg3.length) {
								break label58;
							}
							@Pc(32) char local32 = arg3[local20];
							@Pc(34) char local34 = 0;
							if (local20 + 1 < arg3.length) {
								local34 = arg3[local20 + 1];
							}
							@Pc(59) int local59;
							if (local22 < arg2.length && (local59 = method618(local34, local32, arg2[local22])) > 0) {
								local20 += local59;
								local22++;
							} else {
								if (local22 == 0) {
									break label58;
								}
								@Pc(80) int local80;
								if ((local80 = method618(local34, local32, arg2[local22 - 1])) > 0) {
									local20 += local80;
									if (local22 == 1) {
										local24++;
									}
								} else {
									if (local22 >= arg2.length || !method624((byte) 3, local32)) {
										break label58;
									}
									local20++;
								}
							}
						}
					}
					if (local22 >= arg2.length) {
						@Pc(111) boolean local111 = false;
						@Pc(117) int local117 = method610(aBoolean238, local16, arg3, arg1);
						@Pc(125) int local125 = method611(arg3, arg0, local20 - 1, 921);
						if (local117 > 2 || local125 > 2) {
							local111 = true;
						}
						if (local111) {
							for (@Pc(137) int local137 = local16; local137 < local20; local137++) {
								arg3[local137] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("19672, " + -114 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZI[C[C)I")
	private static int method610(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) char[] arg3) {
		try {
			if (!arg0) {
				return anInt908;
			} else if (arg1 == 0) {
				return 2;
			} else {
				for (@Pc(13) int local13 = arg1 - 1; local13 >= 0 && method624((byte) 3, arg2[local13]); local13--) {
					if (arg2[local13] == '@') {
						return 3;
					}
				}
				@Pc(33) int local33 = 0;
				for (@Pc(37) int local37 = arg1 - 1; local37 >= 0 && method624((byte) 3, arg3[local37]); local37--) {
					if (arg3[local37] == '*') {
						local33++;
					}
				}
				if (local33 >= 3) {
					return 4;
				} else if (method624((byte) 3, arg2[arg1 - 1])) {
					return 1;
				} else {
					return 0;
				}
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("18856, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([C[CII)I")
	private static int method611(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg2 + 1 == arg0.length) {
				return 2;
			}
			@Pc(13) int local13 = arg2 + 1;
			while (true) {
				if (local13 < arg0.length && method624((byte) 3, arg0[local13])) {
					if (arg0[local13] != '.' && arg0[local13] != ',') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(42) boolean local42 = false;
				@Pc(44) int local44 = 0;
				for (@Pc(48) int local48 = arg2 + 1; local48 < arg0.length && method624((byte) 3, arg1[local48]); local48++) {
					if (arg1[local48] == '*') {
						local44++;
					}
				}
				if (local44 >= 3) {
					return 4;
				}
				if (method624((byte) 3, arg0[arg2 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("80990, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CZ)V")
	private static void method612(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(18) char[] local18 = new char[] { 'd', 'o', 't' };
			method616(local18, local3, null);
			@Pc(27) char[] local27 = (char[]) arg0.clone();
			@Pc(54) char[] local54 = new char[] { 's', 'l', 'a', 's', 'h' };
			method616(local54, local27, null);
			for (@Pc(61) int local61 = 0; local61 < aCharArrayArray3.length; local61++) {
				method613(arg0, local3, local27, anIntArray255[local61], aCharArrayArray3[local61]);
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("78349, " + arg0 + ", " + false + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([C[C[CII[C)V")
	private static void method613(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) char[] arg4) {
		try {
			if (arg4.length <= arg0.length) {
				@Pc(26) int local26;
				for (@Pc(18) int local18 = 0; local18 <= arg0.length - arg4.length; local18 += local26) {
					@Pc(22) int local22 = local18;
					@Pc(24) int local24 = 0;
					local26 = 1;
					label120: while (true) {
						while (true) {
							if (local22 >= arg0.length) {
								break label120;
							}
							@Pc(34) char local34 = arg0[local22];
							@Pc(36) char local36 = 0;
							if (local22 + 1 < arg0.length) {
								local36 = arg0[local22 + 1];
							}
							@Pc(61) int local61;
							if (local24 < arg4.length && (local61 = method618(local36, local34, arg4[local24])) > 0) {
								local22 += local61;
								local24++;
							} else {
								if (local24 == 0) {
									break label120;
								}
								@Pc(82) int local82;
								if ((local82 = method618(local36, local34, arg4[local24 - 1])) > 0) {
									local22 += local82;
									if (local24 == 1) {
										local26++;
									}
								} else {
									if (local24 >= arg4.length || !method624((byte) 3, local34)) {
										break label120;
									}
									local22++;
								}
							}
						}
					}
					if (local24 >= arg4.length) {
						@Pc(113) boolean local113 = false;
						@Pc(119) int local119 = method614(arg1, arg0, local18);
						@Pc(127) int local127 = method615(arg2, arg0, local22 - 1);
						if (arg3 == 1 && local119 > 0 && local127 > 0) {
							local113 = true;
						}
						if (arg3 == 2 && (local119 > 2 && local127 > 0 || local119 > 0 && local127 > 2)) {
							local113 = true;
						}
						if (arg3 == 3 && local119 > 0 && local127 > 2) {
							local113 = true;
						}
						@Pc(170) boolean local170;
						if (arg3 == 3 && local119 > 2 && local127 > 0) {
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
											if (arg1[local193] != '*') {
												break;
											}
											local177 = local193;
										} else if (arg1[local193] == '*') {
											local177 = local193;
											local189 = true;
										}
									}
								}
								local189 = false;
								for (local193 = local177 - 1; local193 >= 0; local193--) {
									if (local189) {
										if (method624((byte) 3, arg0[local193])) {
											break;
										}
										local177 = local193;
									} else if (!method624((byte) 3, arg0[local193])) {
										local189 = true;
										local177 = local193;
									}
								}
							}
							if (local127 > 2) {
								if (local127 == 4) {
									local189 = false;
									for (local193 = local181 + 1; local193 < arg0.length; local193++) {
										if (local189) {
											if (arg2[local193] != '*') {
												break;
											}
											local181 = local193;
										} else if (arg2[local193] == '*') {
											local181 = local193;
											local189 = true;
										}
									}
								}
								local189 = false;
								for (local193 = local181 + 1; local193 < arg0.length; local193++) {
									if (local189) {
										if (method624((byte) 3, arg0[local193])) {
											break;
										}
										local181 = local193;
									} else if (!method624((byte) 3, arg0[local193])) {
										local189 = true;
										local181 = local193;
									}
								}
							}
							for (@Pc(327) int local327 = local177; local327 <= local181; local327++) {
								arg0[local327] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(350) RuntimeException local350) {
			signlink.reporterror("96639, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 1 + ", " + arg3 + ", " + arg4 + ", " + local350.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "([C[CII)I")
	private static int method614(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 == 0) {
				return 2;
			}
			@Pc(9) int local9 = arg2 - 1;
			while (true) {
				if (local9 >= 0 && method624((byte) 3, arg1[local9])) {
					if (arg1[local9] != ',' && arg1[local9] != '.') {
						local9--;
						continue;
					}
					return 3;
				}
				@Pc(40) int local40 = 0;
				for (@Pc(44) int local44 = arg2 - 1; local44 >= 0 && method624((byte) 3, arg0[local44]); local44--) {
					if (arg0[local44] == '*') {
						local40++;
					}
				}
				if (local40 >= 3) {
					return 4;
				}
				if (method624((byte) 3, arg1[arg2 - 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("64086, " + arg0 + ", " + arg1 + ", " + -115 + ", " + arg2 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "([C[CII)I")
	private static int method615(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 + 1 == arg1.length) {
				return 2;
			}
			@Pc(13) int local13 = arg2 + 1;
			while (true) {
				if (local13 < arg1.length && method624((byte) 3, arg1[local13])) {
					if (arg1[local13] != '\\' && arg1[local13] != '/') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(40) int local40 = 0;
				for (@Pc(54) int local54 = arg2 + 1; local54 < arg1.length && method624((byte) 3, arg0[local54]); local54++) {
					if (arg0[local54] == '*') {
						local40++;
					}
				}
				if (local40 >= 5) {
					return 4;
				}
				if (method624((byte) 3, arg1[arg2 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("6649, " + arg0 + ", " + arg1 + ", " + -36316 + ", " + arg2 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[C[C[[B)V")
	private static void method616(@OriginalArg(1) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) byte[][] arg2) {
		try {
			if (arg0.length <= arg1.length) {
				@Pc(26) int local26;
				for (@Pc(16) int local16 = 0; local16 <= arg1.length - arg0.length; local16 += local26) {
					@Pc(20) int local20 = local16;
					@Pc(22) int local22 = 0;
					@Pc(24) int local24 = 0;
					local26 = 1;
					@Pc(28) boolean local28 = false;
					@Pc(30) boolean local30 = false;
					@Pc(32) boolean local32 = false;
					@Pc(40) char var12;
					@Pc(42) char var13;
					label164: while (true) {
						while (true) {
							if (local20 >= arg1.length || local30 && local32) {
								break label164;
							}
							var12 = arg1[local20];
							var13 = '\u0000';
							if (local20 + 1 < arg1.length) {
								var13 = arg1[local20 + 1];
							}
							@Pc(67) int local67;
							if (local22 < arg0.length && (local67 = method619(var12, arg0[local22], var13)) > 0) {
								if (local67 == 1 && method627(var12)) {
									local30 = true;
								}
								if (local67 == 2 && (method627(var12) || method627(var13))) {
									local30 = true;
								}
								local20 += local67;
								local22++;
							} else {
								if (local22 == 0) {
									break label164;
								}
								@Pc(110) int local110;
								if ((local110 = method619(var12, arg0[local22 - 1], var13)) > 0) {
									local20 += local110;
									if (local22 == 1) {
										local26++;
									}
								} else {
									if (local22 >= arg0.length || !method625(var12, 15)) {
										break label164;
									}
									if (method624((byte) 3, var12) && var12 != '\'') {
										local28 = true;
									}
									if (method627(var12)) {
										local32 = true;
									}
									local20++;
									local24++;
									if (local24 * 100 / (local20 - local16) > 90) {
										break label164;
									}
								}
							}
						}
					}
					if (local22 >= arg0.length && (!local30 || !local32)) {
						@Pc(175) boolean local175 = true;
						@Pc(271) int local271;
						if (local28) {
							@Pc(221) boolean local221 = false;
							@Pc(223) boolean local223 = false;
							if (local16 - 1 < 0 || method624((byte) 3, arg1[local16 - 1]) && arg1[local16 - 1] != '\'') {
								local221 = true;
							}
							if (local20 >= arg1.length || method624((byte) 3, arg1[local20]) && arg1[local20] != '\'') {
								local223 = true;
							}
							if (!local221 || !local223) {
								@Pc(267) boolean local267 = false;
								local271 = local16 - 2;
								if (local221) {
									local271 = local16;
								}
								while (!local267 && local271 < local20) {
									if (local271 >= 0 && (!method624((byte) 3, arg1[local271]) || arg1[local271] == '\'')) {
										@Pc(293) char[] local293 = new char[3];
										@Pc(295) int local295;
										for (local295 = 0; local295 < 3 && local271 + local295 < arg1.length && (!method624((byte) 3, arg1[local271 + local295]) || arg1[local271 + local295] == '\''); local295++) {
											local293[local295] = arg1[local271 + local295];
										}
										@Pc(333) boolean local333 = true;
										if (local295 == 0) {
											local333 = false;
										}
										if (local295 < 3 && local271 - 1 >= 0 && (!method624((byte) 3, arg1[local271 - 1]) || arg1[local271 - 1] == '\'')) {
											local333 = false;
										}
										if (local333 && !method630(local293)) {
											local267 = true;
										}
									}
									local271++;
								}
								if (!local267) {
									local175 = false;
								}
							}
						} else {
							var12 = ' ';
							if (local16 - 1 >= 0) {
								var12 = arg1[local16 - 1];
							}
							var13 = ' ';
							if (local20 < arg1.length) {
								var13 = arg1[local20];
							}
							@Pc(203) byte local203 = method620(var12);
							@Pc(207) byte local207 = method620(var13);
							if (arg2 != null && method617(local203, local207, arg2)) {
								local175 = false;
							}
						}
						if (local175) {
							@Pc(383) int local383 = 0;
							@Pc(385) int local385 = 0;
							@Pc(387) int local387 = -1;
							for (local271 = local16; local271 < local20; local271++) {
								if (method627(arg1[local271])) {
									local383++;
								} else if (method626(arg1[local271])) {
									local385++;
									local387 = local271;
								}
							}
							if (local387 > -1) {
								local383 -= local20 - local387 - 1;
							}
							if (local383 <= local385) {
								for (@Pc(429) int local429 = local16; local429 < local20; local429++) {
									arg1[local429] = '*';
								}
							} else {
								local26 = 1;
							}
						}
					}
				}
			}
		} catch (@Pc(456) RuntimeException local456) {
			signlink.reporterror("75329, " + -72 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local456.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BBZ[[B)Z")
	private static boolean method617(@OriginalArg(0) byte arg0, @OriginalArg(1) byte arg1, @OriginalArg(3) byte[][] arg2) {
		try {
			@Pc(1) int local1 = 0;
			if (arg2[0][0] == arg0 && arg2[0][1] == arg1) {
				return true;
			}
			@Pc(26) int local26 = arg2.length - 1;
			if (arg2[local26][0] == arg0 && arg2[local26][1] == arg1) {
				return true;
			}
			do {
				@Pc(48) int local48 = (local1 + local26) / 2;
				if (arg2[local48][0] == arg0 && arg2[local48][1] == arg1) {
					return true;
				}
				if (arg0 < arg2[local48][0] || arg0 == arg2[local48][0] && arg1 < arg2[local48][1]) {
					local26 = local48;
				} else {
					local1 = local48;
				}
			} while (local1 != local26 && local1 + 1 != local26);
			return false;
		} catch (@Pc(102) RuntimeException local102) {
			signlink.reporterror("98018, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + local102.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BCCC)I")
	private static int method618(@OriginalArg(1) char arg0, @OriginalArg(2) char arg1, @OriginalArg(3) char arg2) {
		try {
			if (aByte35 != 47) {
				anInt906 = -15;
			}
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
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("97154, " + 47 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(CCIC)I")
	private static int method619(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(3) char arg2) {
		try {
			if (arg1 == arg0) {
				return 1;
			}
			if (arg1 >= 'a' && arg1 <= 'm') {
				if (arg1 == 'a') {
					if (arg0 != '4' && arg0 != '@' && arg0 != '^') {
						if (arg0 == '/' && arg2 == '\\') {
							return 2;
						}
						return 0;
					}
					return 1;
				}
				if (arg1 == 'b') {
					if (arg0 != '6' && arg0 != '8') {
						if ((arg0 != '1' || arg2 != '3') && (arg0 != 'i' || arg2 != '3')) {
							return 0;
						}
						return 2;
					}
					return 1;
				}
				if (arg1 == 'c') {
					if (arg0 != '(' && arg0 != '<' && arg0 != '{' && arg0 != '[') {
						return 0;
					}
					return 1;
				}
				if (arg1 == 'd') {
					if ((arg0 != '[' || arg2 != ')') && (arg0 != 'i' || arg2 != ')')) {
						return 0;
					}
					return 2;
				}
				if (arg1 == 'e') {
					if (arg0 != '3' && arg0 != '€') {
						return 0;
					}
					return 1;
				}
				if (arg1 == 'f') {
					if (arg0 == 'p' && arg2 == 'h') {
						return 2;
					}
					if (arg0 == '£') {
						return 1;
					}
					return 0;
				}
				if (arg1 == 'g') {
					if (arg0 != '9' && arg0 != '6' && arg0 != 'q') {
						return 0;
					}
					return 1;
				}
				if (arg1 == 'h') {
					if (arg0 == '#') {
						return 1;
					}
					return 0;
				}
				if (arg1 == 'i') {
					if (arg0 != 'y' && arg0 != 'l' && arg0 != 'j' && arg0 != '1' && arg0 != '!' && arg0 != ':' && arg0 != ';' && arg0 != '|') {
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
					if (arg0 != '1' && arg0 != '|' && arg0 != 'i') {
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
					if (arg0 != '0' && arg0 != '*') {
						if ((arg0 != '(' || arg2 != ')') && (arg0 != '[' || arg2 != ']') && (arg0 != '{' || arg2 != '}') && (arg0 != '<' || arg2 != '>')) {
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
					if (arg0 != '5' && arg0 != 'z' && arg0 != '$' && arg0 != '2') {
						return 0;
					}
					return 1;
				}
				if (arg1 == 't') {
					if (arg0 != '7' && arg0 != '+') {
						return 0;
					}
					return 1;
				}
				if (arg1 == 'u') {
					if (arg0 == 'v') {
						return 1;
					}
					if ((arg0 != '\\' || arg2 != '/') && (arg0 != '\\' || arg2 != '|') && (arg0 != '|' || arg2 != '/')) {
						return 0;
					}
					return 2;
				}
				if (arg1 == 'v') {
					if ((arg0 != '\\' || arg2 != '/') && (arg0 != '\\' || arg2 != '|') && (arg0 != '|' || arg2 != '/')) {
						return 0;
					}
					return 2;
				}
				if (arg1 == 'w') {
					if (arg0 == 'v' && arg2 == 'v') {
						return 2;
					}
					return 0;
				}
				if (arg1 == 'x') {
					if ((arg0 != ')' || arg2 != '(') && (arg0 != '}' || arg2 != '{') && (arg0 != ']' || arg2 != '[') && (arg0 != '>' || arg2 != '<')) {
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
					if (arg0 == 'o' || arg0 == 'O') {
						return 1;
					} else if ((arg0 != '(' || arg2 != ')') && (arg0 != '{' || arg2 != '}') && (arg0 != '[' || arg2 != ']')) {
						return 0;
					} else {
						return 2;
					}
				} else if (arg1 == '1') {
					return arg0 == 'l' ? 1 : 0;
				} else {
					return 0;
				}
			} else if (arg1 == ',') {
				return arg0 == '.' ? 1 : 0;
			} else if (arg1 == '.') {
				return arg0 == ',' ? 1 : 0;
			} else if (arg1 == '!') {
				return arg0 == 'i' ? 1 : 0;
			} else {
				return 0;
			}
		} catch (@Pc(517) RuntimeException local517) {
			signlink.reporterror("35633, " + arg0 + ", " + arg1 + ", " + 35650 + ", " + arg2 + ", " + local517.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(CI)B")
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
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("26936, " + arg0 + ", " + -49945 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(B[C)V")
	private static void method621(@OriginalArg(0) byte arg0, @OriginalArg(1) char[] arg1) {
		try {
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			@Pc(9) int local9 = 0;
			@Pc(14) boolean local14 = false;
			while (true) {
				do {
					@Pc(122) int local122;
					if ((local122 = method622(arg1, aByte36, local5)) == -1) {
						return;
					}
					@Pc(27) boolean local27 = false;
					for (@Pc(29) int local29 = local5; local29 >= 0 && local29 < local122 && !local27; local29++) {
						if (!method624((byte) 3, arg1[local29]) && !method625(arg1[local29], 15)) {
							local27 = true;
						}
					}
					if (local27) {
						local7 = 0;
					}
					if (local7 == 0) {
						local9 = local122;
					}
					local5 = method623(arg1, local122);
					@Pc(68) int local68 = 0;
					for (@Pc(70) int local70 = local122; local70 < local5; local70++) {
						local68 = local68 * 10 + arg1[local70] - 48;
					}
					if (local68 <= 255 && local5 - local122 <= 8) {
						local7++;
					} else {
						local7 = 0;
					}
				} while (local7 != 4);
				for (@Pc(104) int local104 = local9; local104 < local5; local104++) {
					arg1[local104] = '*';
				}
				local7 = 0;
			}
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("72960, " + arg0 + ", " + arg1 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CBI)I")
	private static int method622(@OriginalArg(0) char[] arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		try {
			for (@Pc(3) int local3 = arg2; local3 < arg0.length && local3 >= 0; local3++) {
				if (arg0[local3] >= '0' && arg0[local3] <= '9') {
					return local3;
				}
			}
			if (arg1 != 24) {
				for (@Pc(29) int local29 = 1; local29 > 0; local29++) {
				}
			}
			return -1;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("56300, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "([CBI)I")
	private static int method623(@OriginalArg(0) char[] arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(6) int local6 = arg1;
			while (true) {
				if (local6 < arg0.length && local6 >= 0) {
					if (arg0[local6] >= '0' && arg0[local6] <= '9') {
						local6++;
						continue;
					}
					return local6;
				}
				return arg0.length;
			}
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("30937, " + arg0 + ", " + 25 + ", " + arg1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BC)Z")
	private static boolean method624(@OriginalArg(0) byte arg0, @OriginalArg(1) char arg1) {
		try {
			@Pc(4) boolean local4 = false;
			return !method626(arg1) && !method627(arg1);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("39055, " + arg0 + ", " + arg1 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(CI)Z")
	private static boolean method625(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = true;
			if (arg0 >= 'a' && arg0 <= 'z') {
				return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
			} else {
				return true;
			}
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("56430, " + arg0 + ", " + arg1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(CI)Z")
	private static boolean method626(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("25635, " + arg0 + ", " + 0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IC)Z")
	private static boolean method627(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= '0' && arg0 <= '9';
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("44457, " + -38254 + ", " + arg0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(IC)Z")
	private static boolean method628(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z';
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("45285, " + 436 + ", " + arg0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(IC)Z")
	private static boolean method629(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		try {
			@Pc(3) boolean local3 = false;
			return arg1 >= 'A' && arg1 <= 'Z';
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("12365, " + arg0 + ", " + arg1 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(I[C)Z")
	private static boolean method630(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(11) boolean local11 = true;
			for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
				if (!method627(arg0[local13]) && arg0[local13] != '\u0000') {
					local11 = false;
				}
			}
			if (local11) {
				return true;
			}
			@Pc(40) int local40 = method631(aByte37, arg0);
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
			signlink.reporterror("58628, " + -930 + ", " + arg0 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(B[C)I")
	private static int method631(@OriginalArg(0) byte arg0, @OriginalArg(1) char[] arg1) {
		try {
			if (arg1.length > 6) {
				return 0;
			}
			@Pc(9) int local9 = 0;
			for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
				@Pc(22) char local22 = arg1[arg1.length - local11 - 1];
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
			if (arg0 == 9) {
				return local9;
			} else {
				return anInt908;
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("52734, " + arg0 + ", " + arg1 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}
}
