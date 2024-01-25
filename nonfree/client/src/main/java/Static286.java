import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!sa", name = "k", descriptor = "I")
	public static int anInt5803 = 0;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!vm;Lclient!ai;IIIII)V")
	public static void method4907(@OriginalArg(0) Class92 arg0, @OriginalArg(1) Class2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg3;
		@Pc(7) int local7 = arg3 + arg5;
		@Pc(11) int local11 = arg4 - 1;
		@Pc(15) int local15 = arg4 + arg6;
		for (@Pc(17) int local17 = arg2; local17 <= arg2 + 1; local17++) {
			if (local17 != Static112.anInt2455) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static151.anInt3338) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static220.anInt4569 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg4 && local23 != arg3)) {
								@Pc(62) Class57 local62 = Static18.aClass57ArrayArrayArray1[local17][local23][local32];
								if (local62 != null) {
									@Pc(140) int local140 = (Static307.aClass26Array3[local17].method4996(local23, local32) + Static307.aClass26Array3[local17].method4996(local23 + 1, local32) + Static307.aClass26Array3[local17].method4996(local23, local32 + 1) + Static307.aClass26Array3[local17].method4996(local23 + 1, local32 + 1)) / 4 - (Static307.aClass26Array3[arg2].method4996(arg3, arg4) + Static307.aClass26Array3[arg2].method4996(arg3 + 1, arg4) + Static307.aClass26Array3[arg2].method4996(arg3, arg4 + 1) + Static307.aClass26Array3[arg2].method4996(arg3 + 1, arg4 + 1)) / 4;
									@Pc(143) Class2_Sub4 local143 = local62.aClass2_Sub4_1;
									@Pc(146) Class2_Sub4 local146 = local62.aClass2_Sub4_2;
									if (local143 != null && local143.method5411()) {
										arg1.method5406(local1, local140, (local23 - arg3) * 128 + (1 - arg5) * 64, local143, (local32 - arg4) * 128 + (1 - arg6) * 64, arg0);
									}
									if (local146 != null && local146.method5411()) {
										arg1.method5406(local1, local140, (local23 - arg3) * 128 + (1 - arg5) * 64, local146, (local32 - arg4) * 128 + (1 - arg6) * 64, arg0);
									}
									for (@Pc(219) Class95 local219 = local62.aClass95_2; local219 != null; local219 = local219.aClass95_3) {
										@Pc(223) Class2_Sub2 local223 = local219.aClass2_Sub2_1;
										if (local223 != null && local223.method5411() && (local23 == local223.aShort85 || local23 == local3) && (local32 == local223.aShort84 || local32 == local11)) {
											@Pc(252) int local252 = local223.aShort83 + 1 - local223.aShort85;
											@Pc(260) int local260 = local223.aShort82 + 1 - local223.aShort84;
											arg1.method5406(local1, local140, (local223.aShort85 - arg3) * 128 + (local252 - arg5) * 64, local223, (local223.aShort84 - arg4) * 128 + (local260 - arg6) * 64, arg0);
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

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIZ)V")
	public static void method4908(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class25 local15 = Static60.method1054(arg0);
		@Pc(18) int local18 = local15.anInt455;
		@Pc(21) int local21 = local15.anInt453;
		@Pc(24) int local24 = local15.anInt457;
		@Pc(30) int local30 = Class163.anIntArray430[local24 - local21];
		if (arg1 < 0 || arg1 > local30) {
			arg1 = 0;
		}
		local30 <<= local21;
		Static164.method3148(arg1 << local21 & local30 | Static73.anIntArray161[local18] & ~local30, local18);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!am;ILclient!am;Z)V")
	public static void method4909(@OriginalArg(0) Class11 arg0, @OriginalArg(2) Class11 arg1) {
		Static245.aClass11_106 = arg1;
		Static149.aBoolean278 = true;
		Static30.aClass11_11 = arg0;
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)V")
	public static void method4910() {
		Static37.aClass154_11.method4219();
		Static77.aClass154_24.method4219();
		Static132.aClass154_43.method4219();
		Static257.aClass154_82.method4219();
		Static169.aClass154_60.method4219();
	}
}
