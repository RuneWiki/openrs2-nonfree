import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!cv", name = "I", descriptor = "[[I")
	public static int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!cv", name = "K", descriptor = "Lclient!qs;")
	public static Class211 aClass211_19;

	@OriginalMember(owner = "client!cv", name = "O", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_37 = new Class263(81, 8);

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(ILclient!ap;)V")
	public static void method1283(@OriginalArg(1) Class1_Sub3_Sub1 arg0) {
		arg0.method320();
		@Pc(10) int local10 = Static32.anInt894;
		@Pc(20) Class30_Sub1_Sub1_Sub2 local20 = Static429.aClass30_Sub1_Sub1_Sub2_2 = Static135.aClass30_Sub1_Sub1_Sub2Array1[local10] = new Class30_Sub1_Sub1_Sub2();
		local20.anInt1299 = local10;
		@Pc(28) int local28 = arg0.method321(30);
		@Pc(33) byte local33 = (byte) (local28 >> 28);
		@Pc(39) int local39 = local28 >> 14 & 0x3FFF;
		local20.anIntArray130[0] = local39 - Static278.anInt5374;
		@Pc(51) int local51 = local28 & 0x3FFF;
		local20.anInt7490 = (local20.anIntArray130[0] << 7) + (local20.method944() << 6);
		local20.anIntArray129[0] = local51 - Static380.anInt6896;
		local20.anInt7488 = (local20.anIntArray129[0] << 7) + (local20.method944() << 6);
		Static426.anInt1486 = local20.aByte102 = local33;
		if (Static43.aClass1_Sub3Array1[local10] != null) {
			local20.method964(Static43.aClass1_Sub3Array1[local10]);
		}
		Static180.anInt3908 = 0;
		Static274.anIntArray500[Static180.anInt3908++] = local10;
		Static85.aByteArray22[local10] = 0;
		Static398.anInt7204 = 0;
		for (@Pc(124) int local124 = 1; local124 < 2048; local124++) {
			if (local10 != local124) {
				@Pc(134) int local134 = arg0.method321(18);
				@Pc(138) int local138 = local134 >> 16;
				@Pc(144) int local144 = local134 >> 8 & 0xFF;
				@Pc(148) int local148 = local134 & 0xFF;
				@Pc(156) Class155 local156 = Static413.aClass155Array1[local124] = new Class155();
				local156.anInt4560 = local148 + (local138 << 28) + (local144 << 14);
				local156.anInt4563 = 0;
				local156.anInt4561 = -1;
				local156.aBoolean291 = false;
				Static214.anIntArray679[Static398.anInt7204++] = local124;
				Static85.aByteArray22[local124] = 0;
			}
		}
		arg0.method315();
	}
}
