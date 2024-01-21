import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!sc")
public final class Class42 {

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
	private static int anInt944;

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
	private static int anInt946;

	@OriginalMember(owner = "client!sc", name = "m", descriptor = "[I")
	private static int[] anIntArray254;

	@OriginalMember(owner = "client!sc", name = "n", descriptor = "[[C")
	private static char[][] aCharArrayArray1;

	@OriginalMember(owner = "client!sc", name = "o", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!sc", name = "p", descriptor = "[[C")
	private static char[][] aCharArrayArray2;

	@OriginalMember(owner = "client!sc", name = "q", descriptor = "[[C")
	private static char[][] aCharArrayArray3;

	@OriginalMember(owner = "client!sc", name = "r", descriptor = "[I")
	private static int[] anIntArray255;

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
	private static int anInt945;

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "B")
	private static byte aByte55;

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
	private static int anInt947;

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
	private static int anInt948;

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "B")
	private static byte aByte56;

	@OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
	private static int anInt949;

	@OriginalMember(owner = "client!sc", name = "j", descriptor = "B")
	private static byte aByte57;

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
	private static int anInt950;

	@OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
	private static int anInt951;

	@OriginalMember(owner = "client!sc", name = "s", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray13;

	static {
		aBoolean220 = true;
		anInt945 = 24133;
		aByte55 = 117;
		anInt947 = 9;
		anInt948 = -854;
		aByte56 = 9;
		anInt949 = 8;
		aByte57 = 7;
		anInt950 = 310;
		anInt951 = 315;
		aStringArray13 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!xb;)V")
	public static void method594(@OriginalArg(0) Class47 arg0) {
		@Pc(10) Class1_Sub1_Sub3 local10 = new Class1_Sub1_Sub3(false, arg0.method666("fragmentsenc.txt", null));
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(false, arg0.method666("badenc.txt", null));
		@Pc(28) Class1_Sub1_Sub3 local28 = new Class1_Sub1_Sub3(false, arg0.method666("domainenc.txt", null));
		@Pc(37) Class1_Sub1_Sub3 local37 = new Class1_Sub1_Sub3(false, arg0.method666("tldlist.txt", null));
		method595(local10, local19, local28, local37);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!lb;Lclient!lb;Lclient!lb;Lclient!lb;)V")
	private static void method595(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) Class1_Sub1_Sub3 arg2, @OriginalArg(3) Class1_Sub1_Sub3 arg3) {
		method597(anInt946, arg1);
		method598(arg2);
		method599(362, arg0);
		method596(arg3);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!lb;Z)V")
	private static void method596(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(4) int local4 = arg0.method485();
			aCharArrayArray3 = new char[local4][];
			anIntArray255 = new int[local4];
			for (@Pc(12) int local12 = 0; local12 < local4; local12++) {
				anIntArray255[local12] = arg0.method480();
				@Pc(23) char[] local23 = new char[arg0.method480()];
				for (@Pc(25) int local25 = 0; local25 < local23.length; local25++) {
					local23[local25] = (char) arg0.method480();
				}
				aCharArrayArray3[local12] = local23;
			}
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("67205, " + arg0 + ", " + true + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!lb;)V")
	private static void method597(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			@Pc(2) int local2 = arg1.method485();
			if (arg0 != 0) {
				for (@Pc(6) int local6 = 1; local6 > 0; local6++) {
				}
			}
			aCharArrayArray1 = new char[local2][];
			aByteArrayArrayArray8 = new byte[local2][][];
			method600(arg1, aByteArrayArrayArray8, aCharArrayArray1);
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("11271, " + arg0 + ", " + arg1 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!lb;I)V")
	private static void method598(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(2) int local2 = arg0.method485();
			aCharArrayArray2 = new char[local2][];
			method601(arg0, aCharArrayArray2);
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("51462, " + arg0 + ", " + 2 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(ILclient!lb;)V")
	private static void method599(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			anIntArray254 = new int[arg1.method485()];
			for (@Pc(5) int local5 = 0; local5 < anIntArray254.length; local5++) {
				anIntArray254[local5] = arg1.method482();
			}
			@Pc(21) boolean local21 = false;
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("62340, " + arg0 + ", " + arg1 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!lb;Z[[[B[[C)V")
	private static void method600(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(2) byte[][][] arg1, @OriginalArg(3) char[][] arg2) {
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
			signlink.reporterror("12704, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!lb;[[CI)V")
	private static void method601(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) char[][] arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
				@Pc(9) char[] local9 = new char[arg0.method480()];
				for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
					local9[local11] = (char) arg0.method480();
				}
				arg1[local3] = local9;
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("25285, " + arg0 + ", " + arg1 + ", " + -915 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[C)V")
	private static void method602(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(12) int local12 = 0;
			for (@Pc(14) int local14 = 0; local14 < arg0.length; local14++) {
				if (method603(arg0[local14], 253)) {
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
			signlink.reporterror("42635, " + 3 + ", " + arg0 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(CI)Z")
	private static boolean method603(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			return arg0 >= ' ' && arg0 <= '\u007f' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("76009, " + arg0 + ", " + arg1 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method604(@OriginalArg(1) String arg0) {
		try {
			@Pc(3) long local3 = System.currentTimeMillis();
			@Pc(6) char[] local6 = arg0.toCharArray();
			method602(local6);
			@Pc(15) String local15 = (new String(local6)).trim();
			@Pc(19) char[] local19 = local15.toLowerCase().toCharArray();
			@Pc(22) String local22 = local15.toLowerCase();
			method612(local19);
			method607(local19);
			method608(local19);
			method621(local19);
			for (@Pc(41) int local41 = 0; local41 < aStringArray13.length; local41++) {
				@Pc(51) int local51 = -1;
				while ((local51 = local22.indexOf(aStringArray13[local41], local51 + 1)) != -1) {
					@Pc(58) char[] local58 = aStringArray13[local41].toCharArray();
					for (@Pc(60) int local60 = 0; local60 < local58.length; local60++) {
						local19[local60 + local51] = local58[local60];
					}
				}
			}
			method605(local19, local15.toCharArray(), aByte55);
			method606(local19, anInt947);
			@Pc(102) long local102 = System.currentTimeMillis();
			return (new String(local19)).trim();
		} catch (@Pc(109) RuntimeException local109) {
			signlink.reporterror("28288, " + 2 + ", " + arg0 + ", " + local109.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([C[CB)V")
	private static void method605(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) byte arg2) {
		try {
			@Pc(6) int local6;
			if (arg2 != 117) {
				for (local6 = 1; local6 > 0; local6++) {
				}
			}
			for (local6 = 0; local6 < arg1.length; local6++) {
				if (arg0[local6] != '*' && method629(arg1[local6])) {
					arg0[local6] = arg1[local6];
				}
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("58311, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CI)V")
	private static void method606(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 >= 9 && arg1 <= 9) {
				@Pc(10) boolean local10 = true;
				for (@Pc(12) int local12 = 0; local12 < arg0.length; local12++) {
					@Pc(18) char local18 = arg0[local12];
					if (!method626(local18)) {
						local10 = true;
					} else if (local10) {
						if (method628((byte) 7, local18)) {
							local10 = false;
						}
					} else if (method629(local18)) {
						arg0[local12] = (char) (local18 + 'a' - 65);
					}
				}
			}
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("11276, " + arg0 + ", " + arg1 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "([CI)V")
	private static void method607(@OriginalArg(0) char[] arg0) {
		try {
			for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
				for (@Pc(14) int local14 = aCharArrayArray1.length - 1; local14 >= 0; local14--) {
					method616(aByteArrayArrayArray8[local14], arg0, aCharArrayArray1[local14]);
				}
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("44339, " + arg0 + ", " + -41759 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "([CI)V")
	private static void method608(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(18) char[] local18 = new char[] { '(', 'a', ')' };
			method616(null, local3, local18);
			@Pc(27) char[] local27 = (char[]) arg0.clone();
			@Pc(42) char[] local42 = new char[] { 'd', 'o', 't' };
			method616(null, local27, local42);
			for (@Pc(56) int local56 = aCharArrayArray2.length - 1; local56 >= 0; local56--) {
				method609(aCharArrayArray2[local56], local27, arg0, local3);
			}
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("51904, " + arg0 + ", " + -45157 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([C[C[C[CI)V")
	private static void method609(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) char[] arg3) {
		try {
			if (arg0.length <= arg2.length) {
				@Pc(22) int local22;
				for (@Pc(14) int local14 = 0; local14 <= arg2.length - arg0.length; local14 += local22) {
					@Pc(18) int local18 = local14;
					@Pc(20) int local20 = 0;
					local22 = 1;
					label58: while (true) {
						while (true) {
							if (local18 >= arg2.length) {
								break label58;
							}
							@Pc(30) char local30 = arg2[local18];
							@Pc(32) char local32 = 0;
							if (local18 + 1 < arg2.length) {
								local32 = arg2[local18 + 1];
							}
							@Pc(57) int local57;
							if (local20 < arg0.length && (local57 = method618(arg0[local20], local30, local32)) > 0) {
								local18 += local57;
								local20++;
							} else {
								if (local20 == 0) {
									break label58;
								}
								@Pc(78) int local78;
								if ((local78 = method618(arg0[local20 - 1], local30, local32)) > 0) {
									local18 += local78;
									if (local20 == 1) {
										local22++;
									}
								} else {
									if (local20 >= arg0.length || !method624(local30)) {
										break label58;
									}
									local18++;
								}
							}
						}
					}
					if (local20 >= arg0.length) {
						@Pc(109) boolean local109 = false;
						@Pc(115) int local115 = method610(arg3, arg2, local14);
						@Pc(123) int local123 = method611(local18 - 1, (byte) 6, arg2, arg1);
						if (local115 > 2 || local123 > 2) {
							local109 = true;
						}
						if (local109) {
							for (@Pc(135) int local135 = local14; local135 < local18; local135++) {
								arg2[local135] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("43368, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -854 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([C[CZI)I")
	private static int method610(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 == 0) {
				return 2;
			}
			for (@Pc(9) int local9 = arg2 - 1; local9 >= 0 && method624(arg1[local9]); local9--) {
				if (arg1[local9] == '@') {
					return 3;
				}
			}
			@Pc(29) int local29 = 0;
			for (@Pc(33) int local33 = arg2 - 1; local33 >= 0 && method624(arg0[local33]); local33--) {
				if (arg0[local33] == '*') {
					local29++;
				}
			}
			if (local29 >= 3) {
				return 4;
			} else if (method624(arg1[arg2 - 1])) {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("53991, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IB[C[C)I")
	private static int method611(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) char[] arg3) {
		try {
			if (arg0 + 1 == arg2.length) {
				return 2;
			}
			@Pc(13) int local13 = arg0 + 1;
			while (true) {
				if (local13 < arg2.length && method624(arg2[local13])) {
					if (arg2[local13] != '.' && arg2[local13] != ',') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(40) int local40 = 0;
				for (@Pc(44) int local44 = arg0 + 1; local44 < arg2.length && method624(arg3[local44]); local44++) {
					if (arg3[local44] == '*') {
						local40++;
					}
				}
				@Pc(69) boolean local69 = false;
				if (local40 >= 3) {
					return 4;
				}
				if (method624(arg2[arg0 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(96) RuntimeException local96) {
			signlink.reporterror("67518, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local96.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "([CI)V")
	private static void method612(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(18) char[] local18 = new char[] { 'd', 'o', 't' };
			method616(null, local3, local18);
			@Pc(31) char[] local31 = (char[]) arg0.clone();
			@Pc(54) char[] local54 = new char[] { 's', 'l', 'a', 's', 'h' };
			method616(null, local31, local54);
			for (@Pc(61) int local61 = 0; local61 < aCharArrayArray3.length; local61++) {
				method613(local3, anIntArray255[local61], aCharArrayArray3[local61], arg0, local31);
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("32350, " + arg0 + ", " + -8161 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[CI[C[C[C)V")
	private static void method613(@OriginalArg(1) char[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) char[] arg2, @OriginalArg(4) char[] arg3, @OriginalArg(5) char[] arg4) {
		try {
			if (arg2.length <= arg3.length) {
				@Pc(23) int local23;
				for (@Pc(15) int local15 = 0; local15 <= arg3.length - arg2.length; local15 += local23) {
					@Pc(19) int local19 = local15;
					@Pc(21) int local21 = 0;
					local23 = 1;
					label120: while (true) {
						while (true) {
							if (local19 >= arg3.length) {
								break label120;
							}
							@Pc(31) char local31 = arg3[local19];
							@Pc(33) char local33 = 0;
							if (local19 + 1 < arg3.length) {
								local33 = arg3[local19 + 1];
							}
							@Pc(58) int local58;
							if (local21 < arg2.length && (local58 = method618(arg2[local21], local31, local33)) > 0) {
								local19 += local58;
								local21++;
							} else {
								if (local21 == 0) {
									break label120;
								}
								@Pc(79) int local79;
								if ((local79 = method618(arg2[local21 - 1], local31, local33)) > 0) {
									local19 += local79;
									if (local21 == 1) {
										local23++;
									}
								} else {
									if (local21 >= arg2.length || !method624(local31)) {
										break label120;
									}
									local19++;
								}
							}
						}
					}
					if (local21 >= arg2.length) {
						@Pc(110) boolean local110 = false;
						@Pc(116) int local116 = method614(local15, arg0, arg3);
						@Pc(124) int local124 = method615(arg4, local19 - 1, arg3);
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
											if (arg0[local190] != '*') {
												break;
											}
											local174 = local190;
										} else if (arg0[local190] == '*') {
											local174 = local190;
											local186 = true;
										}
									}
								}
								local186 = false;
								for (local190 = local174 - 1; local190 >= 0; local190--) {
									if (local186) {
										if (method624(arg3[local190])) {
											break;
										}
										local174 = local190;
									} else if (!method624(arg3[local190])) {
										local186 = true;
										local174 = local190;
									}
								}
							}
							if (local124 > 2) {
								if (local124 == 4) {
									local186 = false;
									for (local190 = local178 + 1; local190 < arg3.length; local190++) {
										if (local186) {
											if (arg4[local190] != '*') {
												break;
											}
											local178 = local190;
										} else if (arg4[local190] == '*') {
											local178 = local190;
											local186 = true;
										}
									}
								}
								local186 = false;
								for (local190 = local178 + 1; local190 < arg3.length; local190++) {
									if (local186) {
										if (method624(arg3[local190])) {
											break;
										}
										local178 = local190;
									} else if (!method624(arg3[local190])) {
										local186 = true;
										local178 = local190;
									}
								}
							}
							for (@Pc(324) int local324 = local174; local324 <= local178; local324++) {
								arg3[local324] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(347) RuntimeException local347) {
			signlink.reporterror("46477, " + 132 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local347.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(II[C[C)I")
	private static int method614(@OriginalArg(1) int arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg0 == 0) {
				return 2;
			}
			@Pc(9) int local9 = arg0 - 1;
			while (true) {
				if (local9 >= 0 && method624(arg2[local9])) {
					if (arg2[local9] != ',' && arg2[local9] != '.') {
						local9--;
						continue;
					}
					return 3;
				}
				@Pc(34) int local34 = 0;
				for (@Pc(38) int local38 = arg0 - 1; local38 >= 0 && method624(arg1[local38]); local38--) {
					if (arg1[local38] == '*') {
						local34++;
					}
				}
				if (local34 >= 3) {
					return 4;
				}
				if (method624(arg2[arg0 - 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("63469, " + 38965 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CII[C)I")
	private static int method615(@OriginalArg(0) char[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg1 + 1 == arg2.length) {
				return 2;
			}
			@Pc(21) int local21 = arg1 + 1;
			while (true) {
				if (local21 < arg2.length && method624(arg2[local21])) {
					if (arg2[local21] != '\\' && arg2[local21] != '/') {
						local21++;
						continue;
					}
					return 3;
				}
				@Pc(48) int local48 = 0;
				for (@Pc(52) int local52 = arg1 + 1; local52 < arg2.length && method624(arg0[local52]); local52++) {
					if (arg0[local52] == '*') {
						local48++;
					}
				}
				if (local48 >= 5) {
					return 4;
				}
				if (method624(arg2[arg1 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("63399, " + arg0 + ", " + 2 + ", " + arg1 + ", " + arg2 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([[B[C[CI)V")
	private static void method616(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2) {
		try {
			if (arg2.length <= arg1.length) {
				@Pc(24) int local24;
				for (@Pc(14) int local14 = 0; local14 <= arg1.length - arg2.length; local14 += local24) {
					@Pc(18) int local18 = local14;
					@Pc(20) int local20 = 0;
					@Pc(22) int local22 = 0;
					local24 = 1;
					@Pc(26) boolean local26 = false;
					@Pc(28) boolean local28 = false;
					@Pc(30) boolean local30 = false;
					@Pc(38) char var12;
					@Pc(40) char var13;
					label164: while (true) {
						while (true) {
							if (local18 >= arg1.length || local28 && local30) {
								break label164;
							}
							var12 = arg1[local18];
							var13 = '\u0000';
							if (local18 + 1 < arg1.length) {
								var13 = arg1[local18 + 1];
							}
							@Pc(65) int local65;
							if (local20 < arg2.length && (local65 = method619(arg2[local20], var12, var13)) > 0) {
								if (local65 == 1 && method627(anInt949, var12)) {
									local28 = true;
								}
								if (local65 == 2 && (method627(anInt949, var12) || method627(anInt949, var13))) {
									local28 = true;
								}
								local18 += local65;
								local20++;
							} else {
								if (local20 == 0) {
									break label164;
								}
								@Pc(108) int local108;
								if ((local108 = method619(arg2[local20 - 1], var12, var13)) > 0) {
									local18 += local108;
									if (local20 == 1) {
										local24++;
									}
								} else {
									if (local20 >= arg2.length || !method625(var12)) {
										break label164;
									}
									if (method624(var12) && var12 != '\'') {
										local26 = true;
									}
									if (method627(anInt949, var12)) {
										local30 = true;
									}
									local18++;
									local22++;
									if (local22 * 100 / (local18 - local14) > 90) {
										break label164;
									}
								}
							}
						}
					}
					if (local20 >= arg2.length && (!local28 || !local30)) {
						@Pc(173) boolean local173 = true;
						@Pc(269) int local269;
						if (local26) {
							@Pc(219) boolean local219 = false;
							@Pc(221) boolean local221 = false;
							if (local14 - 1 < 0 || method624(arg1[local14 - 1]) && arg1[local14 - 1] != '\'') {
								local219 = true;
							}
							if (local18 >= arg1.length || method624(arg1[local18]) && arg1[local18] != '\'') {
								local221 = true;
							}
							if (!local219 || !local221) {
								@Pc(265) boolean local265 = false;
								local269 = local14 - 2;
								if (local219) {
									local269 = local14;
								}
								while (!local265 && local269 < local18) {
									if (local269 >= 0 && (!method624(arg1[local269]) || arg1[local269] == '\'')) {
										@Pc(291) char[] local291 = new char[3];
										@Pc(293) int local293;
										for (local293 = 0; local293 < 3 && local269 + local293 < arg1.length && (!method624(arg1[local269 + local293]) || arg1[local269 + local293] == '\''); local293++) {
											local291[local293] = arg1[local269 + local293];
										}
										@Pc(331) boolean local331 = true;
										if (local293 == 0) {
											local331 = false;
										}
										if (local293 < 3 && local269 - 1 >= 0 && (!method624(arg1[local269 - 1]) || arg1[local269 - 1] == '\'')) {
											local331 = false;
										}
										if (local331 && !method630(local291)) {
											local265 = true;
										}
									}
									local269++;
								}
								if (!local265) {
									local173 = false;
								}
							}
						} else {
							var12 = ' ';
							if (local14 - 1 >= 0) {
								var12 = arg1[local14 - 1];
							}
							var13 = ' ';
							if (local18 < arg1.length) {
								var13 = arg1[local18];
							}
							@Pc(201) byte local201 = method620(var12);
							@Pc(205) byte local205 = method620(var13);
							if (arg0 != null && method617(local201, arg0, local205)) {
								local173 = false;
							}
						}
						if (local173) {
							@Pc(381) int local381 = 0;
							@Pc(383) int local383 = 0;
							@Pc(385) int local385 = -1;
							for (local269 = local14; local269 < local18; local269++) {
								if (method627(anInt949, arg1[local269])) {
									local381++;
								} else if (method626(arg1[local269])) {
									local383++;
									local385 = local269;
								}
							}
							if (local385 > -1) {
								local381 -= local18 - local385 - 1;
							}
							if (local381 <= local383) {
								for (@Pc(427) int local427 = local14; local427 < local18; local427++) {
									arg1[local427] = '*';
								}
							} else {
								local24 = 1;
							}
						}
					}
				}
			}
		} catch (@Pc(454) RuntimeException local454) {
			signlink.reporterror("84125, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local454.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BI[[BB)Z")
	private static boolean method617(@OriginalArg(0) byte arg0, @OriginalArg(2) byte[][] arg1, @OriginalArg(3) byte arg2) {
		try {
			@Pc(1) int local1 = 0;
			if (arg1[0][0] == arg0 && arg1[0][1] == arg2) {
				return true;
			}
			@Pc(27) int local27 = arg1.length - 1;
			if (arg1[local27][0] == arg0 && arg1[local27][1] == arg2) {
				return true;
			}
			do {
				@Pc(49) int local49 = (local1 + local27) / 2;
				if (arg1[local49][0] == arg0 && arg1[local49][1] == arg2) {
					return true;
				}
				if (arg0 < arg1[local49][0] || arg0 == arg1[local49][0] && arg2 < arg1[local49][1]) {
					local27 = local49;
				} else {
					local1 = local49;
				}
			} while (local1 != local27 && local1 + 1 != local27);
			return false;
		} catch (@Pc(103) RuntimeException local103) {
			signlink.reporterror("35965, " + arg0 + ", " + 8 + ", " + arg1 + ", " + arg2 + ", " + local103.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZCCC)I")
	private static int method618(@OriginalArg(1) char arg0, @OriginalArg(2) char arg1, @OriginalArg(3) char arg2) {
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
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("19517, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ICCC)I")
	private static int method619(@OriginalArg(1) char arg0, @OriginalArg(2) char arg1, @OriginalArg(3) char arg2) {
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
		} catch (@Pc(513) RuntimeException local513) {
			signlink.reporterror("22572, " + 6 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local513.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(CI)B")
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
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("39904, " + arg0 + ", " + 3 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CZ)V")
	private static void method621(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(14) int local14 = 0;
			@Pc(16) int local16 = 0;
			@Pc(18) int local18 = 0;
			while (true) {
				do {
					@Pc(117) int local117;
					if ((local117 = method622(local14, arg0, 463)) == -1) {
						return;
					}
					@Pc(22) boolean local22 = false;
					for (@Pc(24) int local24 = local14; local24 >= 0 && local24 < local117 && !local22; local24++) {
						if (!method624(arg0[local24]) && !method625(arg0[local24])) {
							local22 = true;
						}
					}
					if (local22) {
						local16 = 0;
					}
					if (local16 == 0) {
						local18 = local117;
					}
					local14 = method623(arg0, local117);
					@Pc(63) int local63 = 0;
					for (@Pc(65) int local65 = local117; local65 < local14; local65++) {
						local63 = local63 * 10 + arg0[local65] - 48;
					}
					if (local63 <= 255 && local14 - local117 <= 8) {
						local16++;
					} else {
						local16 = 0;
					}
				} while (local16 != 4);
				for (@Pc(99) int local99 = local18; local99 < local14; local99++) {
					arg0[local99] = '*';
				}
				local16 = 0;
			}
		} catch (@Pc(121) RuntimeException local121) {
			signlink.reporterror("69420, " + arg0 + ", " + false + ", " + local121.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[CI)I")
	private static int method622(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(3) boolean local3 = false;
			for (@Pc(5) int local5 = arg0; local5 < arg1.length && local5 >= 0; local5++) {
				if (arg1[local5] >= '0' && arg1[local5] <= '9') {
					return local5;
				}
			}
			return -1;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("81357, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CIB)I")
	private static int method623(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1) {
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
			signlink.reporterror("54112, " + arg0 + ", " + arg1 + ", " + 8 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IC)Z")
	private static boolean method624(@OriginalArg(1) char arg0) {
		try {
			return !method626(arg0) && !method627(anInt949, arg0);
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("17199, " + -418 + ", " + arg0 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BC)Z")
	private static boolean method625(@OriginalArg(1) char arg0) {
		try {
			if (arg0 >= 'a' && arg0 <= 'z') {
				return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
			} else {
				return true;
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("74987, " + -32 + ", " + arg0 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(BC)Z")
	private static boolean method626(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("57440, " + 8 + ", " + arg0 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(IC)Z")
	private static boolean method627(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		try {
			if (arg0 != 8) {
				throw new NullPointerException();
			}
			return arg1 >= '0' && arg1 <= '9';
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("87120, " + arg0 + ", " + arg1 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(BC)Z")
	private static boolean method628(@OriginalArg(0) byte arg0, @OriginalArg(1) char arg1) {
		try {
			if (aByte57 == 7) {
				@Pc(6) boolean local6 = false;
			} else {
				for (@Pc(10) int local10 = 1; local10 > 0; local10++) {
				}
			}
			return arg1 >= 'a' && arg1 <= 'z';
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("30097, " + arg0 + ", " + arg1 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZC)Z")
	private static boolean method629(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("79579, " + true + ", " + arg0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(I[C)Z")
	private static boolean method630(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(7) boolean local7 = true;
			for (@Pc(9) int local9 = 0; local9 < arg0.length; local9++) {
				if (!method627(anInt949, arg0[local9]) && arg0[local9] != '\u0000') {
					local7 = false;
				}
			}
			if (local7) {
				return true;
			}
			@Pc(36) int local36 = method631(arg0);
			@Pc(38) int local38 = 0;
			@Pc(43) int local43 = anIntArray254.length - 1;
			if (local36 == anIntArray254[0] || local36 == anIntArray254[local43]) {
				return true;
			}
			do {
				@Pc(61) int local61 = (local38 + local43) / 2;
				if (local36 == anIntArray254[local61]) {
					return true;
				}
				if (local36 < anIntArray254[local61]) {
					local43 = local61;
				} else {
					local38 = local61;
				}
			} while (local38 != local43 && local38 + 1 != local43);
			return false;
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("96423, " + 65 + ", " + arg0 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "([CI)I")
	private static int method631(@OriginalArg(0) char[] arg0) {
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
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("2024, " + arg0 + ", " + 2 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}
}
