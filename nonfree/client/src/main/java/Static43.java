import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!dh", name = "k", descriptor = "Lclient!jb;")
	public static Class28 aClass28_19;

	@OriginalMember(owner = "client!dh", name = "l", descriptor = "[Z")
	public static boolean[] aBooleanArray7;

	@OriginalMember(owner = "client!dh", name = "h", descriptor = "[Lclient!we;")
	public static Class126[] aClass126Array3 = new Class126[500];

	@OriginalMember(owner = "client!dh", name = "i", descriptor = "Lclient!sc;")
	public static Class107 aClass107_292 = Static231.method3737("b12_full");

	@OriginalMember(owner = "client!dh", name = "n", descriptor = "[Z")
	public static boolean[] aBooleanArray8 = new boolean[8];

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(III)J")
	public static long method856(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub9 local7 = Static174.aClass1_Sub9ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null || local7.aClass46_1 == null ? 0L : local7.aClass46_1.aLong57;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(B[B)Lclient!pe;")
	public static Class1_Sub2_Sub15 method857(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(17) Class1_Sub2_Sub15_Sub1 local17 = new Class1_Sub2_Sub15_Sub1(arg0, Static56.anIntArray124, Static223.anIntArray373, Static141.anIntArray266, Static172.anIntArray329, Static158.aByteArrayArray7);
			Static158.method2564();
			return local17;
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IB)V")
	public static void method859(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub2_Sub19 local12 = Static166.method3214(arg0, 2);
		local12.method3689();
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IZIIZIZI)Lclient!tg;")
	public static Class1_Sub2_Sub2 method860(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(6) boolean arg4, @OriginalArg(7) int arg5) {
		@Pc(5) Class75 local5 = Static128.method2147(arg2);
		if (arg1 > 1 && local5.anIntArray244 != null) {
			@Pc(19) int local19 = -1;
			for (@Pc(21) int local21 = 0; local21 < 10; local21++) {
				if (arg1 >= local5.anIntArray245[local21] && local5.anIntArray245[local21] != 0) {
					local19 = local5.anIntArray244[local21];
				}
			}
			if (local19 != -1) {
				local5 = Static128.method2147(local19);
			}
		}
		@Pc(63) Class5_Sub3_Sub1 local63 = local5.method2102();
		if (local63 == null) {
			return null;
		}
		@Pc(69) Class1_Sub2_Sub2_Sub1 local69 = null;
		if (local5.anInt2744 != -1) {
			local69 = (Class1_Sub2_Sub2_Sub1) method860(1, 10, local5.anInt2733, false, true, 0);
			if (local69 == null) {
				return null;
			}
		} else if (local5.anInt2708 != -1) {
			local69 = (Class1_Sub2_Sub2_Sub1) method860(arg0, arg1, local5.anInt2748, false, false, arg5);
			if (local69 == null) {
				return null;
			}
		}
		@Pc(113) int[] local113 = Static205.anIntArray358;
		@Pc(115) int local115 = Static205.anInt4388;
		@Pc(117) int local117 = Static205.anInt4389;
		@Pc(120) int[] local120 = new int[4];
		Static205.method3262(local120);
		@Pc(128) Class1_Sub2_Sub2_Sub1 local128 = new Class1_Sub2_Sub2_Sub1(36, 32);
		Static205.method3242(local128.anIntArray13, 36, 32);
		Static74.method1327();
		Static74.method1332(16, 16);
		@Pc(148) int local148 = local5.anInt2721;
		if (arg4) {
			local148 = (int) ((double) local148 * 1.5D);
		} else if (arg0 == 2) {
			local148 = (int) ((double) local148 * 1.04D);
		}
		Static74.aBoolean156 = false;
		@Pc(180) int local180 = Class45.anIntArray156[local5.anInt2730] * local148 >> 16;
		@Pc(189) int local189 = local148 * Class45.anIntArray159[local5.anInt2730] >> 16;
		local63.method540(local5.anInt2706, local5.anInt2738, local5.anInt2730, local5.anInt2752, local189 + local5.anInt2760 - local63.method2297() / 2, local180 - -local5.anInt2760);
		if (arg0 >= 1) {
			local128.method207(1);
			if (arg0 >= 2) {
				local128.method207(16777215);
			}
			Static205.method3242(local128.anIntArray13, 36, 32);
		}
		if (arg5 != 0) {
			local128.method202(arg5);
		}
		if (local5.anInt2744 != -1) {
			local69.method189(0, 0);
		} else if (local5.anInt2708 != -1) {
			Static205.method3242(local69.anIntArray13, 36, 32);
			local128.method189(0, 0);
			local128 = local69;
		}
		if (arg3 && (local5.anInt2741 == 1 || arg1 != 1) && arg1 != -1) {
			Static51.aClass1_Sub2_Sub15_Sub1_3.method3331(Static36.method703(arg1), 0, 9, 16776960, 1);
		}
		Static205.method3242(local113, local115, local117);
		Static205.method3257(local120);
		Static74.method1327();
		Static74.aBoolean156 = true;
		return local128;
	}
}
