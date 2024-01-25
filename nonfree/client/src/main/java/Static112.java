import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!eca", name = "D", descriptor = "Lclient!dm;")
	public static Class78 aClass78_4 = null;

	@OriginalMember(owner = "client!eca", name = "G", descriptor = "Lclient!dm;")
	public static Class78 aClass78_5 = null;

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method1834(@OriginalArg(0) String arg0) {
		if (!Static129.aClass359_3.aBoolean729) {
			return -1;
		} else if (Static605.aHashtable7.containsKey(arg0)) {
			return 100;
		} else {
			@Pc(20) String local20 = Static224.method3811(arg0);
			if (local20 == null) {
				return -1;
			}
			@Pc(37) String local37 = Static362.aString62 + local20;
			if (!Static564.aClass97_121.method2543(local37, "")) {
				return -1;
			} else if (Static564.aClass97_121.method2562(local37)) {
				@Pc(61) byte[] local61 = Static564.aClass97_121.method2567("", local37);
				@Pc(67) File local67;
				try {
					local67 = Static154.method2916(local20);
				} catch (@Pc(69) RuntimeException local69) {
					return -1;
				}
				if (local61 == null || local67 == null) {
					return -1;
				}
				@Pc(77) boolean local77 = true;
				@Pc(81) byte[] local81 = Static501.method7130(local67);
				if (local81 != null && local61.length == local81.length) {
					for (@Pc(94) int local94 = 0; local94 < local81.length; local94++) {
						if (local81[local94] != local61[local94]) {
							local77 = false;
							break;
						}
					}
				} else {
					local77 = false;
				}
				try {
					if (!local77) {
						Static129.aClass359_3.method8264(local61, local67);
					}
				} catch (@Pc(122) Throwable local122) {
					return -1;
				}
				Static86.method1556(arg0, local67);
				return 100;
			} else {
				return Static564.aClass97_121.method2552(local37);
			}
		}
	}
}
