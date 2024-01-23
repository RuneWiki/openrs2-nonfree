import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!qj", name = "r", descriptor = "Lclient!pn;")
	public static Class1_Sub2_Sub11 aClass1_Sub2_Sub11_17;

	@OriginalMember(owner = "client!qj", name = "m", descriptor = "[I")
	public static int[] anIntArray383 = new int[128];

	@OriginalMember(owner = "client!qj", name = "n", descriptor = "[I")
	public static int[] anIntArray384 = new int[25];

	@OriginalMember(owner = "client!qj", name = "o", descriptor = "Lclient!qc;")
	public static Class135 aClass135_24 = new Class135(64);

	@OriginalMember(owner = "client!qj", name = "s", descriptor = "I")
	public static int anInt4283 = 0;

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIB)V")
	public static void method3409(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) Class1_Sub2_Sub18 local16 = Static130.method2227(arg1, 13);
		local16.method3905();
		local16.anInt5005 = arg0;
	}
}
