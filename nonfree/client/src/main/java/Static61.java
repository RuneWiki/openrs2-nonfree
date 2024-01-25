import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
	public static int anInt1532;

	@OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
	public static int anInt1534 = 0;

	@OriginalMember(owner = "client!dk", name = "e", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray14 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!dk", name = "f", descriptor = "[I")
	public static final int[] anIntArray230 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IB)V")
	public static void method1215(@OriginalArg(0) int arg0) {
		@Pc(8) Class7_Sub1_Sub15 local8 = Static315.method5104(10, arg0);
		local8.method4788();
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIIII)V")
	public static void method1217(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(16) int local16 = arg4 + 1;
		Static282.method4681(arg2, arg0, Static323.anIntArrayArray55[arg4], arg1);
		@Pc(27) int local27 = arg3 - 1;
		Static282.method4681(arg2, arg0, Static323.anIntArrayArray55[arg3], arg1);
		for (@Pc(32) int local32 = local16; local32 <= local27; local32++) {
			@Pc(38) int[] local38 = Static323.anIntArrayArray55[local32];
			local38[arg0] = local38[arg1] = arg2;
		}
	}
}
