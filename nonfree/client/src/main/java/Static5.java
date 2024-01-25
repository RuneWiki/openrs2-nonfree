import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_2 = new Class98(42, -2);

	@OriginalMember(owner = "client!aca", name = "f", descriptor = "I")
	public static int anInt70 = -1;

	@OriginalMember(owner = "client!aca", name = "n", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_3 = new Class98(71, 12);

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method78(@OriginalArg(0) String arg0) {
		if (!Static232.aClass313_49.aBoolean569) {
			return -1;
		} else if (Static497.aHashtable6.containsKey(arg0)) {
			return 100;
		} else {
			@Pc(20) String local20 = Static235.method3656(arg0);
			if (local20 == null) {
				return -1;
			}
			@Pc(33) String local33 = Static307.aString47 + local20;
			if (!Static370.aClass248_64.method5800(local33, "")) {
				return -1;
			} else if (Static370.aClass248_64.method5803(local33)) {
				@Pc(57) byte[] local57 = Static370.aClass248_64.method5794("", local33);
				@Pc(61) File local61 = Static159.method2473(local20);
				if (local57 == null || local61 == null) {
					return -1;
				}
				@Pc(67) boolean local67 = true;
				@Pc(71) byte[] local71 = Static197.method3311(local61);
				if (local71 != null && local71.length == local57.length) {
					for (@Pc(84) int local84 = 0; local84 < local71.length; local84++) {
						if (local57[local84] != local71[local84]) {
							local67 = false;
							break;
						}
					}
				} else {
					local67 = false;
				}
				try {
					if (!local67) {
						Static232.aClass313_49.method6993(local57, local61);
					}
				} catch (@Pc(116) Throwable local116) {
					return -1;
				}
				Static510.method7003(local61, arg0);
				return 100;
			} else {
				return Static370.aClass248_64.method5780(local33);
			}
		}
	}
}
