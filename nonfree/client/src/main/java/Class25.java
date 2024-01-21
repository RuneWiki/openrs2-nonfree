import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!mc")
public final class Class25 {

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
	private static int anInt622;

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "Z")
	private static boolean aBoolean150;

	@OriginalMember(owner = "client!mc", name = "j", descriptor = "Z")
	private static boolean aBoolean152;

	@OriginalMember(owner = "client!mc", name = "l", descriptor = "[I")
	private static int[] anIntArray195;

	@OriginalMember(owner = "client!mc", name = "m", descriptor = "[[C")
	private static char[][] aCharArrayArray1;

	@OriginalMember(owner = "client!mc", name = "n", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!mc", name = "o", descriptor = "[[C")
	private static char[][] aCharArrayArray2;

	@OriginalMember(owner = "client!mc", name = "p", descriptor = "[[C")
	private static char[][] aCharArrayArray3;

	@OriginalMember(owner = "client!mc", name = "q", descriptor = "[I")
	private static int[] anIntArray196;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "B")
	private static byte aByte51 = 4;

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "B")
	private static byte aByte52 = -89;

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
	private static int anInt623 = 48104;

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
	private static int anInt624 = 710;

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
	private static int anInt625 = 710;

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
	private static int anInt626 = 175;

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "Z")
	private static boolean aBoolean151 = true;

	@OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
	private static int anInt627 = 568;

	@OriginalMember(owner = "client!mc", name = "r", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray11 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet" };

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!ub;)V")
	public static void method406(@OriginalArg(0) Class39 arg0) {
		@Pc(11) Class1_Sub3_Sub3 local11 = new Class1_Sub3_Sub3(arg0.method528(aByte51, "fragmentsenc.txt", null), 0);
		@Pc(21) Class1_Sub3_Sub3 local21 = new Class1_Sub3_Sub3(arg0.method528(aByte51, "badenc.txt", null), 0);
		@Pc(31) Class1_Sub3_Sub3 local31 = new Class1_Sub3_Sub3(arg0.method528(aByte51, "domainenc.txt", null), 0);
		@Pc(41) Class1_Sub3_Sub3 local41 = new Class1_Sub3_Sub3(arg0.method528(aByte51, "tldlist.txt", null), 0);
		method407(local11, local21, local31, local41);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!kb;Lclient!kb;Lclient!kb;Lclient!kb;)V")
	private static void method407(@OriginalArg(0) Class1_Sub3_Sub3 arg0, @OriginalArg(1) Class1_Sub3_Sub3 arg1, @OriginalArg(2) Class1_Sub3_Sub3 arg2, @OriginalArg(3) Class1_Sub3_Sub3 arg3) {
		method409(arg1);
		method410(arg2);
		method411(arg0);
		method408(arg3);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BLclient!kb;)V")
	private static void method408(@OriginalArg(1) Class1_Sub3_Sub3 arg0) {
		try {
			@Pc(8) int local8 = arg0.method388();
			aCharArrayArray3 = new char[local8][];
			anIntArray196 = new int[local8];
			for (@Pc(16) int local16 = 0; local16 < local8; local16++) {
				anIntArray196[local16] = arg0.method383();
				@Pc(27) char[] local27 = new char[arg0.method383()];
				for (@Pc(29) int local29 = 0; local29 < local27.length; local29++) {
					local27[local29] = (char) arg0.method383();
				}
				aCharArrayArray3[local16] = local27;
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("33249, " + 9 + ", " + arg0 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!kb;Z)V")
	private static void method409(@OriginalArg(0) Class1_Sub3_Sub3 arg0) {
		try {
			@Pc(2) int local2 = arg0.method388();
			aCharArrayArray1 = new char[local2][];
			aByteArrayArrayArray8 = new byte[local2][][];
			method412(aCharArrayArray1, aByteArrayArrayArray8, arg0);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("79375, " + arg0 + ", " + false + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILclient!kb;)V")
	private static void method410(@OriginalArg(1) Class1_Sub3_Sub3 arg0) {
		try {
			@Pc(6) int local6 = arg0.method388();
			aCharArrayArray2 = new char[local6][];
			method413(anInt623, arg0, aCharArrayArray2);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("82723, " + 0 + ", " + arg0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!kb;I)V")
	private static void method411(@OriginalArg(0) Class1_Sub3_Sub3 arg0) {
		try {
			anIntArray195 = new int[arg0.method388()];
			for (@Pc(8) int local8 = 0; local8 < anIntArray195.length; local8++) {
				anIntArray195[local8] = arg0.method385();
			}
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("66224, " + arg0 + ", " + 760 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(B[[C[[[BLclient!kb;)V")
	private static void method412(@OriginalArg(1) char[][] arg0, @OriginalArg(2) byte[][][] arg1, @OriginalArg(3) Class1_Sub3_Sub3 arg2) {
		try {
			if (aByte52 == -89) {
				for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
					@Pc(13) char[] local13 = new char[arg2.method383()];
					for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
						local13[local15] = (char) arg2.method383();
					}
					arg0[local7] = local13;
					@Pc(37) byte[][] local37 = new byte[arg2.method383()][2];
					for (@Pc(39) int local39 = 0; local39 < local37.length; local39++) {
						local37[local39][0] = (byte) arg2.method383();
						local37[local39][1] = (byte) arg2.method383();
					}
					if (local37.length > 0) {
						arg1[local7] = local37;
					}
				}
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("81752, " + -89 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILclient!kb;[[C)V")
	private static void method413(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub3_Sub3 arg1, @OriginalArg(2) char[][] arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < arg2.length; local3++) {
				@Pc(9) char[] local9 = new char[arg1.method383()];
				for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
					local9[local11] = (char) arg1.method383();
				}
				arg2[local3] = local9;
			}
			if (arg0 == 48104) {
				;
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("10820, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "([CI)V")
	private static void method414(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(12) int local12 = 0;
			for (@Pc(14) int local14 = 0; local14 < arg0.length; local14++) {
				if (method415(arg0[local14], anInt624)) {
					arg0[local12] = arg0[local14];
				} else {
					arg0[local12] = ' ';
				}
				if (local12 == 0 || arg0[local12] != ' ' || arg0[local12 - 1] != ' ') {
					local12++;
				}
			}
			for (@Pc(56) int local56 = local12; local56 < arg0.length; local56++) {
				arg0[local56] = ' ';
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("19955, " + arg0 + ", " + 13142 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(CI)Z")
	private static boolean method415(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 <= 0) {
				throw new NullPointerException();
			}
			return arg0 >= ' ' && arg0 <= '\u007f' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("49252, " + arg0 + ", " + arg1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
	public static String method416(@OriginalArg(0) String arg0) {
		try {
			@Pc(3) long local3 = System.currentTimeMillis();
			@Pc(6) char[] local6 = arg0.toCharArray();
			method414(local6);
			@Pc(29) String local29 = (new String(local6)).trim();
			@Pc(33) char[] local33 = local29.toLowerCase().toCharArray();
			@Pc(36) String local36 = local29.toLowerCase();
			method424(local33);
			method419(local33, aBoolean151);
			method420(local33);
			method433(local33);
			for (@Pc(50) int local50 = 0; local50 < aStringArray11.length; local50++) {
				@Pc(54) int local54 = -1;
				while ((local54 = local36.indexOf(aStringArray11[local50], local54 + 1)) != -1) {
					@Pc(61) char[] local61 = aStringArray11[local50].toCharArray();
					for (@Pc(63) int local63 = 0; local63 < local61.length; local63++) {
						local33[local63 + local54] = local61[local63];
					}
				}
			}
			method417(local29.toCharArray(), local33);
			method418(local33);
			@Pc(105) long local105 = System.currentTimeMillis();
			return (new String(local33)).trim();
		} catch (@Pc(112) RuntimeException local112) {
			signlink.reporterror("12465, " + arg0 + ", " + true + ", " + local112.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "([C[CI)V")
	private static void method417(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1) {
		try {
			for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
				if (arg1[local1] != '*' && method441(arg0[local1])) {
					arg1[local1] = arg0[local1];
				}
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("43417, " + arg0 + ", " + arg1 + ", " + 175 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "([CI)V")
	private static void method418(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				@Pc(11) char local11 = arg0[local5];
				if (!method438(local11)) {
					local3 = true;
				} else if (local3) {
					if (method440(local11)) {
						local3 = false;
					}
				} else if (method441(local11)) {
					arg0[local5] = (char) (local11 + 'a' - 65);
				}
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("89278, " + arg0 + ", " + 40151 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "([CZ)V")
	private static void method419(@OriginalArg(0) char[] arg0, @OriginalArg(1) boolean arg1) {
		try {
			if (arg1) {
				for (@Pc(6) int local6 = 0; local6 < 2; local6++) {
					for (@Pc(13) int local13 = aCharArrayArray1.length - 1; local13 >= 0; local13--) {
						method428(arg0, anInt627, aByteArrayArrayArray8[local13], aCharArrayArray1[local13]);
					}
				}
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("57515, " + arg0 + ", " + arg1 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "([CI)V")
	private static void method420(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(18) char[] local18 = new char[] { '(', 'a', ')' };
			method428(local3, anInt627, null, local18);
			@Pc(27) char[] local27 = (char[]) arg0.clone();
			@Pc(51) char[] local51 = new char[] { 'd', 'o', 't' };
			method428(local27, anInt627, null, local51);
			for (@Pc(61) int local61 = aCharArrayArray2.length - 1; local61 >= 0; local61--) {
				method421(arg0, aCharArrayArray2[local61], local3, local27);
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("34506, " + arg0 + ", " + 16829 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I[C[C[C[C)V")
	private static void method421(@OriginalArg(1) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2, @OriginalArg(4) char[] arg3) {
		try {
			if (arg1.length <= arg0.length) {
				@Pc(31) int local31;
				for (@Pc(23) int local23 = 0; local23 <= arg0.length - arg1.length; local23 += local31) {
					@Pc(27) int local27 = local23;
					@Pc(29) int local29 = 0;
					local31 = 1;
					label58: while (true) {
						while (true) {
							if (local27 >= arg0.length) {
								break label58;
							}
							@Pc(39) char local39 = arg0[local27];
							@Pc(41) char local41 = 0;
							if (local27 + 1 < arg0.length) {
								local41 = arg0[local27 + 1];
							}
							@Pc(66) int local66;
							if (local29 < arg1.length && (local66 = method430(arg1[local29], local41, local39)) > 0) {
								local27 += local66;
								local29++;
							} else {
								if (local29 == 0) {
									break label58;
								}
								@Pc(87) int local87;
								if ((local87 = method430(arg1[local29 - 1], local41, local39)) > 0) {
									local27 += local87;
									if (local29 == 1) {
										local31++;
									}
								} else {
									if (local29 >= arg1.length || !method436(local39)) {
										break label58;
									}
									local27++;
								}
							}
						}
					}
					if (local29 >= arg1.length) {
						@Pc(118) boolean local118 = false;
						@Pc(124) int local124 = method422(local23, arg2, arg0);
						@Pc(132) int local132 = method423(arg3, arg0, local27 - 1);
						if (local124 > 2 || local132 > 2) {
							local118 = true;
						}
						if (local118) {
							for (@Pc(144) int local144 = local23; local144 < local27; local144++) {
								arg0[local144] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(167) RuntimeException local167) {
			signlink.reporterror("82209, " + 3 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local167.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(II[C[C)I")
	private static int method422(@OriginalArg(1) int arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg0 == 0) {
				return 2;
			}
			for (@Pc(9) int local9 = arg0 - 1; local9 >= 0 && method436(arg2[local9]); local9--) {
				if (arg2[local9] == '@') {
					return 3;
				}
			}
			@Pc(29) int local29 = 0;
			for (@Pc(38) int local38 = arg0 - 1; local38 >= 0 && method436(arg1[local38]); local38--) {
				if (arg1[local38] == '*') {
					local29++;
				}
			}
			if (local29 >= 3) {
				return 4;
			} else if (method436(arg2[arg0 - 1])) {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("30412, " + 8 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "([C[CII)I")
	private static int method423(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg2 + 1 == arg1.length) {
				return 2;
			}
			@Pc(13) int local13 = arg2 + 1;
			while (true) {
				if (local13 < arg1.length && method436(arg1[local13])) {
					if (arg1[local13] != '.' && arg1[local13] != ',') {
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
				if (local40 >= 3) {
					return 4;
				}
				if (method436(arg1[arg2 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("78248, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I[C)V")
	private static void method424(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(26) char[] local26 = new char[] { 'd', 'o', 't' };
			method428(local3, anInt627, null, local26);
			@Pc(35) char[] local35 = (char[]) arg0.clone();
			@Pc(58) char[] local58 = new char[] { 's', 'l', 'a', 's', 'h' };
			method428(local35, anInt627, null, local58);
			for (@Pc(65) int local65 = 0; local65 < aCharArrayArray3.length; local65++) {
				method425(arg0, aBoolean152, anIntArray196[local65], aCharArrayArray3[local65], local35, local3);
			}
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("52620, " + -786 + ", " + arg0 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "([CZI[C[C[C)V")
	private static void method425(@OriginalArg(0) char[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) char[] arg3, @OriginalArg(4) char[] arg4, @OriginalArg(5) char[] arg5) {
		try {
			if (!arg1 && arg3.length <= arg0.length) {
				@Pc(22) int local22;
				for (@Pc(14) int local14 = 0; local14 <= arg0.length - arg3.length; local14 += local22) {
					@Pc(18) int local18 = local14;
					@Pc(20) int local20 = 0;
					local22 = 1;
					label124: while (true) {
						while (true) {
							if (local18 >= arg0.length) {
								break label124;
							}
							@Pc(30) char local30 = arg0[local18];
							@Pc(32) char local32 = 0;
							if (local18 + 1 < arg0.length) {
								local32 = arg0[local18 + 1];
							}
							@Pc(57) int local57;
							if (local20 < arg3.length && (local57 = method430(arg3[local20], local32, local30)) > 0) {
								local18 += local57;
								local20++;
							} else {
								if (local20 == 0) {
									break label124;
								}
								@Pc(78) int local78;
								if ((local78 = method430(arg3[local20 - 1], local32, local30)) > 0) {
									local18 += local78;
									if (local20 == 1) {
										local22++;
									}
								} else {
									if (local20 >= arg3.length || !method436(local30)) {
										break label124;
									}
									local18++;
								}
							}
						}
					}
					if (local20 >= arg3.length) {
						@Pc(109) boolean local109 = false;
						@Pc(115) int local115 = method426(arg0, arg5, local14, 12);
						@Pc(123) int local123 = method427(arg0, local18 - 1, arg4);
						if (arg2 == 1 && local115 > 0 && local123 > 0) {
							local109 = true;
						}
						if (arg2 == 2 && (local115 > 2 && local123 > 0 || local115 > 0 && local123 > 2)) {
							local109 = true;
						}
						if (arg2 == 3 && local115 > 0 && local123 > 2) {
							local109 = true;
						}
						@Pc(166) boolean local166;
						if (arg2 == 3 && local115 > 2 && local123 > 0) {
							local166 = true;
						} else {
							local166 = false;
						}
						if (local109) {
							@Pc(173) int local173 = local14;
							@Pc(177) int local177 = local18 - 1;
							@Pc(185) boolean local185;
							@Pc(189) int local189;
							if (local115 > 2) {
								if (local115 == 4) {
									local185 = false;
									for (local189 = local14 - 1; local189 >= 0; local189--) {
										if (local185) {
											if (arg5[local189] != '*') {
												break;
											}
											local173 = local189;
										} else if (arg5[local189] == '*') {
											local173 = local189;
											local185 = true;
										}
									}
								}
								local185 = false;
								for (local189 = local173 - 1; local189 >= 0; local189--) {
									if (local185) {
										if (method436(arg0[local189])) {
											break;
										}
										local173 = local189;
									} else if (!method436(arg0[local189])) {
										local185 = true;
										local173 = local189;
									}
								}
							}
							if (local123 > 2) {
								if (local123 == 4) {
									local185 = false;
									for (local189 = local177 + 1; local189 < arg0.length; local189++) {
										if (local185) {
											if (arg4[local189] != '*') {
												break;
											}
											local177 = local189;
										} else if (arg4[local189] == '*') {
											local177 = local189;
											local185 = true;
										}
									}
								}
								local185 = false;
								for (local189 = local177 + 1; local189 < arg0.length; local189++) {
									if (local185) {
										if (method436(arg0[local189])) {
											break;
										}
										local177 = local189;
									} else if (!method436(arg0[local189])) {
										local185 = true;
										local177 = local189;
									}
								}
							}
							for (@Pc(323) int local323 = local173; local323 <= local177; local323++) {
								arg0[local323] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(346) RuntimeException local346) {
			signlink.reporterror("5195, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local346.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "([C[CII)I")
	private static int method426(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(5) boolean local5 = true;
			if (arg2 == 0) {
				return 2;
			}
			@Pc(13) int local13 = arg2 - 1;
			while (true) {
				if (local13 >= 0 && method436(arg0[local13])) {
					if (arg0[local13] != ',' && arg0[local13] != '.') {
						local13--;
						continue;
					}
					return 3;
				}
				@Pc(38) int local38 = 0;
				for (@Pc(42) int local42 = arg2 - 1; local42 >= 0 && method436(arg1[local42]); local42--) {
					if (arg1[local42] == '*') {
						local38++;
					}
				}
				if (local38 >= 3) {
					return 4;
				}
				if (method436(arg0[arg2 - 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("99120, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "([CZI[C)I")
	private static int method427(@OriginalArg(0) char[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg1 + 1 == arg0.length) {
				return 2;
			}
			@Pc(17) int local17 = arg1 + 1;
			while (true) {
				if (local17 < arg0.length && method436(arg0[local17])) {
					if (arg0[local17] != '\\' && arg0[local17] != '/') {
						local17++;
						continue;
					}
					return 3;
				}
				@Pc(44) int local44 = 0;
				for (@Pc(48) int local48 = arg1 + 1; local48 < arg0.length && method436(arg2[local48]); local48++) {
					if (arg2[local48] == '*') {
						local44++;
					}
				}
				if (local44 >= 5) {
					return 4;
				}
				if (method436(arg0[arg1 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("40495, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "([CI[[B[C)V")
	private static void method428(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) char[] arg3) {
		try {
			@Pc(5) int local5;
			if (arg1 <= 0) {
				for (local5 = 1; local5 > 0; local5++) {
				}
			}
			if (arg3.length <= arg0.length) {
				for (@Pc(20) int local20 = 0; local20 <= arg0.length - arg3.length; local20 += local5) {
					@Pc(24) int local24 = local20;
					@Pc(26) int local26 = 0;
					@Pc(28) int local28 = 0;
					local5 = 1;
					@Pc(32) boolean local32 = false;
					@Pc(34) boolean local34 = false;
					@Pc(36) boolean local36 = false;
					@Pc(44) char var13;
					@Pc(46) char var14;
					label163: while (true) {
						while (true) {
							if (local24 >= arg0.length || local34 && local36) {
								break label163;
							}
							var13 = arg0[local24];
							var14 = '\u0000';
							if (local24 + 1 < arg0.length) {
								var14 = arg0[local24 + 1];
							}
							@Pc(71) int local71;
							if (local26 < arg3.length && (local71 = method431(var14, var13, arg3[local26])) > 0) {
								if (local71 == 1 && method439(var13)) {
									local34 = true;
								}
								if (local71 == 2 && (method439(var13) || method439(var14))) {
									local34 = true;
								}
								local24 += local71;
								local26++;
							} else {
								if (local26 == 0) {
									break label163;
								}
								@Pc(114) int local114;
								if ((local114 = method431(var14, var13, arg3[local26 - 1])) > 0) {
									local24 += local114;
									if (local26 == 1) {
										local5++;
									}
								} else {
									if (local26 >= arg3.length || !method437(var13)) {
										break label163;
									}
									if (method436(var13) && var13 != '\'') {
										local32 = true;
									}
									if (method439(var13)) {
										local36 = true;
									}
									local24++;
									local28++;
									if (local28 * 100 / (local24 - local20) > 90) {
										break label163;
									}
								}
							}
						}
					}
					if (local26 >= arg3.length && (!local34 || !local36)) {
						@Pc(179) boolean local179 = true;
						@Pc(275) int local275;
						if (local32) {
							@Pc(225) boolean local225 = false;
							@Pc(227) boolean local227 = false;
							if (local20 - 1 < 0 || method436(arg0[local20 - 1]) && arg0[local20 - 1] != '\'') {
								local225 = true;
							}
							if (local24 >= arg0.length || method436(arg0[local24]) && arg0[local24] != '\'') {
								local227 = true;
							}
							if (!local225 || !local227) {
								@Pc(271) boolean local271 = false;
								local275 = local20 - 2;
								if (local225) {
									local275 = local20;
								}
								while (!local271 && local275 < local24) {
									if (local275 >= 0 && (!method436(arg0[local275]) || arg0[local275] == '\'')) {
										@Pc(297) char[] local297 = new char[3];
										@Pc(299) int local299;
										for (local299 = 0; local299 < 3 && local275 + local299 < arg0.length && (!method436(arg0[local275 + local299]) || arg0[local275 + local299] == '\''); local299++) {
											local297[local299] = arg0[local275 + local299];
										}
										@Pc(337) boolean local337 = true;
										if (local299 == 0) {
											local337 = false;
										}
										if (local299 < 3 && local275 - 1 >= 0 && (!method436(arg0[local275 - 1]) || arg0[local275 - 1] == '\'')) {
											local337 = false;
										}
										if (local337 && !method442(local297, 528)) {
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
							var13 = ' ';
							if (local20 - 1 >= 0) {
								var13 = arg0[local20 - 1];
							}
							var14 = ' ';
							if (local24 < arg0.length) {
								var14 = arg0[local24];
							}
							@Pc(207) byte local207 = method432(var13);
							@Pc(211) byte local211 = method432(var14);
							if (arg2 != null && method429(local207, local211, arg2)) {
								local179 = false;
							}
						}
						if (local179) {
							@Pc(387) int local387 = 0;
							@Pc(389) int local389 = 0;
							for (@Pc(391) int local391 = local20; local391 < local24; local391++) {
								if (method439(arg0[local391])) {
									local387++;
								} else if (method438(arg0[local391])) {
									local389++;
								}
							}
							if (local387 <= local389) {
								for (local275 = local20; local275 < local24; local275++) {
									arg0[local275] = '*';
								}
							}
						}
					}
				}
			}
		} catch (@Pc(441) RuntimeException local441) {
			signlink.reporterror("10689, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local441.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BBZ[[B)Z")
	private static boolean method429(@OriginalArg(0) byte arg0, @OriginalArg(1) byte arg1, @OriginalArg(3) byte[][] arg2) {
		try {
			@Pc(7) int local7 = 0;
			if (arg2[0][0] == arg0 && arg2[0][1] == arg1) {
				return true;
			}
			@Pc(28) int local28 = arg2.length - 1;
			if (arg2[local28][0] == arg0 && arg2[local28][1] == arg1) {
				return true;
			}
			do {
				@Pc(50) int local50 = (local7 + local28) / 2;
				if (arg2[local50][0] == arg0 && arg2[local50][1] == arg1) {
					return true;
				}
				if (arg0 < arg2[local50][0] || arg0 == arg2[local50][0] && arg1 < arg2[local50][1]) {
					local28 = local50;
				} else {
					local7 = local50;
				}
			} while (local7 != local28 && local7 + 1 != local28);
			return false;
		} catch (@Pc(104) RuntimeException local104) {
			signlink.reporterror("77, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + local104.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ICCC)I")
	private static int method430(@OriginalArg(1) char arg0, @OriginalArg(2) char arg1, @OriginalArg(3) char arg2) {
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
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("62147, " + 3 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(CZCC)I")
	private static int method431(@OriginalArg(0) char arg0, @OriginalArg(2) char arg1, @OriginalArg(3) char arg2) {
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
			signlink.reporterror("39409, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + local497.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(CI)B")
	private static byte method432(@OriginalArg(0) char arg0) {
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
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("27074, " + arg0 + ", " + -995 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "([CZ)V")
	private static void method433(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(9) int local9 = 0;
			@Pc(11) int local11 = 0;
			@Pc(13) int local13 = 0;
			while (true) {
				do {
					@Pc(112) int local112;
					if ((local112 = method434(local9, arg0)) == -1) {
						return;
					}
					@Pc(17) boolean local17 = false;
					for (@Pc(19) int local19 = local9; local19 >= 0 && local19 < local112 && !local17; local19++) {
						if (!method436(arg0[local19]) && !method437(arg0[local19])) {
							local17 = true;
						}
					}
					if (local17) {
						local11 = 0;
					}
					if (local11 == 0) {
						local13 = local112;
					}
					local9 = method435(local112, arg0);
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
			signlink.reporterror("29210, " + arg0 + ", " + false + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I[CI)I")
	private static int method434(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1) {
		try {
			for (@Pc(1) int local1 = arg0; local1 < arg1.length && local1 >= 0; local1++) {
				if (arg1[local1] >= '0' && arg1[local1] <= '9') {
					return local1;
				}
			}
			return -1;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("37465, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(II[C)I")
	private static int method435(@OriginalArg(1) int arg0, @OriginalArg(2) char[] arg1) {
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
			signlink.reporterror("63598, " + 574 + ", " + arg0 + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(CI)Z")
	private static boolean method436(@OriginalArg(0) char arg0) {
		try {
			return !method438(arg0) && !method439(arg0);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("3781, " + arg0 + ", " + 0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "(CI)Z")
	private static boolean method437(@OriginalArg(0) char arg0) {
		try {
			if (arg0 >= 'a' && arg0 <= 'z') {
				return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
			} else {
				return true;
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("32336, " + arg0 + ", " + 123 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IC)Z")
	private static boolean method438(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("50741, " + 3 + ", " + arg0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BC)Z")
	private static boolean method439(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= '0' && arg0 <= '9';
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("41230, " + 56 + ", " + arg0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZC)Z")
	private static boolean method440(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z';
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("64489, " + false + ", " + arg0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(CB)Z")
	private static boolean method441(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("24721, " + arg0 + ", " + 24 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "([CI)Z")
	private static boolean method442(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1) {
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
			@Pc(32) int local32 = method443(arg0);
			@Pc(36) boolean local36 = false;
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
			signlink.reporterror("32593, " + arg0 + ", " + arg1 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z[C)I")
	private static int method443(@OriginalArg(1) char[] arg0) {
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
			signlink.reporterror("14224, " + false + ", " + arg0 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}
}
