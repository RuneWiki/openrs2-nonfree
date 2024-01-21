import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!LJNJPDAK")
public final class Class24 {

	@OriginalMember(owner = "client!LJNJPDAK", name = "c", descriptor = "Z")
	private static boolean aBoolean77;

	@OriginalMember(owner = "client!LJNJPDAK", name = "d", descriptor = "Z")
	private static boolean aBoolean78;

	@OriginalMember(owner = "client!LJNJPDAK", name = "f", descriptor = "I")
	private static int anInt424;

	@OriginalMember(owner = "client!LJNJPDAK", name = "n", descriptor = "I")
	private static int anInt430;

	@OriginalMember(owner = "client!LJNJPDAK", name = "o", descriptor = "[I")
	private static int[] anIntArray100;

	@OriginalMember(owner = "client!LJNJPDAK", name = "p", descriptor = "[[C")
	private static char[][] aCharArrayArray1;

	@OriginalMember(owner = "client!LJNJPDAK", name = "q", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!LJNJPDAK", name = "r", descriptor = "[[C")
	private static char[][] aCharArrayArray2;

	@OriginalMember(owner = "client!LJNJPDAK", name = "s", descriptor = "[[C")
	private static char[][] aCharArrayArray3;

	@OriginalMember(owner = "client!LJNJPDAK", name = "t", descriptor = "[I")
	private static int[] anIntArray101;

	@OriginalMember(owner = "client!LJNJPDAK", name = "a", descriptor = "Z")
	private static boolean aBoolean76 = true;

	@OriginalMember(owner = "client!LJNJPDAK", name = "b", descriptor = "I")
	private static int anInt422 = 21302;

	@OriginalMember(owner = "client!LJNJPDAK", name = "e", descriptor = "I")
	private static int anInt423 = 4;

	@OriginalMember(owner = "client!LJNJPDAK", name = "g", descriptor = "I")
	private static int anInt425 = 2;

	@OriginalMember(owner = "client!LJNJPDAK", name = "h", descriptor = "I")
	private static int anInt426 = 2;

	@OriginalMember(owner = "client!LJNJPDAK", name = "i", descriptor = "Z")
	private static boolean aBoolean79 = true;

	@OriginalMember(owner = "client!LJNJPDAK", name = "j", descriptor = "I")
	private static int anInt427 = -549;

	@OriginalMember(owner = "client!LJNJPDAK", name = "k", descriptor = "I")
	private static int anInt428 = -549;

	@OriginalMember(owner = "client!LJNJPDAK", name = "l", descriptor = "I")
	private static int anInt429 = -89;

	@OriginalMember(owner = "client!LJNJPDAK", name = "m", descriptor = "Z")
	private static boolean aBoolean80 = true;

	@OriginalMember(owner = "client!LJNJPDAK", name = "u", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray2 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

	@OriginalMember(owner = "client!LJNJPDAK", name = "a", descriptor = "(Lclient!NXFIIFAD;)V")
	public static void method237(@OriginalArg(0) Class31 arg0) {
		@Pc(10) Class1_Sub2_Sub3 local10 = new Class1_Sub2_Sub3(arg0.method352("fragmentsenc.txt", null), -670);
		@Pc(19) Class1_Sub2_Sub3 local19 = new Class1_Sub2_Sub3(arg0.method352("badenc.txt", null), -670);
		@Pc(28) Class1_Sub2_Sub3 local28 = new Class1_Sub2_Sub3(arg0.method352("domainenc.txt", null), -670);
		@Pc(37) Class1_Sub2_Sub3 local37 = new Class1_Sub2_Sub3(arg0.method352("tldlist.txt", null), -670);
		method238(local10, local19, local28, local37);
	}

	@OriginalMember(owner = "client!LJNJPDAK", name = "a", descriptor = "(Lclient!MNKDCXXG;Lclient!MNKDCXXG;Lclient!MNKDCXXG;Lclient!MNKDCXXG;)V")
	private static void method238(@OriginalArg(0) Class1_Sub2_Sub3 arg0, @OriginalArg(1) Class1_Sub2_Sub3 arg1, @OriginalArg(2) Class1_Sub2_Sub3 arg2, @OriginalArg(3) Class1_Sub2_Sub3 arg3) {
		method240(aBoolean77, arg1);
		method241(arg2);
		method242(arg0);
		method239((byte) 4, arg3);
	}

	@OriginalMember(owner = "client!LJNJPDAK", name = "a", descriptor = "(BLclient!MNKDCXXG;)V")
	private static void method239(@OriginalArg(0) byte arg0, @OriginalArg(1) Class1_Sub2_Sub3 arg1) {
		try {
			@Pc(4) int local4 = arg1.method312();
			aCharArrayArray3 = new char[local4][];
			anIntArray101 = new int[local4];
			for (@Pc(12) int local12 = 0; local12 < local4; local12++) {
				anIntArray101[local12] = arg1.method307();
				@Pc(23) char[] local23 = new char[arg1.method307()];
				for (@Pc(25) int local25 = 0; local25 < local23.length; local25++) {
					local23[local25] = (char) arg1.method307();
				}
				aCharArrayArray3[local12] = local23;
			}
			@Pc(51) boolean local51 = false;
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("34203, " + arg0 + ", " + arg1 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LJNJPDAK", name = "a", descriptor = "(ZLclient!MNKDCXXG;)V")
	private static void method240(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub2_Sub3 arg1) {
		try {
			@Pc(2) int local2 = arg1.method312();
			aCharArrayArray1 = new char[local2][];
			aByteArrayArrayArray1 = new byte[local2][][];
			if (arg0) {
				for (@Pc(12) int local12 = 1; local12 > 0; local12++) {
				}
			}
			method243(aCharArrayArray1, aByteArrayArrayArray1, arg1);
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("93961, " + arg0 + ", " + arg1 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LJNJPDAK", name = "a", descriptor = "(Lclient!MNKDCXXG;I)V")
	private static void method241(@OriginalArg(0) Class1_Sub2_Sub3 arg0) {
		try {
			@Pc(2) int local2 = arg0.method312();
			aCharArrayArray2 = new char[local2][];
			method244(aCharArrayArray2, arg0);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("11707, " + arg0 + ", " + 949 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LJNJPDAK", name = "b", descriptor = "(ZLclient!MNKDCXXG;)V")
	private static void method242(@OriginalArg(1) Class1_Sub2_Sub3 arg0) {
		try {
			anIntArray100 = new int[arg0.method312()];
			for (@Pc(8) int local8 = 0; local8 < anIntArray100.length; local8++) {
				anIntArray100[local8] = arg0.method309();
			}
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("16419, " + false + ", " + arg0 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LJNJPDAK", name = "a", descriptor = "([[CI[[[BLclient!MNKDCXXG;)V")
	private static void method243(@OriginalArg(0) char[][] arg0, @OriginalArg(2) byte[][][] arg1, @OriginalArg(3) Class1_Sub2_Sub3 arg2) {
		try {
			for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
				@Pc(13) char[] local13 = new char[arg2.method307()];
				for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
					local13[local15] = (char) arg2.method307();
				}
				arg0[local7] = local13;
				@Pc(37) byte[][] local37 = new byte[arg2.method307()][2];
				for (@Pc(39) int local39 = 0; local39 < local37.length; local39++) {
					local37[local39][0] = (byte) arg2.method307();
					local37[local39][1] = (byte) arg2.method307();
				}
				if (local37.length > 0) {
					arg1[local7] = local37;
				}
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("40994, " + arg0 + ", " + 549 + ", " + arg1 + ", " + arg2 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LJNJPDAK", name = "a", descriptor = "(I[[CLclient!MNKDCXXG;)V")
	private static void method244(@OriginalArg(1) char[][] arg0, @OriginalArg(2) Class1_Sub2_Sub3 arg1) {
		try {
			if (anInt423 == 4) {
				for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
					@Pc(13) char[] local13 = new char[arg1.method307()];
					for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
						local13[local15] = (char) arg1.method307();
					}
					arg0[local7] = local13;
				}
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("70960, " + 4 + ", " + arg0 + ", " + arg1 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LJNJPDAK", name = "a", descriptor = "(I[C)V")
	private static void method245(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) int local3 = 0;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				if (method246(703, arg0[local5])) {
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
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("23692, " + 0 + ", " + arg0 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LJNJPDAK", name = "a", descriptor = "(IC)Z")
	private static boolean method246(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		try {
			@Pc(3) boolean local3 = false;
			return arg1 >= ' ' && arg1 <= '\u007f' || arg1 == ' ' || arg1 == '\n' || arg1 == '\t' || arg1 == '£' || arg1 == '€';
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("45751, " + arg0 + ", " + arg1 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LJNJPDAK", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method247(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(3) long local3 = System.currentTimeMillis();
			@Pc(6) char[] local6 = arg1.toCharArray();
			method245(local6);
			@Pc(15) String local15 = (new String(local6)).trim();
			@Pc(19) char[] local19 = local15.toLowerCase().toCharArray();
			@Pc(22) String local22 = local15.toLowerCase();
			method255(local19);
			method250(local19);
			method251(local19);
			if (arg0 != anInt422) {
				aBoolean77 = !aBoolean77;
			}
			method264(local19);
			for (@Pc(45) int local45 = 0; local45 < aStringArray2.length; local45++) {
				@Pc(55) int local55 = -1;
				while ((local55 = local22.indexOf(aStringArray2[local45], local55 + 1)) != -1) {
					@Pc(62) char[] local62 = aStringArray2[local45].toCharArray();
					for (@Pc(64) int local64 = 0; local64 < local62.length; local64++) {
						local19[local64 + local55] = local62[local64];
					}
				}
			}
			method248(local15.toCharArray(), anInt424, local19);
			method249(local19);
			@Pc(106) long local106 = System.currentTimeMillis();
			return (new String(local19)).trim();
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("57445, " + arg0 + ", " + arg1 + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LJNJPDAK", name = "a", descriptor = "([CI[C)V")
	private static void method248(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) char[] arg2) {
		try {
			if (arg1 != 0) {
				aBoolean78 = !aBoolean78;
			}
			for (@Pc(9) int local9 = 0; local9 < arg0.length; local9++) {
				if (arg2[local9] != '*' && method272(arg0[local9])) {
					arg2[local9] = arg0[local9];
				}
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("98667, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LJNJPDAK", name = "a", descriptor = "(B[C)V")
	private static void method249(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				@Pc(11) char local11 = arg0[local5];
				if (!method269(335, local11)) {
					local3 = true;
				} else if (local3) {
					if (method271(local11)) {
						local3 = false;
					}
				} else if (method272(local11)) {
					arg0[local5] = (char) (local11 + 'a' - 65);
				}
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("56576, " + -33 + ", " + arg0 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LJNJPDAK", name = "b", descriptor = "(B[C)V")
	private static void method250(@OriginalArg(1) char[] arg0) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 2; local3++) {
				for (@Pc(10) int local10 = aCharArrayArray1.length - 1; local10 >= 0; local10--) {
					method259(aCharArrayArray1[local10], arg0, aByteArrayArrayArray1[local10]);
				}
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("12133, " + -27 + ", " + arg0 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LJNJPDAK", name = "a", descriptor = "([CI)V")
	private static void method251(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(10) char[] local10 = (char[]) arg0.clone();
			@Pc(25) char[] local25 = new char[] { '(', 'a', ')' };
			method259(local25, local10, null);
			@Pc(34) char[] local34 = (char[]) arg0.clone();
			@Pc(49) char[] local49 = new char[] { 'd', 'o', 't' };
			method259(local49, local34, null);
			for (@Pc(59) int local59 = aCharArrayArray2.length - 1; local59 >= 0; local59--) {
				method252(local10, arg0, aCharArrayArray2[local59], local34);
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("31781, " + arg0 + ", " + 2 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LJNJPDAK", name = "a", descriptor = "([C[CI[C[C)V")
	private static void method252(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(3) char[] arg2, @OriginalArg(4) char[] arg3) {
		try {
			if (arg2.length <= arg1.length) {
				@Pc(23) int local23;
				for (@Pc(15) int local15 = 0; local15 <= arg1.length - arg2.length; local15 += local23) {
					@Pc(19) int local19 = local15;
					@Pc(21) int local21 = 0;
					local23 = 1;
					label58: while (true) {
						while (true) {
							if (local19 >= arg1.length) {
								break label58;
							}
							@Pc(31) char local31 = arg1[local19];
							@Pc(33) char local33 = 0;
							if (local19 + 1 < arg1.length) {
								local33 = arg1[local19 + 1];
							}
							@Pc(58) int local58;
							if (local21 < arg2.length && (local58 = method261(local33, arg2[local21], local31)) > 0) {
								local19 += local58;
								local21++;
							} else {
								if (local21 == 0) {
									break label58;
								}
								@Pc(79) int local79;
								if ((local79 = method261(local33, arg2[local21 - 1], local31)) > 0) {
									local19 += local79;
									if (local21 == 1) {
										local23++;
									}
								} else {
									if (local21 >= arg2.length || !method267(local31)) {
										break label58;
									}
									local19++;
								}
							}
						}
					}
					if (local21 >= arg2.length) {
						@Pc(110) boolean local110 = false;
						@Pc(116) int local116 = method253(anInt425, arg0, arg1, local15);
						@Pc(124) int local124 = method254(local19 - 1, arg1, arg3);
						if (local116 > 2 || local124 > 2) {
							local110 = true;
						}
						if (local110) {
							for (@Pc(136) int local136 = local15; local136 < local19; local136++) {
								arg1[local136] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("78980, " + arg0 + ", " + arg1 + ", " + 8 + ", " + arg2 + ", " + arg3 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LJNJPDAK", name = "a", descriptor = "(I[C[CI)I")
	private static int method253(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg3 == 0) {
				return 2;
			}
			for (@Pc(9) int local9 = arg3 - 1; local9 >= 0 && method267(arg2[local9]); local9--) {
				if (arg2[local9] == '@') {
					return 3;
				}
			}
			if (arg0 != anInt426) {
				aBoolean77 = !aBoolean77;
			}
			@Pc(38) int local38 = 0;
			for (@Pc(42) int local42 = arg3 - 1; local42 >= 0 && method267(arg1[local42]); local42--) {
				if (arg1[local42] == '*') {
					local38++;
				}
			}
			if (local38 >= 3) {
				return 4;
			} else if (method267(arg2[arg3 - 1])) {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("43169, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LJNJPDAK", name = "b", descriptor = "(I[C[CI)I")
	private static int method254(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2) {
		try {
			if (arg0 + 1 == arg1.length) {
				return 2;
			}
			@Pc(13) int local13 = arg0 + 1;
			while (true) {
				if (local13 < arg1.length && method267(arg1[local13])) {
					if (arg1[local13] != '.' && arg1[local13] != ',') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(46) int local46 = 0;
				for (@Pc(50) int local50 = arg0 + 1; local50 < arg1.length && method267(arg2[local50]); local50++) {
					if (arg2[local50] == '*') {
						local46++;
					}
				}
				if (local46 >= 3) {
					return 4;
				}
				if (method267(arg1[arg0 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("86277, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -533 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LJNJPDAK", name = "b", descriptor = "(I[C)V")
	private static void method255(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(5) char[] local5 = (char[]) arg0.clone();
			@Pc(29) char[] local29 = new char[] { 'd', 'o', 't' };
			method259(local29, local5, null);
			@Pc(38) char[] local38 = (char[]) arg0.clone();
			@Pc(61) char[] local61 = new char[] { 's', 'l', 'a', 's', 'h' };
			method259(local61, local38, null);
			for (@Pc(68) int local68 = 0; local68 < aCharArrayArray3.length; local68++) {
				method256(arg0, anIntArray101[local68], local38, aCharArrayArray3[local68], local5);
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("16147, " + 0 + ", " + arg0 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LJNJPDAK", name = "a", descriptor = "([CBI[C[C[C)V")
	private static void method256(@OriginalArg(0) char[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) char[] arg2, @OriginalArg(4) char[] arg3, @OriginalArg(5) char[] arg4) {
		try {
			if (arg3.length <= arg0.length) {
				@Pc(28) int local28;
				for (@Pc(20) int local20 = 0; local20 <= arg0.length - arg3.length; local20 += local28) {
					@Pc(24) int local24 = local20;
					@Pc(26) int local26 = 0;
					local28 = 1;
					label120: while (true) {
						while (true) {
							if (local24 >= arg0.length) {
								break label120;
							}
							@Pc(36) char local36 = arg0[local24];
							@Pc(38) char local38 = 0;
							if (local24 + 1 < arg0.length) {
								local38 = arg0[local24 + 1];
							}
							@Pc(63) int local63;
							if (local26 < arg3.length && (local63 = method261(local38, arg3[local26], local36)) > 0) {
								local24 += local63;
								local26++;
							} else {
								if (local26 == 0) {
									break label120;
								}
								@Pc(84) int local84;
								if ((local84 = method261(local38, arg3[local26 - 1], local36)) > 0) {
									local24 += local84;
									if (local26 == 1) {
										local28++;
									}
								} else {
									if (local26 >= arg3.length || !method267(local36)) {
										break label120;
									}
									local24++;
								}
							}
						}
					}
					if (local26 >= arg3.length) {
						@Pc(115) boolean local115 = false;
						@Pc(121) int local121 = method257(local20, (byte) 1, arg0, arg4);
						@Pc(129) int local129 = method258(arg2, arg0, local24 - 1);
						if (arg1 == 1 && local121 > 0 && local129 > 0) {
							local115 = true;
						}
						if (arg1 == 2 && (local121 > 2 && local129 > 0 || local121 > 0 && local129 > 2)) {
							local115 = true;
						}
						if (arg1 == 3 && local121 > 0 && local129 > 2) {
							local115 = true;
						}
						@Pc(172) boolean local172;
						if (arg1 == 3 && local121 > 2 && local129 > 0) {
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
											if (arg4[local195] != '*') {
												break;
											}
											local179 = local195;
										} else if (arg4[local195] == '*') {
											local179 = local195;
											local191 = true;
										}
									}
								}
								local191 = false;
								for (local195 = local179 - 1; local195 >= 0; local195--) {
									if (local191) {
										if (method267(arg0[local195])) {
											break;
										}
										local179 = local195;
									} else if (!method267(arg0[local195])) {
										local191 = true;
										local179 = local195;
									}
								}
							}
							if (local129 > 2) {
								if (local129 == 4) {
									local191 = false;
									for (local195 = local183 + 1; local195 < arg0.length; local195++) {
										if (local191) {
											if (arg2[local195] != '*') {
												break;
											}
											local183 = local195;
										} else if (arg2[local195] == '*') {
											local183 = local195;
											local191 = true;
										}
									}
								}
								local191 = false;
								for (local195 = local183 + 1; local195 < arg0.length; local195++) {
									if (local191) {
										if (method267(arg0[local195])) {
											break;
										}
										local183 = local195;
									} else if (!method267(arg0[local195])) {
										local191 = true;
										local183 = local195;
									}
								}
							}
							for (@Pc(329) int local329 = local179; local329 <= local183; local329++) {
								arg0[local329] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(352) RuntimeException local352) {
			signlink.reporterror("29777, " + arg0 + ", " + 4 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local352.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LJNJPDAK", name = "a", descriptor = "(IB[C[C)I")
	private static int method257(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) char[] arg3) {
		try {
			if (arg0 == 0) {
				return 2;
			}
			@Pc(9) int local9 = arg0 - 1;
			while (true) {
				if (local9 >= 0 && method267(arg2[local9])) {
					if (arg2[local9] != ',' && arg2[local9] != '.') {
						local9--;
						continue;
					}
					return 3;
				}
				@Pc(34) int local34 = 0;
				for (@Pc(38) int local38 = arg0 - 1; local38 >= 0 && method267(arg3[local38]); local38--) {
					if (arg3[local38] == '*') {
						local34++;
					}
				}
				@Pc(61) boolean local61 = false;
				if (local34 >= 3) {
					return 4;
				}
				if (method267(arg2[arg0 - 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("15610, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LJNJPDAK", name = "a", descriptor = "([CI[CI)I")
	private static int method258(@OriginalArg(0) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 + 1 == arg1.length) {
				return 2;
			}
			@Pc(13) int local13 = arg2 + 1;
			while (true) {
				if (local13 < arg1.length && method267(arg1[local13])) {
					if (arg1[local13] != '\\' && arg1[local13] != '/') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(51) int local51 = 0;
				for (@Pc(55) int local55 = arg2 + 1; local55 < arg1.length && method267(arg0[local55]); local55++) {
					if (arg0[local55] == '*') {
						local51++;
					}
				}
				if (local51 >= 5) {
					return 4;
				}
				if (method267(arg1[arg2 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("37639, " + arg0 + ", " + -295 + ", " + arg1 + ", " + arg2 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LJNJPDAK", name = "a", descriptor = "(I[C[C[[B)V")
	private static void method259(@OriginalArg(1) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) byte[][] arg2) {
		try {
			if (arg0.length <= arg1.length) {
				@Pc(34) int local34;
				for (@Pc(24) int local24 = 0; local24 <= arg1.length - arg0.length; local24 += local34) {
					@Pc(28) int local28 = local24;
					@Pc(30) int local30 = 0;
					@Pc(32) int local32 = 0;
					local34 = 1;
					@Pc(36) boolean local36 = false;
					@Pc(38) boolean local38 = false;
					@Pc(40) boolean local40 = false;
					@Pc(48) char var12;
					@Pc(50) char var13;
					label164: while (true) {
						while (true) {
							if (local28 >= arg1.length || local38 && local40) {
								break label164;
							}
							var12 = arg1[local28];
							var13 = '\u0000';
							if (local28 + 1 < arg1.length) {
								var13 = arg1[local28 + 1];
							}
							@Pc(75) int local75;
							if (local30 < arg0.length && (local75 = method262(var13, (byte) 8, var12, arg0[local30])) > 0) {
								if (local75 == 1 && method270(var12, (byte) 7)) {
									local38 = true;
								}
								if (local75 == 2 && (method270(var12, (byte) 7) || method270(var13, (byte) 7))) {
									local38 = true;
								}
								local28 += local75;
								local30++;
							} else {
								if (local30 == 0) {
									break label164;
								}
								@Pc(118) int local118;
								if ((local118 = method262(var13, (byte) 8, var12, arg0[local30 - 1])) > 0) {
									local28 += local118;
									if (local30 == 1) {
										local34++;
									}
								} else {
									if (local30 >= arg0.length || !method268(var12)) {
										break label164;
									}
									if (method267(var12) && var12 != '\'') {
										local36 = true;
									}
									if (method270(var12, (byte) 7)) {
										local40 = true;
									}
									local28++;
									local32++;
									if (local32 * 100 / (local28 - local24) > 90) {
										break label164;
									}
								}
							}
						}
					}
					if (local30 >= arg0.length && (!local38 || !local40)) {
						@Pc(183) boolean local183 = true;
						@Pc(279) int local279;
						if (local36) {
							@Pc(229) boolean local229 = false;
							@Pc(231) boolean local231 = false;
							if (local24 - 1 < 0 || method267(arg1[local24 - 1]) && arg1[local24 - 1] != '\'') {
								local229 = true;
							}
							if (local28 >= arg1.length || method267(arg1[local28]) && arg1[local28] != '\'') {
								local231 = true;
							}
							if (!local229 || !local231) {
								@Pc(275) boolean local275 = false;
								local279 = local24 - 2;
								if (local229) {
									local279 = local24;
								}
								while (!local275 && local279 < local28) {
									if (local279 >= 0 && (!method267(arg1[local279]) || arg1[local279] == '\'')) {
										@Pc(301) char[] local301 = new char[3];
										@Pc(303) int local303;
										for (local303 = 0; local303 < 3 && local279 + local303 < arg1.length && (!method267(arg1[local279 + local303]) || arg1[local279 + local303] == '\''); local303++) {
											local301[local303] = arg1[local279 + local303];
										}
										@Pc(341) boolean local341 = true;
										if (local303 == 0) {
											local341 = false;
										}
										if (local303 < 3 && local279 - 1 >= 0 && (!method267(arg1[local279 - 1]) || arg1[local279 - 1] == '\'')) {
											local341 = false;
										}
										if (local341 && !method273(local301)) {
											local275 = true;
										}
									}
									local279++;
								}
								if (!local275) {
									local183 = false;
								}
							}
						} else {
							var12 = ' ';
							if (local24 - 1 >= 0) {
								var12 = arg1[local24 - 1];
							}
							var13 = ' ';
							if (local28 < arg1.length) {
								var13 = arg1[local28];
							}
							@Pc(211) byte local211 = method263(var12);
							@Pc(215) byte local215 = method263(var13);
							if (arg2 != null && method260(local215, arg2, local211)) {
								local183 = false;
							}
						}
						if (local183) {
							@Pc(391) int local391 = 0;
							@Pc(393) int local393 = 0;
							@Pc(395) int local395 = -1;
							for (local279 = local24; local279 < local28; local279++) {
								if (method270(arg1[local279], (byte) 7)) {
									local391++;
								} else if (method269(335, arg1[local279])) {
									local393++;
									local395 = local279;
								}
							}
							if (local395 > -1) {
								local391 -= local28 - local395 - 1;
							}
							if (local391 <= local393) {
								for (@Pc(437) int local437 = local24; local437 < local28; local437++) {
									arg1[local437] = '*';
								}
							} else {
								local34 = 1;
							}
						}
					}
				}
			}
		} catch (@Pc(464) RuntimeException local464) {
			signlink.reporterror("37626, " + 6 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local464.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LJNJPDAK", name = "a", descriptor = "(BZ[[BB)Z")
	private static boolean method260(@OriginalArg(0) byte arg0, @OriginalArg(2) byte[][] arg1, @OriginalArg(3) byte arg2) {
		try {
			@Pc(12) int local12 = 0;
			if (arg1[0][0] == arg2 && arg1[0][1] == arg0) {
				return true;
			}
			@Pc(33) int local33 = arg1.length - 1;
			if (arg1[local33][0] == arg2 && arg1[local33][1] == arg0) {
				return true;
			}
			do {
				@Pc(55) int local55 = (local12 + local33) / 2;
				if (arg1[local55][0] == arg2 && arg1[local55][1] == arg0) {
					return true;
				}
				if (arg2 < arg1[local55][0] || arg2 == arg1[local55][0] && arg0 < arg1[local55][1]) {
					local33 = local55;
				} else {
					local12 = local55;
				}
			} while (local12 != local33 && local12 + 1 != local33);
			return false;
		} catch (@Pc(109) RuntimeException local109) {
			signlink.reporterror("3371, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + local109.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LJNJPDAK", name = "a", descriptor = "(CZCC)I")
	private static int method261(@OriginalArg(0) char arg0, @OriginalArg(2) char arg1, @OriginalArg(3) char arg2) {
		try {
			if (arg1 == arg2) {
				return 1;
			} else if (arg1 == 'o' && arg2 == '0') {
				return 1;
			} else if (arg1 == 'o' && arg2 == '(' && arg0 == ')') {
				return 2;
			} else if (arg1 == 'c' && (arg2 == '(' || arg2 == '<' || arg2 == '[')) {
				return 1;
			} else if (arg1 == 'e' && arg2 == '€') {
				return 1;
			} else if (arg1 == 's' && arg2 == '$') {
				return 1;
			} else if (arg1 == 'l' && arg2 == 'i') {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("11407, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LJNJPDAK", name = "a", descriptor = "(CBCC)I")
	private static int method262(@OriginalArg(0) char arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) char arg2, @OriginalArg(3) char arg3) {
		try {
			@Pc(6) boolean local6 = false;
			if (arg3 == arg2) {
				return 1;
			}
			if (arg3 >= 'a' && arg3 <= 'm') {
				if (arg3 == 'a') {
					if (arg2 != '4' && arg2 != '@' && arg2 != '^') {
						if (arg2 == '/' && arg0 == '\\') {
							return 2;
						}
						return 0;
					}
					return 1;
				}
				if (arg3 == 'b') {
					if (arg2 != '6' && arg2 != '8') {
						if ((arg2 != '1' || arg0 != '3') && (arg2 != 'i' || arg0 != '3')) {
							return 0;
						}
						return 2;
					}
					return 1;
				}
				if (arg3 == 'c') {
					if (arg2 != '(' && arg2 != '<' && arg2 != '{' && arg2 != '[') {
						return 0;
					}
					return 1;
				}
				if (arg3 == 'd') {
					if ((arg2 != '[' || arg0 != ')') && (arg2 != 'i' || arg0 != ')')) {
						return 0;
					}
					return 2;
				}
				if (arg3 == 'e') {
					if (arg2 != '3' && arg2 != '€') {
						return 0;
					}
					return 1;
				}
				if (arg3 == 'f') {
					if (arg2 == 'p' && arg0 == 'h') {
						return 2;
					}
					if (arg2 == '£') {
						return 1;
					}
					return 0;
				}
				if (arg3 == 'g') {
					if (arg2 != '9' && arg2 != '6' && arg2 != 'q') {
						return 0;
					}
					return 1;
				}
				if (arg3 == 'h') {
					if (arg2 == '#') {
						return 1;
					}
					return 0;
				}
				if (arg3 == 'i') {
					if (arg2 != 'y' && arg2 != 'l' && arg2 != 'j' && arg2 != '1' && arg2 != '!' && arg2 != ':' && arg2 != ';' && arg2 != '|') {
						return 0;
					}
					return 1;
				}
				if (arg3 == 'j') {
					return 0;
				}
				if (arg3 == 'k') {
					return 0;
				}
				if (arg3 == 'l') {
					if (arg2 != '1' && arg2 != '|' && arg2 != 'i') {
						return 0;
					}
					return 1;
				}
				if (arg3 == 'm') {
					return 0;
				}
			}
			if (arg3 >= 'n' && arg3 <= 'z') {
				if (arg3 == 'n') {
					return 0;
				}
				if (arg3 == 'o') {
					if (arg2 != '0' && arg2 != '*') {
						if ((arg2 != '(' || arg0 != ')') && (arg2 != '[' || arg0 != ']') && (arg2 != '{' || arg0 != '}') && (arg2 != '<' || arg0 != '>')) {
							return 0;
						}
						return 2;
					}
					return 1;
				}
				if (arg3 == 'p') {
					return 0;
				}
				if (arg3 == 'q') {
					return 0;
				}
				if (arg3 == 'r') {
					return 0;
				}
				if (arg3 == 's') {
					if (arg2 != '5' && arg2 != 'z' && arg2 != '$' && arg2 != '2') {
						return 0;
					}
					return 1;
				}
				if (arg3 == 't') {
					if (arg2 != '7' && arg2 != '+') {
						return 0;
					}
					return 1;
				}
				if (arg3 == 'u') {
					if (arg2 == 'v') {
						return 1;
					}
					if ((arg2 != '\\' || arg0 != '/') && (arg2 != '\\' || arg0 != '|') && (arg2 != '|' || arg0 != '/')) {
						return 0;
					}
					return 2;
				}
				if (arg3 == 'v') {
					if ((arg2 != '\\' || arg0 != '/') && (arg2 != '\\' || arg0 != '|') && (arg2 != '|' || arg0 != '/')) {
						return 0;
					}
					return 2;
				}
				if (arg3 == 'w') {
					if (arg2 == 'v' && arg0 == 'v') {
						return 2;
					}
					return 0;
				}
				if (arg3 == 'x') {
					if ((arg2 != ')' || arg0 != '(') && (arg2 != '}' || arg0 != '{') && (arg2 != ']' || arg0 != '[') && (arg2 != '>' || arg0 != '<')) {
						return 0;
					}
					return 2;
				}
				if (arg3 == 'y') {
					return 0;
				}
				if (arg3 == 'z') {
					return 0;
				}
			}
			if (arg3 >= '0' && arg3 <= '9') {
				if (arg3 == '0') {
					if (arg2 == 'o' || arg2 == 'O') {
						return 1;
					} else if ((arg2 != '(' || arg0 != ')') && (arg2 != '{' || arg0 != '}') && (arg2 != '[' || arg0 != ']')) {
						return 0;
					} else {
						return 2;
					}
				} else if (arg3 == '1') {
					return arg2 == 'l' ? 1 : 0;
				} else {
					return 0;
				}
			} else if (arg3 == ',') {
				return arg2 == '.' ? 1 : 0;
			} else if (arg3 == '.') {
				return arg2 == ',' ? 1 : 0;
			} else if (arg3 == '!') {
				return arg2 == 'i' ? 1 : 0;
			} else {
				return 0;
			}
		} catch (@Pc(524) RuntimeException local524) {
			signlink.reporterror("94501, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local524.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LJNJPDAK", name = "a", descriptor = "(BC)B")
	private static byte method263(@OriginalArg(1) char arg0) {
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
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("63405, " + 3 + ", " + arg0 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LJNJPDAK", name = "a", descriptor = "([CZ)V")
	private static void method264(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			@Pc(18) int local18 = 0;
			while (true) {
				do {
					@Pc(117) int local117;
					if ((local117 = method265(local5, arg0)) == -1) {
						return;
					}
					@Pc(22) boolean local22 = false;
					for (@Pc(24) int local24 = local5; local24 >= 0 && local24 < local117 && !local22; local24++) {
						if (!method267(arg0[local24]) && !method268(arg0[local24])) {
							local22 = true;
						}
					}
					if (local22) {
						local7 = 0;
					}
					if (local7 == 0) {
						local18 = local117;
					}
					local5 = method266(anInt427, local117, arg0);
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
				for (@Pc(99) int local99 = local18; local99 < local5; local99++) {
					arg0[local99] = '*';
				}
				local7 = 0;
			}
		} catch (@Pc(121) RuntimeException local121) {
			signlink.reporterror("20316, " + arg0 + ", " + true + ", " + local121.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LJNJPDAK", name = "a", descriptor = "(I[CI)I")
	private static int method265(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1) {
		try {
			for (@Pc(5) int local5 = arg0; local5 < arg1.length && local5 >= 0; local5++) {
				if (arg1[local5] >= '0' && arg1[local5] <= '9') {
					return local5;
				}
			}
			return -1;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("29706, " + arg0 + ", " + arg1 + ", " + -816 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LJNJPDAK", name = "a", descriptor = "(II[C)I")
	private static int method266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) char[] arg2) {
		try {
			if (arg0 >= 0) {
				return 3;
			}
			@Pc(9) int local9 = arg1;
			while (true) {
				if (local9 < arg2.length && local9 >= 0) {
					if (arg2[local9] >= '0' && arg2[local9] <= '9') {
						local9++;
						continue;
					}
					return local9;
				}
				return arg2.length;
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("71815, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LJNJPDAK", name = "a", descriptor = "(ZC)Z")
	private static boolean method267(@OriginalArg(1) char arg0) {
		try {
			return !method269(335, arg0) && !method270(arg0, (byte) 7);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("55303, " + false + ", " + arg0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LJNJPDAK", name = "a", descriptor = "(CZ)Z")
	private static boolean method268(@OriginalArg(0) char arg0) {
		try {
			if (arg0 >= 'a' && arg0 <= 'z') {
				return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
			} else {
				return true;
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("91747, " + arg0 + ", " + false + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LJNJPDAK", name = "b", descriptor = "(IC)Z")
	private static boolean method269(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		try {
			@Pc(3) boolean local3 = false;
			return arg1 >= 'a' && arg1 <= 'z' || arg1 >= 'A' && arg1 <= 'Z';
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("7984, " + arg0 + ", " + arg1 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LJNJPDAK", name = "a", descriptor = "(CB)Z")
	private static boolean method270(@OriginalArg(0) char arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(4) boolean local4 = false;
			return arg0 >= '0' && arg0 <= '9';
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("66343, " + arg0 + ", " + arg1 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LJNJPDAK", name = "b", descriptor = "(BC)Z")
	private static boolean method271(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z';
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("90583, " + 3 + ", " + arg0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LJNJPDAK", name = "c", descriptor = "(IC)Z")
	private static boolean method272(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("41590, " + -89 + ", " + arg0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LJNJPDAK", name = "b", descriptor = "([CZ)Z")
	private static boolean method273(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
				if (!method270(arg0[local11], (byte) 7) && arg0[local11] != '\u0000') {
					local3 = false;
				}
			}
			if (local3) {
				return true;
			}
			@Pc(38) int local38 = method274(arg0);
			@Pc(40) int local40 = 0;
			@Pc(45) int local45 = anIntArray100.length - 1;
			if (local38 == anIntArray100[0] || local38 == anIntArray100[local45]) {
				return true;
			}
			do {
				@Pc(63) int local63 = (local40 + local45) / 2;
				if (local38 == anIntArray100[local63]) {
					return true;
				}
				if (local38 < anIntArray100[local63]) {
					local45 = local63;
				} else {
					local40 = local63;
				}
			} while (local40 != local45 && local40 + 1 != local45);
			return false;
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("42685, " + arg0 + ", " + true + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LJNJPDAK", name = "c", descriptor = "(B[C)I")
	private static int method274(@OriginalArg(1) char[] arg0) {
		try {
			if (arg0.length > 6) {
				return 0;
			}
			@Pc(17) int local17 = 0;
			for (@Pc(19) int local19 = 0; local19 < arg0.length; local19++) {
				@Pc(30) char local30 = arg0[arg0.length - local19 - 1];
				if (local30 >= 'a' && local30 <= 'z') {
					local17 = local17 * 38 + local30 + 1 - 'a';
				} else if (local30 == '\'') {
					local17 = local17 * 38 + 27;
				} else if (local30 >= '0' && local30 <= '9') {
					local17 = local17 * 38 + local30 + 28 - '0';
				} else if (local30 != '\u0000') {
					return 0;
				}
			}
			return local17;
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("58190, " + 0 + ", " + arg0 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}
}
