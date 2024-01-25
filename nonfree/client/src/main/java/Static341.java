import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
	public static int anInt5728;

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_103 = new Class186(94, -1);

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
	public static int anInt5727 = 0;

	@OriginalMember(owner = "client!rc", name = "i", descriptor = "[S")
	public static final short[] aShortArray73 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIILclient!qq;IIIII)V")
	public static void method4810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class28 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) Interface10 local11 = (Interface10) Static428.method5836(arg3, arg4, arg0);
		@Pc(28) Class118 local28;
		@Pc(34) int local34;
		@Pc(38) int local38;
		@Pc(44) int local44;
		if (local11 != null) {
			local28 = Static113.aClass127_2.method2820(local11.method5812());
			local34 = local11.method5811() & 0x3;
			local38 = local11.method5807();
			if (local28.anInt2988 == -1) {
				local44 = arg5;
				if (local28.anInt2984 > 0) {
					local44 = arg6;
				}
				if (local38 == 0 || local38 == 2) {
					if (local34 == 0) {
						arg2.method3534(arg1, arg7, local44, 4);
					} else if (local34 == 1) {
						arg2.method3477(arg7, local44, 4, arg1);
					} else if (local34 == 2) {
						arg2.method3534(arg1 + 3, arg7, local44, 4);
					} else if (local34 == 3) {
						arg2.method3477(arg7 + 3, local44, 4, arg1);
					}
				}
				if (local38 == 3) {
					if (local34 == 0) {
						arg2.method3531(arg1, local44, arg7, 1, 1);
					} else if (local34 == 1) {
						arg2.method3531(arg1 + 3, local44, arg7, 1, 1);
					} else if (local34 == 2) {
						arg2.method3531(arg1 + 3, local44, arg7 + 3, 1, 1);
					} else if (local34 == 3) {
						arg2.method3531(arg1, local44, arg7 + 3, 1, 1);
					}
				}
				if (local38 == 2) {
					if (local34 == 0) {
						arg2.method3477(arg7, local44, 4, arg1);
					} else if (local34 == 1) {
						arg2.method3534(arg1 + 3, arg7, local44, 4);
					} else if (local34 == 2) {
						arg2.method3477(arg7 + 3, local44, 4, arg1);
					} else if (local34 == 3) {
						arg2.method3534(arg1, arg7, local44, 4);
					}
				}
			} else {
				Static350.method4967(local28, arg7, arg1, local34, arg2);
			}
		}
		local11 = (Interface10) Static49.method903(arg3, arg4, arg0, tf.class);
		if (local11 != null) {
			local28 = Static113.aClass127_2.method2820(local11.method5812());
			local34 = local11.method5811() & 0x3;
			local38 = local11.method5807();
			if (local28.anInt2988 != -1) {
				Static350.method4967(local28, arg7, arg1, local34, arg2);
			} else if (local38 == 9) {
				local44 = -1118482;
				if (local28.anInt2984 > 0) {
					local44 = -1179648;
				}
				if (local34 == 0 || local34 == 2) {
					arg2.method3523(arg7 + 3, arg1 + 3, arg7, local44, arg1);
				} else {
					arg2.method3523(arg7, arg1 + 3, arg7 - -3, local44, arg1);
				}
			}
		}
		local11 = (Interface10) Static91.method1566(arg3, arg4, arg0);
		if (local11 == null) {
			return;
		}
		local28 = Static113.aClass127_2.method2820(local11.method5812());
		local34 = local11.method5811() & 0x3;
		if (local28.anInt2988 != -1) {
			Static350.method4967(local28, arg7, arg1, local34, arg2);
			return;
		}
	}
}
