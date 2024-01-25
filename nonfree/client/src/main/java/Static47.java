import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!da", name = "b", descriptor = "Lclient!h;")
	public static Class90 aClass90_2;

	@OriginalMember(owner = "client!da", name = "d", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!da", name = "h", descriptor = "I")
	public static int anInt1207;

	@OriginalMember(owner = "client!da", name = "c", descriptor = "I")
	public static int anInt1203 = -1;

	@OriginalMember(owner = "client!da", name = "g", descriptor = "I")
	public static int anInt1206 = 0;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
	public static void method939() {
		Static25.aClass37_11.method914();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method941(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub2_Sub15 local8 = Static17.method307(3, arg1);
		local8.method4783();
		local8.aString211 = arg0;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!wd;ZLjava/lang/String;ZB)V")
	public static void method942(@OriginalArg(0) Class215 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(3) boolean arg3) {
		if (!arg3) {
			Static63.method2280(arg0, arg2, 3);
			return;
		}
		@Pc(22) String local22;
		if (Static343.aString266.startsWith("win") && Static343.anInt6573 != 3) {
			local22 = null;
			if (arg0.anApplet1 != null) {
				local22 = arg0.anApplet1.getParameter("haveie6");
			}
			if (local22 == null || !local22.equals("1")) {
				@Pc(42) Class193 local42 = Static63.method2280(arg0, arg2, 0);
				Static266.aString213 = arg2;
				Static54.aClass193_2 = local42;
				Static54.aClass215_2 = arg0;
				return;
			}
		}
		if (Static343.aString266.startsWith("mac")) {
			local22 = null;
			if (arg0.anApplet1 != null) {
				local22 = arg0.anApplet1.getParameter("havefirefox");
			}
			if (local22 != null && local22.equals("1") && arg1) {
				Static63.method2280(arg0, arg2, 1);
				return;
			}
		}
		Static63.method2280(arg0, arg2, 2);
	}
}
