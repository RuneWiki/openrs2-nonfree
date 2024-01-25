import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!ko", name = "L", descriptor = "Z")
	private static boolean aBoolean121;

	@OriginalMember(owner = "client!ko", name = "M", descriptor = "I")
	private static int anInt1586;

	@OriginalMember(owner = "client!ko", name = "N", descriptor = "Z")
	private static boolean aBoolean122;

	@OriginalMember(owner = "client!ko", name = "O", descriptor = "Z")
	private static boolean aBoolean123;

	@OriginalMember(owner = "client!ko", name = "P", descriptor = "I")
	private static int anInt1587;

	@OriginalMember(owner = "client!ko", name = "Q", descriptor = "I")
	private static int anInt1588;

	@OriginalMember(owner = "client!ko", name = "R", descriptor = "Z")
	private static boolean aBoolean124;

	@OriginalMember(owner = "client!ko", name = "S", descriptor = "Z")
	private static boolean aBoolean125;

	@OriginalMember(owner = "client!ko", name = "providesignlink", descriptor = "(Lclient!dj;)V")
	private static void method1515(@OriginalArg(0) Class71 arg0) {
		Static375.aClass71_3 = arg0;
		Static239.aClass71_2 = arg0;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "([[BBLclient!gn;)V")
	public static void method1517(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class119_Sub1 arg1) {
		for (@Pc(14) int local14 = 0; local14 < arg1.anInt3799; local14++) {
			Static365.method5697();
			for (@Pc(20) int local20 = 0; local20 < Static37.anInt7512 >> 3; local20++) {
				for (@Pc(24) int local24 = 0; local24 < Static329.anInt6247 >> 3; local24++) {
					@Pc(34) int local34 = Static116.anIntArrayArrayArray2[local14][local20][local24];
					if (local34 != -1) {
						@Pc(43) int local43 = local34 >> 24 & 0x3;
						if (!arg1.aBoolean312 || local43 == 0) {
							@Pc(57) int local57 = local34 >> 1 & 0x3;
							@Pc(63) int local63 = local34 >> 14 & 0x3FF;
							@Pc(69) int local69 = local34 >> 3 & 0x7FF;
							@Pc(79) int local79 = (local63 / 8 << 8) + local69 / 8;
							for (@Pc(81) int local81 = 0; local81 < Static443.anIntArray607.length; local81++) {
								if (Static443.anIntArray607[local81] == local79 && arg0[local81] != null) {
									arg1.method3349(local57, (local63 & 0x7) * 8, arg0[local81], local14, local43, local24 * 8, Static243.aClass42_4, Static510.aClass184Array1, (local69 & 0x7) * 8, local20 * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method1524(@OriginalArg(1) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(19) int local19 = local8.length() - 3; local19 > 0; local19 -= 3) {
			local8 = local8.substring(0, local19) + "," + local8.substring(local19);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static265.aClass88_147.method2391(Static345.anInt6495) + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static282.aClass88_154.method2391(Static345.anInt6495) + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}
}
