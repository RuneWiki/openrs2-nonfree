import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!mk", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString198 = "Loaded textures";

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIBII)V")
	public static void method2946(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(14) int local14 = arg1 - arg3;
		@Pc(23) int local23 = arg2 - arg4;
		if (local14 == 0) {
			if (local23 != 0) {
				Static124.method4677(arg4, arg2, arg0, arg3);
			}
		} else if (local23 == 0) {
			Static235.method4492(arg1, arg3, arg4, arg0);
		} else {
			@Pc(59) int local59 = (local23 << 12) / local14;
			@Pc(68) int local68 = arg4 - (arg3 * local59 >> 12);
			@Pc(81) int local81;
			@Pc(79) int local79;
			if (arg1 < Static29.anInt517) {
				local79 = (Static29.anInt517 * local59 >> 12) + local68;
				local81 = Static29.anInt517;
			} else if (arg1 <= Static11.anInt170) {
				local81 = arg1;
				local79 = arg2;
			} else {
				local79 = (Static11.anInt170 * local59 >> 12) + local68;
				local81 = Static11.anInt170;
			}
			if (local79 < Static98.anInt2007) {
				local79 = Static98.anInt2007;
				local81 = (Static98.anInt2007 - local68 << 12) / local59;
			} else if (Static213.anInt4452 < local79) {
				local79 = Static213.anInt4452;
				local81 = (Static213.anInt4452 - local68 << 12) / local59;
			}
			@Pc(145) int local145;
			@Pc(154) int local154;
			if (Static29.anInt517 > arg3) {
				local145 = Static29.anInt517;
				local154 = local68 + (local59 * Static29.anInt517 >> 12);
			} else if (arg3 > Static11.anInt170) {
				local154 = (Static11.anInt170 * local59 >> 12) + local68;
				local145 = Static11.anInt170;
			} else {
				local154 = arg4;
				local145 = arg3;
			}
			if (Static98.anInt2007 > local154) {
				local154 = Static98.anInt2007;
				local145 = (Static98.anInt2007 - local68 << 12) / local59;
			} else if (Static213.anInt4452 < local154) {
				local154 = Static213.anInt4452;
				local145 = (Static213.anInt4452 - local68 << 12) / local59;
			}
			Static26.method439(local145, local81, local154, arg0, local79);
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IB)I")
	public static int method2948(@OriginalArg(0) int arg0) {
		return arg0 >>> 10;
	}
}
