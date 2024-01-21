import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!ui", name = "cb", descriptor = "Lclient!kh;")
	public static Class52_Sub1 aClass52_Sub1_24;

	@OriginalMember(owner = "client!ui", name = "F", descriptor = "Z")
	public static boolean aBoolean175 = false;

	@OriginalMember(owner = "client!ui", name = "ab", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1927 = Static193.method3027("http:)4)4www)3runescape)3com)4l=");

	@OriginalMember(owner = "client!ui", name = "ib", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_1929 = Static193.method3027("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

	@OriginalMember(owner = "client!ui", name = "jb", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_1930 = Static193.method3027("Login server offline)3");

	@OriginalMember(owner = "client!ui", name = "rb", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1931 = aClass70_1930;

	@OriginalMember(owner = "client!ui", name = "sb", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1932 = Static193.method3027("Diese Betatest)2Welt ist nur f-Ur eingeladene");

	@OriginalMember(owner = "client!ui", name = "yb", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1933 = aClass70_1929;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILclient!b;IILclient!ah;BI)V")
	public static void method3056(@OriginalArg(0) int arg0, @OriginalArg(1) Class6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub3_Sub2_Sub1 arg4, @OriginalArg(6) int arg5) {
		if (arg4 == null) {
			return;
		}
		@Pc(12) int local12 = Static62.anInt1310 + Static179.anInt1329 & 0x7FF;
		@Pc(24) int local24 = Math.max(arg1.anInt244 / 2, arg1.anInt217 / 2) + 10;
		@Pc(33) int local33 = arg2 * arg2 + arg0 * arg0;
		if (local24 * local24 < local33) {
			return;
		}
		@Pc(51) int local51 = Class3_Sub3_Sub2_Sub5.anIntArray300[local12];
		@Pc(59) int local59 = local51 * 256 / (Static212.anInt4284 + 256);
		@Pc(63) int local63 = Class3_Sub3_Sub2_Sub5.anIntArray303[local12];
		@Pc(71) int local71 = local63 * 256 / (Static212.anInt4284 + 256);
		@Pc(82) int local82 = local71 * arg0 - arg2 * local59 >> 16;
		@Pc(93) int local93 = arg0 * local59 + local71 * arg2 >> 16;
		arg4.method183(local93 + arg5 + arg1.anInt244 / 2 - arg4.anInt169 / 2, -local82 + arg1.anInt217 / 2 + (arg3 - arg4.anInt166 / 2), arg1.anIntArray13, arg1.anIntArray19);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method3057(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg7 == arg8 && arg2 == arg6 && arg4 == arg5 && arg0 == arg1) {
			Static75.method1081(arg8, arg2, arg1, arg4, arg3);
			return;
		}
		@Pc(35) int local35 = arg2;
		@Pc(39) int local39 = arg8 * 3;
		@Pc(41) int local41 = arg8;
		@Pc(45) int local45 = arg7 * 3;
		@Pc(49) int local49 = arg2 * 3;
		@Pc(53) int local53 = arg0 * 3;
		@Pc(57) int local57 = arg6 * 3;
		@Pc(61) int local61 = arg5 * 3;
		@Pc(71) int local71 = arg1 + local57 - local53 - arg2;
		@Pc(81) int local81 = local39 + local61 - local45 - local45;
		@Pc(91) int local91 = local49 + local53 - local57 - local57;
		@Pc(96) int local96 = local45 - local39;
		@Pc(106) int local106 = local45 + arg4 - arg8 - local61;
		@Pc(111) int local111 = local57 - local49;
		for (@Pc(113) int local113 = 128; local113 <= 4096; local113 += 128) {
			@Pc(121) int local121 = local113 * local113 >> 12;
			@Pc(127) int local127 = local113 * local121 >> 12;
			@Pc(131) int local131 = local121 * local81;
			@Pc(135) int local135 = local127 * local106;
			@Pc(139) int local139 = local71 * local127;
			@Pc(143) int local143 = local113 * local96;
			@Pc(147) int local147 = local121 * local91;
			@Pc(151) int local151 = local111 * local113;
			@Pc(161) int local161 = arg2 + (local151 + local147 + local139 >> 12);
			@Pc(171) int local171 = (local135 + local131 + local143 >> 12) + arg8;
			Static75.method1081(local41, local35, local161, local171, arg3);
			local35 = local161;
			local41 = local171;
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILclient!se;)V")
	public static void method3058(@OriginalArg(1) Class3_Sub22 arg0) {
		@Pc(1) int local1 = -1;
		@Pc(7) int local7 = 0;
		@Pc(9) long local9 = 0L;
		@Pc(11) int local11 = 0;
		if (arg0.anInt3545 == 0) {
			local9 = Static41.method681(arg0.anInt3549, arg0.anInt3540, arg0.anInt3542);
		}
		if (arg0.anInt3545 == 1) {
			local9 = Static32.method574(arg0.anInt3549, arg0.anInt3540, arg0.anInt3542);
		}
		if (arg0.anInt3545 == 2) {
			local9 = Static159.method2398(arg0.anInt3549, arg0.anInt3540, arg0.anInt3542);
		}
		if (arg0.anInt3545 == 3) {
			local9 = Static157.method2364(arg0.anInt3549, arg0.anInt3540, arg0.anInt3542);
		}
		if (local9 != 0L) {
			local1 = (int) (local9 >>> 32) & Integer.MAX_VALUE;
			local7 = (int) local9 >> 14 & 0x1F;
			local11 = (int) local9 >> 20 & 0x3;
		}
		arg0.anInt3548 = local7;
		arg0.anInt3541 = local11;
		arg0.anInt3544 = local1;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(III)V")
	public static void method3062(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int[] local4 = new int[4];
		local4[0] = arg0;
		@Pc(19) int[] local19 = new int[4];
		local19[0] = arg1;
		@Pc(25) int local25 = 1;
		for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
			if (Static52.anIntArray60[local27] != arg0) {
				local4[local25] = Static52.anIntArray60[local27];
				local19[local25] = Static185.anIntArray325[local27];
				local25++;
			}
		}
		Static52.anIntArray60 = local4;
		Static185.anIntArray325 = local19;
		Static26.method469(0, Static197.aClass71Array1.length - 1, Static185.anIntArray325, Static52.anIntArray60, Static197.aClass71Array1);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIILclient!ce;III)V")
	public static void method3063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub4 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(32) int local32;
		if (arg0 < 0 || arg0 >= 104 || arg6 < 0 || arg6 >= 104) {
			while (true) {
				local32 = arg4.method1278();
				if (local32 == 0) {
					break;
				}
				if (local32 == 1) {
					arg4.method1278();
					break;
				}
				if (local32 <= 49) {
					arg4.method1278();
				}
			}
			return;
		}
		Static17.aByteArrayArrayArray2[arg1][arg0][arg6] = 0;
		while (true) {
			local32 = arg4.method1278();
			if (local32 == 0) {
				if (arg1 == 0) {
					Static23.anIntArrayArrayArray4[0][arg0][arg6] = -Static131.method1840(arg5 + arg0 + 932731, arg3 + arg6 + 556238) * 8;
				} else {
					Static23.anIntArrayArrayArray4[arg1][arg0][arg6] = Static23.anIntArrayArrayArray4[arg1 - 1][arg0][arg6] - 240;
				}
				break;
			}
			if (local32 == 1) {
				@Pc(91) int local91 = arg4.method1278();
				if (local91 == 1) {
					local91 = 0;
				}
				if (arg1 == 0) {
					Static23.anIntArrayArrayArray4[0][arg0][arg6] = -local91 * 8;
				} else {
					Static23.anIntArrayArrayArray4[arg1][arg0][arg6] = Static23.anIntArrayArrayArray4[arg1 - 1][arg0][arg6] - local91 * 8;
				}
				break;
			}
			if (local32 <= 49) {
				Static103.aByteArrayArrayArray9[arg1][arg0][arg6] = arg4.method1248();
				Static60.aByteArrayArrayArray15[arg1][arg0][arg6] = (byte) ((local32 - 2) / 4);
				Static153.aByteArrayArrayArray14[arg1][arg0][arg6] = (byte) (local32 + arg2 - 2 & 0x3);
			} else if (local32 <= 81) {
				Static17.aByteArrayArrayArray2[arg1][arg0][arg6] = (byte) (local32 - 49);
			} else {
				Static35.aByteArrayArrayArray3[arg1][arg0][arg6] = (byte) (local32 - 81);
			}
		}
	}
}
