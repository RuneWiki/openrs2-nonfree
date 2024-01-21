import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!sc")
public final class Class42 {

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
	private static int anInt949;

	@OriginalMember(owner = "client!sc", name = "j", descriptor = "[I")
	private static int[] anIntArray254;

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "[[C")
	private static char[][] aCharArrayArray1;

	@OriginalMember(owner = "client!sc", name = "l", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!sc", name = "m", descriptor = "[[C")
	private static char[][] aCharArrayArray2;

	@OriginalMember(owner = "client!sc", name = "n", descriptor = "[[C")
	private static char[][] aCharArrayArray3;

	@OriginalMember(owner = "client!sc", name = "o", descriptor = "[I")
	private static int[] anIntArray255;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
	private static int anInt947 = -867;

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "Z")
	private static boolean aBoolean231 = true;

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
	private static int anInt948 = 26254;

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "B")
	private static byte aByte38 = 5;

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "B")
	private static byte aByte39 = 3;

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
	private static int anInt950 = 533;

	@OriginalMember(owner = "client!sc", name = "p", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray13 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!xb;)V")
	public static void method594(@OriginalArg(0) Class47 arg0) {
		@Pc(10) Class1_Sub1_Sub3 local10 = new Class1_Sub1_Sub3(-49365, arg0.method666("fragmentsenc.txt", null));
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(-49365, arg0.method666("badenc.txt", null));
		@Pc(28) Class1_Sub1_Sub3 local28 = new Class1_Sub1_Sub3(-49365, arg0.method666("domainenc.txt", null));
		@Pc(37) Class1_Sub1_Sub3 local37 = new Class1_Sub1_Sub3(-49365, arg0.method666("tldlist.txt", null));
		method595(local10, local19, local28, local37);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!lb;Lclient!lb;Lclient!lb;Lclient!lb;)V")
	private static void method595(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) Class1_Sub1_Sub3 arg2, @OriginalArg(3) Class1_Sub1_Sub3 arg3) {
		method597(arg1);
		method598(arg2);
		method599(arg0);
		method596(arg3);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!lb;I)V")
	private static void method596(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(4) int local4 = arg0.method485();
			aCharArrayArray3 = new char[local4][];
			anIntArray255 = new int[local4];
			for (@Pc(18) int local18 = 0; local18 < local4; local18++) {
				anIntArray255[local18] = arg0.method480();
				@Pc(29) char[] local29 = new char[arg0.method480()];
				for (@Pc(31) int local31 = 0; local31 < local29.length; local31++) {
					local29[local31] = (char) arg0.method480();
				}
				aCharArrayArray3[local18] = local29;
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("88204, " + arg0 + ", " + -370 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!lb;)V")
	private static void method597(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(2) int local2 = arg0.method485();
			aCharArrayArray1 = new char[local2][];
			aByteArrayArrayArray8 = new byte[local2][][];
			method600(aByteArrayArrayArray8, aCharArrayArray1, (byte) 5, arg0);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("92025, " + -751 + ", " + arg0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(ILclient!lb;)V")
	private static void method598(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(2) int local2 = arg0.method485();
			aCharArrayArray2 = new char[local2][];
			method601(arg0, aCharArrayArray2);
			if (anInt948 == 26254) {
				;
			}
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("56329, " + 26254 + ", " + arg0 + ", " + local14.toString());
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
			signlink.reporterror("19579, " + arg0 + ", " + 7 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([[[B[[CBLclient!lb;)V")
	private static void method600(@OriginalArg(0) byte[][][] arg0, @OriginalArg(1) char[][] arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) Class1_Sub1_Sub3 arg3) {
		try {
			@Pc(10) int local10;
			if (aByte38 == 5) {
				@Pc(6) boolean local6 = false;
			} else {
				for (local10 = 1; local10 > 0; local10++) {
				}
			}
			for (local10 = 0; local10 < arg1.length; local10++) {
				@Pc(23) char[] local23 = new char[arg3.method480()];
				for (@Pc(25) int local25 = 0; local25 < local23.length; local25++) {
					local23[local25] = (char) arg3.method480();
				}
				arg1[local10] = local23;
				@Pc(47) byte[][] local47 = new byte[arg3.method480()][2];
				for (@Pc(49) int local49 = 0; local49 < local47.length; local49++) {
					local47[local49][0] = (byte) arg3.method480();
					local47[local49][1] = (byte) arg3.method480();
				}
				if (local47.length > 0) {
					arg0[local10] = local47;
				}
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("85736, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!lb;I[[C)V")
	private static void method601(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(2) char[][] arg1) {
		try {
			for (@Pc(16) int local16 = 0; local16 < arg1.length; local16++) {
				@Pc(22) char[] local22 = new char[arg0.method480()];
				for (@Pc(24) int local24 = 0; local24 < local22.length; local24++) {
					local22[local24] = (char) arg0.method480();
				}
				arg1[local16] = local22;
			}
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("95653, " + arg0 + ", " + 3 + ", " + arg1 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[C)V")
	private static void method602(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) int local3 = 0;
			for (@Pc(8) int local8 = 0; local8 < arg0.length; local8++) {
				if (method603(arg0[local8])) {
					arg0[local3] = arg0[local8];
				} else {
					arg0[local3] = ' ';
				}
				if (local3 == 0 || arg0[local3] != ' ' || arg0[local3 - 1] != ' ') {
					local3++;
				}
			}
			for (@Pc(50) int local50 = local3; local50 < arg0.length; local50++) {
				arg0[local50] = ' ';
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("93612, " + -176 + ", " + arg0 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(CI)Z")
	private static boolean method603(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= ' ' && arg0 <= '\u007f' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("72570, " + arg0 + ", " + -391 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method604(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(3) long local3 = System.currentTimeMillis();
			@Pc(6) char[] local6 = arg1.toCharArray();
			method602(local6);
			if (arg0 >= 0) {
				throw new NullPointerException();
			}
			@Pc(21) String local21 = (new String(local6)).trim();
			local6 = local21.toLowerCase().toCharArray();
			@Pc(28) String local28 = local21.toLowerCase();
			method612(local6);
			method607(local6);
			method608(local6);
			method621(192, local6);
			for (@Pc(42) int local42 = 0; local42 < aStringArray13.length; local42++) {
				@Pc(52) int local52 = -1;
				while ((local52 = local28.indexOf(aStringArray13[local42], local52 + 1)) != -1) {
					@Pc(59) char[] local59 = aStringArray13[local42].toCharArray();
					for (@Pc(61) int local61 = 0; local61 < local59.length; local61++) {
						local6[local61 + local52] = local59[local61];
					}
				}
			}
			method605(local21.toCharArray(), local6);
			method606(local6);
			@Pc(103) long local103 = System.currentTimeMillis();
			return (new String(local6)).trim();
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("26572, " + arg0 + ", " + arg1 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(B[C[C)V")
	private static void method605(@OriginalArg(1) char[] arg0, @OriginalArg(2) char[] arg1) {
		try {
			for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
				if (arg1[local1] != '*' && method629(arg0[local1])) {
					arg1[local1] = arg0[local1];
				}
			}
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("49216, " + 111 + ", " + arg0 + ", " + arg1 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(B[C)V")
	private static void method606(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(14) int local14 = 0; local14 < arg0.length; local14++) {
				@Pc(20) char local20 = arg0[local14];
				if (!method626(anInt950, local20)) {
					local3 = true;
				} else if (local3) {
					if (method628((byte) 3, local20)) {
						local3 = false;
					}
				} else if (method629(local20)) {
					arg0[local14] = (char) (local20 + 'a' - 65);
				}
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("21016, " + 110 + ", " + arg0 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z[C)V")
	private static void method607(@OriginalArg(1) char[] arg0) {
		try {
			for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
				for (@Pc(14) int local14 = aCharArrayArray1.length - 1; local14 >= 0; local14--) {
					method616(arg0, aCharArrayArray1[local14], aByteArrayArrayArray8[local14]);
				}
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("47252, " + true + ", " + arg0 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CZ)V")
	private static void method608(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(18) char[] local18 = new char[] { '(', 'a', ')' };
			method616(local3, local18, null);
			@Pc(27) char[] local27 = (char[]) arg0.clone();
			@Pc(42) char[] local42 = new char[] { 'd', 'o', 't' };
			method616(local27, local42, null);
			for (@Pc(56) int local56 = aCharArrayArray2.length - 1; local56 >= 0; local56--) {
				method609(aCharArrayArray2[local56], arg0, local27, local3);
			}
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("93436, " + arg0 + ", " + true + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([C[C[C[CI)V")
	private static void method609(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) char[] arg3) {
		try {
			if (arg0.length <= arg1.length) {
				@Pc(30) int local30;
				for (@Pc(22) int local22 = 0; local22 <= arg1.length - arg0.length; local22 += local30) {
					@Pc(26) int local26 = local22;
					@Pc(28) int local28 = 0;
					local30 = 1;
					label58: while (true) {
						while (true) {
							if (local26 >= arg1.length) {
								break label58;
							}
							@Pc(38) char local38 = arg1[local26];
							@Pc(40) char local40 = 0;
							if (local26 + 1 < arg1.length) {
								local40 = arg1[local26 + 1];
							}
							@Pc(65) int local65;
							if (local28 < arg0.length && (local65 = method618(local38, local40, arg0[local28])) > 0) {
								local26 += local65;
								local28++;
							} else {
								if (local28 == 0) {
									break label58;
								}
								@Pc(86) int local86;
								if ((local86 = method618(local38, local40, arg0[local28 - 1])) > 0) {
									local26 += local86;
									if (local28 == 1) {
										local30++;
									}
								} else {
									if (local28 >= arg0.length || !method624(local38, anInt949)) {
										break label58;
									}
									local26++;
								}
							}
						}
					}
					if (local28 >= arg0.length) {
						@Pc(117) boolean local117 = false;
						@Pc(123) int local123 = method610(arg3, local22, arg1);
						@Pc(131) int local131 = method611(local26 - 1, arg2, arg1);
						if (local123 > 2 || local131 > 2) {
							local117 = true;
						}
						if (local117) {
							for (@Pc(143) int local143 = local22; local143 < local26; local143++) {
								arg1[local143] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(166) RuntimeException local166) {
			signlink.reporterror("70569, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -820 + ", " + local166.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CIZ[C)I")
	private static int method610(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg1 == 0) {
				return 2;
			}
			for (@Pc(9) int local9 = arg1 - 1; local9 >= 0 && method624(arg2[local9], anInt949); local9--) {
				if (arg2[local9] == '@') {
					return 3;
				}
			}
			@Pc(38) int local38 = 0;
			for (@Pc(42) int local42 = arg1 - 1; local42 >= 0 && method624(arg0[local42], anInt949); local42--) {
				if (arg0[local42] == '*') {
					local38++;
				}
			}
			if (local38 >= 3) {
				return 4;
			} else if (method624(arg2[arg1 - 1], anInt949)) {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("59079, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IB[C[C)I")
	private static int method611(@OriginalArg(0) int arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg0 + 1 == arg2.length) {
				return 2;
			}
			@Pc(13) int local13 = arg0 + 1;
			while (true) {
				if (local13 < arg2.length && method624(arg2[local13], anInt949)) {
					if (arg2[local13] != '.' && arg2[local13] != ',') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(50) int local50 = 0;
				for (@Pc(54) int local54 = arg0 + 1; local54 < arg2.length && method624(arg1[local54], anInt949); local54++) {
					if (arg1[local54] == '*') {
						local50++;
					}
				}
				if (local50 >= 3) {
					return 4;
				}
				if (method624(arg2[arg0 + 1], anInt949)) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("42048, " + arg0 + ", " + -37 + ", " + arg1 + ", " + arg2 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CI)V")
	private static void method612(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(5) char[] local5 = (char[]) arg0.clone();
			@Pc(31) char[] local31 = new char[] { 'd', 'o', 't' };
			method616(local5, local31, null);
			@Pc(40) char[] local40 = (char[]) arg0.clone();
			@Pc(63) char[] local63 = new char[] { 's', 'l', 'a', 's', 'h' };
			method616(local40, local63, null);
			for (@Pc(70) int local70 = 0; local70 < aCharArrayArray3.length; local70++) {
				method613(local5, local40, aCharArrayArray3[local70], anIntArray255[local70], arg0);
			}
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("20891, " + arg0 + ", " + -824 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([C[C[CII[C)V")
	private static void method613(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) char[] arg4) {
		try {
			if (arg2.length <= arg4.length) {
				@Pc(26) int local26;
				for (@Pc(18) int local18 = 0; local18 <= arg4.length - arg2.length; local18 += local26) {
					@Pc(22) int local22 = local18;
					@Pc(24) int local24 = 0;
					local26 = 1;
					label120: while (true) {
						while (true) {
							if (local22 >= arg4.length) {
								break label120;
							}
							@Pc(34) char local34 = arg4[local22];
							@Pc(36) char local36 = 0;
							if (local22 + 1 < arg4.length) {
								local36 = arg4[local22 + 1];
							}
							@Pc(61) int local61;
							if (local24 < arg2.length && (local61 = method618(local34, local36, arg2[local24])) > 0) {
								local22 += local61;
								local24++;
							} else {
								if (local24 == 0) {
									break label120;
								}
								@Pc(82) int local82;
								if ((local82 = method618(local34, local36, arg2[local24 - 1])) > 0) {
									local22 += local82;
									if (local24 == 1) {
										local26++;
									}
								} else {
									if (local24 >= arg2.length || !method624(local34, anInt949)) {
										break label120;
									}
									local22++;
								}
							}
						}
					}
					if (local24 >= arg2.length) {
						@Pc(113) boolean local113 = false;
						@Pc(119) int local119 = method614(arg4, 143, arg0, local18);
						@Pc(127) int local127 = method615(arg1, arg4, local22 - 1, (byte) 2);
						if (arg3 == 1 && local119 > 0 && local127 > 0) {
							local113 = true;
						}
						if (arg3 == 2 && (local119 > 2 && local127 > 0 || local119 > 0 && local127 > 2)) {
							local113 = true;
						}
						if (arg3 == 3 && local119 > 0 && local127 > 2) {
							local113 = true;
						}
						@Pc(170) boolean local170;
						if (arg3 == 3 && local119 > 2 && local127 > 0) {
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
										if (method624(arg4[local193], anInt949)) {
											break;
										}
										local177 = local193;
									} else if (!method624(arg4[local193], anInt949)) {
										local189 = true;
										local177 = local193;
									}
								}
							}
							if (local127 > 2) {
								if (local127 == 4) {
									local189 = false;
									for (local193 = local181 + 1; local193 < arg4.length; local193++) {
										if (local189) {
											if (arg1[local193] != '*') {
												break;
											}
											local181 = local193;
										} else if (arg1[local193] == '*') {
											local181 = local193;
											local189 = true;
										}
									}
								}
								local189 = false;
								for (local193 = local181 + 1; local193 < arg4.length; local193++) {
									if (local189) {
										if (method624(arg4[local193], anInt949)) {
											break;
										}
										local181 = local193;
									} else if (!method624(arg4[local193], anInt949)) {
										local189 = true;
										local181 = local193;
									}
								}
							}
							for (@Pc(327) int local327 = local177; local327 <= local181; local327++) {
								arg4[local327] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(350) RuntimeException local350) {
			signlink.reporterror("90143, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 9 + ", " + arg4 + ", " + local350.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CI[CI)I")
	private static int method614(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg3 == 0) {
				return 2;
			}
			@Pc(9) int local9 = arg3 - 1;
			while (true) {
				if (local9 >= 0 && method624(arg0[local9], anInt949)) {
					if (arg0[local9] != ',' && arg0[local9] != '.') {
						local9--;
						continue;
					}
					return 3;
				}
				@Pc(34) int local34 = 0;
				@Pc(38) boolean local38 = false;
				for (@Pc(42) int local42 = arg3 - 1; local42 >= 0 && method624(arg2[local42], anInt949); local42--) {
					if (arg2[local42] == '*') {
						local34++;
					}
				}
				if (local34 >= 3) {
					return 4;
				}
				if (method624(arg0[arg3 - 1], anInt949)) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("33297, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([C[CIB)I")
	private static int method615(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		try {
			if (arg2 + 1 == arg1.length) {
				return 2;
			}
			@Pc(13) int local13 = arg2 + 1;
			while (true) {
				if (local13 < arg1.length && method624(arg1[local13], anInt949)) {
					if (arg1[local13] != '\\' && arg1[local13] != '/') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(40) int local40 = 0;
				@Pc(45) boolean local45 = false;
				for (@Pc(57) int local57 = arg2 + 1; local57 < arg1.length && method624(arg0[local57], anInt949); local57++) {
					if (arg0[local57] == '*') {
						local40++;
					}
				}
				if (local40 >= 5) {
					return 4;
				}
				if (method624(arg1[arg2 + 1], anInt949)) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(95) RuntimeException local95) {
			signlink.reporterror("80641, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local95.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([CI[C[[B)V")
	private static void method616(@OriginalArg(0) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) byte[][] arg2) {
		try {
			if (arg1.length <= arg0.length) {
				@Pc(21) int local21;
				for (@Pc(11) int local11 = 0; local11 <= arg0.length - arg1.length; local11 += local21) {
					@Pc(15) int local15 = local11;
					@Pc(17) int local17 = 0;
					@Pc(19) int local19 = 0;
					local21 = 1;
					@Pc(23) boolean local23 = false;
					@Pc(25) boolean local25 = false;
					@Pc(27) boolean local27 = false;
					@Pc(35) char var12;
					@Pc(37) char var13;
					label164: while (true) {
						while (true) {
							if (local15 >= arg0.length || local25 && local27) {
								break label164;
							}
							var12 = arg0[local15];
							var13 = '\u0000';
							if (local15 + 1 < arg0.length) {
								var13 = arg0[local15 + 1];
							}
							@Pc(62) int local62;
							if (local17 < arg1.length && (local62 = method619(var13, arg1[local17], var12)) > 0) {
								if (local62 == 1 && method627(var12)) {
									local25 = true;
								}
								if (local62 == 2 && (method627(var12) || method627(var13))) {
									local25 = true;
								}
								local15 += local62;
								local17++;
							} else {
								if (local17 == 0) {
									break label164;
								}
								@Pc(105) int local105;
								if ((local105 = method619(var13, arg1[local17 - 1], var12)) > 0) {
									local15 += local105;
									if (local17 == 1) {
										local21++;
									}
								} else {
									if (local17 >= arg1.length || !method625(var12)) {
										break label164;
									}
									if (method624(var12, anInt949) && var12 != '\'') {
										local23 = true;
									}
									if (method627(var12)) {
										local27 = true;
									}
									local15++;
									local19++;
									if (local19 * 100 / (local15 - local11) > 90) {
										break label164;
									}
								}
							}
						}
					}
					if (local17 >= arg1.length && (!local25 || !local27)) {
						@Pc(170) boolean local170 = true;
						@Pc(266) int local266;
						if (local23) {
							@Pc(216) boolean local216 = false;
							@Pc(218) boolean local218 = false;
							if (local11 - 1 < 0 || method624(arg0[local11 - 1], anInt949) && arg0[local11 - 1] != '\'') {
								local216 = true;
							}
							if (local15 >= arg0.length || method624(arg0[local15], anInt949) && arg0[local15] != '\'') {
								local218 = true;
							}
							if (!local216 || !local218) {
								@Pc(262) boolean local262 = false;
								local266 = local11 - 2;
								if (local216) {
									local266 = local11;
								}
								while (!local262 && local266 < local15) {
									if (local266 >= 0 && (!method624(arg0[local266], anInt949) || arg0[local266] == '\'')) {
										@Pc(288) char[] local288 = new char[3];
										@Pc(290) int local290;
										for (local290 = 0; local290 < 3 && local266 + local290 < arg0.length && (!method624(arg0[local266 + local290], anInt949) || arg0[local266 + local290] == '\''); local290++) {
											local288[local290] = arg0[local266 + local290];
										}
										@Pc(328) boolean local328 = true;
										if (local290 == 0) {
											local328 = false;
										}
										if (local290 < 3 && local266 - 1 >= 0 && (!method624(arg0[local266 - 1], anInt949) || arg0[local266 - 1] == '\'')) {
											local328 = false;
										}
										if (local328 && !method630(local288)) {
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
							@Pc(198) byte local198 = method620(var12);
							@Pc(202) byte local202 = method620(var13);
							if (arg2 != null && method617(local198, arg2, local202)) {
								local170 = false;
							}
						}
						if (local170) {
							@Pc(378) int local378 = 0;
							@Pc(380) int local380 = 0;
							@Pc(382) int local382 = -1;
							for (local266 = local11; local266 < local15; local266++) {
								if (method627(arg0[local266])) {
									local378++;
								} else if (method626(anInt950, arg0[local266])) {
									local380++;
									local382 = local266;
								}
							}
							if (local382 > -1) {
								local378 -= local15 - local382 - 1;
							}
							if (local378 <= local380) {
								for (@Pc(424) int local424 = local11; local424 < local15; local424++) {
									arg0[local424] = '*';
								}
							} else {
								local21 = 1;
							}
						}
					}
				}
			}
		} catch (@Pc(461) RuntimeException local461) {
			signlink.reporterror("31073, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + local461.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BZ[[BB)Z")
	private static boolean method617(@OriginalArg(0) byte arg0, @OriginalArg(2) byte[][] arg1, @OriginalArg(3) byte arg2) {
		try {
			@Pc(3) int local3 = 0;
			if (arg1[0][0] == arg0 && arg1[0][1] == arg2) {
				return true;
			}
			@Pc(33) int local33 = arg1.length - 1;
			if (arg1[local33][0] == arg0 && arg1[local33][1] == arg2) {
				return true;
			}
			do {
				@Pc(55) int local55 = (local3 + local33) / 2;
				if (arg1[local55][0] == arg0 && arg1[local55][1] == arg2) {
					return true;
				}
				if (arg0 < arg1[local55][0] || arg0 == arg1[local55][0] && arg2 < arg1[local55][1]) {
					local33 = local55;
				} else {
					local3 = local55;
				}
			} while (local3 != local33 && local3 + 1 != local33);
			return false;
		} catch (@Pc(109) RuntimeException local109) {
			signlink.reporterror("55819, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + local109.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(CCBC)I")
	private static int method618(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(3) char arg2) {
		try {
			if (aByte39 != 3) {
				anInt949 = 198;
			}
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
			signlink.reporterror("72035, " + arg0 + ", " + arg1 + ", " + 3 + ", " + arg2 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(CICC)I")
	private static int method619(@OriginalArg(0) char arg0, @OriginalArg(2) char arg1, @OriginalArg(3) char arg2) {
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
		} catch (@Pc(517) RuntimeException local517) {
			signlink.reporterror("69824, " + arg0 + ", " + 9 + ", " + arg1 + ", " + arg2 + ", " + local517.toString());
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
			signlink.reporterror("84630, " + arg0 + ", " + -6728 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(I[C)V")
	private static void method621(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1) {
		try {
			@Pc(5) boolean local5 = false;
			@Pc(9) int local9 = 0;
			@Pc(11) int local11 = 0;
			@Pc(13) int local13 = 0;
			while (true) {
				do {
					@Pc(112) int local112;
					if ((local112 = method622(arg1, local9)) == -1) {
						return;
					}
					@Pc(17) boolean local17 = false;
					for (@Pc(19) int local19 = local9; local19 >= 0 && local19 < local112 && !local17; local19++) {
						if (!method624(arg1[local19], anInt949) && !method625(arg1[local19])) {
							local17 = true;
						}
					}
					if (local17) {
						local11 = 0;
					}
					if (local11 == 0) {
						local13 = local112;
					}
					local9 = method623(local112, arg1);
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
			signlink.reporterror("43650, " + arg0 + ", " + arg1 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[CI)I")
	private static int method622(@OriginalArg(1) char[] arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(5) int local5 = arg1; local5 < arg0.length && local5 >= 0; local5++) {
				if (arg0[local5] >= '0' && arg0[local5] <= '9') {
					return local5;
				}
			}
			return -1;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("80826, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(II[C)I")
	private static int method623(@OriginalArg(1) int arg0, @OriginalArg(2) char[] arg1) {
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
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("67099, " + 42584 + ", " + arg0 + ", " + arg1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(CI)Z")
	private static boolean method624(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 != 0) {
				throw new NullPointerException();
			}
			return !method626(anInt950, arg0) && !method627(arg0);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("47458, " + arg0 + ", " + arg1 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "(CI)Z")
	private static boolean method625(@OriginalArg(0) char arg0) {
		try {
			if (arg0 >= 'a' && arg0 <= 'z') {
				return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
			} else {
				return true;
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("39016, " + arg0 + ", " + 0 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IC)Z")
	private static boolean method626(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		try {
			if (arg0 <= 0) {
				anInt947 = -85;
			}
			return arg1 >= 'a' && arg1 <= 'z' || arg1 >= 'A' && arg1 <= 'Z';
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("77803, " + arg0 + ", " + arg1 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(CB)Z")
	private static boolean method627(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= '0' && arg0 <= '9';
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("75583, " + arg0 + ", " + 90 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BC)Z")
	private static boolean method628(@OriginalArg(0) byte arg0, @OriginalArg(1) char arg1) {
		try {
			@Pc(4) boolean local4 = false;
			return arg1 >= 'a' && arg1 <= 'z';
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("27352, " + arg0 + ", " + arg1 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(BC)Z")
	private static boolean method629(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("55136, " + -22 + ", " + arg0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "([CZ)Z")
	private static boolean method630(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				if (!method627(arg0[local5]) && arg0[local5] != '\u0000') {
					local3 = false;
				}
			}
			if (local3) {
				return true;
			}
			@Pc(32) int local32 = method631(arg0);
			@Pc(40) int local40 = 0;
			@Pc(45) int local45 = anIntArray254.length - 1;
			if (local32 == anIntArray254[0] || local32 == anIntArray254[local45]) {
				return true;
			}
			do {
				@Pc(63) int local63 = (local40 + local45) / 2;
				if (local32 == anIntArray254[local63]) {
					return true;
				}
				if (local32 < anIntArray254[local63]) {
					local45 = local63;
				} else {
					local40 = local63;
				}
			} while (local40 != local45 && local40 + 1 != local45);
			return false;
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("68747, " + arg0 + ", " + true + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(Z[C)I")
	private static int method631(@OriginalArg(1) char[] arg0) {
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
			signlink.reporterror("32847, " + false + ", " + arg0 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}
}
