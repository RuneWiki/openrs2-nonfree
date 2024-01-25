import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static448 {

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "F")
	public static float aFloat198;

	@OriginalMember(owner = "client!raa", name = "g", descriptor = "I")
	public static int anInt9591;

	@OriginalMember(owner = "client!raa", name = "h", descriptor = "I")
	public static int anInt9592;

	@OriginalMember(owner = "client!raa", name = "b", descriptor = "I")
	public static int anInt9587 = 1;

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(ZII)Z")
	public static boolean method7383(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static190.method3138(arg1, arg0) & Static173.method2882(arg0, arg1);
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(III)Z")
	public static boolean method7384(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "([II[I)V")
	public static void method7389(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1) {
		if (arg1 == null || arg0 == null) {
			Static556.aByteArrayArrayArray19 = null;
			Static129.anIntArray132 = null;
			Static157.anIntArray164 = null;
			return;
		}
		Static129.anIntArray132 = arg1;
		Static157.anIntArray164 = new int[arg1.length];
		Static556.aByteArrayArrayArray19 = new byte[arg1.length][][];
		for (@Pc(33) int local33 = 0; local33 < Static129.anIntArray132.length; local33++) {
			Static556.aByteArrayArrayArray19[local33] = new byte[arg0[local33]][];
		}
	}
}
