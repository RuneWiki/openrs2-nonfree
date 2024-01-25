import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!nl", name = "e", descriptor = "Lclient!vv;")
	public static Class307 aClass307_5;

	@OriginalMember(owner = "client!nl", name = "j", descriptor = "[[B")
	public static byte[][] aByteArrayArray16;

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Ljava/lang/String;ZZZLclient!gaa;)V")
	public static void method5019(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Class102 arg3) {
		if (!arg2) {
			Static248.method1989(arg3, 3, arg0);
			return;
		}
		@Pc(20) String local20;
		if (Static151.aString31.startsWith("win") && Static151.anInt2788 != 3) {
			local20 = null;
			if (arg3.anApplet1 != null) {
				local20 = arg3.anApplet1.getParameter("haveie6");
			}
			if (local20 == null || !local20.equals("1")) {
				@Pc(40) Class157 local40 = Static248.method1989(arg3, 0, arg0);
				Static5.aClass102_1 = arg3;
				Static207.aString39 = arg0;
				Static176.aClass157_6 = local40;
				return;
			}
		}
		if (Static151.aString31.startsWith("mac")) {
			local20 = null;
			if (arg3.anApplet1 != null) {
				local20 = arg3.anApplet1.getParameter("havefirefox");
			}
			if (local20 != null && local20.equals("1") && arg1) {
				Static248.method1989(arg3, 1, arg0);
				return;
			}
		}
		Static248.method1989(arg3, 2, arg0);
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method5022(@OriginalArg(0) String arg0) {
		Static363.method5419(arg0, 0, "", 0, "");
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(I)V")
	public static void method5028() {
		Static16.anInt415 = 0;
		Static248.aClass37_30.method967();
		Static248.aClass37_30.method970(Static91.aClass1_Sub24_2);
		Static16.anInt415++;
	}
}
