import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!ki", name = "r", descriptor = "Lclient!um;")
	public static Class247 aClass247_4;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)V")
	public static void method3035() {
		@Pc(9) Class126 local9 = Static124.aClass126_19;
		synchronized (Static124.aClass126_19) {
			Static124.aClass126_19.method2827();
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(III)Z")
	public static boolean method3038(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!Static331.aBoolean372) {
			return false;
		}
		@Pc(13) int local13 = arg0 >> 16;
		@Pc(17) int local17 = arg0 & 0xFFFF;
		if (Static294.aClass95ArrayArray3[local13] == null || Static294.aClass95ArrayArray3[local13][local17] == null) {
			return false;
		}
		@Pc(40) Class95 local40 = Static294.aClass95ArrayArray3[local13][local17];
		@Pc(54) Class7_Sub39 local54;
		if (arg1 == -1 && local40.anInt2616 == 0) {
			for (local54 = (Class7_Sub39) Static237.aClass85_26.method2010(); local54 != null; local54 = (Class7_Sub39) Static237.aClass85_26.method2000()) {
				if (local54.anInt5893 == 16 || local54.anInt5893 == 1008 || local54.anInt5893 == 17 || local54.anInt5893 == 11 || local54.anInt5893 == 22) {
					for (@Pc(87) Class95 local87 = Static313.method4088(local54.anInt5890); local87 != null; local87 = Static58.method808(local87)) {
						if (local40.anInt2583 == local87.anInt2583) {
							return true;
						}
					}
				}
			}
		} else {
			for (local54 = (Class7_Sub39) Static237.aClass85_26.method2010(); local54 != null; local54 = (Class7_Sub39) Static237.aClass85_26.method2000()) {
				if (local54.anInt5896 == arg1 && local40.anInt2583 == local54.anInt5890 && (local54.anInt5893 == 16 || local54.anInt5893 == 1008 || local54.anInt5893 == 17 || local54.anInt5893 == 11 || local54.anInt5893 == 22)) {
					return true;
				}
			}
		}
		return false;
	}
}
