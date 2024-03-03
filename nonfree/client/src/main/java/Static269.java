import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!qr", name = "q", descriptor = "Lclient!jd;")
	public static Class13 aClass13_15;

	@OriginalMember(owner = "client!qr", name = "r", descriptor = "I")
	public static int anInt5500;

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIIBII)V", line = 3)
	public static void method5036(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(13) int local13 = arg1 * arg1;
		@Pc(17) int local17 = arg3 * arg3;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg3 << 1;
		@Pc(39) int local39 = local13 * (1 - local29) + local21;
		@Pc(48) int local48 = local17 - local25 * (local29 - 1);
		@Pc(52) int local52 = local13 << 2;
		@Pc(56) int local56 = local17 << 2;
		@Pc(64) int local64 = local21 * 3;
		@Pc(72) int local72 = ((arg3 << 1) - 3) * local25;
		@Pc(78) int local78 = local56;
		@Pc(84) int local84 = (arg3 - 1) * local52;
		@Pc(106) int local106;
		@Pc(115) int local115;
		if (arg0 >= Class2_Sub40.anInt6819 && Class2_Sub20.anInt2951 >= arg0) {
			local106 = Static24.method861(Class25_Sub1.anInt675, arg2 + arg1, Class61.anInt1835);
			local115 = Static24.method861(Class25_Sub1.anInt675, arg2 - arg1, Class61.anInt1835);
			Static94.method2165(local106, Static332.anIntArrayArray58[arg0], arg4, local115);
		}
		while (local9 > 0) {
			if (local39 < 0) {
				while (local39 < 0) {
					local48 += local78;
					local39 += local64;
					local64 += local56;
					local7++;
					local78 += local56;
				}
			}
			if (local48 < 0) {
				local39 += local64;
				local48 += local78;
				local78 += local56;
				local7++;
				local64 += local56;
			}
			local48 += -local72;
			local39 += -local84;
			local9--;
			local84 -= local52;
			local72 -= local52;
			local106 = arg0 - local9;
			local115 = arg0 + local9;
			if (local115 >= Class2_Sub40.anInt6819 && Class2_Sub20.anInt2951 >= local106) {
				@Pc(221) int local221 = Static24.method861(Class25_Sub1.anInt675, arg2 + local7, Class61.anInt1835);
				@Pc(230) int local230 = Static24.method861(Class25_Sub1.anInt675, arg2 - local7, Class61.anInt1835);
				if (Class2_Sub40.anInt6819 <= local106) {
					Static94.method2165(local221, Static332.anIntArrayArray58[local106], arg4, local230);
				}
				if (local115 <= Class2_Sub20.anInt2951) {
					Static94.method2165(local221, Static332.anIntArrayArray58[local115], arg4, local230);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lclient!ci;BLclient!r;)V", line = 131)
	public static void method5038(@OriginalArg(0) Interface2 arg0, @OriginalArg(2) Class197 arg1) {
		Static252.anInterface2_7 = arg0;
		Static313.aClass197_90 = arg1;
	}
}
