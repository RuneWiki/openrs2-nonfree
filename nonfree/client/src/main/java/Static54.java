import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static54 {

	@OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
	public static int anInt1001;

	@OriginalMember(owner = "client!ci", name = "z", descriptor = "I")
	public static int anInt1016;

	@OriginalMember(owner = "client!ci", name = "x", descriptor = "Lclient!ks;")
	public static final Class141 aClass141_3 = new Class141();

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)Z")
	public static boolean method911() {
		return Static45.aClass137_10 != Static35.aClass137_11 || Static225.anInt4107 >= 2;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIII)V")
	public static void method916(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static222.anIntArrayArray41 != null) {
			Static222.anIntArrayArray41[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static34.aShortArrayArray1 != null) {
			Static34.aShortArrayArray1[arg0][arg1] = (short) arg3;
		}
		if (Static443.aByteArrayArray21 != null) {
			Static443.aByteArrayArray21[arg0][arg1] = (byte) arg4;
		}
	}
}
