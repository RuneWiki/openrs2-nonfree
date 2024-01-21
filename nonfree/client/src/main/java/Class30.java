import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!PPZVZYJC")
public final class Class30 {

	@OriginalMember(owner = "client!PPZVZYJC", name = "d", descriptor = "I")
	private static int anInt637;

	@OriginalMember(owner = "client!PPZVZYJC", name = "f", descriptor = "Z")
	private static boolean aBoolean127;

	@OriginalMember(owner = "client!PPZVZYJC", name = "i", descriptor = "Z")
	private static boolean aBoolean129;

	@OriginalMember(owner = "client!PPZVZYJC", name = "j", descriptor = "[I")
	private static int[] anIntArray141;

	@OriginalMember(owner = "client!PPZVZYJC", name = "k", descriptor = "[[C")
	private static char[][] aCharArrayArray1;

	@OriginalMember(owner = "client!PPZVZYJC", name = "l", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!PPZVZYJC", name = "m", descriptor = "[[C")
	private static char[][] aCharArrayArray2;

	@OriginalMember(owner = "client!PPZVZYJC", name = "n", descriptor = "[[C")
	private static char[][] aCharArrayArray3;

	@OriginalMember(owner = "client!PPZVZYJC", name = "o", descriptor = "[I")
	private static int[] anIntArray142;

	@OriginalMember(owner = "client!PPZVZYJC", name = "a", descriptor = "I")
	private static int anInt635 = 42058;

	@OriginalMember(owner = "client!PPZVZYJC", name = "b", descriptor = "I")
	private static int anInt636 = 875;

	@OriginalMember(owner = "client!PPZVZYJC", name = "c", descriptor = "Z")
	private static boolean aBoolean125 = true;

	@OriginalMember(owner = "client!PPZVZYJC", name = "e", descriptor = "Z")
	private static boolean aBoolean126 = true;

	@OriginalMember(owner = "client!PPZVZYJC", name = "g", descriptor = "Z")
	private static boolean aBoolean128 = true;

	@OriginalMember(owner = "client!PPZVZYJC", name = "h", descriptor = "I")
	private static int anInt638 = 969;

	@OriginalMember(owner = "client!PPZVZYJC", name = "p", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray4 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

	@OriginalMember(owner = "client!PPZVZYJC", name = "a", descriptor = "(Lclient!HBJEXSJX;)V")
	public static void method437(@OriginalArg(0) Class13 arg0) {
		@Pc(10) Class1_Sub1_Sub3 local10 = new Class1_Sub1_Sub3(arg0.method278("fragmentsenc.txt", null), 0);
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(arg0.method278("badenc.txt", null), 0);
		@Pc(28) Class1_Sub1_Sub3 local28 = new Class1_Sub1_Sub3(arg0.method278("domainenc.txt", null), 0);
		@Pc(37) Class1_Sub1_Sub3 local37 = new Class1_Sub1_Sub3(arg0.method278("tldlist.txt", null), 0);
		method438(local10, local19, local28, local37);
	}

	@OriginalMember(owner = "client!PPZVZYJC", name = "a", descriptor = "(Lclient!EYMNCFMK;Lclient!EYMNCFMK;Lclient!EYMNCFMK;Lclient!EYMNCFMK;)V")
	private static void method438(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) Class1_Sub1_Sub3 arg2, @OriginalArg(3) Class1_Sub1_Sub3 arg3) {
		method440(arg1);
		method441(arg2);
		method442(arg0);
		method439(arg3);
	}

	@OriginalMember(owner = "client!PPZVZYJC", name = "a", descriptor = "(ILclient!EYMNCFMK;)V")
	private static void method439(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(4) int local4 = arg0.method160();
			aCharArrayArray3 = new char[local4][];
			anIntArray142 = new int[local4];
			for (@Pc(21) int local21 = 0; local21 < local4; local21++) {
				anIntArray142[local21] = arg0.method155();
				@Pc(32) char[] local32 = new char[arg0.method155()];
				for (@Pc(34) int local34 = 0; local34 < local32.length; local34++) {
					local32[local34] = (char) arg0.method155();
				}
				aCharArrayArray3[local21] = local32;
			}
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("32395, " + -261 + ", " + arg0 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PPZVZYJC", name = "a", descriptor = "(Lclient!EYMNCFMK;B)V")
	private static void method440(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(4) int local4 = arg0.method160();
			aCharArrayArray1 = new char[local4][];
			aByteArrayArrayArray7 = new byte[local4][][];
			method443(aCharArrayArray1, aByteArrayArrayArray7, arg0);
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("98321, " + arg0 + ", " + 0 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PPZVZYJC", name = "a", descriptor = "(Lclient!EYMNCFMK;I)V")
	private static void method441(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(2) int local2 = arg0.method160();
			aCharArrayArray2 = new char[local2][];
			method444(arg0, aCharArrayArray2);
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("99450, " + arg0 + ", " + -58 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PPZVZYJC", name = "b", descriptor = "(Lclient!EYMNCFMK;B)V")
	private static void method442(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			anIntArray141 = new int[arg0.method160()];
			for (@Pc(14) int local14 = 0; local14 < anIntArray141.length; local14++) {
				anIntArray141[local14] = arg0.method157();
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("16119, " + arg0 + ", " + 0 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PPZVZYJC", name = "a", descriptor = "([[CI[[[BLclient!EYMNCFMK;)V")
	private static void method443(@OriginalArg(0) char[][] arg0, @OriginalArg(2) byte[][][] arg1, @OriginalArg(3) Class1_Sub1_Sub3 arg2) {
		try {
			for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
				@Pc(19) char[] local19 = new char[arg2.method155()];
				for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
					local19[local21] = (char) arg2.method155();
				}
				arg0[local13] = local19;
				@Pc(43) byte[][] local43 = new byte[arg2.method155()][2];
				for (@Pc(45) int local45 = 0; local45 < local43.length; local45++) {
					local43[local45][0] = (byte) arg2.method155();
					local43[local45][1] = (byte) arg2.method155();
				}
				if (local43.length > 0) {
					arg1[local13] = local43;
				}
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("23781, " + arg0 + ", " + 376 + ", " + arg1 + ", " + arg2 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PPZVZYJC", name = "a", descriptor = "(Lclient!EYMNCFMK;Z[[C)V")
	private static void method444(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(2) char[][] arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
				@Pc(9) char[] local9 = new char[arg0.method155()];
				for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
					local9[local11] = (char) arg0.method155();
				}
				arg1[local3] = local9;
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("16845, " + arg0 + ", " + true + ", " + arg1 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PPZVZYJC", name = "a", descriptor = "(Z[C)V")
	private static void method445(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) int local3 = 0;
			for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
				if (method446(arg0[local13])) {
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
			signlink.reporterror("23795, " + true + ", " + arg0 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PPZVZYJC", name = "a", descriptor = "(CZ)Z")
	private static boolean method446(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= ' ' && arg0 <= '\u007f' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("51024, " + arg0 + ", " + false + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PPZVZYJC", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method447(@OriginalArg(1) String arg0) {
		try {
			@Pc(3) long local3 = System.currentTimeMillis();
			@Pc(6) char[] local6 = arg0.toCharArray();
			method445(local6);
			@Pc(15) String local15 = (new String(local6)).trim();
			@Pc(19) char[] local19 = local15.toLowerCase().toCharArray();
			@Pc(22) String local22 = local15.toLowerCase();
			method455(local19);
			method450(local19);
			method451(local19, (byte) 5);
			method464(local19);
			for (@Pc(42) int local42 = 0; local42 < aStringArray4.length; local42++) {
				@Pc(52) int local52 = -1;
				while ((local52 = local22.indexOf(aStringArray4[local42], local52 + 1)) != -1) {
					@Pc(59) char[] local59 = aStringArray4[local42].toCharArray();
					for (@Pc(61) int local61 = 0; local61 < local59.length; local61++) {
						local19[local61 + local52] = local59[local61];
					}
				}
			}
			method448(local19, local15.toCharArray());
			method449(local19);
			@Pc(103) long local103 = System.currentTimeMillis();
			return (new String(local19)).trim();
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("84409, " + false + ", " + arg0 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PPZVZYJC", name = "a", descriptor = "([C[CB)V")
	private static void method448(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1) {
		try {
			for (@Pc(13) int local13 = 0; local13 < arg1.length; local13++) {
				if (arg0[local13] != '*' && method472(arg1[local13])) {
					arg0[local13] = arg1[local13];
				}
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("96639, " + arg0 + ", " + arg1 + ", " + -124 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PPZVZYJC", name = "b", descriptor = "(Z[C)V")
	private static void method449(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				@Pc(11) char local11 = arg0[local5];
				if (!method469(local11)) {
					local3 = true;
				} else if (local3) {
					if (method471(local11)) {
						local3 = false;
					}
				} else if (method472(local11)) {
					arg0[local5] = (char) (local11 + 'a' - 65);
				}
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("24856, " + false + ", " + arg0 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PPZVZYJC", name = "a", descriptor = "(I[C)V")
	private static void method450(@OriginalArg(1) char[] arg0) {
		try {
			for (@Pc(8) int local8 = 0; local8 < 2; local8++) {
				for (@Pc(15) int local15 = aCharArrayArray1.length - 1; local15 >= 0; local15--) {
					method459(aByteArrayArrayArray7[local15], arg0, aCharArrayArray1[local15]);
				}
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("62455, " + -822 + ", " + arg0 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PPZVZYJC", name = "a", descriptor = "([CB)V")
	private static void method451(@OriginalArg(0) char[] arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(5) char[] local5 = (char[]) arg0.clone();
			@Pc(10) boolean local10 = false;
			@Pc(29) char[] local29 = new char[] { '(', 'a', ')' };
			method459(null, local5, local29);
			@Pc(38) char[] local38 = (char[]) arg0.clone();
			@Pc(53) char[] local53 = new char[] { 'd', 'o', 't' };
			method459(null, local38, local53);
			for (@Pc(63) int local63 = aCharArrayArray2.length - 1; local63 >= 0; local63--) {
				method452(aCharArrayArray2[local63], local38, arg0, local5);
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("56744, " + arg0 + ", " + arg1 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PPZVZYJC", name = "a", descriptor = "(I[C[C[C[C)V")
	private static void method452(@OriginalArg(1) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2, @OriginalArg(4) char[] arg3) {
		try {
			if (arg0.length <= arg2.length) {
				@Pc(23) int local23;
				for (@Pc(15) int local15 = 0; local15 <= arg2.length - arg0.length; local15 += local23) {
					@Pc(19) int local19 = local15;
					@Pc(21) int local21 = 0;
					local23 = 1;
					label58: while (true) {
						while (true) {
							if (local19 >= arg2.length) {
								break label58;
							}
							@Pc(31) char local31 = arg2[local19];
							@Pc(33) char local33 = 0;
							if (local19 + 1 < arg2.length) {
								local33 = arg2[local19 + 1];
							}
							@Pc(58) int local58;
							if (local21 < arg0.length && (local58 = method461(arg0[local21], local31, local33)) > 0) {
								local19 += local58;
								local21++;
							} else {
								if (local21 == 0) {
									break label58;
								}
								@Pc(79) int local79;
								if ((local79 = method461(arg0[local21 - 1], local31, local33)) > 0) {
									local19 += local79;
									if (local21 == 1) {
										local23++;
									}
								} else {
									if (local21 >= arg0.length || !method467(local31, anInt638)) {
										break label58;
									}
									local19++;
								}
							}
						}
					}
					if (local21 >= arg0.length) {
						@Pc(110) boolean local110 = false;
						@Pc(116) int local116 = method453(local15, arg3, arg2);
						@Pc(124) int local124 = method454(arg1, local19 - 1, arg2);
						if (local116 > 2 || local124 > 2) {
							local110 = true;
						}
						if (local110) {
							for (@Pc(136) int local136 = local15; local136 < local19; local136++) {
								arg2[local136] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("14384, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PPZVZYJC", name = "a", descriptor = "(I[C[CI)I")
	private static int method453(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2) {
		try {
			if (arg0 == 0) {
				return 2;
			}
			for (@Pc(9) int local9 = arg0 - 1; local9 >= 0 && method467(arg2[local9], anInt638); local9--) {
				if (arg2[local9] == '@') {
					return 3;
				}
			}
			@Pc(29) int local29 = 0;
			for (@Pc(41) int local41 = arg0 - 1; local41 >= 0 && method467(arg1[local41], anInt638); local41--) {
				if (arg1[local41] == '*') {
					local29++;
				}
			}
			if (local29 >= 3) {
				return 4;
			} else if (method467(arg2[arg0 - 1], anInt638)) {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("10497, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 8 + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PPZVZYJC", name = "a", descriptor = "([CI[CI)I")
	private static int method454(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) char[] arg2) {
		try {
			if (arg1 + 1 == arg2.length) {
				return 2;
			}
			@Pc(13) int local13 = arg1 + 1;
			while (true) {
				if (local13 < arg2.length && method467(arg2[local13], anInt638)) {
					if (arg2[local13] != '.' && arg2[local13] != ',') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(40) int local40 = 0;
				for (@Pc(48) int local48 = arg1 + 1; local48 < arg2.length && method467(arg0[local48], anInt638); local48++) {
					if (arg0[local48] == '*') {
						local40++;
					}
				}
				if (local40 >= 3) {
					return 4;
				}
				if (method467(arg2[arg1 + 1], anInt638)) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("99008, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PPZVZYJC", name = "a", descriptor = "([CI)V")
	private static void method455(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(18) char[] local18 = new char[] { 'd', 'o', 't' };
			method459(null, local3, local18);
			@Pc(27) char[] local27 = (char[]) arg0.clone();
			@Pc(50) char[] local50 = new char[] { 's', 'l', 'a', 's', 'h' };
			method459(null, local27, local50);
			for (@Pc(57) int local57 = 0; local57 < aCharArrayArray3.length; local57++) {
				method456(anIntArray142[local57], local3, aBoolean128, arg0, local27, aCharArrayArray3[local57]);
			}
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("26783, " + arg0 + ", " + 62 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PPZVZYJC", name = "a", descriptor = "(I[CZ[C[C[C)V")
	private static void method456(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) char[] arg3, @OriginalArg(4) char[] arg4, @OriginalArg(5) char[] arg5) {
		try {
			@Pc(5) int local5;
			if (!arg2) {
				for (local5 = 1; local5 > 0; local5++) {
				}
			}
			if (arg5.length <= arg3.length) {
				for (@Pc(20) int local20 = 0; local20 <= arg3.length - arg5.length; local20 += local5) {
					@Pc(24) int local24 = local20;
					@Pc(26) int local26 = 0;
					local5 = 1;
					label124: while (true) {
						while (true) {
							if (local24 >= arg3.length) {
								break label124;
							}
							@Pc(36) char local36 = arg3[local24];
							@Pc(38) char local38 = 0;
							if (local24 + 1 < arg3.length) {
								local38 = arg3[local24 + 1];
							}
							@Pc(63) int local63;
							if (local26 < arg5.length && (local63 = method461(arg5[local26], local36, local38)) > 0) {
								local24 += local63;
								local26++;
							} else {
								if (local26 == 0) {
									break label124;
								}
								@Pc(84) int local84;
								if ((local84 = method461(arg5[local26 - 1], local36, local38)) > 0) {
									local24 += local84;
									if (local26 == 1) {
										local5++;
									}
								} else {
									if (local26 >= arg5.length || !method467(local36, anInt638)) {
										break label124;
									}
									local24++;
								}
							}
						}
					}
					if (local26 >= arg5.length) {
						@Pc(115) boolean local115 = false;
						@Pc(121) int local121 = method457(local20, arg1, arg3);
						@Pc(129) int local129 = method458(arg4, local24 - 1, arg3);
						if (arg0 == 1 && local121 > 0 && local129 > 0) {
							local115 = true;
						}
						if (arg0 == 2 && (local121 > 2 && local129 > 0 || local121 > 0 && local129 > 2)) {
							local115 = true;
						}
						if (arg0 == 3 && local121 > 0 && local129 > 2) {
							local115 = true;
						}
						@Pc(172) boolean local172;
						if (arg0 == 3 && local121 > 2 && local129 > 0) {
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
											if (arg1[local195] != '*') {
												break;
											}
											local179 = local195;
										} else if (arg1[local195] == '*') {
											local179 = local195;
											local191 = true;
										}
									}
								}
								local191 = false;
								for (local195 = local179 - 1; local195 >= 0; local195--) {
									if (local191) {
										if (method467(arg3[local195], anInt638)) {
											break;
										}
										local179 = local195;
									} else if (!method467(arg3[local195], anInt638)) {
										local191 = true;
										local179 = local195;
									}
								}
							}
							if (local129 > 2) {
								if (local129 == 4) {
									local191 = false;
									for (local195 = local183 + 1; local195 < arg3.length; local195++) {
										if (local191) {
											if (arg4[local195] != '*') {
												break;
											}
											local183 = local195;
										} else if (arg4[local195] == '*') {
											local183 = local195;
											local191 = true;
										}
									}
								}
								local191 = false;
								for (local195 = local183 + 1; local195 < arg3.length; local195++) {
									if (local191) {
										if (method467(arg3[local195], anInt638)) {
											break;
										}
										local183 = local195;
									} else if (!method467(arg3[local195], anInt638)) {
										local191 = true;
										local183 = local195;
									}
								}
							}
							for (@Pc(329) int local329 = local179; local329 <= local183; local329++) {
								arg3[local329] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(352) RuntimeException local352) {
			signlink.reporterror("24473, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local352.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PPZVZYJC", name = "a", descriptor = "(I[CI[C)I")
	private static int method457(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg0 == 0) {
				return 2;
			}
			@Pc(13) int local13 = arg0 - 1;
			while (true) {
				if (local13 >= 0 && method467(arg2[local13], anInt638)) {
					if (arg2[local13] != ',' && arg2[local13] != '.') {
						local13--;
						continue;
					}
					return 3;
				}
				@Pc(38) int local38 = 0;
				for (@Pc(42) int local42 = arg0 - 1; local42 >= 0 && method467(arg1[local42], anInt638); local42--) {
					if (arg1[local42] == '*') {
						local38++;
					}
				}
				if (local38 >= 3) {
					return 4;
				}
				if (method467(arg2[arg0 - 1], anInt638)) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("3008, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PPZVZYJC", name = "a", descriptor = "([CIZ[C)I")
	private static int method458(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg1 + 1 == arg2.length) {
				return 2;
			}
			@Pc(13) int local13 = arg1 + 1;
			while (true) {
				if (local13 < arg2.length && method467(arg2[local13], anInt638)) {
					if (arg2[local13] != '\\' && arg2[local13] != '/') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(40) int local40 = 0;
				for (@Pc(44) int local44 = arg1 + 1; local44 < arg2.length && method467(arg0[local44], anInt638); local44++) {
					if (arg0[local44] == '*') {
						local40++;
					}
				}
				if (local40 >= 5) {
					return 4;
				}
				if (method467(arg2[arg1 + 1], anInt638)) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("14192, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PPZVZYJC", name = "a", descriptor = "([[B[C[CZ)V")
	private static void method459(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2) {
		try {
			if (arg2.length <= arg1.length) {
				@Pc(25) int local25;
				for (@Pc(15) int local15 = 0; local15 <= arg1.length - arg2.length; local15 += local25) {
					@Pc(19) int local19 = local15;
					@Pc(21) int local21 = 0;
					@Pc(23) int local23 = 0;
					local25 = 1;
					@Pc(27) boolean local27 = false;
					@Pc(29) boolean local29 = false;
					@Pc(31) boolean local31 = false;
					@Pc(39) char var12;
					@Pc(41) char var13;
					label164: while (true) {
						while (true) {
							if (local19 >= arg1.length || local29 && local31) {
								break label164;
							}
							var12 = arg1[local19];
							var13 = '\u0000';
							if (local19 + 1 < arg1.length) {
								var13 = arg1[local19 + 1];
							}
							@Pc(66) int local66;
							if (local21 < arg2.length && (local66 = method462(var12, arg2[local21], var13)) > 0) {
								if (local66 == 1 && method470(var12)) {
									local29 = true;
								}
								if (local66 == 2 && (method470(var12) || method470(var13))) {
									local29 = true;
								}
								local19 += local66;
								local21++;
							} else {
								if (local21 == 0) {
									break label164;
								}
								@Pc(109) int local109;
								if ((local109 = method462(var12, arg2[local21 - 1], var13)) > 0) {
									local19 += local109;
									if (local21 == 1) {
										local25++;
									}
								} else {
									if (local21 >= arg2.length || !method468(var12)) {
										break label164;
									}
									if (method467(var12, anInt638) && var12 != '\'') {
										local27 = true;
									}
									if (method470(var12)) {
										local31 = true;
									}
									local19++;
									local23++;
									if (local23 * 100 / (local19 - local15) > 90) {
										break label164;
									}
								}
							}
						}
					}
					if (local21 >= arg2.length && (!local29 || !local31)) {
						@Pc(174) boolean local174 = true;
						@Pc(270) int local270;
						if (local27) {
							@Pc(220) boolean local220 = false;
							@Pc(222) boolean local222 = false;
							if (local15 - 1 < 0 || method467(arg1[local15 - 1], anInt638) && arg1[local15 - 1] != '\'') {
								local220 = true;
							}
							if (local19 >= arg1.length || method467(arg1[local19], anInt638) && arg1[local19] != '\'') {
								local222 = true;
							}
							if (!local220 || !local222) {
								@Pc(266) boolean local266 = false;
								local270 = local15 - 2;
								if (local220) {
									local270 = local15;
								}
								while (!local266 && local270 < local19) {
									if (local270 >= 0 && (!method467(arg1[local270], anInt638) || arg1[local270] == '\'')) {
										@Pc(292) char[] local292 = new char[3];
										@Pc(294) int local294;
										for (local294 = 0; local294 < 3 && local270 + local294 < arg1.length && (!method467(arg1[local270 + local294], anInt638) || arg1[local270 + local294] == '\''); local294++) {
											local292[local294] = arg1[local270 + local294];
										}
										@Pc(332) boolean local332 = true;
										if (local294 == 0) {
											local332 = false;
										}
										if (local294 < 3 && local270 - 1 >= 0 && (!method467(arg1[local270 - 1], anInt638) || arg1[local270 - 1] == '\'')) {
											local332 = false;
										}
										if (local332 && !method473(local292)) {
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
							var12 = ' ';
							if (local15 - 1 >= 0) {
								var12 = arg1[local15 - 1];
							}
							var13 = ' ';
							if (local19 < arg1.length) {
								var13 = arg1[local19];
							}
							@Pc(202) byte local202 = method463(var12);
							@Pc(206) byte local206 = method463(var13);
							if (arg0 != null && method460(local206, arg0, local202)) {
								local174 = false;
							}
						}
						if (local174) {
							@Pc(382) int local382 = 0;
							@Pc(384) int local384 = 0;
							@Pc(386) int local386 = -1;
							for (local270 = local15; local270 < local19; local270++) {
								if (method470(arg1[local270])) {
									local382++;
								} else if (method469(arg1[local270])) {
									local384++;
									local386 = local270;
								}
							}
							if (local386 > -1) {
								local382 -= local19 - local386 - 1;
							}
							if (local382 <= local384) {
								for (@Pc(428) int local428 = local15; local428 < local19; local428++) {
									arg1[local428] = '*';
								}
							} else {
								local25 = 1;
							}
						}
					}
				}
			}
		} catch (@Pc(455) RuntimeException local455) {
			signlink.reporterror("23481, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + local455.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PPZVZYJC", name = "a", descriptor = "(BB[[BB)Z")
	private static boolean method460(@OriginalArg(0) byte arg0, @OriginalArg(2) byte[][] arg1, @OriginalArg(3) byte arg2) {
		try {
			@Pc(1) int local1 = 0;
			if (arg1[0][0] == arg2 && arg1[0][1] == arg0) {
				return true;
			}
			@Pc(22) int local22 = arg1.length - 1;
			if (arg1[local22][0] == arg2 && arg1[local22][1] == arg0) {
				return true;
			}
			do {
				@Pc(49) int local49 = (local1 + local22) / 2;
				if (arg1[local49][0] == arg2 && arg1[local49][1] == arg0) {
					return true;
				}
				if (arg2 < arg1[local49][0] || arg2 == arg1[local49][0] && arg0 < arg1[local49][1]) {
					local22 = local49;
				} else {
					local1 = local49;
				}
			} while (local1 != local22 && local1 + 1 != local22);
			return false;
		} catch (@Pc(103) RuntimeException local103) {
			signlink.reporterror("30692, " + arg0 + ", " + -106 + ", " + arg1 + ", " + arg2 + ", " + local103.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PPZVZYJC", name = "a", descriptor = "(CZCC)I")
	private static int method461(@OriginalArg(0) char arg0, @OriginalArg(2) char arg1, @OriginalArg(3) char arg2) {
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
			signlink.reporterror("49773, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PPZVZYJC", name = "a", descriptor = "(CICC)I")
	private static int method462(@OriginalArg(0) char arg0, @OriginalArg(2) char arg1, @OriginalArg(3) char arg2) {
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
			signlink.reporterror("55835, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + local512.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PPZVZYJC", name = "a", descriptor = "(IC)B")
	private static byte method463(@OriginalArg(1) char arg0) {
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
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("49249, " + 534 + ", " + arg0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PPZVZYJC", name = "b", descriptor = "([CI)V")
	private static void method464(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			@Pc(9) int local9 = 0;
			while (true) {
				do {
					@Pc(117) int local117;
					if ((local117 = method465(arg0, local5)) == -1) {
						return;
					}
					@Pc(22) boolean local22 = false;
					for (@Pc(24) int local24 = local5; local24 >= 0 && local24 < local117 && !local22; local24++) {
						if (!method467(arg0[local24], anInt638) && !method468(arg0[local24])) {
							local22 = true;
						}
					}
					if (local22) {
						local7 = 0;
					}
					if (local7 == 0) {
						local9 = local117;
					}
					local5 = method466(arg0, local117);
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
			signlink.reporterror("49449, " + arg0 + ", " + -923 + ", " + local121.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PPZVZYJC", name = "a", descriptor = "([CII)I")
	private static int method465(@OriginalArg(0) char[] arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(14) int local14 = arg1; local14 < arg0.length && local14 >= 0; local14++) {
				if (arg0[local14] >= '0' && arg0[local14] <= '9') {
					return local14;
				}
			}
			return -1;
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("43396, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PPZVZYJC", name = "a", descriptor = "(Z[CI)I")
	private static int method466(@OriginalArg(1) char[] arg0, @OriginalArg(2) int arg1) {
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
			signlink.reporterror("28399, " + false + ", " + arg0 + ", " + arg1 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PPZVZYJC", name = "a", descriptor = "(CI)Z")
	private static boolean method467(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) int local3 = 69 / arg1;
			return !method469(arg0) && !method470(arg0);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("14287, " + arg0 + ", " + arg1 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PPZVZYJC", name = "b", descriptor = "(IC)Z")
	private static boolean method468(@OriginalArg(1) char arg0) {
		try {
			if (arg0 >= 'a' && arg0 <= 'z') {
				return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
			} else {
				return true;
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("99007, " + -45631 + ", " + arg0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PPZVZYJC", name = "a", descriptor = "(BC)Z")
	private static boolean method469(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("17281, " + -10 + ", " + arg0 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PPZVZYJC", name = "b", descriptor = "(BC)Z")
	private static boolean method470(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= '0' && arg0 <= '9';
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("5144, " + -56 + ", " + arg0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PPZVZYJC", name = "b", descriptor = "(CI)Z")
	private static boolean method471(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z';
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("48490, " + arg0 + ", " + 8 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PPZVZYJC", name = "b", descriptor = "(CZ)Z")
	private static boolean method472(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("83252, " + arg0 + ", " + false + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PPZVZYJC", name = "c", descriptor = "([CI)Z")
	private static boolean method473(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				if (!method470(arg0[local5]) && arg0[local5] != '\u0000') {
					local3 = false;
				}
			}
			if (local3) {
				return true;
			}
			@Pc(32) int local32 = method474(arg0);
			@Pc(43) int local43 = 0;
			@Pc(48) int local48 = anIntArray141.length - 1;
			if (local32 == anIntArray141[0] || local32 == anIntArray141[local48]) {
				return true;
			}
			do {
				@Pc(66) int local66 = (local43 + local48) / 2;
				if (local32 == anIntArray141[local66]) {
					return true;
				}
				if (local32 < anIntArray141[local66]) {
					local48 = local66;
				} else {
					local43 = local66;
				}
			} while (local43 != local48 && local43 + 1 != local48);
			return false;
		} catch (@Pc(95) RuntimeException local95) {
			signlink.reporterror("23499, " + arg0 + ", " + 897 + ", " + local95.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PPZVZYJC", name = "d", descriptor = "([CI)I")
	private static int method474(@OriginalArg(0) char[] arg0) {
		try {
			if (arg0.length > 6) {
				return 0;
			}
			@Pc(13) int local13 = 0;
			for (@Pc(15) int local15 = 0; local15 < arg0.length; local15++) {
				@Pc(26) char local26 = arg0[arg0.length - local15 - 1];
				if (local26 >= 'a' && local26 <= 'z') {
					local13 = local13 * 38 + local26 + 1 - 'a';
				} else if (local26 == '\'') {
					local13 = local13 * 38 + 27;
				} else if (local26 >= '0' && local26 <= '9') {
					local13 = local13 * 38 + local26 + 28 - '0';
				} else if (local26 != '\u0000') {
					return 0;
				}
			}
			return local13;
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("11671, " + arg0 + ", " + -553 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}
}
