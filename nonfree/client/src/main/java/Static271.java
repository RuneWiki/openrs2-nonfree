import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(II[BI)[B")
	public static byte[] method4826(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(13) byte[] local13;
		if (arg0 > 0) {
			local13 = new byte[arg1];
			for (@Pc(15) int local15 = 0; local15 < arg1; local15++) {
				local13[local15] = arg2[local15 + arg0];
			}
		} else {
			local13 = arg2;
		}
		@Pc(41) Class25 local41 = new Class25();
		local41.method808();
		local41.method803(local13, (long) (arg1 * 8));
		@Pc(55) byte[] local55 = new byte[64];
		local41.method802(local55);
		return local55;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(BZ[B)Ljava/lang/Object;")
	public static Object method4827(@OriginalArg(2) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static293.aBoolean679) {
			try {
				@Pc(23) Class231 local23 = (Class231) Class.forName("Class231_Sub1").getDeclaredConstructor().newInstance();
				local23.method6155(arg0);
				return local23;
			} catch (@Pc(30) Throwable local30) {
				Static293.aBoolean679 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IBZ)Lclient!ct;")
	public static Class1_Sub8 method4828(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(17) long local17 = (long) (arg0 | (arg1 ? Integer.MIN_VALUE : 0));
		return (Class1_Sub8) Static534.aClass230_49.method6144(local17);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(FB)F")
	public static float method4829(@OriginalArg(0) float arg0) {
		return arg0 * arg0 * arg0 * ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIBII)V")
	public static void method4830(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg2 - arg1;
		@Pc(15) int local15 = arg0 - arg4;
		if (local15 == 0) {
			if (local10 != 0) {
				Static25.method774(arg2, arg1, arg4, arg3);
			}
		} else if (local10 == 0) {
			Static442.method6848(arg3, arg4, arg1, arg0);
		} else {
			if (local15 < 0) {
				local15 = -local15;
			}
			if (local10 < 0) {
				local10 = -local10;
			}
			@Pc(65) boolean local65 = local15 < local10;
			@Pc(69) int local69;
			@Pc(71) int local71;
			if (local65) {
				local69 = arg4;
				local71 = arg0;
				arg4 = arg1;
				arg0 = arg2;
				arg1 = local69;
				arg2 = local71;
			}
			if (arg4 > arg0) {
				local69 = arg4;
				local71 = arg1;
				arg4 = arg0;
				arg1 = arg2;
				arg0 = local69;
				arg2 = local71;
			}
			local69 = arg1;
			local71 = arg0 - arg4;
			@Pc(109) int local109 = arg2 - arg1;
			@Pc(114) int local114 = -(local71 >> 1);
			@Pc(121) int local121 = arg2 > arg1 ? 1 : -1;
			if (local109 < 0) {
				local109 = -local109;
			}
			@Pc(130) int local130;
			if (local65) {
				for (local130 = arg4; local130 <= arg0; local130++) {
					Static143.anIntArrayArray33[local130][local69] = arg3;
					local114 += local109;
					if (local114 > 0) {
						local114 -= local71;
						local69 += local121;
					}
				}
			} else {
				for (local130 = arg4; local130 <= arg0; local130++) {
					local114 += local109;
					Static143.anIntArrayArray33[local69][local130] = arg3;
					if (local114 > 0) {
						local114 -= local71;
						local69 += local121;
					}
				}
			}
		}
	}
}
