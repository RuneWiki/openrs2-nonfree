import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!nh", name = "I", descriptor = "I")
	public static int anInt4314;

	@OriginalMember(owner = "client!nh", name = "R", descriptor = "I")
	public static int anInt4322;

	@OriginalMember(owner = "client!nh", name = "P", descriptor = "Lclient!ik;")
	public static final Class103 aClass103_41 = new Class103(10);

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(BZIII)V")
	public static void method3821(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static116.aLong91 = 0L;
		@Pc(8) int local8 = Static213.method3775();
		if (arg2 == 3 || local8 == 3) {
			arg0 = true;
		}
		if (!Static128.aClass89_3.method5402()) {
			arg0 = true;
		}
		Static232.method4059(arg2, local8, arg1, arg0, arg3);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IZIIII)V")
	public static void method3822(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 < 1) {
			arg0 = 1;
		}
		if (arg3 < 1) {
			arg3 = 1;
		}
		@Pc(21) int local21 = arg0 - 334;
		if (local21 < 0) {
			local21 = 0;
		} else if (local21 > 100) {
			local21 = 100;
		}
		@Pc(43) int local43 = Static264.aShort68 + local21 * (Static89.aShort40 - Static264.aShort68) / 100;
		if (local43 < Static6.aShort2) {
			local43 = Static6.aShort2;
		} else if (Static101.aShort51 < local43) {
			local43 = Static101.aShort51;
		}
		@Pc(68) int local68 = local43 * arg0 * 512 / (arg3 * 334);
		@Pc(105) int local105;
		@Pc(112) int local112;
		@Pc(76) short local76;
		if (local68 < Static4.aShort1) {
			local76 = Static4.aShort1;
			local43 = local76 * arg3 * 334 / (arg0 * 512);
			if (Static101.aShort51 < local43) {
				local43 = Static101.aShort51;
				local105 = local43 * arg0 * 512 / (local76 * 334);
				local112 = (arg3 - local105) / 2;
				if (arg1) {
					Static128.aClass89_3.method5425();
					Static128.aClass89_3.method5477(arg4, arg2, arg0, local112, -16777216);
					Static128.aClass89_3.method5477(arg4, arg3 + arg2 - local112, arg0, local112, -16777216);
				}
				arg3 -= local112 * 2;
				arg2 += local112;
			}
		} else if (local68 > Static33.aShort20) {
			local76 = Static33.aShort20;
			local43 = local76 * arg3 * 334 / (arg0 * 512);
			if (Static6.aShort2 > local43) {
				local43 = Static6.aShort2;
				local105 = arg3 * 334 * local76 / (local43 * 512);
				local112 = (arg0 - local105) / 2;
				if (arg1) {
					Static128.aClass89_3.method5425();
					Static128.aClass89_3.method5477(arg4, arg2, local112, arg3, -16777216);
					Static128.aClass89_3.method5477(arg0 + arg4 - local112, arg2, local112, arg3, -16777216);
				}
				arg4 += local112;
				arg0 -= local112 * 2;
			}
		}
		Static147.anInt3208 = arg4;
		Static233.anInt4636 = (short) arg3;
		Static301.anInt5784 = arg0 * local43 / 334;
		Static59.anInt1509 = (short) arg0;
		Static243.anInt4798 = arg2;
	}
}
