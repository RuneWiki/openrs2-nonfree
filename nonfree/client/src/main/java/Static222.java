import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static222 {

	@OriginalMember(owner = "client!jca", name = "m", descriptor = "Lclient!lu;")
	public static final Class186 aClass186_69 = new Class186(6, 7);

	@OriginalMember(owner = "client!jca", name = "q", descriptor = "[B")
	public static final byte[] aByteArray64 = new byte[520];

	@OriginalMember(owner = "client!jca", name = "u", descriptor = "[F")
	public static final float[] aFloatArray36 = new float[4];

	@OriginalMember(owner = "client!jca", name = "w", descriptor = "I")
	public static int anInt4501 = 0;

	@OriginalMember(owner = "client!jca", name = "x", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_69 = new Class6(74, -1);

	@OriginalMember(owner = "client!jca", name = "z", descriptor = "I")
	public static int anInt4503 = 0;

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(IIB)I")
	public static int method3938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}
}
