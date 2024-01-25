import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static443 {

	@OriginalMember(owner = "client!qq", name = "o", descriptor = "J")
	public static long aLong214;

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "[I")
	public static final int[] anIntArray467 = new int[] { 7500, 500 };

	@OriginalMember(owner = "client!qq", name = "e", descriptor = "Z")
	public static final boolean aBoolean546 = false;

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(II)I")
	public static int method6173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static143.aByteArrayArray14 == null ? 0 : Static143.aByteArrayArray14[arg0][arg1] & 0xFF;
	}
}
