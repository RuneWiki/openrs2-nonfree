import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!lu", name = "x", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_79 = new Class276(69, 2);

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(II)V")
	public static void method5164(@OriginalArg(0) int arg0) {
		if (!Static455.aClass3_Sub27_Sub1_1.aBoolean393) {
			arg0 = -1;
		}
		if (arg0 == Static467.anInt8731) {
			return;
		}
		if (arg0 != -1) {
			@Pc(25) Class351 local25 = Static1.aClass228_1.method5845(arg0);
			@Pc(29) Class20 local29 = local25.method8266();
			if (local29 == null) {
				arg0 = -1;
			} else {
				Static480.aClass326_3.method7781(new Point(local25.anInt10202, local25.anInt10203), local29.method808(), Static545.aCanvas14, local29.method807(), local29.method812());
				Static467.anInt8731 = arg0;
			}
		}
		if (arg0 == -1 && Static467.anInt8731 != -1) {
			Static480.aClass326_3.method7781(new Point(), -1, Static545.aCanvas14, -1, null);
			Static467.anInt8731 = -1;
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(BII)Z")
	public static boolean method5170(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!Static256.aBoolean474) {
			return false;
		}
		@Pc(11) int local11 = arg0 >> 16;
		@Pc(23) int local23 = arg0 & 0xFFFF;
		if (Static108.aClass305ArrayArray1[local11] == null || Static108.aClass305ArrayArray1[local11][local23] == null) {
			return false;
		}
		@Pc(41) Class305 local41 = Static108.aClass305ArrayArray1[local11][local23];
		@Pc(53) Class3_Sub40 local53;
		if (arg1 == -1 && local41.anInt9211 == 0) {
			for (local53 = (Class3_Sub40) Static342.aClass183_44.method4795(); local53 != null; local53 = (Class3_Sub40) Static342.aClass183_44.method4793()) {
				if (local53.anInt7324 == 50 || local53.anInt7324 == 1003 || local53.anInt7324 == 5 || local53.anInt7324 == 15 || local53.anInt7324 == 11) {
					for (@Pc(142) Class305 local142 = Static220.method3786(local53.anInt7325); local142 != null; local142 = Static324.method5639(local142)) {
						if (local41.anInt9167 == local142.anInt9167) {
							return true;
						}
					}
				}
			}
		} else {
			for (local53 = (Class3_Sub40) Static342.aClass183_44.method4795(); local53 != null; local53 = (Class3_Sub40) Static342.aClass183_44.method4793()) {
				if (local53.anInt7326 == arg1 && local41.anInt9167 == local53.anInt7325 && (local53.anInt7324 == 50 || local53.anInt7324 == 1003 || local53.anInt7324 == 5 || local53.anInt7324 == 15 || local53.anInt7324 == 11)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(ILclient!oo;Lclient!oa;ILclient!kq;ILclient!dt;I)V")
	public static void method5171(@OriginalArg(0) int arg0, @OriginalArg(1) Class247 arg1, @OriginalArg(2) Class15 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub32 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class70 arg6) {
		@Pc(13) int local13 = arg4.anInt5920 - arg0 / 2 - 5;
		@Pc(17) int local17 = arg5 + 2;
		if (arg6.anInt2401 != 0) {
			arg2.method5341(arg6.anInt2401, local13, arg3 * arg1.method6143() + arg5 + 1 - local17, arg0 + 10, local17);
		}
		if (arg6.anInt2374 != 0) {
			arg2.method5300(arg0 + 10, arg6.anInt2374, local13, arg1.method6143() * arg3 + arg5 + 1 - local17, local17);
		}
		@Pc(70) int local70 = arg6.anInt2395;
		if (arg4.aBoolean509 && arg6.anInt2393 != -1) {
			local70 = arg6.anInt2393;
		}
		for (@Pc(88) int local88 = 0; local88 < arg3; local88++) {
			@Pc(93) String local93 = Static350.aStringArray26[local88];
			if (arg3 - 1 > local88) {
				local93 = local93.substring(0, local93.length() - 4);
			}
			arg1.method6142(arg2, local93, arg4.anInt5920, arg5, local70);
			arg5 += arg1.method6143();
		}
	}
}
