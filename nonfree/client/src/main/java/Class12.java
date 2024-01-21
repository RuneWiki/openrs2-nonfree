import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!HGSXEUXP")
public final class Class12 {

	@OriginalMember(owner = "client!HGSXEUXP", name = "l", descriptor = "Z")
	private static boolean aBoolean55;

	@OriginalMember(owner = "client!HGSXEUXP", name = "m", descriptor = "[I")
	private static int[] anIntArray48;

	@OriginalMember(owner = "client!HGSXEUXP", name = "n", descriptor = "[[C")
	private static char[][] aCharArrayArray1;

	@OriginalMember(owner = "client!HGSXEUXP", name = "o", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!HGSXEUXP", name = "p", descriptor = "[[C")
	private static char[][] aCharArrayArray2;

	@OriginalMember(owner = "client!HGSXEUXP", name = "q", descriptor = "[[C")
	private static char[][] aCharArrayArray3;

	@OriginalMember(owner = "client!HGSXEUXP", name = "r", descriptor = "[I")
	private static int[] anIntArray49;

	@OriginalMember(owner = "client!HGSXEUXP", name = "a", descriptor = "I")
	private static int anInt290 = 810;

	@OriginalMember(owner = "client!HGSXEUXP", name = "c", descriptor = "I")
	private static int anInt291;

	@OriginalMember(owner = "client!HGSXEUXP", name = "d", descriptor = "I")
	private static int anInt292;

	@OriginalMember(owner = "client!HGSXEUXP", name = "e", descriptor = "I")
	private static int anInt293;

	@OriginalMember(owner = "client!HGSXEUXP", name = "f", descriptor = "B")
	private static byte aByte12;

	@OriginalMember(owner = "client!HGSXEUXP", name = "g", descriptor = "B")
	private static byte aByte13;

	@OriginalMember(owner = "client!HGSXEUXP", name = "h", descriptor = "Z")
	private static boolean aBoolean52;

	@OriginalMember(owner = "client!HGSXEUXP", name = "i", descriptor = "I")
	private static int anInt294;

	@OriginalMember(owner = "client!HGSXEUXP", name = "j", descriptor = "Z")
	private static boolean aBoolean53;

	@OriginalMember(owner = "client!HGSXEUXP", name = "k", descriptor = "Z")
	private static boolean aBoolean54;

	@OriginalMember(owner = "client!HGSXEUXP", name = "s", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray3;

	static {
		aBoolean51 = true;
		anInt291 = 9;
		anInt292 = 8;
		anInt293 = 1;
		aByte12 = 93;
		aByte13 = 1;
		aBoolean52 = true;
		anInt294 = 1;
		aBoolean53 = true;
		aBoolean54 = true;
		aStringArray3 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };
	}

	@OriginalMember(owner = "client!HGSXEUXP", name = "a", descriptor = "(Lclient!DTIATKJO;)V")
	public static void method128(@OriginalArg(0) Class7 arg0) {
		@Pc(10) Class3_Sub1_Sub2 local10 = new Class3_Sub1_Sub2(-527, arg0.method30("fragmentsenc.txt", null));
		@Pc(19) Class3_Sub1_Sub2 local19 = new Class3_Sub1_Sub2(-527, arg0.method30("badenc.txt", null));
		@Pc(28) Class3_Sub1_Sub2 local28 = new Class3_Sub1_Sub2(-527, arg0.method30("domainenc.txt", null));
		@Pc(37) Class3_Sub1_Sub2 local37 = new Class3_Sub1_Sub2(-527, arg0.method30("tldlist.txt", null));
		method129(local10, local19, local28, local37);
	}

	@OriginalMember(owner = "client!HGSXEUXP", name = "a", descriptor = "(Lclient!GHHPHSRU;Lclient!GHHPHSRU;Lclient!GHHPHSRU;Lclient!GHHPHSRU;)V")
	private static void method129(@OriginalArg(0) Class3_Sub1_Sub2 arg0, @OriginalArg(1) Class3_Sub1_Sub2 arg1, @OriginalArg(2) Class3_Sub1_Sub2 arg2, @OriginalArg(3) Class3_Sub1_Sub2 arg3) {
		method131(arg1, (byte) 9);
		method132(anInt292, arg2);
		method133(arg0);
		method130(arg3);
	}

	@OriginalMember(owner = "client!HGSXEUXP", name = "a", descriptor = "(ZLclient!GHHPHSRU;)V")
	private static void method130(@OriginalArg(1) Class3_Sub1_Sub2 arg0) {
		try {
			@Pc(4) int local4 = arg0.method94();
			aCharArrayArray3 = new char[local4][];
			anIntArray49 = new int[local4];
			for (@Pc(12) int local12 = 0; local12 < local4; local12++) {
				anIntArray49[local12] = arg0.method89();
				@Pc(23) char[] local23 = new char[arg0.method89()];
				for (@Pc(25) int local25 = 0; local25 < local23.length; local25++) {
					local23[local25] = (char) arg0.method89();
				}
				aCharArrayArray3[local12] = local23;
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("48143, " + false + ", " + arg0 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HGSXEUXP", name = "a", descriptor = "(Lclient!GHHPHSRU;B)V")
	private static void method131(@OriginalArg(0) Class3_Sub1_Sub2 arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(2) int local2 = arg0.method94();
			aCharArrayArray1 = new char[local2][];
			@Pc(10) boolean local10 = false;
			aByteArrayArrayArray1 = new byte[local2][][];
			method134(arg0, aCharArrayArray1, aByteArrayArrayArray1);
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("95140, " + arg0 + ", " + arg1 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HGSXEUXP", name = "a", descriptor = "(ILclient!GHHPHSRU;)V")
	private static void method132(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub2 arg1) {
		try {
			if (arg0 == 8) {
				@Pc(6) int local6 = arg1.method94();
				aCharArrayArray2 = new char[local6][];
				method135(arg1, aCharArrayArray2);
			}
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("53314, " + arg0 + ", " + arg1 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HGSXEUXP", name = "a", descriptor = "(BLclient!GHHPHSRU;)V")
	private static void method133(@OriginalArg(1) Class3_Sub1_Sub2 arg0) {
		try {
			anIntArray48 = new int[arg0.method94()];
			for (@Pc(5) int local5 = 0; local5 < anIntArray48.length; local5++) {
				anIntArray48[local5] = arg0.method91();
			}
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("28101, " + -12 + ", " + arg0 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HGSXEUXP", name = "a", descriptor = "(Lclient!GHHPHSRU;[[CI[[[B)V")
	private static void method134(@OriginalArg(0) Class3_Sub1_Sub2 arg0, @OriginalArg(1) char[][] arg1, @OriginalArg(3) byte[][][] arg2) {
		try {
			for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
				@Pc(13) char[] local13 = new char[arg0.method89()];
				for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
					local13[local15] = (char) arg0.method89();
				}
				arg1[local7] = local13;
				@Pc(37) byte[][] local37 = new byte[arg0.method89()][2];
				for (@Pc(39) int local39 = 0; local39 < local37.length; local39++) {
					local37[local39][0] = (byte) arg0.method89();
					local37[local39][1] = (byte) arg0.method89();
				}
				if (local37.length > 0) {
					arg2[local7] = local37;
				}
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("14796, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HGSXEUXP", name = "a", descriptor = "(ILclient!GHHPHSRU;[[C)V")
	private static void method135(@OriginalArg(1) Class3_Sub1_Sub2 arg0, @OriginalArg(2) char[][] arg1) {
		try {
			for (@Pc(6) int local6 = 0; local6 < arg1.length; local6++) {
				@Pc(12) char[] local12 = new char[arg0.method89()];
				for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
					local12[local14] = (char) arg0.method89();
				}
				arg1[local6] = local12;
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("14968, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HGSXEUXP", name = "a", descriptor = "(I[C)V")
	private static void method136(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) int local3 = 0;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				if (method137(arg0[local5])) {
					arg0[local3] = arg0[local5];
				} else {
					arg0[local3] = ' ';
				}
				if (local3 == 0 || arg0[local3] != ' ' || arg0[local3 - 1] != ' ') {
					local3++;
				}
			}
			for (@Pc(52) int local52 = local3; local52 < arg0.length; local52++) {
				arg0[local52] = ' ';
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("32955, " + 7 + ", " + arg0 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HGSXEUXP", name = "a", descriptor = "(CB)Z")
	private static boolean method137(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= ' ' && arg0 <= '\u007f' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("65284, " + arg0 + ", " + -33 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HGSXEUXP", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method138(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(3) long local3 = System.currentTimeMillis();
			@Pc(6) char[] local6 = arg1.toCharArray();
			method136(local6);
			@Pc(15) String local15 = (new String(local6)).trim();
			@Pc(19) boolean local19 = false;
			@Pc(23) char[] local23 = local15.toLowerCase().toCharArray();
			@Pc(26) String local26 = local15.toLowerCase();
			method146(local23);
			method141(local23);
			method142(anInt293, local23);
			method155(local23);
			for (@Pc(40) int local40 = 0; local40 < aStringArray3.length; local40++) {
				@Pc(50) int local50 = -1;
				while ((local50 = local26.indexOf(aStringArray3[local40], local50 + 1)) != -1) {
					@Pc(57) char[] local57 = aStringArray3[local40].toCharArray();
					for (@Pc(59) int local59 = 0; local59 < local57.length; local59++) {
						local23[local59 + local50] = local57[local59];
					}
				}
			}
			method139(local15.toCharArray(), local23);
			method140(local23);
			@Pc(101) long local101 = System.currentTimeMillis();
			return (new String(local23)).trim();
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("29915, " + arg0 + ", " + arg1 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HGSXEUXP", name = "a", descriptor = "([CZ[C)V")
	private static void method139(@OriginalArg(0) char[] arg0, @OriginalArg(2) char[] arg1) {
		try {
			for (@Pc(9) int local9 = 0; local9 < arg0.length; local9++) {
				if (arg1[local9] != '*' && method163(arg0[local9])) {
					arg1[local9] = arg0[local9];
				}
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("87083, " + arg0 + ", " + true + ", " + arg1 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HGSXEUXP", name = "a", descriptor = "([CB)V")
	private static void method140(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(7) boolean local7 = true;
			for (@Pc(9) int local9 = 0; local9 < arg0.length; local9++) {
				@Pc(15) char local15 = arg0[local9];
				if (!method160(local15)) {
					local7 = true;
				} else if (local7) {
					if (method162(local15)) {
						local7 = false;
					}
				} else if (method163(local15)) {
					arg0[local9] = (char) (local15 + 'a' - 65);
				}
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("6563, " + arg0 + ", " + -115 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HGSXEUXP", name = "a", descriptor = "([CZ)V")
	private static void method141(@OriginalArg(0) char[] arg0) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 2; local3++) {
				for (@Pc(10) int local10 = aCharArrayArray1.length - 1; local10 >= 0; local10--) {
					method150(aCharArrayArray1[local10], arg0, aByteArrayArrayArray1[local10]);
				}
			}
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("44955, " + arg0 + ", " + false + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HGSXEUXP", name = "b", descriptor = "(I[C)V")
	private static void method142(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1) {
		try {
			@Pc(5) char[] local5 = (char[]) arg1.clone();
			@Pc(20) char[] local20 = new char[] { '(', 'a', ')' };
			method150(local20, local5, null);
			@Pc(29) char[] local29 = (char[]) arg1.clone();
			@Pc(44) char[] local44 = new char[] { 'd', 'o', 't' };
			method150(local44, local29, null);
			for (@Pc(54) int local54 = aCharArrayArray2.length - 1; local54 >= 0; local54--) {
				method143(local5, local29, aCharArrayArray2[local54], arg1);
			}
			if (arg0 < 1 || arg0 > 1) {
				for (@Pc(75) int local75 = 1; local75 > 0; local75++) {
				}
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("62337, " + arg0 + ", " + arg1 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HGSXEUXP", name = "a", descriptor = "([C[C[CB[C)V")
	private static void method143(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2, @OriginalArg(4) char[] arg3) {
		try {
			if (arg2.length <= arg3.length) {
				@Pc(14) int local14;
				if (aByte12 != 93) {
					for (local14 = 1; local14 > 0; local14++) {
					}
				}
				@Pc(29) int local29;
				for (local14 = 0; local14 <= arg3.length - arg2.length; local14 += local29) {
					@Pc(25) int local25 = local14;
					@Pc(27) int local27 = 0;
					local29 = 1;
					label61: while (true) {
						while (true) {
							if (local25 >= arg3.length) {
								break label61;
							}
							@Pc(37) char local37 = arg3[local25];
							@Pc(39) char local39 = 0;
							if (local25 + 1 < arg3.length) {
								local39 = arg3[local25 + 1];
							}
							@Pc(64) int local64;
							if (local27 < arg2.length && (local64 = method152(local39, arg2[local27], local37)) > 0) {
								local25 += local64;
								local27++;
							} else {
								if (local27 == 0) {
									break label61;
								}
								@Pc(85) int local85;
								if ((local85 = method152(local39, arg2[local27 - 1], local37)) > 0) {
									local25 += local85;
									if (local27 == 1) {
										local29++;
									}
								} else {
									if (local27 >= arg2.length || !method158(local37)) {
										break label61;
									}
									local25++;
								}
							}
						}
					}
					if (local27 >= arg2.length) {
						@Pc(116) boolean local116 = false;
						@Pc(122) int local122 = method144(arg0, arg3, local14);
						@Pc(130) int local130 = method145(arg1, arg3, local25 - 1);
						if (local122 > 2 || local130 > 2) {
							local116 = true;
						}
						if (local116) {
							for (@Pc(142) int local142 = local14; local142 < local25; local142++) {
								arg3[local142] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(165) RuntimeException local165) {
			signlink.reporterror("94592, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 93 + ", " + arg3 + ", " + local165.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HGSXEUXP", name = "a", descriptor = "([C[CII)I")
	private static int method144(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg2 == 0) {
				return 2;
			}
			for (@Pc(18) int local18 = arg2 - 1; local18 >= 0 && method158(arg1[local18]); local18--) {
				if (arg1[local18] == '@') {
					return 3;
				}
			}
			@Pc(38) int local38 = 0;
			for (@Pc(42) int local42 = arg2 - 1; local42 >= 0 && method158(arg0[local42]); local42--) {
				if (arg0[local42] == '*') {
					local38++;
				}
			}
			if (local38 >= 3) {
				return 4;
			} else if (method158(arg1[arg2 - 1])) {
				return 1;
			} else {
				return 0;
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("92579, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 930 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HGSXEUXP", name = "a", descriptor = "([CB[CI)I")
	private static int method145(@OriginalArg(0) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 + 1 == arg1.length) {
				return 2;
			}
			@Pc(13) int local13 = arg2 + 1;
			while (true) {
				if (local13 < arg1.length && method158(arg1[local13])) {
					if (arg1[local13] != '.' && arg1[local13] != ',') {
						local13++;
						continue;
					}
					return 3;
				}
				@Pc(40) int local40 = 0;
				if (aByte13 != 1) {
					return 3;
				}
				for (@Pc(49) int local49 = arg2 + 1; local49 < arg1.length && method158(arg0[local49]); local49++) {
					if (arg0[local49] == '*') {
						local40++;
					}
				}
				if (local40 >= 3) {
					return 4;
				}
				if (method158(arg1[arg2 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("75722, " + arg0 + ", " + 1 + ", " + arg1 + ", " + arg2 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HGSXEUXP", name = "a", descriptor = "([CI)V")
	private static void method146(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(3) char[] local3 = (char[]) arg0.clone();
			@Pc(18) char[] local18 = new char[] { 'd', 'o', 't' };
			method150(local18, local3, null);
			@Pc(30) char[] local30 = (char[]) arg0.clone();
			@Pc(53) char[] local53 = new char[] { 's', 'l', 'a', 's', 'h' };
			method150(local53, local30, null);
			for (@Pc(60) int local60 = 0; local60 < aCharArrayArray3.length; local60++) {
				method147(local3, arg0, anIntArray49[local60], aCharArrayArray3[local60], local30);
			}
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("95240, " + arg0 + ", " + 974 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HGSXEUXP", name = "a", descriptor = "([C[CI[C[CB)V")
	private static void method147(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) char[] arg3, @OriginalArg(4) char[] arg4) {
		try {
			if (arg3.length <= arg1.length) {
				@Pc(29) int local29;
				for (@Pc(21) int local21 = 0; local21 <= arg1.length - arg3.length; local21 += local29) {
					@Pc(25) int local25 = local21;
					@Pc(27) int local27 = 0;
					local29 = 1;
					label120: while (true) {
						while (true) {
							if (local25 >= arg1.length) {
								break label120;
							}
							@Pc(37) char local37 = arg1[local25];
							@Pc(39) char local39 = 0;
							if (local25 + 1 < arg1.length) {
								local39 = arg1[local25 + 1];
							}
							@Pc(64) int local64;
							if (local27 < arg3.length && (local64 = method152(local39, arg3[local27], local37)) > 0) {
								local25 += local64;
								local27++;
							} else {
								if (local27 == 0) {
									break label120;
								}
								@Pc(85) int local85;
								if ((local85 = method152(local39, arg3[local27 - 1], local37)) > 0) {
									local25 += local85;
									if (local27 == 1) {
										local29++;
									}
								} else {
									if (local27 >= arg3.length || !method158(local37)) {
										break label120;
									}
									local25++;
								}
							}
						}
					}
					if (local27 >= arg3.length) {
						@Pc(116) boolean local116 = false;
						@Pc(122) int local122 = method148(arg1, arg0, local21, aBoolean52);
						@Pc(130) int local130 = method149(arg1, arg4, local25 - 1);
						if (arg2 == 1 && local122 > 0 && local130 > 0) {
							local116 = true;
						}
						if (arg2 == 2 && (local122 > 2 && local130 > 0 || local122 > 0 && local130 > 2)) {
							local116 = true;
						}
						if (arg2 == 3 && local122 > 0 && local130 > 2) {
							local116 = true;
						}
						@Pc(173) boolean local173;
						if (arg2 == 3 && local122 > 2 && local130 > 0) {
							local173 = true;
						} else {
							local173 = false;
						}
						if (local116) {
							@Pc(180) int local180 = local21;
							@Pc(184) int local184 = local25 - 1;
							@Pc(192) boolean local192;
							@Pc(196) int local196;
							if (local122 > 2) {
								if (local122 == 4) {
									local192 = false;
									for (local196 = local21 - 1; local196 >= 0; local196--) {
										if (local192) {
											if (arg0[local196] != '*') {
												break;
											}
											local180 = local196;
										} else if (arg0[local196] == '*') {
											local180 = local196;
											local192 = true;
										}
									}
								}
								local192 = false;
								for (local196 = local180 - 1; local196 >= 0; local196--) {
									if (local192) {
										if (method158(arg1[local196])) {
											break;
										}
										local180 = local196;
									} else if (!method158(arg1[local196])) {
										local192 = true;
										local180 = local196;
									}
								}
							}
							if (local130 > 2) {
								if (local130 == 4) {
									local192 = false;
									for (local196 = local184 + 1; local196 < arg1.length; local196++) {
										if (local192) {
											if (arg4[local196] != '*') {
												break;
											}
											local184 = local196;
										} else if (arg4[local196] == '*') {
											local184 = local196;
											local192 = true;
										}
									}
								}
								local192 = false;
								for (local196 = local184 + 1; local196 < arg1.length; local196++) {
									if (local192) {
										if (method158(arg1[local196])) {
											break;
										}
										local184 = local196;
									} else if (!method158(arg1[local196])) {
										local192 = true;
										local184 = local196;
									}
								}
							}
							for (@Pc(330) int local330 = local180; local330 <= local184; local330++) {
								arg1[local330] = '*';
							}
						}
					}
				}
			}
		} catch (@Pc(353) RuntimeException local353) {
			signlink.reporterror("33186, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 12 + ", " + local353.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HGSXEUXP", name = "a", descriptor = "([C[CIZ)I")
	private static int method148(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		try {
			if (arg2 == 0) {
				return 2;
			}
			@Pc(9) int local9 = arg2 - 1;
			while (true) {
				if (local9 >= 0 && method158(arg0[local9])) {
					if (arg0[local9] != ',' && arg0[local9] != '.') {
						local9--;
						continue;
					}
					return 3;
				}
				@Pc(34) int local34 = 0;
				if (!arg3) {
					return 0;
				}
				for (@Pc(42) int local42 = arg2 - 1; local42 >= 0 && method158(arg1[local42]); local42--) {
					if (arg1[local42] == '*') {
						local34++;
					}
				}
				if (local34 >= 3) {
					return 4;
				}
				if (method158(arg0[arg2 - 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("33342, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HGSXEUXP", name = "b", descriptor = "([C[CII)I")
	private static int method149(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 + 1 == arg0.length) {
				return 2;
			}
			@Pc(17) int local17 = arg2 + 1;
			while (true) {
				if (local17 < arg0.length && method158(arg0[local17])) {
					if (arg0[local17] != '\\' && arg0[local17] != '/') {
						local17++;
						continue;
					}
					return 3;
				}
				@Pc(44) int local44 = 0;
				for (@Pc(48) int local48 = arg2 + 1; local48 < arg0.length && method158(arg1[local48]); local48++) {
					if (arg1[local48] == '*') {
						local44++;
					}
				}
				if (local44 >= 5) {
					return 4;
				}
				if (method158(arg0[arg2 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("83488, " + arg0 + ", " + arg1 + ", " + 600 + ", " + arg2 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HGSXEUXP", name = "a", descriptor = "(Z[C[C[[B)V")
	private static void method150(@OriginalArg(1) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) byte[][] arg2) {
		try {
			if (arg0.length <= arg1.length) {
				@Pc(29) int local29;
				for (@Pc(19) int local19 = 0; local19 <= arg1.length - arg0.length; local19 += local29) {
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
							if (local23 >= arg1.length || local33 && local35) {
								break label164;
							}
							var12 = arg1[local23];
							var13 = '\u0000';
							if (local23 + 1 < arg1.length) {
								var13 = arg1[local23 + 1];
							}
							@Pc(70) int local70;
							if (local25 < arg0.length && (local70 = method153(var12, arg0[local25], var13)) > 0) {
								if (local70 == 1 && method161(var12)) {
									local33 = true;
								}
								if (local70 == 2 && (method161(var12) || method161(var13))) {
									local33 = true;
								}
								local23 += local70;
								local25++;
							} else {
								if (local25 == 0) {
									break label164;
								}
								@Pc(113) int local113;
								if ((local113 = method153(var12, arg0[local25 - 1], var13)) > 0) {
									local23 += local113;
									if (local25 == 1) {
										local29++;
									}
								} else {
									if (local25 >= arg0.length || !method159(aBoolean53, var12)) {
										break label164;
									}
									if (method158(var12) && var12 != '\'') {
										local31 = true;
									}
									if (method161(var12)) {
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
							if (local19 - 1 < 0 || method158(arg1[local19 - 1]) && arg1[local19 - 1] != '\'') {
								local224 = true;
							}
							if (local23 >= arg1.length || method158(arg1[local23]) && arg1[local23] != '\'') {
								local226 = true;
							}
							if (!local224 || !local226) {
								@Pc(270) boolean local270 = false;
								local274 = local19 - 2;
								if (local224) {
									local274 = local19;
								}
								while (!local270 && local274 < local23) {
									if (local274 >= 0 && (!method158(arg1[local274]) || arg1[local274] == '\'')) {
										@Pc(296) char[] local296 = new char[3];
										@Pc(298) int local298;
										for (local298 = 0; local298 < 3 && local274 + local298 < arg1.length && (!method158(arg1[local274 + local298]) || arg1[local274 + local298] == '\''); local298++) {
											local296[local298] = arg1[local274 + local298];
										}
										@Pc(336) boolean local336 = true;
										if (local298 == 0) {
											local336 = false;
										}
										if (local298 < 3 && local274 - 1 >= 0 && (!method158(arg1[local274 - 1]) || arg1[local274 - 1] == '\'')) {
											local336 = false;
										}
										if (local336 && !method164(local296)) {
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
								var12 = arg1[local19 - 1];
							}
							var13 = ' ';
							if (local23 < arg1.length) {
								var13 = arg1[local23];
							}
							@Pc(206) byte local206 = method154(var12);
							@Pc(210) byte local210 = method154(var13);
							if (arg2 != null && method151(local206, arg2, local210)) {
								local178 = false;
							}
						}
						if (local178) {
							@Pc(386) int local386 = 0;
							@Pc(388) int local388 = 0;
							@Pc(390) int local390 = -1;
							for (local274 = local19; local274 < local23; local274++) {
								if (method161(arg1[local274])) {
									local386++;
								} else if (method160(arg1[local274])) {
									local388++;
									local390 = local274;
								}
							}
							if (local390 > -1) {
								local386 -= local23 - local390 - 1;
							}
							if (local386 <= local388) {
								for (@Pc(432) int local432 = local19; local432 < local23; local432++) {
									arg1[local432] = '*';
								}
							} else {
								local29 = 1;
							}
						}
					}
				}
			}
		} catch (@Pc(459) RuntimeException local459) {
			signlink.reporterror("16525, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local459.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HGSXEUXP", name = "a", descriptor = "(BB[[BB)Z")
	private static boolean method151(@OriginalArg(0) byte arg0, @OriginalArg(2) byte[][] arg1, @OriginalArg(3) byte arg2) {
		try {
			@Pc(1) int local1 = 0;
			if (arg1[0][0] == arg0 && arg1[0][1] == arg2) {
				return true;
			}
			@Pc(22) int local22 = arg1.length - 1;
			if (arg1[local22][0] == arg0 && arg1[local22][1] == arg2) {
				return true;
			}
			do {
				@Pc(51) int local51 = (local1 + local22) / 2;
				if (arg1[local51][0] == arg0 && arg1[local51][1] == arg2) {
					return true;
				}
				if (arg0 < arg1[local51][0] || arg0 == arg1[local51][0] && arg2 < arg1[local51][1]) {
					local22 = local51;
				} else {
					local1 = local51;
				}
			} while (local1 != local22 && local1 + 1 != local22);
			return false;
		} catch (@Pc(105) RuntimeException local105) {
			signlink.reporterror("5841, " + arg0 + ", " + 19 + ", " + arg1 + ", " + arg2 + ", " + local105.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HGSXEUXP", name = "a", descriptor = "(CICC)I")
	private static int method152(@OriginalArg(0) char arg0, @OriginalArg(2) char arg1, @OriginalArg(3) char arg2) {
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
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("95113, " + arg0 + ", " + 120 + ", " + arg1 + ", " + arg2 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HGSXEUXP", name = "a", descriptor = "(ICCC)I")
	private static int method153(@OriginalArg(1) char arg0, @OriginalArg(2) char arg1, @OriginalArg(3) char arg2) {
		try {
			if (arg1 == arg0) {
				return 1;
			}
			if (arg1 >= 'a' && arg1 <= 'm') {
				if (arg1 == 'a') {
					if (arg0 != '4' && arg0 != '@' && arg0 != '^') {
						if (arg0 == '/' && arg2 == '\\') {
							return 2;
						}
						return 0;
					}
					return 1;
				}
				if (arg1 == 'b') {
					if (arg0 != '6' && arg0 != '8') {
						if ((arg0 != '1' || arg2 != '3') && (arg0 != 'i' || arg2 != '3')) {
							return 0;
						}
						return 2;
					}
					return 1;
				}
				if (arg1 == 'c') {
					if (arg0 != '(' && arg0 != '<' && arg0 != '{' && arg0 != '[') {
						return 0;
					}
					return 1;
				}
				if (arg1 == 'd') {
					if ((arg0 != '[' || arg2 != ')') && (arg0 != 'i' || arg2 != ')')) {
						return 0;
					}
					return 2;
				}
				if (arg1 == 'e') {
					if (arg0 != '3' && arg0 != '€') {
						return 0;
					}
					return 1;
				}
				if (arg1 == 'f') {
					if (arg0 == 'p' && arg2 == 'h') {
						return 2;
					}
					if (arg0 == '£') {
						return 1;
					}
					return 0;
				}
				if (arg1 == 'g') {
					if (arg0 != '9' && arg0 != '6' && arg0 != 'q') {
						return 0;
					}
					return 1;
				}
				if (arg1 == 'h') {
					if (arg0 == '#') {
						return 1;
					}
					return 0;
				}
				if (arg1 == 'i') {
					if (arg0 != 'y' && arg0 != 'l' && arg0 != 'j' && arg0 != '1' && arg0 != '!' && arg0 != ':' && arg0 != ';' && arg0 != '|') {
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
					if (arg0 != '1' && arg0 != '|' && arg0 != 'i') {
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
					if (arg0 != '0' && arg0 != '*') {
						if ((arg0 != '(' || arg2 != ')') && (arg0 != '[' || arg2 != ']') && (arg0 != '{' || arg2 != '}') && (arg0 != '<' || arg2 != '>')) {
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
					if (arg0 != '5' && arg0 != 'z' && arg0 != '$' && arg0 != '2') {
						return 0;
					}
					return 1;
				}
				if (arg1 == 't') {
					if (arg0 != '7' && arg0 != '+') {
						return 0;
					}
					return 1;
				}
				if (arg1 == 'u') {
					if (arg0 == 'v') {
						return 1;
					}
					if ((arg0 != '\\' || arg2 != '/') && (arg0 != '\\' || arg2 != '|') && (arg0 != '|' || arg2 != '/')) {
						return 0;
					}
					return 2;
				}
				if (arg1 == 'v') {
					if ((arg0 != '\\' || arg2 != '/') && (arg0 != '\\' || arg2 != '|') && (arg0 != '|' || arg2 != '/')) {
						return 0;
					}
					return 2;
				}
				if (arg1 == 'w') {
					if (arg0 == 'v' && arg2 == 'v') {
						return 2;
					}
					return 0;
				}
				if (arg1 == 'x') {
					if ((arg0 != ')' || arg2 != '(') && (arg0 != '}' || arg2 != '{') && (arg0 != ']' || arg2 != '[') && (arg0 != '>' || arg2 != '<')) {
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
					if (arg0 == 'o' || arg0 == 'O') {
						return 1;
					} else if ((arg0 != '(' || arg2 != ')') && (arg0 != '{' || arg2 != '}') && (arg0 != '[' || arg2 != ']')) {
						return 0;
					} else {
						return 2;
					}
				} else if (arg1 == '1') {
					return arg0 == 'l' ? 1 : 0;
				} else {
					return 0;
				}
			} else if (arg1 == ',') {
				return arg0 == '.' ? 1 : 0;
			} else if (arg1 == '.') {
				return arg0 == ',' ? 1 : 0;
			} else if (arg1 == '!') {
				return arg0 == 'i' ? 1 : 0;
			} else {
				return 0;
			}
		} catch (@Pc(513) RuntimeException local513) {
			signlink.reporterror("76400, " + 13684 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local513.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HGSXEUXP", name = "a", descriptor = "(CZ)B")
	private static byte method154(@OriginalArg(0) char arg0) {
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
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("8362, " + arg0 + ", " + false + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HGSXEUXP", name = "b", descriptor = "([CI)V")
	private static void method155(@OriginalArg(0) char[] arg0) {
		try {
			@Pc(14) int local14 = 0;
			@Pc(16) int local16 = 0;
			@Pc(18) int local18 = 0;
			while (true) {
				do {
					@Pc(117) int local117;
					if ((local117 = method156(local14, anInt294, arg0)) == -1) {
						return;
					}
					@Pc(22) boolean local22 = false;
					for (@Pc(24) int local24 = local14; local24 >= 0 && local24 < local117 && !local22; local24++) {
						if (!method158(arg0[local24]) && !method159(aBoolean53, arg0[local24])) {
							local22 = true;
						}
					}
					if (local22) {
						local16 = 0;
					}
					if (local16 == 0) {
						local18 = local117;
					}
					local14 = method157(local117, arg0);
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
			signlink.reporterror("98709, " + arg0 + ", " + 0 + ", " + local121.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HGSXEUXP", name = "a", descriptor = "(II[C)I")
	private static int method156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) char[] arg2) {
		try {
			for (@Pc(3) int local3 = arg0; local3 < arg2.length && local3 >= 0; local3++) {
				if (arg2[local3] >= '0' && arg2[local3] <= '9') {
					return local3;
				}
			}
			if (arg1 != anInt294) {
				for (@Pc(29) int local29 = 1; local29 > 0; local29++) {
				}
			}
			return -1;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("41337, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HGSXEUXP", name = "a", descriptor = "(I[CI)I")
	private static int method157(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1) {
		try {
			@Pc(12) int local12 = arg0;
			while (true) {
				if (local12 < arg1.length && local12 >= 0) {
					if (arg1[local12] >= '0' && arg1[local12] <= '9') {
						local12++;
						continue;
					}
					return local12;
				}
				return arg1.length;
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("57319, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HGSXEUXP", name = "a", descriptor = "(CI)Z")
	private static boolean method158(@OriginalArg(0) char arg0) {
		try {
			return !method160(arg0) && !method161(arg0);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("70020, " + arg0 + ", " + -84 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HGSXEUXP", name = "a", descriptor = "(ZC)Z")
	private static boolean method159(@OriginalArg(0) boolean arg0, @OriginalArg(1) char arg1) {
		try {
			if (!arg0) {
				throw new NullPointerException();
			} else if (arg1 >= 'a' && arg1 <= 'z') {
				return arg1 == 'v' || arg1 == 'x' || arg1 == 'j' || arg1 == 'q' || arg1 == 'z';
			} else {
				return true;
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("32151, " + arg0 + ", " + arg1 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HGSXEUXP", name = "a", descriptor = "(IC)Z")
	private static boolean method160(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("60909, " + 0 + ", " + arg0 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HGSXEUXP", name = "b", descriptor = "(CB)Z")
	private static boolean method161(@OriginalArg(0) char arg0) {
		try {
			return arg0 >= '0' && arg0 <= '9';
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("19626, " + arg0 + ", " + 0 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HGSXEUXP", name = "a", descriptor = "(BC)Z")
	private static boolean method162(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z';
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("89231, " + 34 + ", " + arg0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HGSXEUXP", name = "b", descriptor = "(BC)Z")
	private static boolean method163(@OriginalArg(1) char arg0) {
		try {
			return arg0 >= 'A' && arg0 <= 'Z';
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("12903, " + 74 + ", " + arg0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HGSXEUXP", name = "c", descriptor = "(I[C)Z")
	private static boolean method164(@OriginalArg(1) char[] arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
				if (!method161(arg0[local5]) && arg0[local5] != '\u0000') {
					local3 = false;
				}
			}
			if (local3) {
				return true;
			}
			@Pc(32) int local32 = method165(551, arg0);
			@Pc(34) int local34 = 0;
			@Pc(45) int local45 = anIntArray48.length - 1;
			if (local32 == anIntArray48[0] || local32 == anIntArray48[local45]) {
				return true;
			}
			do {
				@Pc(63) int local63 = (local34 + local45) / 2;
				if (local32 == anIntArray48[local63]) {
					return true;
				}
				if (local32 < anIntArray48[local63]) {
					local45 = local63;
				} else {
					local34 = local63;
				}
			} while (local34 != local45 && local34 + 1 != local45);
			return false;
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("19369, " + 0 + ", " + arg0 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HGSXEUXP", name = "d", descriptor = "(I[C)I")
	private static int method165(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1) {
		try {
			if (arg1.length > 6) {
				return 0;
			}
			@Pc(9) int local9 = 0;
			@Pc(13) boolean local13 = false;
			for (@Pc(15) int local15 = 0; local15 < arg1.length; local15++) {
				@Pc(26) char local26 = arg1[arg1.length - local15 - 1];
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
			signlink.reporterror("26848, " + arg0 + ", " + arg1 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}
}
