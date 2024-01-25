import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!dq", name = "m", descriptor = "[Lclient!vg;")
	public static Class210[] aClass210Array1;

	@OriginalMember(owner = "client!dq", name = "n", descriptor = "[I")
	public static int[] anIntArray163;

	@OriginalMember(owner = "client!dq", name = "e", descriptor = "Lclient!ng;")
	public static final Class140 aClass140_39 = new Class140(260);

	@OriginalMember(owner = "client!dq", name = "j", descriptor = "I")
	public static int anInt1424 = -1;

	@OriginalMember(owner = "client!dq", name = "k", descriptor = "I")
	public static volatile int anInt1425 = 0;

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIIBII)V")
	public static void method1389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg0 - arg3;
		@Pc(14) int local14 = arg4 - arg2;
		if (local14 == 0) {
			if (local9 != 0) {
				Static301.method5136(arg3, arg1, arg2, arg0);
			}
		} else if (local9 == 0) {
			Static19.method444(arg4, arg3, arg2, arg1);
		} else {
			if (local9 < 0) {
				local9 = -local9;
			}
			if (local14 < 0) {
				local14 = -local14;
			}
			@Pc(75) boolean local75 = local14 < local9;
			@Pc(79) int local79;
			@Pc(83) int local83;
			if (local75) {
				local79 = arg2;
				arg2 = arg3;
				local83 = arg4;
				arg4 = arg0;
				arg3 = local79;
				arg0 = local83;
			}
			if (arg2 > arg4) {
				local79 = arg2;
				local83 = arg3;
				arg2 = arg4;
				arg3 = arg0;
				arg4 = local79;
				arg0 = local83;
			}
			local79 = arg3;
			local83 = arg4 - arg2;
			@Pc(116) int local116 = arg0 - arg3;
			@Pc(121) int local121 = -(local83 >> 1);
			@Pc(132) int local132 = arg3 >= arg0 ? -1 : 1;
			if (local116 < 0) {
				local116 = -local116;
			}
			@Pc(144) int local144;
			if (local75) {
				for (local144 = arg2; local144 <= arg4; local144++) {
					local121 += local116;
					Static327.anIntArrayArray63[local144][local79] = arg1;
					if (local121 > 0) {
						local79 += local132;
						local121 -= local83;
					}
				}
			} else {
				for (local144 = arg2; local144 <= arg4; local144++) {
					local121 += local116;
					Static327.anIntArrayArray63[local79][local144] = arg1;
					if (local121 > 0) {
						local79 += local132;
						local121 -= local83;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(II[Ljava/lang/Object;B[J)V")
	public static void method1390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object[] arg2, @OriginalArg(4) long[] arg3) {
		if (arg1 >= arg0) {
			return;
		}
		@Pc(26) int local26 = (arg1 + arg0) / 2;
		@Pc(28) int local28 = arg1;
		@Pc(32) long local32 = arg3[local26];
		arg3[local26] = arg3[arg0];
		arg3[arg0] = local32;
		@Pc(46) Object local46 = arg2[local26];
		arg2[local26] = arg2[arg0];
		arg2[arg0] = local46;
		for (@Pc(58) int local58 = arg1; local58 < arg0; local58++) {
			if ((long) (local58 & 0x1) + local32 > arg3[local58]) {
				@Pc(75) long local75 = arg3[local58];
				arg3[local58] = arg3[local28];
				arg3[local28] = local75;
				@Pc(89) Object local89 = arg2[local58];
				arg2[local58] = arg2[local28];
				arg2[local28++] = local89;
			}
		}
		arg3[arg0] = arg3[local28];
		arg3[local28] = local32;
		arg2[arg0] = arg2[local28];
		arg2[local28] = local46;
		method1390(local28 - 1, arg1, arg2, arg3);
		method1390(arg0, local28 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!tg;")
	public static RuntimeException_Sub1 method1391(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString229 = local12.aString229 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method1393(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 + arg5 > arg1 && arg5 < arg1 + arg7) {
			return arg4 + arg2 > arg6 && arg3 + arg6 > arg2;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(II)V")
	public static void method1396() {
		Static13.aClass140_10.method3824(5);
	}
}
