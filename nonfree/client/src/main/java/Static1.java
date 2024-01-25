import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "d", descriptor = "Lclient!fa;")
	public static Interface8 anInterface8_1;

	@OriginalMember(owner = "client!a", name = "i", descriptor = "[I")
	public static int[] anIntArray1;

	@OriginalMember(owner = "client!a", name = "f", descriptor = "I")
	public static int anInt3 = 0;

	@OriginalMember(owner = "client!a", name = "k", descriptor = "I")
	public static int anInt7 = 765;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(BILjava/lang/Object;I)[B")
	public static byte[] method5(@OriginalArg(1) int arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg1;
			return Static185.method3182(local13, arg0);
		} else if (arg1 instanceof Class184) {
			@Pc(25) Class184 local25 = (Class184) arg1;
			return local25.method6462(arg0);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIBI)Z")
	public static boolean method6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if ((Static154.aByteArrayArrayArray15[0][arg3][arg2] & 0x2) != 0) {
			return true;
		} else if ((Static154.aByteArrayArrayArray15[arg1][arg3][arg2] & 0x10) == 0) {
			return Static290.method7653(arg3, arg2, arg1) == arg0;
		} else {
			return false;
		}
	}
}
