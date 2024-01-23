import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "I")
	private static int anInt3907;

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "[Lclient!lb;")
	public static Class46_Sub1[] aClass46_Sub1Array2;

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "I")
	private static int anInt3908;

	@OriginalMember(owner = "client!mo", name = "d", descriptor = "Lclient!lb;")
	public static Class46_Sub1 aClass46_Sub1_3;

	@OriginalMember(owner = "client!mo", name = "e", descriptor = "[[Lclient!eo;")
	public static Class48[][] aClass48ArrayArray1;

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lclient!lb;Lclient!lb;II)V")
	private static void method2834(@OriginalArg(0) Class46_Sub1 arg0, @OriginalArg(1) Class46_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		arg2 += arg0.anInt4748;
		arg3 += arg0.anInt4752;
		@Pc(16) int local16 = arg2 + arg3 * arg1.anInt4753;
		@Pc(18) int local18 = 0;
		@Pc(21) int local21 = arg0.anInt4751;
		@Pc(24) int local24 = arg0.anInt4753;
		@Pc(29) int local29 = arg1.anInt4753 - local24;
		@Pc(31) int local31 = 0;
		@Pc(37) int local37;
		if (arg3 <= 0) {
			local37 = 1 - arg3;
			local21 -= local37;
			local18 = local37 * local24;
			local16 += local37 * arg1.anInt4753;
			arg3 = 1;
		}
		if (arg3 + local21 >= arg1.anInt4751) {
			local37 = arg3 + local21 + 1 - arg1.anInt4751;
			local21 -= local37;
		}
		if (arg2 <= 0) {
			local37 = 1 - arg2;
			local24 -= local37;
			local18 += local37;
			local16 += local37;
			local31 = local37;
			local29 += local37;
			arg2 = 1;
		}
		if (arg2 + local24 >= arg1.anInt4753) {
			local37 = arg2 + local24 + 1 - arg1.anInt4753;
			local24 -= local37;
			local31 += local37;
			local29 += local37;
		}
		if (local24 > 0 && local21 > 0) {
			method2850(arg1.aByteArray57, arg0.aByteArray57, local18, local16, local24, local21, local29, local31);
			method2848(arg2, arg3, local24, local21);
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lclient!lb;III)Z")
	public static boolean method2835(@OriginalArg(0) Class46_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == null) {
			return false;
		} else {
			@Pc(13) int local13 = arg1 - (arg2 * Static180.anInt3947 >> 8) >> 3;
			@Pc(23) int local23 = arg3 - (arg2 * Static180.anInt3945 >> 8) >> 3;
			return method2836(arg0, aClass46_Sub1_3, local13 + 1, local23 + 1);
		}
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(Lclient!lb;Lclient!lb;II)Z")
	private static boolean method2836(@OriginalArg(0) Class46_Sub1 arg0, @OriginalArg(1) Class46_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		arg2 += arg0.anInt4748;
		arg3 += arg0.anInt4752;
		@Pc(16) int local16 = arg2 + arg3 * arg1.anInt4753;
		@Pc(19) int local19 = arg0.anInt4751;
		@Pc(22) int local22 = arg0.anInt4753;
		@Pc(27) int local27 = arg1.anInt4753 - local22;
		@Pc(33) int local33;
		if (arg3 <= 0) {
			local33 = 1 - arg3;
			local19 -= local33;
			local16 += local33 * arg1.anInt4753;
			arg3 = 1;
		}
		if (arg3 + local19 >= arg1.anInt4751) {
			local33 = arg3 + local19 + 1 - arg1.anInt4751;
			local19 -= local33;
		}
		if (arg2 <= 0) {
			local33 = 1 - arg2;
			local22 -= local33;
			local16 += local33;
			local27 += local33;
			arg2 = 1;
		}
		if (arg2 + local22 >= arg1.anInt4753) {
			local33 = arg2 + local22 + 1 - arg1.anInt4753;
			local22 -= local33;
			local27 += local33;
		}
		if (local22 > 0 && local19 > 0) {
			local27 += arg1.anInt4753 * 7;
			return method2847(arg1.aByteArray57, local16, local22, local19, local27);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(Lclient!lb;III)V")
	public static void method2837(@OriginalArg(0) Class46_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 != null) {
			@Pc(12) int local12 = arg1 - (arg2 * Static180.anInt3947 >> 8) >> 3;
			@Pc(22) int local22 = arg3 - (arg2 * Static180.anInt3945 >> 8) >> 3;
			method2845(arg0, aClass46_Sub1_3, local12 + 1, local22 + 1);
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "([B[BIIIII)V")
	private static void method2838(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		for (@Pc(1) int local1 = -16; local1 < 0; local1++) {
			for (@Pc(5) int local5 = -4; local5 < 0; local5++) {
				@Pc(9) int local9 = arg3++;
				arg0[local9] += arg1[arg2];
				arg2 += arg5;
				@Pc(24) int local24 = arg3++;
				arg0[local24] += arg1[arg2];
				arg2 += arg5;
				@Pc(39) int local39 = arg3++;
				arg0[local39] += arg1[arg2];
				arg2 += arg5;
				@Pc(54) int local54 = arg3++;
				arg0[local54] += arg1[arg2];
				arg2 += arg5;
			}
			arg3 += arg4;
			arg2 += arg6;
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "()V")
	public static void method2839() {
		aClass46_Sub1_3 = null;
		aClass46_Sub1Array2 = null;
		aClass48ArrayArray1 = null;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "([B[BIIIIII)V")
	private static void method2840(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(4) int local4 = -(arg4 >> 2);
		@Pc(9) int local9 = -(arg4 & 0x3);
		for (@Pc(12) int local12 = -arg5; local12 < 0; local12++) {
			@Pc(16) int local16;
			@Pc(20) int local20;
			for (local16 = local4; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] -= arg1[arg2++];
				@Pc(32) int local32 = arg3++;
				arg0[local32] -= arg1[arg2++];
				@Pc(44) int local44 = arg3++;
				arg0[local44] -= arg1[arg2++];
				@Pc(56) int local56 = arg3++;
				arg0[local56] -= arg1[arg2++];
			}
			for (local16 = local9; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] -= arg1[arg2++];
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIZZIIIIII)V")
	public static void method2841(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg2 && arg3 || (arg2 && arg0 == 1 || arg3 && arg0 == 0)) {
			return;
		}
		@Pc(19) int local19 = arg4 << 7;
		@Pc(29) int local29 = arg6 + arg7 + arg8 + arg9 >> 2;
		@Pc(33) int local33 = arg5 << 7;
		@Pc(43) int local43 = local19 - (local29 * Static180.anInt3947 >> 8) >> 3;
		@Pc(53) int local53 = local33 - (local29 * Static180.anInt3945 >> 8) >> 3;
		if (arg0 != 0 && arg0 != 1 && (arg2 || arg3)) {
			method2843(aClass46_Sub1Array2[arg0], aClass46_Sub1_3, local43 + 1, local53 + 1, arg1, arg2);
		} else {
			method2834(aClass46_Sub1Array2[1], aClass46_Sub1_3, local43 + 1, local53 + 1);
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lclient!lb;Lclient!lb;IIIZ)V")
	private static void method2843(@OriginalArg(0) Class46_Sub1 arg0, @OriginalArg(1) Class46_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (arg2 <= 0 || arg3 <= 0 || arg2 + 16 >= arg1.anInt4753 || arg3 + 16 >= arg1.anInt4751) {
			return;
		}
		@Pc(23) int local23 = arg2 + arg3 * arg1.anInt4753;
		@Pc(28) int local28 = arg1.anInt4753 - 16;
		@Pc(32) short local32;
		@Pc(34) byte local34;
		@Pc(41) short local41;
		if (arg4 == 0) {
			local32 = 240;
			local34 = 1;
			local41 = -32;
		} else if (arg4 == 1) {
			local32 = 255;
			local34 = -16;
			local41 = 255;
		} else if (arg4 == 2) {
			local32 = 15;
			local34 = -1;
			local41 = 32;
		} else {
			local32 = 0;
			local34 = 16;
			local41 = -255;
		}
		if (arg5) {
			method2844(arg1.aByteArray57, arg0.aByteArray57, local32, local23, local28, local34, local41);
		} else {
			method2838(arg1.aByteArray57, arg0.aByteArray57, local32, local23, local28, local34, local41);
		}
		method2848(arg2, arg3, 16, 16);
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "([B[BIIIII)V")
	private static void method2844(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		for (@Pc(1) int local1 = -16; local1 < 0; local1++) {
			for (@Pc(5) int local5 = -4; local5 < 0; local5++) {
				@Pc(9) int local9 = arg3++;
				arg0[local9] = (byte) (arg0[local9] + 1 - arg1[arg2]);
				arg2 += arg5;
				@Pc(26) int local26 = arg3++;
				arg0[local26] = (byte) (arg0[local26] + 1 - arg1[arg2]);
				arg2 += arg5;
				@Pc(43) int local43 = arg3++;
				arg0[local43] = (byte) (arg0[local43] + 1 - arg1[arg2]);
				arg2 += arg5;
				@Pc(60) int local60 = arg3++;
				arg0[local60] = (byte) (arg0[local60] + 1 - arg1[arg2]);
				arg2 += arg5;
			}
			arg3 += arg4;
			arg2 += arg6;
		}
	}

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "(Lclient!lb;Lclient!lb;II)V")
	private static void method2845(@OriginalArg(0) Class46_Sub1 arg0, @OriginalArg(1) Class46_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		arg2 += arg0.anInt4748;
		arg3 += arg0.anInt4752;
		@Pc(16) int local16 = arg2 + arg3 * arg1.anInt4753;
		@Pc(18) int local18 = 0;
		@Pc(21) int local21 = arg0.anInt4751;
		@Pc(24) int local24 = arg0.anInt4753;
		@Pc(29) int local29 = arg1.anInt4753 - local24;
		@Pc(31) int local31 = 0;
		@Pc(37) int local37;
		if (arg3 <= 0) {
			local37 = 1 - arg3;
			local21 -= local37;
			local18 = local37 * local24;
			local16 += local37 * arg1.anInt4753;
			arg3 = 1;
		}
		if (arg3 + local21 >= arg1.anInt4751) {
			local37 = arg3 + local21 + 1 - arg1.anInt4751;
			local21 -= local37;
		}
		if (arg2 <= 0) {
			local37 = 1 - arg2;
			local24 -= local37;
			local18 += local37;
			local16 += local37;
			local31 = local37;
			local29 += local37;
			arg2 = 1;
		}
		if (arg2 + local24 >= arg1.anInt4753) {
			local37 = arg2 + local24 + 1 - arg1.anInt4753;
			local24 -= local37;
			local31 += local37;
			local29 += local37;
		}
		if (local24 > 0 && local21 > 0) {
			method2840(arg1.aByteArray57, arg0.aByteArray57, local18, local16, local24, local21, local29, local31);
			method2848(arg2, arg3, local24, local21);
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIII[[Z[[I)V")
	public static void method2846(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[][] arg4, @OriginalArg(5) int[][] arg5) {
		@Pc(1) GL local1 = Static294.aGL1;
		Static294.method4488(1);
		Static294.method4490(1);
		Static294.method4512();
		Static294.method4496(false);
		Static1.method4721(0, 0);
		local1.glDepthMask(false);
		for (@Pc(17) int local17 = 0; local17 < anInt3908; local17++) {
			label52: for (@Pc(22) int local22 = 0; local22 < anInt3907; local22++) {
				for (@Pc(29) int local29 = local17 * 8; local29 < local17 * 8 + 8; local29++) {
					if (local29 - arg0 >= -arg2 && local29 - arg0 <= arg2) {
						for (@Pc(51) int local51 = local22 * 8; local51 < local22 * 8 + 8; local51++) {
							if (local51 - arg1 >= -arg2 && local51 - arg1 <= arg2 && arg4[local29 + arg2 - arg0][local51 + arg2 - arg1]) {
								@Pc(89) Class48 local89 = aClass48ArrayArray1[local17][local22];
								if (local89.aBoolean97) {
									local89.method1154(aClass46_Sub1_3, local17, local22);
									local89.aBoolean97 = false;
								}
								local1.glPushMatrix();
								local1.glTranslatef((float) (local17 * 1024), 0.0F, (float) (local22 * 1024));
								local89.method1152();
								local1.glPopMatrix();
								continue label52;
							}
						}
					}
				}
			}
		}
		local1.glEnableClientState(32886);
		local1.glDepthMask(true);
		Static294.method4500();
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "([BIIIII)Z")
	private static boolean method2847(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = arg2 % 8;
		@Pc(9) int local9;
		if (local3 == 0) {
			local9 = 0;
		} else {
			local9 = 8 - local3;
		}
		@Pc(21) int local21 = -((arg3 + 8 - 1) / 8);
		@Pc(30) int local30 = -((arg2 + 8 - 1) / 8);
		for (@Pc(32) int local32 = local21; local32 < 0; local32++) {
			for (@Pc(36) int local36 = local30; local36 < 0; local36++) {
				if (arg0[arg1] == 0) {
					return true;
				}
				arg1 += 8;
			}
			arg1 -= local9;
			if (arg0[arg1 - 1] == 0) {
				return true;
			}
			arg1 += arg4;
		}
		return false;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIII)V")
	private static void method2848(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) int local5 = arg0 - 1 >> 7;
		@Pc(15) int local15 = arg0 + arg2 - 1 - 1 >> 7;
		@Pc(21) int local21 = arg1 - 1 >> 7;
		@Pc(31) int local31 = arg1 + arg3 - 1 - 1 >> 7;
		for (@Pc(33) int local33 = local5; local33 <= local15; local33++) {
			@Pc(40) Class48[] local40 = aClass48ArrayArray1[local33];
			for (@Pc(42) int local42 = local21; local42 <= local31; local42++) {
				local40[local42].aBoolean97 = true;
			}
		}
	}

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "(Lclient!lb;III)V")
	public static void method2849(@OriginalArg(0) Class46_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 != null) {
			@Pc(12) int local12 = arg1 - (arg2 * Static180.anInt3947 >> 8) >> 3;
			@Pc(22) int local22 = arg3 - (arg2 * Static180.anInt3945 >> 8) >> 3;
			method2834(arg0, aClass46_Sub1_3, local12 + 1, local22 + 1);
		}
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "([B[BIIIIII)V")
	private static void method2850(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(4) int local4 = -(arg4 >> 2);
		@Pc(9) int local9 = -(arg4 & 0x3);
		for (@Pc(12) int local12 = -arg5; local12 < 0; local12++) {
			@Pc(16) int local16;
			@Pc(20) int local20;
			for (local16 = local4; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] += arg1[arg2++];
				@Pc(32) int local32 = arg3++;
				arg0[local32] += arg1[arg2++];
				@Pc(44) int local44 = arg3++;
				arg0[local44] += arg1[arg2++];
				@Pc(56) int local56 = arg3++;
				arg0[local56] += arg1[arg2++];
			}
			for (local16 = local9; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] += arg1[arg2++];
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(II)V")
	public static void method2851() {
		anInt3908 = 13;
		anInt3907 = 13;
		aClass46_Sub1_3 = new Class46_Sub1(anInt3908 * 128 + 2, anInt3907 * 128 + 2, 0);
		aClass48ArrayArray1 = new Class48[anInt3908][anInt3907];
		for (@Pc(32) int local32 = 0; local32 < anInt3908; local32++) {
			for (@Pc(37) int local37 = 0; local37 < anInt3907; local37++) {
				aClass48ArrayArray1[local32][local37] = new Class48();
			}
		}
	}
}
