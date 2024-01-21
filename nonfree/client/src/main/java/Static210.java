import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!wa", name = "m", descriptor = "[I")
	public static int[] anIntArray84;

	@OriginalMember(owner = "client!wa", name = "W", descriptor = "I")
	public static int anInt919;

	@OriginalMember(owner = "client!wa", name = "cb", descriptor = "I")
	public static int anInt922;

	@OriginalMember(owner = "client!wa", name = "gb", descriptor = "Lclient!ld;")
	public static Class1_Sub2_Sub2 aClass1_Sub2_Sub2_2;

	@OriginalMember(owner = "client!wa", name = "n", descriptor = "Lclient!sg;")
	public static final Class91 aClass91_7 = new Class91();

	@OriginalMember(owner = "client!wa", name = "Z", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_299 = Static161.method2452("cyan:");

	@OriginalMember(owner = "client!wa", name = "X", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_298 = aClass20_299;

	@OriginalMember(owner = "client!wa", name = "ab", descriptor = "Z")
	public static boolean aBoolean58 = false;

	@OriginalMember(owner = "client!wa", name = "db", descriptor = "Lclient!dc;")
	public static Class20 aClass20_300 = aClass20_299;

	@OriginalMember(owner = "client!wa", name = "eb", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_301 = Static161.method2452("(Y<)4col>");

	@OriginalMember(owner = "client!wa", name = "fb", descriptor = "I")
	public static int anInt923 = 0;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILclient!re;)V")
	public static void method732(@OriginalArg(1) Class1_Sub2 arg0) {
		arg0.aBoolean96 = false;
		@Pc(22) Class5_Sub2_Sub22 local22;
		if (arg0.anInt2215 != -1) {
			local22 = Static14.method253(arg0.anInt2215);
			if (local22 == null || local22.anIntArray374 == null) {
				arg0.anInt2215 = -1;
			} else {
				arg0.anInt2212++;
				if (arg0.anInt2222 < local22.anIntArray374.length && arg0.anInt2212 > local22.anIntArray375[arg0.anInt2222]) {
					arg0.anInt2222++;
					arg0.anInt2212 = 1;
					Static46.method844(aClass1_Sub2_Sub2_2 == arg0, arg0.anInt2222, arg0.anInt2241, arg0.anInt2234, local22);
				}
				if (arg0.anInt2222 >= local22.anIntArray374.length) {
					arg0.anInt2222 = 0;
					arg0.anInt2212 = 0;
					Static46.method844(arg0 == aClass1_Sub2_Sub2_2, arg0.anInt2222, arg0.anInt2241, arg0.anInt2234, local22);
				}
			}
		}
		if (arg0.anInt2266 != -1 && arg0.anInt2239 <= Static177.anInt3533) {
			if (arg0.anInt2255 < 0) {
				arg0.anInt2255 = 0;
			}
			@Pc(135) int local135 = Static181.method2739(arg0.anInt2266).anInt3309;
			if (local135 == -1) {
				arg0.anInt2266 = -1;
			} else {
				@Pc(143) Class5_Sub2_Sub22 local143 = Static14.method253(local135);
				if (local143 == null || local143.anIntArray374 == null) {
					arg0.anInt2266 = -1;
				} else {
					arg0.anInt2236++;
					if (local143.anIntArray374.length > arg0.anInt2255 && arg0.anInt2236 > local143.anIntArray375[arg0.anInt2255]) {
						arg0.anInt2236 = 1;
						arg0.anInt2255++;
						Static46.method844(aClass1_Sub2_Sub2_2 == arg0, arg0.anInt2255, arg0.anInt2241, arg0.anInt2234, local143);
					}
					if (local143.anIntArray374.length <= arg0.anInt2255) {
						arg0.anInt2266 = -1;
					}
				}
			}
		}
		if (arg0.anInt2254 != -1 && arg0.anInt2262 <= 1) {
			local22 = Static14.method253(arg0.anInt2254);
			if (local22.anInt3661 == 1 && arg0.anInt2220 > 0 && arg0.anInt2247 <= Static177.anInt3533 && Static177.anInt3533 > arg0.anInt2269) {
				arg0.anInt2262 = 1;
				return;
			}
		}
		if (arg0.anInt2254 != -1 && arg0.anInt2262 == 0) {
			local22 = Static14.method253(arg0.anInt2254);
			if (local22 == null || local22.anIntArray374 == null) {
				arg0.anInt2254 = -1;
			} else {
				arg0.anInt2237++;
				if (local22.anIntArray374.length > arg0.anInt2265 && arg0.anInt2237 > local22.anIntArray375[arg0.anInt2265]) {
					arg0.anInt2237 = 1;
					arg0.anInt2265++;
					Static46.method844(aClass1_Sub2_Sub2_2 == arg0, arg0.anInt2265, arg0.anInt2241, arg0.anInt2234, local22);
				}
				if (arg0.anInt2265 >= local22.anIntArray374.length) {
					arg0.anInt2265 -= local22.anInt3657;
					arg0.anInt2223++;
					if (local22.anInt3653 <= arg0.anInt2223) {
						arg0.anInt2254 = -1;
					} else if (arg0.anInt2265 >= 0 && arg0.anInt2265 < local22.anIntArray374.length) {
						Static46.method844(arg0 == aClass1_Sub2_Sub2_2, arg0.anInt2265, arg0.anInt2241, arg0.anInt2234, local22);
					} else {
						arg0.anInt2254 = -1;
					}
				}
				arg0.aBoolean96 = local22.aBoolean168;
			}
		}
		if (arg0.anInt2262 > 0) {
			arg0.anInt2262--;
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(BJ)V")
	public static void method739(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static96.method1549(arg0 - 1L);
			Static96.method1549(1L);
		} else {
			Static96.method1549(arg0);
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZBLclient!ic;Lclient!wa;Lclient!wa;)V")
	public static void method751(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class5_Sub2_Sub8_Sub1_Sub1 arg1, @OriginalArg(3) Class23 arg2, @OriginalArg(4) Class23 arg3) {
		Static189.aClass23_69 = arg2;
		Static141.aBoolean126 = arg0;
		Static82.aClass23_33 = arg3;
		@Pc(15) int local15 = Static82.aClass23_33.method750() - 1;
		Static60.anInt1347 = local15 * 256 + Static82.aClass23_33.method752(local15);
		Static105.aClass5_Sub2_Sub8_Sub1_Sub1_1 = arg1;
	}
}
