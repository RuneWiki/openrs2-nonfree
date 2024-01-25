import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_116 = new Class133(108, 8);

	@OriginalMember(owner = "client!oo", name = "g", descriptor = "Lclient!ua;")
	public static final Class289 aClass289_3 = new Class289();

	@OriginalMember(owner = "client!oo", name = "h", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_106 = new Class67("K", "T", "K", "K");

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lclient!qb;IIILclient!qb;BIIII)V")
	public static void method5575(@OriginalArg(0) Class6_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class6_Sub1_Sub2 arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int arg6) {
		@Pc(7) int local7 = arg0.method7073();
		if (local7 == -1) {
			return;
		}
		@Pc(21) Class119 local21 = (Class119) Static400.aClass125_49.method3512((long) local7);
		if (local21 == null) {
			@Pc(28) Class9[] local28 = Static551.method526(Static19.aClass161_7, local7);
			if (local28 == null) {
				return;
			}
			local21 = Static121.aClass5_7.method7425(local28[0]);
			Static400.aClass125_49.method3519((long) local7, local21);
		}
		Static373.method5873(arg4.anInt8813, arg4.anInt8811, arg6 >> 1, arg2 >> 1, 0, arg4.method7083() * 256, arg4.aByte100);
		@Pc(75) int local75 = arg3 + Static447.anIntArray695[0] - 18;
		@Pc(85) int local85 = arg1 + Static447.anIntArray695[1] - 16 - 54;
		@Pc(93) int local93 = local75 + arg5 / 4 * 18;
		@Pc(101) int local101 = local85 + arg5 % 4 * 18;
		local21.method6678(local93, local101);
		if (arg0 == arg4) {
			Static121.aClass5_7.method7440(18, local101 - 1, 18, -256, local93 - 1);
		}
		@Pc(123) Class4_Sub5 local123 = Static86.method1761();
		local123.anInt7015 = local101 + 16;
		local123.aClass6_Sub1_Sub2_1 = arg0;
		local123.anInt7022 = local93 + 16;
		local123.anInt7020 = local93;
		local123.anInt7019 = local101;
		Static499.aClass90_5.method2322(local123);
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(ZZI)V")
	public static void method5577(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class3_Sub5 local10 = Static480.method7117(arg0, arg1);
		if (local10 != null) {
			for (@Pc(20) int local20 = 0; local20 < local10.anIntArray120.length; local20++) {
				local10.anIntArray120[local20] = -1;
				local10.anIntArray117[local20] = 0;
			}
		}
	}
}
