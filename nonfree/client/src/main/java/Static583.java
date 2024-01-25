import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static583 {

	@OriginalMember(owner = "client!tp", name = "N", descriptor = "I")
	public static int anInt10018;

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "(III)Z")
	public static boolean method8331(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x60000) != 0 | Static595.method8432(arg1, arg0) || Static248.method3657(arg0, arg1);
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lclient!wia;B)V")
	public static void method8332(@OriginalArg(0) Class386 arg0) {
		Static660.aClass386_139 = arg0;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(II[Lclient!mea;)V")
	public static void method8333(@OriginalArg(1) int arg0, @OriginalArg(2) Class230[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(13) Class230 local13 = arg1[local7];
			if (local13 != null) {
				if (local13.anInt6660 == 0) {
					if (local13.aClass230Array2 != null) {
						method8333(arg0, local13.aClass230Array2);
					}
					@Pc(37) Class14_Sub32 local37 = (Class14_Sub32) Static547.aClass187_69.method4078((long) local13.anInt6663);
					if (local37 != null) {
						Static233.method3542(local37.anInt6351, arg0);
					}
				}
				@Pc(56) Class14_Sub55 local56;
				if (arg0 == 0 && local13.anObjectArray8 != null) {
					local56 = new Class14_Sub55();
					local56.aClass230_14 = local13;
					local56.anObjectArray33 = local13.anObjectArray8;
					Static632.method8830(local56);
				}
				if (arg0 == 1 && local13.anObjectArray31 != null) {
					if (local13.anInt6679 >= 0) {
						@Pc(81) Class230 local81 = Static655.method9094(local13.anInt6663);
						if (local81 == null || local81.aClass230Array2 == null || local81.aClass230Array2.length <= local13.anInt6679 || local13 != local81.aClass230Array2[local13.anInt6679]) {
							continue;
						}
					}
					local56 = new Class14_Sub55();
					local56.aClass230_14 = local13;
					local56.anObjectArray33 = local13.anObjectArray31;
					Static632.method8830(local56);
				}
			}
		}
	}

	@OriginalMember(owner = "client!tp", name = "c", descriptor = "(II)Z")
	public static boolean method8334(@OriginalArg(0) int arg0) {
		return arg0 == 51 || arg0 == 9 || arg0 == 45 || arg0 == 48 || arg0 == 18 || arg0 == 49 || arg0 == 6;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIIII)V")
	public static void method8335(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 - arg3 >= Static313.anInt9045 && Static575.anInt9879 >= arg3 + arg2 && arg1 - arg3 >= Static468.anInt355 && Static370.anInt10475 >= arg3 + arg1) {
			Static576.method8232(arg2, arg1, arg0, arg3);
		} else {
			Static47.method971(arg2, arg3, arg1, arg0);
		}
	}
}
