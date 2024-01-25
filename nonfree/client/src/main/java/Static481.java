import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static481 {

	@OriginalMember(owner = "client!uaa", name = "A", descriptor = "I")
	public static int anInt8656;

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "Lclient!kca;")
	public static final Class158 aClass158_115 = new Class158(7, 3);

	@OriginalMember(owner = "client!uaa", name = "c", descriptor = "F")
	public static float aFloat254 = 0.0F;

	@OriginalMember(owner = "client!uaa", name = "d", descriptor = "Z")
	public static boolean aBoolean638 = false;

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method7118(@OriginalArg(0) String arg0) {
		if (!Static403.aClass285_12.aBoolean625) {
			return -1;
		} else if (Static471.aHashtable6.containsKey(arg0)) {
			return 100;
		} else {
			@Pc(28) String local28 = Static359.method5617(arg0);
			if (local28 == null) {
				return -1;
			}
			@Pc(41) String local41 = Static256.aString39 + local28;
			if (!Static333.aClass161_67.method4245(local41, "")) {
				return -1;
			} else if (Static333.aClass161_67.method4246(local41)) {
				@Pc(65) byte[] local65 = Static333.aClass161_67.method4238("", local41);
				@Pc(69) File local69 = Static452.method6824(local28);
				if (local65 == null || local69 == null) {
					return -1;
				}
				@Pc(75) boolean local75 = true;
				@Pc(79) byte[] local79 = Static372.method5858(local69);
				if (local79 != null && local65.length == local79.length) {
					for (@Pc(92) int local92 = 0; local92 < local79.length; local92++) {
						if (local79[local92] != local65[local92]) {
							local75 = false;
							break;
						}
					}
				} else {
					local75 = false;
				}
				try {
					if (!local75) {
						Static403.aClass285_12.method7032(local65, local69);
					}
				} catch (@Pc(132) Throwable local132) {
					return -1;
				}
				Static240.method4199(local69, arg0);
				return 100;
			} else {
				return Static333.aClass161_67.method4267(local41);
			}
		}
	}
}
