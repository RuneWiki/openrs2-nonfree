import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!cea", name = "k", descriptor = "I")
	public static int anInt1159;

	@OriginalMember(owner = "client!cea", name = "m", descriptor = "I")
	public static int anInt1161 = 1;

	@OriginalMember(owner = "client!cea", name = "n", descriptor = "Lclient!rb;")
	public static final Class245 aClass245_7 = new Class245(12, 0, 1, 0);

	@OriginalMember(owner = "client!cea", name = "o", descriptor = "I")
	public static int anInt1162 = 0;

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(IIIIIII)V")
	public static void method1125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(6) int arg3) {
		for (@Pc(15) Class6_Sub8 local15 = (Class6_Sub8) Static369.aClass107_7.method2832(); local15 != null; local15 = (Class6_Sub8) Static369.aClass107_7.method2835()) {
			if (Static115.anInt2326 >= local15.anInt8453) {
				local15.method7058();
			} else {
				Static487.method7225(arg1 >> 1, arg2 >> 1, (local15.anInt8449 << 7) + 64, local15.anInt8447, local15.anInt8448 * 2, (local15.anInt8450 << 7) + 64);
				Static175.aClass47_1.method7598(local15.anInt8452 | 0xFF000000, Static429.anIntArray610[0] + arg3, local15.aString177, 0, arg0 + Static429.anIntArray610[1]);
			}
		}
	}
}
