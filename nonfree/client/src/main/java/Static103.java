import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!w", name = "k", descriptor = "I")
	public static int anInt2767;

	@OriginalMember(owner = "client!w", name = "r", descriptor = "Z")
	public static boolean aBoolean153;

	@OriginalMember(owner = "client!w", name = "u", descriptor = "I")
	public static int anInt2774;

	@OriginalMember(owner = "client!w", name = "y", descriptor = "[I")
	public static int[] anIntArray389;

	@OriginalMember(owner = "client!w", name = "z", descriptor = "[I")
	public static int[] anIntArray390;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "I")
	public static int anInt2762 = 0;

	@OriginalMember(owner = "client!w", name = "b", descriptor = "I")
	public static final int anInt2763 = 2301979;

	@OriginalMember(owner = "client!w", name = "g", descriptor = "I")
	public static int anInt2764 = -1;

	@OriginalMember(owner = "client!w", name = "m", descriptor = "I")
	public static int anInt2769 = 0;

	@OriginalMember(owner = "client!w", name = "t", descriptor = "I")
	public static int anInt2773 = 0;

	@OriginalMember(owner = "client!w", name = "v", descriptor = "I")
	public static int anInt2775 = 0;

	@OriginalMember(owner = "client!w", name = "w", descriptor = "[Z")
	public static boolean[] aBooleanArray57 = new boolean[112];

	@OriginalMember(owner = "client!w", name = "E", descriptor = "I")
	public static int anInt2779 = -1;

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(I)V")
	public static void method1736() {
		anIntArray389 = null;
		aBooleanArray57 = null;
		anIntArray390 = null;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(B)I")
	public static int method1738() {
		@Pc(9) int local9 = Static42.method1057(Static44.anInt1595, Static91.anInt2484, Static58.anInt1945);
		return local9 - Static57.anInt2682 >= 800 || (Static34.aByteArrayArrayArray17[Static58.anInt1945][Static44.anInt1595 >> 7][Static91.anInt2484 >> 7] & 0x4) == 0 ? 3 : Static58.anInt1945;
	}
}
