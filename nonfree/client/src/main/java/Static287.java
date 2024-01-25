import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!kq", name = "f", descriptor = "I")
	public static int anInt4869;

	@OriginalMember(owner = "client!kq", name = "s", descriptor = "Z")
	public static boolean aBoolean374;

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIIII)V")
	public static void method4075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static434.anIntArrayArray48 != null) {
			Static434.anIntArrayArray48[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static94.aShortArrayArray7 != null) {
			Static94.aShortArrayArray7[arg0][arg1] = (short) arg3;
		}
		if (Static576.aByteArrayArray24 != null) {
			Static576.aByteArrayArray24[arg0][arg1] = (byte) arg4;
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	public static String method4080(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(18) int local18 = arg0.indexOf(arg1); local18 != -1; local18 = arg0.indexOf(arg1, arg2.length() + local18)) {
			arg0 = arg0.substring(0, local18) + arg2 + arg0.substring(local18 + arg1.length());
		}
		return arg0;
	}
}
