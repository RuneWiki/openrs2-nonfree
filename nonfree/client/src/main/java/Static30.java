import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static30 {

	@OriginalMember(owner = "client!bb", name = "y", descriptor = "[I")
	public static final int[] anIntArray73 = new int[32];

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(BZ)V")
	public static void method551(@OriginalArg(1) boolean arg0) {
		if (Static6.aString2.length() == 0) {
			return;
		}
		Static369.method5492("--> " + Static6.aString2);
		Static456.method6797(arg0, Static6.aString2, false);
		Static186.anInt3605 = 0;
		Static6.aString2 = "";
		Static93.anInt2298 = 0;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)[Lclient!kj;")
	public static Class187[] method557() {
		return new Class187[] { Static349.aClass187_12, Static81.aClass187_3, Static280.aClass187_10, Static343.aClass187_11, Static100.aClass187_6, Static83.aClass187_5, Static226.aClass187_7, Static7.aClass187_1, Static83.aClass187_4, Static363.aClass187_13, Static562.aClass187_17, Static396.aClass187_15, Static373.aClass187_14, Static394.aClass187_16, Static35.aClass187_2 };
	}
}
