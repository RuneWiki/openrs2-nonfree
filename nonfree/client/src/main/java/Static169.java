import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static169 {

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
	public static int anInt2876;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
	public static int anInt2875 = -1;

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "[I")
	public static final int[] anIntArray230 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!ih", name = "e", descriptor = "Z")
	public static boolean aBoolean177 = false;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(III)Z")
	public static boolean method2370(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x34) != 0;
	}
}
