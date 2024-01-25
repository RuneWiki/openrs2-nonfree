import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static364 {

	@OriginalMember(owner = "client!rs", name = "e", descriptor = "F")
	public static float aFloat78;

	@OriginalMember(owner = "client!rs", name = "f", descriptor = "I")
	public static int anInt5935;

	@OriginalMember(owner = "client!rs", name = "h", descriptor = "F")
	public static float aFloat79;

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_229 = new Class67(113, 4);

	@OriginalMember(owner = "client!rs", name = "d", descriptor = "[I")
	public static final int[] anIntArray446 = new int[5];

	@OriginalMember(owner = "client!rs", name = "g", descriptor = "[C")
	public static final char[] aCharArray5 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!rs", name = "i", descriptor = "Lclient!hm;")
	public static Class107 aClass107_13 = null;

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(II)V")
	public static void method4777(@OriginalArg(1) int arg0) {
		if (arg0 != -1 && Static411.aBooleanArray144[arg0]) {
			Static164.aClass185_110.method4018(arg0);
			Static45.aClass107ArrayArray1[arg0] = null;
			Static166.aClass107ArrayArray2[arg0] = null;
			Static411.aBooleanArray144[arg0] = false;
		}
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(II)I")
	public static int method4778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static240.aByteArrayArray81 == null ? 0 : Static240.aByteArrayArray81[arg0][arg1] & 0xFF;
	}
}
