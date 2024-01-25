import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static429 {

	@OriginalMember(owner = "client!qfa", name = "b", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!qfa", name = "c", descriptor = "[[[S")
	public static short[][][] aShortArrayArrayArray3;

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IZ)V")
	public static void method6073(@OriginalArg(1) boolean arg0) {
		if (Static78.aClass152_2 != null) {
			Static78.aClass152_2.method3908();
			Static78.aClass152_2 = null;
		}
		Static582.anInt9301 = 0;
		Static65.method1513();
		Static125.method2539();
		for (@Pc(19) int local19 = 0; local19 < 4; local19++) {
			Static221.aClass95Array2[local19].method2739();
		}
		Static81.method1765(false);
		System.gc();
		Static146.method2755();
		Static380.anInt6546 = -1;
		Static127.aBoolean238 = false;
		Static7.method105(true);
		Static16.anInt248 = 0;
		Static463.anInt7588 = 0;
		Static596.anInt9431 = 0;
		Static282.anInt5183 = 0;
		Static345.anInt6056 = 0;
		Static529.anInt8344 = 0;
		for (@Pc(63) int local63 = 0; local63 < Static443.aClass122Array1.length; local63++) {
			Static443.aClass122Array1[local63] = null;
		}
		Static239.method3995();
		for (@Pc(78) int local78 = 0; local78 < 2048; local78++) {
			Static438.aClass9_Sub1_Sub1_Sub2_Sub2Array2[local78] = null;
		}
		Static49.anInt1058 = 0;
		Static243.aClass310_16.method6605();
		Static568.anInt9131 = 0;
		Static508.aClass310_33.method6605();
		Static548.method7334();
		Static435.anInt7197 = 0;
		Static427.aClass56_1.method1733();
		Static479.method6564();
		Static138.method2653();
		Static549.aClass3_Sub5_2 = null;
		Static73.aLong48 = 0L;
		if (arg0) {
			Static113.method2374(12);
			return;
		}
		Static113.method2374(3);
		try {
			Static605.method6792("loggedout", Static533.anApplet4);
		} catch (@Pc(125) Throwable local125) {
		}
	}

	@OriginalMember(owner = "client!qfa", name = "b", descriptor = "(IZ)V")
	public static void method6075(@OriginalArg(0) int arg0) {
		Static529.anInt8343 = arg0;
		Static19.aClass10_3.method263();
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Z)V")
	public static void method6076() {
		@Pc(5) int local5;
		if (Static476.aClass241Array35 != null) {
			for (local5 = 0; local5 < Static333.anInt5940; local5++) {
				Static476.aClass241Array35[local5] = null;
			}
			Static476.aClass241Array35 = null;
		}
		if (Static436.aClass241Array30 != null) {
			for (local5 = 0; local5 < Static236.anInt4467; local5++) {
				Static436.aClass241Array30[local5] = null;
			}
			Static436.aClass241Array30 = null;
		}
		if (Static477.aClass241Array33 != null) {
			for (local5 = 0; local5 < Static227.anInt4402; local5++) {
				Static477.aClass241Array33[local5] = null;
			}
			Static477.aClass241Array33 = null;
		}
		Static571.anIntArray639 = null;
		anIntArrayArrayArray14 = null;
		Static91.anInt2280 = -1;
		Static28.anInt683 = -1;
		Static466.aClass241Array37 = null;
	}

	@OriginalMember(owner = "client!qfa", name = "c", descriptor = "(B)V")
	public static void method6077() {
		Static478.aClass127_1.method3273();
		Static563.aClass156_1.method5687();
		Static478.aClient1.method1626();
		Static347.aCanvas9.setBackground(Color.black);
		Static47.anInt1017 = -1;
		Static478.aClass127_1 = Static478.method6562(Static347.aCanvas9);
		Static563.aClass156_1 = Static151.method2793(Static347.aCanvas9);
	}
}
