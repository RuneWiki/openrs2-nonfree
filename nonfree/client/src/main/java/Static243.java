import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!kba", name = "G", descriptor = "I")
	public static int anInt4675 = 0;

	@OriginalMember(owner = "client!kba", name = "H", descriptor = "Z")
	public static boolean aBoolean357 = false;

	@OriginalMember(owner = "client!kba", name = "I", descriptor = "I")
	public static int anInt4676 = 0;

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public static void method4315(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + Static286.method5045("%0a", "\n", arg0));
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(ILclient!et;)V")
	public static void method4316(@OriginalArg(1) Class91 arg0) {
		if (arg0.anInt2403 == Static304.anInt5906) {
			Static258.aBooleanArray17[arg0.anInt2433] = true;
		}
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(IIBIII)V")
	public static void method4317(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(12) int local12 = arg2; local12 <= arg0; local12++) {
			Static313.method5430(arg3, arg1, Static143.anIntArrayArray33[local12], arg4);
		}
	}
}
