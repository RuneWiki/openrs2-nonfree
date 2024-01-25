import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static438 {

	@OriginalMember(owner = "client!nt", name = "p", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_100 = new Class349(51, -1);

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	public static void method6361(@OriginalArg(0) Canvas arg0) {
		@Pc(6) Dimension local6 = arg0.getSize();
		Static322.method4459(local6.width, local6.height);
		if (Static240.anInt10701 == 1) {
			Static614.aClass145_14.method9631(arg0, Static501.anInt5842, Static23.anInt6817);
		} else {
			Static614.aClass145_14.method9631(arg0, Static482.anInt7726, Static72.anInt1263);
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(ZLclient!hk;)I")
	public static int method6362(@OriginalArg(1) Class158 arg0) {
		if (arg0 == Static243.aClass158_7) {
			return 5120;
		} else if (Static243.aClass158_8 == arg0) {
			return 5122;
		} else if (Static243.aClass158_9 == arg0) {
			return 5124;
		} else if (Static243.aClass158_10 == arg0) {
			return 5121;
		} else if (Static243.aClass158_11 == arg0) {
			return 5123;
		} else if (arg0 == Static243.aClass158_12) {
			return 5125;
		} else if (Static243.aClass158_13 == arg0) {
			return 5131;
		} else if (arg0 == Static243.aClass158_14) {
			return 5126;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(ZII)Z")
	public static boolean method6363(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0xC580) != 0;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIIIII)V")
	public static void method6364(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg1 - arg3;
		@Pc(14) int local14 = arg4 - arg0;
		if (local10 == 0) {
			if (local14 != 0) {
				Static419.method6128(arg2, arg4, arg3, arg0);
			}
		} else if (local14 == 0) {
			Static91.method1401(arg2, arg3, arg1, arg0);
		} else {
			@Pc(52) int local52 = (local14 << 12) / local10;
			@Pc(61) int local61 = arg0 - (local52 * arg3 >> 12);
			@Pc(71) int local71;
			@Pc(73) int local73;
			if (Static8.anInt99 > arg3) {
				local73 = local61 + (Static8.anInt99 * local52 >> 12);
				local71 = Static8.anInt99;
			} else if (arg3 <= Static14.anInt206) {
				local71 = arg3;
				local73 = arg0;
			} else {
				local73 = local61 + (local52 * Static14.anInt206 >> 12);
				local71 = Static14.anInt206;
			}
			@Pc(119) int local119;
			@Pc(117) int local117;
			if (arg1 < Static8.anInt99) {
				local119 = Static8.anInt99;
				local117 = (Static8.anInt99 * local52 >> 12) + local61;
			} else if (Static14.anInt206 < arg1) {
				local117 = local61 + (local52 * Static14.anInt206 >> 12);
				local119 = Static14.anInt206;
			} else {
				local117 = arg4;
				local119 = arg1;
			}
			if (local73 < Static617.anInt9501) {
				local73 = Static617.anInt9501;
				local71 = (Static617.anInt9501 - local61 << 12) / local52;
			} else if (local73 > Static519.anInt8267) {
				local71 = (Static519.anInt8267 - local61 << 12) / local52;
				local73 = Static519.anInt8267;
			}
			if (Static617.anInt9501 > local117) {
				local117 = Static617.anInt9501;
				local119 = (Static617.anInt9501 - local61 << 12) / local52;
			} else if (local117 > Static519.anInt8267) {
				local117 = Static519.anInt8267;
				local119 = (Static519.anInt8267 - local61 << 12) / local52;
			}
			Static242.method7780(local73, local117, local71, arg2, local119);
		}
	}
}
