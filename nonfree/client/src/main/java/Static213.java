import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!ij", name = "i", descriptor = "Lclient!uo;")
	public static Class320 aClass320_2;

	@OriginalMember(owner = "client!ij", name = "f", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_11 = new Class40(49, -2);

	@OriginalMember(owner = "client!ij", name = "h", descriptor = "I")
	public static int anInt472 = 0;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method392(@OriginalArg(0) String arg0) {
		if (!Static426.aClass57_6.aBoolean74) {
			return -1;
		} else if (Static144.aHashtable2.containsKey(arg0)) {
			return 100;
		} else {
			@Pc(20) String local20 = Static546.method7522(arg0);
			if (local20 == null) {
				return -1;
			}
			@Pc(41) String local41 = Static109.aString117 + local20;
			if (!Static193.aClass251_63.method5837("", local41)) {
				return -1;
			} else if (Static193.aClass251_63.method5856(local41)) {
				@Pc(65) byte[] local65 = Static193.aClass251_63.method5836(local41, "");
				@Pc(69) File local69 = Static81.method1307(local20);
				if (local65 == null || local69 == null) {
					return -1;
				}
				@Pc(75) boolean local75 = true;
				@Pc(79) byte[] local79 = Static508.method7019(local69);
				if (local79 != null && local79.length == local65.length) {
					for (@Pc(88) int local88 = 0; local88 < local79.length; local88++) {
						if (local65[local88] != local79[local88]) {
							local75 = false;
							break;
						}
					}
				} else {
					local75 = false;
				}
				try {
					if (!local75) {
						Static426.aClass57_6.method922(local65, local69);
					}
				} catch (@Pc(128) Throwable local128) {
					return -1;
				}
				Static197.method2981(arg0, local69);
				return 100;
			} else {
				return Static193.aClass251_63.method5846(local41);
			}
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IBIIIII)V")
	public static void method394(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static45.anInt746 = arg2;
		Static329.anInt5899 = arg3;
		Static52.anInt867 = arg0;
		Static2.anInt39 = arg4;
		Static67.anInt1138 = arg5;
		Static446.anInt7749 = arg1;
	}
}
