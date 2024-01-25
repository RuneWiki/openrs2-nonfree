import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static118 {

	@OriginalMember(owner = "client!eu", name = "n", descriptor = "[[I")
	public static int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!eu", name = "i", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(IIB)B")
	public static byte method2293(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
