import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!po", name = "b", descriptor = "Z")
	public static boolean aBoolean375 = false;

	@OriginalMember(owner = "client!po", name = "d", descriptor = "[B")
	public static final byte[] aByteArray77 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!po", name = "e", descriptor = "[I")
	public static final int[] anIntArray414 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(I)V")
	public static void method4574() {
		Static97.anInt2139 = 0;
		for (@Pc(9) int local9 = 0; local9 < 2048; local9++) {
			Static287.aClass2_Sub24Array1[local9] = null;
			Static345.aByteArray95[local9] = 1;
		}
	}
}
