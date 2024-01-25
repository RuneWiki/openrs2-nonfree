import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static578 {

	@OriginalMember(owner = "client!ur", name = "g", descriptor = "I")
	public static int anInt4590;

	@OriginalMember(owner = "client!ur", name = "j", descriptor = "[Z")
	public static boolean[] aBooleanArray15;

	@OriginalMember(owner = "client!ur", name = "d", descriptor = "I")
	public static int anInt4587 = 0;

	@OriginalMember(owner = "client!ur", name = "e", descriptor = "I")
	public static int anInt4588 = 0;

	@OriginalMember(owner = "client!ur", name = "f", descriptor = "I")
	public static int anInt4589 = -1;

	@OriginalMember(owner = "client!ur", name = "h", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_77 = new Class337(90, -1);

	@OriginalMember(owner = "client!ur", name = "i", descriptor = "[I")
	public static final int[] anIntArray228 = new int[1];

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "()V")
	public static void method4160() {
		while (true) {
			@Pc(1) boolean local1 = true;
			@Pc(3) int local3;
			for (local3 = 0; local3 < Static56.aClass220Array1.length; local3++) {
				if (Static56.aClass220Array1[local3].method4929()) {
					Static631.aLongArray17[local3] = Static56.aClass220Array1[local3].method4927();
				} else {
					synchronized (Static56.aClass220Array1[local3]) {
						Static56.aClass220Array1[local3].notify();
					}
					local1 = false;
				}
			}
			if (local1) {
				Static56.aClass220Array1[Static56.aClass220Array1.length - 1].method4928();
				Static535.method7889(1);
				while (true) {
					local1 = true;
					for (local3 = 0; local3 < Static56.aClass220Array1.length - 1; local3++) {
						if (!Static56.aClass220Array1[local3].method4929()) {
							synchronized (Static56.aClass220Array1[local3]) {
								Static56.aClass220Array1[local3].notify();
							}
							local1 = false;
						}
					}
					if (local1) {
						for (@Pc(102) int local102 = 1; local102 < Static56.aClass220Array1.length - 2; local102++) {
							Static56.aClass220Array1[local102].method4928();
						}
						Static535.method7889(2);
						while (!Static56.aClass220Array1[0].method4929()) {
							synchronized (Static56.aClass220Array1[0]) {
								Static56.aClass220Array1[0].notify();
							}
							try {
								Static314.method4821(1L);
							} catch (@Pc(142) Exception local142) {
							}
						}
						Static56.aClass220Array1[0].method4928();
						return;
					}
					try {
						Static314.method4821(1L);
					} catch (@Pc(99) Exception local99) {
					}
				}
			}
			try {
				Static314.method4821(1L);
			} catch (@Pc(47) Exception local47) {
			}
		}
	}
}
