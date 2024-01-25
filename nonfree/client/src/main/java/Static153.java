import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!jm", name = "A", descriptor = "[Lclient!l;")
	public static Class57[] aClass57Array10;

	@OriginalMember(owner = "client!jm", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString113 = "Face here";

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method2462(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(20) String local20 = Static179.method2989(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(25) int local25 = 0; local25 < Static277.anInt5542; local25++) {
			@Pc(33) String local33 = Static179.method2989(Static152.aStringArray21[local25]);
			if (local33 != null && local33.equals(local20)) {
				Static277.anInt5542--;
				for (@Pc(45) int local45 = local25; local45 < Static277.anInt5542; local45++) {
					Static152.aStringArray21[local45] = Static152.aStringArray21[local45 + 1];
					Static350.aStringArray43[local45] = Static350.aStringArray43[local45 + 1];
					Static253.aStringArray31[local45] = Static253.aStringArray31[local45 + 1];
					Static223.aStringArray25[local45] = Static223.aStringArray25[local45 + 1];
					Static312.aBooleanArray29[local45] = Static312.aBooleanArray29[local45 + 1];
				}
				Static294.anInt6362 = Static293.anInt6247;
				Static291.aClass3_Sub4_Sub2_3.method3682(168);
				Static291.aClass3_Sub4_Sub2_3.method3614(Static54.method909(arg0));
				Static291.aClass3_Sub4_Sub2_3.method3624(arg0);
				return;
			}
		}
	}
}
