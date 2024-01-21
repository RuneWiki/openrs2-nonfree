import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!mc")
public final class Class25 {

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
	private static int anInt629;

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
	private static int anInt630;

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "Z")
	private static boolean aBoolean138;

	@OriginalMember(owner = "client!mc", name = "k", descriptor = "[I")
	private static int[] anIntArray195;

	@OriginalMember(owner = "client!mc", name = "l", descriptor = "[[C")
	private static char[][] aCharArrayArray1;

	@OriginalMember(owner = "client!mc", name = "m", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!mc", name = "n", descriptor = "[[C")
	private static char[][] aCharArrayArray2;

	@OriginalMember(owner = "client!mc", name = "o", descriptor = "[[C")
	private static char[][] aCharArrayArray3;

	@OriginalMember(owner = "client!mc", name = "p", descriptor = "[I")
	private static int[] anIntArray196;

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "Z")
	private static boolean aBoolean137 = true;

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "B")
	private static byte aByte35 = -105;

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "B")
	private static byte aByte36 = -40;

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "B")
	private static byte aByte37 = 7;

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "B")
	private static byte aByte38 = 2;

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
	private static int anInt631 = -142;

	@OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
	private static int anInt632 = -25272;

	@OriginalMember(owner = "client!mc", name = "q", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray11 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet" };

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!ub;)V")
	public static void method414(@OriginalArg(0) Class39 arg0) {
		@Pc(11) Class1_Sub3_Sub3 local11 = new Class1_Sub3_Sub3((byte) 64, arg0.method536(null, "fragmentsenc.txt"));
		@Pc(21) Class1_Sub3_Sub3 local21 = new Class1_Sub3_Sub3((byte) 64, arg0.method536(null, "badenc.txt"));
		@Pc(31) Class1_Sub3_Sub3 local31 = new Class1_Sub3_Sub3((byte) 64, arg0.method536(null, "domainenc.txt"));
		@Pc(41) Class1_Sub3_Sub3 local41 = new Class1_Sub3_Sub3((byte) 64, arg0.method536(null, "tldlist.txt"));
		method415(local11, local21, local31, local41);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!kb;Lclient!kb;Lclient!kb;Lclient!kb;)V")
	private static void method415(@OriginalArg(0) Class1_Sub3_Sub3 arg0, @OriginalArg(1) Class1_Sub3_Sub3 arg1, @OriginalArg(2) Class1_Sub3_Sub3 arg2, @OriginalArg(3) Class1_Sub3_Sub3 arg3) {
		method417(581, arg1);
		method418(arg2);
		method419(arg0);
		method416(214, arg3);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILclient!kb;)V")
	private static void method416(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub3_Sub3 arg1) {
		try {
			@Pc(4) int local4 = arg1.method396();
			aCharArrayArray3 = new char[local4][];
			@Pc(11) boolean local11 = false;
			anIntArray196 = new int[local4];
			for (@Pc(16) int local16 = 0; local16 < local4; local16++) {
				anIntArray196[local16] = arg1.method391();
				@Pc(27) char[] local27 = new char[arg1.method391()];
				for (@Pc(29) int local29 = 0; local29 < local27.length; local29++) {
					local27[local29] = (char) arg1.method391();
				}
				aCharArrayArray3[local16] = local27;
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("65716, " + arg0 + ", " + arg1 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(ILclient!kb;)V")
	private static void method417(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub3_Sub3 arg1) {
		try {
			@Pc(2) int local2 = arg1.method396();
			aCharArrayArray1 = new char[local2][];
			aByteArrayArrayArray8 = new byte[local2][][];
			method420(aCharArrayArray1, aByteArrayArrayArray8, arg1);
			@Pc(17) boolean local17 = false;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("63662, " + arg0 + ", " + arg1 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(ILclient!kb;)V")
	private static void method418(@OriginalArg(1) Class1_Sub3_Sub3 arg0) {
		try {
			@Pc(2) int local2 = arg0.method396();
			aCharArrayArray2 = new char[local2][];
			method421(arg0, aCharArrayArray2);
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("96189, " + 665 + ", " + arg0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!kb;I)V")
	private static void method419(@OriginalArg(0) Class1_Sub3_Sub3 arg0) {
		try {
			anIntArray195 = new int[arg0.method396()];
			for (@Pc(5) int local5 = 0; local5 < anIntArray195.length; local5++) {
				anIntArray195[local5] = arg0.method393();
			}
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("21384, " + arg0 + ", " + 557 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I[[C[[[BLclient!kb;)V")
	private static void method420(@OriginalArg(1) char[][] arg0, @OriginalArg(2) byte[][][] arg1, @OriginalArg(3) Class1_Sub3_Sub3 arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
				@Pc(9) char[] local9 = new char[arg2.method391()];
				for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
					local9[local11] = (char) arg2.method391();
				}
				arg0[local3] = local9;
				@Pc(33) byte[][] local33 = new byte[arg2.method391()][2];
				for (@Pc(35) int local35 = 0; local35 < local33.length; local35++) {
					local33[local35][0] = (byte) arg2.method391();
					local33[local35][1] = (byte) arg2.method391();
				}
				if (local33.length > 0) {
					arg1[local3] = local33;
				}
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("41356, " + -139 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!kb;I[[C)V")
	private static void method421(@OriginalArg(0) Class1_Sub3_Sub3 arg0, @OriginalArg(2) char[][] arg1) {
		try {
			for (@Pc(12) int local12 = 0; local12 < arg1.length; local12++) {
				@Pc(18) char[] local18 = new char[arg0.method391()];
				for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
					local18[local20] = (char) arg0.method391();
				}
				arg1[local12] = local18;
			}
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("87740, " + arg0 + ", " + 4932 + ", " + arg1 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I[C)V")
	private static void method422(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(10) int local10 = 0;
			for (@Pc(12) int local12 = 0; local12 < arg0.length; local12++) {
				if (method423(arg0[local12])) {
					arg0[local10] = arg0[local12];
				} else {
					arg0[local10] = ' ';
				}
				if (local10 == 0 || arg0[local10] != ' ' || arg0[local10 - 1] != ' ') {
					local10++;
				}
			}
			for (@Pc(54) int local54 = local10; local54 < arg0.length; local54++) {
				arg0[local54] = ' ';
			}
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("32355, " + 5 + ", " + arg0 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IC)Z")
	private static boolean method423(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= ' ' && arg0 <= '\u007f' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("32503, " + 24073 + ", " + arg0 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method424(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) long local3 = System.currentTimeMillis();
			@Pc(6) char[] local6 = arg0.toCharArray();
			method422(local6);
			@Pc(15) String local15 = (new String(local6)).trim();
			@Pc(19) char[] local19 = local15.toLowerCase().toCharArray();
			@Pc(23) boolean local23 = false;
			@Pc(26) String local26 = local15.toLowerCase();
			method432(local19);
			method427(local19);
			method428(local19);
			method441(local19);
			for (@Pc(40) int local40 = 0; local40 < aStringArray11.length; local40++) {
				@Pc(49) int local49 = -1;
				while ((local49 = local26.indexOf(aStringArray11[local40], local49 + 1)) != -1) {
					@Pc(56) char[] local56 = aStringArray11[local40].toCharArray();
					for (@Pc(58) int local58 = 0; local58 < local56.length; local58++) {
						local19[local58 + local49] = local56[local58];
					}
				}
			}
			method425(local19, local15.toCharArray());
			method426(local19);
			@Pc(100) long local100 = System.currentTimeMillis();
			return (new String(local19)).trim();
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("87014, " + arg0 + ", " + arg1 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "([C[CZ)V")
	private static void method425(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1) {
		try {
			for (@Pc(9) int local9 = 0; local9 < arg1.length; local9++) {
				if (arg0[local9] != '*' && method449(arg1[local9])) {
					arg0[local9] = arg1[local9];
				}
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("22713, " + arg0 + ", " + arg1 + ", " + true + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(I[C)V")
	private static void method426(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(7) boolean local7 = true;
			for (@Pc(9) int local9 = 0; local9 < arg0.length; local9++) {
				@Pc(15) char local15 = arg0[local9];
				if (!method446(local15)) {
					local7 = true;
				} else if (local7) {
					if (method448(local15)) {
						local7 = false;
					}
				} else if (method449(local15)) {
					arg0[local9] = (char) (local15 + 'a' - 65);
				}
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("70005, " + 0 + ", " + arg0 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "([CB)V")
	private static void method427(@OriginalArg(0) char[] arg0) {
		try {
			for (@Pc(13) int local13 = 0; local13 < 2; local13++) {
				for (@Pc(20) int local20 = aCharArrayArray1.length - 1; local20 >= 0; local20--) {
					method436(aCharArrayArray1[local20], arg0, aBoolean137, aByteArrayArrayArray8[local20]);
				}
			}
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("93732, " + arg0 + ", " + 104 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(I[C)V")
	private static void method428(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(18) char[] local18 = new char[] { '(', 'a', ')' };
			method436(local18, local3, aBoolean137, null);
			@Pc(27) char[] local27 = (char[]) arg0.clone();
			@Pc(42) char[] local42 = new char[] { 'd', 'o', 't' };
			method436(local42, local27, aBoolean137, null);
			for (@Pc(52) int local52 = aCharArrayArray2.length - 1; local52 >= 0; local52--) {
				method429(arg0, local27, anInt630, local3, aCharArrayArray2[local52]);
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("62710, " + 0 + ", " + arg0 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "([C[CI[C[C)V")
	private static void method429(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) char[] arg3, @OriginalArg(4) char[] arg4) {
		try {
			if (arg4.length <= arg0.length) {
				@Pc(13) int local13;
				if (arg2 != 0) {
					for (local13 = 1; local13 > 0; local13++) {
					}
				}
				@Pc(28) int local28;
				for (local13 = 0; local13 <= arg0.length - arg4.length; local13 += local28) {
					@Pc(24) int local24 = local13;
					@Pc(26) int local26 = 0;
					local28 = 1;
					label61: while (true) {
						while (true) {
							if (local24 >= arg0.length) {
								break label61;
							}
							@Pc(36) char local36 = arg0[local24];
							@Pc(38) char local38 = 0;
							if (local24 + 1 < arg0.length) {
								local38 = arg0[local24 + 1];
							}
							@Pc(63) int local63;
							if (local26 < arg4.length && (local63 = method438(local36, local38, arg4[local26])) > 0) {
								local24 += local63;
								local26++;
							} else {
								if (local26 == 0) {
									break label61;
								}
								@Pc(84) int local84;
								if ((local84 = method438(local36, local38, arg4[local26 - 1])) > 0) {
									local24 += local84;
									if (local26 == 1) {
										local28++;
									}
								} else {
									if (local26 >= arg4.length || !method444(local36)) {
										break label61;
									}
									local24++;
								}
							}
						}
					}
					if (local26 >= arg4.length) {
						@Pc(115) boolean local115 = false;
						@Pc(121) int local121 = method430(arg3, arg0, local13);
						@Pc(129) int local129 = method431(local24 - 1, arg1, arg0);
						if (local121 > 2 || local129 > 2) {
							local115 = true;
						}
						if (local115) {
							for (@Pc(141) int local141 = local13; local141 < local24; local141++) {
								arg0[local141] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(164) RuntimeException local164) {
			signlink.reporterror("29584, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local164.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "([CB[CI)I")
	private static int method430(@OriginalArg(0) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 == 0) {
				return 2;
			}
			for (@Pc(9) int local9 = arg2 - 1; local9 >= 0 && method444(arg1[local9]); local9--) {
				if (arg1[local9] == '@') {
					return 3;
				}
			}
			@Pc(29) int local29 = 0;
			for (@Pc(38) int local38 = arg2 - 1; local38 >= 0 && method444(arg0[local38]); local38--) {
				if (arg0[local38] == '*') {
					local29++;
				}
			}
			if (local29 >= 3) {
				return 4;
			} else if (method444(arg1[arg2 - 1])) {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("61233, " + arg0 + ", " + -2 + ", " + arg1 + ", " + arg2 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I[C[CB)I")
	private static int method431(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2) {
		try {
			if (arg0 + 1 == arg2.length) {
				return 2;
			}
			@Pc(13) int local13 = arg0 + 1;
			while (true) {
				if (local13 < arg2.length && method444(arg2[local13])) {
					if (arg2[local13] != '.' && arg2[local13] != ',') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(40) int local40 = 0;
				for (@Pc(44) int local44 = arg0 + 1; local44 < arg2.length && method444(arg1[local44]); local44++) {
					if (arg1[local44] == '*') {
						local40++;
					}
				}
				if (local40 >= 3) {
					return 4;
				}
				if (method444(arg2[arg0 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("61937, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -52 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(B[C)V")
	private static void method432(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(12) char[] local12 = (char[]) arg0.clone();
			@Pc(27) char[] local27 = new char[] { 'd', 'o', 't' };
			method436(local27, local12, aBoolean137, null);
			@Pc(36) char[] local36 = (char[]) arg0.clone();
			@Pc(59) char[] local59 = new char[] { 's', 'l', 'a', 's', 'h' };
			method436(local59, local36, aBoolean137, null);
			for (@Pc(66) int local66 = 0; local66 < aCharArrayArray3.length; local66++) {
				method433(aCharArrayArray3[local66], local12, arg0, local36, anIntArray196[local66]);
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("44091, " + 77 + ", " + arg0 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "([CB[C[C[CI)V")
	private static void method433(@OriginalArg(0) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2, @OriginalArg(4) char[] arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0.length <= arg2.length) {
				@Pc(24) int local24;
				for (@Pc(16) int local16 = 0; local16 <= arg2.length - arg0.length; local16 += local24) {
					@Pc(20) int local20 = local16;
					@Pc(22) int local22 = 0;
					local24 = 1;
					label120: while (true) {
						while (true) {
							if (local20 >= arg2.length) {
								break label120;
							}
							@Pc(32) char local32 = arg2[local20];
							@Pc(34) char local34 = 0;
							if (local20 + 1 < arg2.length) {
								local34 = arg2[local20 + 1];
							}
							@Pc(59) int local59;
							if (local22 < arg0.length && (local59 = method438(local32, local34, arg0[local22])) > 0) {
								local20 += local59;
								local22++;
							} else {
								if (local22 == 0) {
									break label120;
								}
								@Pc(80) int local80;
								if ((local80 = method438(local32, local34, arg0[local22 - 1])) > 0) {
									local20 += local80;
									if (local22 == 1) {
										local24++;
									}
								} else {
									if (local22 >= arg0.length || !method444(local32)) {
										break label120;
									}
									local20++;
								}
							}
						}
					}
					if (local22 >= arg0.length) {
						@Pc(111) boolean local111 = false;
						@Pc(117) int local117 = method434(arg2, arg1, local16);
						@Pc(125) int local125 = method435(local20 - 1, arg2, arg3);
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
											if (arg1[local191] != '*') {
												break;
											}
											local175 = local191;
										} else if (arg1[local191] == '*') {
											local175 = local191;
											local187 = true;
										}
									}
								}
								local187 = false;
								for (local191 = local175 - 1; local191 >= 0; local191--) {
									if (local187) {
										if (method444(arg2[local191])) {
											break;
										}
										local175 = local191;
									} else if (!method444(arg2[local191])) {
										local187 = true;
										local175 = local191;
									}
								}
							}
							if (local125 > 2) {
								if (local125 == 4) {
									local187 = false;
									for (local191 = local179 + 1; local191 < arg2.length; local191++) {
										if (local187) {
											if (arg3[local191] != '*') {
												break;
											}
											local179 = local191;
										} else if (arg3[local191] == '*') {
											local179 = local191;
											local187 = true;
										}
									}
								}
								local187 = false;
								for (local191 = local179 + 1; local191 < arg2.length; local191++) {
									if (local187) {
										if (method444(arg2[local191])) {
											break;
										}
										local179 = local191;
									} else if (!method444(arg2[local191])) {
										local187 = true;
										local179 = local191;
									}
								}
							}
							for (@Pc(325) int local325 = local175; local325 <= local179; local325++) {
								arg2[local325] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(348) RuntimeException local348) {
			signlink.reporterror("34910, " + arg0 + ", " + -119 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local348.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I[C[CI)I")
	private static int method434(@OriginalArg(1) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 == 0) {
				return 2;
			}
			@Pc(9) int local9 = arg2 - 1;
			while (true) {
				if (local9 >= 0 && method444(arg0[local9])) {
					if (arg0[local9] != ',' && arg0[local9] != '.') {
						local9--;
						continue;
					}
					return 3;
				}
				@Pc(34) int local34 = 0;
				for (@Pc(38) int local38 = arg2 - 1; local38 >= 0 && method444(arg1[local38]); local38--) {
					if (arg1[local38] == '*') {
						local34++;
					}
				}
				if (local34 >= 3) {
					return 4;
				}
				if (method444(arg0[arg2 - 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("38178, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BI[C[C)I")
	private static int method435(@OriginalArg(1) int arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg0 + 1 == arg1.length) {
				return 2;
			}
			@Pc(13) int local13 = arg0 + 1;
			while (true) {
				if (local13 < arg1.length && method444(arg1[local13])) {
					if (arg1[local13] != '\\' && arg1[local13] != '/') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(40) int local40 = 0;
				for (@Pc(49) int local49 = arg0 + 1; local49 < arg1.length && method444(arg2[local49]); local49++) {
					if (arg2[local49] == '*') {
						local40++;
					}
				}
				if (local40 >= 5) {
					return 4;
				}
				if (method444(arg1[arg0 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("3904, " + 9 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "([C[CZ[[B)V")
	private static void method436(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) byte[][] arg3) {
		try {
			if (!arg2) {
				anInt630 = -386;
			}
			if (arg0.length <= arg1.length) {
				@Pc(25) int local25;
				for (@Pc(15) int local15 = 0; local15 <= arg1.length - arg0.length; local15 += local25) {
					@Pc(19) int local19 = local15;
					@Pc(21) int local21 = 0;
					@Pc(23) int local23 = 0;
					local25 = 1;
					@Pc(27) boolean local27 = false;
					@Pc(29) boolean local29 = false;
					@Pc(31) boolean local31 = false;
					@Pc(39) char var13;
					@Pc(41) char var14;
					label163: while (true) {
						while (true) {
							if (local19 >= arg1.length || local29 && local31) {
								break label163;
							}
							var13 = arg1[local19];
							var14 = '\u0000';
							if (local19 + 1 < arg1.length) {
								var14 = arg1[local19 + 1];
							}
							@Pc(66) int local66;
							if (local21 < arg0.length && (local66 = method439(arg0[local21], var13, var14)) > 0) {
								if (local66 == 1 && method447(18, var13)) {
									local29 = true;
								}
								if (local66 == 2 && (method447(18, var13) || method447(18, var14))) {
									local29 = true;
								}
								local19 += local66;
								local21++;
							} else {
								if (local21 == 0) {
									break label163;
								}
								@Pc(109) int local109;
								if ((local109 = method439(arg0[local21 - 1], var13, var14)) > 0) {
									local19 += local109;
									if (local21 == 1) {
										local25++;
									}
								} else {
									if (local21 >= arg0.length || !method445(var13)) {
										break label163;
									}
									if (method444(var13) && var13 != '\'') {
										local27 = true;
									}
									if (method447(18, var13)) {
										local31 = true;
									}
									local19++;
									local23++;
									if (local23 * 100 / (local19 - local15) > 90) {
										break label163;
									}
								}
							}
						}
					}
					if (local21 >= arg0.length && (!local29 || !local31)) {
						@Pc(174) boolean local174 = true;
						@Pc(270) int local270;
						if (local27) {
							@Pc(220) boolean local220 = false;
							@Pc(222) boolean local222 = false;
							if (local15 - 1 < 0 || method444(arg1[local15 - 1]) && arg1[local15 - 1] != '\'') {
								local220 = true;
							}
							if (local19 >= arg1.length || method444(arg1[local19]) && arg1[local19] != '\'') {
								local222 = true;
							}
							if (!local220 || !local222) {
								@Pc(266) boolean local266 = false;
								local270 = local15 - 2;
								if (local220) {
									local270 = local15;
								}
								while (!local266 && local270 < local19) {
									if (local270 >= 0 && (!method444(arg1[local270]) || arg1[local270] == '\'')) {
										@Pc(292) char[] local292 = new char[3];
										@Pc(294) int local294;
										for (local294 = 0; local294 < 3 && local270 + local294 < arg1.length && (!method444(arg1[local270 + local294]) || arg1[local270 + local294] == '\''); local294++) {
											local292[local294] = arg1[local270 + local294];
										}
										@Pc(332) boolean local332 = true;
										if (local294 == 0) {
											local332 = false;
										}
										if (local294 < 3 && local270 - 1 >= 0 && (!method444(arg1[local270 - 1]) || arg1[local270 - 1] == '\'')) {
											local332 = false;
										}
										if (local332 && !method450(aByte38, local292)) {
											local266 = true;
										}
									}
									local270++;
								}
								if (!local266) {
									local174 = false;
								}
							}
						} else {
							var13 = ' ';
							if (local15 - 1 >= 0) {
								var13 = arg1[local15 - 1];
							}
							var14 = ' ';
							if (local19 < arg1.length) {
								var14 = arg1[local19];
							}
							@Pc(202) byte local202 = method440(var13);
							@Pc(206) byte local206 = method440(var14);
							if (arg3 != null && method437(arg3, local202, local206)) {
								local174 = false;
							}
						}
						if (local174) {
							@Pc(382) int local382 = 0;
							@Pc(384) int local384 = 0;
							for (@Pc(386) int local386 = local15; local386 < local19; local386++) {
								if (method447(18, arg1[local386])) {
									local382++;
								} else if (method446(arg1[local386])) {
									local384++;
								}
							}
							if (local382 <= local384) {
								for (local270 = local15; local270 < local19; local270++) {
									arg1[local270] = '*';
								}
							}
						}
					}
				}
			}
		} catch (@Pc(436) RuntimeException local436) {
			signlink.reporterror("58, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local436.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "([[BBBI)Z")
	private static boolean method437(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2) {
		try {
			@Pc(3) int local3 = 0;
			if (arg0[0][0] == arg1 && arg0[0][1] == arg2) {
				return true;
			}
			@Pc(24) int local24 = arg0.length - 1;
			if (arg0[local24][0] == arg1 && arg0[local24][1] == arg2) {
				return true;
			}
			do {
				@Pc(56) int local56 = (local3 + local24) / 2;
				if (arg0[local56][0] == arg1 && arg0[local56][1] == arg2) {
					return true;
				}
				if (arg1 < arg0[local56][0] || arg1 == arg0[local56][0] && arg2 < arg0[local56][1]) {
					local24 = local56;
				} else {
					local3 = local56;
				}
			} while (local3 != local24 && local3 + 1 != local24);
			return false;
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("55159, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -36293 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(CZCC)I")
	private static int method438(@OriginalArg(0) char arg0, @OriginalArg(2) char arg1, @OriginalArg(3) char arg2) {
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
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("76070, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(CCCB)I")
	private static int method439(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(2) char arg2) {
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
		} catch (@Pc(498) RuntimeException local498) {
			signlink.reporterror("70376, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -33 + ", " + local498.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(CZ)B")
	private static byte method440(@OriginalArg(0) char arg0) {
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
			signlink.reporterror("69353, " + arg0 + ", " + true + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "([CB)V")
	private static void method441(@OriginalArg(0) char[] arg0) {
		try {
			if (aByte35 == -105) {
				@Pc(9) int local9 = 0;
				@Pc(11) int local11 = 0;
				@Pc(13) int local13 = 0;
				while (true) {
					do {
						@Pc(112) int local112;
						if ((local112 = method442(local9, arg0)) == -1) {
							return;
						}
						@Pc(17) boolean local17 = false;
						for (@Pc(19) int local19 = local9; local19 >= 0 && local19 < local112 && !local17; local19++) {
							if (!method444(arg0[local19]) && !method445(arg0[local19])) {
								local17 = true;
							}
						}
						if (local17) {
							local11 = 0;
						}
						if (local11 == 0) {
							local13 = local112;
						}
						local9 = method443(local112, arg0);
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
			}
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("76424, " + arg0 + ", " + -105 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(II[C)I")
	private static int method442(@OriginalArg(0) int arg0, @OriginalArg(2) char[] arg1) {
		try {
			for (@Pc(5) int local5 = arg0; local5 < arg1.length && local5 >= 0; local5++) {
				if (arg1[local5] >= '0' && arg1[local5] <= '9') {
					return local5;
				}
			}
			return -1;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("62851, " + arg0 + ", " + 715 + ", " + arg1 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I[CZ)I")
	private static int method443(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1) {
		try {
			@Pc(1) int local1 = arg0;
			while (true) {
				if (local1 < arg1.length && local1 >= 0) {
					if (arg1[local1] >= '0' && arg1[local1] <= '9') {
						local1++;
						continue;
					}
					return local1;
				}
				return arg1.length;
			}
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("19787, " + arg0 + ", " + arg1 + ", " + true + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(CI)Z")
	private static boolean method444(@OriginalArg(0) char arg0) {
		try {
			return !method446(arg0) && !method447(18, arg0);
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("97337, " + arg0 + ", " + -4123 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(CB)Z")
	private static boolean method445(@OriginalArg(0) char arg0) {
		try {
			if (aByte36 != -40) {
				throw new NullPointerException();
			} else if (arg0 >= 'a' && arg0 <= 'z') {
				return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
			} else {
				return true;
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("26113, " + arg0 + ", " + -40 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(CZ)Z")
	private static boolean method446(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("97802, " + arg0 + ", " + false + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(IC)Z")
	private static boolean method447(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		try {
			@Pc(3) boolean local3 = false;
			return arg1 >= '0' && arg1 <= '9';
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("69477, " + arg0 + ", " + arg1 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZC)Z")
	private static boolean method448(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z';
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("10540, " + false + ", " + arg0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(CB)Z")
	private static boolean method449(@OriginalArg(0) char arg0) {
		try {
			if (aByte37 != 7) {
				aBoolean138 = !aBoolean138;
			}
			return arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("20382, " + arg0 + ", " + 7 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(B[C)Z")
	private static boolean method450(@OriginalArg(0) byte arg0, @OriginalArg(1) char[] arg1) {
		try {
			@Pc(3) boolean local3 = true;
			if (arg0 != 2) {
				throw new NullPointerException();
			}
			@Pc(8) boolean local8 = false;
			for (@Pc(15) int local15 = 0; local15 < arg1.length; local15++) {
				if (!method447(18, arg1[local15]) && arg1[local15] != '\u0000') {
					local3 = false;
				}
			}
			if (local3) {
				return true;
			}
			@Pc(43) int local43 = method451(arg1);
			@Pc(45) int local45 = 0;
			@Pc(50) int local50 = anIntArray195.length - 1;
			if (local43 == anIntArray195[0] || local43 == anIntArray195[local50]) {
				return true;
			}
			do {
				@Pc(68) int local68 = (local45 + local50) / 2;
				if (local43 == anIntArray195[local68]) {
					return true;
				}
				if (local43 < anIntArray195[local68]) {
					local50 = local68;
				} else {
					local45 = local68;
				}
			} while (local45 != local50 && local45 + 1 != local50);
			return false;
		} catch (@Pc(97) RuntimeException local97) {
			signlink.reporterror("80754, " + arg0 + ", " + arg1 + ", " + local97.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(B[C)I")
	private static int method451(@OriginalArg(1) char[] arg0) {
		try {
			if (arg0.length > 6) {
				return 0;
			}
			@Pc(14) int local14 = 0;
			for (@Pc(16) int local16 = 0; local16 < arg0.length; local16++) {
				@Pc(27) char local27 = arg0[arg0.length - local16 - 1];
				if (local27 >= 'a' && local27 <= 'z') {
					local14 = local14 * 38 + local27 + 1 - 'a';
				} else if (local27 == '\'') {
					local14 = local14 * 38 + 27;
				} else if (local27 >= '0' && local27 <= '9') {
					local14 = local14 * 38 + local27 + 28 - '0';
				} else if (local27 != '\u0000') {
					return 0;
				}
			}
			return local14;
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("62744, " + 5 + ", " + arg0 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}
}
