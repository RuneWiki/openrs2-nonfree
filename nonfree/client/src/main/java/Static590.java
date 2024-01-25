import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static590 {

	@OriginalMember(owner = "client!wo", name = "h", descriptor = "[B")
	public static final byte[] aByteArray119 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!wo", name = "v", descriptor = "I")
	public static int anInt10325 = -1;

	@OriginalMember(owner = "client!wo", name = "E", descriptor = "Ljava/lang/String;")
	public static String aString133 = null;

	@OriginalMember(owner = "client!wo", name = "K", descriptor = "[I")
	public static final int[] anIntArray674 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!wo", name = "bb", descriptor = "[I")
	public static int[] anIntArray675 = new int[1];

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(II)V")
	public static void method8338(@OriginalArg(1) int arg0) {
		@Pc(13) Class3_Sub4_Sub6 local13 = Static367.method6025(9, arg0);
		local13.method1896();
	}
}
