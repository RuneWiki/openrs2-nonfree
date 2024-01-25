import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IZIIII)V")
	public static void method2443(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg1 - arg0;
		@Pc(14) int local14 = arg3 - arg2;
		if (local10 == 0) {
			if (local14 != 0) {
				Static377.method159(arg3, arg0, arg4, arg2);
			}
		} else if (local14 == 0) {
			Static378.method5100(arg1, arg0, arg2, arg4);
		} else {
			@Pc(50) int local50 = (local14 << 12) / local10;
			@Pc(59) int local59 = arg2 - (local50 * arg0 >> 12);
			@Pc(71) int local71;
			@Pc(73) int local73;
			if (arg1 < Static115.anInt2362) {
				local71 = Static115.anInt2362;
				local73 = (Static115.anInt2362 * local50 >> 12) + local59;
			} else if (arg1 <= Static146.anInt3034) {
				local71 = arg1;
				local73 = arg3;
			} else {
				local71 = Static146.anInt3034;
				local73 = local59 + (local50 * Static146.anInt3034 >> 12);
			}
			@Pc(117) int local117;
			@Pc(115) int local115;
			if (arg0 < Static115.anInt2362) {
				local115 = local59 + (local50 * Static115.anInt2362 >> 12);
				local117 = Static115.anInt2362;
			} else if (Static146.anInt3034 < arg0) {
				local115 = local59 + (local50 * Static146.anInt3034 >> 12);
				local117 = Static146.anInt3034;
			} else {
				local115 = arg2;
				local117 = arg0;
			}
			if (Static319.anInt5496 > local115) {
				local117 = (Static319.anInt5496 - local59 << 12) / local50;
				local115 = Static319.anInt5496;
			} else if (local115 > Static160.anInt3220) {
				local117 = (Static160.anInt3220 - local59 << 12) / local50;
				local115 = Static160.anInt3220;
			}
			if (Static319.anInt5496 > local73) {
				local71 = (Static319.anInt5496 - local59 << 12) / local50;
				local73 = Static319.anInt5496;
			} else if (local73 > Static160.anInt3220) {
				local71 = (Static160.anInt3220 - local59 << 12) / local50;
				local73 = Static160.anInt3220;
			}
			Static258.method3722(local115, local117, local71, local73, arg4);
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ZB)V")
	public static void method2444(@OriginalArg(0) boolean arg0) {
		if (Static168.aString26.length() == 0) {
			return;
		}
		Static16.method251("--> " + Static168.aString26);
		Static74.method1394(Static168.aString26, false, arg0);
		Static360.anInt6139 = 0;
		Static168.aString26 = "";
		Static84.anInt1815 = 0;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method2445(@OriginalArg(1) String arg0) {
		System.exit(1);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(III)I")
	public static int method2450(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 >>> 24;
		@Pc(18) int local18 = 255 - local7;
		@Pc(36) int local36 = ((arg0 & 0xFF00FF) * local7 & 0xFF00FF00 | (arg0 & 0xFF00) * local7 & 0xFF0000) >>> 8;
		return local36 + ((local18 * (arg1 & 0xFF00) & 0xFF0000 | local18 * (arg1 & 0xFF00FF) & 0xFF00FF00) >>> 8);
	}
}
