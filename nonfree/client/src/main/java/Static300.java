import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!pd", name = "T", descriptor = "F")
	public static float aFloat82;

	@OriginalMember(owner = "client!pd", name = "S", descriptor = "[F")
	public static final float[] aFloatArray28 = new float[4];

	@OriginalMember(owner = "client!pd", name = "ab", descriptor = "I")
	public static int anInt5341 = 0;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IB)V")
	public static void method4294(@OriginalArg(0) int arg0) {
		@Pc(16) Class1_Sub2_Sub1 local16 = Static258.method5559(arg0, 7);
		local16.method195();
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIZ)Z")
	public static boolean method4296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static428.method5727(arg0, arg1) & Static177.method4487(arg0, arg1);
	}
}
