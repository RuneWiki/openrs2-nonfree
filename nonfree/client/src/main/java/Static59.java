import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!g", name = "a", descriptor = "I")
	public static int anInt1427;

	@OriginalMember(owner = "client!g", name = "g", descriptor = "J")
	public static long aLong64;

	@OriginalMember(owner = "client!g", name = "e", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_592 = Static187.method3089("Der Server wird gerade aktualisiert)3");

	@OriginalMember(owner = "client!g", name = "j", descriptor = "I")
	public static int anInt1433 = 0;

	@OriginalMember(owner = "client!g", name = "k", descriptor = "I")
	public static int anInt1434 = -1;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IJ)V")
	public static void method972(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < Static78.anInt1731; local19++) {
			if (Static106.aLongArray7[local19] == arg0) {
				Static78.anInt1731--;
				for (@Pc(37) int local37 = local19; local37 < Static78.anInt1731; local37++) {
					Static27.aClass92Array5[local37] = Static27.aClass92Array5[local37 + 1];
					Static33.anIntArray61[local37] = Static33.anIntArray61[local37 + 1];
					Static109.aClass92Array16[local37] = Static109.aClass92Array16[local37 + 1];
					Static106.aLongArray7[local37] = Static106.aLongArray7[local37 + 1];
					Static168.anIntArray306[local37] = Static168.anIntArray306[local37 + 1];
				}
				Static61.anInt1468 = Static25.anInt588;
				Static38.aClass1_Sub14_Sub1_3.method3067(233);
				Static38.aClass1_Sub14_Sub1_3.method3016(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIII)V")
	public static void method973(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(10) int local10 = arg0 - arg3;
		@Pc(15) int local15 = arg2 - arg1;
		if (local10 == 0) {
			if (local15 != 0) {
				Static116.method1723(arg2, arg4, arg3, arg1);
			}
		} else if (local15 == 0) {
			method976(arg3, arg0, arg1, arg4);
		} else {
			if (local15 < 0) {
				local15 = -local15;
			}
			if (local10 < 0) {
				local10 = -local10;
			}
			@Pc(67) boolean local67 = local10 < local15;
			@Pc(75) int local75;
			@Pc(71) int local71;
			if (local67) {
				local71 = arg0;
				arg0 = arg2;
				local75 = arg3;
				arg2 = local71;
				arg3 = arg1;
				arg1 = local75;
			}
			if (arg0 < arg3) {
				local75 = arg3;
				local71 = arg1;
				arg1 = arg2;
				arg3 = arg0;
				arg2 = local71;
				arg0 = local75;
			}
			local75 = arg1;
			local71 = arg0 - arg3;
			@Pc(112) int local112 = arg2 - arg1;
			if (local112 < 0) {
				local112 = -local112;
			}
			@Pc(122) int local122 = -(local71 >> 1);
			@Pc(133) int local133 = arg2 <= arg1 ? -1 : 1;
			@Pc(137) int local137;
			if (local67) {
				for (local137 = arg3; local137 <= arg0; local137++) {
					Static142.anIntArrayArray25[local137][local75] = arg4;
					local122 += local112;
					if (local122 > 0) {
						local75 += local133;
						local122 -= local71;
					}
				}
			} else {
				for (local137 = arg3; local137 <= arg0; local137++) {
					local122 += local112;
					Static142.anIntArrayArray25[local75][local137] = arg4;
					if (local122 > 0) {
						local122 -= local71;
						local75 += local133;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(II)V")
	public static void method975(@OriginalArg(1) int arg0) {
		if (Static24.method463(arg0)) {
			Static200.method3300(-1, Static194.aClass11ArrayArray1[arg0]);
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIZI)V")
	public static void method976(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 < arg0) {
			Static74.method1123(arg1, arg3, Static142.anIntArrayArray25[arg2], arg0);
		} else {
			Static74.method1123(arg0, arg3, Static142.anIntArrayArray25[arg2], arg1);
		}
	}
}
