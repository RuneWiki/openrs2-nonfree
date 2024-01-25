import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "Lclient!dh;")
	public static Class71 aClass71_1;

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "Z")
	public static boolean aBoolean26 = false;

	@OriginalMember(owner = "client!aq", name = "d", descriptor = "[Lclient!cu;")
	public static final Class61[] aClass61Array1 = new Class61[6];

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method241(@OriginalArg(1) String arg0) {
		if (!Static233.aClass109_12.aBoolean206) {
			return -1;
		} else if (Static393.aHashtable6.containsKey(arg0)) {
			return 100;
		} else {
			@Pc(20) String local20 = Static121.method1905(arg0);
			if (local20 == null) {
				return -1;
			}
			@Pc(33) String local33 = Static456.aString75 + local20;
			if (!Static278.aClass270_71.method5675("", local33)) {
				return -1;
			} else if (Static278.aClass270_71.method5698(local33)) {
				@Pc(65) byte[] local65 = Static278.aClass270_71.method5706("", local33);
				@Pc(71) File local71;
				try {
					local71 = Static178.method2521(local20);
				} catch (@Pc(73) RuntimeException local73) {
					return -1;
				}
				if (local65 == null || local71 == null) {
					return -1;
				}
				@Pc(81) boolean local81 = true;
				@Pc(85) byte[] local85 = Static579.method7404(local71);
				if (local85 != null && local65.length == local85.length) {
					for (@Pc(94) int local94 = 0; local94 < local85.length; local94++) {
						if (local65[local94] != local85[local94]) {
							local81 = false;
							break;
						}
					}
				} else {
					local81 = false;
				}
				try {
					if (!local81) {
						Static233.aClass109_12.method2176(local65, local71);
					}
				} catch (@Pc(130) Throwable local130) {
					return -1;
				}
				Static217.method3358(arg0, local71);
				return 100;
			} else {
				return Static278.aClass270_71.method5693(local33);
			}
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(II)I")
	public static int method242(@OriginalArg(0) int arg0) {
		if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
			return 6407;
		} else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
			return 6408;
		} else if (arg0 == 6406 || arg0 == 34844) {
			return 6406;
		} else if (arg0 == 6409 || arg0 == 34846) {
			return 6409;
		} else if (arg0 == 6410 || arg0 == 34847) {
			return 6410;
		} else if (arg0 == 6402) {
			return 6402;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
