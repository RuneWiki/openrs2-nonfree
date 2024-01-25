import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static442 {

	@OriginalMember(owner = "client!ps", name = "i", descriptor = "I")
	public static int anInt7929;

	@OriginalMember(owner = "client!ps", name = "k", descriptor = "Lclient!la;")
	public static Class196 aClass196_94;

	@OriginalMember(owner = "client!ps", name = "q", descriptor = "I")
	public static int anInt7936 = 0;

	@OriginalMember(owner = "client!ps", name = "s", descriptor = "Lclient!ov;")
	public static Class3_Sub42 aClass3_Sub42_1 = null;

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(ZZILjava/lang/String;Lclient!hga;)V")
	public static void method6898(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) String arg2, @OriginalArg(4) Class138 arg3) {
		if (!arg0) {
			Static541.method7919(arg3, 3, arg2);
			return;
		}
		@Pc(14) String local14;
		if (Static211.aString44.startsWith("win") && arg3.aBoolean276) {
			local14 = null;
			if (Static504.anApplet2 != null) {
				local14 = Static504.anApplet2.getParameter("haveie6");
			}
			if (local14 == null || !local14.equals("1")) {
				@Pc(32) Class304 local32 = Static541.method7919(arg3, 0, arg2);
				Static532.aClass304_8 = local32;
				Static365.aString76 = arg2;
				Static443.aClass138_3 = arg3;
				return;
			}
		}
		if (Static211.aString44.startsWith("mac")) {
			local14 = null;
			if (Static504.anApplet2 != null) {
				local14 = Static504.anApplet2.getParameter("havefirefox");
			}
			if (local14 != null && local14.equals("1") && arg1) {
				Static541.method7919(arg3, 1, arg2);
				return;
			}
		}
		Static541.method7919(arg3, 2, arg2);
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IB)V")
	public static void method6899(@OriginalArg(0) int arg0) {
		if (arg0 == 37) {
			Static110.aFloat80 = 3.0F;
		} else if (arg0 == 50) {
			Static110.aFloat80 = 4.0F;
		} else if (arg0 == 75) {
			Static110.aFloat80 = 6.0F;
		} else if (arg0 == 100) {
			Static110.aFloat80 = 8.0F;
		} else if (arg0 == 200) {
			Static110.aFloat80 = 16.0F;
		}
		Static632.anInt10105 = -1;
		Static632.anInt10105 = -1;
	}
}
