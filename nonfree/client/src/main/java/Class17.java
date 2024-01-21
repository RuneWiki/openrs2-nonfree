import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class17 {

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
	private static int anInt380;

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "Z")
	private static boolean aBoolean92;

	@OriginalMember(owner = "client!ic", name = "h", descriptor = "I")
	private static int anInt384;

	@OriginalMember(owner = "client!ic", name = "i", descriptor = "[I")
	private static int[] anIntArray161;

	@OriginalMember(owner = "client!ic", name = "j", descriptor = "[[C")
	private static char[][] aCharArrayArray1;

	@OriginalMember(owner = "client!ic", name = "k", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!ic", name = "l", descriptor = "[[C")
	private static char[][] aCharArrayArray2;

	@OriginalMember(owner = "client!ic", name = "m", descriptor = "[[C")
	private static char[][] aCharArrayArray3;

	@OriginalMember(owner = "client!ic", name = "n", descriptor = "[I")
	private static int[] anIntArray162;

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
	private static int anInt381 = -497;

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "Z")
	private static boolean aBoolean93 = true;

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
	private static int anInt382 = -12807;

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
	private static int anInt383 = 6;

	@OriginalMember(owner = "client!ic", name = "g", descriptor = "B")
	private static byte aByte20 = 8;

	@OriginalMember(owner = "client!ic", name = "o", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray6 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet" };

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!tb;)V")
	public static void method282(@OriginalArg(0) Class34 arg0) {
		@Pc(11) Class1_Sub3_Sub3 local11 = new Class1_Sub3_Sub3(arg0.method428(null, "fragmentsenc.txt"), (byte) 63);
		@Pc(21) Class1_Sub3_Sub3 local21 = new Class1_Sub3_Sub3(arg0.method428(null, "badenc.txt"), (byte) 63);
		@Pc(31) Class1_Sub3_Sub3 local31 = new Class1_Sub3_Sub3(arg0.method428(null, "domainenc.txt"), (byte) 63);
		@Pc(41) Class1_Sub3_Sub3 local41 = new Class1_Sub3_Sub3(arg0.method428(null, "tldlist.txt"), (byte) 63);
		method283(local11, local21, local31, local41);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!jb;Lclient!jb;Lclient!jb;Lclient!jb;)V")
	private static void method283(@OriginalArg(0) Class1_Sub3_Sub3 arg0, @OriginalArg(1) Class1_Sub3_Sub3 arg1, @OriginalArg(2) Class1_Sub3_Sub3 arg2, @OriginalArg(3) Class1_Sub3_Sub3 arg3) {
		method285(arg1);
		method286(arg2);
		method287(arg0);
		method284(aBoolean93, arg3);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZLclient!jb;)V")
	private static void method284(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub3_Sub3 arg1) {
		if (!arg0) {
			anInt381 = -270;
		}
		@Pc(8) int local8 = arg1.method336();
		aCharArrayArray3 = new char[local8][];
		anIntArray162 = new int[local8];
		for (@Pc(16) int local16 = 0; local16 < local8; local16++) {
			anIntArray162[local16] = arg1.method331();
			@Pc(27) char[] local27 = new char[arg1.method331()];
			for (@Pc(29) int local29 = 0; local29 < local27.length; local29++) {
				local27[local29] = (char) arg1.method331();
			}
			aCharArrayArray3[local16] = local27;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(BLclient!jb;)V")
	private static void method285(@OriginalArg(1) Class1_Sub3_Sub3 arg0) {
		@Pc(2) int local2 = arg0.method336();
		aCharArrayArray1 = new char[local2][];
		aByteArrayArrayArray8 = new byte[local2][][];
		method288(arg0, aByteArrayArrayArray8, aCharArrayArray1);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILclient!jb;)V")
	private static void method286(@OriginalArg(1) Class1_Sub3_Sub3 arg0) {
		@Pc(2) int local2 = arg0.method336();
		aCharArrayArray2 = new char[local2][];
		method289(arg0, aCharArrayArray2);
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(ILclient!jb;)V")
	private static void method287(@OriginalArg(1) Class1_Sub3_Sub3 arg0) {
		anIntArray161 = new int[arg0.method336()];
		for (@Pc(9) int local9 = 0; local9 < anIntArray161.length; local9++) {
			anIntArray161[local9] = arg0.method333();
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILclient!jb;[[[B[[C)V")
	private static void method288(@OriginalArg(1) Class1_Sub3_Sub3 arg0, @OriginalArg(2) byte[][][] arg1, @OriginalArg(3) char[][] arg2) {
		for (@Pc(6) int local6 = 0; local6 < arg2.length; local6++) {
			@Pc(12) char[] local12 = new char[arg0.method331()];
			for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
				local12[local14] = (char) arg0.method331();
			}
			arg2[local6] = local12;
			@Pc(36) byte[][] local36 = new byte[arg0.method331()][2];
			for (@Pc(38) int local38 = 0; local38 < local36.length; local38++) {
				local36[local38][0] = (byte) arg0.method331();
				local36[local38][1] = (byte) arg0.method331();
			}
			if (local36.length > 0) {
				arg1[local6] = local36;
			}
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!jb;I[[C)V")
	private static void method289(@OriginalArg(0) Class1_Sub3_Sub3 arg0, @OriginalArg(2) char[][] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(9) char[] local9 = new char[arg0.method331()];
			for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
				local9[local11] = (char) arg0.method331();
			}
			arg1[local3] = local9;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(B[C)V")
	private static void method290(@OriginalArg(1) char[] arg0) {
		for (@Pc(17) int local17 = 0; local17 < arg0.length; local17++) {
			if (!method291(arg0[local17])) {
				arg0[local17] = ' ';
			}
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(CI)Z")
	private static boolean method291(@OriginalArg(0) char arg0) {
		return arg0 >= ' ' && arg0 <= '\u007f' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method292(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg0 != -12807) {
			throw new NullPointerException();
		}
		@Pc(10) long local10 = System.currentTimeMillis();
		@Pc(14) char[] local14 = arg1.toLowerCase().toCharArray();
		method290(local14);
		method300(local14);
		method295(local14);
		method296(local14);
		method309(local14);
		for (@Pc(31) int local31 = 0; local31 < aStringArray6.length; local31++) {
			@Pc(40) int local40 = -1;
			while ((local40 = arg1.indexOf(aStringArray6[local31], local40 + 1)) != -1) {
				@Pc(47) char[] local47 = aStringArray6[local31].toCharArray();
				for (@Pc(49) int local49 = 0; local49 < local47.length; local49++) {
					local14[local49 + local40] = local47[local49];
				}
			}
		}
		method293(arg1.toCharArray(), local14);
		method294(local14);
		@Pc(91) long local91 = System.currentTimeMillis();
		return (new String(local14)).trim();
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "([CB[C)V")
	private static void method293(@OriginalArg(0) char[] arg0, @OriginalArg(2) char[] arg1) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			if (arg1[local13] != '*' && method317(arg0[local13])) {
				arg1[local13] = arg0[local13];
			}
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z[C)V")
	private static void method294(@OriginalArg(1) char[] arg0) {
		@Pc(3) boolean local3 = true;
		for (@Pc(8) int local8 = 0; local8 < arg0.length; local8++) {
			@Pc(14) char local14 = arg0[local8];
			if (!method314(local14)) {
				local3 = true;
			} else if (local3) {
				if (method316(local14)) {
					local3 = false;
				}
			} else if (method317(local14)) {
				arg0[local8] = (char) (local14 + 'a' - 65);
			}
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "([CI)V")
	private static void method295(@OriginalArg(0) char[] arg0) {
		for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
			for (@Pc(14) int local14 = aCharArrayArray1.length - 1; local14 >= 0; local14--) {
				method304(arg0, aCharArrayArray1[local14], aByteArrayArrayArray8[local14]);
			}
		}
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "([CI)V")
	private static void method296(@OriginalArg(0) char[] arg0) {
		@Pc(3) char[] local3 = (char[]) arg0.clone();
		@Pc(18) char[] local18 = new char[] { '(', 'a', ')' };
		method304(local3, local18, null);
		@Pc(27) char[] local27 = (char[]) arg0.clone();
		@Pc(42) char[] local42 = new char[] { 'd', 'o', 't' };
		method304(local27, local42, null);
		for (@Pc(56) int local56 = aCharArrayArray2.length - 1; local56 >= 0; local56--) {
			method297(local27, local3, arg0, aCharArrayArray2[local56]);
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "([CZ[C[C[C)V")
	private static void method297(@OriginalArg(0) char[] arg0, @OriginalArg(2) char[] arg1, @OriginalArg(3) char[] arg2, @OriginalArg(4) char[] arg3) {
		if (arg3.length > arg2.length) {
			return;
		}
		@Pc(23) int local23;
		for (@Pc(15) int local15 = 0; local15 <= arg2.length - arg3.length; local15 += local23) {
			@Pc(19) int local19 = local15;
			@Pc(21) int local21 = 0;
			local23 = 1;
			label55: while (true) {
				while (true) {
					if (local19 >= arg2.length) {
						break label55;
					}
					@Pc(31) char local31 = arg2[local19];
					@Pc(33) char local33 = 0;
					if (local19 + 1 < arg2.length) {
						local33 = arg2[local19 + 1];
					}
					@Pc(58) int local58;
					if (local21 < arg3.length && (local58 = method306(arg3[local21], local33, local31)) > 0) {
						local19 += local58;
						local21++;
					} else {
						if (local21 == 0) {
							break label55;
						}
						@Pc(79) int local79;
						if ((local79 = method306(arg3[local21 - 1], local33, local31)) > 0) {
							local19 += local79;
							if (local21 == 1) {
								local23++;
							}
						} else {
							if (local21 >= arg3.length || !method312(local31)) {
								break label55;
							}
							local19++;
						}
					}
				}
			}
			if (local21 >= arg3.length) {
				@Pc(110) boolean local110 = false;
				@Pc(116) int local116 = method298(local15, anInt383, arg1, arg2);
				@Pc(124) int local124 = method299(arg2, local19 - 1, arg0);
				if (local116 > 2 || local124 > 2) {
					local110 = true;
				}
				if (local110) {
					for (@Pc(136) int local136 = local15; local136 < local19; local136++) {
						arg2[local136] = '*';
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(II[C[C)I")
	private static int method298(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) char[] arg3) {
		if (arg0 == 0) {
			return 2;
		}
		for (@Pc(9) int local9 = arg0 - 1; local9 >= 0 && method312(arg3[local9]); local9--) {
			if (arg3[local9] == '@') {
				return 3;
			}
		}
		if (arg1 != 6) {
			return 3;
		}
		@Pc(34) int local34 = 0;
		for (@Pc(38) int local38 = arg0 - 1; local38 >= 0 && method312(arg2[local38]); local38--) {
			if (arg2[local38] == '*') {
				local34++;
			}
		}
		if (local34 >= 3) {
			return 4;
		} else if (method312(arg3[arg0 - 1])) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "([CIZ[C)I")
	private static int method299(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) char[] arg2) {
		if (arg1 + 1 == arg0.length) {
			return 2;
		}
		@Pc(13) int local13 = arg1 + 1;
		while (true) {
			if (local13 < arg0.length && method312(arg0[local13])) {
				if (arg0[local13] != '.' && arg0[local13] != ',') {
					local13++;
					continue;
				}
				return 3;
			}
			@Pc(40) int local40 = 0;
			for (@Pc(44) int local44 = arg1 + 1; local44 < arg0.length && method312(arg2[local44]); local44++) {
				if (arg2[local44] == '*') {
					local40++;
				}
			}
			if (local40 >= 3) {
				return 4;
			}
			if (method312(arg0[arg1 + 1])) {
				return 1;
			}
			return 0;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I[C)V")
	private static void method300(@OriginalArg(1) char[] arg0) {
		@Pc(3) char[] local3 = (char[]) arg0.clone();
		@Pc(18) char[] local18 = new char[] { 'd', 'o', 't' };
		method304(local3, local18, null);
		@Pc(27) char[] local27 = (char[]) arg0.clone();
		@Pc(50) char[] local50 = new char[] { 's', 'l', 'a', 's', 'h' };
		method304(local27, local50, null);
		for (@Pc(61) int local61 = 0; local61 < aCharArrayArray3.length; local61++) {
			method301(local27, local3, aCharArrayArray3[local61], anIntArray162[local61], arg0);
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "([C[C[CII[C)V")
	private static void method301(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) char[] arg4) {
		if (arg2.length > arg4.length) {
			return;
		}
		@Pc(23) int local23;
		for (@Pc(15) int local15 = 0; local15 <= arg4.length - arg2.length; local15 += local23) {
			@Pc(19) int local19 = local15;
			@Pc(21) int local21 = 0;
			local23 = 1;
			label117: while (true) {
				while (true) {
					if (local19 >= arg4.length) {
						break label117;
					}
					@Pc(31) char local31 = arg4[local19];
					@Pc(33) char local33 = 0;
					if (local19 + 1 < arg4.length) {
						local33 = arg4[local19 + 1];
					}
					@Pc(58) int local58;
					if (local21 < arg2.length && (local58 = method306(arg2[local21], local33, local31)) > 0) {
						local19 += local58;
						local21++;
					} else {
						if (local21 == 0) {
							break label117;
						}
						@Pc(79) int local79;
						if ((local79 = method306(arg2[local21 - 1], local33, local31)) > 0) {
							local19 += local79;
							if (local21 == 1) {
								local23++;
							}
						} else {
							if (local21 >= arg2.length || !method312(local31)) {
								break label117;
							}
							local19++;
						}
					}
				}
			}
			if (local21 >= arg2.length) {
				@Pc(110) boolean local110 = false;
				@Pc(116) int local116 = method302(aByte20, local15, arg4, arg1);
				@Pc(124) int local124 = method303(arg4, local19 - 1, arg0);
				if (arg3 == 1 && local116 > 0 && local124 > 0) {
					local110 = true;
				}
				if (arg3 == 2 && (local116 > 2 && local124 > 0 || local116 > 0 && local124 > 2)) {
					local110 = true;
				}
				if (arg3 == 3 && local116 > 0 && local124 > 2) {
					local110 = true;
				}
				@Pc(167) boolean local167;
				if (arg3 == 3 && local116 > 2 && local124 > 0) {
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
								if (method312(arg4[local190])) {
									break;
								}
								local174 = local190;
							} else if (!method312(arg4[local190])) {
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
									if (arg0[local190] != '*') {
										break;
									}
									local178 = local190;
								} else if (arg0[local190] == '*') {
									local178 = local190;
									local186 = true;
								}
							}
						}
						local186 = false;
						for (local190 = local178 + 1; local190 < arg4.length; local190++) {
							if (local186) {
								if (method312(arg4[local190])) {
									break;
								}
								local178 = local190;
							} else if (!method312(arg4[local190])) {
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

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(BI[C[C)I")
	private static int method302(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) char[] arg3) {
		if (arg0 != aByte20) {
			anInt383 = 122;
		}
		if (arg1 == 0) {
			return 2;
		}
		@Pc(14) int local14 = arg1 - 1;
		while (true) {
			if (local14 >= 0 && method312(arg2[local14])) {
				if (arg2[local14] != ',' && arg2[local14] != '.') {
					local14--;
					continue;
				}
				return 3;
			}
			@Pc(39) int local39 = 0;
			for (@Pc(43) int local43 = arg1 - 1; local43 >= 0 && method312(arg3[local43]); local43--) {
				if (arg3[local43] == '*') {
					local39++;
				}
			}
			if (local39 >= 3) {
				return 4;
			}
			if (method312(arg2[arg1 - 1])) {
				return 1;
			}
			return 0;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "([CII[C)I")
	private static int method303(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) char[] arg2) {
		if (arg1 + 1 == arg0.length) {
			return 2;
		}
		@Pc(17) int local17 = arg1 + 1;
		while (true) {
			if (local17 < arg0.length && method312(arg0[local17])) {
				if (arg0[local17] != '\\' && arg0[local17] != '/') {
					local17++;
					continue;
				}
				return 3;
			}
			@Pc(44) int local44 = 0;
			for (@Pc(48) int local48 = arg1 + 1; local48 < arg0.length && method312(arg2[local48]); local48++) {
				if (arg2[local48] == '*') {
					local44++;
				}
			}
			if (local44 >= 5) {
				return 4;
			}
			if (method312(arg0[arg1 + 1])) {
				return 1;
			}
			return 0;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "([C[CI[[B)V")
	private static void method304(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(3) byte[][] arg2) {
		if (arg1.length > arg0.length) {
			return;
		}
		@Pc(24) int local24;
		for (@Pc(14) int local14 = 0; local14 <= arg0.length - arg1.length; local14 += local24) {
			@Pc(18) int local18 = local14;
			@Pc(20) int local20 = 0;
			@Pc(22) int local22 = 0;
			local24 = 1;
			@Pc(26) boolean local26 = false;
			@Pc(34) char var10;
			@Pc(36) char var11;
			label123: while (true) {
				while (true) {
					if (local18 >= arg0.length) {
						break label123;
					}
					var10 = arg0[local18];
					var11 = '\u0000';
					if (local18 + 1 < arg0.length) {
						var11 = arg0[local18 + 1];
					}
					@Pc(61) int local61;
					if (local20 < arg1.length && (local61 = method307(var10, arg1[local20], var11)) > 0) {
						local18 += local61;
						local20++;
					} else {
						if (local20 == 0) {
							break label123;
						}
						@Pc(82) int local82;
						if ((local82 = method307(var10, arg1[local20 - 1], var11)) > 0) {
							local18 += local82;
							if (local20 == 1) {
								local24++;
							}
						} else {
							if (local20 >= arg1.length || !method313(anInt384, var10)) {
								break label123;
							}
							if (method312(var10) && var10 != '\'') {
								local26 = true;
							}
							local18++;
							local22++;
							if (local22 * 100 / (local18 - local14) > 90) {
								break label123;
							}
						}
					}
				}
			}
			if (local20 >= arg1.length) {
				@Pc(133) boolean local133 = true;
				if (local26) {
					@Pc(179) boolean local179 = false;
					@Pc(181) boolean local181 = false;
					if (local14 - 1 < 0 || method312(arg0[local14 - 1]) && arg0[local14 - 1] != '\'') {
						local179 = true;
					}
					if (local18 >= arg0.length || method312(arg0[local18]) && arg0[local18] != '\'') {
						local181 = true;
					}
					if (!local179 || !local181) {
						@Pc(225) boolean local225 = false;
						@Pc(229) int local229 = local14 - 2;
						if (local179) {
							local229 = local14;
						}
						while (!local225 && local229 < local18) {
							if (local229 >= 0 && (!method312(arg0[local229]) || arg0[local229] == '\'')) {
								@Pc(251) char[] local251 = new char[3];
								@Pc(253) int local253;
								for (local253 = 0; local253 < 3 && local229 + local253 < arg0.length && (!method312(arg0[local229 + local253]) || arg0[local229 + local253] == '\''); local253++) {
									local251[local253] = arg0[local229 + local253];
								}
								@Pc(291) boolean local291 = true;
								if (local253 == 0) {
									local291 = false;
								}
								if (local253 < 3 && local229 - 1 >= 0 && (!method312(arg0[local229 - 1]) || arg0[local229 - 1] == '\'')) {
									local291 = false;
								}
								if (local291 && !method318(local251)) {
									local225 = true;
								}
							}
							local229++;
						}
						if (!local225) {
							local133 = false;
						}
					}
				} else {
					var10 = ' ';
					if (local14 - 1 >= 0) {
						var10 = arg0[local14 - 1];
					}
					var11 = ' ';
					if (local18 < arg0.length) {
						var11 = arg0[local18];
					}
					@Pc(161) byte local161 = method308(var10);
					@Pc(165) byte local165 = method308(var11);
					if (arg2 != null && method305(arg2, local165, local161)) {
						local133 = false;
					}
				}
				if (local133) {
					@Pc(341) int local341 = 0;
					for (@Pc(343) int local343 = local14; local343 < local18; local343++) {
						if (method315(arg0[local343])) {
							local341++;
						}
					}
					if (local341 * 100 / (local18 - local14) <= 50) {
						for (@Pc(367) int local367 = local14; local367 < local18; local367++) {
							arg0[local367] = '*';
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "([[BBBB)Z")
	private static boolean method305(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) byte arg2) {
		@Pc(1) int local1 = 0;
		if (arg0[0][0] == arg2 && arg0[0][1] == arg1) {
			return true;
		}
		@Pc(29) int local29 = arg0.length - 1;
		if (arg0[local29][0] == arg2 && arg0[local29][1] == arg1) {
			return true;
		}
		do {
			@Pc(51) int local51 = (local1 + local29) / 2;
			if (arg0[local51][0] == arg2 && arg0[local51][1] == arg1) {
				return true;
			}
			if (arg2 < arg0[local51][0] || arg2 == arg0[local51][0] && arg1 < arg0[local51][1]) {
				local29 = local51;
			} else {
				local1 = local51;
			}
		} while (local1 != local29 && local1 + 1 != local29);
		return false;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZCCC)I")
	private static int method306(@OriginalArg(1) char arg0, @OriginalArg(2) char arg1, @OriginalArg(3) char arg2) {
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
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(CCIC)I")
	private static int method307(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(3) char arg2) {
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
				if (arg0 == '1' && arg2 == '3') {
					return 2;
				}
				return 0;
			}
			if (arg1 == 'c') {
				if (arg0 != '(' && arg0 != '<' && arg0 != '{' && arg0 != '[') {
					return 0;
				}
				return 1;
			}
			if (arg1 == 'd') {
				return 0;
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
				if (arg0 != '9' && arg0 != '6') {
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
				if (arg0 == '7') {
					return 1;
				}
				return 0;
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
				} else if (arg0 == '(' && arg2 == ')' || arg0 == '{' && arg2 == '}' || arg0 == '[' && arg2 == ']') {
					return 2;
				} else {
					return 0;
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
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(BC)B")
	private static byte method308(@OriginalArg(1) char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z') {
			return (byte) (arg0 + 1 - 'a');
		} else if (arg0 == '\'') {
			return 28;
		} else if (arg0 >= '0' && arg0 <= '9') {
			return (byte) (arg0 + 29 - '0');
		} else {
			return 27;
		}
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "([CI)V")
	private static void method309(@OriginalArg(0) char[] arg0) {
		@Pc(10) int local10 = 0;
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = 0;
		while (true) {
			do {
				@Pc(113) int local113;
				if ((local113 = method310(arg0, local10)) == -1) {
					return;
				}
				@Pc(18) boolean local18 = false;
				for (@Pc(20) int local20 = local10; local20 >= 0 && local20 < local113 && !local18; local20++) {
					if (!method312(arg0[local20]) && !method313(anInt384, arg0[local20])) {
						local18 = true;
					}
				}
				if (local18) {
					local12 = 0;
				}
				if (local12 == 0) {
					local14 = local113;
				}
				local10 = method311(arg0, local113);
				@Pc(59) int local59 = 0;
				for (@Pc(61) int local61 = local113; local61 < local10; local61++) {
					local59 = local59 * 10 + arg0[local61] - 48;
				}
				if (local59 <= 255 && local10 - local113 <= 8) {
					local12++;
				} else {
					local12 = 0;
				}
			} while (local12 != 4);
			for (@Pc(95) int local95 = local14; local95 < local10; local95++) {
				arg0[local95] = '*';
			}
			local12 = 0;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "([CII)I")
	private static int method310(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(5) int local5 = arg1; local5 < arg0.length && local5 >= 0; local5++) {
			if (arg0[local5] >= '0' && arg0[local5] <= '9') {
				return local5;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I[CI)I")
	private static int method311(@OriginalArg(1) char[] arg0, @OriginalArg(2) int arg1) {
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
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZC)Z")
	private static boolean method312(@OriginalArg(1) char arg0) {
		return !method314(arg0) && !method315(arg0);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IC)Z")
	private static boolean method313(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		if (arg0 != 0) {
			throw new NullPointerException();
		} else if (arg1 >= 'a' && arg1 <= 'z') {
			return arg1 == 'v' || arg1 == 'x' || arg1 == 'j' || arg1 == 'q' || arg1 == 'z';
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(CI)Z")
	private static boolean method314(@OriginalArg(0) char arg0) {
		return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(CI)Z")
	private static boolean method315(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(BC)Z")
	private static boolean method316(@OriginalArg(1) char arg0) {
		return arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(CB)Z")
	private static boolean method317(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z';
	}

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "([CI)Z")
	private static boolean method318(@OriginalArg(0) char[] arg0) {
		@Pc(3) boolean local3 = true;
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			if (!method315(arg0[local13]) && arg0[local13] != '\u0000') {
				local3 = false;
			}
		}
		if (local3) {
			return true;
		}
		@Pc(40) int local40 = method319(arg0);
		@Pc(42) int local42 = 0;
		@Pc(47) int local47 = anIntArray161.length - 1;
		if (local40 == anIntArray161[0] || local40 == anIntArray161[local47]) {
			return true;
		}
		do {
			@Pc(65) int local65 = (local42 + local47) / 2;
			if (local40 == anIntArray161[local65]) {
				return true;
			}
			if (local40 < anIntArray161[local65]) {
				local47 = local65;
			} else {
				local42 = local65;
			}
		} while (local42 != local47 && local42 + 1 != local47);
		return false;
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(B[C)I")
	private static int method319(@OriginalArg(1) char[] arg0) {
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
	}
}
