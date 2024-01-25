import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static542 {

	@OriginalMember(owner = "client!sca", name = "d", descriptor = "I")
	public static final int anInt8923 = 1405;

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(III)V")
	public static void method7785(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class3_Sub11_Sub4 local9 = Static583.method8201(6, (long) arg1);
		local9.method2195();
		local9.anInt2394 = arg0;
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(II)Lclient!oja;")
	public static Class256 method7786(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if ((double) Static317.aFloat114 == 3.0D) {
				return Static258.aClass256_5;
			}
			if ((double) Static317.aFloat114 == 4.0D) {
				return Static357.aClass256_6;
			}
			if ((double) Static317.aFloat114 == 6.0D) {
				return Static182.aClass256_4;
			}
			if ((double) Static317.aFloat114 >= 8.0D) {
				return Static91.aClass256_3;
			}
		} else if (arg0 == 1) {
			if ((double) Static317.aFloat114 == 3.0D) {
				return Static182.aClass256_4;
			}
			if ((double) Static317.aFloat114 == 4.0D) {
				return Static91.aClass256_3;
			}
			if ((double) Static317.aFloat114 == 6.0D) {
				return Static75.aClass256_1;
			}
			if ((double) Static317.aFloat114 >= 8.0D) {
				return Static385.aClass256_7;
			}
		} else if (arg0 == 2) {
			if ((double) Static317.aFloat114 == 3.0D) {
				return Static75.aClass256_1;
			}
			if ((double) Static317.aFloat114 == 4.0D) {
				return Static385.aClass256_7;
			}
			if ((double) Static317.aFloat114 == 6.0D) {
				return Static614.aClass256_9;
			}
			if ((double) Static317.aFloat114 >= 8.0D) {
				return Static80.aClass256_8;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(IZILclient!aj;III)V")
	public static void method7787(@OriginalArg(2) int arg0, @OriginalArg(3) Class15 arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		if (arg0 <= 0) {
			Static81.method1579(arg3, arg2, arg1);
			return;
		}
		Static499.anInt8156 = 0;
		Static512.aBoolean627 = false;
		Static403.aClass15_107 = arg1;
		Static453.anInt7540 = arg3;
		Static553.anInt9041 = arg2;
		Static257.aClass3_Sub1_Sub3_2 = null;
		Static18.anInt450 = 1;
		Static586.anInt9458 = Static366.aClass3_Sub1_Sub3_4.method2175() / arg0;
		if (Static586.anInt9458 < 1) {
			Static586.anInt9458 = 1;
		}
	}
}
