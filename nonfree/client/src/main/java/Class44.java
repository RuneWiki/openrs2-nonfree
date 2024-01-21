import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!UCQYJOHJ")
public final class Class44 {

	@OriginalMember(owner = "client!UCQYJOHJ", name = "a", descriptor = "Z")
	private static boolean aBoolean191;

	@OriginalMember(owner = "client!UCQYJOHJ", name = "d", descriptor = "Z")
	private static boolean aBoolean193;

	@OriginalMember(owner = "client!UCQYJOHJ", name = "n", descriptor = "[I")
	private static int[] anIntArray195;

	@OriginalMember(owner = "client!UCQYJOHJ", name = "o", descriptor = "[[C")
	private static char[][] aCharArrayArray1;

	@OriginalMember(owner = "client!UCQYJOHJ", name = "p", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!UCQYJOHJ", name = "q", descriptor = "[[C")
	private static char[][] aCharArrayArray2;

	@OriginalMember(owner = "client!UCQYJOHJ", name = "r", descriptor = "[[C")
	private static char[][] aCharArrayArray3;

	@OriginalMember(owner = "client!UCQYJOHJ", name = "s", descriptor = "[I")
	private static int[] anIntArray196;

	@OriginalMember(owner = "client!UCQYJOHJ", name = "b", descriptor = "Z")
	private static boolean aBoolean192 = true;

	@OriginalMember(owner = "client!UCQYJOHJ", name = "c", descriptor = "I")
	private static int anInt745 = 130;

	@OriginalMember(owner = "client!UCQYJOHJ", name = "f", descriptor = "I")
	private static int anInt746 = 9;

	@OriginalMember(owner = "client!UCQYJOHJ", name = "g", descriptor = "B")
	private static byte aByte19 = 4;

	@OriginalMember(owner = "client!UCQYJOHJ", name = "h", descriptor = "B")
	private static byte aByte20 = 3;

	@OriginalMember(owner = "client!UCQYJOHJ", name = "i", descriptor = "B")
	private static byte aByte21 = 4;

	@OriginalMember(owner = "client!UCQYJOHJ", name = "j", descriptor = "I")
	private static int anInt747 = -593;

	@OriginalMember(owner = "client!UCQYJOHJ", name = "k", descriptor = "I")
	private static int anInt748 = -60;

	@OriginalMember(owner = "client!UCQYJOHJ", name = "l", descriptor = "Z")
	private static boolean aBoolean195 = true;

	@OriginalMember(owner = "client!UCQYJOHJ", name = "m", descriptor = "I")
	private static int anInt749 = 8;

	@OriginalMember(owner = "client!UCQYJOHJ", name = "t", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray6 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

	@OriginalMember(owner = "client!UCQYJOHJ", name = "a", descriptor = "(Lclient!ESUFCMYV;)V")
	public static void method469(@OriginalArg(0) Class11 arg0) {
		@Pc(10) Class6_Sub1_Sub4 local10 = new Class6_Sub1_Sub4(arg0.method89("fragmentsenc.txt", null), (byte) -17);
		@Pc(19) Class6_Sub1_Sub4 local19 = new Class6_Sub1_Sub4(arg0.method89("badenc.txt", null), (byte) -17);
		@Pc(28) Class6_Sub1_Sub4 local28 = new Class6_Sub1_Sub4(arg0.method89("domainenc.txt", null), (byte) -17);
		@Pc(37) Class6_Sub1_Sub4 local37 = new Class6_Sub1_Sub4(arg0.method89("tldlist.txt", null), (byte) -17);
		method470(local10, local19, local28, local37);
	}

	@OriginalMember(owner = "client!UCQYJOHJ", name = "a", descriptor = "(Lclient!RGCGKKUR;Lclient!RGCGKKUR;Lclient!RGCGKKUR;Lclient!RGCGKKUR;)V")
	private static void method470(@OriginalArg(0) Class6_Sub1_Sub4 arg0, @OriginalArg(1) Class6_Sub1_Sub4 arg1, @OriginalArg(2) Class6_Sub1_Sub4 arg2, @OriginalArg(3) Class6_Sub1_Sub4 arg3) {
		method472(aBoolean193, arg1);
		method473(arg2);
		method474(arg0);
		method471(arg3);
	}

	@OriginalMember(owner = "client!UCQYJOHJ", name = "a", descriptor = "(Lclient!RGCGKKUR;I)V")
	private static void method471(@OriginalArg(0) Class6_Sub1_Sub4 arg0) {
		try {
			@Pc(8) int local8 = arg0.method416();
			aCharArrayArray3 = new char[local8][];
			anIntArray196 = new int[local8];
			for (@Pc(16) int local16 = 0; local16 < local8; local16++) {
				anIntArray196[local16] = arg0.method411();
				@Pc(27) char[] local27 = new char[arg0.method411()];
				for (@Pc(29) int local29 = 0; local29 < local27.length; local29++) {
					local27[local29] = (char) arg0.method411();
				}
				aCharArrayArray3[local16] = local27;
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("52246, " + arg0 + ", " + 2 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UCQYJOHJ", name = "a", descriptor = "(ZLclient!RGCGKKUR;)V")
	private static void method472(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class6_Sub1_Sub4 arg1) {
		try {
			@Pc(2) int local2 = arg1.method416();
			aCharArrayArray1 = new char[local2][];
			aByteArrayArrayArray7 = new byte[local2][][];
			method475(arg1, aByteArrayArrayArray7, aCharArrayArray1);
			if (arg0) {
				anInt745 = -293;
			}
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("16699, " + arg0 + ", " + arg1 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UCQYJOHJ", name = "a", descriptor = "(Lclient!RGCGKKUR;Z)V")
	private static void method473(@OriginalArg(0) Class6_Sub1_Sub4 arg0) {
		try {
			@Pc(2) int local2 = arg0.method416();
			aCharArrayArray2 = new char[local2][];
			method476(arg0, aCharArrayArray2);
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("25166, " + arg0 + ", " + false + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UCQYJOHJ", name = "b", descriptor = "(ZLclient!RGCGKKUR;)V")
	private static void method474(@OriginalArg(1) Class6_Sub1_Sub4 arg0) {
		try {
			anIntArray195 = new int[arg0.method416()];
			for (@Pc(16) int local16 = 0; local16 < anIntArray195.length; local16++) {
				anIntArray195[local16] = arg0.method413();
			}
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("53302, " + true + ", " + arg0 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UCQYJOHJ", name = "a", descriptor = "(ZLclient!RGCGKKUR;[[[B[[C)V")
	private static void method475(@OriginalArg(1) Class6_Sub1_Sub4 arg0, @OriginalArg(2) byte[][][] arg1, @OriginalArg(3) char[][] arg2) {
		try {
			for (@Pc(7) int local7 = 0; local7 < arg2.length; local7++) {
				@Pc(13) char[] local13 = new char[arg0.method411()];
				for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
					local13[local15] = (char) arg0.method411();
				}
				arg2[local7] = local13;
				@Pc(37) byte[][] local37 = new byte[arg0.method411()][2];
				for (@Pc(39) int local39 = 0; local39 < local37.length; local39++) {
					local37[local39][0] = (byte) arg0.method411();
					local37[local39][1] = (byte) arg0.method411();
				}
				if (local37.length > 0) {
					arg1[local7] = local37;
				}
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("26289, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UCQYJOHJ", name = "a", descriptor = "(ILclient!RGCGKKUR;[[C)V")
	private static void method476(@OriginalArg(1) Class6_Sub1_Sub4 arg0, @OriginalArg(2) char[][] arg1) {
		try {
			if (anInt746 <= 9 && anInt746 >= 9) {
				for (@Pc(10) int local10 = 0; local10 < arg1.length; local10++) {
					@Pc(16) char[] local16 = new char[arg0.method411()];
					for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
						local16[local18] = (char) arg0.method411();
					}
					arg1[local10] = local16;
				}
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("23558, " + 9 + ", " + arg0 + ", " + arg1 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UCQYJOHJ", name = "a", descriptor = "(I[C)V")
	private static void method477(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) int local3 = 0;
			for (@Pc(15) int local15 = 0; local15 < arg0.length; local15++) {
				if (method478(arg0[local15])) {
					arg0[local3] = arg0[local15];
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
			signlink.reporterror("35008, " + 8 + ", " + arg0 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UCQYJOHJ", name = "a", descriptor = "(ZC)Z")
	private static boolean method478(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= ' ' && arg0 <= '\u007f' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("74612, " + false + ", " + arg0 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UCQYJOHJ", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
	public static String method479(@OriginalArg(0) String arg0) {
		try {
			@Pc(3) long local3 = System.currentTimeMillis();
			@Pc(6) char[] local6 = arg0.toCharArray();
			method477(local6);
			@Pc(15) String local15 = (new String(local6)).trim();
			@Pc(19) char[] local19 = local15.toLowerCase().toCharArray();
			@Pc(22) String local22 = local15.toLowerCase();
			method487(local19);
			method482(local19);
			method483(local19);
			method496(local19);
			for (@Pc(42) int local42 = 0; local42 < aStringArray6.length; local42++) {
				@Pc(52) int local52 = -1;
				while ((local52 = local22.indexOf(aStringArray6[local42], local52 + 1)) != -1) {
					@Pc(59) char[] local59 = aStringArray6[local42].toCharArray();
					for (@Pc(61) int local61 = 0; local61 < local59.length; local61++) {
						local19[local61 + local52] = local59[local61];
					}
				}
			}
			method480(local19, local15.toCharArray());
			method481(aByte19, local19);
			@Pc(103) long local103 = System.currentTimeMillis();
			return (new String(local19)).trim();
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("77028, " + arg0 + ", " + true + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UCQYJOHJ", name = "a", descriptor = "(Z[C[C)V")
	private static void method480(@OriginalArg(1) char[] arg0, @OriginalArg(2) char[] arg1) {
		try {
			for (@Pc(1) int local1 = 0; local1 < arg1.length; local1++) {
				if (arg0[local1] != '*' && method504(arg1[local1])) {
					arg0[local1] = arg1[local1];
				}
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("24693, " + false + ", " + arg0 + ", " + arg1 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UCQYJOHJ", name = "a", descriptor = "(B[C)V")
	private static void method481(@OriginalArg(0) byte arg0, @OriginalArg(1) char[] arg1) {
		try {
			if (arg0 == 4) {
				@Pc(6) boolean local6 = false;
			}
			@Pc(16) boolean local16 = true;
			for (@Pc(18) int local18 = 0; local18 < arg1.length; local18++) {
				@Pc(24) char local24 = arg1[local18];
				if (!method501(local24)) {
					local16 = true;
				} else if (local16) {
					if (method503(local24)) {
						local16 = false;
					}
				} else if (method504(local24)) {
					arg1[local18] = (char) (local24 + 'a' - 65);
				}
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("98131, " + arg0 + ", " + arg1 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UCQYJOHJ", name = "a", descriptor = "([CB)V")
	private static void method482(@OriginalArg(0) char[] arg0) {
		try {
			for (@Pc(8) int local8 = 0; local8 < 2; local8++) {
				for (@Pc(15) int local15 = aCharArrayArray1.length - 1; local15 >= 0; local15--) {
					method491(anInt748, aCharArrayArray1[local15], aByteArrayArrayArray7[local15], arg0);
				}
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("83340, " + arg0 + ", " + 40 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UCQYJOHJ", name = "b", descriptor = "(B[C)V")
	private static void method483(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(7) char[] local7 = (char[]) arg0.clone();
			@Pc(22) char[] local22 = new char[] { '(', 'a', ')' };
			method491(anInt748, local22, null, local7);
			@Pc(31) char[] local31 = (char[]) arg0.clone();
			@Pc(46) char[] local46 = new char[] { 'd', 'o', 't' };
			method491(anInt748, local46, null, local31);
			for (@Pc(56) int local56 = aCharArrayArray2.length - 1; local56 >= 0; local56--) {
				method484(aCharArrayArray2[local56], arg0, local7, local31);
			}
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("35766, " + 56 + ", " + arg0 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UCQYJOHJ", name = "a", descriptor = "([CB[C[C[C)V")
	private static void method484(@OriginalArg(0) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2, @OriginalArg(4) char[] arg3) {
		try {
			if (arg0.length <= arg1.length) {
				@Pc(24) int local24;
				for (@Pc(16) int local16 = 0; local16 <= arg1.length - arg0.length; local16 += local24) {
					@Pc(20) int local20 = local16;
					@Pc(22) int local22 = 0;
					local24 = 1;
					label58: while (true) {
						while (true) {
							if (local20 >= arg1.length) {
								break label58;
							}
							@Pc(32) char local32 = arg1[local20];
							@Pc(34) char local34 = 0;
							if (local20 + 1 < arg1.length) {
								local34 = arg1[local20 + 1];
							}
							@Pc(59) int local59;
							if (local22 < arg0.length && (local59 = method493(arg0[local22], local32, (byte) 9, local34)) > 0) {
								local20 += local59;
								local22++;
							} else {
								if (local22 == 0) {
									break label58;
								}
								@Pc(80) int local80;
								if ((local80 = method493(arg0[local22 - 1], local32, (byte) 9, local34)) > 0) {
									local20 += local80;
									if (local22 == 1) {
										local24++;
									}
								} else {
									if (local22 >= arg0.length || !method499(local32)) {
										break label58;
									}
									local20++;
								}
							}
						}
					}
					if (local22 >= arg0.length) {
						@Pc(111) boolean local111 = false;
						@Pc(117) int local117 = method485(arg1, local16, arg2);
						@Pc(125) int local125 = method486(local20 - 1, arg3, arg1, (byte) 3);
						if (local117 > 2 || local125 > 2) {
							local111 = true;
						}
						if (local111) {
							for (@Pc(137) int local137 = local16; local137 < local20; local137++) {
								arg1[local137] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("8868, " + arg0 + ", " + -58 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UCQYJOHJ", name = "a", descriptor = "([CI[CI)I")
	private static int method485(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) char[] arg2) {
		try {
			if (arg1 == 0) {
				return 2;
			}
			for (@Pc(14) int local14 = arg1 - 1; local14 >= 0 && method499(arg0[local14]); local14--) {
				if (arg0[local14] == '@') {
					return 3;
				}
			}
			@Pc(34) int local34 = 0;
			for (@Pc(38) int local38 = arg1 - 1; local38 >= 0 && method499(arg2[local38]); local38--) {
				if (arg2[local38] == '*') {
					local34++;
				}
			}
			if (local34 >= 3) {
				return 4;
			} else if (method499(arg0[arg1 - 1])) {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("15204, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -17994 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UCQYJOHJ", name = "a", descriptor = "(I[C[CB)I")
	private static int method486(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) byte arg3) {
		try {
			if (arg0 + 1 == arg2.length) {
				return 2;
			}
			@Pc(13) int local13 = arg0 + 1;
			while (true) {
				if (local13 < arg2.length && method499(arg2[local13])) {
					if (arg2[local13] != '.' && arg2[local13] != ',') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(47) int local47;
				if (aByte20 == 3) {
					@Pc(43) boolean local43 = false;
				} else {
					for (local47 = 1; local47 > 0; local47++) {
					}
				}
				local47 = 0;
				for (@Pc(58) int local58 = arg0 + 1; local58 < arg2.length && method499(arg1[local58]); local58++) {
					if (arg1[local58] == '*') {
						local47++;
					}
				}
				if (local47 >= 3) {
					return 4;
				}
				if (method499(arg2[arg0 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(96) RuntimeException local96) {
			signlink.reporterror("20098, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local96.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UCQYJOHJ", name = "a", descriptor = "([CZ)V")
	private static void method487(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(5) char[] local5 = (char[]) arg0.clone();
			@Pc(20) char[] local20 = new char[] { 'd', 'o', 't' };
			method491(anInt748, local20, null, local5);
			@Pc(38) char[] local38 = (char[]) arg0.clone();
			@Pc(61) char[] local61 = new char[] { 's', 'l', 'a', 's', 'h' };
			method491(anInt748, local61, null, local38);
			for (@Pc(68) int local68 = 0; local68 < aCharArrayArray3.length; local68++) {
				method488(aByte21, local38, local5, arg0, anIntArray196[local68], aCharArrayArray3[local68]);
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("16200, " + arg0 + ", " + false + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UCQYJOHJ", name = "a", descriptor = "(B[C[C[CI[C)V")
	private static void method488(@OriginalArg(0) byte arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) char[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) char[] arg5) {
		try {
			if (arg5.length <= arg3.length) {
				if (arg0 != 4) {
					anInt749 = 46;
				}
				@Pc(24) int local24;
				for (@Pc(16) int local16 = 0; local16 <= arg3.length - arg5.length; local16 += local24) {
					@Pc(20) int local20 = local16;
					@Pc(22) int local22 = 0;
					local24 = 1;
					label124: while (true) {
						while (true) {
							if (local20 >= arg3.length) {
								break label124;
							}
							@Pc(32) char local32 = arg3[local20];
							@Pc(34) char local34 = 0;
							if (local20 + 1 < arg3.length) {
								local34 = arg3[local20 + 1];
							}
							@Pc(59) int local59;
							if (local22 < arg5.length && (local59 = method493(arg5[local22], local32, (byte) 9, local34)) > 0) {
								local20 += local59;
								local22++;
							} else {
								if (local22 == 0) {
									break label124;
								}
								@Pc(80) int local80;
								if ((local80 = method493(arg5[local22 - 1], local32, (byte) 9, local34)) > 0) {
									local20 += local80;
									if (local22 == 1) {
										local24++;
									}
								} else {
									if (local22 >= arg5.length || !method499(local32)) {
										break label124;
									}
									local20++;
								}
							}
						}
					}
					if (local22 >= arg5.length) {
						@Pc(111) boolean local111 = false;
						@Pc(117) int local117 = method489(arg3, arg2, anInt747, local16);
						@Pc(125) int local125 = method490(arg1, arg3, local20 - 1);
						if (arg4 == 1 && local117 > 0 && local125 > 0) {
							local111 = true;
						}
						if (arg4 == 2 && (local117 > 2 && local125 > 0 || local117 > 0 && local125 > 2)) {
							local111 = true;
						}
						if (arg4 == 3 && local117 > 0 && local125 > 2) {
							local111 = true;
						}
						@Pc(168) boolean local168;
						if (arg4 == 3 && local117 > 2 && local125 > 0) {
							local168 = true;
						} else {
							local168 = false;
						}
						if (local111) {
							@Pc(175) int local175 = local16;
							@Pc(179) int local179 = local20 - 1;
							@Pc(187) boolean local187;
							@Pc(191) int local191;
							if (local117 > 2) {
								if (local117 == 4) {
									local187 = false;
									for (local191 = local16 - 1; local191 >= 0; local191--) {
										if (local187) {
											if (arg2[local191] != '*') {
												break;
											}
											local175 = local191;
										} else if (arg2[local191] == '*') {
											local175 = local191;
											local187 = true;
										}
									}
								}
								local187 = false;
								for (local191 = local175 - 1; local191 >= 0; local191--) {
									if (local187) {
										if (method499(arg3[local191])) {
											break;
										}
										local175 = local191;
									} else if (!method499(arg3[local191])) {
										local187 = true;
										local175 = local191;
									}
								}
							}
							if (local125 > 2) {
								if (local125 == 4) {
									local187 = false;
									for (local191 = local179 + 1; local191 < arg3.length; local191++) {
										if (local187) {
											if (arg1[local191] != '*') {
												break;
											}
											local179 = local191;
										} else if (arg1[local191] == '*') {
											local179 = local191;
											local187 = true;
										}
									}
								}
								local187 = false;
								for (local191 = local179 + 1; local191 < arg3.length; local191++) {
									if (local187) {
										if (method499(arg3[local191])) {
											break;
										}
										local179 = local191;
									} else if (!method499(arg3[local191])) {
										local187 = true;
										local179 = local191;
									}
								}
							}
							for (@Pc(325) int local325 = local175; local325 <= local179; local325++) {
								arg3[local325] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(348) RuntimeException local348) {
			signlink.reporterror("62343, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local348.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UCQYJOHJ", name = "a", descriptor = "([C[CII)I")
	private static int method489(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg3 == 0) {
				return 2;
			}
			@Pc(9) int local9 = arg3 - 1;
			while (true) {
				if (local9 >= 0 && method499(arg0[local9])) {
					if (arg0[local9] != ',' && arg0[local9] != '.') {
						local9--;
						continue;
					}
					return 3;
				}
				@Pc(34) int local34 = 0;
				for (@Pc(38) int local38 = arg3 - 1; local38 >= 0 && method499(arg1[local38]); local38--) {
					if (arg1[local38] == '*') {
						local34++;
					}
				}
				if (arg2 >= 0) {
					return anInt745;
				}
				if (local34 >= 3) {
					return 4;
				}
				if (method499(arg0[arg3 - 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("57400, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UCQYJOHJ", name = "a", descriptor = "([CB[CI)I")
	private static int method490(@OriginalArg(0) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 + 1 == arg1.length) {
				return 2;
			}
			@Pc(13) int local13 = arg2 + 1;
			while (true) {
				if (local13 < arg1.length && method499(arg1[local13])) {
					if (arg1[local13] != '\\' && arg1[local13] != '/') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(40) int local40 = 0;
				for (@Pc(49) int local49 = arg2 + 1; local49 < arg1.length && method499(arg0[local49]); local49++) {
					if (arg0[local49] == '*') {
						local40++;
					}
				}
				if (local40 >= 5) {
					return 4;
				}
				if (method499(arg1[arg2 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("94864, " + arg0 + ", " + 49 + ", " + arg1 + ", " + arg2 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UCQYJOHJ", name = "a", descriptor = "(I[C[[B[C)V")
	private static void method491(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) char[] arg3) {
		try {
			if (arg1.length <= arg3.length) {
				@Pc(13) int local13;
				while (arg0 >= 0) {
					for (local13 = 1; local13 > 0; local13++) {
					}
				}
				@Pc(32) int local32;
				for (local13 = 0; local13 <= arg3.length - arg1.length; local13 += local32) {
					@Pc(26) int local26 = local13;
					@Pc(28) int local28 = 0;
					@Pc(30) int local30 = 0;
					local32 = 1;
					@Pc(34) boolean local34 = false;
					@Pc(36) boolean local36 = false;
					@Pc(38) boolean local38 = false;
					@Pc(46) char var13;
					@Pc(48) char var14;
					label168: while (true) {
						while (true) {
							if (local26 >= arg3.length || local36 && local38) {
								break label168;
							}
							var13 = arg3[local26];
							var14 = '\u0000';
							if (local26 + 1 < arg3.length) {
								var14 = arg3[local26 + 1];
							}
							@Pc(73) int local73;
							if (local28 < arg1.length && (local73 = method494(var13, arg1[local28], var14)) > 0) {
								if (local73 == 1 && method502(var13)) {
									local36 = true;
								}
								if (local73 == 2 && (method502(var13) || method502(var14))) {
									local36 = true;
								}
								local26 += local73;
								local28++;
							} else {
								if (local28 == 0) {
									break label168;
								}
								@Pc(116) int local116;
								if ((local116 = method494(var13, arg1[local28 - 1], var14)) > 0) {
									local26 += local116;
									if (local28 == 1) {
										local32++;
									}
								} else {
									if (local28 >= arg1.length || !method500(var13)) {
										break label168;
									}
									if (method499(var13) && var13 != '\'') {
										local34 = true;
									}
									if (method502(var13)) {
										local38 = true;
									}
									local26++;
									local30++;
									if (local30 * 100 / (local26 - local13) > 90) {
										break label168;
									}
								}
							}
						}
					}
					if (local28 >= arg1.length && (!local36 || !local38)) {
						@Pc(181) boolean local181 = true;
						@Pc(277) int local277;
						if (local34) {
							@Pc(227) boolean local227 = false;
							@Pc(229) boolean local229 = false;
							if (local13 - 1 < 0 || method499(arg3[local13 - 1]) && arg3[local13 - 1] != '\'') {
								local227 = true;
							}
							if (local26 >= arg3.length || method499(arg3[local26]) && arg3[local26] != '\'') {
								local229 = true;
							}
							if (!local227 || !local229) {
								@Pc(273) boolean local273 = false;
								local277 = local13 - 2;
								if (local227) {
									local277 = local13;
								}
								while (!local273 && local277 < local26) {
									if (local277 >= 0 && (!method499(arg3[local277]) || arg3[local277] == '\'')) {
										@Pc(299) char[] local299 = new char[3];
										@Pc(301) int local301;
										for (local301 = 0; local301 < 3 && local277 + local301 < arg3.length && (!method499(arg3[local277 + local301]) || arg3[local277 + local301] == '\''); local301++) {
											local299[local301] = arg3[local277 + local301];
										}
										@Pc(339) boolean local339 = true;
										if (local301 == 0) {
											local339 = false;
										}
										if (local301 < 3 && local277 - 1 >= 0 && (!method499(arg3[local277 - 1]) || arg3[local277 - 1] == '\'')) {
											local339 = false;
										}
										if (local339 && !method505(local299)) {
											local273 = true;
										}
									}
									local277++;
								}
								if (!local273) {
									local181 = false;
								}
							}
						} else {
							var13 = ' ';
							if (local13 - 1 >= 0) {
								var13 = arg3[local13 - 1];
							}
							var14 = ' ';
							if (local26 < arg3.length) {
								var14 = arg3[local26];
							}
							@Pc(209) byte local209 = method495(var13);
							@Pc(213) byte local213 = method495(var14);
							if (arg2 != null && method492(local209, local213, arg2)) {
								local181 = false;
							}
						}
						if (local181) {
							@Pc(389) int local389 = 0;
							@Pc(391) int local391 = 0;
							@Pc(393) int local393 = -1;
							for (local277 = local13; local277 < local26; local277++) {
								if (method502(arg3[local277])) {
									local389++;
								} else if (method501(arg3[local277])) {
									local391++;
									local393 = local277;
								}
							}
							if (local393 > -1) {
								local389 -= local26 - local393 - 1;
							}
							if (local389 <= local391) {
								for (@Pc(435) int local435 = local13; local435 < local26; local435++) {
									arg3[local435] = '*';
								}
							} else {
								local32 = 1;
							}
						}
					}
				}
			}
		} catch (@Pc(462) RuntimeException local462) {
			signlink.reporterror("48053, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local462.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UCQYJOHJ", name = "a", descriptor = "(BB[[BZ)Z")
	private static boolean method492(@OriginalArg(0) byte arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte[][] arg2) {
		try {
			@Pc(1) int local1 = 0;
			if (arg2[0][0] == arg0 && arg2[0][1] == arg1) {
				return true;
			}
			@Pc(30) int local30 = arg2.length - 1;
			if (arg2[local30][0] == arg0 && arg2[local30][1] == arg1) {
				return true;
			}
			do {
				@Pc(52) int local52 = (local1 + local30) / 2;
				if (arg2[local52][0] == arg0 && arg2[local52][1] == arg1) {
					return true;
				}
				if (arg0 < arg2[local52][0] || arg0 == arg2[local52][0] && arg1 < arg2[local52][1]) {
					local30 = local52;
				} else {
					local1 = local52;
				}
			} while (local1 != local30 && local1 + 1 != local30);
			return false;
		} catch (@Pc(106) RuntimeException local106) {
			signlink.reporterror("2591, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + local106.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UCQYJOHJ", name = "a", descriptor = "(CCBC)I")
	private static int method493(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) char arg3) {
		try {
			@Pc(4) boolean local4 = false;
			if (arg0 == arg1) {
				return 1;
			} else if (arg0 == 'o' && arg1 == '0') {
				return 1;
			} else if (arg0 == 'o' && arg1 == '(' && arg3 == ')') {
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
			signlink.reporterror("90308, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UCQYJOHJ", name = "a", descriptor = "(CCCI)I")
	private static int method494(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(2) char arg2) {
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
		} catch (@Pc(512) RuntimeException local512) {
			signlink.reporterror("26225, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -170 + ", " + local512.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UCQYJOHJ", name = "a", descriptor = "(IC)B")
	private static byte method495(@OriginalArg(1) char arg0) {
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
			signlink.reporterror("92712, " + 7 + ", " + arg0 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UCQYJOHJ", name = "a", descriptor = "([CI)V")
	private static void method496(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			@Pc(9) int local9 = 0;
			while (true) {
				do {
					@Pc(113) int local113;
					if ((local113 = method497(arg0, local5)) == -1) {
						return;
					}
					@Pc(18) boolean local18 = false;
					for (@Pc(20) int local20 = local5; local20 >= 0 && local20 < local113 && !local18; local20++) {
						if (!method499(arg0[local20]) && !method500(arg0[local20])) {
							local18 = true;
						}
					}
					if (local18) {
						local7 = 0;
					}
					if (local7 == 0) {
						local9 = local113;
					}
					local5 = method498((byte) 7, local113, arg0);
					@Pc(59) int local59 = 0;
					for (@Pc(61) int local61 = local113; local61 < local5; local61++) {
						local59 = local59 * 10 + arg0[local61] - 48;
					}
					if (local59 <= 255 && local5 - local113 <= 8) {
						local7++;
					} else {
						local7 = 0;
					}
				} while (local7 != 4);
				for (@Pc(95) int local95 = local9; local95 < local5; local95++) {
					arg0[local95] = '*';
				}
				local7 = 0;
			}
		} catch (@Pc(117) RuntimeException local117) {
			signlink.reporterror("53885, " + arg0 + ", " + 3 + ", " + local117.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UCQYJOHJ", name = "a", descriptor = "([CIZ)I")
	private static int method497(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1) {
		try {
			for (@Pc(1) int local1 = arg1; local1 < arg0.length && local1 >= 0; local1++) {
				if (arg0[local1] >= '0' && arg0[local1] <= '9') {
					return local1;
				}
			}
			return -1;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("69693, " + arg0 + ", " + arg1 + ", " + false + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UCQYJOHJ", name = "a", descriptor = "(BI[C)I")
	private static int method498(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) char[] arg2) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(12) int local12 = arg1;
			while (true) {
				if (local12 < arg2.length && local12 >= 0) {
					if (arg2[local12] >= '0' && arg2[local12] <= '9') {
						local12++;
						continue;
					}
					return local12;
				}
				return arg2.length;
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("8235, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UCQYJOHJ", name = "b", descriptor = "(IC)Z")
	private static boolean method499(@OriginalArg(1) char arg0) {
		try {
			return !method501(arg0) && !method502(arg0);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("14491, " + 0 + ", " + arg0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UCQYJOHJ", name = "a", descriptor = "(CI)Z")
	private static boolean method500(@OriginalArg(0) char arg0) {
		try {
			if (arg0 >= 'a' && arg0 <= 'z') {
				return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
			} else {
				return true;
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("96821, " + arg0 + ", " + 0 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UCQYJOHJ", name = "c", descriptor = "(IC)Z")
	private static boolean method501(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("48049, " + 0 + ", " + arg0 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UCQYJOHJ", name = "a", descriptor = "(CZ)Z")
	private static boolean method502(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= '0' && arg0 <= '9';
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("75495, " + arg0 + ", " + true + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UCQYJOHJ", name = "d", descriptor = "(IC)Z")
	private static boolean method503(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z';
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("72544, " + 0 + ", " + arg0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UCQYJOHJ", name = "b", descriptor = "(ZC)Z")
	private static boolean method504(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("63075, " + true + ", " + arg0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UCQYJOHJ", name = "b", descriptor = "([CB)Z")
	private static boolean method505(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				if (!method502(arg0[local5]) && arg0[local5] != '\u0000') {
					local3 = false;
				}
			}
			if (local3) {
				return true;
			}
			@Pc(32) int local32 = method506(arg0);
			@Pc(41) int local41 = 0;
			@Pc(46) int local46 = anIntArray195.length - 1;
			if (local32 == anIntArray195[0] || local32 == anIntArray195[local46]) {
				return true;
			}
			do {
				@Pc(64) int local64 = (local41 + local46) / 2;
				if (local32 == anIntArray195[local64]) {
					return true;
				}
				if (local32 < anIntArray195[local64]) {
					local46 = local64;
				} else {
					local41 = local64;
				}
			} while (local41 != local46 && local41 + 1 != local46);
			return false;
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("93537, " + arg0 + ", " + -31 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UCQYJOHJ", name = "b", descriptor = "([CI)I")
	private static int method506(@OriginalArg(0) char[] arg0) {
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
			signlink.reporterror("41378, " + arg0 + ", " + 6329 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}
}
