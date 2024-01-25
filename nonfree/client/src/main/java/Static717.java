import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static717 {

	@OriginalMember(owner = "client!wla", name = "E", descriptor = "Lclient!jm;")
	public static Class199_Sub1 aClass199_Sub1_2;

	@OriginalMember(owner = "client!wla", name = "N", descriptor = "Lclient!os;")
	public static final Class281 aClass281_18 = new Class281(8, 7);

	@OriginalMember(owner = "client!wla", name = "K", descriptor = "I")
	public static int anInt10936 = -1;

	@OriginalMember(owner = "client!wla", name = "f", descriptor = "(I)V")
	public static void method9541() {
		Static359.aBoolean487 = false;
		Static668.method9110(-121);
	}

	@OriginalMember(owner = "client!wla", name = "b", descriptor = "(III)I")
	public static int method9542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 >>> 24;
		@Pc(11) int local11 = 255 - local7;
		@Pc(36) int local36 = ((arg1 & 0xFF00) * local7 & 0xFF0000 | (arg1 & 0xFF00FF) * local7 & 0xFF00FF00) >>> 8;
		return ((local11 * (arg0 & 0xFF00) & 0xFF0000 | local11 * (arg0 & 0xFF00FF) & 0xFF00FF00) >>> 8) + local36;
	}

	@OriginalMember(owner = "client!wla", name = "a", descriptor = "(IZ)Z")
	public static boolean method9543(@OriginalArg(1) boolean arg0) {
		@Pc(13) boolean local13 = Static396.aClass145_6.method9632();
		if (local13 == arg0) {
			return true;
		}
		if (!arg0) {
			Static396.aClass145_6.method9673();
		} else if (!Static396.aClass145_6.method9650()) {
			arg0 = false;
		}
		if (local13 == arg0) {
			return false;
		} else {
			Static650.aClass2_Sub30_29.method2988(arg0 ? 1 : 0, Static650.aClass2_Sub30_29.aClass11_Sub23_1);
			Static610.method9380();
			return true;
		}
	}

	@OriginalMember(owner = "client!wla", name = "c", descriptor = "(III)I")
	public static int method9544(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) byte local12;
		if (arg0 > 20000) {
			Static302.method4224();
			local12 = 4;
		} else if (arg0 > 10000) {
			Static46.method598();
			local12 = 3;
		} else if (arg0 <= 5000) {
			Static299.method4190();
			local12 = 1;
		} else {
			Static441.method6385();
			local12 = 2;
		}
		if (arg1 != Static650.aClass2_Sub30_29.aClass11_Sub20_2.method4863()) {
			Static650.aClass2_Sub30_29.method2988(arg1, Static650.aClass2_Sub30_29.aClass11_Sub20_1);
			Static213.method2982(false, arg1);
		}
		Static610.method9380();
		return local12;
	}
}
