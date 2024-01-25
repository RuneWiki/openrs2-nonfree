import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static289 {

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!lda", name = "e", descriptor = "I")
	public static int anInt5315;

	@OriginalMember(owner = "client!lda", name = "c", descriptor = "I")
	public static int anInt5313 = 0;

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(ZI)I")
	public static int method4391(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}
}
