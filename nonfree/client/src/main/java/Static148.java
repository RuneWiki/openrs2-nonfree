import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!fv", name = "m", descriptor = "Lclient!ui;")
	public static Class5_Sub47 aClass5_Sub47_1;

	@OriginalMember(owner = "client!fv", name = "t", descriptor = "Lclient!fd;")
	public static final Class98 aClass98_1 = new Class98();

	@OriginalMember(owner = "client!fv", name = "v", descriptor = "J")
	public static volatile long aLong102 = 0L;

	@OriginalMember(owner = "client!fv", name = "w", descriptor = "I")
	public static int anInt3092 = 0;

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(II)Z")
	public static boolean method2763(@OriginalArg(1) int arg0) {
		return arg0 == 2 || arg0 == 6 || arg0 == 9;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(IIIBIIIIIIIIII)V")
	public static void method2764(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		if (Static248.aClass131Array4 == null) {
			return;
		}
		@Pc(8) Class15_Sub2_Sub1 local8 = null;
		@Pc(14) int local14;
		if (arg5 >= 0) {
			local14 = arg5 - 1;
			@Pc(21) Class5_Sub51 local21 = (Class5_Sub51) Static521.aClass42_42.method1109((long) local14);
			if (local21 != null) {
				local8 = local21.aClass15_Sub2_Sub1_Sub2_2;
			}
		} else {
			local14 = -arg5 - 1;
			if (local14 == Static510.anInt8653) {
				local8 = Static35.aClass15_Sub2_Sub1_Sub1_1;
			} else {
				local8 = Static10.aClass15_Sub2_Sub1_Sub1Array1[local14];
			}
		}
		if (local8 == null) {
			return;
		}
		@Pc(54) Class283 local54 = Static453.aClass88_3.method2294(arg0);
		@Pc(63) int local63;
		@Pc(66) int local66;
		if (arg2 == 1 || arg2 == 3) {
			local66 = local54.anInt8153;
			local63 = local54.anInt8184;
		} else {
			local63 = local54.anInt8153;
			local66 = local54.anInt8184;
		}
		@Pc(80) int local80 = (local66 >> 1) + arg12;
		@Pc(88) int local88 = (local66 + 1 >> 1) + arg12;
		@Pc(94) int local94 = (local63 >> 1) + arg8;
		@Pc(102) int local102 = (local63 + 1 >> 1) + arg8;
		@Pc(106) Class131 local106 = Static248.aClass131Array4[arg9];
		@Pc(130) int local130 = local106.ba(local80, local94) + local106.ba(local88, local94) + local106.ba(local80, local102) + local106.ba(local88, local102) >> 2;
		@Pc(134) Class5_Sub32 local134 = new Class5_Sub32();
		local134.anInt6227 = local8.aByte91;
		local134.anInt6229 = arg0;
		local134.anInt6221 = arg10 + Static481.anInt8318;
		local134.anInt6217 = Static481.anInt8318 + arg1;
		local134.anInt6216 = arg12;
		local134.anInt6219 = arg8;
		local134.anInt6214 = arg2;
		@Pc(169) int local169;
		if (arg4 < arg7) {
			local169 = arg7;
			arg7 = arg4;
			arg4 = local169;
		}
		local134.anInt6226 = arg6;
		local134.anInt6213 = arg7 + arg12;
		if (arg3 > arg11) {
			local169 = arg3;
			arg3 = arg11;
			arg11 = local169;
		}
		local134.anInt6218 = arg4 + arg12;
		local134.anInt6222 = local130;
		local134.anInt6224 = arg8 + arg11;
		local134.anInt6225 = (local63 << 6) + (local134.anInt6219 << 7);
		local134.anInt6220 = (local134.anInt6216 << 7) + (local66 << 6);
		local134.anInt6215 = arg8 + arg3;
		Static433.aClass99_65.method2513(local134);
		local8.aClass5_Sub32_3 = local134;
	}

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "(II)Z")
	public static boolean method2765(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}
}
