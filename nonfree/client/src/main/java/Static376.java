import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static376 {

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "[Z")
	public static boolean[] aBooleanArray27;

	@OriginalMember(owner = "client!ofa", name = "c", descriptor = "I")
	public static int anInt6362;

	@OriginalMember(owner = "client!ofa", name = "d", descriptor = "I")
	public static int anInt6363;

	@OriginalMember(owner = "client!ofa", name = "f", descriptor = "Lclient!om;")
	public static Class246 aClass246_180;

	@OriginalMember(owner = "client!ofa", name = "g", descriptor = "I")
	public static int anInt6365 = 0;

	@OriginalMember(owner = "client!ofa", name = "h", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "([II[I)V")
	public static void method5531(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1) {
		if (arg1 == null || arg0 == null) {
			Static564.aByteArrayArrayArray18 = null;
			Static247.anIntArray367 = null;
			Static321.anIntArray448 = null;
			return;
		}
		Static247.anIntArray367 = arg1;
		Static321.anIntArray448 = new int[arg1.length];
		Static564.aByteArrayArrayArray18 = new byte[arg1.length][][];
		for (@Pc(28) int local28 = 0; local28 < Static247.anIntArray367.length; local28++) {
			Static564.aByteArrayArrayArray18[local28] = new byte[arg0[local28]][];
		}
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(IIIBI)V")
	public static void method5532(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static284.anInt7855 / (float) Static284.anInt7858;
		@Pc(11) int local11 = arg3;
		@Pc(13) int local13 = arg1;
		if (local9 < 1.0F) {
			local13 = (int) (local9 * (float) arg3);
		} else {
			local11 = (int) ((float) arg1 / local9);
		}
		@Pc(40) int local40 = arg0 - (arg1 - local13) / 2;
		@Pc(49) int local49 = arg2 - (arg3 - local11) / 2;
		Static296.anInt5364 = -1;
		Static341.anInt6022 = -1;
		Static319.anInt5778 = Static284.anInt7858 * local49 / local11;
		Static236.anInt4460 = Static284.anInt7855 - local40 * Static284.anInt7855 / local13;
		Static132.method2577();
	}
}
