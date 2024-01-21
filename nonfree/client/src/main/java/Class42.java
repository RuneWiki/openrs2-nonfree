import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!sc")
public final class Class42 {

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
	private static int anInt923;

	@OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
	private static int anInt927;

	@OriginalMember(owner = "client!sc", name = "l", descriptor = "[I")
	private static int[] anIntArray254;

	@OriginalMember(owner = "client!sc", name = "m", descriptor = "[[C")
	private static char[][] aCharArrayArray1;

	@OriginalMember(owner = "client!sc", name = "n", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!sc", name = "o", descriptor = "[[C")
	private static char[][] aCharArrayArray2;

	@OriginalMember(owner = "client!sc", name = "p", descriptor = "[[C")
	private static char[][] aCharArrayArray3;

	@OriginalMember(owner = "client!sc", name = "q", descriptor = "[I")
	private static int[] anIntArray255;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
	private static int anInt922 = -517;

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "Z")
	private static boolean aBoolean223 = true;

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "Z")
	private static boolean aBoolean224 = true;

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "Z")
	private static boolean aBoolean225 = true;

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
	private static int anInt924 = 5;

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
	private static int anInt925 = -546;

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
	private static int anInt926 = -452;

	@OriginalMember(owner = "client!sc", name = "j", descriptor = "B")
	private static byte aByte35 = 8;

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
	private static int anInt928 = -341;

	@OriginalMember(owner = "client!sc", name = "r", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray13 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!xb;)V")
	public static void method594(@OriginalArg(0) Class47 arg0) {
		@Pc(10) Class1_Sub1_Sub3 local10 = new Class1_Sub1_Sub3(arg0.method666("fragmentsenc.txt", null), 58);
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(arg0.method666("badenc.txt", null), 58);
		@Pc(28) Class1_Sub1_Sub3 local28 = new Class1_Sub1_Sub3(arg0.method666("domainenc.txt", null), 58);
		@Pc(37) Class1_Sub1_Sub3 local37 = new Class1_Sub1_Sub3(arg0.method666("tldlist.txt", null), 58);
		method595(local10, local19, local28, local37);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!lb;Lclient!lb;Lclient!lb;Lclient!lb;)V")
	private static void method595(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) Class1_Sub1_Sub3 arg2, @OriginalArg(3) Class1_Sub1_Sub3 arg3) {
		method597(arg1);
		method598(anInt923, arg2);
		method599(arg0);
		method596(arg3);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!lb;I)V")
	private static void method596(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(4) int local4 = arg0.method485();
			aCharArrayArray3 = new char[local4][];
			anIntArray255 = new int[local4];
			for (@Pc(15) int local15 = 0; local15 < local4; local15++) {
				anIntArray255[local15] = arg0.method480();
				@Pc(26) char[] local26 = new char[arg0.method480()];
				for (@Pc(28) int local28 = 0; local28 < local26.length; local28++) {
					local26[local28] = (char) arg0.method480();
				}
				aCharArrayArray3[local15] = local26;
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("68354, " + arg0 + ", " + -502 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!lb;)V")
	private static void method597(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(5) int local5 = arg0.method485();
			aCharArrayArray1 = new char[local5][];
			aByteArrayArrayArray8 = new byte[local5][][];
			method600(aByteArrayArrayArray8, arg0, aCharArrayArray1);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("23054, " + 4 + ", " + arg0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(ILclient!lb;)V")
	private static void method598(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			@Pc(2) int local2 = arg1.method485();
			aCharArrayArray2 = new char[local2][];
			if (arg0 == 0) {
				method601(arg1, aCharArrayArray2);
			}
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("4005, " + arg0 + ", " + arg1 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(Lclient!lb;I)V")
	private static void method599(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			anIntArray254 = new int[arg0.method485()];
			for (@Pc(9) int local9 = 0; local9 < anIntArray254.length; local9++) {
				anIntArray254[local9] = arg0.method482();
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("89553, " + arg0 + ", " + -20750 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([[[BZLclient!lb;[[C)V")
	private static void method600(@OriginalArg(0) byte[][][] arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1, @OriginalArg(3) char[][] arg2) {
		try {
			for (@Pc(7) int local7 = 0; local7 < arg2.length; local7++) {
				@Pc(13) char[] local13 = new char[arg1.method480()];
				for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
					local13[local15] = (char) arg1.method480();
				}
				arg2[local7] = local13;
				@Pc(37) byte[][] local37 = new byte[arg1.method480()][2];
				for (@Pc(39) int local39 = 0; local39 < local37.length; local39++) {
					local37[local39][0] = (byte) arg1.method480();
					local37[local39][1] = (byte) arg1.method480();
				}
				if (local37.length > 0) {
					arg0[local7] = local37;
				}
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("77527, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!lb;[[CI)V")
	private static void method601(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) char[][] arg1) {
		try {
			for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
				@Pc(13) char[] local13 = new char[arg0.method480()];
				for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
					local13[local15] = (char) arg0.method480();
				}
				arg1[local7] = local13;
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("93716, " + arg0 + ", " + arg1 + ", " + 6 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CZ)V")
	private static void method602(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(12) int local12 = 0;
			for (@Pc(14) int local14 = 0; local14 < arg0.length; local14++) {
				if (method603((byte) 3, arg0[local14])) {
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
			signlink.reporterror("83040, " + arg0 + ", " + false + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BC)Z")
	private static boolean method603(@OriginalArg(0) byte arg0, @OriginalArg(1) char arg1) {
		try {
			@Pc(4) boolean local4 = false;
			return arg1 >= ' ' && arg1 <= '\u007f' || arg1 == ' ' || arg1 == '\n' || arg1 == '\t' || arg1 == '£' || arg1 == '€';
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("56845, " + arg0 + ", " + arg1 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method604(@OriginalArg(1) String arg0) {
		try {
			@Pc(3) long local3 = System.currentTimeMillis();
			@Pc(6) char[] local6 = arg0.toCharArray();
			method602(local6);
			@Pc(31) String local31 = (new String(local6)).trim();
			@Pc(35) char[] local35 = local31.toLowerCase().toCharArray();
			@Pc(38) String local38 = local31.toLowerCase();
			method612(local35);
			method607(anInt925, local35);
			method608(local35);
			method621(local35, (byte) 5);
			for (@Pc(52) int local52 = 0; local52 < aStringArray13.length; local52++) {
				@Pc(56) int local56 = -1;
				while ((local56 = local38.indexOf(aStringArray13[local52], local56 + 1)) != -1) {
					@Pc(63) char[] local63 = aStringArray13[local52].toCharArray();
					for (@Pc(65) int local65 = 0; local65 < local63.length; local65++) {
						local35[local65 + local56] = local63[local65];
					}
				}
			}
			method605(local35, local31.toCharArray(), aBoolean225);
			method606(local35);
			@Pc(107) long local107 = System.currentTimeMillis();
			return (new String(local35)).trim();
		} catch (@Pc(114) RuntimeException local114) {
			signlink.reporterror("50685, " + 59 + ", " + arg0 + ", " + local114.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([C[CZ)V")
	private static void method605(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) boolean arg2) {
		try {
			if (arg2) {
				for (@Pc(4) int local4 = 0; local4 < arg1.length; local4++) {
					if (arg0[local4] != '*' && method629(arg1[local4])) {
						arg0[local4] = arg1[local4];
					}
				}
			}
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("94225, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CI)V")
	private static void method606(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				@Pc(11) char local11 = arg0[local5];
				if (!method626(local11)) {
					local3 = true;
				} else if (local3) {
					if (method628(local11)) {
						local3 = false;
					}
				} else if (method629(local11)) {
					arg0[local5] = (char) (local11 + 'a' - 65);
				}
			}
			if (anInt924 > 5 || anInt924 < 5) {
				aBoolean225 = !aBoolean225;
			}
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("54186, " + arg0 + ", " + 5 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[C)V")
	private static void method607(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1) {
		try {
			@Pc(5) int local5;
			if (arg0 >= 0) {
				for (local5 = 1; local5 > 0; local5++) {
				}
			}
			for (local5 = 0; local5 < 2; local5++) {
				for (@Pc(19) int local19 = aCharArrayArray1.length - 1; local19 >= 0; local19--) {
					method616(arg1, aByteArrayArrayArray8[local19], aCharArrayArray1[local19]);
				}
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("50017, " + arg0 + ", " + arg1 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "([CZ)V")
	private static void method608(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(5) char[] local5 = (char[]) arg0.clone();
			@Pc(20) char[] local20 = new char[] { '(', 'a', ')' };
			method616(local5, null, local20);
			@Pc(29) char[] local29 = (char[]) arg0.clone();
			@Pc(44) char[] local44 = new char[] { 'd', 'o', 't' };
			method616(local29, null, local44);
			for (@Pc(63) int local63 = aCharArrayArray2.length - 1; local63 >= 0; local63--) {
				method609(arg0, aCharArrayArray2[local63], local29, local5);
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("4628, " + arg0 + ", " + false + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[C[C[C[C)V")
	private static void method609(@OriginalArg(1) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2, @OriginalArg(4) char[] arg3) {
		try {
			if (arg1.length <= arg0.length) {
				@Pc(22) int local22;
				for (@Pc(14) int local14 = 0; local14 <= arg0.length - arg1.length; local14 += local22) {
					@Pc(18) int local18 = local14;
					@Pc(20) int local20 = 0;
					local22 = 1;
					label58: while (true) {
						while (true) {
							if (local18 >= arg0.length) {
								break label58;
							}
							@Pc(30) char local30 = arg0[local18];
							@Pc(32) char local32 = 0;
							if (local18 + 1 < arg0.length) {
								local32 = arg0[local18 + 1];
							}
							@Pc(57) int local57;
							if (local20 < arg1.length && (local57 = method618(local30, anInt928, arg1[local20], local32)) > 0) {
								local18 += local57;
								local20++;
							} else {
								if (local20 == 0) {
									break label58;
								}
								@Pc(78) int local78;
								if ((local78 = method618(local30, anInt928, arg1[local20 - 1], local32)) > 0) {
									local18 += local78;
									if (local20 == 1) {
										local22++;
									}
								} else {
									if (local20 >= arg1.length || !method624(local30)) {
										break label58;
									}
									local18++;
								}
							}
						}
					}
					if (local20 >= arg1.length) {
						@Pc(109) boolean local109 = false;
						@Pc(115) int local115 = method610(local14, arg3, arg0);
						@Pc(123) int local123 = method611(arg0, arg2, local18 - 1, (byte) 5);
						if (local115 > 2 || local123 > 2) {
							local109 = true;
						}
						if (local109) {
							for (@Pc(135) int local135 = local14; local135 < local18; local135++) {
								arg0[local135] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("98270, " + -452 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[C[CB)I")
	private static int method610(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2) {
		try {
			if (arg0 == 0) {
				return 2;
			}
			for (@Pc(9) int local9 = arg0 - 1; local9 >= 0 && method624(arg2[local9]); local9--) {
				if (arg2[local9] == '@') {
					return 3;
				}
			}
			@Pc(29) int local29 = 0;
			for (@Pc(38) int local38 = arg0 - 1; local38 >= 0 && method624(arg1[local38]); local38--) {
				if (arg1[local38] == '*') {
					local29++;
				}
			}
			if (local29 >= 3) {
				return 4;
			} else if (method624(arg2[arg0 - 1])) {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("54596, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 20 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([C[CIB)I")
	private static int method611(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		try {
			if (arg2 + 1 == arg0.length) {
				return 2;
			}
			@Pc(13) int local13 = arg2 + 1;
			while (true) {
				if (local13 < arg0.length && method624(arg0[local13])) {
					if (arg0[local13] != '.' && arg0[local13] != ',') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(40) int local40 = 0;
				for (@Pc(44) int local44 = arg2 + 1; local44 < arg0.length && method624(arg1[local44]); local44++) {
					if (arg1[local44] == '*') {
						local40++;
					}
				}
				@Pc(69) boolean local69 = false;
				if (local40 >= 3) {
					return 4;
				}
				if (method624(arg0[arg2 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("151, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "([CI)V")
	private static void method612(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(14) char[] local14 = (char[]) arg0.clone();
			@Pc(29) char[] local29 = new char[] { 'd', 'o', 't' };
			method616(local14, null, local29);
			@Pc(38) char[] local38 = (char[]) arg0.clone();
			@Pc(61) char[] local61 = new char[] { 's', 'l', 'a', 's', 'h' };
			method616(local38, null, local61);
			for (@Pc(68) int local68 = 0; local68 < aCharArrayArray3.length; local68++) {
				method613(local14, arg0, local38, aCharArrayArray3[local68], anIntArray255[local68]);
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("80026, " + arg0 + ", " + 0 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(B[C[C[C[CI)V")
	private static void method613(@OriginalArg(1) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2, @OriginalArg(4) char[] arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg3.length <= arg1.length) {
				@Pc(23) int local23;
				for (@Pc(15) int local15 = 0; local15 <= arg1.length - arg3.length; local15 += local23) {
					@Pc(19) int local19 = local15;
					@Pc(21) int local21 = 0;
					local23 = 1;
					label120: while (true) {
						while (true) {
							if (local19 >= arg1.length) {
								break label120;
							}
							@Pc(31) char local31 = arg1[local19];
							@Pc(33) char local33 = 0;
							if (local19 + 1 < arg1.length) {
								local33 = arg1[local19 + 1];
							}
							@Pc(58) int local58;
							if (local21 < arg3.length && (local58 = method618(local31, anInt928, arg3[local21], local33)) > 0) {
								local19 += local58;
								local21++;
							} else {
								if (local21 == 0) {
									break label120;
								}
								@Pc(79) int local79;
								if ((local79 = method618(local31, anInt928, arg3[local21 - 1], local33)) > 0) {
									local19 += local79;
									if (local21 == 1) {
										local23++;
									}
								} else {
									if (local21 >= arg3.length || !method624(local31)) {
										break label120;
									}
									local19++;
								}
							}
						}
					}
					if (local21 >= arg3.length) {
						@Pc(110) boolean local110 = false;
						@Pc(116) int local116 = method614(arg0, arg1, local15);
						@Pc(124) int local124 = method615(arg2, arg1, local19 - 1);
						if (arg4 == 1 && local116 > 0 && local124 > 0) {
							local110 = true;
						}
						if (arg4 == 2 && (local116 > 2 && local124 > 0 || local116 > 0 && local124 > 2)) {
							local110 = true;
						}
						if (arg4 == 3 && local116 > 0 && local124 > 2) {
							local110 = true;
						}
						@Pc(167) boolean local167;
						if (arg4 == 3 && local116 > 2 && local124 > 0) {
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
										if (method624(arg1[local190])) {
											break;
										}
										local174 = local190;
									} else if (!method624(arg1[local190])) {
										local186 = true;
										local174 = local190;
									}
								}
							}
							if (local124 > 2) {
								if (local124 == 4) {
									local186 = false;
									for (local190 = local178 + 1; local190 < arg1.length; local190++) {
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
								for (local190 = local178 + 1; local190 < arg1.length; local190++) {
									if (local186) {
										if (method624(arg1[local190])) {
											break;
										}
										local178 = local190;
									} else if (!method624(arg1[local190])) {
										local186 = true;
										local178 = local190;
									}
								}
							}
							for (@Pc(324) int local324 = local174; local324 <= local178; local324++) {
								arg1[local324] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(347) RuntimeException local347) {
			signlink.reporterror("70874, " + 1 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local347.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CB[CI)I")
	private static int method614(@OriginalArg(0) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 == 0) {
				return 2;
			}
			@Pc(9) int local9 = arg2 - 1;
			while (true) {
				if (local9 >= 0 && method624(arg1[local9])) {
					if (arg1[local9] != ',' && arg1[local9] != '.') {
						local9--;
						continue;
					}
					return 3;
				}
				@Pc(44) int local44 = 0;
				for (@Pc(48) int local48 = arg2 - 1; local48 >= 0 && method624(arg0[local48]); local48--) {
					if (arg0[local48] == '*') {
						local44++;
					}
				}
				if (local44 >= 3) {
					return 4;
				}
				if (method624(arg1[arg2 - 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("8054, " + arg0 + ", " + 61 + ", " + arg1 + ", " + arg2 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CI[CI)I")
	private static int method615(@OriginalArg(0) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 + 1 == arg1.length) {
				return 2;
			}
			@Pc(22) int local22 = arg2 + 1;
			while (true) {
				if (local22 < arg1.length && method624(arg1[local22])) {
					if (arg1[local22] != '\\' && arg1[local22] != '/') {
						local22++;
						continue;
					}
					return 3;
				}
				@Pc(49) int local49 = 0;
				for (@Pc(53) int local53 = arg2 + 1; local53 < arg1.length && method624(arg0[local53]); local53++) {
					if (arg0[local53] == '*') {
						local49++;
					}
				}
				if (local49 >= 5) {
					return 4;
				}
				if (method624(arg1[arg2 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("83318, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([C[[B[CB)V")
	private static void method616(@OriginalArg(0) char[] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) char[] arg2) {
		try {
			if (aByte35 != 8) {
				aBoolean225 = !aBoolean225;
			}
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
					label173: while (true) {
						while (true) {
							if (local24 >= arg0.length || local34 && local36) {
								break label173;
							}
							var12 = arg0[local24];
							var13 = '\u0000';
							if (local24 + 1 < arg0.length) {
								var13 = arg0[local24 + 1];
							}
							@Pc(71) int local71;
							if (local26 < arg2.length && (local71 = method619(var12, var13, arg2[local26])) > 0) {
								if (local71 == 1 && method627(var12)) {
									local34 = true;
								}
								if (local71 == 2 && (method627(var12) || method627(var13))) {
									local34 = true;
								}
								local24 += local71;
								local26++;
							} else {
								if (local26 == 0) {
									break label173;
								}
								@Pc(114) int local114;
								if ((local114 = method619(var12, var13, arg2[local26 - 1])) > 0) {
									local24 += local114;
									if (local26 == 1) {
										local30++;
									}
								} else {
									if (local26 >= arg2.length || !method625(var12)) {
										break label173;
									}
									if (method624(var12) && var12 != '\'') {
										local32 = true;
									}
									if (method627(var12)) {
										local36 = true;
									}
									local24++;
									local28++;
									if (local28 * 100 / (local24 - local20) > 90) {
										break label173;
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
							if (local20 - 1 < 0 || method624(arg0[local20 - 1]) && arg0[local20 - 1] != '\'') {
								local225 = true;
							}
							if (local24 >= arg0.length || method624(arg0[local24]) && arg0[local24] != '\'') {
								local227 = true;
							}
							if (!local225 || !local227) {
								@Pc(271) boolean local271 = false;
								local275 = local20 - 2;
								if (local225) {
									local275 = local20;
								}
								while (!local271 && local275 < local24) {
									if (local275 >= 0 && (!method624(arg0[local275]) || arg0[local275] == '\'')) {
										@Pc(297) char[] local297 = new char[3];
										@Pc(299) int local299;
										for (local299 = 0; local299 < 3 && local275 + local299 < arg0.length && (!method624(arg0[local275 + local299]) || arg0[local275 + local299] == '\''); local299++) {
											local297[local299] = arg0[local275 + local299];
										}
										@Pc(337) boolean local337 = true;
										if (local299 == 0) {
											local337 = false;
										}
										if (local299 < 3 && local275 - 1 >= 0 && (!method624(arg0[local275 - 1]) || arg0[local275 - 1] == '\'')) {
											local337 = false;
										}
										if (local337 && !method630((byte) 9, local297)) {
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
							@Pc(207) byte local207 = method620(var12);
							@Pc(211) byte local211 = method620(var13);
							if (arg1 != null && method617(arg1, local207, local211)) {
								local179 = false;
							}
						}
						if (local179) {
							@Pc(387) int local387 = 0;
							@Pc(389) int local389 = 0;
							@Pc(391) int local391 = -1;
							for (local275 = local20; local275 < local24; local275++) {
								if (method627(arg0[local275])) {
									local387++;
								} else if (method626(arg0[local275])) {
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
			signlink.reporterror("51095, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 8 + ", " + local460.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([[BBBI)Z")
	private static boolean method617(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2) {
		try {
			@Pc(1) int local1 = 0;
			if (arg0[0][0] == arg1 && arg0[0][1] == arg2) {
				return true;
			}
			@Pc(32) int local32 = arg0.length - 1;
			if (arg0[local32][0] == arg1 && arg0[local32][1] == arg2) {
				return true;
			}
			do {
				@Pc(54) int local54 = (local1 + local32) / 2;
				if (arg0[local54][0] == arg1 && arg0[local54][1] == arg2) {
					return true;
				}
				if (arg1 < arg0[local54][0] || arg1 == arg0[local54][0] && arg2 < arg0[local54][1]) {
					local32 = local54;
				} else {
					local1 = local54;
				}
			} while (local1 != local32 && local1 + 1 != local32);
			return false;
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("72569, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(CICC)I")
	private static int method618(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) char arg2, @OriginalArg(3) char arg3) {
		try {
			if (arg1 >= 0) {
				return 0;
			} else if (arg2 == arg0) {
				return 1;
			} else if (arg2 == 'o' && arg0 == '0') {
				return 1;
			} else if (arg2 == 'o' && arg0 == '(' && arg3 == ')') {
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
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("19872, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(CCCZ)I")
	private static int method619(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(2) char arg2) {
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
					if (arg0 != '6' && arg0 != '8') {
						if ((arg0 != '1' || arg1 != '3') && (arg0 != 'i' || arg1 != '3')) {
							return 0;
						}
						return 2;
					}
					return 1;
				}
				if (arg2 == 'c') {
					if (arg0 != '(' && arg0 != '<' && arg0 != '{' && arg0 != '[') {
						return 0;
					}
					return 1;
				}
				if (arg2 == 'd') {
					if ((arg0 != '[' || arg1 != ')') && (arg0 != 'i' || arg1 != ')')) {
						return 0;
					}
					return 2;
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
					if (arg0 != '9' && arg0 != '6' && arg0 != 'q') {
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
					if (arg0 != '7' && arg0 != '+') {
						return 0;
					}
					return 1;
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
					} else if ((arg0 != '(' || arg1 != ')') && (arg0 != '{' || arg1 != '}') && (arg0 != '[' || arg1 != ']')) {
						return 0;
					} else {
						return 2;
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
		} catch (@Pc(512) RuntimeException local512) {
			signlink.reporterror("19485, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + local512.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(CZ)B")
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
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("18762, " + arg0 + ", " + true + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CB)V")
	private static void method621(@OriginalArg(0) char[] arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(8) boolean local8 = false;
			@Pc(14) int local14 = 0;
			@Pc(16) int local16 = 0;
			@Pc(18) int local18 = 0;
			while (true) {
				do {
					@Pc(117) int local117;
					if ((local117 = method622(local14, arg0)) == -1) {
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
			signlink.reporterror("37328, " + arg0 + ", " + arg1 + ", " + local121.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[CI)I")
	private static int method622(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1) {
		try {
			for (@Pc(7) int local7 = arg0; local7 < arg1.length && local7 >= 0; local7++) {
				if (arg1[local7] >= '0' && arg1[local7] <= '9') {
					return local7;
				}
			}
			return -1;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("17685, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z[CI)I")
	private static int method623(@OriginalArg(1) char[] arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(1) int local1 = arg1;
			while (true) {
				if (local1 < arg0.length && local1 >= 0) {
					if (arg0[local1] >= '0' && arg0[local1] <= '9') {
						local1++;
						continue;
					}
					return local1;
				}
				return arg0.length;
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("49189, " + true + ", " + arg0 + ", " + arg1 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(CB)Z")
	private static boolean method624(@OriginalArg(0) char arg0) {
		try {
			return !method626(arg0) && !method627(arg0);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("64734, " + arg0 + ", " + 111 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(CI)Z")
	private static boolean method625(@OriginalArg(0) char arg0) {
		try {
			if (arg0 >= 'a' && arg0 <= 'z') {
				return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
			} else {
				return true;
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("3212, " + arg0 + ", " + 33824 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IC)Z")
	private static boolean method626(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("78771, " + 956 + ", " + arg0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(CB)Z")
	private static boolean method627(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= '0' && arg0 <= '9';
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("95237, " + arg0 + ", " + -96 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(CZ)Z")
	private static boolean method628(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z';
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("6816, " + arg0 + ", " + true + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(CI)Z")
	private static boolean method629(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("32535, " + arg0 + ", " + 0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(B[C)Z")
	private static boolean method630(@OriginalArg(0) byte arg0, @OriginalArg(1) char[] arg1) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < arg1.length; local5++) {
				if (!method627(arg1[local5]) && arg1[local5] != '\u0000') {
					local3 = false;
				}
			}
			if (local3) {
				return true;
			}
			@Pc(32) int local32 = method631(arg1);
			@Pc(34) int local34 = 0;
			@Pc(39) boolean local39 = false;
			@Pc(48) int local48 = anIntArray254.length - 1;
			if (local32 == anIntArray254[0] || local32 == anIntArray254[local48]) {
				return true;
			}
			do {
				@Pc(66) int local66 = (local34 + local48) / 2;
				if (local32 == anIntArray254[local66]) {
					return true;
				}
				if (local32 < anIntArray254[local66]) {
					local48 = local66;
				} else {
					local34 = local66;
				}
			} while (local34 != local48 && local34 + 1 != local48);
			return false;
		} catch (@Pc(95) RuntimeException local95) {
			signlink.reporterror("64745, " + arg0 + ", " + arg1 + ", " + local95.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "([CB)I")
	private static int method631(@OriginalArg(0) char[] arg0) {
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
			signlink.reporterror("96881, " + arg0 + ", " + -34 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}
}
