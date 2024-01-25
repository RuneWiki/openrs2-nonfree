import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static670 {

	@OriginalMember(owner = "client!vaa", name = "Fh", descriptor = "I")
	public static int anInt10497;

	@OriginalMember(owner = "client!vaa", name = "di", descriptor = "Z")
	public static final boolean aBoolean706 = false;

	@OriginalMember(owner = "client!vaa", name = "Ag", descriptor = "[I")
	public static final int[] anIntArray758 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IBI)V")
	public static void method8989(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static536.aClass22_11 == null) {
			return;
		}
		@Pc(11) int local11 = Static268.anInt4147;
		@Pc(13) int local13 = Static250.anInt3897;
		Static341.method4873(arg0, arg1);
		if (Static488.anInt7680 == 0) {
			Static538.anInterface25_1 = null;
			Static538.anInterface25_1 = Static536.aClass22_11.method9359(Static536.aClass22_11.method9381(Static438.anInt6734, Static182.anInt3160), Static536.aClass22_11.method9383(Static438.anInt6734, Static182.anInt3160));
		} else if (Static488.anInt7680 == 1 && (Static559.anInterface25Array1 == null || Static268.anInt4147 != local11 || Static250.anInt3897 != local13)) {
			Static559.anInterface25Array1 = new Interface25[Static268.anInt4147 * Static250.anInt3897];
			for (@Pc(49) int local49 = 0; local49 < Static559.anInterface25Array1.length; local49++) {
				Static559.anInterface25Array1[local49] = Static536.aClass22_11.method9359(Static536.aClass22_11.method9381(Static91.anInt2080, Static703.anInt10979), Static536.aClass22_11.method9383(Static91.anInt2080, Static703.anInt10979));
			}
			Static683.anInt10656 = 1;
			Static705.anIntArray783 = new int[Static250.anInt3897 * Static268.anInt4147];
		}
		Static632.aBoolean653 = true;
	}

	@OriginalMember(owner = "client!vaa", name = "ib", descriptor = "(I)V")
	public static void method8991(@OriginalArg(0) int arg0) {
		Static478.anInt5834 = arg0;
	}
}
