import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
	public static int anInt3997;

	@OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
	public static int anInt4002;

	@OriginalMember(owner = "client!ok", name = "k", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!ok", name = "n", descriptor = "I")
	public static int anInt4003;

	@OriginalMember(owner = "client!ok", name = "o", descriptor = "Lclient!hc;")
	public static Class51 aClass51_58;

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "Lclient!ab;")
	public static Class3 aClass3_17 = new Class3();

	@OriginalMember(owner = "client!ok", name = "g", descriptor = "Lclient!lc;")
	public static Class79 aClass79_27 = new Class79(64);

	@OriginalMember(owner = "client!ok", name = "h", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray33 = new String[500];

	@OriginalMember(owner = "client!ok", name = "i", descriptor = "[I")
	public static int[] anIntArray301 = new int[14];

	@OriginalMember(owner = "client!ok", name = "l", descriptor = "[S")
	public static short[] aShortArray54 = new short[] { 14, 29, 30, 48, 4, 51, 18, 8 };

	@OriginalMember(owner = "client!ok", name = "m", descriptor = "Z")
	public static boolean aBoolean197 = true;

	@OriginalMember(owner = "client!ok", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString267 = "red:";

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIII)Z")
	public static boolean method2987(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) int local9 = arg3 * Static66.anInt1840 + arg0 * Static236.anInt5123 >> 16;
		@Pc(19) int local19 = arg3 * Static236.anInt5123 - arg0 * Static66.anInt1840 >> 16;
		@Pc(29) int local29 = arg1 * Static144.anInt3491 + local19 * Static80.anInt2170 >> 16;
		@Pc(39) int local39 = arg1 * Static80.anInt2170 - local19 * Static144.anInt3491 >> 16;
		if (local29 < 1) {
			local29 = 1;
		}
		@Pc(50) int local50 = (local9 << 9) / local29;
		@Pc(56) int local56 = (local39 << 9) / local29;
		@Pc(66) int local66 = arg2 * Static144.anInt3491 + local19 * Static80.anInt2170 >> 16;
		@Pc(76) int local76 = arg2 * Static80.anInt2170 - local19 * Static144.anInt3491 >> 16;
		if (local66 < 1) {
			local66 = 1;
		}
		@Pc(87) int local87 = (local9 << 9) / local66;
		@Pc(93) int local93 = (local76 << 9) / local66;
		if (local29 < 50 && local66 < 50) {
			return false;
		} else if (local29 > 3500 && local66 > 3500) {
			return false;
		} else if (local50 < anInt4002 && local87 < anInt4002) {
			return false;
		} else if (local50 > Static180.anInt4132 && local87 > Static180.anInt4132) {
			return false;
		} else if (local56 < Static48.anInt1415 && local93 < Static48.anInt1415) {
			return false;
		} else {
			return local56 <= Static132.anInt3289 || local93 <= Static132.anInt3289;
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V")
	public static void method2988() {
		for (@Pc(7) int local7 = 0; local7 < Static23.anInt757; local7++) {
			@Pc(13) Class117 local13 = Static100.method2096(local7);
			if (local13 != null && local13.anInt4553 == 0) {
				Static36.anIntArray57[local7] = 0;
				Static91.anIntArray189[local7] = 0;
			}
		}
		Static145.aClass140_10 = new Class140(16);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method2989(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (Static167.anInt3907 <= arg3 && Static150.anInt3860 >= arg3 && arg6 >= Static167.anInt3907 && arg6 <= Static150.anInt3860 && Static167.anInt3907 <= arg2 && Static150.anInt3860 >= arg2 && arg5 >= Static167.anInt3907 && Static150.anInt3860 >= arg5 && Static202.anInt4469 <= arg7 && arg7 <= Static94.anInt4237 && Static202.anInt4469 <= arg1 && arg1 <= Static94.anInt4237 && arg0 >= Static202.anInt4469 && Static94.anInt4237 >= arg0 && Static202.anInt4469 <= arg4 && Static94.anInt4237 >= arg4) {
			Static138.method2534(arg3, arg5, arg0, arg4, arg6, arg1, arg8, arg7, arg2);
		} else {
			Static217.method3552(arg0, arg1, arg8, arg4, arg5, arg6, arg3, arg2, arg7);
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method2990(@OriginalArg(1) int arg0) {
		return aStringArray33[arg0].length() <= 0 ? Static8.aStringArray3[arg0] : Static8.aStringArray3[arg0] + Static36.aString31 + aStringArray33[arg0];
	}
}
