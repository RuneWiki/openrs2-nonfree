import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!pd", name = "V", descriptor = "[I")
	public static int[] anIntArray310;

	@OriginalMember(owner = "client!pd", name = "kb", descriptor = "Z")
	public static boolean aBoolean195;

	@OriginalMember(owner = "client!pd", name = "S", descriptor = "Lclient!sd;")
	private static Class73 aClass73_1649 = Static122.method531("M");

	@OriginalMember(owner = "client!pd", name = "T", descriptor = "J")
	public static long aLong136 = 0L;

	@OriginalMember(owner = "client!pd", name = "U", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1650 = aClass73_1649;

	@OriginalMember(owner = "client!pd", name = "ob", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1651 = aClass73_1649;

	@OriginalMember(owner = "client!pd", name = "vb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1652 = Static122.method531(" ");

	@OriginalMember(owner = "client!pd", name = "wb", descriptor = "I")
	public static int anInt2937 = 0;

	@OriginalMember(owner = "client!pd", name = "yb", descriptor = "J")
	public static long aLong137 = 0L;

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "(B)V")
	public static void method2142() {
		aClass73_1652 = null;
		anIntArray310 = null;
		aClass73_1650 = null;
		aClass73_1651 = null;
		aClass73_1649 = null;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IZZIBLclient!cb;I)V")
	public static void method2143(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte arg3, @OriginalArg(5) Class13_Sub1 arg4, @OriginalArg(6) int arg5) {
		@Pc(10) long local10 = (long) (arg5 + (arg0 << 16));
		@Pc(16) Class3_Sub1_Sub11 local16 = (Class3_Sub1_Sub11) Static6.aClass16_1.method554(local10);
		if (local16 != null) {
			return;
		}
		local16 = (Class3_Sub1_Sub11) Static158.aClass16_11.method554(local10);
		if (local16 != null) {
			return;
		}
		local16 = (Class3_Sub1_Sub11) Static79.aClass16_8.method554(local10);
		if (local16 == null) {
			if (!arg1) {
				local16 = (Class3_Sub1_Sub11) Static40.aClass16_3.method554(local10);
				if (local16 != null) {
					return;
				}
			}
			local16 = new Class3_Sub1_Sub11();
			local16.aClass13_Sub1_8 = arg4;
			local16.aByte3 = arg3;
			local16.anInt1736 = arg2;
			if (arg1) {
				Static6.aClass16_1.method546(local16, local10);
				Static163.anInt3163++;
			} else {
				Static123.aClass50_2.method1599(local16);
				Static79.aClass16_8.method546(local16, local10);
				Static31.anInt806++;
			}
		} else if (arg1) {
			local16.method2681();
			Static6.aClass16_1.method546(local16, local10);
			Static31.anInt806--;
			Static163.anInt3163++;
		}
	}

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "(III)V")
	public static void method2144(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static69.anInt1602 != 0 && arg0 != -1) {
			Static69.method1224(0, Static16.aClass13_Sub1_5, arg0, Static69.anInt1602);
			Static44.aBoolean70 = true;
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIII)V")
	public static void method2145(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = (arg2 - 32) * arg2 / arg0;
		Static105.aClass3_Sub1_Sub3_Sub3Array33[0].method1493(arg1, arg3);
		if (local7 < 8) {
			local7 = 8;
		}
		Static105.aClass3_Sub1_Sub3_Sub3Array33[1].method1493(arg1, arg2 + arg3 - 16);
		@Pc(47) int local47 = (arg2 - local7 - 32) * arg4 / (arg0 - arg2);
		Static15.method2297(arg1, arg3 + 16, 16, arg2 - 32, Static140.anInt3198);
		Static15.method2297(arg1, local47 + arg3 + 16, 16, local7, Static168.anInt3652);
		Static15.method2313(arg1, arg3 + local47 + 16, local7, Static107.anInt2462);
		Static15.method2313(arg1 + 1, arg3 + 16 + local47, local7, Static107.anInt2462);
		Static15.method2312(arg1, arg3 + local47 + 16, 16, Static107.anInt2462);
		Static15.method2312(arg1, arg3 + local47 + 17, 16, Static107.anInt2462);
		Static15.method2313(arg1 + 15, arg3 - -16 + local47, local7, Static124.anInt2867);
		Static15.method2313(arg1 + 14, arg3 - -local47 + 17, local7 - 1, Static124.anInt2867);
		Static15.method2312(arg1, local7 + local47 + arg3 + 15, 16, Static124.anInt2867);
		Static15.method2312(arg1 + 1, local47 + (arg3 - (-local7 + -14)), 15, Static124.anInt2867);
	}
}
