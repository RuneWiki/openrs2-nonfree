import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!pl", name = "d", descriptor = "I")
	public static int anInt5382;

	@OriginalMember(owner = "client!pl", name = "f", descriptor = "Lclient!l;")
	public static Interface6 anInterface6_4;

	@OriginalMember(owner = "client!pl", name = "e", descriptor = "Lclient!vn;")
	public static Class1_Sub42 aClass1_Sub42_2 = null;

	@OriginalMember(owner = "client!pl", name = "g", descriptor = "Z")
	public static boolean aBoolean608 = false;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZI)Z")
	public static boolean method4221(@OriginalArg(1) int arg0) {
		for (@Pc(10) Class1_Sub19 local10 = (Class1_Sub19) Static202.aClass227_21.method4967(); local10 != null; local10 = (Class1_Sub19) Static202.aClass227_21.method4973()) {
			if (Static133.method2050(local10.anInt2416) && (long) arg0 == local10.aLong74) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lclient!ug;B)Lclient!th;")
	public static Class78_Sub4 method4223(@OriginalArg(0) Class1_Sub28 arg0) {
		return new Class78_Sub4(arg0.method5382(), arg0.method5382(), arg0.method5382(), arg0.method5382(), arg0.method5345(), arg0.method5337());
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIIIII)V")
	public static void method4224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = arg0 + arg3;
		@Pc(14) int local14 = arg4 - arg3;
		for (@Pc(16) int local16 = arg0; local16 < local10; local16++) {
			Static2.method38(arg1, arg5, Static67.anIntArrayArray13[local16], arg2);
		}
		@Pc(35) int local35 = arg1 - arg3;
		for (@Pc(45) int local45 = arg4; local45 > local14; local45--) {
			Static2.method38(arg1, arg5, Static67.anIntArrayArray13[local45], arg2);
		}
		@Pc(63) int local63 = arg3 + arg2;
		for (@Pc(65) int local65 = local10; local65 <= local14; local65++) {
			@Pc(71) int[] local71 = Static67.anIntArrayArray13[local65];
			Static2.method38(local63, arg5, local71, arg2);
			Static2.method38(arg1, arg5, local71, local35);
		}
	}
}
