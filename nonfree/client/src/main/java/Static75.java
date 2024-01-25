import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!cv", name = "d", descriptor = "I")
	public static int anInt1651;

	@OriginalMember(owner = "client!cv", name = "x", descriptor = "Lclient!pl;")
	public static Class259 aClass259_34;

	@OriginalMember(owner = "client!cv", name = "g", descriptor = "I")
	public static int anInt1654 = 0;

	@OriginalMember(owner = "client!cv", name = "y", descriptor = "[I")
	public static int[] anIntArray88 = new int[1];

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "([BII)[B")
	public static byte[] method1183(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(11) byte[] local11 = new byte[arg1];
		Static598.method1137(arg0, 0, local11, 0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(ZB)V")
	public static void method1189(@OriginalArg(0) boolean arg0) {
		Static322.method5000(Static140.anInt2937, arg0, Static554.anInt9121, Static120.anInt2371);
	}
}
