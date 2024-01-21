import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!jc")
public final class Class19 {

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "Z")
	private static boolean aBoolean117;

	@OriginalMember(owner = "client!jc", name = "k", descriptor = "I")
	private static int anInt420;

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "[I")
	private static int[] anIntArray167;

	@OriginalMember(owner = "client!jc", name = "m", descriptor = "[[C")
	private static char[][] aCharArrayArray1;

	@OriginalMember(owner = "client!jc", name = "n", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!jc", name = "o", descriptor = "[[C")
	private static char[][] aCharArrayArray2;

	@OriginalMember(owner = "client!jc", name = "p", descriptor = "[[C")
	private static char[][] aCharArrayArray3;

	@OriginalMember(owner = "client!jc", name = "q", descriptor = "[I")
	private static int[] anIntArray168;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
	private static int anInt417 = 3073;

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
	private static int anInt418 = 95;

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "B")
	private static byte aByte17;

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "B")
	private static byte aByte18;

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "B")
	private static byte aByte19;

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "B")
	private static byte aByte20;

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
	private static int anInt419;

	@OriginalMember(owner = "client!jc", name = "r", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray6;

	static {
		aBoolean118 = true;
		aByte17 = 75;
		aByte18 = 75;
		aByte19 = 6;
		aByte20 = 6;
		anInt419 = 947;
		aBoolean119 = true;
		aStringArray6 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet" };
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!ub;)V")
	public static void method329(@OriginalArg(0) Class36 arg0) {
		@Pc(11) Class1_Sub3_Sub3 local11 = new Class1_Sub3_Sub3(arg0.method479((byte) 6, null, "fragmentsenc.txt"), 4);
		@Pc(21) Class1_Sub3_Sub3 local21 = new Class1_Sub3_Sub3(arg0.method479((byte) 6, null, "badenc.txt"), 4);
		@Pc(31) Class1_Sub3_Sub3 local31 = new Class1_Sub3_Sub3(arg0.method479((byte) 6, null, "domainenc.txt"), 4);
		@Pc(41) Class1_Sub3_Sub3 local41 = new Class1_Sub3_Sub3(arg0.method479((byte) 6, null, "tldlist.txt"), 4);
		method330(local11, local21, local31, local41);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!kb;Lclient!kb;Lclient!kb;Lclient!kb;)V")
	private static void method330(@OriginalArg(0) Class1_Sub3_Sub3 arg0, @OriginalArg(1) Class1_Sub3_Sub3 arg1, @OriginalArg(2) Class1_Sub3_Sub3 arg2, @OriginalArg(3) Class1_Sub3_Sub3 arg3) {
		method332(302, arg1);
		method333(arg2);
		method334(arg0);
		method331(arg3, 158);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!kb;I)V")
	private static void method331(@OriginalArg(0) Class1_Sub3_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) int local4 = arg0.method385();
			aCharArrayArray3 = new char[local4][];
			anIntArray168 = new int[local4];
			@Pc(14) boolean local14 = false;
			for (@Pc(16) int local16 = 0; local16 < local4; local16++) {
				anIntArray168[local16] = arg0.method380();
				@Pc(27) char[] local27 = new char[arg0.method380()];
				for (@Pc(29) int local29 = 0; local29 < local27.length; local29++) {
					local27[local29] = (char) arg0.method380();
				}
				aCharArrayArray3[local16] = local27;
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("1805, " + arg0 + ", " + arg1 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILclient!kb;)V")
	private static void method332(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub3_Sub3 arg1) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(6) int local6 = arg1.method385();
			aCharArrayArray1 = new char[local6][];
			aByteArrayArrayArray8 = new byte[local6][][];
			method335(arg1, aByteArrayArrayArray8, aCharArrayArray1);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("54905, " + arg0 + ", " + arg1 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(ILclient!kb;)V")
	private static void method333(@OriginalArg(1) Class1_Sub3_Sub3 arg0) {
		try {
			@Pc(2) int local2 = arg0.method385();
			aCharArrayArray2 = new char[local2][];
			method336(arg0, aByte17, aCharArrayArray2);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("70771, " + ", " + arg0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!kb;Z)V")
	private static void method334(@OriginalArg(0) Class1_Sub3_Sub3 arg0) {
		try {
			anIntArray167 = new int[arg0.method385()];
			for (@Pc(8) int local8 = 0; local8 < anIntArray167.length; local8++) {
				anIntArray167[local8] = arg0.method382();
			}
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("91556, " + arg0 + ", " + true + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILclient!kb;[[[B[[C)V")
	private static void method335(@OriginalArg(1) Class1_Sub3_Sub3 arg0, @OriginalArg(2) byte[][][] arg1, @OriginalArg(3) char[][] arg2) {
		try {
			for (@Pc(11) int local11 = 0; local11 < arg2.length; local11++) {
				@Pc(17) char[] local17 = new char[arg0.method380()];
				for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
					local17[local19] = (char) arg0.method380();
				}
				arg2[local11] = local17;
				@Pc(41) byte[][] local41 = new byte[arg0.method380()][2];
				for (@Pc(43) int local43 = 0; local43 < local41.length; local43++) {
					local41[local43][0] = (byte) arg0.method380();
					local41[local43][1] = (byte) arg0.method380();
				}
				if (local41.length > 0) {
					arg1[local11] = local41;
				}
			}
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("2098, " + -467 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!kb;B[[C)V")
	private static void method336(@OriginalArg(0) Class1_Sub3_Sub3 arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) char[][] arg2) {
		try {
			if (arg1 == aByte18) {
				for (@Pc(7) int local7 = 0; local7 < arg2.length; local7++) {
					@Pc(13) char[] local13 = new char[arg0.method380()];
					for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
						local13[local15] = (char) arg0.method380();
					}
					arg2[local7] = local13;
				}
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("41798, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I[C)V")
	private static void method337(@OriginalArg(1) char[] arg0) {
		try {
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				if (!method338(arg0[local5])) {
					arg0[local5] = ' ';
				}
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("26193, " + 7 + ", " + arg0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(CI)Z")
	private static boolean method338(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= ' ' && arg0 <= '\u007f' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("71136, " + arg0 + ", " + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method339(@OriginalArg(1) String arg0) {
		try {
			@Pc(10) long local10 = System.currentTimeMillis();
			@Pc(14) char[] local14 = arg0.toLowerCase().toCharArray();
			method337(local14);
			method347(local14);
			method342(local14);
			method343(local14);
			method356(288, local14);
			for (@Pc(31) int local31 = 0; local31 < aStringArray6.length; local31++) {
				@Pc(41) int local41 = -1;
				while ((local41 = arg0.indexOf(aStringArray6[local31], local41 + 1)) != -1) {
					@Pc(48) char[] local48 = aStringArray6[local31].toCharArray();
					for (@Pc(50) int local50 = 0; local50 < local48.length; local50++) {
						local14[local50 + local41] = local48[local50];
					}
				}
			}
			method340(local14, arg0.toCharArray());
			method341(aByte20, local14);
			@Pc(92) long local92 = System.currentTimeMillis();
			return (new String(local14)).trim();
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("95634, " + -82 + ", " + arg0 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(B[C[C)V")
	private static void method340(@OriginalArg(1) char[] arg0, @OriginalArg(2) char[] arg1) {
		try {
			if (aByte19 != 6) {
				aBoolean117 = !aBoolean117;
			}
			for (@Pc(10) int local10 = 0; local10 < arg1.length; local10++) {
				if (arg0[local10] != '*' && method364(arg1[local10])) {
					arg0[local10] = arg1[local10];
				}
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("71046, " + 6 + ", " + arg0 + ", " + arg1 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(B[C)V")
	private static void method341(@OriginalArg(0) byte arg0, @OriginalArg(1) char[] arg1) {
		try {
			if (arg0 != 6) {
				for (@Pc(6) int local6 = 1; local6 > 0; local6++) {
				}
			}
			@Pc(13) boolean local13 = true;
			for (@Pc(15) int local15 = 0; local15 < arg1.length; local15++) {
				@Pc(21) char local21 = arg1[local15];
				if (!method361(local21)) {
					local13 = true;
				} else if (local13) {
					if (method363(local21)) {
						local13 = false;
					}
				} else if (method364(local21)) {
					arg1[local15] = (char) (local21 + 'a' - 65);
				}
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("95383, " + arg0 + ", " + arg1 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(B[C)V")
	private static void method342(@OriginalArg(1) char[] arg0) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 2; local3++) {
				for (@Pc(10) int local10 = aCharArrayArray1.length - 1; local10 >= 0; local10--) {
					method351(aByteArrayArrayArray8[local10], arg0, aCharArrayArray1[local10], 149);
				}
			}
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("17524, " + ", " + arg0 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(I[C)V")
	private static void method343(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(18) char[] local18 = new char[] { '(', 'a', ')' };
			method351(null, local3, local18, 149);
			@Pc(35) char[] local35 = (char[]) arg0.clone();
			@Pc(50) char[] local50 = new char[] { 'd', 'o', 't' };
			method351(null, local35, local50, 149);
			for (@Pc(60) int local60 = aCharArrayArray2.length - 1; local60 >= 0; local60--) {
				method344(aCharArrayArray2[local60], local35, (byte) 8, local3, arg0);
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("26497, " + 804 + ", " + arg0 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "([C[CB[C[C)V")
	private static void method344(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) char[] arg3, @OriginalArg(4) char[] arg4) {
		try {
			if (arg0.length <= arg4.length) {
				@Pc(14) boolean local14 = false;
				@Pc(32) int local32;
				for (@Pc(24) int local24 = 0; local24 <= arg4.length - arg0.length; local24 += local32) {
					@Pc(28) int local28 = local24;
					@Pc(30) int local30 = 0;
					local32 = 1;
					label58: while (true) {
						while (true) {
							if (local28 >= arg4.length) {
								break label58;
							}
							@Pc(40) char local40 = arg4[local28];
							@Pc(42) char local42 = 0;
							if (local28 + 1 < arg4.length) {
								local42 = arg4[local28 + 1];
							}
							@Pc(67) int local67;
							if (local30 < arg0.length && (local67 = method353(arg0[local30], local42, local40)) > 0) {
								local28 += local67;
								local30++;
							} else {
								if (local30 == 0) {
									break label58;
								}
								@Pc(88) int local88;
								if ((local88 = method353(arg0[local30 - 1], local42, local40)) > 0) {
									local28 += local88;
									if (local30 == 1) {
										local32++;
									}
								} else {
									if (local30 >= arg0.length || !method359(local40)) {
										break label58;
									}
									local28++;
								}
							}
						}
					}
					if (local30 >= arg0.length) {
						@Pc(119) boolean local119 = false;
						@Pc(125) int local125 = method345(arg4, local24, arg3);
						@Pc(133) int local133 = method346(local28 - 1, arg4, arg1);
						if (local125 > 2 || local133 > 2) {
							local119 = true;
						}
						if (local119) {
							for (@Pc(145) int local145 = local24; local145 < local28; local145++) {
								arg4[local145] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(168) RuntimeException local168) {
			signlink.reporterror("79747, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local168.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I[CI[C)I")
	private static int method345(@OriginalArg(1) char[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg1 == 0) {
				return 2;
			}
			for (@Pc(14) int local14 = arg1 - 1; local14 >= 0 && method359(arg0[local14]); local14--) {
				if (arg0[local14] == '@') {
					return 3;
				}
			}
			@Pc(34) int local34 = 0;
			for (@Pc(38) int local38 = arg1 - 1; local38 >= 0 && method359(arg2[local38]); local38--) {
				if (arg2[local38] == '*') {
					local34++;
				}
			}
			if (local34 >= 3) {
				return 4;
			} else if (method359(arg0[arg1 - 1])) {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("15997, " + 21835 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I[C[CB)I")
	private static int method346(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2) {
		try {
			if (arg0 + 1 == arg1.length) {
				return 2;
			}
			@Pc(18) int local18 = arg0 + 1;
			while (true) {
				if (local18 < arg1.length && method359(arg1[local18])) {
					if (arg1[local18] != '.' && arg1[local18] != ',') {
						local18++;
						continue;
					}
					return 3;
				}
				@Pc(45) int local45 = 0;
				for (@Pc(49) int local49 = arg0 + 1; local49 < arg1.length && method359(arg2[local49]); local49++) {
					if (arg2[local49] == '*') {
						local45++;
					}
				}
				if (local45 >= 3) {
					return 4;
				}
				if (method359(arg1[arg0 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("45251, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -2 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "([CI)V")
	private static void method347(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(18) char[] local18 = new char[] { 'd', 'o', 't' };
			method351(null, local3, local18, 149);
			@Pc(27) char[] local27 = (char[]) arg0.clone();
			@Pc(50) char[] local50 = new char[] { 's', 'l', 'a', 's', 'h' };
			method351(null, local27, local50, 149);
			for (@Pc(65) int local65 = 0; local65 < aCharArrayArray3.length; local65++) {
				method348(local3, aCharArrayArray3[local65], anIntArray168[local65], arg0, local27);
			}
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("40293, " + arg0 + ", " + 947 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "([C[CII[C[C)V")
	private static void method348(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) char[] arg3, @OriginalArg(5) char[] arg4) {
		try {
			if (arg1.length <= arg3.length) {
				@Pc(26) int local26;
				for (@Pc(18) int local18 = 0; local18 <= arg3.length - arg1.length; local18 += local26) {
					@Pc(22) int local22 = local18;
					@Pc(24) int local24 = 0;
					local26 = 1;
					label120: while (true) {
						while (true) {
							if (local22 >= arg3.length) {
								break label120;
							}
							@Pc(34) char local34 = arg3[local22];
							@Pc(36) char local36 = 0;
							if (local22 + 1 < arg3.length) {
								local36 = arg3[local22 + 1];
							}
							@Pc(61) int local61;
							if (local24 < arg1.length && (local61 = method353(arg1[local24], local36, local34)) > 0) {
								local22 += local61;
								local24++;
							} else {
								if (local24 == 0) {
									break label120;
								}
								@Pc(82) int local82;
								if ((local82 = method353(arg1[local24 - 1], local36, local34)) > 0) {
									local22 += local82;
									if (local24 == 1) {
										local26++;
									}
								} else {
									if (local24 >= arg1.length || !method359(local34)) {
										break label120;
									}
									local22++;
								}
							}
						}
					}
					if (local24 >= arg1.length) {
						@Pc(113) boolean local113 = false;
						@Pc(119) int local119 = method349(arg3, local18, arg0);
						@Pc(127) int local127 = method350(arg4, local22 - 1, arg3);
						if (arg2 == 1 && local119 > 0 && local127 > 0) {
							local113 = true;
						}
						if (arg2 == 2 && (local119 > 2 && local127 > 0 || local119 > 0 && local127 > 2)) {
							local113 = true;
						}
						if (arg2 == 3 && local119 > 0 && local127 > 2) {
							local113 = true;
						}
						@Pc(170) boolean local170;
						if (arg2 == 3 && local119 > 2 && local127 > 0) {
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
											if (arg0[local193] != '*') {
												break;
											}
											local177 = local193;
										} else if (arg0[local193] == '*') {
											local177 = local193;
											local189 = true;
										}
									}
								}
								local189 = false;
								for (local193 = local177 - 1; local193 >= 0; local193--) {
									if (local189) {
										if (method359(arg3[local193])) {
											break;
										}
										local177 = local193;
									} else if (!method359(arg3[local193])) {
										local189 = true;
										local177 = local193;
									}
								}
							}
							if (local127 > 2) {
								if (local127 == 4) {
									local189 = false;
									for (local193 = local181 + 1; local193 < arg3.length; local193++) {
										if (local189) {
											if (arg4[local193] != '*') {
												break;
											}
											local181 = local193;
										} else if (arg4[local193] == '*') {
											local181 = local193;
											local189 = true;
										}
									}
								}
								local189 = false;
								for (local193 = local181 + 1; local193 < arg3.length; local193++) {
									if (local189) {
										if (method359(arg3[local193])) {
											break;
										}
										local181 = local193;
									} else if (!method359(arg3[local193])) {
										local189 = true;
										local181 = local193;
									}
								}
							}
							for (@Pc(327) int local327 = local177; local327 <= local181; local327++) {
								arg3[local327] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(350) RuntimeException local350) {
			signlink.reporterror("90405, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 1 + ", " + arg3 + ", " + arg4 + ", " + local350.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "([CBI[C)I")
	private static int method349(@OriginalArg(0) char[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg1 == 0) {
				return 2;
			}
			@Pc(9) int local9 = arg1 - 1;
			while (true) {
				if (local9 >= 0 && method359(arg0[local9])) {
					if (arg0[local9] != ',' && arg0[local9] != '.') {
						local9--;
						continue;
					}
					return 3;
				}
				@Pc(34) int local34 = 0;
				for (@Pc(48) int local48 = arg1 - 1; local48 >= 0 && method359(arg2[local48]); local48--) {
					if (arg2[local48] == '*') {
						local34++;
					}
				}
				if (local34 >= 3) {
					return 4;
				}
				if (method359(arg0[arg1 - 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("6456, " + arg0 + ", " + -80 + ", " + arg1 + ", " + arg2 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "([CIB[C)I")
	private static int method350(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg1 + 1 == arg2.length) {
				return 2;
			}
			@Pc(13) int local13 = arg1 + 1;
			while (true) {
				if (local13 < arg2.length && method359(arg2[local13])) {
					if (arg2[local13] != '\\' && arg2[local13] != '/') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(45) int local45 = 0;
				for (@Pc(49) int local49 = arg1 + 1; local49 < arg2.length && method359(arg0[local49]); local49++) {
					if (arg0[local49] == '*') {
						local45++;
					}
				}
				if (local45 >= 5) {
					return 4;
				}
				if (method359(arg2[arg1 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("99171, " + arg0 + ", " + arg1 + ", " + -3 + ", " + arg2 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "([[B[C[CI)V")
	private static void method351(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg2.length <= arg1.length) {
				@Pc(13) boolean local13 = false;
				@Pc(25) int local25;
				for (@Pc(15) int local15 = 0; local15 <= arg1.length - arg2.length; local15 += local25) {
					@Pc(19) int local19 = local15;
					@Pc(21) int local21 = 0;
					@Pc(23) int local23 = 0;
					local25 = 1;
					@Pc(27) boolean local27 = false;
					@Pc(35) char var11;
					@Pc(37) char var12;
					label126: while (true) {
						while (true) {
							if (local19 >= arg1.length) {
								break label126;
							}
							var11 = arg1[local19];
							var12 = '\u0000';
							if (local19 + 1 < arg1.length) {
								var12 = arg1[local19 + 1];
							}
							@Pc(62) int local62;
							if (local21 < arg2.length && (local62 = method354(var11, var12, arg2[local21])) > 0) {
								local19 += local62;
								local21++;
							} else {
								if (local21 == 0) {
									break label126;
								}
								@Pc(83) int local83;
								if ((local83 = method354(var11, var12, arg2[local21 - 1])) > 0) {
									local19 += local83;
									if (local21 == 1) {
										local25++;
									}
								} else {
									if (local21 >= arg2.length || !method360(var11)) {
										break label126;
									}
									if (method359(var11) && var11 != '\'') {
										local27 = true;
									}
									local19++;
									local23++;
									if (local23 * 100 / (local19 - local15) > 90) {
										break label126;
									}
								}
							}
						}
					}
					if (local21 >= arg2.length) {
						@Pc(134) boolean local134 = true;
						if (local27) {
							@Pc(180) boolean local180 = false;
							@Pc(182) boolean local182 = false;
							if (local15 - 1 < 0 || method359(arg1[local15 - 1]) && arg1[local15 - 1] != '\'') {
								local180 = true;
							}
							if (local19 >= arg1.length || method359(arg1[local19]) && arg1[local19] != '\'') {
								local182 = true;
							}
							if (!local180 || !local182) {
								@Pc(226) boolean local226 = false;
								@Pc(230) int local230 = local15 - 2;
								if (local180) {
									local230 = local15;
								}
								while (!local226 && local230 < local19) {
									if (local230 >= 0 && (!method359(arg1[local230]) || arg1[local230] == '\'')) {
										@Pc(252) char[] local252 = new char[3];
										@Pc(254) int local254;
										for (local254 = 0; local254 < 3 && local230 + local254 < arg1.length && (!method359(arg1[local230 + local254]) || arg1[local230 + local254] == '\''); local254++) {
											local252[local254] = arg1[local230 + local254];
										}
										@Pc(292) boolean local292 = true;
										if (local254 == 0) {
											local292 = false;
										}
										if (local254 < 3 && local230 - 1 >= 0 && (!method359(arg1[local230 - 1]) || arg1[local230 - 1] == '\'')) {
											local292 = false;
										}
										if (local292 && !method365(local252)) {
											local226 = true;
										}
									}
									local230++;
								}
								if (!local226) {
									local134 = false;
								}
							}
						} else {
							var11 = ' ';
							if (local15 - 1 >= 0) {
								var11 = arg1[local15 - 1];
							}
							var12 = ' ';
							if (local19 < arg1.length) {
								var12 = arg1[local19];
							}
							@Pc(162) byte local162 = method355(var11);
							@Pc(166) byte local166 = method355(var12);
							if (arg0 != null && method352(local162, local166, arg0)) {
								local134 = false;
							}
						}
						if (local134) {
							@Pc(342) int local342 = 0;
							for (@Pc(344) int local344 = local15; local344 < local19; local344++) {
								if (method362(arg1[local344])) {
									local342++;
								}
							}
							if (local342 * 100 / (local19 - local15) <= 50) {
								for (@Pc(368) int local368 = local15; local368 < local19; local368++) {
									arg1[local368] = '*';
								}
							}
						}
					}
				}
			}
		} catch (@Pc(391) RuntimeException local391) {
			signlink.reporterror("28826, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local391.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BBI[[B)Z")
	private static boolean method352(@OriginalArg(0) byte arg0, @OriginalArg(1) byte arg1, @OriginalArg(3) byte[][] arg2) {
		try {
			@Pc(3) int local3 = 0;
			if (arg2[0][0] == arg0 && arg2[0][1] == arg1) {
				return true;
			}
			@Pc(24) int local24 = arg2.length - 1;
			if (arg2[local24][0] == arg0 && arg2[local24][1] == arg1) {
				return true;
			}
			do {
				@Pc(56) int local56 = (local3 + local24) / 2;
				if (arg2[local56][0] == arg0 && arg2[local56][1] == arg1) {
					return true;
				}
				if (arg0 < arg2[local56][0] || arg0 == arg2[local56][0] && arg1 < arg2[local56][1]) {
					local24 = local56;
				} else {
					local3 = local56;
				}
			} while (local3 != local24 && local3 + 1 != local24);
			return false;
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("86833, " + arg0 + ", " + arg1 + ", " + 10068 + ", " + arg2 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(CCCB)I")
	private static int method353(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(2) char arg2) {
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
			signlink.reporterror("70255, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 17 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(CZCC)I")
	private static int method354(@OriginalArg(0) char arg0, @OriginalArg(2) char arg1, @OriginalArg(3) char arg2) {
		try {
			if (arg2 == arg0) {
				return 1;
			}
			if (arg2 >= 'a' && arg2 <= 'm') {
				if (arg2 == 'a') {
					if (arg0 != '4' && arg0 != '@' && arg0 != '^') {
						if (arg0 == '/' && arg1 == '\\') {
							return 2;
						}
						return 0;
					}
					return 1;
				}
				if (arg2 == 'b') {
					if (arg0 == '1' && arg1 == '3') {
						return 2;
					}
					return 0;
				}
				if (arg2 == 'c') {
					if (arg0 != '(' && arg0 != '<' && arg0 != '{' && arg0 != '[') {
						return 0;
					}
					return 1;
				}
				if (arg2 == 'd') {
					return 0;
				}
				if (arg2 == 'e') {
					if (arg0 != '3' && arg0 != '€') {
						return 0;
					}
					return 1;
				}
				if (arg2 == 'f') {
					if (arg0 == 'p' && arg1 == 'h') {
						return 2;
					}
					if (arg0 == '£') {
						return 1;
					}
					return 0;
				}
				if (arg2 == 'g') {
					if (arg0 != '9' && arg0 != '6') {
						return 0;
					}
					return 1;
				}
				if (arg2 == 'h') {
					if (arg0 == '#') {
						return 1;
					}
					return 0;
				}
				if (arg2 == 'i') {
					if (arg0 != 'y' && arg0 != 'l' && arg0 != 'j' && arg0 != '1' && arg0 != '!' && arg0 != ':' && arg0 != ';' && arg0 != '|') {
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
					if (arg0 != '1' && arg0 != '|' && arg0 != 'i') {
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
					if (arg0 != '0' && arg0 != '*') {
						if ((arg0 != '(' || arg1 != ')') && (arg0 != '[' || arg1 != ']') && (arg0 != '{' || arg1 != '}') && (arg0 != '<' || arg1 != '>')) {
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
					if (arg0 != '5' && arg0 != 'z' && arg0 != '$' && arg0 != '2') {
						return 0;
					}
					return 1;
				}
				if (arg2 == 't') {
					if (arg0 == '7') {
						return 1;
					}
					return 0;
				}
				if (arg2 == 'u') {
					if (arg0 == 'v') {
						return 1;
					}
					if ((arg0 != '\\' || arg1 != '/') && (arg0 != '\\' || arg1 != '|') && (arg0 != '|' || arg1 != '/')) {
						return 0;
					}
					return 2;
				}
				if (arg2 == 'v') {
					if ((arg0 != '\\' || arg1 != '/') && (arg0 != '\\' || arg1 != '|') && (arg0 != '|' || arg1 != '/')) {
						return 0;
					}
					return 2;
				}
				if (arg2 == 'w') {
					if (arg0 == 'v' && arg1 == 'v') {
						return 2;
					}
					return 0;
				}
				if (arg2 == 'x') {
					if ((arg0 != ')' || arg1 != '(') && (arg0 != '}' || arg1 != '{') && (arg0 != ']' || arg1 != '[') && (arg0 != '>' || arg1 != '<')) {
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
					if (arg0 == 'o' || arg0 == 'O') {
						return 1;
					} else if (arg0 == '(' && arg1 == ')' || arg0 == '{' && arg1 == '}' || arg0 == '[' && arg1 == ']') {
						return 2;
					} else {
						return 0;
					}
				} else if (arg2 == '1') {
					return arg0 == 'l' ? 1 : 0;
				} else {
					return 0;
				}
			} else if (arg2 == ',') {
				return arg0 == '.' ? 1 : 0;
			} else if (arg2 == '.') {
				return arg0 == ',' ? 1 : 0;
			} else if (arg2 == '!') {
				return arg0 == 'i' ? 1 : 0;
			} else {
				return 0;
			}
		} catch (@Pc(483) RuntimeException local483) {
			signlink.reporterror("81512, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + local483.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZC)B")
	private static byte method355(@OriginalArg(1) char arg0) {
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
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("20879, " + false + ", " + arg0 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(I[C)V")
	private static void method356(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1) {
		try {
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			@Pc(9) int local9 = 0;
			@Pc(13) boolean local13 = false;
			while (true) {
				do {
					@Pc(112) int local112;
					if ((local112 = method357(arg1, anInt420, local5)) == -1) {
						return;
					}
					@Pc(17) boolean local17 = false;
					for (@Pc(19) int local19 = local5; local19 >= 0 && local19 < local112 && !local17; local19++) {
						if (!method359(arg1[local19]) && !method360(arg1[local19])) {
							local17 = true;
						}
					}
					if (local17) {
						local7 = 0;
					}
					if (local7 == 0) {
						local9 = local112;
					}
					local5 = method358(arg1, local112);
					@Pc(58) int local58 = 0;
					for (@Pc(60) int local60 = local112; local60 < local5; local60++) {
						local58 = local58 * 10 + arg1[local60] - 48;
					}
					if (local58 <= 255 && local5 - local112 <= 8) {
						local7++;
					} else {
						local7 = 0;
					}
				} while (local7 != 4);
				for (@Pc(94) int local94 = local9; local94 < local5; local94++) {
					arg1[local94] = '*';
				}
				local7 = 0;
			}
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("45645, " + arg0 + ", " + arg1 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "([CII)I")
	private static int method357(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			for (@Pc(1) int local1 = arg2; local1 < arg0.length && local1 >= 0; local1++) {
				if (arg0[local1] >= '0' && arg0[local1] <= '9') {
					return local1;
				}
			}
			return arg1 == 0 ? -1 : anInt417;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("78345, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "([CII)I")
	private static int method358(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(13) int local13 = arg1;
			while (true) {
				if (local13 < arg0.length && local13 >= 0) {
					if (arg0[local13] >= '0' && arg0[local13] <= '9') {
						local13++;
						continue;
					}
					return local13;
				}
				return arg0.length;
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("75252, " + arg0 + ", " + arg1 + ", " + -401 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IC)Z")
	private static boolean method359(@OriginalArg(1) char arg0) {
		try {
			return !method361(arg0) && !method362(arg0);
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("32734, " + 9 + ", " + arg0 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BC)Z")
	private static boolean method360(@OriginalArg(1) char arg0) {
		try {
			if (arg0 >= 'a' && arg0 <= 'z') {
				return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
			} else {
				return true;
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("50519, " + 73 + ", " + arg0 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(IC)Z")
	private static boolean method361(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("14566, " + -682 + ", " + arg0 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(CB)Z")
	private static boolean method362(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= '0' && arg0 <= '9';
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("77906, " + arg0 + ", " + -70 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(BC)Z")
	private static boolean method363(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z';
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("70917, " + 4 + ", " + arg0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(CI)Z")
	private static boolean method364(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("35219, " + arg0 + ", " + 8 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z[C)Z")
	private static boolean method365(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(12) boolean local12 = true;
			for (@Pc(14) int local14 = 0; local14 < arg0.length; local14++) {
				if (!method362(arg0[local14]) && arg0[local14] != '\u0000') {
					local12 = false;
				}
			}
			if (local12) {
				return true;
			}
			@Pc(41) int local41 = method366(arg0);
			@Pc(43) int local43 = 0;
			@Pc(48) int local48 = anIntArray167.length - 1;
			if (local41 == anIntArray167[0] || local41 == anIntArray167[local48]) {
				return true;
			}
			do {
				@Pc(66) int local66 = (local43 + local48) / 2;
				if (local41 == anIntArray167[local66]) {
					return true;
				}
				if (local41 < anIntArray167[local66]) {
					local48 = local66;
				} else {
					local43 = local66;
				}
			} while (local43 != local48 && local43 + 1 != local48);
			return false;
		} catch (@Pc(95) RuntimeException local95) {
			signlink.reporterror("42434, " + false + ", " + arg0 + ", " + local95.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "([CI)I")
	private static int method366(@OriginalArg(0) char[] arg0) {
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
			signlink.reporterror("80929, " + arg0 + ", " + 9 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}
}
