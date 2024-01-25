import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static287 {

	@OriginalMember(owner = "client!os", name = "p", descriptor = "I")
	public static int anInt5227;

	@OriginalMember(owner = "client!os", name = "r", descriptor = "[[B")
	public static byte[][] aByteArrayArray16;

	@OriginalMember(owner = "client!os", name = "f", descriptor = "[I")
	public static final int[] anIntArray348 = new int[25];

	@OriginalMember(owner = "client!os", name = "g", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_107 = new Class256("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");

	@OriginalMember(owner = "client!os", name = "q", descriptor = "Lclient!cu;")
	public static final Class44 aClass44_66 = new Class44(45, 3);

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!bi;IIII)V")
	public static void method4211(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == 1 && arg3 > 0) {
			Static192.method1238(arg0, arg2, arg3 - 1, arg4);
		} else if (arg1 == 4 && arg3 <= Static86.anInt2009) {
			Static192.method1238(arg0, arg2, arg3 + 1, arg4);
		} else if (arg1 == 8 && arg4 > 0) {
			Static192.method1238(arg0, arg2, arg3, arg4 - 1);
		} else if (arg1 == 2 && arg4 <= Static360.anInt6340) {
			Static192.method1238(arg0, arg2, arg3, arg4 + 1);
		} else if (arg1 == 16 && arg3 > 0 && arg4 <= Static360.anInt6340) {
			Static192.method1238(arg0, arg2, arg3 - 1, arg4 + 1);
		} else if (arg1 == 32 && arg3 <= Static86.anInt2009 && arg4 <= Static360.anInt6340) {
			Static192.method1238(arg0, arg2, arg3 + 1, arg4 + 1);
		} else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
			Static192.method1238(arg0, arg2, arg3 - 1, arg4 - 1);
		} else if (arg1 == 64 && arg3 <= Static86.anInt2009 && arg4 > 0) {
			Static192.method1238(arg0, arg2, arg3 + 1, arg4 - 1);
		} else {
			throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IB)V")
	public static void method4213(@OriginalArg(0) int arg0) {
		Static168.anInt3256 = -1;
		Static393.anInt6878 = arg0;
		Static168.anInt3256 = -1;
		Static39.method728();
	}
}
