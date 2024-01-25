import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static518 {

	@OriginalMember(owner = "client!se", name = "G", descriptor = "[Lclient!rba;")
	public static Class16_Sub1[] aClass16_Sub1Array4;

	@OriginalMember(owner = "client!se", name = "J", descriptor = "I")
	public static int anInt8368;

	@OriginalMember(owner = "client!se", name = "K", descriptor = "Lclient!an;")
	public static Class19 aClass19_9;

	@OriginalMember(owner = "client!se", name = "H", descriptor = "[[I")
	public static final int[][] anIntArrayArray99 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!se", name = "I", descriptor = "I")
	public static int anInt8367 = -1;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "([I[IB)V")
	public static void method7211(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1) {
		if (arg1 == null || arg0 == null) {
			Static460.anIntArray513 = null;
			Static353.anIntArray400 = null;
			Static613.aByteArrayArrayArray18 = null;
			return;
		}
		Static353.anIntArray400 = arg1;
		Static460.anIntArray513 = new int[arg1.length];
		Static613.aByteArrayArrayArray18 = new byte[arg1.length][][];
		for (@Pc(33) int local33 = 0; local33 < Static353.anIntArray400.length; local33++) {
			Static613.aByteArrayArrayArray18[local33] = new byte[arg0[local33]][];
		}
	}
}
