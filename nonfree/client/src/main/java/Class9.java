import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!DHIKSAEW")
public final class Class9 {

	@OriginalMember(owner = "client!DHIKSAEW", name = "j", descriptor = "Z")
	private static boolean aBoolean47;

	@OriginalMember(owner = "client!DHIKSAEW", name = "k", descriptor = "[I")
	private static int[] anIntArray24;

	@OriginalMember(owner = "client!DHIKSAEW", name = "l", descriptor = "[[C")
	private static char[][] aCharArrayArray1;

	@OriginalMember(owner = "client!DHIKSAEW", name = "m", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!DHIKSAEW", name = "n", descriptor = "[[C")
	private static char[][] aCharArrayArray2;

	@OriginalMember(owner = "client!DHIKSAEW", name = "o", descriptor = "[[C")
	private static char[][] aCharArrayArray3;

	@OriginalMember(owner = "client!DHIKSAEW", name = "p", descriptor = "[I")
	private static int[] anIntArray25;

	@OriginalMember(owner = "client!DHIKSAEW", name = "a", descriptor = "I")
	private static int anInt201 = 1;

	@OriginalMember(owner = "client!DHIKSAEW", name = "b", descriptor = "I")
	private static int anInt202 = 48698;

	@OriginalMember(owner = "client!DHIKSAEW", name = "c", descriptor = "Z")
	private static boolean aBoolean45 = true;

	@OriginalMember(owner = "client!DHIKSAEW", name = "d", descriptor = "I")
	private static int anInt203 = 133;

	@OriginalMember(owner = "client!DHIKSAEW", name = "e", descriptor = "I")
	private static int anInt204 = -934;

	@OriginalMember(owner = "client!DHIKSAEW", name = "f", descriptor = "Z")
	private static boolean aBoolean46 = true;

	@OriginalMember(owner = "client!DHIKSAEW", name = "g", descriptor = "I")
	private static int anInt205 = 6;

	@OriginalMember(owner = "client!DHIKSAEW", name = "h", descriptor = "I")
	private static int anInt206 = 829;

	@OriginalMember(owner = "client!DHIKSAEW", name = "i", descriptor = "I")
	private static int anInt207 = 890;

	@OriginalMember(owner = "client!DHIKSAEW", name = "q", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray2 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

	@OriginalMember(owner = "client!DHIKSAEW", name = "a", descriptor = "(Lclient!TKEGJSFV;)V")
	public static void method88(@OriginalArg(0) Class38 arg0) {
		@Pc(10) Class4_Sub1_Sub3 local10 = new Class4_Sub1_Sub3(arg0.method514("fragmentsenc.txt", null), false);
		@Pc(19) Class4_Sub1_Sub3 local19 = new Class4_Sub1_Sub3(arg0.method514("badenc.txt", null), false);
		@Pc(28) Class4_Sub1_Sub3 local28 = new Class4_Sub1_Sub3(arg0.method514("domainenc.txt", null), false);
		@Pc(37) Class4_Sub1_Sub3 local37 = new Class4_Sub1_Sub3(arg0.method514("tldlist.txt", null), false);
		method89(local10, local19, local28, local37);
	}

	@OriginalMember(owner = "client!DHIKSAEW", name = "a", descriptor = "(Lclient!EGCCHUZS;Lclient!EGCCHUZS;Lclient!EGCCHUZS;Lclient!EGCCHUZS;)V")
	private static void method89(@OriginalArg(0) Class4_Sub1_Sub3 arg0, @OriginalArg(1) Class4_Sub1_Sub3 arg1, @OriginalArg(2) Class4_Sub1_Sub3 arg2, @OriginalArg(3) Class4_Sub1_Sub3 arg3) {
		method91(arg1);
		method92(arg2);
		method93(arg0, 9);
		method90(arg3);
	}

	@OriginalMember(owner = "client!DHIKSAEW", name = "a", descriptor = "(ILclient!EGCCHUZS;)V")
	private static void method90(@OriginalArg(1) Class4_Sub1_Sub3 arg0) {
		try {
			@Pc(8) int local8 = arg0.method172();
			aCharArrayArray3 = new char[local8][];
			anIntArray25 = new int[local8];
			for (@Pc(16) int local16 = 0; local16 < local8; local16++) {
				anIntArray25[local16] = arg0.method167();
				@Pc(27) char[] local27 = new char[arg0.method167()];
				for (@Pc(29) int local29 = 0; local29 < local27.length; local29++) {
					local27[local29] = (char) arg0.method167();
				}
				aCharArrayArray3[local16] = local27;
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("76304, " + 3 + ", " + arg0 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DHIKSAEW", name = "a", descriptor = "(BLclient!EGCCHUZS;)V")
	private static void method91(@OriginalArg(1) Class4_Sub1_Sub3 arg0) {
		try {
			@Pc(2) int local2 = arg0.method172();
			aCharArrayArray1 = new char[local2][];
			aByteArrayArrayArray1 = new byte[local2][][];
			method94(arg0, aByteArrayArrayArray1, aCharArrayArray1);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("14387, " + 48 + ", " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DHIKSAEW", name = "a", descriptor = "(Lclient!EGCCHUZS;I)V")
	private static void method92(@OriginalArg(0) Class4_Sub1_Sub3 arg0) {
		try {
			@Pc(5) int local5 = arg0.method172();
			aCharArrayArray2 = new char[local5][];
			method95(aCharArrayArray2, arg0);
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("69828, " + arg0 + ", " + -718 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DHIKSAEW", name = "b", descriptor = "(Lclient!EGCCHUZS;I)V")
	private static void method93(@OriginalArg(0) Class4_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			anIntArray24 = new int[arg0.method172()];
			for (@Pc(5) int local5 = 0; local5 < anIntArray24.length; local5++) {
				anIntArray24[local5] = arg0.method169();
			}
			@Pc(21) boolean local21 = true;
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("73810, " + arg0 + ", " + arg1 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DHIKSAEW", name = "a", descriptor = "(Lclient!EGCCHUZS;[[[BI[[C)V")
	private static void method94(@OriginalArg(0) Class4_Sub1_Sub3 arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(3) char[][] arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < arg2.length; local3++) {
				@Pc(9) char[] local9 = new char[arg0.method167()];
				for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
					local9[local11] = (char) arg0.method167();
				}
				arg2[local3] = local9;
				@Pc(33) byte[][] local33 = new byte[arg0.method167()][2];
				for (@Pc(35) int local35 = 0; local35 < local33.length; local35++) {
					local33[local35][0] = (byte) arg0.method167();
					local33[local35][1] = (byte) arg0.method167();
				}
				if (local33.length > 0) {
					arg1[local3] = local33;
				}
			}
			if (anInt202 != 48698) {
				aBoolean47 = !aBoolean47;
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("59364, " + arg0 + ", " + arg1 + ", " + 48698 + ", " + arg2 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DHIKSAEW", name = "a", descriptor = "([[CZLclient!EGCCHUZS;)V")
	private static void method95(@OriginalArg(0) char[][] arg0, @OriginalArg(2) Class4_Sub1_Sub3 arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
				@Pc(9) char[] local9 = new char[arg1.method167()];
				for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
					local9[local11] = (char) arg1.method167();
				}
				arg0[local3] = local9;
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("96830, " + arg0 + ", " + false + ", " + arg1 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DHIKSAEW", name = "a", descriptor = "([CZ)V")
	private static void method96(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(6) int local6 = 0;
			for (@Pc(8) int local8 = 0; local8 < arg0.length; local8++) {
				if (method97(arg0[local8])) {
					arg0[local6] = arg0[local8];
				} else {
					arg0[local6] = ' ';
				}
				if (local6 == 0 || arg0[local6] != ' ' || arg0[local6 - 1] != ' ') {
					local6++;
				}
			}
			for (@Pc(50) int local50 = local6; local50 < arg0.length; local50++) {
				arg0[local50] = ' ';
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("62506, " + arg0 + ", " + true + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DHIKSAEW", name = "a", descriptor = "(CB)Z")
	private static boolean method97(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= ' ' && arg0 <= '\u007f' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("58452, " + arg0 + ", " + 122 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DHIKSAEW", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method98(@OriginalArg(0) String arg0) {
		try {
			@Pc(3) long local3 = System.currentTimeMillis();
			@Pc(6) char[] local6 = arg0.toCharArray();
			method96(local6);
			@Pc(21) String local21 = (new String(local6)).trim();
			@Pc(25) char[] local25 = local21.toLowerCase().toCharArray();
			@Pc(28) String local28 = local21.toLowerCase();
			method106(local25);
			method101(local25);
			method102(local25, anInt203);
			method115(local25, 890);
			for (@Pc(42) int local42 = 0; local42 < aStringArray2.length; local42++) {
				@Pc(52) int local52 = -1;
				while ((local52 = local28.indexOf(aStringArray2[local42], local52 + 1)) != -1) {
					@Pc(59) char[] local59 = aStringArray2[local42].toCharArray();
					for (@Pc(61) int local61 = 0; local61 < local59.length; local61++) {
						local25[local61 + local52] = local59[local61];
					}
				}
			}
			method99(local21.toCharArray(), local25);
			method100(local25, (byte) 9);
			@Pc(103) long local103 = System.currentTimeMillis();
			return (new String(local25)).trim();
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("37492, " + arg0 + ", " + 624 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DHIKSAEW", name = "a", descriptor = "([CI[C)V")
	private static void method99(@OriginalArg(0) char[] arg0, @OriginalArg(2) char[] arg1) {
		try {
			for (@Pc(4) int local4 = 0; local4 < arg0.length; local4++) {
				if (arg1[local4] != '*' && method123(arg0[local4])) {
					arg1[local4] = arg0[local4];
				}
			}
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("85029, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DHIKSAEW", name = "a", descriptor = "([CB)V")
	private static void method100(@OriginalArg(0) char[] arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(3) boolean local3 = true;
			@Pc(8) boolean local8 = false;
			for (@Pc(19) int local19 = 0; local19 < arg0.length; local19++) {
				@Pc(25) char local25 = arg0[local19];
				if (!method120(local25)) {
					local3 = true;
				} else if (local3) {
					if (method122(local25)) {
						local3 = false;
					}
				} else if (method123(local25)) {
					arg0[local19] = (char) (local25 + 'a' - 65);
				}
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("87364, " + arg0 + ", " + arg1 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DHIKSAEW", name = "a", descriptor = "([CI)V")
	private static void method101(@OriginalArg(0) char[] arg0) {
		try {
			for (@Pc(8) int local8 = 0; local8 < 2; local8++) {
				for (@Pc(15) int local15 = aCharArrayArray1.length - 1; local15 >= 0; local15--) {
					method110(aCharArrayArray1[local15], aByteArrayArrayArray1[local15], arg0);
				}
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("50610, " + arg0 + ", " + 9742 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DHIKSAEW", name = "b", descriptor = "([CI)V")
	private static void method102(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(18) char[] local18 = new char[] { '(', 'a', ')' };
			method110(local18, null, local3);
			if (arg1 > 0) {
				@Pc(30) char[] local30 = (char[]) arg0.clone();
				@Pc(45) char[] local45 = new char[] { 'd', 'o', 't' };
				method110(local45, null, local30);
				for (@Pc(55) int local55 = aCharArrayArray2.length - 1; local55 >= 0; local55--) {
					method103(aCharArrayArray2[local55], 712, local3, local30, arg0);
				}
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("14213, " + arg0 + ", " + arg1 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DHIKSAEW", name = "a", descriptor = "([CI[C[C[C)V")
	private static void method103(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) char[] arg3, @OriginalArg(4) char[] arg4) {
		try {
			if (arg0.length <= arg4.length) {
				@Pc(13) boolean local13 = false;
				@Pc(23) int local23;
				for (@Pc(15) int local15 = 0; local15 <= arg4.length - arg0.length; local15 += local23) {
					@Pc(19) int local19 = local15;
					@Pc(21) int local21 = 0;
					local23 = 1;
					label58: while (true) {
						while (true) {
							if (local19 >= arg4.length) {
								break label58;
							}
							@Pc(31) char local31 = arg4[local19];
							@Pc(33) char local33 = 0;
							if (local19 + 1 < arg4.length) {
								local33 = arg4[local19 + 1];
							}
							@Pc(58) int local58;
							if (local21 < arg0.length && (local58 = method112(local31, arg0[local21], aBoolean46, local33)) > 0) {
								local19 += local58;
								local21++;
							} else {
								if (local21 == 0) {
									break label58;
								}
								@Pc(79) int local79;
								if ((local79 = method112(local31, arg0[local21 - 1], aBoolean46, local33)) > 0) {
									local19 += local79;
									if (local21 == 1) {
										local23++;
									}
								} else {
									if (local21 >= arg0.length || !method118(local31)) {
										break label58;
									}
									local19++;
								}
							}
						}
					}
					if (local21 >= arg0.length) {
						@Pc(110) boolean local110 = false;
						@Pc(116) int local116 = method104(local15, arg2, arg4);
						@Pc(124) int local124 = method105(local19 - 1, anInt204, arg3, arg4);
						if (local116 > 2 || local124 > 2) {
							local110 = true;
						}
						if (local110) {
							for (@Pc(136) int local136 = local15; local136 < local19; local136++) {
								arg4[local136] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("74877, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DHIKSAEW", name = "a", descriptor = "(II[C[C)I")
	private static int method104(@OriginalArg(0) int arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg0 == 0) {
				return 2;
			}
			for (@Pc(17) int local17 = arg0 - 1; local17 >= 0 && method118(arg2[local17]); local17--) {
				if (arg2[local17] == '@') {
					return 3;
				}
			}
			@Pc(37) int local37 = 0;
			for (@Pc(41) int local41 = arg0 - 1; local41 >= 0 && method118(arg1[local41]); local41--) {
				if (arg1[local41] == '*') {
					local37++;
				}
			}
			if (local37 >= 3) {
				return 4;
			} else if (method118(arg2[arg0 - 1])) {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("25190, " + arg0 + ", " + 79 + ", " + arg1 + ", " + arg2 + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DHIKSAEW", name = "b", descriptor = "(II[C[C)I")
	private static int method105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) char[] arg3) {
		try {
			if (arg0 + 1 == arg3.length) {
				return 2;
			}
			@Pc(13) int local13 = arg0 + 1;
			while (true) {
				if (local13 < arg3.length && method118(arg3[local13])) {
					if (arg3[local13] != '.' && arg3[local13] != ',') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(40) int local40 = 0;
				if (arg1 >= 0) {
					return 1;
				}
				for (@Pc(48) int local48 = arg0 + 1; local48 < arg3.length && method118(arg2[local48]); local48++) {
					if (arg2[local48] == '*') {
						local40++;
					}
				}
				if (local40 >= 3) {
					return 4;
				}
				if (method118(arg3[arg0 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("20461, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DHIKSAEW", name = "c", descriptor = "([CI)V")
	private static void method106(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(18) char[] local18 = new char[] { 'd', 'o', 't' };
			method110(local18, null, local3);
			@Pc(31) char[] local31 = (char[]) arg0.clone();
			@Pc(54) char[] local54 = new char[] { 's', 'l', 'a', 's', 'h' };
			method110(local54, null, local31);
			for (@Pc(61) int local61 = 0; local61 < aCharArrayArray3.length; local61++) {
				method107(anIntArray25[local61], aCharArrayArray3[local61], local3, (byte) 9, local31, arg0);
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("27668, " + arg0 + ", " + 0 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DHIKSAEW", name = "a", descriptor = "(I[C[CB[C[C)V")
	private static void method107(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) char[] arg4, @OriginalArg(5) char[] arg5) {
		try {
			@Pc(6) boolean local6 = false;
			if (arg1.length <= arg5.length) {
				@Pc(27) int local27;
				for (@Pc(19) int local19 = 0; local19 <= arg5.length - arg1.length; local19 += local27) {
					@Pc(23) int local23 = local19;
					@Pc(25) int local25 = 0;
					local27 = 1;
					label120: while (true) {
						while (true) {
							if (local23 >= arg5.length) {
								break label120;
							}
							@Pc(35) char local35 = arg5[local23];
							@Pc(37) char local37 = 0;
							if (local23 + 1 < arg5.length) {
								local37 = arg5[local23 + 1];
							}
							@Pc(62) int local62;
							if (local25 < arg1.length && (local62 = method112(local35, arg1[local25], aBoolean46, local37)) > 0) {
								local23 += local62;
								local25++;
							} else {
								if (local25 == 0) {
									break label120;
								}
								@Pc(83) int local83;
								if ((local83 = method112(local35, arg1[local25 - 1], aBoolean46, local37)) > 0) {
									local23 += local83;
									if (local25 == 1) {
										local27++;
									}
								} else {
									if (local25 >= arg1.length || !method118(local35)) {
										break label120;
									}
									local23++;
								}
							}
						}
					}
					if (local25 >= arg1.length) {
						@Pc(114) boolean local114 = false;
						@Pc(120) int local120 = method108(arg5, local19, arg2);
						@Pc(128) int local128 = method109(arg4, local23 - 1, arg5);
						if (arg0 == 1 && local120 > 0 && local128 > 0) {
							local114 = true;
						}
						if (arg0 == 2 && (local120 > 2 && local128 > 0 || local120 > 0 && local128 > 2)) {
							local114 = true;
						}
						if (arg0 == 3 && local120 > 0 && local128 > 2) {
							local114 = true;
						}
						@Pc(171) boolean local171;
						if (arg0 == 3 && local120 > 2 && local128 > 0) {
							local171 = true;
						} else {
							local171 = false;
						}
						if (local114) {
							@Pc(178) int local178 = local19;
							@Pc(182) int local182 = local23 - 1;
							@Pc(190) boolean local190;
							@Pc(194) int local194;
							if (local120 > 2) {
								if (local120 == 4) {
									local190 = false;
									for (local194 = local19 - 1; local194 >= 0; local194--) {
										if (local190) {
											if (arg2[local194] != '*') {
												break;
											}
											local178 = local194;
										} else if (arg2[local194] == '*') {
											local178 = local194;
											local190 = true;
										}
									}
								}
								local190 = false;
								for (local194 = local178 - 1; local194 >= 0; local194--) {
									if (local190) {
										if (method118(arg5[local194])) {
											break;
										}
										local178 = local194;
									} else if (!method118(arg5[local194])) {
										local190 = true;
										local178 = local194;
									}
								}
							}
							if (local128 > 2) {
								if (local128 == 4) {
									local190 = false;
									for (local194 = local182 + 1; local194 < arg5.length; local194++) {
										if (local190) {
											if (arg4[local194] != '*') {
												break;
											}
											local182 = local194;
										} else if (arg4[local194] == '*') {
											local182 = local194;
											local190 = true;
										}
									}
								}
								local190 = false;
								for (local194 = local182 + 1; local194 < arg5.length; local194++) {
									if (local190) {
										if (method118(arg5[local194])) {
											break;
										}
										local182 = local194;
									} else if (!method118(arg5[local194])) {
										local190 = true;
										local182 = local194;
									}
								}
							}
							for (@Pc(328) int local328 = local178; local328 <= local182; local328++) {
								arg5[local328] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(351) RuntimeException local351) {
			signlink.reporterror("83846, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local351.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DHIKSAEW", name = "a", descriptor = "([CI[CI)I")
	private static int method108(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) char[] arg2) {
		try {
			if (arg1 == 0) {
				return 2;
			}
			@Pc(9) int local9 = arg1 - 1;
			while (true) {
				if (local9 >= 0 && method118(arg0[local9])) {
					if (arg0[local9] != ',' && arg0[local9] != '.') {
						local9--;
						continue;
					}
					return 3;
				}
				@Pc(34) int local34 = 0;
				for (@Pc(38) int local38 = arg1 - 1; local38 >= 0 && method118(arg2[local38]); local38--) {
					if (arg2[local38] == '*') {
						local34++;
					}
				}
				if (local34 >= 3) {
					return 4;
				}
				if (method118(arg0[arg1 - 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("41742, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -335 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DHIKSAEW", name = "a", descriptor = "([CI[CB)I")
	private static int method109(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) char[] arg2) {
		try {
			if (arg1 + 1 == arg2.length) {
				return 2;
			}
			@Pc(13) int local13 = arg1 + 1;
			while (true) {
				if (local13 < arg2.length && method118(arg2[local13])) {
					if (arg2[local13] != '\\' && arg2[local13] != '/') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(40) int local40 = 0;
				for (@Pc(49) int local49 = arg1 + 1; local49 < arg2.length && method118(arg0[local49]); local49++) {
					if (arg0[local49] == '*') {
						local40++;
					}
				}
				if (local40 >= 5) {
					return 4;
				}
				if (method118(arg2[arg1 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("59386, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 7 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DHIKSAEW", name = "a", descriptor = "(I[C[[B[C)V")
	private static void method110(@OriginalArg(1) char[] arg0, @OriginalArg(2) byte[][] arg1, @OriginalArg(3) char[] arg2) {
		try {
			if (arg0.length <= arg2.length) {
				@Pc(29) int local29;
				for (@Pc(19) int local19 = 0; local19 <= arg2.length - arg0.length; local19 += local29) {
					@Pc(23) int local23 = local19;
					@Pc(25) int local25 = 0;
					@Pc(27) int local27 = 0;
					local29 = 1;
					@Pc(31) boolean local31 = false;
					@Pc(33) boolean local33 = false;
					@Pc(35) boolean local35 = false;
					@Pc(43) char var12;
					@Pc(45) char var13;
					label164: while (true) {
						while (true) {
							if (local23 >= arg2.length || local33 && local35) {
								break label164;
							}
							var12 = arg2[local23];
							var13 = '\u0000';
							if (local23 + 1 < arg2.length) {
								var13 = arg2[local23 + 1];
							}
							@Pc(70) int local70;
							if (local25 < arg0.length && (local70 = method113(arg0[local25], var13, var12)) > 0) {
								if (local70 == 1 && method121(var12)) {
									local33 = true;
								}
								if (local70 == 2 && (method121(var12) || method121(var13))) {
									local33 = true;
								}
								local23 += local70;
								local25++;
							} else {
								if (local25 == 0) {
									break label164;
								}
								@Pc(113) int local113;
								if ((local113 = method113(arg0[local25 - 1], var13, var12)) > 0) {
									local23 += local113;
									if (local25 == 1) {
										local29++;
									}
								} else {
									if (local25 >= arg0.length || !method119(var12)) {
										break label164;
									}
									if (method118(var12) && var12 != '\'') {
										local31 = true;
									}
									if (method121(var12)) {
										local35 = true;
									}
									local23++;
									local27++;
									if (local27 * 100 / (local23 - local19) > 90) {
										break label164;
									}
								}
							}
						}
					}
					if (local25 >= arg0.length && (!local33 || !local35)) {
						@Pc(178) boolean local178 = true;
						@Pc(274) int local274;
						if (local31) {
							@Pc(224) boolean local224 = false;
							@Pc(226) boolean local226 = false;
							if (local19 - 1 < 0 || method118(arg2[local19 - 1]) && arg2[local19 - 1] != '\'') {
								local224 = true;
							}
							if (local23 >= arg2.length || method118(arg2[local23]) && arg2[local23] != '\'') {
								local226 = true;
							}
							if (!local224 || !local226) {
								@Pc(270) boolean local270 = false;
								local274 = local19 - 2;
								if (local224) {
									local274 = local19;
								}
								while (!local270 && local274 < local23) {
									if (local274 >= 0 && (!method118(arg2[local274]) || arg2[local274] == '\'')) {
										@Pc(296) char[] local296 = new char[3];
										@Pc(298) int local298;
										for (local298 = 0; local298 < 3 && local274 + local298 < arg2.length && (!method118(arg2[local274 + local298]) || arg2[local274 + local298] == '\''); local298++) {
											local296[local298] = arg2[local274 + local298];
										}
										@Pc(336) boolean local336 = true;
										if (local298 == 0) {
											local336 = false;
										}
										if (local298 < 3 && local274 - 1 >= 0 && (!method118(arg2[local274 - 1]) || arg2[local274 - 1] == '\'')) {
											local336 = false;
										}
										if (local336 && !method124(local296)) {
											local270 = true;
										}
									}
									local274++;
								}
								if (!local270) {
									local178 = false;
								}
							}
						} else {
							var12 = ' ';
							if (local19 - 1 >= 0) {
								var12 = arg2[local19 - 1];
							}
							var13 = ' ';
							if (local23 < arg2.length) {
								var13 = arg2[local23];
							}
							@Pc(206) byte local206 = method114(var12);
							@Pc(210) byte local210 = method114(var13);
							if (arg1 != null && method111(arg1, local206, local210)) {
								local178 = false;
							}
						}
						if (local178) {
							@Pc(386) int local386 = 0;
							@Pc(388) int local388 = 0;
							@Pc(390) int local390 = -1;
							for (local274 = local19; local274 < local23; local274++) {
								if (method121(arg2[local274])) {
									local386++;
								} else if (method120(arg2[local274])) {
									local388++;
									local390 = local274;
								}
							}
							if (local390 > -1) {
								local386 -= local23 - local390 - 1;
							}
							if (local386 <= local388) {
								for (@Pc(432) int local432 = local19; local432 < local23; local432++) {
									arg2[local432] = '*';
								}
							} else {
								local29 = 1;
							}
						}
					}
				}
			}
		} catch (@Pc(459) RuntimeException local459) {
			signlink.reporterror("62813, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local459.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DHIKSAEW", name = "a", descriptor = "([[BBIB)Z")
	private static boolean method111(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte arg1, @OriginalArg(3) byte arg2) {
		try {
			@Pc(1) int local1 = 0;
			if (arg0[0][0] == arg1 && arg0[0][1] == arg2) {
				return true;
			}
			@Pc(22) int local22 = arg0.length - 1;
			if (arg0[local22][0] == arg1 && arg0[local22][1] == arg2) {
				return true;
			}
			do {
				@Pc(51) int local51 = (local1 + local22) / 2;
				if (arg0[local51][0] == arg1 && arg0[local51][1] == arg2) {
					return true;
				}
				if (arg1 < arg0[local51][0] || arg1 == arg0[local51][0] && arg2 < arg0[local51][1]) {
					local22 = local51;
				} else {
					local1 = local51;
				}
			} while (local1 != local22 && local1 + 1 != local22);
			return false;
		} catch (@Pc(105) RuntimeException local105) {
			signlink.reporterror("3060, " + arg0 + ", " + arg1 + ", " + 5905 + ", " + arg2 + ", " + local105.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DHIKSAEW", name = "a", descriptor = "(CCZC)I")
	private static int method112(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) char arg3) {
		try {
			if (!arg2) {
				for (@Pc(3) int local3 = 1; local3 > 0; local3++) {
				}
			}
			if (arg1 == arg0) {
				return 1;
			} else if (arg1 == 'o' && arg0 == '0') {
				return 1;
			} else if (arg1 == 'o' && arg0 == '(' && arg3 == ')') {
				return 2;
			} else if (arg1 == 'c' && (arg0 == '(' || arg0 == '<' || arg0 == '[')) {
				return 1;
			} else if (arg1 == 'e' && arg0 == '€') {
				return 1;
			} else if (arg1 == 's' && arg0 == '$') {
				return 1;
			} else if (arg1 == 'l' && arg0 == 'i') {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("41539, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DHIKSAEW", name = "a", descriptor = "(CZCC)I")
	private static int method113(@OriginalArg(0) char arg0, @OriginalArg(2) char arg1, @OriginalArg(3) char arg2) {
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
		} catch (@Pc(512) RuntimeException local512) {
			signlink.reporterror("74368, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + local512.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DHIKSAEW", name = "a", descriptor = "(IC)B")
	private static byte method114(@OriginalArg(1) char arg0) {
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
			signlink.reporterror("36263, " + 829 + ", " + arg0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DHIKSAEW", name = "d", descriptor = "([CI)V")
	private static void method115(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			@Pc(11) boolean local11 = false;
			@Pc(13) int local13 = 0;
			while (true) {
				do {
					@Pc(112) int local112;
					if ((local112 = method116(local5, arg0)) == -1) {
						return;
					}
					@Pc(17) boolean local17 = false;
					for (@Pc(19) int local19 = local5; local19 >= 0 && local19 < local112 && !local17; local19++) {
						if (!method118(arg0[local19]) && !method119(arg0[local19])) {
							local17 = true;
						}
					}
					if (local17) {
						local7 = 0;
					}
					if (local7 == 0) {
						local13 = local112;
					}
					local5 = method117(arg0, local112);
					@Pc(58) int local58 = 0;
					for (@Pc(60) int local60 = local112; local60 < local5; local60++) {
						local58 = local58 * 10 + arg0[local60] - 48;
					}
					if (local58 <= 255 && local5 - local112 <= 8) {
						local7++;
					} else {
						local7 = 0;
					}
				} while (local7 != 4);
				for (@Pc(94) int local94 = local13; local94 < local5; local94++) {
					arg0[local94] = '*';
				}
				local7 = 0;
			}
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("28086, " + arg0 + ", " + arg1 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DHIKSAEW", name = "a", descriptor = "(I[CZ)I")
	private static int method116(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1) {
		try {
			for (@Pc(5) int local5 = arg0; local5 < arg1.length && local5 >= 0; local5++) {
				if (arg1[local5] >= '0' && arg1[local5] <= '9') {
					return local5;
				}
			}
			return -1;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("33734, " + arg0 + ", " + arg1 + ", " + true + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DHIKSAEW", name = "a", descriptor = "([CII)I")
	private static int method117(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1) {
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
			signlink.reporterror("41870, " + arg0 + ", " + arg1 + ", " + 2 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DHIKSAEW", name = "a", descriptor = "(CI)Z")
	private static boolean method118(@OriginalArg(0) char arg0) {
		try {
			return !method120(arg0) && !method121(arg0);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("86498, " + arg0 + ", " + 0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DHIKSAEW", name = "b", descriptor = "(IC)Z")
	private static boolean method119(@OriginalArg(1) char arg0) {
		try {
			if (arg0 >= 'a' && arg0 <= 'z') {
				return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
			} else {
				return true;
			}
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("90025, " + 0 + ", " + arg0 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DHIKSAEW", name = "b", descriptor = "(CI)Z")
	private static boolean method120(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("74030, " + arg0 + ", " + 3 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DHIKSAEW", name = "c", descriptor = "(IC)Z")
	private static boolean method121(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= '0' && arg0 <= '9';
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("6703, " + 3 + ", " + arg0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DHIKSAEW", name = "a", descriptor = "(BC)Z")
	private static boolean method122(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z';
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("83509, " + 0 + ", " + arg0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DHIKSAEW", name = "c", descriptor = "(CI)Z")
	private static boolean method123(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("10010, " + arg0 + ", " + -843 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DHIKSAEW", name = "a", descriptor = "(I[C)Z")
	private static boolean method124(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				if (!method121(arg0[local5]) && arg0[local5] != '\u0000') {
					local3 = false;
				}
			}
			if (local3) {
				return true;
			}
			@Pc(32) int local32 = method125(arg0);
			@Pc(34) int local34 = 0;
			@Pc(49) int local49 = anIntArray24.length - 1;
			if (local32 == anIntArray24[0] || local32 == anIntArray24[local49]) {
				return true;
			}
			do {
				@Pc(67) int local67 = (local34 + local49) / 2;
				if (local32 == anIntArray24[local67]) {
					return true;
				}
				if (local32 < anIntArray24[local67]) {
					local49 = local67;
				} else {
					local34 = local67;
				}
			} while (local34 != local49 && local34 + 1 != local49);
			return false;
		} catch (@Pc(96) RuntimeException local96) {
			signlink.reporterror("9674, " + 1 + ", " + arg0 + ", " + local96.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DHIKSAEW", name = "a", descriptor = "(B[C)I")
	private static int method125(@OriginalArg(1) char[] arg0) {
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
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("87039, " + 7 + ", " + arg0 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}
}
