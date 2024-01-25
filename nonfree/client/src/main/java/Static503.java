import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static503 {

	@OriginalMember(owner = "client!tda", name = "r", descriptor = "F")
	public static float aFloat176;

	@OriginalMember(owner = "client!tda", name = "s", descriptor = "[Lclient!f;")
	public static Class46[] aClass46Array14;

	@OriginalMember(owner = "client!tda", name = "t", descriptor = "I")
	public static int anInt8031 = 0;

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method6788(@OriginalArg(0) String arg0) {
		if (!Static419.aClass221_11.aBoolean485) {
			return -1;
		} else if (Static155.aHashtable2.containsKey(arg0)) {
			return 100;
		} else {
			@Pc(20) String local20 = Static338.method5167(arg0);
			if (local20 == null) {
				return -1;
			}
			@Pc(33) String local33 = Static405.aString99 + local20;
			if (!Static281.aClass246_130.method5655("", local33)) {
				return -1;
			} else if (Static281.aClass246_130.method5669(local33)) {
				@Pc(59) byte[] local59 = Static281.aClass246_130.method5648(local33, "");
				@Pc(70) File local70;
				try {
					local70 = Static399.method5830(local20);
				} catch (@Pc(72) RuntimeException local72) {
					return -1;
				}
				if (local59 == null || local70 == null) {
					return -1;
				}
				@Pc(80) boolean local80 = true;
				@Pc(84) byte[] local84 = Static504.method6789(local70);
				if (local84 != null && local84.length == local59.length) {
					for (@Pc(97) int local97 = 0; local97 < local84.length; local97++) {
						if (local84[local97] != local59[local97]) {
							local80 = false;
							break;
						}
					}
				} else {
					local80 = false;
				}
				try {
					if (!local80) {
						Static419.aClass221_11.method5190(local59, local70);
					}
				} catch (@Pc(133) Throwable local133) {
					return -1;
				}
				Static161.method2879(local70, arg0);
				return 100;
			} else {
				return Static281.aClass246_130.method5664(local33);
			}
		}
	}
}
