import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!em", name = "s", descriptor = "I")
	public static int anInt2273;

	@OriginalMember(owner = "client!em", name = "f", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_30 = new Class179(6, -1);

	@OriginalMember(owner = "client!em", name = "p", descriptor = "[I")
	public static final int[] anIntArray164 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIII)Z")
	public static boolean method1851(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!Static220.aBoolean257 || !Static436.aBoolean530) {
			return false;
		} else if (Static29.anInt690 < 100) {
			return false;
		} else if (Static223.method3048(arg2, arg1, arg3)) {
			@Pc(33) int local33 = arg1 << Static609.anInt9827;
			@Pc(37) int local37 = arg2 << Static609.anInt9827;
			if (Static387.method5174(local37, Static192.anInt3298, local33, arg0, Static192.anInt3298, Static314.aClass76Array2[arg3].method7396(arg2, arg1))) {
				Static49.anInt8547++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
