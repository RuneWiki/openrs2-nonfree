import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static71 {

	@OriginalMember(owner = "client!cb", name = "A", descriptor = "J")
	public static long aLong147;

	@OriginalMember(owner = "client!cb", name = "z", descriptor = "[Lclient!ug;")
	public static Class43[] aClass43Array12;

	@OriginalMember(owner = "client!cb", name = "I", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_4 = new CRC32();

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "[I")
	public static final int[] anIntArray325 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(III)Z")
	public static boolean method4092(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x84080) != 0;
	}
}
