import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static437 {

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray46 = new String[100];

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method6666(@OriginalArg(1) String arg0) {
		if (!Static206.aClass246_3.aBoolean534) {
			return -1;
		} else if (Static116.aHashtable2.containsKey(arg0)) {
			return 100;
		} else {
			@Pc(20) String local20 = Static384.method6057(arg0);
			if (local20 == null) {
				return -1;
			}
			@Pc(33) String local33 = Static256.aString60 + local20;
			if (!Static475.aClass168_108.method4440(local33, "")) {
				return -1;
			} else if (Static475.aClass168_108.method4437(local33)) {
				@Pc(59) byte[] local59 = Static475.aClass168_108.method4450("", local33);
				@Pc(63) File local63 = Static563.method7982(local20);
				if (local59 == null || local63 == null) {
					return -1;
				}
				@Pc(69) boolean local69 = true;
				@Pc(73) byte[] local73 = Static396.method6258(local63);
				if (local73 != null && local73.length == local59.length) {
					for (@Pc(82) int local82 = 0; local82 < local73.length; local82++) {
						if (local59[local82] != local73[local82]) {
							local69 = false;
							break;
						}
					}
				} else {
					local69 = false;
				}
				try {
					if (!local69) {
						Static206.aClass246_3.method6128(local59, local63);
					}
				} catch (@Pc(118) Throwable local118) {
					return -1;
				}
				Static63.method1338(local63, arg0);
				return 100;
			} else {
				return Static475.aClass168_108.method4457(local33);
			}
		}
	}
}
