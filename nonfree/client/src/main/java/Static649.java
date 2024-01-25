import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static649 {

	@OriginalMember(owner = "client!vs", name = "s", descriptor = "I")
	public static int anInt9990 = 0;

	@OriginalMember(owner = "client!vs", name = "u", descriptor = "Z")
	public static boolean aBoolean735 = false;

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIB)B")
	public static byte method8505(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "()V")
	public static void method8506() {
		while (true) {
			@Pc(1) boolean local1 = true;
			@Pc(3) int local3;
			for (local3 = 0; local3 < Static49.aClass392Array1.length; local3++) {
				if (Static49.aClass392Array1[local3].method8688()) {
					Static373.aLongArray14[local3] = Static49.aClass392Array1[local3].method8684();
				} else {
					synchronized (Static49.aClass392Array1[local3]) {
						Static49.aClass392Array1[local3].notify();
					}
					local1 = false;
				}
			}
			if (local1) {
				Static49.aClass392Array1[Static49.aClass392Array1.length - 1].method8685();
				Static299.method4639(1);
				while (true) {
					local1 = true;
					for (local3 = 0; local3 < Static49.aClass392Array1.length - 1; local3++) {
						if (!Static49.aClass392Array1[local3].method8688()) {
							synchronized (Static49.aClass392Array1[local3]) {
								Static49.aClass392Array1[local3].notify();
							}
							local1 = false;
						}
					}
					if (local1) {
						for (@Pc(102) int local102 = 1; local102 < Static49.aClass392Array1.length - 2; local102++) {
							Static49.aClass392Array1[local102].method8685();
						}
						Static299.method4639(2);
						while (!Static49.aClass392Array1[0].method8688()) {
							synchronized (Static49.aClass392Array1[0]) {
								Static49.aClass392Array1[0].notify();
							}
							try {
								Static365.method3472(1L);
							} catch (@Pc(142) Exception local142) {
							}
						}
						Static49.aClass392Array1[0].method8685();
						return;
					}
					try {
						Static365.method3472(1L);
					} catch (@Pc(99) Exception local99) {
					}
				}
			}
			try {
				Static365.method3472(1L);
			} catch (@Pc(47) Exception local47) {
			}
		}
	}

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "(II)Z")
	public static boolean method8507(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 4 || arg0 == 5 || arg0 == 6;
	}
}
