import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!cn", name = "d", descriptor = "Lclient!wu;")
	public static Class380 aClass380_21;

	@OriginalMember(owner = "client!cn", name = "e", descriptor = "Lclient!qc;")
	public static Class2_Sub13_Sub3 aClass2_Sub13_Sub3_1;

	@OriginalMember(owner = "client!cn", name = "f", descriptor = "I")
	public static int anInt1411;

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lclient!ig;IIIII)V")
	public static void method1104(@OriginalArg(0) Class13_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static10.anInt139) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static322.anInt5120) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Class13_Sub1_Sub4_Sub1.lb && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg3 && local23 != arg2)) {
								@Pc(62) Class53 local62 = Static28.aClass53ArrayArrayArray1[local17][local23][local32];
								if (local62 != null) {
									@Pc(148) int local148 = (Static314.aClass76Array2[local17].method7396(local32, local23) + Static314.aClass76Array2[local17].method7396(local32, local23 + 1) + Static314.aClass76Array2[local17].method7396(local32 + 1, local23) + Static314.aClass76Array2[local17].method7396(local32 + 1, local23 + 1)) / 4 - (Static314.aClass76Array2[arg1].method7396(arg3, arg2) + Static314.aClass76Array2[arg1].method7396(arg3, arg2 + 1) + Static314.aClass76Array2[arg1].method7396(arg3 + 1, arg2) + Static314.aClass76Array2[arg1].method7396(arg3 + 1, arg2 + 1)) / 4;
									@Pc(151) Class13_Sub1_Sub4 local151 = local62.aClass13_Sub1_Sub4_1;
									@Pc(154) Class13_Sub1_Sub4 local154 = local62.aClass13_Sub1_Sub4_2;
									if (local151 != null && local151.method8404()) {
										arg0.method8410(local148, local1, (local32 - arg3) * Static192.anInt3298 + (1 - arg5) * Static427.anInt6729, Static207.aClass95_6, (local23 - arg2) * Static192.anInt3298 + (1 - arg4) * Static427.anInt6729, local151);
									}
									if (local154 != null && local154.method8404()) {
										arg0.method8410(local148, local1, (local32 - arg3) * Static192.anInt3298 + (1 - arg5) * Static427.anInt6729, Static207.aClass95_6, (local23 - arg2) * Static192.anInt3298 + (1 - arg4) * Static427.anInt6729, local154);
									}
									for (@Pc(227) Class325 local227 = local62.aClass325_1; local227 != null; local227 = local227.aClass325_3) {
										@Pc(231) Class13_Sub1_Sub1 local231 = local227.aClass13_Sub1_Sub1_1;
										if (local231 != null && local231.method8404() && (local23 == local231.aShort117 || local23 == local3) && (local32 == local231.aShort119 || local32 == local11)) {
											@Pc(260) int local260 = local231.aShort120 + 1 - local231.aShort117;
											@Pc(268) int local268 = local231.aShort118 + 1 - local231.aShort119;
											arg0.method8410(local148, local1, (local231.aShort119 - arg3) * Static192.anInt3298 + (local268 - arg5) * Static427.anInt6729, Static207.aClass95_6, (local231.aShort117 - arg2) * Static192.anInt3298 + (local260 - arg4) * Static427.anInt6729, local231);
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

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lclient!fj;I)V")
	public static void method1105(@OriginalArg(0) Class13_Sub4 arg0) {
		arg0.aClass13_Sub1_Sub1_Sub1_1 = null;
		if (Static98.anInt1845 < 20) {
			Static430.aClass171_9.method3746(arg0);
			Static98.anInt1845++;
		}
	}
}
