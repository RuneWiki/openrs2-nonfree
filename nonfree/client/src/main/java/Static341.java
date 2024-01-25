import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "Lclient!ar;")
	public static Class22 aClass22_4;

	@OriginalMember(owner = "client!ma", name = "j", descriptor = "Lclient!hia;")
	public static Class147 aClass147_1;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "()V")
	public static void method5166() {
		while (true) {
			@Pc(1) boolean local1 = true;
			@Pc(3) int local3;
			for (local3 = 0; local3 < Static569.aClass380Array1.length; local3++) {
				if (Static569.aClass380Array1[local3].method8757()) {
					Static609.aLongArray16[local3] = Static569.aClass380Array1[local3].method8754();
				} else {
					synchronized (Static569.aClass380Array1[local3]) {
						Static569.aClass380Array1[local3].notify();
					}
					local1 = false;
				}
			}
			if (local1) {
				Static569.aClass380Array1[Static569.aClass380Array1.length - 1].method8758();
				Static183.method3130(1);
				while (true) {
					local1 = true;
					for (local3 = 0; local3 < Static569.aClass380Array1.length - 1; local3++) {
						if (!Static569.aClass380Array1[local3].method8757()) {
							synchronized (Static569.aClass380Array1[local3]) {
								Static569.aClass380Array1[local3].notify();
							}
							local1 = false;
						}
					}
					if (local1) {
						for (@Pc(102) int local102 = 1; local102 < Static569.aClass380Array1.length - 2; local102++) {
							Static569.aClass380Array1[local102].method8758();
						}
						Static183.method3130(2);
						while (!Static569.aClass380Array1[0].method8757()) {
							synchronized (Static569.aClass380Array1[0]) {
								Static569.aClass380Array1[0].notify();
							}
							try {
								Static440.method6322(1L);
							} catch (@Pc(142) Exception local142) {
							}
						}
						Static569.aClass380Array1[0].method8758();
						return;
					}
					try {
						Static440.method6322(1L);
					} catch (@Pc(99) Exception local99) {
					}
				}
			}
			try {
				Static440.method6322(1L);
			} catch (@Pc(47) Exception local47) {
			}
		}
	}
}
