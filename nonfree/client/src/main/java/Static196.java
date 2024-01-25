import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!lb", name = "g", descriptor = "[I")
	public static final int[] anIntArray575 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
	public static int anInt5194 = 0;

	@OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
	public static int anInt5198 = 765;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IZ)V")
	public static void method4644(@OriginalArg(1) boolean arg0) {
		Static363.anInt6168 = 0;
		Static365.anInt6136 = 0;
		Static183.method2873();
		Static357.method5338(arg0);
		Static140.method2225();
		@Pc(32) int local32;
		for (@Pc(26) int local26 = 0; local26 < Static363.anInt6168; local26++) {
			local32 = Static200.anIntArray389[local26];
			if (Static76.anInt1617 != Static166.aClass28_Sub1_Sub1_Sub1Array41[local32].anInt4365) {
				if (Static166.aClass28_Sub1_Sub1_Sub1Array41[local32].aClass61_1.method1218()) {
					Static45.method705(Static166.aClass28_Sub1_Sub1_Sub1Array41[local32]);
				}
				Static166.aClass28_Sub1_Sub1_Sub1Array41[local32].method2967(null);
				Static166.aClass28_Sub1_Sub1_Sub1Array41[local32] = null;
			}
		}
		if (Static26.aClass3_Sub5_Sub1_2.anInt3121 != Static203.anInt3616) {
			throw new RuntimeException("gnp1 pos:" + Static26.aClass3_Sub5_Sub1_2.anInt3121 + " psize:" + Static203.anInt3616);
		}
		for (local32 = 0; local32 < Static23.anInt305; local32++) {
			if (Static166.aClass28_Sub1_Sub1_Sub1Array41[Static369.anIntArray664[local32]] == null) {
				throw new RuntimeException("gnp2 pos:" + local32 + " size:" + Static23.anInt305);
			}
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method4651(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class48 local7 = Static69.aClass48ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class50 local13 = local7.aClass50_1; local13 != null; local13 = local13.aClass50_2) {
			@Pc(17) Class28_Sub1 local17 = local13.aClass28_Sub1_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort89 == arg1 && local17.aShort87 == arg2) {
				Static348.method4046(local17);
				return;
			}
		}
	}
}
