import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!bb", name = "O", descriptor = "Lclient!mi;")
	public static Class46 aClass46_2;

	@OriginalMember(owner = "client!bb", name = "Q", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!bb", name = "kb", descriptor = "I")
	public static int anInt659;

	@OriginalMember(owner = "client!bb", name = "Bb", descriptor = "I")
	public static int anInt670;

	@OriginalMember(owner = "client!bb", name = "I", descriptor = "I")
	public static int anInt645 = 0;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIB)V")
	public static void method730(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(17) int local17;
		if (arg1 != Static222.anInt4971) {
			Static464.anIntArray556 = new int[arg1];
			for (local17 = 0; local17 < arg1; local17++) {
				Static464.anIntArray556[local17] = (local17 << 12) / arg1;
			}
			Static620.anInt10845 = arg1 - 1;
			Static222.anInt4971 = arg1;
			Static542.anInt9757 = arg1 * 32;
		}
		if (arg0 == Static101.anInt2845) {
			return;
		}
		if (Static222.anInt4971 == arg0) {
			Static547.anIntArray641 = Static464.anIntArray556;
		} else {
			Static547.anIntArray641 = new int[arg0];
			for (local17 = 0; local17 < arg0; local17++) {
				Static547.anIntArray641[local17] = (local17 << 12) / arg0;
			}
		}
		Static101.anInt2845 = arg0;
		Static591.anInt6375 = arg0 - 1;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIZ)Z")
	public static boolean method735(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= 0 && arg0 >= 0 && arg1 < Static476.aByteArrayArrayArray5[1].length && Static476.aByteArrayArrayArray5[1][arg1].length > arg0) {
			return (Static476.aByteArrayArrayArray5[1][arg1][arg0] & 0x2) != 0;
		} else {
			return false;
		}
	}
}
