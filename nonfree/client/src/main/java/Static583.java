import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static583 {

	@OriginalMember(owner = "client!ts", name = "P", descriptor = "Lclient!el;")
	public static final Class109 aClass109_207 = new Class109(33, 20);

	@OriginalMember(owner = "client!ts", name = "R", descriptor = "I")
	public static int anInt9776 = 0;

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IZI)Z")
	public static boolean method8399(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIIIIIIIIIII)V")
	public static void method8400(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (!Static596.method8616(arg7)) {
			return;
		}
		if (Static175.aClass73ArrayArray1[arg7] == null) {
			Static81.method1257(Static489.aClass73ArrayArray2[arg7], -1, arg8, arg0, arg4, arg1, arg2, arg10, arg5, arg3, arg9, arg6);
		} else {
			Static81.method1257(Static175.aClass73ArrayArray1[arg7], -1, arg8, arg0, arg4, arg1, arg2, arg10, arg5, arg3, arg9, arg6);
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(JZ)V")
	public static void method8401(@OriginalArg(0) long arg0) {
		@Pc(10) int local10 = Static274.anInt4832 + Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anInt10355;
		@Pc(16) int local16 = Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anInt10363 + Static275.anInt4791;
		if (Static425.anInt7328 - local10 < -2000 || Static425.anInt7328 - local10 > 2000 || Static349.anInt6137 - local16 < -2000 || Static349.anInt6137 - local16 > 2000) {
			Static425.anInt7328 = local10;
			Static349.anInt6137 = local16;
		}
		@Pc(66) int local66;
		@Pc(74) int local74;
		if (local10 != Static425.anInt7328) {
			local66 = local10 - Static425.anInt7328;
			local74 = (int) ((long) local66 * arg0 / 320L);
			if (local66 > 0) {
				if (local74 == 0) {
					local74 = 1;
				} else if (local66 < local74) {
					local74 = local66;
				}
			} else if (local74 == 0) {
				local74 = -1;
			} else if (local66 > local74) {
				local74 = local66;
			}
			Static425.anInt7328 += local74;
		}
		Static429.aFloat132 += (float) arg0 * Static10.aFloat3 / 6.0F;
		if (local16 != Static349.anInt6137) {
			local66 = local16 - Static349.anInt6137;
			local74 = (int) (arg0 * (long) local66 / 320L);
			if (local66 <= 0) {
				if (local74 == 0) {
					local74 = -1;
				} else if (local66 > local74) {
					local74 = local66;
				}
			} else if (local74 == 0) {
				local74 = 1;
			} else if (local74 > local66) {
				local74 = local66;
			}
			Static349.anInt6137 += local74;
		}
		Static138.aFloat18 += Static149.aFloat23 * (float) arg0 / 6.0F;
		Static369.method5420();
	}
}
