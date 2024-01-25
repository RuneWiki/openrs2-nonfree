import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static533 {

	@OriginalMember(owner = "client!sb", name = "E", descriptor = "[I")
	public static int[] anIntArray479;

	@OriginalMember(owner = "client!sb", name = "F", descriptor = "I")
	public static int anInt9351;

	@OriginalMember(owner = "client!sb", name = "N", descriptor = "[Lclient!mq;")
	public static Class71[] aClass71Array36;

	@OriginalMember(owner = "client!sb", name = "Q", descriptor = "I")
	public static int anInt9359;

	@OriginalMember(owner = "client!sb", name = "H", descriptor = "Z")
	public static boolean aBoolean679 = false;

	@OriginalMember(owner = "client!sb", name = "I", descriptor = "I")
	public static int anInt9353 = 0;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method8249(@OriginalArg(1) String arg0) {
		if (!Static31.aClass48_1.aBoolean75) {
			return -1;
		} else if (Static48.aHashtable1.containsKey(arg0)) {
			return 100;
		} else {
			@Pc(20) String local20 = Static645.method8764(arg0);
			if (local20 == null) {
				return -1;
			}
			@Pc(33) String local33 = Static238.aString58 + local20;
			if (!Static628.aClass124_127.method3624(local33, "")) {
				return -1;
			} else if (Static628.aClass124_127.method3612(local33)) {
				@Pc(57) byte[] local57 = Static628.aClass124_127.method3639("", local33);
				@Pc(68) File local68;
				try {
					local68 = Static442.method7165(local20);
				} catch (@Pc(70) RuntimeException local70) {
					return -1;
				}
				if (local57 == null || local68 == null) {
					return -1;
				}
				@Pc(78) boolean local78 = true;
				@Pc(82) byte[] local82 = Static79.method1394(local68);
				if (local82 != null && local82.length == local57.length) {
					for (@Pc(95) int local95 = 0; local95 < local82.length; local95++) {
						if (local57[local95] != local82[local95]) {
							local78 = false;
							break;
						}
					}
				} else {
					local78 = false;
				}
				try {
					if (!local78) {
						Static31.aClass48_1.method1319(local68, local57);
					}
				} catch (@Pc(131) Throwable local131) {
					return -1;
				}
				Static223.method4118(local68, arg0);
				return 100;
			} else {
				return Static628.aClass124_127.method3642(local33);
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIIIIB)J")
	public static long method8252(@OriginalArg(2) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2) {
		Static550.aCalendar1.clear();
		Static550.aCalendar1.set(arg2, arg1, arg0, 12, 0, 0);
		return Static550.aCalendar1.getTime().getTime();
	}
}
