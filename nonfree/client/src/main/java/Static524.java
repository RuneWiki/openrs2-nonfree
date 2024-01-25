import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static524 {

	@OriginalMember(owner = "client!rq", name = "d", descriptor = "Lclient!dda;")
	public static Class66 aClass66_4;

	@OriginalMember(owner = "client!rq", name = "e", descriptor = "Lclient!gga;")
	public static Class124 aClass124_111;

	@OriginalMember(owner = "client!rq", name = "c", descriptor = "[[I")
	public static final int[][] anIntArrayArray46 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!rq", name = "g", descriptor = "I")
	public static int anInt9259 = 0;

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(ILjava/lang/String;Lclient!lea;I)Lclient!ck;")
	public static Class57 method8166(@OriginalArg(1) String arg0, @OriginalArg(2) Class101_Sub2 arg1, @OriginalArg(3) int arg2) {
		@Pc(11) long local11 = OpenGL.glCreateShaderObjectARB(arg2);
		OpenGL.glShaderSourceARB(local11, arg0);
		OpenGL.glCompileShaderARB(local11);
		OpenGL.glGetObjectParameterivARB(local11, 35713, Static510.anIntArray457, 0);
		if (Static510.anIntArray457[0] == 0) {
			if (Static510.anIntArray457[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local11, 35716, Static510.anIntArray457, 1);
			if (Static510.anIntArray457[1] > 1) {
				@Pc(53) byte[] local53 = new byte[Static510.anIntArray457[1]];
				OpenGL.glGetInfoLogARB(local11, Static510.anIntArray457[1], Static510.anIntArray457, 0, local53, 0);
				System.out.println(new String(local53));
			}
			if (Static510.anIntArray457[0] == 0) {
				OpenGL.glDeleteObjectARB(local11);
				return null;
			}
		}
		return new Class57(arg1, local11, arg2);
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lclient!nfa;III)V")
	public static void method8167(@OriginalArg(0) Class15_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class291 local12;
		if (arg2 < Static585.anInt10170) {
			local12 = Static193.aClass291ArrayArrayArray2[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass15_Sub3_Sub5_1 != null && local12.aClass15_Sub3_Sub5_1.method9439()) {
				arg0.method9426(Static536.anInt4502, 0, Static64.aClass101_1, local12.aClass15_Sub3_Sub5_1, true, 0);
			}
		}
		if (arg3 < Static585.anInt10170) {
			local12 = Static193.aClass291ArrayArrayArray2[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass15_Sub3_Sub5_1 != null && local12.aClass15_Sub3_Sub5_1.method9439()) {
				arg0.method9426(0, Static536.anInt4502, Static64.aClass101_1, local12.aClass15_Sub3_Sub5_1, true, 0);
			}
		}
		if (arg2 < Static585.anInt10170 && arg3 < Static202.anInt4238) {
			local12 = Static193.aClass291ArrayArrayArray2[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass15_Sub3_Sub5_1 != null && local12.aClass15_Sub3_Sub5_1.method9439()) {
				arg0.method9426(Static536.anInt4502, Static536.anInt4502, Static64.aClass101_1, local12.aClass15_Sub3_Sub5_1, true, 0);
			}
		}
		if (arg2 < Static585.anInt10170 && arg3 > 0) {
			local12 = Static193.aClass291ArrayArrayArray2[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass15_Sub3_Sub5_1 != null && local12.aClass15_Sub3_Sub5_1.method9439()) {
				arg0.method9426(Static536.anInt4502, -Static536.anInt4502, Static64.aClass101_1, local12.aClass15_Sub3_Sub5_1, true, 0);
			}
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IBIIII)V")
	public static void method8168(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(13) int local13 = arg4 * arg4;
		@Pc(17) int local17 = arg3 * arg3;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg3 << 1;
		@Pc(38) int local38 = local21 + (1 - local29) * local13;
		@Pc(47) int local47 = local17 - local25 * (local29 - 1);
		@Pc(51) int local51 = local13 << 2;
		@Pc(55) int local55 = local17 << 2;
		@Pc(63) int local63 = local21 * 3;
		@Pc(71) int local71 = ((arg3 << 1) - 3) * local25;
		@Pc(81) int local81 = local55;
		@Pc(87) int local87 = (arg3 - 1) * local51;
		@Pc(105) int local105;
		@Pc(114) int local114;
		if (arg0 >= Static427.anInt7845 && Static631.anInt10922 >= arg0) {
			local105 = Static198.method3808(Static407.anInt7583, Static457.anInt8209, arg1 + arg4);
			local114 = Static198.method3808(Static407.anInt7583, Static457.anInt8209, arg1 - arg4);
			Static567.method8614(local114, local105, Static186.anIntArrayArray12[arg0], arg2);
		}
		while (local9 > 0) {
			if (local38 < 0) {
				while (local38 < 0) {
					local38 += local63;
					local47 += local81;
					local63 += local55;
					local7++;
					local81 += local55;
				}
			}
			if (local47 < 0) {
				local47 += local81;
				local38 += local63;
				local63 += local55;
				local7++;
				local81 += local55;
			}
			local38 += -local87;
			local47 += -local71;
			local87 -= local51;
			local9--;
			local71 -= local51;
			local105 = arg0 - local9;
			local114 = local9 + arg0;
			if (Static427.anInt7845 <= local114 && Static631.anInt10922 >= local105) {
				@Pc(218) int local218 = Static198.method3808(Static407.anInt7583, Static457.anInt8209, arg1 + local7);
				@Pc(226) int local226 = Static198.method3808(Static407.anInt7583, Static457.anInt8209, arg1 - local7);
				if (Static427.anInt7845 <= local105) {
					Static567.method8614(local226, local218, Static186.anIntArrayArray12[local105], arg2);
				}
				if (local114 <= Static631.anInt10922) {
					Static567.method8614(local226, local218, Static186.anIntArrayArray12[local114], arg2);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(JZ)Ljava/lang/String;")
	public static String method8169(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(39) int local39 = 0;
			@Pc(41) long local41 = arg0;
			while (local41 != 0L) {
				local41 /= 37L;
				local39++;
			}
			@Pc(59) StringBuffer local59 = new StringBuffer(local39);
			while (arg0 != 0L) {
				@Pc(63) long local63 = arg0;
				arg0 /= 37L;
				@Pc(77) char local77 = Static40.aCharArray3[(int) (local63 - arg0 * 37L)];
				if (local77 == '_') {
					@Pc(85) int local85 = local59.length() - 1;
					local77 = ' ';
					local59.setCharAt(local85, Character.toUpperCase(local59.charAt(local85)));
				}
				local59.append(local77);
			}
			local59.reverse();
			local59.setCharAt(0, Character.toUpperCase(local59.charAt(0)));
			return local59.toString();
		}
	}
}
