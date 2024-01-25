import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!rh", name = "e", descriptor = "[I")
	public static int[] anIntArray400;

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "Z")
	public static boolean aBoolean367 = false;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IILjava/lang/Object;I)[B")
	public static byte[] method4926(@OriginalArg(1) int arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg1;
			return Static336.method4888(local13, arg0);
		} else if (arg1 instanceof Class75) {
			@Pc(30) Class75 local30 = (Class75) arg1;
			return local30.method5747(arg0);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIII)V")
	public static void method4927(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static137.anIntArrayArray15 != null) {
			Static137.anIntArrayArray15[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static310.aByteArrayArray21 != null) {
			Static310.aByteArrayArray21[arg0][arg1] = (byte) (arg3 >> 3);
		}
		if (Static316.aByteArrayArray22 != null) {
			Static316.aByteArrayArray22[arg0][arg1] = (byte) arg4;
		}
	}
}
