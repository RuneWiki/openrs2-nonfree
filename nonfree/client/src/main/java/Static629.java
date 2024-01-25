import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static629 {

	@OriginalMember(owner = "client!vda", name = "g", descriptor = "I")
	public static int anInt10041 = 1;

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(IIBIIIII)V")
	public static void method8787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 < 0 || arg0 < 0 || arg5 >= Static158.anInt927 - 1 || Static515.anInt8292 - 1 <= arg0) {
			return;
		}
		if (Static15.aClass164ArrayArrayArray5 == null) {
			return;
		}
		@Pc(42) Interface11 local42;
		if (arg2 != 0) {
			if (arg2 == 1) {
				local42 = (Interface11) Static358.method5269(arg4, arg5, arg0);
				if (local42 != null) {
					if (!(local42 instanceof Class28_Sub1_Sub2_Sub1)) {
						@Pc(53) int local53 = local42.method9221();
						if (arg1 != 4 && arg1 != 5) {
							if (arg1 != 6) {
								if (arg1 == 7) {
									Static545.method6696(arg0, 4, (arg3 + 2 & 0x3) + 4, local53, arg5, arg6, arg2, arg4);
								} else if (arg1 == 8) {
									Static545.method6696(arg0, 4, arg3 + 4, local53, arg5, arg6, arg2, arg4);
									Static545.method6696(arg0, 4, (arg3 + 2 & 0x3) + 4, local53, arg5, arg6, arg2, arg4);
									return;
								}
								return;
							}
							Static545.method6696(arg0, 4, arg3 + 4, local53, arg5, arg6, arg2, arg4);
							return;
						}
						Static545.method6696(arg0, 4, arg3, local53, arg5, arg6, arg2, arg4);
						return;
					}
					((Class28_Sub1_Sub2_Sub1) local42).aClass90_1.method2531(arg6);
					return;
				}
				return;
			}
			if (arg2 == 2) {
				local42 = (Interface11) Static318.method4861(arg4, arg5, arg0, he.class);
				if (local42 != null) {
					if (arg1 == 11) {
						arg1 = 10;
					}
					if (!(local42 instanceof Class28_Sub1_Sub1_Sub5)) {
						Static545.method6696(arg0, arg1, arg3, local42.method9221(), arg5, arg6, arg2, arg4);
						return;
					}
					((Class28_Sub1_Sub1_Sub5) local42).aClass90_4.method2531(arg6);
					return;
				}
				return;
			}
			if (arg2 == 3) {
				local42 = (Interface11) Static280.method4469(arg4, arg5, arg0);
				if (local42 != null) {
					if (local42 instanceof Class28_Sub1_Sub3_Sub1) {
						((Class28_Sub1_Sub3_Sub1) local42).aClass90_2.method2531(arg6);
						return;
					}
					Static545.method6696(arg0, arg1, arg3, local42.method9221(), arg5, arg6, arg2, arg4);
					return;
				}
			}
			return;
		}
		local42 = (Interface11) Static583.method8200(arg4, arg5, arg0);
		@Pc(252) Interface11 local252 = (Interface11) Static228.method3901(arg4, arg5, arg0);
		if (local42 != null && arg1 != 2) {
			if (local42 instanceof Class28_Sub1_Sub4_Sub1) {
				((Class28_Sub1_Sub4_Sub1) local42).aClass90_3.method2531(arg6);
			} else {
				Static545.method6696(arg0, arg1, arg3, local42.method9221(), arg5, arg6, arg2, arg4);
			}
		}
		if (local252 == null) {
			return;
		}
		if (local252 instanceof Class28_Sub1_Sub4_Sub1) {
			((Class28_Sub1_Sub4_Sub1) local252).aClass90_3.method2531(arg6);
			return;
		}
		Static545.method6696(arg0, arg1, arg3, local252.method9221(), arg5, arg6, arg2, arg4);
		return;
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lclient!aj;II)Lclient!eia;")
	public static Class88 method8788(@OriginalArg(0) Class15 arg0, @OriginalArg(2) int arg1) {
		@Pc(13) byte[] local13 = arg0.method536(arg1);
		return local13 == null ? null : new Class88(local13);
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method8792(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 0;
		@Pc(14) int local14 = arg0.length();
		while (local11 < local14 && Static408.method5794(arg0.charAt(local11))) {
			local11++;
		}
		while (local11 < local14 && Static408.method5794(arg0.charAt(local14 - 1))) {
			local14--;
		}
		@Pc(49) int local49 = local14 - local11;
		if (local49 < 1 || local49 > 12) {
			return null;
		}
		@Pc(64) StringBuffer local64 = new StringBuffer(local49);
		for (@Pc(66) int local66 = local11; local66 < local14; local66++) {
			@Pc(72) char local72 = arg0.charAt(local66);
			if (Static219.method3798(local72)) {
				@Pc(82) char local82 = Static190.method3479(local72);
				if (local82 != '\u0000') {
					local64.append(local82);
				}
			}
		}
		if (local64.length() == 0) {
			return null;
		} else {
			return local64.toString();
		}
	}
}
