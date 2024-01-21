import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!OWMPGCSS")
public final class Class27 {

	@OriginalMember(owner = "client!OWMPGCSS", name = "a", descriptor = "Z")
	private static boolean aBoolean109;

	@OriginalMember(owner = "client!OWMPGCSS", name = "d", descriptor = "Z")
	private static boolean aBoolean112;

	@OriginalMember(owner = "client!OWMPGCSS", name = "f", descriptor = "I")
	private static int anInt467;

	@OriginalMember(owner = "client!OWMPGCSS", name = "l", descriptor = "[I")
	private static int[] anIntArray143;

	@OriginalMember(owner = "client!OWMPGCSS", name = "m", descriptor = "[[C")
	private static char[][] aCharArrayArray1;

	@OriginalMember(owner = "client!OWMPGCSS", name = "n", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!OWMPGCSS", name = "o", descriptor = "[[C")
	private static char[][] aCharArrayArray2;

	@OriginalMember(owner = "client!OWMPGCSS", name = "p", descriptor = "[[C")
	private static char[][] aCharArrayArray3;

	@OriginalMember(owner = "client!OWMPGCSS", name = "q", descriptor = "[I")
	private static int[] anIntArray144;

	@OriginalMember(owner = "client!OWMPGCSS", name = "b", descriptor = "Z")
	private static boolean aBoolean110 = true;

	@OriginalMember(owner = "client!OWMPGCSS", name = "c", descriptor = "Z")
	private static boolean aBoolean111 = true;

	@OriginalMember(owner = "client!OWMPGCSS", name = "e", descriptor = "I")
	private static int anInt466 = 15655;

	@OriginalMember(owner = "client!OWMPGCSS", name = "g", descriptor = "I")
	private static int anInt468 = 203;

	@OriginalMember(owner = "client!OWMPGCSS", name = "h", descriptor = "Z")
	private static boolean aBoolean113 = true;

	@OriginalMember(owner = "client!OWMPGCSS", name = "i", descriptor = "I")
	private static int anInt469 = -792;

	@OriginalMember(owner = "client!OWMPGCSS", name = "j", descriptor = "I")
	private static int anInt470 = 420;

	@OriginalMember(owner = "client!OWMPGCSS", name = "k", descriptor = "I")
	private static int anInt471 = 4;

	@OriginalMember(owner = "client!OWMPGCSS", name = "r", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray3 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

	@OriginalMember(owner = "client!OWMPGCSS", name = "a", descriptor = "(Lclient!SXKKBWPU;)V")
	public static void method267(@OriginalArg(0) Class35 arg0) {
		@Pc(10) Class8_Sub1_Sub3 local10 = new Class8_Sub1_Sub3(arg0.method364("fragmentsenc.txt", null), -631);
		@Pc(19) Class8_Sub1_Sub3 local19 = new Class8_Sub1_Sub3(arg0.method364("badenc.txt", null), -631);
		@Pc(28) Class8_Sub1_Sub3 local28 = new Class8_Sub1_Sub3(arg0.method364("domainenc.txt", null), -631);
		@Pc(37) Class8_Sub1_Sub3 local37 = new Class8_Sub1_Sub3(arg0.method364("tldlist.txt", null), -631);
		method268(local10, local19, local28, local37);
	}

	@OriginalMember(owner = "client!OWMPGCSS", name = "a", descriptor = "(Lclient!TQYMAXSO;Lclient!TQYMAXSO;Lclient!TQYMAXSO;Lclient!TQYMAXSO;)V")
	private static void method268(@OriginalArg(0) Class8_Sub1_Sub3 arg0, @OriginalArg(1) Class8_Sub1_Sub3 arg1, @OriginalArg(2) Class8_Sub1_Sub3 arg2, @OriginalArg(3) Class8_Sub1_Sub3 arg3) {
		method270(arg1);
		method271(arg2);
		method272(346, arg0);
		method269(arg3);
	}

	@OriginalMember(owner = "client!OWMPGCSS", name = "a", descriptor = "(Lclient!TQYMAXSO;I)V")
	private static void method269(@OriginalArg(0) Class8_Sub1_Sub3 arg0) {
		try {
			@Pc(4) int local4 = arg0.method411();
			aCharArrayArray3 = new char[local4][];
			anIntArray144 = new int[local4];
			for (@Pc(12) int local12 = 0; local12 < local4; local12++) {
				anIntArray144[local12] = arg0.method406();
				@Pc(23) char[] local23 = new char[arg0.method406()];
				for (@Pc(25) int local25 = 0; local25 < local23.length; local25++) {
					local23[local25] = (char) arg0.method406();
				}
				aCharArrayArray3[local12] = local23;
			}
			if (anInt466 != 15655) {
				aBoolean112 = !aBoolean112;
			}
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("96554, " + arg0 + ", " + 15655 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OWMPGCSS", name = "a", descriptor = "(Lclient!TQYMAXSO;Z)V")
	private static void method270(@OriginalArg(0) Class8_Sub1_Sub3 arg0) {
		try {
			@Pc(2) int local2 = arg0.method411();
			aCharArrayArray1 = new char[local2][];
			aByteArrayArrayArray7 = new byte[local2][][];
			method273(arg0, aByteArrayArrayArray7, aCharArrayArray1);
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("9606, " + arg0 + ", " + false + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OWMPGCSS", name = "b", descriptor = "(Lclient!TQYMAXSO;I)V")
	private static void method271(@OriginalArg(0) Class8_Sub1_Sub3 arg0) {
		try {
			@Pc(9) int local9 = arg0.method411();
			aCharArrayArray2 = new char[local9][];
			method274(aCharArrayArray2, arg0);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("88107, " + arg0 + ", " + 3 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OWMPGCSS", name = "a", descriptor = "(ILclient!TQYMAXSO;)V")
	private static void method272(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub1_Sub3 arg1) {
		try {
			anIntArray143 = new int[arg1.method411()];
			for (@Pc(5) int local5 = 0; local5 < anIntArray143.length; local5++) {
				anIntArray143[local5] = arg1.method408();
			}
			@Pc(21) boolean local21 = false;
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("28387, " + arg0 + ", " + arg1 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OWMPGCSS", name = "a", descriptor = "(ILclient!TQYMAXSO;[[[B[[C)V")
	private static void method273(@OriginalArg(1) Class8_Sub1_Sub3 arg0, @OriginalArg(2) byte[][][] arg1, @OriginalArg(3) char[][] arg2) {
		try {
			for (@Pc(11) int local11 = 0; local11 < arg2.length; local11++) {
				@Pc(17) char[] local17 = new char[arg0.method406()];
				for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
					local17[local19] = (char) arg0.method406();
				}
				arg2[local11] = local17;
				@Pc(41) byte[][] local41 = new byte[arg0.method406()][2];
				for (@Pc(43) int local43 = 0; local43 < local41.length; local43++) {
					local41[local43][0] = (byte) arg0.method406();
					local41[local43][1] = (byte) arg0.method406();
				}
				if (local41.length > 0) {
					arg1[local11] = local41;
				}
			}
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("7416, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OWMPGCSS", name = "a", descriptor = "([[CLclient!TQYMAXSO;Z)V")
	private static void method274(@OriginalArg(0) char[][] arg0, @OriginalArg(1) Class8_Sub1_Sub3 arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
				@Pc(9) char[] local9 = new char[arg1.method406()];
				for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
					local9[local11] = (char) arg1.method406();
				}
				arg0[local3] = local9;
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("32805, " + arg0 + ", " + arg1 + ", " + true + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OWMPGCSS", name = "a", descriptor = "(Z[C)V")
	private static void method275(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) int local3 = 0;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				if (method276(arg0[local5])) {
					arg0[local3] = arg0[local5];
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
			signlink.reporterror("22896, " + false + ", " + arg0 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OWMPGCSS", name = "a", descriptor = "(CI)Z")
	private static boolean method276(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= ' ' && arg0 <= '\u007f' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("40631, " + arg0 + ", " + 0 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OWMPGCSS", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method277(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(3) long local3 = System.currentTimeMillis();
			@Pc(6) char[] local6 = arg0.toCharArray();
			method275(local6);
			@Pc(15) String local15 = (new String(local6)).trim();
			@Pc(19) char[] local19 = local15.toLowerCase().toCharArray();
			@Pc(22) String local22 = local15.toLowerCase();
			method285(local19);
			method280(local19);
			if (arg1 != 0) {
				anInt466 = 396;
			}
			method281(local19);
			method294(local19);
			for (@Pc(40) int local40 = 0; local40 < aStringArray3.length; local40++) {
				@Pc(50) int local50 = -1;
				while ((local50 = local22.indexOf(aStringArray3[local40], local50 + 1)) != -1) {
					@Pc(57) char[] local57 = aStringArray3[local40].toCharArray();
					for (@Pc(59) int local59 = 0; local59 < local57.length; local59++) {
						local19[local59 + local50] = local57[local59];
					}
				}
			}
			method278(local15.toCharArray(), local19);
			method279(local19);
			@Pc(101) long local101 = System.currentTimeMillis();
			return (new String(local19)).trim();
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("52268, " + arg0 + ", " + arg1 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OWMPGCSS", name = "a", descriptor = "(Z[C[C)V")
	private static void method278(@OriginalArg(1) char[] arg0, @OriginalArg(2) char[] arg1) {
		try {
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				if (arg1[local5] != '*' && method302(arg0[local5], anInt469)) {
					arg1[local5] = arg0[local5];
				}
			}
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("13192, " + true + ", " + arg0 + ", " + arg1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OWMPGCSS", name = "a", descriptor = "([CI)V")
	private static void method279(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
				@Pc(19) char local19 = arg0[local13];
				if (!method299(local19)) {
					local3 = true;
				} else if (local3) {
					if (method301(local19)) {
						local3 = false;
					}
				} else if (method302(local19, anInt469)) {
					arg0[local13] = (char) (local19 + 'a' - 65);
				}
			}
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("62515, " + arg0 + ", " + 0 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OWMPGCSS", name = "a", descriptor = "([CZ)V")
	private static void method280(@OriginalArg(0) char[] arg0) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 2; local3++) {
				for (@Pc(10) int local10 = aCharArrayArray1.length - 1; local10 >= 0; local10--) {
					method289(aByteArrayArrayArray7[local10], arg0, aCharArrayArray1[local10]);
				}
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("99710, " + arg0 + ", " + false + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OWMPGCSS", name = "b", descriptor = "([CZ)V")
	private static void method281(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(7) char[] local7 = (char[]) arg0.clone();
			@Pc(22) char[] local22 = new char[] { '(', 'a', ')' };
			method289(null, local7, local22);
			@Pc(31) char[] local31 = (char[]) arg0.clone();
			@Pc(46) char[] local46 = new char[] { 'd', 'o', 't' };
			method289(null, local31, local46);
			for (@Pc(56) int local56 = aCharArrayArray2.length - 1; local56 >= 0; local56--) {
				method282(local31, arg0, local7, aCharArrayArray2[local56]);
			}
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("98373, " + arg0 + ", " + false + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OWMPGCSS", name = "a", descriptor = "([C[C[C[CI)V")
	private static void method282(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) char[] arg3) {
		try {
			if (arg3.length <= arg1.length) {
				@Pc(22) int local22;
				for (@Pc(14) int local14 = 0; local14 <= arg1.length - arg3.length; local14 += local22) {
					@Pc(18) int local18 = local14;
					@Pc(20) int local20 = 0;
					local22 = 1;
					label58: while (true) {
						while (true) {
							if (local18 >= arg1.length) {
								break label58;
							}
							@Pc(30) char local30 = arg1[local18];
							@Pc(32) char local32 = 0;
							if (local18 + 1 < arg1.length) {
								local32 = arg1[local18 + 1];
							}
							@Pc(57) int local57;
							if (local20 < arg3.length && (local57 = method291(local30, local32, arg3[local20])) > 0) {
								local18 += local57;
								local20++;
							} else {
								if (local20 == 0) {
									break label58;
								}
								@Pc(78) int local78;
								if ((local78 = method291(local30, local32, arg3[local20 - 1])) > 0) {
									local18 += local78;
									if (local20 == 1) {
										local22++;
									}
								} else {
									if (local20 >= arg3.length || !method297(local30)) {
										break label58;
									}
									local18++;
								}
							}
						}
					}
					if (local20 >= arg3.length) {
						@Pc(109) boolean local109 = false;
						@Pc(115) int local115 = method283(arg1, arg2, local14);
						@Pc(123) int local123 = method284(local18 - 1, arg1, arg0);
						if (local115 > 2 || local123 > 2) {
							local109 = true;
						}
						if (local109) {
							for (@Pc(135) int local135 = local14; local135 < local18; local135++) {
								arg1[local135] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("38074, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 315 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OWMPGCSS", name = "a", descriptor = "([CI[CI)I")
	private static int method283(@OriginalArg(0) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 == 0) {
				return 2;
			}
			for (@Pc(9) int local9 = arg2 - 1; local9 >= 0 && method297(arg0[local9]); local9--) {
				if (arg0[local9] == '@') {
					return 3;
				}
			}
			@Pc(29) int local29 = 0;
			for (@Pc(33) int local33 = arg2 - 1; local33 >= 0 && method297(arg1[local33]); local33--) {
				if (arg1[local33] == '*') {
					local29++;
				}
			}
			if (local29 >= 3) {
				return 4;
			} else if (method297(arg0[arg2 - 1])) {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("61263, " + arg0 + ", " + 37847 + ", " + arg1 + ", " + arg2 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OWMPGCSS", name = "a", descriptor = "(I[CZ[C)I")
	private static int method284(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg0 + 1 == arg1.length) {
				return 2;
			}
			@Pc(13) int local13 = arg0 + 1;
			while (true) {
				if (local13 < arg1.length && method297(arg1[local13])) {
					if (arg1[local13] != '.' && arg1[local13] != ',') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(40) int local40 = 0;
				for (@Pc(53) int local53 = arg0 + 1; local53 < arg1.length && method297(arg2[local53]); local53++) {
					if (arg2[local53] == '*') {
						local40++;
					}
				}
				if (local40 >= 3) {
					return 4;
				}
				if (method297(arg1[arg0 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("91934, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OWMPGCSS", name = "b", descriptor = "([CI)V")
	private static void method285(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(18) char[] local18 = new char[] { 'd', 'o', 't' };
			method289(null, local3, local18);
			@Pc(27) char[] local27 = (char[]) arg0.clone();
			@Pc(50) char[] local50 = new char[] { 's', 'l', 'a', 's', 'h' };
			method289(null, local27, local50);
			for (@Pc(57) int local57 = 0; local57 < aCharArrayArray3.length; local57++) {
				method286(local3, local27, anIntArray144[local57], arg0, aCharArrayArray3[local57]);
			}
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("76770, " + arg0 + ", " + 5263 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OWMPGCSS", name = "a", descriptor = "([C[CI[C[CI)V")
	private static void method286(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) char[] arg3, @OriginalArg(4) char[] arg4) {
		try {
			if (arg4.length <= arg3.length) {
				@Pc(22) int local22;
				for (@Pc(14) int local14 = 0; local14 <= arg3.length - arg4.length; local14 += local22) {
					@Pc(18) int local18 = local14;
					@Pc(20) int local20 = 0;
					local22 = 1;
					label120: while (true) {
						while (true) {
							if (local18 >= arg3.length) {
								break label120;
							}
							@Pc(30) char local30 = arg3[local18];
							@Pc(32) char local32 = 0;
							if (local18 + 1 < arg3.length) {
								local32 = arg3[local18 + 1];
							}
							@Pc(57) int local57;
							if (local20 < arg4.length && (local57 = method291(local30, local32, arg4[local20])) > 0) {
								local18 += local57;
								local20++;
							} else {
								if (local20 == 0) {
									break label120;
								}
								@Pc(78) int local78;
								if ((local78 = method291(local30, local32, arg4[local20 - 1])) > 0) {
									local18 += local78;
									if (local20 == 1) {
										local22++;
									}
								} else {
									if (local20 >= arg4.length || !method297(local30)) {
										break label120;
									}
									local18++;
								}
							}
						}
					}
					if (local20 >= arg4.length) {
						@Pc(109) boolean local109 = false;
						@Pc(115) int local115 = method287(arg3, arg0, local14);
						@Pc(123) int local123 = method288(local18 - 1, arg3, arg1);
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
											if (arg0[local189] != '*') {
												break;
											}
											local173 = local189;
										} else if (arg0[local189] == '*') {
											local173 = local189;
											local185 = true;
										}
									}
								}
								local185 = false;
								for (local189 = local173 - 1; local189 >= 0; local189--) {
									if (local185) {
										if (method297(arg3[local189])) {
											break;
										}
										local173 = local189;
									} else if (!method297(arg3[local189])) {
										local185 = true;
										local173 = local189;
									}
								}
							}
							if (local123 > 2) {
								if (local123 == 4) {
									local185 = false;
									for (local189 = local177 + 1; local189 < arg3.length; local189++) {
										if (local185) {
											if (arg1[local189] != '*') {
												break;
											}
											local177 = local189;
										} else if (arg1[local189] == '*') {
											local177 = local189;
											local185 = true;
										}
									}
								}
								local185 = false;
								for (local189 = local177 + 1; local189 < arg3.length; local189++) {
									if (local185) {
										if (method297(arg3[local189])) {
											break;
										}
										local177 = local189;
									} else if (!method297(arg3[local189])) {
										local185 = true;
										local177 = local189;
									}
								}
							}
							for (@Pc(323) int local323 = local173; local323 <= local177; local323++) {
								arg3[local323] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(346) RuntimeException local346) {
			signlink.reporterror("16235, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -810 + ", " + local346.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OWMPGCSS", name = "a", descriptor = "([C[CBI)I")
	private static int method287(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 == 0) {
				return 2;
			}
			@Pc(9) int local9 = arg2 - 1;
			while (true) {
				if (local9 >= 0 && method297(arg0[local9])) {
					if (arg0[local9] != ',' && arg0[local9] != '.') {
						local9--;
						continue;
					}
					return 3;
				}
				@Pc(39) int local39 = 0;
				for (@Pc(43) int local43 = arg2 - 1; local43 >= 0 && method297(arg1[local43]); local43--) {
					if (arg1[local43] == '*') {
						local39++;
					}
				}
				if (local39 >= 3) {
					return 4;
				}
				if (method297(arg0[arg2 - 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("37127, " + arg0 + ", " + arg1 + ", " + 7 + ", " + arg2 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OWMPGCSS", name = "a", descriptor = "(I[C[CI)I")
	private static int method288(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2) {
		try {
			if (arg0 + 1 == arg1.length) {
				return 2;
			}
			@Pc(13) int local13 = arg0 + 1;
			while (true) {
				if (local13 < arg1.length && method297(arg1[local13])) {
					if (arg1[local13] != '\\' && arg1[local13] != '/') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(40) int local40 = 0;
				for (@Pc(52) int local52 = arg0 + 1; local52 < arg1.length && method297(arg2[local52]); local52++) {
					if (arg2[local52] == '*') {
						local40++;
					}
				}
				if (local40 >= 5) {
					return 4;
				}
				if (method297(arg1[arg0 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("61380, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OWMPGCSS", name = "a", descriptor = "([[B[C[CI)V")
	private static void method289(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2) {
		try {
			if (arg2.length <= arg1.length) {
				@Pc(31) int local31;
				for (@Pc(21) int local21 = 0; local21 <= arg1.length - arg2.length; local21 += local31) {
					@Pc(25) int local25 = local21;
					@Pc(27) int local27 = 0;
					@Pc(29) int local29 = 0;
					local31 = 1;
					@Pc(33) boolean local33 = false;
					@Pc(35) boolean local35 = false;
					@Pc(37) boolean local37 = false;
					@Pc(45) char var12;
					@Pc(47) char var13;
					label164: while (true) {
						while (true) {
							if (local25 >= arg1.length || local35 && local37) {
								break label164;
							}
							var12 = arg1[local25];
							var13 = '\u0000';
							if (local25 + 1 < arg1.length) {
								var13 = arg1[local25 + 1];
							}
							@Pc(72) int local72;
							if (local27 < arg2.length && (local72 = method292(var13, arg2[local27], var12)) > 0) {
								if (local72 == 1 && method300(var12)) {
									local35 = true;
								}
								if (local72 == 2 && (method300(var12) || method300(var13))) {
									local35 = true;
								}
								local25 += local72;
								local27++;
							} else {
								if (local27 == 0) {
									break label164;
								}
								@Pc(115) int local115;
								if ((local115 = method292(var13, arg2[local27 - 1], var12)) > 0) {
									local25 += local115;
									if (local27 == 1) {
										local31++;
									}
								} else {
									if (local27 >= arg2.length || !method298(var12)) {
										break label164;
									}
									if (method297(var12) && var12 != '\'') {
										local33 = true;
									}
									if (method300(var12)) {
										local37 = true;
									}
									local25++;
									local29++;
									if (local29 * 100 / (local25 - local21) > 90) {
										break label164;
									}
								}
							}
						}
					}
					if (local27 >= arg2.length && (!local35 || !local37)) {
						@Pc(180) boolean local180 = true;
						@Pc(276) int local276;
						if (local33) {
							@Pc(226) boolean local226 = false;
							@Pc(228) boolean local228 = false;
							if (local21 - 1 < 0 || method297(arg1[local21 - 1]) && arg1[local21 - 1] != '\'') {
								local226 = true;
							}
							if (local25 >= arg1.length || method297(arg1[local25]) && arg1[local25] != '\'') {
								local228 = true;
							}
							if (!local226 || !local228) {
								@Pc(272) boolean local272 = false;
								local276 = local21 - 2;
								if (local226) {
									local276 = local21;
								}
								while (!local272 && local276 < local25) {
									if (local276 >= 0 && (!method297(arg1[local276]) || arg1[local276] == '\'')) {
										@Pc(298) char[] local298 = new char[3];
										@Pc(300) int local300;
										for (local300 = 0; local300 < 3 && local276 + local300 < arg1.length && (!method297(arg1[local276 + local300]) || arg1[local276 + local300] == '\''); local300++) {
											local298[local300] = arg1[local276 + local300];
										}
										@Pc(338) boolean local338 = true;
										if (local300 == 0) {
											local338 = false;
										}
										if (local300 < 3 && local276 - 1 >= 0 && (!method297(arg1[local276 - 1]) || arg1[local276 - 1] == '\'')) {
											local338 = false;
										}
										if (local338 && !method303(local298)) {
											local272 = true;
										}
									}
									local276++;
								}
								if (!local272) {
									local180 = false;
								}
							}
						} else {
							var12 = ' ';
							if (local21 - 1 >= 0) {
								var12 = arg1[local21 - 1];
							}
							var13 = ' ';
							if (local25 < arg1.length) {
								var13 = arg1[local25];
							}
							@Pc(208) byte local208 = method293(var12);
							@Pc(212) byte local212 = method293(var13);
							if (arg0 != null && method290(anInt468, local208, arg0, local212)) {
								local180 = false;
							}
						}
						if (local180) {
							@Pc(388) int local388 = 0;
							@Pc(390) int local390 = 0;
							@Pc(392) int local392 = -1;
							for (local276 = local21; local276 < local25; local276++) {
								if (method300(arg1[local276])) {
									local388++;
								} else if (method299(arg1[local276])) {
									local390++;
									local392 = local276;
								}
							}
							if (local392 > -1) {
								local388 -= local25 - local392 - 1;
							}
							if (local388 <= local390) {
								for (@Pc(434) int local434 = local21; local434 < local25; local434++) {
									arg1[local434] = '*';
								}
							} else {
								local31 = 1;
							}
						}
					}
				}
			}
		} catch (@Pc(461) RuntimeException local461) {
			signlink.reporterror("31054, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local461.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OWMPGCSS", name = "a", descriptor = "(IB[[BB)Z")
	private static boolean method290(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) byte arg3) {
		try {
			@Pc(1) int local1 = 0;
			@Pc(5) int local5 = 8 / arg0;
			if (arg2[0][0] == arg1 && arg2[0][1] == arg3) {
				return true;
			}
			@Pc(26) int local26 = arg2.length - 1;
			if (arg2[local26][0] == arg1 && arg2[local26][1] == arg3) {
				return true;
			}
			do {
				@Pc(48) int local48 = (local1 + local26) / 2;
				if (arg2[local48][0] == arg1 && arg2[local48][1] == arg3) {
					return true;
				}
				if (arg1 < arg2[local48][0] || arg1 == arg2[local48][0] && arg3 < arg2[local48][1]) {
					local26 = local48;
				} else {
					local1 = local48;
				}
			} while (local1 != local26 && local1 + 1 != local26);
			return false;
		} catch (@Pc(102) RuntimeException local102) {
			signlink.reporterror("21850, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local102.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OWMPGCSS", name = "a", descriptor = "(CCCI)I")
	private static int method291(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(2) char arg2) {
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
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("99446, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 3 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OWMPGCSS", name = "b", descriptor = "(CCCI)I")
	private static int method292(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(2) char arg2) {
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
		} catch (@Pc(516) RuntimeException local516) {
			signlink.reporterror("85302, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local516.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OWMPGCSS", name = "a", descriptor = "(CZ)B")
	private static byte method293(@OriginalArg(0) char arg0) {
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
			signlink.reporterror("11719, " + arg0 + ", " + true + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OWMPGCSS", name = "a", descriptor = "(I[C)V")
	private static void method294(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(5) int local5 = 0;
			@Pc(10) int local10 = 0;
			@Pc(12) int local12 = 0;
			while (true) {
				do {
					@Pc(111) int local111;
					if ((local111 = method295(local5, (byte) 8, arg0)) == -1) {
						return;
					}
					@Pc(16) boolean local16 = false;
					for (@Pc(18) int local18 = local5; local18 >= 0 && local18 < local111 && !local16; local18++) {
						if (!method297(arg0[local18]) && !method298(arg0[local18])) {
							local16 = true;
						}
					}
					if (local16) {
						local10 = 0;
					}
					if (local10 == 0) {
						local12 = local111;
					}
					local5 = method296(arg0, local111);
					@Pc(57) int local57 = 0;
					for (@Pc(59) int local59 = local111; local59 < local5; local59++) {
						local57 = local57 * 10 + arg0[local59] - 48;
					}
					if (local57 <= 255 && local5 - local111 <= 8) {
						local10++;
					} else {
						local10 = 0;
					}
				} while (local10 != 4);
				for (@Pc(93) int local93 = local12; local93 < local5; local93++) {
					arg0[local93] = '*';
				}
				local10 = 0;
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("70747, " + 0 + ", " + arg0 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OWMPGCSS", name = "a", descriptor = "(IB[C)I")
	private static int method295(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) char[] arg2) {
		try {
			@Pc(6) boolean local6 = false;
			for (@Pc(12) int local12 = arg0; local12 < arg2.length && local12 >= 0; local12++) {
				if (arg2[local12] >= '0' && arg2[local12] <= '9') {
					return local12;
				}
			}
			return -1;
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("15541, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OWMPGCSS", name = "a", descriptor = "(I[CI)I")
	private static int method296(@OriginalArg(1) char[] arg0, @OriginalArg(2) int arg1) {
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
			signlink.reporterror("2375, " + 37 + ", " + arg0 + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OWMPGCSS", name = "a", descriptor = "(IC)Z")
	private static boolean method297(@OriginalArg(1) char arg0) {
		try {
			return !method299(arg0) && !method300(arg0);
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("74739, " + 8 + ", " + arg0 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OWMPGCSS", name = "b", descriptor = "(CZ)Z")
	private static boolean method298(@OriginalArg(0) char arg0) {
		try {
			if (arg0 >= 'a' && arg0 <= 'z') {
				return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
			} else {
				return true;
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("85020, " + arg0 + ", " + false + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OWMPGCSS", name = "b", descriptor = "(IC)Z")
	private static boolean method299(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("33115, " + 0 + ", " + arg0 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OWMPGCSS", name = "c", descriptor = "(IC)Z")
	private static boolean method300(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= '0' && arg0 <= '9';
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("69904, " + 410 + ", " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OWMPGCSS", name = "b", descriptor = "(CI)Z")
	private static boolean method301(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z';
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("57662, " + arg0 + ", " + -225 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OWMPGCSS", name = "c", descriptor = "(CI)Z")
	private static boolean method302(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 >= 0) {
				aBoolean109 = !aBoolean109;
			}
			return arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("97459, " + arg0 + ", " + arg1 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OWMPGCSS", name = "b", descriptor = "(I[C)Z")
	private static boolean method303(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				if (!method300(arg0[local5]) && arg0[local5] != '\u0000') {
					local3 = false;
				}
			}
			if (local3) {
				return true;
			}
			@Pc(32) int local32 = method304(arg0, 420);
			@Pc(34) int local34 = 0;
			@Pc(39) int local39 = anIntArray143.length - 1;
			if (local32 == anIntArray143[0] || local32 == anIntArray143[local39]) {
				return true;
			}
			do {
				@Pc(65) int local65 = (local34 + local39) / 2;
				if (local32 == anIntArray143[local65]) {
					return true;
				}
				if (local32 < anIntArray143[local65]) {
					local39 = local65;
				} else {
					local34 = local65;
				}
			} while (local34 != local39 && local34 + 1 != local39);
			return false;
		} catch (@Pc(94) RuntimeException local94) {
			signlink.reporterror("29214, " + -546 + ", " + arg0 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OWMPGCSS", name = "c", descriptor = "([CI)I")
	private static int method304(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(5) boolean local5 = false;
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
			signlink.reporterror("19151, " + arg0 + ", " + arg1 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}
}
