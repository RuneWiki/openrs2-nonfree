import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static529 {

	@OriginalMember(owner = "client!sw", name = "z", descriptor = "Lclient!qia;")
	public static Class276 aClass276_54;

	@OriginalMember(owner = "client!sw", name = "A", descriptor = "I")
	public static int anInt9120;

	@OriginalMember(owner = "client!sw", name = "v", descriptor = "Lclient!gaa;")
	public static Class108 aClass108_11 = null;

	@OriginalMember(owner = "client!sw", name = "y", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_124 = new Class218(75, -1);

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(IIII)I")
	public static int method7518(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return arg1;
		} else if (local7 == 2) {
			return 4095 - arg2;
		} else {
			return 4095 - arg1;
		}
	}

	@OriginalMember(owner = "client!sw", name = "c", descriptor = "(II)V")
	public static void method7519(@OriginalArg(0) int arg0) {
		if (Static552.aClass3_Sub48_30.aClass23_Sub21_1.method5653() == 0) {
			arg0 = -1;
		}
		if (Static181.anInt4316 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(34) Class314 local34 = Static535.aClass110_3.method3575(arg0);
			@Pc(38) Class28 local38 = local34.method7549();
			if (local38 == null) {
				arg0 = -1;
			} else {
				Static379.aClass228_6.method5934(local38.method611(), local38.method616(), Static177.aCanvas10, new Point(local34.anInt9152, local34.anInt9156), local38.method614());
				Static181.anInt4316 = arg0;
			}
		}
		if (arg0 == -1 && Static181.anInt4316 != -1) {
			Static379.aClass228_6.method5934(null, -1, Static177.aCanvas10, new Point(), -1);
			Static181.anInt4316 = -1;
		}
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(Lclient!mb;Z[[[BIB)Z")
	public static boolean method7520(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		if (!Static242.aBoolean481) {
			return false;
		}
		@Pc(8) int local8 = arg0.anInt10428 >> Static276.anInt5846;
		@Pc(10) int local10 = local8;
		@Pc(15) int local15 = arg0.anInt10424 >> Static276.anInt5846;
		@Pc(17) int local17 = local15;
		if (arg0 instanceof Class2_Sub3_Sub1) {
			local10 = ((Class2_Sub3_Sub1) arg0).aShort122;
			local17 = ((Class2_Sub3_Sub1) arg0).aShort123;
			local8 = ((Class2_Sub3_Sub1) arg0).aShort121;
			local15 = ((Class2_Sub3_Sub1) arg0).aShort124;
		}
		for (@Pc(38) int local38 = local8; local38 <= local10; local38++) {
			for (@Pc(41) int local41 = local15; local41 <= local17; local41++) {
				if (arg0.aByte129 < Static626.anInt10336 && local38 >= Static474.anInt8502 && local38 < Static46.anInt1028 && local41 >= Static36.anInt695 && local41 < Static310.anInt6166) {
					if ((arg2 == null || arg0.aByte128 < arg3 || arg2[arg0.aByte128][local38][local41] != arg4) && arg0.method8580() && !arg0.method8567(Static185.aClass33_8)) {
						return false;
					}
					if (!arg1 && local38 >= Static607.anInt10024 - 16 && local38 <= Static607.anInt10024 + 16 && local41 >= Static23.anInt369 - 16 && local41 <= Static23.anInt369 + 16) {
						if (Static441.aBoolean681) {
							Static162.aClass56Array1[Static332.anInt6617++].method2234(arg0);
							Static332.anInt6617 %= Static303.anInt6083;
						} else {
							arg0.method8565(Static185.aClass33_8);
						}
					}
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "([Ljava/lang/String;II[SI)V")
	public static void method7521(@OriginalArg(0) String[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) short[] arg2, @OriginalArg(4) int arg3) {
		if (arg1 <= arg3) {
			return;
		}
		@Pc(14) int local14 = (arg1 + arg3) / 2;
		@Pc(16) int local16 = arg3;
		@Pc(20) String local20 = arg0[local14];
		arg0[local14] = arg0[arg1];
		arg0[arg1] = local20;
		@Pc(34) short local34 = arg2[local14];
		arg2[local14] = arg2[arg1];
		arg2[arg1] = local34;
		for (@Pc(46) int local46 = arg3; local46 < arg1; local46++) {
			if (local20 == null || arg0[local46] != null && (local46 & 0x1) > arg0[local46].compareTo(local20)) {
				@Pc(67) String local67 = arg0[local46];
				arg0[local46] = arg0[local16];
				arg0[local16] = local67;
				@Pc(81) short local81 = arg2[local46];
				arg2[local46] = arg2[local16];
				arg2[local16++] = local81;
			}
		}
		arg0[arg1] = arg0[local16];
		arg0[local16] = local20;
		arg2[arg1] = arg2[local16];
		arg2[local16] = local34;
		method7521(arg0, local16 - 1, arg2, arg3);
		method7521(arg0, arg1, arg2, local16 + 1);
	}
}
