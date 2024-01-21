import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!PRVYVGOX")
public final class Class29 {

	@OriginalMember(owner = "client!PRVYVGOX", name = "a", descriptor = "Z")
	private static boolean aBoolean127;

	@OriginalMember(owner = "client!PRVYVGOX", name = "b", descriptor = "Z")
	private static boolean aBoolean128;

	@OriginalMember(owner = "client!PRVYVGOX", name = "i", descriptor = "[I")
	private static int[] anIntArray159;

	@OriginalMember(owner = "client!PRVYVGOX", name = "j", descriptor = "[[C")
	private static char[][] aCharArrayArray1;

	@OriginalMember(owner = "client!PRVYVGOX", name = "k", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!PRVYVGOX", name = "l", descriptor = "[[C")
	private static char[][] aCharArrayArray2;

	@OriginalMember(owner = "client!PRVYVGOX", name = "m", descriptor = "[[C")
	private static char[][] aCharArrayArray3;

	@OriginalMember(owner = "client!PRVYVGOX", name = "n", descriptor = "[I")
	private static int[] anIntArray160;

	@OriginalMember(owner = "client!PRVYVGOX", name = "c", descriptor = "I")
	private static int anInt620 = 366;

	@OriginalMember(owner = "client!PRVYVGOX", name = "d", descriptor = "I")
	private static int anInt621 = -560;

	@OriginalMember(owner = "client!PRVYVGOX", name = "e", descriptor = "I")
	private static int anInt622 = -309;

	@OriginalMember(owner = "client!PRVYVGOX", name = "f", descriptor = "B")
	private static byte aByte19 = 9;

	@OriginalMember(owner = "client!PRVYVGOX", name = "g", descriptor = "I")
	private static int anInt623 = 275;

	@OriginalMember(owner = "client!PRVYVGOX", name = "h", descriptor = "I")
	private static int anInt624 = -12999;

	@OriginalMember(owner = "client!PRVYVGOX", name = "o", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray6 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

	@OriginalMember(owner = "client!PRVYVGOX", name = "a", descriptor = "(Lclient!IEMHZJLX;)V")
	public static void method389(@OriginalArg(0) Class15 arg0) {
		@Pc(10) Class1_Sub1_Sub4 local10 = new Class1_Sub1_Sub4(0, arg0.method181("fragmentsenc.txt", null));
		@Pc(19) Class1_Sub1_Sub4 local19 = new Class1_Sub1_Sub4(0, arg0.method181("badenc.txt", null));
		@Pc(28) Class1_Sub1_Sub4 local28 = new Class1_Sub1_Sub4(0, arg0.method181("domainenc.txt", null));
		@Pc(37) Class1_Sub1_Sub4 local37 = new Class1_Sub1_Sub4(0, arg0.method181("tldlist.txt", null));
		method390(local10, local19, local28, local37);
	}

	@OriginalMember(owner = "client!PRVYVGOX", name = "a", descriptor = "(Lclient!MVHXDWGI;Lclient!MVHXDWGI;Lclient!MVHXDWGI;Lclient!MVHXDWGI;)V")
	private static void method390(@OriginalArg(0) Class1_Sub1_Sub4 arg0, @OriginalArg(1) Class1_Sub1_Sub4 arg1, @OriginalArg(2) Class1_Sub1_Sub4 arg2, @OriginalArg(3) Class1_Sub1_Sub4 arg3) {
		method392(arg1);
		method393(arg2);
		method394(arg0, 453);
		method391(arg3);
	}

	@OriginalMember(owner = "client!PRVYVGOX", name = "a", descriptor = "(Lclient!MVHXDWGI;B)V")
	private static void method391(@OriginalArg(0) Class1_Sub1_Sub4 arg0) {
		try {
			@Pc(4) int local4 = arg0.method299();
			aCharArrayArray3 = new char[local4][];
			anIntArray160 = new int[local4];
			for (@Pc(21) int local21 = 0; local21 < local4; local21++) {
				anIntArray160[local21] = arg0.method294();
				@Pc(32) char[] local32 = new char[arg0.method294()];
				for (@Pc(34) int local34 = 0; local34 < local32.length; local34++) {
					local32[local34] = (char) arg0.method294();
				}
				aCharArrayArray3[local21] = local32;
			}
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("82982, " + arg0 + ", " + 123 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PRVYVGOX", name = "a", descriptor = "(Lclient!MVHXDWGI;I)V")
	private static void method392(@OriginalArg(0) Class1_Sub1_Sub4 arg0) {
		try {
			@Pc(2) int local2 = arg0.method299();
			aCharArrayArray1 = new char[local2][];
			aByteArrayArrayArray1 = new byte[local2][][];
			method395(arg0, aByteArrayArrayArray1, aCharArrayArray1);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("6380, " + arg0 + ", " + 366 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PRVYVGOX", name = "b", descriptor = "(Lclient!MVHXDWGI;I)V")
	private static void method393(@OriginalArg(0) Class1_Sub1_Sub4 arg0) {
		try {
			@Pc(2) int local2 = arg0.method299();
			aCharArrayArray2 = new char[local2][];
			method396(arg0, aCharArrayArray2);
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("21817, " + arg0 + ", " + 0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PRVYVGOX", name = "c", descriptor = "(Lclient!MVHXDWGI;I)V")
	private static void method394(@OriginalArg(0) Class1_Sub1_Sub4 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			anIntArray159 = new int[arg0.method299()];
			for (@Pc(9) int local9 = 0; local9 < anIntArray159.length; local9++) {
				anIntArray159[local9] = arg0.method296();
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("12415, " + arg0 + ", " + arg1 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PRVYVGOX", name = "a", descriptor = "(Lclient!MVHXDWGI;[[[B[[CI)V")
	private static void method395(@OriginalArg(0) Class1_Sub1_Sub4 arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) char[][] arg2) {
		try {
			for (@Pc(12) int local12 = 0; local12 < arg2.length; local12++) {
				@Pc(18) char[] local18 = new char[arg0.method294()];
				for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
					local18[local20] = (char) arg0.method294();
				}
				arg2[local12] = local18;
				@Pc(42) byte[][] local42 = new byte[arg0.method294()][2];
				for (@Pc(44) int local44 = 0; local44 < local42.length; local44++) {
					local42[local44][0] = (byte) arg0.method294();
					local42[local44][1] = (byte) arg0.method294();
				}
				if (local42.length > 0) {
					arg1[local12] = local42;
				}
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("40023, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 5 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PRVYVGOX", name = "a", descriptor = "(Lclient!MVHXDWGI;I[[C)V")
	private static void method396(@OriginalArg(0) Class1_Sub1_Sub4 arg0, @OriginalArg(2) char[][] arg1) {
		try {
			for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
				@Pc(13) char[] local13 = new char[arg0.method294()];
				for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
					local13[local15] = (char) arg0.method294();
				}
				arg1[local7] = local13;
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("83215, " + arg0 + ", " + 23262 + ", " + arg1 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PRVYVGOX", name = "a", descriptor = "([CI)V")
	private static void method397(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) int local3 = 0;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				if (method398(arg0[local5])) {
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
			if (arg1 >= 0) {
				;
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("56060, " + arg0 + ", " + arg1 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PRVYVGOX", name = "a", descriptor = "(IC)Z")
	private static boolean method398(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= ' ' && arg0 <= '\u007f' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("77557, " + -309 + ", " + arg0 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PRVYVGOX", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method399(@OriginalArg(0) String arg0) {
		try {
			@Pc(3) long local3 = System.currentTimeMillis();
			@Pc(6) char[] local6 = arg0.toCharArray();
			method397(local6, anInt621);
			@Pc(15) String local15 = (new String(local6)).trim();
			@Pc(19) char[] local19 = local15.toLowerCase().toCharArray();
			@Pc(22) String local22 = local15.toLowerCase();
			method407(local19);
			method402(local19);
			method403(local19);
			method416(local19);
			for (@Pc(45) int local45 = 0; local45 < aStringArray6.length; local45++) {
				@Pc(55) int local55 = -1;
				while ((local55 = local22.indexOf(aStringArray6[local45], local55 + 1)) != -1) {
					@Pc(62) char[] local62 = aStringArray6[local45].toCharArray();
					for (@Pc(64) int local64 = 0; local64 < local62.length; local64++) {
						local19[local64 + local55] = local62[local64];
					}
				}
			}
			method400(local15.toCharArray(), local19);
			method401(anInt623, local19);
			@Pc(106) long local106 = System.currentTimeMillis();
			return (new String(local19)).trim();
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("8155, " + arg0 + ", " + 8 + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PRVYVGOX", name = "a", descriptor = "([CB[C)V")
	private static void method400(@OriginalArg(0) char[] arg0, @OriginalArg(2) char[] arg1) {
		try {
			if (aByte19 != 9) {
				anInt620 = -247;
			}
			for (@Pc(6) int local6 = 0; local6 < arg0.length; local6++) {
				if (arg1[local6] != '*' && method424(arg0[local6])) {
					arg1[local6] = arg0[local6];
				}
			}
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("11123, " + arg0 + ", " + 9 + ", " + arg1 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PRVYVGOX", name = "a", descriptor = "(I[C)V")
	private static void method401(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1) {
		try {
			@Pc(3) boolean local3 = true;
			@Pc(7) int local7 = 86 / arg0;
			for (@Pc(9) int local9 = 0; local9 < arg1.length; local9++) {
				@Pc(15) char local15 = arg1[local9];
				if (!method421(local15)) {
					local3 = true;
				} else if (local3) {
					if (method423(local15)) {
						local3 = false;
					}
				} else if (method424(local15)) {
					arg1[local9] = (char) (local15 + 'a' - 65);
				}
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("920, " + arg0 + ", " + arg1 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PRVYVGOX", name = "b", descriptor = "([CI)V")
	private static void method402(@OriginalArg(0) char[] arg0) {
		try {
			for (@Pc(6) int local6 = 0; local6 < 2; local6++) {
				for (@Pc(13) int local13 = aCharArrayArray1.length - 1; local13 >= 0; local13--) {
					method411(arg0, aByteArrayArrayArray1[local13], aCharArrayArray1[local13]);
				}
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("80540, " + arg0 + ", " + 0 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PRVYVGOX", name = "c", descriptor = "([CI)V")
	private static void method403(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(18) char[] local18 = new char[] { '(', 'a', ')' };
			method411(local3, null, local18);
			@Pc(27) char[] local27 = (char[]) arg0.clone();
			@Pc(45) char[] local45 = new char[] { 'd', 'o', 't' };
			method411(local27, null, local45);
			for (@Pc(55) int local55 = aCharArrayArray2.length - 1; local55 >= 0; local55--) {
				method404(local3, aCharArrayArray2[local55], local27, arg0);
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("75029, " + arg0 + ", " + 0 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PRVYVGOX", name = "a", descriptor = "([C[CI[C[C)V")
	private static void method404(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(3) char[] arg2, @OriginalArg(4) char[] arg3) {
		try {
			if (arg1.length <= arg3.length) {
				@Pc(23) int local23;
				for (@Pc(15) int local15 = 0; local15 <= arg3.length - arg1.length; local15 += local23) {
					@Pc(19) int local19 = local15;
					@Pc(21) int local21 = 0;
					local23 = 1;
					label58: while (true) {
						while (true) {
							if (local19 >= arg3.length) {
								break label58;
							}
							@Pc(31) char local31 = arg3[local19];
							@Pc(33) char local33 = 0;
							if (local19 + 1 < arg3.length) {
								local33 = arg3[local19 + 1];
							}
							@Pc(58) int local58;
							if (local21 < arg1.length && (local58 = method413(local33, local31, arg1[local21])) > 0) {
								local19 += local58;
								local21++;
							} else {
								if (local21 == 0) {
									break label58;
								}
								@Pc(79) int local79;
								if ((local79 = method413(local33, local31, arg1[local21 - 1])) > 0) {
									local19 += local79;
									if (local21 == 1) {
										local23++;
									}
								} else {
									if (local21 >= arg1.length || !method419(local31)) {
										break label58;
									}
									local19++;
								}
							}
						}
					}
					if (local21 >= arg1.length) {
						@Pc(110) boolean local110 = false;
						@Pc(116) int local116 = method405(arg3, arg0, local15);
						@Pc(124) int local124 = method406(local19 - 1, arg3, arg2);
						if (local116 > 2 || local124 > 2) {
							local110 = true;
						}
						if (local110) {
							for (@Pc(136) int local136 = local15; local136 < local19; local136++) {
								arg3[local136] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("3947, " + arg0 + ", " + arg1 + ", " + 16919 + ", " + arg2 + ", " + arg3 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PRVYVGOX", name = "a", descriptor = "([C[CBI)I")
	private static int method405(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 == 0) {
				return 2;
			}
			for (@Pc(9) int local9 = arg2 - 1; local9 >= 0 && method419(arg0[local9]); local9--) {
				if (arg0[local9] == '@') {
					return 3;
				}
			}
			@Pc(34) int local34 = 0;
			for (@Pc(38) int local38 = arg2 - 1; local38 >= 0 && method419(arg1[local38]); local38--) {
				if (arg1[local38] == '*') {
					local34++;
				}
			}
			if (local34 >= 3) {
				return 4;
			} else if (method419(arg0[arg2 - 1])) {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("57704, " + arg0 + ", " + arg1 + ", " + 7 + ", " + arg2 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PRVYVGOX", name = "a", descriptor = "(II[C[C)I")
	private static int method406(@OriginalArg(1) int arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg0 + 1 == arg1.length) {
				return 2;
			}
			@Pc(13) int local13 = arg0 + 1;
			while (true) {
				if (local13 < arg1.length && method419(arg1[local13])) {
					if (arg1[local13] != '.' && arg1[local13] != ',') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(49) int local49 = 0;
				for (@Pc(53) int local53 = arg0 + 1; local53 < arg1.length && method419(arg2[local53]); local53++) {
					if (arg2[local53] == '*') {
						local49++;
					}
				}
				if (local49 >= 3) {
					return 4;
				}
				if (method419(arg1[arg0 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("48919, " + -30052 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PRVYVGOX", name = "b", descriptor = "(I[C)V")
	private static void method407(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(18) char[] local18 = new char[] { 'd', 'o', 't' };
			method411(local3, null, local18);
			@Pc(32) char[] local32 = (char[]) arg0.clone();
			@Pc(55) char[] local55 = new char[] { 's', 'l', 'a', 's', 'h' };
			method411(local32, null, local55);
			for (@Pc(62) int local62 = 0; local62 < aCharArrayArray3.length; local62++) {
				method408(aCharArrayArray3[local62], local32, arg0, anIntArray160[local62], local3);
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("27916, " + 19914 + ", " + arg0 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PRVYVGOX", name = "a", descriptor = "([C[C[CII[C)V")
	private static void method408(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) char[] arg4) {
		try {
			if (arg0.length <= arg2.length) {
				@Pc(22) int local22;
				for (@Pc(14) int local14 = 0; local14 <= arg2.length - arg0.length; local14 += local22) {
					@Pc(18) int local18 = local14;
					@Pc(20) int local20 = 0;
					local22 = 1;
					label120: while (true) {
						while (true) {
							if (local18 >= arg2.length) {
								break label120;
							}
							@Pc(30) char local30 = arg2[local18];
							@Pc(32) char local32 = 0;
							if (local18 + 1 < arg2.length) {
								local32 = arg2[local18 + 1];
							}
							@Pc(57) int local57;
							if (local20 < arg0.length && (local57 = method413(local32, local30, arg0[local20])) > 0) {
								local18 += local57;
								local20++;
							} else {
								if (local20 == 0) {
									break label120;
								}
								@Pc(78) int local78;
								if ((local78 = method413(local32, local30, arg0[local20 - 1])) > 0) {
									local18 += local78;
									if (local20 == 1) {
										local22++;
									}
								} else {
									if (local20 >= arg0.length || !method419(local30)) {
										break label120;
									}
									local18++;
								}
							}
						}
					}
					if (local20 >= arg0.length) {
						@Pc(109) boolean local109 = false;
						@Pc(115) int local115 = method409(arg2, local14, (byte) 1, arg4);
						@Pc(123) int local123 = method410(arg1, local18 - 1, arg2);
						if (arg3 == 1 && local115 > 0 && local123 > 0) {
							local109 = true;
						}
						if (arg3 == 2 && (local115 > 2 && local123 > 0 || local115 > 0 && local123 > 2)) {
							local109 = true;
						}
						if (arg3 == 3 && local115 > 0 && local123 > 2) {
							local109 = true;
						}
						@Pc(166) boolean local166;
						if (arg3 == 3 && local115 > 2 && local123 > 0) {
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
											if (arg4[local189] != '*') {
												break;
											}
											local173 = local189;
										} else if (arg4[local189] == '*') {
											local173 = local189;
											local185 = true;
										}
									}
								}
								local185 = false;
								for (local189 = local173 - 1; local189 >= 0; local189--) {
									if (local185) {
										if (method419(arg2[local189])) {
											break;
										}
										local173 = local189;
									} else if (!method419(arg2[local189])) {
										local185 = true;
										local173 = local189;
									}
								}
							}
							if (local123 > 2) {
								if (local123 == 4) {
									local185 = false;
									for (local189 = local177 + 1; local189 < arg2.length; local189++) {
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
								for (local189 = local177 + 1; local189 < arg2.length; local189++) {
									if (local185) {
										if (method419(arg2[local189])) {
											break;
										}
										local177 = local189;
									} else if (!method419(arg2[local189])) {
										local185 = true;
										local177 = local189;
									}
								}
							}
							for (@Pc(323) int local323 = local173; local323 <= local177; local323++) {
								arg2[local323] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(346) RuntimeException local346) {
			signlink.reporterror("38820, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + arg4 + ", " + local346.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PRVYVGOX", name = "a", descriptor = "([CIB[C)I")
	private static int method409(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) char[] arg3) {
		try {
			if (arg1 == 0) {
				return 2;
			}
			@Pc(9) int local9 = arg1 - 1;
			while (true) {
				if (local9 >= 0 && method419(arg0[local9])) {
					if (arg0[local9] != ',' && arg0[local9] != '.') {
						local9--;
						continue;
					}
					return 3;
				}
				@Pc(34) int local34 = 0;
				for (@Pc(38) int local38 = arg1 - 1; local38 >= 0 && method419(arg3[local38]); local38--) {
					if (arg3[local38] == '*') {
						local34++;
					}
				}
				@Pc(61) boolean local61 = false;
				if (local34 >= 3) {
					return 4;
				}
				if (method419(arg0[arg1 - 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("22248, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PRVYVGOX", name = "a", descriptor = "([CI[CI)I")
	private static int method410(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) char[] arg2) {
		try {
			if (arg1 + 1 == arg2.length) {
				return 2;
			}
			@Pc(13) int local13 = arg1 + 1;
			while (true) {
				if (local13 < arg2.length && method419(arg2[local13])) {
					if (arg2[local13] != '\\' && arg2[local13] != '/') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(40) int local40 = 0;
				for (@Pc(49) int local49 = arg1 + 1; local49 < arg2.length && method419(arg0[local49]); local49++) {
					if (arg0[local49] == '*') {
						local40++;
					}
				}
				if (local40 >= 5) {
					return 4;
				}
				if (method419(arg2[arg1 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("33191, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -18966 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PRVYVGOX", name = "a", descriptor = "([C[[B[CI)V")
	private static void method411(@OriginalArg(0) char[] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) char[] arg2) {
		try {
			if (arg2.length <= arg0.length) {
				@Pc(32) int local32;
				for (@Pc(22) int local22 = 0; local22 <= arg0.length - arg2.length; local22 += local32) {
					@Pc(26) int local26 = local22;
					@Pc(28) int local28 = 0;
					@Pc(30) int local30 = 0;
					local32 = 1;
					@Pc(34) boolean local34 = false;
					@Pc(36) boolean local36 = false;
					@Pc(38) boolean local38 = false;
					@Pc(46) char var12;
					@Pc(48) char var13;
					label164: while (true) {
						while (true) {
							if (local26 >= arg0.length || local36 && local38) {
								break label164;
							}
							var12 = arg0[local26];
							var13 = '\u0000';
							if (local26 + 1 < arg0.length) {
								var13 = arg0[local26 + 1];
							}
							@Pc(73) int local73;
							if (local28 < arg2.length && (local73 = method414(arg2[local28], var13, var12)) > 0) {
								if (local73 == 1 && method422(var12)) {
									local36 = true;
								}
								if (local73 == 2 && (method422(var12) || method422(var13))) {
									local36 = true;
								}
								local26 += local73;
								local28++;
							} else {
								if (local28 == 0) {
									break label164;
								}
								@Pc(116) int local116;
								if ((local116 = method414(arg2[local28 - 1], var13, var12)) > 0) {
									local26 += local116;
									if (local28 == 1) {
										local32++;
									}
								} else {
									if (local28 >= arg2.length || !method420((byte) 2, var12)) {
										break label164;
									}
									if (method419(var12) && var12 != '\'') {
										local34 = true;
									}
									if (method422(var12)) {
										local38 = true;
									}
									local26++;
									local30++;
									if (local30 * 100 / (local26 - local22) > 90) {
										break label164;
									}
								}
							}
						}
					}
					if (local28 >= arg2.length && (!local36 || !local38)) {
						@Pc(181) boolean local181 = true;
						@Pc(277) int local277;
						if (local34) {
							@Pc(227) boolean local227 = false;
							@Pc(229) boolean local229 = false;
							if (local22 - 1 < 0 || method419(arg0[local22 - 1]) && arg0[local22 - 1] != '\'') {
								local227 = true;
							}
							if (local26 >= arg0.length || method419(arg0[local26]) && arg0[local26] != '\'') {
								local229 = true;
							}
							if (!local227 || !local229) {
								@Pc(273) boolean local273 = false;
								local277 = local22 - 2;
								if (local227) {
									local277 = local22;
								}
								while (!local273 && local277 < local26) {
									if (local277 >= 0 && (!method419(arg0[local277]) || arg0[local277] == '\'')) {
										@Pc(299) char[] local299 = new char[3];
										@Pc(301) int local301;
										for (local301 = 0; local301 < 3 && local277 + local301 < arg0.length && (!method419(arg0[local277 + local301]) || arg0[local277 + local301] == '\''); local301++) {
											local299[local301] = arg0[local277 + local301];
										}
										@Pc(339) boolean local339 = true;
										if (local301 == 0) {
											local339 = false;
										}
										if (local301 < 3 && local277 - 1 >= 0 && (!method419(arg0[local277 - 1]) || arg0[local277 - 1] == '\'')) {
											local339 = false;
										}
										if (local339 && !method425(local299)) {
											local273 = true;
										}
									}
									local277++;
								}
								if (!local273) {
									local181 = false;
								}
							}
						} else {
							var12 = ' ';
							if (local22 - 1 >= 0) {
								var12 = arg0[local22 - 1];
							}
							var13 = ' ';
							if (local26 < arg0.length) {
								var13 = arg0[local26];
							}
							@Pc(209) byte local209 = method415(var12);
							@Pc(213) byte local213 = method415(var13);
							if (arg1 != null && method412(local213, arg1, local209)) {
								local181 = false;
							}
						}
						if (local181) {
							@Pc(389) int local389 = 0;
							@Pc(391) int local391 = 0;
							@Pc(393) int local393 = -1;
							for (local277 = local22; local277 < local26; local277++) {
								if (method422(arg0[local277])) {
									local389++;
								} else if (method421(arg0[local277])) {
									local391++;
									local393 = local277;
								}
							}
							if (local393 > -1) {
								local389 -= local26 - local393 - 1;
							}
							if (local389 <= local391) {
								for (@Pc(435) int local435 = local22; local435 < local26; local435++) {
									arg0[local435] = '*';
								}
							} else {
								local32 = 1;
							}
						}
					}
				}
			}
		} catch (@Pc(462) RuntimeException local462) {
			signlink.reporterror("89372, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -334 + ", " + local462.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PRVYVGOX", name = "a", descriptor = "(BZ[[BB)Z")
	private static boolean method412(@OriginalArg(0) byte arg0, @OriginalArg(2) byte[][] arg1, @OriginalArg(3) byte arg2) {
		try {
			@Pc(3) int local3 = 0;
			if (arg1[0][0] == arg2 && arg1[0][1] == arg0) {
				return true;
			}
			@Pc(33) int local33 = arg1.length - 1;
			if (arg1[local33][0] == arg2 && arg1[local33][1] == arg0) {
				return true;
			}
			do {
				@Pc(55) int local55 = (local3 + local33) / 2;
				if (arg1[local55][0] == arg2 && arg1[local55][1] == arg0) {
					return true;
				}
				if (arg2 < arg1[local55][0] || arg2 == arg1[local55][0] && arg0 < arg1[local55][1]) {
					local33 = local55;
				} else {
					local3 = local55;
				}
			} while (local3 != local33 && local3 + 1 != local33);
			return false;
		} catch (@Pc(109) RuntimeException local109) {
			signlink.reporterror("8681, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + local109.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PRVYVGOX", name = "a", descriptor = "(CBCC)I")
	private static int method413(@OriginalArg(0) char arg0, @OriginalArg(2) char arg1, @OriginalArg(3) char arg2) {
		try {
			if (arg2 == arg1) {
				return 1;
			} else if (arg2 == 'o' && arg1 == '0') {
				return 1;
			} else if (arg2 == 'o' && arg1 == '(' && arg0 == ')') {
				return 2;
			} else if (arg2 == 'c' && (arg1 == '(' || arg1 == '<' || arg1 == '[')) {
				return 1;
			} else if (arg2 == 'e' && arg1 == '€') {
				return 1;
			} else if (arg2 == 's' && arg1 == '$') {
				return 1;
			} else if (arg2 == 'l' && arg1 == 'i') {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("87028, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PRVYVGOX", name = "a", descriptor = "(CCBC)I")
	private static int method414(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(3) char arg2) {
		try {
			if (arg0 == arg2) {
				return 1;
			}
			if (arg0 >= 'a' && arg0 <= 'm') {
				if (arg0 == 'a') {
					if (arg2 != '4' && arg2 != '@' && arg2 != '^') {
						if (arg2 == '/' && arg1 == '\\') {
							return 2;
						}
						return 0;
					}
					return 1;
				}
				if (arg0 == 'b') {
					if (arg2 != '6' && arg2 != '8') {
						if ((arg2 != '1' || arg1 != '3') && (arg2 != 'i' || arg1 != '3')) {
							return 0;
						}
						return 2;
					}
					return 1;
				}
				if (arg0 == 'c') {
					if (arg2 != '(' && arg2 != '<' && arg2 != '{' && arg2 != '[') {
						return 0;
					}
					return 1;
				}
				if (arg0 == 'd') {
					if ((arg2 != '[' || arg1 != ')') && (arg2 != 'i' || arg1 != ')')) {
						return 0;
					}
					return 2;
				}
				if (arg0 == 'e') {
					if (arg2 != '3' && arg2 != '€') {
						return 0;
					}
					return 1;
				}
				if (arg0 == 'f') {
					if (arg2 == 'p' && arg1 == 'h') {
						return 2;
					}
					if (arg2 == '£') {
						return 1;
					}
					return 0;
				}
				if (arg0 == 'g') {
					if (arg2 != '9' && arg2 != '6' && arg2 != 'q') {
						return 0;
					}
					return 1;
				}
				if (arg0 == 'h') {
					if (arg2 == '#') {
						return 1;
					}
					return 0;
				}
				if (arg0 == 'i') {
					if (arg2 != 'y' && arg2 != 'l' && arg2 != 'j' && arg2 != '1' && arg2 != '!' && arg2 != ':' && arg2 != ';' && arg2 != '|') {
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
					if (arg2 != '1' && arg2 != '|' && arg2 != 'i') {
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
					if (arg2 != '0' && arg2 != '*') {
						if ((arg2 != '(' || arg1 != ')') && (arg2 != '[' || arg1 != ']') && (arg2 != '{' || arg1 != '}') && (arg2 != '<' || arg1 != '>')) {
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
					if (arg2 != '5' && arg2 != 'z' && arg2 != '$' && arg2 != '2') {
						return 0;
					}
					return 1;
				}
				if (arg0 == 't') {
					if (arg2 != '7' && arg2 != '+') {
						return 0;
					}
					return 1;
				}
				if (arg0 == 'u') {
					if (arg2 == 'v') {
						return 1;
					}
					if ((arg2 != '\\' || arg1 != '/') && (arg2 != '\\' || arg1 != '|') && (arg2 != '|' || arg1 != '/')) {
						return 0;
					}
					return 2;
				}
				if (arg0 == 'v') {
					if ((arg2 != '\\' || arg1 != '/') && (arg2 != '\\' || arg1 != '|') && (arg2 != '|' || arg1 != '/')) {
						return 0;
					}
					return 2;
				}
				if (arg0 == 'w') {
					if (arg2 == 'v' && arg1 == 'v') {
						return 2;
					}
					return 0;
				}
				if (arg0 == 'x') {
					if ((arg2 != ')' || arg1 != '(') && (arg2 != '}' || arg1 != '{') && (arg2 != ']' || arg1 != '[') && (arg2 != '>' || arg1 != '<')) {
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
					if (arg2 == 'o' || arg2 == 'O') {
						return 1;
					} else if ((arg2 != '(' || arg1 != ')') && (arg2 != '{' || arg1 != '}') && (arg2 != '[' || arg1 != ']')) {
						return 0;
					} else {
						return 2;
					}
				} else if (arg0 == '1') {
					return arg2 == 'l' ? 1 : 0;
				} else {
					return 0;
				}
			} else if (arg0 == ',') {
				return arg2 == '.' ? 1 : 0;
			} else if (arg0 == '.') {
				return arg2 == ',' ? 1 : 0;
			} else if (arg0 == '!') {
				return arg2 == 'i' ? 1 : 0;
			} else {
				return 0;
			}
		} catch (@Pc(517) RuntimeException local517) {
			signlink.reporterror("42503, " + arg0 + ", " + arg1 + ", " + 9 + ", " + arg2 + ", " + local517.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PRVYVGOX", name = "a", descriptor = "(CI)B")
	private static byte method415(@OriginalArg(0) char arg0) {
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
			signlink.reporterror("54571, " + arg0 + ", " + 0 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PRVYVGOX", name = "a", descriptor = "([CZ)V")
	private static void method416(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			@Pc(9) int local9 = 0;
			while (true) {
				do {
					@Pc(109) int local109;
					if ((local109 = method417(local5, arg0)) == -1) {
						return;
					}
					@Pc(14) boolean local14 = false;
					for (@Pc(16) int local16 = local5; local16 >= 0 && local16 < local109 && !local14; local16++) {
						if (!method419(arg0[local16]) && !method420((byte) 2, arg0[local16])) {
							local14 = true;
						}
					}
					if (local14) {
						local7 = 0;
					}
					if (local7 == 0) {
						local9 = local109;
					}
					local5 = method418(arg0, local109);
					@Pc(55) int local55 = 0;
					for (@Pc(57) int local57 = local109; local57 < local5; local57++) {
						local55 = local55 * 10 + arg0[local57] - 48;
					}
					if (local55 <= 255 && local5 - local109 <= 8) {
						local7++;
					} else {
						local7 = 0;
					}
				} while (local7 != 4);
				for (@Pc(91) int local91 = local9; local91 < local5; local91++) {
					arg0[local91] = '*';
				}
				local7 = 0;
			}
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("71377, " + arg0 + ", " + false + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PRVYVGOX", name = "a", descriptor = "(II[C)I")
	private static int method417(@OriginalArg(0) int arg0, @OriginalArg(2) char[] arg1) {
		try {
			for (@Pc(1) int local1 = arg0; local1 < arg1.length && local1 >= 0; local1++) {
				if (arg1[local1] >= '0' && arg1[local1] <= '9') {
					return local1;
				}
			}
			return -1;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("5082, " + arg0 + ", " + -598 + ", " + arg1 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PRVYVGOX", name = "a", descriptor = "(Z[CI)I")
	private static int method418(@OriginalArg(1) char[] arg0, @OriginalArg(2) int arg1) {
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
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("33642, " + false + ", " + arg0 + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PRVYVGOX", name = "a", descriptor = "(CB)Z")
	private static boolean method419(@OriginalArg(0) char arg0) {
		try {
			return !method421(arg0) && !method422(arg0);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("30076, " + arg0 + ", " + -26 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PRVYVGOX", name = "a", descriptor = "(BC)Z")
	private static boolean method420(@OriginalArg(0) byte arg0, @OriginalArg(1) char arg1) {
		try {
			@Pc(6) boolean local6 = false;
			if (arg1 >= 'a' && arg1 <= 'z') {
				return arg1 == 'v' || arg1 == 'x' || arg1 == 'j' || arg1 == 'q' || arg1 == 'z';
			} else {
				return true;
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("54103, " + arg0 + ", " + arg1 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PRVYVGOX", name = "b", descriptor = "(CI)Z")
	private static boolean method421(@OriginalArg(0) char arg0) {
		try {
			if (anInt624 != -12999) {
				for (@Pc(4) int local4 = 1; local4 > 0; local4++) {
				}
			}
			return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("44227, " + arg0 + ", " + -12999 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PRVYVGOX", name = "b", descriptor = "(IC)Z")
	private static boolean method422(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= '0' && arg0 <= '9';
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("63085, " + 0 + ", " + arg0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PRVYVGOX", name = "a", descriptor = "(ZC)Z")
	private static boolean method423(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z';
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("33688, " + true + ", " + arg0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PRVYVGOX", name = "c", descriptor = "(IC)Z")
	private static boolean method424(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("80735, " + 6 + ", " + arg0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PRVYVGOX", name = "a", descriptor = "(Z[C)Z")
	private static boolean method425(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
				if (!method422(arg0[local11]) && arg0[local11] != '\u0000') {
					local3 = false;
				}
			}
			if (local3) {
				return true;
			}
			@Pc(38) int local38 = method426(arg0);
			@Pc(40) int local40 = 0;
			@Pc(45) int local45 = anIntArray159.length - 1;
			if (local38 == anIntArray159[0] || local38 == anIntArray159[local45]) {
				return true;
			}
			do {
				@Pc(63) int local63 = (local40 + local45) / 2;
				if (local38 == anIntArray159[local63]) {
					return true;
				}
				if (local38 < anIntArray159[local63]) {
					local45 = local63;
				} else {
					local40 = local63;
				}
			} while (local40 != local45 && local40 + 1 != local45);
			return false;
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("81868, " + true + ", " + arg0 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PRVYVGOX", name = "c", descriptor = "(I[C)I")
	private static int method426(@OriginalArg(1) char[] arg0) {
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
			signlink.reporterror("71556, " + 157 + ", " + arg0 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}
}
