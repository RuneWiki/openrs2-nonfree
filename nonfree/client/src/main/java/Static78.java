import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!d", name = "G", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_31 = new Class45(58, -1);

	@OriginalMember(owner = "client!d", name = "S", descriptor = "J")
	public static long aLong34 = 0L;

	@OriginalMember(owner = "client!d", name = "T", descriptor = "I")
	public static int anInt1823 = 0;

	@OriginalMember(owner = "client!d", name = "U", descriptor = "I")
	public static int anInt1824 = -1;

	@OriginalMember(owner = "client!d", name = "V", descriptor = "[I")
	public static final int[] anIntArray182 = new int[6];

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Z")
	public static boolean method1703(@OriginalArg(1) int arg0) {
		return (-arg0 & arg0) == arg0;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIILclient!qa;BIIII)V")
	public static void method1704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class42 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) Interface19 local11 = (Interface19) Static324.method5105(arg2, arg7, arg5);
		@Pc(20) Class279 local20;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(36) int local36;
		if (local11 != null) {
			local20 = Static49.aClass155_2.method4063(local11.method7915());
			local26 = local11.method7919() & 0x3;
			local30 = local11.method7918();
			if (local20.anInt8323 == -1) {
				local36 = arg6;
				if (local20.anInt8276 > 0) {
					local36 = arg0;
				}
				if (local30 == 0 || local30 == 2) {
					if (local26 == 0) {
						arg3.method5840(arg4, 4, local36, arg1);
					} else if (local26 == 1) {
						arg3.method5827(local36, 4, arg4, arg1);
					} else if (local26 == 2) {
						arg3.method5840(arg4, 4, local36, arg1 + 3);
					} else if (local26 == 3) {
						arg3.method5827(local36, 4, arg4 + 3, arg1);
					}
				}
				if (local30 == 3) {
					if (local26 == 0) {
						arg3.method5866(arg4, 1, 1, local36, arg1);
					} else if (local26 == 1) {
						arg3.method5866(arg4, 1, 1, local36, arg1 + 3);
					} else if (local26 == 2) {
						arg3.method5866(arg4 + 3, 1, 1, local36, arg1 + 3);
					} else if (local26 == 3) {
						arg3.method5866(arg4 + 3, 1, 1, local36, arg1);
					}
				}
				if (local30 == 2) {
					if (local26 == 0) {
						arg3.method5827(local36, 4, arg4, arg1);
					} else if (local26 == 1) {
						arg3.method5840(arg4, 4, local36, arg1 + 3);
					} else if (local26 == 2) {
						arg3.method5827(local36, 4, arg4 + 3, arg1);
					} else if (local26 == 3) {
						arg3.method5840(arg4, 4, local36, arg1);
					}
				}
			} else {
				Static86.method1906(arg4, arg1, local20, arg3, local26);
			}
		}
		local11 = (Interface19) Static531.method7866(arg2, arg7, arg5, wf.class);
		if (local11 != null) {
			local20 = Static49.aClass155_2.method4063(local11.method7915());
			local26 = local11.method7919() & 0x3;
			local30 = local11.method7918();
			if (local20.anInt8323 != -1) {
				Static86.method1906(arg4, arg1, local20, arg3, local26);
			} else if (local30 == 9) {
				local36 = -1118482;
				if (local20.anInt8276 > 0) {
					local36 = -1179648;
				}
				if (local26 == 0 || local26 == 2) {
					arg3.method5865(arg4 + 3, arg1 - -3, arg4, local36, arg1);
				} else {
					arg3.method5865(arg4, arg1 + 3, arg4 + 3, local36, arg1);
				}
			}
		}
		local11 = (Interface19) Static160.method3298(arg2, arg7, arg5);
		if (local11 == null) {
			return;
		}
		local20 = Static49.aClass155_2.method4063(local11.method7915());
		local26 = local11.method7919() & 0x3;
		if (local20.anInt8323 != -1) {
			Static86.method1906(arg4, arg1, local20, arg3, local26);
			return;
		}
	}
}
