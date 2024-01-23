import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!la", name = "f", descriptor = "Z")
	public static boolean aBoolean196 = false;

	@OriginalMember(owner = "client!la", name = "i", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray8 = new int[2][][];

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
	public static void method2350() {
		Static150.aClass33_25.method839();
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(I)V")
	public static void method2351() {
		anIntArrayArrayArray8 = null;
	}

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(I)V")
	public static void method2352() {
		Static101.aClass4_Sub17_Sub1_4.method1904();
		@Pc(13) int local13 = Static101.aClass4_Sub17_Sub1_4.method1898(8);
		@Pc(22) int local22;
		if (local13 < Static68.anInt1262) {
			for (local22 = local13; local22 < Static68.anInt1262; local22++) {
				Static175.anIntArray298[Static43.anInt5510++] = Static10.anIntArray20[local22];
			}
		}
		if (Static68.anInt1262 < local13) {
			throw new RuntimeException("gnpov1");
		}
		Static68.anInt1262 = 0;
		for (local22 = 0; local22 < local13; local22++) {
			@Pc(65) int local65 = Static10.anIntArray20[local22];
			@Pc(69) Class12_Sub3_Sub1 local69 = Static100.aClass12_Sub3_Sub1Array1[local65];
			@Pc(74) int local74 = Static101.aClass4_Sub17_Sub1_4.method1898(1);
			if (local74 == 0) {
				Static10.anIntArray20[Static68.anInt1262++] = local65;
				local69.anInt4167 = Static104.anInt2226;
			} else {
				@Pc(98) int local98 = Static101.aClass4_Sub17_Sub1_4.method1898(2);
				if (local98 == 0) {
					Static10.anIntArray20[Static68.anInt1262++] = local65;
					local69.anInt4167 = Static104.anInt2226;
					Static97.anIntArray219[Static84.anInt1709++] = local65;
				} else {
					@Pc(145) int local145;
					@Pc(155) int local155;
					if (local98 == 1) {
						Static10.anIntArray20[Static68.anInt1262++] = local65;
						local69.anInt4167 = Static104.anInt2226;
						local145 = Static101.aClass4_Sub17_Sub1_4.method1898(3);
						local69.method3371(local145, 1);
						local155 = Static101.aClass4_Sub17_Sub1_4.method1898(1);
						if (local155 == 1) {
							Static97.anIntArray219[Static84.anInt1709++] = local65;
						}
					} else if (local98 == 2) {
						Static10.anIntArray20[Static68.anInt1262++] = local65;
						local69.anInt4167 = Static104.anInt2226;
						if (Static101.aClass4_Sub17_Sub1_4.method1898(1) == 1) {
							local145 = Static101.aClass4_Sub17_Sub1_4.method1898(3);
							local69.method3371(local145, 2);
							local155 = Static101.aClass4_Sub17_Sub1_4.method1898(3);
							local69.method3371(local155, 2);
						} else {
							local145 = Static101.aClass4_Sub17_Sub1_4.method1898(3);
							local69.method3371(local145, 0);
						}
						local145 = Static101.aClass4_Sub17_Sub1_4.method1898(1);
						if (local145 == 1) {
							Static97.anIntArray219[Static84.anInt1709++] = local65;
						}
					} else if (local98 == 3) {
						Static175.anIntArray298[Static43.anInt5510++] = local65;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIZLclient!ra;I)Lclient!bi;")
	public static Class4_Sub2_Sub1 method2353(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class143 arg4, @OriginalArg(6) int arg5) {
		@Pc(22) int local22 = (arg0 << 19) + (arg3 ? 65536 : 0) + arg2 + (arg1 << 17);
		@Pc(39) long local39 = (long) local22 * 3849834839L + (long) arg5 * 3147483667L;
		@Pc(45) Class4_Sub2_Sub1 local45 = (Class4_Sub2_Sub1) Static90.aClass33_13.method841(local39);
		if (local45 != null) {
			return local45;
		}
		Static204.aBoolean262 = false;
		local45 = Static251.method3784(false, arg0, false, arg3, arg2, arg4, arg5, arg1);
		if (local45 != null && !Static204.aBoolean262) {
			Static90.aClass33_13.method845(local45, local39);
		}
		return local45;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(B)I")
	public static int method2354() {
		return Static86.aBoolean133 && Static96.aBooleanArray15[81] && Static60.anInt1152 > 2 ? Static196.anIntArray322[Static60.anInt1152 - 2] : Static196.anIntArray322[Static60.anInt1152 - 1];
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!lc;BLclient!lc;)V")
	public static void method2355(@OriginalArg(0) Class98 arg0, @OriginalArg(2) Class98 arg1) {
		Static176.aClass98_24 = arg1;
		Static52.aClass98_32 = arg0;
		Static264.anInt4974 = Static176.aClass98_24.method2394(3);
	}
}
