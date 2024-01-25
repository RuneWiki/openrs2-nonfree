import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static418 {

	@OriginalMember(owner = "client!nea", name = "n", descriptor = "I")
	public static int anInt7393;

	@OriginalMember(owner = "client!nea", name = "p", descriptor = "Lclient!da;")
	public static Class44 aClass44_32;

	@OriginalMember(owner = "client!nea", name = "q", descriptor = "I")
	public static int anInt7392 = 0;

	@OriginalMember(owner = "client!nea", name = "m", descriptor = "Z")
	public static boolean aBoolean574 = false;

	@OriginalMember(owner = "client!nea", name = "f", descriptor = "[B")
	public static final byte[] aByteArray58 = new byte[2048];

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(IIIIII)V")
	public static void method6195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(13) int local13 = arg0 * arg0;
		@Pc(17) int local17 = arg2 * arg2;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg2 << 1;
		@Pc(38) int local38 = local21 + (1 - local29) * local13;
		@Pc(47) int local47 = local17 - (local29 - 1) * local25;
		@Pc(51) int local51 = local13 << 2;
		@Pc(55) int local55 = local17 << 2;
		@Pc(63) int local63 = local21 * 3;
		@Pc(71) int local71 = ((arg2 << 1) - 3) * local25;
		@Pc(77) int local77 = local55;
		@Pc(104) int local104;
		@Pc(112) int local112;
		if (arg1 >= Static280.anInt5114 && arg1 <= Static356.anInt6028) {
			local104 = Static27.method393(arg4 + arg0, Static85.anInt1313, Static316.anInt6313);
			local112 = Static27.method393(arg4 - arg0, Static85.anInt1313, Static316.anInt6313);
			Static482.method7040(arg3, local112, Static384.anIntArrayArray38[arg1], local104);
		}
		@Pc(126) int local126 = (arg2 - 1) * local51;
		while (local9 > 0) {
			if (local38 < 0) {
				while (local38 < 0) {
					local47 += local77;
					local38 += local63;
					local7++;
					local77 += local55;
					local63 += local55;
				}
			}
			if (local47 < 0) {
				local47 += local77;
				local38 += local63;
				local7++;
				local63 += local55;
				local77 += local55;
			}
			local47 += -local71;
			local38 += -local126;
			local9--;
			local71 -= local51;
			local126 -= local51;
			local104 = arg1 - local9;
			local112 = arg1 + local9;
			if (local112 >= Static280.anInt5114 && local104 <= Static356.anInt6028) {
				@Pc(225) int local225 = Static27.method393(arg4 + local7, Static85.anInt1313, Static316.anInt6313);
				@Pc(235) int local235 = Static27.method393(arg4 - local7, Static85.anInt1313, Static316.anInt6313);
				if (Static280.anInt5114 <= local104) {
					Static482.method7040(arg3, local235, Static384.anIntArrayArray38[local104], local225);
				}
				if (Static356.anInt6028 >= local112) {
					Static482.method7040(arg3, local235, Static384.anIntArrayArray38[local112], local225);
				}
			}
		}
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(BII)V")
	public static void method6196(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static492.method7119(arg0, arg1);
	}
}
