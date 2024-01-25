import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!bi", name = "r", descriptor = "Lclient!tb;")
	public static Class220 aClass220_1;

	@OriginalMember(owner = "client!bi", name = "s", descriptor = "I")
	public static int anInt598;

	@OriginalMember(owner = "client!bi", name = "v", descriptor = "Lclient!dp;")
	public static Class51 aClass51_1;

	@OriginalMember(owner = "client!bi", name = "t", descriptor = "[I")
	public static final int[] anIntArray122 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!bi", name = "u", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_12 = new Class205(1, -2);

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(I[B)[B")
	public static byte[] method496(@OriginalArg(1) byte[] arg0) {
		@Pc(11) int local11 = arg0.length;
		@Pc(14) byte[] local14 = new byte[local11];
		Static399.method2487(arg0, 0, local14, 0, local11);
		return local14;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIII)V")
	public static void method497(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static68.anIntArrayArray13 != null) {
			Static68.anIntArrayArray13[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static367.aByteArrayArray19 != null) {
			Static367.aByteArrayArray19[arg0][arg1] = (byte) (arg3 >> 3);
		}
		if (Static324.aByteArrayArray17 != null) {
			Static324.aByteArrayArray17[arg0][arg1] = (byte) arg4;
		}
	}
}
