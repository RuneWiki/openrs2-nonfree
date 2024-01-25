import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!bja", name = "b", descriptor = "I")
	public static final int anInt881 = 4;

	@OriginalMember(owner = "client!bja", name = "d", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_21 = new Class151(61, 3);

	@OriginalMember(owner = "client!bja", name = "a", descriptor = "()V")
	public static void method809() {
		while (true) {
			@Pc(1) boolean local1 = true;
			@Pc(3) int local3;
			for (local3 = 0; local3 < Static409.aClass10Array1.length; local3++) {
				if (Static409.aClass10Array1[local3].method196()) {
					Static673.aLongArray21[local3] = Static409.aClass10Array1[local3].method200();
				} else {
					synchronized (Static409.aClass10Array1[local3]) {
						Static409.aClass10Array1[local3].notify();
					}
					local1 = false;
				}
			}
			if (local1) {
				Static409.aClass10Array1[Static409.aClass10Array1.length - 1].method198();
				Static337.method4618(1);
				while (true) {
					local1 = true;
					for (local3 = 0; local3 < Static409.aClass10Array1.length - 1; local3++) {
						if (!Static409.aClass10Array1[local3].method196()) {
							synchronized (Static409.aClass10Array1[local3]) {
								Static409.aClass10Array1[local3].notify();
							}
							local1 = false;
						}
					}
					if (local1) {
						for (@Pc(102) int local102 = 1; local102 < Static409.aClass10Array1.length - 2; local102++) {
							Static409.aClass10Array1[local102].method198();
						}
						Static337.method4618(2);
						while (!Static409.aClass10Array1[0].method196()) {
							synchronized (Static409.aClass10Array1[0]) {
								Static409.aClass10Array1[0].notify();
							}
							try {
								Static491.method6679(1L);
							} catch (@Pc(142) Exception local142) {
							}
						}
						Static409.aClass10Array1[0].method198();
						return;
					}
					try {
						Static491.method6679(1L);
					} catch (@Pc(99) Exception local99) {
					}
				}
			}
			try {
				Static491.method6679(1L);
			} catch (@Pc(47) Exception local47) {
			}
		}
	}
}
