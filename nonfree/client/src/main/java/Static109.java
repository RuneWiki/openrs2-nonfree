import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_89 = new Class123(101, 2);

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
	public static void method2201() {
		if (Static319.aClass31_11.method8037()) {
			Static319.aClass31_11.method8060(Static129.aCanvas6);
			Static131.method2563();
			Static319.aClass31_11.method8019(Static129.aCanvas6);
			Static319.aClass31_11.method8076(Static129.aCanvas6);
		} else {
			Static47.method1180(Static37.anInt1122);
		}
		Static246.method3899();
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)Lclient!ba;")
	public static Class3_Sub7_Sub1 method2205() {
		return Static157.aClass3_Sub7_Sub1_3;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method2206(@OriginalArg(0) String arg0) {
		if (!Static216.aClass168_5.aBoolean334) {
			return -1;
		} else if (Static94.aHashtable3.containsKey(arg0)) {
			return 100;
		} else {
			@Pc(22) String local22 = Static13.method120(arg0);
			if (local22 == null) {
				return -1;
			}
			@Pc(35) String local35 = Static550.aString250 + local22;
			if (!Static463.aClass284_128.method6356(local35, "")) {
				return -1;
			} else if (Static463.aClass284_128.method6352(local35)) {
				@Pc(66) byte[] local66 = Static463.aClass284_128.method6328(local35, "");
				@Pc(74) File local74;
				try {
					local74 = Static398.method5598(local22);
				} catch (@Pc(76) RuntimeException local76) {
					return -1;
				}
				if (local66 == null || local74 == null) {
					return -1;
				}
				@Pc(84) boolean local84 = true;
				@Pc(88) byte[] local88 = Static19.method205(local74);
				if (local88 != null && local88.length == local66.length) {
					for (@Pc(101) int local101 = 0; local101 < local88.length; local101++) {
						if (local88[local101] != local66[local101]) {
							local84 = false;
							break;
						}
					}
				} else {
					local84 = false;
				}
				try {
					if (!local84) {
						Static216.aClass168_5.method4078(local66, local74);
					}
				} catch (@Pc(133) Throwable local133) {
					return -1;
				}
				Static48.method1202(local74, arg0);
				return 100;
			} else {
				return Static463.aClass284_128.method6340(local35);
			}
		}
	}
}
