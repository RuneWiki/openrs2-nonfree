import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static369 {

	@OriginalMember(owner = "client!sk", name = "O", descriptor = "Lclient!sv;")
	public static Class195_Sub1 aClass195_Sub1_2;

	@OriginalMember(owner = "client!sk", name = "E", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_158 = new Class12(35, 14);

	@OriginalMember(owner = "client!sk", name = "N", descriptor = "Z")
	public static boolean aBoolean698 = false;

	@OriginalMember(owner = "client!sk", name = "P", descriptor = "[Z")
	public static final boolean[] aBooleanArray23 = new boolean[100];

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "(Z)V")
	public static void method4899() {
		@Pc(7) Class98 local7 = null;
		try {
			@Pc(13) Class232 local13 = Static183.aClass83_2.method1877("3", false);
			while (local13.anInt6402 == 0) {
				Static223.method4582(1L);
			}
			if (local13.anInt6402 == 2) {
				throw new RuntimeException("Error opening file");
			}
			local7 = (Class98) local13.anObject8;
			@Pc(49) byte[] local49 = new byte[(int) local7.method2225()];
			if (local49.length == 0) {
				Static146.aString34 = "";
				Static279.aString59 = "";
			} else {
				@Pc(67) int local67;
				for (@Pc(54) int local54 = 0; local54 < local49.length; local54 += local67) {
					local67 = local7.method2223(local49.length - local54, local54, local49);
					if (local67 == -1) {
						throw new IOException("EOF");
					}
				}
				@Pc(88) Class1_Sub28 local88 = new Class1_Sub28(local49);
				@Pc(92) int local92 = local88.method5337();
				if (local92 > 50) {
					throw new RuntimeException("Bad length");
				}
				local88.anInt6812 = local92 + 1;
				if (!local88.method5372()) {
					throw new RuntimeException("Invalid CRC");
				}
				local88.anInt6812 = 1;
				@Pc(121) int local121 = local88.method5337();
				if (local121 != 0) {
					throw new RuntimeException("Invalid version " + local121);
				}
				Static146.aString34 = local88.method5385();
				Static279.aString59 = local88.method5385();
			}
		} catch (@Pc(153) Exception local153) {
			Static279.aString59 = "";
			Static146.aString34 = "";
		}
		try {
			if (local7 != null) {
				local7.method2224();
			}
		} catch (@Pc(164) Exception local164) {
		}
	}

	@OriginalMember(owner = "client!sk", name = "e", descriptor = "(I)V")
	public static void method4900() {
		Static150.method5310(Static453.aClass136_Sub1_1.aBoolean504);
		Static112.aClass1_Sub6_Sub2_2 = new Class1_Sub6_Sub2();
		Static112.aClass1_Sub6_Sub2_2.method4482();
		Static353.aClass125_1 = Static61.method1289(0, 22050, Static392.aCanvas5, Static183.aClass83_2);
		Static353.aClass125_1.method5856(Static112.aClass1_Sub6_Sub2_2);
		Static284.method3917(Static459.aClass82_100, Static112.aClass1_Sub6_Sub2_2, Static348.aClass82_81, Static257.aClass82_59);
		Static356.aClass125_2 = Static61.method1289(1, 2048, Static392.aCanvas5, Static183.aClass83_2);
		Static355.aClass1_Sub6_Sub4_2 = new Class1_Sub6_Sub4();
		Static356.aClass125_2.method5856(Static355.aClass1_Sub6_Sub4_2);
		Static250.aClass255_1 = new Class255(22050, Static228.anInt4846);
		Static351.anInt6023 = Static447.aClass82_54.method1835("scape main");
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(I[B)[B")
	public static byte[] method4903(@OriginalArg(1) byte[] arg0) {
		@Pc(13) Class1_Sub28 local13 = new Class1_Sub28(arg0);
		@Pc(17) int local17 = local13.method5337();
		@Pc(21) int local21 = local13.method5355();
		if (local21 < 0 || Static328.anInt5611 != 0 && Static328.anInt5611 < local21) {
			throw new RuntimeException();
		} else if (local17 == 0) {
			@Pc(43) byte[] local43 = new byte[local21];
			local13.method5344(local43, local21);
			return local43;
		} else {
			@Pc(55) int local55 = local13.method5355();
			if (local55 < 0 || Static328.anInt5611 != 0 && Static328.anInt5611 < local55) {
				throw new RuntimeException();
			}
			@Pc(72) byte[] local72 = new byte[local55];
			if (local17 == 1) {
				Static402.method5233(local72, local55, arg0, local21);
			} else {
				Static255.aClass170_2.method3829(local13, local72);
			}
			return local72;
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZLjava/lang/String;B)V")
	public static void method4904(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		@Pc(4) String local4 = arg1.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(26) int local26 = arg0 ? 32768 : 0;
		@Pc(37) int local37 = local26 + (arg0 ? Static456.aClass9_2.anInt188 : Static456.aClass9_2.anInt189);
		for (@Pc(39) int local39 = local26; local39 < local37; local39++) {
			@Pc(46) Class1_Sub5_Sub16 local46 = Static456.aClass9_2.method145(local39);
			if (local46.aBoolean697 && local46.method4897().toLowerCase().indexOf(local4) != -1) {
				if (local13 >= 50) {
					Static253.anInt4611 = -1;
					Static394.aShortArray102 = null;
					return;
				}
				if (local11.length <= local13) {
					@Pc(81) short[] local81 = new short[local11.length * 2];
					for (@Pc(83) int local83 = 0; local83 < local13; local83++) {
						local81[local83] = local11[local83];
					}
					local11 = local81;
				}
				local11[local13++] = (short) local39;
			}
		}
		Static401.anInt6678 = 0;
		Static394.aShortArray102 = local11;
		Static253.anInt4611 = local13;
		@Pc(124) String[] local124 = new String[Static253.anInt4611];
		for (@Pc(126) int local126 = 0; local126 < Static253.anInt4611; local126++) {
			local124[local126] = Static456.aClass9_2.method145(local11[local126]).method4897();
		}
		Static63.method1066(Static394.aShortArray102, local124);
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIII)V")
	public static void method4905(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(10) int local10 = arg0 - arg4;
		@Pc(14) int local14 = arg1 - arg2;
		if (local14 == 0) {
			if (local10 != 0) {
				Static188.method2690(arg0, arg4, arg2, arg3);
			}
		} else if (local10 == 0) {
			Static249.method3540(arg1, arg2, arg3, arg4);
		} else {
			if (local10 < 0) {
				local10 = -local10;
			}
			if (local14 < 0) {
				local14 = -local14;
			}
			@Pc(61) boolean local61 = local10 > local14;
			@Pc(65) int local65;
			@Pc(67) int local67;
			if (local61) {
				local65 = arg2;
				local67 = arg1;
				arg2 = arg4;
				arg4 = local65;
				arg1 = arg0;
				arg0 = local67;
			}
			if (arg2 > arg1) {
				local65 = arg2;
				arg2 = arg1;
				local67 = arg4;
				arg1 = local65;
				arg4 = arg0;
				arg0 = local67;
			}
			local65 = arg4;
			local67 = arg1 - arg2;
			@Pc(106) int local106 = arg0 - arg4;
			@Pc(111) int local111 = -(local67 >> 1);
			@Pc(122) int local122 = arg0 <= arg4 ? -1 : 1;
			if (local106 < 0) {
				local106 = -local106;
			}
			@Pc(139) int local139;
			if (local61) {
				for (local139 = arg2; local139 <= arg1; local139++) {
					Static67.anIntArrayArray13[local139][local65] = arg3;
					local111 += local106;
					if (local111 > 0) {
						local65 += local122;
						local111 -= local67;
					}
				}
			} else {
				for (local139 = arg2; local139 <= arg1; local139++) {
					local111 += local106;
					Static67.anIntArrayArray13[local65][local139] = arg3;
					if (local111 > 0) {
						local65 += local122;
						local111 -= local67;
					}
				}
			}
		}
	}
}
