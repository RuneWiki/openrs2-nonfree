import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!jm", name = "G", descriptor = "I")
	public static int anInt2638;

	@OriginalMember(owner = "client!jm", name = "P", descriptor = "Lclient!nm;")
	public static Class119 aClass119_52;

	@OriginalMember(owner = "client!jm", name = "H", descriptor = "Z")
	public static boolean aBoolean233 = false;

	@OriginalMember(owner = "client!jm", name = "J", descriptor = "[I")
	public static int[] anIntArray206 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!jm", name = "M", descriptor = "[I")
	public static int[] anIntArray208 = new int[1000];

	@OriginalMember(owner = "client!jm", name = "N", descriptor = "I")
	public static int anInt2640 = 0;

	@OriginalMember(owner = "client!jm", name = "S", descriptor = "[J")
	public static long[] aLongArray7 = new long[200];

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IZBI)I")
	public static int method2326(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class1_Sub18 local8 = (Class1_Sub18) Static1.aClass86_1.method2136((long) arg0);
		if (local8 == null) {
			return 0;
		}
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < local8.anIntArray219.length; local26++) {
			if (local8.anIntArray219[local26] >= 0 && local8.anIntArray219[local26] < Static73.anInt1580) {
				@Pc(56) Class3 local56 = Static69.method1330(local8.anIntArray219[local26]);
				if (local56.aClass86_2 != null) {
					@Pc(68) Class1_Sub22 local68 = (Class1_Sub22) local56.aClass86_2.method2136((long) arg2);
					if (local68 != null) {
						if (arg1) {
							local24 += local8.anIntArray218[local26] * local68.anInt3973;
						} else {
							local24 += local68.anInt3973;
						}
					}
				}
			}
		}
		return local24;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIIII)V")
	public static void method2329(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		@Pc(9) Class80[] local9 = Static160.aClass80Array1;
		while (local7 < local9.length) {
			@Pc(21) Class80 local21 = local9[local7];
			if (local21 != null && local21.anInt2271 == 2) {
				Static264.method4086(arg0, local21.anInt2270 + (local21.anInt2267 - Static38.anInt714 << 7), local21.anInt2269 * 2, arg5, arg4 >> 1, arg2 >> 1, (local21.anInt2266 - Static135.anInt2659 << 7) + local21.anInt2274);
				if (Static165.anInt5548 > -1 && Static167.anInt637 % 20 < 10) {
					Static288.aClass1_Sub5_Sub6Array14[local21.anInt2268].method3195(arg3 + Static165.anInt5548 - 12, arg1 - -Static105.anInt2226 - 28);
				}
			}
			local7++;
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(JI)V")
	public static void method2331(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < Static144.anInt2798; local17++) {
			if (arg0 == aLongArray7[local17]) {
				Static144.anInt2798--;
				for (@Pc(45) int local45 = local17; local45 < Static144.anInt2798; local45++) {
					Static19.aStringArray4[local45] = Static19.aStringArray4[local45 + 1];
					Static58.anIntArray96[local45] = Static58.anIntArray96[local45 + 1];
					Static54.aStringArray5[local45] = Static54.aStringArray5[local45 + 1];
					aLongArray7[local45] = aLongArray7[local45 + 1];
					Static23.anIntArray53[local45] = Static23.anIntArray53[local45 + 1];
					Static196.aBooleanArray15[local45] = Static196.aBooleanArray15[local45 + 1];
				}
				Static105.anInt2227 = Static149.anInt950;
				Static116.aClass1_Sub13_Sub1_48.method1887(138);
				Static116.aClass1_Sub13_Sub1_48.method1857(arg0);
				break;
			}
		}
	}
}
