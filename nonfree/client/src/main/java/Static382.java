import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static382 {

	@OriginalMember(owner = "client!nl", name = "h", descriptor = "I")
	public static int anInt6844;

	@OriginalMember(owner = "client!nl", name = "j", descriptor = "I")
	public static int anInt6846;

	@OriginalMember(owner = "client!nl", name = "m", descriptor = "[I")
	public static int[] anIntArray457 = new int[2];

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILjava/lang/String;Lclient!vk;ZZ)V")
	public static void method5748(@OriginalArg(1) String arg0, @OriginalArg(2) Class359 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		if (!arg3) {
			Static607.method8296(arg1, 3, arg0);
			return;
		}
		@Pc(30) String local30;
		if (Static604.aString98.startsWith("win") && arg1.aBoolean729) {
			local30 = null;
			if (Static234.anApplet2 != null) {
				local30 = Static234.anApplet2.getParameter("haveie6");
			}
			if (local30 == null || !local30.equals("1")) {
				@Pc(50) Class26 local50 = Static607.method8296(arg1, 0, arg0);
				Static440.aClass359_5 = arg1;
				Static531.aString81 = arg0;
				Static642.aClass26_39 = local50;
				return;
			}
		}
		if (Static604.aString98.startsWith("mac")) {
			local30 = null;
			if (Static234.anApplet2 != null) {
				local30 = Static234.anApplet2.getParameter("havefirefox");
			}
			if (local30 != null && local30.equals("1") && arg2) {
				Static607.method8296(arg1, 1, arg0);
				return;
			}
		}
		Static607.method8296(arg1, 2, arg0);
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIB)Z")
	public static boolean method5749(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static491.method7021(arg1, arg0) | (arg1 & 0x70000) != 0 || Static395.method2908(arg0, arg1);
	}
}
