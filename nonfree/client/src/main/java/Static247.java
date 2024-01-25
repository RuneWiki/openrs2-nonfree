import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
	public static int anInt4589 = 0;

	@OriginalMember(owner = "client!ie", name = "i", descriptor = "I")
	public static int anInt4594 = 0;

	@OriginalMember(owner = "client!ie", name = "l", descriptor = "Lclient!vl;")
	public static final Class376 aClass376_64 = new Class376(29, 3);

	@OriginalMember(owner = "client!ie", name = "m", descriptor = "Lclient!kh;")
	public static Class208 aClass208_3 = null;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIII)V")
	public static void method3932(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 >= Static303.anInt9951 && Static408.anInt6951 >= arg0) {
			@Pc(24) int local24 = Static400.method5735(Static255.anInt4818, arg3, Static658.anInt10079);
			@Pc(30) int local30 = Static400.method5735(Static255.anInt4818, arg1, Static658.anInt10079);
			Static81.method1706(local24, arg0, local30, arg2);
		}
	}
}
