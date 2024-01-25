import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static186 {

	@OriginalMember(owner = "client!gba", name = "k", descriptor = "Lclient!vd;")
	public static Class366 aClass366_2;

	@OriginalMember(owner = "client!gba", name = "l", descriptor = "S")
	public static short aShort36 = 1;

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(II)I")
	public static int method2704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static193.aByteArrayArray26 == null ? 0 : Static193.aByteArrayArray26[arg0][arg1] & 0xFF;
	}
}
