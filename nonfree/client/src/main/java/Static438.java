import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static438 {

	@OriginalMember(owner = "client!pr", name = "p", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_184 = new Class215(115, 11);

	@OriginalMember(owner = "client!pr", name = "y", descriptor = "I")
	public static int anInt8137 = 0;

	@OriginalMember(owner = "client!pr", name = "d", descriptor = "(II)Lclient!cs;")
	public static Class66 method6939(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if ((double) Static303.aFloat5 == 3.0D) {
				return Static372.aClass66_7;
			}
			if ((double) Static303.aFloat5 == 4.0D) {
				return Static557.aClass66_10;
			}
			if ((double) Static303.aFloat5 == 6.0D) {
				return Static238.aClass66_5;
			}
			if ((double) Static303.aFloat5 >= 8.0D) {
				return Static50.aClass66_3;
			}
		} else if (arg0 == 1) {
			if ((double) Static303.aFloat5 == 3.0D) {
				return Static238.aClass66_5;
			}
			if ((double) Static303.aFloat5 == 4.0D) {
				return Static50.aClass66_3;
			}
			if ((double) Static303.aFloat5 == 6.0D) {
				return Static439.aClass66_8;
			}
			if ((double) Static303.aFloat5 >= 8.0D) {
				return Static603.aClass66_6;
			}
		} else if (arg0 == 2) {
			if ((double) Static303.aFloat5 == 3.0D) {
				return Static439.aClass66_8;
			}
			if ((double) Static303.aFloat5 == 4.0D) {
				return Static603.aClass66_6;
			}
			if ((double) Static303.aFloat5 == 6.0D) {
				return Static138.aClass66_4;
			}
			if ((double) Static303.aFloat5 >= 8.0D) {
				return Static529.aClass66_9;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(IIIIII)V")
	public static void method6940(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg2 - arg1;
		@Pc(15) int local15 = arg3 - arg0;
		if (local15 == 0) {
			if (local10 != 0) {
				Static103.method2668(arg2, arg1, arg0, arg4);
			}
		} else if (local10 == 0) {
			Static203.method4070(arg3, arg4, arg1, arg0);
		} else {
			if (local10 < 0) {
				local10 = -local10;
			}
			if (local15 < 0) {
				local15 = -local15;
			}
			@Pc(61) boolean local61 = local15 < local10;
			@Pc(65) int local65;
			@Pc(67) int local67;
			if (local61) {
				local65 = arg0;
				local67 = arg3;
				arg0 = arg1;
				arg3 = arg2;
				arg1 = local65;
				arg2 = local67;
			}
			if (arg0 > arg3) {
				local65 = arg0;
				arg0 = arg3;
				local67 = arg1;
				arg3 = local65;
				arg1 = arg2;
				arg2 = local67;
			}
			local65 = arg1;
			local67 = arg3 - arg0;
			@Pc(106) int local106 = arg2 - arg1;
			@Pc(111) int local111 = -(local67 >> 1);
			if (local106 < 0) {
				local106 = -local106;
			}
			@Pc(123) int local123 = arg2 <= arg1 ? -1 : 1;
			@Pc(127) int local127;
			if (local61) {
				for (local127 = arg0; local127 <= arg3; local127++) {
					Static208.anIntArrayArray20[local127][local65] = arg4;
					local111 += local106;
					if (local111 > 0) {
						local65 += local123;
						local111 -= local67;
					}
				}
			} else {
				for (local127 = arg0; local127 <= arg3; local127++) {
					local111 += local106;
					Static208.anIntArrayArray20[local65][local127] = arg4;
					if (local111 > 0) {
						local65 += local123;
						local111 -= local67;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pr", name = "e", descriptor = "(II)V")
	public static void method6944(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub6_Sub6 local8 = Static139.method3119(arg0, 8);
		local8.method3093();
	}
}
