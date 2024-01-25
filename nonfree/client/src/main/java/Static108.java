import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!fd", name = "j", descriptor = "Lclient!ld;")
	public static Class158 aClass158_1;

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_51 = new Class25(4, 1);

	@OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
	public static int anInt1832 = -1;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!za;BLclient!mn;Lclient!mn;)V")
	public static void method1791(@OriginalArg(0) Class75 arg0, @OriginalArg(2) Class171 arg1, @OriginalArg(3) Class171 arg2) {
		Static419.aClass15_10 = Static457.method6198(arg1, Static139.anInt2567);
		Static352.aClass14_3 = arg0.method5977(Static419.aClass15_10, Static470.method4237(arg2, Static139.anInt2567));
		Static458.aClass15_11 = Static457.method6198(arg1, Static87.anInt1488);
		Static11.aClass14_1 = arg0.method5977(Static458.aClass15_11, Static470.method4237(arg2, Static87.anInt1488));
		Static9.aClass15_9 = Static457.method6198(arg1, Static147.anInt2684);
		Static143.aClass14_2 = arg0.method5977(Static9.aClass15_9, Static470.method4237(arg2, Static147.anInt2684));
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IB)V")
	public static void method1792(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static39.anInt646 = arg0;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIBLclient!oq;Lclient!za;I)V")
	public static void method1793(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class192 arg2, @OriginalArg(4) Class75 arg3, @OriginalArg(5) int arg4) {
		@Pc(9) Class112 local9 = Static386.aClass230_7.method5250(arg2.anInt5434);
		if (local9.anInt2811 == -1) {
			return;
		}
		if (arg2.aBoolean387) {
			@Pc(25) int local25 = arg1 + arg2.anInt5421;
			arg1 = local25 & 0x3;
		} else {
			arg1 = 0;
		}
		@Pc(39) Class41 local39 = local9.method2320(arg2.aBoolean385, arg1, arg3);
		if (local39 == null) {
			return;
		}
		@Pc(49) int local49 = arg2.anInt5455;
		@Pc(52) int local52 = arg2.anInt5446;
		if ((arg1 & 0x1) == 1) {
			local49 = arg2.anInt5446;
			local52 = arg2.anInt5455;
		}
		@Pc(66) int local66 = local39.RA();
		@Pc(69) int local69 = local39.Q();
		if (local9.aBoolean175) {
			local69 = local52 * 4;
			local66 = local49 * 4;
		}
		if (local9.anInt2808 == 0) {
			local39.method6089(arg0, arg4 - (local52 - 1) * 4, local66, local69);
		} else {
			local39.ya(arg0, arg4 + 4 - local52 * 4, local66, local69, 0, local9.anInt2808 | 0xFF000000, 1);
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V")
	public static void method1795() {
		Static428.method5826(false);
		if (Static334.anInt5990 >= 0 && Static334.anInt5990 != 0) {
			Static357.method5001(Static334.anInt5990);
			Static334.anInt5990 = -1;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZI)V")
	public static void method1796(@OriginalArg(1) int arg0) {
		if (Static25.anInt7276 == 1) {
			Static259.anInt4592 = arg0;
		} else if (Static25.anInt7276 == 2 || Static25.anInt7276 == 3) {
			Static20.anInt412 = arg0;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!kj;I)V")
	public static void method1797(@OriginalArg(0) Class11_Sub5_Sub2 arg0) {
		@Pc(8) int local8 = arg0.anInt7629 - Static277.anInt5022;
		@Pc(20) int local20 = arg0.anInt7650 * 128 + arg0.method6215() * 64;
		@Pc(35) int local35 = arg0.anInt7689 * 128 + arg0.method6215() * 64;
		arg0.anInt7622 += (local35 - arg0.anInt7622) / local8;
		arg0.anInt7708 = 0;
		arg0.anInt7626 += (local20 - arg0.anInt7626) / local8;
		if (arg0.anInt7643 == 0) {
			arg0.method6227(8192);
		}
		if (arg0.anInt7643 == 1) {
			arg0.method6227(12288);
		}
		if (arg0.anInt7643 == 2) {
			arg0.method6227(0);
		}
		if (arg0.anInt7643 == 3) {
			arg0.method6227(4096);
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIB)Z")
	public static boolean method1798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return false;
	}
}
