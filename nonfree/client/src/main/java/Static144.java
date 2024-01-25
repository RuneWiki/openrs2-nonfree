import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
	public static int anInt3127;

	@OriginalMember(owner = "client!ja", name = "f", descriptor = "Lclient!kb;")
	public static Class52 aClass52_13;

	@OriginalMember(owner = "client!ja", name = "p", descriptor = "[I")
	public static int[] anIntArray410;

	@OriginalMember(owner = "client!ja", name = "j", descriptor = "I")
	public static int anInt3133 = 0;

	@OriginalMember(owner = "client!ja", name = "n", descriptor = "Lclient!we;")
	public static final Class214 aClass214_2 = new Class214();

	@OriginalMember(owner = "client!ja", name = "o", descriptor = "J")
	public static long aLong106 = 0L;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(BIIII)V")
	public static void method2890(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(17) float local17 = (float) Static306.anInt3326 / (float) Static306.anInt3325;
		@Pc(19) int local19 = arg1;
		@Pc(21) int local21 = arg2;
		if (local17 < 1.0F) {
			local21 = (int) ((float) arg1 * local17);
		} else {
			local19 = (int) ((float) arg2 / local17);
		}
		@Pc(48) int local48 = arg3 - (arg2 - local21) / 2;
		@Pc(56) int local56 = arg0 - (arg1 - local19) / 2;
		Static23.anInt5708 = -1;
		Static244.anInt4835 = Static306.anInt3325 * local56 / local19;
		Static142.anInt3109 = -1;
		Static107.anInt1502 = Static306.anInt3326 - Static306.anInt3326 * local48 / local21;
		Static201.method3720();
	}
}
