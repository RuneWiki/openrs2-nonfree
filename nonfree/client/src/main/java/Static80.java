import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!cv", name = "f", descriptor = "[[[Lclient!se;")
	public static Class293[][][] aClass293ArrayArrayArray35;

	@OriginalMember(owner = "client!cv", name = "e", descriptor = "Lclient!tt;")
	public static final Class319 aClass319_166 = new Class319(30, 6);

	@OriginalMember(owner = "client!cv", name = "h", descriptor = "Lclient!tt;")
	public static final Class319 aClass319_167 = new Class319(51, 4);

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(IIIIII)V")
	public static void method7705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(16) int local16 = Static468.method6610(arg3, Static126.anInt6658, Static494.anInt8295);
		@Pc(22) int local22 = Static468.method6610(arg2, Static126.anInt6658, Static494.anInt8295);
		@Pc(28) int local28 = Static468.method6610(arg0, Static487.anInt8210, Static278.anInt5111);
		@Pc(34) int local34 = Static468.method6610(arg1, Static487.anInt8210, Static278.anInt5111);
		for (@Pc(36) int local36 = local16; local36 <= local22; local36++) {
			Static250.method4000(local34, Static478.anIntArrayArray51[local36], local28, arg4);
		}
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(IB)V")
	public static void method7706(@OriginalArg(0) int arg0) {
		@Pc(13) Class1_Sub3_Sub1 local13 = Static374.method5445(16, arg0);
		local13.method488();
	}
}
