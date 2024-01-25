import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!kw", name = "p", descriptor = "[[Lclient!vm;")
	public static Class378[][] aClass378ArrayArray1;

	@OriginalMember(owner = "client!kw", name = "w", descriptor = "I")
	public static int anInt5884;

	@OriginalMember(owner = "client!kw", name = "m", descriptor = "F")
	public static float aFloat116 = 0.25F;

	@OriginalMember(owner = "client!kw", name = "r", descriptor = "[Z")
	public static final boolean[] aBooleanArray13 = new boolean[5];

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method5014(@OriginalArg(1) String arg0) {
		if (!arg0.equals("")) {
			@Pc(17) Class5_Sub16 local17 = Static455.method6717(Static110.aClass187_32, Static16.aClass332_8);
			local17.aClass5_Sub15_Sub2_1.method3651(Static467.method6904(arg0));
			local17.aClass5_Sub15_Sub2_1.method3680(arg0);
			Static479.method7038(local17);
		}
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(III)Lclient!ev;")
	public static Class41_Sub1_Sub3 method5015(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class313 local7 = Static129.aClass313ArrayArrayArray7[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass41_Sub1_Sub3_2;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIZII)V")
	public static void method5018(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg1 - arg0;
		@Pc(15) int local15 = arg2 - arg3;
		if (local10 == 0) {
			if (local15 != 0) {
				Static387.method5665(arg3, arg2, arg4, arg0);
			}
		} else if (local15 == 0) {
			Static120.method1910(arg0, arg4, arg1, arg3);
		} else {
			@Pc(48) int local48 = (local15 << 12) / local10;
			@Pc(57) int local57 = arg3 - (arg0 * local48 >> 12);
			@Pc(71) int local71;
			@Pc(69) int local69;
			if (arg1 < Static361.anInt6317) {
				local69 = local57 + (Static361.anInt6317 * local48 >> 12);
				local71 = Static361.anInt6317;
			} else if (Static651.anInt10267 < arg1) {
				local69 = (local48 * Static651.anInt10267 >> 12) + local57;
				local71 = Static651.anInt10267;
			} else {
				local71 = arg1;
				local69 = arg2;
			}
			@Pc(109) int local109;
			@Pc(107) int local107;
			if (arg0 < Static361.anInt6317) {
				local109 = Static361.anInt6317;
				local107 = (local48 * Static361.anInt6317 >> 12) + local57;
			} else if (Static651.anInt10267 < arg0) {
				local107 = local57 + (Static651.anInt10267 * local48 >> 12);
				local109 = Static651.anInt10267;
			} else {
				local107 = arg3;
				local109 = arg0;
			}
			if (local107 < Static128.anInt2200) {
				local109 = (Static128.anInt2200 - local57 << 12) / local48;
				local107 = Static128.anInt2200;
			} else if (local107 > Static380.anInt6585) {
				local109 = (Static380.anInt6585 - local57 << 12) / local48;
				local107 = Static380.anInt6585;
			}
			if (Static128.anInt2200 > local69) {
				local69 = Static128.anInt2200;
				local71 = (Static128.anInt2200 - local57 << 12) / local48;
			} else if (Static380.anInt6585 < local69) {
				local69 = Static380.anInt6585;
				local71 = (Static380.anInt6585 - local57 << 12) / local48;
			}
			Static277.method3848(local107, local69, local71, local109, arg4);
		}
	}

	@OriginalMember(owner = "client!kw", name = "d", descriptor = "(I)V")
	public static void method5019() {
		@Pc(12) Class5_Sub16 local12 = Static455.method6717(Static602.aClass187_95, Static16.aClass332_8);
		local12.aClass5_Sub15_Sub2_1.method3660(Static500.anInt8514);
		Static479.method7038(local12);
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIIII[[[BIIBIILclient!ha;)V")
	public static void method5020(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[][][] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class143 arg11) {
		if (arg9 == 0 || arg4 == 0) {
			return;
		}
		if (arg9 == 9) {
			arg10 = arg10 + 1 & 0x3;
			arg9 = 1;
		}
		if (arg9 == 10) {
			arg9 = 1;
			arg10 = arg10 + 3 & 0x3;
		}
		if (arg9 == 11) {
			arg9 = 8;
			arg10 = arg10 + 3 & 0x3;
		}
		arg11.Q(arg0, arg3, arg8, arg2, arg5, arg7, arg6[arg9 - 1][arg10], arg4, arg1);
	}
}
