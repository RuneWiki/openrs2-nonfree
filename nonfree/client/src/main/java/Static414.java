import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static414 {

	@OriginalMember(owner = "client!oc", name = "h", descriptor = "[I")
	public static int[] anIntArray417;

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "[Lclient!aba;")
	public static Class4_Sub1_Sub1[] aClass4_Sub1_Sub1Array1;

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "Lclient!da;")
	public static Class70 aClass70_6;

	@OriginalMember(owner = "client!oc", name = "j", descriptor = "Z")
	public static boolean aBoolean464 = false;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_134 = new Class156(24, 1);

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_135 = new Class156(29, -1);

	@OriginalMember(owner = "client!oc", name = "i", descriptor = "Z")
	public static boolean aBoolean465 = false;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(FFFB)I")
	public static int method6093(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(23) float local23 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(33) float local33 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(43) float local43 = arg1 < 0.0F ? -arg1 : arg1;
		if (local33 > local23 && local43 < local33) {
			return arg0 > 0.0F ? 0 : 1;
		} else if (local43 > local23 && local43 > local33) {
			return arg1 > 0.0F ? 2 : 3;
		} else if (arg2 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIIIII)Z")
	public static boolean method6095(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15 = arg0 + arg3;
		@Pc(19) int local19 = arg2 + arg5;
		@Pc(23) int local23 = arg1 + arg4;
		if (!Static542.method7427(local15, arg0, arg0, local23, local23, local19, local19, arg4, local19)) {
			return false;
		} else if (Static542.method7427(local15, arg0, local15, local23, arg4, local19, local19, arg4, local19)) {
			if (Static57.anInt1010 <= arg0) {
				if (!Static542.method7427(local15, local15, local15, local23, arg4, arg2, local19, local23, local19)) {
					return false;
				}
				if (!Static542.method7427(local15, local15, local15, arg4, arg4, arg2, local19, local23, arg2)) {
					return false;
				}
			} else if (!Static542.method7427(arg0, arg0, arg0, local23, arg4, arg2, local19, local23, local19)) {
				return false;
			} else if (!Static542.method7427(arg0, arg0, arg0, arg4, arg4, arg2, local19, local23, arg2)) {
				return false;
			}
			if (arg4 >= Static17.anInt229) {
				if (!Static542.method7427(local15, arg0, arg0, local23, local23, arg2, local19, local23, local19)) {
					return false;
				}
				if (!Static542.method7427(local15, arg0, local15, local23, local23, arg2, local19, local23, arg2)) {
					return false;
				}
			} else if (!Static542.method7427(local15, arg0, arg0, arg4, arg4, arg2, local19, arg4, local19)) {
				return false;
			} else if (!Static542.method7427(local15, arg0, local15, arg4, arg4, arg2, local19, arg4, arg2)) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(III)Z")
	public static boolean method6096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
