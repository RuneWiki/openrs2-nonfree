import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!mc")
public final class Class25 {

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "Z")
	private static boolean aBoolean155;

	@OriginalMember(owner = "client!mc", name = "k", descriptor = "[I")
	private static int[] anIntArray195;

	@OriginalMember(owner = "client!mc", name = "l", descriptor = "[[C")
	private static char[][] aCharArrayArray1;

	@OriginalMember(owner = "client!mc", name = "m", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!mc", name = "n", descriptor = "[[C")
	private static char[][] aCharArrayArray2;

	@OriginalMember(owner = "client!mc", name = "o", descriptor = "[[C")
	private static char[][] aCharArrayArray3;

	@OriginalMember(owner = "client!mc", name = "p", descriptor = "[I")
	private static int[] anIntArray196;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "Z")
	private static boolean aBoolean154 = true;

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
	private static int anInt616 = 5;

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "Z")
	private static boolean aBoolean157;

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
	private static int anInt617;

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "B")
	private static byte aByte34;

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "B")
	private static byte aByte35;

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "Z")
	private static boolean aBoolean158;

	@OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
	private static int anInt618;

	@OriginalMember(owner = "client!mc", name = "q", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray11;

	static {
		aBoolean156 = true;
		aBoolean157 = true;
		anInt617 = 3;
		aByte34 = 3;
		aByte35 = 3;
		aBoolean158 = true;
		anInt618 = 22945;
		aStringArray11 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet" };
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!ub;)V")
	public static void method395(@OriginalArg(0) Class39 arg0) {
		@Pc(11) Class1_Sub3_Sub3 local11 = new Class1_Sub3_Sub3(arg0.method516("fragmentsenc.txt", null), aBoolean154);
		@Pc(21) Class1_Sub3_Sub3 local21 = new Class1_Sub3_Sub3(arg0.method516("badenc.txt", null), aBoolean154);
		@Pc(31) Class1_Sub3_Sub3 local31 = new Class1_Sub3_Sub3(arg0.method516("domainenc.txt", null), aBoolean154);
		@Pc(41) Class1_Sub3_Sub3 local41 = new Class1_Sub3_Sub3(arg0.method516("tldlist.txt", null), aBoolean154);
		method396(local11, local21, local31, local41);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!kb;Lclient!kb;Lclient!kb;Lclient!kb;)V")
	private static void method396(@OriginalArg(0) Class1_Sub3_Sub3 arg0, @OriginalArg(1) Class1_Sub3_Sub3 arg1, @OriginalArg(2) Class1_Sub3_Sub3 arg2, @OriginalArg(3) Class1_Sub3_Sub3 arg3) {
		method398(arg1);
		method399(arg2);
		method400(arg0);
		method397(arg3);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!kb;I)V")
	private static void method397(@OriginalArg(0) Class1_Sub3_Sub3 arg0) {
		try {
			@Pc(4) int local4 = arg0.method377();
			aCharArrayArray3 = new char[local4][];
			anIntArray196 = new int[local4];
			for (@Pc(23) int local23 = 0; local23 < local4; local23++) {
				anIntArray196[local23] = arg0.method372();
				@Pc(34) char[] local34 = new char[arg0.method372()];
				for (@Pc(36) int local36 = 0; local36 < local34.length; local36++) {
					local34[local36] = (char) arg0.method372();
				}
				aCharArrayArray3[local23] = local34;
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("75823, " + arg0 + ", " + -586 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(Lclient!kb;I)V")
	private static void method398(@OriginalArg(0) Class1_Sub3_Sub3 arg0) {
		try {
			@Pc(2) int local2 = arg0.method377();
			aCharArrayArray1 = new char[local2][];
			aByteArrayArrayArray8 = new byte[local2][][];
			method401(aByteArrayArrayArray8, aCharArrayArray1, arg0);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("49761, " + arg0 + ", " + -537 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BLclient!kb;)V")
	private static void method399(@OriginalArg(1) Class1_Sub3_Sub3 arg0) {
		try {
			@Pc(2) int local2 = arg0.method377();
			aCharArrayArray2 = new char[local2][];
			method402(aCharArrayArray2, arg0);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("36582, " + 4 + ", " + arg0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(Lclient!kb;I)V")
	private static void method400(@OriginalArg(0) Class1_Sub3_Sub3 arg0) {
		try {
			anIntArray195 = new int[arg0.method377()];
			for (@Pc(8) int local8 = 0; local8 < anIntArray195.length; local8++) {
				anIntArray195[local8] = arg0.method374();
			}
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("59592, " + arg0 + ", " + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "([[[BI[[CLclient!kb;)V")
	private static void method401(@OriginalArg(0) byte[][][] arg0, @OriginalArg(2) char[][] arg1, @OriginalArg(3) Class1_Sub3_Sub3 arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
				@Pc(9) char[] local9 = new char[arg2.method372()];
				for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
					local9[local11] = (char) arg2.method372();
				}
				arg1[local3] = local9;
				@Pc(33) byte[][] local33 = new byte[arg2.method372()][2];
				for (@Pc(35) int local35 = 0; local35 < local33.length; local35++) {
					local33[local35][0] = (byte) arg2.method372();
					local33[local35][1] = (byte) arg2.method372();
				}
				if (local33.length > 0) {
					arg0[local3] = local33;
				}
			}
			if (anInt617 == 3) {
				;
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("59748, " + arg0 + ", " + 3 + ", " + arg1 + ", " + arg2 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I[[CLclient!kb;)V")
	private static void method402(@OriginalArg(1) char[][] arg0, @OriginalArg(2) Class1_Sub3_Sub3 arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
				@Pc(9) char[] local9 = new char[arg1.method372()];
				for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
					local9[local11] = (char) arg1.method372();
				}
				arg0[local3] = local9;
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("61435, " + 255 + ", " + arg0 + ", " + arg1 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z[C)V")
	private static void method403(@OriginalArg(1) char[] arg0) {
		try {
			for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
				if (!method404(arg0[local1])) {
					arg0[local1] = ' ';
				}
			}
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("19153, " + false + ", " + arg0 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(CI)Z")
	private static boolean method404(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= ' ' && arg0 <= '\u007f' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("11976, " + arg0 + ", " + -441 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method405(@OriginalArg(1) String arg0) {
		try {
			@Pc(3) long local3 = System.currentTimeMillis();
			@Pc(7) char[] local7 = arg0.toLowerCase().toCharArray();
			method403(local7);
			method413(local7);
			method408(local7);
			method409(local7);
			method422(local7);
			for (@Pc(38) int local38 = 0; local38 < aStringArray11.length; local38++) {
				@Pc(42) int local42 = -1;
				while ((local42 = arg0.indexOf(aStringArray11[local38], local42 + 1)) != -1) {
					@Pc(49) char[] local49 = aStringArray11[local38].toCharArray();
					for (@Pc(51) int local51 = 0; local51 < local49.length; local51++) {
						local7[local51 + local42] = local49[local51];
					}
				}
			}
			method406(local7, arg0.toCharArray());
			method407(local7, 728);
			@Pc(93) long local93 = System.currentTimeMillis();
			return (new String(local7)).trim();
		} catch (@Pc(100) RuntimeException local100) {
			signlink.reporterror("14302, " + false + ", " + arg0 + ", " + local100.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "([C[CI)V")
	private static void method406(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
				if (arg0[local3] != '*' && method430(arg1[local3])) {
					arg0[local3] = arg1[local3];
				}
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("11780, " + arg0 + ", " + arg1 + ", " + 9 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "([CI)V")
	private static void method407(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				@Pc(11) char local11 = arg0[local5];
				if (!method427(local11)) {
					local3 = true;
				} else if (local3) {
					if (method429(local11)) {
						local3 = false;
					}
				} else if (method430(local11)) {
					arg0[local5] = (char) (local11 + 'a' - 65);
				}
			}
			@Pc(51) boolean local51 = false;
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("92663, " + arg0 + ", " + arg1 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "([CZ)V")
	private static void method408(@OriginalArg(0) char[] arg0) {
		try {
			for (@Pc(6) int local6 = 0; local6 < 2; local6++) {
				for (@Pc(13) int local13 = aCharArrayArray1.length - 1; local13 >= 0; local13--) {
					method417(aCharArrayArray1[local13], aByteArrayArrayArray8[local13], aByte34, arg0);
				}
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("85712, " + arg0 + ", " + false + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "([CI)V")
	private static void method409(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(5) char[] local5 = (char[]) arg0.clone();
			@Pc(20) char[] local20 = new char[] { '(', 'a', ')' };
			method417(local20, null, aByte34, local5);
			@Pc(29) char[] local29 = (char[]) arg0.clone();
			@Pc(44) char[] local44 = new char[] { 'd', 'o', 't' };
			method417(local44, null, aByte34, local29);
			for (@Pc(54) int local54 = aCharArrayArray2.length - 1; local54 >= 0; local54--) {
				method410(arg0, local5, local29, aCharArrayArray2[local54]);
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("94271, " + arg0 + ", " + -397 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z[C[C[C[C)V")
	private static void method410(@OriginalArg(1) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2, @OriginalArg(4) char[] arg3) {
		try {
			if (arg3.length <= arg0.length) {
				@Pc(22) int local22;
				for (@Pc(14) int local14 = 0; local14 <= arg0.length - arg3.length; local14 += local22) {
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
							if (local20 < arg3.length && (local57 = method419(local32, local30, arg3[local20], (byte) 6)) > 0) {
								local18 += local57;
								local20++;
							} else {
								if (local20 == 0) {
									break label58;
								}
								@Pc(78) int local78;
								if ((local78 = method419(local32, local30, arg3[local20 - 1], (byte) 6)) > 0) {
									local18 += local78;
									if (local20 == 1) {
										local22++;
									}
								} else {
									if (local20 >= arg3.length || !method425(local30)) {
										break label58;
									}
									local18++;
								}
							}
						}
					}
					if (local20 >= arg3.length) {
						@Pc(109) boolean local109 = false;
						@Pc(115) int local115 = method411(arg0, local14, arg1);
						@Pc(123) int local123 = method412(local18 - 1, arg2, arg0);
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
			signlink.reporterror("51981, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "([CII[C)I")
	private static int method411(@OriginalArg(0) char[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg1 == 0) {
				return 2;
			}
			for (@Pc(9) int local9 = arg1 - 1; local9 >= 0 && method425(arg0[local9]); local9--) {
				if (arg0[local9] == '@') {
					return 3;
				}
			}
			@Pc(29) int local29 = 0;
			for (@Pc(33) int local33 = arg1 - 1; local33 >= 0 && method425(arg2[local33]); local33--) {
				if (arg2[local33] == '*') {
					local29++;
				}
			}
			if (local29 >= 3) {
				return 4;
			} else if (method425(arg0[arg1 - 1])) {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("91185, " + arg0 + ", " + ", " + arg1 + ", " + arg2 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(II[C[C)I")
	private static int method412(@OriginalArg(1) int arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg0 + 1 == arg2.length) {
				return 2;
			}
			@Pc(13) int local13 = arg0 + 1;
			while (true) {
				if (local13 < arg2.length && method425(arg2[local13])) {
					if (arg2[local13] != '.' && arg2[local13] != ',') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(49) int local49 = 0;
				for (@Pc(53) int local53 = arg0 + 1; local53 < arg2.length && method425(arg1[local53]); local53++) {
					if (arg1[local53] == '*') {
						local49++;
					}
				}
				if (local49 >= 3) {
					return 4;
				}
				if (method425(arg2[arg0 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("75077, " + 395 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I[C)V")
	private static void method413(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(18) char[] local18 = new char[] { 'd', 'o', 't' };
			method417(local18, null, aByte34, local3);
			@Pc(36) char[] local36 = (char[]) arg0.clone();
			@Pc(59) char[] local59 = new char[] { 's', 'l', 'a', 's', 'h' };
			method417(local59, null, aByte34, local36);
			for (@Pc(66) int local66 = 0; local66 < aCharArrayArray3.length; local66++) {
				method414(local36, aCharArrayArray3[local66], local3, arg0, anIntArray196[local66]);
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("4252, " + 1454 + ", " + arg0 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "([C[CI[C[CI)V")
	private static void method414(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(3) char[] arg2, @OriginalArg(4) char[] arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg1.length <= arg3.length) {
				@Pc(22) int local22;
				for (@Pc(14) int local14 = 0; local14 <= arg3.length - arg1.length; local14 += local22) {
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
							if (local20 < arg1.length && (local57 = method419(local32, local30, arg1[local20], (byte) 6)) > 0) {
								local18 += local57;
								local20++;
							} else {
								if (local20 == 0) {
									break label120;
								}
								@Pc(78) int local78;
								if ((local78 = method419(local32, local30, arg1[local20 - 1], (byte) 6)) > 0) {
									local18 += local78;
									if (local20 == 1) {
										local22++;
									}
								} else {
									if (local20 >= arg1.length || !method425(local30)) {
										break label120;
									}
									local18++;
								}
							}
						}
					}
					if (local20 >= arg1.length) {
						@Pc(109) boolean local109 = false;
						@Pc(115) int local115 = method415(937, arg3, local14, arg2);
						@Pc(123) int local123 = method416(local18 - 1, arg0, arg3);
						if (arg4 == 1 && local115 > 0 && local123 > 0) {
							local109 = true;
						}
						if (arg4 == 2 && (local115 > 2 && local123 > 0 || local115 > 0 && local123 > 2)) {
							local109 = true;
						}
						if (arg4 == 3 && local115 > 0 && local123 > 2) {
							local109 = true;
						}
						@Pc(166) boolean local166;
						if (arg4 == 3 && local115 > 2 && local123 > 0) {
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
											if (arg2[local189] != '*') {
												break;
											}
											local173 = local189;
										} else if (arg2[local189] == '*') {
											local173 = local189;
											local185 = true;
										}
									}
								}
								local185 = false;
								for (local189 = local173 - 1; local189 >= 0; local189--) {
									if (local185) {
										if (method425(arg3[local189])) {
											break;
										}
										local173 = local189;
									} else if (!method425(arg3[local189])) {
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
											if (arg0[local189] != '*') {
												break;
											}
											local177 = local189;
										} else if (arg0[local189] == '*') {
											local177 = local189;
											local185 = true;
										}
									}
								}
								local185 = false;
								for (local189 = local177 + 1; local189 < arg3.length; local189++) {
									if (local185) {
										if (method425(arg3[local189])) {
											break;
										}
										local177 = local189;
									} else if (!method425(arg3[local189])) {
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
			signlink.reporterror("93986, " + arg0 + ", " + arg1 + ", " + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local346.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I[CI[C)I")
	private static int method415(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) char[] arg3) {
		try {
			if (arg2 == 0) {
				return 2;
			}
			@Pc(9) int local9 = arg2 - 1;
			while (true) {
				if (local9 >= 0 && method425(arg1[local9])) {
					if (arg1[local9] != ',' && arg1[local9] != '.') {
						local9--;
						continue;
					}
					return 3;
				}
				@Pc(34) int local34 = 0;
				@Pc(38) boolean local38 = false;
				for (@Pc(42) int local42 = arg2 - 1; local42 >= 0 && method425(arg3[local42]); local42--) {
					if (arg3[local42] == '*') {
						local34++;
					}
				}
				if (local34 >= 3) {
					return 4;
				}
				if (method425(arg1[arg2 - 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("81815, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZI[C[C)I")
	private static int method416(@OriginalArg(1) int arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg0 + 1 == arg2.length) {
				return 2;
			}
			@Pc(13) int local13 = arg0 + 1;
			while (true) {
				if (local13 < arg2.length && method425(arg2[local13])) {
					if (arg2[local13] != '\\' && arg2[local13] != '/') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(40) int local40 = 0;
				for (@Pc(44) int local44 = arg0 + 1; local44 < arg2.length && method425(arg1[local44]); local44++) {
					if (arg1[local44] == '*') {
						local40++;
					}
				}
				if (local40 >= 5) {
					return 4;
				}
				if (method425(arg2[arg0 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("9467, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "([C[[BB[C)V")
	private static void method417(@OriginalArg(0) char[] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) char[] arg3) {
		try {
			if (arg0.length <= arg3.length) {
				@Pc(21) int local21;
				for (@Pc(11) int local11 = 0; local11 <= arg3.length - arg0.length; local11 += local21) {
					@Pc(15) int local15 = local11;
					@Pc(17) int local17 = 0;
					@Pc(19) int local19 = 0;
					local21 = 1;
					@Pc(23) boolean local23 = false;
					@Pc(31) char var11;
					@Pc(33) char var12;
					label136: while (true) {
						while (true) {
							if (local15 >= arg3.length) {
								break label136;
							}
							var11 = arg3[local15];
							var12 = '\u0000';
							if (local15 + 1 < arg3.length) {
								var12 = arg3[local15 + 1];
							}
							@Pc(58) int local58;
							if (local17 < arg0.length && (local58 = method420(var12, var11, arg0[local17])) > 0) {
								local15 += local58;
								local17++;
							} else {
								if (local17 == 0) {
									break label136;
								}
								@Pc(79) int local79;
								if ((local79 = method420(var12, var11, arg0[local17 - 1])) > 0) {
									local15 += local79;
									if (local17 == 1) {
										local21++;
									}
								} else {
									if (local17 >= arg0.length || !method426(var11)) {
										break label136;
									}
									if (method425(var11) && var11 != '\'') {
										local23 = true;
									}
									local15++;
									local19++;
									if (local19 * 100 / (local15 - local11) > 90) {
										break label136;
									}
								}
							}
						}
					}
					if (local17 >= arg0.length) {
						@Pc(130) boolean local130 = true;
						if (local23) {
							@Pc(176) boolean local176 = false;
							@Pc(178) boolean local178 = false;
							if (local11 - 1 < 0 || method425(arg3[local11 - 1]) && arg3[local11 - 1] != '\'') {
								local176 = true;
							}
							if (local15 >= arg3.length || method425(arg3[local15]) && arg3[local15] != '\'') {
								local178 = true;
							}
							if (!local176 || !local178) {
								@Pc(222) boolean local222 = false;
								@Pc(226) int local226 = local11 - 2;
								if (local176) {
									local226 = local11;
								}
								while (!local222 && local226 < local15) {
									if (local226 >= 0 && (!method425(arg3[local226]) || arg3[local226] == '\'')) {
										@Pc(248) char[] local248 = new char[3];
										@Pc(250) int local250;
										for (local250 = 0; local250 < 3 && local226 + local250 < arg3.length && (!method425(arg3[local226 + local250]) || arg3[local226 + local250] == '\''); local250++) {
											local248[local250] = arg3[local226 + local250];
										}
										@Pc(288) boolean local288 = true;
										if (local250 == 0) {
											local288 = false;
										}
										if (local250 < 3 && local226 - 1 >= 0 && (!method425(arg3[local226 - 1]) || arg3[local226 - 1] == '\'')) {
											local288 = false;
										}
										if (local288 && !method431(local248)) {
											local222 = true;
										}
									}
									local226++;
								}
								if (!local222) {
									local130 = false;
								}
							}
						} else {
							var11 = ' ';
							if (local11 - 1 >= 0) {
								var11 = arg3[local11 - 1];
							}
							var12 = ' ';
							if (local15 < arg3.length) {
								var12 = arg3[local15];
							}
							@Pc(158) byte local158 = method421(var11);
							@Pc(162) byte local162 = method421(var12);
							if (arg1 != null && method418(arg1, local158, local162)) {
								local130 = false;
							}
						}
						if (local130) {
							@Pc(338) int local338 = 0;
							for (@Pc(340) int local340 = local11; local340 < local15; local340++) {
								if (method428(arg3[local340])) {
									local338++;
								}
							}
							if (local338 * 100 / (local15 - local11) <= 50) {
								for (@Pc(364) int local364 = local11; local364 < local15; local364++) {
									arg3[local364] = '*';
								}
							}
						}
					}
				}
				if (arg2 == aByte35) {
					@Pc(390) boolean local390 = false;
				} else {
					aBoolean155 = !aBoolean155;
				}
			}
		} catch (@Pc(399) RuntimeException local399) {
			signlink.reporterror("71392, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local399.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z[[BBB)Z")
	private static boolean method418(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) byte arg2) {
		try {
			@Pc(1) int local1 = 0;
			if (arg0[0][0] == arg1 && arg0[0][1] == arg2) {
				return true;
			}
			@Pc(28) int local28 = arg0.length - 1;
			if (arg0[local28][0] == arg1 && arg0[local28][1] == arg2) {
				return true;
			}
			do {
				@Pc(50) int local50 = (local1 + local28) / 2;
				if (arg0[local50][0] == arg1 && arg0[local50][1] == arg2) {
					return true;
				}
				if (arg1 < arg0[local50][0] || arg1 == arg0[local50][0] && arg2 < arg0[local50][1]) {
					local28 = local50;
				} else {
					local1 = local50;
				}
			} while (local1 != local28 && local1 + 1 != local28);
			return false;
		} catch (@Pc(104) RuntimeException local104) {
			signlink.reporterror("68593, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local104.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(CCCB)I")
	private static int method419(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(2) char arg2, @OriginalArg(3) byte arg3) {
		try {
			@Pc(4) boolean local4 = false;
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
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("67763, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(CCBC)I")
	private static int method420(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(3) char arg2) {
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
					if (arg1 == '1' && arg0 == '3') {
						return 2;
					}
					return 0;
				}
				if (arg2 == 'c') {
					if (arg1 != '(' && arg1 != '<' && arg1 != '{' && arg1 != '[') {
						return 0;
					}
					return 1;
				}
				if (arg2 == 'd') {
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
					if (arg1 == '7') {
						return 1;
					}
					return 0;
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
					} else if (arg1 == '(' && arg0 == ')' || arg1 == '{' && arg0 == '}' || arg1 == '[' && arg0 == ']') {
						return 2;
					} else {
						return 0;
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
		} catch (@Pc(479) RuntimeException local479) {
			signlink.reporterror("55296, " + arg0 + ", " + arg1 + ", " + -9 + ", " + arg2 + ", " + local479.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(CZ)B")
	private static byte method421(@OriginalArg(0) char arg0) {
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
			signlink.reporterror("59723, " + arg0 + ", " + true + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(I[C)V")
	private static void method422(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			@Pc(9) int local9 = 0;
			while (true) {
				do {
					@Pc(109) int local109;
					if ((local109 = method423(arg0, local5)) == -1) {
						return;
					}
					@Pc(14) boolean local14 = false;
					for (@Pc(16) int local16 = local5; local16 >= 0 && local16 < local109 && !local14; local16++) {
						if (!method425(arg0[local16]) && !method426(arg0[local16])) {
							local14 = true;
						}
					}
					if (local14) {
						local7 = 0;
					}
					if (local7 == 0) {
						local9 = local109;
					}
					local5 = method424(local109, arg0);
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
			signlink.reporterror("32119, " + ", " + arg0 + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z[CI)I")
	private static int method423(@OriginalArg(1) char[] arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(1) int local1 = arg1; local1 < arg0.length && local1 >= 0; local1++) {
				if (arg0[local1] >= '0' && arg0[local1] <= '9') {
					return local1;
				}
			}
			return -1;
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("27722, " + false + ", " + arg0 + ", " + arg1 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I[CZ)I")
	private static int method424(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1) {
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
			signlink.reporterror("88929, " + arg0 + ", " + arg1 + ", " + false + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZC)Z")
	private static boolean method425(@OriginalArg(1) char arg0) {
		try {
			return !method427(arg0) && !method428(arg0);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("27100, " + true + ", " + arg0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IC)Z")
	private static boolean method426(@OriginalArg(1) char arg0) {
		try {
			if (arg0 >= 'a' && arg0 <= 'z') {
				return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
			} else {
				return true;
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("18687, " + 3 + ", " + arg0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(IC)Z")
	private static boolean method427(@OriginalArg(1) char arg0) {
		try {
			if (anInt618 != 22945) {
				throw new NullPointerException();
			}
			return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("98495, " + 22945 + ", " + arg0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(CB)Z")
	private static boolean method428(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= '0' && arg0 <= '9';
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("55085, " + arg0 + ", " + 7 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(CI)Z")
	private static boolean method429(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z';
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("55465, " + arg0 + ", " + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(ZC)Z")
	private static boolean method430(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("57108, " + true + ", " + arg0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "([CI)Z")
	private static boolean method431(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				if (!method428(arg0[local5]) && arg0[local5] != '\u0000') {
					local3 = false;
				}
			}
			if (local3) {
				return true;
			}
			@Pc(32) int local32 = method432(arg0);
			@Pc(34) int local34 = 0;
			@Pc(39) int local39 = anIntArray195.length - 1;
			if (local32 == anIntArray195[0] || local32 == anIntArray195[local39]) {
				return true;
			}
			do {
				@Pc(65) int local65 = (local34 + local39) / 2;
				if (local32 == anIntArray195[local65]) {
					return true;
				}
				if (local32 < anIntArray195[local65]) {
					local39 = local65;
				} else {
					local34 = local65;
				}
			} while (local34 != local39 && local34 + 1 != local39);
			return false;
		} catch (@Pc(94) RuntimeException local94) {
			signlink.reporterror("37624, " + arg0 + ", " + 837 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "([CI)I")
	private static int method432(@OriginalArg(0) char[] arg0) {
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
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("42580, " + arg0 + ", " + -965 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}
}
