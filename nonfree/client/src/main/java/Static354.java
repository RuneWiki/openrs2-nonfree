import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static354 {

	@OriginalMember(owner = "client!nga", name = "i", descriptor = "J")
	public static long aLong176;

	@OriginalMember(owner = "client!nga", name = "f", descriptor = "I")
	public static final int anInt6136 = 7000;

	@OriginalMember(owner = "client!nga", name = "m", descriptor = "Z")
	public static boolean aBoolean499 = false;

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method5307(@OriginalArg(0) String arg0) {
		Static483.method6585("", "", "", 0, 0, arg0);
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(IIIII)V")
	public static void method5308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static309.anIntArrayArray10 != null) {
			Static309.anIntArrayArray10[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static466.aShortArrayArray83 != null) {
			Static466.aShortArrayArray83[arg0][arg1] = (short) arg3;
		}
		if (Static218.aByteArrayArray12 != null) {
			Static218.aByteArrayArray12[arg0][arg1] = (byte) arg4;
		}
	}
}
