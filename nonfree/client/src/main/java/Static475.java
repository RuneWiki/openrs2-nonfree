import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static475 {

	@OriginalMember(owner = "client!rb", name = "v", descriptor = "[I")
	public static int[] anIntArray531;

	@OriginalMember(owner = "client!rb", name = "x", descriptor = "[I")
	public static int[] anIntArray532;

	@OriginalMember(owner = "client!rb", name = "w", descriptor = "I")
	public static final int anInt8515 = 0;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!mb;IIIII)V")
	public static void method7029(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static626.anInt10336) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static642.anInt10523) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static158.anInt3845 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg3 && local23 != arg2)) {
								@Pc(62) Class106 local62 = Static170.aClass106ArrayArrayArray1[local17][local23][local32];
								if (local62 != null) {
									@Pc(148) int local148 = (Static500.aClass274Array2[local17].method8041(local23, local32) + Static500.aClass274Array2[local17].method8041(local23 + 1, local32) + Static500.aClass274Array2[local17].method8041(local23, local32 + 1) + Static500.aClass274Array2[local17].method8041(local23 + 1, local32 + 1)) / 4 - (Static500.aClass274Array2[arg1].method8041(arg2, arg3) + Static500.aClass274Array2[arg1].method8041(arg2 + 1, arg3) + Static500.aClass274Array2[arg1].method8041(arg2, arg3 + 1) + Static500.aClass274Array2[arg1].method8041(arg2 + 1, arg3 + 1)) / 4;
									@Pc(151) Class2_Sub3_Sub2 local151 = local62.aClass2_Sub3_Sub2_2;
									@Pc(154) Class2_Sub3_Sub2 local154 = local62.aClass2_Sub3_Sub2_1;
									if (local151 != null && local151.method8564()) {
										arg0.method8569(local1, local151, Static185.aClass33_8, (local23 - arg2) * Static325.anInt6512 + (1 - arg4) * Static510.anInt8986, (local32 - arg3) * Static325.anInt6512 + (1 - arg5) * Static510.anInt8986, local148);
									}
									if (local154 != null && local154.method8564()) {
										arg0.method8569(local1, local154, Static185.aClass33_8, (local23 - arg2) * Static325.anInt6512 + (1 - arg4) * Static510.anInt8986, (local32 - arg3) * Static325.anInt6512 + (1 - arg5) * Static510.anInt8986, local148);
									}
									for (@Pc(227) Class243 local227 = local62.aClass243_1; local227 != null; local227 = local227.aClass243_3) {
										@Pc(231) Class2_Sub3_Sub1 local231 = local227.aClass2_Sub3_Sub1_1;
										if (local231 != null && local231.method8564() && (local23 == local231.aShort121 || local23 == local3) && (local32 == local231.aShort124 || local32 == local11)) {
											@Pc(260) int local260 = local231.aShort122 + 1 - local231.aShort121;
											@Pc(268) int local268 = local231.aShort123 + 1 - local231.aShort124;
											arg0.method8569(local1, local231, Static185.aClass33_8, (local231.aShort121 - arg2) * Static325.anInt6512 + (local260 - arg4) * Static510.anInt8986, (local231.aShort124 - arg3) * Static325.anInt6512 + (local268 - arg5) * Static510.anInt8986, local148);
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

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!kba;B)V")
	public static void method7031(@OriginalArg(0) Class2_Sub3_Sub1_Sub2 arg0) {
		if (arg0 instanceof Class2_Sub3_Sub1_Sub2_Sub1) {
			@Pc(28) Class2_Sub3_Sub1_Sub2_Sub1 local28 = (Class2_Sub3_Sub1_Sub2_Sub1) arg0;
			if (local28.aClass22_1 != null) {
				Static90.method2283(local28.aByte128 != Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aByte128, local28);
			}
		} else if (arg0 instanceof Class2_Sub3_Sub1_Sub2_Sub2) {
			@Pc(8) Class2_Sub3_Sub1_Sub2_Sub2 local8 = (Class2_Sub3_Sub1_Sub2_Sub2) arg0;
			Static190.method3797(local8, local8.aByte128 != Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aByte128);
		}
	}
}
