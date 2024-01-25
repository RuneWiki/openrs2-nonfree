import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static191 {

	@OriginalMember(owner = "client!go", name = "Y", descriptor = "[I")
	public static final int[] anIntArray287 = new int[1024];

	@OriginalMember(owner = "client!go", name = "cb", descriptor = "Lclient!ms;")
	public static final Class235 aClass235_2 = new Class235("runescape", 0);

	@OriginalMember(owner = "client!go", name = "mb", descriptor = "Lclient!qda;")
	public static final Class281 aClass281_9 = new Class281(2);

	@OriginalMember(owner = "client!go", name = "b", descriptor = "(BII)Z")
	public static boolean method3042(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IIIB)V")
	public static void method3043(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static480.aByteArrayArrayArray19 = new byte[4][arg0][arg1];
	}
}
