import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!es", name = "Z", descriptor = "I")
	public static int anInt10490;

	@OriginalMember(owner = "client!es", name = "Eb", descriptor = "I")
	public static int anInt10520;

	@OriginalMember(owner = "client!es", name = "j", descriptor = "[I")
	public static final int[] anIntArray720 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!es", name = "B", descriptor = "Lclient!oh;")
	public static final Class268 aClass268_44 = new Class268("", 13);

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IIIIIII)I")
	public static int method8825(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg4 & 0x1) == 1) {
			@Pc(8) int local8 = arg0;
			arg0 = arg5;
			arg5 = local8;
		}
		@Pc(20) int local20 = arg2 & 0x3;
		if (local20 == 0) {
			return arg3;
		} else if (local20 == 1) {
			return 7 + 1 - arg1 - arg0;
		} else if (local20 == 2) {
			return 1 + 7 - arg5 - arg3;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(Lclient!gda;Z[[[BIB)Z")
	public static boolean method8868(@OriginalArg(0) Class3_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		if (!Static284.aBoolean342) {
			return false;
		}
		@Pc(8) int local8 = arg0.anInt9925 >> Static273.anInt4424;
		@Pc(10) int local10 = local8;
		@Pc(15) int local15 = arg0.anInt9917 >> Static273.anInt4424;
		@Pc(17) int local17 = local15;
		if (arg0 instanceof Class3_Sub1_Sub2) {
			local10 = ((Class3_Sub1_Sub2) arg0).aShort123;
			local17 = ((Class3_Sub1_Sub2) arg0).aShort122;
			local8 = ((Class3_Sub1_Sub2) arg0).aShort124;
			local15 = ((Class3_Sub1_Sub2) arg0).aShort125;
		}
		for (@Pc(38) int local38 = local8; local38 <= local10; local38++) {
			for (@Pc(41) int local41 = local15; local41 <= local17; local41++) {
				if (arg0.aByte142 < Static539.anInt8345 && local38 >= Static358.anInt5430 && local38 < Static240.anInt3965 && local41 >= Static355.anInt5409 && local41 < Static181.anInt3123) {
					if ((arg2 == null || arg0.aByte141 < arg3 || arg2[arg0.aByte141][local38][local41] != arg4) && arg0.method8503() && !arg0.method8490(Static246.aClass33_6)) {
						return false;
					}
					if (!arg1 && local38 >= Static323.anInt5049 - 16 && local38 <= Static323.anInt5049 + 16 && local41 >= Static417.anInt6041 - 16 && local41 <= Static417.anInt6041 + 16) {
						if (Static186.aBoolean244) {
							Static48.aClass394Array1[Static670.anInt6844++].method8980(arg0);
							Static670.anInt6844 %= Static71.anInt1495;
						} else {
							arg0.method8492(Static246.aClass33_6);
						}
					}
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!es", name = "r", descriptor = "(I)V")
	public static void method8881() {
		Static69.aClass66_9.method1988();
		Static587.aClass367_13.method8305();
		Static205.aClass367_2.method8305();
	}
}
