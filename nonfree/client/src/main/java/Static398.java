import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static398 {

	@OriginalMember(owner = "client!tk", name = "k", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray17;

	@OriginalMember(owner = "client!tk", name = "m", descriptor = "I")
	public static int anInt7036;

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V")
	public static void method5612() {
		Static44.aClass83_9.method2336();
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(III)B")
	public static byte method5615(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
