import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!qh", name = "bb", descriptor = "Lclient!ab;")
	public static Class3 aClass3_28;

	@OriginalMember(owner = "client!qh", name = "N", descriptor = "Z")
	public static boolean aBoolean183 = false;

	@OriginalMember(owner = "client!qh", name = "Q", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray6 = new int[4][105][105];

	@OriginalMember(owner = "client!qh", name = "W", descriptor = "Lclient!aj;")
	public static Class9 aClass9_1 = new Class9();

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(BLclient!fa;)V")
	public static void method2376(@OriginalArg(1) Class1_Sub8 arg0) {
		@Pc(10) long local10 = 0L;
		if (arg0.anInt1248 == 0) {
			local10 = Static133.method1972(arg0.anInt1239, arg0.anInt1251, arg0.anInt1250);
		}
		if (arg0.anInt1248 == 1) {
			local10 = Static49.method871(arg0.anInt1239, arg0.anInt1251, arg0.anInt1250);
		}
		@Pc(35) int local35 = -1;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		if (arg0.anInt1248 == 2) {
			local10 = Static175.method2876(arg0.anInt1239, arg0.anInt1251, arg0.anInt1250);
		}
		if (arg0.anInt1248 == 3) {
			local10 = Static85.method1283(arg0.anInt1239, arg0.anInt1251, arg0.anInt1250);
		}
		if (local10 != 0L) {
			local37 = (int) local10 >> 14 & 0x1F;
			local39 = (int) local10 >> 20 & 0x3;
			local35 = Integer.MAX_VALUE & (int) (local10 >>> 32);
		}
		arg0.anInt1244 = local39;
		arg0.anInt1242 = local35;
		arg0.anInt1246 = local37;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIII)V")
	public static void method2379(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= Static102.anInt2207 && arg2 <= Static116.anInt2488) {
			@Pc(17) int local17 = Static19.method429(Static118.anInt2521, arg1, Static204.anInt2389);
			@Pc(23) int local23 = Static19.method429(Static118.anInt2521, arg0, Static204.anInt2389);
			Static116.method1723(local23, arg3, arg2, local17);
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILclient!vd;I)V")
	public static void method2386(@OriginalArg(0) int arg0, @OriginalArg(1) Class92 arg1) {
		Static38.aClass1_Sub14_Sub1_3.method3067(240);
		Static38.aClass1_Sub14_Sub1_3.method3014(arg1.method3217());
		Static38.aClass1_Sub14_Sub1_3.method3013(arg0);
	}
}
