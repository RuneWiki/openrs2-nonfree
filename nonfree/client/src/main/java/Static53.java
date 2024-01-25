import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!de", name = "D", descriptor = "Lclient!ae;")
	public static Class4 aClass4_5;

	@OriginalMember(owner = "client!de", name = "E", descriptor = "I")
	public static int anInt1374;

	@OriginalMember(owner = "client!de", name = "e", descriptor = "(B)V")
	public static void method1330() {
		if (Static122.anInt1355 < 0) {
			return;
		}
		@Pc(13) long local13 = Static183.method3462();
		Static122.anInt1355 = (int) ((long) Static122.anInt1355 + Static187.aLong137 - local13);
		if (Static122.anInt1355 <= 0) {
			Static56.anInt1435 = Static364.aClass54_2.anInt1877;
			Static188.aClass13_3 = Static364.aClass54_2.aClass13_1;
			Static265.aFloat56 = Static364.aClass54_2.aFloat17;
			Static288.anInt5584 = Static364.aClass54_2.anInt1879;
			Static215.anInt4291 = Static364.aClass54_2.anInt1878;
			Static110.aFloat19 = Static364.aClass54_2.aFloat14;
			Static73.aFloat11 = Static364.aClass54_2.aFloat15;
			Static16.aFloat8 = Static364.aClass54_2.aFloat16;
			Static122.anInt1355 = -1;
			Static243.aFloat53 = Static364.aClass54_2.aFloat12;
			Static338.aFloat63 = Static364.aClass54_2.aFloat13;
		} else {
			@Pc(63) int local63 = (Static122.anInt1355 << 8) / Static148.anInt3115;
			@Pc(68) int local68 = 255 - local63;
			@Pc(73) float local73 = (float) local63 / 255.0F;
			@Pc(77) float local77 = 1.0F - local73;
			Static215.anInt4291 = (local63 * (Static48.anInt2956 & 0xFF00) + local68 * (Static364.aClass54_2.anInt1878 & 0xFF00) & 0xFF0000) + (local68 * (Static364.aClass54_2.anInt1878 & 0xFF00FF) + local63 * (Static48.anInt2956 & 0xFF00FF) & 0xFF00FF00) >>> 8;
			Static73.aFloat11 = local77 * (Static364.aClass54_2.aFloat15 - Static73.aFloat10) + Static73.aFloat10;
			Static338.aFloat63 = (Static364.aClass54_2.aFloat13 - Static97.aFloat18) * local77 + Static97.aFloat18;
			Static243.aFloat53 = (Static364.aClass54_2.aFloat12 - Static113.aFloat20) * local77 + Static113.aFloat20;
			Static110.aFloat19 = Static118.aFloat21 + (Static364.aClass54_2.aFloat14 - Static118.aFloat21) * local77;
			Static16.aFloat8 = (Static364.aClass54_2.aFloat16 - Static202.aFloat50) * local77 + Static202.aFloat50;
			Static288.anInt5584 = local63 * Static133.anInt2878 + Static364.aClass54_2.anInt1879 * local68 >> 8;
			Static265.aFloat56 = local77 * (Static364.aClass54_2.aFloat17 - Static265.aFloat57) + Static265.aFloat57;
			Static56.anInt1435 = (local68 * (Static364.aClass54_2.anInt1877 & 0xFF00) + local63 * (Static162.anInt3333 & 0xFF00) & 0xFF0000) + (local68 * (Static364.aClass54_2.anInt1877 & 0xFF00FF) + local63 * (Static162.anInt3333 & 0xFF00FF) & 0xFF00FF00) >>> 8;
			if (Static364.aClass54_2.aClass13_1 != Static85.aClass13_2) {
				Static188.aClass13_3 = Static51.aClass63_2.method4631(Static85.aClass13_2, Static364.aClass54_2.aClass13_1, local77, Static188.aClass13_3);
			}
		}
		Static187.aLong137 = local13;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!we;Z)I")
	public static int method1331(@OriginalArg(0) Class11_Sub2_Sub6_Sub2 arg0) {
		@Pc(8) Class208 local8 = arg0.aClass208_1;
		if (local8.anIntArray480 != null) {
			local8 = local8.method5539();
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(27) int local27 = local8.anInt6190;
		@Pc(31) Class67 local31 = arg0.method5898();
		if (arg0.aBoolean499) {
			local27 = local8.anInt6176;
		} else if (local31.anInt2097 == arg0.anInt6733 || local31.anInt2099 == arg0.anInt6733 || arg0.anInt6733 == local31.anInt2110 || arg0.anInt6733 == local31.anInt2143) {
			local27 = local8.anInt6163;
		} else if (local31.anInt2114 == arg0.anInt6733 || arg0.anInt6733 == local31.anInt2109 || local31.anInt2113 == arg0.anInt6733 || local31.anInt2115 == arg0.anInt6733) {
			local27 = local8.anInt6156;
		}
		return local27;
	}
}
