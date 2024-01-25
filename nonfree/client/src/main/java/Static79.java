import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IIIZLclient!tq;)V")
	public static void method1460(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class239 arg3) {
		@Pc(8) int local8 = arg3.anInt6435;
		@Pc(11) int local11 = arg3.anInt6408;
		if (arg3.aByte92 == 0) {
			arg3.anInt6435 = arg3.anInt6459;
		} else if (arg3.aByte92 == 1) {
			arg3.anInt6435 = arg1 - arg3.anInt6459;
		} else if (arg3.aByte92 == 2) {
			arg3.anInt6435 = arg3.anInt6459 * arg1 >> 14;
		}
		if (arg3.lb == 0) {
			arg3.anInt6408 = arg3.anInt6425;
		} else if (arg3.lb == 1) {
			arg3.anInt6408 = arg0 - arg3.anInt6425;
		} else if (arg3.lb == 2) {
			arg3.anInt6408 = arg3.anInt6425 * arg0 >> 14;
		}
		if (arg3.aByte92 == 4) {
			arg3.anInt6435 = arg3.anInt6494 * arg3.anInt6408 / arg3.anInt6448;
		}
		if (arg3.lb == 4) {
			arg3.anInt6408 = arg3.anInt6435 * arg3.anInt6448 / arg3.anInt6494;
		}
		if (Static268.aBoolean330 && (Static54.method1017(arg3).anInt5768 != 0 || arg3.anInt6447 == 0)) {
			if (arg3.anInt6408 < 5 && arg3.anInt6435 < 5) {
				arg3.anInt6435 = 5;
				arg3.anInt6408 = 5;
			} else {
				if (arg3.anInt6435 <= 0) {
					arg3.anInt6435 = 5;
				}
				if (arg3.anInt6408 <= 0) {
					arg3.anInt6408 = 5;
				}
			}
		}
		if (Static286.anInt4821 == arg3.anInt6442) {
			Static389.aClass239_14 = arg3;
		}
		if (arg2 && arg3.anObjectArray35 != null && (arg3.anInt6435 != local8 || local11 != arg3.anInt6408)) {
			@Pc(189) Class6_Sub29 local189 = new Class6_Sub29();
			local189.aClass239_10 = arg3;
			local189.anObjectArray4 = arg3.anObjectArray35;
			Static357.aClass88_41.method1878(local189);
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(BI)Z")
	public static boolean method1462(@OriginalArg(1) int arg0) {
		return arg0 == 2 || arg0 == 3;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "([Ljava/lang/Object;B[J)V")
	public static void method1464(@OriginalArg(0) Object[] arg0, @OriginalArg(2) long[] arg1) {
		Static155.method2528(arg1, 0, arg1.length - 1, arg0);
	}
}
