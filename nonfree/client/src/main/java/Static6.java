import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ag", name = "g", descriptor = "F")
	public static float aFloat1;

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
	public static int anInt67 = -1;

	@OriginalMember(owner = "client!ag", name = "i", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_1 = new Class212(29, -1);

	@OriginalMember(owner = "client!ag", name = "n", descriptor = "I")
	public static int anInt75 = 0;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIII)V")
	public static void method64(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) int local14 = arg0 * Static157.aClass185_Sub1_1.anInt5567 >> 8;
		if (local14 != 0 && arg2 != -1) {
			Static1.method2(local14, arg2, Static57.aClass38_12);
			Static351.aBoolean462 = true;
		}
	}
}
