import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!fha", name = "p", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_41 = new Class274(81, 6);

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(IIII)I")
	public static int method2909(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return 4095 - arg2;
		} else if (local3 == 2) {
			return 4095 - arg0;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(Lclient!gs;Z[[[BIB)Z")
	public static boolean method2910(@OriginalArg(0) Class11_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		if (!Static481.aBoolean615) {
			return false;
		}
		@Pc(8) int local8 = arg0.anInt9925 >> Static415.anInt7579;
		@Pc(10) int local10 = local8;
		@Pc(15) int local15 = arg0.anInt9929 >> Static415.anInt7579;
		@Pc(17) int local17 = local15;
		if (arg0 instanceof Class11_Sub1_Sub1) {
			local10 = ((Class11_Sub1_Sub1) arg0).aShort96;
			local17 = ((Class11_Sub1_Sub1) arg0).aShort94;
			local8 = ((Class11_Sub1_Sub1) arg0).aShort95;
			local15 = ((Class11_Sub1_Sub1) arg0).aShort97;
		}
		for (@Pc(38) int local38 = local8; local38 <= local10; local38++) {
			for (@Pc(41) int local41 = local15; local41 <= local17; local41++) {
				if (arg0.aByte125 < Static330.anInt4381 && local38 >= Static299.anInt5579 && local38 < Static181.anInt4006 && local41 >= Static171.anInt3808 && local41 < Static466.anInt4484) {
					if ((arg2 == null || arg0.aByte124 < arg3 || arg2[arg0.aByte124][local38][local41] != arg4) && arg0.method8314() && !arg0.method8302()) {
						return false;
					}
					if (!arg1 && local38 >= Static623.anInt9563 - 16 && local38 <= Static623.anInt9563 + 16 && local41 >= Static507.anInt8547 - 16 && local41 <= Static507.anInt8547 + 16) {
						if (Static501.aBoolean631) {
							Static328.aClass103Array1[Static371.anInt6617++].method2671(arg0);
							Static371.anInt6617 %= Static37.anInt925;
						} else {
							arg0.method8312(Static328.aClass87_6);
						}
					}
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!fha", name = "b", descriptor = "(B)V")
	public static void method2912() {
		Static202.aClass20_8 = null;
		Static280.aClass20_13 = null;
		Static71.aClass20_2 = null;
		Static267.aClass20_32 = null;
		Static405.aClass20_31 = null;
		Static403.aClass20_30 = null;
		Static185.aClass20Array5 = null;
		Static345.aClass20_28 = null;
		Static318.aClass20_27 = null;
	}

	@OriginalMember(owner = "client!fha", name = "b", descriptor = "(III)I")
	public static int method2913(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static134.anIntArray222[arg1 & 0x3] : Static338.anIntArray412[arg1 & 0x3];
	}
}
