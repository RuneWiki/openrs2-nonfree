import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!aba", name = "D", descriptor = "F")
	public static float aFloat208;

	@OriginalMember(owner = "client!aba", name = "G", descriptor = "J")
	public static long aLong259;

	@OriginalMember(owner = "client!aba", name = "C", descriptor = "Lclient!ej;")
	public static final Class94 aClass94_103 = new Class94(50, -1);

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(IIII)V")
	public static void method8620(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 << 3;
		@Pc(11) int local11 = arg1 << 3;
		if (Static496.anInt9165 == 2) {
			Static189.anInt11070 = local11;
			Static113.anInt3037 = 0;
			Static266.anInt5673 = local3;
		}
		Static72.aFloat68 = local11;
		Static305.aFloat154 = local3;
		Static182.method3782();
		Static166.aBoolean304 = true;
	}
}
