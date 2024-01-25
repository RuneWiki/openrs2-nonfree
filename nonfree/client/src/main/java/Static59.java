import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static59 {

	@OriginalMember(owner = "client!ct", name = "g", descriptor = "I")
	public static int anInt1066;

	@OriginalMember(owner = "client!ct", name = "h", descriptor = "F")
	public static float aFloat15;

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "I")
	public static int anInt1065 = 0;

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "Lclient!sv;")
	public static final Class222 aClass222_6 = new Class222(12, 0, 1, 0);

	@OriginalMember(owner = "client!ct", name = "f", descriptor = "Z")
	public static boolean aBoolean92 = false;

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(IIII)I")
	public static int method898(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 > 243) {
			arg2 >>= 0x4;
		} else if (arg0 > 217) {
			arg2 >>= 0x3;
		} else if (arg0 > 192) {
			arg2 >>= 0x2;
		} else if (arg0 > 179) {
			arg2 >>= 0x1;
		}
		return ((arg1 >> 2 & 0x3F) << 10) + ((arg2 >> 5 << 7) + (arg0 >> 1));
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(II)I")
	public static int method899(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static376.aByteArrayArray26 == null ? 0 : (Static376.aByteArrayArray26[arg0][arg1] & 0xFF) << 3;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(IIB)Z")
	public static boolean method900(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return false;
	}
}
