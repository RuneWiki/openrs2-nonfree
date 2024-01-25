import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static401 {

	@OriginalMember(owner = "client!uj", name = "X", descriptor = "Lclient!ir;")
	public static Class120 aClass120_1;

	@OriginalMember(owner = "client!uj", name = "G", descriptor = "Lclient!tq;")
	public static final Class238 aClass238_29 = new Class238(3, 2);

	@OriginalMember(owner = "client!uj", name = "W", descriptor = "Lclient!pp;")
	public static final Class198 aClass198_7 = new Class198("", 12);

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(BJ)V")
	public static void method5933(@OriginalArg(1) long arg0) {
		@Pc(10) int local10 = Static302.aClass3_Sub2_Sub1_Sub2_2.anInt7202 + Static273.anInt4889;
		@Pc(16) int local16 = Static302.aClass3_Sub2_Sub1_Sub2_2.anInt7207 + Static8.anInt328;
		if (Static14.anInt435 - local10 < -500 || Static14.anInt435 - local10 > 500 || Static390.anInt6891 - local16 < -500 || Static390.anInt6891 - local16 > 500) {
			Static14.anInt435 = local10;
			Static390.anInt6891 = local16;
		}
		@Pc(62) int local62;
		@Pc(70) int local70;
		if (Static14.anInt435 != local10) {
			local62 = local10 - Static14.anInt435;
			local70 = (int) (arg0 * (long) local62 / 320L);
			if (local62 > 0) {
				if (local70 == 0) {
					local70 = 1;
				} else if (local62 < local70) {
					local70 = local62;
				}
			} else if (local70 == 0) {
				local70 = -1;
			} else if (local62 > local70) {
				local70 = local62;
			}
			Static14.anInt435 += local70;
		}
		if (local16 != Static390.anInt6891) {
			local62 = local16 - Static390.anInt6891;
			local70 = (int) (arg0 * (long) local62 / 320L);
			if (local62 > 0) {
				if (local70 == 0) {
					local70 = 1;
				} else if (local70 > local62) {
					local70 = local62;
				}
			} else if (local70 == 0) {
				local70 = -1;
			} else if (local70 < local62) {
				local70 = local62;
			}
			Static390.anInt6891 += local70;
		}
		if (!Static291.aClass28_Sub1_1.aBoolean85) {
			Static165.aFloat28 += (float) arg0 * Static408.aFloat98 / 6.0F;
			Static265.aFloat51 += Static29.aFloat4 * (float) arg0 / 6.0F;
		}
		Static42.method964();
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIII)V")
	public static void method5934(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(13) int local13 = 0; local13 < Static386.anInt6857; local13++) {
			@Pc(19) Rectangle local19 = Class12_Sub2.aRectangleArray1[local13];
			if (arg1 < local19.x + local19.width && local19.x < arg0 + arg1 && arg2 < local19.height + local19.y && local19.y < arg3 + arg2) {
				Static180.aBooleanArray8[local13] = true;
			}
		}
	}
}
