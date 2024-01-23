import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
	public static int anInt352;

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "Lclient!jd;")
	public static Class84 aClass84_9;

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "I")
	public static int anInt354;

	@OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
	public static int anInt356;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)Z")
	public static boolean method315() {
		if (Static54.aBoolean95) {
			try {
				return !((Boolean) Static303.method484("showingVideoAd", Static299.aClass177_5.anApplet1));
			} catch (@Pc(18) Throwable local18) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(III)I")
	public static int method317(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) Class2_Sub18 local18 = (Class2_Sub18) Static50.aClass79_4.method2002((long) arg0);
		if (local18 == null) {
			return -1;
		} else if (arg1 >= 0 && arg1 < local18.anIntArray289.length) {
			return local18.anIntArray289[arg1];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)V")
	public static void method318(@OriginalArg(0) int arg0) {
		Static40.anInt977 = arg0;
		Static16.method351(3);
		Static16.method351(4);
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(BI)V")
	public static void method319(@OriginalArg(1) int arg0) {
		if (!Static246.aBoolean422) {
			arg0 = -1;
		}
		if (Static205.anInt4277 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(21) Class17 local21 = Static73.method1365(arg0);
			@Pc(25) Class2_Sub3_Sub1_Sub1 local25 = local21.method415();
			if (local25 == null) {
				arg0 = -1;
			} else {
				Static299.aClass177_5.method4668(local25.method4379(), local25.anInt5457, Static105.aCanvas1, local25.anInt5466, new Point(local21.anInt467, local21.anInt470));
				Static205.anInt4277 = arg0;
			}
		}
		if (arg0 == -1 && Static205.anInt4277 != -1) {
			Static299.aClass177_5.method4668(null, -1, Static105.aCanvas1, -1, new Point());
			Static205.anInt4277 = -1;
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IZ)V")
	public static void method320(@OriginalArg(0) int arg0) {
		if (arg0 > 256) {
			arg0 = 256;
		}
		if (arg0 > 10) {
			arg0 = 10;
		}
		Static110.anInt2371 += arg0 * 128;
		@Pc(34) int local34;
		if (Static110.anInt2371 > Static298.anIntArray473.length) {
			local34 = (int) (Math.random() * 12.0D);
			Static110.anInt2371 -= Static298.anIntArray473.length;
			Static288.method4788(Static155.aClass71_Sub1Array114[local34]);
		}
		local34 = 0;
		@Pc(50) int local50 = arg0 * 128;
		@Pc(57) int local57 = (256 - arg0) * 128;
		@Pc(59) int local59;
		@Pc(89) int local89;
		for (local59 = 0; local59 < local57; local59++) {
			local89 = Static22.anIntArray20[local34 + local50] - Static298.anIntArray473[Static110.anInt2371 + local34 & Static298.anIntArray473.length + -1] * arg0 / 6;
			if (local89 < 0) {
				local89 = 0;
			}
			Static22.anIntArray20[local34++] = local89;
		}
		@Pc(122) int local122;
		@Pc(132) int local132;
		for (local59 = 256 - arg0; local59 < 256; local59++) {
			local89 = local59 * 128;
			for (local122 = 0; local122 < 128; local122++) {
				local132 = (int) (Math.random() * 100.0D);
				if (local132 < 50 && local122 > 10 && local122 < 118) {
					Static22.anIntArray20[local122 + local89] = 255;
				} else {
					Static22.anIntArray20[local122 + local89] = 0;
				}
			}
		}
		for (local59 = 0; local59 < 256 - arg0; local59++) {
			Static154.anIntArray233[local59] = Static154.anIntArray233[local59 + arg0];
		}
		for (local59 = 256 - arg0; local59 < 256; local59++) {
			Static154.anIntArray233[local59] = (int) (Math.sin((double) Static156.anInt5521 / 14.0D) * 16.0D + Math.sin((double) Static156.anInt5521 / 15.0D) * 14.0D + Math.sin((double) Static156.anInt5521 / 16.0D) * 12.0D);
			Static156.anInt5521++;
		}
		Static134.anInt2737 += arg0;
		local59 = (arg0 + (Static148.anInt3168 & 0x1)) / 2;
		if (local59 <= 0) {
			return;
		}
		for (local89 = 0; local89 < Static134.anInt2737; local89++) {
			local132 = (int) (Math.random() * 128.0D) + 128;
			local122 = (int) (Math.random() * 124.0D) + 2;
			Static22.anIntArray20[(local132 << 7) + local122] = 192;
		}
		Static134.anInt2737 = 0;
		@Pc(297) int local297;
		for (local89 = 0; local89 < 256; local89++) {
			local132 = local89 * 128;
			local122 = 0;
			for (local297 = -local59; local297 < 128; local297++) {
				if (local59 + local297 < 128) {
					local122 += Static22.anIntArray20[local59 + local297 + local132];
				}
				if (local297 - local59 - 1 >= 0) {
					local122 -= Static22.anIntArray20[local132 + local297 - local59 - 1];
				}
				if (local297 >= 0) {
					Static127.anIntArray173[local132 + local297] = local122 / (local59 * 2 + 1);
				}
			}
		}
		for (local89 = 0; local89 < 128; local89++) {
			local122 = 0;
			for (local132 = -local59; local132 < 256; local132++) {
				local297 = local132 * 128;
				if (local59 + local132 < 256) {
					local122 += Static127.anIntArray173[local59 * 128 + local89 + local297];
				}
				if (local132 - local59 - 1 >= 0) {
					local122 -= Static127.anIntArray173[local89 + local297 - (local59 + 1) * 128];
				}
				if (local132 >= 0) {
					Static22.anIntArray20[local89 + local297] = local122 / (local59 * 2 + 1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!mn;I)Lclient!mn;")
	public static Class115 method321(@OriginalArg(0) Class115 arg0) {
		if (arg0.anInt3525 != -1) {
			return Static90.method1692(arg0.anInt3525);
		}
		@Pc(20) int local20 = arg0.anInt3552 >>> 16;
		@Pc(25) Class102 local25 = new Class102(Static152.aClass79_14);
		for (@Pc(32) Class2_Sub15 local32 = (Class2_Sub15) local25.method2550(); local32 != null; local32 = (Class2_Sub15) local25.method2553()) {
			if (local32.anInt2424 == local20) {
				return Static90.method1692((int) local32.aLong315);
			}
		}
		return null;
	}
}
