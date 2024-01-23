import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!gj", name = "q", descriptor = "I")
	public static int anInt1709 = 0;

	@OriginalMember(owner = "client!gj", name = "s", descriptor = "I")
	public static int anInt1711 = -1;

	@OriginalMember(owner = "client!gj", name = "v", descriptor = "S")
	public static short aShort14 = 320;

	@OriginalMember(owner = "client!gj", name = "B", descriptor = "Lclient!kh;")
	public static Class60 aClass60_539 = Static200.method3116("blinken1:");

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!ah;IZII)V")
	public static void method1254(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		@Pc(8) int local8 = arg0.anInt251;
		@Pc(11) int local11 = arg0.anInt221;
		if (arg0.aByte4 == 0) {
			arg0.anInt251 = arg0.anInt232;
		} else if (arg0.aByte4 == 1) {
			arg0.anInt251 = arg3 - arg0.anInt232;
		} else if (arg0.aByte4 == 2) {
			arg0.anInt251 = arg0.anInt232 * arg3 >> 14;
		} else if (arg0.aByte4 == 3) {
			if (arg0.anInt233 == 2) {
				arg0.anInt251 = arg0.anInt232 * 32 + (arg0.anInt232 - 1) * arg0.anInt238;
			} else if (arg0.anInt233 == 7) {
				arg0.anInt251 = arg0.anInt238 * (arg0.anInt232 - 1) + arg0.anInt232 * 115;
			}
		}
		if (arg0.aByte3 == 0) {
			arg0.anInt221 = arg0.anInt271;
		} else if (arg0.aByte3 == 1) {
			arg0.anInt221 = arg1 - arg0.anInt271;
		} else if (arg0.aByte3 == 2) {
			arg0.anInt221 = arg0.anInt271 * arg1 >> 14;
		} else if (arg0.aByte3 == 3) {
			if (arg0.anInt233 == 2) {
				arg0.anInt221 = arg0.anInt271 * 32 + (arg0.anInt271 - 1) * arg0.anInt260;
			} else if (arg0.anInt233 == 7) {
				arg0.anInt221 = arg0.anInt271 * 12 + arg0.anInt260 * (arg0.anInt271 - 1);
			}
		}
		if (Static94.aBoolean118 && (Static166.method2717(arg0) != 0 || arg0.anInt233 == 0)) {
			if (arg0.anInt221 < 5 && arg0.anInt251 < 5) {
				arg0.anInt251 = 5;
				arg0.anInt221 = 5;
			} else {
				if (arg0.anInt221 <= 0) {
					arg0.anInt221 = 5;
				}
				if (arg0.anInt251 <= 0) {
					arg0.anInt251 = 5;
				}
			}
		}
		if (arg2 && arg0.anObjectArray17 != null && (local8 != arg0.anInt251 || local11 != arg0.anInt221)) {
			@Pc(247) Class1_Sub8 local247 = new Class1_Sub8();
			local247.aClass6_5 = arg0;
			local247.anObjectArray29 = arg0.anObjectArray17;
			Static93.method1622(local247);
		}
	}
}
