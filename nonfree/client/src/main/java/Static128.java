import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!id", name = "z", descriptor = "I")
	public static int anInt3534;

	@OriginalMember(owner = "client!id", name = "w", descriptor = "I")
	public static int anInt3532 = 0;

	@OriginalMember(owner = "client!id", name = "C", descriptor = "Lclient!cr;")
	public static Class37 aClass37_56 = new Class37(64);

	@OriginalMember(owner = "client!id", name = "D", descriptor = "[I")
	public static final int[] anIntArray341 = new int[50];

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ILclient!ii;)V")
	public static void method2974(@OriginalArg(1) Class105 arg0) {
		@Pc(12) int local12 = Static298.anInt6013;
		@Pc(14) int local14 = Static148.anInt3051;
		@Pc(16) int local16 = Static228.anInt4754;
		@Pc(20) int local20 = Static145.anInt3038 - 3;
		if (Static231.aClass8_21 == null || Static237.aClass8_22 == null) {
			if (Static125.aClass134_55.method3005(Static295.anInt5956) && Static125.aClass134_55.method3005(Static37.anInt998)) {
				Static231.aClass8_21 = arg0.method4238(Static369.method5469(Static125.aClass134_55, Static295.anInt5956, 0));
				@Pc(49) Class201 local49 = Static369.method5469(Static125.aClass134_55, Static37.anInt998, 0);
				Static237.aClass8_22 = arg0.method4238(local49);
				local49.method5464();
				Static286.aClass8_23 = arg0.method4238(local49);
			} else {
				arg0.method4249(local12, local14, local16, 20, 255 - Static175.anInt3716 << 24 | Static196.anInt4150, 1);
			}
		}
		@Pc(95) int local95;
		@Pc(93) int local93;
		if (Static231.aClass8_21 != null && Static237.aClass8_22 != null) {
			local93 = (local16 - Static237.aClass8_22.method4383() * 2) / Static231.aClass8_21.method4383();
			for (local95 = 0; local95 < local93; local95++) {
				Static231.aClass8_21.method4393(local12 + Static237.aClass8_22.method4383() + local95 * Static231.aClass8_21.method4383(), local14);
			}
			Static237.aClass8_22.method4393(local12, local14);
			Static286.aClass8_23.method4393(local12 + local16 - Static286.aClass8_23.method4383(), local14);
		}
		Static286.aClass29_3.method3742(local14 + 14, -1, -16777216 | Static162.anInt3364, Static148.aString111, local12 + 3);
		arg0.method4249(local12, local14 + 20, local16, local20 - 20, -Static175.anInt3716 + 255 << 24 | Static196.anInt4150, 1);
		local93 = Static208.anInt4358;
		local95 = Static28.anInt538;
		@Pc(189) int local189;
		for (@Pc(171) int local171 = 0; local171 < Static61.anInt1413; local171++) {
			local189 = local14 + (-local171 + (Static61.anInt1413 - 1)) * 16 + 20 + 13;
			if (local12 < local93 && local16 + local12 > local93 && local95 > local189 - 13 && local95 < local189 + 3) {
				arg0.method4249(local12, local189 - 12, local16, 16, Static245.anInt1074 | 255 - Static103.anInt1983 << 24, 1);
			}
		}
		if ((Static217.aClass8_11 == null || Static212.aClass8_19 == null || Static229.aClass8_20 == null) && Static125.aClass134_55.method3005(Static71.anInt1495) && Static125.aClass134_55.method3005(Static174.anInt5779) && Static125.aClass134_55.method3005(Static44.anInt1170)) {
			@Pc(270) Class201 local270 = Static369.method5469(Static125.aClass134_55, Static174.anInt5779, 0);
			Static212.aClass8_19 = arg0.method4238(local270);
			local270.method5464();
			Static39.aClass8_13 = arg0.method4238(local270);
			Static217.aClass8_11 = arg0.method4238(Static369.method5469(Static125.aClass134_55, Static71.anInt1495, 0));
			@Pc(295) Class201 local295 = Static369.method5469(Static125.aClass134_55, Static44.anInt1170, 0);
			Static229.aClass8_20 = arg0.method4238(local295);
			local295.method5464();
			Static184.aClass8_17 = arg0.method4238(local295);
		}
		@Pc(365) int local365;
		@Pc(367) int local367;
		if (Static217.aClass8_11 != null && Static212.aClass8_19 != null && Static229.aClass8_20 != null) {
			local189 = (local16 - Static229.aClass8_20.method4383() * 2) / Static217.aClass8_11.method4383();
			for (@Pc(325) int local325 = 0; local325 < local189; local325++) {
				Static217.aClass8_11.method4393(Static229.aClass8_20.method4383() + local12 + Static217.aClass8_11.method4383() * local325, -Static217.aClass8_11.method4382() + local20 + local14);
			}
			local365 = (local20 - Static229.aClass8_20.method4382() - 20) / Static212.aClass8_19.method4382();
			for (local367 = 0; local367 < local365; local367++) {
				Static212.aClass8_19.method4393(local12, local367 * Static212.aClass8_19.method4382() + local14 + 20);
				Static39.aClass8_13.method4393(local16 + local12 - Static39.aClass8_13.method4383(), local367 * Static212.aClass8_19.method4382() + 20 + local14);
			}
			Static229.aClass8_20.method4393(local12, local20 + local14 - Static229.aClass8_20.method4382());
			Static184.aClass8_17.method4393(local16 + local12 - Static229.aClass8_20.method4383(), local20 + local14 - Static229.aClass8_20.method4382());
		}
		local189 = 0;
		for (@Pc(433) Class1_Sub12 local433 = (Class1_Sub12) Static58.aClass14_4.method302(); local433 != null; local433 = (Class1_Sub12) Static58.aClass14_4.method313()) {
			local365 = (Static61.anInt1413 - local189 - 1) * 16 + local14 + 20 + 13;
			local367 = Static162.anInt3364 | 0xFF000000;
			if (local93 > local12 && local16 + local12 > local93 && local95 > local365 - 13 && local95 < local365 + 3) {
				local367 = Static9.anInt115 | 0xFF000000;
			}
			@Pc(490) int[] local490 = null;
			if (Static186.method3282(local433.anInt1409)) {
				local490 = Static348.method5333((int) local433.aLong30).anIntArray251;
			} else if (Static332.method5557(local433.anInt1409)) {
				@Pc(537) Class10_Sub1_Sub2_Sub1 local537 = Static178.aClass10_Sub1_Sub2_Sub1Array1[(int) local433.aLong30];
				if (local537 != null) {
					local490 = local537.aClass60_1.anIntArray111;
				}
			} else if (Static41.method885(local433.anInt1409)) {
				if (local433.anInt1409 == 1008) {
					local490 = Static129.method2097((int) local433.aLong30).anIntArray158;
				} else {
					local490 = Static129.method2097((int) (local433.aLong30 >>> 32 & 0x7FFFFFFFL)).anIntArray158;
				}
			}
			@Pc(555) String local555 = Static44.method910(local433);
			if (local490 != null) {
				local555 = local555 + Static57.method1117(local490);
			}
			Static286.aClass29_3.method3754(local367, local12 + 3, local365, Static76.anIntArray117, local555, Static67.aClass8Array4, 0);
			local189++;
		}
		Static149.method2617(Static145.anInt3038, Static298.anInt6013, Static148.anInt3051, Static228.anInt4754);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(BII)V")
	public static void method2975(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!Static265.aBoolean456) {
			return;
		}
		Static305.aClass1_Sub21_Sub2_3.method5757(178);
		Static305.aClass1_Sub21_Sub2_3.method5702(arg0);
		Static305.aClass1_Sub21_Sub2_3.method5696(arg1);
		Static305.aClass1_Sub21_Sub2_3.method5738(Static259.anInt5310);
		Static305.aClass1_Sub21_Sub2_3.method5698(Static178.anInt3758);
	}
}
