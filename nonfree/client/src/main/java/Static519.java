import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static519 {

	@OriginalMember(owner = "client!tu", name = "g", descriptor = "I")
	public static int anInt8577;

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "[I")
	public static final int[] anIntArray588 = new int[50];

	@OriginalMember(owner = "client!tu", name = "c", descriptor = "I")
	public static int anInt8574 = 0;

	@OriginalMember(owner = "client!tu", name = "d", descriptor = "I")
	public static int anInt8575 = -1;

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "()V")
	public static void method7099() {
		while (true) {
			@Pc(1) boolean local1 = true;
			@Pc(3) int local3;
			for (local3 = 0; local3 < Static89.aClass328Array1.length; local3++) {
				if (Static89.aClass328Array1[local3].method7290()) {
					Static104.aLongArray4[local3] = Static89.aClass328Array1[local3].method7287();
				} else {
					synchronized (Static89.aClass328Array1[local3]) {
						Static89.aClass328Array1[local3].notify();
					}
					local1 = false;
				}
			}
			if (local1) {
				Static89.aClass328Array1[Static89.aClass328Array1.length - 1].method7289();
				Static53.method1244(1);
				while (true) {
					local1 = true;
					for (local3 = 0; local3 < Static89.aClass328Array1.length - 1; local3++) {
						if (!Static89.aClass328Array1[local3].method7290()) {
							synchronized (Static89.aClass328Array1[local3]) {
								Static89.aClass328Array1[local3].notify();
							}
							local1 = false;
						}
					}
					if (local1) {
						for (@Pc(102) int local102 = 1; local102 < Static89.aClass328Array1.length - 2; local102++) {
							Static89.aClass328Array1[local102].method7289();
						}
						Static53.method1244(2);
						while (!Static89.aClass328Array1[0].method7290()) {
							synchronized (Static89.aClass328Array1[0]) {
								Static89.aClass328Array1[0].notify();
							}
							try {
								Static423.method5918(1L);
							} catch (@Pc(142) Exception local142) {
							}
						}
						Static89.aClass328Array1[0].method7289();
						return;
					}
					try {
						Static423.method5918(1L);
					} catch (@Pc(99) Exception local99) {
					}
				}
			}
			try {
				Static423.method5918(1L);
			} catch (@Pc(47) Exception local47) {
			}
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(IZLclient!io;)V")
	public static void method7101(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub20 arg1) {
		if (Static355.aClass259_5 == null) {
			return;
		}
		try {
			Static355.aClass259_5.method5774(0L);
			Static355.aClass259_5.method5772(arg0, 24, arg1.aByteArray52);
		} catch (@Pc(14) Exception local14) {
		}
	}
}
