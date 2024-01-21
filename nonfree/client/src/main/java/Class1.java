import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!AZWWSWYH")
public final class Class1 {

	@OriginalMember(owner = "client!AZWWSWYH", name = "j", descriptor = "[I")
	private static int[] anIntArray1;

	@OriginalMember(owner = "client!AZWWSWYH", name = "k", descriptor = "[[C")
	private static char[][] aCharArrayArray1;

	@OriginalMember(owner = "client!AZWWSWYH", name = "l", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!AZWWSWYH", name = "m", descriptor = "[[C")
	private static char[][] aCharArrayArray2;

	@OriginalMember(owner = "client!AZWWSWYH", name = "n", descriptor = "[[C")
	private static char[][] aCharArrayArray3;

	@OriginalMember(owner = "client!AZWWSWYH", name = "o", descriptor = "[I")
	private static int[] anIntArray2;

	@OriginalMember(owner = "client!AZWWSWYH", name = "a", descriptor = "I")
	private static int anInt1 = -961;

	@OriginalMember(owner = "client!AZWWSWYH", name = "c", descriptor = "I")
	private static int anInt2;

	@OriginalMember(owner = "client!AZWWSWYH", name = "d", descriptor = "I")
	private static int anInt3;

	@OriginalMember(owner = "client!AZWWSWYH", name = "e", descriptor = "Z")
	private static boolean aBoolean2;

	@OriginalMember(owner = "client!AZWWSWYH", name = "f", descriptor = "I")
	private static int anInt4;

	@OriginalMember(owner = "client!AZWWSWYH", name = "g", descriptor = "I")
	private static int anInt5;

	@OriginalMember(owner = "client!AZWWSWYH", name = "h", descriptor = "I")
	private static int anInt6;

	@OriginalMember(owner = "client!AZWWSWYH", name = "i", descriptor = "Z")
	private static boolean aBoolean3;

	@OriginalMember(owner = "client!AZWWSWYH", name = "p", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray1;

	static {
		aBoolean1 = true;
		anInt2 = 4;
		anInt3 = 3;
		aBoolean2 = true;
		anInt4 = 639;
		anInt5 = 76;
		anInt6 = -408;
		aBoolean3 = true;
		aStringArray1 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };
	}

	@OriginalMember(owner = "client!AZWWSWYH", name = "a", descriptor = "(Lclient!QDHHNYHL;)V")
	public static void method1(@OriginalArg(0) Class32 arg0) {
		@Pc(10) Class4_Sub1_Sub4 local10 = new Class4_Sub1_Sub4(5, arg0.method426("fragmentsenc.txt", null));
		@Pc(19) Class4_Sub1_Sub4 local19 = new Class4_Sub1_Sub4(5, arg0.method426("badenc.txt", null));
		@Pc(28) Class4_Sub1_Sub4 local28 = new Class4_Sub1_Sub4(5, arg0.method426("domainenc.txt", null));
		@Pc(37) Class4_Sub1_Sub4 local37 = new Class4_Sub1_Sub4(5, arg0.method426("tldlist.txt", null));
		method2(local10, local19, local28, local37);
	}

	@OriginalMember(owner = "client!AZWWSWYH", name = "a", descriptor = "(Lclient!PGNBHFUF;Lclient!PGNBHFUF;Lclient!PGNBHFUF;Lclient!PGNBHFUF;)V")
	private static void method2(@OriginalArg(0) Class4_Sub1_Sub4 arg0, @OriginalArg(1) Class4_Sub1_Sub4 arg1, @OriginalArg(2) Class4_Sub1_Sub4 arg2, @OriginalArg(3) Class4_Sub1_Sub4 arg3) {
		method4(605, arg1);
		method5(arg2);
		method6(arg0);
		method3(arg3, anInt2);
	}

	@OriginalMember(owner = "client!AZWWSWYH", name = "a", descriptor = "(Lclient!PGNBHFUF;I)V")
	private static void method3(@OriginalArg(0) Class4_Sub1_Sub4 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) int local4 = arg0.method360();
			aCharArrayArray3 = new char[local4][];
			anIntArray2 = new int[local4];
			if (arg1 >= 4 && arg1 <= 4) {
				for (@Pc(19) int local19 = 0; local19 < local4; local19++) {
					anIntArray2[local19] = arg0.method355();
					@Pc(30) char[] local30 = new char[arg0.method355()];
					for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
						local30[local32] = (char) arg0.method355();
					}
					aCharArrayArray3[local19] = local30;
				}
			}
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("48651, " + arg0 + ", " + arg1 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AZWWSWYH", name = "a", descriptor = "(ILclient!PGNBHFUF;)V")
	private static void method4(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub1_Sub4 arg1) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(6) int local6 = arg1.method360();
			aCharArrayArray1 = new char[local6][];
			aByteArrayArrayArray1 = new byte[local6][][];
			method7(aCharArrayArray1, arg1, aByteArrayArrayArray1);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("32595, " + arg0 + ", " + arg1 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AZWWSWYH", name = "b", descriptor = "(Lclient!PGNBHFUF;I)V")
	private static void method5(@OriginalArg(0) Class4_Sub1_Sub4 arg0) {
		try {
			@Pc(2) int local2 = arg0.method360();
			aCharArrayArray2 = new char[local2][];
			method8(arg0, aCharArrayArray2);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("91159, " + arg0 + ", " + -808 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AZWWSWYH", name = "b", descriptor = "(ILclient!PGNBHFUF;)V")
	private static void method6(@OriginalArg(1) Class4_Sub1_Sub4 arg0) {
		try {
			anIntArray1 = new int[arg0.method360()];
			for (@Pc(17) int local17 = 0; local17 < anIntArray1.length; local17++) {
				anIntArray1[local17] = arg0.method357();
			}
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("3251, " + -20467 + ", " + arg0 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AZWWSWYH", name = "a", descriptor = "([[CILclient!PGNBHFUF;[[[B)V")
	private static void method7(@OriginalArg(0) char[][] arg0, @OriginalArg(2) Class4_Sub1_Sub4 arg1, @OriginalArg(3) byte[][][] arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
				@Pc(9) char[] local9 = new char[arg1.method355()];
				for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
					local9[local11] = (char) arg1.method355();
				}
				arg0[local3] = local9;
				@Pc(33) byte[][] local33 = new byte[arg1.method355()][2];
				for (@Pc(35) int local35 = 0; local35 < local33.length; local35++) {
					local33[local35][0] = (byte) arg1.method355();
					local33[local35][1] = (byte) arg1.method355();
				}
				if (local33.length > 0) {
					arg2[local3] = local33;
				}
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("13318, " + arg0 + ", " + 6 + ", " + arg1 + ", " + arg2 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AZWWSWYH", name = "a", descriptor = "(Lclient!PGNBHFUF;B[[C)V")
	private static void method8(@OriginalArg(0) Class4_Sub1_Sub4 arg0, @OriginalArg(2) char[][] arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
				@Pc(9) char[] local9 = new char[arg0.method355()];
				for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
					local9[local11] = (char) arg0.method355();
				}
				arg1[local3] = local9;
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("54683, " + arg0 + ", " + 46 + ", " + arg1 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AZWWSWYH", name = "a", descriptor = "(I[C)V")
	private static void method9(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) int local3 = 0;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				if (method10(arg0[local5])) {
					arg0[local3] = arg0[local5];
				} else {
					arg0[local3] = ' ';
				}
				if (local3 == 0 || arg0[local3] != ' ' || arg0[local3 - 1] != ' ') {
					local3++;
				}
			}
			for (@Pc(47) int local47 = local3; local47 < arg0.length; local47++) {
				arg0[local47] = ' ';
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("90286, " + -368 + ", " + arg0 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AZWWSWYH", name = "a", descriptor = "(CI)Z")
	private static boolean method10(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= ' ' && arg0 <= '\u007f' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("72796, " + arg0 + ", " + -16373 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AZWWSWYH", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method11(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) long local3 = System.currentTimeMillis();
			@Pc(6) char[] local6 = arg0.toCharArray();
			method9(local6);
			@Pc(15) String local15 = (new String(local6)).trim();
			@Pc(19) char[] local19 = local15.toLowerCase().toCharArray();
			@Pc(23) boolean local23 = false;
			@Pc(26) String local26 = local15.toLowerCase();
			method19(local19);
			method14(local19);
			method15(local19);
			method28(720, local19);
			for (@Pc(40) int local40 = 0; local40 < aStringArray1.length; local40++) {
				@Pc(50) int local50 = -1;
				while ((local50 = local26.indexOf(aStringArray1[local40], local50 + 1)) != -1) {
					@Pc(57) char[] local57 = aStringArray1[local40].toCharArray();
					for (@Pc(59) int local59 = 0; local59 < local57.length; local59++) {
						local19[local59 + local50] = local57[local59];
					}
				}
			}
			method12(local15.toCharArray(), local19);
			method13(anInt3, local19);
			@Pc(101) long local101 = System.currentTimeMillis();
			return (new String(local19)).trim();
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("47194, " + arg0 + ", " + arg1 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AZWWSWYH", name = "a", descriptor = "([CZ[C)V")
	private static void method12(@OriginalArg(0) char[] arg0, @OriginalArg(2) char[] arg1) {
		try {
			for (@Pc(4) int local4 = 0; local4 < arg0.length; local4++) {
				if (arg1[local4] != '*' && method36(anInt6, arg0[local4])) {
					arg1[local4] = arg0[local4];
				}
			}
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("67048, " + arg0 + ", " + false + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AZWWSWYH", name = "b", descriptor = "(I[C)V")
	private static void method13(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < arg1.length; local5++) {
				@Pc(11) char local11 = arg1[local5];
				if (!method33(local11)) {
					local3 = true;
				} else if (local3) {
					if (method35(local11)) {
						local3 = false;
					}
				} else if (method36(anInt6, local11)) {
					arg1[local5] = (char) (local11 + 'a' - 65);
				}
			}
			if (arg0 != anInt3) {
				anInt3 = -279;
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("92202, " + arg0 + ", " + arg1 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AZWWSWYH", name = "a", descriptor = "([CI)V")
	private static void method14(@OriginalArg(0) char[] arg0) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 2; local3++) {
				for (@Pc(10) int local10 = aCharArrayArray1.length - 1; local10 >= 0; local10--) {
					method23(arg0, aByteArrayArrayArray1[local10], aCharArrayArray1[local10]);
				}
			}
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("79623, " + arg0 + ", " + 16 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AZWWSWYH", name = "a", descriptor = "(Z[C)V")
	private static void method15(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(14) char[] local14 = (char[]) arg0.clone();
			@Pc(29) char[] local29 = new char[] { '(', 'a', ')' };
			method23(local14, null, local29);
			@Pc(38) char[] local38 = (char[]) arg0.clone();
			@Pc(53) char[] local53 = new char[] { 'd', 'o', 't' };
			method23(local38, null, local53);
			for (@Pc(63) int local63 = aCharArrayArray2.length - 1; local63 >= 0; local63--) {
				method16(anInt4, aCharArrayArray2[local63], local38, local14, arg0);
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("70022, " + true + ", " + arg0 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AZWWSWYH", name = "a", descriptor = "(I[C[C[C[C)V")
	private static void method16(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) char[] arg3, @OriginalArg(4) char[] arg4) {
		try {
			if (arg1.length <= arg4.length && arg0 > 0) {
				@Pc(22) int local22;
				for (@Pc(14) int local14 = 0; local14 <= arg4.length - arg1.length; local14 += local22) {
					@Pc(18) int local18 = local14;
					@Pc(20) int local20 = 0;
					local22 = 1;
					label62: while (true) {
						while (true) {
							if (local18 >= arg4.length) {
								break label62;
							}
							@Pc(30) char local30 = arg4[local18];
							@Pc(32) char local32 = 0;
							if (local18 + 1 < arg4.length) {
								local32 = arg4[local18 + 1];
							}
							@Pc(57) int local57;
							if (local20 < arg1.length && (local57 = method25(arg1[local20], local30, local32, anInt5)) > 0) {
								local18 += local57;
								local20++;
							} else {
								if (local20 == 0) {
									break label62;
								}
								@Pc(78) int local78;
								if ((local78 = method25(arg1[local20 - 1], local30, local32, anInt5)) > 0) {
									local18 += local78;
									if (local20 == 1) {
										local22++;
									}
								} else {
									if (local20 >= arg1.length || !method31(local30)) {
										break label62;
									}
									local18++;
								}
							}
						}
					}
					if (local20 >= arg1.length) {
						@Pc(109) boolean local109 = false;
						@Pc(115) int local115 = method17(local14, arg3, arg4);
						@Pc(123) int local123 = method18(local18 - 1, arg2, arg4);
						if (local115 > 2 || local123 > 2) {
							local109 = true;
						}
						if (local109) {
							for (@Pc(135) int local135 = local14; local135 < local18; local135++) {
								arg4[local135] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("74729, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AZWWSWYH", name = "a", descriptor = "(ZI[C[C)I")
	private static int method17(@OriginalArg(1) int arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg0 == 0) {
				return 2;
			}
			for (@Pc(18) int local18 = arg0 - 1; local18 >= 0 && method31(arg2[local18]); local18--) {
				if (arg2[local18] == '@') {
					return 3;
				}
			}
			@Pc(38) int local38 = 0;
			for (@Pc(42) int local42 = arg0 - 1; local42 >= 0 && method31(arg1[local42]); local42--) {
				if (arg1[local42] == '*') {
					local38++;
				}
			}
			if (local38 >= 3) {
				return 4;
			} else if (method31(arg2[arg0 - 1])) {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("94304, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AZWWSWYH", name = "a", descriptor = "(I[CI[C)I")
	private static int method18(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg0 + 1 == arg2.length) {
				return 2;
			}
			@Pc(13) int local13 = arg0 + 1;
			while (true) {
				if (local13 < arg2.length && method31(arg2[local13])) {
					if (arg2[local13] != '.' && arg2[local13] != ',') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(40) int local40 = 0;
				for (@Pc(48) int local48 = arg0 + 1; local48 < arg2.length && method31(arg1[local48]); local48++) {
					if (arg1[local48] == '*') {
						local40++;
					}
				}
				if (local40 >= 3) {
					return 4;
				}
				if (method31(arg2[arg0 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("50268, " + arg0 + ", " + arg1 + ", " + 180 + ", " + arg2 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AZWWSWYH", name = "a", descriptor = "(B[C)V")
	private static void method19(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(18) char[] local18 = new char[] { 'd', 'o', 't' };
			method23(local3, null, local18);
			@Pc(27) char[] local27 = (char[]) arg0.clone();
			@Pc(50) char[] local50 = new char[] { 's', 'l', 'a', 's', 'h' };
			method23(local27, null, local50);
			for (@Pc(62) int local62 = 0; local62 < aCharArrayArray3.length; local62++) {
				method20(anIntArray2[local62], local3, local27, 873, arg0, aCharArrayArray3[local62]);
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("23961, " + 4 + ", " + arg0 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AZWWSWYH", name = "a", descriptor = "(I[C[CI[C[C)V")
	private static void method20(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) char[] arg4, @OriginalArg(5) char[] arg5) {
		try {
			@Pc(5) boolean local5 = false;
			if (arg5.length <= arg4.length) {
				@Pc(23) int local23;
				for (@Pc(15) int local15 = 0; local15 <= arg4.length - arg5.length; local15 += local23) {
					@Pc(19) int local19 = local15;
					@Pc(21) int local21 = 0;
					local23 = 1;
					label120: while (true) {
						while (true) {
							if (local19 >= arg4.length) {
								break label120;
							}
							@Pc(31) char local31 = arg4[local19];
							@Pc(33) char local33 = 0;
							if (local19 + 1 < arg4.length) {
								local33 = arg4[local19 + 1];
							}
							@Pc(58) int local58;
							if (local21 < arg5.length && (local58 = method25(arg5[local21], local31, local33, anInt5)) > 0) {
								local19 += local58;
								local21++;
							} else {
								if (local21 == 0) {
									break label120;
								}
								@Pc(79) int local79;
								if ((local79 = method25(arg5[local21 - 1], local31, local33, anInt5)) > 0) {
									local19 += local79;
									if (local21 == 1) {
										local23++;
									}
								} else {
									if (local21 >= arg5.length || !method31(local31)) {
										break label120;
									}
									local19++;
								}
							}
						}
					}
					if (local21 >= arg5.length) {
						@Pc(110) boolean local110 = false;
						@Pc(116) int local116 = method21(local15, arg1, arg4);
						@Pc(124) int local124 = method22(arg2, arg4, local19 - 1);
						if (arg0 == 1 && local116 > 0 && local124 > 0) {
							local110 = true;
						}
						if (arg0 == 2 && (local116 > 2 && local124 > 0 || local116 > 0 && local124 > 2)) {
							local110 = true;
						}
						if (arg0 == 3 && local116 > 0 && local124 > 2) {
							local110 = true;
						}
						@Pc(167) boolean local167;
						if (arg0 == 3 && local116 > 2 && local124 > 0) {
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
											if (arg1[local190] != '*') {
												break;
											}
											local174 = local190;
										} else if (arg1[local190] == '*') {
											local174 = local190;
											local186 = true;
										}
									}
								}
								local186 = false;
								for (local190 = local174 - 1; local190 >= 0; local190--) {
									if (local186) {
										if (method31(arg4[local190])) {
											break;
										}
										local174 = local190;
									} else if (!method31(arg4[local190])) {
										local186 = true;
										local174 = local190;
									}
								}
							}
							if (local124 > 2) {
								if (local124 == 4) {
									local186 = false;
									for (local190 = local178 + 1; local190 < arg4.length; local190++) {
										if (local186) {
											if (arg2[local190] != '*') {
												break;
											}
											local178 = local190;
										} else if (arg2[local190] == '*') {
											local178 = local190;
											local186 = true;
										}
									}
								}
								local186 = false;
								for (local190 = local178 + 1; local190 < arg4.length; local190++) {
									if (local186) {
										if (method31(arg4[local190])) {
											break;
										}
										local178 = local190;
									} else if (!method31(arg4[local190])) {
										local186 = true;
										local178 = local190;
									}
								}
							}
							for (@Pc(324) int local324 = local174; local324 <= local178; local324++) {
								arg4[local324] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(347) RuntimeException local347) {
			signlink.reporterror("92957, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local347.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AZWWSWYH", name = "b", descriptor = "(I[CI[C)I")
	private static int method21(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg0 == 0) {
				return 2;
			}
			@Pc(9) int local9 = arg0 - 1;
			while (true) {
				if (local9 >= 0 && method31(arg2[local9])) {
					if (arg2[local9] != ',' && arg2[local9] != '.') {
						local9--;
						continue;
					}
					return 3;
				}
				@Pc(34) int local34 = 0;
				for (@Pc(38) int local38 = arg0 - 1; local38 >= 0 && method31(arg1[local38]); local38--) {
					if (arg1[local38] == '*') {
						local34++;
					}
				}
				if (local34 >= 3) {
					return 4;
				}
				if (method31(arg2[arg0 - 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("34167, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AZWWSWYH", name = "a", descriptor = "(B[C[CI)I")
	private static int method22(@OriginalArg(1) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 + 1 == arg1.length) {
				return 2;
			}
			@Pc(18) int local18 = arg2 + 1;
			while (true) {
				if (local18 < arg1.length && method31(arg1[local18])) {
					if (arg1[local18] != '\\' && arg1[local18] != '/') {
						local18++;
						continue;
					}
					return 3;
				}
				@Pc(45) int local45 = 0;
				for (@Pc(49) int local49 = arg2 + 1; local49 < arg1.length && method31(arg0[local49]); local49++) {
					if (arg0[local49] == '*') {
						local45++;
					}
				}
				if (local45 >= 5) {
					return 4;
				}
				if (method31(arg1[arg2 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("20684, " + 27 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AZWWSWYH", name = "a", descriptor = "(I[C[[B[C)V")
	private static void method23(@OriginalArg(1) char[] arg0, @OriginalArg(2) byte[][] arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg2.length <= arg0.length) {
				@Pc(30) int local30;
				for (@Pc(20) int local20 = 0; local20 <= arg0.length - arg2.length; local20 += local30) {
					@Pc(24) int local24 = local20;
					@Pc(26) int local26 = 0;
					@Pc(28) int local28 = 0;
					local30 = 1;
					@Pc(32) boolean local32 = false;
					@Pc(34) boolean local34 = false;
					@Pc(36) boolean local36 = false;
					@Pc(44) char var12;
					@Pc(46) char var13;
					label164: while (true) {
						while (true) {
							if (local24 >= arg0.length || local34 && local36) {
								break label164;
							}
							var12 = arg0[local24];
							var13 = '\u0000';
							if (local24 + 1 < arg0.length) {
								var13 = arg0[local24 + 1];
							}
							@Pc(71) int local71;
							if (local26 < arg2.length && (local71 = method26(var13, var12, arg2[local26])) > 0) {
								if (local71 == 1 && method34(var12)) {
									local34 = true;
								}
								if (local71 == 2 && (method34(var12) || method34(var13))) {
									local34 = true;
								}
								local24 += local71;
								local26++;
							} else {
								if (local26 == 0) {
									break label164;
								}
								@Pc(114) int local114;
								if ((local114 = method26(var13, var12, arg2[local26 - 1])) > 0) {
									local24 += local114;
									if (local26 == 1) {
										local30++;
									}
								} else {
									if (local26 >= arg2.length || !method32(var12)) {
										break label164;
									}
									if (method31(var12) && var12 != '\'') {
										local32 = true;
									}
									if (method34(var12)) {
										local36 = true;
									}
									local24++;
									local28++;
									if (local28 * 100 / (local24 - local20) > 90) {
										break label164;
									}
								}
							}
						}
					}
					if (local26 >= arg2.length && (!local34 || !local36)) {
						@Pc(179) boolean local179 = true;
						@Pc(275) int local275;
						if (local32) {
							@Pc(225) boolean local225 = false;
							@Pc(227) boolean local227 = false;
							if (local20 - 1 < 0 || method31(arg0[local20 - 1]) && arg0[local20 - 1] != '\'') {
								local225 = true;
							}
							if (local24 >= arg0.length || method31(arg0[local24]) && arg0[local24] != '\'') {
								local227 = true;
							}
							if (!local225 || !local227) {
								@Pc(271) boolean local271 = false;
								local275 = local20 - 2;
								if (local225) {
									local275 = local20;
								}
								while (!local271 && local275 < local24) {
									if (local275 >= 0 && (!method31(arg0[local275]) || arg0[local275] == '\'')) {
										@Pc(297) char[] local297 = new char[3];
										@Pc(299) int local299;
										for (local299 = 0; local299 < 3 && local275 + local299 < arg0.length && (!method31(arg0[local275 + local299]) || arg0[local275 + local299] == '\''); local299++) {
											local297[local299] = arg0[local275 + local299];
										}
										@Pc(337) boolean local337 = true;
										if (local299 == 0) {
											local337 = false;
										}
										if (local299 < 3 && local275 - 1 >= 0 && (!method31(arg0[local275 - 1]) || arg0[local275 - 1] == '\'')) {
											local337 = false;
										}
										if (local337 && !method37(local297)) {
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
							var12 = ' ';
							if (local20 - 1 >= 0) {
								var12 = arg0[local20 - 1];
							}
							var13 = ' ';
							if (local24 < arg0.length) {
								var13 = arg0[local24];
							}
							@Pc(207) byte local207 = method27(var12);
							@Pc(211) byte local211 = method27(var13);
							if (arg1 != null && method24(local207, local211, arg1)) {
								local179 = false;
							}
						}
						if (local179) {
							@Pc(387) int local387 = 0;
							@Pc(389) int local389 = 0;
							@Pc(391) int local391 = -1;
							for (local275 = local20; local275 < local24; local275++) {
								if (method34(arg0[local275])) {
									local387++;
								} else if (method33(arg0[local275])) {
									local389++;
									local391 = local275;
								}
							}
							if (local391 > -1) {
								local387 -= local24 - local391 - 1;
							}
							if (local387 <= local389) {
								for (@Pc(433) int local433 = local20; local433 < local24; local433++) {
									arg0[local433] = '*';
								}
							} else {
								local30 = 1;
							}
						}
					}
				}
			}
		} catch (@Pc(460) RuntimeException local460) {
			signlink.reporterror("20778, " + 14701 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local460.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AZWWSWYH", name = "a", descriptor = "(IBB[[B)Z")
	private static boolean method24(@OriginalArg(1) byte arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) byte[][] arg2) {
		try {
			@Pc(1) int local1 = 0;
			if (arg2[0][0] == arg0 && arg2[0][1] == arg1) {
				return true;
			}
			@Pc(28) int local28 = arg2.length - 1;
			if (arg2[local28][0] == arg0 && arg2[local28][1] == arg1) {
				return true;
			}
			do {
				@Pc(50) int local50 = (local1 + local28) / 2;
				if (arg2[local50][0] == arg0 && arg2[local50][1] == arg1) {
					return true;
				}
				if (arg0 < arg2[local50][0] || arg0 == arg2[local50][0] && arg1 < arg2[local50][1]) {
					local28 = local50;
				} else {
					local1 = local50;
				}
			} while (local1 != local28 && local1 + 1 != local28);
			return false;
		} catch (@Pc(104) RuntimeException local104) {
			signlink.reporterror("59768, " + 249 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local104.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AZWWSWYH", name = "a", descriptor = "(CCCI)I")
	private static int method25(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(2) char arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg3 <= 0) {
				return 1;
			} else if (arg0 == arg1) {
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
			signlink.reporterror("76636, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AZWWSWYH", name = "a", descriptor = "(ICCC)I")
	private static int method26(@OriginalArg(1) char arg0, @OriginalArg(2) char arg1, @OriginalArg(3) char arg2) {
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
						if ((arg1 != '1' || arg0 != '3') && (arg1 != 'i' || arg0 != '3')) {
							return 0;
						}
						return 2;
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
					if ((arg1 != '[' || arg0 != ')') && (arg1 != 'i' || arg0 != ')')) {
						return 0;
					}
					return 2;
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
					if (arg1 != '9' && arg1 != '6' && arg1 != 'q') {
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
		} catch (@Pc(513) RuntimeException local513) {
			signlink.reporterror("77820, " + -3474 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local513.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AZWWSWYH", name = "b", descriptor = "(CI)B")
	private static byte method27(@OriginalArg(0) char arg0) {
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
			signlink.reporterror("85919, " + arg0 + ", " + 926 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AZWWSWYH", name = "c", descriptor = "(I[C)V")
	private static void method28(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1) {
		try {
			@Pc(5) boolean local5 = false;
			@Pc(9) int local9 = 0;
			@Pc(11) int local11 = 0;
			@Pc(13) int local13 = 0;
			while (true) {
				do {
					@Pc(112) int local112;
					if ((local112 = method29(local9, arg1)) == -1) {
						return;
					}
					@Pc(17) boolean local17 = false;
					for (@Pc(19) int local19 = local9; local19 >= 0 && local19 < local112 && !local17; local19++) {
						if (!method31(arg1[local19]) && !method32(arg1[local19])) {
							local17 = true;
						}
					}
					if (local17) {
						local11 = 0;
					}
					if (local11 == 0) {
						local13 = local112;
					}
					local9 = method30(local112, arg1);
					@Pc(58) int local58 = 0;
					for (@Pc(60) int local60 = local112; local60 < local9; local60++) {
						local58 = local58 * 10 + arg1[local60] - 48;
					}
					if (local58 <= 255 && local9 - local112 <= 8) {
						local11++;
					} else {
						local11 = 0;
					}
				} while (local11 != 4);
				for (@Pc(94) int local94 = local13; local94 < local9; local94++) {
					arg1[local94] = '*';
				}
				local11 = 0;
			}
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("61593, " + arg0 + ", " + arg1 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AZWWSWYH", name = "a", descriptor = "(II[C)I")
	private static int method29(@OriginalArg(1) int arg0, @OriginalArg(2) char[] arg1) {
		try {
			for (@Pc(12) int local12 = arg0; local12 < arg1.length && local12 >= 0; local12++) {
				if (arg1[local12] >= '0' && arg1[local12] <= '9') {
					return local12;
				}
			}
			return -1;
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("65563, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AZWWSWYH", name = "b", descriptor = "(II[C)I")
	private static int method30(@OriginalArg(0) int arg0, @OriginalArg(2) char[] arg1) {
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
			signlink.reporterror("78146, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AZWWSWYH", name = "a", descriptor = "(ZC)Z")
	private static boolean method31(@OriginalArg(1) char arg0) {
		try {
			return !method33(arg0) && !method34(arg0);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("77881, " + false + ", " + arg0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AZWWSWYH", name = "a", descriptor = "(CZ)Z")
	private static boolean method32(@OriginalArg(0) char arg0) {
		try {
			if (arg0 >= 'a' && arg0 <= 'z') {
				return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
			} else {
				return true;
			}
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("35307, " + arg0 + ", " + true + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AZWWSWYH", name = "a", descriptor = "(IC)Z")
	private static boolean method33(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("92727, " + 0 + ", " + arg0 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AZWWSWYH", name = "b", descriptor = "(ZC)Z")
	private static boolean method34(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= '0' && arg0 <= '9';
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("67947, " + true + ", " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AZWWSWYH", name = "b", descriptor = "(IC)Z")
	private static boolean method35(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z';
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("99252, " + 0 + ", " + arg0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AZWWSWYH", name = "c", descriptor = "(IC)Z")
	private static boolean method36(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		try {
			if (arg0 >= 0) {
				aBoolean1 = true;
			}
			return arg1 >= 'A' && arg1 <= 'Z';
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("5032, " + arg0 + ", " + arg1 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AZWWSWYH", name = "b", descriptor = "(B[C)Z")
	private static boolean method37(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				if (!method34(arg0[local5]) && arg0[local5] != '\u0000') {
					local3 = false;
				}
			}
			if (local3) {
				return true;
			}
			@Pc(32) int local32 = method38(arg0);
			@Pc(34) int local34 = 0;
			@Pc(49) int local49 = anIntArray1.length - 1;
			if (local32 == anIntArray1[0] || local32 == anIntArray1[local49]) {
				return true;
			}
			do {
				@Pc(67) int local67 = (local34 + local49) / 2;
				if (local32 == anIntArray1[local67]) {
					return true;
				}
				if (local32 < anIntArray1[local67]) {
					local49 = local67;
				} else {
					local34 = local67;
				}
			} while (local34 != local49 && local34 + 1 != local49);
			return false;
		} catch (@Pc(96) RuntimeException local96) {
			signlink.reporterror("71289, " + 0 + ", " + arg0 + ", " + local96.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AZWWSWYH", name = "b", descriptor = "(Z[C)I")
	private static int method38(@OriginalArg(1) char[] arg0) {
		try {
			if (arg0.length > 6) {
				return 0;
			}
			@Pc(9) int local9 = 0;
			for (@Pc(15) int local15 = 0; local15 < arg0.length; local15++) {
				@Pc(26) char local26 = arg0[arg0.length - local15 - 1];
				if (local26 >= 'a' && local26 <= 'z') {
					local9 = local9 * 38 + local26 + 1 - 'a';
				} else if (local26 == '\'') {
					local9 = local9 * 38 + 27;
				} else if (local26 >= '0' && local26 <= '9') {
					local9 = local9 * 38 + local26 + 28 - '0';
				} else if (local26 != '\u0000') {
					return 0;
				}
			}
			return local9;
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("1351, " + true + ", " + arg0 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}
}
