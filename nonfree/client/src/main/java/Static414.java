import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static414 {

	@OriginalMember(owner = "client!or", name = "p", descriptor = "Lclient!cda;")
	public static Class51 aClass51_1;

	@OriginalMember(owner = "client!or", name = "r", descriptor = "Lclient!vfa;")
	public static Class356 aClass356_2;

	@OriginalMember(owner = "client!or", name = "i", descriptor = "Lclient!qca;")
	public static final Class271 aClass271_8 = new Class271(7, 0, 1, 1);

	@OriginalMember(owner = "client!or", name = "q", descriptor = "I")
	public static int anInt7572 = 0;

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(BIIIII)V")
	public static void method6345(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(12) int local12 = arg1; local12 <= arg2; local12++) {
			Static259.method4236(arg4, arg0, arg3, Static618.anIntArrayArray101[local12]);
		}
	}
}
