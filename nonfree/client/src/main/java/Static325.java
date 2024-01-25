import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static325 {

	@OriginalMember(owner = "client!up", name = "T", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_113 = new Class93("red:", "rot:", "rouge:", "vermelho:");

	@OriginalMember(owner = "client!up", name = "U", descriptor = "J")
	public static long aLong200 = -1L;

	@OriginalMember(owner = "client!up", name = "c", descriptor = "(II)I")
	public static int method5706(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(ZBLclient!rd;ZLjava/lang/String;)V")
	public static void method5707(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class168 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) String arg3) {
		if (!arg2) {
			Static257.method4677(arg3, arg1, 3);
			return;
		}
		@Pc(14) String local14;
		if (Static268.aString52.startsWith("win") && Static268.anInt5456 != 3) {
			local14 = null;
			if (arg1.anApplet1 != null) {
				local14 = arg1.anApplet1.getParameter("haveie6");
			}
			if (local14 == null || !local14.equals("1")) {
				@Pc(34) Class193 local34 = Static257.method4677(arg3, arg1, 0);
				Static163.aString16 = arg3;
				Static83.aClass193_1 = local34;
				Static310.aClass168_5 = arg1;
				return;
			}
		}
		if (Static268.aString52.startsWith("mac")) {
			local14 = null;
			if (arg1.anApplet1 != null) {
				local14 = arg1.anApplet1.getParameter("havefirefox");
			}
			if (local14 != null && local14.equals("1") && arg0) {
				Static257.method4677(arg3, arg1, 1);
				return;
			}
		}
		Static257.method4677(arg3, arg1, 2);
	}
}
