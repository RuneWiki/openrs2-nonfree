import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
	public static int anInt1411;

	@OriginalMember(owner = "client!fa", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString40 = "Connected to update server";

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!ak;B)V")
	public static void method1172(@OriginalArg(0) Class7 arg0) {
		Static88.aClass7_83 = arg0;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIII)V")
	public static void method1173(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= Static245.anInt1237 && Static28.anInt606 >= arg1) {
			@Pc(31) int local31 = Static45.method818(Static284.anInt5643, Static24.anInt556, arg2);
			@Pc(37) int local37 = Static45.method818(Static284.anInt5643, Static24.anInt556, arg3);
			Static48.method844(arg1, local31, local37, arg0);
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!og;B)Lclient!og;")
	public static Class127 method1175(@OriginalArg(0) Class127 arg0) {
		@Pc(11) Class127 local11 = Static43.method797(arg0);
		if (local11 == null) {
			local11 = arg0.aClass127_10;
		}
		return local11;
	}
}
