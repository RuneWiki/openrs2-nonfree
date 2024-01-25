import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "Lclient!sla;")
	public static final Class344 aClass344_1 = new Class344(10, 8);

	@OriginalMember(owner = "client!bw", name = "d", descriptor = "I")
	public static int anInt1573 = 0;

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(IIIIIII)J")
	public static long method1480(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(6) int arg2) {
		Static280.aCalendar2.clear();
		Static280.aCalendar2.set(arg1, arg0, arg2, 12, 0, 0);
		return Static280.aCalendar2.getTime().getTime();
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method1481(@OriginalArg(1) String arg0) {
		@Pc(7) String local7 = null;
		@Pc(13) int local13 = arg0.indexOf("--> ");
		if (local13 >= 0) {
			local7 = arg0.substring(0, local13 + 4);
			arg0 = arg0.substring(local13 + 4);
		}
		if (arg0.startsWith("directlogin ")) {
			@Pc(52) int local52 = arg0.indexOf(" ", "directlogin ".length());
			if (local52 >= 0) {
				@Pc(60) int local60 = arg0.length();
				arg0 = arg0.substring(0, local52) + " ";
				for (@Pc(76) int local76 = local52 + 1; local76 < local60; local76++) {
					arg0 = arg0 + "*";
				}
			}
		}
		return local7 == null ? arg0 : local7 + arg0;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(IIIII)V")
	public static void method1482(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(12) int local12 = -arg0;
		@Pc(14) int local14 = -1;
		@Pc(22) int local22 = Static689.method9122(Static77.anInt1737, Static82.anInt1902, arg0 + arg3);
		@Pc(31) int local31 = Static689.method9122(Static77.anInt1737, Static82.anInt1902, arg3 - arg0);
		Static202.method3077(Static118.anIntArrayArray7[arg1], local31, arg2, local22);
		while (local9 > local7) {
			local14 += 2;
			local12 += local14;
			@Pc(63) int local63;
			@Pc(67) int local67;
			@Pc(91) int local91;
			@Pc(100) int local100;
			if (local12 > 0) {
				local9--;
				local12 -= local9 << 1;
				local63 = arg1 - local9;
				local67 = local9 + arg1;
				if (local67 >= Static549.anInt5294 && Static334.anInt5381 >= local63) {
					local91 = Static689.method9122(Static77.anInt1737, Static82.anInt1902, local7 + arg3);
					local100 = Static689.method9122(Static77.anInt1737, Static82.anInt1902, arg3 - local7);
					if (local67 <= Static334.anInt5381) {
						Static202.method3077(Static118.anIntArrayArray7[local67], local100, arg2, local91);
					}
					if (Static549.anInt5294 <= local63) {
						Static202.method3077(Static118.anIntArrayArray7[local63], local100, arg2, local91);
					}
				}
			}
			local7++;
			local63 = arg1 - local7;
			local67 = local7 + arg1;
			if (Static549.anInt5294 <= local67 && Static334.anInt5381 >= local63) {
				local91 = Static689.method9122(Static77.anInt1737, Static82.anInt1902, arg3 + local9);
				local100 = Static689.method9122(Static77.anInt1737, Static82.anInt1902, arg3 - local9);
				if (local67 <= Static334.anInt5381) {
					Static202.method3077(Static118.anIntArrayArray7[local67], local100, arg2, local91);
				}
				if (local63 >= Static549.anInt5294) {
					Static202.method3077(Static118.anIntArrayArray7[local63], local100, arg2, local91);
				}
			}
		}
	}
}
