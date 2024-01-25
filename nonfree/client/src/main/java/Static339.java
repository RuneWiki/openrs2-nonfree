import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IBILclient!at;)V")
	public static void method4552(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class16 arg2) {
		Static351.anInt5968 = arg1;
		Static332.aClass16_17 = arg2;
		Static113.anInt2094 = arg0;
	}

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "(I)V")
	public static void method4553() {
		@Pc(7) Class178 local7 = null;
		try {
			@Pc(15) Class91 local15 = Static79.aClass183_2.method3921("3", false);
			while (local15.anInt2446 == 0) {
				Static429.method5376(1L);
			}
			if (local15.anInt2446 == 2) {
				throw new RuntimeException("Error opening file");
			}
			local7 = (Class178) local15.anObject3;
			@Pc(47) byte[] local47 = new byte[(int) local7.method3780()];
			if (local47.length == 0) {
				Static250.aString118 = "";
				Static341.aString160 = "";
			} else {
				@Pc(67) int local67;
				for (@Pc(55) int local55 = 0; local55 < local47.length; local55 += local67) {
					local67 = local7.method3777(local55, local47.length - local55, local47);
					if (local67 == -1) {
						throw new IOException("EOF");
					}
				}
				@Pc(89) Class2_Sub13 local89 = new Class2_Sub13(local47);
				@Pc(93) int local93 = local89.method3580();
				if (local93 > 50) {
					throw new RuntimeException("Bad length");
				}
				local89.anInt4347 = local93 + 1;
				if (!local89.method3552()) {
					throw new RuntimeException("Invalid CRC");
				}
				local89.anInt4347 = 1;
				@Pc(122) int local122 = local89.method3580();
				if (local122 != 0) {
					throw new RuntimeException("Invalid version " + local122);
				}
				Static250.aString118 = local89.method3599();
				Static341.aString160 = local89.method3599();
			}
		} catch (@Pc(153) Exception local153) {
			Static341.aString160 = "";
			Static250.aString118 = "";
		}
		try {
			if (local7 != null) {
				local7.method3779();
			}
		} catch (@Pc(164) Exception local164) {
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(JZ)Ljava/lang/String;")
	public static String method4554(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(37) int local37 = 0;
			for (@Pc(39) long local39 = arg0; local39 != 0L; local39 /= 37L) {
				local37++;
			}
			@Pc(57) StringBuffer local57 = new StringBuffer(local37);
			while (arg0 != 0L) {
				@Pc(61) long local61 = arg0;
				arg0 /= 37L;
				@Pc(75) char local75 = Static164.aCharArray7[(int) (local61 - arg0 * 37L)];
				if (local75 == '_') {
					@Pc(83) int local83 = local57.length() - 1;
					local75 = ' ';
					local57.setCharAt(local83, Character.toUpperCase(local57.charAt(local83)));
				}
				local57.append(local75);
			}
			local57.reverse();
			local57.setCharAt(0, Character.toUpperCase(local57.charAt(0)));
			return local57.toString();
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg4 - arg3;
		@Pc(21) int local21 = arg1 - arg3;
		@Pc(25) int local25 = arg4 * arg4;
		@Pc(29) int local29 = arg1 * arg1;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(65) int local65 = arg1 << 1;
		@Pc(69) int local69 = local21 << 1;
		@Pc(78) int local78 = local41 + local25 * (1 - local65);
		@Pc(87) int local87 = local29 - local45 * (local65 - 1);
		@Pc(96) int local96 = (1 - local69) * local33 + local49;
		@Pc(105) int local105 = local37 - (local69 - 1) * local53;
		@Pc(109) int local109 = local25 << 2;
		@Pc(113) int local113 = local29 << 2;
		@Pc(117) int local117 = local33 << 2;
		@Pc(121) int local121 = local37 << 2;
		@Pc(125) int local125 = local41 * 3;
		@Pc(131) int local131 = (local65 - 3) * local45;
		@Pc(135) int local135 = local49 * 3;
		@Pc(141) int local141 = (local69 - 3) * local53;
		@Pc(143) int local143 = local113;
		@Pc(149) int local149 = local109 * (arg1 - 1);
		@Pc(151) int local151 = local121;
		@Pc(157) int local157 = (local21 - 1) * local117;
		@Pc(161) int[] local161 = Static229.anIntArrayArray26[arg5];
		Static216.method2862(arg6 - arg4, arg6 + -local16, arg0, local161);
		Static216.method2862(arg6 - local16, local16 + arg6, arg2, local161);
		Static216.method2862(local16 + arg6, arg4 + arg6, arg0, local161);
		while (local9 > 0) {
			@Pc(203) boolean local203 = local21 >= local9;
			if (local203) {
				if (local96 < 0) {
					while (local96 < 0) {
						local105 += local151;
						local96 += local135;
						local151 += local121;
						local11++;
						local135 += local121;
					}
				}
				if (local105 < 0) {
					local96 += local135;
					local105 += local151;
					local11++;
					local151 += local121;
					local135 += local121;
				}
				local105 += -local141;
				local96 += -local157;
				local141 -= local117;
				local157 -= local117;
			}
			if (local78 < 0) {
				while (local78 < 0) {
					local87 += local143;
					local78 += local125;
					local125 += local113;
					local7++;
					local143 += local113;
				}
			}
			if (local87 < 0) {
				local87 += local143;
				local78 += local125;
				local143 += local113;
				local125 += local113;
				local7++;
			}
			local87 += -local131;
			local78 += -local149;
			local131 -= local109;
			local9--;
			local149 -= local109;
			@Pc(339) int local339 = arg5 - local9;
			@Pc(343) int local343 = arg5 + local9;
			@Pc(347) int local347 = local7 + arg6;
			@Pc(352) int local352 = arg6 - local7;
			if (local203) {
				@Pc(377) int local377 = arg6 + local11;
				@Pc(381) int local381 = arg6 - local11;
				Static216.method2862(local352, local381, arg0, Static229.anIntArrayArray26[local339]);
				Static216.method2862(local381, local377, arg2, Static229.anIntArrayArray26[local339]);
				Static216.method2862(local377, local347, arg0, Static229.anIntArrayArray26[local339]);
				Static216.method2862(local352, local381, arg0, Static229.anIntArrayArray26[local343]);
				Static216.method2862(local381, local377, arg2, Static229.anIntArrayArray26[local343]);
				Static216.method2862(local377, local347, arg0, Static229.anIntArrayArray26[local343]);
			} else {
				Static216.method2862(local352, local347, arg0, Static229.anIntArrayArray26[local339]);
				Static216.method2862(local352, local347, arg0, Static229.anIntArrayArray26[local343]);
			}
		}
	}
}
