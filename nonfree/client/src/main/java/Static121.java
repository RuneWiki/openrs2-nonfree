import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!eba", name = "B", descriptor = "I")
	public static int anInt2110 = 2;

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "()V")
	public static void method1928() {
		while (true) {
			@Pc(1) boolean local1 = true;
			@Pc(3) int local3;
			for (local3 = 0; local3 < Static460.aClass360Array1.length; local3++) {
				if (Static460.aClass360Array1[local3].method8174()) {
					Static289.aLongArray11[local3] = Static460.aClass360Array1[local3].method8176();
				} else {
					synchronized (Static460.aClass360Array1[local3]) {
						Static460.aClass360Array1[local3].notify();
					}
					local1 = false;
				}
			}
			if (local1) {
				Static460.aClass360Array1[Static460.aClass360Array1.length - 1].method8170();
				Static509.method5084(1);
				while (true) {
					local1 = true;
					for (local3 = 0; local3 < Static460.aClass360Array1.length - 1; local3++) {
						if (!Static460.aClass360Array1[local3].method8174()) {
							synchronized (Static460.aClass360Array1[local3]) {
								Static460.aClass360Array1[local3].notify();
							}
							local1 = false;
						}
					}
					if (local1) {
						for (@Pc(102) int local102 = 1; local102 < Static460.aClass360Array1.length - 2; local102++) {
							Static460.aClass360Array1[local102].method8170();
						}
						Static509.method5084(2);
						while (!Static460.aClass360Array1[0].method8174()) {
							synchronized (Static460.aClass360Array1[0]) {
								Static460.aClass360Array1[0].notify();
							}
							try {
								Static127.method1985(1L);
							} catch (@Pc(142) Exception local142) {
							}
						}
						Static460.aClass360Array1[0].method8170();
						return;
					}
					try {
						Static127.method1985(1L);
					} catch (@Pc(99) Exception local99) {
					}
				}
			}
			try {
				Static127.method1985(1L);
			} catch (@Pc(47) Exception local47) {
			}
		}
	}
}
