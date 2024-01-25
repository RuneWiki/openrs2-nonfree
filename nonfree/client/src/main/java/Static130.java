import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static130 {

	@OriginalMember(owner = "client!gm", name = "U", descriptor = "I")
	public static int anInt2322;

	@OriginalMember(owner = "client!gm", name = "P", descriptor = "[Z")
	public static final boolean[] aBooleanArray14 = new boolean[8];

	@OriginalMember(owner = "client!gm", name = "X", descriptor = "Z")
	public static boolean aBoolean175 = false;

	@OriginalMember(owner = "client!gm", name = "Y", descriptor = "I")
	public static int anInt2325 = -1;

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIIII)V")
	public static void method2136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static5.anIntArrayArray1 != null) {
			Static5.anIntArrayArray1[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static340.aByteArrayArray34 != null) {
			Static340.aByteArrayArray34[arg0][arg1] = (byte) (arg3 >> 3);
		}
		if (Static426.aByteArrayArray46 != null) {
			Static426.aByteArrayArray46[arg0][arg1] = (byte) arg4;
		}
	}
}
