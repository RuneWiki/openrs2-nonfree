import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!mh", name = "n", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_824 = Static81.method1507("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

	@OriginalMember(owner = "client!mh", name = "o", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_825 = Static81.method1507("Select a world");

	@OriginalMember(owner = "client!mh", name = "r", descriptor = "Lclient!dj;")
	public static Class24 aClass24_826 = aClass24_825;

	@OriginalMember(owner = "client!mh", name = "u", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_827 = Static81.method1507("-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

	@OriginalMember(owner = "client!mh", name = "w", descriptor = "I")
	public static int anInt2736 = -1;

	@OriginalMember(owner = "client!mh", name = "y", descriptor = "I")
	public static int anInt2738 = 0;

	@OriginalMember(owner = "client!mh", name = "A", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_828 = Static81.method1507("W-=hlen Sie eine Option");

	@OriginalMember(owner = "client!mh", name = "G", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_829 = Static81.method1507("Too many connections from your address)3");

	@OriginalMember(owner = "client!mh", name = "L", descriptor = "I")
	public static int anInt2748 = 0;

	@OriginalMember(owner = "client!mh", name = "M", descriptor = "Lclient!dj;")
	public static Class24 aClass24_830 = aClass24_829;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(JI)V")
	public static void method2094(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(11) InterruptedException local11) {
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(ZLclient!ve;ZLclient!ve;I)V")
	public static void method2096(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class69 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class69 arg3) {
		Static17.aBoolean18 = arg0;
		Static201.aBoolean223 = arg2;
		Static61.aClass69_17 = arg3;
		Static106.aClass69_23 = arg1;
		Static28.aClass46_1 = new Class46(30);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(ZIIILclient!ue;II)V")
	public static void method2097(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class93 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(18) long local18 = 0L;
		if (arg4 == 0) {
			local18 = Static195.method3315(arg5, arg2, arg0);
		}
		if (arg4 == 1) {
			local18 = Static108.method1871(arg5, arg2, arg0);
		}
		if (arg4 == 2) {
			local18 = Static78.method1463(arg5, arg2, arg0);
		}
		if (arg4 == 3) {
			local18 = Static212.method3586(arg5, arg2, arg0);
		}
		if (local18 == 0L) {
			return;
		}
		@Pc(64) int local64 = (int) local18 >> 14 & 0x1F;
		@Pc(71) int local71 = (int) local18 >> 20 & 0x3;
		@Pc(78) int local78 = Integer.MAX_VALUE & (int) (local18 >>> 32);
		@Pc(82) Class1_Sub2_Sub5 local82 = Static37.method702(local78);
		if (arg4 == 0) {
			Static2.method88(arg5, arg2, arg0);
			if (local82.anInt965 != 0) {
				arg3.method3272(arg2, arg0, local64, local71, local82.aBoolean53);
			}
		}
		if (arg4 == 1) {
			Static28.method549(arg5, arg2, arg0);
		}
		if (arg4 == 2) {
			Static26.method524(arg5, arg2, arg0);
			if (local82.anInt965 != 0 && local82.anInt976 + arg2 < 104 && local82.anInt976 + arg0 < 104 && arg2 + local82.anInt958 < 104 && arg0 + local82.anInt958 < 104) {
				arg3.method3268(arg0, local82.anInt976, local82.aBoolean53, local71, local82.anInt958, arg2);
			}
		}
		if (arg4 != 3) {
			return;
		}
		Static120.method2031(arg5, arg2, arg0);
		if (local82.anInt965 == 1) {
			arg3.method3261(arg2, arg0);
			return;
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!td;IIIIZ)V")
	public static void method2098(@OriginalArg(0) Class1_Sub2_Sub22 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		if (Static66.anInt1660 >= 50 || (arg0.anIntArray345 == null || arg3 >= arg0.anIntArray345.length)) {
			return;
		}
		@Pc(27) int local27 = arg0.anIntArray345[arg3];
		if (local27 == 0) {
			return;
		}
		@Pc(39) int local39 = local27 >> 4 & 0x7;
		@Pc(43) int local43 = local27 & 0xF;
		@Pc(47) int local47 = local27 >> 8;
		if (local43 == 0) {
			if (arg4) {
				Static60.method2786(0, local47, local39);
			}
		} else if (Static200.anInt4473 != 0) {
			Static143.anIntArray270[Static66.anInt1660] = local47;
			Static48.anIntArray102[Static66.anInt1660] = local39;
			@Pc(74) int local74 = (arg1 - 64) / 128;
			Static66.anIntArray143[Static66.anInt1660] = 0;
			Static20.aClass11Array1[Static66.anInt1660] = null;
			@Pc(88) int local88 = (arg2 - 64) / 128;
			Static79.anIntArray163[Static66.anInt1660] = (local88 << 8) + (local74 << 16) + local43;
			Static66.anInt1660++;
		}
	}
}
