import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!eba", name = "m", descriptor = "Lclient!hw;")
	public static Class151 aClass151_3;

	@OriginalMember(owner = "client!eba", name = "o", descriptor = "Z")
	public static boolean aBoolean126 = true;

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(IIFI[BLclient!nh;IIFFFFB)V")
	public static void method1847(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) Class71 arg3, @OriginalArg(8) float arg4, @OriginalArg(9) float arg5, @OriginalArg(10) float arg6, @OriginalArg(11) float arg7) {
		for (@Pc(8) int local8 = 0; local8 < 16; local8++) {
			Static459.method6810(arg6, arg0, arg5, arg4, local8, arg3, arg7, arg2, arg1);
			arg0 += 16384;
		}
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(I)[Lclient!oe;")
	public static Class249[] method1848() {
		return new Class249[] { Static555.aClass249_13, Static134.aClass249_5, Static640.aClass249_15 };
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(ZB)Z")
	public static boolean method1849(@OriginalArg(0) boolean arg0) {
		@Pc(11) boolean local11 = Static546.aClass132_13.method7466();
		if (local11 == arg0) {
			return true;
		}
		if (!arg0) {
			Static546.aClass132_13.method7442();
		} else if (!Static546.aClass132_13.method7500()) {
			arg0 = false;
		}
		if (arg0 == local11) {
			return false;
		} else {
			Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub26_1, arg0 ? 1 : 0);
			Static633.method8698();
			return true;
		}
	}
}
