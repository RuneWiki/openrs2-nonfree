import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!rh", name = "T", descriptor = "Lclient!rb;")
	public static Class87 aClass87_25;

	@OriginalMember(owner = "client!rh", name = "U", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!rh", name = "L", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_1238 = Static161.method2452("Ok");

	@OriginalMember(owner = "client!rh", name = "M", descriptor = "Lclient!dc;")
	public static Class20 aClass20_1239 = aClass20_1238;

	@OriginalMember(owner = "client!rh", name = "N", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1240 = Static161.method2452("null");

	@OriginalMember(owner = "client!rh", name = "O", descriptor = "[[[B")
	public static final byte[][][] aByteArrayArrayArray13 = new byte[4][104][104];

	@OriginalMember(owner = "client!rh", name = "P", descriptor = "Z")
	public static boolean aBoolean149 = false;

	@OriginalMember(owner = "client!rh", name = "S", descriptor = "[J")
	public static final long[] aLongArray39 = new long[100];

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!ia;IIIII)V")
	public static void method2557(@OriginalArg(0) Class1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static83.anInt1853) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static210.anInt919) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static31.anInt671 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg3 && local23 != arg2)) {
								@Pc(62) Class5_Sub3 local62 = Static157.aClass5_Sub3ArrayArrayArray2[local17][local23][local32];
								if (local62 != null) {
									@Pc(148) int local148 = (Static37.anIntArrayArrayArray5[local17][local23][local32] + Static37.anIntArrayArrayArray5[local17][local23 + 1][local32] + Static37.anIntArrayArrayArray5[local17][local23][local32 + 1] + Static37.anIntArrayArrayArray5[local17][local23 + 1][local32 + 1]) / 4 - (Static37.anIntArrayArrayArray5[arg1][arg2][arg3] + Static37.anIntArrayArrayArray5[arg1][arg2 + 1][arg3] + Static37.anIntArrayArrayArray5[arg1][arg2][arg3 + 1] + Static37.anIntArrayArrayArray5[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(151) Class86 local151 = local62.aClass86_1;
									if (local151 != null) {
										if (local151.aClass1_9.method2448()) {
											arg0.method2442(local151.aClass1_9, (local23 - arg2) * 128 + (1 - arg4) * 64, local148, (local32 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local151.aClass1_10 != null && local151.aClass1_10.method2448()) {
											arg0.method2442(local151.aClass1_10, (local23 - arg2) * 128 + (1 - arg4) * 64, local148, (local32 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(222) int local222 = 0; local222 < local62.anInt333; local222++) {
										@Pc(228) Class43 local228 = local62.aClass43Array1[local222];
										if (local228 != null && local228.aClass1_4.method2448() && (local23 == local228.anInt1811 || local23 == local3) && (local32 == local228.anInt1816 || local32 == local11)) {
											@Pc(257) int local257 = local228.anInt1821 + 1 - local228.anInt1811;
											@Pc(265) int local265 = local228.anInt1810 + 1 - local228.anInt1816;
											arg0.method2442(local228.aClass1_4, (local228.anInt1811 - arg2) * 128 + (local257 - arg4) * 64, local148, (local228.anInt1816 - arg3) * 128 + (local265 - arg5) * 64, local1);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIII)V")
	public static void method2559(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= Static173.anInt3464 && arg1 <= Static174.anInt3493) {
			@Pc(15) int local15 = Static171.method2627(Static27.anInt493, arg0, Static72.anInt1572);
			@Pc(21) int local21 = Static171.method2627(Static27.anInt493, arg2, Static72.anInt1572);
			Static107.method1726(arg3, local21, local15, arg1);
		}
	}
}
