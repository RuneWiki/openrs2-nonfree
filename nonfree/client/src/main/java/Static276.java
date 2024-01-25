import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!ob", name = "f", descriptor = "F")
	public static float aFloat72;

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "Lclient!qp;")
	public static final Class209 aClass209_113 = new Class209("glow2:", "leuchten2:", "brillant2:", "brilho2:");

	@OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
	public static int anInt5059 = 0;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIII)V")
	public static void method4062(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = arg1 << 3;
		@Pc(15) int local15 = arg0 << 3;
		if (Static159.anInt3195 == 2) {
			Static140.anInt2975 = local11;
			Static119.anInt2680 = local15;
			Static130.anInt2796 = 0;
		}
		Static287.aFloat74 = local15;
		Static202.aFloat62 = local11;
		Static45.method713();
		Static243.aBoolean333 = true;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4065(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(17) int local17 = arg1 + arg0;
		@Pc(22) int local22 = arg4 - arg1;
		for (@Pc(24) int local24 = arg0; local24 < local17; local24++) {
			Static64.method1247(arg3, Static280.anIntArrayArray51[local24], arg6, arg5);
		}
		@Pc(42) int local42 = arg1 + arg3;
		@Pc(46) int local46 = arg6 - arg1;
		for (@Pc(48) int local48 = arg4; local48 > local22; local48--) {
			Static64.method1247(arg3, Static280.anIntArrayArray51[local48], arg6, arg5);
		}
		for (@Pc(68) int local68 = local17; local68 <= local22; local68++) {
			@Pc(74) int[] local74 = Static280.anIntArrayArray51[local68];
			Static64.method1247(arg3, local74, local42, arg5);
			Static64.method1247(local42, local74, local46, arg2);
			Static64.method1247(local46, local74, arg6, arg5);
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)Lclient!mr;")
	public static Class26 method4066() {
		try {
			return new Class26_Sub3();
		} catch (@Pc(13) Throwable local13) {
			try {
				return (Class26) Class.forName("Class26_Sub2").getDeclaredConstructor().newInstance();
			} catch (@Pc(19) Throwable local19) {
				return new Class26_Sub1();
			}
		}
	}
}
