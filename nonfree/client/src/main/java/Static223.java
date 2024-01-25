import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!hea", name = "l", descriptor = "J")
	public static long aLong104;

	@OriginalMember(owner = "client!hea", name = "k", descriptor = "[I")
	public static final int[] anIntArray209 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!hea", name = "m", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!hea", name = "r", descriptor = "I")
	public static int anInt3850 = 0;

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(IB)Lclient!ofa;")
	public static Class265 method3278(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(16) int local16 = arg0 & 0xFFFF;
		if (Static270.aClass265ArrayArray2[local7] == null || Static270.aClass265ArrayArray2[local7][local16] == null) {
			@Pc(30) boolean local30 = Static185.method2900(local7);
			if (!local30) {
				return null;
			}
		}
		return Static270.aClass265ArrayArray2[local7][local16];
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(II)V")
	public static void method3279(@OriginalArg(0) int arg0) {
		if (-1 != arg0 && Static375.aBooleanArray25[arg0]) {
			Static192.aClass362_40.method8372(arg0);
			Static270.aClass265ArrayArray2[arg0] = null;
			Static78.aClass265ArrayArray1[arg0] = null;
			Static375.aBooleanArray25[arg0] = false;
		}
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(IF)F")
	public static float method3280(@OriginalArg(1) float arg0) {
		return arg0 * arg0 * arg0 * (arg0 * (arg0 * 6.0F - 15.0F) + 10.0F);
	}
}
