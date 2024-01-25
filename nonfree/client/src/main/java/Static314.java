import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!kn", name = "f", descriptor = "I")
	public static int anInt5338;

	@OriginalMember(owner = "client!kn", name = "h", descriptor = "F")
	public static float aFloat36;

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray40 = new String[100];

	@OriginalMember(owner = "client!kn", name = "g", descriptor = "I")
	public static int anInt5339 = 0;

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "()V")
	public static void method4503() {
		while (true) {
			@Pc(1) boolean local1 = true;
			@Pc(3) int local3;
			for (local3 = 0; local3 < Static47.aClass329Array1.length; local3++) {
				if (Static47.aClass329Array1[local3].method7840()) {
					Static214.aLongArray13[local3] = Static47.aClass329Array1[local3].method7841();
				} else {
					synchronized (Static47.aClass329Array1[local3]) {
						Static47.aClass329Array1[local3].notify();
					}
					local1 = false;
				}
			}
			if (local1) {
				Static47.aClass329Array1[Static47.aClass329Array1.length - 1].method7839();
				Static59.method1103(1);
				while (true) {
					local1 = true;
					for (local3 = 0; local3 < Static47.aClass329Array1.length - 1; local3++) {
						if (!Static47.aClass329Array1[local3].method7840()) {
							synchronized (Static47.aClass329Array1[local3]) {
								Static47.aClass329Array1[local3].notify();
							}
							local1 = false;
						}
					}
					if (local1) {
						for (@Pc(102) int local102 = 1; local102 < Static47.aClass329Array1.length - 2; local102++) {
							Static47.aClass329Array1[local102].method7839();
						}
						Static59.method1103(2);
						while (!Static47.aClass329Array1[0].method7840()) {
							synchronized (Static47.aClass329Array1[0]) {
								Static47.aClass329Array1[0].notify();
							}
							try {
								Static520.method7923(1L);
							} catch (@Pc(142) Exception local142) {
							}
						}
						Static47.aClass329Array1[0].method7839();
						return;
					}
					try {
						Static520.method7923(1L);
					} catch (@Pc(99) Exception local99) {
					}
				}
			}
			try {
				Static520.method7923(1L);
			} catch (@Pc(47) Exception local47) {
			}
		}
	}

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "(B)I")
	public static int method4504() {
		return Static353.anInt6019 == 1 ? Static475.anInt8169 : 0;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)V")
	public static void method4505() {
		if (Static556.anInt9319 == 9) {
			Static143.method2106(5);
		} else if (Static556.anInt9319 == 5 || Static556.anInt9319 == 6) {
			Static143.method2106(3);
		} else if (Static556.anInt9319 == 12) {
			Static143.method2106(3);
			return;
		}
	}
}
