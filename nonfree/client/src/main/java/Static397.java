import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static397 {

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
	public static int anInt6600;

	@OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
	public static int anInt6603 = 0;

	@OriginalMember(owner = "client!ug", name = "r", descriptor = "[Lclient!tt;")
	public static Class219_Sub1[] aClass219_Sub1Array3 = new Class219_Sub1[0];

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIIII)V")
	public static void method5225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15 = arg4 - arg3;
		@Pc(19) int local19 = arg3 + arg5;
		for (@Pc(21) int local21 = arg5; local21 < local19; local21++) {
			Static64.method1247(arg0, Static280.anIntArrayArray51[local21], arg2, arg1);
		}
		@Pc(44) int local44 = arg2 - arg3;
		@Pc(48) int local48 = arg3 + arg0;
		for (@Pc(50) int local50 = arg4; local50 > local15; local50--) {
			Static64.method1247(arg0, Static280.anIntArrayArray51[local50], arg2, arg1);
		}
		for (@Pc(66) int local66 = local19; local66 <= local15; local66++) {
			@Pc(72) int[] local72 = Static280.anIntArrayArray51[local66];
			Static64.method1247(arg0, local72, local48, arg1);
			Static64.method1247(local44, local72, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)V")
	public static void method5228() {
		Static33.aClass14_3 = new Class14();
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IZ)V")
	public static void method5234() {
		@Pc(5) Class171 local5 = Static387.aClass171_52;
		synchronized (Static387.aClass171_52) {
			Static387.aClass171_52.method3933(5);
		}
	}
}
