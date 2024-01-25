import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_92 = new Class296(75, -1);

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method1713(@OriginalArg(0) String arg0) {
		if (Static151.anInt2788 == 3) {
			return -1;
		} else if (Static341.aHashtable5.containsKey(arg0)) {
			return 100;
		} else {
			@Pc(29) String local29 = Static297.method4736(arg0);
			if (local29 == null) {
				return -1;
			}
			@Pc(42) String local42 = Static132.aString22 + local29;
			if (!Static371.aClass171_111.method4358(local42, "")) {
				return -1;
			} else if (Static371.aClass171_111.method4357(local42)) {
				@Pc(66) byte[] local66 = Static371.aClass171_111.method4330("", local42);
				@Pc(71) File local71 = Static173.aClass102_3.method2402(local29);
				if (local66 == null || local71 == null) {
					return -1;
				}
				@Pc(77) boolean local77 = true;
				@Pc(81) byte[] local81 = Static142.method2304(local71);
				if (local81 != null && local66.length == local81.length) {
					for (@Pc(98) int local98 = 0; local98 < local81.length; local98++) {
						if (local81[local98] != local66[local98]) {
							local77 = false;
							break;
						}
					}
				} else {
					local77 = false;
				}
				try {
					if (!local77) {
						Static173.aClass102_3.method2394(local71, local66);
					}
				} catch (@Pc(126) Throwable local126) {
					return -1;
				}
				Static194.method2971(arg0, local71);
				return 100;
			} else {
				return Static371.aClass171_111.method4329(local42);
			}
		}
	}
}
