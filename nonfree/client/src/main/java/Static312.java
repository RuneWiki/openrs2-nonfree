import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!lf", name = "j", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray17;

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
	public static int anInt5966 = 0;

	@OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
	public static int anInt5970 = 0;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(II[BIIII)V")
	public static void method5226(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 > 0 && !Static316.method5292(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg5 <= 0 || Static316.method5292(arg5)) {
			@Pc(34) int local34 = Static628.method8719(arg4);
			@Pc(36) int local36 = 0;
			@Pc(43) int local43 = arg0 < arg5 ? arg0 : arg5;
			@Pc(51) int local51 = arg0 >> 1;
			@Pc(55) int local55 = arg5 >> 1;
			@Pc(57) byte[] local57 = arg2;
			@Pc(64) byte[] local64 = new byte[local51 * local55 * local34];
			while (true) {
				OpenGL.glTexImage2Dub(arg3, local36, arg1, arg0, arg5, 0, arg4, 5121, local57, 0);
				if (local43 <= 1) {
					return;
				}
				@Pc(84) int local84 = arg0 * local34;
				@Pc(86) byte[] local86 = local64;
				for (@Pc(88) int local88 = 0; local88 < local34; local88++) {
					@Pc(92) int local92 = local88;
					@Pc(94) int local94 = local88;
					@Pc(98) int local98 = local84 + local88;
					for (@Pc(100) int local100 = 0; local100 < local55; local100++) {
						for (@Pc(104) int local104 = 0; local104 < local51; local104++) {
							@Pc(110) byte local110 = local57[local94];
							local94 += local34;
							@Pc(120) int local120 = local110 + local57[local94];
							@Pc(126) int local126 = local120 + local57[local98];
							local94 += local34;
							local98 += local34;
							@Pc(140) int local140 = local126 + local57[local98];
							local64[local92] = (byte) (local140 >> 2);
							local98 += local34;
							local92 += local34;
						}
						local98 += local84;
						local94 += local84;
					}
				}
				local64 = local57;
				arg0 = local51;
				local57 = local86;
				arg5 = local55;
				local51 >>= 0x1;
				local55 >>= 0x1;
				local36++;
				local43 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(I[IIIB)V")
	public static void method5228(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		arg3--;
		@Pc(15) int local15 = arg2 - 1;
		@Pc(19) int local19 = local15 - 7;
		while (arg3 < local19) {
			@Pc(23) int local23 = arg3 + 1;
			arg1[local23] = arg0;
			@Pc(28) int local28 = local23 + 1;
			arg1[local28] = arg0;
			@Pc(33) int local33 = local28 + 1;
			arg1[local33] = arg0;
			@Pc(38) int local38 = local33 + 1;
			arg1[local38] = arg0;
			@Pc(43) int local43 = local38 + 1;
			arg1[local43] = arg0;
			@Pc(48) int local48 = local43 + 1;
			arg1[local48] = arg0;
			@Pc(53) int local53 = local48 + 1;
			arg1[local53] = arg0;
			arg3 = local53 + 1;
			arg1[arg3] = arg0;
		}
		while (local15 > arg3) {
			arg3++;
			arg1[arg3] = arg0;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(III)Z")
	public static boolean method5229(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static569.method8134(arg0, arg1) | Static284.method6790(arg1, arg0) | Static504.method8536(arg0, arg1)) & Static130.method2123(arg1, arg0);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method5230(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static60.anInt1289; local11++) {
			if (arg0.equalsIgnoreCase(Static123.aStringArray27[local11])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aString12);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BI)I")
	public static int method5231(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BIIZII[ILclient!wh;)Lclient!iba;")
	public static Class3_Sub2_Sub1 method5232(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int[] arg4, @OriginalArg(7) Class100_Sub3 arg5) {
		if (arg5.aBoolean709 || Static316.method5292(arg1) && Static316.method5292(arg3)) {
			return new Class3_Sub2_Sub1(arg5, 3553, arg1, arg3, false, arg4, arg2, 0);
		} else if (arg5.aBoolean710) {
			return new Class3_Sub2_Sub1(arg5, 34037, arg1, arg3, false, arg4, arg2, 0);
		} else {
			return new Class3_Sub2_Sub1(arg5, arg1, arg3, Static567.method8129(arg1), Static567.method8129(arg3), arg4);
		}
	}
}
