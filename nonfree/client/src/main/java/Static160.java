import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!ni", name = "d", descriptor = "Lclient!ic;")
	public static Class58 aClass58_10 = new Class58(64);

	@OriginalMember(owner = "client!ni", name = "h", descriptor = "Lclient!lc;")
	public static Class79 aClass79_22 = new Class79(64);

	@OriginalMember(owner = "client!ni", name = "i", descriptor = "I")
	public static int anInt3795 = -1;

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(B)V")
	public static void method2813() {
		Static13.aClass79_1.method2489();
		Static150.aClass79_23.method2489();
		Static17.aClass79_2.method2489();
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIIIIIB)V")
	public static void method2814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg1 < 0 || arg0 < 0 || arg1 >= 103 || arg0 >= 103) {
			return;
		}
		@Pc(39) int local39;
		if (arg5 == 0) {
			@Pc(29) Class144 local29 = Static115.method2302(arg6, arg1, arg0);
			if (local29 != null) {
				local39 = Integer.MAX_VALUE & (int) (local29.aLong176 >>> 32);
				if (arg2 == 2) {
					local29.aClass9_8 = new Class9_Sub4(local39, 2, arg4 + 4, arg6, arg1, arg0, arg3, false, local29.aClass9_8);
					local29.aClass9_9 = new Class9_Sub4(local39, 2, arg4 + 1 & 0x3, arg6, arg1, arg0, arg3, false, local29.aClass9_9);
				} else {
					local29.aClass9_8 = new Class9_Sub4(local39, arg2, arg4, arg6, arg1, arg0, arg3, false, local29.aClass9_8);
				}
			}
		}
		if (arg5 == 1) {
			@Pc(105) Class85 local105 = Static182.method3131(arg6, arg1, arg0);
			if (local105 != null) {
				local39 = (int) (local105.aLong111 >>> 32) & Integer.MAX_VALUE;
				if (arg2 == 4 || arg2 == 5) {
					local105.aClass9_3 = new Class9_Sub4(local39, 4, arg4, arg6, arg1, arg0, arg3, false, local105.aClass9_3);
				} else if (arg2 == 6) {
					local105.aClass9_3 = new Class9_Sub4(local39, 4, arg4 + 4, arg6, arg1, arg0, arg3, false, local105.aClass9_3);
				} else if (arg2 == 7) {
					local105.aClass9_3 = new Class9_Sub4(local39, 4, (arg4 + 2 & 0x3) + 4, arg6, arg1, arg0, arg3, false, local105.aClass9_3);
				} else if (arg2 == 8) {
					local105.aClass9_3 = new Class9_Sub4(local39, 4, arg4 + 4, arg6, arg1, arg0, arg3, false, local105.aClass9_3);
					local105.aClass9_4 = new Class9_Sub4(local39, 4, (arg4 + 2 & 0x3) + 4, arg6, arg1, arg0, arg3, false, local105.aClass9_4);
				}
			}
		}
		if (arg5 == 2) {
			if (arg2 == 11) {
				arg2 = 10;
			}
			@Pc(250) Class47 local250 = Static111.method2255(arg6, arg1, arg0);
			if (local250 != null) {
				local250.aClass9_1 = new Class9_Sub4(Integer.MAX_VALUE & (int) (local250.aLong73 >>> 32), arg2, arg4, arg6, arg1, arg0, arg3, false, local250.aClass9_1);
			}
		}
		if (arg5 == 3) {
			@Pc(283) Class148 local283 = Static16.method3759(arg6, arg1, arg0);
			if (local283 != null) {
				local283.aClass9_10 = new Class9_Sub4(Integer.MAX_VALUE & (int) (local283.aLong181 >>> 32), 22, arg4, arg6, arg1, arg0, arg3, false, local283.aClass9_10);
			}
		}
	}
}
