import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!je", name = "Q", descriptor = "[I")
	public static int[] anIntArray263;

	@OriginalMember(owner = "client!je", name = "K", descriptor = "Lclient!tn;")
	public static final Class242 aClass242_52 = new Class242(53, 3);

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!jq;ILclient!jq;)V")
	public static void method2762(@OriginalArg(0) Class1_Sub3 arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0.aClass1_Sub3_58 != null) {
			arg0.method5941();
		}
		arg0.aClass1_Sub3_57 = arg1.aClass1_Sub3_57;
		arg0.aClass1_Sub3_58 = arg1;
		arg0.aClass1_Sub3_58.aClass1_Sub3_57 = arg0;
		arg0.aClass1_Sub3_57.aClass1_Sub3_58 = arg0;
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(II)I")
	public static int method2764(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 - 1;
		@Pc(17) int local17 = local7 | local7 >>> 1;
		@Pc(23) int local23 = local17 | local17 >>> 2;
		@Pc(29) int local29 = local23 | local23 >>> 4;
		@Pc(35) int local35 = local29 | local29 >>> 8;
		@Pc(41) int local41 = local35 | local35 >>> 16;
		return local41 + 1;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "([Lclient!hm;IZ)V")
	public static void method2765(@OriginalArg(0) Class107[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			@Pc(17) Class107 local17 = arg0[local11];
			if (local17 != null && arg1 == local17.anInt2624 && !Static55.method764(local17)) {
				if (local17.anInt2598 == 0) {
					method2765(arg0, local17.anInt2660);
					if (local17.aClass107Array2 != null) {
						method2765(local17.aClass107Array2, local17.anInt2660);
					}
					@Pc(51) Class1_Sub37 local51 = (Class1_Sub37) Static462.aClass208_42.method4405((long) local17.anInt2660);
					if (local51 != null) {
						Static425.method5421(local51.anInt5481);
					}
				}
				if (local17.anInt2598 == 6 && local17.anInt2647 != -1) {
					@Pc(74) Class64 local74 = Static402.aClass37_2.method665(local17.anInt2647);
					if (local74 != null) {
						local17.anInt2619 += Static71.anInt1041;
						while (local17.anInt2619 > local74.anIntArray126[local17.anInt2590]) {
							local17.anInt2619 -= local74.anIntArray126[local17.anInt2590];
							local17.anInt2590++;
							if (local17.anInt2590 >= local74.anIntArray127.length) {
								local17.anInt2590 -= local74.anInt1191;
								if (local17.anInt2590 < 0 || local17.anInt2590 >= local74.anIntArray127.length) {
									local17.anInt2590 = 0;
								}
							}
							local17.anInt2662 = local17.anInt2590 + 1;
							if (local17.anInt2662 >= local74.anIntArray127.length) {
								local17.anInt2662 -= local74.anInt1191;
								if (local17.anInt2662 < 0 || local17.anInt2662 >= local74.anIntArray127.length) {
									local17.anInt2662 = -1;
								}
							}
							Static260.method3633(local17);
						}
					}
				}
			}
		}
	}
}
