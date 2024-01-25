import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static511 {

	@OriginalMember(owner = "client!rda", name = "w", descriptor = "Lclient!kaa;")
	public static Class196 aClass196_36;

	@OriginalMember(owner = "client!rda", name = "p", descriptor = "[I")
	public static int[] anIntArray546;

	@OriginalMember(owner = "client!rda", name = "s", descriptor = "I")
	public static int anInt9800 = 0;

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(II[B)[B")
	public static byte[] method8340(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(14) byte[] local14 = new byte[arg0];
		Static693.method8320(arg1, 0, local14, 0, arg0);
		return local14;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(ZBIZI)V")
	public static void method8345(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		Static152.method2786(arg3, arg2, Static592.aClass51_Sub1Array2.length - 1, 0, arg1, arg0);
		Static311.aClass5_Sub16_1 = null;
		Static336.anInt5636 = 0;
	}
}
