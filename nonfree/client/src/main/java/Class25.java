import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!mc")
public final class Class25 {

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "Z")
	private static boolean aBoolean139;

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
	private static int anInt644;

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "Z")
	private static boolean aBoolean141;

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "Z")
	private static boolean aBoolean142;

	@OriginalMember(owner = "client!mc", name = "j", descriptor = "B")
	private static byte aByte32;

	@OriginalMember(owner = "client!mc", name = "n", descriptor = "[I")
	private static int[] anIntArray195;

	@OriginalMember(owner = "client!mc", name = "o", descriptor = "[[C")
	private static char[][] aCharArrayArray1;

	@OriginalMember(owner = "client!mc", name = "p", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!mc", name = "q", descriptor = "[[C")
	private static char[][] aCharArrayArray2;

	@OriginalMember(owner = "client!mc", name = "r", descriptor = "[[C")
	private static char[][] aCharArrayArray3;

	@OriginalMember(owner = "client!mc", name = "s", descriptor = "[I")
	private static int[] anIntArray196;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "Z")
	private static boolean aBoolean138 = true;

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
	private static int anInt643 = -9908;

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "Z")
	private static boolean aBoolean140 = true;

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
	private static int anInt645 = 366;

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
	private static int anInt646 = 730;

	@OriginalMember(owner = "client!mc", name = "k", descriptor = "B")
	private static byte aByte33 = -73;

	@OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
	private static int anInt647 = -711;

	@OriginalMember(owner = "client!mc", name = "m", descriptor = "B")
	private static byte aByte34 = 1;

	@OriginalMember(owner = "client!mc", name = "t", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray11 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet" };

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!ub;)V")
	public static void method406(@OriginalArg(0) Class39 arg0) {
		@Pc(11) Class1_Sub3_Sub3 local11 = new Class1_Sub3_Sub3(0, arg0.method528("fragmentsenc.txt", null));
		@Pc(21) Class1_Sub3_Sub3 local21 = new Class1_Sub3_Sub3(0, arg0.method528("badenc.txt", null));
		@Pc(31) Class1_Sub3_Sub3 local31 = new Class1_Sub3_Sub3(0, arg0.method528("domainenc.txt", null));
		@Pc(41) Class1_Sub3_Sub3 local41 = new Class1_Sub3_Sub3(0, arg0.method528("tldlist.txt", null));
		method407(local11, local21, local31, local41);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!kb;Lclient!kb;Lclient!kb;Lclient!kb;)V")
	private static void method407(@OriginalArg(0) Class1_Sub3_Sub3 arg0, @OriginalArg(1) Class1_Sub3_Sub3 arg1, @OriginalArg(2) Class1_Sub3_Sub3 arg2, @OriginalArg(3) Class1_Sub3_Sub3 arg3) {
		method409(arg1);
		method410(arg2);
		method411(arg0);
		method408(arg3);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILclient!kb;)V")
	private static void method408(@OriginalArg(1) Class1_Sub3_Sub3 arg0) {
		try {
			@Pc(4) int local4 = arg0.method388();
			aCharArrayArray3 = new char[local4][];
			anIntArray196 = new int[local4];
			for (@Pc(20) int local20 = 0; local20 < local4; local20++) {
				anIntArray196[local20] = arg0.method383();
				@Pc(31) char[] local31 = new char[arg0.method383()];
				for (@Pc(33) int local33 = 0; local33 < local31.length; local33++) {
					local31[local33] = (char) arg0.method383();
				}
				aCharArrayArray3[local20] = local31;
			}
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("44208, " + 2 + ", " + arg0 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!kb;I)V")
	private static void method409(@OriginalArg(0) Class1_Sub3_Sub3 arg0) {
		try {
			@Pc(2) int local2 = arg0.method388();
			aCharArrayArray1 = new char[local2][];
			aByteArrayArrayArray8 = new byte[local2][][];
			method412(aCharArrayArray1, aByteArrayArrayArray8, arg0);
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("32808, " + arg0 + ", " + 48521 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(ILclient!kb;)V")
	private static void method410(@OriginalArg(1) Class1_Sub3_Sub3 arg0) {
		try {
			@Pc(2) int local2 = arg0.method388();
			aCharArrayArray2 = new char[local2][];
			method413(aCharArrayArray2, arg0);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("50460, " + 4 + ", " + arg0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!kb;Z)V")
	private static void method411(@OriginalArg(0) Class1_Sub3_Sub3 arg0) {
		try {
			anIntArray195 = new int[arg0.method388()];
			for (@Pc(7) int local7 = 0; local7 < anIntArray195.length; local7++) {
				anIntArray195[local7] = arg0.method385();
			}
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("30764, " + arg0 + ", " + false + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z[[C[[[BLclient!kb;)V")
	private static void method412(@OriginalArg(1) char[][] arg0, @OriginalArg(2) byte[][][] arg1, @OriginalArg(3) Class1_Sub3_Sub3 arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
				@Pc(9) char[] local9 = new char[arg2.method383()];
				for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
					local9[local11] = (char) arg2.method383();
				}
				arg0[local3] = local9;
				@Pc(33) byte[][] local33 = new byte[arg2.method383()][2];
				for (@Pc(35) int local35 = 0; local35 < local33.length; local35++) {
					local33[local35][0] = (byte) arg2.method383();
					local33[local35][1] = (byte) arg2.method383();
				}
				if (local33.length > 0) {
					arg1[local3] = local33;
				}
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("40213, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "([[CZLclient!kb;)V")
	private static void method413(@OriginalArg(0) char[][] arg0, @OriginalArg(2) Class1_Sub3_Sub3 arg1) {
		try {
			for (@Pc(6) int local6 = 0; local6 < arg0.length; local6++) {
				@Pc(12) char[] local12 = new char[arg1.method383()];
				for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
					local12[local14] = (char) arg1.method383();
				}
				arg0[local6] = local12;
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("91174, " + arg0 + ", " + false + ", " + arg1 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "([CZ)V")
	private static void method414(@OriginalArg(0) char[] arg0, @OriginalArg(1) boolean arg1) {
		try {
			if (arg1) {
				@Pc(6) int local6 = 0;
				for (@Pc(8) int local8 = 0; local8 < arg0.length; local8++) {
					if (method415(arg0[local8])) {
						arg0[local6] = arg0[local8];
					} else {
						arg0[local6] = ' ';
					}
					if (local6 == 0 || arg0[local6] != ' ' || arg0[local6 - 1] != ' ') {
						local6++;
					}
				}
				for (@Pc(50) int local50 = local6; local50 < arg0.length; local50++) {
					arg0[local50] = ' ';
				}
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("87058, " + arg0 + ", " + arg1 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IC)Z")
	private static boolean method415(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= ' ' && arg0 <= '\u007f' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("24985, " + 0 + ", " + arg0 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method416(@OriginalArg(0) String arg0) {
		try {
			@Pc(3) long local3 = System.currentTimeMillis();
			@Pc(6) char[] local6 = arg0.toCharArray();
			method414(local6, aBoolean140);
			@Pc(15) String local15 = (new String(local6)).trim();
			@Pc(25) char[] local25 = local15.toLowerCase().toCharArray();
			@Pc(28) String local28 = local15.toLowerCase();
			method424(local25);
			method419(local25, anInt644);
			method420(local25);
			method433(local25);
			for (@Pc(42) int local42 = 0; local42 < aStringArray11.length; local42++) {
				@Pc(51) int local51 = -1;
				while ((local51 = local28.indexOf(aStringArray11[local42], local51 + 1)) != -1) {
					@Pc(58) char[] local58 = aStringArray11[local42].toCharArray();
					for (@Pc(60) int local60 = 0; local60 < local58.length; local60++) {
						local25[local60 + local51] = local58[local60];
					}
				}
			}
			method417(local25, local15.toCharArray());
			method418(local25);
			@Pc(102) long local102 = System.currentTimeMillis();
			return (new String(local25)).trim();
		} catch (@Pc(109) RuntimeException local109) {
			signlink.reporterror("49905, " + arg0 + ", " + 0 + ", " + local109.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I[C[C)V")
	private static void method417(@OriginalArg(1) char[] arg0, @OriginalArg(2) char[] arg1) {
		try {
			for (@Pc(1) int local1 = 0; local1 < arg1.length; local1++) {
				if (arg0[local1] != '*' && method441(arg1[local1], aByte34)) {
					arg0[local1] = arg1[local1];
				}
			}
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("40029, " + -14298 + ", " + arg0 + ", " + arg1 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(B[C)V")
	private static void method418(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(8) boolean local8 = true;
			for (@Pc(10) int local10 = 0; local10 < arg0.length; local10++) {
				@Pc(16) char local16 = arg0[local10];
				if (!method438(local16)) {
					local8 = true;
				} else if (local8) {
					if (method440(local16)) {
						local8 = false;
					}
				} else if (method441(local16, aByte34)) {
					arg0[local10] = (char) (local16 + 'a' - 65);
				}
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("74230, " + -102 + ", " + arg0 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "([CI)V")
	private static void method419(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 2; local3++) {
				for (@Pc(10) int local10 = aCharArrayArray1.length - 1; local10 >= 0; local10--) {
					method428(arg0, aByteArrayArrayArray8[local10], aCharArrayArray1[local10]);
				}
			}
			if (arg1 == 0) {
				;
			}
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("43653, " + arg0 + ", " + arg1 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "([CB)V")
	private static void method420(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(12) char[] local12 = (char[]) arg0.clone();
			@Pc(27) char[] local27 = new char[] { '(', 'a', ')' };
			method428(local12, null, local27);
			@Pc(36) char[] local36 = (char[]) arg0.clone();
			@Pc(51) char[] local51 = new char[] { 'd', 'o', 't' };
			method428(local36, null, local51);
			for (@Pc(61) int local61 = aCharArrayArray2.length - 1; local61 >= 0; local61--) {
				method421(aCharArrayArray2[local61], local36, arg0, local12);
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("9760, " + arg0 + ", " + 21 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "([C[C[C[CI)V")
	private static void method421(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) char[] arg3) {
		try {
			if (arg0.length <= arg2.length) {
				@Pc(19) int local19;
				for (@Pc(11) int local11 = 0; local11 <= arg2.length - arg0.length; local11 += local19) {
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
							if (local17 < arg0.length && (local54 = method430(arg0[local17], local27, local29)) > 0) {
								local15 += local54;
								local17++;
							} else {
								if (local17 == 0) {
									break label59;
								}
								@Pc(75) int local75;
								if ((local75 = method430(arg0[local17 - 1], local27, local29)) > 0) {
									local15 += local75;
									if (local17 == 1) {
										local19++;
									}
								} else {
									if (local17 >= arg0.length || !method436(local27)) {
										break label59;
									}
									local15++;
								}
							}
						}
					}
					if (local17 >= arg0.length) {
						@Pc(106) boolean local106 = false;
						@Pc(112) int local112 = method422(arg2, arg3, 366, local11);
						@Pc(120) int local120 = method423(local15 - 1, arg1, arg2);
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
		} catch (@Pc(157) RuntimeException local157) {
			signlink.reporterror("55416, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 653 + ", " + local157.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "([C[CII)I")
	private static int method422(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg3 == 0) {
				return 2;
			}
			for (@Pc(9) int local9 = arg3 - 1; local9 >= 0 && method436(arg0[local9]); local9--) {
				if (arg0[local9] == '@') {
					return 3;
				}
			}
			@Pc(31) boolean local31 = false;
			@Pc(33) int local33 = 0;
			for (@Pc(37) int local37 = arg3 - 1; local37 >= 0 && method436(arg1[local37]); local37--) {
				if (arg1[local37] == '*') {
					local33++;
				}
			}
			if (local33 >= 3) {
				return 4;
			} else if (method436(arg0[arg3 - 1])) {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("19507, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I[C[CI)I")
	private static int method423(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2) {
		try {
			if (arg0 + 1 == arg2.length) {
				return 2;
			}
			@Pc(13) int local13 = arg0 + 1;
			while (true) {
				if (local13 < arg2.length && method436(arg2[local13])) {
					if (arg2[local13] != '.' && arg2[local13] != ',') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(40) int local40 = 0;
				for (@Pc(44) int local44 = arg0 + 1; local44 < arg2.length && method436(arg1[local44]); local44++) {
					if (arg1[local44] == '*') {
						local40++;
					}
				}
				if (local40 >= 3) {
					return 4;
				}
				if (method436(arg2[arg0 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("15503, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "([CZ)V")
	private static void method424(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(18) char[] local18 = new char[] { 'd', 'o', 't' };
			method428(local3, null, local18);
			@Pc(27) char[] local27 = (char[]) arg0.clone();
			@Pc(53) char[] local53 = new char[] { 's', 'l', 'a', 's', 'h' };
			method428(local27, null, local53);
			for (@Pc(60) int local60 = 0; local60 < aCharArrayArray3.length; local60++) {
				method425(local27, anIntArray196[local60], arg0, aCharArrayArray3[local60], local3);
			}
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("13231, " + arg0 + ", " + true + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "([CII[C[C[C)V")
	private static void method425(@OriginalArg(0) char[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) char[] arg2, @OriginalArg(4) char[] arg3, @OriginalArg(5) char[] arg4) {
		try {
			if (arg3.length <= arg2.length) {
				@Pc(23) int local23;
				for (@Pc(15) int local15 = 0; local15 <= arg2.length - arg3.length; local15 += local23) {
					@Pc(19) int local19 = local15;
					@Pc(21) int local21 = 0;
					local23 = 1;
					label120: while (true) {
						while (true) {
							if (local19 >= arg2.length) {
								break label120;
							}
							@Pc(31) char local31 = arg2[local19];
							@Pc(33) char local33 = 0;
							if (local19 + 1 < arg2.length) {
								local33 = arg2[local19 + 1];
							}
							@Pc(58) int local58;
							if (local21 < arg3.length && (local58 = method430(arg3[local21], local31, local33)) > 0) {
								local19 += local58;
								local21++;
							} else {
								if (local21 == 0) {
									break label120;
								}
								@Pc(79) int local79;
								if ((local79 = method430(arg3[local21 - 1], local31, local33)) > 0) {
									local19 += local79;
									if (local21 == 1) {
										local23++;
									}
								} else {
									if (local21 >= arg3.length || !method436(local31)) {
										break label120;
									}
									local19++;
								}
							}
						}
					}
					if (local21 >= arg3.length) {
						@Pc(110) boolean local110 = false;
						@Pc(116) int local116 = method426(arg4, arg2, local15, 730);
						@Pc(124) int local124 = method427(arg0, arg2, local19 - 1);
						if (arg1 == 1 && local116 > 0 && local124 > 0) {
							local110 = true;
						}
						if (arg1 == 2 && (local116 > 2 && local124 > 0 || local116 > 0 && local124 > 2)) {
							local110 = true;
						}
						if (arg1 == 3 && local116 > 0 && local124 > 2) {
							local110 = true;
						}
						@Pc(167) boolean local167;
						if (arg1 == 3 && local116 > 2 && local124 > 0) {
							local167 = true;
						} else {
							local167 = false;
						}
						if (local110) {
							@Pc(174) int local174 = local15;
							@Pc(178) int local178 = local19 - 1;
							@Pc(186) boolean local186;
							@Pc(190) int local190;
							if (local116 > 2) {
								if (local116 == 4) {
									local186 = false;
									for (local190 = local15 - 1; local190 >= 0; local190--) {
										if (local186) {
											if (arg4[local190] != '*') {
												break;
											}
											local174 = local190;
										} else if (arg4[local190] == '*') {
											local174 = local190;
											local186 = true;
										}
									}
								}
								local186 = false;
								for (local190 = local174 - 1; local190 >= 0; local190--) {
									if (local186) {
										if (method436(arg2[local190])) {
											break;
										}
										local174 = local190;
									} else if (!method436(arg2[local190])) {
										local186 = true;
										local174 = local190;
									}
								}
							}
							if (local124 > 2) {
								if (local124 == 4) {
									local186 = false;
									for (local190 = local178 + 1; local190 < arg2.length; local190++) {
										if (local186) {
											if (arg0[local190] != '*') {
												break;
											}
											local178 = local190;
										} else if (arg0[local190] == '*') {
											local178 = local190;
											local186 = true;
										}
									}
								}
								local186 = false;
								for (local190 = local178 + 1; local190 < arg2.length; local190++) {
									if (local186) {
										if (method436(arg2[local190])) {
											break;
										}
										local178 = local190;
									} else if (!method436(arg2[local190])) {
										local186 = true;
										local178 = local190;
									}
								}
							}
							for (@Pc(324) int local324 = local174; local324 <= local178; local324++) {
								arg2[local324] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(347) RuntimeException local347) {
			signlink.reporterror("7000, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local347.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "([C[CII)I")
	private static int method426(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg2 == 0) {
				return 2;
			}
			@Pc(9) int local9 = arg2 - 1;
			while (true) {
				if (local9 >= 0 && method436(arg1[local9])) {
					if (arg1[local9] != ',' && arg1[local9] != '.') {
						local9--;
						continue;
					}
					return 3;
				}
				@Pc(34) int local34 = 0;
				@Pc(38) boolean local38 = false;
				for (@Pc(42) int local42 = arg2 - 1; local42 >= 0 && method436(arg0[local42]); local42--) {
					if (arg0[local42] == '*') {
						local34++;
					}
				}
				if (local34 >= 3) {
					return 4;
				}
				if (method436(arg1[arg2 - 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("1727, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "([CI[CI)I")
	private static int method427(@OriginalArg(0) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 + 1 == arg1.length) {
				return 2;
			}
			@Pc(13) int local13 = arg2 + 1;
			while (true) {
				if (local13 < arg1.length && method436(arg1[local13])) {
					if (arg1[local13] != '\\' && arg1[local13] != '/') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(40) int local40 = 0;
				for (@Pc(53) int local53 = arg2 + 1; local53 < arg1.length && method436(arg0[local53]); local53++) {
					if (arg0[local53] == '*') {
						local40++;
					}
				}
				if (local40 >= 5) {
					return 4;
				}
				if (method436(arg1[arg2 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("46654, " + arg0 + ", " + -49131 + ", " + arg1 + ", " + arg2 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "([C[[BI[C)V")
	private static void method428(@OriginalArg(0) char[] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg2.length <= arg0.length) {
				@Pc(21) int local21;
				for (@Pc(11) int local11 = 0; local11 <= arg0.length - arg2.length; local11 += local21) {
					@Pc(15) int local15 = local11;
					@Pc(17) int local17 = 0;
					@Pc(19) int local19 = 0;
					local21 = 1;
					@Pc(23) boolean local23 = false;
					@Pc(25) boolean local25 = false;
					@Pc(27) boolean local27 = false;
					@Pc(35) char var12;
					@Pc(37) char var13;
					label160: while (true) {
						while (true) {
							if (local15 >= arg0.length || local25 && local27) {
								break label160;
							}
							var12 = arg0[local15];
							var13 = '\u0000';
							if (local15 + 1 < arg0.length) {
								var13 = arg0[local15 + 1];
							}
							@Pc(62) int local62;
							if (local17 < arg2.length && (local62 = method431(var13, var12, arg2[local17])) > 0) {
								if (local62 == 1 && method439(var12)) {
									local25 = true;
								}
								if (local62 == 2 && (method439(var12) || method439(var13))) {
									local25 = true;
								}
								local15 += local62;
								local17++;
							} else {
								if (local17 == 0) {
									break label160;
								}
								@Pc(105) int local105;
								if ((local105 = method431(var13, var12, arg2[local17 - 1])) > 0) {
									local15 += local105;
									if (local17 == 1) {
										local21++;
									}
								} else {
									if (local17 >= arg2.length || !method437(var12)) {
										break label160;
									}
									if (method436(var12) && var12 != '\'') {
										local23 = true;
									}
									if (method439(var12)) {
										local27 = true;
									}
									local15++;
									local19++;
									if (local19 * 100 / (local15 - local11) > 90) {
										break label160;
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
							if (local11 - 1 < 0 || method436(arg0[local11 - 1]) && arg0[local11 - 1] != '\'') {
								local216 = true;
							}
							if (local15 >= arg0.length || method436(arg0[local15]) && arg0[local15] != '\'') {
								local218 = true;
							}
							if (!local216 || !local218) {
								@Pc(262) boolean local262 = false;
								local266 = local11 - 2;
								if (local216) {
									local266 = local11;
								}
								while (!local262 && local266 < local15) {
									if (local266 >= 0 && (!method436(arg0[local266]) || arg0[local266] == '\'')) {
										@Pc(288) char[] local288 = new char[3];
										@Pc(290) int local290;
										for (local290 = 0; local290 < 3 && local266 + local290 < arg0.length && (!method436(arg0[local266 + local290]) || arg0[local266 + local290] == '\''); local290++) {
											local288[local290] = arg0[local266 + local290];
										}
										@Pc(328) boolean local328 = true;
										if (local290 == 0) {
											local328 = false;
										}
										if (local290 < 3 && local266 - 1 >= 0 && (!method436(arg0[local266 - 1]) || arg0[local266 - 1] == '\'')) {
											local328 = false;
										}
										if (local328 && !method442(local288)) {
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
							@Pc(198) byte local198 = method432(aByte32, var12);
							@Pc(202) byte local202 = method432(aByte32, var13);
							if (arg1 != null && method429(arg1, local202, aBoolean141, local198)) {
								local170 = false;
							}
						}
						if (local170) {
							@Pc(378) int local378 = 0;
							@Pc(380) int local380 = 0;
							for (@Pc(382) int local382 = local11; local382 < local15; local382++) {
								if (method439(arg0[local382])) {
									local378++;
								} else if (method438(arg0[local382])) {
									local380++;
								}
							}
							if (local378 <= local380) {
								for (local266 = local11; local266 < local15; local266++) {
									arg0[local266] = '*';
								}
							}
						}
					}
				}
			}
		} catch (@Pc(441) RuntimeException local441) {
			signlink.reporterror("51243, " + arg0 + ", " + arg1 + ", " + -419 + ", " + arg2 + ", " + local441.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "([[BBZB)Z")
	private static boolean method429(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) byte arg3) {
		try {
			if (arg2) {
				aBoolean141 = !aBoolean141;
			}
			@Pc(9) int local9 = 0;
			if (arg0[0][0] == arg3 && arg0[0][1] == arg1) {
				return true;
			}
			@Pc(30) int local30 = arg0.length - 1;
			if (arg0[local30][0] == arg3 && arg0[local30][1] == arg1) {
				return true;
			}
			do {
				@Pc(52) int local52 = (local9 + local30) / 2;
				if (arg0[local52][0] == arg3 && arg0[local52][1] == arg1) {
					return true;
				}
				if (arg3 < arg0[local52][0] || arg3 == arg0[local52][0] && arg1 < arg0[local52][1]) {
					local30 = local52;
				} else {
					local9 = local52;
				}
			} while (local9 != local30 && local9 + 1 != local30);
			return false;
		} catch (@Pc(106) RuntimeException local106) {
			signlink.reporterror("7988, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local106.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(CCCZ)I")
	private static int method430(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(2) char arg2) {
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
			signlink.reporterror("83897, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(CCZC)I")
	private static int method431(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(3) char arg2) {
		try {
			if (arg2 == arg1) {
				return 1;
			}
			if (arg2 >= 'a' && arg2 <= 'm') {
				if (arg2 == 'a') {
					if (arg1 != '4' && arg1 != '@' && arg1 != '^') {
						if (arg1 == '/' && arg0 == '\\') {
							return 2;
						}
						return 0;
					}
					return 1;
				}
				if (arg2 == 'b') {
					if (arg1 != '6' && arg1 != '8') {
						if (arg1 == '1' && arg0 == '3') {
							return 2;
						}
						return 0;
					}
					return 1;
				}
				if (arg2 == 'c') {
					if (arg1 != '(' && arg1 != '<' && arg1 != '{' && arg1 != '[') {
						return 0;
					}
					return 1;
				}
				if (arg2 == 'd') {
					if (arg1 == '[' && arg0 == ')') {
						return 2;
					}
					return 0;
				}
				if (arg2 == 'e') {
					if (arg1 != '3' && arg1 != '€') {
						return 0;
					}
					return 1;
				}
				if (arg2 == 'f') {
					if (arg1 == 'p' && arg0 == 'h') {
						return 2;
					}
					if (arg1 == '£') {
						return 1;
					}
					return 0;
				}
				if (arg2 == 'g') {
					if (arg1 != '9' && arg1 != '6') {
						return 0;
					}
					return 1;
				}
				if (arg2 == 'h') {
					if (arg1 == '#') {
						return 1;
					}
					return 0;
				}
				if (arg2 == 'i') {
					if (arg1 != 'y' && arg1 != 'l' && arg1 != 'j' && arg1 != '1' && arg1 != '!' && arg1 != ':' && arg1 != ';' && arg1 != '|') {
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
					if (arg1 != '1' && arg1 != '|' && arg1 != 'i') {
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
					if (arg1 != '0' && arg1 != '*') {
						if ((arg1 != '(' || arg0 != ')') && (arg1 != '[' || arg0 != ']') && (arg1 != '{' || arg0 != '}') && (arg1 != '<' || arg0 != '>')) {
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
					if (arg1 != '5' && arg1 != 'z' && arg1 != '$' && arg1 != '2') {
						return 0;
					}
					return 1;
				}
				if (arg2 == 't') {
					if (arg1 != '7' && arg1 != '+') {
						return 0;
					}
					return 1;
				}
				if (arg2 == 'u') {
					if (arg1 == 'v') {
						return 1;
					}
					if ((arg1 != '\\' || arg0 != '/') && (arg1 != '\\' || arg0 != '|') && (arg1 != '|' || arg0 != '/')) {
						return 0;
					}
					return 2;
				}
				if (arg2 == 'v') {
					if ((arg1 != '\\' || arg0 != '/') && (arg1 != '\\' || arg0 != '|') && (arg1 != '|' || arg0 != '/')) {
						return 0;
					}
					return 2;
				}
				if (arg2 == 'w') {
					if (arg1 == 'v' && arg0 == 'v') {
						return 2;
					}
					return 0;
				}
				if (arg2 == 'x') {
					if ((arg1 != ')' || arg0 != '(') && (arg1 != '}' || arg0 != '{') && (arg1 != ']' || arg0 != '[') && (arg1 != '>' || arg0 != '<')) {
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
					if (arg1 == 'o' || arg1 == 'O') {
						return 1;
					} else if ((arg1 != '(' || arg0 != ')') && (arg1 != '{' || arg0 != '}') && (arg1 != '[' || arg0 != ']')) {
						return 0;
					} else {
						return 2;
					}
				} else if (arg2 == '1') {
					return arg1 == 'l' ? 1 : 0;
				} else {
					return 0;
				}
			} else if (arg2 == ',') {
				return arg1 == '.' ? 1 : 0;
			} else if (arg2 == '.') {
				return arg1 == ',' ? 1 : 0;
			} else if (arg2 == '!') {
				return arg1 == 'i' ? 1 : 0;
			} else {
				return 0;
			}
		} catch (@Pc(497) RuntimeException local497) {
			signlink.reporterror("37330, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + local497.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BC)B")
	private static byte method432(@OriginalArg(0) byte arg0, @OriginalArg(1) char arg1) {
		try {
			if (arg0 != 0) {
				throw new NullPointerException();
			} else if (arg1 >= 'a' && arg1 <= 'z') {
				return (byte) (arg1 + 1 - 'a');
			} else if (arg1 == '\'') {
				return 28;
			} else if (arg1 >= '0' && arg1 <= '9') {
				return (byte) (arg1 + 29 - '0');
			} else {
				return 27;
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("32673, " + arg0 + ", " + arg1 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(B[C)V")
	private static void method433(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(15) int local15 = 0;
			@Pc(17) int local17 = 0;
			@Pc(19) int local19 = 0;
			while (true) {
				do {
					@Pc(118) int local118;
					if ((local118 = method434(local15, aByte33, arg0)) == -1) {
						return;
					}
					@Pc(23) boolean local23 = false;
					for (@Pc(25) int local25 = local15; local25 >= 0 && local25 < local118 && !local23; local25++) {
						if (!method436(arg0[local25]) && !method437(arg0[local25])) {
							local23 = true;
						}
					}
					if (local23) {
						local17 = 0;
					}
					if (local17 == 0) {
						local19 = local118;
					}
					local15 = method435(local118, arg0);
					@Pc(64) int local64 = 0;
					for (@Pc(66) int local66 = local118; local66 < local15; local66++) {
						local64 = local64 * 10 + arg0[local66] - 48;
					}
					if (local64 <= 255 && local15 - local118 <= 8) {
						local17++;
					} else {
						local17 = 0;
					}
				} while (local17 != 4);
				for (@Pc(100) int local100 = local19; local100 < local15; local100++) {
					arg0[local100] = '*';
				}
				local17 = 0;
			}
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("5423, " + -81 + ", " + arg0 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IB[C)I")
	private static int method434(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) char[] arg2) {
		try {
			for (@Pc(1) int local1 = arg0; local1 < arg2.length && local1 >= 0; local1++) {
				if (arg2[local1] >= '0' && arg2[local1] <= '9') {
					return local1;
				}
			}
			if (arg1 != -73) {
				aBoolean138 = !aBoolean138;
			}
			return -1;
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("37615, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I[CZ)I")
	private static int method435(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1) {
		try {
			@Pc(5) int local5 = arg0;
			while (true) {
				if (local5 < arg1.length && local5 >= 0) {
					if (arg1[local5] >= '0' && arg1[local5] <= '9') {
						local5++;
						continue;
					}
					return local5;
				}
				return arg1.length;
			}
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("2249, " + arg0 + ", " + arg1 + ", " + false + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(CI)Z")
	private static boolean method436(@OriginalArg(0) char arg0) {
		try {
			return !method438(arg0) && !method439(arg0);
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("54071, " + arg0 + ", " + -711 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(CI)Z")
	private static boolean method437(@OriginalArg(0) char arg0) {
		try {
			if (arg0 >= 'a' && arg0 <= 'z') {
				return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
			} else {
				return true;
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("74691, " + arg0 + ", " + 0 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(CZ)Z")
	private static boolean method438(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("4540, " + arg0 + ", " + false + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(BC)Z")
	private static boolean method439(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= '0' && arg0 <= '9';
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("38637, " + 0 + ", " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(CI)Z")
	private static boolean method440(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z';
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("52413, " + arg0 + ", " + -17212 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(CB)Z")
	private static boolean method441(@OriginalArg(0) char arg0, @OriginalArg(1) byte arg1) {
		try {
			if (arg1 != 1) {
				aBoolean142 = !aBoolean142;
			}
			return arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("57575, " + arg0 + ", " + arg1 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z[C)Z")
	private static boolean method442(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				if (!method439(arg0[local5]) && arg0[local5] != '\u0000') {
					local3 = false;
				}
			}
			if (local3) {
				return true;
			}
			@Pc(32) int local32 = method443(arg0, (byte) 4);
			@Pc(38) int local38 = 0;
			@Pc(43) int local43 = anIntArray195.length - 1;
			if (local32 == anIntArray195[0] || local32 == anIntArray195[local43]) {
				return true;
			}
			do {
				@Pc(61) int local61 = (local38 + local43) / 2;
				if (local32 == anIntArray195[local61]) {
					return true;
				}
				if (local32 < anIntArray195[local61]) {
					local43 = local61;
				} else {
					local38 = local61;
				}
			} while (local38 != local43 && local38 + 1 != local43);
			return false;
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("48237, " + true + ", " + arg0 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "([CB)I")
	private static int method443(@OriginalArg(0) char[] arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(6) boolean local6 = false;
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
			signlink.reporterror("41114, " + arg0 + ", " + arg1 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}
}
