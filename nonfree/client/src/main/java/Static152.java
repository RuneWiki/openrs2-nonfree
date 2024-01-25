import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!fr", name = "J", descriptor = "[J")
	public static long[] aLongArray3;

	@OriginalMember(owner = "client!fr", name = "h", descriptor = "(I)[Lclient!qv;")
	public static Class271[] method2946() {
		return new Class271[] { Static125.aClass271_2, Static511.aClass271_9, Static260.aClass271_5, Static47.aClass271_1, Static508.aClass271_8, Static249.aClass271_4, Static502.aClass271_7, Static451.aClass271_6, Static224.aClass271_3 };
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(B)V")
	public static void method2947() {
		if (Static186.aClass123_6 != Static79.aClass123_16) {
			try {
				Static590.method5698("tbrefresh", Static363.aClient1);
			} catch (@Pc(19) Throwable local19) {
			}
		}
	}
}
