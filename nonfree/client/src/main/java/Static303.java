import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!lj", name = "J", descriptor = "Lclient!sb;")
	public static final Class298 aClass298_112 = new Class298(29, 7);

	@OriginalMember(owner = "client!lj", name = "P", descriptor = "Lclient!ab;")
	public static final Class3_Sub2 aClass3_Sub2_1 = new Class3_Sub2(0, 0);

	@OriginalMember(owner = "client!lj", name = "h", descriptor = "(I)V")
	public static void method4766(@OriginalArg(0) int arg0) {
		Static137.anInt2940 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static411.anInt6927; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static157.anInt3168; local6++) {
				if (Static554.aClass63ArrayArrayArray4[arg0][local3][local6] == null) {
					Static554.aClass63ArrayArrayArray4[arg0][local3][local6] = new Class63(arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Ljava/lang/String;ZILclient!n;Z)V")
	public static void method4768(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class221 arg2, @OriginalArg(4) boolean arg3) {
		if (!arg3) {
			Static563.method7493(arg2, arg0, 3);
			return;
		}
		@Pc(23) String local23;
		if (Static342.aString82.startsWith("win") && arg2.aBoolean485) {
			local23 = null;
			if (Static533.anApplet4 != null) {
				local23 = Static533.anApplet4.getParameter("haveie6");
			}
			if (local23 == null || !local23.equals("1")) {
				@Pc(41) Class192 local41 = Static563.method7493(arg2, arg0, 0);
				Static41.aString20 = arg0;
				Static23.aClass221_3 = arg2;
				Static123.aClass192_2 = local41;
				return;
			}
		}
		if (Static342.aString82.startsWith("mac")) {
			local23 = null;
			if (Static533.anApplet4 != null) {
				local23 = Static533.anApplet4.getParameter("havefirefox");
			}
			if (local23 != null && local23.equals("1") && arg1) {
				Static563.method7493(arg2, arg0, 1);
				return;
			}
		}
		Static563.method7493(arg2, arg0, 2);
	}
}
