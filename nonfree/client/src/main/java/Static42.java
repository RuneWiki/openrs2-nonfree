import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!bk", name = "i", descriptor = "I")
	public static int anInt703;

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "Lclient!pe;")
	public static final Class282 aClass282_6 = new Class282(14, 0, 4, 1);

	@OriginalMember(owner = "client!bk", name = "d", descriptor = "[[I")
	public static final int[][] anIntArrayArray5 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "()V")
	public static void method762() {
		while (true) {
			@Pc(1) boolean local1 = true;
			@Pc(3) int local3;
			for (local3 = 0; local3 < Static312.aClass291Array1.length; local3++) {
				if (Static312.aClass291Array1[local3].method6564()) {
					Static666.aLongArray22[local3] = Static312.aClass291Array1[local3].method6559();
				} else {
					synchronized (Static312.aClass291Array1[local3]) {
						Static312.aClass291Array1[local3].notify();
					}
					local1 = false;
				}
			}
			if (local1) {
				Static312.aClass291Array1[Static312.aClass291Array1.length - 1].method6562();
				Static318.method4870(1);
				while (true) {
					local1 = true;
					for (local3 = 0; local3 < Static312.aClass291Array1.length - 1; local3++) {
						if (!Static312.aClass291Array1[local3].method6564()) {
							synchronized (Static312.aClass291Array1[local3]) {
								Static312.aClass291Array1[local3].notify();
							}
							local1 = false;
						}
					}
					if (local1) {
						for (@Pc(106) int local106 = 1; local106 < Static312.aClass291Array1.length - 2; local106++) {
							Static312.aClass291Array1[local106].method6562();
						}
						Static318.method4870(2);
						while (!Static312.aClass291Array1[0].method6564()) {
							synchronized (Static312.aClass291Array1[0]) {
								Static312.aClass291Array1[0].notify();
							}
							try {
								Static620.method7045(-4, 1L);
							} catch (@Pc(148) Exception local148) {
							}
						}
						Static312.aClass291Array1[0].method6562();
						return;
					}
					try {
						Static620.method7045(-4, 1L);
					} catch (@Pc(103) Exception local103) {
					}
				}
			}
			try {
				Static620.method7045(-4, 1L);
			} catch (@Pc(49) Exception local49) {
			}
		}
	}
}
