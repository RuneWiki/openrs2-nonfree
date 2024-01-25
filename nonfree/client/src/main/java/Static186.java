import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!gda", name = "N", descriptor = "J")
	public static long aLong110;

	// $FF: synthetic field
	@OriginalMember(owner = "client!gda", name = "S", descriptor = "Ljava/lang/Class;")
	private static Class aClass21;

	@OriginalMember(owner = "client!gda", name = "L", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_91 = new Class160(64, 3);

	@OriginalMember(owner = "client!gda", name = "P", descriptor = "I")
	public static int anInt3088 = 1;

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method2742(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = arg0.charAt(local12) + (local10 << 5) - local10;
		}
		if (19417 != 19417) {
			aLong110 = -60L;
		}
		return local10;
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2744(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 < 0 || arg0 < 0 || Static380.anInt6689 - 1 <= arg5 || Static542.anInt9214 - 1 <= arg0) {
			return;
		}
		if (Static63.aClass89ArrayArrayArray1 == null) {
			return;
		}
		@Pc(52) Interface16 local52;
		if (arg2 == 0) {
			local52 = (Interface16) Static34.method575(arg4, arg5, arg0);
			@Pc(58) Interface16 local58 = (Interface16) Static71.method1139(arg4, arg5, arg0);
			if (local52 != null && arg3 != 2) {
				if (local52 instanceof Class4_Sub3_Sub1_Sub2) {
					((Class4_Sub3_Sub1_Sub2) local52).aClass100_3.method2138(arg1);
				} else {
					Static19.method296(arg0, arg3, local52.method9501(), arg2, arg6, arg1, arg5, arg4);
				}
			}
			if (local58 != null) {
				if (!(local58 instanceof Class4_Sub3_Sub1_Sub2)) {
					Static19.method296(arg0, arg3, local58.method9501(), arg2, arg6, arg1, arg5, arg4);
					return;
				}
				((Class4_Sub3_Sub1_Sub2) local58).aClass100_3.method2138(arg1);
				return;
			}
			return;
		}
		if (arg2 == 1) {
			local52 = (Interface16) Static161.method1396(arg4, arg5, arg0);
			if (local52 != null) {
				if (!(local52 instanceof Class4_Sub3_Sub5_Sub2)) {
					@Pc(146) int local146 = local52.method9501();
					if (arg3 != 4 && arg3 != 5) {
						if (arg3 == 6) {
							Static19.method296(arg0, 4, local146, arg2, arg6 + 4, arg1, arg5, arg4);
							return;
						}
						if (arg3 == 7) {
							Static19.method296(arg0, 4, local146, arg2, (arg6 + 2 & 0x3) + 4, arg1, arg5, arg4);
						} else if (arg3 == 8) {
							Static19.method296(arg0, 4, local146, arg2, arg6 + 4, arg1, arg5, arg4);
							Static19.method296(arg0, 4, local146, arg2, (arg6 + 2 & 0x3) + 4, arg1, arg5, arg4);
							return;
						}
						return;
					}
					Static19.method296(arg0, 4, local146, arg2, arg6, arg1, arg5, arg4);
					return;
				}
				((Class4_Sub3_Sub5_Sub2) local52).aClass100_4.method2138(arg1);
				return;
			}
			return;
		}
		if (arg2 == 2) {
			local52 = (Interface16) Static492.method7403(arg4, arg5, arg0, aClass21 == null ? (aClass21 = Class14_Sub7_Sub13.a("np")) : aClass21);
			if (local52 != null) {
				if (arg3 == 11) {
					arg3 = 10;
				}
				if (!(local52 instanceof Class4_Sub3_Sub3_Sub2)) {
					Static19.method296(arg0, arg3, local52.method9501(), arg2, arg6, arg1, arg5, arg4);
					return;
				}
				((Class4_Sub3_Sub3_Sub2) local52).aClass100_1.method2138(arg1);
				return;
			}
			return;
		}
		if (arg2 != 3) {
			return;
		}
		local52 = (Interface16) Static447.method6640(arg4, arg5, arg0);
		if (local52 == null) {
			return;
		}
		if (local52 instanceof Class4_Sub3_Sub2_Sub1) {
			((Class4_Sub3_Sub2_Sub1) local52).aClass100_2.method2138(arg1);
			return;
		}
		Static19.method296(arg0, arg3, local52.method9501(), arg2, arg6, arg1, arg5, arg4);
		return;
	}
}
