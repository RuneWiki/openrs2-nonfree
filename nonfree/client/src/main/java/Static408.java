import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static408 {

	@OriginalMember(owner = "client!ol", name = "e", descriptor = "I")
	public static int anInt6345;

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 < 0 || arg6 < 0 || arg2 >= Static228.anInt3704 - 1 || Static162.anInt2911 - 1 <= arg6) {
			return;
		}
		if (Static28.aClass53ArrayArrayArray1 == null) {
			return;
		}
		@Pc(46) Interface25 local46;
		if (arg0 != 0) {
			if (arg0 == 1) {
				local46 = (Interface25) Static330.method5563(arg1, arg2, arg6);
				if (local46 != null) {
					if (!(local46 instanceof Class13_Sub1_Sub3_Sub2)) {
						@Pc(55) int local55 = local46.method8425();
						if (arg3 != 4 && arg3 != 5) {
							if (arg3 != 6) {
								if (arg3 == 7) {
									Static125.method1792((arg5 + 2 & 0x3) + 4, arg1, arg0, local55, arg2, arg4, arg6, 4);
								} else if (arg3 == 8) {
									Static125.method1792(arg5 + 4, arg1, arg0, local55, arg2, arg4, arg6, 4);
									Static125.method1792((arg5 + 2 & 0x3) + 4, arg1, arg0, local55, arg2, arg4, arg6, 4);
									return;
								}
								return;
							}
							Static125.method1792(arg5 + 4, arg1, arg0, local55, arg2, arg4, arg6, 4);
							return;
						}
						Static125.method1792(arg5, arg1, arg0, local55, arg2, arg4, arg6, 4);
						return;
					}
					((Class13_Sub1_Sub3_Sub2) local46).aClass228_4.method4866(arg4);
					return;
				}
				return;
			}
			if (arg0 == 2) {
				local46 = (Interface25) Static245.method3380(arg1, arg2, arg6, vea.class);
				if (local46 != null) {
					if (arg3 == 11) {
						arg3 = 10;
					}
					if (!(local46 instanceof Class13_Sub1_Sub1_Sub4)) {
						Static125.method1792(arg5, arg1, arg0, local46.method8425(), arg2, arg4, arg6, arg3);
						return;
					}
					((Class13_Sub1_Sub1_Sub4) local46).aClass228_3.method4866(arg4);
					return;
				}
				return;
			}
			if (arg0 == 3) {
				local46 = (Interface25) Static629.method8438(arg1, arg2, arg6);
				if (local46 != null) {
					if (local46 instanceof Class13_Sub1_Sub2_Sub1) {
						((Class13_Sub1_Sub2_Sub1) local46).aClass228_1.method4866(arg4);
						return;
					}
					Static125.method1792(arg5, arg1, arg0, local46.method8425(), arg2, arg4, arg6, arg3);
					return;
				}
			}
			return;
		}
		local46 = (Interface25) Static166.method1427(arg1, arg2, arg6);
		@Pc(250) Interface25 local250 = (Interface25) Static25.method452(arg1, arg2, arg6);
		if (local46 != null && arg3 != 2) {
			if (local46 instanceof Class13_Sub1_Sub4_Sub1) {
				((Class13_Sub1_Sub4_Sub1) local46).aClass228_2.method4866(arg4);
			} else {
				Static125.method1792(arg5, arg1, arg0, local46.method8425(), arg2, arg4, arg6, arg3);
			}
		}
		if (local250 == null) {
			return;
		}
		if (local250 instanceof Class13_Sub1_Sub4_Sub1) {
			((Class13_Sub1_Sub4_Sub1) local250).aClass228_2.method4866(arg4);
			return;
		}
		Static125.method1792(arg5, arg1, arg0, local250.method8425(), arg2, arg4, arg6, arg3);
		return;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(BLclient!vj;)Lclient!caa;")
	public static Class3_Sub1 method5481(@OriginalArg(1) Class2_Sub22 arg0) {
		return new Class3_Sub1(arg0.method8526(), arg0.method8526(), arg0.method8526(), arg0.method8526(), arg0.method8539(), arg0.method8547());
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(BLclient!vj;)Lclient!uv;")
	public static Class69_Sub2 method5482(@OriginalArg(1) Class2_Sub22 arg0) {
		@Pc(12) Class69 local12 = Static24.method447(arg0);
		@Pc(16) int local16 = arg0.method8542();
		@Pc(20) int local20 = arg0.method8542();
		@Pc(26) int local26 = arg0.method8546();
		return new Class69_Sub2(local12.aClass361_10, local12.aClass306_13, local12.anInt9605, local12.anInt9611, local12.anInt9616, local12.anInt9604, local12.anInt9610, local12.anInt9613, local12.anInt9612, local16, local20, local26);
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lclient!kha;IIII)V")
	public static void method5483(@OriginalArg(0) Class191 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(14) Class2_Sub33 local14 = (Class2_Sub33) Static371.aClass109_36.method2325(); local14 != null; local14 = (Class2_Sub33) Static371.aClass109_36.method2318()) {
			if (arg3 == local14.anInt5981 && local14.anInt5974 == arg1 << 9 && arg2 << 9 == local14.anInt5988 && local14.aClass191_1.anInt4815 == arg0.anInt4815) {
				if (local14.aClass2_Sub13_Sub2_3 != null) {
					Static586.aClass2_Sub13_Sub4_2.method7226(local14.aClass2_Sub13_Sub2_3);
					local14.aClass2_Sub13_Sub2_3 = null;
				}
				if (local14.aClass2_Sub13_Sub2_2 != null) {
					Static586.aClass2_Sub13_Sub4_2.method7226(local14.aClass2_Sub13_Sub2_2);
					local14.aClass2_Sub13_Sub2_2 = null;
				}
				local14.method8653();
				return;
			}
		}
	}
}
