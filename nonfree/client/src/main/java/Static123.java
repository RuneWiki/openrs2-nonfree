import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static123 {

	@OriginalMember(owner = "client!gf", name = "H", descriptor = "Lclient!lt;")
	public static Class158 aClass158_27;

	@OriginalMember(owner = "client!gf", name = "l", descriptor = "[I")
	public static final int[] anIntArray231 = new int[1];

	@OriginalMember(owner = "client!gf", name = "p", descriptor = "[S")
	public static short[] aShortArray32 = new short[256];

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)I")
	public static int method2002(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static340.aByteArrayArray34 == null ? 0 : (Static340.aByteArrayArray34[arg0][arg1] & 0xFF) << 3;
	}
}
