import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!co", name = "W", descriptor = "Ljava/lang/String;")
	public static String aString44;

	@OriginalMember(owner = "client!co", name = "gb", descriptor = "I")
	public static int anInt1146;

	@OriginalMember(owner = "client!co", name = "S", descriptor = "Z")
	public static boolean aBoolean80 = false;

	@OriginalMember(owner = "client!co", name = "T", descriptor = "I")
	public static int anInt1136 = 0;

	@OriginalMember(owner = "client!co", name = "Y", descriptor = "Lclient!ne;")
	public static Class146 aClass146_10 = null;

	@OriginalMember(owner = "client!co", name = "g", descriptor = "(I)V")
	public static void method1109() {
		Static297.aClipboard1 = null;
		Static9.anIntArray11 = null;
		Static174.aBoolean233 = false;
		Static174.aBooleanArray15 = null;
		Static83.anIntArray618 = null;
		Static220.anIntArray394 = null;
		Static7.method206();
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(BILclient!mo;)Lclient!po;")
	public static Class14_Sub24 method1110(@OriginalArg(1) int arg0, @OriginalArg(2) Class143 arg1) {
		@Pc(8) byte[] local8 = arg1.method3750(arg0);
		return local8 == null ? null : new Class14_Sub24(local8);
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIIIII)V")
	public static void method1111(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 >= Static6.anInt136 && Static275.anInt5244 >= arg0 && Static32.anInt750 <= arg3 && Static112.anInt2485 >= arg2) {
			if (arg5 == 1) {
				Static178.method3463(arg0, arg2, arg3, arg4, arg1);
			} else {
				Static303.method5988(arg2, arg1, arg0, arg3, arg5, arg4);
			}
		} else if (arg5 == 1) {
			Static195.method3673(arg4, arg3, arg2, arg0, arg1);
		} else {
			Static137.method2758(arg5, arg2, arg3, arg0, arg4, arg1);
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IZ)V")
	public static void method1113(@OriginalArg(1) boolean arg0) {
		if (arg0 != Static270.aBoolean345) {
			Static270.aBoolean345 = arg0;
			Static343.method5858();
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(ZLclient!jg;)Lclient!fj;")
	public static Class37_Sub2 method1114(@OriginalArg(1) Class14_Sub4 arg0) {
		return new Class37_Sub2(arg0.method2502(), arg0.method2502(), arg0.method2502(), arg0.method2502(), arg0.method2501(), arg0.method2548());
	}
}
