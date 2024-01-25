import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!ol", name = "S", descriptor = "I")
	public static int anInt4549;

	@OriginalMember(owner = "client!ol", name = "Q", descriptor = "Lclient!ku;")
	public static final Class139 aClass139_51 = new Class139(4);

	@OriginalMember(owner = "client!ol", name = "R", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_60 = new Class244(41, 3);

	@OriginalMember(owner = "client!ol", name = "T", descriptor = "Lclient!us;")
	public static final Class234 aClass234_89 = new Class234(38, -1);

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method4104(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg4 < arg1 + arg3 && arg4 + arg2 > arg3) {
			return arg5 + arg0 > arg6 && arg5 < arg7 + arg6;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IJ)V")
	public static void method4106(@OriginalArg(1) long arg0) {
		@Pc(17) int local17 = Static226.aClass28_Sub1_Sub1_Sub2_2.anInt5774 + Static347.anInt5875;
		@Pc(22) int local22 = Static226.aClass28_Sub1_Sub1_Sub2_2.anInt5766 + Static157.anInt2808;
		if (Static76.anInt1623 - local17 < -500 || Static76.anInt1623 - local17 > 500 || Static104.anInt2066 - local22 < -500 || Static104.anInt2066 - local22 > 500) {
			Static104.anInt2066 = local22;
			Static76.anInt1623 = local17;
		}
		@Pc(65) int local65;
		@Pc(73) int local73;
		if (Static76.anInt1623 != local17) {
			local65 = local17 - Static76.anInt1623;
			local73 = (int) ((long) local65 * arg0 / 320L);
			if (local65 <= 0) {
				if (local73 == 0) {
					local73 = -1;
				} else if (local73 < local65) {
					local73 = local65;
				}
			} else if (local73 == 0) {
				local73 = 1;
			} else if (local73 > local65) {
				local73 = local65;
			}
			Static76.anInt1623 += local73;
		}
		if (Static104.anInt2066 != local22) {
			local65 = local22 - Static104.anInt2066;
			local73 = (int) ((long) local65 * arg0 / 320L);
			if (local65 > 0) {
				if (local73 == 0) {
					local73 = 1;
				} else if (local65 < local73) {
					local73 = local65;
				}
			} else if (local73 == 0) {
				local73 = -1;
			} else if (local73 < local65) {
				local73 = local65;
			}
			Static104.anInt2066 += local73;
		}
		if (!Static164.aClass154_Sub1_1.aBoolean466) {
			Static279.aFloat67 += (float) arg0 * Static75.aFloat11 / 6.0F;
			Static352.aFloat68 += (float) arg0 * Static37.aFloat7 / 6.0F;
		}
		Static251.method4080();
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIII)V")
	public static void method4107(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class3_Sub7_Sub8 local16 = Static275.method4307(11, arg2);
		local16.method3219();
		local16.anInt3669 = arg1;
		local16.anInt3670 = arg0;
	}
}
